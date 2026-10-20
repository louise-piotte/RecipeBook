# WP04 Section P — fresh whole Atlantic salmon form review (R709)

- **Review / source-access date:** 2026-10-18.
- **Status:** Proposal only. No shared catalog or ledger records were changed.
- **Open item:** [Section P finfish coverage](../../RecipeBook-global-ingredient-catalog-plan.txt#L6766), including salmon and product forms.
- **Candidate:** One fresh-whole form under active `ingredient-ref-atlantic-salmon` (*Salmo salar*).
- **Recommendation:** **Add** the bounded form if adopted. Use the proposal-local form ID `ingredient-form-atlantic-salmon-fresh-whole`, display `fresh whole Atlantic salmon / saumon de l’Atlantique frais entier`, and qualified match terms only. Do not create a new identity or allocate an ID/source record in this proposal.

## Candidate and scope

La Mer, a Montréal fish market, lists the same Atlantic-salmon product in English and French. Both routes describe it as fresh and offer a selectable whole cut. This is a product presentation under the existing, verified Atlantic-salmon identity—not a species gap, generic salmon product, or recipe-backed need.

| Proposal-local candidate field | Suggested value |
|---|---|
| Form ID (unallocated) | `ingredient-form-atlantic-salmon-fresh-whole` |
| Parent | `ingredient-ref-atlantic-salmon` |
| `formCode` / `prepState` | `fresh_whole` / `fresh` |
| English label | `fresh whole Atlantic salmon` |
| Québec French label | `saumon de l’Atlantique frais entier` |
| English match term | `whole Atlantic salmon` |
| French match term | `saumon atlantique entier` |
| Density, measures, mappings | `null`; none |
| Recipe links, conversions, yields, substitutions | None |

The exact English and French product routes, the existing OQLF identity evidence, and the historical DFO commercial category support this narrowly named state. La Mer presents a 5 kg format and separate cut choices (`Whole` / `Entier`, fillets, steaks, and `Scaled & Gutted` / `Gratté et Vidé`). Keep the 5 kg format product-specific; it is not a reusable amount or typical fish size. Do not infer that the whole option is scaled, gutted, gilled, cleaned, skinned, wild, farmed, or from a particular origin. The pages do not support those claims. The separate scaled-and-gutted choice makes it especially important to leave cleaning state unspecified.

## Evidence and limits

`P01`–`P03` are proposal-local audit labels, not shared-ledger source IDs.

| Label | Source and observation | Limit |
|---|---|---|
| P01 | La Mer, [Saumon Atlantique Entier](https://www.lamer.ca/products/saumon-atlantique-entier), accessed 2026-10-18. The French page names `Saumon Atlantique Entier`, says `Saumon atlantique frais`, and offers the `Entier` cut option. | One current Québec-facing retail listing. It supports the named fresh, whole presentation, not species authority, stock continuity, preparation state, or a standard package/recipe amount. |
| P02 | La Mer, [Whole Atlantic Salmon](https://www.lamer.ca/en/products/saumon-atlantique-entier), accessed 2026-10-18. The same product route names `Whole Atlantic Salmon`, describes fresh Atlantic salmon, and offers `Whole` separately from `Scaled & Gutted`. | English locale of the same listing as P01, not an independent product or inventory observation. The page does not assign a scientific name or origin. |
| P03 | Department of Fisheries and Oceans Canada, [Canadian Fisheries Annual Statistical Review 1984, vol. 17 (published 1987)](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/358143.pdf), table 98, pp. 168–169. Its bilingual import categories include `Salmon, Atlantic, whole or dressed, fresh` and `Saumon de l’Atlantique entier ou habillé, frais`. | Historical commercial/statistical terminology, not a current product listing or culinary preparation standard. `Dressed` is not part of the proposed label and does not establish that La Mer’s `Whole` option is dressed. |
| Existing parent evidence | OQLF GDT, [saumon de l’Atlantique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198857/saumon-de-latlantique), already owned by parent source ID `WP04-ATLANTIC-SALMON-IDENTITY-R115-20261014-S01`. It gives the preferred Québec fish-product term, English `Atlantic salmon`, and *Salmo salar*. | Reuse the parent’s existing source and identity; do not duplicate or reassign its ID. It establishes identity/naming, not product form. It notes that `saumon atlantique` is not the normalized consumer display, so retain that wording only as a qualified form match from the product title. |

## Ownership and prior-review audit

The read-only package snapshot contains **1,841 active ingredient references**, **173 forms**, **2,223 ledger records**, and **56 legacy candidates**. The active parent `ingredient-ref-atlantic-salmon` is `Atlantic salmon / saumon de l’Atlantique`, with existing French alias `saumon atlantique`, no forms, null density, and no unit mappings. Its verified identity and the existing source IDs remain unchanged.

- The proposed form ID, bilingual labels, and qualified match terms have no exact active reference/form owner. No legacy candidate owns these terms or the proposed ID.
- The proposed form ID is absent from the research ledger. Neither La Mer locale URL has a ledger source owner. The R709 filename, proposed form ID, and proposed R709 source-ID prefix had no prior owner in the reviewed proposal/batch archive or ledger. This proposal allocates no form ID, source ID, or ledger record.
- The parent’s OQLF source ID is reused as existing evidence. Do not register it again under a future form record.
- [R115](wp04-section-p-atlantic-salmon-identity-review-r115-20261014.md) established the parent identity but added no form; it also explicitly kept recipe 077’s species-unqualified salmon fillets unchanged. [R172](wp04-section-p-canned-salmon-product-boundary-review-r172-20261016.md) covers a separate canned product group. [R577](wp04-section-p-next-gap-review-r577-20261017.md) held Atlantic-salmon steak because it would make generic `salmon steak` / `darne de saumon` a singleton; this fresh-whole candidate does not add steak wording. [R676](wp04-section-p-next-regional-fish-review-r676-20261018.md) added a qualified fresh-whole Barramundi form and is a nearby form/picker precedent, not an owner of this species or wording. [R706](wp04-section-p-next-seafood-gap-review-r706-20261018.md) held frozen sablefish fillet because of broad cod-cut searches; that distinct cut boundary is not reopened here.

## Phrase-first picker projection

This projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it accent-folds and normalizes terms, prefers complete word phrases to substring fallback, returns a form through its parent reference, and shows a form hint only when the query exactly equals a form label or match term. The simulated addition uses only the proposed label and qualified match terms above.

| Query | Current | With proposed form | Effect |
|---|---|---|---|
| `fresh whole Atlantic salmon` | No result | Atlantic salmon + fresh-whole form hint | Exact product phrase becomes searchable. |
| `whole Atlantic salmon` | No result | Atlantic salmon + fresh-whole form hint | Exact retailer wording remains species-qualified. |
| `saumon de l’Atlantique frais entier` | No result | Atlantic salmon + fresh-whole form hint | Canonical French identity plus the supported form state. |
| `saumon atlantique entier` | No result | Atlantic salmon + fresh-whole form hint | Qualified French product-title wording. |
| `Atlantic salmon`; `saumon de l’Atlantique`; `saumon atlantique` | Atlantic salmon | Same parent, no form hint | Parent identity searches remain unchanged. |
| `whole salmon`; `saumon entier` | No result | No result | Do not add unqualified whole-salmon match terms. |
| `whole fish`; `poisson entier` | Whole tilapia | Same Whole tilapia result | No generic whole-fish term is added. |
| `salmon`; `saumon` | 10 references | Same 10 references | The form stays attached to the existing parent; broad salmon choices do not collapse. |
| `fillet`; `filet` | 7; 2 references | 7; 2 references | No fillet term or cut behavior changes. |
| `fresh`; `frais`; `whole`; `entier` | 32; 26; 41; 17 references | 33; 27; 42; 18 references | Each remains a multi-result query. |

The full form label and match terms keep whole-cut queries qualified by Atlantic salmon. They do not make `whole salmon` or `saumon entier` appear species-resolved, and they do not interfere with the existing whole-tilapia owner of generic whole-fish wording.

## Manifest recipe scan

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned, including decoded recipe text, bilingual instructions, ingredient names/original text, preparation, notes, and reference/form IDs. The scan searched the proposed ID and exact bilingual display/match terms, `Atlantic salmon` / `saumon de l’Atlantique`, *Salmo salar*, `whole salmon`, and `saumon entier`. It found **zero matching recipe files and zero ingredient rows** for those qualified candidate terms. The manifest-ordered recipe byte total is **754,048**; SHA-256: `e87bd15cd3705924b176c6a70b55d99497a4830f9e65132917958717f54bc108`.

Recipe 077 row 10 is nearby but does not establish demand: it requests `675 g salmon fillets without skin, cut into cubes` under `ingredient-ref-salmon-fillets-without-skin`. It supplies no Atlantic species or whole-fish state. Keep the recipe and its generic fillet link unchanged.

## Bounded recommendation

**Add one `fresh_whole` form under the existing Atlantic-salmon identity if this proposal is adopted.** Use only `fresh whole Atlantic salmon / saumon de l’Atlantique frais entier`, with the qualified match terms above. Keep the form’s density null and add no measure, mapping, conversion, package yield, recipe link, substitution, cleaning state, origin claim, or fresh-weight assumption. Preserve the existing parent, identity sources, aliases, and generic salmon-fillets recipe line. Section P remains open.

This packet is proposal-only: it creates no shared JSON, ledger, plan, roadmap, workflow, generated-file, recipe, or batch changes. It assigns no active ID or ledger source ID.
