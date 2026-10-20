# WP04 Section P — shrimp-powder identity and form boundary (round 13)

- **Review date:** 2026-10-13.
- **Candidate:** `shrimp powder / poudre de crevette`, including the source phrase `dried shrimp powder`.
- **Recommendation:** **Hold** a new active reference, alias, or `powdered` form. The wording appears in Québec retail and current Canadian product material, but the reviewed sources describe different scopes: ground dried shrimp, shrimp-and-salt powder inside noodles, and shrimp powder inside a multi-ingredient concentrated seafood base. The Québec retailer's standalone 175 g listing has no accessible ingredient declaration. No bundled recipe requests this product.
- **Scope:** a focused shrimp-powder product-state boundary under the open Section P shrimp/prawn-preparation and fish-powder work. It does not reopen the integrated dried-shrimp identity, Kapi or other fermented shrimp condiments, or the generic fish-powder hold.
- **Shared-data effect:** none. Add no reference, alias, form, recipe link, amount, unit mapping, density, yield, conversion, ledger record, or substitution rule.
- **New proposal-local source IDs:** `WP04-SECTIONP-SHRIMP-POWDER-BOUNDARY-20261013-R13-S01` through `S03`. Prior Aliefe, OQLF, and CFIA source IDs are reused below.

## Why this is a distinct open gap

Section P still leaves shrimp/prawn by preparation open and keeps the fish-powder, fish-ball, and surimi line open. The accepted dried-shrimp review explicitly excluded `shrimp powder` and `shrimp stock` from its alias set pending a separate scoped review. The 2026-10-12 generic fish-powder review recorded a Québec shop's adjacent `Poudre de Crevette` listing as evidence about **fish** powder's market boundary; it did not decide whether shrimp powder is a dried-shrimp form, a standalone ingredient, a salted powder, or a formulated seasoning. This packet makes that narrower decision while keeping both prior decisions intact.

The current archive has no focused shrimp-powder identity/form decision, and no `ingredient-ref-shrimp-powder` reference, form, legacy candidate, or ledger record. Earlier packets mention the phrase only as a boundary or exact-key audit. The live `ingredient-ref-dried-shrimp`, `ingredient-ref-kapi-shrimp-paste`, and named shrimp-ferment identities remain separate.

## Canadian and Québec naming and product evidence

Québec's OQLF retains **crevette séchée** as the preferred term for a small, peeled, dried, salty shrimp. The entry was last updated in 1982 and does not define `poudre de crevette`, a ground product, shell-in powder, or a seasoning blend. A current Québec retailer uses **Poudre de Crevette** as a standalone shop listing, but its accessible catalogue gives no package declaration, source species, ingredient list, drying/salting state, shell state, or grinding process. Keep the local phrase as retailer wording; it is not an OQLF-standardized display or proof of composition.

Current Canadian product evidence establishes several neighboring uses, each with limits:

| Evidence | Product or wording | What it does and does not establish |
|---|---|---|
| Québec grocery listing, rechecked 2026-10-13 | Alièfè / Merveilles Services lists `Poudre de Crevette (175 G)` beside `Poudre de Poisson (100 g)` and describes Québec City delivery. The search-indexed catalogue shows the two item titles and package amounts; direct product-detail content remains unavailable. | Confirms a local French retail phrase and a SKU package mass. It does not show ingredients, species, process, salt, shell, or whether the powder is standalone shrimp or a blend. The 175 g is only that listing's net package amount. |
| Canadian manufacturer culinary page | Club House for Chefs calls for **1 tbsp Dried shrimp powder** in a furikake recipe serving four and says the powder is made from ground dried shrimp. | This is direct culinary support for one dried-shrimp-to-ground-powder product concept. It does not identify species, shelling, salt level, roast state, a commercial product, or mass per tablespoon. It is one seasoning recipe, not a standard portion or substitution trial. |
| Canadian retail ingredient declaration | Save-On-Foods' current indexed `MAMA Instant Noodles Shrimp` listing gives the component `shrimp powder (shrimp, salt)` in a multi-component noodle product. Direct page retrieval failed during this review. | Demonstrates one product-specific salt-containing component declaration. It does not give the shrimp-powder component's proportion or specify a standalone powder product. The retail page warns product information can change. |
| Canadian food-service manufacturer | Knorr Professional's current Canadian **Ultimate Seafood Liquid Concentrated Base** lists `shrimp powder` among water, salt, tomato paste, yeast extract, starches, lobster extract, vegetables, and seasonings. The entire base has a 1.5 tsp (9 g) serving for one prepared cup. | Shows `shrimp powder` can be an ingredient in a formulated liquid seafood base. The 9 g is for the whole concentrated base, never for its shrimp powder component. It does not identify the component's formulation or ratio. |

CFIA's current fish-product labelling guidance says extra descriptive words about form, style, packaging medium, or condition must appear when their omission could cause the fish product to be mistaken for another food. This supports keeping product state visible in evidence and labels; it does not create a common-name standard for shrimp powder, define its recipe identity, or supply a measure. CFIA's Canadian fish common-name guidance and Fish List remain species/labelling references, not culinary synonym lists. No reviewed Canadian or Québec source ties the Alièfè item to a species or package ingredient panel.

## Exact ownership and source-ID audit

The exact-key audit followed `normalizeIngredientSearchKey`: lowercase/NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. It covered active reference display names and aliases, form labels and match terms, legacy candidate fields, ledger record text and IDs, and focused Section P proposal/batch decisions.

| Search key / identifier | Current owner and scope |
|---|---|
| `shrimp powder`, `dried shrimp powder`, `powdered shrimp`, `prawn powder`, `poudre de crevette`, `poudre de crevettes`, `poudre de crevette séchée`, `crevette en poudre`, `shrimp meal` | No exact normalized active reference, form, or legacy-candidate owner. The phrase appears in prior boundary audits and unrelated product ingredient declarations; those mentions do not allocate it. |
| `ingredient-ref-shrimp-powder` | Absent from active references, forms, legacy identities, and ledger records. Do not create it while this hold stands. |
| `ingredient-ref-dried-shrimp` | Active `PROTEIN` reference: **dried shrimp / crevette séchée**, with `dried shrimps` and `crevettes séchées` as aliases. It has no attached form. Do not add a powder alias to it until the product scope is resolved. |
| `ingredient-ref-kapi-shrimp-paste` and the named fermented-shrimp condiments | Separate product identities. They have no shrimp-powder aliases or forms; the shared crustacean ingredient does not make them the powder's owner. |
| Forms | No current seafood form is attached to `ingredient-ref-dried-shrimp`; no form label or match term identifies shrimp powder. Do not infer a `POWDERED` form from one manufacturer recipe. |
| New source prefix `WP04-SECTIONP-SHRIMP-POWDER-BOUNDARY-20261013-R13-S` | Absent from the shared ledger and proposal/batch archive before this packet. New S01–S03 are distinct. Reuse, without reassigning, Aliefe `WP04-GENERIC-FISH-POWDER-20261012-S01`, OQLF `WP04-DRSC-S05` and `WP04-FRESH-SHRIMP-20261009-S01`, and CFIA `WP04-DOYS-S04` and `WP04-FINFISH-ID-20261009-S06`. |

The previous dried-shrimp review already lists `shrimp powder` as excluded from the dried-shrimp aliases; the generic fish-powder packet already includes the Québec `Poudre de Crevette` item. This proposal records the specific overlap rather than assigning either prior source a new ID.

## Current and conditional picker projection

The live picker searches reference and attached-form terms with the repository's complete-word-phrase-first rule, then uses substring matching only when there are no complete phrase matches. Current results were replayed against all active names, aliases, and form terms.

| Query | Current picker result | If a separate `shrimp powder / poudre de crevette` row were added with empty aliases | Boundary |
|---|---|---|---|
| `shrimp powder` | No result | One candidate row | Exact source-backed English phrase, but the sources disagree about whether it names ground dried shrimp or a component in a formulated product. |
| `poudre de crevette` | No result | One candidate row | Exact Québec retailer wording, but not an OQLF product term or a verified package specification. |
| `dried shrimp` / `crevette séchée` | `ingredient-ref-dried-shrimp` only | Still the existing dried-shrimp row with the conditional display above | Avoid naming the new row `dried shrimp powder` without modeling its relationship to the existing identity. |
| `dried shrimp powder` | No result | Still no result with only the display names above; it would need an alias or a different display | Adding this as an alias would make the existing `dried shrimp` query return both the whole dried-shrimp identity and the powder row. |
| `shrimp` | `ingredient-ref-dried-shrimp`; `ingredient-ref-saeu-jeot` | Those two plus the conditional powder row | Broad English result set expands. Keep `Kapi`, bagoong alamang, belacan, and terasi separately named. |
| `crevette` | `ingredient-ref-dried-shrimp` | That row plus the conditional powder row | The singular query currently has a complete phrase result on the dried-shrimp display, so plural French condiment terms do not appear as fallback matches. |
| `crevettes` | Bagoong alamang, belacan, dried shrimp, Kapi, saeujeot, and terasi | Same current result set without a plural alias on the conditional row | Do not add `poudre de crevettes` as an alias unless a product label and intended plurality support it. |
| `fish powder` / `poudre de poisson` | `ingredient-ref-bonga-dried-fish-powder` | Unchanged | Do not use shrimp powder to broaden or alias the distinct Bonga and generic-fish-powder boundary. |
| `shrimp paste`, `shrimp meal` | No result | No result | Paste remains a separate product family; animal-feed `shrimp meal` wording is not a human-food powder alias. |

If later evidence supports the term as a **form** of `ingredient-ref-dried-shrimp`, its search terms and same-identity form hint must be audited separately from a dedicated powder reference. If a separate row is justified instead, the conditional display above is only a projection, not proposed active fields. Do not add both a new identity and a dried-shrimp form for the same product evidence.

## Full recipe-corpus demand scan

The manifest-ordered bundled corpus contains **114 recipe files and 1,123 ingredient rows**. All recipe JSON text and each ingredient row were scanned for `shrimp powder`, `dried shrimp powder`, `powdered shrimp`, `prawn powder`, `dried prawn powder`, `poudre de crevette(s)`, `poudre de crevette séchée`, `crevette(s) en poudre`, `shrimp meal`, `farine de crevette`, `ebi powder`, `udang powder`, `蝦粉`, `虾粉`, and `虾米粉`. The scan found **zero matching recipe files and zero matching ingredient rows**.

No recipe link, form selection, package amount, or quantity is supported. This external Club House recipe is useful culinary wording and a source-specific one-tablespoon observation; it is not demand from the bundled corpus.

## Product state, measurements, and substitutions

| Dimension | Source-scoped evidence | Decision |
|---|---|---|
| Identity / state | Club House describes one powder made by grinding dried shrimp. The MAMA noodle declaration adds salt to the named shrimp-powder component. The liquid Knorr base includes shrimp powder as one of many ingredients. The Québec shop title does not reveal which scope it sells. | Do not decide whether powder is a form under the existing dried-shrimp identity, a separate single-ingredient product, or a salted/compound seasoning. Add no row, alias, or form. |
| French term | OQLF's preferred `crevette séchée` is an older, defined dried whole-shrimp product; Alièfè uses `Poudre de Crevette`. No reviewed OQLF entry standardizes this powder phrase. | Preserve each phrase only with its source. Add no French display or alias. |
| Measurements | Alièfè's **175 g** is one shop SKU. Club House's **1 tbsp for four servings** belongs to one furikake seasoning recipe, with no grams or spoon-fill basis. Knorr's **1.5 tsp / 9 g per prepared cup** is for its whole liquid seafood base, not shrimp powder. Save-On does not declare the powder proportion. | Add no default measure, density, unit mapping, package yield, spoon-to-mass conversion, or powder share of a blend. Keep all numbers attached to their source products/recipes only. |
| Substitutions | No source tests replacement of shrimp powder with dried shrimp, whole/cooked shrimp, Kapi or another shrimp paste, fish powder, seafood base, or stock. Flavor-use descriptions are not a substitution test. | Add no global or contextual substitution, ratio, warning, or recipe link. |

## Baseline snapshot

Proposal-time baseline, checked 2026-10-13. File SHA-256 values cover exact bytes. The corpus fingerprint hashes each manifest-ordered recipe-relative path, NUL, exact recipe bytes, and trailing NUL.

| Artifact | Count | Bytes | SHA-256 / fingerprint |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,343 references | 430,576 | `43c02ea1acdf0ff3cc2e47a6ac28a634f7fd08488e5a40b52b063d4663ff9a05` |
| `ingredient-forms.v1.json` | 98 forms | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,655 records; 6,385 source entries; 5,353 unique source IDs | 6,297,675 | `2f10900fc04496a287904033694094a2fc4a058c5711a64b567953fb6dbcd77d` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,343 references | 588,994 | `34ba41f3731379d77c00cddf0e9d46356741f23097d4c7f4ca148a0fb35348d0` |

## Source register

Sources were opened or rechecked on 2026-10-13. Reused IDs identify the same archived source; they are not reassigned. Retail and manufacturer pages document their own listings and recipes, not universal product standards.

| Source ID | Source and evidence | Limits |
|---|---|---|
| `WP04-SECTIONP-SHRIMP-POWDER-BOUNDARY-20261013-R13-S01` | McCormick Canada / Club House for Chefs, [Homemade Shrimp Furikake Seasoning](https://www.clubhouseforchefs.ca/en-ca/recipes/flavour-forecast/homemade-shrimp-furikake-seasoning). Calls for 1 tbsp dried shrimp powder in a four-serving seasoning recipe and says the powder is made from ground dried shrimp. | One culinary recipe and preparation explanation. No species, commercial package, salt/shell/roast specification, or mass-per-spoon value. Page date is not shown; it is accessible as of review. |
| `WP04-SECTIONP-SHRIMP-POWDER-BOUNDARY-20261013-R13-S02` | Save-On-Foods, [MAMA Instant Noodles Shrimp 5Pk](https://www.saveonfoods.com/sm/pickup/rsid/5545/product/mama-instant-noodles-shrimp-5pk-id-08850987101519). Current indexed Canadian product information gives the compound component `shrimp powder (shrimp, salt)`. | Powder is one component in a multi-ingredient noodle; no powder percentage or standalone powder specification. Direct retrieval failed during this review, so the package label should be rechecked before any integration. |
| `WP04-SECTIONP-SHRIMP-POWDER-BOUNDARY-20261013-R13-S03` | Unilever Food Solutions Canada, [Knorr Professional Ultimate Seafood Liquid Concentrated Base](https://www.unileverfoodsolutions.ca/en/product/knorr-professional-ultimate-liquid-concentrated-seafood-base-946ml-4-pack-1-EN-885299.html). Current product ingredients include shrimp powder inside a 946 mL concentrated base; page gives 1.5 tsp / 9 g base for one prepared cup. | Compound liquid stock/base, not standalone shrimp powder. The stated base measure and yield cannot be transferred to its shrimp-powder component. |
| Reused `WP04-GENERIC-FISH-POWDER-20261012-S01` | Alièfè / Merveilles Services, [Québec grocery catalogue](https://aliefeepicerieafricaine.com/Catalogue), rechecked in its indexed listing. Shows `Poudre de Crevette (175 G)` and Québec City delivery. | Search-indexed listing and SKU weight only. Product-detail declaration and package composition were unavailable. Source ID reused from the generic fish-powder review. |
| Reused `WP04-DRSC-S05` | OQLF, [crevette séchée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8435043/crevette-sechee). Preferred Québec term and definition for a small, peeled, strongly salty dried shrimp; last updated 1982. | Does not define powder or establish the French name of a ground product. |
| Reused `WP04-FRESH-SHRIMP-20261009-S01` | OQLF, [crevette (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198913/crevette). Québec base term for shrimp; the earlier review records English `shrimp` and UK-labelled `prawn`. | General seafood term only; no powder or processed-state naming. |
| Reused `WP04-DOYS-S04` | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). Current guidance requires descriptive words for form or condition where needed to prevent mistaken product identity. | Label guidance; not a recipe ingredient taxonomy, shrimp-powder definition, or measure. |
| Reused `WP04-FINFISH-ID-20261009-S06` | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). Official fish common-name/label context. | Does not decide food-preparation aliases or imply a taxon for the unqualified powder listings. |

## Recommendation and revisit condition

Keep `shrimp powder / poudre de crevette` unallocated. Do not create `ingredient-ref-shrimp-powder`, add a powder alias or form to `ingredient-ref-dried-shrimp`, or attach any of the package/recipe amounts to the shared catalog. Keep dried shrimp, named fermented shrimp pastes, Bonga dried fish powder, generic fish powder, and concentrated seafood bases separate.

Revisit if a current Canadian or Québec standalone package provides a complete ingredient declaration and product state, and a recipe or library line needs that exact product. Decide then whether it is a form of dried shrimp or a separate formulated ingredient, validate a Québec display independently, and replay broad `shrimp / crevette` and `dried shrimp / crevette séchée` picker results including attached forms. Root integrated this result as a documentation-only hold on 2026-10-13. No catalog or ledger allocation was made.

Static checks: archive/ledger source-prefix collision audit, exact active/form/legacy ownership, current picker replay including forms and conditional row projection, and all 114 manifest recipes / 1,123 ingredient rows. The proposal was saved as UTF-8 without BOM and checked for whitespace. No shared catalog data changed; no app, unit, instrumentation, emulator, or application tests were run.

## Root integration result

Integrated on 2026-10-13 as a hold under the open Section P shrimp/prawn-preparation checklist. Shrimp powder remains outside active references and forms; the existing dried-shrimp identity, generic fish-powder boundary, and fermented shrimp condiments remain unchanged. No ledger record or source data was added. No app or emulator tests were run because this integration only updates documentation.
