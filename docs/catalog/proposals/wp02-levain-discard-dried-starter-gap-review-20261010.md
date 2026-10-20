# WP02 Section E — Levain build, discard, and reactivatable dried-starter review

- **Packet type:** research proposal; coordinator accepted the bounded alias and dried-culture form on 2026-10-10. Integration details are in [`wp02-sourdough-state-form-integration-20261010`](../batches/wp02-sourdough-state-form-integration-20261010/README.md).
- **Prepared and source-access date:** 2026-10-10.
- **Scope:** the open Section E follow-up for recipe-built levain, maintenance discard and activity states, and dried sourdough culture explicitly intended for reactivation.
- **Existing identity:** `ingredient-ref-sourdough-starter` / `sourdough starter` / `levain naturel`.
- **Status:** research recommendation for coordinator review. The Section E checklist remains open.
- **Source IDs:** `WP02-E-STARTER-STATE-20261010-S01` through `WP02-E-STARTER-STATE-20261010-S10`. The prefix was checked against the current ledger and proposal/batch files before assignment; no collision was found.

## Recommendation

1. **Keep one identity for the maintained live sourdough culture.** The current reference is already separate from commercial yeast. Preserve its EN name `sourdough starter` and provisional fr-CA display `levain naturel`. Add only the precise French alias candidate `levain chef`: a Québec fermentation educator defines this as the base culture kept for making a refreshed levain for each bake [S03]. Do not add bare `levain`; the OQLF definition is broader and includes fermented flour dough or dough mixed with yeast [S01].
2. **Keep recipe-built levain as a recipe-specific preparation, not a new reference or global form.** A recipe can build its levain from the maintained starter and other ingredients, then use that build in its dough [S04]. Québec fermentation terminology calls a refreshed starter prepared for bread `levain tout point`, distinct from retained `levain chef` [S03]. Keep that phrase as contextual recipe wording; do not alias it to the maintained starter or infer a generic build formula.
3. **Keep discard as a portion/state of the same starter.** Sources define it as starter removed during routine maintenance and not fed in that maintenance step [S03, S05]. It can be used in some recipes and may contribute differently depending on recipe and condition. Do not create a discard identity or infer that every discard is inactive, dead, or incapable of leavening. Québec source wording includes `levain écarté` and `rejet`; treat those as fr-CA recipe-language candidates, not catalog aliases [S03].
4. **Recommend one candidate form for dried culture that is explicitly reactivatable.** A Québec product is named `levain naturel déshydraté` / `levain en poudre`, identifies a bacterial/yeast culture, and links an activation manual that turns the product into usable levain [S06–S08]. Candidate form code: `dehydrated_reactivatable`; labels: EN `dehydrated sourdough starter`, FR `levain naturel déshydraté`. Keep form match-term arrays empty for now: the phrase `levain déshydraté` alone is ambiguous because another manufacturer sells a dehydrated, devitalized levain product mixed directly into dough [S09], while Puratos also distinguishes aromatic powder from active sourdough-based baking ingredients [S10]. Require product/recipe context that explicitly supports reactivation before attaching the form to a line.
5. **Do not add recipe links or numeric behavior.** None of the 114 bundled recipes contains a sourdough-starter ingredient line. Do not add a recipe reference/link, hydration, activity threshold, quantity, yield, density, conversion, or starter-to-yeast substitution from this review.

## Bilingual names and boundaries

| Concept | EN wording | fr-CA wording supported or under consideration | Disposition |
|---|---|---|---|
| Maintained culture | Current display: `sourdough starter` | Current provisional display: `levain naturel`; candidate alias: `levain chef` | Keep the current identity. `Levain chef` is a direct Québec technical term for the retained base culture [S03]; add it only as a sourced alias after coordinator review. Keep bare `levain` out as an alias because OQLF defines it more broadly [S01]. |
| Recipe build / pre-ferment | `levain build`; recipe source may call the result `levain` | `levain tout point` is a Québec producer’s term for refreshed levain prepared from the retained `levain chef` for breadmaking [S03] | Recipe-specific preparation only. No separate identity/form, and no alias to `sourdough starter`. Preserve source wording and source-specific ingredients. |
| Discard removed during maintenance | `sourdough discard`; `unfed starter` only where the recipe says so | `levain écarté`; `rejet` are source-attested Québec wording [S03] | Same culture, captured as line context/state only when needed. Do not make these global aliases or equate “discard” with biologically inactive. |
| Activity / timing | `fed`, `unfed`, `ripe`, `unripe`, `active`, `peak` | Preserve the recipe’s own French wording; `rafraîchi` is the source’s term for feeding the culture [S03] | State and timing context, not ingredient identities or universal forms. No global threshold or readiness rule. |
| Dried culture for reactivation | `dehydrated sourdough starter`; `dried sourdough starter` | `levain naturel déshydraté`; source also uses `levain déshydraté` and `levain en poudre` [S06–S08] | Candidate `dehydrated_reactivatable` form under the existing starter identity. Do not activate generic powder/dehydrated match terms. |
| Devitalized baking product / sourdough flavor powder | Named products only when recipe/product evidence identifies them | Example: `levain de blé déshydraté et dévitalisé` [S09] | Do not map to the reactivatable culture form. Hold a separate identity decision until an exact recipe or product line requires it. |

## Current package and collision audit

Snapshot checked 2026-10-10 before writing this packet:

| Artifact | Current state | SHA-256 / reproducible note |
|---|---|---|
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `ingredient-references.v1.json` | 862 active references | `5155166ab2c33edfca487cf00cb1c0f1cec2bd4d526305d78b9b57841770a3d2` |
| `ingredient-forms.v1.json` | 47 forms; none linked to `ingredient-ref-sourdough-starter` | `7676316bf4e3b0ba6972b6c0759f0a86156428f03a2e86730ff6b986756ff3ce` |
| `research-ledger.v1.json` | 1,107 records; starter record is `verified`, with measurement `researched_no_supported_value` and substitutions `blocked_pending_evidence` | `1680d71a1afa0cbb18560f20cfab6a16c412874eb1181844fe333d94c71858f6` |
| `legacy-import-identities.v1.json` | 78 candidates; no sourdough/starter/discard/levain candidate | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| Manifest-listed recipes | 114 files / 1,123 ingredient rows | Corpus digest `d757e70fe397591e9754955e45610bb894f49457666b4a4bead38bb819044c3b`; SHA-256 over sorted recipe basename, NUL, exact file bytes, NUL |

Current references relevant to the boundary:

| ID | Active EN / fr-CA names and aliases | Review result |
|---|---|---|
| `ingredient-ref-sourdough-starter` | `sourdough starter` / `levain naturel`; no aliases | Only live starter identity. `levain` can match the beginning of the French display in search, but is not a separate exact alias. |
| `ingredient-ref-yeast` | `baker's yeast` / `levure de boulangerie`; aliases include `yeast`, `dry yeast`, `levure`, and `levure de boulanger` | Keep as commercial yeast; no sourdough term is present in its names or aliases. |
| `ingredient-ref-active-dry-yeast`, `ingredient-ref-instant-yeast`, `ingredient-ref-compressed-yeast`, `ingredient-ref-osmotolerant-yeast` | Separate commercial yeast identities | Keep distinct from a mixed flour/water sourdough culture. |

No exact active reference, form, or legacy candidate was found for `levain chef`, `levain tout point`, `levain écarté`, `rejet`, `sourdough discard`, `unfed starter`, `dried sourdough starter`, `dehydrated sourdough starter`, `levain déshydraté`, or `levain en poudre`. The existing `levain naturel` display is the only active starter-family term. `Levain déshydraté` and `levain en poudre` remain unsafe as unqualified global matches because the reviewed products use similar wording for different preparation states [S06, S09, S10].

The current open-plan checklist at `docs/RecipeBook-global-ingredient-catalog-plan.txt:1313` records the maintained starter identity as complete and the following recipe-built levain/discard/reactivatable dried-culture review as open. The previous packet `docs/catalog/proposals/wp02-sourdough-starter-levain-boundary-review-20261009.md` established the original live identity and commercial-yeast boundary; this follow-up adds local terminology evidence and the reactivatable-versus-devitalized product distinction. It does not replace or rewrite that packet.

## Exact bundled-recipe demand

Scanned all 114 manifest-listed recipe files and all 1,123 ingredient rows for sourdough, starter, levain, discard, dried culture, and direct starter-reference links. **There are no target ingredient lines and no rows linked to `ingredient-ref-sourdough-starter`.** The word `discard` occurs only in unrelated instruction text (such as discarding strained jam seeds or cooking liquid), not as a sourdough ingredient.

The adjacent yeast rows are controls, not sourdough demand:

| Recipe file and JSON line | Ingredient row | Exact text and current link | Disposition |
|---|---|---|---|
| `recipes/005-bao-buns-vapeur-steamed-bao-buns-559fff48-4d46-4922-b1b8-66808cb0715c.v1.json:34-36` | `559fff48-4d46-4922-b1b8-66808cb0715c-ingredient-2` | Ingredient is dried yeast; `ingredientName: yeast`; `ingredientRefId: ingredient-ref-yeast` | Retain as commercial yeast. |
| `recipes/072-pains-a-hamburger-hamburger-buns-cfa64319-d4b9-4425-b087-3e30be3cc4a0.v1.json:79-81` | `cfa64319-d4b9-4425-b087-3e30be3cc4a0-ingredient-6` | Ingredient is instant yeast; `ingredientName: instant yeast`; `ingredientRefId: ingredient-ref-instant-yeast` | Retain as instant yeast. |
| `recipes/076-pate-a-pizza-pizza-dough-14d20789-1967-432a-b9bc-0319599ffbd3.v1.json:50-52` | `14d20789-1967-432a-b9bc-0319599ffbd3-ingredient-3` | Ingredient is yeast; `ingredientName: yeast`; `ingredientRefId: ingredient-ref-yeast` | Retain as commercial yeast. |

No line-level relink or recipe-link recommendation follows from those controls.

## Source search and access limits

All linked pages below were opened on 2026-10-10. Source IDs were assigned after confirming that the prefix had no current ledger or proposal/batch collision.

| ID | Direct source | Evidence used and limits |
|---|---|---|
| **WP02-E-STARTER-STATE-20261010-S01** | Office québécois de la langue française, [levain (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8887672/levain) | Preferred term `levain`; definition covers flour dough fermented or mixed with yeast and describes broader bakery uses. The page is dated 1983, so it establishes the official term and ambiguity, not a modern exact EN `sourdough starter` crosswalk. |
| **WP02-E-STARTER-STATE-20261010-S02** | SAE de la Capitale / École hôtelière de la Capitale, [Boulangerie 102 – Levain](https://saedelacapitale.cssc.gouv.qc.ca/formations/boulangerie-102-levain-et-viennoiseries/) | Québec culinary training uses `levain naturel`, `démarrage de son propre levain`, and `panification au levain naturel`. The listed May 2026 course date has passed; this page is used only for local terminology, not course availability. |
| **WP02-E-STARTER-STATE-20261010-S03** | Révolution Fermentation, [Comment faire du levain maison](https://revolutionfermentation.com/blogs/tempeh-soya-cereales/comment-faire-son-levain-maison/) | Defines `levain chef` as the retained base; `levain tout point` as the refreshed levain used to make bread; and `levain écarté` / `rejet` as the portion removed before refresh. It is a Québec fermentation seller/educator, not a government terminology authority. The source includes recipe-specific amounts elsewhere; none are carried into this packet. |
| **WP02-E-STARTER-STATE-20261010-S04** | King Arthur Baking, [Sourdough Pizza Crust](https://www.kingarthurbaking.com/recipes/sourdough-pizza-crust-recipe) | Separates a `Levain` component from `Dough`, builds the former from ripe starter and other recipe inputs, then uses it in the dough; surplus may be saved or discarded. This is one US recipe’s structure, not a generic formula or Québec term standard. |
| **WP02-E-STARTER-STATE-20261010-S05** | King Arthur Baking, [What is sourdough discard?](https://www.kingarthurbaking.com/blog/2024/04/18/sourdough-discard) | Defines discard as the portion removed during routine maintenance and not fed in that step; some recipes use it mainly for flavor while other bread recipes can use unfed starter. The source also gives recipe adaptation advice, but no quantities or substitution guidance are adopted here. |
| **WP02-E-STARTER-STATE-20261010-S06** | Révolution Fermentation Canada, [Levain déshydraté en poudre](https://shop.revolutionfermentation.ca/products/levain-poudre-deshydrate) | A product made by a Québec bakery is named `levain déshydraté` / `levain en poudre`, lists flour with bacteria and yeast culture, and links an activation manual. This directly supports a product-specific reactivatable dried-culture form, not all products called dried levain or powder. |
| **WP02-E-STARTER-STATE-20261010-S07** | Révolution Fermentation, [Manuel du levain déshydraté](https://revolutionfermentation.com/fra/blogs/tempeh-soja-cereales/manuel-levain-deshydrate/) | Manual is expressly for the seller’s dehydrated starter; its activation procedure rehydrates and refreshes the culture before use as bread levain. Product-specific; do not generalize its steps, amounts, or timing. |
| **WP02-E-STARTER-STATE-20261010-S08** | Revolution Fermentation Canada, [Dehydrated Sourdough Starter](https://shop.revolutionfermentation.com/products/dehydrated-sourdough-starter) | English Canada product counterpart calls it a dehydrated sourdough starter culture and links activation instructions. Confirms EN label wording for the same product, not an independent second product. |
| **WP02-E-STARTER-STATE-20261010-S09** | Priméal, [Lev’Blé Bio](https://primeal.bio/fr/nos-produits/farines-aides-a-la-panification/aides-a-la-panification/levble-bio-260g/) | Product composition names dehydrated, devitalized wheat levain plus selected yeast; manufacturer preparation instructions mix it directly into bread dough. This is a boundary example only and is not a Québec wording source. |
| **WP02-E-STARTER-STATE-20261010-S10** | Puratos Canada, [Levain](https://www.puratos.ca/fr/boulangerie/categories/sourdough) | Manufacturer distinguishes its powdered sourdough-flavor solution from an active sourdough-based baking ingredient. This shows why `powder` alone does not establish viable culture or reactivation. It is an industrial product taxonomy, not a household starter standard. |

**Access limits:** the OQLF record is old; the local `levain chef`, `levain tout point`, `levain écarté`, and `rejet` evidence comes from one Québec fermentation educator rather than a terminology ruling. King Arthur is a US culinary source. Priméal is a French manufacturer. The dried-starter label and activation behavior are directly evidenced for one Québec product only. No government or OQLF equivalence for `sourdough discard` or `levain build` was found in this review. No quantities, ratios, hydration values, yields, or yeast-equivalence claims were imported from the sources.

## Merge-ready outline and remaining checklist work

If the coordinator accepts this packet:

1. Leave `ingredient-ref-sourdough-starter` and its current EN/fr-CA names unchanged; add only FR alias `levain chef` if the source-supported synonym is accepted. Keep bare `levain`, `levain tout point`, `levain écarté`, and `rejet` out of global aliases.
2. Add a candidate form under the existing starter reference with `formCode: dehydrated_reactivatable`, EN label `dehydrated sourdough starter`, and FR label `levain naturel déshydraté`. Keep `matchTermsEn` and `matchTermsFr` empty until a recipe or exact product line confirms that the culture is intended for reactivation. Do not map a devitalized product to this form.
3. Keep recipe-built levain and discard/activity state as recipe-specific preparation/state; add no new ingredient identity, generic form, or recipe link without an exact line and its source context.
4. Keep all measurements, hydration, unit mappings, densities, yields, conversions, activity thresholds, and sourdough-to-yeast substitutions unset.

## Coordinator disposition — 2026-10-10

Accepted the source-attested `levain chef` French alias for the maintained starter and the
`dehydrated_reactivatable` form with labels `dehydrated sourdough starter / levain naturel
déshydraté`. The form has no additional match terms, density, measurement, conversion, or
substitution. The product manual directly documents rehydration and refresh; the term remains
product-qualified because devitalized sourdough products are also sold. No bundled starter lines
were found, so no recipe links were added. Recipe-built levain and discard remain context states;
bare `levain` remains out of aliases. The current French display and alias still need independent
Québec terminology review. Integration and verification are recorded in
[`wp02-sourdough-state-form-integration-20261010`](../batches/wp02-sourdough-state-form-integration-20261010/README.md).
