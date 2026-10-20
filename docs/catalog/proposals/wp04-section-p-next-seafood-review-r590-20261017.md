# WP04 Section P R590 — Paiche / Arapaima identity review

- **Review and source-access date:** 2026-10-17.
- **Open work item:** The Section P work log asks to continue the fish-powder, fish-ball, surimi, and regional-seafood review at [plan line 14953](../../RecipeBook-global-ingredient-catalog-plan.txt#L14981). Its open regional-fish parent is [plan lines 6417–6418](../../RecipeBook-global-ingredient-catalog-plan.txt#L6426); the separate fish-powder/fish-balls/surimi parent is [plan line 7822](../../RecipeBook-global-ingredient-catalog-plan.txt#L7840).
- **Candidate:** Paiche / arapaima, *Arapaima gigas*, an Amazonian freshwater food fish.
- **Recommendation:** Add one identity-only `PROTEIN` reference, `ingredient-ref-arapaima`, displayed as **Arapaima / arapaima**. Add English alias **Paiche** and French alias **Pirarucu**. Keep the row scoped to *A. gigas*.
- **Boundary:** Do not add the supplier phrase **Amazon cod** as an alias. It is an informal merchandising name and would make `cod` return a distinct non-cod species. Do not connect the identity to generic fish powder, fish balls, fish paste, surimi, or other Amazonian fishes.
- **Mutation status:** Integrated as an identity-only active reference and verified ledger record; see the [integration README](../batches/wp04-section-p-arapaima-identity-integration-r590-20261017/README.md). The Justice Canada citation below was updated to the current official HTML consolidation during integration.
- **Proposal-local source IDs:** `WP04-SECTIONP-ARAPAIMA-R590-20261017-S01` through `S05`; read-only audit label `WP04-SECTIONP-ARAPAIMA-R590-20261017-R01`.

## Why this is a distinct open gap

The open regional-fish checklist names broad fish groups rather than *A. gigas*. The earlier [WP06 South American cuisine sweep](wp06-south-american-cuisine-gap-sweep-20261009.md) retained Paiche among source-fish names needing taxonomic and market research; it did not identify its species or allocate an ingredient identity. This review closes that bounded identification question without proposing a general South American fish category.

Recent Section P decisions cover different items: the [R587 Hilsa review](wp04-section-p-next-seafood-review-r587-20261017.md) concerns *Tenualosa ilisha*; [R584 Zander](wp04-section-p-next-gap-review-r584-20261017.md) concerns *Sander lucioperca*; [R523 fish floss](wp04-section-p-fish-floss-product-boundary-review-r523-20261017.md) and [R530 kamaboko](wp04-section-p-kamaboko-boundary-review-r530-20261017.md) address prepared fish products; [R514 canned sardines in tomato sauce](wp04-section-p-next-seafood-review-r514-20261017.md) and [R517 Dungeness clusters](wp04-section-p-next-seafood-review-r517-20261017.md) are product-specific seafood decisions. None assigns Paiche or *A. gigas*.

The broader Section P review also keeps distinct product gaps open: [R190 holds generic fish powder](wp04-section-p-generic-fish-powder-boundary-review-r190-20261016.md), [R189 holds generic surimi](wp04-section-p-generic-surimi-market-identity-review-r189-20261016.md), and the current catalog separately owns Bonga dried fish powder and generic fish balls. This proposal is for the source fish itself and does not reopen those boundaries.

## Species and bilingual naming

TERMIUM Plus assigns English **arapaima** and French **arapaima** to the universal entry *Arapaima gigas*. It marks the French noun masculine. A search of the OQLF Grand dictionnaire terminologique did not locate a dedicated entry; therefore this proposal uses the federal terminology record for the French display and does not claim an OQLF recommendation. [S01]

Canada’s bilingual Wild Animal and Plant Trade Regulations list *A. gigas* with English common name **Arapaima** and French common name **Pirarucu**. This supports `Pirarucu` as a French-language search alias for this taxon, but the regulation concerns wildlife trade and is not a CFIA food-labelling determination. The proposal does not represent either display as an accepted CFIA food label. [S02]

Peru’s Ministry of Production seafood catalogue identifies **Paiche / Paiche (Arapaima)** as *A. gigas* and lists **Pirarucu** and **Arapaima** as other names. It describes farmed Amazonian fish and frozen skinless fillets. A Canadian supplier’s page is titled **Paiche**, identifies *A. gigas*, and lists frozen fillets, with “Arapaima” as another name. Together these sources support `Paiche` as a useful English search alias and show that the species is sold as a food fish. The Peruvian catalogue is from 2019; the Canadian supplier listing is product evidence, not proof of routine Canadian or Québec availability. [S03, S04]

The exact proposed identity is:

```json
{
  "id": "ingredient-ref-arapaima",
  "nameEn": "Arapaima",
  "nameFr": "arapaima",
  "aliasesEn": ["Paiche"],
  "aliasesFr": ["Pirarucu"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

Scope the row to *Arapaima gigas*. Do not extend `Arapaima` to every species in the genus, or attach Paiche/Pirarucu to other fishes sold under local Amazonian names. Do not add `Amazon cod`: the supplier page uses it as an “aka” name, but it can falsely route a broad `cod` query to a non-cod fish. Do not shorten the French alias to a broader fish-family term.

## Current ownership and picker projection

The read-only catalog snapshot contains **1,810 active references**, **154 forms**, **56 legacy import identities**, and **2,180 research-ledger records**. Exact case-insensitive checks found no owner for `ingredient-ref-arapaima`, `candidate-arapaima`, *Arapaima gigas*, `Arapaima`, `arapaima`, `Paiche`, `Pirarucu`, or `Amazon cod` among active reference names/aliases, form labels/match terms, legacy identities, or ledger record IDs. No existing proposal or batch allocates this identity; the WP06 note above is the only earlier focused mention found.

The exact URLs in S01–S05 have no current ledger owner. The source-ID prefix `WP04-SECTIONP-ARAPAIMA-R590-20261017-` also has no current owner, so this proposal assigns new IDs and reuses none. The general CFIA Fish List overview was not used to assert a species-specific food name.

The picker projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized whole-word phrase matches take priority, followed by substring matches. It searches both display names and both alias lists. With the proposed identity and aliases:

| Query | Current result | With proposal | Effect |
|---|---|---|---|
| `arapaima`, `Paiche`, `Pirarucu` | No result | Arapaima | The species-qualified names resolve to the proposed identity. |
| `Amazon cod` | No result | No result | Do not add the supplier’s marketing synonym. |
| `cod`, `morue` | Seven references each | Unchanged | Avoids adding a distinct species to broad cod queries. |
| `fish`, `poisson` | 14 and 13 references | Unchanged | No generic `fish` or `poisson` alias is added. |
| `fish powder` | Bonga dried fish powder | Unchanged | The species remains separate from the Bonga powder identity. |
| `fish balls` | Generic fish balls | Unchanged | No prepared form is inferred. |
| `surimi` | No result | No result | This species identity does not resolve the separate surimi gap. |

The proposed English and French terms are distinct from nearby current identities. The alias `Pirarucu` is supported as a French common name in the cited Canadian regulation and as an alternate food name in the Peruvian seafood catalogue; it is not presented as a food-label approval. The French display remains the government terminology entry `arapaima`.

## Bundled recipe demand

All **114 manifest-listed bundled recipes**, their **1,123 structured ingredient rows**, and **753,988 exact recipe-file bytes** were scanned. Searches covered `Arapaima`, `arapaima`, *Arapaima gigas*, `Paiche`, `Pirarucu`, `Amazon cod`, and common spelling/spacing variants. There were **zero matching recipe files and zero matching ingredient rows**. Corpus fingerprint: **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, SHA-256 over each manifest-relative recipe path, NUL separator, exact recipe bytes, and NUL separator in manifest order.

There is no bundled recipe amount, role, method, cut, or state to link to this identity. The zero-match scan establishes no present bundle demand; it does not establish that the fish is unused in its region of origin.

## Forms, measurements, and substitutions

The current Canadian supplier page describes frozen fillets; the 2019 Peruvian export catalogue describes frozen, skinless fillets and reports catalogue-specific piece and case specifications. The catalogue’s figures (**4.4–6.6 lb per piece**, **3–3.5 ft per piece**, and **22 lb master case**) are export-product specifications, not household measures, a representative individual-fish size, or a transferable package conversion. Add no form, density, unit mapping, measure, package yield, or edible-yield observation. [S03, S04]

Brazil’s Ministry of Fisheries and Aquaculture published a 2026 article for *Pirarucu de Casaca* using **1 kg of salted, dried pirarucu** and a recipe-specific desalting and cooking method. It suggests salted cod or dried hake/cação as alternatives for that dish. This is bounded culinary context, not a global conversion from fresh or frozen arapaima to cod/hake. There is no bundled recipe to connect to that instruction, so add no form conversion or substitution rule. Do not generalize the article’s amount, storage state, desalinization method, oven temperature/time, or alternatives beyond that recipe. [S05]

## Source register and ownership

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ARAPAIMA-R590-20261017-S01** | Translation Bureau, [TERMIUM Plus: ARAPAIMA](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=ARAPAIMA), record dated 2016-02-12; database page modified 2026-07-08. | Associates English and French `arapaima` with *Arapaima gigas*; marks French `arapaima` as a correct masculine noun. Terminology evidence, not food-market evidence. |
| **WP04-SECTIONP-ARAPAIMA-R590-20261017-S02** | Government of Canada, [Wild Animal and Plant Trade Regulations](https://lois-laws.justice.gc.ca/eng/regulations/SOR-96-263/FullText.html), Schedule I, entry 1.6.4.1(1). | Gives the exact taxon *A. gigas*, English common name **Arapaima**, and French common name **Pirarucu**; the regulation page is current to 2026-09-21 and was last amended 2025-03-06. Wildlife-trade terminology, not food-label authorization. |
| **WP04-SECTIONP-ARAPAIMA-R590-20261017-S03** | Peru Ministry of Production, [Seafood Products catalogue](https://rnia.produce.gob.pe/wp-content/uploads/2019/07/Catalogo-de-Productos-Pesqueros-y-Acu%C3%ADcolas.pdf), Paiche entry, pp. 32–33. | Identifies Paiche as *A. gigas*, lists Pirarucu and Arapaima as other names, and documents farmed Amazonian fish and frozen skinless fillets. Catalogue dates to 2019; its piece and carton specifications are not household measures or current Canadian stock evidence. |
| **WP04-SECTIONP-ARAPAIMA-R590-20261017-S04** | Seacore Seafood, [Paiche / Arapaima gigas](https://www.seacoreseafood.com/product/paiche-amazon-cod-arapaima), accessed 2026-10-17. | Canadian supplier page with Vaughan, Ontario contact address; identifies *A. gigas*, frozen fillets, and `Arapaima` as another name. The page also uses “Amazon cod”; this informal name is deliberately excluded from aliases. The listing does not establish continuous availability or a product’s representative measurement. |
| **WP04-SECTIONP-ARAPAIMA-R590-20261017-S05** | Brazil Ministry of Fisheries and Aquaculture, [Pirarucu: the Amazon giant at Brazil’s table and economy](https://www.gov.br/mpa/pt-br/assuntos/noticias/pirarucu-gigante-amazonia-mesa-economia-brasil/), published 2026-09-11. | Identifies pirarucu as *A. gigas* and documents the regional dish *Pirarucu de Casaca*, its salted/dried ingredient, and dish-specific preparation and alternatives. Does not support general recipe substitutions, a universal product form, or a direct link to this bundle. |

**R01 read-only audit:** Re-read `AGENTS.md`, the open Section P fish and work-log lines, current proposals and batches covering R523, R530, R514, R517, R584, R587, R189, and R190, the live references/forms/legacy identities/research ledger, the source ownership fields, `IngredientSearch.kt`, the bundled manifest, and all manifest-listed recipe files. No catalog, ledger, plan, roadmap, or integration file was edited. No application tests, build, emulator, or deployment were run for this proposal-only task.

## Proposed disposition

Recommend identity-only **Arapaima / arapaima** as `ingredient-ref-arapaima`, scoped to *Arapaima gigas*, with English alias **Paiche** and French alias **Pirarucu**. Leave `Amazon cod` out of aliases. Add no forms, measures, densities, unit mappings, recipe links, conversions, yields, or substitutions. This resolves one bounded regional-fish identity question and leaves the separate fish-powder, fish-ball, and surimi gaps open.
