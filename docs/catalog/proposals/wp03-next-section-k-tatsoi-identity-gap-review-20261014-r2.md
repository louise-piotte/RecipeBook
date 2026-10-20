# WP03 Section K tatsoi / tat choy identity-gap review (R117)

- **Reviewed:** 2026-10-14
- **Review slot:** R117
- **Status:** Root-reviewed and integrated in R117. See the [integration README](../batches/wp03-section-k-tatsoi-identity-integration-20261014/README.md). The reference and ledger changed; no recipe or runtime behavior was added.
- **Scope:** one fresh culinary leafy-green identity, tatsoi.
- **Decision:** accepted one identity-only reference, `ingredient-ref-tatsoi`, in `VEGETABLE_AND_AROMATIC`. Use `tatsoi` for both EN and fr-CA display. Add the source-backed EN search aliases `tat soi`, `tah tsai`, and `tat choy`; add no FR alias because the observed `tatsoï` spelling normalizes to the display name. Add no forms, density, unit mappings, conversions, yield, substitution rule, or bundled recipe link.
- **Source-ID prefix:** `WP03-K-TATSOI-20261014-S`; these source records were added to the ledger during R117 integration.

## Exact plan item and review boundary

This review addresses the still-open Section K line in `docs/RecipeBook-global-ingredient-catalog-plan.txt` (line 4211 at review time):

> [ ] Continue the broader lettuce, leafy-green, and brassica sweep beyond these named identities; resolve additional market and regional types with source evidence and reviewer input.

The recent mizuna entry is integrated, while the broader sweep remains open. Tatsoi does not appear among the named completed Section K identities or in prior proposals. Keep the identity separate from bok choy and Chinese/Napa cabbage: Ontario crop guidance calls bok choy and Chinese cabbage close relatives, and Québec grower Le Rizen describes tatsoi as a cousin of bok choy with a thinner stem and rounder leaves. Sources use different ranks for the botanical group, so the proposal uses the stable market name rather than adding a taxonomic rank to the catalog identity.

## Repository audit and snapshot

I searched WP03/WP06 proposals and batches, Section K plan/checklist text, live references and forms, the legacy import candidates, research ledger, and all manifest-listed bundled recipes for `tatsoi`, `tatsoï`, `tat soi`, `tah tsai`, `tat choy`, `tat choi`, `tasai`, `wuta cai`, `rosette bok/pak choy`, `spoon mustard`, `spinach mustard`, `Chinese Savoy`, and `broad-beaked mustard`. No exact candidate, alias, form, legacy identity, ledger record, previous proposal, batch, or recipe-line hit was found. The new source-ID prefix was also unused.

The following counts and hashes are the proposal-time snapshot, before R117 integration:

| File or corpus | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,459 references | `0d819668694783ac8975914236aaf447d77c36ae0a2f61fbce52193f22b1738b` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 105 forms | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/legacy-import-identities.v1.json` | 63 candidates | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `docs/catalog/research-ledger.v1.json` | 1,799 records / 7,380 source entries / 6,260 distinct source IDs | `c34c23d9c6bd631cb9c573bcfa9de7cec7463c3b8977e9f40bacae6489c58568` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | `75c7b6d7cd99fd7eee849be3a49970dc2aac5a92f2c3192a8bf80f75e785973f` |

The corpus digest is SHA-256 over each manifest-listed relative recipe path, a NUL byte, that file's SHA-256 hex digest, and a newline, concatenated in manifest order. A scan of the complete corpus found zero tatsoi-related ingredient-row hits.

## Candidate, Québec name, and aliases

| Candidate ID | Category | EN display | fr-CA display | Proposed aliases | Scope |
|---|---|---|---|---|---|
| `ingredient-ref-tatsoi` | `VEGETABLE_AND_AROMATIC` | `tatsoi` | `tatsoi` | EN: `tat soi`, `tah tsai`, `tat choy`; FR: none | Fresh culinary tatsoi rosettes/leaves and tender stems; exclude microgreens and related brassicas. |

The French display can use `tatsoi` as a Québec-market name rather than being held. Aliments du Québec lists fresh `Tatsoi` from a Laval produce company, and Le Rizen uses `Tatsoi` as the heading on its French-language grower page. A Québec market listing also spells it `Tatsoï`; the IGA French article uses that spelling for microgreens. The normalizer folds `ï` to `i`, so `tatsoï` input resolves to the proposed `tatsoi` display without a separate alias. I found no dedicated OQLF GDT entry for tatsoi/tatsoï. That makes this a well-supported borrowed market label, not a standardized terminology ruling; keep it open to the Section K bilingual review.

The English variants `tat soi` and `tah tsai` are directly listed for the same crop by Ontario's Ministry of Agriculture, Food and Rural Affairs (OMAFRA). A Canadian seed catalogue labels its Asian salad-green entry `Tat Soi ... Tat Choy`, supporting `tat choy` as a crop-name variant; no current Québec fresh-food source used that exact form.

Picker audit follows `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` (NFKD, accent folding, punctuation-to-space, complete phrase search before substring fallback), including current attached form terms:

| Query or alias family | Current result | Proposed effect / decision |
|---|---|---|
| `tatsoi`, `tatsoï`, `tat soi`, `tah tsai` | No result | Each proposed name/alias resolves only to `ingredient-ref-tatsoi`; `tatsoï` normalizes to `tatsoi`. |
| `tat choy` | No result | Proposed exact alias resolves only to `ingredient-ref-tatsoi`. Generic `choy` grows from three current references to four; exact `bok choy` remains owned only by `ingredient-ref-bok-choy`. Retain this attested alias with the broad-token effect recorded. |
| `tat choi` | No result | Do not add; no reviewed primary Canadian/Québec source used this spelling. Generic `choi` would grow from two to three results. |
| `rosette bok choy` / `rosette pak choy` | No result | Do not add: either alias would make existing exact `bok choy` / `pak choy` searches return tatsoi alongside `ingredient-ref-bok-choy`. |
| `spoon mustard`, `spinach mustard`, `broad-beaked mustard` | No result | Do not add: these would widen the existing broad `mustard` search from 11 references to 12; `spinach mustard` would also widen `spinach` from three to four. |
| `Chinese Savoy`, `chou chinois` | No result | Do not add: broad `Chinese` currently returns nine references; a Québec seed label `chou chinois ‘Tatsoi’` is product copy, not a safe generic alias and overlaps the Chinese-cabbage wording. |

## Recipe demand, measures, and source boundaries

Bundled recipe demand is zero: the 114-file, 1,123-row corpus contains no tatsoi or reviewed synonym line. Québec market and cooking evidence exists outside the bundled library. Le Rizen describes eating it raw in salad and adding it at the end of a sauté or soup. Lufa's produce guide describes it separately from bok choy and says it can be eaten raw or cooked. RICARDO has one lentil-quinoa bowl recipe featuring tatsoi. These examples show recipe/market use, but none creates a bundled recipe link.

Quantity and conversion findings:

- A current indexed Marché de proximité de Québec listing shows `Tatsoï-200gr` from Ferme Labonté and describes a bag or bunch sold as 200 g. The page could not be opened by the browser because of a Unicode decoding error, so retain this only as a lower-strength, source-specific package observation. It is not a standard bunch weight, serving, or conversion.
- The RICARDO sponsored recipe lists `100 g (4 tasses)` of tatsoi leaves in French and `4 cups (100 g)` in English. Its ingredient text has apparent spelling inconsistencies (`tatstoï` / `tatstoi`) while the title identifies tatsoï/tatsoi. This is one recipe's leaf quantity without a cup-packing or cut-state protocol. Preserve it as a source-specific observation only; do not create a reusable 25 g/cup mapping or density.
- No tatsoi-specific default density, general mass-volume conversion, unit mapping, processing yield, or cooking-loss percentage was found in the reviewed sources. A web search scoped to Health Canada's Canadian Nutrient File resources did not surface a tatsoi-specific portion/conversion record in this review.

Substitution boundary: RICARDO says baby bok choy leaves or spinach can replace tatsoi **in that bowl**. This is contextual recipe advice from one sponsored page, not a global substitute rule. Keep bok choy, spinach, and tatsoi as separate identities and add no substitution edge from this evidence.

Forms boundary: references to tender young leaves, mature rosettes, and microgreens describe growth/market states. The sources do not require a catalog form or provide a conversion among them. Keep microgreens out of the general fresh-leaf identity and add no forms.

## Sources reviewed

Pages and listings were checked 2026-10-14. The source IDs below are now present on the integrated ledger record.

| Source ID | Source | Observation and limitation |
|---|---|---|
| `WP03-K-TATSOI-20261014-S01` | Ontario Ministry of Agriculture, Food and Rural Affairs, [“Tah Tsai”](https://omafra.gov.on.ca/CropOp/en/spec_veg/brassicas/taht.html). | Official Ontario crop page gives *Brassica rapa* subsp. *narinosa* var. *rosularis*, lists `Tat Soi` and `tah tsai` among common names, describes culinary mixed-salad/stir-fry use, and names bok choy/Chinese cabbage as close relatives. Page is an undated crop guide; use for identity/name relationship, not current Québec retail. |
| `WP03-K-TATSOI-20261014-S02` | Aliments du Québec, [Laitue 4 Saisons Inc.](https://alimentsduquebec.com/entreprises/laitue-4-saisons-inc). | Current local-products page identifies the Laval, Québec company and lists `Tatsoi` under fresh fruit and vegetables. Strong local product-name evidence; no package size or French standardized-name claim. |
| `WP03-K-TATSOI-20261014-S03` | Le Rizen (Québec producer), [Tatsoi](https://www.lerizen.ca/legumes/tatsoi) and [company information](https://www.lerizen.ca/a-propos). | French-language grower page uses `Tatsoi`, describes leaves and stems, salad use, adding to sauté/soup late, and distinction from bok choy. Company page describes its Québec organic Asian-vegetable production for public markets, grocery stores, and restaurants. The Tatsoi page is product/cooking copy, not a current stock listing. |
| `WP03-K-TATSOI-20261014-S04` | Marché des Fermes Lufa, [leafy-green identification guide (EN)](https://montreal.lufa.com/en/blog/what-s-my-surprise-green-a-quest-leafy-knowledge) and [FR](https://montreal.lufa.com/fr/blog/cest-quoi-ma-verdure-surprise-un-guide-didentification-des-feuillages). | Québec marketplace guide uses `Tatsoi` / `tatsoi`, describes it separately from green bok choy, and says it is used raw or cooked. Culinary/market guide, not a terminology authority or conversion source. |
| `WP03-K-TATSOI-20261014-S05` | RICARDO, [Bols de lentilles, quinoa, tatsoï et œuf poché](https://www.ricardocuisine.com/recettes/9400-bols-de-lentilles-quinoa-tatsoi-et-uf-poche) and [English version](https://www.ricardocuisine.com/en/recipes/9400-lentil-and-quinoa-bowls-with-tatsoi-and-poached-eggs). | One recipe lists 100 g / 4 cups of leaves and suggests baby bok choy or spinach as replacements in this bowl. The page identifies itself as sponsored content separate from RICARDO editorial material; quantity and substitution remain recipe-specific. |
| `WP03-K-TATSOI-20261014-S06` | IGA, [“Micropousses : sélection, conservation et cuisine”](https://www.iga.ca/fr/articles/les_micropousses). | Uses `tatsoï` in its French microgreens guide. This supports the accented input spelling and a microgreen product state, not mature tatsoi's French display by itself; normalization makes the accent alias unnecessary. |
| `WP03-K-TATSOI-20261014-S07` | Marché de proximité de Québec, [vegetables and legumes listing](https://www.marchequebec.org/index.php?action=produits&categorieid=5&souscategorieid=22&tri=pro_des). | Current search-indexed row lists `Tatsoï-200gr` from Ferme Labonté. Direct fetch returned a Unicode decoding error, so the item name/package size are lower-strength observations only. |
| `WP03-K-TATSOI-20261014-S08` | Seed2Go Canada, [seed ordering sheet](https://seed2go.ca/SEED%20ORDERING%20SHEET%20-%20MONEY%20ORDER.pdf). | Seed-catalogue line describes `Tat Soi Mustard Asian Salad Green, Tat Choy, Brassica`, supporting `tat choy` as a Canadian crop-name variant. A seed list is not fresh-food retail evidence; its broader picker-token effect is disclosed above. |
| `WP03-K-TATSOI-20261014-S09` | Pépinière.ca (Québec gardening retailer), [organic Chinese-cabbage ‘Tatsoi’ seeds](https://www.pepiniere.ca/products/chou-chinois-tatsoi-bio). | French seed-product wording is `Chou chinois ‘Tatsoi’` and the page gives *B. rapa* subsp. *narinosa*. This is useful Québec crop-name evidence, but `chou chinois` alone is generic and must not become an alias for the distinct vegetable. |
| `WP03-K-TATSOI-20261014-S10` | OQLF, [Vitrine linguistique / GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/). | A site-scoped web search for `tatsoi` / `tatsoï` did not surface a dedicated entry. This is a negative terminology-search result; do not present the Québec market spelling as OQLF-approved. |

## R117 integration result

Root accepted the Québec borrowed market display provisionally: both names are `tatsoi`, with the source-backed English aliases `tat soi`, `tah tsai`, and `tat choy`, and no French aliases. Accent normalization resolves `tatsoï`. No separate OQLF ruling is claimed.

The canonical reference, source ledger, Section K checklist, and roadmap were updated. The ledger retains the RICARDO 4 cups / 100 g amount as a recipe-specific observation and its baby-bok-choy-leaves / spinach suggestion as a blocked contextual finding; neither activates a general mapping or substitution. No form, recipe link, conversion, yield, or app/runtime file changed. See the [integration README](../batches/wp03-section-k-tatsoi-identity-integration-20261014/README.md).

No app or emulator tests were run for this JSON catalog addition under the updated `AGENTS.md` rule. Static validation results are recorded in the integration README.
