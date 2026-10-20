# WP02 B2 cowpea flour — Québec name and product-scope hold

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Hold recorded in the plan, roadmap, and batch README. No catalog, forms, ledger,
  recipes, or generated files changed.
- **Scope:** One candidate identity: cowpea seed flour, marketed in English as `cowpea flour`.
  This review does not revisit the accepted whole-pulse identity `ingredient-ref-black-eyed-peas`.
- **Checklist fit:** A distinct pulse flour under WP02 B2. The starter list does not name cowpea
  flour, and no existing WP02 proposal or batch review was found for this flour phrase. The nearby
  adzuki, horse-gram, pigeon-pea, moth-bean, green-pea, lentil, and mung-bean flour reviews concern
  different species or products.
- **Proposal-local source-ID prefix:** `WP02-B2-COWPEA-FLOUR-QUEBEC-HOLD-20261012`. It was absent
  from current ledger sources and prior proposal/batch files before this review.

## Recommendation

**Hold a new cowpea-flour reference.** A current Québec-facing seller lists `COWPEA FLOUR` in
English, and an older French catalogue from the same seller used `FARINE DE NIÉBÉ`. The OQLF
supports `cowpea` as an English term for *Vigna unguiculata* and gives Québec French names for the
whole edible legume. However, the current product page does not give a French product name, an
ingredient declaration, or a species/process statement. The French listing is an older, out-of-stock
catalogue snapshot. A French IITA manual and a Senegalese standard establish that cowpea flour is a
real product, but they describe different whole-seed and dehulled-seed scopes and do not establish a
current Québec label for this seller's product. [S01–S06]

Do not create `ingredient-ref-cowpea-flour`, attach flour wording to the whole-pulse row, or add a
candidate ledger record in this review. Reopen if a current Québec/Canadian French product page or
package confirms the French display and identifies its seed source/process, or if an authoritative
Québec food terminology source settles the flour name and scope.

## Candidate and picker boundary

| Phrase or product | Current finding | Disposition |
|---|---|---|
| `cowpea flour` | Exact term is not owned by an active reference, form, legacy candidate, or ledger candidate. A current Makeda product page uses this English title. [S03] | Hold as a new English display until the Québec French name and the local product's scope are confirmed. |
| `farine de niébé` | No exact current catalog or ledger owner. Makeda's older French catalogue uses `FARINE DE NIÉBÉ`, but lists the product as out of stock and is indexed as an older page. [S04] | Keep documentary; do not yet activate as the French display or alias. |
| `black-eyed peas`, `doliques à œil noir`, `haricot à œil noir` | Owned by the existing whole-pulse reference `ingredient-ref-black-eyed-peas`. [S01, S02] | Preserve on the whole-pulse row. Do not attach flour aliases to it. |
| `cowpea`, `cow pea`, `cowpeas`, `cow peas` | English aliases of `ingredient-ref-black-eyed-peas`; the ledger's accepted decision keeps these exact crop names on the whole-pulse identity. [S01] | Preserve the whole-pulse aliases. Do not remove or redirect them. |
| `black-eyed pea flour`, `black-eyed bean flour`, `farine de haricot à œil noir`, `farine de pois à œil noir`, `farine de cornille` | No exact current owner; no reviewed Québec product label supports these as flour names. | Leave unassigned. Do not infer these aliases from the OQLF's whole-crop synonyms. |
| extracted starches, whole-pulse forms, roasted/sprouted/cooked products | No cowpea flour-specific forms are present. This is not a starch, cooked-pulse, sprout, roasted-flour, or composite-flour review. | Keep their existing boundaries; add no form or cross-product alias. |

The picker searches complete normalized word phrases contained within a stored name or alias before
falling back to partial matching. On that behavior, a future exact `cowpea flour` name would match
the full query `cowpea flour` without taking the whole-pulse row's `black-eyed peas` or French
`doliques à œil noir` result. A bare `cowpea` query would return both rows, because `cowpea` is an
existing pulse alias and also a complete word in the proposed longer phrase. That is an additional
result, not a replacement of the pulse result. A future `farine de niébé` phrase would be a distinct
query today because `niébé` is not on the active pulse row. Keep the proposed picker boundary narrow
if this identity is later accepted; do not add bare `niébé`, `cowpea`, or black-eyed-pea terms as
flour aliases.

## Ownership audit at initial review

Read-only snapshot at the initial review, before later unrelated data integrations, 2026-10-12.
Current cowpea exact ownership was unaffected by those integrations. File sizes and SHA-256 values
describe this audit snapshot:

| Surface | Current inventory | SHA-256 |
|---|---:|---|
| Ingredient references | 1,260 rows | `f0e0f496d79abedf2e4ff0409cdc0acaaad389f6b08161ece4c6180d68185434` |
| Ingredient forms | 94 rows | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Research ledger | 1,569 records; 5,502 source entries; 4,540 distinct source IDs | `5c551e67598cbefed66d9cbbb98bba869e5cb62c627df58fc5ab01f576ab9c13` |
| Legacy import candidates | 66 rows | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |

Exact ownership was checked across reference names and aliases, form labels and match terms, legacy
names and aliases, and ledger record IDs/source text. Comparison lowercases, applies NFKD and
accent-folding, folds `œ` to `oe`, and normalizes punctuation and whitespace. Exact current owners:

| Normalized phrase | Exact current owner |
|---|---|
| `cowpea flour`; `cow pea flour`; `cowpeas flour`; `cow peas flour` | None. |
| `farine de niébé`; `farine de niebe`; `farine de dolique à œil noir`; `farine de haricot à œil noir`; `farine de pois à œil noir`; `farine de cornille` | None. |
| `ingredient-ref-cowpea-flour`; `candidate-cowpea-flour` | Neither ID exists in references, forms, legacy candidates, or ledger records. |
| `black-eyed peas`; `doliques à œil noir`; `haricot à œil noir` | `ingredient-ref-black-eyed-peas`: English display, French display, and French alias, respectively. |
| `cowpea`; `cow pea`; `cowpeas`; `cow peas`; `blackeye pea`; `black-eyed bean`; `blackeye bean` | English aliases of `ingredient-ref-black-eyed-peas`. |
| `black-eyed pea` | No exact owner; the whole-pulse alias is `blackeye pea` (without the hyphenated spelling). |
| `niébé`; `cornille` | None. |

The current whole-pulse reference is category `LEGUME_AND_PULSE`, with display names `black-eyed
peas / doliques à œil noir`, French alias `haricot à œil noir`, and the English aliases listed
above. It has null density and empty unit mappings. No forms are attached to that row, and no current
form owns any candidate flour phrase. The verified ledger record
`ingredient-ref-black-eyed-peas` cites the OQLF entry and CFIA species evidence; its accepted decision
adds only the current whole-cowpea aliases and no recipe links, forms, measurements, conversions,
yields, or substitutions. There is no flour-specific ledger record. The separate unresolved
`candidate-fresh-shell-beans` is a broad fresh-harvest-stage candidate, not a cowpea-flour identity.

No relevant exact phrase or proposed ID is owned by a legacy candidate. No existing proposal or
batch contained the candidate flour phrases or this proposal-local source-ID prefix when checked.
The active pulse source prefix and accepted pulse decision remain unchanged; no ledger entry is
proposed.

## Bundled recipe-corpus demand audit

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned, including the
full serialized recipe text and ingredient references. The scan found **zero** mentions of `cowpea
flour`, `cow pea flour`, `black-eyed pea flour`, `farine de niébé`, `farine de dolique à œil noir`,
or the related cowpea/black-eyed-pea terms. It found **zero ingredient rows linked** to
`ingredient-ref-black-eyed-peas` and no direct recipe demand for this flour candidate. The ordered
corpus fingerprint is
`7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

This is an audit of the bundled 114-recipe corpus, not a claim that cowpea flour is uncommon or
unused elsewhere. Recipe demand supplies no reason to add a recipe link, form, measurement, or
substitution.

## Product-scope and evidence limits

- OQLF's reviewed food entry identifies `dolique à œil noir` and `haricot à œil noir`, lists English
  `cowpea` among its equivalents, and identifies *Vigna unguiculata*. It is terminology for the
  edible legume, not a flour definition. It does not make all flour sold as `cowpea flour` a
  demonstrated product of the specific local SKU. [S01]
- Health Canada's Canadian Nutrient File pairs `Black-eyed peas (cowpeas)` with French
  `Haricots à oeil noir (dolique)` for a boiled whole food. This corroborates Canadian bilingual
  whole-pulse wording only; the CNF entry is not flour terminology or a flour measurement. [S02]
- Makeda's current English product page titles the item `COWPEA FLOUR` and says it is used for acara
  and can be mixed with wheat flour in pastries. Its page does not identify the botanical species,
  ingredients, dehulling status, package mass, or French product title. The seller's current French
  home page advertises delivery across Canada and cites support from the City of Québec; that
  establishes Québec market context, not the flour's milling specification. [S03, S04]
- Makeda's older French collection listing gives the exact title `FARINE DE NIÉBÉ`, a short
  description, and a `$7.99` listing marked out of stock. The indexed listing is an older catalogue
  snapshot, so it is historical Québec-market wording rather than confirmation of the current
  product page's French display or package label. [S04]
- The IITA/YEASA French processing manual distinguishes `farine de Niébé dépelliculé` from
  `farine de Niébé entière`: one process soaks and removes hulls before drying and milling; the
  other mills whole grains. It also shows separate akara/beignet preparations. This establishes
  genuine process variants, but is a West African training manual, not a Québec retail specification
  or proof of what Makeda sells. [S05]
- Senegalese standard NS 03-089 defines `farine de niébé` from mature, sound, whole, ungerminated
  seeds ground to an appropriate fineness; coarse particles may be separated, remilled, and
  recombined. The official Senegalese directory establishes one regulated product definition, not a
  Québec French display rule or the local seller's conformity to that standard. [S06]

The evidence supports a real cowpea-flour product family and the source wording `cowpea flour` /
`farine de niébé` in other contexts. It does not settle a current Québec display and whether the
current Canadian-facing SKU is whole-seed or dehulled flour. Avoid turning evidence from a French
African-language context into a Québec market claim without a current local label.

## Forms, numeric data, and substitution limits

- Add no form, including `whole`, `dehulled`, `roasted`, `sprouted`, or `cooked`; the current Québec
  product page does not disclose which flour it sells. IITA's 2-hour soaking and 8-hour drying at
  45 °C are process instructions for a specific dehulled-flour method, not recipe measures or a
  reusable app form rule. [S05]
- Add no density, unit mapping, household portion, conversion, yield, or package-yield observation.
  The Makeda page gives no net mass. The flour standard's milling/fineness language and the CNF
  entries for boiled whole cowpeas cannot be converted into flour measures. [S02, S03, S06]
- Add no contextual or global substitution. Makeda's note that its flour can be mixed with wheat
  flour gives no ratio, direction, recipe role, or general interchange claim. It must not be
  promoted to a wheat-flour replacement rule. [S03]
- Keep the active whole-pulse row's numeric and substitution states unchanged. No recipe links or
  candidate-to-reference mappings are proposed.

## Source register

All web sources were accessed on 2026-10-12. IDs are proposal-local; no evidence was written to the
shared ledger.

| ID | Source and support | Limits |
|---|---|---|
| **WP02-B2-COWPEA-FLOUR-QUEBEC-HOLD-20261012-S01** | Office québécois de la langue française, [*dolique à œil noir* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082985/dolique-a-oeil-noir). Lists `dolique à œil noir` and `haricot à œil noir`, English `cowpea` and `black-eyed pea` terms, and *Vigna unguiculata*. | Species and whole-pulse terminology, not flour naming or product processing. The entry was last updated in 1991. |
| **WP02-B2-COWPEA-FLOUR-QUEBEC-HOLD-20261012-S02** | Health Canada, [Canadian Nutrient File serving record 3281](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3281), `Black-eyed peas (cowpeas), catjang, boiled / Haricots à oeil noir (dolique), kunde, bouillis`. | Bilingual Canadian term for a boiled whole food only. Its portion information is not applied to flour; the online CNF publication is the 2015 file. |
| **WP02-B2-COWPEA-FLOUR-QUEBEC-HOLD-20261012-S03** | Les Aliments MAKEDA, [current English `COWPEA FLOUR` product page](https://www.makedasnfood.com/en/products/farine-de-niebe-copie). Describes the product as used for acara and says it can be mixed with wheat flour for pastries; the seller advertises Canada-wide delivery. | A current seller listing, not a package image, ingredient declaration, species statement, or milling specification. The page's product name is English. |
| **WP02-B2-COWPEA-FLOUR-QUEBEC-HOLD-20261012-S04** | Les Aliments MAKEDA, [French collection page](https://www.makedasnfood.com/collections/all?page=2) and [French home page](https://www.makedasnfood.com/). The collection page shows `FARINE DE NIÉBÉ` and marks it out of stock; the home page identifies Canada-wide delivery and City of Québec support. | The collection page is an older indexed snapshot with a larger catalogue and does not establish a current product package/name. The home page does not describe this flour. |
| **WP02-B2-COWPEA-FLOUR-QUEBEC-HOLD-20261012-S05** | International Institute of Tropical Agriculture / YEASA, [*Manuel de formation sur la production et la transformation du niébé / soja*](https://www.iita.org/wp-content/uploads/2022/02/Cowpea-Soybean-manual_-French-Final.pdf), pp. 44–47. Shows whole and dehulled niébé-flour processes and related fritter preparations. | Francophone agricultural training source, not a Canadian consumer label. Process parameters are not transferred to app measurements. |
| **WP02-B2-COWPEA-FLOUR-QUEBEC-HOLD-20261012-S06** | République du Sénégal, [*Répertoire des normes dans le domaine agroalimentaire*](https://senegalcommerce.sec.gouv.sn/Documents/ASN/Publications/R%C3%A9pertoire%20des%20Normes%20dans%20le%20Domaine%20Agroalimentaire.PDF), entry NS 03-089, `Farine de niébé — Spécifications`; the [Association Sénégalaise de Normalisation catalogue](https://asn.sn/en/content/catalogue-des-normes-s%C3%A9n%C3%A9galaises-2024) lists the same standard. The government directory reproduces its whole-seed definition. | A Senegalese standard context; it cannot establish Québec French usage or the process of a separate seller's product. |

## Recorded hold decision

**HOLD.** Keep `ingredient-ref-black-eyed-peas` and its exact whole-pulse ownership unchanged. Add no
cowpea-flour reference or aliases, no forms or numeric data, no recipe links, no substitutions, and no
ledger candidate. The identity is plausible and source-attested, but current Québec French product
wording and the process scope of the Québec-facing SKU remain unconfirmed. The plan and roadmap now
record this hold; no database data changed.
