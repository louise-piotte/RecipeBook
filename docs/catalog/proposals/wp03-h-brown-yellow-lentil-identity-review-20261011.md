# WP03 Section H — Brown and yellow lentil identity review

- **Reviewed:** 2026-10-11
- **Packet type:** research-only proposal
- **Scope:** Resolve the open brown/yellow lentil name and identity question only: live reference and legacy-candidate state, exact normalized search ownership, bundled-recipe demand, Canadian and Québec terminology, and botanical/product boundaries.
- **Write scope:** This proposal file only. No seed JSON, research ledger, plan, roadmap, code, recipe, or test file was changed.
- **Plan state:** The brown/yellow lentil item remains open until the integrator accepts the disposition below. This review does not resolve whole/split/dehulled forms or broader Section H coverage.

## Recommendation

**Do not add active `brown lentils` or `yellow lentils` references, aliases, or forms.** The unqualified names are used across more than one product class or descriptive axis, and the bundled recipe set has no demand for either. Keep the existing generic `lentils / lentilles` row and existing color-class rows as they are. Leave `brown lentils`, `lentilles brunes`, `yellow lentils`, and `lentilles jaunes` without an active search owner.

The evidence supports narrower scientific or supplier-scoped distinctions, but it does not make the broad consumer phrases safe aliases:

- **Brown:** `Spanish brown` / `Pardina` is a recognized, narrow lentil type. Separately, a Canadian processor calls its whole red lentils “brown lentils.” Québec retailers list brown products next to red products, but their titles do not disclose the variety, cotyledon color, or processing state. The exact broad label therefore does not select one non-overlapping identity. A future recipe that explicitly calls for Pardina could justify reviewing a Pardina-specific row, but it should not make generic `brown lentils` or `lentilles brunes` aliases of that row.
- **Yellow:** Canadian grain classification uses cotyledon color to separate red from other lentils; yellow is one possible cotyledon color, not a standalone class name that separates one seed from all the green and brown seed-coat types. Canadian suppliers also use “yellow split lentils” for a dehulled/split product. The general phrase `yellow lentils` has no stable Québec standalone product definition in the sources reviewed. Do not add a broad yellow row or alias.

This closes the current catalog question as a **no-add disposition**, while leaving a future recipe’s exact product wording available for a scoped review.

## Live catalog and recipe audit

Snapshot checked in the shared worktree on 2026-10-11. The active lentil-family references are:

| ID | Current display | Aliases | Identity / numeric state relevant here |
|---|---|---|---|
| `ingredient-ref-lentils` | `lentils / lentilles` | none | `LEGUME_AND_PULSE`; `defaultDensity: null`; `unitMappings: []`; no lentil forms |
| `ingredient-ref-green-lentils` | `green lentils / lentilles vertes` | none | Identity-only; no density, mappings, or forms |
| `ingredient-ref-french-green-lentils` | `French green lentils / lentilles vertes françaises` | FR: `lentilles françaises` | Identity-only; no density, mappings, or forms |
| `ingredient-ref-black-beluga-lentils` | `black Beluga lentils / lentilles noires Beluga` | EN: `Beluga lentils`; FR: `lentilles Beluga` | Identity-only; no density, mappings, or forms |
| `ingredient-ref-red-lentils` | `red lentils / lentilles rouges` | FR: `lentilles corail` | Identity-only; no density, mappings, or forms |
| `ingredient-ref-green-lentil-flour` | `green lentil flour / farine de lentilles vertes` | none | A flour product in `FLOUR_AND_STARCH`, not a whole-lentil identity |

No brown/yellow entry exists in the active references or legacy candidate file. There are no lentil forms. The existing generic and color-class refs have null density and empty unit mappings. The package substitution and contextual-substitution files have no lentil rules; the package-yields file has no lentil entry.

The query audit mirrored `normalizeIngredientSearchKey` and full-phrase-then-partial behavior in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase, NFKD, accent folding, punctuation-to-space, then complete word-phrase search before substring fallback. Reference display names and aliases, attached form terms, and legacy candidate names and aliases were checked.

| Normalized query family | Exact active/form/legacy owner | Search result in the current catalog | Recommended treatment |
|---|---|---|---|
| `brown lentil`, `brown lentils`; `lentille brune`, `lentilles brunes` | none | none | Keep unassigned; do not alias to generic lentils, red lentils, or green lentils |
| `yellow lentil`, `yellow lentils`; `lentille jaune`, `lentilles jaunes` | none | none | Keep unassigned; do not alias to generic lentils, red lentils, or green lentils |
| `yellow split lentil(s)`, `lentilles jaunes cassées` | none | none | Keep out of active search until a recipe establishes the exact product and processing scope |
| `Pardina`, `Pardina lentils`, `Spanish brown lentils` | none | none | Do not add now; review a scoped Pardina identity only if a recipe or explicit catalog need arises |

No phrase above collides with an existing active or legacy alias. This is a catalog-search result, not a resolution of the semantic overlap documented below.

The package manifest contains **114 recipe files and 1,123 ingredient rows**. Searching the recipe files and ingredient fields for `lentil`, `lentille`, `Pardina`, and `masoor` found no matches. There is no recipe link or direct reason to create either row in this package.

## Identity and naming evidence

| Evidence | What it establishes | What it does not establish |
|---|---|---|
| Canadian Grain Commission (CGC), English and French Official Grain Grading Guide [S02–S03] | Canada distinguishes “Red” from “other than Red” lentils by cotyledon color. The cotyledon may be red, yellow, or green. Seed-coat color is another property: the English guide gives black or tan as examples; the French guide uses `brun roux`; it also gives speckled green. | It does not make “brown lentils” or “yellow lentils” exclusive consumer identities, French display recommendations, recipe aliases, or forms. |
| Canadian Food Inspection Agency, *The Biology of Lens culinaris* [S04] | Canadian lentil varieties such as Eston, Richlea, and Laird can have yellow cotyledons; seed-coat colors span green, gray, brown, and black. Cotyledon color and seed-coat color are independent traits. | The document is not a current consumer taxonomy or a bilingual product-name recommendation. |
| USDA Agricultural Research Service (ARS), current project and 2014 breeding report [S05–S06] | ARS uses `Pardina` / `Spanish Brown` as a narrow market type. The report describes Spanish Brown/Pardina as small, brown-coated, yellow-cotyledon lentils; the same report distinguishes green-coated/yellow-cotyledon classes and red-cotyledon types with brown coats. | US breeding-class names do not by themselves establish a Québec display term or make all brown-labelled retail lentils Pardina. |
| Diefenbaker Spice & Pulse, Canadian processor [S07] | Its product page lists “Whole Red Lentils” and describes those lentils as “brown” on the outside and deep orange-red inside; it explicitly lists “Brown lentil” among alternate names. It also calls a product “Split Yellow Lentils” and says it is made by removing the skin from whole green lentils and splitting the remaining yellow seed. | This supplier-specific usage should not be generalized into universal aliases. Its yellow product label names a processed presentation, not proof of a separate yellow-cotyledon consumer class. |
| Mayrand and Maxi Québec-facing grocery listings [S08–S09] | `Lentilles brunes` / `Brown Lentils` is real local retail wording. Mayrand lists brown products separately from red and green lentil products; Maxi uses the French product name `Lentilles brunes`. | The listing titles do not identify a cultivar, cotyledon color, seed-coat type, or processing state. They do not overcome the supplier’s conflicting use of “brown” for whole red lentils. |
| Simpson Seeds, Saskatchewan processor [S10] | A Canadian processor markets “Yellow Split Lentils” and gives yellow-cotyledon and split-product specifications. Its botanical-name field is misspelled `Les Culinaris`, so this proposal does not rely on that field to establish species. | This describes a named product, not a safe alias for every `yellow lentil`; it supplies no Québec French label. Its product page does not establish a universal relation to the locally described split/dehulled green lentil product. |
| OQLF and targeted Québec/Canadian terminology search [S01] | OQLF supports the generic `lentille / lentil` identity and *Lens culinaris*. Québec retail pages support the descriptive plural `lentilles brunes`. | No dedicated OQLF or TERMIUM food entry for the broad brown/yellow class names was found in the targeted search. Federal grading vocabulary is descriptive of seed traits, not an OQLF ruling on the picker display. |

The resulting boundaries are:

1. **Do not equate brown with red or whole red.** In the grain sources, brown may describe the seed coat; a red-cotyledon lentil can have a brown coat. In a Canadian supplier’s product terminology, “brown lentil” is also used as an alternate name for a whole red product. Local retailers’ side-by-side category labels do not show which narrower class their brown products represent.
2. **Do not equate yellow with one identity.** Yellow may describe a cotyledon shared by several market types, or appear in the name of a specifically split/dehulled product. A broad yellow label cannot identify one stable seed class without a more specific market or preparation term.
3. **Keep the Québec product wording separate from identity evidence.** `Lentilles brunes` is attested in Québec products, but a supported French label alone does not resolve which biological/market item the label denotes. No standalone Québec retail term or OQLF/TERMIUM display for `lentilles jaunes` was established.

## Proposed shared-data disposition

No data edit is proposed in this proposal:

| File / record | Exact proposed disposition |
|---|---|
| `ingredient-references.v1.json` | No new `ingredient-ref-brown-lentils`, `ingredient-ref-yellow-lentils`, or `ingredient-ref-pardina-lentils` row. Do not add any brown/yellow/Pardina aliases to `ingredient-ref-lentils`, `ingredient-ref-red-lentils`, or either green-lentil row. Preserve all current displays and aliases. |
| `legacy-import-identities.v1.json` | No brown/yellow/Pardina candidate exists; add or promote none. |
| `ingredient-forms.v1.json` | No form changes. The processing wording in supplier examples does not establish a catalog form need for the current package. |
| Unit mappings, conversions, package yields, substitutions | No changes. No lentil measurement or cross-identity substitution is warranted by this identity review. |
| `research-ledger.v1.json` | Do not create a brown/yellow ingredient-reference record. If the completed review is recorded, append its sources to the existing `ingredient-ref-lentils` evidence and replace the old broad-label unresolved rationale with the disposition text below; retain `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. |
| `docs/RecipeBook-global-ingredient-catalog-plan.txt` | After integration, mark only the brown/yellow name-and-identity question complete with the no-add disposition below. Keep the separate whole/split/dehulled form questions and the broader Section H item open. |

Suggested ledger decision text:

> Keep broad `brown lentils / lentilles brunes` and `yellow lentils / lentilles jaunes` out of active references and aliases. Brown describes seed-coat types including the narrow Spanish Brown/Pardina class, while at least one Canadian supplier also uses “brown lentils” for whole red lentils. Yellow describes a cotyledon color shared by multiple types and also appears on a supplier-defined split/dehulled product. Québec retail titles attest `lentilles brunes` but do not define the seed class; no stable Québec standalone yellow-lentil class was established. No recipe demands either label. Reopen only for a recipe or explicit product need that provides a scoped class name. Add no forms or numeric/substitution behavior.

Suggested plan replacement:

> [x] Review the brown/yellow lentil name boundary. Keep unqualified `brown lentils / lentilles brunes` and `yellow lentils / lentilles jaunes` unassigned: brown is used for both a seed-coat type and whole red lentils, while yellow denotes a cotyledon color shared across types or a supplier-defined split/dehulled product. Add no broad references or aliases without a scoped recipe/product need. See `docs/catalog/proposals/wp03-h-brown-yellow-lentil-identity-review-20261011.md`.

This disposition does not bar a later, exact `Pardina` review. USDA ARS supports `Pardina` / `Spanish Brown` as a narrow type, but this package has no Pardina demand and the French picker label has not received a Québec display review; do not create it merely to fill out a taxonomy.

## Source register

Sources were accessed 2026-10-11. `Sxx` labels are proposal-local. Source product names and agricultural classifications are used only within the limits described above.

| ID | Source | Claim scope and limitation |
|---|---|---|
| S01 | OQLF, [lentille (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082779/lentille) | Existing ledger source `WP03-H-S05-OQLF-LENTILLE`: Québec generic `lentille / lentil`, *Lens culinaris*, edible dry seed. Not a color-class display ruling. |
| S02 | Canadian Grain Commission, [Lentils: classes, types and varieties](https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/18-lentils/classes-types-varieties.html) | Official Canadian grain classes use cotyledon color; seed-coat color and cotyledon color are separate type traits. Grading terminology, not recipe identity aliases. |
| S03 | Commission canadienne des grains, [Lentilles : classes, types et variétés](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/18-lentilles/classes-types-varietes.html) | Official French grading vocabulary says `lentilles rouges` / `lentilles autres que rouges`, cotyledons `rouge, jaune ou vert`, and a coat may be `noir ou brun roux`. This is technical classification, not a consumer display ruling. |
| S04 | Canadian Food Inspection Agency, [The Biology of *Lens culinaris* Medikus (Lentil)](https://inspection.canada.ca/en/plant-varieties/plants-novel-traits/applicants/directive-94-08/biology-documents/lens-culinaris-medikus-lentil) | Describes Canadian cultivar traits and wide seed-coat color variation; names Eston, Richlea, and Laird as yellow-cotyledon cultivars. This older biology document is used for the trait distinction, not current market prevalence. |
| S05 | USDA ARS, [Research project: lentil market classes](https://www.ars.usda.gov/research/project/?accnNo=445171&fy=2025) | Current project page calls Pardina a market class with dark brown coat and distinguishes it from green-coated Richlea and Laird types. US market-class research, not Québec consumer terminology. |
| S06 | USDA ARS, [2014 lentil breeding progress report](https://www.ars.usda.gov/ARSUserFiles/20902000/ProgressReport/USDA%20ARS%202014%20Breeding%20Progress%20Report.pdf) | Describes Pardina / Spanish Brown type as small, brown-coated, yellow-cotyledon lentils, and contrasts it with yellow-cotyledon green types and red-cotyledon types with brown coats. Research classification, not a local display recommendation. |
| S07 | Diefenbaker Spice & Pulse, [Special Crop Products](https://www.dspdirect.ca/special-crop-products.php) | Canadian processor’s product wording: `brown lentil` as alternate name for whole red lentils; `split yellow lentils` made by skinning and splitting whole green lentils. Supplier-specific naming, not universal aliases. |
| S08 | Mayrand, [Lentille (fr-CA category)](https://mayrand.ca/fr/nos-produits/epicerie/riz-et-grain/lentille) and [Lentil (en-CA category)](https://mayrand.ca/en/our-products/grocery/rice-and-grain/lentil) | Québec retailer lists brown, red, and green products separately; supports local product wording but not a botanical, cotyledon, cultivar, or processing definition. |
| S09 | Maxi, [Clic — Lentilles brunes](https://www.maxi.ca/fr/brown-lentils/p/20307015_EA) | Québec-facing product title and ingredient list use `Lentilles brunes`; no variety, species subtype, cotyledon color, or processing details are given. |
| S10 | Simpson Seeds, [Yellow Split Lentils](https://simpsonseeds.com/products/yellow-split-lentil/) | Canadian processor gives yellow-cotyledon and split-product specifications. Its botanical-name field reads `Les Culinaris`; this proposal does not treat the apparent typo as a verified Latin name. It does not provide a Québec French term or establish the broad phrase `yellow lentils`. |
| S11 | Metro, [Geovita Rice and Lentil Mix](https://www.metro.ca/en/online-grocery/aisles/pantry/pasta-rice-beans/rice/rice-and-lentil-mix/p/813515020025) | Existing ledger source `WP03-H-LENTIL-TYPES-20261011-S08`: ingredient list uses “organic yellow lentils” as a blend component, without standalone identity, species/form definition, or French product label. |

## Review limits

This is an identity-only disposition. It does not add or infer whole, split, hulled/dehulled, dry, or cooked states; any density, volume-to-mass mapping, conversion, package yield, recipe relink, or substitution. No tests, builds, normalizers, or emulator deployment were run because this proposal does not modify the database JSON files or implementation.
