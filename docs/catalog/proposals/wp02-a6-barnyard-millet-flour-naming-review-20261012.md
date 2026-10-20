# WP02 A6 follow-up: barnyard millet flour naming hold

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Hold integrated into the A6 checklist, roadmap, and workflow on 2026-10-12. No active catalog data was added; see [hold README](../batches/wp02-a6-barnyard-millet-flour-hold-integration-20261012/README.md).
- **Scope:** One still-unallocated regional grain-flour candidate under the open WP02 A6 checklist: barnyard millet flour.
- **Proposal-local source IDs:** WP02-A6-BARNYARD-FLOUR-20261012-S01 through S08. The prefix was checked against the shared research ledger before drafting and was absent.
- **Related decisions:** The 2026-10-11 WP03 barnyard-millet grain review holds the grain unallocated because food-standard and agricultural sources do not settle one species scope or Québec French display. This proposal reviews the separately named flour product, which that grain review did not address. The prior A6 brown-top-millet-flour hold and the accepted generic, Job’s-tears, color-quinoa, sprouted-amaranth, black-fonio, kodo, proso, and foxtail flour decisions are not reopened.
- **A6 status:** The broad A6 regional-flour checklist remains open.

## Integration status (2026-10-12)

Root accepted the evidence-based hold. Barnyard millet flour remains an unallocated A6 candidate because the Canadian product listing supplies no source-grain species or French name, while available Québec wording is generic and `millet japonais` has conflicting species associations across agricultural/international sources. No reference, alias, form, ledger record, or recipe link was added. See the [hold README](../batches/wp02-a6-barnyard-millet-flour-hold-integration-20261012/README.md).

## Recommendation

**Hold barnyard millet flour as an unallocated A6 candidate.** A current Canadian retailer lists a flour product under the exact English name “S&V Barnyard Millet Flour,” so this is a real, distinct product-naming gap. The product page gives no botanical source-grain declaration and no French name. The available Québec evidence supports generic farine de millet, while Québec agricultural and international French sources attach millet japonais to different Echinochloa species. The evidence does not support one precise bilingual identity or safe alias set.

Do not create ingredient-ref-barnyard-millet-flour. Do not add barnyard millet flour as an alias to the generic millet-flour row, and do not invent farine de millet barnyard, farine de millet japonais, farine de millet des granges, or a French regional-name equivalent. Keep source names such as Sanwa, Sawa, Jhangora, and Kuthiraivali documentary unless a Québec/Canadian food source supports one for a defined scope. [S01–S08]

| Wording or candidate | Disposition | Current boundary |
|---|---|---|
| barnyard millet flour | **Hold; do not allocate an active reference.** | A Canadian retailer lists the product name, but supplies no species or French display. [S01] |
| ingredient-ref-barnyard-millet-flour | **Working placeholder only; do not create.** | No active reference, form, legacy candidate, or ledger record uses the ID. |
| millet flour / farine de millet | Keep on the existing generic row, ingredient-ref-millet-flour. | These generic phrases already have an exact active owner. Québec product-directory evidence does not identify a species. [S02–S03] |
| millet japonais / millet du Japon | Do not use for barnyard millet flour. | A Québec crop guide associates millet japonais with Echinochloa frumentacea, while FAO uses the same French name for E. esculenta. Neither source is a Québec human-food flour label. [S06–S08] |
| Sanwa, Sawa, Jhangora, Kuthiraivali, and related regional names | Keep as source-specific wording, not active aliases. | Indian food and agricultural sources do not make these Québec French names or establish one botanical scope for the Canadian product. [S04–S06] |
| Activated or otherwise process-qualified barnyard millet flour | Outside this review. | No process, product-state, or flour-grade identity is proposed here. |

## Evidence and Québec naming boundary

The Ontario retailer Indian Grocery Store currently lists S&V Barnyard Millet Flour alongside other S&V millet products. The listing establishes a Canadian marketed flour name and a retail package, but does not state the flour’s botanical source, milling details, or French wording. Its package size is not a kitchen measure. [S01]

Québec sources do not supply a species-qualified French flour name. The Québec Food Directory lists Cuisine Soleil’s Organic Millet Flour with the French product and ingredient wording farine de millet biologique, but does not identify the millet species. OQLF describes millet as a generic term covering multiple species and lists millet, mil, and petit mil as preferred generic terms; the entry does not define barnyard millet or a barnyard flour. These sources support the generic row already in the catalog, not a barnyard-specific alias. [S02–S03]

The species and French-name evidence is not aligned closely enough to promote the flour. Health Canada’s crop-group table lists barnyard millet as Echinochloa frumentacea in an agricultural/residue-classification context. FSSAI’s whole-or-dehulled millet standard lists “Barnyard Millet (Samakechawal or Sanwa or Jhangora)” as E. crus-galli and E. colona. ICAR–IIMR discusses Indian E. frumentacea and Japanese E. esculenta as barnyard millets. These are authoritative sources for their respective classifications, but they do not establish which taxon the Canadian flour listing contains or that the names should be collapsed into one global ingredient row. [S04–S06]

The tempting French wording millet japonais is not a stable resolution. FAO’s French millet page associates millet japonais with E. esculenta. A Québec AgriRéseau vineyard-cover guide uses millet japonais / Japanese millet for E. frumentacea, in a crop-cover context rather than a food label. Without a supplier declaration and a Québec human-food name, the expression would conceal the unresolved source-grain scope. [S06–S08]

The previous WP03 grain review reached the same narrow naming and species hold for barnyard millet itself. This flour proposal is distinct: the Canadian retailer’s flour listing establishes a new A6 product-name candidate, but adds no evidence resolving the parent grain scope or French product name. See [the WP03 barnyard-millet grain review](wp03-section-f-next-grain-review-20261011.md) and the [open A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt).

## Live package, ledger, exact ownership, and recipes

The read-only audit used the live split seed package, the legacy candidate file, the shared research ledger, and all manifest-listed recipe JSON files. Exact phrase matching used the repository’s NFKD/case-fold, accent and ligature fold, punctuation replacement, and whitespace-collapse behavior from the seed-package normalizer.

| Surface | Current snapshot | Hash or fingerprint |
|---|---:|---|
| Ingredient references | 1,218 | SHA-256 a446785f1cd9b409d9220ab6471dff9b9834ff7a7c9333bcbcae49352ff43933 |
| Ingredient forms | 86 | SHA-256 24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978 |
| Legacy import candidates | 66 | SHA-256 bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f |
| Research ledger | 1,520 records; 5,139 source entries; 4,202 distinct source IDs | SHA-256 a8c9e1e7597d29535831c7b43d3bb5627f5f78905567add80753ea61b51d68d2 |
| Seed manifest | 114 recipe paths | SHA-256 b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | Fingerprint dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622 |
| Generated Kotlin ingredient catalog | 1 file; 1,218 generated references | SHA-256 453204d42068302ec9ec1891e93c9a649f96e1714c8a79f046fd96676ca9aade |

The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, the file’s exact bytes, and a trailing NUL byte. All file hashes cover exact bytes.

Exact normalized owners across active reference names/aliases, form labels/match terms, and legacy candidate names/aliases:

| Exact wording or ID | Owner |
|---|---|
| millet flour; farine de millet | ingredient-ref-millet-flour |
| barnyard millet flour; barnyard flour; barnyard millet | None |
| farine de millet barnyard; farine de millet japonais; farine de millet des granges | None |
| millet japonais; millet du Japon; Japanese millet | None |
| Sanwa; Sawa; Jhangora; Samakechawal; Kuthiraivali | None |
| ingredient-ref-barnyard-millet-flour; candidate-barnyard-millet-flour; candidate-barnyard-millet | None |

No form owns the candidate wording or ID. No legacy candidate owns the candidate wording or ID. The ledger has no barnyard-flour record or candidate ID. It contains the accepted ingredient-ref-common-millet record; one of that record’s existing Canadian crop-group sources mentions barnyard millet to distinguish it from proso millet. That source does not represent or resolve a barnyard identity. No ledger change is proposed.

The manifest-listed recipe scan covered barnyard millet flour, barnyard millet, French candidate constructions, millet japonais, Japanese millet, the botanical names E. frumentacea, E. esculenta, E. crus-galli, and E. colona, and the cited regional names. It found **zero recipe-file hits and zero ingredient-row hits**. No recipe link, relink, or recipe change is supported. The current exact owners for the generic phrases remain on ingredient-ref-millet-flour.

The source-ID prefix WP02-A6-BARNYARD-FLOUR-20261012 was absent from all ledger source IDs at review. These IDs remain proposal-local evidence citations because the hold did not require a shared ledger record.

## Data boundary and reopen criteria

Do not change the canonical references, forms, legacy candidates, ledger, generated catalog, or recipes from this proposal. If accepted as a hold, add no active ingredient ID, alias, form, density, unit mapping, recipe link, measurement, conversion, cooking yield, substitution, or other numeric behavior.

Revisit the flour only when evidence identifies the source grain for a current Canadian product and a Québec/Canadian human-food label or terminology source supports a precise French name for that scope. Reconcile the applicable Echinochloa taxonomy before using millet japonais or regional names as aliases. If a future recipe names a specific supplier product, audit that product and recipe line separately. This review leaves the broad WP02 A6 regional-flour checklist open.

## Proposal-local source register

All sources were accessed or rechecked on 2026-10-12. The IDs are unique to this proposal, proposal-local, and not registered in the shared ledger.

| Source ID | Source and evidence | Limits |
|---|---|---|
| WP02-A6-BARNYARD-FLOUR-20261012-S01 | Indian Grocery Store, [S&V Millets collection](https://indiangrocerystore.ca/collections/s-v-millets). Current Ontario retailer listing names “S&V Barnyard Millet Flour” and displays it with the S&V millet products. | Retail listing only; no botanical species, source-grain declaration, French wording, milling specification, or recipe measure. |
| WP02-A6-BARNYARD-FLOUR-20261012-S02 | Répertoire des aliments québécois, [Farine de Millet Biologique / Organic Millet Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223769), Cuisine Soleil. Names farine de millet biologique and gives a generic millet-flour ingredient declaration for a Québec-market product. | The entry does not state millet species; it supports generic French wording only. |
| WP02-A6-BARNYARD-FLOUR-20261012-S03 | Office québécois de la langue française, [millet, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), updated 2010. Lists millet, mil, and petit mil and explains that millet is generic across species. | Does not name barnyard millet or a barnyard flour product. |
| WP02-A6-BARNYARD-FLOUR-20261012-S04 | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), cereal-grain crop subgroup 15-21E. Lists millet, barnyard as Echinochloa frumentacea. | Crop/residue classification, not a consumer label, food flour specification, or French terminology source. |
| WP02-A6-BARNYARD-FLOUR-20261012-S05 | Food Safety and Standards Authority of India, [Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/5_%20Chapter%202_4%20%28Cereals%20and%20Cereal%20products%29.pdf), standard for millets. Applies to whole or dehulled millets and lists barnyard millet with the names Samakechawal, Sanwa, or Jhangora and the taxa E. crus-galli and E. colona. | Indian food standard; not a Canadian or Québec flour label and does not resolve the source of the Canadian retail product. |
| WP02-A6-BARNYARD-FLOUR-20261012-S06 | ICAR–Indian Institute of Millets Research, [Good Agricultural Practices Manual for Sustainable Millets Production in India](https://www.millets.res.in/pub/2026/GAP-English.pdf), 2025 edition, barnyard-millet chapter. Distinguishes Indian E. frumentacea and Japanese E. esculenta in its agricultural discussion. | Agricultural institute source, not a Québec/Canadian food label or nomenclature crosswalk. |
| WP02-A6-BARNYARD-FLOUR-20261012-S07 | Food and Agriculture Organization of the United Nations, [À propos de l’Année internationale du mil 2023](https://www.fao.org/millets-2023/about/fr), “Millet japonais” entry. Pairs the French name millet japonais with E. esculenta. | International French food/crop source; not a Québec naming recommendation or a flour label. |
| WP02-A6-BARNYARD-FLOUR-20261012-S08 | AgriRéseau, [Cultures de couverture pour les vignobles du Québec](https://www.agrireseau.net/documents/Document_109377.pdf), 2023, pp. 30–31. Uses millet japonais / Japanese millet for E. frumentacea as a vineyard cover crop. | Québec agricultural context, not human-food or flour terminology; the species association differs from FAO’s entry. |

## Disposition

Keep barnyard millet flour held and unallocated under WP02 A6. The current Canadian retail listing establishes the product-name gap; available Québec naming and authoritative crop/food sources do not settle a stable source-grain scope and French food name. Do not change any shared catalog or recipe data. Continue the broad A6 review.

