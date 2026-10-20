# WP04 Section P — whole tilapia product-boundary review (R428)

**Status:** Proposal only; no shared catalog data changed.
**Disposition:** Add one species-neutral whole-tilapia market identity, separate from fillets. Keep the species-specific Nile tilapia candidate unallocated.

## Scope and active checklist

The finfish checklist still includes tilapia among open Section P coverage (plan line 6032). R218 added the species-neutral fresh/frozen fillet market group and explicitly left whole fish separate (plan lines 6611–6613; [R218 proposal](wp04-section-p-next-seafood-gap-review-r218-20261016.md)). This review takes up that unallocated whole-fish boundary only. It does not reopen the fillet identity, the held Nile tilapia species candidate, or any roe decision.

## Proposed exact data delta

Add an identity-only, species-neutral market reference:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-whole-tilapia` |
| English name | `whole tilapia` |
| French name | `tilapia entier` |
| English aliases | `tilapia whole fish`; `frozen cleaned whole tilapia` |
| French aliases | `tilapia poisson entier`; `tilapia entier nettoyé congelé` |
| Category | `PROTEIN` |
| Default density / unit mappings | `null` / `[]` |

The aliases preserve current bilingual retail search wording. The Mayrand listing's frozen/cleaned title remains a search term for the whole-fish market identity; it does not establish a general frozen or cleaned form. Do not create a form beneath the fillet reference: whole fish and fillets are separate market presentations. Do not add a generic tilapia row or species alias.

## Source-backed identity and boundary

Mayrand currently lists the same Anchors Bay item in English as **Frozen Cleaned Whole Tilapia 350/550** and in French as **Tilapia entier nettoyé congelé 350/550**. Both pages show item 10576, the same unit UPC, a 1.36 kg unit, and a 10 × 1.36 kg case; its Québec store panel reports the item in stock at four listed locations. This is direct bilingual Québec product evidence for a whole-fish product distinct from the existing fillets. It does not identify a fish species, explain the 350/550 size notation, or give an edible yield or recipe portion. [S01–S02]

Current Loblaws English and French search listings independently distinguish a Seaquest whole-fish item from fresh/frozen fillet listings: **Tilapia Whole Fish** / **Tilapia, poisson entier**, 1.36 kg. The pages do not state a scientific species or establish whether that item is fresh or frozen. Their search and store availability can vary. [S03–S04]

OQLF defines generic *tilapia* as an edible freshwater fish and lists *tilapia* as the preferred Québec French term. The previously reviewed CFIA Fish List sources map common names to species and document multiple tilapia taxa. The new retail listings therefore support a generic whole-tilapia market identity but do not justify assigning *Oreochromis niloticus* or another species. Reuse OQLF source `WP04-SECTIONP-NILETILAPIA-20261012-S01` and CFIA source `WP04-FINFISH-GAPS-20261010-S11`; leave the existing `candidate-nile-tilapia` hold unchanged. [Existing sources S05–S06]

## Ownership, picker, and corpus audit

At this audit snapshot, the bundled package has **1,724 references, 141 forms, 56 legacy candidates, and 2,083 research-ledger records**. The only active tilapia owner is `ingredient-ref-tilapia-fillets` (`tilapia fillets / filets de tilapia`, category `PROTEIN`; French alias `filet de tilapia`). It has no forms. There is no exact owner for the proposed whole-tilapia ID or terms in active references, forms, or legacy candidates. The only other tilapia ledger owner is held `candidate-nile-tilapia` for *O. niloticus*. Its species-specific display stays inactive because it can capture a bare `tilapia` query. The proposed ID and source-ID prefix have no current collision.

The current picker is phrase-first across reference names, aliases, and form terms. A static evaluation of those rules gives:

| Query | Current result | With proposed row |
|---|---|---|
| `tilapia` | Fillets | Fillets + whole tilapia |
| `tilapia fillets` / `filets de tilapia` | Fillets | Fillets |
| `whole tilapia` / `tilapia entier` | No result | Whole tilapia |
| `tilapia whole fish` / `tilapia poisson entier` | No result | Whole tilapia |
| `frozen cleaned whole tilapia` / `tilapia entier nettoyé congelé` | No result | Whole tilapia |

The broad query will present two distinct displays; no narrower fillet query collides with the new whole-fish choice. The proposal does not activate the Nile species candidate.

I parsed all **114 recipe files** named by the live manifest and scanned each complete file plus ingredient rows: **1,123 ingredient rows; no tilapia/whole-fish match and no tilapia reference link**. There is no bundled recipe demand or line to relink. Corpus path-and-bytes audit hash: `d870d4e10ea14513b63e36f522668d948df59f27e9b21882826885a549ac26cd`.

## Measurements, substitutions, and ledger state

The existing fillet reference has no forms, density, or unit mappings; its ledger keeps product and recipe quantities as source observations only. No active package yield or tilapia substitution row exists in the current package. Mayrand's 1.36 kg is a retailer/SKU package amount only; do not turn it into a normal whole-fish weight, portion, yield, count conversion, density, or unit mapping. Do not interpret 350/550 as a recipe measure. No source in this review supports a substitution between whole fish, fillets, species, or another ingredient.

If integrated, add a ledger record for `ingredient-ref-whole-tilapia` with `recordType: ingredient_reference`, `identityState: verified`, and `measurementState: researched_no_supported_value`. The 1.36 kg unit may be retained as a source-specific package observation with an explicit non-reusable basis; it must not become an active measure or `package-yield` row. Leave `substitutionResearchState: not_yet_researched`, add no substitution observations or rules, and keep recipe links empty. If the package observation is omitted, the measurement state should remain `not_yet_researched`. Record no forms, conversions, densities, recipe-line substitutions, or yields.

## Sources

| ID | Source and support |
|---|---|
| S01 | Mayrand, [Frozen Cleaned Whole Tilapia 350/550](https://mayrand.ca/en/our-products/frozen-food/frozen-fish/frozen-fish/tilapia-entier-nettoye-350550-cg-anchors-bay-10576), item 10576, unit UPC, unit and case package amounts, and Québec store panel. Accessed 2026-10-17. |
| S02 | Mayrand, [Tilapia entier nettoyé congelé 350/550](https://mayrand.ca/fr/nos-produits/surgele/poisson-surgele/poissons-surgeles/tilapia-entier-nettoye-350550-cg-anchors-bay-10576), same item and UPC as S01. Accessed 2026-10-17. |
| S03 | Loblaws, [English results for fresh whole tilapia](https://www.loblaws.ca/en/search?search-bar=fresh+whole+tilapia), current search result showing Seaquest whole fish alongside fillet products. Accessed 2026-10-17. |
| S04 | Loblaws, [French results for fresh whole tilapia](https://www.loblaws.ca/fr/search?search-bar=fresh+whole+tilapia), current French listing `Tilapia, poisson entier` alongside `Filets de tilapia`. Accessed 2026-10-17. |
| Existing S05 | OQLF, [GDT: tilapia](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8367900/tilapia), reused from ledger source `WP04-SECTIONP-NILETILAPIA-20261012-S01`; generic term and definition. |
| Existing S06 | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), reused from ledger source `WP04-FINFISH-GAPS-20261010-S11`; Canadian fish-label common-name and species source. |

**Implementation recommendation:** Add only `ingredient-ref-whole-tilapia` in category `PROTEIN`, with the bilingual displays and four exact retail search aliases above. Keep it species-neutral and separate from `ingredient-ref-tilapia-fillets`; retain the Nile-species hold. Record the retailer pack amount only as a source observation if useful, and add no active form, measure, conversion, yield, recipe link, or substitution.
