# WP02 Section 04 B3 R117 — elephant-foot-yam starch boundary hold

- **Reviewed:** 2026-10-14.
- **Status:** Integrated as a ledger-only candidate hold. Active references, forms, recipes, generated catalog, and application files are unchanged. No app tests were run because this change only adds JSON research data under the updated `AGENTS.md` rule.
- **Open plan item:** Section 04 B3, line 2209, “Water-chestnut flour and other documented regional starches.”
- **Candidate:** Starch isolated from the corm of *Amorphophallus paeoniifolius*, reported as elephant foot yam / suran / jimikand.
- **Recommendation:** Keep the source-qualified starch as a separate held candidate. Do not add it to active references or forms yet. The isolated starch is documented in primary research, but an active name would collide with the already-unresolved generic `yam starch` query, and the Canadian French wording found is for the whole corm, not extracted starch.
- **Integrated ledger candidate:** `candidate-elephant-foot-yam-starch` (no prior owner).
- **Proposed source-ID prefix:** `WP02-B3-ELEPHANT-FOOT-YAM-STARCH-R117-20261014` (no current archive or ledger collision).

## Why this is a distinct unfinished B3 candidate

The reviewed fraction is starch extracted from *Amorphophallus paeoniifolius* corms, not whole-corm flour and not starch from *Dioscorea* yams. Kew accepts *A. paeoniifolius* in Araceae and explicitly distinguishes “elephant yam” from *Dioscorea* yams and from the separate *Amorphophallus konjac*. The existing `candidate-yam-starch` record is specifically the held *Dioscorea*-tuber starch boundary; it should remain unchanged. The existing konjac-flour proposal rejects `elephant yam flour` as an alias, but does not review this species-qualified starch fraction.

The proposal and batch search found no focused *A. paeoniifolius* starch decision, active reference, form, or ledger candidate. The only nearby prior decisions are the *Dioscorea* `yam starch` hold and the separate konjac-flour exclusion of `elephant yam flour`. This is a source-qualified follow-up within B3, not a reopening of either decision.

## Evidence and naming boundary

The primary extraction study establishes a recoverable starch fraction from identified *A. paeoniifolius* corms. Canadian sources establish current names for the whole edible tuber: Health Canada’s bilingual natural-health-product database lists *A. paeoniifolius* with English `Elephant yam` and French `Igname d’éléphant`; an Ottawa retailer serving Ottawa and Gatineau lists Vadilal frozen corm pieces in French as `Suran congelé` / `igname pied d’éléphant`. These sources support species and whole-corm wording, but neither is a Canadian label for extracted starch. The Canadian retailer listing was out of stock when checked.

OQLF defines `igname` as a food tuber from *Dioscorea*. The Health Canada common name and French retail name are direct evidence for *A. paeoniifolius* as a whole-corm ingredient, but do not establish `amidon d’igname pied d’éléphant` as a Québec starch-product name. A scientific construction such as `amidon d’Amorphophallus paeoniifolius` would be precise but has no verified food-label use. Keep the French display unresolved pending a Québec-facing starch label or an independent terminology decision.

Do not merge this candidate with:

- `candidate-yam-starch`, the held generic starch isolated from edible *Dioscorea* tubers;
- `ingredient-ref-yam` or `ingredient-ref-yam-flour`, which use OQLF’s *Dioscorea*-based `igname`;
- `ingredient-ref-konjac-flour`, made from *A. konjac* and not *A. paeoniifolius*;
- the edible corm, corm flour, or a corm-derived starch-rich food, which are not isolated starch.

Do not activate `elephant yam`, `elephant foot yam`, `yam starch`, `suran starch`, `jimikand starch`, `elephant yam starch`, `amidon d’igname`, or `fécule d’igname` as aliases. The first group names the whole tuber or is not shown on an isolated-starch label; the unqualified starch phrases have wider species scope or collide with the existing *Dioscorea* boundary.

## Current exact ownership and picker effects

The audit checked normalized names and aliases in active references; form labels and match terms; legacy candidates; and ledger record IDs. No exact owner exists for the proposed starch phrases or proposed candidate ID.

| Phrase | Current exact owner |
|---|---|
| `elephant foot yam starch` | None |
| `elephant yam starch` | None |
| `suran starch`; `jimikand starch` | None |
| `Amorphophallus paeoniifolius starch` | None |
| `amidon d’igname pied d’éléphant` | None |
| `candidate-elephant-foot-yam-starch` | None |
| `yam starch` | No active owner; a separate held `candidate-yam-starch` covers *Dioscorea* tubers |
| `elephant yam flour` | No active exact owner; the konjac-flour review explicitly keeps it unassigned |

Current reference rows include `ingredient-ref-yam` (`true yam / igname`), `ingredient-ref-yam-flour` (`yam flour / farine d’igname`), `ingredient-ref-ube-halaya` (English alias `purple yam jam`), and `ingredient-ref-konjac-flour` (`konjac flour / farine de konjac`; aliases empty). Current picker results from `IngredientSearch.kt` are:

| Query | Current results |
|---|---|
| `elephant foot yam starch`; `elephant yam starch`; `suran starch`; `jimikand starch` | None |
| `Amorphophallus paeoniifolius starch`; `amidon d’igname pied d’éléphant` | None |
| `yam starch` | None |
| `yam` | `true yam`; `yam flour`; `ube halaya (purple yam jam)` |
| `igname` | `true yam`; `yam flour` |

The picker accepts a complete word phrase occurring inside a longer display or alias. Therefore, activating the natural English display `elephant foot yam starch` would make the unqualified `yam starch` query return only this *A. paeoniifolius* row, even though `yam starch` already has an unresolved *Dioscorea* scope. A French display containing `igname` would also make the broad `igname` query select a third row, although OQLF defines that term for *Dioscorea*. These projected results would overstate what the generic queries identify. Hold the active row and all aliases until a source-qualified name and safe picker behavior are established.

## Bundled demand and numeric evidence

The manifest at `app/src/main/assets/seed/bundled-library/manifest.v1.json` lists 114 recipes. A manifest-ordered scan of 114 recipe files and 1,123 ingredient rows found zero text matches for `elephant foot yam starch`, `elephant yam starch`, `suran starch`, `jimikand starch`, `Amorphophallus paeoniifolius starch`, `amidon d’igname pied d’éléphant`, and `fécule d’igname pied d’éléphant`. No row links to the related active yam, yam-flour, konjac-flour, or ube-halaya references. No recipe link or recipe-driven alias is supported.

The numeric findings are source-specific and do not support reusable kitchen data:

- ICAR-CCARI reports that whole elephant-foot-yam tubers contain 18.0% starch. This is a reported composition of the corm, not recovered starch yield, a starch-product measure, or density. [S02]
- Karmakar et al. report a maximum extraction yield of 51.76 g starch per 100 g dry corm in their response-surface/ANN extraction study. This is a laboratory yield under the study process, not a home-preparation yield or transferable conversion. [S03]
- Nagar et al. prepare one starch-based film using 4 g starch in 100 mL water with a film-specific glycerol addition. This is a film formulation, not a recipe portion, household measure, starch density, or substitution. The film-density results describe the finished film, not starch powder. [S07]
- No reviewed source supplies a household mass-volume pair, bulk density, conversion, retail starch-package yield, or tested substitution ratio for this starch. Keep all active numeric fields, forms, mappings, yields, conversions, and substitutions absent.

The current global and contextual substitution-rule files each contain zero rules. The only package-yield entry concerns S&W canned black beans. The existing `candidate-yam-starch` record remains `needs_clarification` and continues to cover *Dioscorea* only; this review does not change it.

## Pre-integration snapshot and audit paths

Counts and SHA-256 values below are from the canonical files read on 2026-10-14:

| Surface | Current path | Count and SHA-256 |
|---|---|---|
| Ingredient references | `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,459 references; `0d819668694783ac8975914236aaf447d77c36ae0a2f61fbce52193f22b1738b` |
| Ingredient forms | `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 105 forms; `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| Research ledger | `docs/catalog/research-ledger.v1.json` | 1,799 records / 7,380 source entries / 6,260 distinct source IDs; `c34c23d9c6bd631cb9c573bcfa9de7cec7463c3b8977e9f40bacae6489c58568` |
| Legacy import identities | `docs/catalog/legacy-import-identities.v1.json` | 63 candidates; `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| Seed manifest | `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe files; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | `app/src/main/assets/seed/bundled-library/recipes/` | 114 files / 1,123 ingredient rows / 753,928 bytes; `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

The recipe-corpus digest hashes each manifest-relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte in manifest order. The archive search covered WP02 proposals and batches, active refs/forms, the full research ledger, and legacy candidates. It found no existing `A. paeoniifolius` starch record or the proposed ID/source prefix.

## Integration result

1. Active references, forms, recipes, generated catalog data, and existing yam/konjac decisions remain unchanged. Section 04 B3 remains open.
2. Added one separate `candidate-elephant-foot-yam-starch` ledger record for isolated *A. paeoniifolius* corm starch, with `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`. The substitution state remains unresearched because this review did not evaluate replacement candidates. Lab extraction results, corm composition, and packaging-film formulation remain bounded source evidence, not active kitchen measurements or density. `candidate-yam-starch` remains unchanged.
3. Linked this proposal under the B3 checklist item. Reconsider active identity only after source-qualified Canadian/Québec starch-product wording and picker-safe search behavior are verified. See the [integration README](../batches/wp02-b3-elephant-foot-yam-starch-boundary-hold-integration-20261014/README.md).

## Sources

| ID | Source and bounded evidence |
|---|---|
| S01 | Royal Botanic Gardens, Kew, [Plants of the World Online: *Amorphophallus paeoniifolius*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:60444138-2/general-information), accessed 2026-10-14. Accepts the species in Araceae, documents elephant-yam food use, and distinguishes it from *Dioscorea* yams and from *A. konjac*. Botanical and food-source evidence; it does not name a retail starch product. |
| S02 | ICAR–Central Coastal Agricultural Research Institute, [Elephant foot yam](https://ccari.res.in/dss/elephantfootyam.html), accessed 2026-10-14. Gives the accepted name *A. paeoniifolius*, local names Suran and Zamikand, whole-tuber food uses, starch-rich corm chips, and 18.0% tuber starch. The percentage is composition of whole tuber, not starch extraction yield or a kitchen value. |
| S03 | Biswanath Karmakar et al., [“Optimization of starch extraction from *Amorphophallus paeoniifolius* corms using response surface methodology (RSM) and artificial neural network (ANN)”](https://doi.org/10.1016/j.ijbiomac.2023.124183), *International Journal of Biological Macromolecules* 237 (2023), 124183. Primary study isolates and characterizes the starch; its maximum 51.76 g/100 g dry-corm yield is specific to the tested extraction methods and samples. |
| S04 | Health Canada, [Natural Health Products Ingredients Database, English listing](https://webprod.hc-sc.gc.ca/nhpid-bdipsn/atReq?atid=antiox2&lang=eng&promo_code=INTLSHIP&wbdisable=true) and [French listing](https://webprod.hc-sc.gc.ca/nhpid-bdipsn/atReq?atid=antiox2&lang=fre&promo_code=INTLSHIP), accessed 2026-10-14. Lists *A. paeoniifolius* as `Elephant yam` / `Igname d'éléphant`, with root/tuber parts and fresh/dry preparations. NHP ingredient terminology is not a food-label standard or a starch-product label. |
| S05 | Office québécois de la langue française, [igname (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082772/igname), updated 1991, accessed 2026-10-14. Defines `igname` as a food tuber from *Dioscorea*. This supports keeping the term distinct from *A. paeoniifolius* unless a source-qualified Québécois name is reviewed. |
| S06 | Spice Divine, [Suran congelé Vadilal 312 g](https://spicedivine.ca/fr/products/vadilal-frozen-suran-312gm), French Canadian retail page, accessed 2026-10-14; the retailer identifies Ottawa pickup and Gatineau delivery on its [pickup page](https://spicedivine.ca/fr/pages/in-store-purchase-pickup). The product page names frozen cut corm pieces `Suran` / `igname pied d'éléphant`; it was out of stock during review and is not an isolated starch product. |
| S07 | Mohit Nagar et al., [“Development and characterization of elephant foot yam starch–hydrocolloids based edible packaging film”](https://pmc.ncbi.nlm.nih.gov/articles/PMC7054476/), *Journal of Food Science and Technology* 57 (2020), 1331–1341. Primary film-formulation study. The 4 g starch/100 mL water mixture and reported film properties are specific to the packaging experiment; finished-film density is not starch-powder density. |
