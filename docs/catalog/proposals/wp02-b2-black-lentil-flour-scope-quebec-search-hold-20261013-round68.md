# WP02 B2/B3 — Black lentil flour scope and Québec search hold (round 68)

- **Reviewed:** 2026-10-13
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, checklist, recipe, or code file changed.
- **Scope:** One not-yet-reviewed B2 candidate: flour milled from black lentils identified as *Lens culinaris*. This does not reopen the active whole black-Beluga lentil identity, the existing green-lentil flour, or the separate urid-flour identity.
- **New source IDs:** `WP02-B2-BLACK-LENTIL-FLOUR-20261013-R68-S01` through `S05`. This prefix was absent from the ledger and proposal/batch archive before drafting. Previously recorded OQLF, Canadian Grain Commission, and Québec retailer sources are reused under their existing IDs below.

## Recommendation

**Hold black lentil flour outside the active catalog. Do not create a reference or ledger candidate, and do not add `black lentil flour` to either the *Lens culinaris* whole-lentil row or the existing urid-flour row.** Research establishes black-lentil flour as a laboratory ingredient made from *Lens culinaris*. Current product wording does not establish a stable Canadian product scope: a manufacturer calls urad atta “black lentil flour,” while a Canadian retailer displays “Black Lentil Flour” as the ingredient of a product titled “Urad Flour.” The same English phrase therefore points to both *Lens culinaris* and urid/black matpe (*Vigna mungo*) in sources reviewed here.

The descriptive Québec French candidate `farine de lentilles noires` is attested as an ingredient phrase on a French-language European pasta listing, but no Québec-facing black-lentil-flour product label or authoritative Québec flour term was found. The active Québec whole-lentil wording `lentilles noires Beluga` is species/product-qualified and cannot establish a flour display. The English and French product scopes are not aligned well enough for a catalog identity.

## Candidate name and material boundary

| Candidate wording or material | Evidence | Disposition |
|---|---|---|
| English `black lentil flour` made from *Lens culinaris* | A 2025 primary food-science study identifies its black lentils as *Lens culinaris*, grinds the non-germinated seeds to flour, and separately makes sprouted-lentil flour. | Research ingredient wording is supported. It is not a current Canadian standalone product specification or product label. Keep unassigned. [S01] |
| `black lentil flour` as urid/urad flour | The ASOP Foods manufacturer product list pairs “Urad Atta” with “black lentil flour.” A current Canadian grocery listing titled “Suraj Urad Flour” gives “Black Lentil Flour” as the ingredient. | This is a direct lexical collision with the *Lens culinaris* research term. Do not use the phrase as an alias for urid flour or treat it as exclusive to *Lens culinaris*. [S02–S03] |
| `farine de lentilles noires` | A French-language European listing for black-lentil pasta names `farine de lentilles noires` as an ingredient. | A usable descriptive translation exists, but it is not a Québec flour label and the finished-pasta listing does not establish the seed species or flour’s standalone product scope. Keep provisional only. [S05] |
| Québec French whole product `lentilles noires Beluga` | A Québec bulk-retail list uses `lentilles noires Béluga`; the live catalog retains `lentilles noires Beluga` for the whole black-Beluga identity. | Supports the qualified whole-pulse wording only. Do not drop `Beluga` or transfer the phrase to flour. [WP03-H-LENTIL-TYPES-20261011-S06] |
| Québec/OQLF generic term `lentille` | OQLF defines `lentille` as the edible seed of *Lens culinaris*. | Supports the generic French botanical/food term, but does not establish a black-lentil flour product name or distinguish flour from urid flour. [WP03-H-S05-OQLF-LENTILLE] |

The Canadian Grain Commission distinguishes lentil classes by cotyledon colour and says types may have different seed-coat colours, including black. A black seed coat alone is not a flour species or exclusive consumer product identity. Its grading page is technical classification evidence, not a product-name authority. [WP03-H-BROWN-YELLOW-LENTILS-20261011-S02]

Keep sprouted black-lentil flour separate from flour ground from ungerminated seed. The study deliberately prepares these as distinct samples. It does not establish a standardized sprouting or drying specification that could be modeled as a form of one retail flour. [S01]

## Archive and current ownership audit

The B2 flour umbrella remains open in the current plan. A search of proposal and batch Markdown for `black lentil flour`, `farine de lentilles noires`, `ingredient-ref-black-lentil-flour`, and `candidate-black-lentil-flour` found no prior focused review or integration. The existing whole-lentil archive covers the qualified black-Beluga seed identity; the WP02 urid review separately covers urid flour and terms such as `black gram flour`. Neither evaluated the *Lens culinaris* black-lentil-flour boundary or the exact Canadian `Black Lentil Flour` ingredient wording documented here.

Read-only live snapshot at proposal time:

| Surface | Current count | Exact ownership result for proposed names and ID |
|---|---:|---|
| Active ingredient references | 1,390 | No exact normalized owner for `black lentil flour`, `farine de lentilles noires`, or `ingredient-ref-black-lentil-flour`. |
| Ingredient forms | 100 | No lentil form or exact match term for the candidate phrases. No form is attached to the relevant whole-lentil or flour references. |
| Legacy import candidates | 63 | No exact normalized owner or `candidate-black-lentil-flour` candidate. |
| Research-ledger records | 1,723 | No black-lentil-flour record, candidate ID, or exact phrase owner. Nearby existing records cover the generic and black-Beluga lentils, green-lentil flour, urad beans, urid flour, and roasted urid flour. |
| Manifest-listed recipe files | 114 | All files were present; 1,123 ingredient rows were scanned. |

Normalization was checked against `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase, NFKD accent folding, ligature folding, punctuation/spacing normalization, then whole-word phrase matching before substring fallback. The exact nearby active owners are:

| Active reference | Current display and aliases | Boundary relevant to this proposal |
|---|---|---|
| `ingredient-ref-black-beluga-lentils` | `black Beluga lentils / lentilles noires Beluga`; aliases `Beluga lentils / lentilles Beluga` | Whole pulse only; the `Beluga` qualifier is deliberate. `black lentil flour` and `farine de lentilles noires` are not aliases. |
| `ingredient-ref-urad-beans` | `urad beans / haricots urd`; English aliases include `black gram` | Whole *Vigna mungo* pulse; not flour. `black gram flour` is not an alias. |
| `ingredient-ref-urid-flour` | `urid flour / farine de haricot urd`; no aliases | Existing plain urid flour identity. |
| `ingredient-ref-roasted-urid-flour` | `roasted urid flour / farine de haricot urd torréfiée`; no aliases | Separate roasted urid flour identity. |
| `ingredient-ref-green-lentil-flour` | `green lentil flour / farine de lentilles vertes`; no aliases | Existing color-qualified flour identity. |
| `ingredient-ref-lentils` | `lentils / lentilles`; no aliases | Generic whole-lentil identity, not a flour identity. |

The proposed ID and new source-ID prefix are absent from active references, forms, legacy identities, and ledger records. The exact phrases are also absent from the archive. No active synonym is proposed for the ambiguous English term. Keep all current rows and aliases unchanged.

## Picker behavior and collision projection

The projection below mirrors the live picker over reference display/alias terms and attached form terms. “With row” assumes a hypothetical identity-only reference with displays `black lentil flour / farine de lentilles noires` and no aliases or forms; it is shown to expose the collision, not as an integration recommendation.

| Query | Current result | With hypothetical row | Assessment |
|---|---|---|---|
| `black lentil flour` | No result | Proposed *Lens culinaris* row only | Misroutes the Canadian Suraj listing’s exact ingredient phrase, whose product title is Urad Flour, to a different lentil species. |
| `black lentil` | No result | Proposed *Lens culinaris* row only | A broad phrase could select the flour even though manufacturer usage also applies “black lentil flour” to urad atta. |
| `farine de lentilles noires` | No result | Proposed row only | French exact phrase is descriptive but lacks a Québec flour-label scope. |
| `lentilles noires` | `ingredient-ref-black-beluga-lentils` | Black-Beluga whole pulse and proposed flour | Adds a choice rather than displacing the qualified Beluga result, but it broadens a Québec whole-pulse query to a flour whose local product wording is unverified. |
| `lentilles noires Beluga` | `ingredient-ref-black-beluga-lentils` | Same whole-pulse result | The explicit qualifier remains safe. |
| `lentil flour` / `farine de lentilles` | Green-lentil flour | Green- and proposed black-lentil flours | Expected broadening, but not supported by a Québec product demand or recipe need. |
| `black gram` | `ingredient-ref-urad-beans` | Same whole urad-bean result | Preserve this whole-pulse alias; do not redirect it to a flour. |
| `urid flour` / `farine de haricot urd` | Plain and roasted urid-flour references | Same two results | Existing plain/roasted product collision is intentional and remains unchanged. |

Because the proposed English display would make `black lentil` resolve only to a flour in this catalog snapshot, and because `black lentil flour` is already used for a different pulse in a current Canadian listing, do not activate either display without a product source that explicitly establishes species and label scope. Do not solve the ambiguity by aliasing the phrase to urid flour: primary research also uses it for *Lens culinaris* flour.

## Recipe demand

All 114 manifest recipe files and 1,123 ingredient rows were checked. Full recipe text and ingredient fields had zero phrase hits for `black lentil flour`, `farine de lentilles noires`, `black lentils flour`, `lentilles noires`, `black lentil`, or `black Beluga lentils`. No ingredient row links to `ingredient-ref-black-beluga-lentils`, `ingredient-ref-lentils`, `ingredient-ref-green-lentil-flour`, `ingredient-ref-red-lentils`, `ingredient-ref-urid-flour`, or `ingredient-ref-roasted-urid-flour`. The bundled recipes provide no flour demand or basis for a recipe link.

## Measurements, conversion, and substitution scope

The 2025 study prepares wheat/black-lentil composite flours at 10%, 15%, and 20% lentil-flour levels and reports Mixolab water-absorption results for those composite samples. Those experiment-specific blend proportions and instrument measurements are not household measures, bulk density, or reusable replacement ratios. The study provides no cup weight or loose/packed density for a retail black-lentil flour. [S01]

The live relevant flour and whole-lentil references have `defaultDensity: null` and empty `unitMappings`. No lentil flour form or package yield exists; the sole current package-yield record is for canned black beans. The active global and contextual substitution-rule files are empty. The ledger’s existing unit conversions are generic unit equivalences, not ingredient-specific black-lentil conversions. No density, mapping, form, package yield, conversion, recipe link, global or contextual substitution, or numeric ledger observation is supported or proposed.

## Integration sketch if reopened

Keep this as a no-add hold. Do not reserve a reference ID or candidate ID, add aliases to the whole black-Beluga or urid rows, create a form, or change the research ledger. Reconsider only after a current Canadian product source identifies a standalone flour made from *Lens culinaris* and a Québec-facing source supports the French name for that same product. If the source names a cultivar such as Beluga, preserve that qualifier rather than generalizing to all black lentils. Also require picker review that prevents the unqualified phrase from silently identifying urid/black matpe flour. Even then, add no numeric or substitution behavior without product-matched density/measure evidence or recipe-context testing.

## Sources and limits

Sources were accessed on 2026-10-13 unless identified as reused from the existing archive.

| ID | Source | Evidence used and limits |
|---|---|---|
| **S01** | Dragomir et al., [“Composite Flours Based on Black Lentil Seeds and Sprouts…”](https://www.mdpi.com/2304-8158/14/2/319), *Foods* 14(2), 319 (2025), DOI [10.3390/foods14020319](https://doi.org/10.3390/foods14020319). | Primary study identifies black lentils as *Lens culinaris*, names S.C. Pronat România as the seed source, grinds non-germinated seeds to flour, and distinguishes sprouted-lentil flour. Its flour use is laboratory/composite-baking research; it is not evidence of Canadian retail availability, Québec product wording, a standardized black cultivar, or a household measure. |
| **S02** | ASOP Foods, [Flours](https://asopfoods.com/flours/), current manufacturer product-range page. | Pairs `Urad Atta` with `black lentil flour`, directly showing that the English phrase is also used for urad. The page is an Indian manufacturer range listing; it does not identify the botanical species or detailed milling process for that line. |
| **S03** | Dominion Stores of Newfoundland, [Suraj Urad Flour, 800 g](https://www.newfoundlandgrocerystores.ca/en/urad-flour/p/21068370_EA?source=nspt), current Canadian retailer listing. | The search-indexed product title is `Urad Flour` and the listed ingredient is `Black Lentil Flour`, confirming a Canadian-market collision. Direct page retrieval returned an internal error in this review. The retailer says listing data may come from manufacturers, suppliers, or sellers and may change; it does not state botanical species or provide a verified package image/specification. |
| **S04** | Rani Brand, [Urid/Urad Flour (Black Matpe Beans Flour), Walmart Canada French listing](https://www.walmart.ca/fr/ip/Rani-Urid-Urad-Flour-Black-Matpe-Beans-Flour-28oz-1-75lbs-800g-Tout-Naturel-V-g-talien-Sans-Gluten-non-OGM-Casher-Origine-Indienne/2F45V0OS1KB8). | The listing labels the product as urid/urad and black matpe flour and uses French `farine de haricot matpe noire`; its explanatory text also calls urad a type of lentil. The page is a marketplace listing sold by Rani and states that third-party product details are not independently verified. It documents consumer-facing ambiguity, not an OQLF term or a *Lens culinaris* flour name. |
| **S05** | Tibiona, [Fusilli aux lentilles noires bio](https://www.tibiona.eu/fr/fusilli-aux-lentilles-noires-sans-gluten-250-g-bio.html), French-language European product listing for Fior di Loto pasta. | Search-indexed listing names `farine de lentilles noires` as an ingredient phrase; direct page retrieval returned a cache miss. This is a finished pasta listing, not a standalone flour package; it is outside Québec and does not state the flour’s botanical species. |
| **Reused: WP03-H-S05-OQLF-LENTILLE** | OQLF, [lentille (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082779/lentille). | Supports generic `lentille` and *Lens culinaris* edible-seed terminology. It is not a black-lentil or flour naming ruling. |
| **Reused: WP03-H-BROWN-YELLOW-LENTILS-20261011-S02** | Canadian Grain Commission, [Lentils: classes, types and varieties](https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/18-lentils/classes-types-varieties.html). | Official source distinguishes cotyledon colour from seed-coat colour, which can include black. This is grain classification, not a consumer flour taxonomy. |
| **Reused: WP03-H-LENTIL-TYPES-20261011-S06** | Épicerie La Recette5, [Espace VRRAC product list, 2025-04-15](https://www.epicerielarecette.com/assets/site/img/presse/LISTE%20PRODUITS%20VRAC%20%20%202025-04-15.pdf). | Québec bulk-retail list includes black Beluga whole lentils. It establishes local wording for the whole seed only and gives no flour name or flour product scope. |

## Review limits

This review holds one candidate and leaves the broader WP02 B2/B3 checklist open. The targeted search did not establish that no Canadian black-*Lens culinaris* flour product exists; it establishes that the sources found do not currently settle a product and Québec naming scope distinct from urid flour. No app tests, normalizers, build, or emulator checks were run because this change is proposal documentation only.

## Root integration outcome

Accepted the hold on 2026-10-13. No active reference, form, legacy candidate, or research-ledger record was added. The unresolved English naming collision and absent Québec flour label leave the species and product scope ambiguous, and no bundled recipe demand was found. See the [integration record](../batches/wp02-b2-black-lentil-flour-scope-hold-integration-20261013/README.md). No tests or emulator checks were run for this documentation-only decision.
