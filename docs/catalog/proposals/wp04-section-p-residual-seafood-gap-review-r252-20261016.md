# WP04 Section P — silver pomfret picker and market-boundary review (R252)

- **Review and source-access date:** 2026-10-16.
- **Packet type:** Proposal-only Canadian naming, exact-ownership, picker, market, and recipe-demand review.
- **Recommendation:** Keep silver pomfret / *Pampus argenteus* outside active references, forms, legacy identities, and the research ledger for now. CFIA and TERMIUM support a species-specific bilingual name pair, and current Ontario seafood suppliers list the species. However, the current picker would make the broad query `pomfret` return this one species row by itself. Current Canadian market listings also distinguish black pomfret and use “golden pomfret” for a *Trachinotus* pompano product. No bundled recipe demand was found.
- **Scope:** This is a documentation-only proposal. No catalog JSON, ledger, generated code, plan, roadmap, recipe, or application code was changed. No tests or emulator checks were run.

## Candidate and prior-work boundary

The candidate is the single species *Pampus argenteus*, whose CFIA Fish List entry is **Silver Pomfret / Aileron Argenté**. TERMIUM also gives **white pomfret** as an English term and **pampus argenté** as a French main entry, with **aileron argenté** as a French synonym. Those taxonomy-linked sources establish an exact candidate name; they do not establish that bare `pomfret`, `pomfret blanc`, or other pomfret-labelled products all refer to this species. [S01, S02]

This is not a proposal to create a genus-level *Pampus* identity, an identity for black pomfret (*Parastromateus niger*), or another *Trachinotus* / pompano identity. The R109 pompano review integrated only the generic *Trachinotus* market group. Its recipe scan included `golden pomfret` among adjacent negative-search phrases, but that scan did not review or resolve *Pampus argenteus*. No silver-pomfret-specific proposal or batch was found. [See the R109 review](wp04-section-p-pompano-market-group-identity-review-r109-20261014.md) and [R109 integration README](../batches/wp04-section-p-pompano-market-group-identity-integration-20261014/README.md).

The current Section P checklist still leaves regional fish coverage open and records the R248 opah decision. This review does not reopen opah or any recent Section P integration or hold. [Global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) · [Roadmap](../../../roadmap.md).

## Ownership and corpus audit

The review checked the live seed references and forms, legacy import identities, research ledger, recipe package, plan, roadmap, and proposal/batch archives. Current worktree counts at review time were 1,640 active references, 124 forms, 61 legacy candidates, and 1,987 ledger records. The package manifest lists 114 recipes; the parsed corpus has 1,123 ingredient rows.

| Candidate term or allocation | Active reference | Form | Legacy identity | Ledger/archive result |
|---|---|---|---|---|
| `ingredient-ref-silver-pomfret` / `Pampus argenteus` | No owner | No owner | No owner | No candidate record or ID; no silver-pomfret-specific review or batch. The ID is not reserved. |
| `silver pomfret`, `white pomfret`, `pomfret`, `aileron argenté`, `pampus argenté` | No active owner | No form-term owner | No exact owner | No ledger identity or candidate-specific decision. `golden pomfret` appears only as an adjacent phrase in R109’s recipe scan. |
| `black pomfret`, *Parastromateus niger* | No owner | No owner | No owner | No candidate-specific decision found. |
| `pompano`, *Trachinotus* | `ingredient-ref-pompano` only | No related form owner | No related legacy owner | R109 owns the generic *Trachinotus* market-group decision. Keep pomfret terms off this reference. |

The bundled corpus was searched across the manifest-listed recipe files, complete recipe JSON, and ingredient rows for pomfret variants, *Pampus*, *Parastromateus*, and the bilingual names above. **Result: zero matching recipe files and zero matching ingredient rows.** No recipe link or recipe-specific form is supported.

## Canadian naming and current market evidence

CFIA lists the accepted Canadian labelling names **Silver Pomfret / Aileron Argenté** against *Pampus argenteus* (TSN 172572). CFIA explains that its Fish List supplies English and French common names acceptable in Canada for fish labelling, along with scientific names and TSNs. TERMIUM independently associates *Pampus argenteus* with `white pomfret`, `pampus argenté`, and `aileron argenté`. [S01, S02]

Current Canadian supplier pages show a real market product boundary for the named species:

- Seacore Seafood in Vaughan lists **Silver Pomfret / *Pampus argenteus*** as whole, fresh or frozen, wild fish, with stated product origins India and Trinidad and Tobago. [S03]
- Fresh Water Foods in Richmond Hill lists **Silver Pomfret / *Pampus argenteus*** and separately lists **Black Pomfret / *Parastromateus niger***. The same current catalogue lists **Golden Pomfret (Pompano) / *Trachinotus blochii*** as another product. This is direct evidence that retail and wholesale use of “pomfret” spans materially different named market products, including one the supplier also calls pompano. The page describes Ontario wholesale and grocery channels, not Québec inventory. [S04]
- Walmart Canada has a 300 g Ocean Dragon Silver Pomfret product card describing whole, frozen, vacuum-packed fish. It was out of stock when checked, identifies no binomial, and carries Walmart’s notice that seller-provided product information is not independently verified. Treat it as a Canadian retailer listing, not evidence of current stock or species verification. [S05]
- Uniking Entreprises (Canada) has a French product listing for **Pomfret argenté** whose detail page gives the product type as “Pomfret” but no species or inventory information. Its product index also lists **Pomfret blanc** as a separate item. The firm page identifies its address in Richmond, British Columbia. These are useful Canadian French-language market labels, but neither establishes a Québec name convention or maps both listings to *P. argenteus*. [S06]

No Québec-specific seller listing that names *Pampus argenteus* was located. No OQLF entry for `aileron argenté` or `pampus argenté` was located in this review. The Canadian regulatory and TERMIUM sources support the bilingual species pair, but local Québec product availability and local retail usage remain unverified.

## Search and alias boundary

`IngredientReferenceSearchIndex` normalizes accents and punctuation, looks for complete word phrases inside bilingual displays, aliases, and form terms, and returns phrase hits before partial fallbacks. Therefore a row displayed as `silver pomfret` / `aileron argenté` would match both `silver pomfret` and the shorter query `pomfret`. Because no other active pomfret row exists, the current picker would show the *P. argenteus* row as the sole result for bare `pomfret`. That would imply broad product coverage the row cannot support. [Picker implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)

Use these boundaries if the candidate is revisited:

| Term | Evidence | Recommendation |
|---|---|---|
| `silver pomfret` | CFIA and current Canadian suppliers pair it with *P. argenteus*. | Species-specific English name; still omit from active data until broad-query behavior is addressed. |
| `aileron argenté` | CFIA lists it for *P. argenteus*; TERMIUM lists it as a correct French synonym. | Best-supported Canadian French species name; Québec-specific product use is not established. |
| `white pomfret` | TERMIUM maps it to *P. argenteus*. | Do not activate as an alias at this stage: it contains the broad `pomfret` query and the current Canadian `Pomfret blanc` product listing has no taxon. |
| `pampus argenté` | TERMIUM maps it to *P. argenteus*. | Do not activate; no OQLF entry or current Québec/Canadian product use was established. |
| `pomfret`, `pomfret blanc`, `pomfret argenté` | Canadian vendor listings use these labels, with separate silver, white, black, and golden pomfret product names; only some listings identify a species. | Do not add as broad aliases. In particular, do not map `Pomfret blanc` to *P. argenteus* from the Uniking title alone. |
| `pompano`, `golden pomfret` | The active `pompano` row covers *Trachinotus*; a current supplier calls *T. blochii* “Golden Pomfret (Pompano).” | Keep the existing pompano row unchanged; add no pomfret alias to it and no pompano alias to the pomfret candidate. |
| `black pomfret` | Fresh Water Foods identifies *Parastromateus niger* separately from *P. argenteus*. | Keep as a distinct species boundary; do not fold it into a silver-pomfret row. |

If picker behavior later preserves multiple broad matches or clearly distinguishes broad queries from qualified species, a future identity-only row could use the CFIA names. The candidate shape below is illustrative only and does not allocate an ID:

```json
{
  "id": "ingredient-ref-silver-pomfret",
  "nameEn": "silver pomfret",
  "nameFr": "aileron argenté",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

Even if a future row is admitted, keep it strictly scoped to *Pampus argenteus*. Do not create a genus-level pomfret identity or attach `white pomfret`, `pampus argenté`, broad `pomfret`, supplier-specific forms, or any *Trachinotus* names without a separate query and label review.

## Product data limits and recommendation

The supplier pages support Canadian trade in whole and frozen silver pomfret, and Seacore also states fresh availability. Those are product-specific observations, not evidence for reusable ingredient forms or conversions. Do not create forms, package measures, density, unit mappings, edible-yield values, cooking guidance, recipe links, substitutions, or recipe alternatives from these listings. Walmart’s 300 g package and Fresh Water Foods’ grades and bulk packaging remain seller-specific; Uniking lists no inventory for its silver-pomfret product page.

**No active identity data is justified under the current picker behavior.** Exact species naming and Canadian wholesale listings are credible, but activating the row would give the broad term `pomfret` a misleading singleton result. The corpus offers no recipe demand to offset that risk, and a Québec-specific commercial French label remains unverified. Keep the candidate outside active references, forms, legacy mappings, and ledger until the picker can represent the broader market choice or later evidence supports a bounded disambiguation.

## Sources

Source IDs below are local to this proposal and were not added to the research ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SILVER-POMFRET-R252-20261016-S01** | CFIA, [Fish List search results for *Pampus argenteus*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&q=Pampus%20argenteus); [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Lists TSN 172572 as *Pampus argenteus* / Silver Pomfret / Aileron Argenté. CFIA describes the list as acceptable Canadian fish-labelling names and corresponding species information. Naming authority, not a Québec inventory or recipe identity source. The overview page was accessed 2026-10-16; the search result page identifies the species row. |
| **WP04-SECTIONP-SILVER-POMFRET-R252-20261016-S02** | Government of Canada, TERMIUM Plus, [Pampus argenteus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=PAMPUS+ARGENTEUS) | Translation Bureau record associates *P. argenteus* with English `white pomfret`, French `pampus argenté`, and French synonym `aileron argenté`; the page shows the record date 2016-04-08 and site metadata modified 2025-07-06. Terminology evidence, not a current market listing or proof that similarly titled products disclose this species. |
| **WP04-SECTIONP-SILVER-POMFRET-R252-20261016-S03** | Seacore Seafood Products (Vaughan, Ontario), [Silver Pomfret](https://www.seacoreseafood.com/product/Pomfret_Silver) | Supplier page lists *Pampus argenteus*, whole, fresh/frozen, wild, with India and Trinidad & Tobago product origins; contact page identifies Vaughan, Ontario. Wholesale availability evidence, not Québec retail stock or standard recipe forms. |
| **WP04-SECTIONP-SILVER-POMFRET-R252-20261016-S04** | Fresh Water Foods Inc. (Richmond Hill, Ontario), [Tropical fish products](https://freshwaterfood.ca/tropical-fish.html) | Current catalogue lists silver and black pomfret under separate binomials and golden pomfret (pompano) as *Trachinotus blochii*. Its marketing copy describes Ontario wholesale and grocery channels. Product and market-boundary evidence; not Québec naming guidance. |
| **WP04-SECTIONP-SILVER-POMFRET-R252-20261016-S05** | Walmart Canada, [Silver Pomfret](https://www.walmart.ca/en/ip/Silver-Pomfret/6000198520343) | Product card describes Ocean Dragon 300 g whole frozen vacuum-packed fish, but was out of stock when checked and gives no binomial. Walmart says supplier-provided information is not independently verified. Retail-listing evidence only. |
| **WP04-SECTIONP-SILVER-POMFRET-R252-20261016-S06** | Uniking Entreprises (Canada) Ltd., [French product index](https://www.uniking.ca/fr/products); [Pomfret argenté product page](https://www.uniking.ca/fr/product/479/silver-pomfret-fish) | Index separately lists `Pomfret argenté` and `Pomfret blanc`; the silver product detail page gives type `Pomfret` but no species or inventory rows. The company page lists Richmond, British Columbia. Current Canadian French-language product wording, not Québec-specific or taxonomic evidence. |

## Review checks

- Checked exact and case-insensitive candidate terms across active references, forms, legacy candidates, ledger records, and existing proposal/batch archives.
- Confirmed `ingredient-ref-pompano` is the only active owner of `pompano`; no pomfret terms are attached to it.
- Re-read the Section P plan entry, roadmap’s R248 note, and R109 pompano review to avoid duplicating or reopening prior work.
- Parsed the 114 manifest-listed recipes and 1,123 ingredient rows; the candidate and adjacent names had zero matches.
- No tests or emulator checks were run because this file records a documentation-only review.
