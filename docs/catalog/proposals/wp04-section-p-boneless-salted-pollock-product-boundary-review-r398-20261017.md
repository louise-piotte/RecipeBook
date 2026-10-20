# WP04 Section P — boneless salted pollock product-boundary review (R398)

- **Review and source-access date:** 2026-10-17.
- **Candidate:** the bilingual Metro product titled `Boneless Salted Pollock` / `Goberge salée et désossé`, product number `773365154601`.
- **Recommendation:** Add one identity-only `PROTEIN` product reference, displayed as **`boneless salted pollock / goberge salée et désossée`**, with no aliases, forms, taxon, recipe links, or numeric runtime behavior.
- **Boundary:** This is a named salted-and-boneless market product, not a salted form of either active pollock species and not a generic salted-fish identity. The Metro package amount and ingredient declaration remain SKU-specific evidence.
- **Proposal-only status:** This file is the only changed file. No shared references, forms, legacy identities, ledger, recipes, plan, roadmap, or generated files were edited. No software tests or emulator checks were run.
- **Proposal-local IDs:** `WP04-SECTIONP-BONELESS-SALTED-POLLOCK-R398-20261017-S01` and `S02`, plus audit label `WP04-SECTIONP-BONELESS-SALTED-POLLOCK-R398-20261017-R01`. These are evidence labels in this proposal only. Reused source IDs are identified below.

## Why this is a distinct open product gap

The [Section P preserved-fish boundary checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L13004) keeps generic preservation identities and forms inactive without an exact product request, while retaining species- and product-specific identities. The live Section P work also remains open for specific seafood products.

The round-fifteen Atlantic-pollock integration added `ingredient-ref-atlantic-pollock` for *Pollachius virens* but deliberately left generic `pollock` and `goberge` unresolved. Its earlier finfish sweep cited Seafood Depot's separate English `Salted Pollock` product as *P. virens* evidence. That supplier page describes its own product as heavily salted and cured and offers bone-in or boneless options; it does not identify Metro's item number or establish a Québec display. The current Metro listing supplies a different, paired French/English consumer product title and a matching item number, so it supports a separate narrow product review rather than reopening the species decision. [prior source `WP04-P-NEXT-FINFISH-20261012-S04`; reused source `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S01`]

The existing crab-flavoured pollock-flakes identity is a distinct prepared product with a multi-ingredient declaration. It does not own salted pollock wording. R387's surimi-stick hold, R392's cooked mussel-meat addition, and R395's trout-roe addition cover different products and do not allocate this Metro item.

## Proposed identity and product/species boundary

Metro's English page lists Chelsea **Boneless Salted Pollock**, 454 g, product number `773365154601`, with ingredients `pollock, salt`; its French page gives the same number and package amount, title `Goberge salée et désossé`, and ingredients `goberge, sel`. The pages establish a paired bilingual retailer product name and product-specific ingredient declaration. They do not identify a scientific species or provide salt/moisture percentages. Metro reported the item out of stock in the retrieved English page; that is a location- and time-specific retail state, not an identity property. [S01–S02]

The proposed French display corrects feminine agreement from the retailer's `désossé` to `désossée`, matching feminine `goberge`. This is a normalized Québec French display derived from the paired retailer title; it is not an OQLF-approved technical term. Do not add the retailer's agreement error as an alias.

Do not assign the product to `ingredient-ref-atlantic-pollock` or `ingredient-ref-alaska-pollock`. CFIA's Fish List returns `Pollock` for both *Pollachius virens* and *Gadus chalcogrammus*; the Fish List also returns `Goberge` for Alaska pollock. OQLF scopes Québec/Canada `goberge` to *P. virens*, but the Metro ingredient line gives only the common word and no binomial. Those naming sources make a species inference from this item's title unsafe. [reused sources `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01` and `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S01`]

Keep the prior Seafood Depot product and the Metro product separate. Seafood Depot identifies its own `Salted Pollock` as *P. virens*, says it is heavily salted and cured, and offers bone-in or boneless fillet options. It is a different seller page with no matching Metro item number. Do not transfer its taxon, cure description, or selectable bone state to Metro's `773365154601` SKU. [prior source `WP04-P-NEXT-FINFISH-20261012-S04`]

CFIA treats cut/style, packing medium, and condition (including salted) as separate descriptors. Its regulatory salted-fish criteria refer to salt and moisture levels; the Metro listing exposes no percentages. The proposed row therefore preserves the retailer's product title without claiming a particular regulatory salting class, universal curing method, or level of deboning. [reused source `WP04-FBSUR-20261011-S13`]

## Live ownership and archive audit

Snapshot read from the current package before writing: **1,706 references**, **141 forms**, **56 legacy candidates**, and **2,066 ledger records / 9,336 source entries / 7,906 distinct source IDs / 6,625 distinct URLs**. The exact-key check mirrored `normalizeIngredientSearchKey` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) over reference names and aliases, form labels and match terms, legacy names and aliases, and ledger record IDs.

| Candidate key or neighboring identity | Current ownership and boundary |
|---|---|
| `boneless salted pollock`; `salted pollock`; `goberge salée et désossée`; retailer spelling `goberge salée et désossé`; `773365154601`; `ingredient-ref-boneless-salted-pollock` | No exact active reference, form, legacy, or ledger-record owner. The Metro URLs and proposed ID are absent from the ledger. |
| `ingredient-ref-alaska-pollock`; `ingredient-ref-atlantic-pollock` | Active species identities. Neither is assigned to the Metro SKU; keep their species scopes and existing names unchanged. |
| `ingredient-ref-crab-flavoured-pollock-flakes` | Active prepared flake product; its crab-flavour and multi-ingredient boundary remains separate. |
| `ingredient-ref-salt-cod`; `ingredient-ref-stockfish` | Existing salt-cod and unsalted-dried-fish product identities. Neither owns pollock wording or supplies a cross-product form. |
| Pollock forms and legacy candidates | No salted-pollock or boneless-pollock form/legacy owner was found. No generic salted form is attached to the two active pollock species. |
| Prior Atlantic-pollock work | R15's species identity and the October 12 finfish sweep remain intact. The sweep's Seafood Depot citation supports that seller's *P. virens* product only; it is not a Metro SKU or a French product-name allocation. |

The new R398 prefix was absent from the ledger and proposal/batch archive before drafting. The two Metro page URLs were absent from the ledger. The previous Seafood Depot source label is reused from the archived finfish sweep, not reissued as a new source ID. Exact phrase checks found no pre-existing owner for the proposed displays or ID. [R01]

## Picker projection

The projection follows the current bilingual name/alias search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete word-phrase matches win, and substring fallback runs only when no complete phrase matches. The counterfactual row has only the proposed displays and no aliases or forms.

| Query | Current result | With proposed row |
|---|---|---|
| `boneless salted pollock`; `salted pollock`; `goberge salée`; `goberge salée et désossée` | No result | The proposed product only |
| `pollock` | Alaska pollock; Atlantic pollock; crab-flavoured pollock flakes | The same three plus boneless salted pollock — four results |
| `goberge` | Alaska pollock; Atlantic pollock; crab-flavoured pollock flakes | The same three plus boneless salted pollock — four results |
| `salted` | Seven results | The same seven plus boneless salted pollock — eight results |
| `salée` | Charqui; salt cod | The same two plus boneless salted pollock — three results |
| `salt` | Twelve results, including salt and salt cod | The same twelve; the word `salted` does not match the whole word `salt` |
| `salt cod`; `morue salée` | Salt cod only | Unchanged; do not merge with the pollock product |

The broad `pollock` and `goberge` searches remain multi-result, but they gain one explicitly salted/boneless market-product result. The `salted` and `salée` queries also widen through the displays; no generic `salted fish`, `salted`, or `salée` alias is added. If the picker should suppress product-specific identities from these broad queries, that is a separate search-design question; this proposal exposes the projected result count for review.

## Bundled recipe demand

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows**. It checked full recipe JSON and ingredient rows for `boneless salted pollock`, `salted pollock`, both Metro French title spellings, the corrected French display, and item number `773365154601`. It found **zero matching recipe files and zero matching ingredient rows**. No recipe line, reference link, amount, preparation state, or method selects this product. [R01]

## Forms, measurements, and substitutions

- **Product state and forms:** Add no `IngredientForm` to either pollock species. `salted` and `boneless` remain descriptors within this one named product identity; they do not become global preserved-fish states or reusable fish-cut forms. The SKU's retailer wording does not prove a universal cure, salt level, pin-bone state, thawing state, or readiness.
- **Package amount:** The listing's **454 g** is one product-specific package amount. If preserved in a ledger source note, keep it tied to item `773365154601`; do not activate it as a serving, generic package size, household measure, conversion, density, or yield. No drained amount, soak/desalting direction, or edible portion is provided.
- **Other measures and conversions:** No volume measure, mass-volume relationship, per-piece weight, salt/moisture value, density, unit mapping, desalted yield, cooking yield, or package-to-recipe conversion is supported. Keep `defaultDensity` null and `unitMappings` empty.
- **Substitutions:** Add no global or contextual substitution and no recipe-line link. The sources provide no recipe-specific method, ratio, or outcome for replacing this named product with salt cod, stockfish, fresh/frozen pollock, either pollock species, crab-flavoured pollock flakes, or another fish. Shared common-name or salting language is not substitution evidence.

## Proposed reference and ledger disposition

If accepted, add only this identity row:

```json
{
  "id": "ingredient-ref-boneless-salted-pollock",
  "nameEn": "boneless salted pollock",
  "nameFr": "goberge salée et désossée",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "PROTEIN"
}
```

Use a matching `ingredient_reference` ledger record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Link the two Metro sources and the reused naming/labeling sources; do not add a species assignment, form, legacy mapping, recipe link, conversion, yield, or substitution finding. The 454 g listing may remain in SKU-specific source evidence, without an active measurement observation.

## Sources and access limits

Metro pages were accessed 2026-10-17. Retail listings, inventory, price, and package details can change; the product number is the paired-page identifier observed in this review.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-BONELESS-SALTED-POLLOCK-R398-20261017-S01** | Metro, [Chelsea Boneless Salted Pollock](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-seafood/lobster-crab-pollock/boneless-salted-pollock/p/773365154601), product `773365154601`, product title, ingredients, and displayed package amount. | Lists 454 g and ingredients `pollock, salt`; the retrieved page marked the selected item out of stock. No scientific species, salt/moisture percentages, preparation directions, or recipe measure is stated. |
| **WP04-SECTIONP-BONELESS-SALTED-POLLOCK-R398-20261017-S02** | Metro, [Goberge salée et désossé](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/homards-crabes-et-goberge/goberge-salee-et-desosse/p/773365154601), same product `773365154601`, product title, ingredients, and displayed package amount. | Lists 454 g and ingredients `goberge, sel`, supporting the paired Québec-facing product wording. The page gives no scientific species or quantitative salt/moisture statement. Its title uses masculine `désossé`; the proposed display normalizes the agreement to feminine `désossée`. |
| **Reused `WP04-P-NEXT-FINFISH-20261012-S04`** | Seafood Depot, [Salted Pollock](https://www.seafooddepot.ca/product-saltedpollock2). | The archived review and current product page describe a separate seller's *P. virens* product as heavily salted/cured and available bone-in or boneless. It is not matched to Metro by product number; do not transfer its species or process to Metro's product. |
| **Reused `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01`** | CFIA, [Fish List pollock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Pollock). | Lists `Pollock` for *P. virens* and *G. chalcogrammus* and includes `Goberge` among Alaska-pollock names. Supports the species ambiguity; does not identify the Metro package. |
| **Reused `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S01`** | OQLF, [goberge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198637/goberge). | Gives Québec/Canada `goberge`, English `pollock` / `Atlantic pollock`, and *P. virens*. Terminology evidence; it does not assign the Metro package's species. |
| **Reused `WP04-FBSUR-20261011-S13`** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), “Descriptive words about the true nature of fish products” and “Salted fish.” | Separates cut/style, packing medium, and condition descriptors and gives quantitative salted-fish criteria. This proposal uses it to avoid inferring a salt class from an ingredient list with no percentages; it makes no CFIA compliance assessment of the Metro listing. |

## Static audit record

**R01 — live package, exact ownership, picker projection, and recipe scan.** Counts were recomputed from the current worktree. Exact phrase/ID ownership was checked across active reference names/aliases, form labels/match terms, legacy names/aliases, and ledger record IDs. The proposed R398 prefix and Metro URLs were checked against the ledger and prior proposal/batch Markdown. The picker projection mirrors the current Kotlin search normalization and phrase-first/fallback behavior. The scan covered the complete manifest-ordered recipe package. This proposal adds no shared ledger IDs or source entries.

## Final disposition

**Advance** the bilingual named product as one identity-only `PROTEIN` result, while keeping its salt state, deboned wording, package mass, and ingredients as product/SKU evidence. Do not attach the product to Atlantic or Alaska pollock, encode salted/boneless as species-wide forms, generalize to preserved fish, or infer recipe behavior. Section P remains open.
