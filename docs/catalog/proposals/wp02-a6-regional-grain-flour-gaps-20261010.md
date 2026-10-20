# WP02 A6 Regional Grain-Flour Gaps

- **Reviewed:** 2026-10-10
- **Status:** Proposal only. This packet recommends three identity-only flour references, keeps two fonio processing products held, and carries forward existing A6 decisions. It does not edit canonical catalog data, the research ledger, recipes, tests, plan, or roadmap.
- **Proposal-local source IDs:** `WP02-A6-GRAIN-FLOUR-GAPS-20261010-S01` through `S13`; these are not ledger entries and are unique to this packet.
- **Scope:** Reconcile the open A6 grain-flour coverage, including buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and selected other regional grain flours. Audit recipe demand, exact names, process/species limits, and collisions. The broad A6 checklist remains open.

## Recommendations

“Accept” below is a recommendation for root integration review; no row is integrated by this proposal.

| Candidate | Disposition | Proposed or current identity | Exact limit |
| --- | --- | --- | --- |
| Buckwheat flour | **Retain accepted** | `ingredient-ref-buckwheat-flour` — `buckwheat flour` / `farine de sarrasin` | Preserve the source-backed flour identity; keep it separate from buckwheat grain and wheat flour. No new aliases or data. [baking-flours-starches.md, S25–S26, S31] |
| Sorghum flour | **Retain accepted** | `ingredient-ref-sorghum-flour` — `sorghum flour` / `farine de sorgho` | Preserve the Codex-backed milling-product identity; keep sorghum grain separate. No new aliases or data. [baking-flours-starches.md, S33] |
| Pearl-millet flour | **Retain accepted** | `ingredient-ref-pearl-millet-flour` — `pearl millet flour` / `farine de mil chandelle` | Keep species/product-qualified; do not alias generic millet flour or pearl-millet grain. [baking-flours-starches.md, S34] |
| Finger-millet flour | **Retain accepted** | `ingredient-ref-finger-millet-flour` — `finger millet flour` / `farine de ragi` | Keep separate from the generic millet-flour candidate and the finger-millet grain row; retain existing `ragi flour` alias only. [WP06 South Asian proposal, S04–S05; WP06 integration README] |
| Generic millet flour | **Accept** | `ingredient-ref-millet-flour` — `millet flour` / `farine de millet`; no aliases | A current Québec seller lists a species-unspecified product under English `Millet Flour` and French `Farine de Mil`; its French description calls it `farine de millet`. Use the unambiguous descriptive French display. Do not infer a millet species or merge with pearl- or finger-millet flour. [S01–S02] |
| Generic quinoa flour | **Retain accepted** | `ingredient-ref-quinoa-flour` — `quinoa flour` / `farine de quinoa` | Keep separate from quinoa grain and its cooked form. No new aliases or data. [baking-flours-starches.md, S25–S26] |
| Roasted quinoa flour | **Retain accepted; fixed context** | `ingredient-ref-roasted-quinoa-flour` — `roasted quinoa flour` / `farine de quinoa torréfiée` | This existing Québec-mill identity is separate from generic quinoa flour; retain no aliases. Do not reopen the prior integrated boundary. [WP02 Hattai-ko proposal, S06–S08] |
| Amaranth flour | **Retain accepted** | `ingredient-ref-amaranth-flour` — `amaranth flour` / `farine d'amarante` | Retain the existing spelling and keep the supplier spelling `farine d'amaranthe` documentary, not an active alias. [baking-flours-starches.md, S26, S28, S30] |
| Teff flour | **Retain accepted** | `ingredient-ref-teff-flour` — `teff flour` / `farine de teff` | Keep separate from teff grain; do not activate OQLF's non-current spelling `tef` as an alias. [baking-flours-starches.md, S90–S92] |
| Fonio flour | **Accept** | Existing ledger candidate ID `ingredient-ref-fonio-flour` — `fonio flour` / `farine de fonio`; proposed English alias `acha flour` only | Scope the flour identity to food flour made from white fonio, *Digitaria exilis*. The Canadian product name and species evidence support this narrow base identity; Québec manufacturer usage supports the French phrase. Do not include black fonio or infer a milling/dehulling grade. Keep `acha fufu` and French `farine d'acha` inactive. [S03–S09] |
| Roasted fonio flour | **Hold as a separate product candidate** | No active ID | Mako Foods names `Farine de Fonio Torréfié`, but the product page does not establish the order of roasting and milling or its relationship to generic fonio flour. Do not make it an alias or form of the accepted base identity. [S06] |
| Precooked fonio flour | **Hold as a separate product candidate** | No active ID | Mako Foods names `Farine de Fonio Précuit`; the exact product name is useful evidence, but the available page does not specify the process sequence or whether this should be modeled as a separate product identity, a grade, or another relationship. Do not alias it to generic or roasted flour. [S07] |
| Job's-tears flour | **Accept** | `ingredient-ref-jobs-tears-flour` — `Job's tears flour` / `farine de larmes de Job`; no aliases | Treat as a food flour from edible *Coix lacryma-jobi* grain. Keep it separate from the active grain identity and exclude ornamental bead seed, feed, and other plant-part uses. The scholarly product source plus official Canadian English/French goods terminology support the narrow identity; independent Québec review remains open. [S10–S13; existing WP03-S184–S189] |
| Broad `grain flour` / `farine de céréales` as one ingredient | **Reject as a canonical identity** | None | This wording does not identify a source grain or a single milling product. Keep it as a discovery phrase only; select a specific cereal flour when the recipe or product does so. |

For all recommended new references, use `FLOUR_AND_STARCH`, empty or limited aliases as shown, null density, and empty unit mappings/forms. Add no measurement, conversion, yield, substitution, or recipe link. Do not create grain forms to represent milling products.

## Reconciliation with current A6 work

- The A6 plan line remains unchecked and the batch table already records buckwheat, sorghum, pearl millet, quinoa, amaranth, and teff flour. Those active reference rows are carried forward, not proposed again. Finger-millet flour was integrated later through the WP06 South Asian packet and is also carried forward.
- `ingredient-ref-roasted-quinoa-flour` is already live as a separate source-named functional flour. This packet treats that identity and its `farine de quinoa torréfiée` spelling as fixed context.
- The baking-flours batch and ledger contain a held `ingredient-ref-fonio-flour` candidate (`needs_clarification`) based on earlier Canadian and regional sources WP02-S93–S97. Those sources established a flour product but left identity scope, process boundaries, and generic fr-CA wording unresolved. The new Québec manufacturer wording and the direct *D. exilis* product source support recommending a narrow base identity now; do not revise the ledger in this packet.
- The WP06 South Asian gap packet held generic millet flour because its only recipe mention was species-unspecified. This packet adds a current bilingual Québec seller product, so it recommends an unqualified millet-flour identity while keeping the product's species explicitly unknown. It does not relabel the prior Bhutan recipe or map it to finger millet.
- The integrated WP03 Job's-tears row is an edible-grain identity whose scope explicitly excludes flour. A separately named flour row does not change that grain decision, its aliases, or the no-recipe-link result.
- Previous WP02 roasted-flour proposals address B6 products and remain unchanged. Roasted barley, wheat, corn, and quinoa boundaries do not make unqualified regional flour names aliases; no Hattai-ko, mugikogashi, roasted gram, or toasted-grain decision is changed here.

This packet resolves only the listed candidates. Other regional grain flours and independent bilingual Québec review remain open; the broad A6 checklist must stay open.

## Product and terminology boundaries

### Generic millet flour

Mako Foods Exotik's current English page names `Millet Flour`; its French counterpart is headed `Farine de Mil` and describes the item as `notre farine de millet`. The seller identifies its address at the Marché public de Longueuil in Saint-Hubert, Québec [S01]. OQLF lists `millet` and `mil` among its preferred French terms and explains that unqualified millet is generic and groups several species [S02]. Together these establish the bilingual name of a real generic milling product, not its botanical source.

Recommend `millet flour / farine de millet` as a generic, species-unspecified product identity. Do not attach it to the `millet` grain row, `common millet`, pearl millet, finger millet, or their flour rows as an alias. The exact market heading `Farine de Mil` is retained in the evidence, but not as a search alias: the active pearl-millet flour term `farine de mil chandelle` already contains that phrase. The English and French canonical displays remain supported by the same manufacturer's bilingual product pages; no species, ingredient percentage, processing order, grind class, nutritional statement, or gluten claim is inferred.

### Fonio flour and processed variants

OQLF defines white fonio as *Digitaria exilis* and lists `fonio`, `acha`, `fundi`, and `findi` among its French terms, with `white fonio`, `fonio`, and `acha` in English [S03]. A Canadian product page names `Fonio (Acha) Flour` and lists `100% ground dehulled fonio grain (Digitaria exilis)` as the ingredient [S04]. This supports a narrowly scoped `fonio flour` identity. The product name `acha flour` is a defensible English alias for that white-fonio flour only because the same Canadian product title explicitly presents “Acha” parenthetically [S04]; do not attach bare `acha` to the flour row.

A second Canadian retailer labels a different item `Fonio Flour (Acha Fufu)` and says it is made by milling whole fonio grains from Nigeria; its page does not identify the species or say whether the grain is dehulled [S05]. Burkina Faso processing research uses `farine de fonio` for flour from decorticated/whitened grain and discusses precooked and steamed fonio separately [S06]. These sources establish process diversity, not a universal milling specification. The Mako Foods Québec pages separately name `Farine de Fonio Torréfié` and `Farine de Fonio Précuit` [S07–S08]. A Mako French recipe also uses the unqualified ingredient wording `farine de fonio Mako Foods` [S09], supporting a local fr-CA base phrase but not showing that the company's generic recipe ingredient is identical to either current qualified retail product.

Recommend the base identity only, with no grain-state form. Keep roasted and precooked products held as explicit product names pending a manufacturer specification of input grain, process sequence, and relationship to generic fonio flour. Do not equate roasted and precooked; do not make them forms or aliases of one another or of the base identity. Keep black-fonio flour unassigned because the sources reviewed here do not document a flour product made from *Digitaria iburua*. Do not infer baking performance, hydration, nutrition, gluten status, heat conditions, or conversion data from product marketing or source-specific recipes.

### Job's-tears flour

The Japan Society of Cookery Science publishes a study explicitly titled “A Study on the Adaptability of Job's Tears Flour…” and its abstract describes flour made from Job's tears [S10]. Canadian trademark materials list `Job's tears flour` in English and `farine de larmes de Job` in French [S11–S12]. OQLF identifies the base French term `larme-de-Job`, English `Job's tears`, and species *Coix lacryma-jobi* [S13]. The prior WP03 food-grain sources distinguish edible cereal grain from hard-shelled bead forms and nonfood uses [WP03-S185–S189].

Recommend one identity-only culinary flour row scoped to edible *Coix lacryma-jobi* seed. The Canadian trademark goods wording is terminology evidence, not proof of a currently stocked Canadian flour product, and the Japanese study does not establish a Québec milling grade or a universal process. Keep `adlay flour`, `adlai flour`, `Chinese pearl barley flour`, `Job's tears powder`, and botanical `Coix flour` out of aliases. Do not map the flour to the active grain row; do not create a preparation form. Independent Québec review of the proposed French compound remains open.

## Bundled recipe audit

The current manifest lists **114 recipe files** with **1,123 ingredient rows**. Every listed recipe JSON and ingredient row was searched, with recipe text checked for the same candidate vocabulary. Matching normalized whole phrases were checked in `originalText`, `ingredientName`, `preparation`, and `notes`; full serialized recipe text was also searched. Normalization followed `normalizeIngredientSearchKey`: lowercase, Unicode NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace non-ASCII alphanumeric runs with spaces, and collapse whitespace.

The audit included the current accepted names and candidate variants: buckwheat, sorghum, pearl/finger/generic millet, quinoa and roasted quinoa, amaranth, teff/tef, fonio/acha and flour, roasted/precooked fonio, Job's tears/adlay/Coix flour, and their supported French phrases. **There were zero matching ingredient lines and zero full-recipe text hits for these A6 flour candidates.** No bundled recipe demands or justifies a new identity, alias, or recipe link. The earlier Bhutan millet-flour recipe is not in the bundled recipe corpus; it remains generic and species-unspecified in its source. External recipe examples and research papers were not treated as bundled recipe demand.

## Alias and collision audit

Exact normalized names were checked against active references, forms, and legacy-candidate names; proposed reference IDs were checked against active IDs, legacy IDs, and ledger record IDs. The current picker also matches a complete query phrase embedded within a longer display term, so the table distinguishes exact-key ownership from expected broad-query overlap.

| Query or boundary | Current owner / result | Proposal disposition |
| --- | --- | --- |
| `buckwheat flour` / `farine de sarrasin` | `ingredient-ref-buckwheat-flour` | Retain unchanged. Keep separate from buckwheat grain and wheat flour. |
| `sorghum flour` / `farine de sorgho` | `ingredient-ref-sorghum-flour` | Retain unchanged; no grain alias. |
| `pearl millet flour` / `farine de mil chandelle` | `ingredient-ref-pearl-millet-flour` | Retain specific identity. |
| `finger millet flour` / `farine de ragi` | `ingredient-ref-finger-millet-flour` | Retain specific identity and existing `ragi flour` alias; no bare `ragi` alias. |
| `millet flour` | No exact generic owner. Current phrase search returns `ingredient-ref-pearl-millet-flour` and `ingredient-ref-finger-millet-flour`, because each contains the phrase. | Add a separate generic product identity, which will make three meaningful choices for this query. This is a broad-to-specific search overlap, not an exact duplicate. Do not use either species-qualified row as the generic alias. |
| `farine de millet` | No current exact owner or embedded phrase owner. | Proposed as the French display for the generic product. |
| `farine de mil` | Current phrase search reaches `ingredient-ref-pearl-millet-flour` through `farine de mil chandelle`. | Do not activate this manufacturer heading as a generic French alias; use `farine de millet` for the new display. |
| `fonio flour`, `acha flour`, `farine de fonio` | No active exact owner. Existing `ingredient-ref-white-fonio` has `fonio` and `acha` grain aliases; `ingredient-ref-black-fonio` remains a separate grain identity. | Add only the separate flour ID; add `acha flour` as the one exact English alias. Keep bare `fonio`/`acha` out of the flour aliases. Broad `fonio` or `acha` searches may return grain and flour choices. |
| `roasted fonio flour`, `farine de fonio torréfiée` | No active exact owner. | Hold separate; do not alias to generic flour or activate roasted as a form. |
| `precooked fonio flour`, `farine de fonio précuite` | No active exact owner. | Hold separate from both generic and roasted fonio flour. |
| `Job's tears flour`, `farine de larmes de Job` | No active exact owner. `ingredient-ref-jobs-tears` owns the edible grain name `Job's tears / larme-de-Job` and aliases, not the flour phrase. | Add a separate flour identity. Broad `Job's tears` search may return both grain and flour. Do not reuse the grain ID or aliases. |
| `Chinese pearl barley flour` | No exact active flour owner; the catalog has barley grain identities and the Job's-tears grain row. | Do not alias. The regional compound is liable to be read as barley and is not supported by the reviewed flour sources. |
| `black fonio flour`, `fonio flour roasted`, `acha fufu`, `farine d'acha` | No exact active owner. | Keep unassigned: species/process/source wording is absent or not a flour-equivalent name in the reviewed evidence. |

The proposed IDs `ingredient-ref-millet-flour` and `ingredient-ref-jobs-tears-flour` are free in the active references, forms, legacy file, and ledger record IDs at this snapshot. `ingredient-ref-fonio-flour` is already a non-active `needs_clarification` ledger candidate; reuse that candidate ID if accepted. The proposal-local source-ID prefix was absent from the ledger and catalog proposal/batch files at this snapshot.

## Pre-integration snapshot

Captured 2026-10-10 during review, before any integration from this proposal. The shared workspace changed while drafting, so the hashes below are from the final read after that concurrent change; these describe the inspected live state. The recipe fingerprint is SHA-256 over each manifest-ordered relative recipe path, a NUL byte, exact recipe-file bytes, and another NUL byte.

| Artifact | Count | SHA-256 / fingerprint |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 770 references | `086adb131bf0abf4df3b25be430878173ce51a8ac1bcb2191834b4b73b72a4b4` |
| `ingredient-forms.v1.json` | 36 forms | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Seed `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 recipes / 1,123 ingredient rows | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |
| `research-ledger.v1.json` | 988 records / 2,056 source entries / 1,670 distinct source IDs | `27300b14879b50bcd61ee46955ba8ecb0e05b3b9110e152bb99f24505c710df9` |
| `legacy-import-identities.v1.json` | 82 candidates | `60d389975134f8d31c57c66caa6375b4466c4c9614d399617a64365878d6aa5f` |
| `RecipeBook-global-ingredient-catalog-plan.txt` | A6 checklist still open | `e1e4162176597d671a7b5bef97694973bcf3c6ef7c9288acc4b7e6ca8ccd4ca1` |
| `baking-flours-starches.md` | Current A6 summary and evidence table | `5fcfa813d7c214841ba9ddc9527da3c710645c1d7007be9d13510ae09dca1ee3` |

## Evidence register

All web sources below were accessed on 2026-10-10. Proposal-local IDs are unique to this file and have not been written to the research ledger.

| ID | Source and evidence limit |
| --- | --- |
| **S01** | Mako Foods Exotik, [Millet Flour (English)](https://www.makofoods.ca/en/products/farine-de-mil-700-g) and [Farine de Mil (français)](https://www.makofoods.ca/products/farine-de-mil-700-g). Bilingual seller product pages identify one current Québec-sold generic millet-flour product; the French page title says `Farine de Mil` and body says `farine de millet`. The page does not identify the millet species, processing order, or grind class. Health, nutrition, and gluten claims are not imported. |
| **S02** | OQLF, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet). Lists `millet`, `mil`, and `petit mil` as preferred French terms, English `millet`, and explains the generic term can group several species. This is grain terminology, not a flour definition or product specification. |
| **S03** | OQLF, [fonio blanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529747/fonio-blanc). Pairs `fonio blanc` with `white fonio`, lists `fonio`/`acha` among the common terms, and identifies *Digitaria exilis*. It names the grain, not a flour. |
| **S04** | Aga's Wholesome, [Fonio (Acha) Flour](https://www.agaswholesome.ca/products/fonio-flour). Canadian product page names `Fonio (Acha) Flour` and identifies the ingredient as ground, dehulled *Digitaria exilis*. Brand, gluten, nutrition, performance, and health claims are not generalized. |
| **S05** | MyChopChop, [Fonio Flour (Acha Fufu)](https://www.mychopchop.ca/products/acha-flour). Canadian retail listing says the product is made by milling whole fonio grains from Nigeria. It does not specify species or dehulling; `Acha Fufu` is not treated as an alias. |
| **S06** | Afrique Verte, [Analyse de la valeur nutritive des produits transformés au Burkina](https://www.afriqueverte.org/r2_public/media/fck/File/Documentation/Etudes/valeur-nutritive-des-cereales-transformees-au-burkina.pdf), 2010, pp. 14–15. Documents `farine de fonio` from decorticated/whitened grain and discusses precooked and steamed fonio separately. Regional process evidence only; not a Québec terminology source or universal process specification. |
| **S07** | Mako Foods Exotik, [Farine de Fonio Torréfié](https://www.makofoods.ca/products/farine-de-fonio-torrefie-600-g?variant=45458309415098). Québec seller's exact product name. The page does not establish roasting temperature, sequence, or equivalence with generic flour. |
| **S08** | Mako Foods Exotik, [Farine de Fonio Précuit](https://www.makofoods.ca/products/farine-de-fonio-precuit-700-g?variant=45458303549626). Québec seller's exact product name. The page does not establish a process sequence or relation to the roasted product. |
| **S09** | Mako Foods Exotik, [Recettes](https://www.makofoods.ca/blogs/recettes), “Muffin pomme et cannelle,” 18 February 2026. Manufacturer recipe ingredient list says `farine de fonio Mako Foods`; supports exact Québec French recipe wording only, not the bundled recipe corpus or the identity of a current package SKU. |
| **S10** | Watanabe et al., Japan Society of Cookery Science, [A Study on the Adaptability of Job's Tears Flour as a Substitute for Wheat Flour in Prepared Food Products](https://www.jstage.jst.go.jp/article/cookeryscience/49/2/49_128/_article/-char/en), 2016. Direct scholarly source documenting a culinary flour product made from Job's tears; no Québec product label, milling grade, or general baking claim is imported. |
| **S11** | Canadian Intellectual Property Office, [LI ZI QI trademark record 2049739](https://ised-isde.canada.ca/cipo/trademark-search/2049739?wbdisable=true). This official Canadian English goods listing names `Job's tears flour`; trademark goods terminology is not proof of an actively stocked product or its processing method. |
| **S12** | Canadian Trademarks Journal, [Vol. 71 No. 3623, French edition](https://publications.gc.ca/collections/collection_2024/opic-cipo/RG42-2-71-3623-fra.pdf), 2024-04-03. A separate official Canadian French goods listing includes `farine de larmes de Job`; it is terminology evidence, not a bilingual label for the English S11 trademark or a Québec retailer/manufacturer label. |
| **S13** | OQLF, [larme-de-Job](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17042985/larme-de-job). Gives the preferred French base term and plural, English `Job's tears`, and Latin *Coix lacryma-jobi*. It is a botanical entry; food scope comes from the prior WP03 grain evidence, not this page. |

## Coordinator follow-up

1. At integration time, re-read the active references and ledger; confirm the fonio candidate still has no active row and that the two proposed new IDs remain available.
2. Decide whether to integrate the generic millet flour display as `farine de millet`; do not activate `farine de mil` without accepting its overlap with `farine de mil chandelle`.
3. Integrate only the generic fonio flour base if accepted. Keep roasted and precooked product names held until the process and product relationship are clarified.
4. Review Job's-tears flour as a separate culinary identity; do not change `ingredient-ref-jobs-tears` or transfer its grain aliases to flour.
5. Keep the broad A6 checklist open for other regional grain-flour gaps and independent Québec terminology review. No tests were run; this is proposal-only research.
