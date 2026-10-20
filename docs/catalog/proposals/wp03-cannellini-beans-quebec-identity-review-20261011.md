# WP03 Section H — Cannellini beans and white-kidney boundary review

- **Reviewed:** 2026-10-11
- **Packet type:** proposal-only pulse identity review
- **Scope:** Cannellini bean identity, white-kidney relation, Québec/Canadian English and French naming, aliases, exact-key ownership, current active/legacy/ledger state, and all manifest-listed recipe ingredient rows.
- **Write scope:** this proposal only. No shared seed, form, ledger, plan, roadmap, code, test, or recipe file was changed.
- **Plan state:** Cannellini remains an open Section H checklist item; Great Northern was integrated separately in the current tree.
- **Proposal-local source IDs:** `WP03-H-CANN-20261011-S01` through `S09`; these are not ledger records.

## Recommendation

**Promote the existing legacy candidate as an identity-only `LEGUME_AND_PULSE` reference** for the dry edible Cannellini bean class of *Phaseolus vulgaris*. Use **`cannellini beans`** / **`haricots cannellini`** as the English and Québec French displays. The federal terminology database TERMIUM Plus marks singular English `cannellini bean` and French `haricot cannellini` as correct terms; current Metro Québec French retail wording uses `Haricots blancs (Haricots cannellini)`. Canadian crop sources explicitly place Cannellini in the white-kidney class and list that class separately from Great Northern and Navy. [S01–S05]

For active aliases, use only the source-attested singular spellings `cannellini bean`, `cannellino bean`, and `haricot cannellini`. Treat `white kidney bean(s)` as a source-supported synonym/class description, but **leave it inactive** in the current matcher: the existing `kidney beans` reference would also match the `kidney beans` phrase inside a `white kidney beans` alias. Do not activate broad `white beans` / `haricots blancs`, unqualified `kidney beans` / `haricots rouges`, Navy, or Great Northern wording as aliases. [S01–S04, S08]

The bundled corpus has no Cannellini recipe line, so add no forms, measures, density, mappings, yields, conversions, substitution rules, or recipe links. Source observations belong in research evidence only until actual recipe demand and a collision-safe representation exist.

## Proposed row

| Field | Recommendation | Evidence and limit |
|---|---|---|
| Candidate ID | `ingredient-ref-cannellini-beans` | Reuse the unreviewed legacy candidate ID. It is absent from the active reference file. |
| English display | `cannellini beans` | TERMIUM Plus marks singular `cannellini bean` correct; Canadian crop terminology uses Cannellini as the white-kidney type. [S01, S02] |
| Québec French display | `haricots cannellini` | TERMIUM Plus marks singular `haricot cannellini` correct; current Québec French grocery product naming includes `Haricots Cannellini`. [S01, S05] |
| Botanical identity | *Phaseolus vulgaris* | OQLF gives this species for the white-kidney term; TERMIUM identifies Cannellini as a type of white kidney bean. Applying the species to Cannellini is an inference from those linked terms, corroborated by Canadian dry-bean classification. [S01, S03] |
| Category | `LEGUME_AND_PULSE` | The reviewed sources describe the food as a dried common-bean seed and Canadian dry-bean class. [S01–S03] |
| English aliases to activate | `cannellini bean`; `cannellino bean` | TERMIUM Plus lists these English forms. Keep aliases singular and narrow. [S01] |
| French alias to activate | `haricot cannellini` | TERMIUM Plus marks this singular French term correct. [S01] |
| White-kidney alias | Keep `white kidney bean(s)` inactive pending collision-safe search handling | Canada sources relate Cannellini to white kidney, but the current phrase matcher would make an alias containing `kidney beans` match the active `kidney beans` identity too. Keep the relationship in evidence, not the active alias list. [S01–S04, repository search behavior] |
| Initial numeric/form data | None | No Cannellini-specific app measurement or form is supported by current recipe demand. Source-only observations are detailed below. |

## Identity and naming boundaries

### Source facts

- TERMIUM Plus's 2008 food-terminology record marks `cannellini bean` correct, lists `cannellino bean` and `fagiola bean` as other English terms, defines the product as a white oval dried bean with thin skin and mild flavor, describes it as a type of white kidney bean, and marks French `haricot cannellini` correct. [S01]
- Statistics Canada's 2019 Field Crop Survey guide lists “white kidney (cannellini, alubia type)” among dry-bean varieties; in the same classification it separately lists Great Northern and says dry white pea beans (Navy) are collected separately. [S02]
- AAFC's Canadian dry-bean table separately lists White Kidney (Cannellini, alubia type) and light/dark red kidney classes. It describes Cannellini/white kidney as flat and white, reports 150–200 seeds per 100 g, and notes canning and dry packaging. [S03]
- OQLF's `haricot blanc` entry gives English `white kidney bean` and *Phaseolus vulgaris*, but cautions that many white-bean varieties fall under `haricot blanc`. OQLF separately identifies Navy as `petit haricot blanc`; the entry names Great Northern as another white-bean type. [S04]
- Current Metro Canada product pages label the 540 mL Primo product `Haricots blancs (Haricots cannellini)` in French and `White Kidney Beans (Cannellini Beans)` in English. [S05]
- The current active catalog already has separate `Great Northern beans / haricots Great Northern` and `kidney beans / haricots rouges` references. The existing kidney line in the bundled chili recipe is explicitly kidney beans, rinsed and drained. [repository snapshot]

### Review interpretation

These sources support an identity for the Cannellini white-kidney dry-seed class within common bean (*Phaseolus vulgaris*). They do not support merging it with Great Northern, Navy, red kidney beans, or every white bean. A source-supported culinary substitution between classes does not erase their distinct ingredient identities.

Use the exact borrowed product name `cannellini` in the Québec French display. Do not use `haricot blanc` alone: OQLF describes that phrase as covering multiple white-bean varieties, and it is already present as an unresolved broad legacy candidate. `Haricots blancs (Haricots cannellini)` is a current product label; the parenthetical identifies the specific product, while the unqualified first phrase remains too broad as a global alias.

TERMIUM and Canadian crop sources support the relation to the white-kidney class. However, activating `white kidney beans` as an alias would create a search collision with the currently active English `kidney beans` term. The current `IngredientSearch` phrase matcher accepts a complete query phrase anywhere within an alias and returns all phrase matches; consequently, the query `kidney beans` would match both the active kidney row and the proposed Cannellini row. Keep white-kidney wording ledger-only until an integration can preserve exact-owner precedence or otherwise prevent that ambiguity.

## Current repository preflight

Snapshot checked in the current working tree on 2026-10-11, after the Great Northern row was integrated. Counts can change as other Section H reviews integrate.

| Artifact | Current state relevant to this review |
|---|---|
| Active ingredient references | 937 references. No Cannellini ID/display/alias. `ingredient-ref-great-northern-beans` is active with display `Great Northern beans / haricots Great Northern`; `ingredient-ref-kidney-beans` is active as `kidney beans / haricots rouges`. |
| Active forms | 52 forms. No Cannellini form or exact Cannellini / white-kidney form label or match term. |
| Legacy candidates | 75 candidates. Cannellini exists only as unreviewed `ingredient-ref-cannellini-beans` (`cannellini beans / haricots cannellini`), with no aliases. Related candidates for `navy beans / haricots navy` and `white beans / haricots blancs` are also unreviewed. |
| Research ledger | 1,202 records, including an unreviewed `ingredient-ref-cannellini-beans` candidate with no source records and `measurementState` / `substitutionResearchState` both `not_yet_researched`. No reviewed Cannellini measurement or substitution evidence is present. |
| Unit, yield, and substitution data | 30 unit definitions, 8 ledger unit-conversion entries, one package-yield entry, and no global or contextual substitution rules. No Cannellini density, unit mapping, conversion, or package yield. |
| Manifest-listed recipes | All 114 recipe files exist; the complete corpus contains 1,123 ingredient rows. Search for Cannellini, white kidney, Great Northern, Navy, white beans, and related French forms found one nearby row only: recipe 034 uses `540 ml kidney beans, rinsed and drained` and links to `ingredient-ref-kidney-beans`. No Cannellini line exists. |
| Prior review context | `docs/catalog/batches/plant-legumes-pulses.md` leaves Cannellini for a separate bilingual review and warns that white-bean wording covers multiple classes. The live Section H checklist still has Cannellini open; no prior Cannellini-specific proposal was found. |

### Exact-key ownership and alias safety

Normalized exact-key checks covered active reference displays/aliases, form labels/match terms, all legacy candidates, and ledger record keys/evidence. The Cannellini display and singular terms are unowned in active references/forms; the plural display strings belong only to the unreviewed legacy candidate. No exact active `white kidney bean(s)` key exists. The active exact key `kidney beans` belongs to `ingredient-ref-kidney-beans`; the active Great Northern terms belong to `ingredient-ref-great-northern-beans`. The unreviewed generic white-bean candidate owns `white beans / haricots blancs` only in legacy data.

This audit distinguishes exact-key ownership from phrase matching: the full phrase `white kidney beans` is currently unowned, but adding it as an alias would also make `kidney beans` a complete phrase inside that alias under the current matcher. Therefore it is not safe to activate even though the source relationship is valid.

## Measures, forms, conversions, yields, and substitutions

- **Source-specific measure:** AAFC reports 150–200 seeds per 100 g for the 2002 White Kidney (Cannellini, alubia type) dry-bean class. This is an agricultural seed-size range, not a recipe count mapping; retain only as source evidence. [S03]
- **Generic white-bean data not assigned:** Health Canada's Canadian Nutrient File record 3385, `Beans, white, raw / Haricots, blancs, crus`, has volume weights, including 85.4 g per 100 mL and 213.4 g per 250 mL. It is not identified as Cannellini and cannot provide a Cannellini density or measure. [S06]
- **Package/form evidence only:** Metro lists a 540 mL canned Cannellini product, and AAFC notes canning and dry packaging. The can's nominal volume does not establish drained weight, package yield, or a conversion to dried beans. [S03, S05]
- **Forms:** sources document dry-seed and canned presentations, but the recipe corpus has no Cannellini demand. Add no dry, boiled, canned, drained, or rinsed form rows now.
- **Substitution evidence:** Dietitians of Canada says Navy or Canadian white beans can substitute for Cannellini in cooking; University of Illinois Extension says Cannellini and Great Northern are often substituted for one another while noting texture differences. These are contextual qualitative recommendations, not same-identity aliases or exact ratios. With no Cannellini recipe lines, keep any substitution findings ledger-only and add no rules. [S07–S08]
- **Unavailable behavior:** no reviewed source supplies a Cannellini density, drained-can yield, soak/cook conversion, dry-to-cooked yield, or exact substitution ratio. No recipe link is justified.

## Source-to-claim register

All online sources below were accessed **2026-10-11**. Locators identify the term record, table, product, or section used; limits distinguish direct source facts from review inference.

| Source ID | Direct source and locator | Claim used | Limit |
|---|---|---|---|
| `WP03-H-CANN-20261011-S01` | Translation Bureau, Government of Canada, [TERMIUM Plus, “Fagiola bean” record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enw&lang=fra&srchtxt=FAGIOLA+BEAN), record dated 2008-05-13; Fruits and Vegetables (Types and Processing — Food Ind.). | Marks `cannellini bean` and French `haricot cannellini` correct; lists `cannellino bean` and `fagiola bean`; defines Cannellini as a white oval dried bean and says it is a type of white kidney bean. | Terminology record, not a modern Canadian grading rule. `Fagiola bean` is retained as evidence but not recommended as an active alias. |
| `WP03-H-CANN-20261011-S02` | Statistics Canada, [Reporting Guide — 2019 Field Crop Survey, July](https://www.statcan.gc.ca/en/statistical-programs/document/3401_D1_V8), sections “Dry beans, coloured, total” and “Dry beans, white pea (Navy).” | Lists `white kidney (cannellini, alubia type)` separately from Great Northern and records white pea/Navy separately. | Crop-reporting categories and terminology; not a consumer label or botanical taxonomic treatment. |
| `WP03-H-CANN-20261011-S03` | Agriculture and Agri-Food Canada, [*V15N22: Dry Beans*](https://publications.gc.ca/collections/collection_2015/aac-aafc/A27-18-15-22-eng.pdf), 2002, PDF p. 4, “Types of dry beans grown in Canada,” rows for Light Red Kidney and White Kidney. See also [French table, *Types de haricots secs cultivés au Canada*](https://publications.gc.ca/collections/Collection/A27-18-19-19F.pdf), 2006. | Names White Kidney (Cannellini, alubia type) separately from red kidney; supplies the source-specific 150–200 seeds/100 g range and dry-pack/canning uses. The French table calls the class `HARICOTS BLANCS (Cannellini, haricots alubia)`. | Historical Canadian crop bulletins. Seed count is a range for crop-size description, not a recipe measure. |
| `WP03-H-CANN-20261011-S04` | OQLF, [*haricot blanc*, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296956/haricot-blanc), updated 1991, preferred term, English equivalent, Latin name, and note; and [*petit haricot blanc*, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083589/petit-haricot-blanc), updated 1991. | Supports `haricot blanc` / `white kidney bean` and *Phaseolus vulgaris* while warning that white-bean wording covers multiple varieties; identifies Navy as `petit haricot blanc` and names Great Northern separately in the white-bean class note. | Historical OQLF terminology entries; the broad `haricot blanc` entry does not make every white-bean variety interchangeable. |
| `WP03-H-CANN-20261011-S05` | Metro Canada, [Primo Haricots blancs (Haricots cannellini)](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/haricots-et-legumineuses/haricots-blancs-haricots-cannellini/p/055900003996) and [Primo White Kidney Beans (Cannellini Beans)](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/beans-legumes/white-kidney-beans-cannellini-beans/p/055900003996), both 540 mL product listings. | Current Canadian retail naming explicitly pairs `haricots blancs` with `haricots cannellini` in French and `White Kidney Beans` with `Cannellini Beans` in English. | Retailer listings can vary and are not terminology authorities; nominal package volume is not drained yield. |
| `WP03-H-CANN-20261011-S06` | Health Canada, [Canadian Nutrient File, “Beans, white, raw / Haricots, blancs, crus”](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3385), food code 3385, available serving sizes. | Shows that a generic white-bean record has volume-weight observations. | Does not identify Cannellini; no values are copied to this candidate. |
| `WP03-H-CANN-20261011-S07` | Dietitians of Canada, [UnlockFood, “All About Legumes, Peas, Beans and Lentils”](https://www.unlockfood.ca/en/Articles/Cooking-Food-Preparation/Cooking-with-Legumes.aspx), updated February 24, 2023, lines on red kidney, Navy, and Cannellini. | Distinguishes red kidney from white Cannellini, describes Navy as small white beans, and suggests Navy/Canadian white as a substitute for Cannellini. | General cooking advice; gives no quantitative ratio and does not state that the bean identities are the same. |
| `WP03-H-CANN-20261011-S08` | University of Illinois Extension, [“Explore the richness and health benefits of white beans”](https://extension.illinois.edu/blogs/simply-nutritious-quick-and-delicious/2023-03-02-explore-richness-and-health-benefits-white), March 2, 2023, text and White Bean and Chicken Chili example. | Says Cannellini and Great Northern are often substituted for one another and notes differing texture. | Qualitative culinary guidance, not controlled substitution evidence or a ratio. |
| `WP03-H-CANN-20261011-S09` | USDA Agricultural Marketing Service, [Beans, Grades and Standards](https://www.ams.usda.gov/grades-standards/beans), sections 101–102. | Lists Great Northern, pea/Navy, Small White, and White Kidney as separate dry-edible bean classes. | U.S. grade classes; corroborates class boundaries but does not set Québec names. |

## Integration guardrails

1. Recheck active normalized keys, forms, ledger, and all manifest-listed recipes at merge time.
2. If accepted, promote `ingredient-ref-cannellini-beans` as one identity-only `LEGUME_AND_PULSE` row with displays `cannellini beans / haricots cannellini` and only the narrow singular aliases listed above.
3. Keep `white kidney bean(s)` source evidence inactive as an alias until the matcher no longer returns the active `kidney beans` identity for that subphrase. Do not map unqualified `kidney beans` to Cannellini.
4. Do not alias generic `white beans / haricots blancs`, Navy/Canadian white beans, Great Northern, `alubia` without a specific product qualifier, or the obscure `fagiola bean` term.
5. Add no forms, measures, yields, mappings, conversions, substitutions, or recipe links. If later recipes call for Cannellini, research the stated state and recipe context before adding behavior.
