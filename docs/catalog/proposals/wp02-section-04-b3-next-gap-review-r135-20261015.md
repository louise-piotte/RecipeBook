# WP02 Section 04 B3 R135 — kaniwa starch product-boundary hold

- **Reviewed:** 2026-10-15.
- **Status:** proposal-only hold; no shared catalog, ledger, checklist, roadmap, generated file, recipe, or application file changed.
- **Checklist:** WP02 Section 04 B3, `[ ] Water-chestnut flour and other documented regional starches.` The parent item remains open.
- **Scope:** starch isolated from kaniwa grain (*Chenopodium pallidicaule*), separate from whole kaniwa seeds and kaniwa flour, and taxonomically distinct from quinoa (*Chenopodium quinoa*).
- **Proposal-local source-ID prefix:** `WP02-B3-KANIWA-STARCH-R135-20261015-S`. The proposed filename, prefix, and candidate phrases were checked against the live catalog, forms, ledger, legacy identities, plan, and proposal/batch archive; no focused kaniwa-starch decision or ID owner was found.

## Recommendation: hold, no delta

Keep a kaniwa-starch reference and ledger candidate out of the active catalog until a current Canadian or Québec human-food product source establishes the starch product scope and a product-specific French name. Primary research establishes starch isolated from *C. pallidicaule* flour and shows it to be distinct from quinoa starch. The current Canadian bilingual retail evidence located is for imported whole kaniwa seeds; a Québec retailer listing is for a mixed flour that includes kaniwa flour and is currently out of stock. Neither establishes a standalone kaniwa-starch product.

OQLF prefers the French grain terms **kaniwa** and **canihua** for *C. pallidicaule*. It does not name a starch product. The phrase **amidon de kaniwa** would be a transparent construction from the OQLF terms *amidon* and *kaniwa*, but this review found no product-specific Québec label or terminology record for the compound. Keep it provisional and inactive. Do not use **fécule de kaniwa**: OQLF describes *fécule* more specifically for starch in tubers or other underground plant organs; kaniwa starch is seed-derived.

**No JSON delta is proposed.** Do not add a reference, alias, ledger candidate, form, measurement observation for starch, density, unit mapping, conversion, yield, recipe link, or substitution. Do not reserve a candidate or reference ID. Reconsider if a current local product source identifies isolated kaniwa starch and provides usable bilingual product wording.

## Product and Québec naming boundary

| Material or phrase | Decision | Evidence boundary |
|---|---|---|
| Starch isolated from *C. pallidicaule* grain | Hold outside active references and the ledger. | The 2013 primary study isolates kaniwa starch from flour for laboratory characterization. This supports a distinct research ingredient, not Canadian retail availability or a consumer product specification. [S03] |
| `kaniwa starch` / `canihua starch` | Research/product-class wording only; do not activate. | The reviewed primary study uses isolated starch from four kaniwa ecotypes. Targeted searches did not find a current Canadian/Québec standalone human-food product listing under these names. [S03] |
| `amidon de kaniwa` / `amidon de canihua` | Descriptive constructions only; do not activate. | OQLF supports *amidon* as the general food-starch term and *kaniwa* / *canihua* as grain names. It does not attest either compound for a marketed isolated starch. [S01–S02] |
| `fécule de kaniwa` | Do not use as the display or alias. | The seed-derived source does not fit OQLF's more specific usage note for *fécule*, which points to tubers and underground organs. [S02–S03] |
| Whole kaniwa seeds | Keep `ingredient-ref-kaniwa` unchanged. | Yupik's current Canadian retail page lists imported whole seeds, with French title `Graines de Kaniwa` and the ingredient declaration `Canihua`. It is not a starch product. [S04–S06] |
| Kaniwa flour | Keep separate from whole seeds and isolated starch. | Metro's 500 g all-purpose flour listing says the product contains organic kaniwa flour along with other flours; the selected-store listing is currently unavailable. It does not establish a standalone starch product. [S07] |
| `baby quinoa` / `bébé quinoa` | Do not add as aliases. | OQLF discourages French `bébé quinoa` because it competes with the established term and may confuse kaniwa with a different plant. The English phrase is also a risky cross-species picker term. [S01] |

The current Yupik listing marks SKU P20072 in stock and gives Peru as its origin. Yupik identifies itself as a Canadian company based in Montréal and says it ships across Canada; this supports Canadian/Québec retail access to whole kaniwa, not Canadian production or a starch product. Its nutrition panel's 1/2 cup (100 g) serving is specific to the whole-seed SKU. [S04–S06]

The search on 2026-10-15 used the exact phrases `kaniwa starch`, `canihua starch`, `amidon de kaniwa`, and `amidon de canihua`, including Canada/Québec and `.ca`-restricted queries. It surfaced studies and seed/grain or flour products but no current Canadian/Québec standalone food-starch listing. This is a bounded search finding, not proof that no such product is sold.

## Live catalog, archive, and picker audit

The read-only snapshot contains **1,487 ingredient references, 109 forms, 1,832 research-ledger records, 61 legacy-import candidates, and 114 manifest-listed recipes / 1,123 ingredient rows**.

| Surface | Finding |
|---|---|
| Active references | The only kaniwa-related row is `ingredient-ref-kaniwa`: `kaniwa seeds / graines de kaniwa`, French alias `canihua`, no English aliases, category `GRAIN_AND_CEREAL`. No active row owns `kaniwa starch`, `canihua starch`, `amidon de kaniwa`, or `amidon de canihua`. The eight current results for broad `quinoa` search are quinoa-family grain/flour/flakes/puffed-grain references; no starch row is active. |
| Active forms | No form is attached to `ingredient-ref-kaniwa`; none denotes isolated kaniwa starch. Do not treat extraction or laboratory isolation as a user-facing preparation form. |
| Research ledger | `ingredient-ref-kaniwa` is verified as the grain identity. Its accepted decision keeps `baby quinoa` and `bébé quinoa` off the aliases. The existing Yupik 1/2-cup, 100-g observation is explicitly product-specific to raw whole seeds. No kaniwa-starch candidate, record, phrase owner, or source-prefix collision was found. |
| Legacy identities | The 61 legacy candidates contain no kaniwa-starch identity or proposed ID. |
| Proposal/batch archive and plan | The open regional-starch parent remains unchecked. The focused neighboring decisions are held ginger-rhizome starch (R131), held quinoa starch (R132), integrated sorghum starch (R133), and held amaranth starch (R134). Exact archive searches found no earlier kaniwa-starch review. This proposal does not reopen those decisions. |

`IngredientSearch.kt` normalizes accents and punctuation, prefers complete word-phrase matches, and then falls back to substring matching. A static projection over the live names, aliases, and forms gives these results:

| Query | Current results | If a hypothetical `kaniwa starch / amidon de kaniwa` row were added without aliases |
|---|---|---|
| `kaniwa` | Kaniwa seeds | Kaniwa seeds + kaniwa starch |
| `canihua` | Kaniwa seeds (French alias) | Unchanged; no `canihua` term is present in the hypothetical row |
| `kaniwa starch` | None | Hypothetical starch row only |
| `amidon de kaniwa` | None | Hypothetical starch row only |
| `quinoa` | Eight quinoa-family results | Unchanged if the starch row uses only the species-qualified terms above |
| `baby quinoa` / `quinoa starch` | None | `quinoa starch` remains absent, but a `baby quinoa starch` alias would add the kaniwa row to the broad `quinoa` query and is excluded |
| `starch` / `amidon` | Many existing starch results | The hypothetical row joins those broad results |

Exact product-qualified phrases would be unique if a row were later justified. Broad `kaniwa` would intentionally show both grain and starch, while `canihua` would continue to resolve to the existing grain unless a product label supports a starch-qualified alias. Do not add bare `canihua`, `quinoa`, `baby quinoa`, `bébé quinoa`, or unqualified starch aliases to force a picker result.

## Measurements, forms, substitution evidence, and recipe demand

- **Measurements:** Steffolani et al. isolate starch from kaniwa flour and report sample/ecotype properties, including amylose and pasting behavior. The paper does not provide a household mass-volume pair, bulk density, retail serving, or recipe measure. Yupik's 1/2 cup (100 g) observation and 2:1 cooking-water guidance refer to whole seeds, not starch; keep them on their existing source-scoped grain record only. [S03–S04]
- **Forms:** Add none. Laboratory isolation and drying do not establish a repeatable consumer preparation-state family or a form-conversion path.
- **Substitutions:** Add none. The primary paper discusses possible cereal-food applications and reports differences from quinoa starch; it does not test a kaniwa-starch replacement ratio for a recipe or establish equivalence to corn, potato, tapioca, or another starch. No global or contextual rule is supported. [S03]
- **Recipe demand:** A manifest-ordered read-only scan of all 114 recipe files and 1,123 ingredient rows found zero occurrences of `kaniwa`, `canihua`, `cañihua`, `kañiwa`, *Chenopodium pallidicaule*, `kaniwa starch`, `canihua starch`, `amidon de kaniwa`, `amidon de canihua`, `baby quinoa`, or `bébé quinoa`, and no link to a kaniwa-starch ID. No recipe link or relink is proposed.

## Source register

Sources were checked on 2026-10-15. The IDs are local to this proposal; no ledger entry is proposed.

| ID | Source and bounded evidence |
|---|---|
| **WP02-B3-KANIWA-STARCH-R135-20261015-S01** | Office québécois de la langue française, [*kaniwa* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532687/kaniwa), updated 2015. Identifies *Chenopodium pallidicaule*, prefers French `kaniwa` and `canihua`, lists English spellings, and discourages French `bébé quinoa` because quinoa is a different plant. It names the edible seed, not isolated starch. |
| **WP02-B3-KANIWA-STARCH-R135-20261015-S02** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Prefers `amidon` generally for food starch and explains the more specific use of `fécule` for tubers or underground plant organs. It does not attest `amidon de kaniwa` as a product name. |
| **WP02-B3-KANIWA-STARCH-R135-20261015-S03** | Steffolani et al., [“Study of the physicochemical and functional characterization of quinoa and kañiwa starches”](https://onlinelibrary.wiley.com/doi/10.1002/star.201200286), *Starch – Stärke* 65 (2013), 976–983. Primary study isolates starch from flour of four kañiwa ecotypes and three quinoa varieties and compares composition and pasting/thermal properties. The samples and laboratory results establish a distinct research fraction, not a Canadian retail specification, kitchen measure, density, or tested substitution. |
| **WP02-B3-KANIWA-STARCH-R135-20261015-S04** | Yupik, [*Kaniwa Seeds*, SKU P20072 (English page)](https://yupik.com/en/kaniwa-seeds-p20072), accessed 2026-10-15. Current page marks the product in stock, identifies Peru as origin, and lists the single ingredient Kaniwa. The 1/2-cup, 100-g nutrition serving and preparation guidance are for whole seeds only. |
| **WP02-B3-KANIWA-STARCH-R135-20261015-S05** | Yupik, [*Graines de Kaniwa*, SKU P20072 (French page)](https://yupik.com/fr/kaniwa-seeds-p20072), accessed 2026-10-15. The same in-stock product is titled `Graines de Kaniwa` and its ingredient declaration is `Canihua`. This supports bilingual whole-seed wording, not a starch name. |
| **WP02-B3-KANIWA-STARCH-R135-20261015-S06** | Yupik, [*About us*](https://yupik.com/en/about-us), accessed 2026-10-15. Identifies Yupik as a Canadian family-owned company, describes Montréal preparation/packaging for some products, and says it ships across Canada. It does not state that SKU P20072 is Canadian-grown or processed in Canada. |
| **WP02-B3-KANIWA-STARCH-R135-20261015-S07** | Metro, [*GoGo Quinoa Organic All Purpose Flour, 500 g*](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-tout-usage-biologique/p/896899000449), accessed 2026-10-15. Its listing describes a flour blend and includes organic kaniwa flour in the ingredient statement; the selected-store page reports the product unavailable/out of stock. This is a flour boundary example only, not a current standalone kaniwa-starch product. |

## Reconsideration conditions

1. Locate a current Canadian/Québec human-food listing or supplier specification that identifies isolated kaniwa starch, distinguishes it from flour or a starch-rich blend, and gives a product-specific name.
2. Obtain product-specific French wording or an independent Québec terminology decision before activating `amidon de kaniwa` or an alias.
3. Recheck catalog and picker ownership when that evidence appears. Keep `baby quinoa` and `bébé quinoa` out, and do not transfer whole-seed portions or cooking instructions.
4. Keep density, mappings, forms, recipe links, conversions, yields, and substitutions absent unless separate evidence supports each behavior.
5. Leave WP02 Section 04 B3 open; this proposal does not complete its regional-starch checklist item.

No tests were run. This turn changed only a proposal document; the project instruction says database JSON-only additions need no tests, and no database JSON was changed here.
