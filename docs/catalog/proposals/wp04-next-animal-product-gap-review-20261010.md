# WP04 Proposal: African Peanut Stew Meat-Product Boundary

**Review date:** 2026-10-10
**Status:** Root integrated the source evidence and an unresolved decision on the existing `ingredient-ref-stew-meat` ledger record. No reference, alias, recipe row, measurement, conversion, or substitution rule was changed.
**Scope:** The source-specific animal-product wording for African Peanut Stew's optional stew-meat line, and the identity boundary on the existing `ingredient-ref-stew-meat` reference.

## Disposition

Keep the existing `ingredient-ref-stew-meat` reference and the recipe's current link, but treat the identity as unresolved pending a narrower product definition and a Québec French naming review. The current ledger record has no sources or decisions. The original publisher's current recipe card explicitly groups **chicken, beef, or pork** as optional, diced choices under one “stew meat” line. That is evidence for this recipe's local options; it does not establish one cross-species cut, a universal product definition, or a reusable substitution rule.

Do not relink the row to generic beef, chicken breast, pork loin chops, ground meat, or a cut-specific reference. Do not add `bœuf en cubes`, `bœuf à ragoût`, or any species-specific phrase as a global alias for unqualified `stew meat`. The Canadian and Québec sources found for formal stewing products are species-scoped, especially to beef or veal; they do not establish a Québec generic equivalent for this mixed-species recipe wording.

Keep measurements as source and recipe-line wording only. The publisher card lists `1 pound (450 g)` while the bundle stores `454 g`; do not create a mass conversion or portion observation from this small presentation difference. No source establishes an edible/as-purchased basis, species-specific yield, or a general weight for stew meat. Do not add a diced form, size, cut, or bone-state qualifier to the global reference.

The source supports a recipe-local choice among the three species named in the recipe card. Keep that choice in the current line text and note; do not create a global or contextual substitution rule. The source's prose also mentions turkey, and its meatless variation mentions chickpeas or cooked lentils, but neither is a fourth exact meat-card option or a new identity request in the bundled row. Do not silently add either option to the bundle.

## Exact bundled demand and source comparison

The current manifest lists 114 recipes and 1,123 ingredient rows. A full scan of the manifest-listed ingredients found one row linked to `ingredient-ref-stew-meat`:

| Exact row | Bundled data | Publisher source and scope |
|---|---|---|
| `090#8` — African Peanut Stew; line ID `89f89f5e-4afc-4e3a-b37f-e7841ac24ff8-ingredient-8` | `originalText: "454 g stew meat"`; quantity `454`; unit `g`; reference `ingredient-ref-stew-meat`; English note `chicken, beef, or pork`; French note `poulet, boeuf ou porc`; no `optional: true` flag. | The linked Cotter Crunch card lists `1 pound (450 g) stew meat — chicken, beef, or pork, diced (optional)`. Its ingredient prose describes optional bite-size pieces of boneless pork, chicken, turkey, or beef stew meat. The card and the prose do not state one anatomical cut or species-independent product specification. The source labels the meat optional, while the bundled row does not carry an optional flag. Preserve this as a source-to-bundle representation question; this proposal does not edit the recipe. |

This proposal uses `090#8` for the one-based position in the bundled `ingredients[]` array and includes the stable line ID above. An earlier animal-coverage table labels this same stew-meat row `090#1`, which does not match the bundled array position; use the stable ID to avoid ambiguity.

The recipe method browns the chosen meat and then simmers it with the stew. The publisher page supports the line's optional status and the named species choices in this recipe only. The method does not define a reusable cooking conversion among chicken, beef, and pork, and the source's `40–60 minutes` stovetop range is recipe-method text, not a general cut or safety rule.

The current publisher card gives a nominal `1 pound (450 g)` ingredient amount; the bundled amount is `454 g`. Keep both source statements visible in this evidence record and preserve the bundle unchanged until an owner decides whether the difference is just source rounding or an import-version choice. Neither value is an edible-portion measurement, a purchase-yield factor, or a default for other meat products.

## Existing reference, ledger, and collision audit

The live reference is `ingredient-ref-stew-meat`, displayed as `stew meat / viande de ragoût`, category `PROTEIN`, with no aliases, forms, density, or unit mappings. Its ledger record is `identityState: unreviewed`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, with empty `sources` and `decisions`. No `ingredient-form` belongs to this reference. The current legacy-candidate file has no additional stew-meat candidate.

The normalized exact-key audit found:

- `stew meat` and `viande de ragoût` each resolve only to the existing stew-meat reference; those are ownership checks, not proof that the French label is a Québec-preferred generic food name.
- `beef for stewing`, `stewing beef`, `beef stew meat`, `chicken stew meat`, `pork stew meat`, `bœuf en cubes`, `bœuf à ragoût`, and `veau à ragoût` have no exact owner among active references or legacy candidates.
- Generic beef, ground beef, beef broth, chicken breast, pork loin chops, and ground turkey remain separate active references. The stew-meat wording is not an alias for any of them.
- No new aliases or product rows are recommended, so no new exact-key or alias collision is introduced.

The full recipe-corpus scan found no second row using the stew-meat reference. Recipe `090#8` is the only exact row-level demand in this package; source prose elsewhere on the page does not add a bundled ingredient row.

## Product identity, terminology, and preparation boundary

The Canadian and Québec evidence supports a narrower conclusion than the catalog's current broad English/French pair:

| Term or evidence | What the source supports | What it does not support |
|---|---|---|
| **Stewing beef / beef for stewing** | CFIA and USDA AMS describe a beef-only diced product. CFIA's Item 135A applies beef-for-stewing criteria to diced beef and gives qualified piece-size and fat limits. CFIA also notes that stewing beef is one of the products for which the named anatomical-cut nomenclature need not be used. | A general “stew meat” identity across chicken, beef, and pork; a specific muscle or cut; or the piece size/fat limits for the recipe's chicken and pork options. These institutional specifications are not inferred to be the retail product used in the recipe. |
| **`bœuf en cubes` / `bœuf à ragoût`** | OQLF's food-domain entry maps `bœuf en cubes` to English `stewing beef`; its notes also call it `bœuf à ragoût` and define a beef-specific boneless, cubed product. | A French alias for unqualified “stew meat” where the source explicitly allows chicken and pork as well as beef. OQLF's entry is dated 1982 and is terminology/product-definition evidence, not proof of the publisher's meat cut or composition. |
| **`veau à ragoût`** | OQLF provides a separate veal-specific French term and the English `stewing veal`; the entry says the animal species should be included in the meat-label expression. | A synonym for beef, chicken, pork, or the recipe's mixed-choice label. The bundled card does not name veal. |
| **Recipe-card `diced` and prose `bite-size`, `boneless`** | These qualifiers describe this publisher's optional recipe use. They indicate the source expects pieces before browning and simmering. | A standard cube dimension, one preparation form for every species, or permission to add a global diced/boneless form. The species-specific CFIA/USDA beef criteria cannot be transferred to poultry or pork. |

No reviewed primary Québec source supplied a generic French food name that cleanly covers the source's three named animal species as one purchasable product. The active `viande de ragoût` display therefore remains unverified for this scope. Keep the saved wording while the bilingual identity stays `needs_clarification`; do not replace it with a guessed phrase or hide the species choice through an alias.

## Measurement and substitution disposition

| Evidence dimension | Supported | Unsupported / held |
|---|---|---|
| **Exact recipe amount** | The original publisher card states one pound and displays 450 g; the bundled row stores 454 g. The recipe source identifies the meat line as optional. | No decision about correcting the saved 454 g amount or setting the optional flag is made here. Do not treat the source card as a conversion table or use the amount for another recipe. |
| **Preparation and product state** | Source context says diced; its prose says bite-size boneless meat for the optional meat preparation. | No exact dimensions for the non-beef options, no named cut, no fat class, no source statement of raw/as-purchased versus edible mass, no skin or trimming data, and no cross-species cooking yield. |
| **Edible portion / composition** | Nothing source-matched to a named CNF food is present because the line has no selected species or cut. | No edible portion, refuse percentage, composition, package yield, density, cooking yield, or count weight. The recipe's mass is not an edible-portion observation. |
| **Substitution** | The recipe source gives chicken, beef, or pork as optional choices for this dish and recipe formula. | No directional reusable meat-to-meat substitution, target amount adjustment, cooking equivalence, or global/contextual rule. Do not extend the line to turkey solely from the prose or add chickpeas/lentils as animal-food aliases. |

The source page's separate meatless version names one 15-ounce can of chickpeas or 1½ cups cooked lentils and discusses a broth adjustment. That is recipe-specific variation evidence only; the current bundled line has no such linked alternatives, and this review proposes no new chickpea/lentil identity, recipe row, or substitution finding.

## Integrated ledger-only delta

Root updated only the existing `ingredient-ref-stew-meat` ledger record:

1. Add the source entries S01–S06 below, with their access dates, locators, and stated limits.
2. Add one `unresolved` decision: keep the current row-level reference and `stew meat` wording, but set `identityState: needs_clarification` because the only recipe source groups multiple species under one optional product phrase and the generic Québec label is unverified. The decision must preserve the fact that formal Canadian/Québec/US stewing-product specifications in this review are species-scoped.
3. Keep `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`. Do not add a `MeasurementObservation`, `SubstitutionFinding`, unit conversion, package yield, alias, form, new catalog row, or recipe-line target.

This records the evidence gap without claiming that the existing recipe is wrong or that any one species/cut is intended. If a future recipe edit makes a species choice, review that exact source line and its corresponding French product name separately.

## Source register

All external pages were accessed on **2026-10-10**.

| Source ID | Source | Claim and limit |
|---|---|---|
| `WP04-STEW-MEAT-20261010-S01` | Cotter Crunch, Lindsay Cotter, [African Peanut Stew](https://www.cottercrunch.com/crock-pot-west-african-peanut-stew/), recipe card and “Ingredients and Substitutions” sections; page updated July 20, 2022. | Primary publisher source for the exact recipe. The card lists one pound (450 g) of optional diced stew meat and names chicken, beef, or pork. Prose describes bite-size boneless choices and separately mentions turkey; it does not supply a named cut, universal species-independent product definition, or reusable substitution ratio. The card's meatless variation is outside the proposed animal identity. |
| `WP04-STEW-MEAT-20261010-S02` | CFIA, [Beef wholesale nomenclature — 100 series](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/wholesale-meat/beef), items 135 and 135A. | Canadian beef-only institutional product specification: item 135A is diced beef for stewing with size and fat-thickness criteria. It does not define chicken or pork stew meat or establish retail recipe requirements. |
| `WP04-STEW-MEAT-20261010-S03` | USDA Agricultural Marketing Service, [Institutional Meat Purchase Specifications: Fresh Beef, Series 100](https://www.ams.usda.gov/sites/default/files/media/IMPS_100_Fresh_Beef%5B1%5D.pdf), item 135A. | U.S. institutional beef-only specification for “Beef for Stewing.” Used to corroborate the species scope; it does not define a cross-species household ingredient or the publisher's product. |
| `WP04-STEW-MEAT-20261010-S04` | CFIA, [Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts), “Meat cut nomenclature exemptions.” | Lists stewing beef among products that do not need the anatomical cut terms shown in the manual, alongside beef shishkebob, pork fondue, and other small-piece meat. This is labeling/cut-name context only, not proof of one interchangeable product. |
| `WP04-STEW-MEAT-20261010-S05` | Office québécois de la langue française, [bœuf en cubes, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889575/boeuf-en-cubes), food domain, 1982. | Maps Québec French `bœuf en cubes` to English `stewing beef`; notes `bœuf à ragoût` and describes a beef-specific boneless cubed product. Its historical size/fat definition is not applied to this recipe or to chicken/pork. |
| `WP04-STEW-MEAT-20261010-S06` | Office québécois de la langue française, [veau à ragoût, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9898042/veau-a-ragout), food domain, 1983. | Provides the separate French term `veau à ragoût` / English `stewing veal` and states that the animal species should appear in the expression on a meat label. It does not apply to the bundled choices or justify a generic `viande de ragoût` translation. |
| Repository observation | Current manifest-listed recipe files, active ingredient references/forms, legacy candidates, and `docs/catalog/research-ledger.v1.json`, re-read 2026-10-10. | Confirms the single linked row, current reference/ledger state, and exact-key owners. This is local repository evidence, not an external source or a claim about retail terminology. |

The six `WP04-STEW-MEAT-20261010-S01`–`S06` IDs were checked against the current ledger source IDs and proposal files. No exact ID collision was found.

## Acceptance checks

- Preserve `ingredient-ref-stew-meat` and the current link on the stable line ID `89f89f5e-4afc-4e3a-b37f-e7841ac24ff8-ingredient-8`; refer to the bundled row as `090#8` using one-based array position.
- Record the Cotter Crunch amount and wording exactly as publisher evidence (`1 pound (450 g)`, optional, diced; chicken/beef/pork) and preserve the bundle's `454 g` and current line notes as separate local data.
- Keep `ingredient-ref-stew-meat` `needs_clarification` until the generic product and Québec French name are resolved. Do not merge it with beef or any specific cut/species.
- Keep the formal CFIA, USDA AMS, and OQLF product specifications scoped to the named species and limits in their source entries; do not use the numeric beef criteria as a recipe form or chicken/pork rule.
- Add no form, alias, measurement observation, conversion, yield, recipe row change, or reusable substitution rule. Preserve the source's optional meat choices as recipe-specific evidence only.
- The held identity and source dispositions are recorded in the matching batch README. No tests were run for this proposal document.
