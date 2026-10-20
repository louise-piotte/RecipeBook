# WP04 Section O chicken-thigh cut boundary review — 2026-10-16

- **Packet type:** proposal-only identity and product-boundary review.
- **Open checklist item:** Section O lists thigh among meaningful meat cuts and chicken among food animals.
- **Scope:** the chicken thigh cut, identified in Québec French as haut de cuisse de poulet. This review does not cover turkey, duck, goose, other poultry species, a whole leg, a drumstick, bone/skin states, preparation states, or processed chicken products.
- **Recommendation:** accept a distinct identity-only candidate, chicken thigh / haut de cuisse de poulet, in PROTEIN. Keep aliases and forms empty.
- **Recipe demand:** none in the bundled corpus.
- **Audit snapshot:** 1,595 active references; 122 forms; 61 legacy candidates; 1,940 ledger records with 8,388 source entries; 114 manifest-listed recipe files and 1,123 ingredient rows.
- **Source IDs:** WP04-SECTION-O-CHICKEN-THIGH-20261016-S01 through S04 are proposal-local. The source-ID prefix and proposed identity/form IDs were checked for collision before writing.

## Why this candidate

The active Section O checklist explicitly includes poultry cuts, including thigh. The current catalog contains chicken breast and other chicken products, but no chicken-thigh identity. A chicken thigh is not the full leg: CFIA defines the leg as the thigh and drumstick together, and separately defines the proximal thigh and distal drumstick. Current MAPAQ terminology also names cuisse, haut de cuisse, and pilon separately in its Québec poultry overview.

The OQLF’s older haut de cuisse entry is broader and maps the term to English leg while listing cuisse and pilon as alternate terms. That conflicts with the cut distinctions in the current CFIA manual and the three-part wording on the current MAPAQ page. The proposal therefore uses the qualified CFIA/MAPAQ cut name and does not turn cuisse or pilon into aliases.

## Catalog, collision, archive, and source-ownership audit

The active references, forms, legacy candidates, and research ledger were checked for the exact normalized candidate name, plural spellings, French cut name, and neighboring whole-leg/drumstick phrases. No exact owner or matching form was found. The candidate ID ingredient-ref-chicken-thigh and form-ID prefix ingredient-form-chicken-thigh are unallocated. The proposed source IDs do not occur in the live ledger or proposal archive.

| Current record or phrase | Owner | Consequence |
| --- | --- | --- |
| chicken thigh; chicken thighs; haut de cuisse de poulet; hauts de cuisse de poulet | No exact owner in active references, forms, legacy candidates, or ledger. | A qualified cut identity is open. |
| chicken leg; cuisse de poulet | No exact owner found. | Do not use these as aliases for the thigh. CFIA defines the whole poultry leg as including both thigh and drumstick. |
| drumstick; pilon de poulet | No exact owner found. | Keep the distal leg cut outside this candidate. |
| pilon d’aile; wing drumette | No exact owner found for this boundary. | CFIA expressly says not to confuse pilon d’aile with pilon. They remain separate cuts. |
| chicken breast; poitrine de poulet | Active ingredient-ref-chicken-breast, PROTEIN. Its existing breast-specific aliases remain attached to that identity. | A different cut; do not alias breast terms to thigh or infer bone/skin status. |
| chicken broth, chicken stock, chicken bouillon, rendered chicken fat | Active stock/broth and FAT_AND_OIL identities. | These are distinct products; a broad chicken search may surface several chicken entries. |
| frog legs; cuisses de grenouille | Active ingredient-ref-frog-legs, PROTEIN. | The species-qualified French phrase does not own haut de cuisse de poulet. |

The older broad WP04 protein/dairy packet listed animal cuts as an open family but did not allocate or settle a chicken-thigh identity. The focused Section O proposal and batch archive search found no earlier chicken-thigh cut-boundary decision. The related active chicken-breast identity is the only nearby poultry-cut reference found; it does not establish a thigh identity.

The current picker normalizes accents and punctuation, tries complete word-phrase matches first, and uses substring matching only if there is no phrase match. With the proposed qualified display names, chicken thigh and haut de cuisse de poulet queries would identify this candidate. A broader chicken query can return multiple species-qualified chicken products, including chicken breast, stocks/broths, rendered fat, and this cut. No bare chicken, thigh, cuisse, or pilon alias is proposed.

## Recipe audit

The manifest lists 114 recipe JSON files. All files were parsed and every text field was scanned; all 1,123 ingredient rows were also checked for chicken thigh(s), thigh(s), haut de cuisse, cuisse(s) de poulet, chicken leg(s), drumstick(s), pilon(s) de poulet, and pilon d’aile.

**Result: zero matching recipe files and zero matching ingredient rows.** No recipe requests this cut, so no recipe link, relink, amount, state, or behavior is proposed. The open checklist and source-backed naming boundary support the identity candidate; the absence of recipe demand is a limit on priority and does not support forms or conversions.

## Candidate and held boundaries

| Candidate or boundary | Evidence | Disposition |
| --- | --- | --- |
| Chicken thigh / haut de cuisse de poulet | CFIA distinguishes the thigh from the whole leg and drumstick; MAPAQ uses haut de cuisse as a separate Québec poultry cut term. | **Accept as an identity-only PROTEIN candidate:** ingredient-ref-chicken-thigh. No aliases or forms. |
| Whole chicken leg / cuisse de poulet | CFIA defines the leg as including haut de cuisse and pilon, whether attached or separated. | **Hold as a separate cut identity** until a recipe/product request supports it. Never alias it to thigh. |
| Chicken drumstick / pilon de poulet | CFIA defines the distal part separately from the haut de cuisse. | **Hold as a separate cut identity.** Do not alias pilon to thigh. |
| Wing drumette / pilon d’aile | CFIA distinguishes pilon d’aile from pilon. | **Keep separate.** No cut identity is proposed in this packet. |
| Bone-in, boneless, skin-on, skinless, trimmed, whole-leg portions | CFIA’s wholesale nomenclature names several such product configurations, including boneless trimmed thigh and thigh with back portion. | **Hold as product qualifiers or future forms.** No recipe request or source set in this review supports adding forms or merging these configurations. |
| Turkey, duck, goose, and other poultry thighs | CFIA requires the bird species in poultry product descriptions; MAPAQ separately discusses chicken and turkey. | **Keep species-qualified.** No other poultry thigh identity is proposed. |
| OQLF haut de cuisse synonyms | OQLF’s 1998 entry maps haut de cuisse to English leg and lists cuisse/pilon; this is broader than current CFIA cut definitions and MAPAQ’s separate naming. | **Do not adopt the broader terms as aliases.** Retain the discrepancy as a terminology gap. |

## Proposed data shape

| Field | Proposal |
| --- | --- |
| ID | ingredient-ref-chicken-thigh |
| English display | chicken thigh |
| Québec French display | haut de cuisse de poulet |
| Category | PROTEIN |
| English aliases | none |
| French aliases | none |
| Density and unit mappings | none |
| Forms, measures, conversions, yields, and substitutions | none |
| Recipe links | none |

The French display is supported by the bilingual CFIA poultry cut manual and the current Québec MAPAQ poultry page. It is not represented as an OQLF-preferred equivalent because the OQLF entry uses a broader, conflicting definition.

## Evidence limits

- CFIA’s retail poultry meat-cuts manual supplies cut nomenclature and requires the bird species in the product description. Its poultry section covers several species; this proposal only names chicken.
- CFIA’s wholesale chicken nomenclature distinguishes whole leg, thigh, thigh with back portion, boneless trimmed thigh, and drumstick. It is evidence for cut boundaries, not a proposal to reproduce every wholesale product configuration as a recipe form.
- MAPAQ’s current page uses cuisse, haut de cuisse, and pilon as separate Québec poultry terms, but it does not provide the anatomical cut definitions. Those definitions come from CFIA.
- The OQLF haut de cuisse GDT entry was last updated in 1998 and does not follow the distinctions in the current CFIA cut definitions. It is included as conflicting Québec terminology evidence, not as alias authority.
- The bundled corpus contains no request for this cut. No source reviewed establishes a conversion, density, portion, edible yield, cooking state, substitution, or equivalence for recipe use.

## Snapshot hashes

SHA-256 values are byte hashes of the inputs read for this proposal. The recipe-corpus digest hashes the manifest-listed relative path, a NUL separator, and raw file bytes for each recipe in sorted path order.

| Input | Snapshot count | SHA-256 |
| --- | ---: | --- |
| app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 1,595 references | 999088c56419aeb84bd95b022715de9b26a7126be3158c2ede8ac59d0e885392 |
| app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 122 forms | d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1 |
| docs/catalog/legacy-import-identities.v1.json | 61 candidates | bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14 |
| docs/catalog/research-ledger.v1.json | 1,940 records; 8,388 source entries | b577938bc7c4255efbbb74eec2c776fdb98d253e8acf95ac6998941174629589 |
| app/src/main/assets/seed/bundled-library/manifest.v1.json | 114 recipe files | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 1,123 ingredient rows | f4f9c6a3647d877769729715a383733f49aaa4f8f4bba8f99ab27bdb760466e8 |
| docs/RecipeBook-global-ingredient-catalog-plan.txt | Section O checklist | 3e4bf3192aaff07e1ce360edaafb938f4e9fbe6263fb3fce13b663b91bf9cedc |
| app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt | Picker matching behavior | ca41ac04d18fc354c46c9a67798209255e8bc40cb70ca0ee7350a4121ea6b50e |

## Source register

Sources were checked on 2026-10-16. IDs are local to this proposal and have not been added to the shared research ledger.

| Source ID | Source and supported scope |
| --- | --- |
| WP04-SECTION-O-CHICKEN-THIGH-20261016-S01 | Canadian Food Inspection Agency, [Poultry — Meat cuts manual (English)](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/poultry) and [Volaille — Manuel de coupes de viande (French)](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/produits-viande-volaille/coupes-viande/volaille). The manual names poultry thigh and says the bird species must appear in the product description. In French, cuisse includes haut de cuisse and pilon; the haut de cuisse is separated from the pilon at the knee, and pilon d’aile is expressly distinguished from pilon. The manual page is dated 2019-08-12; it remains the current linked CFIA retail nomenclature reviewed here. |
| WP04-SECTION-O-CHICKEN-THIGH-20261016-S02 | Gouvernement du Québec / MAPAQ, [Élevage de volaille (poulet et dindon)](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/elevage-volaille-poulet-dindon), last updated 2026-03-05. Uses haut de cuisse in a current Québec poultry context and lists it separately alongside cuisse and pilon. Supports regional naming and market context, not anatomical cut definitions. |
| WP04-SECTION-O-CHICKEN-THIGH-20261016-S03 | Canadian Food Inspection Agency, [Chicken wholesale nomenclature](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/wholesale-meat/chicken). Separately defines whole leg, thigh, thigh with back portion, boneless trimmed thigh, and drumstick. Wholesale cut nomenclature only; no forms or measurements are proposed from it. |
| WP04-SECTION-O-CHICKEN-THIGH-20261016-S04 | Office québécois de la langue française, [haut de cuisse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8388823/haut-de-cuisse), last updated 1998. Maps the term to English leg and lists cuisse/pilon as related terms, which conflicts with the CFIA cut boundary. Used to document a Québec terminology discrepancy; none of those broad terms is accepted as an alias here. |

## Final disposition

Advance chicken thigh / haut de cuisse de poulet as a distinct identity-only PROTEIN candidate, with no aliases, forms, recipe links, or numeric/substitution behavior. Keep whole leg, drumstick, wing drumette, other poultry species, and bone/skin configurations separate. This proposal is the only file written for this work; no shared catalog, ledger, plan, roadmap, or other proposal was changed. No tests, builds, emulator checks, or deployments were run.
