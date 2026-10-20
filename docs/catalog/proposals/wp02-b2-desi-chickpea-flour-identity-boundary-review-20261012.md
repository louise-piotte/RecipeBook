# WP02 B2 — Desi chickpea flour identity boundary

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as `ingredient-ref-desi-chickpea-flour`; proposal sources S01–S08 and the reused sources WP02-S136–S137 are recorded in the research ledger. No recipe or numeric behavior changed.
- **Scope:** Decide whether the source-named Canadian product `Desi chickpea flour / farine de pois chiches Desi` merits a type-specific flour reference distinct from generic chickpea flour, and set its English/French picker boundary. This does not reopen black chickpeas, generic chickpea flour/besan, or roasted Bengal gram flour/chana sattu.
- **Proposal-local source IDs:** `WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S01` through `S08`. Reused chickpea-boundary sources WP02-S136 and WP02-S137 remain linked to their original source records.

## Recommendation

**Accept one identity-only `FLOUR_AND_STARCH` reference:**

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-desi-chickpea-flour` |
| English display | `Desi chickpea flour` |
| Québec French display | `farine de pois chiches Desi` |
| English aliases | `[]` |
| French aliases | `[]` |
| Category | `FLOUR_AND_STARCH` |
| Default density | `null` |
| Unit mappings | `[]` |

The recommendation is for the exact, type-qualified milling product sold by a Canadian farm/mill and named in a current French-language Canadian retail listing. CFIA classifies Desi and Kabuli as distinct types of the same species, *Cicer arietinum*; OQLF recognizes the French base term `pois chiche desi`; and the Maxi listing supplies the exact French flour wording. Axten Farms describes its product as finely milled from small, dark Desi chickpeas and says the darker seed coat is ground into the flour. This supports a narrow source-named milling identity, not a standardized flour class or an assumption that every product called chickpea flour has the same seed type or milling treatment. [S01–S06]

Use no aliases. In particular, do not add `black chickpea flour`, `kala chana flour`, `kala chana atta`, `besan`, `gram flour`, or any roasted-flour wording. The official Canadian grading authority says some Kabuli varieties are black, so colour alone cannot identify Desi; retailer and standards evidence also does not establish that these short names always refer to the same flour process. Keep `roasted chickpea flour` and its French counterpart on the existing chana-sattu row. [S04, S07–S09; prior WP02 roasted-gram and WP03 chickpea-type reviews]

| Phrase or behavior | Disposition | Boundary |
|---|---|---|
| `Desi chickpea flour` | **Accept as the proposed English display** on a new type-specific milling-product row. | Exact current Canadian producer wording; Axten states that the flour is milled from Desi chickpeas. It is not an alias for all chickpea flour. [S05] |
| `farine de pois chiches Desi` | **Accept as the Québec French display** on the same row. | Exact French-language Maxi product wording; OQLF independently supports `pois chiche desi` as the French name for the type. The retailer phrase is product-name evidence, not an OQLF ruling about flour classification. [S03, S06] |
| `chickpea flour`; `farine de pois chiche`; `farine de pois chiches` | Keep on `ingredient-ref-chickpea-flour`. | These are the generic flour display and existing French alias. Do not move or narrow them. The broad phrases may return the new Desi row alongside generic chickpea flour and chana sattu. |
| `black chickpeas`; `kala chana`; `pois chiches noirs` | Keep on `ingredient-ref-black-chickpeas`. | The black/Kala Chana row names a narrower market product; it does not cover all Desi chickpeas. Do not derive a flour alias from a whole-pulse name. [S04, S08] |
| `Desi chickpeas`; `pois chiches Desi`; `pois chiche Desi` | Keep on `ingredient-ref-desi-chickpeas`. | The active whole-pulse identity remains separate. A query for `pois chiches Desi` may return both whole chickpeas and the proposed flour; the full phrase `farine de pois chiches Desi` identifies the flour row. |
| `roasted chickpea flour`; `roasted Bengal gram flour`; `farine de pois chiches grillés`; `chana sattu` | Keep on `ingredient-ref-chana-sattu`. | Those aliases identify a source-defined roasted product, not this unqualified Desi flour. [Prior WP02-S136–S140 and the roasted-gram review] |
| `black chickpea flour`; `kala chana flour`; `kala chana atta`; `besan`; `gram flour`; `roasted gram flour` | **Do not assign.** | Black/Kala Chana is not a synonym for all Desi; besan and gram-flour usage can depend on pulse and dehulling/roast context. Prior reviews explicitly keep these broad terms unassigned. [S04, S07–S08, WP02-S136–S137] |
| Forms, density, mappings, measurements, conversions, yield, recipe links, substitutions | **No additions.** | The sources do not establish reusable generic values or recipe-context rules. |

## Product scope and evidence limits

CFIA identifies chickpea as *Cicer arietinum* and classifies it into Desi and Kabuli types. Its English and French inspection guides describe Desi seed coats as pigmented from tan to black and Kabuli seed coats as thin and white to cream; the Canadian Grain Commission separately notes that some newer Kabuli varieties are black or green. OQLF's 2026 `pois chiche` entry pairs the French term with *Cicer arietinum* and describes Desi as smaller and brown compared with Kabuli. These are crop/type definitions, not standards for flour composition, dehulling, or fineness. [S01–S04]

Axten Farms is a Saskatchewan grower and on-farm mill. Its current English product page calls the product `Desi Chickpea Flour`, describes it as finely milled from small, dark Desi chickpeas, and says the seed coat is ground into the flour. Those statements support the source-specific identity and a whole-seed milling scope for this named product. They are manufacturer statements, not an independent or national flour specification. Axten's listed culinary uses and flavor language remain product claims. [S05]

Maxi's current French-language listing uses the exact title `Farine de pois chiches Desi`. This is Canadian retail wording and supports the French display. OQLF supports the base term `pois chiche desi` but does not have a reviewed entry for the complete flour compound. Do not describe the compound as an OQLF-preferred term or infer that the retailer listing standardizes all Desi flour products. [S03, S06]

Canadian sources use adjacent names with different limits. Galloway's says Desi chickpeas may be ground into chickpea flour and associates that flour with besan/yellow gram flour, while Indian standards and eNAM evidence in the existing WP02 record distinguish dehulled besan from roasted Bengal gram flour/chana sattu. Axten's whole-seed product and those broader naming conventions do not justify assigning `besan` or `gram flour` as aliases. A Canadian Brar's listing markets a `Black Chick Pea (Kala Chana)` flour, but the Canadian Grain Commission's color classification shows why `black` is not a safe alias for the wider Desi type. [S04, S07–S08, WP02-S136–S137]

### Reconciliation with prior reviews

- [`wp03-h-chickpea-types-roasted-gram-review-20261011.md`](wp03-h-chickpea-types-roasted-gram-review-20261011.md) and [`wp03-black-chickpea-identity-review-20261011.md`](wp03-black-chickpea-identity-review-20261011.md) established the active Desi and black/Kala Chana whole-pulse boundaries. This proposal follows them and does not reuse whole-pulse aliases for flour.
- [`wp02-roasted-gram-flour-product-boundary-review-20261011.md`](wp02-roasted-gram-flour-product-boundary-review-20261011.md) kept `besan`, `gram flour`, and unqualified roasted-gram wording inactive and retained the separate generic chickpea-flour and chana-sattu references. This proposal does not reopen those dispositions.
- [`wp02-b2-b3-flour-starch-residual-review-20261010.md`](wp02-b2-b3-flour-starch-residual-review-20261010.md) and [`chana-sattu-identity.md`](../batches/chana-sattu-identity.md) cover the existing chickpea flour and roasted Bengal gram identities. This proposal addresses only the later, type-qualified Desi flour product and its phrase ownership.

## Picker phrase boundary

The current search normalizer folds case and accents, looks for complete word phrases first, then falls back to partial matching; it does not stem singular/plural forms. Under that behavior, the proposed exact phrase `Desi chickpea flour` and the full French phrase `farine de pois chiches Desi` resolve to the proposed row. The shorter `pois chiches Desi` phrase remains broad enough to match both the whole Desi-chickpea row and the flour row. Generic `chickpea flour` and `farine de pois chiches` remain family-level searches and can return the generic row, the new specific row, and the existing chana-sattu row because its qualified aliases contain those phrases. [Current implementation: `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`]

No new `black`, `Kala Chana`, `besan`, `gram`, or roast aliases should be used to force a result. The exact type-qualified display phrases already give users a precise route while preserving current whole-pulse and roasted-flour ownership.

## Pre-integration ownership and recipe-demand audit

Read-only snapshot of the shared worktree when this proposal was reviewed on 2026-10-12. Hashes are SHA-256 of the exact files inspected before integration.

| Surface | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,262 | `f610b0851813bae1760192504dce3cb122abb94891d756614c181ee426f932d8` |
| Ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy import candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| Research ledger records | 1,571 | `d7c3428dba6f3a0f3874f58fdd8e65d8399115f180ec6468f8fd19052589c35a` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows / 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Exact phrase matching was checked after Unicode decomposition, accent folding, lowercasing, and punctuation/spacing normalization across reference names and aliases, form labels and match terms, and legacy candidate names and aliases. There is no exact active, form, legacy, or prior ledger owner for `Desi chickpea flour`, `farine de pois chiches Desi`, `black chickpea flour`, `kala chana flour`, or `kala chana atta`.

| Current owner | Live wording and data | Decision |
|---|---|---|
| `ingredient-ref-chickpea-flour` | `chickpea flour / farine de pois chiche`; French alias `farine de pois chiches`; category `FLOUR_AND_STARCH`; density `null`; mappings `[]`. | Keep as the generic flour identity. Its ledger record says `besan` and `gram flour` remain unassigned without regional preparation context. |
| `ingredient-ref-desi-chickpeas` | `Desi chickpeas / pois chiches Desi`; aliases include `pois chiche Desi`; category `LEGUME_AND_PULSE`. | Keep as the whole-pulse type identity. Its ledger decision explicitly keeps the type separate from flour. |
| `ingredient-ref-black-chickpeas` | `black chickpeas / pois chiches noirs`; aliases include `black chickpea`, `kala chana`, and `pois chiche noir`. | Keep as the narrower whole-pulse/Kala Chana product, not a Desi-flour alias target. |
| `ingredient-ref-chana-sattu` | `chana sattu / farine de sattu`; aliases include `roasted Bengal gram flour`, `roasted chickpea flour`, and `farine de pois chiches grillés`. | Keep its source-defined roasted flour wording separate. |
| Desi chickpea whole-pulse forms | `ingredient-form-desi-chickpeas-split-dehulled` and `ingredient-form-desi-chickpeas-roasted-split-dehulled`, attached to `ingredient-ref-desi-chickpeas`. | No form belongs on the proposed milling identity. The active catalog has no Desi-flour form. |

No exact proposed phrase is owned by any of the 66 legacy candidates. The ledger has active records for the generic chickpea-flour, whole Desi chickpea, black chickpea, and chana-sattu rows, but no `ingredient-ref-desi-chickpea-flour` or `candidate-desi-chickpea-flour` record. No active row, form, or legacy candidate is being renamed, merged, or stripped of aliases by this proposal.

All 114 manifest-listed recipe JSON files and their 1,123 ingredient rows were searched for `Desi chickpea flour`, `chickpea flour Desi`, `farine de pois chiches Desi`, `farine de pois chiche Desi`, `black chickpea flour`, `kala chana flour`, `kala chana atta`, `besan`, `gram flour`, `chickpea flour`, `farine de pois chiche(s)`, `chana sattu`, `roasted chickpea flour`, `pois chiche(s) Desi`, and `pois chiche noir`. There were **zero matching recipe files and zero matching ingredient rows** for these flour/product phrases. There are also zero recipe ingredient links to `ingredient-ref-chickpea-flour`, `ingredient-ref-chana-sattu`, `ingredient-ref-desi-chickpeas`, or `ingredient-ref-black-chickpeas` in the current package. No recipe link or recipe edit is proposed; this is a catalog coverage decision rather than a response to bundled-recipe demand.

## Numeric, form, and substitution limits

- Do not copy the whole-pulse dried, split/dehulled, or roasted-split forms onto a flour identity. The proposed identity is already the dry milled product; no separate form is established.
- Keep `defaultDensity: null` and `unitMappings: []`. Neither Axten nor Maxi supplies a general mass-per-volume value. Maxi's 5 kg retail package size, where shown, is a package quantity, not a kitchen measure or density.
- Add no unit conversion, milling yield, hydration value, or recipe quantity. CFIA seed-class dimensions and the source's product price/package data are not ingredient conversions.
- Axten's examples of fritters, pancakes, crackers, sauces, and baking are product-use claims, not tested substitution ratios. Add no global or contextual replacement rule to or from wheat flour, Kabuli/generic chickpea flour, besan, chana sattu, or other pulse flours.

## Sources

| ID | Source and bounded evidence | Limits |
|---|---|---|
| **WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S01** | CFIA, [Specific Work Instructions 142.1.2-3: Pulse seed crop inspection procedures (English)](https://inspection.canada.ca/en/plant-health/seeds/seed-inspection-procedures/pulse-crops), updated 2026-04-01; accessed 2026-10-12. Identifies *Cicer arietinum* and the Desi/Kabuli types; describes their seed coat, size, and color differences. | Crop-seed classification only; does not define flour milling, dehulling, market naming, measures, or replacement behavior. |
| **WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S02** | CFIA, [Instructions particulières 142.1.2-3 : Procédures d’inspection des cultures de semences de légumineuses (French)](https://inspection.canada.ca/fr/protection-vegetaux/semences/methodes-dinspection/legumineuses-grains), updated 2026-04-01; accessed 2026-10-12. Gives the French crop terms `pois chiche`, `desi`, and `kabuli`, with the same type distinction. | Official French crop terminology, not a food-flour standard or a Québec food-product naming decision. |
| **WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S03** | OQLF, [“pois chiche” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296897/pois-chiche), updated 2026; accessed 2026-10-12. Pairs `pois chiche` with chickpea/*Cicer arietinum* and describes `pois chiche desi` as smaller and brown. | Supports the French base/type term; does not list the full flour compound. |
| **WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S04** | Canadian Grain Commission, [“Chickpeas: Classes, types and varieties” (English)](https://www.canada.ca/en/grain-commission/services/grain-quality/official-grain-grading-guide/22-chickpeas/classes-types-varieties.html) and [“Pois chiches : Classes, types et variétés” (French)](https://www.canada.ca/fr/commission-grains/services/qualite-grains/guide-officiel-classement-grains/22-pois-chiches/classes-types-varietes.html), Official Grain Grading Guide, 2025–26; accessed 2026-10-12. Describes both chickpea classes and notes that some Kabuli varieties are black or green. | Establishes why seed color alone cannot define Desi; does not define flour products. |
| **WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S05** | Axten Farms, [“Desi Chickpea Flour”](https://www.axtenfarms.ca/product/desi-chickpea-flour), current product page; accessed 2026-10-12. Names the English product, says it is finely milled from small/dark Desi chickpeas, and says the seed coat is ground into the flour. Axten identifies itself as a Saskatchewan farm that grows, mills, and packs grain/flour on-farm [farm overview](https://www.axtenfarms.ca/). | First-party, source-specific product scope; not a national flour specification. Flavor, nutrition, and recipe-use claims remain manufacturer claims. |
| **WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S06** | Maxi, [“Farine de pois chiches Desi”](https://www.maxi.ca/fr/farine-de-pois-chiches-desi/p/21071316_EA), current French-language product listing; accessed 2026-10-12. Uses the exact proposed French display and describes a nutty-flavored Desi flour product. | Retail wording supports display selection, not botanical verification, a milling standard, or an OQLF ruling. |
| **WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S07** | Galloway’s Wholesome Foods, [“Chickpeas (Desi)”](https://www.gallowaysfoods.com/products/chickpeas-desi), current Canadian retailer page; accessed 2026-10-12. Says Desi chickpeas are ground into chickpea flour and associates that flour with Besan/yellow gram flour. | Retail explanation only. Its broad equivalence wording does not establish that every besan product uses whole Desi seed or has the same process. |
| **WP02-B2-DESI-CHICKPEA-FLOUR-20261012-S08** | QuickSupply, [Brar’s “Flour — Black Chick Pea (Kala Chana)”](https://quicksupply.ca/products/brars-flour-black-chick-pea-kala-chana), current Canadian wholesale listing; accessed 2026-10-12. Names a black/Kala Chana flour product and says it is made from Kala Chana. | Retail listing for a narrower black/Kala Chana product; it does not make black chickpea flour a synonym for all Desi chickpea flour. |
| **WP02-S136** | FSSAI, [Food Safety and Standards Regulations, Chapter 2.4](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals%20and%20Cereal%20products.pdf), already recorded on `ingredient-ref-chana-sattu`. | Defines roasted Bengal gram flour (chana sattu) from roasted gram grains; used to preserve the roasted-product boundary. |
| **WP02-S137** | eNAM, [Commodity list](https://enam.gov.in/commodity/commodity-list), already recorded on `ingredient-ref-chana-sattu`. | Lists chickpea flour (besan) separately from roasted Bengal gram flour (chana sattu); it does not establish a universal `besan` synonym for this whole-seed Desi product. |

## Integration record

Accepted and integrated as identity-only `ingredient-ref-desi-chickpea-flour`, with no aliases. The exact type-qualified English and French phrases return the new row; generic `chickpea flour` and `farine de pois chiches` continue to return multiple products, and `pois chiches Desi` retains both the whole-pulse and flour identities. The existing generic flour, Desi chickpea, black chickpea, and chana-sattu rows, forms, and recipe files remain unchanged. No forms, measurements, density, unit mappings, recipe links, conversions, yields, or substitutions were added. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`. See [`wp02-b2-desi-chickpea-flour-integration-20261012/README.md`](../batches/wp02-b2-desi-chickpea-flour-integration-20261012/README.md).
