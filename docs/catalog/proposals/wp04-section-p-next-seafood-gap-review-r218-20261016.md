# WP04 Section P — tilapia-fillets market identity review (R218)

- **Review and source-access date:** 2026-10-16.
- **Recommendation:** Add identity-only `tilapia fillets / filets de tilapia` as `ingredient-ref-tilapia-fillets`, category `PROTEIN`.
- **Identity scope:** Species-neutral market group for unseasoned tilapia fillets sold fresh or frozen. Do not infer *Oreochromis niloticus* or any other species from this market name. Keep whole fish, seasoned/breaded products, and prepared tilapia meals outside this identity.
- **Status:** The worker submitted this proposal only; primary review accepted and integrated it on 2026-10-16 with a singular French alias correction. No software tests or emulator checks were needed for the database-JSON change; see the R216–R218 integration README.
- **Proposal-local source IDs:** `WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-S04` through `S12`. The existing OQLF and CFIA source IDs are reused below; this proposal does not allocate IDs in the shared ledger.

## Why this gap merits a bounded review

Section P still lists tilapia among its open finfish coverage. The live catalog has no tilapia reference or fillet form. The only current tilapia ledger identity is the verified but unallocated species candidate `candidate-nile-tilapia` for *Oreochromis niloticus*. Its hold correctly prevents a species-only result from settling the broad `tilapia` query. This proposal addresses a different, common retail product group: fillets sold under a species-unspecified tilapia name.

Current Québec listings from Metro and Loblaws name fresh and frozen `filets de tilapia`; Metro’s fresh product entry identifies the fish as `(Oreochromis spp)`, not one species. A paired Metro frozen retail listing uses the English and French names for the same product number. Canadian recipe publishers also use tilapia fillets directly as recipe ingredients. The evidence supports a species-neutral fillet market group without reopening the Nile-tilapia species hold.

## Product boundary and bilingual name

Use the paired display names **tilapia fillets / filets de tilapia**. OQLF gives Québec-preferred French `tilapia` and English `tilapia`; the current Québec retailer phrase supplies the cut wording `filet(s) de tilapia`. Retain the plural French display and add the source-attested singular French alias `filet de tilapia` so the singular query selects this row. Do not add `Nile tilapia`, `tilapia du Nil`, `Mozambique tilapia`, `tilapia du Mozambique`, `perche d’Afrique`, or scientific names as aliases: those would either claim a species or extend the row beyond the directly observed market group.

CFIA’s Fish List assigns `Tilapia` to multiple taxa, including Mozambique tilapia (*Oreochromis mossambicus*), Nile tilapia (*O. niloticus*), and Wami tilapia (*O. urolepis hornorum*). CFIA also presents `Tilapia` in French for more than one species. Metro’s fresh Québec listing uses the genus-level ingredient text `(Oreochromis spp)`. Keep this proposed identity species-neutral; no one species is selected by the reviewed Québec retail product.

The product group covers unseasoned fillets sold fresh or frozen. It does not describe a universal skin-on/skinless, boneless, frozen, thawed, glazed, or portion-size specification. Do not add those states as aliases, forms, or defaults. Exclude marinated, seasoned, breaded, battered, cooked, whole-fish, and species-qualified items unless a later request establishes a distinct need.

This row would make a bare `tilapia` query return the clearly displayed market group `tilapia fillets / filets de tilapia`; it would not establish a generic whole-fish identity or a single tilapia species. The species-specific Nile candidate remains unallocated. If the search experience later supports presenting both product-group and species-specific choices without hiding the broad result, reconsider that candidate independently.

## Exact ownership, picker, and source-ID audit

The current package snapshot has **1,611 active references**, **122 forms**, **61 legacy candidates**, and **1,956 research-ledger records / 8,502 source entries / 7,228 distinct source IDs / 6,006 distinct source URLs** after the 2026-10-16 ledger-integrity cleanup. The manifest contains **114 recipe files and 1,123 structured ingredient rows**.

| Candidate key or neighboring identity | Review-time exact owner and boundary |
|---|---|
| `ingredient-ref-tilapia-fillets`; `candidate-tilapia-fillets`; `tilapia fillets`; `tilapia fillet`; `filets de tilapia`; `filet de tilapia` | No exact owner in active reference IDs, bilingual names/aliases, forms, legacy identities, or ledger record IDs. Exact English/French product phrases were not found in the prior proposal/batch archive. |
| `candidate-nile-tilapia` | Existing verified ledger candidate for *O. niloticus*, still unallocated. Its decision keeps species-specific Nile tilapia / `tilapia du Nil` inactive because the current picker can let the species display capture the bare `tilapia` query. This review does not activate or revise that candidate. |
| Whole tilapia, cooked/seasoned tilapia, and other species | No new row is proposed for these product scopes. The current retailer sources distinguish fresh/frozen fillets, whole fish, and seasoned/breaded products. |
| `WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-` | The new source-ID prefix was absent from the ledger, proposal archive, and batch archive before drafting. OQLF and CFIA references below reuse their existing ledger source IDs rather than receiving new ones. |

The projection follows [`normalizeIngredientSearchKey` and `filterByIngredientSearchQuery`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized phrases take priority, followed by substring matching only if no phrase matches.

| Query | Current active results | With the proposed row | Boundary |
|---|---|---|---|
| `tilapia fillets`; `filets de tilapia` | None | `tilapia fillets / filets de tilapia` only | Exact market-product phrase. |
| `tilapia`; `tilapia fillet`; `filet de tilapia` | None | `tilapia fillets / filets de tilapia` only | The singular French query resolves through the source-attested alias; the English singular `tilapia fillet` query falls back to the plural display. The visible result remains a species-neutral fillet market group. |
| `Nile tilapia`; `tilapia du Nil`; `Oreochromis niloticus` | None | None | Keep the held species candidate out of the active picker. |
| `whole tilapia`; `tilapia whole fish` | None | None | Whole fish remains outside this fillet identity. |
| `seasoned tilapia`; `breaded tilapia` | None | None | Prepared and composite products remain outside this identity. |

The full manifest-listed recipe corpus was scanned for `tilapia`, `tilapia fillet(s)`, French `filet(s) de tilapia`, *Oreochromis*, and species-qualified names. It returned **zero matching recipe files and zero matching ingredient rows**. The candidate therefore receives no bundled recipe link.

## Measurement and substitution findings

- **Retail amounts:** Metro’s current French fresh-fillet listing reports one item at approximately 200 g. Its paired English listing is a separate product number and is not treated as the same SKU. The Metro frozen bilingual listing is 750 g for product number `061763060335`. These are retailer/SKU observations, not standard fillet weights or household measures.
- **Recipe quantities:** Metro’s four-serving recipe uses eight fresh fillets but supplies no mass. Canadian Living’s recipe uses four fillets at about 450 g total. A Canadian Kidney Community Kitchen version lists four fillets at 100 g each. These recipe-specific counts and quantities differ; do not derive or activate a general fillet-to-mass conversion from them.
- **CNF portion:** Health Canada’s food code 5966, `Fish, tilapia, raw / Poisson, tilapia, cru`, gives a 90 g Food Guide serving and a 100 g edible-portion basis. This is not a fillet count, pack yield, density, or reusable recipe measure. It does not override the product- and recipe-specific observations above.
- **Conversions:** Add no default density, unit mapping, package yield, count conversion, or cooking/edible yield. Do not transfer the generic CNF portion or a retailer’s package quantity to a fillet count.
- **Substitution:** Kidney Community Kitchen says its Jamaican steamed fish recipe was modified from a snapper version to use tilapia, in part because tilapia has less potassium; this is one recipe and diet context, not a generic tilapia-for-snapper equivalence or amount rule. No reviewed source supports a global or general contextual substitution between tilapia fillets and snapper, cod, sole, pollock, or other fish. Add no substitution rule.

If accepted, the catalog delta is identity-only: `ingredient-ref-tilapia-fillets`, `PROTEIN`, displays `tilapia fillets` / `filets de tilapia`, French alias `filet de tilapia`, null density, and empty unit mappings. The corresponding ledger review would record identity as verified, measurement research as `researched_no_supported_value`, and substitution research as `researched_no_supported_substitute`, preserving the recipe and package observations as source-specific evidence only.

## Sources

Online sources were accessed on 2026-10-16. Retail inventory and product attributes can change; no current-stock guarantee is inferred. Metro’s product pages were retrievable through current search-index results, while direct page opens returned access errors, so those rows are limited to the indexed retailer fields reported below.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **Reused `WP04-SECTIONP-NILETILAPIA-20261012-S01`** | OQLF, [tilapia (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8367900/tilapia). Gives preferred French `tilapia`, English `tilapia`, and genus *Oreochromis*; the entry also lists Nile-tilapia terminology. | Terminology source, last updated 2001. It does not establish a retail cut or product form. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). Current lookup rows include Mozambique, Nile, and Wami tilapia under the market name `Tilapia`; the first two also receive French `Tilapia`. | Fish-label name/taxon evidence; not proof that a specific package contains any one species. |
| **Reused `WP04-FINFISH-GAPS-20261010-S12`** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). Describes the Fish List’s English/French species names and group names for multiple species. | Canadian labelling guidance; not recipe equivalence or conversion evidence. |
| **WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-S04** | Metro, [Filet de tilapia frais](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-blancs/filet-de-tilapia-frais/p/216858), product 216858. Indexed listing gives the French product name, `(Oreochromis spp)`, Latin-American provenance, farmed/aquaculture method, and an approximately 200 g per-item listing. | One retailer product entry; species is genus-level and the amount is a retail item observation, not a standard fillet mass. |
| **WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-S05** | Metro, [Boneless Tilapia Fillet](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/boneless-tilapia-fillet/p/215983), product 215983. Indexed listing uses the English product phrase and ingredient text `(Oreochromis spp)`. | Separate product number from S04; the listing showed out of stock when accessed. It does not identify species. |
| **WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-S06** | Metro, [Frozen Tilapia Fillets](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-tilapia-fillets/p/061763060335), product 061763060335. Indexed English listing gives Catch of the Day Frozen Tilapia Fillets, 750 g, with ingredients `tilapia fish fillets`. | Product/package evidence only; it gives no fish species or fillet count. |
| **WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-S07** | Metro, [Filets de tilapia surgelés](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/filets-de-tilapia-surgeles/p/061763060335), same product 061763060335. Indexed French listing gives Prise du Jour frozen tilapia fillets, 750 g. | Same product number as S06; does not identify species or package fillet count. |
| **WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-S08** | Loblaws, [French search results for tilapia fillets](https://www.loblaws.ca/fr/search?search-bar=tilapia+fillets). Current results include `Filets de tilapia frais, emballé`, fresh tilapia fillets, and distinct products such as skin-on fillets, whole fish, and seasoned High Liner tilapia. | Retail search results vary by store and stock. The product range helps bound the market group; it does not establish species identity or one standard presentation. |
| **WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-S09** | Metro, [Tilapia Fillets with Creamy Lemon Sauce / Filets de tilapia, sauce citronnée au yogourt](https://www.metro.ca/en/recipes-occasions/recipes/tilapia-fillets-with-creamy-lemon-sauce), recipe dated 2013-08-06. Four servings use eight fresh fillets. | External recipe use evidence only; no fillet mass is given. The page’s recipe amount is not a standard portion or bundle link. |
| **WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-S10** | Canadian Living, [Crispy Tilapia with Lemon-Herb Mayo and Oven Fries](https://www.canadianliving.com/food/lunch-and-dinner/recipe/crispy-tilapia-with-lemon-herb-mayo-and-oven-fries). Uses four fillets at about 450 g total. | Recipe-specific count and mass; not a count conversion for other products. |
| **WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-S11** | Health Canada, [CNF serving size, food 5966: Fish, tilapia, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=5966). Lists a 90 g Food Guide serving and 100 g edible-portion basis. | Generic raw-tilapia food record; no fillet, count, package, density, or cross-species conversion is supplied. |
| **WP04-SECTIONP-TILAPIA-FILLETS-R218-20261016-S12** | Kidney Community Kitchen, [Jamaican Steamed Fish](https://www.kidneycommunitykitchen.ca/kkcookbook/recipes/jamaican-steamed-fish/). States that the displayed tilapia recipe was modified from a snapper version and uses four tilapia fillets at 100 g each. | A single diet-specific recipe adaptation. It does not establish a general snapper-to-tilapia substitution, transferable ratio, or safety equivalence. |

## Disposition

Advance the proposed identity-only market group **tilapia fillets / filets de tilapia** with only the French singular alias `filet de tilapia`, and no forms, reusable measures, recipe links, conversions, yields, or substitutions. Keep the Nile-tilapia species candidate unallocated and keep species, whole fish, and seasoned/breaded products separate. The bundled recipe corpus has no demand, but current Canadian/Québec retail listings and external Canadian recipes establish a recurring, bilingual fillet product group worth representing on its own. No catalog or ledger data changed; no software tests or emulator checks were run for this proposal-only review.
