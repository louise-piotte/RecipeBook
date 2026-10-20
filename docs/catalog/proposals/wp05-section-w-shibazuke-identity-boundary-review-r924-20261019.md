# WP05 Section W R924 shibazuke identity and Québec French boundary recheck

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only current-state review. No shared catalog, ledger, checklist, roadmap, batch, recipe, code, or test file was edited.
- **Scope:** Generic shibazuke identity and fr-CA naming only. This review does not survey brands, commercial lines, flavours, SKUs, or retailers.
- **Recommendation:** Make no catalog change. `ingredient-ref-shibazuke` is already integrated and source-verified as identity-only, with `shibazuke` as both displays and `shiba-zuke` as its only English spelling alias. Retain that row and hold descriptive French aliases. The broader Section W regional-preserve checklist remains open.

## Current-state audit

The proposed item is not absent. The live seed has 1,944 ingredient references and 204 forms. `ingredient-ref-shibazuke` is a `SAUCE_AND_CONDIMENT` reference with `nameEn` and `nameFr` set to `shibazuke`, English alias `shiba-zuke`, no French aliases, null default density, and no unit mappings. No shibazuke form exists. The canonical ledger has 2,348 records and one verified identity decision for this reference, accepting the same name and spelling boundary. The current legacy-import candidate file has 55 entries and no shibazuke candidate.

The existing [2026-10-16 identity review](wp05-east-asian-shibazuke-preserve-identity-review-20261016.md) and [catalog-gap integration record](../batches/catalog-gap-decisions-integration-20261016/README.md) document this identity's addition. The plan records shibazuke among the 16 integrated identities in that batch; this review does not reopen that accepted decision.

All 114 manifest-listed recipes and 1,123 ingredient rows were searched after accent/punctuation normalization for `shibazuke`, `shiba zuke`, `shiba-zuke`, `nama shiba-zuke`, `shibazuke pickle`, `pickled eggplant`, `pickle d’aubergine`, `aubergine marinée`, and `tsukemono`. There were no ingredient-line or recipe-file matches. No recipe link or recipe-driven numeric evidence exists.

The exact normalized active owner for `shibazuke` and `shiba-zuke` is only `ingredient-ref-shibazuke`. The ingredient search normalizer folds punctuation, so the hyphenated alias normalizes to the two-word key `shiba zuke`; no other active reference owns that phrase. Neither `pickled eggplant` nor `pickle d’aubergine` is an active exact name or alias. Static ownership and search-code review found no exact-key collision; no runtime picker QA was performed for this proposal.

## Identity and language boundary

Japan’s Ministry of Agriculture, Forestry and Fisheries (MAFF) identifies shibazuke as a Kyoto regional pickle made from eggplant, cucumber, myoga, and other vegetables salted with shiso leaves. It distinguishes it from other Kyoto pickles and says recipes vary by region and household. A related MAFF page describes `nama shiba-zuke` as a salt-only, lactic-fermented eggplant/red-perilla style, while also documenting common shiba-zuke preparations with cucumber or myoga. These are preparation and regional variations within the named preserve family, not grounds for added flavor or commercial-variant rows. Keep shibazuke distinct from generic tsukemono/Kyoto pickles and from the separately named senmaizuke, suguki-zuke, takuan, takana-zuke, umeboshi, beni shoga, and generic pickled radish. The vegetable components are not aliases for the preserve. [S01, S02]

No dedicated OQLF entry for shibazuke or a shibazuke-specific French name surfaced in the targeted terminology lookup. A Québec French-language entry in the government food directory uses the borrowed title `Shibazuke - Pickle de aubergine`, but its description is tied to one producer’s product, and the page attributes product data to GS1 and disclaims MAPAQ responsibility for its accuracy. This supports local French use of the borrowed culinary name; it does not establish a universal French translation or ingredient formula. Keep the existing shared display `shibazuke` and do not add `pickle d’aubergine`, `aubergine marinée`, or `aubergine fermentée` as global aliases.

OQLF’s GDT accepts `marinades` and `conserves au vinaigre` for the vinegar-preserved vegetable/fruit condiment class and discourages `pickles`; its `oignon au vinaigre` entry also discourages the hybrid wording `pickle d’oignon`. Those records do not define shibazuke, whose MAFF descriptions include salt fermentation and varied preparations. They reinforce that the single Québec product-directory wording `pickle de aubergine` should not be generalized as a fr-CA identity for the whole family. [S03, S04, S05]

## Measurements and substitutions

MAFF publishes one regional household recipe with vessel-scale amounts and expressly notes that recipes vary. Its ingredient list says “perilla seeds,” while its method says to mix shiso leaves with eggplant; this inconsistency and the recipe's local vessel basis rule it out as transferable measures or a default composition. The Québec directory’s package, nutrition, storage, portion, and product-composition fields describe only its listed product; none is generalized here. Neither source establishes a density, mass-per-volume mapping, or unit conversion. Serving shibazuke with rice or as a snack does not establish an ingredient substitution. Keep the existing reference without forms, measurements, density, unit mappings, recipe links, conversions, yields, or substitutions.

## Decision

Preserve the active identity, English spelling alias, category, and empty measurement/form fields. Keep `shibazuke` as the fr-CA display because the reviewed Québec usage supports the borrowed name while no authoritative generic descriptive equivalent was established. Add no French alias. This resolves no other regional-preserve gap and does not close the broader Section W checklist.

## Sources

Sources were directly reviewed on 2026-10-19. Source IDs below are local to this proposal; the existing MAFF and Québec directory evidence is already recorded in the canonical ledger under the 2026-10-16 shibazuke review.

| ID | Source | Claim and limits |
|---|---|---|
| `WP05-SECTIONW-SHIBAZUKE-R924-20261019-S01` | Japan Ministry of Agriculture, Forestry and Fisheries, [Shibazuke — Our Regional Cuisines](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/1905/index.html). | Names shibazuke as a Kyoto regional pickle, describes vegetables salted with shiso, its customary serving, and household/region variation. Its linked recipe amounts are scoped to one local recipe. |
| `WP05-SECTIONW-SHIBAZUKE-R924-20261019-S02` | Japan Ministry of Agriculture, Forestry and Fisheries, [Kyo Tsukemono — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/kyo_tsukemono.html). | Separates shiba-zuke from other Kyoto pickle identities and describes common and nama shiba-zuke preparations. It does not define a universal formula for all products carrying the name. |
| `WP05-SECTIONW-SHIBAZUKE-R924-20261019-S03` | Office québécois de la langue française, [marinades (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095319/marinades). | Gives Québec French terms for the vinegar-preserved vegetable/fruit condiment class and discourages `pickles`. It does not establish terminology for a salt-fermented regional Japanese preserve. |
| `WP05-SECTIONW-SHIBAZUKE-R924-20261019-S04` | Office québécois de la langue française, [oignon au vinaigre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/21799246/oignon-au-vinaigre). | Accepts `oignon au vinaigre` and `oignon mariné`; says hybrid `pickle d’oignon` does not conform to Québec French sociolinguistic norms. The entry is about onions, not shibazuke. |
| `WP05-SECTIONW-SHIBAZUKE-R924-20261019-S05` | Répertoire des aliments québécois, [Shibazuke — Pickle de aubergine](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202277). | Provides a current Québec French-language product title using `Shibazuke` plus a product-specific descriptor. Its page says the product data come from GS1 and includes a MAPAQ accuracy disclaimer; it is not a standardized term ruling or a generic recipe source. |

**Disposition:** Existing identity verified; no new row, alias, form, data, or recipe link proposed. No software tests were run because this review changes documentation only.
