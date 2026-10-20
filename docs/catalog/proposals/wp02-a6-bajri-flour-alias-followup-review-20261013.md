# WP02 A6 regional flour follow-up: Bajri flour alias — 2026-10-13

## Review record

- **Reviewed and sources accessed:** 2026-10-13.
- **Status:** Integrated with an additional picker-preserving grain alias; see the [integration record](../batches/wp02-a6-bajri-flour-alias-integration-20261013/README.md).
- **Selected open leaf:** At review time, the exact English phrase **bajri flour** remained unintegrated in the WP02 A6 checklist. Thinai was already integrated. This was a fresh recheck of the pearl-millet-flour spelling proposal, not a Thinai follow-up.
- **Scope:** Decide whether the single English phrase **bajri flour** belongs as an alias on the existing pearl-millet-flour reference.
- **Plan context:** The A6 parent remains open. The checklist retains the French alias **farine de millet perlé** on the pearl-millet-flour row; the specific Bajri follow-up is now integrated ([plan, A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1289)).
- **Prior review:** The 2026-10-12 proposal recommended this alias but used a catalog snapshot from before the French alias and later measurement/substitution evidence were reflected in the target ledger. This report refreshes that evidence and the live audit; it does not edit the earlier proposal.
- **Source IDs:** WP02-A6-BAJRI-FLOUR-FOLLOWUP-20261013-S01 through S06. These were checked unused at the pre-integration snapshot and are now attached to the two accepted ledger decisions. Existing measurement and substitution sources already in the target ledger are referenced by their existing IDs below.

## Integration decision

Add **bajri flour** to the English aliases of **ingredient-ref-pearl-millet-flour**. Also add **bajri** to the English aliases of the existing **ingredient-ref-pearl-millet** grain row. APEDA records Bajri as a Marathi and Gujarati name for pearl millet [S06]. This second alias keeps a bare `bajri` query from returning the newly matched flour alone; the query now offers both grain and flour, while `bajri flour` selects only flour.

Keep the flour display pair **pearl millet flour / farine de mil chandelle**, its existing English alias **bajra flour**, and French alias **farine de millet perlé**. Keep both reference categories, null densities, and empty unit mappings unchanged. Do not create another ingredient identity.

The exact phrase has direct Canadian product evidence: the Ontario mill Puremill titles a product “Bajri Flour” and describes it as “Bajri Flour (Pearl Millet Flour)” made from pearl-millet grain; Walmart Canada has a separate current listing with the same phrase pairing and an ingredient declaration of pearl-millet flour [S02–S03]. FSSAI’s current cereal standard separately defines **Bajra Flour (Pearl Millet Flour)** as a product milled from pearl-millet grains, supporting the product boundary without treating Bajri and Bajra spellings as interchangeable by inference alone [S01].

| Candidate or field | Disposition | Evidence boundary |
|---|---|---|
| **bajri flour** | **Accept as the sole new English alias** on ingredient-ref-pearl-millet-flour. | Exact product wording is directly paired with pearl millet flour by a Canadian mill and Canadian retail listing [S02–S03]. |
| Existing **bajra flour** alias | Retain. | The live row already owns it; FSSAI also defines Bajra Flour (Pearl Millet Flour) [S01]. |
| Bare **bajri** | Add as an English alias on the existing pearl-millet grain row. | APEDA lists Bajri as a Marathi and Gujarati name for pearl millet [S06]. This preserves both grain and flour choices for a bare query after adding the qualified flour alias. |
| **bajri atta**, **bajra atta**, **bajree**, **farine de bajri**, **farine de bajra** | Do not add. | This bounded decision covers the directly evidenced exact phrase only. Some marketplace copy uses “atta” in product titles, but this pass does not generalize from those variable labels or from sprouted-product wording. No French Bajri/Bajra flour phrase is proposed. |
| French display and alias | Retain **farine de mil chandelle** and **farine de millet perlé**. | Codex supplies the existing French product name; OQLF gives Québec pearl-millet terminology; a Québec grocery product ingredient list uses **farine de millet perlé** [WP02-S34, S04–S05]. |
| Product boundary | Keep pearl millet flour separate from generic millet flour, finger-millet flour, grain, sprouted pearl-millet flour, and mixed-millet products. | The proposed name denotes plain pearl-millet flour. It does not establish a universal extraction, grind, whole-grain, or sprouting state. |

## Source and naming findings

FSSAI’s Version 4 cereal standard defines **Bajra Flour (Pearl Millet Flour)** as a product obtained by milling pearl-millet grains. That authoritative standard supports the product identity and the existing **bajra flour** wording; it does not itself establish the spelling **bajri flour** as a Canadian term or support a recipe measure [S01].

The new spelling evidence comes from Canadian product pages that state the relationship directly. Puremill, an Ontario mill with locations in Stoney Creek, Hamilton, and Burlington, titles its product **Puremill Bajri Flour** and states that it is pearl-millet flour made from pearl-millet grains [S02]. Walmart Canada’s current Angur listing titles the item **Angur Bajri Flour / Bajra Flour (Pearl Millet Flour)** and declares pearl-millet flour as the ingredient [S03]. The Walmart listing is marketplace-supplied product copy, so it corroborates current Canadian retail wording; the direct mill page is the stronger manufacturer evidence. Neither page establishes universal milling or whole-grain specifications. Puremill’s cold-milling description applies to its product only.

For French-Canadian naming, OQLF lists **millet perle** and **millet à chandelle** as preferred Québec names for pearl millet and gives **pearl millet** as the English equivalent [S04]. Metro’s Québec grocery listing uses **farine de millet perlé** in a French-facing ingredient declaration; its English-facing page identifies the corresponding component as pearl millet flour [S05]. These sources support retaining the existing French alias. The canonical French display remains the Codex product wording **farine de mil chandelle** already cited in target ledger source WP02-S34. No French transliteration of Bajri or Bajra is recommended.

The qualified phrase maps to the existing pearl-millet-flour identity, and the independently source-backed bare term maps to the existing pearl-millet grain identity. The two rows remain separate; **bajri flour** is not attached to the grain, and neither term is merged into generic millet flour. Existing A6 holds on sprouted pearl-millet flour and other unresolved millet-flour species remain out of scope.

## Pre-integration catalog, ledger, ownership, and snapshot audit

Snapshot read from the shared working tree immediately before integration on 2026-10-13. Hashes cover exact file bytes.

| Surface | Current count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,331 rows | 24a903c5ebb3cb254e179d9110ac05203115bd394b4ec96d62e7d9756557c05e |
| Ingredient forms | 98 rows | b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c |
| Legacy import candidates | 64 rows | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| Seed manifest | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Research ledger | 1,639 records | 86c94384e93edee7e403c4cd86ec06a8a021cea82a17a25560ef21bc9ca211c4 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

The exact-key audit used the project search normalization (NFKD, lowercase, compatibility folds for œ/æ/ß and ampersand, accent removal, punctuation to spaces, and whitespace collapse) across current reference names/aliases, form labels/match terms, legacy names/aliases, and ledger record IDs. Before integration, the pearl-millet-flour row was **pearl millet flour / farine de mil chandelle**, with English alias **bajra flour**, French alias **farine de millet perlé**, category **FLOUR_AND_STARCH**, null default density, and no unit mappings. The grain row separately owned **bajra**. The exact query projection below reflects the integrated aliases.

| Exact key or ID | Reference owner | Form owner | Legacy owner | Ledger record-ID owner |
|---|---|---|---|---|
| **bajri flour** | None | None | None | None |
| **bajri** | None | None | None | None |
| **bajri atta** | None | None | None | None |
| **bajra atta** | None | None | None | None |
| **bajra flour** | ingredient-ref-pearl-millet-flour | None | None | None |
| **bajra** | ingredient-ref-pearl-millet | None | None | None |
| **pearl millet flour** | ingredient-ref-pearl-millet-flour | None | None | None |
| **farine de mil chandelle** | ingredient-ref-pearl-millet-flour | None | None | None |
| **farine de millet perlé** | ingredient-ref-pearl-millet-flour | None | None | None |
| Proposed ID **ingredient-ref-bajri-flour** | None | None | None | None |

At the pre-integration snapshot, the candidate phrase was absent from the ledger’s source, decision, finding, and observation text. The earlier 2026-10-12 Bajri proposal and its five review-local source IDs remain documentation only. The six source IDs in this review are now allocated to the accepted grain and flour decisions.

The target ledger record is already **identityState: verified**, **measurementState: researched_supported**, and **substitutionResearchState: blocked_pending_evidence**. These current states reflect research added after the earlier Bajri proposal. This alias proposal does not require a new ingredient-reference record or a change to those states.

## Picker phrase behavior

The projection below follows the current phrase-first matching logic in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete query words inside a catalog term match before partial-substring fallback. This is a static projection with the two integrated aliases; it is not an app or emulator test.

| Query | Current result | Result after adding **bajri flour** | Interpretation |
|---|---|---|---|
| **bajri flour** | No result | ingredient-ref-pearl-millet-flour only | Exact qualified query selects the plain pearl-millet-flour row. |
| **bajri** | No result | ingredient-ref-pearl-millet and ingredient-ref-pearl-millet-flour | APEDA-backed grain alias and the complete word in the flour alias retain both choices. |
| **bajra flour** | ingredient-ref-pearl-millet-flour only | Same | Existing qualified alias remains unchanged. |
| **bajra** | ingredient-ref-pearl-millet and ingredient-ref-pearl-millet-flour | Same | Existing grain/flour choice pair remains unchanged. |
| **pearl millet flour** | ingredient-ref-pearl-millet-flour only | Same | Canonical English display remains unchanged. |
| **millet perlé** | ingredient-ref-pearl-millet and ingredient-ref-pearl-millet-flour | Same | The current grain and French flour alias continue to offer both choices. |

## Bundled recipe demand

All **114 manifest-listed recipe files** and all **1,123 ingredient rows** were scanned. The search applied repository-style normalization to serialized recipe text and ingredient-row fields; it also checked direct ingredientRefId links to the target row.

Candidate terms included **bajri flour**, **bajri**, **bajri atta**, **bajree**, **bajra flour**, **bajra atta**, **bajra**, **pearl millet flour**, **farine de mil chandelle**, **farine de millet perlé**, **sprouted bajri flour**, and **sprouted bajra flour**.

- Recipe-file hits: **0**.
- Ingredient-row hits: **0**.
- Direct links to ingredient-ref-pearl-millet-flour: **0**.
- Manifest hash: b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984.
- Recipe-corpus fingerprint: 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c.

This is a catalog-coverage decision supported by product naming, not by bundled recipe demand. No recipe or recipe-line update is proposed.

## Measurements and substitutions

The live row remains null for default density and has empty unit mappings. Relevant measurements already recorded in its ledger were rechecked on 2026-10-13:

- Health Canada’s Canadian Nutrient File lists food code 6186, **Grains, millet, flour**, with 250 mL = 125.7 g and a 20.0 g serving. This code is generic millet flour and does not identify pearl millet, so its household portion is not transferable to this species-qualified row. It remains source-specific evidence only [existing source WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S05].
- A flour study reports bulk density **0.63 ± 0.01 g/mL** for its laboratory-prepared whole pearl-millet flour. The protocol fills a dry 100 mL cylinder with 50 g of flour and taps it until the volume stops decreasing. This is a sample- and method-specific lab observation, not a household cup mapping or a product-independent default [existing source WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S06].
- A 2016 study tested 1%, 2%, 5%, and 10% pearl-millet-flour replacement in a wheat-flour composite for one Tunisian bread formulation and reported favorable results at 5%. That is not a general replacement ratio for other breads, flatbreads, cakes, thickening, or products [existing source WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S07].

The target ledger therefore retains its research-backed observation and formula-specific finding, while active density remains null, unit mappings remain empty, and substitution research remains blocked pending generalizable evidence. Package weights and maker-specific cold milling are not ingredient measures, conversions, yields, forms, or substitution rules.

## Proposed integration delta

1. Add **bajri flour** as an English alias on ingredient-ref-pearl-millet-flour, and add **bajri** as an English alias on ingredient-ref-pearl-millet.
2. Add proposal sources S01–S05 and one accepted alias decision to the existing flour ledger record. Add S06 and an accepted alias decision to the grain record. The flour's existing density observation and contextual bread finding remain in place without duplication.
3. Preserve displays, existing aliases, categories, null default densities, empty unit mappings, and measurement/substitution states.
4. Add no new reference ID, form, legacy candidate, recipe link, density default, unit mapping, conversion, package yield, measurement, or substitution rule. The broader A6 checklist remains open.

This review is integrated. Static package, generated-index, ledger, ownership/picker, recipe-corpus, encoding, and scoped whitespace checks passed. No app tests or emulator checks were run for this database-JSON update.

## Source register

All six sources below were accessed on 2026-10-13. Their IDs are recorded in the shared ledger.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP02-A6-BAJRI-FLOUR-FOLLOWUP-20261013-S01** | Food Safety and Standards Authority of India, [Food Safety and Standards Regulations, Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 dated 2025-05-07, §2.4.17, PDF p. 57–58. | Defines Bajra flour (pearl millet flour) as a product milled from pearl-millet grains. Primary regulatory product-boundary evidence; does not define the Bajri spelling, a Canadian label, a recipe measure, or a substitution. |
| **WP02-A6-BAJRI-FLOUR-FOLLOWUP-20261013-S02** | Puremill Canada, [Puremill Bajri Flour](https://www.puremill.ca/products/puremill-bajri-flour), title, product description, and milling-location section. | Current Canadian mill page titles the product “Puremill Bajri Flour” and calls it pearl millet flour made from pearl-millet grains. Its milling/process details apply to its own product only; package weights are not recipe measures. |
| **WP02-A6-BAJRI-FLOUR-FOLLOWUP-20261013-S03** | Walmart Canada, [Angur Bajri Flour / Bajra Flour (Pearl Millet Flour)](https://www.walmart.ca/en/ip/Angur-Bajri-Flour-Bajra-Flour-Pearl-Millet-Flour-4-lb-1-8-kg/1KCHHQ5HOOST), product title, description, and ingredient declaration. | Current Canadian marketplace listing pairs the exact Bajri phrase with pearl-millet flour and names pearl-millet flour as its ingredient. Seller-provided listing, not a product standard or independent verification by Walmart. |
| **WP02-A6-BAJRI-FLOUR-FOLLOWUP-20261013-S04** | Office québécois de la langue française, [millet perle, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle), preferred terms and English translations. | Québec terminology authority lists millet perle and millet à chandelle and translates the term as pearl millet. It covers the grain name, not Bajri or a flour display. |
| **WP02-A6-BAJRI-FLOUR-FOLLOWUP-20261013-S05** | Metro, [Céréales muesli croquant au chocolat et noix Joyfull Millets](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-muesli-croquant-au-chocolat-et-noix/p/057174900070), French-facing ingredient declaration; English-facing product number 057174900070. | Québec grocery ingredient wording uses farine de millet perlé for an ingredient whose English-facing list says pearl millet flour. This is a French ingredient declaration in a cereal product, not a standalone Bajri-flour label. |
| **WP02-A6-BAJRI-FLOUR-FOLLOWUP-20261013-S06** | APEDA, [Potential of pearl millet in food processing](https://agriexchange.apeda.gov.in/Market/MarketNews/bindArchiveNews?page=758), 2023-03-03, opening paragraph. | Identifies pearl millet (*Pennisetum glaucum*) and lists Bajri as a Marathi and Gujarati name. Supports the bare grain alias only; it does not establish a flour measure or substitution. |

Existing ledger sources rechecked on 2026-10-13, not proposed as duplicate entries:

- **WP02-S34:** Codex, [Norme pour la farine de mil chandelle (CXS 170-1989)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B170-1989%252FCXS_170f.pdf), existing support for the product name **farine de mil chandelle**.
- **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S05:** Health Canada [Canadian Nutrient File serving portions, food code 6186](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6186), generic millet flour only.
- **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S06:** Irondi et al., [pearl-millet and sweet-detar flour blend study](https://www.frontiersin.org/journals/food-science-and-technology/articles/10.3389/frfst.2022.974588/full), existing study-specific bulk-density observation.
- **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S07:** Maktouf et al., [Evaluation of dough rheological properties and bread texture of pearl millet-wheat flour mix](https://pmc.ncbi.nlm.nih.gov/articles/PMC4926890/), existing single-formula substitution finding.

