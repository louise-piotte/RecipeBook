# WP05 Section S — infused oils and cooking-spray boundary review

- **Review date:** 2026-10-12
- **Disposition:** proposal only; no canonical catalog, ledger, checklist, roadmap, or integration file changed
- **Scope:** garlic, scallion/green-onion, annatto/achiote, and other infused oils; existing chili oils; oil spray and cooking spray
- **Plan state:** Section S remains open.

## Recommendation

Recommend one identity-only candidate: **garlic-infused oil / huile infusée à l’ail**, with no aliases and no recipe links. A Québec producer describes a ready-to-use garlic-infused oil in French and English; another Canadian product page uses garlic-infused wording for a separate olive-oil product. These sources support a bounded culinary product class, while their different oil bases and product descriptions do not establish one formula. Keep the base oil, source ingredients, and any product-specific wording out of the generic identity. [S01–S03]

This narrows the earlier Section S proposal, which held all garlic-infused oils pending more evidence. The new Québec product and Canadian product evidence supports this one named culinary class; it does not support a generic `infused oil` identity or aliases such as `garlic oil`, `huile à l’ail`, `huile aromatisée à l’ail`, `oil`, or `huile`. A Québec food-directory listing separately identifies chopped garlic in water and vegetable oil as a ready-to-use garlic product, so do not map that preparation to infused oil. [S01–S04]

Keep the already-integrated **chili oil** and **Chiu Chow Style Chili Crisp Oil** as separate active identities under `SAUCE_AND_CONDIMENT`. Do not add Section S duplicates or aliases between them. Hold scallion/green-onion oil, annatto/achiote oil, other flavored or infused oils, and cooking spray/oil spray. [S05–S10]

No recipe link is warranted. The corpus contains no garlic-infused, scallion, annatto, chili-oil, or chili-crisp ingredient rows. The sole oil-spray row is unlinked and does not specify its oil source or product format.

## Repository audit

I checked the current split seed, the Section S checklist, the workflow checkpoint, relevant WP05 proposals and integration reports, legacy identities, research ledger, and all manifest-listed recipes. This working-tree snapshot contains **1,135 references, 79 forms, 71 legacy candidates, 114 recipes, 1,123 ingredient rows, and 1,432 ledger records**. Counts should be refreshed before any later integration.

- Active references include `ingredient-ref-chili-oil` (`chili oil / huile de piment rouge`) and `ingredient-ref-chiu-chow-style-chili-crisp-oil` (`Chiu Chow Style Chili Crisp Oil / huile au piment croustillante de type Chiu Chow`). Both have no aliases, and each has an accepted identity record in the ledger. The earlier WP05 condiment review and integration batch already establish their separate scopes. [S05–S07]
- No active reference, form label/match term, or legacy candidate owns the exact phrases `garlic-infused oil`, `garlic oil`, `scallion oil`, `green onion oil`, `annatto oil`, `achiote oil`, `infused oil`, `oil spray`, `cooking spray`, or `enduit à cuisson`. No other relevant infusion/spray ledger record was found.
- `ingredient-ref-garlic` owns `garlic / ail`, with only the clove aliases; `ingredient-ref-green-onions` owns `green onions / oignons verts` and aliases for bare `scallion`/`green onion` terms. Neither row owns an oil phrase. In particular, do not turn the existing `scallion` alias into `scallion oil` or reverse-map a flavored oil to the vegetable.
- The current `canola oil`, `vegetable oil`, and `olive oil` rows remain separate displays with no aliases. Neither bare `oil` nor `huile` has an exact active display or alias owner. Do not assign the spray line to canola or vegetable oil from the word `oil` alone.
- The animal-fat/spreads proposal separately records the six linked margarine rows and the unresolved spray row; this packet does not reopen its lard, suet, tallow, shortening, spread, or margarine decisions.

The relevant current records are [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy import identities](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json). The open checklist is in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt); workflow integration notes are in the [ingredient-catalog workflow](../ingredient-catalog-workflow.md).

## Recipe-demand scan

I searched ingredient `originalText`, `ingredientName`, and `ingredientRefId` fields, then checked the bilingual instruction strings, across all **114 manifest-listed recipes and 1,123 ingredient rows**.

| Wording or product family | Ingredient-row result | Disposition |
|---|---:|---|
| Garlic-infused oil; garlic oil | 0 | Candidate identity has no recipe link. Keep garlic and oil-source rows distinct. |
| Scallion/green-onion oil; annatto/achiote oil; other infused oil | 0 | Hold; no recipe demand or product-specific alias. |
| Chili oil; Chiu Chow-style chili crisp oil | 0 | Existing active identities remain unchanged; no duplicate or recipe link. |
| `oil spray` | 1: `033#8` | Unlinked; `originalText` and `ingredientName` are both `oil spray`, with no `ingredientRefId`. |
| `cooking spray` / `enduit à cuisson` | 0 | Method wording only; it does not create more ingredient rows. |

The source for recipe `033#8`, [Air Fryer Churros](https://platedcravings.com/air-fryer-churros/), lists `oil spray` and repeats that wording in the directions. It does not name an oil or say whether the spray is an aerosol can or oil dispensed through a reusable sprayer. [S11]

In the bundled instructions, English `cooking spray` appears in recipes `019`, `023`, `033`, `050`, and `054`; French `enduit à cuisson` appears in `019`, `020`, `023`, `033`, `050`, and `054`. Those are preparation instructions, not evidence for a single ingredient formulation.

## Identity and alias decisions

| Candidate | Recommendation | Identity/alias decision and boundary |
|---|---|---|
| Garlic-infused oil | **Recommend one identity-only candidate** | `garlic-infused oil / huile infusée à l’ail`. Likely `FAT_AND_OIL`. No aliases, forms, numbers, conversions, substitutions, or recipe links. Scope it to a ready-to-use culinary oil product deliberately infused with garlic. Do not include base-specific labels, chopped garlic in oil, standalone garlic, or plain oil plus garlic. [S01–S04] |
| Bare `garlic oil`, `huile à l’ail`, `huile aromatisée à l’ail` | **No aliases** | Reviewed pages use more specific product wording; they do not make every garlic-oil preparation the same identity. Keep the alias set empty unless a matching recipe or an authoritative product standard warrants particular phrases. [S01–S04] |
| Chili oil | **Preserve active identity** | Keep `ingredient-ref-chili-oil` as `chili oil / huile de piment rouge`; do not duplicate under fats/oils or alias it to chili crisp, chili sauce, or the base oil. [S05, S07] |
| Chiu Chow Style Chili Crisp Oil | **Preserve active identity** | Keep the source-qualified name and separate identity. Do not broaden it to generic chili crisp or plain chili oil. [S06–S07] |
| Scallion/green-onion oil | **Hold** | A Canadian seller names one `Green Onion Infused Olive Oil`; a Québec product seller names a sesame-oil product infused with Japanese green onion and ginger. These examples do not define one unqualified product. OQLF maps `green onion`, `scallion`, and `spring onion` to `oignon vert` in its vegetable entry and notes Québec usage confusion among `oignon vert`, `échalote`, and `ciboule`. Do not add oil phrases to the green-onion reference or use `échalote` as an oil alias. [S08–S09] |
| Annatto/achiote oil | **Hold** | The Culinary Institute of America names an `Annatto Oil / Aceite de Achiote` preparation made by infusing annatto seeds in vegetable oil. OQLF’s `rocou` entry describes a coloring material used for coloring oils; it does not supply a Québec culinary product name for an annatto-infused oil. Do not activate `huile de rocou`, `achiote oil`, or `annatto oil` from this evidence alone. [S10] |
| Generic infused/flavored oil | **Hold umbrella identity** | Infused products vary in flavoring material, base oil, and product wording. Keep any future source-supported product family narrow and do not alias an infused oil to the source oil. [S01–S03, S08–S09] |
| Cooking spray / oil spray / enduit à cuisson | **Hold identity and aliases** | The recipe’s `oil spray` wording does not choose a source oil or dispenser. A Canadian retail listing for one canola cooking aerosol calls it `enduit à cuisson huile de canola` and lists canola oil with other ingredients and propellants; that is evidence for one formulated SKU, not for the recipe’s intended product or every oil sprayer. Keep the recipe row unlinked; do not add `oil spray`, `cooking spray`, or `enduit à cuisson` to canola oil, vegetable oil, or a generic spray identity. [S11–S12] |

## Source register

The identifiers below are local to this proposal; no research-ledger records were written.

| ID | Source | What it supports and does not establish |
|---|---|---|
| `WP05-S-INFUSED-SPRAY-20261012-S01` | TournevenT, Québec producer, [Huile végétale biologique infusée à l’ail](https://tournevent.ca/products/huile-vegetale-biologique-infusee-a-lail) | French product name and description for a ready-to-use garlic-infused oil; identifies this producer’s canola/hemp/garlic product. It does not make that formula universal. |
| `WP05-S-INFUSED-SPRAY-20261012-S02` | Plaisirs Gourmets, [English product listing](https://www.fromagesduquebec.qc.ca/en/catalogue/huile-vegetale-infusee-a-lail/) and [French product listing](https://www.fromagesduquebec.qc.ca/fr/catalogue/huile-vegetale-infusee-a-lail/) | Paired Québec English/French product names: `Garlic Infused Canola and Hemp Vegetable Oil` and `huile végétale infusée à l’ail`. Product-specific wording, not a standard definition. |
| `WP05-S-INFUSED-SPRAY-20261012-S03` | Fody Foods Canada, [Huile d’olive aromatisée à l’ail](https://fodyfoods.ca/fr/products/garlic-infused-olive-oil-2-pack) | Canadian page calls the product garlic-aromatized/infused olive oil and identifies olive oil with garlic in its ingredient list. This supports a second oil base and related wording; it does not establish `huile aromatisée à l’ail` as a universal alias. |
| `WP05-S-INFUSED-SPRAY-20261012-S04` | Québec government, [Québec Food Directory — Garlic Chopped in Oil Via Italia](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/73942) | Product listing names a ready-to-use chopped-garlic preparation containing water and vegetable oil. This is a compound garlic product, not evidence that chopped garlic in oil is garlic-infused oil. |
| `WP05-S-INFUSED-SPRAY-20261012-S05` | Lee Kum Kee Canada, [Chili Oil](https://ca.lkk.com/en/products/chili-oil) and [Huile de piment rouge](https://ca.lkk.com/fr-ca/products/chili-oil) | Paired product names for the already-integrated chili-oil identity. Reuse existing evidence IDs `WP05-EASP-FU-20261010-S08` and `S14`; no new identity is proposed here. |
| `WP05-S-INFUSED-SPRAY-20261012-S06` | Lee Kum Kee Canada, [Chiu Chow Style Chili Crisp Oil](https://ca.lkk.com/en/products/chiu-chow-style-chili-oil) and [Huile au piment croustillante de type Chiu Chow](https://ca.lkk.com/fr-ca/products/chiu-chow-style-chili-oil) | Paired names for the already-integrated, style-qualified crisp-oil identity. Reuse existing evidence IDs `WP05-EASP-FU-20261010-S09` and `S15`; no duplicate is proposed. |
| `WP05-S-INFUSED-SPRAY-20261012-S07` | [WP05 East Asian sauce/preserve follow-up](wp05-east-asian-sauce-preserve-followup-20261010.md) and [regional sauce integration report](../batches/wp02-wp04-wp05-regional-flours-sauces-counts-integration-20261010/README.md) | Existing Section W decisions and integrated IDs for chili oil and Chiu Chow-style chili crisp oil. |
| `WP05-S-INFUSED-SPRAY-20261012-S08` | OQLF, [oignon vert (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083674/oignon-vert) | Preferred Québec terms `oignon vert` and `oignon nouveau`, English equivalents including `green onion`, `scallion`, and `spring onion`, and a note about Québec usage confusion. It defines the vegetable, not an infused oil. |
| `WP05-S-INFUSED-SPRAY-20261012-S09` | [Green Onion Infused Olive Oil](https://oandvtastingroom.ca/products/green-onion-olive-oil) and [Huile de sésame à l’oignon vert](https://tokusen.store/collections/huile-de-sesame/products/huile-de-sesame-a-loignon-vert) | Retail product examples with different base oils and wording; the sesame-oil product also includes ginger. They do not establish one generic bilingual identity or aliases. |
| `WP05-S-INFUSED-SPRAY-20261012-S10` | Culinary Institute of America, [Vibrant Dishes of Latin America course guide](https://www.ciaconsulting.org/wp-content/uploads/2024/12/CIP-Vibrant-Dishes-of-Latin-America-Course-Guide-2025-v.100.pdf), page 9; OQLF, [rocou (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17498322/rocou) | CIA pairs the name `Annatto Oil` with Spanish `Aceite de Achiote` and gives one seed-in-vegetable-oil preparation. OQLF defines `rocou` as a colorant used in oils, not as a named culinary oil product. Neither establishes a preferred Québec French identity for this product. |
| `WP05-S-INFUSED-SPRAY-20261012-S11` | Plated Cravings, [Air Fryer Churros](https://platedcravings.com/air-fryer-churros/) | Source recipe `033` uses the ingredient and direction wording `oil spray`; it does not identify the oil source or delivery format. |
| `WP05-S-INFUSED-SPRAY-20261012-S12` | Walmart Canada, [Enduit à cuisson huile de canola Great Value](https://www.walmart.ca/fr/ip/Enduit-cuisson-huile-de-canola-Great-Value/6000205247896) | One Canadian French-labeled pressurized canola cooking-spray product lists oil plus other ingredients and propellants. Retail listing is product-specific and does not establish a universal spray formulation. |

## Limitations

- Product listings support their own display wording and formulas; they are not compositional standards for every flavored oil or spray.
- The proposed garlic-oil French display follows a Québec producer’s culinary product wording. No OQLF terminology entry for this prepared-oil class was identified in this review.
- The culinary annatto source pairs English and Spanish names but does not resolve a Québec French display. The OQLF `rocou` entry is cited only for its narrower colorant terminology.
- Recipe demand is absent for all infused-oil candidates. The garlic identity is a catalog candidate only; it should not be linked to plain garlic, olive oil, canola oil, vegetable oil, chopped garlic in oil, or any recipe without explicit wording.
- The retail spray listing describes one canola aerosol. It does not resolve whether recipe `oil spray` means an aerosol, a refillable sprayer, or a different product.

No tests or emulator checks were run because this deliverable is proposal-only.
