# WP04 Section P — Atlantic bonito identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Review of one regional finfish identity, Canadian/Québec naming, picker scope, recipe demand, and evidence limits.
- **Disposition:** Integrated as an identity-only PROTEIN reference for Atlantic bonito / bonite à dos rayé (*Sarda sarda*). No aliases, forms, recipe links, measurements, conversions, yields, or substitutions were added.
- **Worktree scope:** Added one database JSON reference and one source-backed ledger record, plus this documentation and a derived index entry. Recipes and runtime logic were unchanged.
- **Source IDs:** `WP04-P-ATLANTIC-BONITO-20261012-R3-S01` through `S04`; the prefix was checked against the live ledger and existing proposal/batch files and is unused.

## Candidate and bounded recommendation

The open Section P finfish line includes bonito and regional fish. The active dried-bonito/katsuobushi identity is a separately defined preserved product; its review expressly left whole bonito outside that row. This proposal covers the Québec-standardized whole-fish species identity only. It does not expand dried bonito, katsuobushi, fish powder, or stock.

| Candidate ID | Category | English display | fr-CA display | Aliases | Taxon |
|---|---|---|---|---|---|
| `ingredient-ref-atlantic-bonito` | `PROTEIN` | **Atlantic bonito** | **bonite à dos rayé** | None | *Sarda sarda* |

OQLF places the fish in both zoology/ichthyology and edible-fish terminology, identifies *Sarda sarda*, gives **bonite à dos rayé** as the normalized Québec term, and lists **Atlantic bonito** among its English terms. CFIA independently lists the same bilingual pair for *S. sarda* as Canadian fish-label names. This supports a species-scoped identity; it does not establish current Québec retail availability or recipe demand. [S01–S03]

If accepted, the row should remain identity-only with null density and empty unit mappings. Use no aliases. In particular, do not store bare **bonito** or **bonite**, **common bonito**, **bonita**, **skipjack**, **horse mackerel**, **Atlantic bonito tuna**, **tuna**, **thon**, or *Sarda sarda* as aliases. CFIA assigns bare Bonito to multiple *Sarda* taxa and also lists a separate Atlantic Bonito Tuna / Thon label. OQLF says **bonita** was not retained for Québec fish-product marketing. The qualified bilingual displays preserve the supported identity without making those broader labels global synonyms. [S01–S03]

## Product and prior-work boundary

The existing `ingredient-ref-dried-bonito` is **dried bonito (katsuobushi) / bonito séché (katsuobushi)**. It has qualified dried-flake aliases, but no bare bonito or bonite alias. Its ledger decision accepts that processed-product identity and excludes whole fish, other species, and stock. The earlier katsuobushi packet cited OQLF’s bonite à dos rayé entry to establish that the species name was not a katsuobushi alias; it did not allocate an Atlantic-bonito reference. This proposal keeps that accepted product boundary unchanged and considers the separate whole-fish candidate identified in the open plan. [S04; existing ledger record `ingredient-ref-dried-bonito`]

The name boundary matters because the Fish List also includes Bonito entries for *Sarda chiliensis* and *Sarda orientalis*, alongside *Sarda sarda*. The French entry **bonite à dos rayé** and English display **Atlantic bonito** select the *S. sarda* scope. Keep generic bonito wording unresolved as a taxonomic identification; do not link an unqualified recipe phrase to this row merely because the picker may surface its qualified display. [S02–S03]

## Live catalog, ledger, and exact-name audit

The read-only snapshot on 2026-10-12 contained 1,306 active references, 98 forms, 64 legacy candidates, and 1,614 research-ledger records. The manifest lists 114 recipes with 1,123 ingredient rows.

- No exact owner was found for `ingredient-ref-atlantic-bonito`, `candidate-atlantic-bonito`, **Atlantic bonito**, **bonite à dos rayé**, or *Sarda sarda* among active reference names/aliases, form labels/match terms, legacy names/aliases, or ledger record IDs.
- The exact prepared-product terms **dried bonito flakes**, **bonito flakes**, **katsuobushi**, and **flocons de bonite séchée** remain owned by `ingredient-ref-dried-bonito`. Generic **tuna / thon** remains owned by `ingredient-ref-tuna`; this proposal does not change either row.
- The ledger contains the accepted dried-bonito record and its earlier OQLF source as a species-boundary citation. It contains no separate Atlantic-bonito identity candidate. The full phrase **Sarda sarda** occurs there only as part of that source boundary, not as an allocated fish identity.
- The local proposal/batch review found no earlier Atlantic-bonito identity packet or separate hold. Earlier notes either count the dried product as covered or explicitly exclude whole bonito from the dried row; this proposal fills the distinct whole-fish scope rather than reopening that product decision.

## Picker projection

The projection follows the current complete-phrase search behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Names and aliases are searchable as phrases, so a qualified display can surface for a broad word contained in it.

| Query | Current result | With proposed row | Boundary |
|---|---|---|---|
| **Atlantic bonito** | None | Atlantic bonito / bonite à dos rayé | Qualified English display selects the proposed species. |
| **bonite à dos rayé** | None | Atlantic bonito / bonite à dos rayé | Normalized Québec display selects the proposed species. |
| **bonito** | Dried bonito (katsuobushi) | Dried bonito (katsuobushi); Atlantic bonito / bonite à dos rayé | Broad query surfaces a preserved product and a qualified whole-fish identity; it does not establish a generic species mapping. |
| **bonite** | Dried bonito (katsuobushi) | Dried bonito (katsuobushi); Atlantic bonito / bonite à dos rayé | Same broad-query boundary in French. |
| **bonito flakes**, **katsuobushi**, **flocons de bonite séchée** | Dried bonito (katsuobushi) | Dried bonito (katsuobushi) | Prepared-product queries stay on the existing dried identity. |
| **tuna**, **thon** | tuna / thon | tuna / thon | No new match; neither term is an alias or part of the proposed displays. |

The broad one-word searches will show the qualified Atlantic display because the word is inside the display. Preserve the complete result name in the picker and do not automatically map bare **bonito** or **bonite** recipe text to this row. The currently indexed results do not represent every *Sarda* taxon found on the CFIA Fish List.

## Bundled-recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned, including full recipe text, ingredient names, original text, and linked reference IDs. Search terms included **Atlantic bonito**, **bonite à dos rayé**, *Sarda sarda*, **bonito**, **bonite**, **bonita**, **katsuobushi**, and **Atlantic bonito tuna**.

**Result: zero matching recipe files and zero matching ingredient rows.** No recipe link, relink, amount, product state, or substitution is supported by the bundled corpus.

## Measurement, product state, and substitution limits

No current retail package or recipe ingredient request was verified in this review. OQLF’s statement that the species has commercial potential in Québec is terminology and market-potential context, not proof of current sale. A Fisheries and Oceans Canada Atlantic-fish reference independently lists **bonite à dos rayé / Atlantic bonito** for *Sarda sarda*; that reference supports the species-name boundary, not current retail availability. Leave present Québec supply unclaimed. [S01, S04]

Do not add a whole, fillet, fresh, frozen, cooked, smoked, dried, salted, or canned form from this identity review. Biological size descriptions are not portions or edible-yield conversions. Add no density, unit mapping, package yield, count conversion, mass/volume conversion, recipe measure, or substitution. In particular, no equivalence is supported between this whole-fish identity, tuna, mackerel, dried bonito/katsuobushi, fish powder, or stock.

## Integrated catalog delta

Added only `ingredient-ref-atlantic-bonito` as a `PROTEIN` reference with English display **Atlantic bonito**, Québec French display **bonite à dos rayé**, no aliases, null `defaultDensity`, and empty `unitMappings`. Registered the sources below on that identity. Kept recipe links, forms, measures, conversions, yields, and substitutions absent. The separate dried-bonito/katsuobushi row remains unchanged and unqualified bonito/bonite recipe requests remain unresolved.

## Verification performed

The complete manifest-listed corpus was rechecked for candidate-name demand; the source and ownership audits were retained. Seed package, reference, ledger, generated-index, picker-query projection, encoding, and whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data and its derived index entry.

## Sources

Sources were accessed on 2026-10-12. Online authority entries can be older than the access date; their dates and limits are recorded below.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-P-ATLANTIC-BONITO-20261012-R3-S01** | OQLF, [bonite à dos rayé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198927/bonite-a-dos-raye) — last updated 2011 | Classifies the term in zoology/ichthyology and edible fish, identifies *Sarda sarda*, gives normalized Québec **bonite à dos rayé**, English **bonito** and **Atlantic bonito**, and says the species has commercial potential in Québec. It rejects **bonita** for Québec fish-product marketing. It does not establish current retail supply. |
| **WP04-P-ATLANTIC-BONITO-20261012-R3-S02** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the Fish List supplies French and English common names acceptable for fish labelling in Canada and links those names to scientific names/TSNs. This is naming/label scope, not proof of current Québec retail stock or recipe demand. |
| **WP04-P-ATLANTIC-BONITO-20261012-R3-S03** | CFIA, [Fish List results for bonito](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Bonito) — list modified 2023-09-18 | Lists *Sarda sarda* as **Atlantic Bonito / Bonite à Dos Rayé**, as well as separate **Bonito**, **Tuna**, and **Atlantic Bonito Tuna / Thon** rows for that taxon. It also lists bonito names for *S. chiliensis* and *S. orientalis*. This supports the qualified display and explains why bare names and **thon** are not aliases. It does not establish culinary equivalence. |
| **WP04-P-ATLANTIC-BONITO-20261012-R3-S04** | Fisheries and Oceans Canada, [Poissons de la côte atlantique du Canada](https://waves-vagues.dfo-mpo.gc.ca/Library/110180_P2.pdf), bonite à dos rayé entry, p. 310 | Lists **Bonite à dos rayé / Atlantic bonito** for *Sarda sarda* and records other common-name wording separately. This Canadian Atlantic species reference corroborates the taxon/name boundary; it is not evidence of current Québec retail supply, recipe demand, or a kitchen measure. |
