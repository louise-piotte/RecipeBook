# WP05 Section T — Shichimi Togarashi and Furikake Identity Boundary Review

**Review date:** 2026-10-11
**Status:** Integrated. Added separate identity-only references for shichimi togarashi and furikake with the documented names and bounded aliases; no recipe links or forms were added.
**Plan item:** Section T, “Chinese five-spice, shichimi, furikake, jerk seasoning, Cajun/Creole seasoning, adobo, sazón, Montreal steak spice, and herbes de Provence.”

## Coordinator recommendation

Add **two separate identity-only seasoning references**. Shichimi togarashi is a chili-forward Japanese spice blend; furikake is a distinct savory rice seasoning/topping class with both dry and soft-moist products. Their product names, uses, and ingredient profiles do not support a shared identity or any cross-alias.

| Proposed reference ID | Category | English display | Québec French display | Search aliases |
|---|---|---|---|---|
| `ingredient-ref-shichimi-togarashi` | `BAKING_AND_SPICE` | `shichimi togarashi` | `mélange d’épices shichimi togarashi` | EN: `nanami togarashi`; FR: none |
| `ingredient-ref-furikake` | `BAKING_AND_SPICE` | `furikake` | `furikake` | EN: `furikake rice seasoning`; FR: none |

These display candidates are supported by a Québec Metro product listing, Montréal French food writing, and a Canadian retailer’s French product name. The sources do not establish an OQLF-preferred compound term for either product, so the French labels should be recorded as source-attested market wording, not as official terminology. [S01–S02, S08–S09]

Keep both references identity-only: no forms, recipe links, densities, unit mappings, package yields, conversions, substitutions, fixed formulas, or allergen notes. The category groups them with other named seasoning blends; it does not assert that furikake is always dry.

## Pre-integration catalog and collision audit

Snapshot read on 2026-10-11: **1,042 active ingredient references**, **72 ingredient forms**, **75 legacy candidates**, **1,334 research-ledger records** with **4,392 source entries / 3,625 distinct source IDs**, and **114 manifest recipes containing 1,123 ingredient rows**.

Normalized exact-name checks across active display names and aliases, form labels and match terms, legacy candidates, and ledger record identities found **no current owner** for `shichimi togarashi`, `shichimi`, `ichimi togarashi`, `nanami togarashi`, `furikake`, `furikake rice seasoning`, `rice seasoning`, or `assaisonnement pour riz`. Searches also found no existing proposal or batch that reviews either identity. A single unrelated `seven-spice` mention in the Baharat ledger discussion is a warning about product-specific regional blends, not an identity crosswalk.

| Nearby current reference or candidate | Current state | Boundary for this proposal |
|---|---|---|
| `ingredient-ref-chili-powder`, `ingredient-ref-red-chili-flakes`, `ingredient-ref-sichuan-pepper` | Active, separate references | Do not alias shichimi to generic chili powder/flakes or to one pepper component. Legacy `ingredient-ref-chili-flakes` / `flocons de piment` also remains a generic candidate, not a shichimi synonym. |
| `ingredient-ref-five-spice-powder`, `ingredient-ref-panch-phoron`, `ingredient-ref-garam-masala`, `ingredient-ref-baharat`, `ingredient-ref-ras-el-hanout`, `ingredient-ref-dukkah`, `ingredient-ref-berbere`, `ingredient-ref-mitmita` | Active named blends | Keep each named blend separate. In particular, do not alias shichimi to bare `seven spice`, which is ambiguous across regional blends. |
| `ingredient-ref-seasoning-salt`, `ingredient-ref-mushroom-seasoning` | Active seasoning references | These broader seasoning identities do not own either proposed name and are not aliases. |
| `ingredient-ref-nori`, `ingredient-ref-dried-bonito`, `ingredient-ref-sesame-seeds`, `ingredient-ref-black-sesame-seeds`, `ingredient-ref-white-sesame-seeds` | Active component ingredients | Keep furikake separate from any one seaweed, fish, or seed component. Recipe and product formulations vary. |
| `ingredient-ref-rice`, `ingredient-ref-toasted-rice-powder` and cooked/dry rice forms | Active grain/seasoning identities and forms | Generic rice, rice preparations, toasted rice powder (`poudre de riz rôti`), and rice forms are not furikake or aliases for it. |

The current forms file has no shichimi or furikake form. Related toasted-sesame and cooked/dry-rice forms do not describe either blend. No candidate name needs to be merged into or migrated from the legacy file.

## Recipe-demand audit

The audit covered every recipe listed in `manifest.v1.json`, all **114 recipes / 1,123 ingredient rows**, and searched the full recipe JSON plus ingredient text, normalized ingredient names, and reference/form identifiers. Accent- and punctuation-folded English/French searches covered the candidate names, `ichimi`, `nanami`, `rice seasoning`, `assaisonnement pour riz`, and `Japanese seven spice`; raw Unicode checks covered `七味`, `七味唐辛子`, and `ふりかけ`.

**Result: zero direct ingredient lines** request shichimi, nanami, ichimi, furikake, a furikake rice seasoning, or a generic rice topping. There is no recipe reference link to either candidate. Recipe 093, “Fried Rice,” is a nearby rice use, but its lines name cooked rice, onion, unspecified vegetables, unspecified cooked meat or seafood, egg, and fish sauce. That is not a furikake request. The no-demand result supports leaving recipe links and numeric behavior empty; the open plan item and product evidence still support adding the two external pantry identities.

## Identity and alias boundaries

### Shichimi togarashi

S&B distinguishes its seven-ingredient shichimi from ichimi, which it describes as the flavor and pungency of chili pepper itself. The manufacturer explicitly sells these as different products. Its global shichimi/nanami description says the blend varies with regional history and climate; the Metro Québec listing supplies one SKU’s example ingredients, including citrus peel, chili, nori, sesame, and sansho. Use these as class and boundary evidence, not as a universal seven-component formula. [S01–S05]

- Accept `nanami togarashi` as an English alias only. S&B says it writes 七味 as “Nanami” for overseas customers to avoid confusion with the similarly pronounced 一味 (*ichimi*); the alias is not a separate product identity. Do not add bare `nanami` or `togarashi`. [S04–S05]
- Keep separate from ichimi togarashi / pure chili pepper, red chili flakes, chili powders, and other chili-forward blends. Do not use `Japanese seven spice` or unqualified `seven spice` as aliases: these are broad and could collapse regionally distinct spice blends. [S03–S05]
- Use `mélange d’épices shichimi togarashi` as the Québec-facing French display because Metro uses that phrase. It describes the named blend; it is not evidence of a fixed composition or an OQLF ruling. [S01]

### Furikake

Furikake is a named savory Japanese rice seasoning/topping family, but it is not one recipe. Kikkoman describes mixes that are sprinkled over or mixed into rice, with both dry and soft-moist products and varied ingredients. MEXT separately lists furikake and ochazuke seasoning mix in its food-composition material; the latter is a prepared rice-and-broth product, not a furikake alias. A Montréal food source and Canadian French product listing use the borrowed word `furikake` in French. [S06–S09]

- Treat a product as furikake when it is named or explicitly sold as furikake. The English alias `furikake rice seasoning` is supported as a full, specific description; do not add broad `rice seasoning`, `rice topping`, or French `assaisonnement pour riz` as aliases. [S06–S09]
- Keep rice toppings generally, nori/seaweed, sesame, dried bonito, and other individual ingredients separate. They may be components, toppings, or uses without being furikake. [S06–S09]
- Keep ochazuke mixes, instant/prepared rice meals, rice-cooking seasoning packets, and other Japanese seasoning powders separate unless their product is specifically identified as furikake. Haisue’s one Nori Komi SKU is labeled furikake although its listed country of origin is China; do not encode Japanese manufacturing origin as an identity rule. [S07, S09]
- Do not treat product-specific flavor labels as aliases or ingredient forms. Do not infer fish, egg, soy, sesame, or other allergen content from the family name; product declarations remain SKU-specific. [S06–S09]

## Prior-review reconciliation

- The [WP05 Japanese condiments and preserves review](wp05-japanese-condiments-boundary-review-20261010.md) covers Japanese sauces, pastes, and preserved products. Its scope does not include shichimi or furikake.
- The [WP06 East Asia cuisine sweep](wp06-east-asia-cuisine-gap-sweep-20261011.md) and its [integration note](../batches/wp06-regional-cuisine-gap-identities-integration-20261011/README.md) cover five-spice and separate it from panch phoron and other blends; they do not review shichimi or furikake.
- The [WP05 regional spice-blend review](wp05-regional-spice-blends-ras-el-hanout-baharat-dukkah-review-20261011.md) integrates Baharat and cautions against inferring one formula or an unqualified seven-spice crosswalk. This review retains that boundary.
- The named spice-blend checklist is integrated. Broader Section T work remains open for other regional blends and spice-form distinctions.

## Source-to-claim register

Sources were accessed 2026-10-11. Source IDs are unique to this proposal and are not yet in the research ledger. Manufacturer and retailer formulations below describe the identified source product only.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SHICHIMI-FURIKAKE-20261011-S01` | Metro Québec, [Mélange d’épices shichimi togarashi](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/fines-herbes-epices-et-sauces/melanges-de-fines-herbes-et-d-epices/melange-d-epices-shichimi-togarashi/p/693997030206). | Source-attested Québec French display and one retail SKU’s title and ingredients. The listing’s inventory state is not used; its formula is not generalized. |
| `WP05-SHICHIMI-FURIKAKE-20261011-S02` | Metro, [Shichimi Togarashi Seasoning Blend](https://www.metro.ca/en/online-grocery/aisles/pantry/herbs-spices-sauces/herb-spice-blends/shichimi-togarashi-seasoning-blend/p/693997030206). | Paired English retail wording and the same SKU-specific ingredient example as S01. Supports the bilingual market-name pairing, not a standard blend formula. |
| `WP05-SHICHIMI-FURIKAKE-20261011-S03` | S&B Foods, [Small Packet Shichimi and Ichimi product release](https://www.sbfoods.co.jp/company/newsrelease/2010/1001_gyo_kobukuro.html) (Japanese). | Manufacturer distinguishes shichimi as a blend of seven ingredients from ichimi’s chili-pepper flavor and heat, and lists them as separate products. Does not define all makers’ formulas. |
| `WP05-SHICHIMI-FURIKAKE-20261011-S04` | S&B Foods, [Why is 七味唐からし written as NANAMI in English?](https://www.sbfoods.co.jp/customer/detail/00368.html) (Japanese). | Says S&B uses “NANAMI” for overseas customers because shichimi and ichimi sound similar. Supports the full English search alias `nanami togarashi`, not bare `nanami`. |
| `WP05-SHICHIMI-FURIKAKE-20261011-S05` | S&B Foods Global, [Nanami Togarashi (Assorted chili pepper)](https://www.sbfoods-worldwide.com/spices/nanami/). | Calls it a Japanese seven-spice blend and states that the formulation varies with regional history and climate. Supports the blend class and variability, not the identity of every product called “seven spice.” |
| `WP05-SHICHIMI-FURIKAKE-20261011-S06` | Kikkoman, [Furikake Rice Seasoning](https://www.kikkoman.com/en/culture/foodforum/trends-in-taste/37-3.html). | Describes furikake as a savory condiment for rice, distinguishes sprinkled and mix-in uses and dry versus soft-moist types, and documents wide ingredient/flavor variation. It is a food-culture feature, not a universal composition standard. |
| `WP05-SHICHIMI-FURIKAKE-20261011-S07` | Japan MEXT, [Food Composition Database: furikake with egg](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=17_17127_7) and [Notes on Foods](https://www.mext.go.jp/component/english/__icsFiles/afieldfile/2017/12/20/1385123_Notes-on-food_r11.pdf). | The official database translates one class as furikake / seasoning mix for rice containing dried seaweed and egg. The notes list an ochazuke seasoning mix as a separate item. These are composition-table samples, not definitions of all furikake products. |
| `WP05-SHICHIMI-FURIKAKE-20261011-S08` | La petite bette (Montréal), [Furikake, le parfait assaisonnement japonais](https://lapetitebette.com/recette/furikake/). | Supports French Québec usage of the borrowed name `furikake` and the phrase `assaisonnement japonais`; it explicitly discusses variations and gives one home recipe only. Not an official terminology source or universal ingredient specification. |
| `WP05-SHICHIMI-FURIKAKE-20261011-S09` | Haisue (Canadian retailer), [JFC Nori Komi Furikake — French listing](https://haisue.ca/fr/products/jfc-nori-komi-furikake-rice-seasoning-50g). | Supports French product wording `assaisonnement pour riz ... furikake` and one product’s suggested uses. The page identifies China as that SKU’s country of origin; its product name and details are not generalized to every furikake. |

## Final recommendation to the coordinator

The two separate identity-only rows are integrated with the displays and narrowly scoped aliases above. Recipe demand remains zero; component ingredients remain separate identities. Formula, product variants, allergen content, measurements, and preparation state remain outside the shared identity rows. No tests or emulator were run for this database JSON change; structural package and ledger validation is recorded in the [Section T integration README](../batches/wp05-section-t-spice-blends-identity-integration-20261011/README.md).
