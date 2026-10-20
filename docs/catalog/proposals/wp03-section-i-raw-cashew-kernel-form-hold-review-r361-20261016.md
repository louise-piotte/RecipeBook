# WP03 Section I — raw cashew-kernel form boundary hold (R361, 2026-10-16)

## Review record

- **Status:** Integrated as a documentation-only hold on 2026-10-16; see the [integration README](../batches/wp03-section-i-raw-cashew-kernel-form-hold-integration-r361-20261016/README.md). No active catalog or research-ledger data changed.
- **Selected gap:** Whether retail `raw cashews / noix de cajou crues` warrants an active form under the existing edible-cashew identity.
- **Section I context:** The open checklist at [line 5229](../../RecipeBook-global-ingredient-catalog-plan.txt#L5238) calls for research on processing-sensitive kernels without implying safe raw use. The broader seed/kernel/butter-paste reminder remains open at [line 13217](../../RecipeBook-global-ingredient-catalog-plan.txt#L13245). This packet reviews only the cashew retail use of `raw`; it does not reopen the candlenut or ginkgo holds, or review cashew flour or cashew butter.
- **Archive audit:** Search across the active references and forms, legacy candidates, research ledger, Section I proposals, and batch READMEs found no dedicated raw/unroasted cashew-kernel form review or owner. Earlier cashew work verifies `cashews / noix de cajou`, establishes separate cashew flour and cashew butter identities, and includes `raw cashew halves` only as an input to one flour-making source. Those records do not decide whether retail `raw cashews` is a catalog form. No earlier candidate is reopened here.
- **Recommendation:** Hold `raw cashews / noix de cajou crues` and `unroasted cashews / noix de cajou non grillées` outside active form labels and match terms. Retain the existing `ingredient-ref-cashews` identity unchanged. Retailer page snapshots accessed for this review show the raw product name in food-use contexts, but do not document the kernel's processing history or guarantee current inventory. The UNECE commodity standard says edible cashew kernels are obtained by heating, shelling, and peeling, while distinguishing subsequent roasting as a processing state. This supports a plausible retail reading of “raw” as “not further roasted,” but does not establish the exact meaning or processing of the listed Québec SKUs. Do not turn the label into a safety or home-processing claim.
- **Proposal-time snapshot:** 1,693 active ingredient references, 139 forms, 56 legacy candidates, 2,049 research-ledger records, and 114 manifest-listed recipes with 1,123 ingredient rows. R361 source IDs below remain proposal-local and are not registered in the shared ledger.

## Identity and Québec terminology

The active cashew identity is `ingredient-ref-cashews`, displayed as `cashews / noix de cajou` in `NUT_SEED_AND_DRIED_FRUIT`, with no aliases, attached forms, density, or unit mappings. Its ledger identity is verified. The OQLF GDT identifies *Anacardium occidentale* and defines `noix de cajou` as the cashew fruit whose edible kernel is generally sold shelled and roasted. It also records `amande de cajou` for the edible part alone. The `noix de cajou` display is established Québec terminology; the OQLF entry does not define `noix de cajou crues` as a processing specification [S02].

The OQLF entry for `baume de cajou` describes a highly caustic substance between the two shells and warns that manual extraction or biting the shell can cause burns or blisters [S04]. The FDA's nuts-method guidance independently notes the caustic liquid in the shell [S03]. These sources apply to the shell and do not establish that properly processed retail cashew kernels are unsafe. They are included to keep an in-shell, unprocessed fruit from being inferred from a retail “raw” label.

Québec-facing Mayrand lists `Noix de cajou crues 1 kg` and describes that SKU for salads, snacking, sauces, and stews [S05]. Its separate `Noix de cajou rôties non salées 1 kg` listing confirms that the retailer distinguishes the raw-named and roasted-named products in its assortment [S06]. Metro also lists `Noix de cajou entières crues` as a 100 g product and identifies its ingredient as cashews [S07]. These are page-level market-label and use observations, not manufacturer process records or a Québec terminology ruling for the word `crues`; inventory is time-sensitive, and the Metro page is not a current stock check.

UNECE DDP-17 applies to cashew kernels obtained by heating, shelling, and peeling the true fruit of *Anacardium occidentale*. The standard distinguishes this kernel preparation from later roasting, oil-frying, seasoning, or other processing [S01]. It is an international commercial-quality standard, not Canadian retail-label guidance, a food-safety assessment, or a recipe form schema. Applying its distinctions to the current Québec retailer listings would therefore be an inference: “raw” may mean not subsequently roasted, but the product pages do not state that process or define the label.

## Live ownership and picker projection

The read-only ownership check included active reference names and aliases, all form labels and match terms, legacy candidates, and dedicated ledger record IDs. The candidate-specific exact phrases `raw cashew`, `raw cashews`, `noix de cajou crue`, `noix de cajou crues`, `unroasted cashews`, and `noix de cajou non grillées` have no current exact reference/form owner or legacy candidate. No raw-cashew form is attached to the cashew identity.

The current picker normalizes accents and punctuation, returns complete word phrases before substring fallback, and indexes a form's terms under its parent reference; see [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). A static projection using those rules gives:

| Query | Current result | Note |
|---|---|---|
| `cashews` | `ingredient-ref-cashews` | Exact existing English display. |
| `noix de cajou` | `ingredient-ref-cashews`, `ingredient-ref-cashew-butter`, `ingredient-ref-cashew-flour` | The phrase occurs inside the French names of the two separate processed products; this broad result set predates the proposal. |
| `beurre de noix de cajou` | `ingredient-ref-cashew-butter` | Keep the existing butter product separate from whole edible kernels. |
| `cashew` | `ingredient-ref-cashew-butter`, `ingredient-ref-cashew-flour` | The current phrase-first matcher does not return plural `cashews` for this singular query; this existing search behavior is outside this form review. |
| `cashew kernel(s)`; `raw cashew(s)` | No result | No current exact phrase or active form owns these English terms. |
| `noix de cajou crue(s)`; `amande(s) de cajou` | No result | No current exact phrase or active form owns these French terms. |

No app picker run is claimed. Because the recommendation is a hold, add no `raw` or `unroasted` aliases, form labels, match terms, or separate identity. In particular, do not attach unqualified `raw` or `cru` to the whole-kernel reference.

## Bundled recipe demand

All 114 paths listed in `manifest.v1.json` and their 1,123 structured ingredient rows were scanned, along with each recipe JSON file's text. The scan found zero ingredient-line or file-text occurrences of `cashew`, `cajou`, or `Anacardium`; there is no bundled demand for cashews, a raw/unroasted cashew form, cashew butter, or cashew flour. No recipe link or relink is proposed. The retailer's 1 kg and 100 g package quantities are package sizes, not recipe amounts or evidence of a household measure.

## Measures, conversions, and substitutions

- `ingredient-ref-cashews` has `defaultDensity: null`, empty `unitMappings`, no attached forms, and no package-yield record. Its ledger state remains `measurementState: not_yet_researched`, with no measurement observations.
- The existing ledger state is `substitutionResearchState: not_yet_researched`; there are no global or contextual substitution rules that reference cashews. No source tested a swap between raw-named and roasted cashews or supplied a direction, ratio, or method adjustment.
- Do not record the listed package masses as portions, cup weights, or mass-volume conversions. Add no density, mapping, form conversion, yield, or recipe-line substitution.
- Do not add a safe-to-eat-raw claim, in-shell preparation instructions, or a generalized cashew-shell treatment from the market listings. The shell hazard references are not a retail-kernel hazard assessment; the retail pages do not disclose kernel-processing conditions.

## Proposal-local sources

Sources were checked on **2026-10-16**. The IDs below are unique to this review and have not been added to the ledger.

| Source ID | Source and locator | Claim used and limit |
|---|---|---|
| `WP03-I-RAW-CASHEW-R361-20261016-S01` | UNECE, [DDP-17: Cashew Kernels (2023)](https://unece.org/sites/default/files/2024-02/DDP17_CashewKernels_2023_e.pdf), section I, “Definition of produce”; current standard listing at [Dry and Dried Produce standards](https://unece.org/trade/wp7/DDP-Standards). | Identifies cashew kernels as *Anacardium occidentale* product obtained by heating, shelling, and peeling, and distinguishes subsequent roasting and other processing. International commercial-quality standard; not Canadian label semantics, safety advice, or evidence about the Mayrand/Metro SKU processes. |
| `WP03-I-RAW-CASHEW-R361-20261016-S02` | OQLF, [GDT: noix de cajou](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869307/noix-de-cajou), preferred terms, definition, and notes. | Supports Québec `noix de cajou`, Latin *Anacardium occidentale*, and the distinction between the fruit with shell and the edible kernel (`amande de cajou`). Says the edible kernel is generally sold shelled and roasted; it does not standardize the product phrase `noix de cajou crues`. |
| `WP03-I-RAW-CASHEW-R361-20261016-S03` | U.S. FDA, [MPM V-10: Nuts and Nut Products Methods](https://www.fda.gov/food/laboratory-methods-food/mpm-v-10-nuts-and-nut-products-methods), “Cashew Nuts.” | Notes caustic liquid in the cashew shell. Used only to corroborate the shell boundary; not a cooking, home-processing, or retail-kernel safety determination. |
| `WP03-I-RAW-CASHEW-R361-20261016-S04` | OQLF, [GDT: baume de cajou](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8399043/baume-de-cajou), definition and explanatory note. | Describes the caustic substance between cashew shells and the injury risk from trying to extract the nut manually or by biting the shell. Terminology and shell-context evidence, not a cashew-kernel safety assessment. |
| `WP03-I-RAW-CASHEW-R361-20261016-S05` | Mayrand, [Noix de cajou crues 1 kg](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/noix-et-fruits-secs/noix/noix-de-cajou-crue-mayrand-chef-26489), title and Information section. | Québec retailer wording and stated uses in salads, snacks, sauces, and stews. Product listing does not give an ingredient declaration or processing method; inventory and price are time-sensitive. |
| `WP03-I-RAW-CASHEW-R361-20261016-S06` | Mayrand, [Noix de cajou rôties non salées 1 kg](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/noix-et-fruits-secs/noix/noix-de-cajou-rotie-non-salee-mayrand-chef-26490), title and related raw SKU listing. | Confirms a separately named roasted, unsalted SKU alongside the raw-named item. The two listing titles suggest a retail distinction but do not define the raw product's process or establish a general French form name. |
| `WP03-I-RAW-CASHEW-R361-20261016-S07` | Metro, [Selection Noix de cajou entières crues](https://www.metro.ca/epicerie-en-ligne/allees/collations/noix-de-cajou-entieres-crues/p/059072050130), title and ingredients. | Independent Québec-facing retailer label for a 100 g whole raw-named product whose listed ingredient is cashews. It provides no processing or preparation directions; the retailer advises checking the package for current information. |

## Disposition

**Hold** `raw cashews / noix de cajou crues` as a form boundary outside active references, forms, aliases, and the shared ledger. Keep `ingredient-ref-cashews` unchanged as the edible-kernel identity. Reconsider this boundary when a bundled recipe requests the state or a Canadian/Québec manufacturer source documents the relevant post-shell process and meaning of the retail `raw` label. Do not infer that `raw` means unheated, untreated, or safe for home shelling; do not generalize one retailer's distinction to other products. The broader Section I form and processing-sensitive-kernel checklists remain open.

The documentation-only hold was integrated as described in the linked README. No software tests or emulator checks were run.
