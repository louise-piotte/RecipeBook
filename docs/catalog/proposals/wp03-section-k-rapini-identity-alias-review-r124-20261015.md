# WP03 Section K rapini identity and alias review (R124)

- **Reviewed:** 2026-10-15.
- **Status:** Integrated by root on 2026-10-15 as an identity-only reference with the reviewed aliases and source records. See the [R124 batch README](../batches/wp03-section-k-rapini-identity-integration-r124-20261015/README.md). The proposal's ownership snapshot below predates integration.
- **Scope:** One unresolved identity and bilingual alias boundary for rapini / broccoli rabe.
- **Recommendation:** Add one identity-only rapini reference. Use rapini as both the English and fr-CA display; add the OQLF-listed English aliases broccoli rabe and broccoli raab, and Metro's locally attested French alias brocoli italien. Keep brocoli-rave, Italian broccoli, turnip broccoli, Italian turnip, broccoletti, and Broccolini outside the aliases.
- **Source-ID prefix:** WP03-K-RAPINI-IDENTITY-20261015-R124-S; checked against the live ledger and earlier proposal/batch files before drafting.

## Recommendation

The Section K checklist still asks for additional leafy and regional brassica identities. The live catalog has separate ordinary broccoli, Chinese broccoli, baby broccoli, turnip, and turnip-greens references, but no rapini row. OQLF's Québec entry makes rapini the preferred French term and lists broccoli rabe and broccoli raab as English equivalents. A recent Metro Québec retail listing names a 1-bunch item Rapini; its listed promotion ended before this review. Metro's produce guide also calls rapini brocoli italien. This supports a distinct, narrowly named vegetable identity without folding it into ordinary broccoli, Chinese broccoli, turnip greens, or the Broccolini trademark.

| Proposed field | Recommendation |
|---|---|
| Reference ID | ingredient-ref-rapini |
| English display | rapini |
| fr-CA display | rapini |
| English aliases | broccoli rabe; broccoli raab |
| French aliases | brocoli italien |
| Category | VEGETABLE_AND_AROMATIC |

The English aliases are terminology-authority equivalents, not a claim that rapini is ordinary broccoli. The French alias is secondary retailer wording, not an OQLF-preferred term. Keep the displayed Québec name rapini.

## Current catalog and bundle audit

I read AGENTS.md, the global ingredient catalog plan and Section K checklist, recent WP03 Section K proposals and batch READMEs, current references and forms, the legacy candidate list, research ledger, manifest, and all manifest-listed recipe files. No exact active owner, form, legacy candidate, ledger identity, focused earlier proposal, or batch decision was found for rapini, broccoli rabe, broccoli raab, brocoli italien, or brocoli-rave. The active ordinary broccoli reference remains ingredient-ref-broccoli with the separate alias sprouting broccoli; adjacent Chinese broccoli, baby broccoli, turnip, and turnip greens remain separate.

The manifest-listed corpus has 114 recipes and 1,123 ingredient rows. None has a rapini, broccoli rabe, broccoli raab, brocoli italien, or brocoli-rave ingredient row, and no row links to a rapini reference. No bundled recipe link or direct bundled demand is proposed.

## Evidence and limits

OQLF's GDT entry names rapini as the preferred French term for an edible Mediterranean vegetable whose taste recalls broccoli, and gives broccoli rabe, broccoli raab, and rapini as English terms. The entry was last updated in 2004; it is authoritative Québec terminology evidence but not a current produce-availability record. Its listed Latin term Brassica rapa is broad botanical context, not a search alias. [S01]

CFIA's Brassica rapa overview places rapini in its rapifera group and separately names turnip broccoli / Italian turnip under ruvo. Health Canada's crop-group table also lists broccoli raab (rapini) as a commodity apart from ordinary broccoli, though it reproduces older crop-group and botanical labels. These government sources support keeping the food identity distinct while warning against turning every adjacent botanical group name into an alias. They do not establish a cooking substitution. [S02–S03]

Metro's Québec produce guide says rapini is also called brocoli italien. Treat this as source-attested local wording only: it does not outrank OQLF's preferred rapini display. Recent Metro French and English retail listings identify the product as Rapini / Rapini and show a 1-bunch unit. The French listing's displayed promotion ended on 2026-09-09, before this review; the pages support recent product naming and unit wording, not proof of today's stock, price, or bunch mass. [S04–S06]

Recettes du Québec has a 2011 recipe titled Rapini (brocoli-rave), while its ingredient list asks for one package of fresh rapini. This is a useful Québec recipe-language observation, but one community recipe is not enough to prefer brocoli-rave over OQLF's rapini or to make the spelling an automatic alias. Metro's 2014 recipe lists rapini without a quantity. Neither recipe provides a standardized package weight or a rapini replacement. [S09–S10]

## Picker projection

The projection follows the app's complete-phrase-first search in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The results below are a source-code-equivalent static projection, not live picker QA.

| Query | Current results | With the proposed row | Decision |
|---|---|---|---|
| rapini | 0 | 1: rapini | Add the bilingual display name. |
| broccoli rabe; broccoli raab | 0 | 1: rapini | Add these exact OQLF-listed English equivalents. |
| brocoli italien | 0 | 1: rapini | Add the Metro-attested French alias; retain rapini as display. |
| brocoli-rave | 0 | 0 | Keep unassigned; only one older community recipe title was found. |
| broccoli | 3: broccoli, Chinese broccoli, baby broccoli | 4: those three plus rapini | The qualified aliases add one expected choice to an already broad query. Do not add bare broccoli. |
| brocoli | 2: brocoli, brocoli chinois | 3: those two plus rapini | The French alias adds one expected choice to this broad query. Do not add bare brocoli. |
| rabe | 7 crab-related references, due partial matching within crabe | 1: rapini | The proposed broccoli rabe alias creates a complete-word match, which takes precedence over substring fallback. No separate rabe alias is needed. |
| turnip; turnip greens; navet; feuilles de navet | Existing turnip / turnip-greens results | Unchanged | Keep root turnip and leafy turnip greens separate from rapini. |
| Italian broccoli; turnip broccoli; Italian turnip; broccoletti; Broccolini | No rapini result | No rapini result | Keep these terms outside the row. |

The broad broccoli and brocoli queries each gain one result: the English query goes from three broccoli-qualified references to four, and the French query goes from two to three. Full qualified phrases resolve to rapini. The query rabe currently falls back to seven references because it is a substring of crabe; after adding the complete broccoli rabe term, the app's complete-word-phrase pass returns rapini alone before substring fallback.

## Recipe, portion, form, and substitution boundary

The external Québec recipes confirm that cooks use rapini in Italian-style pasta and salad dishes. They do not create bundled demand or justify a recipe link. The Recettes du Québec recipe's one-package quantity has no package weight; Metro's recipe leaves the amount unstated.

Health Canada's online CNF serving page is for the 2015 publication and labels food code 5411 as cooked broccoli raab (rapini). It lists 1 bunch as 437 g and cooked volume portions of 100 mL = 52.8 g, 125 mL = 66.0 g, and 250 mL = 132.1 g. These are useful source-specific leads, not measurements for the fresh Metro bunch. The volume portions do not state a cut or packing method, and the current CNF page points users to a separate 2026 dataset while retaining the 2015 interface as an interim reference. Recheck the newer dataset before storing any value. [S07–S08]

| Behavior | Recommendation |
|---|---|
| Density | None. Do not infer a reusable density from cooked CNF volume portions. |
| Forms | None. The reviewed raw retail identity and cooked CNF record do not establish a reusable raw-to-cooked form conversion. |
| Unit mappings or conversions | None. Do not map a Metro bunch to weight or activate the older CNF cooked measures. |
| Yield or refuse | None. The cooked CNF record's zero-refuse value is not a raw preparation-yield factor. |
| Substitution | None. A flavor resemblance to broccoli is not a substitution rule; no recipe supplies an alternative or ratio. |
| Recipe links | None. The bundled corpus has no matching line. |

## Source register

| Source ID | Source | Evidence used and limits |
|---|---|---|
| WP03-K-RAPINI-IDENTITY-20261015-R124-S01 | Office québécois de la langue française, [GDT: rapini](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357175/rapini), updated 2004. | Preferred French term rapini; English terms broccoli rabe, broccoli raab, and rapini; defines it as an edible vegetable distinct from ordinary broccoli by saying its taste recalls broccoli. Dated terminology record, not current market evidence. |
| WP03-K-RAPINI-IDENTITY-20261015-R124-S02 | Canadian Food Inspection Agency, [The Biology of Brassica rapa L.](https://inspection.canada.ca/en/plant-varieties/plants-novel-traits/applicants/directive-94-08/biology-documents/brassica-rapa). | Places rapini in rapifera and turnip broccoli / Italian turnip in ruvo. Official biological overview; its cited taxonomy is not a consumer naming standard. |
| WP03-K-RAPINI-IDENTITY-20261015-R124-S03 | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html). | Lists broccoli raab (rapini) as a separate commodity from ordinary broccoli in the original crop group table. The table also presents legacy classifications; use it for commodity separation, not current taxonomy or recipe equivalence. |
| WP03-K-RAPINI-IDENTITY-20261015-R124-S04 | Metro Québec, [Tout sur les légumes fleurs](https://www.metro.ca/produits-a-decouvrir/fruits-et-legumes/nos-fruits-legumes-et-fines-herbes/legumes-fleurs). | French produce guide calls rapini brocoli italien and describes its edible leaves, stems, and flower buds. Retailer culinary copy, not a terminology ruling or current product offer. |
| WP03-K-RAPINI-IDENTITY-20261015-R124-S05 | Metro Québec, [Rapini Andy Boy](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/brocolis-choux-et-choux-fleurs/rapini/p/4547). | Product listing uses Rapini and 1 botte; displayed promotion ended 2026-09-09. Retail wording and listed unit only, not current price or bunch mass. |
| WP03-K-RAPINI-IDENTITY-20261015-R124-S06 | Metro Canada, [Andy Boy Rapini](https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/broccoli-cauliflower-cabbage/rapini/p/4547). | English product listing uses Rapini and one bunch for product 4547. Retail wording only; it does not establish a weight or Canadian-grown origin. |
| WP03-K-RAPINI-IDENTITY-20261015-R124-S07 | Health Canada, [CNF serving size: broccoli raab (rapini), cooked](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=5411), food code 5411, 2015 interface. | Lists one bunch = 437 g and cooked volume portions 100/125/250 mL = 52.8/66.0/132.1 g. State-specific published values; not a fresh-bunch conversion, density, or verified current-CNF record. |
| WP03-K-RAPINI-IDENTITY-20261015-R124-S08 | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), page dated 2026-06-19. | Describes the 2026 CNF dataset and notes the 2015 online interface remains accessible as an interim measure. Supports the version caveat, not a rapini measure. |
| WP03-K-RAPINI-IDENTITY-20261015-R124-S09 | Metro, [Salade de fenouil, rapini & canard confit](https://api.metro.ca/recettes-et-occasions/recettes/salade-de-fenouil-rapini-canard-confit), dated 2014-11-13. | Québec recipe lists rapini with no amount. Recipe-specific ingredient usage only. |
| WP03-K-RAPINI-IDENTITY-20261015-R124-S10 | Recettes du Québec, [Rapini (brocoli-rave)](https://www.recettes.qc.ca/recettes/recette/rapini-brocoli-rave-215927), dated 2011-03-03. | Québec recipe title uses brocoli-rave and requests one package of fresh rapini for six portions. Community recipe wording and an unweighted package observation only. |

## Static review record

The live snapshot at the final read-only recheck on 2026-10-15 has 1,470 active references, 105 forms, 63 legacy candidates, 1,811 ledger records / 7,482 source entries / 6,360 distinct source IDs, and 114 manifest-listed recipes / 1,123 ingredient rows. The recipe-corpus digest is 75c7b6d7cd99fd7eee849be3a49970dc2aac5a92f2c3192a8bf80f75e785973f.

The proposed source-ID prefix was unused in the ledger and earlier proposal/batch files. Static checks covered exact candidate ownership, the complete-phrase picker projection, recipe-row demand, UTF-8 without BOM, final newline, trailing whitespace, and local Markdown links. No app, Gradle, instrumentation, emulator, or deployment tests were run for this proposal-only review.

## Integration disposition

Integrated identity-only `ingredient-ref-rapini` as `rapini / rapini`. Added English aliases `broccoli rabe` and `broccoli raab`, plus French alias `brocoli italien`; broader broccoli, turnip, `brocoli-rave`, and Broccolini terms remain excluded. No measures, forms, mappings, recipe links, conversions, yields, or substitutions were added. Package totals are 1,471 references, 105 forms, and 1,812 ledger records / 7,492 source entries / 6,370 distinct source IDs. See the [integration record](../batches/wp03-section-k-rapini-identity-integration-r124-20261015/README.md).
