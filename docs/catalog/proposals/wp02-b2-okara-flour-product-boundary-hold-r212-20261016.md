# WP02 B2 okara flour product-boundary hold — R212

- **Reviewed:** 2026-10-16.
- **Status:** Proposal-only hold; awaiting root disposition. No catalog, forms, ledger, recipe, generated, plan, roadmap, or test files were changed.
- **Scope:** Whether a dry okara flour/powder identity should be added under the open WP02 B2 alternative-flour review, and which English and Québec French terms would safely identify it.
- **Candidate:** Dry soy-pulp residue sold as flour or powder after soy-milk/tofu filtration. This is a narrow B2 flour candidate, separate from the existing whole-bean soy-flour identities.
- **Recommendation:** **Hold the candidate outside active references, forms, aliases, and the research ledger for now.** Canadian listings establish dry okara powder/granules and use in cooking, but do not establish a stable flour grade or Québec retail name. The OQLF’s Québec term for the underlying residue is `pulpe de soya`; `okara` is identified as the Japanese local name. The Canadian French phrase `farine d'okara` is descriptive evidence, not a Québec product label or terminology ruling. No bundled recipe selects the dry product. Adding a compound name containing `okara` would also make the current picker return the dry flour row for the broader query `okara`, which denotes the pulp and does not specify dry/powdered state.

## Checklist context and decision

The live plan keeps the broader WP02 B2 alternative-flour review open. This review screens one soy-derived residue product that is distinct from, and not already represented by, generic soy flour, defatted soy flour, or roasted soybean flour (Kinako). It does not reopen those accepted identities or resolve the broader B2/B3 checklist.

The product name would need to encode both the residue source and its dry, milled state. Wet/fresh okara is a moist soy-filtration pulp; drying and milling it creates a powder/flour product, while the current listings also use a granulated form. The reviewed sources do not define a shared particle-size or residual-moisture specification that makes all products sold as “okara powder,” “granulated okara,” or “okara flour” interchangeable. The listing for Kikkoman’s powder says it can be used in place of flour in gluten-free dishes, but does not give a replacement ratio or identify it as a standardized flour grade.

## Names and identity boundaries

| Term or class | Evidence and interpretation | Recommendation |
| --- | --- | --- |
| `okara flour` | Used in Canadian French editorial material as a flour made by drying and finely milling soy pulp. No current Québec flour package using this exact English name was found in the targeted search. | Keep unassigned pending recipe or Québec package demand and a clearer product-grade boundary. This is a candidate English key, not an accepted display. |
| `farine d'okara` | Used in a Canadian French article to describe the dried-and-milled product. OQLF recognizes `okara` as a Japanese local name for `pulpe de soya`, but does not establish `farine d'okara` as a Québec preferred term. | Candidate French wording only; do not add it as a display or alias yet. |
| `okara powder` / `soy milk okara powder` | Current Canadian-facing Kikkoman listing uses “Soy Milk Okara Powder”; another Canada-facing product listing says “granulated soy okara.” These are named retail presentations, not evidence of one flour grade or common particle size. | Keep as source-specific names in this review. Do not add either as a catalog alias. |
| `pulpe de soya` / `soybean pulp` / `soy pulp` | OQLF defines this as the solid residue after filtering a soybean mash intended for tofu or soy beverage; it notes `okara` as the Japanese local name and says Québec uses `pulpe de soya`. This names the broader residue, including a state not shown to be dry flour. | Keep separate from a dry flour/powder identity. Do not alias these broad terms to a future dry row. |
| `soy flour` / `farine de soya` | Existing OQLF-backed identity covers fine, sifted, hull-free soybean meal made from the beans. | Keep the existing row unchanged; do not merge okara with whole-bean soy flour. |
| `defatted soy flour` / `farine de soya dégraissée` | Existing distinct row represents soy flour with its fat removed; it is not the insoluble residue left by filtration. | Keep separate. |
| `kinako` / `poudre de soja Kinako` | Existing source-named roasted-soybean product. | Keep separate; `roasted soybean flour` remains attached only to Kinako. |

If a future recipe or Québec retail package establishes demand and a stable identity, the narrow candidate display to reassess is **`okara flour / farine d'okara`**, with **empty alias arrays** initially. That would still require a separate review of the broad `okara` picker collision before integration. Do not assign `poudre d'okara`, `soy pulp flour`, `soybean pulp flour`, `pulpe de soya`, `soy pulp`, or generic soy-flour wording as aliases without direct product-equivalence evidence and another picker review.

## Current catalog ownership and picker impact

Snapshot checked 2026-10-16. The bundled catalog has 1,595 active ingredient references and 122 forms; the legacy-import archive has 61 candidates, and the research ledger has 1,940 records.

- No active reference, form, legacy candidate, or research-ledger record owns or mentions `okara`, `okara flour`, `okara powder`, `soy pulp`, `soybean pulp`, `tofu pulp`, `farine d'okara`, `poudre d'okara`, or `pulpe de soya`.
- `ingredient-ref-soy-flour` owns `soy flour / farine de soya`, with aliases `soybean flour`, `soya flour`, and `farine de soja`.
- `ingredient-ref-defatted-soy-flour` separately owns `defatted soy flour / farine de soya dégraissée`.
- `ingredient-ref-kinako` owns `kinako / poudre de soja Kinako`, with English alias `roasted soybean flour`.
- No active-reference ID is proposed or reserved. The four R212 source IDs below are local to this proposal and were not added to the ledger. The OQLF generic soy-flour source already in the ledger is **WP02-S132**; the Québec allergen-name page is already **WP02-S134**. They are cited below as existing sources, not proposed new ledger entries.

`IngredientSearch.kt` normalizes accents and punctuation, then prefers complete word phrases occurring anywhere in a display name or alias. Consequently, a hypothetical `okara flour / farine d'okara` row would match all of `okara flour`, `okara`, and `farine d'okara`. The current picker has no separate owner for wet/raw `pulpe de soya`; a one-result `okara` search would therefore narrow a broad residue name to the dry flour/powder candidate. Current searches for `okara`, `okara flour`, `okara powder`, `farine d'okara`, `poudre d'okara`, and `pulpe de soya` return no candidate. Existing `soy flour` wording remains owned by its current generic and defatted rows; this proposal does not change those outcomes.

## Bundled recipe demand

The manifest lists 114 recipes with 1,123 ingredient rows. A scan of the manifest-listed recipe files and ingredient rows found:

- 0 files or ingredient lines mentioning `okara`, okara flour/powder, soy pulp, tofu pulp, `pulpe de soya`, or the proposed French flour phrase;
- 0 links to the existing soy-flour, defatted-soy-flour, or Kinako reference IDs.

There is no bundled recipe demand to select a dry presentation, add a form, or disambiguate wet pulp from a flour/powder product. The B2 flour/starch checklist remains open.

## Numeric, form, mapping, and substitution limits

- **Measurements:** The Canadian-facing Kikkoman listing gives a 120 g retail package; the Naturitas Canada listing gives a separate 175 g product. These are package sizes, not recipe portions. Neither source gives a household measure-to-mass relation. The Kikkoman page’s nutrition basis of 100 g is a label basis, not a kitchen measure.
- **Density:** No broadly applicable bulk density was found. Do not set `defaultDensity`.
- **Unit mappings or conversions:** None supported. Do not add volume-to-mass or package mappings.
- **Forms:** Do not add wet, dried, powdered, or granulated forms now. The source listings use differing product presentations without a shared specification, and the corpus has no explicit form demand.
- **Substitutions:** Kikkoman says its powder can substitute for flour in gluten-free cooking but gives no ratio or application-specific limits. The Canadian French article says it can be used in varied foods, but does not support a general wheat-flour conversion. Do not add a substitution rule or default flour-replacement behavior.
- **Recipe links or yields:** None supported; no matching recipe line exists.

If later accepted as a new identity, start with `category: FLOUR_AND_STARCH`, null density, empty mappings, empty aliases, and no forms, conversions, yields, recipe links, or substitutions until each is reviewed from product-specific evidence. That is a future integration shape, not the current recommendation.

## Source register

Pages were checked on 2026-10-16. R212 source IDs below are local to this proposal and have not been added to the shared ledger. Existing source IDs WP02-S132 and WP02-S134 are reused as noted.

| ID | Source and direct URL | Supports | Limit |
| --- | --- | --- | --- |
| **WP02-B2-OKARA-FLOUR-R212-20261016-S01** | Office québécois de la langue française, [*pulpe de soya* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26584311/pulpe-de-soya), last updated 2026. | Defines the solid residue after filtering soy mash for tofu or soy beverage; gives preferred Québec French `pulpe de soya` and `pulpe de soja`; identifies `okara` as the Japanese local name. | Defines the pulp, not a dried or milled flour grade. |
| **WP02-S134** (existing ledger ID) | Gouvernement du Québec, [*Allergènes et leurs différentes appellations*](https://www.quebec.ca/sante/alimentation/allergies-alimentaires/allergenes-differentes-appellations), Soy section. | Lists `Okara` among other soy/allergen appellations. | Allergen-name guidance only; it does not identify a flour or dried product. |
| **WP02-B2-OKARA-FLOUR-R212-20261016-S02** | JapaneseTaste.ca, [Kikkoman Soy Milk Okara Powder Nutrient Booster for Cooking, 120 g](https://japanesetaste.ca/products/kikkoman-soy-milk-okara-powder-nutrient-booster-for-cooking-120g). | Current Canada-facing retail listing names powder, says Kikkoman’s material is soy pulp remaining after soy-milk production, gives 120 g package size, identifies Canadian non-GMO soybeans as its ingredient, and says the powder may replace flour in gluten-free dishes. | A specific Japanese-made SKU listed for Canadian delivery. It does not specify flour grade, particle size, a household measure, density, or substitution ratio. |
| **WP02-B2-OKARA-FLOUR-R212-20261016-S03** | Naturitas Canada, [Int-Salim Okara, 175 g](https://www.naturitas.ca/p/food/superfoods/okara-175-g-int-salim). | Current Canada-facing listing says the product is in stock, identifies `Granulated soy okara`, describes soy-milk filtration residue, and gives a 175 g package. | Retail listing and package evidence only; “granulated” is not equivalent evidence for all flour/powder products or a kitchen measure. |
| **WP02-B2-OKARA-FLOUR-R212-20261016-S04** | Second Harvest, [*La puissance de la farine*](https://www.secondharvest.ca/fr-ca/post/flour-power), `Farine d'okara` section. | Canadian French editorial wording `farine d'okara`; describes the soy-pulp residue as dried and milled into fine powder. | Not a Québec terminology authority or a Québec product package; does not define a standard flour specification, measure, density, or ratio. |
| **WP02-S132** (existing ledger ID) | OQLF, [*farine de soya* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084165/farine-de-soya). | Defines generic soy flour as fine, sifted, hull-free soybean meal and pairs `farine de soya`/`farine de soja` with soy-flour variants. | Supports the separate whole-bean flour identity; does not define okara or its flour. |

## Review method and disposition

Read `AGENTS.md`, the live B2 checklist section in `docs/RecipeBook-global-ingredient-catalog-plan.txt`, relevant flour proposals, active ingredient references/forms, the legacy archive, the research ledger, the picker implementation, the manifest-listed recipes, and current Canadian/Québec terminology and product sources. Exact-key and corpus scans found no existing okara owner or recipe demand. No tests or emulator work were run because this is a documentation-only proposal.

**Precise delta: none.** Keep the B2 candidate unallocated; add no active row, alias, form, ledger candidate, measure, density, mapping, conversion, yield, recipe link, or substitution. A future review can reopen a narrow dry product if a bundled recipe or Québec retail label supplies concrete demand and picker behavior can avoid silently treating bare `okara` as dry flour. The broader WP02 B2/B3 checklist remains open.
