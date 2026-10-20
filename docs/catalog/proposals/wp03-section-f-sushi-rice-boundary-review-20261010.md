# WP03 Section F Sushi Rice Boundary Review

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** proposal only. No canonical catalog, forms, ledger, legacy, recipe, plan, roadmap, or test file was changed.
- **Scope:** a source refresh and narrow boundary review for the existing unresolved `sushi rice / riz à sushi` candidate, especially its relationship to the integrated short-grain rice class. This packet does not repeat the broader Section F audit or propose another grain identity.
- **Disposition:** retain `ingredient-ref-sushi-rice` as a ledger-only candidate with `identityState: needs_clarification`. Do not add an active identity or alias. Current evidence does not establish one ingredient scope and one stable Québec French name for the phrase.

## Current package and candidate audit

The current split package contains **796 active ingredient references** and **36 ingredient forms**. The research ledger contains **1,022 records**; the legacy-import file has **81 candidates**. The manifest lists **114 recipes** with **1,123 ingredient rows**.

The live rice references relevant to this boundary are:

| Active reference | Current English / fr-CA display | Boundary relevant here |
| --- | --- | --- |
| `ingredient-ref-rice` | `rice / riz` | The generic identity owns dry and cooked forms. Those forms describe preparation state only. |
| `ingredient-ref-white-rice` | `white rice / riz blanchi` | A separate milling identity with dry and cooked forms; it does not describe sushi seasoning or a grain-length class. |
| `ingredient-ref-medium-grain-rice` | `medium-grain rice / riz à grain moyen` | Grain-length class; French alias `riz à grains moyens`. |
| `ingredient-ref-short-grain-rice` | `short-grain rice / riz à grain court` | Grain-length class; French alias `riz à grains courts`. |
| `ingredient-ref-calrose-rice` | `calrose rice / riz Calrose` | Named market type; no sushi alias. |
| `ingredient-ref-glutinous-rice` | `glutinous rice / riz gluant` | Separate rice identity; no sushi or sticky-rice alias. |

None of the 36 active forms belongs to a sushi-rice identity. The four rice state forms are the dry/cooked forms of generic rice and white rice only. No sushi-specific identity or form is active.

The ledger already contains one matching record, `ingredient-ref-sushi-rice`: `recordType: candidate`, `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its existing unresolved decision cites `WP03-S73`, `WP03-S134`, `WP03-S135`, `WP03-S136`, `WP03-S42`, `WP03-S43`, and `WP03-S45`. There is no sushi-rice reference/form in the live package and no matching legacy candidate among the 81. A normalized exact-key check found no active display, alias, form label, or form match term for `sushi rice`, `riz à sushi`, or `riz sushi`. The exact short-grain terms continue to resolve to the existing `ingredient-ref-short-grain-rice` row.

## Candidate boundaries and dispositions

| Term or product scope | Disposition | Reason and limit |
| --- | --- | --- |
| Generic `sushi rice / riz à sushi` | **Hold unresolved; no active row or aliases** | The term is used for dry rice marketed for sushi and for a cooked, seasoned preparation. Dry retail examples also differ in grain class. The phrase does not establish one stable catalog identity. |
| Dry rice marketed for sushi | **Do not map to short-grain rice, medium-grain rice, or Calrose as a class-wide rule** | Dainty’s Québec listing identifies its dry sushi-marketed rice as medium-grain Calrose. RiceSelect identifies its own dry Sushi Rice product as short-grain Koshihikari and Calihikari. These manufacturer examples establish product-specific scopes, not one universal grain class. |
| `short-grain rice / riz à grain court` | **Keep existing identity and French alias unchanged** | OQLF defines this grain-length class and lists `riz à grain court`, `riz à grains courts`, `riz à grain rond`, and `riz à grains ronds` as preferred French terms. A product’s sushi use does not make the whole class synonymous with sushi rice. |
| `Calrose / riz Calrose` | **Keep as its existing named market type; do not add sushi wording as an alias** | Dainty uses `riz à sushi` for one medium-grain Calrose product. University of California research and the California Rice Commission identify Calrose as medium-grain. This does not show that all sushi rice is Calrose. RICARDO’s occasional `riz à sushi` association is source-specific; its short-grain classification conflicts with the technical source and is not adopted. |
| Cooked, seasoned sushi rice | **Do not encode as the dry-grain identity or as a generic `cooked rice` alias** | Toronto Public Health describes sushi rice as ready-to-eat cooked rice usually mixed with sugar, salt, and rice vinegar. OQLF’s sushi entry defines the prepared dish, not a dry ingredient. The seasoning/preparation distinction remains explicit. |
| `sticky rice / riz collant`, glutinous rice, and other rice styles | **Keep separate under existing reviews** | Retail wording can use sticky-rice language for short-grain products, while glutinous rice is separately catalogued. This review adds no equivalence among these labels. |

## Québec French naming limit

The OQLF entry reviewed here is for *sushi*: it defines a Japanese prepared dish made with vinegared rice and possible fillings. It does not give a preferred Québec French name for a dry grain sold for sushi. The separate OQLF short-grain entry gives a direct English/French pair and preferred French variants for the grain-length class.

Dainty’s current Québec product page uses `riz à sushi` for one dry, medium-grain Calrose product. That is direct Canadian French retail wording for that product, not evidence that `riz à sushi` is a universal synonym for short-grain rice, Calrose, or cooked seasoned rice. RiceSelect’s English product page does not establish a Québec French equivalent. RICARDO’s French use of `riz à sushi` for Calrose confirms culinary usage exists, but does not resolve the product class or make the wording an alias.

Therefore, do not assign `riz à sushi` as an active fr-CA display or alias yet. Keep `riz à grain court` and its existing preferred variant attached only to `short-grain rice`; do not add `sushi rice`, `sushi`, `sticky rice`, `riz collant`, or `riz à sushi` to that row or to Calrose.

## Bundled recipe demand

I scanned all 114 manifest-listed recipe files and all 1,123 ingredient rows in the current package. Case-folded searches found **zero whole-file hits and zero ingredient-row hits** for `sushi`, `riz à sushi`, `riz sushi`, `short-grain rice`, `short grain rice`, `riz à grain court`, `riz à grains courts`, `Calrose`, `glutinous rice`, `riz gluant`, `medium-grain rice`, and `riz à grain moyen`. No recipe link, amount, or sushi-specific form is supported.

The current rice-bearing lines do not imply sushi demand: recipe 040 requests crispy rice cereal; recipe 066 now links `Cooked white rice, for serving` to white rice’s cooked form; recipes 086, 090, and 093 use generic cooked rice. They remain unchanged by this review.

## Keep identity, grain class, state, quantities, and substitutions separate

| Concern | Recommendation |
| --- | --- |
| **Ingredient identity** | Keep generic sushi rice unresolved in the ledger. Do not create an active `ingredient-ref-sushi-rice` row. Dry retail use wording spans products assigned to different grain classes; prepared seasoned rice is a preparation description. |
| **Grain class / product form** | Keep short-, medium-grain, and Calrose identities distinct. “For sushi” is a use label and does not define a universal grain length, cultivar, or processing class. Do not use `sushi rice` as an alias for short-grain rice. |
| **Preparation forms** | Add no sushi-specific dry, cooked, or seasoned form. Existing generic-rice and white-rice dry/cooked forms do not encode sushi preparation or seasoning. Revisit only with a recipe or catalog need that identifies the intended product and state. |
| **Measurements** | Add no density, serving measure, or unit mapping. Dainty’s 1:1.5 rice-to-water instruction is product-specific; it is not a general sushi-rice measure. |
| **Conversions and yields** | Add no mass-volume conversion, dry-to-cooked yield, water-absorption ratio, or cooking conversion. RiceSelect’s one-cup rice/one-and-a-half-cups water directions and separate vinegar/sugar/salt amounts are that product’s instructions, not a catalog-wide conversion. |
| **Substitutions** | Add no global or contextual substitution rule. Manufacturer use recommendations do not establish interchangeable recipe performance or a general substitution ratio. Keep substitution research `not_yet_researched`. |

## Source register

The source IDs below are local to this proposal and do not add records to the shared research ledger. Existing ledger source IDs are noted in parentheses.

| Source ID | Source and URL | Supports and limits |
| --- | --- | --- |
| `WP03-SUSHI-BND-20261010-S01` (`WP03-S73`) | OQLF, [sushi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359752/sushi) | Defines sushi as a prepared Japanese dish made with vinegared rice and possible fillings. It does not define a dry sushi-rice grain class or a preferred term for dry rice marketed for sushi. |
| `WP03-SUSHI-BND-20261010-S02` (`WP03-S110`) | OQLF, [riz à grain court](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354929/riz-a-grain-court) | Directly pairs `short-grain rice / riz à grain court`, defines the grain class, and lists three preferred French variants. It does not make sushi use an alias or set a universal numeric cutoff. |
| `WP03-SUSHI-BND-20261010-S03` (`WP03-S135`) | Dainty, [Le meilleur riz à sushi pour les recettes japonaises](https://dainty.ca/fr/produits/riz-sushi-calrose/) | Current Québec French product page identifies Dainty’s sushi-marketed dry product as medium-grain Calrose and gives a 1:1.5 rice-to-water instruction. Supports this named product only; neither the grain class nor ratio is generalized. |
| `WP03-SUSHI-BND-20261010-S04` (`WP03-S136`) | RiceSelect, [RiceSelect Sushi Rice](https://www.riceselect.com/products/riceselect-sushi-rice) | Manufacturer identifies its dry product as short-grain and names Koshihikari and Calihikari; its directions cook the grain and then fold in a vinegar/sugar/salt dressing. Supports one product’s grain class and preparation, not a universal definition. |
| `WP03-SUSHI-BND-20261010-S05` (`WP03-S134`) | Toronto Public Health, [Specific Food Processes](https://www.toronto.ca/community-people/health-wellness-care/food-safety/food-safety-for-businesses/food-safety-resources/specialty-foods/) | Defines sushi rice in a food-process context as a ready-to-eat preparation commonly made from cooked rice mixed with sugar, salt, and rice vinegar. Supports a prepared-food boundary, not a grain identity. |
| `WP03-SUSHI-BND-20261010-S06` (`WP03-S44`) | University of California Agriculture and Natural Resources, [The California Rice Varieties: From the Rice Experiment Station](https://rice.ucanr.edu/files/217622.pdf) | Identifies Calrose as a medium-grain market type. Supports keeping Calrose distinct from the short-grain class and from a generic sushi-use phrase. |
| `WP03-SUSHI-BND-20261010-S07` (`WP03-S43`) | RICARDO, [Le petit lexique des variétés de riz](https://www.ricardocuisine.com/chroniques/l-ingredient/1680-le-petit-lexique-des-varietes-de-riz) | Uses `riz à sushi` as an occasional Calrose name and calls Calrose short-grain. This is Québec culinary usage, not a technical classification; it conflicts with the medium-grain technical and manufacturer sources and is not adopted as an alias or class definition. |
| `WP03-SUSHI-BND-20261010-S08` (`WP03-S45`) | California Rice Commission, [Food](https://www.calrice.org/food) | Describes Calrose as medium-grain and lists sushi as one use. Use context does not establish that sushi rice is a single grain type. |

## Review disposition

Retain the existing unresolved ledger candidate and its current `needs_clarification` state. Do not add an active identity, aliases, forms, recipe links, measurements, conversions, yields, or substitutions. A later review should require a clearly bounded dry product scope and Québec French naming evidence before allocating `sushi rice / riz à sushi` to any catalog row.
