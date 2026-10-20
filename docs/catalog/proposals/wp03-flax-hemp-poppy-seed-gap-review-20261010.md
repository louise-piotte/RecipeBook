# WP03 Section I — flax, hemp hearts, and poppy-seed gap review

- **Reviewed:** 2026-10-10
- **Status:** Proposal only. No catalog, ledger, recipe, plan, roadmap, test, or generated file was changed.
- **Scope:** Culinary flax/linseed, whole hemp seed versus hulled hemp hearts, and culinary poppy seed. This review does not close Section I.
- **Method:** Read the project instructions, `Requirements.md`, the active WP03 Section I checklist, the live split seed package, related seed proposals, the full legacy-candidate file and research ledger, and every manifest-listed recipe. Checked terminology and product boundaries against Canadian government, Québec, and Canadian food-product sources.

## Recommendation

Integrate three identity-only candidates: one flax-seed identity that treats **flax seed / flaxseed / linseed** as naming variants for the same culinary seed; one hulled-hemp-hearts identity; and one culinary poppy-seed identity. Hold whole, unhulled hemp seeds for a separate review if recipe demand appears. Do not place the unqualified phrase **hemp seeds** on the hearts identity: it does not preserve the hull distinction.

| Proposed stable ID | English display | Provisional fr-CA display | Aliases supported for review | Category | Disposition |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-flax-seeds` | `flax seeds` | `graines de lin` | EN: `flaxseed`, `flax seed`, `linseed`, `linseeds`; FR: `graine de lin` | `NUT_SEED_AND_DRIED_FRUIT` | Integrate as one culinary seed identity. Canadian federal sources use flaxseed and linseed for the same seed/crop. Do not create a separate linseed row. |
| `ingredient-ref-hemp-hearts` | `hemp hearts` | `graines de chanvre décortiquées` | EN: `hulled hemp seeds`, `shelled hemp seeds`; FR: `cœurs de chanvre` | `NUT_SEED_AND_DRIED_FRUIT` | Integrate the specifically hulled food product. The French display follows Health Canada’s bilingual food name and Canadian product wording. Keep whole hemp seed outside this identity. |
| `ingredient-ref-poppy-seeds` | `poppy seeds` | `graines de pavot` | EN: `poppy seed`; FR: `graine de pavot` | `NUT_SEED_AND_DRIED_FRUIT` | Integrate the culinary seed identity. OQLF’s food/spice entry directly pairs the English and French terms and identifies *Papaver somniferum*. |

These are identity proposals only. Add no forms, densities, unit mappings, package values, yields, substitutions, or recipe links. Keep any numeric material shown in source databases out of the active catalog and this packet.

## Boundaries and naming decisions

### Flaxseed and linseed

Health Canada’s bilingual Canadian Nutrient File (CNF) calls one food item **“Seeds, flaxseed (linseed), whole and ground”** and labels it in French as **“Graines, lin, entières et moulues.”** Agriculture and Agri-Food Canada also describes flax as common flax or linseed and names *Linum usitatissimum*. These sources support one seed identity, not separate flax and linseed references. `Graines de lin` is a clear Canadian French rendering; the targeted OQLF search did not locate a seed-specific GDT entry, so it should not be presented as an OQLF ruling. [FHP-S01, FHP-S02]

Keep the generic plant word `flax` out of aliases: federal sources also describe flax as a fiber crop, and the bare word does not specify the food seed. Keep `flaxseed meal`, flax flour, flax oil, linseed oil, and fiber products outside this identity. They are distinct products, not spelling variants of the culinary seed. Do not create whole, ground, golden, or brown forms in this review; the CNF’s combined record does not establish that this catalog needs those states as structured forms.

### Whole hemp seed and hulled hemp hearts

Health Canada lists **“Seeds, hemp seeds, hulled”** with the French food name **“Graines de chanvre, décortiquées.”** Manitoba Harvest’s Canadian French product page uses **Hemp Hearts / graines de chanvre décortiquées** and explains that removing the hard outer shell leaves the edible heart. A Canadian French retailer calls the same product **cœurs de chanvre** and explicitly equates that phrase with hulled hemp seeds. A Canadian-hosted research paper separately labels hemp hearts, hemp whole seed, and hemp seed hulls in its sample set. Together these establish the product boundary and support the proposed localized names. [FHP-S03–FHP-S06]

Use `hemp hearts` and `hulled hemp seeds` as names for the same hulled product. Do not add unqualified `hemp seeds`, `graines de chanvre`, or whole/unhulled-seed wording as aliases for hearts. Whole seeds retain their hard hull and are a different product request. Hold a separate whole-seed reference for now: no bundled recipe uses either product, and the current sources provide a clearer Canadian culinary name for the hulled product than for whole seeds. If a recipe later explicitly calls for whole hemp seeds, review that food-grade item and its Québec French label separately.

Do not add `hemp nuts`, `cannabis seeds`, hemp oil, hemp protein, hemp flour/meal, or hemp beverages as aliases. The first two are less precise than the source-backed culinary name, while oils, protein products, meals, and beverages are separate products. No OQLF seed-specific entry was found in the targeted search; the proposed French wording comes from Health Canada’s bilingual food name and Canadian French-market labeling rather than an asserted OQLF preference.

### Culinary poppy seed

OQLF’s GDT places **graine de pavot** in the food, spice, and seasoning domain; it gives **poppy seed** as the English term, *Papaver somniferum* as the Latin term, and notes the use of the seeds in human food. The plural displays `poppy seeds / graines de pavot` are natural ingredient labels; keep the OQLF-supported singular pair as search aliases for exact singular queries. [FHP-S07]

Do not alias `poppy` or `coquelicot`: the OQLF entry for `coquelicot` is a botanical plant term in the Papaver genus, whereas its food entry specifically names the seed. Keep poppy plant/flower, poppy-seed oil, and any color-qualified seed product outside the unqualified culinary seed identity unless a later recipe-focused review establishes a need. [FHP-S07, FHP-S08]

## Live catalog, ledger, and proposal audit

Snapshot read on **2026-10-10**. The parent coordinator should recheck before any merge.

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 714 references | `200a6b7d0651b86cb8ccb286d8799c321d01fd41a8e6f7524fff432725cc8489` |
| `ingredient-forms.v1.json` | 34 forms | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `legacy-import-identities.v1.json` | 84 candidates | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| `research-ledger.v1.json` | 903 records | `fcaf888322909022780f94d1744cf0bce70a01c265a4d1cdae0896fe4a61df20` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe-set fingerprint | 114 files / 1,123 ingredient rows | `83daad2b3cab9782f079d0e976b7493a23899676ef18185c0b98d4225d860695` |

The recipe-set fingerprint is SHA-256 over each manifest-relative recipe path, a NUL byte, that file’s SHA-256 digest bytes, and a newline, in manifest order. All 114 paths existed. Searches of active reference names/aliases, form labels/match terms, legacy candidate names/aliases, and ledger records found no scoped flax/linseed, hemp/hemp-hearts, or poppy-seed match. The neighboring active seed identities—sesame, chia, egusi, dried watermelon-seed kernels, makhana, and sacred lotus—remain separate and have no proposed alias overlap with these candidates.

The recipe audit scanned the complete JSON content and ingredient rows in all 114 manifest-listed files for `flax`, `flaxseed`, `flax seed(s)`, `linseed(s)`, French `graine(s) de lin`; hemp/whole/unhulled seed, hearts, hulled/shelled forms, French `chanvre` and `cœur(s) de chanvre`; and poppy seed(s), `pavot`, and `coquelicot`. It found **zero matching recipe files, zero matching ingredient rows, and zero recipe links**. Lack of current recipe demand does not block the Section I checklist identities, but it gives no basis for links or product-state data.

Related reviews were checked to preserve their boundaries. The integrated sesame review separates seed identity from paste and defers structured hull states absent need; the egusi review keeps seed categories distinct from meal, paste, and species-specific products; the makhana/lotus reviews keep the separate seed identities apart; and the tree-nut review says the category label is not an allergen or botanical classification. None covers flax, hemp hearts, or culinary poppy seed. [WP03 sesame review](wp03-sesame-tahini-boundary-review-20261009.md), [egusi review](wp03-egusi-melon-seeds-identity-review-20261009.md), [makhana review](wp03-makhana-fox-nut-identity-20261009.md), [lotus review](wp03-lotus-seed-fox-nut-boundary-review-20261010.md), [tree-nut review](wp03-tree-nuts-coordinator-review-20261009.md)

## Source register

All sources were accessed on **2026-10-10**. IDs are local to this proposal and are not research-ledger source IDs.

| ID | Source and locator | Claim supported and limits |
| --- | --- | --- |
| FHP-S01 | Health Canada, [Canadian Nutrient File serving-size page: flaxseed (linseed), whole and ground](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4528), food code 4528, English/French food names. | Directly pairs `flaxseed` and `linseed` in one seed-food name and provides a Canadian French seed label. The page includes source-specific serving observations; none is adopted here. It does not imply a structured form or universal conversion. |
| FHP-S02 | Agriculture and Agri-Food Canada, [Flax trends in Europe and the United Kingdom](https://agriculture.canada.ca/en/international-trade/reports-and-guides/customized-report-service-flax-trends-europe-and-united-kingdom), “Market snapshot,” lines identifying common flax/linseed and *Linum usitatissimum*. | Supports flax and linseed as names for the same crop/species and its food/fiber scope. The crop name `flax` alone is not a food-seed alias. |
| FHP-S03 | Health Canada, [Canadian Nutrient File serving-size page: hulled hemp seeds](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=7568), food code 7568. | Direct bilingual source for `Seeds, hemp seeds, hulled` / `Graines de chanvre, décortiquées`. The page includes source-specific serving observations; none is adopted here. |
| FHP-S04 | Manitoba Harvest, [Graines de chanvre décortiquées naturelles](https://manitobaharvest.ca/fr/products/natural-hemp-hearts), product description and FAQ, especially its discussion of the hard outer shell and the hulled `Hemp Hearts` product. | Canadian food-market source for the bilingual product wording and distinction between whole seeds and the shelled inner heart. It is a manufacturer source, not an OQLF terminology ruling. |
| FHP-S05 | Nutworks Canada, [Cœurs de chanvre](https://store.nutworks.ca/fr/products/hemp-hearts), French product title and description. | Explicitly calls hulled hemp seeds `cœurs de chanvre`; supports a fr-CA market alias. This does not make `cœur` a government-preferred term. |
| FHP-S06 | Banskota et al., [Biochemical characterization and in vitro digestibility of protein isolates from hemp by-products for salmonid feed applications](https://nrc-publications.canada.ca/eng/view/ft/?id=3afcc033-094c-4561-bc1d-c3798b4ba5cf), *Molecules* 27 (2022), 4794; sample codes on PDF pp. 2–3. | Independently distinguishes hemp hearts, hemp whole seed, and seed hulls as sample materials. Its analytical/feed context is not a cooking conversion or recipe recommendation. |
| FHP-S07 | Office québécois de la langue française, [graine de pavot](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095300/graine-de-pavot), food/spice domain, preferred French term, English equivalent, Latin name, and food-use note. | Direct Québec terminology source for culinary `graine de pavot / poppy seed`, identified with *Papaver somniferum*. Supports the singular aliases and food boundary. |
| FHP-S08 | Office québécois de la langue française, [coquelicot](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17067491/coquelicot), botanical domain and definition. | Defines `coquelicot` as a plant in genus Papaver and gives English `poppy`; it is not the food-seed term in FHP-S07. Excluded as a seed alias. |

**Proposed decision:** integrate flax seeds, hulled hemp hearts, and culinary poppy seeds as three identity-only references using the names above. Treat flax/linseed as one seed identity. Do not merge whole hemp seeds with hearts or assign whole-seed wording to the hearts aliases; hold whole hemp seeds for evidence and recipe demand. Keep Section I open.
