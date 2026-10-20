# WP03 Section M — whole avocado identity gap review (R911)

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only; no catalog or ledger data has been changed.
- **Scope:** One generic culinary fruit identity. This review does not expand a commercial roster.
- **Proposal-local source IDs:** `WP03-SECTIONM-AVOCADO-R911-20261019-S01–S03`. The OQLF source is reused under its existing proposal ID, `WP02-B2-AVOCADO-SEED-FLOUR-R183-20261016-S06`.

## Recommendation

Promote the exact unresolved legacy identity `ingredient-ref-avocado` to the active generic fruit reference:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-avocado` (reuse the legacy ID) |
| English display | `avocado` |
| Québec French display | `avocat` |
| Internal category | `FRUIT` |
| Aliases | None |
| Forms, density, unit mappings, recipe links, substitutions | None |

This is the whole fresh edible fruit of *Persea americana*, across commercial varieties. Keep avocado oil, seed flour, extracted seed starch, seed-derived powders, and composite or prepared products separate. The OQLF entry describes *avocat* as a fruit, although its domain labels include “alimentation légume”; Health Canada’s food-group taxonomy places avocado among “OTHER FRUITS.” The existing internal `FRUIT` category is therefore retained; an external food-group taxonomy is not used to recategorize the app identity. [WP02-B2-AVOCADO-SEED-FLOUR-R183-20261016-S06; S01]

The identity is a useful generic produce reference despite no matching bundled recipe line: it closes a clear active-catalog gap for a common culinary fruit, while the absence of corpus demand limits this proposal to identity and source-scoped portion evidence. The 2015 Canadian Nutrient File (CNF) contains cut- and preparation-specific portions, but these rows do not establish a single reusable density or conversion. I recommend retaining the exact CNF rows as ledger observations; they do not justify active mappings.

## Plan fit and queue scope

Precise unchecked anchor in [`docs/RecipeBook-global-ingredient-catalog-plan.txt:13943`](../../RecipeBook-global-ingredient-catalog-plan.txt#L13943):

> [ ] Continue the remaining Section M/N/P product and species identities, independent Québec terminology review, and evidence-backed measurement and substitution work.

This proposal advances the Section M generic-identity and Québec terminology work under that open anchor. The catalog workflow’s WP03 row says Section M already has a crushed-pineapple form linked to recipe 053#14 and a mashed-ripe-banana form linked to recipe 073#10; fruit package-state, drained-volume, ripeness-threshold, and measurement behavior remain unspecified. Avocado adds an identity gap and does not resolve those wider fruit questions. The roadmap’s catalog-scope rule prioritizes generic culinary ingredient diversity across all types and requires product-only amounts to stay scoped to their sources.

The current cross-category scope review records the two Section F cereal-mix roster clauses as out of scope because **commercial-product counts do not add ingredient diversity**. They were not pursued here; their generic cereal-diversity work remains open. The same review found no new roster-only assignment. This proposal adds no brand, product-line, flavour-family, SKU, or retailer-variant research. Existing branded references and product-specific evidence remain preserved.

## Ownership and current-state audit

The audit covered `AGENTS.md`, `Requirements.md`, `roadmap.md`, `docs/RecipeBook-global-ingredient-catalog-plan.txt`, `docs/catalog/ingredient-catalog-workflow.md`, `docs/catalog/batches/generic-ingredient-scope-review-20261019/README.md`, the active bundled reference/form JSON, the research ledger, the legacy import identities, the manifest-listed recipe corpus, and prior Section M avocado/fruit proposals.

| Surface | Read-only finding |
|---|---|
| Active references | 1,937 references, SHA-256 `0c46a3473e537ca09ccbec18646387a762be070123023f4048b97d43f3d2b41c`. The only avocado/avocat reference is `ingredient-ref-avocado-oil` (`avocado oil / huile d’avocat`, `FAT_AND_OIL`). No whole-fruit reference is active. |
| Active forms | 202 forms, SHA-256 `103ab0dccd5a3b9793c050de8fbbadeea61223f531e19150118ef64919556cb7`. No avocado form exists. |
| Legacy identities | 56 candidates, SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720`. Exact candidate: `ingredient-ref-avocado`, `avocado / avocat`, category `FRUIT`, empty alias lists, `unreviewed`. |
| Research ledger | 2,340 records, SHA-256 `e213fa3b83231790465b7cb568ccbc0cdee3f0e4cd4f08ac0bde5bf9dcb82484`. The whole-fruit record is still a source-less `candidate` with identity `unreviewed`, measurement and substitution states `not_yet_researched`, and an unresolved decision to reconcile the legacy identity. The separate oil record is verified and retains its two WP05 manufacturer sources. |
| Recipe manifest and corpus | The manifest lists 114 recipes; a manifest-ordered scan covered 1,123 ingredient rows and found zero occurrences of `avocado`, `avocados`, `avocat`, `avocats`, `alligator pear`, `avocado pear`, or `guacamole`. Corpus snapshot hash: `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17`. No recipe line or form link is proposed. |
| Prior Section M proposals | The reviewed fruit-gap, open-fruit, pitting/form, crushed-pineapple, mashed-banana, sultana/raisin, naranjilla, sapote/baobab, sea-buckthorn, and white-currant proposals do not add or decide this whole-fruit identity. |
| Existing avocado decisions | WP05 accepted `ingredient-ref-avocado-oil` as a separate oil identity. WP02 B2 R183 held avocado-seed flour outside active references and the ledger pending a Canadian culinary seed-flour product and product-matched Québec French name. Its OQLF source supports the whole-fruit/seed boundary, but the seed-flour hold does not decide this fruit candidate. Keep both decisions intact. |

The OQLF URL is already cited by R183-S06 and is reused here for the same term/fruit boundary; do not create a duplicate source owner for it. The WP05 oil sources remain owned by `ingredient-ref-avocado-oil`. No source entry or ID for this proposal’s CNF and food-group sources was found in the ledger. The new R911 source-ID prefix is unowned.

The ingredient search index normalizes accents and first matches complete word phrases across stored terms, then falls back to partial matching. The current oil row means queries for `avocado` and `avocat` already find avocado oil. After fruit integration, those broad queries will also find the whole-fruit identity, while `avocado oil` and `huile d’avocat` remain specific. No aliases are proposed that would broaden this collision. In particular, although OQLF lists `alligator pear` and `avocado pear`, activating either would cause a `pear` query to match avocado and overlap the generic pear identity. Do not add those aliases. Do not activate the Latin names as picker aliases; they identify the botanical source but add no needed culinary search term. No unsourced cultivar, product, or sensory wording is proposed.

## Identity and naming boundaries

OQLF’s preferred French term is **avocat** (masculine); its English term list includes **avocado**, **alligator pear**, and **avocado pear**, and its definition describes the whole fruit and its large hard seed. The source lists *Persea americana* and *Persea gratissima* as Latin terms and identifies multiple commercial varieties. Its page was last updated in 1990. Use only the unambiguous bilingual base displays `avocado / avocat`; the other source-supported English terms remain excluded as collision-prone aliases. [WP02-B2-AVOCADO-SEED-FLOUR-R183-20261016-S06]

Health Canada’s Food Group List includes avocado under `40L OTHER FRUITS`; this corroborates the proposed internal `FRUIT` category but is a survey classification, not a botanical standard or a Québec terminology authority. [S01]

| Wording/material | Decision |
|---|---|
| `avocado / avocat` | Accepted bilingual displays for the generic whole fruit. |
| `alligator pear`, `avocado pear` | Do not activate as aliases: although listed by OQLF, the embedded `pear` wording would make generic pear searches return avocado as well. |
| *Persea americana*, *Persea gratissima* | Retain as source identity evidence, not culinary picker aliases. |
| `avocado oil / huile d’avocat` | Keep on its existing `FAT_AND_OIL` reference; oil is not a fruit form. |
| Avocado-seed flour, avocado-seed starch, fruit/seed powder, leaves, or seed | Do not merge with the whole-fruit identity. R183’s seed-flour hold remains in force. |
| Named cultivars, brands, product lines, flavours, SKUs, or retailer variants | Out of scope. Commercial-product counts do not add ingredient diversity; no roster research was done. |

## Recipe demand, forms, measures, and conversions

The manifest scan found no avocado ingredient row, so there is no current recipe quantity, state, cut, preparation, or substitution link to preserve or infer. Add no `raw`, peeled, halved, sliced, diced, mashed, or pureed catalog form from the CNF serving labels alone. Forms should follow an actual recipe need and explicit source wording; the corpus currently supplies neither for avocado.

Health Canada CNF food code 1511 lists **“Avocado, raw, all commercial varieties / Avocat, cru, toutes variétés commerciales.”** Its available portions are recorded below exactly as published. These are source-specific serving options, not universal kitchen measures:

| CNF serving option | Published amount |
|---|---:|
| 100 g edible portion | 100 g |
| 100 mL puree; 250 mL puree | 97.2 g; 243.0 g |
| 100 mL cubes; 250 mL cubes | 63.4 g; 158.5 g |
| 100 mL slices; 250 mL slices | 61.7 g; 154.3 g |
| 1 fruit; 1/2 fruit | 201.0 g; 100.5 g |
| Refuse, seeds and skin | 26% |

The CNF page describes the 2015 publication, says it will not be updated while Health Canada works toward a more user-friendly CNF 2026 dataset, and shows page details modified 2019-03-01. Preserve these portion values with food code 1511, the source’s raw/all-commercial-varieties scope, exact preparation, and exact quantity. Do not treat the fruit/half-fruit masses as a universal size standard or infer whether another fruit has the same edible mass. The puree, cube, and slice values differ by preparation and cut; do not average them into a generic `g/ml` density. The 26% refuse figure is also source-scoped and is not a general peeling yield. [S02]

If the integrator records these CNF values in the ledger, they should remain source-qualified `published_portion` observations describing the exact source quantity and preparation. Leave the active reference’s density null and `unitMappings` empty. An active mapping is a context-free `fromUnit`/`toUnit`/factor pair and cannot express cut, packing, puree, or serving-size context; the source does not support a single avocado volume-to-mass factor. No cup conversion, mass-volume mapping, generic edible yield, or package yield is proposed.

## Substitution review and limits

The corpus has no avocado line from which to establish role, dish, method, or a tested replacement ratio. The terminology and food-composition sources reviewed here do not supply a recipe substitution. Do not substitute avocado oil for the fruit or the fruit for the oil; those are distinct ingredient identities and forms of use cannot be assumed interchangeable. No global form conversion, contextual ingredient substitution, or recipe-line link is proposed. Keep the ledger substitution state `not_yet_researched` unless a later, recipe-context review establishes evidence; this proposal does not claim that no substitute exists for every culinary role.

## Proposal-only decision delta

If approved by the root integrator:

1. Promote the exact legacy ID `ingredient-ref-avocado` in place to the active `avocado / avocat` reference in category `FRUIT`, with no aliases. Remove only this exact candidate from the legacy-import list; preserve the active avocado-oil reference and all other identities.
2. Resolve the existing ledger candidate’s identity using the reused OQLF source and the new Health Canada sources. Record eight CNF portions as source-specific `published_portion` observations: the 100 mL and 250 mL puree, cube, and slice entries, plus one fruit and one-half fruit, each tied to food code 1511 and its exact preparation. This supports `measurementState: researched_supported` for the observations only. Leave active density and unit mappings empty; no value in this proposal is an active conversion. Do not convert the 100 g edible-portion basis or 26% refuse statement into a general catalog value.
3. Keep forms, recipe links, and substitutions absent. Keep the substitution research state `not_yet_researched` because no recipe-context substitution was examined.
4. Leave the R183 avocado-seed-flour hold, the WP05 avocado-oil decision, all unrelated fruit rows, and all existing branded rows and product-scoped evidence unchanged.

This proposal changes no catalog JSON, research ledger, legacy list, plan, roadmap, workflow, checklist, or recipe. **Only the assigned proposal file is changed by this work.** No software tests were run; this is a documentation-only review.

## Source register

Sources checked 2026-10-19. The OQLF source is reused under its existing R183 proposal-local source ID. S01–S02 use new proposal-local R911 IDs and are not shared-ledger entries.

| ID | Source | Supports and limitations |
|---|---|---|
| **WP02-B2-AVOCADO-SEED-FLOUR-R183-20261016-S06** (reused) | OQLF, [*avocat* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297002/avocat). | Preferred French term, English terms, Latin names, fruit definition, seed description, and varieties. Last updated 1990. Reused only for the generic fruit identity and naming boundary; its older entry is not treated as a current market or measurement source. |
| **WP03-SECTIONM-AVOCADO-R911-20261019-S01** | Health Canada, [Food Group List](https://health.canada.ca/en/open-data/hpfb) (English); [Liste des groupes d’aliments](https://health.canada.ca/fr/open-data/hpfb) (French). | Lists avocado under food group 40L, “OTHER FRUITS / AUTRES FRUITS.” Supports category corroboration only; this is a food-consumption classification, not a botanical definition, recipe source, or terminology ruling. |
| **WP03-SECTIONM-AVOCADO-R911-20261019-S02** | Health Canada, [Canadian Nutrient File — Avocado, raw, all commercial varieties, food code 1511](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=1511). | Supports the bilingual raw-variety identity and serving options transcribed above. The page reports source-specific puree, cube, slice, whole-fruit, and half-fruit values; they are not universal kitchen measures, a density study, or substitution evidence. |
| **WP03-SECTIONM-AVOCADO-R911-20261019-S03** | Health Canada, [Canadian Nutrient File publication notice](https://aliments-nutrition.canada.ca/cnf-fce/). | Identifies the serving-size application as the 2015 CNF publication, says it will not be updated, and describes work toward a more user-friendly CNF 2026 dataset. This is publication context, not an avocado measurement or current retail-size standard. |

## Root integration outcome (2026-10-19)

Accepted. The exact legacy candidate `ingredient-ref-avocado` is now the active generic `avocado / avocat` reference in `FRUIT`; the matching legacy-list row alone was removed after review. The earlier unresolved ledger decision remains as history, followed by the accepted decision. Eight CNF food-code 1511 observations are stored with their exact source portions and preparations. The separate 100 g edible-portion basis and 26% seeds-and-skin refuse remain source-scoped and do not become a general yield, density, or mapping. Existing avocado-oil evidence, the held avocado-seed-flour decision, and all other entries remain unchanged. See the [R910–R912 integration README](../batches/wp03-r910-r912-generic-integration-20261019/README.md).
