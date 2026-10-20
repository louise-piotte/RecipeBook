# WP02 B2 alternative-flour gap — macadamia flour boundary review (R27)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. No catalog, ledger, recipe, plan, roadmap, generated file, batch record, test, or emulator state was changed.
- **Checklist item:** New candidate under the open WP02 B2 alternative-flour item. The exact still-open parent at [plan line 1521](../../RecipeBook-global-ingredient-catalog-plan.txt#L1521) is “Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours.” It does not name macadamia; this proposal adds macadamia flour as a new nut-flour gap within that workstream.
- **Scope:** Whether a new general `macadamia flour` / `macadamia nut flour` identity can be distinguished from whole macadamia kernels and from oil-press-cake flour, with a usable Québec French display and reusable conversion or substitution data.
- **Source-ID prefix:** `WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013`; source IDs below are proposal-local, not ledger entries.

## Recommendation

**Hold a generic macadamia-flour reference and its aliases unallocated.** Primary research and current maker listings establish that food products called macadamia flour exist. They do not establish one stable process behind the unqualified name: reviewed sources include flour milled from dried and roasted whole kernels, coarse meal, and flour milled from oil-press residue with materially different degrees of defatting. In the primary study, partially defatted flour contained 12–15% fat while totally defatted flour contained about 1%; the degree of lipid extraction changed functional properties. Do not merge these products into one source-neutral identity or treat them as equivalent to whole macadamia nuts. [S03–S08]

The transparent French construction **`farine de noix de macadamia` remains provisional**. OQLF and Québec government material support `noix de macadamia` as a Québec French nut name, but neither reviewed a macadamia-flour product name. Targeted searches for French and English flour phrases in Québec/Canadian-facing retail and terminology sources found no exact local flour label. This bounded search does not prove that no local product exists. Do not activate the proposed French construction or nut-name variants as aliases. [S01–S02]

## Candidate and process boundary

| Product phrase or material | Decision | Evidence and limit |
|---|---|---|
| `macadamia flour` / `macadamia nut flour`, unqualified | **Hold; no row or aliases.** | Product existence is established, but the name covers whole-kernel milling and oil-press-cake products. Available sources do not establish one shared process, fat range, particle size, or stable culinary scope. [S03–S08] |
| Dried and roasted whole-kernel macadamia flour | **Keep as a source-defined research/product class only.** | One primary bread study says it dried, roasted, and milled macadamia nuts. That is a specific study method, not proof that retail flour under the broad name uses it. [S04] |
| Macadamia press-cake flour | **Keep as a source-defined process class only; no separate row proposed.** | Kīpuka Mills mills a by-product remaining after oil pressing; All Organic Treasures describes mechanically partially defatted kernels followed by fine grinding. The laboratory study separates partially and totally defatted flour and finds functional differences. [S03, S05–S06] |
| `macadamia meal`, `ground macadamia`, `macadamia powder` | **Leave unassigned.** | Reviewed sources do not establish these as stable synonyms for either whole-kernel flour or a defined press-cake flour. OFI labels one product `Macadamia flour` and specifies `coarse meal`, showing a texture description, not a general synonym rule. [S08] |
| `farine de noix de macadamia`, `farine de macadamia`, `farine de macadam`, `farine de noix du Queensland` | **Do not activate.** | The first is a transparent proposed rendering only. OQLF and Québec government terminology reviewed here names the nut, and some of its nut synonyms, not flour products. [S01–S02] |

A future identity decision should first name the process-qualified product being represented and obtain Québec/Canadian French evidence for that product. Evidence for one brand, one press-cake process, or a whole-kernel flour must not silently broaden the bare phrase to the other process classes.

## Québec French terminology

OQLF lists `noix de macadamia` as the preferred French term and includes `noix de macadam`, `noix du Queensland`, `macadamia`, and other nut-level terms. Québec's allergen guidance also names `noix de macadamia` and `noix du Queensland`. These are authoritative/local nut terms, not evidence for a flour product label. No exact OQLF entry or current Québec/Canadian flour package/listing was found for `farine de noix de macadamia`, `farine de macadamia`, or a process-qualified French compound. [S01–S02]

If a later review chooses to test a candidate display, `farine de noix de macadamia` is the most transparent construction from the supported nut term. Label it **provisional** until an exact local product label or terminology authority supports the compound. Keep `farine de macadam`, `farine de noix du Queensland`, `farine de macadamia dégraissée`, and other constructed variants inactive unless an exact product source supports them.

## Measurements, conversion, and substitutions

- **Source-specific quantities:** Kīpuka's product page lists package sizes of 1, 5, 10, and 25 lb; its product sheet lists one-pound bags by the case. Those are package weights, not household measures or densities. Its biscotti recipe calls for 1 cup of its macadamia flour without a gram weight, while a separate cake recipe gives 2.25 oz without a paired volume. Neither recipe establishes a cup-to-mass value. [S05, S09–S10]
- **A second product's serving weight:** A retailer product page describes a coarse ground-macadamia flour and reports a 28 g (about 1 oz) serving. It gives no volume equivalent and was marked unavailable when reviewed. That amount is specific to the listed product and does not establish a reusable mapping. [S11]
- **No density or unit mapping:** Keep any future reference's `defaultDensity` null and `unitMappings` empty unless a source reports a paired mass and volume for a clearly specified product and repeatable household method. Do not infer density from package size, nutrition serving weight, an unpaired recipe quantity, or measurements for whole macadamia nuts. The active whole-nut and macadamia-butter references also have no default density or unit mappings. This follows Requirements' rule that weight-to-volume conversion needs an ingredient density or mapping; [Requirements.md](../../../Requirements.md) §2.1 and §6.3.
- **Substitution:** Kīpuka says its roasted press-cake flour may be an alternative to other nut flours in some recipes but provides no ratio. One primary bread study tested its own dried/roasted/milled whole-kernel flour at 2–10% wheat-flour replacement and reported 8% as a favorable tested level. That is one formulation and one source process, not a transferable wheat or almond replacement rule. Do not add a global form conversion or contextual substitution. [S04–S05]
- **Recipe demand:** The current bundled corpus has no macadamia-flour phrase or ingredient row. It therefore supplies no recipe-specific measure, substitution context, or reason to create a link.

## Active catalog, picker, legacy, and corpus audit

Read-only audit of the current shared worktree on 2026-10-13:

| Surface | Finding |
|---|---|
| Active references | [Ingredient-reference JSON](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) contains `ingredient-ref-macadamia-nuts` (`macadamia nuts / noix de macadamia`) and `ingredient-ref-macadamia-butter` (`macadamia butter / beurre de macadamia`). Both have empty alias arrays, null density, and empty unit mappings. No `ingredient-ref-macadamia-flour` exists. Nearby flour references include almond, cashew, chestnut, hazelnut, hemp, partially defatted peanut, and pistachio flour, each remaining a separate active product identity. |
| Forms | The [active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) contain no macadamia flour, meal, or powder form/name/match term. |
| Legacy identities | The [legacy import candidates](../legacy-import-identities.v1.json) contain no exact macadamia-flour, macadamia-meal, or French flour candidate. |
| Picker phrase ownership | Exact searches for `macadamia flour`, `macadamia nut flour`, `macadamia meal`, `farine de macadamia`, and `farine de noix de macadamia` have no current reference, form, or legacy owner. Under current whole-phrase-first matching, bare `macadamia` returns both the whole-nut and butter references; `noix de macadamia` returns the whole-nut reference. Keep those existing broad results unchanged and do not use bare `macadamia` as a flour alias. |
| Research ledger | The [research ledger](../research-ledger.v1.json) has records for the whole macadamia and butter references, but no `ingredient-ref-macadamia-flour` record or R27 source prefix. The two existing records do not assign flour wording, measurements, or substitutions. |
| Bundled recipes | Parsed all 114 manifest-listed recipe files and 1,123 ingredient rows. No recipe JSON text or ingredient row matched `macadamia`, macadamia flour/meal, or the proposed French terms; no ingredient row is linked to the two existing macadamia references or a flour candidate ID. |
| Prior WP02 reviews | A case-insensitive search of catalog proposals and batches found no focused macadamia-flour identity review or prior hold/integration for this candidate. |

## Proposed catalog boundary if reopened

1. Keep `ingredient-ref-macadamia-nuts` as whole kernels and `ingredient-ref-macadamia-butter` as butter; add no flour aliases to either.
2. Do not create an unqualified `macadamia flour` row or assign `macadamia meal`, `ground macadamia`, or bare nut-name phrases as aliases.
3. Reopen only for a process-qualified candidate with a specific product scope and direct Québec/Canadian French naming evidence. If one is approved, assess that product's own paired mass-volume data and tested recipe context separately.
4. Keep current generic density, unit mappings, forms, recipe links, yields, and substitutions empty. Do not infer data from whole-kernel or other nut-flour references.

## Source register

Sources were checked on 2026-10-13. The source IDs are local to this proposal and have not been added to the research ledger.

| ID | Source | Supports | Limits |
|---|---|---|---|
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S01** | Office québécois de la langue française, [*noix de macadamia* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2078342/noix-de-macadamia), last updated 1994. | Preferred term `noix de macadamia`; lists nut-level alternatives including `noix du Queensland` and English equivalents. | Names the nut, not a flour, meal, or process-qualified product. |
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S02** | Gouvernement du Québec, [*Allergènes et leurs différentes appellations*](https://www.quebec.ca/sante/alimentation/allergies-alimentaires/allergenes-differentes-appellations), current page. | Uses `noix de macadamia` and `noix du Queensland` in Québec allergen/nut guidance. | Allergen terminology, not a product-label or flour-name ruling. |
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S03** | Siwaporn Jitngarmkusol, Juthamas Hongsuwankul, and Kanitha Tananuwong, [“Chemical compositions, functional properties, and microstructure of defatted macadamia flours”](https://doi.org/10.1016/j.foodchem.2008.01.050), *Food Chemistry* 110(1), 2008. | Primary study of macadamia flour from oil extraction residues. Compares partially defatted flour at 12–15% fat with totally defatted flour at 1% and reports significant functional-property differences; uses three cultivars. | A laboratory product/process comparison, not a Québec label, commercial naming rule, household measure, or general substitution guide. |
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S04** | Minh Phuoc Nguyen, [“Investigation of Macadamia Flour Fortified to Wheat Flour in Bread Making”](https://jgpt.co.in/index.php/jgpt/article/download/3117/2486), *Journal of Global Pharma Technology* 12(1) supplement, 2020. | Primary bread-formulation study; says nuts were dried, roasted, and milled. Tests 2%, 4%, 6%, 8%, and 10% replacement and reports 8% as favorable in that formulation. | One study and recipe; does not establish a general wheat replacement, an almond-flour replacement, or a retail flour process. |
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S05** | Kīpuka Mills, [Roasted Macadamia Nut Flour](https://kipukamills.com/our-products/roasted-macadamia-nut-flour/) and [product sheet (PDF)](https://kipukamills.com/wp-content/uploads/2022/01/KipukaMills_ProductSheet.pdf). | Current maker identifies a roasted flour milled from macadamia by-product remaining after oil pressing; gives bag/package sizes. | One maker's process and SKU; no extraction level, cup-to-mass conversion, or general flour definition. |
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S06** | All Organic Treasures, [Organic Macadamia Flour](https://www.all-organic-treasures.com/assortment-food/macadamiamehl-bio.html). | Manufacturer specifies blanched organic *Macadamia integrifolia*, partial mechanical defatting, then fine grinding. | One supplier product; not evidence that unqualified retail flour uses that process or that the process defines a Québec identity. |
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S07** | Dierberger Alimentos, [*Farinha de Macadâmia a vácuo*](https://www.dierbergeralimentos.com.br/macadamia/farinha-de-macadamia-1kg). | Manufacturer's Portuguese product page names macadamia flour, describes cold-pressing raw macadamia nuts, and lists a 1.05 kg package. | Brazilian Portuguese product page; does not establish a Québec French name, volume measure, or generic process. |
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S08** | ofi, [Macadamia product sheet (PDF)](https://assets.ctfassets.net/yzlb24ni1fxz/5Ud9RY8zIxS4nbgi2APOlw/c2e207a2c1265c6775105ef49de69ed1/OFI_SellSheet_Macadamia_v4.pdf). | Manufacturer/ingredient supplier product sheet lists `Macadamia flour`; the macadamia product is identified as `coarse meal`. | Does not explain macadamia flour's process or establish `meal` as a general alias. |
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S09** | Kīpuka Mills, [Macadamia Nut Biscotti recipe](https://kipukamills.com/recipes/macadamia-nut-biscotti/). | Uses 1 cup of the maker's macadamia flour and 2 cups all-purpose flour in a source-specific recipe. | Gives no gram mass for the flour; cannot yield a weight-volume mapping. |
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S10** | Kīpuka Mills, [Chocolate Macadamia Nut Snack Cake recipe](https://kipukamills.com/recipes/chocolate-macadamia-nut-snack-cake-gluten-free/). | Uses 2.25 oz of the maker's macadamia flour in a separate source-specific recipe. | Gives no corresponding volume for the flour; must not be paired with the biscotti amount to infer density. |
| **WP02-B2-MACADAMIA-FLOUR-BOUNDARY-R27-20261013-S11** | Nutting But Goodness, [Macadamia Flour](https://nuttingnuts.co.za/product/macadamia-flour/). | Retailer page describes a coarse flour made from ground macadamia nuts and reports a 28 g (about 1 oz) serving. | Product was unavailable when reviewed; gives mass only, no volume, and is not Québec/Canadian product evidence. |

## Review result

The macadamia-flour candidate exists as a real product family, but its broad name does not yet define one catalog identity. The open French naming question, multiple materially different milling/defatting processes, lack of paired volume-and-mass evidence, and recipe corpus with no demand support holding the generic row and all aliases. No active reference, candidate record, form, density, unit mapping, conversion, recipe link, yield, or substitution is proposed.
