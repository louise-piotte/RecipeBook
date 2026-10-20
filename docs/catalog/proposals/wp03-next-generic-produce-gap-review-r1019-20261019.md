# WP03 Section N: Blewitt mushroom identity review (R1019)

**Status:** Proposal only. No shared catalog, ledger, manifest, recipe, plan, roadmap, workflow, code, or other file was changed.

**Reviewed:** 2026-10-19

**Exact open-plan anchors:** [Section N — other documented culinary fungi](../../RecipeBook-global-ingredient-catalog-plan.txt#L7177) and [species-sensitive names and substitution boundaries](../../RecipeBook-global-ingredient-catalog-plan.txt#L7196). The latter remains open after the black-trumpet identity review; this review addresses one separate, source-bounded species name.

## Recommendation

Add one identity-only `VEGETABLE_AND_AROMATIC` reference for the Québec-named **Blewitt mushroom / pied bleu**, bounded to *Lepista nuda* as identified by Health Canada and MycoQuébec. Do not interpret the common name as a field-identification aid or as an identity for similar fungi. Keep the existing generic mushroom and all other named fungi unchanged.

| Proposed field | Value |
|---|---|
| ID | `ingredient-ref-blewitt-mushroom` |
| English display | `Blewitt mushroom` |
| Québec French display | `pied bleu` |
| English aliases | None proposed; keep the official Canadian spelling in the display. |
| French aliases | None proposed. |
| Category | `VEGETABLE_AND_AROMATIC` |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, conversions, yields, substitutions | None |

The reference is for the culinary fruiting body identified as *Lepista nuda*. Health Canada places `Blewitt (Lepista nuda)` in its edible-fungi crop group; MycoQuébec names the Québec species `Lepista nuda / Pied bleu` and describes it as edible. These sources support a distinct culinary identity and bilingual display, not an identification key, safe-foraging advice, a preparation rule, or a species-wide substitute.

## Identity and naming boundaries

| Candidate term or neighbor | Treatment | Reason |
|---|---|---|
| `Blewitt mushroom` / `pied bleu` | Displays | Health Canada uses the double-t English spelling `Blewitt (Lepista nuda)` in its edible-fungi list and gives the French `Pied bleu (Lepista nuda)`. MycoQuébec independently records the Québec pairing `Lepista nuda / Pied bleu`. |
| *Lepista nuda* | Taxon scope in evidence only; not a picker alias | This binomial is the shared taxon attached to the Canadian terms. Keep scientific names in evidence so the accepted market-name boundary stays readable and does not depend on taxonomic search aliases. |
| *Clitocybe nuda*, *Collybia nuda*, other historical or later combinations | Do not add as aliases | The reviewed sources do not settle current global nomenclature for all combinations. MycoQuébec discusses *Clitocybe nuda* as a historical proposal; this review follows the *Lepista nuda* name explicitly used by the current Canadian crop table and its Québec species record. |
| `blewit`, `wood blewit`, `pied-bleu`, `lépiste nu` | No extra aliases | The bilingual displays already use the official Canadian and Québec source terms. No extra spelling or common-name aliases are needed for this bounded review. |
| `mushroom`, `champignon`, generic mushroom forms | Keep on existing owner | The new display will naturally appear in broad mushroom searches. It must not take over the generic mushroom identity, its English plural alias, or its general dried-mushroom form. |
| Nearby named fungi, including candy caps, black trumpet, chanterelle, cremini, enoki, lion’s mane, maitake, morel, oyster, shiitake, straw mushroom, wood ear, wine cap, matsutake, and puffball identities | Keep unchanged | Their taxon and market-name boundaries are independent. Do not merge or cross-alias them to Blewitt. |
| MycoQuébec’s similar *Lepista graveolens* and *Cortinarius lilacinus* | Explicit exclusions | The local article says these non-edible fungi can be confused with *L. nuda*. This is a reason to preserve the narrow identity, not to add identification instructions or a foraging-safety claim. |

## Current ownership and normalized audit

The inspected package snapshot contains **2,029 active references**, **205 forms**, **55 legacy candidates**, and **2,434 research-ledger records**. The manifest lists **114 recipes** with **1,123 structured ingredient rows**.

I searched case-folded whole phrases with the app’s search-key steps: Unicode NFKD, folding `œ`/`æ`/`ß` and `&`, dropping combining marks, replacing other punctuation with spaces, and collapsing whitespace. Query terms were `blewitt`, `blewit`, `wood blewit`, `pied bleu`, `pied-bleu`, `lépiste nu`, *Lepista nuda*, *Clitocybe nuda*, and *Collybia nuda*. The check covered active reference displays and aliases; form labels and match terms; legacy candidates; ledger record IDs, source text, and decisions; and structured recipe rows. No exact normalized owner or candidate was found. The proposed reference ID and the new MycoQuébec source-ID prefix below are unused. The Health Canada URLs are already cited under existing fungus records; keep their present source owners and reuse the existing source IDs rather than duplicating those source entries.

| Existing catalog state | Audit result and boundary |
|---|---|
| `ingredient-ref-mushroom` — `mushroom / champignons` | Owns only the generic mushroom identity and `mushrooms` English alias. Keep all three generic recipe rows linked there; the word “mushroom” is not a Blewitt synonym. |
| `ingredient-ref-ground-dried-candy-cap-mushrooms` | Separate named fungus/product identity; its recipe demand and evidence do not transfer. |
| Other named fungi | No exact Blewitt/pied-bleu/Lepista owner. Preserve existing species rows and their source ownership. |
| Forms | No Blewitt-specific form exists. The only generic mushroom form is `ingredient-form-mushroom-dried` under `ingredient-ref-mushroom`; do not attach it to this species without a separate review. No fresh, dried, powdered, canned, reconstituted, or soaking-liquid form is proposed. |
| Measures and mappings | No Blewitt density, unit mapping, package yield, recipe measure, conversion, or cooking yield is supported here. MycoQuébec’s cap-size description is morphology, not a culinary measure. Leave measurement state `not_yet_researched`; add no numeric observation. |
| Substitutions | Both active substitution-rule files currently contain zero rules. No source or recipe here supports a directed or contextual substitute; leave substitution research `not_yet_researched` and add no rule. This does not declare all mushrooms interchangeable. |
| Legacy and ledger | No Blewitt/Lepista candidate or exact term record was found. Existing sources owned by the generic and named fungal rows remain untouched. |

## Bundled recipe demand

The scan of all **114 manifest-listed recipes / 1,123 ingredient rows** found **zero** rows containing a Blewitt spelling, `pied bleu`, or a reviewed taxon name. No recipe link, relink, amount, or form is proposed.

The current corpus has three generic `ingredient-ref-mushroom` rows: two in recipe 037 (including `1 lb white mushrooms, sliced` and `extra sauteed mushrooms, to taste`) and one in recipe 089 (`1/2 box mushrooms`). Those lines do not identify *Lepista nuda*; keep them generic. Recipe 100’s `7 g ground dried candy cap mushrooms` remains attached to its existing candy-cap reference. Dessert “meringue mushrooms” are decorations, not demand for this fungal identity. None of these lines supports a species-specific quantity or substitution.

## Sources and limits

Online sources were checked on 2026-10-19. Source IDs are not written to the shared ledger by this proposal.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP03-N-BLEWITT-R1019-20261019-S01` | MycoQuébec, [Cardex: *Lepista nuda*](https://www.mycoquebec.org/bas.php?iumq=1424&tag=Lepista+nuda) | Regional species record; search result and linked species profile identify *Lepista nuda* and the French name `Lépiste nu (Pied bleu)`. Taxon and Québec naming support only; not a recipe measure or general field-identification guarantee. `sourceKind: other`. |
| Existing `WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S01` | Health Canada, [Residue Chemistry Crop Groups — English](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html) | Lists `Blewitt (Lepista nuda)` in crop group 21, “Edible fungi.” This is a pesticide-residue crop classification based on taxonomic and cultivation criteria, not a Québec retail label standard, preparation rule, measure, or substitution. The existing shared source note lists other fungal commodities but does not yet mention Blewitt; if integrated, extend that note with this exact row while preserving the source ID and all four current owners: `ingredient-ref-bunashimeji-mushroom`, `ingredient-ref-lions-mane-mushroom`, `ingredient-ref-snow-fungus`, and `ingredient-ref-straw-mushroom`. Do not mint a duplicate URL entry. `sourceKind: other`. |
| Existing `WP03-OTHER-CULINARY-FUNGI-FOLLOWUP-20261009-S02` | Health Canada, [Groupes de cultures et propriétés chimiques de leurs résidus — français](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html) | Lists `Pied bleu (Lepista nuda)` under `Champignons comestibles`. Same crop-group limits as the English page. The existing shared source note lists other French fungal commodities but does not yet mention Pied bleu; if integrated, extend that note with this exact row while preserving the source ID and all four current owners: `ingredient-ref-bunashimeji-mushroom`, `ingredient-ref-lions-mane-mushroom`, `ingredient-ref-snow-fungus`, and `ingredient-ref-straw-mushroom`. Do not mint a duplicate URL entry. `sourceKind: other`. |
| `WP03-N-BLEWITT-R1019-20261019-S02` | MycoQuébec contributors Guy Fortin and Johanne Paquin, with Roland Labbé, [Le *Lepista nuda*, au-delà du « Pied bleu »…](https://blog.mycoquebec.org/blog/lepista-nuda-dela-pied-bleu/) | The local article identifies the Québec name and species, calls it edible, and warns of digestive effects, raw consumption, and confusion with other fungi. The article dates to 2017 and cites older taxonomy; retain its cautions as source-scoped evidence only. It is not safety guidance, a foraging key, a current nomenclatural ruling, a measure, or a substitution source. `sourceKind: other`. |

No numbers from the source pages are proposed as ingredient values. The MycoQuébec article’s biological dimensions are not recipe measures. The regulatory list’s crop group is not evidence of commercial product counts or product availability.

## Scope and disposition

This review addresses one generic species-level culinary identity from Section N’s open fungus-identity and species-boundary work. It does not pursue brands, commercial products, product lines, flavour families, SKUs, retailer variants, or product rosters: commercial-product counts do not add ingredient diversity. Preserve all existing branded entries and product-only measurements or claims; none is transferred here. No roster-only queue item was researched.

Recommend one identity-only `VEGETABLE_AND_AROMATIC` reference, `Blewitt mushroom / pied bleu`, scoped in evidence to *Lepista nuda*. Keep aliases empty, retain the existing generic and named fungal rows, and add no forms, measures, recipe links, conversions, yields, or substitutions. Section N’s remaining species-name, form, and substitution questions remain open. No tests or builds were run because this was a proposal-only review.
