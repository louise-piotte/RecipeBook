# WP04 Section P — Atlantic capelin identity review

- **Review / source access date:** 2026-10-12.
- **Status:** Integrated as recommended on 2026-10-12. See the [integration record](../batches/wp02-wp03-wp04-wp05-manioc-chiura-capelin-vernonia-integration-20261012/README.md).
- **Packet type:** species identity, picker-boundary, recipe-demand, and evidence-limit review.
- **Disposition:** accept an identity-only `PROTEIN` reference for Atlantic capelin / capelan de l’Atlantique (*Mallotus villosus*), with `caplin` as the only English alias. Hold generic capelin/capelan allocation, Pacific capelin, and capelin-derived roe as separate unresolved or out-of-scope identities. Add no form, recipe link, measurement, density, unit mapping, yield, conversion, or substitution.
- **Worktree scope:** this proposal file only. No shared catalog JSON, research ledger, recipe, plan, roadmap, generated file, or test was changed.

## Bounded recommendation

Add one species-scoped identity:

| Candidate ID | Category | English display | fr-CA display | English aliases | French aliases | Taxon |
|---|---|---|---|---|---|---|
| `ingredient-ref-atlantic-capelin` | `PROTEIN` | **Atlantic capelin** | **capelan de l’Atlantique** | `caplin` | None | *Mallotus villosus* |

OQLF's edible-fish entry normalizes Québec French `capelan` and pairs it with English `capelin` and *M. villosus*. Fisheries and Oceans Canada (DFO) now uses the explicit pair `Atlantic Capelin / capelan de l’Atlantique` for that taxon. The current Canadian Food Inspection Agency (CFIA) Fish List also ties `Capelin / Capelan` and `Caplin / Capelan Atlantique` to *M. villosus*. These support a narrowly scoped fish identity and the single English `caplin` alias; they do not support a generic catalog identity for every fish called capelin or a roe/product form. [S01–S04]

Use the DFO-qualified display pair because DFO identifies three capelin taxa in Canadian waters: Atlantic capelin (*M. villosus*), Pacific capelin (*M. catervarius*), and an unnamed *Mallotus* species. Their ranges overlap. The species qualifier protects the catalog identity from that broader biological boundary. Keep `capelan` and `capelin` out of stored aliases, even though those short phrases can still match within the qualified display under the current picker search behavior. [S02–S04]

## Identity and product boundaries

- Scope the proposed row to Atlantic capelin, *Mallotus villosus*. Keep Pacific capelin (*M. catervarius*) and the unnamed Canadian *Mallotus* species separate; this proposal does not add them.
- Use only the species-qualified bilingual displays and the CFIA-supported English alias `caplin`. Do not add the French variants `caplan` or `capelin`; OQLF says those terms were not retained for Québec fish-product marketing. Do not add `capelan` as a stored alias: the display already contains the normalized Québec term, and the Atlantic qualifier makes the selected taxon explicit. [S01–S04]
- Keep whole capelin separate from capelin eggs/masago, salmon roe/ikura, tobiko, generic fish roe, and other prepared roe products. The existing [tobiko/masago boundary review](wp04-tobiko-masago-roe-boundary-review-20261009.md) explicitly deferred a whole-capelin identity and states that whole fish is not an alias or form of its roe. That packet remains proposal-only and does not own an active capelin reference. [S07]
- Do not infer a whole-fish reference from an active dried, smoked, salted, or frozen state. DFO and seafood-industry sources describe some capelin product presentations, but the Section P preservation review keeps general preservation and packing descriptors separate absent exact recipe/product need. No capelin form is proposed. [S02–S06, S08]
- The Québec sources establish local terminology and regional food context; they do not promise current retail availability, sourcing permission, or a recipe-specific preparation. This identity makes none of those claims. [S01, S05–S06]

## Picker phrase boundary

The audit mirrors `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase, NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, convert punctuation to spaces, and collapse whitespace. Exact qualified searches `Atlantic capelin` and `capelan de l’Atlantique` identify the proposed row; `caplin` is its only stored alias.

Do not store generic `capelin`, `capelan`, or `caplan` aliases. The picker searches complete word phrases within display names, so a bare query such as `capelin` or `capelan` can still surface the qualified row. That search result does not establish a generic family identity or authorize linking an unqualified recipe line to *M. villosus*. Keep `Pacific capelin`, `capelan du Pacifique`, *Mallotus catervarius*, and the unnamed *Mallotus* taxon outside this row. Keep `capelin roe`, `capelin eggs`, `masago`, `œufs de capelan`, and `roe` outside it as product terms.

The `caplin` alias is limited to the CFIA English common-name row for *M. villosus*. `Caplan` is not adopted as an English alias, and `caplan` / borrowed French `capelin` are not Québec French aliases under OQLF's fish-product guidance. The prior roe review's `capelin roe` wording remains a description of a separate roe product, not a synonym or form of the whole fish. [S01, S04, S07]

## Prior-work and exact ownership audit

Section P remains open for finfish identities and regional fish. The coordinator and gap-sweep packets reviewed cod/haddock/halibut, pollock/mackerel, freshwater fishes, trout, herring, sardines, anchovy, eel, salmon/tuna scope, and other named fish, but do not allocate *M. villosus*. The recent American shad, Pacific cod, lake whitefish, lake trout, bluefish, and red-hake work concerns different taxa. The only earlier exact-topic overlap is the roe review: it discusses capelin eggs/masago and explicitly leaves whole capelin unassigned. This proposal advances the distinct fish-body identity without reopening that roe boundary. [S07; prior Section P packets reviewed]

Live snapshot read on 2026-10-12. Hashes cover exact file bytes. The recipe-corpus digest iterates the manifest's `recipeFiles` array in stored order and hashes each relative path, a NUL byte, exact recipe bytes, and a NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,250 references | `c6e2de7a57665fc3795821387a24fdd5b5372f43f6ed3bea5810fe06ff5ff376` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,558 records; 5,418 source entries; 4,456 distinct source IDs | `01453d4513a92b7855463ec94ad39fa6f67d64f789199d35728bfc0bf93f4db9` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ebf0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,736 recipe-file bytes | `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |

The exact-key scan covered active reference names and aliases, all form labels and match terms, legacy candidate names and aliases, and ledger record IDs. It checked the proposed displays, `caplin`, generic-name variants, nearby species names, roe terms, and binomials.

| Candidate or boundary key | Exact owner in active references / forms / legacy candidates / ledger | Decision |
|---|---|---|
| `Atlantic capelin`; `capelan de l’Atlantique`; `caplin`; *Mallotus villosus* | None | Proposed species identity; `ingredient-ref-atlantic-capelin` is unallocated. |
| `capelin`; `capelan`; `caplan` | None | No current exact stored-name owner; do not add generic aliases. Short queries can still match qualified displays. |
| `Pacific capelin`; `capelan du Pacifique`; *Mallotus catervarius* | None | No current owner; keep outside the proposed Atlantic row and defer a separate identity decision. |
| `capelin roe`; `capelin eggs`; `masago`; `œufs de capelan`; `roe` | None in active names, aliases, forms, legacy names, or ledger record IDs | Keep these terms on the separate roe/product boundary; do not attach them to the fish identity. |
| `ingredient-ref-atlantic-capelin`; `candidate-atlantic-capelin`; `candidate-capelin-product-boundary` | No matching active reference, form, legacy ID, or ledger `recordId` | Proposed reference ID is available; there is no existing candidate record to promote. |

The research ledger contains no capelin/capelan record ID or matching decision/source ownership. The word `masago` appears once in unrelated sea-urchin boundary prose, not as a record ID or fish identity. The active rows nearest this subject are salmon fillets, dried bonito, fish sauce, and separate roe-adjacent seafood; none owns a capelin name, form, or taxon. The source-ID prefix `WP04-P-ATLANTIC-CAPELIN-20261012-` was checked against the live ledger and existing catalog proposals/batches and is unassigned.

## Full bundled-recipe demand audit

All 114 manifest-listed recipe files and all 1,123 `ingredients[]` rows were scanned. The scan covered each ingredient row's name, original text, and reference/form identifiers, all parsed recipe strings, and complete recipe-file text. Whole-word phrases included `Atlantic capelin`, `capelin`, `caplin`, `capelan`, `caplan`, `capelan de l’Atlantique`, *Mallotus villosus*, `Pacific capelin`, *M. catervarius*, `capelin roe`, `capelin eggs`, `masago`, `œufs de capelan`, and `roe`.

**Result: zero matching ingredient rows and zero matching recipe files.** No recipe link or recipe-derived form, portion, measurement, or substitution is supported. Nearby aquatic rows do not imply a capelin identity: recipe 077#10 names salmon fillets; recipe 111#1 names an unqualified tuna steak; recipe 093#4 uses the generic `cooked meat or seafood` option; and recipes 093#6 and 095#5 use fish sauce as a condiment. None identifies capelin or a related product state.

## English and Québec French source limits

- OQLF places `capelan` in zoology/ichthyology and edible fish, normalizes it for Québec, and links it to English `capelin` and *M. villosus*. The entry was last updated in 2011 and notes commercial potential in Québec; it is terminology evidence, not proof of current retail inventory. It also says French `caplan` and borrowed `capelin` were not retained for Québec fish-product marketing to avoid consumer-label confusion. [S01]
- DFO's current bilingual species profiles directly support `Atlantic Capelin / capelan de l’Atlantique` and *M. villosus*. DFO also reports distinct Pacific and unnamed *Mallotus* species in Canadian waters, which is why this proposal uses the qualifier. The fishery profile supports species and regional context, not recipe suitability or a catalog-wide availability guarantee. [S02–S03]
- CFIA's Fish List ties both `Capelin / Capelan` and `Caplin / Capelan Atlantique` rows to *M. villosus*. This supports the narrow English alias `caplin`; it does not establish a recipe equivalence or justify aliases to other *Mallotus* species. [S04]
- Seafood from Canada and Québec's Fourchette Bleue list *M. villosus* as a food fish and describe local or Atlantic Canadian consumption. They are product/culinary context, not Québec government naming rulings or standard measurement sources. Their current product availability and seasonal statements should not be generalized to every market. [S05–S06]

## Numeric, form, and substitution limits

DFO's biological size/weight descriptions do not establish edible yield, count weight, fillet weight, or a recipe portion. Seafood from Canada's nutrition panel is reported per 100 g, not as a kitchen conversion or default serving. Retail package sizes, sex/roe status, regional catch sizes, and fish lengths must remain source-specific observations if ever needed; none supplies a general density, volume-to-mass mapping, or package yield. Keep `defaultDensity` null and unit mappings empty. [S02–S06]

DFO and seafood sources mention dried, smoked, salted, and frozen product states, and Fourchette Bleue describes eating capelin whole or filleted and several cooking methods. These descriptions do not create an app form or preparation conversion. No exact bundled recipe selects one state; add no form, package relation, edible yield, conversion, or recipe link. Keep capelin roe/masago separate from whole fish. [S02–S08]

No reviewed source establishes a directed recipe substitution between capelin and smelt, sardine, anchovy, or another finfish. Similar size, habitat, cooking method, or fishery classification is not substitution evidence. Add no global or contextual substitution rule. The bundled corpus provides no candidate substitution context.

## Sources

Sources were accessed on 2026-10-12. The source IDs below were added to the live ledger during integration. The cited URLs and evidence are limited to the claims below.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-P-ATLANTIC-CAPELIN-20261012-S01** | OQLF GDT, [capelan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198782/capelan) | Québec edible-fish term normalized as `capelan`; English `capelin`; Latin *Mallotus villosus*. Says `caplan` and French borrowed `capelin` were not retained for Québec fish-product marketing. Last updated 2011; naming evidence, not current retailer inventory. |
| **WP04-P-ATLANTIC-CAPELIN-20261012-S02** | Fisheries and Oceans Canada, [Atlantic Capelin (*Mallotus villosus*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/capelin-capelan-eng.html) | Uses `Atlantic Capelin` for *M. villosus*; describes human-food use, fishery context, and traditional product states. The page reports species/biological information, not recipe quantities, yields, or substitutions. Last modified 2025-07-04. |
| **WP04-P-ATLANTIC-CAPELIN-20261012-S03** | Pêches et Océans Canada, [Capelan de l’Atlantique (*Mallotus villosus*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/capelin-capelan-fra.html) | Uses the proposed Québec-facing species-qualified French display. It distinguishes Atlantic, Pacific, and unnamed capelin taxa in Canadian waters. Its fishery and biological details are not recipe or measurement evidence. Last modified 2025-07-04. |
| **WP04-P-ATLANTIC-CAPELIN-20261012-S04** | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Current list rows for *M. villosus* pair `Capelin / Capelan` and `Caplin / Capelan Atlantique`; supports the single English alias `caplin` and the species pairing. CFIA common-name evidence is not a culinary equivalence standard. |
| **WP04-P-ATLANTIC-CAPELIN-20261012-S05** | Seafood from Canada, [Capelin](https://seafoodfromcanada.ca/seafood/capelin/) and [Capelan](https://seafoodfromcanada.ca/fr/seafood/capelan/) | Bilingual Atlantic-Canadian product pages identify *M. villosus*, describe human-food use and product presentations, and report year-round availability in that source's market context. Not a Québec standardized-name ruling, kitchen measure, or universal product guarantee. |
| **WP04-P-ATLANTIC-CAPELIN-20261012-S06** | Exploramer / Fourchette Bleue, [Capelan](https://fourchettebleue.ca/produits/capelan/) | Québec source identifies *M. villosus*, discusses culinary use, whole/filleted presentation, and separation of capelin eggs/masago. Its biological size values are not recipe counts or edible yields, and its regional harvest context is not a general availability claim. |
| **WP04-P-ATLANTIC-CAPELIN-20261012-S07** | Prior packet, [Tobiko, masago, and fish-roe boundaries](wp04-tobiko-masago-roe-boundary-review-20261009.md) | Reused decision: roe and whole fish are separate products; the earlier packet explicitly assigned no whole-capelin identity. It is proposal context, not a new external source or active catalog record. |
| **WP04-P-ATLANTIC-CAPELIN-20261012-S08** | Prior packet, [preserved-fish product-state boundary review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) | Reused project decision: species, cut, preservation state, packing medium, and readiness are separate descriptors; generic preservation forms remain inactive without exact recipe/product demand. |

Integration added only `ingredient-ref-atlantic-capelin` with the species-qualified displays and `caplin` alias. The ledger records the accepted taxon/name evidence and no-supported-measurement/substitution findings. No forms, recipe links, or active numeric behavior were added. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`. Section P remains open; see the [integration record](../batches/wp02-wp03-wp04-wp05-manioc-chiura-capelin-vernonia-integration-20261012/README.md).
