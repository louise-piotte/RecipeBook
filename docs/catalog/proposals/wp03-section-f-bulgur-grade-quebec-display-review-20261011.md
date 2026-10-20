# Independent Québec French review: coarse bulgur displays

**Review date:** 2026-10-11  
**Scope:** Independent wording review of the active coarse and extra-coarse bulgur form displays.  
**Disposition:** Retain both labels as written, with each form scoped to the federal bilingual class named in its note. This is a display review only; no shared data change is proposed.

## Recommendation

| Active form | Current English / French display | Recommendation | Exact scope and limit |
| --- | --- | --- | --- |
| `ingredient-form-bulgur-coarse-grind` | `coarse bulgur` / `boulgour gros` | **Retain** | `boulgour gros` is the exact French wording paired with federal No. 3 `Coarse`. A Québec product page and a current Montréal grocery listing also use coarse-bulgur wording, though their product is not crosswalked to federal No. 3. |
| `ingredient-form-bulgur-extra-coarse-grind` | `extra coarse bulgur` / `boulgour extra gros` | **Retain, federal No. 4 scope only** | `boulgour extra gros` is the exact French wording paired with federal No. 4 `Extra coarse`. I did not find a current Québec/Canadian retail listing using that exact French phrase for this federal class; do not describe it as established retail-preferred wording. |

No spelling or display revision is supported. In particular, do not generalize federal No. 3/No. 4 terms to manufacturer-specific grades, assign numeric grade aliases, or map the Montréal listing’s `Boulgour Extra Extra Grossier / Extra Extra Coarse Bulgur` to No. 4. OQLF and TERMIUM support the underlying ingredient name, not the grind labels. The existing `notesFr` / `notesEn` grade qualifications should remain. Keep aliases and match terms empty; no density, measurement, conversion, yield, or substitution behavior follows from this terminology evidence.

## Evidence and source limits

The bilingual Department of National Defence food-purchase specification directly pairs federal No. 3 `Coarse / gros` and No. 4 `Extra coarse / extra gros`. It is a federal procurement specification, not a claim about the only retail taxonomy used in Québec or Canada. It also says there are four North American sizes, Nos. 1–4, but then lists No. 5 `Half Cuts / mouture très grossière`. Preserve that internal inconsistency; do not infer a universal class hierarchy or treat No. 5 as a synonym for No. 4.

OQLF’s GDT entry identifies `boulgour` as the preferred Québec French base term and lists `boulghour`, `bulgur`, and `bulghur` as variants. TERMIUM’s milling/cereal record likewise treats these as names for the base product. Neither entry classifies grind sizes. Their silence on the forms is not evidence against the federal labels, but it means they cannot be cited as Québec terminology approval for `gros` or `extra gros`.

For the coarse label, a Québec seller’s current page lists a coarse bulgur product, but the heading is misspelled `Boulgur Gros`; the ingredient and preparation text use `boulgour`. Do not adopt the misspelling. A current Montréal supermarket marketplace listing gives `Boulgour Gros Brun / Brown Coarse Bulgur`, and Duru’s French product page uses `Boulgour Gros Brun`. These support the French coarse descriptor in product names; they do not state federal No. 3 or establish a shared particle-size threshold. The color qualifier `brun` is product wording, not a grind alias.

For extra coarse, the federal specification is the direct Canada-wide French class source. The Montréal marketplace lists `Boulgour Extra Extra Grossier / Extra Extra Coarse Bulgur`, a different product label, while a French B2B distributor lists Duru `Boulgour extra gros`. These are useful cautions about market and manufacturer wording, not a crosswalk to federal No. 4. Because the exact current Québec/Canadian No. 4 French retail label was not located, retain `boulgour extra gros` only as the federal No. 4 display and make no prevalence claim.

## Collision and demand audit

Snapshot before this review packet is integrated: **1,088 ingredient references, 79 forms, and 114 manifest-listed recipes**. The bulgur identity is `ingredient-ref-bulgur` (`bulgur / boulgour`) and has exactly four active dry grind forms: `boulgour fin`, `boulgour moyen`, `boulgour gros`, and `boulgour extra gros`. No active form or reference duplicates either proposed display. The separate `ingredient-ref-cracked-wheat` owns `cracked wheat / blé concassé`; do not add `blé concassé` as a bulgur alias. Wheat berries remain another separate identity. `docs/catalog/legacy-import-identities.v1.json` contains no bulgur/boulgour entry.

I checked every ingredient line in each of the **114 recipes listed by the active seed manifest**: **1,123 ingredient lines; zero bulgur/boulgour matches**. There is no bundled recipe demand for either coarse form. The label decision rests on terminology evidence, not recipe-linked demand.

## Source-to-claim table

All sources were checked on 2026-10-11. The source IDs below are new and unique to this packet; the prefix was searched in `docs/` and the bundled seed package before writing.

| Source ID | Source | Claim supported | Limits |
| --- | --- | --- | --- |
| `WP03-SECTION-F-BULGUR-QC-DISPLAY-20261011-S01` | [OQLF, GDT: `boulgour`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502438/boulgour), entry last updated 2016 | Preferred Québec French base term, definition, and listed term variants. | No coarse or extra-coarse grades. |
| `WP03-SECTION-F-BULGUR-QC-DISPLAY-20261011-S02` | [TERMIUM Plus, “bulgur” search / milling and cereal record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enb&lang=eng&srchtxt=BULGUR), record dated 2007-04-16 | Supports base-product names `bulgur` / `boulghour` and its processed-wheat identity. | No grind-grade French display. The old record is used only for its terminology content. |
| `WP03-SECTION-F-BULGUR-QC-DISPLAY-20261011-S03` | [Department of National Defence, Food Quality Specifications: Grains, French and English bulgur sections](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf) ([English edition](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf)), dated 2018-04-01, §§19–27 | Direct bilingual pairs: No. 3 `Coarse / gros`; No. 4 `Extra coarse / extra gros`; No. 5 `Half Cuts / extra large grind` and `mouture très grossière`. | Federal food-purchase specification. Its four-size statement conflicts with the separate No. 5 entry; it does not establish equivalence to any brand’s grades or retail SKUs. |
| `WP03-SECTION-F-BULGUR-QC-DISPLAY-20261011-S04` | [Artisan Tradition, Grains / Céréales](https://www.artisan-tradition.ca/grains-cereals), Québec product page, no date shown | A Québec seller lists a coarse bulgur product and gives preparation text calling it `boulgour`. | Heading is misspelled `Boulgur Gros`; not a correct-display citation and no federal grade is stated. |
| `WP03-SECTION-F-BULGUR-QC-DISPLAY-20261011-S05` | [Duru Bulgur, Boulgour Gros Brun](https://durubulgur.com/fr/produitsfr/boulgour-gros-brun), manufacturer product page | Current French-language product name uses `boulgour gros`. | Brand product; no federal No. 3 crosswalk, and the page’s product origin is Turkey, not Québec. |
| `WP03-SECTION-F-BULGUR-QC-DISPLAY-20261011-S06` | [Supermarché Orkida, Montréal grocery listing on Uber Eats](https://www.ubereats.com/ca/store/supermarche-orkida/YhOlu13JV8Sbo4o23ju_yA), page crawled three weeks before review | Current local marketplace wording pairs `Boulgour Gros Brun` with `Brown Coarse Bulgur`; it separately lists `Boulgour Extra Extra Grossier / Extra Extra Coarse Bulgur`. | Retail marketplace text, not a grade specification; no federal class mapping is provided. Do not map the extra-extra-coarse listing to No. 4. |
| `WP03-SECTION-F-BULGUR-QC-DISPLAY-20261011-S07` | [OPA Distribution, Duru product-family listing](https://www.opadistribution.fr/duru-c102x4094168), page crawled within the week before review | French B2B listings distinguish Duru `Boulgour ... GROS` and `... EXTRA GROS`. | France-based distributor and manufacturer-specific product names; not evidence of Québec usage or a federal-grade crosswalk. Its `blé concassé (boulgour)` catalogue heading is not adopted as an alias because cracked wheat is a separate active catalog identity. |

## Integration and validation notes

- **Can be integrated:** No catalog edit is requested. Preserve both active French displays as currently stored. If the coordinator records a wording-review decision, scope the coarse display to federal No. 3 and extra-coarse to federal No. 4; retain the existing warnings against No. 5 and manufacturer-grade conflation.
- **Held / not supported:** Québec-retail-preferred status for `boulgour extra gros`; any equivalence between federal No. 3/No. 4 and manufacturer grades; No. 5 `mouture très grossière` as a synonym of either form; color-qualified aliases; `blé concassé` as a bulgur alias; numeric or conversion behavior.
- **Checks performed:** Read-only inspection of current forms, references, the catalog plan, prior bulgur proposal and integration notes, ledger references, and legacy candidates; source-ID prefix collision search; manifest-based scan of all 1,123 recipe ingredient lines. No application tests were run; this packet is research-only.
- **Write scope:** This proposal file only.
