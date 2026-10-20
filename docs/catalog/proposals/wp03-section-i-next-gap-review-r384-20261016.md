# WP03 Section I — pecan-butter formulation review (R384)

- **Review date:** 2026-10-16.
- **Status:** Integrated as a source-specific formulation decision under the existing ledger identity; no active catalog field changed.
- **Checklist fit:** Section I open subcheck “Record added sugar, salt, oil, and stabilizers when they materially affect culinary behavior” in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Candidate:** Existing `ingredient-ref-pecan-butter` (`pecan butter / beurre de pacanes`).
- **Recommendation:** Record product-specific formula and oil-separation evidence using the already registered Balsam Tahini and Les Minettes sources. Do not create a generic formulation, alias, form, measure, recipe link, conversion, yield, or substitution.

## Evidence and boundary

Root rechecked Balsam Tahini’s current [Pecan Butter Spread](https://balsamtahini.com/products/pecan-butter) page. It describes a current Canadian SKU as 100% dry-roasted pecans, with no added oils, sugars, or emulsifiers; its FAQ says natural oil separation is normal for a spread with no added stabilizers. The same page showed the product in stock when accessed on 2026-10-16. These are claims for this product, not a standard for pecan butter generally.

The existing ledger also stores a 2026-10-10 snapshot of Les Minettes’ Montréal `Beurre de pacanes + érable` product page. That product’s listed ingredients are pecans, almonds, maple sugar, coconut, and salt. Its page route returned a cache miss during this review, so retain the stored source as product-specific historical evidence; do not infer current availability. Together, the sources show that the generic identity does not prescribe one formula. They do not support adding `maple`, `almond`, `salted`, `oil-free`, or `no-stabilizer` to the active reference.

The existing [OQLF pecan terminology source](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083802/noix-de-pacane) remains attached to the identity. The active Québec display stays `beurre de pacanes`; no aliases are proposed. Keep the product page’s package sizes and suggested uses SKU-specific. Do not derive a household measure, density, conversion, recipe link, or substitution from them.

| Reused source ID | Source | Source-specific evidence retained | Limit |
|---|---|---|---|
| `WP03-PASTE-PRODUCT-20261010-S11` | Balsam Tahini, [Pecan Butter Spread](https://balsamtahini.com/products/pecan-butter) | Current page says 100% dry-roasted pecans, no added oils/sugars/emulsifiers, and normal top oil separation without stabilizers. | One maker’s current SKU; no universal formula or recipe behavior. Source ID and URL already exist under `ingredient-ref-pecan-butter`; no duplicate is registered. |
| `WP03-PASTE-PRODUCT-20261010-S12` | Les Minettes, [Beurre de pacanes + érable](https://lesminettes.ca/collections/cadeaux-de-profs/products/beurre-de-pacanes-erable) | Stored October 10 product-page capture lists pecans, almonds, maple sugar, coconut, and salt. | Product-specific stored evidence; direct page retrieval failed during R384, so no current availability is claimed. Source ID and URL are reused without re-registration. |

## Current owner, picker, and recipe-demand audit

The active `ingredient-ref-pecan-butter` row is `pecan butter / beurre de pacanes`, with empty alias arrays, no attached forms, null default density, and empty unit mappings. Identity state is verified; measurement and substitution research remain `not_yet_researched`. Existing ledger evidence contains four sources, including the two reused product pages. No duplicate reference, form, legacy-import candidate, or ledger identity is introduced.

No active catalog field changes, so picker results are unchanged. The full manifest scan parsed all **114** recipe files and **1,123** structured ingredient rows (**753,988** recipe-file bytes). Whole-word normalized phrase checks for `pecan butter`, `pecan butters`, `pecan nut butter`, `beurre de pacanes`, `beurre de noix de pacane`, and `ingredient-ref-pecan-butter` found zero recipe-file hits, zero ingredient-row hits, and zero direct links to the pecan-butter reference.

## Root integration

Root updated the access date and evidence summary on the existing Balsam Tahini source entry after rechecking its current page, then added one accepted product-specific formulation decision to `ingredient-ref-pecan-butter`, citing the two existing source IDs. No source ID or URL was added. The active reference and research states remain unchanged; no forms, measurements, recipe links, conversions, yields, or substitutions were added. The Section I formulation subcheck is complete for this identity and remains open for other products.

The catalog plan and roadmap now link to the [R384 integration README](../batches/wp03-section-i-pecan-butter-formulation-integration-r384-20261016/README.md). The ledger still has **2,056 records, 9,267 source entries, 7,842 distinct source IDs, and 6,564 distinct URLs**. Static ledger schema/linkage, UTF-8/no-BOM, local-link, whitespace, and scoped-change checks passed. No software tests, builds, emulator checks, or deployment work were run because the only data change is research JSON under `AGENTS.md`.
