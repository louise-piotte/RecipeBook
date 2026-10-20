# WP02 B2/B3 next gap review — whole pinto bean flour identity

- **Reviewed:** 2026-10-12.
- **Status:** Integrated review; this refresh updates only the proposal to the live post-integration state.
- **Scope:** Avena Foods' current `Whole Pinto Bean Flour` product and the Canadian French wording `farine de haricots pinto`. Keep this milled product distinct from whole pinto beans and from pinto flours whose starting preparation or processing is not established.
- **Candidate ID:** `ingredient-ref-pinto-bean-flour`; now allocated once in the active references and once in the research ledger.
- **Source-ID prefix:** `WP02-B2B3-PINTO-FLOUR-20261012-ROUND8`; S01–S05 are now recorded once each on the flour ledger record.

## Recommendation

**The identity-only `whole pinto bean flour / farine de haricots pinto` reference is integrated in `FLOUR_AND_STARCH` as `ingredient-ref-pinto-bean-flour`.** Avena Foods currently lists the exact English product title and describes its native pulse flours as minimally processed and dry-milled from whole, split, or decorticated pulses at its Manitoba plant. OQLF identifies a pinto bean as the dry seed of the common bean and records `haricot pinto` as its preferred French singular, with `haricots pinto` admitted in the plural. A Cuisinart Canada French manual uses the exact phrase `farine de haricots pinto`; that wording is useful Canadian French usage evidence, but it is not an OQLF flour-name ruling. The integrated French display remains provisional pending independent Québec product-name review. [S01–S04]

The active row uses only the manufacturer's source-qualified English name and the manual-attested French display, with both alias arrays empty. Its English name is scoped to the whole-pulse product; it does not claim that all pinto bean flours use whole beans or the same process. No form, recipe line, measure, default density, unit mapping, conversion, package yield, or substitution rule was added. The current corpus contains no flour demand. [S01, S04–S05]

## Identity, naming, and picker boundary

| Term or product | Current ownership / recommendation | Evidence and limit |
|---|---|---|
| `pinto beans` / `haricots pinto` | Keep on `ingredient-ref-pinto-beans`, category `LEGUME_AND_PULSE`. Its aliases are `pinto bean` and `haricot pinto`. | OQLF defines the pinto bean as the dry seed of the common bean. Its 2024 entry prefers singular `haricot pinto`; `haricots pintos` is preferred in the plural, while `haricots pinto` is also admitted. This row remains the whole-pulse identity. [S02–S03] |
| `whole pinto bean flour` | Active English display on `ingredient-ref-pinto-bean-flour`, category `FLOUR_AND_STARCH`. | Exact current Avena Foods product title. The page lists whole-pinto flour separately from products explicitly titled split or decorticated. The product listing does not provide a pinto-specific milling specification beyond its name and the broader native-pulse flour process. [S01] |
| `farine de haricots pinto` | Active French display on the same row, **provisional** pending independent Québec review. | Exact wording in a French Cuisinart Canada manual. OQLF supports the underlying pulse term and admits this plural spelling, but does not define a flour compound. The manual's PDF could not be retrieved by the browser; the official indexed text is the evidence for the wording only. [S02, S04] |
| `pinto bean flour` | No separate alias. The exact query matches the active `whole pinto bean flour` display as a complete word phrase. | The English canonical remains specific to Avena's `Whole Pinto Bean Flour` product. Do not erase the whole-pulse qualifier in stored names or use this review to assign unsupported split/dehulled product labels. [S01] |
| `pinto flour`, `pinto meal`, `farine de pinto`, `farine de haricots pintos` | Leave unassigned. | None of the reviewed sources attests these as names for the scoped product. OQLF's preferred plural spelling for the bean does not, by itself, establish a flour-product name. [S02, S04] |
| `black bean flour` / `farine de haricots noirs` | Keep on the existing separate `ingredient-ref-black-bean-flour`. | Avena also lists whole black-bean flour as a distinct product. Shared pulse category does not make pinto and black bean flours one identity. [S01] |
| `canned pinto beans with liquid` | Keep as `ingredient-form-pinto-beans-canned-with-liquid` under `ingredient-ref-pinto-beans`; retain its one link to recipe `007#4`. | This is a canned whole-bean form. Its recipe line is not flour demand and supplies no flour measurement. [current package; S05] |

The current search code normalizes accents, ligatures, punctuation, and spacing, then prefers complete word-phrase matches. The current integrated English and French displays produce:

| Query | Projected result |
|---|---|
| `whole pinto bean flour` | Active flour row only. |
| `pinto bean flour` | Active flour row only, as a complete phrase inside its English display. |
| `farine de haricots pinto` | Active flour row only. |
| `pinto beans` | Existing whole-pinto-bean row only; the flour display uses singular `bean`. |
| `pinto bean` | Whole pinto beans and the flour, preserving both results for the broad singular phrase. |
| `haricots pinto` | Whole pinto beans and the flour, preserving both results for the broad French pulse phrase. |

These are static projections from `IngredientSearch.kt`, not emulator observations. No aliases were added to steer or broaden search.

## Measures, forms, and substitutions

- The Cuisinart indexed line reads `1 c. à soupe (15 ml) de farine de haricots pinto`. For this review, it supports the exact French wording only; do not treat it as a flour measure, mass, conversion, density, or reusable unit mapping. The PDF retrieval failure limits independent inspection of its surrounding recipe context. [S04]
- Felker et al. compare raw pinto flour with excess-steam jet-cooked and drum-dried flour in ground-beef-patty trials. The reported 6%, 12%, and 18% flour treatments include equal water amounts and belong to that test formulation. They do not define a volume-to-mass conversion or a general substitution rule for recipes. Keep these process variants distinct in evidence; do not import the trial ratios as active behavior. [S05]
- The whole-pinto reference has `defaultDensity: null` and no unit mappings. Its attached canned-with-liquid form has no density. No matching pinto-flour form or package-yield record exists. The integrated flour row keeps all numeric fields and recipe links empty.
- Current global and contextual substitution rule files contain no rules. Do not substitute the flour for whole pinto beans, black bean flour, another pulse flour, or a starch based on these sources.

## Current catalog, ledger, ownership, and full-corpus audit

Read-only post-integration snapshot refreshed on 2026-10-12 from the shared worktree. Digests cover the exact file bytes:

| Surface | Count / SHA-256 or fingerprint |
|---|---|
| Active ingredient references | 1,320; `4170561b1106f2bf98a3cfb0c789ec2f1a80e11095a58d342fd55a28fce56ef3` |
| Ingredient forms | 98; `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64; `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,628 records / 5,979 source entries / 4,996 distinct source IDs; `c1ef18297730fb99f8c2f032b4478ec04c6e4e2d51b614a0ee4c8ff89c21c523` |
| Manifest | 114 recipe paths; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipes / ingredient rows | 114 / 1,123; 753,792 recipe-file bytes; manifest-order recipe-byte fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The recipe fingerprint hashes each manifest-relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte in manifest order.

The normalized exact-owner scan covered active reference names and aliases, form labels and match terms, all 64 legacy candidate names and aliases, and ledger record IDs/names. The integrated exact displays `whole pinto bean flour` and `farine de haricots pinto` are owned by `ingredient-ref-pinto-bean-flour`; the shorter English query `pinto bean flour` is not a stored alias but matches within the canonical display. No current exact field owner was found for the other reviewed variants: `pinto flour`, `pinto bean flours`, `pinto beans flour`, `farine de haricots pintos`, `farine de haricot pinto`, `farine de haricot pintos`, `haricots pinto farine`, `haricots pintos farine`, `farine de haricot rosé`, `farine de haricots rosés`, and `farine de pinto`. The candidate ID occurs once in the active references and once as a ledger record. Source IDs S01–S05 each occur once in that ledger record, with no source from this prefix allocated to another ledger record. The integration batch links to this review.

Current adjacent owners remain distinct:

| Exact phrase | Current owner |
|---|---|
| `pinto beans`; `pinto bean`; `haricots pinto`; `haricot pinto` | `ingredient-ref-pinto-beans`, whole pulse, `LEGUME_AND_PULSE` |
| `canned pinto beans with liquid`; `haricots pinto en conserve, avec le liquide` | `ingredient-form-pinto-beans-canned-with-liquid`, under the whole-pulse reference |
| `black bean flour`; `farine de haricots noirs` | `ingredient-ref-black-bean-flour`, `FLOUR_AND_STARCH` |
| `whole pinto bean flour`; `farine de haricots pinto` | `ingredient-ref-pinto-bean-flour`, source-scoped flour identity |

All **114 manifest-listed recipe files and 1,123 ingredient rows** were rescanned for the reviewed flour phrases after integration. The scan found zero matching files and zero matching ingredient rows, and no row links to `ingredient-ref-pinto-bean-flour`. A separate linked-reference scan found exactly one pinto whole-bean row: recipe `007#4`, `1 can pinto beans with liquid`, linked to the existing whole-bean reference and canned-with-liquid form. It is not flour demand and supplies no flour measure. The package has one unrelated yield record; the global and contextual substitution files each have zero rules.

The initial round8 archive scan found no earlier focused pinto-flour review or exact candidate ID/source-prefix allocation in the plan, proposal archive, or batch archive. The broader WP02 B2/B3 review remains open; this integration resolves only a source-scoped whole-pinto-flour identity candidate. The current integration batch and plan/roadmap entries record this accepted item.

## Source register

Sources were checked on 2026-10-12. IDs S01–S05 use the prefix above and are recorded once each on the integrated `ingredient-ref-pinto-bean-flour` ledger record; the separate integration batch cites this review.

| ID | Source | Supports | Limit |
|---|---|---|---|
| **WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S01** | Avena Foods, [Pulse Flour Ingredients for Product Development](https://www.avenafoods.com/products/pulses-and-pulse-ingredients/flours/), current Canadian manufacturer page. | Lists `Whole Pinto Bean Flour`; describes native pulse flours as milled from whole, split, or decorticated pulses and as minimally processed/dry-milled at the plant in Portage la Prairie, Manitoba. | B2B product-family page, not a consumer package or a pinto-specific process specification. The whole/split/dehulled boundaries are taken from the product titles; do not generalize to other manufacturers' flour. |
| **WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S02** | Office québécois de la langue française, [haricot pinto (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083587/haricot-pinto), updated 2024. | Defines pinto bean as the dry seed of common bean; gives `haricot pinto` and English `pinto bean`; prefers `haricots pintos` in the plural while admitting `haricots pinto`. | Whole-pulse terminology only; not a flour definition or flour-process standard. |
| **WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S03** | Office québécois de la langue française, [haricot commun (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296955/haricot-commun), updated 2019. | Identifies common bean as *Phaseolus vulgaris*, the botanical basis referenced by the pinto entry. | General botanical terminology; not specific to Avena's lot, a flour product, or a flour display name. |
| **WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S04** | Cuisinart Canada, [CYM-100C French instruction booklet](https://www.cuisinart.ca/on/demandware.static/-/Sites-master-ca/fr_CA/v1770545043648/Instruction%20Booklet/CYM-100C_fr.pdf), 2013 booklet; exact phrase available in the official indexed text. | Uses the wording `farine de haricots pinto` in a French recipe line. | Direct PDF retrieval returned a cache miss. Use the indexed wording only as Canadian French usage evidence; do not infer a matching product specification or measurement behavior. |
| **WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S05** | Felker et al., [Comparison of Raw and Excess Steam Jet-Cooked/Drum-Dried Pinto Bean Flours and Their Effects on Ground Beef Patties](https://onlinelibrary.wiley.com/doi/10.1155/2023/5915625), *Journal of Food Processing and Preservation*, 2023; see also the [USDA ARS publication record](https://www.ars.usda.gov/research/publications/publication/?seqNo115=397918). | Documents pinto beans milled into flour and shows that raw and excess-steam jet-cooked/drum-dried flour behave differently in a specific meat-patty study. | Experimental ingredient/process context, not a Canadian market-label standard, flour density, kitchen conversion, or transferable substitution ratio. |

## Integration record

Root integrated the identity-only `whole pinto bean flour / farine de haricots pinto` row as `ingredient-ref-pinto-bean-flour` in `FLOUR_AND_STARCH`. Both alias arrays are empty, the French display remains provisional pending independent Québec review, and the row has no form, measure, density, unit mapping, conversion, yield, recipe link, or substitution. The five sources and one accepted identity decision are recorded on the flour ledger record; measurement and substitution research remain `not_yet_researched`. See [the integration batch](../batches/wp02-b2b3-pinto-bean-flour-identity-integration-20261012/README.md).

## Static checks performed

Refreshed the live reference, form, legacy, ledger, and manifest counts and exact-byte hashes after integration; confirmed the candidate ID is allocated once in active references and once in the ledger; verified S01–S05 occur once each on the flour ledger record and nowhere else in the ledger; rechecked normalized ownership and the current picker projections; rescanned all 114 manifest-listed recipe files and 1,123 ingredient rows; and confirmed the pinto form, density, mapping, package-yield, and substitution boundaries. Verified this proposal as UTF-8 without BOM, with a final newline and no trailing whitespace. No app or emulator tests were run: this edit only refreshes proposal documentation, and the integrated source change adds database JSON data under the repository's no-testing rule.
