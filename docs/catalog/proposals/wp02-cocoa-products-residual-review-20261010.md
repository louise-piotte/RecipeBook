# WP02 Section D — cocoa product residual review

- **Reviewed:** 2026-10-10
- **Status:** Coordinator proposal; no catalog, ledger, legacy, recipe, plan, roadmap, code, or test files were changed.
- **Scope:** Natural, Dutch-process/alkalized, and black cocoa powder identity boundaries; recheck the already integrated cocoa mass/liquor, cocoa butter, couverture chocolate, and compound coating decisions. Record exact bundled recipe demand and measurement/substitution limits.
- **Plan state:** Section D remains open. This review addresses its unresolved cocoa powder line and confirms that the earlier cocoa mass/butter/couverture/compound decisions do not need duplicate references.

## Repository snapshot

The current split bundled package has **821 ingredient references**, **40 ingredient forms**, and **114 recipe files / 1,123 ingredient rows**. The research ledger contains **1,054 records, 2,294 source entries, and 1,844 distinct source IDs**; the legacy identity file has **81 candidates**.

Current cocoa/chocolate references relevant to this review:

| Active reference | Current bilingual name and aliases | Current catalog evidence state |
| --- | --- | --- |
| `ingredient-ref-unsweetened-cocoa-powder` | EN `unsweetened cocoa powder`; FR `cacao non sucré`; EN aliases `cocoa powder`, `natural cocoa powder`; FR aliases `poudre de cacao`, `poudre de cacao non sucrée` | No density or unit mappings; ledger measurement state `blocked_pending_evidence`; identity remains unreviewed. |
| `ingredient-ref-dutch-process-cocoa-powder` | EN `dutch-process cocoa powder`; FR `cacao traité à la hollandaise`; FR aliases `cacao hollandais`, `poudre de cacao hollandaise` | No density or unit mappings; ledger measurement state `blocked_pending_evidence`; identity remains unreviewed. |
| `ingredient-ref-unsweetened-chocolate` | EN `unsweetened chocolate`; FR `chocolat non sucré`; EN aliases include `cocoa mass`, `cacao mass`, `cocoa liquor`, `chocolate liquor`, `cocoa/chocolate liquor`, `cocoa paste`; FR aliases include `pâte de cacao`, `cacao en pâte`, `masse de cacao`, `cacao en masse` | Identity verified; no density or unit mappings; measurement remains blocked. This is the accepted cocoa-mass/liquor class. |
| `ingredient-ref-cocoa-butter` | EN `cocoa butter`; FR `beurre de cacao`; EN alias `cacao butter` | Identity verified; no density or unit mappings; ledger says research found no supported measurement or substitute. |
| `ingredient-ref-couverture-chocolate` | EN `couverture chocolate`; FR `chocolat de couverture` | Identity verified; no density or unit mappings; ledger says research found no supported measurement or substitute. |
| `ingredient-ref-compound-coating` | EN `compound coating`; FR `enrobage composé` | Identity verified; no density or unit mappings; ledger says research found no supported measurement or substitute. |

There are no cocoa-powder ingredient forms. The six relevant chocolate forms remain the chips forms for semisweet, white, dark, and milk chocolate and the melted forms for semisweet and white chocolate; this proposal adds no cocoa or chocolate form.

The accepted dispositions for cocoa butter, cocoa mass/liquor, couverture, and compound coating are recorded in [`wp02-chocolate-product-boundaries-review-20261009.md`](wp02-chocolate-product-boundaries-review-20261009.md). WP07’s cocoa/chocolate portion review is in [`wp07-cocoa-chocolate-portion-evidence-review-20261010.md`](wp07-cocoa-chocolate-portion-evidence-review-20261010.md). This residual review does not duplicate or reverse those decisions.

## Cocoa powder identity boundaries

### Natural, Dutch-process, and black cocoa

The product boundaries are materially different for recipe matching:

| Product | Evidence-based boundary | Proposed catalog treatment |
| --- | --- | --- |
| **Natural cocoa powder** | Cocoa powder made without an alkalizing process. A current Canadian French product page calls it `cacao en poudre naturel`, describes retained natural acidity, and recommends it particularly for recipes using baking soda. | Keep the existing unsweetened cocoa reference as the natural-powder target, but consider changing its display names to EN `natural cocoa powder` / fr-CA `cacao en poudre naturel`. Preserve explicit `natural` terms. Treat the current `unsweetened` wording as a culinary synonym, not as proof of process for every product. |
| **Dutch-process / alkalized cocoa powder** | Cocoa powder treated with an alkaline agent. Canadian labeling guidance requires the ingredient list to indicate whether cocoa was treated with a permitted alkalizing agent; it allows descriptive terms such as “Dutch” or “processed with alkali.” A Canadian manufacturer’s French pages use `cacao en poudre alcalinisé` and identify the “procédé hollandais.” | Keep the existing Dutch-process reference. Prefer the fr-CA display `cacao en poudre alcalinisé`; retain the English `dutch-process cocoa powder`. Do not add its generic process aliases to black cocoa. |
| **Black cocoa powder** | A highly alkalized black powder is a named product class. Barry Callebaut/Bensdorp describes its black powder as “fat reduced highly dutched,” with pH 7.6–8.2 (“High alkalized”), and a strong roasted flavor. Black powder is therefore within the highly alkalized Dutch-process family, but has a distinctive color/grade and is recipe-named separately. Fat class is product-specific: do not assign one percentage or fat grade to every black cocoa. | Recommend a separate reference candidate `ingredient-ref-black-cocoa-powder`, EN `black cocoa powder`, fr-CA `poudre de cacao noir`. Keep it separate from ordinary Dutch-process cocoa and natural cocoa; do not add a black-cocoa form under ordinary Dutch cocoa. No bundled recipe currently demands it, so no reference or alias is being integrated in this packet. |

Codex CXS 105 classifies cocoa powders by cocoa-butter content (cocoa powder, fat-reduced cocoa powder, and highly fat-reduced cocoa powder), but it does **not** subdivide the powder class into natural, Dutch-process, or black identities. The Canadian standard also separates cocoa powder from low-fat cocoa at a different statutory boundary. These composition classes must not be used to infer a universal fat percentage for black cocoa or to merge process identities. The manufacturing process and named grade are the useful catalog boundaries here; composition qualifiers remain product-specific.

### Candidate names and bounded aliases

Only terms attested in the sources below are listed. “Current alias” means it already exists in the live package; it is not an endorsement of a new alias.

| Target | Candidate EN / fr-CA display | Source-vetted aliases or current terms | Keep out of that target |
| --- | --- | --- | --- |
| Existing natural/unsweetened cocoa powder | EN `natural cocoa powder`; fr-CA `cacao en poudre naturel` | Camino’s Canadian French product uses `cacao en poudre naturel` and `cacao naturel`; its dated FAQ calls natural powder “unsweetened” in its cooking guidance. Current aliases include `natural cocoa powder` and `poudre de cacao non sucrée`. | Do not treat unqualified `cocoa powder` / `poudre de cacao` as proof that a product is natural. Those are generic and currently resolve to the natural/unsweetened row; retain that existing search behavior only as a coordinator decision because recipe 054 uses the bare phrase. Do not infer process from “unsweetened” alone. |
| Existing Dutch-process cocoa powder | EN `dutch-process cocoa powder`; fr-CA candidate `cacao en poudre alcalinisé` | `alkalized cocoa` / `cacao en poudre alcalinisé` are supported by the CFIA terminology and Camino product pages. CFIA explicitly permits Dutch-process wording. Current FR aliases are `cacao hollandais` and `poudre de cacao hollandaise`. | Do not add `black cocoa` as an alias. The OQLF headword `poudre de cacao solubilisée` is defined as alkalized cocoa but specifies a final product that remains slightly acidic; leave it out as a general alias until a product is shown to fit that narrower definition. Avoid unqualified `hollandaise` terms in future additions because the live cocoa name/aliases already cause a search collision with the separate prepared-sauce term. |
| Proposed black cocoa powder | EN `black cocoa powder`; fr-CA `poudre de cacao noir` | `black cocoa` is supported by the manufacturer’s product page. The French product name `poudre de cacao noir Raven` is used by a Canadian distributor for the exact Bensdorp product; this is market-label evidence, not an OQLF preferred term. | Do not alias `dutch-process cocoa powder`, `dutch cocoa`, `cocoa powder`, `dark cocoa powder`, or `alkalized cocoa powder`: those terms can mean products beyond black cocoa and would collide with existing cocoa references. No additional French alias is proposed. |

The OQLF pages support the existing French terms for `beurre de cacao`, `pâte de cacao`, and `chocolat de couverture`. The OQLF labels `chocolate liquor` as U.S. usage under `pâte de cacao`; the Canadian standard separately groups chocolate liquor with cocoa mass and unsweetened chocolate. Keep those already-reviewed aliases, but do not add `bitter chocolate`, which can be confused with the separate active `bittersweet chocolate` reference.

## Cocoa mass, cocoa butter, couverture, and compound coating

| Product boundary | Current live disposition | Review conclusion |
| --- | --- | --- |
| Cocoa mass / cocoa liquor / chocolate liquor | Existing verified `ingredient-ref-unsweetened-chocolate` with the source-reviewed bilingual mass/liquor/paste aliases above | No new reference. Codex CXS 141 defines cocoa/cacao mass and cocoa/chocolate liquor as one product class and separates cocoa cake after fat removal. CFIA section 4.1.3 groups cocoa liquor, cocoa mass, unsweetened chocolate, bitter chocolate, and chocolate liquor as cocoa-nib disintegration products. Cocoa butter remains distinct from the whole mass. |
| Cocoa butter | Existing verified `ingredient-ref-cocoa-butter` | No new reference or alias. Codex defines it as fat obtained from cocoa beans; OQLF supports fr-CA `beurre de cacao` and EN `cocoa butter` / `cacao butter`. Keep `theobroma oil` out of ordinary ingredient aliases because OQLF marks it as scientific-context terminology. |
| Couverture chocolate | Existing verified `ingredient-ref-couverture-chocolate` | No new reference or variant combinations. Codex CXS 87 defines couverture composition separately from ordinary chocolate, and OQLF supports `chocolat de couverture` / `couverture chocolate`. This product class may have dark, milk, or other styles, but do not manufacture style/percentage combinations without recipe need. |
| Compound coating | Existing verified `ingredient-ref-compound-coating` | No new reference or “compound chocolate” alias. CFIA distinguishes compound coatings by appearance without chocolate composition and says they should not be indicated as “chocolate.” Keep EN `compound coating` / fr-CA `enrobage composé`. Do not use `chocolate coating`, `candy melts`, `melting wafers`, or brand names as aliases without product-composition evidence. |

Couverture and compound coating can both be used as coatings, but use-role does not make their composition or handling equivalent. A product-specific no-tempering statement for a compound coating is not an equivalence ratio or a universal recipe substitution. Likewise, manufacturer fluidity guidance for adding cocoa butter to one chocolate is not a cocoa-butter conversion or reciprocal chocolate substitution.

## Exact-key and legacy collision audit

Candidate display and alias terms were compared with active ingredient names/aliases, forms/match terms, and legacy candidates. The current snapshot has no black-cocoa reference or form, and no exact black-cocoa alias collision. `ingredient-ref-black-cocoa-powder` is also unused as a reference ID. The proposed source-ID prefix audit appears below.

| Term or candidate | Current owner / collision | Disposition |
| --- | --- | --- |
| `cocoa powder`, `poudre de cacao` | Existing aliases on `ingredient-ref-unsweetened-cocoa-powder` | Generic process-ambiguous aliases; do not copy to Dutch or black cocoa. Coordinator should decide whether to keep the current natural/default search behavior. |
| `natural cocoa powder`, `cacao en poudre naturel` | Current English natural alias and source-vetted Canadian French candidate | Keep on the natural target; do not reassign to Dutch or black. |
| `dutch-process cocoa powder` | Canonical active English name for `ingredient-ref-dutch-process-cocoa-powder` | Keep separate from natural and black. |
| `cacao traité à la hollandaise`, `cacao hollandais`, `poudre de cacao hollandaise` | Canonical French name and aliases on the Dutch-process cocoa reference; existing `hollandaise` query also matches the Dutch cocoa row in the catalog search behavior recorded by the WP05 sauce review | Prefer `cacao en poudre alcalinisé` as the French display. Do not add more `hollandaise` terms; coordinator should decide whether to retire the current terms as part of a future picker-boundary change. |
| `cocoa mass`, `cocoa liquor`, `chocolate liquor`, `pâte de cacao` | Existing aliases on `ingredient-ref-unsweetened-chocolate` | Keep current source-reviewed aliases; do not create duplicate cocoa mass/liquor references. |
| `cocoa butter`, `couverture chocolate`, `compound coating` | Existing canonical owners are their respective active references | Keep distinct. No collision or duplicate identity proposed. |
| Legacy candidates | Only `butterscotch chips` and `peanut-butter chips` are adjacent Section D legacy candidates; neither overlaps cocoa powders, mass/liquor, butter, couverture, or compound coating | No cocoa candidate to reconcile in the legacy file. |

## Exact bundled recipe demand

All 114 recipe files and 1,123 ingredient rows were checked. This is ingredient-line demand only; descriptive prose does not create an ingredient link.

### Cocoa-powder lines

| Recipe / line ID | Exact source text | Current reference | Boundary result |
| --- | --- | --- | --- |
| Red Velvet Cake with Cream Cheese Frosting — `0bc95db3-300b-4594-88ca-ade36c66cde1-ingredient-3` | `10 g unsweetened natural cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Exact natural-process qualifier; keep linked to the natural target if the existing display is renamed. |
| German Chocolate Cake — `e2d11309-7775-4efb-981c-2c78a8d03da6-ingredient-2` | `3/4 cup (62 g) unsweetened natural cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Exact natural qualifier; structured quantity is 62 g. The source’s parenthetical recipe measure is not a general conversion. |
| Devil’s Food Cake — `4207e09a-429f-437f-b7bd-14e862d6d696-ingredient-6` | `100 g Dutch-process cocoa powder, sifted` | `ingredient-ref-dutch-process-cocoa-powder` | Exact Dutch-process qualifier; keep linked. |
| Brownie Cookie Sandwiches — `c97910fb-2301-40c7-8019-433bb361c44c-ingredient-9` | `25 g Dutch-process cocoa powder, sifted` | `ingredient-ref-dutch-process-cocoa-powder` | Exact Dutch-process qualifier; keep linked. |
| Nanaimo Bars — `9a714acf-d991-4932-bb4c-63af19051022-ingredient-2` | `5 tbsp unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Peanut Butter Brownies — `d73d6bff-fc0c-4b79-a607-441e546d32ad-ingredient-4` | `50 g unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Yule Log — `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-6` | `10 g unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Yule Log — `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-13` | `15 g unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Yule Log — `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-18` | `1/2 tsp unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified; optional dusting. |
| Yule Log — `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-23` | `5 g unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Nutella Hot Chocolate — `dfa44a33-5dff-4304-9308-1d8326055a58-ingredient-3` | `2 tbsp unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Cookie Cake — `ad2f1317-aa4d-4d1e-9aec-0d70a72228af-ingredient-12` | `3 tbsp cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Bare generic name; current `cocoa powder` alias routes here. Do not infer process from this line. |
| Chocolate Truffle Cake — `f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-4` | `1/3 cup unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Chocolate Truffle Cake — `f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-23` | `6 tbsp unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Double Chocolate Muffins — `81d376ac-c305-402f-a73d-8bb721045319-ingredient-8` | `1/3 cup unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Nanaimo Cake — `f3ce6ed8-0389-457c-92ec-240cf53eacde-ingredient-9` | `1/3 cup unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Chocolate Pudding — `d9ce5a86-561d-4c36-975f-5f4249aa9df5-ingredient-1` | `1/3 cup unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |
| Chocolate Syrup — `43dd1f6e-ab29-4365-bfee-a7ecb0d6309b-ingredient-3` | `1/2 cup unsweetened cocoa powder` | `ingredient-ref-unsweetened-cocoa-powder` | Process unspecified. |

There are **18 powder lines**: two explicitly natural, two explicitly Dutch-process, and fourteen process-unqualified (thirteen say “unsweetened”; one says only “cocoa powder”). There is **no black-cocoa ingredient line**. Do not relink or rewrite the existing unqualified recipe lines based on this identity review.

### Cocoa mass and other scoped products

| Recipe / line ID | Exact source text | Current reference / result |
| --- | --- | --- |
| Pinwheel Cookies — `4d4af0ad-f76b-4562-9956-60070fba7802-ingredient-8` | `56 g unsweetened chocolate, chopped` | Linked to `ingredient-ref-unsweetened-chocolate`; this is the existing cocoa-mass/liquor class. |
| French Silk Pie — `ae0f1410-da1e-478b-98a0-67fa6b420576-ingredient-4` | `56 g unsweetened chocolate, finely chopped` | Linked to `ingredient-ref-unsweetened-chocolate`; no separate cocoa-mass reference is needed. |

No ingredient line requests cocoa butter, couverture chocolate, or compound coating. Recipe 006’s French description uses `couverture au chocolat` in the ordinary sense of a chocolate covering layer; its ingredient line names semisweet chocolate. That prose is not demand for the couverture product class. No recipe link is proposed for these products.

## Measurement and substitution evidence

### Measurements

No source supports an app-ready density or universal mass/volume mapping for any of the reviewed cocoa powder classes, cocoa mass/liquor, cocoa butter, couverture, or compound coating. Keep current `defaultDensity` values null, `unitMappings` empty, and form-level `densityGPerMl` absent. No yield, conversion, or recipe amount changes are proposed.

The sources provide distinct portions, not density:

| Evidence | Product scope and limitation |
| --- | --- |
| USDA ARS SR28 (Release 28, 2015): NDB 19165 “Cocoa, dry powder, unsweetened” gives 1 source cup = 86 g and 1 source tbsp = 5.4 g. NDB 19166 “Cocoa, dry powder, unsweetened, processed with alkali” gives the same listed portions. | Keep the NDB foods separate. NDB 19165 does not identify natural/unalkalized processing. Cup capacity and filling method are not stated. Do not convert either portion to g/mL or map either to every natural/Dutch product. |
| Camino product labels: a named natural powder and a named alkalized powder each state 1 tbsp = 5 g on Nutrition Facts. | Exact manufacturer label servings, not measured kitchen scoop procedures; not density or the app’s tbsp conversion. The alkalized product includes 1–3% potassium carbonate; this formula is product-specific. |
| King Arthur Chocolate Milk Bread (updated 2025): 2 tbsp (11 g) black cocoa and 2 tbsp (11 g) Dutch cocoa in the recipe; it says to use all Dutch-process cocoa if black cocoa is unavailable. | Exact recipe-specific masses; the source says the formula was developed by metric weight. This supports a scoped recipe substitution, not a general black-cocoa tbsp mapping or universal black↔Dutch ratio. |
| Product standards and manufacturer packaging list compositional thresholds or commercial pack sizes (for example, Bensdorp’s 25 kg black cocoa bag). | Composition and package mass do not provide kitchen measures or physical density. Cocoa mass’s cocoa-butter proportion and couverture’s cocoa-butter minimum are not conversion factors. |

Existing WP07 source-specific cocoa portions remain in the ledger. In particular, the “Cocoa (unsweetened)” row in the King Arthur Ingredient Weight Chart links to its Dutch/natural/black Triple Cocoa Blend, so its 42 g per half-cup must remain unassigned and unscaled. Recipe source amounts such as the 62 g German Chocolate Cake line remain recipe-specific.

### Substitutions

- **Natural ↔ Dutch-process:** King Arthur’s culinary guidance permits some context-dependent 1:1 ingredient replacements, but the associated leavener may also need adjustment. When replacing Dutch-process with natural cocoa, its tested example says no leavener change for 3 tbsp cocoa or less; above that, it recommends replacing the baking powder with half as much baking soda. When replacing natural with Dutch-process cocoa in a soda-leavened recipe, it recommends replacing the baking soda with twice as much baking powder, with exceptions for recipes that already include both leaveners or include an acid. This is not a standalone cocoa-line conversion: it depends on the recipe’s other ingredients and may change a second ingredient. Do not create a global substitution rule or silently adjust a second ingredient.
- **Black cocoa → Dutch-process:** a King Arthur bread recipe says all Dutch-process cocoa can replace black cocoa in that formula, with lighter color and different flavor. Keep this as recipe-context evidence only; it does not support a general rule for other recipes.
- **Cocoa mass/liquor ↔ cocoa butter or powder:** these are products separated by composition and processing, not interchangeable names or a supported ratio.
- **Couverture ↔ compound coating / ordinary chocolate:** no universal substitution ratio is supported. CFIA’s composition/name distinction and manufacturer handling guidance do not establish ingredient equivalence.
- **Cocoa butter added to chocolate:** product-specific fluidity guidance is not a reciprocal or general substitution rule.

The ledger’s existing state for cocoa butter, couverture, and compound coating records no supported substitute. Keep cocoa-powder substitution findings advisory and source-scoped; do not activate a `SubstitutionRule` or `ContextualSubstitutionRule` from this proposal.

## Proposed coordinator disposition

1. Keep cocoa powder process identity distinct: natural/unalkalized, ordinary Dutch-process/alkalized, and black/highly alkalized are not aliases for one another.
2. Use a natural display candidate `natural cocoa powder / cacao en poudre naturel` for the existing unsweetened-powder reference, and the Dutch display pair `dutch-process cocoa powder / cacao en poudre alcalinisé` for its existing reference. Treat the current generic `cocoa powder` alias and all 14 process-unqualified recipe lines as an open default-selection decision; do not relink them in this review.
3. Consider a separate identity-only black powder reference named `black cocoa powder / poudre de cacao noir`, with no form and no default fat percentage. Its aliases should stay narrow; `black cocoa` is the only additional English alias proposed. The exact candidate reference ID is available, but no black line currently needs linking.
4. Preserve the already accepted cocoa mass/liquor aliases on `ingredient-ref-unsweetened-chocolate`; keep cocoa butter, couverture chocolate, and compound coating as their current distinct identities. Add no duplicate rows or names.
5. Leave densities, mappings, measurements, yields, conversions, and substitutions unavailable unless a source supplies an exact product, unit convention, method/basis, and recipe-relevant scope.

## Source-ID collision check

Before assigning this packet’s local source IDs, the prefix `WP02-COCOA-RESIDUAL-20261010-S` was checked against all **1,844** distinct source IDs in the current ledger; no existing IDs use it. The IDs below are new to this packet and do not reuse IDs from the earlier WP02 or WP07 packets.

## Source and query log

Sources were accessed on **2026-10-10** unless a publication/update date is stated. Current live pages without a stated revision date are marked undated. Product claims are limited to the named maker/product; standards and terminology sources are not used as kitchen measurement evidence.

| ID | Source and date | Claim used and limitation |
| --- | --- | --- |
| `WP02-COCOA-RESIDUAL-20261010-S01` | FAO/WHO Codex, [CXS 105-1981: Standard for Cocoa Powders and Dry Mixtures of Cocoa and Sugars](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/es/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B105-1981%252FCXS_105e.pdf), amended 2025; accessed 2026-10-10. | Defines cocoa powder from cocoa cake and distinguishes full/fat-reduced/highly fat-reduced categories by cocoa-butter content. Does not define natural, Dutch-process, or black as separate standard classes. |
| `WP02-COCOA-RESIDUAL-20261010-S02` | CFIA, [Canadian Food Compositional Standards, Volume 4](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), current page; accessed 2026-10-10, §§ 4.0.1, 4.1.3–4.1.5. | Canadian definitions group cocoa liquor/mass/unsweetened chocolate at §4.1.3 and distinguish cocoa powder from low-fat cocoa at §§4.1.4–4.1.5. Canadian fat thresholds differ from Codex CXS 105; do not use either as a black-cocoa default composition. |
| `WP02-COCOA-RESIDUAL-20261010-S03` | CFIA, [Exigences d’étiquetage pour les confiseries, le chocolat et les grignotines](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/confiseries-chocolat-grignotines), current page; accessed 2026-10-10. | Canadian label guidance says ingredient lists must indicate whether cocoa was treated with permitted alkalizing agents; “solubilisé,” “hollandais,” “méthode hollandaise,” and “traité à l’alcali” are permitted descriptive qualifiers. It distinguishes compound coatings from chocolate and says they should not be indicated as chocolate. |
| `WP02-COCOA-RESIDUAL-20261010-S04` | Camino, [La différence entre le cacao en poudre naturel et le cacao en poudre alcalinisé](https://camino.ca/fr/faqs/the-differences-between-camino-natural-cocoa-powder-and-camino-dutch-processed-cocoa-powder/), dated 2023-05-24; accessed 2026-10-10. | Canadian French consumer/product terminology and exact distinction: natural powder is not alkalized; Dutch-process is alkalized and has neutralized acidity. Its baking suggestions are manufacturer guidance, not a universal substitution formula. |
| `WP02-COCOA-RESIDUAL-20261010-S05` | Camino, [Cacao en poudre naturel](https://camino.ca/fr/products/produits-a-cuisiner/cacao-en-poudre/cacao-en-poudre-naturel-pro/), live product page; accessed 2026-10-10. | Supports the fr-CA product name and source-specific 1 tbsp / 5 g nutrition-label serving; not a bulk measuring method or density. |
| `WP02-COCOA-RESIDUAL-20261010-S06` | Camino, [Cacao en poudre alcalinisé](https://camino.ca/fr/products/produits-a-cuisiner/cacao-en-poudre/cacao-en-poudre-alcalinise/), live product page; accessed 2026-10-10. | Supports fr-CA product wording and a named formula using 1–3% potassium carbonate; 1 tbsp / 5 g is a Nutrition Facts serving only, not an app conversion. |
| `WP02-COCOA-RESIDUAL-20261010-S07` | Barry Callebaut / Bensdorp, [Black Cocoa Powder, SKU 100703-Y99](https://www.barry-callebaut.com/en/manufacturers/products/bensdorp-black%20cocoa%20powder/100703-Y99), live manufacturer page; accessed 2026-10-10. | Calls the product fat-reduced and highly dutched, identifies intense black color, pH 7.6–8.2/high alkalization, and lists a 25 kg bag. These properties are for this SKU; pack size is not a kitchen measure. |
| `WP02-COCOA-RESIDUAL-20261010-S08` | OQLF, [poudre de cacao solubilisée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17042752/poudre-de-cacao-solubilisee), updated 1985; accessed 2026-10-10. | Preferred term is `poudre de cacao solubilisée`, English `alkalized cocoa`; its definition requires treated cocoa paste and a final product that remains slightly acidic. Do not apply it automatically to highly alkalized black cocoa. |
| `WP02-COCOA-RESIDUAL-20261010-S09` | OQLF, [beurre de cacao](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26505321/beurre-de-cacao), updated 2010; accessed 2026-10-10. | Supports the current French display, English `cocoa butter` / `cacao butter`, and keeping `theobroma oil` out of ordinary ingredient aliases. |
| `WP02-COCOA-RESIDUAL-20261010-S10` | OQLF, [pâte de cacao](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8399626/pate-de-cacao), updated 1994; accessed 2026-10-10. | Supports `pâte de cacao`, `cacao en pâte`, `masse de cacao`, `cacao en masse` and English `cocoa mass`, `cacao mass`; marks `chocolate liquor` and `chocolate` as U.S. usage. |
| `WP02-COCOA-RESIDUAL-20261010-S11` | FAO/WHO Codex, [CXS 141-1983: Cocoa (Cacao) Mass (Cocoa/Chocolate Liquor) and Cocoa Cake](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/es/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B141-1983%252FCXS_141e.pdf), current standard listed 2025; accessed 2026-10-10. | Defines cocoa/cacao mass and cocoa/chocolate liquor as the same product class and cocoa cake as product after partial or complete fat removal; reports product composition, not household measurement. |
| `WP02-COCOA-RESIDUAL-20261010-S12` | FAO/WHO Codex, [CXS 86-1981: Standard for Cocoa Butter](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ro/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B86-1981%252FCXS_086e.pdf), current standard listed 2026; accessed 2026-10-10. | Defines cocoa butter as fat obtained from cocoa beans; quality criteria do not establish a kitchen measure or replacement ratio. |
| `WP02-COCOA-RESIDUAL-20261010-S13` | OQLF, [chocolat de couverture](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8420752/chocolat-de-couverture), updated 2016; accessed 2026-10-10. | Supports preferred fr-CA `chocolat de couverture` and EN `couverture chocolate`; describes a defined cocoa-butter/high-fluidity product class. |
| `WP02-COCOA-RESIDUAL-20261010-S14` | FAO/WHO Codex, [CXS 87-1981: Standard for Chocolate and Chocolate Products](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+87-1981%2FCXS_087e.pdf), current standard listed 2025; accessed 2026-10-10. | Defines couverture and its composition thresholds, including minimum cocoa butter, separately from other chocolate classes; does not establish app substitutions. |
| `WP02-COCOA-RESIDUAL-20261010-S15` | Fun Foods Canada, [Poudre de cacao noir Raven (10–12 %) — Bensdorp by Barry Callebaut](https://funfoods.ca/fr/collections/chocolate-ingredients-coverture-chocolate-pure-chocolate-compound-chocolate-cocoa-powders-and-chocolate-inclusions-for-chocolate-professionals-in-canada/products/raven-black-cocoa-powder-10-12-dcp-10j081-bensdorp-by-barry-callebaut-canadian-distribution), live Canadian distributor listing; accessed 2026-10-10. | Language evidence for `poudre de cacao noir` on the exact Bensdorp Raven product; secondary Canadian retail terminology, not an OQLF preferred term. Its stated pH/composition are treated as SKU-specific. |
| `WP02-COCOA-RESIDUAL-20261010-S16` | USDA ARS, [Standard Reference Release 28, Food Group 19](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg19.pdf), Release 28 (2015); accessed 2026-10-10. | NDB 19165 and 19166 common measures: 1 cup = 86 g and 1 tbsp = 5.4 g each. NDB 19165 does not state cocoa processing; neither row states cup volume or fill method. Keep source foods distinct and all portions inactive. |
| `WP02-COCOA-RESIDUAL-20261010-S17` | King Arthur Baking, [Dutch-process vs. natural cocoa](https://www.kingarthurbaking.com/blog/2020/07/15/dutch-process-vs-natural-cocoa), dated 2020-07-15; accessed 2026-10-10. | Culinary guidance explains leavening-dependent outcomes and gives direction-specific soda/powder adjustments. These adjustments change another recipe ingredient, so they do not form a standalone global cocoa conversion. |
| `WP02-COCOA-RESIDUAL-20261010-S18` | King Arthur Baking, [Types of cocoa, explained](https://www.kingarthurbaking.com/blog/2022/10/20/types-of-cocoa-explained), dated 2022-10-20; accessed 2026-10-10. | Treats natural, Dutch, and black as distinct usable types and describes leavener context. It is culinary guidance, not a compositional standard. |
| `WP02-COCOA-RESIDUAL-20261010-S19` | King Arthur Baking, [Black Cocoa](https://shop.kingarthurbaking.com/items/black-cocoa), live manufacturer product page; accessed 2026-10-10. | Calls black cocoa ultra-Dutch processed and recommends using it sparingly with Dutch-process cocoa. This is named-product handling guidance, not a ratio. |
| `WP02-COCOA-RESIDUAL-20261010-S20` | King Arthur Baking, [Chocolate Milk Bread](https://www.kingarthurbaking.com/recipes/chocolate-milk-bread-recipe), updated 2025-03-28; accessed 2026-10-10. | Lists 2 tbsp / 11 g each black and Dutch cocoa, says recipe developed by metric weight, and permits all Dutch cocoa if black is unavailable. Preserve as one recipe-specific alternative. |
| `WP02-COCOA-RESIDUAL-20261010-S21` | King Arthur Baking, [Classic Birthday Cake / 2019 Recipe of the Year](https://www.kingarthurbaking.com/blog/2018/12/31/introducing-our-2019-recipe-of-the-year), dated 2018-12-31; accessed 2026-10-10. | Natural-cocoa frosting amount is 1 1/4 cups / 106 g; a lighter frosting option allows 1 cup / 85 g Dutch cocoa. Recipe-specific portions and substitution only; no general powder measure or ratio. |

### Repository references checked

- `AGENTS.md`, `Requirements.md`, and `roadmap.md` were reviewed for catalog, recipe matching, density, and directional-substitution constraints.
- The complete WP02 Section D checklist was reviewed at lines 1230–1260 of `docs/RecipeBook-global-ingredient-catalog-plan.txt`.
- Current references, forms, research ledger, legacy candidates, every bundled recipe ingredient row, and the earlier WP02/WP07 cocoa/chocolate proposals were checked before research and source-ID assignment.
