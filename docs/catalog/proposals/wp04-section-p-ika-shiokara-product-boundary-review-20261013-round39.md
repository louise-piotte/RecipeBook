# WP04 Section P — ika shiokara / squid shiokara product-boundary review (round 39)

- **Review and source-access date:** 2026-10-13.
- **Status:** Integrated documentation-only hold.
- **Scope:** The squid-based Japanese salted-fermented seafood product sold as `ika shiokara` or `squid shiokara`. This review does not allocate a squid species or a general squid preservation form. It excludes other shiokara products made from different seafood, fish sauce, plain marinated squid, dried squid, fish balls, surimi, and squid ink.
- **Recommendation:** Keep ika/squid shiokara outside active references and forms until a bundled recipe names the product. Add no alias, form, measure, recipe link, conversion, yield, or substitution.

## Bounded gap and decision

The live [preserved-seafood checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4207) keeps fermented seafood states open; the neighboring [fish powder, fish balls, and surimi item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4237) also remains open. The broad preservation review holds universal fish and seafood forms until a product or recipe request defines the scope. Earlier reviews cover dried squid, dried octopus, fish balls, surimi shreds, naruto maki, and crab-flavoured pollock flakes; none decides this squid-ferment product boundary. [R36, R37, R38]

The Canadian and Japanese source set supports **squid shiokara / ika shiokara** as a recognizable product name. TERMIUM Plus defines `shiokara` as a salted fermented seafood product and gives `Ika-Shiokara` as squid meat slices and viscera. Japan's MAFF describes squid shiokara as one variety within a broader family that also includes ferments made from bonito, sea cucumber, sweetfish, salmon or trout, and sea urchin. MAFF includes fish sauce in the broader salted-fermented category but describes it as a distinct liquid seasoning. This supports a squid-specific boundary and rules out treating bare `shiokara` as a synonym for squid or a single universal seafood product. [S01, S03]

Canadian English product titles use `Squid Shiokara` and `Ika Shiokara`; an Ottawa-area retailer's French-language page titles one SKU `Calamar mariné Takewa Ika Shiokara`. OQLF standardizes the French base term **calmar** for English `squid`. No OQLF-preferred compound for this finished product was found. If a recipe later requires a French display, retain `ika shiokara` as the product name and use `calmar` in a clearly descriptive gloss such as `calmar salé-fermenté`; treat that gloss as provisional, not an OQLF ruling or a retail label. [S02, S04, S05–S07]

The reviewed Takewa listing gives one product's ingredients as squid from Peru, guts, sugar, salt, brewed vinegar, honey, and additives. The source does not identify the squid to species or document that SKU's fermentation method or time. A separate Vancouver product is labelled frozen and thaw-to-serve. Keep those exact listing facts attached to their products; do not generalize them to all squid, all shiokara, or a squid taxon. [S04, S06, S08]

Hold both a standalone catalog identity and a form attached to generic calamari. The product's named preparation, mixed ingredients, and viscera make it materially different from plain squid, but no bundled recipe indicates whether a product identity or a form is the appropriate future owner. A recipe naming the product and its role is the next decision trigger.

## Exact current ownership

The live snapshot contains **1,367 active ingredient references, 100 forms, 64 legacy candidates, and 1,699 research-ledger records**. Exact term and source-prefix scans covered the active names and aliases, all form labels and match terms, the legacy candidate file, ledger record contents, the proposal archive, and the manifest-listed recipes. There is no shiokara-specific identity, form, legacy candidate, or ledger record.

| Term or boundary | Current owner | Finding |
|---|---|---|
| `squid`; `calmar` | [`ingredient-ref-calamari`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), category `PROTEIN` | Displays `calamari / calmar`; English alias `squid`; density is null, unit mappings are empty, and no form is attached. Its ledger record verifies that broad animal-food identity only. |
| `shiokara`; `ika shiokara`; `ika no shiokara`; `squid shiokara`; `salted squid`; `fermented squid`; `calmar salé-fermenté` | None | No exact active reference or form term, legacy candidate, ledger record, or earlier focused proposal was found. No `shiokara` string occurs in the active legacy file or research ledger. |
| Dried squid | Held separately by the [round 36 review](wp04-section-p-dried-squid-product-boundary-review-20261013-round36.md) | That review concerns dried product states and does not own squid ferments. |
| Fish balls; surimi | `ingredient-ref-fish-balls` for fish balls; generic surimi remains a held ledger candidate | Neither is a shiokara identity or formulation synonym. The active fish-ball row has no attached form. |

No `WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-` source ID existed before this proposal. Source IDs below are local to this packet; no shared ledger record is created.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it folds case and accents, prefers complete word-phrase matches, and falls back to substring matching only when phrase matching returns no rows. It includes reference names, aliases, and attached form labels/match terms. The hypothetical reference below is for impact analysis only; it is not active. It uses `squid shiokara / ika shiokara (calmar salé-fermenté)` and no forms.

| Query | Current result | Hypothetical separate-reference result |
|---|---|---|
| `shiokara`; `ika shiokara`; `squid shiokara` | None | Ika/squid shiokara |
| `squid`; `calmar` | Calamari / calmar | Calamari / calmar plus ika/squid shiokara |
| `fermented squid`; `calmar fermenté` | None | None under the display projection above; no broader fermentation alias is proposed |
| `fish balls` | Fish balls / boulettes de poisson | Unchanged |
| `surimi` | None in active references | None |

Even without adding a generic `shiokara` alias, phrase matching would return the squid subtype for bare `shiokara` because it is a complete word in the proposed compound name; other seafood shiokara products would remain unrepresented. Adding a separate product row would also turn the current one-row `squid` and `calmar` searches into two-row results. The exact product queries would become searchable, but the corpus has no request that selects this product. Keep the current picker state.

## Bundled recipe demand

The live manifest lists **114 recipe files and 1,123 ingredient rows**. All manifest-listed recipe JSON text and ingredient rows were scanned for `shiokara`, `ika shiokara`, `ika no shiokara`, `squid shiokara`, salted/fermented squid wording, and French equivalents. There are **zero shiokara product matches**. The only related plain-squid ingredient line is `140 g sliced calamari` in recipe 023, linked to `ingredient-ref-calamari`; it does not request a seasoned, salted, fermented, or viscera-containing product. No recipe or recipe link supplies a role, preparation method, amount, or product package for this boundary. [R01]

## Numeric and substitution limits

The Canadian listings show package sizes of **200 g** for the Takewa SKU, the Vancouver Squid Shiokara listing, and Blackjack Foods' frozen product; Cityfish separately lists `Ika Shiokara (400 g)`. These are package quantities only. Takewa's listing presents nutrition “Per Serving (100g),” but that nutrition basis is not a recipe portion observation or a transferable serving standard. None of the reviewed listings provides a volume measure or density. Add no package conversion, serving size, density, unit mapping, recipe quantity, or yield. [S04, S06, S08, S09]

TERMIUM's generic description of fermentation time and MAFF's broader descriptions do not establish the process, salt level, maturation time, or formulation of a specific Canadian SKU. The Takewa ingredient list is product-specific and does not supply a transferable squid species or process. No reviewed recipe or exact product source supports replacing shiokara with plain squid, fish sauce, anchovy paste, dried squid, fish balls, surimi, or fish powder at any ratio. Add no global form conversion, contextual substitution, warning, or recipe-line substitution.

## Recommended next action

Keep ika/squid shiokara unallocated and the Section P preservation item open. Revisit only when a bundled recipe identifies the exact product and use. Then confirm its package wording, whether the recipe means a meat-and-viscera shiokara or a different squid seasoning, and whether search should expose a separate product or an explicit calamari form. Require the actual recipe or package for any amount or product-state decision; do not use it to rename a squid species or to represent non-squid shiokara.

## Source register

Sources were checked online on 2026-10-13. IDs are local to this proposal; no shared source records were created.

| ID | Source and locator | Evidence used | Evidence limit |
|---|---|---|---|
| **WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-S01** | Government of Canada, TERMIUM Plus, [shiokara, record 40](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=19&i=&index=frr&lang=eng&sg_kp_wet=1063198&srchtxt=CHAIR+POISSON), fields `English/French`, `Subject field(s)/Domaine(s)`, `DEF`, `OBS`. Record dated 1993-02-26. | Gives `shiokara` in both languages, defines a salted fermented seafood product, and names `Ika-Shiokara` as squid meat slices and viscera; other examples use skipjack, oyster, and sea urchin. | Terminology evidence, not a current SKU label or product standard. Its generic definition and approximate process description do not establish the formula or maturation of a current product. |
| **WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-S02** | Office québécois de la langue française, [GDT: calmar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198881/calmar), `Termes privilégiés` and English equivalent. | Identifies preferred French `calmar` and English `squid`. | The entry does not define shiokara or a French name for the finished product. |
| **WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-S03** | Japan Ministry of Agriculture, Forestry and Fisheries, [Fishery fermented food](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/suisan-hakkou.html), `Characteristics and Types`, lines 94–103. | Places shiokara and fish sauce in the broader salted-fermented category, lists squid and several non-squid shiokara types, and describes fish sauce as a distinct liquid seasoning. | General food-culture classification; it does not establish the state or formulation of a particular retail SKU. |
| **WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-S04** | Hungry Ninja, [Takewa Ika Shiokara Marinated Squid, 200 g](https://hungry-ninja.ca/products/fzn-takewa-ika-shiokara-marinated-squid-200g), product title, ingredients, nutrition, country of origin, and availability. | A Canadian retailer lists a Takewa product, 200 g package, squid (from Peru), guts, added ingredients, Japan as country of origin, and nutrition basis “Per Serving (100g).” The page showed the SKU sold out when checked. | One retailer's listing only. It does not identify squid to species, specify what `guts` refers to, or document fermentation time, density, or a recipe serving. The 100 g nutrition basis is not a recipe portion standard. |
| **WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-S05** | Hungry Ninja, [French-language Takewa product listing](https://hungry-ninja.ca/fr/products/fzn-takewa-ika-shiokara-marinated-squid-200g), French product title and ingredient text. | The French listing titles the item `Calamar mariné Takewa Ika Shiokara` and gives its product-specific ingredients in French. | Retailer wording is not an OQLF ruling; it uses `calamar`, while OQLF's preferred base term is `calmar`. It does not make `calmar mariné` a synonym for shiokara generally. |
| **WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-S06** | SEABORN, Vancouver, [Squid Shiokara](https://delivery.seaborn.ca/products/squid-shiokara-%E5%92%B8%E9%AD%B7%E9%AD%9A-%E3%82%A4%E3%82%AB%E3%81%AE%E5%A1%A9%E8%BE%9B), title and package size. | A Canadian retailer lists `Squid Shiokara` at 200 g. | No ingredient list, method, recipe use, or species is given. The package quantity is not a recipe measure. |
| **WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-S07** | Seaborn-Toronto, [Ika shiokara / 烏賊塩辛](https://www.seaborntoronto.com/product-page/ika-shiokara-%E7%83%8F%E8%B3%8A%E5%A1%A9%E8%BE%9B), product title and local delivery context. | A Canadian retailer uses the name `Ika shiokara` for a current product listing. | The page does not give a package amount, ingredients, taxon, or cooking method. |
| **WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-S08** | Blackjack Foods, Vancouver, [Squid Shiokara](https://blackjackfoodtrading.com/products/squid-shiokara), product description and store address. | Its listing calls one 200 g item frozen, `Marinated Squid Japanese Style`, and `Thaw & Serve`; the page showed sold out. | One SKU's storage and service instructions only; no formulation, recipe measure, species, or universal shiokara product state. |
| **WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-S09** | Cityfish, [Ika Shiokara (400 g)](https://www.cityfish.ca/seafood-frozen), frozen-seafood list. | A Canadian distributor lists a 400 g Ika Shiokara package. | Product-list evidence only; no composition, serving size, species, density, or recipe measure. |
| **WP04-SECTIONP-IKA-SHIOKARA-20261013-R39-R01** | [Bundled recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) and [recipe 023](../../../app/src/main/assets/seed/bundled-library/recipes/023-calamar-frit-a-l-air-air-fried-calamari-5fecccc1-d734-4f2b-9958-ac0c6a960f29.v1.json). | Reproducible corpus denominator and the only related `140 g sliced calamari` line. | Recipe corpus audit only; the plain calamari recipe does not establish shiokara demand or a substitution. |

## Final disposition

**Hold** ika/squid shiokara outside active references and forms. TERMIUM, MAFF, OQLF, and current Canadian product listings support a bounded squid-ferment product name, but the wider shiokara family has distinct seafood substrates, the catalog already owns broad `squid / calmar`, and the bundled corpus has no exact product demand. Keep the product separate from squid species, generic shiokara, fish sauce, dried squid, fish balls, and surimi. No catalog or ledger data changed. The decision is recorded under the open Section P checklist and roadmap; see the integration README. No tests were run for this documentation-only hold.
