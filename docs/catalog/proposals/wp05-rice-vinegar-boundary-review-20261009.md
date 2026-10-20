# WP05 Section V — rice vinegar naming and style boundaries

**Packet type:** reviewed proposal integrated by the coordinator

**Owner/author:** `/root/rice_vinegar_boundary`

**Reviewer:** coordinator review complete

**Status:** evidence review integrated; broader Section V remains open

**Prepared/access date:** 2026-10-09

**Scope:** Section V rice vinegar wording only: plain/unseasoned rice vinegar, seasoned rice vinegar, and Chinkiang/Zhenjiang vinegar.

**Input state:** the shared worktree contained concurrent changes. Hashes below record the snapshot reviewed and must be rechecked before integration.

## Recommendation

Keep plain rice vinegar, seasoned rice vinegar, and the specific Chinkiang/Zhenjiang product separately searchable. Reuse the existing unreviewed legacy candidate ID `ingredient-ref-rice-vinegar` for plain rice vinegar if accepted. Add no general `black vinegar`, `Chinese black vinegar`, or `black rice vinegar` alias to Chinkiang: Japanese rice black vinegar (`kurozu`) is a distinct named product, and the phrase `black rice` already finds the edible black-rice reference.

This review does not close Section V. The current 114-recipe seed contains no rice-vinegar, seasoned-rice-vinegar, Chinkiang, Zhenjiang, or kurozu ingredient line. These recommendations address the Section V pantry coverage request; they do not indicate recipe relinking or current recipe demand.

## Proposed reference terms

The three rows below are candidate data for coordinator review, not live catalog edits. Use the existing `SAUCE_AND_CONDIMENT` category, matching the generic vinegar references and the legacy rice-vinegar candidate.

| Candidate ID | English display | fr-CA display | English aliases | French aliases | Boundary |
|---|---|---|---|---|---|
| `ingredient-ref-rice-vinegar` (existing legacy ID) | `rice vinegar` | `vinaigre de riz` | `unseasoned rice vinegar` | `vinaigre de riz non assaisonné` | Plain product name; keep separate from seasoned rice vinegar, generic vinegar, white/wine vinegar, and rice wine. The French qualified alias is a clear descriptive translation; keep it provisional pending independent Québec French review. |
| `ingredient-ref-seasoned-rice-vinegar` (candidate new ID) | `seasoned rice vinegar` | `vinaigre de riz assaisonné` | none proposed | none proposed | Separate prepared product. Do not infer that all seasoned products contain sugar: the reviewed LKK product lists water, rice, and salt; Marukan’s example also lists sugar. |
| `ingredient-ref-chinkiang-vinegar` (candidate new ID) | `Chinkiang vinegar` | `vinaigre de Chinkiang` | `Zhenjiang vinegar` | `vinaigre de Zhenjiang` | Keep the specific regional product findable by both romanizations. Do not use the broader black-vinegar wording as a global alias. |

Do not add `black vinegar`, `Chinese black vinegar`, `black rice vinegar`, `kurozu`, `sushi vinegar`, `sushi-su`, `rice wine vinegar`, or `Shaoxing vinegar` as aliases in this packet. No exact evidence or corpus need here establishes those as safe global crosswalks. In particular, Japanese rice black vinegar / kurozu is a separate product boundary, not a synonym for Chinkiang. A later Japan-specific record would need its own source review and should not share the unqualified `black rice vinegar` alias.

## Current catalog and recipe audit

The current active package snapshot has 496 ingredient references, 30 forms, and 114 bundled recipes. The evidence ledger has 675 records. There are no vinegar forms. The legacy candidate file contains 99 candidates, including the unreviewed `ingredient-ref-rice-vinegar` row with `rice vinegar` / `vinaigre de riz` and category `SAUCE_AND_CONDIMENT`; re-use that ID rather than creating a duplicate.

The query audit uses the same key construction as `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase with `Locale.ROOT`, NFKD fold, map `œ→oe`, `æ→ae`, `ß→ss`, map `&` to `and`, strip combining marks, replace non-ASCII letters/digits with spaces, then trim and collapse spaces. Matching follows the app's complete-word-phrase-first behavior and only falls back to partial matching when no phrase match exists. Current relevant results:

| Query | Current result |
|---|---|
| `vinegar` | 3 references: apple cider vinegar, vinegar, white vinegar |
| `rice vinegar`, `seasoned rice vinegar`, `unseasoned rice vinegar` | 0 |
| `Chinkiang`, `Chinkiang vinegar`, `Zhenjiang vinegar`, `black vinegar`, `Chinese black vinegar`, `black rice vinegar`, `rice wine vinegar`, `sushi vinegar` | 0 |
| `black rice` | 1 reference: `ingredient-ref-black-rice` / `black rice` / `riz noir` |

None of the proposed exact normalized names/aliases currently collides with an active reference or form term. A hypothetical `black rice vinegar` alias on Chinkiang would make the phrase-first query `black rice` return both the existing black-rice grain and Chinkiang; omitting that alias preserves the present result. With the proposed terms, `rice vinegar` will intentionally return the plain and seasoned entries, while the full queries `seasoned rice vinegar`, `unseasoned rice vinegar`, `Chinkiang vinegar`, and `Zhenjiang vinegar` remain specific.

All 114 manifest-listed recipes and their 1,123 ingredient lines were scanned using that normalized phrase match. There are zero matches for rice vinegar, seasoned/unseasoned rice vinegar, black vinegar, black rice vinegar, Chinkiang, Zhenjiang, rice wine vinegar, sushi vinegar, or kurozu. Five ingredient lines contain generic `vinegar` wording (two reference `ingredient-ref-vinegar`, two reference `ingredient-ref-white-vinegar`, and one combines vinegar with lime juice); none identifies rice vinegar. No recipe relinking is indicated.

This is a live audit of the current canonical seed through the app's exact search normalization and phrase-first matching rules. No Android tests or emulator picker interaction were run for this proposal-only packet.

## Evidence map and limits

Sources were checked on 2026-10-09. They support the distinctions and local labels below; they do not establish ingredient measurements, density, dilution, or substitutions.

| ID | Source | Supports | Limitation |
|---|---|---|---|
| **WP05-RV-S01** | CFIA, [AIRS updates — vinegar tariff categories](https://inspection.canada.ca/en/importing-food-plants-animals/plant-and-plant-product/airs/cfia-airs-updates-2024-12-02) | Lists rice vinegar separately from wine, cider, distilled, balsamic, malt, cane, and coconut vinegars. Supports keeping rice vinegar distinct from generic/wine-vinegar rows. | Import classification list, not a consumer definition, product formula, or cooking equivalence. |
| **WP05-RV-S02** | Japan MAFF, [JAS 0801:2024 — Brewed vinegar](https://www.maff.go.jp/j/jas/jas_standard/attach/pdf/index-354.pdf) | The standard defines rice vinegar and rice black vinegar separately and excludes rice black vinegar from its rice-vinegar category. It also recognizes seasoned brewed-vinegar products. | Japanese standard only; it does not determine Canadian naming or every product’s formulation. No numeric thresholds are carried into this proposal. |
| **WP05-RV-S03** | Japan MAFF, [Kagoshima Tsubozukuri black vinegar](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/tubozukuri_black_vinegar.html) and [GI product summary for Kagoshima no Tsubozukuri Kurozu](https://www.maff.go.jp/e/policies/intel/gi_act/register/s7.html) | Identifies a distinct Japanese black rice vinegar / kurozu product with a regional name and process. Supports not aliasing unqualified `black rice vinegar` or `black vinegar` to Chinkiang. | Evidence for the named Japanese product, not a complete taxonomy of all black vinegars. Process and consumption quantities are not repeated here. |
| **WP05-RV-S04** | China National Standard Information Public Service Platform, [GB/T 18623-2011 — Product of geographical indication: Zhenjiang vinegar](https://std.samr.gov.cn/gb/search/gbDetailed?id=71F772D7E06FD3A7E05397BE0A0AB82A) | Confirms the distinct geographical-indication product name `Zhenjiang vinegar`; the platform listed the standard as current when checked. | Supports the named GI only. The page does not itself establish that all Chinese black vinegars are Zhenjiang vinegar or provide a cross-product alias. It also records a proposed revision. |
| **WP05-RV-S05** | HEINZ Kitchen Canada, [Côtes de porc aigres-douces glacées](https://www.heinz.com/fr-CA/recettes/c%C3%B4tes-de-porc-aigres-douces-glac%C3%A9es) | A Canadian French recipe uses `vinaigre de Chinkiang ou de Zhenjiang`, supporting the proposed localized terms and same-recipe naming crosswalk. | One recipe's terminology only; not a global product standard or a substitution rule. |
| **WP05-RV-S06** | Lee Kum Kee Canada, [Selected Rice Vinegar](https://ca.lkk.com/en/products/selected-rice-vinegar) / [Vinaigre de riz sélectionné](https://ca.lkk.com/fr-ca/products/selected-rice-vinegar), and [Seasoned Rice Vinegar / Vinaigre de riz assaisonné](https://ca.lkk.com/fr-ca/products/seasoned-rice-vinegar) | Manufacturer presents plain and seasoned products under different names; its Canadian French page confirms `vinaigre de riz` and `vinaigre de riz assaisonné`. The reviewed product ingredient lists differ. | Brand-specific products; do not generalize their ingredient lists to every plain or seasoned vinegar. In particular, “seasoned” does not guarantee a sweetened product. |
| **WP05-RV-S07** | Marukan, [Genuine Brewed Rice Vinegar food-service sheet](https://www.marukan-usa.com/wp-content/uploads/2019/04/MAR21_FS_FOODSERVICE_RiceVinegarsSellSheetsm.pdf) and [Seasoned Gourmet Rice Vinegar](https://www.marukan-usa.com/products/seasoned-gourmet-rice-vinegar/) | Manufacturer distinguishes brewed rice vinegar from a seasoned rice-vinegar product. Supports the product boundary and the English qualified term. | Product examples are brand-specific and not Canadian French terminology. |
| **WP05-RV-S08** | Kikkoman, [Orange Chicken Shaker Salad — Food Services](https://kikkomanusa.com/foodservice/recipes/orange-chicken-shaker-salad/) | Uses the exact product wording `Kikkoman Rice Vinegar, unseasoned`, supporting `unseasoned rice vinegar` as a searchable English qualification. | Recipe/product wording, not a universal label standard; supports no French alias by itself. |
| **WP05-RV-S09** | OQLF, [vinaigre — GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095434/vinaigre) | Confirms the general Québec French term `vinaigre`. | Targeted searches did not locate an OQLF entry for `vinaigre de riz` or `vinaigre de Chinkiang`; this limited negative result is not proof that no preferred term exists. Specific proposed French labels rely on Canadian French product/recipe usage and still need independent bilingual review. |

## Numeric data and substitution status

No default density, unit mapping, ingredient form, measurement, acidity/concentration value, dilution instruction, conversion, yield, or substitution is proposed. Manufacturer and government pages include product-specific package and process details, but none is generalized here. Any recipe-specific replacement shown on a source page remains outside this packet and must not become a global rule.

## Snapshot hashes

Hashes are an observed mid-edit snapshot of the shared worktree, not a guarantee that the coordinator's current tree is unchanged. Recipe aggregate hash is SHA-256 over each manifest-listed recipe in manifest order, concatenating its filename, NUL, raw file bytes, NUL.

| Input | SHA-256 |
|---|---|
| `docs/RecipeBook-global-ingredient-catalog-plan.txt` | `72099970f01c3977355454278439278fb696c9dea137a4eb3ef64ee0d69686dc` |
| `ingredient-references.v1.json` | `f6429c73a9a0cac9ddbe065f93cf87e418c07ee2ad7666159aba69299ca481dd` |
| `ingredient-forms.v1.json` | `9b53e0ca3c6dc4d95b1d14707a495f3d1b3043d0c59400e3a15cd518733683f3` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| 114 manifest-listed recipe files (aggregate, method above) | `b4723f4a0dc4a19008c9f866307696235320845eaa8c0cfb21b8327d055f5194` |
| `docs/catalog/research-ledger.v1.json` | `264d0cea09a791f730558ba0bb64c5026514bc92ecce11f3f8b0946c0b4f3e71` |
| `docs/catalog/legacy-import-identities.v1.json` | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |

## Coordinator checks before integration

1. Refresh all hashes and rerun the exact app search normalization against the then-current references, forms, and full recipe corpus; the worktree was changing during this review.
2. Reuse the legacy `ingredient-ref-rice-vinegar` ID for plain rice vinegar if accepted; do not add a duplicate. Keep the seasoned and Chinkiang candidates as separate identities with `SAUCE_AND_CONDIMENT` category.
3. Review every proposed bilingual alias for normalized key collisions, especially `black rice` with the active grain identity. Keep the generic black-vinegar aliases excluded unless a distinct product scope and recipe need are evidenced.
4. Confirm whether the accepted Section V scope needs a separate Japanese kurozu identity later; do not map it to Chinkiang or generic rice vinegar.
5. Leave all numeric/conversion/substitution fields unset. Add no recipe links based on this audit.
6. Keep Section V open; this focused review is not completion of the section.

## Coordinator integration results — 2026-10-09

- Promoted the existing legacy ID `ingredient-ref-rice-vinegar` as plain rice vinegar and removed
  its duplicate legacy candidate. Added separate seasoned rice vinegar and Chinkiang vinegar
  identities with the qualified Zhenjiang names.
- Kept Japanese kurozu and broad `black vinegar` / `black rice vinegar` phrases outside the
  Chinkiang aliases. No bundled recipe was relinked.
- Added the Heinz pork-rib glaze replacement to the Chinkiang ledger record as a source-scoped,
  two-ingredient finding: rice vinegar plus soy sauce for that recipe only. No runtime substitution
  rule, measure, conversion, or default density was added. Measurement research remains open.
- The exact-key audit was rerun against the canonicalized catalog; no active reference aliases
  collide. `black rice` continues to resolve to black rice.
- Shared catalog, tests, and Pixel verification results are recorded in
  `docs/catalog/batches/reviewed-spice-sesame-vinegar-integration-20261009/README.md`.
