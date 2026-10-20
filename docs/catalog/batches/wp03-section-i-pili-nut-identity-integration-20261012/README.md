# WP03 Section I pili-nut identity integration — 2026-10-12

## Decision

Added identity-only `pili nuts / noix de pili` as `ingredient-ref-pili-nuts` in
`NUT_SEED_AND_DRIED_FRUIT`, scoped to the edible kernel of *Canarium ovatum*. The English aliases
are `pili nut` and `pilinut`; the French display comes from TERMIUM and Québec-facing retail
wording. `Noyer de pili` names the crop/tree, while `pili-pili` is an African pepper term, so
neither is a nut alias. Other *Canarium* species remain separate.

Activated, sprouted, salted, and dehydrated nuts remain product-specific states. No form, recipe
link, density, unit mapping, kitchen measure, conversion, yield, or substitution was added. ALOCAL's
28 g nutrition basis and Pili Hunters' package sizes are not household measures; sensory comparison
with macadamia and cashew is not substitution guidance. The full recipe corpus has no matching
ingredient row.

## Evidence

- [TERMIUM Plus: pili nut](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enb&lang=fra&srchtxt=PILI+NUT) standardizes `pili nut / noix de pili` and identifies the edible kernel.
- [Agriculture and Agri-Food Canada GRIN-Global-CA](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=8819&lang=en-CA) lists *Canarium ovatum* common names `pilinut` and `pili-nut`.
- [Health Canada's crop-name table](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html) lists `noyer de pili` for *C. ovatum* and separately names *C. vulgare* and *C. indicum*.
- [Kew Plants of the World Online](https://powo.science.kew.org/taxon/urn%3Alsid%3Aipni.org%3Anames%3A127447-1) accepts *C. ovatum* and gives the Philippines as its native range.
- The Québec-facing [ALOCAL listing](https://alocal.ca/produit/noix-de-pili-activees-non-salees/) uses `noix de pili`, describes a pre-germinated and dehydrated product, and is currently marked sold out. Its 28 g nutrition basis is not a household measure.
- The [Pili Hunters Canada storefront](https://eatpilinuts.com/en-ca/products/new-pili-hunters-sprouted-pili-nuts-with-pink-himalayan-salt) describes a sprouted salted product and lists 1.85 oz, 5 oz, and 1 lb package sizes.
- OQLF's [pili-pili entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17567394/pili-pili) defines a hot African pepper, not a pili nut.
- [SwitchGrocery's supplier article](https://www.switchgrocery.com/blogs/blog/pili-hunters-the-original-pili-nut) compares flavor and texture with macadamia and cashew; it provides no tested replacement ratio or recipe method.

The proposal contains the complete source register and detailed taxonomy, product-state, measurement,
substitution, ownership, and recipe-demand review:
[WP03 Section I pili-nut identity review](../../proposals/wp03-section-i-pili-nut-identity-review-20261012.md).

## Static verification

- Bundled seed-package validation, reference normalization, and generated-catalog freshness checks passed.
- Research-ledger validation passed with zero errors. The eight new source IDs occur once each.
- The live exact-key audit found no previous normalized owner for the proposed identity or aliases. The complete 114-recipe / 1,123-row corpus has no candidate-term match.
- The two changed JSON files are UTF-8 without BOM; non-ASCII text is stored with Unicode escapes. The recipe corpus is unchanged at 752,993 bytes with manifest-ordered digest `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,239 references | `fe3c4a2c0ec423a2a0e9bb2b1eaa43cd4fb73dfa20e44bc1050d3f551ec98f71` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `research-ledger.v1.json` | 1,538 records; 5,318 source entries; 4,360 distinct source IDs | `bda81990f4d69c2c69fff716dfd22a8287d59c35de4907194f63821a1c4bdb33` |
| `BundledIngredientCatalog.kt` | 1,239 generated references | `21221563616307ec1bbed4cdea8302014b5eb1ca45a64589472c2d258f1b621d` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

The broader Section I seed/kernel checklist remains open.
