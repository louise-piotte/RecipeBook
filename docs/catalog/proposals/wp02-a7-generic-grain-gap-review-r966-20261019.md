# WP02 Section A7 R966: separated rice germ evidence and naming recheck

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal-only evidence review. No shared catalog, ledger, plan, roadmap, checklist, or recipe data was changed.
- **Open-plan anchor:** The A7 parent remains open for other grain meals and milling products ([active plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Candidate reviewed:** Standalone, separated **rice germ**, the rice-kernel embryo fraction recovered during milling.
- **Decision:** Keep the candidate on hold. New primary evidence now supports direct human-food preparation and food-formulation use, resolving the earlier food-use gap. The earlier hold also required a supported Québec-facing French human-food name. No such name was verified: the exact OQLF entry `germe de riz` is scoped to animal feed and treated cereal. Do not add a catalog identity, translation, alias, form, or ledger candidate until that naming gate is resolved.
- **Scope:** Generic culinary ingredient diversity only. No brand, product-line, flavour-family, SKU, or retailer-variant roster was pursued. The named Anson Mills wheat-meal lead remains out of scope because **commercial-product counts do not add ingredient diversity**. Preserve all existing branded rows and keep product-specific evidence attached to its current identity.

## What changed since the prior hold

The prior [R60 boundary review](wp03-section-f-rice-germ-human-food-boundary-hold-20261013-r60.md) found only anatomy, a feed-scoped terminology entry, and combined bran-and-germ foods. It therefore held separated rice germ outside both the picker and the research ledger pending standalone human-food and Québec-French naming evidence.

This review found two primary research sources that were not part of that evidence set. Vasan and Kousalya's 1982 food-preparation study used separated rice germ in several familiar foods. A 2009 Central Food Technological Research Institute (CFTRI) project report purified rice germ from rice-bran samples and concluded that the studied germ was suitable for food formulation. These sources resolve the human-food-use question for the ingredient concept. They do not establish a Canadian market class or a Québec-facing French food name. The naming gate therefore remains open and the candidate remains unallocated.

Keep separated rice germ distinct from whole brown rice retaining its germ, germinated/sprouted rice, rice bran, rice bran-and-germ composites, rice-germ oil, rice-germ extracts, and feed-oriented rice-germ meal. The 1982 paper also tests deoiled germ and deoiled germ flour in particular preparations; those forms and findings do not define the proposed base ingredient or a general milling specification.

## Ownership and recipe-demand scan

Read-only scan of the current shared data on 2026-10-19:

| Surface checked | Current state | Proposal consequence |
| --- | --- | --- |
| Ingredient references | 1,984 references. No row owns `ingredient-ref-rice-germ`, standalone `rice germ`, `rice germ meal`, or a human-food French display. The only broad query overlap is `ingredient-ref-sprouted-brown-rice`, whose germination state is distinct. `ingredient-ref-rice-bran` explicitly keeps rice germ separate. | No active row owns separated rice germ. Preserve the bran, sprouted-rice, and other rice references unchanged. |
| Ingredient forms | 205 forms. No form owns the proposed reference ID or standalone rice-germ wording. A broad germination-term overlap is the existing sprouted brown-rice flour form. | Do not add a form or attach germination forms to separated germ. |
| Legacy import identities | 55 candidates. No candidate owns the proposed identity or its reviewed exact-name variants. | No legacy promotion, merge, or alias transfer is involved. |
| Research ledger | 2,389 records. No rice-germ identity or candidate record exists. The only phrase hit is the `ingredient-ref-rice-bran` decision, which expressly names rice germ as a separate identity; its Westpoint evidence concerns a branded combined bran-and-germ product. | Keep the existing rice-bran record and its product-scoped portion untouched. No new ledger record is proposed while the French naming gate remains open. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. The full serialized recipe files and ingredient objects had zero matches for `rice germ`, `rice-germ`, `rice germ meal`, `rice germ powder`, `rice germ flour`, `defatted rice germ flour`, `germe de riz`, `rice with germ`, `haiga rice`, `germinated brown rice`, rice-bran-and-germ wording, rice-germ oil/extract, or `ingredient-ref-rice-germ`. | No recipe demand, portion, or direct recipe link supports allocation. |
| Nearby decisions | A7 is open for generic grain meals and milling products. The R951 sorghum-germ hold is a different cereal fraction; R957–R963 identities remain excluded. The R60 rice-germ hold is the same candidate reviewed here. | Do not reopen excluded A7 identities or duplicate existing work. This review changes only the evidence assessment of the old rice-germ hold. |

The proposal-local IDs `WP02-A7-RICE-GERM-R966-20261019-S01` through `S03` and their three URLs do not occur in the current ledger. The older R60 OQLF citation is present only in its archived proposal; this review assigns a new source ID for its bounded terminology use and does not assume an existing ledger owner.

## Bounded primary and authoritative evidence

| Proposal-local source ID | Source and supported finding | Limits |
| --- | --- | --- |
| `WP02-A7-RICE-GERM-R966-20261019-S01` | B. S. Vasan and K. Kousalya, [“Use of Rice Germ in the Common Food Preparations”](https://lib3.dss.go.th/fulltext/scan_ebook/j.food_sci_tech_1982_v19_n4.pdf), *Journal of Food Science and Technology* 19(4) (1982), 161–162. The study prepared germ from clean IR 20 brown rice with a PPRC degermer and used whole/raw germ in germ milk, sweet pongal, sweet balls, and sweet cake. It separately used deoiled germ or deoiled germ flour in some preparations, including dosa. | Establishes human-food research use of separated germ, not general retail prevalence, a Canadian food category, a shared processing specification, or a Québec French food name. IR 20, preparation methods, sensory findings, and formula values are study-specific. |
| `WP02-A7-RICE-GERM-R966-20261019-S02` | Asma Nazreen K. A., [“Separation of Germ from Rice Bran and Studies on its Chemical Properties”](https://ir.cftri.res.in/9209/), CFTRI Student Project Report (2009). The report describes purifying germ from bran samples associated with parboiled, steamed, and raw rice and concludes that the purified study samples are suitable for nutritious food formulation. | Supports an identifiable separated fraction and food-formulation potential. It is an institutional project report; its rice sources, separation/sieving/air/saline methods, composition values, and formulation conclusion are sample-specific. Its downloadable file is repository-restricted. It does not establish a consumer product class or local name. |
| `WP02-A7-RICE-GERM-R966-20261019-S03` | Office québécois de la langue française, [`germe de riz` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9498735/germe-de-riz). Defines the embryo fraction separated from bran/polishing residues and floury parts, and records English `rice germ meal`. | The listed domains are animal-feed zootechny and treated cereal. Use this only for the boundary and to explain why the exact French term cannot yet be transferred to a human-food picker label. It is not a culinary naming recommendation. |

No product page or commercial roster is used to establish this candidate. Any commercial search-result lead was not pursued. The proposal makes no transfer from the branded rice-bran entry, from the prior combined bran-and-germ label, or from any product-specific measurement or claim.

## Measurement and substitution state

The bounded generic measurement search used exact-name and measure/density terms such as `"rice germ" cup grams`, `"rice germ" household measure`, `"rice germ" bulk density`, and `"germe de riz" mesure`. It found no transferable household mass/volume measure or density for separated rice germ. In S01, 50 g of germ is blended with 200 mL water to prepare a study's rice-germ milk; the reported specific gravity 1.004 belongs to that prepared milk, not dry germ. Do not add those quantities as ingredient conversions, mapping, density, or measure. Keep `defaultDensity` null and mappings empty if a future name review permits an identity.

The bounded generic substitution search used exact-name and culinary replacement terms such as `"rice germ" substitute`, `"rice germ" replace flour`, and `"rice germ" bread replacement`. S01 reports a formula-specific use of deoiled germ flour at up to 20% relative to rice flour in one dosa preparation. This does not provide transferable consumer replacement advice, a general replacement ratio, or recipe adjustment. No supported general replacement advice was found. If a ledger record is later opened after terminology review, use `measurementState: researched_no_supported_value` and `substitutionResearchState: blocked_pending_evidence`; record the dosa result only as a source-specific blocked finding if useful. Add no measurement observation, active rule, replacement link, or aliases.

## Proposed minimal state

Keep the R60 hold in effect with a narrow evidence update:

- No active reference, form, alias, legacy promotion, recipe link, ledger candidate, or ledger identity record.
- No new source or measurement record in the shared ledger; the three source IDs above are proposal-local.
- Mark the standalone human-food-use evidence gap as resolved for future review. Keep the Québec-facing French human-food naming gate open because OQLF's exact term is feed/treatment-scoped and no independent human-food display was found.
- If a later review resolves the naming gate, reassess `rice germ / germe de riz` with the French display still requiring a human-food terminology basis. Do not infer that the OQLF term's feed-scoped English equivalent `rice germ meal` is a generic culinary alias.
- If a future ledger row is approved, preserve the measurement and substitution states above and keep all study-specific amounts, preparation details, formulas, and findings attached only to their cited source.

The `rice germ` wording does not displace or merge with any existing reference. Keep the Westpoint Naturals 2 tbsp (15 g) value on `ingredient-ref-rice-bran` only for its stated branded stabilized bran-and-germ product; no transferability review was performed here.

## Remaining uncertainty

1. Primary food studies now establish direct human-food preparation and formulation use of separated rice germ, but not Canadian retail prevalence or a regulatory food class.
2. The exact OQLF French term is feed/treatment-scoped. No verified Québec-facing French human-food label or authoritative culinary term was found, so no French display is proposed.
3. The primary study's sample preparation, storage, deoiling, powdering, food formulas, and sensory outcomes are not transferable specifications or recipe advice.
4. No reusable household measure, density, substitution, active recipe behavior, or bundled recipe demand is supported.

Recommendation: retain the documentation-only hold and record that human-food evidence now supports the separated fraction while French culinary terminology remains the sole allocation blocker. Reopen naming only with a Québec-facing human-food label or authoritative terminology evidence. Do not pursue branded/product-line rosters to fill that gap.

## Proposal checks

- Recounted current data before writing: 1,984 ingredient references, 205 forms, 55 legacy candidates, 2,389 ledger records, 114 manifest-listed recipes, and 1,123 ingredient rows.
- Scanned reference/form/legacy data for exact identity and close variants. No separated rice-germ owner or legacy candidate was found; nearby sprouted-rice owners are distinct. The sole ledger phrase hit is the accepted rice-bran decision, which explicitly separates rice germ.
- Scanned every complete manifest-listed recipe file and every ingredient row for the candidate identity and reviewed wording variants; zero recipe-file and ingredient-row matches were found.
- Checked the three proposal-local source IDs and URLs against every current ledger source; no collisions were found. The linked A7 plan file exists and line 2289 is the open-plan anchor; the prior R60 proposal is present.
- This Markdown file is checked for UTF-8 without BOM, NUL bytes, trailing whitespace, and valid relative links before handoff. No software tests were run because this review is proposal-only.
