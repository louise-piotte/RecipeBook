# WP03 Section M: generic dried citrus peel review (R918)

- **Reviewed:** 2026-10-19
- **Disposition:** propose one identity-only, generic `dried citrus peel / écorce d’agrumes séchée` reference in `SAUCE_AND_CONDIMENT`.
- **Scope:** transferable generic dried-peel ingredient identity, distinct from citrus zest and dried orange zest. This is a proposal only; no shared catalog, ledger, recipe, plan, roadmap, code, or test file was edited.

## Recommendation

Add one cross-citrus culinary product identity for dried peel. Culinary guidance describes dried whole citrus peel as an aromatic used in cooking and refers to other citrus rinds beyond the specific peel discussed in that source. This establishes a useful generic ingredient class. It remains distinct from zest: the OQLF defines *zeste* as the colored aromatic exterior of citrus rind and distinguishes the white bitter layer beneath it. The generic candidate covers a recipe or source that actually calls for dried peel/rind; it does not absorb a dried-zest line or product. [S01, S06]

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-dried-citrus-peel` |
| English display | `dried citrus peel` |
| Québec French display | `écorce d’agrumes séchée` |
| Aliases | None |
| Category | `SAUCE_AND_CONDIMENT`, aligned with the existing dried-orange-zest aromatic product |

The French display is a transparent generic description, not a claimed OQLF preferred term: OQLF documents `écorce de citron` for lemon peel, while the current Canadian tariff uses `écorces d’agrumes` in a broad product heading that includes melons. Keep that tariff classification as terminology support only; it is not culinary-use evidence. [S02, S04]

This is an identity-only proposal. The dried state is part of the product name, so do not add a `dried` form under citrus zest or an unspecified citrus-fruit identity. Add no species aliases, extra form, numeric measure, density, unit mapping, conversion, yield, substitution, or recipe link. If a later recipe uses `peel` ambiguously, do not infer whether it means full rind or only the colored layer; resolve that line from its source. Where the source specifies the colored layer with the white layer removed, classify it with zest instead. [S01, S07]

## Current catalog and recipe evidence

The Section M plan item beginning “Juice, zest, peel, pulp, concentrate…” remains open at [the fruit-products checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7021). The live worktree snapshot reviewed here has 1,939 ingredient references and 204 forms. Relevant active references are:

| Existing identity | Current boundary |
|---|---|
| `ingredient-ref-citrus-zest` — `citrus zest / zeste d’agrumes` | Generic colored aromatic zest; not whole peel. |
| `ingredient-ref-dried-orange-zest` — `dried orange zest / zeste d'orange déshydraté` | Orange-specific dried zest, supported by its OQLF record; do not generalize it to peel or other citrus. |
| `ingredient-ref-lemon-zest` — `lemon zest / zeste de citron` | Species-specific zest; preserve its existing row and evidence state. |
| `ingredient-ref-candied-lemon-peel` and `ingredient-ref-candied-orange-peel` | Existing species-specific candied-peel products; keep them separate from unsweetened dried peel. |

There is no generic citrus-peel reference, matching citrus-peel form, or legacy-import candidate for `dried citrus peel` / `écorce d’agrumes séchée`. The existing rows and their ledger evidence remain unchanged. No roster of species or commercial variants was examined.

The complete manifest-listed corpus contains 114 recipes and 1,123 ingredient rows. Four rows name lemon zest; recipe `111#5` has only a grouped, optional `citrus zest` note, with no separate peel ingredient or amount. No row names generic citrus peel, dried citrus peel, dried orange zest, or candied peel. Recipe demand therefore supports no link or quantity for this proposal. It does not negate the broader culinary usefulness of one generic ingredient identity. Preserve all recipe text and source quantities as written; do not infer any cross-product quantity or conversion.

## Boundaries and supporting evidence

- **Whole peel versus zest:** OQLF defines zest as the colored, aromatic outer layer and distinguishes it from the bitter white layer. A separate OQLF lemon-peel record names the broader rind `écorce de citron` and warns against transferring English *peel/zest* ambiguity into French. Keep dried peel and dried zest separate. [S01–S03]
- **Generic culinary usefulness:** A culinary ingredient guide describes whole dried citrus peel as an aromatic used in cooking and refers to other citrus rinds as well. Its detailed ingredient example is species-specific; it supports the generic class only, not aliases, measurements, aging claims, or substitutions. [S06]
- **Drying terminology boundary:** A university extension guide says citrus peel may be dried for later recipes, but its preparation directions remove the white pith. That method supports a dried zest-like layer and does not by itself establish whole dried peel. Do not use its product-specific processing details as general form data. [S07]
- **Trade and preserved-product limits:** The 2026 Canadian tariff groups citrus or melon peel across fresh, frozen, dried, and temporarily preserved states; it is too broad to define a culinary identity by itself. CFIA’s “Fruit Peel or Cut Mixed Peel” standard describes sweetened/glazed rind, so the existing candied-peel rows remain separate. [S04, S05]

The generic identity is bounded to unsweetened dried citrus peel/rind expressly named as peel or rind. It excludes zest or flavedo-only products, candied/glazed peel, salted or otherwise provisionally preserved peel, and powdered peel. No species or named traditional product is added as a separate identity. If source wording does not distinguish peel from zest, leave that recipe line unresolved until the source clarifies it.

## Prior decisions retained

The [2026-10-09 citrus-products boundary review](wp03-citrus-products-boundary-review-20261009.md) kept peel separate from zest and held dried/candied peel pending a product-specific review. The [2026-10-10 dried-orange-zest review](wp03-dried-orange-zest-identity-review-20261010.md) accepted only the OQLF-defined orange zest identity and explicitly declined to generalize it to dried citrus peel. This proposal changes that open generic boundary using broader culinary evidence; it does not merge, rename, alias, or alter either accepted identity or its evidence.

Catalog coverage here is for generic culinary ingredient diversity. Any brand-only, product-line-only, flavour-family-only, or retailer-variant queue item is out of scope because commercial-product counts do not add ingredient diversity; stop those lines. No such variants were researched for this proposal.

## Sources

All sources were accessed 2026-10-19. The `R918` source IDs are local to this proposal and are not shared-ledger entries.

| ID | Source | Support and limit |
|---|---|---|
| `WP03-M-GENERIC-DRIED-CITRUS-PEEL-R918-20261019-S01` | Office québécois de la langue française, [zeste (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497908/zeste) | Defines the culinary zest as the colored, aromatic external layer of a citrus rind and distinguishes the white bitter layer beneath. Supports the zest/peel boundary, not a dried-peel measurement. |
| `WP03-M-GENERIC-DRIED-CITRUS-PEEL-R918-20261019-S02` | Office québécois de la langue française, [écorce de citron (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2299057/ecorce-de-citron) | Gives the preferred French term for lemon peel and explains the French distinction between *écorce* and *zeste*. Lemon-specific, not a generic citrus naming entry. |
| `WP03-M-GENERIC-DRIED-CITRUS-PEEL-R918-20261019-S03` | Office québécois de la langue française, [zeste d'orange déshydraté (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2299059/zeste-dorange-deshydrate) | Supports the active orange-specific dried-zest product and cautions against treating it as full peel or a cross-citrus identity. |
| `WP03-M-GENERIC-DRIED-CITRUS-PEEL-R918-20261019-S04` | Canada Border Services Agency, [Customs Tariff, Chapter 8 (2026), French](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch08-fra.html) | Heading 0814 includes citrus or melon peel in several states, including dried. Trade terminology only; it also includes melons and preserved states. |
| `WP03-M-GENERIC-DRIED-CITRUS-PEEL-R918-20261019-S05` | Canadian Food Inspection Agency, [Canadian Standards of Identity: Volume 4](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-regulations/documents-incorporated-reference/canadian-standards-identity-volume-4) | Section 86 defines fruit peel/cut mixed peel as sweetened and glazed outer rinds. Supports keeping that candied class separate. |
| `WP03-M-GENERIC-DRIED-CITRUS-PEEL-R918-20261019-S06` | The Woks of Life, [Dried Mandarin Orange Peel](https://thewoksoflife.com/dried-mandarin-orange-peel/) | Culinary ingredient guidance describes whole dried citrus peel as an aromatic in cooking and refers to citrus rinds more broadly. Its detailed example and any product-specific use remain scoped to that article. |
| `WP03-M-GENERIC-DRIED-CITRUS-PEEL-R918-20261019-S07` | Michigan State University Extension, [Drying Citrus Peel to Use Later](https://msu-prod.dotcmscloud.com/news/drying_citrus_peel_to_use_later) | Describes drying citrus peel for recipes; its preparation removes white pith, so it cannot establish a whole-peel-to-zest equivalence or a transferable form measurement. |

## Coordinator disposition

Accept one generic identity-only `dried citrus peel / écorce d’agrumes séchée` product, separate from generic citrus zest, dried orange zest, and species-specific candied peel. Leave Section M open for other fruit products and forms. Add no forms, measurements, recipe links, conversions, or substitutions from this proposal.

## Root integration decision

Accepted and integrated on 2026-10-19 as `ingredient-ref-dried-citrus-peel` in `SAUCE_AND_CONDIMENT`, with no aliases or forms. Whole dried citrus peel is kept distinct from colored-layer zest and candied peel. The mandarin-focused culinary details and the MSU method that removes pith remain scoped to their sources; no measurements, recipe links, conversions, yields, or substitutions were added. See the [R917–R918 integration README](../batches/wp03-r917-r918-generic-fruit-integration-20261019/README.md).
