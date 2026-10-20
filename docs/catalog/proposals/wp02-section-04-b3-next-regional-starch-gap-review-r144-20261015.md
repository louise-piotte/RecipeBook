# WP02 Section 04 B3 R144 — proso-millet starch product-boundary hold

- **Reviewed:** 2026-10-15.
- **Status:** Proposal-only hold. No shared catalog, research-ledger, checklist, roadmap, generated, recipe, or application file was changed.
- **Checklist:** [WP02 Section 04 B3](../../RecipeBook-global-ingredient-catalog-plan.txt#L2209), `[ ] Water-chestnut flour and other documented regional starches.` The parent remains open after R143.
- **Candidate:** starch isolated from common/proso millet, *Panicum miliaceum*.
- **Scope:** Isolated proso-millet starch, distinct from common-millet grain, proso-millet flour, and starch from other millet species. This review does not reopen the integrated sorghum-starch identity (R133) or the pearl-, foxtail-, and finger-millet-starch holds (R139, R142, R143).
- **Proposal-local source-ID prefix:** `WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S`. Archive/plan searches found no focused proso-starch decision or allocated candidate ID. R142 and R143 cite mixed-species millet-starch research only as adjacent evidence; neither reviews proso starch as its own product candidate.

## Recommendation

**Hold proso-millet starch outside the active catalog and research ledger.** Primary studies isolate starch from *Panicum miliaceum*, including Canadian-grown research material, and one food study tests it in a specific pudding system. Current Canadian product listings reviewed identify proso millet grain; Québec-facing evidence identifies millet grain or proso-millet flour. The bounded product search found no standalone Canadian human-food package or supplier page for proso-millet starch. OQLF supports **millet commun** for the crop and **amidon** for starch generally, but no reviewed Québec terminology entry or product label attests the complete product name **amidon de millet commun**. A descriptive compound alone does not establish a Québec product identity. [S01–S07]

Do not add `ingredient-ref-proso-millet-starch`, a ledger candidate, aliases, forms, density, unit mappings, recipe links, conversions, yields, or active substitutions. Keep grain and flour scope on their current references; do not merge whole grain, milled flour, isolated laboratory starch, modified starch, or resistant-starch fractions.

## Product and Québec terminology boundary

| Phrase or material | Disposition | Evidence boundary |
|---|---|---|
| **proso-millet starch** | Hold as a research ingredient phrase, not an active Canadian/Québec product identity. | Studies isolate the starch fraction, but the current local product pages reviewed show grain or flour rather than standalone starch. [S04–S08] |
| **amidon de millet commun** | Do not use as a French display or alias yet. | OQLF directly supports **millet commun** for *P. miliaceum* and **amidon** as the general term for starch. The combined phrase is a descriptive construction; no product-specific Québec terminology entry or product label reviewed uses it for isolated proso-millet starch. [S01–S02, S09] |
| **millet commun / common millet / proso millet** | Keep on `ingredient-ref-common-millet` (`common millet / millet commun`, `GRAIN_AND_CEREAL`). | OQLF maps **millet commun**, **common millet**, **proso millet**, and *Panicum miliaceum*. These terms name the crop/grain, not extracted starch. [S01] |
| **proso millet flour / farine de millet commun** | Keep on `ingredient-ref-proso-millet-flour` (`FLOUR_AND_STARCH`). | The current French-facing Canadian product page names proso-millet flour and uses **farine de millet commun**. Grinding whole grain into flour is not starch isolation. [S07, S10] |
| **waxy / non-waxy, native, modified, or resistant proso starch** | Do not allocate separate identities or forms from lab samples. | Research contrasts cultivar traits and extraction or experimental treatment conditions. It does not establish consumer-facing Canadian grades or stable catalog form codes. [S04–S06] |
| **pearl, foxtail, finger, or other millet starch** | Keep species-specific; do not merge. | Prior decisions address these different taxa. Similar common names or shared starch behavior do not establish the same ingredient identity. [S11] |

The French-language Québec guide identifies **millet commun** as *Panicum miliaceum* and distinguishes it from **millet des oiseaux** (*Setaria italica*). Its general buying guidance lists millet grain, flakes, and flour; it does not name an isolated proso-starch product. This is useful Québec food vocabulary, not a current retail label or evidence that starch is sold locally. [S03]

## Canadian and Québec-facing product scope

- Shastha Canada lists **Proso Millet 500g**, with the ingredient listed as **Proso Millet**. The page shows a grain product, not extracted starch; its 500 g package weight is not a kitchen measure. [S05]
- Indian Grocers in Burlington, Ontario, lists **S&V Proso Millet** as a 1 kg grocery product. This is further Canadian grain-product context only. [S06]
- A current Québec Metro listing uses **Millet décortiqué biologique** for hulled millet, without identifying the species as proso. The species remains unspecified on that page. [S08]
- Spice Divine’s French-facing Canadian listing is titled **Farine de millet S&V Proso** and describes flour made from proso millet; its copy uses **farine de millet commun**. It supports adjacent flour terminology only, not an isolated starch product. [S07]
- Targeted searches reviewed on 2026-10-15 included `proso millet starch` with Canada/product qualifiers, `amidon de millet commun`, `amidon de millet proso`, and retailer-scoped searches for proso-millet starch. Results returned research and grain/flour pages, but no standalone Canadian human-food starch package or supplier page. This is a bounded non-discovery, not proof of nonexistence. [S12]

OQLF’s crop entry is botanical; its general **amidon** entry defines starch and distinguishes **fécule** as more specific to tubers or other underground plant organs. Neither entry establishes a proso-starch product name. Do not promote a mechanically combined crop term and generic starch term to a confirmed package label. [S01–S02]

## Live catalog, ledger, archive, picker, and recipe audit

The read-only snapshot contains **1,500 ingredient references**, **117 forms**, **1,845 research-ledger records**, **61 legacy-import candidates**, and **114 manifest-listed recipes with 1,123 ingredient rows**. The audit used the current [reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [research ledger](../research-ledger.v1.json), [legacy identities](../legacy-import-identities.v1.json), and [ingredient search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Surface | Finding |
|---|---|
| Active owners | `ingredient-ref-common-millet` owns **common millet / millet commun**, with the English alias **proso millet** and species-qualified grain aliases. `ingredient-ref-proso-millet-flour` owns **proso millet flour / farine de millet commun**, with flour-qualified aliases. No active reference owns proso-millet starch or the proposed French compound. |
| Forms and numeric catalog fields | Neither active reference has an attached form. No current form label or match term names proso starch. Both references have `defaultDensity: null` and `unitMappings: []`; no isolated-starch density or measure is available in active catalog data. |
| Research ledger | Separate records exist for the common-millet grain and proso-millet flour. No `ingredient-ref-proso-millet-starch` record or proso-starch candidate exists. The flour research includes an intact-grain bulk-density observation and formula-specific wheat/proso-flour bread findings; those do not transfer to extracted starch. [S10] |
| Legacy identities | No proso-starch phrase or candidate identity is present in the legacy-import candidates. |
| Proposal and batch archive | Exact searches for `proso millet starch`, `proso starch`, `amidon de millet commun`, and `ingredient-ref-proso-millet-starch` found no focused proso-starch decision. R142 and R143 mention proso only as a different millet species in comparison papers; R139 and R142–R143 otherwise address distinct pearl, foxtail, and finger millet starch. [S11] |
| Recipe corpus | All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned. Searches for `proso millet starch`, `proso starch`, `millet starch`, `amidon de millet commun`, `proso millet`, `millet commun`, `common millet`, and current grain aliases such as `barri` and `panivaragu` found zero recipe-text and zero ingredient-line matches. No bundled demand or recipe link supports allocation. |
| Local plan | Section 04 B3 remains open. The plan’s recent entries close other distinct candidates, but no proso-starch item is checked or allocated. [S11] |

### Picker projection

The projection follows `IngredientReferenceSearchIndex`: it prefers complete normalized word phrases across reference names, aliases, and attached form terms, then falls back to partial matching. The hypothetical row uses **proso millet starch / amidon de millet commun** with no aliases. It is shown only to quantify the impact; no display is recommended for activation.

| Query | Current results | Hypothetical count | Consequence |
|---|---:|---:|---|
| `proso millet starch` | 0 | 1 | Qualified English query would find the hypothetical row. |
| `amidon de millet commun` | 0 | 1 | The descriptive French phrase would find the hypothetical row, but it is not verified product terminology. |
| `millet starch` | 0 | 1 | The contiguous phrase occurs inside the English display **proso millet starch**, so the row would match without a broad alias. |
| `amidon de millet` | 0 | 1 | The contiguous phrase occurs inside the French display; do not treat the projection as Québec naming approval. |
| `proso millet` | 2 | 3 | Existing grain and flour remain visible; a canonical starch display would add a third result. |
| `millet commun` | 2 | 3 | Current grain and flour both match; the hypothetical French display would add a third result. |
| `common millet` | 1 | 1 | The active grain remains the only result; the hypothetical display contains no English `common` phrase. |
| `farine de millet commun` | 1 | 1 | The existing flour remains the only result. |
| `panivaragu` | 1 | 1 | The existing grain alias remains the only result if no regional starch aliases are added. |
| `millet` | 20 | 21 | The hypothetical species-qualified display would join the existing broad millet results. |
| `starch` / `amidon` | 35 / 29 | 36 / 30 | The hypothetical qualified row would add one result to each broad starch query. |

If a future identity is reconsidered, do not add `proso starch`, `millet starch`, `amidon de millet`, `amidon de millet commun`, or regional crop-name aliases. The qualified canonical displays would already cover some of these phrases under the picker; broad aliases would add no product evidence and could obscure the current grain/flour boundary. Any later identity proposal needs a fresh picker review.

## Measurements, forms, and substitution limits

- Canadian-grown research isolates establish that proso-millet starch can be extracted, but the reported physical and molecular measurements describe lab samples and do not provide a consumer package or a volume measure. Annor et al. report properties across four Canadian-grown millet species, including proso, rather than a retail-grade specification. [S04]
- A 2020 food study isolates proso-millet starch using three methods and reports method-specific extraction yields of **69.00%**, **80.00%**, and **88.50%**. The traditional method’s higher yield is described as recovery of “not so pure” starch. These are extraction outcomes, not cooking yield or a catalog conversion. [S06]
- That study reports tapped-cylinder bulk densities of **1.52–1.78 g/mL** across the three extracted samples. Because the values depend on extraction method and lab handling, they do not support a shared `defaultDensity` or household cup conversion. The study’s intact-grain bulk densities (**0.52 g/mL raw; 0.75 g/mL polished**) are grain observations and must not be copied to flour or starch. [S06]
- The same paper tests proso starch in a specific pudding formulation, using corn-starch controls and mixtures with skim-milk powder; its 50:50 proso-starch-to-milk-powder formulation received an **85.74%** acceptability index. The experiment supports only that tested pudding system and ingredient/extraction conditions. It is not a general replacement ratio for corn, potato, tapioca, or other starches. The result belongs as bounded research, not an active global or contextual substitution rule. [S06]
- The bundled recipes contain no proso-starch ingredient line. Do not attach the study’s pudding mix to the corpus, derive a recipe link, or transfer the flour-only bread substitution findings in the existing ledger. Add no forms, preparation rules, yield data, density, unit mapping, or substitutions for this held identity. [S10]

## Exact proposed delta

**No JSON delta.** Keep proso-millet starch outside active references and the research ledger. Do not reserve `ingredient-ref-proso-millet-starch` or create a candidate record. Keep Section 04 B3 open.

Reconsider only when a current Canadian/Québec human-food source identifies a standalone proso-millet-starch product and a product-specific Québec French term is supported by a Québec label or independent terminology review. Future numeric fields or substitutions would need product-specific household measurement evidence or replicated culinary replacement evidence; the cited extraction and pudding study do not meet that bar for reusable catalog data.

## Source register

Sources were reviewed on 2026-10-15. Source IDs are local to this proposal and are not research-ledger entries.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S01** | Office québécois de la langue française, [*millet commun* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), updated 2010. | Gives **millet commun**, **millet**, and **mil** as preferred French plant terms; lists **common millet**, **proso millet**, and other English names, plus *Panicum miliaceum*. This is crop terminology, not a starch product name. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S02** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. | Prefers **amidon** for the general starch term and distinguishes **fécule** as more specific to starch in tubers or other underground plant organs. It does not define proso starch or attest **amidon de millet commun** as a product term. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S03** | Québec Amérique, [*Millet, teff et sorgho*](https://www.quebec-amerique.com/index.php?controller=attachment&id_attachment=41), pp. 285–286. | Identifies **millet commun** as *Panicum miliaceum*, distinguishes **millet des oiseaux** (*Setaria italica*), and gives general grain/flakes/flour buying context. It is a Québec French-language food guide, not a current species-specific starch package label. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S04** | George Amponsah Annor et al., [“Physical and Molecular Characterization of Millet Starches”](https://doi.org/10.1094/CCHEM-08-13-0155-R), *Cereal Chemistry* 91(3), 2014, 286–292. | Primary study of starch from Canadian-grown pearl, foxtail, proso, and finger millet. Establishes a Canadian research fraction and lab properties; it does not establish a retail grade, household measure, or recipe substitution. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S05** | Shastha Canada, [*Proso Millet 500g*](https://shasthacanada.com/products/proso-millet). | Canadian-facing product page names **Proso Millet** and lists **Proso Millet** as the ingredient. It is a grain product; net package mass is not a kitchen measure or evidence for extracted starch. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S06** | Hemant Zodge, Pushpa Bharati, and Sarojani J. Karkannavar, [“Development of proso millet (*Panicum miliaceum*) incorporated pudding mix”](https://journaloffarmsciences.in/index.php/JFM/article/download/214/259), *Journal of Farm Sciences* 33(4), 2020, 526–530. | Primary study extracts starch by chemical, sedimentation, and traditional methods; reports method-specific yield, tapped bulk density, and a pudding formulation compared with corn-starch controls. Its sample protocol and sensory system are not a general household conversion or replacement rule. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S07** | Spice Divine, [*Farine de millet S&V Proso 2 lb*](https://spicedivine.ca/fr/products/sv-proso-millet-flour-2lb), French-facing Canadian product page. | Names proso-millet flour and uses **farine de millet commun** in product copy. Supports the adjacent flour identity and wording only, not standalone starch availability or a Québec-endorsed starch term. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S08** | Metro, [*Millet décortiqué biologique La Milanaise 500 g*](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/millet-decortique-biologique/p/627062300550). | Québec retail listing for decorticated millet. It does not identify the species as proso and does not list starch; current store availability varies. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S09** | Office québécois de la langue française, [*amidon de céréales* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287239/amidon-de-cereales). | Defines cereal starch as an industrial product obtained by wet extraction from cereal grains. It supports the technical distinction between grain and extracted starch, but does not provide a proso-specific product name. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S10** | Read-only repository audit: [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [ledger](../research-ledger.v1.json), [legacy identities](../legacy-import-identities.v1.json), and [recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json). | Supports the active grain/flour ownership, absent starch reference/form/candidate/legacy identity, current catalog counts, and full recipe scan counts only. It is not external product or scientific evidence. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S11** | Related archive: [R139 pearl-millet starch review](wp02-section-04-b3-pearl-millet-starch-boundary-review-r139-20261015.md), [R142 foxtail-millet starch review](wp02-section-04-next-starch-gap-review-r142-20261015.md), [R143 finger-millet starch review](wp02-section-04-b3-finger-millet-starch-product-boundary-hold-r143-20261015.md), and [open B3 plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2209). | Confirms the neighboring species-specific decisions and the open parent. Those prior reviews mention proso only as comparison context; none reviewed proso starch as a standalone product candidate. |
| **WP02-B3-PROSO-MILLET-STARCH-R144-20261015-S12** | Bounded Canadian/Québec product search on 2026-10-15; included Canada-qualified `proso millet starch`, French `amidon de millet commun` and `amidon de millet proso`, and retailer-scoped product queries. | Search non-discovery only: reviewed results showed research, grain, and flour material but no standalone Canadian human-food proso-starch package or supplier page. This does not prove no such product exists. |

This is proposal-only static research. No app, Gradle, unit, instrumentation, emulator, or deployment tests were run. The project instructions waive tests for database-JSON-only additions; this hold changes no database data.
