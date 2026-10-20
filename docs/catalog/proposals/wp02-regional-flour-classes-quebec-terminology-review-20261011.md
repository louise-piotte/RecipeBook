# WP02 Québec French review: regional wheat-flour class names

**Review date:** 2026-10-11; sources accessed 2026-10-11.

**Disposition:** Coordinator integration completed. The ledger now carries the review sources and bounded naming decisions. The unsupported short French type-0/type-00 aliases and the product-specific type-00 pizza aliases were removed from the generic type-00 rows; no grade crosswalk, recipe link, form, measurement, or substitution was added. See the integration checkpoint in the plan and `docs/catalog/batches/wp02-wp03-wp04-flour-jackfruit-lap-cheong-integration-20261011/README.md`.

**Scope:** The ten Italian and French flour-class rows added in the [WP02/WP07/WP08 batch](../batches/wp02-wp07-wp08-flour-egg-evidence-integration-20261010/README.md), against the open checklist at [`RecipeBook-global-ingredient-catalog-plan.txt`, lines 1071–1077](../../RecipeBook-global-ingredient-catalog-plan.txt#L1071).

## Finding

The OQLF supports **farine de blé tendre** and **farine de blé mou** as Québec French terms for soft-wheat flour. That is the generic base wording; the cited OQLF entry does not define Italian or French numbered grades. TERMIUM likewise supports **blé tendre** for *soft wheat*, without establishing flour-grade names [S01–S02].

The current French catalog labels, **farine de blé tendre de type N (Italie/France)**, are understandable, country-qualified catalog constructions. I found no Québec terminology authority that directly prescribes those complete compounds. The number-plus-country wording identifies the intended national classification in the catalog, but should be described as a descriptive label rather than a standard OQLF term.

There is direct Québec product-label evidence for Italian **Tipo 00** and **tipo 0**, and for locally marketed **T55/T65** products. These are labels on specific products, not proof that a Québec product is defined by the corresponding Italian or French national criteria. French manufacturers directly use the T45/T55/T65/T80/T110/T150 product wording; that supports French-market labels, not Québec terminology authority or cross-country equivalence [S03–S10].

**Recommendation:** retain the ten explicit, country-qualified French display constructions as catalog labels, with the status above documented. Keep aliases explicit and source-bounded. Do not infer culinary or compositional equivalence from shared numbers, product uses, or an individual manufacturer’s wording.

## Display-name review

| Class | Direct wording found | Status of current French display and recommendation |
|---|---|---|
| Italian type 00 | A Québec mill product is named *Farine à pizza Tipo « 00 » biologique*; a Montréal retailer lists Caputo products as *Farine Pâtisserie de Blé Tendre « 00 »*. A Montréal retailer also describes another SKU as *farine de blé tendre de type 00* [S03–S05]. | The complete display *farine de blé tendre de type 00 (Italie)* is a construction, not a quoted Québec label. Retain it as the explicit class label; do not turn the pizza product name into a generic class synonym. |
| Italian type 0 | A Montréal retailer lists *Farine Manitoba Or Blé Tendre « 0 »* and *Farine Nuvola Super « 0 »*. Italy’s decree names the Italian class *farina di grano tenero tipo 0* [S03, S06]. | The complete French display is a construction. Retain the country-qualified display; product wording attests particular imported SKUs, not a Québécois preferred term. |
| Italian type 1 | Italy’s decree names *farina di grano tenero tipo 1* [S06]. No Québec type-1 product label was located in this bounded review. | The French display is a construction. Retain it; add no short French alias on this evidence. |
| Italian type 2 | Italy’s decree names *farina di grano tenero tipo 2* [S06]. No Québec type-2 product label was located in this bounded review. | The French display is a construction. Retain it; add no short French alias on this evidence. |
| French type 45 | Francine lists *Farine de blé T45* [S09]. | The catalog’s full compound is a construction from the supported base term and the French class. Retain it with *(France)*; the cited product name itself is French-market wording. |
| French type 55 | Francine lists *Farine de blé Bio T55* and *Farine de gruau T55*. A Québec mill catalogue lists *Farine T55*; its catalogue separates this from the product named *Belle Meunière* [S07–S09]. | The full display is a construction. Retain *(France)*. Because Québec products use the same bare T55 label, keep bare `T55` / `farine T55` aliases inactive. The local label does not establish a French-class definition. |
| French type 65 | Francine lists *Farine de blé Label Rouge T65*. A Québec mill catalogue lists *Farine T65*, and its technical sheet identifies production in Normandin, Québec. That sheet gives a product ash value but does not state the French dry-matter basis [S07–S09]. | The full display is a construction. Retain *(France)* and keep bare `T65` / `farine T65` aliases inactive. Do not infer that the local SKU is the French national class from its label or overlapping numbers. |
| French type 80 | Francine lists *Farine de blé Bio T80* [S09]. | The full compound is a construction. Retain it with *(France)*; `farine T80` is directly attested in French-market product wording. No Québec-specific grade term was found in this bounded review. |
| French type 110 | Moulins d’Antoine lists flour products as T110; Francine also uses *farine T110* in French product guidance [S09–S10]. | The full compound is a construction. Retain it with *(France)*; `farine T110` is French-market wording, not a Québec terminology ruling. |
| French type 150 | Francine lists *Farine de blé complète T150* [S09]. | The full compound is a construction. Retain it with *(France)*. The product-specific adjective *complète* is not a global alias for the French class or for whole-wheat flour. |

The English display names (`Italian/French type N soft-wheat flour`) are also descriptive constructions. The reviewed Québec French sources do not prescribe an English grade name.

## Alias decisions

- Keep the full country-qualified displays as the definitive class lookup terms. Keep the explicit French aliases `farine de type N (France)` and English aliases `French type N flour`; these are class-qualified constructions, not OQLF quotations.
- Keep French-market shorthand `farine T45`, `farine T80`, `farine T110`, and `farine T150` on their corresponding France-class rows. The cited manufacturers use those labels for French products. Their presence should not be read as evidence of a Québec grade crosswalk.
- Keep `farine de type 55 (France)` and `farine de type 65 (France)` plus `French type 55 flour` / `French type 65 flour`. Keep bare `T55`, `T65`, `farine T55`, `farine T65`, `T55 flour`, and `T65 flour` inactive because Québec products use the same short labels without the catalog’s country qualifier.
- Keep Italian class designations `tipo 00`, `tipo 0`, `tipo 1`, `tipo 2` and the official Italian forms `farina di grano tenero tipo N` searchable once per row. These are Italian terms, not French or English; the current two-locale alias schema has no Italian field, so their storage in an alias array is a search implementation detail.
- Remove the shortened French constructions `farine de type 00 (Italie)` and `farine de type 0 (Italie)` for consistency with type 1 and 2, which have no such French aliases. The complete display already contains the number, wheat class, and country.
- Remove `farine à pizza Tipo « 00 »` and `Tipo 00 pizza flour` from the generic type-00 class row. They are product/use-specific labels from one Québec product family, not synonyms for every type-00 flour; retain them as evidence only. There is no bundled recipe demand for this product phrase.
- Do not add `00 style`, `T50`, `farine à pizza` generally, `gruau`, `farine complète`, `farine intégrale`, or whole-wheat aliases. La Milanaise’s `Équivalent: T50` statement is product-specific; the French class report lists no type 50. Francine’s *farine de gruau T55* is a separate product label, and the active catalog already returns four references for the broad query `gruau`. The active catalog also has distinct whole-wheat flour identities; `farine intégrale` currently matches white whole-wheat flour, and `farine de blé entier` matches three active identities [S07, S09, S11].

## Active catalog and recipe demand audit

The current bundle has 927 references and 51 forms (reference-file SHA-256 `e14ad6668bc34bd83f7e1fd3993ac023d5d748ff134fafd807583435d6850468`). Replaying the normalization and complete-phrase matching behavior in `IngredientSearch.kt` across reference and form terms found no exact normalized name or alias from a reviewed row shared by another active reference.

- `tipo 00`, `tipo 0`, `tipo 1`, and `tipo 2` each return their corresponding Italian class row.
- `T45`, `T80`, `T110`, and `T150` each return one corresponding France-class row. `T55`, `T65`, `farine T55`, and `farine T65` return no row, as intended after the later alias cleanup.
- `farine de type 55 (France)` and `farine de type 65 (France)` each return their country-qualified class row. The shared OQLF base phrase `farine de blé tendre` returns the ten regional class rows; it is a family search, not an alias conflict.
- Broad-term collisions remain: `gruau` returns four distinct active rows; `farine intégrale` returns white whole-wheat flour; `farine de blé entier` returns three wheat-meal/whole-wheat rows. These terms should stay off the grade aliases.

The current manifest lists 114 recipe files and 1,123 ingredient rows. A scan of all current recipe JSON for the Italian class terms, French grade numbers, and their French/English class phrases found no occurrences. Current manifest-ordered corpus fingerprint: `28d90c9114de305be735a4ba2a388457584562b5271e9ba4abab0e3ca9677c64`. There is no existing recipe link or corpus demand that requires product-specific aliases or a class crosswalk.

## Sources

All sources below were accessed 2026-10-11. Product pages support only their own wording and product context; they are not independent national-class certifications.

| ID | Source | Bounded evidence used |
|---|---|---|
| S01 | [OQLF, GDT: *farine de blé tendre*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre) | Preferred terms `farine de blé tendre` and `farine de blé mou`; generic soft-wheat flour definition. Last updated 2004; does not name numbered classes. |
| S02 | [TERMIUM Plus, *soft wheat* record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=98&i=&index=esw&lang=eng&sg_kp_wet=1351436&srchtxt=TRIGO) | Uses `blé tendre` for soft wheat; no Italian/French flour-number class. |
| S03 | [Berchicci, Montréal Caputo product search](https://store.berchicci.ca/fr-ca?limit=75&order=ASC&route=product/search&search=caputo&sort=pd.name) | Retailer product names include *Farine Manitoba Or Blé Tendre '0'*, *Farine Nuvola Super '0'*, and multiple `00` products. Product-label evidence only. |
| S04 | [Québec Food Directory / MAPAQ, Milanaise Organic Tipo 00 Pizza Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201447) | Product record identifies Moulins de Soulanges Inc. in Montérégie and a pizza flour with low ash; government product directory, not terminology approval or Italian-class compliance finding. |
| S05 | [La Milanaise, *Farine à pizza Tipo « 00 » biologique*](https://lamilanaise.com/produits/farine-a-pizza-tipo-00-biologique/) | Québec product wording and its stated ash-based `00` classification; the page’s `Équivalent: T50` remains that maker’s product-specific assertion. |
| S06 | [Italy, DPR 9 February 2001 no. 187, Art. 1](https://www.normattiva.it/atto/caricaDettaglioAtto?atto.codiceRedazionale=001G0242&atto.dataPubblicazioneGazzetta=2001-05-22&bloccoAggiornamentoBreadCrumb=true&dataVigenza=&generaTabId=true&qId=&tabID=&tipoDettaglio=multivigenza&title=lbl.dettaglioAtto) | Names `farina di grano tenero tipo 00/0/1/2` and gives their national criteria. No French translation, Québec term, or crosswalk is asserted here. |
| S07 | [Moulin de Charlevoix, flour products](https://www.moulin-charlevoix.net/farines-flour) | French product catalogue wording `Farine T55` and `Farine T65` under its Moulin du Lac Saint-Jean section. Product labels only. |
| S08 | [Moulin de Charlevoix, MLT65 technical sheet (PDF)](https://mayrand.ca/hubfs/13695%20Farine%20de%20bl%C3%A9%20T65.pdf) | Product sheet names `FARINE DE BLÉ T65` and lists production in Normandin, Québec. Its ash value is product-specific and not stated on FranceAgriMer’s dry-matter basis. |
| S09 | [Francine, flour product range](https://www.francine.com/les-bons-produits/les-farines) | French product names T45, T55, T65, T80, T150; page also mentions T110 in usage wording. Shows `gruau T55` separately from ordinary wheat T55. |
| S10 | [Moulins d’Antoine, T110 flour products](https://moulins-antoine.fr/nos-farines/type/t110/) | French-market T110 product labels, including *Farine de blé meule Bio T110*. |
| S11 | [FranceAgriMer, *Enquête sur les types de farines – année 2010* (published 2012, PDF)](https://www.franceagrimer.fr/sites/default/files/rdd/documents/ETU-CER-farine%202010_2.pdf) | Names the six French types and gives ash ranges on a dry-matter basis. The survey concerns 2010 respondent mills; it is class background, not Québec terminology or a current Canadian product specification. |

## Limits

The product search was bounded to the sources listed above and a targeted search for the ten classes. Failure to locate a local label for a class does not prove that no such product is sold in Québec. No source reviewed establishes an Italian-to-French type crosswalk, a Québec-wide definition for T55/T65, or an equivalence to North American flour categories. No culinary substitutions or recipe-use equivalences are proposed.
