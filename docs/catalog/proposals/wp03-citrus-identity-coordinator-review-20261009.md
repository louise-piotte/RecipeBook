# WP03 Section M coordinator review: citrus identity gaps

**Review date:** 2026-10-09  
**Disposition:** Proposal only. No bundled catalog, ledger, legacy candidate, recipe, plan, roadmap, code, or test file was changed.

## Recommendation

Treat the checklist as 15 food identities: sweet orange, lemon, lime, grapefruit, mandarin, clementine, true pomelo, kumquat, yuzu, sudachi, calamansi/calamondin, citron/cédrat, bergamot, finger lime, and bitter orange. Reuse the active lemon identity and the three existing orange, lime, and grapefruit legacy candidates. Add 11 new references if the coordinator accepts this taxonomy tranche. Keep all in `FRUIT` and do not create an undifferentiated citrus parent identity.

OQLF supports most of the English and Québec French terms, but its 2024 pages use *pamplemousse*, *pomélo*, and *pomelo* across both grapefruit (*Citrus × paradisi*) and true pomelo (*Citrus maxima*). Keep those French terms in an explicit disambiguation set; never route them silently to one fruit. Similarly, English *citron* is French *cédrat*, whereas French *citron* is English *lemon*. The Philippine government sources support calamansi and calamondin as names for one food commodity, so do not create two references. [S08–S09, S12, S14, S16–S17]

Identity coverage is justified by the Section M checklist, not current recipe demand: the 114-recipe corpus has no line naming any of the proposed new identities. Recipe evidence does justify retaining the existing lemon and lime-juice product references and treating broad citrus zest as unresolved. Keep all measurements, fruit-state forms, product conversions, and substitutions as separate work.

## Refreshed working-tree snapshot

Counts and hashes were recomputed from the manifest-listed package immediately before this review.

| File or corpus | Current count | SHA-256 |
|---|---:|---|
| Bundled ingredient references | 543 | `ff539f497796d9eac76fb647ec619bbeb4af076a72bf7a23ed48935ba13196fb` |
| Bundled ingredient forms | 32 | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| Bundled manifest recipe paths | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger records / source entries / unique source IDs | 722 / 1,178 / 992 | `395564521aba7a8be6aef27f210122330a97a43629857682054c55d6e2b69182` |
| Legacy identity candidates | 96 | `91173bf115fadd4e78e6e4589b87c30ca20fb4eda152fce8ca9c07335a9bd626` |
| Manifest-ordered recipe corpus | 114 recipes / 1,123 ingredient rows | `451f26f55ca849f0edf0a8a64a9abdf594b178e47d3ed6bcd113b26f451cecfd` |

The recipe digest is SHA-256 over each manifest-relative recipe path, a NUL byte, its exact file bytes, and a NUL byte, in manifest order. The current package has 23 active `FRUIT` references. The current source-ID ledger contains deliberate reused IDs across records; the proposed prefix `WP03-M-CITRUS-IDENTITY-20261009-S` has no collision with any of its 1,178 source entries.

## Method and audit scope

I read `AGENTS.md`, the relevant ingredient-reference and form requirements, Section M of the global catalog plan, research rules 06–10, the current roadmap checkpoint, the prior small-fruit coordinator review, and the regional-identity integration note. I reviewed all active ingredient references and aliases, all 32 forms, all 96 legacy candidates, the complete research ledger, both substitution-rule files, and every ingredient row in all 114 manifest recipes. The recipe scan covered original ingredient text, normalized ingredient name, preparation, and notes; all 17 citrus-text hits were manually checked for an exact named fruit and an existing owner.

Online identity research prioritized the exact OQLF GDT entries and Health Canada, MEXT, MAFF, Philippine government, and Australian government sources. Culinary and measurement follow-up checked Health Canada CNF serving pages, University of Guam Extension, Ricardo, and King Arthur Baking. Access date for all online sources is 2026-10-09. Search results from unsourced ingredient-substitution aggregators were not treated as evidence. The previous small-fruit report explicitly left citrus open; its seven berry recommendations are not repeated here.

## Current reference, form, legacy, and ledger state

| Current record | Current state and exact owner | Proposed treatment |
|---|---|---|
| `ingredient-ref-lemon` | Active `FRUIT`: `lemon / citron`; no aliases; ledger identity is `unreviewed` with no sources. | Keep this ID and label pair; attach the lemon identity evidence. Do not add English *citron* or French *lemon* as aliases. |
| `ingredient-ref-lemon-juice` | Active `SAUCE_AND_CONDIMENT`: `lemon juice / jus de citron`; French alias `jus de citron frais`; no ledger sources. | Keep separate from the whole lemon. Recipe amounts remain attached here. |
| `ingredient-ref-lemon-zest` | Active `SAUCE_AND_CONDIMENT`: `lemon zest / zeste de citron`; no aliases or ledger sources. | Keep separate from the whole lemon. Do not turn generic citrus zest into lemon zest. |
| `ingredient-ref-lime-juice` | Active `SAUCE_AND_CONDIMENT`: `lime juice / jus de lime`; French alias `jus de citron vert`; no ledger sources. | Keep separate from the lime fruit. The exact lime variety is not stated in recipe demand. |
| `ingredient-ref-orange`, `ingredient-ref-lime`, `ingredient-ref-grapefruit` | Three `FRUIT` legacy candidates with the respective current pairs `orange / orange`, `lime / lime`, and `grapefruit / pamplemousse`; all have no aliases and remain `unreviewed`. | Reconcile these candidates into active source-reviewed identities; do not mint duplicate IDs. The grapefruit French label needs the disambiguation described below. |
| `ingredient-ref-lime-pickle` | Active WP05 condiment, `lime pickle / marinade de lime`, already source-reviewed. | Keep as a prepared condiment, not as the lime fruit or a lime form. |
| `ingredient-ref-makrut-lime-leaves` | Active `HERB`, `makrut lime leaves / feuilles de combava`; three fresh, frozen, and dried leaf forms. | Keep outside citrus fruit identities. No fruit form or conversion can be inferred from leaf evidence. |

The active `substitution-rules.v1.json` and `contextual-substitution-rules.v1.json` each contain zero records. The lemon-juice and lime-juice ledger records currently say `existing_rule_needs_review` for substitution despite those empty arrays; preserve that state as an unresolved ledger issue rather than inventing a rule. Their measurement state is `blocked_pending_evidence`. The orange, lime, and grapefruit legacy candidates and active lemon reference have no ledger sources yet.

## Recipe-row findings

The 17 citrus-text matches are below. There is no recipe-line demand for orange, mandarin, clementine, grapefruit, pomelo, kumquat, yuzu, sudachi, calamansi, citron/cédrat, bergamot, finger lime, or bitter orange.

| Recipe row(s) | Exact ingredient wording | Current owner / interpretation |
|---|---|---|
| `007#5` | `5 g vinegar or lime juice` | Unlinked. A line-specific alternative; not a general vinegar-to-lime rule. |
| `010#7`, `012#2`, `014#5`, `106#3` | `lemon zest`; `grated lemon zest` | All link to `ingredient-ref-lemon-zest`. |
| `012#6`, `014#4`, `019#5`, `024#3`, `029#4`, `106#4`, `108#3`, `113#5` | `fresh lemon juice`, `lemon juice` | All link to `ingredient-ref-lemon-juice`; quantities are 60 ml, tablespoons, or teaspoons. |
| `034#13`, `095#7` | `lime juice`; `fresh lime juice` | Both link to `ingredient-ref-lime-juice`; quantities are tablespoons. |
| `066#13` | `1/2 lemon, thinly sliced` | Links to the whole-fruit `ingredient-ref-lemon`; no size or edible-portion basis. |
| `111#5` | `Fresh aromatics ... and/or citrus zest` | Unlinked, optional, and species-unspecified. Keep unresolved until the recipe names a citrus fruit. |

The citrus strings above are product or preparation references where specified, not evidence that juice and zest are synonyms for their source fruit. The broad `citrus zest` line is not an exact demand for any one citrus identity.

## Candidate identity set

Suggested IDs for the 11 new entries are unique against the active reference IDs and all current legacy IDs. The existing lemon reference and orange/lime/grapefruit legacy IDs are deliberately reused.

| Candidate / existing ID | Suggested EN display | Suggested fr-CA display | Exact alias policy and boundary |
|---|---|---|---|
| Existing `ingredient-ref-orange` legacy candidate | `orange` | `orange douce` | Add EN `sweet orange` and FR `orange` from OQLF usage. This is the sweet eating orange, not bitter orange. Keep juice, zest, peel, blossom, and marmalade products separate. [S01–S02] |
| Existing `ingredient-ref-lemon` active reference | `lemon` | `citron` | Keep existing names. No cross-language `citron` alias: French *citron* is lemon, while English *citron* is cédrat. Keep juice and zest on their existing product IDs. [S03, S12] |
| Existing `ingredient-ref-lime` legacy candidate | `lime` | `lime` | Add FR `citron vert` as the supported Québec term. Do not alias `limette`: OQLF defines *limette* as sweet lime (*Citrus limetta*), not this culinary lime. OQLF’s *lime Key*, *lime mexicaine*, and *limette acide* terms point to a narrower *C. aurantifolia* concept; keep them out of this broad, variety-unspecified recipe identity until that boundary is reviewed. [S04] |
| Existing `ingredient-ref-grapefruit` legacy candidate | `grapefruit` | `pomélo (Citrus × paradisi)` — provisional qualified display | OQLF lists `pomélo` for grapefruit and says *pamplemousse* is common in Québec for this fruit. Both terms also appear on its true-pomelo page; keep `pamplemousse`, `pomélo`, and `pomelo` in a shared disambiguation set, not a single-owner alias. Do not alias English `pomelo`, `pummelo`, or `shaddock` to grapefruit. [S08–S09] |
| `ingredient-ref-mandarin` | `mandarin` | `mandarine` | OQLF English terms include `mandarin`, `mandarine`, and `mandarin orange`; keep `mandarin orange` and `mandarine` as EN aliases if desired. Do not alias clementine or unqualified tangerine. A CNF row called “Tangerine (mandarin)” is a portion record for that row, not proof that all tangerines and mandarins are interchangeable. [S05, S28] |
| `ingredient-ref-clementine` | `clementine` | `clémentine` | Keep separate from mandarin: OQLF identifies a mandarin × bitter-orange cross and explicitly distinguishes clementines from tangerines. Do not add `mandarin`, `tangerine`, or `bitter orange` as aliases. [S06] |
| `ingredient-ref-pomelo` | `pomelo` | `pamplemousse (Citrus maxima)` — provisional qualified display | EN aliases `pummelo` and `shaddock` are listed by OQLF. French `pamplemousse`, `pomélo`, and `pomelo` are shared disambiguation terms because OQLF also uses them for grapefruit. Never silently assign the unqualified French term to this row alone. [S09] |
| `ingredient-ref-kumquat` | `kumquat` | `kumquat` | OQLF EN variant `cumquat` may be an alias. Do not alias `citronnier du Japon` (tree name), `Chinese orange`, syrup/candied products, or calamondin. [S10, S14] |
| `ingredient-ref-yuzu` | `yuzu` | `yuzu` | OQLF gives the same name in both languages and describes the fruit’s aromatic peel and juice. No transliterated or other-citrus alias is needed. Keep juice, zest, and processed yuzu products separate. [S11] |
| `ingredient-ref-sudachi` | `sudachi` | `sudachi` | Retain the Japanese name in both displays; no verified fr-CA translation was found. MAFF identifies sudachi as a distinct Tokushima fruit. Do not alias yuzu, kabosu, or lime. [S18–S20] |
| `ingredient-ref-calamansi` | `calamansi` | `calamondin` | Use OQLF’s fr-CA `calamondin`; EN `calamondin` and FR `calamansi` can be aliases. Philippine DA and its cited national standard call the same commercial food `calamansi`/`calamondin`; do not create two rows. Keep `Philippine lemon`, `Philippine lime`, `Chinese orange`, `Panama orange`, and `scarlet lime` out as potentially misleading names. Botanical names differ across older sources; retain their nomenclature in provenance rather than splitting the food. [S14, S16–S17] |
| `ingredient-ref-citron-cedrat` | `citron (cedrat)` | `cédrat` | OQLF English aliases `etrog`, `esrog`, `ethrog`; French alias `poncire`. Do not assign French `citron` to this row: it is the active lemon name. Keep the occasional `pomme du paradis` wording out because the source only notes it as occasional. [S03, S12] |
| `ingredient-ref-bergamot` | `bergamot` | `bergamote` | Direct OQLF pair. This is the highly acidic *Citrus bergamia* fruit, not Earl Grey tea, bergamot essential oil, flavoring, or extract. Do not alias those products. [S13] |
| `ingredient-ref-finger-lime` | `finger lime` | `lime caviar` | Ricardo’s Québec recipe uses *lime caviar* and identifies `citron-caviar` and English `finger lime` as names for the fruit; FR aliases may preserve both `citron-caviar` and `citron caviar`. Australian government guidance identifies *Citrus australasica*. Do not alias generic lime, lemon, or caviar alone; the fruit’s vesicle texture is a meaningful identity cue. [S21–S22] |
| `ingredient-ref-bitter-orange` | `bitter orange` | `orange amère` | OQLF EN aliases `sour orange`, `Seville orange`; FR aliases `bigarade`, `orange de Séville`. Keep distinct from sweet orange and clementine; do not alias Seville orange marmalade, neroli, blossom water, essential oil, or peel products. [S06–S07] |

All proposed records belong in `FRUIT`. The qualified grapefruit and pomelo French displays are provisional names chosen to make the identity distinction visible; independent Québec terminology review must decide whether the app can show a species-qualified label and offer the shared unqualified terms as a two-result disambiguation. If current search cannot express that behavior, hold the overlapping French aliases rather than silently assigning them.

## Forms, measurements, conversions, and substitution disposition

### Forms and product boundaries

Do not add fresh/frozen/dried/cooked forms, juice or zest forms, or forms for whole fruit in this batch. The existing makrut lime leaf forms describe leaves only. Juice, zest, peel, pulp, concentrate, purée, candied peel, essential oil, and bottled flavor products are separate product/form research. OQLF defines generic *zeste* as the colored, aromatic outer citrus rind, but that does not make an unqualified citrus-zest recipe line resolve to a particular fruit. [S15]

### Measurement evidence reviewed

No default citrus density or unit mapping is recommended. The located portions are food-, state-, size-, and source-version-specific and cannot be transferred across the fruit and juice references.

| Source observation | Evidence class and exact limitation | Disposition |
|---|---|---|
| CNF 2015: raw orange, all commercial varieties, medium 6.7 cm fruit = 131 g edible portion; 100 ml sections = 76.1 g; peel/seeds refuse 27%. [S23] | Canadian government source-published edible count and cut-fruit portion; not whole as-purchased mass, juice yield, or density. | Keep as a source-specific future observation; no recipe asks for orange. Recheck against CNF 2026 before integration. |
| CNF 2015: raw lemon without peel, medium 5.4 cm = 58 g edible; large 6 cm = 84 g; wedge/slice = 7 g; 100 ml sections = 89.6 g. The record reports peel and seed refuse. [S24] | Size-specific peeled lemon and fruit-segment portions. The recipe’s `1/2 lemon, thinly sliced` does not say peeled and cannot be assigned this value. | Do not map count to mass or treat 100 ml of cut pieces as juice. Recheck against CNF 2026. |
| CNF 2015: white grapefruit, half fruit 9.5 cm = 118 g edible; pink/red grapefruit, half fruit 9.5 cm = 123 g edible. Refuse differs (51% vs 49%). [S25–S26] | Separate color/product observations with peel, seeds, core, and membrane excluded. | Keep observations separate; no recipe use and no averaging. Recheck against CNF 2026. |
| CNF 2015: fresh orange juice 100 ml = 104.8 g; one 6.7 cm fruit yield = 86 g. [S27] | Specific raw orange-juice household portions, not a universal juice density or a fresh-fruit mass mapping. | Packet-only until checked against the 2026 file and matched to a juice product. |
| CNF 2015: “Tangerine (mandarin), raw” small / medium / large edible portions = 76 / 88 / 120 g, with size diameters. [S28] | Portion data for the exact CNF tangerine/mandarin row; not clementine or every mandarin cultivar. | Do not copy to mandarin or clementine identities. Recheck against CNF 2026. |
| UOG Extension: general citrus fruit contains 40–45% juice; for Guam calamansi, Key lime, and lemon fruit it gives about 45% juice yield by fruit weight. [S31] | Regional extension estimate; fruit quality varies, and extraction may be manual or mechanical. The publication does not qualify cultivar or provide a matching measured fruit-size distribution. | Retain as a Guam-specific lead only. No catalog yield or juice conversion. Do not apply it to other citrus or preservation safety. |
| MEXT composition table: green sudachi has separate raw-peel and fresh-juice foods, with composition reported per 100 g edible portion. [S19–S20] | Source-qualified food-form and composition evidence, not a count weight or mass-to-volume relation. | Supports keeping peel and juice products distinct; no density, form conversion, or portion map. |
| King Arthur test-kitchen weight chart lists lemon juice at 1 tbsp = 14 g and Key lime juice at 1 cup = 227 g. [S34] | Published kitchen portions, but the page does not state a measurement method or cup volume convention; Key lime is narrower than generic lime. | Research lead only. Do not derive g/ml or copy to general lemon/lime juice. |

Health Canada’s CNF search page says its searchable interface is the 2015 file and will not be updated; the 2026 dataset was released 2026-10-04. The linked 2026 `measure_weight_conversion.csv` was not accessible through the browser tool, so the 2015 pages above are explicitly prior-edition leads, not approved current values. Recheck the 2026 table before any conversion entry. [S29–S30]

### Substitution evidence reviewed

Online searches on 2026-10-09 covered lemon/lime/grapefruit swaps, yuzu and sudachi alternatives, calamansi juice alternatives, finger-lime garnish substitutes, kumquat and bergamot alternatives, and whether mandarin/clementine/tangerine are interchangeable. No authoritative source provided a reusable direction, amount basis, and product form for replacing any whole fruit in general use.

Two narrow culinary observations are relevant but do not justify catalog rules: Ricardo’s lemon-curd recipe says its juice and zest can use the citrus of choice (including lemon, lime, grapefruit, tangelo, blood orange, or a mixture) without giving a citrus-specific ratio; King Arthur’s test-kitchen icing suggests replacing the dairy liquid with lemon, orange, lime, or grapefruit juice and adjusting consistency, again without a fruit-to-fruit ratio. These are context-specific choices, not universal citrus equivalence. A recipe in the corpus also offers `vinegar or lime juice` on one unlinked line only. [S32–S33]

Disposition: keep automatic substitution arrays empty. Mark generalized citrus substitution as `blocked_pending_evidence` until an exact dish, ingredient form, amount basis, and reputable source are available. The surfaced aggregator claims of 1:1 yuzu/sudachi or calamansi substitutions were rejected because they provide no traceable test method or adequate scope. Do not substitute finger lime pearls with ordinary lime based on acidity alone; texture is part of the garnish use.

## Source register

All links were accessed on 2026-10-09. OQLF entries are terminology evidence, not density or substitution evidence.

| Proposed source ID | Source and locator | What it supports / limitation |
|---|---|---|
| `WP03-M-CITRUS-IDENTITY-20261009-S01` | OQLF, [agrume](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26526449/agrume), updated 2019 | Citrus-fruit category and named members; not a catalog of every citrus identity. |
| `WP03-M-CITRUS-IDENTITY-20261009-S02` | OQLF, [orange douce](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296997/orange-douce), 1990 | Sweet orange identity and note that unqualified orange commonly means this fruit. |
| `WP03-M-CITRUS-IDENTITY-20261009-S03` | OQLF, [citron](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366657/citron), 2001 | French citron / English lemon / *Citrus limon*. |
| `WP03-M-CITRUS-IDENTITY-20261009-S04` | OQLF, [lime](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366576/lime), 2017 | Québec terms including lime and citron vert; page’s botanical scope is *C. aurantifolia*. |
| `WP03-M-CITRUS-IDENTITY-20261009-S05` | OQLF, [mandarine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297121/mandarine), 1990 | French and English terms, *Citrus reticulata*, and named mandarin varieties. |
| `WP03-M-CITRUS-IDENTITY-20261009-S06` | OQLF, [clémentine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297120/clementine), 1990 | French/English name, mandarin × bitter-orange identity, and distinction from tangerine. |
| `WP03-M-CITRUS-IDENTITY-20261009-S07` | OQLF, [orange amère](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297107/orange-amere), 1990 | Bitter-orange names, including bigarade and Seville orange, and *C. aurantium*. |
| `WP03-M-CITRUS-IDENTITY-20261009-S08` | OQLF, [pomélo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506586/pomelo), updated 2024 | Grapefruit (*Citrus × paradisi*) and its overlapping French terms. |
| `WP03-M-CITRUS-IDENTITY-20261009-S09` | OQLF, [pamplemousse](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506588/pamplemousse), updated 2024 | True Asian pomelo (*C. maxima*), English pummelo/shaddock, and overlapping terms. |
| `WP03-M-CITRUS-IDENTITY-20261009-S10` | OQLF, [kumquat](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082819/kumquat), 1991 | French/English term, English spelling variant cumquat, and fruit/product note. |
| `WP03-M-CITRUS-IDENTITY-20261009-S11` | OQLF, [yuzu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/45749/yuzu), 2008 | Same French and English name; use of aromatic peel and juice. |
| `WP03-M-CITRUS-IDENTITY-20261009-S12` | OQLF, [cédrat](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366593/cedrat), 2001 | French cédrat / English citron and etrog spellings / *Citrus medica*. |
| `WP03-M-CITRUS-IDENTITY-20261009-S13` | OQLF, [bergamote](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297134/bergamote), 1990 | Bergamot fruit / *Citrus bergamia*; distinct from flavored tea or oil. |
| `WP03-M-CITRUS-IDENTITY-20261009-S14` | OQLF, [calamondin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084068/calamondin), 1990 | French/English term, older *Citrus mitis/madurensis* names, mandarin × kumquat description. |
| `WP03-M-CITRUS-IDENTITY-20261009-S15` | OQLF, [zeste](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497908/zeste), updated 2025 | Generic citrus-zest scope and distinction from the bitter white pith. |
| `WP03-M-CITRUS-IDENTITY-20261009-S16` | Philippine Department of Agriculture, [Calamansi or calamondin](https://ati2.da.gov.ph/ati-4b/content/sites/default/files/2022-12/calamansi_final.pdf), ATI booklet | Government food source uses both names for *Citrofortunella microcarpa* and documents culinary products; regional terminology, not Québec naming. |
| `WP03-M-CITRUS-IDENTITY-20261009-S17` | Philippine Council for Agriculture, Aquatic and Natural Resources Research and Development, [Citrus](https://ispweb.pcaarrd.dost.gov.ph/citrus/), citing PNS-BAFS 30:2005 | The Philippine standard covers fresh calamansi/calamondin from *Citrofortunella microcarpa*; excludes industrial processing. |
| `WP03-M-CITRUS-IDENTITY-20261009-S18` | MAFF, [Tokushima Sudachi GI summary](https://www.maff.go.jp/e/policies/intel/gi_act/register/s129.html), GI no. 129 | Sudachi as a registered agricultural fruit, its green harvest, aroma/acidity, and culinary garnish use. |
| `WP03-M-CITRUS-IDENTITY-20261009-S19` | MEXT, [Japanese Food Composition Tables: fresh sudachi juice](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=7_07079_7), 2023 expanded tables, item 07079 | Exact *Citrus sudachi* juice food record and 100 g edible-portion basis; not a conversion. |
| `WP03-M-CITRUS-IDENTITY-20261009-S20` | MEXT, [Japanese Food Composition Tables: raw sudachi peel](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=7_07078_7), 2023 expanded tables, item 07078 | Exact *C. sudachi* peel record, separate from juice; not a count or yield value. |
| `WP03-M-CITRUS-IDENTITY-20261009-S21` | NSW Department of Primary Industries and Regional Development, [Australian native finger limes growing guide](https://www.dpird.nsw.gov.au/agriculture/horticulture/citrus/content/manuals-guides/finger-limes), 2010 | *Citrus australasica* native range and commercial product identity. |
| `WP03-M-CITRUS-IDENTITY-20261009-S22` | Ricardo, [Huîtres et mignonnette à la lime et au gingembre](https://www.ricardocuisine.com/recettes/6963-huitres-et-mignonnette-a-la-lime-et-au-gingembre) | Québec French *lime caviar/citron-caviar*, English finger lime, and a source-specific 2-fruit garnish use; no mass conversion. |
| `WP03-M-CITRUS-IDENTITY-20261009-S23` | Health Canada CNF, [Orange, all commercial varieties, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1722), 2015 food code 1722 | Size-specific edible-portion and cut-section weights. |
| `WP03-M-CITRUS-IDENTITY-20261009-S24` | Health Canada CNF, [Lemon, raw, without peel](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1587), 2015 food code 1587 | Edible portion by fruit size, wedge, and cut-section measure; peeled form only. |
| `WP03-M-CITRUS-IDENTITY-20261009-S25` | Health Canada CNF, [Grapefruit, white, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1715), 2015 food code 1715 | Source-specific half-fruit edible weight and refuse. |
| `WP03-M-CITRUS-IDENTITY-20261009-S26` | Health Canada CNF, [Grapefruit, pink or red, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1562), 2015 food code 1562 | Separate color-specific half-fruit observation and refuse. |
| `WP03-M-CITRUS-IDENTITY-20261009-S27` | Health Canada CNF, [Orange juice, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1619&lang=fre), 2015 food code 1619 | Fresh orange-juice volume/mass and fruit-yield portions; prior CNF edition. |
| `WP03-M-CITRUS-IDENTITY-20261009-S28` | Health Canada CNF, [Tangerine (mandarin), raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=1623), 2015 food code 1623 | Edible portions for one exact tangerine/mandarin record, not every mandarin or clementine. |
| `WP03-M-CITRUS-IDENTITY-20261009-S29` | Health Canada, [Canadian Nutrient File 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=2), released 2026-10-04 | Confirms newer dataset and linked measure-weight resource; exact CSV row could not be fetched here. |
| `WP03-M-CITRUS-IDENTITY-20261009-S30` | Health Canada CNF, [search interface notice](https://food-nutrition.canada.ca/cnf-fce/newSearch) | States the searchable interface is the 2015 publication and will not be updated for 2026. |
| `WP03-M-CITRUS-IDENTITY-20261009-S31` | University of Guam CNAS Extension, [Preparing Shelf-Stable Citrus Juice and Drinks at Home](https://www.uog.edu/_resources/files/extension/publications/Citrus_Drink.pdf), FP-02, August 2016 | Guam citrus processing context and approximate juice-yield statement; method and fruit variability limit generalization. |
| `WP03-M-CITRUS-IDENTITY-20261009-S32` | Ricardo, [Lemon Curd](https://www.ricardocuisine.com/en/recipes/4594-lemon-curd----) | Sponsored recipe’s use of lemon/lime mix and contextual citrus choices; no per-fruit substitution ratio. |
| `WP03-M-CITRUS-IDENTITY-20261009-S33` | King Arthur Baking Test Kitchen, [Quick and Easy Icing](https://www.kingarthurbaking.com/recipes/quick-and-easy-icing-recipe) | Icing context allows several named citrus juices in place of dairy liquid; no citrus-to-citrus ratio. |
| `WP03-M-CITRUS-IDENTITY-20261009-S34` | King Arthur Baking Test Kitchen, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) | Source-published lemon-juice and Key-lime-juice portions; cup convention and measurement method are not specified on the chart. |

## Source-ID and identifier uniqueness audit

The proposed source IDs `WP03-M-CITRUS-IDENTITY-20261009-S01` through `-S34` are internally unique and none occurs among current ledger source entries. The 11 proposed new reference IDs (`ingredient-ref-mandarin`, `ingredient-ref-clementine`, `ingredient-ref-pomelo`, `ingredient-ref-kumquat`, `ingredient-ref-yuzu`, `ingredient-ref-sudachi`, `ingredient-ref-calamansi`, `ingredient-ref-citron-cedrat`, `ingredient-ref-bergamot`, `ingredient-ref-finger-lime`, and `ingredient-ref-bitter-orange`) are pairwise unique and absent from active and legacy IDs. The IDs for orange, lime, and grapefruit already exist as legacy candidates; `ingredient-ref-lemon` already exists as an active reference.

The French grapefruit/pomelo term overlap is an alias collision, not a duplicate identity. Preserve both biological/product identities and require explicit disambiguation for unqualified shared French terms.

## Remaining gaps

- Confirm the qualified fr-CA display treatment for grapefruit and true pomelo with an independent Québec reviewer; their OQLF terms overlap by design.
- Confirm whether the recipe-oriented lime identity should remain broad or whether a later source-backed batch should split Key/Mexican, Persian/Tahiti, sweet lime (*limette*), or another variety. Current recipe lines do not name a variety.
- Recheck all prior CNF 2015 portions against the released CNF 2026 measure-weight data before recording any value. The new linked CSV was not accessible in this research tool, so those observations remain prior-edition leads.
- Keep calamansi/calamondin synonymy under review as taxonomy references change; current food-standard sources support one Philippine food identity despite differing older botanical names.
- Keep citrus juice, zest, peel, pulp, concentrate, frozen, dried, preserved, candied, and extract products outside this identity tranche. No recipe row establishes general product forms or yields.
- No default density, count conversion, recipe-line substitution, or universal citrus substitution is supported here. Remaining contexts and measurement evidence need their own source-qualified review.
