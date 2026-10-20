# WP02 B2 — defatted pistachio flour boundary hold (R89)

Reviewed 2026-10-13. This closes one evidence screen under the open Section 04 B2 alternative-flour checklist. The B2/B3 parent items remain open.

## Decision

Keep explicitly defatted pistachio flour outside the active reference catalog and research ledger. The current US listing from [Live Oil by Lesna](https://liveoilbylesna.com/product/raw-cold-ground-pistachio-powder/) confirms a distinct raw, partially defatted press-cake product. It uses `pistachio powder`, `pistachio flour`, and `partially defatted pistachio flour` as product search phrases. The company lists an Illinois address and says it delivers throughout the United States ([contact page](https://liveoilbylesna.com/contacts/), [company page](https://liveoilbylesna.com/9-2/)); these sources do not establish Canadian availability or a Québec French display.

The regional review threshold from the [prior pistachio-flour identity review](../../proposals/wp02-b2-pistachio-flour-identity-boundary-review-20261012.md) is still unmet. CFIA's grouped import category, OQLF's base term `pistache`, and Gusta's Canada-facing whole-kernel flour product do not document a Canadian/Québec defatted product or a Québec French product name. This is a bounded source search, not a market census.

The French-market evidence includes La Maison de la Pistache's `farine déshuilée de pistache` and `poudre de pistache déshuilée`, plus Pariani's 2025 catalog class `farine partiellement déshuilée`. Those sources support product distinctions and regional French-market usage; they do not settle a Québec display. Huilerie Beaujolaise's product URL returned 404 and its category URL returned a server error in the current review. A cached search excerpt is retained in the proposal only as a stale lead and is not used to support availability, processing, package sizes, recipe quantities, or substitutions.

## Catalog and picker boundary

- No reference, alias, ledger candidate/source, form, measurement observation, density, unit mapping, recipe link, package yield, conversion, or substitution was added.
- Keep the existing ordinary `pistachio flour / farine de pistache` row unchanged. Do not add `pistachio powder`, `poudre de pistache`, or `ground pistachios` as aliases. Those phrases can collide with whole-kernel or ordinary powder products; recipe 017's finely ground pistachios remain linked to whole pistachios.
- Keep pistachio paste and butter on their existing identities. No active defatted-pistachio row or form exists.
- The 114-recipe / 1,123-ingredient-row bundle has no defatted-pistachio-flour phrase and no links to ordinary pistachio flour. Its six pistachio-related rows belong to whole pistachios or paste.
- The current phrase-first picker has no exact catalog owner for qualified defatted phrases. A hypothetical `defatted pistachio flour / farine de pistache déshuilée` display would broaden `pistachio flour` and `farine de pistache` to both ordinary and defatted rows; do not add that row until the product name and French display are established.

## Measurements and substitutions

No reusable density, cup/spoon measure, conversion, or package-to-recipe yield is supported. The US maker's 454 g package is net package mass, not a kitchen measure. Research values for residual fat and water absorption are sample- and process-specific. The generic 105 g per US cup estimate does not identify a defatting grade, grind, or fill method.

No global or contextual substitution rule is supported. A French manufacturer gives a product-specific 10–20% wheat-flour suggestion; one dough study tests a particular press-cake flour at fixed blend ratios; and Puratos uses defatted powder in a specific chocolate-coating application. Live Oil by Lesna lists broad uses but gives no replacement ratio. These are product- or formula-specific findings, not reusable substitutions.

## Evidence

The proposal contains the full source register and source-specific limits: [WP02 R89 proposal](../../proposals/wp02-r89-next-flour-review-20261013.md). Key sources include:

- [OQLF, *pistache*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297124/pistache) and [CFIA, pistachio import requirements](https://inspection.canada.ca/fr/importation-aliments-vegetaux-ou-animaux/importation-daliments/exigences-propres-certaines-denrees/exigences-reglementaires-conditions-licence-limportation-produits-pistaches): the nut term and grouped import category do not name a Canadian defatted-flour product.
- [Gusta / Verdoro, Bronte pistachio flour](https://supplies.gusta.ca/products/bronte-pistachio-flour-verdoro?variant=46335136334068): Canada-facing whole-kernel comparator.
- [La Maison de la Pistache, defatted pistachio flour](https://www.pistaches.com/product/farine-deshuilee-de-pistache/) and [Pariani, 2025 ingredient catalog](https://pariani.org/wp-content/uploads/2025/01/Catalogo_Ingredient_2025.pdf): European product/process and French/Italian naming evidence.
- [Ling et al. (2017)](https://doi.org/10.3965/j.ijabe.20171003.2838), [Mendoza-Pérez et al. (2025)](https://doi.org/10.3390/foods14152722), and [Guardianelli et al. (2021)](https://doi.org/10.1016/j.lwt.2021.111917): process-dependent sample composition, functionality, and dough trials; no general density or substitution.
- [Puratos France, *Bouchées de Noël*](https://www.puratos.fr/fr/recettes/bouchees-noel): one specific chocolate-coating use.

## Verification

This integration changes documentation only. No catalog/database JSON or application code changed, so no app tests, Gradle tasks, instrumentation, emulator, or deployment checks were run. Static review confirmed that source IDs S12–S14 remain proposal-local, the proposal's source and picker statements reflect the current evidence, and its local links resolve. The parent B2/B3 checklist remains open.
