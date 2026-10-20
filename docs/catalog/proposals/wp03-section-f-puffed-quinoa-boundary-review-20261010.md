# WP03 Section F Puffed Quinoa Boundary Review

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** reviewed and integrated on 2026-10-10. The active reference and research-ledger identity record were added; no forms, legacy candidates, or recipe rows changed.
- **Scope:** one remaining puffed-grain candidate: plain puffed quinoa. Puffed rice and puffed wheat are already active; this packet does not reopen them or review other puffed grains.
- **Recommendation:** accept an identity-only reference for `puffed quinoa / quinoa soufflé` for integration review. Keep the organic qualifier out of the identity. Add no aliases, forms, numeric fields, conversions, yields, or substitutions.

## Current package audit

The current package contains **796 active ingredient references** and **36 ingredient forms**. The research ledger contains **1,022 records**; the legacy-import file contains **81 candidates**. The manifest lists **114 recipes** with **1,123 ingredient rows**.

Relevant active references and forms:

| Current record | Existing scope |
| --- | --- |
| `ingredient-ref-quinoa` — `quinoa / quinoa` | Base pseudocereal identity; owns `ingredient-form-quinoa-dry` and `ingredient-form-quinoa-cooked`. |
| `ingredient-ref-quinoa-flour` — `quinoa flour / farine de quinoa` | Separate flour product. |
| `ingredient-ref-roasted-quinoa-flour` — `roasted quinoa flour / farine de quinoa torréfiée` | Separate flour-processing product. |
| `ingredient-ref-puffed-rice` — `puffed rice / riz soufflé` | Existing processed-grain identity. |
| `ingredient-ref-puffed-wheat` — `puffed wheat / blé soufflé` | Newly integrated processed-grain identity. |

There is no active `puffed quinoa` reference, no puffed-quinoa form, no dedicated puffed-quinoa ledger candidate, and no matching legacy candidate. An accent- and punctuation-folded exact-key audit found no collision for the proposed ID or the full display terms `puffed quinoa / quinoa soufflé`. The existing base word `quinoa` remains active, so a broad `quinoa` picker query can overlap with the proposed longer label; do not use bare `quinoa` as an alias for the puffed product.

## Candidate boundary and proposed row

| Candidate or wording | Disposition | Scope |
| --- | --- | --- |
| `puffed quinoa / quinoa soufflé` | **Accept as a distinct product identity for integration review** | Plain quinoa seeds expanded by a puffing process and sold as a ready-to-use grain product. The proposed identity does not claim a particular quinoa cultivar, growing method, brand, or sweetening. |
| `organic puffed quinoa / quinoa soufflé biologique` | **Use the unqualified display pair; do not make “organic” part of the identity** | The manufacturer page uses an organic product, while the product word itself also appears without that qualifier in its descriptions. Organic certification is a claim about a particular product, not the product class. |
| `quinoa puffs`, `quinoa puff`, `puffed quinoa cereal`, `quinoa cereal`, `crispy quinoa` | **Do not add as aliases** | These phrases may describe snack foods, cereal products, or other product formats. The reviewed manufacturer sells a separate multi-ingredient savory `Puffs` snack made with quinoa, oils, flours, and seasonings. Do not broaden the single-grain identity to that product. |
| Plain `quinoa / quinoa` | **Keep as the existing base identity** | The generic row and its dry/cooked forms remain unchanged. Do not add puffed quinoa as an alias or reinterpret the dry form as puffed. |
| Quinoa flour products | **Keep separate under their active references** | Puffed whole seeds are not quinoa flour, including roasted quinoa flour. |
| Puffed rice, puffed wheat, popcorn, and crispy rice cereal | **Keep separate under their active references** | They are different source grains or a different ready-to-eat cereal product. This proposal adds no cross-grain alias. |

### Proposed catalog row

| Stable ID | English display | fr-CA display | EN aliases | FR aliases | Category and fields |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-puffed-quinoa` | `puffed quinoa` | `quinoa soufflé` | none | none | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |

OQLF classifies quinoa as a pseudocereal and identifies it as a consumed seed. The package already places the base `quinoa` identity in `GRAIN_AND_CEREAL`; the proposal uses that existing category for its puffed whole-seed product. This category choice does not classify quinoa botanically as a cereal grain.

The Québec manufacturer’s English and French product pages directly pair `Organic Puffed Quinoa` with `Quinoa soufflé biologique`, and the French description refers to *grains de quinoa soufflé*. This supports the proposed unqualified display pair as product naming. The OQLF entry for quinoa establishes the base French term and pseudocereal distinction, but does not independently standardize the compound name `quinoa soufflé`; keep that terminology limit visible.

## Recipe demand

All **114 manifest-listed recipe files** and all **1,123 ingredient rows** were scanned. Exact phrase checks found **zero file hits and zero ingredient-row hits** for `puffed quinoa`, `quinoa soufflé`, `quinoa souffle`, `quinoa puff`, `quinoa puffs`, `puffed quinoa cereal`, and `céréales de quinoa soufflé`. Generic quinoa recipe rows remain with the existing quinoa identity/forms. No recipe link, line text, amount, or form hint is proposed.

## Keep identity, product process, state forms, quantities, and substitutions separate

| Concern | Recommendation |
| --- | --- |
| **Ingredient identity** | Add one qualified identity for plain puffed quinoa, separate from generic quinoa and quinoa flour. Keep the name scoped to puffed quinoa seeds. |
| **Product process versus state form** | Treat puffing as the defining process of this marketed product, not as a dry/cooked state form. The active puffed-rice and puffed-wheat rows are also identity-only. Add no `ingredient-form-puffed-quinoa`; leave generic quinoa’s dry/cooked forms unchanged. |
| **Measurements** | Add no density, serving measure, or unit mapping. The manufacturer’s `180 g` is a package size for one branded product, not a volume measure or universal recipe portion. |
| **Conversions and yields** | Add no mass-volume conversion, volume-packing rule, or quinoa-to-puffed-quinoa process yield. Product puffing descriptions do not provide a general quantity relation. |
| **Substitutions** | Add no global or contextual substitution rule. Breakfast, snack-bar, and salad-garnish uses show possible contexts, not interchangeability with puffed rice, puffed wheat, crispy rice cereal, or plain quinoa. Keep substitution research `not_yet_researched`. |

## Source register

The source IDs below are local to this proposal and do not add records to the shared ledger. Sources were checked on 2026-10-10.

| Source ID | Source and URL | Supports and limits |
| --- | --- | --- |
| `WP03-PQUINOA-20261010-S01` | GoGo Quinoa, [Organic Puffed Quinoa](https://gogoquinoa.com/products/puffed-quinoa-6-bags) | Current manufacturer product page names `puffed quinoa`, lists only organic puffed quinoa as the ingredient, gives the 180 g package size, and describes breakfast, bar, and salad-garnish uses. Supports the English product identity and its plain single-ingredient scope; package size is not a conversion. |
| `WP03-PQUINOA-20261010-S02` | GoGo Quinoa, [Quinoa soufflé biologique](https://gogoquinoa.com/fr/products/puffed-quinoa-6-bags) | Paired official French manufacturer page uses `quinoa soufflé biologique`, describes *grains de quinoa soufflé*, and lists quinoa soufflé biologique as the ingredient. Supports the fr-CA product wording; the organic qualifier remains product-specific. |
| `WP03-PQUINOA-20261010-S03` | OQLF, [quinoa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa) | Updated 2025; gives `quinoa` as the preferred French term, identifies *Chenopodium quinoa*, and distinguishes quinoa as a pseudocereal whose seeds are used like cereal grains. It does not define the puffed product or prescribe `quinoa soufflé`. |
| `WP03-PQUINOA-20261010-S04` | Metro Canada, [Quinoa soufflé biologique GoGo Quinoa](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/pates-et-sauces-pour-pates/quinoa-souffle-biologique/p/896899000098) | Québec retailer page describes puffing quinoa grains at high temperature in a pressure oven and lists quinoa soufflé biologique as the product ingredient. Corroborates a plain grain product and French retail usage; it is not a technical processing standard. |
| `WP03-PQUINOA-20261010-S05` | Vrac en Folie, Montréal, [Puffed quinoa](https://vracenfolie.com/en/nos-produits/farines-sucres-et-cereales/graines/quinoa-souffle/) | Québec bulk-retailer listing calls the product puffed quinoa and describes white quinoa heated to puff without added oil, fat, salt, or sugar. Corroborates the plain product boundary; its descriptive claims are retailer product copy, not a general process specification. |
| `WP03-PQUINOA-20261010-S06` | GoGo Quinoa, [Puffs — Pink Salt & Vinegar](https://gogoquinoa.com/products/copy-of-pink-salt-vinegar-quinoa-puffs-113g-7-units) | Manufacturer page calls a separate snack `Quinoa Puffs` and lists quinoa, sunflower oil, sorghum flour, brown-rice flour, seasoning, pea protein, and other ingredients. Supports excluding this multi-ingredient snack from the plain puffed-quinoa identity and alias set. |

## Review disposition

Accept `ingredient-ref-puffed-quinoa` with the display pair and empty aliases shown above. Keep it identity-only and separate from the existing generic quinoa dry/cooked forms and from multi-ingredient quinoa-puffs snacks. Do not add recipe links, measurements, mappings, conversions, yields, or substitutions.

## Integration review

Root verified the current manufacturer English and French pages and the OQLF quinoa entry on 2026-10-10, and checked the manufacturer’s separate multi-ingredient Puffs product. Added the identity-only reference and ledger record using source IDs S01, S02, S03, and S06. Measurement research remains `not_yet_researched`; the 180 g package size was not imported as a measure. A separately cited bar recipe lists puffed quinoa as a source-specific alternative to puffed millet, so a paired `researched_supported` contextual finding was recorded with the exact `2 tasses` amount and explicit limits. No runtime substitution rule or recipe link was added, and no bundled recipe was changed. See `docs/catalog/batches/wp03-puffed-quinoa-and-wp04-recipe-source-corrections-identity-integration-20261010/README.md`.
