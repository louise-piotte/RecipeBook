# WP03 Section I: Québec melon-seed products and kernel boundaries

- **Reviewed:** 2026-10-11
- **Status:** research complete for this candidate cluster; catalog integration held.
- **Scope:** named Egyptian/super-melon and Syrian-melon snack seeds sold in Québec, nearby Canadian red-melon-seed and char-magaz product evidence, boundaries against the active egusi, dried-watermelon-kernel, pumpkin-seed, and fruit references, and demand across every manifest-listed recipe line.
- **Not in scope:** changing catalog JSON, ledger, legacy candidates, recipe files, plan, roadmap, generated files, or integration documentation. No app tests were run.

## Disposition

Keep the remaining Section I item open. A Québec roaster’s bilingual local menu and product page establish real retail names for **Roasted Super Melon Seeds (Salted)** and **Syrian Melon Seeds (Salted)**. They do not establish that both products share one crop, shell state, or reusable ingredient form. A Canadian `red melon seeds` listing likewise does not identify a crop or shell state. A Canadian `char maghaz` listing gives one exact four-species kernel blend, but that formula does not resolve the variable wider market use of *char magaz*.

**No new active ingredient, alias, form, measure, density, unit mapping, recipe link, conversion, or substitution is ready to integrate.** Keep these product phrases as source-bounded research candidates. Do not alias them to `egusi`, `dried watermelon seed kernels`, or `pumpkin seeds`, and do not attach a roasted/salted form to the existing dried-kernel reference. The source pages do not settle whether the Egyptian product is whole or dehulled, while the Syrian and red-melon names do not establish a botanical species. The manifest scan found no recipe demand that would resolve those gaps.

The prior [`magaz` / `magaj` boundary review](wp03-section-i-magaz-melon-kernel-product-boundary-review-20261011.md) remains in force. This packet does not reopen its crop-specific kernel, variable-blend, or no-demand findings.

## Live snapshot before any integration

Counts were read from the current split seed package and research files. The recipe count and row count use only the paths listed in the live manifest.

| Artifact | Current count / fingerprint |
| --- | ---: |
| Ingredient references | 1,081 |
| Ingredient forms | 79 |
| General / contextual substitution rules | 0 / 0 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |
| Manifest-ordered recipe-set fingerprint | `23c95f6832cd5967021c16fd3aecb5d737818f938ffdbde91a69a192252d26d1` |
| Legacy import candidates | 75 |
| Research-ledger records | 1,380 |
| Ledger source entries / distinct source IDs | 4,572 / 3,742 |

The seven `WP03-I-MELON-RETAIL-20261011-S01` through `-S07` IDs below are unique to this proposal. They were not present in the live ledger at review time. No ledger records or source IDs were added by this proposal-only review.

## Existing identities and product boundaries

| Current reference | Existing scope | Review consequence |
| --- | --- | --- |
| `ingredient-ref-watermelon` — `watermelon` / `melon d’eau`, alias `pastèque` | The fruit; category `FRUIT`. OQLF names the plant *Citrullus lanatus* and gives `melon d’eau` / `pastèque` as Québec French terms. | Do not attach a seed product to the fruit row. OQLF terminology for the plant/fruit does not establish a seed-product display or alias. |
| `ingredient-ref-watermelon-seed-kernels-dried` — `dried watermelon seed kernels` / `graines de melon d’eau séchées` | A narrow dried seed-kernel reference; category `NUT_SEED_AND_DRIED_FRUIT`; no aliases, form, density, or unit mappings. Its ledger record retains the USDA SR28 hard-seed-coat refuse note and source-specific portion observations. | Do not infer that a Québec salted snack has the same shell state or copy the USDA portion observations to it. |
| `ingredient-ref-egusi-seeds` — `egusi seeds` / `graines d’egusi`; alias `egusi` in both locales | A regional culinary seed category intentionally spanning more than one cucurbit taxon. | Shared cucurbit or watermelon context does not make every melon-seed snack egusi. |
| `ingredient-ref-ogiri-egusi` — `ogiri-egusi` | A fermented melon-seed condiment, separate from egusi seeds. | Keep the condiment distinct from raw seed and kernel products. |
| `ingredient-ref-pumpkin-squash-seeds` — `pumpkin seeds` / `graines de citrouille` | Species-unspecified pumpkin/squash seed-family identity; no forms. | Do not use a pumpkin component in one blend as an alias for the blend or for melon seeds. |

Other active regional or species-scoped seed/kernel references remain separate: `ingredient-ref-roasted-sacha-inchi-seeds` (`roasted sacha inchi seeds`), `ingredient-ref-ogbono-kernels`, `ingredient-ref-lotus-seeds` (`sacred lotus seeds`, *Nelumbo nucifera*), and `ingredient-ref-makhana-seeds` (*Euryale ferox*). None names a melon product or supplies an alias for the retail candidates here. The reviewed melon-seed listings do not establish equivalence to those identities; preserve their species and preparation boundaries (see the [sacha inchi integration record](../batches/wp03-roasted-sacha-inchi-seeds-integration-20261011/README.md), [lotus/fox-nut boundary review](wp03-lotus-seed-fox-nut-boundary-review-20261010.md), and [makhana identity proposal](wp03-makhana-fox-nut-identity-20261009.md)).

No active form is owned by egusi seeds or dried watermelon seed kernels. The current form file has no Egyptian/super-melon, Syrian-melon, red-melon, or char-magaz form. The 75 legacy candidates have no exact candidate product phrase. The ledger has established records for egusi seeds, dried watermelon seed kernels, and ogiri-egusi, but no matching product record for the named snack phrases or *char magaz*.

### Candidate assessment

**Egyptian / super-melon seeds.** The We Roast Nuts product page names “Roasted Super Melon Seeds (Salted),” says they are dry-roasted Egyptian watermelon seeds, and lists `Watermelon seeds, salt`. Its Québec-facing delivery menu gives the bilingual name `Graines de Super Melon (Salées)` / `Roasted Super Melon Seeds (Salted)` and identifies the seller in Dollard-des-Ormeaux. This is useful Québec retail evidence for one product and its stated roast/salt treatment. It does not state whether the product is whole/in-shell or dehulled, and the direct product page showed a “notify me when available” state during review. Do not infer shell state from the fact that it is sold as a snack. Do not promote the seller’s phrasing to a general alias or form on the active dried-kernel row.

**Syrian melon seeds.** The same Québec menu lists `Graines de Melon Syrien (Salées)` / `Syrian Melon Seeds (Salted)` and describes them as soft and as an alternative to pumpkin or sunflower seeds “in the hull.” This supports a local product name and a source-specific in-hull snack comparison; it does not give a species or taxonomic name. Keep this distinct from the Egyptian watermelon listing, and from watermelon, egusi, pumpkin, and sunflower seed identities. No universal `Syrian melon` species mapping is proposed.

**Red melon seeds.** A current Canadian merchant page describes a dry-roasted salted item whose ingredients are `Red Melon Seeds, Salt`. It provides no species, cultivar, or shell state. Treat `red melon seeds` as an unresolved retail phrase, not as a synonym for watermelon, Egyptian/super melon, Syrian melon, muskmelon, or egusi.

**Char magaz / char maghaz.** A Canadian listing describes one `Melon Seeds` product as a four-kernel mix of watermelon, pumpkin, cucumber, and cantaloupe, with declared taxa *Citrullus lanatus*, *Cucurbita pepo*, *Cucumis sativus*, and *Cucumis melo*. The listing calls it `char maghaz`, identifies the plant part as seed kernel, and says to soak before grinding for a paste. Those claims are specific to that seller’s product. The earlier boundary review documents other Canadian listings with incomplete, differing, or pumpkin-only descriptions. Keep the unqualified blend name held; do not alias it to any one component or treat its soak-and-grind instructions as a form of one seed.

## Exact-key, collision, and recipe audits

The exact-key audit used the repository’s `normalize_search_key` behavior across current reference displays and aliases, form labels and match terms, and legacy-candidate displays and aliases. The picker’s phrase-first, substring-fallback behavior was also checked against `IngredientReferenceSearchIndex`.

| Query family | Exact owner / picker behavior | Disposition |
| --- | --- | --- |
| `graines de super melon`, `graines de melon syrien`, `graines de melon égyptiennes`, `graines de melon rouge`, `Syrian melon seeds`, `red melon seeds`, `super melon seeds`, `char magaz`, `magaz`, `magaj` | No exact key in references, forms, or legacy candidates; no picker match. | Keep source-qualified candidate wording out of global aliases. |
| `watermelon` | Phrase search returns both the watermelon fruit and the dried-watermelon-kernel reference. | Preserve the fruit/seed-product distinction. |
| `watermelon seed` | Phrase search returns `ingredient-ref-watermelon-seed-kernels-dried`. `melon seed` also reaches that row through substring fallback within `watermelon`. | Do not add broad aliases that would suggest shell state or a new general identity. |
| `graines de melon` / `graines de melon d’eau` | Phrase search returns the existing `graines de melon d’eau séchées` reference. | This is a broad-search collision, not evidence that the retail snack shares the dried-kernel product definition. |
| `egusi` | Phrase search returns both `ingredient-ref-egusi-seeds` and the distinct `ingredient-ref-ogiri-egusi` condiment. | Keep raw seed and fermented condiment separate. |
| `graines de citrouille` | Phrase search returns pumpkin seeds and pumpkin-seed butter. | Keep both current identities separate; the phrase is not a candidate alias for melon products. |
| `pepitas`, `graines de courge` | No exact active owner; the existing pumpkin-seed proposal holds them from broad aliasing. | No change. |

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for `magaz`, `magaj`, `maghaz`, `char magaz` / `char maghaz`, Egyptian/super/Syrian/red melon seed wording, generic melon or watermelon seed/kernel wording, egusi, and the matching French phrases. The scan found **0 full-recipe matches and 0 ingredient-line matches**. No recipe requests these products, quantities, preparations, soaking, roasting, shelling, or a blend. No recipe link or form hint can be assigned.

Adjacent seed-family lines were reviewed so unrelated demand would not be attributed to this cluster: recipe `065#3` requests chia seeds; `066#11` requests toasted white sesame; `072#14` and `111#6` request sesame seeds. None names a melon product, egusi, or char-magaz blend. A `seeded` jalapeño preparation and `pumpkin pie spice` phrase are also not melon-seed demand.

Retail package sizes such as 115 g, 225 g, 454 g, 1 kg, and the blend’s 150 g / 400 g / 1 kg packages are package formats, not recipe measures. The USDA 1 cup = 108 g and 1 oz = 28.35 g observations belong only to its NDB 12174 dried-watermelon-kernel entry; the active reference still has no density or unit mappings. Add no recipe measure, density, conversion, or substitution from these sources.

## Source-to-claim map

Sources were accessed on **2026-10-11**. Retail pages support only the named listing and its vendor-stated claims; they are not botanical standards. Source IDs are local to this proposal and have not been appended to the shared research ledger.

| Source ID | Source and locator | Claim supported and limit |
| --- | --- | --- |
| `WP03-I-MELON-RETAIL-20261011-S01` | Office québécois de la langue française, [GDT: `melon d’eau`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26559125/melon-deau), preferred-term, English, and Latin-name fields. | Supports Québec terms `melon d’eau` / `pastèque`, English `watermelon`, and *Citrullus lanatus* for the plant/fruit. It does not define a seed product or the retail phrase “Egyptian melon seeds.” |
| `WP03-I-MELON-RETAIL-20261011-S02` | We Roast Nuts, [Roasted Super Melon Seeds (Salted)](https://www.weroastnuts.ca/products/roasted-salted-super-melon-seeds), product title, description, ingredient list, and package options. | Seller calls the seeds dry-roasted Egyptian watermelon seeds; ingredients are watermelon seeds and salt. Package options are listed. The page does not specify shell state and displayed a “notify me when available” state; no active stock, universal composition, or recipe measure is inferred. |
| `WP03-I-MELON-RETAIL-20261011-S03` | We Roast Nuts, Dollard-des-Ormeaux, [bilingual delivery menu](https://www.ubereats.com/ca-fr/store/we-roast-nuts/gTiNf5qCT0KyRxBA1busZw), “Graines et Grains / Seeds and Grain” entries and seller location. | Lists the local bilingual Egyptian/super-melon and Syrian-melon salted seed products. The Syrian description compares its seeds with pumpkin/sunflower seeds in the hull. It is a third-party menu with dynamic stock/fulfillment, and does not give a species for the Syrian item. |
| `WP03-I-MELON-RETAIL-20261011-S04` | Ameen Foods, [Melon Seeds / Char Maghaz](https://ameenfoods.ca/products/char-maghaz-200g), description, “How to use it,” ingredients, botanical names, plant-part, and sizes. | Supports one Canadian-listed four-species kernel blend and its vendor-specific soak-and-grind use. It does not establish a universal char-magaz formula or alias the blend to one ingredient. |
| `WP03-I-MELON-RETAIL-20261011-S05` | Nutly Foods, [Red melon seeds roasted salted](https://nutlyfoods.com/product/red-melon-seeds-roasted-salted/), ingredient list and shipping information. | Lists red melon seeds and salt for a Canadian-shipping salted roasted product. No species, cultivar, shell state, or equivalence to other melon-seed products is stated. |
| `WP03-I-MELON-RETAIL-20261011-S06` | National Research Council, [“8 Egusi,” *Lost Crops of Africa: Volume II: Vegetables*](https://www.nationalacademies.org/read/11763/chapter/10), pp. 155–161, “What is egusi?” and “Uses.” | Describes egusi as a regional seed name applied across multiple cucurbit species and distinguishes seed/kernel and processed uses. It supports preserving the existing regional identity; it does not make all watermelon or melon seeds egusi. |
| `WP03-I-MELON-RETAIL-20261011-S07` | USDA ARS, [Standard Reference Release 28, Food Group 12](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg12.pdf), NDB 12174, pp. 403–405. | Names `Seeds, watermelon seed kernels, dried`, records `63% Hard seed coat`, and lists 1 cup = 108 g / 1 oz = 28.35 g for that entry. These data remain source-specific and do not establish the shell state or measure for the salted retail snack. |

## Integration and holds

### Ready to integrate

- No catalog data. The local bilingual retail strings and the one seller’s char-magaz composition can be retained as source-scoped evidence if a later review or exact recipe request needs them.
- No shared-ledger update is part of this proposal-only packet. If those claims are recorded later, preserve their product/source qualifiers and unresolved identity states.

### Keep held

- `super melon seeds` / `Egyptian watermelon seeds`: seller’s product evidence is specific, but the shell/edible portion is unresolved, its local product page did not show current stock, and no bundled recipe requests it. Do not attach a `roasted_salted` form to `dried watermelon seed kernels` or create a generic watermelon-seed alias from one snack page.
- `Syrian melon seeds`: local French/English name and in-hull snack context are supported; crop species is not. Do not map to *Citrullus lanatus*, *Cucumis melo*, egusi, pumpkin, or sunflower.
- `red melon seeds`: keep held because a Canadian ingredient list does not identify the crop or shell state.
- `char magaz` / `char maghaz`: retain the Ameen four-kernel formula as one vendor’s product evidence; keep the unqualified market term held because other Canadian listings are incomplete or inconsistent and the corpus has no demand.
- `magaz` / `magaj`, broad `melon seeds`, `melon kernels`, and French `graines de melon`: preserve the prior held boundary; do not add aliases or forms.
- Measurements, density, mappings, recipe links, conversions, and substitutions: no exact recipe-linked evidence supports them in this corpus.

Keep the Section I checklist open for additional melon-seed products and regional kernels. Reopen one of these held candidates when a recipe line or a clearly specified package establishes the requested crop, edible part/shell state, and product process. Review Québec French naming separately from English trade labels.

## Validation notes

- Parsed the live manifest and every listed recipe file; all 114 paths were present. Counts and recipe-set fingerprint are recorded above.
- Checked current references, forms, legacy candidates, and ledger records for exact normalized product terms and likely phrase collisions. The seven packet source IDs were unused in the ledger.
- This packet changes only this proposal file. It adds no database data and ran no tests, consistent with the research-only scope and the repository rule for data-only work.
- The saved document was checked as UTF-8 without BOM, with a final newline and no known mojibake markers.
