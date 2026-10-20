# WP05 Section S — animal fats, shortening, spreads, and spray boundaries

- **Review date:** 2026-10-12
- **Disposition:** proposal only; no catalog or shared integration files changed
- **Scope:** animal fats, vegetable shortening, margarine/baking spreads, and cooking spray
- **Plan state:** Section S remains open. The plan checklist still includes lard, tallow, suet, poultry fats, shortening, margarine, baking spreads, cooking spray, and state distinctions.

## Recommendation

Recommend a bounded, identity-only candidate tranche under `FAT_AND_OIL`: lard, leaf lard, rendered pork fat, beef suet, edible tallow, rendered duck fat, and vegetable shortening. Keep the current margarine reference as-is. Add no recipe links: the corpus has no lines naming the proposed fats or shortening, and all six margarine lines are already linked. Keep the lone `oil spray` line unlinked until its oil source and spray product state are clear.

The identities below use only exact, source-backed bilingual names. Do not give any of them broad aliases such as `pork fat`, `suet`, `poultry fat`, `shortening`, `graisse de porc`, `graisse végétale`, or `oil`. In particular, OQLF lists `graisse de porc` alongside `saindoux`, while Codex distinguishes lard from rendered pork fat; use the more specific French Codex name `graisse de porc fondue` for that separate candidate.

| Candidate / current state | Proposed English / fr-CA display | Alias decision | Boundary |
|---|---|---|---|
| `ingredient-ref-lard` — no current owner | `lard / saindoux` | None | Rendered pig fat. Keep separate from rendered pork fat and leaf lard. Avoid `graisse de porc` as an alias because that broad wording could collapse the Codex-distinct rendered-pork-fat product. [S01, S03, S05] |
| `ingredient-ref-leaf-lard` — no current owner | `leaf lard / saindoux de panne` | None | A specifically rendered internal abdominal fat product. Keep separate from general lard; do not make `leaf lard` or `graisse de panne` aliases of general lard. [S02–S04] |
| `ingredient-ref-rendered-pork-fat` — no current owner | `rendered pork fat / graisse de porc fondue` | None | Distinct from Codex lard by source tissues. The bilingual Codex standard supplies a precise French name, resolving the earlier terminology gap; do not alias `lard`, `saindoux`, or unqualified `graisse de porc`. [S05] |
| `ingredient-ref-beef-suet` — no current owner | `beef suet / suif de bœuf` | None | Beef kidney/loin/caul fat as named in the Canadian standard. Keep it as a source-part product, separate from rendered edible tallow. [S03, S06] |
| `ingredient-ref-tallow` — no current owner | `edible tallow / suif comestible` | fr-CA alias: `suif alimentaire` | Rendered edible tallow; the Québec terminology entry distinguishes edible from non-edible suif. Do not alias `suet` or `suif de bœuf` to this identity. [S05, S07] |
| `ingredient-ref-rendered-duck-fat` — no current owner | `rendered duck fat / gras de canard fondu` | None | Keep the exact rendered product distinct from unqualified duck-fat wording and from generic poultry fat. The bilingual Québec producer product supports this named product only; it does not define goose or chicken fats. [S11] |
| `ingredient-ref-shortening` — existing legacy candidate | `vegetable shortening / shortening végétal` | None | Reuse the stable legacy ID, narrowly scoped to the plant-derived shortening named by the candidate and Québec product labels. Do not alias plain `shortening`, margarine, lard, or the generic phrase `graisse végétale`. [S08–S10] |
| `ingredient-ref-margarine` — active | Keep `margarine / margarine`; no new aliases | None | Retain its current identity and six recipe links. Canadian standards define margarine as a water-in-fat emulsion, distinct from semi-solid shortening and rendered fats. Do not create a generic baking-spread alias or a lower-fat spread identity without exact product/recipe wording. [S03–S04] |

All candidate references are identity-only. No forms, measurements, densities, unit mappings, conversions, yields, or substitutions are proposed.

## Repository audit

I inspected the live split seed package, current Section S checklist, prior WP05 fats/oils proposals and integration notes, related WP04 butter-product decisions, legacy candidates, research ledger, and all manifest-listed recipe files. The snapshot during this review contained **1,133 ingredient references, 79 forms, 71 legacy candidates, 114 recipes with 1,123 ingredient rows, and 1,430 ledger records**. These counts are a working-tree snapshot and should be rerun before any integration.

- Exact normalized checks against active reference displays and aliases, form labels/match terms, and legacy names/aliases found no current owner for the proposed animal-fat names, the spray phrases, or baking spreads. The one exception is the exact legacy candidate `ingredient-ref-shortening` (`vegetable shortening / shortening végétal`). `margarine / margarine` is already active with no aliases.
- None of the 79 current forms belongs to the proposed animal-fat, shortening, margarine, spread, or spray identities.
- Relevant ledger records include `ingredient-ref-shortening` (unreviewed legacy candidate), `ingredient-ref-margarine` (active ref record with no sources; its old draft numeric data was removed), and unresolved `ingredient-ref-salt-pork`. There are no dedicated ledger records for lard, leaf lard, rendered pork fat, suet, tallow, poultry fat, baking spreads, or cooking spray.
- Existing adjacent decisions remain in force: `candidate-clarified-butter` stays separate from active ghee; cultured and browned butter remain held; the salt-pork candidate remains unresolved. Do not map salt pork or recipe bacon to the pure-fat identities proposed here.
- The previous WP05 Section S review held animal fats and shortening for a separate pass. This proposal supplies the narrower bilingual animal-fat distinctions and product evidence for that pass. It does not change the completed oil tranches or revisit their canola, vegetable-oil, mustard-oil, groundnut, crude-palm, or red-palm decisions.

## Recipe-demand scan

All ingredient rows in all 114 manifest-listed recipes were scanned by original wording, ingredient name, and reference link. I also checked the bilingual instruction text for preparation uses of sprays.

| Recipe wording | Ingredient rows | Current disposition |
|---|---:|---|
| Lard, leaf lard, rendered pork fat, suet, tallow, duck/goose/chicken fat, schmaltz | 0 | No recipe links support a species or product-state choice. |
| Shortening, vegetable shortening, baking spread | 0 | No recipe links. |
| Margarine | 6: `009#1`, `015#3`, `047#5`, `052#5`, `069#5`, `103#5` | All are already linked to `ingredient-ref-margarine`; retain them. |
| `oil spray` | 1: `033#8` | Unlinked; retain as unresolved. The source recipe uses the same phrase in its instructions but names no oil source or delivery mechanism. |

Cooking-spray wording also appears in method text: English `cooking spray` in recipes 019, 023, 033, 050, and 054; the French localization uses `enduit à cuisson` in recipes 019, 020, 023, 033, 050, and 054. Those method-only occurrences do not establish additional ingredient rows. The source recipe for 033 calls the ingredient `oil spray` and says to spray with oil spray; it does not state that the product is an aerosol or identify the oil. [S12]

No recipe links are proposed. The six margarine links stay unchanged; the single source-unspecified spray line remains unlinked.

## Product and naming boundaries

- **Lard vs. leaf lard vs. rendered pork fat:** OQLF pairs `saindoux` with `lard` and treats `saindoux de panne / leaf lard` as a specific product made from internal fat. Codex separately names lard and rendered pork fat, with distinct source-tissue descriptions and French names. Do not use `graisse de porc` as a cross-alias between the latter products. [S01–S05]
- **Suet vs. tallow:** OQLF gives `suif de bœuf / beef suet` for fat around the kidneys in the butchery domain and separately gives `suif comestible / edible tallow` for rendered edible fat. The Canadian standard identifies suet by its beef-carcass source parts; Codex defines edible tallow as rendered fat from bovine and/or sheep sources. These names must remain separate. [S03, S05–S07]
- **Poultry fats:** The Québec-market bilingual producer page supports `rendered duck fat / gras de canard fondu`. A separate Canadian chicken-schmaltz product is not Québec terminology authority and does not establish `schmaltz` as a safe alias for all poultry fat. Keep goose fat, chicken fat, and generic poultry fat held until exact bilingual food-product terms and species/state boundaries are supported. [S11]
- **Vegetable shortening vs. margarine:** CFIA defines shortening as a semi-solid food from fats/oils and margarine as a water-in-fat emulsion. OQLF warns that French `shortening` may describe several solid cooking fats and prefers context-specific wording. The existing candidate is explicitly *vegetable* shortening, and a Québec retailer and Crisco Canada use the narrow product wording. Keep that candidate separate from margarine and avoid unqualified `shortening` aliases. [S03–S04, S08–S10]
- **Margarine vs. baking spreads:** The active margarine row has direct recipe demand. “Baking spread” has no ingredient-line demand and may cover products that do not meet the margarine standard or share one composition. Do not alias baking spread, margarine, butter, or shortening. Clarified butter/ghee remain separate per WP04; no new clarified-fat or water-containing forms are proposed. [S03–S04]
- **Cooking spray vs. oil spray:** A current Canadian canola cooking-spray listing shows a multi-ingredient aerosol product, while the recipe line says only `oil spray`; it could mean that packaged product or oil dispensed from another sprayer. Keep `oil spray`, `cooking spray`, and `enduit à cuisson` without an active identity or aliases until recipe/product evidence resolves that scope. Do not assign it to canola oil or generic vegetable oil. [S12–S13]

## Held candidates

| Candidate | Disposition | Reason |
|---|---|---|
| Generic rendered pork fat under `graisse de porc` | Hold alias | OQLF uses the phrase as a broad lard term, while Codex distinguishes rendered pork fat from lard. Use only the precise French phrase `graisse de porc fondue` on the rendered-pork-fat candidate. |
| Generic `suet` as an alias for tallow | Hold alias | OQLF associates the English terms, but the Canadian and Codex product definitions separate source-part suet from rendered tallow. |
| Goose fat, chicken fat, `schmaltz`, generic poultry fat | Hold | The bounded scan did not establish a Québec bilingual pure-fat product name for each species. A product called schmaltz may have a specific species; do not broaden it. |
| Generic `shortening` and `graisse végétale` | Hold aliases | Both can cover fat classes wider than the vegetable-shortening candidate. The legacy candidate and product sources support only the narrower named product. |
| Baking spread, reduced-fat spread, butter-style spread | Hold | No bundled ingredient line names these products; composition is product-specific and not interchangeable by name with margarine or butter. |
| Cooking spray / oil spray / enduit à cuisson | Hold identity for now | Method text establishes spray use, but the one ingredient row leaves source and delivery system unspecified. Retail aerosol composition is product-specific and does not resolve this recipe's intended product. |
| Clarified fats, unrepresented fat-state forms, melted/solid states, and fat conversions | Hold | Existing WP04 butter-product boundaries remain active. No recipe demand or source in this review justifies forms, numeric behavior, or conversion rules. |

## Source manifest

All external sources were checked on 2026-10-12. Source IDs below are proposal-local citations only; this proposal does not write to the research ledger.

| ID | Source | Supports and limits |
|---|---|---|
| `WP05-S-FATS-SPREADS-20261012-S01` | OQLF, [saindoux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408998/saindoux) | Québec food-fat term `saindoux / lard`. Its note says ordinary `saindoux` has broadened to pork fat from multiple body parts unless a special name is stated; this is why no broad cross-alias is proposed. |
| `WP05-S-FATS-SPREADS-20261012-S02` | OQLF, [saindoux de panne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8890114/saindoux-de-panne) | Québec term `saindoux de panne / leaf lard` and a distinction from industrial lard. |
| `WP05-S-FATS-SPREADS-20261012-S03` | CFIA, [Canadian Food Compositional Standards, Volume 8 — Fats and Oils](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Current Canadian definitions for lard, leaf lard, suet, shortening, margarine, and calorie-reduced margarine. Used for named-product boundaries only; no numeric criteria are copied into the proposal. |
| `WP05-S-FATS-SPREADS-20261012-S04` | CFIA, [Normes canadiennes de composition des aliments, Volume 8 — Graisses et huiles](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0) | French counterpart for the Canadian names and compositional distinctions cited in S03. |
| `WP05-S-FATS-SPREADS-20261012-S05` | Codex Alimentarius, [Standard for Named Animal Fats, CXS 211-1999, English](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/hu/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+211-1999%2FCXS_211e.pdf) and [French](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pt/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B211-1999%252FCXS_211f.pdf) | Distinguishes lard, rendered pork fat, premier jus, and edible tallow by animal source, tissues, and rendering. Supports the exact French rendered-pork-fat term `graisse de porc fondue` and edible-tallow product boundary; not culinary interchangeability. |
| `WP05-S-FATS-SPREADS-20261012-S06` | OQLF, [suif de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432970/suif-de-boeuf) | French/English term pair `suif de bœuf / beef suet`; identifies fat around kidneys and labels the phrase a general butchery term. The recipe-catalog proposal keeps the beef qualifier explicit. |
| `WP05-S-FATS-SPREADS-20261012-S07` | OQLF, [suif comestible](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410404/suif-comestible) | Direct pair `suif comestible / edible tallow`, with `suif alimentaire` also preferred in Québec French. The entry warns that not all commercial suif is edible. |
| `WP05-S-FATS-SPREADS-20261012-S08` | OQLF, [graisse alimentaire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/24198175/graisse-alimentaire) | Explains the broad usage of English `shortening` in French and recommends a context-specific French fat term. Does not support a global alias for shortening. |
| `WP05-S-FATS-SPREADS-20261012-S09` | Crisco Canada, [All-Vegetable Shortening](https://criscocanada.com/product/all-vegetable-shortening/) and [Shortening Tout Végétal](https://criscocanada.com/fr-ca/produit/all-vegetable-shortening/) | Bilingual Canadian manufacturer product wording for vegetable shortening. Its ingredients and performance belong to that SKU, not to every shortening. |
| `WP05-S-FATS-SPREADS-20261012-S10` | Mayrand, Québec, [Shortening végétal Crisco](https://mayrand.ca/fr/nos-produits/epicerie/ingredient-de-patisserie/shortening-et-saindoux/shortening-vegetal-crisco-00981) | Current local retail wording matching the existing legacy candidate's French display. Product listing supports the exact term, not a general vegetable-fat alias. |
| `WP05-S-FATS-SPREADS-20261012-S11` | Canards du Lac Brome, [Gras de canard fondu](https://canardsdulacbrome.com/produits/gras-de-canard-fondu/) and [Rendered Duck Fat](https://canardsdulacbrome.com/en/produits/rendered-duck-fat/) | Bilingual Québec manufacturer product with rendered duck fat as its ingredient. Supports that exact product name only, not a broad duck/poultry-fat family. |
| `WP05-S-FATS-SPREADS-20261012-S12` | Plated Cravings, [Air Fryer Churros](https://platedcravings.com/air-fryer-churros/#wprm-recipe-container-7808) | Ingredient list and directions use `oil spray`; the recipe does not name an oil source or aerosol format. Supports the corpus scan, not a global cooking-spray identity. |
| `WP05-S-FATS-SPREADS-20261012-S13` | Walmart Canada, [Great Value Canola Cooking Spray](https://www.walmart.ca/fr/ip/GREAT-VALUE-PL-GV-HUILE-DE-CANOLA/6000205247896) | Canadian French product name and ingredient panel show one formulated aerosol cooking spray with a named oil and other ingredients. Product-specific only; it cannot resolve the recipe's unqualified `oil spray`. |

## Limitations

- The OQLF terminology entries for animal fats are older, so their names are paired with current Canadian and Codex product standards rather than treated as modern market-frequency evidence.
- Product listings establish the names and compositions of those specific products only. They do not support substitutions, global measures, conversions, or claims that an unqualified recipe phrase selects a particular source or product state.
- This is a proposal, not an integration instruction. Recheck live names, aliases, IDs, recipe rows, and counts before any later integration.
- No tests or emulator checks were run because this task only adds a research proposal document.
