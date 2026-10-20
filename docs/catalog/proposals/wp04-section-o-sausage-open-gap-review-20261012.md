# WP04 Section O sausage-family open-gap review — 2026-10-12

**Status:** Review completed; no catalog data change was supported by the current recipe corpus. Root recorded the completed review in the Section O checklist and roadmap.
**Scope:** Refresh the open Section O review for generic fresh/cured/smoked sausage, chorizo, andouille, kielbasa, merguez, and other exact recipe-named sausage families. The completed breakfast-sausage, lap-cheong, and blood-sausage decisions are treated as settled boundaries, not reopened here.
**Disposition:** Keep the checklist open and make no catalog additions from this snapshot. The only meat-sausage ingredient row is already owned by `ingredient-ref-breakfast-sausage`; `ingredient-ref-merguez-sausage` is already accepted and has no recipe demand. The existing chorizo/andouille/kielbasa hold is sufficient for this corpus. Current standards and Québec evidence reinforce keeping products with different regional names or preparation classes separate until a recipe names a source-bounded product.

The open checklist is in [WP04 Section O](../../RecipeBook-global-ingredient-catalog-plan.txt#L2821). Prior boundaries remain in the [sausage-family demand review](wp04-section-o-sausage-family-gap-review-20261010.md), [chorizo/andouille/kielbasa product review](wp04-section-o-regional-sausage-product-review-20261010.md), [lap-cheong review](wp04-lap-cheong-regional-sausage-boundary-review-20261011.md), and [blood-sausage review](wp04-blood-sausage-regional-boundary-review-20261011.md). This packet adds a refreshed all-recipe and ownership audit plus current source checks; it does not repeat their settled decisions.

## Current snapshot and audit

The review read every `recipeFiles` path in the bundled manifest, searched every recipe string and ingredient row, and checked exact current reference names/aliases plus forms, legacy candidates, and the research ledger. Search terms covered generic English/French sausage and saucisson wording; fresh, uncooked, cured, preserved, and smoked sausage; chorizo; andouille; merguez spellings; kielbasa/kielbassa/kielbasy/kolbassa; lap-cheong and Chinese-sausage wording; blood sausage and related names; and other named families such as bratwurst, frankfurter, wiener, linguiça, longaniza, salami, pepperoni, and tasso. Hits were checked in context.

| Artifact | Current snapshot | SHA-256 |
| --- | ---: | --- |
| [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe files | 114 files; 1,123 ingredient rows; 752,942 raw bytes | Aggregate `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`* |
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,199 references | `f7311d15ffab705a74d47d1835467535722ae12e0c2f33b29d369c16cba2d1a5` |
| [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| [Legacy import identity candidates](../legacy-import-identities.v1.json) | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| [Research ledger](../research-ledger.v1.json) | 1,501 records; 5,066 source entries; 4,135 distinct source IDs | `9e3ed46d91d445fe8ebb37928512973b3300e763644527d29fdcb3004e4a2d0c` |
| Global substitution rules | 0 rows | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Contextual substitution rules | 0 rows | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| [Package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json) | 1 row, for canned black beans | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |

\*Recipe aggregate method: in manifest order, SHA-256 the concatenation of each manifest-relative path, a NUL byte, that recipe file's raw bytes, and a NUL byte. This identifies the exact corpus read without depending on JSON formatting normalization.

### Recipe demand and exact-key ownership

The only matching meat ingredient row is the already-settled breakfast-sausage line. There are no ingredient rows for chorizo, andouille, merguez, kielbasa, generic fresh/cured/smoked sausage, lap cheong, blood sausage, boudin, or another regional sausage family.

| Match | Exact saved evidence | Current owner / disposition |
| --- | --- | --- |
| Recipe `027#1` — [Breakfast Casserole](../../../app/src/main/assets/seed/bundled-library/recipes/027-casserole-dejeuner-breakfast-casserole-9015696d-4126-49ee-91f5-578d66061fd9.v1.json) | `originalText: "1 lb breakfast sausage"`; `ingredientName: "breakfast sausage"`; `ingredientRefId: "ingredient-ref-breakfast-sausage"`; quantity `1`, unit `lb`. French and English instructions refer to the same breakfast sausage. | Keep the existing exact owner and recipe link unchanged. This line does not request a generic or regional sausage identity. |
| Recipe `102` — [Saucissons de chocolat / Chocolate Sausage](../../../app/src/main/assets/seed/bundled-library/recipes/102-saucissons-de-chocolat-chocolate-sausage-bd3f9152-5ea3-44c3-ad79-8f4d7624f07d.v1.json) | “Sausage/saucisson” appears in titles and confection instructions; its ingredient rows describe a chocolate-and-cookie log. | Not meat-sausage demand and has no sausage ingredient-reference link. |

Current exact search ownership is narrow:

| Exact name or alias | Owner |
| --- | --- |
| `breakfast sausage`, `saucisse à déjeuner` | `ingredient-ref-breakfast-sausage` |
| `merguez sausage`, `merguez`, `mergues sausage`, `mergues`, `merghez` | `ingredient-ref-merguez-sausage` |
| Bare `sausage`, `saucisse`, `saucisson`, `fresh sausage`, `uncooked sausage`, `smoked sausage`, `cured sausage`, `preserved sausage`, `chorizo`, `andouille`, `kielbasa`, `kielbassa`, `kielbasy`, `kolbassa`, lap-cheong variants, Chinese sausage, and blood-sausage variants | No active exact-key owner. The settled lap-cheong and blood-product terms remain ledger-only candidates; no chorizo/andouille/kielbasa candidate matched this audit. |

The active breakfast-sausage and merguez references have null default density and empty unit mappings. None of the 86 forms matches or attaches to these sausage families. The sole package-yield row is for canned black beans. No sausage measurement record, package yield, global substitution rule, or contextual substitution rule is present; both active sausage references still have `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`. The saved `1 lb` in recipe `027` is its existing recipe quantity, not a generalized sausage conversion observation.

The active `ingredient-ref-montreal-smoked-meat` is a distinct meat identity; it does not own `smoked sausage` or any sausage-family key. It is not a reason to add a general smoked-sausage alias or form.

## Source scope and open product boundaries

### Fresh, uncooked, preserved, cured, and smoked classes

CFIA Volume 7 places ready-to-eat sausage, salami, wiener, frankfurter, bologna, pepperoni, and related products in a class that must be cured and undergo one or more of smoking, cooking, drying, or fermentation. A separate item groups uncooked sausage, breakfast sausage, and dinner sausage and requires fresh meat inputs. Another item names preserved sausage and cured sausage. The standard therefore distinguishes named product classes and processes; it does not make `fresh`, `cured`, `smoked`, `uncooked`, and `ready-to-eat` synonyms or a universal generic sausage form. OQLF's older general `saucisse` entry describes the Québec term and discusses consumer-facing distinctions between `saucisse` and `saucisson`, but it is terminology evidence, not a current product standard.

No recipe row asks for a generic fresh, cured, or smoked sausage. Keep those descriptors attached to a future exact product/source rather than creating an umbrella row, form, or alias from culinary resemblance. This review makes no cooking, storage, curing, or consumption-safety determination.

### Regional names refreshed against Québec usage

| Family | Current authoritative evidence and limit | Current gap disposition |
| --- | --- | --- |
| Chorizo | OQLF's GDT entry is specifically for Spanish chorizo: a pork sausage that may also contain beef, seasoned with garlic and red pepper, most often dried and smoked, with varied varieties and forms. The Québec Food Directory also has a `Chorizo` link product listing with frozen-until-cooking directions, while that same listing says it can be served as-is; it is product-page evidence with internally mixed state metadata. A separate Québec directory item is named `Saucisson Sec de Porc Chorizo Piquant` and has a 125 g package / 25 g nutrition basis. These are product-specific labels and figures, not a universal chorizo definition or measure. | No recipe demand and no active owner. Do not turn bare `chorizo` into a global row spanning Spanish, Mexican, Québec cooking-sausage, and dry-sausage uses. If a future line appears, bind its exact product and regional meaning first. |
| Andouille | OQLF's 1983 Québec terminology entry describes French `andouille` as pork casing filled with strips of intestine and stomach, sold cooked or raw; the English terms include `andouille` and `chitterlings`. Louisiana's official tourism site separately describes Louisiana andouille as pork butt, shank, and fat seasoned and smoked. These sources concern different regional product descriptions and do not support using `chitterlings` as a catalog-wide alias. | No recipe demand and no active owner. Keep French charcuterie and Louisiana/Cajun uses source-bounded; do not activate bare `andouille`, merge them, or infer a universal state or formulation. |
| Kielbasa / kielbassa | OQLF's 1990 GDT entry prefers Québec French `saucisse kielbassa`; its English terms include `kielbassa sausage`, `kielbasa`, and `kielbasy`, while `kolbassa sausage` is only an associated term. A Québec producer's `Kielbassa` page describes one Polish-origin bison-and-pork product as already cooked and ready to consume, with natural and smoked variants. Its product configuration and approximately 100 g format are not family-wide properties; its cooked description also differs from OQLF's older “uncooked smoked sausage” definition. | No recipe demand and no active owner. Retain the source-bounded spelling evidence for a future exact product; do not add `kolbassa` or encode uncooked, cooked, smoked, species, or package size as generic properties. |
| Merguez | `ingredient-ref-merguez-sausage` is already an accepted OQLF-scoped identity with the exact aliases shown above; its prior decision intentionally adds no formula, species, measurement, or substitution. | No recipe demand. Preserve the accepted reference and aliases without expanding or revisiting that decision. |
| Other named families | The whole-corpus scan found no ingredient row for lap cheong/Chinese sausage, blood sausage/boudin, bratwurst, frankfurter, wiener, linguiça, longaniza, salami, pepperoni, tasso, or another regional family. The lap-cheong and blood-product holds are already documented and remain out of scope here. | No new exact-name candidate or active identity is supported by this package. Keep each named product tied to its own recipe/source if demand later appears. |

The Québec package examples give product-specific nutrition bases and package quantities. They do not define a cross-product piece count, mass, density, conversion, or substitution. There is no measurement or substitution proposal in this packet.

## Proposed boundary

1. Add no active reference, alias, form, density, unit mapping, measurement observation, package yield, conversion, substitution, or recipe link for generic sausage, chorizo, andouille, kielbasa, or another family from this snapshot.
2. Preserve the accepted breakfast-sausage and merguez owners as they stand. Do not reopen the ledger-only lap-cheong and blood-product decisions.
3. Keep the pre-existing source-bounded chorizo/andouille/kielbasa hold. On future recipe demand, use the cited recipe source and product wording to decide if the line names a Spanish chorizo, another regional chorizo, French or Cajun andouille, or a specific kielbassa/kielbasa product before assigning an exact owner.
4. Leave the Section O checklist open. Its remaining work is driven by future exact recipe/product demand and the separately stated rule against inferring cooking, curing, storage, or raw-consumption equivalence.

No tests were run because this is a documentation-only review. The source IDs below are unique proposal-local IDs under the requested prefix; no IDs were added to the research ledger.

## Sources

Online sources were checked on **2026-10-12**. Standards and OQLF entries support only their stated product or terminology scope. Québec directory records and the producer page are individual product examples, not generic definitions.

| ID | Source | Evidence and limit |
| --- | --- | --- |
| **WP04-SECTION-O-SAUSAGE-GAP-20261012-S01** | CFIA, [Canadian Standards of Identity: Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7) and [Normes d'identité canadiennes : Volume 7 — Produits de viande](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-7), Table 2, Part A, items 11, 15, and 17 | Incorporated Canadian standard, last amended 2024-12-18. Separates ready-to-eat sausage and named cured/process classes from uncooked/breakfast sausage and preserved/cured sausage. Does not establish recipe-level interchangeability or safety. |
| **WP04-SECTION-O-SAUSAGE-GAP-20261012-S02** | OQLF, [saucisse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2092765/saucisse) | 1983 food/charcuterie terminology entry for Québec `saucisse` / English `sausage` and its note distinguishing consumer use of `saucisse` and `saucisson`; terminology, not a current product standard. |
| **WP04-SECTION-O-SAUSAGE-GAP-20261012-S03** | OQLF, [chorizo (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502256/chorizo) | 2009 Spanish-product definition and French/English term `chorizo`; the entry notes varied varieties and forms. It does not define every regional or Québec-market product bearing the name. |
| **WP04-SECTION-O-SAUSAGE-GAP-20261012-S04** | Québec Food Directory, [Les Gars de Saucisse Chorizo, 4 sausages, 325 g minimum](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223797) | Product page identifies GS1 as its data source, gives a 75 g nutrition basis, and includes both frozen-until-cooking directions and “Servir comme tel : Oui.” Evidence of one Québec label and its metadata only; do not infer a generic state or conversion. |
| **WP04-SECTION-O-SAUSAGE-GAP-20261012-S05** | Québec Food Directory, [Les Viandes Bio de Charlevoix Saucisson Sec de Porc Chorizo Piquant, 125 g](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8225177) | Individual Québec product listing named as a dry pork chorizo sausage, with a 25 g / 12-slice nutrition basis and product-specific ingredient list. Does not define the entire chorizo family or a recipe quantity. |
| **WP04-SECTION-O-SAUSAGE-GAP-20261012-S06** | OQLF, [andouille (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2092769/andouille) | 1983 French-charcuterie entry describing a pork casing with strips of intestine and stomach and cooked or raw sale; English terms include `chitterlings` and `andouille`. Not a Louisiana product standard or universal alias basis. |
| **WP04-SECTION-O-SAUSAGE-GAP-20261012-S07** | Explore Louisiana, [Where to Find Louisiana's Favorite Dishes](https://www.explorelouisiana.com/articles/louisianas-famous-dishes) | Louisiana tourism-authority culinary description of andouille with pork butt, shank, and fat and traditional smoking over pecan wood and sugar cane. Regional culinary evidence, not a Québec terminology or Canadian identity standard. |
| **WP04-SECTION-O-SAUSAGE-GAP-20261012-S08** | OQLF, [saucisse kielbassa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488249/saucisse-kielbassa) | 1990 Québec French preferred term and English terms `kielbassa sausage`, `kielbasa`, `kielbasy`; `kolbassa sausage` is marked associated, and the definition says “uncooked smoked sausage.” Terminology record only; product-state wording is not assumed universal. |
| **WP04-SECTION-O-SAUSAGE-GAP-20261012-S09** | Rustik Bison, [Kielbassa](https://www.rustikbison.ca/products/kielbassa) | Québec producer page for one Polish-origin, bison-and-pork product described as cooked/ready to consume, with natural and smoked variants and an approximately 100 g format. Product-specific page with no transferable family-wide state, formula, or measure. |

## Local evidence links

- [Section O checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2821)
- [Prior regional chorizo/andouille/kielbasa review](wp04-section-o-regional-sausage-product-review-20261010.md)
- [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
- [Legacy identity candidates](../legacy-import-identities.v1.json)
- [Research ledger](../research-ledger.v1.json)
