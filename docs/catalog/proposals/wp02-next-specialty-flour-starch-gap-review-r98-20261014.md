# WP02 B2 R98 rice-bean flour identity review

**Status:** Integrated on 2026-10-14 as `ingredient-ref-rice-bean-flour`, with one accepted
research-ledger record and one formula-specific substitution finding. Section 04 B2/B3 remains open.

- **Reviewed:** 2026-10-14.
- **Status:** Identity-only integration completed; French display remains provisional pending Québec product-name evidence.
- **Scope:** One fresh B2 alternative pulse flour candidate: food flour made from rice bean (*Vigna umbellata*) seeds. The open [Section 04 B2 alternative-flour checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1840) and latest roadmap state leave B2/B3 review active. This review does not reopen the active whole-rice-bean identity, modified starch reviews, or previously reviewed specialty flour and starch candidates.
- **Source-ID prefix:** **WP02-B2-RICE-BEAN-FLOUR-20261014-R98**. The S01–S04 IDs below are proposed evidence identifiers and are not allocated in the shared ledger.
- **Recommendation:** Add one identity-only reference for **rice bean flour / farine de haricot riz**. Treat the French display as a descriptive, provisional Québec label built from the Government of Canada’s standardized whole-pulse term; no French aliases. Keep the row distinct from whole rice beans and other Vigna flours. Add no forms, active measurements, conversions, recipe links, or substitution rules.

## Identity boundary and naming

The candidate is flour made by milling seeds of *Vigna umbellata*. A 2025 primary methods paper describes cleaned rice-bean seeds from a green variety ground into flour, and a 2026 primary pizza-base study explicitly tests rice bean flour. A 2025 Philippine utility-model publication also names rice bean flour in a cookie composition. Together these establish a source-defined human-food flour class, though they do not establish a Canadian retail product or one universal milling specification. [S01–S03]

Keep this identity separate from the active whole-seed reference **rice beans / haricots riz** (`ingredient-ref-rice-beans`). Do not treat it as rice flour, rice starch, whole rice beans, bean protein isolate, or a composite rice-and-bean flour. The reviewed evidence does not establish a shared whole-seed/dehulled grade, roasting state, or processing form, so do not encode those distinctions as aliases or forms. Keep other Vigna flour products tied to their own seed identity.

| Field | Proposed value | Evidence and limit |
|---|---|---|
| English display | **rice bean flour** | Exact wording in the 2026 primary study. [S01] |
| English alias | **ricebean flour** | One-word spelling in the title of the 2025 primary flour-methods paper. [S02] |
| French display | **farine de haricot riz** | Provisional descriptive construction based on TERMIUM’s standardized `haricot riz` for the whole pulse. TERMIUM does not attest a flour compound; obtain independent Québec product-name review before treating this as settled terminology. [S04] |
| French aliases | None | `haricot riz` and `haricot grain de riz` remain whole-pulse terms on `ingredient-ref-rice-beans`; do not copy them as flour aliases. No French flour label was located. |
| Excluded names | `rice bean powder`, `Vigna umbellata flour`, `farine de haricot grain de riz`, `pois jaune`, `pois zombi` | These are not verified flour labels. TERMIUM limits the latter two French names to Antilles usage for the pulse; neither should become a Québec flour alias. [S04] |

If integrated, the proposed identity-only reference is:

```json
{
  "id": "ingredient-ref-rice-bean-flour",
  "nameEn": "rice bean flour",
  "nameFr": "farine de haricot riz",
  "aliasesEn": ["ricebean flour"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The French display is explicitly provisional and is not presented as an OQLF ruling or a current package label. No ID is reserved by this proposal.

## Current ownership and picker projection

The current whole-pulse row is `ingredient-ref-rice-beans`, displayed as **rice beans / haricots riz**, with English aliases `rice bean` and `ricebean` and French aliases `haricot riz` and `haricot grain de riz`. Its density is null and unit mappings are empty. No form is attached to that row. I found no flour reference, exact flour form, matching legacy candidate, allocated flour ledger record, or earlier proposal/batch reviewing rice-bean flour. The exact candidate-name and spelling scan covered active references, forms, legacy candidates, ledger records, recent proposals, and batches. The broader whole-pulse identity and its evidence remain unchanged.

`IngredientSearch.kt` normalizes accents and punctuation, returns complete word-phrase matches first, and uses substring matching only when no phrase match exists. The projection below adds the proposed display and one English alias, without modifying the live picker:

| Query | Current result | With proposed identity | Effect |
|---|---|---|---|
| `rice bean flour` | None | Proposed flour row only | Exact English product phrase. |
| `ricebean flour` | None | Proposed flour row only | Source-attested one-word spelling. |
| `farine de haricot riz` | None | Proposed flour row only | Exact provisional French display. |
| `rice bean` | `ingredient-ref-rice-beans` | Whole-pulse and proposed flour rows | The short query shows both related products; the full flour display remains visible. |
| `ricebean` | `ingredient-ref-rice-beans` | Whole-pulse and proposed flour rows | The one-word alias creates the same expected related-product result. |
| `rice beans` | `ingredient-ref-rice-beans` | `ingredient-ref-rice-beans` only | Plural whole-pulse display does not match the singular flour display. |
| `haricot riz` | `ingredient-ref-rice-beans` | Whole-pulse and proposed flour rows | The term occurs in the provisional French display; do not add it as an alias. |
| `haricot grain de riz` | `ingredient-ref-rice-beans` | `ingredient-ref-rice-beans` only | Keep the current whole-pulse alias on its existing row. |
| `rice flour` | Seven existing identities: brown rice, glutinous rice, mochiko, generic rice, roasted red rice, shiratamako, and white rice flours | Same seven identities | The non-contiguous phrase does not match `rice bean flour`. |

The short singular English and French terms (`rice bean`, `ricebean`, and `haricot riz`) would show the seed and its flour together, while exact flour phrases would resolve to the flour row. The plural `rice beans` and `haricot grain de riz` stay on the whole-pulse row. No broad alias is added to the whole-pulse identity.

## Bundled recipe demand

The manifest lists **114 recipes** containing **1,123 ingredient rows**. I scanned every manifest-listed recipe JSON string and ingredient row for `rice bean flour`, `ricebean flour`, `rice bean powder`, `Vigna umbellata`, `rice bean`, `rice beans`, `ricebean`, `haricot riz`, `haricot grain de riz`, and the candidate French constructions. The scan found **zero recipe-text matches, zero ingredient-line matches, and zero rows linked to `ingredient-ref-rice-beans`**. There is no current recipe line to link or use to select a flour grade. The identity proposal is catalog coverage only.

## Measures, forms, and substitution evidence

- **Density and household measures:** No reviewed source reports a reusable g/mL density, grams per cup/spoon, or a product-matched household measure for rice bean flour. Keep `defaultDensity` null and `unitMappings` empty. The 2025 study’s water-to-flour ratios concern microwave extraction of galactooligosaccharides; they are lab-processing ratios, not kitchen conversions. The 2026 pizza study’s farinograph water-absorption results are dough-test measurements, not bulk density. [S01–S02]
- **Forms:** Add no `IngredientForm`. The sources do not establish standardized roasted, dehulled, instant, or other catalog-wide forms, and the flour identity should not become a form of the whole-seed row.
- **Substitution:** Hosakere Nagesh and Kathalsar’s 2026 study tested rice bean flour replacing whole-wheat flour at 0–40% in one pizza-base formulation; the abstract reports acceptable sensory attributes through 30%. Record this only as one bounded food-study observation if the identity is integrated. It is not a general wheat-flour replacement ratio, recipe conversion, or evidence for cakes, cookies, sauces, or other dishes. Add no global, contextual, or recipe-line substitution rule. [S01]
- **Recipe links:** None. The bundled corpus has no rice-bean or rice-bean-flour demand.

## Proposed ledger treatment

Created `ingredient_reference` record `ingredient-ref-rice-bean-flour` with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_supported`. Recorded S01’s pizza-base result as a single study-specific substitution finding with explicit limits; no active substitution rule or measurement observation was added. The French display limitation remains in the decision reason, and recipe links, forms, conversions, and yields remain empty.

## Source register

All sources were accessed on **2026-10-14**. IDs use the prefix `WP02-B2-RICE-BEAN-FLOUR-20261014-R98`; no same-prefix collision was found in the current ledger.

| Source ID | Source and direct link | Evidence used and limits |
|---|---|---|
| **WP02-B2-RICE-BEAN-FLOUR-20261014-R98-S01** | Vidyashree Hosakere Nagesh and Ashwath Kumar Kathalsar, [“Analysing the Empirical Rheology, Processing, Physico-Chemical, and Digestibility Characteristics of *Vigna umbellata* Incorporated Pizza Base”](https://onlinelibrary.wiley.com/doi/10.1002/cche.70069), *Cereal Chemistry*, first published 2026-04-22, DOI 10.1002/cche.70069. | Primary study explicitly names rice bean flour and reports its use at 0–40% replacement in one pizza-base formulation, with sensory acceptance reported through 30%. It is not a retail specification, household measure, density source, or general substitution rule. |
| **WP02-B2-RICE-BEAN-FLOUR-20261014-R98-S02** | Bharat Bhushan and Rakesh Kumar Raigar, [“Standardization of Microwave Heating Process Parameters for Extraction of Galactooligosaccharides (GOS) From Ricebean Flour”](https://iadns.onlinelibrary.wiley.com/doi/10.1002/fpf2.70024), *Future Postharvest & Food*, first published 2025-08-13, DOI 10.1002/fpf2.70024. | Open primary paper. Its methods state that cleaned seeds of a green ricebean variety were ground in a food processor into flour below 150 μm. The size and process describe that lab sample, not a universal commercial grade. Its water-to-flour ratio is for microwave extraction, not a culinary conversion. |
| **WP02-B2-RICE-BEAN-FLOUR-20261014-R98-S03** | Intellectual Property Office of the Philippines, [“A Ricebean (*Vigna umbellata*) Cookie Composition”](https://onlineservices.ipophil.gov.ph/patgazette/IPASJournal/V28N2_UM_1st.pdf), Utility Model Publication 2/2024/050649, filed 2024-06-25 and published 2025-01-06, p. 52. | Official publication names rice bean flour in a cookie composition alongside all-purpose flour and other ingredients. It supports food use and species context, not commercial availability, a Québec label, or a transferable formula. |
| **WP02-B2-RICE-BEAN-FLOUR-20261014-R98-S04** | Government of Canada, Translation Bureau, [TERMIUM Plus: *Vigna umbellata*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=VIGNA+UMBELLATA), record dated 2019-05-07; page reports modification 2026-08-31. | Standardizes English `rice bean`/`ricebean` and French `haricot riz`/`haricot grain de riz`, identifying the product as a dry pulse/seed. It does not establish a flour term; the proposed French display remains descriptive and provisional. |

## Static checks and test scope

- Read `AGENTS.md`, the relevant Section 04 B2 checklist, `Requirements.md`, the current roadmap entries, and the active whole-rice-bean reference and ledger record.
- Counted the live package and ownership files: **1,434 references, 105 forms, 1,774 ledger records, and 63 legacy candidates**. The manifest contains 114 recipes and 1,123 ingredient rows.
- Checked the flour candidate and spelling variants against references, forms, legacy candidates, ledger IDs/content, proposals, and batches. No existing flour owner or prior flour review was found; no R98 source-ID prefix collision was found.
- Read `IngredientSearch.kt` and simulated the current and hypothetical phrase-first picker results for the table above. Scanned all manifest-listed recipe JSON and ingredient rows, including reference links.
- Checked the proposal’s UTF-8 encoding, BOM status, final newline, trailing whitespace, source-ID uniqueness, and Markdown link targets. After integration, seed-package/reference normalization, ledger-schema validation, generated-index freshness, picker projection, source ownership, recipe scan, encoding, local links, and scoped whitespace checks passed. No app, Gradle, instrumentation, or emulator tests were run because the change only adds database JSON data and its generated catalog index.

This review covers one B2 pulse-flour candidate only. It does not resolve the remaining Section 04 B2/B3 checklist.
