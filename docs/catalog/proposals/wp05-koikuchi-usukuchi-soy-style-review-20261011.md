# WP05 Section W proposal — koikuchi and usukuchi soy-sauce styles

**Packet type:** Proposal-only identity, naming, collision, and evidence-scope review  
**Prepared / source-access date:** 2026-10-11  
**Scope:** Japanese koikuchi shoyu and usukuchi shoyu; their distinction from the existing generic, Chinese-style light/dark, Japanese shiro, saishikomi, and tamari identities.  
**Checklist state:** This packet addresses only koikuchi and usukuchi. Other Section W work remains open.

## Recommendation

1. **Accept two distinct, identity-only Japanese style records.** JAS 1703 names koikuchi and usukuchi separately and gives them different definitions. MAFF's descriptive overview also distinguishes their production and color. Canadian products and Québec retailers currently name both styles. This supports two scoped product identities, not preparation forms. [S01, S02, S05–S08]
2. **Keep `shoyu` as a broad family name.** The JAS title is *Soy Sauce (Shoyu)* and its scope includes five distinct Japanese styles. Keep the unqualified English alias `shoyu` on `ingredient-ref-soy-sauce`; do not treat it as a koikuchi or usukuchi synonym. The qualified aliases below identify the styles only. [S01]
3. **Do not map either Japanese style to the current Chinese-style light/dark rows.** The exact current owners of `light soy sauce` / `sauce soya claire` and `dark soy sauce` / `sauce soya foncée` remain the Chinese-style identities. A Québec retailer does call one usukuchi product `sauce soya claire`, and Canadian retailers translate koikuchi as “dark soy sauce”; those retail translations are ambiguous against the active exact owners and are not proposed as aliases. [S03, S05, S06, S08–S10]
4. **Use Québec product wording for the French displays, provisionally.** Recommend `sauce soya de type koikuchi` and `sauce soya pâle (usukuchi)`. The first keeps the locally documented koikuchi style term while avoiding the already-owned descriptor `sauce soya foncée`; the second follows a current Québec product title and avoids `sauce soya claire`, which is already owned by the Chinese-style light row. OQLF supports the family term `sauce soya`, but does not define these Japanese style names; keep the compounds provisional pending independent Québec terminology review. [S03–S06, S09]
5. **Do not add forms, default measurements, density, conversions, package yields, or substitutions.** The JAS quality criteria and product package/nutrition data do not establish recipe unit behavior. No RecipeBook line names either style. [S01, S05, S07]

## Proposed records

| Suggested ID | Category | English display | English aliases | Provisional fr-CA display | French aliases |
|---|---|---|---|---|---|
| `ingredient-ref-koikuchi-soy-sauce` | `SAUCE_AND_CONDIMENT` | `koikuchi soy sauce` | `koikuchi shoyu` | `sauce soya de type koikuchi` | None |
| `ingredient-ref-usukuchi-soy-sauce` | `SAUCE_AND_CONDIMENT` | `usukuchi soy sauce` | `usukuchi shoyu` | `sauce soya pâle (usukuchi)` | None |

Keep the records as named Japanese soy-sauce styles, with `defaultDensity: null`, no unit mappings, and no linked preparation forms. Product variation within each style remains product-specific: sources list differences in ingredient formulations, aging, and package sizes. The styles do not imply that every bottle has the same salt level, color, ingredient list, or flavor. MAFF describes increased salt content as one usukuchi production technique to slow fermentation and aging; this is not a numeric claim about every commercial product. [S01, S02, S05, S06, S08]

The qualified English alias `koikuchi shoyu` / `usukuchi shoyu` is a direct style name. Do not add bare `shoyu` to either row, or add general aliases `dark soy sauce`, `light soy sauce`, `Japanese soy sauce`, `sauce soya foncée`, or `sauce soya claire`. Because picker search matches a query phrase within a longer display or alias, a broad `soy sauce` search can also find the qualified style displays, and `shoyu` can find qualified `... shoyu` aliases in addition to the generic row. This is a contained-query effect, not an exact-key ownership collision; keep generic requests linked to the existing generic ingredient unless the recipe names a style.

## Style scope and boundaries

| Candidate / boundary | Evidence-supported scope | Exact current owner and disposition |
|---|---|---|
| **Koikuchi** | JAS §3.9 identifies a soy-sauce-koji base using soybeans with approximately an equal amount of wheat (or specified additional grains). MAFF describes it as the common, rich-aroma Japanese style. Accept a separate style identity. [S01, S02] | No exact owner for `koikuchi`, `koikuchi soy sauce`, or `koikuchi shoyu` in active references, forms, or legacy candidates. Proposed row only for the Japanese koikuchi style. |
| **Usukuchi** | JAS §3.10 defines a separate style using soybeans with approximately equal wheat, optional rice/other grains or wheat gluten, optional rice addition to the mash, and production that suppresses darkening. MAFF describes lighter color and salt/aging techniques. Accept a separate style identity. [S01, S02] | No exact owner for `usukuchi`, `usukuchi soy sauce`, or `usukuchi shoyu` in active references, forms, or legacy candidates. Proposed row only for the Japanese usukuchi style. |
| **Generic soy sauce / shoyu** | JAS uses *shoyu* as the broad soy-sauce family name and names five styles within it. [S01] | `ingredient-ref-soy-sauce` owns `soy sauce` / `sauce soya`, French alias `sauce soja`, and English alias `shoyu`. Keep unqualified `shoyu` and generic recipe requests on this row. |
| **Chinese-style light soy sauce** | The existing row describes the separately reviewed Chinese-style product category; the same light-color English gloss does not establish a crosswalk to usukuchi. [S03, S10] | `ingredient-ref-light-soy-sauce` exactly owns `light soy sauce` / `sauce soya claire`. Do not use either as an alias for usukuchi. Montréal retailer Miyamoto uses `Sauce soya claire` for one Higashimaru usukuchi listing, but that phrase is already owned and therefore remains a collision hold. [S09] |
| **Chinese-style dark soy sauce** | The existing dark row remains a separate style. Canadian retail use of “dark soy sauce” for koikuchi does not establish identity with this row. [S03, S06, S08, S10] | `ingredient-ref-dark-soy-sauce` exactly owns `dark soy sauce` / `sauce soya foncée`. Tokusen's Québec koikuchi copy says `sauce soya foncée de type koikuchi`; JapaneseTaste.ca uses “dark soy sauce” in its collection title. Neither phrase is proposed as a koikuchi alias because each collides with the active Chinese-style owner. [S06, S08] |
| **Japanese shiro / white soy sauce** | JAS §3.13 defines shiro separately by its small amount of soybeans and strong suppression of color; MAFF says it is lighter than usukuchi. [S01, S02] | `ingredient-ref-white-soy-sauce` owns `white soy sauce` / `sauce soya extra-claire (shiro shoyu)` and alias `shiro shoyu`. Keep both styles distinct. |
| **Japanese saishikomi** | JAS §3.12 defines saishikomi using finished pressed soy sauce (`kiage`) in place of salt water in the mash. [S01] | `ingredient-ref-saishikomi-soy-sauce` owns `saishikomi soy sauce` and aliases `saishikomi shoyu`, `refermented soy sauce`, and `twice-brewed soy sauce`. Keep its process and record separate from koikuchi/usukuchi. |
| **Tamari** | JAS names tamari separately; its definition uses soybeans with a small amount of wheat (with specified possible grains). [S01] | `ingredient-ref-tamari` owns `tamari` in both languages. Keep separate. |

Do not infer that a retailer's color translation overrides a named JAS style. In particular, hold `dark soy sauce`, `light soy sauce`, `sauce soya foncée`, `sauce soya claire`, `sauce soja noire`, and `sauce soja légère` as aliases for these records. The first four already have exact owners or direct Chinese-style scope; the latter two are French-language translations not established as fr-CA names and risk the same style confusion. Keep `shiro shoyu`, `white soy sauce`, `saishikomi shoyu`, `refermented soy sauce`, `twice-brewed soy sauce`, and `tamari` on their existing separate identities.

## Pre-integration snapshot and collision audit

Counts and hashes below describe the current audit baseline before any integration of this proposal. File hashes are SHA-256 over exact bytes. The recipe-corpus hash uses the 114 manifest-listed basenames sorted lexically, each followed by NUL, its exact file bytes, and another NUL.

| Input | Pre-integration count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,080 | `63a453335070cdceefa0b53db3661ec882ebf2db2516ffd756708de0c541e062` |
| Ingredient forms | 78 | `e80adb0f8d0f7a83c4726f4e60995d924bbd7c4c2324367ac43f69aa5fdf037d` |
| Research ledger | 1,378 records / 4,560 source-entry occurrences / 3,733 distinct source IDs | `47e15173c90922836b9618672c2bc0dcd2858045df5b20ebe2c20cb3774257ae` |
| Legacy-import candidates | 75 | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| Recipe manifest | 114 listed paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `abc542ed162722c03eef640864478f7788196509b0f9620b27c98fcce1c19530` |

The exact-key audit scanned all 1,080 reference names and aliases, 78 form labels/match terms, and 75 legacy candidates with the catalog's case-folding, NFKD accent folding, punctuation-to-space normalization, and trimming. `koikuchi`, `koikuchi soy sauce`, `koikuchi shoyu`, `usukuchi`, `usukuchi soy sauce`, `usukuchi shoyu`, and the proposed French displays have no exact current owner. The proposed IDs are absent from references, forms, legacy candidates, and ledger record IDs.

| Query / normalized key | Exact current owner | Disposition |
|---|---|---|
| `soy sauce` / `soy sauce` | `ingredient-ref-soy-sauce` | Keep generic name. |
| `sauce soya` / `sauce soya` | `ingredient-ref-soy-sauce` | Keep Québec family term. |
| `shoyu` / `shoyu` | `ingredient-ref-soy-sauce` English alias | Keep as broad-family alias only. |
| `light soy sauce` / `light soy sauce`; `sauce soya claire` / `sauce soya claire` | `ingredient-ref-light-soy-sauce` | Preserve the Chinese-style identity; do not use for usukuchi. |
| `dark soy sauce` / `dark soy sauce`; `sauce soya foncée` / `sauce soya foncee` | `ingredient-ref-dark-soy-sauce` | Preserve the Chinese-style identity; do not use for koikuchi. |
| `white soy sauce`; `shiro shoyu` | `ingredient-ref-white-soy-sauce` | Keep Japanese shiro separate. |
| `saishikomi soy sauce`; `saishikomi shoyu`; `refermented soy sauce`; `twice-brewed soy sauce` | `ingredient-ref-saishikomi-soy-sauce` | Keep Japanese saishikomi separate. |
| `tamari` | `ingredient-ref-tamari` | Keep Japanese tamari separate. |
| `koikuchi`, `koikuchi shoyu`, `usukuchi`, `usukuchi shoyu` | None | Proposed as style-qualified terms only. |
| `sauce soya pâle`; `sauce soya de type koikuchi` | None | Proposed display candidates; provisional fr-CA, no additional French aliases. |
| `sauce soya claire`; `sauce soya foncée` | Existing Chinese light/dark rows above | Hold as koikuchi/usukuchi aliases despite local product translations. |

No soy-style form is attached to the existing generic, tamari, light/dark, white-soy, or saishikomi rows. The reference/form/legacy scan found no exact candidate-name or proposed-ID collision. The source-ID namespace `WP05-W-KOIKUCHI-USUKUCHI-20261011-S01` through `...-S10` was checked against the 4,560 ledger source-entry occurrences (3,733 distinct IDs) and the 488 proposal files present at the check; no collision was found. These IDs are reserved for this proposal only and are not ledger entries.

## Recipe-demand audit

All 114 manifest-listed recipe files and all 1,123 `ingredients[]` objects were scanned for the style names, their qualified soy-sauce/shoyu phrases, the current generic/light/dark/Shiro/saishikomi/tamari names, and the proposed French labels. **No recipe line or recipe-file text names koikuchi or usukuchi.** The only relevant ingredient rows are generic soy-sauce requests:

| Recipe | Exact ingredient text | Current reference | Disposition |
|---|---|---|---|
| 066, Korean Soy-Marinated Jammy Eggs | `1 cup soy sauce or tamari` | `ingredient-ref-soy-sauce` | Keep as entered. The line names generic soy sauce and tamari, not either style. |
| 085, Maple Chicken | `2 1/2 tbsp soy sauce` | `ingredient-ref-soy-sauce` | Keep generic. |
| 095, Satay | `1 tbsp soy sauce` | `ingredient-ref-soy-sauce` | Keep generic. |

No bundled recipe line requires a relink. In particular, recipe 066's soy-sauce-or-tamari choice does not name koikuchi or usukuchi and provides no evidence for a cross-style substitution. The Canadian and Québec retail uses support discoverable style identities, not inferred recipe demand.

## Numeric behavior, forms, and substitutions

- **Measurements:** none supported for catalog behavior. JAS quality thresholds are manufacturing criteria, not recipe spoon/cup mass or density. Retail package capacities (including the 1 L, 150 mL, and 1,800 mL examples) and a label's nutrition serving size do not establish mass per volume, a household-measure conversion, or an ingredient default. [S01, S05, S07]
- **Forms and conversions:** none. Koikuchi and usukuchi are distinct named product styles, not preparation states in the current form model. No conversion between them or to Chinese light/dark soy sauce is supported.
- **Substitutions:** none. The fact that sources describe uses for cooking, dipping, or light-colored dishes does not establish a global directed replacement rule. The corpus has no exact style-specific recipe line to preserve as a contextual rule.
- **Product variation:** do not claim a standard salt quantity, exact color, ingredient list, or aging duration for every bottle. The sources include different ingredients, aging, and commercial variants within a style. Numeric data remains unavailable for runtime use.

## Sources and unique proposed source IDs

| Proposed source ID | Source and claim supported | Scope limits |
|---|---|---|
| `WP05-W-KOIKUCHI-USUKUCHI-20261011-S01` | Ministry of Agriculture, Forestry and Fisheries, [Japanese Agricultural Standard JAS 1703:2021, Soy Sauce (Shoyu)](https://www.maff.go.jp/j/jas/jas_standard/attach/pdf/index-470.pdf), scope §1 and definitions §§3.8–3.13, especially §§3.9–3.10. Names five Japanese shoyu styles; defines koikuchi by its soybean/wheat koji base and usukuchi by its related base plus optional rice ingredients and color-darkening suppression. | Primary Japanese product standard for style/process. It does not establish a Québec French display, retail equivalence to Chinese styles, recipe demand, density, or substitutions. JAS quality thresholds are not culinary conversion values. |
| `WP05-W-KOIKUCHI-USUKUCHI-20261011-S02` | MAFF, [Soy sauce, miso, other seasonings — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/syouyu-miso.html), “Soy sauce” overview and style table. Lists five categories; describes koikuchi aroma/common use and usukuchi's light color, Kansai history, and techniques including higher salt to slow fermentation/aging. | Official descriptive overview, not a product-by-product guarantee or a Québec terminology authority. Its salt/process description does not support a universal sodium value or substitution. |
| `WP05-W-KOIKUCHI-USUKUCHI-20261011-S03` | Office québécois de la langue française, [sauce soya (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095123/sauce-soya). Lists `sauce soya` / `sauce de soya` as Québec-preferred family terms and describes clear/dark soy sauce. | Supports the Québec family term and identifies the existing clear/dark terminology. It does not define koikuchi/usukuchi or endorse the proposed Japanese-style compounds. |
| `WP05-W-KOIKUCHI-USUKUCHI-20261011-S04` | Mito, [La sauce soya pour sushi](https://mito.ca/sauce-soya-sushi/), Québec French culinary article. Uses `sauce soya (shoyu)` and lists Koikuchi, Usukuchi, Tamari, and Shiro shoyu as families; describes usukuchi as lighter and saltier and koikuchi as the common balanced style. | Québec usage evidence, not an OQLF term record, product standard, universal formulation, or measurement source. |
| `WP05-W-KOIKUCHI-USUKUCHI-20261011-S05` | Tokusen, [Usukuchi — Sauce soya pâle](https://tokusen.store/collections/produits-de-detail/products/usukuchi), current Daiko Shoyu product page. Directly pairs the style name with French `sauce soya pâle`; lists 150 mL and 1,800 mL packaging and this product's ingredient/nutrition information. | Québec product wording for one maker's product. Package and label figures are not generic recipe measures, density, or universal composition. |
| `WP05-W-KOIKUCHI-USUKUCHI-20261011-S06` | Tokusen, [Haizakura — Sauce soya foncée](https://tokusen.store/collections/sushi/products/haizakura), current Daiko Shoyu product page. Calls this particular koikuchi product `sauce soya foncée de type koikuchi` and gives product-specific aging/ingredients. | Demonstrates Québec usage of the style name, but the exact unqualified descriptor `sauce soya foncée` belongs to the active Chinese-style dark row. Do not activate it as a French alias. Product-specific aging and ingredients are not universal. |
| `WP05-W-KOIKUCHI-USUKUCHI-20261011-S07` | Ozawa Canada, [Yamasa Usukuchi Soy Sauce, 1L](https://ozawa.ca/product/yamasa-usukuchi-soy-sauce-1l/), current distributor listing. Uses the English product name `Yamasa Usukuchi Soy Sauce`, describes “Light Colour,” classifies it as soy sauce, and lists Toronto and Montréal offices. | Canadian importer/distributor evidence for a current product name and family placement; not a primary production standard, Québec French term authority, or a measure conversion. |
| `WP05-W-KOIKUCHI-USUKUCHI-20261011-S08` | JapaneseTaste.ca, [Koikuchi Shoyu (Dark Soy Sauce)](https://japanesetaste.ca/collections/koikuchi-shoyu-dark-soy-sauce), current Canada-facing product collection. Uses `Koikuchi Shoyu` and lists organic, whole-soybean, aged, and other product variants; translates the collection as dark soy sauce. | Retailer terminology, not a product standard. Its `dark soy sauce` wording is not adopted because that exact name is owned by the separate Chinese-style row; listed package sizes and variant attributes are product-specific. |
| `WP05-W-KOIKUCHI-USUKUCHI-20261011-S09` | Miyamoto grocery, Montréal, [Higashimaru Usukuchi Shoyu 1L](https://miyamotomontreal.com/products/higashimaru-usukuchi-shoyu-1l), current local product listing. Its French descriptor is `Sauce soya claire`. | Documents a real local translation for one named usukuchi item, but `sauce soya claire` is already the exact display on the Chinese-style light row. It is not safe as a global alias or crosswalk. |
| `WP05-W-KOIKUCHI-USUKUCHI-20261011-S10` | Pearl River Bridge, [Superior Light Soy Sauce](https://www.pearlriverbridge.com/superior-light-soy-sauce), [sauce soja légère](https://fr.pearlriverbridge.com/superior-light-soy-sauce), [Dark Soy Sauce](https://www.pearlriverbridge.com/dark-soy-sauce/), and [sauce soja foncée](https://fr.pearlriverbridge.com/dark-soy-sauce/); manufacturer product pages already used to document the active Chinese light/dark identities in the [WP05 soy-sauce styles batch](../batches/wp05-kimchi-soy-sauce-styles.md). | Manufacturer sources document those Chinese-style products and French translations. They do not establish a crosswalk to Japanese styles or validate European `sauce soja` phrases as fr-CA aliases. |

## Review notes and disposition

- Reviewed the Section W plan entry, the current soy-sauce reference/form/legacy state, and the prior shoyu/tamari, Chinese light/dark, shiro, and saishikomi decisions before this proposal.
- Audited exact normalized-key ownership and the complete 114-recipe / 1,123-ingredient manifest corpus. No proposed canonical ID or source ID collision was found.
- **Koikuchi:** recommend the separate style identity; use `koikuchi shoyu` as its qualified English alias; do not alias to generic Chinese `dark soy sauce` or the current `sauce soya foncée` owner. Use provisional French display `sauce soya de type koikuchi`.
- **Usukuchi:** recommend the separate style identity; use `usukuchi shoyu` as its qualified English alias; do not alias to Chinese `light soy sauce` or the current `sauce soya claire` owner. Use provisional French display `sauce soya pâle (usukuchi)`.
- **Generic shoyu:** retain the current generic `shoyu` alias only; do not create a separate generic shoyu row or use bare `shoyu` as a style alias.
- **All other named rows:** keep generic soy sauce, tamari, Chinese light/dark, shiro, and saishikomi on their current distinct rows. No open style beyond the two named in this packet is resolved.
- **Recipe, form, numeric, and substitution state:** no recipe relink; no forms, measurements, density, unit mappings, conversions, yields, or substitutions.
- This packet changes no shared catalog JSON, recipe, ledger, plan, checklist, roadmap, generated code, or batch README. Research only; no tests were run.
