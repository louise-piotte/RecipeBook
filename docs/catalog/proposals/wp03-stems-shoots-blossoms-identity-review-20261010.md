# WP03 stems, shoots, blossoms, and sprouts identity review

- **Reviewed:** 2026-10-10
- **Status:** Reviewed and integrated by the coordinator on 2026-10-10; integration outcome recorded below.
- **Scope:** The open WP03 Section K row for celery, fennel bulb, asparagus, artichoke, banana blossom, squash blossom, nopales, edible shoots, and sprouts.
- **Recommendation:** Keep celery and asparagus on their existing references and add only source-backed aliases. Propose separate identity-only rows for Florence fennel, globe artichoke, banana blossom, squash blossoms, nopal pads, fiddleheads, pea shoots, alfalfa sprouts, mung bean sprouts, and soybean sprouts. Do not add a generic sprouts or edible-shoot identity, recipes, forms, conversions, yields, densities, or substitutions.

## Read set and target-specific audit

Before research, I read `AGENTS.md`, `Requirements.md`, `roadmap.md`, the full WP03 Section K checklist, current seed references and forms, the research ledger, legacy candidates, and the exact recipe corpus. Related proposal boundaries reviewed include:

- `wp03-leafy-greens-coordinator-review-20261009.md` and `wp03-residual-leafy-greens-boundary-review-20261010.md`;
- `wp06-tropical-leafy-greens-boundaries-20261009.md` and `wp03-wrappers-coordinator-review-20261009.md`;
- `wp03-roots-aromatics-coordinator-review-20261009.md`, `wp03-gourds-okra-identity-coordinator-review-20261009.md`, and `wp03-section-m-fruit-gaps-20261010.md`;
- `wp04-residual-produce-counts-review-20261010.md`, `wp04-wp12-produce-count-edible-portion-gap-review-20261010.md`, and `wp04-produce-count-alternate-source-review-20261010.md`.

The exact-name audit checked the proposed IDs and terms against active reference names and aliases, form labels and match terms, and legacy candidates. No proposed ID or exact proposed phrase currently has an owner. No matching form was found. The unique proposal-local source-ID prefix is `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S`; it was collision-checked against current research-ledger source IDs before drafting.

Related current owners and boundaries:

| Existing item | Current owner / state | Review boundary |
|---|---|---|
| Celery and asparagus | `ingredient-ref-celery` (`celery / céleri`) and `ingredient-ref-asparagus` (`asparagus / asperges`) are active; both have null density and empty unit mappings. Celery is unreviewed with measurement review blocked pending evidence; asparagus is unreviewed. | Keep both existing IDs. Do not create new celery or asparagus rows. |
| Celeriac and Jerusalem artichoke | `ingredient-ref-celeriac` and `ingredient-ref-jerusalem-artichoke` are verified. | Keep stalk celery distinct from celeriac/root celery; globe artichoke distinct from Jerusalem artichoke/topinambour. |
| Fennel seeds | `ingredient-ref-fennel-seeds` exists only as an unreviewed legacy candidate. | The bulb vegetable must not absorb fennel seeds or bare `fennel` / `fenouil`; OQLF uses the unqualified term for both fleshy petiole bases and seeds. |
| Other shoots and sprout-like names | Bamboo shoots and garlic scape are verified active references. Brussels sprouts are active; broccoli has the English alias `sprouting broccoli`. | Do not duplicate these identities or treat them as seed sprouts. |
| Banana, plantain, wrappers | Banana and plantain fruit references are active; banana leaf/wrapper work is separately scoped. | Blossom is separate from fruit and leaf. |
| Squash, zucchini, prickly pear | Squash and zucchini fruit references are active; `ingredient-ref-prickly-pear` is the Opuntia fruit and owns `cactus pear`. | Blossoms are not fruit aliases; nopal pads are not the fruit or the broad name `cactus leaves`. |
| Mung starch and sprouted products | Mung bean starch is active as `FLOUR_AND_STARCH`; no mung- or soybean-sprout reference is active. | Keep sprouted seeds separate from starch and do not attach generic `bean sprouts` to either sprout identity. |

## Identity recommendations

All proposed new rows are identity-only `VEGETABLE_AND_AROMATIC` references with `defaultDensity: null`, empty `unitMappings`, and no forms. The alias lists below are bounded to the cited source wording; unlisted alternatives remain unassigned.

| Candidate ID | Recommendation | Proposed EN / fr-CA display | Bounded aliases and exclusions |
|---|---|---|---|
| `ingredient-ref-celery` | Retain existing identity; add aliases | celery / céleri | Add EN `branch celery`; add FR `céleri-branche` and `céleri à côtes`. Keep existing `celery stalk` and `branche de céleri`. Keep celeriac terms on the celeriac row. [S01] |
| `ingredient-ref-asparagus` | Retain existing identity; add alias | asparagus / asperges | Add FR singular `asperge`; retain existing `botte d'asperges`. The bundle phrase is a name variant, not a bunch count or weight. [S03] |
| `ingredient-ref-florence-fennel` | Accept | Florence fennel / fenouil de Florence | EN aliases: `fennel bulb`, `bulb fennel`. FR alias: `fenouil bulbeux`. Do not add bare `fennel` / `fenouil`, fennel-seed terms, `aneth doux`, or generic anise/dill terms. OMAFRA separates the enlarged leaf base used as a fresh or cooked vegetable from the seed spice. [S05–S08] |
| `ingredient-ref-globe-artichoke` | Accept | globe artichoke / artichaut | EN alias: `artichoke`. Do not add Jerusalem artichoke, artichaut de Jérusalem, canned hearts, marinated hearts, or cooked forms as aliases/forms. [S09–S11] |
| `ingredient-ref-banana-blossom` | Accept | banana blossom / fleur de bananier | EN aliases: `banana flower`, `banana flower bud`. Keep separate from banana/plantain fruit and banana leaf. TFO Canada documents the French Canadian market term; the DOST recipe names a banana flower bud. [S12–S13] |
| `ingredient-ref-squash-blossoms` | Accept | squash blossoms / fleurs de courgettes | EN aliases: `squash flower`, `squash flowers`, `zucchini blossom`, `zucchini blossoms`, `zucchini flower`, `zucchini flowers`. FR alias: singular `fleur de courgette`. Do not add generic `flower`, `blossom`, or `edible flower` terms. [S14–S17] |
| `ingredient-ref-nopal-pads` | Accept | nopal pads / feuilles de cactus nopal | EN aliases: `nopales`, `nopalitos`. FR alias: `feuille de cactus nopal`. Do not add bare `nopal`, `cactus leaves`, `prickly pear`, or `cactus pear`; the cited sources distinguish pads/cladodes from the plant and fruit. [S18–S21] |
| `ingredient-ref-fiddleheads` | Accept, source-scoped | fiddleheads / têtes-de-violon | EN alias: `fiddle-head`. FR aliases: `crosse de fougère`, `crosse de fougère-à-l'autruche`. OQLF records the Québec plural as `têtes-de-violon` (no *s* on *violon*). Do not alias generic fern shoots or make a foraging-identification claim. [S22] |
| `ingredient-ref-pea-shoots` | Accept | pea shoots / pousses de pois | EN alias: `pea microgreens`. FR alias: `micropousses de pois`. Keep separate from mature peas and from seed germinations/sprouts. Québec guidance distinguishes germinations grown in water from pousses/micropousses grown in soil or fabric; GoodLeaf describes the product as pea tendrils and leaves. [S23–S26] |
| `ingredient-ref-alfalfa-sprouts` | Accept | alfalfa sprouts / germes de luzerne | No aliases. Health Canada and the Québec government use `germes de luzerne` for this seed-germination product. Keep it separate from alfalfa microgreens. [S10, S23, S28] |
| `ingredient-ref-mung-bean-sprouts` | Accept | mung bean sprouts / germes de haricot mungo | No aliases. OQLF defines the mung product and gives `germe de haricot` and `haricot germé`, but Health Canada's old CNF renders both mung and soybean sprouts in French as `germes de haricot`. Exclude those unqualified French phrases, Québec `fève germée`, and English `bean sprouts` to avoid ambiguous catalog matching. Exclude the discouraged `germe de soja`. [S27, S29–S30] |
| `ingredient-ref-soybean-sprouts` | Accept | soybean sprouts / germes de soya | No aliases. CNF directly names the raw soybean sprout in English; the Québec government lists `germes de soya` under soya products. Keep separate from mung sprouts and do not use `bean sprouts`, `germes de haricot`, or `germe de soja`. [S30–S31] |

## Exact recipe demand and link boundary

The manifest-ordered recipe scan found these current direct links:

| Recipe line | Exact current ingredient text and reference | Recommendation |
|---|---|---|
| `077#5` Salmon Pot Pie | `1 celery stalk, cut into small dice` → `ingredient-ref-celery` | Retain the existing link. The CNF stalk portions are size-specific; this line states no stalk size. Do not assign a count-to-mass value. [S02] |
| `105#7` Habitant Pea Soup | `2 stalks celery, chopped` → `ingredient-ref-celery` | Retain the existing link. No stalk size is stated; do not assign a count-to-mass value. [S02] |
| `104#1` Asparagus Souffle | `1 bunch asparagus, trimmed and cut into 1/2-inch pieces` → `ingredient-ref-asparagus` | Retain the existing link. The source-specific raw spear portions do not specify a bunch count or net weight. [S04] |

There is no direct ingredient row for Florence fennel, artichoke, banana blossom, squash blossoms, nopal pads, fiddleheads, pea shoots, alfalfa sprouts, mung bean sprouts, or soybean sprouts. Recipe 104's note mentions artichokes as a possible puree-friendly variation, but there is no artichoke ingredient line, ratio, or linked substitution. No recipe links are proposed for the new rows.

## Source-specific measurement observations

The amounts below are observations from the named source and exact food description. They are not proposed as active conversions or catalog-wide defaults. Health Canada's 2026 CNF is published as relational files; its current `Measure Weight Conversion` CSV was listed in Open Government metadata but was not readable through the available browser retrieval. Health Canada says the older 2015 online CNF remains accessible as an interim resource. Therefore the older CNF values below remain historical evidence pending a 2026-file comparison. [S32–S33]

| Exact source food/form | Source-published measure | Limit for RecipeBook |
|---|---|---|
| Celery, raw | Small stalk (13 cm) 17 g; medium stalk (19–20 cm) 40 g; large stalk (28–31 cm) 64 g. CNF also lists diced/strip volume measures and a 10 cm strip. [S02] | Recipes 077#5 and 105#7 omit stalk size and describe later preparation/cooking. Do not select a size or transfer a volume measure. |
| Asparagus, raw | Small spear 12 g; medium spear 16 g; six medium spears 96 g; large spear 20 g; extra-large spear 24 g. CNF also lists raw volume portions. [S04] | Recipe 104#1 says one bunch, with no bunch count or package weight. No bunch conversion. |
| Fennel, bulb, raw | One bulb 234 g; sliced 100 mL 36.8 g, 125 mL 46.0 g, and 250 mL 91.9 g. The page reports 28% refuse as stalk, leaves, and core. [S08] | Source-specific to raw bulb. No RecipeBook line uses fennel; do not use these as a default density or cooked-bulb conversion. |
| Artichoke | Health Canada's 2008 table reports one medium boiled/drained artichoke as 120 g, one canned-in-water heart as 27 g, and one marinated-in-oil heart as 28 g. [S11] | Historical entries are three different forms; there is no raw whole-head measure and no RecipeBook ingredient line. Keep all three values unlinked and separate. |
| Banana flower bud | DOST's recipe calls for one medium-sized bud, with no mass, and names *Musa × paradisiaca* ‘Saba’ or *M. balbisiana*. [S13] | Recipe-local count only; it does not establish a general medium bud weight or a RecipeBook link. |
| Squash/zucchini blossoms | The Québec recipe specifies 35 male zucchini flowers for two people; USask specifies 8–10 squash or zucchini blossoms. [S15–S16] | Recipe-specific ingredient counts only; do not convert to weight or infer a common portion. |
| Nopal cactus leaf | Super C lists one retail item at 650 g average. [S21] | Retailer-specific average item, not a standard pad weight or RecipeBook count conversion. |
| Fiddleheads, frozen, boiled | Health Canada's 2008 table reports 125 mL = 98 g. [S11] | Exact historical cooked/frozen source form only; no raw measure or RecipeBook line. |
| Pea microgreens | Québec retailer lists a 65 g package. [S26] | Retail package quantity only, not a bunch or portion conversion. |
| Alfalfa sprouts, raw | Health Canada's 2008 table reports 60 mL = 8 g. [S10] | Exact historical raw source form only; no RecipeBook line. |
| Mung bean sprouts, raw | CNF 2015 reports 100 mL = 44.0 g, 125 mL = 54.9 g, and 250 mL = 109.9 g. [S29] | Historical raw source form only. Do not map to soybean sprouts despite the reused French generic label. |
| Soybean sprouts, raw | CNF 2015 reports 100 mL = 29.6 g, 125 mL = 37.0 g, 250 mL = 74.0 g, and 10 sprouts = 10.0 g. [S30] | Historical raw source form only. Do not map to mung sprouts or an unqualified bean-sprout identity. |

No source-supported bulk density in g/mL was established for any candidate. A food-specific volume portion in CNF is not a general ingredient density. Keep every proposed `defaultDensity` null and every `unitMappings` array empty. Do not introduce bunch, stalk, blossom, pad, or sprout count conversions from the observations above.

## Shoots, flowers, sprouts, and substitution boundaries

- **No generic shoots row.** Bamboo shoots and garlic scape are already separate verified identities. Add only the source-scoped fiddlehead and pea-shoot rows above. Do not use `shoots` as an alias for sprouts, blossoms, or a plant part whose species is unstated.
- **No generic sprouts row.** The three separately named products above have different source-supported identities. The Québec cultivation guide also lists red clover, fenugreek, adzuki bean, and chickpea seeds for germination, but this packet found no exact RecipeBook demand or product-specific naming evidence sufficient to add those four sprout identities. Keep them unassigned for a separately scoped review; do not alias them to mung or alfalfa sprouts. Pea shoots are micropousses, not water-grown seed germinations. [S23]
- **No blossom/fruit merge.** Keep banana blossom, squash blossoms, banana fruit, plantain, zucchini, and other squash fruits as separate ingredients. Do not add blossoms to generic edible flowers or make an edibility or foraging-safety claim.
- **No global substitution rule.** No source-backed interchangeable ratio or general replacement was found for these candidates. Recipe 104's artichoke note is a method idea only and does not support a recipe-line substitution rule. Do not propose celery-for-fennel, asparagus-for-artichoke, pea-shoot-for-pea, or other replacements.
- **No inferred forms or processing links.** Keep raw, boiled, frozen, canned, marinated, trimmed, and prepared entries distinct when a source names them. The source-specific portion observations do not create forms or conversions.

## Evidence register

The IDs below are proposal-local, unique, and have not been added to the shared research ledger. Each supports only the claims and limitations stated here.

| Source ID | Source and locator | Claim supported and limit |
|---|---|---|
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S01` | OQLF, [céleri](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26520180/celeri) | Pairs celery with céleri; lists `céleri-branche`, `céleri à côtes`, and English `branch celery`. Supports aliases on the existing stalk-celery identity. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S02` | Health Canada CNF, [Celery, raw, food code 2386](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2386) | Provides source-specific raw portions for stalk sizes, diced/stripped volumes, and refuse. Online 2015 CNF entry; size distinctions do not match the recipes' unspecified stalk size. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S03` | OQLF, [asperge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084017/asperge) | Pairs asparagus with asperge, describes the consumed vegetable part as young shoots/turions, and notes green and white market types. Supports the singular FR alias; no bunch amount. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S04` | Health Canada CNF, [Asparagus, raw, food code 1990](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=1990) | Provides raw spear and volume portions and 47% refuse as ends. Does not give a bunch size; online 2015 CNF entry. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S05` | OQLF, [fenouil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095229/fenouil) | Supports the French generic fennel name and shows its breadth: the fleshy petiole base or seeds. It is a reason to keep unqualified `fenouil` off the bulb row. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S06` | OMAFRA, [Florence Fennel](https://omafra.gov.on.ca/CropOp/en/spec_veg/other_spec_veg/ffen.html) | Names the Ontario crop Florence fennel and separates enlarged leaf base used as a fresh/cooked vegetable from seeds used as spice. Other names are not automatically adopted as aliases. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S07` | OMAFRA, [Fenouil de Florence](https://omafra.gov.on.ca/CropOp/fr/spec_veg/other_spec_veg/ffen.html) | Provides Canadian French crop name and description of the bulb as enlarged leaf base; lists `fenouil bulbeux`. Excludes the crop profile's ambiguous `aneth doux` from the proposed aliases. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S08` | Health Canada CNF, [Fennel, bulb, raw, food code 2350](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2350) | Gives the exact raw-bulb portions and refuse. Online 2015 CNF entry; no recipe demand or general density. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S09` | OQLF, [artichaut](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083796/artichaut) | Pairs artichaut with English `artichoke` and `globe artichoke`; defines the immature head and names the consumed receptacle/bract bases. Keeps the term distinct from Jerusalem artichoke. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S10` | OMAFRA, [Globe Artichoke](https://www.omafra.gov.on.ca/cropop/en/spec_veg/other_spec_veg/arti.html) | Identifies globe artichoke as *Cynara scolymus* and culinary use of immature flower buds. Does not establish raw/cooked equivalence. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S11` | Health Canada, [Nutrient Value of Some Common Foods, Table 4: Vegetables](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-4-vegetables-vegetable-products-nutrient-value-some-common-foods-2008.html) | Historical 2008 table: exact cooked/drained artichoke and heart portions, raw alfalfa sprouts, and frozen boiled fiddleheads. Values remain source-specific and are not recipe mappings. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S12` | TFO Canada, [Fruits et légumes frais](https://tfocanada.ca/wp-content/uploads/2021/10/Fruits-et-legumes-frais.pdf) | Canadian French market guide lists `fleur de bananier`. Supports the fr-CA blossom name, not a portion or recipe. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S13` | Philippine DOST-PCAARRD iVeg, [Kinilaw na Puso ng Saging](https://iveg.pcaarrd.dost.gov.ph/crop/capsicum-frutescens/batangas) | Recipe identifies one medium banana flower bud, with bracts removed and quartered; names *Musa × paradisiaca* ‘Saba’ or *M. balbisiana*. Recipe-local count, not mass or universal form equivalence. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S14` | OQLF, [courge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083840/courge) | Pairs courge with squash and supports the Cucurbita family boundary. Does not alone establish blossom aliases or a recipe link. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S15` | Recettes du Québec / Sauve ta bouffe, [Guide pratique des fleurs comestibles](https://www.recettes.qc.ca/chroniques/quoi-manger/article/guide-pratique-des-fleurs-comestibles) | Uses `fleurs de courgettes`; its recipe specifies 35 male zucchini flowers for two people. The count is recipe-specific and not a general serving or weight. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S16` | University of Saskatchewan, [Pan fried squash blossoms](https://gardening.usask.ca/articles-and-lists/articles-recipes/pan-fried-squash-blossoms.php) | Uses squash and zucchini blossoms as the ingredient name and gives 8–10 in its own recipe. Does not generalize blossom counts. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S17` | Metro Québec, [Fleurs de courgettes](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/fleurs-de-courgettes/p/628363000033) | Québec retailer's product listing supports the exact French market name. The listing's `1 un` is not a weight. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S18` | USDA AMS, [Cactus Leaves Inspection Instructions](https://www.ams.usda.gov/grades-standards/cactus-leaves-inspection-instructions) | Calls cactus leaves `Nopales` and identifies the product as coming from prickly pear cactus. Inspection terminology only; not a reason to merge with the fruit. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S19` | FAO, [Opuntia: Introduction](https://www.fao.org/4/y2808e/y2808e04.htm) | Glossary defines nopalitos as young cladodes used as vegetables and distinguishes nopal as the Opuntia plant. Supports the scoped alias `nopalitos`, not bare `nopal`. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S20` | Metro Québec, [Feuille de cactus nopal](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/laitues-et-legumes-a-feuilles/feuille-de-cactus-nopal/p/4558) | Québec French retail product name supports `feuille de cactus nopal`. Product listing alone gives no general portion. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S21` | Super C, [Nopal Cactus Leaf](https://www.superc.ca/en/aisles/fruits-vegetables/vegetables/lettuce-leafy-vegetables/nopal-cactus-leaf/p/4558) | Canadian retailer English product name and 650 g average item listing. The average is retailer-specific, not a unit conversion. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S22` | OQLF, [crosse de fougère](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870388/crosse-de-fougere) | Supports English `fiddlehead` / `fiddle-head`, French `crosse de fougère`, `crosse de fougère-à-l'autruche`, and Québec `tête-de-violon`, plural `têtes-de-violon`. Used for naming only; no general fern identification claim. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S23` | Gouvernement du Québec, [Culture des pousses et germinations](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/agriculture-urbaine/quoi-planter/pousses-germinations) | Distinguishes water-grown germinations from pousses/micropousses grown in soil or fabric and lists species for each technique. Cultivation guidance does not by itself make every listed plant a catalog identity. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S24` | GoodLeaf Farms Québec, [Pousses de pois](https://www.goodleaffarms.quebec/pousses-de-pois) | Uses the exact French product name and describes coiled pea tendrils and leaves. Supports the pea-shoot identity, distinct from seed germinations. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S25` | GoodLeaf Farms, [Sweet Pea Shoots](https://www.goodleaffarms.com/green/sweet-pea-shoots) | English product-name corroboration for pea shoots; supports identity terminology only. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S26` | Ecolocal / Ferme WILLIKA, [Pea Microgreens (65g)](https://ecolocal.csur.ca/pois-willika-micropousses) | Québec-area retailer uses `pea microgreens` and lists a 65 g package. Package-specific amount only. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S27` | OQLF, [germe de haricot](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8403750/germe-de-haricot) | Defines the product from haricot mungo, lists `germe de haricot` / `haricot germé`, Québec `fève germée`, and discourages `germe de soja`. The generic phrases are excluded from aliases because CNF also uses `germes de haricot` for soybean sprouts. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S28` | Public Health Agency of Canada, [Rapport sur l’atlas alimentaire 2.0](https://www.canada.ca/fr/sante-publique/services/publications/aliments-et-nutrition/rapport-atlas-alimentaire-2.html) | Uses the French terms `germes de luzerne` and `germes de haricot` in a Canadian food-exposure report. Naming evidence only; it does not disambiguate the latter from soybean sprouts. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S29` | Health Canada CNF, [Mung bean sprouts, raw, food code 2008](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2008) | Names mung sprouts in English and gives exact raw volume portions. Its French rendering uses `germes de haricot`, which must not be made a catalog-wide alias. Online 2015 CNF entry. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S30` | Health Canada CNF, [Soybean sprouts, raw, food code 2210](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2210) | Names soybean sprouts in English and gives exact raw volume/count portions. Its French rendering also uses `germes de haricot`; online 2015 CNF entry. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S31` | Gouvernement du Québec, [Allergènes et leurs différentes appellations](https://www.quebec.ca/sante/alimentation/allergies-alimentaires/allergenes-differentes-appellations) | Lists `germes de soya` as a soya-related food term. Supports this Québec French name in combination with CNF's exact English soybean-sprout entry; it is not an alias for mung sprouts. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S32` | Open Government Canada, [Canadian Nutrient File 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), including the [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Confirms the current official 2026 dataset and listed measurement resource. The CSV contents could not be read with the available browser retrieval, so no 2026 portion values are asserted. |
| `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33` | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | States that CNF 2026 is available as relational CSV data and that the 2015 online CNF remains as an interim access path. Supports the historical-status caveat above, not any portion. |

## Integration boundary

The proposal-only review changed no shared catalog, research ledger, recipes, plan, roadmap, code, or tests and ran no tests. The coordinator integration outcome below records the accepted data changes.

## Coordinator integration outcome — 2026-10-10

- Retained the existing celery and asparagus references; added only `branch celery`, `céleri-branche`,
  `céleri à côtes`, and `asperge` as source-supported aliases. Recipe lines 077#5, 105#7, and 104#1
  remain linked as before.
- Added the ten recommended identity-only references. Every row is `VEGETABLE_AND_AROMATIC`, has a
  null default density and no unit mappings or forms, and keeps the excluded generic sprout, shoot,
  blossom, and overlapping bean-sprout terms inactive.
- Added 33 source records and source-specific observations to the ledger. CNF values remain
  historical/source-specific; counts, package weights, and distinct raw/cooked/canned forms do not
  create general conversions. No substitution was activated.
- See [`batches/wp03-stems-shoots-blossoms-integration-20261010/README.md`](../batches/wp03-stems-shoots-blossoms-integration-20261010/README.md)
  for the integrated rows and verification.
