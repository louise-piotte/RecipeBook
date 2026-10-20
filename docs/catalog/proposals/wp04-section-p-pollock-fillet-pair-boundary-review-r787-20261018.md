# WP04 Section P R787 — paired pollock fillet-form boundary review

- **Review date:** 2026-10-18.
- **Packet type:** proposal-only species/form and picker review.
- **Status:** Integrated on 2026-10-18 in the [R785–R787 batch](../batches/wp02-wp03-wp04-r785-r787-gap-review-integration-20261018/README.md); paired Alaska- and Atlantic-pollock fillet forms were added under their existing references.
- **Plan anchor:** The active Section P finfish checklist previously held the Alaska-pollock form at [the global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7207); R787 now records that hold as resolved. The prior roadmap checkpoint is [R782–R784](../../../roadmap.md#L1512); Section P remains open.
- **Recommendation:** Resolve R574’s Alaska-pollock singleton concern with a paired, species-qualified fillet boundary: frozen Alaska pollock fillets and fresh Atlantic pollock fillets, each beneath its existing species reference. Use the supported plural bilingual product labels and only full species-qualified singular French match terms. This makes unqualified `pollock fillet(s)` and `filet(s) de goberge` return both species while preserving current broad fillet results. Keep the distinct retail states, parent identities, SKU-specific package details, and all other pollock products separate.

## Scope and prior work

This review returns to R574’s held `ingredient-form-alaska-pollock-frozen-fillets` candidate. R574 correctly held a one-species form because its natural product labels made generic `pollock fillet(s)` and `filets de goberge` return Alaska pollock alone. This proposal adds the separately supported Atlantic-pollock fresh fillet presentation as a sibling so those searches return two distinct species. It does not revise the R574 proposal or integration record, create a new species identity, or broaden either parent’s aliases.

At the time of review, the live catalog had 1,870 ingredient references, 193 forms, and 2,272 ledger records. The relevant parents are already active and verified:

| Parent | Current display and state | Boundary |
|---|---|---|
| `ingredient-ref-alaska-pollock` | `Alaska pollock / goberge de l’Alaska`; no aliases or forms. Its ledger measurement and substitution states remain `not_yet_researched`. | Keep distinct from *Pollachius virens* and prepared pollock products. |
| `ingredient-ref-atlantic-pollock` | `Atlantic pollock / goberge de l’Atlantique`; existing French alias `goberge Atlantique`; no forms. Its parent ledger states remain `researched_no_supported_value` and `researched_no_supported_substitute`. | Preserve the qualified alias and the parent’s existing research; do not infer a parent-level measure or substitute from these products. |
| `ingredient-ref-boneless-salted-pollock`; `ingredient-ref-crab-flavoured-pollock-flakes` | Separate active preserved/prepared products. | Keep their identity, phrase search behavior, and research records unchanged. |

The CFIA Fish List identifies both *Gadus chalcogrammus* and *Pollachius virens* under English `Pollock`, while existing OQLF and DFO records scope `goberge` and `Atlantic pollock` to *P. virens*. Keep generic `pollock` and `goberge` out of both parents’ aliases. Reuse the existing Alaska-pollock CFIA/OQLF sources and the existing Atlantic-pollock OQLF/DFO/CFIA sources rather than adding copies.

## Product evidence and limits

| Source ID | Current primary source | Evidence used and limits |
|---|---|---|
| `WP04-SECTIONP-ALASKA-POLLOCK-FROZEN-FILLETS-R574-20261017-S01` (reuse R574) | Metro, [Frozen Alaska Pollock Fillets, product 226631](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-alaska-pollock-fillets/p/226631), rechecked 2026-10-18. | The current indexed English listing names frozen Alaska pollock fillets, gives *Gadus chalcogrammus*, and shows one tray at about 300 g. The selected-store notice says out of stock. Direct page opening returned 403 during this review; the primary Metro listing was available in its current indexed result. This supports the product name and listing, not general inventory, package count per fillet, or a reusable amount. |
| `WP04-SECTIONP-ALASKA-POLLOCK-FROZEN-FILLETS-R574-20261017-S02` (reuse R574) | Metro, [Filets de goberge de l’Alaska surgelés, product 226631](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/filets-de-goberge-de-l-alaska-surgeles/p/226631), rechecked 2026-10-18. | The French route has the same product number, label, taxon, one-tray listing, and approximate 300 g value. It is the French route for the same SKU as S01, not an independent product or weight observation. The selected-store notice says out of stock; direct page opening returned 403. |
| `WP04-SECTIONP-POLLOCK-FILLET-PAIR-R787-20261018-S01` (new, proposal-local) | Supermarché PA, [Fresh Atlantic Pollock Fillets](https://www.supermarchepa.com/products/filets-de-goberge-atlantique-frais), accessed 2026-10-18. | The current product page uses the English title `Fresh Atlantic Pollock Fillets` and lists an approximate 400 g package. It does not name a binomial or SKU; the taxon assignment follows the source-backed qualified name and existing parent identity, not an inference from the package. The page notes online ordering is coming soon for PA Donegani; it does not establish current inventory at all locations. The approximate package mass is not a fillet weight or measure. |
| `WP04-SECTIONP-ALASKA-POLLOCK-FROZEN-FILLETS-R574-20261017-S03` (reuse R574), also existing parent source `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S08` | Supermarché PA, [French fish-department listing](https://www.supermarchepa.com/collections/all/fish-department?page=2&view=fr), current indexed listing. | The Québec-facing listing says `Filets de goberge Atlantique frais`, about 400 g. It does not report a binomial or identify a lot. Reuse the existing source IDs; do not duplicate either catalog URL or claim this listing is a second SKU. |
| `WP04-SECTIONP-POLLOCK-FILLET-PAIR-R787-20261018-S02` (new, proposal-local) | Nova Scotia Seafood, [Atlantic Pollock](https://www.nsseafood.com/atlantic-pollock), accessed 2026-10-18. | The page identifies *Pollachius virens* and lists fresh and frozen fillets among Atlantic-pollock product types. It supports the species-to-form class, not a Québec SKU, stock level, package amount, or the exact PA product lot. |
| Reuse existing parent sources | CFIA Fish List `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01`; OQLF/DFO and species sources already owned by the R15 Atlantic-pollock record, including `WP04-SECTIONP-ATLANTIC-POLLOCK-GOBERGE-20261013-R15-S01` and `-S02`. | Reuse only for the English/French parent-name and taxon boundary. These sources do not independently establish product inventory or measurements. Do not duplicate their URLs or change their existing owners. |

The English and French Metro routes are one Alaska-pollock product. The PA product page and French category listing support one local fresh Atlantic-pollock product presentation, not multiple independent SKUs. Nova Scotia Seafood’s species-specific page corroborates fresh/frozen fillet supply, while the existing parent sources establish that the qualified Atlantic name refers to *P. virens*. Do not infer fresh/frozen equivalence, a shared portion, or a substitution between the species.

## Ownership and collision audit

| Key | Current owner / audit result | Disposition |
|---|---|---|
| `ingredient-form-alaska-pollock-frozen-fillets` | Mentioned only as a held candidate in R574; absent from active forms and ledger record IDs. | Reuse the R574 candidate ID. Do not create a second Alaska form or edit the R574 files. |
| `ingredient-form-atlantic-pollock-fresh-fillets` | Absent from active forms, legacy identities, and research-ledger record IDs before integration. | Added as the Atlantic sibling form. |
| R574 Metro S01–S02 and PA S03 | These exact routes had no ledger owner before R787. | Added the Metro pair to the Alaska form record and the PA French listing once to the Atlantic form record. |
| R15 Atlantic-pollock S08 and S09 | Existing parent-owned PA category and Sea Star supplier sources. | Kept the parent record and its URL owners unchanged; no duplicate entries were added. |
| R787 S01–S02 and their URLs | No exact source-ID or URL owner existed before integration. | Added each source once to the Atlantic form record. |
| R787 proposal path | `docs/catalog/proposals/wp04-section-p-pollock-fillet-pair-boundary-review-r787-20261018.md` was free before this write. | Unique proposal path. |

The candidate form IDs and R787 source IDs do not collide with active IDs. Existing names, aliases, source records, ledgers, and completed/held work remain intact.

## Data delta integrated

The integration added exactly these two forms beneath their existing references and corresponding form-level ledger records. Keep both forms’ `matchTermsEn` arrays empty. The singular French match terms preserve the species and state qualifiers; do not add bare `fillet`, `filet`, `pollock`, or `goberge` terms.

| ID / parent | `formCode` / `prepState` | English label / extra term | French label / extra term |
|---|---|---|---|
| Reuse `ingredient-form-alaska-pollock-frozen-fillets` / `ingredient-ref-alaska-pollock` | `frozen` / `frozen` | `frozen Alaska pollock fillets`; no extra term | `filets de goberge de l’Alaska surgelés`; `filet de goberge de l’Alaska surgelé` |
| New `ingredient-form-atlantic-pollock-fresh-fillets` / `ingredient-ref-atlantic-pollock` | `fresh` / `fresh` | `fresh Atlantic pollock fillets`; no extra term | `filets de goberge Atlantique frais`; `filet de goberge Atlantique frais` |

Set both densities to null. Preserve existing parent measurement and substitution states. The Metro about-300 g tray average and PA approximately-400 g package remain source-specific observations and do not become form-level measures. Add no aliases, new identity, unit mapping, conversion, yield, recipe link, recipe update, or active substitution. Keep dressed/cleaned status, skin/bone details, additives, sizes, processing, and inventory tied to the cited product pages or out of scope.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized full word phrases take priority over substring fallback, and attached forms return their parent reference. I projected the two conditional labels and the two qualified French singular match terms against the current 1,870-reference / 193-form package.

| Query | Current results | With pair | Effect |
|---|---:|---:|---|
| `pollock fillet`; `pollock fillets` | 0 | 2: Alaska and Atlantic pollock | The generic English cut phrase returns both species. The singular English query uses substring fallback on the source-supported plural labels; no broad English singular match term is added. |
| `filet de goberge`; `filets de goberge` | 0 | 2: Alaska and Atlantic pollock | Singular and plural French generic cut phrases return both species through the qualified singular terms and plural labels. |
| `frozen Alaska pollock fillets`; `filets de goberge de l’Alaska surgelés` | 0 | Alaska pollock | Full source-supported product phrases select only the Alaska parent and expose its form hint. |
| `fresh Atlantic pollock fillets`; `filets de goberge Atlantique frais` | 0 | Atlantic pollock | Full source-supported product phrases select only the Atlantic parent and expose its form hint. |
| `fillet`; `fillets`; `filets` | 9 each | 11 each | Existing broad fish-cut results remain and the two parents are added. |
| `filet` | 4 | 6 | Existing Atlantic/Pacific cod, salmon-fillets, and tilapia results remain; the two pollock parents join the qualified multi-result set. |
| `pollock`; `goberge` | 4 each | 4 each | Existing Alaska, Atlantic, boneless-salted, and crab-flavoured pollock results stay unchanged. No generic alias is added. |

No broad cut query becomes a single pollock species. The pairing also does not imply that generic `pollock fillet` specifies whether a product is fresh or frozen; those states remain visible in the full species-qualified result labels.

## Bundled-recipe demand

I scanned every manifest-listed recipe file and every structured ingredient row: **114 recipes and 1,123 ingredient rows**. Searches across the recipe JSON bytes for `pollock`, `goberge`, *Pollachius virens*, *Gadus chalcogrammus*, `Alaska pollock`, `Atlantic pollock`, and the bilingual fillet phrases found **0 matching recipe files and 0 matching ingredient rows**. The manifest-ordered corpus digest is `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362`.

No recipe line, amount, method, role, or substitution context selects either form. This is an open catalog boundary supported by current product listings, not bundled recipe demand. Attach no recipe links or substitutions.

## Bounded recommendation

The integration accepted this paired pollock fillet boundary as exactly two forms under the existing Alaska- and Atlantic-pollock parents. It reused R574’s Alaska candidate ID and Metro evidence, added the current PA English/French listings and Nova Scotia Seafood source once, and kept the existing Atlantic-pollock parent sources unchanged. Keep generic `pollock`/`goberge`, boneless salted pollock, crab-flavoured pollock flakes, and all parent research states unchanged. Do not turn either package amount into a measure or infer recipe equivalence across species.

If the picker cannot represent the plural labels and full species-qualified singular French terms shown above, hold both forms together; do not add the Alaska form by itself. The wider Section P finfish checklist remains open. No software tests, build, emulator, or deployment were run because this change only adds database JSON under `AGENTS.md`; see the [R785–R787 integration README](../batches/wp02-wp03-wp04-r785-r787-gap-review-integration-20261018/README.md).

## Read-only audit record

R01 re-read `AGENTS.md`, the relevant ingredient requirements, current Section P plan and roadmap checkpoints, R574/R15 proposals and integration records, current reference/form/ledger data, legacy identities, `IngredientSearch.kt`, and all manifest-listed recipe files. It checked active form/record IDs, proposal/archive collisions, source-ID and exact-URL ownership, the two parent identities and their existing product owners, the proposed picker terms, and full bundled-recipe demand. The review was proposal-only before the R787 integration.
