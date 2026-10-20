# WP03 Section F: R147 unqualified farro grain product boundary review

## Packet record

- **Review date:** 2026-10-15
- **Status:** proposal only
- **Scope:** whether Canadian and Québec use supports a searchable dry-grain product identity named farro, while leaving species-specific and flour interpretations separate
- **Current ledger candidate:** `ingredient-ref-farro`, `identityState: needs_clarification`
- **Decision:** add a narrowly named, identity-only farro-grain product class; do not resolve farro as one wheat species or add farro to any species-specific aliases

## Recommendation

**Add `farro grain / grains de farro` as a species-neutral grain product identity.** Canadian and Québec listings use English `Farro Grain` / `Farro Grains` and Québec French `Grains de Farro` as names for dry edible grain products. This gives the picker a useful grain-specific result without deciding whether any particular package contains einkorn, emmer, or spelt. The names are market-product evidence, not a botanical definition. [FARRO-DELTA-S01, WP03-FARRO-GRAIN-R147-20261015-S01–S02]

This is a product-class identity for uncooked edible grain sold as farro, including products whose package names distinguish whole, semi-pearled, or pearled grain. It does not identify a taxon or grade. Keep any package-specific cracked, pearling, cooked, or other state wording attached to that product or recipe; this proposal adds no global form taxonomy. Keep flour, semolina, pasta, and prepared dishes outside this grain identity. The separately owned farro-flour review remains independent.

OQLF accepts *farro* in French under the emmer entry, while TERMIUM and the federal cereal specification document broader einkorn, emmer, and spelt usage. Health Canada also lists farro parenthetically under spelt names, and Metro Québec sells a product titled *Farro d’épeautre perlé biologique* with a pearled-spelt ingredient line. These sources rule out aliases from farro to emmer, spelt, or einkorn; they do not prevent a species-neutral market grain class from representing the grain product sold under that name. Reuse the existing ledger sources `FARRO-S01`, `FARRO-S02`, `FARRO-S03`, and `FARRO-S05` for those established boundaries.

The display pair is deliberately explicit about product type: English **farro grain**, French **grains de farro**. Do not add `farro` as a stored alias: the current search engine already matches the word within the canonical names. Do not add `farro` to emmer, spelt, or einkorn aliases, and do not add `épeautre`, `amidonnier`, `engrain`, `petit épeautre`, or their English species terms to this row. Do not add `farro flour` / `farine de farro` here.

## Exact proposed catalog delta

Append this one object to `ingredient-references.v1.json`; make no `ingredient-forms.v1.json` change:

```json
{
  "id": "ingredient-ref-farro-grain",
  "nameFr": "grains de farro",
  "nameEn": "farro grain",
  "aliasesFr": [],
  "aliasesEn": [
    "farro grains"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The canonical names and the single English plural alias have direct Canadian or Québec retail wording. The French canonical name is plural because that is the attested Québec listing. The normalized key for the proposed ID and all three search phrases is unowned in the current reference/form set. Do not add a generic bare `farro` alias: it is already searchable as a word in both canonical display phrases, and an alias would not narrow its species or product-state meaning further.

## Current package audit

| Audit | Current result |
| --- | --- |
| Active references and forms | 1,503 references and 119 forms. No active reference name/alias or form label/match term contains `farro`. No farro reference ID is allocated. |
| Nearby identities | `ingredient-ref-emmer-grain` (`emmer wheat / blé amidonnier`), `ingredient-ref-emmer-flour` (`emmer flour / farine d’amidonnier`), `ingredient-ref-einkorn-berries` (`einkorn berries / grains de petit épeautre`), and the spelt-flour identity remain separate. None has a farro alias. Their default densities are null and mappings are empty. |
| Farro forms | No form label or match term names farro, emmer, spelt, or einkorn. The existing forms file has no form under a farro ID. |
| Research ledger | The live `ingredient-ref-farro` candidate remains `needs_clarification`, with measurement and substitution research `not_yet_researched`, 15 source records, and 4 decisions. This proposal does not edit that shared record. |
| Legacy imports | No farro/emmer/spelt/einkorn legacy candidate is present. |
| Recipe demand | Parsed all 114 manifest-listed recipe files and all 1,123 ingredient rows. Case-insensitive checks for `farro`, `emmer`, `spelt`, `einkorn`, `épeautre`, `petit épeautre`, `amidonnier`, `engrain`, `farro grain`, and `grains de farro` found zero recipe-file and zero ingredient-row hits. No recipe links or relinks are proposed. |

## Exact picker projection

I inspected `IngredientReferenceSearchIndex` and projected the proposed reference through its bilingual name, alias, and form search terms using the same normalization and exact-phrase-then-substring behavior. This is a static projection, not a runtime UI test.

| Query | Current result | Result with this delta |
| --- | --- | --- |
| `farro` | none | `farro grain / grains de farro` |
| `farro grain` | none | `farro grain / grains de farro` |
| `farro grains` | none | `farro grain / grains de farro` |
| `grains de farro` | none | `farro grain / grains de farro` |
| `grain de farro` | none | none; this singular phrase is not source-attested and is not proposed as an alias |
| `farro flour` | none | none |
| `farine de farro` | none | none |
| `farro d’épeautre perlé` | none | none; the Metro phrase remains product-specific and no spelt-grain row is added here |
| `emmer`, `emmer wheat`, `emmer flour` | existing emmer results | unchanged |
| `spelt`, `épeautre`, `einkorn` | existing species-specific results | unchanged |

A bare `farro` query will return the new row because `farro` is part of its canonical display, but the visible label says `farro grain`. When the separately owned flour proposal is considered, the coordinator should project both changes together: a broad `farro` query should then expose both clearly qualified grain and flour rows, while `farro flour` should select only the flour result. This proposal does not create or pre-empt that flour identity.

The current picker projection does not expose a farro result and does not collide with existing species-specific results. The recipe corpus also supplies no demand-driven reason to add a link.

## Forms, measurements, and substitutions

- **Forms:** Add none. The federal cereal specification describes emmer sold dry and discusses whole, semi-pearled, and pearled product states, while also noting that farro naming spans three species. Those state terms can remain source-specific; there is not enough evidence to create a transferable species-neutral form matrix in this identity-only review. [FARRO-S03]
- **Measures and density:** Keep `defaultDensity: null` and `unitMappings: []`. Retail package sizes and bulk sale sizes (including a 680 g pack and a 10 kg product listing) are package quantities, not household-volume conversions or densities. No reusable farro-grain portion is established.
- **Cooking yield or conversion:** Add none. A Canadian mill’s product page gives its own farro-to-water ratio and 45–60 minute cooking instruction, but identifies its product as emmer and does not provide a transferable dry-to-cooked yield. Do not generalize it to the three-species market class. [WP03-FARRO-GRAIN-R147-20261015-S05]
- **Substitutions:** Add no rule. General recipe uses such as salads, pilafs, and soups do not establish a directed ingredient/form substitution, and product copy describing farro as a rice-like or protein alternative has no bounded recipe scope or conversion ratio.
- **Recipe links:** Add none; corpus scan found no candidate demand.

## Relationship to prior farro decisions

The [2026-10-10 grain/flour boundary review](wp02-wp03-farro-grain-flour-boundary-20261010.md), [Canadian product-label delta](wp02-wp03-farro-canadian-product-label-delta-20261010.md), and [2026-10-11 boundary review](wp03-farro-boundary-review-20261011.md) correctly withheld a species-level alias and a generic `farro` row because the evidence then under review crossed species and flour/grain contexts. This R147 proposal makes the narrower distinction those reviews did not model: a named, species-neutral grain product class with an explicit `grain` display, and a separate farro-flour owner. It does not overturn their species-boundary findings or authorize mapping a plain farro flour phrase to this grain row.

The old `ingredient-ref-farro` candidate remains useful for the unresolved taxonomy and product-state question. If this proposal is integrated, create a separate accepted research record for `ingredient-ref-farro-grain` with the R147 grain-product evidence; do not change the existing candidate to a species-wide accepted alias and do not duplicate sources already recorded there.

## Proposal-local source register

The four R147 IDs below are new and unique against the current ledger and proposal archive. Existing source IDs noted above should be reused rather than copied into the ledger again.

- **WP03-FARRO-GRAIN-R147-20261015-S01 — Calgary Co-op, [Bob’s Red Mill Organic Farro Grains](https://shoponline.calgarycoop.com/store/calgary-co-op/products/25456201-bob-s-red-mill-organic-farro-680-g).** The Canadian grocery listing uses the exact English product title `Bob’s Red Mill Organic Farro Grains`, identifies a 680 g package, and places it in grocery retail. The listing title supports the English plural alias; it does not identify the species or provide an ingredient declaration.
- **WP03-FARRO-GRAIN-R147-20261015-S02 — Délices de la forêt Valli, Varennes, Québec, [Graines biologiques](https://delicesdelaforet.com/categorie-produit/produits-biologiques/graines-biologiques-924/).** Under its French organic-seed/grain product page, the Québec distributor lists `Grains de Farro Biologiques`, 10 kg. The site gives a Varennes address. This supports the French display phrase and grain-product scope, not species, grade, or a kitchen measure.
- **WP03-FARRO-GRAIN-R147-20261015-S03 — Milano Fruiterie, Montréal, [Riz et grains](https://milanofruiterie.ca/epicerie-fine/riz-grains/).** The Montréal retailer’s French page labels the subsection `Farro (épeautre)`, describes farro as an ancient grain, and says it is better known in Québec as *épeautre*. This supports Québec consumer-facing grain usage while showing why `épeautre` must not become an alias for this broader row; the page is retailer copy, not a taxonomic authority.
- **WP03-FARRO-GRAIN-R147-20261015-S04 — Health Canada, [Gluten: a group of proteins that people with gluten-related disorders should avoid](https://www.canada.ca/en/health-canada/services/food-nutrition/reports-publications/food-safety/gluten-pamphlet.html).** In the wheat section, Health Canada lists `Spelt (dinkel, farro)` among other wheat names. The page cautions that names other than wheat on labels are not permitted without the word wheat under current labelling requirements. Use this as evidence that Canadian usage does not reserve farro to emmer; do not interpret it as a catalog alias prescription.
- **WP03-FARRO-GRAIN-R147-20261015-S05 — Flourist, Vancouver, [Organic Farro](https://flourist.com/products/farro).** The Canadian product is sold as Canadian-grown `Organic Farro`; the description calls it emmer and gives product-specific preparation of one part farro to four parts water for 45–60 minutes. Package sizes and cooking guidance are specific to this product and do not support default density, unit mapping, yield, or a rule for the wider class.

## Limits and remaining work

This proposal adds only a market product identity, not a taxonomic resolution. The three species and source-specific grain processing states remain unresolved when a recipe or package requires more detail. No independent Québec display approval is claimed beyond the direct retailer wording for *grains de farro*. The aggregate Section F checklist remains open, and the separately assigned farro-flour boundary remains outside this proposal.
