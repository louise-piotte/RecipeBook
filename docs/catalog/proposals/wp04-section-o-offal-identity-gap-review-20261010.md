# WP04 Section O offal identity gap review — 2026-10-10

- **Packet type:** source review; coordinator accepted the recommendation to hold active offal identities until an exact recipe/product request. No offal seed or recipe rows were added. The broader Section O line remains open.
- **Scope:** source-backed identity and name boundaries for beef, pork, veal, and poultry organs; beef cheek meat; pork jowl; and pork feet. No measurements, yields, conversions, substitutions, or handling advice are reviewed.
- **Disposition:** keep the Section O organ/offal checklist open. The current 114-recipe corpus has no ingredient line requesting one of these products, so it supports no recipe link and does not justify activating a new reference in this pass. The primary bilingual sources below establish a useful species-scoped candidate vocabulary for the next exact recipe request.

## Snapshot and audit boundary

At the 2026-10-10 audit snapshot, the manifest-listed bundled package has 862 active ingredient references and 47 ingredient forms; the research ledger has 1,107 records. The manifest lists 114 recipe files containing 1,123 ingredient rows. The catalog and ledger byte fingerprints at inspection were:

- `ingredient-references.v1.json`: `5155166ab2c33edfca487cf00cb1c0f1cec2bd4d526305d78b9b57841770a3d2`
- `research-ledger.v1.json`: `1680d71a1afa0cbb18560f20cfab6a16c412874eb1181844fe333d94c71858f6`

The review searched every manifest-listed recipe's ingredient text, title, descriptions, instructions, and notes for the checklist terms and spelling variants. It searched active reference names and aliases, forms, and ledger record IDs for exact and lexical owners. It also checked the prior WP04 proposal files for offal/jowl overlap. The manifest does not name a separate legacy-candidate file; this review therefore makes no claim about unmanifested candidate stores.

## Recipe demand

No ingredient row in the 114-recipe bundle names liver, heart, kidney, tongue, tripe, sweetbread, gizzard, foot/trotter, oxtail, cheek meat, jowl, or giblets. The only recipe text match for `kidney` is a bean, not an organ:

| Recipe line | Exact bundled text | Current reference | Finding |
| --- | --- | --- | --- |
| `034#9` — Classic Beef Chili; `4cbff09a-679f-420c-89e2-4175fb8e8662-ingredient-9` | `540 ml kidney beans, rinsed and drained` | `ingredient-ref-kidney-beans` | Legume line. It is not evidence for kidney or offal identity, count, or portion. The current [RICARDO source page](https://www.ricardocuisine.com/en/recipes/5762-classic-beef-chili) likewise lists a 19 oz (540 ml) can of kidney beans. The bundled source row is in [recipe 034](../../../app/src/main/assets/seed/bundled-library/recipes/034-chili-classique-au-boeuf-classic-beef-chili-4cbff09a-679f-420c-89e2-4175fb8e8662.v1.json). |

Generic meat lines elsewhere in the corpus do not specify an organ. In particular, the active generic `beef / bœuf` identity is not a basis to relink a line to any beef offal reference. No candidate recipe link is proposed.

## Current names, collisions, and prior work

The active [ingredient reference file](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) has no exact normalized key for the source-supported target names below. The [ingredient forms file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) has no offal form. The ledger has no offal-specific record ID. Nearby owners are distinct products:

| Search/key neighbor | Current owner | Boundary |
| --- | --- | --- |
| `kidney` | `ingredient-ref-kidney-beans` — kidney beans / haricots rouges | The recipe 034 hit is a bean; do not add kidney as its alias. |
| `heart` / `hearts` | `ingredient-ref-hearts-of-palm` — hearts of palm / cœurs de palmier; `ingredient-ref-hemp-hearts` — hemp hearts / graines de chanvre décortiquées | Plant foods; neither is animal heart. |
| `queue` | Cubeb has the French alias `poivre à queue` | This is not a key for `queue de bœuf` or a meat product. |
| `beef` / `bœuf` | Generic beef, ground beef, beef broth, and beef stock references | Any future offal identity must retain its organ qualifier and must not alias bare `beef` or `bœuf`. |
| pork jowl | `ingredient-ref-guanciale` — guanciale / guanciale | Ledger sources describe a matured pork-jowl product. Retain guanciale as distinct from a fresh jowl cut and from beef cheek meat. |

The normalized full-name audit found no current exact owner for the proposed bilingual names. A broader French phrase has a separate terminology collision: OQLF also records `cœur de bœuf` as the name of the fruit *Annona reticulata* [S18]. That botanical homonym is not an active key in the current seed, but an unscoped alias would be unsafe if that fruit is later added. Preserve the food-domain label and do not add bare `cœur` or an unqualified cross-category alias.

Prior WP04 work already covers cured-pork distinctions. The [Section O cured-pork proposal](wp04-section-o-cured-pork-boundaries-20261010.md) keeps guanciale separate from fresh pork cheek; the [salt-pork follow-up](wp04-salt-pork-identity-followup-20261010.md) leaves broad salt pork unresolved; and the [animal-food residual audit](wp04-animal-foods-residual-coverage-audit-20261010.md) is not an offal identity packet. This review found no earlier WP04 proposal for the remaining named organs.

## Source-backed terminology and disposition

The tables below distinguish terminology support from recipe demand. `Hold` means no active reference or recipe link is recommended in this batch, even where an official bilingual pair is available. If later work accepts a candidate for a specific recipe, model it as an identity-only `PROTEIN` reference with species and organ in both display names; use only aliases directly supported for that same product. Existing v1 reference and ledger structures are sufficient; this review does not call for DTO, mapper, schema, or runtime changes.

| Checklist candidate | Exact source-backed scope and names | Disposition |
| --- | --- | --- |
| **Beef liver, heart, kidney, tongue, tripe, sweetbread, tail** | CFIA's beef meat-cuts manual lists these under the beef variety-meat section with bilingual roots: `liver / foie`, `heart / cœur`, `kidney / rognon`, `tongue / langue`, `tripe / tripe`, `sweetbread / ris`, and `tail / queue`. OQLF separately gives exact food-domain entries for `cœur de bœuf / beef heart`, `rognon de bœuf / beef kidney`, `langue de bœuf / beef tongue`, `ris de bœuf / beef sweetbread`, and `queue de bœuf / beef tail`, with `ox tail` and `oxtail` as culinary English terms for the latter. | **Hold active rows pending recipe demand.** These are beef-scoped identities, not generic organ aliases. `tripe de bœuf` and `foie de bœuf` are species-qualified display constructions from CFIA's beef heading and bilingual terms, not additional aliases quoted from an OQLF entry. Do not map these to pork, veal, or poultry organs. [S01, S05, S06, S08, S09, S11] |
| **Pork liver, heart, kidney, tongue, tail, feet** | CFIA's pork manual lists `liver / foie`, `heart / cœur`, `kidney / rognon`, `tongue / langue`, `tail / queue`, and `feet / pieds` under pork. OQLF's pork-domain entries directly support `foie / liver`, `rognon / kidney`, and `pied de porc / pig's foot`; the latter covers the front or rear foot as separately described cut positions. | **Hold active rows pending recipe demand.** Keep each identity pork-scoped. Do not alias bare `foie`, `rognon`, `queue`, `langue`, `pied`, or `foot` across species. Do not add `trotter` as an alias: the reviewed exact OQLF English terms are `pig's foot` / `pigs foot`. [S02, S06, S07, S13] |
| **Pork jowl versus cheek** | OQLF pairs pork-domain `bajoue` with `jowl` and defines it as the fatty portion between the shoulder and jaw. Its cheek-meat entry is instead in the beef domain: `maigre de joue` / `viande de joue` with English `cheek meat`, specifically meat trimmed from bovine cheek. The defined trim excludes parotid gland, lymph tissue, and fat. | **Keep the terms separate.** `Pork jowl / bajoue de porc` is a possible source-backed identity only when demanded; it is not a synonym for generic pork cheek, beef cheek meat, or guanciale. The beef candidate is specifically trimmed cheek meat, not an unqualified whole cheek. Do not add generic `cheek(s)` or `joue(s)` aliases. [S12, S14] |
| **Beef and calf sweetbreads** | OQLF defines `ris de bœuf / beef sweetbread` as the thymus of young beef and `ris de veau / calf sweetbread` as the calf thymus. These are separate food-domain entries; the shared word `ris` does not erase the species/age qualifier. | **Keep as separate candidates; hold both rows.** Do not merge beef and veal, broaden either to pancreas or unspecified gland, or add bare `ris` as a cross-species alias. [S03, S09, S10] |
| **Poultry liver, heart, gizzard; giblets** | CFIA lists `gizzard / gésier`, `heart / cœur`, and `liver / foie` for poultry and defines poultry giblets as any one or combination of these organs from the same species. CFIA's poultry definition requires the bird species in the product description. OQLF's `abats / giblets` definition includes the edible neck as well as bird viscera; this is broader than CFIA's meat-cuts definition. | **Hold generic poultry identities and `abats ↔ giblets` as global aliases.** A later row must preserve the exact bird species (for example, chicken versus turkey) supported by the recipe/source. Treat a whole-bird package's neck-plus-organs set as a composite source product, not a synonym for one organ or for every product called giblets. [S04, S15, S16] |
| **Generic organs, generic tripe, marrow/bones/skin/blood** | The reviewed CFIA lists are organized by animal. They do not supply a single cross-species ingredient identity for these terms. The current task did not retrieve a specific source/product that would establish a global food name for marrow, bones, skin, or blood. | **Keep unresolved.** Review only against an exact species, cut/product, and recipe line. Do not derive measurement, edible-yield, conversion, substitution, or preparation behavior from the category name. |

## Identity-only contract if an exact recipe later requires integration

For a source-verified target line, the v1 representation should remain a plain identity record: one reference per species and organ/cut; category `PROTEIN`; a species-qualified English and French display name; no generic organ aliases; no linked form or numeric data unless separately supported for that exact product. Record source citations on the corresponding ledger identity record. Preserve source terminology such as `oxtail` only on the beef-tail identity and `bajoue` only on the pork-jowl identity. Keep a composite poultry giblet pack separate from an individual liver, heart, or gizzard. The current schema supports these identity distinctions, so no compatibility shim or schema version change is proposed.

## Remaining WP04 work

This packet does not close Section O. The plan still has open animal species and regional game, meat-cut and bone/skin/raw/cooked boundaries, organ candidates including poultry gizzards and other species-specific products, marrow/bones/skin/blood, cured and smoked products, regional sausages, and legally sourced regional proteins. The Section O safety-equivalence rule also remains active.

Sections P and Q remain open independently: P still has fish, shellfish, roe, preserved seafood, and regional-protein coverage; Q still has culinary egg forms and species-specific milk/dairy work. See the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).

## Sources

All online sources below were accessed on **2026-10-10**. Source IDs are local to this proposal and were not written to the research ledger.

| Source ID | Source and evidence limits |
| --- | --- |
| **S01** | CFIA, [Beef — Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/beef), “Variety meats” section. Lists the bilingual beef-scoped terms `Brain/Cervelle`, `Heart/Coeur`, `Kidney/Rognon`, `Liver/Foie`, `Tail/Queue`, `Tongue/Langue`, `Tripe/Tripe`, and `Sweetbread/Ris`. Nomenclature evidence, not preparation or measurement evidence. |
| **S02** | CFIA, [Pork — Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/pork) and its [French page](https://inspection.canada.ca/fr/etiquetage-aliments/etiquetage/industrie/produits-viande-volaille/coupes-viande/porc), “Variety meats / Abats et issues.” Lists the pork-scoped bilingual roots for heart, kidney, liver, tail, tongue, and feet among other products. The French page also defines pig feet as separate front- and rear-foot cuts. |
| **S03** | CFIA, [Veal — Manuel de coupes de viande](https://inspection.canada.ca/fr/etiquetage-aliments/etiquetage/industrie/produits-viande-volaille/coupes-viande/veau?wbdisable=true), “Abats et issues.” Lists veal `sweetbread / ris`, heart, kidney, liver, tongue, and brain. This is veal-specific naming; it does not make a generic cattle or pork organ equivalent. |
| **S04** | CFIA, [Poultry — Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/poultry), item 3 and “Variety meats”; see also its [French page](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/produits-viande-volaille/coupes-viande/volaille). Defines poultry giblets as liver, heart, gizzard, or a combination from the same species; requires the bird species in product description. Does not authorize a generic poultry-organ alias across birds. |
| **S05** | OQLF, [cœur de bœuf (alimentation viande de bœuf)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489081/coeur-de-boeuf). Direct bilingual pair `cœur de bœuf / beef heart`; food-domain entry. |
| **S06** | OQLF, [rognon de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489038/rognon-de-boeuf) and [rognon (alimentation viande de porc)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428108/rognon). Directly supports beef kidney / `rognon de bœuf` and the pork-domain root `rognon / kidney`; both entries note that meat labels include species. |
| **S07** | OQLF, [foie (alimentation viande de porc)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488127/foie). Pairs pork-domain `foie / liver`; no composition or edible-portion data. |
| **S08** | OQLF, [langue de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432364/langue-de-boeuf). Direct bilingual pair `langue de bœuf / beef tongue`; English `ox tongue` is listed as a general butchery term. This does not support aliases to tongues from other species. |
| **S09** | OQLF, [ris de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8431438/ris-de-boeuf). Direct pair `ris de bœuf / beef sweetbread`; definition is thymus of young beef. |
| **S10** | OQLF, [ris de veau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429594/ris-de-veau). Direct pair `ris de veau / calf sweetbread`; definition is calf thymus. |
| **S11** | OQLF, [queue de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432348/queue-de-boeuf). Direct food-domain name `queue de bœuf / beef tail`; English terms include `ox tail` and `oxtail`, with an explicit culinary usage note. |
| **S12** | OQLF, [maigre de joue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432948/maigre-de-joue). Lists `maigre de joue` and `viande de joue` / `cheek meat` in the beef domain, defines trimmed cheek meat, and states the species belongs in a meat label. The term does not mean generic whole cheek or pork jowl. |
| **S13** | OQLF, [pied de porc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8887140/pied-de-porc). Direct pair `pied de porc / pig's foot`; the entry distinguishes front and rear foot cut positions. It does not attest `trotter` as a global alias. |
| **S14** | OQLF, [bajoue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8887150/bajoue). Pork-domain French `bajoue`, English `jowl`; describes the fatty area between shoulder and jaw and notes usual curing/market forms. This supports a cut/name boundary, not a synonym for beef cheek meat or guanciale. |
| **S15** | OQLF, [gésier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26572898/gesier). Pairs bird-anatomy term `gésier / gizzard`; it does not identify a particular bird species or product state. |
| **S16** | OQLF, [abats](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17498449/abats). Pairs `abats / giblets`; definition includes edible poultry neck and viscera. The composition does not exactly match CFIA's item-3 poultry-giblet definition. |
| **S17** | [RICARDO, Classic Beef Chili](https://www.ricardocuisine.com/en/recipes/5762-classic-beef-chili), ingredient list. Lists kidney beans at 19 oz (540 ml); recipe-specific verification of the corpus false positive, not an offal reference. |
| **S18** | OQLF, [anone cœur de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296942/anone-coeur-de-boeuf). Botanical entry for *Annona reticulata* with the French term `cœur de bœuf`; this is a homonym, not a meat synonym. |

**Source limits:** the CFIA manuals provide Canadian cut and product nomenclature, not a current retail survey, recipe-portion standard, edible-yield factor, or cooking behavior. Several relevant OQLF meat entries date from 1982–1983; they support the listed terminology and domain boundaries, not present-day product availability. The poultry sources do not establish one species-neutral poultry-organ identity. No source for edible yield, count mass, conversion, substitution, or handling was used.

## Proposal disposition

- Keep the open Section O offal line open; do not add or promote any offal identity in this review.
- Do not link recipe 034#9 or any generic beef/pork line to an organ.
- Reuse the species-scoped bilingual vocabulary above when a concrete recipe asks for an exact item; where a CFIA table supplies the root only, retain its animal section as provenance and do not turn an inferred species phrase into a broad alias.
- Keep beef cheek meat distinct from pork jowl and cured guanciale; keep cattle and veal sweetbreads separate; keep every poultry organ scoped to a named bird species.
- Add no forms, measurements, edible-yield factors, conversions, substitutions, or handling statements.

## Coordinator disposition — 2026-10-10

Accepted the source-boundary review and the no-addition disposition for this pass. CFIA's species-
organized meat manuals and OQLF's food-domain entries support keeping organ/cut names scoped to the
animal and product, but the bundled recipes provide no offal ingredient demand. The lone `kidney`
match is kidney beans in recipe 034. No catalog row, alias, form, recipe link, or numeric behavior
was added. The plan records this review as complete while leaving the broader organ/offal coverage
open; see the source and demand details above.
