# WP04 Section P — Jonah crab / crabe nordique identity review (R28)

- **Status:** Proposal-only review; no catalog, ledger, plan, roadmap, recipe, or other shared file was changed.
- **Scope:** One unallocated shellfish identity, Jonah crab (*Cancer borealis*), and its distinct Québec French name. This does not reopen generic crab meat, Dungeness crab, blue crab, snow crab, king-crab holds, or any other completed shellfish review.
- **Exact open plan item:** [WP04 Section P checklist, line 3750](../../RecipeBook-global-ingredient-catalog-plan.txt#L3934): `[ ] Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below.`
- **Recommendation:** Add an identity-only `PROTEIN` reference for **Jonah crab / crabe nordique**, scoped to *Cancer borealis*. Use empty alias arrays. Keep the ambiguous Québec market wording `crabe commun` off this row. Add no form, measure, mapping, conversion, yield, recipe link, or substitution.

## Why this is a separate open item

The archive's generic-crab review listed *C. borealis* among many taxa sharing the broad name `crab / crabe`; it did not allocate Jonah crab or project its species-qualified search terms. The current plan has no dedicated Jonah-crab decision. A repository-wide check found no exact active reference, form, legacy-import candidate, or Jonah-specific ledger candidate for `Jonah crab`, `crabe nordique`, or *Cancer borealis*. The generic crab-meat reference and Jumbo Lump form remain distinct and unchanged.

OQLF's edible-crustacean entry directly pairs preferred Québec French **crabe nordique**, English **Jonah crab**, and *Cancer borealis*. It also cautions that Jonah crab and Atlantic rock crab (*Cancer irroratus*) are often marketed indistinguishably as **crabe commun**. CFIA independently lists the same species-qualified English/French pair. Together, the sources support a species-scoped identity while ruling out `crabe commun` as an alias.

The [2026 DFO notice](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-1-eng.html) confirms a current offshore Jonah-crab fishery in Lobster Fishing Area 41 with a 270 t total allowable catch. That is fishery-specific evidence, not proof of Québec-wide supply. DFO's older species profile says commercial activity was low in most areas as of 2010. A current Metro listing supplies a bounded retail example: a frozen 454 g Jonah-claw product whose ingredient list names *C. borealis* and salt; the page displayed it as out of stock when reviewed. Neither source establishes a general package, fresh/live state, edible yield, or kitchen measure.

## Proposed identity shape

```json
{
  "id": "ingredient-ref-jonah-crab",
  "category": "PROTEIN",
  "nameEn": "Jonah crab",
  "nameFr": "crabe nordique",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": []
}
```

The scientific name is evidence for the identity, not a search alias. Omit `crabe commun`, `rock crab`, `northern crab`, `Jonah rock crab`, `tourteau jona`, `chancre`, and `crabe tourteau`: they are either ambiguous, not the normalized Québec commercial term, or not needed for the distinct identity.

## Current catalog and picker collision checks

The live package snapshot contains **1,355 ingredient references** and **100 forms**. The exact-key audit followed `IngredientSearch.kt` normalization (lowercase, NFKD, accent/punctuation folding, and collapsed spaces) across active reference names/aliases, form labels/match terms, and legacy-candidate names/aliases. It found no exact owner for the proposed names or species. The ledger has no Jonah-specific record; existing broad crab evidence is not a species allocation.

The current phrase-first picker projection was checked against each display and alias plus attached forms. The conditional column adds only the proposed bilingual display above.

| Query | Current result | With the proposed row | Decision |
|---|---|---|---|
| `Jonah crab` | None | Jonah crab / crabe nordique | Exact species-qualified English term remains distinct. |
| `crabe nordique` | None | Jonah crab / crabe nordique | Use OQLF's preferred Québec term. |
| `crab` | Blue crab; crab meat; Dungeness crab | Same three plus Jonah crab | Broad English search remains multiple-choice. |
| `crabe` | Blue crab; crab meat; Dungeness crab | Same three plus Jonah crab | Broad French search remains multiple-choice. |
| `crab meat`; `chair de crabe` | Crab meat only; its Jumbo Lump form remains available for its explicit phrase | Same | The species display does not claim picked meat or the recipe's grade. |
| `crabe commun`; `rock crab` | None | None | Do not assign the shared Jonah/rock-crab market label to Jonah alone. |
| `Cancer borealis` | None | None | Keep the binomial as evidence, not a user-facing search alias. |

Exact active owners for the neighboring terms are `ingredient-ref-blue-crab`, `ingredient-ref-crab`, `ingredient-ref-dungeness-crab`, and `ingredient-form-crab-jumbo-lump`. The conditional Jonah row neither suppresses those results nor takes over the exact crab-meat/form query.

## Bundled recipe corpus scan

The current [seed manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists **114 recipe files**. All 114 complete UTF-8 JSON files and all **1,123 ingredient rows** were scanned for `Jonah crab`/`Jonah crabs`, `crabe nordique`/`crabes nordiques`, *Cancer borealis*, `northern crab`, `crabe commun`, `rock crab`, and related spelling variants, including ingredient names, original text, reference IDs, and form IDs.

**Result:** zero Jonah-specific files, ingredient rows, or existing recipe links. The only bundled crab-ingredient request is recipe **019#8**, `1 lb jumbo lump crab meat`, already linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. The recipe title/group `Crab Balls` does not select Jonah crab. Do not relink that row.

## Explicit disposition

| Area | Proposal |
|---|---|
| Identity | Species-scoped `Jonah crab / crabe nordique` for *Cancer borealis*; `PROTEIN`. |
| Aliases | None. In particular, omit `crabe commun`, which OQLF says can refer commercially to both *C. borealis* and *C. irroratus*. Do not add genus-level or Latin aliases. |
| Forms | None. Metro's frozen, salted 454 g claw listing is one product-specific example, not a general form definition. Do not infer live, whole, fresh, cooked, frozen, claw, leg, or picked-meat forms from it. |
| Numeric data | No default density, household measure, unit mapping, or serving value. The Metro 454 g amount is package mass; DFO's 270 t is a fishery TAC; biological carapace measurements are not recipe portions. |
| Conversions | None. No general package-to-mass, shell-on-to-meat, cooked-to-raw, or other species-specific conversion is supported. |
| Yields | None. No edible-meat yield, claw yield, cooking loss, or thaw/drain yield is supported. |
| Substitutions | None. The evidence does not establish interchangeability with Atlantic rock crab, blue crab, Dungeness crab, generic crab meat, Jumbo Lump crab meat, or another shellfish. |
| Recipe links | None. The 114-file corpus contains no Jonah-specific demand; preserve 019#8 on its existing crab-meat reference and grade form. |

## Source register

Source IDs are local to this proposal and were checked against the catalog archive and research ledger before drafting. No source records were added to the shared ledger.

| Source ID | Source and scope |
|---|---|
| `WP04-P-JONAH-CRAB-20261013-R28-S01` | OQLF, [crabe nordique, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198899/crabe-nordique). Preferred Québec food-crustacean term; directly maps English `Jonah crab` and *Cancer borealis*. The note says Jonah and rock crab are often sold indistinguishably as `crabe commun`, and that `chancre` / `crabe tourteau` were not retained for Québec fish-product labeling. Last updated 2012; terminology and market-name boundary, not current retail supply. |
| `WP04-P-JONAH-CRAB-20261013-R28-S02` | CFIA, [Fish List query for crab](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). The query pairs `Jonah Crab / Crabe Nordique` with *C. borealis* and also shows broad `Crab / Crabe` names across taxa, including *C. irroratus* and other crabs. The overview defines the list's Canadian English/French fish-label name and taxonomic-identifier role; neither source defines recipe equivalence. |
| `WP04-P-JONAH-CRAB-20261013-R28-S03` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). Explains that Fish List common names are species-linked Canadian naming evidence for labeling; it is not a household-measure, substitution, or recipe-identity source. |
| `WP04-P-JONAH-CRAB-20261013-R28-S04` | Fisheries and Oceans Canada, [2026 Offshore Jonah crab notice, LFA 41](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-1-eng.html). States that the 2026 fishery operates year-round in LFA 41 and has a 270 t TAC. Current fishery-scope evidence only; no Québec-wide market, kitchen quantity, or product-state claim. |
| `WP04-P-JONAH-CRAB-20261013-R28-S05` | Fisheries and Oceans Canada, [Jonah Crab species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/jonah-crab-crabe-nordique-eng.html) and [French profile, Crabe nordique](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/jonah-crab-crabe-nordique-fra.html). Identifies *C. borealis*, its Atlantic range, and its fishery context. The English page reports that commercial activity was low in most areas as of 2010; this older statement is retained as historical context, not current market measurement. Biological size values are not kitchen portions. |
| `WP04-P-JONAH-CRAB-20261013-R28-S06` | Metro, [Frozen Jonah crab claws, 454 g, product 731149112377](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-jonah-crab-claws/p/731149112377). The listing names *Cancer borealis* and salt, shows a frozen 454 g package, and marked the item out of stock when reviewed on 2026-10-13. Retail product evidence only; no measure, conversion, yield, recipe link, or general market-availability claim. |

## Review record

The archive review included the open Section P checklist, the WP04 mollusks/shellfish coordinator review, the generic crab boundary review, the current references/forms/legacy-import candidates/ledger, the picker implementation, and every manifest-listed recipe. The source-ID prefix and proposed reference ID had no prior allocation. This file is the only output of this review. It is UTF-8 without BOM and has not been added to the shared plan or ledger. No app, unit, instrumentation, or emulator tests were run; this proposal-only review does not change app or database data.
