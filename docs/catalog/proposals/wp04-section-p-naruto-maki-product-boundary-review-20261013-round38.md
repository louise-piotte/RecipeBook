# WP04 Section P — naruto maki / narutomaki product-boundary review (round 38)

- **Review and source-access date:** 2026-10-13.
- **Status:** Integrated documentation-only hold; no catalog or ledger data changed.
- **Scope:** The Japanese steamed, red-swirl fish-paste product sold as `Naruto Maki` / `naruto maki`. This review does not allocate a species, brand, fresh/frozen state, or all-purpose fish-cake identity. It excludes generic fish balls, raw surimi paste, imitation crab, crab-flavoured pollock flakes, other kamaboko types, Western fish cakes/croquettes, and dried narutomaki snack products.
- **Recommendation:** Keep naruto maki outside active references and forms until a bundled recipe requests it. Add no alias, form, amount, recipe link, conversion, yield, or substitution now.

## Bounded gap and decision

The open [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4207) covers preserved fish/seafood forms and [fish powder, fish balls, and surimi](../../RecipeBook-global-ingredient-catalog-plan.txt#L4237); its named seafood work remains open. The existing fish-ball and surimi reviews explicitly keep fish cakes separate, and the archive contains no naruto-maki-specific review. This packet reviews only that narrow Japanese fish-cake product boundary; it does not reopen the completed fish-ball, surimi-shreds, crab-flavoured pollock-flakes, or dried-seafood decisions.

Current Canadian sources identify `Naruto Maki` as a steamed kamaboko product with a distinctive red swirl and ramen/noodle use. A French-language Québec retailer lists `JP Naruto maki`; a Canadian distributor lists `Ocean Food Naruto Maki (Fish Cake)`. The supported Québec-facing product wording is therefore the loanword **naruto maki**, while **Naruto maki (fish cake)** is the Canadian English retail wording. A Canadian trademark-journal filing gives the descriptive French `narutomaki (rouleaux de pâte de poisson cuits à la vapeur)`, but that applicant wording is not an OQLF-normalized term. Do not substitute generic `gâteau de poisson`, `boulette de poisson`, or `surimi` as aliases. [S01, S02, S07]

The manufacturer places Naruto Maki among steamed kamaboko and says its surimi uses several fish species. This supports a processed-product identity, not a species-level identity or one universal formulation. The manufacturer also sells fresh ready-to-eat steamed products and frozen kamaboko assortments; the reviewed Québec and distributor listings do not establish one storage or cooking state for every product called naruto maki. Keep the product distinct from broader `kamaboko`, fish balls, raw surimi paste, and imitation-seafood products. [S03–S06]

Hold a separate reference and any form attached to another reference. The bundled corpus has no request to choose between those models, and a hypothetical standalone display would make bare `fish cake` and `maki` searches return this one narrow Japanese item. A recipe naming the exact product and its package or method is the appropriate next trigger.

## Exact current ownership

The live snapshot contains **1,367 active ingredient references, 100 forms, 64 legacy candidates, and 1,699 research-ledger records**. Exact term checks covered active names and aliases, attached form labels and match terms, legacy candidate names and aliases, and ledger record IDs. No dedicated naruto-maki or kamaboko owner was found.

| Search term or boundary | Current owner | Finding |
|---|---|---|
| `naruto maki`; `narutomaki`; `naruto`; `kamaboko` | None | No exact active reference, form, legacy candidate, or dedicated ledger record. |
| `fish cake`; `fish cakes`; `gâteau de poisson`; `rouleau de pâte de poisson` | None | No general fish-cake identity or form is active. Related fish-ball proposals explicitly preserve fish cakes/croquettes as a separate boundary. |
| `fish balls`; `boulettes de poisson` | `ingredient-ref-fish-balls`, category `PROTEIN` | Verified formed-product identity with singular aliases only. Density and unit mappings are null/empty; no attached form or substitution rule exists. It does not own naruto maki. |
| `surimi` | `candidate-surimi-product-boundary` in the ledger only | `needs_clarification`; not an active picker reference. OQLF defines surimi as a fish-protein paste input, while Canadian retail listings also use the word in finished-product contexts. |
| `crab-flavoured pollock flakes` / `goberge en flocons à saveur de crabe` | `ingredient-ref-crab-flavoured-pollock-flakes` | Separate prepared product identity; it does not own kamaboko or naruto maki. |

The archive contains incidental discussion of fish cakes as a distinction, but no review or source-ID prefix dedicated to naruto maki. The shared ledger and catalog are unchanged by this proposal.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes accents and punctuation, prefers complete word-phrase matches across names and aliases, and falls back to substring matches only when no phrase result exists. The hypothetical row below is not active. For impact analysis only, it uses English `Naruto maki (Japanese fish cake)`, French `naruto maki`, and the narrow `narutomaki` spelling alias in both languages.

| Query | Current result | Hypothetical separate-reference result |
|---|---|---|
| `naruto maki`; `narutomaki`; `naruto` | None | Naruto maki / naruto maki |
| `fish cake` | None | Naruto maki / naruto maki, through its English display name |
| `fish cakes` | None | None; no plural generic alias is proposed |
| `maki` | None | Naruto maki / naruto maki |
| `kamaboko` | None | None; the broader family name is not an alias |
| `surimi` | None in active references | None; the held ledger candidate is not searchable |
| `fish balls`; `boulettes de poisson` | Fish balls / boulettes de poisson | Unchanged: fish balls / boulettes de poisson |

The hypothetical row would make `fish cake` and `maki` singleton results even though neither query identifies naruto maki specifically. A broad alias such as `fish cakes`, `kamaboko`, or `surimi` would further merge distinct product classes. The current picker has no naruto-maki result to disambiguate, so retain the hold.

## Bundled recipe demand

The live manifest lists **114 recipe files and 1,123 ingredient rows**. Every manifest-listed recipe JSON was scanned for `narutomaki`, `naruto maki`, `kamaboko`, `fish cake(s)`, `fish ball(s)`, `surimi`, and `boulette(s) de poisson`. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe line, ingredient reference, or recipe link requests this product or a broader fish cake. There is no recipe role, method, quantity, or source-specific name to support an active reference or form.

## Numeric and substitution limits

The reviewed listings show package labels, not recipe portions: Aliments Toyo lists a 150 g item and marks it sold out; Ozawa lists Ocean Food item FS-3014 at 170 g; a separate Canadian Ocean Food listing displays 135 g in its heading while its URL contains 170 g. These pages may reflect distinct packages or listing inconsistencies. Do not use any package weight as a serving size, slice weight, count-to-mass mapping, density, conversion, or yield. The manufacturer does not publish a transferable naruto-maki portion or formulation-specific density in the reviewed product pages. [S01, S02, S08]

Do not infer a fish species from the general manufacturer surimi blend, or a universal fresh/frozen state from one listing. No reviewed recipe or product source provides a tested replacement ratio or outcome between naruto maki and kamaboko, fish balls, raw surimi paste, imitation crab, crab-flavoured pollock flakes, other fish cakes/croquettes, or fish fillets. Add no global form conversion, contextual substitution, warning, recipe-line substitution, density, unit mapping, package yield, or recipe link.

## Recommended next action

Keep naruto maki unallocated and the Section P fish-product work open. Revisit only when a bundled recipe asks for naruto maki or identifies a package; then confirm the French recipe wording, the exact fresh/frozen/pre-cooked product state, and whether the name belongs on a new reference or a narrower product model. Record measurements only from that recipe or exact package and method. Do not promote `fish cake`, `kamaboko`, or `surimi` as aliases from this packet.

## Source register

Sources were checked online on 2026-10-13. IDs are local to this proposal; no shared ledger records were created.

| ID | Source and locator | Evidence used | Evidence limit |
|---|---|---|---|
| **WP04-SECTIONP-NARUTO-MAKI-20261013-R38-S01** | Aliments Toyo, [JP Naruto maki 150g](https://alimentstoyo.ca/products/jp-naruto-maki-150g), French-language product title, sale status, and store information. | Québec retailer uses `JP Naruto maki` as the local product name and identifies its Québec City storefront. | The listing marks the item sold out. It gives no ingredient list, manufacturer, species, recipe use, or standardized French descriptor; it supports the local loanword, not current availability. |
| **WP04-SECTIONP-NARUTO-MAKI-20261013-R38-S02** | Ozawa Canada, [Ocean Food Naruto Maki (Fish Cake), 170g](https://ozawa.ca/product/ocean-food-naruto-maki-170g/), title, item FS-3014, category, pack size, and Montréal office. | Canadian distributor pairs the exact product name `Naruto Maki` with the descriptor `Fish Cake` and lists a Montréal office. | This is a distributor listing, not a composition label or recipe. Its 170 g pack is not a portion measure. |
| **WP04-SECTIONP-NARUTO-MAKI-20261013-R38-S03** | Ocean Food Company, [Fresh Sea Market](https://www.oceanfoodcompany.com/fresh-sea-market), `Fresh Sea Market Steamed`. | The Canadian manufacturer names Naruto Maki as one of three steamed kamaboko products, identifies its red swirl, says that line is sold fresh/ready-to-eat, and describes ramen, noodles, hotpot, or appetizer use. | This describes the manufacturer's fresh line only. It does not assign a fish species or formulation to every naruto-maki listing or determine how a bundled recipe would use it. |
| **WP04-SECTIONP-NARUTO-MAKI-20261013-R38-S04** | Ocean Food Company, [Arctic Sea Market](https://www.oceanfoodcompany.com/arctic-sea-market), `Arctic Sea Market Oden`. | The Canadian manufacturer describes frozen, pre-cooked kamaboko assortments that may include Naruto maki alongside crab flakes, fish balls, and other fish cakes. | Assortment contents do not establish a universal naruto-maki state or equivalence among the listed products. |
| **WP04-SECTIONP-NARUTO-MAKI-20261013-R38-S05** | Ocean Food Company, [About Us](https://www.oceanfoodcompany.com/about), surimi and kamaboko description. | The manufacturer says its surimi uses several fish types and is used to make kamaboko, supporting a processed-product boundary and caution against assigning one species. | The list describes the company's surimi generally and does not identify the species or blend in its Naruto Maki. |
| **WP04-SECTIONP-NARUTO-MAKI-20261013-R38-S06** | Office québécois de la langue française, [GDT: surimi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199047/surimi), definition and preferred term. | Defines surimi as fish-protein paste with cryoprotectants used notably to make imitation seafood; supports keeping a paste input distinct from a named finished cake. | The 1998 terminology entry does not define naruto maki or set a French name for the finished product. |
| **WP04-SECTIONP-NARUTO-MAKI-20261013-R38-S07** | Canadian Intellectual Property Office, [Journal des marques de commerce, vol. 62, no. 3164 (French PDF)](https://publications.gc.ca/collections/collection_2015/ic/RG42-2-62-3164.pdf), goods-description passage listing `narutomaki (rouleaux de pâte de poisson cuits à la vapeur)`. | Supplies a Canadian French descriptive rendering for narutomaki. | This is an applicant's goods description in a trademark journal, not an OQLF decision, food standard, or current Québec retail display. Use it as a descriptive translation only. |
| **WP04-SECTIONP-NARUTO-MAKI-20261013-R38-S08** | JFoodie, [Ocean Food Naruto Maki](https://jfoodie.ca/products/ocean-food-naruto-maki-170g), product description and storage. | A Canadian retailer describes Ocean Food Naruto Maki as frozen, steamed, ready-to-use white-fish surimi cake for ramen, soups, hot pots, and sushi rolls. | Its product heading says 135 g while the URL says 170 g; do not use the conflicting package quantity. Retailer text does not establish a species-specific formula or universal product state. |

## Final disposition

**Hold** naruto maki outside active references and forms until recipe demand selects the product. Canadian and Québec retail/manufacturer sources support `Naruto Maki` / `naruto maki` as a distinct steamed fish-paste cake, but the corpus has no demand and a hypothetical search row would make broad `fish cake` and `maki` queries return this specific product. Keep it separate from fish balls, raw surimi, other kamaboko, imitation crab, and species identities. No catalog or ledger data changed. This documentation-only review required no tests.
