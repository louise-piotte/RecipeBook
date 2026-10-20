# WP02 Section A self-rising flour: Québec alias boundary review

**Review date:** 2026-10-12  
**Disposition:** Integrate one French alias on the existing self-rising-flour identity.

## Recommendation

Add **farine préparée** as a French search alias on the existing `ingredient-ref-self-rising-flour` row. Keep the canonical displays **self-rising flour / farine à levure** and the existing aliases unchanged. The OQLF gives *farine à levure* as its preferred Québec term and *farine autolevante* as a term used in some contexts. Current bilingual Ardent Mills pages pair the product title *Farine préparée* with *Self-Rising Flour* and describe the same kind of flour, salt, and chemical leavener blend. Québec retailers also sell Brodie XXX products under the *farine préparée* name. [S01–S04]

This is an alias update, not a new ingredient identity or a rename. Do not add the full product label *farine préparée pour gâteaux et pâtisseries*, retailer SKU names, or brand names as general aliases. Those qualifiers belong to particular products.

## Proposed catalog delta

| Field | Current state | Proposal |
|---|---|---|
| Identity | `ingredient-ref-self-rising-flour` | Reuse this identity. Keep it distinct from all-purpose flour, cake flour, pastry flour, and baking powder. |
| English display | `self-rising flour` | No change. |
| French display | `farine à levure` | No change; this is the OQLF preferred Québec term. |
| English aliases | `self-raising flour` | No change. |
| French aliases | `farine autolevante` | Add `farine préparée`; retain `farine autolevante`. |
| Forms | None attached | Add none. |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` | No change. |
| Measurements and conversions | No general value proposed | Add none. Keep any source-specific product/package data out of general conversion behavior. |
| Substitutions | Existing ledger research includes a compound flour-plus-leavener-and-salt formula | No change. This alias review does not establish a direct flour-to-flour ratio or a new substitution rule. |
| Recipe links | None | Add none; the bundled recipes contain no line linked to this identity or using the reviewed French product wording. |

The French alias is specifically **farine préparée**. Do not add English `prepared flour`, the brand names Brodie XXX or Robin Hood, the extended retail title `farine préparée pour gâteaux et pâtisseries`, or an ingredient-quantity/formula alias. The extended title and named brands describe particular retail products; they do not improve the generic search boundary.

## Evidence

| ID | Source | What it supports | Limits |
|---|---|---|---|
| **S01** | Office québécois de la langue française, [farine à levure (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17490878/farine-a-levure), updated 1984. | Preferred term `farine à levure`; contextual term `farine autolevante`; English `self-rising flour` and UK `self-raising flour`; defines the product as a commercially prepared mixture of flour, salt, and leavening agent. | Does not list `farine préparée`; this supports retaining the current display and alias, not the proposed new market alias. |
| **S02** | Ardent Mills Canada, [Farine préparée](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/self-rising/). | Current Canadian French manufacturer page uses the exact generic product title `Farine préparée`; describes a mixture of wheat flours, salt, and chemical leavener. Its page is on the `/self-rising/` product path. | Manufacturer product wording; does not replace the OQLF preferred term or establish one formula for every self-rising product. |
| **S03** | Ardent Mills Canada, [Self-Rising Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/self-rising/). | The matching English product page uses `Self-Rising Flour` and describes a hard/soft wheat flour, salt, and baking-powder blend, confirming the bilingual title pair on the same supplier product page. | One supplier product family; its blend, wheat source, and commercial package formats are not universal class specifications. |
| **S04** | Mayrand, [Farine préparée pour gâteaux et pâtisseries 2,5 kg – Brodie XXX](https://mayrand.ca/fr/nos-produits/epicerie/farine-semoule-et-chapelure/farine-et-chapelure/farine-preparee-pour-gateaux-et-patisseries-25-kg-brodie-xxx-02831). | Québec retailer page lists the Brodie XXX product under the French `Farine préparée` name and shows Québec store availability. This corroborates local market wording. | Retailer title for one brand/SKU; it does not independently establish a universal formula or justify carrying the full product title or brand as aliases. |

The reviewed sources support the proposed generic French search alias. They do not support changing the canonical French display, adding a separate prepared-flour identity, or generalizing package size, blend composition, recipe uses, or brand-specific formulation.

## Ownership, picker, and recipe audit

The read-only audit used the live files on 2026-10-12. It checked the active identity ID and displays, `farine préparée` and its unaccented search key `farine preparee`, existing self-rising spellings, the extended Brodie product phrase, and `prepared flour`.

| Surface | Finding |
|---|---|
| Active references | The existing self-rising reference owns `self-rising flour`, `farine à levure`, `self-raising flour`, and `farine autolevante`. No active row owns `farine préparée`, `farine preparee`, or the extended retail phrase. The proposed alias has one natural destination: `ingredient-ref-self-rising-flour`. |
| Forms | 94 active forms; none is attached to `ingredient-ref-self-rising-flour` and none owns the proposed French phrase. |
| Legacy identities | 65 legacy candidates; none owns the self-rising ID, the proposed alias, or the extended retail phrase. |
| Research ledger | The current self-rising identity record contains the OQLF evidence under `WP02A1-S07` and product evidence under `WP02A1-S08`; the all-purpose record references the self-rising identity in existing compound-substitution research. No ledger record currently owns the exact alias `farine préparée`. The existing sources do not record the newer Ardent Mills bilingual title pair or the Mayrand listing. |
| Proposal archive | The existing baking-specialty packet covers the identity and OQLF names but does not propose `farine préparée`. No separate proposal for this exact Québec-market alias was found. |
| Picker behavior | `IngredientSearch.kt` folds accents and punctuation, prefers complete word-phrase matches, then falls back to substring matching. The current `farine à levure`, `farine autolevante`, and `self-rising flour` searches each match the existing identity. `farine préparée` currently has no match. Adding it as the exact alias normalizes to `farine preparee` and should return only `ingredient-ref-self-rising-flour`; the archive and active phrase audit found no collision. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for the reference ID, `self-rising flour`, `self-raising flour`, `farine à levure`, `farine autolevante`, `farine préparée` / `farine preparee`, `prepared flour`, the extended Brodie product phrase, and `Brodie XXX`. There were zero target rows, zero lines linked to the reference, and zero recipe links to add. |

Audit snapshot: active references 1,266 (`409af162fe9681431a19b4065a384fd28632995b97a6f9512cb9ad991e9aee42`); forms 94 (`55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b`); legacy candidates 65 (`7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7`); ledger records 1,574 (`7325666cbb9e0aa10f22a5268dfb1a0700522895fbc83d3048ff9d72c0b43bbc`); recipe manifest 114 (`b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`).

## Integration boundary

If accepted, add only `farine préparée` to `aliasesFr` on `ingredient-ref-self-rising-flour`, and record S02–S04 as source evidence with their limits. Keep the row's display, current English/French aliases, null density, empty unit mappings, form absence, and recipe-link absence as described above. Do not revise the identity's existing measurement or substitution research in this naming-only update. The Section A checkbox for the broader flour family remains open.
