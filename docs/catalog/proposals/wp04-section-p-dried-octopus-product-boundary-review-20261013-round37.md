# WP04 Section P — dried octopus / pieuvre séchée product-boundary review (round 37)

- **Review and source-access date:** 2026-10-13.
- **Status:** Integrated documentation-only hold.
- **Packet type:** proposal-only product-state, Québec naming, ownership, picker, recipe-demand, measurement, and substitution review.
- **Recommendation:** Hold dried octopus outside the active references and forms until a bundled recipe identifies the product it needs. Add no identity, alias, form, measure, recipe link, conversion, yield, or substitution now.
- **Scope:** Human-food dried octopus only. This does not identify an octopus species or cover dried squid, cuttlefish, seasoned octopus snacks, or pet treats.

## Bounded gap and decision

The live [preserved seafood checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4207) remains open for dried, smoked, salted, canned, and other product states. Its general preservation review holds universal forms until a recipe or product request provides enough context. The preceding [round 36 dried-squid review](wp04-section-p-dried-squid-product-boundary-review-20261013-round36.md) concerns squid/calamari and does not decide octopus. The existing [octopus identity review](wp04-section-p-octopus-identity-gap-sweep-20261012.md) established only the unqualified animal-food identity; it explicitly left prepared states separate. No focused dried-octopus proposal or active dried-octopus owner was found.

The source-backed candidate wording is **dried octopus / pieuvre séchée**. OQLF identifies `octopus` as the English equivalent of the food-mollusc terms `pieuvre` and `poulpe`; a Canadian Food Inspection Agency (CFIA) recall record pairs the product names `Dried Octopus` and `Pieuvre séchée`. A current T&T listing also carries the English product name `Pacific International Dried Octopus`. These sources establish a recognizable product label, but do not establish one octopus species, salt level, cut, drying method, seasoning, or intended recipe use. Do not generalize this product name to a species or to other dried cephalopods. [S01–S03]

Keep this candidate distinct from generic **octopus / pieuvre**, whose active reference has no forms; from **calamari / calmar**, which owns the English search term `squid`; from the separate **cuttlefish / seiche** reference; and from round 36's held dried squid. The Canadian product pages do not establish that all retail items called dried octopus share one preparation. One Canadian soup-ingredient listing describes its own small-octopus item as sun-dried and salted, while T&T's listing gives only a product title and package size. [S03–S04]

Hold both a standalone product reference and an octopus form for now. If a later recipe names dried octopus, its author or package may show that an explicit form on the generic octopus reference is enough, or that a separately searchable product is needed. This packet does not choose between those future representations.

## Exact current ownership

The live data snapshot contains **1,367 active ingredient references, 100 forms, 64 legacy candidates, and 1,699 ledger records**. Exact normalized-key checks covered active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs.

| Terms or ID | Current owner | Finding |
|---|---|---|
| `octopus`; `pieuvre`; `poulpe` | `ingredient-ref-octopus`, category `PROTEIN` | The active row displays English `octopus` and French `pieuvre`, with `poulpe` as its sole French alias. Its density is null, unit mappings are empty, and it has no attached form. The ledger has the corresponding verified identity record `ingredient-ref-octopus`. |
| `dried octopus`; `pieuvre séchée`; normalized `pieuvre sechee`; `poulpe séché`; normalized `poulpe seche` | None | No exact active reference, form, legacy candidate, or product-specific ledger record. |
| `candidate-dried-octopus`; `ingredient-ref-dried-octopus`; `WP04-SECTIONP-DRIED-OCTOPUS-20261013-R37-S…` | None | No such candidate or source prefix was present in the live archive before this proposal. Proposal source IDs below remain local; the shared ledger is unchanged. |

The generic octopus row remains an identity only. Neither a retail package weight nor the evidence that a product is dried justifies changing that ownership or adding an unscoped form.

## Picker projection

The static projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes accents and punctuation, returns complete word-phrase matches first, and uses substring matching only when no phrase result exists. It compares the live snapshot with a hypothetical separate display-only reference, `dried octopus / pieuvre séchée`, with no aliases or forms. The candidate is not active.

| Query | Current result | Hypothetical separate-reference result |
|---|---|---|
| `dried octopus` | None | Dried octopus / pieuvre séchée |
| `pieuvre séchée`; `pieuvre sechee` | None | Dried octopus / pieuvre séchée |
| `octopus` | Octopus / pieuvre | Octopus / pieuvre plus dried octopus / pieuvre séchée |
| `pieuvre` | Octopus / pieuvre | Octopus / pieuvre plus dried octopus / pieuvre séchée |
| `poulpe` | Octopus / pieuvre | Octopus / pieuvre; no `poulpe` alias is proposed for the product |
| `poulpe séché`; `dried squid`; `calmar séché` | None | None |

Thus a separate row would make exact product searches useful but also expand the current one-result `octopus` and `pieuvre` queries. Attaching an explicitly named form in a future batch could instead keep the picker result on `ingredient-ref-octopus` and show a form hint; no such form is proposed here. The projection leaves the current calamari, cuttlefish, and dried-squid decisions untouched.

## Bundled recipe demand

The live manifest lists **114 recipe files and 1,123 ingredient rows**. All manifest-listed recipe JSON string fields and ingredient rows were scanned for dried-octopus wording, including `dried octopus`, `pieuvre séchée`/`pieuvre sechee`, `poulpe séché`/`poulpe seche`, and reversed or dry/salted variants. The scan found **zero exact product mentions** and **zero octopus-, pieuvre-, poulpe-, or tako-specific ingredient rows**. No recipe link selects the generic octopus identity. Generic seafood wording, where present, does not identify dried octopus or justify a link.

There is therefore no recipe amount, preparation method, or bundled product context to decide whether dried octopus should be an ingredient form or a separately searchable product. Keep the current catalog and recipe links unchanged.

## Numeric and substitution limits

The reviewed product pages expose package quantities, not cooking measures: CFIA's 2021 recalled package was **142 g**, T&T lists a **114 g** retail item, and Souperwell lists a separate **77 g** item. Souperwell describes its own item as sun-dried and salted and says it is used in soups and stews; its page currently marks that listing sold out. The product pages do not provide an exact recipe portion, density, dry-to-soaked ratio, drained weight, edible-yield factor, or cooked yield. Package size is not a serving or a recipe conversion. [S02–S04]

Do not use those package weights as ingredient amounts, infer one drying or salting process, or transfer one retailer's description to all dried octopus. Leave density and unit mappings empty. No reviewed source supplies an exact, transferable replacement between dried and fresh/cooked octopus, or between dried octopus and squid, cuttlefish, dried squid, fish balls, surimi, or fish powders. Add no global form conversion, contextual substitution, warning, or recipe-line substitution link. A recipe-specific rehydration or cooked-weight observation would remain limited to the named product and method that produced it.

## Recommended next action

Keep dried octopus unallocated and the Section P preservation checklist open. Revisit only when a bundled recipe requests dried octopus and its source or package establishes enough of the intended state—such as salted versus unsalted, seasoned versus plain, whole versus cut, and whether the recipe amount is measured before or after soaking. Then decide whether to attach an explicit form to `ingredient-ref-octopus` or create a narrowly named product reference, project the broad `octopus` and `pieuvre` queries, and record only recipe-specific measurement evidence. Do not assign a species or extrapolate from dried squid, cuttlefish, or pet products.

## Source register

Sources were checked online on 2026-10-13. IDs are local to this proposal; no shared ledger records were created.

| ID | Source and locator | Evidence used | Evidence limit |
|---|---|---|---|
| **WP04-SECTIONP-DRIED-OCTOPUS-20261013-R37-S01** | Office québécois de la langue française, [GDT: pieuvre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8402783/pieuvre), `Domaines`, English equivalent, and `Termes privilégiés`. | The food-mollusc entry gives English `octopus` and preferred French terms `pieuvre` and `poulpe`. | The entry was last updated in 1992 and does not define a dried product or a single species across current retail items. It supports the language pair, not the product-state decision. |
| **WP04-SECTIONP-DRIED-OCTOPUS-20261013-R37-S02** | CFIA, [Canada Uncle Bill Seafood brand Dried Octopus recall (English)](https://recalls-rappels.canada.ca/en/alert-recall/canada-uncle-bill-seafood-brand-dried-octopus-recalled-due-undeclared-sulphites) and [rappel de Pieuvre séchée (français)](https://recalls-rappels.canada.ca/fr/avis-rappel/rappel-pieuvre-sechee-marque-canada-uncle-bill-seafood-en-raison-presence-non-declaree). `Affected products / Produits touchés` table. | The official bilingual record names the recalled retail product `Dried Octopus / Pieuvre séchée` and gives a 142 g package, product code, UPC, and Ontario retail distribution. | The recall began in 2021. It establishes historical Canadian bilingual product wording, not current availability, a current recipe, species, complete formulation, preparation method, or reusable measurement. |
| **WP04-SECTIONP-DRIED-OCTOPUS-20261013-R37-S03** | T&T Supermarket, [Pacific International Dried Octopus, 114 g](https://www.tntsupermarket.com/fr/75713601-pacific-intl-dried-octopus.html), product title and package size in the current indexed listing. | A current Canadian grocery listing identifies a retail dried-octopus product and a 114 g package. | The product page requires JavaScript in the reviewed browser view; accessible listing details do not establish species, ingredients, salt/seasoning, preparation instructions, or recipe portion. The package quantity is not a kitchen measure. |
| **WP04-SECTIONP-DRIED-OCTOPUS-20261013-R37-S04** | Souperwell, [Dried Octopus (77 g)](https://www.souperwell.com/products/dried-octopus), product description, country selector, and availability. | A Canadian-market listing describes its own product as sun-dried and salted small octopus for soups and stews; the page shows 77 g and currently marks it sold out. | This is a retailer's product description, not a species identification or a standard for all dried octopus. Its package weight, sold-out status, and culinary description do not establish a general serving, rehydration ratio, density, or yield. |

## Final disposition

**Hold** dried octopus outside active references and forms. The product name is supported by a Canadian English retail listing, OQLF's French food terms, and a Canadian bilingual recall record, but the live recipe corpus has no matching demand and a separate row would broaden generic octopus/pieuvre searches. **Add no catalog or ledger data** and no numeric or substitution behavior. This documentation-only decision is recorded under the still-open Section P preservation checklist and requires no tests.
