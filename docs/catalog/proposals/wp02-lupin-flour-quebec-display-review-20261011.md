# WP02 Québec French display recheck for lupin flours

- **Reviewed:** 2026-10-11
- **Status:** Root review integrated. Both existing French displays are retained; no catalog alias or numeric behavior changed. The source evidence and decision are now in the research ledger, and the stale specific Québec-review note is closed. The broader WP02 review remains open.
- **Proposal-local source IDs:** `WP02-LUPIN-DISPLAY-QC-20261011-S01` through `S04`; these are not ledger records.
- **Relationship to prior work:** `docs/catalog/proposals/wp02-b2-mung-bean-flour-quebec-review-20261011.md` already covers these same two lupin displays. This packet is a narrow recheck of the primary terminology evidence and current package state; it introduces no different catalog recommendation.

## Decision

| Existing identity | Recommendation | Reason and boundary |
|---|---|---|
| `ingredient-ref-sweet-lupin-flour` — sweet lupin flour / **farine de lupin blanc** (*Lupinus albus*) | **Retain** `farine de lupin blanc`. | Santé Canada pairs this exact French flour label with sweet lupin flour and *L. albus*. OQLF lists *lupin blanc* as a preferred term for *L. albus*. Neither source establishes bare `farine de lupin` as a species-specific flour alias. [S01–S02] |
| `ingredient-ref-sweet-blue-lupin-flour` — sweet blue lupin flour / **farine de lupin à feuilles étroites** (*Lupinus angustifolius*) | **Retain** `farine de lupin à feuilles étroites`. | Santé Canada pairs this wording with sweet blue lupin flour and *L. angustifolius*. OQLF records `lupin à feuilles étroites` for that species, although its entry is old and in an animal-feed domain. This is the narrower French label; do not shorten it or activate bare `lupin bleu` as a flour alias. [S01, S03–S04] |

The official federal flour list supports the existing bilingual display pairs. The French label for white lupin does not literally repeat the English qualifier *sweet*. CFIA distinguishes sweet and bitter types within white lupin, so retain the exact federal French label without inventing `doux`; also do not broaden the French name to every white-lupin flour product. Revisit only if a source establishes a separate bitter-lupin flour product or a Québec display distinction. [S01, S04]

## Evidence and naming scope

Santé Canada’s French list names `farine de lupin blanc (Lupinus albus)` and `farine de lupin à feuilles étroites ou lupin bleu (Lupinus angustifolius)`. Its matching English list names sweet lupin flour and sweet blue lupin flour for those species. These are direct Canadian food-ingredient labels, while OQLF provides Québec French species terminology. The federal list is specifically about novelty determinations and states that listed entries did not undergo a food-safety assessment; this proposal uses it only for the label, flour class, and species scope. [S01]

For *L. albus*, OQLF lists `lupin blanc` among preferred terms and supplies the scientific identification. The entry concerns the plant/seed and notes culinary use as lupini; it does not define a flour product. Combined with Santé Canada’s exact flour label, it supports the current `farine de lupin blanc` display, without promoting unqualified `farine de lupin` to a white-lupin alias. [S01–S02]

For *L. angustifolius*, OQLF’s `graine de lupin` entry names `lupin à feuilles étroites`. The entry dates to 1965 and belongs to zootechnics/animal nutrition, so it supports the species descriptor rather than a contemporary flour label. Santé Canada independently uses that descriptor in its exact French flour name. CFIA’s current seed-inspection instructions identify *L. angustifolius* as `lupin bleu` and distinguish it from white and yellow lupins; because this is crop terminology, it does not establish `lupin bleu` alone as a flour synonym. [S01, S03–S04]

## Live package, collision, and demand audit

Read-only audit of the current manifest package on 2026-10-11:

| Surface | Current result | Disposition |
|---|---|---|
| Active ingredient references | 942 total. The only lupin entries are the two IDs above. Both have empty `aliasesFr` and `aliasesEn`, `defaultDensity: null`, and `unitMappings: []`. | Keep both rows as-is. Do not add generic `farine de lupin`, `lupin flour`, or bare `lupin bleu` aliases. |
| Key and display overlap | No duplicate ID or exact bilingual display key. The French display labels share the words `farine de lupin`; the English labels share `lupin flour`. | Keep the two species-distinguishing full displays; do not add a generic identity that would blur them. Search for the shared fragment may reasonably surface both. |
| Forms and recipe demand | 53 active forms; zero lupin forms. A recursive text scan of all 114 manifest-listed recipe files and 1,123 ingredient rows found zero `lupin`/`lupini` mentions. | No recipe link, relink, form, or recipe wording edit. |
| Measurements, conversions, yields, substitutions | The two references have no density or unit mappings; no lupin match exists among the eight research-ledger unit conversions. The package has one unrelated package-yield row and zero global or contextual substitution rules. | Add no density, unit mapping, conversion, yield, or substitution. |

The current ledger marks both reference identities `verified` and leaves their measurement and substitution research `not_yet_researched`. The blue-lupin reason still says to defer the source-attested `lupin bleu` synonym pending Québec review; the white-lupin reason also says terminology review remains open. The existing same-day proposal already documents the review result, and this recheck confirms it. Root can revise those two stale wording clauses to record the completed decision while preserving the identity, measurement, and substitution states.

## Exact proposed disposition for root

- Keep `farine de lupin blanc` and `farine de lupin à feuilles étroites` as the French display names.
- Keep both alias arrays empty; in particular, do not add the shared generic `farine de lupin` or bare crop name `lupin bleu`.
- Close the specific plan note that says the two French lupin labels still need independent Québec terminology review. Keep broader WP02 flour coverage and independent Québec terminology work open.
- Record the naming decision in the two ledger decision reasons when the shared ledger is next updated. Keep measurements and substitutions unresearched; this review supplies no form, density, conversion, package yield, recipe link, or replacement evidence.

## Root integration outcome

Root accepted the terminology recommendation on 2026-10-11. Ledger records
`ingredient-ref-sweet-lupin-flour` and `ingredient-ref-sweet-blue-lupin-flour` now cite the OQLF
species entries and CFIA crop distinctions alongside the existing bilingual Health Canada flour
labels. The full current displays remain unchanged; both alias arrays stay empty. Measurement and
substitution states remain `not_yet_researched`. The plan's specific lupin-label review is complete;
broader WP02 flour and Québec terminology work remain open. No seed, form, recipe, runtime, or test
data changed.

## Source register

All sources were checked on 2026-10-11. Proposal-local IDs below are not ledger IDs.

| ID | Source and claim support | Scope limit |
|---|---|---|
| **S01** | Santé Canada, [French non-novel determinations list](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html) and [English list](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html). Rows dated 2025-09-04 and 2015-09-17 pair the two English flour names with the French labels and scientific species. The page states that these determinations concern novelty status and are not food-safety assessments. | Canadian food-ingredient labels; not an OQLF ruling, product taxonomy for every lupin flour, or safety assessment. |
| **S02** | OQLF, [lupin — *Lupinus albus*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296940/lupin), GDT entry last updated 1991. Lists `lupin blanc` as a preferred term and identifies *L. albus*. | Species/seed terminology; does not name a flour product. |
| **S03** | OQLF, [graine de lupin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8497668/graine-de-lupin), authored by Marcello Piccioni (1965). Its definition maps *L. angustifolius* to `lupin à feuilles étroites`. | Old animal-feed terminology entry; supports the species phrase only, not food-flour naming. |
| **S04** | CFIA, [Instructions particulières IP 142.1.2-3 : inspection des cultures de semences de légumineuses](https://inspection.canada.ca/fr/protection-vegetaux/semences/methodes-dinspection/legumineuses-grains), modified 2026-04-01. Annex V identifies white, yellow, and blue lupins with species names and says white lupin occurs in sweet or bitter types. | Seed-crop terminology and species/crop distinctions; not a flour label or culinary equivalence source. |

**Recommendation:** retain the two current Québec French displays, add no aliases or data behavior, and treat the specific lupin-label review as complete after root reconciles the stale plan/ledger wording. This recommendation does not close the broader WP02 plan.
