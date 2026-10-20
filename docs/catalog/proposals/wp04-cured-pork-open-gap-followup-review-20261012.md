# WP04 Section O cured-pork open-gap follow-up — 2026-10-12

- **Packet type:** boundary review, followed by a ledger-only hold integration. The active reference catalog and recipe rows remain unchanged; the unresolved candidate and source evidence are now in the research ledger. See the [hold integration record](../batches/wp04-section-o-corned-beef-scope-hold-20261012/README.md).
- **Scope:** recheck the still-unchecked Section O checklist line for bacon, pancetta, guanciale, salt pork, ham, prosciutto, jamón, smoked meat, corned beef, and dried/cured meats. The earlier cured-pork and salt-pork decisions are not reopened.
- **Disposition:** the existing boundaries are sufficient for the reviewed pork identities and Montréal smoked meat. **Corned beef remains an evidence-backed hold for catalog integration:** CFIA establishes a standardized product and French common name, but `bœuf salé` is also Québec restaurant terminology, and this catalog treats a reference's `nameFr` as a search term. With no recipe demand, do not create an exact owner that would resolve ambiguous bare French text to the canned product. Broad salt pork and unqualified jamón remain intentional holds. Generic dried/cured meat remains a family description, not a source-stable ingredient identity.
- **Source IDs:** `WP04-CURED-PORK-FOLLOWUP-20261012-S01` through `S05` are stored on the ledger-only `ingredient-ref-corned-beef` candidate record (`needs_clarification`).

## Checklist state and related decisions

The master plan keeps the aggregate line unchecked at `docs/RecipeBook-global-ingredient-catalog-plan.txt` around line 2695. Its children for the bacon/pancetta/guanciale/ham/prosciutto identities, the salt-pork review, and Montréal smoked meat are checked. The remaining named gap in that line is corned beef; the broad dried/cured-meat family still requires product-specific scope rather than one generic reference.

The earlier [cured-pork boundary proposal](wp04-section-o-cured-pork-boundaries-20261010.md) and [2026-10-10 integration batch](../batches/wp02-wp03-wp04-fruit-grain-cured-pork-integration-20261010/README.md) already establish separate bacon, pancetta, guanciale, ham, and prosciutto identities. The [salt-pork follow-up](wp04-salt-pork-identity-followup-20261010.md) documents the held broad salt-pork scope. The [Montréal smoked-meat proposal](wp04-section-o-montreal-smoked-meat-identity-review-20261011.md) and [integration batch](../batches/wp04-section-o-montreal-smoked-meat-integration-20261011/README.md) already distinguish Montréal smoked meat from pastrami, corned beef, and generic smoke/cure phrases.

The dried-meat work is also bounded by existing regional references: [biltong](../batches/wp02-wp06-regional-flour-starch-africa-integration-20261010/README.md), [charqui](../batches/wp06-charqui-identity-20261009/README.md), and [Peruvian Amazon cecina](../batches/wp06-cecina-identity-20261009/README.md). Those decisions keep their products separate and do not create generic `jerky`, `dried meat`, or `cured meat` aliases.

## Current package and complete recipe audit

The current manifest lists 114 bundled recipes and 1,123 ingredient rows. I parsed every manifest-listed recipe file and checked the complete recipe JSON plus each row's `originalText` and `ingredientName` for the listed cured-meat names. Phrase equality used the project `normalize_search_key` normalizer with token boundaries, so substrings such as `ham` inside `graham` or `hamburger` were not counted.

Only one exact checklist match remains in recipe rows: recipe **089, `Mushroom and Ham Quiche`, row 1** — `1 cup diced ham`, `ingredientRefId: ingredient-ref-ham`. This is the existing generic ham link; it does not specify a cured regional style. The earlier ham-cup proposal records a source-specific USDA portion but leaves its applicability to this recipe unresolved; it does not identify the recipe's ham state or justify changing its line. No row requests bacon, pancetta, guanciale, salt pork, prosciutto, jamón, Montréal smoked meat, pastrami, corned beef, jerky, biltong, charqui, or cecina. Other pork rows are fresh ribs, fresh boneless shoulder, fresh loin chops, and a pork dry rub; none is cured-meat evidence.

## Exact-key ownership in the current canonical package

The exact-key audit used the project normalizer across active reference names and aliases, form labels and match terms, and legacy-candidate names and aliases.

| Exact key(s) | Current exact owner |
|---|---|
| `bacon`, `bacon américain` | Active `ingredient-ref-bacon` |
| `pancetta`, `poitrine roulée` | Active `ingredient-ref-pancetta` |
| `guanciale` | Active `ingredient-ref-guanciale` |
| `ham`, `jambon` | Active `ingredient-ref-ham` |
| `prosciutto`, `prosciutto ham` | Active `ingredient-ref-prosciutto` |
| `smoked meat`, `Montreal smoked meat`, `viande fumée de Montréal`, `viande fumée style Montréal` | Active `ingredient-ref-montreal-smoked-meat`; the English display is region-scoped and the French borrowed display is OQLF-supported Montréal terminology |
| `biltong` | Active `ingredient-ref-biltong` |
| `salt pork`, `petit salé`, `petit-salé`, `lard salé`, `porc salé` | No active reference, form, or legacy owner. Ledger-only candidate `ingredient-ref-salt-pork` remains `needs_clarification`. |
| `jamón`, `jamon`, `jamón serrano`, `jamón ibérico` | No active reference, form, or legacy owner. Ledger-only candidate `ingredient-ref-jamon` remains `needs_clarification`. |
| `corned beef`, `bœuf salé`, `bœuf en conserve`, `pastrami` | No active reference, form, or legacy owner. Ledger-only `ingredient-ref-corned-beef` is a `candidate` with `needs_clarification`; `bœuf en conserve` is not an active alias. |
| Generic `jerky`, `beef jerky`, `charqui`, `charque`, `cecina`, `dried meat`, `cured meat`, `viande séchée`, `viande fumée`, `viande salée` | No exact generic owner. The active `ingredient-ref-charqui` and `ingredient-ref-peruvian-amazonian-cecina` retain qualified full display names; they do not own the bare family terms. |

`back bacon`, `bacon de dos`, and `bacon canadien` also have no exact active key. The Canadian cut distinction was already resolved in the cured-pork proposal; no bundled line currently calls for a separate back-bacon identity.

## Remaining product gap: corned beef

Unlike salt pork, corned beef has a Canadian standardized common name: CFIA's current Volume 7 entry pairs **Corned Beef / Bœuf salé** and specifies a cooked-and-cured product made from coarsely cut, pre-cooked boneless beef or a mixture that may include fresh boneless beef. OQLF's 1982 GDT entry gives `bœuf salé` as the preferred French term for `corned beef` and describes salted brisket ordinarily boiled. A separate 1984 OQLF entry adds a Québec restaurant-versus-can distinction; see the addendum below. MAPAQ's 2024 *Bottin* lists `bœuf en conserve (corned beef)` as a Québec retail-product category; this supports the canned-market sense, but is not a product specification or a preferred-term ruling.

These sources establish a product boundary but do not support an unambiguous bare French search key: OQLF describes a Québec restaurant dish made from salted brisket, while CFIA standardizes a cooked-and-cured product made from coarsely cut, pre-cooked boneless beef. Preserve that distinction; do not turn it into a shared brisket, canned, or deli-sliced form or a recipe-interchangeability claim. They do not establish equivalence with Montréal smoked meat, pastrami, salt pork, or generic salted beef. The MAPAQ category `bœuf en conserve` supports a canned-product reading, but it should not be added as a global alias without exact package or recipe evidence.

**Disposition:** hold the proposed `ingredient-ref-corned-beef` identity for now. The audited recipe corpus contains no corned-beef request, so a catalog display choice has no current recipe need to resolve.

## Addendum: OQLF's 1982 and 1984 scopes

The two OQLF records should be read together rather than treating the earlier entry as an all-purpose equivalence. The 1982 record (source S01) gives `bœuf salé` as the preferred French term for English `corned beef` and defines it as salted brisket ordinarily boiled and often served with cabbage. The distinct 1984 record (source S05) repeats that restaurant meaning for Québec, then says the term `corned-beef` is reserved, even on French labels (shown in quotation marks), for the internationally known canned product, which it says must not be confused with restaurant `bœuf salé` or pressed beef. The later note therefore exposes a real Quebec usage collision: `bœuf salé` can name restaurant-style salted brisket, while `corned-beef` names the canned product in that note. Neither OQLF record says that every product meeting the 1984 canned-product sense has the same composition as the earlier salted-brisket definition.

CFIA's current bilingual Volume 7 resolves the regulatory display for the standardized identity: Table 2, item 22 is headed `Corned Beef` in English and `Bœuf salé` in French. It requires coarsely cut, pre-cooked boneless beef (or a mixture with fresh boneless beef), salt and preservative; the required treatment is cooked and cured. It sets a minimum of 21% meat-product protein when the product is in a hermetically sealed package. This row standardizes a meat product; the 21% condition is explicitly package-specific, and the row does not say every `bœuf salé` restaurant dish is that product.

MAPAQ's 2024 *Bottin*, table 15, lists `Bœuf en conserve (corned beef)` as a retail-product category with 44% growth in average sales volume between 2020–2021 and 2022–2023, citing NielsenIQ retail-sales data compiled by MAPAQ. That supports the canned retail sense in Quebec. It does not establish `bœuf en conserve` as the CFIA standardized common name or as a general alias for restaurant salted brisket.

**Recommendation:** hold this identity until a product-specific recipe or catalog request appears. Under the current implementation, `IngredientReference.searchTerms()` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` includes both `nameFr` and `nameEn`, and the search index returns exact phrase matches on those terms. Therefore a row with `nameFr: bœuf salé` would be returned as an exact match for bare Québec recipe text; a scope note would not prevent that result or tell the caller whether the recipe means the restaurant dish or canned product. The 1984 OQLF note supports writing `corned-beef` in quotation marks for the canned product in French labelling, but using that English loanword as the catalog's general French display would depart from CFIA's standardized French common name `Bœuf salé`, and no recipe currently requires that compromise. Do not add either display as an exact owner now. Reopen when an exact recipe or product source establishes the intended product; then assess a product-qualified French display and ensure its matching terms do not claim bare `bœuf salé` without resolving the restaurant/canned distinction.

## Remaining held scope

- **Salt pork:** the existing decision is sufficient for this snapshot. The OQLF term maps to products described as salted and cooked, while prior CFIA and Québec retail evidence did not resolve the intended cut/state for a hypothetical recipe. Keep the broad candidate and French terms inactive until a concrete recipe or source-scoped item appears; no current recipe row supplies that trigger.
- **Jamón:** the existing hold is sufficient for this snapshot. No exact recipe row asks for unqualified jamón or a named Spanish ham. Preserve a Serrano or Ibérico qualifier if a future row requires one; do not merge the name into ham or prosciutto.
- **Dried/cured meats:** no single generic identity is supported by the current regional product set. Keep biltong, charqui, and Peruvian Amazon cecina separate; review other named dry-cured products only when an exact recipe or explicitly scoped product request identifies them. No generic “dried/cured meats” reference is proposed.
- **Broader Section O:** the rest of the animal-food checklist remains open on its own terms. This packet does not revise those categories or the existing sausage, offal, or meat-cut reviews.

The Section O aggregate checklist line remains open: corned beef is held pending product-specific demand, and future named-product requests still need their own boundary review. No current recipe link or numeric behavior is proposed.

## Source register

| Source ID | Source and supported scope |
|---|---|
| `WP04-CURED-PORK-FOLLOWUP-20261012-S01` | Office québécois de la langue française, [bœuf salé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432753/boeuf-sale), last updated 1982; accessed 2026-10-12. Supports the Québec French term `bœuf salé` for `corned beef` and the source's description of salted brisket ordinarily boiled. It is terminology/product description evidence, not a full retail specification. |
| `WP04-CURED-PORK-FOLLOWUP-20261012-S02` | Canadian Food Inspection Agency, [Normes d'identité canadiennes, Volume 7 – Produits de viande](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-7), last modified 2024-12-18; accessed 2026-10-12. Table 2 names `Bœuf salé` and specifies the Canadian standardized cooked-and-cured beef product. This supports the identity and French display, not a recipe measurement or universal form. |
| `WP04-CURED-PORK-FOLLOWUP-20261012-S03` | Canadian Food Inspection Agency, [Exigences en matière d’étiquetage des produits de viande et de volaille](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/produits-viande-volaille) and [English page](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products); accessed 2026-10-12. Supports use of prescribed common names for standardized meat products and descriptive treatment wording where no prescribed common name applies. It does not assign recipe semantics to every retail use of `corned beef`. |
| `WP04-CURED-PORK-FOLLOWUP-20261012-S04` | Ministère de l’Agriculture, des Pêcheries et de l’Alimentation du Québec, [Le Bottin : consommation et distribution alimentaires en chiffres, édition 2024](https://www.mapaq.gouv.qc.ca/fr/Publications/Bottin_consommation_distribution.pdf); accessed 2026-10-12. Lists `bœuf en conserve (corned beef)` in a Québec retail-growth category, with source-period comparisons for 2020–21 and 2022–23. This supports market-category presence, not a current label, formulation, or synonym ruling. |
| `WP04-CURED-PORK-FOLLOWUP-20261012-S05` | Office québécois de la langue française, [bœuf salé (GDT, 1984)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298323/boeuf-sale); accessed 2026-10-12. The note says that in Québec restaurants `bœuf salé` is salted brisket ordinarily boiled and served with cabbage, while `corned-beef` is reserved—even on French labels, in quotation marks—for the internationally known canned product, distinct from restaurant `bœuf salé` and pressed beef. Supports a source-specific usage distinction; it does not override the current CFIA standardized common-name row. |

## Refreshed package snapshot

Counts and hashes below are from the current canonical files at review time. File hashes cover exact file bytes. The recipe-corpus digest processes each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and another NUL byte in manifest order.

| Data | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,197 | `4d12c120489d6076127f3b797f439ebdafbe8b1db4706c46b8c6467b8b699be1` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Research ledger | 1,499 records / 5,048 source entries / 4,118 distinct source IDs | `4fcb1fc52a2387b821f5293945576d337a2e01b7e60082fea5b3816241e0ea89` |
| Legacy candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |

No tests were run because the integration only adds an unresolved candidate and evidence to the research-ledger JSON database.
