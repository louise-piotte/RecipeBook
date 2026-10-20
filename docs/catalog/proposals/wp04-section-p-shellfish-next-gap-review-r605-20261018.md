# WP04 Section P — frozen octopus-roll product boundary review (R605)

- **Review and access date:** 2026-10-18.
- **Candidate:** The current Canadian retail product titled **Ferma Octopus Roll, Frozen / Ferma Rouleau de pieuvre, congelé**, listed at 750 g.
- **Disposition:** **Bounded hold.** Keep the product outside active ingredient references, forms, legacy identities, and the shared research ledger.
- **Reason:** Current Québec-facing retail listings establish the product title and a package size, but do not establish its composition or preparation. There is no bundled recipe demand. A hypothetical row or form would also make the broad French query **rouleau** return only this candidate under the current phrase-first ingredient picker, hiding three existing wrapper/pastry results.

## Scope and previous work

Section P still leaves “Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below” open in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7379). The most recent Section P progress entry is the integrated R604 bream/sea-bream review; the [roadmap](../../../roadmap.md) also records that Section P remains open.

The active catalog has a generic **octopus / pieuvre** reference. Adjacent octopus work is bounded and distinct:

- R181 covers octopus in olive oil as a narrow prepared-food group.
- R233 covers octopus in Galician sauce as another prepared-food group.
- R474 adds a **cooked octopus tentacles / tentacules de pieuvre cuits** form based on a different Metro SKU.
- R539 reviews frozen tube-cut squid, not an octopus roll.

Those decisions do not establish the identity or preparation of this roll product. This review does not reopen them.

A repository-wide exact-phrase audit of the live ingredient references, forms, legacy candidates, research ledger, plan, proposal archive, and batch archive found no earlier dedicated review, hold, allocation, or exact owner for **octopus roll**, **frozen octopus roll**, **roll of octopus**, **rouleau de pieuvre**, **rouleau de pieuvre congelé**, **pieuvre en rouleau**, or the Ferma product wording. The current workspace snapshot is **1,817 ingredient references**, **154 forms**, **56 legacy candidates**, and **2,187 research-ledger records with 10,165 source entries**. The bundled manifest lists **114 recipes**.

No active reference, form, legacy identity, or ledger record uses a candidate-specific ID or exact bilingual candidate phrase. **ingredient-ref-octopus** remains the generic octopus owner; its other active product references and attached forms remain unchanged. The candidate title, product number 20165825_EA, and consulted retailer URLs are not already allocated in the plan, roadmap, proposal/batch archive, or live ledger.

## Current Canadian and Québec product wording

Loblaws’ current English **Squid & Octopus** category lists **Ferma Octopus Roll, Frozen, 750 g**. Its French counterpart lists the corresponding **Ferma Rouleau de pieuvre, congelé, 750 g** product. The two live category pages show the same Ferma retail item and package size. The linked item path contains product identifier **20165825_EA**; the direct item-detail route did not return page content during this review, so the category pages support the title and package listing only, not ingredients or processing details. Product availability and prices can vary by store and pickup/delivery date. [S01–S02]

Adonis separately lists **Ferma Frozen Octopus Roll**, 750 g, and showed the item out of stock at access. Its page does not expose an ingredient declaration, species, preparation, or product state beyond the frozen title. [S03]

Capital Fish Market in Canada lists a separate **Pieuvre en rouleau** item, SKU 347, and describes it as frozen, 750 g, and a product of Portugal. This corroborates Canadian market use of a similar French phrase, but the listing does not identify Ferma, composition, taxon, preparation, or whether its item is the same product as the Loblaws/Adonis listing. Do not merge the two seller listings into one verified specification. [S04]

OQLF’s existing food-domain entry for **pieuvre** lists English **octopus** and gives **pieuvre** as the preferred Québec term, with **poulpe** as another preferred term. The entry was last updated in 1992 and includes *Octopus vulgaris* in its Latin field. Reuse it only for the generic bilingual vocabulary; it does not establish that the roll product is *O. vulgaris* or define a French market term for an octopus roll. The OQLF source is already owned in the ledger as **WP04-OCTOPUS-IDENTITY-20261012-S02**; do not create another source ID for the same URL. [Reused source]

The strongest Québec-facing phrase available for this candidate is the retailer’s exact product title, **Rouleau de pieuvre, congelé**. Capital Fish’s **Pieuvre en rouleau** is a second vendor’s wording, not an alias or proof of a standardized product class. No reviewed terminology source defines either phrase as a specific cut, preparation, or processed seafood category.

## Product identity and boundary

The retail pages identify a product marketed with **octopus / pieuvre** and the shape or presentation word **roll / rouleau**. They do not give a scientific name, ingredient statement, cooking state, cut, binders, or package photograph with a readable label. The word **roll** alone does not establish whether the product is a whole octopus formed into a roll, pieces compressed or restructured, or another preparation. Do not infer that it is raw, cooked, ready to eat, sliced, seasoned, or composed of octopus alone.

The candidate might eventually be modeled as a product identity or as a form beneath generic octopus, depending on what the package composition and preparation establish. Neither representation is supported now. The listed frozen state is specific to these retail listings and does not justify a universal frozen-octopus form. Do not transfer species or cooked-state evidence from generic frozen octopus listings or the R474 cooked-tentacles item.

## Live search ownership and hypothetical picker effect

The current picker normalizes case, accents, and punctuation, searches bilingual reference names and aliases plus attached form terms, returns complete word-phrase matches first, and uses substring fallback only when there are no complete phrase hits. See [IngredientSearch.kt normalization](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9) and [IngredientSearch.kt phrase-first fallback](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L23).

The current picker projection was checked against the live references and forms. For illustration only, the “with hypothetical row” column adds a new reference with English display **frozen octopus roll**, French display **rouleau de pieuvre congelé**, and no aliases. This is not proposed active data.

| Query | Current result | With hypothetical row | Effect |
|---|---|---|---|
| **frozen octopus roll** | 0 | 1 | Exact retail phrase would be findable. |
| **octopus roll** | 0 | 1 | Complete phrase occurs within the English display. |
| **rouleau de pieuvre** | 0 | 1 | Complete phrase occurs within the French display. |
| **rouleau de pieuvre congelé** | 0 | 1 | Exact French retail phrase would be findable. |
| **octopus** | 3: generic octopus, octopus in Galician sauce, octopus in olive oil | 4 | Adds one product result to the broad species-neutral query. |
| **pieuvre** | 1: generic octopus | 2 | Adds a second result to the broad French identity query. |
| **roll** | 3: bread roll, egg-roll wrappers, wheat spring-roll pastry | 4 | Adds an unrelated broad partial query result. |
| **rouleau** | 3: egg-roll wrappers, rice-paper sheets, wheat spring-roll pastry | **1: hypothetical octopus roll only** | The new display contains the complete word **rouleau**; phrase-first matching returns that hit and skips the current substring-fallback results. |
| **poulpe** | 3: generic octopus, octopus in Galician sauce, octopus in olive oil | 3 | Unchanged because the candidate adds no **poulpe** term. |

A form beneath **ingredient-ref-octopus** would still make **rouleau** searchable through its form label and would give the existing octopus reference a singleton exact hit, likewise hiding the current fallback matches. Adding aliases would only increase broad matching. With no recipe demand, this picker cost is not justified by the product titles alone.

## Recipe demand

The manifest-listed corpus was scanned across **114 complete recipe files and 1,123 structured ingredient rows** for the product names, bilingual variants, Ferma wording, and octopus/pieuvre/poulpe terms. The scan found **0 matching recipe files, 0 matching ingredient rows, and 0 octopus-related ingredient rows**. There is no recipe link or cooking context for this product.

## Measurements, forms, conversions, and substitutions

The 750 g declarations are package weights for the named retail listings. They are not recipe quantities, servings, edible yields, or reusable measures. No reviewed source supports a density, unit mapping, package yield, thawing loss, count-to-mass mapping, cooking conversion, or mass/volume conversion.

Add no catalog form, because neither product’s cooking state nor preparation is established. Add no global or contextual substitution between a roll product and whole, fresh, frozen, or cooked octopus, the R474 cooked-tentacles form, squid, or cuttlefish. The available product titles and generic culinary resemblance provide no recipe-scoped quantity or tested replacement rule.

## Recommendation and exact data delta

Keep the octopus-roll product outside active references, forms, aliases, legacy mappings, and the shared research ledger. Preserve the existing generic octopus identity and its distinct product/form boundaries.

**Exact proposed data delta: none.** Add no ingredient reference, form, alias, ledger record, source allocation, legacy identity, recipe link, measure, density, unit mapping, conversion, yield, or substitution. This is a proposal-only documentation file; no tests or emulator checks were run.

Revisit only if a current package or manufacturer/importer source exposes the ingredient statement and preparation, or a bundled recipe explicitly requests this product. Before activating a row or form, model its full current search projection and resolve the broad **rouleau** behavior so that the new candidate cannot suppress existing wrapper and pastry results.

## Source register

The sources below were checked on 2026-10-18. New source IDs are local to this proposal and were not added to the shared ledger.

| Source ID | Source and evidence | Limit |
|---|---|---|
| **WP04-SECTIONP-OCTOPUS-ROLL-BOUNDARY-R605-20261018-S01** | Loblaws, [English Squid & Octopus category](https://www.loblaws.ca/en/alimentation/poissons-et-fruits-de-mer/calmar-et-pieuvre/c/28193). Lists Ferma Octopus Roll, Frozen, 750 g; the linked product path contains **20165825_EA**. | Retail listing for title and package size. Availability/pricing vary by store; direct item detail did not return content here, so no ingredient/process claim is made. |
| **WP04-SECTIONP-OCTOPUS-ROLL-BOUNDARY-R605-20261018-S02** | Loblaws, [French Calmar et pieuvre category](https://www.loblaws.ca/fr/alimentation/poissons-et-fruits-de-mer/calmar-et-pieuvre/c/28193). Lists Ferma Rouleau de pieuvre, congelé, 750 g. | French counterpart to S01 for the same retail item; not an independent composition source. |
| **WP04-SECTIONP-OCTOPUS-ROLL-BOUNDARY-R605-20261018-S03** | Adonis, [Ferma Frozen Octopus Roll](https://livraison.groupeadonis.ca/store/adonis/products/20705964-ferma-frozen-octopus-roll-750-g). Lists 750 g and showed out of stock at access. | Current retailer page, but no ingredient declaration, species, product preparation, or French title is exposed. |
| **WP04-SECTIONP-OCTOPUS-ROLL-BOUNDARY-R605-20261018-S04** | Capital Fish Market, [Pieuvre en rouleau](https://www.capitalfish.ca/product-page/pieuvre-en-rouleau). Lists SKU 347 as a frozen 750 g product of Portugal. | A separate Canadian seller listing; it does not establish a common product specification or prove it is the Ferma item. |
| **Reused WP04-OCTOPUS-IDENTITY-20261012-S02** | OQLF, [pieuvre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8402783/pieuvre), last updated 1992. | Already recorded in the live ledger. Supports generic French/English vocabulary only; it does not name the roll product or identify its species. |
| **WP04-SECTIONP-OCTOPUS-ROLL-BOUNDARY-R605-20261018-R01** | Read-only audit of the plan, roadmap, proposal/batch archive, active references/forms, legacy candidates, ledger source ownership, live picker projection, and complete manifest-listed recipe corpus. | Repository-snapshot evidence only. No shared data or software tests were changed or run. |
