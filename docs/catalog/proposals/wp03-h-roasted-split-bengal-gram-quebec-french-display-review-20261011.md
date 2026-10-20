# WP03 Section H proposal: Québec French display for roasted split Bengal gram

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** Proposal only. This review writes no shared catalog, ledger, recipe, plan, roadmap, code, or test file.
- **Scope:** Independent Québec French review of the chickpea proposal's draft display `pois chiches Desi cassés et rôtis` for the AGMARK-defined roasted split Bengal gram product.
- **Recommendation:** Accept the phrase as a clear, source-bounded descriptive display. Do not describe it as an exact established Canadian product name: no Québec/Canadian French listing for this exact combined product was found. Keep French match terms empty.

## Decision

The draft French label is supportable for the app display:

| Field | Proposed value | Decision |
|---|---|---|
| `labelFr` | `pois chiches Desi cassés et rôtis` | Keep as a descriptive label. It combines the Canadian French classification wording for Desi split chickpeas with Québec retail wording for roasted chickpeas. |
| `matchTermsFr` | `[]` | Keep empty. The full product phrase is not directly attested as a Canadian French retail name, and shorter roasted-chickpea phrases also describe snack products or appear within the active roasted-flour name. |

OQLF records *pois chiche* as the French term for *Cicer arietinum* and describes the Desi type. Statistics Canada's 2022 French NAPCS uses the exact phrase *pois chiches Desi cassés* as an illustrative Desi product. A Québec retailer, La Moisson, lists a Canadian Three Farmers snack as *Pois chiches rôtis – Barbecue*. These sources support all the lexical parts of the draft, but they do not attest the combined phrase for split roasted gram as a market label.

The phrase is grammatically transparent: *Desi*, *cassés* and *rôtis* qualify *pois chiches*. Retain the capitalization `Desi`, which matches Statistics Canada's product-class spelling and Québec grocery listings. `Rôtis` is preferable here to changing the draft to `grillés`: current Québec retail wording uses *pois chiches rôtis*, while Québec recipe sources also use *pois chiches grillés* for oven-prepared chickpeas. The product standard describes dry roasting without oil but does not specify a grill method. This is a terminology choice supported by local product usage, not an OQLF ruling on the compound name.

The proposed English display `roasted split Bengal gram` also leaves the husked/dehulled detail implicit. The French display therefore need not expand to `pois chiches Desi cassés, décortiqués et rôtis`; the internal form code and source note carry that preparation detail. If a future user-facing display is expected to enumerate every preparation attribute, that longer phrase is a literal option, but this review found no Québec/Canadian product label using it.

## Search and nearby-reference audit

Current active French chickpea wording relevant to this decision:

| Active reference | Relevant French display and aliases | Boundary |
|---|---|---|
| `ingredient-ref-chickpeas` | `pois chiches`; `pois chiches en conserve`; `pois chiches secs` | Generic chickpeas and state terms. |
| `ingredient-ref-black-chickpeas` | `pois chiches noirs`; `pois chiche noir`; `kala chana` | Black/Kala Chana product; not all Desi chickpeas. |
| `ingredient-ref-chickpea-flour` | `farine de pois chiche`; `farine de pois chiches` | Generic flour. |
| `ingredient-ref-chana-sattu` | `farine de sattu`; alias `farine de pois chiches grillés` | Roasted chickpea flour, not the whole or split roasted product. |

The exact proposed label has no exact normalized duplicate among these active terms. The broad `pois chiches` portion will naturally make it relevant to broad chickpea searches. Do not add `pois chiches rôtis` or `pois chiches grillés` as French aliases: the first is documented for whole roasted chickpea snacks, and the second is used for whole chickpeas and occurs inside the active chana-sattu flour alias. Do not add `chana rôti` or another unqualified transliteration as a French alias.

The reviewed worker proposal already keeps `matchTermsFr` empty. Retain that decision; the display itself is sufficient for the qualified query. The active corpus has no recipe ingredient line or link for this split roasted product. Existing chickpea mentions are limited to unquantified or alternative text in recipes 090 and 105, so there is no recipe wording that requires a French alias.

## Exact integration guidance

If the root integrator accepts the proposed form, retain this field without other display changes:

```json
{
  "id": "ingredient-form-desi-chickpeas-roasted-split-dehulled",
  "labelFr": "pois chiches Desi cassés et rôtis",
  "matchTermsFr": []
}
```

This review recommends no alias, reference rename, form-code change, numeric value, unit mapping, measurement, conversion, yield, substitution, or recipe link. It does not establish the exact combined French product name; retain that evidence gap alongside the proposal. The OQLF and Statistics Canada sources are already cited in the chickpea-type proposal. If ledger entries are added during integration, add the Québec retail and recipe terminology evidence below to the roasted-split form record rather than creating an unrelated ingredient candidate.

## Evidence

| Source ID | Source | Supported claim and limit |
|---|---|---|
| `WP03-H-ROASTED-SPLIT-FR-QC-20261011-S01` | Office québécois de la langue française, [pois chiche, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296897/pois-chiche), updated 2026. | Establishes the Québec French base term, *Cicer arietinum*, and the Desi/Kabuli distinction. It does not name the roasted split product. |
| `WP03-H-ROASTED-SPLIT-FR-QC-20261011-S02` | Statistics Canada, [Système de classification des produits de l’Amérique du Nord (SCPAN) Canada 2022, version 1.0, French](https://www150.statcan.gc.ca/n1/pub/12-003-x/12-003-x2022001-fra.pdf), p. 178. | Under `1143111 Pois chiches Desi`, gives the illustrative wording `pois chiches Desi cassés`. Classification evidence, not a retail product label or process definition. |
| `WP03-H-ROASTED-SPLIT-FR-QC-20261011-S03` | La Moisson, Québec retailer, [Pois chiches rôtis – Barbecue](https://lamoisson.com/products/pois-chiches-rotis-au-barbecue), Three Farmers product listing, accessed 2026-10-11. | Current French Québec retail heading uses `pois chiches rôtis` for a snack product made in Canada. The listing does not establish the name or split/dehulled state of the reviewed product. |
| `WP03-H-ROASTED-SPLIT-FR-QC-20261011-S04` | Goûtez le Québec, [Pois chiches grillés](https://goutezlequebec.com/recettes/pois-chiches-grilles/), accessed 2026-10-11. | Québec culinary source uses `pois chiches grillés` for whole chickpeas prepared in an oven and finished under the broiler. It supports local usage but not the roasted-split product name. |
| `WP03-H-ROASTED-SPLIT-FR-QC-20261011-S05` | Office québécois de la langue française, [rôtir, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17048967/rotir), accessed 2026-10-11. | Defines the cooking verb and notes an extended use for chestnuts and bread cooked on a grill or perforated pan. It is general terminology evidence, not an official chickpea naming decision. |
| `WP03-H-ROASTED-SPLIT-FR-QC-20261011-S06` | Government of India, [Roasted Bengal Gram (Split) Grading and Marking Rules, 2002](https://upload.indiacode.nic.in/showfile?actid=AC_CEN_23_31_00011_193701_1535099362507&filename=roasted_bengal_gram_%28split%29_grading_and_marking_rules%2C_2002.pdf&type=rule). | Product boundary used by the chickpea proposal: mature, dry, sound *Cicer arietinum*, roasted without oil, split and husked. It supplies no Québec French name. |

## Unresolved gap

No direct Québec/Canadian French source located in this review labels the precise combination of Desi chickpea, split, dry-roasted, and husked/dehulled. The proposed French display is a defensible descriptive translation, not a verified retail name. A future product-label source could refine the wording; its absence does not make this transparent app label misleading or ambiguous when shown with the qualified English name.
