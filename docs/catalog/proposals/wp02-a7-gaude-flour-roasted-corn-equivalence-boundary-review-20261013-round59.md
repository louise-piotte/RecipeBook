# WP02 A7 `farine de gaude` / roasted-corn-flour boundary — R59

## Scope and recommendation

- **Review date:** 2026-10-13
- **Scope:** The source-named French flour product `farine de gaude`, also described by its maker as toasted or roasted corn flour. This packet asks whether that name belongs as an alias on the active Québec roasted-corn-flour reference or needs a separate identity.
- **Status:** Accepted on 2026-10-13 as a documentation-only hold. No catalog, ledger, recipe, or generated-index data changed; the plan, roadmap, and batch README now record the decision.
- **A7 anchor:** [Current catalog plan, open A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt), which continues review of other grain meals and malted/toasted flour identities.
- **Proposal-local source IDs:** `WP02-A7-GAUDE-FLOUR-BOUNDARY-20261013-R59-S01` through `S09`. These IDs are unique to this packet and are not research-ledger IDs.

**Recommendation: hold `farine de gaude` / `gaude flour` without an active row or alias.** Current French-mill sources establish a standalone toasted-corn flour product and explicitly pair `farine de gaude` with “toasted corn flour.” They do not establish that its traditional kernel-roasting and milling product is the same functional product as the active Québec mill's roasted corn flour, which is described as heat-treated to promote starch gelatinization for baking. Nor did this review find a Canadian or Québec product label using `gaude` or an OQLF food-term entry for it. Keep the active `roasted corn flour / farine de maïs torréfiée` unchanged; do not attach the regional name or create a second maize-flour row on this evidence.

The exact `gaude` candidate is new to the plan, proposal archive, current references, legacy candidates, and research ledger. The plan previously recorded the **unqualified** phrase `toasted corn flour` as unresolved. This packet treats the new evidence narrowly as a maker-named *gaude* product and its equivalence boundary; it does not repeat the earlier generic-phrase review or propose activating `toasted corn flour` globally.

Do not use bare `gaude` or `gaudes` as an alias. The producer uses the name for the flour and for a porridge made from it, so those short forms do not identify a flour unambiguously outside that regional context. The phrase `farine de gaude` is clearer, but still lacks Québec terminology or evidence of equivalence to the active functional product.

## Source-grounded product boundary

Moulins Bourgeois' 2024 French catalogue lists **Farine de gaude Bio** under toasted/roasted ingredients and describes it as **farine de maïs toasté**, in a 15 kg bag [S01]. Its 2024 English export catalogue retains the French product name and pairs it with **Toasted corn flour**, also in a 15 kg bag [S02]. This supports a real standalone bakery ingredient and the source's bilingual naming. The catalogue does not give the kernel preparation, roast profile, particle size, starch behavior, or recipe ratio.

Moulin Taron, a French producer, describes its product as **farine de Gaudes (farine de maïs torréfié)**, made with wood-fire roasting and stone milling. It also explains that *les gaudes* is the porridge prepared from the flour [S03]. Its current product page lists **Farine de maïs torréfié (Gaudes)** separately from **Semoule de maïs torréfié**, each in a 1 kg package [S04]. That distinction supports keeping the flour, semolina, and prepared porridge separate; it does not equate the flour to a Québec bakery-functional ingredient.

## Catalog ownership, picker, and corpus audit

Proposal snapshot: **1,382 active references, 100 forms, 63 legacy-import candidates, and 1,713 research-ledger records**. The active owner is `ingredient-ref-roasted-corn-flour`, displayed as `roasted corn flour / farine de maïs torréfiée`, category `FLOUR_AND_STARCH`. It has no aliases, forms, default density, or unit mappings. Its ledger identity state is `verified`; its measurement and substitution research states remain `not_yet_researched` [S07–S08]. The live catalog integration review occurred after the separate rye-bran identity was accepted; its current snapshot is **1,383 references / 100 forms / 63 legacy candidates / 1,714 ledger records** and the gaude exact-key result is unchanged.

The project's bilingual picker normalizes accents and punctuation, prefers complete normalized phrases, and falls back to partial matching; attached form terms are searched with their owning reference [the search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Applying that projection to the current references and forms gives:

| Query | Current picker result |
| --- | --- |
| `gaude`, `gaudes`, `gaude flour`, `farine de gaude`, `farine de gaudes` | 0 references each |
| `farine de maïs toasté`, `toasted corn flour` | 0 references each |
| `roasted corn flour`, `farine de maïs torréfiée` | 1 each: `ingredient-ref-roasted-corn-flour` |
| `farine de maïs` | 4: masa harina, precooked corn flour, roasted corn flour, and whole-kernel corn flour |
| `corn flour` | 4: precooked corn flour, roasted corn flour, sorghum flour (through the alias `guinea corn flour`), and whole-kernel corn flour |
| `cornmeal`, `semoule de maïs` | 1 each: `ingredient-ref-cornmeal` |

The exact candidate phrases have no current picker owner, legacy-import owner, or ledger record. A future proposal to add only the full alias `farine de gaude` would send that exact phrase to the active roasted-corn row; it would not resolve the product-equivalence question. Leaving the name unassigned preserves the existing broad corn-flour search behavior and avoids implying a Québec synonym. No form-owned search term or form collision was found.

The manifest's **114 recipes / 1,123 ingredient rows** were scanned for candidate names and neighboring flour terms in full recipe text. There are no mentions of `gaude`, `gaudes`, `gaude flour`, `farine de gaude`, `farine de maïs toasté`, `toasted corn flour`, `roasted corn flour`, `corn flour`, `cornmeal`, or `semoule de maïs`; no ingredient row links to the active roasted-corn-flour reference. There is no bundled recipe demand for this product or for the current neighboring maize-flour identities.

## Measurements and substitutions

The 15 kg and 1 kg values in the reviewed mill pages are product package sizes [S01–S04], not recipe measurements, serving amounts, or reusable mass/volume conversions. The pages establish neither a bulk density nor a cup-to-gram measure. Moulin Taron says the flour is used in preparations and describes a porridge dish, but the reviewed product pages do not provide a quantified recipe ratio [S03–S04]. Keep density, unit mappings, forms, measurements, conversions, and yields inactive.

No reviewed source gives a tested substitution ratio or method between gaude flour and the active functional roasted corn flour, cornmeal, whole-kernel corn flour, masa harina, or precooked corn flour. The active substitution and contextual-substitution files contain no rule for the roasted-corn-flour reference. Add no global or contextual substitution and do not infer interchangeability from the shared corn source or the overlapping roasted/toasted description.

## Québec naming and limits

OQLF's `gaude` entry is in the botanical domain and defines the plant used for yellow dye; it does not record a food or flour sense [S05]. OQLF's 2025 `farine de maïs` entry defines the generic ground-maize flour and lists `corn flour` in English, but does not provide a toasted/roasted qualifier or attest `farine de gaude` for Québec [S06]. The active Québec maker uses `Farine de Maïs Torréfié` and describes thermal treatment for starch gelatinization and bakery performance [S07–S08]. A current Québec-market retailer separately lists Djinkoumé as `Farine de maïs torréfié / Roasted corn flour`; this is evidence of local generic wording, not of the name `gaude` or equivalence to the French regional product [S09].

The source-specific distinction is therefore useful for future review, but the current evidence does not settle the Québec display or the active-reference mapping. The Canadian product search was bounded to current Québec terminology and product sources; failure to find a Québec `gaude` label is not proof that none exists.

## Source register

Sources were accessed on 2026-10-13. Claims are limited to the product, wording, and packaging shown in each source; producer health and nutrition claims are not imported.

| ID | Source | Evidence and limits |
| --- | --- | --- |
| **S01** | Moulins Bourgeois, [2024 French EU catalogue](https://www.moulins-bourgeois.com/wp-content/uploads/2024/10/Catalogue-FR-UE.pdf), section *Ingrédients toastés / torréfiés*. | Lists `Farine de gaude Bio`, describes it as `Farine de maïs toasté`, and gives a 15 kg bag. French-market bakery catalogue; no detailed process, particle size, Québec label, or recipe ratio. |
| **S02** | Moulins Bourgeois, [2024 English EU catalogue](https://www.moulins-bourgeois.com/wp-content/uploads/2024/10/Catalogue-EN-EU-1.pdf), section *Ingredients toasted / roasted*. | Retains `Organic Farine de Gaude` and gives `Toasted corn flour` and 15 kg. Supports this maker's bilingual product pairing, not a universal translation or equivalence with every roasted-corn flour. |
| **S03** | Moulin Taron, [Présentation du Moulin Taron](https://www.gaudes-de-chaussin.com/qui-sommes-nous.htm). | Calls the flour `farine de Gaudes (farine de maïs torréfié)`, describes wood-fire roasting and stone milling, and distinguishes the flour name from the porridge called `les gaudes`. This is a French regional producer statement, not a Québec terminology authority. |
| **S04** | Moulin Taron, [Nos produits](https://www.gaudes-de-chaussin.com/produits.htm). | Current product page separately lists 1 kg `Farine de maïs torréfié (Gaudes)` and 1 kg `Semoule de maïs torréfié`. Package weights are not recipe measures. |
| **S05** | OQLF, [gaude (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17052183/gaude). | The entry's botanical/dye-plant sense does not establish a Québec food or flour name; it cannot be used to reject the regional food sense documented by the producer sources. |
| **S06** | OQLF, [farine de maïs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais), updated 2025. | Defines fine powder from ground maize, gives `farine de maïs` as preferred French, and lists `corn flour` (plus UK `cornstarch`) in English. Does not name roasted flour or gaude. |
| **S07** | Les Moulins de Soulanges, [Roasted Corn Flour](https://moulinsdesoulanges.com/language/en/roasted-corn-flour/). | Current Québec mill page describes heat treatment to promote corn-starch gelatinization and a functional flour for baking. The process statement is supplier-specific; it does not establish equivalence to the gaude product. |
| **S08** | Les Moulins de Soulanges, [Farine de Maïs Torréfié](https://moulinsdesoulanges.com/language/fr/farine-de-mais-torrefie/). | Current French page pairs the active Québec product name with the same heat-treatment and baking-use description. It is the source context for the active catalog owner, not a `gaude` label. |
| **S09** | Afromarket, [Djinkoumé — Farine de maïs torréfié / Roasted corn flour](https://afromarket.ca/index.php/produit/djinkoume-farine-de-mais-torrefie-1kg/). | Current Québec-market retail page lists a 1 kg product in stock and pairs the generic French and English terms. It does not name gaude or describe process equivalence. |

## Proposed disposition

Keep `farine de gaude` / `gaude flour` outside the active catalog and ledger for now. Add no reference, alias, form, measure, density, unit mapping, recipe link, conversion, yield, or substitution. Revisit only with an independent Québec French assessment of the regional term and source evidence that resolves whether the product is a synonym of the current functional roasted-corn-flour row or a separately scoped flour product. No recipe edit or numeric follow-up is indicated by the current bundle.

## Root integration result

The catalog integration lead independently reopened OQLF's `gaude` and `farine de maïs` entries, Moulin Taron's current product and mill pages, and Les Moulins de Soulanges' active Québec product page. OQLF's `gaude` record is in the furniture/dye-plant domain and does not supply a Québec food name; its generic corn-flour entry gives no roasted qualifier. Taron describes gaudes as wood-fire-roasted and stone-milled corn flour and separately sells roasted corn semolina. The Québec mill describes its active roasted-corn flour as heat-treated to promote starch gelatinization for baking. These sources do not establish that the regional product is equivalent to the active functional flour or establish a Québec display/alias.

The hold is recorded in the A7 checklist, roadmap, and batch README. The current exact-key recheck found no `gaude` owner in active references, forms, legacy identities, or ledger records. Keep `ingredient-ref-roasted-corn-flour` unchanged; no row, alias, form, ledger candidate, recipe link, measure, conversion, yield, or substitution was added. This documentation-only change needed no app tests or emulator checks.

No app tests or emulator checks were run because this documentation-only hold changed no database JSON.
