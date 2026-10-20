# WP03 Section G gnocchi identity review

- **Reviewed:** 2026-10-10
- **Status:** reviewed and integrated on 2026-10-10; the catalog identity and product-scoped ledger observations were added.
- **Owner:** WP03 identity research for one named pasta/dumpling-shaped product.
- **Scope owned:** the generic gnocchi ingredient identity and its exact English/Québec French naming boundary.
- **Deferred:** spaetzle; broad pasta; other pasta shapes; filled Asian dumplings; stuffed or flavored gnocchi products; Roman-style semolina preparations; dry/fresh/cooked forms; measurements and conversions; recipe relinking; substitution rules; and all other Section F/G candidates. The Section G checklist remains open.
- **Repository snapshot:** the live bundled package has 799 ingredient references (74 in `GRAIN_AND_CEREAL`), 36 ingredient forms, 1,025 research-ledger records with 2,206 source entries, and 81 legacy-import candidates. The manifest lists 114 recipes; those recipe files contain 1,123 ingredient rows. No current gnocchi reference, form, dedicated ledger record, or legacy candidate exists. The sole ledger text mention is the spaetzle decision that explicitly keeps gnocchi separate. No earlier gnocchi-specific proposal was found.
- **Work performed:** rechecked the current plan and proposal set; audited exact normalized catalog/form keys, ledger and legacy identities, active substitution data, and every manifest-listed recipe ingredient row; consulted OQLF and Québec product sources. This packet does not close Section G.

## Candidate decision

Recommend one specific product identity for coordinator review:

| Proposed ID | English display | fr-CA display | English aliases | fr-CA aliases | Category |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-gnocchi` | `gnocchi` | `gnocchi` | none | `gnocchis` | `GRAIN_AND_CEREAL` |

OQLF gives `gnocchi` as both the English translation and the preferred French singular, and explicitly gives `gnocchis` as its French plural [S01]. The French display can therefore use the same unaccented singular as English; only the French plural needs an alias. No extra spelling, translation, descriptive phrase, or Italian variant is established as an exact synonym by the reviewed Québec terminology source.

OQLF places the term in the food/pasta domain and defines the preparation as often ball-shaped and made from potato, flour, or semolina; eggs and cheese may also be added [S01]. This supports a named product that is not limited to potato gnocchi or to one universal recipe. Use `GRAIN_AND_CEREAL` in line with the existing generic pasta and spaetzle entries. The category and separate row are catalog choices: OQLF's domain classification alone does not make `gnocchi` an alias for the broader `ingredient-ref-pasta`.

### Accept and hold boundaries

| Candidate phrase or property | Disposition | Reason and limit |
| --- | --- | --- |
| `gnocchi` | **Accept** as both displays. | OQLF supports the English translation and preferred French singular. |
| `gnocchis` | **Accept** as the French plural search alias only. | OQLF expressly gives `des gnocchis`; do not change the French display to the plural. |
| `potato gnocchi`, `gnocchi de pomme de terre`, `gnocchi de pommes de terre`, `semolina gnocchi`, `ricotta gnocchi` | **Hold** as qualified product descriptions, not aliases. | Potato, flour, semolina, egg, and cheese can describe different formulations; the qualifiers may matter to a recipe or allergen profile. OQLF supports a broad gnocchi identity but not these phrases as exact cross-locale synonyms. No bundled recipe demands them. |
| `gnocchi alla romana` / `gnocchi à la romaine` | **Hold** for a separate style review. | The OQLF definition includes semolina as a possible base, but does not identify this named Roman preparation as interchangeable with generic gnocchi. Do not broaden the generic alias set from the ingredient overlap. |
| `gnocchi à poêler`, stuffed/flavored gnocchi, and branded meal products | **Hold** as product-specific variants. | Québec manufacturer pages distinguish fresh potato, skillet, and filled varieties with different ingredients and cooking instructions [S05–S06]. Do not collapse filling or brand variants into aliases or infer that every such product is the plain ingredient. |
| `dumpling`, `dumplings`, `potato dumpling(s)`, `quenelle(s)` | **Do not alias.** | These are broader descriptive or culturally specific terms, not the OQLF preferred gnocchi name. OQLF's `ravioli asiatique` entry uses `dumpling` for a filled Asian dish; that does not name gnocchi [S03]. |
| `spaetzle`, `spätzle` | **Keep separate.** | The live `ingredient-ref-spaetzle` already owns these exact keys. OQLF describes spaetzle as an Alsatian/South German flour dough, often with egg and cream, cut or formed as small pieces and usually boiled; that is a named product distinct from gnocchi [S02]. |
| `pasta`, `pâtes alimentaires`, `noodles`, `nouilles` | **Keep the broad identities separate; do not alias.** | Generic pasta already has its own reference. Gnocchi is a specific named product; shared category, dough ingredients, or a broad OQLF pasta-domain classification do not make the names synonyms. |

This recommendation covers the plain, unqualified ingredient named `gnocchi`. It does not create a generic dumpling identity or merge gnocchi with the existing spaetzle row. In this catalog, separate exact identities for specifically named products can coexist under the broad pasta category. The distinction is a normalization boundary, not a claim that every culinary source classifies gnocchi outside pasta or dumpling families.

## Formulation, preparation, and measurement limits

- **Formulation:** OQLF's broad definition allows potato, flour, or semolina bases and says eggs or cheese are sometimes added [S01]. A Québec Food Directory record for one frozen O'Sole Mio product lists potato, flour, potato flakes, egg, oil, semolina, and salt; Olivieri's fresh potato gnocchi lists a different product-specific formulation with 64% potato purée and durum semolina [S04–S05]. These records establish market examples, not a universal recipe, gluten status, egg content, or fixed potato proportion.
- **Cooking and storage states:** OQLF says gnocchi are often poached; the Québec O'Sole Mio product gives a boil-until-floating instruction, while Olivieri separately describes a fresh product and skillet varieties [S01, S04–S06]. Boiling versus skillet cooking is preparation guidance; fresh versus frozen is a package/storage state. Neither is a reason by itself to add an ingredient form, form conversion, or cooking-yield relation. No form IDs are proposed.
- **Published serving observations:** the O'Sole Mio directory record reports a nutrition basis of 1 1/4 cup (215 g); the Olivieri page reports 1/2 cup (85 g) for its named fresh potato product [S04–S05]. These are product-specific label observations, not a universal gnocchi density or conversion. Package formats (1.2 kg and 350 g) also do not supply recipe-volume equivalents.
- **Measurements and mappings:** if later retained in the ledger, preserve the two label values as source-specific `portion_weight` observations with product and storage state identified. They do not justify `defaultDensity`, count-to-weight mapping, a generic cup-to-gram unit mapping, or dry/cooked yield. Keep `defaultDensity: null` and `unitMappings: []`; activate no conversion. A `researched_supported` measurement state would refer only to these documented product servings, not a general gnocchi measure.

## Substitution finding

Olivieri's French consumer guide describes gnocchi as a substitute for traditional fresh pasta and illustrates gnocchi in carbonara, soup, and salad contexts [S06]. This is manufacturer usage guidance, not a tested equivalence to every generic pasta shape or recipe role. It gives no comparable quantity or replacement cooking procedure, and the catalog's `pasta` reference is broad. Preserve the finding as source-scoped research only; do not activate a global or contextual rule, recipe-line link, or amount conversion. If the finding is later entered in the ledger, use `blocked_pending_evidence` for an actionable substitution rule until a source specifies a recipe context, target form, quantity, and preparation adjustments. No active substitution rule mentioning gnocchi was found in the current package.

## Exact-key, legacy, and recipe audits

### Normalized-key and identity audit

Audited reference displays and aliases plus form labels and match terms with the app's `normalizeIngredientSearchKey` behavior: lowercase, Unicode NFKD, ligature/accent folding, punctuation-to-space, and whitespace collapse. Proposed identity keys have no current exact owner:

| Proposed term | Locale and role | Normalized key | Current owner among 799 references and 36 forms |
| --- | --- | --- | --- |
| `gnocchi` | English and fr-CA display | `gnocchi` | none |
| `gnocchis` | fr-CA plural alias | `gnocchis` | none |

The neighboring exact keys remain distinct: `pasta` and `pâtes alimentaires` belong to `ingredient-ref-pasta`; `spaetzle` and normalized `spätzle` belong to `ingredient-ref-spaetzle`. `ingredient-ref-gnocchi` is absent from the references, forms, ledger IDs, and legacy candidates. No earlier gnocchi-specific proposal was found. A broad ledger text search finds only the spaetzle decision that says to retain gnocchi separately; it is not a gnocchi research record. The exact candidate phrases in the table above have no additional reference/form owner. No candidate phrase was found in the legacy-import candidate set.

### Bundled recipe demand

Scanned all 114 manifest-listed recipe JSON files and all 1,123 `ingredients[]` rows across `originalText`, `ingredientName`, and `ingredientRefId`. Exact candidate searches included `gnocchi`, `gnocchis`, `gnocco`, potato and semolina gnocchi phrases, French potato/ricotta/Roman-style phrases, and dumpling/quenelle descriptions. There were **zero ingredient-line hits** and **zero full recipe-file matches** for the gnocchi terms. No recipe relink, recipe-line form, measurement conversion, or substitution link is proposed.

## Recommended evidence states and acceptance checks

- **Identity:** consider `ingredient-ref-gnocchi`, `gnocchi / gnocchi`, French plural alias `gnocchis`, category `GRAIN_AND_CEREAL`. Mark identity verified only after coordinator acceptance; retain qualified product names and the broader dumpling/pasta terms outside the alias set.
- **Measurement:** preserve only the two identified published portion observations if useful. They support no generic density or conversion; keep `defaultDensity` null, `unitMappings` empty, and no forms or yield relations.
- **Substitution:** keep the Olivieri fresh-pasta suggestion as a source-scoped research finding; activate no rule. An actionable rule remains `blocked_pending_evidence` because no quantity or preparation adjustments are given.
- **Forms:** add none. Revisit package/storage or cooking-state forms only if an exact recipe need and state-specific conversion evidence emerge.
- **Boundaries:** retain the separate generic pasta and spaetzle identities; do not alias generic dumplings, filled Asian dumplings, qualified gnocchi formulations, or complete gnocchi dishes.
- **Merge-time:** repeat the exact normalized-key, legacy, ledger, substitution-rule, and full 114-recipe ingredient-row audits against the package being merged. Keep Section G open.

## Sources and source-to-claim map

Sources below were accessed on 2026-10-10. In-text `[S01]`–`[S06]` abbreviate the source IDs recorded on `ingredient-ref-gnocchi`.

- **WP03-GNOCCHI-20261010-S01 — OQLF, [gnocchi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359988/gnocchi), GDT** (updated 2003): classifies the term under food/pasta; defines the preparation as often ball-shaped and based on potato, flour, or semolina; notes optional egg and cheese; gives French preferred singular `gnocchi`, French plural `gnocchis`, and English `gnocchi`. Primary Québec naming and broad identity source.
- **WP03-GNOCCHI-20261010-S02 — OQLF, [spätzle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18047214/spaetzle), GDT** (updated 1995): pairs French `spätzle` and related orthographies with English `spaetzle`; describes a separately named flour dough product, often with egg/cream, formed as small pieces and typically poached. Supports keeping the live spaetzle identity distinct; does not establish a gnocchi alias.
- **WP03-GNOCCHI-20261010-S03 — OQLF, [ravioli asiatique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557603/ravioli-asiatique), GDT** (updated 2020): defines a filled Asian prepared dish and notes that `dumpling` is used in Québec for this broader family. Shows why unqualified `dumpling` is not a precise gnocchi synonym; it does not define all English uses of “dumpling.”
- **WP03-GNOCCHI-20261010-S04 — Québec Food Directory, [POTATO GNOCCHI, O'Sole Mio](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201819)** (record updated 2026-07-24; product data from GS1): records one 1.2 kg frozen product, classifies it under prepared/preserved pasta/noodles, lists its ingredient declaration, and provides the 1 1/4 cup (215 g) nutrition basis and product-specific boiling directions. Supports Québec product existence and a label observation only.
- **WP03-GNOCCHI-20261010-S05 — Olivieri, [Gnocchi frais à la pomme de terre](https://olivieri.ca/fr/produits/gnocchi-de-pomme-de-terre/)** (page publication date not shown): gives a 350 g fresh potato product, a product-specific ingredient list, and a 1/2 cup (85 g) nutrition basis; its related products include skillet varieties. Manufacturer evidence for product variants and label observations, not a general measure or composition.
- **WP03-GNOCCHI-20261010-S06 — Olivieri, [Gnocchi 101](https://olivieri.ca/fr/le-cuisine/gnocchi-101/)** (© 2021): discusses potato/semolina gnocchi, boiling and skillet preparation, filled varieties, and describes gnocchi as a substitute for traditional fresh pasta in suggested uses. Supports a limited consumer-use finding only; no comparable amount or universal substitution procedure is provided.

## Root integration review

Root verified the OQLF gnocchi entry, the Québec Food Directory frozen-product listing, and Olivieri's fresh-product and consumer-guide pages on 2026-10-10. Added `ingredient-ref-gnocchi` with only the French plural alias `gnocchis`. Recorded the two published label serving bases as separate product-specific portion observations, and kept Olivieri's fresh-pasta suggestion blocked from an actionable rule because amount, target form, and preparation adjustments are absent. No recipe link, form, density, unit mapping, yield, or active substitution was added.
