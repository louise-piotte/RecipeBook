# WP05 Section V — Vinegar and acid-product gap review

**Packet type:** proposal-only catalog and corpus review  
**Reviewed and source-access date:** 2026-10-12  
**Status:** recommendations only; Section V remains open  
**Scope:** common vinegar identities beyond the integrated rice-vinegar group, plus neighboring acidic products that must remain separate.  
**Source namespace:** `WP05-VINEGAR-GAP-20261012-S01` through `S10`; checked against the current ledger and existing proposal/batch documents, with no exact collision.

## Recommendation

Advance a bounded vinegar tranche of six identity activations and two updates to existing references. Reuse the live white-vinegar and apple-cider-vinegar IDs; promote the three existing legacy candidates for red-wine vinegar, white-wine vinegar, and balsamic vinegar; and propose identity-only malt, coconut, and cane vinegars. Keep each in `SAUCE_AND_CONDIMENT`.

The evidence supports names and source/product boundaries, not an assumption that the products have the same acidity, sweetness, flavor, or cooking behavior. Add no forms, density, unit mappings, recipe links, measurements, conversions, preservation advice, or general substitutions. In particular, the Canadian legal range for standardized vinegar is not a per-product value and does not establish safe preservation use.

## Proposed identity and alias disposition

| Disposition | Candidate ID | English / fr-CA display | Alias recommendation | Boundary |
|---|---|---|---|---|
| Reuse active reference | `ingredient-ref-white-vinegar` | `white vinegar` / `vinaigre blanc` | Retain `distilled white vinegar`; add English `distilled vinegar`, `spirit vinegar`, `alcohol vinegar`, `grain vinegar`; add French `vinaigre blanc distillé`, `vinaigre d’alcool`, `vinaigre de grain`. | CFIA’s Canadian standard groups spirit, alcohol, white, and grain vinegars under the same composition heading and defines the source as diluted distilled alcohol [S01]. The French labels are direct Canadian federal vocabulary [S02]. Keep this product apart from wine, cider, malt, cane, coconut, and flavored vinegars. |
| Reuse active reference | `ingredient-ref-apple-cider-vinegar` | `apple cider vinegar` / `vinaigre de cidre de pomme` | Retain existing `cider vinegar` and `vinaigre de cidre`; add English `apple vinegar` and `ACV`. No additional French alias. | OQLF prefers `vinaigre de cidre` and lists `apple cider vinegar`, `cider vinegar`, and `ACV`; Canadian compositional standards also name apple vinegar [S01, S04]. Keep it apple-specific; do not use a generic `fruit vinegar` alias. |
| Promote existing legacy candidate | `ingredient-ref-red-wine-vinegar` | `red wine vinegar` / `vinaigre de vin rouge` | None. | Keep distinct from white-wine vinegar and balsamic vinegar. Do not assign unqualified `wine vinegar` to this identity. |
| Promote existing legacy candidate | `ingredient-ref-white-wine-vinegar` | `white wine vinegar` / `vinaigre de vin blanc` | None. | Keep distinct from red-wine vinegar and from white/distilled vinegar. Do not assign unqualified `wine vinegar` to this identity. |
| Promote existing legacy candidate | `ingredient-ref-balsamic-vinegar` | `balsamic vinegar` / `vinaigre balsamique` | None. | OQLF gives this Québec French/English pair and describes balsamic as a distinct grape-must product [S06]. Do not alias balsamic glaze, reduction, cream, or a regional/traditional designation to the unqualified identity. |
| New identity | `ingredient-ref-malt-vinegar` | `malt vinegar` / `vinaigre de malt` | None. | Keep the malt infusion and its non-distilled-before-acetous-fermentation distinction separate from white/grain vinegar [S01, S05]. |
| New identity | `ingredient-ref-coconut-vinegar` | `coconut vinegar` / `vinaigre de noix de coco` | None. | The Canadian import label and Philippine sources attest the product family, but Philippine classifications distinguish coconut-water, coconut-sap, and mixed coconut vinegars [S02, S08–S09]. Do not collapse those source types or add `Sukang Tuba` as a universal alias. |
| New identity | `ingredient-ref-cane-vinegar` | `cane vinegar` / `vinaigre de canne` | English `sugar cane vinegar`. | Canadian import vocabulary and Philippine product/classification sources use these names [S02, S08–S09]. Do not alias broad `sugar vinegar`, which can refer to vinegar made from sucrose, molasses, or other sugar sources as well as cane juice. |

All proposed new identities are identity-only. Existing legacy IDs take precedence over new IDs for the wine and balsamic products. The three suggested IDs for malt, coconut, and cane vinegar are absent from active references, forms, legacy candidates, and ledger records at this snapshot.

## Repository and recipe audit

The live seed has **1,103 references**, **79 forms**, and **114 manifest-listed recipes with 1,123 ingredient rows**. The current vinegar references are:

- `ingredient-ref-apple-cider-vinegar` — `apple cider vinegar / vinaigre de cidre de pomme`, with `cider vinegar` / `vinaigre de cidre` aliases.
- `ingredient-ref-vinegar` — `vinegar / vinaigre`.
- `ingredient-ref-white-vinegar` — `white vinegar / vinaigre blanc`, with `distilled white vinegar` as an English alias.
- `ingredient-ref-rice-vinegar` — plain/unseasoned rice vinegar.
- `ingredient-ref-seasoned-rice-vinegar` — seasoned rice vinegar.
- `ingredient-ref-chinkiang-vinegar` — Chinkiang vinegar, with the qualified Zhenjiang aliases.

There are no vinegar forms. The 75 legacy candidates include `ingredient-ref-red-wine-vinegar`, `ingredient-ref-white-wine-vinegar`, and `ingredient-ref-balsamic-vinegar`; none is an active reference. The ledger has 1,403 records. The three legacy records are still unresolved candidate records, while the active white-vinegar, generic-vinegar, and apple-cider-vinegar entries retain historical “unreviewed” identity state. This packet does not interpret that old state as a reason to create replacement IDs.

The live app search normalizer was mirrored for exact-name checks (lowercase, NFKD/accent fold, `œ`/`æ`/`ß` and ampersand folding, and phrase-first matching). Current query results relevant to this review:

| Query | Current result |
|---|---|
| `vinegar` | Six active references: apple cider, Chinkiang, plain rice, seasoned rice, generic vinegar, and white vinegar. |
| `white vinegar`, `distilled white vinegar` | `ingredient-ref-white-vinegar` only. |
| `apple cider vinegar`, `cider vinegar` | `ingredient-ref-apple-cider-vinegar` only. |
| `red wine vinegar`, `white wine vinegar`, `balsamic vinegar`, `malt vinegar`, `coconut vinegar`, `cane vinegar` | No active result. The red/white wine and balsamic terms exist only in legacy candidates. |
| `lemon juice`, `lime juice` | Existing separate `ingredient-ref-lemon-juice` and `ingredient-ref-lime-juice` results. |

No exact normalized alias/name collision was found between the proposed terms and active reference or form terms. The existing legacy candidates are expected exact owners for the red/white wine and balsamic display terms. Adding the proposed rows will make generic `vinegar` a broader picker query; exact qualified product queries remain available. `wine vinegar` should remain an unqualified search over the separate red- and white-wine names, not an alias stored on either row.

The 1,123 ingredient rows contain five vinegar-related lines:

| Recipe | Line | Current text and link |
|---|---:|---|
| 007, refried pinto beans | 5 | `5 g vinegar or lime juice`; unlinked, combined alternative. Do not infer which vinegar style the author intended. |
| 074, meatloaf | 15 | `1 tbsp vinegar`; linked to generic `ingredient-ref-vinegar`. |
| 085, maple chicken | 8 | `1 tbsp vinegar`; linked to generic `ingredient-ref-vinegar`. |
| 091, red velvet cake | 10 | `1 tsp white vinegar`; linked to `ingredient-ref-white-vinegar`. |
| 101, Big Mac sauce | 8 | `1 tsp white vinegar`; linked to `ingredient-ref-white-vinegar`. |

No ingredient row names cider, wine, sherry, malt, balsamic, cane, coconut, palm, fruit, verjuice, tamarind water, or cooking wine. The corpus has eight linked lemon-juice lines and two linked lime-juice lines; these remain juice identities, including in recipe 007’s unlinked “vinegar or lime juice” alternative. There is no current recipe relinking supported by this review.

## Prior WP05/WP06 work and cross-section boundaries

- The integrated [WP05 rice-vinegar proposal](wp05-rice-vinegar-boundary-review-20261009.md) and [integration batch](../batches/reviewed-spice-sesame-vinegar-integration-20261009/README.md) already separate plain rice vinegar, seasoned rice vinegar, and Chinkiang/Zhenjiang vinegar. They keep Japanese kurozu separate and exclude generic `black vinegar`, `black rice vinegar`, `rice wine vinegar`, `sushi vinegar`, and Shaoxing-vinegar aliases. Preserve that decision; `black rice vinegar` would also collide with the grain query `black rice / riz noir`.
- The earlier [WP05 Southeast Asian condiments proposal](wp05-southeast-asian-condiments.md) proposed separate coconut and cane vinegar identities, but the packet is only partially accepted and neither identity is active. The [WP06 Southeast Asia sweep](wp06-southeast-asia-cuisine-gap-sweep-20261011.md) cross-references those WP05 candidates; this packet reuses that work and adds current Canadian/Philippine classification and naming evidence rather than creating duplicate candidate rows.
- The [WP06 North American cuisine sweep](wp06-north-american-cuisine-gap-sweep-20261009.md) leaves maple vinegar unresolved. It identifies the Parks Canada “Raspberry Vinegar” entry as a historic drink recipe, not a vinegar identity. Keep both decisions; a recipe or beverage title alone does not establish an ingredient identity.
- The [WP08 buttermilk/acidified-milk review](wp08-buttermilk-acidified-milk-context-review-20261010.md) retains source-bounded milk-plus-vinegar findings for pancake batter and biscuit dough only. Those do not distinguish vinegar styles and do not support a general vinegar substitution.

## Explicitly unresolved terms and exclusions

- **Sherry vinegar:** leave open for a dedicated product and Québec naming review. It should not be added as a generic alias of red- or white-wine vinegar solely because sherry is a wine.
- **Unqualified wine vinegar:** keep it as a broad phrase that can find red and white products; do not store it as an alias on one of those identities. Regional wine vinegar names need their own review.
- **Balsamic subtypes and preparations:** hold traditional/protected regional designations, white balsamic, balsamic condiments, reductions, creams, and glazes for a separate product-boundary decision. Retail evidence distinguishes plain vinegar from glaze [S07]; it does not establish a universal formula.
- **Other fruit vinegars:** do not create an umbrella `fruit vinegar` identity or alias. Philippine statistical categories separately name pineapple and banana vinegars, but a standalone French Canadian display/product boundary has not been established here [S09]. Maple vinegar remains open in WP06. A named fermented fruit vinegar should be reviewed as that product, while fruit-flavored/infused vinegar remains a flavored or compound product.
- **Palm/nipa/kaong vinegars:** leave unqualified `palm vinegar` open because it spans different palm sap sources. Review a source-qualified product identity before any global row or alias. Likewise, keep coconut-water and coconut-sap products separate unless a later standard proves a safe shared scope.
- **Coconut regional names and spiced products:** `Sukang-Hang` is a spiced-vinegar product made with coconut vinegar in the manufacturer’s description, not an alias for plain coconut vinegar. Do not activate `Sukang Tuba`, `Sukang Iloko`, `sukang puti`, or `sinamak` as aliases from a single product or regional label [S08].
- **Acidic non-vinegar products:** verjuice is sour juice from unripe grapes, not an acetous ferment [S10]. Keep fresh/bottled lemon or lime juice, sour-grape preparations, tamarind fruit versus tamarind water/paste, and pomegranate molasses separate. `ingredient-ref-tamarind` is a fruit identity; no tamarind-water form is proposed.
- **Cooking wines and wine:** salted/sweetened cooking-wine products remain separate from drinking wine and from vinegar. Do not use rice wine, cooking wine, or Shaoxing wine as a substitute alias for rice vinegar, Chinkiang vinegar, or sherry vinegar.
- **Preservation:** do not infer pickling or canning suitability from a vinegar name, a source-specific product label, or the federal vinegar range. Any future guidance must be tied to the exact tested product/process.

## Evidence register

Sources were accessed on 2026-10-12. The reserved IDs below are local to this proposal and have not been added to the shared ledger.

| Source ID | Source and locator | Supports | Limitation |
|---|---|---|---|
| `WP05-VINEGAR-GAP-20261012-S01` | CFIA, [Canadian Food Compositional Standards, Volume 16 — Vinegar](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §§16.1.1–16.1.5. | Defines wine vinegar; groups spirit/alcohol/white/grain vinegar; separately defines malt, cider/apple, and blended vinegar. | A Canadian compositional standard, not a cooking equivalence or complete list of retail products. Its malt and cider criteria are not used as quantity or substitution data. |
| `WP05-VINEGAR-GAP-20261012-S02` | CFIA, [AIRS update — vinegar classifications, French page](https://inspection.canada.ca/fr/importation-aliments-vegetaux-ou-animaux/vegetaux-produits-vegetaux/sari/mises-jour-acia-sari-2024-12-02), commodity classes under heading 22.09. | The listed federal French classification labels include `vinaigre de cidre`, `vinaigre de vin`, `vinaigre blanc distillé`, `vinaigre balsamique`, `vinaigre de malt`, `vinaigre de canne`, `vinaigre de noix de coco`, `vinaigre aromatisé`, `vinaigre mélangé`, and `autre vinaigre`. | Import classification supports Canadian French product labels and separation; it is not a consumer standard or proof that every regional product has the same composition. |
| `WP05-VINEGAR-GAP-20261012-S03` | Department of Justice Canada, [Food and Drug Regulations, B.19.001](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.19.001.html). | Defines Canadian vinegar as liquid obtained by acetous fermentation of an alcoholic liquid. | This definition is used only to separate vinegar from juice; the statutory acetic-acid range is not generalized into any catalog value or preservation claim. |
| `WP05-VINEGAR-GAP-20261012-S04` | OQLF, [vinaigre de cidre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17559980/vinaigre-de-cidre). | Preferred Québec French term; definition from apple juice; English equivalents include apple cider vinegar, cider vinegar, and ACV. | Terminology and general identity evidence only; not a product specification for every brand. |
| `WP05-VINEGAR-GAP-20261012-S05` | OQLF, [vinaigre de malt (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095428/vinaigre-de-malt). | Québec French term and English equivalent `malt vinegar`. | GDT page was last updated in 1982; the current CFIA standard independently supports the product class. No measurement is taken from the definition. |
| `WP05-VINEGAR-GAP-20261012-S06` | OQLF, [vinaigre balsamique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522907/vinaigre-balsamique). | Preferred Québec French term and English equivalent `balsamic vinegar`; distinguishes industrial and traditional aging descriptions. | Terminology and broad identity evidence, not a full taxonomy of protected regional products or balsamic glazes. |
| `WP05-VINEGAR-GAP-20261012-S07` | Metro Québec, [Huiles et vinaigres de spécialité](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/huiles-et-vinaigres/huiles-et-vinaigres-de-specialite). | Québec retail category and titles for red- and white-wine vinegar, malt vinegar, balsamic vinegar, and balsamic glaze. Supports local product naming and the plain-vinegar/glaze boundary. | Retailer taxonomy and SKU titles only; no universal formulas, standards, measurement, or substitution. |
| `WP05-VINEGAR-GAP-20261012-S08` | NutriAsia / Silver Swan, [brand and vinegar category pages](https://nutriasia.com/brands/silver-swan/), [vinegar products](https://nutriasia.com/product_category/vinegar/), and [export operations](https://nutriasia.com/export-operations/). | Manufacturer names cane vinegar as a product, describes it as made from local sugar cane, and describes Sukang-Hang as spiced vinegar made with fermented Sukang Tuba (coconut vinegar). | Product/manufacturer evidence for those lines only. It does not make the spiced SKU a synonym for plain coconut vinegar, nor does it establish all regional recipe or plant-source variants. |
| `WP05-VINEGAR-GAP-20261012-S09` | Philippine Statistics Authority, [Philippine Standard Commodity Classification, heading 22.09](https://psa.gov.ph/classification/pscc/heading/22.09). | Separately classifies coconut-water, pineapple, palm, sugar-cane, coconut-sap, banana, apple-cider, coconut-mixed, and coconut-cider vinegars. Supports keeping specific source/product labels distinct. | National commodity classification, not product composition or Québec terminology. It is a research lead for individual named identities, not a reason to add a broad fruit/palm alias. |
| `WP05-VINEGAR-GAP-20261012-S10` | OQLF, [verjus (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503324/verjus). | Defines verjus as acidic juice, typically from unripe grapes, and separately describes its use in place of vinegar or lemon juice. | Establishes a product boundary and term pair, not an ingredient equivalence or substitution rule. |

## Measurement and substitution status

No new default density, unit mapping, form, measurement, acidity value, yield, conversion, preservation instruction, or active substitution is proposed. Keep the previously recorded buttermilk-to-acidified-milk preparation source-scoped and context-limited. The Chinkiang-to-rice-vinegar compound alternative from the integrated WP05 packet also remains recipe-specific and ledger-only.

## Snapshot and coordinator checks

SHA-256 values are a mid-review snapshot; recheck them before any future integration. The recipe-corpus digest hashes each manifest-listed filename in manifest order, followed by a NUL byte, its raw JSON bytes, and another NUL byte.

| Input | Snapshot | SHA-256 |
|---|---:|---|
| `docs/RecipeBook-global-ingredient-catalog-plan.txt` | Section V open | `8273a2f463108216c8bb90d631b6470b887e5f24ac969e302eaf24942cbdac59` |
| `roadmap.md` | WP05 active; Sections V and broader terminology review remain open | `7dfe59e2b981fe6dee09a4e424c8f28fe924861cc5e9343d8b2c6ab24c1c3780` |
| `ingredient-references.v1.json` | 1,103 references | `4af607f6f11bffa1a2a458397a41eb5e717f0362e174f1f0ef1df4cfeaa27964` |
| `ingredient-forms.v1.json` | 79 forms | `e6e9bd997bc1d8eda3047e6fd349c1c6f02876160a6705368c6c2687b3f52419` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus, manifest order | 114 recipes / 1,123 ingredient rows | `68ac43f1fdcd24b38f532fdfab1f0500e1387d651a06df114f208f871685db9c` |
| `docs/catalog/research-ledger.v1.json` | 1,403 records / 4,688 source entries / 3,847 distinct source IDs | `6ddc8dfc52f434b97de600ce4af57b6ae7c5a31a7d2a843a34d17ecfdfe21b23` |
| `docs/catalog/legacy-import-identities.v1.json` | 75 candidates | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |

Before integration, refresh the snapshot and rerun exact phrase/collision checks against references, forms, legacy candidates, generated search artifacts, and all recipes. Confirm the new bilingual labels independently for Québec French; preserve the existing IDs and aliases for apple cider and white vinegar; reuse the legacy red-wine, white-wine, and balsamic IDs; then add source-backed identity records for any accepted new rows. Keep all numeric and substitution fields empty, do not relink any recipe based on this audit, and leave Section V open for sherry, fruit/palm, and other product-boundary work.

No tests were run; this packet changes proposal documentation only.
