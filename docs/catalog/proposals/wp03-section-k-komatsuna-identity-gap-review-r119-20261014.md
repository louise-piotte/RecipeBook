# WP03 Section K komatsuna identity-gap review (R119)

- **Reviewed:** 2026-10-14
- **Review slot:** R119
- **Status:** Integrated by root on 2026-10-14 as an identity-only reference with source-specific ledger observations.
- **Scope:** One distinct fresh culinary leafy-green identity, komatsuna.
- **Decision:** Propose one identity-only reference, `ingredient-ref-komatsuna`, in `VEGETABLE_AND_AROMATIC`. Use `komatsuna` for EN and fr-CA display. Proposed EN aliases: `komatsu-na`, `mustard spinach`, `spinach mustard`, and `Japanese mustard spinach`; no FR aliases. Add no forms, density, unit mappings, conversion, yield, substitution rules, or bundled recipe links.
- **Source-ID prefix:** `WP03-K-KOMATSUNA-20261014-S`; absent from the reviewed ledger snapshot.

## Exact open plan item and review boundary

This proposal addresses the still-open Section K checklist item in `docs/RecipeBook-global-ingredient-catalog-plan.txt`:

> [ ] Continue the broader lettuce, leafy-green, and brassica sweep beyond these named identities; resolve additional market and regional types with source evidence and reviewer input.

Komatsuna is a separate named *Brassica rapa* leafy crop, not another name for mizuna, mibuna, tatsoi, spinach, or generic mustard greens. The Oregon State Extension guide distinguishes komatsuna's dark-green leaves and slender petioles from the narrow-leaved mibuna, serrated mizuna, and low rosette-form tatsoi. The Québec sources also distinguish komatsuna from mizuna and mibuna. This review covers one candidate only; it does not close the wider Section K sweep or its independent bilingual review.

## Repository audit and snapshot

I searched the Section K plan and checklist, WP03 proposals and batches, active reference and form JSON, `docs/catalog/legacy-import-identities.v1.json`, `docs/catalog/research-ledger.v1.json`, and all manifest-listed recipe files. There is no Komatsuna identity, alias, form, legacy candidate, ledger record, prior Komatsuna proposal, or bundled recipe-line hit. The already-integrated Tokyo Bekana identity (R118) is distinct and remains untouched. The R117 tatsoi review mentioned `spinach mustard` as an unassigned spelling and rejected it for tatsoi; it did not assign that name to a commodity. Crop-specific sources reviewed here identify `spinach mustard` and `mustard spinach` with Komatsuna.

Snapshot at review time:

| File or corpus | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,463 references | `17ebce2b7ed8bc7de3b3176ee82141521ca46a628bb35613005b4822209b27e3` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 105 forms | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/legacy-import-identities.v1.json` | 63 candidates | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `docs/catalog/research-ledger.v1.json` | — | `9ae2b920f0f605f711ee53253dda47c8ae3746195fd9cc30c711db6dc5124489` |
| Manifest-ordered bundled recipe corpus | 114 files / 1,123 ingredient rows | `75c7b6d7cd99fd7eee849be3a49970dc2aac5a92f2c3192a8bf80f75e785973f` |

The recipe-corpus digest is SHA-256 over each manifest-listed relative recipe path, a NUL byte, that file's SHA-256 hex digest, and a newline, concatenated in manifest order. The source prefix was not present in the ledger at the proposal snapshot. The proposal author made no shared catalog, ledger, checklist, roadmap, generated-index, recipe, or batch changes; root integrated the reviewed proposal afterward.

## Candidate identity and bilingual display

| Candidate ID | Category | EN display | fr-CA display | EN aliases | FR aliases | Scope |
|---|---|---|---|---|---|---|
| `ingredient-ref-komatsuna` | `VEGETABLE_AND_AROMATIC` | `komatsuna` | `komatsuna` | `komatsu-na`, `mustard spinach`, `spinach mustard`, `Japanese mustard spinach` | none | Fresh culinary komatsuna leaves and tender stems; exclude unrelated mustard greens, mizuna, mibuna, and microgreens. |

The Québec marketplace evidence is a seasonal, search-indexed product listing, not proof of current availability; it uses `Komatsuna` as the product name in French-language material. A bilingual Canadian seed listing uses `Verdure asiatique ‘Komatsuna’`, and the 2010 Montréal gardening guide also names `komatsuna` in French. These support borrowed-name use in local market/horticultural wording, not a current Québec whole-vegetable retail listing. The current fresh whole-vegetable listing reviewed here is from a Toronto retailer and uses English wording. Use the translingual market name for both displays only as a proposal, while keeping its status explicit: **the borrowed fr-CA market wording is not OQLF-standardized**. A site-scoped search of the OQLF Vitrine linguistique for `komatsuna` and `moutarde épinard` did not surface a dedicated entry. Keep the display open to independent Québec French review and do not present it as OQLF-approved.

The proposed EN aliases are exact crop names in extension/regulatory or Canadian retail/recipe sources. No proposed phrase has an exact normalized owner in active references, forms, or legacy candidates. Do not add bare `spinach`, `mustard`, `mustard greens`, `Japanese mustard greens`, `Asian greens`, `moutarde épinard`, or `épinard moutarde`: those are broader terms, belong to other crop descriptions, or lack Québec terminology support. In particular, `Japanese mustard greens` is associated with mizuna in the reviewed extension material and would make the existing `mustard greens` query return another identity.

### Exact alias ownership and picker projection

The audit follows `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: NFKD normalization, accent and punctuation folding, complete phrase matching before substring fallback, and inclusion of attached form terms.

| Query or term | Current exact owner / picker results | With proposal | Decision |
|---|---|---|---|
| `komatsuna`, `komatsu-na`, `mustard spinach`, `spinach mustard`, `Japanese mustard spinach` | No active reference/form/legacy exact owner; each picker query returns 0 | Each resolves to `ingredient-ref-komatsuna` | Add the source-backed market spellings as EN aliases. |
| `spinach` | 3: `ingredient-ref-baby-spinach`, `ingredient-ref-malabar-spinach`, `ingredient-ref-water-spinach`; legacy file also retains the old unreviewed `ingredient-ref-spinach` candidate | 4, adding Komatsuna through its qualified aliases | Disclose the broader result set; do not add bare `spinach`. |
| `mustard` | 11 references | 12, adding Komatsuna through its qualified aliases | Disclose broad-token expansion; do not add bare `mustard`. |
| `mustard greens` | 2: `ingredient-ref-mustard-greens`, `ingredient-ref-pickled-mustard-greens` | unchanged at 2 | Keep this distinct phrase owned by the existing mustard-greens references. |
| `Japanese mustard greens` | 0 | unchanged at 0 | Do not add; it is not a Komatsuna alias in these sources. |
| `mizuna` / `mibuna` | 1: `ingredient-ref-mizuna` / 0 | unchanged | Keep neighboring crop identities distinct. |

The exact crop-name aliases do expand broad `spinach` and `mustard` picker searches. They do not create an exact-name collision: the returned candidate remains explicitly labelled `komatsuna`, and exact `mustard greens` ownership stays unchanged. The coordinator can drop any EN synonym if the independent reviewer considers that broad-query effect undesirable; the display name alone remains sufficient for `komatsuna` lookups.

## Bundled demand, quantities, density, and culinary boundaries

The bundled recipe corpus has zero Komatsuna, `komatsu-na`, `mustard spinach`, `spinach mustard`, or `Japanese mustard spinach` hits across 114 recipes and 1,123 ingredient rows. Do not create a bundled recipe link.

External usage and measure observations remain source-specific:

- The Marché de proximité de Québec listing says Komatsuna can be eaten raw or cooked and cooked like bok choy. This is market cooking advice, not a recipe link, equivalence, or generally safe bok-choy substitution.
- Daily Seafood (Toronto) lists a fresh `Mustard Spinach - Komatsuna` pack at approximately 200 g. Fukuya Foods lists a 200 g product under `Japanese Mustard Spinach Komatsuna`, but it was marked sold out when checked. Package listings are SKU observations, not a standard bunch, portion, or conversion.
- Kikkoman's two-serving recipe uses 200 g; Ajinomoto's four-serving recipe uses one bundle (400 g); Tokyo's Adachi Ward one-serving recipe uses 80 g. These recipe amounts show culinary demand outside the bundled corpus. They do not establish a reusable serving, bundle mass, or unit mapping.
- No Komatsuna-specific default density, cup weight, general mass-volume conversion, unit mapping, or preparation/cooking yield was found. The 2023 Québec greenhouse report's kg/m² figures are agricultural production yields, not edible-portion or recipe conversions. The Health Canada CNF search surfaced no Komatsuna food record in its searchable 2015 release, which Health Canada says is not being updated while it prepares access to the CNF 2026 dataset; treat that as a limited negative search, not a permanent claim.
- Fukuya's product copy calls Komatsuna a “spinach substitute,” but provides no dish, ratio, or application boundary. Keep spinach and Komatsuna as separate identities and add no global or contextual substitution rule from this marketing statement.
- Sources discuss tender leaves, bunching greens, salad use, blanching, and cooking, but do not justify a catalog preparation form or conversion between states. Add no forms.

Leave `defaultDensity` null, `unitMappings` empty, recipe links empty, and substitutions empty.

## Sources reviewed on 2026-10-14

| Source ID | Source | Observation and limitation |
|---|---|---|
| `WP03-K-KOMATSUNA-20261014-S01` | Oregon State University Extension, [Winter vegetable production on small farms and gardens west of the Cascades](https://extension.oregonstate.edu/catalog/pnw-548-winter-vegetable-production-small-farms-gardens-west-cascades). | Identifies Komatsuna as *Brassica rapa* var. *perviridis*, lists mustard spinach and spinach mustard, and describes bunching greens with dark-green leaves and slender petioles. It distinguishes Komatsuna from mibuna, mizuna, misome, and tatsoi. Extension horticulture evidence, not a Québec terminology ruling or household-measure source. |
| `WP03-K-KOMATSUNA-20261014-S02` | IR-4 Project, [Type 2 Vegetable Commodity Groups (2017)](https://ir4.cals.ncsu.edu/fooduse/Crop%20Grouping/Type%202%20Vegetable%20Commodity%20Groups%202017.pdf). | Lists commodity Komatsuna as *Brassica rapa* var. *perviridis* and cross-references `Mustard spinach` to Komatsuna. This regulatory crop-group nomenclature supports alias ownership, not a French display or measurement. |
| `WP03-K-KOMATSUNA-20261014-S03` | Ville de Montréal, [Feuille de chou — automne 2010](https://ville.montreal.qc.ca/pls/portal/docs/page/prt_vdm_fr/media/documents/feuille_chou_automne_2010.pdf). | French horticultural material names komatsuna and distinguishes it from mizuna and mibuna. It is a dated local gardening source, not current retail evidence or OQLF terminology. |
| `WP03-K-KOMATSUNA-20261014-S04` | CETAB+ / MAPAQ, [Légumes asiatiques : brocoli chinois, céleri chinois, komatsuna, mitsuba, mizuna et tatsoï (2023)](https://cetab.bio/wp-content/uploads/culture-legumes-asiatiques-brocoli-celeri-chinois-komatsuna-mitsuba-mizuna-tasoi-cetab-2023.pdf). | Reports a Québec farm trial of Komatsuna and Mibuna and provides greenhouse crop yields in kg/m². Supports regional crop identity/cultivation only; those yields are not household or recipe measures. |
| `WP03-K-KOMATSUNA-20261014-S05` | Marché de proximité de Québec, [Légumes et légumineuses](https://www.marchequebec.org/legumes-et-legumineuses-cat5.html). | Search-indexed seasonal product material from Ferme Décembre names `Komatsuna`, calls it an Asian green, and describes raw/cooked use. It supports Québec market wording, not current whole-vegetable availability or a standardized name. The cooking-like-bok-choy line is not a substitution ratio. |
| `WP03-K-KOMATSUNA-20261014-S06` | Gaia Organics (Ottawa), [Komatsuna Asian Greens](https://gaiaorganics.ca/product/komatsuna-asian-greens/). | Bilingual seed-product page uses `Komatsuna Asian Greens` / `Verdure asiatique ‘Komatsuna’`. Supports a Canadian French-facing product label; it is seed, not fresh-produce retail. |
| `WP03-K-KOMATSUNA-20261014-S07` | Daily Seafood, [Mustard Spinach - Komatsuna (≈200 gm)](https://shop.dailyseafood.ca/products/6380e93cdd9f96002ee4fdfc/spinach-japanese-komatsuna-mustard-200gm). | Canadian retailer product title uses `Mustard Spinach - Komatsuna`, lists an approximately 200 g fresh pack, and suggests salad/stir-fry/soup uses. Product quantity is retailer-specific. |
| `WP03-K-KOMATSUNA-20261014-S08` | Fukuya Foods, [Japanese Mustard Spinach Komatsuna](https://fukuya.ca/products/japanese-mustard-spinach-komatsuna). | Canadian retailer lists the Japanese mustard spinach name and 200 g pack; the product was marked sold out at review. Its `spinach substitute` claim is promotional copy without a recipe context or ratio. |
| `WP03-K-KOMATSUNA-20261014-S09` | Ajinomoto / Umami Recipes, [Marinated Shiitake Mushrooms and Komatsuna](https://www.ajinomoto.com/umami/umami_recipes/marinated-shiitake-mushrooms-and-komatsuna). | Four-serving recipe lists one bundle (400 g) as `komatsu-na` and blanches, chills, squeezes, and cuts the greens. Keep the recipe-specific quantity; it does not define a standard bundle or cooked yield. |
| `WP03-K-KOMATSUNA-20261014-S10` | Kikkoman, [Komatsuna with Sesame Seeds](https://www.kikkoman.com/en/cookbook/recipe/00001000.html). | Two-serving recipe uses 200 g and calls it `komatsuna / Japanese mustard spinach`; blanching and squeezing are recipe instructions, not a general prep conversion. |
| `WP03-K-KOMATSUNA-20261014-S11` | Adachi City, Tokyo, [Komatsuna Sesame-Mayo Salad](https://www.city.adachi.tokyo.jp/kokoro/fukushi-kenko/recipe/komatsuna-gomamayo.html). | Municipal one-serving recipe lists 80 g Komatsuna. Retain as a source-specific recipe amount only. |
| `WP03-K-KOMATSUNA-20261014-S12` | OQLF, [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/). | Site-scoped searches for `komatsuna` and `moutarde épinard` did not surface a dedicated entry. Negative search only; do not call the fr-CA market display OQLF-standardized. |
| `WP03-K-KOMATSUNA-20261014-S13` | Health Canada, [Canadian Nutrient File search](https://food-nutrition.canada.ca/cnf-fce/). | The searchable 2015 release did not surface a Komatsuna food record. Health Canada says that release will not be updated while it works toward access to CNF 2026; no measurement conclusion is claimed beyond the reviewed dataset. |

## Coordinator review and integration

An independent reviewer accepted `komatsuna` as a provisional borrowed fr-CA market display based on the Montréal French gardening guide and Ottawa bilingual seed listing. The reviewer confirmed that the indexed Québec marketplace evidence is seasonal and does not establish current availability or an OQLF-standardized term.

Root integrated `ingredient-ref-komatsuna` in `VEGETABLE_AND_AROMATIC`, with `komatsuna` for both display names, the four proposed EN aliases, no FR aliases, `defaultDensity: null`, and `unitMappings: []`. The ledger records the two 200 g retailer package observations and the three source-specific recipe amounts; none is a reusable measure. The Fukuya spinach-substitute claim remains blocked. No form, bundled recipe link, conversion, yield, or active substitution was added.

The Section K checklist records this identity while the broader leafy-green/brassica sweep and independent Québec terminology review remain open. Static package, ledger, generated-index, picker-ownership, and corpus checks were performed. No app, Gradle, instrumentation, or emulator tests were run because the catalog change adds database JSON data under the updated `AGENTS.md` rule.
