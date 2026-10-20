# WP03 Section K garland chrysanthemum identity review — R321

- **Status:** proposal only; no shared catalog, ledger, checklist, roadmap, generated file, or recipe was changed.
- **Plan item:** Section K, “Other regional greens and shoots discovered in the independent sweeps,” `docs/RecipeBook-global-ingredient-catalog-plan.txt:5296`.
- **Target:** one edible leafy-green identity for *Glebionis coronaria* (synonym *Chrysanthemum coronarium*), known locally as chrysanthème comestible and as shungiku; `tong ho` is also attested as a Cantonese name.
- **Disposition:** recommend bounded, identity-only integration as `ingredient-ref-garland-chrysanthemum`, category `VEGETABLE_AND_AROMATIC`.
- **Overlap check:** distinct from active besan review R319 and Bombay-duck review R320.

## Recommendation

Add one identity for the leafy vegetable *Glebionis coronaria*. Use **garland chrysanthemum** / **chrysanthème comestible** as the English and Québec French displays. The English display is attested by the Canadian seed seller and TERMIUM; the French display is the name used by a Québec Asian-vegetable grower for its leafy crop. TERMIUM lists **chrysanthème à couronnes** for the same species, which can be retained as a French alias rather than the local display.

Keep the identity scoped to the edible leafy green. Add the exact English alias `chrysanthemum greens`: both the Ontario profile and the species-specific culinary article use this qualified phrase for *Glebionis coronaria*. Do not merge the row with florist or garden chrysanthemums, chrysanthemum tea/flowers, feverfew, or other daisy-family greens. Do not activate the unqualified aliases `chrysanthemum` or `chrysanthème`. The crop pages also use `crown daisy` and `chop suey greens`; leave those out because they can retrieve broader flower or leafy-green meanings without a useful species qualifier.

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-garland-chrysanthemum` (unreserved) |
| Category | `VEGETABLE_AND_AROMATIC` |
| EN display | `garland chrysanthemum` |
| FR display | `chrysanthème comestible` |
| EN aliases | `chrysanthemum greens`, `edible chrysanthemum`, `shungiku`, `tong ho`, `tong hao`, `tung ho` |
| FR aliases | `chrysanthème à couronnes`, `shungiku`, `tong hao`, `tung ho` |
| Forms and recipe links | None |
| Density, unit mapping, conversion, yield, substitution | None |

The aliases are limited to spellings found in the cited Canadian, Québec, and culinary sources. `Chrysanthemum greens` is included as a source-exact edible-leaf phrase for this species. Keep `tong ho` as a narrow Cantonese romanized lookup alias: a culinary source explicitly maps it to the leaves of *Glebionis coronaria*, while Ontario's official vegetable profile corroborates the longer Cantonese name `Tong ho choy` for the corresponding crop. Do not add `Tong ho choy` as a second alias based on that corroboration alone. Do not add `kikuna`, `shungiky`, `crown daisy`, `chop suey greens`, bare chrysanthemum terms, flower/tea wording, or botanical names as picker aliases. Scientific names belong in the evidence record.

## Repository and ownership audit

I checked the current A–Z plan, active ingredient references and forms, legacy import candidates, research ledger, proposal and batch archives, package-yield data, substitution files, and all recipe files named by the live manifest. Exact normalized phrase checks covered `shungiku`, `shun giku`, `tong ho`, `tung ho`, `tong hao`, `garland chrysanthemum`, `edible chrysanthemum`, `chrysanthemum greens`, `crown daisy`, `chop suey greens`, `Chrysanthemum coronarium`, `Glebionis coronaria`, and the reviewed French phrases.

| Surface | Current snapshot / result |
|---|---|
| Active references | 1,675 rows; no exact target phrase or proposed ID owner |
| Active forms | 127 rows; no target phrase or match-term owner |
| Legacy candidates | 59; no target phrase or proposed ID owner |
| Research ledger | 2,022 records; no target identity, phrase, or R321 source-ID prefix |
| Proposal and batch archive | No focused garland-chrysanthemum / shungiku review or integration; exact candidate phrases and source prefix were absent |
| Recipe corpus | 114 manifest-listed files / 1,123 ingredient rows; zero full-file or ingredient-row matches for the candidate terms |
| Package yields and substitutions | No target entry |

The new proposal path and source-ID prefix `WP03-SECTIONK-GARLAND-CHRYSANTHEMUM-R321-20261016-S` were unoccupied before drafting. The current phrase-first picker can project each proposed complete display/alias to one new row. Because its search also matches a word inside a qualified display, a short query such as `chrysanthemum` or `chrysanthème` will retrieve that qualified row; the unqualified terms are not proposed as aliases, and the display itself retains the edible qualifier.

Audit fingerprints captured on 2026-10-16:

| File / corpus | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,675 | `36cb183971aeb13220db008a7a8d99fe0cb311666e8dd4ef9ed17df149d35377` |
| `ingredient-forms.v1.json` | 127 | `aa10345fa769bb94f7827d6b7eaa52be865d4e608deb726b23f035d6bfd50cb2` |
| `legacy-import-identities.v1.json` | 59 | `9167695ce41884213efb2dedc05fd3f4f56590a15c3add833239a43bf1a47fe8` |
| `research-ledger.v1.json` | 2,022 | `c1553997815494b711cbf75eded7131344f8d57754b29b9ef9aa4fbc00b7333f` |
| `manifest.v1.json` | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | `5eb08370218e2bcd11b9060ba52ac4188c4719a7a583f2e9944d73ad767ca5a3` |

## Evidence and naming boundaries

| ID | Source | Use and limits |
|---|---|---|
| `WP03-SECTIONK-GARLAND-CHRYSANTHEMUM-R321-20261016-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Glebionis coronaria*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:1013480-1), accessed 2026-10-16. | Kew accepts *G. coronaria* and lists it as used for food. This supplies the current taxonomic anchor; it does not choose a Québec food name. |
| `WP03-SECTIONK-GARLAND-CHRYSANTHEMUM-R321-20261016-S02` | Ontario Ministry of Agriculture, Food and Rural Affairs, [Edible Chrysanthemum](https://www.omafra.gov.on.ca/CropOp/en/spec_veg/leafy_veg/chry.html) and [Chrysanthème des jardins](https://www.omafra.gov.on.ca/CropOp/fr/spec_veg/leafy_veg/chry.html). | The official crop profile gives *Chrysanthemum coronarium*, common names including shungiku and tong hao, and culinary use of young tender leaves. Its English and French pages say they were last modified 2012-10-17; they support crop identity and terminology, not a claim of current retail availability. |
| `WP03-SECTIONK-GARLAND-CHRYSANTHEMUM-R321-20261016-S03` | Le Rizen, Québec Asian-vegetable grower, [Chrysanthème comestible](https://www.lerizen.ca/legumes/chrysantheme-comestible), accessed 2026-10-16. | Uses `chrysanthème comestible` as the page title, describes leaves grown specifically for food, and gives `chrysanthème à couronnes`, `shungiku`, and `tung ho` as names. The page footer displays © 2025. It does not give the botanical binomial. |
| `WP03-SECTIONK-GARLAND-CHRYSANTHEMUM-R321-20261016-S04` | Le Rizen, [À propos](https://www.lerizen.ca/a-propos), accessed 2026-10-16. | Identifies Le Rizen as a Frelighsburg, Québec producer of Asian vegetables for public markets, grocery stores, and restaurants; its current footer displays © 2026. This scopes S03 as Québec producer terminology, not an official language ruling or verified same-day stock listing. |
| `WP03-SECTIONK-GARLAND-CHRYSANTHEMUM-R321-20261016-S05` | Translation Bureau, Government of Canada, TERMIUM Plus, [Chrysanthème des jardins](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frr&lang=fra&srchtxt=CHRYSANTHEME+JARDINS), record dated 2019-12-23. | The indexed record pairs *Glebionis coronaria* / *Chrysanthemum coronarium* with English `garland chrysanthemum` and French `chrysanthème à couronnes`, `chrysanthème couronné`, and `chrysanthème des jardins`. The record is botanical terminology, not food-use evidence. Search returned these terms, but direct open failed with `Cache miss`; only the indexed record text was used. |
| `WP03-SECTIONK-GARLAND-CHRYSANTHEMUM-R321-20261016-S06` | Hundredfold Canada, [Garland Chrysanthemum Shungiku — Tong Hao](https://www.hundredfold.store/en-ca/products/hundredfold-garland-chrysanthemum-shungiku-1000-seeds-tong-hao-chop-suey-green-crown-daisy-non-gmo-aromatic-asian-green), accessed 2026-10-16. | The Ontario seed listing uses `garland chrysanthemum`, `shungiku`, and `tong hao` and describes the crop as an Asian green. It was marked sold out when reviewed and sells seeds, not fresh leaves; no seed package quantity or cultivation note is used as an ingredient measure. |
| `WP03-SECTIONK-GARLAND-CHRYSANTHEMUM-R321-20261016-S07` | The Woks of Life, [Stir-Fried Tong ho (Chrysanthemum Greens)](https://thewoksoflife.com/tong-ho-chrysanthemum-greens-stir-fry/), posted 2024-04-07, accessed 2026-10-16. | Directly identifies the leaves of *Glebionis coronaria* as `chrysanthemum greens` and says the vegetable is known as `tong ho` in Cantonese. This supports both the qualified English alias and the narrow Cantonese alias; it is culinary naming evidence, not Canadian/Québec market or official terminology evidence. |
| `WP03-SECTIONK-GARLAND-CHRYSANTHEMUM-R321-20261016-S08` | Ontario Ministry of Agriculture, Food and Rural Affairs, [Asian vegetables grown in Ontario](https://www.ontario.ca/page/asian-vegetables-grown-ontario) and [Légumes asiatiques cultivés en Ontario](https://www.ontario.ca/fr/page/legumes-asiatiques-cultives-en-ontario), accessed 2026-10-16. | The official profile's indexed text lists English `Chrysanthemum greens`, Latin *Chrysanthemum coronarium*, Cantonese `Tong ho choy`, Mandarin `Tong hao cai`, and cooked-vegetable use. This is official Canadian corroboration for the qualified English alias. The indexed page shows `Updated: September 26, 2024` (with `Published: July 05, 2022`); direct opens of both language pages returned `403 Forbidden`. Its Cantonese evidence supports only the longer dialect-qualified name, not bare `tong ho`. |

The Le Rizen food-use page plus the OMAFRA crop profile support the culinary leaf product. Kew and TERMIUM support connecting the current name *Glebionis coronaria* with older source terminology *Chrysanthemum coronarium*. The Québec French display is a producer-attested product name; TERMIUM provides the cross-Canada botanical French synonym `chrysanthème à couronnes`. Neither is presented as an OQLF-preferred term. `Chrysanthemum greens` is included because both S07 and S08 explicitly connect the qualified phrase to this edible species. `Tong ho` is retained as a Cantonese romanized lookup alias on the direct species-specific evidence in S07; S08 is official Canadian corroboration for the longer `Tong ho choy`, not for treating every related spelling or qualifier as a separate picker alias.

The names `chrysanthemum` / `chrysanthème` alone are intentionally excluded. TERMIUM notes these can denote the broader genus and *Chrysanthemum × morifolium*. OMAFRA also lists garden chrysanthemum among close relatives and describes ornamental use. The catalog row should therefore retain the species-qualified/edible display and avoid assigning flower, tea, florist, feverfew, or generic-daisy names to this leafy-green identity.

## Measurements, substitutions, and recipes

The reviewed sources give no household volume-to-mass amount, density, general serving measure, edible yield, or validated replacement ratio for the leafy ingredient. Seed counts, seed mass, cultivation time, harvest height, and storage duration are unrelated to ingredient measures and remain unused. No form, conversion, package-yield record, or substitution is proposed.

The full manifest-ordered recipe scan found zero exact or normalized matches for the candidate names and binomials. No recipe link or recipe edit is warranted. This is a catalog-coverage proposal, not evidence that the green has no culinary demand outside this bundle.

## Proposed ledger disposition

If approved, add the identity sources above and one identity decision for `ingredient-ref-garland-chrysanthemum`, recording the accepted taxon and the bounded leafy-green scope. Set no measurement observations or substitution findings; leave measurement and substitution research open. Keep any future product or amount evidence attached to its source-specific scope.

## Limitations and checks

- The Québec producer page supplies direct local naming and food-use context but not a scientific binomial or OQLF ruling. The English and French OMAFRA crop pages are official but show a 2012 last-modified date.
- S07 directly supports `chrysanthemum greens` and the narrow English lookup alias `tong ho`, but is a culinary publisher rather than a Canadian or Québec authority. S08 is an official Ontario source, but only its indexed entry was available in this review because both direct page opens returned `403 Forbidden`; its qualified `Chrysanthemum greens` wording is direct indexed support, and its `Tong ho choy` form is corroborative only.
- The TERMIUM page could not be opened directly on this review; its query result supplied the record details cited above. The proposed French display remains supported independently by the accessible Québec grower page.
- A Légis Québec search result also displayed `Chrysanthème des jardins | Glebionis coronaria, Glebionis spp.`, but direct French and English opens failed (French returned 502; English returned a cache miss). This inaccessible page is not used to establish the recommendation.
- Static checks only: source, active-data, archive, picker-semantics, and full-corpus inspection. No software tests, builds, emulator checks, or deployment were run for this proposal-only task.
