# WP05 Section T — Curry powder identity review

- **Packet type:** proposal-only identity, bilingual naming, blend-boundary, collision, and recipe-demand review.
- **Prepared and source-access date:** 2026-10-11.
- **Plan:** Section T, open item “Garam masala, curry powders, chaat masala, sambar/rasam powders, and panch phoron.” The chaat-masala and garam-masala subitems are already documented; curry powder remains to be reviewed.
- **Status:** Integrated. Added the French search alias `poudre de curry` to the existing `ingredient-ref-curry-powder` record; preserved all recipe links and texts.
- **Source IDs:** `WP05-CURRY-POWDER-20261011-S01` through `S12`. The prefix was checked against the current catalog proposal and ledger files and had no existing match.

## Recommendation

Keep the existing `ingredient-ref-curry-powder` identity and canonical names `curry powder / poudre de cari`. Add only the French search alias `poudre de curry`. The alias is directly used on a French-language Canadian retailer listing and by a Laval retailer, while OQLF recognizes French `curry` as a term for the spice blend [S01, S08–S09]. The preferred display remains `poudre de cari`, supported by OQLF-aligned usage in Santé Canada and Canadian manufacturer product pages [S01–S04, S07]. The exact phrase `poudre de curry` is observed retail wording, not a phrase specifically ruled on by OQLF.

This is a narrow alias proposal, not a new identity. Add no English aliases, formula, form, density, unit mapping, conversion, substitution, package yield, or recipe link. Leave all recipe rows unchanged.

| Field | Current value | Proposed value |
|---|---|---|
| ID | `ingredient-ref-curry-powder` | No change |
| Category | `BAKING_AND_SPICE` | No change |
| English display | `curry powder` | No change |
| French display | `poudre de cari` | No change |
| English aliases | None | None |
| French aliases | None | `poudre de curry` |
| Density / unit mappings | None | None |
| Forms / conversions / substitutions | None | None |

## Pre-integration repository snapshot

Read-only snapshot on 2026-10-11: **1,042 active ingredient references, 72 forms, 75 legacy candidates, 1,334 research-ledger records, and 114 manifest-listed recipes with 1,123 ingredient rows.** The counts were read from the live split seed package, candidate file, ledger, and manifest-listed recipe files; they are snapshot counts, not quality claims.

The current active row has empty English and French alias arrays. Its ledger record has `identityState: unreviewed`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, with no sources or decisions. No ingredient form mentions curry or cari, and no legacy candidate name or alias matched those terms.

## Existing proposal cross-check

The [WP06 South Asian sweep](wp06-south-asian-cuisine-gap-sweep-20261010.md) records curry powder, curry paste, and garam masala as existing identities and explicitly keeps curry leaves distinct from both powder and paste. The [garam-masala review](wp05-garam-masala-identity-review-20261011.md) and [chaat-masala review](wp05-chaat-masala-identity-review-20261011.md) keep those blends separate from curry powder. The [regional-blends review](wp05-regional-spice-blends-ras-el-hanout-baharat-dukkah-review-20261011.md) likewise treats curry powder as a distinct neighboring blend. These prior packets support repository continuity; external naming and formula claims below are mapped to this packet’s source IDs.

### Exact collision audit

Candidate terms were normalized for case, Unicode compatibility, and whitespace, then compared with active reference names and aliases, form labels and match terms, and legacy candidate names and aliases.

| Term | Exact current match | Result |
|---|---|---|
| `curry powder` | `ingredient-ref-curry-powder` English display | Existing identity |
| `poudre de cari` | `ingredient-ref-curry-powder` French display | Existing identity |
| `poudre de curry` | None | No catalog/form/legacy collision; eligible as the proposed French alias |
| `curry paste` / `pâte de cari` | `ingredient-ref-curry-paste` | Separate active identity |
| `curry leaves` / `feuilles de cari` | `ingredient-ref-curry-leaves` | Separate active identity |
| `garam masala` / `garam massala` | `ingredient-ref-garam-masala` | Separate active identity and spelling aliases |
| `chaat masala` | `ingredient-ref-chaat-masala` | Separate active identity |
| `mild curry powder`, `red curry powder`, `Madras curry powder`, `poudre de cari doux`, `poudre de cari rouge`, `poudre de cari jamaïcaine` | None | No exact collision; do not add these as generic aliases |

There is no curry-powder form or legacy candidate to promote. The existing record is already correctly typed as a dry spice blend; the review supports one search synonym only.

## Québec-facing names and alias limits

OQLF defines `cari` as a variable-composition Indian-origin spice blend, with turmeric, coriander, cardamom, cumin, and ginger as usual examples. Its preferred French terms include `cari`, `carry`, `cary`, and `curry`; its English terms are `curry` and `curry powder` [S01]. This supports the existing French display and confirms that `curry` is acceptable in Québec French. It does not by itself establish every compound spelling as a preferred label.

Santé Canada uses the dish title `Cari aux pois chiches et aux légumes` and the ingredient wording `poudre de cari`; Club House’s paired Canadian pages use `Curry Powder / Poudre de cari`, and Québec manufacturer Épices Crousset uses `Poudre de cari / Curry Powder` [S02–S04, S07]. Those sources support retaining the current canonical pair. Walmart Canada’s French listing uses the exact title `POUDRE DE CURRY`; a Laval retailer also titles its product `Poudre de curry` [S08–S09]. Together with OQLF’s accepted French `curry`, these support adding `poudre de curry` only as a search alias.

Do not add bare `cari` or `curry` as aliases. Although OQLF recognizes each as a term for the blend, they are also used for curry dishes and broader recipe contexts, so matching the unqualified word would be less precise than the existing product phrase. Do not add `carry`, `cary`, `poudre de carry`, or `poudre de cary`: OQLF accepts the bare spelling variants, but the reviewed sources do not attest these product phrases. Do not add `Indian curry powder`, `curry spice`, or `curry masala` without direct product-name evidence.

Keep `mild`, `red`, `Madras`, and `Jamaican` wording specific. OQLF describes general curry blend heat as ranging from mild to strong; Santé Canada mentions Jamaican curry powder as an option for a hotter recipe, and the university text names a regional Chennai curry blend [S01–S02, S11]. These are not evidence that each qualified name is interchangeable with unqualified curry powder. None is proposed as an alias or as a new identity in this packet.

## Blend composition and product boundaries

The sources do not establish one universal formula. OQLF describes usual spices but explicitly allows variable quantities and additional spices [S01]. Canadian product declarations also differ by SKU:

| Product example | Declared composition in the cited source | Limit |
|---|---|---|
| Club House Curry Powder | Spices including turmeric and red pepper; dehydrated onion; sulfites [S03–S04]. | Manufacturer declaration for this product; the page says to follow the package label for current information. |
| McCormick Gourmet Curry Powder mild / Poudre de cari doux | Fenugreek, coriander, cumin, celery seed, ginger, turmeric, mace, black pepper, and dehydrated garlic [S05–S06]. | Named mild SKU; not a general formula. |
| Épices Crousset Poudre de cari / Curry Powder | Spices including mustard, rice flour, onion, and garlic [S07]. | One Québec product; not a standard for all curry powder. |

Keep the compound identity broad enough for these product variations. Do not encode required components, proportions, heat, salt, flour or starch content, or allergen assumptions. Do not infer density or spoon-to-weight data from the generic identity.

| Neighboring product | Evidence and boundary | Catalog treatment |
|---|---|---|
| Curry paste | The active catalog has separate dry-blend and sauce/condiment rows. A university cookery text distinguishes fine-ground dry masala from wet-ground masala used to make pastes [S11]. Recipe 086 also requests `2 tsp curry powder` and `2 tsp curry paste` as separate lines; recipe 095 separately requests red curry paste. | Keep separate. Rehydrating powder for a particular method does not make it a universal equivalent or alias for commercial curry paste. No conversion or substitution is proposed. |
| Curry leaves | India’s Spices Board identifies curry leaf as *Murraya koenigii* and the commercial part as its leaf [S12]. The active row is `ingredient-ref-curry-leaves / curry leaves / feuilles de cari`. | Keep the botanical leaf separate from the powdered blend. Never alias one to the other based on the shared word `curry`. |
| Garam masala | OQLF defines `garam massala / garam masala` as a distinct aromatic ground-spice blend [S10]. Santé Canada lists `poudre de cari` and `garam masala` separately in the same recipe [S02]; recipe 086 does the same. | Keep `ingredient-ref-garam-masala` separate. Do not cross-alias or substitute. |
| Chaat masala | The university text lists chaat masala powder and a regional curry powder as separate named mixes, and describes chaat masala as a savory powder sprinkled over snacks and chaat [S11]. The active `ingredient-ref-chaat-masala` row and its identity review are also distinct. | Keep separate. Do not alias generic curry powder, `curry masala`, or snack-seasoning language to chaat masala. |

The boundary evidence establishes separate names and product classes; it does not establish reusable substitutions among the blends.

## Bundled recipe demand and line audit

The audit covered all **114 manifest-listed recipe files and 1,123 ingredient rows**, searching original ingredient text, ingredient names, preparation, notes, and linked reference IDs for curry/cari and adjacent blend terms.

| Recipe evidence | Exact ingredient rows | Interpretation |
|---|---|---|
| 086, *Butter Chicken / Poulet au beurre*, row 6 | `2 tsp curry powder` → `ingredient-ref-curry-powder` | One exact demand line for the current identity; preserve the existing link. |
| 086, rows 7–8 | `2 tsp garam masala` → `ingredient-ref-garam-masala`; `2 tsp curry paste` → `ingredient-ref-curry-paste` | Same recipe directly demonstrates separate ingredient requests for the adjacent blends and paste. |
| 095, *Satay*, row 4 | `1 to 2 tbsp red curry paste` → `ingredient-ref-red-curry-paste` | Separate red curry paste request, not curry powder demand. |
| 083, *Poudre de cari / Curry Powder* | No curry-powder ingredient row; its six rows are turmeric, ground cumin, coriander, black pepper, ground mustard seeds, and ginger. | A source recipe for one homemade blend formula, not a recipe request for a packaged powder ingredient and not a universal formula. |
| Remaining bundled ingredient rows | No exact curry-powder, curry-leaf, or chaat-masala ingredient line found. | No recipe links or text changes proposed. |

Thus the bundle contains **one direct curry-powder ingredient line**. Its recipe 083 title and component list are useful evidence of a single preparation but do not create a second direct ingredient demand.

## Source-to-claim register

All sources were accessed on 2026-10-11 unless a source’s own page date is noted. Product pages support only the named SKU and its displayed ingredient statement.

| ID | Source | Supports and limits |
|---|---|---|
| **WP05-CURRY-POWDER-20261011-S01** | Office québécois de la langue française, [cari (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8355168/cari). Last updated 2017. | French preferred terms `cari`, `carry`, `cary`, `curry`; English terms `curry` and `curry powder`; blend definition and variable usual-component note. Does not specifically endorse the compound `poudre de curry`. |
| **WP05-CURRY-POWDER-20261011-S02** | Santé Canada, [Cari aux pois chiches et aux légumes](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire/manger-favoriser/cuisine/recettes/cari-pois-chiches-legumes.html), page dated 2026-04-10. | Uses the dish name `cari`, the exact ingredient `poudre de cari`, and separate `garam masala`; mentions Jamaican curry powder as one recipe’s hotter option. A public recipe, not a formula standard. |
| **WP05-CURRY-POWDER-20261011-S03** | Club House Canada, [Curry Powder](https://www.clubhouse.ca/en-ca/products/herbs-and-spices/spices/curry-powder). | Current Canadian English product name and one SKU’s declaration. Supports product identity and formula variation only for this SKU. |
| **WP05-CURRY-POWDER-20261011-S04** | Club House Canada, [Poudre de cari](https://www.clubhouse.ca/fr-ca/produits/fines-herbes-et-epices/epices/poudre-de-cari). | Paired French product name and matching product declaration with S03; corroborates the bilingual label, not an independent product formula. |
| **WP05-CURRY-POWDER-20261011-S05** | McCormick Gourmet Canada, [Curry Powder mild](https://www.clubhouse.ca/en-ca/mccormick-gourmet/products/herbs/curry-powder-mild). | Named mild SKU and its ingredient declaration. Product-specific evidence only. |
| **WP05-CURRY-POWDER-20261011-S06** | McCormick Gourmet Canada, [Poudre de cari doux](https://www.clubhouse.ca/fr-ca/mccormick-gourmet/produits/fines-herbes/poudre-de-cari-doux). | Paired French product name and declaration with S05; not a universal formula. |
| **WP05-CURRY-POWDER-20261011-S07** | Épices Crousset, [Poudre de cari / Curry Powder TJX](https://crousset.com/poudre-de-cari-curry-powder-tjx/). | Québec manufacturer page with bilingual product name and one SKU’s ingredients. Does not establish a standard composition. |
| **WP05-CURRY-POWDER-20261011-S08** | Walmart Canada, [POUDRE DE CURRY](https://www.walmart.ca/fr/ip/POUDRE-DE-CURRY/6000196867387). | French-language listing sold by Walmart with exact `POUDRE DE CURRY` title and product description. Its ingredient information is seller-supplied and includes an apparent typo, so it supports wording only, not formula. |
| **WP05-CURRY-POWDER-20261011-S09** | Distribution LovAf, [Poudre de curry](https://distributionlovaf.ca/products/poudre-de-curry), listed address in Laval, Québec. | Local French retail wording for the product phrase `poudre de curry`; supports a search alias, not an OQLF ruling or a formula. |
| **WP05-CURRY-POWDER-20261011-S10** | Office québécois de la langue française, [garam massala (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502426/garam-massala). Last updated 2009. | Defines the separate neighboring blend and lists its preferred French spellings. Used only for the boundary from curry powder. |
| **WP05-CURRY-POWDER-20261011-S11** | Uttarakhand Open University, *Introduction to Indian Cookery*, BHM-401T, [course PDF](https://www.uou.ac.in/sites/default/files/slm/BHM-401T.pdf), Unit 3, pp. 37–40 (PDF pp. 36–39). | Separates dry and wet-ground masala forms; lists garam masala, chaat masala powder, named regional curry powder, and other blends independently; describes chaat masala use. Its formulas are instructional examples, not universal standards. |
| **WP05-CURRY-POWDER-20261011-S12** | Spices Board India, [Curry Leaf](https://indianspices.com/spice-catalog/curry-leaf.html), last updated 2015. | Identifies *Murraya koenigii* and leaf as the commercial part, supporting the botanical curry-leaf boundary. It does not define curry powder. |

## Disposition and limits

Retain the existing row and French alias `poudre de curry`. Keep the display `poudre de cari`; retain separate curry-paste, curry-leaf, garam-masala, and chaat-masala identities. Keep formulas SKU-specific and regional or heat-qualified wording outside the generic alias set. Preserve all recipe links and texts.

The curry powder, sambar/rasam powder, and panch phoron named-blend subchecklist is integrated. Other Section T items remain open. No tests or emulator were run for this database JSON change; structural package and ledger validation is recorded in the [Section T integration README](../batches/wp05-section-t-spice-blends-identity-integration-20261011/README.md).

**Encoding:** UTF-8 without BOM.
