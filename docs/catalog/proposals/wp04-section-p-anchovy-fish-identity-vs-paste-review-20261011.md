# WP04 Section P proposal: anchovy fish identity separate from anchovy paste

- **Reviewed:** 2026-10-11
- **Status:** proposal only. This packet changes no shared catalog JSON, ledger, recipes, plan, roadmap, code, or tests.
- **Scope:** the open Section P `anchovy` identity; Québec/Canadian fish naming and species scope; distinction from the existing anchovy-paste identity; recipe demand, search behavior, and form limits.
- **Plan state:** Section P remains open, including finfish identities and smoked, cured, dried, canned, and oil-packed forms.

## Recommendation

Add one **identity-only, family-scoped food-fish reference** for `anchovy / anchois`, category `PROTEIN`, distinct from `ingredient-ref-anchovy-paste`. Scope it to edible fish in the family *Engraulidae* sold under the common name anchovy/anchois. Do not assign the identity to one species: OQLF gives *Engraulidae* and CFIA applies the common names `Anchovy / Anchois` to multiple listed species in several genera [S01–S03].

The exact proposed catalog entry is:

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-anchovy` |
| `category` | `PROTEIN` |
| `nameEn` | `anchovy` |
| `nameFr` | `anchois` |
| `aliasesEn` | `["anchovies"]` (grammatical plural only) |
| `aliasesFr` | `[]` (`anchois` is used for singular and plural) |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |

Keep the current `ingredient-ref-anchovy-paste` as a separate `SAUCE_AND_CONDIMENT` product. Do not add `pâte d'anchois` or `anchovy paste` as aliases on the fish identity. Do not add forms, measurement values, yields, conversions, recipe links, or substitutions in this review.

This family-level identity is a supported naming boundary, not a claim that every anchovy on the market is the same species or that fresh whole anchovy is commonly sold in Québec. Canadian examples show salted and oil-packed fillets; a species-identified Canadian listing names *Engraulis encrasicolus*. DFO's Québec-facing profile describes the local Pacific species *Engraulis mordax* and says that fishery is small and mainly serves bait markets [S04–S06]. Preserve fresh/whole, cured, filleted, and oil-packed preparation as open form work.

## Live catalog, ledger, and legacy audit

The current live package contains **1,009 ingredient references and 66 forms**. It has one anchovy-related reference:

| Record | Current data | Research state and boundary |
|---|---|---|
| `ingredient-ref-anchovy-paste` | FR `pâte d'anchois`; EN `anchovy paste`; no aliases; category `SAUCE_AND_CONDIMENT`; null density; empty mappings | Ledger `identityState: verified`; measurement and substitution research remain `not_yet_researched`. Its recorded sources are the OQLF paste entry and a current Metro Québec product listing. The ledger decision explicitly keeps the paste distinct from fish fillets, fish sauce, anchovy sauce, tapenade, and bagna cauda. |

No anchovy fish reference, anchovy form, fish package yield, or exact-name legacy candidate is present. The 75-entry legacy candidate file contains no `anchovy`, `anchois`, *Engraulidae*, or anchored species-name candidate. The existing anchovy-paste ledger record is the only anchor-named ledger record; no fish identity record is being revived.

The prior WP05 cooking-sauce review found no bundled recipe line for anchovy paste and added the paste reference as identity-only. Its integration checkpoint also records that no forms, measurements, conversions, yields, substitutions, or recipe links were added [P01, P02]. This proposal does not reinterpret that decision.

## Recipe demand

The current manifest lists **114 recipes** with **1,123 ingredient rows**. I searched every ingredient object and all recipe string fields for `anchovy`, `anchovies`, `anchois`, `Engraulidae`, *Engraulis*, `filets d'anchois`, and related fish/paste phrases. There are **zero anchovy or anchovy-paste ingredient rows and zero matching recipe-text strings**.

Two rows mention fish sauce, and those rows remain linked to `ingredient-ref-fish-sauce`: recipe `093#6` (`2 tbsp fish sauce`) and recipe `095#5` (`1 tbsp fish sauce`). They do not name anchovies and cannot be used to infer that the sauce contains anchovy. No recipe link or relink is proposed.

## Québec and Canadian name and species scope

OQLF's GDT entry places `anchois` in both ichthyology and edible-fish domains, pairs it with English `anchovy`, and gives the Latin family *Engraulidae*. Its note says “a fishery species with commercial potential in Québec,” but the attached Latin name is a family, not one species; this source supports the Québec term and family-level name boundary, not a particular market species or form [S01].

CFIA guidance says that the accepted common name for fish sold or processed in Canada is species-scoped through the CFIA Fish List. The Fish List's `Anchovy` query returns multiple family members, including several *Engraulis* species and species from *Anchoa*, *Cetengraulis*, *Encrasicholina*, and *Stolephorus*. It assigns unqualified `Anchovy / Anchois` to multiple entries, while other entries have more specific terms such as `Striped Anchovy / Anchois rayé` or a named species term [S02, S03]. That spread supports a family-level culinary identity but rules out treating bare `anchovy` as a synonym for *Engraulis encrasicolus* or *E. mordax*.

The local-language and market evidence also needs limits:

- DFO's Québec-facing profile uses `Anchois` for *Engraulis mordax* (Pacific/northern anchovy). It says the British Columbia fishery is relatively small and mostly supplies bait. This is a regional fishery fact; it does not describe imported food products [S04].
- A Canadian Sea Tales listing identifies a salted, oil-packed fillet product as *Engraulis encrasicolus*. That supports one species-identified commercial product, not a universal species for the English or French common name [S05].
- A Québec Costco listing uses `filets d'anchois` for salted fillets and marinated variants with oil, vinegar, salt, and optional seasonings. A Montréal-area Mayrand listing likewise labels a canned 560 g product `Filets d'anchois`. These are product and Québec-display examples; neither page identifies the species [S06, S07].
- Metro currently lists anchovy paste separately as `Pâte d'anchois`, with anchovies, olive oil, and sea salt as ingredients. The paste is a distinct prepared condiment even though it is made from anchovy fish [S08].

## Normalized alias and search collision audit

I applied the app's `normalizeIngredientSearchKey` behavior: lowercase, NFKD accent folding, compatibility folding, punctuation-to-space conversion, and whitespace collapse. Current reference and form search results are:

| Query | Current result | After proposed addition |
|---|---|---|
| `anchovy` | `ingredient-ref-anchovy-paste` (matched inside `anchovy paste`) | Fish `anchovy` and anchovy paste both appear. This is the expected product/fish distinction. |
| `anchois` | `ingredient-ref-anchovy-paste` (matched inside `pâte d'anchois`) | Fish `anchois` and anchovy paste both appear. This is the expected product/fish distinction. |
| `anchovies` | No result | Proposed English plural alias resolves to the fish identity. |
| `anchovy paste`; `pâte d'anchois` | `ingredient-ref-anchovy-paste` only | Remains paste-only because the complete phrase match takes precedence. |
| `anchovy fillets`; `filets d'anchois`; `whole anchovy` | No result | Still no exact product/form result. Do not place these preparation phrases in the base fish aliases. Add a source-backed form only if a recipe later needs it. |
| `Engraulidae`; `Engraulis encrasicolus`; `Engraulis mordax` | No result | Remain without user-facing aliases; these are scope notes, not recipe-search names. |
| `fish sauce`; `sauce de poisson` | `ingredient-ref-fish-sauce` only | Remain separate; do not alias them to anchovy or anchovy paste. |

There is no duplicate exact normalized full term between the proposed fish display and the paste display. The one-word queries `anchovy` and `anchois` will intentionally surface both entries because the fish term occurs in each paste label. The full paste phrases continue to identify only the paste. No legacy or form collision exists.

## Product and form boundaries

The identity should denote edible anchovy fish in the accepted family-level common-name scope. `Whole` describes a presentation or preparation state; it need not become a separate identity. The market examples show that products sold under the common name include salted fillets, oil-packed fillets, vinegar-marinated fillets, and paste. The names `filets d'anchois`, `anchovy fillets`, and `white anchovy` describe narrower cuts or preparations and are not synonyms for the base fish.

No active forms exist for the fish or paste, and there is no recipe demand to choose among fresh, whole, filleted, salt-cured, dried, canned, oil-packed, or vinegar-marinated states. If later recipe data requires one of those, model it as a form or a separately scoped food product only after reviewing its exact label and species; do not treat paste as a fish form. No density, unit mapping, package yield, fish-to-paste conversion, or substitution is supported here.

## Exact proposed changes

If integrated, add only the reference shown in the Recommendation table, with the English grammatical alias `anchovies`. Keep `ingredient-ref-anchovy-paste`, its sources, category, labels, empty aliases, null density, empty unit mappings, and current ledger states unchanged. Do not add a species-specific scientific-name alias, a generic `Engraulis` scope, a preserved-fish form, fish-sauce alias, or recipe link. The proposal adds no ledger entry; its local source register follows.

## Sources

Source IDs are local to this proposal. They have not been added to the shared ledger.

| ID | Source | Supports and limits |
|---|---|---|
| **WP04-ANCHOVY-20261011-S01** | OQLF, [anchois (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199027/anchois). | Preferred Québec French `anchois`, English `anchovy`, edible-fish domain, and Latin *Engraulidae*. It does not pick one species or preparation state. |
| **WP04-ANCHOVY-20261011-S02** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Defines the role of the CFIA Fish List and says accepted common names are applied to fish species sold or processed in Canada. This is labeling guidance, not a recipe naming guide. |
| **WP04-ANCHOVY-20261011-S03** | CFIA Fish List, [Anchovy query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Anchovy). | Shows unqualified `Anchovy / Anchois` on multiple Engraulidae entries across several genera, alongside more specific names. It does not imply all entries are the same species or market form. The list page is dated 2023-09-18. |
| **WP04-ANCHOVY-20261011-S04** | Fisheries and Oceans Canada, [Anchois (*Engraulis mordax*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/anchovy-anchois-fra.html). | Species-scopes the Québec-facing DFO profile to the Pacific anchovy and reports its British Columbia fishery is small and mostly for bait. It does not characterize imported edible anchovy products. |
| **WP04-ANCHOVY-20261011-S05** | Ambrosia Canada, [Sea Tales Wild Anchovy Fillets in Olive Oil](https://canada.ambrosia.ca/products/wild-anchovy-fillets-in-olive-oil). | Canadian product listing states salted *Engraulis encrasicolus* and olive oil. It validates one product, not an all-market species default. |
| **WP04-ANCHOVY-20261011-S06** | Costco Canada, [Assortiment de filets d'anchois siciliens Carlino](https://www.costco.ca/p/-/assortiment-de-filet-danchois-siciliens-carlino-12-x-80-g-28-oz/100734760?langId=-25). | Québec French product wording for salted and marinated fillets; ingredients vary with oil, vinegar, salt, and seasonings. It does not specify a Latin species and is a retailer product page. |
| **WP04-ANCHOVY-20261011-S07** | Mayrand, [Filets d'anchois 560 g](https://mayrand.ca/fr/nos-produits/epicerie/poisson-et-viande-en-conserve/poisson-en-conserve/filets-danchois-560g-allessia-35618). | Québec retailer product label and product section show a canned `Filets d'anchois` product. The listing does not state species or preparation ingredients. |
| **WP04-ANCHOVY-20261011-S08** | Metro, [Pâte d'anchois Laurena](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/pate-d-anchois/p/056844000256), plus OQLF, [pâte d'anchois (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428360/pate-danchois). | Confirms the Québec paste label and a current product containing anchovies, olive oil, and sea salt. OQLF's preparation definition is dated 1983 and is not adopted as a universal paste recipe. |
| **WP04-ANCHOVY-20261011-P01** | [WP05 cooking-sauce exact recipe-demand review](../proposals/wp05-cooking-sauces-exact-recipe-demand-review-20261010.md). | Prior review of the existing paste identity, its OQLF/Metro sources, no bundled paste demand, and explicit separation from fish and other sauces. |
| **WP04-ANCHOVY-20261011-P02** | [WP05 sauce integration checkpoint](../batches/wp02-wp04-wp05-quinoa-sauces-produce-review-integration-20261010/README.md). | Confirms the identity-only anchovy-paste integration and absence of forms or numeric data. |
