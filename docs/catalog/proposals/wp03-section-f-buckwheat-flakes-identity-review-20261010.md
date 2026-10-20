# WP03 Section F proposal: buckwheat flakes identity review (2026-10-10)

**Status:** integrated as identity-only catalog data on 2026-10-10.
**Recommendation:** add one identity-only `GRAIN_AND_CEREAL` reference for plain buckwheat flakes, with no aliases, recipe links, forms, measurements, density, unit mappings, yields, or substitutions.

**Coordinator disposition:** accepted the bilingual identity after independently opening the OQLF `sarrasin` entry, the Québec Ministry guide, the Priméal plain-flake listing, the La Moisson Québec listing, the matching Priméal 350 g retailer listing at Botanic, the Markal product page, and Priméal's separate mixed-cereal product page. The evidence supports the plain-flake boundary and `flocons de sarrasin`; Priméal and Botanic publish different directions (1:2 and 1:3 flakes-to-liquid) for the same named 350 g product, so no shared ratio or yield was added. La Moisson independently confirms the Québec display and product composition but does not publish a preparation ratio on its page. The generator and regression coverage now include the row. No recipe line was changed.

## Scope and package check

Section F still has an open line for regionally significant cereal mixes and preprocessed grains. Plain buckwheat flakes are a distinct processed product: a Québec retailer markets them under the French name `Flocons de Sarrasin`, and product-source evidence describes whole buckwheat grain that is steamed and rolled. This review is separate from the newly integrated quinoa flakes and the existing roasted buckwheat-groat and buckwheat-flour identities. Searches of the current Section F plan, proposals, and batch notes found no prior focused buckwheat-flakes review.

The current manifest-backed package snapshot contains 884 references, 48 forms, 114 recipes, and 1,123 recipe ingredient rows. The ledger has 1,129 records and the legacy candidate list has 77 entries. Nearby active identities include:

| Active identity | Category | Boundary |
|---|---|---|
| `ingredient-ref-buckwheat-flour` (`buckwheat flour / farine de sarrasin`) | `FLOUR_AND_STARCH` | Ground flour product. |
| `ingredient-ref-roasted-buckwheat-groats-dry` (`buckwheat groats, roasted, dry / gruau de sarrasin, rôti, sec`) | `GRAIN_AND_CEREAL` | Roasted intact groats; keep `kacha/kasha` as a prepared dish, not a flake synonym. |
| `ingredient-ref-soba-noodles` (`soba noodles / nouilles de sarrasin`) | `GRAIN_AND_CEREAL` | Noodle product, separate from grain flakes. |
| `ingredient-ref-barley-flakes`, `ingredient-ref-corn-flakes`, `ingredient-ref-quinoa-flakes` | `GRAIN_AND_CEREAL` | Other grain-specific flake identities; no name collision with buckwheat flakes. |

`ingredient-ref-buckwheat-flakes` is absent from active references, forms, ledger record IDs, and legacy candidates. I searched the current package, all ledger records and unit-conversion strings, legacy candidates, prior proposals, and batch notes for exact candidate phrases and ID. The normalized-key audit used the package's `normalize_search_key` routine (case folding, Unicode decomposition/accent folding, punctuation and whitespace normalization) for `buckwheat flakes`, `buckwheat flake`, `flaked buckwheat`, `organic buckwheat flakes`, `instant buckwheat flakes`, `flocons de sarrasin`, `flocon de sarrasin`, organic variants, `flocons de blé noir`, `sarrasin en flocons`, and the proposed ID. No exact normalized collision appears in active reference names or aliases, form labels or match terms, ledger strings, or legacy candidate names or aliases. Broad `buckwheat` / `sarrasin` searches still find the flour, roasted groats, and soba neighbors and must remain qualified.

## Recipe demand audit

Every recipe listed by the current manifest was searched in full text and ingredient rows for the candidate product phrases. Candidate-specific demand and broader buckwheat/sarrasin ingredient-line demand are both zero.

| Candidate terms | Recipe files with a full-text hit | Ingredient rows with a hit |
|---|---:|---:|
| `buckwheat flakes`, `buckwheat flake`, `flaked buckwheat`, `flocons de sarrasin`, `flocons de blé noir` and spelling/qualifier variants | 0 / 114 | 0 / 1,123 |
| Any buckwheat / sarrasin recipe text | 0 / 114 | 0 / 1,123 |

There is no recipe row to link or justify a preparation form, conversion, or substitution. Product-maker recipes and external menu suggestions were excluded from bundled-recipe demand.

## Proposed identity and Québec French scope

| Field | Proposal |
|---|---|
| ID | `ingredient-ref-buckwheat-flakes` |
| `nameEn` | `buckwheat flakes` |
| `nameFr` | `flocons de sarrasin` |
| `category` | `GRAIN_AND_CEREAL` |
| `aliasesEn` / `aliasesFr` | `[]` / `[]` |
| `defaultDensity` / `unitMappings` | `null` / `[]` |

The Office québécois de la langue française maps `sarrasin` to English `buckwheat`; an official Québec Ministry guide separately says buckwheat is available as flakes and distinguishes that product from flour, decorticated grain, and soba noodles. A Québec retail product page uses the exact product wording `Flocons de Sarrasin` and identifies its ingredient as steamed, rolled buckwheat grain. These sources support `flocons de sarrasin` as a Québec-facing display. The product sources and OQLF use plural `flocons`; the exact compound is market-attested rather than a separate OQLF entry.

Keep the aliases empty. OQLF also records `blé noir` as a name for buckwheat, but no source reviewed here establishes `flocons de blé noir` as a Québec product label; the Québec guide and retailer use `sarrasin`. Do not add `instant`, `organic/bio`, `toasted`, or `blé noir` qualifiers as aliases. Do not alias to `buckwheat groats`, `kasha/kacha`, buckwheat flour, soba, rolled oats, or general breakfast cereal.

The new row should represent plain flakes made from buckwheat, not a formulated ready-to-eat cereal whose name includes buckwheat. For example, Priméal separately lists a product called `Flakes Sarrasin` whose ingredients include maize, buckwheat flour, sugar, glucose syrup, and salt; that mixed cereal is outside this identity. Keep whole roasted groats, flour, and noodles separate. The use of `GRAIN_AND_CEREAL` follows the current category of the active roasted buckwheat grain identity and Section F practice for processed grain flakes.

## Evidence and limits

Sources were opened on 2026-10-10. Proposal-local source IDs are not ledger records.

| Source ID | Source | Evidence used and limits |
|---|---|---|
| `WP03-BWFLAKES-20261010-S01` | OQLF, [sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082623/sarrasin), 1991 | Gives French `sarrasin` and English `buckwheat`, with `blé noir` also recorded. Supports the base bilingual terms, not the flake compound or a global product alias. |
| `WP03-BWFLAKES-20261010-S02` | Québec Ministry of Families, [L’alimentation responsable dans les services de garde éducatifs à l’enfance](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/famille/publications-adm/Service_de_garde/sante-securite/gazelle-potiron-guide-alim-resp.pdf), chapter 3, printed p. 25 | States in Québec French that buckwheat is available as flakes, alongside decorticated seed and soba noodles. This supports product existence and scope in Québec; it provides no measure or substitution rule for buckwheat flakes. |
| `WP03-BWFLAKES-20261010-S03` | Priméal, [Flocons sarrasin 350 g](https://primeal.bio/fr/nos-produits/autres/flocons-de-sarrasin-bio-350g/) | The producer lists whole buckwheat grain as the ingredient and describes it as steamed and rolled. Its product-specific directions use a 1:2 flakes-to-liquid volume ratio and a 3-minute covered rest. These are SKU instructions, not a general conversion or yield. |
| `WP03-BWFLAKES-20261010-S04` | La Moisson, Québec retailer, [Flocons de Sarrasin](https://lamoisson.com/products/flocons-de-sarrasin) | Uses the Québec-market display wording, shows a 350 g Priméal product, and describes steamed, rolled whole buckwheat grain. The page supplies no preparation ratio or measure. |
| `WP03-BWFLAKES-20261010-S05` | Markal, producer, [Flocons de sarrasin bio](https://www.markal.fr/produit/flosac500-flocons-sarrasin) | Lists the product as buckwheat flakes with buckwheat as its only ingredient and suggests breakfast, porridge, and sweet/savoury uses. Its 500 g pack and 8 portions of 62.5 g are package-specific; there is no cup conversion. The page does not establish that all flakes have the same process. |
| `WP03-BWFLAKES-20261010-S06` | OQLF, [grain entier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544101/grain-entier), 2018 | Includes sarrasin among whole-grain sources and says whole grains can be flaked. It supports the flaked-grain boundary but does not establish that every marketed buckwheat flake retains every whole-grain component. |
| `WP03-BWFLAKES-20261010-S07` | Priméal, [Flakes Sarrasin 250 g](https://primeal.bio/fr/nos-produits/autres/flakes-de-sarrasin-bio-250g/) | Shows a different ready-to-eat mixed cereal made with maize, buckwheat flour, sugar, glucose syrup, and salt. This supports excluding mixed “buckwheat flakes” cereal formulations from the plain-grain identity. |
| `WP03-BWFLAKES-20261010-S08` | Botanic, [Priméal Flocons de sarrasin bio, 350 g](https://www.botanic.com/produit/349453/flocons-de-sarrasin-bio-en-sachet-de-350-g.html) | Matches the Priméal 350 g pack and whole-grain composition. Its preparation direction is 1 volume flakes to 3 volumes liquid, while Priméal's own page says 1:2 for the named product. These conflicting SKU instructions remain source-specific and do not support a shared preparation ratio or yield. |

## Forms, measures, yields, and substitutions

| Aspect | Evidence-qualified disposition |
|---|---|
| Identity vs. form | Use one separate product identity because flaking is the defining grain processing, as with active corn, barley, and quinoa flake products. Add no `IngredientForm`; no recipe requires dry/cooked flakes or a prepared porridge state. |
| Density and unit mappings | Keep `defaultDensity: null` and `unitMappings: []`. The 350 g and 500 g amounts are package sizes; Markal's 62.5 g is a brand package portion. None establishes a cup-to-mass mapping or bulk density. |
| Preparation instructions and yield | Add no general liquid ratio, conversion, or yield. Priméal says 1 volume flakes to 2 volumes liquid; Botanic lists 1 volume to 3 volumes for the same branded 350 g product. The source disagreement reinforces that preparation instructions are source-specific; neither establishes a reusable dry-to-cooked yield. |
| Substitution | Add no global or contextual rule. Product sources list uses in breakfast, porridge, baking, and savoury dishes but do not demonstrate interchangeability with oats, groats, flour, or another cereal for a named bundled recipe role. |

## Acceptance checks if integrated

1. Add only `ingredient-ref-buckwheat-flakes` with `buckwheat flakes / flocons de sarrasin`, empty alias arrays, `GRAIN_AND_CEREAL`, null default density, and no unit mappings.
2. Preserve active buckwheat flour, roasted dry buckwheat groats, soba noodles, barley flakes, corn flakes, and quinoa flakes as separate identities; do not create alias links between them.
3. Verify exact normalized searches for `buckwheat flakes` and `flocons de sarrasin` resolve to the new row. Broad `buckwheat` / `sarrasin`, French `blé noir`, and mixed breakfast-cereal queries must not be represented as exact aliases.
4. Keep recipe links, forms, measurements, density, unit mappings, yields, conversions, and substitution rules absent unless future bundled demand and scoped evidence justify them.

## Remaining Section F gaps

This proposal covers one preprocessed grain product only. Section F still retains the plan's open rice/farro/barley-name questions, generic grits/polenta and hominy/pozole/dried-sweet-corn holds, further puffed and regional products, species-level and product review across millet, sorghum, fonio, quinoa, and amaranth, regional cereal mixes, remaining source-qualified dry/cooked forms, and independent Québec French review. Do not treat this identity proposal as resolving any of those separate scopes.
