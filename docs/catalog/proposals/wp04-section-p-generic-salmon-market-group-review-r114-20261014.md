# WP04 Section P — generic salmon market-group boundary review (R114)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** Proposal-only Québec/Canadian identity, catalog-ownership, picker, recipe-demand, and substitution-boundary review.
- **Recommendation:** **Hold** a new identity-only `salmon / saumon` market-group row. The bare bilingual pair is not safely group-qualified in Canadian and Québec fish naming: CFIA assigns those exact names to *Salmo salar*, while Québec editorial usage also applies `saumon` broadly. Keep the existing generic fillets product and five accepted Pacific-salmon species identities separate.
- **Scope:** This proposal is the only change from this review. No catalog JSON, ledger, plan, roadmap, generated index, recipe, or runtime file was edited. No tests or emulator checks were run.

## Checklist and boundary

The Section P finfish checklist remains open in the [active catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4545). The checklist now has identity-only rows for chum, pink, coho, sockeye, and Chinook salmon, alongside the earlier generic `salmon fillets / filet de saumon` recipe reference. This review asks whether an additional, taxon-unspecified `salmon / saumon` identity is distinct enough to add alongside them.

Current sources support two uses of the broad word:

- Québec retailer Metro presents `saumon` as an editorial umbrella and distinguishes Atlantic salmon from five Pacific salmon species. This confirms familiar broad consumer usage, but it is not a species-neutral product label.
- The Canadian Food Inspection Agency (CFIA) Fish List maps its English/French common-name rows `Atlantic Salmon / Saumon` and `Salmon / Saumon Atlantique` to *Salmo salar*. The Québec government species page likewise lists `saumon` as another French name for Atlantic salmon. In this source context, the exact bare English and French words are species-associated.

TERMIUM Plus gives the explicit Pacific market-group term as **Pacific salmon / saumon du Pacifique**, defined as several *Oncorhynchus* species. CFIA says `Pacific salmon` is not an acceptable replacement common name on fish labels because the species have different market values; its guidance says the common name should include the species. These sources do not support substituting bare `salmon / saumon` as an unambiguous group label. The picker also has no taxonomy-aware label to distinguish an all-salmon group from the *S. salar* common-name use.

This hold concerns the bare market-group row only. It does not narrow recipe 077 or any species row to *S. salar*, and it does not reopen the accepted five species identities. The existing unresolved `candidate-wp04-salmon-species-scope` remains limited to the unnamed taxon of recipe 077 row 10.

## Current catalog, forms, legacy, and ledger ownership

The active package contains **1,456 ingredient references**, **105 forms**, **63 legacy-import candidates**, and **1,796 research-ledger records**. The salmon-named active references are:

| Active reference | Current identity scope | Aliases |
|---|---|---|
| `ingredient-ref-salmon-fillets-without-skin` | `salmon fillets / filet de saumon`; recipe-facing product, no taxon | None |
| `ingredient-ref-chum-salmon` | Chum salmon / saumon kéta, *Oncorhynchus keta* | `keta salmon` |
| `ingredient-ref-pink-salmon` | Pink salmon / saumon rose, *O. gorbuscha* | None |
| `ingredient-ref-coho-salmon` | Coho salmon / saumon coho, *O. kisutch* | None |
| `ingredient-ref-sockeye-salmon` | Sockeye salmon / saumon rouge, *O. nerka* | `red salmon`; `saumon sockeye` |
| `ingredient-ref-chinook-salmon` | Chinook salmon / saumon quinnat, *O. tshawytscha* | `king salmon`; `saumon royal` |

No active `Salmo salar` reference or generic salmon-group reference exists. No salmon-named form or salmon/saumon legacy candidate exists. The related ledger owners are `candidate-wp04-salmon-species-scope` (unresolved recipe-species boundary), `ingredient-ref-salmon-fillets-without-skin` (generic recipe reference, currently unreviewed), five accepted species records, and the separate unresolved `candidate-salmon-roe`. None defines or allocates a bare salmon market group. The [legacy candidate catalog](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), and [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) were checked for exact ownership.

Related salmon reviews confirm the intended boundaries: the [R95 salmon/tuna scope review](wp04-finfish-salmon-tuna-species-boundary-recheck-20261011.md), [R96 chum review](wp04-section-p-chum-salmon-identity-review-r96-20261014.md), [R103 pink review](wp04-section-p-pink-salmon-identity-review-r103-20261014.md), [R104 coho review](wp04-section-p-coho-salmon-identity-review-r104-20261014.md), [R105 sockeye review](wp04-section-p-sockeye-salmon-identity-review-r105-20261014.md), and [R108 Chinook review](wp04-section-p-chinook-salmon-identity-review-r108-20261014.md) preserve the recipe-facing fillet reference while adding only qualified species identities. The [R109 pompano review](wp04-section-p-pompano-market-group-identity-review-r109-20261014.md) is a useful group-level precedent because its English/French displays are both unambiguously attached to the same *Trachinotus* spp. market group; that condition is not met by bare `salmon / saumon` here.

## Search projection

The [ingredient search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, ligatures, punctuation, and spacing; it checks exact form phrases first, then complete word phrases across reference names, aliases, and attached form terms, and uses substring matching only if there are no phrase matches. There are no salmon forms, so no form phrase can override the reference results.

Static projection from the current reference names and aliases:

| Query | Current phrase matches | If a bare `salmon / saumon` row were added | Boundary result |
|---|---|---|---|
| `salmon`; `saumon` | Generic salmon fillets; chum; pink; coho; sockeye; Chinook (**6 rows**) | The same six plus the market-group row (**7 rows**) | Search remains multi-result, but the new row would place a seemingly species-neutral choice beside exact terms CFIA also assigns to *S. salar*. |
| `salmon fillets`; `filet de saumon` | Generic salmon fillets only | Same result | The multiword recipe-facing phrase does not match a single-word group display. |
| `chum salmon`; `saumon kéta`; `keta salmon` | Chum only | Same result | Species-qualified identity remains separate. |
| `Atlantic salmon`; `saumon de l’Atlantique` | No active result | No change | A bare group name cannot supply the missing Atlantic-salmon identity. |
| `Pacific salmon`; `saumon du Pacifique` | No active result | No change | A bare group name does not match this explicit multiword Pacific group term. |

Adding the bare row would not collapse `salmon fillets` onto the group, nor turn a broad query into a singleton. The issue is its displayed identity: users would see `salmon / saumon` as a catch-all row even though current Canadian and Québec naming also assigns those exact terms to Atlantic salmon. The current six-result broad query already leaves species choice explicit and preserves the generic fillet product. Do not add `salmon` or `saumon` as aliases to any existing row.

## Bundle demand and numeric, form, and substitution limits

The manifest lists **114 recipes and 1,123 ingredient rows**. A scan of every manifest-listed recipe file found salmon-related wording in only recipe 077, row 10:

> `675 g salmon fillets without skin, cut into cubes`

That row links to `ingredient-ref-salmon-fillets-without-skin`. It names no species, source, or product label. It is the only salmon ingredient row in the bundle; there is no recipe demand for a general salmon group or for a salmon species. Keep its link and 675 g recipe quantity unchanged. The [recipe file](../../../app/src/main/assets/seed/bundled-library/recipes/077-pate-au-saumon-salmon-pot-pie-b8e3b67d-3a62-4e68-8842-457c86bbab5f.v1.json) does not support a species link or relink.

No salmon form is active. Existing CNF measurements in the five species ledger records remain food-code and preparation-specific observations (five Chinook, six chum, six coho, nine pink, and ten sockeye observations). They do not combine into a generic density, fillet weight, unit mapping, raw-to-cooked yield, or reusable measure. The 675 g amount is a recipe quantity, not a reference conversion. This review proposes **zero** forms, measures, mappings, density values, conversions, yields, recipe links, or numeric defaults.

One external Québec pasta recipe supplies a narrowly scoped directional alternative: it lists one can of Keta salmon and the author's note says fresh skinless salmon fillet (**375 g**) can be used instead. The source does not state the can's drained weight or identify the fresh fish species. It is an author suggestion for that pasta recipe, not bundled demand, a can conversion, or evidence for a general substitution between salmon taxa. Preserve it only as that source-specific observation; add **no** global or contextual substitution rule.

## Recommendation

**Hold** the exact identity-only `salmon / saumon` market-group row. The broader consumer use is real, but the current bilingual bare terms do not resolve to one species-neutral product scope in Canadian/Québec naming, and the active picker cannot label that overlap clearly. Preserve the five accepted species rows, the existing generic salmon-fillets row, all current source-specific CNF observations, and recipe 077#10 unchanged. Add no alias, form, measurement, mapping, recipe link, or substitution. A future group review should first establish an explicit bilingual group label that does not reuse the bare Atlantic-salmon common-name pair.

## Sources

All sources below were accessed on **2026-10-14**. Source IDs are local to this proposal and are not ledger allocations.

| Source ID | Source and support | Limit |
|---|---|---|
| `WP04-SECTIONP-GENERIC-SALMON-R114-20261014-S01` | CFIA, [Fish List results for *Salmo salar*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Salmo%20salar). Current rows identify TSN 161996 *S. salar* with `Atlantic Salmon / Saumon` and `Salmon / Saumon Atlantique`. | Canadian fish-label common-name evidence; it does not determine what an unqualified cookbook line means. |
| `WP04-SECTIONP-GENERIC-SALMON-R114-20261014-S02` | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), “Labelling of Pacific salmon.” | Says Pacific salmon is not an acceptable replacement common name because the species have different market values; this is labelling guidance, not app taxonomy. |
| `WP04-SECTIONP-GENERIC-SALMON-R114-20261014-S03` | Gouvernement du Québec, [Saumon atlantique](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/saumon-atlantique). The species page names *Salmo salar* and lists `saumon` among its other French names. | Species page, not a recipe or retail inventory. |
| `WP04-SECTIONP-GENERIC-SALMON-R114-20261014-S04` | OQLF, [saumon de l’Atlantique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198857/saumon-de-latlantique). Gives the preferred Québec edible-fish term and *Salmo salar*; notes that one species-specific term is normalized for fish-product marketing. | GDT entry last updated 2012; terminology evidence, not current stock. |
| `WP04-SECTIONP-GENERIC-SALMON-R114-20261014-S05` | TERMIUM Plus, [Pacific salmon / saumon du Pacifique](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=9&i=&index=frr&lang=eng&sg_kp_wet=1663030&srchtxt=SAUMON). Record dated 2026-06-30; defines the explicit generic as multiple *Oncorhynchus* species and lists Chinook, coho, sockeye, pink, and chum. | Supports a Pacific group term, not bare salmon/saumon and not a species identity for recipe 077. |
| `WP04-SECTIONP-GENERIC-SALMON-R114-20261014-S06` | Metro, [Saumon](https://www.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/saumon). The Québec retailer overview discusses multiple Pacific species and Atlantic salmon under a broad salmon topic. | Consumer editorial categorization, not a species-neutral package label or taxonomic definition. |
| `WP04-SECTIONP-GENERIC-SALMON-R114-20261014-S07` | Recettes du Québec, [Pâtes au saumon, câpres et citron](https://www.recettes.qc.ca/recettes/recette/pates-au-saumon-capres-et-citron-211566), published 2010-09-24. Lists one can of Keta salmon; the author note offers 375 g fresh skinless salmon as an alternative. | One external recipe-specific suggestion; unspecified can weight and fresh species. Not bundled demand or a reusable rule. |

## Static review checks

- Re-read current `AGENTS.md`, the active Section P checklist, the active references and forms, the legacy candidate catalog, ledger ownership, and the relevant salmon and market-group proposals.
- Inspected all 114 manifest-listed recipe files and 1,123 ingredient rows; only recipe 077 row 10 has salmon ingredient demand.
- Projected current and hypothetical broad/qualified picker queries from the Kotlin phrase-first search behavior; no catalog mutation was performed.
- Validated this proposal's local links and line anchor, UTF-8 encoding without BOM, and whitespace. No tests or emulator checks were run.
