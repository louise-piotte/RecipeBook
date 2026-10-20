# WP04 Section P — Argentine red shrimp identity and picker boundary (round 68)

- **Review date:** 2026-10-13.
- **Disposition:** Hold the species-specific row and ledger allocation until search preserves the full species-qualified phrase. The identity and Québec food-market evidence are strong, but a row displayed as **Argentine red shrimp / crevette rouge d’Argentine** would also capture the unqualified queries **red shrimp** and **crevette rouge** as a singleton.
- **Scope:** Argentine red shrimp, *Pleoticus muelleri*, as a species identity. This is distinct from the earlier generic fresh-shrimp/prawn hold and from dried shrimp, shrimp pastes, and prepared seafood.
- **Proposal-only:** This file only. No catalog JSON, ledger, recipe, plan, roadmap, checklist, or code changed. No app tests or emulator checks were run.
- **New source-ID prefix:** **WP04-SECTIONP-ARGENTINE-RED-SHRIMP-20261013-R68-**. Checked against the current proposal/batch archive and research ledger before drafting; no occurrence found.

## Decision

Keep the prospective identity unallocated for now. Argentine government nomenclature and the Canadian Fish List establish that *Pleoticus muelleri* is a food-market shrimp species. A Canadian Atlantic seafood supplier pairs the species with **crevette rouge d’Argentine** and lists retail-ready product packaging. A current Québec wholesaler lists raw frozen **crevettes roses d’Argentine** in several Québec stores. The name and food status are therefore better supported than the generic shrimp candidate.

The blocker is the current picker’s phrase matching. If a new row uses the source-backed display **Argentine red shrimp / crevette rouge d’Argentine**, the search terms include the subphrases **red shrimp** and **crevette rouge**. Each query currently has no result; after adding the row each would return only *P. muelleri*. That would turn broad colour-based wording into a species-specific search result without displaying the Argentine qualifier. The Canadian Fish List shows that “shrimp / crevette” is used across many taxa, and Québec’s OQLF has a separate red-shrimp entry for *Pleoticus robustus*. The bundle also has no shrimp recipe demand that could justify accepting this narrowing.

Revisit this candidate if the picker can require the full qualified name when a query is a proper subphrase of the display, or if a future catalog/search design can show the broader red-shrimp choices. Do not create an alias or a generic fresh, raw, frozen, peeled, or shell-on form in the meantime.

## Species, food status, and bilingual name

Argentina’s current government resolution names *Pleoticus muelleri* as langostino patagónico, notes the commercial name gambón argentino, and gives **Argentine red shrimp** as its English name [S01]. The European Commission’s species page independently pairs *P. muelleri* with French commercial wording **crevette rouge d’Argentine** and English **Argentine Red Shrimp**; that is supporting international trade terminology, not a Canadian label authorization [S03].

CFIA’s Fish List includes *P. muelleri* (TSN 95971), but the listed English/French common-name pair for this taxon is only **Shrimp / Crevette** [S02]. The same list returns many shrimp entries and assigns generic shrimp/crevette labels to multiple species. CFIA’s common-name guidance allows generally known or specific descriptive names where there is no prescribed common name, but this review did not locate a CFIA decision approving the qualified name for *P. muelleri* as a Canadian label [S08].

Québec terminology supports **crevette** as the preferred local headword and **shrimp** as its English equivalent; OQLF labels **prawn** as a UK usage on that generic entry [S06]. OQLF does not provide a located species-specific entry for *P. muelleri*. Its current 2025 entry **crevette royale rouge** identifies a different taxon, *P. robustus* [S07]. For a future qualified row, **Argentine red shrimp / crevette rouge d’Argentine** is supported by the French-language Canadian supplier page and by international commercial naming, but it should be treated as market-attested Québec French rather than an OQLF-standardized name.

The Canadian supplier Aliments Pearlmark explicitly identifies its Argentine red shrimp as *P. muelleri*, gives the French name, and lists several frozen raw or peeled product presentations [S04]. Mayrand’s current product page lists **Crevettes roses d’Argentine crues 16/20 surgelées 2 lb**, shows a 908 g unit, and reports stock at stores in Anjou, Laval, Brossard, and Saint-Jérôme [S05]. Mayrand’s page does not name the binomial, so its SKU is evidence of Québec food-market availability for Argentine pink shrimp wording, not by itself proof that that SKU is *P. muelleri*. The supplier species page and local retailer page are related market evidence, but they do not establish identical products or an item-level crosswalk.

## Archive and exact ownership audit

The plan’s shrimp/prawn parent still covers meaningful preparations. The earlier **fresh shrimp/prawn identity and preparation boundary** review held only the generic global identity because the bundle had no demand and the active picker already distinguishes dried shrimp and Kapi [P01]. It did not make a species-level decision for *P. muelleri*. Searches of the current Section P proposals, batch READMEs, plan, live seed data, legacy identities, and ledger found no focused Argentine-red-shrimp or *P. muelleri* review/allocation. The frozen seafood-medley hold is a separate mixed-product decision.

Current live snapshot: **1,390 active references, 100 forms, 63 legacy candidates, and 1,723 research-ledger records**. Exact normalized ownership checks used the app’s lowercase/NFKD/diacritic and punctuation folding. No exact display, alias, form term, legacy identity, or ledger identity owner was found for:

- *Pleoticus muelleri* or the suggested ID **ingredient-ref-argentine-red-shrimp**;
- **Argentine red shrimp**, **Argentine shrimp**, or **crevette rouge d’Argentine**;
- **crevette(s) rouge(s) d’Argentine**, **crevette rose d’Argentine**, or **Argentinian shrimp**.

The exact proposed English/French display phrases have no active owner. Nearby active identities are distinct:

| Active identity | Existing scope |
|---|---|
| **ingredient-ref-dried-shrimp** — dried shrimp / crevette séchée | Dried product identity, including only its existing dried-shrimp plural aliases; no Argentine species claim. |
| **ingredient-ref-saeu-jeot** — saeu-jeot (salted shrimp) / saeu-jeot (crevettes coréennes fermentées au sel) | Named Korean salted-fermented product, not fresh shrimp meat. |
| **ingredient-ref-kapi-shrimp-paste** — kapi / pâte de crevettes Kapi | Named fermented paste condiment, not shrimp meat. |
| **ingredient-ref-bagoong-alamang**, **ingredient-ref-belacan**, **ingredient-ref-terasi** | Named fermented shrimp condiments; not species identities for *P. muelleri*. |

No form is attached to any of the shrimp-related active references above, and no form label or match term owns the candidate’s exact name. The legacy file has no shrimp/prawn candidate. The ledger has no exact candidate ID, binomial identity record, or exact candidate phrase allocation. The full proposed source-ID prefix was absent from the existing ledger/archive; no source records are proposed in this documentation-only hold.

## Search result projection

The projection follows **IngredientSearch.kt**: normalized complete word phrases are returned first, including phrases contained within a longer display; substring matching is the fallback. Forms are searched with their parent reference. This is a read-only data projection, not a runtime picker test.

| Query | Current results | If the candidate row were added with the proposed display | Effect |
|---|---|---|---|
| **Argentine red shrimp** | None | Argentine red shrimp / crevette rouge d’Argentine | Correct qualified English result. |
| **crevette rouge d’Argentine** | None | Argentine red shrimp / crevette rouge d’Argentine | Correct qualified French result. |
| **red shrimp** | None | Argentine red shrimp / crevette rouge d’Argentine | Misleading singleton: the query omits the Argentine qualifier. No alias is needed for this result; the current phrase matcher finds the subphrase inside the display. |
| **crevette rouge** | None | Argentine red shrimp / crevette rouge d’Argentine | Same narrowing in French: a partial species qualifier returns one species. |
| **shrimp** | Dried shrimp; saeu-jeot | Those two plus Argentine red shrimp | Broad query gains another result but remains multi-result. |
| **crevette** | Dried shrimp | Dried shrimp plus Argentine red shrimp | Broad singular French query gains a second result. |
| **crevettes** | Bagoong alamang; belacan; dried shrimp; Kapi; saeu-jeot; terasi | Unchanged | The proposed singular French display does not match the plural query; no plural alias is proposed. |
| **prawn** | None | None | No alias or display uses this UK-labelled generic term. |

The central collision is therefore not exact ownership; it is the picker’s subphrase behavior. The CFIA species list and OQLF’s separate *P. robustus* terminology show why a future query for an unqualified red shrimp should not appear species-resolved merely because this is the first red shrimp row added to the catalog.

## Recipe demand

The current package manifest lists **114 recipe files and 1,123 ingredient rows**. A normalized scan of all manifest-listed recipe JSON and ingredient rows covered **Argentine red shrimp**, **Argentine shrimp**, **red shrimp**, **Argentinian shrimp**, *Pleoticus muelleri*, **crevette rouge d’Argentine**, **crevettes rouges d’Argentine**, **crevette rose d’Argentine**, **crevette(s)**, **shrimp**, and **prawn**.

**Result: zero matching recipe files and zero matching ingredient rows** for the candidate and zero recipe rows containing generic shrimp/prawn/crevette wording. No recipe requests the species, product state, or an amount that would justify an active identity, form, recipe link, or substitution.

## Numeric and substitution scope

| Evidence area | Finding | Catalog treatment |
|---|---|---|
| Identity | The Argentine government taxonomic entry, CFIA species-linked row, and species-qualified supplier page support *P. muelleri*. | If later activated, use one species identity in **PROTEIN**; do not treat geographic capture claims as aliases. |
| Product state | Canadian supplier and Québec retailer pages show raw and frozen product presentations; the supplier page also shows whole and peeled configurations. | Keep raw/cooked readiness, fresh/frozen state, peeled/shell-on presentation, and count grade as separate dimensions. Add no form while the row is held. |
| Measurements | Mayrand’s 908 g/2 lb package and 16/20 grade are item-specific; Pearlmark’s other pack sizes and grade ranges are supplier/SKU data. Neither source gives a transferable count-to-mass, edible yield, density, household volume, or recipe serving rule for generic *P. muelleri*. Argentina’s species food-composition values and biological body-size limits are not kitchen conversions. | Do not add density, unit mapping, reusable measure, count conversion, package yield, or active numeric behavior. Preserve listing values only as source-specific observations if a future recipe creates a reason to ledger them. |
| Substitution | No reviewed recipe or authoritative product source supplies a directed cooking substitution between Argentine red shrimp and northern shrimp, generic shrimp, dried shrimp, prawns, crab, fish balls, surimi, or another seafood at a stated method and quantity. | Add no global form conversion, contextual substitution rule, substitution link, or recipe-specific substitute. |

## Conditional integration sketch

Do not integrate the row in the current picker. If a future search change preserves the full qualifier and a recipe or library requirement establishes need, the narrow identity-only shape to reassess is:

| Field | Conditional value |
|---|---|
| ID | **ingredient-ref-argentine-red-shrimp** |
| Category | **PROTEIN** |
| English display | **Argentine red shrimp** |
| Québec French display | **crevette rouge d’Argentine** |
| Scientific scope | *Pleoticus muelleri* only |
| Aliases | Empty in both languages until independently reviewed; do not add **red shrimp**, **crevette rouge**, **shrimp**, **crevette**, **prawn**, **gambón**, **langostino**, or the scientific name as aliases. |
| Forms, density, mappings | None initially. |
| Recipe links or substitutions | None without a matching recipe and method/quantity evidence. |

The alias exclusions do not prevent the current subphrase matches from the displays; resolving those requires search behavior that preserves the full qualifier, not merely an empty alias list.

## Source register and limits

Sources were accessed or rechecked on 2026-10-13. Links establish the narrow claims in the evidence column and do not establish recipe equivalence.

| ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-ARGENTINE-RED-SHRIMP-20261013-R68-S01** | Argentina, [Resolución 25/2018, current consolidated text](https://www.argentina.gob.ar/normativa/nacional/resoluci%C3%B3n-25-2018-307497/actualizacion), updated by Resolución 98/2026. | Names *Pleoticus muelleri*, langostino patagónico, the commercial name gambón argentino, and English **Argentine red shrimp**. Argentine legal and commercial naming; not Canadian label approval or a kitchen-measure source. |
| **WP04-SECTIONP-ARGENTINE-RED-SHRIMP-20261013-R68-S02** | CFIA, [Fish List search for shrimp](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=shrimp) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | The target *P. muelleri* appears as TSN 95971 with **Shrimp / Crevette**; the broader search returns many shrimp taxa. The list page reports modification date 2023-09-18. Supports Canadian species-linked naming and broad-name collision; does not approve **Argentine red shrimp** as the CFIA common name. |
| **WP04-SECTIONP-ARGENTINE-RED-SHRIMP-20261013-R68-S03** | European Commission, [Commercial designations for *Pleoticus muelleri*](https://fish-commercial-names.ec.europa.eu/fish-names/species/pleoticus-muelleri_en). | Lists English **Argentine Red Shrimp** and French **crevette rouge d’Argentine** among EU country commercial designations and identifies the species. International trade-name evidence, not Québec terminology standardization or a Canadian label determination. |
| **WP04-SECTIONP-ARGENTINE-RED-SHRIMP-20261013-R68-S04** | Aliments Pearlmark, [Crevettes rouges d’Argentine](https://www.pearlmarkfoods.com/fr/nos-produits/crevettes-rouges-dargentine). | Canadian seafood supplier page directly pairs *P. muelleri* with the French display and describes wild Southwest Atlantic sourcing, raw/frozen presentations, and retail-ready packaging. Supplier marketing/product page; it does not prove every similarly named retailer SKU is this species or show current physical inventory. |
| **WP04-SECTIONP-ARGENTINE-RED-SHRIMP-20261013-R68-S05** | Mayrand, [Crevettes roses d’Argentine crues 16/20, surgelées, 2 lb](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/crevette-crue-surgelee/crevettes-crues-roses-dargentine-1620-surgelees-oceanic-04701). | Current product page shows a 908 g unit and store-availability indicators in Québec locations. Retail/product evidence; the listing does not identify *P. muelleri* or define the 16/20 grade’s unit basis, so these figures are not transferable measures. |
| **WP04-SECTIONP-ARGENTINE-RED-SHRIMP-20261013-R68-S06** | OQLF, [crevette (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198913/crevette). | Preferred Québec French headword **crevette**, English **shrimp**, and **prawn** marked Royaume-Uni. Entry dates to 1998 and is terminology evidence, not a species-level or product-label decision. |
| **WP04-SECTIONP-ARGENTINE-RED-SHRIMP-20261013-R68-S07** | OQLF, [crevette royale rouge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26583406/crevette-royale-rouge). | Current 2025 terminology entry pairs the Québec French name with *Pleoticus robustus*, a different species. Do not transfer that name to *P. muelleri*; it supports keeping red-shrimp terms species-qualified. |
| **WP04-SECTIONP-ARGENTINE-RED-SHRIMP-20261013-R68-S08** | CFIA, [Common name on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name). | Describes use of generally known or specific descriptive names where no prescribed common name applies, and when a food condition should be part of the common name. It does not rule on this candidate’s specific Canadian label. |
| **P01** | Existing proposal, [fresh shrimp/prawn identity and preparation boundary](wp04-fresh-shrimp-prawn-boundary-review-20261009.md). | Previously held only generic fresh shrimp/prawn; its search and recipe findings are relevant context but not a species-specific assessment of *P. muelleri*. |

## Next action

Keep Argentine red shrimp outside active references, forms, and ledger until the picker can distinguish its full qualified name from subphrase queries and recipe/library need is documented. Section P remains open. No tests or emulator checks were run because this is a proposal-only file.

## Root integration outcome

Accepted the hold on 2026-10-13. No active reference, form, or research-ledger record was added because the current picker would make broad `red shrimp` and `crevette rouge` queries appear species-resolved. The bundle has no shrimp-related recipe demand. See the [integration record](../batches/wp04-section-p-argentine-red-shrimp-picker-hold-integration-20261013/README.md). No tests or emulator checks were run for this documentation-only decision.
