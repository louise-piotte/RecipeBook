# WP03 Section I — residual nut/seed butter and paste review

- **Reviewed:** 2026-10-11
- **Status:** Proposal only. No shared catalog JSON, recipe, ledger, plan, roadmap, generated file, or integration README was changed.
- **Scope:** Residual nut/seed butters and pastes after the current kernel, seed, coconut, sesame, and processed-product integrations. This packet resolves the pistachio-butter naming gap and audits remaining held terms. It does not close Section I.
- **Research focus:** Current active owners and forms, legacy candidates, ledger states, all bundled recipe ingredient lines, previous WP03 product-boundary decisions, and current Canadian/Québec product naming.

## Recommendation

Add one identity-only product reference for **pistachio butter / beurre de pistache**, category `FAT_AND_OIL`, with no aliases. A current Québec maker uses the exact French product name, and a Canadian nut-butter maker lists a product as `Pistachio Butter Smooth`. Keep it separate from the active **pistachio paste / pâte de pistache** reference: the terms are not exact-key synonyms, one maker distinguishes them by texture/use, and the existing recipe lines explicitly ask for paste. No source establishes a universal formulation or a general conversion between the two.

The recommendation is deliberately limited to the named product class. Do not transfer a specific maker’s dry-roasted-only or oil-added formula to the new reference. Do not add a form, density, unit mapping, recipe link, yield, conversion, or substitution. Keep generic/mixed nut or seed butter, hemp-seed butter, generic sesame paste, black-sesame paste, and unqualified pistachio cream/spread terms held as described below.

## Pre-integration snapshot

Read from the live split seed package and research ledger on 2026-10-11, before this proposal is applied:

| Artifact | Current count |
| --- | ---: |
| Ingredient references | 1,087 |
| Ingredient forms | 79 |
| Legacy import candidates | 75 |
| Research-ledger records | 1,386 |
| Ledger source entries / distinct source IDs | 4,613 / 3,773 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

The proposed ID `ingredient-ref-pistachio-butter` and packet source-ID prefix `WP03-I-BUTTER-PASTE-RESIDUAL-20261011` are absent from the active references, legacy candidates, ledger, and prior proposal/batch files at this snapshot. The seven source IDs below are unique to this packet and have not been written into the ledger.

## Audit basis

Read `AGENTS.md`, `Requirements.md`, the relevant Section I checklist in `docs/RecipeBook-global-ingredient-catalog-plan.txt`, `roadmap.md`, and `docs/catalog/ingredient-catalog-workflow.md`. The data review used the live [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [legacy candidate list](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json). All recipe checks followed the 114 paths in `manifest.v1.json`.

The relevant prior decisions were checked in the [nut/seed paste product review](wp03-nut-seed-paste-product-gap-review-20261010.md), [hemp-seed butter hull review](wp03-hemp-seed-butter-hull-boundary-review-20261011.md), [sesame/tahini review](wp03-sesame-tahini-boundary-review-20261009.md), [coconut-products Québec review](wp03-coconut-products-quebec-boundary-review-20261011.md), [independent coconut-butter display review](wp03-coconut-butter-quebec-display-independent-review-20261011.md), and [Section H–I recipe audit](wp03-section-h-i-pulses-nuts-gap-review-20261011.md). Regional sweeps and product-specific reviews continue to keep named Chinese sesame paste, tahini, whole hemp seed/hemp hearts, and species-qualified kernels separate; no sweep supplied another exact bundled butter/paste ingredient line.

The [North American cuisine sweep](wp06-north-american-cuisine-gap-sweep-20261009.md) and [East Asia cuisine sweep](wp06-east-asia-cuisine-gap-sweep-20261011.md) were also checked for overlapping product candidates. The East Asia sweep leaves generic sesame paste unresolved and explicitly keeps it separate from Chinese sesame paste and tahini; no additional bundled product line is attributed to those regional sources.

Exact-key checks mirror `normalizeIngredientSearchKey`: lowercase, NFKD, accent and ligature folding, punctuation-to-space, and whitespace collapse. The live ingredient-form labels/match terms and legacy names/aliases were included. Search result overlap from shorter substrings is noted separately from exact-key ownership.

## Current owners, forms, and ledger status

The live seed already has the following relevant butter identities: `ingredient-ref-almond-butter`, `ingredient-ref-cashew-butter`, `ingredient-ref-hazelnut-butter`, `ingredient-ref-macadamia-butter`, `ingredient-ref-walnut-butter`, `ingredient-ref-pecan-butter`, `ingredient-ref-pine-nut-butter`, `ingredient-ref-brazil-nut-butter`, `ingredient-ref-pumpkin-seed-butter`, `ingredient-ref-sunflower-seed-butter`, `ingredient-ref-peanut-butter`, and `ingredient-ref-coconut-butter`. Keep each as its own product reference and separate from its source kernel or seed.

Current related paste/spread/filling identities include `ingredient-ref-almond-paste`, `ingredient-ref-pistachio-paste`, `ingredient-ref-praline-paste`, `ingredient-ref-tahini`, `ingredient-ref-chinese-sesame-paste`, `ingredient-ref-hazelnut-spread-with-cocoa`, `ingredient-ref-nutella`, `ingredient-ref-chestnut-puree`, `ingredient-ref-sweetened-chestnut-spread`, and `ingredient-ref-poppy-seed-filling`. These names are not candidates for duplication in this packet. In particular, tahini’s French display `beurre de sésame` remains the OQLF-backed tahini identity; it does not claim every product called sesame butter or sesame paste is the same product.

All 79 live forms were checked. None is attached to a current nut/seed butter, paste, spread, or filling identity. The existing toasted-sesame seed forms and coconut-meat forms remain on their seed/coconut owners; they are not butter/paste forms. The reviewed processed-product references have `defaultDensity: null` and empty `unitMappings`; this packet adds no numeric behavior.

Ledger status relevant to the residual decisions:

- `ingredient-ref-pistachio-paste` is `unreviewed` with no sources or decisions despite its two bundled lines. The Callebaut source below supports the current name and one culinary paste product, without defining the recipe’s exact paste formula. Recommend adding this source as identity evidence and marking the active name/product identity verified; leave measurement and substitution research unchanged.
- `candidate-hemp-seed-butter` remains `needs_clarification`; its accepted source set does not identify whether the named Québec product uses hulled hearts or whole seeds.
- `candidate-generic-sesame-paste` remains `needs_clarification`; retain the prior distinction among OQLF-defined tahini, the separately named Chinese sesame paste, and the unresolved generic/black-sesame phrases.
- There is no ledger record or legacy candidate for pistachio butter or generic mixed-nut/seed butter. The existing active almond, hazelnut, and peanut butter references have no new identity work proposed here. The legacy `ingredient-ref-natural-peanut-butter` candidate overlaps the active peanut-butter alias, and should not be promoted as a second reference.

## Proposed dispositions

| Term or current product | Recommendation | Scope and boundary |
| --- | --- | --- |
| **Pistachio butter / beurre de pistache** | **Add `ingredient-ref-pistachio-butter`**, category `FAT_AND_OIL`; no aliases. | Current Québec and Canadian product sources use these exact names. The name is a product identity, not a fixed formulation. Keep separate from pistachios, active pistachio paste, and composite pistachio cream/spreads. |
| **Pistachio paste / pâte de pistache** | Retain `ingredient-ref-pistachio-paste`; add Callebaut as one source for the current identity only. | Recipe 056 asks for paste, not butter. The source describes one pure, lightly roasted, finely ground, unsweetened paste and its culinary uses; do not transfer that exact formula to every paste or to the two recipe inputs. |
| **Hemp-seed butter** | Hold. | Current Québec maker evidence does not state whether the pre-germinated hemp seeds retain their hull. Do not attach the wording to hulled hemp hearts or whole hemp seeds. Retain the existing candidate/decision. |
| **Generic sesame paste / sesame butter** | Hold; no alias or reference. | Keep accepted tahini and active Chinese sesame paste distinct. OQLF’s `beurre de sésame` term belongs to tahini, while source-specific hull/roast and regional paste products are not one universal crosswalk. |
| **Black-sesame paste** | Hold; no identity, alias, form, or recipe link. | Québec recipe wording exists outside this bundle, but the prior review found no composition or stable retail-product evidence that settles hull, roast, or paste class. The bundled corpus has no matching ingredient row. |
| **Generic/mixed nut or seed butter** | Hold; no generic identity or blend IDs. | No bundled line requests an unspecified butter or a defined blend. Current recipes name peanut, hazelnut, or almond butter directly; blend formulas vary by product. |
| **Pistachio cream/spread** | Hold as an unqualified class. | Product formulas can include sugar, dairy, oils, chocolate, or other nuts. No bundled line requests one. Preserve existing Nutella and hazelnut-spread identities; do not generalize them. |
| **Cashew, macadamia, walnut, pecan, Brazil-nut, pine-nut, pumpkin-seed, sunflower-seed, almond, hazelnut, peanut, and coconut butters** | Retain the current exact owners; no duplicate rows or new forms. | Earlier product reviews and the current seed already cover them. Do not infer a universal ingredient list from one brand or add unsupported cross-substitutions. |
| **Almond paste, praline paste, tahini, Chinese sesame paste, chestnut purée/spread, and poppy-seed filling** | Retain the current exact owners; no duplicate rows. | These are separate established product identities with their own product/process boundaries. |

### Integration shape for the one new identity

If accepted, add only:

- ID: `ingredient-ref-pistachio-butter`
- English display: `pistachio butter`
- fr-CA display: `beurre de pistache` (Québec product-label evidence; no OQLF terminology entry is claimed)
- Category: `FAT_AND_OIL`
- Aliases: none
- Density, unit mappings, forms, recipe links, yields, conversions, and substitution rules: none

Add source evidence from S01–S05 to the new identity’s ledger record, with a decision that limits the row to the named retail product class and leaves product composition unspecified. Add S06 to the existing `ingredient-ref-pistachio-paste` record as one exact source for its display and culinary product identity. Do not add a butter-to-paste alias, equivalence, form conversion, or recipe-line substitution.

## Exact collision and recipe-demand audit

The exact normalized keys for `pistachio butter` and `beurre de pistache` have no current owner among references, forms, or legacy candidates. The exact keys for `pistachio paste` and `pâte de pistache` belong to `ingredient-ref-pistachio-paste`. The whole-kernel reference `ingredient-ref-pistachios` is a separate owner; short `pistachio`/`pistache` queries may return both the kernel and paste through partial search, but that is not an exact-key collision.

| Query | Exact owner | Disposition |
| --- | --- | --- |
| `pistachio butter`; `beurre de pistache` | None | Add only the exact bilingual display pair above. Do not alias to the paste or kernel identities. |
| `pistachio paste`; `pâte de pistache` | `ingredient-ref-pistachio-paste` | Preserve both existing displays and recipe links. |
| `pistachios`; `pistaches` | `ingredient-ref-pistachios` | Keep whole kernels separate from paste and butter. |
| `pistachio cream`; `pistachio spread`; `crème de pistache`; `tartinade à la pistache` | None as an exact phrase | Hold broad names; no recipe demand and no stable formulation established. |
| `beurre de sésame`; `tahini`; `tahin`; `tahina` | `ingredient-ref-tahini` | Preserve the current accepted pair/aliases. Do not attach generic or Chinese sesame-paste terms. |
| `Chinese sesame paste`; `pâte de sésame à la chinoise` | `ingredient-ref-chinese-sesame-paste` | Keep separate from tahini and generic/black sesame paste. |
| `sesame paste`; `pâte de sésame`; `black sesame paste`; `pâte de sésame noir` | No exact active/form/legacy owner | Keep held; do not create a blanket alias. |
| `natural peanut butter`; `beurre d'arachide naturel` | Active aliases of `ingredient-ref-peanut-butter`; also legacy candidate ID `ingredient-ref-natural-peanut-butter` | Preserve the active owner. Do not promote the duplicate legacy candidate. |
| `peanut butter chips`; `brisures de beurre d'arachide` | Promoted to active identity in R298 | A baking inclusion, not peanut butter; excluded from this earlier seed-butter audit. See the [R298 integration](../batches/wp02-section-d-peanut-butter-chips-identity-integration-r298-20261016/README.md). |
| `mixed nut butter`; `mixed seed butter`; `beurre de noix mélangées` | None | Hold; no exact bundle demand or stable blend formula. |

### Manifest-listed recipe lines

The scan covered all 1,123 ingredient rows in the 114 manifest-listed recipes. It found 16 ingredient rows for the current butter/paste/spread products below; none asks for pistachio butter, hemp butter, a generic/mixed butter, sesame paste, black-sesame paste, or another new product.

| Recipe line | Exact bundled ingredient text | Current owner and disposition |
| --- | --- | --- |
| `001#9` | `1 tbsp peanut butter` | `ingredient-ref-peanut-butter`; preserve. |
| `003#1` | `16 oz homemade almond paste` | `ingredient-ref-almond-paste`; preserve. |
| `011#6` | `198 g almond paste` | `ingredient-ref-almond-paste`; preserve. |
| `020#10` | `1/2 cup creamy peanut butter` | `ingredient-ref-peanut-butter`; preserve. |
| `022#1` | `240 g smooth peanut butter` | `ingredient-ref-peanut-butter`; preserve. |
| `030#2` | `1/3 cup Nutella` | `ingredient-ref-nutella`; brand is explicit, preserve. |
| `031#5` | `peanut butter` | `ingredient-ref-peanut-butter`; preserve. |
| `031#7` | `hazelnut butter` | `ingredient-ref-hazelnut-butter`; preserve. |
| `031#9` | `almond butter` | `ingredient-ref-almond-butter`; preserve. |
| `040#4` | `1 cup almond butter` | `ingredient-ref-almond-butter`; preserve. |
| `056#7` | `40 g pistachio paste` | `ingredient-ref-pistachio-paste`; preserve. |
| `056#16` | `30 g pistachio paste` | `ingredient-ref-pistachio-paste`; preserve. |
| `067#3` | `1/2 cup natural peanut butter` | `ingredient-ref-peanut-butter`; preserve its natural preparation wording. |
| `070#14` | `60 g almond butter` | `ingredient-ref-almond-butter`; preserve. |
| `090#2` | `1/2 cup natural creamy peanut butter` | `ingredient-ref-peanut-butter`; preserve its preparation note. |
| `095#11` | `2 tbsp peanut butter` | `ingredient-ref-peanut-butter`; preserve. |

Recipe `065#5` has a notes-only mention of peanut butter among examples of optional flavoring. Its ingredient is `Flavoring, to taste`; the line is not linked to peanut butter and is not an additional ingredient demand. Whole pistachios, crushed nuts, or other kernel lines are also not paste/butter demand.

A full-text scan of titles, descriptions, notes, and instructions found no additional purchasable butter/paste demand: recipe 033 mentions Nutella as a serving suggestion; recipe 065 discusses peanut butter as an optional flavoring; recipe 079 makes almond paste and marzipan from its listed ingredients instead of requesting either as an ingredient line. Recipe 056’s paste instructions correspond to its two listed paste lines.

The two pistachio-paste amounts are explicit masses (40 g and 30 g). They are not evidence that butter can replace paste or that a general paste density/measure should be stored. There are no recipe-derived forms, mass-volume mappings, ingredient conversions, or substitutions to add in this packet.

## Source-to-claim table

These source IDs are unique to this proposal, accessed 2026-10-11, and are not yet present in the research ledger. Product and maker sources establish market usage and their own formulation only; none is treated as a universal composition or conversion standard.

| Packet-local source ID | Source | Claim used and limit |
| --- | --- | --- |
| `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S01` | Mille et Une Noix, [Beurre de pistache](https://www.milleetunenoix.ca/products/pistachio-butter) | Current Sherbrooke maker page uses the exact Québec French product title. The listed ingredient is dry-roasted pistachios; the maker says no added oil, salt, or sugar. Supports this named product and local wording only, not a universal formula. |
| `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S02` | Aliments du Québec, [Beurre de pistache](https://alimentsduquebec.com/aliments-dici/collation/beurre-de-pistache) | Lists Mille et Une Noix’s `Beurre de pistache` as a Québec-prepared product and provides current French-market usage. It is a product-directory entry, not an OQLF terminology ruling. |
| `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S03` | Québec Ministry of Agriculture, Fisheries and Food, [Répertoire des aliments québécois: Beurre de pistache crémeux naturel](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207921) | Product directory record associates a pistachio-butter product with Mille et Une Noix and the processed-nut category (last updated 2025-10-29; product data attributed to GS1). The translated ingredient field conflicts with the maker's current product page, so it is not used to establish formulation. This is market-record corroboration, not standard wording. |
| `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S04` | Maturin, [Beurre de pistache nature — Yolo Nuts](https://www.maturin.ca/index.php/produit/les-noix-yolo-inc/beurre-de-pistache-nature/14918/) | Current Granby product listing uses the qualified French name and lists pistachios plus canola oil. This contrasts with S01’s single-ingredient product; formulas are product-specific. The direct page was not fetchable in this pass, so use its indexed listing only for this limited product claim. |
| `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S05` | Nuts to You, [Pistachio Butter Smooth](https://nutstoyou.ca/products/pistachio-butter-smooth/) | Current Canadian product title and ingredient list name dry-roasted pistachios; the maker says it is made in Canada of imported ingredients. Supports the English product name and this product's formula only, not a Québec French term or a universal formulation. |
| `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S06` | Callebaut Canada, [Pure Pistachio Paste / Pâte de pistache pure](https://www.callebaut.com/en-CA/products/callebaut/nuts-pure-pistachio-paste/NPO-PI1-2B-18A) and [French page](https://www.callebaut.com/fr-CA/products/callebaut/nuts-pure-pistachio-paste/NPO-PI1-2B-18A) | One current Canadian-market product is 100% lightly roasted, finely ground pistachios, unsweetened and smooth. The manufacturer identifies pastry, mousse, ganache, ice-cream, and flavoring uses. Supports the active paste product name and its identity evidence only; do not assign this formula to the recipe’s unnamed paste brand or all pistachio pastes. |
| `WP03-I-BUTTER-PASTE-RESIDUAL-20261011-S07` | The Pistachio Factory, [FAQ: pistachio paste and butter](https://pistachiofactory.com/pages/faq) | One manufacturer distinguishes its paste and butter by fineness, particle size, viscosity, and intended use. This supports that a maker can sell separately named products, but its particle thresholds and taxonomy are not a universal definition. |

OQLF exact-term searches for `beurre de pistache` and `pâte de pistache` did not surface a relevant GDT entry in this pass. Accordingly, `beurre de pistache` is recommended as source-attested Québec product wording, not represented as an OQLF-preferred term. The existing product and ledger name should remain easy to revisit if a terminology authority later publishes a more specific entry.

## What can be integrated

1. Add the identity-only `ingredient-ref-pistachio-butter` proposal above using S01–S05 as name/product evidence. Keep the product formula unspecified and do not attach recipe links.
2. Add S06 as one identity source for current `ingredient-ref-pistachio-paste`; record that its composition and use claims are Callebaut-specific. Keep the two recipe lines and their current reference unchanged.
3. Keep all other active owners, legacy status, forms, recipe lines, measurements, and substitutions unchanged.

## What remains held

- Generic or mixed nut/seed butter and any unqualified multi-seed butter.
- Hemp-seed butter until the named Québec product’s hull state is known.
- Generic sesame paste/butter and black-sesame paste; keep tahini and Chinese sesame paste separate.
- Generic pistachio cream/spread and any sweetened or compound pistachio filling unless an exact, recipe-linked product class is reviewed.
- Any proposed `pistachio butter` synonym, alias, form, or conversion for active pistachio paste.
- All unsubstantiated density, cup/spoon conversion, ingredient yield, and cross-product substitutions.

The Section I checklist’s broader butter/paste item remains open after this one identity candidate. The separate open form checklist also remains open; this packet does not establish any useful butter/paste form or numeric behavior.

## Validation notes

- Read-only scan covered every manifest-listed recipe path and 1,123 ingredient rows; the product demand table preserves exact bundled text, amount, and owner.
- Exact-key collision scan covered active bilingual reference names/aliases, all 79 form labels/match terms, and all 75 legacy candidate names/aliases. The proposed pistachio-butter bilingual pair has no exact owner; the active paste and peanut aliases/collision are recorded above.
- Read the current ledger records for the active pistachio paste, the hemp and generic sesame candidates, and related processed-product references. Packet-local source IDs were checked against current ledger/source IDs and prior review/batch files.
- No app tests were run; this is a research proposal only.
- Only this proposal file is written by this packet.
