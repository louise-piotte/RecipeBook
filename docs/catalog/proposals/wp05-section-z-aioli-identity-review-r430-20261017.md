# WP05 Section Z — aioli identity review (R430)

- **Packet type:** proposal only; no shared catalog, ledger, plan, roadmap, recipe, README, index, or test files are changed.
- **Scope:** the still-open aioli item in the WP05 everyday sauce and condiment checklist, checked against active reference ownership, forms, legacy candidates, ledger decisions, picker results, and the full manifest-listed recipe corpus.
- **Prepared and source-access date:** 2026-10-17.
- **Disposition:** add one bounded identity-only row for aioli / aïoli. Keep qualified and adjacent products separate.

## Recommendation

Add the canonical pair **aioli / aïoli** in SAUCE_AND_CONDIMENT. The OQLF Grand dictionnaire terminologique gives aïoli and ailloli as preferred French terms and defines the named sauce as Provençal, made with crushed garlic, egg yolk, and olive oil. A current Canton Canada bilingual product pair uses Chipotle aioli / Aïoli chipotle for a Québec-prepared sauce. This supports the French display and English spelling while keeping Canton’s chipotle qualifier product-specific. [S01–S03]

Use only the French spelling ailloli as an alias, because OQLF lists it as a preferred variant. Keep English aliases empty; the English display already covers aioli. Do not alias garlic aioli, chipotle aioli, garlic mayonnaise, generic garlic sauce, sauce à l’ail, Toum, mayonnaise, or aioli-style mayonnaise dressing. The reviewed Canadian product pages use these qualified names for product-specific sauces, not as universal synonyms or formulations. [S02–S04]

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-aioli |
| nameEn | aioli |
| nameFr | aïoli |
| aliasesEn | [] |
| aliasesFr | [ailloli] |
| category | SAUCE_AND_CONDIMENT |
| defaultDensity | null |
| unitMappings | [] |
| updatedAt | 2026-10-17T00:00:00Z |

Add one ledger record for ingredient-ref-aioli with identityState verified, measurementState researched_no_supported_value, and substitutionResearchState not_yet_researched. Attach S01–S05 as terminology, product-boundary, and measurement-exclusion evidence. Add no measurement observation, form, conversion, package yield, recipe link, or substitution finding/rule. S05’s Canadian Nutrient File portion values describe food code 531, commercial regular mayonnaise; do not copy them to aioli. [S05]

## Checklist, prior decisions, and current ownership

The WP05 Section Z line in docs/RecipeBook-global-ingredient-catalog-plan.txt still lists aioli alongside ketchup, mustards, mayonnaise, tartar sauce, remoulade, horseradish sauce, Worcestershire, brown sauce, steak sauce, and barbecue sauces. The line remains open. Prepared horseradish is already an identity from R426, and tartar sauce was accepted and integrated from R429; neither is part of this proposal.

The current package has 1,725 active ingredient references and 141 forms. No active reference uses aioli, aïoli, or ailloli as a name or alias. No active form contains these terms. The legacy import file has 56 candidates and no aioli/aïoli candidate. The four nearby active identities are:

| Current reference | Names and relevant terms | Boundary |
|---|---|---|
| ingredient-ref-mayo | mayonnaise / mayonnaise; mayo in both alias lists | Plain mayonnaise. Its ledger decision explicitly says to keep aioli distinct. |
| ingredient-ref-toum | toum / sauce toum; French alias sauce libanaise à l’ail (toum) | Lebanese/Levantine garlic condiment. Its accepted ledger decision keeps generic garlic sauce, aioli, and mayonnaise separate. |
| ingredient-ref-garlic | garlic / ail | Garlic itself, not a prepared condiment. |
| ingredient-ref-tartar-sauce | tartar sauce / sauce tartare; English alias tartare sauce | Separate Section Z condiment recently integrated from R429. |

The current evidence ledger has 2,084 records, 9,450 source entries, 8,009 unique source IDs, and 6,725 unique source URLs. It has no aioli/aïoli identity record. The mayo and Toum records include explicit decisions preserving these boundaries; those decisions are evidence about separation, not existing aioli ownership. The five proposed source IDs WP05-AIOLI-R430-20261017-S01 through S05 were searched against the current ledger and catalog documentation; no collision was found.

## Picker projection

Picker behavior was projected from IngredientReferenceSearchIndex in app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt. It normalizes accents and prefers complete word phrases before using substring fallback. The projected row uses only the OQLF-backed spelling ailloli as a French alias; no product-qualified alias is proposed.

| Query | Current result(s) | Projected result(s) |
|---|---|---|
| aioli; aïoli | none | ingredient-ref-aioli |
| ailloli | none | ingredient-ref-aioli |
| garlic aioli; chipotle aioli | none | none |
| garlic; ail | Existing garlic-related results (eight for each query) | unchanged; the proposed terms do not contain garlic or ail as separate words |
| mayonnaise; mayo | ingredient-ref-mayo | unchanged: ingredient-ref-mayo |
| toum; sauce toum | ingredient-ref-toum | unchanged: ingredient-ref-toum |
| garlic sauce; sauce à l’ail | none | none |
| remoulade | none | none |

The English/French spellings aioli and aïoli normalize to the same exact query. Ailloli is a distinct spelling, so it is available through its explicit alias. The broad garlic/ail searches keep their current owners: adding a garlic-containing alias would broaden those crowded searches and is not needed by the bundled recipe corpus. Qualified product phrases such as chipotle aioli and garlic aioli remain unresolved by design.

## Complete bundled-recipe scan

The manifest lists 114 recipe files containing 1,123 ingredient rows. A recursive scan of every manifest-listed recipe JSON value found no aioli, aïoli, ailloli, or remoulade mention, and the ingredient-row scan found no candidate ingredient line or recipe link.

Two adjacent mayonnaise rows remain linked to ingredient-ref-mayo:

| Recipe and ingredient row | Existing mapping |
|---|---|
| 019 Boulettes de crabe / Crab Balls, ingredient 13: 1/4 cup mayonnaise | ingredient-ref-mayo |
| 101 Sauce Big Mac / Big Mac Sauce, ingredient 1: 1/2 cup mayonnaise | ingredient-ref-mayo |

These authored mayonnaise lines are not aioli demand and should remain unchanged. The absence of any aioli line also means no form, recipe-line link, portion observation, or recipe-specific substitute is supported by this corpus.

## Measures, forms, and substitutions

The reviewed Canton product pages name a chipotle aioli sauce but give no reusable mass or serving conversion in their text. A Canadian retailer’s listing for one Hellmann’s item calls it Garlic Aioli Sauce Style Mayonnaise Dressing, gives a 340 mL package and a 1 tablespoon serving, and identifies the product number as 00068400003021. Its listed sale period ended before this review date, so it is used only as product-label evidence; a volume serving and package size are not a mass or a generic density. [S04]

Health Canada CNF food code 531 is explicitly Salad dressing, mayonnaise, commercial, regular / Vinaigrette, mayonnaise, commerciale, régulière. Its published 15 mL = 14.0 g and 30 mL = 28.0 g values belong to that code-specific mayonnaise entry, not to aioli. Keep those observations out of the proposed aioli record and do not activate a mayonnaise-to-aioli mapping. [S05]

- Keep defaultDensity null and unitMappings empty.
- Record no measure observation for aioli.
- Add no ingredient form or form conversion.
- Keep substitutionResearchState not_yet_researched; add no substitution finding or rule.
- Add no package yield or recipe-line link.

The proposed measurement state is researched_no_supported_value because no reviewed source provides a reusable mass, density, or conversion for aioli. The substitution state remains not_yet_researched because this proposal does not evaluate replacement ingredients or ratios.

## Evidence limits and implementation recommendation

OQLF’s generic culinary definition gives a classic sauce basis, while the current Québec-made Canton product is explicitly chipotle-flavoured. A separate Canadian retailer labels a garlic-flavoured commercial product as a mayonnaise-style dressing. These sources support the name aioli / aïoli and its separation from the existing plain mayonnaise and Toum identities; they do not establish one formula shared by all commercial products. Keep the catalog row identity-only and do not absorb chipotle, garlic mayonnaise, or garlic-sauce product titles as aliases. [S01–S04]

Implement only the identity row and ledger record described above. Preserve the existing mayonnaise, Toum, garlic, prepared-horseradish, and tartar-sauce rows. Leave the remaining WP05 Section Z sauces and condiments open for their own review.

## Sources accessed 2026-10-17

| ID | Source and locator | Support and limits |
|---|---|---|
| **WP05-AIOLI-R430-20261017-S01** | Office québécois de la langue française, Grand dictionnaire terminologique, [aïoli](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8975358/aioli), preferred terms and definition; updated 1991. | Gives aïoli and ailloli as preferred French terms. Defines the Provençal sauce as crushed garlic with egg yolk and olive oil. It is terminology and a culinary definition, not a commercial recipe standard. |
| **WP05-AIOLI-R430-20261017-S02** | Canton, [Aïoli chipotle](https://cantoncanada.com/produits/sauces/sauce-aioli-chipotle/), product title, description, and Aliments Préparés au Québec mark. | Current Québec-facing manufacturer page calls the product Aïoli chipotle and describes it as a sauce. It supports local French product wording; chipotle and the stated lower-salt comparison belong to this product only. |
| **WP05-AIOLI-R430-20261017-S03** | Canton, [Chipotle aioli](https://cantoncanada.com/en/products/sauces-en/chipotle-aioli-sauce/), English page paired through the manufacturer’s language switch. | Uses Chipotle aioli for the English page corresponding to S02. Supports aioli as the English spelling in a current Canadian manufacturer product name, not a generic alias for the full flavored title. |
| **WP05-AIOLI-R430-20261017-S04** | Save-On-Foods, [Hellmann’s Garlic Aioli Sauce Style Mayonnaise Dressing](https://www.saveonfoods.com/product/hellmanns-garlic-aioli-sauce-style-mayonnaise-dressing-id-00068400003021), product page, ingredients, package, serving, and product number. | One Canadian-made product listing uses an aioli and mayonnaise-style title, with canola oil and roasted garlic puree in its ingredient list. It is product-specific and its listed sale period ended 2026-09-17; it does not establish general synonymy or a Québec French display. |
| **WP05-AIOLI-R430-20261017-S05** | Health Canada, Canadian Nutrient File, [food code 531 serving portions](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=531), food description and portions. | Identifies commercial regular mayonnaise and gives its code-specific portions, including 15 mL = 14.0 g and 30 mL = 28.0 g. This is an exclusion boundary, not evidence for aioli and not a reusable mapping. |

## Snapshot

Counts and SHA-256 values describe the live workspace snapshot reviewed on 2026-10-17. For the recipe corpus digest, recipe basenames are sorted lexically and each basename, NUL byte, exact file bytes, and NUL byte are hashed in sequence.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| ingredient-references.v1.json | 1,725 references | d8fc4488a59383b1a7e834c8b5f337ff96f71a624c6210be409d7fa4f13d4d7e |
| ingredient-forms.v1.json | 141 forms; no aioli form | 2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed |
| research-ledger.v1.json | 2,084 records; 9,450 source entries | 6e1b2e1b854dffc93c766851478c1895372284e4b0a156b3091bb19c8b0058c7 |
| legacy-import-identities.v1.json | 56 candidates; no aioli candidate | 8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720 |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe JSON set | 114 files; 1,123 ingredient rows | e8bc3c3f49274719d3307dab241227458e2492f12c47506eaf7fdcb214bb533c |
