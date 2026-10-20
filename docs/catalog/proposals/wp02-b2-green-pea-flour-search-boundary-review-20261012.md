# WP02 B2 — Green pea flour identity and search boundary review

- **Date:** 2026-10-12
- **Disposition:** **Hold catalog insertion and aliases.** Commercial and research sources establish green pea flour, but the current picker would redirect the bare query `green pea` from whole green peas to the flour row. The fr-CA flour display also remains unsettled.
- **Root disposition:** Confirmed hold. No active reference or ledger identity was added; the open question is recorded in the [batch review](../batches/wp02-b2-green-pea-flour-search-hold-integration-20261012/README.md).
- **Plan scope:** WP02 B2, alternative flours and starches; the open pulse-flour list includes lentil and pea flours.
- **Candidate ID (unreserved):** `ingredient-ref-green-pea-flour`
- **Potential English display:** `green pea flour`
- **French display under review:** `farine de pois verts` / `farine de petits pois`; neither is reserved.
- **Source ID namespace:** `WP02-B2-GREEN-PEA-20261012` (ten IDs, S01–S10). The prefix was checked against the current ledger source IDs and all existing proposal/batch text before assignment; no collision was found.

## Decision

Keep green pea flour as a distinct research candidate, but do not create a canonical reference yet. Current Canadian mill and certification sources distinguish whole-green-pea and split-green-pea flour products. A Québec retailer currently uses both `farine de pois verts` and `farine de petits pois` in green-pea pasta listings, while OQLF's entries define the fresh green-pea term and the dried split-pea term separately. The evidence supports a flour identity family, but does not settle whether whole and split starting material belong under one catalog identity or which Québec French display should represent it.

The immediate blocker is picker search behavior. The proposed English display contains the complete phrase `green pea`. `IngredientReferenceSearchIndex.filterNormalized` first returns all entries whose search terms contain the query as a complete word phrase. It uses substring fallback only when there are no phrase matches. Today `green pea` reaches `ingredient-ref-peas` (`green peas`) by fallback. With a `green pea flour` row, the query becomes a phrase match for that row, and the early return suppresses the current whole-pea result. This is a concrete selection regression for a query that currently identifies the whole food.

## Plan and proposal history

- The active WP02 B2 plan leaves the flour family open and separately records yellow pea flour as integrated. The residual flour proposal accepted `yellow pea flour / farine de pois jaune` as identity-only and explicitly withheld generic pea flour, split-pea flour, green-pea flour, aliases, forms, and measurements.
- That earlier proposal does not review green pea flour as its own candidate. Its occurrence of “green-pea flour” is only an exclusion in the yellow-pea decision, not an active name, alias, or dedicated source record.
- The older WP03 plant/legume packet distinguishes fresh `petits pois` from dried pulses and treats dry green peas as an unresolved whole-pulse naming question. It does not establish a flour identity.
- A proposal and batch search for `green pea flour`, `farine de pois verts`, `split green pea flour`, and `whole green pea flour` found no prior focused review. This proposal does not reopen the integrated yellow-pea-flour row or the whole-green-pea identity.

## Read-only audit snapshot

| Surface | Current snapshot |
|---|---:|
| Active ingredient references | 1,245; SHA-256 `8f4d5b55068cfc624e8d6e931f6829866b0b38fe1c837cf49ea16d106f6027fe` |
| Ingredient forms | 94; SHA-256 `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Research ledger | 1,552 records, 5,388 source entries; SHA-256 `f4a452b42ec3cd84dd5e4d3ff2d00665ba3733db4ce038d2036a81855e434c6c` |
| Legacy import candidates | 66 |
| Manifest recipe corpus | 114 files, 1,123 ingredient rows; ordered corpus fingerprint `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |

The proposed ID is absent from active references, forms, legacy candidates, and ledger record IDs. Exact normalized-name checks found no owner for `green pea flour`, `green peas flour`, `whole green pea flour`, `split green pea flour`, `farine de pois verts`, `farine de petits pois`, or their whole/split French variants on those active surfaces. The live whole-green-pea reference is `ingredient-ref-peas` (`green peas / petits pois`, with English aliases `frozen peas` and `peas`); the separate dry-pulse owner is `ingredient-ref-green-split-peas` (`green split peas / pois verts cassés`). The yellow-flour row is `ingredient-ref-yellow-pea-flour` (`yellow pea flour / farine de pois jaune`).

The phrase audit over all 114 recipe files found **zero matching ingredient rows** for the candidate terms, color-qualified green-pea flour terms, `pea flour`, or `farine de pois`. No recipe asks for green pea flour or an equivalent preparation, and no existing line should be relinked. The corpus fingerprint uses manifest order and exact file bytes with NUL separators.

## Search collision and likely picker results

The assessment below follows the current implementation in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`; it is a code-path analysis, not a live UI test.

| Query | Current result behavior | If the candidate row is added |
|---|---|---|
| `green pea` | No complete phrase occurs in `green peas`, so substring fallback finds `ingredient-ref-peas`. | `green pea flour` becomes a complete phrase match. The exact-phrase early return returns the flour row and skips fallback, hiding `ingredient-ref-peas`. This is the blocking collision. |
| `green pea flour` | No matching result. | Exact match to the candidate. |
| `pois verts` | Complete phrase in the green-split-pea French name; returns `ingredient-ref-green-split-peas`. | With French `farine de pois verts`, the phrase would match both flour and split peas. |
| `petits pois` | Exact phrase in `ingredient-ref-peas` French display. | With French `farine de petits pois`, both the fresh-pea row and the flour row would match. |
| `pea flour` | The yellow-pea row is an exact phrase match; substring fallback can also include chickpea flour and roasted chickpea flour results. | Exact matches would include yellow and green pea flour; because an exact match exists, fallback-only chickpea noise would disappear. This benefit does not offset the `green pea` regression. |
| `farine de pois` | Existing broad phrase search returns multiple pulse-flour results, including yellow pea, chickpea flour, and chana sattu. | A French-qualified green-pea row also contains the phrase and would join those results. Do not store this generic phrase as an alias. |

The chosen French display affects the French query boundary, but either current retail wording overlaps an existing whole-pea term. Search must be able to preserve the whole-food choice before this identity is safely surfaced.

## Québec French and identity boundaries

- La Moisson's current product listing for Solenzi pea pasta gives `Farine de pois verts biologique` as the ingredient. The same Québec retailer's Bioitalia green-pea pasta listing describes `100% de farine de petits pois`. These are ingredient statements for finished pasta, not labels on standalone flour packages.
- OQLF's GDT entry `petit pois` maps English `green pea` to `petit pois` and says that the fresh, frozen, or canned shelled vegetable is not called `pois verts`. This entry is specifically about the fresh vegetable; it does not decide the best name for flour from mature dry peas.
- OQLF's `pois cassé` entry defines a split pea as a dry pea whose cotyledons have been separated and names `pois vert cassé / green split pea` by seed color. It supports keeping green split pulses distinct from fresh `petits pois`, but does not establish a flour name.
- Canadian producer and certification sources list whole-green and split-green pea flour separately. Do not alias those products to each other or to fresh/frozen green peas, dried whole peas, green split peas, yellow pea flour, pea protein, chickpea flour, or sattu.
- If reconsidered, keep `pea flour` and `farine de pois` out of stored aliases. Do not store organic or product-brand terms. Keep whole-versus-split starting material open until a common class boundary and suitable form/identity model are established.

## Numeric evidence limits and checks

- One supplier page lists a product-specific protein value of 24 g per 100 g. It is nutrition evidence for that product, not a universal catalog property.
- The cited industrial study reports air-classified fine/coarse fractions and a fine-fraction yield up to 44%. Those are manufacturing results, not household measures, density, yield for home milling, or flour-for-pulse conversions.
- No source reviewed here supplies a transferable g/ml density, cup-to-mass mapping, recipe measure, or universal conversion. Leave density and unit mappings empty; add no form, measurement, conversion, yield, recipe link, or substitution.
- Checked current reference/form/legacy owners, ledger record IDs, proposal and batch history, live recipe ingredient rows, and the proposed source-ID prefix. No tests were run; this is a proposal-only review and makes no JSON database changes.

## Source register

Sources were checked online on 2026-10-12. Search-indexed product text is identified where the retailer/manufacturer page could not be directly retrieved during this review.

- **S01 — `WP02-B2-GREEN-PEA-20261012-S01`.** Belle Pulses, [Green Pea Flour](https://bellepulses.ca/products/green-pea-flour/). The current indexed manufacturer page says the flour is milled from whole green peas and gives product uses. Its displayed 24 g protein per 100 g is product-specific and not catalog data. Direct page retrieval returned a verification screen, so claims are limited to the indexed page text.
- **S02 — `WP02-B2-GREEN-PEA-20261012-S02`.** Lovingly Made Ingredients, [Industries — Pea Flour](https://lovinglymade.ca/industries/). The indexed current manufacturer page lists split and whole yellow and green pea-flour varieties and says the flour is made from Canadian peas. Direct retrieval timed out; the current search-index text was used for those claims only.
- **S03 — `WP02-B2-GREEN-PEA-20261012-S03`.** Lovingly Made Ingredients, [Contact](https://lovinglymade.ca/contact/). The company's current contact page locates it in Saskatoon, Saskatchewan, Canada. This supports the Canadian supplier context for S02, not product specifications.
- **S04 — `WP02-B2-GREEN-PEA-20261012-S04`.** Centre for Systems Integration, [Avena Foods Limited certified organic product list, issued 2026-03-09](https://csi-ics.com/sites/default/files/org_products/6093-PRO%20Product%20List%202026-03-09.pdf), pp. 1–2. Lists `Green Split Pea Flour/Meal/Grit/Cracked` and `Whole Green Pea Flour/Meal/Grit/Cracked` as separate Avena product classes. The combined labels and organic-certification context do not establish milling details or a household identity equivalence.
- **S05 — `WP02-B2-GREEN-PEA-20261012-S05`.** La Moisson, [Pâtes artisanales de petit pois — Penne bio](https://lamoisson.com/products/pates-artisanales-de-petit-pois-penne-bio). Current indexed Québec retailer listing gives `Farine de pois verts biologique` in the finished-pasta ingredient statement. Direct retrieval returned a cache miss; this is retail label evidence, not a standalone-flour label or a general preferred-term ruling.
- **S06 — `WP02-B2-GREEN-PEA-20261012-S06`.** La Moisson, [Pâtes de petits pois biologiques — Mezze penne](https://lamoisson.com/collections/bioitalia/products/pates-de-petits-pois-biologiques-mezze-penne-green-pea-pasta-mezze-penne-organic). Current indexed Québec retailer listing describes its green-pea pasta as made with `100% de farine de petits pois`. Direct retrieval returned a cache miss; the wording shows current retailer variation, not an official preferred flour term.
- **S07 — `WP02-B2-GREEN-PEA-20261012-S07`.** Office québécois de la langue française, [petit pois, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17024506/petit-pois), dated 1990. Defines the fresh shelled vegetable, maps English `green pea` and *Pisum sativum* to the entry, and explains why fresh/frozen/canned shelled peas are called `petits pois`, not `pois verts`. The fresh-food scope is retained in this review.
- **S08 — `WP02-B2-GREEN-PEA-20261012-S08`.** Office québécois de la langue française, [pois cassé, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489155/pois-casse), updated 2023. Defines a split pea as a dry pea with separated cotyledons and lists `pois vert cassé / green split pea` as the green-color term. It does not name pea flour.
- **S09 — `WP02-B2-GREEN-PEA-20261012-S09`.** Rempel, Geng & Zhang, [“Industrial scale preparation of pea flour fractions with enhanced nutritive composition by dry fractionation,” *Food Chemistry* 276 (2019), 119–128](https://pubmed.ncbi.nlm.nih.gov/30409574/), PMID 30409574, DOI 10.1016/j.foodchem.2018.10.003. The abstract identifies commercial Manitoba-grown whole green, split green, and split yellow pea flours as separate study inputs; its fractionation findings are not household measurements or equivalence evidence.
- **S10 — `WP02-B2-GREEN-PEA-20261012-S10`.** Ingredion, [HOMECRAFT Pulse Pea Flours ingredient statement](https://www.ingredion.com/content/dam/ingredion/technical-documents/na/HOMECRAFT%20Pulse%20Pea%20Flour%20Ingredient%20Statement.pdf), dated 2024-10-09, next review 2027-10-09. Identifies specified products as pea flour from dehulled split green pea cotyledons of *Pisum sativum*. This is product-specific composition evidence, not evidence of Canadian origin or an alias for whole-green-pea flour.

## What remains open

1. Define picker behavior for a shorter whole-food query such as `green pea` when a longer identity contains that complete phrase. The behavior should preserve the whole-green-pea selection alongside a flour result, as applicable. Recheck both English `green pea` and French `petits pois` / `pois verts` after that search decision.
2. Resolve the fr-CA display for dry green pea flour with direct flour/product evidence or Québec terminology guidance. Do not infer that the fresh-vegetable GDT entry decides dry-flour naming.
3. Decide whether whole-green and split-green pea flours need separate identities or can share a parent with explicit forms. Do not merge or alias these product classes before that decision.
4. Revisit recipe demand and numeric evidence only when a recipe or a generalizable measure source appears. Until then, the candidate remains unallocated and identity-only if later accepted.
