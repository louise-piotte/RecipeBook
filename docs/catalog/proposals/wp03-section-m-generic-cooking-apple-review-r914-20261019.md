# WP03 Section M — generic cooking-apple distinction review (R914)

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only; no shared catalog, ledger, legacy list, recipe, plan, roadmap, workflow, or other file was changed.
- **Scope:** The generic cooking-apple class under the open Section M item. This review does not enumerate named cultivars, brands, product lines, flavours, SKUs, or retailer variants.
- **Proposal-local sources:** `WP03-SECTIONM-COOKING-APPLE-R914-20261019-S01–S05`.

## Recommendation

**Hold.** Québec sources provide the French phrase **`pomme à cuire`** and recipe examples that use it, but they do not establish a stable, generic ingredient boundary beyond the existing `apple / pomme` identity. The evidence treats cooking suitability as a culinary-use label whose meaning changes with the desired cooked texture, while Québec's produce regulation also uses `Pommes à cuire` as a limited sales designation with a different, grade-related meaning. No separate cooking-apple reference or form is proposed.

Keep `ingredient-ref-apple` as the generic FRUIT identity. Do not add cooking aliases, a second identity, or an ingredient form. A future recipe that names `pomme à cuire` can retain that source wording and link to generic apple unless a recipe-specific evidence review establishes a different, bounded ingredient need. The current bundled recipe corpus contains no apple ingredient line to justify a split or form.

The open plan item is the Section M checkbox, “Resolve apple/pear/peach cooking classes and cherry subtypes only where source and recipe evidence requires separate identities; keep generic identities separate from cultivar and state.” This review supplies Québec terminology and external recipe-use evidence for apples, but the corpus and class-boundary conditions required for a split remain unmet.

## Current-state audit

| Surface | Read-only finding |
|---|---|
| Active references | 1,939 references; SHA-256 `9daa3270665ebd5f147ce831c8aee79826e3225a4f11ac5f6447375f7b032153`. The generic apple owner is `ingredient-ref-apple`, `apple / pomme`, category `FRUIT`, with no aliases, density, or unit mappings. Apple juice and apple-cider vinegar remain separate current identities. No cooking-apple identity is active. |
| Active forms | 203 forms; SHA-256 `ba89b933894061a90456fcd8373284eaee9f0fef86a2660fbc2ed160aab30622`. No form points to `ingredient-ref-apple`. |
| Research ledger | 2,342 records. `ingredient-ref-apple` has `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its sole source is the existing OQLF `pomme` entry (`WP03-FRUIT-OPEN-20261009-S01`); its accepted decision keeps cooking-class distinctions outside the generic row and establishes no forms or numeric data. |
| Legacy identities | 55 candidates. No apple/pomme candidate remains; the exact legacy apple identity was already promoted to the active reference. |
| Bundled recipe corpus | The manifest lists 114 recipe files and 1,123 ingredient rows. A case-insensitive ingredient-row scan for whole-word `apple(s)` and `pomme(s)` found zero matches and zero links to `ingredient-ref-apple`. |
| Earlier Section M decisions | The 2026-10-09 fruit integration added only generic `apple / pomme`. The open-fruit follow-up explicitly left apple/pear/peach cooking classes for a later boundary decision because its bundled corpus had no matching lines; it proposed no forms or measures. No reviewed later proposal or integration creates a cooking-apple identity or form. |

The existing generic apple identity and its evidence remain intact. No transferability review supports merging or changing any current identity, so this proposal makes no such change. The cited cooking-apple amounts below stay scoped to their named source recipes; they are not general serving weights, unit mappings, yields, or conversion evidence.

## Québec terminology and use evidence

| Finding | Evidence and limit |
|---|---|
| OQLF confirms `pomme / apple` as the generic fruit term and discusses table and cider apples. | OQLF's preferred term is `pomme`; its note distinguishes table apples from cider apples but does not define a cooking-apple class. This supports the current generic displays and the existing decision to keep the generic row broad. [S01] |
| `pomme à cuire` is used in Québec culinary guidance. | La Pomme du Québec's current variety index offers an `À cuire` use filter and explains that its variety pages help people select apples by intended use. This confirms local culinary wording, but the categories are use facets applied to apples with differing properties; the page does not define one exclusive or measurable generic class. Individual apples may be listed under multiple uses. No names are transcribed here. [S02] |
| Cooking outcome, rather than apple identity or physical state, drives the distinction in Québec teaching material. | La Pomme du Québec's classroom worksheet asks whether there is a “pomme à cuire,” observes that any apple can be cooked, then distinguishes apples by whether they hold together, break into pieces, or become purée. Its apple-butter recipe calls for `10 pommes à cuire`; that item count belongs only to that recipe and has no mass basis. The same source therefore documents the phrase and culinary intent, while showing that it does not identify one uniform result-bearing class. [S03] |
| A Québec compote recipe uses a qualified cooking role alongside a second apple component. | The recipe `Compote de pommes rustiques` lists **1 kg (2 lb)** of sour apples for cooking and **500 g (1 lb)** of another apple component, then recommends combining a cooking apple with a crunchier apple for texture. Those masses and the resulting compote yield are specific to this recipe. Its parenthetical cultivar suggestions are not repeated here, and neither amount establishes a general apple conversion, yield, or catalog measure. [S04] |
| Québec law also uses “Pommes à cuire” as a sales designation, with a different scope. | The consolidated fresh-produce regulation permits that designation, through November 1 of a crop season, for apples in the commercial grade that meet the grade except for a specified color, maturity, bruise, or hail-mark requirement. This is a seasonal produce-grade/market designation; it does not define cooking performance or an ingredient identity. The same phrase therefore does not have one catalog-ready boundary across legal and culinary contexts. [S05] |

Together, these sources establish that `pomme à cuire` is genuine Québec wording and is used for real recipes. They do not establish an exclusive ingredient class: the term can describe a recipe role, the desired texture after cooking, a subset recommended for a particular result, or a regulated market designation. A particular recipe can use the wording meaningfully without requiring a second generic identity.

## Decision boundaries

| Candidate treatment | Recommendation |
|---|---|
| Add a generic `cooking apple / pomme à cuire` reference | **Hold.** Québec usage exists, but sources do not supply a consistent boundary distinct from the generic fruit across cooking methods and outcomes. The regulated sales designation is not equivalent to culinary suitability. |
| Add a `cooking` form to `ingredient-ref-apple` | **Do not add.** It does not identify a processed or prepared state. It encodes intended use or expected cooking behavior, which varies by recipe and target texture. |
| Add `pomme à cuire` / `cooking apple(s)` as generic aliases | **Do not add.** The wording is purpose-specific and ambiguous with the regulatory market designation; no bundled recipe currently needs it for picker matching. Preserve it verbatim in any future recipe line that uses it. |
| Add a density, measure, conversion, yield, recipe link, or substitution | **Do not add.** No bundled apple line exists. The outside recipe quantities are recipe-scoped and do not support reusable numeric data or substitutions. |
| Change or merge existing apple identities | **Do not change.** Preserve the generic apple identity and all other existing identities. No transferability evidence has been reviewed that would justify a merge. |

Reopen only if an actual recipe or picker requirement needs this distinction and source evidence establishes which culinary behavior or product boundary the label represents. Keep any later source-specific ingredient quantities attached to their exact recipe and preparation.

## Queue scope

No brand-only or commercial-product roster was pursued. Under the standing scope rule, brand-only queue lines are out of scope because commercial-product counts do not add ingredient diversity; stop pursuing those lines. This review concerns only the generic apple class and does not modify existing branded identities or product-scoped evidence.

## Source register

Sources checked 2026-10-19. These proposal-local IDs are not shared-ledger entries.

| ID | Source | Support and limitation |
|---|---|---|
| **WP03-SECTIONM-COOKING-APPLE-R914-20261019-S01** | Office québécois de la langue française, [*pomme* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297106/pomme). | Preferred Québec French term `pomme`, English `apple`, fruit domain, and table/cider distinction. Updated 2010; no cooking-apple category is defined. |
| **WP03-SECTIONM-COOKING-APPLE-R914-20261019-S02** | La Pomme du Québec, [*Variétés*](https://lapommeduquebec.ca/varietes/). | Current Québec culinary-use filters include `À cuire`; the page guides variety selection by intended use. It is usage guidance, not a standard, and does not define an exclusive cooking-apple identity. |
| **WP03-SECTIONM-COOKING-APPLE-R914-20261019-S03** | La Pomme du Québec, [*Ateliers pédagogiques — Premier cycle* (PDF)](https://lapommeduquebec.ca/wp-content/uploads/2019/07/fppq-ateliers-cycle1-final.pdf). | Uses `pomme à cuire` in an educational recipe and explains that cooking behavior varies. The recipe's count is source-specific and has no stated mass. The resource is culinary education, not a regulatory or catalog standard. |
| **WP03-SECTIONM-COOKING-APPLE-R914-20261019-S04** | La Pomme du Québec, [*Compote de pommes rustiques*](https://lapommeduquebec.ca/recette/compote-pommes-rustiques/). | Uses the phrase for an acidic cooking role, combines it with another apple component for texture, and states exact recipe-specific quantities. It supports recipe use only, not a general class, yield, conversion, or measure. |
| **WP03-SECTIONM-COOKING-APPLE-R914-20261019-S05** | Gouvernement du Québec, [*Règlement sur les fruits et légumes frais*, RLRQ c P-29, r 3](https://www.legisquebec.gouv.qc.ca/fr/document/rc/p-29%2C%20r.%203), art. 29. | Uses `Pommes à cuire` as a seasonal sales designation for qualifying commercial-grade apples subject to listed grade exceptions. It does not define a culinary performance class. |

## Proposal-only outcome

Keep the cooking-apple checklist item open as a hold. Retain `ingredient-ref-apple` unchanged, leave forms absent, and make no change to the ledger, legacy identities, recipe corpus, plan, roadmap, workflow, or shared data. No tests were run; this is a documentation-only review.


## Root integration decision

Accepted as a hold. `ingredient-ref-apple` and its evidence remain unchanged; no cooking alias, form, identity, measure, or recipe link was added. The cooking-apple checklist item remains a hold within the still-open Section M parent. No brand-only work was pursued; commercial-product counts do not add ingredient diversity. See the [R913–R916 integration README](../batches/wp03-r913-r916-generic-boundary-integration-20261019/README.md).
