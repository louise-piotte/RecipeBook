# WP02 A6 regional flour gap review: `milo flour` picker boundary

## Review record

- **Reviewed:** 2026-10-13.
- **Recommendation:** **Hold** the English phrase `milo flour` outside active aliases for now.
- **Status:** Integrated. Shared files were unchanged when this proposal was drafted; the implementation record below documents the later root integration.
- **Owner:** WP02 A6 regional flour review; shared catalog integration remains with the root coordinator.
- **Open checklist:** Continue the A6 review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours at [the active plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1278).
- **Scope:** Determine whether qualified English `milo flour` should be an alias of the existing `ingredient-ref-sorghum-flour`. This review does not revisit the separate grain-sorghum alias decision.

## Recommendation and rationale

Current Canadian retail wording gives this candidate real flour-level support: OM Foods labels a product `SORGHUM FLOUR (MILO)` and describes it as flour from the sorghum grain (Milo); Bulk Mart's current sorghum-flour page expressly lists `milo flour` among the names for the product. CFIA also lists `milo` as a common English name for *Sorghum bicolor*. These sources support reviewing the phrase as a possible regional flour alias, rather than treating it as an unrelated flour identity.

**Hold the alias because the current picker cannot preserve the qualifier.** Ingredient search folds case and punctuation, then accepts any complete normalized word phrase contained in a reference term. If `milo flour` were added, the query `milo` would immediately return `ingredient-ref-sorghum-flour` as its only complete-phrase result. That would silently direct a bare query to flour even though `Milo` is also a current Canadian chocolate-malt drink mix. The existing beverage review has no active Milo/malt-drink reference, so the picker could not offer that competing product. Capitalization cannot distinguish the two.

This is distinct from the integrated WP03 grain-level hold. That decision keeps bare `milo` off `ingredient-ref-grain-sorghum` and explicitly left `milo flour` outside its scope pending a specific catalog need. This A6 review evaluates the flour-qualified candidate, new Canadian retail wording, and its consequence for the exact current picker. It does not move `milo` onto the grain row or reverse the grain decision. A revisit is appropriate if search can require the full `milo flour` phrase without assigning bare `milo`, or after the competing Milo drink product is separately reviewed and represented.

The proposal accepts that the *qualified product phrase* can refer to sorghum flour in the reviewed Canadian listings. It does **not** conclude that every use of the word `milo` means flour, that it is a Québec French name, or that it is safe as a current picker alias.

## Identity, name, and ownership assessment

| Evidence dimension | Finding | Limit |
|---|---|---|
| Plant / crop relationship | CFIA includes `milo` among English common names for *Sorghum bicolor*. | CFIA cautions that common names can be restricted to particular subspecies, races, working groups, or uses. It is not a flour naming standard. |
| Grain-class scope | CFIA's Canadian Feed Ingredients Table distinguishes generic sorghum grain from “Sorghum milo grain (or milo),” defined as whole grain of the milo variety. | The table is for animal feed; it is a boundary warning, not a human-food definition for the candidate flour. The earlier grain hold remains in force. |
| Flour product linkage | OM Foods' title and product description link sorghum flour with “Milo”; Bulk Mart's product copy directly names `milo flour`. | These are retailer product descriptions. They establish wording on those listings, not one uniform milling specification or universal use of the alias. OM Foods displayed “Notify Availability” at review time; no availability is inferred. Bulk Mart's search-indexed text was retrievable, while direct page opening returned a cache miss, so it is corroborative rather than the sole deciding source. |
| Québec French | Keep the existing display `farine de sorgho`; the existing OQLF record supports `sorgho` as the Québec term. | No reviewed source establishes `farine de milo`, `farine de sorgho milo`, or another French Milo-flour label. Add no French alias. |
| Competing Canadian meaning | Nestlé describes Milo as a chocolate-malt beverage, and Walmart Canada currently lists `Milo Chocolate Malt Drink Mix`. | This is a separate compound beverage product, not a sorghum ingredient. It creates a real bare-query ambiguity even though the catalog does not yet have an active Milo drink row. |

### Exact current ownership and picker projection

Exact normalized ownership was audited across active reference IDs, display names and aliases; form IDs, labels and match terms; legacy candidate IDs, names and aliases; and ledger record IDs. Normalization followed the repository's `normalizeIngredientSearchKey`: lowercase, NFKD, accent/ligature folding, punctuation to spaces, and whitespace collapse. The picker projection below follows `IngredientReferenceSearchIndex`: complete normalized word-phrase matches win; partial substring matching is used only if there are no complete-phrase matches.

| Query / exact key | Current exact owner or current picker result | Hypothetical picker result if `milo flour` were added to the existing flour row |
|---|---|---|
| `milo` | No exact active, form, legacy, or ledger-ID owner; current picker returns no result. | `ingredient-ref-sorghum-flour` only, because `milo` is a complete phrase within the alias `milo flour`. This is the unsafe capture. |
| `milo flour` | No exact active, form, legacy, or ledger-ID owner; current picker returns no result. | `ingredient-ref-sorghum-flour` only. This qualified query would be useful when the user really means flour. |
| `milo drink mix` | No active owner; current picker returns no result. | Still no result. The two-word alias does not make the complete longer drink phrase match. |
| `sorghum flour` / `farine de sorgho` | `ingredient-ref-sorghum-flour`. | Same single existing owner. |
| `jowar flour` | `ingredient-ref-sorghum-flour` (existing English alias). | Same single existing owner. |
| `grain sorghum` / `sorgho à graine` | `ingredient-ref-grain-sorghum`; its current French aliases also include `sorgho en grain` and `sorgho en grains`. | Unchanged. No `milo` alias is proposed for this grain row. |
| `ingredient-ref-milo-sorghum-flour` | No active reference or ledger record ID. | No new ID is proposed. |

The app is case-insensitive under this normalization, so `Milo` and `milo` have the same picker effect. The current WP05 beverage review keeps generic malt-drink mix coverage pending a separate identity decision; it does not provide a competing active picker result that could mitigate the false single result.

## Exact proposed disposition and fields

**Hold with no active catalog field changes.** The candidate belongs, if later accepted, on the existing sorghum-flour row as an English alias; it does not justify a duplicate identity. For this review, retain the data exactly as follows:

| Field / record | Proposed value after this review |
|---|---|
| Reference ID | Keep `ingredient-ref-sorghum-flour`; do not reserve `ingredient-ref-milo-sorghum-flour`. |
| `nameEn` / `nameFr` | Keep `sorghum flour` / `farine de sorgho`. |
| `aliasesEn` | Keep `["jowar flour"]`; do not append `milo flour` or bare `milo`. |
| `aliasesFr` | Keep `[]`; add no French Milo phrase. |
| `category` | Keep `FLOUR_AND_STARCH`. |
| `defaultDensity` / `unitMappings` | Keep `null` / `[]`. |
| Attached forms | Keep none for this reference. Add no form. |
| Target ledger record | Keep `ingredient-ref-sorghum-flour`, `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Do not change either research state based on this alias review. |
| Recipes / recipe links | No change and no new recipe link. |

If the root coordinator records this hold in the ledger, use an accepted boundary decision on the existing `ingredient-ref-sorghum-flour` record with only the new source IDs listed below; do not create an active reference or numeric/substitution finding. The exact disposition is: “Hold `milo flour` off `ingredient-ref-sorghum-flour` aliases because current phrase search would make bare `milo` return sorghum flour alone despite a distinct current Canadian Milo chocolate-malt drink product; retain only the existing `jowar flour` alias and current bilingual display.”

## Forms, measurements, and substitutions

- The live sorghum-flour row has no attached form, no active density, and no unit mapping. Its ledger states measurement and substitution research as `not_yet_researched`; this alias review leaves those states unchanged.
- OM Foods lists package sizes of 454 g, 2.27 kg, and 11.34 kg. Bulk Mart's 50 lb listing and Westpoint Naturals' 400 g package are package quantities only. None supplies a defined cup, spoon, loose/sifted method, or product-matched mass-per-volume conversion. Do not convert any of these package sizes into a kitchen measure or density.
- FSSAI's 2025 Jowar Flour standard describes the milling product and includes quality limits and particle-size requirements. Those are regulatory product specifications, not culinary measures or density evidence.
- Westpoint Naturals says its sorghum flour can be used as a wheat-flour alternative and recommends combining it with tapioca starch, cornstarch, or legume flours “for best texture.” This is qualitative, supplier-specific product guidance with no ratio or tested recipe context in the listing. It does not support a general one-for-one wheat replacement, an active contextual substitution, or a substitution from any other flour. This review adds no observation or substitution rule.
- No reviewed page supports forms such as sprouted, toasted, or decorticated sorghum flour. Keep those product states unmodeled here unless separately evidenced.

## Recipe demand and current baseline snapshot

The package manifest currently lists **114 recipe files** containing **1,123 ingredient rows**. The audit searched each full recipe JSON file and each ingredient row for normalized `milo`, `milo flour`, `sorghum flour`, `sorghum (milo)`, `grain sorghum`, `sorghum milo grain`, `malted drink mix`, and `chocolate malt drink mix`. There were **zero recipe-file hits and zero ingredient-row hits**. No recipe demands the alias, the drink product, or a link to this sorghum-flour row.

Read-only audit snapshot for this proposal:

| Surface | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,338 | `31403369c9ab28910a5f88f5b915f794e8bac3fb472b3527f95954a4021343c3` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,646 records; 6,238 source-entry occurrences; 5,241 distinct source IDs | `8e0a39792083df8494584a28eba0a450845fedef06f7d844e2755e2346e16f88` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 0 candidate hits | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The recipe fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte. File hashes are over exact bytes. Ledger source-entry occurrences can repeat where evidence is reused across records; the collision audit below concerns the proposal's new IDs.

## Duplicate and source-ID collision audit

The current A6 checklist and the proposal/batch archive were searched before selection. Completed neighboring decisions include `jowar flour` on `ingredient-ref-sorghum-flour`, regional buckwheat flour aliases, millet flour identities/aliases, and the separate WP03 hold of bare `milo` from the grain-sorghum row. The WP03 hold specifically says Milo flour is outside that grain identity and defers it for separate review; no earlier WP02 A6 proposal or batch was found that decides the exact flour phrase `milo flour` or its current picker consequence. The separate WP05 beverage review has no active Milo drink reference and does not decide this flour alias.

The following new source IDs were checked against the live ledger and all text/JSON proposal and batch records before this proposal was written; none was present. No measurement-observation, substitution-finding, or new identity ID is needed or proposed.

### Existing ledger sources reused, not re-registered

| Existing source ID | Source and use in this review |
|---|---|
| `WP03-MILO-GRAIN-20261012-S03` | CFIA, [The Biology of *Sorghum bicolor*](https://inspection.canada.ca/en/plant-varieties/plants-novel-traits/applicants/directive-94-08/biology-documents/sorghum-bicolor-moench), §§2.4 and 4.3. The current document lists milo among common English names for the plant and says common names can be narrower by race, group, or use. It is crop-name context, not a flour naming standard. |
| `WP03-MILO-GRAIN-20261012-S04` | CFIA, [Canadian Feed Ingredients Table](https://inspection.canada.ca/en/animal-health/livestock-feeds/documents-incorporated-reference/canadian-feed-ingredients-table), entries 1-201-014 and 1-201-015. Distinguishes generic sorghum grain from feed-table `sorghum milo grain (or milo)`, whole grain of the milo variety. |
| `WP02-A6-JOWAR-FLOUR-20261012-S01` | FSSAI, [Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 dated 2025-05-07, §2.4.18, PDF p. 58. Defines Jowar Flour (Sorghum Flour) as milled from *Sorghum bicolor*. It establishes the existing flour class, not Milo as a name. |
| `WP02-A6-JOWAR-FLOUR-20261012-S03` | OQLF, [sorgho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho), GDT. Retains the existing Québec French base-term evidence; it does not name `milo flour`. |

### New proposal-local source register

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A6-MILO-FLOUR-PICKER-HOLD-20261013-R4-S01` | OM Foods, [SORGHUM FLOUR (MILO)](https://omfoods.com/collections/baking/products/seeds-grains-legumes-whole-grains-flours-organic-sorghum-flour-milo), product title, description, listed ingredient, and package options; company [About Us](https://omfoods.com/pages/about), checked 2026-10-13. | Current Canadian retailer page titled `SORGHUM FLOUR (MILO)` says flour from sorghum grain (Milo) and lists sorghum as ingredient. OM Foods identifies itself as a Canadian company based in British Columbia. The page showed “Notify Availability” at review time; product presence/wording is not an in-stock claim. Package masses are not measures. |
| `WP02-A6-MILO-FLOUR-PICKER-HOLD-20261013-R4-S02` | Bulk Mart, [Sorghum Flour Gluten Free, Jowar Flour 50 Lbs](https://bulkmart.ca/collections/gluten-free-foods/products/sorghum-flour-gluten-free-jowar-flour-50-lbs), product copy returned by current search result, checked 2026-10-13. | The listing calls `milo flour` one name for its sorghum flour and states it ships across Canada and the United States. The page's direct open returned a browser cache miss, so this is corroborative retailer wording rather than a sole authority. Its 50 lb is package mass, not a recipe quantity. |
| `WP02-A6-MILO-FLOUR-PICKER-HOLD-20261013-R4-S03` | Westpoint Naturals, [Organic Sorghum Flour](https://westpointnaturals.shop/products/organic-sorghum-flour), product information, ingredients, and use; [Contact](https://westpointnaturals.shop/pages/contact), checked 2026-10-13. | The current product page says the flour is ground from whole organic sorghum grain and that sorghum is also known as milo; it lists organic sorghum, a US product origin, and 400 g package. The contact page locates the supplier in Port Coquitlam, BC; the flour listing showed in stock. This supports the name relationship in a Canadian-facing flour listing, but does not establish a standard or ratio. |
| `WP02-A6-MILO-FLOUR-PICKER-HOLD-20261013-R4-S04` | Walmart Canada, [Milo Chocolate Malt Drink Mix, 400 g](https://www.walmart.ca/en/ip/Milo-Chocolate-Malt-Drink-Mix-400gr/10295042), product title/category/current listing, checked 2026-10-13. | Current Canadian retail result places Milo in Hot Chocolate Mixes and identifies the item as a chocolate-malt beverage mix; the page showed it sold by Walmart. This supports the live competing meaning for a bare picker query, not a sorghum identity. |
| `WP02-A6-MILO-FLOUR-PICKER-HOLD-20261013-R4-S05` | Nestlé Global, [Coffee and beverages — Milo](https://www.nestle.com/brands/food-service/coffee-beverages), current brand description, checked 2026-10-13. | First-party Nestlé description calls Milo a chocolate-malt beverage prepared hot or cold and identifies it as a beverage product. It confirms product class, not Canadian store availability. |

## Review disposition

**Hold `milo flour` off active aliases for now.** It is a distinct, source-backed flour wording gap, but under today's picker a qualified alias makes bare `milo` return sorghum flour alone. Keep `ingredient-ref-sorghum-flour` and `ingredient-ref-grain-sorghum` unchanged, preserve the prior grain-level hold, and make no recipe, form, measurement, density, conversion, yield, or substitution change. The broader WP02 A6 checklist remains open.

## Static verification

- Confirmed the requested round-4 destination did not exist before drafting.
- Checked all five new source IDs absent from the live ledger and proposal/batch text archives before assigning them.
- Recomputed exact candidate ownership and current/hypothetical picker results from all 1,338 references and 98 forms using the repository search normalizer and complete-phrase-before-partial matching behavior.
- Scanned all 114 manifest recipe files and 1,123 ingredient rows; no candidate phrase hits.
- No app tests, unit tests, instrumentation tests, or emulator checks were run during the proposal review.

## Integration record

Root kept the alias off active catalog data and added the five source records plus one accepted boundary decision to the existing `ingredient-ref-sorghum-flour` ledger record. No reference, form, observation, substitution finding, or recipe changed. Static ledger-schema validation, source and state assertions, current/hypothetical picker projection, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. See the [integration batch record](../batches/wp02-a6-milo-flour-picker-hold-integration-20261013/README.md).
