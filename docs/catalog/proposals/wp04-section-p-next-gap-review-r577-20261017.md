# WP04 Section P R577 — Atlantic salmon steak picker-boundary review

- **Review date:** 2026-10-17.
- **Status:** Integrated as a bounded picker-boundary hold on 2026-10-17; no catalog or ledger data changed.
- **Packet type:** proposal-only existing-species cut-form review.
- **Plan anchor:** [Open WP04 Section P finfish item, lines 6380–6381](../../RecipeBook-global-ingredient-catalog-plan.txt#L6389). Keep the broad finfish parent open.
- **Scope:** one possible Atlantic-salmon steak form under the existing `ingredient-ref-atlantic-salmon`; no new species identity, generic salmon group, recipe link, or shared catalog change.
- **Decision:** **Hold the form outside active data.** Current Québec product evidence supports a fresh *Salmo salar* steak and OQLF supports the French cut term `darne de saumon`. With one species-qualified form, however, the current picker would make unqualified `salmon steak` and `darne de saumon` searches return Atlantic salmon alone. The 114 bundled recipes contain no salmon-steak request. Add no form, alias, ledger record, measure, or substitution.

## Prior-work, active ownership, and source-ID audit

The exact open parent remains the plan item “Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.” This proposal takes one distinct cut question under that parent.

- **R526** held salmon collar/kama. It cited OQLF’s `darne de saumon` only to distinguish a transverse steak from a collar; it did not add or review an Atlantic-salmon steak form. R577 does not reopen the collar decision.
- **R268** owns the generic `salmon fillets / filet de saumon` recipe-facing identity and the bundle’s 675 g skinless-fillets line. **R115** added the separate Atlantic-salmon identity. Neither added a steak form.
- **R545, R568, and R571** added Atlantic, Pacific, and Greenland halibut steak forms. Their three halibut results keep broad `halibut steak` / `darne de flétan` searches multi-result; they do not supply salmon forms.
- **R557** held swordfish steak because its label would match the substring `fish steak`. R577 is a separate salmon product. The proposed `Atlantic salmon steak` phrase does not contain `fish steak`, though it creates its own unqualified salmon-cut collision.
- **R560/R565** address Atlantic/Pacific cod loins and Atlantic cod centre cut; **R574** holds the Alaska-pollock frozen fillet form. None is reopened.

The current package has **1,805 ingredient references and 153 forms**. `ingredient-ref-atlantic-salmon` is active as `Atlantic salmon / saumon de l’Atlantique`, with `saumon atlantique` as a French alias, null density, and no forms. Its shared ledger record already owns the Atlantic-salmon identity sources (`WP04-ATLANTIC-SALMON-IDENTITY-R115-20261014-S01` through `-S04`) and records measurement research as `researched_no_supported_value` and substitution research as `researched_no_supported_substitute`. `ingredient-ref-salmon-fillets-without-skin` remains a separate generic product identity. No salmon steak form is active.

The proposed illustrative ID `ingredient-form-atlantic-salmon-steak` is absent from the active forms, shared ledger, and focused prior proposals. Exact Metro product routes for SKU 208205 have no current source entries in the shared ledger. The OQLF cut-term URL was used as proposal-local source `WP04-SECTIONP-SALMON-KAMA-R526-20261017-S07` in R526; reuse that evidence reference rather than allocate a duplicate source ID. R577’s Metro observations below use new proposal-local IDs only. As this is a hold, do not register those IDs or URLs in the shared ledger.

## Bilingual cut and product evidence

| Proposal-local source ID | Source observation | Scope and evidence limit |
|---|---|---|
| `WP04-SECTIONP-ATLANTIC-SALMON-STEAK-R577-20261017-S01` | Metro, [Fresh Atlantic Salmon Steak, product 208205](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/salmon-trout-tuna/fresh-atlantic-salmon-steak/p/208205), retrieved 2026-10-17. The title is “Fresh Atlantic Salmon Steak”; the page identifies *Salmo salar*, Canada, farm-raised/open-environment aquaculture, and `250 g avg.` The selected store’s page state says out of stock. | One fresh retail SKU and a time-/store-specific listing. The average is SKU-specific; it does not establish a standard mass per steak, recipe serving, yield, skin/bone status, or universal Atlantic-salmon form. The product page is not a terminology authority. |
| `WP04-SECTIONP-ATLANTIC-SALMON-STEAK-R577-20261017-S02` | Metro’s [French route for product 208205](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/saumons-truites-et-thons/darne-de-saumon-de-l-atlantique-frais/p/208205), retrieved 2026-10-17. The current indexed French page names “Darne de saumon Atlantique frais,” gives the same product number and `250 g env.` average, and describes Canadian farmed Atlantic salmon. | Paired route for the same SKU as S01, not an independent product or second weight observation. Direct opening redirected to Metro’s English route; the French product title and details are from Metro’s indexed French page capture. The exact product wording does not establish a general display rule for every Atlantic-salmon steak. |
| Reused R526 source | OQLF, [darne de saumon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298295/darne-de-saumon), accessed 2026-10-17; R526 proposal-local source ID `WP04-SECTIONP-SALMON-KAMA-R526-20261017-S07`. OQLF gives `darne de saumon` as the preferred French term, English `salmon steak`, and marks French `steak de saumon` as discouraged. It defines a darne as a slice of a large fish such as salmon or halibut. | Québec terminology evidence for the cut and generic species wording, not proof of a particular fish SKU, species-specific product state, dimensions, or recipe amount. Last updated 1984. Do not add `steak de saumon` as a French display or alias. |
| `WP04-SECTIONP-ATLANTIC-SALMON-STEAK-R577-20261017-S03` | Metro, [Frozen Atlantic Salmon Steaks, product 247827](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-atlantic-salmon-steaks/p/247827), retrieved 2026-10-17. The title says frozen Atlantic salmon steaks, but Metro’s product metadata gives *Oncorhynchus mykiss* (rainbow trout), Chile, farm-raised/open-net pens; the selected store listing says out of stock. | A separate SKU from 208205. The English page’s direct capture is older than the current indexed listing. Treat it as an inconsistent retailer record, not evidence that *O. mykiss* is Atlantic salmon or that the SKU belongs under the Atlantic-salmon reference. Do not use it to support an Atlantic-salmon frozen form or merge its state with S01/S02. |
| `WP04-SECTIONP-ATLANTIC-SALMON-STEAK-R577-20261017-S04` | Metro, [Darnes de saumon de l’Atlantique surgelées, product 247827](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/darnes-de-saumon-de-l-atlantique-surgelees/p/247827), retrieved 2026-10-17. The French route has the paired frozen-salmon-steaks title and same product number; Metro’s product metadata gives *Oncorhynchus mykiss* (rainbow trout), Chile, farm-raised/open-net pens. | French route for the same SKU as S03, not independent evidence for an Atlantic salmon or a second product. The indexed page is time- and store-sensitive. Keep its frozen product state separate from fresh SKU 208205. |

The 208205 pair supports a current retailer-specific bilingual product observation: fresh Atlantic salmon steak / `darne de saumon Atlantique frais`. OQLF supports the Québec cut term and warns against a literal French `steak` construction. The active species display and R115 sources already establish the accepted Atlantic-salmon identity; the retailer’s *Salmo salar* line corroborates SKU scope. Neither the Metro label nor the OQLF definition demonstrates that an unqualified salmon steak search should resolve to Atlantic salmon alone.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes accents and punctuation, returns complete word-phrase matches before substring fallback, searches form labels on their parent reference, and gives a form hint only for an exact form-label query. The hypothetical form has `formCode: steak_cut`, labels `Atlantic salmon steak / darne de saumon de l’Atlantique`, empty English and French match-term arrays, and null density. No such data was added.

| Query | Current projection | With hypothetical form | Picker effect |
|---|---|---|---|
| `Atlantic salmon steak` / `darne de saumon de l’Atlantique` | No result | Atlantic salmon | Qualified phrases would find the existing Atlantic-salmon parent and show the exact form hint only for the full form label. |
| `salmon steak` / `darne de saumon` | No result | Atlantic salmon alone | **Unsafe broad-cut singleton:** OQLF uses `salmon steak` / `darne de saumon` without a species qualifier, but only an Atlantic-salmon steak form is supported here. |
| `darne` | Atlantic, Pacific, and Greenland halibut (3 references) | Those 3 plus Atlantic salmon (4) | Remains multi-result. |
| `steak` | Atlantic, Pacific, and Greenland halibut, Montreal steak spice, steak sauce (5 references) | Those 5 plus Atlantic salmon (6) | Remains multi-result, but does not address the exact generic salmon-cut phrases above. |
| `salmon` / `saumon` | 10 references | Same 10 | Broad salmon searches remain unchanged because a form stays under its parent. |
| `salmon fillets` / `filet de saumon` | Generic salmon-fillets reference | Same generic salmon-fillets reference | Recipe-facing generic fillet ownership remains separate. |
| `fish steak` | No result | No result | Unlike the R557 swordfish display, the proposed phrase does not contain the contiguous substring `fish steak`. |

Because the term source itself is species-neutral and no other salmon-steak form is active, a single Atlantic form would create an Atlantic-only result for common unqualified cut searches. Do not widen the form with generic aliases; that would preserve the same singleton and make the intended species even less clear.

## Bundled demand, amounts, and substitution limits

The manifest-ordered read-only scan parsed all **114 recipe files and 1,123 structured ingredient rows**. Searches for `salmon steak(s)`, `Atlantic salmon steak`, `darne(s) de saumon`, `darne de saumon Atlantique`, and `steak de saumon` found **0 recipe files, 0 ingredient rows, and 0 linked rows**. The corpus fingerprint was `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. The nearby **Recipe 077#10** asks for `675 g salmon fillets without skin, cut into cubes` on the generic `ingredient-ref-salmon-fillets-without-skin`; it neither requests a steak nor identifies salmon species. Preserve that line, amount, and link.

Metro’s approximately **250 g average per item** belongs only to fresh SKU **208205**. It is a retailer average and does not define a standard cut mass, a recipe serving, package yield, or a conversion. The separate **247827** frozen listing has conflicting taxon metadata and no compatible amount to transfer. Add no measure, density, unit mapping, conversion, edible/cooking yield, or quantity assumption.

No reviewed recipe or product source gives a tested replacement amount, role, method, or adjustment for salmon steak versus salmon fillet, another salmon species, another fish steak, or a different fish cut. Add no global or contextual substitution and no recipe-line substitution link.

## Bounded disposition and integration recommendation

Keep the broad Section P finfish parent open and **hold the Atlantic-salmon steak form outside the active catalog and shared ledger**. Add no form, alias, match term, new identity, recipe link, source/decision record, measure, conversion, yield, or substitution. Preserve the existing Atlantic-salmon and generic salmon-fillets ownership unchanged.

If a later request or recipe needs this cut, the narrow candidate delta is one `steak_cut` form under `ingredient-ref-atlantic-salmon`, displayed as `Atlantic salmon steak / darne de saumon de l’Atlantique`, with empty match-term arrays, null density, and no quantitative or substitution data. Reconsider only after the picker can keep unqualified `salmon steak` / `darne de saumon` multi-result or another independently supported salmon-steak identity is available. Treat Metro SKU 208205’s amount as proposal-specific evidence only; do not merge it with SKU 247827 or transfer the frozen listing’s product state.

The proposal creates no database JSON changes; no software tests, app build, emulator, or deployment are needed under the current `AGENTS.md` rule. The [R577 integration README](../batches/wp04-r577-atlantic-salmon-steak-hold-integration-20261017/README.md) records the disposition and static checks.
