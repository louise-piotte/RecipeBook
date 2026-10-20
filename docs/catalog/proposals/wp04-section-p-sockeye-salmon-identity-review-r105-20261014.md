# WP04 Section P — sockeye salmon / saumon rouge identity review (R105)

- **Review and source-access date:** 2026-10-14.
- **Status:** Integrated by root on 2026-10-14 as an identity-only reference and source-specific ledger evidence. See the [R105 batch README](../batches/wp04-section-p-sockeye-salmon-identity-integration-20261014/README.md). The ownership snapshot below predates integration.
- **Scope:** Sockeye salmon, *Oncorhynchus nerka* (CFIA TSN 161979).
- **Recommendation:** Add an identity-only `PROTEIN` reference as **sockeye salmon / saumon rouge**. Keep only the sourced, taxon-specific aliases `red salmon` and `saumon sockeye`; add no forms, active measures, density, unit mappings, recipe links, conversions, yields, or substitutions.
- **Recipe boundary:** Keep recipe 077 row 10 on generic `salmon fillets / filet de saumon`; it names no species.

## Selection and ownership

The parent finfish checklist remains open in the [Section P catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4463). Sockeye is a distinct species identity that has not been decided by the prior salmon reviews. It follows the accepted [chum salmon R96](wp04-section-p-chum-salmon-identity-review-r96-20261014.md), [pink salmon R103](wp04-section-p-pink-salmon-identity-review-r103-20261014.md), and [coho salmon R104](wp04-section-p-coho-salmon-identity-review-r104-20261014.md) identities, without reopening those decisions or the [Atlantic-bluefin R101 hold](wp04-section-p-atlantic-bluefin-tuna-picker-boundary-hold-r101-20261014.md) and [yellowfin-tuna R102 identity](wp04-section-p-yellowfin-tuna-identity-review-r102-20261014.md).

The earlier [salmon/tuna species-scope review](wp04-finfish-salmon-tuna-species-boundary-recheck-20261011.md) cites the OQLF sockeye entry to explain why recipe 077 does not choose a species. That review keeps the generic line intact; it does not decide a sockeye row, alias set, picker projection, or product-state evidence. The existing `candidate-wp04-salmon-species-scope` ledger record remains limited to the unnamed taxon in recipe 077 and does not block a separate identity.

The current active catalog has **1,446 ingredient references, 105 forms, and 63 legacy-import candidates**. The salmon references are generic salmon fillets, chum salmon, pink salmon, and coho salmon. Exact normalized ownership checks across active reference and form names/aliases and legacy candidates found no owner for `sockeye salmon`, `saumon rouge`, `saumon sockeye`, `red salmon`, *O. nerka*, or `ingredient-ref-sockeye-salmon`. No sockeye-specific ledger decision, candidate, proposal, or integration was found; the generic salmon-scope candidate is the only related ledger entry. The R105 source-ID prefix used below was unallocated at review time.

Keep sockeye separate from chum/*keta* (*O. keta*), pink (*O. gorbuscha*), coho (*O. kisutch*), Chinook (*O. tshawytscha*), Atlantic salmon (*Salmo salar*), trout, and salmon roe. Do not move the generic salmon recipe line or reference to this taxon.

## Taxon and Québec / Canadian names

The Office québécois de la langue française (OQLF) entry is in the edible-fish and ichthyology domains, names the species *Oncorhynchus nerka*, and says it has commercial potential in Québec. It lists **saumon rouge** and **saumon sockeye** as preferred French terms and gives **sockeye salmon** and **red salmon** among the English terms. It notes that canned `saumon rouge` is generally called `sockeye`. Use `saumon rouge` as the display and `saumon sockeye` as a French alias; use `sockeye salmon` as the English display and `red salmon` as an English alias. [S01]

Keep OQLF's contextual `kokani` and `saumon nerka` out of the alias arrays: the entry says those names were not retained by the fish-product terminology committee, and `kokani` refers to the freshwater form of sockeye. Also omit English `blueback`. Although it appears as an OQLF translation for sockeye, the current CFIA Fish List assigns **Blueback Salmon / Saumon Coho** to *O. kisutch* (TSN 161977); including it would send a qualified query to the wrong single species. [S01–S02]

The CFIA Fish List, modified **2023-09-18**, assigns TSN 161979 to *O. nerka* and lists **Sockeye Salmon**, **Red Sockeye Salmon / Saumon Sockeye**, and **Red Salmon / Saumon Rouge**. The same list separates the neighboring coho, pink, chum, and Chinook taxa. These rows support the proposed bilingual identity and the `red salmon` alias; they are name-to-taxon evidence, not a recipe-species inference. [S02]

Fisheries and Oceans Canada (DFO) also labels the species **Sockeye salmon (*Oncorhynchus nerka*)**, describes its Pacific distribution, and says sockeye has long been commercially harvested and canned. Its Pacific salmon information page was modified **2019-12-10**. This supplies taxonomic, range, and broad market context, but does not establish the origin or form of any recipe ingredient. [S03]

## Québec product states, measures, and substitutions

Current Québec-facing retail pages support the species-qualified market wording and distinct product presentations:

- Poissonnerie La Mer lists **Filet de Saumon Sockeye Sauvage Congelé**, describes wild British Columbia sockeye as filleted and frozen aboard the boat, and offers item formats of **170 g** and **750 g**. Its copy says the item may be sold as a whole fillet or an individual portion. This is product and SKU evidence; the formats are not reusable recipe measures or a general sockeye form set. [S04]
- Metro lists **Fresh Wild Sockeye Salmon Fillets** and identifies `(Oncorhynchus nerka)`, northeast Pacific/Canada origin, and wild catch methods. The page showed the selected item **out of stock** when accessed on 2026-10-14; it confirms wording and taxon for that listing, not current availability throughout Québec. [S05]

Health Canada's Canadian Nutrient File (CNF) has sockeye records for separate raw, baked/broiled, and canned states. The CNF serving pages were modified **2019-03-01**. Raw food code 3052 records a 90 g Food Guide serving, one whole 2,200 g fish as 768.3 g edible portion, and 65% refuse. Baked/broiled code 3053 records 57.5 g per 100 mL flaked, 143.7 g per 250 mL, a 155 g half-fillet, a 75 g Food Guide serving, and 65% refuse. Canned code 3226 is specifically unsalted, drained solids with bone; it records 63.4 g per 100 mL drained, 158.5 g per 250 mL, a 369 g can, and a 75 g Food Guide serving. Treat any such values only as code-specific ledger observations. They do not establish a general density, kitchen conversion, raw-to-cooked yield, or retail can size. [S06–S08]

The CNF state-specific portions do not support active measures or forms on the species reference. The retail pages show fresh and frozen fillets, while DFO and OQLF mention sockeye in canned products; none establishes that all sockeye shares one preparation state or package. No reviewed source establishes an equal-amount, method-independent substitution between sockeye, generic salmon fillets, chum, pink, coho, or another fish. Add no forms, measures, default density, unit mappings, conversions, yields, substitutions, or recipe-line links.

## Recipe demand and current catalog state

The full manifest-listed bundle contains **114 recipe files and 1,123 ingredient rows**. A scan of every recipe JSON string and ingredient row for `sockeye`, `saumon rouge`, `saumon sockeye`, `red salmon`, `blueback`, `kokani`, `saumon nerka`, and *O. nerka* found no candidate-specific hits. Its only salmon ingredient row is recipe 077 row 10: **675 g salmon fillets without skin, cut into cubes**, linked to `ingredient-ref-salmon-fillets-without-skin`. Preserve its quantity, product wording, and generic link. No sockeye recipe demand or species-specific quantity is present.

No form is attached to the existing salmon-fillets, chum, pink, or coho references. The candidate is an identity row only; no raw, frozen, canned, smoked, or fillet form is proposed.

## Picker projection

The projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, ligatures, punctuation, and spacing; return complete word-phrase matches across names, aliases, and attached form terms before substring fallback. The proposed row uses only the preferred OQLF display pair and the two unambiguous, sourced aliases listed above.

| Search query | Current results | With proposed row | Boundary |
|---|---|---|---|
| `sockeye salmon` / `sockeye` | None | sockeye salmon / saumon rouge | Qualified English query selects the new taxon. |
| `saumon rouge` | None | sockeye salmon / saumon rouge | Preferred Québec French display identifies this species. |
| `saumon sockeye` | None | sockeye salmon / saumon rouge | OQLF-preferred French synonym resolves to the same row. |
| `red salmon` | None | sockeye salmon / saumon rouge | OQLF and CFIA source this English name to *O. nerka*. |
| `salmon` / `saumon` | Generic salmon fillets; chum; pink; coho | Generic salmon fillets; chum; pink; coho; sockeye | Broad searches become a five-result set and keep the generic row. |
| `salmon fillets` / `filet de saumon` | Generic salmon fillets | Generic salmon fillets | Recipe-facing product phrase remains generic. |
| `chum salmon` / `saumon kéta` / `keta salmon` | Chum salmon | Chum salmon | Existing chum identity and alias are unaffected. |
| `pink salmon` / `saumon rose` | Pink salmon | Pink salmon | Existing pink identity is unaffected. |
| `coho salmon` / `saumon coho` | Coho salmon | Coho salmon | Existing coho identity is unaffected. |
| `blueback` | None | None | Omit it because CFIA assigns Blueback Salmon to coho. |
| `red` | Many unrelated red-named ingredients | Same results plus sockeye | A broad color query remains multi-result; `red salmon` is the qualified phrase. |

The qualified aliases add no competing sockeye interpretation to the current catalog. They intentionally expand broad `salmon`, `saumon`, and `red` searches while preserving existing fish identities and the generic fillet choice.

## Proposed canonical reference

This canonical reference was integrated on 2026-10-14; the shared catalog row is `ingredient-ref-sockeye-salmon`.

~~~json
{
  "id": "ingredient-ref-sockeye-salmon",
  "nameEn": "sockeye salmon",
  "nameFr": "saumon rouge",
  "aliasesEn": ["red salmon"],
  "aliasesFr": ["saumon sockeye"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "PROTEIN"
}
~~~

The identity evidence is recorded on `ingredient-ref-sockeye-salmon`. Ten CNF portion observations are retained in the research ledger under their three named source codes only; they are not active measures, density, mappings, or forms.

## Sources

Online sources were accessed on **2026-10-14**. Source IDs below use the R105 prefix; no matching prefix or identity allocation was found during this review.

| Source ID | Source and source date | Evidence and limit |
|---|---|---|
| `WP04-SECTIONP-SOCKEYE-SALMON-R105-20261014-S01` | OQLF, [saumon rouge, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198946/saumon-rouge), last updated 2012. | Identifies *O. nerka*, gives preferred French and English terms, and distinguishes contextual names. Terminology source; not evidence about recipe 077. |
| `WP04-SECTIONP-SOCKEYE-SALMON-R105-20261014-S02` | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=salmon), modified 2023-09-18. | Assigns TSN 161979 and Sockeye Salmon / Red Salmon / Saumon Rouge to *O. nerka*; lists Blueback Salmon / Saumon Coho under *O. kisutch*. Canadian name and taxon boundary evidence. |
| `WP04-SECTIONP-SOCKEYE-SALMON-R105-20261014-S03` | DFO, [Information about Pacific salmon](https://www.pac.dfo-mpo.gc.ca/fm-gp/salmon-saumon/facts-infos-eng.html), modified 2019-12-10. | Identifies sockeye as *O. nerka* and summarizes its Pacific range and commercial/canning history. Does not identify a recipe or retail item's stock. |
| `WP04-SECTIONP-SOCKEYE-SALMON-R105-20261014-S04` | Poissonnerie La Mer, [Filet de Saumon Sockeye Sauvage Congelé](https://www.lamer.ca/products/filet-saumon-sockeye-sauvage-congele), accessed 2026-10-14. | Current Québec-facing French item name, wild BC source, frozen/fillet state, and 170 g / 750 g seller formats. SKU-specific presentation, not a general measure or guaranteed stock statement. |
| `WP04-SECTIONP-SOCKEYE-SALMON-R105-20261014-S05` | Metro, [Fresh Wild Sockeye Salmon Fillets](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/saumons-truites-et-thons/filets-de-saumon-sockeye-sauvage-frais/p/222252), accessed 2026-10-14. | Product 222252 identifies *O. nerka*, Northeast Pacific/Canada provenance, and wild catch methods; selected page showed out of stock. One retailer listing only. |
| `WP04-SECTIONP-SOCKEYE-SALMON-R105-20261014-S06` | Health Canada, [CNF food code 3052: raw sockeye](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3052), modified 2019-03-01. | Food Guide and whole-fish edible/refuse observations for the named raw food code. Not a catalog measure or yield. |
| `WP04-SECTIONP-SOCKEYE-SALMON-R105-20261014-S07` | Health Canada, [CNF food code 3053: baked or broiled sockeye](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3053), modified 2019-03-01. | Flaked-volume, half-fillet, Food Guide, and refuse observations for the named cooked code. Not a raw density or conversion. |
| `WP04-SECTIONP-SOCKEYE-SALMON-R105-20261014-S08` | Health Canada, [CNF food code 3226: canned sockeye, drained solids with bone, unsalted](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3226), modified 2019-03-01. | Drained-volume, can, and Food Guide observations for the exact canned code. Not a universal can conversion or substitution basis. |

## Static review status

Re-read the active Section P checklist, R91–R104 review history, current references and forms, legacy candidates, related ledger decision, prior salmon proposals, and the full manifest-listed recipe corpus. Verified the official OQLF, CFIA, DFO, and Health Canada pages plus current Québec-facing La Mer and Metro product pages. Static checks passed: the hypothetical phrase-first picker projection matched the listed query results; the canonical JSON block parses with the expected schema; all local links resolve; the eight source IDs are distinct and the proposed R105 prefix has no existing owner; the file is UTF-8 without BOM with a final newline and no trailing whitespace. The 114-file/1,123-row corpus scan found no sockeye-specific demand. The identity and ten CNF observations are integrated; no app, Gradle, instrumentation, or emulator tests were run because the change only adds database JSON data.


## Integration outcome

Integrated `ingredient-ref-sockeye-salmon` with the preferred displays `sockeye salmon / saumon rouge`, aliases `red salmon` and `saumon sockeye`, null density, and no unit mappings. Added eight sources, three decisions, and ten code-specific CNF observations to the ledger. The picker projection returns the new row for qualified sockeye queries; broad `salmon` and `saumon` queries each return five rows, `red` remains multi-result, and recipe 077#10 stays linked to generic salmon fillets. Static package, reference, generated-index, ledger, picker, corpus, encoding, local-link, and whitespace checks passed. No app tests were run because this change only adds database JSON data and its generated catalog index.
