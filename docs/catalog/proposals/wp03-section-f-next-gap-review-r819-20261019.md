# WP03 Section F R819 — Kellogg's Frosted Flakes serving evidence

- **Reviewed:** 2026-10-19.
- **Target:** Existing `ingredient-ref-frosted-flakes-cereal`, the standard Canadian Kellogg's Frosted Flakes product added in R783.
- **Recommendation:** Accept one manufacturer-label portion observation for the English Canadian SmartLabel record: 1 cup (38 g) on the exact 1,410 g package, GTIN `00064100108301`.
- **Exact scope:** Add one SmartLabel source row, one package-specific `portion_weight` observation, and one accepted measurement decision to the existing ledger record; set `measurementState` from `not_yet_researched` to `researched_supported`. Leave active references, French names, sibling identities, forms, aliases, densities, mappings, substitutions, recipes, and generated search index unchanged.

## Evidence and currentness

R783 established the standard product as `Kellogg's Frosted Flakes Cereal / Céréales Kellogg's Frosted Flakes` from the paired WK Kellogg Canada family pages and English product page ([R783 proposal](wp03-section-f-next-gap-review-r783-20261018.md)). The live English product page names the standard product, lists a 1,410 g size, selects 1,410 g for SmartLabel, and links directly to the label below. The linked English SmartLabel record identifies GTIN `00064100108301`, displays a **1,410 g** package, and states **“Per 1 cup (38 g)”** in Nutrition Facts. Its NLI number is 17860. The evidence supports one product-label serving for this exact GTIN/package pair.

The manufacturer warns that product details may change and instructs users to check the physical package. The SmartLabel's last-update field renders a template token instead of a usable date; the English page was returned with a two-day crawl indicator. The current English product page and its direct SmartLabel link make the 1,410 g match current as accessed on 2026-10-19, but the ledger should retain the observation as a dated source record, not a promise that future packages or formulas are unchanged.

I checked the French SmartLabel page as well. It identifies `Céréales Kellogg's Frosted Flakes`, GTIN `00064100143166`, a **580 g** package, and 1 tasse (38 g), but was returned with a two-month crawl indicator. The searchable French product-page snapshot lists 275 g, 355 g, 545 g, 950 g, and 1,410 g, not 580 g; direct French product-page extraction returned only a page shell. Although the French label uses the same NLI number, I do not treat it as a current package counterpart or add its serving observation. The French product wording remains established by R783; no French measurement is proposed. This keeps a stale package record separate from the current linked English package.

## Proposed ledger delta

Append one source row to `ingredient-ref-frosted-flakes-cereal`:

| Proposal-local source | URL and locator | Supports and limit |
|---|---|---|
| `WP03-FROSTED-FLAKES-MEASURE-R819-20261019-S01` | WK Kellogg Canada / SmartLabel, title **Kellogg's Frosted Flakes® Cereal - SmartLabel™**, [English label](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100108301); product title, package size, GTIN, and Nutrition Facts. | The record displays GTIN `00064100108301`, package 1,410 g, and Per 1 cup (38 g). This is the exact manufacturer-linked English package record; it does not establish a reusable cereal measure, density, or package yield. Set `sourceKind: manufacturer` and `accessedOn: 2026-10-19`. |

Append this observation, with `sourceIds: ["WP03-FROSTED-FLAKES-MEASURE-R819-20261019-S01"]`:

| Field | Proposed value |
|---|---|
| `observationId` | `frosted-flakes-1410g-gtin-00064100108301-one-cup-38g-r819-20261019` |
| `relationship` | `portion_weight` |
| `value`, `valueUnit` | `38`, `g` |
| `foodDescription` | `Kellogg's Frosted Flakes Cereal, 1,410 g package, GTIN 00064100108301.` |
| `foodState` | `Dry ready-to-eat cereal, as sold.` |
| `measurementMethod` | `Canadian manufacturer SmartLabel serving declaration; cup fill and measuring method are not specified.` |
| `quantityBasis` | `Applies only to the 1,410 g GTIN 00064100108301 label record. Not a general cereal or corn-flakes measure, density, volume-to-mass conversion, or package yield.` |
| `evidenceKind` | `manufacturer_label` |
| `sourceQuantity`, `observedMassG` | `{amount: 1, unit: cup}`, `38` |

Record one accepted decision citing S01: add only this exact-package manufacturer portion. Keep `identityState: verified` and `substitutionResearchState: not_yet_researched`; this review does not add substitution evidence. Do not add an active measure, form, alias, default density, unit mapping, conversion, package yield, sibling-product observation, recipe link, or substitution finding/rule. Do not transfer the English value to the stale French 580 g SmartLabel record.

The English product detail URL and French family-page URL already have source owners from R783. Reuse the existing English product source `WP03-FF-FAMILY-R783-20261018-S02` as identity/link context; do not register a duplicate product-page URL or alter the French source owner. The exact English SmartLabel URL and the R819 source ID are not currently owned in the ledger. The French SmartLabel URL is also unowned, but is deliberately not proposed for registration.

## Ownership, picker, and corpus audit

| Surface | Current state and R819 effect |
|---|---|
| Active identity | `ingredient-ref-frosted-flakes-cereal` is `Kellogg's Frosted Flakes Cereal / Céréales Kellogg's Frosted Flakes`, category `GRAIN_AND_CEREAL`, with empty aliases, null density, and empty unit mappings. The French display is already supported by the R783 manufacturer family review; no name or alias change is needed. |
| Measurement, forms, and neighboring rows | The ledger is identity-verified, has `measurementState: not_yet_researched`, and has no measurement observations. No forms exist under this reference. The R179 Less Sugar Multigrain cereal and the three other R783 variants stay separate. Generic `corn flakes / flocons de maïs` remains unchanged. No Frosted Flakes package yield or substitution owner was found. |
| Picker projection | [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) prefers a complete word phrase found contiguously anywhere inside an indexed name, alias, or form term; it is not limited to exact full labels. On the current 1,886-reference / 199-form snapshot, `Frosted Flakes` returns 5 family identities (including R179 Less Sugar Multigrain); `Frosted Flakes Cereal` and `Kellogg's Frosted Flakes Cereal` each return 1; `Céréales Kellogg's Frosted Flakes` returns 3; and `flakes` returns 34. Broad `cereal` / `céréales` return 106 / 103, while generic `corn flakes` / `flocons de maïs` each return 1. This proposal changes only ledger evidence, so all picker results remain the same. |
| Bundled recipes | Scanned the [manifest-listed corpus](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json): 114 recipes and all 1,123 ingredient rows. No Frosted Flakes wording, standard reference link, or GTIN appears. No bundled recipe demand or link is proposed. |

## Static disposition

This is a distinct measurement follow-up to the completed R783 identity review and does not revisit R813's dry-millet boundary or R816's Froot Loops measurement. The live plan still leaves Section F open for remaining grain and cereal coverage ([active checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L564)). The live reference, ledger, forms, package-yield and substitution surfaces, current picker behavior, and recipe corpus were checked. No software test, build, emulator run, or deployment is needed for this proposal. If accepted, the only shared data change is a source-specific research-ledger JSON addition, which the current `AGENTS.md` exempts from tests when a change only adds database JSON data.
