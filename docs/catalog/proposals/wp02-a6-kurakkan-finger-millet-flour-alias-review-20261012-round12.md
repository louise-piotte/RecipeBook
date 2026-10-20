# WP02 A6 regional flour follow-up: Kurakkan / finger-millet naming review

## Review record

- **Reviewed and sources accessed:** 2026-10-12.
- **Status:** Accepted and integrated; see [the batch README](../batches/wp02-a6-kurakkan-alias-integration-20261012/README.md).
- **Scope:** Check the regional name `kurakkan` at the grain/flour boundary and decide whether the exact product phrase `kurakkan flour` belongs on an existing flour reference.
- **Plan context:** The [WP02 A6 plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1252) remains open for regional grain flours. Recent entries cover Jau Atta, several millet flours, nachni and ragi atta aliases, and holds for barnyard, Sikiya, and sprouted pearl millet; no earlier plan or archive entry for Kurakkan was found. This review covered the uncovered name boundary without reopening those decisions.
- **Source IDs:** Proposal-local IDs `WP02-A6-KURAKKAN-FLOUR-20261012-S01` through `S10` were unused in the live ledger and the 796 proposal files in the pre-draft check. A final scan found no prefix or S01–S10 collision in the 797 other proposal files currently archived. Existing source IDs for OQLF generic `millet`, Canadian French `farine de ragi`, and Health Canada’s finger-millet identity are reused and not duplicated.
- **Proposal path:** `docs/catalog/proposals/wp02-a6-kurakkan-finger-millet-flour-alias-review-20261012-round12.md` was unused before drafting.

## Recommendation

Add only two English aliases to existing identities:

1. Add **`kurakkan`** to `aliasesEn` on `ingredient-ref-finger-millet` (`finger millet / éleusine cultivée`), because Sri Lanka’s education ministry identifies Kurakkan as the local name for finger millet.
2. Add **`kurakkan flour`** to `aliasesEn` on `ingredient-ref-finger-millet-flour` (`finger millet flour / farine de ragi`), because a current Canadian flour listing explicitly groups Kurakkan Flour with Finger Millet Flour and Ragi Flour, supported by Sri Lankan product and flour-definition evidence.

Do not create a Kurakkan ingredient ID. Keep the existing French display `farine de ragi`; add no French alias. Do not attach bare `kurakkan` to the flour, attach `kurakkan flour` to generic millet or pearl-millet flour, or generalize this alias to roasted or sprouted products.

| Wording or data | Recommendation | Evidence boundary |
|---|---|---|
| `kurakkan` | Add as an English alias on `ingredient-ref-finger-millet`. | Sri Lanka’s Ministry of Education maps the name to finger millet (*Eleusine coracana*); it is a grain name. [S02] |
| `kurakkan flour` | Add as an English alias on `ingredient-ref-finger-millet-flour`. | A current Canadian retailer directly groups the exact phrase with Finger Millet Flour and Ragi Flour; manufacturer and draft product-standard evidence agree on the base flour identity. [S01, S03–S05] |
| `farine de ragi` | Retain the existing French display; add no French alias. | A Montréal supermarket menu uses `Farine de Ragi` alongside English `Ragi flour`; OQLF’s generic `millet` entry groups multiple species and does not provide a Kurakkan-specific Québec French name. [S10; WP02-A6-GRAIN-FLOUR-GAPS-20261010-S02] |
| `kurakkan atta`, `kurakkan powder`, `kurrakkan`, `kurahan` | Do not add in this pass. | The reviewed sources do not establish these exact variants as stable flour aliases. |
| `roasted kurakkan flour`, `sprouted kurakkan flour` | Keep outside the unqualified flour alias. | First-party and Canadian retail sources name roasted and sprouted products separately; neither source establishes equivalence with unqualified Kurakkan flour. [S06–S07] |
| New identity, form, recipe link, active density, unit mapping, conversion, yield, or substitution | Add none. | The evidence supports the name boundary. Measurement studies are sample-specific and the bread study is formula-specific; no current recipe demand was found. [S08–S09] |

## Name, product, and Québec French boundary

The Sri Lanka Ministry of Education’s food lesson names finger millet as *Eleusine coracana* and says it is called Kurakkan in Sinhala and Tamil [S02]. The Sri Lanka Ministry of Health’s draft cereal-flour regulations define Kurakkan flour as the product of grinding and sieving *E. coracana* [S01]. The latter is explicitly a **draft**, not an operative legal standard; use it only as direct product-boundary evidence. It is not a Canadian or Québec naming rule.

Two current product sources make the English flour relationship concrete. Ceylon Star’s manufacturer page titles its product `Kurakkan Flour` and identifies it as finger millet [S03]. Canadian retailer Ceylon Groceries currently lists `Kurakkan Flour | Finger Millet Flour | Ragi Flour` in its flour collection and shows a CAD price [S04]. Lakshop’s Canadian product page is titled `Wijaya Kurakkan Flour 400g`; its ingredient field says “100% groung seeds of Eelusine Coracana(Kurakkan)” [S05]. The seller’s spelling errors are not copied into the catalog; the page supports its product wording and source-grain claim only. It was marked sold out when checked, and 400 g is package mass rather than a recipe measure.

The existing flour reference already has the English display `finger millet flour`, French display `farine de ragi`, and English aliases `ragi flour`, `nachni flour`, and `ragi atta`. Reuse its existing Canadian French evidence `WP06-SA-20261010-S05`: Walmart Canada’s French-facing Verka listing uses `Farine de ragi` and describes ragi flour as finger-millet flour. The item was out of stock when reviewed, so it supports wording, not availability. A current Montréal supermarket menu also lists `Farine de Ragi (2 lbs) / Ragi flour (2 lbs)` [S10], supporting local Québec retail usage without making the marketplace a terminology authority. OQLF’s existing `millet` record `WP02-A6-GRAIN-FLOUR-GAPS-20261010-S02` says the French word is generic across multiple species; it does not establish `farine de kurakkan` or another species-specific Québec display. Preserve the current French display and do not translate the regional name mechanically.

The product boundary remains narrow. Add bare `kurakkan` to the grain row, and the complete phrase `kurakkan flour` to the flour row. Do not put the bare name on the flour record or map the flour phrase to generic millet flour. Do not add `kurakkan rice`: Canadian listings use rice in some product names for intact grain, but that wording is not a flour name. Do not create an identity for the roasted or sprouted products: Majee Enterprises lists `Roasted Kurakkan Flour` as its own product name, and a Canadian listing names `Sprouted Kurakkan Flour` separately [S06–S07]. Those sources establish process-qualified product labels, not their processing specifications or a general identity relationship.

## Current ownership and picker projection

The live catalog currently has these relevant owners:

- `ingredient-ref-finger-millet`: `finger millet / éleusine cultivée`; English alias `ragi`.
- `ingredient-ref-finger-millet-flour`: `finger millet flour / farine de ragi`; English aliases `ragi flour`, `nachni flour`, and `ragi atta`.
- `ingredient-ref-millet-flour`: `millet flour / farine de millet`.

Exact-key ownership was checked after Unicode normalization, case folding, accent/ligature folding, punctuation replacement, and whitespace collapse across active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs.

| Exact normalized key | Current active reference owner | Form / legacy / ledger record-ID owner | Proposed result |
|---|---|---|---|
| `kurakkan` | none | none | `ingredient-ref-finger-millet` alias |
| `kurakkan flour` | none | none | `ingredient-ref-finger-millet-flour` alias |
| `kurrakkan`, `kurahan`, `kurakkan atta`, `kurakkan powder` | none | none | Leave unassigned |
| `roasted kurakkan flour`, `sprouted kurakkan flour` | none | none | Leave unassigned |
| `farine de kurakkan` | none | none | Leave unassigned |
| `finger millet` | `ingredient-ref-finger-millet` | none | Retain current grain owner |
| `finger millet flour`, `ragi flour`, `farine de ragi` | `ingredient-ref-finger-millet-flour` | none | Retain current flour owner |
| `ragi` | `ingredient-ref-finger-millet` | none | Retain current grain owner; existing flour phrase also returns flour by phrase containment |
| `millet flour`, `farine de millet` | `ingredient-ref-millet-flour` | none | Keep generic flour separate |

The project’s `IngredientSearch.kt` prefers complete normalized word phrases contained in a catalog term, then falls back to partial matching. Under a static projection of the proposed aliases:

- `kurakkan` returns both finger-millet grain and finger-millet flour because it is the full grain alias and a complete word phrase inside `kurakkan flour`; the user sees both product-level choices.
- `kurakkan flour` returns only `ingredient-ref-finger-millet-flour`.
- `roasted kurakkan flour`, `sprouted kurakkan flour`, `kurakkan atta`, and `farine de kurakkan` return no results.
- Existing `farine de ragi` returns only the flour; existing `ragi` and `finger millet` each return grain and flour.
- The generic `millet flour` query already returns six millet-flour identities. This review adds no row and does not change that broader result.

This is a read-only projection of current search terms plus the two proposed aliases, not a runtime picker test.

## Bundled recipe demand

The complete seed-manifest order was read and each of the 114 recipe JSON files and all 1,123 ingredient rows were scanned for Kurakkan spellings, the proposed displays/aliases, existing finger-millet terms, the botanical name, French variants, and roasted/sprouted product phrases. The scan found **zero recipe-file hits**, **zero ingredient-row hits**, and **zero direct recipe links** to `ingredient-ref-finger-millet` or `ingredient-ref-finger-millet-flour`.

No recipe edit, ingredient-row change, or recipe link is proposed. This is a catalog naming review based on current product evidence, without bundled recipe demand.

## Measurements, density, and substitutions

The current finger-millet flour reference has `defaultDensity: null` and `unitMappings: []`; its ledger measurement and substitution states are `not_yet_researched`. Retail pages list package sizes such as 400 g, 500 g, and 1 kg [S03, S05–S07]. Those are bag/package amounts, not cup or spoon equivalents.

Mudau et al. measured loose and packed bulk density for laboratory-prepared light- and dark-brown finger-millet flours [S08]. Their native 0-hour control values were:

| Study sample | Loose bulk density | Packed bulk density |
|---|---:|---:|
| Light-brown finger millet flour | 0.55 ± 0.07 g/mL | 0.79 ± 0.04 g/mL |
| Dark-brown finger millet flour | 0.47 ± 0.04 g/mL | 0.77 ± 0.00 g/mL |

The study washed and dried grains for 24 hours at 40 °C, milled them, and sifted through a 500 μm sieve. It used about 10 g in a 25 mL cylinder and tapped for packed density. The article’s prose and method give density in g/mL or g/cm³, but Table 2 prints `g/g` in its column heading; retain that unit-label inconsistency as a source limitation. The ledger now preserves the four 0-hour control values only as source-specific bulk-density observations, with the standard deviations and unit caveat included. They are not observations of Canadian retail Kurakkan flour; active `defaultDensity` remains null and `unitMappings` remain empty. The review found no transferable household cup/spoon measure.

Mudau et al. also tested finger-millet flour replacing wheat flour at 10%, 20%, 30%, and 40% in one straight-dough bread formula [S09]. It used 100 g total flour, kept warm water at 15 mL across blends, and held the other listed ingredients constant. The flour was traditionally dehulled, dried at 50 °C, milled, and sifted below 100 μm. This is bounded evidence for one bread product and protocol; the study reports that higher than 50% replacement gave poor prototypes, which further cautions against treating its tested levels as universal. It does not support a global wheat-substitution rule or a direction-independent conversion for other recipe types. The ledger records this finding as `blocked_pending_evidence`; no active substitution rule or recipe-line substitution was added.

## Integration applied

Integration performed on 2026-10-12:

1. Add only `kurakkan` to `aliasesEn` on `ingredient-ref-finger-millet` and `kurakkan flour` to `aliasesEn` on `ingredient-ref-finger-millet-flour`.
2. Retain `finger millet flour / farine de ragi`, the existing aliases, categories, and all other display fields. Keep `kurakkan` off the flour row and `kurakkan flour` off generic millet or pearl-millet flour. Create no new identity, form, legacy candidate, or recipe link.
3. Add sources S01–S10 and accepted alias decisions to the two existing ledger records; reuse the existing OQLF, Canadian French retail, and Health Canada sources cited above rather than duplicate them. Preserve the S08 values as source-specific observations with the stated unit caveat; keep `defaultDensity` null, `unitMappings` empty, and general substitution blocked.
4. Add no package yield, measure, conversion, active density, recipe line, or runtime substitution.
5. Leave WP02 A6 open.

No app, unit, instrumentation, or emulator tests were run. This update adds database JSON data and regenerates the bundled ingredient search index; the repository `AGENTS.md` says tests are not needed for this data-only change.

## Pre-integration snapshot and audit method

Snapshot captured from the shared working tree before integration on 2026-10-12. Hashes cover exact file bytes. The corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, its exact recipe bytes, and a trailing NUL byte.

| Surface | Live snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,324 rows; 139 `GRAIN_AND_CEREAL` | `6b4a1e34d8b7e8b75fdaf48c1bbf27c6ca1ce6562a75dc958a00d1b9e5014a7d` |
| Ingredient forms | 98 rows | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,632 records; 6,017 source entries; 5,033 distinct source IDs; 8 unit conversions | `b959f36a409e902795dfc8f5322cfbce667e7e7c0030eecef6c6c49ca3298d0d` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,324 reference entries | `d2f206e8499e985c8195a76ce1d38cd39de4f9781f283f5d5fc05f485f4472ba` |

Before integration, static proposal checks confirmed the target terms had no exact owner, the source prefix and all ten source IDs had no collision in the ledger or other archived proposals, the picker projection was as listed above, and the full recipe scan had no candidate matches. No application tests were needed or run.

## Source register

New pages were accessed on 2026-10-12. IDs were proposal-local before integration and are now recorded on the reviewed ingredient-reference ledger records.

| ID | Source and locator | Supports and limits |
|---|---|---|
| **WP02-A6-KURAKKAN-FLOUR-20261012-S01** | Sri Lanka Ministry of Health, [Draft Food (Cereals, Pulses and Legumes) Regulations, 2019](https://eohfs.health.gov.lk/food/images/pdf/Draftregulations/Food-Cereal-Pulses-Legumes-Regulations--2019.08.15-lkn-41.pdf), §29, PDF p. 8. | Defines Kurakkan flour as grinding and sieving *Eleusine coracana*. This is a draft regulation, not current law; it supports the flour/source-grain boundary, not a Canadian standard, household measure, or Québec French name. |
| **WP02-A6-KURAKKAN-FLOUR-20261012-S02** | Sri Lanka Ministry of Education / e-Thaksalawa, [Healthy Food 08: Finger Millet](https://e-thaksalawa.moe.gov.lk/lcms/pluginfile.php/44205/mod_resource/content/2/eg10_chap8.pdf), PDF p. 82. | Identifies finger millet as *Eleusine coracana* and says it is called Kurakkan in Sinhala and Tamil. Supports the bare grain alias; it is not a Canadian display or measurement source. |
| **WP02-A6-KURAKKAN-FLOUR-20261012-S03** | Ceylon Star, [Kurakkan Flour](https://www.ceylonstar.lk/products/kurakkan-flour), product page. | The current manufacturer page labels the product “Kurakkan Flour (Finger millet),” lists 400 g and 1 kg sizes, and describes its own grain screening, washing, and drying before milling. Process and sizes are specific to this maker; package weights are not cooking measures. |
| **WP02-A6-KURAKKAN-FLOUR-20261012-S04** | Ceylon Groceries, Canada, [Flour & Noodles collection](https://ceylongroceries.com/collections/flour-noodles), current product title. | Lists `Kurakkan Flour | Finger Millet Flour | Ragi Flour` with CAD pricing, directly supporting the Canadian English alias relationship. This is retail naming, not a milling specification or French terminology authority. |
| **WP02-A6-KURAKKAN-FLOUR-20261012-S05** | Lakshop, Canada, [Wijaya Kurakkan Flour 400g](https://canadianteacentre.ca/products/wijaya-kurakkan-flour-400g-ccalgary), product title and ingredient field. | The Canadian page identifies its product as Kurakkan flour and lists “100% groung seeds of Eelusine Coracana(Kurakkan)” [sic]. The seller’s spelling is not normalized into the catalog. The page was marked sold out; the package mass is not a recipe measure. |
| **WP02-A6-KURAKKAN-FLOUR-20261012-S06** | Majee Enterprises, manufacturer, [Products](https://majee.lk/products.php), indexed product list. | Lists `Roasted Kurakkan Flour 500g` and `Roasted Kurakkan Flour 250g` separately. This is enough to preserve a process-qualified name boundary; the product listing does not establish its process details, equivalence to unroasted flour, or availability. |
| **WP02-A6-KURAKKAN-FLOUR-20261012-S07** | Eraa Supermarket, Canada, [Eraa Sprouted Kurakkan Flour 1kg](https://eraa.ca/products/eraa-sprouted-kurakkan-flour-1kg), current page title and availability. | Names a sprouted product separately and says it is sold out/backordered. Supports exclusion from the unqualified alias, not a sprouting specification or recipe behavior. |
| **WP02-A6-KURAKKAN-FLOUR-20261012-S08** | Mudau et al., [“Mineral Content, Functional, Thermo-Pasting, and Microstructural Properties of Spontaneously Fermented Finger Millet Flours”](https://pmc.ncbi.nlm.nih.gov/articles/PMC9407397/), *Foods* 11(16), 2474 (2022), [DOI 10.3390/foods11162474](https://doi.org/10.3390/foods11162474), §§2.2, 2.4.1 and Table 2. | Gives native light-brown and dark-brown flour loose/packed density values and a 10 g / 25 mL cylinder protocol. Study flour was laboratory-prepared from South African grain. Table 2 prints a `g/g` heading while the method and prose give `g/cm³`/`g/mL`; keep that inconsistency explicit, and do not activate a product-default density. |
| **WP02-A6-KURAKKAN-FLOUR-20261012-S09** | Mudau et al., [“Physicochemical characteristics of bread partially substituted with finger millet (*Eleusine corocana*) flour”](https://www.scielo.br/j/bjft/a/TMz7cB4b8tFJggbkQ3nrNqx/?format=pdf&lang=en), *Brazilian Journal of Food Technology* 24:e2020123 (2021), DOI 10.1590/1981-6723.12320, §§2.2–2.5 and Tables 1–2. | Tests 10–40% flour replacement in one controlled bread formula, with fixed 15 mL warm water and other listed ingredients. The grain was dehulled and milled to a defined lab fraction; the study says prototypes above 50% were poor. It supports only a bounded bread-study finding, not a general substitute rule. |
| **WP02-A6-KURAKKAN-FLOUR-20261012-S10** | Madina Supermarket, Montréal, [Flour menu on Skip](https://www.skipthedishes.com/fr/madina-supermarket), menu listing under “Farine / Flour.” | The bilingual local menu lists `Farine de Ragi (2 lbs) / Ragi flour (2 lbs)`. It supports existing Québec retail wording for ragi/finger-millet flour, not a formal Québec terminology ruling, Kurakkan-specific French term, ingredient specification, or measure. |

**Reused existing evidence:** OQLF, [`millet` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), source ID `WP02-A6-GRAIN-FLOUR-GAPS-20261010-S02`, supports that French `millet` is generic across species. Walmart Canada’s [French-facing Verka ragi flour page](https://www.walmart.ca/fr/ip/Farine-de-ragi-Verka-2-lb/6000203211214), ledger source ID `WP06-SA-20261010-S05`, supports the retained Canadian French wording `farine de ragi`; it was out of stock when checked. Health Canada’s [English crop-group page](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html) and [French crop-group page](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html), existing ledger source IDs `WP03-S190` and `WP03-S191`, respectively, identify finger millet as a cereal grain and use `éleusine` for the French crop name. They remain evidence for the verified grain reference; this proposal does not duplicate them or treat them as flour product labels.
