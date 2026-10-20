# WP04 Section P — Goldeye / laquaiche aux yeux d’or identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** regional fish identity, Canadian and Québec name ownership, Manitoba market scope, picker behavior, recipe demand, and product/measurement boundary.
- **Recommendation (now integrated):** add an identity-only `PROTEIN` reference for *Hiodon alosoides*, displayed as **goldeye / laquaiche aux yeux d’or**, with `Winnipeg goldeye` as the only English alias. Keep `Lake Winnipeg Goldeye` and smoked-product wording out of the row. Add no form, recipe link, measurement, conversion, yield, or substitution.
- **Scope:** this snapshot refresh changes this proposal only. Root separately integrated the accepted reference and ledger record; this refresh does not change the active catalog, ledger, legacy identities, plan, roadmap, recipes, generated index, or application code.

## Candidate and source boundary

Section P remains open for species-specific and regional fish identities. After the round6 inconnu integration, round7 selected goldeye, *Hiodon alosoides*. Before this review, it had no active catalog row, form, legacy candidate, ledger identity record, or earlier WP04 hold. Root has since integrated the accepted identity as `ingredient-ref-goldeye` in the active references and ledger; current ownership is recorded below. The CFIA Fish List assigns **Goldeye / Laquaiche aux yeux d’or** and **Winnipeg Goldeye** to *H. alosoides*. The OQLF GDT independently pairs **laquaiche aux yeux d’or** with English **goldeye** and the same binomial.

| Candidate ID | Category | English display | fr-CA display | Aliases | Species |
|---|---|---|---|---|---|
| `ingredient-ref-goldeye` | `PROTEIN` | `goldeye` | `laquaiche aux yeux d’or` | EN: `Winnipeg goldeye`; FR: none | *Hiodon alosoides* |

Keep `Winnipeg goldeye` as the only alias because CFIA lists it for this species. Do not add `Lake Winnipeg Goldeye`: the Manitoba fish fact sheet uses that phrase for a smoked delicacy, so it crosses the species/product-state boundary. Do not add `smoked goldeye` as an alias or form. Manitoba retailer Smith’s Fish Ltd. currently lists smoked goldeye as one local product, but this source does not establish a universal smoked-fish form or a whole-fish specification.

The market evidence is regional and specific. Manitoba identifies goldeye among the freshwater species targeted by commercial net fishers. Smith’s Fish Ltd., a Gimli retailer that says it fishes commercially on Lake Winnipeg and processes its catch on site, lists **Smoked Goldeye** for sale. These sources support a Manitoba food-fish identity and one current local processed product; they do not establish broad Canadian retail availability, general fresh/un-smoked availability, or a standardized product presentation.

Keep the row scoped to *H. alosoides*. CFIA assigns **Mooneye / Laquaiche argentée** to the separate species *Hiodon tergisus*, and Manitoba’s fish fact sheet says the two look similar. Do not merge mooneye or infer culinary equivalence from the shared genus.

## Prior-work check and current ownership snapshot

At original review time, the current global catalog plan, WP04 Section P proposal and batch archive, active references/forms, legacy candidates, and ledger were checked for `goldeye`, `Winnipeg goldeye`, `laquaiche aux yeux d’or`, *Hiodon alosoides*, candidate IDs, and mooneye boundary terms. No earlier goldeye allocation, focused proposal, or hold was found. Root has since accepted and integrated this identity; the live catalog and ledger now own it as `ingredient-ref-goldeye`. The round6 inconnu identity is integrated as *Stenodus leucichthys* and remains separate. The lake-whitefish review names cisco as another distinct species; it does not merge cisco with goldeye.

The ownership audit followed `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase, NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, normalize punctuation, and collapse spaces. Exact normalized field ownership and picker phrase behavior were checked separately.

| Live artifact | Current count and exact byte size | Exact-byte SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,317 references; 421,694 bytes | `6427dd4cf5c2f5e94292b843255aec2b2cfe3517af1f3ef9aa99f407663c464f` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,625 records; 5,963 source entries; 4,980 distinct source IDs; 5,914,722 bytes | `4b06543735ef656679d3025939b535eb918d965a0190b67daddd412c4b7170bd` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The normalized display and alias keys `goldeye`, `Winnipeg goldeye`, and `laquaiche aux yeux d’or` resolve to the active reference `ingredient-ref-goldeye`; that same ID is its verified identity ledger record. The binomial *Hiodon alosoides* appears in the ledger’s source evidence, but the catalog schema has no taxonomic-name field. `Lake Winnipeg Goldeye`, `smoked goldeye`, and `candidate-goldeye` remain unowned as active reference/form or legacy identity keys. The exact comparator keys `mooneye`, `laquaiche argentée`, and *Hiodon tergisus* likewise have no active reference, form, legacy candidate, or same-key ledger record. No candidate-specific form, unit mapping, conversion, yield, substitution, or unit-conversion ledger entry exists. The accepted identity ledger record has seven source entries; their source-ID uniqueness is checked below.

## Picker projection and alias decision

The live projection follows the phrase-first behavior in `IngredientReferenceSearchIndex`, using the current reference and form search terms. A complete normalized phrase match is returned before substring fallback.

| Query | Current picker after integration | Decision |
|---|---|---|---|
| `goldeye` | `ingredient-ref-goldeye` | CFIA- and OQLF-backed species name. |
| `laquaiche aux yeux d’or` | `ingredient-ref-goldeye` | OQLF’s species-specific Québec French term. |
| `Winnipeg goldeye` | `ingredient-ref-goldeye` | CFIA lists this common name for *H. alosoides*. |
| `smoked goldeye` | None | Keep the locally listed processed product state separate; no smoked form is proposed. |
| `Lake Winnipeg Goldeye` | None | Keep the Manitoba source’s smoked-specialty wording out of the global species aliases. |
| `mooneye`, `laquaiche argentée`, *Hiodon tergisus* | None | Separate species and name boundary. |

No active form contains the candidate’s name or alias. The unqualified `fish` and `seafood` recipe wording is not treated as a goldeye request.

## Full bundled-recipe demand

The current manifest-ordered corpus contains **114 recipe files and 1,123 ingredient rows**. I scanned every listed file and ingredient row for `goldeye`, the CFIA/OQLF names, the candidate taxon and IDs, smoked and Lake Winnipeg product wording, and the mooneye comparators. There were zero candidate-term hits in recipe rows and zero hits in recipe-file text. The corpus digest, hashing each manifest path, a NUL byte, its exact file bytes, and a NUL byte, is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

Nearby fish demand remains distinct: recipe 077 row 10 asks for salmon fillets; recipe 111 row 1 asks for one tuna steak; recipes 093 row 6 and 095 row 5 ask for fish sauce, a condiment; recipe 093 row 4 allows generic cooked meat or seafood “to taste.” None identifies goldeye, smoked goldeye, a serving quantity, or a substitution.

## Product form, measures, and substitutions

No candidate-specific active form, measure, density, unit mapping, conversion, yield, recipe link, or substitution applies. The live global and contextual substitution-rule files contain no rules. The accepted ledger record contains the identity evidence and no candidate-keyed unit conversion.

DFO reports biological average size of approximately 30.5 cm and 450 g. Those species observations do not specify edible yield, portion mass, serving size, package amount, or kitchen conversion. Smith’s listing gives a price per pound for one smoked retail product; its price basis is not a package quantity or recipe measure. A targeted CNF species/portion lookup was not completed, so this review makes no claim about whether CNF contains a matching entry and proposes no CNF measure.

Do not activate a `smoked` form from one local listing or infer a substitute from mooneye, whitefish, cisco, or other freshwater fish. No bundled recipe supplies a method- and quantity-backed substitute. Keep forms, numeric behavior, recipe links, yields, and substitution data absent.

## Recommendation

Round7 recommended one species-scoped identity-only **Goldeye / laquaiche aux yeux d’or** reference for *Hiodon alosoides*, with `Winnipeg goldeye` as the only English alias; that recommendation is now accepted and integrated. Retain the separation from mooneye and keep local smoked-product wording out of the species alias set. The current retailer listing supports only a local smoked product; it does not establish broad Canadian supply, a generic smoked form, or a recipe use. The integration adds no measures, forms, recipe links, conversions, yields, or substitutions. Section P remains open.

## Sources

Sources were checked on 2026-10-12. The seven round7 source IDs below are now attached to the accepted `ingredient-ref-goldeye` ledger record. Each appears exactly once among the ledger’s 5,963 source entries, all under that record, with no collision in another ledger record; the proposal repeats them for traceability.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-P-GOLDEYE-SCOPE-20261012-R7-S01` | CFIA, [Fish List search results for goldeye](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Goldeye) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Search result ties `Winnipeg Goldeye` and `Goldeye / Laquaiche Aux Yeux D’or` to *Hiodon alosoides*, and separately ties `Mooneye / Laquaiche Argentée` to *H. tergisus*. Fish List result last modified 2023-09-18. It rendered in official browser search output; direct opening of the legacy query endpoint was unavailable. The list is fish-label nomenclature, not a retail inventory or product-state guide. |
| `WP04-P-GOLDEYE-SCOPE-20261012-R7-S02` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Says the Fish List collects English and French common names recognized by legislation or generally known, and identifies names for labelling fish sold or processed in Canada. It does not establish product availability or recipe use. |
| `WP04-P-GOLDEYE-SCOPE-20261012-R7-S03` | OQLF, [GDT: laquaiche aux yeux d’or](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488839/laquaiche-aux-yeux-dor) | Pairs French `laquaiche aux yeux d’or` with English `goldeye` and Latin *Hiodon alosoides*. The entry is zoology/ichthyology terminology (dated 1983), not retail or recipe evidence; it rendered in search output, while direct opening returned a cache miss. |
| `WP04-P-GOLDEYE-SCOPE-20261012-R7-S04` | Fisheries and Oceans Canada, [Goldeye profile (English)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/goldeye-laquaiche-yeux-or-eng.html) and [Laquaiche aux yeux d’or profile (French)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/goldeye-laquaiche-yeux-or-fra.html) | Gives *H. alosoides* and a Canadian freshwater range from northwestern Ontario to the Rocky Mountains, including the Great Slave Lake area. The English profile was last modified 2016-12-19; its average size figures are biological observations only, not food portions or measures. It does not establish current consumer sales. |
| `WP04-P-GOLDEYE-SCOPE-20261012-R7-S05` | Province of Manitoba, [Fish industry and commercial net fishing](https://www.gov.mb.ca/agriculture/protein/protein-sources/raw-comm/fish.html) | Lists goldeye among freshwater species targeted by Manitoba commercial net fishers and describes the province’s fish buying, selling, and processing pathway. The page does not give goldeye-specific current landings or retailer distribution. |
| `WP04-P-GOLDEYE-SCOPE-20261012-R7-S06` | Province of Manitoba, [Biology of Manitoba Fish Species (PDF)](https://www.gov.mb.ca/nrnd/fish-wildlife/fish/images/biology_of_mb_fish.pdf) | Identifies goldeye as *H. alosoides*, distinguishes mooneye (*H. tergisus*), and calls smoked goldeye a Lake Winnipeg regional delicacy. This is regional product context, not a standardized smoked-fish form or current supply record. |
| `WP04-P-GOLDEYE-SCOPE-20261012-R7-S07` | Smith’s Fish Ltd., [current product listing](https://www.smithsfish.com/) and [price list](https://www.smithsfish.com/about) | The Gimli seller lists `Smoked Goldeye` for sale and says its products are harvested from Lake Winnipeg waters and processed on site. The one-retailer listing supports a local processed fish product only; its price per pound does not specify package size, serving, or a recipe measure. |

No app tests or emulator checks were run because the accepted change only adds database JSON data and regenerates its search index. Static checks covered exact normalized ownership, all seven source IDs against the live ledger and proposal/batch files, picker projection using the current search implementation, all 114 manifest-listed recipes / 1,123 ingredient rows and the corpus digest, current forms and substitution files, exact-byte counts and hashes, and UTF-8 source-file safety. The snapshot refresh itself did not edit shared data or checklist.


## Integration record

Root integrated `ingredient-ref-goldeye` as identity-only `goldeye / laquaiche aux yeux d’or` in
`PROTEIN`, with `Winnipeg goldeye` as the sole English alias. Seven source entries and one accepted
identity decision were added to the ledger. Measurement and substitution research remain
`not_yet_researched`; no forms, observations, density, mappings, conversions, yields, recipe links, or
active rules were added.

The current package contains 1,317 ingredient references and the ledger has 1,625 records, 5,963
source entries, and 4,980 distinct source IDs. The manifest-listed 114-recipe / 1,123-row corpus is
unchanged and has no goldeye, mooneye, smoked-product, or scientific-name demand. Static package
normalization and validation, reference normalization, generated-index freshness, ledger schema and
source-ID validation, exact ownership, picker projection, recipe-corpus scan, UTF-8/no-BOM, and
scoped whitespace checks passed. No app tests or emulator checks were run because this only adds
database JSON data and regenerates its search index.
