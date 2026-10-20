# WP03 Section J — Ramps identity review (R1021)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic allium reference for *Allium tricoccum*.
- **Scope:** Generic ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.
- **Plan anchor:** Section J's open allium checklist includes onions, scallions, leeks, garlic, garlic scapes, and chives ([catalog plan, line 6485](../../RecipeBook-global-ingredient-catalog-plan.txt#L6485)). The follow-up explicitly leaves spring-onion and regional-allium boundaries open ([catalog plan, lines 6492–6495](../../RecipeBook-global-ingredient-catalog-plan.txt#L6492)).
- **Mutation scope:** Proposal only. This is the only file to be created; no catalog, ledger, recipe, checklist, workflow, or roadmap file is changed.

## Recommendation and identity boundary

Add **ingredient-ref-ramps-allium-tricoccum** for generic ramps, bounded to *Allium tricoccum*. Use the Québec terminology source's paired names **ramps / ail trilobé**. The identity covers the culinary ingredient named ramps; the botanical sources identify its leaves, stems, and bulb as edible parts. This does not claim that those parts are interchangeable in texture, quantity, or preparation. [S01–S02]

The display is deliberately narrow. The OQLF entry explicitly warns that French `ail des bois` is also used for Eurasian *Allium ursinum*. It also lists `ail sauvage` as a preferred term for *A. tricoccum*, but that phrase is too broad to activate for a species-specific picker identity. NCSU lists `wild leek`, `ramson`, and `spring onion`; omit them as aliases because they overlap the existing leek, green-onion, and *Allium* search boundaries. The exact display `ramps` also supports the singular query `ramp` through the app's partial-match fallback, so a singular alias is unnecessary. Keep botanical names in evidence, not picker aliases.

Do not extend this row to *A. ursinum*, *A. burdickii*, generic leeks, green onions/scallions, garlic, garlic scapes, chives, or other wild alliums. Do not turn the OQLF collection/trade note or NCSU look-alike mention into harvesting, legal, or field-identification advice. The reference is a culinary identity for a positively identified ingredient, not a foraging guide.

## Proposed minimal data

| Field | Proposed value |
|---|---|
| id | `ingredient-ref-ramps-allium-tricoccum` |
| nameEn | `ramps` |
| nameFr | `ail trilobé` |
| aliasesEn / aliasesFr | `[]` / `[]` |
| defaultDensity | `null` |
| unitMappings | `[]` |
| category | `VEGETABLE_AND_AROMATIC` |
| updatedAt | `2026-10-19T00:00:00Z` |

No form, measure, recipe link, conversion, yield, package yield, or active substitution is proposed.

## Live ownership and neighboring alliums

The inspected package snapshot contains **2,029 active references**, **205 forms**, and **55 legacy candidates**. The live research ledger contains **2,434 records** and **11,393 source entries**. The manifest lists **114 recipes** with **1,123 structured ingredient rows**. The proposed reference ID and source-ID prefix `WP03-J-RAMPS-R1021-20261019` are unused.

I normalized case-folded candidate phrases with NFKD, `œ`/`æ`/`ß` and `&` folding, diacritic removal, punctuation-to-space replacement, and whitespace collapse. The audit searched active IDs, displays and aliases; form IDs, labels and match terms; legacy-candidate fields; ledger record/source/decision text; and all bundled recipe files. Candidate phrases included `ramp`, `ramps`, `wild leek(s)`, `ramson`, `spring onion(s)`, `ail trilobé`, `ail des bois`, `ail sauvage`, `Allium tricoccum`, and `Allium ursinum`.

| Surface | Result and ownership boundary |
|---|---|
| Active references and forms | No active reference, alias, or form owns a ramps identity or the taxon *A. tricoccum*. No current form match was found. Existing allium rows remain separately owned: `ingredient-ref-green-onions`, `ingredient-ref-leek`, `ingredient-ref-garlic`, `ingredient-ref-garlic-scape`, `ingredient-ref-chives`, `ingredient-ref-chinese-chives`, `ingredient-ref-black-garlic`, and the separate garlic/chive products. |
| Legacy candidates | No matching candidate among the 55 declared legacy candidates. |
| Ledger phrase hits | No ramps or *A. tricoccum* record exists. The normalized phrase `spring onion` appears only in the existing `ingredient-ref-green-onions` decision/source context; its active aliases remain `scallions`, `green onion`, and `scallion`, with French `oignon vert` and `ognon vert`. The phrase `wild leek` occurs in an NCSU URL path owned by `ingredient-ref-garlic-chive-flowers`, source ID `WP03-K-GARLIC-CHIVE-FLOWERS-R878-20261019-S03`; that page title and locator identify *Allium tuberosum*, not *A. tricoccum*. Preserve this URL ownership and do not transfer it. |
| New source ownership | The exact OQLF and NCSU *A. tricoccum* URLs below have no current ledger owner. If accepted, add them under the proposal-local source IDs without changing the existing `Allium tuberosum` source or any allium row. |

The Section J green-onion row also owns seven exact CNF 2026 Food Code 2144 observations for `Onion, spring (green) or scallion (includes tops and bulb), raw`: one small 7.6 cm onion = **5.0 g**; one medium 10.5 cm onion = **15.0 g**; one large onion = **25.0 g**; and chopped portions of 15 mL = **6.1 g**, 100 mL = **42.3 g**, 125 mL = **52.8 g**, and 250 mL = **105.7 g**. The CNF row reports 4% rootlet refuse; the chopped entries do not specify loose or packed preparation. Keep every value with `ingredient-ref-green-onions` and CNF Food Code 2144. None transfers to ramps.

The existing `ingredient-ref-leek` row separately records CNF Food Code 2396 / USDA NDB 11246: one raw leek bulb-and-lower-leaf portion = **89 g**, with a separate **56%** refuse value for tops, root ends, and skin. Preserve that exact scope. It is not a ramp portion or conversion. No density or active unit mapping is present on the proposed identity.

## Bundled recipe demand

I searched every manifest-listed recipe's complete JSON and every structured ingredient row using the normalized name, alias, and taxon phrases above. The scan covered all **114 recipe files** and **1,123 ingredient rows** and found **zero matching files and zero matching ingredient rows**. No recipe amount, preparation, link, or substitution should be inferred from the external botanical or culinary-name sources.

## Forms, measures, and substitution review

The live catalog has no ramps form, measure, density, unit mapping, conversion, yield, or recipe link. OQLF provides botanical terminology and edible-bulb context; NCSU identifies edible leaves, stems, and bulbs and describes pungent garlic/onion flavour. Neither source gives a household portion, mass, volume, packing basis, or form crosswalk. A sensory comparison with spring onion is not a substitution instruction. The neighboring green-onion and leek measurements above remain source-specific observations, not candidate evidence.

If accepted, record an `ingredient_reference` ledger row with `identityState: verified`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: blocked_pending_evidence`, using S01–S02. Add no measurement observations or substitution finding. Both active substitution files currently contain **zero rules** (`substitution-rules.v1.json`) and **zero contextual rules** (`contextual-substitution-rules.v1.json`); no candidate-specific ledger finding exists. Do not create a global ramps-to-green-onion, leek, garlic, or spinach rule from flavour resemblance or general allium knowledge.

## Sources and limits

The URLs were opened on 2026-10-19. Source IDs are proposal-local and have not been added to the shared ledger.

| ID | Source | What it supports; limits |
|---|---|---|
| `WP03-J-RAMPS-R1021-20261019-S01` | Office québécois de la langue française, [ail trilobé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015917/ail-trilobe) | Current Québec terminology entry, last updated 2024. Directly links *Allium tricoccum* to `ail trilobé` and English `wild leek`, `ramps`, and `ramp`; describes edible bulbs; distinguishes it from *A. ursinum* and explains the `ail des bois` collision. Its note that Québec collection and trade are regulated is recorded only as a limit; this review makes no legal or harvesting claim and draws no kitchen measure or preparation rule. `sourceKind: regional_authority`. |
| `WP03-J-RAMPS-R1021-20261019-S02` | North Carolina State Extension Gardener Plant Toolbox, [*Allium tricoccum*](https://plants.ces.ncsu.edu/plants/allium-tricoccum/) | Species profile identifies ramps and lists leaves, stems, and bulbs as edible; reports strong garlic/onion fragrance and a native range including Québec. It supports the species and culinary-part boundary, not a Québec retail standard, measure, recipe substitution, safe-foraging protocol, or identification guarantee. Its `ramson`, `spring onion`, and `wild leek` common-name list is not transferred as aliases. `sourceKind: extension`. |

The NCSU *Allium tricoccum* source is distinct from the existing source URL with the `/allium-tuberosum/common-name/wild-leek/` path, which is owned by garlic-chive flowers and identifies *A. tuberosum*. Preserve that record and its source ID. No manufacturer or retailer measurement is used.

## Queue scope and disposition

This review addresses the open generic Section J allium identity checklist only. No queued brand, product-line, flavour-family, SKU, or retailer-variant-only task was researched. Such commercial-product counts do not add ingredient diversity; mark any such line out of scope and stop it. Preserve every existing branded entry and keep its evidence scoped to its named product.

Recommend an identity-only **ramps / ail trilobé** reference for *Allium tricoccum*. Keep aliases, forms, recipe links, measures, conversions, yields, and substitutions empty. Preserve the green-onion, leek, garlic, chive, and garlic-scape rows and their exact source-scoped observations. Section J's regional allium and spring-onion boundaries remain open.

## Link, encoding, and whitespace checks

- The relative Section J plan link resolves to the stated checklist lines.
- The OQLF and North Carolina State Extension source pages opened during this review.
- This proposal is UTF-8 without BOM with a final newline. No software tests or builds were run because this task is proposal-only.
