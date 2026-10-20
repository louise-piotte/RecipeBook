# WP05 Section Y R317: kewra-water identity integration

Added identity-only `kewra water / eau de kewra` as `ingredient-ref-kewra-water` in `BAKING_AND_SPICE`, with English spelling aliases `keora water` and `kewda water`. No French aliases are added. The French display is supported by a Canadian French-language food-product page; it is not represented as an OQLF or TERMIUM preferred term.

Health Canada defines kewra water as an extract obtained from *Pandanus odoratissimus* flowers by steam distillation. The determination concerns novelty status only and is not a safety assessment or blanket product approval. Current Canadian product wording supports the exact `keora water` and `kewda water` spelling aliases. A Montréal-area distributor lists `Specialty Kewda Water`; the page was accessible only through its indexed category text. The French Canadian `Eau de Kewra` page was marked out of stock at access, so it supports wording only.

Kept `kewra essence` outside the water aliases because an Ontario retailer lists a separate SAC essence product alongside Dabur Kewra Water without establishing a common formula or equivalence. The identity is also separate from pandan leaves and McCormick Pandan Flavor, rose water, orange blossom water, and cosmetic hydrosols. The older India Aroma Oils page’s specific-gravity number is not carried forward: its title and detailed text conflict between water and absolute oil. No density, measure, unit mapping, form, conversion, yield, recipe link, or substitution is added.

The live picker has no prior kewra-family owner; the proposed exact names and aliases resolve to this identity. Existing rose-water and orange-blossom-water exact queries retain their owners, and `pandan` remains shared by pandan leaves and McCormick Pandan Flavor. The full manifest scan found **0 matching terms** in **114 recipe files** / **1,123 ingredient rows**; no line was changed.

## Review records

- [R317 proposal and source review](../../proposals/wp05-section-y-kewra-water-identity-review-r317-20261016.md)
- [Research-ledger record](../../research-ledger.v1.json)
- WP05 Section Y checklist: `docs/RecipeBook-global-ingredient-catalog-plan.txt`

## Static validation

Static validation passed for package structure/schema, reference normalization, generated-catalog freshness, ledger schema and new source-ID ownership, exact picker ownership, recipe corpus, UTF-8 without BOM, relative links, and scoped whitespace. The integrated package contains **1,674 references**, **127 forms**, **2,021 ledger records**, **8,974 source-entry occurrences**, and **7,609 distinct source IDs**; there are **6,358 distinct source URLs**, **114 recipes**, and **1,123 ingredient rows**. No app tests, Gradle tasks, emulator checks, or deployment were run because this change only adds database JSON data and documentation under `AGENTS.md`.
