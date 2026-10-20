# WP04 Section P — burbot / lotte identity review

- **Review date:** 2026-10-12.
- **Packet type:** proposal-only Canadian/Québec identity, ownership, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** propose one species-scoped, identity-only PROTEIN reference for burbot / lotte (*Lota lota*). Use only the English display burbot and the Québec French display lotte. Add no aliases, form, recipe link, default measure, density, unit mapping, conversion, yield, or substitution.
- **Scope:** this review changes only this proposal file. No catalog/database JSON, ledger, recipe, plan, roadmap, generated file, or test was changed. No tests or emulator checks apply.

## Bounded identity decision

| Candidate ID | Category | English display | fr-CA display | English aliases | French aliases | Taxon |
|---|---|---|---|---|---|---|
| ingredient-ref-burbot | PROTEIN | burbot | lotte | None | None | *Lota lota* |

The CFIA Fish List pairs Burbot and Lotte with *Lota lota*. OQLF’s Québec entry places lotte in both ichthyology and edible-fish terminology, gives burbot as the English equivalent, and records *Lota lota*. The current Québec species profile also pairs Lotte and Burbot with that taxon. These sources support the bilingual identity pair, not a broader cod-family ingredient or a recipe substitution.

Keep this freshwater species separate from Atlantic cod (*Gadus morhua*), Pacific cod (*G. macrocephalus*), Alaska pollock (*Gadus chalcogrammus*), Atlantic tomcod (*Microgadus tomcod*), Pacific tomcod (*M. proximus*), and marine monkfish/baudroie (*Lophius* spp.). OQLF notes that lotte is often used for baudroie in France; its Québec entry instead identifies lotte as *L. lota*. The separate monkfish review treats an older DFO use of lotte for monkfish tail as historical market wording, not a Québec catalog alias. Do not infer a species from a foreign-language recipe that gives only lotte without an applicable Canadian/Québec context.

Do not add these other reported names as aliases:

- **loche:** OQLF says this term was not retained by the fish-product terminology committee. It also appears parenthetically in Health Canada’s older nutrient table, which does not establish a Québec product alias.
- **Fresh Water Cod:** the CFIA Fish List reports this English name for *L. lota*, but a cod-qualified alias risks collapsing it into the active Atlantic cod, Pacific cod, and salt-cod results.
- **ling, eelpout, maria, and lawyer:** federal sources list these as burbot-associated names or synonyms, but they are broad and do not improve a Québec display. The current picker also returns unrelated substring matches for ling and maria.
- **Lota lota:** retain the scientific name as evidence, not as a consumer search alias.

## Prior-work and checklist fit

The live Section P checklist keeps regional finfish open. Its recent fish reviews and integration notes mention burbot only to distinguish it from Atlantic tomcod or monkfish; none makes a standalone burbot identity decision. The monkfish hold specifically keeps Québec freshwater burbot/lotte separate from the historical monkfish wording. This proposal addresses that distinct species identity and does not reopen the monkfish hold, the integrated cod/pollock/tomcod rows, or any shellfish boundary.

Repository searches across current Section P proposals, batch notes, active references, forms, legacy candidates, and the ledger found no prior burbot identity integration or separate burbot proposal. The existing notes naming burbot as a boundary are linked here for context: [Atlantic tomcod review](wp04-section-p-atlantic-tomcod-identity-review-20261012.md) and [monkfish picker hold](wp04-section-p-monkfish-baudroie-picker-boundary-review-20261012.md).

## Exact ownership and live snapshot

The ownership audit used the current catalog search normalization: lowercase, Unicode NFKD, fold œ/æ/ß and ampersand, remove combining marks, and normalize punctuation and whitespace. It compared complete normalized phrases in active reference names/aliases, form labels/match terms, legacy candidate names/aliases, and ledger record IDs.

| Candidate key | Active reference owner | Active form owner | Legacy candidate owner | Ledger record owner |
|---|---|---|---|---|
| burbot | None | None | None | None |
| lotte | None | None | None | None |
| Lota lota | None | None | None | None |
| loche | None | None | None | None |
| Fresh Water Cod / freshwater cod | None | None | None | None |
| ling, eelpout, maria, lawyer | None | None | None | None |
| ingredient-ref-burbot / candidate-wp04-burbot-identity | Neither ID exists | Neither ID exists | Neither ID exists | Neither ID exists |

The nearest active fish references remain distinct: ingredient-ref-atlantic-cod, ingredient-ref-pacific-cod, ingredient-ref-alaska-pollock, ingredient-ref-atlantic-tomcod, ingredient-ref-salt-cod, ingredient-ref-stockfish, and ingredient-ref-american-eel. None owns the proposed English/French display or *L. lota*. The active monkfish candidate remains held and has no reference row.

This snapshot was read from the live worktree on 2026-10-12. Hashes cover exact file bytes. The recipe digest processes paths in manifest order and hashes each relative path, a NUL byte, exact recipe bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| ingredient-references.v1.json | 1,266 references | 44c8f14808fc3da227cb7218359b80c0e4276ec724ede2f1852d8e7b84f4b60f |
| ingredient-forms.v1.json | 94 forms | 55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b |
| legacy-import-identities.v1.json | 65 candidates | 7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7 |
| research-ledger.v1.json | 1,574 records; 5,539 source entries; 4,575 distinct source IDs | c11f1209cb768adf3a191bfa645d657087f61fe38e42a8f35feffdd2f6d2500e |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

This is the live-worktree snapshot captured while the proposal was drafted. Later same-day catalog
integrations are reflected in the post-integration snapshot in the batch README.

The five proposal-local source IDs below were absent from both the live ledger and existing proposal/batch Markdown when checked. They are proposal references only, not ledger additions.

## Picker-query behavior

IngredientSearch normalizes accents and punctuation, first returns references with a complete query phrase in a display name, alias, or attached form term, and uses substring matching only when there are no complete-phrase results.

- Before a proposed row, searches for burbot, lotte, *Lota lota*, and loche return no active fish identity.
- With the proposed display pair, burbot and lotte each find this one species row. In the fr-CA catalog, lotte is the OQLF-supported Québec name. It is not stored as a second alias.
- Do not add Fresh Water Cod: the active cod query already returns Atlantic cod, Pacific cod, black cod on sablefish, and salt cod. The new identity should not become a cod synonym.
- Do not add ling or maria: current substring fallback for ling also finds unrelated names such as lingonberry, pickling onion, poppy seed filling, and sparkling water; maria falls into Cucumaria. Eelpout and lawyer are not needed for Québec search.
- Loche remains excluded from the row even though it is in older Health Canada wording; OQLF says it was not retained for fish-product terminology.

The OQLF note about usage in France and the historical DFO monkfish wording remain limits on interpreting imported recipe text. They do not change OQLF’s Québec fish identity, and they do not authorize linking a foreign recipe’s bare lotte to this row.

## Full bundled-recipe audit

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for burbot, lotte, *Lota lota*, loche, Fresh Water Cod/freshwater cod, ling, eelpout, maria, lawyer, monkfish, baudroie, and related cod terms. The audit checked ingredient names, original ingredient text, reference/form identifiers, nested recipe strings, and complete parsed recipe content using normalized whole-word phrases.

**Result: zero candidate phrase hits in ingredient rows and zero matching recipe files.** Recipe 093, Fried Rice / Riz frit, has one broad placeholder, row 4: “Cooked meat or seafood, to taste,” with no ingredient reference. It permits an unspecified leftover; it does not select burbot, give an amount, or support a link. Other current fish rows—crab meat in recipe 019, calamari in 023, salmon fillets in 077, and tuna steak in 111—are separate ingredients and provide no burbot demand.

No recipe link, relink, form, or recipe-derived measurement is proposed.

## Measurements and numeric limits

Health Canada’s 2008 *Nutrient Value of Some Common Foods* table lists **Burbot (loche), raw — 90 g**. This is a source-specific dietary serving/edible-portion entry, not a recipe quantity, piece or fillet weight, count mapping, density, or cooking-yield factor. If this identity is later integrated, the 90 g statement may be preserved as a source-specific ledger observation only; do not activate it as a default measure.

The current Québec wildlife profile gives observed species weights of roughly 0.5–1.5 kg. Those are biological observations, not sold package weights or usable kitchen measures.

- **Aliases:** none beyond the bilingual display pair.
- **Forms:** none. The identity does not specify whole, filleted, fresh, frozen, cooked, or preserved product state.
- **Default density:** none; leave null.
- **Unit mappings:** none; leave empty.
- **Conversions and yields:** none. No count-to-weight, volume-to-mass, edible-yield, raw/cooked, or preservation conversion is supported.
- **Substitutions:** none. Do not map burbot to cod, eel, monkfish, tomcod, or another finfish; family membership and general culinary similarity do not supply a recipe-scoped rule.
- **Recipe links:** none; the corpus has no specific demand.

## Recommended integration delta

1. Add ingredient-ref-burbot in PROTEIN with English display burbot, fr-CA display lotte, and no aliases.
2. Add a verified identity record keyed by ingredient-ref-burbot. Attach the name/taxon sources below. If retaining the Health Canada 90 g value, keep it as a source-specific food-serving observation with the raw/edible-portion basis; do not activate a default measure.
3. Keep defaultDensity null, unitMappings empty, and forms, recipe links, conversions, yields, and substitutions absent.
4. Keep monkfish/baudroie, Atlantic and Pacific cod, Alaska pollock, Atlantic and Pacific tomcod, salt cod, stockfish, and American eel identities unchanged.

## Sources

Sources were accessed or rechecked on 2026-10-12. Biological size and food-composition serving evidence below do not establish recipe quantities or substitution rules.

| Source ID | Primary source | Evidence and limits |
|---|---|---|
| WP04-SECTIONP-BURBOT-IDENTITY-20261012-S01 | Canadian Food Inspection Agency, [Fish List search for Burbot](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Burbot) | Lists Burbot / Lotte for *Lota lota*. It also lists other names for the species, including Eelpout, Ling, Fresh Water Cod, and Maria; these entries are evidence of naming scope, not an instruction to store every name as an alias. The Fish List’s accepted-name purpose is described in the [CFIA labelling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). |
| WP04-SECTIONP-BURBOT-IDENTITY-20261012-S02 | Office québécois de la langue française, [lotte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198860/lotte) | Places the term in zoology/ichthyology and edible-fish terminology, gives English burbot and *Lota lota*, and identifies lotte as the preferred term. It says loche was not retained by the fish-product terminology committee and notes the French-of-France usage of lotte for baudroie. |
| WP04-SECTIONP-BURBOT-IDENTITY-20261012-S03 | Gouvernement du Québec, [Lotte](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/lotte), updated 2026-10-02 | Pairs Lotte / Burbot with *L. lota*, describes it as a Québec freshwater fish, and says its flesh is appreciated. Its observed length/weight and fishery facts are species-profile information, not package measures or recipe conversions. |
| WP04-SECTIONP-BURBOT-IDENTITY-20261012-S04 | Health Canada, [Nutrient Value of Some Common Foods: fish and shellfish](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-8-fish-shellfish-nutrient-value-some-common-foods-2008.html) | Lists Burbot (loche), raw at 90 g. Preserve only as the source’s food-serving observation; this does not define a household measure, portion for a specific recipe, active unit mapping, density, or yield. |
| WP04-SECTIONP-BURBOT-IDENTITY-20261012-S05 | Government of Canada, [Freshwater Fish Marketing Act, Schedule](https://laws-lois.justice.gc.ca/eng/acts/F-13/section-sched231154.html) | Identifies Burbot (*Lota lota*) and gives ling, maria, eelpout, and lawyer among listed synonyms. This is federal fish-marketing legislation; its synonym list does not establish Québec consumer aliases or culinary interchangeability. |

Related prior-review context, not reissued as new evidence IDs: the [Atlantic tomcod identity review](wp04-section-p-atlantic-tomcod-identity-review-20261012.md) and [monkfish / baudroie picker-boundary review](wp04-section-p-monkfish-baudroie-picker-boundary-review-20261012.md) keep *L. lota* distinct from those finfish.
