# WP04 Section O blood-sausage regional boundary review — 2026-10-11

- **Packet type:** Proposal-only product and identity boundary review.
- **Scope:** Blood sausage, black pudding, blood pudding, Québec French `boudin` / `boudin noir`, Spanish `morcilla`, and Italian `sanguinaccio`.
- **Disposition:** Keep this Section O item open and hold all new catalog data. The bundled library has no matching recipe demand, and the bounded sources show that these names do not identify one interchangeable product.
- **Changes:** This proposal is the only intended file change. Do not modify shared references, forms, unit mappings, measurement data, substitutions, the research ledger, recipes, plan, roadmap, code, or tests.

The open checklist is in [WP04 Section O](../../RecipeBook-global-ingredient-catalog-plan.txt#L2267). This review follows the earlier [sausage-family demand review](wp04-section-o-sausage-family-gap-review-20261010.md) and [lap-cheong boundary review](wp04-lap-cheong-regional-sausage-boundary-review-20261011.md). It addresses only the still-open blood-product portion of the sausage and offal checklist.

## Recommendation

**Do not add an active reference, alias, form, measure, conversion, yield, or substitution.** No bundled recipe requests any of these products. A Canadian standard and Québec terminology sources offer useful wording for a future exact recipe, but their names overlap differently and the product classes differ in required composition. Regional product specifications also vary by blood species, other ingredients, casing, and state.

Keep the plan item open. Revisit it when an exact recipe line or product requirement identifies the source wording and regional product. Do not equate names by culinary resemblance, infer a universal species or formulation, or infer that a sausage is ready to eat, cured, smoked, shelf-stable, or interchangeable with another product.

## Demand and current package audit

The audit read every path in the bundled manifest, searched each complete recipe JSON (including ingredient rows and localized text), and checked the current references, forms, legacy candidates, ledger, substitutions, and package yields. Search terms included singular and plural forms of `blood sausage`, `black pudding`, `blood pudding`, `boudin`, `boudin noir`, `morcilla`, and `sanguinaccio`, along with general sausage terms.

| Artifact | Current snapshot | Result |
| --- | ---: | --- |
| [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All manifest-listed recipes were scanned. |
| Manifest-listed recipe files | 114 files; 1,123 ingredient rows | No blood-product family term in recipe text or ingredient rows. A separate generic sausage scan found only `027#1` breakfast sausage and recipe `102`’s chocolate-sausage confection; neither is relevant demand. |
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 927 references; SHA-256 `37a74c5144da3e4f0e6d288bd106610cfad1e93f3f8635282ba581104ae8a2b7` | No target name or alias. The existing breakfast-sausage and merguez references are unrelated. |
| [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 51 forms; SHA-256 `a195a0f3b487d193be11cf5648b291f5b51f001ee21cd643af766655dbf28267` | No target form. |
| [Legacy identity candidates](../legacy-import-identities.v1.json) | 76 candidates; SHA-256 `be5ff09fb522c8a36633dbaea66f57e44653c2840da88600f03f943e1bbd9fb0` | No target match. |
| [Research ledger](../research-ledger.v1.json) | 1,185 records; SHA-256 `ec16623e6bab2101a25805640c791474b61ecc16527fb63cfe13f89d2228b372` | No target match. |
| Active substitution files | Global and contextual rule arrays are empty | No blood-product substitution exists or is supported by the recipe corpus. |
| [Package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json) | 1 record | No blood-product yield or package measure. |

These counts and hashes describe the worktree snapshot reviewed on 2026-10-11. The corpus search establishes absence of bundled demand in this snapshot; it does not establish that a named product is unavailable in Québec or Canada.

## Product names and boundaries

### Canadian and Québec naming

CFIA’s incorporated *Canadian Standards of Identity: Volume 7 — Meat Products* was last amended 2024-12-18. Its bilingual Table 2, Part A defines three separate cooked product classes:

- Item 12, **Blood Sausage / Boudin**, requires blood and boneless meat, meat by-product, mechanically separated meat, or a combination; its process is comminuted and cooked.
- Item 13, **Black Pudding / Blood Pudding / Boudin noir**, requires blood; it permits meat or meat by-product among optional ingredients and lists a gelling agent as optional; its process is also comminuted and cooked.
- Item 14, **Blood and Tongue Sausage / Boudin de langue**, requires blood and boneless tongue; it too is comminuted and cooked.

The standard therefore gives Canadian English/French wording, but it does not make the three entries one identity. In particular, the standardized English common name `Blood Sausage` is not the same table entry as `Black Pudding` or `Blood Pudding`. The standard supplies cooked product classes; it does not establish that any of them are cured, smoked, shelf-stable, or ready to eat in a particular recipe context.

OQLF’s GDT entry, authored in 1983, lists `boudin` and `boudin noir` as preferred French terms and gives English terms `blood pudding`, `black pudding`, and `blood sausage`. It also says that, used without a qualifier, `boudin` means `boudin noir`. This is useful Québec lexical support, but it overlaps the separate CFIA product-class names. The current Québec Food Directory has a product-specific bilingual example: `Boudin noir à l'ancienne` is rendered in English as “Old fashion Blood pudding,” and its listed ingredients are pork blood, onion, pork fat, pork, cream, salt, and spices. The directory says its listing data come from the company and disclaims MAPAQ responsibility for their accuracy; treat this as one local product label, not a generic definition.

The Québec producer Les Cochonnailles likewise lists a pork-blood `boudin noir` made with pork fat and onions, formed in natural casings and poached, while noting that fabrication methods vary. The Québec Association québécoise du goûte-boudin de Boucherville’s 2024 contest rules classify classic boudin both as cased and as molded or wrapped in caul; the contest defines its classic formula separately from a creative category. This supports local use of the name and shows that casing is not a universal identity condition. Neither source turns one recipe or contest definition into a general standard.

**Naming decision:** If a future exact source calls for standardized CFIA item 12, `blood sausage` / `boudin` is the directly supported bilingual candidate. If it calls for black or blood pudding, `black pudding` or `blood pudding` / `boudin noir` is the corresponding candidate. Keep `boudin de langue` separate. Do not activate any of these now, and do not add `boudin`, `boudin noir`, `black pudding`, `blood pudding`, and `blood sausage` as one shared alias set. Follow the exact recipe or product source where it conflicts with broad lexical translation.

### `Morcilla`

The protected product specification for **Morcilla de Burgos** is bounded to that Spanish regional product. It describes a stuffed and cooked product made with Horcal onion, lard or suet, rice, blood, spices, and salt. Its permitted blood may be from sheep, cattle, or pigs. The specification describes a natural gut casing and allows sale whole with or without casing, as portions, or sliced. These source-specific properties are not a definition for every product called `morcilla`.

**Naming decision:** Preserve `Morcilla de Burgos` as a distinct regional name if an exact recipe later calls for it. Do not add bare `morcilla` as a global alias for blood sausage, black pudding, or `boudin noir`; this packet does not establish equivalence across other Spanish or Latin American products.

### `Sanguinaccio`

Treccani’s Italian dictionary describes `sanguinaccio` as a name for foods based on pig blood. It includes both central-Italian blood-and-fat sausages and a sweet preparation of cooked pig blood with chocolate, milk, butter, and sugar. Regional government sources show the distinction in actual product records: Umbria’s regional sheet describes a pork-blood sausage with pork fat, bread, sweet additions, and a pork casing, boiled and then eaten cold or reheated; Campania’s regional page uses `sanguinaccio` for a chocolate-and-milk cream/dessert, and says its commercial version is prepared without pig blood.

**Naming decision:** Do not use `sanguinaccio` as an alias for sausage or pudding. If a future recipe names it, preserve the regional and product context; the word alone can identify different preparations, including a dessert.

## Identity and data boundary

The source set supports a clear hold rather than a fabricated equivalence:

| Dimension | Evidence found | Catalog treatment now |
| --- | --- | --- |
| Composition | Canadian standard separates blood plus meat-product classes from blood-primary black/blood pudding and blood-and-tongue sausage. Québec product examples are recipe-specific; Morcilla de Burgos and Italian regional products have their own named formulas. | Add no shared product identity or global synonym group. |
| Animal species | CFIA’s classes do not prescribe one blood species. The Québec product example uses pork. Morcilla de Burgos permits sheep, cattle, or pig blood; the cited Italian regional examples specify pig. | Do not add species to a generic reference; retain source qualifiers if later demanded. |
| Casing | Québec contest rules distinguish cased and molded/caul forms. Morcilla de Burgos can be sold with or without casing; cited Italian sausage examples use pork casing. | Add no casing-based form or package measure. |
| Product state | CFIA items 12–14 are comminuted and cooked. The cited Morcilla and Italian sausage processes are cooked. The cited products do not establish a universal cured, smoked, ready-to-eat, storage, or reheating property. | Add no fresh/cured/smoked/ready-to-eat form, and make no safety or cooking-equivalence claim. |
| Measurements and substitutions | No matching recipe row, active reference, form, package-yield record, or substitution rule exists. Product-specific package or portion information would not transfer to an absent recipe line. | Add no density, unit mapping, portion, conversion, yield, or substitution. |

## Integration boundary

1. Add no active reference, alias, recipe link, form, measurement, unit mapping, conversion, yield, or substitution from this review.
2. Keep `blood sausage`, `black pudding`, `blood pudding`, `boudin noir`, `morcilla`, and `sanguinaccio` source-bounded; do not merge them by resemblance or partial translation.
3. Keep the WP04 Section O blood-product and regional-sausage checklist open, including its instruction not to infer safe cooking, curing, storage, or raw-consumption equivalence.

No tests were run because this is a documentation-only proposal. The review does not change the plan or mark Section O complete.

## Sources

All online sources below were accessed **2026-10-11**. Standards and terminology entries are cited for their stated scope; product listings and regional specifications are examples, not universal recipes.

| ID | Source | Evidence and limitation |
| --- | --- | --- |
| **S01** | CFIA, [Canadian Standards of Identity: Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7), Table 2, Part A, items 12–14 | Incorporated Canadian standard, last amended 2024-12-18. Distinguishes Blood Sausage, Black Pudding/Blood Pudding, and Blood and Tongue Sausage by mandatory ingredients and cooked process. |
| **S02** | CFIA, [Normes d'identité canadiennes : Volume 7 — Produits de viande](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-7), Tableau 2, partie A, items 12–14 | French counterpart to S01: `Boudin`, `Boudin noir`, and `Boudin de langue`. It supports standardized Canadian French names, not a claim that the products are synonymous. |
| **S03** | OQLF, [boudin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2092645/boudin) | 1983 terminology entry listing `boudin` / `boudin noir` and English `blood pudding`, `black pudding`, and `blood sausage`; lexical evidence that overlaps the CFIA distinctions. |
| **S04** | Québec Food Directory, [Boudin noir à l'ancienne / Old fashion Blood pudding](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8245502) | One local product, listed with pork blood, onions, pork fat, pork, cream, salt, and spices; directory entry last updated 2025-10-28 and disclaims responsibility for company-supplied accuracy. |
| **S05** | Les Cochonnailles, [Boudin noir portionné](https://cochonnailles.ca/produit/boudin-noir-portionne/) | Québec manufacturer’s own product: pork blood, pork fat, onions, cream, natural casing, and poaching; page says manufacturing methods vary. Product evidence only. |
| **S06** | Association québécoise du goûte-boudin de Boucherville, [2024 contest rules](https://www.goute-boudin-quebec.ca/wp-content/uploads/2024/09/Reglement-du-concours-2024-du-meilleur-boudin.pdf) | Québec charcuterie contest distinguishes cased classic boudin from molded/caul boudin and from a creative category. The contest definition is not a general product standard. |
| **S07** | GOV.UK, [Morcilla de Burgos protected food name](https://www.gov.uk/protected-food-drink-names/morcilla-de-burgos) and [product specification](https://assets.publishing.service.gov.uk/media/6682cfd67d26b2be17a4b539/Morcilla_de_Burgos_IGP_20.pdf) | Registered PGI product and its specification: a regional formula, cooked process, sheep/cattle/pig blood, and with-or-without-casing sale. It does not define bare `morcilla`. |
| **S08** | Treccani, [sanguinaccio (online dictionary)](https://www.treccani.it/vocabolario/sanguinaccio/) | Italian dictionary entry covers more than one pig-blood food, including a sausage and a sweet preparation; terminology evidence, not one catalog product definition. |
| **S09** | Regione Umbria, [Sanguinaccio product sheet](https://www.regione.umbria.it/documents/18/9035346/sanguinaccio.pdf/453b19c7-3ec4-455a-8e69-b62ed1313634) | Regional product sheet for an Umbrian pork-blood salume, with pork casing and a boiled process; one regional product only. |
| **S10** | Regione Campania, [Sanguinaccio](https://agricoltura.regione.campania.it/Tipici/tradizionali/sanguinaccio.htm) | Regional page describes the term as a chocolate-and-milk cream/dessert and says its commercial version is blood-free; page last updated 2019-08-29. It demonstrates a distinct regional referent, not a sausage identity. |

## Local evidence links

- [Section O plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2267)
- [Prior sausage-family review](wp04-section-o-sausage-family-gap-review-20261010.md)
- [Prior lap-cheong review](wp04-lap-cheong-regional-sausage-boundary-review-20261011.md)
- [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
- [Active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Active forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Legacy candidates](../legacy-import-identities.v1.json)
- [Research ledger](../research-ledger.v1.json)
