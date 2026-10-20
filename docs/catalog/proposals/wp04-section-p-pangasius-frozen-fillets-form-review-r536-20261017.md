# WP04 Section P R536 — Pangasius frozen-fillet form review

- **Review date:** 2026-10-17.
- **Integration status:** Integrated on 2026-10-17. See the [R534–R536 integration README](../batches/wp02-wp03-wp04-r534-r536-gap-review-integration-20261017/README.md).
- **Packet:** Proposal-only review of one cut-and-state form under the active Pangasius market-group identity.
- **Candidate:** `frozen basa fillets / filets de pangasius surgelés`.
- **Recommendation:** Add one identity-neutral frozen-fillet form to `ingredient-ref-pangasius-group`. Keep the Pangasius group and its existing `basa` alias unchanged. Add no species, fresh or thawed form, measure, density, conversion, yield, recipe link, or substitution.
- **Checklist:** WP04 Section P, named seafood and fish-product coverage ([global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6809)). R19 explicitly deferred a later source-specific review of the frozen basa/Pangasius fillet phrase.
- **Proposal-time worktree scope:** This review packet changed only this proposal; the later accepted form and ledger integration are recorded in the linked batch README.

## Decision and narrow proposed delta

The active reference already represents the CFIA *Pangasius* spp. common-name group as `Pangasius / pangasius`, with `basa` as an English alias. The group intentionally does not identify one Pangasius species: CFIA lists *P. bocourti* and *P. hypophthalmus* under the English/French common-name pair `Basa / Pangasius`, as well as a separate *Pangasius* spp. row. The existing group-level alias therefore fits both the current Québec retail wording and the unresolved species scope. [Reused R19-S01]

Current Metro Québec and English routes pair one SKU as `Filets de pangasius surgelés / Frozen Basa Fillets`. Metro’s general product page says both fresh and frozen basa fillets are sold in its fishmonger display, so the state qualifier matters. A current Walmart Canada French listing independently uses `Filets de pangasius surgelés` and says to keep its product frozen. These listings support a frozen-fillet presentation under the existing species-neutral group; they do not support a species assignment or a universal formulation. [Reused R19-S02/S06; R536-S01/S02]

Proposed form only; this is not an active catalog change:

```json
{
  "id": "ingredient-form-pangasius-frozen-fillets",
  "ingredientRefId": "ingredient-ref-pangasius-group",
  "formCode": "frozen",
  "labelEn": "frozen basa fillets",
  "labelFr": "filets de pangasius surgelés",
  "prepState": "frozen",
  "matchTermsEn": [],
  "matchTermsFr": [],
  "densityGPerMl": null,
  "notesEn": "Commercial frozen fillet presentation supported by current Canadian retail product wording. The label basa does not identify one Pangasius species. Additives and package details remain SKU-specific. No measure, conversion, or yield is established.",
  "notesFr": "Présentation commerciale de filets surgelés appuyée par des termes de vente canadiens actuels. Le nom basa ne désigne pas une seule espèce de Pangasius. Les additifs et le format d’emballage restent propres à chaque produit. Aucune mesure, conversion ou relation de rendement n’est établie.",
  "updatedAt": "2026-10-17T00:00:00Z"
}
```

The English and French labels preserve the paired retailer wording. No additional match terms are recommended: `basa fillets` does not by itself specify a frozen product, and Metro lists both fresh and frozen fillets. `frozen Pangasius fillets` is not an exact English retail label in the reviewed current sources. Do not add `basa fish`, `swai`, `Bocourti`, `Sutchi catfish`, `poisson-chat du Mékong`, a Latin binomial, a brand, or a fresh/thawed synonym. Preserve the group reference's current scope and alias set. [R536-S01; Reused R19-S01]

Metro’s SKU 061763085499 lists basa fillets, water, and sodium phosphate; Walmart’s Great Value listing gives a different additive declaration. Those are product-level declarations, not a common recipe formula. The proposed form names only the frozen fillet presentation and does not claim that all products have the same additives, skin/bone condition, freezing method, package, or edible fish mass. [Reused R19-S02/S06; R536-S02]

## Why this is a distinct open boundary

R19 integrated the Pangasius group identity and recorded the Metro French/English SKU routes as evidence. It expressly left `basa fillets` and `frozen basa fillets` without a form, noting that the phrase would need a separate picker/form review if later requested. This packet makes that deferred cut-and-state decision only. It does not reopen the group identity, choose a Pangasius species, infer a species for SKU 061763085499, or reopen R530 kamaboko or R533 herring roe on kelp. See the [R19 proposal](wp04-section-p-pangasius-market-group-review-20261013-round19.md).

Current exact ownership checks find the group identity, but no active frozen-fillet form. No separate legacy candidate or candidate record owns the proposed form ID. The only prior product decision is R19’s group-level identity record; the source-ID ownership table below distinguishes that existing evidence from this form-only proposal. The 114-recipe bundle has no Pangasius/basa request, so this is a catalog coverage choice and creates no recipe link.

## Current snapshot and ownership audit

Read-only worktree snapshot taken 2026-10-17. File hashes are SHA-256 over exact bytes.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,801 | 588,737 | `0f4c4b4c3f86fab4ffe7c1bfbd5147c59a449d627295f9522d032a34f0ddef32` |
| [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 144 | 114,690 | `5a47b562629b3f7a248f4d6068b606a6baf6c216480caca8a63fc9fb1ec74b17` |
| [Legacy import identities](../legacy-import-identities.v1.json) | 56 candidates | 13,351 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| [Research ledger](../research-ledger.v1.json) | 2,158 records; 9,922 source entries; 8,399 distinct source IDs; 7,107 distinct URLs | 10,057,521 | `a749e9aef8c8cd8450e2069a31fd93a2c2595cdfabf72c57e0321bcf964838db` |
| [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Exact phrase ownership was checked across active reference names/aliases, all active form labels/match terms, legacy candidates, ledger record IDs/decisions, and the proposal/batch archive. The normalization mirrored `IngredientSearch.kt`: lowercase, Unicode NFKD and compatibility folding, accent/punctuation normalization, collapsed spaces, complete word-phrase match first, and substring fallback only when no phrase match exists.

| Phrase or ID | Existing owner | Proposed treatment |
|---|---|---|
| `Pangasius`, `pangasius`, `basa` | Active `ingredient-ref-pangasius-group`; verified ledger identity. English `basa` is already an alias on the group. | Keep unchanged. `basa` remains a group alias and does not select one species. |
| `frozen basa fillets`; `filets de pangasius surgelés`; `basa fillets`; `filets de pangasius` | No active reference/form term or legacy candidate. The current product wording occurs in the R19 ledger sources and R19 proposal, not as an active form. | Use only the exact paired state-qualified phrases as the proposed form labels. Do not attach state-free phrases as form match terms. |
| `ingredient-form-pangasius-frozen-fillets` | No active form, reference, legacy candidate, ledger record, or prior proposal/batch allocation. | New proposed form ID; not registered in shared data. |
| R536 source-ID prefix `WP04-SECTIONP-PANGASIUS-FROZEN-FILLETS-R536-20261017-` | No occurrence in the current ledger or inspected proposal/batch archive. | Proposal-local IDs only; no ledger source rows are being created here. |

`ingredient-ref-pangasius-group` is the sole exact ledger owner. Its R19 record owns the CFIA *Pangasius* group query and Metro SKU sources. The proposed form ID and frozen form decision do not exist in the ledger. The legacy file has 56 candidates and no exact Pangasius form owner. The active forms file has no Pangasius-attached form.

### Exact source ownership

| Source | Existing source ownership | R536 use |
|---|---|---|
| CFIA Fish List query `pangasius` | Existing `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S01`, attached to `ingredient-ref-pangasius-group`. | Reuse the existing source ID. The current result supports the *Pangasius* spp. group and overlapping `Basa / Pangasius` names; it does not identify Metro or Walmart lots. |
| Metro French SKU 061763085499 | Existing `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S02`, attached to `ingredient-ref-pangasius-group`. | Reuse the existing source ID and URL. Rechecked current French search result; it gives `Filets de pangasius surgelés`, 1 kg, and Pangasius fillets with water and sodium phosphate. The product page warns that supplier information can change; price and availability are store/date dependent. |
| Metro English SKU 061763085499 | Existing `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S06`, attached to `ingredient-ref-pangasius-group`. | Reuse the existing source ID and URL. Rechecked the English route; it gives `Frozen Basa Fillets`, 1 kg, and basa fillets with water and sodium phosphate. Its label does not provide a binomial. |
| CFIA fish-labelling guidance | Exact URL has existing entries across other ledger records. Reuse `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07` for the general “descriptive words about the true nature of fish products” locator; do not add another shared source row. | Supports keeping product form/cut and condition descriptors separate. It does not prescribe this app form or resolve the fish species in a retail SKU. |
| Metro “Basa” product overview | No exact URL/source-ID owner found in the current ledger or inspected WP04 archive. | Proposal-local `WP04-SECTIONP-PANGASIUS-FROZEN-FILLETS-R536-20261017-S01`; states that Metro sells both fresh and frozen basa fillets, supporting omission of a state-free `basa fillets` form term. No species or SKU label is established on the overview page. |
| Walmart Canada, Great Value Pangasius fillets | No exact URL/source-ID owner found in the current ledger or inspected archive. | Proposal-local `WP04-SECTIONP-PANGASIUS-FROZEN-FILLETS-R536-20261017-S02`; supports a separate current French frozen-fillet retail presentation. Walmart says product details may be supplied by manufacturers/third parties and not independently verified; local availability varies. |

## Ingredient picker projection

The static projection mirrors the current `IngredientReferenceSearchIndex` over reference names, aliases, and attached form terms. The hypothetical form uses only the exact bilingual labels above. A form returns its parent reference; the form hint appears only when a query exactly matches a form label or match term.

| Query | Current result | With proposed form | Effect |
|---|---|---|---|
| `Pangasius`; `pangasius`; `basa` | One result: Pangasius / pangasius | Same one reference; no extra result | Group identity and existing alias remain unchanged. |
| `Frozen Basa Fillets` | None | Pangasius / pangasius, with the frozen-fillet form hint | Exact current English retail wording becomes selectable without creating a new identity. |
| `filets de pangasius surgelés` | None | Pangasius / pangasius, with the frozen-fillet form hint | Exact Québec retailer wording becomes selectable. |
| `basa fillets` | None | Pangasius / pangasius, without a form hint | The phrase is present within the state-qualified label, but omitting `frozen` does not select the form hint. |
| `filets de pangasius` | None | Pangasius / pangasius, without a form hint | The cut/group phrase matches within the French label; the full state-qualified phrase is needed for the form hint. |
| `frozen Pangasius fillets`; `pangasius fillets` | None | None | These are not added as English match terms because the reviewed product English label says `basa`; no source-attested exact term was found. |
| `fresh basa fillets` | None | None | The frozen label does not match a fresh-state query. Metro’s overview confirms fresh products are a distinct option. |
| `fillets`; `filets` | Six results | Seven results, adding Pangasius / pangasius | Broad cut searches remain multiple-result queries. |
| `frozen` | 13 results | 14 results, adding Pangasius / pangasius | Broad state search remains multiple-result. |
| `surgelés` | Three results | Four results, adding Pangasius / pangasius | Broad French state search remains multiple-result. |
| `fish`; `poisson`; `catfish`; `poisson-chat`; `swai`; `basa fish` | Unchanged existing results or no result | Unchanged | The labels add none of these generic, species-specific, or excluded terms. |

This is a static projection, not an app picker test. It shows the expected result under current source code behavior and documents the added result on broad `fillets/filets` and `frozen/surgelés` queries.

## Full manifest recipe scan

The manifest-ordered scan parsed **all 114 recipe files** and **all 1,123 structured ingredient rows**, searched every decoded recipe JSON value and each ingredient row, and read **753,988 exact recipe-file bytes**. Search terms covered `Pangasius`, *Pangasius* spp. and species names, `basa`, `swai`, `Basa Fish`, `frozen basa fillets`, `frozen Pangasius fillets`, `filets de pangasius`, `filets de pangasius surgelés`, and singular/plural English and French Pangasius/basa fillet wording. It found **0 matching recipe files, 0 matching ingredient rows, and 0 linked rows**.

Corpus fingerprint: **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, SHA-256 over each manifest-relative recipe path encoded as UTF-8, NUL, exact file bytes, NUL, in manifest order. The nearby seafood lines do not imply Pangasius demand: Recipe 019#8 asks for Jumbo Lump crab meat, Recipe 077#10 for skinless salmon fillets, Recipe 093#4 for generic “Cooked meat or seafood, to taste,” and Recipe 111#1 for one tuna steak. The placeholder line does not identify Pangasius or a fish-fillets state.

## Forms, measurements, and substitutions

- **Form:** Add only the source-named frozen-fillet presentation under `ingredient-ref-pangasius-group`. Do not add a fresh, thawed, previously frozen, skinless, boneless, individually frozen, glazed, raw/cooked, or brand-specific form from this evidence set. Walmart’s skinless, individually sealed, and uncooked statements describe its SKU only; they do not make those universal group states. [R536-S02]
- **Package and additives:** Metro gives one 1 kg package with water and sodium phosphate. Walmart gives one 1.12 kg package with water, salt, citrates, and sodium phosphate. These amounts and formulations belong to their named products. Do not infer fish-only mass, piece count, drained/thawed mass, recipe portion, package unit, yield, or conversion. [Reused R19-S02/S06; R536-S02]
- **Density and mappings:** No source reports a household volume, density, or reusable unit mapping for this form. Keep density null and mappings empty.
- **Substitution:** No bundled recipe or cited source validates a directed substitution between Pangasius/basa fillets and cod, pollock, tilapia, sole, salmon, or another fish. Do not add a global or contextual rule, warning, or recipe-line link.

## Recommendation

**Recommend adding only `ingredient-form-pangasius-frozen-fillets`** under the existing group reference, with exact labels `frozen basa fillets / filets de pangasius surgelés`, `formCode: frozen`, and `prepState: frozen`. The group and `basa` alias remain the sole identity. This is supported by the current Québec Metro bilingual SKU, a current Walmart Canada French frozen-fillet listing, and CFIA's group-level naming scope. Do not add a separate basa species or product reference.

Keep state-free `basa fillets` and `filets de pangasius` out of the form match terms because current Metro describes both fresh and frozen fillets. Keep package amounts, product additive formulas, skin/bone claims, and individually-frozen wording attached to their cited SKUs only. The corpus has no Pangasius demand, so no recipe link or numeric/substitution behavior follows. Section P remains open.

## Source register

Sources rechecked 2026-10-17 unless noted. At proposal review, source IDs marked reused remained owned by their existing ledger records and R536 made no shared changes. The integrated form ledger record reuses those IDs as evidence and records the accepted form, as summarized in the linked batch README.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **Reused `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S01`** | Canadian Food Inspection Agency, [Fish List query for `pangasius`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=pangasius), query results. | Lists a *Pangasius* spp. group and rows for multiple *Pangasius* taxa. `Basa / Pangasius` appears on *P. bocourti* and *P. hypophthalmus* rows. Common-name guidance does not identify the Metro or Walmart lot. The dynamic query result is indexed search output; reuse the prior ledger entry and its exact query URL. |
| **Reused `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S02`** | Metro, [French SKU 061763085499](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/filets-de-pangasius-surgeles/p/061763085499), product title, ingredient declaration, package field; current French search result rechecked 2026-10-17. | Pairs `Filets de pangasius surgelés` with a 1 kg frozen SKU and lists Pangasius fillets, water, and sodium phosphate. Page data and availability may change by supplier/store/date; the French direct open redirected to the English page during this check. No binomial or reusable recipe amount. |
| **Reused `WP04-SECTIONP-PANGASIUS-GROUP-20261013-R19-S06`** | Metro, [English SKU 061763085499](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-basa-fillets/p/061763085499), title, product number, package and ingredient sections. | Current English route names `Frozen Basa Fillets`, confirms product number 061763085499, 1 kg, and lists basa fillets, water, and sodium phosphate. It does not identify a binomial or validate a reusable measure. Product price and availability vary. |
| **WP04-SECTIONP-PANGASIUS-FROZEN-FILLETS-R536-20261017-S01** | Metro, [Basa](https://www.metro.ca/en/products-to-discover/fish-seafood/our-fish-seafood/basa), “Culinary tips and advice,” accessed 2026-10-17. | Says fresh and frozen basa fillets are available in Metro fishmonger displays. Supports keeping state-free phrases separate from a frozen form; it is general retailer information, not a specific product label, species determination, or recipe test. Exact URL has no ledger/source-ID owner. |
| **WP04-SECTIONP-PANGASIUS-FROZEN-FILLETS-R536-20261017-S02** | Walmart Canada, [Great Value Filets de Pangasius, 1.12 kg](https://www.walmart.ca/fr/ip/Filets-de-pangasius-Great-Value/6000200516296), product description, storage, ingredients, and specifications, accessed 2026-10-17. | French retail page calls it frozen Pangasius fillets, says keep frozen, lists a 1.12 kg package, and names Pangasius, water, salt, citrates, and phosphate. Retailer says supplier/third-party product information is not independently verified; product availability depends on location. It does not identify a binomial or package fish-only mass. Exact URL has no ledger/source-ID owner. |
| **Reused `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07`** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), “Common name” and “Descriptive words about the true nature of fish products.” | General labeling guidance says cut/form/style and condition descriptors may need to appear when their omission could cause confusion. This supports treating frozen state and fillet cut as product descriptors; it does not define a particular catalog form or supply a Pangasius species. |

## Validation

- Parsed the current references, forms, legacy catalog, ledger, manifest, and all manifest recipe JSON; counts, byte sizes, hashes, and corpus fingerprint are recorded above.
- Reproduced the exact bilingual picker projection in memory with the current phrase-first, substring-fallback, and exact-form-hint behavior. No shared catalog terms were added for this review.
- Confirmed the proposed form ID and R536 source-ID prefix have no prior exact owner. Reused source IDs/URLs remain attached to their existing ledger owners; proposal-local source IDs have no exact ledger/archive URL owner.
- At proposal review this was a proposal-only documentation change. Integration and static validation are recorded in the linked batch README. No software tests, build, emulator, or deployment were run.
