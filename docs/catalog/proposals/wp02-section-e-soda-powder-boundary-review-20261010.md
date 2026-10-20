# WP02 Section E — baking soda and baking powder boundary review

- **Reviewed:** 2026-10-10
- **Status:** identity and alias review integrated; both IDs and all 43 recipe links remain active
- **Scope:** baking soda / sodium bicarbonate and baking powder, their English and fr-CA names, and the single-ingredient versus compound-product boundary
- **Excluded:** cream of tartar (reviewed and integrated in the [cream-of-tartar audit](wp02-section-e-cream-of-tartar-identity-audit-20261010.md)); ammonium bicarbonate/carbonate and baker’s ammonia (covered by the separate [ammonium-leavener review](wp02-baking-ammonia-ammonium-leaveners-review-20261009.md))
- **Integration:** added only the terminology aliases below, verified both identity records in the research ledger, and added package regression coverage. No recipe, form, numeric behavior, or substitution rule changed.

## Accepted integration

Retain both current IDs and every recipe mapping. The 114-recipe manifest contains 21 baking-soda rows and 22 baking-powder rows. All 43 are already linked correctly. No new identity, form, density, unit mapping, recipe relink, or substitution rule was needed.

| Active ID | Retained canonical display | Integrated search aliases | Category and numeric data |
| --- | --- | --- | --- |
| `ingredient-ref-baking-soda` | EN `baking soda`; fr-CA `bicarbonate de soude` | Integrated EN alias `sodium bicarbonate`; integrated FR aliases `bicarbonate de sodium`, `carbonate acide de sodium`, `hydrogénocarbonate de sodium`. Retain the current aliases listed below. | Retain `BAKING_AND_SPICE`; `defaultDensity: null`; `unitMappings: []`; no form. |
| `ingredient-ref-baking-powder` | EN `baking powder`; fr-CA `poudre à pâte` | Integrated FR lookup aliases `levure chimique`, `poudre levante`, `poudre à lever`. | Retain `BAKING_AND_SPICE`; `defaultDensity: null`; `unitMappings: []`; no form. |

The baking-soda additions are supported by the OQLF terminology entries and the CFIA’s English and French permitted-synonym tables. The current baking-soda aliases are EN `bicarbonate of soda`; FR `soda à pâte` and `petite vache`. OQLF marks `soda à pâte` as common Québec usage and describes `petite vache` as a familiar expression tied to a product-package image. Keep both as internal search terms; neither changes the canonical display name.

OQLF lists all three proposed baking-powder French forms as preferred terms and marks `poudre à pâte` as Québec/Canada usage. Retain `poudre à pâte` as the fr-CA display name. Treat the other forms as internal lookup aliases, not a request to rewrite any recipe text.

Do **not** merge the two IDs or assign their names across identities. Sodium bicarbonate is the ingredient OQLF calls an ingredient of chemical baking powder; baking powder is a formulated mixture. The CFIA standard allows sodium or potassium bicarbonate plus an acid-reacting material and starch or another neutral material. Its permitted acid-reacting materials include several acids/salts. That standard does not require cream of tartar specifically, so do not define baking powder as one fixed soda/cream-of-tartar/starch formula. Keep the already-reviewed cream-of-tartar identity separate.

Do not add generic `soda` as a baking-soda alias: OQLF also defines `soda` as a carbonated beverage. Do not add `carbonate de sodium`; OQLF defines that as sodium carbonate (Na₂CO₃), a different product. Do not add bare `levure` or use `levure chimique` as a baking-soda alias. The project’s Quebec wording guidance mentions preferring `bicarbonate de soude` over `levure chimique`; OQLF identifies the former with baking soda and the latter as baking powder. For catalog identity and matching, preserve that distinction. If the local wording note is intended as a recipe-display rewrite, it needs a separate editorial decision because it changes which ingredient a recipe names.

## Exact recipe demand in the manifest-listed corpus

The 114 manifest-listed recipe files were scanned across all 1,123 ingredient rows for the current and proposed English/French terms, including existing aliases. The scan found **21 baking-soda rows in 21 files**, **22 baking-powder rows in 22 files**, and **43 rows across 28 files**. Fifteen recipe files contain one row of each. Every matching row has the expected active `ingredientRefId`; there are no unlinked or cross-linked rows. Exact original lines and row IDs follow; authored amounts and units are transcribed without conversion.

| Recipe | Exact current ingredient rows and mappings |
| --- | --- |
| [001 Air Fryer Baked Oats](../../../app/src/main/assets/seed/bundled-library/recipes/001-air-fryer-baked-oats-0a8b29b8-faf0-4597-8514-e09335de6c03.v1.json) | `0a8b29b8-faf0-4597-8514-e09335de6c03-ingredient-6` — `1/2 tsp baking powder` → `ingredient-ref-baking-powder` |
| [008 Vanilla Cake](../../../app/src/main/assets/seed/bundled-library/recipes/008-best-vanilla-cake-41d7331d-2cf7-4a72-b1ce-ac90ffb97f33.v1.json) | `41d7331d-2cf7-4a72-b1ce-ac90ffb97f33-ingredient-3` — `2 tsp baking powder` → `ingredient-ref-baking-powder`<br>`41d7331d-2cf7-4a72-b1ce-ac90ffb97f33-ingredient-4` — `3/4 tsp baking soda` → `ingredient-ref-baking-soda` |
| [009 Chocolate Chip Cookies](../../../app/src/main/assets/seed/bundled-library/recipes/009-bicuit-aux-brisures-de-chocolat-chocolate-chip-cookies-3e2bd9d9-95fc-43ea-8d33-140de5b7de25.v1.json) | `3e2bd9d9-95fc-43ea-8d33-140de5b7de25-ingredient-6` — `1 tsp baking soda` → `ingredient-ref-baking-soda` |
| [012 Lemon Crinkle Cookies](../../../app/src/main/assets/seed/bundled-library/recipes/012-biscuits-froiss-s-au-citron-lemon-crinkle-cookies-f07ba465-a5c8-4fad-bba3-83941f165410.v1.json) | `f07ba465-a5c8-4fad-bba3-83941f165410-ingredient-9` — `1/2 tsp baking soda` → `ingredient-ref-baking-soda` |
| [013 Pinwheel Cookies](../../../app/src/main/assets/seed/bundled-library/recipes/013-biscuits-tourbillon-biscuits-pinwheel-cookies-4d4af0ad-f76b-4562-9956-60070fba7802.v1.json) | `4d4af0ad-f76b-4562-9956-60070fba7802-ingredient-2` — `1.5 tsp baking powder` → `ingredient-ref-baking-powder` |
| [021 Yule Log](../../../app/src/main/assets/seed/bundled-library/recipes/021-buche-de-noel-yule-log-30e4274f-19fd-47df-b90b-75a5eefdb2c8.v1.json) | `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-7` — `1 tsp baking powder` → `ingredient-ref-baking-powder` |
| [024 Date Squares](../../../app/src/main/assets/seed/bundled-library/recipes/024-carres-aux-dattes-date-squares-d2f76a5c-63b6-4dad-b33d-f3270a04f5c2.v1.json) | `d2f76a5c-63b6-4dad-b33d-f3270a04f5c2-ingredient-5` — `1/4 tsp baking soda` → `ingredient-ref-baking-soda`<br>`d2f76a5c-63b6-4dad-b33d-f3270a04f5c2-ingredient-9` — `1/4 tsp baking powder` → `ingredient-ref-baking-powder` |
| [038 Buttermilk Pancakes](../../../app/src/main/assets/seed/bundled-library/recipes/038-crepes-au-babeurre-buttermilk-pancakes-c72f5bef-39d8-476c-bf29-56dbe4719841.v1.json) | `c72f5bef-39d8-476c-bf29-56dbe4719841-ingredient-3` — `1/2 tsp baking powder` → `ingredient-ref-baking-powder`<br>`c72f5bef-39d8-476c-bf29-56dbe4719841-ingredient-4` — `1/2 tsp baking soda` → `ingredient-ref-baking-soda` |
| [039 Pancakes](../../../app/src/main/assets/seed/bundled-library/recipes/039-crepes-pancakes-943327bc-3791-4bff-82a4-1a4609d1b118.v1.json) | `943327bc-3791-4bff-82a4-1a4609d1b118-ingredient-2` — `1 tsp baking powder` → `ingredient-ref-baking-powder` |
| [047 Chocolate Galettes](../../../app/src/main/assets/seed/bundled-library/recipes/047-galettes-au-chocolat-chocolate-galettes-3a206140-a145-4871-92c6-7024ce958858.v1.json) | `3a206140-a145-4871-92c6-7024ce958858-ingredient-7` — `1/2 tsp baking soda` → `ingredient-ref-baking-soda` |
| [049 Strawberry Shortcake](../../../app/src/main/assets/seed/bundled-library/recipes/049-gateau-a-la-fraise-strawberry-shortcake-1fb908b6-f079-44f2-916b-1b6c6b55367c.v1.json) | `1fb908b6-f079-44f2-916b-1b6c6b55367c-ingredient-5` — `4 tsp baking powder` → `ingredient-ref-baking-powder`<br>`1fb908b6-f079-44f2-916b-1b6c6b55367c-ingredient-6` — `1/2 tsp baking soda` → `ingredient-ref-baking-soda` |
| [050 Devil’s Food Cake](../../../app/src/main/assets/seed/bundled-library/recipes/050-gateau-au-chocolat-devil-s-food-cake-4207e09a-429f-437f-b7bd-14e862d6d696.v1.json) | `4207e09a-429f-437f-b7bd-14e862d6d696-ingredient-2` — `2 tsp baking soda` → `ingredient-ref-baking-soda`<br>`4207e09a-429f-437f-b7bd-14e862d6d696-ingredient-4` — `1/2 tsp baking powder` → `ingredient-ref-baking-powder` |
| [051 Strawberry Cake](../../../app/src/main/assets/seed/bundled-library/recipes/051-gateau-aux-fraises-strawberry-cake-eadf54de-0fa2-4ef3-a620-3f6fbeac7c90.v1.json) | `eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-3` — `2 tsp baking powder` → `ingredient-ref-baking-powder`<br>`eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-4` — `1/2 tsp baking soda` → `ingredient-ref-baking-soda` |
| [052 Mango Cake](../../../app/src/main/assets/seed/bundled-library/recipes/052-gateau-aux-mangues-mango-cake-9ec55a0a-92b7-425d-9d7f-1a9a455022bb.v1.json) | `9ec55a0a-92b7-425d-9d7f-1a9a455022bb-ingredient-8` — `1 tsp baking powder` → `ingredient-ref-baking-powder`<br>`9ec55a0a-92b7-425d-9d7f-1a9a455022bb-ingredient-9` — `1 tsp baking soda` → `ingredient-ref-baking-soda` |
| [053 Carrot Cake](../../../app/src/main/assets/seed/bundled-library/recipes/053-gateau-aux-carottes-carrot-cake-1da10533-75ef-41b4-af55-298775c4c9ea.v1.json) | `1da10533-75ef-41b4-af55-298775c4c9ea-ingredient-6` — `2 tsp baking powder` → `ingredient-ref-baking-powder`<br>`1da10533-75ef-41b4-af55-298775c4c9ea-ingredient-8` — `2 tsp baking soda` → `ingredient-ref-baking-soda` |
| [054 Cookie Cake](../../../app/src/main/assets/seed/bundled-library/recipes/054-gateau-biscuit-cookie-cake-ad2f1317-aa4d-4d1e-9aec-0d70a72228af.v1.json) | `ad2f1317-aa4d-4d1e-9aec-0d70a72228af-ingredient-2` — `3/4 tsp baking soda` → `ingredient-ref-baking-soda` |
| [055 Coffee Cake](../../../app/src/main/assets/seed/bundled-library/recipes/055-gateau-dejeuner-coffee-cake-f6d10ccb-a696-4898-813b-a5a01e7f82ce.v1.json) | `f6d10ccb-a696-4898-813b-a5a01e7f82ce-ingredient-12` — `2 tsp baking powder` → `ingredient-ref-baking-powder` |
| [056 Pistachio Chocolate Mousse Cake](../../../app/src/main/assets/seed/bundled-library/recipes/056-gateau-mousse-a-la-pistache-et-au-chocolat-pistachio-chocolate-mousse-cake-04dff954-4213-492a-9194-4bed8553d145.v1.json) | `04dff954-4213-492a-9194-4bed8553d145-ingredient-4` — `5 g baking powder` → `ingredient-ref-baking-powder` |
| [057 Chocolate Truffle Cake](../../../app/src/main/assets/seed/bundled-library/recipes/057-gateau-quadruple-chocolat-chocolate-truffle-cake-f4807560-d19f-4e2d-aeab-80138564b93f.v1.json) | `f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-12` — `1 tbsp baking soda` → `ingredient-ref-baking-soda`<br>`f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-13` — `2 tsp baking powder` → `ingredient-ref-baking-powder` |
| [058 Queen Elizabeth Cake](../../../app/src/main/assets/seed/bundled-library/recipes/058-gateau-reine-elizabeth-queen-elizabeth-cake-a3d38f7e-1c25-402b-a51e-8f99680eb02c.v1.json) | `a3d38f7e-1c25-402b-a51e-8f99680eb02c-ingredient-8` — `1 tsp baking soda` → `ingredient-ref-baking-soda`<br>`a3d38f7e-1c25-402b-a51e-8f99680eb02c-ingredient-9` — `1 tsp baking powder` → `ingredient-ref-baking-powder` |
| [059 Buttermilk Waffles](../../../app/src/main/assets/seed/bundled-library/recipes/059-gaufres-au-babeurre-buttermilk-waffles-b676257d-c46f-4ddc-bb63-1516307ad18f.v1.json) | `b676257d-c46f-4ddc-bb63-1516307ad18f-ingredient-3` — `2 tsp baking powder` → `ingredient-ref-baking-powder`<br>`b676257d-c46f-4ddc-bb63-1516307ad18f-ingredient-4` — `1 tsp baking soda` → `ingredient-ref-baking-soda` |
| [060 Waffles](../../../app/src/main/assets/seed/bundled-library/recipes/060-gaufres-waffles-9ae958d9-1f55-4906-84bc-8f3436ce70ff.v1.json) | `9ae958d9-1f55-4906-84bc-8f3436ce70ff-ingredient-6` — `2 tsp baking powder` → `ingredient-ref-baking-powder` |
| [069 Double Chocolate Muffins](../../../app/src/main/assets/seed/bundled-library/recipes/069-muffins-double-chocolat-double-chocolate-muffins-81d376ac-c305-402f-a73d-8bb721045319.v1.json) | `81d376ac-c305-402f-a73d-8bb721045319-ingredient-2` — `1 tsp baking powder` → `ingredient-ref-baking-powder`<br>`81d376ac-c305-402f-a73d-8bb721045319-ingredient-3` — `1 tsp baking soda` → `ingredient-ref-baking-soda` |
| [070 Nanaimo Cake](../../../app/src/main/assets/seed/bundled-library/recipes/070-nanaimo-cake-f3ce6ed8-0389-457c-92ec-240cf53eacde.v1.json) | `f3ce6ed8-0389-457c-92ec-240cf53eacde-ingredient-2` — `1 tsp baking soda` → `ingredient-ref-baking-soda` |
| [073 Chocolate Banana Bread](../../../app/src/main/assets/seed/bundled-library/recipes/073-pain-aux-bananes-et-au-chocolat-chocolate-banana-bread-c5486a31-4047-4437-ad8b-14a6e776bdd5.v1.json) | `c5486a31-4047-4437-ad8b-14a6e776bdd5-ingredient-2` — `1/2 tsp baking soda` → `ingredient-ref-baking-soda`<br>`c5486a31-4047-4437-ad8b-14a6e776bdd5-ingredient-3` — `1 tsp baking powder` → `ingredient-ref-baking-powder` |
| [091 Red Velvet Cake with Cream Cheese Frosting](../../../app/src/main/assets/seed/bundled-library/recipes/091-gateau-red-velvet-au-glacage-au-fromage-a-la-creme-red-velvet-cake-with-cream-cheese-frosting-0bc95db3-300b-4594-88ca-ade36c66cde1.v1.json) | `0bc95db3-300b-4594-88ca-ade36c66cde1-ingredient-2` — `1 tsp baking soda` → `ingredient-ref-baking-soda` |
| [094 Brownie Cookie Sandwiches](../../../app/src/main/assets/seed/bundled-library/recipes/094-sandwiches-de-biscuits-brownies-brownie-cookie-sandwiches-c97910fb-2301-40c7-8019-433bb361c44c.v1.json) | `c97910fb-2301-40c7-8019-433bb361c44c-ingredient-10` — `1 tsp baking powder` → `ingredient-ref-baking-powder`<br>`c97910fb-2301-40c7-8019-433bb361c44c-ingredient-11` — `1 tsp baking soda` → `ingredient-ref-baking-soda` |
| [114 German Chocolate Cake](../../../app/src/main/assets/seed/bundled-library/recipes/114-gateau-au-chocolat-allemand-german-chocolate-cake-e2d11309-7775-4efb-981c-2c78a8d03da6.v1.json) | `e2d11309-7775-4efb-981c-2c78a8d03da6-ingredient-4` — `2 tsp baking soda` → `ingredient-ref-baking-soda`<br>`e2d11309-7775-4efb-981c-2c78a8d03da6-ingredient-5` — `1 tsp baking powder` → `ingredient-ref-baking-powder` |

No recipe row uses an alias spelling in this scan; the proposed aliases are for future bilingual and imported-text matching. No recipe line needs remapping.

## Live snapshot, identity owners, and collisions

The following read-only snapshot was taken from the shared worktree on 2026-10-10. The manifest-listed corpus hash uses each listed relative recipe path, a NUL byte, exact file bytes, and a NUL byte in manifest order. Re-read these live files before any later integration because other catalog work may proceed concurrently.

| Artifact | Snapshot count | SHA-256 |
| --- | ---: | --- |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `ingredient-references.v1.json` | 869 rows | `b51bf8e8aa2198b54e789eca1063bb843e29ac157bea7cfae98d3329e9dc810a` |
| `ingredient-forms.v1.json` | 48 rows | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `research-ledger.v1.json` | 1,115 records | `481f3718f9b7ef27035584edb5c0c4dc4d9ca5d2ae6eb80443871104e86dff1e` |
| `legacy-import-identities.v1.json` | 78 candidates | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `84bc23e6f72f9ecbe51642710e395fde7cf48dcb40abeae676f9d6957fba68b0` |

| Current owner | Current state |
| --- | --- |
| `ingredient-ref-baking-soda` | EN `baking soda`; FR `bicarbonate de soude`; EN alias `bicarbonate of soda`; FR aliases `soda à pâte`, `petite vache`; category `BAKING_AND_SPICE`; no forms, density, or unit mappings. Ledger identity state `unreviewed`; measurement and substitution research states `blocked_pending_evidence`. |
| `ingredient-ref-baking-powder` | EN `baking powder`; FR `poudre à pâte`; no aliases; category `BAKING_AND_SPICE`; no forms, density, or unit mappings. Ledger identity state `unreviewed`; measurement state `blocked_pending_evidence`; substitution research `not_yet_researched`. |
| Adjacent, out-of-scope identities | Cream of tartar remains `ingredient-ref-cream-of-tartar` with its newly integrated OQLF aliases. Self-rising flour remains a separate `ingredient-ref-self-rising-flour`; the ammonium proposal addresses ammonium leaveners. No merge is proposed. |

The active substitution-rules and contextual-substitution-rules files each contain zero rows. The soda ledger record already cites King Arthur’s source-specific recommendation of 3 teaspoons baking powder per 1 teaspoon baking soda by volume, warns of a possibly bitter result, and says not to infer the inverse. It is retained as a limited source finding, not an active rule; this identity integration did not promote it, add another ratio, or represent the two ingredients as direct equivalents. The current plan separately prohibits treating them as direct equivalents.

Proposed aliases were checked as complete normalized phrases against active reference names/aliases, form labels/match terms, and all legacy candidates. No alias has another exact owner in those identity-bearing files. The current exact owners are the two IDs above. No “sodium carbonate” identity is proposed. Prefix `WP02-E-SODA-POWDER-20261010` was absent from the live ledger and proposal text before source IDs below were assigned.

## Identity boundary and merge-ready outline

OQLF defines sodium bicarbonate as a fine powder that helps dough rise and explicitly says it is one ingredient of chemical leavener, premixed there with an acid. It gives `bicarbonate de sodium` and `bicarbonate de soude` as preferred French terms, describes `soda à pâte` as familiar Québec usage, and lists `petite vache` as familiar Quebec expression. OQLF’s baking-powder entry defines a mixture and lists `levure chimique`, `poudre levante`, `poudre à lever`, and Québec/Canada `poudre à pâte` as preferred French terms. CFIA’s permitted-synonym tables independently name baking soda under sodium bicarbonate and list the technical sodium bicarbonate forms proposed above. These naming sources support aliases, not quantities or recipes.

CFIA’s Canadian compositional standard identifies baking powder as a combination of sodium or potassium bicarbonate, acid-reacting material, and starch or another neutral material. Its acid-reacting-material definition permits multiple classes. This is enough to keep baking powder as a compound identity distinct from soda; it does not establish one universal formula, require cream of tartar, or support a conversion. The term `carbonate de sodium` must remain out: OQLF defines that as sodium carbonate (Na₂CO₃), not baking soda. Also leave bare `soda` out because OQLF defines it as a carbonated beverage.

```text
retain id: ingredient-ref-baking-soda
retain nameEn: baking soda
retain nameFr: bicarbonate de soude
retain category: BAKING_AND_SPICE
retain current aliases: EN [bicarbonate of soda]; FR [soda à pâte, petite vache]
integrated aliasesEn: [sodium bicarbonate]
integrated aliasesFr: [bicarbonate de sodium, carbonate acide de sodium, hydrogénocarbonate de sodium]
defaultDensity: null
unitMappings: []
forms: none
recipe mappings: retain all 21 current soda rows

retain id: ingredient-ref-baking-powder
retain nameEn: baking powder
retain nameFr: poudre à pâte
retain category: BAKING_AND_SPICE
integrated aliasesFr: [levure chimique, poudre levante, poudre à lever]
defaultDensity: null
unitMappings: []
forms: none
recipe mappings: retain all 22 current powder rows
```

## Numeric, form, and substitution disposition

- **Identity:** retain the current IDs, category, and display names; add only the terminology aliases above. Do not merge soda with powder, cream of tartar, ammonium leaveners, or self-rising flour.
- **Forms:** none proposed. The corpus names the ingredient directly; no distinct physical/preparation state is needed.
- **Numeric data:** preserve all authored quantities exactly as shown in the recipe table. Add no density, package measure, unit mapping, recipe amount conversion, or baking-powder formula.
- **Substitution:** add no rule or direct-equivalence claim. The existing ledger’s King Arthur volume recommendation remains source-scoped, with no inverse inferred. The named formulas and products in baking recipes may include other acid ingredients and do not establish a globally safe exchange.

## Sources and access limits

All online sources below were accessed on 2026-10-10. The identity sources below are recorded in the baking-soda and baking-powder ledger records; existing ledger source ID `WP08-S01` remains the source for the narrow substitution observation rather than receiving a duplicate.

| Source ID | Source and locator | Evidence used and limits |
| --- | --- | --- |
| **WP02-E-SODA-POWDER-20261010-S01** | [OQLF GDT, bicarbonate de sodium](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26542600/bicarbonate-de-sodium), last updated 2016; definition, notes, preferred terms, English equivalents | Supports the single sodium-bicarbonate identity; FR preferred terms `bicarbonate de sodium` and `bicarbonate de soude`; Québec usages `soda à pâte`, `petite vache`; EN `sodium bicarbonate`, `bicarbonate of soda`, `baking soda`, and `soda`. The source itself notes familiar-use/ambiguity limits for `petite vache` and `soda`. Terminology source, not a recipe formula. |
| **WP02-E-SODA-POWDER-20261010-S02** | [OQLF GDT, levure chimique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8409568/levure-chimique), last updated 2015; definition and preferred terms | Supports the compound-product identity and FR terms `levure chimique`, `poudre levante`, `poudre à lever`, and Québec/Canada `poudre à pâte`; English `baking powder`. It is terminology and definition evidence, not a universal product recipe. |
| **WP02-E-SODA-POWDER-20261010-S03** | [CFIA permitted synonyms for food additives (English)](https://inspection.canada.ca/en/food-labels/labelling/industry/food-additives/permitted-synonyms), Sodium bicarbonate row | Lists `Baking soda` under sodium bicarbonate, supporting the existing common name. It does not supply the added English technical alias; `sodium bicarbonate` is listed by OQLF as the English equivalent. This is a permitted food-additive synonym table, not a complete ingredient catalogue or baking-powder composition standard. |
| **WP02-E-SODA-POWDER-20261010-S04** | [CFIA Tableau des synonymes autorisés (French)](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/additifs-alimentaires/synonymes-autorises), Bicarbonate de sodium row | Lists `Bicarbonate de soude`, `Carbonate acide de sodium`, and `Hydrogénocarbonate de sodium` under `Bicarbonate de sodium`. Same permitted-label-synonym limitation as the English table. |
| **WP02-E-SODA-POWDER-20261010-S05** | [CFIA, Canadian Food Compositional Standards, Volume 3 — Baking Powder](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §§ 3.0.1 and 3.1.1 | Incorporated Canadian compositional standard for baking powder; names bicarbonate, acid-reacting material, and starch/neutral material as the combination. The listed acid-reacting materials include more than one acid/salt class. It does not require cream of tartar specifically or provide household substitution advice. |
| **WP02-E-SODA-POWDER-20261010-S06** | [OQLF GDT, carbonate de sodium](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8486056/carbonate-de-sodium), last updated 1973; definition and English equivalents | Negative-control terminology: identifies `carbonate de sodium` as sodium carbonate (Na₂CO₃), with English `sodium carbonate` / `soda ash`. The old entry remains clear for this distinction but is not a current food-product specification. |
| **WP02-E-SODA-POWDER-20261010-S07** | [OQLF GDT, soda](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529355/soda), last updated 2014 | Negative-control terminology: defines `soda` as carbonated water and notes broader beverage use. Supports leaving bare `soda` out of baking-soda aliases. |
| **Existing `WP08-S01`** | [King Arthur Baking, “What’s the difference between baking soda and baking powder?”](https://www.kingarthurbaking.com/blog/2021/09/10/baking-soda-vs-baking-powder-substitutions), published 2021-09-10; accessed 2026-10-10; substitutions for baking soda | Its source advice is 3 tsp baking powder per 1 tsp baking soda, volume-to-volume, and warns of a slightly bitter/off-putting taste. It is a culinary-advice page, not a validated rule for any bundled formula; ledger already marks it limited and explicitly says not to infer the inverse. No numerical rule is proposed here. |

## Remaining checklist work and local references

Section E’s parent item remains open; the cream-of-tartar and soda/powder identity children are checked. The separate baking-substitution prohibition remains in force. This review closes only the soda/powder identity and alias audit; broader Section E coverage and the separate ammonium review remain open.

- [Project requirements](../../../Requirements.md)
- [Active catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt)
- [Active bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
- [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Active substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json)
- [Research ledger](../research-ledger.v1.json)
- [Legacy identity candidates](../legacy-import-identities.v1.json)
- [Ingredient search normalization](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)
- [Integrated cream-of-tartar identity audit](wp02-section-e-cream-of-tartar-identity-audit-20261010.md)
- [Separate ammonium-leavener review](wp02-baking-ammonia-ammonium-leaveners-review-20261009.md)
