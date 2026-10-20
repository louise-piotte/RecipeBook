# WP04 Section P — European turbot / turbot commun picker and market-boundary review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only review of one species-scoped finfish identity, Québec market naming, active catalog ownership, picker behavior, recipe demand, and source-specific product/portion evidence.
- **Checklist item:** [Section P finfish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L3659) remains open: “Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.”
- **Candidate:** European turbot / turbot commun (*Scophthalmus maximus*; OQLF also records *Psetta maxima* as a Latin name).
- **Disposition:** **Hold the species-specific candidate outside the active picker.** Its taxonomic and lexical identity is well supported, and a Québec seller page names the species on a fillet product. The current picker would make this species the only result for a bare `turbot` query. Québec market use and CFIA labeling show that the unqualified term does not identify this species consistently enough to present that singleton as a safe ingredient choice.
- **Worktree scope:** this proposal file only. No catalog JSON, research ledger, plan, roadmap, generated file, recipe, test, app code, or batch README was changed.

## Why this is a new, species-scoped review

The October 10 finfish-gaps review held the **generic** market term `turbot` and said a later row should be species-qualified. The Greenland-halibut review then added only `Greenland halibut / flétan du Groenland` and excluded turbot expressions from that row; it did not allocate a European-turbot candidate. This packet follows those boundaries by examining *S. maximus* as a separate taxon, using new Québec product evidence, and deciding whether its qualified names can safely be exposed through the current picker. It does not reopen the generic hold or the Greenland-halibut identity. [Prior reviews: [finfish gaps](wp04-finfish-gaps-20261010.md), [Greenland halibut](wp04-section-p-greenland-halibut-identity-review-20261012.md)]

## Identity and Québec market scope

OQLF’s GDT entry for **turbot** is in zoology/ichthyology and edible-fish terminology. It identifies *Scophthalmus maximus*, gives French preferred terms `turbot` and `turbot commun`, and English terms `turbot` and `European turbot`. This supports a real species-scoped identity and a qualified English display; it is lexical evidence, not a finding that Quebecers use every preferred term to distinguish retail products. [S01]

The distinct OQLF entry for **flétan du Groenland** identifies *Reinhardtius hippoglossoides*. Its note says that this fish is often commercialized in Québec as `turbot`, while specialized fish nomenclature reserves `turbot` for *S. maximus*. It also says `turbot` and `turbot du Groenland` were not retained in Québec fish-product marketing to avoid consumer-label confusion. This is the key difference between OQLF’s species-level lexical mapping and the ambiguous unqualified term a picker user may enter. [S02]

MAPAQ’s 2020 sector portrait makes the market distinction concrete: it says Québec also uses `turbot` for Greenland halibut, distinguishes European turbot as another fish, and records European turbot imports from 2013–2017, with a maximum reported volume of 2.1 tonnes in that period. These are historical trade statistics, not current inventory. A Québec retailer’s product page provides a more recent SKU-level example: **Turbot blanc en filet**, a 10 lb case supplied by La Mer à Bord, names *Scophthalmus maximus* and describes the product as filleted and frozen under vacuum. At access the page showed zero in-store units and pre-order availability; the supplier-reported species is useful identity evidence, not proof of current stock or an independent lot-label check. [reused `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S05`; S04]

The CFIA Fish List independently maps *S. maximus* (TSN 172748) to `Turbot / Turbot`. Its search results also use `Turbot` for several *Psettodes* taxa; the Greenland-halibut row has additional turbot trade names. CFIA label names and scientific-name mappings are authoritative labeling evidence, but their unqualified common-name collisions do not establish culinary equivalence. [S03; reused Greenland-halibut source `WP04-P-GREENLAND-HALIBUT-20261012-S02`]

This is a terminology and product-name decision; it does not imply a fishery-status or regulatory conclusion. DFO’s older Greenland-halibut bibliography independently records the long-running Canadian use of `turbot` for Greenland halibut and notes other species called turbot, including *S. maximus*; treat that as historical naming context only. [S06]

## Exact ownership and picker projection

The read-only snapshot contained **1,355 active ingredient references, 98 forms, 64 legacy-import candidates, and 1,677 research-ledger records**. Using the search normalization in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), exact normalized-key checks found no active reference, form, legacy candidate, or ledger-record owner for `European turbot`, `turbot commun`, `turbot blanc`, `Scophthalmus maximus`, or the prospective ID `ingredient-ref-european-turbot`. The active French key `flétan du Groenland` belongs to `ingredient-ref-greenland-halibut`; its alias `flétan noir` is also attached to that Greenland-halibut row. Existing ledger/proposal notes about European turbot are boundary evidence, not an allocated identity. The new source-ID prefix used below was absent before this proposal.

The picker searches reference displays, aliases, and form terms. It prefers complete word-phrase matches, then falls back to substring matching. The following projection applies only a hypothetical bilingual display and no aliases or forms; the row is **not** active:

| Query | Current picker | With hypothetical `European turbot / turbot commun` row | Interpretation |
|---|---|---|---|
| `European turbot` | No result | European turbot candidate | Species-qualified English phrase. |
| `turbot commun` | No result | European turbot candidate | OQLF-preferred French phrase. |
| `turbot` | No result | European turbot candidate only | The query occurs as a full word in both proposed displays, so the current matcher cannot keep the qualified candidate hidden from this broad query. |
| `turbot blanc` | No result | No result | The supplier’s SKU wording is not proposed as a global alias. |
| `flétan du Groenland` | Greenland halibut | Greenland halibut | The species identity remains separate; no turbot alias is added to it. |
| `Scophthalmus maximus` | No result | No result | Keep the scientific name as evidence, not a consumer ingredient alias. |

An active row using the source-supported names would therefore create a misleading singleton for the same short term used by Québec fish sellers for Greenland halibut. Adding `turbot` to the Greenland-halibut aliases to force two results is also not recommended: OQLF says that label was not retained for Québec consumer fish-product marketing. Keep both taxonomic facts visible in documentation and reconsider active search terms if the picker can expose the competing scopes for a broad query.

## Recipe demand, forms, quantities, and substitutions

The scan read all **114 manifest-listed recipe files** and all **1,123 `ingredients[]` rows**, including full recipe JSON text. Searches covered `turbot`, `European turbot`, `turbot commun`, `turbot blanc`, `Scophthalmus maximus`, Greenland-halibut terms, and the binomial *Reinhardtius hippoglossoides*.

**Bundled demand: zero matching recipe files and zero matching ingredient rows.** The candidate has no recipe link, recipe amount, preparation context, or recipe-derived form.

| Evidence | Exact source-specific observation | Boundary |
|---|---|---|
| Québec seller, La Mer à Bord listing | 10 lb case titled `Turbot blanc en filet`; supplier field names *S. maximus* and describes filleting and frozen vacuum packaging. | SKU/case and supplier processing description only. No count per case, household portion, or yield. Page showed pre-order and zero in-store units at access. [S05] |
| Mayrand product page | `Filet de turbot frais 200 g`, sold as a unit of approximately 0.2 kg; all listed stores showed `Bientôt disponible`. | Taxon is not stated. This is one out-of-stock SKU estimate, not an *S. maximus* portion or a transferable fillet mass. [S06] |
| Health Canada 2008 *Nutrient Value of Some Common Foods* | `Turbot, baked or broiled` has a listed 75 g measure/weight. | A generic cooked entry with no species or cut specified. Keep it as this source’s cooked reference; do not assign it to *S. maximus* or treat it as a raw-filleted ingredient default. [S07] |
| Health Canada 2015 CNF food 3013 | `Fish, halibut, Greenland (turbot), raw`: 1/2 fillet = 204 g, Food Guide serving = 90 g, total refuse = 64%. | Explicitly *R. hippoglossoides*, not European turbot. These source-specific observations stay with Greenland halibut and do not transfer across taxa or cuts. [reused `WP04-P-GREENLAND-HALIBUT-20261012-S05`] |
| Recettes du Québec, four-serving mixed-fish recipe | 300 g of `filets de turbot (ou barbue ou saint-pierre)`. | The recipe names no taxon and offers alternatives in that one dish. This is not a reusable portion or a globally directed substitution rule. It is external recipe evidence, not bundled-corpus demand. [reused `WP04-JOHN-DORY-BOUNDARY-20261012-S07`] |

No source supports an *S. maximus*-specific household portion, density, volume-to-mass mapping, package yield, edible yield, or cooking conversion. Do not convert the seller’s 10 lb case into a recipe amount or use Mayrand’s SKU estimate as a standard fillet size. Leave density and ingredient-specific unit mappings absent. No evidence supports a directed same-species form conversion or a contextual substitution involving this taxon; the one external recipe’s alternatives remain confined to that recipe and do not support global replacement behavior.

## Candidate shape if the picker boundary is later resolved

This sketch records supported identity terms only; it does not allocate or reserve an ID and is **not** a request to add the row now.

| Field | Conditional value |
|---|---|
| ID | `ingredient-ref-european-turbot` |
| Category | `PROTEIN` |
| English display | `European turbot` |
| fr-CA display | `turbot commun` |
| Aliases | None proposed |
| Taxon | *Scophthalmus maximus* (OQLF also lists *Psetta maxima*) |
| Density / unit mappings / forms | None established |

Even without a `turbot` alias, those displays would make `turbot` return this row alone. Keep the candidate outside the active catalog until a reviewed picker behavior can preserve the consumer-facing ambiguity or the product wording gives users an unambiguous qualified choice.

## Sources

Sources were accessed on 2026-10-13 unless noted. New source IDs below are local to this proposal and are not ledger additions. Existing IDs are reused where the exact primary document already has an allocated source entry.

| Source ID | Source and evidence | Limit |
|---|---|---|
| `WP04-P-EUROPEAN-TURBOT-20261013-R27-S01` | OQLF, [turbot (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198641/turbot). Identifies *Scophthalmus maximus*; gives French `turbot` / `turbot commun`, English `turbot` / `European turbot`, and Latin *Psetta maxima* as an additional name. | Entry last updated 2004. Lexical and taxonomic naming, not retail availability. |
| `WP04-P-EUROPEAN-TURBOT-20261013-R27-S02` | OQLF, [flétan du Groenland (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198640/fletan-du-groenland). Identifies *Reinhardtius hippoglossoides*; distinguishes Québec fish-market use of `turbot` for this fish from specialized *S. maximus* terminology and consumer fish-product naming. | Entry last updated 2012. Terminology and naming policy, not a present inventory survey. |
| `WP04-P-EUROPEAN-TURBOT-20261013-R27-S03` | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), [searchable Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), and [lookup results for *Scophthalmus maximus*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&lang=e&q=Scophthalmus+maximus). Lists TSN 172748 with English/French `Turbot / Turbot`; Fish List results also assign unqualified `Turbot` to other taxa including *Psettodes* species. | Canadian fish-label naming and taxon lookup, not consumer search behavior or culinary interchangeability. |
| **Reused `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S05`** | MAPAQ, [Portrait-diagnostic sectoriel du flétan du Groenland](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/agriculture/types-de-productions/ED_portrait_diagnostic_industrie_fletan_MAPAQ.pdf), 2020, p. 31. Says `turbot` is also used for Greenland halibut in Québec, distinguishes European turbot, and reports 2013–2017 imports with a 2.1-tonne maximum. | Historical trade period; not a current stock or present import volume. The document URL/source ID is already in the ledger for another passage. |
| `WP04-P-EUROPEAN-TURBOT-20261013-R27-S04` | Comptoir St-Vrac / La Mer à Bord, [Turbot blanc en filet](https://comptoirstvrac.com/product/134). Seller page names *S. maximus*, a 10 lb case, and a supplier description of filleting and frozen vacuum packaging. | Supplier-reported product identity and presentation; at access page showed pre-order and zero in-store units. Not an independent package-label audit or portion standard. |
| `WP04-P-EUROPEAN-TURBOT-20261013-R27-S05` | Mayrand, [Filet de turbot frais 200 g](https://mayrand.ca/fr/nos-produits/poissonnerie/poissons-a-larrivage/turbot-filet-fr-52969). Lists a fresh fillet product unit of approximately 0.2 kg. | No scientific name; all displayed store locations showed `Bientôt disponible`. SKU-specific estimate only. |
| `WP04-P-EUROPEAN-TURBOT-20261013-R27-S06` | DFO, [A bibliography on Greenland halibut, *Reinhardtius hippoglossoides* (a.k.a. Greenland turbot), 1936–2005](https://publications.gc.ca/collections/collection_2012/mpo-dfo/Fs97-6-2683-eng.pdf). Notes Canadian use of `turbot` for Greenland halibut and records *S. maximus* among other species called turbot. | Historical nomenclature context; not evidence of current Québec retail availability. |
| `WP04-P-EUROPEAN-TURBOT-20261013-R27-S07` | Health Canada, [Nutrient Value of Some Common Foods (2008)](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/fn-an/alt_formats/pdf/nutrition/fiche-nutri-data/nvscf-vnqau-eng.pdf), fish table. Gives `Turbot, baked or broiled`, 75 g. | Species and cut are not specified; cooked generic table entry only. |
| **Reused `WP04-P-GREENLAND-HALIBUT-20261012-S05`** | Health Canada, [CNF food 3013 serving sizes](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3013). | Explicitly raw Greenland halibut, not *S. maximus*. |
| **Reused `WP04-JOHN-DORY-BOUNDARY-20261012-S07`** | Recettes du Québec, [Panaché de poisson à la vapeur, sauce à l’aneth](https://www.recettes.qc.ca/recettes/recette/panache-de-poisson-a-la-vapeur-sauce-a-l-aneth-204991). | Four-serving community recipe with 300 g of generic turbot fillets or other listed fish; no taxon. |

## Recommendation

Keep `ingredient-ref-european-turbot` unallocated and keep `turbot`, `turbot commun`, `European turbot`, `turbot blanc`, and *Scophthalmus maximus* out of active names and aliases for now. The taxonomy and a Québec species-named seller listing are sufficient to identify a future candidate, but the current picker cannot expose its qualified name without also resolving a bare `turbot` query to this one species. Preserve the separate Greenland-halibut name and do not add product-specific package or portion observations as reusable conversions, forms, density, yield, or substitution behavior. Reconsider after the picker can show the competing market scopes or after a product label/recipe supplies an unambiguous species-qualified name.

This proposal changes documentation only. No app, unit, instrumentation, or emulator tests were run; no database JSON changed.
