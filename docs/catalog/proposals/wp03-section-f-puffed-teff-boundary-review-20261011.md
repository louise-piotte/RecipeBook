# WP03 Section F: puffed-teff product-boundary review

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** The Québec French naming hold was recorded in the 2026-10-11 follow-up integration; no active reference was added. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).
- **Scope:** one uncaptured Section F candidate: plain, food-use puffed teff kernels. Review product identity, English/French naming, aliases and search collisions, recipe demand, forms, measurements, conversions, yields, and substitutions.
- **Recommendation:** **hold bilingual catalog integration pending Québec French product evidence.** Current suppliers and manufacturers establish plain puffed teff as a food product, and a Swiss cereal supplier's French-language page labels it `Teff soufflé`. That wording is source-attested French, not a Québec package label or an OQLF-preferred compound. Do not add a reference or invent a Québec label until a local product source confirms the French name for this exact product.
- **Current package snapshot:** 901 ingredient references, 48 forms, 114 manifest-listed recipes with 1,123 ingredient rows, 1,153 research-ledger records including 8 unit conversions, and 77 legacy candidates. The package has 1 unrelated package-yield record and no active global or contextual substitution rules.
- **Fingerprints:** manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; references `37af57605a9998d37cd5533e93fdd27bb81308566e8ab0c320c725925265a8d2`; forms `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e`; ledger `647c65deef7a9f03ae7a46e44b097666ae2477b243c760e2ad4c243a26f2199e`; legacy candidates `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57`.

## Checklist scope and prior coverage

The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1657) keeps “remaining puffed-grain candidates” open. Its integrated examples include puffed rice, wheat, quinoa, millet, and amaranth; later work covers sorghum, buckwheat, spelt, and barley. A repository search of prior proposals, batch notes, the plan, and the current package found no focused puffed-teff decision or exact `puffed teff` / `teff soufflé` reference. This packet addresses puffed teff only.

The active package already separates `ingredient-ref-teff-grain` (`teff` / `teff d'Abyssinie`) from `ingredient-ref-teff-flour` (`teff flour` / `farine de teff`). Neither describes the puffed product. The current catalog has separate identity rows for other single-grain puffed products, which supports treating puffing as a processed-product identity if and when a bilingual row is justified; it is not a dry/cooked state form of raw teff.

## Product and naming evidence

The product boundary is supported by direct supplier and manufacturer evidence. Tradin Organic lists teff as available whole, flour, or puffed and describes puffed teff as an ingredient for breakfast cereals and cereal bars. KENTAUR's French product page has the heading `Teff soufflé` and describes teff kernels preheated and saturated with steam under pressure before expansion. Baktotaal's product listing names `Teff Pops`, states that its product is 100% teff, and says the grains are popped and ready to eat. These sources establish a real human-food product made from teff kernels.

They do not establish a Québec French product name. The exact French wording `Teff soufflé` is from a Swiss supplier's French-language page. The current OQLF entry is for the base cereal term `tef`; its note marks the term non-current and the spelling recommended, and it lists English `teff`. The active Canadian Food Inspection Agency French crop list uses `Teff d'Abyssinie`, matching the existing reference, but it does not name a puffed food product. Targeted searches for a current Québec retail, manufacturer, or distributor page pairing puffed teff with a French name did not surface one. Accordingly, preserve the French source term as evidence, but do not present it as Québec usage or activate it as the catalog's `fr-CA` display.

| Candidate field or wording | Review disposition | Evidence boundary |
|---|---|---|
| Food-use puffed teff kernels | Product identity confirmed; catalog integration held. | Supplier and manufacturer pages describe a separate ready-to-eat or cereal-ingredient product made from teff. Hold is about a Québec French display, not whether the product exists. |
| `puffed teff` | Exact English product wording; candidate display if reopened. | Used by current suppliers/manufacturers. Keep qualified; do not alias bare `teff` or `teff grain` to it. |
| `teff soufflé` | Exact French product wording in KENTAUR's French-language supplier page; **not approved as a Québec display yet**. | The source is direct product/process evidence but is Swiss, not a Québec product label. No OQLF record for the compound was found. |
| `popped teff` | Source-attested English candidate alias only. | White-Star's product range labels a puffed product “Popped Teff.” Do not infer a single universal popping process from that wording. |
| `teff pops` | Source-attested English candidate alias only. | Baktotaal lists “Teff Pops”; Teffvolkoren's FAQ also uses the term for a crunchy topping. Do not add generic `pops` by itself. |
| `tef soufflé` | Do not add. | OQLF's `tef` entry does not define this product compound, and the French product source uses `teff`. Keep the already-reviewed spelling question separate from this processed product. |
| `teff puffs`, `puffed teff cereal`, `graines de teff soufflées`, and `céréales de teff soufflées` | Do not add as aliases. | These exact labels were not established in the reviewed product or Québec sources; some could also retrieve formulated breakfast cereal. |
| `Teff Crispies` / teff crisps | Exclude from this identity. | White-Star describes its Crispies as extrudates made from light teff flour, with color/flavour tailored by added ingredients. That is not the whole-kernel puff product. |
| Teff flakes, flour, raw grain, mixes, bars, coated or seasoned puffs | Keep separate. | Sources distinguish these forms/products or formulations. Do not broaden one to another by shared teff content. |

The candidate stable ID `ingredient-ref-puffed-teff` is unused in active references, forms, the ledger, and legacy candidates. Because the bilingual row is held, do not allocate the ID or add either candidate alias yet. If Québec evidence later supports the wording, review the proposed row as `puffed teff / teff soufflé`, category `GRAIN_AND_CEREAL`, null `defaultDensity`, and empty `unitMappings`; this table is not authorization to integrate it now.

## Live catalog, collision, and recipe audit

Exact key checks used the repository's `normalize_search_key` behavior across reference displays/aliases, form labels/match terms, ledger record strings and conversions, and legacy candidate strings. The candidate query set included `puffed teff`, `puffed tef`, `popped teff`, `teff pops`, `teff puff(s)`, `teff soufflé` / `teff souffle`, `teff crispies`, `teff cereal`, and the proposed ID.

| Search scope | Finding |
|---|---|
| Active references | Existing teff rows are only `ingredient-ref-teff-grain` and `ingredient-ref-teff-flour`. Neither has a puffed name or alias. |
| Forms | 48 active forms; none names teff or a teff-puff product. |
| Exact normalized collisions | Zero for candidate product names, candidate English aliases, French candidate wording, or `ingredient-ref-puffed-teff` across active reference names/aliases, form labels/match terms, ledger strings, and legacy candidates. The exact base phrase `teff d'Abyssinie` correctly matches the existing raw-grain display and is not a collision with the candidate product name. |
| Nearby ledger and legacy entries | The ledger contains existing teff-grain and teff-flour references; it contains no puffed-teff identity, form, or conversion. No teff candidate is present among 77 legacy candidates. |
| Recipes | Zero candidate-name hits and zero broad `teff` hits among all 114 manifest-listed files and 1,123 ingredient rows. No recipe demand, form-state link, or quantity relation is supported. |
| Numeric/substitution records | No teff-specific unit conversion or package yield. The eight ledger unit conversions do not refer to puffed teff. No global or contextual substitution rules are active. |

Broad searches for `teff` already reach raw teff and teff flour, and would reach a third product if the candidate is integrated. Keep the full `puffed teff` / `teff soufflé` wording qualified. This snapshot audit is not a live picker-ranking test or an exhaustive survey of Québec stores; the local-language search result is a gap in the evidence reviewed, not proof that no Québec listing exists.

## Forms, measures, conversions, yields, and substitutions

- **Identity and forms:** hold a new bilingual identity pending the Québec French product-name check. If later accepted, add no `IngredientForm`; the puffed product is a distinct processed-grain identity, not a dry/cooked state of raw teff.
- **Measures and density:** add no household measure, default density, unit mapping, or serving-mass conversion. Baktotaal's 140 g package and nutrition per 100 g belong to its specific retail item; neither establishes a household volume or transferable product value.
- **Conversions and yields:** add no raw-to-puffed factor, expansion ratio, cooking yield, puffing yield, or package yield. The reviewed sources give no general input/output quantity relation.
- **Substitutions:** add no global or contextual substitution. Similar cereal, topping, or bar uses do not establish replacement quantity or performance equivalence with other puffed grains or formulated cereal products.
- **Recipe links:** add none. The bundled recipes have no teff or puffed-teff line.
- **Nutrition and storage:** add no nutrition, moisture, shelf-life, or storage defaults. Supplier-specific claims or package panels do not transfer to a generic identity.

## Proposal-local source register

Sources were accessed or checked on 2026-10-11. IDs are local to this proposal and were not added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-PTEFF-20261011-S01` | KENTAUR AG, Switzerland, [Céréales soufflées (French)](https://www.kentaur.ch/fr/produits/cereales-soufflees), section “Teff soufflé”; English [Puffed cereals](https://www.kentaur.ch/en/products/puffed-cereals/), section “Puffed teff.” | Direct supplier product naming in French and English. The French page says teff kernels are preheated, steam-saturated under pressure, then expanded. Supports a puffed-kernel product and the exact French source phrase; does not establish Québec market wording or a universal process. |
| `WP03-PTEFF-20261011-S02` | Tradin Organic, supplier, [Organic teff](https://www.tradinorganic.com/organic-products/all/organic-teff). | Current portfolio lists teff as whole grain, flour, or puffed and describes puffed teff as an ingredient in cereal bars and breakfast cereals. Supports a distinct food-ingredient product; B2B portfolio wording does not establish composition, processing method, Québec naming, or a household measure. |
| `WP03-PTEFF-20261011-S03` | White-Star GmbH, [Teff product range](https://www.white-star.de/wse/teff/teff_productrange.php), “Popped Teff” and “Teff Crispies.” | Manufacturer/product-range page uses the exact label “Popped Teff” and separately says Teff Crispies are produced from light teff flour and may include added food ingredients. Supports the English alias and the whole-kernel versus flour-extrudate boundary; it does not supply a Québec label or a universal product specification. |
| `WP03-PTEFF-20261011-S04` | Baktotaal, wholesale retailer, [Teff Pops 140 grams](https://business.baktotaal.com/teff-pops-140-grams). | Product listing says the grains are 100% teff, popped, ready to eat, and suitable for yoghurt/quark, muesli, salad, and other uses. Supports the exact commercial wording and human-food use. The 140 g is a SKU package quantity and its nutrition panel is product-specific; neither is used as a generic measure or density. This is not Québec-market evidence. |
| `WP03-PTEFF-20261011-S05` | Office québécois de la langue française, [tef (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef). | The entry defines the cereal term, marks `tef` as “Non courant” and “Orthographe recommandée,” and gives English `teff`. It does not define a puffed-food compound or establish the name used on Québec products. |
| `WP03-PTEFF-20261011-S06` | Canadian Food Inspection Agency, [Liste de grains et grandes cultures (French)](https://inspection.canada.ca/fr/protection-vegetaux/grains-grandes-cultures/liste-grains-grandes-cultures), “Céréales,” line for *Eragrostis* (= *Poa*) abyssinica. | Official Canadian list uses `Teff d'Abyssinie`, the French display of the existing raw-grain reference. It establishes the base crop name and cereal placement, not the name of a puffed product. |
| `WP03-PTEFF-20261011-S07` | Canadian Food Inspection Agency, [Cereal and bakery product labelling and composition requirements (French)](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/cereales-produits-boulangerie), “Allégations concernant les grains entiers pour les produits céréaliers.” | Current guidance distinguishes processed cereal products and uses the umbrella phrase `céréales soufflées`. Supports the general prepared-cereal context, not a specific teff product name or Québec retail label. |

## Review disposition

Keep puffed teff as an **open Section F candidate with catalog integration held**. The identity as a puffed teff food ingredient is supported, and `puffed teff`, `popped teff`, `teff pops`, and French-source `teff soufflé` are documented in commercial sources. However, no reviewed Québec product source establishes the French name for the plain puffed-kernel product, and OQLF's base-term entry does not resolve that processed-product phrase. Reopen when a Québec manufacturer, distributor, or retailer directly labels this plain product in French, or when Québec terminology guidance settles the compound. Until then, add no reference, alias, form, numeric value, conversion, yield, recipe link, or substitution.
