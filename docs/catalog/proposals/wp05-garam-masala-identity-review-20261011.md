# WP05 Section T — Garam masala identity review

- **Status:** Integrated on 2026-10-11.
- **Packet type:** Existing identity verification, bilingual spelling, formula boundary, and recipe-demand review.
- **Plan:** Section T, regional spice blends.
- **Decision:** Keep the existing `garam masala / garam masala` identity and add `garam massala` as an English and French search alias.
- **New source IDs:** `WP05-GARAM-MASALA-20261011-S01` through `S04`; checked against the live ledger before insertion.

## Identity and boundaries

OQLF defines garam massala / garam masala as an aromatic ground-spice blend used in Indian cooking. It lists both spellings as preferred French terms and as English terms, supporting `garam massala` as a spelling alias while retaining the existing canonical pair. OQLF's typical-component note is not treated as a universal recipe [S01].

Current Canadian product pages identify garam masala blends but list SKU-specific ingredient statements. The Metro McCormick listing and Club House for Chefs manufacturer page differ in their declared components; neither formula is generalized [S02–S03]. Health Canada's current recipe lists `poudre de cari` and `garam masala` separately and uses them as different recipe ingredients [S04]. Keep garam masala separate from curry powder, curry paste, panch phoron, and Chinese five-spice. Add no universal formula or ingredient crosswalk.

## Repository audit

The existing `ingredient-ref-garam-masala` record had no reviewed sources or decision. Bundled recipe 086 has one exact 2 tsp garam masala ingredient line already linked to this record; that link and wording are unchanged. Recipe 048 is a recipe for one homemade garam masala variation: its ingredient rows name component spices, so it does not define a universal compound formula. The bundle has no matching `garam massala` line needing relinking. No form, density, unit mapping, package yield, conversion, or substitution was added.

## Source-to-claim map

| ID | Source | Supports and limits |
|---|---|---|
| **WP05-GARAM-MASALA-20261011-S01** | OQLF, [garam massala (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502426/garam-massala). | Bilingual terminology, blend identity, and the descriptive usual-component note. The note is not used as a universal formula. |
| **WP05-GARAM-MASALA-20261011-S02** | Metro, [McCormick Garam Masala 48 g](https://www.metro.ca/en/online-grocery/aisles/pantry/herbs-spices-sauces/spices/garam-masala/p/066200004040). | Canadian product display and one SKU's declared ingredients; no generalized formula. |
| **WP05-GARAM-MASALA-20261011-S03** | Club House for Chefs, [Club House Garam Masala](https://www.clubhouseforchefs.ca/en-ca/products/club-house/garam-masala). | Canadian manufacturer description and a different SKU ingredient declaration; product-specific only. |
| **WP05-GARAM-MASALA-20261011-S04** | Santé Canada, [Cari aux pois chiches et aux légumes](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire/manger-favoriser/cuisine/recettes/cari-pois-chiches-legumes.html). | A current public recipe lists `poudre de cari` and `garam masala` separately. This supports a naming boundary, not a reusable substitution or measure. |

## Limits and follow-up

- Keep both existing canonical names; add only the source-attested spelling alias in the two search-language arrays.
- Leave recipe 086 and the recipe 048 homemade formula unchanged.
- Keep measurement and substitution research marked not yet researched; this identity review establishes no reusable measurement or substitution behavior.
- The broader Section T spice-blend checklist remains open.

**Encoding:** UTF-8 without BOM.
