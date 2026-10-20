# WP02 B4 — Breadfruit flour residual boundary review

- **Reviewed:** 2026-10-10
- **Status:** Coordinator proposal only. This review changes no catalog, ledger, recipe, checklist, roadmap, code, or test file.
- **Scope:** Breadfruit flour only. The B4 checklist still covers other regional root and fruit flours, which are outside this review.
- **Source IDs:** `WP02-BREADFRUIT-RESIDUAL-20261010-S01` through `S10`. The prefix was collision-checked against the current ledger and `docs/catalog` files before writing. These are proposal-local IDs, not ledger entries.

## Recommendation

Retain the separate identity-only reference already present as `ingredient-ref-breadfruit-flour`:

| Field | Recommendation |
|---|---|
| English display | `breadfruit flour` |
| Proposed Québec French display | `farine de fruit à pain` |
| Category | `FLOUR_AND_STARCH` |
| Product boundary | Dried, milled edible flesh of *Artocarpus altilis*, consistent with the existing breadfruit reference. Do not extend this row automatically to hybrid-only products, seeds, breadnut-labeled products, or peel. |
| Aliases | None |
| Forms, recipe links, density, unit mappings, conversions, yields, substitutions | None to activate |

The product merits a distinct flour identity from fresh breadfruit and from extracted breadfruit starch. FAO/WHO Codex’s regional committee proposed a separate standard for commercially distributed breadfruit flour for direct human consumption, scoped to edible *A. altilis*. CAC48 approved the new work in 2025; the current Codex e-working-group page still reports the work as active. This is strong evidence that the flour is a distinct processed food class, but the standard is still in development and is not a final legal or Québec naming ruling. [S01–S02]

Keep `farine de fruit à pain` as the current French display, but mark it provisional pending independent Québec review. OQLF supports `fruit à pain` and `fruit de l’arbre à pain` for the fruit and gives English `breadfruit`; it does not provide a flour entry. The exact compound `farine de fruit à pain` is attested by the 2014 French-language Pacific Community leaflet, not by an OQLF entry or a Québec product listing located in this review. [S04–S05]

## Existing-state audit and checklist status

The live package already contains `ingredient-ref-breadfruit-flour`, with the displays above, empty alias arrays, category `FLOUR_AND_STARCH`, `defaultDensity: null`, and no unit mappings. The separate active fruit reference is `ingredient-ref-breadfruit / fruit à pain / breadfruit`, category `FRUIT`, with `fruit de l’arbre à pain` as its French alias. No matching form or legacy-import candidate was found. The breadfruit-flour ledger record is marked identity-verified; measurement and substitution research remain not yet researched.

There is a status mismatch to keep in view: the plan’s B4 parent item remains open for the broader regional-flour set, while its nested line for adding breadfruit, tigernut, yam, and taro flours is checked. The B4 row in `docs/catalog/batches/baking-flours-starches.md` still describes breadfruit flour as open. The identity-only breadfruit decision has already been integrated; its unresolved Québec wording, measurements, and substitutions do not justify removing the broader B4 parent item or claiming those data are complete.

## Product and name boundaries

FDA’s 2016 response describes the notified breadfruit flour as made from breadfruit flesh: fruit is harvested before full ripeness, peeled and cored, sliced, dehydrated, and milled. The notice includes *A. altilis* and *A. altilis × A. mariannensis* hybrids, but FDA explicitly says its use of “breadfruit flour” is not an endorsement of that name for ingredient labeling. Keep the catalog candidate aligned to its narrower existing *A. altilis* fruit identity; do not use FDA’s broader notice to merge hybrid-only products into it. [S03]

Keep the following terms inactive as flour aliases:

- `breadfruit` and `fruit à pain` identify the fresh fruit reference as well as the flour’s source; neither is a flour alias.
- `fruit de l’arbre à pain` is already a French alias of the fruit reference, not the flour.
- `breadnut flour` is unsafe as a global alias. Kew notes overlapping seeded-breadfruit/breadnut usage; a primary study separately describes seed flour made from *Artocarpus camansi*. Seed flour is not the flesh flour in this candidate. [S06–S07]
- `breadfruit powder` is not established here as a universal synonym. Powder wording can be product-specific and does not prove the same preparation or grade.
- `ʻulu flour` / `ulu flour` is not promoted from a regional fruit name to a global flour alias.
- `breadfruit starch` is a distinct extracted product. A peer-reviewed review describes starch isolation as an additional water-slurry, separation/centrifugation, and drying process after flour/raw material preparation. Do not map flour and extracted starch to one reference. [S08]

The proposed English name is widely used in the FDA notice and the Codex work proposal. The French display is a transparent compound built from the OQLF-supported fruit name and is directly attested in French regional use. I found no Québec-specific flour entry, Canadian French label, or Québec retail listing confirming that full compound; keep the display provisional rather than add unsourced French variants.

## Recipe demand

A read-only scan of all 114 manifest-listed recipe files and their 1,123 ingredient rows found no matching recipe text or ingredient line for `breadfruit`, `breadfruit flour`, `farine de fruit à pain`, `fruit à pain`, `breadnut flour`, `breadfruit powder`, or `ulu`/`ʻulu flour`. No recipe link or recipe-specific conversion is supported by the current bundled corpus.

## Measurement and density evidence

The active reference’s density remains null and its unit-mapping list is empty. Research found study-specific bulk-density observations, but not a standardized kitchen-volume conversion:

| Evidence | Result | Scope and limit |
|---|---:|---|
| Huang et al. (2019), two commercial *A. altilis* flours | 0.70 and 0.52 g/cm³ | Samples sourced from Samoa and Costa Rica. The study placed 50 g in a 100 mL cylinder and gently tapped it to constant volume. These are method- and product-specific bulk densities for packing/handling, not scoop or cup weights. [S09] |
| Rasyita et al. (2024), Buton breadfruit flour | 0.66 g/mL | The flour was made from mature flesh, steamed, dried to 5–8% moisture, milled, and passed through an 80-mesh sieve; the paper identifies a bulk-density method but does not give enough detail in the accessible method text to harmonize it with Huang et al. [S10] |

The spread among the reported products and methods does not support a single default recipe density. No reliable product-specific cup, tablespoon, or other kitchen-volume mass was found. Keep density, unit mappings, and conversions unavailable; do not convert the bulk-density figures into household measures.

## Substitution evidence

The Pacific Community leaflet says breadfruit flour can substitute for wheat flour “in many recipes,” but supplies no replacement ratio or formula in that general statement. It is regional culinary guidance, not an interchangeable one-for-one rule. [S05]

One 2024 primary cake study tested breadfruit-to-wheat flour ratios of 100:0, 75:25, 50:50, 25:75, and 0:100. The 25% breadfruit / 75% wheat cake scored highest for overall preference among its tested formulations; cake expansion was 66.67% for that formulation and 89.80% for the all-wheat control. That supports only a formulation-specific partial replacement direction in that cake study. It does not establish a general percentage, a one-for-one swap, an inverse substitution, or a rule for other baked goods. [S10]

Since the bundled recipes contain no breadfruit-flour demand, keep all substitution rules inactive. The studies can inform a future recipe-specific review but do not support a global ingredient-to-ingredient rule.

## Evidence register

All sources were accessed 2026-10-10. The first two sources establish the current standards-development status; neither is treated as a final standard.

| ID | Source and evidence limit |
|---|---|
| **S01** | FAO/WHO Codex Alimentarius, [REP25/NASWP, Appendix V: Proposal for new work on a regional standard for breadfruit flour](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FShared+Documents%252FWeb%252FWeblinks%252FNew+Works%252FAppendix_V_REP25_NASWPe.pdf), 2025. Defines the proposed commercial product scope as flour for direct human consumption obtained from edible *A. altilis*. This is a new-work proposal, not an adopted specification. |
| **S02** | FAO/WHO Codex Alimentarius, [e-working group: regional standard for breadfruit flour](https://www.fao.org/fao-who-codexalimentarius/committees/ewg/detail/en/c/1758120/), live page accessed 2026-10-10. Reports an active group, Samoa as lead host, Australia and Fiji as co-hosts, and a comments deadline of 2026-09-18. The page is in English and does not confirm a Québec French term. |
| **S03** | U.S. FDA, [Agency Response Letter, GRAS Notice No. GRN 000596](https://www.fda.gov/food/gras-notice-inventory/agency-response-letter-gras-notice-no-grn-000596), 2016-02-21. Describes breadfruit flour from flesh and a small-scale drying/milling process, includes specified hybrids, and expressly disclaims endorsing “breadfruit flour” as a common or usual ingredient-label name. |
| **S04** | Office québécois de la langue française, [fruit de l’arbre à pain (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297101/fruit-de-larbre-a-pain), last updated 1990. Lists `fruit de l’arbre à pain` and `fruit à pain`, English `breadfruit`, and *Artocarpus altilis*. It names the fruit, not the flour. |
| **S05** | Secretariat of the Pacific Community, [Le fruit à pain](https://www.ccima.wf/images/a-la-une/2025/march%C3%A9_du_magisi/Fiche5-le-fruit-a-pain.pdf), leaflet no. 5, version 2014, pp. 4–5. Uses `farine de fruit à pain`, describes dried fruit pounded or milled and sifted, and gives broad wheat-flour substitution advice without ratios. This is French Pacific-region usage, not Québec terminology authority. |
| **S06** | Royal Botanic Gardens, Kew, [*Artocarpus altilis*](https://powo.science.kew.org/taxon/urn%3Alsid%3Aipni.org%3Anames%3A582598-1/general-information), current Plants of the World Online page. Documents breadfruit identity and the overlap of seed-bearing varieties with “breadnut” wording. Common-name ambiguity does not support an alias. |
| **S07** | Alcon, Barrion, and Nguyen-Orca, [“Proximate Composition, Antioxidant Capacity and Functional Properties of Breadnut Seed Flour (*Artocarpus camansi*)”](https://doi.org/10.24925/turjaf.v9i8.1495-1499.4319), *Turkish Journal of Agriculture—Food Science and Technology*, 2021-09-03. Primary research on seed flour from *A. camansi*; it does not establish equivalence to breadfruit flesh flour. |
| **S08** | Mehta, Quek, and Henry, [“Breadfruit (*Artocarpus altilis*): Processing, nutritional quality, and food applications”](https://www.frontiersin.org/journals/nutrition/articles/10.3389/fnut.2023.1156155/full), *Frontiers in Nutrition*, 2023-03-16. Peer-reviewed review distinguishing flour and isolated starch, including the additional extraction/separation step; it is a secondary synthesis, not a standard. |
| **S09** | Huang, Martinez, and Bohrer, [“The Compositional and Functional Attributes of Commercial Flours from Tropical Fruits (Breadfruit and Banana)”](https://www.mdpi.com/2304-8158/8/11/586), *Foods*, 2019-11-19. Primary comparison of two commercial *A. altilis* flours; reports bulk density of 0.70 and 0.52 g/cm³ using a tapped-cylinder method. Values are sample observations, not household measures. |
| **S10** | Rasyita, Karimuna, and Faradilla, [“Karakteristik Fisikokimia Tepung Sukun (*Artocarpus altilis* L.) Asal Buton dan Aplikasi terhadap Cake”](https://jurnal-riset-pangan.uho.ac.id/index.php/journal/article/download/61/47/186), *Jurnal Riset Pangan*, 2024, vol. 2, no. 2, pp. 192–201. Primary study of Buton flour density and cake ratios; its results apply to the tested flour process and cake formula only. |
