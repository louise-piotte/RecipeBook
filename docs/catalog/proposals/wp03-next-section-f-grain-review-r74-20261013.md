# WP03 Section F — pearl millet flakes / “Bajra Poha” (R74)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. No shared catalog, ledger, checklist, roadmap, recipe, or generated file was changed.
- **Open checklist item:** `[ ] Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.` ([plan line 2730](../../RecipeBook-global-ingredient-catalog-plan.txt#L2730)).
- **Candidate:** Single-grain pearl millet flakes sold under names including `Pearl Millet Flakes`, `Bajra Flakes`, and `Bajra Poha`.
- **Scope:** A processed human-food cereal product made from pearl millet (*Pennisetum glaucum*), kept separate from whole pearl millet, pearl millet flour, generic millet flakes, rice poha, and a prepared poha dish.

## Recommendation

**Hold the candidate unallocated.** The product class and English names are supported by manufacturer, retailer, government-catalogue, and research sources [S01–S05]. The sources reviewed do not establish a Québec French name for this species-qualified product. The exact compound `flocons de millet perlé` would be a plausible translation, but the OQLF source covers the species name only; current Québec sources for generic `flocons de millet` do not qualify it as pearl millet. Do not make a canonical bilingual display by combining those terms without direct Québec product or terminology evidence.

Treat this as a **processed-product identity candidate**, not an alias of `millet flakes` and not a form of the whole-grain `pearl millet` reference. Do not create a reference or form until the fr-CA display and the intended product scope are independently established. If reopened, evaluate a species-qualified `GRAIN_AND_CEREAL` identity first; do not collapse the flakes into the generic millet-flakes row.

Do not activate `Bajra Poha` as an alias. The existing rice-poha and corn-poha decisions already leave broad `poha` searches shared among flattened rice, red rice flakes, and corn poha ([poha integration](../batches/wp03-section-f-regional-poha-aliases-integration-20261013/README.md), [matcher](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L23)). The matcher treats a complete query phrase inside a longer indexed term as a match, so adding a `Bajra Poha` alias would make the bare `poha` query return another product row alongside its three current rows.

## Archive audit and current ownership

The focused proposal and batch archive search found no earlier decision for `pearl millet flakes`, `bajra flakes`, `bajra poha`, `pearl millet poha`, `kambu aval`, `sajjalu atukulu`, or species-qualified French flake wording. The accepted generic [millet-flakes review](wp03-section-f-millet-flakes-identity-review-20261012.md) says not to make species-qualified flakes aliases of its generic row; it does not decide whether pearl millet flakes merit their own identity. Existing rice- and maize-poha decisions are neighboring boundaries, not decisions on this candidate.

The live package has 1,396 ingredient references, 103 forms, and 1,732 ledger records. Exact normalized ownership is empty for the candidate phrases listed above. `bajra` alone is already an English alias of the pearl-millet grain; `poha` occurs in separate rice and maize product names.

| Live reference | Current names and aliases | Category; forms and numeric state | Ledger state: identity / measurement / substitution |
|---|---|---|---|
| `ingredient-ref-millet-flakes` | `millet flakes / flocons de millet`; no aliases | `GRAIN_AND_CEREAL`; no forms; density `null`; unit mappings `[]` | `verified / not_yet_researched / not_yet_researched` |
| `ingredient-ref-pearl-millet` | `pearl millet / millet perlé`; EN aliases `bajra`, `bajri`, `sajjalu`, `kambu`, `sajje`; no FR aliases | `GRAIN_AND_CEREAL`; no forms; density `null`; unit mappings `[]` | `verified / not_yet_researched / not_yet_researched` |
| `ingredient-ref-pearl-millet-flour` | `pearl millet flour / farine de mil chandelle`; EN aliases `bajra flour`, `bajri flour`, `sajjalu flour`, `kambu flour`, `sajje hittu`; FR alias `farine de millet perlé` | `FLOUR_AND_STARCH`; no forms; density `null`; unit mappings `[]` | `verified / researched_supported / blocked_pending_evidence` |
| `ingredient-ref-flattened-rice-poha` | `flattened rice (poha) / flocons de riz (poha)`; EN aliases include `rice flakes`, `beaten rice`, `aval`, `atukulu`, `powa`, `pawa`, `pauwa`, `pauaa`, `paunva`; FR aliases `riz aplati`, `riz battu` | `GRAIN_AND_CEREAL`; thin, medium, and thick forms; density `null`; unit mappings `[]` | `verified / researched_supported / blocked_pending_evidence` |
| `ingredient-ref-red-rice-flakes` | `red rice flakes / riz rouge aplati`; EN alias `red rice poha`; FR alias `poha rouge` | `GRAIN_AND_CEREAL`; no forms; density `null`; unit mappings `[]` | Existing separate row; no pearl-millet term |
| `ingredient-ref-corn-poha` | `corn poha / poha de maïs`; EN aliases `maize poha`, `makai poha`, `makka poha`; FR alias `makkai poha` | `GRAIN_AND_CEREAL`; no forms; density `null`; unit mappings `[]` | `verified / not_yet_researched / not_yet_researched` |

No exact candidate phrase owns an active reference, form, legacy identity, or ledger record. The shared ledger already contains the pearl-millet sources `WP03-S18` and `WP03-BAJRA-GRAIN-20261010-S01`; reuse them and do not duplicate them. The [FSSAI 2025 cereal standard](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), §2.4.6(2), lists Pearl Millet (Bajra), including *Pennisetum glaucum*, separately from Sorghum (Jowar); it establishes the source species, not a flake-product standard. The [OQLF species entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle) and generic-flake source records `WP03-MILLETFLAKES-QC-20261012-S02–S04` support the base species and generic `flocons de millet`, not the species-qualified compound.

## Québec French scope

The OQLF Grand dictionnaire terminologique entry cited by `WP03-S18` covers pearl millet as a species and lists Québec French names such as `millet perle` and `millet à chandelle`; it does not name pearl-millet flakes [WP03-S18]. The existing generic-flakes review cites Québec wording `flocons de millet`, including a product ingredient declaration and a Québec commercial-goods list [WP03-MILLETFLAKES-QC-20261012-S02–S04]. Those attest generic wording only; the retailer example is specifically associated with finger millet.

A targeted Québec French search on 2026-10-13 did not locate a Québec product label or OQLF entry for `flocons de millet perlé`, `flocons de bajra`, or another pearl-millet-flake compound. This is a bounded search result, not proof that no such Québec product exists. The Ontario retailer source [S05] uses English only and does not establish Québec availability or naming.

## Demand and evidence limits

The live manifest lists 114 bundled recipe files containing 1,123 ingredient rows. A scan of every listed recipe's serialized text and ingredient rows found **zero** matches for the candidate names and regional variants above, and zero rows linked to generic `ingredient-ref-millet-flakes`. There is no bundled recipe demand or basis for recipe links.

| Evidence | Numeric value | Limit |
|---|---:|---|
| Nature’s Trunk product variants [S01] | 350 g and 800 g packages | Package sizes only; no household measure, serving, or conversion. |
| Organic Wisdom product page [S02] | 250 g package | One seller’s package; page was marked sold out when checked. Not a serving or recipe amount. |
| FreshOnTheGo Grocery, Scarborough, Ontario [S05] | 500 g listing | Canadian retail listing, not a Québec label or household measure. |
| Srivastava et al., ICAR-CAZRI research [S04] | One T4 treatment: soak at 65°C for 30 min, then steam 20 min; reported bulk density 355 kg/m³. Water-absorption index ranged 2.20–4.10 across treatments. | Experimental flakes and laboratory measurements; the values are not a consumer-product density, cup mapping, cooking ratio, or default. Multiple treatments were studied, so the process is not universal. |

**Identity:** Sources support a pearl-millet-flake product, but not its Québec bilingual catalog display or an exact shared product specification. Do not allocate a new identity yet.

**Forms:** Add no `IngredientForm`. The product is not whole pearl millet or pearl-millet flour. Vendor process descriptions differ, and the research article studies multiple hydrothermal treatments; no shared form boundary or form conversion is established.

**Measurements and conversions:** Add no observation, density, unit mapping, or conversion. Package weights and experimental bulk density do not establish a recipe portion or volume-to-mass relationship.

**Yield:** No source gives a reproducible dry-to-prepared mass yield or a general liquid ratio. Add no yield.

**Substitution:** Product pages mention uses such as chivda, idli, and dosa, but provide no controlled replacement ratios. Do not infer substitution for rice poha, generic millet flakes, rice, oats, or another cereal; add no rule or recipe-line substitution.

## Proposal-local source register

New IDs below were checked absent from the live ledger before drafting. The FSSAI, OQLF, and generic Québec-flake records listed above are reused under their existing source IDs.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-BAJRA-POHA-R74-20261013-S01` | Nature’s Trunk, [product page](https://www.naturestrunk.com/products/pearl-millet-flakes), product title and description, accessed 2026-10-13. | Pairs `Pearl Millet Flakes` with `Bajra Flakes` and `Bajra Poha`; also gives regional terms `Sajjala Atukulu` and `Kumbu Aval`. Its own sizes are 350 g and 800 g. This India-based seller’s wording and directions are product-specific; it is not Québec terminology or a universal process specification. |
| `WP03-BAJRA-POHA-R74-20261013-S02` | Organic Wisdom, [Bajra (Pearl Millet) Flakes](https://theorganicwisdom.com/products/bajra-pearl-millet-flakes), product title, ingredient declaration, and package details, accessed 2026-10-13. | Identifies the ingredient as `Bajra (pearl millet)` and describes a 100% pearl-millet, sun-dried product. The 250 g listing was marked sold out. These are SKU-specific details, not a shared drying process or numeric mapping. |
| `WP03-BAJRA-POHA-R74-20261013-S03` | Government-hosted, [Pictures of millets value added products](https://hcikl.gov.in/pdf/Millet_Products_Catalogue.pdf), PDF p. 1. | Lists “Pearl milletflakes” in a Pearl Millet section headed “Ready to Eat Products.” This supports recognition of a processed product class; the pictorial catalogue does not specify a universal product process, household measure, or Québec name. |
| `WP03-BAJRA-POHA-R74-20261013-S04` | Soma Srivastava et al., [“Effect of Hydrothermal Treatment on Physical, Nutritional and Functional Properties of Pearl Millet (*Pennisetum glaucum*) Flakes”](https://indianjournals.com/article/ijar2-59-12-024), *Indian Journal of Agricultural Research* 59(12), 1947–1952; online 2026-01-22. | Peer-reviewed study of pearl-millet flakes made with varying soaking, steaming, and pressure-cooking treatments. Reports treatment-specific physical and functional measurements, including the T4 bulk density noted above. It does not supply a kitchen measure or product-independent default. |
| `WP03-BAJRA-POHA-R74-20261013-S05` | FreshOnTheGo Grocery, [Pearl Millet Flakes 500 gm](https://www.freshonthegogrocery.ca/products/s-v-homemade-pearl-millet-flakes/10705000000924233), Scarborough, Ontario product listing, accessed 2026-10-13. | Confirms an English pearl-millet-flakes product listing at an Ontario retailer. The page supplies a 500 g package size but no ingredient declaration, processing detail, Québec French label, or kitchen measure. |

## Hold outcome

Keep the Section F checklist item open. Do not allocate the prospective ID `ingredient-ref-pearl-millet-flakes`, or add an active alias, form, ledger candidate, measurement, conversion, yield, recipe link, or substitution. The ID and candidate phrases are absent from active references, forms, legacy candidates, and ledger records. Reopen when independent Québec product or terminology evidence establishes a usable French display and evidence clarifies whether the catalog should represent this as its own species-qualified processed-product identity. The generic millet-flakes, pearl-millet grain/flour, and rice-/maize-poha records stay unchanged.

No tests or emulator checks were run because this is proposal-only work. If a later integration changes only database JSON data, the current `AGENTS.md` rule says testing is not needed.

## Static verification

- New source IDs `WP03-BAJRA-POHA-R74-20261013-S01` through `S05` were absent from the shared ledger before drafting.
- The candidate ownership, archive, and 114-recipe / 1,123-row demand scans returned no direct candidate owner or bundled demand.
- UTF-8 decoding passed; the file has no BOM or CRLF, ends with a newline, and has no trailing spaces/tabs or mojibake markers.
- All four local Markdown links resolve to existing files. The five proposal-local source IDs are unique in the live ledger; source pages were checked on 2026-10-13.
- No tests or emulator checks were run because this is proposal-only work; the database-JSON-only testing exemption is recorded above.
