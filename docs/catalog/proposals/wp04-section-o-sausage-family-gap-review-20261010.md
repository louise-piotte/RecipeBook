# WP04 Proposal: Section O Sausage-Family Demand and Product Boundary

**Review date:** 2026-10-10
**Status:** Reviewed; the narrow breakfast-sausage identity evidence was accepted in the research ledger. No active seed, recipe, code, or test file changed.
**Scope:** Audit the open WP04 Section O sausage checklist (regional chorizos, andouille, merguez, kielbasa, lap cheong, blood sausage, and related fresh/cured/smoked products) against the current 114-recipe package, then review the one exact meat-sausage line and its source boundary.

The underlying checklist is in [plan Section O](../../RecipeBook-global-ingredient-catalog-plan.txt).

## Disposition

Do not add a new regional-sausage identity or alias from this review. No bundled ingredient line requests chorizo, andouille, merguez, kielbasa, lap cheong, blood sausage, or boudin. The single meat-sausage ingredient line is already linked to `ingredient-ref-breakfast-sausage`; keep that row and link. `ingredient-ref-merguez-sausage` is also already active, but has no recipe-line demand.

One narrow integration is justified: document source-backed identity evidence for the existing breakfast-sausage reference in its research-ledger record. CFIA places “Breakfast Sausage” with uncooked sausage in its meat-product standard, while OQLF and a current Québec government product listing support the bilingual breakfast-sausage wording. This evidence supports the named product class, not a universal species, formula, package form, weight, substitution, or current source version for recipe 027. No change to the active reference row or bundled recipe is justified here.

Keep the Section O sausage checklist open. In particular, do not use generic “sausage” as an alias for any named regional family, merge fresh/uncooked products with preserved/cured products, or infer raw/cured/smoked state from culinary resemblance. Do not infer cooking safety or interchangeability.

## Snapshot and audit method

The audit used all manifest-listed recipe files, checking every ingredient row’s `originalText`, `ingredientName`, and `ingredientRefId`, and both language records’ titles, descriptions, instructions, and notes for `choriz*`, `andouill*`, `merguez`, `kielb*`, `kiełb*`, `lap cheong/chiong/chong`, `blood sausage`, `boudin`, `sausage`, `saucisse`, and `saucisson`.

| Artifact | Current snapshot | SHA-256 |
| --- | ---: | --- |
| [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe files | 114 files / 1,123 ingredient rows | Audited directly from the manifest |
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 867 references | `6fb175c66019050aaef8e8f34a405200eda893bfb3fd67c5acaf77ad3a1cdf95` |
| [Legacy import identity candidates](../legacy-import-identities.v1.json) | 78 candidates | No sausage-family term matched |
| [Research ledger](../research-ledger.v1.json) | 1,113 records | Breakfast-sausage record is unreviewed; merguez record is verified |

The hashes above identify the bytes read during this review. The 114 recipe paths and 1,123 row total were counted from those files; the word-pattern search was used to find candidates, then each hit was checked in its recipe context. This is a corpus text audit, not a claim that the sources behind every imported recipe remain unchanged.

## Exact recipe demand

| Corpus match | Exact saved evidence | Disposition |
| --- | --- | --- |
| `027#1` — [Breakfast Casserole](../../../app/src/main/assets/seed/bundled-library/recipes/027-casserole-dejeuner-breakfast-casserole-9015696d-4126-49ee-91f5-578d66061fd9.v1.json), ingredient `9015696d-4126-49ee-91f5-578d66061fd9-ingredient-1` | `originalText: "1 lb breakfast sausage"`; `ingredientName: "breakfast sausage"`; linked to `ingredient-ref-breakfast-sausage`; saved quantity `1`, unit `lb`. The French/English instructions say to brown the sausage and break it up into crumbs. | Retain the saved line, quantity, unit, and link. It is exact demand for the existing breakfast-sausage identity, not for a particular species or one of the open regional families. |
| `102` — Saucissons de chocolat / Chocolate Sausage | The French title/instructions and English title/instructions use sausage imagery for a chocolate, cookie, marshmallow, raisin, and pine-nut log. No meat-sausage ingredient row occurs. | Exclude as a confection; it creates no sausage-family demand. |

No ingredient row in the 114-recipe package contains an exact family term for chorizo, andouille, merguez, kielbasa, lap cheong, blood sausage, or boudin. The only other sausage-word matches in recipe text are the descriptions/instructions for `027` and the confectionary title/instructions for `102` above.

The source URL stored on recipe 027 is [Preppy Kitchen, Breakfast Casserole](https://preppykitchen.com/breakfast-casserole/). Its current page says “ground pork sausage,” describes it as adding breakfast-sausage flavor, and offers turkey sausage as a lighter option. The current ingredient list gives **2 pounds ground pork sausage (900 g)**; the bundled line is **1 lb breakfast sausage**. This is a material source-version conflict in both amount and wording. It does not establish what the saved recipe version meant, and it does not authorize replacing the saved row with pork sausage, ground pork, or turkey sausage. Keep the discrepancy for source-version reconciliation outside this identity review.

## Current references, candidates, and related work

| Current record | Snapshot state | Review decision |
| --- | --- | --- |
| `ingredient-ref-breakfast-sausage` — `breakfast sausage` / `saucisse à déjeuner` | Active `PROTEIN` reference; exact recipe link in `027#1`; ledger `identityState: unreviewed`, no sources or decisions | Keep unchanged. A ledger-only evidence update may verify the identity class and its boundary. Keep species and preparation qualifiers out of the generic reference. |
| `ingredient-ref-merguez-sausage` — `merguez sausage` / `merguez` | Active `PROTEIN` reference; ledger identity is verified from OQLF record `WP06-AFRICA-GAP-20261010-S01`; no recipe ingredient line matches | Keep its existing source-backed identity and narrowly accepted spelling variants. No new row, recipe link, measure, or formulation follows from this audit. |
| Other listed families | No active reference or legacy candidate matched the terms in this review | Keep unresolved until an exact recipe line, product request, or other bounded requirement supplies demand. |

Related local findings already cover the nearest boundaries: the [WP06 North American cuisine review](wp06-north-american-cuisine-gap-sweep-20261009.md) leaves andouille/tasso/roux unresolved pending product-definition and Québec French evidence; the [WP06 African cuisine review](wp06-african-cuisine-gap-sweep-20261010.md) records the source-bounded merguez decision; and the [WP04 offal review](wp04-section-o-offal-identity-gap-review-20261010.md) leaves regional sausages open. This packet does not repeat or broaden those decisions.

## Sourceable product boundary for the existing recipe demand

CFIA’s Canadian Standards of Identity, Volume 7, Table 2, Part A, item 15 groups “Sausage (uncooked), Breakfast Sausage, Dinner Sausage.” Its mandatory ingredients are fresh boneless meat, fresh meat by-product, fresh mechanically separated meat, or a combination; it also specifies comminution and a frozen treatment when mechanically separated meat is used. Item 17 separately names preserved/cured sausage. This gives a Canadian product-class boundary between breakfast/uncooked sausage and preserved/cured sausage. It does not establish a particular meat species or formula for the US publisher’s recipe or every breakfast sausage sold in Québec.

OQLF’s food-domain GDT entry lists French `saucisse` with English `breakfast sausage`. A separate OQLF entry defines fresh sausage as coarsely ground, seasoned meat and lists breakfast sausage as an associated term. These entries support the lexical and fresh-sausage connection, but are old terminology records (updated 1984 and 1983) and do not support changing the existing French display to a different term.

The current Québec Food Directory product entry `Saucisses déjeuner de porc et boeuf non cuites` documents one local product: 110 portions of 45 g, 4.95 kg net, made with pork and beef, held frozen, with product-specific ingredients. This is strong evidence that an actual Québec breakfast-sausage product can be multi-species, formed in portioned links, and frozen. It is **not** a generic definition, a count-to-mass measure for recipe 027, or evidence that recipe 027’s saved line intended that product.

The OQLF merguez entry defines a North African sausage and lists `merguez` / `mergues` / `merghez` and English `merguez sausage` / `mergues sausage`. Its historical definition mentions an original beef or beef-and-mutton formulation and says offal is often included. Because those qualifiers are historical/qualified descriptions, not a current universal formulation, retain the existing identity-only treatment; do not encode species or ingredients. There is no exact recipe demand to expand it in this packet.

## Family-by-family hold

| Open Section O family | Exact recipe demand | Disposition |
| --- | --- | --- |
| Regional chorizos | None in ingredient rows | Hold. Do not add an unqualified regional umbrella or infer Spanish/Mexican/other product equivalence. |
| Andouille | None in ingredient rows | Hold. Reuse the existing WP06 follow-up boundary; do not promote the Louisiana-source mention without the unresolved Québec term/product-definition review. |
| Merguez | None in ingredient rows; active identity already exists | Retain the established OQLF-scoped identity; no new integration. |
| Kielbasa | None in ingredient rows | Hold. No species, regional product, state, or label boundary is demanded by the corpus. |
| Lap cheong | None in ingredient rows | Hold. No romanization, regional product, species, or preservation boundary is demanded by the corpus. |
| Blood sausage / boudin | None in ingredient rows | Hold. CFIA standardizes separate names for blood sausage, black/blood pudding, and blood-and-tongue sausage with different mandatory ingredients. Do not alias these names together or equate French `boudin`/`boudin noir` without a source-specific Québec terminology and product review. |
| Fresh, uncooked, preserved, cured, smoked sausage | Only `027#1` says breakfast sausage; its stored state is not independently version-verified | Keep the existing breakfast-sausage row. Do not infer a generic raw/fresh/smoked/cured status or create a global sausage form from one source line. |

## Proposed integration boundary

If this proposal is accepted, make only these narrow evidence updates in the ledger:

1. For `ingredient-ref-breakfast-sausage`, add the OQLF, CFIA, and Québec Food Directory sources below and set the identity finding to verified for the **named breakfast-sausage class**. Preserve the current reference ID, `PROTEIN` category, English display, French display, aliases, and recipe link. If the reviewer does not accept the historical OQLF records as adequate bilingual support, leave identity state unreviewed and record that limitation rather than changing the term.
2. Leave `measurementState` and `substitutionResearchState` unchanged. The Québec product’s 45 g per link is product-specific and does not quantify the saved recipe’s one-pound line; neither the product listing nor identity standards establish a substitution ratio.
3. Make no recipe-file, active-reference, form, unit-mapping, substitution-rule, candidate, roadmap, or checklist edit from this packet. Keep the Section O sausage checklist open.

No new catalog row is justified. The useful catalog distinction is already represented by the active breakfast-sausage reference and the broader CFIA boundary between the standardized breakfast/uncooked and preserved/cured classes. New regional identities require exact demand and family-specific evidence.

## Sources

All online sources below were accessed **2026-10-10**. Local source text was read from the current worktree snapshot on the same date.

| ID | Source | Evidence and limit |
| --- | --- | --- |
| **WP04-SECTION-O-SAUSAGE-20261010-S01** | CFIA, [Canadian Standards of Identity: Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7), Table 2, Part A, items 11–17 | Items 15 and 17 distinguish uncooked/breakfast sausage from preserved/cured sausage; item 12–14 distinguish blood sausage, black/blood pudding, and blood-and-tongue sausage. Regulatory product-class and ingredient boundary; not a recipe-specific formulation or substitution source. |
| **WP04-SECTION-O-SAUSAGE-20261010-S02** | OQLF GDT, [`saucisse` (English translation: breakfast sausage)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497227/saucisse) | Food/charcuterie entry with French preferred term `saucisse` and English translation `breakfast sausage`; entry last updated 1984. Does not prove species, fresh state, or the exact `saucisse à déjeuner` display string. |
| **WP04-SECTION-O-SAUSAGE-20261010-S03** | OQLF GDT, [`saucisse` (fresh sausage)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2092656/saucisse) | Defines fresh sausage as meat generally from trimmings, sorted, coarsely ground, and seasoned; lists breakfast sausage as an associated English term. Entry last updated 1983; terminology evidence only. |
| **WP04-SECTION-O-SAUSAGE-20261010-S04** | Québec Food Directory, [Breakfast pork and beef sausages uncooked](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8239755) | Current product-specific Québec evidence: 110 × 45 g, net 4.95 kg, pork and beef with listed ingredients, frozen storage; page last updated 2026-07-08. Not a generic definition, recipe-027 source, or transferable count-weight observation. |
| **WP04-SECTION-O-SAUSAGE-20261010-S05** | Preppy Kitchen, [Breakfast Casserole](https://preppykitchen.com/breakfast-casserole/) | Current page lists 2 pounds/900 g ground pork sausage and describes optional turkey sausage, while the saved `027#1` line says 1 lb breakfast sausage. Current page was accessed 2026-10-10; source version differs from the bundled line. Do not revise the saved recipe from this comparison. |
| **WP04-SECTION-O-SAUSAGE-20261010-S06** | OQLF GDT, [merguez](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2092736/merguez) | Direct Québec bilingual terminology entry; last updated 1983. Existing ledger source `WP06-AFRICA-GAP-20261010-S01` already records the accepted identity and limits. Its formula notes are not treated as a current universal ingredient specification. |
| **WP04-SECTION-O-SAUSAGE-20261010-S07** | Johnsonville Canada, [Saucisses à Déjeuner de Porc et Bœuf](https://johnsonville.ca/fr/products/saucisses-a-dejeuner-de-porc-et-boeuf/) | Current French-language product page for a Québec-made pork-and-beef breakfast sausage. Supports local product naming and one composition only; it does not define a universal formula or a recipe conversion. |

## Search notes and limits

Local search on 2026-10-10 covered the manifest-listed package, active references, the 78 legacy-import candidates, the research ledger, the open Section O plan line, and matching WP04/WP06 proposal files. The currently linked recipe and the live publisher page are not the same saved version. Québec’s product directory describes one current marketed product; it cannot establish the recipe author’s intended meat, package, link count, or preservation details. No recipe demand or source basis was found for promoting the unrepresented named families in this review. No cooking-safety, handling, yield, mass-conversion, or interchangeability finding is proposed.

## Coordinator disposition — 2026-10-10

Accepted the ledger-only verification for the existing `breakfast sausage / saucisse à déjeuner` identity. Added CFIA product-class evidence, OQLF terminology, one Québec government product listing, and one current French-language Québec-market product listing to `ingredient-ref-breakfast-sausage`, and set only its ledger identity state to verified. The active reference, aliases, measurement/substitution states, recipe 027#1 text and link, quantity, and unit remain unchanged. No regional sausage family was added, and the Section O sausage checklist remains open. The current publisher page does not match the saved recipe version and was not used to revise the bundled recipe.
