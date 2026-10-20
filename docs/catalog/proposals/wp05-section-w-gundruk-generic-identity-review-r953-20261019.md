# WP05 Section W R953 generic preserved-food identity review: gundruk

- **Reviewed:** 2026-10-19.
- **Packet type:** Integrated identity and boundary review. Added the generic identity and scoped evidence to the shared catalog and ledger; see the [R951–R953 integration README](../batches/wp02-wp03-wp05-r951-r953-generic-gap-integration-20261019/README.md).
- **Plan anchor:** Section W leaves “further documented regional preserves” open at [the global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10350); R950 has since integrated sinki while explicitly keeping it distinct from gundruk.
- **Recommendation:** Integrated one identity-only `gundruk` reference in `SAUCE_AND_CONDIMENT`. Use the borrowed name `gundruk` in both English and fr-CA, with the French display explicitly provisional. The evidence supports a named Himalayan fermented leafy-vegetable food, distinct as a culinary identity from sinki and other nearby preserves, while not supporting a strict plant-part boundary in every regional account.
- **Scope:** Commercial brands, product lines, flavour families, SKUs, and retailer variants are out of scope because commercial-product counts do not add ingredient diversity. No such roster was researched. Existing rows and evidence remain intact; no merge or deletion is proposed.

## Ownership, aliases, source IDs, and prior hold

At the audit snapshot, the bundled seed has **1,970 ingredient references and 205 forms**, the legacy-import file has **55 candidates**, and the research ledger has **2,375 records**. Case-folded and punctuation-insensitive searches for `gundruk`, `gundruck`, `gundrook`, `gundruk ko jhol`, `गुन्द्रुक`, and descriptive fermented-leaf wording found no active reference, form, or legacy candidate for this identity. The proposed ID `ingredient-ref-gundruk` is unowned. No matching R953 source-ID prefix or dedicated gundruk ledger record exists.

The one current ledger hit for `gundruk` is contextual: the accepted `ingredient-ref-sinki` boundary decision says to keep sinki distinct from gundruk. It is not an owner or a gundruk source record. The active sinki row is `sinki / sinki`, category `SAUCE_AND_CONDIMENT`, with no aliases or forms. Its existing source IDs—including `WP05-W-PICKLED-RADISH-20261012-S12` and `WP05-SECTIONW-SINKI-R950-20261019-S03`—remain assigned to sinki; they are not reassigned to the proposed gundruk identity. The 1983 gundruk paper was previously cited as WP06 source S23, but it has no dedicated current ledger owner; this review gives its claim a new, unique R953 source ID.

The prior WP06 South Asia sweep held gundruk while asking for clearer substrate scope and a Québec-facing French term. Its historical retailer citation is not used here. Primary literature and Nepal government sources now resolve the generic culinary identity and substrate boundary; no Québec French term was found, so the language field remains borrowed and provisional.

| Nearby active identity | Current scope | Boundary retained for gundruk |
|---|---|---|
| `ingredient-ref-sinki` — `sinki / sinki` | Separately named Himalayan fermented-radish food. The existing primary study defines a radish tap-root product; the R950 review preserves a government report’s regional root-and-leaf variation. | Keep both named foods. The comparative study treats gundruk and sinki as separate fermented products, but the regional leaf variation means the distinction should not be encoded as a universal root-versus-leaf rule. Do not alias or merge. |
| `ingredient-ref-mustard-greens` and `ingredient-ref-radish-leaves` | Raw leafy vegetables. | These remain ingredient substrates, not forms or aliases of the prepared fermented food. |
| `ingredient-ref-pickled-mustard-greens` and `ingredient-ref-takana-zuke` | Generic pickled mustard greens and a named Japanese mustard-green preserve. | Gundruk may use mustard-family leaves, but shared raw material does not establish prepared-product equivalence. Add no aliases or crosswalks. |
| `ingredient-ref-pickled-radish` | Generic salt-and-vinegar pickled-radish class. | Keep distinct; neither the word “pickle” in a use description nor shared radish material makes gundruk an alias or form. |
| `ingredient-ref-fermented-bamboo-shoots` | Fermented bamboo-shoot product class. | Separate substrate and named product identity; no alias or form relation. |
| `khalpi` | The comparative study names this separately as a cucumber ferment; no active gundruk or khalpi owner was found. | Do not add khalpi or use it as a gundruk alias in this packet. |

## Recipe-demand scan

All **114** bundled recipe JSON files and **1,123** ingredient rows were scanned, including full serialized recipe text. The bounded query set (`gundruk`, `gundruck`, `gundrook`, `gundruk ko jhol`, `गुन्द्रुक`, `fermented leafy greens`, `fermented leafy vegetable`, `sinki`, `khalpi`, and `pickled mustard greens`) returned no recipe hits. This lexical scan does not rule out an unstated culinary use, but it gives no direct recipe demand and supports adding no recipe link or recipe-derived measure.

## Identity and evidence limits

Karki et al.’s primary study names gundruk as a Nepalese non-salted fermented vegetable product made especially from mustard, rape, and radish vegetables. It supports a named fermented-food identity across more than one leafy substrate; it does not establish a single recipe or a botanical species requirement. The fermentation timing and acidity observations in that study are experimental/source-specific and are not proposed as generic data. [S01]

A comparative study of Eastern Himalayan fermented vegetables treats gundruk, sinki, and khalpi as separately named products and analyses separate sample groups. Read with the sinki tap-root study already retained on the active sinki ledger row, this supports separate culinary identities. It does not establish that gundruk and sinki never share a leafy substrate; R950 already retains regional sinki plant-part variation. Keep the identities separate by their attested named-food usage, not by a universal botanical exclusion. [S02; existing sinki sources S12 and R950-S03]

Nepal’s Department of Food Technology and Quality Control describes gundruk as a non-salted fermented and dried vegetable product prepared by spontaneous lactic fermentation of green leafy vegetables. Its source lists multiple vegetables, including mustard, rayo, cauliflower, cabbage, and radish. This government bulletin corroborates a broad leafy-ferment class but is a baseline study, not a universal compositional or production standard. A Nepal government agrobiodiversity survey also describes gundruk as fermented leafy greens that are dried and used in curries, pickles, and stews; that account supports culinary pantry use in its surveyed context, not a fixed formula for all regions. [S03–S04]

Targeted OQLF searches did not surface a Québec-specific French term for gundruk. Keep `nameFr: "gundruk"` as a provisional borrowed display; do not add a descriptive French alias such as `feuilles fermentées` or a claimed standardized translation. No manufacturer, brand, retailer, or product-specific evidence is needed for this generic identity.

## Proposed minimal data and ledger states

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-gundruk` |
| `nameEn` | `gundruk` |
| `nameFr` | `gundruk` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English / French aliases | None |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| Forms, recipe links, measurements, conversions, yields, substitutions | None |

The ledger records `recordType: ingredient_reference`, `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, keyed by `ingredient-ref-gundruk`. Source-specific fermentation times, acidity values, drying observations, and processing results stay out of generic fields. No global form conversion or ingredient substitution was inferred from soup, pickle, curry, or stew uses. The fr-CA display remains provisional. No claim was transferred from a branded row and no existing row was changed.

## Source register

Sources were reviewed online on 2026-10-19. New source IDs `WP05-SECTIONW-GUNDRUK-R953-20261019-S01` through `S04` are recorded on the gundruk ledger row. The existing sinki source IDs below remain with their current record.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-GUNDRUK-R953-20261019-S01` | Karki, Okada, Baba, Itoh, and Kozaki, [“Studies on the Microflora of Nepalese Pickles Gundruk”](https://www.jstage.jst.go.jp/article/nskkk1962/30/6/30_6_357/_article), *Nippon Shokuhin Kogyo Gakkaishi* 30(6), 1983, abstract. | Primary study names gundruk as a non-salted fermented Nepalese vegetable product, especially from mustard, rape, and radish vegetables. Its fermentation time, acidity, and laboratory findings are study-scoped, not catalog defaults. The same paper was cited historically as WP06 S23; this R953 ID is new. |
| `WP05-SECTIONW-GUNDRUK-R953-20261019-S02` | Tamang et al., [“Identification of predominant lactic acid bacteria isolated from traditionally fermented vegetable products of the Eastern Himalayas”](https://doi.org/10.1016/j.ijfoodmicro.2005.04.024), *International Journal of Food Microbiology* 105(3), 2005, abstract. | Primary comparative study treats gundruk, sinki, and khalpi as separately named fermented products and analyses separate samples. It supports keeping the product identities distinct; it is not a universal substrate or preparation standard. |
| `WP05-SECTIONW-GUNDRUK-R953-20261019-S03` | Nepal Department of Food Technology and Quality Control, [Annual Bulletin 2082](https://www.dftqc.gov.np/downloadfiles/DFTQC-Annual-Bulletin-Eng-2082-Book-for-WEB-%281%29-1779272721.pdf), section 3.9.1, p. 34. | Government source describes non-salted fermented and dried gundruk made by spontaneous lactic fermentation of green leafy vegetables and lists several vegetable substrates. The baseline-study context does not define a universal recipe or permit copying its sample/process measurements into generic data. |
| `WP05-SECTIONW-GUNDRUK-R953-20261019-S04` | National Agriculture Genetic Resources Center / Nepal Agricultural Research Council, [Baseline Agrobio Survey Report: Mustang (2025)](https://giwmscdnone.gov.np/media/pdf_upload/Mustang%20Baseline_pqqp1x2.pdf), Annex 7, PDF pp. 80–81. | Government survey describes gundruk as fermented leafy greens that are dried and used in curries, pickles, and stews. It corroborates local culinary use, not a fixed formulation or Québec French term. |
| **Existing, retained:** `WP05-W-PICKLED-RADISH-20261012-S12` | Tamang and Sarkar, [“Sinki: A Traditional Lactic Acid Fermented Radish Tap Root Product”](https://www.jstage.jst.go.jp/article/jgam1955/39/4/39_4_395/_article/-char/en), *Journal of General and Applied Microbiology* 39(4), 1993, abstract. | Already attached to the pickled-radish boundary and active sinki ledger record; it identifies sinki as a named fermented-radish product. Keep this source ID and its current evidence ownership intact. Its process optimization is study-specific. |
| **Existing, retained:** `WP05-SECTIONW-SINKI-R950-20261019-S03` | Government of Nepal RERP, [Indigenous Food Practices within RERP Working Areas](https://rerp.moics.gov.np/storage/download_file/oayVvOIBoUyCGdgzg3gvlIdY724MyT7kuGBeCzPm.pdf), p. 15. | Already attached to the sinki record; the R950 review uses it to preserve regional root-and-leaf variation. Do not move or reuse its ID as a gundruk source. |

**Disposition:** Integrated one generic, identity-only gundruk row with a provisional borrowed French display; sinki and all nearby identities and evidence remain intact. Section W’s broader regional-preserve work remains open. No roster-only commercial task was pursued because product counts do not add ingredient diversity. No software tests were run because the change adds ingredient database JSON under `AGENTS.md`.
