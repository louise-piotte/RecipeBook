# WP02 Section A7 R443: spelt semolina product and Québec naming boundary

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Root-reviewed boundary hold; the decision is recorded in the [R443–R445 integration README](../batches/wp02-wp04-wp06-r443-r445-next-gap-review-integration-20261017/README.md). No shared catalog or ledger entry was created for R443. No tests were needed for this documentation-only hold.
- **Open checklist:** The current [A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004) remains open for other grain meals and milling products.
- **Scope:** Review only food-grade semolina milled from spelt (*Triticum aestivum* subsp. *spelta*). Keep it distinct from spelt flour, spelt meal, spelt grain, spelt pasta, semolina made from other grains, and the unresolved word *farro*.
- **Source IDs:** `WP02-A7-SPELT-SEMOLINA-R443-20261017-S01` through `S06` are proposal-local and are not shared-ledger entries. Reused ledger source IDs are called out in the source register.

## Recommendation

**Keep `spelt semolina` unallocated pending a Québec-facing product name.** Current mill evidence establishes a real, separately milled spelt-semolina product. The exact English phrase also appears in Canadian manufacturer and distributor product descriptions. A French-market seller lists a product named `semoule d'épeautre`, and OQLF supports the base species term `épeautre` for *spelt*. However, I found no Québec product page or OQLF/TERMIUM entry for the exact compound. OQLF's general `semoule` entry defines the milling term in soft- and durum-wheat contexts, without naming spelt. The sources do not yet support a Québec picker display with the same confidence as the English identity.

Keep these candidate terms as **research vocabulary only**:

| Field | R443 disposition |
|---|---|
| English candidate | `spelt semolina` — established product wording, but no active row |
| French candidate | `semoule d'épeautre` — exact wording on a French-market product, but not established as a Québec product name |
| Future ID/category if the Québec name is supported | `ingredient-ref-spelt-semolina` / `FLOUR_AND_STARCH` |
| Aliases | None; do not add `wholegrain spelt semolina`, `Dinkelgrieß`, `spelt meal`, `farro semolina`, or `farro` as aliases |
| Forms, measures, density, mappings, conversions, yields | None |
| Recipe links and substitutions | None |
| New active or ledger candidate | None in this proposal; retain the gap as unallocated until the Québec naming evidence is resolved |

If a Québec mill or retailer later uses `semoule d'épeautre` for a standalone food product, rerun exact ownership, picker, and recipe audits. The bounded future pair would be `spelt semolina / semoule d'épeautre`, with empty alias lists; it would not include a wholegrain form or numeric behavior.

## Product and ownership boundary

| Neighbor | Current owner or decision | Boundary retained |
|---|---|---|
| Spelt flour | `ingredient-ref-spelt-flour`, `ingredient-ref-white-spelt-flour`, `ingredient-ref-whole-spelt-flour`, `ingredient-ref-sprouted-spelt-flour`, and `ingredient-ref-malted-spelt-flour` | A milled semolina product is not an alias or form of these flour identities. Keep the source-defined flour grades separate. |
| Spelt grain and other products | `ingredient-ref-spelt-berries`, `ingredient-ref-spelt-flakes`, and `ingredient-ref-puffed-spelt` | The candidate does not name intact, rolled, or puffed spelt. |
| Spelt meal | R42 holds `spelt meal` unresolved; see the [R42 review](wp02-a7-spelt-meal-boundary-review-20261013-round42.md) and [integration record](../batches/wp02-a7-spelt-meal-boundary-hold-integration-20261013/README.md). | R42 concerns the underspecified term *meal*, not the separately documented spelt-semolina product. It does not own either R443 candidate phrase. |
| Einkorn | `ingredient-ref-einkorn-flour` and `ingredient-ref-einkorn-berries`; R28 says not to invent `semoule de petit épeautre` for an einkorn-meal candidate | *Petit épeautre* identifies the separate einkorn context in those records. Do not transfer it to ordinary spelt or use it as the R443 French display. |
| Emmer semolina | R440 integrated `ingredient-ref-emmer-semolina` as `emmer semolina / semoule de blé amidonnier`; see the [R440 proposal](wp02-section-a7-emmer-semolina-identity-review-r440-20261017.md) and [R440–R442 integration](../batches/wp02-wp04-wp06-r440-r442-gap-review-integration-20261017/README.md). | Emmer semolina is species-scoped and owns no spelt name. R443 does not reopen it or reuse its emmer-specific French term. |
| Other semolinas | Active identities include durum, remilled durum, spring wheat, barley, and sorghum semolina; Sankhal is separately named as broken millet semolina. | Keep each grain and process-specific identity separate. Do not add generic `semolina`, `semoule`, or species names as aliases. |
| Farro | `ingredient-ref-farro` remains unresolved; separate farro grain/flour identities remain active. | Do not use *farro* for spelt semolina. Canadian and OQLF sources document variable species use, not a stable spelt-only alias. |

R440 is the newest directly adjacent integration. It accepted emmer semolina using a Canadian government French product term, OQLF emmer terminology, and an emmer-specific Canadian mill ingredient label. R443's Canadian product evidence is also useful, but its exact French product term appears only in a France-market listing. This difference is why R443 holds the bilingual allocation.

## Current-state audit

Read-only snapshot from the live split seed package and shared research files on 2026-10-17:

| Store | Snapshot and fingerprint | Exact ownership result |
|---|---|---|
| Active ingredient references | 1,736 rows; SHA-256 `68a7b6fe122964f43ce1a206b9f10be3ed69b1a64cf5bc79662b29a73a3df9fd` | No exact owner for `spelt semolina`, `spelt semolina flour`, `semolina from spelt`, or `semoule d'épeautre`; `ingredient-ref-spelt-semolina` is unused. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No exact spelt-semolina form, label, or match term. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact name or alias for the English or French candidate. |
| Research ledger | 2,095 records / 9,513 source entries / 8 unit-conversion records; SHA-256 `ac0327aaf44fe111ac8e0d2ed770183c396bf1c11f1e0765b6647c6993097d93` | No `ingredient-ref-spelt-semolina` or `candidate-spelt-semolina` record and no exact prior spelt-semolina decision. The existing spelt flour/grain/product and farro records remain separate. |
| Recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All manifest-listed files were scanned; see the complete recipe audit below. |

The exact phrase and candidate-ID checks also covered the A7 proposal and batch archives, plan, and roadmap. No earlier focused review or integration allocates `spelt semolina` or `semoule d'épeautre`. R42's *spelt meal* hold and R28's *einkorn meal* wording are adjacent but distinct decisions. R440 discusses the variable use of *farro* and integrates only emmer semolina; it does not decide the spelt-semolina gap. The R443-local source-ID prefix was unused before this proposal.

## Exact picker projection

The projection uses current `IngredientSearch.kt` phrase-first matching, accent folding, and partial-search fallback over reference names/aliases and attached form terms. Current counts below are against the post-R440 live package. The recommended hold leaves each result set unchanged; the last column shows the effect only if the candidate is cleared and added later with no aliases.

| Query | Current exact results | R443 hold projection | Conditional result if identity is later integrated |
|---|---|---|---|
| `spelt semolina` | None | None | `spelt semolina` |
| `semoule d'épeautre` | None | None | `spelt semolina` |
| `spelt` | 8: malted spelt flour; puffed spelt; spelt berries; spelt flakes; spelt flour; sprouted spelt flour; white spelt flour; whole spelt flour | Same 8 | Same 8 plus spelt semolina |
| `épeautre` | 10: einkorn berries; einkorn flour; malted spelt flour; puffed spelt; spelt berries; spelt flakes; spelt flour; sprouted spelt flour; white spelt flour; whole spelt flour | Same 10 | Same 10 plus spelt semolina |
| `semolina` | 7: barley semolina; durum semolina; emmer semolina; Sankhal; remilled durum semolina; sorghum semolina; spring wheat semolina | Same 7 | Same 7 plus spelt semolina |
| `semoule` | 10: barley semolina; corn grits; cornmeal; durum semolina; emmer semolina; granulated sugar; rye meal; remilled durum semolina; sorghum semolina; spring wheat semolina | Same 10 | Same 10 plus spelt semolina |
| `farine d'épeautre` | 5: malted spelt flour; spelt flour; sprouted spelt flour; white spelt flour; whole spelt flour | Same 5 | Same 5; no flour alias is proposed |
| `semoule de blé` | 4: durum semolina; emmer semolina; remilled durum semolina; spring wheat semolina | Same 4 | Same 4; candidate's French phrase does not contain `de blé` |
| `farro` | 2: farro flour; farro grain | Same 2 | Same 2; no farro alias is proposed |

These are static projections, not a live UI test. R443 makes no picker change.

## Complete bundled recipe-demand audit

All **114 manifest-listed recipe JSON files** and all **1,123 structured ingredient rows** were scanned. Each complete serialized recipe JSON and each complete ingredient-row JSON was checked with normalized word-phrase matching that lowercases, folds accents/ligatures, normalizes punctuation, and collapses whitespace. There were **zero matching recipe files and zero ingredient rows** for all terms below:

- English candidate terms: `spelt semolina`, `spelt semolina flour`, `wholegrain spelt semolina`, `whole-grain spelt semolina`, and `semolina from spelt`.
- French candidate terms: `semoule d'épeautre`, `semoule d’épeautre`, `semoule epeautre`, `semoule complète d’épeautre`, `épeautre semoule`, and `semoule de petit épeautre`.
- Nearby identities and broad searches: `spelt`, `épeautre`, `semolina`, `semoule`, `farine d'épeautre`, `spelt meal`, `spelt flour`, `spelt pasta`, and `farro semolina`.

The manifest-ordered corpus fingerprint (relative path, NUL, raw file bytes, NUL per recipe) is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. No bundled recipe link, relink, edit, measurement, or substitution is supported.

## Measures, forms, conversions, and substitutions

- SchapfenMühle describes a standalone product and says its semolina is separated and cleaned after milling spelt kernels; it supplies no particle-size standard, universal extraction rate, household measure, or density [S04].
- The French-market product is specifically fine and wholegrain and is sold in a 1 kg package [S05]. That one product's grade and package mass are not a general spelt-semolina form, household amount, or mass-volume relationship.
- True Grain's pasta product and Naimpex's 10 kg listing refer to finished pasta, not the mass of semolina inside it [S01, S03]. Do not use pasta package mass as a semolina measure or yield.
- No reviewed source establishes a reusable spelt-semolina density, unit mapping, conversion, preparation-state form, or yield. Add no numeric data or form.
- No source supplies a tested replacement ratio for spelt semolina versus durum semolina, spring-wheat semolina, emmer semolina, spelt flour, or another grain product. Add no global form conversion or contextual substitution. A future substitution would need a named recipe role, dish and method, plus tested quantities.

## Source register

All URLs were reviewed on 2026-10-17. IDs marked **proposal-local** are not shared-ledger records; IDs marked **reused** already exist in the ledger and should not be duplicated.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| **Reused `WP02A4-SP-S01`** | Office québécois de la langue française, [épeautre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre), botanical domain, updated 2007. | Pairs Québec French `épeautre` with English `spelt` and identifies the cereal. | Species/name evidence only; does not name a semolina product. Reuse the existing ledger entry. |
| **Reused `WP03-IDLI-RAVA-20261012-S06`** | Office québécois de la langue française, [semoule (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8895941/semoule), agriculture/cereal cultivation domain. | Defines semoule as a coarse particle product in soft-wheat milling and a product used for pasta in durum-wheat milling. | The entry does not name spelt or establish `semoule d'épeautre` as a Québec display. Reuse the existing ledger entry. |
| **Proposal-local `WP02-A7-SPELT-SEMOLINA-R443-20261017-S01`** | True Grain, [Organic BC Spelt Creste di Gallo](https://www.truegrain.ca/products/spelt-creste-di-gallo), product and ingredient description. | The BC mill names `Stone-ground BC Spelt Semolina` and says its BC-grown spelt is stone-ground into custom semolina for pasta. Direct Canadian producer evidence for the English ingredient phrase. | Ingredient in finished pasta, not a standalone dry semolina SKU; no French product label or semolina quantity. The product detail page is indexed; the current product-range listing is in S02. |
| **Proposal-local `WP02-A7-SPELT-SEMOLINA-R443-20261017-S02`** | True Grain, current [pasta page](https://www.truegrain.ca/pages/pasta), product-range description. | Currently lists Spelt Creste di Gallo and says the mill's pastas are made with BC-grown organic grain and water. | Current product listing, but it does not repeat the spelt-semolina ingredient declaration or provide a dry semolina SKU, French label, or ingredient quantity. |
| **Proposal-local `WP02-A7-SPELT-SEMOLINA-R443-20261017-S03`** | Naimpex, [Pasta](https://www.naimpex.ca/pasta), `Linguine 10' Spelt Pasta`, product O-79. | Canadian distributor listing gives the ingredient declaration `100% Organic Wholegrain Spelt Semolina`. Confirms current Canadian use of the phrase in a retail/foodservice product context. | Distributor listing for finished 10 kg pasta, not the manufacturer or a standalone semolina product; no French name or amount of semolina in the case. |
| **Proposal-local `WP02-A7-SPELT-SEMOLINA-R443-20261017-S04`** | SchapfenMühle, [Spelt semolina](https://schapfenmuehle.de/en/commercial-customers/products/coarse-grained-flour-semolina-bran-meal/spelt-semolina), commercial mill product page. | Names a standalone `Spelt semolina` product; says it is made by milling spelt kernels and separated/cleaned in a semolina cleaning machine before packaging. Lists food uses. | German mill and market. It does not establish a Québec retail name, a universal particle size, or household measures. |
| **Proposal-local `WP02-A7-SPELT-SEMOLINA-R443-20261017-S05`** | Grenier Épeautre, [Semoule (fine) complète d'épeautre — 1 kg](https://www.epeautre.net/semoule-fine-complete-d-epeautre-1-kg-c2x2900781) and [spelt product forms](https://www.epeautre.net/PBCPPlayer.asp?ID=341636&PW=1). | French-market seller uses the exact product name `semoule d'épeautre`, says its semolina is fine and made from spelt, distinguishes it from cracked grain and flakes, and offers a wholegrain version. | France-market wording, not Québec label evidence. The 1 kg package is not a kitchen measure; the wholegrain grade is product-specific. |
| **Proposal-local `WP02-A7-SPELT-SEMOLINA-R443-20261017-S06`** | Health Canada, [Gluten: a group of proteins people with gluten-related disorders should avoid](https://www.canada.ca/en/health-canada/services/food-nutrition/reports-publications/food-safety/gluten-pamphlet.html), wheat examples. | Current Canadian government information lists semolina and spelt as wheat-related names relevant to gluten-source labelling. | The two terms appear separately; the page does not identify spelt semolina as a standalone product, assign a French compound, or define milling state. |

## Disposition

Keep `spelt semolina` and `semoule d'épeautre` unallocated. The product class is supported by mill and Canadian ingredient-label evidence, but the only exact French product name found is from a France-market source and the relevant OQLF semoule definition does not cover spelt specifically. Add no active reference, alias, ledger candidate/source entry, form, measure, density, unit mapping, recipe link, conversion, yield, or substitution. Reopen when a current Québec-facing product or authoritative terminology source supplies the French product name. No tests or emulator checks were run because this is a proposal-only documentation change.
