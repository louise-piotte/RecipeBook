# WP03 Section F — independent Québec French review of red rice

- **Reviewed:** 2026-10-11
- **Disposition:** **Retain** `red rice / riz rouge` unchanged. Do not add aliases, forms, or numeric data.
- **Scope:** terminology for the active edible red-bran rice identity, including whether regional/product labels should be normalized to it. This is an independent wording review; it does not change the catalog.

## Recommendation

Keep `ingredient-ref-red-rice` displayed as **red rice / riz rouge**, with empty alias arrays. The federal bilingual food specification directly pairs these names for an edible red-bran rice product, and a current Metro Québec French product listing uses the title and ingredient wording *riz rouge* for plain rice [S03–S05]. This is enough to retain the existing Québec French display. It does **not** make `riz rouge` an OQLF-preferred term: the targeted OQLF search did not surface a raw red-rice entry, and the relevant OQLF entry found was for the prepared dish *riz mexicain* [S01].

No display correction or alias addition is proposed. In particular, do not map `Mexican red rice` / `riz mexicain` or `riz à la mexicaine` to this grain: OQLF defines those as a cooked accompaniment and lists *Mexican red rice* among the English names of that dish [S01]. TERMIUM’s *red yeast rice / levure de riz rouge* is a fermented product in a treatment context, not the plain grain [S02].

Read the active identity as the **generic edible red-bran grain class**. A regional or cultivar-specific product name should not be added as a global alias on the evidence reviewed. A Québec retailer lists *riz rouge de Ceylan biologique*, but its ingredient statement only says organic rice; it does not independently describe the bran or establish a synonym relationship [S06]. Likewise, Maxi’s *riz complet rouge* is a qualified retailer product title, not evidence that `riz complet rouge` is a general synonym for the unqualified identity [S07]. These sources do not establish that such products fall outside the edible red-rice class; they only fail to support globally normalizing the product modifiers away.

Keep brown rice as a potentially overlapping milling distinction, not a synonym. OQLF specifically assigns *riz cargo* to hulled rice / brown rice, and the live catalog already owns that alias under `ingredient-ref-brown-rice` [S08]. Do not move `riz cargo` to red rice or create a red-by-milling cross-product on this terminology evidence. The separate `roasted red rice flour` reference remains a flour/process product, not an alias or form of whole red rice.

## Source-to-claim table

The following source IDs are unique to this proposal packet.

| Source ID | Source | Claim supported and limit |
| --- | --- | --- |
| `WP03-RRQ-20261011-S01` | OQLF, [*riz mexicain*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26578859/riz-mexicain), GDT, updated 2025. | Defines *riz mexicain* as a prepared rice dish and lists `Mexican rice`, `Mexican red rice`, and `Spanish rice` as English terms. Supports excluding this prepared dish wording from the raw edible-grain identity; it does not define the French name for raw red rice. |
| `WP03-RRQ-20261011-S02` | Translation Bureau, [TERMIUM Plus search record for `levure de riz rouge`](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=19&i=&index=frr&lang=fra&sg_kp_wet=2043403&srchtxt=FERMENTATION+LEVURE), record dated 2013-11-22. | Gives `red yeast rice` / `red koji rice` and French `levure de riz rouge` in a non-surgical-treatment context; the context describes fermentation on rice. Supports a separate fermented product boundary, not a generic raw-grain alias. The targeted TERMIUM search did not yield a clearer raw edible red-rice French display; this is not proof that no such wording occurs elsewhere. |
| `WP03-RRQ-20261011-S03` | Government of Canada, [Food Quality Specifications — Rice (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf), Table 2, FQS-22-02. | Gives a separate `Red Rice` food entry describing a generally unhulled or partially hulled, red-bran grain. Supports the edible-food boundary and English display. This is a federal procurement food specification, not a Québec terminology ruling. |
| `WP03-RRQ-20261011-S04` | Government of Canada, [Spécifications sur la qualité des aliments — Riz (français)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf), tableau 2, SQA-22-02. | Gives the corresponding food entry `Riz rouge` and describes the red bran coloring the cooked dish. Directly supports the existing French display within the specification’s food scope; it does not establish additional Québec synonyms. |
| `WP03-RRQ-20261011-S05` | Metro Québec, [Cedar Phoenicia *Riz rouge*, 907 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/riz/riz-rouge/p/062356542504). | The current French listing title and ingredient declaration both say `Riz rouge`. This is local retail wording for one product. Metro’s page may redirect to its English rendering depending on locale; the French-indexed product listing was reviewed. Its displayed stock state is variable and is not used as an availability claim. |
| `WP03-RRQ-20261011-S06` | Metro Québec, [Cha’s Organics *Riz rouge de Ceylan biologique*, 900 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/riz/riz-rouge-de-ceylan-biologique/p/806253417127). | Shows a named regional product in French. The ingredient line says only organic rice, so the listing does not establish a red-bran test, cultivar, or equivalence to every red-rice product. It is not a basis for adding the full title as a generic alias. |
| `WP03-RRQ-20261011-S07` | Maxi Québec, [Rooster *Riz complet rouge*, 2 kg](https://www.maxi.ca/fr/alimentation/garde-manger/riz/c/28248?page=4). | Current French product listing shows a qualified product title. It does not define the product’s processing or show that `riz complet rouge` is interchangeable with generic `riz rouge`; retain the qualifier and do not activate it as an alias. |
| `WP03-RRQ-20261011-S08` | OQLF, [*riz cargo*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432771/riz-cargo), GDT. | Defines *riz cargo* as rice whole without its husk, pairs it with `hulled rice`, and identifies brown rice in its note. Supports leaving the existing alias with brown rice, not red rice. The entry is dated 1982 and is used only for this established terminology/collision boundary. |

## Catalog collision audit

Pre-integration snapshot on 2026-10-11: **1,088 ingredient references** and **79 forms**. No catalog record is proposed, so the expected canonical delta is zero.

| Exact normalized term | Current owner or finding | Resolution |
| --- | --- | --- |
| `red rice`; `riz rouge` | `ingredient-ref-red-rice`, exact English/French displays; alias arrays empty. | Retain both displays; no alias. |
| `brown rice`; `riz cargo`; `hulled rice` | `ingredient-ref-brown-rice`; `riz cargo` and `hulled rice` are its existing aliases. | Keep separate as a milling distinction; do not reassign `riz cargo`. |
| `black rice`; `riz noir` | Separate `ingredient-ref-black-rice`. | Keep separate color identity. |
| `roasted red rice flour`; `farine de riz rouge torréfiée` | Separate `ingredient-ref-roasted-red-rice-flour` in `FLOUR_AND_STARCH`. | Do not collapse flour or its roast qualifier into whole red rice. |
| `Mexican red rice`; `riz mexicain`; `riz à la mexicaine` | No exact live catalog key. | Hold out of red-rice grain aliases; OQLF identifies the English wording with the prepared dish [S01]. |
| `red yeast rice`; `levure de riz rouge`; `red rice vinegar`; `vinaigre de riz rouge`; `riz rouge complet` | No exact live catalog key. | Add none. The yeast product is separately named by TERMIUM; vinegar has no evidence in this review; `complet` remains product-qualified [S02, S07]. |
| Legacy import candidates | No legacy candidate matched `red rice`, `riz rouge`, `riz cargo`, or `red cargo rice`. | No migration or alias action. |

The collision check compared normalized displays and aliases across the complete active reference array. The active red-rice row has no forms, density, unit mappings, recipe measurements, conversions, yields, or substitution rules.

## Recipe-demand audit

The audit followed all **114 recipe paths listed in `manifest.v1.json`** and read every `ingredients[]` line: **1,123 ingredient lines**. It checked each line’s original text, ingredient name/reference ID, preparation, and notes, plus the serialized recipe files, for red-rice wording and relevant product/dish boundaries: `red rice`, `riz rouge`, `red cargo rice`, `riz cargo`, `riz complet rouge`, `Mexican red rice`, `riz mexicain` / `riz à la mexicaine`, `red yeast rice` / `levure de riz rouge`, and red-rice vinegar wording. Result: **0 matching ingredient lines and 0 matching recipe files**. No recipe-linked display, alias, form, measurement, or substitution change is supported.

## Integration disposition and holds

**Can be accepted:** the independent Québec wording review supports retaining the current pair `red rice / riz rouge` for the bounded edible red-bran food identity.

**No catalog integration proposed:** no display edit, alias, reference, form, density, unit mapping, recipe link, conversion, yield, or substitution. Keep the exact product and prepared-dish modifiers out of the generic alias arrays. A future recipe naming a particular regional or cultivar product should be reviewed against that recipe’s exact source and product description before linking.

## Validation notes

- Read the project instructions, relevant plan and workflow sections, active catalog records/forms, red-rice integration batch, previous residual-cereal proposal, ledger records, and legacy candidate file before review.
- Verified the live reference/form counts and manifest recipe-line audit by read-only local scripts; no canonical file was edited.
- Research-only proposal. No app tests were run.
- Source IDs `WP03-RRQ-20261011-S01` through `S08` were checked for uniqueness against project documentation.
