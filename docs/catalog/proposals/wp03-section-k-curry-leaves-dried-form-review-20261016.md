# WP03 Section K — dried curry leaves form review (2026-10-16)

## Review record

- **Target anchor:** Section K checklist item `Curry leaves, pandan leaves, banana leaves, corn husks, lotus leaves, and wrapping/aromatic leaves with explicit culinary roles` in `docs/RecipeBook-global-ingredient-catalog-plan.txt`.
- **Scope:** Decide whether culinary whole dried curry leaves need a form under the active curry-leaf ingredient reference. Assess picker terms, corpus demand, bilingual naming, product boundary, measures, conversions, and substitutions. Do not reopen the curry-leaf identity or neighboring curry powder and curry paste identities.
- **Recommendation:** Add one `dried` form to `ingredient-ref-curry-leaves`, displayed as `dried curry leaves / feuilles de cari séchées`. Keep whole dried leaves attached to the existing identity; do not create a separate ingredient reference. Do not add aliases, measures, density, conversions, rehydration ratios, yields, recipe links, or substitutions.
- **Status:** Integrated on 2026-10-16 in the [R281–R283 integration README](../batches/wp02-wp03-wp04-r281-r283-gap-review-integration-20261016/README.md). Added one dried form under the existing curry-leaf reference and a form-level ledger record.

## Existing identity and ownership

The active reference is `ingredient-ref-curry-leaves`, displayed as `curry leaves / feuilles de cari`, category `HERB`. The existing research-ledger record already verifies the leaf identity for *Murraya koenigii* and preserves the official Spices Board French term. Curry powder, curry paste, and other leaves remain separate identities. The ledger has no current form record for curry leaves.

The proposed form ID `ingredient-form-curry-leaves-dried` is absent from the current form file. `dried` is already an established form code. No new ingredient ID or alias is proposed. The source IDs below use the proposal-local prefix `WP03-DRIED-CURRY-LEAVES-20261016-`; they are unique in the ledger and existing proposal archive. The four new source URLs were not present in the research ledger or proposal archive at review time. Existing source ID `WP06-SA-20261010-S06` is reused as existing identity evidence and is not duplicated or reassigned.

## Picker projection and recipe demand

The current ingredient search indexes form labels and match terms on their parent reference. An exact form phrase returns that reference, and a form hint is selected only for an exact form term. A dried form therefore gives a precise picker result without adding a competing ingredient row.

| Query | Current exact phrase result | Effect of proposed form |
|---|---|---|
| `curry leaves` | `ingredient-ref-curry-leaves` only | Unchanged. |
| `feuilles de cari` | `ingredient-ref-curry-leaves` only | Unchanged. |
| `dried curry leaves` | No result | Returns the existing curry-leaf reference with the `dried` form hint. |
| `feuilles de cari séchées` | No result | Returns the existing curry-leaf reference with the `dried` form hint. |
| `feuilles de cari lyophilisées` | No result | May be included as an exact French match term for the same dried form; it would not create a new identity. |
| `curry powder`; `curry paste` | Their separate current references | Unchanged; do not add leaf terms to either reference. |

The app's phrase-first search behavior keeps the exact base queries distinct. The proposed form does not make `curry`, `cari`, or `curry powder` resolve to curry leaves. No new broad alias is warranted.

The manifest-listed bundle contains 114 recipe files and 1,123 ingredient rows. A UTF-8 scan of every manifest-listed recipe file and ingredient line found no occurrence of `curry leaves`, `feuilles de cari`, `curry patta`, `feuilles de cari séchées`, or `feuilles de cari lyophilisées`. The current bundle therefore provides no direct recipe-line demand, no recipe link, and no amount from which to infer a conversion. The reason to add the form is to distinguish an established Québec-market dry product in search, not to claim current bundled-recipe use.

## Name and product boundary

Use the existing bilingual base name with the state qualifier: `dried curry leaves / feuilles de cari séchées`. Health Canada's bilingual commodity wording lists both fresh and dried curry leaves in French as `feuilles de cari fraîches` and `feuilles de cari séchées`; a current Montréal retailer uses the direct Québec product heading `Feuilles de cari` and describes that product as freeze-dried. The wording supports a dry-state form under the existing curry-leaf identity. It does not establish a new botanical or culinary identity.

Keep the form limited to intact culinary leaves. The Montréal product's freeze-drying process and its comparison with sun-dried leaves are product-specific flavor notes, not grounds for a second generic identity or a universal process ranking. If a future ingredient line explicitly says `lyophilisé`, preserve that source wording in the line; the proposed `dried` form records the shared dry state. Ground curry-leaf powder, curry powder blends, curry paste, and fresh leaves are outside this form decision. Do not use `curry`, `cari`, or `feuilles de laurier` as aliases.

## Forms, measures, conversions, and substitutions

Proposed form shape, subject to integration review:

| Field | Proposal |
|---|---|
| `id` | `ingredient-form-curry-leaves-dried` |
| `ingredientRefId` | `ingredient-ref-curry-leaves` |
| `formCode` | `dried` |
| `labelEn` / `labelFr` | `dried curry leaves` / `feuilles de cari séchées` |
| `prepState` | `dry` |
| `matchTermsEn` | `curry leaves, dried`; `freeze-dried curry leaves` only if integration chooses to match the Québec product's stated process |
| `matchTermsFr` | `feuilles de cari séchées`; optionally `feuilles de cari lyophilisées` as the exact process-qualified Québec product wording |
| `densityGPerMl` | `null` |

The 12 g Montréal pouch and the 100 g Canadian marketplace package are SKU-specific package quantities, not household measures. Neither supports a teaspoon or cup mapping, density, fresh-to-dried ratio, or drying yield. A Canadian retailer's rehydration instruction is SKU-level recipe guidance and supplies no transferable ratio. No global or contextual substitution is proposed between fresh and dried leaves, other herbs, curry powder, or curry paste.

## Sources

Sources were checked online on **2026-10-16**. At proposal stage, the new source IDs were local to this review; integration records S01–S03 on the form-level ledger record and reuses the existing curry-leaf identity source.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-DRIED-CURRY-LEAVES-20261016-S01` | Épices de Cru, [Feuilles de cari](https://epicesdecru.com/fr-ca/boutique/epices/feuilles-de-cari-entieres), current Montréal product page. | French title, 12 g retail package, identifies the offered leaves as freeze-dried, describes their use whole in hot oil or ghee, and distinguishes them from curry powder. This is one Québec product and one seller's process/flavor description; the package mass is not a reusable measure. The indexed page was available in search on the review date; direct page opening returned no parsed body text. |
| `WP03-DRIED-CURRY-LEAVES-20261016-S02` | Health Canada, [Limites maximales de résidus fixées EMRL2008-02](https://publications.gc.ca/collections/collection_2008/pmra-arla/H113-29-2008-2F.pdf), French report, PDF page 8, food-commodity list. | Lists `feuilles de cari fraîches` and `feuilles de cari séchées`, directly supporting the French state wording. This 2008 regulatory commodity list is terminology evidence only; it does not establish current product availability, culinary equivalence, or measures. |
| `WP03-DRIED-CURRY-LEAVES-20261016-S03` | Walmart Canada, [Kehar Curry Leaves, 100 g, whole, freshly dried (English)](https://www.walmart.ca/en/ip/Kehar-Curry-Leaves-100g-3-5-oz-Freshly-Dried-Whole-Authentic-Indian-Spice-Curries-Rice-Soups-Chutneys-Resealable-Pack-Long-Lasting-Freshness/4WDBULZLMAVL). | Current Canadian marketplace listing describes whole dried leaves and gives a product-specific package quantity. Direct page content was not retrievable during this review. |
| `WP03-DRIED-CURRY-LEAVES-20261016-S04` | Walmart Canada, [Kehar Feuilles de Cari, 100 g (French listing)](https://www.walmart.ca/fr/ip/Kehar-Feuilles-de-Cari-100-g-3-5-oz-Enti-res-Fra-chement-S-ch-es-pice-Indienne-Authentique-pour-Currys-Riz-Soupes-et-Chutneys-Emballage-Refermable-un/4WDBULZLMAVL?classType=REGULAR). | Search-indexed Canadian French marketplace wording pairs Feuilles de Cari with the whole dried-leaf product; the product quantity and seller wording remain SKU-specific. Direct page content was not retrievable during this review. |
| Existing `WP06-SA-20261010-S06` | Spices Board India, [Curry Leaf](https://indianspices.com/spice-catalog/curry-leaf.html), botanical name, commercial part, and foreign-language names. | Existing ledger source: identifies *Murraya koenigii*, commercial part `Leaf`, and French `Feuilles de cari`. It supports continuity of the current reference only; it is not new form evidence and is not duplicated in the ledger. |

## Verification performed

- Read `AGENTS.md`, the project requirements, roadmap, the WP03 plant-food plan section, and existing WP03 proposals relevant to Section K.
- Confirmed no existing curry-leaf dry form or same-scope WP03 proposal/hold; confirmed the proposed form ID and new source-ID prefix are absent from active data and the research ledger.
- Checked the current source pages and search-indexed listings described above; recorded page-access limits rather than inferring unavailable details.
- Audited the live picker terms against the current reference and form JSON and applied the checked phrase-first behavior: the two base queries each return only the existing curry-leaf reference, while the two dried-form queries and the lyophilized query currently return no result.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows for the candidate English and French names; found no full-text or ingredient-line matches.
- No software tests, builds, emulator runs, catalog edits, ledger edits, roadmap edits, or plan edits were made for this proposal-only review.
