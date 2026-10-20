# WP03 Section L R629 — Jalapeño fresh form and French naming review

- **Status:** Accepted and integrated on 2026-10-18. The existing reference and research-ledger row were updated; one fresh form was added. No recipe row or active numeric behavior changed.
- **Disposition:** Keep the existing `ingredient-ref-jalapeno-pepper`; change its French display from `piment jalapeño` to the OQLF-preferred `piment jalapeno`; add the French plural alias `jalapenos`; and add one `fresh` form. Do not create a second jalapeño identity.
- **Scope:** The fresh form represents fresh-market jalapeño pepper. Keep smoked-and-dried chipotle, pickled/canned products, and ground jalapeño outside this form. Keep the existing category `VEGETABLE_AND_AROMATIC`.
- **Limits:** Add no density, unit mapping, package yield, measurement, conversion, recipe link, or substitution. Do not change the existing recipe-specific measurement evidence.
- **Testing:** None. This is proposal-only, and `AGENTS.md` exempts database-JSON-only additions from software testing.

## Checklist, catalog ownership, and archive review

The open [WP03 Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6124) still lists jalapeño among its fresh-chile candidates. [R625 integrated identity-only `bell pepper / poivron`](wp03-section-l-bell-pepper-identity-review-r625-20261018.md); it did not cover the jalapeño row. Requirements FR-7 calls for searchable French and English ingredient names and aliases.

The read-only snapshot on 2026-10-18 contains **1,827 active references, 156 forms, 56 legacy candidates, and 2,198 research-ledger records**. The manifest contains **114 recipes and 1,123 ingredient rows**.

| Surface | Current ownership and proposed treatment |
|---|---|
| Active reference | `ingredient-ref-jalapeno-pepper` is the sole active jalapeño reference. Its current display is French `piment jalapeño`, English `jalapeno pepper`; both alias arrays are empty. Keep this ID and category. |
| Forms | No active form is attached to the jalapeño reference. `ingredient-form-jalapeno-pepper-fresh` is unused. Add only this fresh form. |
| Legacy import | `docs/catalog/legacy-import-identities.v1.json` contains the inactive, unreviewed candidate `ingredient-ref-jalapeno` with singular `jalapeño` names. Keep it unpromoted; the current active row already owns the identity. |
| Research ledger | The active-reference record currently has only the WP04 source-specific raw count evidence. Its identity state is still `unreviewed`. Attach R629 S01–S07 to this same record and mark the existing identity reviewed if the proposal is accepted. Preserve the existing measurement observation and its WP04 source ID exactly. |
| Exact proposed terms | No active reference, form, or legacy candidate owns `jalapenos`, `piment jalapeno frais`, or `fresh jalapeno pepper`. Accent-folded singular keys `piment jalapeño` / `piment jalapeno` and `jalapeño pepper` / `jalapeno pepper` already resolve to the active reference. |
| Source IDs | `WP03-L-JALAPENO-20261018-R629-S01` through `S07` do not occur in the current ledger or proposal/batch archive. The new form ID is also unused. |

The archive has no focused WP03 jalapeño form or identity proposal. Earlier broad reviews mention the active identity and the exact legacy duplicate. The [WP06 Mexican dried-chile boundary review](wp06-mexican-dried-chile-boundaries-20261009.md) already records OQLF's spelling guidance but explicitly left the active French display unchanged; this proposal addresses that open terminology point and the missing fresh form. The [WP04 produce-count review](wp04-residual-produce-counts-review-20261010.md) covers one source-specific jalapeño portion, not the fresh identity/form boundary.

## Evidence and bounded identity

OQLF's jalapeño entry gives `piment jalapeno` and `jalapeno` as preferred French terms and explicitly discourages writing the Spanish tilde in French. It lists `jalapeño pepper` and `jalapeno pepper` among the English terms. The current English display is already one of those accepted English terms, while the French display should be corrected to the Québec-preferred spelling. [S01]

CFIA's 2026 final report is specifically about whole fresh hot peppers sold at Canadian retail. Its sampling included Québec City and Montréal; Table 5 classifies 253 samples as `Piment jalapeno`. This supports a named Canadian fresh-market product and the fresh form, but the surveillance product class does not assign a species, cultivar, growing origin, or reusable measure to every pepper sold under that name. [S02]

Health Canada's Canadian Nutrient File identifies the raw food as `Pepper, jalapeno, raw` / `Piment, jalapeno, cru`. This independently supports the raw jalapeño food name and state. No CNF portion or weight is added to this proposal. [S03]

Metro Québec's current bilingual produce listing uses `Piment jalapeño` / `Jalapeño Pepper` for product 4693. Its page is in the fruit-and-vegetable aisle and describes use fresh; both pages were present in Metro's current search-indexed results, though direct opening returned 403 in this review. Metro's paired French and English recipe pages also use the explicit phrases `piment jalapeño frais` and `fresh jalapeño`. These are local product and recipe wording, not transferable amounts or measures. [S04–S07]

Use one `fresh` form with the bilingual labels shown in the exact delta. Do not add chipotle as a jalapeño alias: OQLF identifies smoked-and-dried jalapeño by that contextual product name, and the catalog already has a separate `chipotle in adobo` condiment reference. Metro's whole/sliced pickled and ground jalapeño listings are prepared product examples, not evidence to fold those products into a fresh produce form. Do not infer species, maturity color, fixed heat, or an interchangeable product from these sources.

## Alias boundary and picker projection

The picker normalizes accents and punctuation, matches complete word phrases before partial strings, and attaches form matches to their owning reference. The projection below applies that behavior to the current 1,827 references and 156 forms, then applies only the proposed display correction, one French alias, and one fresh form.

Add `jalapenos` as the regular French plural of the OQLF-preferred standalone term `jalapeno`. OQLF notes that the term is pronounced the same in singular and plural and discourages the Spanish tilde in French. Do not add the longer plural `piments jalapenos`: with the current phrase-first search, that alias would also make the generic query `piments` return a single jalapeño result (currently zero). The singular French spelling with or without `ñ` remains searchable through accent folding, and the current English canonical name already resolves accented `jalapeño pepper` queries.

Do not activate English `jalapeño chile` / `jalapeño chili` aliases. OQLF lists them, but they would add jalapeño to the generic `chile` and `chili` queries. Keep the current narrow English canonical `jalapeno pepper`; do not add unverified English plurals. Add no generic `pepper(s)`, `piment(s)`, `chile(s)`, `chili`, `hot pepper`, `piment fort`, color, or botanical-name alias. `chipotle` remains a separate processed-product name.

| Query | Current references | Projected references | Effect |
|---|---:|---:|---|
| `piment jalapeno`, `piment jalapeño` | 1 each | 1 each | Same active row; French display becomes the OQLF-preferred spelling. |
| `jalapeno`, `jalapeño` | 1 each | 1 each | Existing singular searches remain unchanged. |
| `jalapenos`, `jalapeños` | 0 each | 1 each | The source-attested French plural resolves to the existing active reference. |
| `jalapeno pepper`, `jalapeño pepper` | 1 each | 1 each | Existing English canonical term and its accent-folded spelling are unchanged. |
| `fresh jalapeno pepper`, `piment jalapeno frais` | 0 each | 1 each | Each exact fresh-form label resolves to the owning jalapeño reference and its fresh form. |
| `piments jalapenos`, `piments` | 0 each | 0 each | Do not activate a phrase that would make generic `piments` a singleton. |
| `jalapeño chile`, `jalapeño chili` | 0 each | 0 each | Keep OQLF-listed alternatives out to avoid broad `chile` / `chili` alias effects. |
| `chipotle` | 1 | 1 | Existing `chipotle in adobo` remains the only result; the fresh pepper gains no chipotle alias. |
| `pepper`, `peppers` | 35 / 12 | 35 / 12 | Broad English results are unchanged; the existing jalapeño row is already returned. |
| `piment`, `chili`, `chile` | 28 / 10 / 1 | 28 / 10 / 1 | Broad terms are unchanged because no broad aliases are added. |

## Recipe demand and data boundary

Every recipe path in the current manifest and all **1,123 ingredient rows** were scanned. The only jalapeño ingredient-row hit is recipe 034 ingredient 2, `1 jalapeno pepper, finely chopped`, already linked to `ingredient-ref-jalapeno-pepper`; its preparation says `seeded if desired, finely chopped`. The line does not explicitly say `fresh`, so do not add a recipe-form link or edit the line. There are no jalapeño plural, pickled, canned, ground, or chipotle-ingredient rows. Recipe 007's `chipotle in adobo` line remains linked to its existing condiment identity.

The ledger already holds a WP04 USDA observation for one raw jalapeño pepper = 14.0 g, scoped to that recipe line and its seeded preparation branch. Do not alter, generalize, duplicate, or attach that amount to the new form. Add no new numeric observation, density, unit mapping, conversion, package yield, recipe link, or substitution.

## Sources checked 2026-10-18

| Source ID | Primary source and locator | Evidence and limits |
|---|---|---|
| `WP03-L-JALAPENO-20261018-R629-S01` | Office québécois de la langue française, [piment jalapeno (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869222/piment-jalapeno), updated 2012; preferred French terms, spelling note, and English terminology. | Prefers French `piment jalapeno` / `jalapeno`, notes the same pronunciation in singular and plural, and discourages the Spanish ñ in French. Its English list includes both `jalapeño pepper` and `jalapeno pepper`; it names smoked-and-dried jalapeño `chipotle` in context. |
| `WP03-L-JALAPENO-20261018-R629-S02` | Canadian Food Inspection Agency, [Bactéries pathogènes et organismes indicateurs dans des piments forts entiers à l’état frais](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf), 2026 final report; Table 5 and sampling scope. | Covers whole fresh hot peppers sold at Canadian retail; sampling included Québec City and Montréal. Table 5 lists `Piment jalapeno`, 253 samples. The sample count is not a serving quantity or unit measure. |
| `WP03-L-JALAPENO-20261018-R629-S03` | Health Canada, [Canadian Nutrient File serving portion: pepper, jalapeno, raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4860&wbdisable=false), food code 4860. | Names the raw food `Pepper, jalapeno, raw` / `Piment, jalapeno, cru`. The page includes published portions, none of which is imported or changed here. |
| `WP03-L-JALAPENO-20261018-R629-S04` | Metro Québec, [Piment jalapeño](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piment-jalapeno/p/4693), product 4693; current indexed produce listing. | Supports local retail spelling and fresh-produce context. The indexed page was available when checked; direct opening returned 403. The displayed approximate selector weight is listing-specific and is not used. |
| `WP03-L-JALAPENO-20261018-R629-S05` | Metro Canada, [Jalapeño Pepper](https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/jalapeno-pepper/p/4693), product 4693; current indexed English listing. | Same product number as the Québec listing; supports the English produce name. Direct opening returned 403. No product selector amount is generalized. |
| `WP03-L-JALAPENO-20261018-R629-S06` | Metro, [Salade de pâtes du sud-ouest](https://www.metro.ca/recettes-et-occasions/recettes/salade-de-pates-du-sud-ouest), French recipe page. | Uses the explicit wording `piment jalapeño frais`; recipe quantity and preparation are not catalog measures. Direct opening returned 403. |
| `WP03-L-JALAPENO-20261018-R629-S07` | Metro, [Tex-Mex Pasta Salad](https://www.metro.ca/en/recipes-occasions/recipes/tex-mex-pasta-salad), English counterpart page. | Uses the explicit wording `fresh jalapeño`; recipe quantity and preparation are not catalog measures. Direct opening returned 403. |

## Exact proposed JSON delta

On the existing reference, replace only the French display, add the one French plural alias, and update its date. Keep the English canonical name and both existing null/empty numeric fields unchanged.

### Change to `ingredient-references.v1.json`

```json
{
  "id": "ingredient-ref-jalapeno-pepper",
  "nameFr": "piment jalapeno",
  "aliasesFr": ["jalapenos"],
  "aliasesEn": [],
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

### Addition to `ingredient-forms.v1.json`

```json
{
  "id": "ingredient-form-jalapeno-pepper-fresh",
  "ingredientRefId": "ingredient-ref-jalapeno-pepper",
  "formCode": "fresh",
  "labelFr": "piment jalapeno frais",
  "labelEn": "fresh jalapeno pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Les sources appuient la pr\u00e9sentation fra\u00eeche; aucune mesure g\u00e9n\u00e9rale ou densit\u00e9 n'est \u00e9tablie.",
  "notesEn": "Sources support the fresh presentation; no general measure or density is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

The integration added R629 source IDs S01–S07 to the existing jalapeño identity ledger record and recorded the identity/form review. It preserves the existing WP04 measurement observation and source ID. No ledger measurement, recipe link, substitution, new reference, additional form, or legacy-candidate promotion was added.
