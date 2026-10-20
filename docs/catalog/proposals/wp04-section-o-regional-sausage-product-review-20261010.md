# WP04 Proposal: Chorizo, Andouille, and Kielbasa Product Boundaries

- **Review date:** 2026-10-10
- **Status:** Proposal only; no catalog, ledger, recipe, plan, code, or test files changed.
- **Scope:** Review the open WP04 Section O regional sausage identities for chorizo, andouille, and kielbasa against the current bundled recipe package, active references, forms, legacy candidates, and source-backed Québec/Canadian terminology.
- **Recommendation:** Keep all three families out of the active catalog for now. The 114-recipe corpus contains no ingredient row for any of them. The evidence supports some useful future bilingual labels, but it also shows that a bare family name can cover materially different products and states. Do not add aliases, forms, recipe links, measurements, substitutions, or ledger findings from this packet.

The open checklist is in [WP04 Section O](../../RecipeBook-global-ingredient-catalog-plan.txt). This review does not reopen the existing [breakfast-sausage audit](wp04-section-o-sausage-family-gap-review-20261010.md) or the already integrated `ingredient-ref-merguez-sausage`; both are explicitly out of scope. The current Section O checklist remains open.

## Disposition

| Family | Corpus demand | Source-backed fr-CA wording to retain for a future, scoped review | Current decision |
| --- | --- | --- | --- |
| Chorizo | None | OQLF supports `chorizo` in French and English for a Spanish pork sausage, most often dried and smoked. For a line that explicitly names the Spanish product, `chorizo espagnol` / `Spanish chorizo` is a source-backed candidate label. | Do not add a global `chorizo` reference or alias yet. Current Québec product listings use the name for both a cooking sausage and a chorizo-style dried sausage; a future generic line needs its source/product boundary first. No Mexican or other regional definition is proposed here. |
| Andouille | None | OQLF’s preferred French term for its French charcuterie entry is `andouille`. Louisiana’s Cajun product is also called `andouille`; `andouille cajun` is a provisional descriptive fr-CA label only when an exact source establishes that Louisiana/Cajun scope. | Keep French and Cajun products distinct. Do not add bare `andouille`, `chitterlings`, or a cross-family alias. The old OQLF entry and current market pages do not establish one shared product class. |
| Kielbasa | None | OQLF’s Québec French term is `saucisse kielbassa`; its English entry lists `kielbassa sausage`, `kielbasa`, and `kielbasy`. | Keep inactive until a recipe or bounded product request supplies demand and preparation scope. Do not include `kolbassa sausage` as an alias; OQLF lists it only as an associated term, and current products show why the neighbouring names should not be collapsed. |

An active reference for these families is not justified by source availability alone. The product examples below support terminology review, not a universal ingredient identity. They do not support a measure, preparation form, conversion, substitution, food-safety conclusion, or recipe link.

## Snapshot and corpus audit

The audit read every recipe path in `manifest.v1.json`, inspected each ingredient row and every string in the recipe JSON, then searched the active references, forms, legacy identity candidates, and research ledger. Family search terms were case-insensitive variants of `choriz*`, `andouill*`, `kielb*`, `kiełb*`, and `kolbas*`. Generic sausage terms were used separately to identify unrelated corpus hits.

| Artifact | Snapshot count | SHA-256 |
| --- | ---: | --- |
| [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe files | 114 files; 1,123 ingredient rows | Aggregate `14dfd496bf7d6c3d93b191a722af1d5795d2432621049c303a3d7f5e20b373b0`* |
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 872 references | `4af290779e837b1e3562296bcbde3928c7079e7c0e94a9a30372f88e58f1307c` |
| [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 48 forms | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| [Legacy identity candidates](../legacy-import-identities.v1.json) | 78 candidates | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| [Research ledger](../research-ledger.v1.json) | 1,118 records | `17b9c3db25ff6ed280a914c7432084e29b799f73c182d588ebe2601932252fcc` |

\*The recipe aggregate is SHA-256 over one line per recipe in manifest order: the manifest-relative path, a NUL byte, the SHA-256 of that recipe file’s raw bytes, then a newline. This defines the aggregate independently of JSON reformatting tools.

### Exact recipe demand

There are **zero** chorizo, andouille, or kielbasa ingredient rows, recipe text mentions, or saved recipe links in the manifest-listed corpus. The target strings also produce zero matches in active references, forms, legacy candidates, and ledger records. The only sausage-related ingredient row found by the separate generic-term scan is:

| Row | Saved evidence | Disposition |
| --- | --- | --- |
| `027#1` — [Breakfast Casserole](../../../app/src/main/assets/seed/bundled-library/recipes/027-casserole-dejeuner-breakfast-casserole-9015696d-4126-49ee-91f5-578d66061fd9.v1.json), ingredient ID `9015696d-4126-49ee-91f5-578d66061fd9-ingredient-1` | `originalText: "1 lb breakfast sausage"`; `ingredientName: "breakfast sausage"`; `ingredientRefId: "ingredient-ref-breakfast-sausage"`; quantity `1`, unit `lb`. | Outside this review. Keep the existing link and saved line as covered by the separate breakfast-sausage audit. |

Recipe `102`, [Saucissons de chocolat / Chocolate Sausage](../../../app/src/main/assets/seed/bundled-library/recipes/102-saucissons-de-chocolat-chocolate-sausage-bd3f9152-5ea3-44c3-ad79-8f4d7624f07d.v1.json), uses “sausage” in the English title and confection instructions, but its eight ingredient rows describe a chocolate-and-cookie log; it is not meat-sausage demand. The remaining generic meat-sausage wording is recipe `027`’s breakfast-sausage line and instructions, which are out of scope here.

The active catalog currently contains `ingredient-ref-breakfast-sausage` and `ingredient-ref-merguez-sausage`; these are exclusions, not candidate rows in this review. No active reference, form, legacy candidate, or ledger record matched the three target families. There is no appropriate existing form to relink or extend.

## Family boundaries and terminology decisions

### Chorizo

The OQLF’s food-domain GDT entry, last updated in 2009, defines chorizo as a Spanish pork sausage that may also contain beef, seasoned with garlic and red pepper, and most often dried and smoked. It gives `chorizo` as both the preferred French term and the English equivalent. This is adequate evidence for the lexical form and a Spanish-style product boundary, but not for treating every product sold as chorizo as one preparation or formula.

Current Québec product evidence shows the boundary problem:

- The Québec Food Directory lists a four-sausage “The Sausage Guys Chorizo” SKU, 325 g minimum, with a one-sausage 75 g nutrition basis. The product record lists pork, water, spices, and casing and says to keep frozen until cooking with pan/oven/BBQ directions. The same record also says “Serving as is: Yes,” so it does not cleanly establish the product’s sale state. Its page states that the data come from GS1 and disclaims MAPAQ responsibility for accuracy; use it as a product-label example, not a general standard.
- A different Québec Food Directory product is “La Picouille,” a 70 g dried sausage described as “chorizo style” with chipotle. Ingredients are unavailable. Its product-specific `chorizo style` wording is not evidence that `chorizo` is a synonym for every dried sausage or that chipotle is an identity qualifier.
- A Québec butcher’s current listing uses the more explicit name `Saucisse de porc ESPAGNOLE – CHORIZO`, which supports `chorizo espagnol` as a descriptive French label when the recipe source names that variant.

**Decision:** Do not add a broad `chorizo` entry or attach `saucisse chorizo`, `chorizo style`, or `Spanish chorizo` as global aliases. If a future recipe explicitly specifies Spanish chorizo, the source-backed candidate pair is `Spanish chorizo` / `chorizo espagnol`; use only aliases the recipe’s source and product evidence support. If the line says only `chorizo`, resolve the source’s intended product before linking. This review makes no claim about Mexican or other regional chorizos.

### Andouille

The OQLF GDT entry, last updated in 1983, gives the preferred French term `andouille` for a French charcuterie made in a large pork casing with strips of intestine and stomach from the same animal. It says the product can be sold cooked (including smoked andouille de Vire) or raw. The entry lists `chitterlings` and `andouille` as English terms; that historical translation does not establish `chitterlings` as a safe global English alias for every item called andouille today.

The Louisiana Department of Culture, Recreation and Tourism describes a different, Cajun product: pork butt, shank, and fat seasoned with salt, garlic, and cracked black pepper, traditionally smoked over pecan wood and sugar cane. Its French-language cuisine article describes andouille as a Cajun pork product preserved using salt and smoke. This supports a Cajun-specific source boundary and a provisional transparent French qualifier `andouille cajun`; it does not make that product identical to the OQLF’s French offal-based andouille.

Québec-market evidence confirms the French product name exists locally but does not settle its composition: a Québec charcuterie distributor lists `Andouille` under `Spécialités françaises` for a producer whose page describes its work as a homage to French charcuterie. The listing gives no product ingredients or preparation. Conversely, a Canadian retailer page titled `Andouille Sausage` describes the product as one of its “premium Italian sausages” and gives a pork formula and cook instructions. That is evidence of inconsistent market use, not authority for a Québec identity or a Cajun/French synonym.

**Decision:** Keep French and Cajun product boundaries separate. Do not add bare `andouille` as one global catalog identity, and do not add `chitterlings` as an alias. For an exact source-confirmed Cajun recipe line, `Cajun andouille sausage` / provisional fr-CA `andouille cajun` is a reasonable candidate for a separate review; for a French product line, retain the OQLF-supported `andouille` spelling and require product/cut evidence before adding an identity. The earlier [WP06 North American review](wp06-north-american-cuisine-gap-sweep-20261009.md) already leaves an external gumbo-source mention unresolved pending product definition and Québec French evidence; this packet adds bounded source evidence without creating a recipe link or changing that review’s disposition.

### Kielbasa

The OQLF GDT search record `saucisse kielbassa`, last updated in 1990, gives French preferred term `saucisse kielbassa`; its English terms are `kielbassa sausage`, `kielbasa`, and `kielbasy`. It defines the item as an “uncooked smoked sausage” and separately lists `kolbassa sausage` as an associated term. The OQLF page was visible in the search result, but a direct page open returned a cache miss during this review; treat the entry as terminology evidence only, with that retrieval limit.

A current Québec producer’s `Kielbassa` product page says it is Polish-origin, already cooked and ready to eat, offers `Nature` and `Fumé` variants, and lists bison and pork among the ingredients. The page renders both variants as out of stock at access time. This is a single source/product configuration, not a universal definition; its cooked state also differs from the old OQLF definition. The spelling in the local product title is `Kielbassa`, while the OQLF English record lists both `kielbassa` and `kielbasa` forms.

**Decision:** Do not create a catalog row without exact recipe or product demand. If later activated for a specifically source-backed kielbassa/kielbasa line, the best current bilingual candidate is English `kielbassa sausage` / fr-CA `saucisse kielbassa`, with English aliases `kielbasa` and `kielbasy` supported by the OQLF record. Do not add `kolbassa sausage` as an alias: OQLF marks it associated, not equivalent, and its regional/product use remains unresolved. Do not encode smoked, uncooked, cooked, species, or preparation as a universal form from these sources.

## CFIA scope and remaining boundary

The CFIA’s current *Canadian Standards of Identity: Volume 7 — Meat Products* (last amended 2024-12-18) distinguishes broad classes such as ready-to-eat sausage, uncooked/breakfast/dinner sausage, sausage meat, and preserved/cured sausage in Table 2. A text search of that document found no entry for `chorizo`, `andouille`, or `kielbasa`. It therefore provides useful general classes but no specific Canadian identity, fr-CA name, ingredient formula, or state rule for the three regional names under review. This finding should not be read as a regulatory determination about product labelling beyond the cited standard.

## Integration boundary

No integration is justified in this snapshot:

1. Add no active references or aliases for chorizo, andouille, or kielbasa; the current corpus contains no exact ingredient demand and the product boundaries are not interchangeable.
2. Add no ingredient forms, recipe links, unit mappings, measurements, conversions, substitutions, or count/portion evidence. The product examples’ individual sizes or preparation notes stay source-specific and are not transferable to recipes.
3. Add no ledger identity findings from this proposal. Preserve the already accepted breakfast-sausage and merguez work without modification.
4. Keep the WP04 Section O sausage checklist open. Revisit only when a saved recipe row or other bounded user requirement identifies the product family and source version clearly enough to choose among regional and preparation boundaries.

## Sources

All online sources were accessed **2026-10-10**. Product listings are examples of specific market names and formulations; they are not generalized identities.

| ID | Source | Evidence used and limit |
| --- | --- | --- |
| **S01** | CFIA, [Canadian Standards of Identity: Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7) | Current incorporated standard; Table 2 lists broad sausage state/product classes. Full-page search returned no occurrence of the three regional names. Not a specific regional product definition. |
| **S02** | OQLF, [chorizo (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502256/chorizo) | Food/charcuterie entry, updated 2009; preferred French `chorizo`, English `chorizo`, and Spanish-product description. The note says varieties and shapes vary. |
| **S03** | Québec Food Directory, [The Sausage Guys Chorizo 4 Sausages 325 g minimum](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223797) | Québec company product record, last updated 2026-09-30; one sausage is the 75 g nutrition basis, product is described as frozen until cooking, and listed ingredients are pork-based. Page identifies GS1 as data source and says MAPAQ is not responsible for accuracy; it also says “serving as is: yes,” so product state is not resolved here. |
| **S04** | Québec Food Directory, [La Picouille dried sausage](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8236599) | Québec product record, last updated 2026-04-09; description says `chorizo style dried sausage` with chipotle. Product ingredients are unavailable; this does not define chorizo generally. |
| **S05** | Saucisserie William J. Walter, [Saucisse de porc espagnole — chorizo](https://www.saucisserie.com/produit/saucisse-de-porc-espagnole-chorizo-copie/) | Current Québec butcher listing uses an explicit Spanish/pork product name; no ingredient list or preservation state is provided on the page. |
| **S06** | OQLF, [andouille (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2092769/andouille) | Food/charcuterie entry, updated 1983; preferred French term `andouille`, a French pork-intestine-and-stomach product, sold cooked or raw. English listing contains `chitterlings` and `andouille`; historical translation only. |
| **S07** | Louisiana Department of Culture, Recreation and Tourism, [Louisiana’s Most Famous Dishes](https://www.explorelouisiana.com/articles/louisianas-famous-dishes) and its [French Cajun/Creole cuisine article](https://www.explorelouisiana.com/articles/nourriture-cajun-ou-creole--quelle-est-la-difference) | Louisiana tourism authority describes Cajun andouille from pork butt, shank, and fat with salt, garlic, and black pepper, traditionally smoked over pecan wood and sugar cane; the French article describes andouille as Cajun pork preserved with salt and smoke. Not a Québec terminology authority. |
| **S08** | Multi-Déli, [Délice de l’artisan product listing](https://www.multideli.com/distributions/nationaux/delice-de-l-artisan-multi-deli-distribution) | Québec distributor page describes the producer’s French-charcuterie background and lists `Andouille` under its products. No composition, preparation, or current inventory details. |
| **S09** | Farm Boy, [Andouille Sausage](https://www.farmboy.ca/products/andouille-sausage/) | Canadian retailer page calls its product an Italian sausage and lists a pork-based seasoning formula with cooking directions. Not Québec-specific and not a Cajun or French identity standard. |
| **S10** | OQLF, [saucisse kielbassa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488249/saucisse-kielbassa) | Search result for the OQLF record updated 1990 shows French `saucisse kielbassa`, English `kielbassa sausage`, `kielbasa`, `kielbasy`, and associated `kolbassa sausage`; definition excerpt says uncooked smoked sausage. Direct page retrieval returned a cache miss, so no broader claim is based on the inaccessible record. |
| **S11** | Rustik Bison, [Kielbassa](https://www.rustikbison.ca/products/kielbassa) | Québec producer product page identifies one Polish-origin ready-to-eat product, two `Nature`/`Fumé` variants, ±100 g, and bison/pork ingredients. Both variants were shown out of stock at review time; a single product page cannot define the full family. |

## Local evidence links

- [Manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
- [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Legacy identity candidates](../legacy-import-identities.v1.json)
- [Research ledger](../research-ledger.v1.json)
- [Existing breakfast-sausage audit](wp04-section-o-sausage-family-gap-review-20261010.md)
- [Existing Andouille follow-up](wp06-north-american-cuisine-gap-sweep-20261009.md)

**Search/access limitation:** The OQLF kielbassa page returned a search excerpt but a direct page-open request failed with a cache miss. The Québec Food Directory identifies the Sausage Guys chorizo record as GS1-fed and includes internally mixed serving-state metadata. Rustik Bison’s Kielbassa page displayed both variants as out of stock. These limits are why the packet records terminology/product examples as candidates and recommends no active catalog integration.
