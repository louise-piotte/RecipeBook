# WP04 Section P — whole-thawed Atlantic mackerel form boundary review (R668)

- **Review and source-access date:** 2026-10-18.
- **Checklist:** The [Section P finfish parent](../../RecipeBook-global-ingredient-catalog-plan.txt#L6637) remains open for named seafood and regional fish.
- **Candidate:** A whole, thawed retail presentation of Atlantic mackerel, *Scomber scombrus*, under the existing `ingredient-ref-atlantic-mackerel` identity. Metro Québec SKU 247218 names it `Maquereau entier décongelé / Previously Frozen Whole Mackerel` and supplies the binomial.
- **Scope:** A raw-fish market form only. It is not a new identity, an alias for bare `mackerel / maquereau`, or a smoked/canned product decision.
- **Recommendation:** Hold the candidate form outside active data. Keep the existing Atlantic-mackerel identity and `maquereau bleu` alias unchanged.
- **Status:** Accepted as a documentation-only hold and recorded in the R666–R669 coverage batch. No reference, form, legacy candidate, ledger record, recipe, or application code was changed. No software tests were needed under `AGENTS.md`.
- **Proposal-local source IDs:** `WP04-SECTIONP-ATLANTIC-MACKEREL-WHOLE-THAWED-R668-20261018-S01` through `S07`; `R01` is a repository-audit label. These are not shared-ledger allocations.

## Candidate selection and prior-work boundary

The first screened candidate, Arctic grayling, is already covered by the [Arctic-grayling picker hold](wp04-section-p-arctic-grayling-species-picker-northern-use-hold-review-20261012.md) and its [integration README](../batches/wp04-section-p-arctic-grayling-picker-hold-integration-20261012/README.md). I pivoted to the whole-thawed form gap below.

The selected form is distinct from prior mackerel decisions. R167 added a species-neutral smoked-mackerel finished-food identity; R176 added a separate canned-mackerel market group; R304 added only the French `maquereau bleu` alias to the raw Atlantic-mackerel identity; and R311 added Indian mackerel as a different species. None reviewed Metro SKU 247218 or allocated a whole-thawed form. R304 explicitly left the Atlantic-mackerel form list empty, but did not assess this Québec retail item. The recent R630/R633/R637/R641/R645/R649/R652/R655/R658/R661/R664 candidates concern other species or market boundaries and are not reopened here.

The active identity is already supported and verified. This proposal decides only whether its newly observed whole-thawed presentation should become a searchable form.

## Naming and market evidence

| Evidence | Finding | Scope limit |
|---|---|---|
| CFIA Fish List query for `Mackerel` [reused `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S06`] | CFIA lists *Scomber scombrus* (TSN 172414) as `Atlantic Mackerel / Maquereau`, and also lists the broader `Mackerel / Maquereau` name for other taxa. The [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) describes the list as acceptable Canadian fish labelling names paired with scientific names and TSNs. | Canadian fish-name evidence; it does not identify any particular retail SKU or support culinary equivalence. |
| OQLF, [GDT: `maquereau`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3297732/maquereau) [reused `WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S05`] | The Québec term is `maquereau`, with English `mackerel` and Latin *Scomber scombrus*. | The term itself is not species-qualified in Québec usage; this source does not define a whole-fish or thawed form. |
| TERMIUM Plus, [entry for `maquereau`](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frb&lang=eng&srchtxt=MAQUEREAU) [S01] | The entry records *S. scombrus*, identifies `Atlantic mackerel` as the recommended commercial English term, and warns that unqualified `mackerel / maquereau` also names other Scombridae. | Terminology evidence, not Québec stock or product evidence. |
| DFO, [2024 recovery plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/mackerel-atl-maquereau/mac-atl-maq-2024-fra.html) [reused `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S09`] | Uses `maquereau de l’Atlantique` with *S. scombrus*, matching the active reference's species-qualified display. | Fisheries-management terminology, not a retail title or form definition. |
| DFO, [Atlantic mackerel profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/atl-mackerel-maquereau-fra.html) [S07] | Identifies *S. scombrus*, describes the Northwest Atlantic population along the Canadian coast, and notes migration through Québec and Atlantic Canadian waters. The page was modified 2025-07-04. | Distribution and fisheries context; historical landings and the species profile do not establish current consumer availability. |
| DFO, [2026 fishery decision for NAFO subareas 3 and 4](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-38-fra.html) [S04] | The 2026 decision, modified 2026-07-06, says the commercial fishery remains closed; recreational and food/social/ceremonial fisheries remain open. It is an annual decision for the named subareas. | It does not address imported fish or establish the source of Metro SKU 247218. |
| Metro Québec, [Maquereau entier décongelé, product 247218](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-entiers/maquereau-entier-decongele/p/247218) [S02] and [English route](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/whole-fish/previously-frozen-whole-mackerel/p/247218) [S03] | The paired French and English pages show the same product number, *S. scombrus*, North Atlantic origin, and wild/purse-seine method. The French title says `Maquereau entier décongelé`; the English title says `Previously Frozen Whole Mackerel`. | Both current pages report the selected product as out of stock. They give no package mass, fish count, portion, or reusable measure. An item-level out-of-stock notice is not a universal delisting. |
| Victoria Co-operative Fisheries, [wild Atlantic mackerel](https://vcfish.com/products/mackerel/) [S05] | A Canadian harvester co-op in Nova Scotia lists *S. scombrus*, supplied whole and frozen for food markets as well as bait. It describes supply as seasonal and asks buyers to contact it for current landings. | Wholesale market evidence for whole-frozen fish, not a Québec consumer product or evidence that the fish is thawed/currently available. |
| I&S Seafood, [Lower North Shore seafood page](https://www.insseafood.com/) [S06] | The Québec wholesaler describes market and local sales during its May–October season and lists Atlantic mackerel season as July–October. | The page gives no binomial, whole/thawed state, dated landing, or current SKU. Its seasonal wording cannot establish 2026 commercial availability in light of DFO's 2026 closure. |

The sources support the candidate product wording and species match, but both Metro route listings report the SKU out of stock. The Canadian supplier's whole-frozen listing is wholesale and conditional on current landings. The Québec supplier page is not species- or form-specific. Together with DFO's 2026 commercial-fishery closure, this evidence does not establish a currently available Canadian or Québec whole-mackerel product; it also does not rule out imported or otherwise unobserved supply.

## Ownership and ID audit

The read-only snapshot contains **1,837 active references**, **164 forms**, **56 legacy candidates**, and **2,210 ledger records with 10,340 source entries / 8,734 distinct source IDs / 7,384 distinct URLs**. The bundle manifest lists **114 recipes and 1,123 structured ingredient rows**.

| Candidate or nearby owner | Current state | R668 disposition |
|---|---|---|
| `ingredient-ref-atlantic-mackerel` | Active `maquereau de l’Atlantique / Atlantic mackerel`, alias `maquereau bleu`, category `PROTEIN`; ledger identity state `verified`. Its measurement and substitution states remain `not_yet_researched`. | Keep unchanged. Do not create a second Atlantic-mackerel identity. |
| Forms attached to `ingredient-ref-atlantic-mackerel` | None. | The whole-thawed presentation is a genuine unrepresented form gap. |
| Related active references | Atlantic, canned, Indian, Japanese Spanish, narrow-barred Spanish, Pacific, short, smoked, and spotted Spanish mackerel; gooseberry / `groseille à maquereau` also matches French `maquereau` as a phrase. | Keep all species/product identities separate. Do not move whole/thawed retail wording to canned or smoked mackerel. |
| `Previously Frozen Whole Mackerel`; `Maquereau entier décongelé`; SKU `247218`; proposed `ingredient-form-atlantic-mackerel-whole-thawed` | No active reference/form or legacy candidate owns these exact phrases or the proposed form ID. Exact searches of the ledger, WP04 proposals/batches, workflow, plan, and roadmap found no prior SKU or focused whole-thawed form review. | Candidate ID and the `WP04-SECTIONP-ATLANTIC-MACKEREL-WHOLE-THAWED-R668-20261018-` source-ID prefix are unallocated. No new shared ID or ledger record is proposed. |
| Earlier mackerel decisions | R167 smoked product, R176 canned product, R304 French alias, and R311 Indian-mackerel identity. | Reuse their established boundaries only; none decides this raw whole-thawed SKU or form. |

Exact URL ownership was also checked. The CFIA query, OQLF GDT entry, and DFO 2024 plan use their existing ledger source IDs listed above. The TERMIUM query, DFO profile/2026 decision, Metro bilingual routes, Victoria Co-op page, and I&S page have no exact URL owner in the shared ledger. All R668 source IDs below are proposal-local; no ledger source entries are added.

## Bilingual naming and alias boundary

Metro's paired pages prove the French and English product titles name the same *S. scombrus* SKU. CFIA, OQLF, TERMIUM, and DFO support attaching that product to the existing species-qualified Atlantic-mackerel reference. They do not make the retailer's shortened product names general species names.

Keep `Atlantic mackerel / maquereau de l’Atlantique` as the displayed identity and preserve R304's existing `maquereau bleu` alias. Do not add `whole mackerel`, `maquereau entier`, `thawed mackerel`, or `maquereau décongelé` as reference aliases. If the item is later modeled, its whole/thawed wording belongs to a form under the existing identity; broad `mackerel / maquereau` ownership stays multi-result.

## Picker projection

The read-only projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, and punctuation; prefer complete word phrases across all results; fall back to substring matching only when no phrase match exists. A form returns its parent reference, and the form hint appears only for a complete form search term. The projection below assumes the Metro titles themselves are the hypothetical form labels; no data was added.

| Query | Current picker | With hypothetical Metro-title form | Effect |
|---|---|---|---|
| `mackerel` | Nine results: Atlantic, canned, Indian, Japanese Spanish, narrow-barred Spanish, Pacific, short, smoked, and spotted Spanish mackerel. | Same nine. | The broad English family query remains multi-result. |
| `maquereau` | Seven results: Atlantic, canned, Indian, Pacific, short, and smoked mackerel, plus gooseberry / `groseille à maquereau`. | Same seven. | The broad French query remains multi-result. |
| `Atlantic mackerel`; `maquereau de l’Atlantique`; `maquereau bleu` | Atlantic mackerel only. | Same. | Existing identity and R304 alias remain unchanged. |
| `whole mackerel` | No result. | Atlantic mackerel only. | The generic whole-fish phrase becomes a single species result even though the query does not name the species. |
| `maquereau entier` | No result. | Atlantic mackerel only. | The unqualified French cut phrase becomes a single species result. |
| `Previously Frozen Whole Mackerel` | No result. | Atlantic mackerel, with the candidate form hint. | Exact retail title becomes selectable, but also exposes the broader `whole mackerel` phrase above. |
| `Maquereau entier décongelé` | No result. | Atlantic mackerel, with the candidate form hint. | Exact Québec title becomes selectable, but also exposes `maquereau entier` above. |
| `décongelé` | Octopus only, through substring fallback against its existing plural `décongelés` form term. | Atlantic mackerel only. | The new singular exact phrase would win phrase-first matching and suppress the existing broader plural substring result. |

A species-qualified label such as `Atlantic mackerel, whole and thawed / maquereau de l’Atlantique, entier et décongelé` would avoid the two generic whole-fish phrase collisions, but would not match either exact Metro title. The French state word would still take precedence over the existing plural octopus substring for a one-word `décongelé` query. Adding the retail titles as match terms has the same collision behavior as using them as labels. The current search model has no phrase-only form alias, so the exact product title cannot be made searchable without the disclosed broad-query changes.

## Bundled recipe demand

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows** and read **753,988 recipe-file bytes**. It searched complete decoded recipe text and ingredient-row values for Atlantic mackerel and `maquereau` names, `maquereau bleu`, *Scomber scombrus*, `whole mackerel`, `Previously Frozen Whole Mackerel`, `maquereau entier`, `maquereau entier décongelé`, and `247218`. It found **zero matching recipe files, zero matching ingredient rows, and zero linked rows**. Corpus fingerprint: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. No recipe supplies a need for this form, quantity, preparation state, or substitution. [R01]

## Measurements, density, and substitutions

- **Package and portion:** Metro's SKU page does not give package mass, fish count, serving amount, or a household measure. Victoria Co-op says fish are size-graded to buyer specifications but does not provide a generic grade-to-mass conversion. Neither source supports a reusable per-fish weight or recipe amount.
- **Biological size:** DFO's species profile gives biological size context (including a maximum reported mass of about 800 g). That is not a package size, edible yield, serving, or measure for a whole-thawed grocery item; do not transfer it to the catalog.
- **Density and unit mappings:** No reviewed source provides volume, density in g/ml, or a reusable unit mapping. No value is proposed. Keep existing reference density `null` and mappings empty.
- **Conversions and yield:** No reviewed source pairs a raw amount with a cooked, thawed, drained, or edible amount. Add no thawing conversion, cooking yield, skin/bone adjustment, or package conversion.
- **Substitution:** The active global and contextual substitution-rule files are empty; the Atlantic-mackerel ledger record has zero findings and remains `not_yet_researched`. The candidate sources and recipe corpus provide no dish-, role-, method-, direction-, or quantity-scoped replacement. Add no global or contextual substitution, warning, or recipe-line link, and do not infer interchangeability with another mackerel species or fish.

## Bounded recommendation

**Hold only the whole-thawed form candidate** outside active references, forms, legacy mappings, and the shared ledger. Preserve the verified `ingredient-ref-atlantic-mackerel` identity and its existing alias. Do not add a reference, form, search alias, measurement observation, density, mapping, conversion, yield, recipe link, or substitution.

The product and taxon are sufficiently identified; the hold is limited to form activation. The exact Metro SKU is currently out of stock, the other Canadian whole-fish evidence is wholesale and conditional on seasonal landings, the Québec supplier page does not identify a binomial or thawed product, and the bundled corpus has no demand. More decisively for picker scope, the exact bilingual consumer labels make generic `whole mackerel` and `maquereau entier` queries resolve to Atlantic mackerel alone. Revisit if an in-stock Québec listing or recipe/import creates demand and the picker can retain the broad whole-fish search scope.

No JSON proposal snippet is warranted for a held form. No app, unit, instrumentation, build, emulator, or deployment tests were run; this was a documentation-only review.

## Static checks and hold decision

The read-only review confirmed that the proposed form ID and source-ID prefix are unused; the proposed phrases have no active or legacy owner; the shared mackerel reference is verified with no attached forms; the in-memory phrase-first projection has the results above; and the manifest scan found no recipe demand. These are static catalog checks, not software tests.

If this form is reopened for integration, accept it only after confirming all of the following against the then-current snapshot:

1. The Metro pages still identify the same bilingual SKU and *S. scombrus*, with current Québec availability documented separately from out-of-stock or wholesale evidence.
2. The candidate form ID is unique and remains attached only to `ingredient-ref-atlantic-mackerel`; no broad `whole mackerel / maquereau entier` alias or search term is introduced without an explicit multi-species picker disposition.
3. Static picker projection rechecks exact form labels, broad mackerel terms, generic whole-fish terms, and the singular/plural French thawed-term interaction above.
4. The complete manifest recipe corpus is rescanned for the exact item and species/form wording before adding a recipe link or numeric/substitution behavior.
5. Any later measurement, density, mapping, conversion, yield, or substitution has direct source and recipe support; SKU/package or biological size facts are not promoted to reusable behavior.
6. Any later shared-ledger source IDs and source URLs are audited for unique ownership, and the bundled package remains UTF-8 without BOM or mojibake.

## Source register

Sources were checked on 2026-10-18. Proposal-local IDs are provenance labels only; reused shared IDs are named explicitly.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **Reused `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S06`** | CFIA, [Fish List results for `Mackerel`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?c=&lang=e&q=Mackerel) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Existing shared source on multiple mackerel identities. Shows Canadian acceptable common names against taxa; the broad query demonstrates that mackerel wording is not unique to *S. scombrus*. |
| **Reused `WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S05`** | OQLF, [GDT: `maquereau`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3297732/maquereau). | Existing ledger source attached to canned mackerel; reused only for the French term, English equivalent, and *S. scombrus* terminology. It does not decide this form. |
| **WP04-SECTIONP-ATLANTIC-MACKEREL-WHOLE-THAWED-R668-20261018-S01** | TERMIUM Plus, [entry for `maquereau`](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frb&lang=eng&srchtxt=MAQUEREAU). | Supports the qualified commercial English name and warns against treating bare `mackerel / maquereau` as species-exclusive. The source is terminology evidence, not retail availability. |
| **WP04-SECTIONP-ATLANTIC-MACKEREL-WHOLE-THAWED-R668-20261018-S02** | Metro Québec, [Maquereau entier décongelé, product 247218](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-entiers/maquereau-entier-decongele/p/247218). | Current indexed Québec retail route gives the title, SKU, binomial, North Atlantic provenance, and wild/purse-seine method; it reports out of stock at the selected store and gives no reusable amount. |
| **WP04-SECTIONP-ATLANTIC-MACKEREL-WHOLE-THAWED-R668-20261018-S03** | Metro, [Previously Frozen Whole Mackerel, product 247218](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/whole-fish/previously-frozen-whole-mackerel/p/247218). | English route for the same product as S02, not an independent second SKU. It reports the same binomial and out-of-stock status; product details may vary by store/date. |
| **WP04-SECTIONP-ATLANTIC-MACKEREL-WHOLE-THAWED-R668-20261018-S04** | DFO, [Atlantic mackerel decision, NAFO subareas 3 and 4 (2026)](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-38-fra.html). | Current annual management decision: commercial fishery remains closed while recreational and food/social/ceremonial fisheries are open. It does not address imported products or the source of Metro's SKU. |
| **WP04-SECTIONP-ATLANTIC-MACKEREL-WHOLE-THAWED-R668-20261018-S05** | Victoria Co-operative Fisheries, [wild Atlantic mackerel](https://vcfish.com/products/mackerel/). | Canadian Nova Scotia supplier identifies *S. scombrus* and whole-frozen product for food markets. Availability is seasonal and current landings require confirmation; wholesale evidence only. |
| **WP04-SECTIONP-ATLANTIC-MACKEREL-WHOLE-THAWED-R668-20261018-S06** | I&S Seafood, [Lower North Shore seafood page](https://www.insseafood.com/). | Québec supplier page gives general Atlantic-mackerel season and local-sales context, but no binomial, specific SKU, or product state; not proof of current 2026 commercial availability. |
| **WP04-SECTIONP-ATLANTIC-MACKEREL-WHOLE-THAWED-R668-20261018-S07** | DFO, [Maquereau (*Scomber scombrus* L.) species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/atl-mackerel-maquereau-fra.html). | Supports species identity and Canadian/Québec distribution; its biological size data and historical landings do not establish a kitchen measure, package amount, or current retail supply. |
| **Reused `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S09`** | DFO, [2024 Atlantic mackerel recovery plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/mackerel-atl-maquereau/mac-atl-maq-2024-fra.html). | Existing shared source on the active Atlantic identity; reused for the species-qualified French name, not as product-form or current-supply evidence. |
| **WP04-SECTIONP-ATLANTIC-MACKEREL-WHOLE-THAWED-R668-20261018-R01** | Read-only audit of Section P, active [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), proposal/batch archive, [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), recipe files, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Exact ownership/source-ID review, static picker projection, and full manifest-corpus scan. Repository evidence only; this proposal-local audit ID is not a ledger source. |
