# WP05 Section Y follow-up: Toum and preserved lemon

## Work-packet contract

- **Input revision:** `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4` (`main`, read from live HEAD before this review).
- **Owner:** `/root/wp05_south_central_mena` (research proposal author).
- **Reviewer and integration owner:** `/root` (coordinator).
- **Scope:** only the two Section Y candidates Toum and preserved lemon. This supplements the same candidates noted in `wp05-south-central-asia-mena.md`; it does not repeat the other MENA candidates or the coordinator's labneh/za'atar/amchur/sumac batch.
- **Evidence accessed:** 2026-10-08; the three Toum source pages were rechecked on 2026-10-09.
- **Acceptance:** Toum integrated on 2026-10-09 after coordinator review; preserved lemon remains unmodeled. The broad Section Y checklist remains open.
- **Live preflight:** canonical refs contain no Toum or preserved-lemon entry; the existing lemon record is `ingredient-ref-lemon` (`lemon` / `citron`, category `FRUIT`). The canonical forms file has 16 records and no Toum/preserved-lemon match. The legacy-candidate and evidence-ledger files had no term match. The unique target path was absent before writing.
- **Recipe audit:** read all 114 bundled recipe JSON files and scanned ingredient-line records for Toum, preserved lemon(s), salt-preserved lemon terms, and French *citron(s) confit(s)/conservé(s)*. No ingredient line matched.

## Candidate disposition and changed-record proposal

| Candidate | Proposed disposition and EN / fr-CA names | Language-scoped aliases | Boundaries, collisions, and category |
|---|---|---|---|
| Toum | **New condiment identity**; suggested stable ID `ingredient-ref-toum`. EN display: **toum**. fr-CA display: **sauce toum**. The English product label uses “Toum Lebanese-Style Garlic Sauce”; McCormick Canada uses *sauce toum* in fr-CA, and a Québec recipe source titles it *Sauce libanaise à l’ail (Toum)*. | No English alias: the full product title is evidence for the identity but its `garlic sauce` suffix would cause the current picker’s partial-match fallback to return Toum for generic `garlic sauce`. fr-CA alias: `sauce libanaise à l'ail (toum)` (Bon pour toi page title). Do **not** alias unqualified `garlic sauce` / `sauce à l'ail`, `aioli` / `aïoli`, or mayonnaise. | Recommend `SAUCE_AND_CONDIMENT`. Treat Toum as a named Lebanese/Levantine garlic condiment, separate from generic garlic sauce. Do not constrain identity to one universal formula: official Canadian product descriptions show different product formulations and source recipes vary; product additions such as spices, thickeners, or milk belong to their own product/derivative context, not Toum aliases. “Mayonnaise miracle” is a comparison in a source, not an equivalence. No form row proposed. |
| Preserved lemon | **No new fruit identity or active record proposed.** Existing `ingredient-ref-lemon` stays the base identity. If the coordinator later decides a recipe-visible preparation must be modeled, use EN **preserved lemon** and fr-CA **citron confit au sel** as source-backed candidate labels, but this packet proposes **no new form ID or form row**. | No aliases proposed. In particular, leave bare `citron confit` inactive/ambiguous; do not attach the preparation term as an alias to ordinary lemon. | Mina describes Moroccan beldi lemons cured in sea salt, with both pulp and rind edible. Radio-Canada’s Québec French source names *citrons confits au sel* but notes that cooks may prefer using the rind because the pulp can be very salty. OQLF’s entry *écorce de citron confite* is lemon peel cooked in sugar/syrup, a different product boundary. Thus “preserved lemon” refers to a salted lemon preparation; it does not establish a standalone fruit identity or a single usable pulp/rind form. Keep category `FRUIT` on the base lemon; do not classify the preparation as generic candied peel. |

## Source evidence

All sources were directly checked or returned as indexed source-page text on 2026-10-08. Product pages establish named products and product-specific descriptions, not a universal recipe.

1. Farm Boy, “Farm Boy™ Toum Lebanese-Style Garlic Sauce (275 g)” — <https://www.farmboy.ca/products/farm-boy-toum-lebanese-style-garlic-sauce-275-g/>. The official English product title contains the Toum name; the description calls it a Lebanese cuisine staple. Its listed product ingredients are canola oil, garlic, lemon juice, water, and salt, with the ingredient list also supplied in French. This is one product example, not a universal formula.
2. McCormick Canada / Club House for Chefs, “Poulet rôti et sauce toum” — <https://www.clubhouseforchefs.ca/fr-ca/recettes/flavour-forecast/poulet-roti-et-sauce-toum>. Direct fr-CA terminology *sauce toum*; describes it as a Levant condiment and uses it as a dip, sauce, or spread. Its recipe also illustrates a prepared Toum-derived liquid sauce, which should remain contextually distinct.
3. Bon pour toi, “Sauce libanaise à l’ail (Toum)” — <https://bonpourtoi.ca/recettes/sauce-libanaise-a-lail-toum/>. Direct Québec French title, classifies the recipe under condiments and describes garlic emulsion. This supports the proposed full-phrase fr-CA alias, not an unqualified *sauce à l’ail* alias.
4. Mina, “Preserved Lemons” — <https://mina.co/products/preserved-lemons>. Direct English product page describes Moroccan beldi lemons cured in sea salt and says its pulp and cured rind are edible. The maker states it does not currently ship internationally; this source is used for product identity/form description, not Canadian availability or French localization.
5. Radio-Canada / Mordu, “Comment faire des citrons confits au sel” — <https://radio-canada.ca/mordu/techniques/3166/comment-faire-citrons-confits-sel>. Directly indexed Québec French source uses the qualified term *citrons confits au sel* and discusses salt-cured lemons, rind/pulp use, and variation by culinary use. The open-page fetch was blocked by robots.txt; the search index returned the article text and title.
6. Maghreb Market, “Citron confit - Les vergers de Marrakech 720g” — <https://www.maghrebmarket.ca/fr/products/preserved-lemon-les-vergers-de-marrakech-720g-%D9%84%D9%85%D8%B5%D9%8A%D8%B1>. Canadian French retail text labels a product *citron confit* and describes lemons salted and kept in lemon juice. Page text was returned by the search index; direct open returned a blank/dynamic page. This supports product wording only; it does not justify activating bare *citron confit* as an alias because that phrase is ambiguous across preparations.
7. Office québécois de la langue française (OQLF), GDT, “écorce de citron confite” — <https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432972/ecorce-de-citron-confite>. The entry defines lemon peel cooked in sugar/syrup (candied lemon peel). This is a narrower but distinct lexical neighbor; keep it separate from salt-preserved whole lemons.
8. Well.ca, “Achetez la sauce à l’ail Toum de Habibi & Spread Original” — <https://well.ca/fr/produits/habibis-toum-garlic-sauce-spread_312576.html>. The indexed Canadian listing supplies the French title and English product title and describes its own Canadian-made packaged spread; direct open returned HTTP 403, so it is supplementary only. No identity boundary or alias proposal depends on this listing.

## Numeric and substitution disposition

No density, measurement-conversion, ingredient unit mapping, package yield, or substitution is proposed. Restaurant or recipe quantities are recipe-specific and do not establish general Toum proportions or lemon conversions. Product net sizes/serving sizes are not ingredient conversions. No category average, inferred factor, recipe yield, or substitute has been created. These values remain unavailable.

## Checks needed before any integration

1. Re-read refs, forms, legacy candidates, and ledger at integration time; confirm no parallel promotion has occurred.
2. Review the proposed Toum ID/category and run canonical ID, localized alias-collision, schema, provenance, and generated-index checks if it is integrated. Keep unqualified garlic-sauce/aioli terms inactive.
3. Confirm whether the exact Toum spelling and proposed fr-CA label/alias fit the catalog’s name-vs-alias convention; the cited sources support those exact terms.
4. Do not create a preserved-lemon ID. If a future form row is considered, first confirm the existing form vocabulary can encode salted preservation without conflating rind-only recipe use, whole-fruit product form, or candied peel; establish a recipe need and reviewer-approved stable form ID.
5. No project tests were run because this is a proposal-only packet. Run the repository’s applicable catalog validation and checks after any separately approved integration.

## Acceptance status and open points

**Coordinator integration — 2026-10-09.** Added `ingredient-ref-toum` as `toum / sauce toum` in `SAUCE_AND_CONDIMENT`, with only the source-attested French alias `sauce libanaise à l’ail (toum)`. The Farm Boy English product title remains evidence, not an alias: because the picker has a partial-match fallback, storing that full title would make generic `garlic sauce` return Toum. The three sources below are recorded as `WP05-Y-TOUM-20261009-S01` through `S03`. Generic garlic sauce, aioli, and mayonnaise remain separate. No form, density, unit mapping, package yield, conversion, substitution, or recipe link was added. The product nutrition serving is not a generic measurement. Preserved lemon remains unmodeled: the 114-recipe audit found no ingredient-line need, and the reviewed sources do not establish one form that covers both whole salt-cured lemons and rind-only recipe use. Keep bare *citron confit* separate from the OQLF candied-lemon-peel term. The Toum checkpoint is complete; the larger Section Y checklist remains open.

### Canonical source IDs

| ID | Source | Evidence used and limit |
|---|---|---|
| `WP05-Y-TOUM-20261009-S01` | [Farm Boy Toum Lebanese-Style Garlic Sauce](https://www.farmboy.ca/products/farm-boy-toum-lebanese-style-garlic-sauce-275-g/) | Canadian product title and product-specific description/ingredient list support the named product and condiment use; no universal formulation or conversion. |
| `WP05-Y-TOUM-20261009-S02` | [Club House pour les chefs, Poulet rôti et sauce toum](https://www.clubhouseforchefs.ca/fr-ca/recettes/flavour-forecast/poulet-roti-et-sauce-toum) | Canadian French uses *sauce toum* for a Levantine condiment; a prepared liquid Toum sauce is described separately. The mayonnaise comparison is rhetorical, not substitution evidence. |
| `WP05-Y-TOUM-20261009-S03` | [Bon pour toi, Sauce libanaise à l’ail (Toum)](https://bonpourtoi.ca/recettes/sauce-libanaise-a-lail-toum/) | Québec French title and condiment classification support the full phrase; no unqualified *sauce à l’ail* alias. |
