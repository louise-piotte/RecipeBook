# WP02 A7 R36: malted sorghum flour boundary review — 2026-10-13

- **Status:** Reviewed; unresolved candidate integrated into the research ledger, plan, roadmap, and batch README. No active catalog, recipe, generated, or code file changed.
- **Scope:** The distinct candidate phrase **malted sorghum flour**. This review does not reopen the R26 toasted-white-sorghum-flour hold, the A6 `mabele`/`amabele` meal-and-flour hold, the integrated plain sorghum flour identity, or any prior R32–R35 candidate.
- **Evidence source IDs:** `WP02-A7-MALTED-SORGHUM-FLOUR-20261013-R36-S01` through `S06`; these sources are now linked from the shared candidate ledger record.

## Disposition

**Hold; do not add an active reference, alias, or form.** Tanzania's current compulsory standards list contains a separate **Malted sorghum flour — Specification** entry (TZS 4019:2025), so the English product phrase is source-attested and distinct enough to retain for research. That national standard does not establish a Canadian/Québec product or a Québec French display. The only Canada-facing bilingual phrase located came from an unavailable third-party marketplace listing whose title calls the product *Akanoza Fermented Sorghum Flour* while the displayed package image says *Malted Sorghum Flour / Farine de Sorgho Malté*. An official Rwanda product register independently calls an Akanozo item *Fermented Sorghum Flour*. These sources do not establish that the malted and fermented names identify the same process or SKU.

The shared ledger records this hold as the unallocated candidate `candidate-malted-sorghum-flour`. Do not allocate `ingredient-ref-malted-sorghum-flour` yet. A future active row would provisionally belong in `FLOUR_AND_STARCH`, but its Québec French display, product scope, and relationship to plain sorghum flour need confirmation first.

## Exact ownership and picker implications

| Search phrase or neighbor | Current owner | Boundary |
| --- | --- | --- |
| `malted sorghum flour`, `malt sorghum flour`, `sorghum malt flour`, `farine de sorgho malté(e)`, `fermented sorghum flour`, `Ifu y'Amamera` | Before R36, no exact active reference, alias, form, legacy-import identity, proposal, or ledger candidate owned these phrases. The R36 ledger record now preserves them as an unresolved candidate only. | The source-named R26 `candidate-toasted-white-sorghum-flour` is a separate toasted industrial semifinished product. The A6 `mabele` hold concerns a meal/flour boundary and does not own malted-sorghum wording. Neither is a synonym or process equivalent. |
| `sorghum flour` / `farine de sorgho` | `ingredient-ref-sorghum-flour`, category `FLOUR_AND_STARCH`; aliases `jowar flour`, `jowar atta`, and `guinea corn flour`; density `null`, unit mappings empty. | Retain the active plain sorghum-flour identity as-is. Do not put malted wording on it. |
| `sorghum grits` / `gruau de sorgho`; `sorghum semolina` / `semoule de sorgho`; `grain sorghum` / `sorgho à graine`; `puffed sorghum` / `sorgho soufflé` | Existing distinct active references. | These rows do not establish a meal, malt, or malted-flour alias. |
| Sorghum ingredient forms | No form attached to any sorghum reference. | The current sources do not establish malted sorghum flour as a same-ingredient form with reusable form behavior under plain sorghum flour. |

`docs/catalog/legacy-import-identities.v1.json` contains no sorghum entry or candidate. Before R36 integration, the ledger had the separate R26 toasted-white-sorghum candidate but no malted-sorghum-flour candidate. The active references, forms, and legacy-import list have no exact owner for the candidate phrases; the new ledger record preserves the unresolved source evidence without assigning an active identity.

The current picker is phrase-first, then falls back to substring matching (`IngredientSearch.kt`). From the current active terms, the exact query `malted sorghum flour` or `farine de sorgho malté` would return no row: neither the full phrase nor a containing search term exists. `sorghum flour` and `farine de sorgho` resolve to the plain flour row. A shorter `sorghum` query can match multiple qualified sorghum references, so it should not be used to imply that malted flour is plain sorghum flour. These are source-code-derived search implications, not live UI checks.

## Recipe-demand audit

I scanned all **114** manifest-listed recipe files and **1,123** ingredient rows. The row fields `originalText`, `ingredientName`, `preparation`, and `notes` were checked for `malted sorghum flour`, `sorghum malt flour`, `malted sorghum`, `malt sorghum flour`, `farine de sorgho malté(e)`, `fermented sorghum flour`, and `Ifu y'Amamera`. **There were zero matching rows in zero recipes.** No recipe link or relink is proposed.

## Name and product boundary

The official TBS list gives the exact English name **Malted sorghum flour** for a 2025 product specification and lists it as compulsory in Tanzania [S01–S02]. This establishes a named product class in that jurisdiction; it does not establish a Canadian standard or a Québec retail label. A peer-reviewed laboratory study describes one process in which sorghum grain is steeped, germinated, dried, then milled into malted sorghum flour [S03]. It establishes a particular experimental product/process, not one universal definition for every manufacturer.

The active plain row uses **sorghum flour / farine de sorgho**. Codex supports the base French product wording for ordinary sorghum flour; that source does not provide a Québec-specific malted equivalent [S04]. The OQLF/Canadian product evidence already attached to the plain sorghum row should not be extended to the malting qualifier. The phrase `Farine de Sorgho Malté` appears only in a third-party listing's package image, while the listing title identifies the food as fermented and the item is now unavailable [S05]. The official Rwanda FDA register names the listed Akanozo SKU **Akanozo Fermented Sorghum Flour**, with a 1 kg package and a registration expiry of 2025-06-26 [S06]. The register is historical and does not show that the listing image and registered SKU are identical; together they expose a naming/process ambiguity rather than resolve it.

Do not adopt `farine de sorgho malté`, `farine de sorgho maltée`, `sorghum malt flour`, `sorghum malt`, `Ifu y'Amamera`, or `fermented sorghum flour` as aliases on the plain sorghum flour or generic malt-flour rows. Do not merge this candidate with malted barley, wheat, rye, spelt, oat, maize, buckwheat, or finger-millet flour based on shared malting language.

## Measurement and substitution limits

- Do not add a default density, cup-to-mass mapping, measure, yield, or conversion. The TBS source is a product-standard listing; its title supplies no household quantity. The peer-reviewed study reports laboratory sample properties, not a transferable kitchen volume-to-mass measure [S01–S03].
- A retailer's 1 kg package size is package mass only; it is not a recipe measure. The historical Rwanda register is not a current package specification [S05–S06].
- Do not infer a substitution ratio or functional replacement for plain sorghum flour, wheat flour, vital wheat gluten, or generic malt flour. A research formulation or composite-flour experiment does not establish a general recipe substitution or a scoped app rule [S03].

## Source register

Sources were checked on 2026-10-13. Source IDs were added to the shared ledger record
`candidate-malted-sorghum-flour` with their specific support and limits.

| Source ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **S01** | Tanzania Bureau of Standards, [List of Compulsory Tanzania Standards](https://www.tbs.go.tz/uploads/files/LIST%20OF%20COMPULSORY%20TANZANIA%20STANDARD.pdf), food standards entry 1764. | Lists TZS 4019:2025, **Malted sorghum flour — Specification**. | A Tanzania standards listing; the public list does not provide the specification's full requirements or establish Canadian/Québec terminology. |
| **S02** | United Republic of Tanzania, Government Notice 641 of 2025, [notice PDF](https://www.tbs.go.tz/uploads/publications/en-1768909304-GOVERMRNT%20NOTICE%20GN%20641.pdf), food/agriculture table, row 52. | Lists TZS 4019:2025 as **Malted sorghum flour — Specification**, category **Compulsory**. | Confirms the national standard title and status only; no French display or household measurements. |
| **S03** | Ojha et al., [“Malting and fermentation effects on antinutritional components and functional characteristics of sorghum flour”](https://pmc.ncbi.nlm.nih.gov/articles/PMC5778236/), *Food Science & Nutrition* (2018), Methods §2.2 and Results §3.3.1. | Describes one lab process for malted sorghum flour: grain steeping, germination, drying, and milling; treats fermented flour as a separate preparation. | Experimental samples and methods do not define every commercial product. Reported physicochemical/bulk-density data are not a kitchen measure or transferable default. |
| **S04** | FAO/WHO Codex Alimentarius, [Codex Standard for Sorghum Flour CXS 173-1989](https://www.fao.org/input/download/standards/58/CXS_173f.pdf), French title and scope. | Supports `farine de sorgho` as the base French name associated with the generic sorghum-flour standard. | Does not supply a Québec-preferred name for malted sorghum flour; it is not used to infer that malted flour meets the ordinary-flour specification. |
| **S05** | Etsy Canada, [Akanoza Fermented Sorghum Flour / Ifu Y'umusururu, listing 1619415064](https://www.etsy.com/listing/1619415064/akanoza-fermented-sorghum-flour-1kg-ifu), indexed product title and package-image text. | The listing title says fermented sorghum flour; indexed package-image text reads “Malted Sorghum Flour” and “Farine de Sorgho Malté.” | Third-party marketplace information, not manufacturer or Québec terminology authority; the live item is unavailable. The conflicting terms are evidence of uncertainty, not a confirmed bilingual product name or product equivalence. |
| **S06** | Rwanda Food and Drugs Authority, [Food Products Register, 22 July 2025](https://rwandafda.gov.rw/wp-content/uploads/2025/07/Food-Products-Register_22.07.2025.pdf), product registration `Rwanda FDA-FP-MA-0111`. | Lists **Akanozo Fermented Sorghum Flour**, 1 kg, registered to SINA Gerard Ese Urwibutso, with expiry 2025-06-26. | The registration had expired by the register date; it is historical product-name evidence, not proof of current availability or identity with the third-party listing. |

## Next action

Keep the candidate unallocated until a manufacturer or official current package confirms whether the named product is malted, fermented, or a specific process that combines both, and an independent Québec French review accepts a consumer-facing display. If those conditions are met, reassess whether it needs a separate `FLOUR_AND_STARCH` identity. Until then, leave active references, aliases, forms, measures, mappings, recipe links, conversions, yields, and substitutions unchanged.
