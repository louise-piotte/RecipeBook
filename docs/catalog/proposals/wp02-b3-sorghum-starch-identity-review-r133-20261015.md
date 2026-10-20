# WP02 Section 04 B3 R133 — sorghum starch identity review

- **Reviewed:** 2026-10-15.
- **Status:** proposal only; the shared ingredient references, research ledger, checklist, roadmap, and generated index were not changed.
- **Checklist:** WP02 Section 04 B3, `[ ] Water-chestnut flour and other documented regional starches.` The open parent line has no further named unchecked child after R132. This review selects a previously unallocated sorghum-starch identity; it does not revisit any earlier integrated or held candidate, including quinoa starch (R132) or ginger-rhizome starch (R131).
- **Scope:** starch isolated from sorghum grain as a food ingredient, distinct from whole grain, flour, grits, semolina, and puffed sorghum. The evidence supports the ingredient class and a precise Québec French term. It does not establish a current standalone Canadian or Québec retail product.
- **Proposal-local source-ID prefix:** `WP02-B3-SORGHUM-STARCH-R133-20261015-S`. The prefix, candidate ID, and reviewed phrase owners were checked against the live reference/forms, ledger, legacy identities, proposal archive, and batch archive before drafting; no collision was found.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for **sorghum starch / amidon de sorgho**, with both alias lists empty. OQLF has a food-domain entry that defines `amidon de sorgho` for starch from the *Sorghum* genus and directly lists English `sorghum starch`. A 2026 Canadian-authored primary study isolates starch from two Canadian cold-climate *Sorghum bicolor* varieties and evaluates food-processing properties. Together these sources support a separate ingredient identity and exact Québec French wording.

Keep the market claim narrow: the current Canadian and Québec product sources located in this review establish sorghum flour and a Québec gluten-free flour blend that lists sorghum flour, but do not establish a standalone sorghum-starch package or supplier listing. The Canadian study establishes a research isolate from Canadian grain and discusses potential food use; it is not evidence of consumer availability or a commercial ingredient specification. This proposal therefore recommends an identity-only catalog row, not a claim that a Québec pantry product is available.

Do **not** add `milo starch` as an alias even though the OQLF entry lists it as an English term. Under the current phrase-first picker, that alias would make the bare query `milo` return the starch row as its exact word-phrase owner. The existing sorghum-grain review deliberately left bare `milo` unassigned. Canonical `sorghum starch / amidon de sorgho` already gives an exact product query without claiming that broader term.

No forms, measures, density, unit mappings, recipe links, conversions, yields, or substitution rules are supported. The bundled recipes contain no sorghum ingredient demand.

### Proposed reference JSON

```json
{
  "id": "ingredient-ref-sorghum-starch",
  "nameEn": "sorghum starch",
  "nameFr": "amidon de sorgho",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

No ID is reserved by this proposal. If accepted, the research-ledger record should attach the proposal-local sources and retain zero measurement observations, forms, conversions, yields, recipe links, and substitution findings. Do not reuse the research protocol quantities as recipe measures.

## Product and Québec terminology boundary

| Material or phrase | Treatment | Evidence boundary |
|---|---|---|
| Sorghum starch | Distinct isolated-starch identity. | The 2026 study describes extraction from sorghum grain by steeping, wet milling, filtration, centrifugation, washing, and drying. This is a different material from ground whole-grain flour or cereal grits. The study's samples are research isolates, not a Canadian product specification. [S01–S02] |
| `sorghum starch` / `amidon de sorgho` | Proposed canonical EN/fr-CA display pair. | OQLF's food-domain entry directly pairs the terms and defines the French term for starch from the *Sorghum* genus. It is exact Québec terminology, not evidence that a local package uses the phrase. [S01] |
| `milo starch` | Do not add as an alias. | OQLF lists it as an English synonym, but adding it would make bare `milo` resolve to this starch row under the app's complete-phrase picker behavior. That would undo the existing decision to leave bare `milo` unassigned. [S01, current picker; prior sorghum-grain boundary] |
| Grain, flour, grits, semolina, puffed sorghum | Keep current references separate. | The active catalog already names these products separately. A current Québec food-directory blend distinguishes `farine de sorgho` from tapioca and potato starch, and a Québec flour listing sells 100% sorghum flour. Neither is isolated sorghum starch. [S03–S04] |
| Standalone Canadian/Québec starch product | Not established by this review. | Bounded current-source searches found no Canadian or Québec standalone human-food product label or supplier listing for sorghum starch. Local research and sorghum-flour sales do not prove such a product is absent everywhere. [S02–S04] |

The selected English name does not claim a particular sorghum cultivar. OQLF defines the French class across the *Sorghum* genus. The Canadian study's two local varieties are *S. bicolor*; this local research supports the class but does not narrow all future products to those varieties. Do not add cultivar names, `milo`, `guinea corn`, `jowar`, grain names, or flour terms as aliases.

## Live catalog, ledger, picker, and recipe audit

The read-only working-tree snapshot contained **1,483 ingredient references, 109 forms, 1,828 research-ledger records, 61 legacy-import candidates, 114 manifest-listed recipes, and 1,123 recipe ingredient rows**. The shared workspace already contains unrelated changes; these counts describe the files read on 2026-10-15.

| Surface | Finding |
|---|---|
| Active references | No row or alias owns `sorghum starch`, `milo starch`, `amidon de sorgho`, or `ingredient-ref-sorghum-starch`. Existing sorghum rows are grain sorghum, puffed sorghum, sorghum flour, sorghum grits, and sorghum semolina. |
| Active forms | No sorghum-starch form exists; the current sorghum grain/flour/grits/semolina/puffed references have no form that denotes extracted starch. |
| Research ledger | No sorghum-starch record, candidate, decision, or exact phrase owner was found. Existing sorghum records concern other grain or flour products. |
| Legacy-import identities | No sorghum-starch candidate or exact phrase owner was found. |
| Proposal and batch archive | No focused sorghum-starch identity or market-boundary review was found. Exact searches covered `sorghum starch`, `milo starch`, `amidon de sorgho`, `amidon de milo`, and the proposed candidate IDs. Related sorghum grain/flour/grits/semolina records remain separate. This is a bounded archive search. |
| Open checklist | Section 04 B3 remains open. This review does not mark the regional-starch line complete or reopen previous decisions. |

The search projection below follows `IngredientReferenceSearchIndex`: normalized complete word phrases take priority, then partial matching is used. This is a static projection over the current JSON, not an app test.

| Query | Current result | With proposed row |
|---|---|---|
| `sorghum starch` | No result | Exact match to sorghum starch |
| `amidon de sorgho` | No result | Exact match to sorghum starch |
| `sorghum` / `sorgho` | Five current sorghum-family references | Six, including sorghum starch |
| `sorghum flour` / `farine de sorgho` | Existing sorghum-flour row only | Unchanged; the proposed row does not use flour wording |
| `milo` | No active result | Still no result, because `milo starch` is not added |
| `starch` / `amidon` | Existing broad starch results | The proposed canonical row joins these broad queries, as expected from its name |

A read-only scan of all **114** manifest-listed recipe files and **1,123** ingredient rows found zero occurrences of `sorghum starch`, `milo starch`, `amidon de sorgho`, `sorghum`, or `sorgho`, and no link to the proposed ID. No recipe link is proposed.

## Numeric, form, and substitution evidence

- **Measurements:** The 2026 study reports sample-level composition, granule, color, thermal, and pasting properties for particular extracted sorghum genotypes. It does not report a household mass-volume measure, cup/spoon portion, bulk density, retail package serving, or recipe conversion. Its lab extraction uses a defined grain-to-solvent protocol; that protocol is not an edible-ingredient kitchen measure, extraction yield, or household conversion. Keep all research values out of active conversion data. [S02]
- **Forms:** Add none. The study's isolated and dried samples do not establish a user-facing preparation-state family or a reusable form conversion.
- **Substitutions:** Add none. The paper describes potential food applications, including thickening and food-product development, but does not test sorghum starch as a replacement for corn, potato, tapioca, or another starch in recipes. No global or contextual rule is supported.
- **Recipe demand:** None found in the bundled library. The paper's food-application discussion is not recipe demand and supplies no recipe-line quantity or substitution link.

## Source register

Sources were checked on 2026-10-15. The `S01–S04` identifiers below are proposal-local and are not ledger records.

| ID | Source and locator | Supports and limits |
|---|---|---|
| **WP02-B3-SORGHUM-STARCH-R133-20261015-S01** | Office québécois de la langue française, [*amidon de sorgho* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086044/amidon-de-sorgho), updated 1987. | Food-domain term entry: preferred French `amidon de sorgho`, defined as starch from species of the genus *Sorghum*; English terms include `sorghum starch` and `milo starch`. Direct terminology support, not a current product listing. |
| **WP02-B3-SORGHUM-STARCH-R133-20261015-S02** | Adjetey et al., [“Starches From Cold-Climate Adapted Sorghums: Their Properties and Implications for Food Systems”](https://onlinelibrary.wiley.com/doi/full/10.1002/star.70182), *Starch – Stärke* 78(2), e70182 (2026), DOI 10.1002/star.70182; first published 2026-02-22. | Primary study isolates and characterizes starch from seven sorghum genotypes, including two Canadian tannin-free *S. bicolor* varieties (CGSH-9 and CGSH-28) harvested in 2022. The article details lab extraction and discusses potential food processing and thickening applications. It establishes a Canadian research material and food-technology identity, not a retail package, commercial specification, household measure, or tested substitution. |
| **WP02-B3-SORGHUM-STARCH-R133-20261015-S03** | Gouvernement du Québec, [*Mélange à farine tout usage SG 2 kg*](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202592), updated 2026-07-24. | Current Québec food-directory product ingredient list names `farine de sorgho` separately from tapioca and potato starch in a gluten-free blend. It supports local ingredient wording and product separation; it is not a sorghum-starch product. |
| **WP02-B3-SORGHUM-STARCH-R133-20261015-S04** | Mako Foods Exotik, [*Farine de Sorgho (700 g)*](https://www.makofoods.ca/products/farine-de-sorgho-700-g), Québec product listing. | Current local listing for a 700 g product described as 100% sorghum flour. It supports local flour availability and boundary only; it does not establish a starch product or a reusable serving measure. |

## Reconsideration and integration notes

1. If accepted, add only the proposed identity row with empty aliases, null density, and empty unit mappings. Keep its display `amidon de sorgho` tied to the exact OQLF entry; do not state that this wording appears on a sorghum-starch package.
2. Do not add `milo starch` unless the coordinator explicitly accepts the consequence that bare `milo` will become an exact picker result. Keep `milo`, `guinea corn`, `jowar`, `farine de sorgho`, flour, grits, semolina, and puffed-grain terms off this row.
3. A current Canadian or Québec standalone human-food label would improve evidence for local market availability and any product-specific alias or specification. It is not supplied by this proposal.
4. Leave density, measures, mappings, forms, conversions, yields, recipe links, and substitutions empty unless separate evidence supports each behavior.
5. Keep WP02 Section 04 B3 open. This proposal-only review changes no shared catalog data and runs no tests. Under `AGENTS.md`, JSON-only catalog additions need no app, Gradle, unit, instrumentation, emulator, or deploy tests.
