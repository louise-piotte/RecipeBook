# WP02 B2 moth-bean flour — Québec naming and product-boundary hold

- **Reviewed:** 2026-10-12
- **Packet type:** flour identity and alias boundary review; documentation hold recorded on 2026-10-12
- **Scope:** Whether flour made from moth bean (*Vigna aconitifolia*) should receive a separate `FLOUR_AND_STARCH` identity, and whether any English or fr-CA flour phrases can be assigned without conflating it with whole moth beans, sprouted/cooked flour, or extracted starch.
- **Plan state:** WP02 Section B and the broader B2/B3 review remain open. The Section H whole-pulse identity is already integrated; its proposal explicitly leaves flour outside that seed identity.
- **Disposition:** the plan, roadmap, and hold README record this review. No catalog or ledger data changed; no tests were needed for this documentation-only hold.
- **Proposal-local source IDs:** `WP02-B2-MOTH-FLOUR-20261012-S01` through `WP02-B2-MOTH-FLOUR-20261012-S12`; checked against the live ledger and proposal/batch corpus before drafting.

## Recommendation

**Hold a new moth-bean-flour reference and all flour aliases pending a Québec French product name and clearer product scope.** Flour made from moth bean is directly attested in food-science research, an accessible Vancouver retail listing, and a manufacturer description. A Canadian menu names a 100 g product `Moth Bean Flour`; an Indian maker describes `Moth Atta` as ground moth beans / matki. These sources support the existence of a distinct flour product, not a single Canadian product specification. [S03–S05]

The Québec and Canadian French evidence establishes French names for the **whole bean**—`haricot papillon` / `haricots papillon` and the federal Translation Bureau term `haricot mat`—and a French crop profile describes the seeds being milled into flour. A fr-CA informational page also mentions making flour from haricots papillons, but it is not a product label or terminology authority. The bounded OQLF and product search found no current Québec/Canadian French flour label or OQLF flour entry. Keep literal compounds such as `farine de haricot papillon`, `farine de haricots papillon`, and `farine de haricot mat` as research wording, not catalog displays or aliases. [S06–S08, S10–S12]

Do not add flour wording to `ingredient-ref-moth-beans`. Preserve the existing whole-seed identity and its aliases. If a future source establishes a Québec French flour term and a consumer-product boundary, review a separate flour identity; keep sprouted and cooked flours qualified and keep isolated moth-bean starch separate. [S03, S09]

## Decision table

| Phrase or product | Disposition | Boundary |
|---|---|---|
| `moth bean flour` | **Hold as a separate candidate; do not allocate a reference.** | Direct sources show flour made from *V. aconitifolia*, but no reviewed Québec French flour label or common product-process specification was found. [S03–S08] |
| `moth atta`, `matki flour`, `matki atta` | Keep as research phrases; do not add as active aliases. | An Indian maker and marketplace listing attest these related terms, but they do not establish Canadian/Québec preferred names or that all terms denote one product specification. [S05] |
| `moth flour` | Do not add. | The phrase is less explicit than `moth bean flour`; it can lose the species/product boundary and is not needed to retrieve the Canadian listing. |
| `farine de haricot papillon`, `farine de haricots papillon`, `farine de haricot mat` | Keep unassigned pending Québec review or product-specific French evidence. | French sources attest the bean names and describe flour-making, but the bounded search found no current Québec/Canadian flour label or OQLF entry with these compounds. [S06–S08, S10–S11] |
| `moth beans / haricots papillon`; `moth bean`, `mat bean`, `matki`; `haricot mat`, `haricot papillon` | Retain on `ingredient-ref-moth-beans`. | The current identity denotes the food seed of *V. aconitifolia*, not flour. [S01–S02, S06–S07, S12] |
| Sprouted or cooked moth-bean flour | Keep distinct from an unqualified flour candidate; do not add terms to the whole-bean row. | A primary study prepared raw, sprouted, and cooked flours and measured differences in their functional properties. It does not establish those preparations as aliases or forms for a generic retail flour. [S03] |
| Moth-bean starch | Keep outside this flour decision and separate from whole-seed and flour terms. | A primary study isolates starch from moth beans by wet milling and alkali treatment; it is an extracted fraction, not evidence that `moth bean flour` means starch. [S09] |

## Plan overlap and review boundary

WP02 Section B’s alternative flour/starch checklist remains open. The existing Section H pulse work accepts `moth beans / haricots papillon` for the *V. aconitifolia* food seed and explicitly excludes flour; it is not a flour identity review. Searches of the current WP02 proposal and batch corpus for `moth bean flour`, `moth flour`, `moth atta`, `matki flour`, `matki atta`, and the proposed French compounds found no earlier WP02 flour decision. The WP02 pigeon-pea-flour and horse-gram-flour reviews cover other species, while the sprouted pearl-millet review covers another grain and process boundary. This proposal addresses only the moth-bean-flour boundary; it does not reopen those decisions or the integrated pulse identity. [S01, S03–S08]

## Proposal-time ownership audit

Snapshot at review time before later catalog additions: **1,256 active ingredient references, 94 ingredient forms, 66 legacy candidates, and 1,565 ledger records**. Counts are package observations only; this hold adds no shared records. See the [hold README](../batches/wp02-b2-moth-bean-flour-quebec-hold-20261012/README.md) for the current snapshot.

The active reference is:

| ID | Active display and aliases | Category and data | Attached forms |
|---|---|---|---|
| `ingredient-ref-moth-beans` | `moth beans / haricots papillon`; EN aliases `mat bean`, `matki`, `moth bean`; FR aliases `haricot mat`, `haricot papillon` | `LEGUME_AND_PULSE`; `defaultDensity: null`; `unitMappings: []` | None |

The 66-entry legacy candidate file has no moth-bean or moth-flour candidate. The live ledger has one exact moth-bean record, `ingredient-ref-moth-beans`, with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Its accepted decision scopes that record to the food seed and explicitly leaves flour outside; it is not a moth-flour research record. No distinct flour candidate record or flour-specific ledger evidence exists. [S01–S02, S06–S07, S12]

Exact normalized phrase ownership across all active reference displays/aliases, all form labels/match terms, and all legacy names/aliases:

| Exact phrase | Active owner | Form owner | Legacy owner | Ledger owner / interpretation |
|---|---|---|---|---|
| `moth beans`, `moth bean`, `mat bean`, `matki` | `ingredient-ref-moth-beans` display/aliases | None | None | `ingredient-ref-moth-beans`, whole seed only |
| `haricots papillon`, `haricot papillon`, `haricot mat` | `ingredient-ref-moth-beans` display/aliases | None | None | `ingredient-ref-moth-beans`, whole seed only |
| `moth bean flour`, `moth flour`, `moth atta`, `matki flour`, `matki atta` | None | None | None | No exact flour record |
| `farine de haricot papillon`, `farine de haricots papillon`, `farine de haricot mat` | None | None | None | No exact flour record |
| `Vigna aconitifolia` | None | None | None | Botanical name occurs in the whole-seed evidence; no flour-specific record |

The ownership audit confirms that none of the flour phrases belongs to the active pulse row, a form, or a legacy identity. Preserve that separation; do not put the flour phrases on the whole-bean reference merely to make them searchable.

## Picker phrase boundary

`IngredientReferenceSearchIndex` normalizes accents and punctuation, prefers a complete word phrase contained in an indexed term, and falls back to substring matching. At present, `moth beans`, `moth bean`, `mat bean`, `matki`, `haricots papillon`, `haricot papillon`, and `haricot mat` retrieve the whole-seed row. Full queries `moth bean flour`, `moth flour`, `moth atta`, `matki flour`, `matki atta`, and the three French flour compounds have no active match.

If a separate row is later accepted with display `moth bean flour`, the shorter query `moth bean` would match both the existing seed row and the longer flour display; `moth beans` would still match the plural whole-seed display. A future French display containing `haricot(s) papillon` would similarly make the shorter whole-bean phrase return both seed and flour results. A `matki flour` alias would also cause the shorter `matki` query to return both. These are related-product picker results; they are not grounds for merging flour into the seed row. Keep these potential result expansions explicit in any future naming decision.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned. The manifest-ordered recipe corpus fingerprint was `42e3a13c9b9a1630c85296b4dd65b57b7b849bb07171a02d238d3524944ae70a`.

The scan searched the bundled English/French title, description, instructions, and notes, plus ingredient-line `originalText`, `ingredientName`, and `ingredientRefId`, for `moth bean flour`, `moth flour`, `moth atta`, `matki flour`, `matki atta`, `moth beans`, `matki`, `mat bean`, `haricot mat`, `haricot papillon`, `haricots papillon`, the candidate French flour compounds, and *Vigna aconitifolia*. It found **zero recipe-language text matches**, **zero ingredient-line phrase matches**, and **zero recipe lines linked** to `ingredient-ref-moth-beans`.

The bundled corpus supplies no demand for this flour. That result does not measure demand in recipes outside the bundled package.

## Product, numeric, form, and substitution limits

- The Canadian Skip listing names `Moth Bean Flour (Gagan) (100 g)` at a Vancouver store. Its menu groups the item under “Retail - Lentil Flour,” which is a storefront category, not a botanical classification or proof of flour composition. The package size is a product amount, not a cup measure or density. [S04]
- The maker’s `Moth Atta` page describes its product as ground moth beans / matki, but it is an Indian product page and does not resolve a Canadian label, Québec French name, or universal seed preparation. The research study’s 200 g samples and 300 µm sieving describe laboratory methods, not household measures or retail requirements. [S03, S05]
- The study compares raw, sprouted, and cooked moth-bean flours and reports functional-property differences. Do not treat sprouted/cooked flour as an alias or infer one generic flour form from experimental samples. No forms should be attached to the active whole-pulse identity. [S03]
- No source supports a generic density, cup/spoon weight, unit mapping, flour yield, pulse-to-flour conversion, package yield, or dry-to-cooked conversion for this candidate. Do not activate numerical data from package size or lab methods. [S03–S05]
- Food use and study comparisons do not establish a substitution ratio for wheat, chickpea, lentil, pea, or another pulse flour. Add no global form conversion, recipe link, or contextual substitution. The whole-pulse ledger’s no-supported-substitute state applies to that seed product and must not be presented as a flour substitution study.
- The isolated-starch study uses a separate extraction process and conducts film research. Add no moth-starch alias, form, measure, food-use claim, or substitution under this flour review. [S09]

## Source register

Pages were accessed or rechecked on 2026-10-12. IDs are proposal-local and are not live ledger source IDs.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2-MOTH-FLOUR-20261012-S01** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Vigna aconitifolia*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:525283-1). Accepts the species and records the older *Phaseolus aconitifolius* synonym. | Taxonomic identity, not a Canadian product standard or flour specification. |
| **WP02-B2-MOTH-FLOUR-20261012-S02** | Canadian Food Inspection Agency, [English organic seed and grain extension codes](https://inspection.canada.ca/en/food-labels/organic-products/import-requirements/organic-ogd-codes-seeds-amp-grains/new-ogd-extension-codes-organic-seeds-and-grai) and [French version](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme). Lists *V. aconitifolia* as moth bean in grain and packaged/prepared grain codes. | Commodity-code evidence for the seed/grain product, not a flour identity or consumer-label specification. |
| **WP02-B2-MOTH-FLOUR-20261012-S03** | Medhe, Jain & Anal, [“Effects of sprouting and cooking processes on physicochemical and functional properties of moth bean (*Vigna aconitifolia*) seed and flour”](https://pmc.ncbi.nlm.nih.gov/articles/PMC6443815/), *Journal of Food Science and Technology* 56 (2019), 2115–2125, DOI [10.1007/s13197-019-03692-y](https://doi.org/10.1007/s13197-019-03692-y). Prepares raw, sprouted, and cooked flours and reports differences. | Primary laboratory study; its treatment, 200 g seed batches, and 300 µm sieving do not establish retail processes, Québec naming, household measures, or substitutions. |
| **WP02-B2-MOTH-FLOUR-20261012-S04** | OK Market, Vancouver, via SkipTheDishes, [store menu](https://www.skipthedishes.com/ok-market-5125). The English menu lists `Moth Bean Flour (Gagan) (100 g)`; the French-localized page retains the English product title. | Store-menu evidence for a Canada-facing phrase and listed pack amount; inventory, source-seed treatment, ingredient panel, species, and French product name are not stated. The storefront category “Lentil Flour” is not relied on as taxonomy. |
| **WP02-B2-MOTH-FLOUR-20261012-S05** | 15 Chawalwala, [Moth Atta](https://www.15chawalwala.com/products/moth-atta), and IndianTwist on Flipkart, [Pure Moth Bean Flour / Matki Atta](https://www.flipkart.com/indiantwist-pure-moth-bean-flour-gluten-free-high-protein-matki-atta-healthy-cooking/p/itmb6d4e638af51c). The maker describes its product as `100% Pure Ground Moth Beans (Matki)`; the marketplace title pairs moth-bean flour with `Matki Atta`. | Indian maker and marketplace evidence, not Canada/Québec naming. The seller descriptions do not establish that every moth flour/atta product uses the same process or seed grade. |
| **WP02-B2-MOTH-FLOUR-20261012-S06** | Health Canada, [Groupes de cultures et propriétés chimiques de leurs résidus](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html), lines 471–483 and 555–581. The French crop-group table uses `haricot papillon` for Vigna and includes it among dry-seed commodities. | Canadian regulatory crop grouping, not OQLF terminology or a flour label. |
| **WP02-B2-MOTH-FLOUR-20261012-S07** | Maxi Québec, [French Suraj product listings](https://www.maxi.ca/fr/search?productBrand=SU&search-bar=Suraj) and [French dried-bean aisle](https://www.maxi.ca/fr/alimentation/garde-manger/haricots-secs-l-gumes-et-grains/f-ves-s-ch-es/c/29913?page=2). Current listings use `Haricots papillon` for packaged whole beans. | Québec retail language supports the whole-bean term only; the page does not name flour. Listing availability and price vary by store and date. |
| **WP02-B2-MOTH-FLOUR-20261012-S08** | PROTA/Pl@ntUse, [*Vigna aconitifolia*](https://plantuse.plantnet.org/fr/Vigna_aconitifolia_%28PROTA%29). Its French species profile lists `haricot mat` and `haricot papillon` and says seeds are sometimes milled into flour for unleavened bread. | French-language crop-use profile, not a current Canadian/Québec product label or an OQLF ruling; it does not use a specific market flour name. |
| **WP02-B2-MOTH-FLOUR-20261012-S09** | Kumar, Ghoshal & Goyal, [“Moth bean starch (*Vigna aconitifolia*): isolation, characterization, and development of edible/biodegradable films”](https://pmc.ncbi.nlm.nih.gov/articles/PMC6828871/), *Journal of Food Science and Technology* 56 (2019), 4891–4900, DOI [10.1007/s13197-019-03959-4](https://doi.org/10.1007/s13197-019-03959-4). Separates starch from moth-bean seed using wet milling and alkali treatment. | Primary extraction/materials study; it does not establish a Canadian retail starch product or culinary measure. |
| **WP02-B2-MOTH-FLOUR-20261012-S10** | Nutrepedia, [Haricots papillon secs](https://nutrepedia.com/fr-ca/aliment/haricots-papillon-secs). The fr-CA informational page describes transforming haricots papillons into flour and using it in batters/snacks. | Secondary informational page with no visible product label, author credentials, or cited terminology authority; an indexed page could not be fetched directly at access. It is recorded as weak fr-CA wording evidence and does not establish a Québec display or alias. |
| **WP02-B2-MOTH-FLOUR-20261012-S11** | Office québécois de la langue française, [Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/). Site-indexed searches included `moth bean`, `farine de haricot papillon`, and `farine de haricot mat`; general Canada/Québec searches also included `moth bean flour`, `moth flour`, `moth atta`, `matki flour`, and `farine de haricots papillon`. No flour-specific OQLF entry or Québec/Canadian French flour label surfaced. | A bounded no-result search, not proof that no term exists in all OQLF records or other Québec sources. No phrase from the search is treated as an approved term. |
| **WP02-B2-MOTH-FLOUR-20261012-S12** | Government of Canada Translation Bureau, [*Vocabulary of Agriculture*, Terminology Bulletin 197](https://publications.gc.ca/collections/collection_2014/tpsgc-pwgsc/S52-2-197.pdf), 1990, p. 396. The bilingual entry gives `moth bean; mat bean — haricot mat; haricot à feuilles d’aconit`. | Historical federal terminology with older *Phaseolus aconitifolius* nomenclature; it supports a French seed term, not a flour product name or current Québec retail preference. |

## Disposition and reopening evidence

Record a proposal-level **hold** for moth-bean flour. Keep the verified `ingredient-ref-moth-beans` row and its current whole-seed aliases unchanged. Do not create `moth bean flour`, `moth atta`, `matki flour`, or literal French compounds as active names or aliases, and do not create a shared ledger candidate from this proposal alone. Reopen when a current Québec/Canadian French flour label or OQLF/TERMIUM entry supports the French product name, and a source identifies whether the in-scope product is raw-seed flour or another process-qualified flour. Until then, the English product evidence remains research evidence only.
