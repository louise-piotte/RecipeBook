# WP03 Section F: puffed-oats identity and Québec terminology review

- **Review date:** 2026-10-11
- **Work package:** WP03, Section F
- **Scope:** one uncaptured candidate in the plan's open “remaining puffed-grain candidates” item: plain human-food puffed oats. Review identity and product boundaries, exact English/French wording, aliases and search collisions, recipe demand, forms, measurements, conversions, yields, and substitutions.
- **Recommendation:** **hold catalog integration.** Current manufacturers document a distinct food product made from whole oat kernels, but the Québec French evidence is not sufficient to choose a canonical French display for that same product scope. The exact Canadian French phrase `avoine soufflée` appears in a withdrawn federal standard for a different, oat-flour-based shaped cereal; a Québec museum page uses it hypothetically, and a Québec brunch roundup lists the narrower `avoine nue soufflée`. Do not turn those sources into a generic Québec label. Reopen with a current Québec package, manufacturer, or other direct local food-product source that identifies the whole-kernel product in French.

## Checklist and prior coverage

The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1567) leaves “remaining puffed-grain candidates” open. The current package has separate references for puffed wheat, rice, quinoa, millet, amaranth, sorghum, buckwheat, spelt, and barley. Focused proposals or integration notes cover those products, including [puffed buckwheat](wp03-section-f-next-gap-review-20261011-puffed-buckwheat.md), [puffed spelt](wp03-section-f-next-gap-review-20261011-puffed-spelt.md), and [puffed barley](wp03-section-f-next-gap-review-20261011-puffed-barley.md). A search of prior proposals, batch notes, the active plan, references, forms, ledger, legacy identities, and the recipe package found no prior puffed-oats review or exact puffed-oats candidate. This packet addresses only puffed oats; it does not reopen any of those other puffed-grain identities.

## Product and terminology boundary

Current manufacturer pages describe a real human-food product made by expanding whole oat kernels. SchapfenMühle says its puffed oats are made from oat kernels with pressure and steam and retain each kernel's shape; it lists muesli and pet food as uses. Rude Health markets pure “Puffed Oats” and describes each puff as a single whole-grain oat. Favrichon's current French product page names “Avoine complète soufflée,” lists 100% “Avoine soufflée,” and describes hot-air cooking. Those sources support the product concept and source-specific naming, but none establishes a Québec retail label.

The strongest Canadian French terminology record needs careful scope control. The official bilingual Government of Canada standard GCS 32.13-88 calls a cereal class “Oats, Puffed / Avoine soufflée,” but the standard was withdrawn in April 2020. Its definition is a shaped dough made from farinaceous ingredients, at least 75% oat flour, and expanded by gun or oven puffing. That is materially different from the whole-kernel product on current manufacturer pages, so it cannot settle the French name for whole-kernel puffed oats.

Québec evidence also has limits. OQLF's current entry supports the base food term `avoine` but does not list `avoine soufflée`. Ingenium's French educational activity asks hypothetically whether oat can be puffed like popcorn and answers no; this is not a product label or naming recommendation. A 2019 HuffPost Québec brunch roundup reproduces a Montréal-area menu line for “avoine nue soufflée.” That is useful local culinary evidence for a specifically qualified naked-oat item, but it is a secondary menu report, not a current package, and it does not establish an unqualified French label for puffed oats. TERMIUM's `avoine nue` entry refers to naked oat as a plant term; it does not define a puffed food product.

Accordingly, hold both the bilingual row and any French alias. Do not use `avoine soufflée` as the proposed display for a whole-kernel puff identity until current Québec product evidence confirms that mapping. Do not infer the modifier `nue` for all oats. Do not merge whole-kernel puffed oats with shaped, extruded, or flour-based oat cereal, coated products, bars, or animal-feed products.

## Candidate identity and exact-name audit

| Check | Finding and disposition |
|---|---|
| Candidate scope | Plain human-food oat kernels sold in puffed form. Whole-kernel identity is supported by current manufacturers; canonical catalog identity remains on hold pending Québec French product evidence. |
| English wording | `puffed oats` is exact current manufacturer wording. Keep `puffed oat`, `oat puffs`, and `puffed oat cereal` out of aliases for now: no demonstrated Québec picker need, and the last phrase can include formed or extruded cereal pieces. |
| French wording | No canonical Québec French display proposed. `Avoine soufflée` is source-attested in other contexts but not established for this whole-kernel product in current Québec product labeling. `Avoine nue soufflée` is a qualified local menu phrase and must not be broadened into an alias for generic puffed oats. |
| Stable ID | `ingredient-ref-puffed-oats` is not allocated in active references, forms, ledger, or legacy identities. Do not allocate while held. |
| Category and numeric fields | If later accepted, the product belongs in `GRAIN_AND_CEREAL`, with `defaultDensity: null` and `unitMappings: []` until supported evidence exists. No row is proposed now. |
| Adjacent identities | Active oat rows include oat groats, rolled oats, quick oats, instant oats, steel-cut oats, oat bran, oat flour, and oat milk. Existing puffed-grain rows remain separate. None is an exact synonym for puffed oats. |
| Normalized exact-key collisions | Zero for `puffed oats`, `puffed oat`, `oat puffs`, `puffed oat cereal`, `avoine soufflée` (accent-folded variants included), `avoine complète soufflée`, and `avoine nue soufflée` across active reference names/aliases, form labels/match terms, ledger records, and legacy identities. This does not mean broad `oat` or `avoine` searches will be unique. |

## Live package and recipe audit

The audit read the current split seed package, all active forms, the full research ledger and unit-conversion list, all legacy identities, and every manifest-listed recipe ingredient line. Candidate wording and accent-folded variants were checked with the package's `normalize_search_key` function.

| Audit surface | Current snapshot |
|---|---|
| Active package | 899 ingredient references; 48 forms; 114 recipes with 1,123 ingredient rows. The candidate display and aliases are absent. |
| Existing oat references | Oat groats; rolled, quick, instant, and steel-cut oats; oat bran; oat flour; oat milk. Related fields contain no puffed-oat identity. |
| Existing oat forms | The only oat forms found are `oat bran, dry` and `oat bran, cooked`; there is no groat-puff form or oat-puff form. |
| Ledger and unit conversions | 1,145 ledger records and 8 generic unit conversions. No puffed-oats record, product-specific mass/volume observation, or puffing conversion was found. |
| Legacy identities | 77 candidates; no puffed-oats candidate. The existing oat-milk candidate is unrelated. |
| Recipe demand | Zero candidate matches among 114 manifest-listed recipe files and 1,123 ingredient rows. Four nearby oat lines are explicitly rolled or quick oats (recipes 001, 024, 047, and 065); none requests puffed oats. |
| Yields and substitutions | The package has one unrelated package-yield observation. Both substitution-rule arrays are empty. No oat-puff package yield, recipe link, or substitution rule is supported. |

This is an exact-key and bundled-corpus audit, not a live picker-ranking test or an exhaustive retail search. Targeted searches for Québec-facing product wording did not surface a current Québec package or manufacturer label for plain whole-kernel puffed oats. The result is evidence of a local-language gap in this review, not proof that no such product exists.

## Disposition by catalog behavior

- **Identity:** Hold. Current product evidence distinguishes puffed whole oat kernels from raw kernels and flakes, but the Québec French display for that precise product is unresolved. Reopen when a direct local product source bridges the product and French name.
- **Aliases and search:** Add none now. If accepted later, keep exact species-qualified product wording and avoid aliases that could pull in oat-flour cereal, mixed cereal, or generic oats.
- **Forms:** Add none. Puffing is a processed-product identity, not a cooked/dry state of oat groats or oat flakes. Do not attach an oat-bran form to it.
- **Measurements and density:** Add none. The Favrichon manufacturer page gives nutritional panels per 45 g and 100 g for its own product; these are not household volume-to-mass observations and do not establish a transferable density. Do not create a mass-volume mapping from them.
- **Conversions and yields:** Add no raw-to-puffed factor, volume conversion, cooking yield, process yield, or package yield. No transferable input/output ratio or package observation is established.
- **Recipes:** Add no recipe links. The bundled library contains no candidate demand.
- **Substitutions:** Add no global or contextual rule. Shared breakfast uses do not establish quantity or performance equivalence with other puffed grains, oat flakes, or formed oat cereals.

## Source register

| ID | Source | Support and limit |
|---|---|---|
| `WP03-POATS-20261011-S01` | Canadian General Standards Board, [GCS 32.13-88, Cereals, breakfast, prepared, ready-to-eat](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-013-1988.pdf), Type 4, Class A; official [Government of Canada publication record](https://publications.gc.ca/site/eng/9.841373/publication.html). | Bilingual text records `Oats, Puffed / Avoine soufflée` and defines the class as a shaped oat-flour dough product. The official record says withdrawn in April 2020. Historical terminology and product-class evidence only; it does not define current whole-kernel puffs or establish Québec retail wording. |
| `WP03-POATS-20261011-S02` | SchapfenMühle, manufacturer, [Puffed oats](https://schapfenmuehle.de/en/commercial-customers/products/puffed-cereals/puffed-oats). | Current page says the product is made from oat kernels using pressure and steam and each grain retains its shape; lists muesli and pet-food use. Supports a whole-kernel food product, not Québec naming or recipe measures. |
| `WP03-POATS-20261011-S03` | Rude Health, manufacturer, [Puffed Oats](https://rudehealth.com/collections/food-drinks/products/puffed-oat). | Product page calls its puffs single whole-grain oats with no added ingredients. Supports a current plain product and English display; UK product context, not Québec market evidence. |
| `WP03-POATS-20261011-S04` | Favrichon, manufacturer, [Avoine complète soufflée](https://www.favrichon.com/produit/avoine-complete-soufflee/). | Current French product page names the product, states 100% `Avoine* soufflée`, and describes hot-air cooking. French-European product wording, not Québec wording. Its 45 g and 100 g nutrition panels and package channel do not establish cup weight or density. |
| `WP03-POATS-20261011-S05` | Office québécois de la langue française, [avoine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432769/avoine), updated 2019. | Supports the Québec French base noun `avoine` and English `oat`; describes grains being milled or flaked. It does not establish a preferred puffed-oat compound. |
| `WP03-POATS-20261011-S06` | Ingenium, [Défi enfant santé : Les aliments à grains entiers](https://ingenium.ca/fr/apprentissage/zone-des-enseignants/ressources/defi-enfant-sante-les-aliments-a-grains-entiers/). | A French Canadian educational activity uses the phrase `avoine soufflée` in a hypothetical popcorn comparison and answers that the same method does not apply. This is not product labeling or terminology advice; retained as a wording and process limitation only. |
| `WP03-POATS-20261011-S07` | HuffPost Québec, [MTL à Table, votre chance de bruncher pour pas cher](https://quebec937.rssing.com/chan-41077133/all_p613.html), 2019-10-29. | The secondary roundup reproduces a Les Enfants Terribles brunch menu listing `avoine nue soufflée`. This is local culinary evidence for a qualified naked-oat ingredient, not a current standalone product label or a generic puffed-oat equivalent. |
| `WP03-POATS-20261011-S08` | Translation Bureau, TERMIUM Plus, [AVENA DESNUDA / naked oat](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=AVENA+DESNUDA), record dated 2021-06-14. | Gives `avoine nue` for the plant entry `Avena nuda`. It supports the modifier in the local menu phrase but does not define a processed food product or authorize dropping `nue`. |

## Recommendation

Keep puffed oats as an open Section F candidate, with no active reference, form, alias, numeric field, conversion, yield, recipe link, or substitution rule. Reopen the naming decision when current Québec food-product evidence identifies plain whole-kernel puffed oats in French. Preserve the important source distinction: the withdrawn federal `avoine soufflée` cereal was an oat-flour dough product; the current manufacturer examples are puffed kernels; the Québec menu example is specifically naked oat. Do not harmonize those three scopes by assumption.
