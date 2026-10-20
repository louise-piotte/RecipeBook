# WP03 Section K R347 — curry-leaf Québec terminology integration

Integrated on 2026-10-16 as an alias-only update to the existing `ingredient-ref-curry-leaves` identity and its R282 dried form.

- The display remains `curry leaves / feuilles de cari`.
- French identity aliases: `feuille de cari`, `feuille de curry`, `feuilles de curry`, and `feuille de Murraya`.
- English identity alias: `curry leaf`.
- The existing whole dried form retains its label `dried curry leaves / feuilles de cari séchées` and lyophilized match term. Added exact singular/plural terms for `feuille(s) de cari séchée(s)`, `feuille(s) de curry séchée(s)`, `feuille(s) de Murraya séchée(s)`, and English singular forms `dried curry leaf`, `curry leaf, dried`, and `freeze-dried curry leaf`.

The Government of Canada Translation Bureau's TERMIUM Plus record maps `curry leaf` to `feuille de cari`, `feuille de curry`, and ISO-standardized `feuille de Murraya`; it says the terminology applies to whole and ground products and limits `feuille de caloupilé` to Réunion. OQLF's separate `cari` entry defines a spice blend and accepts `cari`, `carry`, `cary`, and `curry` for that blend. Current Québec sources use `feuille de cari` in Montréal restaurant writing and Québec retail, while Well.ca's French listing uses `feuille de curry`. A French dietitian recipe lists `feuilles de cari` as leaves separately from the prepared dish `cari`.

The aliases were chosen to preserve the leaf boundary. Do not add bare `cari` or `curry`: both can direct users to the existing curry powder and curry paste products. Do not add `feuille de caloupilé`: TERMIUM scopes it to Réunion, and a single Montréal seller's other-names list does not establish a general Québec synonym. The broader picker still keeps powders and pastes distinct. No source recipe matched the identity terms in the 114-recipe / 1,123-row bundle.

No identity, category, measurement, density, mapping, conversion, yield, recipe link, or substitution changed. No new product form was added; the English term's TERMIUM applicability to ground leaves does not create an active ground form. The existing package quantities and product-specific freeze-drying evidence remain source-specific.

## Picker projection

Projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Result after R347 |
|---|---|
| `curry leaves`, `curry leaf`, `feuilles de cari`, `feuille de cari`, `feuille de curry`, `feuilles de curry`, `feuille de Murraya` | Existing curry-leaf identity only |
| `dried curry leaf`, `curry leaf, dried`, `feuilles de curry séchées`, `feuille de curry séchée`, `feuilles de Murraya séchées` | Existing curry-leaf identity with its dried-form hint |
| `freeze-dried curry leaf`, `feuilles de cari lyophilisées` | Existing curry-leaf identity with its dried-form hint |
| `curry powder` / `poudre de cari`; `curry paste` / `pâte de cari` | Their separate current identities |
| bare `cari` / `curry` | No new leaf alias; broad existing matching behavior remains |

The alias sources and accepted decisions are recorded on the existing identity and dried-form records in the research ledger. The seed package validator, normalizer check, generated reference index, picker projection, corpus scan, encoding, Markdown links, and scoped whitespace checks were used for static validation. **No software tests, build, emulator checks, or deployment were run** because this update only adds database JSON data, as specified in `AGENTS.md`.

## Sources reviewed

- TERMIUM Plus, [curry leaf, Record 17](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=7&i=&index=enb&lang=eng&sg_kp_wet=1530667&srchtxt=SEASONING).
- OQLF, [cari](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8355168/cari).
- Tourisme Montréal, [MTLàTABLE 2026: recommended restaurant addresses](https://www.mtl.org/fr/experience/recos-cuisinomane-mtlatable).
- La Moisson, [Feuille de Cari Entière Bio](https://lamoisson.com/products/feuilles-de-cari-entieres-bio).
- Well.ca, [Cha’s Organics feuille de curry entière](https://well.ca/fr/produits/chas-organics-curry-leaf-whole_140106.html).
- Les Diététistes du Canada, [Mois de la nutrition 2021 recipe booklet](https://claurendeau.qc.ca/app/uploads/2021/02/NM2021-Recipe-ebook-French.pdf), p. 9.
- Existing identity evidence: India Spices Board, [Curry Leaf](https://indianspices.com/spice-catalog/curry-leaf.html); existing form evidence: Health Canada, [EMRL2008-02](https://publications.gc.ca/collections/collection_2008/pmra-arla/H113-29-2008-2F.pdf), p. 8.
