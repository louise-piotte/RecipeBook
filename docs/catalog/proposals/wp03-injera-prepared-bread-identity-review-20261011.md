# WP03 Section G — Injera prepared-bread identity review

**Reviewed:** 2026-10-11

**Status:** root-integrated as identity-only `injera / injera`.

**Scope:** Injera as a finished regional bread identity. This review does not survey African cuisine, reopen other bread families, or review sourdough starter / ersho as ingredient identities.

## Recommendation

Add one identity-only reference candidate for **injera** under `BAKING_MIXIN_AND_PANTRY`, alongside the existing pita and lavash bread references. Use `injera` as both the English and fr-CA display name. Canadian French recipes, food writing, and a Montréal Ethiopian restaurant use that same name and describe the prepared item as an Ethiopian flatbread or crêpe [S04–S05, S07–S08], so an invented translation is unnecessary.

The identity is the cooked bread called injera, not teff grain or flour, a fermenting culture, or generic sourdough bread. Teff is common and preferred in many accounts, but primary household and formulation studies document injera made from cereal blends that include sorghum, barley, wheat, and maize [S01–S03]. Do not define the identity as teff-only or require one flour ratio, fermentation schedule, or cooking technique.

This is a coverage recommendation, not a recipe relink: the current manifest-listed corpus has no injera ingredient line. Keep `pain plat éthiopien` as explanatory wording rather than a global alias; the local sources use it as a gloss alongside `injera`, while it also overlaps the still-open generic-flatbread work. An optional English alias `injera bread` is sufficiently specific and is attested in English dictionary usage [S06]. No French alias is needed because the fr-CA display itself is `injera`.

| Field | Candidate |
| --- | --- |
| ID | `ingredient-ref-injera` |
| Category | `BAKING_MIXIN_AND_PANTRY` |
| English display | `injera` |
| English aliases | `injera bread` |
| fr-CA display | `injera` |
| French aliases | none |
| Density / unit mappings | none |

## Identity and boundaries

| Area | Disposition |
| --- | --- |
| Product identity | Finished injera bread / flatbread: a thin, soft, generally fermented cereal-batter product cooked on a hot griddle or pan. Québec French sources also describe it as a crêpe. The name identifies the prepared regional item, not a single grain formula. [S01–S05, S07] |
| Ingredient composition | Teff is common but not required by the identity. Household observations and research formulations show other cereal bases and blends. Keep a recipe’s actual flour ingredients on its recipe lines; do not map teff or a blend to injera. [S01–S03] |
| Process | Fermentation and baking conditions affect product properties. Do not encode an invariant fermentation time, temperature, batter hydration, cooking surface, or “eyes” criterion. Experimental ranges describe those studies only. [S01, S03] |
| Forms | None proposed. No catalog forms for teff-based, wheat-blended, quick, fermented, or cooked injera are justified by this identity review. The finished bread remains distinct from starter/culture wording. |
| Measurements | None. Recipe quantities are not calibration data; no per-piece mass, diameter, or volume measure is established. |
| Conversion | None. No density or mass-volume mapping follows from the ingredient variability or study-specific formulations. |
| Yield | None. A Canadian recipe’s yield of about 8–9 injera is specific to that recipe [S04], not a standard count or package yield. |
| Substitution | None. Similar appearance or meal use does not establish an injera-to-pita, lavash, naan, roti, paratha, tortilla, or generic-flatbread substitution. |
| Starter terminology | Starter/culture terms name a fermentation input, not the finished bread. Do not add them as injera aliases or forms. The existing sourdough-starter and ersho work remains outside this review. |

## Source-to-claim register

| ID | Source and supported claim | Limits |
| --- | --- | --- |
| **WP03-INJERA-20261011-S01** | Baye et al., [“Influence of flour blend composition on fermentation kinetics and phytate hydrolysis of sourdough used to make injera,” *Food Chemistry* 138(1), 430–436 (2013)](https://doi.org/10.1016/j.foodchem.2012.10.075). Household observations in North Wollo found lowland teff–white-sorghum and highland barley–wheat / wheat–red-sorghum practices; tested blend composition changed fermentation behavior. Supports a named bread identity whose cereal base is not fixed to teff. | Two communities in one Ethiopian area, not a complete national or diaspora taxonomy. Its article title’s “sourdough” refers to the fermentation study; it does not make generic starter terminology a bread name. |
| **WP03-INJERA-20261011-S02** | Gebre Mezgebe et al., [“Optimising sorghum-teff blends for improved injera quality and commercial use,” *Translational Food Sciences* 1(1) (2025)](https://doi.org/10.1093/trfood/vxaf009). This Ethiopian university study tests sorghum–teff blends and reports that cultivar and proportion affect sensory and handling properties. Supports composition and product-quality variation. | A controlled formulation study, not a required blend, market standard, or definition of all injera. |
| **WP03-INJERA-20261011-S03** | Jebessa et al., [“Comprehensive study on the effect of fermentation time, baking temperature and baking time on the physicochemical and nutritional properties of injera teff,” *Food and Humanity* 2 (2024), 100256](https://doi.org/10.1016/j.foohum.2024.100256). The teff-only experiment varies fermentation time (24, 48, 72 h), baking temperature (160, 180, 200 °C), and baking time (2–4 min), and reports changes in product properties. Supports keeping process and composition observations study-specific. | One teff formulation and experimental design; none of its settings becomes a general catalog conversion or process default. |
| **WP03-INJERA-20261011-S04** | Cuisinart Canada, [French-language recipe booklet, “Injera”](https://www.cuisinart.ca/on/demandware.static/-/Sites-ca-cuisinart-Library/fr_CA/dw8c97eb00/Instruction%20Booklet/CPP-200C_fr.pdf), pp. 12–13. The fr-CA heading uses `Injera` and describes it as a traditional Ethiopian flatbread. Supports the French display and a concise description. | Appliance booklet recipe wording, not an OQLF terminology ruling or standard product specification. Its stated 8–9 pieces is recipe-specific. |
| **WP03-INJERA-20261011-S05** | Bulk Barn, [Farine de teff](https://www.bulkbarn.ca/fr/products/all/teff-flour-gluten-free-241), French Canadian product page. Its recipe is titled `injera (pain plat éthiopien)` and combines teff with all-purpose flour. Corroborates local French usage and one non-teff-only recipe example. | Retail recipe attached to one flour product; not authoritative for Ethiopian practice, a universal formula, or terminology beyond the specific source wording. |
| **WP03-INJERA-20261011-S06** | Cambridge Dictionary, [“injera”](https://dictionary.cambridge.org/dictionary/english/injera). Gives the English headword `injera` and examples including `injera bread`; supports the proposed English alias. | General English dictionary evidence only; it does not set the fr-CA label or resolve composition. |
| **WP03-INJERA-20261011-S07** | Le Québec cuisine, [“L’accompagnement de crêpes à la farine ou semoule de teff”](https://quebecuisine.ca/book/laccompagnement-de-crepes-a-la-farine-ou-semoule-de-teff/). Québec French-language food writing directly names `injera` as the Ethiopian crêpe and describes a fermented batter cooked in a pan. Supports the borrowed fr-CA name and prepared-food referent. | This article focuses on teff and one preparation description; it does not establish that all injera is teff-based or set a universal process. |
| **WP03-INJERA-20261011-S08** | East Africa Restaurant, Montréal, [French home page](https://www.eastafricarestaurant.com/fr/) and [French menu](https://www.eastafricarestaurant.com/fr/menu/). The Montréal Ethiopian restaurant uses `injera` in French descriptions/menu wording for the prepared flatbread and in dish names. Supports local restaurant usage and confirms this is the finished food item. | Restaurant language and serving context only; some French wording is unidiomatic and is not a terminology-board recommendation or composition standard. |

## Exact-key and corpus audit

Snapshot read on 2026-10-11. Exact-key comparisons used Unicode NFKC, case folding, accent removal, punctuation-to-space conversion, and whitespace normalization. Checked `injera`, `injera bread`, `Ethiopian injera`, `injera (Ethiopian bread)`, `injéra`, `enjera`, `injira`, `pain plat éthiopien`, `pain éthiopien`, `galette éthiopienne`, and `pain injera`. The descriptive French phrases were scanned as audit candidates but are not proposed aliases.

| Artifact | Snapshot | SHA-256 |
| --- | ---: | --- |
| [Manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 942 references; zero exact normalized key matches | `99dd50dfaeca7ff39689aa5578db70cdfedefcb4aad73d4668ec2a9513205e46` |
| [Active forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 53 forms; zero exact normalized key matches | `540eba0619c98e5b8fed5a3e1e3c808dd7f9e511940b1271707c55d14daf987a` |
| [Legacy import candidates](../legacy-import-identities.v1.json) | 75 candidates; zero exact normalized key matches | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| [Research ledger](../research-ledger.v1.json) | 1,207 records; no injera identity record or decision | `cb176b4d3b838cee50d3e666a76c6dd0324ed78c4ffba8c5a853ddf1bae64a22` |

Adjacent active references do not collide: `ingredient-ref-teff-grain` and `ingredient-ref-teff-flour` are ingredient inputs; `ingredient-ref-pita-bread` and `ingredient-ref-lavash-bread` are separate prepared breads; `ingredient-ref-sourdough-starter` is a culture input. The active forms include a dehydrated-reactivatable form for that starter, not an injera form. None is an injera alias or a reason to create a grain or starter form here.

The ledger’s only current textual injera mention is in the accepted `ingredient-ref-awaze` source context, where injera is named as food served with the condiment. It is not an injera identity finding. A scan of `docs/catalog/proposals/*.md` found four Section G boundary reviews that repeat the open bread list and one East African preservation proposal that mentions injera in a search list / starter context. None decides an injera bread identity: [pita/lavash](wp02-section-g-pita-lavash-boundary-review-20261010.md), [tortillas](wp03-section-g-corn-wheat-tortilla-boundary-review-20261010.md), [crumbs](wp03-section-g-cracker-matzo-crumb-boundary-review-20261010.md), [wrappers](wp03-section-g-wrapper-boundaries-review-20261010.md), and [preservation boundaries](wp06-east-african-fat-souring-preservation-review-20261010.md). The separate starter discussion is excluded here.

All 114 manifest-listed recipe files and all 1,123 ingredient rows were checked across ingredient text fields for the normalized exact phrases above; **zero ingredient-line hits**. A whole-file phrase scan also found zero hits. Thus there is no recipe demand or link to change in this batch. The corpus is 752,495 raw recipe-file bytes; its ordered digest is `0aaa33d4579a21d8960f35b5b3e46dfe88f803e3afd8970d092d52ff95b2a31c` (SHA-256 over each manifest-ordered relative path, a NUL byte, and the corresponding raw file bytes).

## Recommended plan action

Under the current open Section G bread line at [plan line 1846](../../RecipeBook-global-ingredient-catalog-plan.txt), add a completed sub-item for identity-only `injera / injera`, category `BAKING_MIXIN_AND_PANTRY`, with no recipe links, forms, measurements, conversions, yields, or substitutions. Leave naan, roti, paratha, generic flatbread, rolls, sandwich bread, sourdough bread, and other regional breads open for their own reviews.

## Root integration outcome

Root added `ingredient-ref-injera` to the bundled reference catalog and recorded the eight sources under namespaced IDs `WP03-INJERA-20261011-S01` through `WP03-INJERA-20261011-S08`. The accepted row uses `injera` for both displays and `injera bread` as its only alias. No French alias, recipe link, form, measurement, conversion, yield, or substitution was added.
