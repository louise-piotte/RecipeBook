# WP06 West African prekese pod spice identity review — 2026-10-16

- **Disposition:** Advance one identity-only, source-bounded Ghanaian `prekese` culinary pod-spice candidate for integration review. No catalog, ledger, plan, roadmap, recipe, or code changes are part of this proposal.
- **Proposed reference:** `ingredient-ref-prekese-pods`, category `BAKING_AND_SPICE`.
- **Proposed names:** EN `prekese pods`; fr-CA `gousses de prekese` (descriptive and provisional).
- **Proposed aliases:** EN `prekese`; no French aliases.
- **Scope:** Ghanaian source-named culinary fruit pods of *Tetrapleura tetraptera*. Keep all other names and nonculinary products source-scoped or held below.

## Why this is an open gap

The plan’s Section 05 cuisine parent remains open for North, West, Central, Horn, East, and Southern Africa. Its completed six-region sweep and 2026-10-13 continuation do not include `prekese`; neither term nor taxon occurs in the reviewed proposal and batch archive. This is one bounded West African pantry-spice addition, not a claim of Ghanaian or continental completeness. Section Z’s named palm, groundnut, melon/ogbono, and fermented-seed work remains separately bounded and open.

Ghanaian institutional and academic sources identify *Tetrapleura tetraptera* fruit pods as a distinct culinary spice and use the Ghanaian name `prekese`. A Ghana national report lists it separately from *Xylopia aethiopica* (hwentea), *Monodora myristica* (calabash nutmeg), *Aframomum melegueta* (grains of paradise), and *Parkia* seed seasonings [S01–S04]. The active catalog owns the exact phrase `grains of paradise` under `ingredient-ref-grains-of-paradise`; that row does not own or imply *Tetrapleura*.

## Accepted and held terms

“Advance” means identity evidence is sufficient to consider one catalog row; it does not authorize an integration or any other data change.

| Term/product | Disposition | Boundary |
|---|---|---|
| Ghanaian `prekese` culinary fruit pods of *T. tetraptera* | **Advance** as `ingredient-ref-prekese-pods`. Use EN `prekese pods`, provisional fr-CA `gousses de prekese`, and only the EN alias `prekese`. | Evidence supports fruit/pods used as a spice or soup/stew flavouring. No preparation-specific form is implied. |
| `Aridan`, `Aprekese`, `Oshosho`, `Osakirisa`, `Uyayak`, Fang `enziese`, and Etinde `esesekese` | **Hold as aliases.** | These names occur in wider species literature and product listings, but the sources do not establish the same source-local usage, language, and retail product scope for every term. Do not make them universal aliases [S01, S02, S04, S06]. |
| Montréal listing `gousses d’ésèse`; its other names `4 côtés`, `plakassé`, `darwo`, `sawa`, `akpa`, `linja`, `ouara` | **Record as source-local French market evidence; do not add as aliases in this proposal.** | One Montréal seller identifies its Cameroon-origin item as *T. tetraptera*. The listing is not a terminology authority, gives a regional product label, and says the item is not available for online purchase. Its list does not establish universal French aliases or Québec prevalence [S05]. |
| `quatre côtés` / `4 côtés` | **Hold.** | The Montréal seller lists these for its Cameroon-origin item, but this proposal does not promote a descriptive name as a stable, product-specific Québec alias [S05]. |
| `galbanum` | **Exclude as alias.** | One Ghana thesis table places `Galbanum` beside *T. tetraptera* / `Prekese`, but that table does not establish the bare term as a globally unambiguous synonym. Do not convert the table label into a catalog alias [S04]. |
| `prekese powder`, mixed prekese drink, tea/decoction, extracts, other plant parts, and medicinal products | **Hold as distinct product/form questions.** | The source set mentions processing and nonculinary uses, but it does not justify adding these as aliases, forms, or medicinal claims to the culinary pod identity. |
| Grains of paradise, Negro pepper / hwentea, calabash nutmeg, soumbala, groundnut/peanut products, egusi, ogbono | **Keep separate.** | The sources distinguish several of these by plant or product. None is a synonym, form, or substitute for prekese. The listed active neighbor `ingredient-ref-grains-of-paradise` remains unchanged. |

## Québec French and display limits

Targeted searches of OQLF and TERMIUM for `prekese`, `ésèse`, and *Tetrapleura tetraptera* returned no terminology entry. I found one Montréal retailer page headed **Gousses d’ésèse**; it identifies the product as *T. tetraptera*, says its origin is Cameroon, and describes culinary use. This is useful evidence of one French-language Québec market label, not an OQLF recommendation or proof that the term names every regional product. The listing also shows the item as unavailable for online purchase [S05].

The proposed French wording `gousses de prekese` is therefore a transparent descriptive rendering, not an established preferred Québec term. Keep it marked provisional at integration and do not add `gousses d’ésèse` as a general alias from this single listing. The source-name `prekese` is retained to avoid replacing it with an unsupported universal translation.

## Current package snapshot and ownership audit

Read from the shared worktree on **2026-10-16**. JSON hashes below cover exact file bytes. The recipe-corpus hash covers manifest-ordered entries, appending each relative recipe path, a NUL byte, the exact recipe bytes, and a NUL byte before hashing.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,595 references | 515,344 | `999088c56419aeb84bd95b022715de9b26a7126be3158c2ede8ac59d0e885392` |
| `ingredient-forms.v1.json` | 122 forms | 92,787 | `d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1` |
| `legacy-import-identities.v1.json` | 61 candidates | 14,525 | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| `research-ledger.v1.json` | 1,940 records; 8,388 source entries; 7,128 distinct `sourceId` values | 8,465,405 | `b577938bc7c4255efbbb74eec2c776fdb98d253e8acf95ac6998941174629589` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,928 aggregate file bytes | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

The exact normalized-key audit covered reference displays and aliases, form labels and match terms, and legacy candidate IDs, displays, and aliases. It found **zero exact collisions** for the proposed names/alias and source terms `prekese`, `prekese pods`, `prekese fruit`, `gousses de prekese`, *Tetrapleura tetraptera*, `gousses d’ésèse`, `Aridan`, `Aprekese`, `Oshosho`, `Osakirisa`, `Uyayak`, `enziese`, `esesekese`, `galbanum`, and `quatre côtés`. No exact candidate form or legacy owner was found. `ingredient-ref-prekese-pods` is absent from active reference, form, and legacy IDs. The only exact active owner in this candidate-name audit is the intentionally separate `ingredient-ref-grains-of-paradise` for `grains of paradise`.

A phrase audit of all existing catalog proposal and batch Markdown found no prior `prekese` or *Tetrapleura tetraptera* review. The proposal-local source IDs use prefix `WP06-PREKESE-IDENTITY-20261016-S` (abbreviated S01–S06 below); that prefix is absent from the current ledger and proposal/batch archive; the target proposal path was free before writing this file. These checks pin this snapshot only and should be repeated before any integration.

## Bundled recipe demand

I parsed every manifest-listed recipe: all **114 files**, their complete JSON content, all **1,123 ingredient rows**, and each row’s ingredient identity/text fields. Whole-phrase search used normalized case-folded text with accent removal and punctuation-to-space conversion. Search terms covered `prekese`, pod/fruit variants, `prekesse`, `prɛkɛsɛ`, `Aprekese`, `Aridan`, `Oshosho`, `Osakirisa`, `Uyayak`, `enziese`, `esesekese`, `Aidan tree`, `gousses de prekese`, `ésèse` / `esese`, `quatre côtés` / `4 côtés`, `four sides`, *Tetrapleura tetraptera*, `four-winged pod`, and `galbanum`. The neighboring spice search included *Xylopia aethiopica* / `hwentea` / `hwintia` / `Negro pepper`, *Monodora myristica* / `calabash nutmeg`, *Aframomum melegueta* / `grains of paradise`, and *Parkia clappertoniana* / `dawadawa`. The scan found **zero full-recipe matches and zero ingredient-row matches** for these terms.

Recipe 090, **African Peanut Stew**, is the sole Africa-titled bundled recipe found in the prior African review. Its exact peanut line is `1/2 cup natural creamy peanut butter`, linked to `ingredient-ref-peanut-butter`; it separately lists `peanuts and fresh cilantro, for garnish`, linked to `ingredient-ref-peanuts`. It has no prekese line. Its title and groundnut ingredients do not establish demand for, equivalence to, or a substitution with a regional spice. No recipe link or relink is proposed.

## Data limits and next actions

If integration is accepted, add only the identity row described above and its identity evidence record. Keep all density and unit mappings empty; add no forms, measurement observations, conversions, yields, substitutions, recipe links, safety guidance, or medicinal claims. Record measurement and substitution research as `not_yet_researched`; the sources gathered here were reviewed for identity and regional use only.

Before integration, rerun the package snapshot, exact-key/ID/source-ID checks, and the full manifest-ordered recipe scan. Keep the proposed French rendering provisional pending Québec terminology review, and re-evaluate any proposed regional aliases against language- and product-specific evidence. Leave the broader Section 05 and Section Z African coverage open.

## Sources

All web sources below were accessed 2026-10-16. They support only the claims and boundaries stated above.

| ID | Source | Use and limit |
|---|---|---|
| **S01** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Tetrapleura tetraptera*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:521134-1/general-information), current taxon record. | Accepts *T. tetraptera*, gives its African native range and pod description, and records `prekese` among common-name data. Taxonomic and nomenclatural evidence, not a culinary usage standard. |
| **S02** | Kwame Nkrumah University of Science and Technology, Office of Grants & Research, [“New Research Proves ‘Prekese’ Could Cure Hypertension”](https://ogr.knust.edu.gh/news/news-items/new-research-proves-prekese-could-cure-hypertension), 2016, reporting Forestry Research Institute of Ghana (FORIG) work. | Identifies the fruit as *T. tetraptera* and reports its use to flavour food, especially soup. Only the food-identity statement is used; no health claim is adopted. |
| **S03** | Ghana national authorities, [*Ghana: Country Report to the FAO International Technical Conference on Plant Genetic Resources*](https://www.fao.org/fileadmin/templates/agphome/documents/PGR/SoW1/africa/GHANA.PDF), prepared in 1995 for the Leipzig 1996 conference, §2.3, printed p. 12. | Lists *T. tetraptera* (`prekese`) among Ghanaian wild species used as spice and names *Xylopia aethiopica*, *Monodora myristica*, *Aframomum melegueta*, and *Parkia clappertoniana* separately. FAO says the report is solely the responsibility of Ghana’s national authorities and was not verified by FAO; it is historical, source-local evidence. |
| **S04** | Dzesii Kwame Torku, University of Ghana, [*Chemical Composition and Antimicrobial Efficacy of Essential Oil from Xylopia aethiopica Fruit Pods*](https://ugspace.ug.edu.gh/server/api/core/bitstreams/9622b9ce-d4d9-4199-b413-5d5ccec6b9bf/content), MPhil thesis, July 2017, §4.1 and Table 6, printed pp. 48–49. | A Ghanaian spice-market survey table lists `Prekese` with *Tetrapleura tetraptera* separately from Negro pepper/*Xylopia*, calabash nutmeg/*Monodora*, and grains of paradise/*Aframomum*; its survey discussion reports use in Ghanaian palm-nut and peanut soups. The term `Galbanum` appears in that source’s table but is not adopted as an alias. The study is about *Xylopia*; use only its bounded spice-survey evidence for prekese. |
| **S05** | NaturoSendey, Montréal, [“Gousses d’ésèse”](https://www.naturosendey.com/fr/produit/gousses-desese), product page, accessed 2026-10-16. | Product page names *T. tetraptera*, gives Cameroon as origin, and calls the pods a culinary spice. It provides one source-local French market name. It is not an OQLF/TERMIUM record; it states online purchase is unavailable and its additional common-name list is not treated as universal alias evidence. |
| **S06** | R. A. Botchway, F. K. Saalia, and I. O. A. Hodgson, [“Prekese Fruit Drink, a Cold Extraction Production Process”](https://ghanascience.gov.gh/wp-content/uploads/2022/10/hodgson_publication-3.pdf), *Journal of Ghana Science Association* 20(2), pp. 41–46; authors are from the University of Ghana’s Food Process Engineering Department. | Identifies the species as *T. tetraptera* and reports source-local names `Aprekese` (Ewe), `Oshosho` (Igbo), and `Aridan` (Yoruba), alongside `Prekese` (Asante). This beverage-process paper supports review of those regional names, not their promotion as universal aliases or forms of the culinary pod entry.
