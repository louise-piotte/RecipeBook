# WP02 Section A7 R469: Khorasan semolina identity review

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Reviewed and integrated as one identity-only reference with six new source records. No aliases, forms, measures, conversions, yields, recipe links, or substitutions were added.
- **Snapshot:** Ownership, picker behavior, and recipe-corpus results describe the pre-integration package and ledger read on 2026-10-17.
- **Open checklist:** WP02 Section A7 remains open for other grain meals and milling products at the [plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Scope:** Assess semolina milled from Khorasan wheat against current Khorasan and semolina ownership, Canadian/Québec evidence, phrase-first picker effects, bundled recipe demand, and quantity/form/substitution limits. This does not reopen Khorasan grain, flour, flakes, or puffed-grain identities, nor other wheat semolina identities.
- **Non-duplication:** The current A7 archive has no focused `Khorasan semolina` decision. R394 covers spring-wheat semolina; R397 barley semolina; R440 emmer semolina; R443 spelt semolina (held); and R454/R455 the distinct Farina and granular-flour products. R458 spelt grits, R462 spelt groats, and R465 amaranth grits are separate reviewed decisions. The Section F Khorasan grain/flakes/puffs and A4 Khorasan flour records do not decide a semolina identity.
- **Proposal-local source-ID prefix:** `WP02-A7-KHORASAN-SEMOLINA-R469-20261017`, IDs `S01`–`S06`. The prefix, proposed identity ID, and six source URLs were checked against the live ledger; none is allocated there. The OQLF and Québec flour-product records below are reused under their existing source IDs.

## Recommendation

**Add one identity-only reference for `Khorasan semolina / semoule de blé khorasan`.** Use `FLOUR_AND_STARCH` to match the active wheat-semolina references. Do not add aliases, forms, measures, or a relationship to another semolina identity.

Current official KAMUT® materials list semolina, re-milled semolina, and whole semolina as products made from KAMUT® brand wheat [S01–S02]. An Italian miller's 2024 product specification separately names fine-calibration organic KAMUT® brand Khorasan semolina and describes a granulated product produced by milling and sifting Khorasan wheat [S03]. The strongest Canadian evidence is a Québec mill and Agriculture and Agri-Food Canada study: Khorasan grain from Alberta was stone-milled into semolina at La Meunerie Milanaise in Québec [S04]. A current Québec retailer also lists Khorasan wheat semolina as an ingredient in a finished pasta [S05]. These sources establish a distinct Khorasan semolina ingredient, while the study and retail record do not establish a current standalone Canadian semolina package.

Use the descriptive French display **`semoule de blé khorasan`**. OQLF's preferred Québec name for the wheat is `blé khorasan`; OQLF defines `semoule de blé dur` as a coarse-milled durum-wheat product and describes Khorasan as an old variety of durum wheat [reused `WP02A4-KH-S01` and `WP02-S23`]. The exact French phrase also appears in an Italian manufacturer's multilingual pasta specification [S06]. This is a source-supported descriptive display, not a claim that OQLF has a dedicated Khorasan-semolina entry or that this exact full phrase appears on a current Québec semolina package. The Québec product evidence is otherwise limited to Khorasan flour and a finished pasta containing Khorasan semolina [reused `WP02A4-KH-S02`; S05].

| Proposed field | Value |
|---|---|
| ID | `ingredient-ref-khorasan-semolina` |
| Category | `FLOUR_AND_STARCH` |
| English display | `Khorasan semolina` |
| French display | `semoule de blé khorasan` |
| English aliases | `[]` |
| French aliases | `[]` |
| Forms | none |
| Default density / unit mappings | `null` / `[]` |
| Measurements, conversions, yields, recipe links, substitutions | none |

Do not add `Kamut semolina`, `Khorasan Kamut semolina`, `whole Khorasan semolina`, `wholemeal Khorasan semolina`, `re-milled Khorasan semolina`, or `fine Khorasan semolina` as aliases. `Kamut` is a registered mark, and whole, remilled, and fine products identify source-specific milling profiles rather than general synonyms [S01–S03; reused `WP02A4-KH-S01`]. Keep the proposed alias arrays empty. Do not alias the identity to durum, spring-wheat, emmer, or generic wheat semolina.

## Product and neighboring-identity boundaries

| Neighbor | Current owner | R469 boundary |
|---|---|---|
| Khorasan wheat | `ingredient-ref-khorasan-wheat-grain` — `Khorasan wheat / blé khorasan` | Whole grain is not the milled semolina. |
| Khorasan flour | `ingredient-ref-khorasan-flour` — `khorasan flour / farine de khorasan` | Keep flour separate; the Québec food-directory portion belongs to this flour product only. |
| Khorasan flakes and puffed Khorasan wheat | `ingredient-ref-khorasan-flakes` and `ingredient-ref-puffed-khorasan-wheat` | Keep these processed grain products separate. |
| Durum semolina and remilled durum semolina | `ingredient-ref-durum-semolina` and `ingredient-ref-semola-rimacinata` | Preserve durum-grain and remilling qualifiers; no cross-grain alias. |
| Spring-wheat and emmer semolina | `ingredient-ref-spring-wheat-semolina` and `ingredient-ref-emmer-semolina` | Preserve their grain-specific identities and French displays. |
| Barley and sorghum semolina | `ingredient-ref-barley-semolina` and `ingredient-ref-sorghum-semolina` | These are separate grain-specific milling products, not aliases for wheat semolina. |

## Current ownership and allocation audit

Read-only snapshot of the shared package and ledger on 2026-10-17. Counts and hashes below describe the proposal-time files inspected.

| Store | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,750 rows; SHA-256 `632f348ab24f24a373592b5408a59eba9c792eca7a2d5c1168ec469d0f085e49` | No display or alias owns `Khorasan semolina`, `Khorasan wheat semolina`, `Kamut semolina`, `semoule de blé khorasan`, or `semoule de Khorasan`. `ingredient-ref-khorasan-semolina` is unused. The current Khorasan rows are grain, flour, flakes, and puffed wheat. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form owns a Khorasan-semolina phrase and no form is attached to a Khorasan row. The only current French form phrase containing `semoule` is `sucre semoule` on the superfine-granulated-sugar form; it is not a cereal-semolina owner. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No Khorasan-semolina name, alias, or proposed ID is allocated. |
| Research ledger | 2,109 records / 9,607 source entries / 8,154 distinct source IDs / 6,867 distinct source URLs; SHA-256 `41471df18c5d9f0fcf5908b19b8d81c40384b54e4c676265a810a5c02a35ba4a` | No `ingredient-ref-khorasan-semolina` or `candidate-khorasan-semolina` record and no prior A7 disposition for the exact candidate phrase. The exact R469 source prefix and S01–S06 IDs are unused. The Khorasan/OQLF and Québec flour-directory URLs already have the reused IDs below; the six R469 source URLs are not present in the ledger. |
| Recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All manifest-listed files exist and parse. The corpus has 1,123 ingredient rows, 753,988 recipe-file bytes, and manifest-ordered fingerprint `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. |

Existing Khorasan rows have null default density and empty unit mappings. The wheat-semolina neighbors likewise have no forms or default densities. At the time of the proposal audit, no new ingredient, alias, form, or ledger candidate had been allocated.

## Phrase-first picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize accents, ligatures, punctuation, and spaces; prefer complete word phrases across reference and form terms; use substring matching only when no complete phrase matches. The table shows the current result and a static projection for the proposed bilingual display pair only.

| Query | Current result | With proposed display pair |
|---|---|---|
| `Khorasan semolina` | None | `ingredient-ref-khorasan-semolina` |
| `semoule de blé khorasan` | None | `ingredient-ref-khorasan-semolina` |
| `Khorasan` | Four: Khorasan flakes, Khorasan flour, Khorasan wheat, and puffed Khorasan wheat | Same four plus Khorasan semolina |
| `semolina` | Seven: barley, durum, emmer, remilled durum, sorghum, and spring-wheat semolina; sankhal (broken millet semolina) | Same seven plus Khorasan semolina |
| `semoule` | Ten: barley semolina, corn grits, cornmeal, durum semolina, emmer semolina, granulated sugar (through `sucre semoule`), rye meal, remilled durum semolina, sorghum semolina, and spring-wheat semolina | Same ten plus Khorasan semolina |
| `semoule de blé` | Four: durum semolina, emmer semolina, remilled durum semolina, and spring-wheat semolina | Same four plus Khorasan semolina |
| `semoule de blé dur` | Durum semolina and remilled durum semolina | Unchanged; Khorasan semolina does not acquire a durum display or alias |
| `farine de khorasan` | Khorasan flour | Unchanged |
| `Kamut` | None | None; no trademark alias is proposed |

The species-specific exact queries would become findable, and broad Khorasan/semolina searches would each add one distinct milling product. No existing French or English exact owner is displaced.

## Bundled recipe-demand audit

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were parsed. Each full serialized recipe and each ingredient row was scanned after accent/ligature/punctuation normalization for `Khorasan semolina`, `Khorasan wheat semolina`, `whole Khorasan semolina`, `Khorasan Kamut semolina`, `semoule de blé khorasan`, `semoule de Khorasan`, `semolina of Khorasan`, `semolina`, `semoule`, `Khorasan`, and `Kamut`. The scan found **zero candidate phrase hits in recipe files and zero candidate phrase hits in ingredient rows**. There is no bundled recipe demand, ingredient link, or recipe-edit basis for the proposed identity.

## Measures, forms, and substitutions

- The Québec food directory lists **1/3 cup (60 g)** for La Milanaise's `Farine de Khorasan blanche non blanchie biologique`, a flour product. Do not transfer that serving to semolina [reused `WP02A4-KH-S02`].
- The 2006 Québec milling study's 500 μm sieve, 91% Khorasan extraction, `<210 μm` and `210–500 μm` experimental fractions, and pasta test using 1 kg semolina with 31.5% water describe its stone-milled research sample and pasta protocol only. They are not a household measure, reusable density, universal form threshold, cooking yield, or conversion [S04].
- The Khorasan flour directory portion and the 340 g pasta package on the Québec retailer page are product-specific; neither is a semolina kitchen measure [reused `WP02A4-KH-S02`; S05]. The manufacturer spec's food-product sizing and nutrition context also does not establish volume conversion or a serving [S03].
- The source set distinguishes fine, re-milled, and whole/wholemeal semolina products, but supplies no shared Khorasan-semolina form schema or grade threshold [S01–S03]. Add no forms, aliases, default density, or unit mappings.
- The research study's pasta trials compare particular Khorasan and durum semolina fractions. They do not establish a general replacement ratio between Khorasan semolina and durum, spring-wheat, emmer semolina, or flour. Add no form conversion, yield, recipe link, global conversion, or contextual substitution.

## Source register

The new S01–S06 URLs are source-ID-free in the current ledger and remain proposal-local. Reused OQLF and Québec-product sources retain their existing IDs; no shared ledger record is proposed here.

| ID | Source and locator | Supports | Limits |
|---|---|---|---|
| **WP02-A7-KHORASAN-SEMOLINA-R469-20261017-S01** | KAMUT International, [Flour (English)](https://www.kamut.com/flour), product-range description; accessed 2026-10-17. | The brand owner says mills make KAMUT® brand wheat semolina, re-milled semolina, and whole semolina. | Brand-owner range description, not a Canadian product label or a universal granulation specification. Does not authorize generic `Kamut` naming. |
| **WP02-A7-KHORASAN-SEMOLINA-R469-20261017-S02** | KAMUT International, [Farine (French)](https://www.kamut.com/fr/farine), product-range description; accessed 2026-10-17. | Gives French product terms `semoule`, `semoule remoulue`, and `semoule complète` for KAMUT® brand wheat products. | International brand page, not a Québec product label or OQLF ruling. OQLF separately flags `Kamut` as a trademark. |
| **WP02-A7-KHORASAN-SEMOLINA-R469-20261017-S03** | Molino Grassi S.p.A., [Organic KAMUT® Brand Khorasan Semolina — product specification STD-PF 00121](https://www.molinograssi.it/wp-content/uploads/2022/07/00121_Semola_Kamut_BIO-2.pdf), Rev. 13 dated 2024-07-01; manufacturer document. | Names fine-calibration organic Khorasan semolina and describes a granular product made by milling and sifting KAMUT® brand Khorasan wheat. | Italian commercial specification and product-specific fine grade; not a Canadian/Québec package or universal milling boundary. Search-indexed document text was available, but direct PDF retrieval returned a cache miss in this review. |
| **WP02-A7-KHORASAN-SEMOLINA-R469-20261017-S04** | Gauthier, Gélinas & Beauchemin, [“Effect of stone-milled semolina granulation on the quality of bran-rich pasta made from khorasan (Kamut®) and durum wheat”](https://academic.oup.com/ijfst/article/41/5/596/7863918), *International Journal of Food Science and Technology* 41(5), 2006, pp. 596–599, Methods and Results. | The coauthors include La Meunerie Milanaise and Agriculture and Agri-Food Canada; the study says Alberta Khorasan grain was stone-milled at Milanaise in Québec into semolina. It documents the experimental sieve and extraction protocol. | Historical research, not a current consumer SKU, retail specification, standard product form, or household conversion. The experimental water ratio applies only to its bran-rich pasta method. |
| **WP02-A7-KHORASAN-SEMOLINA-R469-20261017-S05** | La Moisson, [Kamut Pasta — Spaghetti — Organic](https://lamoisson.com/en/products/pates-de-kamut-spaghetti-kamut-pasta-spaghetti-organic), product title, ingredient declaration, and product notes; accessed 2026-10-17. | Current Québec retailer page for a finished pasta names `Khorasan Kamut Full Khorasan wheat semolina` in its ingredient field and offers shipping within Québec/Canada. | Finished imported pasta, not standalone semolina. Retailer warns product details may be inaccurate; no product-matched French semolina label. The 340 g package is not a kitchen measure. |
| **WP02-A7-KHORASAN-SEMOLINA-R469-20261017-S06** | Columbro, [Khorasan 2024 product sheet](https://www.columbro.com/pdf/COLUMBRO-2024-KHORASAN.pdf), pp. 3–5, multilingual product and ingredient text. | Manufacturer identifies Khorasan semolina pasta and prints the French ingredient phrase `semoule de blé khorasan biologique`. Supports the proposed descriptive French word order. | Italian pasta product using Italian-grown/milled grain; does not establish Québec retail naming or a standalone semolina package. Package weights and cooking settings belong to the pasta SKU. |
| **Reused `WP02A4-KH-S01`** | Office québécois de la langue française, [blé khorasan (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533000/ble-khorasan), updated 2015. | Preferred Québec crop name `blé khorasan`; defines Khorasan as an old variety of durum wheat and labels `Kamut` a trademark. | Crop terminology, not a semolina product definition. Reuse the existing source entry; do not duplicate its URL or ID. |
| **Reused `WP02-S23`** | Office québécois de la langue française, [semoule de blé dur (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432752/semoule-de-ble-dur), updated 1982. | Defines coarse milling of moistened durum kernels followed by drying and sifting, with English `durum semolina` and `semolina`; its note distinguishes the Canadian durum and spring-wheat semolina types. | Does not have a Khorasan-specific record; pairing it with `blé khorasan` for the descriptive display is an evidence-based term construction, not an OQLF-approved compound. Reuse existing source record. |
| **Reused `WP02A4-KH-S02`** | Québec Food Directory, [Farine de Khorasan blanche non blanchie biologique](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201408), Milanaise product sheet, last updated 2026-06-29. | Current Québec product evidence for the French Khorasan-flour name and local milling company; its product-specific panel states 1/3 cup (60 g). | This is white Khorasan flour, not semolina; its portion is not transferable. Reuse the existing source record. |

## Disposition

Integrated only `ingredient-ref-khorasan-semolina` with the bilingual display pair above, empty aliases, no forms, null density, empty unit mappings, and no recipe links, conversions, yields, or substitutions. Kept KAMUT® brand wording, fine/re-milled/whole grades, and the active Khorasan grain/flour/flakes/puffs and other semolinas distinct. The bundled corpus has no matching demand. No software tests, build, emulator run, or deployment were performed because the update adds database JSON data and documentation under `AGENTS.md`. See the [integration README](../batches/wp02-a7-khorasan-semolina-integration-r469-20261017/README.md).
