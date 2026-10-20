# WP05 Section Z — Worcestershire sauce source review (R447)

- **Packet type:** root-reviewed evidence integration for an existing identity.
- **Scope:** verify the existing Worcestershire sauce reference and source its English/French naming, without changing recipe links or adding conversions.
- **Research date:** 2026-10-17.
- **Decision:** keep `ingredient-ref-worcestershire-sauce`; set the displays to the source-backed capitalization `Worcestershire sauce / sauce Worcestershire`. Add no aliases, forms, measures, mappings, conversions, yields, or substitutions.

## Catalog and ledger delta

| Field | Existing | Reviewed value |
|---|---|---|
| `id` | `ingredient-ref-worcestershire-sauce` | unchanged |
| `nameEn` | `worcestershire sauce` | `Worcestershire sauce` |
| `nameFr` | `sauce worcestershire` | `sauce Worcestershire` |
| `aliasesEn` / `aliasesFr` | `[]` / `[]` | unchanged |
| `category` | `SAUCE_AND_CONDIMENT` | unchanged |
| `updatedAt` | `2026-03-23T00:00:00Z` | `2026-10-17T00:00:00Z` |

The OQLF Grand dictionnaire terminologique records `sauce Worcestershire` as the preferred French term and `Worcestershire sauce` as the English term, and defines it as a pungent sauce. Current Kraft Heinz Canada product pages use the same bilingual names for the same Lea & Perrins product ID `00057000009250`. This verifies the existing general identity and display names; the branded ingredient list does not define every product bearing the generic name. [S01–S03]

Update the existing `ingredient-ref-worcestershire-sauce` ledger record to `identityState=verified` and `measurementState=researched_no_supported_value`; keep `substitutionResearchState=not_yet_researched`. The current manufacturer pages give a 1 tsp (5 mL) nutrition serving for one product, while bundled recipes 074 and 078 each request 1 tbsp. Neither is a reusable density or a generic conversion. Do not add a measurement observation or substitute rule.

## Recipe links and boundaries

The bundled corpus has 114 manifest-listed recipes and 1,123 ingredient rows. Exactly two rows already link this identity: recipe 074, ingredient 6, `1 tbsp Worcestershire sauce`; and recipe 078, ingredient 9, the same source wording and quantity. Preserve both authored rows and links unchanged.

Keep Worcestershire sauce separate from generic brown sauce, North American steak sauce, North American barbecue sauce, and Japanese chuno/Worcestershire-style products. Do not add `sauce anglaise` or any brand as a global alias; the reviewed sources do not establish those as general synonyms.

## Sources accessed 2026-10-17

| ID | Source | Support and limits |
|---|---|---|
| **WP05-WORCESTERSHIRE-R447-20261017-S01** | Office québécois de la langue française, Grand dictionnaire terminologique, [sauce Worcestershire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8431811/sauce-worcestershire). | Preferred French term, English term, and sauce definition; last updated 1982. It supports identity and Québec naming, not a current commercial formula or measure. |
| **WP05-WORCESTERSHIRE-R447-20261017-S02** | Kraft Heinz Canada, [Worcestershire Sauce](https://www.kraftheinz.com/en-CA/lea-perrins/products/00057000009250-worcestershire-sauce). | Current English product page for Lea & Perrins ID 00057000009250; gives a product-specific 1 tsp (5 mL) serving and composition. This is not a generic portion or density. |
| **WP05-WORCESTERSHIRE-R447-20261017-S03** | Heinz Canada, [Sauce Worcestershire](https://www.kraftheinz.com/fr-CA/lea-perrins/produits/00057000009250-sauce-worcestershire). | French product page for the same product ID and corresponding product-specific serving/composition. This corroborates the French display without adding aliases or generic numeric behavior. |

WP05 Section Z remains open for its other condiments, brown-sauce coverage, and independent Québec terminology review.
