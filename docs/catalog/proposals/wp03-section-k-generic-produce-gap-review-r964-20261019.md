# WP03 Section K — New Zealand spinach identity review (R964)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one generic leafy-green identity for the edible leaves of *Tetragonia tetragonioides* (Pall.) Kuntze.
- **Scope:** Generic culinary ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.
- **Plan anchor:** The broader Section K leafy-green and brassica sweep remains open ([catalog plan, line 6553](../../RecipeBook-global-ingredient-catalog-plan.txt#L6553)).
- **Mutation scope:** Proposal only. No catalog, ledger, recipe, plan, workflow, or roadmap file is changed.

## Recommendation

Add `ingredient-ref-new-zealand-spinach` as a generic leafy-green identity for the culinary leaves of *Tetragonia tetragonioides*. The Office québécois de la langue française (OQLF) pairs `New Zealand spinach` with `tétragone`, identifies this species, and states that only the fleshy, ribbed, triangular leaves are edible. Its French entry lists the names proposed below and describes the leaves as prepared like spinach. The 2023 *Gazette officielle du Québec* independently lists `Épinard de Nouvelle-Zélande — Tetragonia tetragonioides` among field vegetables. Utah State University Extension and the Plant Resources of Tropical Africa (PROTA) account describe its leafy culinary use. [S01–S05]

Use the OQLF display pair `New Zealand spinach / tétragone`. Add only the OQLF's species-specific French names as aliases: `épinard de la Nouvelle-Zélande`, `épinard de Nouvelle-Zélande`, `tétragone cornue`, and `tétragone étalée`. Keep `épinard d'été` out of aliases because that seasonal wording is less distinguishing; keep English `tetragonia` out because it can read as the wider genus. Do not alias bare `spinach / épinard`, botanical names, `Warrigal greens`, or `warrigal cabbage` to this identity.

Scope the identity to correctly identified food-grown *T. tetragonioides* leaves. Do not include the seed-bearing fruit, other *Tetragonia* species, or shoots as a separate part. Keep it distinct from ordinary spinach (*Spinacia oleracea*), Malabar spinach, water spinach, and garden orach. OQLF's comparison to spinach supports similar preparation; it does not establish a transferable substitution rule.

## Proposed minimal data

```json
{
  "id": "ingredient-ref-new-zealand-spinach",
  "nameEn": "New Zealand spinach",
  "nameFr": "tétragone",
  "aliasesEn": [],
  "aliasesFr": [
    "épinard de la Nouvelle-Zélande",
    "épinard de Nouvelle-Zélande",
    "tétragone cornue",
    "tétragone étalée"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

No form, conversion, yield, or recipe link is proposed. The English spelling follows OQLF; the Gazette spelling without the article is retained as a French alias. The OQLF entry dates to 1991, and the Gazette's regulatory list supports Québec-facing terminology and species pairing, not current retail availability.

## Ownership and neighboring identities

The refreshed package snapshot after R960–R962 contains **1,981 active ingredient references** and **205 forms**; the legacy import file has **55 candidates**; the research ledger has **2,386 records**; and the recipe package has **114 files**. Accent-folded scans of reference IDs, names and aliases; form IDs, labels and match terms; all legacy candidates; and ledger IDs, source URLs, and decisions found no owner for the proposed ID, *Tetragonia tetragonioides*, *Tetragonia expansa*, `New Zealand spinach`, `tétragone`, or the proposed French aliases. No form, legacy candidate, or ledger identity owns this plant part. The R964 source-ID prefix is absent from the live ledger. Four of the five source URLs below are also absent. The Gazette PDF URL is already recorded as `WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S10` under `ingredient-ref-snake-gourd`, with a locator for p. 6325 and a decision about `melon serpent`; this proposal cites its separate p. 6323 row. Preserve that source record and its scope unchanged ([research ledger](../research-ledger.v1.json)).

The **2,167-file proposal archive** was searched for the candidate name and taxon. The R873 garden-orach review and its integration README mention New Zealand spinach only as a neighboring leafy-green identity to keep distinct; neither owns or proposes this identity. The archive scan found no prior focused New Zealand-spinach proposal. The R958 cauliflower-leaves row was rechecked and excluded, as was the separate R961 proposal-only nettle-leaves candidate.

| Existing identity or evidence | Boundary to preserve |
|---|---|
| Ordinary spinach and `ingredient-ref-baby-spinach` | Keep *Spinacia oleracea* separate. Do not alias the unqualified spinach name to *Tetragonia*. |
| Malabar spinach, water spinach, and garden orach | These are separate crops and existing references; the R873 review explicitly treats New Zealand spinach as distinct. Do not merge or transfer their evidence. |
| Cauliflower leaves, integrated at R958; stinging nettle leaves, proposed at R961 | Excluded from this review's candidate selection. Preserve their rows, proposals, and source-scoped evidence. |
| OQLF `tétragone` entry and the 2023 Québec Gazette crop list | The OQLF source URL has no current ledger owner. The Gazette URL is already owned under snake gourd for a different locator and claim; do not transfer or revise that evidence. If the p. 6323 entry is added to the new ledger record, keep its locator and support distinct from the existing p. 6325 entry. |

The open Section K checklist calls for continued leafy-green, brassica, shoot, and plant-part discovery. Its Broccolini trademark note is an alias exclusion, not a queued commercial-product roster. No roster-only task was encountered in the reviewed K lane. If one is separately queued, mark it out of scope because commercial-product counts do not add ingredient diversity, then stop that line. Existing branded entries and product-specific claims remain untouched.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for the proposed name, French names and accent-folded variants, *T. tetragonioides*, *T. expansa*, `warrigal greens`, and `warrigal cabbage`. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe line, amount, recipe link, or relink is proposed. The external sources establish a documented generic culinary identity, not demand in the bundled corpus.

## Measurements and proposed ledger state

If accepted, create one `ingredient_reference` ledger record keyed to `ingredient-ref-new-zealand-spinach` with:

- `identityState: verified`;
- `measurementState: researched_supported` for Health Canada's source-specific raw-food-code observations;
- `substitutionResearchState: blocked_pending_evidence` for the broad, direction-specific cooking replacement statement discussed below;
- sources S01–S05, with no measurements inferred from sources other than S03;
- no default density, unit mapping, form, conversion, yield rule, or recipe link.

Health Canada's Canadian Nutrient File (CNF), Food Code 2132 (`New Zealand spinach, raw`), reports `100 mL chopped = 23.7 g` and `250 mL chopped = 59.2 g`. If ledger observations are recorded, keep them as separate `portion_weight` observations for this exact CNF food entry and raw chopped state, with packing and chop method unstated. They do not establish a generic density or active unit mapping. CNF also reports 28% total refuse, identified as large stems and roots; keep that percentage tied to Food Code 2132 and do not activate a general edible-portion yield. [S03]

PROTA's entry reports a separate historical food-composition basis of 100 g edible portion after 20% waste, citing USDA 2002. This differs from CNF's refuse figure and does not provide a matching preparation or measurement method. Preserve the values source-scoped; do not reconcile them into one yield or density. [S05]

Proposed observation identifiers, if the two CNF portions are included in the ledger:

- `new-zealand-spinach-cnf-2132-100ml-chopped-r964-20261019` — `portion_weight`, source quantity 100 mL, observed mass 23.7 g, raw and chopped, `published_portion`, source S03.
- `new-zealand-spinach-cnf-2132-250ml-chopped-r964-20261019` — `portion_weight`, source quantity 250 mL, observed mass 59.2 g, raw and chopped, `published_portion`, source S03.

Neither CNF portion is a direct kitchen measurement, a packing standard, or a claim about any retail product. The CNF source page is dated 2019-03-01.

## Bounded substitution review and plant-part caution

Section 08 online searches on 2026-10-19 included `Tetragonia tetragonioides New Zealand spinach replace spinach recipe quantity`, `"New Zealand spinach" "spinach" substitute recipe ratio`, and `site:extension.usu.edu "New Zealand spinach" spinach recipe`. OQLF says the leaves are prepared the same way as spinach, and USU describes the crop as a warm-season alternative; neither supplies a recipe-specific ratio. PROTA says the crop has been grown as a substitute for ordinary spinach, and separately says New Zealand spinach may be replaced in cooking by mild neutral leafy vegetables, including spinach, amaranth, and Swiss chard. The former is crop-history context, while the latter is a broad cooking statement in the direction **New Zealand spinach → other greens**. Neither establishes a dish role, precise form, amount basis, or adjustments for a runtime rule. [S01, S04–S05]

If recorded, add one ledger finding with `findingId: new-zealand-spinach-broad-cooking-replacements-r964-20261019`, `researchState: blocked_pending_evidence`, and `fromIngredientRefId: ingredient-ref-new-zealand-spinach`. Keep its context and basis tied to PROTA S05's named cooking replacements and the searches above. Its limitations are the missing dish role, form, quantitative ratio, and adjustment evidence; PROTA's separate `grown as a substitute` crop-history wording does not provide those recipe details. Do not add accepted `replacements`, an active contextual rule, or a recipe-line substitution link in either direction. USU's phrase `warm-season alternative` is gardening context, not a recipe equivalence; the OQLF's preparation comparison is not itself a substitution. [S01, S04–S05]

For handling, OQLF's English note limits the edible part to leaves. USU says it recommends blanching the leaves for three minutes, discarding the water, and refreshing them in ice water because it describes the plant as high in oxalates; the same page also says that many eat it raw in salads. PROTA separately discourages raw use based on a high-saponin statement. Preserve these as claims scoped to their respective sources and dates. They are not reconciled here into a general preparation instruction, safety threshold, serving limit, or foraging-identification guarantee. [S01, S04–S05]

## Sources

The sources below were opened 2026-10-19. IDs are proposal-local and have not been added to the shared ledger.

| Source ID | Source | Support and limits |
|---|---|---|
| `WP03-K-NEW-ZEALAND-SPINACH-R964-20261019-S01` | Office québécois de la langue française, [tétragone (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082626/tetragone), last updated 1991 | Pairs `New Zealand spinach` with `tétragone` and *Tetragonia tetragonioides*; lists French terms `épinard de la Nouvelle-Zélande`, `épinard d'été`, `tétragone cornue`, and `tétragone étalée`; describes the fleshy leaves and says they are prepared like spinach. The English note says only the leaves can be eaten. This is a terminology entry, not evidence of current retail availability or a transferable substitution. |
| `WP03-K-NEW-ZEALAND-SPINACH-R964-20261019-S02` | *Gazette officielle du Québec*, [2023 field-vegetable list (PDF)](https://www.publicationsduquebec.gouv.qc.ca/fileadmin/gazette/pdf_encrypte/lois_reglements/2023F/82132.pdf), Appendix I, p. 6323 (PDF page 5 of 10) | Lists `Épinard de Nouvelle-Zélande` with *Tetragonia tetragonioides*. Supports a Québec-facing French name and species pairing in that regulation's field-vegetable list; does not establish current marketplace stock or household use. The PDF URL is already recorded under `ingredient-ref-snake-gourd` as source `WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S10`, but that record's locator is p. 6325 and its support concerns `melon serpent`. Do not transfer or alter that record; this proposal's p. 6323 claim needs its own page-specific source scope if put in the ledger. |
| `WP03-K-NEW-ZEALAND-SPINACH-R964-20261019-S03` | Health Canada, [Canadian Nutrient File serving size, Food Code 2132](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2132), page details dated 2019-03-01 | Identifies raw New Zealand spinach and gives the 100 mL and 250 mL chopped portions, observed masses, and 28% refuse. Retain these only for this food-code entry and stated raw/chopped basis; no generic density, mapping, or yield is inferred. |
| `WP03-K-NEW-ZEALAND-SPINACH-R964-20261019-S04` | Utah State University Extension, [How to Grow New Zealand Spinach in Your Garden](https://extension.usu.edu/yardandgarden/research/new-zealand-spinach-in-the-garden), peer-reviewed fact sheet, published April 2020 | Supports *Tetragonia tetragonioides*, use of young leaves and tips raw or cooked, and the page-specific oxalate/blanching statement. The page's raw-salad and blanching statements are both retained as source-specific claims, not general safety advice. Its gardening description as a warm-season alternative does not establish recipe substitution. |
| `WP03-K-NEW-ZEALAND-SPINACH-R964-20261019-S05` | G.J.H. Grubben, 2004, [*Tetragonia tetragonioides* (PROTA)](https://plantuse.plantnet.org/en/Tetragonia_tetragonioides_%28PROTA%29), Plant Resources of Tropical Africa / Pl@ntUse | Describes the species as a cooked leafy vegetable, notes tender tips also eaten raw in salads in the United States, gives the broad cooking replacement direction recorded above, and supplies a historical composition basis citing USDA 2002. It reports distinct use and waste bases that are not transferred as a generic measure or safety claim; geographic descriptions do not establish Québec availability. |

## Link, encoding, and whitespace checks

- The relative catalog-plan link resolves to `docs/RecipeBook-global-ingredient-catalog-plan.txt`; its line target is the open Section K checklist.
- The OQLF, Québec Gazette PDF, Health Canada CNF, USU Extension, and PROTA links were opened and resolved during this review.
- The proposal was saved as UTF-8 without BOM, with a final newline and no trailing whitespace. No software tests were run because this is proposal-only research.

## Disposition

Recommend one `VEGETABLE_AND_AROMATIC` identity, `New Zealand spinach / tétragone`, scoped to leaves of *Tetragonia tetragonioides*, with only the four OQLF-supported French aliases listed above. Preserve all existing rows and source ownership. If integrated, retain the two CNF chopped portions as exact source observations; keep the broad cooking-replacement finding `blocked_pending_evidence`; and add no active substitution, form, density, unit mapping, yield, conversion, or recipe link. Section K's wider plant-food sweep remains open.
