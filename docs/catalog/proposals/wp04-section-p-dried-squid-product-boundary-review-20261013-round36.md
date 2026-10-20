# WP04 Section P — dried squid / calmar séché product-boundary review (round 36)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** integrated documentation-only product-state, Canadian/Québec naming, exact-ownership, picker, recipe-demand, numeric-evidence, and substitution review.
- **Recommendation:** Hold dried squid outside the active catalog and forms until a bundled recipe requests it with enough product context. Do not link the fresh/general calamari row to a dried product. Add no reference, alias, form, measurement, recipe link, conversion, yield, or substitution now.
- **Write scope:** This proposal, the active plan, roadmap, and integration batch README. No shared catalog, ledger, recipe, or code file changed.

## Bounded gap and decision

The [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4207) leaves dried fish and seafood states open. The existing [preserved-fish product-state review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) held universal drying forms and says to revisit a named product when a recipe asks for it. The earlier [dried-shrimp and dried-scallop review](wp04-dried-shrimp-scallop-boundary-review-20261009.md) expressly kept dried squid out of those two identities; it did not make a decision for squid. No focused dried-squid packet or active dried-squid owner was found.

This review covers only the product state named **dried squid / calmar séché**. The Canadian Food Inspection Agency (CFIA) has an official bilingual category for export-grade dried squid; a current Québec-facing retailer listing also names a dried-squid product. These sources support reviewing the product boundary, but do not justify a catalog allocation without recipe demand. Do not assign a species to the candidate: the sources do not identify one species across the unqualified product name. Do not generalize one seller's seasoned product to every dried, roasted, shredded, powdered, salted, or otherwise prepared squid product. [S01–S04]

Keep this product state distinct from the current generic **calamari / calmar** identity and its English `squid` alias. The existing recipe line says `140 g sliced calamari`; it contains no dried-state wording. No dried-squid recipe line appears in the manifest corpus. A separate row would make bare `squid` and `calmar` searches return both the existing calamari identity and the dried product. Keep the candidate unallocated until an ingredient line or package establishes the intended state and presentation.

Use **dried squid / calmar séché** as the evidence-backed candidate wording if the gap is revisited. OQLF lists `calmar` and `encornet` as preferred food terms and gives `squid` as the English equivalent [S01]; the CFIA compendium names the export category `Dried Squid / Calmar séché` in its English and French versions [S02]. A Québec-facing Axia Station page uses `Encornet séché` in its title but calls the product `calmar séché` in its description [S03]. Because this review activates no row, it does not decide whether the exact seller wording should become a future alias. Do not add an unqualified `encornet` alias to the current general calamari reference on the basis of that product listing. [S01–S03; prior `wp04-mollusks-shellfish-cephalopods-boundary-review-20261009.md`]

## Exact ownership and prior decisions

Exact normalized-key checks covered every active reference name and alias, every form label and match term, all legacy candidate names and aliases, and ledger record IDs. The pre-integration audit snapshot contains **1,366 active references, 100 forms, 64 legacy candidates, and 1,699 ledger records**.

| Candidate term or ID | Active reference/form owner | Legacy owner | Ledger owner |
|---|---|---|---|
| `dried squid`; `calmar séché`; `calmar seche` | None | None | None |
| `encornet séché`; `encornet seche`; `dried calamari`; `squid jerky` | None | None | None |
| `ingredient-ref-dried-squid`; `candidate-dried-squid` | None | None | None |
| `WP04-SECTIONP-DRIED-SQUID-20261013-R36-S…` | Not applicable | Not applicable | Unallocated; prefix checked against the live proposal, batch, and ledger archive |

The active `ingredient-ref-calamari` is **calamari / calmar** with English alias `squid`, no French aliases, no density or unit mappings, and no attached forms. No form label or match term describes dried squid. Existing squid/calamari is the only active owner of the broad unqualified query. The prior preserved-seafood review keeps broad drying forms inactive, and the earlier dried-shrimp/scallop review lists dried squid only among separately excluded products; neither allocates this candidate.

## Picker projection

The static projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are returned first, with substring fallback only when no phrase result exists. It compares the live reference/form snapshot with a hypothetical separate display-only row **dried squid / calmar séché**, without aliases or forms. No candidate row is active.

| Query | Current result | Hypothetical result | Effect |
|---|---|---|---|
| `dried squid` | None | Dried squid / calmar séché | Exact English product phrase becomes a singleton. |
| `calmar séché` | None | Dried squid / calmar séché | Exact Québec French product phrase becomes a singleton. |
| `squid` | Calamari / calmar | Calamari / calmar plus dried squid / calmar séché | Broad existing search expands from one result to two. |
| `calmar` | Calamari / calmar | Calamari / calmar plus dried squid / calmar séché | Broad French query expands from one result to two. |
| `encornet séché`; `dried calamari`; `squid jerky` | None | None | No alias or broader prepared-product synonym is proposed. |

An exact dried-product query would be useful when a recipe asks for that state, but its bundle has none. Activating a separate row now changes the established broad `squid` and `calmar` picker results while leaving no current recipe line that selects the candidate. Keep it held.

## Bundled recipe demand

The live manifest lists **114 recipe files and 1,123 ingredient rows**. The audit scanned ingredient-row text and identifiers, plus all string fields across the manifest-listed recipe JSON files, for `dried squid`, `calmar séché`, accent-folded `calmar seche`, `encornet séché`, `dried calamari`, `squid jerky`, and related dried-product wording. It found **zero exact dried-squid recipe files or ingredient rows**.

The one nearby row is recipe **023**, ingredient row **1**: `140 g sliced calamari`, linked to `ingredient-ref-calamari`. The recipe title and instructions also refer to calamari rings. This is demand for the current unqualified calamari identity, not evidence for dried squid, a dried-squid product line, or a form link. Do not create a recipe link or change the existing row.

## Product state, numeric limits, and substitutions

The CFIA bilingual compendium's export-grade dried-squid sections 44–45 describe whole, split, cleaned squid and a utility grade that may include pieces; graded export product must have moisture no greater than **22%**. This is a regulatory grading limit for its specified export product, not a universal moisture specification for Canadian retail goods, a rehydration ratio, or a cooking yield. [S02]

Current seller listings illustrate different product contexts. Axia Station lists an in-stock **70 g** LPPZ item; its French page calls it `Encornet séché` in the title and describes `calmar séché` made from fresh squid by drying and seasoning, while its ingredient section provides no declaration. T&T's French product listing names **Calmar Séché Pacific International (200 g)** but supplies no usable recipe or preparation specification in the reviewed listing. These are package weights, not servings or ingredient amounts; the Axia product is seasoned, and its missing ingredient declaration does not establish a universal formulation. [S03–S04]

No reviewed source establishes an exact dried-squid density, household measure, recipe portion, package yield, edible portion, soak ratio, or cooked yield. Leave density and unit mappings empty. Do not derive a conversion from the export moisture limit or from retail package sizes.

No bundled recipe or reviewed source supports a directed replacement between dried squid and fresh/general calamari, seasoned or roasted squid snacks, cuttlefish, fish balls, surimi, fish powder, or another seafood product. Drying, seasoning, cut, and intended use vary; shared squid origin or a similar snack/seafood role does not establish equal amounts or preparation equivalence. Add no global form conversion, contextual substitution, warning rule, or recipe-line substitution link.

## Recommended next action

Keep dried squid unallocated and the Section P preservation checklist open. Revisit when a bundled recipe names dried squid and its source or package resolves whether it means plain whole/split dried squid, a seasoned snack, or another presentation. Then choose whether the evidence supports a form on `ingredient-ref-calamari` or a separately searchable product identity, project the broad `squid` and `calmar` results, and record only recipe-specific numeric evidence. Do not infer species or add substitute rules from the generic product name. This documentation-only hold adds no catalog or ledger data and requires no tests.

## Source register

Sources were accessed on 2026-10-13. IDs are local to this proposal; no shared ledger records were created.

| ID | Source and locator | Evidence used | Limit |
|---|---|---|---|
| **WP04-SECTIONP-DRIED-SQUID-20261013-R36-S01** | Office québécois de la langue française, [GDT: calmar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198881/calmar), `Domaines`, `Termes privilégiés`, English equivalent, and Latin section. | Gives the food-mollusc term `calmar` and English `squid`; the entry lists *Loligo* and *Illex* scope. | Terminology entry last updated 1998; supports the language pair and broad food-name context, not a dried-product standard, recipe, or species assignment. |
| **WP04-SECTIONP-DRIED-SQUID-20261013-R36-S02** | CFIA, [Canadian Grade Compendium: Volume 8 — Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-8), Part 4, §§44–45; [French version](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/recueil-normes-canadiennes-classification-v-4), Partie 4, §§44–45. | The incorporated-by-reference Canadian compendium names `Dried Squid / Calmar séché`; export-grade dried squid sections specify product grading and the 22% maximum moisture limit. | Applies to graded squid for export; it does not define the formulation, species, retail scope, serving, or rehydration behavior of every dried-squid product. |
| **WP04-SECTIONP-DRIED-SQUID-20261013-R36-S03** | Axia Station, [LPPZ Dried Squid, 70 g — English](https://axiastation.ca/products/lppz-dried-squid-70g) and [Encornet séché LPPZ, 70 g — French](https://axiastation.ca/fr/products/calmar-seche-lppz-70g), title, availability, description, and ingredients section. | Current Canadian seller listing shows a 70 g product as in stock; the French title says `Encornet séché`, while its description uses `calmar séché` and describes drying and seasoning. | Retail seller description; ingredients are not listed in the reviewed page. The page does not establish one formulation, species, recipe amount, or general alias. |
| **WP04-SECTIONP-DRIED-SQUID-20261013-R36-S04** | T&T Supermarket, [Calmar Séché Pacific International, 200 g](https://www.tntsupermarket.com/fr/75713201-pacific-intl-dried-squid.html), French product listing and displayed package size. | Current Québec-facing listing uses `Calmar Séché` and a 200 g package size. | Product listing has limited accessible detail; it does not establish species, ingredients, preparation method, serving, or culinary yield. |

