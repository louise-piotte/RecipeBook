# WP02 A6 follow-up: Sikiya / crab-finger flour hold

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Reviewed and reconciled on 2026-10-12; root accepts the hold. No catalog or ledger data was changed. The package snapshot below records proposal-review state before the later cream-of-rice addition.
- **Scope:** Decide whether a possible single-grain Sikiya / crab-finger (*Digitaria sanguinalis*) flour belongs as a distinct product under the open WP02 A6 regional-flour review.
- **Proposal-local source IDs:** `WP02-A6-SIKIYA-FLOUR-20261012-S01` through `S07`. The prefix was checked against the shared ledger before drafting and was absent.
- **Related review:** The prior WP03 Section F proposal holds the grain-level Sikiya identity without allocating it. This packet addresses only whether a distinct flour product can be named and cataloged; it does not reopen that grain review.
- **A6 status:** Keep the broad regional-grain-flour checklist open.

## Recommendation

**Keep possible Sikiya / crab-finger flour on hold as an unallocated A6 candidate.** Indian food and agricultural sources support *D. sanguinalis* as a localized edible grain, and a 2024 landscape narrative reports rotis made from Sikiya millet flour [S01, S02, S03, S07]. Those sources do not establish a current Canadian or Québec flour product name, a Québec French food display, or a standardized flour identity. OQLF records French names for the plant under botany, and CFIA describes the genus in a Canadian seed and weed-identification context [S04, S05]. The current Québec food-directory listing found for millet flour is generic and does not identify a millet species [S06].

Do not create `ingredient-ref-sikiya-flour`, `ingredient-ref-crab-finger-millet-flour`, or another active flour ID. Do not add `Sikiya`, `Sikya`, `crab finger`, `Polish millet`, *Digitaria sanguinalis*, or botanical weed names as aliases to generic millet flour. Keep `millet flour / farine de millet` on the existing generic row. Do not add forms, recipe links, amounts, density, conversions, yields, or substitutions. The bounded Canadian/Québec search below did not surface a local product listing; that is a search-scope observation, not proof that no such product is sold.

| Wording or candidate | Disposition | Evidence boundary |
|---|---|---|
| Possible `Sikiya flour` / `Sikiya millet flour` | **Hold as an unallocated A6 candidate.** | A secondary narrative reports a local flour use, but no Canadian or Québec flour label or fr-CA food name was found. [S07] |
| `Crab finger flour` / `Polish millet flour` / *D. sanguinalis* flour | Keep as source-search wording only. | FSSAI identifies `Crab finger (Sikiya)` as *D. sanguinalis* within a whole/dehulled-millet standard; it does not specify a standalone flour product. `Polish millet` is an agricultural/source name, not a Québec product label. [S01–S02] |
| `ingredient-ref-sikiya-flour` and other proposed flour IDs | Do not allocate. | No exact active reference, form, legacy candidate, or ledger record uses the candidate ID or product wording. |
| `digitaire sanguine`, `digitaire pourpre`, `panic pourpre`, `panic sanguin`, `manne terrestre`, `manne sanguinale` | Do not use as a flour display or alias. | OQLF lists these under botany/Poaceae for the plant; it does not supply a food or flour term. [S04] |
| `crab-grass`, `finger-grass`, and related weed terms | Do not use as food aliases. | OQLF and CFIA use these in botanical or weed/seed contexts. [S04–S05] |
| `millet flour` / `farine de millet` | Retain unchanged. | Both exact normalized terms belong to the existing generic `ingredient-ref-millet-flour`; Québec product-directory evidence does not identify the species. [S06] |

## Evidence and naming boundary

FSSAI’s 2024 cereal standard lists `Crab finger (Sikiya) — Digitaria sanguinalis` in its standard for whole or dehulled millets [S01]. It anchors a source-specific Indian grain name and taxon, but says nothing about a standalone Sikiya flour. The 2026 ICAR–Indian Institute of Millets Research manual discusses Sikiya in a Baiga cultivation and food context in Madhya Pradesh, while using several common names across *Digitaria* species [S02]. A Government of Madhya Pradesh page describes Sikya kheer and identifies Sikiya as a wild millet harvested by Baiga people in Dindori [S03]. These sources support the grain’s local food context, not a standardized flour grade or a transferable English product name.

A 2024 *Tales from Kanha* landscape narrative reports meals including rotis made from “sikiya millet flour” [S07]. This is useful source-specific evidence that the flour wording and use occur in a local narrative. It is not a product specification, an official food standard, or a Canadian/Québec label. Do not infer a milling process, recipe ratio, or general product availability from it.

For Québec French, OQLF’s GDT entry maps *D. sanguinalis* to `digitaire sanguine` and lists related French plant names in the botanical domain [S04]. CFIA’s French seed-identification page names *D. sanguinalis* among Canadian *Digitaria* species and places the genus in weed-seed and plant-identification contexts [S05]. Neither source establishes a human-food name. Do not translate `Sikiya flour` mechanically as `farine de digitaire sanguine`, `farine de millet sanguin`, or another constructed phrase.

The Québec Food Directory currently lists Cuisine Soleil’s generic `Farine de Millet Biologique`, with `Farine de millet biologique` as the ingredient wording and no species declaration [S06]. That wording supports the existing generic row only. A bounded web search on 2026-10-12 for `Sikiya flour`, `Sikiya millet flour`, `crab finger flour`, `Polish millet flour`, `Digitaria sanguinalis flour`, `farine de Sikiya`, and `farine de digitaire sanguine` did not locate a Canadian or Québec consumer flour listing. Do not treat this search result as proof of nonexistence.

## Live package, ledger, exact ownership, and recipe audit

The read-only audit used the live split seed package, the legacy candidate file, the research ledger, the generated Kotlin ingredient catalog, and every recipe path in the seed manifest. The count/hash table is a snapshot at proposal review, before the later cream-of-rice identity integration. Exact phrase ownership used the repository’s `normalize_search_key` behavior: Unicode NFKD and case-folding, ligature and accent folding, punctuation replacement, and whitespace collapse.

| Surface | Snapshot at audit time | Hash or fingerprint |
|---|---:|---|
| Active ingredient references | 1,220 | SHA-256 `fd9b020e6938097508e264c0674262f5cae43579744fdc204dce7adbb07b7f2c` |
| Ingredient forms | 86 | SHA-256 `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import candidates | 66 | SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,521 records; 5,150 source entries; 4,213 distinct source IDs | SHA-256 `165c9edc5ecd7876136f93db01d00f359781057ff7da6f664eed474138d46be9` |
| Seed manifest | 114 recipe paths | SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | Fingerprint `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated Kotlin ingredient catalog | 1 file; 1,220 generated references | SHA-256 `66b567a40639ffa2ab5139dd728c535249f644d8bf61050587fee14632aa16f0` |

The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte. File hashes cover exact bytes.

The exact normalized ownership check covered active reference IDs/names/aliases, form IDs/labels/match terms, legacy IDs/names/aliases, and ledger record IDs. It included the proposed flour IDs, `Sikiya flour`, `Sikiya millet flour`, `Sikya flour`, `crab finger flour`, `crab finger millet flour`, `Polish millet flour`, *Digitaria sanguinalis* flour, the proposed French constructions, `Sikiya`/`Sikya`, `crab finger`, `Polish millet`, *D. sanguinalis*, *Panicum sanguinale*, common crab-grass/finger-grass wording, and the OQLF French plant terms.

| Exact wording or ID | Exact normalized owner |
|---|---|
| `millet flour`; `farine de millet` | `ingredient-ref-millet-flour` |
| Candidate flour names, proposed IDs, Sikiya/crab-finger names, species terms, and listed French botanical terms | None across active references, forms, legacy candidates, or ledger record IDs |

The ledger has no Sikiya, crab-finger, *D. sanguinalis*, Polish-millet, or candidate-flour record or source mention. The earlier WP03 grain hold is documented in its proposal and the plan checklist, not as an active ledger identity. No ledger change is proposed.

All 114 manifest-listed recipe files and all 1,123 ingredient rows were searched for the candidate flour phrases, Sikiya/Sikya, crab finger, Polish millet, *D. sanguinalis*, *Panicum sanguinale*, related English weed names, and the proposed French terms. There were zero file hits and zero ingredient-row hits. The generic phrases `millet flour` and `farine de millet` were also absent from ingredient rows. No recipe link is justified.

## Proposal-local source register

These source IDs belong to this proposal only and are not ledger entries. Pages were accessed on 2026-10-12.

| Source ID | Source and locator | Scope and limits |
|---|---|---|
| `WP02-A6-SIKIYA-FLOUR-20261012-S01` | Food Safety and Standards Authority of India, [Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4%20%28Cereals%20and%20Cereal%20products%29.pdf), Version 3 (2024-11-04), §23(1)–(2)(v), PDF p. 18. | Primary food-standard source. The standard covers whole or dehulled millets and names `Crab finger (Sikiya) — Digitaria sanguinalis`; it does not specify Sikiya flour or Canadian/Québec naming. |
| `WP02-A6-SIKIYA-FLOUR-20261012-S02` | ICAR–Indian Institute of Millets Research, [Good Agricultural Practices (GAP) Manual for Sustainable Millets Production](https://www.millets.res.in/pub/2026/GAP-English.pdf), ch. 11, Sikiya / *D. sanguinalis* discussion, PDF pp. 115–118. | Primary agricultural institute source for Sikiya’s local Baiga cultivation and food context. Its broader chapter uses common names across multiple *Digitaria* species; it does not establish a flour standard, Québec name, measure, or conversion. |
| `WP02-A6-SIKIYA-FLOUR-20261012-S03` | Government of Madhya Pradesh, Jabalpur Division, [Culinary Delights: Sikya Kheer – Dindori](https://jabalpurdivisionmp.nic.in/en/culinary-delights/), page last updated 2019-05-16. | Local-government food context: describes Sikiya as a wild millet harvested by Baiga people in Dindori. It discusses kheer, not flour; the page’s English scientific-name spelling is retained only as source wording. |
| `WP02-A6-SIKIYA-FLOUR-20261012-S04` | Office québécois de la langue française, [digitaire sanguine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18082121/digitaire-sanguine), GDT, botanical/Poaceae domain, updated 1980. | Québec terminology source for plant names: lists `digitaire sanguine`, `digitaire pourpre`, `panic pourpre`, `panic sanguin`, `manne terrestre`, `manne sanguinale`, English `crab-grass`/`finger-grass`, and Latin *D. sanguinalis*/*Panicum sanguinale*. It gives no food or flour term. |
| `WP02-A6-SIKIYA-FLOUR-20261012-S05` | Canadian Food Inspection Agency, [Semence de mauvaises herbe : Digitaria spp. (espèces) (Digitaire)](https://inspection.canada.ca/fr/protection-vegetaux/semences/analyse-semences-designation-categorie/identification-semences/digitaria-spp), French seed-identification page. | Federal plant/seed source lists *D. sanguinalis* among Canadian *Digitaria* and describes weed-seed regulation and habitat. It is not a consumer food label. |
| `WP02-A6-SIKIYA-FLOUR-20261012-S06` | Québec Ministère de l’Agriculture, des Pêcheries et de l’Alimentation, [Répertoire des aliments québécois: Farine de Millet Biologique](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223769), Cuisine Soleil product record, updated 2026-07-24. | Current Québec product-directory evidence for generic `farine de millet biologique`; the listing does not declare a source species and does not support a Sikiya-specific name. |
| `WP02-A6-SIKIYA-FLOUR-20261012-S07` | Nature for All, [Tales from Kanha (Landscape)](https://natureforall.global/wp-content/uploads/2024/09/Tales-from-Kanha-Eng-final-version-compressed.pdf), June 2024, p. 37. | Secondary landscape narrative mentioning rotis made from “sikiya millet flour.” Supports a source-specific reported use only; it is not a product standard, technical flour specification, or Canadian/Québec label. |

## Review disposition

Keep possible Sikiya / crab-finger flour held as an unallocated A6 candidate. The sources establish localized grain and reported flour use, but do not establish a Canadian/Québec food-product name or a Québec French flour display. Keep the generic millet-flour row unchanged, make no recipe or numeric changes, and leave the wider A6 review open.

## Integration status

Root reviewed the primary food-standard, agricultural, Québec terminology, Canadian weed-identification, and Québec Food Directory sources and accepted the hold. The exact owner and recipe audits were repeated against the live package after the cream-of-rice addition: only the generic `millet flour / farine de millet` names resolve, and none of the candidate terms or IDs has an owner. All seven proposal source IDs remain absent from the ledger. No reference, alias, form, ledger record, recipe link, measurement, conversion, yield, or substitution was added. See the [hold integration README](../batches/wp02-a6-sikiya-crab-finger-flour-hold-integration-20261012/README.md); the broad A6 review remains open.
