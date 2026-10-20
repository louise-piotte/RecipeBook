# WP05 R325 — Québec French display review: bagna cauda

- **Reviewed:** 2026-10-16
- **Status:** Proposal only. No catalog, ledger, plan, roadmap, generated, recipe, or integration file was changed.
- **Scope:** The global ingredient-catalog plan at lines 8138–8144. The enclosing purchased-sauce item remains open; its checked identity subtask explicitly leaves “independent Québec review of the borrowed bagna cauda display” open.
- **Recommendation:** Retain the active French and English display bagna cauda and the existing spelling alias bagna caoda in both locales. Current French menus from Québec restaurants use bagna cauda directly. Treat this as local menu-usage evidence, not as an OQLF ruling or proof that the term is universally preferred. Do not add a translated alias or change other catalog data.
- **Non-overlap:** The 2026-10-10 review and integration already established the regional identity. This proposal addresses only the expressly pending Québec French display review; it does not repeat identity activation or reopen other sauce candidates.
- **Limits:** This is a terminology-only decision. The menu evidence does not define a standard recipe, product formula, conversion, or substitution.

## Active ownership and prior decision

The live reference ingredient-ref-bagna-cauda is the sole exact identity owner found:

| Field | Current value |
|---|---|
| French display | bagna cauda |
| English display | bagna cauda |
| French alias | bagna caoda |
| English alias | bagna caoda |
| Category | SAUCE_AND_CONDIMENT |
| Forms | None attached |
| Density and unit mappings | null density; empty mappings |
| Recipe links | None |

The live legacy-import identities contain no exact bagna cauda/caoda identity. The ledger marks identity verified while measurement and substitution research remain not_yet_researched. Its accepted 2026-10-10 decision keeps the borrowed French display provisional pending this independent Québec review and already rejects aliases for generic garlic sauce, anchovy paste, pesto, hot sauce, or an unspecified dip. The earlier source IDs WP05-CSCR-20261010-S08 and S09 remain the regional and Canadian culinary evidence for that identity decision.

## Québec French usage and terminology boundary

Two Québec City restaurants use bagna cauda in French menu text. Restaurant Melba’s current French menu places it in “Oeuf mimosa, mousse de saumon, bagna cauda & habanada”; the page identifies the restaurant as being in Québec City. Mora’s French-Canadian menu, last updated 2026-10-07, lists “Bœuf | Bagna cauda (hollandaise ail et anchois) | Mille-feuille de pommes de terre.” Together, these are examples of Québec French menu usage and support retaining the borrowed spelling as the French display.

Mora’s parenthetical hollandaise ail et anchois describes that restaurant’s preparation. It is not a general French synonym, proof that bagna cauda is hollandaise, or a reason to alias the two identities. Le Cendrillon’s French menu separately uses the menu-specific wording “bagna cauda à l’huile de homard”; that modifier identifies its own preparation and does not define the unqualified term.

The official Regione Piemonte French page uses “Bagna Caoda (la Sauce Cauda)” for the regional condiment. This supports the existing regional spelling alias. “Sauce Cauda” is explanatory wording on that Piemonte page, not evidence of a Québec-preferred synonym. A targeted web search limited to the OQLF Vitrine/GDT domain for the exact strings bagna cauda and bagna caoda did not surface a matching terminology entry in this review. That search result is not proof that no entry exists and does not substitute for an OQLF ruling.

No added alias is recommended. The picker already normalizes accents, so the query bagna càuda resolves to the same existing row as bagna cauda. The present evidence does not support adding translations such as sauce chaude, sauce aux anchois, anchoïade, or hollandaise ail et anchois as aliases. Those phrases are broader, source-specific, or identify separate products/preparations.

## Picker projection

Static projection against the current references and forms, following [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalized word-phrase-first matching and substring fallback, gives these results:

| Query | Results | Owner |
|---|---:|---|
| bagna cauda | 1 | ingredient-ref-bagna-cauda |
| bagna caoda | 1 | ingredient-ref-bagna-cauda |
| bagna càuda | 1 | ingredient-ref-bagna-cauda, through accent folding |
| bagna, cauda, or caoda | 1 each | ingredient-ref-bagna-cauda |
| sauce cauda, sauce chaude, or hollandaise ail et anchois | 0 each | No current owner |

The short tokens bagna, cauda, and caoda each return the same one row; no sibling identity or form competes for these terms. No broader alias is needed for discovery.

## Bundled recipe demand and data boundaries

The manifest currently lists 114 recipe JSON files with 1,123 ingredient lines. A scan of those ingredient lines found zero occurrences of bagna cauda, bagna caoda, bagna càuda, or sauce cauda. The bundle therefore supplies no recipe-line evidence for further aliases, forms, measures, or substitutions. The Québec restaurant menus above document external local usage, not bundled RecipeBook demand.

No data delta is proposed. Preserve the current display, spelling alias, category, null density, empty mappings, no-form state, no-link state, and ledger measurement/substitution states. The sources provide no ingredient quantities or universal recipe basis from which to infer a density, unit mapping, yield, form conversion, or substitution.

## Sources checked 2026-10-16

| ID | Source | Supports and limits |
|---|---|---|
| WP05-BAGNA-CAUDA-R325-20261016-S01 | Restaurant Melba, [French menu and restaurant location](https://restaurantmelba.ca/) | Québec City restaurant page uses bagna cauda in French menu text. Direct restaurant source and local usage evidence; it does not define the condiment or prescribe a Québec term. |
| WP05-BAGNA-CAUDA-R325-20261016-S02 | Mora, [French-Canadian OpenTable listing](https://www.opentable.ca/r/mora-quebec?lang=fr-ca) | Menu last updated 2026-10-07 uses Bagna cauda and the house descriptor hollandaise ail et anchois. Québec City location is listed. OpenTable is a third-party menu platform; the parenthetical describes that dish only. |
| WP05-BAGNA-CAUDA-R325-20261016-S03 | Le Cendrillon, [French menu](https://lecendrillonrestaurant.com/menu/) | Québec City restaurant menu uses Bagna cauda à l’huile de homard. Supports local use of the borrowed term in a restaurant-specific compound; it does not define unqualified bagna cauda. |
| WP05-BAGNA-CAUDA-R325-20261016-S04 | Regione Piemonte / PiemonteIS, [French Bagna Caoda page](https://www.piemonteagri.it/qualita/fr/produits/assaisonements-et-condiments/145-bagna-caoda) | Regional authority page calls the condiment Bagna Caoda and includes the explanatory “la Sauce Cauda.” Supports regional identity/spelling only, not Québec terminology or a generic translation. This is the same source page previously recorded as WP05-CSCR-20261010-S08. |

No OQLF result URL is assigned a source ID because this review did not locate a matching entry to cite. The exact search terms were bagna cauda and bagna caoda on the OQLF Vitrine/GDT; absence from those results is not evidence of absence from the database.
