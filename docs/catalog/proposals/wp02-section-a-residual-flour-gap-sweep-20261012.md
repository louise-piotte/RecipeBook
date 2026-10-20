# WP02 Section A residual regional wheat-flour identities

**Review date:** 2026-10-12

**Status:** Integrated by root on 2026-10-12; see the [integration report](../batches/wp02-section-a-german-wheat-types-integration-20261012/README.md). The complete French display compounds remain descriptive constructions pending independent Québec French sign-off. The proposal itself did not change shared catalog files.

**Scope:** German numbered wheat-flour types 405, 550, 812, 1050, and 1600, plus the boundary for the separately named Backschrot 1700. Other Section A rye, barley, oat, and rice candidates are reconciled below against their existing decisions; they are not reopened here.

## Recommendation

Add five distinct identity-only entries. Current German mill pages use each exact type label on wheat flour products; DIN identifies the current national milling-products standard, and the German millers’ association explains that a flour type number describes mineral content rather than fineness. The evidence supports source-named product classes. It does not establish a conversion to North American flour names, common protein thresholds, universal baking performance, or household measurement data.

| Proposed ID | English display | Proposed fr-CA display | Search alias from the source label | Category |
|---|---|---|---|---|
| ingredient-ref-german-type-405-flour | German type 405 wheat flour | farine de blé de type 405 (Allemagne) | Weizenmehl Type 405 | FLOUR_AND_STARCH |
| ingredient-ref-german-type-550-flour | German type 550 wheat flour | farine de blé de type 550 (Allemagne) | Weizenmehl Type 550 | FLOUR_AND_STARCH |
| ingredient-ref-german-type-812-flour | German type 812 wheat flour | farine de blé de type 812 (Allemagne) | Weizenmehl Type 812 | FLOUR_AND_STARCH |
| ingredient-ref-german-type-1050-flour | German type 1050 wheat flour | farine de blé de type 1050 (Allemagne) | Weizenmehl Type 1050 | FLOUR_AND_STARCH |
| ingredient-ref-german-type-1600-flour | German type 1600 wheat flour | farine de blé de type 1600 (Allemagne) | Weizenmehl Type 1600 | FLOUR_AND_STARCH |

For all five rows, store the literal German label in aliasesEn because the current reference schema has only English and French alias arrays; it is a lookup token, not an English translation or user-facing display. Keep aliasesFr empty. Use `defaultDensity: null` and `unitMappings: []`. Add no forms, measurements, conversions, package yields, recipe links, or substitutions.

### Class boundaries

- Keep the number and Germany qualifier in both display names. The current evidence treats the number as a milling-class identifier. The German millers’ association states that the type number describes mineral content and is not a fineness grade. Its example says Type 405 corresponds to 405 mg minerals per 100 g; do not treat this ash/mineral classification as a kitchen mass, portion, or volume conversion. [S01–S03]
- The Federal Center for Nutrition lists wheat types 405, 550, 1050, and 1600, and separately names Backschrot 1700 and wholegrain. It does not list Type 812 in that overview. Type 812 is supported here by two current mill product pages that use the exact name; the public DIN listing identifies the standard but does not expose its full type table. Do not claim this review established every normative class value or a complete DIN class list. [S01, S03, S06–S07]
- Manufacturer usage descriptions are evidence about those manufacturers’ products only. Type 405 is marketed for light pastry; Type 550 for fine baking and light bread; Type 812 for, among other uses, mixed bread; Type 1050 for darker wheat or mixed breads; and Type 1600 for dark mixed bread. These statements do not map the types to cake flour, bread flour, pastry flour, all-purpose flour, high-gluten flour, or one another. [S04–S09]
- Keep Type 1600 distinct from whole-wheat flour and whole-wheat meal. The government source describes wholegrain flour and meal as containing the cleaned kernel’s components, including the germ, and the Type 1600 mill page lists Weizenvollkornmehl separately. A darker color or higher mineral content does not establish a wholegrain identity. [S02–S03, S09]
- Do not alias Halbweißmehl, bare Type 405/550/812/1050/1600, or the German labels without their type number. One Type 812 manufacturer also calls its own product Halbweißmehl; that product-level wording does not establish a Québec term or a cross-country half-white flour equivalence. Do not add Italian tipo 00/0/1/2, French T45/T55/T65/T80/T110/T150, Canadian Manitoba, or North American bread/cake/all-purpose names as aliases. [S05–S11]

## Québec French naming review

The OQLF’s GDT records farine de blé and farine de froment as Québec French terms for generic wheat flour. The proposed labels use the familiar generic base farine de blé with the explicit German class number and country qualifier. I found no OQLF entry for any complete German type phrase. The full compounds are therefore descriptive catalog constructions, not OQLF-approved grade names; obtain independent Québec review before integration. [S10]

Do not use farine de blé tendre as a generic substitute display or alias for these type classes. The OQLF defines that term and its variant farine de blé mou as a lower-gluten flour used mainly in pastry, while the German type number is described in the reviewed milling source by mineral content, not gluten strength. The OQLF entry supplies no German grade names. [S02, S11]

Keep the French alias arrays empty. In particular, do not add generic farine de blé or farine de froment, unqualified farine de type 405, or a guessed full-grade synonym. The proposed French displays make the country and number explicit; a family search for farine de blé can still find the flour family without claiming grade equivalence.

## Measurement and substitution findings

The reviewed sources support no source-qualified g/mL density, cup-to-mass value, recipe portion, or class-wide package-yield value for any of the five candidates. The 405 label’s mineral/ash number is a classification result, not an ingredient quantity. Retail package weights or bulk shipping formats on individual mill pages are net package sizes, not a portion basis or volume conversion. If integrated, mark each ledger record `measurementState: researched_no_supported_value`; leave density and unit mappings unavailable.

No reviewed source provides a tested replacement ratio or a class-wide substitution rule. The manufacturers’ baking-use descriptions are not substitution directions, and source wording does not establish equivalence among German types or between these types and flour classes in other countries. If integrated, mark each ledger record `substitutionResearchState: researched_no_supported_substitute`; add no substitution finding or active rule.

## Backschrot 1700: hold as a wheat-meal/grind candidate

Do not add a flour row or flour alias for Backschrot 1700. The Federal Center for Nutrition lists it separately from Weizenmehl types and wholegrain; the German millers’ association describes Schrot as a coarser milling product than Mehl. These sources identify a distinct product wording but do not define a Québec French consumer name or a process boundary that matches the existing whole wheat meal identity. Keep it out of the existing whole wheat meal, whole-wheat flour, cracked wheat, wheat bran, and generic wheat-flour rows. Record the hold against the existing wheat-meal ledger record if this packet is integrated; no new active identity, recipe link, measure, or substitution is proposed. [S02–S03]

## Existing Section A candidate dispositions checked

The adjacent rye, barley, oat, and rice decisions below are already represented by active rows or recent source-backed holds. This packet makes no change to them.

| Candidate family | Current disposition retained | Existing review |
|---|---|---|
| Other regional wheat classes | Italian and French numbered classes are already separate, country-qualified rows with no crosswalk. Japanese weak wheat flour is a separate active class; its constructed fr-CA display remains provisional. Manitoba remains a product-boundary hold and is not an alias for type 00, all-purpose, bread, or high-gluten flour. This packet proposes only the uncovered German types. | [Québec review of Italian/French classes](wp02-regional-flour-classes-quebec-terminology-review-20261011.md), [Japanese weak wheat flour review](wp02-specialist-baking-next-review-20261011.md), [Manitoba product boundary](wp02-wheat-flour-quebec-identity-gap-review-20261010.md) |
| Rye flour and meal | Generic, whole, light, and medium rye flours and the narrow rye-meal identity are already separate. Keep dark rye flour on hold because supplier milling scopes vary; keep toasted rye flour held until the process and Québec French boundary are established. Pumpernickel terms remain bounded to the rye-meal product evidence. | [Medium/dark rye boundary](wp02-medium-dark-rye-product-boundary-review-20261011.md), [toasted rye review](wp02-a7-toasted-rye-flour-quebec-product-boundary-review-20261011.md), [whole-rye follow-up](wp02-ab-next-flour-starch-gap-sweep-20261012.md) |
| Barley flour and meal | Retain general barley flour separately from malted and roasted barley flours. Keep generic barley meal held because its human-food grind boundary and exact Québec French name remain unsupported. | [Barley-meal Québec boundary](wp02-a7-barley-meal-quebec-product-boundary-review-20261011.md), [roasted barley evidence](../batches/roasted-barley-flour-identity.md) |
| Oat meal | Retain the narrow Scottish oatmeal product identity and its bounded aliases. Keep dry oat meal/oatmeal held; do not generalize Scottish oatmeal to oat flour, rolled oats, or every product called oatmeal. | [Dry oat-meal boundary](wp02-a7-dry-oat-meal-product-boundary-review-20261011.md) |
| Rice flour and farina | White rice flour and brown rice flour already exist as separate source-grain identities. Keep the named brown-rice-farina hot cereal held as a generic identity because its French wording is specific to one manufacturer product. No additional white/brown rice grind grade is proposed here. | [Roasted urid/mung/oat/rice review](wp02-roasted-urid-mong-oat-rice-flour-review-20261010.md), [brown-rice-farina Québec wording review](wp02-brown-rice-farina-quebec-wording-review-20261011.md) |

These prior statuses do not close the broad Section A checklist. Other regional flour classes, product-specific milling distinctions, and independent Québec review remain open.

## Live catalog, alias, and recipe-demand audit

At the read-only audit snapshot on 2026-10-12, after the Section B cassava alias integration, the files contained:

| Surface | Snapshot | SHA-256 |
|---|---:|---|
| Ingredient references | 1,228 | 373845dac8aa1453d0d4f85eaeb35033efc6130c347b75dc48e351b842576dde |
| Ingredient forms | 86 | 24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978 |
| Legacy-import candidates | 66 | bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f |
| Research ledger | 1,526 records; 5,231 source entries; 4,294 distinct source IDs | 239362c04fe319180fdd78929b29383a174e5f605792dd4fea4ade7e6a93a563 |

These hashes are point-in-time audit aids from before integration. Root rechecked exact-key ownership and source-ID availability against the live files immediately before integration; the post-integration snapshot is recorded in the integration report.

I checked every proposed English and French display and each German source-label alias against current reference names and aliases, form names and match terms, and legacy candidates. All exact normalized-key checks returned no current owner. The proposal-local source-ID prefix WP02-SECTION-A-GERMAN-WHEAT-20261012- had no current ledger collision. Proposed IDs were also absent from the active reference, form, and legacy files. Candidate queries are country/type qualified; broad wheat flour and farine de blé remain family-level searches, not aliases on these entries.

The search behavior check followed IngredientSearch.kt: lowercase, NFKD normalization, accent/ligature folding, punctuation-to-space normalization, full-phrase matching before substring fallback. Each proposed type number is unique, and the five qualified names do not duplicate another current row’s complete name or alias. The current family query wheat flour returns 16 rows and farine de blé returns 18; those are family searches, not alias collisions. At integration, each qualified English/French display and its exact Weizenmehl Type N query should resolve to its corresponding new row only.

After the recipe 090#17 peanut-component link was reconciled, the manifest-ordered corpus contained 114 files, 1,123 ingredient rows, and 752,993 bytes; its SHA-256 fingerprint is 2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27. A full-text scan of that corpus found no proposed display, German product label, Backschrot 1700, or type-number query. No recipe link or inferred demand is proposed.

## Proposal-local source register

Sources were accessed on 2026-10-12. Product-specific use or composition statements below are not generalized beyond the named product. Source IDs use the checked prefix above; do not reuse them for unrelated evidence.

| Source ID | Source | Evidence and limit |
|---|---|---|
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S01 | DIN Media, [DIN 10355:2017-11, Milled cereal products — requirements, types and testing](https://www.dinmedia.de/de/norm/din-10355/278945931) | The current standards listing identifies the German standard and its scope. The public page does not expose the full type table or individual class values; none are inferred from the paywalled document. |
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S02 | Verband Deutscher Mühlen, [Mehltypen](https://www.muehlen.org/produkte/mehltypen/) | Says German flour types are set by DIN 10355; the type number describes mineral content, not fineness. Gives Type 405 as an example of 405 mg minerals per 100 g and explains that wholegrain products carry no type number. Its named usage examples are broad trade guidance, not cross-country equivalences. |
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S03 | Bundeszentrum für Ernährung, [Getreide-ABC: Weizen](https://www.bzfe.de/presse/pressemeldungen-archiv/getreide-abc-weizen) | Lists wheat flour types 405, 550, 1050, 1600, Backschrot 1700, and wholegrain; says the number represents mineral/ash content, not fineness. It distinguishes wholegrain contents. The page does not mention Type 812, so it is not used as direct evidence for that label. |
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S04 | Frießinger Mühle, [Weizenmehl Type 405](https://www.friessinger-muehle.de/privatkunden/mehle/weizenmehle/muehlen-koenig/weizenmehl-type-405) | Current product page uses the exact Type 405 wheat-flour label and identifies wheat flour as the product ingredient. Its baking-use and nutrition statements are specific to this brand. |
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S05 | Heimatsmühle, [Weizenmehl Type 550](https://www.heimatsmuehle.com/de/privatkunden/produkte/weizenmehl-type-550) | Current mill product page uses the exact Type 550 label and declares 100% wheat. The listed uses, nutrition, and package sizes are product-specific and supply no generic density or portion conversion. |
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S06 | SchapfenMühle, [Weizenmehl Type 812](https://schapfenmuehle.de/gewerbekunden/produkte/mehle/weizenmehl-type-812) | Current manufacturer page names Type 812 wheat flour, says it is milled from cleaned wheat kernels, and lists Types 550 and 1050 as separate products. This product description does not establish exact class thresholds. |
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S07 | Heimatsmühle, [Weizenmehl Type 812](https://www.heimatsmuehle.com/de/gewerbekunden/produkte/weizenmehl-type-812) | A second current mill page independently uses the Type 812 wheat-flour name. It calls that product Halbweißmehl and gives product-specific uses; neither phrase is activated as an alias or cross-country term. |
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S08 | Huber Mühle, [Weizenmehl, Type 1050](https://hubermuehle.de/products/weizenmehl-type-1050) | Current product page uses the exact Type 1050 wheat-flour label. Its ingredient, nutrition, baking descriptions, and pack options are specific to the named product. |
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S09 | SchapfenMühle, [Weizenmehl Type 1600](https://schapfenmuehle.de/gewerbekunden/produkte/mehle/weizenmehl-type-1600) | Current manufacturer page names Type 1600 wheat flour, describes its own dark-bread use, and lists wholegrain wheat flour separately. This does not make the type equivalent to whole-wheat flour. |
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S10 | Office québécois de la langue française, [farine de froment](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297140/farine-de-froment) | Lists farine de froment and farine de blé as preferred Québec terms for generic wheat flour. It does not define a German grade name. |
| WP02-SECTION-A-GERMAN-WHEAT-20261012-S11 | Office québécois de la langue française, [farine de blé tendre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre) | Lists farine de blé tendre and farine de blé mou for a lower-gluten flour mainly used in pastry. It contains no German type terminology; it supports excluding this unqualified functional term from the German grade aliases. |

## Exact integration delta and remaining gaps

Root integrated all five references and ledger records, attached S02/S03 and the Backschrot 1700 unresolved decision to the existing wheat-meal record, and regenerated the Kotlin reference index. Ingredient forms, recipes, package yields, conversion/substitution rules, legacy identities, and schemas were unchanged. The checklist, roadmap, and workflow now point to the integration report. No tests were run because the catalog change adds database JSON data under the current `AGENTS.md` exception.

| Record ID | Ledger sources |
|---|---|
| ingredient-ref-german-type-405-flour | S01, S02, S03, S04, S10, S11 |
| ingredient-ref-german-type-550-flour | S01, S02, S03, S05, S10, S11 |
| ingredient-ref-german-type-812-flour | S01, S02, S06, S07, S10, S11 |
| ingredient-ref-german-type-1050-flour | S01, S02, S03, S08, S10, S11 |
| ingredient-ref-german-type-1600-flour | S01, S02, S03, S09, S10, S11 |
| existing ingredient-ref-wheat-meal hold | S02, S03 |

Remaining work: independent Québec French review of the five complete display compounds; obtain the publicly accessible DIN type table or an equivalent primary source before making exact class-threshold claims; and continue the broader Section A regional-flour review. The rye, barley, oat, and rice holds in the existing proposals remain open where their product boundaries or Québec names are unresolved.
