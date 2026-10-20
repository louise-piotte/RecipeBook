# WP03 Section K — *Cucurbita moschata* leaves identity review (R967)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic leafy-vegetable reference for the leaves of *Cucurbita moschata* Duchesne.
- **Scope:** Generic culinary ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.
- **Plan anchor:** Section K's wider leafy-green and brassica sweep remains open ([catalog plan, line 6553](../../RecipeBook-global-ingredient-catalog-plan.txt#L6553)).
- **Mutation scope:** Proposal only. No catalog, ledger, recipe, checklist, workflow, or roadmap file is changed.

## Recommendation and identity boundary

Add **ingredient-ref-cucurbita-moschata-leaves** for culinary leaves of correctly identified, food-grown *Cucurbita moschata*. FAO's EcoCrop record names *C. moschata* and lists leaves as a food-use part. FAO's *Compendium of Forgotten Foods* profile identifies pumpkin as *C. moschata* and states that its leaves are used as a vegetable. The species-specific PROTA account describes it as a leaf vegetable and reports cooked leaf use. [S01–S03]

Use **musk pumpkin leaves / feuilles de courge musquée** as the displays, with empty alias arrays. PROTA gives “musk pumpkin” and “courge musquée” as species names; the OQLF's preferred French term “courge musquée” is directly tied to *C. moschata*. The compound leaf wording is a descriptive plant-part label, not a separate OQLF ruling. Do not add unqualified “pumpkin leaves”, “squash leaves”, “feuilles de citrouille”, botanical names, or “feuilles de courge” as aliases: those phrases can cover other plants or parts, and existing source wording uses some of them for different identities.

The identity covers leaves only. It does not add young shoots, stems, tendrils, flowers, fruit, seeds, or derived seed products. Keep it separate from leaves of *C. maxima*, *C. pepo*, and *Telfairia occidentalis*. In particular, the latter is the existing Ugu leaf identity; [R487's boundary review](wp06-african-next-regional-review-r487-20261017.md) documents why the unqualified phrase “pumpkin leaves” must not be transferred to Ugu. [S03, existing source ownership WP05-WEST-AFRICA-VERNONIA-20261012-S01]

## Proposed minimal data

| Field | Proposed value |
|---|---|
| id | ingredient-ref-cucurbita-moschata-leaves |
| nameEn | musk pumpkin leaves |
| nameFr | feuilles de courge musquée |
| aliasesEn / aliasesFr | [] / [] |
| defaultDensity | null |
| unitMappings | [] |
| category | VEGETABLE_AND_AROMATIC |
| updatedAt | 2026-10-19T00:00:00Z |

No form, measurement observation, conversion, yield, recipe link, or active substitution is proposed.

## Ownership, neighboring identities, and queue scope

The refreshed package after R963–R965 contains **1,984 active references**, **205 forms**, **2,389 research-ledger records**, and **55 legacy candidates**. The ledger has **11,223 source entries** and **9,416 distinct source IDs**. Accent-folded phrase scans of active reference IDs, displays and aliases; form IDs, labels and match terms; legacy candidates; and ledger record/source/decision text found no exact owner for *C. moschata* leaves, the proposed reference ID, “musk pumpkin leaves”, “feuilles de courge musquée”, or the other reviewed species-qualified leaf phrases. No form or legacy candidate owns this leaf part. The proposed R967 source-ID prefix is unused.

The phrase “pumpkin leaves” does occur in the ledger, but only on the distinct Ugu record's source-scoped evidence and decision text. The proposal and integration README archive search found two files: [the R487 Ugu boundary review](wp06-african-next-regional-review-r487-20261017.md) and [its batch README](../batches/wp03-wp04-wp06-r485-r487-gap-review-integration-20261017/README.md). They keep ordinary *Cucurbita* leaves distinct from *Telfairia occidentalis* and do not propose or own a *C. moschata* leaf identity. A full-text search across **3,591 proposal and batch Markdown files** found no focused prior proposal for this species-part identity.

| Existing row or source | Boundary to preserve |
|---|---|
| ingredient-ref-pumpkin — pumpkin / citrouille | Preserve the existing fruit identity. It does not own leaves. |
| ingredient-ref-butternut-squash — butternut squash / courge butternut | Preserve the fruit/cultivar row and its OQLF source WP03-TC-20261009-S14. Butternut is a variety of *C. moschata*; this review does not transfer the fruit row's evidence or turn the new leaf identity into a butternut-only cultivar. |
| ingredient-ref-ugu-leaves — *Telfairia occidentalis* | Keep Ugu leaves distinct. The “pumpkin leaves” and “feuilles de citrouille flûtée” ledger hits concern Ugu source wording, not ordinary *Cucurbita* leaves. Do not transfer Ugu evidence, aliases, or claims. |
| ingredient-ref-squash-blossoms and pumpkin-seed references | Preserve the separate flower and seed identities. They are different plant parts and do not supply leaf evidence. |
| [R487's ordinary pumpkin/squash-leaf boundary](wp06-african-next-regional-review-r487-20261017.md) | R487 left ordinary *Cucurbita* leaves unassigned and excluded broad “pumpkin leaves” from its *Telfairia* row. This review resolves only *C. moschata* leaves; it does not settle all *Cucurbita* species or unqualified market phrases. |

The open Section K sweep concerns generic leafy-green, brassica, shoot, and plant-part diversity. No roster-only Section K assignment was encountered. If a queued brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only item appears elsewhere in the catalog queue, mark it out of scope because **commercial-product counts do not add ingredient diversity**, and stop that line. Existing branded entries and product-specific evidence remain unchanged.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were parsed and searched for *C. moschata* leaf phrases and botanical spelling variants; “pumpkin leaves”, “pumpkin leaf”, “pumpkin greens”, “squash leaves”, “squash greens”, “musk pumpkin leaves”, and the reviewed French part phrases. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe amount, recipe link, or relink is proposed. The external food-use sources support identity, not bundled-library demand.

## Measurement review and proposed ledger state

If accepted, create one ingredient_reference ledger record keyed to **ingredient-ref-cucurbita-moschata-leaves** with:

- identityState: verified;
- measurementState: blocked_pending_evidence;
- substitutionResearchState: blocked_pending_evidence;
- sources S01–S07 below, with their exact locator limits;
- no measurementObservations, default density, unit mapping, or package-yield value.

The measurement state is blocked because no measure found is specific to *C. moschata*. USDA Standard Reference Release 28 gives one cup as 39 g for raw pumpkin leaves (NDB 11418), whose item label lists no taxon, and one cup as 71 g for cooked, boiled, drained pumpkin leaves without salt (NDB 11419), which the USDA entry identifies only as *Cucurbita spp.* at genus level. Neither record identifies *C. moschata* or a leaf selection/packing method, so keep both measures attached to their exact USDA food entries. The FAO Pacific Islands tables provide per-100-g composition entries for raw C048 and boiled C025 pumpkin leaves; the accompanying food-code list identifies both as *Cucurbita pepo* (S07), not *C. moschata*. These are nutrient-composition values, not kitchen measures, and stay attached to the FAO foods. None of these sources supports transferring a volume-to-mass value or nutritional claim to *C. moschata* leaves. PROTA's 100-g leaf composition is a source-specific composition basis, not a recipe portion, density, or conversion. Do not add the cup observations to the species-specific ledger record or activate a mapping. [S03, S05–S07]

No current Health Canada portion or food-code measurement tied to *C. moschata* leaves was confirmed in this review. This is not a claim that no such row exists in the full downloadable 2026 CNF; no candidate-specific CNF observation is proposed.

Proposed ledger observation state: **none**. If later evidence identifies the taxon and preparation basis behind a published cup measure, review that evidence separately before linking it. Keep external nutrient values with their original food entry and source.

## Bounded substitution and handling review

Section 08 searches on 2026-10-19 included “Cucurbita moschata leaves substitute recipe ratio”, “pumpkin leaves substitute recipe”, and “pumpkin leaves spinach substitute”. PROTA says *C. moschata* leaf use can be substituted with *C. maxima* leaves and notes that the latter's coarser texture changes with cooking. This is a broad use-level statement: it names no dish role, recipe, leaf form, ratio, or adjustment. General pumpkin-leaf substitute lists found in search were not species-qualified and are not transferred. [S03]

If the finding is recorded, use findingId **cucurbita-maxima-leaves-for-c-moschata-r967-20261019**, researchState **blocked_pending_evidence**, and fromIngredientRefId **ingredient-ref-cucurbita-moschata-leaves**. Set context to PROTA's broad *C. moschata* leaf-use claim; set basis to the source's statement that *C. maxima* leaves can be used in its place, with a cooking-related texture note; and set sourceIds to S03. Limitations should state that the source lacks a dish role, preparation-state match, ratio, and adjustment evidence, and that no corresponding *C. maxima* leaf reference is proposed here. Add no replacements, runtime rule, recipe-line link, or recipe-specific claim.

For plant-part handling, PROTA describes a regional preparation that removes main veins and tendrils, slices the leaves, and cooks them; treat this as a source-specific culinary example, not an instruction for all leaves. The same entry says distinguishing *C. moschata* from related *C. pepo* and *C. maxima* can be difficult and gives diagnostic morphology. Do not convert that text into a wild-plant identification guide or foraging guarantee. PROTA also gives a broad cucurbitacin/bitter-taste caution; it supplies no species-specific detection protocol, safe threshold, or general consumer instruction. Keep that claim attached to its source and do not infer a handling rule. [S03]

## Sources and source-ID ownership

The links below were opened 2026-10-19. IDs are proposal-local and have not been added to the shared ledger.

| ID | Source and ownership | Evidence scope and limits |
|---|---|---|
| WP03-K-C-MOSCHATA-LEAVES-R967-20261019-S01 | FAO EcoCrop, [Cucurbita moschata data sheet](https://ecocrop.apps.fao.org/ecocrop/srv/en/dataSheet?id=820); source URL has no current ledger owner. | Lists *C. moschata* leaves in the food-use table. Supports the species/part boundary, not a particular recipe, handling method, Québec availability, or measure. |
| WP03-K-C-MOSCHATA-LEAVES-R967-20261019-S02 | FAO, [Compendium of Forgotten Foods](https://openknowledge.fao.org/3/cc5044en/cc5044en.pdf), Pumpkin profile naming *C. moschata*; source URL is already owned by ingredient-ref-vernonia-amygdalina-leaves as WP05-WEST-AFRICA-VERNONIA-20261012-S01, for the separate bitter-leaf entry. | The pumpkin profile says leaves are used as a vegetable and dried for future use. If integrated, give this separate profile claim its own source ID and locator; do not edit, transfer, or broaden the existing Vernonia source record. Regional compendium evidence does not establish current Québec use. |
| WP03-K-C-MOSCHATA-LEAVES-R967-20261019-S03 | Plant Resources of Tropical Africa / Pl@ntUse, [Cucurbita moschata](https://plantuse.plantnet.org/en/Cucurbita_moschata_%28PROTA%29); no current ledger owner for this URL. | Gives English “musk pumpkin” and French “courge musquée”; describes the species as a leaf vegetable, regional cooking, a broad *C. maxima* leaf replacement statement, a source-specific composition basis, and botanical-identification limits. These are not Québec-market claims, universal preparation instructions, or transferable safety thresholds. |
| WP03-K-C-MOSCHATA-LEAVES-R967-20261019-S04 | Office québécois de la langue française, [courge musquée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26520008/courge-musquee); no current ledger owner for this specific URL. | Gives preferred French “courge musquée”, English equivalents including “musky pumpkin”, and *C. moschata*. It supports the Québec-facing species name, not a standardized leaf-part term. The separate OQLF “courge butternut” URL remains owned by the butternut fruit row. |
| WP03-K-C-MOSCHATA-LEAVES-R967-20261019-S05 | FAO, [Pacific Islands Food Composition Tables, second edition](https://www.fao.org/4/y5432e/y5432e08.htm); source URL has no current ledger owner. | Provides per-100-g raw C048 and boiled C025 “pumpkin, leaves” composition entries. The entries' botanical scope is supplied by the accompanying food-code list (S07); no nutrient values transfer to *C. moschata* or become a kitchen measure. |
| WP03-K-C-MOSCHATA-LEAVES-R967-20261019-S06 | USDA, [Standard Reference Release 28, NDB 11418 and 11419](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf); this PDF URL is already used for other ledger food-code locators, but the exact 11418/11419 leaf locators have no current owner. | Reports 1 cup = 39 g for raw pumpkin leaves (NDB 11418; item label lists no taxon) and 1 cup = 71 g for cooked, boiled, drained pumpkin leaves without salt (NDB 11419; the USDA item lists *Cucurbita spp.* only, at genus level; see lines 417669–417673). Neither identifies *C. moschata*. Keep both figures tied to the exact USDA records; if integrated, use a new source ID and exact NDB locators without changing any other USDA source entry. |
| WP03-K-C-MOSCHATA-LEAVES-R967-20261019-S07 | FAO, [Pacific Islands Food Composition Tables, second edition, food-code list](https://www.fao.org/4/y5432e/y5432e0s.htm); this URL has no current ledger owner. | Identifies C048 (raw pumpkin leaves) and C025 (boiled pumpkin leaves) as *Cucurbita pepo*. This scopes the corresponding S05 composition entries to the listed species only; it does not support transfer to *C. moschata*, or supply a kitchen measure or conversion. |

The proposed R967 source-ID prefix is absent from the live ledger. The OQLF “courge butternut” source and the shared FAO Compendium/USDA URLs have existing owners at other claims or locators; preserve those owners and add no duplicate or transferred evidence beyond the separately scoped source entries described above. Both FAO Pacific Islands URLs have no current ledger owner; keep S05 composition evidence distinct from S07 taxonomic identification evidence.

## Link, encoding, and whitespace checks

- The relative catalog-plan, R487 proposal, and R487 batch README links resolve to their local files.
- The FAO EcoCrop, FAO Compendium, PROTA, OQLF, FAO Pacific table and food-code list, and USDA URLs were opened and resolved during this review.
- This proposal was saved as UTF-8 without BOM, with a final newline and no trailing whitespace. No software tests were run because this is proposal-only work.

## Disposition

Recommend one VEGETABLE_AND_AROMATIC identity, **musk pumpkin leaves / feuilles de courge musquée**, scoped to leaves of *Cucurbita moschata*. Keep aliases empty and preserve all current fruit, seed, flower, Ugu, and branded rows. If integrated, retain measurement state blocked_pending_evidence because the external cup measures are not identified as *C. moschata*, and retain the bounded *C. maxima* substitute finding as blocked_pending_evidence; add no numeric behavior, form, recipe link, or runtime substitution. Section K's broader plant-part sweep remains open.
