# WP03 Section F — teff grain Québec display review (R167, 2026-10-16)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog JSON, research ledger, generated code, plan,
  roadmap, batch README, or recipe was changed.
- **Open checklist:** The Section F plan already has an identity for whole teff grain and
  searchable terms for `tef` and `graines de teff`, but explicitly leaves the independent Québec
  review of its French display open ([global plan, lines 3226–3231](../../RecipeBook-global-ingredient-catalog-plan.txt#L3235);
  [grain packet, row 266](../batches/plant-grains-cereals.md#L266)). R90 and R96 addressed search
  aliases only. This review addresses the display wording on that existing row; it does not reopen
  the grain identity, teff-flour boundary, or the separate puffed-teff hold.
- **Recommendation:** **Integrate a display-only update** on `ingredient-ref-teff-grain`:
  change the French display from `teff d'Abyssinie` to the Québec-market product wording
  `graines de teff`, and retain `teff d'Abyssinie` as a French alias alongside `tef`. Keep English
  `teff`, category, identity, forms, recipe links, numeric data, and substitutions unchanged.
- **Rationale:** Two current Montréal/Québec product sources use the exact French title
  `Graines de teff`; a current Canadian product catalogue pairs `Teff seeds` with `Graines de teff`.
  CFIA and TERMIUM support `teff d'Abyssinie` as a correct formal/crop term, so preserve it as a
  searchable alias rather than treating it as erroneous. OQLF's separate `tef` entry calls that
  spelling recommended but non-current; keep the already accepted `tef` alias unchanged.
- **Prospective ingredient ID:** `ingredient-ref-teff-grain` (already allocated; no new identity).
- **Proposal-local source IDs:** `WP03-TEFF-FR-DISPLAY-R167-20261016-S01` and `-S02`. These IDs
  are unallocated in the live ledger and proposal/batch archive.

## Identity and terminology boundary

The existing row represents edible, whole teff grain sold as a food ingredient. The proposal changes
only the French picker display to the exact wording used on current Québec-market retail pages. The
French label `graines de teff` does not mean planting seed, a new botanical identity, a cooked state,
or a separate form. Yupik's current page explicitly identifies whole seeds and says the product is
raw; Épices Anatol sells the product under its grains category in Montréal [S01; reused R96 S04].

Keep the following identities and search boundaries intact:

- `ingredient-ref-teff-flour`, `ingredient-ref-ivory-teff-flour`, and
  `ingredient-ref-brown-teff-flour` remain separate milling products. Do not move any teff-grain
  display or alias to those flour rows.
- The OQLF spelling `tef` remains a French alias on the grain row only. It does not become a flour
  alias.
- `teff d'Abyssinie` remains searchable as a French alias. It is supported by CFIA's French crop
  list and TERMIUM's normalized-term record [WP03-S76; reused R90 S01].
- `teff` remains the English display and is not added to French aliases. Its broad picker query
  continues to show the grain and the three current teff-flour choices.
- Puffed teff remains the separate ledger-only `candidate-puffed-teff`; this display change does not
  allocate it or transfer a raw-grain name to that processed product. Injera remains prepared bread.
- No cultivar, color class, origin, dehulling state, or cooked preparation is assigned.

## Terminology evidence

Current Québec-facing product usage favors the phrase already present as a French search alias. The
Épices Anatol product page is titled **Graines de teff**, lists 250 g, 454 g, and 2.270 kg sale
packages, and gives a Montréal street address [S01]. The page is a local retailer listing; its
package choices do not establish kitchen measures. Yupik's current Canadian French page is titled
**GRAINES DE TEFF**, lists the ingredient as *graines de teff*, describes whole seeds, and showed the
SKU in stock when checked [reused R96 S04]. The company contact page identifies its store in
Montréal [reused R96 S05]. Tootsi Canada's 2026 catalog separately pairs **Teff seeds** with
**Graines de teff** for code 20075 in its grains/seeds/rice category [S02]. These sources support a
current Canadian and Québec consumer-facing product name, not a new species or process claim.

The formal term remains useful. CFIA's French crop list places *Eragrostis (= Poa) abyssinica* under
cereals as **Teff d'Abyssinie** [WP03-S76]. TERMIUM Plus lists **teff d'Abyssinie** and **teff** as
correct normalized French terms for *Eragrostis tef* [reused R90 S01]. The OQLF-hosted GDT entry has
headword **tef**, but its note says that the spelling is non-current while recommended [WP02-S90].
The OQLF entry is authored by the Conseil international de la langue française in 1974; it is not a
current retail-label ruling. Keep `teff d'Abyssinie` and `tef` searchable, while using the directly
attested local product name for the French display.

No source claims that `graines de teff` is an OQLF-preferred display. The recommendation is a
product-label decision based on multiple current Québec/Canadian product sources. `Teff d'Abyssinie`
remains the supported formal term and an exact alias, so users entering that term retain access.

## Live ownership, IDs, and URLs

The live snapshot checked for this proposal contains **1,542 ingredient references**, **119 forms**,
**61 legacy-import candidates**, and **1,886 ledger records**. The ledger contains **8,052 source
entries**, **6,891 distinct source IDs**, and **5,687 distinct source URLs**. The manifest contains
**114 recipe files** and **1,123 ingredient rows**.

The active reference is `ingredient-ref-teff-grain`, with display `teff / teff d'Abyssinie`, French
aliases `tef` and `graines de teff`, `GRAIN_AND_CEREAL`, null density, and no unit mappings. Exact
normalized ownership across active displays/aliases, form labels/match terms, and legacy candidate
names/aliases is:

| Normalized term | Current exact stored owner | Proposed owner |
| --- | --- | --- |
| `teff` | `ingredient-ref-teff-grain` English display | unchanged |
| `tef` | `ingredient-ref-teff-grain` French alias | unchanged |
| `teff d'abyssinie` | `ingredient-ref-teff-grain` French display | same row, French alias |
| `graines de teff` | `ingredient-ref-teff-grain` French alias | same row, French display |
| `teff flour` | `ingredient-ref-teff-flour` English display | unchanged |
| `farine de teff` | `ingredient-ref-teff-flour` French display | unchanged |

No other active reference, form, legacy candidate, or ledger record ID exactly owns the two French
grain terms. There is no proposed new ingredient ID, form ID, legacy mapping, or candidate ID.

The two proposal-local source IDs are absent from the live ledger and archive. Their URLs are also
absent from the live ledger. The Tootsi page URL was cited in an earlier Kaniwa proposal for a
different product code on that page; this proposal uses its separate code 20075 teff row. The Yupik
product, Yupik contact, OQLF, CFIA, and TERMIUM URLs already belong to the teff grain's R90/R96
research record or are reused existing source records. Do not duplicate those source registrations.

## Picker projection

The read-only projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercasing, NFKD accent folding, punctuation normalization, complete word-phrase matches first, and substring fallback only when no phrase match exists. Reference terms are both display names and aliases; attached form terms are included. This proposal moves two existing French terms between display and alias fields without adding or removing search terms, so projected result sets are unchanged.

| Query | Current results | After proposed delta |
| --- | --- | --- |
| `teff` | 4: teff grain, plain teff flour, ivory teff flour, brown teff flour | same 4 |
| `tef` | `ingredient-ref-teff-grain` | same |
| `teff d'Abyssinie` / `teff d Abyssinie` | `ingredient-ref-teff-grain` | same |
| `graines de teff` | `ingredient-ref-teff-grain` | same |
| `teff flour` | 3 teff-flour rows: plain, ivory, brown | same 3 |
| `farine de teff` | 3 teff-flour rows: plain, ivory, brown | same 3 |
| `teff seeds` | no result | no result; no English alias is proposed |

Only the French display text shown for the grain row changes. No broad `teff` or `graines` query gains
or loses a result. The grain/flour boundary and the held puffed-teff candidate are unaffected.

## Bundled recipe demand

Parsed every manifest-listed recipe JSON and every structured ingredient row, and scanned complete
serialized files and ingredient-row text for `teff`, `tef`, `teff d'Abyssinie`, `graines de teff`,
`teff seeds`, and *Eragrostis tef* / *E. abyssinica*. The **114 files / 1,123 rows** contain zero
matching recipe-file hits, zero ingredient-row hits, and zero direct links to
`ingredient-ref-teff-grain`. No recipe link, relink, ingredient edit, or amount change is proposed.

## Forms, numeric data, and substitutions

- **Forms:** The active grain has no attached forms. The separate flour rows also remain without
  changes. Do not model the French label wording as a new form or cooked-state conversion.
- **Density and kitchen measures:** The grain row has `defaultDensity: null` and
  `unitMappings: []`. Its ledger measurement state is `not_yet_researched`, with no measurement
  observations. Yupik prints a product-specific **1/8 cup (30 g)** Nutrition Facts portion; preserve
  that as label context only. It is not a general serving, density, or volume conversion. Épices
  Anatol package sizes and Tootsi's 25 kg trade pack are inventory/package quantities, not recipe
  measures.
- **Forms, conversions, and yields:** There are no teff forms, unit conversions, or package yields.
  The package-yield file has one unrelated record; the ledger's eight conversion records have no
  teff entry. Do not infer a dry-to-cooked yield from the product page's preparation text.
- **Substitutions:** The teff-grain ledger state remains `not_yet_researched`, with no substitution
  findings. No global or contextual rule mentions teff. Yupik's texture comparison to polenta and
  suggestion to combine cooked teff with other grains do not validate a quantity-backed or
  context-tested ingredient replacement. Add no rule or recipe-line substitution.
- **No numeric delta:** This review changes only a French display and its alias ownership. Keep all
  numeric, form, conversion, yield, and substitution data unchanged.

## Proposed exact delta

Update only the existing ingredient-reference row as follows:

```json
{
  "id": "ingredient-ref-teff-grain",
  "nameEn": "teff",
  "nameFr": "graines de teff",
  "aliasesEn": [],
  "aliasesFr": ["tef", "teff d'Abyssinie"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

For the existing `ingredient-ref-teff-grain` ledger record, add source entries S01–S02 below and one
accepted decision that changes only the French display and preserves both previous French search
terms. Reuse existing IDs `WP02-S90`, `WP03-S76`, `WP03-TEFF-FR-QC-R90-20261013-S01`, and
`WP03-TEFF-QC-SEARCH-R96-20261014-S04`; do not duplicate their sources. Keep
`identityState: verified`, `measurementState: not_yet_researched`, and
`substitutionResearchState: not_yet_researched`. Add no measurement observation, substitution
finding, or unit conversion.

Proposed ledger sources:

```json
[
  {
    "sourceId": "WP03-TEFF-FR-DISPLAY-R167-20261016-S01",
    "url": "https://www.epicesanatol.com/fr/grains/graines-teff/",
    "title": "Épices Anatol, Graines de teff",
    "accessedOn": "2026-10-16",
    "locator": "Product title, package options, grains category, and Montréal address.",
    "supports": "A current Montréal retailer sells teff under the exact French title Graines de teff in its grains category. Package sizes and prices are SKU details, not kitchen measures.",
    "sourceKind": "other"
  },
  {
    "sourceId": "WP03-TEFF-FR-DISPLAY-R167-20261016-S02",
    "url": "https://tootsi.com/pdf/e-catalog-canada/files/basic-html/page59.html",
    "title": "Tootsi Canada Catalog 2026, page 59",
    "accessedOn": "2026-10-16",
    "locator": "Product code 20075 in the Grains, Seeds and Rice / Céréales, Graines et Riz section.",
    "supports": "Pairs Teff seeds with Graines de teff for Canadian product code 20075. The 25 kg trade-pack size is not a recipe measure or consumer serving.",
    "sourceKind": "other"
  }
]
```

Proposed ledger decision:

```json
{
  "outcome": "accepted",
  "reason": "Use graines de teff as the French display for the existing edible whole-teff grain identity because current Montréal/Québec and Canadian product sources use that exact French product wording. Preserve teff d'Abyssinie as a French alias because CFIA and TERMIUM support it as a formal/correct normalized term, and preserve the existing tef alias with its OQLF non-current spelling note. Keep English teff, the separate teff-flour identities, forms, numeric data, recipe links, conversions, yields, and substitutions unchanged.",
  "sourceIds": [
    "WP02-S90",
    "WP03-S76",
    "WP03-TEFF-FR-QC-R90-20261013-S01",
    "WP03-TEFF-QC-SEARCH-R96-20261014-S04",
    "WP03-TEFF-FR-DISPLAY-R167-20261016-S01",
    "WP03-TEFF-FR-DISPLAY-R167-20261016-S02"
  ]
}
```

## Source register

Sources were opened or rechecked online on 2026-10-16. Existing source IDs are marked reused; only
S01–S02 are proposed for new ledger registration.

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| `WP03-TEFF-FR-DISPLAY-R167-20261016-S01` | Épices Anatol, [Graines de teff](https://www.epicesanatol.com/fr/grains/graines-teff/), product page. | Current Montréal retailer page uses the exact French product title, lists package options, and gives a Montréal address. It is product terminology evidence, not a terminology-authority ruling or kitchen measure. |
| `WP03-TEFF-FR-DISPLAY-R167-20261016-S02` | Tootsi Canada, [Canada Catalog 2026, page 59](https://tootsi.com/pdf/e-catalog-canada/files/basic-html/page59.html), product code 20075. | Current Canadian catalogue pairs `Teff seeds / Graines de teff` in its grains/seeds/rice section. Its 25 kg pack is trade packaging. The same page URL was cited in an earlier Kaniwa proposal for code 20072; this review uses the separate teff row. |
| **Reused `WP02-S90`** | OQLF, [GDT: `tef`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef), entry attributed to the Conseil international de la langue française, 1974. | Defines the cereal and calls `tef` non-current but recommended. It does not establish a current product label or make `teff d'Abyssinie` invalid. |
| **Reused `WP03-S76`** | CFIA, [Liste de grains et grandes cultures](https://inspection.canada.ca/fr/protection-vegetaux/grains-grandes-cultures/liste-grains-grandes-cultures), Céréales, *Eragrostis (= Poa) abyssinica / Teff d'Abyssinie*; modified 2015-04-02. | Official French crop-name evidence for the retained alias; not a current consumer-product label. |
| **Reused R90 S01** | Translation Bureau, [TERMIUM Plus: *Eragrostis tef*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=ERAGROSTIS+TEF), French entry, fiche dated 2016-03-14. | Lists `teff d'Abyssinie` and `teff` among correct normalized French terms. Supports retaining the formal terms as searchable names, not Québec consumer preference. |
| **Reused R96 S04** | Yupik, [Graines de teff, SKU P20075](https://yupik.com/fr/teff-seeds-p20075); [contact page](https://yupik.com/fr/contact) for Montréal store address. | Current French consumer product title, ingredient, and whole-seed description; page showed the product in stock. Its `1/8 tasse (30 g)` Nutrition Facts portion is SKU-specific. |

## Static audit record

- Read current Section F plan/checklist and the grain packet; read the R90 tef-alias proposal and
  integration record, R96 teff-grain search-term proposal and integration record, the R158 puffed-
  teff Québec naming recheck, the R165 grain review, and the integrated R166 README.
- Read the active reference and form JSON, legacy-import identities, the teff grain and flour ledger
  records, manifest recipe list, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).
- Checked exact normalized owners for `teff`, `tef`, `teff d'Abyssinie`, `graines de teff`,
  `teff flour`, and `farine de teff` across active reference displays/aliases, form labels/match
  terms, and legacy names/aliases. Confirmed both French whole-grain terms belong only to the
  existing teff-grain row.
- Checked the proposal-local source-ID prefix and exact URLs against the current ledger and archive.
  S01's URL is unregistered; S02's URL is absent from the ledger and is already cited in the archive
  only for a different product code on the page.
- Reproduced current picker results from the live reference/form terms and the implementation's
  phrase-first behavior. Moving the two French terms leaves all result sets unchanged.
- Scanned all **114** manifest-listed recipes and **1,123** ingredient rows, including every full
  serialized recipe and direct reference IDs. No teff term or teff-grain link occurs in the corpus.
- Checked attached forms, density, unit mappings, ledger measurements/substitution findings,
  substitution rules, package yields, and ledger unit conversions. No teff-specific numeric or
  substitution data supports an additional catalog delta.
- This proposal changes one Markdown file only. No app, unit, instrumentation, emulator, build, or
  deployment tests were run; none are required for proposal-only documentation.
