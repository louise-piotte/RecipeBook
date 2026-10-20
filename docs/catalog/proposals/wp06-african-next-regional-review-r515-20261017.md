# WP06 African regional gap review R515 — Oha leaves

- **Date:** 2026-10-17
- **Status:** Integrated on 2026-10-17 as an identity-only reference and research-ledger record. The generated ingredient index was refreshed from the bundled seed package. No app tests, builds, emulator checks, or deployment were needed for this database-data addition under `AGENTS.md`.
- **Scope:** One Southeast Nigerian leafy-vegetable ingredient, Oha leaves, identified in Nigerian food research as *Pterocarpus mildbraedii*.
- **Integration:** Added one identity-only `VEGETABLE_AND_AROMATIC` reference: **`oha leaves / feuilles d’oha`**, ID `ingredient-ref-oha-leaves`. Added English alias `oha leaf` and French search alias `oha feuille`, matching Canadian retail wording. Kept other local names, scientific names, and prepared dishes outside the picker aliases. Added no forms, recipe links, measurements, density, mappings, conversions, yields, or substitutions.

## Open-plan fit and prior African decisions

The [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt) and [roadmap](../../../roadmap.md) keep the WP06 African regional sweep open. R515 is a bounded vegetable gap and does not claim to complete regional coverage.

The African proposal archive from R478 through R512 contains reviews for kuka powder (R478), dried *Gnetum* leaves (R481), grains of Selim (R484), ugu leaves (R487), shiro powder (R490), calabash nutmeg (R493), African basil leaves (R496), gboma leaves (R499), waterleaf (R502), garden egg fruit (R505), dried kinkeliba leaves (R509), and uziza leaves (R512). None covers *P. mildbraedii*. A case-insensitive whole-term audit of those proposals and their integration batches found no earlier Oha, Ora, Uha, or *P. mildbraedii* identity or hold.

## Integrated identity and bilingual naming

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-oha-leaves` |
| English display | `oha leaves` |
| French display | `feuilles d’oha` (provisional descriptive fr-CA wording) |
| Category | `VEGETABLE_AND_AROMATIC` |
| English aliases | `oha leaf` |
| French aliases | `oha feuille` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| Forms, recipe links, active conversions, yields, substitutions | None |

The 2026 Nigerian study identifies Oha as *P. mildbraedii*, describes it as a leafy vegetable used in soups in Southern Nigeria, and studies fresh and dried leaves. Kew accepts the species and records its native range in West and West-Central Tropical Africa. Contemporary Canadian listings use `Oha Leaf`/`Oha Leaves`; one Toronto delivery listing pairs `Oha Leaf` with the French market label `Oha Feuille`. Use grammatical French `feuilles d’oha` as a transparent, provisional display, and preserve the retailer’s exact phrase as a search alias. This is not a Québec terminology ruling.

Targeted OQLF and TERMIUM searches did not surface an entry for this ingredient or species. The Canadian French wording found is on a Toronto retailer marketplace listing and is evidence of that listing only. Do not describe `oha feuille` as standardized French. The reviewed Ontario and Alberta retail pages are English listings and do not establish a Québec French term.

Use the vegetable classification because the regional source describes Oha as a leafy vegetable used in soup. The proposed identity covers the named leaves without asserting equivalence among fresh, frozen, dried, or other retail states. Preserve *Pterocarpus mildbraedii* in research records only, consistent with the current catalog policy.

## Duplicate, alias, and archive audit

Read-only review covered the live [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), manifest-listed recipe corpus, [picker search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), plan, roadmap, and WP06 African proposal/batch archive.

Before integration, the snapshot was **1,787 references, 143 forms, 56 legacy candidates, and 2,144 ledger records**. Exact normalized-key checks found no prior active reference, form, legacy, or ledger owner for `oha`, `oha leaf`, `oha leaves`, `feuilles d’oha`, `oha feuille`, `ora leaves`, `uha leaves`, or *P. mildbraedii*. The ID `ingredient-ref-oha-leaves` and source-ID prefix `WP06-AFRICA-OHA-LEAVES-R515-20261017-S` were unused. No earlier R478–R512 proposal or batch contains an Oha review.

Nearby active identities remain distinct:

| Current identity | Boundary |
|---|---|
| `ingredient-ref-gboma-leaves` — gboma leaves | Leaves of *Solanum macrocarpon*, not *P. mildbraedii*. |
| `ingredient-ref-garden-egg` — garden egg | The edible fruit of *Solanum aethiopicum*, not a leafy product. |
| `ingredient-ref-uziza-leaves` — uziza leaves | A separate *Piper guineense* leaf ingredient. |
| `ingredient-ref-african-basil-leaves` — African basil leaves | A separate aromatic leaf product. |
| `ingredient-ref-waterleaf-talinum-fruticosum` — waterleaf | A separate *Talinum* leaf vegetable. |
| `ingredient-ref-vernonia-amygdalina-leaves` — *Vernonia amygdalina* leaves | A separate bitter-leaf identity; no bitter-leaf alias is transferred. |

The archive search is an exact-term audit, not a claim that every historical African naming discussion has been exhaustively re-reviewed. It found no candidate-specific record or prior proposal for this leaf identity.

## Alias boundaries and picker projection

| Term | Decision | Reason |
|---|---|---|
| `oha leaves` | English display | Directly matches the Canadian seller product wording and regional food use. |
| `oha leaf` | English alias | The Toronto retailer uses this singular product label. It lets the common singular query resolve as well as the plural display. |
| `feuilles d’oha` | Provisional French display | Transparent fr-CA description; no authoritative Québec product term was found. |
| `oha feuille` | French alias | Exact French-language Toronto marketplace wording. Preserve as a source-specific search phrase, not a standardized term. |
| `ora`, `ora leaves` | Keep out of aliases | A Calgary seller uses `Oha Leaves (Ora)`, but this spelling is not consistently present in the reviewed Canadian product naming. The current one-word query `ora` produces 27 unrelated partial matches; adding `ora leaves` would create an exact `ora` token match and replace those results. Keep it as source evidence unless region/language-scoped aliases become available. |
| `uha`, `Uha leaves` | Keep out of aliases | These forms appear in other Nigerian market material but are not corroborated by the focused regional study or the reviewed Canadian product labels. |
| `Oha soup`, `Ora soup`, `Ofe Oha` | Keep out of aliases | These are prepared dishes, not ingredient names. |
| `African rosewood leaves`, *Pterocarpus mildbraedii* | Research only | The former is a broader common-name construction; the latter is the scientific name. Neither is needed as a global recipe-picker alias. |
| `bitter leaf`, spinach, other soup leaves | Keep separate | A shared recipe role or seller comparison does not establish same identity or substitution. |

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, and punctuation, returns complete word-phrase matches before substring fallback, and indexes reference terms with linked forms. Results below project the live references/forms plus the proposed display and aliases; they are not runtime UI checks.

| Query | Current result | With proposal |
|---|---:|---:|
| `oha leaves`; `oha leaf`; `feuilles d’oha`; `oha feuille` | 0 | 1: `ingredient-ref-oha-leaves` |
| `oha` | 3 partial matches, all existing poha products | 1: proposed Oha leaves row; the complete token match takes priority over the existing `poha` substring matches |
| `ora leaves` | 0 | 0; alternate spelling is not activated |
| `ora` | 27 unrelated partial matches | 27 unchanged; no broad `ora` alias is added |
| `Pterocarpus mildbraedii`; `African rosewood leaves` | 0 | 0; scientific and broad botanical wording remain out of aliases |
| `leaf`; `leaves` | 19; 34 | 20; 35 |
| `feuille`; `feuilles` | 11; 42 | 12; 43 |

## Full manifest recipe scan

The manifest lists **114 recipe files and 1,123 ingredient rows**, totalling **753,988 exact recipe bytes**. The manifest-ordered corpus fingerprint is **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**; it hashes each relative recipe path, NUL, exact file bytes, and NUL.

All 114 files and all 1,123 ingredient rows were scanned for Oha/Ora/Uha, *Pterocarpus mildbraedii*, and African-rosewood-leaf wording. Result: **zero full-file hits and zero ingredient-row hits**. The bundled corpus supplies no recipe demand, ingredient amount, form state, or relink for this candidate.

## Forms, measurements, and substitutions

Retail pages distinguish fresh/frozen and dried offerings, and the Nigerian paper studies fresh and dried leaves. This is enough to document variable marketed states, but not to assert a shared processing taxonomy, direct fresh-to-dried conversion, rehydration yield, or recipe behavior. Add no form records at this checkpoint.

The listed 30 g and other package weights are SKU quantities, not kitchen measures or portion weights. The 2026 paper reports laboratory composition and drying outcomes, not a culinary volume-to-mass relation. Set no `defaultDensity`, unit mapping, measurement observation, conversion, or reusable amount. Proposed research state: `measurementState: researched_no_supported_value`.

No reviewed source establishes a tested replacement for Oha leaves. Similar roles of spinach or other soup leaves do not support substitution. Keep substitution research `not_yet_researched`; add no active or contextual substitution, warning, or recipe substitution link.

## Source register and source-ID-to-URL ownership

Before integration, the live ledger had **9,840 source entries, 8,327 distinct source IDs, and 7,037 distinct URLs**. A full ID-to-URL audit found **zero source IDs mapped to multiple URLs**. The six source URLs below were unowned, and each new R515 source ID mapped to exactly one URL. The source-ID prefix was also confirmed absent.

| Source ID | Source and exact URL | Evidence and limits |
|---|---|---|
| `WP06-AFRICA-OHA-LEAVES-R515-20261017-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Pterocarpus mildbraedii*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:516516-1/general-information). | Accepts the species and gives a West and West-Central Tropical African native range. Botanical context only; it does not establish a food name or culinary use. URL was unowned at the pre-integration audit; it is now registered on this record. |
| `WP06-AFRICA-OHA-LEAVES-R515-20261017-S02` | Oko-Olughu et al., [“Effect of Sun Drying and Shade Drying on the Proximate and Phytochemical Composition of Oha (*Pterocarpus mildbraedii*) Leaves”](https://journals.ipsintelligentsia.com/food-science/index.php/ajnar/article/view/209), *African Journal of Nutrition and Applied Research* (2026), abstract and methods. | Nigerian authors identify Oha as *P. mildbraedii*, a leafy vegetable used for soup in Southern Nigeria; study samples came from Kpirikpiri market, Abakaliki, and compare fresh, shade-dried, and sun-dried leaves. The sample/composition data do not provide recipe measures or conversions. URL was unowned at the pre-integration audit; it is now registered on this record. |
| `WP06-AFRICA-OHA-LEAVES-R515-20261017-S03` | iLeOja, [Oha Leaf (dried)](https://ileoja.ca/oha-leafdried/), Toronto-area African grocery seller. | Canadian product listing uses the singular English label. Package weight information is SKU-specific; the page does not identify the species or establish a kitchen measure. URL was unowned at the pre-integration audit; it is now registered on this record. |
| `WP06-AFRICA-OHA-LEAVES-R515-20261017-S04` | Noi African Supermarket, [French-language Toronto delivery listing](https://www.skipthedishes.com/fr/noi-african-restaurant), “Dried Oha Leaf / Oha Feuille (30 g)” and “Fresh Frozen Oha Leaf.” | Supports the exact Canadian retail phrase used as a French search alias and shows separately listed dry and fresh-frozen products. The marketplace text is seller copy, not Québec terminology guidance or species authentication; package weights are SKU values only. URL was unowned at the pre-integration audit; it is now registered on this record. |
| `WP06-AFRICA-OHA-LEAVES-R515-20261017-S05` | Folak African Foods, [Oha Leaves](https://folakafricanfoods.com/product/oha-leaves/), Kitchener, Ontario. | Retail page names *P. mildbraedii* and lists frozen/dried product options. At review it showed “Notify Me When Available”; use the page for product-name/state evidence, not availability or an independent botanical determination. URL was unowned at the pre-integration audit; it is now registered on this record. |
| `WP06-AFRICA-OHA-LEAVES-R515-20261017-S06` | King’s Table Produce, [Oha Leaves (Ora)](https://kingstableproduce.com/product/oha-leaves/), Calgary, Alberta. | Product title supplies the localized alternate wording `Ora`; it does not establish a global alias or a Québec French name. Its broad one-word picker collision is why `ora` remains evidence only. URL was unowned at the pre-integration audit; it is now registered on this record. |

## Integrated reference and ledger fields

The integration added only this identity row and a corresponding research-ledger record keyed by `ingredient-ref-oha-leaves`:

```json
{
  "id": "ingredient-ref-oha-leaves",
  "nameFr": "feuilles d’oha",
  "nameEn": "oha leaves",
  "aliasesFr": ["oha feuille"],
  "aliasesEn": ["oha leaf"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "VEGETABLE_AND_AROMATIC"
}
```

The ledger states are `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`. It attaches only source IDs S01–S06 from the table. Recipe links, forms, measurement observations, conversions, yields, and substitutions remain empty. No `Ora`, `Uha`, soup-dish name, or scientific-name alias was added.

## Validation and evidence limits

After integration, the bundled package and ledger schema validated, the generated Kotlin index freshness check passed, all six source IDs remained uniquely mapped to their URLs, and no source-ID/URL ownership conflict was found. Static picker projection and the 114-file / 1,123-row recipe scan remain as recorded above. Seed JSON is UTF-8 without BOM and stores the French punctuation as Unicode escapes. No app tests, build, emulator, or deployment were run, following the database-data rule in `AGENTS.md`.

The strongest regional evidence is a recent study based on market leaves in Southern Nigeria, and the species identity is corroborated by Kew. The exact English retail wording is supported by Canadian specialty retailers; the French phrase is supported only as a retailer marketplace label, not an authoritative Québec term. Retail pages are not independent botanical authentication, product-state equivalence, or recipe evidence. Broader African regional coverage and independent community/Québec terminology review remain open.
