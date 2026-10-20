# WP02 Section B2 — Potato flakes identity review (R861, 2026-10-19)

## Review record

- **Status:** Proposal only. No catalog, ledger, recipe, plan, roadmap, or other shared file was changed.
- **Plan anchor:** The still-open B2 parent includes potato flour and potato starch in its flour/starch boundary review ([plan, line 3439](../../RecipeBook-global-ingredient-catalog-plan.txt#L3448)). The companion [baking-flours-starches matrix, line 458](../batches/baking-flours-starches.md#L458) explicitly says `potato flakes` is not a safe universal alias for potato flour. Review potato flakes as one adjacent generic pantry identity, not as flour or starch.
- **Target:** Generic dehydrated potato flakes, a cooked and dried potato product scraped into flakes.
- **Distinct scope:** This review does not cover branded instant-mash products, potato granules, seasoned or flavored preparations, or a commercial product roster. Its manufacturer source is used only for a generic product/process description.

## Recommendation

**Add one identity-only reference:** `potato flakes / flocons de pommes de terre`, category `VEGETABLE_AND_AROMATIC`. Keep it separate from generic potato, whole-potato flour, extracted potato starch, and `papa seca`. The OQLF classifies the term as a processed vegetable and describes cooked, mashed potatoes dried as a thin sheet and scraped into flakes; it also names flakes, semolina, and flour separately. Idaho Pacific likewise presents potato flakes, granules, and flour as distinct dehydrated products. These process and product-form distinctions support ingredient diversity without making flakes an alias for flour or starch.

The French display is the OQLF-preferred plural `flocons de pommes de terre`; the English display `potato flakes` is used by the Government of Canada’s importer database and Idaho Pacific. OQLF gives `flaked potatoes` as its English translation. Its terminology record was last updated in 1982, so the French display is well-attested regional terminology but still needs a current Québec retail wording check or independent terminology review before integration.

The bundle has no recipe demand for this identity. The recommendation is based on a real, distinct generic ingredient class within the open coverage review, not a recipe link or branded-product count.

## Exact proposed data

Proposed new reference row, if accepted at integration:

```json
{
  "id": "ingredient-ref-potato-flakes",
  "nameFr": "flocons de pommes de terre",
  "nameEn": "potato flakes",
  "aliasesFr": [],
  "aliasesEn": [
    "dehydrated potato flakes",
    "flaked potatoes"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

If integrated, add one identity-only `ingredient_reference` ledger record with `recordId: ingredient-ref-potato-flakes`, `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, backed by the three proposal-local sources below. Add no measurement or substitution findings. The source IDs are proposal-local and have not been allocated in the shared ledger.

## Evidence and limits

| Source ID | Source and evidence | Limits |
| --- | --- | --- |
| `WP02-B2-POTATO-FLAKES-DIVERSITY-R861-20261019-S01` | Office québécois de la langue française, [*flocons de pommes de terre* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489157/flocons-de-pommes-de-terre), accessed 2026-10-19. OQLF’s preferred French term is the plural `flocons de pommes de terre`; it gives English `flaked potatoes`, classifies it as a processed vegetable, and describes cooked mashed potato dried on heated cylinders and scraped into flakes. It names flakes, semolina, and flour as separate products. | The terminology entry was last updated in 1982. It supports the Québec French term and a process distinction, but it does not establish current retail frequency, a universal product formula, a household measure, or a recipe conversion. |
| `WP02-B2-POTATO-FLAKES-DIVERSITY-R861-20261019-S02` | Idaho Pacific, [*Dehydrated Potato Flakes*](https://www.idahopacific.com/potato-flakes), accessed 2026-10-19. The manufacturer describes fresh potatoes as peeled, cooked, mashed, drum-dried, and scraped into flakes; it separately lists flakes, granules, and flour as product classes. This is generic class/process evidence, not an attempt to cover the manufacturer’s roster. | The page says formulations and additives vary by intended use. Its product applications, specifications, yields, and any product-specific amounts do not establish generic recipe behavior or reusable measurements. No measurement is taken from the page. |
| `WP02-B2-POTATO-FLAKES-DIVERSITY-R861-20261019-S03` | Innovation, Science and Economic Development Canada, [Canadian Importers Database: 110520 — Potato flakes](https://ised-isde.canada.ca/app/ixb/cid-bdic/productReport.html?hsCode=110520), accessed 2026-10-19. The federal database uses `Potato flakes` as the commodity heading and reports major Canadian importers for 2024. | Trade classification establishes a Canadian market category and English wording, not a consumer product standard, French name, ingredient composition, or culinary use. The importer list is not treated as a target brand roster. |

## Boundaries and data limits

- Do not add aliases to `ingredient-ref-potato`, `ingredient-ref-potato-flour`, `ingredient-ref-potato-starch`, `ingredient-ref-papa-seca`, or any granule or prepared-mash identity. In particular, `potato flakes` stays off the potato-flour row, as the existing matrix requires.
- Do not activate `instant mashed potatoes`, `potato granules`, `potato flour`, or `potato starch` as aliases. Those names can identify different products or preparations.
- The generic row must not assert that every product is additive-free. The reviewed manufacturer explains that some flake formulations include processing additives and others may not.
- Add no form, recipe link, density, unit mapping, mass/volume conversion, yield, or substitution. The reviewed evidence supplies no transferable kitchen quantity or general replacement rule; recipe-use claims from an industrial manufacturer stay product/application-scoped.
- Preserve all existing references and evidence. This proposal adds a distinct candidate only; it deletes, merges, or rewrites nothing.

## Ownership and demand audit

- The current ingredient-reference JSON has 1,892 rows. It has no `ingredient-ref-potato-flakes` ID and no exact `potato flakes`, `dehydrated potato flakes`, `flaked potatoes`, or `flocons de pommes de terre` name or alias. The adjacent references remain `potato`, `potato flour`, `potato starch`, and `dried potato (papa seca)` with their current categories and evidence unchanged.
- The current ingredient-forms file and legacy-import identity file have no exact candidate phrase or proposed ID. No matching source URL or potato-flake ledger record was found in the active research ledger.
- The manifest lists 114 bundled recipes. A full manifest-listed scan parsed 1,123 ingredient rows and found no occurrence of the proposed EN/FR display or aliases. No recipe link is proposed.
- The earlier [WP06 chuño/tunta search-ownership review](wp06-chuno-tunta-search-ownership-review-20261013.md) included `potato flakes` only as a comparator and found no exact active row, form, or legacy owner; it did not allocate that phrase or decide a potato-flakes identity. The recent R857–R860 progress and related flour/starch reviews were checked; no queued brand-specific potato-flake child task was found.

## Files checked

- `AGENTS.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `docs/catalog/ingredient-catalog-workflow.md`
- `docs/catalog/batches/baking-flours-starches.md`
- `docs/catalog/proposals/wp02-next-open-flour-starch-gap-review-20261012.md`
- `docs/catalog/proposals/wp02-b-seed-derived-sunflower-flour-boundary-review-20261012.md`
- `docs/catalog/proposals/wp06-chuno-tunta-search-ownership-review-20261013.md`
- `docs/catalog/proposals/wp02-section-a7-next-gap-review-r857-20261019.md` and the R857–R859 integration README
- `docs/catalog/proposals/wp02-generic-egg-wash-identity-review-r860-20261019.md` and its integration README
- `docs/catalog/research-ledger.v1.json`, `docs/catalog/legacy-import-identities.v1.json`, the bundled ingredient references, ingredient forms, manifest, and all manifest-listed recipe files
- `roadmap.md`

## Unresolved risks

1. OQLF’s French record is authoritative and gives the exact plural display, but it is old. A current Québec retail label or independent Québec terminology review should confirm whether `flocons de pommes de terre` remains the best fr-CA display.
2. `Potato flakes` can appear in both plain ingredient contexts and composite prepared products. Keep the generic identity limited to dehydrated potato flakes as an ingredient; do not generalize product additives, reconstitution amounts, package portions, or finished-product formulations.
3. No generic measure, conversion, or substitution research was completed in this identity review. Those questions remain open.

This proposal changes no implementation or database JSON, so no tests are required.
