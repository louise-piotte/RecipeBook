# WP03 Section H — moth-bean identity and Québec display review

- **Reviewed:** 2026-10-11
- **Packet type:** proposal-only pulse identity review
- **Scope:** *Vigna aconitifolia* food identity, maturity/product boundary, bilingual Canadian and Québec naming, aliases, normalized-key collisions, current catalog/forms/legacy state, and all bundled recipe ingredient rows.
- **Write scope:** this proposal only. No shared catalog, ledger, plan, roadmap, code, test, or recipe file was changed.
- **Plan state:** Section H and the global catalog plan remain open.
- **Proposal-local source IDs:** WP03-H-MOTH-20261011-S01 through S09; these are not ledger records.

## Recommendation

**Add a new identity-only `LEGUME_AND_PULSE` reference for the mature seed of *Vigna aconitifolia* (Jacq.) Maréchal.** The proposed Québec-facing display is **moth beans / haricots papillon**. CFIA identifies *V. aconitifolia* as moth bean in its grain product codes; a current Maxi product listing gives the paired English and French market names `Moth Beans` and `Haricots papillon`. Canada’s federal agriculture vocabulary independently attests `haricot mat` as a French term for moth bean. The French label is therefore source-backed; it is not an invented translation. The Maxi listing is product usage evidence, not an OQLF preferred-term ruling. [S02, S06–S08]

The candidate should cover the species’ food seed product, principally the dry mature pulse represented in the Section H checklist. Do not merge immature green pods, sprouts, split/dehulled dhal, or flour into this unqualified seed identity. The evidence shows those are food uses or processing presentations, but does not establish common forms, measurement rules, or conversions for this app. [S03–S05]

## Proposed row

| Field | Recommendation | Evidence and limit |
|---|---|---|
| Canonical EN display | `moth beans` | CFIA uses the singular `moth bean`; current Canadian retail listings use `Moth Beans` and also `Moth Bean`. [S02, S07] |
| Canonical fr-CA display | `haricots papillon` | Current Maxi Québec-language grocery listing names the same `Suraj` product `Haricots papillon`; a Montréal Maxi listing pairs it directly with `Moth Beans`. Retail usage supports the display, but does not establish an OQLF preference. [S07–S08] |
| Botanical identity | *Vigna aconitifolia* (Jacq.) Maréchal | Kew’s Plants of the World Online accepts this species and lists *Phaseolus aconitifolius* Jacq. as a homotypic synonym. [S01] |
| Category | `LEGUME_AND_PULSE` | CFIA treats the species as a packaged grain commodity; Health Canada’s PMRA crop-group table includes moth bean under dry-seed *Vigna* beans. This is a dry pulse identity, not an edible-podded vegetable identity. [S02–S03] |
| Proposed EN aliases | `moth bean`; `mat bean`; `matki` | Singular `moth bean` appears in CFIA and Canadian retail usage; `mat bean` appears in the federal agriculture vocabulary; `matki` is a species-linked South Asian name in Kew/FAO and pulse literature. [S01–S02, S04, S06–S07] |
| Proposed fr-CA aliases | `haricot papillon`; `haricot mat` | Singular `haricot papillon` is attested in species references and the Canadian retail display is plural; the federal Translation Bureau vocabulary gives `haricot mat` for moth bean. [S04, S06–S08] |
| Initial numeric/form data | None | Keep density null, unit mappings empty, no forms, no conversions, no yields, no substitutions, and no recipe links. This is identity-only. |

I recommend **not** adding `haricot à feuilles d’aconit` as an active alias at this stage. The Canadian vocabulary attests it, but it is an older botanical descriptor and was not found on a current Québec food listing. Keep it in source evidence rather than search terms. Likewise, do not enumerate every translated or regional common name as an alias.

## Identity and product boundaries

### Source facts

- Kew accepts *Vigna aconitifolia* and records *Phaseolus aconitifolius* as a synonym. Kew’s taxonomic entry also associates the species with food and drink use. [S01]
- CFIA’s organic commodity-code table lists `Beans (Vigna aconitifolia) (moth bean)` in bulk grain and packaged/prepared grain categories. This identifies a human-food grain commodity and gives the botanical match, but it is an import/product-code classification, not a recipe-state standard. [S02]
- Health Canada’s PMRA crop-group material distinguishes edible-podded, succulent-shelled, and dry-seed Vigna beans; its dry-seed group includes moth bean. It also places moth bean in Vigna edible-podded and succulent-shelled groupings. This regulatory grouping demonstrates that the crop can have more than one harvested food stage; it does not make those stages aliases of a dry seed product. [S03]
- FAO’s 2017 crop chapter and a peer-reviewed review describe food use of immature pods, sprouts, and seeds. They report mature seeds eaten cooked or fried and whole or split, and also ground for food. Feedipedia’s INRAE/CIRAD/AFZ/FAO datasheet likewise distinguishes green pods from mature food seeds. [S04–S05, S09]
- Maxi’s English listings show Suraj `Moth Beans` (1.81 kg) and `Moth Bean` (907 g). The French Québec-language dried-bean listing shows Suraj `Haricots papillon` (1.81 kg), marked prepared in Canada. A current Montréal-store listing pairs `Haricots Papillon / Moth Beans`. These are direct consumer-market language observations; SKU stock and package size vary by store. [S07–S08]
- The federal Translation Bureau’s *Vocabulary of Agriculture* (Terminology Bulletin 197, 1990) gives `moth bean; mat bean — haricot mat; haricot à feuilles d’aconit`. Its observation uses the older *Phaseolus aconitifolius* name and says not to confuse it with tepary bean. The old name is consistent with Kew’s synonym record; the glossary remains historical terminology evidence, not a current retail standard. [S01, S06]
- Feedipedia reports a 1,000-seed mass range of 10–35 g, citing NARO (2020), Brink et al. (2006), and Adsule (1997). This is an agricultural seed-size observation, not a household portion or volume conversion. [S09]

### Identity inference and boundary

These sources support a distinct moth-bean seed product and a bilingual display. The row should be scoped to *V. aconitifolia* seed used as food, with ordinary dry-seed pulse usage as its main Section H catalog purpose. Do not map the name to:

- tepary bean (*Phaseolus acutifolius*) or other beans merely because an older term uses `haricot`;
- immature green pods, which Health Canada classifies separately from dry seed and which belong to a vegetable-stage review;
- sprouts, which are a distinct prepared product and should not be added as a moth-bean form without a source-qualified product decision;
- split or dehulled `moth dal`/dhal, which sources show as a preparation or processed presentation but do not establish as a universal form for every moth-bean recipe;
- moth-bean flour, which is a milled product and needs a separate flour identity decision.

Do not alias `moth bean sprouts`, `moth dal`, `moth-bean flour`, or green pods to this dry-seed row. Do not merge the bean with mung bean, black gram/urd, black-eyed pea, chickpea/gram, or kidney bean. The source literature’s use of `Turkish gram` and `moth gram` does not justify those terms as search aliases: `gram` is shared across distinct pulses and those labels are not needed to retrieve the Canadian moth-bean product. Leave `dew bean` out as a less locally grounded alternate name, and leave bare `mat` out as an overly short search key.

## Current package and normalized-key audit

The current package snapshot contains **927 active references, 51 ingredient forms, 76 legacy import candidates, 114 manifest-listed recipes, and 1,123 ingredient rows**. The research ledger has 1,189 records. No active row, form, legacy candidate, or ledger record was found for `moth bean`, `mat bean`, `matki`, *Vigna aconitifolia*, or the proposed French names.

Nearby active identities include `ingredient-ref-black-beans`, `ingredient-ref-black-eyed-peas`, `ingredient-ref-chickpeas`, `ingredient-ref-black-chickpeas`, `ingredient-ref-kidney-beans`, `ingredient-ref-lima-beans`, `ingredient-ref-pinto-beans`, `ingredient-ref-azuki-beans`, `ingredient-ref-yellow-peas`, and `ingredient-ref-lentils`. The related `ingredient-ref-mung-bean-sprouts` and `ingredient-ref-mung-bean-starch` are respectively a sprout product and a starch product, not this species’ dry seed. The 51-form inventory has only three forms attached to active `LEGUME_AND_PULSE` rows (canned-drained black beans; canned-drained and dried chickpeas); none concerns moth bean. [Package files checked: `ingredient-references.v1.json`, `ingredient-forms.v1.json`, `legacy-import-identities.v1.json`, `research-ledger.v1.json`]

The exact-key audit used the app’s NFKD/accent-folding and word-phrase normalization rules across active names/aliases, all attached form terms, and legacy names/aliases. It found no existing exact owner for the proposed canonical names or aliases. The query `mat` was excluded: it is too short and can fall through to unrelated partial matches (including a canned-diced-tomato form term). The absence of an exact-key collision does not make that broad key useful.

| Proposed exact query | Existing exact-key owner before integration |
|---|---|
| `moth beans`, `moth bean`, `mat bean`, `matki` | None |
| `haricots papillon`, `haricot papillon`, `haricot mat` | None |
| `moth gram`, `Turkish gram`, `dew bean`, `mat` | None; these are excluded from aliases for ambiguity, low local grounding, or weak search quality rather than a current direct collision. |

## Recipe demand

All **114 recipe files named by the package manifest** and all **1,123 ingredient rows** were scanned. The scan checked each ingredient row’s `originalText`, `ingredientName`, and `ingredientRefId` for moth-bean names, likely English and French common names, and botanical names. A second phrase scan over all string fields in all recipe JSON files also returned zero hits.

There is **no bundled recipe-line demand** for moth beans, matki, mat bean, *Vigna aconitifolia*, `haricot mat`, or `haricots papillon`. No line should be linked or relinked. This corpus result does not establish absence from recipes outside the bundled package.

## Forms, measures, conversions, yields, and substitutions

- **Forms:** Sources establish that this species’ food seeds may be eaten whole or split and that the plant also has immature-pod and sprout uses. They do not establish one universal form vocabulary or imply all forms are interchangeable. Add no `ingredient-form` rows now; reopen a specific preparation only when an in-scope recipe or product source requires it.
- **Measures and density:** No reviewed authoritative source provides a reusable household measure or g/mL density for the packaged dry seed. Package sizes shown by Maxi are retail pack weights, not cup weights or density. Feedipedia’s 1,000-seed mass range is agricultural seed-size evidence, not a recipe-unit mapping. [S07–S09]
- **Conversions and yields:** The sources do not establish dry-to-cooked, soaked-to-cooked, sprouting, splitting, dehulling, or milling yields. Add no conversion or package-yield data.
- **Substitutions:** Similar culinary use to other pulses is not substitution evidence. Add no global form conversion or contextual ingredient substitution involving moth beans.
- **Recipe links:** None; the manifest recipe audit found zero matching lines.

## Source register

All pages were accessed 2026-10-11. Source IDs below are proposal-local and should be mapped to ledger IDs only if this recommendation is integrated.

| ID | Source and what it supports | Limits |
|---|---|---|
| **S01** | Kew Science, [Plants of the World Online: *Vigna aconitifolia*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:525283-1). Accepted species, geographic/taxonomic context, and *Phaseolus aconitifolius* synonym. | Botanical identity, not a Canadian retail specification. |
| **S02** | CFIA, [New OGD extension codes for organic seeds and grains](https://inspection.canada.ca/en/food-labels/organic-products/import-requirements/organic-ogd-codes-seeds-amp-grains/new-ogd-extension-codes-organic-seeds-and-grai). Lists *V. aconitifolia* as moth bean under bulk grain and packaged/prepared grain. | Commodity import-code list, not a consumer recipe-state or cooking standard. |
| **S03** | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), crop group 6-21 and subgroups, especially lines 474–487 and 528–582 in the current page. Separates edible-podded, succulent-shelled, and dry-seed Vigna classes and includes moth bean in dry-seed Vigna. | Regulatory residue group classification; not a taxonomic species treatment or a culinary form model. |
| **S04** | Sharasia, Garg & Bhanderi, [*Pulses and their by-products as animal feed*](https://openknowledge.fao.org/3/i7779en/i7779en.pdf), FAO, 2017, moth-bean chapter. Reports food use of pods, sprouts, and seeds, including mature seed preparations. | FAO publication focused on animal feed/by-products; its species chapter summarizes food uses but is not a retail or recipe-unit standard. |
| **S05** | Verma et al., [“Moth bean (*Vigna aconitifolia*): a minor legume with major potential to address global agricultural challenges”](https://pmc.ncbi.nlm.nih.gov/articles/PMC10279967/), peer-reviewed review. Supports the species-scoped crop identity and reported mature/immature food uses, including whole/split seed and sprouts. | Review of agricultural and nutritional literature, not Canadian terminology, market specification, or recipe conversion evidence. |
| **S06** | Government of Canada, Translation Bureau, [*Vocabulary of Agriculture*, Terminology Bulletin 197](https://publications.gc.ca/collections/collection_2014/tpsgc-pwgsc/S52-2-197.pdf), 1990, p. 396. Bilingual moth bean/mat bean ↔ haricot mat/haricot à feuilles d’aconit entry and tepary distinction. | Historical glossary with older *Phaseolus* nomenclature; Kew confirms the older binomial as a synonym. Not a current Québec retail label. |
| **S07** | Maxi Canada, [English dried-beans listings](https://www.maxi.ca/en/food/pantry/dried-beans-vegetables-grains/dried-beans/c/29913) and [English Suraj search results](https://www.maxi.ca/en/search?search-bar=suraj). Current listings include `Suraj Moth Beans` 1.81 kg and `Suraj Moth Bean` 907 g. | Retail language and package weights vary by store; the listing does not identify the botanical species. CFIA supplies the species linkage. |
| **S08** | Maxi Canada, [French Québec dried-beans listings](https://www.maxi.ca/fr/alimentation/garde-manger/haricots-secs-l-gumes-et-grains/c/28185?page=2) and [Montréal Maxi listing](https://www.ubereats.com/store/maxi-1180-avenue-bernard/DZci6zRIUCGRggapJUzcpA?diningMode=DELIVERY). The local retail title is `Suraj Haricots papillon` and the Montréal listing pairs `Haricots Papillon / Moth Beans`. | Product-title terminology evidence, not an OQLF ruling; delivery listings are store-specific and may change. |
| **S09** | Feedipedia, [Moth bean (*Vigna aconitifolia*)](https://www.feedipedia.org/node/237), Heuzé, Tran & Lebas, 2020; programme by INRAE, CIRAD, AFZ, and FAO. Lists English/French common names, distinguishes immature green pods and mature seeds used for food, describes mature seed cooking/frying/ground use, and reports a 1,000-seed weight of 10–35 g with cited literature. | Curated feed/agriculture datasheet, not a Québec terminology authority or retail package specification. Its 1,000-seed range cannot establish a household mass/volume mapping. |

## Proposal disposition

Promote a new *Vigna aconitifolia* mature-seed identity as `moth beans / haricots papillon`, category `LEGUME_AND_PULSE`, with only the listed narrow species-linked aliases. Record no recipe links or numeric behavior. Keep immature pods, sprouts, split/dehulled dhal, and flour outside aliases; handle them only under separately scoped reviews. This proposal adds no change to the Section H checklist or any shared catalog artifact.
