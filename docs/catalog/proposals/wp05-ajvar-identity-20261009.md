# WP05 Section Y proposal: Ajvar identity

## Work-packet contract

- **Input revision:** `0caaef8`; live working-tree inventory checked on 2026-10-09.
- **Owner:** `/root/mena_pantry_batch` (independent research proposal).
- **Scope:** one Balkan pantry identity, Ajvar, separated from the MENA/Caucasus tranche for its own review.
- **Status:** integrated on 2026-10-09; broader Section Y review remains open.
- **Live preflight:** 409 canonical ingredient references, 16 forms, 99 legacy candidates, 574 evidence-ledger records, and 114 recipe JSON files. Ajvar is absent from canonical refs, forms, and legacy candidates. The three ledger records that mention Ajvar are the accepted Ajika, biber salçası, and muhammara boundaries; none is an Ajvar record. The earlier Ajvar note in `wp05-south-central-asia-mena.md` is treated as a candidate note; its generic roasted-pepper/eggplant-spread wording is not promoted to an alias here.

## Candidate disposition

| Candidate / suggested ID | Proposed EN / fr-CA display | Alias proposal | Disposition and category |
|---|---|---|---|
| **Ajvar** — `ingredient-ref-ajvar` | `ajvar` / `ajvar` | EN: `ayvar` (FAO spelling). FR: none. | Recommend one new named condiment identity in `SAUCE_AND_CONDIMENT`. Keep mild/hot and recipe-specific ingredient variations within the same identity. Do not create a form. |

The spelling `ajvar` is used in both locales on the same Metro product listing: English “Ajvar flavoured spread” and French “Tartinade à saveur d’ajvar” (S4–S5). The English-language FAO feature also spells the Balkan spread `ayvar`; that spelling is proposed as an English search alias only (S1). The Macedonian-script `ајвар` is documented by the Macedonian language corpus (S7), but it is not proposed as a stored alias: the current ingredient-search normalizer reduces that spelling to an empty key and cannot make it searchable. No source-backed French spelling variant was found.

Do not add `aivar`, `ajvár`, `pinđur`/`pindjur`, `roasted red pepper spread`, `roasted pepper and eggplant spread`, `ajvar flavoured spread`, or `tartinade à saveur d’ajvar` as aliases. The last two are retailer product descriptions, while the generic phrases describe a preparation or composition rather than the named ingredient. A shared ingredient list does not establish that every roasted pepper or pepper-and-eggplant spread is Ajvar.

## Identity and boundaries

Ajvar is a Balkan savory pepper condiment/relish. The sources show a family of preparations rather than a single mandatory formula. The FAO account of Macedonian preparation describes roasted, peeled peppers, with family-specific additions that can include tomato, carrot, and commonly roasted eggplant. Farm Boy’s Canadian Ajvar product uses roasted red peppers and eggplant and is sold mild or spicy (S1, S6). By contrast, Serbia’s official Leskovac appellation specification describes its registered homemade Ajvar as a red-pepper product, with mild and hot versions, without making eggplant part of that specification (S3). Eggplant is therefore a documented variant, not a defining requirement; red pepper is the stable identity cue in this evidence set.

Keep the following neighboring products separate:

- **Biber salçası:** the current catalog already accepts this as a Turkish pepper-paste family and says not to alias Ajvar. Tat’s manufacturer listings distinguish sweet and hot red-pepper paste products (S8; existing ledger record `ingredient-ref-biber-salcasi`). Pepper is shared, but the name and paste product family are not Ajvar.
- **Muhammara:** the current catalog accepts this as a distinct pepper-and-walnut dip and stores French `mouhamara` as its attested spelling alias. Health Canada’s recipe includes red pepper, walnuts, breadcrumbs, oil, garlic, honey, and paprika; the Québec maker also uses the name “Mouhamara” for its own recipe (S9–S10; existing ledger record `ingredient-ref-muhammara`). Those formulations are examples, not a universal formula, and their ingredients do not make muhammara an Ajvar alias.
- **Ajika:** the current catalog accepts Ajika, with English `adjika` as a spelling alias. The Georgian GI specification describes a spicy, thick pepper condiment with garlic, salt, dried spices, and blue melilot, with permitted recipe variation (S11; existing ledger record `ingredient-ref-ajika`). It remains a distinct identity.
- **Pinđur and Malidzano:** the North Macedonia tourism agency lists Ajvar as a roasted red-pepper dip, Pinđur as a summer pepper dip, and Malidzano as an eggplant salad in separate entries (S2). Do not use their names as Ajvar aliases.
- **Generic roasted-pepper/eggplant spread:** retain as a descriptive recipe phrase only. It is neither a regional synonym nor sufficiently specific to normalize to Ajvar. The Leskovac specification also shows why a pepper-and-eggplant description cannot define the full Ajvar identity (S3).

Mild/hot or mild/spicy labels are product variants, not ingredient forms. The evidence does not support a preparation-state form, a separate heat-level identity, or a single universal ingredient list. Recommend `SAUCE_AND_CONDIMENT` because the regional authority describes Ajvar as a dip, the manufacturer calls it a relish/condiment, and the Serbian product specification calls the registered product a paprika delicacy (S2–S3, S6).

## Measurement, density, and substitutions

| Area | Evidence reviewed | Proposal |
|---|---|---|
| Package and serving measures | Metro lists one product at 720 mL (S5). Farm Boy lists a 314 mL jar and a 30 mL nutrition serving but provides no corresponding gram mass (S6). | These are package or volume-only serving labels. They do not establish a mass/volume pair, ingredient conversion, serving weight, or density. Do not store a conversion. |
| Density / yield | The Leskovac product specification describes a homogeneous product with no free liquid, but gives no numerical density (S3). The other reviewed product and regional sources give no Ajvar-wide density or finished yield. | Density, package yield, and volume-to-mass mapping remain unknown. Do not infer a value from texture, container size, calories, or a recipe’s raw inputs. |
| Substitution | The identity sources do not recommend a replacement. Search results surfaced an Ajvar.org advice article and a general substitution site that suggest swaps and ratios, including Pindjur, muhammara, and biber salçası (S12–S13). These are editorial swap pages, not a reviewed test kitchen or authoritative standard; their recommendations vary by dish role. | No global or contextual substitute, ratio, confidence, or rounding rule is supported. Keep substitution status unknown; do not activate a rule from similarity or those swap pages. |

## Source-to-claim map

All web sources below were accessed on 2026-10-09 unless noted otherwise.

| ID | Source and URL | Supports |
|---|---|---|
| S1 | [FAO Regional Office for Europe and Central Asia, “Transformation of the Macedonian pepper”](https://www.fao.org/europe/resources/stories/details/Transformation-of-the-Macedonian-pepper/en) — published 2018-10-31; accessed 2026-10-09. | Uses `ayvar` for the Balkan savory spread; documents the Macedonian roasted-pepper process and family variation, including optional tomato, carrot, and roasted eggplant. Supports the EN alias and the non-fixed recipe boundary, not a universal formula. |
| S2 | [Agency for Promotion and Support of Tourism of the Republic of North Macedonia, “The Eternal Crush of Macedonian Wine and Food”](https://tourismmacedonia.gov.mk/wp-content/uploads/2020/01/3flaer-Wine-.pdf) — accessed 2026-10-09. | Lists Ajvar, Pinđur, and Malidzano separately and describes Ajvar as a roasted red bell-pepper dip. Supports regional identity and separate-name boundaries. |
| S3 | [Intellectual Property Office of the Republic of Serbia, registration no. 56, “Ajvar from Leskovac”](https://www.zis.gov.rs/wp-content/uploads/Reg-no-56-Ajvar-from-Leskovac.pdf) — accessed 2026-10-09. | Official appellation description: traditional red-pepper Ajvar from the Jablanica district, homogeneous/no free liquid, mild or hot. Supports a red-pepper identity that does not require eggplant and qualitative—but not numeric—texture evidence. |
| S4 | [Metro Canada, French product listing, “Tartinade à saveur d’ajvar”](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/tartinades-au-fromage-et-salees/tartinade-a-saveur-d-ajvar/p/069694009393) — accessed 2026-10-09. | Exact fr-CA retail wording for the named Ajvar product, product number `069694009393`, and 720 mL package label. The product page may redirect to English in some views; the French listing title is returned by Metro’s French catalog. |
| S5 | [Metro Canada, English product listing, “Ajvar flavoured spread”](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/cheese-savoury-spreads/ajvar-flavoured-spread/p/069694009393) — accessed 2026-10-09. | English product wording and same product number as S4; lists red peppers, eggplant, sunflower oil, sugar, salt, garlic, and citric acid, plus a 720 mL package size. Supports product-specific naming and composition only. |
| S6 | [Farm Boy, “Mild Ajvar Spread”](https://www.farmboy.ca/products/farm-boy-mild-ajvar-spread-314-ml/) — accessed 2026-10-09. | Calls it a traditional Balkan relish/condiment, says mild and spicy are available, lists roasted red pepper and eggplant purée, and gives a 314 mL jar and 30 mL serving without mass. Supports category, variation, composition example, and measurement gap. |
| S7 | [Macedonian language corpus, “ајвар”](https://makedonski.gov.mk/corpus/l/ajvar-m) — accessed 2026-10-09. | Documents the Macedonian-script spelling and a pepper-salad sense. It also records a salted-roe sense; the script form is not activated as a catalog alias because the current search key is empty for non-Latin letters. |
| S8 | [Tat, hot and sweet red-pepper paste listings](https://www.tat.com.tr/) — accessed 2026-10-09. | Manufacturer listings distinguish sweet and hot pepper paste; the product list includes *Acı Biber Salçası*. Used with the existing biber-salçası ledger decision for the separate product boundary. |
| S9 | [Health Canada, “Muhammara dip (red bell pepper and walnut)”](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/recipes/muhammara-dip-red-bell-pepper-walnut.html) — page dated 2026-04-14; accessed 2026-10-09. | Names the pepper-and-walnut dip and supplies one specific recipe formulation. Supports distinction from Ajvar without treating one recipe as a universal definition. |
| S10 | [Les Filles Fattoush, “Recette Mouhamara”](https://lesfillesfattoush.com/blogs/recettes/recette-mouhamara) — accessed 2026-10-09. | Québec French use of `mouhamara`; confirms the alias already accepted in the live catalog, not an Ajvar alias. |
| S11 | [UK Government, Georgian GI specification for “Ajika”](https://assets.publishing.service.gov.uk/media/6437e4e2db4ba9000c448e40/1_Ajika_%E1%83%90%E1%83%AF%E1%83%98%E1%83%99%E1%83%90_Other_products_of_Annex_I_of_the_Treaty__spices_etc._.pdf) — accessed 2026-10-09. | Defines Ajika as a Georgian condiment and describes its pepper/garlic/spice composition and permitted regional variation. Used as the Ajika boundary source. |
| S12 | [Ajvar.org, “What to use instead of ajvar”](https://ajvar.org/blog/practical/ajvar-substitutes) — published 2026-08-01; accessed 2026-10-09. | Offers role-dependent substitution suggestions and ratios. Rejected as a source for catalog rules because it is an advice blog without test-kitchen or authoritative validation; cited to document the reviewed but unaccepted evidence. |
| S13 | [Ingredient Substitutes, “Ajvar substitutes”](https://www.ingredientsubstitutes.com/ajvar-substitute) — accessed 2026-10-09. | Search result describes proposed alternatives and amounts. Rejected as an editorial substitution page without authoritative or test-kitchen backing; no ratio is accepted. |

The current live evidence ledger is also part of this review: `ingredient-ref-biber-salcasi`, `ingredient-ref-muhammara`, and `ingredient-ref-ajika` each explicitly records Ajvar as a separate product. Their accepted decisions and source URLs remain in `docs/catalog/research-ledger.v1.json` and are not changed by this proposal.

## Collision and bundled-recipe audit

- Checked the live canonical names and aliases for `ajvar` and the proposed `ayvar` alias using the catalog’s lowercase/Unicode-folded ASCII search-key rules. Neither normalized key collides with an existing reference name or alias among the 409 references. The suggested ID `ingredient-ref-ajvar` is absent from canonical references and legacy candidates. No Ajvar form or legacy candidate exists.
- Scanned all 114 recipe JSON files for `ajvar`, `ayvar`, `ајвар`, `ajvár`, `aivar`, the Metro EN/fr-CA label phrases, `biber salçası`, `muhammara`/`mouhamara`, `ajika`/`adjika`, `pinđur`/`pindjur`, and generic pepper/eggplant-spread phrases. No bundled recipe mentions were found.
- The ledger’s Ajvar mentions are only the three boundary decisions listed in the preflight; they do not imply that any alias or candidate is already integrated.

## Recommended acceptance checks

1. Recheck the live reference, form, legacy-candidate, and ledger counts immediately before any separate integration; preserve the suggested ID only if it remains free.
2. Confirm the exact stored display spellings `ajvar` / `ajvar` and add only the EN alias `ayvar`. Do not store `ајвар` until the search normalizer can produce a useful non-empty key for that script.
3. Confirm `SAUCE_AND_CONDIMENT`; create no form, density, unit mapping, package yield, or volume-to-mass conversion from the current evidence.
4. Preserve the boundaries with biber salçası, muhammara, Ajika, Pinđur, Malidzano, and generic roasted-pepper or pepper-and-eggplant spreads. Do not infer equivalence from ingredient overlap or the weak swap pages.
5. Keep substitution evidence unknown unless a source supports a dish-scoped replacement and ratio or a reviewed test kitchen validates it. Re-run the exact normalized collision and full bundled-recipe mention audit during any later integration.
6. Treat this packet as one independent identity proposal only; it does not accept or complete the rest of WP05 Section Y.

**Acceptance status: accepted and integrated.** The coordinator added `ingredient-ref-ajvar`, kept only the source-supported English spelling alias `ayvar`, and added an accepted ledger record using WP05-AJVAR-S01–S13. No form, density, unit mapping, package yield, conversion, or substitution rule was activated. The exact-key and 114-recipe ingredient-line audits remained clear at merge time. Package, unit-test, instrumentation, and live-picker results are recorded in [`../batches/wp05-ajvar-identity.md`](../batches/wp05-ajvar-identity.md).
