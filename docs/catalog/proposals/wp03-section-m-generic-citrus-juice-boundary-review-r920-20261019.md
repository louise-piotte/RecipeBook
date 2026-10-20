# WP03 Section M — generic cross-citrus juice boundary (R920)

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog data, ledger, legacy candidates, recipes, plan, roadmap, workflow, or tests were changed.
- **Scope:** Whether `citrus juice / jus d’agrumes` is a source-neutral culinary identity alongside the existing named-fruit juices. Brand, bottled-product, flavour, and retailer variants are out of scope.

## Recommendation

**Hold the generic cross-citrus juice identity.** The reviewed sources distinguish juice by named fruit and define a mixture as a blend of named juices; none establishes that lemon, lime, grapefruit, and orange juice form one transferable cooking ingredient. The bundle has no ingredient line for generic `citrus juice` or `jus d’agrumes`. Keep the existing species-specific juice references and their aliases as they are.

The OQLF supports the broader bilingual term `fruit juice / jus de fruits`, but this generic fruit-juice vocabulary does not by itself define a citrus-specific identity. A CFIA import-reference page uses a residual `other citrus juices` category; that is an administrative import classification and supplies no culinary composition or transferability rule.

## Current-state audit

| Surface | Read-only finding |
|---|---|
| Active references | The current package has 1,939 ingredient references. The active citrus juice rows are `ingredient-ref-lemon-juice` (`lemon juice / jus de citron`, `SAUCE_AND_CONDIMENT`), `ingredient-ref-lime-juice` (`lime juice / jus de lime`, `SAUCE_AND_CONDIMENT`), `ingredient-ref-grapefruit-juice` (`grapefruit juice / jus de pamplemousse`, `FRUIT`), and `ingredient-ref-orange-juice` (`orange juice / jus d’orange`, `FRUIT`). Their aliases are species-specific fresh or same-fruit reconstituted/from-concentrate wording; none has a cross-citrus alias. A generic fruit-juice or citrus-juice reference is absent. |
| Forms and numeric fields | The package has 204 ingredient forms; none belongs to these juice references. Their active density values are null and unit mappings empty. Existing recipe portions and any other source-specific quantities remain attached to their own evidence; none is generalized here. |
| Generic citrus product | `ingredient-ref-citrus-zest` is active as `citrus zest / zeste d’agrumes`. Its accepted evidence was an optional grouped-aromatics recipe note specifically naming zest. Zest is a different product and does not establish a juice identity. |
| Legacy and ledger | The 55 legacy candidates contain no generic citrus-juice or fruit-juice candidate. The research ledger has no generic citrus-juice identity or decision. It has verified records for the named citrus juices and an earlier hold for generic fruit juice. |
| Recipe corpus | All 114 manifest-listed recipes and 1,123 ingredient rows were scanned. There are 13 ingredient rows with juice wording: eight name lemon juice, two name lime juice, two belong to a separate preserved-fruit juice reference, and one is the unlinked alternative `vinegar or lime juice`. None requests orange juice, grapefruit juice, generic `citrus juice`, `jus d’agrumes`, a citrus blend, or an unspecified juice from any citrus. A separate optional `citrus zest` note is not juice demand. A scan of complete recipe JSON text found no generic citrus-juice phrase. |

The unlinked vinegar-or-lime line remains an either/or recipe alternative; it does not request a cross-citrus juice identity. The existing named-juice ingredient lines remain linked to their current references. No recipe link or amount change is proposed.

## Source and terminology evidence

| Existing source ID | Source | Supports and limits |
|---|---|---|
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S02` | CFIA, [Normes canadiennes de composition des aliments](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), Volume 10, §§10.3.2–10.3.15. | Section 10.3.2 defines juice by the named fruit. Sections 10.3.6–10.3.9 separately name grapefruit, lemon, lime/limette, and orange juices. Section 10.3.13 defines a juice blend as named fruit juices, each meeting the applicable standard. This supports the named-fruit rows and a named-component blend boundary, not an unspecified transferable citrus identity. The standard’s product composition measures are not imported as cooking conversions. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S04` | OQLF, [*jus de fruits* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26543016/jus-de-fruits). | Preferred Québec term `jus de fruits` and English `fruit juice`. It is generic fruit-juice terminology, not evidence that citrus species are interchangeable or that a citrus-only blend is a separate culinary identity. |
| `WP05-FRUIT-JUICE-RESIDUAL-20261012-S05` | OQLF, [*confiture de, compote de, jus de* + noun (BDL)](https://vitrinelinguistique.oqlf.gouv.qc.ca/22906/la-grammaire/le-nom/nombre-des-noms-dans-certains-emplois/nombre-du-complement-du-nom/nombre-du-complement-de-confiture-compote-jus). | Québec usage examples name source fruits for juice; the general plural phrase `jus de fruits` is distinct from source-specific forms such as `jus de citron`. It does not define `jus d’agrumes` as a stable food identity. |
| `WP03-SECTIONM-CITRUS-JUICE-R920-20261019-S01` (proposal-local) | CFIA, [SARI update, 2024-12-02](https://inspection.canada.ca/fr/importation-aliments-vegetaux-ou-animaux/vegetaux-produits-vegetaux/sari/mises-a-jour-acia-sari-2024-12-02). | The import-reference listing includes a residual `autres jus d’agrumes` category alongside separately classified named juices. This is a customs/import classification, not a compositional definition, recipe-use source, or interchangeability claim. |

## Prior decisions retained

- The 2026-10-09 [Section M citrus-product boundary review](wp03-citrus-products-boundary-review-20261009.md) held generic citrus juice for lack of recipe demand while proposing generic citrus zest from direct generic zest wording. The zest proposal was integrated; its separate product evidence does not transfer to juice.
- The 2026-10-12 [WP05 named-juice review](wp05-section-v-fruit-juice-residual-products-sweep-20261012.md) added source-named single-fruit juice identities and same-fruit reconstituted aliases. It held generic fruit juice, unspecified blends, and juice drinks without recipe demand. Retain that boundary.
- The 2026-10-13 [Québec citrus overlap follow-up](wp03-citrus-quebec-overlap-followup-20261013.md) kept grapefruit juice species-specific and separate from the whole grapefruit and pomelo identities. No recipe link was justified there.

These decisions are consistent: a generic citrus-zest request is present in the recipe corpus, while a generic citrus-juice request is not. Individually named juice standards and terms do not imply a generic alias across the existing juice references.

## Disposition and limits

If this review is integrated, leave the active references, their aliases and categories, forms, source-specific portions, recipe links, ledger states, and legacy list unchanged. Add no `ingredient-ref-citrus-juice`, no `citrus juice / jus d’agrumes` aliases to named juices, and no density, unit mapping, conversion, yield, form, substitution, or cross-citrus amount.

Reopen the question only if a recipe or explicit library requirement names generic citrus juice and its source clarifies whether it means a mixture or permits any one citrus species. A named mixture should retain its source-named components; it should not become an alias for lemon, lime, grapefruit, or orange juice. Any recipe or product-specific amount must remain scoped to that source.

The global catalog rule keeps the work focused on generic ingredient diversity: commercial-product counts do not add ingredient diversity. This review did not research brands, product lines, flavours, SKUs, or retailer variants. No tests were run.

## Root integration decision

Held on 2026-10-19. Keep lemon, lime, grapefruit, and orange juice as species-specific references;
add no generic `citrus juice / jus d’agrumes` identity, aliases, measures, or forms. The Québec
terminology supports generic fruit juice only, while the CFIA standard defines named-fruit juices
and named-fruit blends. The bundle has no generic citrus-juice line. The SARI residual import
category is not used as culinary-identity evidence. See the
[R920 integration README](../batches/wp03-r920-citrus-juice-hold-integration-20261019/README.md).
