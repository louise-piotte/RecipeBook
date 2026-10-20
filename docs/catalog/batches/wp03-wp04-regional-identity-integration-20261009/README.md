# WP03/WP04 regional identity integration — 2026-10-09

## Scope

This batch records the accepted WP03 Section J and M identity additions, the related WP03 Section K and WP04 regional-fish identities already integrated in the preceding review, the current catalog audit, and fresh Pixel 9a picker verification. The coordinator packets contain the full candidate scans and source-by-source evidence:

- [WP03 Section J roots and aromatics review](../../proposals/wp03-roots-aromatics-coordinator-review-20261009.md)
- [WP03 Section K leafy-greens review](../../proposals/wp03-leafy-greens-coordinator-review-20261009.md)
- [WP03 Section M small-fruit review](../../proposals/wp03-fruit-citrus-coordinator-review-20261009.md)
- [WP04 Section P seafood review](../../proposals/wp04-seafood-coordinator-review-20261009.md)

The reports audited active references and forms, legacy candidates, and recipe ingredient rows. The J/M review snapshot was 524 references, 32 forms, 704 research-ledger records, 97 legacy candidates, and 114 recipes / 1,123 ingredient rows. The scan found an explicit red-onion line in recipe 018 still linked to generic onion, plus the Russet potato line in recipe 078. This batch relinked only the explicit Russet line; the red-onion link remains for the broader onion-type reconciliation. No bundled recipe row names the seven small-fruit additions.

## Integrated identities

### Section M: seven small fruits

All entries are `FRUIT` identities. The existing blackberry legacy candidate was promoted and reconciled; six other fruit references were added.

| ID | English / fr-CA | Active aliases and boundary |
|---|---|---|
| `ingredient-ref-blackberry` | blackberry / mûre | Reconciled the existing legacy candidate. Keep the Rubus meaning scoped; do not use `mûre` for mulberry or black raspberry. |
| `ingredient-ref-black-currant` | black currant / cassis | `blackcurrant`; `groseille noire`, `gadelle noire`. |
| `ingredient-ref-red-currant` | red currant / groseille rouge à grappes | `redcurrant`; `gadelle rouge`, `groseille rouge`. |
| `ingredient-ref-gooseberry` | gooseberry / groseille à maquereau | Keep the French qualifier; bare `groseille` can collide with currants. |
| `ingredient-ref-elderberry` | elderberry / baie de sureau | Keep the fruit phrase; no bare `sureau` alias. |
| `ingredient-ref-lingonberry` | lingonberry / airelle rouge | French alias `airelle`; do not merge with cranberry or assign `atoca` here. |
| `ingredient-ref-cloudberry` | cloudberry / chicouté | Use the Québec term; do not add broad `salmonberry` wording. |

OQLF’s [small-fruit vocabulary](https://www.oqlf.gouv.qc.ca/ressources/bibliotheque/dictionnaires/terminologie_fruits.aspx) and its entries for [mûre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357938/mure), [cassis](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358081/cassis), [red currant](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869787/groseille-rouge-a-grappes), [gooseberry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869786/groseille-a-maquereau), [elderberry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083833/baie-de-sureau), [lingonberry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358162/airelle), and [cloudberry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358247/chicoute) support the names and distinctions. Fresh/frozen/dried/preserved forms remain separate work; no recipe measures or substitutions were inferred.

### Section J: roots and aromatics

| ID | English / fr-CA | Category and boundary |
|---|---|---|
| `ingredient-ref-red-onion` | red onion / oignon rouge | `VEGETABLE_AND_AROMATIC`; distinct from generic onion. |
| `ingredient-ref-white-onion` | white onion / oignon blanc | `VEGETABLE_AND_AROMATIC`; distinct from generic onion. |
| `ingredient-ref-garlic-scape` | garlic scape / fleur d’ail | `VEGETABLE_AND_AROMATIC`; edible scape, not garlic bulb or Chinese chives. |
| `ingredient-ref-horseradish` | horseradish / raifort | `VEGETABLE_AND_AROMATIC`; distinct from radish and prepared sauce. |
| `ingredient-ref-greater-galangal` | greater galangal / grand galanga | `VEGETABLE_AND_AROMATIC`; no ginger-like regional aliases. |
| `ingredient-ref-lemongrass` | lemongrass / verveine des Indes | `HERB`; omit `citronnelle` because of its lemon-balm usage. |
| `ingredient-ref-taro` | taro / taro | `VEGETABLE_AND_AROMATIC`; keep separate from malanga; eddoe remains unresolved. |
| `ingredient-ref-malanga` | malanga / malanga | `VEGETABLE_AND_AROMATIC`; keep separate from taro and true yam. |
| `ingredient-ref-yam` | true yam / igname | `VEGETABLE_AND_AROMATIC`; scoped to *Dioscorea*, not North American sweet-potato usage of “yam.” |
| `ingredient-ref-white-salsify` | white salsify / salsifis blanc | `VEGETABLE_AND_AROMATIC`; keep distinct from black salsify. |
| `ingredient-ref-black-salsify` | black salsify / scorsonère | `VEGETABLE_AND_AROMATIC`; keep distinct from white salsify. |
| `ingredient-ref-russet-potato` | Russet potato / pomme de terre Russet | `VEGETABLE_AND_AROMATIC`; named potato class, not a claim that all Russets are Russet Burbank. |

OQLF entries for [red onion](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296967/oignon-rouge), [white onion](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296970/oignon-blanc), [horseradish](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095252/raifort), [greater galangal](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502749/grand-galanga), [lemongrass](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17045878/verveine-des-indes), [taro](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19466379/taro), [malanga](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/42924/malanga), [true yam](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082772/igname), [white salsify](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296890/salsifis), and [black salsify](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296886/scorsonere) ground the names and identity boundaries. Ail Québec documents the edible garlic scape; [AAFC](https://publications.gc.ca/collections/collection_2023/aac-aafc/A118-10-34-2021-eng.pdf) supports the edible hardneck-garlic scape. Health Canada's [Canadian Nutrient File](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=5284&lang=fre) supplies the Russet bilingual descriptor; CFIA's [Russet Burbank page](https://inspection.canada.ca/en/plant-health/potatoes/potato-varieties/russet-burbank) establishes that Russet Burbank is a specific cultivar, not a synonym for every Russet potato.

Recipe 078, *Pâté chinois*, now links its explicit 1.5 lb Russet potato line to `ingredient-ref-russet-potato`. The original line text, amount, and peeled/cubed preparation are preserved. The Russet alias was removed from generic `ingredient-ref-potato`. Recipe 018's explicit `75 g red onion, minced` line remains linked to generic onion pending the onion-type link review; no other recipe line was relinked.

### Previously integrated Section K and WP04 identities rechecked

The current build also returned these already integrated greens and fish identities in the picker:

- Section K greens: mustard greens / feuilles de moutarde; turnip greens / feuilles de navet; beet greens / feuilles de betterave; dandelion greens / feuilles de pissenlit; arugula / roquette; watercress / cresson de fontaine; common sorrel / oseille commune; Belgian endive / endive; escarole / scarole; radicchio / radicchio.
- WP04 species-scoped fish: Arctic char / omble chevalier (with the narrow `Arctic charr` alias) and American eel / anguille. No bare `char`, `charr`, or `eel` aliases were activated.

The K source map is in the linked leafy-greens report. For fish, OQLF identifies [omble chevalier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198861/omble-chevalier) and [anguille](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199945/anguille); Fisheries and Oceans Canada supplies the [Arctic char species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/arctic-char-omble-chevalier-fra.html) and [American eel regional assessment](https://waves-vagues.dfo-mpo.gc.ca/Library/348251.pdf). Parks Canada's [Eel Stew](https://parks.canada.ca/culture/gourmand-gourmet/recette-recipe80) is one recipe-specific adaptation source only; it does not establish global eel measures or substitutions.

## Audit and package result

The integration adds 19 active references relative to the 524-reference pre-merge catalog. Promoting the blackberry legacy candidate reduces the candidate list by one. The fruit/root entries have no forms, default densities, unit mappings, package yields, conversions, or substitutions. The two fish identities and ten greens also remain identity-only.

| Artifact | Current count | SHA-256 |
|---|---:|---|
| Ingredient references | 543 | `ff539f497796d9eac76fb647ec619bbeb4af076a72bf7a23ed48935ba13196fb` |
| Ingredient forms | 32 | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| Manifest recipe paths | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 722 records / 1,178 source entries / 992 source IDs | `395564521aba7a8be6aef27f210122330a97a43629857682054c55d6e2b69182` |
| Legacy candidates | 96 | `91173bf115fadd4e78e6e4589b87c30ca20fb4eda152fce8ca9c07335a9bd626` |
| Manifest-ordered recipe corpus | 114 recipes / 1,123 ingredient rows | `451f26f55ca849f0edf0a8a64a9abdf594b178e47d3ed6bcd113b26f451cecfd` |

The recipe-corpus digest is SHA-256 over each manifest-listed relative path, a NUL byte, the exact recipe file bytes, and a NUL byte, in manifest order. UTF-8 without BOM was verified for the changed bundled JSON. Package and reference normalization, generated-index freshness, and research-ledger validation passed. The Python seed-package suite passed 10 tests; `:app:testDebugUnitTest` passed all 316 tests.

## Pixel 9a / Android 16 verification

The app was freshly deployed to `emulator-5556` after the tests. Representative searches returned the intended localized identity:

| Screenshot | Search | Result |
|---|---|---|
| `en-black-currant.png` | `blackcurrant` | black currant |
| `en-red-currant.png` | `redcurrant` | red currant |
| `en-russet-potato.png` | `russet potato` | Russet potato |
| `fr-cloudberry.png` | `chicoute` | chicouté |
| `fr-gooseberry.png` | `groseille a maquereau` | groseille à maquereau |
| `fr-lemongrass.png` | `verveine des Indes` | verveine des Indes |
| `fr-garlic-scape.png` | `fleur` | results include fleur d’ail |
| `fr-arugula.png` | `roquette` | roquette |
| `fr-arctic-char.png` | `omble chevalier` | omble chevalier |
| `fr-american-eel.png` | `anguille` | anguille |

The unsaved draft was discarded; the final French home shows 114 recipes in `fr-home-114.png`.

### Screenshot SHA-256

| File | SHA-256 |
|---|---|
| `en-black-currant.png` | `90d6129d4c57982bd70a891c46a5920b6f24acc938423c8abf0dd109ba7c0a9e` |
| `en-red-currant.png` | `bb81f491695b97732955184b7990c4216b17a78a98a50f76004dfcb8bed223bf` |
| `en-russet-potato.png` | `b720efb3a2fd2765da3dc9f2c07f5cebc5d8d1dc3c0b90282e3898e25ec4830d` |
| `fr-american-eel.png` | `a7a7fce0ed999ba144230e2dd51e8c049bc4c358803e0e6ca3c8c074fa296636` |
| `fr-arctic-char.png` | `039d32ccd96fdc332afd57c41354f8ae9a890a5631a13f511557603817b8724d` |
| `fr-arugula.png` | `c85da994c7887e63bd01c0f2fef5578c741c1873f0352c0089158d8909a00917` |
| `fr-cloudberry.png` | `f6ee88cf598a4dff9ba1b6975a092a4dfa162382a32572c6fbafac005a85adae` |
| `fr-garlic-scape.png` | `1d5ea3deb6efcac1f1af71c9377cd576f5c4d3ef81a0b9168ccee9e60e7eb85f` |
| `fr-gooseberry.png` | `29c244f99eb666f7e124a4edc8a68fbf00da6481ad6dfe7c6b93d5f9446a9de9` |
| `fr-home-114.png` | `3269218b8ed869cae4497d8350c9b277440c62ae4f3f4ca3ce64eaf939f15128` |
| `fr-lemongrass.png` | `86fec6d92a4b22657d8117c160d55b9a80adc7f221afbe7d5936b33a3e08569d` |

## Remaining work

The broad plan stays open. Section J still needs onion-type distinctions (including reconciliation of recipe 018's red-onion link), fingerroot, fresh wasabi root, eddoe, arrowhead, and further potato/tuber review. Section K's wider leafy-green and regional sweep plus independent Québec/community terminology review remains open. Section M still needs most fruit families, citrus, dates/pomegranate boundaries, dried and preserved products, and fruit forms. Section P still needs broad finfish and shellfish coverage, preservation products, roe, surimi, and regional aquatic foods. Measurement and substitution work remains separate and requires source-specific evidence.
