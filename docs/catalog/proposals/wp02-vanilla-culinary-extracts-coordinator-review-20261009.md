# WP02 Section E: vanilla and culinary extracts coordinator review

**Review date:** 2026-10-09 23:07 UTC

**Scope:** Section E checklist item currently at line 1129 of `docs/RecipeBook-global-ingredient-catalog-plan.txt`: vanilla bean/extract/paste/powder/sugar; almond, citrus, mint, and other culinary extracts. This is a proposal-only review; it does not complete Section E or change any shared catalog, ledger, plan, recipe, or code file.

## Recommendation

**Accept the existing vanilla-extract, vanilla-pod, and almond-extract identities for the exact uses already linked in the recipe corpus. Add no new product identity for paste, powder, sugar, or mint/citrus extracts on this evidence snapshot.** Add source-backed aliases to existing refs: `vanilla bean` to the pod ref; the Canadian standard names `essence de vanille` / `préparation aromatisante à la vanille` and `vanilla essence` / `vanilla flavour` to the vanilla-extract ref; and the corresponding FR/EN standard names for almond essence/flavour to the almond-extract ref. Also add `pure vanilla extract` as an EN alias because that wording occurs in two exact recipe lines but has no current exact search owner. CFIA defines these vanilla preparations from cured vanilla fruit; a manufacturer’s SKU page independently uses “Pure Vanilla Extract.” These are aliases, not new ingredient identities.

Keep the vanilla pod and vanilla extract as separate ingredient references. Do not add bare `vanilla` as an alias to either: that query is usefully ambiguous between the pod and extract. Review the existing `vanille liquide` alias on `ingredient-ref-vanilla-extract`; it has no OQLF support in the sources reviewed and may denote a liquid flavouring whose natural or imitation status is unspecified. I recommend removing it at a later seed cleanup unless Québec product-label evidence supports that precise mapping. No bundled recipe depends on it.

Defer vanilla paste, vanilla powder, vanilla sugar, lemon/orange/citrus extracts, peppermint/spearmint/mint extracts, and a catch-all “other extract” identity. None has an exact ingredient-row demand in the bundled corpus. Keep the generic free-choice flavouring line in recipe 065 unlinked to any particular flavour. Section E remains open.

## Audit snapshot

Snapshot time: **2026-10-09 23:07 UTC**. Counts and SHA-256 values below were read from the live working tree for this review.

| Data | Count | SHA-256 |
|---|---:|---|
| Manifest-listed recipes | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Ingredient rows across those recipes | 1,123 | Corpus digest below |
| Active ingredient references | 509 | `235871639394f42e344bf86159d463600a7e58f5d65645b38b6f7a21f475e644` |
| Active ingredient forms | 32 | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| Legacy import candidates | 97 | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |
| Research-ledger records / source entries | 689 / 1,110 | `1dc128ca0a439ded905c606fdee93fbfa0b009fbfb68b7d449ab7a7ba09a8157` |

Recipe corpus digest: `31139675c0a2f37863a57e2e45e8df203b0255b11e12cf54f1df944cdd426890`, calculated in manifest order by hashing each recipe-relative path, a NUL byte, the exact recipe-file bytes, and a NUL byte. Ingredient-row counts use the `ingredients` arrays in those same 114 files.

The normalized collision audit followed [`normalizeIngredientSearchKey`](app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase with `Locale.ROOT`; Unicode NFKD; fold `œ`→`oe`, `æ`→`ae`, `ß`→`ss`, and `&`→`and`; remove combining marks of categories Mn/Mc/Me; replace runs outside `[a-z0-9]` with spaces; trim and collapse spaces. Names, aliases, form labels/match terms, and legacy candidate names/aliases were compared by complete normalized phrase. The live picker also has a partial-match fallback; this audit does not treat broad partial matches as identity evidence.

Candidate phrases checked included:

- Vanilla: `vanilla`, `vanilla bean`, `vanilla pod`, `vanilla extract`, `pure vanilla extract`, `vanilla essence`, `vanilla flavour`, `vanilla flavor`, `imitation vanilla`, `imitation vanilla extract`, `artificial vanilla extract`, `vanilla paste`, `vanilla bean paste`, `vanilla powder`, `ground vanilla`, `vanilla sugar`, `gousse de vanille`, `extrait de vanille`, `essence de vanille`, `préparation aromatisante à la vanille`, `arôme de vanille`, `vanille liquide`, `pâte de vanille`, `poudre de vanille`, `sucre vanillé`.
- Almond: `almond extract`, `almond essence`, `almond flavour`, `pure almond extract`, `imitation almond extract`, `artificial almond extract`, `extrait d’amande`, `essence d’amande`, `préparation aromatisante à l’amande`, `arôme d’amande`.
- Citrus: `citrus extract`, `lemon extract`, `lemon essence`, `lemon flavour`, `orange extract`, `orange essence`, `orange flavour`, `extrait d’agrumes`, `extrait de citron`, `essence de citron`, `préparation aromatisante au citron`, `extrait d’orange`, `essence d’orange`, `préparation aromatisante à l’orange`.
- Mint and other: `mint extract`, `peppermint extract`, `peppermint essence`, `peppermint flavour`, `spearmint extract`, `spearmint essence`, `spearmint flavour`, `extrait de menthe`, `extrait de menthe poivrée`, `essence de menthe poivrée`, `préparation aromatisante à la menthe poivrée`, `extrait de menthe verte`, `essence de menthe verte`, `préparation aromatisante à la menthe verte`, `culinary extract`, `culinary flavouring`.

### Current identity and collision state

| Reference | Current FR / EN display | Current aliases | Form / measurement state | Exact ingredient-row demand |
|---|---|---|---|---:|
| `ingredient-ref-vanilla-extract` | `extrait de vanille` / `vanilla extract` | FR: `vanille liquide`; EN: none | No matching form; `defaultDensity: null`; no unit mappings | 53 rows / 46 recipes |
| `ingredient-ref-vanilla-pod` | `gousse de vanille` / `vanilla pod` | none | No matching form; no density or mapping | 1 row / 1 recipe |
| `ingredient-ref-almond-extract` | `extrait d'amande` / `almond extract` | none | No matching form; `defaultDensity: null`; no unit mappings | 10 rows / 9 recipes |

All three references are categorized `BAKING_AND_SPICE`. There are no exact family matches in the 32 active forms or 97 legacy candidates; no current vanilla/almond/citrus/mint form or candidate competes with the reference names. The normalized phrases `vanilla extract`, `extrait de vanille`, and `vanille liquide` currently resolve to the vanilla-extract ref; `vanilla pod` and `gousse de vanille` resolve to the pod ref; and `almond extract` / `extrait d'amande` resolve to the almond-extract ref. A query for bare `vanilla` matches both the pod and extract. `vanilla bean`, `pure vanilla extract`, the vanilla essence/flavour standard names, and the almond essence/flavour standard names have no exact owner; they are supported alias candidates for the corresponding existing refs. Exact phrase owners for paste, powder, sugar, lemon, orange, generic citrus, mint, peppermint, spearmint, imitation/artificial vanilla, and the checked generic-extract phrases: **none**.

The three existing ledger records (`ingredient-ref-vanilla-extract`, `ingredient-ref-vanilla-pod`, and `ingredient-ref-almond-extract`) currently have no sources. The two extract records have `identityState: unreviewed`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: not_yet_researched`; the pod has all three states as not yet researched. Both global and contextual substitution-rule arrays are empty.

## Recipe demand and link implications

All 1,123 bundled ingredient rows were scanned in every manifest-listed recipe file, comparing `originalText` and `ingredientName`; the full row object was also checked for contextual mentions. There are **64 exact target rows across 49 distinct recipes**: 53 vanilla-extract rows already linked to `ingredient-ref-vanilla-extract`, 10 almond-extract rows already linked to `ingredient-ref-almond-extract`, and one vanilla-pod row already linked to `ingredient-ref-vanilla-pod`. No recipe relinking is needed. The two source lines saying `pure vanilla extract` remain mapped to vanilla extract; retain “pure” in the original text rather than creating a separate pure-extract identity.

Rows below use the recipe-file numeric prefix from the manifest and a one-based position within that recipe’s `ingredients[]` array. The SHA snapshot above identifies the exact files reviewed.

- **Vanilla extract (53 rows):** `001#5`; `008#9,#14`; `009#4`; `010#9`; `011#4`; `012#7`; `013#7`; `014#6`; `017#4`; `020#9`; `021#12`; `022#4`; `028#3`; `029#5`; `033#7`; `035#3`; `039#7`; `046#5`; `049#14`; `050#11`; `051#10`; `053#17`; `054#8,#14`; `055#19,#22`; `057#3`; `058#6`; `059#9`; `060#7`; `061#4`; `062#5` (`1 tsp pure vanilla extract`); `063#5`; `068#8`; `070#8`; `071#4`; `073#12`; `075#3`; `081#15`; `088#9` (`2 tsp pure vanilla extract`); `091#9,#16`; `092#6`; `094#6,#17`; `100#6`; `107#5`; `109#7`; `110#6,#14`; `114#12,#18`.
- **Almond extract (10 rows):** `003#5`; `011#9`; `017#5`; `028#4`; `029#6`; `063#4`; `079#5,#8` (both optional); `081#14`; `110#13`.
- **Vanilla pod (one row):** `045#6`, `1 vanilla pod`, linked to `ingredient-ref-vanilla-pod`.

Two non-ingredient fields also matched the contextual scan: recipe `055#20–21` have the group label “Vanilla glaze” on icing sugar and whole milk lines; the vanilla extract is separately and explicitly linked in `055#22`. One additional row is broad rather than exact demand: recipe `065#5` says `Flavoring, to taste` and gives “vanilla, cocoa, or peanut butter” as examples in notes. It does not identify a vanilla product or quantity and is not a basis for an extract, paste, powder, or sugar link. No ingredient row names vanilla paste/powder/sugar; lemon, orange, citrus, mint, peppermint, or spearmint extract; or another named culinary extract.

## Granular dispositions and identity boundaries

| Candidate | Disposition | Name / alias and data recommendation |
|---|---|---|
| Vanilla pod / bean | **Accept existing identity; accept one alias candidate** | Keep FR `gousse de vanille` and EN display `vanilla pod`; add EN alias `vanilla bean` if the coordinator approves a seed update. OQLF’s GDT directly gives `gousse de vanille` / `vanilla bean`; a separate GDT entry gives `vanilla pod`. Do not alias bare `vanilla` to the pod. |
| Vanilla extract | **Accept and retain existing identity and 53 links; accept standard-name alias candidates** | Keep `extrait de vanille` / `vanilla extract`; add `essence de vanille` and `préparation aromatisante à la vanille` in FR, plus `vanilla essence` and `vanilla flavour` in EN. CFIA’s vanilla standard groups extract, essence, and flavour from cured vanilla fruit and establishes composition strength. Also add `pure vanilla extract` as an EN alias to cover two recipe lines and picker search; McCormick labels a vanilla-bean-extractives/water/alcohol SKU “Pure Vanilla Extract.” Do not alias generic `arôme de vanille`, artificial/imitation products, or the unsupported `vanille liquide`; review the latter for removal unless Québec package evidence establishes the narrower meaning. |
| Almond extract | **Accept and retain existing identity and 10 links; accept standard-name alias candidates** | Keep `extrait d'amande` / `almond extract`; add `essence d'amande` and `préparation aromatisante à l'amande` in FR, plus `almond essence` and `almond flavour` in EN. CFIA groups these names under one standardized preparation, with the same kernel sources and volatile-oil threshold. This is not an alias for the edible sweet-almond ingredient, almond paste, or amaretto. Keep “pure” or “imitation” qualifiers when explicitly present in future recipe text. |
| Vanilla bean paste | **Defer** | No recipe demand. If later needed, record as a distinct prepared flavouring/product identity rather than aliasing it to the pod or blindly treating it as a form of extract: the reviewed Nielsen-Massey SKU includes sugar, water, extract, seeds, and gum tragacanth. This formula is product-specific. |
| Vanilla powder / ground vanilla | **Defer; keep terms distinct pending exact product** | No recipe demand. “Powder” does not establish whether a product is ground pod or extractives carried on a dry ingredient: Nielsen-Massey’s powder is maltodextrin plus vanilla-bean extractives. Do not alias generic `vanilla powder` to ground beans or vanilla extract. |
| Vanilla sugar | **Defer** | No recipe demand. OQLF’s GDT defines `sucre vanillé` / `vanilla flavoured sugar` as sugar flavoured with vanilla extract or essence; another GDT record describes sugar with natural vanilla/natural vanilla extract. It is a sweetened blend, not vanilla extract or plain sugar. Do not make an extract conversion. |
| Lemon and orange extracts | **Defer; separate only on later exact demand** | No recipe demand. CFIA Volume 9 gives distinct standards and names for each fruit and its extract/essence/flavour; OQLF has `extrait de citron` / `lemon extract`. If created later, keep each flavor-specific name pair and its Canadian standard-name aliases together. Do not create a broad `citrus extract` parent alias, or link zest, peel, juice, and extract as equivalents. |
| Peppermint and spearmint extracts | **Defer; do not collapse to generic mint** | No recipe demand. CFIA Volume 9 defines peppermint and spearmint preparations separately by plant/oil and strength. If created later, keep `menthe poivrée` distinct from `menthe verte` / spearmint. If a future line says only mint extract, preserve that wording as unresolved rather than choosing a species. |
| Other culinary extracts/flavourings | **Defer a catch-all** | Create a flavor-specific identity only when an exact recipe or confirmed product calls for it. Keep natural, imitation/artificial, and blended-product qualifiers when given. A manufacturer’s product catalogue separately names products such as pure peppermint, pure mint, pure lemon, pure orange, and extracts with “other natural flavors”; catalogue names are not a universal composition standard. |

## Measurement and substitution limits

- Do not assign a density or volume-to-mass mapping to any reviewed extract or vanilla pod. Current extract records have null density and empty `unitMappings`; the pod also has no measurement data. No family-specific forms exist.
- Recipe demand shows recipe-entered amounts in teaspoons, tablespoons, and millilitres for the extracts, and one pod by count. These are source recipe amounts, not density evidence or cross-product equivalencies.
- Do not create a global pod↔extract, extract↔paste, extract↔powder, or extract↔vanilla-sugar conversion. Nielsen-Massey advertises same-measure or tablespoon-to-bean equivalencies for its named products; these are manufacturer claims for those formulations, not a general rule. The powder carrier and paste ingredients demonstrate why product composition matters.
- Do not substitute almond, citrus, or mint extracts for vanilla or for one another. Their flavor profiles and standardized source materials differ. No directed conversion/substitution rule is supported, and both live substitution-rule arrays contain zero entries.
- CFIA supports vanilla and almond essence/flavour names as aliases only within those defined natural, flavor-specific Canadian standards. Preserve the artificial/imitation qualifier on products that use it; do not collapse those products into the same unqualified identity. For other extracts, apply the same standard-name grouping only where CFIA actually defines that flavor.

## Source map and limits

Sources checked on 2026-10-09:

1. CFIA, [Canadian Food Compositional Standards, Volume 9 — Flavouring Preparations](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), sections 9.1.1–9.1.6, 9.1.13, 9.1.15–9.1.16, 9.1.19, 9.1.23. This current incorporated-by-reference document distinguishes plant-derived extracts/essences/flavours from artificial/imitation products, and names vanilla, almond, lemon, orange, peppermint, and spearmint preparations. It provides standards for the named preparations; it does not define every retail flavoring or prove a universal recipe conversion.
2. CFIA, [French regulatory-reference summary for food compositional standards](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/resume-changements-normes-composition/references-reglementaires). Supports French common-name groups including `essence`, `extrait`, and `préparation aromatisante` for vanilla, almond, lemon, orange, peppermint, and spearmint; this is a regulatory-reference summary, not a full French reprint of the current standards.
3. OQLF, GDT, [`gousse de vanille`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17044954/gousse-de-vanille) (OQLF entry gives English `vanilla bean`) and [commercial `gousse de vanille`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3296735/gousse-de-vanille) (English `vanilla pod`; source credited to AFNOR). These support the botanical identity and proposed English alias; the entries describe the same whole fruit/pod, not the extract.
4. OQLF, GDT, [`extrait de vanille`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2499981/extrait-de-vanille), with English `vanilla extract`; the terminology entry credits CAOBISCO. It supports the term pair, not current Canadian regulation.
5. OQLF, GDT, [`extrait d'amande`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095057/extrait-damande). It gives the term pair and definition aligned with the Canadian standard. The record is dated 1982; rely on CFIA for current federal composition.
6. OQLF, GDT, [`extrait de citron`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095059/extrait-de-citron). Supports `lemon extract` and distinguishes this extract from raw zest. The entry is dated 1982; the current CFIA standard governs standardized products.
7. OQLF, GDT, [`sucre vanillé`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8433495/sucre-vanille) and [another vanilla-sugar entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8439538/sucre-vanille). Supports the Québec French term and blend boundary; both records are older and do not establish a single present-day commercial formulation.
8. OQLF, GDT, [`menthe poivrée`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095299/menthe-poivree). Supports the French botanical term and English `peppermint`; the federal standard supplies the separate extract definition.
9. Nielsen-Massey, [Pure Vanilla Bean Paste](https://nielsenmassey.com/products/pure-vanilla-bean-paste/) and [Pure Vanilla Powder](https://nielsenmassey.com/products/pure-vanilla-powder/); see also its [FAQ](https://nielsenmassey.com/faq/). Product pages list the paste ingredients and powder carrier/extractives, and make equivalency claims for their own products. These claims are not generic culinary conversions or evidence that all brands use the same formula.
10. McCormick, [Extracts & Food Color product catalogue](https://www.mccormick.com/collections/extracts-food-color). It illustrates separately marketed flavor-specific and blended/artificially flavored products. It is a United States product catalogue, not a Canadian compositional standard or Québec terminology source.
11. McCormick, [Culinary Pure Vanilla Extract, 32 fl oz](https://www.mccormick.com/products/mccormick-culinary-pure-vanilla-extract-32-fl-oz). The product page labels a specific product “Pure Vanilla Extract” and lists vanilla-bean extractives in water and alcohol. It supports the observed qualifier as a product name, not a separate universal identity or a composition claim for every “pure” product.

OQLF terminology pages are useful for Québec French names but several entries are dated and some identify a third-party source. CFIA standards apply only to products represented by the specified standardized names and scope; they do not settle every imported, blended, or imitation product label. Manufacturer formula and measure claims above are limited to the named company/SKU. This review makes no safety, allergen, alcohol-handling, or product-level label determination.

## Coordinator follow-up

1. At seed-integration time, repeat the reference/form/legacy and 114-file recipe audit against the then-live snapshot and confirm the hashes have not changed.
2. Retain the already linked vanilla-extract, vanilla-pod, and almond-extract identities. If accepted, add the source-backed vanilla-pod and standardized vanilla/almond essence-flavour aliases described above; do not add a bare `vanilla` alias.
3. Decide whether to remove current alias `vanille liquide` after reviewing Québec package terminology. No bundled recipe requires it; keep it only if the coordinator accepts the source/ambiguity tradeoff.
4. Leave no-demand products deferred and keep all density, unit-mapping, form-conversion, and ingredient-substitution fields empty unless later product-specific evidence supports a narrowly scoped rule.
5. Keep the broader Section E checklist open; this review resolves only this vanilla/extract boundary and does not audit or complete the other Section E items.
