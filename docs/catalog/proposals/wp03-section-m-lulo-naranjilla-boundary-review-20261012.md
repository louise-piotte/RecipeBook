# WP03 Section M: lulo / naranjilla identity boundary review — 2026-10-12

- **Recommendation:** accepted and integrated by root on 2026-10-12 as `ingredient-ref-naranjilla` plus one frozen-pulp form. The English and Québec French display are both `naranjilla`; `lulo` is a search alias in both languages. Taxonomic scope remains in the evidence ledger rather than the picker display. See `docs/catalog/batches/wp03-section-m-naranjilla-identity-form-integration-20261012/README.md`.
- **Scope:** edible fruit of *S. quitoense* and frozen fruit pulp sold as lulo/naranjilla. The pulp form describes product state only; it does not assert a universal formulation.
- **Review packet:** the research and ownership audit below support the integration. The canonical JSON, ledger, plan, roadmap, and generated index have since been updated by root; no recipes or application code changed.

## Evidence and disposition

Kew's Plants of the World Online treats *Solanum quitoense* as an accepted species, records food use, and lists both **lulo** and **naranjilla** among the names reported for it. USDA ARS GRIN and EPPO independently associate *S. quitoense* with French names including **morelle de Quito**, **naranjille/narangille**, and **orange de Quito**. The Office québécois de la langue française (OQLF) has a GDT entry with **naranjilla** as its headword and lists **naranjilla**, **naranrille**, and the spelling **morelle de Ouito** as privileged terms. That entry's 1988 Latin cross-reference is *Solanum quitoensis*; this review follows current Kew spelling *S. quitoense*. Use OQLF's headword `naranjilla` for the French display; keep the unusual older variants as source evidence, not default display text. [S01–S04]

The strongest Québec French product evidence found is Épicerie Tropica's current product page, which calls its item **pulpe de lulo congelée** and shows a price and add-to-cart control. Walmart Canada also lists frozen Canoa Lulo Fruit Pulp; it was marked out of stock at access and the seller-provided ingredient statement includes lulo and ascorbic acid, with a sulfite caveat. A Canadian frozen-fruit-pulp distributor's French listing pairs **Lulo (naranjilla)**, but its page could not be fetched directly during this review; that search-index result is corroborative only. As accessed on 2026-10-12, the Québec page had a price and add-to-cart control but no explicit stock-status field, Walmart was out of stock, and the Edmonton distributor page could not be fetched directly. This supports current Canadian product listing evidence, but verified in-stock availability is limited; no source reviewed here verifies fresh whole-fruit sales. [S05–S07]

**Québec terminology:** OQLF's GDT entry directly identifies `naranjilla` and gives `naranjilla`, `naranrille`, and `morelle de Ouito` as privileged terms. Its Latin cross-reference is *Solanum quitoensis*; this proposal uses Kew's currently accepted *S. quitoense* taxon spelling. The local retailer supports `lulo` as Québec French market wording, but OQLF's headword is the better default display. [S01, S04–S05]

The name **lulo** needs a limit: Kew also lists `lulo` as a Colombian common name for the different accepted species *Solanum pseudolulo*, along with `lulo de perro` and `lulo pequeño`. The Québec retailer names lulo; the Canadian distributor listing pairs **Lulo (naranjilla)**, which supports `lulo` as a culinary alias for the *S. quitoense* product in this catalog. Do not add `lulo de perro`, `lulo pequeño`, or `pseudolulo`; if a separate *S. pseudolulo* food identity is later reviewed, revisit the unqualified `lulo` alias and let the picker show both rows where the evidence requires it. [S01, S05, S07–S08]

The active catalog already has separate, species-scoped owners for sea buckthorn, mamey sapote, black sapote, white sapote, baobab fruit pulp, maqui, and cocona. In particular, `ingredient-ref-cocona` is **cocona / *Solanum sessiliflorum***. Keep that row separate even though FAO Ecocrop's broad common-name list for *S. quitoense* also includes `cocona`; its own longer list mixes several common names, so it is not safe synonym evidence for these distinct species. Do not add cocona, cubiu, topiro, or any sapote/baobab/maqui/sea-buckthorn name as a lulo alias. [S09–S12]

I recommend integrating the identity and the narrow frozen-pulp form. The local and national product listings establish real Canadian culinary naming and a specific frozen pulp state; the form improves the picker for the actual Québec product wording. The bundle has no recipe demand, so add no recipe link or quantity inference. Keep measurement, density, yield, and substitutions empty.

**Open-checklist fit:** `docs/RecipeBook-global-ingredient-catalog-plan.txt` still leaves Section M/N/P product/species identities, independent Québec terminology, and evidence-backed measurement/substitution work open in its 2026-10-09/10 continuation blocks (current unchecked bullets around lines 6898, 6919, and 6956). The prior Section M regional-fruit follow-up explicitly left lulo/naranjilla as a separate *Solanum* question. This packet addresses one bounded identity/name question only; root decides whether to amend the plan after review. [S09]

**Non-overlap:** this proposal is separate from the active sea-buckthorn, cocona, sapote, baobab, and maqui owners; the existing `ingredient-ref-citrus-zest`; and the Section M dried-fruit product work. It adds no citrus or dried-fruit identity, shared alias, form, recipe link, or numeric data.

## Proposed identity and product boundaries

| Field | Proposed value |
|---|---|
| Candidate ID | `ingredient-ref-naranjilla` |
| Category | `FRUIT` |
| English display | `naranjilla` |
| Québec French display | `naranjilla` |
| English aliases | `lulo` |
| French aliases | `lulo`, `naranrille`, `morelle de Quito` |
| Density / unit mappings | none |
| Forms | one frozen fruit-pulp form, as below |
| Recipe links | none |
| Measurement, conversion, yield, or substitution data | none |

Keep the reference scoped to the edible fruit of *S. quitoense*. The proposed form is frozen fruit pulp; it is not a recipe yield, brand formula, or endorsement of every product sold under the name.

| Boundary term / product | Disposition |
|---|---|
| `lulo` / `naranjilla` | Same proposed culinary fruit identity only when used for *S. quitoense*; the Canadian product sources and OQLF's species entry support the names. |
| `lulo de perro`, `lulo pequeño`, *S. pseudolulo* | Exclude. Kew records a distinct food species that also has lulo-related common names. |
| `cocona`, `cubiu`, `topiro`, *S. sessiliflorum* | Keep the existing cocona identity separate. Do not reuse the conflicting broad common-name list as aliases. |
| `morelle de Quito` | Include only as a French search alias; USDA ARS and EPPO record it for this species, while the OQLF entry itself oddly spells it `morelle de Ouito`. Keep `naranjilla` as the French display. |
| `orange de Quito`, `Quito orange`, `toronja`, `citrus` | Do not add these aliases. Orange/toronja wording can collide with ordinary citrus searches. Sour or citrus-like flavor is not citrus identity. |
| Sea buckthorn / argouse, sapotes, baobab pulp, maqui | Retain the current distinct active owners; no shared aliases or substitutions. |
| Lulo juice, nectar, diluted beverage, preserves, leaves, stems, seeds, extracts, dried fruit or powder | Keep outside this identity/form proposal. A prepared drink or processed product needs its own source-backed boundary. |

The retailer and distributor product pages describe frozen pulp; no source reviewed here verifies current Canadian fresh whole-fruit sales. Canadian availability evidence is limited to a Québec listing with no explicit stock field, a Walmart listing marked out of stock, and a distributor listing only available through a search-index snapshot. The reference remains a species identity, while the only proposed form reflects the product documented in Québec/Canada.

## Live ownership and package snapshot

Snapshot captured 2026-10-12 from the shared workspace. The reference and ledger files changed during parallel catalog work; these values are the post-update snapshot used for this review.

| File / corpus | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,279 references | `77f42f8abdab6d6320c0b6879144594dc2711d9d971f9e351d44f180bb1d09b3` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,587 records; 5,642 source entries | `6be08066986efae74e61f5110018a821341f20ea5f7e40423f50f45e8564e578` |
| Manifest-listed recipe corpus | 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The corpus fingerprint is SHA-256 over each manifest-listed recipe path, a NUL byte, its raw file bytes, and a NUL byte in manifest order. All other hashes are raw-file SHA-256 values.

Normalized exact-word and whole-phrase owner checks found no active reference, form, legacy candidate, or ledger record ID for `lulo`, `naranjilla`, `naranjille`, `naranrille`, `naranjillo`, `lulo pulp`, `naranjilla pulp`, `lulo de perro`, `morelle de Quito`, `orange de Quito`, *Solanum quitoense*, or *S. pseudolulo*. A raw substring search for `lulo` alone has false positives inside unrelated words such as `allulose`; those are not exact-word identity owners. Within the related *Solanum* set, the only exact active owner is the separate `ingredient-ref-cocona` record for *S. sessiliflorum*; its ledger record is marked identity `verified`, with measurement and substitution research still `not_yet_researched`. Earlier Section M work names this lulo/naranjilla identity question as separate and unresolved; it does not review or allocate it. See [the earlier Section M fruit follow-up](wp03-section-m-sapote-baobab-followup-20261010.md#regional-sweep-reconciliation).

| Existing owner | Current identity | Boundary |
|---|---|---|
| `ingredient-ref-sea-buckthorn-berry` | sea buckthorn berry / argouse | Different species and fruit; no alias. |
| `ingredient-ref-mamey-sapote` | mamey sapote (*Pouteria sapota*) / sapote (*P. sapota*) | Species-qualified sapote; no family alias. |
| `ingredient-ref-black-sapote` | black sapote (*Diospyros nigra*) / sapote noire (*D. nigra*) | Different genus and fruit. |
| `ingredient-ref-white-sapote` | white sapote (*Casimiroa edulis*) / sapote blanche (*C. edulis*) | Different species and fruit. |
| `ingredient-ref-baobab-fruit-pulp` | baobab fruit pulp (*Adansonia digitata*) | A separated dried pulp product, not a *Solanum* fruit. |
| `ingredient-ref-maqui-berry` | maqui berry (*Aristotelia chilensis*) / maqui du Chili | Different species and fruit. |
| `ingredient-ref-cocona` | cocona (*Solanum sessiliflorum*) / cocona (*S. sessiliflorum*) | Related genus, separate accepted species and catalog owner. |

## Actual picker behavior

`app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt` builds `IngredientReferenceSearchIndex` from all active references and forms. `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` folds case/accents/compatibility characters and punctuation, returns complete word-phrase matches first, then uses substring matching only when there are no phrase matches. A complete form phrase can be passed back as a form hint; partial queries do not select a form. The before/after table is a static simulation of that implementation, not an emulator result.

The static before/after comparison below follows that live implementation and the proposed reference/form terms:

| Query | Current result | With proposal | Picker effect |
|---|---|---|---|
| `lulo` | 2 results: `ingredient-ref-methylcellulose`, `ingredient-ref-sodium-carboxymethyl-cellulose` | `ingredient-ref-naranjilla` only | The current two results are substring false positives inside `cellulose`. The candidate's exact `lulo` name/alias wins the phrase-first pass and removes them. |
| `naranjilla` | no result | `ingredient-ref-naranjilla` | Unique species-scoped row, using the OQLF headword in both display languages. |
| `naranrille` | no result | `ingredient-ref-naranjilla` | OQLF-listed French variant resolves to the same row. |
| `morelle de Quito` | no result | `ingredient-ref-naranjilla` | Species-qualified French name from USDA ARS and EPPO resolves to the same row. |
| `lulo fruit pulp` | no result | `ingredient-ref-naranjilla` | Complete form phrase selects the fruit row and carries the pulp form hint. |
| `naranjilla pulp` | no result | `ingredient-ref-naranjilla` | Source-backed English form term selects the same fruit row with a form hint. |
| `pulpe de lulo congelée` | no result | `ingredient-ref-naranjilla` | Exact Québec product wording selects the row and frozen-pulp form. |
| `pulpe de naranjilla congelée` | no result | `ingredient-ref-naranjilla` | Proposed French match term selects the same row and form hint. |
| `lulo de perro` | no result | no naranjilla result | The longer phrase does not match the proposed alias `lulo`; the separate species is not silently folded in. |
| `cocona` | `ingredient-ref-cocona` | unchanged | Existing species-specific owner remains distinct. |
| `maqui`, `sea buckthorn`, `argouse` | their current distinct owners | unchanged | No alias changes or cross-linking. |
| `orange de Quito` | no result | no naranjilla result | No citrus-adjacent alias is added. |

The `lulo` exact result is useful for current Québec-market wording, but the Kew *S. pseudolulo* record is a real future ambiguity. If that species is later added, let the shared `lulo` query return both qualified rows or narrow the alias based on the actual product text; do not collapse the species.

## Full bundled recipe-demand scan

Read all 114 recipe files listed in the live manifest: **1,123 ingredient rows**. The scan checked each ingredient row and every parsed recipe field, including original ingredient text, normalized name, reference/form IDs, preparation, and nested notes; it also checked complete serialized recipe text. Whole-phrase terms included `lulo`, `naranjilla`, spelling variants, *Solanum quitoense*, *S. pseudolulo*, `lulo pulp`, `naranjilla pulp`, `pulpe de lulo`, `cocona`, *S. sessiliflorum*, `orange de Quito`, and related product terms.

| Candidate / boundary wording | Recipe rows |
|---|---:|
| Lulo/naranjilla fruit names and *S. quitoense* | 0 |
| Frozen pulp / lulo juice / naranjilla juice | 0 |
| Pseudolulo and lulo de perro | 0 |
| Cocona / *S. sessiliflorum* cross-terms | 0 |
| Direct candidate-linked rows | 0 |

No recipe changes or links follow from this review. General citrus, tropical-fruit, or dried-fruit recipes are not candidate demand.

## Measurement and substitution limits

- The Québec listing describes `2 x 200 mL` of frozen lulo pulp but separately gives a package weight of `0.5 kg`. The page does not explain that discrepancy or state whether the volume is a portion, package size, or merchandising field. Keep both as product-page observations only; derive no cup-to-gram conversion or density. [S05]
- Walmart Canada lists a different Canoa package as **397 g**, currently **out of stock**; its supplier-provided information lists lulo and ascorbic acid and warns it may contain sulfites. This is brand-specific label evidence, not a class-wide formula or measure. [S06]
- A Canadian distributor's cached French listing reports a 500 g pulp plus 1 L water yields approximately 1.5 L juice. That is a source-specific beverage-preparation instruction; the direct page fetch failed with a cache miss, so retain it as a limited lead and do not encode it as yield, density, or unit conversion. [S07]
- No stable cup/mass observation, serving mass, density, edible yield, freezing/thawing conversion, or unit mapping was found. Record all numeric/form research as `not_yet_researched` if integrated.
- Do not infer that an acidic or “citronnée” flavor makes lulo interchangeable with lemon, lime, passion fruit, cocona, or other tart fruit. Add no same-ingredient conversion, directed substitution, or recipe-line link.

## Precise possible integration delta

If accepted, add one identity-only reference and one frozen-pulp form. Add one `ingredient_reference` ledger record for the species identity with the relevant external identity/product sources S01–S08 and S10–S12; record source-specific terminology and product limits. Add no legacy candidate, recipe link, density, unit mapping, measurement observation, conversion, yield, or substitution rule. Keep all current Section M owners unchanged.

```json
{
  "id": "ingredient-ref-naranjilla",
  "nameEn": "naranjilla (Solanum quitoense)",
  "nameFr": "naranjilla (Solanum quitoense)",
  "aliasesEn": ["lulo"],
  "aliasesFr": ["lulo", "naranrille", "morelle de Quito"],
  "category": "FRUIT",
  "defaultDensity": null,
  "unitMappings": []
}
```

```json
{
  "id": "ingredient-form-naranjilla-frozen-pulp",
  "ingredientRefId": "ingredient-ref-naranjilla",
  "formCode": "pulp",
  "labelEn": "frozen lulo pulp",
  "labelFr": "pulpe de lulo congel\u00e9e",
  "prepState": "frozen",
  "matchTermsEn": ["lulo fruit pulp", "naranjilla pulp"],
  "matchTermsFr": ["pulpe de naranjilla congel\u00e9e"],
  "densityGPerMl": null
}
```

The form records the frozen pulp state only. Keep formulation, dilution, package size, and all conversions outside the shared form.

## Source register

Sources S01–S08 and S12 were accessed on 2026-10-12. S09 is the current project review. S10–S11 are sources retained from that 2026-10-10 review; direct retries on 2026-10-12 returned HTTP 418 for INACAL and timed out for Pl@ntUse, so they are cited only as prior cocona-boundary evidence. Source IDs S01–S08 were subsequently copied into the `ingredient-ref-naranjilla` research-ledger record; S09–S12 remain proposal context rather than active identity evidence.

| ID | Source | Supports / limit |
|---|---|---|
| **S01** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Solanum quitoense*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:820696-1/general-information). | Accepted species, reported lulo and naranjilla names, and food use. Names are compiled from cited Colombian and botanical datasets; this is not a Québec naming authority. |
| **S02** | USDA Agricultural Research Service, [GRIN-Global: *Solanum quitoense*](https://npgsweb.ars-grin.gov/gringlobal/taxon/taxonomydetail?id=101253). | Taxon and source-cited common names, including French `morelle de Quito`, `naranjille`, and `orange de Quito`, plus Spanish `lulo` and `naranjilla`. Supports terminology history, not Québec preference. |
| **S03** | European and Mediterranean Plant Protection Organization, [EPPO Global Database: *Solanum quitoense*](https://gd.eppo.int/taxon/SOLQU). | Species-qualified common-name table lists English `naranjilla`, French `morelle de Quito`, `narangille`, `orange de Quito`, and Colombian Spanish `lulo`; confirms the term variants, not culinary or Québec preference. |
| **S04** | OQLF, [Grand dictionnaire terminologique: *naranjilla*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18058934/naranjilla). | Québec French term entry. The headword and privileged terms include `naranjilla`; it also lists `naranrille` and `morelle de Ouito`. Its 1988 Latin cross-reference says *Solanum quitoensis*; this proposal uses Kew's accepted *S. quitoense* spelling. |
| **S05** | Épicerie Tropica, Québec City, [*Pulpa de lulo SAS*](https://epicerietropica.com/product/pulpa-de-lulo/). | Direct Québec French product wording `pulpe de lulo congelée`, product listing, $4.99, add-to-cart control, `2 x 200 mL`, and separate `0.5 kg` package-weight field. The page does not disclose formulation or explicit inventory status. |
| **S06** | Walmart Canada, [*Brar's Canoa Lulo Fruit Pulp*](https://www.walmart.ca/en/ip/Brar-s-Canoa-Lulo-Fruit-Pulp/6000197659916). | Canadian retail listing for Colombian frozen lulo pulp, 397 g; page marked out of stock on access. Supplier-provided ingredient text lists lulo and ascorbic acid and says it may contain sulfites; Walmart says the information is not separately verified. |
| **S07** | Latin Frozen Fruit Inc., Edmonton, [*Pulpe de Lulo (naranjilla) congelée*](https://www.latinfrozenfruits.com/fr/products/lulo). | Search-index snapshot showed a Canadian distributor listing, 250 g/500 g options, delivery in Edmonton, a 100% fruit-pulp claim, and a 500 g + 1 L water preparation yielding about 1.5 L juice. Direct page fetch returned a cache miss; treat as corroboration and product-specific wording only. |
| **S08** | Kew, [Plants of the World Online: *Solanum pseudolulo*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:239554-2/general-information). | Accepted different species, food use, and Colombian common names including `lulo`, `lulo de perro`, and `lulo pequeño`; establishes the unqualified-`lulo` ambiguity and alias boundary. |
| **S09** | RecipeBook, [WP03 Section M sapote/baobab/regional-fruit follow-up](wp03-section-m-sapote-baobab-followup-20261010.md#regional-sweep-reconciliation). | Project audit context records cocona as a distinct *Solanum sessiliflorum* identity and explicitly leaves lulo/naranjilla as a separate open question. |
| **S10** | Peru INACAL, [quality requirements for cocona](https://www.gob.pe/institucion/inacal/noticias/817509-inacal-brinda-requisitos-de-calidad-de-la-cocona). | Official Peruvian source cited by the earlier Section M review for cocona as *Solanum sessiliflorum* and fresh-fruit scope. Direct fetch returned HTTP 418 on 2026-10-12; cite as prior project evidence, not a newly verified page. |
| **S11** | Pl@ntUse, [*Solanum sessiliflorum*](https://plantuse.plantnet.org/fr/Solanum_sessiliflorum). | French-language plant-use reference cited in the earlier project review for cocona naming and edible-fruit scope; distinct from *S. quitoense*. A direct retry timed out on 2026-10-12. |
| **S12** | FAO Ecocrop, [*Solanum quitoense* crop profile](https://ecocrop.apps.fao.org/ecocrop/srv/en/cropView?id=1968). | Its broad common-name strings include `cocona` among many terms; this conflicting list is not used as taxonomic synonym evidence or to merge the existing cocona owner. |

The direct OQLF GDT page is positive Québec terminology evidence. The earlier TERMIUM Plus search attempts were inconclusive, so no claim about term absence in TERMIUM is used here. No broad FAO or older multilingual synonym list overrides the accepted *S. quitoense*, *S. pseudolulo*, or the existing cocona boundary.
