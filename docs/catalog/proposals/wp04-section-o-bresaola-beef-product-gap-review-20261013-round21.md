# WP04 Section O beef bresaola product-gap review — 2026-10-13 (round 21)

**Status:** Integrated on 2026-10-13 as a source-backed, unallocated ledger candidate; no active reference was added. See the R21 integration batch README.
**Scope:** One named cured-meat gap: beef bresaola. The broad dried/cured-meat family, protected geographic names, and other Section O items remain outside this packet.
**Disposition:** Keep the proposed beef-scoped reference as an unallocated, source-backed candidate. Hold active integration because bare `bresaola` would return only the beef identity even though one Canadian producer uses the name for beef, water-buffalo, and turkey products. Reconsider an active row only when a generic family/group entry or a search rule can represent these variants without misselection. Do not add forms, numeric behavior, recipe links, or substitutions.

This is a distinct open product gap. The Section O plan names dried/cured meats generally but has no bresaola-specific decision. Searches of the plan, workflow, seed package, ledger, and archived proposals/batches found no earlier bresaola review, including the round-20 packet. The previous cured-pork follow-up explicitly leaves other named dry-cured products for source-scoped review. See the [Section O plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3492), [catalog workflow](../ingredient-catalog-workflow.md), [cured-pork boundaries](wp04-section-o-cured-pork-boundaries-20261010.md), and [cured-pork follow-up](wp04-cured-pork-open-gap-followup-review-20261012.md).

## Current snapshot and audit

The review read the current live reference, form, legacy-candidate, package-yield, recipe-manifest, and research-ledger files. It searched all manifest-listed recipe JSON text and each ingredient row, then checked exact normalized phrases against active reference names and aliases, form labels/search terms, legacy candidates, ledger records, and package yields.

| Artifact | Current snapshot |
|---|---:|
| Active ingredient references | 1,347 |
| Ingredient forms | 98 |
| Legacy identity candidates | 64 |
| Research ledger | 1,660 records; 6,463 source entries; 5,412 distinct source IDs; 4,502 distinct URLs |
| Active global / contextual substitution rules | 0 / 0 |
| Package-yield records | 1 total; none for bresaola |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

No current active reference, form, legacy candidate, ledger record, or package-yield record owns `bresaola`, `beef bresaola`, `bresaola de bœuf`, `bresaola au bœuf`, `Bresaola della Valtellina`, `viande des Grisons`, `air-dried beef`, or `dry-cured beef`. No bresaola source record or measurement observation exists in the ledger. The eight proposed source IDs and URLs in the source register have no exact collision with the live ledger or archived catalog documents.

Nearby identities already have separate owners: generic `beef / bœuf` (`ingredient-ref-beef`), `biltong` (`ingredient-ref-biltong`), camelid `charqui` (`ingredient-ref-charqui`), Peruvian Amazon `cecina` (`ingredient-ref-peruvian-amazonian-cecina`), `prosciutto` (`ingredient-ref-prosciutto`), and Montréal smoked meat (`ingredient-ref-montreal-smoked-meat`). Those names describe different products or scopes; none is a bresaola alias or general substitute. The French display `smoked meat` remains the exact display of the Montréal-specific reference, not a generic cured-meat owner.

The full 114-recipe / 1,123-row scan found no bresaola or Grisons occurrence, recipe link, quantity, preparation note, or source request. No recipe relink or portion estimate is justified by this corpus.

## Product and Québec naming boundary

The current Italian Ministry specification for the protected **Bresaola della Valtellina IGP** is narrower than the Québec products using the bresaola name. It limits the beef to cattle 18 months to four years old and to five thigh-muscle cuts: `fesa`, `punta d’anca`, `sottofesa`, `magatello`, and `sottosso`. Its production zone is the Province of Sondrio. The IGP process uses dry salting (normally 10–15 days, with a stated minimum of seven days under specified conditions), about a week of drying, and maturation generally lasting four to eight weeks. This differs from the Québec farm listing's brining, smoked-leek seasoning, and minimum three-month aging, and from the Québec retailer's beef-shoulder product dried and aged four months. The protected name is expressly untranslatable. Its cuts, origin, process, and cut-specific full-piece minimums from 0.8 to 3.5 kg stay attached to that protected product; they are not general bresaola rules or recipe measures [S01–S05].

Two current Québec product listings show why a Québec-market identity should not inherit the IGP cut/process as universal properties:

- La Ferme des Quatre-Temps calls its product **Bresaola** in both French and English. It describes a whole beef muscle, brined, seasoned with smoked leek greens, aged at least three months, and 100% beef. Its ingredient page lists pasture beef, leeks, sea salt, cane sugar, and cultured celery-juice powder [S02–S04].
- Coop Carotte lists **Épaule de bœuf séchée (bresaola)**: beef shoulder dried and aged four months, with maple sugar, spices, coffee, and dried chile. Its 70 g package is specific to that listing [S05].

A 2019 Canadian parliamentary transcript records one producer saying its bresaola products include beef, water buffalo, and turkey. That testimony is not a product standard, but it is enough to avoid representing unqualified bresaola as necessarily beef in every market. The proposed candidate is therefore limited to **beef** bresaola. It does not assert that every bresaola uses one cut, one cure method, one seasoning, or one species [S06].

For Québec French, current local listings retain the borrowed name **bresaola**; the Coop listing identifies a beef-shoulder product parenthetically. A French-language Québec event/menu program also uses **bresaola de bœuf**. The proposed French display `bresaola de bœuf` preserves the local borrowed name and makes this reference's species scope visible. The narrow alias `bresaola au bœuf` is attested in the French Canadian parliamentary transcript; it is a search phrase, not a claim that OQLF prescribes that wording [S05, S06, S08].

## Exact picker projection and scope ambiguity

The current catalog returns no result for `bresaola`. The projection below is hypothetical: it uses the current `IngredientSearch.kt` behavior with the proposed displays and alias, as if the candidate were active. Search normalizes case, accents, ligatures, and punctuation; checks `nameFr`, `nameEn`, and aliases; and returns complete word-phrase matches before trying substring matches.

| Query | Projected result |
|---|---|
| `bresaola` | Exactly the proposed `ingredient-ref-beef-bresaola` candidate |
| `beef bresaola` | Exactly `ingredient-ref-beef-bresaola` |
| `bresaola de bœuf` or `bresaola de boeuf` | Exactly `ingredient-ref-beef-bresaola` |
| `bresaola au bœuf` or `bresaola au boeuf` | Exactly `ingredient-ref-beef-bresaola` |
| `Bresaola della Valtellina` | No result; the protected name is not an alias for the generic beef identity |
| `viande des Grisons` | No result; it remains a distinct, unmodeled product name |
| `water buffalo bresaola` or `turkey bresaola` | No result; neither non-beef variant has an active reference |
| `beef` or `bœuf` | Seven results in this hypothetical projection, including the candidate; these broad queries remain broad |

**Material ambiguity:** exact-phrase priority makes a bare `bresaola` query select the beef candidate alone. S06 shows that the name also appears on water-buffalo and turkey products from one Canadian producer. `water buffalo bresaola` and `turkey bresaola` have no current match, but the unqualified query would still route those requests to beef if this candidate became active. Therefore the projection is not safe for active integration as a standalone beef reference.

Do not add aliases for `Bresaola della Valtellina`, `viande des Grisons`, prosciutto, Montréal smoked meat, biltong, charqui, cecina, or generic `air-dried/dry-cured beef`. A future recipe naming the protected IGP product should get a separate exact-owner review rather than an alias to this identity.

## Forms, measurements, substitutions, and safety boundary

- **Forms and numeric data:** None of the 98 forms matches or attaches to bresaola. There is no density, unit mapping, bresaola measurement observation, package yield, or recipe quantity. The IGP's 0.8–3.5 kg minimum full-piece weights are specifications by protected cut, not kitchen amounts. The Coop Carotte 70 g value is one retail package, not a serving weight or transferable conversion. The Quatre-Temps aging duration is a product process statement, not a kitchen measure. Keep all numeric values and forms inactive.
- **Substitutions:** No global or contextual substitution rule exists for bresaola. A 2010 SOSCuisine article suggests viande des Grisons or prosciutto if bresaola is unavailable for its Italian spring-roll appetizer; it gives no substitution ratio and does not establish interchangeability across dishes. Keep this one editorial context at proposal level; do not activate a global rule or aliases. The bundled corpus contains no matching recipe to scope a contextual rule to [S07].
- **Safety:** Neither a product name, the IGP specification, nor a recipe-editorial comparison establishes a home-curing method, shelf life, storage rule, or safe raw-consumption equivalence. The parliamentary testimony discusses a producer's process-validation and batch-testing concerns; it is testimony, not safety guidance. Make no safety claim or substitution that crosses curing, smoking, drying, cooking, or storage state [S01, S06].

## Root integration recommendation: hold active integration

Keep `ingredient-ref-beef-bresaola` as a source-backed but unallocated candidate. The following names are a review proposal only; do not add this as an active `PROTEIN` reference yet:

- English display: `beef bresaola`
- French display: `bresaola de bœuf`
- French alias: `bresaola au bœuf`
- English aliases: none
- `defaultDensity`: `null`; `unitMappings`: `[]`
- no forms, measurements, package yields, conversions, substitution rules, or recipe links

The active-row hold can be revisited when a generic bresaola family/group entry or a future picker search rule can expose beef, water-buffalo, and turkey variants without routing bare `bresaola` exclusively to beef. Until then, do not add an active reference, alias, or recipe link. The coordinator recorded the unallocated candidate in the ledger, keeping its identity evidence and measurement boundary separate: `researched_no_supported_value` fits the absence of a transferable recipe measure. Keep substitutions inactive; the single old spring-roll suggestion is too narrow to support a global rule and no bundled recipe supplies a contextual link. Leave the broader Section O checkbox open. This proposal does not authorize editing the catalog, ledger, plan, roadmap, or recipe files.

No tests were run because this packet changes documentation only.

## Source register

Sources were checked on **2026-10-13**. Source IDs below are proposal-local; exact source-ID and URL collision scans against the current ledger and catalog archives found none.

| ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTION-O-BRESAOLA-GAP-20261013-S01** | Italian Ministry of Agriculture, [2026 consolidated Bresaola della Valtellina IGP specification](https://www.masaf.gov.it/flex/cm/pages/ServeAttachment.php/L/IT/D/1%252Fa%252F5%252FD.850949925f67790d7e70/P/BLOB:ID=3339/E/pdf?mode=download), Articles 1–7; decree 9 June 2026, published 18 June 2026 | Protected-name scope, beef thigh cuts, dry-salting/drying/maturation process, cut-specific full-piece minimum weights, and label name. Official product specification, not a general bresaola recipe, measure, or food-safety guide. |
| **WP04-SECTION-O-BRESAOLA-GAP-20261013-S02** | La Ferme des Quatre-Temps, [Nos produits](https://www.fermequatretemps.com/produits), French product listing | Current Québec product name and one whole-muscle, brined, smoked-leek-seasoned beef product aged at least three months. The producer says the offering varies seasonally; this is one maker's product, not a universal definition. |
| **WP04-SECTION-O-BRESAOLA-GAP-20261013-S03** | La Ferme des Quatre-Temps, [Liste d’ingrédients](https://www.fermequatretemps.com/ingredients), Bresaola entry | One current product ingredient list: pasture beef, leeks, sea salt, cane sugar, and cultured celery-juice powder. Does not generalize ingredients to other bresaola. |
| **WP04-SECTION-O-BRESAOLA-GAP-20261013-S04** | La Ferme des Quatre-Temps, [Farm Fresh Organic Products](https://www.en.fermequatretemps.com/products), English product listing | English-facing name `Bresaola` and the same product-specific whole-muscle, brined, smoked-leek, minimum-three-month, 100%-beef description. |
| **WP04-SECTION-O-BRESAOLA-GAP-20261013-S05** | Coop Carotte, [Bœuf](https://www.coopcarotte.ca/product-category/viandes/boeuf/), listing `Épaule de boeuf séchée (bresaola)` by Florent charcuteries artisanales | Québec listing for one beef-shoulder product dried and aged four months, with product-specific ingredients and 70 g package. Supports Québec naming and process variation only; package weight is not a recipe portion. |
| **WP04-SECTION-O-BRESAOLA-GAP-20261013-S06** | House of Commons of Canada, [Témoignages, INDU meeting 151](https://www.ourcommons.ca/documentviewer/fr/42-1/INDU/reunion-151/temoignages), 26 February 2019, testimony of Jane Abballe, La Cultura Salumi | The producer's testimony uses beef, water-buffalo, and turkey bresaola wording, and describes its own production and testing concerns. It establishes one manufacturer's usage only; it is neither a current product standard nor a food-safety authority. |
| **WP04-SECTION-O-BRESAOLA-GAP-20261013-S07** | SOSCuisine, [Bonne fête Italie!](https://www.soscuisine.com/fr/blog/bonne-fete-italie/), 2 June 2010 (originally published in Journal de Montréal, 2 June 2007) | One spring-roll appetizer context suggests viande des Grisons or prosciutto when bresaola is unavailable. No ratio or cross-dish equivalence; dated recipe-editorial guidance only. |
| **WP04-SECTION-O-BRESAOLA-GAP-20261013-S08** | Italian Chamber of Commerce in Canada, [Programme Premio 2024](https://italchamber.qc.ca/wp-content/uploads/2025/03/ProgrammePremio2024_VF.pdf), French menu wording | Uses `carpaccio de bresaola de bœuf`; supports the proposed Québec French species-qualified display. Menu wording, not a terminology standard or product specification. |

## Local evidence links

- [Section O plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3492)
- [Cured-pork boundary packet](wp04-section-o-cured-pork-boundaries-20261010.md)
- [Montréal smoked-meat identity packet](wp04-section-o-montreal-smoked-meat-identity-review-20261011.md)
- [Live ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Live ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Live recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
- [Legacy identity candidates](../legacy-import-identities.v1.json)
- [Research ledger](../research-ledger.v1.json)
- [Picker search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)
