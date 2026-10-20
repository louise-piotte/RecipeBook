# WP06 Section 05 — Italian burrata identity review (R396)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review changes only this proposal file; it does not change canonical catalog data, forms, the research ledger, recipes, generated files, the Europe checklist, workflow, or roadmap.
- **Scope:** One Southern Italian fresh-cheese candidate: burrata.
- **Source-ID prefix:** `WP06-EUROPE-BURRATA-R396-20261017`. IDs below are proposal-local and were checked for collisions.

## Recommendation

Add one identity-only `CHEESE` reference for **burrata / burrata**. OQLF lists *burrata* as the preferred feminine French term and the English term, so use the same word for both displays. Keep exact Canadian market wording in narrow search aliases: `burrata cheese` and `fresh burrata cheese` in English, and `fromage burrata frais` in French. Add no forms, reusable measures, density, unit mappings, package yields, conversions, recipe links, or active substitution rule.

OQLF defines burrata as a soft Italian cheese made of mozzarella with cream introduced into it. A Canadian producer describes its product as a stretched-curd mozzarella pouch filled with stracciatella (shredded cheese curd and cream), and explicitly distinguishes burrata from mozzarella. A current Québec retailer lists a product titled `Fromage burrata frais`; the English page for that same item uses `Fresh burrata cheese`. These sources support a distinct ingredient identity and Québec-facing naming without implying a single recipe or milk composition for all burrata. [S01, S03–S05]

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-burrata",
  "nameFr": "burrata",
  "nameEn": "burrata",
  "aliasesFr": ["fromage burrata frais"],
  "aliasesEn": ["burrata cheese", "fresh burrata cheese"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "CHEESE"
}
```

The canonical display follows OQLF. The aliases preserve current English and Québec French product-title wording; they do not imply a different cheese state or a generic synonym for every product containing mozzarella, cream, or stracciatella. No form is proposed because the bundle has no matching ingredient demand and the reviewed product pages do not establish a general form taxonomy.

## Product and naming boundaries

Burrata is a fresh Italian cheese with a stretched-curd outer layer and a creamy filling. The inner filling is often called *stracciatella*, but *stracciatella* is not an alias for the whole cheese; it is also sold as a distinct cheese product. Keep active `ingredient-ref-mozzarella` separate: both OQLF’s definition and the Canadian producer distinguish burrata from mozzarella, even though mozzarella is used in making burrata. Do not add mozzarella, cream, or stracciatella as aliases. [S01, S03, S07]

Keep the following terms outside the proposed alias arrays:

- **`Burrata di Andria`:** a specific Italian protected geographical indication (PGI), not a generic synonym. Its specification describes cow’s-milk cheese with a stretched-curd exterior and cream-and-curd filling, and gives a product weight range of 100 g to 1 kg. Those requirements and measurements apply only to the named PGI. [S02]
- **`burratini`:** do not use as a global alias or form. Dairy Farmers of Canada’s Bella Casara brand listing names *Burrata* and *Burratini* as separate products; that naming supports keeping them distinct without asserting a universal definition for every producer. [S08]
- **`stracciatella`:** the filling term/product, not the complete burrata. Tanto Latte lists stracciatella separately from burrata. [S03]
- **Milk species, producer names, and brands:** do not add buffalo-milk or cow-milk qualifiers, or a producer/brand name, as generic aliases. The EU PGI and individual Canadian products have product-specific milk and process details; these do not establish a universal burrata composition. [S02, S03]
- **Mozzarella, fresh mozzarella, and cream:** related components, not interchangeable names for the assembled cheese. The source description of fresh mozzarella as the closest alternative still says that it lacks burrata’s creamy center. [S07]

### Québec French and current Canadian naming

OQLF’s preferred term is **burrata**, feminine; it says the Italian borrowing is acceptable because it names a culinary reality associated with Southern Italy. This is direct Québec terminology support for the display, not merely an inference from a retailer label. [S01]

Current Canadian market wording corroborates the same term: a Québec retailer’s French page calls its 250 g item `Fromage burrata frais`, while its English page calls the same item `Fresh burrata cheese`. A Canadian maker in British Columbia titles its product `Burrata Cheese` and describes its own product in relation to mozzarella and stracciatella. Retailer and maker pages support search wording and the presence of Canadian products; they do not prove province-wide stock or set a universal formula. [S03–S05]

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Live count | Finding |
|---|---:|---|
| Active ingredient references | 1,703 | No `ingredient-ref-burrata` row and no exact owner for `burrata`, `burrata cheese`, `fresh burrata cheese`, or `fromage burrata frais`. |
| Ingredient forms | 141 | No burrata, burratini, or stracciatella form label or match term. |
| Legacy import candidates | 56 | No burrata-family candidate. |
| Research ledger | 2,063 records; 9,316 source entries; 7,888 distinct source IDs; 6,609 distinct URLs | No burrata record or source-prefix collision. The proposed R396 IDs and URLs are absent. |
| Manifest-listed bundled recipes | 114 files; 1,123 ingredient rows | No burrata-family match or recipe line to link; scan details follow. |

The active ingredient names and aliases, all form labels and match terms, legacy candidate names and aliases, and ledger record text were checked for the candidate and boundary phrases. No owner was found. A text audit of the 2,695 Markdown files in the proposal and batch archives found no earlier burrata, burratini, or stracciatella review. Before this proposal was written, the specific candidate ID `ingredient-ref-burrata`, proposal target path, R396 source-ID prefix, and all eight source URLs below had no archive or ledger collision. No prior European review allocated this identity; R393’s Norwegian brunost decision is distinct. The Europe checklist remains open and no shared plan or progress file was edited.

The active related identity is `ingredient-ref-mozzarella` (`mozzarella / mozzarella`), with no burrata alias. The existing `ingredient-ref-cream-cheese` and `ingredient-ref-cheese-curds` remain distinct dairy products; neither is a burrata synonym or substitute. There is no active stracciatella or burratini row.

The global Europe checklist remains **“Western, Southern, Northern, Central, and Eastern Europe; include breads, pastry, charcuterie, pickles, and cheese traditions.”** ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8715)) It is still unchecked. This single product review does not represent any regional survey or close any part of Europe-wide coverage.

## Exact picker projection

The current picker normalizes case, accents, punctuation, and spacing; it searches bilingual names, aliases, and attached form terms, preferring full word-phrase matches before partial matches. The projection below was checked against the live catalog and picker behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Query | Current result | With proposed row |
|---|---|---|
| `burrata`; `burrata cheese`; `fresh burrata`; `fresh burrata cheese` | No result | `ingredient-ref-burrata` only |
| `fromage burrata`; `fromage burrata frais` | No result | `ingredient-ref-burrata` only |
| `mozzarella` | `ingredient-ref-mozzarella` only | Same single result; no mozzarella alias is added |
| `stracciatella`; `burratini`; `Burrata di Andria` | No result | No result; filling, separate retail products, and the PGI name stay unallocated |
| `cheese` | 11 broad cheese results | 12, including `ingredient-ref-burrata` |
| `fromage` | 9 broad cheese results | 10, including `ingredient-ref-burrata` |

The two descriptive alias phrases intentionally add the new identity to broad `cheese` and `fromage` searches. They do not broaden `mozzarella`, `stracciatella`, `burratini`, or the protected `Burrata di Andria` name.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 ingredient rows** were parsed as UTF-8. The scan searched the full decoded recipe documents and each structured ingredient object, including the original line text, ingredient name, reference ID, and form ID, for `burrata`, `burratini`, `burratina`, `burrata di Andria`, `burrata cheese`, `fresh burrata cheese`, `fromage burrata`, `fromage burrata frais`, and `stracciatella`. It found **zero matching recipe files, zero matching ingredient rows, and zero recipe links**.

For reproducibility, the manifest-order recipe fingerprint is `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. It was computed by hashing each manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a newline, then hashing the concatenated bytes.

## Numeric, form, and substitution boundaries

- The Québec recipe source gives **one burrata weighing 200 g** in a recipe for two portions. If accepted, this can be kept as one recipe-specific published portion-weight observation, with the dish, recipe, and quantity basis attached. It is not a standard serving, a universal piece weight, or an active unit mapping. [S06]
- Aubut currently lists a specific Bella Casara **250 g** retail item and a six-pack of that same 250 g unit. Record it only as the retailer’s SKU/package description, not a generic burrata weight or yield. [S04–S05]
- The European Commission’s **100 g–1 kg** range is for *Burrata di Andria* PGI alone. Do not transfer it to generic burrata or use it as a household measure. [S02]
- If an identity record is integrated, `measurementState: researched_supported` may reflect the narrowly scoped 200 g recipe observation. Keep `defaultDensity: null`, `unitMappings: []`, and add no form, conversion, package-yield rule, or generic mass-per-piece value.
- Food Network’s cheesemonger interview calls fresh mozzarella the closest substitute but says it lacks burrata’s creamy center; the same source says there is no true substitute and offers a qualitative DIY stracciatella idea without a quantity or validated recipe context. This does not support a global or contextual replacement rule. If recorded in the ledger, keep the finding qualitative and blocked pending recipe-specific evidence (`substitutionResearchState: blocked_pending_evidence`). [S07]

## Source register

Pages were accessed on 2026-10-17. Each proposal-local source ID maps to one exact URL; no source ID or URL below has a current ledger/archive owner.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-BURRATA-R396-20261017-S01` | OQLF, [GDT: burrata](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544337/burrata), last updated 2018, accessed 2026-10-17. | Defines burrata as a soft Italian cheese made of mozzarella with cream introduced; gives French preferred term *burrata* (feminine) and English *burrata*. Terminology and broad identity, not a producer formula. |
| `WP06-EUROPE-BURRATA-R396-20261017-S02` | European Commission, [Official Journal C 2024/1948 — Burrata di Andria PGI](https://eur-lex.europa.eu/legal-content/EN/ALL/?uri=CELEX%3A52024XC01948), single document, §§ 1–3.2, accessed 2026-10-17. | Defines the named PGI as a cow’s-milk stretched-curd cheese with a cream-and-curd filling and gives a 100 g–1 kg weight range. These specifications apply only to *Burrata di Andria* PGI; not a generic burrata measure or naming basis. |
| `WP06-EUROPE-BURRATA-R396-20261017-S03` | Tanto Latte Cheese, [Burrata Cheese](https://www.tantolattecheese.ca/products/burrata-cheese/), product description and “Burrata Cheese vs. Mozzarella Cheese,” accessed 2026-10-17. | Canadian maker’s product title supports the English phrase; describes its burrata as mozzarella/pasta filata with stracciatella and cream, and separately lists stracciatella. Its Canadian cow’s-milk product and process do not establish the composition of every burrata. |
| `WP06-EUROPE-BURRATA-R396-20261017-S04` | Aubut, [Fromage burrata frais — Bella Casara](https://www.aubut.ca/produits/details/fromage-burrata-frais-967), accessed 2026-10-17. | Current Québec retailer page supports the French product-title phrase and lists a Bella Casara 1 × 250 g item and six-pack of 250 g units. SKU/package information only; stock and package data can change. |
| `WP06-EUROPE-BURRATA-R396-20261017-S05` | Aubut, [Fresh burrata cheese — Bella Casara](https://www.aubut.ca/en/products/details/fresh-burrata-cheese-967), accessed 2026-10-17. | English-language page for the same Bella Casara product number as S04; supports the English label. It is the same retail SKU, not an independent product or measurement source. |
| `WP06-EUROPE-BURRATA-R396-20261017-S06` | Salut Bonjour, [La burrata crémeuse de Jean-François Plante…](https://www.salutbonjour.ca/cuisine/recettes/la-burrata-cremeuse-de-jean-francois-plante-avec-duo-davocat-releve-et-saumon-fume), published 2026-02-13, accessed 2026-10-17; ingredients and portions. | Québec French recipe says one burrata of 200 g for two portions. This is one recipe’s amount and local usage, not a reusable portion standard or an overall Canadian terminology ruling. |
| `WP06-EUROPE-BURRATA-R396-20261017-S07` | Food Network, [What Is Burrata?](https://www.foodnetwork.com/how-to/packages/food-network-essentials/what-is-burrata), published 2024-05-30, cheese-monger interview, “Burrata vs. Mozzarella” and “Burrata Substitutes,” accessed 2026-10-17. | Qualitative product and substitution boundary: fresh mozzarella is closest but lacks the creamy center; the interviewee says there is no true substitute and describes DIY stracciatella without a ratio. Not an equivalence test or rule. |
| `WP06-EUROPE-BURRATA-R396-20261017-S08` | Dairy Farmers of Canada, [Bella Casara brand listing](https://dairyfarmersofcanada.ca/en/canadian-goodness/blue-cow-spotter/brand-listing/bella-casara), product list, accessed 2026-10-17. | Lists Bella Casara Burrata and Bella Casara Burratini separately. Supports keeping the product names distinct in this brand’s Canadian catalogue; it does not define burratini across producers. |

## Disposition

Proceed only with the one identity-only row above if accepted. Keep the product’s name Québec-friendly as **burrata**, preserve mozzarella, stracciatella, burratini, and *Burrata di Andria* as distinct boundaries, and leave the broader Europe checklist open. The recipe-specific 200 g amount may be retained only with its source and two-portion context; no general measure or substitution is supported. This proposal edits no JSON and no software tests, build, or emulator run were performed.
