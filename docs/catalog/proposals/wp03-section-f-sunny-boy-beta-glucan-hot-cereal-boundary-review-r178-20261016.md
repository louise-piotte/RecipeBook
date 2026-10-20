# WP03 Section F R178 — Sunny Boy Beta-glucan Hot Cereal boundary review (2026-10-16)

## Review record

- **Status:** Proposal only. No catalog, ledger, plan, roadmap, batch, recipe, or application data changed.
- **Open checklist:** Section F still calls for review of regionally significant cereal mixes and preprocessed grains ([plan, line 3503](../../RecipeBook-global-ingredient-catalog-plan.txt#L3512)). This review covers only the manufacturer's separately named Sunny Boy Beta-glucan Hot Cereal.
- **Recommendation:** Keep this candidate out of the active catalog and ledger pending a Québec-facing French product name and a clearer current product specification. Existing sources establish that Sunny Boy Foods lists a distinct Beta-glucan Hot Cereal and a Canadian retailer lists a 600 g item, but no reviewed current Québec product label attests its French title or confirms the product's full ingredient declaration. Do not fill that gap by translating the English title and presenting it as established local wording.
- **Exclusions:** This does not reopen R175's Red River Cream of Whole Wheat hold, R176's Bistro Express brown-rice pouch review, or R177's wild-rice forms. It also does not reopen the integrated Sunny Boy Original cereal identity or treat this product as an alias of it.

## Candidate and product boundary

Sunny Boy Foods' current product page lists **Sunny Boy Beta-glucan Hot Cereal** separately from **Sunny Boy Original Hot Cereal**, **Organic Sunny Boy Hot Cereal**, and Sunny Boy muesli. It describes the beta-glucan product as made with barley, rye, and flax and mentions barley beta-glucan [existing S01]. A current Voilà listing separately names **Sunny Boy Beta Glucan Hot Cereal**, package size 600 g, and gives preparation directions [S02]. This is enough to retain a distinct research candidate under Section F; the shared brand and hot-cereal use do not make it equivalent to the integrated Original cereal.

The manufacturer's description is not a complete ingredient declaration or milling specification. It does not state the grain proportions, particle sizes, or whether the beta-glucan ingredient is added as a separate component or is intrinsic to the described grain blend. The retailer provides a serving nutrition panel and cooking directions, but its accessible English listing does not supply a Québec French label or a full French product name. Do not infer that the product is identical to Sunny Boy Original, whose listed grains differ, or to a barley product merely because barley is a named component.

## Naming and disposition

| Candidate wording | Evidence and disposition |
|---|---|
| `Sunny Boy Beta-glucan Hot Cereal` | Current manufacturer product heading; retain as research wording. The retailer uses the spelling `Beta Glucan` without a hyphen. Neither exact wording should be added as an active alias while the product remains on hold. |
| `céréales chaudes Sunny Boy au bêta-glucane` or other French constructions | No reviewed source attests these as the product's Québec French title. Do not make one the active display or alias by translating the English listing. |
| `bêta-glucane` | OQLF records this as the preferred French term in its malting entry and gives English `beta-glucan` [S03]. This supports the lexical item only; it does not attest a food-product name or hot-cereal phrase. |
| `céréales Sunny Boy` | Existing active `ingredient-ref-sunny-boy-cereal` display for the Original cereal, supported by historical Québec wording. Do not reuse it as the beta-glucan product's French name or add it as an alias here. |

The recommended hold does not allocate an ingredient ID, reference, alias, form, or ledger candidate. A future review can reconsider the product if a bilingual package, manufacturer French page, or current Québec retailer listing supplies the French product wording and confirms the marketed item.

## Ownership and archive audit

The read-only live snapshot contains **1,553 ingredient references, 122 forms, 61 legacy candidates, and 1,898 research-ledger records**.

| Surface | Current owner or hit | R178 result |
|---|---|---|
| Exact active identity | `ingredient-ref-sunny-boy-cereal` owns `Sunny Boy cereal / céréales Sunny Boy`; its English alias is `Sunny Boy Original Hot Cereal`. No active reference owns the exact Beta-glucan title. | Preserve the Original identity; do not fold a separately listed product into it. No new reference is allocated. |
| Forms and aliases | No ingredient form has Sunny Boy or beta-glucan wording. Existing Sunny Boy Original has no forms and no French alias for the beta-glucan product. | Add no forms, aliases, or matcher terms. |
| Legacy candidates | The 61 legacy candidates contain no exact Beta-glucan Hot Cereal candidate. | No legacy ID is mapped or reserved. |
| Research ledger | The Original cereal ledger record already cites Sunny Boy Foods' `/products` page as `WP03-SUNNYBOY-20261012-S01`; that record notes Beta-glucan Hot Cereal as a separate product. No dedicated Beta-glucan record or source URL for the Voilà listing was found. | Reuse the existing manufacturer source ID and URL; do not duplicate it. No new ledger record is proposed while the candidate is held. |
| Proposal and batch archive | The focused Original Sunny Boy proposal and integration README name Beta-glucan Hot Cereal only as a neighboring product excluded from the Original identity. No focused Beta-glucan product decision or hold was found. | This is the first focused review of that separate candidate. It does not reopen the Original cereal decision. |
| Source IDs and URLs | `WP03-SUNNYBOY-20261012-S01` and `https://sunnyboyfoods.com/products` are already owned by the Original cereal record. The Voilà SKU URL and OQLF beta-glucane URL were not found in ledger sources. | Reuse the manufacturer source record. IDs below for the Voilà evidence, OQLF lexical evidence, and project audit are proposal-local and unallocated. |

### Picker projection

The active picker folds case, accents, punctuation, and spacing, searches complete phrases across reference and form terms, and falls back to partial matching when no full phrase matches ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). The candidate terms do not currently have an exact owner.

| Query | Current result | If a separate identity were added later |
|---|---|---|
| `Sunny Boy cereal` / `céréales Sunny Boy` | `ingredient-ref-sunny-boy-cereal` | Keep the existing Original result. Do not use these unqualified terms as Beta-glucan aliases. |
| `Sunny Boy Beta-Glucan Hot Cereal` / normalized spelling without hyphen | No exact result | Could identify a separate product row, subject to future source-backed bilingual naming. |
| `beta glucan` / `bêta-glucane` | No Sunny Boy product-specific exact owner; results depend on broader catalog terms. | Do not add a bare functional-ingredient alias that obscures product scope. |
| `hot cereal` / `céréales chaudes` | Multiple existing cereal results | A future row would add one product to broad cereal results; no broad alias is recommended. |

The final column is a static projection, not a runtime picker result. Since this proposal recommends a hold, current picker behavior remains unchanged.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were searched for Sunny Boy Beta-glucan title spellings, `beta glucan` / `bêta-glucane` cereal phrases, and the candidate concept. Results:

| Audit result | Count |
|---|---:|
| Recipe files with a candidate phrase | 0 / 114 |
| Matching structured ingredient rows | 0 / 1,123 |
| Direct links to a candidate identity | 0 |

The corpus provides no demand signal. No recipe link or text change is proposed.

## Numeric and preparation boundaries

| Source observation | Source context | Catalog boundary |
|---|---|---|
| Package size: 600 g | Voilà retailer listing for the named product [S02]. | Product package information only; not a recipe quantity or serving. |
| Preparation: 1/4 cup cereal with 1/2 cup water; microwave about 2 minutes or stovetop about 2 minutes, then stand 1 minute | Voilà's item-specific directions [S02]. | Do not infer that `1/4 cup = 40 g`; the accessible page gives its nutrition panel per 40 g separately and does not explicitly equate that mass with the volume instruction. Do not use this SKU's ratio or timing as a generic cereal conversion or yield. |
| Nutrition panel: per 40 g | Voilà listing [S02]. | A source-specific nutrition basis, not an active measure, density, or unit mapping. |
| Manufacturer beta-glucan amount and health statements | Sunny Boy Foods product description [existing S01]. | Do not turn product claims into a catalog measure, nutrition recommendation, or health claim. This review does not assess the claims. |

No active `defaultDensity`, form density, unit mapping, conversion, portion, cooking yield, or package yield is proposed. Keep all numeric observations source-qualified if a later identity review elects to record them.

## Substitution boundary

The sources provide no tested exchange amount or supported substitute. The product's named grains do not establish replacement by Sunny Boy Original, Red River cereal, barley cereal, or their component grains; the full blend proportions and particle sizes are not given. Add no global or contextual substitution rule, and do not mark another hot cereal as interchangeable based on breakfast use alone.

## Source register

Sources checked 2026-10-16. **Existing S01 is reused, not reissued.** The remaining IDs are proposal-local and do not allocate records in the shared ledger.

| Source ID | Source and locator | Supports / does not support |
|---|---|---|
| `WP03-SUNNYBOY-20261012-S01` (existing) | Sunny Boy Foods, [Products](https://sunnyboyfoods.com/products), heading “Sunny Boy Beta-glucan Hot Cereal.” | Manufacturer identifies this as a separate product and describes barley, rye, and flax and barley beta-glucan. The shared page is already registered on the Original Sunny Boy ledger record. It does not provide a complete product ingredient list, formula proportions, particle sizes, or French title. |
| `WP03-SUNNYBOY-BG-R178-20261016-S01` | Voilà, [Sunny Boy Beta Glucan Hot Cereal 600 g](https://voila.ca/products/sunny-boy-beta-glucan-hot-cereal-600-g/448431EA). | Current Canadian grocery listing provides the English item title, 600 g package size, product-specific directions, and a 40 g nutrition basis. It is not a Québec French title or a full ingredient declaration; delivery availability is location-dependent. |
| `WP03-SUNNYBOY-BG-R178-20261016-S02` | Office québécois de la langue française, [GDT: bêta-glucane](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088626/beta-glucane). | Supports the French lexical term `bêta-glucane` and English `beta-glucan` in a malting entry. It does not establish a cereal product name or the proposed compound. |
| `WP03-SUNNYBOY-BG-R178-20261016-A01` | Project audit: current reference/form data, legacy candidates, ledger record/source IDs/URLs, archive, picker implementation, and manifest-listed recipes. | Read-only ownership, source-collision, picker, archive, and corpus audit. |

## Disposition

Keep Sunny Boy Beta-glucan Hot Cereal outside the active catalog and ledger for now. The English product boundary has enough evidence to preserve as a distinct research lead, but the current review did not find a Québec-facing French product title or complete current ingredient declaration. Do not synthesize an active French name from the OQLF lexical entry. Make no catalog or ledger change; no measures, forms, conversions, yields, recipe links, or substitutions are supported by this evidence.

## Integration outcome (R178)

Root accepted an identity-only `GRAIN_AND_CEREAL` row despite the proposal's hold recommendation. The manufacturer and current Canadian grocery listing separately identify Sunny Boy Beta-glucan Hot Cereal from Sunny Boy Original. The French display `céréales chaudes Sunny Boy au bêta-glucane` is a provisional descriptive translation using OQLF's lexical term; it is not presented as a source-attested package title. The new ledger record reuses the manufacturer's existing source ID and records the Voilà and OQLF evidence. No aliases, forms, active measures, recipe links, conversions, yields, or substitutions were added.
