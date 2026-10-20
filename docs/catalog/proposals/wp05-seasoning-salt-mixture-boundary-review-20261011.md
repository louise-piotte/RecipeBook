# WP05 Section T — Seasoning-salt mixture boundary review

- **Packet type:** proposal-only bilingual identity, mixture-boundary, and recipe-demand review.
- **Prepared and source-access date:** 2026-10-11.
- **Plan:** Section T, open “seasoning salt” work within the checklist covering MSG, nutritional yeast, yeast extract, bouillon powder, seasoning salt, and mushroom seasoning.
- **Status:** recommend one identity-only mixture reference. No bundled recipe link is warranted.
- **Source IDs:** `WP05-SEASONING-SALT-20261011-S01` through `WP05-SEASONING-SALT-20261011-S07`. The prefix was checked against the current proposal and ledger IDs; no collision was found.

## Recommendation

Treat generic seasoning salt as a distinct dry mixture identity, separate from plain salt and from other salt blends. Proposed fields:

| Field | Proposed value |
|---|---|
| Proposed ID | `ingredient-ref-seasoning-salt` |
| English display | `seasoning salt` |
| English alias | `seasoned salt` |
| French display | `sel aux épices` |
| French alias | `sel épicé` |
| Category | `BAKING_AND_SPICE` |
| Density / unit mappings | None |
| Forms / package yields / recipe links | None |

The OQLF GDT explicitly gives `seasoning salt` as the English equivalent and lists `sel aux épices` and `sel épicé` as preferred French terms [S01]. Use its entry headword as the French display and the second preferred term as the alias. Do **not** add `sel assaisonné`: although a current Canadian manufacturer product page uses that wording, OQLF marks it as discouraged [S01, S04].

Keep the reference at the product-class level. Do not store a universal ingredient formula, salt proportion, MSG status, density, or volume conversion. Mark only seasoning salt complete under the open Section T item; keep bouillon powder, mushroom seasoning, and the other unfinished subtopics open.

## Repository audit and recipe demand

Snapshot read on 2026-10-11. I reviewed the active reference and form arrays, research ledger, legacy candidates, existing salt proposals, and all manifest-listed recipe files. The exact-term audit used the app’s NFKD, case-insensitive, accent/ligature, punctuation, and whitespace normalization across reference names/aliases, form labels/match terms, legacy candidates, and recipe ingredient rows. Search phrases included `seasoning salt`, `seasoned salt`, `season salt`, `sel aux épices`, `sel épicé`, `sel assaisonné`, `Lawry's seasoned salt`, `Hy's seasoning salt`, and `Season-All`.

- The bundled catalog contains **1,033 active references** and **72 forms**. No active reference alias/name or form term owns the proposed generic English or preferred French phrase. No legacy candidate or ledger record covers generic seasoning salt.
- There are **75 legacy candidates** and **1,325 research-ledger records**. No earlier proposal addresses a generic seasoning-salt identity. The existing [WP07 salt review](wp07-salt-identities-measurements-substitutions-review-20261010.md) completed eight salt identities and explicitly kept generic salt separate; seasoning blends remain outside that packet.
- The **114 manifest-listed recipes and 1,123 ingredient rows** have no direct `seasoning salt` / `seasoned salt` or French-equivalent ingredient demand. One adjacent line in recipe 019 calls for `1/4 tsp garlic salt` and is already linked to `ingredient-ref-garlic-salt`. Keep that explicit garlic-salt line separate; the current garlic-salt ledger stub is unreviewed and source-less, so this packet does not validate its composition or propose a relink.
- No recipe asks for a Lawry’s, Hy’s, Club House, or Season-All product by brand. No recipe link or text change is proposed.

The lack of a current recipe request does not erase a well-attested general retail product class, but it limits this packet to an identity-only catalog addition.

## Identity and composition boundaries

| Product or wording | Evidence-backed boundary | Catalog treatment |
|---|---|---|
| Generic seasoning salt | OQLF describes it as salt combined with flavor ingredients and distinguishes it from spice rubs; the term refers to a prepared salt-based blend [S01]. Current Canadian maker pages market separate Club House and Lawry’s products in this class [S02–S05]. | One broad mixture identity with the reviewed English/French terms. |
| Brand-specific seasoned salts | Lawry’s Canadian product combines salt, sugar, spices/herbs, dried onion and garlic, starch, anti-caking material, and oils [S02–S03]. A Club House product has a different formula, including annatto, sunflower oil, autolyzed yeast extract, and citric acid [S04–S05]. These are product-specific lists, not a shared universal recipe. | Do not add brand names or their product titles as aliases. Do not transfer one SKU’s formula or directions to the generic identity. |
| “No MSG added” / MSG-containing variants | OQLF’s historical note records one formula that included MSG, while the manufacturer’s 2026 portfolio separately lists “seasoning salt no MSG added” products [S01, S06]. A product claim or single formula cannot define the whole class. | No MSG status, inclusion, exclusion, or equivalence is implied by the reference. Keep MSG as its own identity. |
| Garlic salt and celery salt | Garlic salt is an existing, separate active reference with one exact recipe line. A Canadian manufacturer lists celery salt as a blend of salt and celery seed [S07]. These are more narrowly named mixtures; ingredients vary by product. | Do not alias garlic salt, celery salt, or generic `salt` to seasoning salt. This packet makes no change to those rows. |
| General dry seasoning blends and rubs | A salt-containing blend is not automatically “seasoning salt.” The OQLF distinguishes spice rubs from the more rudimentary salt blend, and Canadian manufacturer catalogs list numerous other blends separately [S01, S06]. | Do not alias barbecue rubs, Cajun seasoning, steak spice, or other dry blends. Add those only as separately supported identities where the plan or recipe demand calls for them. |

No ingredient list, sodium value, or portion shown for a manufacturer SKU is generalized. Product composition, salt proportion, particle size, carrier ingredients, and seasoning vary; an identity row must not imply that a teaspoon of one brand replaces the same amount of another product or plain salt.

## Naming and alias disposition

| Language | Display | Alias | Held wording |
|---|---|---|---|
| English | `seasoning salt` | `seasoned salt` | No brand names (`Lawry's`, `Hy's`, `Club House`, `Season-All`) and no “no MSG added” variant as an alias. |
| French | `sel aux épices` | `sel épicé` | `sel assaisonné` is used on a current Canadian product page, but OQLF specifically discourages it; retain it as source evidence only, not a catalog search alias. |

Accent-insensitive search covers the accentless product-page heading `Sel epice`; no separate unaccented alias is needed. Do not add broad `salt / sel`, `spice blend / mélange d’épices`, or `seasoning / assaisonnement` as aliases.

## Source-to-claim map

Sources were accessed on 2026-10-11. Manufacturer pages support their identified product labels and product-specific formulations; they are not a standard formula for every seasoning salt.

| ID | Source | Supports and limits |
|---|---|---|
| **WP05-SEASONING-SALT-20261011-S01** | OQLF, [sel aux épices (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095247/sel-aux-epices). | Lists English `seasoning salt` and `seasoned salt`; preferred French terms `sel aux épices` and `sel épicé`; marks `sel assaisonné` as discouraged. Defines the mixture as salt with flavoring ingredients and distinguishes it from spice rubs. The entry was last updated in 1982; its composition note is not treated as a current universal formula. |
| **WP05-SEASONING-SALT-20261011-S02** | Club House for Chefs, [Lawry’s Seasoned Salt](https://www.clubhouseforchefs.ca/en-ca/products/lawrys/lawrys-seasoned-salt), item codes 066200011826, 066200011833, and 066200011581. | Current Canadian English product page names a branded seasoned salt and lists that SKU’s ingredients. Supports an example within the class, not an alias or all-brand formula. |
| **WP05-SEASONING-SALT-20261011-S03** | Club House pour les chefs, [Lawry’s Sel épicé](https://www.clubhouseforchefs.ca/fr-ca/produits/lawrys/sel-epice-lawrys-11-kg), same item codes. | French counterpart uses `sel épicé` in its description and shows the corresponding product-specific ingredients. Supports the Quebec French alias and a paired bilingual product name, not a universal blend composition. |
| **WP05-SEASONING-SALT-20261011-S04** | Club House pour les chefs, [Club House Sel assaisonné](https://www.clubhouseforchefs.ca/fr-ca/produits/club-house/sel-assaisonne-10-kg), item codes 066200030797 and 066200912956. | French page uses the OQLF-discouraged wording and lists this product’s salt, spices, sugar, aromatics, starch, annatto, oil, autolyzed yeast extract, and acid. Supports documenting market usage and formulation variation, not activating `sel assaisonné`. |
| **WP05-SEASONING-SALT-20261011-S05** | Club House for Chefs, [Club House Seasoned Salt](https://www.clubhouseforchefs.ca/en-ca/products/club-house/seasoned-salt10-kg), same item codes as S04. | English counterpart names the product `Seasoned Salt` and presents the same SKU-specific ingredient panel. Together S04–S05 support the bilingual product pair; they do not establish the generic blend’s composition. |
| **WP05-SEASONING-SALT-20261011-S06** | Club House for Chefs, [2026 French category and culinary-support catalogue](https://www.clubhouseforchefs.ca/en-ca/-/media/clubhouse-for-chef/sales-support/french/2026-big-book-digital-french). | Lists several seasoned/seasoning-salt product lines, including a “sans GMS ajouté” line and Lawry’s “sel épicé.” Supports the existence of distinct market SKUs and terminology variation, not a shared recipe or a guarantee about free glutamate. |
| **WP05-SEASONING-SALT-20261011-S07** | Club House for Chefs, [Celery Salt](https://www.clubhouseforchefs.ca/en-ca/products/club-house/celery-salt900-gr). | Lists celery salt as salt and celery seed for this named product. Supports a neighboring, specifically named blend boundary only; it does not establish that all celery salts share this formula or that celery salt is generic seasoning salt. |

## Limits and follow-up

- Integrate only the broad identity row, with no brand aliases, forms, density, mappings, yields, recipe links, or substitution rule.
- Keep generic salt and all source/texture-specific salt identities as they are. Garlic salt remains a separate active reference and the exact recipe ingredient in recipe 019 is not changed by this proposal.
- Keep MSG, yeast extract, and other ingredients that may appear in a seasoning-salt formula as separate identities. A seasoning-salt SKU’s declaration does not establish a universal composition or MSG status.
- This is a proposal-only documentation change. No tests or emulator run was needed.

**Encoding:** UTF-8 without BOM; French accents are preserved as UTF-8 text.

## Integration disposition

Integrated as `ingredient-ref-seasoning-salt` with the proposed bilingual display and aliases. The shared ledger uses S01–S05 and S07; the 2026 portfolio PDF S06 was not needed for the identity decision. No brand names, formulation, MSG status, recipe links, or numeric behavior were added.
