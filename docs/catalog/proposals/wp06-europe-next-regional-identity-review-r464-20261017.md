# WP06 Europe — Fleur de sel de Guérande identity review (R464)

- **Reviewed:** 2026-10-17.
- **Status:** Accepted and integrated as an identity-only active reference. WP06 Europe remains open.
- **Checklist:** The Europe regional sweep remains open for Western, Southern, Northern, Central, and
  Eastern Europe in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9312).
  This review covers one French regional salt identity and does not complete that sweep.
- **Scope:** The named surface-harvested product **Fleur de sel de Guérande**, within the IGP
  `Sel de Guérande / Fleur de sel de Guérande`. Keep the existing generic `fleur de sel` row and
  other regional or flaky salts distinct.
- **Allocated source IDs:** `WP06-EUROPE-GUERANDE-FLEUR-DE-SEL-R464-20261017-S01` through `S04`,
  registered on the new ingredient-reference ledger record. The generic OQLF source and the
  San Francisco-specific measurement source are reused from the existing generic fleur de sel
  record. Repository audit label `WP06-EUROPE-GUERANDE-FLEUR-DE-SEL-R464-20261017-R01` remains
  proposal-local.

## Accepted decision

**Add one identity-only `BAKING_AND_SPICE` reference** for **`Fleur de sel de Guérande`**. INAO
lists the exact name as one of the two products under the IGP and distinguishes the surface-formed,
white, light, friable fleur de sel from the grey crystals that form on the clay bottom and are sold
as `Sel de Guérande`. The named fleur product therefore has a specific regional identity beyond
the active generic `fleur de sel` row. [S01]

Use the exact French product wording on both language names, with the Canadian English retail
hyphenation in `nameEn`. Leave aliases empty. OQLF records `fleur de sel` as the preferred Québec
French term and gives the same term in English; it supports the shared head phrase, not the
Guérande qualifier. [S02, S04; reused `WP07-SALT-20261010-S07`]

A Montréal retailer currently lists `Fleur de sel de Guérande - 125 g`, says it is imported from
French Atlantic salt marshes, and offers local delivery or pickup. That supports current Québec
wording and retail presence. The retailer does not identify the producer or display an IGP mark, so
the listing is not used as proof that this individual SKU is certified. The producer's
Canada-facing page separately says its Fleur de sel de Guérande follows the IGP specification.
[S02–S03]

### Integrated catalog row

| Field | Value |
|---|---|
| id | `ingredient-ref-fleur-de-sel-guerande-igp` |
| nameFr | `Fleur de sel de Guérande` |
| nameEn | `Fleur-de-Sel de Guérande` |
| aliasesFr / aliasesEn | empty / empty |
| defaultDensity | `null` |
| unitMappings | empty |
| category | `BAKING_AND_SPICE` |

`nameFr` follows the exact producer and Montréal retail phrase; `nameEn` follows the Canadian
English product title's hyphenated form, with the official French spelling of Guérande restored.
The product name remains French in English-language use. Do not add `IGP` as a display suffix or
alias: it is the designation's status, not part of the exact producer and local shelf names.

## Product and naming boundaries

- **Protected product:** INAO's current product page and linked legal record identify the IGP as
  `Sel de Guérande / Fleur de sel de Guérande`. It describes the fleur as surface crystals, unlike
  the grey salt formed at the clay bottom. This proposal allocates only the fleur product; it does
  not allocate generic `Sel de Guérande`, grey/coarse Guérande salt, or a second salt identity.
  [S01]
- **Generic fleur de sel:** Keep `ingredient-ref-fleur-de-sel` / `fleur de sel` unchanged. OQLF
  records the generic term in French and English and notes that the product is harvested in France
  and Portugal. Guérande is not made a generic alias, and the regional row does not replace the
  generic identity. [S04; reused `WP07-SALT-20261010-S07`]
- **Other salt classes:** Keep `flaky sea salt`, fine and coarse sea salt, table salt, and kosher
  salt separate. Do not alias `fleur de sel de Guérande` to `flaky sea salt`, `sea salt`, `sel de
  mer`, or `sel`.
- **French and English:** Keep the official French product name in both language fields, with only
  source-supported English-market punctuation. OQLF's English entry for the generic head term is
  also `fleur de sel`; no broader literal translation or English alias is needed. The English
  retailer page uses the French phrase, but its listing was sold out at review time. [S04; reused
  `WP07-SALT-20261010-S07`]
- **Market certification limit:** The Montréal listing's regional product wording is not a package
  certification check. The official INAO and producer pages establish the product designation;
  the retailer page supports Québec naming and availability only. Do not treat every product using
  a similar market phrase as independently verified by this review. [S01–S03]

## Live ownership and archive audit

Initial read-only workspace snapshot from 2026-10-17, preceding the R462 integration:

| Surface | Current count | Finding |
|---|---:|---|
| Active ingredient references | 1,747 | At proposal time, no Guérande, `Fleur de sel de Guérande`, or proposed-ID owner existed. The only direct owner was the broader `ingredient-ref-fleur-de-sel`, with no aliases. Other salt classes were separate. |
| Ingredient forms | 141 | No Guérande/Fleur de sel de Guérande label, match term, or proposed-ID owner. The generic fleur row has no attached form. |
| Legacy import candidates | 56 | No matching Guérande candidate or proposed-ID owner. |
| Research ledger | 2,106 records; 9,588 source entries; 8,135 distinct source IDs; 6,848 distinct source URLs | Proposal-time snapshot, before the R462 integration. At that time no Guérande identity record, proposed ID, R464 prefix, or new-source-URL collision existed. The generic `ingredient-ref-fleur-de-sel` record already used OQLF source `WP07-SALT-20261010-S07`; that source is reused, not duplicated. |
| Numeric and rule data | 8 unit conversions; 0 global substitutions; 0 contextual substitutions; 1 package yield; 30 unit definitions | The eight conversions are general unit factors. The sole package yield belongs to black beans. No Guérande-specific conversion, density, unit mapping, yield, or substitution was found. |
| Proposal and batch archive | Current catalog archive | Exact searches found no earlier Guérande salt proposal, review, hold, or integration. The recent Europe reviews R453 (grissino stirato), R457 (Turrón de Jijona), and R460 (Krokos Kozanis saffron), as well as the completed cheese, tomato, and piquillo reviews, concern distinct identities. The existing WP07 salt review covers generic salt classes and a source-specific fleur measurement, not this regional identity. |
| Integrated allocation | Checked after root integration | `ingredient-ref-fleur-de-sel-guerande-igp` and S01–S04 are now registered; their URLs were unique in the pre-integration ledger snapshot. The shared generic OQLF and measurement sources were reused without duplicate entries. |

The generic `ingredient-ref-fleur-de-sel` record has a measured `10.3 g/tbsp` observation for San
Francisco Salt Co. Fleur de Sel. Its source explicitly limits that value to the tested commercial
product. It is not a default density or a Guérande measurement and is not transferred to the
proposed row. [reused `WP07-SALT-20261010-S09`]

The audit covered the WP06 Europe checklist; all active bilingual reference names and aliases; form
labels, match terms, and owners; legacy candidate text; ledger record IDs, source IDs, and URLs;
proposal and batch archives; salt measurements, conversions, substitutions, and package yields;
picker implementation; manifest; and all bundled recipe files. Earlier Europe reviews and holds
were checked before selecting this distinct French salt identity. [R01]

## Phrase-first picker projection

The picker accent-folds case, diacritics, ligatures, and punctuation; it returns every reference
whose name or alias contains the full query as a word phrase before falling back to substring
matching. See [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).
The projection includes all current reference names, aliases, and attached form search terms. The
new row has no aliases or forms.

| Query | Current result | With proposed row |
|---|---|---|
| `fleur de sel` | `ingredient-ref-fleur-de-sel` | The generic row plus `ingredient-ref-fleur-de-sel-guerande-igp` |
| `Fleur de sel de Guérande` / `Fleur-de-Sel de Guérande` | No result | `ingredient-ref-fleur-de-sel-guerande-igp` only |
| `sel de Guérande` | No result | `ingredient-ref-fleur-de-sel-guerande-igp` only |
| `Guérande` | No result | `ingredient-ref-fleur-de-sel-guerande-igp` only |
| `fleur` | 10 matches | 11 matches, including the regional row; remains broad and non-singleton |
| `sea salt` | 3 matches | Same 3 matches; no English generic salt alias is added |

The only broad-family change is intentional: `fleur de sel` gains a second, explicitly regional
choice alongside the generic owner. The broad query does not resolve to the Guérande row alone.
The exact regional phrase and place name resolve to the specific candidate. No form terms are
proposed that could redirect a broad salt-form search to this region.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and all **1,123 structured ingredient rows** were
parsed as UTF-8. The scan covered decoded recipe documents, ingredient-row text, and linked
reference/form IDs. It checked accented and unaccented Guérande forms, `Fleur de sel de Guérande`,
`Sel de Guérande`, and the proposed reference ID. It found **zero regional-identity hits in recipe
documents, zero matching ingredient rows, and zero linked rows for either the proposed identity or
the existing generic fleur-de-sel reference**.

The broader phrase `fleur de sel` appears once in the corpus, in French directions for Chocolate
Dates (3 Flavors), where the cook is told to garnish with a little fleur de sel. It is not an
ingredient row and does not specify Guérande. No recipe link is proposed. [R01]

The manifest-order corpus contains **753,988 bytes** and has fingerprint
`94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each
manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a
newline, then hashes the concatenated bytes. [R01]

## Forms, measurements, conversions, and substitutions

- **Forms:** Add none. INAO describes the surface crystals and their appearance as product
  characteristics, but they do not justify a separate stored form under this regional row. The
  active generic fleur de sel row has no forms; attaching a `flaky` form only here could make a
  broad form query return one region alone. [S01]
- **Measurements and density:** Add none. Le Paludier lists its own 125 g box and 250 g cotton bag;
  the Montréal retailer lists one 125 g SKU. These are package presentations, not kitchen measures,
  portions, or density evidence. Do not reuse the existing San Francisco Salt Co. observation as a
  Guérande value. [S02–S03; reused `WP07-SALT-20261010-S09`]
- **Conversions and yields:** Add none. The cited sources provide no regional scoop-to-mass or
  volume-to-mass relationship and no usable-to-purchased yield. Commercial package sizes and the
  product standard do not establish either.
- **Recipe links:** Add none; no bundled ingredient row or linked reference matches the regional
  phrase or generic fleur de sel reference.
- **Substitutions:** Add no global or contextual substitution. No focused substitution study was
  performed, and finishing salt, coarse salt, and generic salt categories are not made
  interchangeable by a shared sodium-chloride base.

## Evidence limits and source access

- INAO's current page is the French quality authority's summary for the IGP and links the registered
  regulation and current specification material. The page says only published legal texts have
  legal authority; this proposal uses it to identify the product and boundary, not to turn its
  processing requirements into recipe behavior. [S01]
- Le Paludier's French Canada-facing product page says its Fleur de sel de Guérande conforms to the
  IGP specification and describes its surface-harvested product. Its package sizes and finishing
  use are producer-specific and do not establish Québec stock or a recipe measure. [S02]
- La Maison du Rôti's Montréal page was accessible on 2026-10-17, displayed the exact Québec French
  title and an add-to-cart control, and describes local delivery/pickup. Stock and price can change;
  the page does not show an IGP mark or identify its producer. It is used for local wording and
  current retail presence only. [S03]
- The Salt Cellar's Canadian English-language page uses `Fleur-de-Sel de Guerande, France`, says it
  ships throughout Canada, and showed the item sold out. It supports English-market retention of the
  French product term, not current availability or IGP certification. [S04]
- OQLF last updated its generic `fleur de sel` entry in 2007. It establishes the preferred Québec
  term and the same English term, and says the generic product is harvested in France and Portugal;
  it does not establish a Guérande-specific Québec term. This existing ledger source is reused, not
  duplicated. [reused `WP07-SALT-20261010-S07`]

## Source register

Sources S01–S04 and their URLs were checked against the live ledger before integration; no exact
source-ID prefix or URL collision was found. They are now registered on the Guérande reference.
Pages were checked on 2026-10-17 unless a page date is stated below. The OQLF entry is cited by its
existing source ID rather than copied into the new record.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-GUERANDE-FLEUR-DE-SEL-R464-20261017-S01` | INAO, [Sel de Guérande ou Fleur de sel de Guérande](https://www.inao.gouv.fr/produit/sel-de-guerande-ou-fleur-de-sel-de-guerande-21934), product summary, geographic area, and linked legal texts. | Primary French authority for the IGP designation, exact names, regional territory, and distinction between grey bottom salt and surface fleur de sel. The legal documents, not the summary, control specification details. |
| `WP06-EUROPE-GUERANDE-FLEUR-DE-SEL-R464-20261017-S02` | Le Paludier, [Fleur de sel](https://www.lepaludier.com/fr-ca/node/54), French Canada-facing product page. | Producer page names Fleur de sel de Guérande, says the product follows the IGP specification, describes surface crystals and finishing use, and lists producer package options. It does not show current Canadian inventory; package sizes are not reusable recipe measures. |
| `WP06-EUROPE-GUERANDE-FLEUR-DE-SEL-R464-20261017-S03` | La Maison du Rôti, Montréal, [Fleur de sel de Guérande - 125 g](https://maisonduroti.com/products/fleur-de-sel-de-guerande), current product page. | Québec French product title, imported-product description, price, add-to-cart control, and Montréal pickup/delivery information. Does not identify the producer or display an IGP mark; SKU size and stock are retailer-specific. |
| `WP06-EUROPE-GUERANDE-FLEUR-DE-SEL-R464-20261017-S04` | The Salt Cellar, Canada, [Fleur-de-Sel de Guerande, France](https://thesaltcellar.ca/products/fleur-de-sel). | Canadian English-market product wording and Canada-wide shipping statement. The item showed sold out and the retailer page does not attest IGP status. |
| `WP07-SALT-20261010-S07` (reused) | Office québécois de la langue française, [GDT — fleur de sel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8350274/fleur-de-sel), existing source on `ingredient-ref-fleur-de-sel`. | Establishes the generic preferred Québec French term, its English equivalent, and surface-harvest definition. It does not establish the Guérande-specific product name. |
| `WP07-SALT-20261010-S09` (reused) | UC Master Food Preserver, [Salt, the Only Rock We Eat!](https://ucanr.edu/program/uc-master-food-preserver/article/salt-only-rock-we-eat-may-2025), existing source on `ingredient-ref-fleur-de-sel`. | Existing direct-measurement source for a 10.3 g/tbsp observation of San Francisco Salt Co. Fleur de Sel. Its value is source-specific and is not transferred to the Guérande identity. |
| `WP06-EUROPE-GUERANDE-FLEUR-DE-SEL-R464-20261017-R01` | Read-only audit of the [Europe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L9312), live references/forms/legacy/ledger/rules, picker, proposal and batch archive, manifest, and all bundled recipes. | Repository-only audit of ownership, source-ID/URL allocation, picker projection, salt measurement boundary, and the complete 114-file / 1,123-row recipe corpus. Audit label only; it is not a ledger source. |

## Disposition

**Accepted and integrated.** Added the identity-only row `ingredient-ref-fleur-de-sel-guerande-igp`
with source-matched display names and empty alias arrays. The broad `fleur de sel` query returns both
the generic and Guérande-specific choices, while the full regional name selects only the specific
row. Preserved the generic `ingredient-ref-fleur-de-sel` owner and its San Francisco-specific
measurement; no forms, density, unit mappings, conversions, yields, recipe links, or substitutions
were added.

The current integration snapshot is 1,748 references / 141 forms; 2,107 ledger records / 9,595
source entries / 8,142 distinct source IDs / 6,855 distinct source URLs; and 114 recipes / 1,123
ingredient rows. Package normalization, generated-index freshness, ledger/source ownership, picker
projection, corpus, encoding, and local-document checks passed. No software tests were run because
the active change only adds database JSON data under `AGENTS.md`. Europe-wide coverage remains open.
