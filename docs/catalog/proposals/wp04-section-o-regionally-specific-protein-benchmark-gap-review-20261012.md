# WP04 Proposal: Regionally Specific Protein Benchmark Gap Review

**Review date:** 2026-10-12

**Status:** Review complete; no catalog, recipe, or ledger data change. Root records the gap disposition in the plan and roadmap.
**Scope:** The open WP04 Section O item asking whether the bundled recipe benchmark contains regionally specific, legally sourced proteins beyond mainstream supermarket meats.

## Disposition

Keep the checklist item open. The full current benchmark contains no exact request for wild game or another regionally specific terrestrial meat product. The only uncommon terrestrial meat wording is an optional **ground lamb** choice in the source for recipe `078#3`; the bundled line is still represented as ground beef, and lamb is a conventional livestock product with no geographic or special sourcing claim. That choice does not satisfy the regional-protein objective.

No new catalog identity is recommended under this checklist item. Treat `ground lamb / agneau haché` as an adjacent source-level alternative whose exact key currently has no active owner; do not alias it to ground beef or turn this single recipe choice into a global substitution. The benchmark still needs a source-backed recipe request naming a specific regional or non-mainstream terrestrial protein, with enough product and jurisdiction context to check its Québec terminology and applicable Canadian sourcing or labelling context.

The already integrated rabbit identity and existing dried-meat identities remain unchanged. Their presence in the catalog is not recipe demand, and their earlier scope decisions are not reopened here.

## Scope and audit method

The open item is in Section O, after the sausage-family checks and before the Section P fish and seafood section. This review covers terrestrial animal proteins in the recipe benchmark. Seafood already classified under Section P, plant proteins in Section R, and the settled sausage, rabbit, blood-sausage, and cured-pork boundary reviews are only checked for corpus overlap; their decisions are not revisited.

I parsed all 114 recipe files listed in the bundled manifest: all 1,123 ingredient rows and every string field in each recipe, including source metadata, ingredient names and source wording, preparation and notes, titles, descriptions, instructions, and recipe notes. A broad English/French term pass covered wild and regional mammals, game names, specialty farmed species, and regional meat-product names, followed by inspection of all 18 rows linked to a `PROTEIN` reference and every unlinked row that says only “meat” or “seafood.”

Among the screened regional/game terms, the only food-name hit was “lamb” in recipe 078. The only other hit was “seal” as the verb for closing a sous-vide bag in six recipes; no recipe text refers to seal meat. No recipe row or prose names rabbit, hare, bison, venison/deer, elk, moose, caribou, wild boar, goat, horse, ostrich, emu, or another regional/game species. The unlinked fried-rice line is generic leftover meat or seafood, not a species request.

## Exact recipe findings

| Recipe | Saved line and ownership | Source and interpretation | Disposition |
|---|---|---|---|
| `078#3` — Shepherd’s Pie / Pâté chinois | `originalText`: `1 lb. 90% lean ground beef -or ground lamb`; `ingredientName`: `ground beef`; `ingredientRefId`: `ingredient-ref-ground-beef`. Its English and French recipe notes separately preserve the author’s ground-lamb option. | The linked source page says the author wrote the dish so either ground beef or ground lamb can be used, and presents ground lamb as the traditional Shepherd’s Pie choice. The claim is source-level recipe guidance, not evidence that the meat is Québec-raised or otherwise regionally sourced [S01]. | This is a live optional recipe choice, not a retrospective mention, but it is not a regionally specific protein. Keep the existing row and note. Do not make `ground lamb` an alias of ground beef, transfer the `90% lean` wording to lamb, create a lamb fat class, or add a global substitution. |
| `090#8` — African Peanut Stew | `454 g stew meat`, owned by `ingredient-ref-stew-meat`; the saved note lists chicken, beef, or pork. | The saved source is [Cotter Crunch](https://www.cottercrunch.com/crock-pot-west-african-peanut-stew/). Its current page describes optional stew meat as chicken, turkey, beef, or pork and also offers a vegetarian version [S06]. The current publisher page and the saved note differ slightly, but neither names a regionally specific animal or meat product. | This is generic source-level flexibility, not a regional species request. Preserve the saved benchmark row in this proposal-only review. |
| `093#4` — Fried Rice | `Cooked meat or seafood, to taste`; the note says to use leftovers if available. No `ingredientRefId` or source URL is present. | No species, product, origin, or source is supplied in the bundled record. | Generic open-ended wording; it cannot establish a regional protein demand. Seafood is outside Section O. |

The 14 terrestrial recipe rows currently linked to `PROTEIN` references are `015#1` beef, `018#1` ground turkey, `027#1` breakfast sausage, `034#4` ground beef, `036#1` pork ribs, `074#1` ground beef, `078#3` the beef/lamb source option above, `082#1` pork shoulder, `085#1`, `086#1`, and `087#2` chicken breast, `089#1` ham, `090#8` stew meat, and `095#1` pork loin chops. The other four linked `PROTEIN` rows are marine products (crab, calamari, salmon, and tuna) and belong to Section P. No regional terrestrial request is hidden among those linked rows.

## Exact-key ownership and candidate cross-check

| Term or family | Current exact owner / candidate state | Benchmark result |
|---|---|---|
| `ground beef` | Active `ingredient-ref-ground-beef`, the exact owner of `078#3`. | One ingredient row; the lamb choice is preserved in the original line and notes. |
| `ground lamb` / `agneau haché` | No exact active reference name or alias; no matching legacy import candidate and no ledger candidate. The phrase appears only as source evidence attached to the existing ground-beef ledger record. | One optional source choice in `078#3`, not a separately linked recipe line. |
| `rabbit meat` / `viande de lapin` | Active `ingredient-ref-rabbit-meat`, accepted previously for plain meat from farmed domestic rabbit. | No recipe-row or prose match. This closed identity review does not establish demand for wild rabbit or hare. |
| `biltong`, `charqui`, and Peruvian Amazon `cecina` | Existing active identities: `ingredient-ref-biltong`, `ingredient-ref-charqui`, and `ingredient-ref-peruvian-amazonian-cecina`. | No recipe-row or prose match. No new decision on those identities is proposed. |
| Game and other regional terrestrial species | No exact active key or matching legacy/ledger candidate for the screened terms such as bison, venison, elk, moose, caribou, wild boar, goat, horse, or ostrich. | No matching request in recipe rows or prose. |

The current source line for ground lamb is not a second ingredient record: the catalog’s exact row owner remains `ingredient-ref-ground-beef`. Because `ground lamb` is unowned, a later task that chooses to represent this alternate as a first-class ingredient would need its own identity and a recipe-specific relationship. This review does not recommend that work as a response to the regional-protein checklist.

## Canadian and Québec naming and legal/source context

- OQLF’s GDT identifies **agneau haché** as the preferred French term and **ground lamb** as its English translation. Its note says the animal species must appear in the expression on a meat label. The entry dates to 1983, so it supports Québec terminology rather than current product availability or a present-day label determination [S02].
- CFIA’s current meat-labelling guidance says standardized ground-meat common names use the applicable fat category with the species or cut; it gives maximum fat limits of 30% for regular, 23% for medium, 17% for lean, and 10% for extra lean. It also says a species-specific claim must match the meat source and that proof of origin and segregation must be available to a CFIA inspector upon request [S03]. This is labelling context, not evidence about the recipe’s supplier or a blanket sourcing approval.
- CFIA’s lamb cuts manual defines lamb by the maturity characteristics of an ovine carcass and says meat that does not meet the lamb specification is referred to as mutton [S04]. This distinguishes lamb from mutton; it does not give the recipe’s lamb a cut, fat class, origin, or source.
- A current Québec Food Directory listing uses **Lean Ground Lamb** for one 375 g Fontaine Family product. The listing says “Product of Australia, prepared in Canada,” was updated 2026-07-08, and identifies GS1 as the data source while disclaiming MAPAQ responsibility for accuracy [S05]. It is a product-specific Québec-market example, not evidence that the recipe’s lamb is Australian, Québec-raised, or the same lean product.
- The recipe publisher’s optional-lamb statement is the only benchmark evidence for ground lamb. It identifies no farm, country of origin, processor, retail label, or special legal status. The available sources establish terminology and general label rules, but do not establish legally sourced regional meat demand in this benchmark.

No hunting or wildlife-harvest rule is assessed here because the corpus names no wild species. This review makes no safety, curing, storage, or raw-consumption claim.

## Measurement and substitution boundary

Recipe 078 has one 1 lb source line for a choice between ground beef and ground lamb; it does not provide separate quantities or a separate recipe row for lamb. The source wording does not establish that the beef’s “90% lean” qualifier applies to lamb. The Québec product listing is one separate product example and does not authorize copying its “lean” category to the recipe. No density, package, count, or conversion data is supported.

The publisher’s statement supports only the option for this shepherd’s-pie recipe. It does not support a global ground-beef-to-ground-lamb substitution rule, aliases between the identities, or an equivalence between other species or products. No substitution rule or measurement behavior is proposed.

## Source register

| ID | Source and direct URL | Evidence and limits |
|---|---|---|
| **WP04-REGIONAL-PROTEIN-20261012-S01** | The Wholesome Dish, [The Best Classic Shepherd’s Pie](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/) | Recipe introduction and ingredient list: the author presents ground beef and ground lamb as options and describes ground lamb as the traditional Shepherd’s Pie choice. Culinary recipe evidence only; no Canadian or origin evidence. |
| **WP04-REGIONAL-PROTEIN-20261012-S02** | OQLF, [agneau haché, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9897993/agneau-hache) | Preferred French term, English translation, and meat-label species note. Entry last updated 1983; terminology evidence, not a current regulatory standard. |
| **WP04-REGIONAL-PROTEIN-20261012-S03** | CFIA, [Labelling requirements for meat and poultry products](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products) | “Species-specific common name” and “Ground meat” sections: species match and origin/segregation proof for claims; standardized ground-meat names and fat limits. Regulatory labelling guidance, not evidence about the recipe’s product. |
| **WP04-REGIONAL-PROTEIN-20261012-S04** | CFIA, [Lamb — Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/lamb) | Defines lamb by ovine carcass maturity specifications and distinguishes mutton. Page last modified 2019-06-10; nomenclature evidence only. |
| **WP04-REGIONAL-PROTEIN-20261012-S05** | MAPAQ Québec Food Directory, [Fontaine Family Lean Ground Lamb Origines 375 g](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8218892) | Current Québec-market product wording and its listed Australian product origin / Canadian preparation. Updated 2026-07-08; data from GS1, and MAPAQ disclaims responsibility for accuracy. Product-specific evidence only. |
| **WP04-REGIONAL-PROTEIN-20261012-S06** | Cotter Crunch, [African Peanut Stew](https://www.cottercrunch.com/crock-pot-west-african-peanut-stew/) | Current publisher page names optional chicken, turkey, beef, or pork stew meat and a vegetarian option. Recipe-source evidence, not Canadian naming or legality. |

## Current data snapshot

Hashes are SHA-256 over exact file bytes. The recipe digest hashes each manifest-relative path, NUL, exact recipe bytes, NUL, in manifest order.

| Artifact | Count / size | SHA-256 or digest |
|---|---:|---|
| `manifest.v1.json` | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipes | 114 files; 1,123 ingredient rows; 752,942 raw bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `ingredient-references.v1.json` | 1,201 references | `5685098584f69a600eb376d7d824ab7564b9d5ee057252fd4822ff9afd1b76cc` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,503 records; 177 candidate records; 5,075 source entries; 4,144 distinct source IDs | `7db6d9a41d6f673967c1164ecadfd161497ca64ff8d53acaaf9c28fc4c1dfa00` |
| `substitution-rules.v1.json` | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `package-yields.v1.json` | 1 yield | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |

The rabbit identity context is recorded in the already accepted [Québec rabbit-meat review](wp04-rabbit-meat-quebec-identity-review-20261011.md). The regional-protein checkbox remains open in [the WP04 plan](../../RecipeBook-global-ingredient-catalog-plan.txt) because the audit found no qualifying recipe demand. No catalog, recipe, or ledger data changed; no tests were run.
