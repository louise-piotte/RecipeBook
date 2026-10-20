# WP05 Chimichurri — Québec identity and boundary review

**Date:** 2026-10-11
**Status:** Integrated on 2026-10-11 as an identity-only reference. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the canonical row and verification.
**Scope:** One open Section Z product, chimichurri sauce. This review excludes Salsa Lizano, all sambal products, chunjang, and the active black-bean-sauce identity.

## Recommendation

**Accept one identity-only `SAUCE_AND_CONDIMENT` reference** for prepared chimichurri sauce:

| Seed field | Value |
|---|---|
| ID | `ingredient-ref-chimichurri-sauce` |
| English display | `chimichurri sauce` |
| Québec French display | `sauce chimichurri` |
| English aliases | `chimichurri` |
| French aliases | `chimichurri` |
| Category | `SAUCE_AND_CONDIMENT` |
| Default density / unit mappings | `null` / none |

OQLF gives the French preferred terms `chimichurri` and `sauce chimichurri`, and the English terms `chimichurri` and `chimichurri sauce` [S01]. Québec product sources use the same name for prepared sauces [S02–S03]. This is a named sauce family with a clear local French name, not a generic sauce or alias for another herb condiment.

## Prior-review and plan audit

Section Z of `docs/RecipeBook-global-ingredient-catalog-plan.txt` still lists chimichurri among open Latin American condiment candidates. Searching prior WP05/WP06 proposals and batches found no focused chimichurri review or integration. The exact term appears in one earlier MENA packet only as a comparison for zhug; that comparison expressly does not support substitution. The Mexico/Central America sweep covers the generic-salsa boundary and named salsa macha, while the South American sweep covers pebre; neither resolves chimichurri. This proposal covers only the sauce identity and does not close the wider checklist.

## Live package, collision, and recipe audit

Snapshot read on 2026-10-11. The normalized-name check follows the current `IngredientSearch.kt` rules and phrase-first, substring-fallback search behavior.

| Artifact | Current state | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 906 references; no chimichurri reference | `44cf989104f478066169c8e1598603810e5851e24ba40034a961ec8eb4503a85` |
| `ingredient-forms.v1.json` | 48 forms; no chimichurri label or match term | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `docs/catalog/research-ledger.v1.json` | 1,160 records; no chimichurri record or source-ID-prefix collision | `50c05b93fc9f89a475869589858ec01e460176a69e0a54d12f84e81d98436ae4` |
| `docs/catalog/legacy-import-identities.v1.json` | 77 candidates; no chimichurri candidate | `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57` |
| `manifest.v1.json` | 114 recipe files; 1,123 ingredient rows | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

No exact normalized active reference, form, or legacy-name/alias match was found for `chimichurri`, `chimichurri sauce`, `sauce chimichurri`, or `sauce chimichurri épicée`. Searches for those phrases through the current reference index returned no active result. The proposed ID `ingredient-ref-chimichurri-sauce` is absent from references, forms, ledger records, and legacy candidates. The proposed source-ID prefix `WP05-CHIMICHURRI-20261011` was absent from the ledger, proposals, and batches before this file was created.

Relevant active neighbors are `ingredient-ref-pesto` (`pesto / pesto`), `ingredient-ref-zhug` (`zhug / zhug`), `ingredient-ref-chermoula` (`chermoula / chermoula`), `ingredient-ref-ajvar` (`ajvar / ajvar`), `ingredient-ref-trinidadian-green-seasoning` (`Trinidadian green seasoning / assaisonnement vert trinidadien`), `ingredient-ref-haitian-epis` (`Haitian epis / épis haïtien`), and `ingredient-ref-chipotle-in-adobo` (`chipotle in adobo / chipotle en adobo`). Keep each separate. Shared herbs, oil, heat, or color do not make these prepared products aliases or substitutes.

The generic legacy candidate `ingredient-ref-salsa` remains `unreviewed`, has no sources, and is absent from the active seed. It is not a chimichurri identity and is not proposed for promotion. No generic `salsa`, `salsa verde`, or `salsa roja` alias is proposed.

All 114 manifest-listed recipe files and 1,123 ingredient rows were searched across `originalText`, `ingredientName`, and `ingredientRefId`; a full-file text search also found no chimichurri mention. **Bundled ingredient-line hits: zero.** No recipe line or recipe link is proposed. Outside the bundle, a Québec Metro veal recipe uses the heading `Sauce chimichurri` and provides one homemade formula; that is local recipe usage, not an exact bundled product line or a universal formula [S04].

## Identity boundaries and data disposition

- **Include:** prepared chimichurri sauce, using the OQLF bilingual term pair. OQLF describes a South American sauce associated with grilled meats and notes preparation in several countries, including Argentina and Uruguay [S01].
- **Keep separate:** pesto, zhug, chermoula, Haitian epis, Trinidadian green seasoning, generic green sauce, salsa verde, salsa macha, and chipotle in adobo. Product names and recipe ingredients overlap, but the sources do not establish synonymy.
- **Composition:** do not encode a fixed recipe. OQLF's general definition names chopped parsley, garlic, and oregano with vegetable oil and vinegar; the Le Grand Québec product record lists parsley/cilantro, canola oil, rice vinegar, jalapeño, garlic, salt, and lactic acid [S01–S02]. These support a recognizable sauce identity while showing that a particular commercial formula must not become a universal one.
- **Forms:** none. Refrigerated ready-to-serve products and other package/storage presentations remain product-specific; this evidence does not define a global form-conversion chain.
- **Aliases:** only the direct borrowed headword `chimichurri` in each language. Do not add `sauce verte`, `green sauce`, `sauce piquante`, `Argentine sauce`, or ingredient-component names as aliases.
- **Recipe links:** none; the live bundled recipes have no matching line.

## Measurements, conversions, yields, and substitutions

Add no default density, unit mapping, volume-to-mass conversion, package yield, cooking yield, or substitution. The government product record lists one 156 g package and a nutrition serving of 4 tablespoons (60 g); those are this SKU's label facts, not a validated general kitchen conversion [S02]. A second Québec product listing offers other formats and another formulation [S03]. Do not combine unlike products to infer density.

The Metro source's component quantities belong to one homemade recipe; it does not validate a finished-sauce yield or convert a prepared product's volume to mass [S04]. No evidence supports a substitution ratio or a global replacement by pesto, zhug, chermoula, epis, or green seasoning.

## Source register

Sources checked on 2026-10-11.

| ID | Source | Supports and limits |
|---|---|---|
| `WP05-CHIMICHURRI-20261011-S01` | Office québécois de la langue française, [chimichurri](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544189/chimichurri), updated 2018. | Preferred French terms `chimichurri` and `sauce chimichurri`; English terms `chimichurri` and `chimichurri sauce`; definition and South American context. This is terminology and general identity evidence, not a universal commercial formula. |
| `WP05-CHIMICHURRI-20261011-S02` | Government of Québec, [Québec Food Directory: Le Grand Chimichurri](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201375), last updated 2026-06-18. | Identifies a Québec-made prepared chimichurri condiment, product name, category, company, 156 g package, ingredients, refrigeration, and one nutrition-serving declaration. Product-record data are supplied by the company; MAPAQ disclaims responsibility for their accuracy. One SKU only. |
| `WP05-CHIMICHURRI-20261011-S03` | Aliments du Québec, [Risas Chimichurri](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/chimichurri). | Québec prepared-sauce product listing under `Chimichurri`, gives a product-specific herb/oil/pepper formula and package formats. It is product evidence, not a standard for all chimichurri. |
| `WP05-CHIMICHURRI-20261011-S04` | Metro Québec, [Côtelette de longe de veau vieillie, sauce chimichurri épicée](https://www.metro.ca/recettes-et-occasions/recettes/cotelette-de-longe-de-veau-vieillie-sauce-chimichurri-epicee), recipe dated 2023-03-06; recipe attributed to Veau du Québec and Famille Fontaine. | Local recipe uses the French term `sauce chimichurri` and gives one homemade version. Its ingredient quantities, marinade use, and storage note apply to that recipe only; they are not a packaged-product conversion, yield, or preservation rule. |

## Evidence limits and recommendation boundary

OQLF directly supports the Québec French name, and the Québec product registry confirms local prepared-product use. The evidence supports one identity-only chimichurri sauce reference, not universal composition, separate color variants, or a density/conversion/substitution. The broader Section Z condiment checklist remains open.

No tests were run during the source review. Implementation verification is recorded in the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).
