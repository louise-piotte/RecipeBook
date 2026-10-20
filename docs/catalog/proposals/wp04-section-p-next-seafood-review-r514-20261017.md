# WP04 Section P R514 — canned sardines in tomato sauce product review

- **Review and online source-access date:** 2026-10-17.
- **Open checklist:** WP04 Section P's preserved seafood work covers smoked, salt-cured, dried, canned, oil-packed, water-packed, and fermented products ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7375)).
- **Gap selected:** The specifically named canned sardines in tomato-sauce product group, distinct from the existing broad canned-sardines group.
- **Integration:** Added one identity-only `PROTEIN` reference, `ingredient-ref-canned-sardines-in-tomato-sauce`, displayed as **canned sardines in tomato sauce / sardines en conserve à la sauce tomate**. It remains separate from generic canned sardines, raw sardine species, Atlantic herring, and smoked sardine fillets.
- **Scope:** A finished-food market group for current Canadian canned sardine products sold with tomato sauce. It does not identify a single fish species, standardize sauce composition, or apply to every sardine product, sauce-packed fish, or fresh sardine preparation.
- **Integration status:** Integrated on 2026-10-17 as an identity-only reference and research-ledger record. The generated ingredient index was refreshed. No app tests, builds, emulator checks, or deployment were needed for this database-data addition under `AGENTS.md`.
- **R514 source IDs:** `WP04-SECTIONP-SARDINES-TOMATO-SAUCE-R514-20261017-S01` through `S04`, plus read-only audit label `...-R01`. Reuse the existing R170 manufacturer-catalog, manufacturer-FAQ, and Codex source IDs identified below rather than registering duplicate URLs.

## Why this is a distinct gap

The active `ingredient-ref-canned-sardines` identity represents the broad canned-sardine market group. Its [R170 review](wp04-section-p-canned-sardine-product-boundary-review-r170-20261016.md) intentionally left sauce, seasoning, packing medium, cut, and drained state product-specific and added no forms. R514 evaluates one named finished product family rather than adding a tomato-sauce form to that broad identity.

Current Canadian manufacturer pages separately name Brunswick **Sardines with Tomato Sauce** and Gold Seal **Wild Sardines / Tomato Sauce**. Brunswick provides the same product title and ingredients in French as **Sardines Brunswick à la sauce tomate**. The current Metro French retailer page uses **Sardine en sauce tomate** for a canned consumer product. This gives a bounded, directly searchable bilingual product group with more than one maker and more than one current French wording. It does not show that the products share a recipe or fish species. [S01–S04]

Gold Seal identifies its own product as wild Pacific sardines, *Sardinops sagax*. Brunswick's current product page does not identify a species; the existing R170 manufacturer FAQ says Brunswick canned sardine products use North Atlantic herring, *Clupea harengus*. Those source-specific statements are a reason to keep the new product group species-neutral. Reuse the existing FAQ source ID; do not infer that the Brunswick and Gold Seal products share one taxon, or attach either taxon to the R514 row. [S03; reused R170-S01]

The product is not a form of the tomato-sauce ingredient. Its sauce is part of a named prepared seafood product, like the already distinct herring-fillets-in-tomato-sauce row. The integration adds a narrow product identity, not an alias or form on `ingredient-ref-canned-sardines`, `ingredient-ref-european-pilchard`, `ingredient-ref-pacific-sardine`, or `ingredient-ref-atlantic-herring`. The existing [smoked sardine fillets](wp04-section-p-gap-review-r256-20261016.md), [herring fillets in tomato sauce](wp04-section-p-canned-herring-fillets-tomato-sauce-boundary-review-r178-20261016.md), and generic `tomato sauce` identities remain separate.

This is unrelated to the recent [R508 shrimp-dumpling hold](wp04-section-p-next-seafood-review-r508-20261017.md) and [R511 shrimp-ring hold](wp04-section-p-next-seafood-review-r511-20261017.md). The [R501 freshwater crayfish identity](wp04-section-p-crayfish-boundary-recheck-r501-20261017.md) remains a freshwater crustacean, separate from these marine fish products.

## Integrated identity-only reference

| Field | Integrated value |
|---|---|
| ID | `ingredient-ref-canned-sardines-in-tomato-sauce` |
| Category | `PROTEIN` |
| English display | `canned sardines in tomato sauce` |
| Québec French display | `sardines en conserve à la sauce tomate` |
| English aliases | `sardines with tomato sauce` |
| French aliases | `sardines à la sauce tomate`; `sardine en sauce tomate` |
| Default density | `null` |
| Unit mappings | none |

The bilingual display is a transparent catalog label assembled from the current manufacturer and Québec retailer wording. The French aliases preserve the two source-attested forms: Brunswick's plural title and Metro's singular Grace title. These are product-name search terms, not OQLF terminology claims, brand aliases, or species names. Keep `Sardinops sagax`, Pacific sardine, Atlantic herring, *Clupea harengus*, Brunswick, Gold Seal, Grace, can size, and ingredient-panel wording out of aliases.

```json
{
  "id": "ingredient-ref-canned-sardines-in-tomato-sauce",
  "nameFr": "sardines en conserve à la sauce tomate",
  "nameEn": "canned sardines in tomato sauce",
  "aliasesFr": [
    "sardines à la sauce tomate",
    "sardine en sauce tomate"
  ],
  "aliasesEn": [
    "sardines with tomato sauce"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

The new ingredient-reference ledger record uses `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. It has no measurement observations, forms, recipe links, or substitutions. Source-specific package quantities remain in cited evidence, not reusable measurement data. The existing R170 and Codex source entries remain on their current owners; this record uses only R514-S01–S04. The broad parent identity and its decision were not altered.

## Current ownership, archive, and source audit

The R514 ownership audit snapshot was read on 2026-10-17 before the R515 and R514 integrations. Hashes are SHA-256 over the exact files at that audit snapshot; the references and ledger have since gained the R515 Oha row and this R514 row.

| Dataset | Current count | Bytes | SHA-256 |
|---|---:|---:|---|
| [Ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,787 | 583,452 | `84377e5b80f66568db3fbb33f740bd43b2bb31186de0338202bd48aec1eeea5e` |
| [Ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 143 | 113,370 | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| [Legacy candidates](../legacy-import-identities.v1.json) | 56 | 13,351 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| [Research ledger](../research-ledger.v1.json): records / source entries / distinct source IDs / distinct URLs | 2,144 / 9,840 / 8,327 / 7,037 | 10,048,944 | `b11f4cbf4690ea77e15e300b2a37d67d57e3caa52193e09f12611ec2ecf58018` |
| [Manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The exact-key audit followed accent, punctuation, and phrase normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It covered reference names/aliases, form IDs/labels/match terms, all legacy candidate IDs/names/aliases, ledger record IDs, source IDs and URLs, and the proposal/batch archive.

| Existing owner | Current scope | R514 boundary |
|---|---|---|
| `ingredient-ref-canned-sardines` | Active `canned sardines / sardines en conserve`; no aliases, forms, density, or mappings. Its ledger record owns the R170 canned-sardine review and manufacturer product catalogue. | Keep this broad product group unchanged. Do not attach tomato sauce as a form or alias to it. |
| `ingredient-ref-european-pilchard`; `ingredient-ref-pacific-sardine`; `ingredient-ref-atlantic-herring` | Separate raw species identities with qualified names. | Do not assign a species to the proposed prepared product or add species aliases. |
| `ingredient-ref-smoked-sardine-fillets` | Smoked fillet product group integrated from R256. | Keep smoke and fillet terms off the tomato-sauce identity. |
| `ingredient-ref-herring-fillets-in-tomato-sauce` | Separate herring product identity with tomato sauce. | Keep herring and sardine products separate; no cross-alias or substitution. |
| `ingredient-ref-tomato-sauce` | The standalone sauce ingredient. | Keep it distinct from a finished sardine-and-sauce product. |
| Exact proposed display/aliases and ID | At the pre-integration snapshot, no active reference, form, legacy candidate, or ledger record ID owned the R514 ID or exact bilingual product names. `canned sardines` / `sardines en conserve` remain owned by the broad canned-sardines row. | Add one new product identity; add no form or legacy mapping. |
| Prior archive | R170 covers generic canned sardines and explicitly excludes sauce variants as aliases/forms; it lists tomato-sauce as one family SKU, without allocating the exact bilingual product group. R256 covers smoked sardine fillets; R178 covers herring fillets in tomato sauce. No focused sardine-in-tomato-sauce identity or integration was found. | Treat R514 as a narrow finished-product follow-up while preserving all earlier decisions. |
| Source IDs and exact URLs | At the pre-integration audit snapshot, the four R514 product URLs and `WP04-SECTIONP-SARDINES-TOMATO-SAUCE-R514-20261017-S01`–`S04` had no exact live ledger owner. The R514 prefix was absent from the archive. | S01–S04 are now registered on the new record. Reuse the existing IDs below for URLs already owned by the canned-sardines parent or the species records. |

### Source-ID to one-URL register

Before integration, each R514 source ID mapped to one exact URL, and the four new URLs had no live ledger owner. The integration added S01–S04 to the new record; read-only audit label R01 remains proposal-local. Existing source IDs are reused without adding duplicate source identities or URL records.

| Source ID | Exact URL | Current owner and evidence limits |
|---|---|---|
| **WP04-SECTIONP-SARDINES-TOMATO-SAUCE-R514-20261017-S01** | [Brunswick Canada — Sardines with Tomato Sauce](https://brunswickcanada.ca/products/brunswick-sardines-in-tomato-sauce-106g/) | Unowned at the pre-integration audit; now registered on the R514 record. The manufacturer page names the product, lists sardines and tomato sauce ingredients, and gives this SKU's 106 g can nutrition basis. It does not identify the fish species on this product page, a recipe quantity, drained weight, or a reusable can measure. |
| **WP04-SECTIONP-SARDINES-TOMATO-SAUCE-R514-20261017-S02** | [Brunswick Canada — Sardines Brunswick à la sauce tomate](https://brunswickcanada.ca/fr/products/sardines-brunswick-dans-une-sauce-tomate-106-g/) | Unowned at the pre-integration audit; now registered on the R514 record. The French manufacturer page gives the exact plural Québec-facing wording, ingredients, and the same SKU's 106 g can basis. This is brand/SKU evidence, not an OQLF ruling or general package measure. |
| **WP04-SECTIONP-SARDINES-TOMATO-SAUCE-R514-20261017-S03** | [Gold Seal — Canned Wild Sardines Tomato Sauce](https://goldseal.ca/products/canned-sardines-in-tomato-sauce/) | Unowned at the pre-integration audit; now registered on the R514 record. The manufacturer page identifies its own product as wild Pacific sardines, *Sardinops sagax*, and lists tomato sauce. This species statement is SKU-specific and must not be transferred to the Brunswick or Grace product group. The page title lists 125 g; package amount remains product-specific. |
| **WP04-SECTIONP-SARDINES-TOMATO-SAUCE-R514-20261017-S04** | [Metro Québec — Sardine en sauce tomate Grace, 155 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/sardine-en-sauce-tomate/p/055270853283) | Unowned at the pre-integration audit; now registered on the R514 record. The French Metro product page lists the Grace product in the canned-food aisle, uses the singular French title, and gives a SKU ingredient panel. It showed the product out of stock at the selected Metro Devonshire store when reviewed; this is not evidence of Québec-wide stock or the product's species. |
| Reused **WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S01** | `https://brunswickcanada.ca/faq/` | Existing owner: `ingredient-ref-canned-sardines`. Brunswick says its canned sardine products use North Atlantic herring; this is maker-level context, not SKU-specific taxon assignment for each product. |
| Reused **WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S03** | `https://brunswickcanada.ca/products/` | Existing owner: `ingredient-ref-canned-sardines`. The current manufacturer catalogue lists tomato-sauce among the canned sardine products; it supports the broad family context but is not a substitute for the product-specific R514 pages. |
| Reused **WP04-SARDINE-FISH-BOUNDARY-20261011-S08** | `https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS%2B94-1981%2FCXS_094e.pdf` | Existing owners: `ingredient-ref-canned-sardines`, `ingredient-ref-european-pilchard`, and `ingredient-ref-pacific-sardine`. Codex CXS 94-1981 covers canned sardines/sardine-type products across multiple taxa and packing media; it is not a Canadian species assignment, Québec name ruling, or recipe measure. |
| **WP04-SECTIONP-SARDINES-TOMATO-SAUCE-R514-20261017-R01** | Repository audit, no external URL | Read-only checks of the open Section P plan, references, forms, legacy candidates, ledger/source ownership, source-ID/URL map, R170/R256/R178/R508/R511 archive, picker source, manifest, and every listed recipe. Supports only the repository snapshot, ownership, picker, and corpus findings in this proposal. |

The integration added one reference and one ledger record with four new source entries. The existing R170 / Codex source entries remain on their original ledger owners and were not duplicated. After the R515 and R514 integrations the snapshot is **1,789 references / 143 forms / 56 legacy candidates / 2,146 ledger records / 9,850 source entries / 8,337 distinct source IDs / 7,047 distinct URLs**. The broad `ingredient-ref-canned-sardines` record remains unchanged.

## Phrase-first picker projection

Projection follows phrase-first matching and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It uses bilingual names, aliases, forms, and the integrated reference names/aliases. Counts are distinct reference rows; the R515 Oha addition does not change the sardine query results.

| Query | Before R514 | After R514 | Effect |
|---|---|---|---|
| `canned sardines in tomato sauce`; `sardines in tomato sauce`; `sardines with tomato sauce` | No result | R514 tomato-sauce product only | Exact English product searches become available. |
| `sardines en conserve à la sauce tomate`; `sardines à la sauce tomate`; `sardine en sauce tomate` | No result | R514 tomato-sauce product only | Exact French product searches become available using manufacturer/retailer wording. |
| `canned sardines`; `sardines en conserve` | `ingredient-ref-canned-sardines` | Generic canned sardines plus the R514 tomato-sauce product | The broad canned-product query shows the parent market group beside the named product. Both names identify the difference visibly. |
| `sardines` | 4 rows: canned sardines, European pilchard, Pacific sardine, smoked sardine fillets | Those four plus the R514 product (5) | Remains a multi-result query. |
| `sardine` | 3 rows: European pilchard, Pacific sardine, smoked sardine fillets | Those three plus the R514 product (4) | The source-backed singular alias broadens the query, which remains multi-result. |
| `tomato sauce`; `sauce tomate` | 2 rows: tomato sauce and herring fillets in tomato sauce | Those two plus the R514 sardine product (3) | These remain broad multi-result searches; no tomato-sauce query becomes a singleton. |
| `canned`; `en conserve` | 18 / 17 rows | 19 / 18 rows | Each remains broad and gains one named product. |
| `tomate` | 6 rows | 7 rows | Remains broad; the R514 row is visibly a sardine product. |
| `smoked sardine`; `Pacific sardine`; `Atlantic herring` | Existing smoked-fillet, Pacific-sardine, and Atlantic-herring owners | Unchanged | No smoke, species, or herring term is added to the R514 row. |

No form hint, measure, or mapping is introduced. The new row is a separately named composite product, not a canned or tomato-sauce form on generic sardines.

## Manifest recipe-demand audit

The manifest lists **114** recipe files and **1,123** structured ingredient rows. The manifest-ordered scan parsed every recipe file and ingredient row, searched all decoded text for sardine-related names and product phrases, and checked tomato-sauce terms separately. It found **zero sardine mentions in recipe text, zero sardine ingredient rows, and zero rows requesting sardines in tomato sauce**.

One generic tomato-sauce hit is not seafood demand: recipe [090, African Peanut Stew](../../../app/src/main/assets/seed/bundled-library/recipes/090-ragout-aux-arachides-africain-african-peanut-stew-89f89f5e-4afc-4e3a-b37f-e7841ac24ff8.v1.json), row 1, requests `1 cup tomato sauce` linked to `ingredient-ref-tomato-sauce`. Its French description and instructions also mention `sauce tomate`; they do not mention sardines. Keep that row and the existing tomato-sauce owner unchanged.

The complete manifest-ordered recipe corpus totals **753,988 exact file bytes**, with fingerprint **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**. The digest was computed over each manifest-relative path encoded as UTF-8, a NUL byte, the exact recipe-file bytes, then a NUL byte. No bundled demand, recipe link, recipe amount, or method supports the R514 product identity.

## Measures, density, and substitutions

- **Package weights:** Brunswick lists a 106 g can; Gold Seal's manufacturer product page is titled 125 g; the Metro Grace listing gives 155 g. These are three SKU package claims, not interchangeable can sizes, fish-only mass, drained weights, recipe quantities, or servings. Keep these facts in source-specific evidence only; add no reusable `can` mapping, package yield, drained yield, or measurement observation.
- **Density and forms:** Set `defaultDensity: null` and `unitMappings: []`. Add no ingredient form, kitchen volume measure, density, count-to-mass mapping, or cooking conversion. Tomato sauce is part of the finished product composition, not a general form of sardine flesh.
- **Substitutions:** No reviewed product source or bundled recipe establishes a safe replacement amount or method between this sauce-packed product, plain canned sardines, raw sardine species, smoked sardine fillets, herring in tomato sauce, or standalone tomato sauce. Add no global or contextual rule, warning, yield, conversion, or recipe-line substitution.

## Disposition and evidence limits

The identity-only `ingredient-ref-canned-sardines-in-tomato-sauce` is now a narrow canned finished-food group. It gives direct product searches a visible choice while keeping broad canned sardines, raw fish species, the standalone sauce ingredient, tomato-sauced herring, and smoked sardine fillets distinct. The existing generic canned-sardine row and its ledger decision remain unchanged.

The manufacturer and retailer pages establish product names and selected product details, not a national market survey or a shared recipe. Brunswick's species statement is brand-level context; Gold Seal's Pacific-sardine statement is SKU-specific; Metro Grace does not name a taxon and showed no stock at its selected store. The French prepared-product names are source-backed market wording, not an OQLF or regulatory standard. The recipe corpus supplies no matching demand. No source supports a reusable measure, density, yield, conversion, or substitution. Static package/ledger validation, generated-index freshness, picker projections, and source ownership passed. No software tests were run under `AGENTS.md` for this database-data addition.
