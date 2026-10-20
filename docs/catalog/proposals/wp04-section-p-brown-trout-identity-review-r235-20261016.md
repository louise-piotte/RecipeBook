# WP04 Section P — brown trout identity review (R235, 2026-10-16)

- **Review and source-access date:** 2026-10-16.
- **Packet type:** proposal-only species identity and picker-boundary review.
- **Recommendation:** add an identity-only `PROTEIN` reference for **brown trout / truite brune** (*Salmo trutta*). Keep the identity species-scoped, add only the precise source-backed aliases listed below, and do not imply that brown trout is a common Québec retail fish.
- **Proposed ID:** `ingredient-ref-brown-trout`.
- **Integration status:** Accepted and integrated as one identity-only `PROTEIN` reference and ledger record. No forms, active measurements, conversions, yields, recipe links, or substitutions were added. See the R235 batch README.
- **Verification:** Static seed-package, generated-catalog, ledger, picker, corpus, encoding, local-link, and scoped whitespace checks passed. No software tests or emulator checks were run because the change only adds database JSON data under `AGENTS.md`.

## Candidate and bounded scope

Brown trout is an unallocated named salmonid in the current catalog. The older WP04 finfish gap review explicitly says to keep brown trout (*Salmo trutta*) distinct from brook trout, rainbow trout, and Arctic char, but it did not propose a brown-trout reference. The live package now has separate brook-trout, rainbow-trout, lake-trout, smoked-trout, and canned-trout references, with no brown-trout identity. This review addresses only the named *S. trutta* ingredient identity; it does not reopen those accepted identities or the generic trout question.

The proposed identity is:

| Candidate ID | Category | English display | Québec French display | English aliases | French aliases | Species |
|---|---|---|---|---|---|---|
| `ingredient-ref-brown-trout` | `PROTEIN` | **brown trout** | **truite brune** | `German brown trout` | `truite d’Europe`; `truite allemande` | *Salmo trutta* |

The source-backed names identify one species. They do not establish a fresh, frozen, fillet, whole-fish, smoked, or canned state. Keep the existing species-neutral canned-trout and smoked-trout market identities separate; do not attach either product state to this species row.

## Identity, Québec naming, and food-market boundary

The OQLF GDT entry pairs preferred Québec French **truite brune** with English **brown trout** and Latin *Salmo trutta*. It also lists `truite d’Europe` as a preferred French term and `German brown trout` among the English translations. The current Gouvernement du Québec species page independently uses **truite brune / brown trout / Salmo trutta** and lists `truite allemande`, `truite Loch Leven`, and `truite fario` as other French names. ITIS reports *Salmo trutta* as a valid species and gives `brown trout` and `truite brune` as common names. [S01–S04]

The CFIA Fish List query returns TSN 161997, *Salmo trutta*, with **Brown Trout / Truite Brune**. CFIA explains that the Fish List provides English and French common names used for Canadian fish labelling and that scientific names are checked against ITIS. This is a Canadian food-labelling name and taxon match; the list is not a census of current retail stock. The separate unqualified `Trout` entries for *S. trutta* and other salmonids are further reason to keep `trout` and `truite` out of the stored alias fields. [S03; existing source `WP04-FINFISH-GAPS-20261010-S12`]

Québec market evidence supports a bounded identity but not a claim of broad table-fish availability. The current Gouvernement du Québec commercial-aquaculture portrait reports 2025 data, says Québec pisciculturists raise brown trout, and lists three general terrestrial-aquaculture markets: direct human consumption, stocking natural waters, and stocking fishing ponds. The page does not say which of those markets receives brown trout. Québec’s current consolidated aquaculture-and-fish-sales regulation names brown trout and authorizes sales under specified conditions, including when fish come from an aquaculture site or qualifying commercial/import sources. These sources establish permitted channels and current cultivation, not a current brown-trout retail SKU. [S05–S06]

The MAPAQ 2019 freshwater-aquaculture diagnosis is the clearest species-specific market breakdown located in this review. In its 2017 data, brown trout is grouped with other species for stocking; the table-market table names brook char, rainbow trout, and Arctic char, but not brown trout. The data is dated and cannot establish present-day absence. A targeted current Canadian/Québec retail search did not surface a consumer fish SKU specifically named brown trout; generic trout and rainbow-trout results do not establish brown-trout supply. This is a limited search, not proof that no such product is sold. [S07]

An older OQLF edible-fish entry for rainbow trout says that four Québec trout species, including brown trout, were reserved for recreational fishing and notes only two commercial exceptions. That 2011 terminology note should be read alongside the current regulation, which expressly permits certain sales from aquaculture and other qualified sources. The pair of sources does not justify a claim that brown trout is categorically unsellable; it does reinforce that retail availability is narrower and more conditional than the species name alone suggests. [Existing source `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01`; S06]

The recommendation is therefore limited to a **species identity**, not to a generic product-state or market group. The CFIA label name, matching taxon, current Québec species terminology, and legally permitted aquaculture supply support the row. No claim is made about current retail prevalence, commercial catch, origin, preparation, or recipe interchangeability.

## Alias and product boundaries

| Phrase | Disposition | Reason |
|---|---|---|
| `brown trout` / `truite brune` | Display pair | Directly paired by OQLF, Gouvernement du Québec, CFIA, and ITIS for *Salmo trutta*. |
| `German brown trout` | English search alias | OQLF lists it as an English term for the same species. It is not the display name. |
| `truite d’Europe` | French search alias | OQLF lists it as a preferred term for the same species; keep the normalized Québec display `truite brune`. |
| `truite allemande` | French search alias | Listed as another name on the current Gouvernement du Québec species profile. |
| `sea trout` / `truite de mer` | Do not store as aliases | OQLF lists these with brown trout, but the current Québec profile says some brown-trout varieties are anadromous. An OQLF entry on anadromous brook trout notes that `truite de mer` can also refer to migratory forms of other salmonids. The phrase is therefore an unsafe species-wide picker alias. [Existing source `WP04-P-BROOK-TROUT-20261012-S03`] |
| `truite Loch Leven` | Do not store as an alias | Québec lists it as another name, but it is a narrower named variety/strain. It is not needed to search the species-level bilingual display. |
| `truite fario` / *Salmo trutta fario* | Do not store as aliases | Sources connect the term with *S. trutta*, but it can denote a narrower form. Keep the species taxon and display unambiguous. |
| `trout` / `truite` | Do not store as aliases | CFIA applies unqualified `Trout` to several salmonid taxa, and the active picker already returns multiple trout references. The species display itself remains searchable as a substring. |
| `Salmo trutta` | Taxon evidence only, not an alias | The scientific name identifies the species but is not a common-name alias; no recipe or user-search evidence requires storing it. |
| Smoked and canned trout | Keep existing product-group identities separate | The active smoked-trout and canned-trout rows are market groups without a species assignment; this review does not assign either one to *S. trutta*. |

No substitution is implied among brown trout, brook trout (*Salvelinus fontinalis*), rainbow trout (*Oncorhynchus mykiss*), lake trout (*Salvelinus namaycush*), or Arctic char (*Salvelinus alpinus*). Keep their species identities distinct.

## Exact phrase, ID, archive, and source-namespace audit

The proposal-stage read-only snapshot from 2026-10-16 contains **1,627 ingredient references**, **122 forms**, **61 legacy-import candidates**, and **1,972 research-ledger records / 8,621 source entries / 7,308 distinct source IDs / 6,083 distinct source URLs**. The package manifest lists **114 recipe files and 1,123 ingredient rows**.

The audit followed the current search normalizer in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase and NFKD normalization, folding of `œ`, `æ`, and `ß`, removal of diacritics, punctuation-to-space conversion, and whitespace collapse. It compared the proposed display names and aliases, rejected terms, taxonomy, and IDs against active reference names/aliases, form labels/match terms, legacy identities, and ledger record IDs.

| Key / namespace | Existing exact owner | Finding |
|---|---|---|
| `brown trout`; `truite brune`; `German brown trout`; `truite d’Europe`; `truite allemande`; `truite Loch Leven`; `truite fario`; `truite de mer`; `sea trout`; `Salmo trutta` | None among active names/aliases, form labels/match terms, legacy candidate names, or ledger record IDs. | Proposed canonical pair and aliases are unallocated. The rejected names are likewise not owned as exact searchable keys. |
| `ingredient-ref-brown-trout`; `ingredient-form-brown-trout`; `candidate-brown-trout` | None among references, forms, legacy candidates, or ledger record IDs. | The identity ID is available; no form or legacy candidate is proposed. |
| `WP04-SECTIONP-BROWN-TROUT-R235-20261016-S01`–`S07` | No ID with this proposal prefix in the proposal-stage ledger snapshot. | Root registered new source IDs for S01–S04 and S06–S07; S05 uses the exact existing R136 source ID for its URL. |
| New source URLs for S01–S04 and S06–S07 | No exact URL owner in the proposal-stage ledger snapshot. | Root registered each distinct URL once in the accepted brown-trout record. |
| Current MAPAQ commercial-aquaculture portrait URL | Existing exact URL owner: `WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S01`. | Root reused that existing source ID as brown-trout evidence rather than creating a second source ID for the same page. |
| OQLF rainbow-trout entry, CFIA common-name guidance, and OQLF anadromous-brook-trout entry | Existing exact URL owners include `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01`, `WP04-FINFISH-GAPS-20261010-S12`, and `WP04-P-BROOK-TROUT-20261012-S03`. | Reuse the relevant existing IDs for these boundary notes. |

The archive search found one older sibling-species mention in [`wp04-section-p-next-fish-gap-review-20261012.md`](wp04-section-p-next-fish-gap-review-20261012.md): it says to keep brown trout distinct from brook trout, rainbow trout, and Arctic char. It is not a focused brown-trout identity, alias, or product-boundary review. No prior focused promotion or hold was found. The live plan has no dedicated brown-trout checkbox; this is a named species gap within its remaining Section P finfish coverage. It is distinct from the R229 frozen-cooked-shrimp hold and R233 octopus-in-Galician-sauce product decision.

The phrase `truite de mer` also appears in the accepted brook-trout ledger record as an exclusion, not as an alias owner. It is retained here only as a naming-boundary term; the existing source explains its broader anadromous use. [Existing record `ingredient-ref-brook-trout`, source `WP04-P-BROOK-TROUT-20261012-S03`]

## Picker projection

Projection uses the live phrase-first/substring matching rules and current reference/form search terms. Only the canonical pair and the three aliases in the proposed table are included in the hypothetical row.

| Search | Current result | With proposed row | Disposition |
|---|---|---|---|
| `brown trout`; `truite brune` | No result | `ingredient-ref-brown-trout` only | Exact species searches become available. |
| `German brown trout`; `truite d’Europe`; `truite allemande` | No result | `ingredient-ref-brown-trout` only | Each retained precise alias resolves to the proposed species. |
| `trout` | `ingredient-ref-brook-trout`, `ingredient-ref-canned-trout`, `ingredient-ref-lake-trout`, `ingredient-ref-rainbow-trout`, `ingredient-ref-smoked-trout` | Same five plus `ingredient-ref-brown-trout` | Broad English query remains plural and shows species and product choices. |
| `truite` | `ingredient-ref-brook-trout`, `ingredient-ref-canned-trout`, `ingredient-ref-rainbow-trout`, `ingredient-ref-smoked-trout` | Same four plus `ingredient-ref-brown-trout` | Broad French query remains plural. |
| `sea trout`; `truite de mer`; `truite Loch Leven`; `truite fario`; `Salmo trutta` | No result | No result | Terms remain unassigned because they are form-specific, narrower, or scientific rather than common-name aliases. |
| `brown` | 12 brown-named references | Same 12 plus `ingredient-ref-brown-trout` | The short query becomes noisier but remains a broad multi-result query; use the complete name to select this fish. |

The proposed row does not make a generic trout query resolve to a single species. The picker still presents the existing species-specific and product-group choices alongside brown trout.

## Bundled-recipe demand

All **114 manifest-listed recipe files** and all **1,123 `ingredients[]` rows** were scanned for `brown trout`, `truite brune`, the proposed precise aliases, rejected trout terms, *Salmo trutta*, and broad `trout` / `truite` wording. The scan found **zero matching recipe files and zero ingredient-row hits**. The manifest-ordered corpus digest is `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`.

No recipe link, ingredient quantity, or demand-based form is proposed. Absence of bundle demand limits the recipe and measurement conclusions; it does not override the source-backed species identity.

## Forms, measures, conversions, and substitutions

- **Forms:** Add none. The proposed row is the species-level ingredient identity; no evidence establishes a reusable fresh, frozen, whole, fillet, smoked, or canned form for *S. trutta*.
- **Measures and package data:** Add none. The Québec species profile reports biological body length and weight ranges, not recipe portions or package sizes. Do not convert those observations into kitchen measures.
- **Density and unit mappings:** Add none. No source provides a transferable density or volume-to-mass mapping for brown-trout flesh.
- **Conversions and yields:** Add none. The reviewed sources provide no cooking, thawing, trimming, drained-weight, or yield relationship.
- **Substitutions:** Add none. No recipe- and method-specific evidence supports substituting brown trout for another trout, char, salmon, or fish identity.

## Final recommendation

Advance **`ingredient-ref-brown-trout`**, category `PROTEIN`, with display **brown trout / truite brune**, English alias **German brown trout**, and French aliases **truite d’Europe** and **truite allemande**, scoped to *Salmo trutta*. Keep `sea trout / truite de mer`, broad `trout / truite`, `truite Loch Leven`, `truite fario`, and the taxonomic name out of the alias arrays. Keep all forms, measures, density, mappings, recipe links, conversions, yields, and substitutions empty.

This is an identity-only coverage addition. The name and taxon are supported by Québec and Canadian primary authorities, and Québec aquaculture and sale sources establish that the species is raised and can enter lawful sale channels. Current evidence does not establish brown trout’s present share of the Québec table-fish market or a current consumer SKU. The review therefore makes no retail-prevalence or sourcing claim and does not treat the 2017 market data as current.

## Source register

Sources were accessed on 2026-10-16. The short R235 citation keys (`S01`–`S07`) are proposal-local cross-references; the prefixed IDs in the source table are ledger allocations for newly registered URLs, while existing exact URL owners are reused where shown.

| Citation key / ledger owner | Source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-BROWN-TROUT-R235-20261016-S01` | Office québécois de la langue française, [truite brune (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357619/truite-brune). | Pairs preferred `truite brune` with English `brown trout` and *Salmo trutta*. Lists `truite d’Europe` and `truite de mer` as preferred French terms, and `German brown trout` and `sea trout` in English. Last updated 2004; terminology evidence, not current product availability. |
| `WP04-SECTIONP-BROWN-TROUT-R235-20261016-S02` | Gouvernement du Québec, [Truite brune](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/truite-brune). | Current page (updated 2026-10-02) gives `truite brune / brown trout / Salmo trutta`, alternate French names, freshwater/anadromous behavior, and recreational stocking. It does not establish food retail availability or recipe measures. |
| `WP04-SECTIONP-BROWN-TROUT-R235-20261016-S03` | Canadian Food Inspection Agency, [Fish List query for Brown Trout](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Brown%20Trout). | Returns TSN 161997, *Salmo trutta*, `Brown Trout / Truite Brune`, and a separate generic `Trout` entry. Fish List common-name evidence for Canadian labelling; the list was modified 2023-09-18 and is not a live product census. |
| `WP04-SECTIONP-BROWN-TROUT-R235-20261016-S04` | Integrated Taxonomic Information System, [*Salmo trutta* report, TSN 161997](https://itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=161997). | Reports a valid species and common names `brown trout` and `truite brune`. Taxonomy and names; no market or recipe evidence. |
| `S05` (existing ledger owner: `WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S01`) | Gouvernement du Québec, [Portrait de l’aquaculture commerciale](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-aquaculture-commerciale). | Current page reports 2025 data, says Québec pisciculturists raise brown trout, and lists the general table-consumption and stocking markets. It does not tie brown trout to one market. Root reused the exact URL owner in the brown-trout record rather than creating a duplicate source ID. |
| `WP04-SECTIONP-BROWN-TROUT-R235-20261016-S06` | Éditeur officiel du Québec, [Règlement sur l’aquaculture et la vente des poissons, C-61.1, r. 7](https://www.legisquebec.gouv.qc.ca/fr/pdf/cr/C-61.1,%20R.%207.pdf). | Current consolidated PDF was current to 2026-04-01. Article 30 names *Salmo trutta* and specifies conditions under which fish in the listed species group may be sold, including from aquaculture sites and qualifying imported or commercial sources. Legal permission is not evidence of a current retail listing or sales volume. |
| `WP04-SECTIONP-BROWN-TROUT-R235-20261016-S07` | MAPAQ, [Portrait-diagnostic sectoriel sur l’aquaculture en eau douce au Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/agriculture/types-de-productions/ED_portrait_diagnostic_industrie_aquaculture_eau_douce_MAPAQ.pdf) (2019 report; 2017 production data). | Identifies brown trout as an aquaculture species and groups it under “other” stocking fish; it is not named in the 2017 table-market production table. Dated snapshot; cannot establish 2026 absence or present retail practice. The PDF is linked from the current Gouvernement du Québec commercial-aquaculture portrait. |
| `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01` *(existing source ID reused)* | OQLF, [truite arc-en-ciel (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel). | Its 2011 note describes Québec trout-species recreational-fishing context and commercial exceptions. Read alongside the current sale regulation; not current product-availability evidence. |
| `WP04-FINFISH-GAPS-20261010-S12` *(existing source ID reused)* | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Defines the CFIA Fish List’s Canadian common-name/label purpose and scientific-name verification with ITIS. Food-labelling guidance, not a recipe or market-volume source. |
| `WP04-P-BROOK-TROUT-20261012-S03` *(existing source ID reused)* | OQLF, [omble de fontaine anadrome (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199920/omble-de-fontaine-anadrome). | Explains anadromous brook trout and that `truite de mer` may name migratory forms of other salmonids. Supports excluding `sea trout / truite de mer` as a species-wide alias. |
| `R01` *(proposal-local audit record)* | Read-only audit of the [live plan](../../RecipeBook-global-ingredient-catalog-plan.txt), [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), manifest recipes, proposal/batch archive, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Checked exact phrase/ID/source URL ownership, sibling trout references, picker projection, and recipe-corpus demand. No shared file was changed. |

## Proposal-stage static review record

- Read the live Section P plan, active references and forms, legacy identities, research ledger, and proposal/batch archive before selecting the candidate.
- Confirmed the R235 proposal filename and source-ID prefix were available. R231, R232, R233, and R234 were already in use or reserved in the shared archive, so this review uses R235.
- Checked normalized names, aliases, form terms, legacy IDs/text, ledger record IDs, candidate IDs, source-ID prefix, and exact source URL ownership. No existing Brown-trout allocation or focused review was found.
- Projected specific and broad EN/FR picker searches with the proposed row and retained aliases; broad `trout` and `truite` queries remain multi-result.
- Scanned the current 114 manifest-listed recipe files and 1,123 ingredient rows for the species names, aliases, rejected terms, and generic trout wording; found no matching file or ingredient row.
- At the end of the proposal-only research stage, no shared files had been changed and no application, package, deployment, or emulator checks had been run. Root later integrated the accepted row and performed the static checks listed in the R235 batch README.
