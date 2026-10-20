# WP03 Section F — Red quinoa identity review (R150, 2026-10-15)

- **Status:** Proposal-only review. The parent task has since integrated the red quinoa reference and ledger record in R150; this proposal did not edit shared data. See the R150 integration README.
- **Scope:** Review the currently marketed red quinoa grain product as a distinct identity from generic quinoa, color-qualified quinoa flour, quinoa flakes, and mixed quinoa products.
- **Recommendation:** Accept an identity-only `GRAIN_AND_CEREAL` reference for **red quinoa / quinoa rouge**, with no aliases, forms, recipe links, reusable measures, conversions, yields, or substitutions.
- **Source-ID prefix:** `WP03-REDQUINOA-R150-20261015-S` (S01–S06). At review time, the reference ID and source prefix were unallocated; R150 has since assigned the prefix to the ledger record.

## Scope and current-package check

Section F remains open for grain and cereal coverage. This review selects a color-qualified marketed grain product, not a new species, cultivar, cooked state, flour, flake, or prepared mix. R149's Red Fife wheat berries are excluded. No earlier focused red-quinoa-grain review or hold was found in the Section F archive. The nearby reviews are not equivalent: WP02 A6 integrated white/red/black **quinoa flours**; WP03 reviewed **quinoa flakes**; the puffed-quinoa review covers another process; and the quinoa portion reviews concern generic dry/cooked quinoa.

At review time, the package had 1,514 ingredient references, 119 forms, and 114 manifest-listed recipes with 1,123 structured ingredient rows. Relevant active rows are:

| Active identity | Category | Boundary |
| --- | --- | --- |
| `ingredient-ref-quinoa` — `quinoa / quinoa` | `GRAIN_AND_CEREAL` | Generic quinoa, with existing dry and cooked forms. |
| `ingredient-ref-red-quinoa-flour` — `red quinoa flour / farine de quinoa rouge` | `FLOUR_AND_STARCH` | Color-qualified milling product. |
| `ingredient-ref-quinoa-flakes` — `quinoa flakes / flocons de quinoa` | `GRAIN_AND_CEREAL` | Flattened quinoa product, not intact grain. |
| `ingredient-ref-puffed-quinoa` — `puffed quinoa / quinoa soufflé` | `GRAIN_AND_CEREAL` | Puffed product, not intact grain. |
| `ingredient-ref-white-quinoa-flour`, `ingredient-ref-black-quinoa-flour` | `FLOUR_AND_STARCH` | Other color-qualified flour products. |

No active reference represents a standalone red quinoa grain product. The proposed identity is the product-level red color distinction sold under the plain-grain name. It does not assert a particular cultivar, species distinction, growing region, processing standard, or universal traits of every red quinoa.

## Product identity and French wording

Current Québec-facing product evidence uses the plain French wording **quinoa rouge**. GoGo Quinoa's French manufacturer page titles a single-color SKU `Quinoa royal biologique - Rouge` and describes the grain as `quinoa rouge` [S01]. Mayrand currently lists a separate Agrofusion SKU titled `Quinoa rouge 3 kg` and shows it in stock at its Anjou, Laval, Brossard, and Saint-Jérôme stores [S03]. Metro's current French listing for GoGo's 500 g product uses `Quinoa royal rouge biologique` and the ingredient name `QUINOA ROYAL ROUGE BIOLOGIQUE` [S04]. These support the short catalog display `quinoa rouge` as wording found on Québec product listings; they are not an OQLF ruling for the compound.

Use the corresponding English display `red quinoa`, supported by the manufacturer's English `Organic Royal Quinoa - Red` product page and current Canadian retailer listing [S02, S04]. Do not carry through the SKU-specific `royal`, `organic`, brand, package, origin, health, or preparation claims. GoGo says its product is imported from Bolivia and locally packaged; this review does not claim Canadian-grown grain [S01–S02].

Keep the proposed reference separate from:

- generic `quinoa / quinoa` and its dry/cooked forms;
- `red quinoa flour / farine de quinoa rouge` and the white/black quinoa flour rows;
- generic quinoa flakes and puffed quinoa;
- GoGo's separate `red and white` SKU and Mayrand's `quinoa rouge et blanc` blend; and
- tricolour or other composite quinoa products.

Mayrand lists red-only, white-only, and red-and-white product SKUs separately; GoGo likewise has separate red and red/white product pages [S05–S06]. Do not add `red and white quinoa`, `tricolour quinoa`, `quinoa royale`, `organic quinoa`, `royal quinoa`, or the flour wording as aliases. Do not decompose blend recipes into the proposed grain.

## Proposed catalog reference

```json
{
  "id": "ingredient-ref-red-quinoa",
  "nameFr": "quinoa rouge",
  "nameEn": "red quinoa",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

This is a separate identity rather than a form of generic quinoa: color is part of the marketed product name, while the existing forms encode dry and cooked preparation states. Do not add another dry/cooked form pair for the color-qualified row; there is no bundled recipe needing one, and no state conversion or yield is established.

If integrated, attach the six source records below to `ingredient-ref-red-quinoa` in the ledger. The identity state can be `verified`; measurement research found no reusable value (`researched_no_supported_value`); substitution research can remain `not_yet_researched`. Add no measurement observation or substitution finding.

## Exact ownership and picker projection

At review time, the proposed ID was absent from active reference IDs, form IDs, ledger record IDs, and legacy candidate IDs. Neither exact normalized display phrase had a whole-key owner among reference names/aliases, form labels/match terms, or legacy candidate names/aliases. The source-ID prefix had no ledger collision. R150 has since assigned the ID and source records. The relevant flour row does contain both phrases as part of its longer names, so the app's phrase-first picker already returns that flour for the short color queries.

Projection was reproduced from the current `IngredientSearch.kt` behavior, using reference and form search terms. Complete normalized word phrases inside longer terms are returned before substring fallback; exact form terms are handled first. The proposed row was appended with its two display names and no aliases:

| Query | Current results | With proposed row | Expected projection |
| --- | --- | --- | --- |
| `red quinoa` | `ingredient-ref-red-quinoa-flour` | `ingredient-ref-red-quinoa-flour`, `ingredient-ref-red-quinoa` | Broad color query shows both grain and flour. |
| `quinoa rouge` | `ingredient-ref-red-quinoa-flour` | `ingredient-ref-red-quinoa-flour`, `ingredient-ref-red-quinoa` | Broad French color query shows both grain and flour. |
| `red quinoa flour` | `ingredient-ref-red-quinoa-flour` | unchanged | Flour-qualified query remains flour-only. |
| `farine de quinoa rouge` | `ingredient-ref-red-quinoa-flour` | unchanged | Flour-qualified French query remains flour-only. |
| `quinoa flakes` | `ingredient-ref-quinoa-flakes` | unchanged | Flakes remain distinct. |
| `quinoa` | 8 identities | 9 identities | Broad family query gains the red-grain row. |

The short red-quinoa query is intentionally a family query under the existing picker algorithm; selecting the grain or flour requires choosing the correctly named result. No alias is proposed that would expand this overlap. The mixed-product names are not aliases and the active catalog has no mixed quinoa row for this candidate to capture.

## Bundled recipe demand

All 114 recipe files listed by `manifest.v1.json` and their 1,123 structured ingredient rows were scanned for `red quinoa`, `quinoa rouge`, and the proposed ID. There were **0 matching recipe files and 0 matching ingredient rows**. The only structured quinoa ingredient line remains recipe 016, `2 cups cooked quinoa`, linked to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`; recipe 018 mentions generic quinoa only as a serving suggestion. Neither establishes red-quinoa demand or warrants relinking.

## Measures, forms, and substitutions

- **Product directions:** GoGo's manufacturer page directs 1 cup of its red quinoa to 2 cups water and 12–15 minutes; Metro's Québec listing for the same 500 g product number gives 1 cup quinoa to 1.5 cups water and 12–15 minutes [S02, S04]. These are product-page cooking instructions and conflict on water ratio. Do not select one as a generic measure, active conversion, cooking yield, or catalog-level direction.
- **Package size:** GoGo's 500 g and Mayrand's 3 kg amounts identify package formats only. They are not servings, household measures, density values, or volume-to-mass mappings [S01–S03].
- **Existing generic forms:** `ingredient-ref-quinoa` retains its dry and cooked forms with null densities; its unit mappings are empty. The existing notes explicitly state that no dry/cooked conversion or cooking-yield relation is established. Do not change them or copy them to the proposed color identity.
- **Substitutions:** The active global and contextual substitution-rule files contain no quinoa rules. The reviewed product pages do not establish an equivalent substitute or quantity; no rule or finding is proposed. Keep substitution research open.
- **Recipe links:** None; there is no color-qualified recipe line.

## Source register

Sources were checked on 2026-10-15. Product listings and stock status can change; claims below remain limited to the named SKU or page.

| Source ID | Source | Evidence used and limits |
| --- | --- | --- |
| `WP03-REDQUINOA-R150-20261015-S01` | GoGo Quinoa, [Quinoa royal biologique - Rouge](https://gogoquinoa.com/fr/products/organic-red-quinoa), French manufacturer product page. | Names a single red quinoa product and uses `quinoa rouge`; states 500 g, imported from Bolivia and locally packaged, with its own cooking directions. Supports the exact French phrase and product boundary only; brand, organic, origin, package size, product claims, and directions are not generalized. |
| `WP03-REDQUINOA-R150-20261015-S02` | GoGo Quinoa, [Organic Royal Quinoa - Red](https://gogoquinoa.com/products/organic-red-quinoa), English manufacturer product page. | Names the paired red-only product, states 500 g and Bolivian import/local packaging, and gives 2 cups water per cup of quinoa with a 12–15 minute cook. These directions are SKU-specific and conflict with the Metro listing below. |
| `WP03-REDQUINOA-R150-20261015-S03` | Mayrand, [Quinoa rouge 3 kg - Quinoa](https://mayrand.ca/fr/nos-produits/epicerie/riz-et-grain/quinoa/quinoa-rouge-agrofusion-30629), Québec retailer page. | Current product page names Agrofusion SKU 30629 `Quinoa rouge 3 kg` and reports it in stock at four Québec stores. The 3 kg amount is a package size, and listing availability is not a composition or culinary-measure statement. |
| `WP03-REDQUINOA-R150-20261015-S04` | Metro Québec, [Quinoa royal rouge biologique GoGo Quinoa 500 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/quinoa-royal-rouge-biologique/p/896899000227) and [English product listing](https://www.metro.ca/en/online-grocery/aisles/pantry/pasta-rice-beans/quinoa-specialty-grains/organic-royal-red-quinoa/p/896899000227). | Current bilingual retailer result names the red-only GoGo product, gives UPC/product number 896899000227 and the French ingredient `QUINOA ROYAL ROUGE BIOLOGIQUE`. Its directions say 1.5 cups water per cup of quinoa and 12–15 minutes, unlike the manufacturer's 2:1 instruction. The English listing showed out of stock when checked; this is product identity/direction evidence, not stock confirmation. |
| `WP03-REDQUINOA-R150-20261015-S05` | Mayrand, [Quinoa category](https://mayrand.ca/fr/nos-produits/epicerie/riz-et-grain/quinoa). | Lists Agrofusion's red-only 3 kg SKU, white-only 900 g and 5 kg SKUs, and a separate `Quinoa rouge et blanc 1 kg` product. Supports the Québec retail product boundary; package sizes are not measures. |
| `WP03-REDQUINOA-R150-20261015-S06` | GoGo Quinoa, [Quinoa royal biologique - Rouge et blanc](https://gogoquinoa.com/fr/products/royal-red-and-white-quinoa). | Current French manufacturer page names the red/white blend separately and gives its own cooking instructions. It supports keeping the composite SKU out of the red-only identity; no blend formula or blend measure is transferred. |

## Static review checks

- Re-read `AGENTS.md`, the active Section F checklist, the live references and forms, the research ledger, and relevant Section F proposal/batch records before selecting the candidate.
- Confirmed the proposed ID and source-ID prefix are unallocated; no earlier focused red-quinoa-grain proposal or hold was found. Prior red quinoa flour, flakes, puffed-quinoa, and generic cooked-quinoa reviews remain separate.
- Compared normalized candidate keys against current reference names/aliases, form labels/match terms, and legacy import candidates; reproduced the picker projection from the current static search implementation.
- Parsed the manifest-backed recipe files and scanned candidate wording in all recipe text and structured ingredient rows; candidate-specific demand is zero.
- Reviewed current forms, active substitution files, and product-specific cooking information. Added no reusable measure, density, conversion, yield, form, recipe link, or substitution.
- This remains a proposal-only review. No tests, Gradle tasks, emulator, app, or deployment checks were run.
