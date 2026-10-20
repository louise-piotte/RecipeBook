# WP04 Section P — Greenland cockle identity and picker boundary review (R144)

- **Review date:** 2026-10-15.
- **Open checklist item:** “Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below” in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5377).
- **Candidate:** Greenland cockle / **coque du Groenland**, *Serripes groenlandicus*.
- **Disposition:** **Hold this species row outside active references and the research ledger.** Canadian sources support the species-specific identity and frozen raw/blanched meat products. However, the useful English and Québec French names contain the generic words `cockle` and `coque`; activating the row would make each currently empty broad query look like a complete single-species choice. The bundle has no matching ingredient demand.
- **Data outcome:** No catalog, form, ledger, legacy-identity, recipe-link, numeric, plan, roadmap, or generated data changed. This proposal-only review required no tests.

## Scope and prior-work boundary

This review covers *Serripes groenlandicus* specifically. The existing [generic cockle/coque review](wp04-cockle-coque-identity-boundary-review-20261011.md) held the unqualified identity and recorded `ingredient-ref-cockle` as unresolved. It established that OQLF uses `coque / cockle` for *Clinocardium ciliatum*, while CFIA also applies `Coque / Cockle` to *C. nuttallii*. It did not review or allocate *S. groenlandicus*. The [R143 Atlantic surf clam review](wp04-section-p-atlantic-surf-clam-picker-boundary-review-r143-20261015.md) concerns *Spisula solidissima* and the separate `clam / mactre` family boundary.

The Section P plan and proposal/batch archive contain no dedicated review of *S. groenlandicus*. At the current snapshot, the live [ingredient-reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) has 1,500 entries and the live [form catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) has 117; neither contains this species, its binomial, or its species-qualified names. The 1,845-record [research ledger](../research-ledger.v1.json) contains the unresolved generic `ingredient-ref-cockle` and `ingredient-ref-clam` candidates, but no *S. groenlandicus* record. The [legacy-import identity file](../legacy-import-identities.v1.json) has no matching allocation. The Section P shellfish checklist remains open.

## Identity and Québec/Canadian naming

The species identity is stable across taxonomic, terminology, and Canadian food-name sources. ITIS recognizes *Serripes groenlandicus* as a valid species (TSN 80879). CFIA uses the same binomial and TSN in its Fish List. The Government of Canada’s TERMIUM Plus record dated 2016-02-26 marks English **Greenland cockle** and French **coque du Groenland** and **bucarde du Groenland** as correct terms for that Latin name. Fourchette Bleue’s Québec species page also pairs *S. groenlandicus* with the culinary name **coque du Groenland**.

No species-specific OQLF GDT entry for *S. groenlandicus* was located. OQLF’s food entry for the unqualified term **coque** names *Clinocardium ciliatum*, so it cannot be used to attribute `coque` to this different species. In CFIA’s Fish List, accessed 2026-10-15, the French common name `Coque` is assigned to *S. groenlandicus* (TSN 80879), *C. ciliatum* (English **Hairy Cockle**), and *C. nuttallii* (English **Cockle**). CFIA also lists **Greenland Cockle** and `White Cockle Clam` for *S. groenlandicus* without French pairings. CFIA is useful Canadian fish-label evidence, but its shared rows do not establish a Québec-preferred consumer display. TERMIUM and Fourchette Bleue support **coque du Groenland** for the species-qualified French display; the shared bare word remains ambiguous. Keep `White Cockle Clam` out of aliases because it would add the broad `clam` search to this held species row.

This is not a no-harvest finding. Fourchette Bleue says there is no directed fishery and that Greenland cockles may be retained as incidental catch in the offshore clam fishery; it also describes conditional recreational harvest. DFO’s management plan confirms that licensees may retain non-quota molluscan bycatch, including Greenland cockles. Separately, Seafood from Canada currently lists species-qualified Canadian product forms. The absence of a directed fishery therefore does not establish that no Canadian product is sold. The sources reviewed here do not establish current Québec retail inventory or a species-specific Québec SKU.

## Current ownership and picker projection

The projection below follows the phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Ingredient references are searched by their bilingual display names and aliases, together with attached form terms; the scientific name is not a separate searchable field. The hypothetical row uses only the display **Greenland cockle / coque du Groenland**, with empty aliases and no forms. It is not active.

| Query | Current results | With the hypothetical display-only row | Consequence |
|---|---:|---:|---|
| `Greenland cockle` | 0 | 1 | A useful species-qualified English phrase. |
| `coque du Groenland` | 0 | 1 | A useful species-qualified Québec French phrase. |
| `cockle` | 0 | 1 | Would look like the complete generic cockle choice despite the held *Clinocardium* boundary. |
| `coque` | 0 | 1 | Would look like the complete Québec `coque` choice despite OQLF’s different species and CFIA’s shared label. |
| `Greenland` | 1 | 2 | The existing Greenland halibut result would remain alongside this qualified species. |
| `clam` | 0 | 0 | No broad `clam` alias is proposed. |

Avoiding `cockle` and `coque` in alias arrays does not avoid this result: the words occur in the bilingual display and are searched as phrases. `Bucarde du Groenland` is another TERMIUM-approved French name, but pairing it with **Greenland cockle** still creates a singleton for broad English `cockle`; choosing `bucarde` as the French display would also make a broad `bucarde` query appear species-complete. A scientific-name-only label would not be a useful bilingual culinary identity. Keep the species outside the active picker until broad cockle/coque identity scope can be represented without implying that a sole species is the generic ingredient.

## Recipe demand, product forms, and numeric limits

The corpus scan followed all **114** recipe paths in the bundled [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), parsed all **1,123** `ingredients[]` rows, and inspected only the ingredient fields `ingredientName` and `originalText`. It excluded recipe titles, instructions, notes, and other JSON text. Case, accents, punctuation, and whitespace were normalized. The scan covered *Serripes groenlandicus*, Greenland cockle, Greenland smoothcockle, coque du Groenland, bucarde du Groenland, cockle/cockles, coque/coques, and Torigai. Result: **0 matching ingredient rows in 0 recipe files**.

Seafood from Canada lists **frozen, blanched or raw meats** for *S. groenlandicus* on its English page; its French-language page pairs the same binomial with `Coque, Groenland` and lists `Surgelés : chairs blanchies ou crues`. These are Canadian industry/export product-form claims, not a specific retail package or proof of Québec shelf stock. Fourchette Bleue lists a year-round consumption season and culinary uses, but those statements do not specify an available SKU. Its reported shell length up to 11 cm is biological identification information, not a recipe quantity.

DFO’s fisheries plan mentions a generalized **5.5** conversion factor applied to Greenland cockle bycatch and says species-specific factors were still under study. That is a fishery-management/landing factor, not a kitchen yield, package conversion, or serving measure. No reviewed source supplies a reusable edible weight, package quantity, mass/volume mapping, density, cooking yield, or measure. No source or recipe supports substitution between Greenland cockle and another cockle, clam, or seafood. Do not promote the observed frozen raw/blanched market forms or the fisheries factor into catalog data while the identity is held.

## Source register

Sources were accessed on 2026-10-15 unless a source-specific date is given. IDs are local to this proposal and were not added to the research ledger.

| Source ID | Direct source and locator | Supports and limits |
|---|---|---|
| `WP04-SECTIONP-GREENLAND-COCKLE-R144-20261015-S01` | ITIS, [*Serripes groenlandicus* report, TSN 80879](https://itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=0080879), taxonomy and nomenclature. | Current standing is valid; lists Greenland cockle as a common English name. Taxonomy evidence, not Québec product naming. |
| `WP04-SECTIONP-GREENLAND-COCKLE-R144-20261015-S02` | Government of Canada TERMIUM Plus, [BUCARDE GROENLAND](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frr&lang=eng&srchtxt=BUCARDE+GROENLAND), record dated 2016-02-26. | Pairs *S. groenlandicus* with **Greenland cockle**, **coque du Groenland**, and **bucarde du Groenland**; both French names are marked correct. |
| `WP04-SECTIONP-GREENLAND-COCKLE-R144-20261015-S03` | OQLF, [coque, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198883/coque), updated 2012. | Defines the Québec seafood term **coque** with *Clinocardium ciliatum*, not *S. groenlandicus*. Supports a documented naming collision; does not identify Greenland cockle. |
| `WP04-SECTIONP-GREENLAND-COCKLE-R144-20261015-S04` | CFIA, [Fish List lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSN 80879, 80867, and 80873; accessed 2026-10-15 (page footer says data modified 2023-09-18). | For *S. groenlandicus*, lists **Greenland Cockle**, **Cockle / Coque**, and **White Cockle Clam** without French for the latter label. It assigns **Coque** to two *Clinocardium* taxa as well, with English entries **Hairy Cockle** and **Cockle**. Canadian label naming; not a Québec preference decision. |
| `WP04-SECTIONP-GREENLAND-COCKLE-R144-20261015-S05` | Fisheries and Oceans Canada, [Offshore clam management plan, English](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/clams-palourdes/offshore-hauturieres-eng.html) and [French](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/clams-palourdes/2020/offshore-hauturieres-fra.html), bycatch provisions and conversion-factor discussion. | Supports that cockles can be retained as incidental, non-quota molluscan catch. Describes a generalized 5.5 fishery factor while specific factors are studied; this is not a kitchen conversion. |
| `WP04-SECTIONP-GREENLAND-COCKLE-R144-20261015-S06` | Fourchette Bleue / Exploramer, [coque du Groenland](https://fourchettebleue.ca/produits/coque-du-groenland/), species, “nom en cuisine,” season, fishing, and cooking sections. | Pairs the species with **coque du Groenland**, reports no directed fishery and incidental/recreational catch context, and lists culinary uses. Does not provide retail inventory or a package measure. |
| `WP04-SECTIONP-GREENLAND-COCKLE-R144-20261015-S07` | Seafood from Canada, [Other Species Exports (English)](https://seafoodfromcanada.ca/seafood/other-species/) and [Autres espèces (French)](https://seafoodfromcanada.ca/fr/seafood/autres-especes/), Greenland cockle entry. | Pairs *S. groenlandicus* with Canadian harvest context and frozen raw/blanched meat forms; French entry uses `Coque, Groenland`. Industry/export listing; no named retail SKU, package size, or Québec stock claim. |

## Recommendation and data delta

Hold *Serripes groenlandicus* outside active references, forms, legacy mappings, and the research ledger for this pass. Preserve the existing unresolved `ingredient-ref-cockle` and `ingredient-ref-clam` candidates. Revisit if the picker can keep generic cockle/coque queries from appearing complete when only one species is active, or when a recipe requires a deliberately species-qualified choice. The current Canadian product-form evidence is sufficient to establish market relevance but does not override the picker boundary or absent recipe demand.

**Exact proposed data delta: none.** Add zero ingredient references, aliases, forms, research-ledger records or sources, legacy identities, recipe links, measures, unit mappings, conversions, yields, and substitutions. Section P remains open.
