# WP04 Section P — smoked herring fillets in oil product-boundary review (R180)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** Smoked herring fillets packed in oil; Québec-facing wording includes *filets de hareng fumés à l’huile*.
- **Recommendation:** **Integrate** an identity-only finished-food market group `smoked herring fillets in oil / filets de hareng fumés à l’huile`, with no aliases, forms, measurements, or species assignment.
- **Scope:** A named smoked-and-oil-packed fillet product state under the open Section P preservation checklist. Keep separate from plain Atlantic/Pacific herring, herring fillets in tomato sauce, herring in oil without an established smoke claim, whole smoked herring, kippers, chiktay, Matjes, and rollmops.
- **Proposal-local source IDs:** `WP04-SECTIONP-SMOKED-HERRING-OIL-R180-20261016-S01` through `S06`, plus audit ID `WP04-SECTIONP-SMOKED-HERRING-OIL-R180-20261016-R01`. New IDs are unallocated; reused sources retain their existing ledger IDs.

## Product boundary

Rügen Fisch’s manufacturer page describes smoked herring fillets packed in rapeseed oil and their own juice. Its ingredients identify *Clupea harengus* at 75%, rapeseed oil, salt, and beechwood smoke. This supports the exact product state for that maker’s SKU; it does not establish that every Canadian product sold as smoked herring fillets in oil uses the same species, cut, smoke process, or recipe. [S01]

Current Québec-area retail evidence supplies a usable French/English market name pair. Adonis lists Rügen Fisch `Smoked Herring Fillet in Oil` at 190 g, and Dutch Groceries Ottawa lists `Filets de hareng fumés à l'huile RügenFisch` and serves both Ottawa and Montréal-area customers. Ilios’s French product catalogue separately lists `Filets de hareng fumés` (14 × 120 g, product of Latvia), without saying they are in oil. The Ilios product establishes a neighboring smoked-fillet product, not an oil-packed equivalent. [S02–S04]

The OQLF entry for *hareng fumé sans arêtes* describes a particular boneless preparation with the head, belly, tail, and most bones removed. It does not define the Rügen oil-packed SKU or establish that all smoked herring fillets have that cut. OQLF’s *kipper* entry describes split, lightly brined, cold-smoked fish, mainly herring; the Rügen manufacturer’s cited product is a different oil-packed fillet item, and its source does not call it a kipper. Preserve both distinctions. [S05; reused `WP04-SECTIONP-KIPPER-R154-20261015-S01`]

## Ownership and collision audit

Read-only checks covered active names/aliases, forms and match terms, legacy candidates, ledger record IDs/source IDs/URLs, prior proposals/batches, and the manifest recipe corpus. No exact owner was found for `smoked herring fillets in oil`, `filets de hareng fumés à l’huile`, `herring fillets in oil`, `hareng fumé à l’huile`, or the illustrative ID `ingredient-ref-smoked-herring-fillets-in-oil`. No earlier focused proposal on the oil-packed smoked-fillet product was found. The manufacturer, Adonis, Dutch Groceries, and OQLF *hareng fumé sans arêtes* source URLs below have no exact ledger owner. The Ilios product index URL is already ledger-owned for unrelated frozen peas/carrots and smoked mussels, so S04 reuses the URL with a new proposal-local source label and a narrower product claim. S06 reuses the CFIA Fish List URL; source IDs already in the ledger are identified in the register. The OQLF *kipper* URL and source ID are reused from R154. [R01]

| Nearby catalog owner | Boundary |
|---|---|
| `ingredient-ref-atlantic-herring` — *hareng de l’Atlantique* / `Atlantic herring` | Raw/species identity. Rügen’s *Clupea harengus* statement stays source-specific; do not attach the finished product as a form or alias to this species row. |
| `ingredient-ref-pacific-herring` — *hareng du Pacifique* / `Pacific herring` | Separate species identity. Do not infer Pacific-herring products from generic smoked-herring market wording. |
| `ingredient-ref-herring-fillets-in-tomato-sauce` — *filets de hareng à la sauce tomate* / `herring fillets in tomato sauce` | Separate sauce preparation. It does not own oil-packed smoked fillets. |
| `ingredient-ref-smoked-mackerel`, `ingredient-ref-smoked-salmon`, and `ingredient-ref-smoked-trout` | Separate smoked-fish market identities; no species or product form transfers from those rows. |
| Prior kipper, Matjes, rollmops, and chiktay reviews | Distinct split/cold-smoked, curing/marinade, rolled/pickled, or multi-ingredient spread boundaries; keep their names and products separate. |

### Picker and recipe-corpus impact

The picker prefers complete normalized word phrases and uses substring matching only when no phrase result exists ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). With the proposed display pair and no aliases, `smoked herring fillets in oil` / `filets de hareng fumés à l’huile` would return the new product group as the exact phrase result. Broad `herring` / `hareng` searches would gain a result alongside the existing species rows and the herring-tomato group. The visible qualifiers preserve a clear distinction. Do not add short aliases such as `smoked herring`, `hareng fumé`, `herring in oil`, or `hareng à l’huile`, which would blur the oil-packed smoked fillets with whole, other smoked, or unsmoked herring products.

The manifest-listed library contains **114 recipe files and 1,123 ingredient rows**. A read-only search of full recipe JSON and ingredient-row fields for the bilingual candidate phrases, *herring/hareng*, smoke, oil, Rügen Fisch, and product names found **zero matching recipe files and zero matching ingredient rows**. No recipe link, amount, method, or serving basis is proposed. [R01]

## Numeric, form, and substitution boundaries

- Adonis lists a 190 g retail unit. The manufacturer lists 75% herring for its product. These values belong to that SKU only; neither is a recipe measure, general fish percentage, drained weight, edible yield, density, or package-to-portion conversion. Add no measurement observation, unit mapping, or yield.
- The manufacturer reports rapeseed oil, own juice, salt, and beechwood smoke for its own product. Do not promote those details into a universal formula, smoke method, storage state, or form for all oil-packed smoked herring. Add no form to raw herring or the existing tomato-sauce product group.
- No source or bundled recipe validates replacing this product with fresh herring, unsmoked herring in oil, herring in tomato sauce, chiktay, kippers, canned sardines, smoked mackerel, smoked salmon, or another fish. Add no global or contextual substitution, warning, conversion, or recipe-line substitution.

## Proposed delta

Add identity-only `ingredient-ref-smoked-herring-fillets-in-oil` as `PROTEIN` with display names `smoked herring fillets in oil / filets de hareng fumés à l’huile`, empty alias arrays, null density, and no unit mappings. Record the bounded market identity and source evidence in the research ledger. Keep all species claims attached to the named supplier SKU. Add no form, legacy mapping, measure, conversion, yield, recipe link, or substitution.

## Source register

Pages were accessed on 2026-10-16 unless otherwise noted. Proposal-local IDs are provenance labels only.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SMOKED-HERRING-OIL-R180-20261016-S01** | Rügen Fisch, [Bücklingsfilets in Pflanzenöl](https://www.ruegenfisch.de/produkte/buecklingsfilets-in-feinem-pflanzenoel-und-eigenem-saft/). | Manufacturer describes smoked herring fillets in rapeseed oil and own juice; ingredient declaration names *Clupea harengus* (75%), rapeseed oil, salt, and beechwood smoke. These are product-specific facts, not universal measures or a species assignment for other brands. The indexed canonical URL includes `feinem`; direct retrieval timed out during root review. |
| **WP04-SECTIONP-SMOKED-HERRING-OIL-R180-20261016-S02** | Adonis, [Rügen Fisch Smoked Herring Fillet in Oil, 190 g](https://livraison.groupeadonis.ca/store/adonis/products/27943855-r-gen-fisch-smoked-herring-fillet-in-oil-190-g). | Current Montréal-area retailer listing names the oil-packed smoked-herring fillet product and 190 g package. It does not expose species or full ingredients in the page text. |
| **WP04-SECTIONP-SMOKED-HERRING-OIL-R180-20261016-S03** | Dutch Groceries, [Filets de hareng fumés à l’huile RügenFisch](https://dutchgroceries.ca/fr/products/rugenfisch-smoked-herring-fillets-in-oil). | Ottawa retailer with a Montréal-area pickup location uses the exact French wording. Stock status and the displayed retailer amount can change; its French title supports terminology, not a universal package size. |
| **WP04-SECTIONP-SMOKED-HERRING-OIL-R180-20261016-S04 (reused URL)** | Ilios Foods, [Produits](https://fr.iliosfoods.ca/products). | Lists *Filets de hareng fumés*, 14 × 120 g, product of Latvia, separately from Atlantic herring in oil and tomato sauce. The smoked-fillet listing does not establish oil packing. This URL is already ledger-owned for other products (including `WP03-H-FROZEN-PEAS-CARROTS-20261011-S04` and `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S04`). |
| **WP04-SECTIONP-SMOKED-HERRING-OIL-R180-20261016-S05** | OQLF, [GDT: hareng fumé sans arêtes](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428557/hareng-fume-sans-aretes). | Québec terminology describes a particular boneless smoked-herring preparation. It does not define the Rügen oil-packed SKU or establish that all smoked herring fillets have that cut. This URL has no exact ledger or prior-packet owner. |
| **Reused `WP04-SECTIONP-KIPPER-R154-20261015-S01`** | OQLF, [GDT: kipper](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428368/kipper). | Defines a distinct split, lightly brined, cold-smoked herring product. Reused from R154 rather than assigned a new R180 source ID. |
| **WP04-SECTIONP-SMOKED-HERRING-OIL-R180-20261016-S06 (reused source URL)** | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list); reused ledger examples include `WP04-P-PACIFIC-SAURY-20261013-S02` and `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S07`. | Canadian fish common-name reference associates fish names with taxa. Reused only for species-boundary context; it does not identify the local retail SKU. |
| **WP04-SECTIONP-SMOKED-HERRING-OIL-R180-20261016-R01** | Active references/forms, legacy identities, research ledger, prior proposal/batch archive, manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only ownership, source-URL, picker, and recipe-corpus audit. Candidate ID remains unallocated. |

## Final disposition

**Integrate** `ingredient-ref-smoked-herring-fillets-in-oil` as an identity-only finished-food market group named `smoked herring fillets in oil / filets de hareng fumés à l’huile`. Local Canadian listings establish the bilingual product wording, and the manufacturer supplies a primary product description with ingredients and species for its own SKU. Keep the record separate from Atlantic/Pacific herring, herring in tomato sauce, kippers, and other smoked-fish identities. Add no aliases, forms, package measures, conversions, yields, recipe links, or substitutions; do not transfer the Rügen-specific species, 75% fish content, or 190 g package to other products.

## Root integration disposition

**Accepted as an identity-only `PROTEIN` market group.** Added the bilingual display with empty aliases,
null density, and no unit mappings or forms. Registered only the corrected Rügen Fisch manufacturer
URL and the Adonis and Dutch Groceries local product listings. The maker's species, 75% fish content,
ingredients, and the retailer's 190 g package remain SKU-specific. No recipe link or reusable measure
was added.
