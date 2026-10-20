# WP02 A6 round 14: Kambu aliases for pearl millet — 2026-10-13

## Review record

- **Reviewed and sources accessed:** 2026-10-13.
- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, batch, or generated file changed.
- **Selected open gap:** Reconsider the previously held Tamil regional name **Kambu** for the existing pearl-millet grain and plain pearl-millet-flour identities.
- **Plan state:** The broad WP02 A6 review remains open. The live plan does not allocate Kambu to either target row.
- **Non-overlap:** Round 11 integrated **Sajjalu** and **Sajjalu flour**, which are separate Telugu names. This packet addresses Tamil **Kambu** and the exact qualified phrase **Kambu flour** only. It does not reopen those aliases or the held sprouted-pearl-millet-flour identity.
- **Recommendation:** Add two English search aliases to existing rows: **kambu** on pearl-millet grain and **kambu flour** on pearl-millet flour. Add no new identity, form, French alias, measurement, conversion, yield, substitution, or recipe link.

## Why the earlier hold is reconsidered

The 2026-10-10 WP03 pearl-millet boundary review held Kambu because the sources it reviewed established Bajra but did not establish the exact Kambu spelling for either existing row. That evidence gap has changed.

The current ICAR–Indian Institute of Millets Research (IIMR) common-name table maps **Tamil: Kambu** to **English: Pearl Millet**. Its footer says it was updated on 2026-07-07 [reused IIMR source]. A current Scarborough, Ontario grocery listing separately titles a retail product **Kambu Pearl Millet 1 Kg** [S01]. For flour, the current Shastha Canada storefront names **Pearl Millet (Kambu) Flour** in the ingredients of a multi-millet noodle product [S02]. Together these sources establish a narrow grain-name mapping and a qualified flour phrase on the already verified pearl-millet identities.

This is a source-backed reconsideration of the prior hold, not a new millet identity. The official table supplies the regional grain crosswalk; Canadian-facing product listings confirm that Kambu appears in Canadian-market grain/flour wording. Neither source proves Canadian cultivation, a Canadian manufacturing origin, a standardized flour grade, or Québec use of the word Kambu.

The prior round-11 Sajjalu review used the same Kalagura Gampa product page, whose multilingual-name field also prints the Tamil transliteration **Kambu Mavu**. Round 11 did not adjudicate that separate spelling. This proposal does not add **kambu mavu**, **kambu maavu**, or other transliterations: the exact aliases here are limited to the IIMR crosswalk and the Canadian-facing product wording **Kambu Pearl Millet** and **Pearl Millet (Kambu) Flour**. The existing Kalagura source ID is noted below; it must not be duplicated.

## Recommended catalog delta and identity boundary

The live rows are:

| Existing ID | Current display | Current English aliases | Current French aliases | Category |
|---|---|---|---|---|
| ingredient-ref-pearl-millet | pearl millet / millet perlé | bajra, bajri, sajjalu | none | GRAIN_AND_CEREAL |
| ingredient-ref-pearl-millet-flour | pearl millet flour / farine de mil chandelle | bajra flour, bajri flour, sajjalu flour | farine de millet perlé | FLOUR_AND_STARCH |

Proposed fields:

| Existing ID | Add to aliasesEn | Preserve |
|---|---|---|
| ingredient-ref-pearl-millet | kambu | Existing display, aliases, empty aliasesFr, category, null defaultDensity, empty unitMappings |
| ingredient-ref-pearl-millet-flour | kambu flour | Existing display, aliases, farine de millet perlé, category, null defaultDensity, empty unitMappings |

Keep the grain and flour as separate identities. Do not add bare **kambu** to the flour row, **kambu flour** to the grain row, or either term to generic millet, finger millet, foxtail millet, sprouted pearl-millet flour, or a prepared millet product. The Shastha source is a multi-millet noodle ingredient statement; it identifies pearl-millet flour with Kambu but does not establish the component amount or a noodle identity for this catalog.

Add no French alias. OQLF supplies the Québec French terminology for pearl millet, and the existing flour sources support the current French display and alias. The reviewed Québec sources do not establish **kambu**, **farine de kambu**, or a different Kambu-based French product name. Retain **millet perlé / pearl millet**, **farine de mil chandelle / pearl millet flour**, and the accepted **farine de millet perlé** alias exactly as they are.

Do not activate **sprouted kambu flour**, **kambu atta**, **kambu mavu**, **kambu maavu**, **kambu podi**, **kambu powder**, **kambu rice**, **kambu arisi**, or **kambam** in this pass. The Canada-facing NavaFresh listing that includes Kambu in a pearl-millet-flour title explicitly qualifies that product as sprouted; it is not evidence for merging sprouted flour into the plain-flour row. The spellings and preparation variants not proposed here remain unassigned.

## Source quality and evidence limits

- **Authoritative regional-name evidence:** IIMR’s current common-name table is a direct institutional crosswalk for Tamil Kambu to Pearl Millet. It does not define a flour, household measure, Canadian label, or French name.
- **Canadian grain wording:** FreshOnTheGo Grocery’s live millets page lists Kambu Pearl Millet 1 Kg for $4.00 and shows an add-to-cart control. The same page gives the retailer’s Scarborough, Ontario address. This supports a Canadian retail name; its product card does not identify the crop’s origin or establish a botanical standard. Stock can change.
- **Canadian-facing flour wording:** Shastha Canada’s product page currently shows prices in CAD and an add-to-cart control. Its ingredient declaration explicitly says “Pearl Millet (Kambu) Flour” in a 175 g multi-millet noodle product. This is direct name evidence for a flour ingredient, not a standalone flour package or Canadian manufacturing claim. The total 175 g is for noodles containing several ingredients; no Kambu-flour amount is given.
- **Québec French:** The existing OQLF source, WP03-S18, identifies Québec terms for the pearl-millet grain. Its entry was last updated in 2010, so it is authoritative terminology but not a recent product-label survey. The current French-facing Canadian product wording for pearl-millet flour was reviewed in the integrated round-13 alias packet and is already recorded on the flour row. These sources support retaining the current French names; they do not support translating Kambu into French.
- **Supplementary reseller evidence:** A current Canada-facing Silkrute marketplace listing includes Kambu among the “other names” in a pearl-millet-flour product title, but the direct page returned an access error and the available listing snapshot is several months old. It is not needed for the recommendation and is not proposed as a new ledger source.
- **No quantitative claim:** The sources establish naming only. Retail package sizes and prepared-food weights are not recipe amounts or conversion evidence.

## Exact key ownership and picker projection

The live ownership audit checked normalized reference IDs, English/French names and aliases, form IDs/labels/match terms, legacy-import candidate IDs/names/aliases, and ledger record IDs. Normalization follows IngredientSearch.kt: lowercase, NFKD/compatibility folding, combining-mark removal, punctuation-to-space conversion, and whitespace collapse.

| Candidate normalized key | Current exact owner | Proposal |
|---|---|---|
| kambu | None | Add to ingredient-ref-pearl-millet only |
| kambu flour | None | Add to ingredient-ref-pearl-millet-flour only |
| kambu mavu; kambu maavu; kambu podi | None | Leave unassigned |
| kambu atta; kambu powder; kambu rice; kambu arisi; kambam | None | Leave unassigned |
| sajje | None | Leave unassigned; it is not Kambu |
| pearl millet | ingredient-ref-pearl-millet | Retain |
| pearl millet flour | ingredient-ref-pearl-millet-flour | Retain |
| bajra; bajri; sajjalu | ingredient-ref-pearl-millet | Retain |
| bajra flour; bajri flour; sajjalu flour | ingredient-ref-pearl-millet-flour | Retain |

There is no active Kambu alias or pearl-millet form competing for these exact keys. No new ingredient, form, ledger record, or legacy candidate ID is proposed.

Static projection through the current complete-phrase-first picker logic, using only the two proposed aliases:

| Query | Projected result | Meaning |
|---|---|---|
| kambu | ingredient-ref-pearl-millet and ingredient-ref-pearl-millet-flour | Intentional grain/flour choice: the exact grain alias and the longer “kambu flour” phrase both match. |
| kambu flour | ingredient-ref-pearl-millet-flour only | The full qualifier resolves to flour. |
| kambu mavu | No result | Transliteration held outside this decision. |
| kambu atta | No result | Not established by the reviewed plain-flour evidence. |
| pearl millet | ingredient-ref-pearl-millet and ingredient-ref-pearl-millet-flour | Existing grain/flour behavior remains unchanged. |
| pearl millet flour | ingredient-ref-pearl-millet-flour only | Existing qualified behavior remains unchanged. |
| bajra; bajri; sajjalu | Grain and flour rows | Existing broad regional-name behavior remains unchanged. |
| farine de millet perlé | ingredient-ref-pearl-millet-flour only | Existing Québec-facing alias remains unchanged. |

This is a static projection from current search terms, not a runtime picker test.

## Bundled recipe demand

The current manifest lists **114 recipe files** with **1,123 ingredient rows**. I scanned all serialized recipe strings and ingredient-row fields for Kambu and its qualified/held variants, the current pearl-millet names and aliases, Tamil-script variants, and both target reference IDs. Results:

- Recipe files with a candidate phrase or target ID: **0 of 114**.
- Ingredient rows with a candidate phrase or target ID: **0 of 1,123**.
- Direct ingredient links to either target ID: **0**.

No recipe link, relink, recipe edit, or inferred demand is proposed. The fingerprint for the manifest-ordered recipe corpus remains **7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c** (114 files, 1,123 rows, 753,792 bytes).

## Measures, forms, and substitution implications

The grain ledger record remains identity-verified with measurement and substitution research **not_yet_researched**; it has no observations or findings. The flour row remains **researched_supported** for measurement and **blocked_pending_evidence** for substitution, with one existing study-specific bulk-density observation and one formula-specific wheat-bread finding. This alias review does not revise those records.

Keep both rows’ active default density null and unit mappings empty. Add no household measure, package conversion, cooking yield, form, or substitution rule. The 1 kg FreshOnTheGo grain listing is retail package mass. Shastha’s 175 g is the total weight of a multi-millet noodle product, not a measure of Kambu flour. Neither source specifies a transferable amount. The existing pearl-millet-flour bulk-density study remains a laboratory observation for its tested sample and protocol, not a household conversion; the existing wheat-bread study remains formula-specific, not a general substitute ratio.

## Source and ID collision audit

The live snapshot contains 1,343 active references, 98 forms, 64 legacy-import candidates, 1,655 ledger records, 6,390 source entries, and 5,357 distinct source IDs. The exact proposed source IDs below were absent from the ledger and current proposal/batch archive before drafting.

| Proposal-local source ID | Source | Intended support |
|---|---|---|
| **WP02-A6-KAMBU-PEARL-MILLET-20261013-R14-S01** | FreshOnTheGo Grocery, [Millets category](https://www.freshonthegogrocery.ca/categories/millets/10705000000251589), accessed 2026-10-13. Product card “Kambu Pearl Millet 1 Kg”; Scarborough, Ontario contact details. | Current Canadian retail wording for the grain alias. No crop-origin or measurement claim. |
| **WP02-A6-KAMBU-PEARL-MILLET-20261013-R14-S02** | Shastha Canada, [Shastha Multi Millet Noodles 175g](https://shasthacanada.com/products/shastha-multi-millet-noodles-175gms), accessed 2026-10-13. Product ingredient statement and current CAD listing. | Exact “Pearl Millet (Kambu) Flour” wording for the flour alias. No component amount or standalone-flour measure. |

Existing source IDs to reuse, not duplicate:

- **WP02-A6-KANGNI-FOXTAIL-FLOUR-ALIAS-20261013-S01** is the same IIMR common-name page, already registered on the foxtail-millet grain and flour rows. If attaching this evidence to the pearl-millet grain ledger record, reuse the existing ID and update its locator/supports to include the Pearl Millet row, Tamil Kambu, and the page’s 2026-07-07 update date. Do not treat it as a flour specification.
- **WP02-A6-SAJJALU-PEARL-MILLET-20261013-R11-S02** is the Kalagura Gampa page already registered on the pearl-millet-flour row. Its multilingual field includes Tamil “Kambu Mavu”; if root records that documentary lead, reuse this ID and extend its locator/supports rather than registering the URL twice. This proposal does not add Kambu Mavu as an alias.
- **WP03-S18** and **WP02-A6-PEARL-MILLET-FR-ALIAS-20261012-S01–S04** are existing OQLF / French wording sources; retain their current support for the French names.
- **WP02-S34** remains the existing Codex source for the pearl-millet-flour identity and French display.
- **WP02-A6-SPROUTED-PEARL-MILLET-FLOUR-20261012-S02** remains the source for the Canada-facing sprouted product; keep that process-qualified candidate separate.

No source ID, target ingredient ID, form ID, recipe link, observation ID, or finding ID is proposed beyond these two proposal-local source IDs. Exact source-ID checks found no collision for the two IDs.

## Root integration instructions

1. Append **kambu** to aliasesEn on ingredient-ref-pearl-millet and **kambu flour** to aliasesEn on ingredient-ref-pearl-millet-flour. Preserve existing aliases and exact reference IDs.
2. Keep the existing bilingual displays, French alias, categories, null active densities, and empty unit mappings. Do not add any Kambu French spelling or transliteration in this pass.
3. Register S01 on the pearl-millet grain ledger record and S02 on the pearl-millet-flour record. Reuse the existing IIMR and Kalagura source IDs where applicable; do not duplicate either URL under a new ID.
4. Preserve the projected search behavior: **kambu** returns grain and flour choices; **kambu flour** returns flour only.
5. Leave forms, recipes, measurements, substitutions, and the held sprouted-flour boundary unchanged. The broader WP02 A6 review remains open.

This proposal changes no shared database files. No app or emulator tests were run. Under the updated AGENTS.md rule, a later integration that only adds database JSON data requires no tests.

## Root integration status

**Integrated.** Added `kambu` and `kambu flour` to the existing pearl-millet grain and flour rows, registered the two new Canadian-market source IDs, and reused the existing IIMR source ID for the Tamil grain-name crosswalk. The review remains open for other A6 gaps.
