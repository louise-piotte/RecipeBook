# WP03 Section N follow-up — remaining culinary mushroom identities

- **Reviewed:** 2026-10-09
- **Status:** proposal only. This is the only file created for this research task; no catalog, ledger, recipe, plan, roadmap, code, or test file was changed.
- **Scope:** the ten named mushroom identities still open after shiitake, oyster, chanterelle, and morel were integrated: king oyster, enoki, shimeji, maitake, porcini, wood ear, snow fungus, straw mushroom, lion’s mane, and culinary truffles.
- **Plan state:** Section N remains open. This packet does not close its checklist.
- **Recommendation:** carry four source-supported identity candidates forward—king oyster, enoki, maitake, and culinary truffle. Hold the other six pending narrower identity and Québec terminology evidence. These are identity-only proposals; no forms, measurements, conversions, yields, substitutions, or recipe links are proposed.

## Relationship to the earlier mushroom review

The broader [WP03 named culinary mushroom review](wp03-culinary-mushroom-identities-review-20261009.md) established the ten candidate families and their unresolved boundaries. Its selected candidate IDs are reused here as proposal-local IDs; they are not active catalog rows. This follow-up refreshes the repository audit and narrows the recommendation to names with stronger Canadian or Québec source support. It does not repeat or change the already integrated shiitake, oyster, chanterelle, and morel records.

## Refreshed working-tree snapshot

Counts and SHA-256 values below describe the exact working-tree files read immediately before this proposal was written. The manifest-ordered recipe digest hashes each manifest-relative path, a NUL byte, the recipe’s exact bytes, and another NUL byte, in manifest order.

| Artifact | Count or state | SHA-256 or digest |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 618 references | `87220c5008d76b7f89f805e4cebe67d05e3729b9f8e5ae17c878c03763bf31d3` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `docs/catalog/research-ledger.v1.json` | 790 records; 1,288 source entries; 1,096 distinct source IDs | `97570bc5586dc066e7b2afe58362b4c79f6ad543c47fd1e2cae3f5b466e5fdfb` |
| `docs/catalog/legacy-import-identities.v1.json` | 88 candidates | `048ab0b0d99447ac3374af17ef6aa14681aa06f72fbe6c1139de78beffa984c8` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

## Audit findings

I checked `Requirements.md`, the global catalog plan’s Sections 01, 03, 06, 09, and Section N, the current active references and forms, all ledger records and legacy candidates, and every ingredient row in the 114 manifest-listed recipes. Search-key checks follow the app’s `normalizeIngredientSearchKey` behavior: lowercase, NFKD decomposition, folding `œ`, `æ`, `ß`, and `&`, stripping combining marks, replacing punctuation with spaces, and collapsing whitespace. I checked exact normalized phrases and the app’s partial-match fallback for the candidate names, transliterations, and Québec French terms.

| Area | Working-tree finding | Effect on this proposal |
|---|---|---|
| Active references | The relevant active identities are generic mushroom, ground dried candy-cap mushrooms, and the already integrated shiitake, oyster, chanterelle, and morel. Dried oyster, oyster sauce, and vegan oyster sauce are seafood/condiment records. None of the ten remaining candidate IDs or proposed exact display phrases is an active identity. | Preserve the four integrated species identities, generic mushroom, candy cap, and the non-mushroom oyster products as separate rows. All proposed IDs remain inactive. |
| Forms | None of the 33 form records has a named candidate mushroom term or a mushroom-specific product form. | Do not infer fresh, dried, powdered, canned, reconstituted, or other forms from this identity pass. |
| Research ledger | The 790-record ledger contains the integrated mushroom identities, but no record with any of the ten candidate IDs. `ingredient-ref-king-oyster-mushroom`, `ingredient-ref-enoki-mushroom`, `ingredient-ref-maitake-mushroom`, and `ingredient-ref-culinary-truffle` are absent. | Keep new evidence and source IDs in this proposal only. Do not update the shared ledger. |
| Legacy candidates | The 88-candidate file contains the duplicate generic `ingredient-ref-mushrooms` row and a separate `ingredient-ref-oyster-sauce` candidate; it contains none of the ten remaining named identities. | Do not revive the generic duplicate or treat the oyster-sauce candidate as an oyster mushroom. |
| Recipe rows | No scoped remaining candidate name or French/English synonym occurs in any of the 1,123 ingredient rows. The only mushroom ingredient rows are generic mushroom lines in recipes 037 and 089 plus the separate candy-cap line in recipe 100. | There is no recipe-line basis for a named candidate relink or any measurement/conversion claim. |

The current generic recipe lines are:

| Recipe line | Exact ingredient text | Current reference | Identity evidence |
|---|---|---|---|
| 037#7 | `1 lb white mushrooms, sliced` | `ingredient-ref-mushroom` | Generic wording does not identify button, king oyster, or another named mushroom. |
| 037#12 | `extra sauteed mushrooms, to taste` | `ingredient-ref-mushroom` | Generic add-in wording; it does not name a species. |
| 089#3 | `1/2 box mushrooms` | `ingredient-ref-mushroom` | Generic wording; no package content is specified in the line. |
| 100#2 | `7 g ground dried candy cap mushrooms` | `ingredient-ref-ground-dried-candy-cap-mushrooms` | Separate existing candy-cap ingredient, outside this tranche. The source line is recorded as written; no measure is inferred. |

The whole-recipe scan also found chocolate truffles as confectionery wording in recipes 057 and 112 and decorative meringue mushrooms in recipe 021. These are not ingredient-line requests for edible fungi.

## Candidate identities recommended for review

The existing mushroom reference category is `VEGETABLE_AND_AROMATIC`. Use that category for these candidates if accepted; it is the app’s catalog taxonomy, not a botanical classification.

| Proposal ID | English display | fr-CA display | Exact aliases proposed | Identity boundary and evidence |
|---|---|---|---|---|
| `ingredient-ref-king-oyster-mushroom` | king oyster mushroom | pleurote royal | EN: `king oyster`; FR: none beyond the display | The Québec product listing uses **Pleurote Royal** and calls the product **King Oyster**; CFIA lists pleurote and pleurote royal as separate fresh-mushroom terms [S04–S06]. Keep this market identity separate from the active oyster mushroom / pleurote en huître row. A food-texture paper identifies king oyster as *Pleurotus eryngii*, but the Québec product page gives no species; leave that product’s taxon unset rather than attaching the paper’s species to every local listing [S10]. Do not add `king trumpet` from this evidence. |
| `ingredient-ref-enoki-mushroom` | enoki mushroom | champignon enoki | EN: `enoki mushrooms`; FR: `champignons enoki` | Health Canada uses Enoki mushrooms in English and champignons enoki in French for the Canadian retail product [S07–S08]. Keep enoki as a cultivated market identity without a species assignment: the crop-group table uses the older *F. velutipes* label, while a later phylogenetic study separates East Asian cultivated enokitake as *F. filiformis* from European *F. velutipes* [S02–S03, S09]. Do not activate `enokitake` or `collybie à pied velouté` as universal aliases without product-specific Québec evidence. |
| `ingredient-ref-maitake-mushroom` | maitake mushroom | champignon maitake | EN: `maitake`; FR: `polypore en touffes` | Health Canada pairs maitake mushroom with *Grifola frondosa* in its English guide and gives **Polypore en touffes** for that species in its French crop-group list; an archived French guide also uses **Champignon maitake** [S02–S04, S15]. Keep the candidate to the culinary fruiting-body identity. Do not merge powder, extract, supplement, or mycelium products into this row. |
| `ingredient-ref-culinary-truffle` | truffle | truffe | None beyond the bilingual displays | OQLF gives the Québec French / English pair truffe / truffle and *Tuber* spp.; it also cautions that some fungi called truffles are not edible [S01]. Limit this candidate to edible culinary *Tuber* products and retain a named species when product evidence supplies one. Keep non-*Tuber* fungi, truffle oil/paste/salt, and chocolate confections outside this row. |

All alias spellings above are exact source terms or grammatical plurals evidenced by Canadian source wording. No broader aliases are proposed. An accepted row would still need normal package and alias-collision checks before integration.

## Candidates held for a narrower review

| Candidate | Reason to hold |
|---|---|
| Shimeji | The market label needs product-specific scope: Health Canada’s older table assigns separate terms and taxa, while current taxonomy recognizes *Hypsizygus marmoreus* and *H. tessellatus* [S02–S03, S11]. Do not set a universal species or add `bunashimeji` as a blanket alias. |
| Porcini | OQLF’s bolet entry lists porcini mushroom and *Boletus edulis*, but French `bolet` and `cèpe` cover broader groups [S12]. Reserve a narrow Bordeaux-cepe label for product-identified *B. edulis*; do not assign bare bolet or cèpe to porcini. |
| Wood ear | The English market term can refer to multiple *Auricularia* species. A Québec terminology entry pairs wood ear with oreille-de-Judas but gives no species, and molecular work distinguishes cultivated *A. heimuer* from *A. auricula-judae* [S13–S14]. Hold the French alias and species mapping. |
| Snow fungus | Health Canada identifies *Tremella fuciformis* as trémelle blanche / white jelly fungi [S02–S03], but this does not by itself establish a Québec market equivalence for every product sold as snow fungus. Keep the names unassigned until the product-language link is reviewed. |
| Straw mushroom | Health Canada uses Chinese mushroom / volvaire asiatique for *Volvariella volvacea* [S02–S03]. That is not enough to make all uses of `straw mushroom` an exact English alias or to settle the Québec retail display. |
| Lion’s mane | Health Canada’s list gives hydne hérisson and the English commodity term Pom Pom for *Hericium erinaceus* [S02–S03]. Review local packaging and the lion’s-mane wording before deciding which exact Québec French display and aliases belong to the culinary fruiting body. |

These are holds, not rejections; each remains a valid future identity candidate if the product and bilingual names can be bounded.

## Research sources

All links were checked on 2026-10-09. Source IDs are local to this proposal and were not added to the shared evidence ledger.

| Source ID | Source | What it supports and does not support |
|---|---|---|
| WP03-MUSHROOM-REMAINDER-20261009-S01 | OQLF, [truffe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082620/truffe). | Québec term `truffe`, English `truffle`, and *Tuber* spp.; notes that not every fungus called a truffle is edible. Terminology and scope evidence, not measurement evidence. |
| WP03-MUSHROOM-REMAINDER-20261009-S02 | Health Canada, [Residue Chemistry Crop Groups — English](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html). | Regulatory edible-fungi list includes maitake / *Grifola frondosa*, enoki / *Flammulina velutipes*, truffle / *Tuber* spp., and other relevant taxonomy. It is not a current retail synonym authority. |
| WP03-MUSHROOM-REMAINDER-20261009-S03 | Health Canada, [Groupes de cultures et propriétés chimiques de leurs résidus — français](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html). | Official Canadian French terms include `polypore en touffes`, `trémelle blanche`, `volvaire asiatique`, `hydne hérisson`, `truffe`, and `collybie à pied velouté`. Regulatory terms do not alone establish all retail aliases. |
| WP03-MUSHROOM-REMAINDER-20261009-S04 | Health Canada, [Guide de licence, French edition (archived)](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/dhp-mps/alt_formats/hpfb-dgpsa/pdf/prodnatur/license-licence_guide-fra.pdf). | Uses `champignon maitake` with *Grifola frondosa*. Archived federal French naming evidence. |
| WP03-MUSHROOM-REMAINDER-20261009-S05 | Aliments du Québec, [Pleurote Royal](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/pleurote-royal). | Québec producer listing pairs its `Pleurote Royal` product with `King Oyster`; the page does not identify the product’s species. |
| WP03-MUSHROOM-REMAINDER-20261009-S06 | CFIA, [fresh whole mushroom surveillance report](https://inspection.canada.ca/fr/salubrite-alimentaire-lindustrie/chimie-microbiologie-alimentaires/rapports-danalyse-articles-revues/microbiologie-aliments). | Canadian French category text lists enoki, shimeji, pleurote, and pleurote royal separately. It is surveillance wording, not a taxonomic or culinary synonym ruling. |
| WP03-MUSHROOM-REMAINDER-20261009-S07 | Health Canada / CFIA, [Imported raw Enoki mushrooms: safe food practices](https://recalls-rappels.canada.ca/en/alert-recall/imported-raw-enoki-mushrooms-what-you-need-know-safe-food-practices). | Current Canadian English retail name and broad product description for enoki. It does not identify each package to species. |
| WP03-MUSHROOM-REMAINDER-20261009-S08 | Health Canada / CFIA, [Champignons enoki crus importés : pratiques de salubrité](https://recalls-rappels.canada.ca/fr/avis-rappel/champignons-enoki-crus-importes-ce-que-vous-devez-savoir-sur-pratiques-salubrite). | Current Canadian French phrase `champignons enoki`; supports the local market wording, not a species synonym. |
| WP03-MUSHROOM-REMAINDER-20261009-S09 | Wang et al., [Phylogeny and species delimitation of *Flammulina*](https://link.springer.com/article/10.1007/s11557-018-1409-2), 2018. | Multilocus study separates cultivated East Asian enokitake (*F. filiformis*) from European *F. velutipes*. Taxonomy, not a claim about every retail package. |
| WP03-MUSHROOM-REMAINDER-20261009-S10 | Ogawa et al., [Compression properties of the fruit body of king oyster mushroom *Pleurotus eryngii*](https://doi.org/10.1111/j.1365-2621.2012.3126.x), 2012. | Scholarly food-texture article pairs king oyster mushroom with *P. eryngii*. It does not assign the Québec Pleurote Royal product to that species. |
| WP03-MUSHROOM-REMAINDER-20261009-S11 | Species Fungorum, [*Hypsizygus* species tree](https://www.speciesfungorum.org/names/TreeOfLife.asp?GenusRecordID=17844). | Current accepted-species listing for *H. marmoreus* and *H. tessellatus*, supporting caution around unqualified shimeji. |
| WP03-MUSHROOM-REMAINDER-20261009-S12 | OQLF, [bolet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296987/bolet). | Lists porcini mushroom / *Boletus edulis* while French bolet and cèpe are broader; supports the hold on broad aliases. |
| WP03-MUSHROOM-REMAINDER-20261009-S13 | OQLF GDT, [oreille-de-Judas](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423451/oreille-de-judas), Québec Amérique-authored entry. | Pairs wood ear with oreille-de-Judas without assigning a species; a terminology lead, not a species-wide alias decision. |
| WP03-MUSHROOM-REMAINDER-20261009-S14 | Wu et al., [Species clarification of cultivated Auricularia “Heimuer”](https://doi.org/10.11646/phytotaxa.186.5.1), 2014. | Molecular and morphological study distinguishes cultivated *A. heimuer* from European *A. auricula-judae*; supports keeping wood-ear product naming bounded. |
| WP03-MUSHROOM-REMAINDER-20261009-S15 | Health Canada, [Product Licensing Guidance Document, English edition (archived)](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/dhp-mps/alt_formats/hpfb-dgpsa/pdf/prodnatur/license-licence_guide-eng.pdf). | Uses `Maitake mushroom` with *Grifola frondosa*. Archived federal English naming evidence. |

## Next decision

An integration owner can take the four proposed identity rows to independent Québec French review and package collision checks. Keep Section N open for the six held terms, sea vegetables, other documented fungi, and all form and numeric work. No tests were run because this task was proposal-only.
