# WP03 Section L R139 — Hatch-type pepper boundary review — 2026-10-15

- **Status:** proposal only. No shared catalog JSON, ledger, plan, roadmap, generated index, or batch file was changed.
- **Disposition:** **bounded hold** for the checklist wording `Hatch-type`. Do not add an ingredient reference, form, alias, measurement, recipe link, or substitution rule in this review.
- **Reason:** authoritative New Mexico sources define *Hatch chile* by growing place, not as a cultivar. The plan's `Hatch-type` wording can also describe out-of-region lookalikes, which New Mexico State University (NMSU) and a Hatch Valley producer distinguish from Hatch-grown chile. A current Canadian fresh-produce listing uses the market name `Hatch Chili Pepper` but does not disclose growing origin. French-language Canadian/Québec retail pages use Hatch wording only in finished or prepared products, not as a standalone fresh pepper listing.
- **Revisit condition:** clarify whether the checklist means a Hatch-grown, origin-qualified green chile or a broader Hatch-style/New Mexican-type pepper. Do not turn `Hatch-type`, `New Mexico chile`, or `Anaheim` into aliases for one another.

## Checklist and ownership review

The active [WP03 Section L pepper checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4474) still lists `Hatch-type` between Anaheim and Habanero. R136 added Poblano, R137 added Habanero, and R138 added Anaheim. The R138 review explicitly kept Hatch/New Mexico products separate from Anaheim. This proposal addresses only the unresolved Hatch-type wording; it does not change the checklist or complete the wider pepper sweep.

Read-only snapshot on 2026-10-15:

- The live package has **1,493 ingredient references and 113 forms**. No reference or form contains Hatch or New Mexico chile wording. The existing Anaheim, Poblano, and Habanero rows remain separate.
- `legacy-import-identities.v1.json` has **61 candidates** and no Hatch/New Mexico chile candidate.
- The research ledger has **1,838 records** and no Hatch/New Mexico chile identity or research record. Its only whole-record `Hatch` match is an unrelated Meyer Hatchery quail-egg FAQ.
- Prior WP03 proposals and integration records do not allocate Hatch. The R138 Anaheim proposal and batch README mention Hatch only to preserve the separate boundary.
- The live manifest lists **114 recipes / 1,123 ingredient lines**. A scan of all manifest-listed recipe content found no `Hatch`, `Hatch-type`, `piment Hatch`, `New Mexico chile/pepper`, or `New Mexican chile/pepper` demand.
- Both live substitution-rule files are empty. The proposed IDs `ingredient-ref-hatch-pepper`, `ingredient-form-hatch-pepper-fresh`, and a Hatch research record ID are unused.

## Identity and naming boundary

NMSU's Chile Pepper Institute says there is **no chile variety named Hatch**: the term points to the growing area. It lists several New Mexican pod-type cultivars that may be sold as Hatch, including Anaheim, and says a chile must have been grown in New Mexico to be labeled Hatch [S01]. A second NMSU publication describes Hatch chile as green chile grown in the Hatch Valley and also says Hatch is not a specific cultivar [S02]. New Mexico's Department of Agriculture states that chile products advertised as New Mexico or by another New Mexico geographic feature must have been grown in New Mexico [S03].

These sources establish a meaningful regional product identity for **Hatch-grown chile**, but do not establish a generic `Hatch-type` identity for peppers grown elsewhere. NMSU's inclusion of Anaheim among cultivars that may be sold as Hatch does not make `Hatch` an Anaheim synonym: growing origin remains part of the Hatch name. The existing Anaheim row should stay separate.

The distinction matters in current retail language. A FreshCo page on Instacart Canada lists a fresh-produce item titled `Hatch Chili Pepper`, but it gives no farm, growing region, or Hatch-origin statement [S04]. The Hatch Valley producer that operates The Hatch Chile Store distinguishes actual Hatch-grown chile from `Hatch-style` / `Hatch type` peppers grown outside the valley, and sells fresh, roasted/frozen, jarred, powdered, and other products as separate offerings [S09]. That producer is product-specific evidence, not an independent Québec terminology authority or proof of Canadian supply. Without the FreshCo item's origin, this review cannot determine whether it is Hatch-grown or a loosely labeled Hatch-type product.

**English wording:** Canadian evidence uses both `Hatch Chili Pepper` on the fresh-produce listing and `Hatch Chile Peppers` as an Instacart category [S04–S05]. The spelling variation is not a safe basis for adding broad `chili`, `chile`, or `green chile` aliases. The New Mexico sources use *chile* for the fruit and identify the place-based limit; retail spelling alone does not resolve product origin.

**Québec French wording:** Canadian/Québec French product pages use crop-qualified phrases such as `piments verts Hatch` and `piments Hatch` [S06–S07]. Those pages describe a freeze-dried macaroni meal and frozen enchiladas, respectively; neither is a standalone fresh pepper label. A French-language stuffed-pepper recipe also uses `piments Hatch`, but direct retrieval failed and the page's description of Hatch as a “variety” conflicts with NMSU's horticultural account [S08]. Targeted OQLF GDT and TERMIUM searches did not surface a relevant preferred food term. Thus `piment Hatch` is locally attested product wording, not a Québec-standardized term established by this review.

Do not use `piment du Nouveau-Mexique`, `piment Anaheim`, `Hatch-type`, `Hatch-style`, `green chile`, or unqualified `piment vert` as Hatch aliases. No Québec French standalone fresh-market page was verified that resolves whether the named product is Hatch-grown or merely Hatch-style.

## Picker projection and alias boundary

The static projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it folds case and accents, prefers complete word phrases across all results, then falls back to substring matching. A form hint appears only for an exact full form-term query.

For impact analysis only, a counterfactual row with canonical names `Hatch chile` / `piment Hatch`, no aliases, and one fresh form would change these query results:

| Query | Current | Counterfactual | Boundary |
|---|---:|---:|---|
| `Hatch`, `Hatch chile`, `piment Hatch` | 0 / 0 / 0 | 1 / 1 / 1 | Exact named terms would become searchable. No row is proposed while the checklist scope is unresolved. |
| `Hatch-type`, `Hatch-style`, `New Mexico chile` | 0 / 0 / 0 | 0 / 0 / 0 | Keep these out of aliases; they do not define the same source-backed crop boundary. |
| `piment` | 19 | 20 | A singular French canonical term would remain one result among many. |
| `piments` | 0 | 0 | Do not add `piments Hatch`: that plural alias would make bare `piments` return one Hatch result. |
| `chile`, `pepper`, `peppers`, `chili` | 1 / 24 / 4 / 8 | 2 / 24 / 4 / 8 | A named `Hatch chile` canonical term would add one result to `chile`; the other broad queries would not change without additional aliases. |
| `Anaheim` | 1 | 1 | Do not add Anaheim to Hatch or Hatch to Anaheim; the NMSU source says Anaheim is one cultivar that may bear the Hatch label when grown in New Mexico. |

The projection is a static counterfactual, not a catalog change or app test. Because there is no approved identity boundary, no picker term is added in this proposal.

## Forms, quantity, recipe demand, and substitutions

The Canadian FreshCo listing appears under Instacart's fresh-produce / fresh-vegetable / chili-pepper path and displays `About 0.28 kg each`, `est.`, and final cost by weight [S04–S05]. This is an item-specific estimated price quantity with no method or origin detail, not an average Hatch-pepper mass or a reusable count mapping. The Hatch Valley seller offers fresh pods in producer box sizes and separately offers roasted/frozen and shelf-stable products [S09]; those pack sizes and states do not establish cross-form ratios or conversions. Do not add density, unit mapping, count weight, or conversions.

No Hatch wording appears in the bundled recipe corpus. Outside that corpus, the French-language page `Piments Hatch farcis au crabe et au maïs` lists `6 à 8 piments Hatch (ou poblanos)` [S08]. This is one dish-scoped alternative in an indexed recipe, not a bundled recipe link, universal substitution, or mass-per-pepper measure. The page could not be directly retrieved in this pass. The Hatch Valley producer also recommends its Hatch product in place of Anaheim and some canned green chiles, with preparation caveats for Poblano [S09]. That is producer usage advice without a general conversion ratio or independent testing. Neither source supports an active global substitution rule.

The FreshCo listing supports a fresh-market *label* but not the origin needed to resolve this plan item. If a future review narrows the candidate to Hatch-grown fresh chile, a `fresh` form could be evaluated separately. The current proposal adds no forms, measurement observations, recipe links, yields, or substitutions.

## Source register

Pages and search results were checked on 2026-10-15. Product inventory and price are not used as identity claims.

| Source ID | Source and access | Evidence and limits |
|---|---|---|
| `WP03-L-HATCH-20261015-R139-S01` | New Mexico State University Chile Pepper Institute, [Then and Now](https://cpi.nmsu.edu/chile-info/then-and-now.html), opened directly. | States that Hatch is not a variety; the name indicates growing area. Lists New Mexican pod-type cultivars that may be sold as Hatch, including Anaheim, and says the peppers must be grown in New Mexico to carry the Hatch label. Primary university source for the identity boundary. |
| `WP03-L-HATCH-20261015-R139-S02` | New Mexico State University, [The Wonders of New Mexico Chile](https://irrigationmanagement.nmsu.edu/documents/crop-description.pdf), opened directly. | Says Hatch chile is green chile grown in the Hatch Valley, not a specific cultivar; describes distinct green/fresh and red/dried stages of New Mexican chile. Supports regional and form boundaries, not Canadian availability. |
| `WP03-L-HATCH-20261015-R139-S03` | New Mexico Department of Agriculture, [New Mexico Chile Labeling](https://nmdeptag.nmsu.edu/licensing-and-registrations/nm-chile-labeling.html), opened directly. | Summarizes the New Mexico Chile Advertising Act: chile advertised as New Mexico or another New Mexico geographic feature must have been grown in New Mexico. The page is a current state-regulatory summary; it does not determine how the FreshCo item's supplier uses its title. |
| `WP03-L-HATCH-20261015-R139-S04` | Instacart Canada / FreshCo, [Hatch Chili Pepper, product 60405476](https://www.instacart.ca/products/60405476-hatch-chili-pepper-1-kg?retailerSlug=freshco-ca), opened directly. | Current Canadian retailer marketplace title and fresh item listing. Shows about 0.28 kg each, estimated, with final cost by weight. No growing location, producer, or weight method is given; retain the amount only as this listing's estimate. |
| `WP03-L-HATCH-20261015-R139-S05` | Instacart Canada, [Hatch Chile Peppers category](https://www.instacart.ca/categories/316-food/317-fresh-produce/439-fresh-vegetables/461-chili-peppers/468-hatch-chile-peppers), opened directly. | Places Hatch products under fresh produce / fresh vegetables / chili peppers and lists market pack options. Instacart inventory varies by chosen retailer and location; category wording does not certify crop origin. |
| `WP03-L-HATCH-20261015-R139-S06` | SAIL, [Macaroni trois fromages et piments verts Hatch](https://www.sail.ca/fr-ca/products/backpacker-s-pantry-macaroni-trois-fromages-et-piments-verts-hatch-1612708-26-007500001), indexed French-Canadian page; direct open returned a cache miss. | Québec-facing product title and description use `piments verts Hatch` for an ingredient in a freeze-dried macaroni meal. Product page lists Québec store locations. Not a standalone pepper or fresh-form label. |
| `WP03-L-HATCH-20261015-R139-S07` | Metro, [Crave frozen creamy chicken enchiladas](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/repas-et-plats-d-accompagnement/plats-a-base-de-poulet-et-dinde/enchiladas-cremeuses-au-poulet-surgelees/p/057000000813), indexed French product page; direct open returned HTTP 403. | Ingredient text includes `piments hatch [chilis verts, acide citrique]` in a finished frozen meal. Supports local product wording only; processing state and origin are not sufficient to define a fresh pepper reference. |
| `WP03-L-HATCH-20261015-R139-S08` | Sicocean, [Piments Hatch farcis au crabe et au maïs](https://sicocean.com/poivrons-farcis-cuisiner-avec-janica/), search-indexed French-language recipe; direct open returned a cache miss. | Indexed ingredient phrase says `6 à 8 piments Hatch (ou poblanos)`. This is one recipe's dish-scoped alternative and count; it is outside the bundled corpus. The indexed page's “variety” phrasing is not used to override NMSU's definition. |
| `WP03-L-HATCH-20261015-R139-S09` | The Hatch Chile Store, [Hatch green chile products](https://www.hatch-green-chile.com/collections/hatch-green-chile), opened directly. | A Hatch Valley seller distinguishes Hatch-grown chile from out-of-area Hatch-style/type products and lists fresh, roasted/frozen, jarred, powdered, and other forms. Its product sizes and substitution advice are seller-specific, not independent terminology evidence, Canadian availability, or reusable conversions. |
| `WP03-L-HATCH-20261015-R139-S10` | Targeted searches of the [OQLF Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/) and [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?lang=fra&srchtxt=Hatch%20chile) for `Hatch chile`, `piment Hatch`, and `piment du Nouveau-Mexique`; no relevant food-term record surfaced in this pass. | Absence from these targeted searches is not proof that no preferred term exists. The local French wording above is cited as product wording only. |

## Exact proposed JSON delta

**None.** Hold the plan's `Hatch-type` candidate pending a source-backed scope choice between origin-qualified Hatch chile and broader Hatch-style/New Mexican-type peppers. Do not reserve an identity by adding an alias to Anaheim or an existing green-chile row. No change to catalog JSON, ledger JSON, plans, roadmap, or generated files is proposed. This documentation-only proposal was statically reviewed; no app, Gradle, unit, instrumentation, emulator, deployment, or other tests were run.
