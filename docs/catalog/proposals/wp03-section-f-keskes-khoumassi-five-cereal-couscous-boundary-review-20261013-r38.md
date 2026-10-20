# WP03 Section F R38 — Keskes Khoumassi five-cereal couscous boundary review

- **Round:** R38, 2026-10-13.
- **Open checklist:** Section F still asks for regionally significant cereal mixes and preprocessed grains ([live plan, line 2462](../../RecipeBook-global-ingredient-catalog-plan.txt#L2555)).
- **Candidate:** Moroccan Saharan `Keskes Khoumassi` / `Keskes Moukhamess`, a dry, hand-agglomerated, cooked-and-dried five-cereal couscous covered by a protected geographic indication.
- **Status:** integrated as identity-only `ingredient-ref-keskes-khoumassi` in the active reference catalog. No forms, recipe links, density, unit mappings, yield, conversions, measurements, or substitutions were added.
- **Recommendation:** add one identity-only `GRAIN_AND_CEREAL` reference for the protected product, suggested ID `ingredient-ref-keskes-khoumassi`.
- **Proposed display:** English `Keskes Khoumassi (five-cereal couscous)`; French `couscous Khoumassi (cinq céréales)`.
- **Alias boundary:** add only the legal alternate GI name `Keskes Moukhamess` as a French alias. Do not add bare `Khoumassi`, `couscous multi-céréales`, `couscous tri-céréales`, `five-grain couscous`, or `awerkis/aouerkis` as aliases. Marketplace listings use Khoumassi and cereal-count wording inconsistently, so keep the protected GI and its specification visible.
- **Limits:** no forms, recipe links, density, unit mappings, yield, conversions, measurements, or substitutions. Keep the wider Section F item open.

## Why this is a distinct open item

Before integration, exact candidate-term searches found no prior proposal or active owner in the plan, proposal/batch archive, reference catalog, forms, legacy identities, research ledger, or bundled recipes. The live catalog has distinct generic couscous, pearl couscous, barley couscous, millet couscous, and Baddaz identities. Baddaz is a separate Moroccan maize-semolina couscous; it does not cover a protected five-cereal product. Existing cereal identities such as Red River 7 Grain hot cereal, multigrain flakes, wild-rice blend, granola, and muesli are also separate products. This review does not reopen Ogi Baba, Fura, Tom Brown, Hausa Koko flour, Baddaz, Puttu podi, rice grits, foxtail millet rava, or any earlier cereal-mix review.

The source-backed scope is the Moroccan GI whose legal name is `Keskes Khoumassi` or `Keskes Moukhamess`. The Moroccan ONSSA GI register lists both names and the 2018 amendment to the 2013 recognition [S01]. The underlying official specification defines this product as five flours agglomerated by hand with potable water, then cooked and dried [S02]. A current Moroccan government marketplace page lists a `Keskes Khoumassi` product made from barley, roasted barley, durum wheat, soft wheat, and roasted maize [S03]. A current English-language tourism page managed by the Assa-Zag Provincial Tourism Council calls it `couscous khoumassi` and describes five types of grain [S04]. These sources support an English gloss and a French display that preserves the product name. No Québec-specific product label was found; the French wording is a source-grounded French display, not an OQLF ruling.

The identity is narrower than every item marketed as `Khoumassi`. One government-marketplace listing calls a product “tri-céréales” while also describing five cereal flours [S05], and other sellers use variable “Khoumassi” recipes. The reviewed legal GI specification gives an exact five-cereal composition. Keep generic or differently formulated products outside this reference unless their own declarations establish the same GI identity.

## Exact ownership and picker effects

At the pre-integration static audit, the bundled package contained **1,366 active references**, **100 forms**, **64 legacy-import candidates**, and the research ledger contained **1,699 records**. Before integration, exact normalized searches for `Keskes`, `Khoumassi`, `Khomassi`, `Moukhamess`, `couscous Khoumassi`, and five-cereal couscous found no candidate owner or prior decision in those data or the proposal/batch archive. The source-ID prefix `WP03-KHOUMASSI-R38-20261013-` was unused.

| Current owner | Scope and boundary |
|---|---|
| `ingredient-ref-keskes-khoumassi` | Identity-only `couscous Khoumassi (cinq céréales) / Keskes Khoumassi (five-cereal couscous)`, with French alias `Keskes Moukhamess`; no forms or numeric data. Before integration, no exact reference, form, legacy identity, ledger record, recipe line, or earlier proposal owned it. |
| `ingredient-ref-couscous` | Generic `couscous / couscous`; no aliases, forms, density, or unit mappings. It remains the generic product owner. |
| `ingredient-ref-pearl-couscous` | `pearl couscous / couscous perlé`; no forms or numeric data. |
| `ingredient-ref-barley-couscous` | `barley couscous / couscous d'orge`, alias `belboula`; no forms or numeric data. |
| `ingredient-ref-millet-couscous-thiere` | `millet couscous (thiéré) / couscous de mil (thiéré)`, alias `tyere`; no forms or numeric data. |
| `ingredient-ref-baddaz-corn-couscous` | `Baddaz (Moroccan corn couscous) / Baddaz (couscous de maïs marocain)`; no aliases, forms, or numeric data. This is the separate maize-only identity. |
| Integrated cereal products | Red River 7 Grain hot cereal, multigrain flakes, wild-rice blend, granola, and muesli retain their existing distinct owners. None is a dry five-cereal couscous GI. |

The search projection follows bilingual names and aliases, attached form terms, phrase-first matching, and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Counts below show the pre-integration reference/form snapshot versus the integrated bilingual names and legal alternate GI alias:

| Query | Before integration | After integration | Effect |
|---|---:|---:|---|
| `Khoumassi` | 0 | 1 | Direct regional product search. |
| `Keskes Moukhamess` | 0 | 1 | Resolves the legal alternate GI name. |
| `couscous Khoumassi` | 0 | 1 | French product-name phrase match. |
| `five-cereal couscous` | 0 | 1 | Qualified English display phrase match. |
| `couscous` | 5 | 6 | Adds one visibly qualified regional couscous alongside generic, pearl, barley, millet, and Baddaz results. |
| `couscous multi-céréales` | 0 | 0 | Deliberately remains unaliased because it is broader than this protected product. |

## Recipe-demand audit

All **114** manifest recipe files and **1,123** ingredient rows were scanned for normalized spellings and phrases including `Keskes`, `Khoumassi`, `Khomassi`, `Moukhamess`, `couscous Khoumassi`, `couscous multi-céréales`, `five-grain couscous`, and `couscous five cereals`.

- Candidate-specific recipe files: **0**.
- Candidate-specific ingredient rows: **0**.
- Recipe lines linked to a Khoumassi reference: **0**.
- One recipe has general couscous prose; it does not name or require Khoumassi.

Current regional tourism and product listings establish cuisine use and retail availability, but there is no bundled recipe demand to attach to this identity.

## Forms, measurements, and substitutions

- **Forms:** add none. The identity itself is the GI couscous product. The decree's cooking and drying steps describe its manufacture; they do not establish a reusable cooked/dry form crosswalk for recipes.
- **Composition numbers:** the GI specification assigns flour ranges of soft wheat **30–35%**, durum wheat **20–25%**, barley **20–25%**, roasted barley **10–17%**, and roasted maize **1–3%** [S02]. These are formula-bound identity evidence, not active ingredient measurements or substitution ratios.
- **Other technical figures:** the specification's hydration, swelling, moisture, ash, protein, and fat limits are product-quality criteria. Do not use them as recipe timings, household quantities, density, cooking yield, or conversions.
- **Package sizes:** listed retail packs (including 1 kg) are packaging evidence, not portions or unit mappings.
- **Density and household measures:** leave `defaultDensity` null and `unitMappings` empty. No exact-form mass-volume observation or verified household measure was found.
- **Substitutions:** add no global or contextual rule. Shared couscous use does not establish a safe ratio or equivalent cooking behavior for generic wheat, pearl, barley, millet, Baddaz, or other cereal blends.

## Source register

Online checks were made on 2026-10-13. Source IDs use the prechecked prefix `WP03-KHOUMASSI-R38-20261013-`; no shared ledger source or status was added.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-KHOUMASSI-R38-20261013-S01` | Moroccan National Office for Food Safety (ONSSA), [Indications géographiques register](https://www.onssa.gov.ma/reglementation/reglementation-connexe/signes-distinctifs-dorigine-et-de-qualite/indications-geographiques/). | Current register lists the 2013 recognition of GI `Keskes Khoumassi` or `Keskes Moukhamess` and the 2018 amendment. It supports protected identity and spelling, not unqualified use of either name for non-GI products. |
| `WP03-KHOUMASSI-R38-20261013-S02` | Moroccan official gazette, [Order No. 1353-13 and the GI specification](https://www.wipo.int/wipolex/fr/text/580715), indexed by WIPO Lex; see Articles 4–5 in the linked official text. | Defines the five cereal ingredients, their flour percentage ranges, manual agglomeration with potable water, cooking and drying, product criteria, and geographic/production rules. These are GI specifications; the percentages are not household substitutions or recipe conversions. The 2018 ONSSA amendment [updates Articles 6–7](https://www.onssa.gov.ma/wp-content/uploads/2022/11/ARR.3582-18.FR_.pdf); it identifies the continuing 2013 specification and does not replace its composition evidence. |
| `WP03-KHOUMASSI-R38-20261013-S03` | Terroir du Maroc, [Keskes Khoumassi 1 kg](https://terroirdumaroc.gov.ma/fr_ma/catalog/product/view/_ignore_category/1/id/661/s/keskes-khoumassi-1-kg/), current cooperative marketplace listing. | Current product title and listing use `Keskes Khoumassi`, describe the five cereals as barley, roasted barley, durum wheat, soft wheat, and roasted maize, and show a 1 kg retail pack. The listing does not itself show a GI certificate; packaging is not a recipe measure. |
| `WP03-KHOUMASSI-R38-20261013-S04` | Visit Assa-Zag, Provincial Tourism Council, [Savor Local Cuisine](https://visitassazag.ma/en/activities/savor-local-cuisine/). | Current English page calls it `couscous khoumassi`, describes five types of grain, hand processing by women, and regional serving with vegetables or meat. Supports the English gloss and regional demand, not a Canadian label or recipe ratio. |
| `WP03-KHOUMASSI-R38-20261013-S05` | Terroir du Maroc, [Couscous Khoumassi 500 g](https://terroirdumaroc.gov.ma/fr_ma/catalog/product/view/id/1014/category/2/), current Al Ismailia cooperative listing. | Uses `Couscous Khoumassi` and describes five flours while also calling it “tri-céréales.” This inconsistency supports keeping generic cereal-count labels out of aliases; it is not evidence to override the GI specification. The listing does not establish that this pack is certified to the GI. |

## Next action

The integration adds only the protected GI identity with the proposed bilingual display and legal `Keskes Moukhamess` synonym. Keep generic multi-cereal product variants unassigned until a product label or specification proves which formula and scope they represent. Leave the Section F checklist open. The change only adds database JSON data, so no tests are required under `AGENTS.md`; static catalog and package checks are recorded in the integration batch README.
