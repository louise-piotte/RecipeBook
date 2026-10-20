# WP02 B2/B3 — edible canna starch identity gap review

- **Reviewed:** 2026-10-12
- **Status:** Integrated as recommended on 2026-10-12. See the [integration record](../batches/wp02-b2-b3-canna-starch-identity-integration-20261012/README.md) for refreshed validation and current counts. The exact-ownership table and counts below are the proposal-time pre-integration snapshot.
- **Scope:** One uncovered regional extracted-starch identity from edible canna rhizomes. This review is distinct from the recent konjac-flour proposal, the potato-starch alias integration, and the existing B2/B3 integrations and holds.
- **Source-ID prefix:** `WP02-B2B3-CANNA-STARCH-IDENTITY-20261012`, S01–S09. Each proposed ID was checked against the live research ledger before drafting; no collision was found.

## Bounded decision

**Accepted on 2026-10-12:** add an identity-only `FLOUR_AND_STARCH` reference for food-grade canna starch explicitly extracted from edible canna rhizomes. Use the source-paired Canadian terminology **canna starch / fécule de toloman** as provisional bilingual displays. The Translation Bureau’s TERMIUM Plus entry pairs those terms with `toloman starch` and says the product is derived from *Canna edulis*; Kew treats that name as a synonym of accepted *Canna indica*. Canadian French trademark wording also names `amidon de canna indica à usage alimentaire`. This is source-backed Canadian wording, not an OQLF preferred-term ruling or proof of current Québec retail availability. [S01, S02, S06–S07]

| Accepted field | Value | Evidence limit |
|---|---|---|
| Stable ID | `ingredient-ref-canna-starch` | Absent from the proposal-time reference, form, legacy, and ledger IDs. |
| Category | `FLOUR_AND_STARCH` | The candidate is extracted food starch, not a whole-rhizome flour or vegetable. |
| English display | `canna starch` | TERMIUM lists this as an English term; Canadian food-goods wording uses `canna indica starch for food`. Neither source is a standalone retail package. [S01, S07] |
| French display | `fécule de toloman` | Exact Canadian TERMIUM wording for a product derived from *Canna edulis*. Keep provisional pending a Québec food-label or OQLF review. [S01] |
| Proposed English aliases | `achira starch`; `canna indica starch`; `toloman starch` | The first appears as an ingredient in a Canada-facing baked-product listing; the second appears in a Canadian food-goods declaration; the third is in TERMIUM. Do not add bare `achira`, `canna`, or `toloman`. [S01, S06–S09] |
| Proposed French alias | `amidon de canna indica à usage alimentaire` | Directly attested in a Canadian French trademark goods declaration. That declaration is not a product label or an OQLF ruling. [S06] |
| Default density / unit mappings | `null` / `[]` | No supported general mass-per-volume value or household measure was found. |

The target product is isolated food starch extracted from the rhizome of *Canna indica* (including the older source name *Canna edulis*). The whole edible rhizome, flour made by drying and milling it, and prepared achiras or bizcochitos remain outside the identity. A primary study separately analyzes achira flour and starch and reports materially different fiber and starch fractions; a Canadian retailer’s packaged-biscuit page lists `Achira starch` as an ingredient but its descriptive copy also calls the product flour. That page supports the ingredient phrase in a finished food only; it does not settle the standalone package name or authorize `achira flour` as an alias. [S02–S04, S08–S09]

## Product and alias boundaries

| Term or product | Disposition | Reason |
|---|---|---|
| Food-grade starch explicitly identified as canna / achira starch and extracted from the edible rhizome | Include in the proposed identity | Primary research distinguishes isolated starch from flour made from the same rhizome; Canadian and federal terminology sources attest canna/achira starch wording. [S01, S03–S09] |
| Whole-rhizome achira/canna flour, `achira flour`, or `farine d’achira` | Keep separate; do not alias | The study treats flour and starch as distinct fractions. The Canadian retailer listing itself uses both “Achira flour” in descriptive copy and “Achira starch” in the ingredient declaration, demonstrating why the source-specific product statement must control. [S03, S08] |
| Fresh or cooked canna rhizome, leaves, ornamental canna, or other plant parts | Exclude | They are not isolated food starch; botanical names alone do not establish an edible starch ingredient. [S02, S04–S05] |
| `sagú` / `sagu` | Do not add as alias | AGROSAVIA reports the local Colombian name `sagú` for achira starch in some regions, but its technical material distinguishes this from true sago associated with *Maranta arundinacea*. The live catalog already has separate palm-sago flour and pearls, so the regional homonym is unsafe as a global alias. [S04] |
| `Queensland arrowroot` / `arrowroot du Queensland`, `arrowroot`, `arrowroot starch`, or `fécule d’arrow-root` | Do not add as alias | TERMIUM associates Queensland-arrowroot wording with canna, but the active `ingredient-ref-arrowroot` already owns the generic arrowroot displays and starch/flour/powder aliases. Preserve source-qualified canna wording rather than collapsing the identities or creating competing arrowroot search results. [S01; live catalog audit below] |
| Cassava/tapioca, potato, sweet-potato, kudzu, lotus-root, mung-bean, and bracken starches; taro and yam flours | Keep separate | Shared starch or root origin does not establish synonymy, identical extraction, density, or substitution. These are already integrated or reviewed separately in the active B2/B3 packet set. |

A targeted OQLF search did not surface a dedicated canna-starch or toloman-food entry. TERMIUM is a federal Canadian terminology source and the Canadian French CIPO wording is administrative goods-description evidence. They support a provisional display pair, but not a claim that Québec retailers currently sell a standalone package under that exact French label.

## Measurements, forms, and substitution

- **Density and household measures:** Unknown. Keep `defaultDensity` null and `unitMappings` empty. The primary study reports laboratory composition, particle size, swelling, solubility, and thermal properties for specific achira flour and starch samples. It does not provide a general kitchen cup/spoon mass or g/mL density. The 17 g net weight on the Canadian retailer page is for each finished biscuit, not for starch. [S03, S08]
- **Forms:** Add none. The candidate identity itself is dry extracted starch; no supported retail grade or preparation-form taxonomy was found. Flour, native/modified/pregelatinized starch, and the finished biscuit are not inferred forms of this identity. [S03–S04, S08]
- **Conversion and yield:** Unknown. Extraction yields and laboratory process outcomes are source- and method-specific and do not define a kitchen conversion or reusable yield. [S03–S04]
- **Substitution:** Unknown; no global or contextual rule is supported. Functional or thickening properties in technical studies do not establish an interchangeable ratio with arrowroot, tapioca, potato, corn, or any flour. Add no substitution rule. [S03, S05]
- **Recipes:** No recipe line or text hit was found in the current bundled corpus; no recipe link or relink is justified.

## Plan and prior-work reconciliation

The active WP02 plan leaves B2 and B3 partial. B3’s remaining line is “Water-chestnut flour and other documented regional starches”; its completed sub-items cover mung-bean starch, lotus-root starch, the water-chestnut boundary, palm-sago pearls, and held bracken starch. The current flour/starch batch also lists other regional products as open. [Plan, `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section B; `docs/catalog/batches/baking-flours-starches.md`, B2/B3 rows]

Prior packet search found no focused canna/achira/toloman identity proposal or hold. The only proposal-directory mention of `achira` outside this review is a passing list of unreviewed Andean crops in the WP06 yacon review. Relevant adjacent decisions remain distinct: `ingredient-ref-arrowroot` is a broad extracted-starch product identity; `ingredient-ref-sago-flour` and `ingredient-ref-sago-pearls` represent palm-sago products; mung-bean and lotus-root starches are identity-only; bracken starch and water-chestnut/taro-corm starch candidates remain held; and the 2026-10-12 konjac-flour review concerns a different plant and flour product. The potato-starch alias follow-up changed only the existing potato-starch French alias. None allocates a canna-starch identity or a canna/achira/toloman alias. [S01; S03–S07; relevant proposals listed below]

This proposal does not reopen those decisions or mark B2/B3 complete.

## Proposal-time exact-ownership, collision, and recipe audit

Read-only snapshot of the live shared worktree on 2026-10-12. Counts and fingerprints describe the files inspected for this proposal.

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,239 | `fe3c4a2c0ec423a2a0e9bb2b1eaa43cd4fb73dfa20e44bc1050d3f551ec98f71` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import candidates | 66 | `bedef9b12dca5306ed035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| Research ledger | 1,538 records / 5,318 source entries / 4,360 distinct source IDs | `bda81990f4d69c2c69fff716dfd22a8287d59c35de4907194f63821a1c4bdb33` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows / 752,993 bytes | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

The exact-ownership audit reproduced the app’s `normalizeIngredientSearchKey` behavior: lowercase, Unicode NFKD and accent folding, explicit `œ`/`æ`/`ß` and ampersand folding, punctuation-to-space normalization, and whitespace collapse. It checked all reference display names and aliases, form labels and match terms, legacy candidate names and aliases, and every string field in the research ledger.

| Normalized phrase group | Exact reference owner | Exact form, legacy, or ledger owner |
|---|---|---|
| `canna starch`; `canna indica starch`; `achira starch`; `toloman starch`; `edible canna starch` | None | None |
| `fécule de toloman`; `fécule de tous les mois`; `amidon de canna indica`; `amidon de canna indica à usage alimentaire`; `amidon de toloman` | None | None |
| `achira flour`; `farine d’achira`; `farine de canna`; `sagú starch`; `sagu starch` | None | None |
| Proposed ID `ingredient-ref-canna-starch` and ledger candidate ID `candidate-canna-starch` | None | None |

Nearby active rows were reviewed for search and identity collisions:

| Active reference | Current boundary | Result |
|---|---|---|
| `ingredient-ref-arrowroot` | `arrowroot / arrow-root`; aliases include arrowroot starch/flour/powder and French arrow-root flour/starch terms | Do not add `Queensland arrowroot`, `arrowroot du Queensland`, or generic arrowroot aliases to canna starch. The canna product remains under its source-qualified name. |
| `ingredient-ref-sago-flour`; `ingredient-ref-sago-pearls` | Edible palm-sago flour and pearls | Keep regional `sagú`/`sagu` out of aliases because the term is used for more than one source material. |
| `ingredient-ref-kudzu-starch`; `ingredient-ref-lotus-root-starch`; `ingredient-ref-mung-bean-starch`; `ingredient-ref-bracken-starch` candidate | Separate starch sources and product decisions | No exact canna-term owner or shared identity is proposed. |
| `ingredient-ref-potato-starch`; `ingredient-ref-sweet-potato-starch`; `ingredient-ref-tapioca-starch`; `ingredient-ref-taro-flour`; `ingredient-ref-yam-flour` | Separate source materials or flour/starch classes | No alias, merge, or substitute is proposed. |

The ledger had no canna-, achira-, or toloman-specific record. The active proposal and batch search found no prior source-ID prefix collision; the proposed S01–S09 IDs were also checked directly against all 4,352 distinct source IDs in the live ledger and none is occupied.

The recipe audit read every recipe path in the live manifest, every ingredient row, and all text fields in each recipe JSON. It searched the normalized canna/achira/toloman display and alias phrases plus the false-match terms `Queensland arrowroot`, `arrowroot du Queensland`, and `sagú`/`sagu starch`. **Result: 0 of 1,123 ingredient rows and 0 of 114 recipe files matched.** The scan used the manifest-order recipe-corpus fingerprint shown above.

## Recommended integration delta (implemented)

The integration created only `ingredient-ref-canna-starch` as an identity-only `FLOUR_AND_STARCH` reference with:

- English display `canna starch`; French display `fécule de toloman`, marked provisional pending Québec food-label review.
- English aliases `achira starch`, `canna indica starch`, and `toloman starch`; French alias `amidon de canna indica à usage alimentaire`.
- Null default density, empty unit mappings, no forms, no recipe links, and no conversions, yields, or substitutions.
- One new ledger record containing S01–S09, with measurement and substitution states left `not_yet_researched` and a decision that explicitly excludes whole-rhizome flour, bare `sagú`/`sagu`, and Queensland-arrowroot wording.

Keep the full B2/B3 checklist open. No tests or emulator checks were run because the integration only adds database JSON data under `AGENTS.md`.

## Sources checked online on 2026-10-12

| ID | Source and bounded evidence | Limits |
|---|---|---|
| **WP02-B2B3-CANNA-STARCH-IDENTITY-20261012-S01** | Translation Bureau, Government of Canada, [TERMIUM Plus: FÉCULE TOLOMAN](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=FECULE+TOLOMAN). Lists English `canna starch` and `toloman starch`, French `fécule de Toloman`/`fécule de toloman`, and says the product is derived from *Canna edulis*. | Record is in the Botany subject area and dated 2002; it is Canadian terminology evidence, not a Québec food-label standard. |
| **WP02-B2B3-CANNA-STARCH-IDENTITY-20261012-S02** | Royal Botanic Gardens, Kew, [Plants of the World Online: Canna edulis](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:795997-1). Treats *Canna edulis* as a synonym of accepted *Canna indica*. | Taxonomic backbone only; it does not identify an edible starch product or a food label. |
| **WP02-B2B3-CANNA-STARCH-IDENTITY-20261012-S03** | Andrade-Mahecha, Tapia-Blácido & Menegalli, [“Physical–chemical, thermal, and functional properties of achira (*Canna indica* L.) flour and starch from different geographical origin”](https://doi.org/10.1002/star.201100149), *Starch/Stärke* 64 (2012), 348–358. Primary study obtains both flour fractions and starch from rhizomes; reports flour fiber and different sample properties. | Supports product separation and scientific scope, not a universal manufacturing specification, household measure, density, or substitution. |
| **WP02-B2B3-CANNA-STARCH-IDENTITY-20261012-S04** | AGROSAVIA / Corpoica, [“La producción del almidón de achira en Colombia”](https://repository.agrosavia.co/server/api/core/bitstreams/1b71cc28-2d96-4582-bdf9-5475ed5e1547/content), technical manual. Describes extraction of starch from *Canna edulis* rhizomes and explains that Colombian regional `sagú` can refer to achira while true sagú is associated with *Maranta arundinacea*. | Colombian regional terminology and production context; `sagú` is not adopted as a global alias. |
| **WP02-B2B3-CANNA-STARCH-IDENTITY-20261012-S05** | AGROSAVIA, [“Disponible innovación que transforma la agroindustria tradicional del almidón de achira o sagú”](https://www.agrosavia.co/noticias/disponible-innovaci%C3%B3n-que-transforma-la-agroindustria-tradicional-del-almid%C3%B3n-de-achira-o-sag%C3%BA), 2025-01-28. Calls achira starch or sagú a food-industry input derived from *Canna indica* rhizomes. | Official Colombian agricultural-research organization source; its regional term `sagú` is not generalized beyond the source context. |
| **WP02-B2B3-CANNA-STARCH-IDENTITY-20261012-S06** | Canadian Intellectual Property Office, [Canadian Trademarks Journal, French issue no. 3719](https://publications.gc.ca/collections/collection_2026/opic-cipo/RG42-2-73-3719-fra.pdf), 2026-02-04 goods-description list. Contains `amidon de canna indica à usage alimentaire`. | Canadian French administrative goods wording only; it is not a retail product label, Québec availability evidence, or OQLF approval. |
| **WP02-B2B3-CANNA-STARCH-IDENTITY-20261012-S07** | Canadian Intellectual Property Office, [Trademark details PDF, application 2400592](https://ised-isde.canada.ca/cipo/trademark-search/pdf/2400592?lang=eng). The English goods list contains `canna indica starch for food`. | Trademark goods declaration only; it does not establish that the applicant currently sells this ingredient or identify a product specification. |
| **WP02-B2B3-CANNA-STARCH-IDENTITY-20261012-S08** | Unimarket Canada, [Achiras del Huila — Bizcochitos 6 pack](https://unimarket.ca/products/achiras-del-huila-bizcochitos-6-bags-of-17-gr-each-102-gr). The ingredient declaration lists `Achira starch`; the page identifies a finished 17 g biscuit. | Canada-facing retailer listing for a prepared biscuit, not a pure starch package. The same page calls the snack made from Achira flour in descriptive copy, so it does not settle a general flour/starch label boundary. |
| **WP02-B2B3-CANNA-STARCH-IDENTITY-20261012-S09** | Productora de Alimentos Ermita SAS, [Achiras del Huila](https://usachirasdelhuila.com/AchirasDelHuila), manufacturer product page. Names achira starch among the baked snack’s main ingredients. | Manufacturer source for a finished Colombian snack, not a standalone Canadian product or independent French naming authority. |

### Prior files reviewed

- `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section B, B2/B3 checklist and dated decisions.
- `roadmap.md`, current WP02 Section B and B2/B3 entries.
- `docs/catalog/batches/baking-flours-starches.md`, B2/B3 rows and remaining-coverage notes.
- `docs/catalog/proposals/wp02-b2-b3-konjac-flour-identity-gap-review-20261012.md`.
- `docs/catalog/proposals/wp02-b2-b3-next-open-flour-starch-review-20261011.md` (bracken-starch hold).
- `docs/catalog/proposals/wp02-b2-b3-regional-starches-residual-gap-review-20261010.md` and `wp02-section-b-regional-starch-next-gap-review-20261010.md` (arrowroot and water-chestnut review).
- `docs/catalog/proposals/wp02-water-chestnut-flour-starch-boundary-20261009.md`.
- `docs/catalog/proposals/wp02-extracted-taro-corm-starch-quebec-term-review-20261011.md`.
- `docs/catalog/proposals/wp02-b2-b3-lotus-starch-quebec-wording-review-20261010.md`.
- `docs/catalog/proposals/wp02-section-b-alternative-flour-starch-gap-sweep-20261012.md` and current potato-alias integration references.
- Proposal-directory search for `canna`, `achira`, `toloman`, and proposed IDs.
