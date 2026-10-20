# WP03 Section I — hemp-seed butter hull-boundary reassessment

- **Reviewed:** 2026-10-11
- **Status:** Integrated as a held candidate on 2026-10-11. The shared research ledger records the evidence and unresolved hull-state boundary; no active catalog identity or alias was added.
- **Scope:** Reassess the earlier hold on hemp-seed butter after the separate whole-hemp-seed identity was integrated alongside hulled hemp hearts. This review does not reopen either seed identity.
- **Method:** Read the live split package, manifest-listed recipe corpus, research ledger, and earlier WP03 nut/seed paste review. Checked current Québec maker wording, Canadian maker recipe evidence, federal product-goods wording, and current Québec usage of the unqualified French phrase.

## Recommendation

**Keep hemp-seed butter on hold for catalog identity and aliasing.** The current Québec maker Cru Nature has a live bilingual storefront listing the product as **“Organic Raw Hemp Seed Butter” / “Beurre de graines de chanvre crues Bio”** and says it is made from raw, pre-germinated Québec hemp seeds. The maker does not say whether those seeds are hulled or whole. A Canadian Manitoba Harvest recipe does show one *hearts-and-oil* preparation called “Hemp Butter,” but that is recipe-specific and does not establish the hull state of Cru Nature’s packaged product or a general butter formula. No current Canadian or Québec maker source found here establishes a whole-seed butter product.

| Candidate | Direct evidence | Boundary result |
| --- | --- | --- |
| Cru Nature packaged food product | Current maker pages provide the exact bilingual name pair and list pre-germinated hemp seeds grown in Québec as the ingredient. The hull state is unstated. [HB-S01, HB-S02] | Keep its named food product unassigned to both `ingredient-ref-hemp-hearts` and `ingredient-ref-whole-hemp-seeds`. Do not add a general butter identity from this unresolved product scope. |
| Manitoba Harvest “Hemp Butter” recipe | Canadian maker’s recipe combines hemp hearts and hemp oil; optional dates or honey make a sweeter batch. [HB-S03] | Supports one source-specific hearts-based preparation, not the Cru Nature product, not a packaged product standard, and not a general alias for hulled hearts. |
| Whole-hemp-seed butter | No current Canadian or Québec maker/package evidence found in this review. | Hold; do not infer from the accepted whole-seed identity. |

The earlier WP03 paste review’s hold remains correct. The new whole-seed identity makes the ambiguity easier to state: the current Cru Nature item is a separate prepared-food product, but its source seeds cannot be matched to either the whole-seed or hulled-hearts reference from the available wording. The maker’s raw, soaked, pre-germinated, dehydrated, and stone-ground process descriptions do not state that the hard hull was removed or retained. Treating “pre-germinated” or “raw” as a hull signal would be an inference without source support.

## Product and matching boundary

Keep the live seed identities distinct and unchanged:

| Existing identity | Current display | Do not absorb |
| --- | --- | --- |
| `ingredient-ref-hemp-hearts` | `hemp hearts` / `graines de chanvre décortiquées` | Any butter or spread just because it is hemp-based. |
| `ingredient-ref-whole-hemp-seeds` | `whole hemp seeds` / `graines de chanvre entières` | Any butter or spread just because it is called hemp-seed butter. |

Do not add `hemp seed butter`, `hemp butter`, `raw hemp seed butter`, `Organic Raw Hemp Seed Butter`, `beurre de graines de chanvre crues`, `beurre de graines de chanvre`, or `beurre de chanvre` as aliases to either seed reference. The first set describes a prepared spread, not a seed identity; the Cru Nature name is source-specific and hull-ambiguous. The bare French `beurre de chanvre` is also used for Québec topical products: a current Québec skincare maker lists a whipped “beurre de chanvre” made with cold-pressed oil and fragrance, so that wording alone is not a safe food alias. [HB-S05]

Do not add separate `whole hemp seed butter` or `hemp heart butter` rows in this batch. The Manitoba Harvest page documents one hearts-based recipe, but not a reusable retail product or a bilingual product name; the Québec maker has not identified the hull state of its product. If a maker later states that a specific food butter is ground from whole seeds or from hulled hemp hearts, review that named product as a separate prepared-food identity, not as a form or conversion of the corresponding seed. Keep other unqualified products unresolved until their own source wording establishes their scope.

The Cru Nature store’s matching English and French titles are usable **source wording**, not a Québec terminology ruling or proof of bilingual package text. No OQLF butter-term ruling or maker statement resolving hull state was located in this review. CIPO’s goods list names hemp seed butter separately from raw and hulled hemp seeds, but it does not provide a recipe, hull specification, French product name, or proof that the listed product is currently sold; use it only as weak evidence that butter is a distinct goods category. [HB-S04]

## Measurements, conversions, substitutions, and recipes

- The Cru Nature page offers package sizes of 210 g and 1 kg. These are package-specific net quantities, not household measures or a transferable conversion.
- Cru Nature’s soaking and dehydration times describe its process; they do not establish yield, density, or a seed-to-butter conversion.
- Manitoba Harvest’s one recipe gives 1 cup hearts and 2 tablespoons hemp oil for a source-specific yield of 1¼ cups, with optional dates or honey. Do not store this as a general mass/volume conversion, density, standard yield, formula, or substitution rule.
- Keep `defaultDensity` unknown/null and `unitMappings` empty for any future candidate. No reusable household measure, package yield, or mass-volume relation is supported.
- Add no conversion or substitution rule between whole hemp seeds, hulled hemp hearts, and butter. The recipe describes how one maker prepares a spread; it does not establish interchangeability or a recipe substitution.
- The current manifest has 114 recipes and a full text scan found zero hemp/chanvre matches. Add no recipe link or behavior now.

## Live-package and ledger audit

Read-only snapshot on 2026-10-11:

- `ingredient-references.v1.json` has 970 records and exactly two hemp matches: `ingredient-ref-hemp-hearts` (`hemp hearts` / `graines de chanvre décortiquées`) and `ingredient-ref-whole-hemp-seeds` (`whole hemp seeds` / `graines de chanvre entières`). Both have null default density and no unit mappings.
- `ingredient-forms.v1.json` has 60 forms and no hemp/chanvre form.
- `docs/catalog/research-ledger.v1.json` has 1,243 records and exactly those two hemp ingredient records. It has no separate hemp-butter record; the earlier review’s source S20 is recorded in that proposal, not as a butter identity in the ledger.
- The manifest lists 114 recipe files. Scanning all 114 files found no hemp/chanvre text, ingredient row, or recipe link.
- The earlier `wp03-nut-seed-paste-product-gap-review-20261010.md` holds hemp-seed butter because Cru Nature does not state whether its seeds are hulled. This review confirms the same gap and adds the source-specific Manitoba Harvest recipe evidence without changing that disposition.

## Source register

All pages were accessed on **2026-10-11**. Source IDs are local to this proposal and are not research-ledger IDs.

| ID | Source | Direct evidence and limits |
| --- | --- | --- |
| HB-S01 | Cru Nature, [Beurre de graines de chanvre crues Bio](https://crunature.com/products/beurre-de-graines-de-chanvre-crues), current French product page. | Maker title and product description use `Beurre de graines de chanvre crues Bio`; ingredient text says `graines de chanvre biologiques prégermées du Québec`. It describes soaking, low-temperature dehydration, and stone grinding, but does not state hulled/whole status. Package sizes are product listings only. |
| HB-S02 | Cru Nature, [English storefront](https://crunature.com/en), current maker page and product listing. | Lists the same product as `Organic Raw Hemp Seed Butter`; the maker describes its nut and seed butters as 100% made in Québec. Confirms the English display counterpart, not a bilingual package label or seed hull state. |
| HB-S03 | Manitoba Harvest, [Hemp Butter](https://manitobaharvest.ca/blogs/archived/hemp-butter), maker recipe. | Recipe ingredients are hemp hearts and hemp oil, and the page gives a source-specific yield and optional sweeteners. Supports one hearts-based preparation; it is an archived recipe, not a product formula standard or Québec package label. |
| HB-S04 | Canadian Intellectual Property Office, [PLANET HEMP — 1739602](https://ised-isde.canada.ca/cipo/trademark-search/1739602), registered goods list. | Lists raw hemp seeds, hulled hemp seeds, and hemp seed butter as separate goods. The record does not specify butter ingredients or hull state and does not establish current product availability or French naming. |
| HB-S05 | L’atelier des Mandragores, [Beurre fouetté au chanvre — Nature](https://atelierdesmandragores.ca/products/beurre-fouette-au-chanvre-nature), current Québec topical product page. | Maker describes a whipped “beurre de chanvre” made with cold-pressed oil and fragrance and labels it a Québec product. This is cosmetic usage, not food evidence; it shows why bare `beurre de chanvre` is ambiguous. |

**Proposed decision:** retain the hold on a catalog hemp-butter identity and all butter aliases. Preserve the current Cru Nature English/French product titles only as source-specific wording. Keep hull status unknown; do not map the product to whole seeds or hearts, and do not add whole-seed butter or hemp-heart butter rows without a source that explicitly identifies the food product’s seed state and supports its display wording. Keep all conversions, density, general yields, recipe links, and substitutions unknown.

## Coordinator integration result

Added the held `candidate-hemp-seed-butter` record with five source entries to
`docs/catalog/research-ledger.v1.json`. Its `needs_clarification` state preserves the unknown hull
state, keeps the maker’s one-off hemp-hearts recipe separate, and rejects the cosmetic use of bare
`beurre de chanvre` as food evidence. No ingredient reference, alias, form, recipe link, measurement,
conversion, yield, or substitution changed. The broader seed-butter and paste checklist remains open.
The current package remains at 971 references / 61 forms / 114 recipes / 1,123 ingredient rows; the
ledger now has 1,246 records / 3,905 source entries / 3,197 distinct source IDs / 8 conversions / 0
validation errors. Verification details are in
`docs/catalog/batches/wp03-hemp-seed-butter-boundary-integration-20261011/README.md`.
