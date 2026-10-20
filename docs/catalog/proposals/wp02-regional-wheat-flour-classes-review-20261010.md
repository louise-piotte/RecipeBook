# WP02 Section A regional wheat-flour classes — proposal review

**Date:** 2026-10-10  
**Status:** Research proposal only; no catalog, ledger, plan, roadmap, recipe, test, or code integration was performed.

## Decision

Add ten distinct, identity-only wheat-flour references in a later integration: Italian soft-wheat tipo 00, 0, 1, and 2; and French type 45, 55, 65, 80, 110, and 150. The sources define two independent national class systems. Preserve each class label with its jurisdiction and do not map a number between systems or to North American all-purpose, bread, cake, pastry, whole-wheat, protein, or extraction grades.

Treat each class as an ingredient identity, not an IngredientForm. Do not add density, unit mappings, yields, conversion rules, or substitutions. The ash and protein criteria below identify the national classes; they are not recipe measurement or substitution evidence.

The French display names below use the OQLF-preferred generic term farine de blé tendre plus the source class and country. That compound wording is a descriptive fr-CA proposal, not an OQLF-attested grade name; independent Québec terminology review remains open.

## Scope and prior progress

The plan’s Section 04 A3 remains open for implementation. The WP02 flour batch already records that Italy and France use separate class systems and cites the Italian decree and FranceAgriMer report as S16/S17; it leaves exact Québec display names and source-side specifications pending. This proposal supplies that class-level detail without repeating or replacing the existing batch review.

The identity/source/acceptance rules applied here are: preserve genuine identity differences; use aliases only for synonyms and regional names; do not merge classes because they may serve similar recipes; do not treat a grade as a preparation state; keep identity, measurement, and substitution evidence separate; and accept only source-backed bilingual terms without claiming unsupported equivalence. The exact live search behavior was read from IngredientSearch.kt and replayed over the live catalog snapshot.

## Refreshed working-tree snapshot

Counts and hashes below are for the exact files read on 2026-10-10. File hashes cover exact bytes. The recipe corpus hash iterates the manifest’s recipeFiles in stored order and hashes each manifest-relative path, a NUL byte, the exact recipe-file bytes, and a NUL byte.

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 681 references | 719bf518ca9156789d629268b9cf8f3b85e5d177bee161b3606cb9bdf326f77a |
| app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 34 forms | 904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938 |
| docs/catalog/research-ledger.v1.json | 868 records; 1,566 record source entries; 1,325 distinct source IDs | 1e9c1e466d269d68aa0f91a06230d6630cc1c65ea3fdd7b9515e30f7ae962131 |
| docs/catalog/legacy-import-identities.v1.json | 84 candidates | 454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d |
| app/src/main/assets/seed/bundled-library/manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 recipe files; 1,123 ingredient rows | 921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629 |

## Class evidence and proposed identities

### Italian soft-wheat types

Italy’s DPR 9 February 2001 no. 187, Article 1, defines farina di grano tenero and lists marketed types by maximum ash and minimum protein on 100 parts dry matter. The table gives maximum moisture of 14.50% for all four types; the protein measure is nitrogen × 5.70. Type 1 also has a maximum of 0.3% acid-insoluble material in its ash. Article 1(4) says the paragraph 3 criteria do not apply to flour intended for uses other than panification; the decree alone does not establish whether a particular pizza product falls within that scope.

| Proposed stable ID | English display | Proposed fr-CA display | DPR class criteria |
| --- | --- | --- | --- |
| ingredient-ref-italian-type-00-flour | Italian type 00 soft-wheat flour | farine de blé tendre de type 00 (Italie) | Max ash 0.55%; min protein 9.00% |
| ingredient-ref-italian-type-0-flour | Italian type 0 soft-wheat flour | farine de blé tendre de type 0 (Italie) | Max ash 0.65%; min protein 11.00% |
| ingredient-ref-italian-type-1-flour | Italian type 1 soft-wheat flour | farine de blé tendre de type 1 (Italie) | Max ash 0.80%; min protein 12.00% |
| ingredient-ref-italian-type-2-flour | Italian type 2 soft-wheat flour | farine de blé tendre de type 2 (Italie) | Max ash 0.95%; min protein 12.00% |

The decree’s table gives no minimum ash value for types 00, 0, 1, or 2. Do not infer one. These rows should describe the national grade; they should not imply that any flour sold elsewhere under a similar name has been independently checked against the decree.

### French wheat-flour types

FranceAgriMer’s June 2012 report defines the French types through ash ranges on a dry-matter basis and describes the types as expressing purity in relation to extraction. The official report prints these six ranges:

| Proposed stable ID | English display | Proposed fr-CA display | FranceAgriMer ash range |
| --- | --- | --- | --- |
| ingredient-ref-french-type-45-flour | French type 45 soft-wheat flour | farine de blé tendre de type 45 (France) | Below 0.50% |
| ingredient-ref-french-type-55-flour | French type 55 soft-wheat flour | farine de blé tendre de type 55 (France) | 0.50–0.60% |
| ingredient-ref-french-type-65-flour | French type 65 soft-wheat flour | farine de blé tendre de type 65 (France) | 0.62–0.75% |
| ingredient-ref-french-type-80-flour | French type 80 soft-wheat flour | farine de blé tendre de type 80 (France) | 0.75–0.90% |
| ingredient-ref-french-type-110-flour | French type 110 soft-wheat flour | farine de blé tendre de type 110 (France) | 1.00–1.20% |
| ingredient-ref-french-type-150-flour | French type 150 soft-wheat flour | farine de blé tendre de type 150 (France) | Above 1.40% |

The FranceAgriMer table has gaps between some printed intervals; preserve the source values and do not interpolate a missing grade or reinterpret the endpoints. The report is a survey of 2010 production, published in 2012. It states that 165 of 422 active mills responded and that respondents covered 21% of conventional and 29% of organic production; it warns that some results cannot be extrapolated to the whole sector. Its class-definition table is useful identity evidence, not a current bag-specific specification.

ANMF explains that T followed by a number denotes mineral content and gives T55 and T65 as examples. It also describes typical uses for French type 45/55/65/80/110/150. Use that evidence for T-number search aliases, not to equate culinary use with a North American flour or establish a substitution.

## Proposed aliases, form decisions, and held terms

Use the ten IDs and display names in the tables above as distinct candidates. They are not present in active references, forms, legacy candidates, or ledger identity IDs, and are not reserved by this proposal.

For Italian type N, where N is 00, 0, 1, or 2, propose these class-specific aliases:

- English aliases: tipo N; tipo N flour; Italian type N flour; farina di grano tenero tipo N.
- fr-CA aliases: farine de type N (Italie); farine de blé tendre de type N (Italie); farina di grano tenero tipo N.
- For type 00 only, include the narrowly qualified market phrase farine à pizza Tipo « 00 » and Tipo 00 pizza flour. La Milanaise uses the French product name and explicitly calls the product Tipo « 00 »; this alias recognizes that exact product wording, not every pizza flour.

For French type N, where N is 45, 55, 65, 80, 110, or 150, propose:

- English aliases: French TNN flour; French type N flour; TNN flour; TNN.
- fr-CA aliases: farine TNN; farine de type N (France); farine de blé tendre de type N (France).

The English T-number shorthand is supported by ANMF’s explanation of T followed by a number; the class table itself labels the grades “Type N.” The French base wording farine de blé tendre is OQLF-preferred. Keep each class number and its country explicit in display names and qualified aliases. Do not use broad aliases such as flour, farine, farine de blé tendre, or type flour. The search index includes both locale alias arrays, so native Italian terms can be found from either app language without adding a third language field.

Do not create an IngredientForm for these entries. The number denotes a milling/composition class, not a reversible preparation state. Keep category FLOUR_AND_STARCH, defaultDensity null, and unitMappings empty. Do not add yields, unit conversions, recipe links, or global or contextual substitution rules. The ash/protein class criteria belong only in identity source notes; they do not establish grams-per-volume, pack measures, or a substitution ratio. Measurement and substitution research remain not_yet_researched.

Hold the following outside these rows:

- T50 and any Italian-to-French crosswalk. The La Milanaise product page says “Équivalent: T50,” but this is one manufacturer’s product claim. FranceAgriMer’s six-type list contains no type 50, and neither source supports a class-wide Tipo 00 ↔ T50 mapping.
- “00 style” / “farine à pizza style 00.” Robin Hood markets a fine wheat pizza flour under this wording, but “style” does not establish the Italian national class. Do not alias it to Italian type 00 or create a generic style-00 identity from this page alone.
- “Farine complète,” “farine intégrale,” “farine de blé entier,” and “whole-wheat flour” as aliases for type 150. ANMF discusses type 150 use for pain complet but separately defines complete/integral flour as representative of the whole cleaned grain. The class identity should remain distinct from existing whole-wheat flour, wheat meal, and whole-wheat pastry flour.
- “Gruau,” “farine de gruau,” and “Gruau 45/55” as aliases for French type 45/55. Current ANMF wording treats gruau as high-protein soft-wheat flour. Légifrance’s former Gruau 45/55 subtypes added baking-quality, swelling, and protein criteria; that historical special designation is not a generic T45/T55 synonym.
- Any equivalence with all-purpose, bread, cake, pastry, high-gluten, durum flour, semolina, or a North American protein/extraction grade. Similar applications or a single product statement do not prove identity or substitution.

## Collision and recipe-query audit

IngredientSearch.kt normalizes search with lowercase, Unicode NFKD accent folding, œ/æ/ß and ampersand folding, and punctuation-to-space conversion. Search returns complete normalized phrase matches first; only when there are none does it fall back to substring matching. The reference search index includes names, aliases, and attached form labels/match terms. The current implementation was replayed against all 681 references and 34 forms.

- Every class query below returned zero active references: Italian tipo 00, tipo 0, tipo 1, tipo 2, and farina di grano tenero tipo N; for each French number, TNN, farine TNN, type N flour, and farine de blé tendre de type N. Exact normalized proposed class aliases also have no current active owner.
- All ten proposed IDs have no owner in the 681 active references, the 84 legacy candidates, or the 868 ledger records. Exact candidate phrases have no legacy or ledger owner. A scan of the 129 existing proposal files found no target-specific prior proposal; the earlier A3 batch entry is the prior class-level review.
- Broad-query collisions were checked before choosing aliases: farine de blé entier returns three active identities (wheat meal, whole-wheat flour, whole-wheat pastry flour); gruau returns four (hominy grits, oat groats, roasted buckwheat groats, and rye meal); farine returns 48 references; flour returns 47. Farine de gruau, farine de blé tendre, and farine complète return no active references. These broad or ambiguous terms are not proposed as aliases.
- All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned in manifest order for the Italian and French class names, class numbers, T aliases, and exact candidate phrases across recipe text and ingredient objects. No candidate phrase or class occurrence was found. No recipe relink is recommended.

## Source register

All sources were accessed on 2026-10-10.

| ID | Source and direct URL | Evidence used and limits |
| --- | --- | --- |
| S01 | Italy, DPR 9 February 2001 no. 187, Art. 1 — [Normattiva](https://www.normattiva.it/atto/caricaDettaglioAtto?atto.codiceRedazionale=001G0242&atto.dataPubblicazioneGazzetta=2001-05-22&bloccoAggiornamentoBreadCrumb=true&dataVigenza=&generaTabId=true&qId=&tabID=&tipoDettaglio=multivigenza&title=lbl.dettaglioAtto) | Primary legal text: soft-wheat flour definition; type 00/0/1/2 ash maxima and protein minima; moisture basis; type 1 ash note; paragraph 4 use-scope exception. It does not establish compliance of a specific Canadian product or a mapping to another country’s class. |
| S02 | FranceAgriMer, Enquête sur les types de farines, année 2010, June 2012 — [official report PDF](https://www.franceagrimer.fr/sites/default/files/rdd/documents/ETU-CER-farine%202010_2.pdf) | Official table of six French type classes and dry-matter ash ranges; report says types denote purity related to extraction. Survey covers only respondent mills for 2010 and warns results are not all extrapolatable; not a Québec naming source or a product bag certificate. |
| S03 | Association Nationale de la Meunerie Française, La farine de blé — [ANMF](https://www.meuneriefrancaise.com/la-farine/la-farine-de-ble/) | Current industry description of types as ash/mineral classes, common uses, type 150, and separate definitions for complete/integral flour and gruau. It is not a Québec terminology authority and use descriptions are not substitutions. |
| S04 | ANMF, Les idées reçues sur le pain — [ANMF](https://www.meuneriefrancaise.com/la-farine/les-secrets-nutritionnels-de-la-farine/saurez-vous-demeler-le-vrai-du-faux/) | Explains that T followed by a number indicates mineral content, with T55/T65 as examples. It does not itself enumerate all six grades or create a cross-country equivalence. |
| S05 | OQLF, farine de blé tendre — [Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre) | OQLF-preferred terms farine de blé tendre and farine de blé mou; definition maps the generic soft-wheat product to soft wheat flour. It does not attest the proposed compound grade names. |
| S06 | OQLF, farine tout usage — [Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25796945/farine-tout-usage) | Defines Canadian all-purpose flour as a hard/soft wheat blend around 12% protein and explicitly notes that flour classifications and names differ by country. It supports keeping national class systems separate; it is not a conversion source. |
| S07 | La Milanaise, Farine à pizza Tipo « 00 » biologique — [product page](https://lamilanaise.com/produits/farine-a-pizza-tipo-00-biologique/) | Québec-market French product wording; the page reports protein 12.8% ± 1%, states “Équivalent: T50,” explains its Tipo 00 label by ash classification, and recommends pizza/calzone/focaccia. These are product-specific manufacturer statements, not generic class composition, an independent legal compliance result, or a class-wide T50 mapping. |
| S08 | Robin Hood, Farine à Pizza Style 00 — [French product page](https://www.robinhood.ca/fr/produits/farines-premier-choix/pizza-style-00) | Canadian French product wording for a fine wheat pizza flour labeled “style 00.” The page does not state compliance with the Italian class criteria; it supports holding “style 00” apart from the class alias. |
| S09 | France, Décret n° 63-720, historical Article 3 — [Légifrance version dated 1 October 1963](https://www.legifrance.gouv.fr/loda/article_lc/LEGIARTI000020132019/1963-10-01) | Historical text defined Gruau 55 and Gruau 45 with ash, baking-value, swelling, and protein conditions; the page states this article was in force 1963–2016 and repealed in 2016. It is evidence against conflating those historical special designations with generic T45/T55, not current regulation. |

## Remaining gaps

- Obtain independent Québec French review of the ten proposed display compounds and aliases. OQLF verifies farine de blé tendre as the generic term, but not the full type-number-country constructions.
- If current legal status for French classes is required at integration time, verify it against current French regulatory text. The cited FranceAgriMer report is from a 2010 survey published in 2012, while ANMF is an industry source.
- Keep any review of the La Milanaise T50 claim at product level. No source here supports a general T50 class or a Tipo 00–T50 mapping.
- Research Italian whole-wheat/integrale and other grades separately; they are outside this requested A3 subset.
- Measure density, unit mappings, package yields, and substitutions separately with cooking-use evidence. None was researched or changed in this identity review.
- Reconfirm IDs, aliases, and collisions at integration; this proposal does not reserve IDs, update the ledger, alter the active picker, run tests, or perform emulator acceptance.
