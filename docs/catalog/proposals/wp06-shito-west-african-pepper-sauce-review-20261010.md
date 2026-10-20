# WP06 Section Z — Ghanaian shito and West African pepper-sauce boundary review

- **Date:** 2026-10-10
- **Status:** Proposal only. Recommend one source-bounded shito identity; no shared catalog, ledger, recipe, code, test, plan, or roadmap changes are made.
- **Scope:** Ghanaian shito plus directly adjacent, source-named Ghanaian fresh pepper sauces, pepper produce, and shito mixes. This is not a survey of West African sauces generally.
- **Decision owner:** Catalog coordinator. Recheck the live package before any later integration.

## Recommendation

Add one distinct `SAUCE_AND_CONDIMENT` identity for **shito (Ghanaian pepper sauce)**. Ghana’s standards authority lists a dedicated specification titled “Shito (Pepper Sauce)”; Ghana’s Food and Drugs Authority lists `Pepper Sauce`, `Shito`, and `Shito Mix` separately among non-emulsified sauces and dips; and Ghanaian university research describes shito as a locally and commercially prepared condiment. This evidence supports a named culinary product even though the bundled recipes currently have no shito demand.

Suggested identity-only record, subject to the coordinator’s independent localization review:

| Field | Proposal | Confidence and limit |
|---|---|---|
| ID | `ingredient-ref-shito` | Free in the live reference and legacy-ID snapshot below; recheck at integration. |
| Category | `SAUCE_AND_CONDIMENT` | Compound sauce/condiment, not a fresh pepper or dry pepper spice. |
| English display | `shito (Ghanaian pepper sauce)` | High confidence for the Ghana-specific product class. |
| French display | `shito (sauce au piment ghanéenne)` | Provisional descriptive fr-CA wording, not an OQLF or other Québec-authority term. Keep the source name `shito`. |
| English alias | `shito sauce` | Direct descriptive spelling for the same Ghanaian condiment. |
| French aliases | None | No Québec French alias is supported by this review. |
| Forms / numeric data | None | The sources document changing recipes and distinct mixes, not standardized preparation forms or values. |

Do not add generic `pepper sauce`, `hot pepper sauce`, `chili sauce`, `chili oil`, `black pepper sauce`, `ground pepper`, or `black pepper` as aliases. GSA’s title uses “pepper sauce” to describe the named Ghanaian shito standard; it does not make all pepper sauces, black pepper, or chili products the same ingredient. The FDA list names pepper sauce separately from shito. No broad West African equivalence is inferred.

## Product boundary and named neighboring items

| Term or product | Finding | Disposition |
|---|---|---|
| **Shito** | Ghana’s GSA publishes a dedicated `Shito (Pepper Sauce)` specification title. KNUST and CSIR-Food Research Institute material treat shito as a prepared pepper condiment, including commercially sold and vegetarian versions. | Propose one shito identity. The sources do not establish a single universal recipe or require every product to contain fish or shrimp. |
| **Fish, shrimp, and other seafood in shito** | Common product and research formulations may include fish and/or shrimp powder, but ingredient choices vary. CSIR-FRI documents vegetable shito for vegetarian consumers; a Ghanaian maker lists separate fish/shrimp and vegan dry-mix products. | Keep named fish, shrimp, pepper, oil, and spice components as separate recipe ingredients when a recipe calls for them. Do not bake a mandatory seafood composition, allergen claim, or substitution into the shito identity. A recipe-specific shito label does not make its ingredients aliases of shito. |
| **`Shito Mix` / instant shito powder mix** | FDA’s category list names `Shito Mix` separately. One Ghanaian manufacturer’s instant powder is hydrated, mixed with oil, and heated before use; the same maker offers a different plant-based mix. | Do not make this an alias or form of ready-to-use shito. Hold as a separate dry compound-seasoning candidate until there is broader product/recipe demand and a stable product definition. The maker’s instructions are product-specific, not a universal preparation rule. |
| **Fresh pepper sauce / `mako`** | A University of Ghana project describes an unheated fresh tomato-and-pepper sauce, with names including `ground pepper`, `mako a yanyam`, and `mako red`. It is a fresh raw sauce in that source, distinct in state and composition from a cooked commercial shito. | Keep separate from shito. Do not add `mako`, `mako red`, or `mako a yanyam` as shito aliases. `Mako` can also name pepper produce, and this pass found no independent Québec terminology evidence or bundled recipe demand sufficient to add a global mako identity. Retain as a source-local future candidate. |
| **`shitor tsulu` / `kpakpo shito`** | A KNUST thesis reports red and green ground, fresh shito variants while citing earlier work. The terms are not established here as cross-regionally stable commercial names. | Keep source-local; no alias or separate catalog row now. Do not use `kpakpo shito` as a shito alias. |
| **Green Kpakpo Shito Pepper** | A Ghana government procurement notice names this as a pepper item separately from dry pepper, tomatoes, onion, and ginger. The compound phrase refers to fresh pepper produce in that notice, not a prepared sauce. | Do not alias the fresh pepper to shito. A future pepper-identity review can assess it independently; this review makes no botanical species claim. |
| **`Shitor` / `shitor din`** | The reviewed primary GSA/FDA names use `shito`; the available secondary naming claims do not establish `shitor` or `shitor din` as a globally safe spelling for the prepared product. | No global alias. Preserve exact source spelling when a recipe or product label uses it. |
| **Other West African pepper sauces/seasonings** | No additional named item met this review’s standard for a regional identity decision from direct regional product/institutional evidence. | No broad “West African pepper sauce” identity or synonym cluster. This does not close the wider Section Z checklist. |

## Live package audit

Counts and hashes were read from the live worktree on 2026-10-10 before drafting. Hashes cover exact file bytes. The recipe aggregate follows `manifest.recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, the exact recipe bytes, and another NUL byte. This snapshot will go stale as shared work continues.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 705 references | 222,813 | `d440179e59ff9e94d6c91f29a8932e79893917a9c8142fa93cd3adcf11fa04d2` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 34 forms | 23,272 | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `docs/catalog/legacy-import-identities.v1.json` | 84 candidates | 20,087 | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| `docs/catalog/research-ledger.v1.json` | 894 records | 1,823,347 | `3d834b3550480998f2481620e91c0b4a4e3f5ac795843a748f2f83312929fa22` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient lines | — | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |

The exact normalized-key audit used the package’s NFKD/accent-folding and punctuation/whitespace normalization for all candidate English and French terms in this packet, compared against every active reference display/alias, all form labels/match terms, and all legacy display/alias names. No shito-family, mako-sauce, or shito-mix exact owner was found. The one exact collision among broad boundary queries is `ground pepper`, already an English alias of `ingredient-ref-black-pepper`; it is not a shito or sauce phrase. Other relevant active neighbors include `ingredient-ref-dried-shrimp`, `ingredient-ref-atlantic-herring`, `ingredient-ref-chili-powder`, `ingredient-ref-red-chili-flakes`, and several distinct fresh pepper/spice rows. None is proposed for modification.

The ledger has no shito-family record or source ID for this proposal. The literal `Mako` appears in two unrelated ledger source titles for Québec fonio products from Mako Foods (`WP02-S96` and `WP02-S97`); those are not the Ghanaian sauce term. No existing proposal or batch has a dedicated shito, kpakpo-shito, or shitor decision. Prior Section Z/African packets cover other categories and do not resolve this condiment boundary. The target proposal path and `ingredient-ref-shito` were free at this snapshot; the proposal-local source-ID prefix `WP06-SHITO-20261010-S` was also absent from the ledger and catalog proposal/batch files.

## Recipe demand

All 114 manifest-listed recipe files and all 1,123 `ingredients[]` records were scanned. There are **zero shito-family, shito-mix, kpakpo-shito, mako-sauce, or fresh-pepper-sauce ingredient-line matches**, and no matching full recipe file. The broad boundary phrase `ground pepper` matches one unrelated line in the pizza-sauce recipe; that existing line is mapped to black pepper and does not express demand for a fresh pepper sauce. No recipe link or recipe text change is proposed.

## Measurement, form, and substitution disposition

No density, household conversion, package yield, ingredient form, recipe link, or substitution rule is proposed. Product recipe and safety studies do not establish a shito-wide conversion or substitute. Fish/shrimp and plant-based preparations are recipe/product composition choices; one must not be automatically substituted for another. Any later substitution review would need a specific recipe role, dietary constraint, exact product, and direct evidence.

## Sources

Sources were accessed on 2026-10-10. Each source supports only the claim stated here. No safety, shelf-life, nutrient, or preparation instructions are adopted from research whose subject was microbial quality.

| ID | Source | Claim used and limit |
|---|---|---|
| **WP06-SHITO-20261010-S01** | Ghana Standards Authority, [official standard notice](https://www.linkedin.com/posts/ghana-standards-authority_standard-shito-peppersauce-activity-6924670620886552577-pI4E); also [2018 Catalogue of Ghana Standards](https://www.gsa.gov.gh/wp-content/uploads/2018/08/2018-Catalogue-of-Ghana-Standards.pdf) | GSA names a dedicated `Specification for Shito (Pepper Sauce)`. The 2018 catalogue lists GS 240:2017 while a later GSA post calls it GS 240:2019; this review relies only on the named product/specification title and does not infer the current edition or unseen formula requirements. |
| **WP06-SHITO-20261010-S02** | Ghana Food and Drugs Authority, [Food Product Category & Parameter Requirements for Food Product Registration](https://fdaghana.gov.gh/wp-content/uploads/2024/02/LOCAL-PARAMETERS-1.pdf), effective 2021, pp. 14–15 | Under non-emulsified sauces and dips, lists examples including `Pepper Sauce`, `Shito`, and `Shito Mix`. The category list supports separate named product terms; it does not define formulas or establish alias equivalence. |
| **WP06-SHITO-20261010-S03** | Blessed Koomson, KNUST, [Evaluation of Filamentous Mould and Aflatoxin Contamination in Processed Bottled “Shito” Sold in the Tema Metropolis](https://ir.knust.edu.gh/items/45ee21cc-1992-4d3c-ad17-3402a0849dd7/full), MSc thesis (2017), abstract and §2.8 | Describes shito as a Ghanaian hot black pepper sauce made from fish and blended spices and examines locally/commercially prepared bottled products. Used for product identity only; no findings about contamination or safety are adopted. |
| **WP06-SHITO-20261010-S04** | Ackah et al., CSIR-Food Research Institute, [“Validating a HACCP System for the Production of Vegetable Shito”](https://researchspace.foodresearchgh.org/bitstream/1/1305/1/JFQ_2018_Ackah_et%20al.pdf), *Journal of Food Quality* (2018), DOI 10.1155/2018/7146040 | Calls vegetable shito a pepper-sauce product developed for vegetarian consumers. Supports that some shito products omit animal ingredients; it does not establish one universal recipe. |
| **WP06-SHITO-20261010-S05** | Suomo’s Food Products, [product descriptions for Instant Shito Powder Mix and Vegan Instant Shito Powder Mix](https://www.suomosfoods.com/products) | One Ghanaian maker’s product-level evidence: separate conventional and vegan powders are hydrated and then cooked with oil. Supports keeping a named dry mix and ready sauce distinct; no category-wide formulation or preparation rule is inferred. |
| **WP06-SHITO-20261010-S06** | Ebenezer Kwesi Essel, University of Ghana, [Microbial Quality and Safety of Fresh Ready-to-Eat Red Pepper Sauces Consumed as Condiments with Street Vended Foods in the Accra Metropolitan](https://www.researchgate.net/publication/384879474_MICROBIOLOGICAL_QUALITY_AND_SAFETY_OF_FRESH_READY-TO-EAT_RED_PEPPER_SAUCES_CONSUMED_AS_CONDIMENTS_WITH_STREET_VENDED_FOODS_IN_THE_ACCRA), BSc project (2019), §2.3 | The author’s Ghana market review names fresh unheated sauces `ground pepper`, `mako a yanyam`, and `mako red`, describing fresh tomato and pepper as their base. Used to distinguish fresh sauce from cooked shito, not to establish global aliases or a standardized formula. This copy is author-uploaded, not an institutional repository page. |
| **WP06-SHITO-20261010-S07** | Ghana Electronic Procurement System, [Green Kpakpo Shito Pepper tender lot](https://www.ghaneps.gov.gh/epps/cft/prepareViewCfTWS.do?resourceId=1701267) | A Ghana public procurement notice lists `Green Kpakpo Shito Pepper` as a pepper item alongside separate dry pepper and aromatics. Supports the produce-versus-sauce distinction only; it does not identify species or endorse a sauce alias. |
| **WP06-SHITO-20261010-S08** | Koomson, KNUST thesis above, §2.8, quoting Mensah et al. (2002) | Reports fresh ground sauce variants `shitor tsulu` (red) and `kpakpo shito` (green). Because this passage cites earlier literature and no source in this packet independently establishes their exact scope, the names remain source-local and inactive. |

## Next actions

1. At any integration review, reread the live package and repeat the normalized active-reference, form, legacy, ledger, source-ID, and manifest recipe scans.
2. If accepted, add only the shito identity and narrowly supported `shito sauce` English alias. Leave generic pepper/chili sauce, `mako`, `mako red`, `mako a yanyam`, `shito mix`, `shitor`, `shitor din`, `shitor tsulu`, and `kpakpo shito` out of global aliases.
3. Keep any recipe-specific fish, shrimp, plant-based, powder-mix, and fresh-pepper sauce names attached to their exact source/product context. No cross-substitution is justified by this evidence.
4. Seek independent Québec French terminology review before treating the proposed French display as established. The wording in this packet is descriptive and provisional.
5. Continue the wider Section Z condiment checklist separately; this packet closes only the shito identity and adjacent naming boundary.

This proposal does not integrate or close the wider WP06 African or Section Z checklist.
