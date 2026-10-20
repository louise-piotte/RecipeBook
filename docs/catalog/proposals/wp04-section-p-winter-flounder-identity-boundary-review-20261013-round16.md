# WP04 Section P — winter flounder / plie rouge identity-boundary review (round 16)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** finfish identity, Canadian/Québec naming, picker, ownership, recipe-demand, product, measurement, and substitution proposal packet; root has recorded the hold.
- **Candidate:** winter flounder / plie rouge (*Pseudopleuronectes americanus*).
- **Disposition:** **Hold** the candidate outside active references and the research ledger. The identity and Québec-qualified display are supported, but the required English display contains “flounder”; under the current picker, activating it would make the broad query **flounder** return this one species alone. CFIA uses Flounder across numerous taxa. No bundled recipe demand offsets that misleading singleton.
- **Scope:** one distinct unallocated Atlantic flatfish species. This does not reopen the American plaice identity, the generic sole/flounder boundary, or the prior yellowtail-flounder hold.
- **Proposal-time worktree scope:** this packet was drafted without changing catalog JSON, ledger, plan, roadmap, recipe, or generated files.

## Why this is a distinct open gap

The active Section P checklist still lists sole, flounder, and regional fish among the open fish families and species ([plan, P](../../RecipeBook-global-ingredient-catalog-plan.txt#L3537)). The 2026-10-10 finfish gap proposal mentioned plie rouge only as an OQLF example within the broad sole/flounder market-name problem; it advanced American plaice but did not allocate or assess a winter-flounder row. A later yellowtail-flounder packet held that separate species because activating its English display would make flounder a one-result query. The candidate here is a different taxon and Québec-qualified name, not a re-review of yellowtail flounder.

A repository audit across the current plan, proposals, batches, seed references/forms, legacy identities, and ledger found no focused winter-flounder identity decision and no active or ledger identity owner for *P. americanus*. The name appears in earlier material only as an example in a multi-species naming boundary. The live catalog’s American plaice row is *Hippoglossoides platessoides* / American plaice / plie canadienne, a separate species.

If the picker boundary is later resolved, the narrow candidate identity would be:

| Candidate ID | Category | English display | Québec French display | Taxon | Aliases |
|---|---|---|---|---|---|
| ingredient-ref-winter-flounder | PROTEIN | **winter flounder** | **plie rouge** | *Pseudopleuronectes americanus* | None proposed |

This is a conditional description only. It does not reserve an ID or authorize a new catalog or ledger row.

## Canadian and Québec name evidence

OQLF’s GDT entry directly pairs the normalized Québec edible-fish term **plie rouge** with English **winter flounder** and *Pseudopleuronectes americanus*. It also lists English terms including blackback flounder, blackback, and lemon sole, and warns that this and several other Québec flatfish may be sold as “sole,” confusing them with common sole. The entry was last updated in 2004. The exact OQLF URL was already cited in the general finfish gap proposal as source WP04-FINFISH-GAPS-20261010-S14; that earlier source register did not create a ledger identity for this species.

DFO’s French species profile independently names plie rouge and gives the same taxon. It describes an Atlantic fish ranging from Newfoundland and Labrador to Georgia and discusses fishery history and biology. It is species-identification evidence, not a current consumer label or culinary specification. DFO’s current Gulf management notice and separate 2026 Newfoundland and Labrador fishing plan show why fishery status must stay stock- and area-specific: no directed commercial fishery is authorized for the listed 4T Gulf stock in 2026–27, while the 2026 3KL plan separately regulates a winter-flounder fishery. Neither notice establishes current Québec retail inventory.

CFIA’s Fish List includes *P. americanus* under Winter Flounder and lists names including Blackback Flounder / Plie Rouge, Flounder, Lemon Sole, Sole, and Winter Flounder. The direct flounder-query URL was already reviewed in the yellowtail-flounder boundary packet as source WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S02. CFIA is authoritative for accepted fish-label names, but its names are not ingredient-equivalence or recipe-substitution rules. The current Fish List output still displays a 2023-09-18 modification date. The Fish List name rows do not make the many English and French market terms safe global picker aliases.

## Product and identity boundaries

- Keep the conditional identity scoped to *P. americanus*. It is distinct from active American plaice / plie canadienne (*Hippoglossoides platessoides*), and from the separately held yellowtail flounder / limande à queue jaune (*Myzopsetta ferruginea*).
- Keep bare **flounder**, **sole**, **plie**, **filet de plie**, and **sole fillet** out of aliases. OQLF describes several Québec flatfish as historically sold under the commercial label sole and groups the relevant fish as flounders; CFIA assigns Flounder, Sole, and Plie names across multiple taxa. A generic product/category term must not be attached to this one species.
- Do not add **blackback**, **blackback flounder**, **lemon sole**, or other source-listed terms as aliases in this hold. Their appearance in a species-name list is not enough to make them safe terms for the active picker.
- A current Seafood from Canada profile pairs “Plie rouge/Sole” with *P. americanus* and lists whole, HOG, H&G, and fillet offerings in fresh and frozen categories. A Newfoundland and Labrador seafood directory groups multiple species beneath Flounder / Sole and lists fresh/frozen products. These sources corroborate commercial product categories, but neither is a Québec retail package or a lot-specific consumer label. The broad seller headings are not adopted as display names or aliases.
- Fourchette Bleue’s Québec species page uses “plie rouge” for the taxon, says “sole” is a culinary group name for several flatfish, and describes fillets and quick cooking. Its page is not a retail SKU, gives no pack specification, and also reports the Gulf fishery closure. Do not turn its cooking suggestions or seasonal wording into an availability guarantee, a form conversion, or a substitution rule.

## Exact ownership and source-ID audit

The exact-key review follows the current search normalization in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, fold accents and punctuation, and collapse spaces. It checked active reference IDs, names, and aliases; form IDs, labels, and match terms; legacy-candidate IDs, names, and aliases; and ledger record IDs.

| Key or ID | Active reference/form owner | Legacy or ledger identity owner | Review |
|---|---|---|---|
| winter flounder; plie rouge; *Pseudopleuronectes americanus* | None | None | Exact target identity terms are unowned. |
| ingredient-ref-winter-flounder; candidate-winter-flounder | None | None | Neither candidate ID is allocated. |
| blackback flounder; blackback; lemon sole | None | None | No exact active owner; held as aliases. |
| flounder | No current phrase-first result | No identity row | Its broad source scope is the reason for the conditional-row hold. |
| plie | American plaice / plie canadienne | American plaice is a distinct active species | Do not assign bare plie as an alias. |
| sole | No exact fish identity owner | None | Current search falls back to an unrelated attached-form phrase containing “soleil”; this incidental substring result is not a fish-name owner. Do not add sole as an alias. |
| ingredient-ref-american-plaice | American plaice / plie canadienne | Active | Separate taxon and row; not a winter-flounder allocation. |
| ingredient-ref-yellowtail-flounder | None | Not allocated | Separate candidate held in the prior picker-boundary review. |

The review-time snapshot has 1,344 references, 98 forms, 64 legacy candidates, and 1,657 ledger records. No active row, form, legacy candidate, or ledger record owns the proposed identity.

The proposal-local source prefix **WP04-SECTIONP-WINTER-FLOUNDER-PICKER-BOUNDARY-20261013-R16-** was checked against ledger source IDs and existing catalog proposals/batches; it is unused. Source reuse was also checked by exact URL:

- Reuse the prior proposal references for OQLF’s plie rouge entry (WP04-FINFISH-GAPS-20261010-S14) and CFIA’s flounder query (WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S02); do not mint duplicate IDs for those already-cited sources.
- The CFIA Fish List overview and common-name guidance URLs already have ledger source records. If later integration needs these general authorities, reuse the existing registered source IDs rather than adding duplicate source entries.
- The new DFO species-profile, DFO 2026 management, Seafood from Canada, Newfoundland and Labrador directory, Fourchette Bleue, and CNF URLs below have no exact URL match in the current ledger or earlier catalog packet at this snapshot. Their R16 labels are proposal-local only and are not ledger allocations.

## Phrase-first picker projection

The current picker searches complete normalized phrases in reference and attached-form terms before falling back to substring matching. The projection uses the live references/forms plus the conditional display above with no aliases and no form. It is a static projection of the implementation, not a runtime picker test.

| Query | Current result | Conditional result with winter flounder / plie rouge | Boundary |
|---|---|---|---|
| winter flounder | None | Candidate only | Exact species-qualified English display. |
| plie rouge | None | Candidate only | Exact Québec species-qualified display. |
| plie | American plaice / plie canadienne | American plaice plus candidate | Broad French component returns two distinct species. |
| flounder | None | Candidate only | Misleading singleton: CFIA uses Flounder across multiple fish taxa. This is the hold reason. |
| blackback; blackback flounder; lemon sole | None | None | No alias promotion. |
| sole | An unrelated rocoto-pepper result through substring fallback | Same incidental result | Not a genuine fish identity owner; omit sole from candidate terms. |
| fish | Four references: Bonga dried fish powder, fish balls, fish sauce, and fish stock | Same four | The candidate display does not add the broad fish query. |

The French-qualified display therefore preserves an informative result for a plie query alongside the existing American plaice, but the required English display necessarily makes flounder a single-result query. No alias choice can prevent that because flounder is part of the English display itself. Keep the candidate outside the active picker until search can preserve a broader flounder scope or a reviewed set of flatfish rows can make that broad query meaningful.

## Bundled recipe demand

The manifest-ordered corpus contains **114 recipe files and 1,123 ingredient rows**. All recipe files and ingredient rows were scanned for winter flounder, plie rouge, *Pseudopleuronectes americanus*, blackback flounder, blackback, lemon sole, flounder, plie, sole, and limande. There were **zero matching recipe files and zero ingredient-row hits** for all audited terms.

The corpus is 753,792 bytes. Its manifest-ordered digest is **7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c**. No recipe link, recipe-specific amount, or product state can be inferred from bundled demand.

## Package measurements, yields, and substitutions

| Evidence | Source-specific observation | Catalog decision |
|---|---|---|
| Health Canada CNF food code 3216 | “Fish, flatfish (flounder or sole or plaice), raw” has 1 fillet = 161.7 g, a 90 g food-guide serving, and 64% total refuse. This is a broad 2015 CNF grouping, not *P. americanus*; the page is dated 2019-03-01. | Do not attach the fillet mass, serving, refuse, density, or unit mapping to the candidate. It does not identify species, cut, or fillet preparation. |
| DFO species profile | Biological description says the fish can reach 50 cm or more. | Biological length is not a kitchen measure, retail pack weight, serving, or edible-yield observation. |
| Seafood from Canada / NL seafood directory | Product pages list forms such as whole, fillets, HOG/H&G, and frozen categories but give no package mass or transferable yield. The NL directory groups multiple flatfish species. | Add no form, package-yield record, count conversion, density, unit mapping, or active measure. |
| Fourchette Bleue culinary notes | Suggests a thin fillet, quick cooking, and pan-frying; no tested amount, cooking loss, or paired replacement. | Add no cooking-yield rule or global/contextual substitution. Similar mild, flaky descriptions do not establish a safe replacement species, method scope, or ratio. |

The DFO 2026 Gulf 4T notice sets a 150-ton TAC for plie rouge, a maximum bycatch percentage, and states that no directed commercial fishery is authorized for the listed 4T groundfish stocks. Those are fishery-management quantities and restrictions, not consumer package, serving, or yield values. The separate 2026 3KL harvesting plan demonstrates that status is area-specific; neither notice establishes a Québec package or a kitchen conversion. No reviewed source supports a winter-flounder-to-American-plaice, yellowtail-flounder, cod, or generic flatfish substitution.

## Source register

Sources were checked online on 2026-10-13 unless a source's own date is stated. R16 source labels below are local to this proposal only.

| Source ID | Source | Evidence and limit |
|---|---|---|
| Reused prior source WP04-FINFISH-GAPS-20261010-S14 | OQLF GDT, [plie rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198643/plie-rouge) | Directly pairs normalized Québec plie rouge, English winter flounder, and *Pseudopleuronectes americanus*; warns about Canadian market use of sole. Last updated 2004. This exact page was previously cited in the broad finfish-gap packet; its direct web fetch returned a transient cache miss in this review, so the accessible indexed entry was used. Terminology, not stock or product evidence. |
| Reused prior source WP04-P-YELLOWTAIL-FLOUNDER-BOUNDARY-20261012-S02 | CFIA, [flounder query in the Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=flounder) | Lists *P. americanus* and many other fish with Flounder/Plie-related names. The Fish List is Canadian fish-label terminology, not a recipe equivalence list; the list output reports modification date 2023-09-18. This query and source ID were already documented in the yellowtail-flounder hold packet. |
| Existing ledger sources, reuse without new IDs | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | CFIA describes accepted common names for fish labelling in Canada and the Fish List’s scientific-name scope. These URLs are already registered in the ledger under multiple existing source IDs; they support label limits, not recipe or substitution behavior. |
| WP04-SECTIONP-WINTER-FLOUNDER-PICKER-BOUNDARY-20261013-R16-S01 | Fisheries and Oceans Canada, [Plie rouge species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/winter-flounder-plie-rouge-fra.html) | Names *P. americanus* and plie rouge; describes Atlantic distribution and biology. Official Canadian species source, but not a food label, current retail listing, or recipe-measure source. |
| WP04-SECTIONP-WINTER-FLOUNDER-PICKER-BOUNDARY-20261013-R16-S02 | Fisheries and Oceans Canada, [2026–2027 Gulf groundfish TAC notice](https://www.glf.dfo-mpo.gc.ca/fr/node/20591) | Published 2026-05-26; sets the 4T plie rouge TAC/bycatch terms and states no directed commercial fishery for the listed stocks. Stock-specific management only; no consumer quantity. |
| WP04-SECTIONP-WINTER-FLOUNDER-PICKER-BOUNDARY-20261013-R16-S03 | Fisheries and Oceans Canada, [2026 3KL winter-flounder harvesting plan](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-40-fra.html) | Current regional fishing plan for winter flounder. Demonstrates that Gulf 4T status should not be generalized to all Canadian stocks; not retail availability or food-measure evidence. |
| WP04-SECTIONP-WINTER-FLOUNDER-PICKER-BOUNDARY-20261013-R16-S04 | Seafood from Canada, [Plie rouge/Sole](https://seafoodfromcanada.ca/fr/seafood/plie-rouge-sole/) | Pairs the named taxon with the broad market title Plie rouge/Sole; lists whole, HOG, H&G, fillet, fresh, and frozen offerings and 100 g nutrition information. Trade/marketing page; no pack size, lot-specific Québec SKU, or transferable yield; its all-year availability wording is not reconciled to the 4T closure. |
| WP04-SECTIONP-WINTER-FLOUNDER-PICKER-BOUNDARY-20261013-R16-S05 | Newfoundland and Labrador Department of Fisheries, Forestry and Agriculture, [Seafood products directory](https://nlseafood.ca/products/) | Lists *P. americanus* and fresh/frozen flatfish product categories under Flounder/Sole. The directory says its content is supplied by seafood companies and disclaims responsibility for errors or omissions; it groups several taxa and gives no package weights. Not Québec retail availability. |
| WP04-SECTIONP-WINTER-FLOUNDER-PICKER-BOUNDARY-20261013-R16-S06 | Fourchette Bleue par Exploramer, [Plie rouge](https://fourchettebleue.ca/produits/plie-rouge/) | Québec species page pairs plie rouge and the taxon, describes sole as a culinary group, a seasonal consumption statement, and simple cooking suggestions; it notes the Gulf fishery has been closed since 2023. No SKU, package measure, yield, or substitute ratio; direct page retrieval was unavailable in this review, so indexed page content was checked. |
| WP04-SECTIONP-WINTER-FLOUNDER-PICKER-BOUNDARY-20261013-R16-S07 | Health Canada, [CNF food code 3216 serving portions](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3216) | Broad raw flatfish grouping with 161.7 g per fillet, 90 g food-guide serving, and 64% refuse; page states 2019-03-01 modification date. Not species-matched and not a current measured package or catalog conversion. |

## Recommendation

Keep the conditional winter-flounder / plie-rouge identity outside the active picker, legacy candidates, and ledger. The species and Québec-qualified display are supported, but the English display would make broad **flounder** a one-result query while CFIA assigns that name across many fish. Do not add generic flounder, sole, plie, or filets/sole product terms as aliases; add no form, measure, density, mapping, recipe link, package yield, conversion, or substitution.

Revisit when the picker can present multiple relevant flounder identities or clearly communicate a broader-category boundary. The older OQLF market note alone does not justify registering a generic flounder product or activating a singleton species row.

No app, unit, instrumentation, or emulator tests were run. Root recorded the hold in the plan, roadmap, and integration notes; no database JSON changed, so no tests were needed.

## Root integration status

**Integrated.** Winter flounder / plie rouge remains outside the active catalog and research ledger because its English display would make `flounder` a one-result query. See [round-sixteen integration](../batches/wp02-wp03-wp04-round16-gap-review-integration-20261013/README.md). No catalog or ledger data was added.

