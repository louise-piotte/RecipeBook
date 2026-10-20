# WP02 Section 04 B3 R120 — chickpea-starch product-boundary hold

- **Reviewed:** 2026-10-14.
- **Status:** Integrated by root on 2026-10-14 as a documentation-only hold; no active catalog or ledger data was added.
- **Open plan item:** Section 04 B3, line 2209: “Water-chestnut flour and other documented regional starches.”
- **Scope:** Starch isolated from chickpea (*Cicer arietinum*) seed, kept separate from whole-seed chickpea flour and dry-fractionated starch-rich chickpea flour.
- **Proposal-local source-ID prefix:** `WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014`; checked against the current ledger and proposal/batch archive with no collision found.

## Recommendation

**Hold an active chickpea-starch reference and its aliases until a current Canadian or Québec human-food source documents a standalone isolated-starch product and its local product wording.** Food-science research supports isolated chickpea starch as a distinct material, and a current international supplier offers it as a food-grade ingredient separate from chickpea flour. Canadian sources also show why the product boundary matters: an Alberta pulse-fractionation project describes *starch-rich flour* from chickpea among its target ingredients, not isolated starch. A Canadian trademark goods statement names chickpea starch for food-industry use, but it records intended goods, not a current sale or product specification. [S02–S06]

The candidate’s English research/product phrase is `chickpea starch`. The descriptive French construction `amidon de pois chiche` follows the current Canadian common-name pattern and OQLF’s base term; a Canadian trademark notice also uses that phrase. None of those sources is a current Québec consumer or ingredient-product label for isolated chickpea starch. Keep `amidon de pois chiche` as a provisional construction pending that product evidence and independent Québec review. Use `amidon`, not `fécule`: OQLF reserves the latter for starch in tubers or other underground organs. [S01–S04]

If later accepted, define the identity narrowly as the isolated starch fraction from *C. arietinum* seed. Keep it distinct from chickpea flour made from whole milled seeds; from starch-rich chickpea flour made by dry fractionation; from chickpea protein/fiber ingredients; and from pea, lentil, fava-bean, and mung-bean starches. Do not infer that an ingredient line saying `chickpea flour`, `starch-rich flour`, or generic `pulse starch` names isolated chickpea starch. No candidate row, alias, form, measurement, density, unit mapping, recipe link, conversion, yield, or substitution is proposed now.

## Evidence and market boundary

- A Canadian research team isolated starch from Canadian-grown chickpea cultivars and characterized it separately from pea and lentil starch. The study establishes a material identity, not retail availability, a kitchen use, or a Québec product name. [S05]
- Green Boy Group’s current food-ingredient portfolio lists `Chickpea Starch` under starches and `Chickpea Flour` separately under flours. This is useful supplier evidence for the isolated-starch versus flour boundary, but the page describes worldwide sourcing and does not establish Canadian distribution or a Canadian product. [S06]
- Agriculture and Agri-Food Canada’s 2025–2027 project record describes dry fractionation of chickpea, lentil, yellow pea, and faba bean to produce protein concentrates and **starch-rich flour** for human food. It states that the project is validating commercial viability; it does not identify an isolated chickpea-starch output. [S08]
- Phytokana Ingredients’ current Alberta-facing ingredient page identifies its market-facing product as `Starch-Rich Faba Flour`; the company’s current page does not list isolated chickpea starch. This is a bounded portfolio observation, not proof that no Canadian supplier offers the candidate. [S09]
- A current Canadian Food Inspection Agency incorporated common-name table specifies “the name of the plant plus ‘starch’” in English and `amidon de` followed by the plant name in French. OQLF’s current entries give the Québec base term `pois chiche` for *Cicer arietinum* and prefer `amidon` generally. These sources support the transparent constructions `chickpea starch` and `amidon de pois chiche`; they do not establish a standalone retail name. [S01–S03]
- A Canadian Intellectual Property Office record for Alberta applicant Phytokana Ingredients Inc. lists `chickpea starch` among plant starch ingredients for the food industry. The related French Canadian trademark notice uses `amidon de pois chiche`. The record was approved by CIPO in September 2026, but is still a trademark goods declaration, not evidence that the named ingredient is currently sold. [S04]
- Current Canadian retail/product evidence reviewed for chickpea flour uses flour wording. Metro lists `Super Fine Chickpea Flour`; Canadian-made Covered Bridge chickpea chips declare `farine de pois chiche` and `amidon de pomme de terre` as separate ingredients. These products support the flour/starch distinction and local French wording for flour, not the sale of isolated chickpea starch. [S10, S11]

Targeted searches on 2026-10-14 used `chickpea starch`, `Cicer arietinum starch`, `amidon de pois chiche`, and Canadian/Québec product, supplier, and retail terms. They surfaced the global supplier, Canadian research and project sources, a Canadian trademark goods declaration, and Canadian chickpea-flour products; they did not surface a current Canadian/Québec retail or ingredient-supplier listing for isolated chickpea starch. This is a bounded search result, not proof that no such product exists.

## Current ownership and picker boundaries

No exact owner for the candidate English or French product phrase appears in the active references, forms, legacy candidates, or ledger. A focused search of prior proposals and batches found no earlier chickpea-starch review. Current chickpea coverage is for whole seeds and flour products, including `ingredient-ref-chickpeas`, `ingredient-ref-black-chickpeas`, `ingredient-ref-desi-chickpeas`, `ingredient-ref-kabuli-chickpeas`, `ingredient-ref-chickpea-flour`, `ingredient-ref-desi-chickpea-flour`, and `ingredient-ref-chana-sattu`. No exact `chickpea starch` identity exists in those rows.

The picker code normalizes case, accents, punctuation, and spacing; it prefers complete word-phrase matches, then falls back to substring matching. I projected the current reference and attached-form terms through that logic:

| Query | Current result | Boundary decision |
|---|---|---|
| `chickpea starch`, `Cicer arietinum starch`, `starch from chickpeas` | No result | Do not add a phrase or alias until isolated-starch identity and product naming are accepted. |
| `amidon de pois chiche`, `fécule de pois chiche` | No result | Keep the first as a provisional description; do not use `fécule` for a seed starch. |
| `chickpea flour` | `ingredient-ref-chickpea-flour`, `ingredient-ref-desi-chickpea-flour`, and `ingredient-ref-chana-sattu` | Preserve current flour choices; do not merge or alias starch to any of these. |
| `chickpea` | Six results for black chickpeas, chana sattu, generic chickpea flour, Desi chickpea flour, Desi chickpeas, and Kabuli chickpeas | Do not add bare `chickpea` or `garbanzo` as a starch alias; broad search already spans distinct seed/flour identities. |
| `pois chiche` | Four results for black chickpeas, generic chickpea flour, Desi chickpeas, and Kabuli chickpeas | Keep the French query broad; do not make a starch row own an unqualified seed phrase. |
| `amidon de pois` | Existing `ingredient-ref-pea-starch` | Do not shorten the chickpea construction to `amidon de pois`; that would misroute a chickpea query to pea starch. |

The current query projection is static analysis of the implementation and source terms, not an emulator picker check. A focused archive search also found no exact candidate phrase in the research ledger or legacy-candidate file.

## Measurements, recipe demand, and substitutions

The current sources support no household measure, density, unit mapping, extraction yield for a purchased ingredient, cooking yield, or tested recipe substitution. Green Boy’s product specification is commercial ingredient information, but it does not report a household spoon/cup measure or ingredient-specific conversion. The Canadian grant record’s planned starch-rich flour is not a measure for isolated starch. Keep density null and unit mappings empty if the identity is reconsidered; add no forms, recipe links, yields, or global/contextual substitutions without separate evidence.

The manifest-ordered audit covered all **114 listed recipes and 1,123 ingredient rows**. Searches of recipe JSON text and ingredient-row text for `chickpea starch`, `chick pea starch`, `starch from chickpea(s)`, `Cicer arietinum starch`, `amidon de pois chiche(s)`, and `fécule de pois chiche(s)` found **zero candidate text matches**, **zero candidate ingredient-row matches**, and **zero links to a chickpea-starch reference ID**. Current bundled recipes therefore give no basis for relinking, measurements, or recipe-specific substitutions.

## Read-only audit snapshot

| Surface | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,464 | `defece4daa783bf0227c7c90d9ca0864737843360aac4da51dd7ca0155364898` |
| Active ingredient forms | 105 | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| Research-ledger records | 1,805 | `21d32f94f37a1d4457f4445d229b0525ae21d86e8b472d4f571455fd41c83c11` |
| Legacy import candidates | 63 | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

The corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte in manifest order. Before this proposal was written, no earlier proposal or batch used the source prefix; it remains absent from the shared ledger.

## Reconsideration criteria

1. Require a current Canadian or Québec human-food package, producer, or ingredient-supplier source that names isolated chickpea starch and distinguishes it from whole-seed or starch-rich chickpea flour.
2. Confirm the exact English and Québec French product names with an independent Québec terminology review. The provisional descriptive phrase `amidon de pois chiche` is not represented as an OQLF headword or a current local package label here.
3. If accepted, consider a separate identity-only `FLOUR_AND_STARCH` reference for isolated *C. arietinum* seed starch. Recheck any proposed ID at that time; this proposal reserves none. Leave aliases, forms, density, mappings, measures, recipe links, conversions, yields, and substitutions empty unless supported separately.
4. Keep Section 04 B3 open; this review does not complete the regional-starch item.

## Sources

Sources checked on 2026-10-14. IDs are local to this proposal and have not been added to the shared research ledger.

| ID | Source and bounded evidence |
|---|---|
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S01** | Canadian Food Inspection Agency, [*Common Names for Ingredients and Components*](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components) and [French version](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants), Table 1, item 20; last amended 2026-02-11. Specifies plant-source naming for starch; the French pattern is `amidon de` plus the plant name. It is a naming rule, not evidence of a chickpea-starch sale or local consumer label. |
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S02** | Office québécois de la langue française, [*pois chiche* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296897/pois-chiche), updated 2026. Defines the plant/seed as *Cicer arietinum* and gives English `chickpea`. It does not name chickpea starch. |
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S03** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Prefers `amidon` generally and says `fécule` more specifically names starch in tubers or underground organs. It mentions chickpea among legumes but has no chickpea-starch headword. |
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S04** | Canadian Intellectual Property Office, [PHYTOKANA, application 2322473](https://ised-isde.canada.ca/cipo/trademark-search/2322473). Lists `chickpea starch` in plant starch ingredients for the food industry and names Alberta applicant Phytokana Ingredients Inc.; CIPO records approval in September 2026. This is a trademark goods statement, not proof of a product being made or sold. The related official French notice, [*Journal des marques de commerce*, vol. 73, no 3715](https://publications.gc.ca/collections/collection_2026/opic-cipo/RG42-2-73-3715-fra.pdf), uses `amidon de pois chiche` in the goods statement; that is Canadian name evidence, not a retail label or OQLF ruling. |
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S05** | Chung et al., [“Composition, Molecular Structure, Properties, and In Vitro Digestibility of Starches from Newly Released Canadian Pulse Cultivars”](https://experts.mcmaster.ca/scholarly-works/1338283), *Cereal Chemistry* 85(4), 2008, 471–479. The abstract reports isolated starches from Canadian-grown pea, lentil, and chickpea cultivars, and distinguishes their structures and properties. Research isolates are not proof of a current retail product, household measure, or substitution. |
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S06** | Green Boy Group, [*Ingredients*](https://www.greenboy.com/ingredients/), current supplier portfolio, accessed 2026-10-14. Lists `Chickpea Starch` under starches and `Chickpea Flour` separately under flours in its food-ingredient portfolio. It describes worldwide sourcing and does not establish Canadian availability or a Québec name. |
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S07** | NewSeed, [*Chickpea Starch*](https://www.foodsweeteners.com/products/chickpea-starch/), current supplier page, accessed 2026-10-14. Describes a food-grade isolated starch obtained as a chickpea-protein-isolation by-product and distinguishes it from flour. The supplier identifies China sourcing and bulk-food/feed sales; it is not Canadian/Québec market evidence and its specifications are not kitchen conversions. |
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S08** | Agriculture and Agri-Food Canada, [grant record: *Dry Fractionation of Pulses to Produce High Quality Protein Concentrates and Starch-Rich Flour for Human Food Applications*](https://search.open.canada.ca/grants/record/aafc-aac,235-2024-2025-Q4-00020,current), agreement Apr 2025–Jul 2027, recipient Phytokana Ingredients Inc. The Alberta project names chickpea, lentil, yellow pea, and faba bean as sources for protein concentrates and **starch-rich flour**, and says it is validating commercial viability. It does not describe isolated chickpea starch as project output. |
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S09** | Phytokana Ingredients, [*Ingredients*](https://phytokana.com/ingredients/), current supplier page, accessed 2026-10-14. Its human-nutrition portfolio labels a current product `Starch-Rich Faba Flour`; the page describes pulse co-products but does not list isolated chickpea starch. This is a bounded portfolio observation, not proof of market-wide absence. |
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S10** | Metro Canada, [Sher Super Fine Chickpea Flour](https://www.metro.ca/en/online-grocery/aisles/pantry/baking-ingredients/flour-baking-essentials/super-fine-chickpea-flour/p/818720000046), current listing accessed 2026-10-14. Supports the Canadian flour product name and “Product of Canada” listing attribute. It is whole-seed flour, not starch. Store availability and item attributes may vary. |
| **WP02-B3-CHICKPEA-STARCH-BOUNDARY-HOLD-R120-20261014-S11** | Covered Bridge, [*Nos croustilles*](https://coveredbridgechips.com/en/nos-croustilles/), current Canadian manufacturer page, accessed 2026-10-14. Its bilingual chickpea-chip ingredient declaration distinguishes `Farine de pois chiche` / `Chickpea flour` from `Amidon de pomme de terre` / potato starch. A processed snack ingredient list is not a standalone starch product label. |

## Static review performed

Re-read `AGENTS.md`, the Section 04 B3 plan item, the active references/forms, legacy candidates, ledger, proposal/batch archive, and `IngredientSearch.kt`. Audited current English and French picker ownership, Canadian/Québec product wording, source-specific starch/flour boundaries, and the manifest-listed recipe corpus. Root integrated the recommendation as a documentation-only hold; no active database JSON or app code changed. No app or emulator tests were run.
