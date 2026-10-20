# WP04 Section P: Lingcod / morue-lingue picker-boundary review

- **Review and source-access date:** 2026-10-12.
- **Status:** Proposal only. The species identity and bilingual name pair are source-verified. Hold the active catalog row until the broader `ling` / `ling cod` query boundary is reviewed.
- **Disposition:** Do not add an active reference, legacy candidate, ledger identity record, form, recipe link, measurement, conversion, density, or substitution in this pass.

## Decision

The candidate identity is verifiable as *Ophiodon elongatus*. OQLF gives Québec French **morue-lingue**, English **lingcod** and **ling cod**, and the Latin name. The CFIA Fish List independently pairs *O. elongatus* with **Lingcod / Morue-lingue**. DFO identifies lingcod as a northeastern Pacific food fish with a Canadian commercial fishery and explicitly says it is not a true cod [S01–S03].

Keep the source-verified identity out of the active picker for now. The spaced English spelling **ling cod** is not species-exclusive: Government of Canada TERMIUM Plus says it is also used for *Molva molva*, whose CFIA Fish List names include **Ling / lingue**. In the current picker, promoting `ling cod` as an alias makes a broad `ling` query return only the lingcod candidate, and makes `ling cod` return only *O. elongatus*, hiding that documented name overlap [S04–S05].

Do not promote `ling cod` or shorter `ling` as aliases. The identity itself remains distinct from Atlantic cod, Pacific cod, salt cod, sablefish, cusk, burbot, stockfish, and Pacific hake. DFO’s statement that lingcod is not a true cod rules out treating its name as evidence that it is a cod species or a general cod substitute. The Section P finfish review remains open; this is a separate regional finfish boundary and does not reopen the Pacific-cod or John-Dory decisions.

## Search boundary and exact-term decisions

The current picker normalizes case, accents, punctuation, and spacing. It first returns complete normalized word-phrase matches across all references and forms; it falls back to substring matches only when no complete phrase matches. This behavior is implemented in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

The live 1,300-reference catalog has no exact owner for **lingcod**, **ling cod**, **morue-lingue**, **morue lingue**, *Ophiodon elongatus*, or the prospective key `ingredient-ref-lingcod`. A projection of the current search rules gives the following results for one hypothetical display-only row named `lingcod / morue-lingue`:

| Query | Current live results | With display pair only | With OQLF `ling cod` alias | Decision |
|---|---|---|---|---|
| `lingcod` | None | Candidate only | Candidate only | Source-specific result, but hold the row pending resolution of the alternate spelling. |
| `morue-lingue` / `morue lingue` | None | Candidate only | Candidate only | Source-specific French phrase. |
| `ling cod` | None | None | Candidate only | Alias would imply this phrase is unique to *O. elongatus*, although TERMIUM also assigns it to *M. molva*. Do not promote. |
| `ling` | Four substring results: lingonberry, pearl onion, poppy-seed filling, sparkling water | Those four plus the candidate via substring fallback | Candidate only, because the complete word in the alias takes priority over all fallback results | Broad query would falsely appear species-specific if the alias is added. Hold. |
| `cod` | Four complete-phrase results: Atlantic cod, Pacific cod, sablefish, salt cod | Same four; `lingcod` is one word and adds no complete `cod` phrase | Same four plus lingcod | Do not attach the spaced alias; DFO says lingcod is not a true cod. |
| `morue` | Atlantic cod, Pacific cod, sablefish, salt cod | Same four plus lingcod / morue-lingue | Same four plus lingcod / morue-lingue | The French broad term already returns multiple identities; it does not distinguish the candidate. |

The exact search findings are based on current display names, aliases, and form search terms. A candidate without the spaced alias would not answer a literal `ling cod` query. Including the source-attested spelling would create the false single-result behavior described above, so the row and the alias should remain unallocated until picker behavior can preserve or clearly communicate both name scopes. Do not change or infer ownership of the separate *Molva molva* identity in this proposal.

## Conditional catalog shape

This block records the prospective species row only; it is not active data, and the ID is not reserved by this proposal. The source-attested spelling `ling cod` is intentionally absent from the aliases pending the picker/name-boundary review.

    {
      "id": "ingredient-ref-lingcod",
      "nameFr": "morue-lingue",
      "nameEn": "lingcod",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-12T00:00:00Z",
      "category": "PROTEIN"
    }

No form, recipe link, numeric conversion, yield, or substitution is proposed. The binomial belongs in source evidence, not as an additional user-facing search alias in this hold.

## Exact-key and neighboring-owner audit

The audit checked exact normalized terms, candidate IDs, and scientific names in the active reference displays/aliases, active form labels/match terms, legacy candidate fields, and ledger fields. It also searched recent Section P proposals, batches, the Section P checklist, the roadmap, and the generated catalog for an earlier lingcod allocation. No exact species owner or prior lingcod proposal was found.

Current adjacent active identities include:

| Active owner | Stored display / relevant terms | Boundary |
|---|---|---|
| `ingredient-ref-atlantic-cod` | Atlantic cod / morue de l’Atlantique | *Gadus morhua*, separate from *Ophiodon elongatus*. |
| `ingredient-ref-pacific-cod` | Pacific cod / morue du Pacifique; aliases `gray cod`, `grey cod` | *Gadus macrocephalus*, separate from lingcod. |
| `ingredient-ref-salt-cod` | salt cod / morue salée | Preserved product identity; not a species alias. |
| `ingredient-ref-sablefish` | sablefish / morue charbonnière; aliases `black cod`, `morue noire` | *Anoplopoma fimbria*, separate despite market “cod” names. |
| `ingredient-ref-cusk`, `ingredient-ref-burbot`, `ingredient-ref-stockfish` | cusk / brosme, burbot / lotte, stockfish / stockfish | Distinct fish identities or preserved fish product. |

The current exact `cod` and `morue` picker results each contain the four owners listed for Atlantic cod, Pacific cod, salt cod, and sablefish. The exact `ling` result is empty, so the picker uses substring fallback and returns four unrelated pantry terms. The hypothetical row and alias projection above follows the current complete-phrase-first behavior; it is not a UI or runtime test.

## Recipe and package-demand audit

The live package manifest lists **114 recipe files** and **1,123 ingredient rows**. A scan of every manifest-listed recipe JSON and ingredient row found zero references to **lingcod**, **ling cod**, **morue-lingue**, **morue lingue**, or *Ophiodon elongatus*. The same row scan found zero broad **cod**, **morue**, **hake**, or **merluche** ingredient lines, so there is no bundled cod recipe line that could motivate a link or a substitution.

The seafood-related ingredient rows are Jumbo Lump crab meat (019#8), sliced calamari (023#1), salmon fillets (077#10), the unlinked generic wording “cooked meat or seafood, to taste” (093#4), fish sauce (093#6 and 095#5), and a tuna steak (111#1). None is a lingcod request or supports a lingcod measure, form, or substitution. The corpus provides no recipe-derived demand for this candidate.

## Forms, measurements, conversions, and substitutions

- Health Canada’s CNF raw lingcod entry (food code 3020) reports **100 g edible portion**, **one 2,200 g fish = 748.9 g edible portion**, a **90 g food-guide serving**, and **66% total refuse**. These are source-specific values for that raw-fish entry, not a package amount, recipe portion, default yield, or general whole-fish conversion [S06].
- The baked-or-broiled CNF entry (food code 3146) reports **100 mL flaked = 57.5 g**, **250 mL = 143.7 g**, a **75 g food-guide serving**, **half a fillet = 151 g**, and **66% total refuse**. These observations apply to that prepared-food entry and cannot be transferred to raw fillets or another package [S07]. Neither CNF entry supports a default density or generic cup mapping.
- A Toronto fish-market listing uses both `lingcod` and `ling cod`, describes fresh and frozen fillets, and sells by pound. This is one vendor’s product and ordering practice, not a universal form, stable package size, or Québec-wide availability claim [S08]. No form row is proposed.
- DFO states that lingcod is not a true cod. The vendor’s flavor comparison to cod or halibut is not a validated recipe substitution. No global cod-to-lingcod conversion, contextual substitution, yield, density, or unit mapping is supported [S02, S08].

## Current ownership snapshot

Read-only audit on 2026-10-12:

| Artifact | Live count | Candidate-specific result |
|---|---:|---|
| `ingredient-references.v1.json` | 1,300 references | No exact species term or candidate-ID owner. |
| `ingredient-forms.v1.json` | 98 forms | No exact species label, match-term, or candidate-ID owner. |
| `legacy-import-identities.v1.json` | 64 candidates | No normalized full-field match for the candidate names, IDs, or binomial. |
| `research-ledger.v1.json` | 1,608 records | No normalized full-field match for the candidate identity or IDs. |
| `manifest.v1.json` and listed recipes | 114 recipe paths; 1,123 ingredient rows | No candidate-name, binomial, or cod/morue/hake/merluche ingredient-row hit. |

Counts describe the read-only worktree snapshot during this review and may change as other catalog batches are integrated. The proposal adds no source record to the ledger.

## Static validation performed

- Checked exact normalized candidate labels, aliases, IDs, and binomial against active references, forms, legacy candidates, ledger fields, recent Section P reviews, and generated catalog ownership.
- Scanned every manifest-listed recipe JSON and all ingredient rows for candidate terms and broad cod-family wording; the read-only audit found no matching candidate or cod-family rows.
- Projected the current phrase-first / substring-fallback picker rules using active reference and form terms, then compared the hypothetical display-only row with the OQLF spaced alias. No app or UI test was run.
- Verified this proposal as UTF-8 without a BOM, with no trailing whitespace or mojibake markers.

No tests or emulator checks were run; this is a proposal-only review and makes no database JSON change.

## Sources

Sources were accessed on 2026-10-12. The source IDs are local to this proposal and are not ledger additions.

| Source ID | Source | Evidence and limits |
|---|---|---|
| WP04-LINGCOD-BOUNDARY-20261012-S01 | Office québécois de la langue française, [morue-lingue (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198991/morue-lingue) | In zoology/ichthyology and edible-fish terminology, gives preferred Québec French `morue-lingue`, English `lingcod` and `ling cod`, and *Ophiodon elongatus*. Its “commercial potential in Québec” note is not proof of current stock. The entry was last updated in 2011; it rejects Europe/France labels `rascasse verte` and `abadèche lingue` for Québec fish-product terminology. |
| WP04-LINGCOD-BOUNDARY-20261012-S02 | Fisheries and Oceans Canada, [Lingcod species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/lingcod-morue-lingue-eng.html) | Identifies *O. elongatus* as a northeastern Pacific groundfish and records a Canadian commercial fishery. It explicitly says lingcod is not a true cod. Fishery/species evidence does not establish a recipe substitution or kitchen measure. |
| WP04-LINGCOD-BOUNDARY-20261012-S03 | CFIA, [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | The searchable Fish List row pairs *O. elongatus* with `Lingcod / Morue-lingue`; its *Molva molva* row pairs `Ling / lingue`. The overview explains the list supplies acceptable English and French common names and scientific names for Canadian fish labelling. Labelling identity is not recipe equivalence. |
| WP04-LINGCOD-BOUNDARY-20261012-S04 | Government of Canada TERMIUM Plus, [LING COD query](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=1&i=&index=enb&lang=eng&sg_kp_wet=448504&srchtxt=LING+COD) | Its entry says `ling cod` is a common name also used for *Molva molva*; a separate `ling` query notes other species using that name. This is direct evidence that the OQLF spelling is not taxon-exclusive. The query page was accessible in search results but did not open in the browser cache during this review. |
| WP04-LINGCOD-BOUNDARY-20261012-S05 | Department of Justice Canada, [Atlantic Fishery Regulations, 1985](https://laws-lois.justice.gc.ca/eng/regulations/SOR-86-21/page-9.html) | Lists `Ling (European)` as *Molva molva*, corroborating the second taxon behind the term collision. Regulatory species naming is not a recipe or product-form source. |
| WP04-LINGCOD-BOUNDARY-20261012-S06 | Health Canada, [CNF serving size: Fish, lingcod, raw (food code 3020)](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3020) | Reports raw-fish edible portion and refuse observations summarized above. The values are specific to the CNF entry and do not establish a catalog default or package conversion. |
| WP04-LINGCOD-BOUNDARY-20261012-S07 | Health Canada, [CNF serving size: Fish, lingcod, baked or broiled (food code 3146)](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3146) | Reports flaked volume, serving and half-fillet observations summarized above. The entry is prepared fish; do not use it for raw product conversions or a default density. |
| WP04-LINGCOD-BOUNDARY-20261012-S08 | Anchor Fish Market, [Ling Cod Fillet](https://anchorfishmarket.com/products/ling-cod-fillet) | Toronto vendor describes frozen and fresh lingcod fillets and offers ordering by pound. Vendor-specific listing and order convention only; not a general market standard. |

## Completion boundary

The species identity and bilingual display pair are source-verified, but the active row remains held until the broader **`ling` / `ling cod`** picker behavior can distinguish this species from other documented uses. Do not promote the source-attested `ling cod` alias while a broad `ling` query would then return this one species alone. No shared catalog JSON, ledger, manifest, generated catalog, checklist, roadmap, recipe, or application code changed during this proposal-only review. No tests or emulator checks were run.
