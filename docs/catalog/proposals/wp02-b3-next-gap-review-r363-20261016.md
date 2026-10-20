# WP02 Section 04 B3 R363 — pregelatinized tapioca-starch boundary review

- **Reviewed:** 2026-10-16.
- **Status:** Integrated as a documentation-only hold on 2026-10-16; see the [integration README](../batches/wp02-b3-pregelatinized-tapioca-starch-hold-integration-r363-20261016/README.md). No catalog or ledger JSON, generated index, recipes, or application code changed.
- **Bounded question:** Does current Canadian product evidence support a distinct pregelatinized tapioca-starch reference that can be selected consistently alongside the existing modified-tapioca-starch identity?
- **Recommendation:** Hold the unqualified pregelatinized-tapioca candidate outside active references and the ledger until the product boundary against modified tapioca starch is resolved.
- **Possible future reference ID:** `ingredient-ref-pregelatinized-tapioca-starch`; unused in the live catalog, legacy candidates, and ledger at this review.
- **Proposal source-ID prefix:** `WP02-B3-PREGEL-TAPIOCA-R363-20261016`. No collision was found in the live ledger or earlier proposal/batch archive. S01 and S02 below are proposal-local and unallocated; previously registered sources are explicitly reused at their original IDs and URLs.

## Decision and plan fit

Pregelatinized tapioca starch is a real food-ingredient product family: a current Canadian supplier lists it as a single-ingredient product in bulk. The unresolved point is how to represent this process description in the global picker. The Canadian listing does not say whether its product is a native, physically pregelatinized grade or a chemically/otherwise modified pregelatinized grade. A current supplier portfolio separates native pre-gel and modified pre-gel tapioca products, while Ingredion’s current Canadian technical sheet describes one tapioca product as both **pregelatinized** and **modified**, and gives its Canadian ingredient label as “Modified Tapioca Starch.” A general pregelatinized-tapioca row could therefore claim a product that already belongs to the active modified-tapioca row.

The closest B3 precedent is to add source-qualified, process-specific starch identities when the marketed product boundary is clear: pregelatinized rice starch (R125), pregelatinized wheat starch (R187), and pregelatinized potato starch (R266). Those decisions do not establish that an unqualified tapioca pre-gel label excludes modified products. The live plan also leaves open the broad B3 regional-starch parent and the process-distinction item, with its checked note requiring an exact product/source context before a source-neutral row or alias is used. This proposal addresses only the tapioca pre-gel boundary; it does not reopen those integrated identities or R196 native waxy tapioca starch.

Until the product qualifier is resolved, do not add the possible reference, a ledger candidate, aliases, a form, numeric data, recipe links, or substitution behavior. If a future Canadian grade source identifies a non-overlapping native pregelatinized tapioca product and provides stable Québec French wording, review that grade specifically. If the intended class includes products also labeled modified tapioca starch, the project should decide how the two descriptors map in the picker before activating an unqualified class.

## Source evidence

| Source | What it supports | Limit |
|---|---|---|
| [S01 — Fineberry Foods, Organic Tapioca Starch Pregel](https://www.fineberry.ca/organic-tapioca-starch-pregel.html) | Fineberry identifies itself as a Canadian supplier, distributor, and wholesaler. The current page calls the single-ingredient product “Organic Tapioca Starch Pregel (Cassava Starch),” gives the French label “Prégel d’amidon de tapioca biologique,” describes extraction followed by heat treatment, lists food uses including bakery and confectionery, and offers bulk 25 kg bags. | It does not identify the product as native or modified, does not give a product specification that resolves the distinction, and does not establish consumer-size availability or inventory. The French phrase is the supplier’s wording, not a verified OQLF-preferred Québec product term. |
| [S02 — Nepra Foods, Food ingredients](https://neprafoods.com/food/) | The current food portfolio separately names “Rheoflex Native Pre-Gel Tapioca Starch” and “Rheoflex Modified Pre-Gel Tapioca Starch,” placing both in the food-ingredient texture/rheology section for doughs, batters, and gluten-free products. This supports that “pre-gel tapioca” spans at least native and modified commercial grades. | It is a manufacturer portfolio, not a Canadian or Québec product label, and the page does not provide grade specifications or a Québec French name. |
| [Reused — Ingredion, NATIONAL 104 technical specification](https://www.ingredion.ca/content/dam/ingredion/technical-documents/na/NATIONAL%20104%20-%2012151301%20Technical%20Specification.pdf) | The live modified-tapioca ledger record already owns this URL as `WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S06`. The sheet says NATIONAL 104 is a “pregelatinized, modified starch” derived from tapioca and specifies “Modified Tapioca Starch” as its Canadian label. The product description explicitly overlaps both terms. | The grade-specific specification does not prove that all modified tapioca starches are pregelatinized or that all pregelatinized tapioca starches are chemically modified. It does show that the two labels are not disjoint across marketed tapioca grades. |
| [Reused — Canadian Food Inspection Agency, Common Names for Ingredients and Components](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components) | Already registered on the modified-tapioca ledger record as `WP02-B3-MODIFIED-TAPIOCA-STARCH-20261014-R94-S01`. The Canadian naming table distinguishes starch, named with its plant source, from modified starch, named with “modified” plus the plant source and starch. | It does not define a mutually exclusive ingredient class for pregelatinized tapioca starch. |
| [Reused — OQLF, amidon prégélatinisé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357585/amidon-pregelatinise) | Existing source ID `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S03` supports the Québec generic term `amidon prégélatinisé` and its English spelling variants. | The entry is generic to starch; it does not attest a tapioca-specific compound or resolve the product boundary. |
| [Reused — OQLF, tapioca (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497643/tapioca) | Existing source ID `WP02-FUFU-CASSAVA-GRANULES-QC-20261011-S05` defines tapioca as edible starch obtained from cassava and describes its food uses and product forms. | It does not name pregelatinized tapioca starch or establish the exact Québec French product display. |

The source IDs for S01 and S02 are proposed as `WP02-B3-PREGEL-TAPIOCA-R363-20261016-S01` and `...-S02`; both URLs were absent from the live ledger and earlier archive at the pre-proposal audit. Reused source IDs retain their existing URL mappings. No source entry has been added to the ledger.

## Category and identity boundary

If this candidate is eventually activated, its proposed category is `FLOUR_AND_STARCH`. It would name a source-qualified, pregelatinized tapioca-starch ingredient, not a form of whole-root cassava flour, tapioca pearls, Brazilian tapioca granules, or `polvilho doce` / `polvilho azedo`.

The live identities most relevant to the decision are:

| Existing identity | Current boundary |
|---|---|
| `ingredient-ref-tapioca-starch` — tapioca starch / `fécule de manioc` | Generic extracted cassava starch; leave its current name and `manioc starch` alias unchanged. |
| `ingredient-ref-modified-tapioca-starch` — modified tapioca starch / `amidon de tapioca modifié` | Existing modified product class, with French alias `fécule de tapioca modifiée`. Ingredion NATIONAL 104 demonstrates that at least one tapioca grade is both modified and pregelatinized. |
| `ingredient-ref-native-waxy-tapioca-starch` — native waxy tapioca starch | Source-qualified waxy grade; do not use `native` or `waxy` as aliases for this candidate. |
| `ingredient-ref-resistant-tapioca-starch` — resistant tapioca starch | Resistance-qualified identity; do not infer resistance from pregelatinization or supplier performance claims. |
| Cassava flour, tapioca pearls/granules, and Brazilian polvilho rows | Whole-root flour, prepared products, or separately named regional starch products; do not merge them with this candidate. |

“Pregelatinized” is a process descriptor. The sources establish product families with that wording but do not establish that this family is mutually exclusive of the modified-tapioca identity. The term “native” is not safe to infer from Fineberry’s generic product page, and the `Rheoflex Native` grade cannot be used to qualify Fineberry’s grade. Keep the identity unresolved until a current source ties a specific tapioca grade to the intended boundary.

## Names and picker impact

No exact active reference, form, legacy candidate, ledger record, or prior proposal owns `pregelatinized tapioca starch`, `pre-gelatinized tapioca starch`, `pregelatinised tapioca starch`, `amidon de tapioca prégélatinisé`, or the possible ID `ingredient-ref-pregelatinized-tapioca-starch`. The current English display `tapioca starch` and the modified/native-waxy/resistant tapioca identities already make broader tapioca-starch queries multi-result.

The static projection below applies `IngredientSearch.kt`’s normalized complete-word-phrase matching and substring fallback to current live reference names and aliases. It is a read-only projection, not a runtime picker test. The projected row is hypothetical and is not activated by this proposal.

| Query | Current result | If a general pregelatinized-tapioca row were later added |
|---|---|---|
| `pregelatinized tapioca starch` | No result | One candidate result |
| `pre-gelatinized tapioca starch` | No result | One candidate result if the OQLF-backed spelling variant is included |
| `pregelatinised tapioca starch` | No result | One candidate result if the OQLF-backed spelling variant is included |
| `tapioca starch` | Generic, modified, native waxy, and resistant tapioca-starch rows | Those four plus the candidate |
| `amidon de tapioca` | Modified, native waxy, and resistant tapioca-starch rows | Those three plus the candidate, if the French display uses that qualified phrase |
| `modified tapioca starch` | Modified tapioca-starch row | Still one result, even though Ingredion’s NATIONAL 104 is also called pregelatinized |

If the product class becomes clear, the possible display is `pregelatinized tapioca starch / amidon de tapioca prégélatinisé`, with independent Québec French review before activation. Potential English search wording is limited to the source-backed spelling forms and Fineberry’s `tapioca starch pregel` phrase. Do not alias `modified tapioca starch`, `native tapioca starch`, bare `pregel`, `instant tapioca starch`, `precooked tapioca starch`, `cold-water-soluble tapioca starch`, or brand/product names. Do not use Fineberry’s organic-qualified French wording as a general alias. No name or alias is added while the item is held.

## Recipe demand, measurements, and substitution limits

A static manifest-ordered scan covered all **114 recipe files and 1,123 ingredient rows**. It found no occurrences of `tapioca`, `tapioca starch`, `pregelatinized tapioca starch`, `amidon de tapioca`, or `fécule de manioc`, and no linked ingredient rows for the current tapioca-starch identities. The corpus supplies no demand for a new row or reason to retag a recipe.

Fineberry’s 25 kg bag is a supplier package size, not a household measure or conversion. Its functionality statements, Nepra’s food-application descriptions, and Ingredion’s grade-specific technical measurements do not support a reusable density, kitchen measure, or conversion. Likewise, commercial use descriptions and the stated package amount are not a recipe replacement ratio. Do not transfer the existing ordinary-tapioca thickening note or Expandex’s single-recipe evidence to this candidate. Keep density, unit mappings, forms, recipe links, yields, and global/contextual substitutions absent if the question is revisited.

## Static ownership and archive review

At the read-only snapshot, the live package contained **1,694 ingredient references**, **139 forms**, and **114 manifest-listed recipes / 1,123 ingredient rows**; the legacy file contained **56 candidates**, and the research ledger contained **2,050 records / 9,208 source entries / 7,793 distinct source IDs**.

- No active reference or form owns the candidate phrase or possible ID. The four current tapioca-starch references are listed above; their existing data remain unchanged.
- No legacy-import candidate or research-ledger record owns the candidate phrase or proposed ID.
- The proposal/batch archive contains focused reviews for modified tapioca starch (R94), resistant tapioca starch (R126), native waxy tapioca starch (R196), and source-qualified pregelatinized rice, wheat, and potato starch (R125, R187, and R266). It contains no prior focused review of pregelatinized tapioca starch. The R94 Ingredion sheet is intentionally reused as overlap evidence rather than reopened.
- The new source-ID prefix and the two proposed source IDs are unallocated. S01 and S02 each map to one new URL. The three other topical sources in the source register reuse existing IDs at their exact existing URLs; no duplicate source ID or URL registration is proposed.

The documentation-only hold is now recorded in the plan and roadmap. No active reference, candidate ledger record, alias, form, measurement, substitution, or recipe link was added. Reopen when a current Canadian product specification identifies the native/modified state of a pre-gel tapioca grade and independent Québec review validates its product name, or when a catalog-level decision defines how overlapping process and modification descriptors should map to picker identities.
