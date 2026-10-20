# WP02 Section 04 B3 R134 — amaranth starch Canadian/Québec boundary hold

- **Reviewed:** 2026-10-15.
- **Status:** proposal-only hold; no shared ingredient references, forms, research ledger, checklist, roadmap, or generated index changed.
- **Checklist:** WP02 Section 04 B3, `[ ] Water-chestnut flour and other documented regional starches.` The parent remains open. This review considers starch isolated from amaranth grain and does not revisit integrated sorghum starch (R133), held quinoa starch (R132), or held ginger-rhizome starch (R131).
- **Scope:** the separately isolated starch fraction of edible *Amaranthus* grain, distinct from whole amaranth grain, ordinary/sprouted amaranth flour, flakes, and leaves.
- **Proposal-local source-ID prefix:** `WP02-B3-AMARANTH-STARCH-R134-20261015-S`. A bounded search of the active references/forms, research ledger, legacy identities, plan, proposal archive, and batch archive found no focused prior amaranth-starch review or exact candidate record.

## Recommendation: hold, no delta

Keep amaranth starch outside active ingredient references and the research ledger until a current Canadian or Québec source identifies a standalone human-food starch product and supports product-specific Québec French wording. Primary studies establish that starch can be isolated from amaranth grain and characterized for food applications. They do not establish a current Canadian pantry product or a local product label.

The plausible French construction **amidon d’amarante** combines OQLF’s general preferred food term *amidon* with its food/grain term *amarante*. OQLF does not pair that phrase with an isolated amaranth-starch concept or a marketed product. Its *amarante* food definition describes grain from “amarante queue de renard”; the research and current flour labels do not all establish the same species scope. Treat the combined phrase as a descriptive reviewer construction, not an approved display or alias. OQLF uses *fécule* more specifically for starch in tubers or other underground plant organs; the candidate is grain-derived.

The Canadian and Québec product evidence located in this review names amaranth grain or flour. In particular, a Québec miller and Québec retail listings offer *farine d’amarante*, and one Canadian retailer identifies a 454 g amaranth-flour product as a product of Canada. Those listings do not establish isolated starch. Bounded searches for `amaranth starch`, `amaranth starch Canada`, `amaranth starch Québec`, `amidon d’amarante`, and `fécule d’amarante` did not locate a standalone Canadian/Québec human-food package or supplier listing. This is a search result, not proof that no such product exists.

**No proposed JSON:** explicitly hold with no delta. Do not reserve a reference ID, add a candidate ledger record, or attach aliases. Add no forms, measurements, density, mappings, conversions, yields, recipe links, or substitutions. Reconsider when a Canadian/Québec product source gives the starch product boundary and a product-specific French name.

## Product and language boundary

| Material or wording | Decision | Evidence boundary |
|---|---|---|
| Starch isolated from amaranth grain | Hold outside active references and the ledger. | Research isolates and characterizes the fraction, but no current Canadian/Québec standalone human-food package or supplier item was found. [S03–S04] |
| `amaranth starch` | Research wording only; not an active display. | Used for isolated fractions in food-science studies. A research term is not evidence of local consumer-market availability. [S03–S04] |
| `amidon d’amarante` | Descriptive French construction only; do not activate. | OQLF supports *amidon* as the general food-starch term and *amarante* for the edible grain, but no reviewed Québec source pairs them as the name of this isolated ingredient. [S01–S02] |
| `fécule d’amarante` | Do not use as the proposed French display or alias. | OQLF says *fécule* more specifically names starch in tubers or underground plant organs; this candidate comes from grain. [S02] |
| Amaranth grain, flour, flakes, puffed amaranth, and greens | Keep their existing identities unchanged. | Current local retail evidence is for grain and flour products, not isolated starch. Flour made by milling whole grain is not the separately extracted starch fraction. [S05–S07; live references] |
| `rajgira starch`, `ramdana starch`, `kiwicha starch`, `amaranth flour`, and `farine d’amarante` | Do not attach to a starch candidate. | The first three starch compounds were not found on Canadian/Québec starch product labels. The flour phrases identify already-existing flour products and would misstate the product form. [live references; S05–S07] |

## Live catalog, ledger, picker, and recipe audit

The read-only live snapshot contained **1,486 ingredient references, 109 forms, 1,831 ledger records, 61 legacy-import candidates, 114 manifest-listed recipe files, and 1,123 ingredient rows**. The shared workspace contains other work; these are the files read for this proposal on 2026-10-15.

| Surface | Finding |
|---|---|
| Active references | Six separate amaranth-related references exist: `ingredient-ref-amaranth-grain`, `ingredient-ref-amaranth-flour`, `ingredient-ref-sprouted-amaranth-flour`, `ingredient-ref-amaranth-flakes`, `ingredient-ref-puffed-amaranth`, and `ingredient-ref-amaranth-greens`. None owns `amaranth starch`, `amidon d’amarante`, or `fécule d’amarante`. The grain, flour, sprouted flour, flakes, puffed grain, and greens remain distinct. |
| Active forms | No amaranth-starch form or starch state attached to an amaranth reference was found. |
| Research ledger and legacy identities | No amaranth-starch record, candidate, or exact candidate-name owner was found. Amaranth records cover the active grain, flour, flakes, greens, and puffed-grain identities. |
| Proposal and batch archive | No focused amaranth-starch product-boundary or naming review was found. Searches included the English and French candidate phrases and likely regional forms. Nearby amaranth-flour and amaranth-grain work does not decide isolated starch. This archive check is bounded to current project files. |
| Recipe corpus | A read-only scan of all 114 manifest-listed files and 1,123 ingredient rows found no occurrences of `amaranth starch`, `amidon d’amarante`, `fécule d’amarante`, `amaranth`, `amarante`, `rajgira`, or `kiwicha`, and no links to the six amaranth references. No recipe demand or recipe link is supported. |

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, prefers complete word-phrase matches across names and aliases, and falls back to substring matching when no complete phrase matches. The following static projection uses the current reference names and aliases; it is not an app test.

| Query | Current projection | If descriptive displays `amaranth starch / amidon d’amarante` were added |
|---|---|---|
| `amaranth starch` | No result | One result, the proposed identity |
| `amidon d’amarante` | No result | One result, the proposed identity |
| `amaranth` / `amarante` | Six existing amaranth-related references | Those six plus the starch identity |
| `amaranth flour` / `farine d’amarante` | Existing ordinary and sprouted flour references | Unchanged; the proposed starch wording does not contain `flour` or `farine` |
| `starch` / `amidon` | Existing broad starch results | The proposed row would join these broad queries |

There is no exact picker collision among the proposed qualified phrases. A future qualified display could make those exact queries useful while adding one result to broad amaranth and starch searches. The hold is based on the missing Canadian/Québec standalone-product and French-name evidence, not on a picker collision.

## Numeric, form, and substitution evidence

- **Measurements and density:** The reviewed research reports laboratory starch properties and isolation protocols, not a household mass-volume pair, bulk density, cup/spoon weight, or product-specific retail serving. Research extraction ratios and test formulations are not kitchen measures. Keep all numeric observations out of active conversion fields.
- **Forms:** Add none. The studies describe isolated/dried research samples, not a stable user-facing preparation-state family or form-to-form conversion.
- **Substitutions:** Add none. Studies comparing amaranth starch with corn or other starches report physical or functional properties, not a tested recipe substitution ratio with scope and risk suitable for the app.
- **Recipe demand:** None in the bundled corpus. Food-science applications such as films, pastes, or experimental formulations are not bundled recipe demand.

## Source register

Source IDs below are proposal-local; no ledger record is proposed. Sources were checked on 2026-10-15.

| ID | Source and bounded evidence |
|---|---|
| **WP02-B3-AMARANTH-STARCH-R134-20261015-S01** | Office québécois de la langue française, [*amarante* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), updated 2009. Gives the preferred French term *amarante* and English *amaranth* / *kiwicha* for an edible grain; the note says its seeds may be milled into flour or used whole. It does not name extracted starch. |
| **WP02-B3-AMARANTH-STARCH-R134-20261015-S02** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Prefers *amidon* as the general term for food starch and says *fécule* more specifically describes starch in tubers or other underground organs. It does not contain an amaranth-starch term. |
| **WP02-B3-AMARANTH-STARCH-R134-20261015-S03** | [“Structural characterization and physicochemical properties of grain amaranth starch”](https://doi.org/10.1016/j.fochx.2024.101723), *Food Chemistry: X* 23 (2024), article 101723. Primary research characterizes a grain-amaranth starch fraction and its laboratory properties. It establishes research identity, not Canadian retail availability, a consumer specification, household measure, or tested recipe substitution. |
| **WP02-B3-AMARANTH-STARCH-R134-20261015-S04** | [“Physico-chemical properties, antioxidant properties, and in-vitro digestibility of quinoa and amaranth grain flours and water-extracted starches”](https://doi.org/10.1080/23311932.2026.2660375), *Cogent Food & Agriculture* 12(1) (2026), article 2660375. The study water-extracts starch from flour made with Zimbabwe-grown *Amaranthus hypochondriacus* for comparative food-science analyses. Its extraction and laboratory results are not a Canadian product listing, household conversion, or recipe substitution rule. |
| **WP02-B3-AMARANTH-STARCH-R134-20261015-S05** | Aliments du Québec, [*Farine d’amarante biologique*](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-damarante-biologique), current listing, accessed 2026-10-15. Identifies a Québec miller in Haute-Gaspésie and its amaranth-flour product. This verifies a local flour product and French flour wording only; it is not an extracted-starch product. |
| **WP02-B3-AMARANTH-STARCH-R134-20261015-S06** | Épicerie Vrac et Bio, [*Farine d’amarante biologique 100 g*](https://epicerievracetbio.com/fr/Produit-784-Farine-d-amarante-biologique-100g), current listing, accessed 2026-10-15. Names a Québec-origin amaranth-flour product from Moissonnerie du Pays. It does not establish a starch product, extracted fraction, or starch measure. |
| **WP02-B3-AMARANTH-STARCH-R134-20261015-S07** | Well.ca, [Cuisine Soleil organic amaranth flour](https://well.ca/fr/produits/cuisine-soleil-organic-amaranth_286430.html), current Canadian retail listing, accessed 2026-10-15. Uses the French label *farine d’amarante biologique* and describes flour derived from multiple amaranth types. It supports local flour terminology and availability, not isolated starch or a starch alias. |
| **WP02-B3-AMARANTH-STARCH-R134-20261015-S08** | Ambrosia, [Organic Amaranth Flour](https://canada.ambrosia.ca/products/organicamaranth-flour), current Canadian retailer listing, accessed 2026-10-15. Lists a 454 g product and identifies it as a product of Canada. The retailer’s stated flour-use guidance applies to that flour product and does not transfer to isolated starch. |

## Reconsideration conditions

Reopen this hold if a current Canadian/Québec manufacturer or retailer offers a standalone human-food amaranth starch and the source identifies the product as extracted starch rather than whole-grain flour, starch-rich flour, or a modified derivative. A product-specific French package name or an authoritative Québec terminology entry should support any French display. Recheck exact picker ownership and recipe demand at that time; do not transfer flour measures, the flour substitution guidance, research extraction ratios, or starch-property comparisons into active data.

This proposal changes no shared catalog data and runs no tests. Under `AGENTS.md`, JSON-only catalog additions need no tests; this turn adds only this proposal document.
