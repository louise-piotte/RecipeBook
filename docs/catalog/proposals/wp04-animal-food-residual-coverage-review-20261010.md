# WP04 Proposal: Fresh-Meat Count and Cut-Boundary Delta — 2026-10-10

- **Status:** Proposal only. This file is the only change from this review; no catalog, ledger, recipe, plan, roadmap, code, or test file was edited.
- **Scope:** Supplement `wp04-animal-foods-residual-coverage-audit-20261010.md` with the fresh-pork portion lines it did not assess and one additional chicken-breast count line found in the full recipe pass. Eggs, cured pork, shellfish, finfish, and produce count work are excluded.
- **Disposition:** Keep the existing shoulder and chicken identities, retain their count quantities without a mass conversion, and hold a global pork-rib identity/display decision until the recipe’s two cut options have a Québec French scope that does not collapse them. Record the Anova shoulder range only as source-specific recipe evidence; it does not support a scalar count mapping.

## Audit snapshot and exact recipe demand

The manifest-listed bundled package contains 114 recipe files and 1,123 ingredient rows. The current seed has 792 ingredient references and 36 forms. The live research ledger has 1,018 records; the three relevant records for rack of ribs, boneless pork shoulder, and chicken breast each have empty source lists, `identityState: unreviewed`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. No ingredient form is linked to these three references.

The following rows were checked against the active reference names and aliases and the source text in all 114 recipes. The recipe-line ID is the bundled UUID plus `-ingredient-N`.

| Line | Exact source text and stored amount | Current reference | Delta finding |
| --- | --- | --- | --- |
| `036#1` — Sous Vide Ribs; `a8429c9a-dcc8-4694-b09d-81c62d51af2d-ingredient-1` | `1 rack pork ribs`; quantity `1`, unit `rack` | `ingredient-ref-rack-of-ribs`: `rack of ribs` / `carré de côtes levées`; no aliases | The source recipe calls for a rack of baby-back ribs and accepts St. Louis-style ribs too. It publishes no rack mass. The current English reference omits the species and its French name has not been validated for both source options. Hold a global rename/alias or split pending product and fr-CA scope review. |
| `082#1` — Sous Vide Pulled Pork; `ad608924-df31-48be-89c5-721a7f0a2572-ingredient-1` | `1 boneless pork shoulder`; quantity `1`, no unit | `ingredient-ref-boneless-pork-shoulder`: `boneless pork shoulder` / `épaule de porc désossée`; aliases `whole boneless pork shoulder` / `épaule de porc entière désossée` | Retain this distinct boneless identity. The linked Anova source publishes a 5–7 lb range for one whole shoulder but permits either boneless or bone-in. Treat the range as source-specific, not as a boneless-only count weight. Keep `ingredient-ref-bone-in-pork-shoulder` separate. |
| `085#1` — Maple Chicken; `382d2080-2492-481c-bd33-2330cc3be65d-ingredient-1` | `1 chicken breast`; quantity `1`, no unit | `ingredient-ref-chicken-breast`: `chicken breast` / `poitrine de poulet`; aliases include `chicken breasts` and `boneless skinless chicken breast` | This single-breast line was missed by the earlier residual audit, which covered `087#2` (two chicken breasts). It adds no identity. The linked source URL was not accessible in the web tool; retain its count and leave per-breast mass unresolved. |
| `087#2` — Chicken Parmesan; `c68bebce-c549-4789-a5b4-d023ed58f782-ingredient-2` | `2 chicken breasts`; quantity `2`, unit `count` | `ingredient-ref-chicken-breast` | Already covered by the earlier residual audit; included here to show the full chicken-breast count demand. No per-breast mass is published by the reviewed CNF entry. |

The other fresh pork recipe hits are mass-based (`095#1`, 1 lb boneless pork loin chops) or are not a specific pork identity request (`090#8`, 454 g stew meat with a recipe note listing chicken, beef, or pork). They do not add a count-to-mass candidate. Cured-pork lines and all excluded seafood and egg lines were not reconsidered here.

## Identity and product-state boundaries

### Pork ribs

The direct source for recipe 036 states `1 rack of baby back pork ribs` and says St. Louis-style ribs also work. This is source evidence for a recipe-local choice, not a global synonym relationship. CFIA’s pork-cut manual locates back ribs in the loin and side ribs in the belly. OQLF separately defines `petites côtes levées de dos` as baby-back ribs from the loin, `côtes levées` as spare ribs taken from the flank, and `côtes levées de flanc` as side spare ribs. The source’s St. Louis option is not independently resolved to one of those Québec terms in this review. [S01–S06]

OQLF’s `carré` entry describes a rack and says a pork rack has seven or eight ribs beginning at the sixth rib; it also says a meat label should include the animal species. That supports retaining cut and species qualifiers, but it does not make the current `carré de côtes levées` display a validated umbrella term for both the source’s baby-back and St. Louis options. Do not add `baby back ribs`, `back ribs`, `spare ribs`, or `St. Louis-style ribs` as aliases to a generic row. Hold the global display/alias decision until independent Québec review chooses whether recipe-level flexible pork ribs can have one broad identity or need distinct identities. [S02–S07]

The recipe’s local instructions handle the ribs before sous-vide cooking, remove a membrane, then divide the rack for packaging. Preserve `1 rack` as the source quantity. Do not infer a raw-to-cooked yield or treat the rack as a fixed number of ribs or a fixed mass.

### Pork shoulder

CFIA defines pork shoulder as a carcass section distinct from the loin and belly, lists shoulder subcuts, and recognizes `boneless / désossé(e)` as a cut modifier. Keep the active boneless and bone-in shoulder references separate. The Anova recipe page itself offers a whole boneless or bone-in shoulder, so it supports that option only in its own recipe context; it does not establish a global alias or a general substitution rule. [S08]

The recipe bundle’s line specifies boneless pork shoulder; its note says bone-in also works. The Anova source lists the two bone states together with one 5–7 lb total range, so it does not give a separate range for boneless shoulder. The source quantity is pre-cook, before the long sous-vide cook and oven finish. It is not an edible-meat mass or a cooked yield. [S09]

### Chicken breast

The active reference is retained. Recipe 085 specifies one breast without size, skin, or bone qualifiers; its saved method cuts the breast before cooking, but does not supply a weight. The linked `Foodie Badge` URL could not be opened on 2026-10-10, so any details beyond the bundled line and method remain unresolved. Recipe 087’s two-count line is already documented in the prior audit. Health Canada CNF code 841 is a narrower raw, boneless, skinless chicken-breast meat record; it publishes a 90 g Food Guide serving, not a one-breast portion. Do not assign that serving amount to either recipe line. [S10–S11]

## Portion, composition, conversion, and substitution evidence

| Evidence dimension | Accept / hold disposition |
| --- | --- |
| **Recipe-specific portion** | **Accept as a source-qualified note:** Anova’s recipe for four lists one whole boneless-or-bone-in pork shoulder at 5–7 lb (2.25–3.25 kg). **Hold from the active ledger and runtime:** the range covers two bone states, while the bundled line is boneless-only, and the ledger observation schema requires a single numeric `value`. Do not pick a midpoint, assign the range to every shoulder, or convert it into a default count mapping. Fit Foodie Finds gives one rack with two cut options and no mass. The inaccessible chicken source and CNF 841 supply no breast count weight. [S09–S11] |
| **Composition and edible portion** | CNF 1815 is `Pork, shoulder, whole, lean, raw`; it reports 25% bone and skin, 39% total refuse, and 14% separable fat. Those qualifiers do not match a boneless shoulder. CNF 1933 is raw side-rib centre cut, lean and fat, with 27% total refuse; it does not cover both baby-back and St. Louis options as one rack. CNF 841 is raw boneless, skinless breast meat with 0% refuse; the recipe 085 line does not specify those qualifiers. Keep all three values attached to their published foods and do not use them as generic item factors. [S10–S12] |
| **Conversions and yields** | No density, unit mapping, count weight, edible-portion yield, package yield, or cooking yield is activated. The CNF 100 g edible-portion bases and refuse percentages cannot supply the missing as-purchased mass for a rack, a boneless shoulder, or a breast. Do not estimate a whole cut’s mass from an edible serving or use a cooked result as a raw weight. |
| **Substitutions** | Anova’s own recipe permits a bone-in shoulder as an option alongside boneless; Fit Foodie Finds’ own recipe says St. Louis-style ribs work alongside baby-back ribs. Preserve these as recipe-local source statements only. They do not establish global ingredient aliases, a general bone-in/boneless rule, or a reusable back-rib/side-rib substitution. No chicken substitution evidence was found in the accessible sources. No runtime substitution is proposed. [S01, S09] |

The existing schema’s `MeasurementObservation.value` is one positive number, so it cannot preserve the Anova 5–7 lb range as a range. This is a source-model limit, not support for selecting one value. No new ledger observation is recommended until the source-specific range can be recorded without flattening its interval and bone-state qualifier.

## Sources

All accessible pages were reviewed on **2026-10-10**. Source IDs below are local to this proposal and were not written to the research ledger.

| ID | Source and evidence scope |
| --- | --- |
| **S01** | Fit Foodie Finds, [24-Hour Sous Vide Ribs](https://fitfoodiefinds.com/24-hour-sous-vide-ribs/), ingredients and tips. Direct recipe source: one rack of baby-back pork ribs; St. Louis-style also works; no mass is listed. Its method splits the rack before sous-vide cooking. |
| **S02** | CFIA, [Pork — Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/pork). Defines pork cuts, including shoulder, back ribs from the loin, and side ribs from the belly. The manual is cut-nomenclature evidence, not a portion-weight source. |
| **S03** | OQLF, [côtes levées](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8427790/cotes-levees). In the pork-food domain, pairs `côtes levées` with `spare ribs` and specifies that they are taken from the flank. |
| **S04** | OQLF, [côtes levées de dos](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8887154/cotes-levees-de-dos). Defines back ribs as ribs from the loin and says the animal species belongs in a meat-label expression. |
| **S05** | OQLF, [côtes levées de flanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8886952/cotes-levees-de-flanc). Defines side spare ribs as a pork-belly rib section. |
| **S06** | OQLF, [petites côtes levées de dos](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17013435/petites-cotes-levees-de-dos). Directly pairs the Québec term with `baby back ribs` and locates the cut in pork loin. |
| **S07** | OQLF, [carré](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17485535/carre). Defines `carré` as a rack; says pork has seven or eight ribs from the sixth rib and the species should be named on a meat label. It does not identify St. Louis-style ribs. |
| **S08** | CFIA, [Pork — Manuel de coupes de viande](https://inspection.canada.ca/fr/etiquetage-aliments/etiquetage/industrie/produits-viande-volaille/coupes-viande/porc). French cut definitions distinguish shoulder subcuts, back ribs, and side ribs; the modifiers list gives `boneless / désossé(e)`. |
| **S09** | Anova Culinary, [Sous Vide BBQ Pork Shoulder](https://recipes.anovaculinary.com/recipe/sous-vide-bbq-pork-shoulder), ingredients for four. Lists one whole boneless-or-bone-in pork shoulder at 5–7 lb total (2.25–3.25 kg) and then cooks it sous vide before an oven finish. Source-specific recipe amount only. |
| **S10** | Health Canada CNF, [food code 1815: whole lean raw pork shoulder](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1815). Publishes a 100 g edible-portion basis, 25% bone and skin, 39% total refuse, and 14% separable fat. It is not the boneless shoulder requested by the recipe line. |
| **S11** | Health Canada CNF, [food code 841: raw boneless, skinless chicken breast](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=841). Publishes 100 g edible portion, one 90 g Food Guide serving, and 0% refuse; no per-breast amount. This is narrower than the unqualified recipe 085 line. |
| **S12** | Health Canada CNF, [food code 1933: raw pork side-rib centre cut](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1933). Publishes 100 g edible portion and 27% total refuse for lean-and-fat side-rib centre-cut spareribs; no rack count or mass. |
| **S13** | Bundled recipe metadata identifies the 085 source as Foodie Badge, [One Pan Butter Garlic Chicken / Korean Soy Sauce Chicken](https://foodiebadge.com/one-pan-butter-garlic-chicken-korean-soy-sauce-chicken-chicken-breast-recipe/). The page was not accessible through the web tool on 2026-10-10. Treat only the local `1 chicken breast` ingredient line as verified; source-specific mass and further product qualifiers remain unresolved. |

## Proposal-only conclusion

The residual audit’s two-chicken-breast portion gap also applies to the additional `085#1` single-breast row. The fresh-pork count scan adds `036#1` (one rack) and `082#1` (one boneless shoulder). The Anova source gives a recipe-specific shoulder range but not a boneless-only scalar; no per-rack or per-breast portion was found. Preserve exact counts, hold the ambiguous global pork-rib display, and leave composition, count conversions, yields, and reusable substitutions inactive.
