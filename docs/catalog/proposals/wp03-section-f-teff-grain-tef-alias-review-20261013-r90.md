# WP03 Section F R90 — teff grain `tef` alias review (2026-10-13)

## Review record

- **Reviewed:** 2026-10-13.
- **Scope:** The open spelling boundary for existing `ingredient-ref-teff-grain`, displayed as `teff / teff d'Abyssinie`. This is a grain terminology and search-alias review; it does not revisit the separate WP02 teff-flour identity or the R89 barley-bran review.
- **Plan location:** Section F says the OQLF-listed spelling `tef` is inactive pending Québec review and the exact `teff d'Abyssinie` display still needs review ([active grain packet, row 266](../batches/plant-grains-cereals.md#L266); [live plan, teff review note](../../RecipeBook-global-ingredient-catalog-plan.txt#L533); [original teff identity record](../batches/teff-triticale-grain-identities.md)).
- **Recommendation:** Add `tef` to `aliasesFr` on `ingredient-ref-teff-grain` as a search-only spelling variant. Retain `teff d'Abyssinie` as the French display: CFIA uses that exact French cereal name, TERMIUM lists it as correct and standardized, and a Montreal-based Yupik French product page uses `graines de teff` for whole seeds. Do not add `tef` to teff flour, and do not add redundant `teff` aliases because `teff` is already the English grain display and part of the flour display. The OQLF GDT entry is authored by CILF and describes `tef` as non-current despite calling its spelling recommended; treat it as a discoverability alias, not the display recommendation. This source review does not count as the separate human Québec sign-off requested by the packet.
- **Work boundary:** This file records the agent's proposal. Root reviewed and integrated the `tef` alias and supporting ledger evidence into shared data, updated the plan, roadmap, and batch README, and regenerated the Kotlin index. No app, Gradle, instrumentation, or emulator tests were run because the change only adds database JSON data under `AGENTS.md`.

## Terminology evidence and limits

The OQLF-hosted GDT entry has the headword **`tef`**, an agriculture/cereal-growing definition, and the English term **`teff`**. Its note says “Non courant” and “Orthographe recommandée.” The entry attributes the terminology to the Conseil international de la langue française (1974); it is not a current OQLF-preferred product-label ruling. It supports `tef` as a valid spelling for the cereal, with a clear currency caveat [WP02-S90].

TERMIUM Plus's French entry for *Eragrostis tef* lists **`tef`** as correct and lists **`teff`** and **`teff d'Abyssinie`** as correct, normalized terms; it notes that the normalized terms follow ISO standardization [R90-S01]. This federal terminology source supports the existing display and the same-grain spelling alias, but does not by itself establish Québec consumer preference.

The Canadian Food Inspection Agency's French crop list places *Eragrostis (= Poa) abyssinica / Teff d'Abyssinie* under *Céréales* [WP03-S76]. A current French Yupik product page names a whole-seed SKU **`GRAINES DE TEFF`** and lists its ingredient as *graines de teff* [R90-S02]. Yupik identifies itself as a Canadian company with Montreal facilities and gives a Montreal, Quebec address on its company pages. These sources support retaining the government-standardized display while recognizing current Québec-facing French use of `teff`.

No reviewed source establishes `tef` as the current Québec retail display, and the OQLF entry itself flags it as non-current. The proposed change therefore adds only a French search alias; it does not replace the display or claim an OQLF preference. A separate human Québec terminology sign-off remains open if required by the integration process.

## Ownership, aliases, and picker boundary

The read-only live snapshot contains **1,421 ingredient references, 104 ingredient forms, 63 legacy-import candidates, and 1,760 research-ledger records**. The bundled manifest lists **114 recipe files**.

The teff-grain row is `teff / teff d'Abyssinie`, category `GRAIN_AND_CEREAL`, with empty alias arrays, null `defaultDensity`, and empty `unitMappings`. It has no attached form. The separate flour row is `teff flour / farine de teff`, also with empty alias arrays. Exact normalized phrase checks across references, forms, and legacy candidates found no existing owner for **`tef`**. The existing exact owners are:

| Query phrase | Current exact phrase owner(s) | Proposed boundary |
| --- | --- | --- |
| `teff` | Teff grain and teff flour | Keep the two valid ingredient choices visible. |
| `teff d'Abyssinie` | Teff grain | Retain as the current French display. |
| `teff flour` / `farine de teff` | Teff flour | Keep the milling product separate. |
| `tef` | None | Add only as a French alias to teff grain. |

A read-only projection of the matching rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) shows why the alias has a useful boundary effect. The matcher first returns complete normalized word-phrase matches; only if none exist does it fall back to substring matching. Currently, `tef` falls through to partial matching and returns `lake whitefish`, `teff flour`, and teff grain; `tef` appears inside the word `whitefish`. With the proposed alias, `tef` becomes an exact phrase and selects only teff grain. `teff` still returns both grain and flour, `teff d'Abyssinie` remains grain-only, and `farine de teff` remains flour-only.

No aliases are proposed for `teff` in French (already searchable as the English grain name and in the local product label), for `teff d'Abyssinie` (already the French display), for flour names on the grain, or for generic cereal terms. No new ingredient ID or form is needed.

## Recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned, including whole-file text and direct reference IDs, for normalized `teff`, `tef`, `teff d'Abyssinie`, and teff-flour wording. The scan found **0 matching recipe files, 0 matching ingredient rows, and 0 direct links** to `ingredient-ref-teff-grain`. No recipe link, relink, or recipe edit is proposed.

## Measurements, forms, and substitutions

The active teff-grain row has no form, density, unit mapping, or package-yield record. Its ledger record is identity-verified with `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`; it has no measurement observations or substitution findings. Neither bundled substitution-rule file contains a teff rule, and the ledger has no teff-specific unit conversion.

The Yupik page prints a **SKU-specific** serving label of 1/8 cup (30 g) and describes how its seeds behave when cooked. The cup convention and applicability to other teff products are not established there. This terminology proposal does not turn that label into a general density, unit mapping, form, or cooking yield; a separate measurement review can decide whether a product-specific portion observation is warranted. A texture comparison to polenta is not a tested substitution, so no global or contextual substitution is proposed.

## Exact proposed JSON and ledger delta

**Ingredient references:** add this French search alias to the existing grain row and update its `updatedAt` to the review date:

```json
{
  "id": "ingredient-ref-teff-grain",
  "aliasesFr": ["tef"],
  "updatedAt": "2026-10-13T00:00:00Z"
}
```

Keep `nameEn: "teff"`, `nameFr: "teff d'Abyssinie"`, `aliasesEn: []`, and the teff-flour row unchanged.

**Research ledger:** append the two source entries below and one accepted alias decision to the existing `ingredient-ref-teff-grain` record. Reuse existing source IDs `WP02-S90` (OQLF GDT `tef`) and `WP03-S76` (CFIA French crop label); do not duplicate those sources. Leave the identity and measurement/substitution states unchanged, and add no measurement observation, substitution finding, or unit conversion.

```json
[
  {
    "sourceId": "WP03-TEFF-FR-QC-R90-20261013-S01",
    "url": "https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=ERAGROSTIS+TEF",
    "title": "TERMIUM Plus, Eragrostis tef",
    "accessedOn": "2026-10-13",
    "versionOrDate": "Fiche 1, 2016-03-14",
    "locator": "French entry: terms, definition, and standardization note.",
    "supports": "Lists tef as a correct French term and teff and teff d'Abyssinie as correct normalized French terms, with a note that the normalized terms follow ISO standardization. Supports a French search alias while retaining the existing standardized display; it does not establish Québec retail preference.",
    "sourceKind": "other"
  },
  {
    "sourceId": "WP03-TEFF-FR-QC-R90-20261013-S02",
    "url": "https://yupik.com/fr/teff-seeds-p20075",
    "title": "Yupik, Graines de teff, SKU P20075",
    "accessedOn": "2026-10-13",
    "locator": "French product title, ingredients, and product description.",
    "supports": "The French product page names whole seeds GRAINES DE TEFF and lists graines de teff as the ingredient, supporting current Québec-facing French use of teff for the grain. It also prints a SKU-specific 1/8 cup (30 g) serving; this review does not treat that label as a generic measure or density.",
    "sourceKind": "other"
  }
]
```

```json
{
  "outcome": "accepted",
  "reason": "Add tef as a French search alias on the existing teff-grain reference only. The OQLF-hosted GDT entry lists tef for the cereal and calls its orthography recommended while noting it is non-current; TERMIUM Plus lists tef as correct and teff / teff d'Abyssinie as correct normalized French terms. CFIA's French cereal list supports the existing display teff d'Abyssinie, and a Montreal-based company's French whole-seed product page uses graines de teff. The exact alias improves lookup without merging teff grain with teff flour: tef will select only teff grain, while teff and farine de teff retain their current boundaries. Keep the current French display pending any separate human Québec sign-off; add no tef alias to flour, no measures, forms, recipe links, conversions, yields, or substitutions.",
  "sourceIds": [
    "WP02-S90",
    "WP03-S76",
    "WP03-TEFF-FR-QC-R90-20261013-S01",
    "WP03-TEFF-FR-QC-R90-20261013-S02"
  ]
}
```

The Yupik page is a direct French product listing from a Canadian company with a Montreal address, not a terminology ruling or a universal teff specification. The CFIA crop list and older terminology records support names only; they do not establish cooking behavior or measurements.

## Source register

Sources were opened or searched online on 2026-10-13. Existing ledger source IDs are marked as reused; only the two R90 IDs above are proposed for the ledger.

| Source ID | Source and locator | Use and limits |
| --- | --- | --- |
| `WP02-S90` (reused) | OQLF-hosted [GDT, tef](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef), entry authored by Conseil international de la langue française, 1974. | Headword `tef`, cereal definition, English `teff`, and note “Non courant” / “Orthographe recommandée.” The note is not a current OQLF consumer-label preference. |
| `WP03-S76` (reused) | CFIA, [Liste de grains et grandes cultures](https://inspection.canada.ca/fr/protection-vegetaux/grains-grandes-cultures/liste-grains-grandes-cultures), Céréales; modified 2015-04-02. | Direct French crop label `Teff d'Abyssinie`; it is a crop list, not a current product label. |
| `WP03-TEFF-FR-QC-R90-20261013-S01` | TERMIUM Plus, [Eragrostis tef](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=ERAGROSTIS+TEF), French entry, fiche dated 2016-03-14. | Federal terminology evidence for `tef` as correct and `teff` / `teff d'Abyssinie` as correct normalized terms. It supports a search alias and the existing display, not specific Québec consumer preference. |
| `WP03-TEFF-FR-QC-R90-20261013-S02` | Yupik, [Graines de teff](https://yupik.com/fr/teff-seeds-p20075), SKU P20075; see [company information](https://yupik.com/en/about-us) and [Montréal contact address](https://yupik.com/contact/). | Current French product-page wording for whole seeds. The company identifies itself as Canadian and gives Montreal operations/contact details. Its serving amount is SKU-specific; the page does not establish a generic volume conversion or density. |
| `WP03-S77` (reused as background) | CFIA, [Multi-Mycotoxins in Milled Grain Products and Grain-based Foods, 2015–2018](https://inspection.canada.ca/DAM/DAM-food-aliments/STAGING/text-texte/multi-mycotoxins_in_milled_grain_products-april_1_2015_to_march_31_2018_1697482956573_eng.pdf), Table 1, teff row. | Supports Canadian food-supply separation of teff grain and flour; old survey and not a current French-name or measurement source. |

## Static review record

Actually performed for this proposal:

- Read the current `AGENTS.md`, `Requirements.md`, Section F packet/open checklist, relevant live plan entries, current roadmap through R89, the R89 barley-bran proposal/integration note, the existing teff/triticale identity packet, and the WP02 teff-flour decision.
- Recounted the current JSON snapshot directly: **1,421 references / 104 forms / 63 legacy candidates / 1,760 ledger records / 114 recipes / 1,123 ingredient rows**.
- Checked exact phrase ownership of `tef`, `teff`, `teff d'Abyssinie`, `teff flour`, and `farine de teff` across active references, forms, and legacy candidates; confirmed the grain/flour boundaries and the absence of an exact `tef` owner before this proposal.
- Reproduced the picker behavior from `IngredientSearch.kt`, including the current partial matches for `tef` and the projected exact result after adding the alias.
- Scanned every manifest-listed recipe file recursively and all structured ingredient rows for teff spellings and direct reference IDs; found no matches or links.
- Checked the current grain reference, ledger states/observations, package-yield records, ledger unit conversions, and both bundled substitution-rule files. The Yupik product page's serving label is documented as SKU-specific and is not generalized.
- Checked the proposed R90 source IDs and source URLs against the live research ledger; no prior ID or URL ownership was found.
- No tests, Gradle tasks, Android emulator runs, or deployments were performed. Section F remains open.
