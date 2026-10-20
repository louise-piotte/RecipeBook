# WP03 Section M North American fruit gaps: chokecherry and haskap

- **Reviewed:** 2026-10-10
- **Status:** Proposal only. This packet creates this file only; shared references, ledger, legacy candidates, tests, plan, roadmap, code, and recipes remain untouched.
- **Scope:** Two absent fruit identities with direct Québec French terminology and documented North American food scope. This is a bounded Section M supplement, not a completion claim for Section M or WP06.
- **Sources accessed:** 2026-10-10. OQLF, Health Canada, Parks Canada, Ontario Ministry of Agriculture, Food and Agribusiness, and Agriculture and Agri-Food Canada.

## Recommendation

Advance these two identity-only FRUIT references for coordinator review:

| Candidate ID | English display | Québec French display | Alias proposal | Identity boundary |
|---|---|---|---|---|
| `ingredient-ref-chokecherry` | `chokecherry` | `cerise de Virginie` | French: `cerise à grappes`, `cerises de Virginie`, `cerises à grappes`. No English alias beyond the display. | Fruit of *Prunus virginiana*. Keep distinct from generic sweet/sour cherries. Do not add syrup, wine, preserves, or other processed forms here. |
| `ingredient-ref-haskap-berry` | `haskap berry` | `camerise` | English: `haskap`, `honeyberry`, both listed by OQLF for this fruit. | Culinary fruit of the recognized *Lonicera caerulea* haskap crop. This is a Canadian crop identity, not a claim that the crop originated in North America. Exclude ornamental honeysuckles and leaf products. |

The chokecherry candidate clears the earlier North American sweep’s hold: OQLF now directly supplies the fruit-domain Québec name, English term, and species, while Health Canada lists the raw fruit bilingually and Parks Canada documents chokecherry syrup in a Saskatchewan historic-site food context [S01–S03]. The proposed row represents the fruit. The syrup remains a separate product question.

Haskap is a distinct small-fruit crop with a stable Québec food name. OQLF pairs `camerise` with `haskap berry` and its English alternatives; OMAFRA gives *Lonicera caerulea* and fresh and processed culinary uses; Agriculture and Agri-Food Canada includes haskaps among Canadian fruit crops [S04–S06]. OQLF identifies Japan as the fruit’s origin, so this proposal treats haskap as a regionally established Canadian crop, not a native North American fruit.

No recipe links, ingredient forms, measurements, unit mappings, conversions, yields, substitutions, syrup identities, or recipe-text edits are proposed.

## Pre-integration snapshot

Counts and hashes were refreshed against the live package after the 2026-10-10 fish and mushroom integration and before this proposal's fruit candidates were merged. The recipe digest hashes each manifest-relative recipe path, a NUL byte, exact file bytes, and a trailing NUL byte, in manifest order.

| Artifact | Current count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 663 references | `d79dc4ee1d85bba1c41bf466622bd49d887e580deaa040ae0394b160f6bf15dd` |
| `ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 849 records; 1,469 source entries; 1,236 distinct source IDs | `ad278737690c33b2c2afe474e04e0a5911c978b361cb075247dc97cfca36729c` |
| `legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Manifest-ordered recipe corpus | 114 recipes; 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

At that pre-integration snapshot, the active catalog contained 71 references categorized `FRUIT`. It already included the recently integrated `asimine` and `figue de Barbarie` identities; this review did not reopen either decision.

## Prior decisions and audit coverage

I reviewed the Section M small-fruit coordinator packet, the open-fruit follow-up, the 2026-10-10 asimine/prickly-pear proposal and integration note, the Section M checklist, and the North American cuisine sweep. The earlier Section M reviews already cover blackberry, currants, gooseberry, elderberry, lingonberry, cloudberry, Saskatoon berry, açaí, cupuaçu, and the broader fruit/citrus identities. The North American sweep left chokecherry unresolved because it lacked a firm fruit scope and Québec French term; S01–S03 close those evidence gaps. Haskap was not a named active identity or prior Section M decision.

At the pre-integration snapshot, the audit checked all 663 active reference displays and aliases, all 33 forms and match terms, all 86 legacy candidate IDs/displays/aliases, the 849 ledger records, and every ingredient row in the 114 manifest recipes. Both proposed IDs and all proposed normalized display/alias terms were absent from active references, legacy candidates, forms, and ledger identity IDs. No exact candidate source phrase was already owned by another active or legacy row.

The 1,123 ingredient rows were searched in manifest order across `originalText`, `ingredientName`, preparation, notes, and reference ID. Exact and spelling-variant searches for chokecherry, *Prunus virginiana*, cerise de Virginie, cerise à grappes, haskap, honeyberry, camerise, and *Lonicera caerulea* returned no recipe ingredient hits. Recipe 029#1 names generic pitted cherries, fresh or frozen, and remains linked to the generic cherry identity; recipes 028 and 067 name maraschino cherry products. None names either proposed fruit. These existing lines do not establish a recipe link or preparation form for the proposed identities.

## Collision and naming boundaries

Candidate IDs `ingredient-ref-chokecherry` and `ingredient-ref-haskap-berry` were absent from the live references, legacy candidates, and ledger record IDs at the pre-integration snapshot. Every proposed exact term was compared after the app’s search-key normalization: lowercase, Unicode NFKD, accent folding, punctuation-to-space, and whitespace collapse. No exact normalized display/alias collision was found. Full-phrase searches for either candidate returned no active result at that snapshot; integration added the proposed names and reviewed aliases to their respective identities.

| Search boundary | Existing result or proposed behavior |
|---|---|
| `chokecherry`, `cerise de Virginie`, `cerise à grappes` | No active result in the pre-integration snapshot; the full terms identify only the integrated *Prunus virginiana* row. |
| `cerise` | In the pre-integration snapshot it returned acerola and cherry-tomato references. Chokecherry is now an additional result because its Québec display contains this broad token. Keep `cerise` and `cherry` out of aliases. |
| `cherries` | In the pre-integration snapshot it returned generic, maraschino, dried sweet, and dried tart cherry references. Keep chokecherry separate from this generic query; do not add `cherries`, `wild cherry`, or `cerise sauvage` as aliases. |
| `haskap berry`, `haskap`, `honeyberry`, `camerise` | No active result in the pre-integration snapshot. Each proposed term resolves to the integrated identity; no generic berry alias was added. |
| `berry` | In the pre-integration snapshot it resolved to Saskatoon berry; the haskap display is now another result for this broad family query. The full `haskap berry` phrase remains specific. |

OQLF lists `cerise sauvage` as a preferred synonym for chokecherry, but this packet keeps the more discriminating `cerise de Virginie` and `cerise à grappes` terms. `Wild cherry` is also excluded from English aliases. These broader names could be mistaken for the existing generic cherry identity. For haskap, `edible blue honeysuckle` is not proposed as an alias: the fruit name stays separate from plant wording and ornamental honeysuckle scope.

## Evidence register

Source IDs use the proposal-local prefix `WP03-NA-FRUIT-GAPS-20261010-S`. Before drafting, this prefix had no match in the repository or ledger source IDs. The accepted evidence records were subsequently added to the shared ledger. Source material supports names, identity, or culinary context only; no numeric data was transferred.

| ID | Source | Support used |
|---|---|---|
| WP03-NA-FRUIT-GAPS-20261010-S01 | OQLF, [cerise de Virginie (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869799/cerise-de-virginie) | Updated 2004; food-fruit domain; *Prunus virginiana*; English `chokecherry`; Québec `cerise de Virginie`, `cerise à grappes`, and `cerise sauvage`; North American origin and a documented culinary use. |
| WP03-NA-FRUIT-GAPS-20261010-S02 | Health Canada, [Canadian Nutrient File: Chokecherry, raw, pitted](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=6260) | Bilingual food name `Chokecherry, raw, pitted` / `Cerise de Virginie, crue, dénoyautée (cerise à grappes)`. Serving values on the page were not used. |
| WP03-NA-FRUIT-GAPS-20261010-S03 | Parks Canada, [Frosty-Morning Pancakes](https://parks.canada.ca/culture/gourmand-gourmet/recette-recipe39) | Fort Walsh, Saskatchewan / Prairies context; a historic-site recipe names local chokecherry syrup as a topping. Supports regional food use, not a syrup specification or separate syrup identity. |
| WP03-NA-FRUIT-GAPS-20261010-S04 | OQLF, [camerise (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26501692/camerise) | Updated 2015; food-fruit domain; Québec `camerise`; English `haskap berry`, `haskap`, and `honeyberry`; notes Japanese origin. |
| WP03-NA-FRUIT-GAPS-20261010-S05 | Ontario Ministry of Agriculture, Food and Agribusiness, [Haskap](https://www.omafra.gov.on.ca/CropOp/en/spec_fruit/berries/hask.html) | *Lonicera caerulea*; culinary fresh-fruit and processed food/drink uses; the fruit is treated as a specialty crop. Plant names and other honeysuckle products are excluded from the candidate scope. |
| WP03-NA-FRUIT-GAPS-20261010-S06 | Agriculture and Agri-Food Canada, [Statistical overview of the Canadian fruit industry, 2024](https://agriculture.canada.ca/en/sector/horticulture/reports/statistical-overview-canadian-fruit-industry-2024) | Includes haskaps among fruits produced by Canadian farmers, supporting current Canadian crop relevance. |

This proposal makes no change to the prior dispositions for melon/cantaloupe, plantain maturity, cherry subtypes, Goji terminology, dried-fruit products, or the completed asimine/prickly-pear decision.
