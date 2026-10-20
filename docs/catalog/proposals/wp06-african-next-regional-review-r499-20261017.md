# WP06 African next regional review — R499

**Status:** proposal only; no catalog or recipe data changed

**Review date:** 2026-10-17

**Candidate:** gboma leaves (*Solanum macrocarpon* L.)

## Recommendation

Add one regional ingredient identity for edible leaves of *Solanum macrocarpon* L.:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-gboma-leaves` |
| English display | `gboma leaves` |
| French display | `feuilles de gboma` (provisional; review Québec consumer wording before merge) |
| Category | `VEGETABLE_AND_AROMATIC` |
| English alias | `gboma eggplant leaves` |
| French alias | none |

The English vernacular name is well-supported in Benin usage and in the primary literature. The French phrase `feuilles de Gboma` is directly attested in a Benin agronomic paper that identifies *S. macrocarpon* as Gboma and describes it as a traditional leafy vegetable, and in an agricultural extension guide that names grande morelle (Gboma) and uses the leaf phrase. This review did not establish a Québec-preferred culinary name, so keep the display provisional for fr-CA. Prefer this local, leaf-qualified phrase over `feuilles d’aubergine africaine`: although the latter appears in an official crop table, its embedded phrase `aubergine africaine` makes that broad picker query resolve to this leaf-only row.

This proposal is for the leaves only. It does not activate leaf flour, fruit, dried leaves, measures, density, unit mappings, conversions, yields, recipe links, or substitution rules. A future form proposal would need its own preparation-specific evidence.

## Why this is the next distinct gap

R496 expanded African basil coverage. A check of the current references, forms, legacy candidates, ledger, prior proposals, and all 114 manifest recipes found no gboma identity or focused proposal. Gboma is documented as a leafy vegetable used in Benin and is botanically distinct from the catalog’s generic eggplant entry and existing Chinese, Indian, and Thai eggplant entries. The separate leaf identity helps a phrase-first picker match a culturally specific ingredient without treating every eggplant as a leaf vegetable.

The name boundary matters. A primary paper uses “African eggplant” for both *S. macrocarpon* and *S. aethiopicum*, while another Nigerian paper identifies “garden egg” with *S. aethiopicum*. The French label `feuilles d’aubergine africaine` is itself source-attested for *S. macrocarpon*, but its shorter query `aubergine africaine` would return only this leaf identity, hiding the leaf qualifier and implying a broader match than the row contains. Keep that wording as evidence, not as display or alias, and scope the proposal to the Latin binomial and supported gboma name.

## Current catalog and ownership check

Audited files and snapshot fingerprints:

| Surface | Current size | SHA-256 |
|---|---:|---|
| Ingredient references | 1,777 rows | `4dd3657ce832719e3b5e2e9b57ad944ae70c447aa0e251dcbd30f2cc63d600fc` |
| Ingredient forms | 143 rows | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| Legacy candidates | 56 rows | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| Source ledger | 2,135 records; 9,772 source entries | `385f1ce9311edea025a65cd95b27f351b4fa329261c5e2825e6d2d7b40693e1e` |

No exact candidate name, Latin binomial, proposed ID, or focused gboma proposal is present in those current surfaces or prior proposal/batch/workflow files. The proposed ID `ingredient-ref-gboma-leaves` and source-ID prefix `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S` are unused in the current ledger.

The generic `ingredient-ref-eggplant` currently covers “eggplant” / “aubergine” without regional aliases. Nearby rows are `ingredient-ref-chinese-eggplant`, `ingredient-ref-indian-eggplant`, and `ingredient-ref-thai-eggplant`; none identifies *S. macrocarpon* leaves. The existing generic eggplant ledger evidence includes an OQLF source, but it supports only generic eggplant terminology, not a gboma name.

The new S01–S05 and S07–S08 URLs have no current ledger owners. Health Canada’s crop-group URL already has 16 ledger source entries; reuse the existing owner `WP03-FENUGREEK-FORMS-R350-20261016-S01` if citing that page in a future catalog record. Do not create a duplicate source URL record. The newly checked publisher DOI and ProCAR guide URL are unowned; their proposed R499 source IDs are listed below.

## Identity boundaries and naming

| Phrase | Treatment | Reason |
|---|---|---|
| gboma leaves | English display | Benin supply-chain study identifies gboma as a leafy vegetable; supported in the title and abstract of the study. |
| gboma eggplant leaves | English alias | Searchable descriptive variant, still scoped to the gboma leaf identity. |
| feuilles de gboma | Provisional French display | Directly attested in a French-language Benin primary paper and ProCAR agricultural guide. The sources support the regional name and leaf scope, but do not establish Québec consumer usage. |
| aubergine africaine / feuilles d’aubergine africaine | Evidence only; do not use as display or alias | These phrases are source-attested, including an official crop-table label for *S. macrocarpon*, but the shorter query `aubergine africaine` would substring-match a leaf-only row and collapse a broad plant/product query to one result. Other literature also uses “African eggplant” for both *S. macrocarpon* and *S. aethiopicum*. |
| African eggplant / African eggplant leaves | Do not add as alias | Primary literature applies “African eggplant” to both *S. macrocarpon* and *S. aethiopicum*. It is ambiguous without the binomial. |
| garden egg | Do not add as alias | A primary Nigerian study uses “garden egg plant” for *S. aethiopicum*, not the proposed species. |
| eggplant / aubergine | Do not add as alias | Generic names already resolve to the generic eggplant row and would broaden a leaf-specific identity. |
| *Solanum macrocarpon* | Search term only in evidence/context | It is the taxonomic scope, but do not store as a user-facing alias unless the catalog’s current alias conventions intentionally include Latin names. |
| leaf flour / dried leaves | Excluded forms | A Ghana trial used *S. macrocarpon* leaf flour in food, but that does not establish a stable packaged form, culinary conversion, or mapping for this catalog. |
| fruit | Excluded | A paper notes edible leaves and fruits, but this proposal addresses only the leafy vegetable identity. Do not collapse fruit and leaf uses. |

### Phrase-first picker projection

The current search normalization folds case, accents, and punctuation, then attempts a complete phrase match before substring fallback. Static projection of the proposed display and alias yields:

| Query | Current result | With proposal |
|---|---|---|
| `gboma`, `gboma leaves`, `gboma eggplant leaves`, `feuilles de gboma` | no match | new gboma-leaves row; the full French phrase is an exact phrase hit |
| `feuilles d’aubergine africaine`, `aubergine africaine` | no match | still no match; intentionally do not make a broad aubergine query resolve to the leaf-only row |
| `eggplant leaves` | no match | new gboma-leaves row |
| `aubergine` | generic eggplant plus Chinese, Indian, and Thai eggplant rows | same four rows; the gboma row is not pulled in by the proposed French display |
| `eggplant` | generic eggplant plus Chinese, Indian, and Thai eggplant rows | same four rows plus gboma leaves through the qualified English alias `gboma eggplant leaves`; review broad fallback ranking if regional rows grow |
| `feuilles` | multiple existing leafy-ingredient rows | those rows plus gboma leaves; the broad leaf query is expected to return several identities |
| `African eggplant`, `African eggplant leaves`, `garden egg`, `Solanum macrocarpon` | no match | still no result; these phrases are intentionally not proposed aliases |

The exact gboma and `feuilles de gboma` queries each resolve to one candidate. The broad query `aubergine africaine` now returns no candidate, avoiding a misleading single leaf-only result; generic `aubergine` continues to return its existing four rows. These results reflect static projection against the current search code and proposed terms, not a runtime UI test.

## Recipe corpus check

Manifest: 114 recipe paths; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`. Recipe-byte fingerprint, computed over each manifest path, NUL separator, exact file bytes, NUL separator: 114 files, 1,123 ingredient rows, 753,988 bytes; SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

Exact and normalized searches across all manifest recipe files found zero occurrences of gboma, gboma leaves, gboma eggplant leaves, feuilles de gboma, *Solanum macrocarpon*, garden egg, African eggplant, or either proposed/declined French wording. There are zero current direct recipe hits and no recipe-line replacement is proposed. These counts describe this manifest snapshot only; they do not establish that the ingredient is absent from other datasets or future recipes.

## Evidence and limits

| Source ID for a future record | Source and use | Evidence limit |
|---|---|---|
| `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S01` | Royal Botanic Gardens, Kew, Plants of the World Online, [*Solanum macrocarpon* taxon page](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:819941-1/general-information). Accepted taxon and broad native-range context. | Taxonomy and range source, not a culinary naming or preparation source. |
| `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S02` | Honfo et al., “Handling Practices and Quality Attributes Along the Supply Chain of gboma (*Solanum Macrocarpon*): A Leafy Vegetable in Southern Benin,” *International Journal of Food Studies* 11(2), 2022, [journal article](https://iseki-food-ejournal.com/article/256). Title and abstract identify gboma as a leafy vegetable commonly consumed in Benin. | Supports identity and regional usage; handling observations and survey frequencies do not set recipe quantities, yields, or conversions. |
| `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S03` | Egbi et al., “Contribution of *Amaranthus cruentus* and *Solanum macrocarpon* Leaves Flour to Nutrient Intake and Effect on Nutritional Status of Rural School Children in Volta Region, Ghana,” *Journal of Nutrition and Metabolism*, 2020, [publisher abstract](https://onlinelibrary.wiley.com/doi/abs/10.1155/2020/1015280). Supports that a leaf-flour preparation of this species has been studied in Ghanaian meals. | Abstract-level evidence only; does not justify a catalog form, recipe measure, health claim, or substitution. |
| `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S04` | Haliński et al., “The Chemical Composition of Cuticular Waxes from Leaves of the Gboma Eggplant (*Solanum macrocarpon* L.),” *Journal of Food Composition and Analysis* 25(1), 2012, [DOI record](https://doi.org/10.1016/j.jfca.2011.06.004). Supports the phrase “gboma eggplant” attached to the binomial and paper’s edible-leaf context. | Publisher page was rate-limited during this review; use only title/indexed bibliographic information, not uninspected full-text details. |
| `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S05` | Government of New Caledonia, *Journal officiel* no. 10738, 2 May 2024, p. 8742, crop table 013A, [official PDF](https://mobi-juridoc.gouv.nc/juridoc/jdjonc.nsf/6DDF0A5699AD7A234B258B10007DB71A/%24file/10738.pdf?openelement=). Indexed official table pairs “Feuilles d’aubergine africaine” with *Solanum macrocarpon* and separates related *S. aethiopicum* and *S. melongena* entries. | Official regulatory crop terminology, not proof of Québec idiom or culinary preference; direct PDF open timed out, so claim is limited to the indexed table text. |
| `WP03-FENUGREEK-FORMS-R350-20261016-S01` (reuse existing ledger owner) | Health Canada, [crop groups and chemical properties of residues](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html). Lists “Aubergine d’Afrique (*Solanum macrocarpon*)” separately from *S. melongena* and *S. aethiopicum*. | Canadian French regulatory name and species distinction, not a Québec consumer-language authority or food-use source. URL already appears in the ledger; preserve existing source ownership. |
| `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S06` | Oyedoyin et al., “Variation Among Agronomic Traits and Mineral Contents in 15 Accessions of Garden Egg Plant (*Solanum aethiopicum*) in Southwest of Nigeria,” *Journal of Agricultural Science and Environment*, 2020, [journal article](https://www.journal.funaab.edu.ng/index.php/JAgSE/article/view/2105?articlesBySimilarityPage=7). Supports the local use of “garden egg plant” for *S. aethiopicum*. | Used to exclude an ambiguous alias, not to infer that all West African uses of “garden egg” mean only this species. |
| `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S07` | Adango, Onzo, and Kassa, “Comportement de quelques variétés de la grande morelle, *Solanum macrocarpon* L. (Gboma) face à l’attaque de l’acarien tarsonème, *Polyphagotarsonemus latus* Banks (Acari : Tarsonemidae) au Sud-Bénin,” *Journal of Animal & Plant Sciences* 47(1), 2021, [publisher DOI](https://doi.org/10.35759/JAnmPlSci.v47-1.3). French abstract identifies *S. macrocarpon* as Gboma and a traditional leafy vegetable; the indexed article text uses “feuilles de Gboma.” | Primary agronomic research from Benin; publisher’s indexed paper text was available, but the reader could not retrieve the PDF directly during this review. Supports regional French usage, not Québec preference or any health claim. |
| `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S08` | ProCAR Benin, “Les techniques culturales performantes du Gboma,” [agricultural technical guide](https://www.procarbenin.org/wp-content/uploads/2019/12/RTE-Gboma-definitif.pdf). Its indexed French text names “la grande morelle (Gboma)” and directly uses “les feuilles de Gboma.” | Agricultural extension terminology; PDF retrieval exceeded the web reader’s size limit, so rely only on indexed text. Do not import the guide’s agronomic or medicinal claims into this identity proposal. |

Source IDs S01–S08 are proposed namespace allocations only; they have not been added to the ledger. The Health Canada URL already has an owner, so reuse its recorded source ID rather than allocating a new one. The newly checked S07 DOI and S08 ProCAR URL have no current ledger owners. Together, the French Benin sources directly support `feuilles de Gboma` for *S. macrocarpon* leaves; they do not establish Québec-preferred French wording.

## Review decision requested

Review the single leaf identity and the provisional French display before any catalog change. If approved for later integration, add only the reference and its source-ledger evidence; leave forms, recipes, mappings, conversions, substitutions, and yields untouched. No tests or builds were run for this proposal-only review.
