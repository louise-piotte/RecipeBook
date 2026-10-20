# WP02 B2/B3 next gap review — Urid flour identity

- **Reviewed:** 2026-10-12.
- **Status:** Integrated review; the identity-only recommendation is now in the shared catalog and ledger. This refresh changes only this proposal.
- **Scope:** The current Canadian manufacturer-named `Urid Flour` product, separately listed from its `Urid Flour (Roasted)` product. This does not reopen the accepted roasted-urid identity, the held generic mung-bean-flour candidate, or the *Vigna mungo* whole-bean identity.
- **Candidate ID:** `ingredient-ref-urid-flour`; now allocated to the active `FLOUR_AND_STARCH` reference and its ledger record.
- **Source-ID prefix:** `WP02-B2-URID-FLOUR-IDENTITY-20261012`; the five source IDs S01–S05 are recorded once each on that ledger record.

## Recommendation and integration status

**The identity-only `urid flour / farine de haricot urd` recommendation is integrated as a separate `FLOUR_AND_STARCH` reference.** Niru Enterprise Inc., a Scarborough manufacturer, currently sells a product titled `Urid Flour`, describes it as a fine powder made by grinding, and lists it separately from its explicitly roasted urid flour. OQLF and CFIA terminology connect `urd` / `haricot urd` to *Vigna mungo* and distinguish that pulse from *Vigna radiata* / mung bean. The active French display uses the CFIA-attested Québec-facing seed term `haricot urd`, but the complete compound `farine de haricot urd` is not an OQLF flour entry or a located standalone French product label; keep that display provisional pending independent Québec review. [S01–S05]

The active reference uses only the manufacturer's English product wording and has empty alias arrays. It does not claim the flour is universally unroasted, whole-seed, dehulled, or split: Niru's plain-title page describes grinding but does not specify the pulse preparation. The separately named `roasted urid flour` identity remains separate. No form, recipe link, measure, density, unit mapping, conversion, package yield, or substitution rule was added. [S01–S03]

## Identity, name, and ownership boundaries

| Phrase or product | Current ownership / recommendation | Evidence and limit |
|---|---|---|
| `Urid Flour` | Active English display on `ingredient-ref-urid-flour`. | This is Niru's exact current product title. Its product description says the flour is made by grinding lentils into a fine powder; the page does not give a botanical name, seed-coat state, roast status, or milling specification. Use the source's name without generalizing it to every urad/black-gram flour. [S01] |
| `farine de haricot urd` | Active French display on `ingredient-ref-urid-flour`, **provisional** pending independent Québec review. | CFIA uses `haricot urd` for packaged *Vigna mungo* grain. OQLF maps *V. mungo* to English `urd`, `urd bean`, and `black gram`, while warning that French `haricot mungo` is also used for *V. radiata*. The full flour compound is a transparent construction from the source-backed pulse term; neither authority attests it as a flour name. [S04–S05] |
| `Urid Flour (Roasted)` / `roasted urid flour` | Keep on existing `ingredient-ref-roasted-urid-flour`; do not merge it into the active plain-title row. | Niru currently lists both product titles. Its roasted-product page states that finely milled flour is then slow-roasted. That process statement applies to the roasted item only; it does not establish that all products titled `Urid Flour` follow one contrasting process. [S02–S03] |
| `urad flour`, `urad dal flour`, `urid dal flour`, `orid flour`, `black gram flour`, `black matpe flour`, `urd flour` | Leave unassigned as aliases. | The reviewed Niru product uses `Urid Flour`. Other spellings and pulse/product descriptions are not attested as names for this exact Canadian product by the cited sources. In particular, the whole-bean row already owns `black gram`, `urd`, and `urd bean`; do not copy those short terms to the flour. [S01, S04–S05] |
| `farine de haricot mungo` | Do not use as a display or alias for this row. | OQLF explicitly notes that the French name can denote both *Vigna radiata* and *Vigna mungo*. The existing `candidate-mung-bean-flour` hold remains separate and unchanged. [S04] |
| Whole urad beans | Keep on `ingredient-ref-urad-beans / urad beans / haricots urd`. | The active pulse row owns exact French `haricot urd` and English `urad bean`, `urd`, `urd bean`, and `black gram`. A flour display is not an alias for the whole pulse. [S04–S05] |
| Mung-bean starch and roasted-Mong flour | Keep their existing separate identity/hold. | Mung-bean starch is extracted starch. `candidate-roasted-mong-flour` remains unresolved because its separate maker description does not settle species, flour versus starch, or roast/milling sequence. Neither is urid flour. [prior reviews; current ledger] |

The catalog's phrase search prefers complete word phrases before partial matches. At the refreshed snapshot, searches for `urid flour` or `farine de haricot urd` match both the plain-title row and the roasted-urid row because both contain those complete phrases. `roasted urid flour` and `farine de haricot urd torréfiée` identify the roasted row. A broad `haricot urd` query matches the whole-bean row and both flour rows, so that short phrase remains off the flour aliases. This follows the current search implementation in `IngredientSearch.kt`; it is an anticipated picker boundary, not an emulator result.

## Measurements and substitutions

- Niru lists `900 g` as the package size for its plain-title flour. This is package net weight, not a cup, spoon, volume-to-mass observation, or package-yield conversion. The product page supplies no usable kitchen measure. [S01]
- The active whole-bean, plain-urid-flour, and roasted-urid-flour references have `defaultDensity: null` and empty `unitMappings`; no urid flour form or urid package-yield record exists in the current package. Do not copy a whole-bean or roasted-product value to the active plain-flour reference.
- Niru says the flour is used to make dosa and idly. This is product-use context, not a measured replacement ratio. No reviewed source supports substituting it for roasted urid flour, mung-bean flour, mung-bean starch, rice flour, or another ingredient. No global or contextual rule, recipe-line link, or yield was added.
- The existing whole-urd and roasted-urid ledger records have measurement and substitution research marked `not_yet_researched`; keep that status distinction. This proposal does not claim a comprehensive measurement or substitution study.

## Current catalog, ledger, and full-recipe audit

Read-only snapshot refreshed from the shared worktree on 2026-10-12 after the WP03 sprouted-buckwheat integration. Digests cover exact file bytes:

| Surface | Count / SHA-256 or fingerprint |
|---|---|
| Active ingredient references | 1,317; `6427dd4cf5c2f5e94292b843255aec2b2cfe3517af1f3ef9aa99f407663c464f` |
| Ingredient forms | 98; `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64; `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,625 records / 5,963 source entries / 4,980 distinct source IDs; `4b06543735ef656679d3025939b535eb918d965a0190b67daddd412c4b7170bd` |
| Manifest | 114 recipe paths; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipes / ingredient rows | 114 / 1,123; 753,792 recipe-file bytes; manifest-order recipe-byte fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The repository's `normalizeIngredientSearchKey` behavior (lowercase, NFKD/accent folding, ligature folding, and punctuation/spacing normalization) was applied to active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs. The accepted English and French displays, `urid flour` and `farine de haricot urd`, are now exact names on `ingredient-ref-urid-flour`. No exact owner was found for the other reviewed spellings: `urad flour`, `urid dal flour`, `urad dal flour`, `orid flour`, `black gram flour`, `black matpe flour`, `urd flour`, `urad atta`, `farine d’urd`, `farine de gram noir`, `farine de haricot mungo`, `farine de haricots urd`, `farine de haricot matpe`, `farine de haricots mungo`, `farine de haricots matpe`, or `farine de haricot noir`; leave them unassigned. The candidate ID is now allocated exactly once in the active references and ledger. Source IDs S01–S05 each occur once in the ledger, all on record `ingredient-ref-urid-flour`; no other source ID uses this prefix. Exact neighboring owners are:

| Exact phrase | Current owner |
|---|---|
| `urid flour`; `farine de haricot urd` | `ingredient-ref-urid-flour` |
| `roasted urid flour`; `farine de haricot urd torréfiée` | `ingredient-ref-roasted-urid-flour` |
| `urad beans`; `haricots urd`; `urad bean`; `urd`; `urd bean`; `black gram`; `haricot urd` | `ingredient-ref-urad-beans` |
| `mung bean starch`; `amidon de haricot mungo` | `ingredient-ref-mung-bean-starch` |
| `mung beans`; `haricots mungo`; `haricot mungo` | `ingredient-ref-mung-beans` (*Vigna radiata*) |
| Generic mung-bean flour | No active reference; `candidate-mung-bean-flour` remains held in the ledger over species/French-name ambiguity. |

All **114 manifest-listed recipe files and 1,123 ingredient rows** were rescanned using normalized full-text phrase matching for the reviewed English and French spellings listed above. The scan found zero candidate phrase hits in recipe files or ingredient rows. A separate linked-reference scan found zero rows linked to `ingredient-ref-urid-flour`, `ingredient-ref-urad-beans`, `ingredient-ref-roasted-urid-flour`, `ingredient-ref-mung-beans`, or `ingredient-ref-mung-bean-starch`. The new reference has no bundled recipe link or recipe-line measure.

The current global and contextual substitution files contain zero rules. The package-yield file has one unrelated record and no urid/urd terms. The full corpus audit is evidence of no bundled demand, not evidence that the flour lacks culinary use.

## Source register

Sources were opened on 2026-10-12. Source IDs S01–S05 are recorded once each on the active `ingredient-ref-urid-flour` ledger record.

| ID | Source | Supports | Limit |
|---|---|---|---|
| **WP02-B2-URID-FLOUR-IDENTITY-20261012-S01** | Niru Enterprise Inc., [Urid Flour](https://niru.com/product/urid-flour/), current Canadian manufacturer page. | Exact English product title; description says it is made by grinding lentils into a fine powder and lists dosa/idly uses; identifies Niru Enterprise Inc. in Scarborough, Ontario; package size 900 g. | Does not state Latin species, dehulling/splitting, roast status, a French flour name, or a household measure. Package weight is not a kitchen conversion. |
| **WP02-B2-URID-FLOUR-IDENTITY-20261012-S02** | Niru Enterprise Inc., [Rice & Flour collection](https://niru.com/product-category/rice/), current product collection. | Lists `Urid Flour` and `Urid Flour (Roasted)` as distinct current products. | Collection titles establish separate marketed products, not a complete ingredient specification or a universal process boundary. |
| **WP02-B2-URID-FLOUR-IDENTITY-20261012-S03** | Niru Enterprise Inc., [Urid Flour (Roasted)](https://niru.com/product/roasted-urid-flour/), current Canadian manufacturer page. | Says finely milled flour is then slow-roasted; confirms the explicit treatment on the roasted SKU. | Applies only to the roasted product; does not establish that all unqualified urid flour is made without roasting. |
| **WP02-B2-URID-FLOUR-IDENTITY-20261012-S04** | Office québécois de la langue française, [haricot mungo — *Vigna mungo* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo), updated 1991. | Gives *V. mungo* and English `urd`, `urd bean`, and `black gram`; explicitly warns French `haricot mungo` also denotes *V. radiata*. | Pulse/species terminology only, not a flour-name ruling or evidence for a flour process. |
| **WP02-B2-URID-FLOUR-IDENTITY-20261012-S05** | CFIA, [Nouveaux codes de prolongation d'AMG pour les semences et les grains biologiques (chapitre 07)](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme), updated 2020-04-07. | In the packaged-grain code table, labels *V. mungo* as `haricot urd` and distinguishes *V. radiata* as `haricot mungo`. | French commodity-code evidence for seed/grain, not a retail flour term or a standalone flour standard. |

## Static checks performed

Re-read `AGENTS.md`, the live WP02 B2/B3 plan section, the round6 potato-flour proposal, and prior urid, mung-flour, and roasted-flour decisions. Refreshed the reference/form/legacy/ledger/manifest counts and exact-byte digests after urid-flour integration; rechecked normalized phrase ownership, active candidate-ID allocation, and the five source IDs on their ledger record; rescanned every manifest-listed recipe file and ingredient row plus links to the new and adjacent references; checked forms, measurements, unit mappings, package yields, and substitution files; and reviewed the current phrase-search logic for the plain/roasted picker boundary. UTF-8/no-BOM and whitespace checks were performed on this proposal. This final proposal edit records the root integration and refreshes its snapshot; no app tests or emulator checks were run because the accepted change only adds database JSON data and its generated search index.


## Integration record

Root added identity-only `urid flour / farine de haricot urd` as `ingredient-ref-urid-flour` in
`FLOUR_AND_STARCH`, using Niru’s source-named product. The English display matches the manufacturer’s
product title. The French compound is a transparent construction from CFIA’s packaged-grain term
`haricot urd` and remains provisional pending independent Québec review. Kept the separately marketed
roasted urid flour distinct; did not assert a universal unroasted process, seed preparation, or Latin
species for the maker’s product. Both alias arrays are empty.

Five sources and one accepted identity decision were added to the ledger. Measurement and substitution
research remain `not_yet_researched`; no forms, observations, density, mappings, conversions, yields,
recipe links, or active rules were added. The package has 1,317 ingredient references; the ledger has
1,625 records, 5,963 source entries, and 4,980 distinct source IDs. The 114-recipe / 1,123-row
manifest corpus is unchanged and contains no matching candidate phrase or linked reference.

Static package normalization and validation, reference normalization, generated-index freshness,
ledger schema/source-ID validation, exact ownership, picker projection, recipe-corpus scan,
UTF-8/no-BOM, and scoped whitespace checks passed. No app tests or emulator checks were run because
this change only adds database JSON data and regenerates its search index.
