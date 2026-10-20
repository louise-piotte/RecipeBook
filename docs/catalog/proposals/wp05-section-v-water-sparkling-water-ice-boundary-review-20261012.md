# WP05 Section V — water, sparkling water, and ice boundary review

- **Date:** 2026-10-12
- **Status:** proposal only; Section V remains open
- **Scope:** current plain-water identity; sparkling-water identity and terminology; edible ice versus water preparation/process state.
- **Source namespace:** `WP05-WATER-ICE-20261012-S01` through `S10`. This prefix was absent from the active ledger and existing proposal files at the time of review.

## Recommendation

1. **Retain and verify the existing plain-water identity.** Keep `ingredient-ref-water` as `water / eau`, category `SAUCE_AND_CONDIMENT`, without aliases or forms. The 21 water ingredient rows already link to it, including the two `ice water` lines. In a later ledger update, mark identity evidence verified using the Canadian/Federal and Québec terminology sources below; leave measurement evidence blocked and substitution research unchanged. The ledger's current unresolved state came from removal of unsupported numeric data, not uncertainty about the identity.
2. **Add one identity-only sparkling-water reference.** Proposed ID: `ingredient-ref-sparkling-water`; display `eau pétillante / sparkling water`; proposed category `SAUCE_AND_CONDIMENT`, matching the current generic-water classification because the fixed taxonomy has no beverage category. Scope it to plain, unflavoured drinking water containing dissolved carbon dioxide, whether naturally present or added. Source-backed aliases: FR `eau gazeuse`, `eau gazéifiée`, `eau de Seltz`; EN `carbonated water`, `soda water`, `seltzer water`, `seltzer`. OQLF supports these terms; CFIA distinguishes carbonated water by its treatment condition and gives corresponding French common-name wording [S01–S05]. Add no forms, numeric data, recipe links, or substitutions.
3. **Hold standalone ice identity/form modeling.** The corpus has no ingredient row for ice or ice cubes. Its two `ice water` rows identify water and retain a cold-preparation hint; the other ice mentions are method/equipment context. CFIA treats packaged ice as a labelled food product, so this review does not claim ice can never be an ingredient. The current corpus does not establish whether a future explicit `ice` line should be a water form or a separate reference; make that decision only when a recipe calls for ice as an ingredient [S03, S04, S07].
4. **Keep product boundaries explicit.** Do not use `soda` as an alias: OQLF gives it both a carbonated-water sense and a sweetened-drink sense, and the active baking-soda row already has the Québec phrase `soda à pâte`. Do not alias `club soda` / `soda club` to plain sparkling water. OQLF records the term, while a current Canadian manufacturer's label shows one Club Soda formulation includes potassium salts; hold the term as a potentially separate product if recipe demand appears [S05–S06]. Do not merge plain water with broth/stock, vinegar, juice, flavoured carbonated drinks, tonic, or source-qualified mineral/spring water [S03–S04, S09–S10].

The plan's Water/sparkling water/ice checklist remains open. The generic `broth / bouillon` identity is already integrated separately; this review does not revisit or broaden its recipe link.

## Bilingual identity and alias recommendations

| Disposition | Reference | fr-CA / English | Aliases or state | Boundary |
|---|---|---|---|---|
| Retain; verify identity evidence in ledger later | `ingredient-ref-water` | `eau / water` | None. No water form exists. | Keep plain water separate from sparkling water and from stocks/broths. Do not add `bottled water`, `spring water`, `mineral water`, or `distilled water` as generic aliases; Canadian labelling distinguishes these sources or treatments. |
| Add as identity-only candidate | `ingredient-ref-sparkling-water` | `eau pétillante / sparkling water` | FR: `eau gazeuse`, `eau gazéifiée`, `eau de Seltz`. EN: `carbonated water`, `soda water`, `seltzer water`, `seltzer`. | Plain, unflavoured water containing dissolved CO₂. Keep added flavour, sweeteners, minerals formulated into a product, and other ingredients out of this candidate. No bundled recipe line currently needs a link. |
| Hold | No `ice` reference or water form proposed | — | `ice`, `ice cube(s)`, `cube de glace`, and `glaçon(s)` remain unassigned as ingredient aliases. | Current recipe uses are ice-cold water, an ice bath, process water, or equipment wording, rather than a separately listed ice ingredient. Revisit if an ingredient row explicitly calls for ice. |
| Hold pending product-specific demand | No `club soda` reference proposed | — | Do not alias `club soda`, `soda club`, or bare `soda` to sparkling water. | OQLF lists `club soda` in its carbonated-water terminology, while a current Canadian manufacturer label shows one SKU with added potassium salts. The reviewed evidence does not justify collapsing every `club soda` product into plain water. |

`aerated water` is present as a technical English equivalent in the OQLF entry for *eau gazéifiée*, but is omitted from the recommended alias set as uncommon wording with no recipe demand. `soda nature` is also omitted to avoid introducing another phrase built on the ambiguous short term `soda`.

## Product and terminology boundaries

### Plain water and sparkling water

The OQLF's *eau gazeuse* entry defines water containing carbon dioxide, gives `eau gazeuse` and `eau pétillante` as preferred terms, and pairs the concept with English `sparkling water`. It notes the distinction between naturally gaseous water and water that is artificially carbonated [S01]. A separate OQLF record defines *eau gazéifiée* more narrowly as bottled or tap water into which carbon dioxide has been dissolved under pressure; it pairs that term with `carbonated water` and `aerated water` [S02]. These terms support one plain sparkling-water identity, not a new alias on the existing plain-water row.

CFIA's current bilingual labelling guidance requires the common name to distinguish treated water such as carbonated water from other packaged water. It gives English `carbonated` or `sparkling` and French `gazéifiée` or `pétillante` for the applicable carbonated mineral/spring-water labels; its French guidance also uses `eau` and `eau embouteillée` for water and `eau gazéifiée` when carbonation is the treatment [S03, S04]. A Québec product page for Montellier uses `eau pétillante` and lists source water and carbon dioxide, supporting current local product wording for the proposed narrow identity [S08].

Keep the source descriptors `mineral water / eau minérale` and `spring water / eau de source` distinct. CFIA and OQLF treat them as source-defined water classes that may be still or carbonated; they are not synonyms for sparkling water. Likewise, do not alias `bottled water` to plain water: CFIA differentiates packaged water by source and treatment and requires descriptive common names when treatment changes its nature [S01–S04]. Flavoured water and sweetened carbonated drinks are outside the proposed unflavoured-water identity.

### Soda and club soda

OQLF's *soda* entry uses the term for pressurized carbonated water and lists French `eau de Seltz` and English `soda water`, `seltzer water`, and `seltzer` among its terminology. The same entry says `soda` can also mean a sweetened non-alcoholic beverage and marks `club soda` / `soda club` as discouraged French borrowings [S05]. The broader OQLF *boisson gazeuse* entry likewise records `soda` as a term for a sweetened or flavoured carbonated drink [S09]. Its *soda tonique* entry defines tonic as a sweetened, flavoured carbonated drink rather than a water [S10]. The full phrases can be kept distinct; bare `soda` is not a safe alias.

The current Canada Dry Canada product page lists carbonated water plus potassium bicarbonate and potassium citrate for its Club Soda SKU [S06]. This source shows a formulation boundary for that product, but does not establish one universal club-soda formula. Keep `club soda` outside the plain sparkling-water aliases and hold the identity decision until a recipe or separate catalog tranche needs it. No product-specific composition or quantity is generalized here.

### Ice versus preparation state

OQLF's food-and-beverage terminology record defines an ice cube as a small regular piece of ice and gives `cube de glace` and `glaçon` as French terms [S07]. CFIA separately regulates the labelling of prepackaged ice, establishing that packaged ice can be a named food product [S03, S04]. Neither source determines whether RecipeBook should model ice as a separate ingredient or as a form of water.

The recipe audit resolves the current app use: the only ingredient lines naming ice are `ice water` in recipes 002 and 041. Both already link to `ingredient-ref-water`, have no `ingredientFormId`, and carry only the existing free-text cold preparation (`ice cold` / `glacé`). Recipe 002's method adds ice to water and then uses the chilled water; recipe 066 uses an ice bath to cool eggs; recipe 104 transfers asparagus to ice water during cooking; recipe 096 mentions an ice-cube tray as equipment in a storage note. None lists ice as a standalone ingredient. Do not create an `ice` reference, `frozen water` form, or ice alias from these process/equipment mentions.

### Water versus stocks, broth, and acidic products

The live `ingredient-ref-water` stays distinct from `ingredient-ref-broth`, `ingredient-ref-vegetable-stock`, `ingredient-ref-beef-stock`, `ingredient-ref-beef-broth`, `ingredient-ref-low-salt-chicken-broth`, `ingredient-ref-broth-concentrate`, and `ingredient-ref-chicken-bouillon-powder`. The generic broth integration linked only recipe 090#9 and documented no global broth/stock equivalence ([WP05 generic broth batch](../batches/wp05-generic-broth-identity-integration-20261012/README.md)). Do not move water rows to a stock or broth identity.

The [WP05 vinegar proposal](wp05-section-v-vinegar-acid-gap-review-20261012.md) separates acetous-fermented vinegar from verjus; the [acidic-juice proposal](wp05-section-v-acidic-juice-and-preparation-boundaries-gap-review-20261012.md) keeps fresh lemon/lime juice and verjuice distinct from vinegar, while bottled-juice subtypes remain unresolved. The [culinary-alcohol proposal](wp05-section-v-culinary-alcohol-boundary-review-20261012.md) keeps cooking wines and regional rice wines distinct from plain water and vinegar. Those decisions remain unchanged. Sparkling water is not a vinegar, citrus juice, sour-grape juice, tamarind preparation, or cooking wine.

The [WP06 North American cuisine sweep](wp06-north-american-cuisine-gap-sweep-20261009.md) mentions soda water in a historical Parks Canada raspberry-vinegar drink. That source is outside the bundled 114-recipe corpus, and the proposal explicitly preserves the drink title without treating the source as evidence for a vinegar identity. It reinforces the culinary wording `soda water` but does not create a bundled recipe link or justify adding the broader bare alias `soda`.

## Repository and canonical-data audit

Audit performed against the current package on 2026-10-12:

- **Package:** 1,148 ingredient references; 79 forms; 114 manifest-listed recipes; 1,123 ingredient rows; 68 legacy candidates; 1,442 ledger records, 4,814 source entries, 3,934 distinct source IDs, and 8 unit conversions.
- **Plain-water owner:** `ingredient-ref-water`, displayed as `water / eau`, category `SAUCE_AND_CONDIMENT`, no aliases, null default density, empty unit mappings. It has no attached form.
- **Exact water-related references:** `ingredient-ref-water-chestnut`, `ingredient-ref-water-spinach`, `ingredient-ref-watercress`, `ingredient-ref-watermelon`, and `ingredient-ref-watermelon-seed-kernels-dried` own their distinct food names. None is a water alias. No current reference owns `sparkling water`, `carbonated water`, `soda water`, `seltzer`, `eau pétillante`, `eau gazeuse`, `eau gazéifiée`, or an ice term.
- **Forms:** no form is attached to `ingredient-ref-water`, and no form is named ice, sparkling water, or carbonated water. One rocoto-pepper form mentions preparation `in unsalted water`; its owner remains `ingredient-ref-rocoto-pepper`, not water.
- **Legacy identities:** none of the 71 candidates owns water, sparkling water, carbonated water, soda water, seltzer, or ice wording. The proposed `ingredient-ref-sparkling-water` ID is absent from reference IDs, form IDs, legacy candidates, and ledger record IDs.
- **Ledger:** `ingredient-ref-water` exists with `identityState: unreviewed`, no sources, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: not_yet_researched`. There is no sparkling-water or ice identity record. This proposal recommends source-backed identity review only; it does not activate measurement or substitution data.
- **Exact-key collision check:** each proposed sparkling-water name/alias was checked against every active reference name/alias, form label/match term, and legacy candidate. No exact owner exists. The existing baking-soda owner is `ingredient-ref-baking-soda`; its English alias `bicarbonate of soda` and French alias `soda à pâte` do not make bare `soda` an unambiguous water term. The existing [WP02 soda/powder proposal](wp02-section-e-soda-powder-boundary-review-20261010.md) already rejects bare `soda` as a baking-soda alias.

### Ingredient-row scan across all 114 recipes

All manifest-listed recipe files were scanned for ingredient text/reference/form links and bilingual recipe prose. There are 21 water ingredient rows linked to `ingredient-ref-water`, including the two `ice water` rows:

`002#5`, `005#5`, `021#3`, `024#2`, `033#1`, `041#5`, `044#1`, `045#13`, `046#2`, `057#5`, `057#24`, `058#1`, `064#4`, `066#7`, `072#3`, `072#5`, `076#1`, `077#3`, `080#5`, `098#2`, and `099#4`. Both `ice water` rows identify water and keep the cold wording as preparation.

The only other ingredient-row hit containing the word `water` is `114#13`, a combined hot-water-or-hot-coffee choice. It has no `ingredientRefId`; preserve that compound row rather than assigning it to plain water alone. No ingredient row or other recipe text names sparkling water, carbonated water, soda water, seltzer, club soda, or their French equivalents.

The two ice-water rows are `002#5` and `041#5`; both link to water and have no form ID. Process-only ice mentions are recipe 002's chilled-water method, recipe 066's egg-cooling bath, and recipe 104's asparagus-cooling water. Recipe 096 names an ice-cube tray as equipment. None creates an ice ingredient demand. No recipe row was changed or needs relinking for this proposal.

## Source register

Sources were reviewed on 2026-10-12. The source IDs below are proposal-local and are not active ledger records.

| Source ID | Source and locator | Supports | Limitation |
|---|---|---|---|
| `WP05-WATER-ICE-20261012-S01` | OQLF, [eau gazeuse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869752/eau-gazeuse), preferred terms and notes. | Defines water containing carbon dioxide; gives `eau gazeuse` / `eau pétillante` and English `sparkling water`; distinguishes naturally gaseous from artificially carbonated spring/mineral water. | Terminology and broad product identity only; no measurement or recipe equivalence. |
| `WP05-WATER-ICE-20261012-S02` | OQLF, [eau gazéifiée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529363/eau-gazeifiee), definition and preferred term. | Supports the FR label `eau gazéifiée` and English `carbonated water` for water into which carbon dioxide is dissolved under pressure. | Describes artificially carbonated water; not a complete taxonomy of natural or mineral waters. |
| `WP05-WATER-ICE-20261012-S03` | CFIA, [Labelling requirements for prepackaged water and ice](https://inspection.canada.ca/en/food-labels/labelling/industry/prepackaged-water-and-ice), common-name and packaged-ice sections. | Distinguishes water from treatment-labelled carbonated water; permits `carbonated` or `sparkling` wording where applicable; treats prepackaged ice under separate labelling provisions. | Applies to prepackaged water and ice; does not decide RecipeBook identity-versus-form modeling or describe non-prepackaged municipal water. |
| `WP05-WATER-ICE-20261012-S04` | CFIA, [Exigences d'étiquetage de l'eau et de la glace préemballées](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/eau-glace-preemballees), noms usuels and water/ice sections. | Confirms Québec/Canadian French labels `eau`, `eau embouteillée`, `eau gazéifiée`, `eau pétillante`, `eau minérale`, and `eau de source`; separates added flavour and treatment wording. | Same regulatory scope as S03; not a consumer synonym list. |
| `WP05-WATER-ICE-20261012-S05` | OQLF, [soda (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529355/soda), definition, preferred terms, and English equivalents. | Supports `eau de Seltz`, `soda water`, `seltzer water`, and `seltzer` for the carbonated-water sense; identifies a second sweetened-drink sense for `soda` and flags French `club soda` / `soda club` wording. | Terminology entry, not proof that every English retail product called club soda has the same formula. |
| `WP05-WATER-ICE-20261012-S06` | Canada Dry, [Club Soda product page](https://canadadry.ca/product/club-soda/), ingredient declaration. | One Canadian Club Soda SKU lists carbonated water, potassium bicarbonate, and potassium citrate; supports holding that product wording outside a plain-water alias set. | One manufacturer's product only; does not establish the formula of all products called club soda. |
| `WP05-WATER-ICE-20261012-S07` | OQLF / Institut international du froid, [cube de glace (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8477717/cube-de-glace), definition and terms. | Defines an ice cube and records `cube de glace` / `glaçon` alongside English `ice cube`. | Terminology evidence only; does not establish ingredient demand or the catalog model for ice. |
| `WP05-WATER-ICE-20261012-S08` | Montellier, [Eau pétillante Montellier Originale](https://montellier.ca/fr/product/naturelle/), product name and ingredient declaration. | Current Québec manufacturer wording `eau pétillante`; product lists natural source water and carbon dioxide. | One manufacturer's product; not a general water standard or support for every sparkling-water formulation. |
| `WP05-WATER-ICE-20261012-S09` | OQLF, [boisson gazeuse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870732/boisson-gazeuse), definition and notes. | Distinguishes sweetened/flavoured carbonated drinks from water, and records the broader secondary use of `soda`. | Terminology boundary only; does not identify any particular beverage formulation. |
| `WP05-WATER-ICE-20261012-S10` | OQLF, [soda tonique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529270/soda-tonique), definition and notes. | Distinguishes quinine-flavoured sweetened carbonated tonic from plain water. | Terminology boundary only; does not establish recipe demand or a general beverage identity decision. |

## Measurement, conversion, and substitution status

No quantity, density, unit mapping, form, conversion, preservation guidance, or substitution is proposed. The existing water ledger measurement state remains blocked pending its own evidence. The sparkling-water candidate is identity-only. This review does not change any recipe data or canonical catalog files.

## Snapshot and audit hashes

The counts and hashes below are the repository snapshot used for this proposal; recheck them before any future integration. The recipe-corpus digest hashes each manifest-listed filename in manifest order, followed by a NUL byte, its raw JSON bytes, and another NUL byte.

| Input | Snapshot | SHA-256 |
|---|---|---|
| `docs/RecipeBook-global-ingredient-catalog-plan.txt` | Section V water/sparkling water/ice remains open | `683b05cec6e24a117e531fcd7ad98488d9da0cc0ed3d58563bcc03ac0cf56616` |
| `docs/catalog/ingredient-catalog-workflow.md` | Latest Section V entries include vinegar, acidic juice, generic broth, and culinary alcohol | `f32c25e5446a40297827c6e73983f91f8973c6831ca5ece38b91bb686f84dba2` |
| `ingredient-references.v1.json` | 1,148 references | `3fecf029a9507462cb10d96de9e6145fbe66ecc85d545915cc65eb6c2f384b4c` |
| `ingredient-forms.v1.json` | 79 forms | `e6e9bd997bc1d8eda3047e6fd349c1c6f02876160a6705368c6c2687b3f52419` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus, manifest order | 114 recipes / 1,123 ingredient rows | `443223a1e1514fa725cea2292f59d2f76c849d27c283ade603dc67048d4917b9` |
| `legacy-import-identities.v1.json` | 68 candidates | `e537c97aa954b4b8e6effe333adfd6ee3f89be839ef6519e5ffdc93b87e6bcd0` |
| `research-ledger.v1.json` | 1,442 records / 4,814 source entries / 3,934 distinct source IDs / 8 unit conversions | `5910726f80f32641be4b1cefe543b9507d325a8f93778b1fe8b1c56318311deb` |
