# WP04 Section P — kipper / hareng kipper product boundary (R154)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** the Québec seafood product terms `kipper`, `kippered herring`, and `hareng kipper`.
- **Recommendation:** **Hold** the candidate outside active references, forms, legacy mappings, and the research ledger. Do not attach `kipper` or `kippered herring` to either active herring species.
- **Scope:** one herring product-name and product-state boundary. This review does not reopen Atlantic or Pacific herring identity, herring rollmops, smoked haddock, or generic preserved-fish forms.
- **Proposal-only status:** this file is the only proposed artifact. No shared catalog, ledger, manifest, recipe, plan, roadmap, or generated file was changed. No tests, emulator, app, or deployment work was run.
- **Proposal-local source IDs:** `WP04-SECTIONP-KIPPER-R154-20261015-S01` through `S05`, plus audit ID `WP04-SECTIONP-KIPPER-R154-20261015-R01`. They are not shared-ledger records.

## Why this is the next unfinished candidate

The [Section P fish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4942) and the [preserved-seafood checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5718) remain open. The earlier [Pacific-herring identity review](wp04-section-p-next-seafood-gap-review-20261012.md) explicitly kept `kipper` off the raw-fish species row; it did not decide whether a separate kipper product identity should exist. The broad [preserved-fish boundary review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) likewise held generic states without deciding this named product. The [herring-rollmops hold](wp04-section-p-herring-rollmops-product-boundary-review-20261013-round45.md) and the R149 [smoked-haddock identity review](wp04-section-p-smoked-haddock-product-identity-review-r149-20261015.md) concern different products. A repository-wide case-insensitive scan of Section P proposals and batch notes through R153 found only the Pacific-herring review's exclusion of `kipper` as a species-row alias/form; no dedicated kipper product review or integration was found.

The live package and ledger currently contain **1,524 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,869 ledger records / 7,907 source entries / 6,762 distinct source IDs**. The manifest lists **114 recipe files / 1,123 ingredient rows**. No active identity or ledger record is allocated for the candidate terms or `ingredient-ref-kipper`. The five proposed external-source IDs and audit ID above were absent from the live ledger and proposal/batch archive before this file was written. No ID is reserved because this is a hold.

## Naming and product boundary

OQLF's GDT defines a **kipper** as a fish product made from fatty herring split along the back and cold-smoked. It lists Québec French preferred terms `kipper`, `hareng kipper`, and `kipper de Newcastle`, with English terms `kipper`, `kippered herring`, `Newcastle kipper`, and `kipper herring`. The same entry cautions that in the United States `kippered` can refer to hot-smoked fish. The GDT entry was last updated in 1983; it is Québec terminology evidence, not a current manufacturing specification. [S01]

A Longueuil seafood distributor currently lists product code **PM-4199** under English title **Smoked Wild Kippered Herring** and French title **Hareng sauvage fumé**. The French description calls it `hareng kipper canadien fumé`. Its page names herring fillets, salt, and natural hardwood smoke; it does not provide a scientific species, say whether the fish is split along the back, or specify hot versus cold smoke. The listing reports Canadian origin, 180 g, and 12 units per case, but the site says it is not transactional and does not establish current retailer inventory. [S02–S03]

The product name is therefore recognizable in Québec and Canada, but the current Québec-facing SKU does not establish that its preparation matches every detail in OQLF's definition. A separate Canadian manufacturer's product page uses **Kippered** for sardine fillets, demonstrating that the preparation descriptor alone is not a synonym for herring. Keep `kippered` by itself out of aliases. [S04]

The bounded Canadian wording supports a product question, not a new species identity. Do not link the listing to Atlantic herring or Pacific herring: the distributor names no taxon, and a shared East Coast sourcing statement is not a species crosswalk. Do not add generic `smoked herring`, `hareng fumé`, `hareng sauvage fumé`, or sardine wording as aliases for kipper. The local French title is broader than the OQLF term; the description's `hareng kipper` supports that phrase for this SKU, not a global equivalence between all smoked herring and kippers.

## Exact ownership and identifier checks

The audit compared accent- and punctuation-normalized exact phrases across every bilingual active reference name and alias, every form label and match term, all legacy candidate names and aliases, ledger record IDs and terms, and the focused proposal/batch archive.

| Candidate key or ID | Current owner | Decision |
|---|---|---|
| `kipper`; `kippers`; `kippered herring`; `kipper herring`; `hareng kipper`; `kipper de Newcastle`; `Newcastle kipper` | None in active references, forms, legacy candidates, or ledger record IDs. | No existing row or form to reuse. `kippers` is not proposed as a plural alias. The Newcastle terms are OQLF-listed names but are not added as aliases under the hold. |
| `smoked wild kippered herring`; `hareng sauvage fumé`; `hareng kipper canadien fumé` | None as exact active reference, form, or legacy keys. | These are source-specific SKU phrases, not proposed global aliases. |
| `herring`; `hareng` | The active displays are `Atlantic herring / hareng de l’Atlantique` and `Pacific herring / hareng du Pacifique`. | Preserve both species rows and do not add the product as an alias to either one. |
| `ingredient-ref-kipper` | Absent from active references, forms, legacy candidates, and ledger record IDs. | Not allocated or reserved under the hold. |
| `WP04-SECTIONP-KIPPER-R154-20261015-S01`–`S05`; `…-R01` | No occurrence in the live ledger or proposal/batch archive before this proposal. | Proposal-local provenance only; do not copy into the shared ledger. |

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize accents and punctuation, prefer complete word phrases across bilingual names, aliases, and form terms, then use substring fallback only when there is no complete phrase.

| Query | Current results | After recommended hold | Counterfactual with one `kipper / kipper` row and the OQLF-listed English/French product terms as aliases |
|---|---|---|---|
| `kipper`; `kippered herring`; `hareng kipper` | None | None | One kipper product result. |
| `kipper de Newcastle`; `Newcastle kipper` | None | None | One kipper product result. |
| `herring`; `hareng` | Atlantic herring; Pacific herring | Same two results | Same two plus the kipper product, because its qualified product term includes herring/hareng. |
| `kippered` | None | None | The kipper product alone, even though a Canadian sardine product also uses the standalone descriptor `Kippered`. |
| `smoked herring`; `hareng sauvage fumé` | None | None | None; those broad source-title words are not among the hypothetical aliases. |

The actual projection under the hold is unchanged. The counterfactual shows that a dedicated row could make qualified product phrases searchable, but would also make bare `kippered` look unique and add a third option to broad herring searches. With no bundled recipe selecting the product and no exact preparation statement on the current Québec-facing SKU, keep the candidate out of the active picker for now.

## Bundled-recipe demand

The manifest-ordered audit parsed every one of the **114** recipe files and all **1,123** `ingredients[]` rows. It searched complete recipe JSON text and individual ingredient-row fields for `kipper`, `kippers`, `kippered`, `kippered herring`, `kipper herring`, `Newcastle kipper`, `kipper de Newcastle`, `hareng kipper`, `hareng kipper canadien fumé`, `hareng sauvage fumé`, `smoked herring`, and broad `herring` / `hareng` wording. **No matching recipe file or ingredient row was found.** No recipe link, relink, product role, or amount supports an active identity today. [R01]

The broad words `herring` and `hareng` also have no bundled ingredient demand. Existing salmon, tuna, crab, and fish-sauce recipe lines do not establish kipper demand or a product-state match.

## Forms, measures, density, conversions, yields, and substitutions

- **Forms:** Add none. The candidate itself would be a named finished product, not a universal smoked form on either raw-herring species. OQLF defines a cold-smoked split product, while the Longueuil distributor gives no smoke temperature or split preparation for PM-4199. Do not infer cold-smoked, hot-smoked, fillet, whole, salted, cooked, or ready-to-eat behavior for all products called kipper.
- **Measures:** The distributor's 180 g package and 12-unit case are SKU facts. Its `10 g protein per portion` statement gives no portion mass. Health Canada's 2008 common-food table lists **75 g** for `Herring, Atlantic, kippered`; that is a source-specific food-composition portion for a named Atlantic-herring entry, not a package or recipe measure and not a value for this species-unspecified SKU. Record no measurement observation while the identity remains held. [S02, S03, S05]
- **Density and mappings:** No density, household volume, piece count, or mass/volume mapping is supported. No reference row is added, so no `defaultDensity` or `unitMappings` change is proposed.
- **Conversions and yields:** No whole-to-fillet, raw-to-smoked, hot-to-cold-smoked, edible-yield, package-yield, or cooking-yield rule is supported. Do not derive one from package weight, case count, or the unrelated Health Canada table portion.
- **Substitutions:** No reviewed source or bundled recipe validates replacing kipper with plain Atlantic/Pacific herring, another smoked fish, or kippered sardines in an equal quantity. Add no global or contextual substitution, warning, recipe-line substitution link, or recipe link.

## Proposed reference and ledger delta

**No reference or ledger delta is proposed.** This hold allocates no `ingredient-ref-kipper` or other identity, adds no alias or form to the Atlantic/Pacific herring rows, and creates no candidate or source record in the shared ledger. The R154 source IDs are proposal-only provenance. No JSON block is applicable because the proposed data delta is empty.

## Source register

| Source ID | Source | Evidence and limitations |
|---|---|---|
| **WP04-SECTIONP-KIPPER-R154-20261015-S01** | OQLF, [GDT: kipper](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428368/kipper), last updated 1983; accessed 2026-10-15. | Defines the product as fatty herring split along the back and cold-smoked; lists Québec preferred French `kipper`, `hareng kipper`, and `kipper de Newcastle` and English `kipper`, `kippered herring`, `Newcastle kipper`, and `kipper herring`. Notes that U.S. `kippered` can describe hot-smoked fish. Terminology evidence, not a current Canadian product-process standard. |
| **WP04-SECTIONP-KIPPER-R154-20261015-S02** | A.C.E.M.A., [Wild Canadian Seafood — Smoked Wild Kippered Herring PM-4199](https://www.acema.ca/en/products/pm-4199), accessed 2026-10-15. | English page lists the product code, Canadian origin, 180 g format, 12 units per case, east-coast sourcing description, and ingredients `herring fillets, salt, natural hardwood smoke`. It does not identify species or hot/cold smoke; a package/case amount is not a kitchen measure. The distributor says its site is not transactional. |
| **WP04-SECTIONP-KIPPER-R154-20261015-S03** | A.C.E.M.A., [Hareng sauvage fumé PM-4199](https://www.acema.ca/fr/produits/pm-4199), accessed 2026-10-15. | French-language page for the same product code uses `Hareng sauvage fumé` as title and `hareng kipper canadien fumé` in the description; ingredients are filets de hareng, salt, and natural hardwood smoke. It supports Québec-facing product wording for one distributor SKU, not a standardized name or universal recipe product. |
| **WP04-SECTIONP-KIPPER-R154-20261015-S04** | Brunswick Canada, [Sardine Fillets Seafood Snacks — Kippered](https://brunswickcanada.ca/products/sardine-fillets-seafood-snacks-kippered/), accessed 2026-10-15. | Manufacturer page identifies sardine fillets, water, and natural smoke flavouring, with an 85 g drained-can nutrition basis. It demonstrates that `Kippered` can describe a sardine product; it does not make sardines an alias, form, or substitute for herring kippers. |
| **WP04-SECTIONP-KIPPER-R154-20261015-S05** | Health Canada, [Nutrient Value of Some Common Foods (2008)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/nutrient-value-some-common-foods-2008.html), Fish and Shellfish table, row `Herring, Atlantic, kippered`, accessed 2026-10-15. | Lists a 75 g portion for the Atlantic-herring food-composition entry. This is not a current package label, current SKU specification, cross-species serving standard, or active kitchen measure. |
| **WP04-SECTIONP-KIPPER-R154-20261015-R01** | [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), and manifest-listed recipe files; accessed 2026-10-15. | Static ownership, source-ID, picker, and corpus audit against 1,524 references, 119 forms, 61 legacy candidates, 1,869 ledger records / 7,907 source entries / 6,762 distinct source IDs, and 114 recipes / 1,123 ingredient rows. Repository snapshot only; it does not establish product availability beyond the sources above. |

## Final disposition

**Hold** the kipper product candidate outside active references, forms, legacy mappings, and the ledger. Keep the Atlantic/Pacific herring identities unchanged. Reopen when a bundled recipe or explicit user product request selects kipper and the target SKU or package clarifies whether the intended ingredient is a Québec-defined cold-smoked split kipper or another product marketed as kippered herring. Then recheck the alias set and broad `herring`/`hareng`/`kippered` picker behavior before deciding whether a standalone product identity is appropriate. This documentation-only hold required no tests under the project instructions.
