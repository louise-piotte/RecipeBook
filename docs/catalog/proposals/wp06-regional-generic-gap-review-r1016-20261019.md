# WP06 R1016 — pūhā regional culinary identity review

- **Date:** 2026-10-19
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, recipe, manifest, or code files were changed.
- **Plan anchor:** `docs/RecipeBook-global-ingredient-catalog-plan.txt:11397`, Section 05, “Australia, Aotearoa/New Zealand, Pacific island cuisines, and regionally specific Indigenous ingredients.” The item remains open; the adjacent R687 wattleseed hold does not close it.
- **Scope:** One generic Māori/Aotearoa culinary identity boundary. No brand, product-line, flavour, SKU, retailer-variant, or commercial roster work.

## Recommendation

Treat source-named **pūhā** as a real generic regional ingredient candidate, but keep it out of the active catalog until a Māori-led or appropriate Māori-authority review confirms that this project may represent the name and its scope in a bilingual pantry catalog. The 2024 Māori-crops report says external interests in these taonga should involve Māori and recommends consulting an appropriate Māori authority for clarification. This review is not that consultation.

If that review approves an entry, propose:

| Field | Proposed value |
|---|---|
| Reference ID | `ingredient-ref-puha` |
| English display | `pūhā` |
| Québec French display | `pūhā` (borrowed Māori food name; no culinary translation is proposed) |
| Category | `VEGETABLE_AND_AROMATIC` |
| Aliases | None |

The name is supported as a regional culinary group associated with *Sonchus* species, not as one fixed botanical species. Keep its recipe identity distinct from global “sow thistle” wording. The catalog’s NFKD/accent-folding search makes unaccented `puha` normalize to the same key as `pūhā`; a second spelling alias is unnecessary. No identity, alias, form, measurement, mapping, recipe link, conversion, yield, or substitution is recommended before the Māori review.

## Identity and form boundaries

| Term or boundary | Source evidence and current owner | Recommendation |
|---|---|---|
| `pūhā` | The 2024 Māori-crops table pairs the name with *Sonchus* spp. and describes cooked use in Māori dishes; Te Ara identifies it as a constituent of toroi and boil-up. No live row or legacy candidate owns the name. | Keep the source name as the only proposed display. Do not select a single species or imply the identity covers every global food use of *Sonchus*. |
| *Sonchus* spp.; *S. asper*, *S. oleraceus*, and *S. kirkii* | Current Māori-crops and Te Ara material use a genus-level culinary scope. An older New Zealand environment report distinguishes naturalized sow-thistle species and historical regional names. | Keep botanical names in provenance only. The reviewed sources do not justify one taxon as the sole meaning of the regional food name. |
| `sow thistle` / French `laiteron` | TERMIUM Plus places these terms in botany/weed-science domains; its French genus term does not identify the Māori culinary group. | Do not add either as an alias or display. It would broaden the picker beyond the regional name and could imply a species-level French term. |
| `rauriki`, `tiotio`, `rauroroa`, `taratara`, `kautara`, `wekeweke`, `taw(h)eke`, `pororua`, `hare’s lettuce` | The 2024 table lists these as other names, while historical sources associate some with particular species or wider edible-green usage. The sources do not establish them as universally interchangeable culinary labels. | Do not import this list as aliases. Preserve the names as source terminology for future Māori-led review. |
| `kōkihi` / New Zealand spinach | The live `ingredient-ref-new-zealand-spinach` identifies *Tetragonia tetragonioides* as New Zealand spinach / `tétragone`; the Māori-crops table explicitly separates it from pūhā. | Keep the active Tetragonia identity intact and separate. Do not cross-alias pūhā to spinach or kōkihi. |
| `toroi` and `boil-up` | Te Ara describes toroi as a prepared mussel-and-pūhā dish and boil-up as a meal that includes pūhā with other ingredients. | Treat these names as dishes and use evidence only, not aliases or ingredient references. No recipe-line link is proposed. |
| Plant part and preparation | The reviewed sources describe pūhā as an edible crop/food and report boiling or sautéing; they do not establish a single standardized plant part or a reusable packaged form. One report separately mentions traditional use of plant juice as gum. | Keep the identity at the source’s culinary-group scope. Add no leaf-only, dried, cooked, juice, or gum form. Do not convert recipe or preparation wording into a general form rule. |

## Live ownership and recipe-demand audit

The read-only audit used the current package and the search normalization in `IngredientSearch.kt`: lowercase with `Locale.ROOT`, NFKD, explicit `œ`/`æ`/`ß` and ampersand handling, removal of combining marks, replacement of non-ASCII alphanumeric runs with spaces, and whitespace collapse. The audit compared complete normalized names and aliases, form labels and match terms, and legacy candidate names and aliases. Candidate keys included `pūhā`/`puha`, pūhā-green and leaf phrases, `Sonchus` and the species names above, the source-listed local names, `sow thistle`, `laiteron`, `kōkihi`, `toroi`, and `pūhā toroī`.

| Artifact | Snapshot count and finding |
|---|---|
| Active ingredient references | 2,028; no exact normalized owner for pūhā, puha, Sonchus, or the reviewed regional name variants. The nearby `ingredient-ref-new-zealand-spinach` row is *Tetragonia* and remains separate. |
| Ingredient forms | 205; no exact candidate label or match-term owner. |
| Research ledger | 2,433 records; no pūhā/puha/Sonchus candidate record or prior source record for this review. |
| Legacy import identities | 55 candidates; no exact candidate owner. |
| WP06 proposal/batch archive | No prior pūhā identity review was found. The existing Oceania pantry sweep discusses other plants and routes Māori native seaweed to WP03; it does not settle pūhā. |
| Manifest-listed recipes | All 114 recipe files and 1,123 ingredient rows were scanned. There were zero full-recipe and zero ingredient-row matches for the reviewed names. No bundled recipe demand or form evidence was found. |

The recipe corpus fingerprint (manifest-ordered relative path, NUL, exact file bytes, NUL) at audit time was `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17`. Recheck counts and ownership if this proposal is later reconsidered, because the live shared package can change between review and integration.

## Source register and limits

| ID | Source | Supports | Limit |
|---|---|---|---|
| `WP06-PUHA-R1016-20261019-S01` | Prof. Nick Roskruge and Aleise Puketapu, with Tahuri Whenua, [*Ngā Kai o Rongo-maraeroa: Māori Cultivated Crops*](https://www.hortnz.co.nz/assets/About-Us/Aotearoa-Horticulture-Action-Plan/Maori-Cultivated-Crops.pdf), report TW24/01, April 2024, printed pp. 1–2 and 5–6. | The table names pūhā, gives *Sonchus* spp., describes boiling or sautéing and use in Māori dishes, and reports that present-day consumed species can include naturalized introductions. The report states its list should be used with its scoping statement and recommends Māori engagement for external decision-making. | A Māori horticultural scoping report, not a food-label standard or Québec terminology ruling. It does not authorize this catalog to publish a Māori ingredient identity without appropriate engagement, and it does not fix one species or a universal plant part. |
| `WP06-PUHA-R1016-20261019-S02` | Charles Royal and Jenny Kaka-Scott, [Māori foods – kai Māori, “Traditional foods”](https://teara.govt.nz/en/maori-foods-kai-maori/page-3), Te Ara – The Encyclopedia of New Zealand, published 2016. | Describes toroi as including pūhā (*Sonchus* species) and mussels; documents the source name in a Māori food context. | A cultural food reference, not a standardized ingredient specification, measurement source, or exhaustive taxonomic treatment. |
| `WP06-PUHA-R1016-20261019-S03` | Charles Royal and Jenny Kaka-Scott, [Māori foods – kai Māori](https://teara.govt.nz/en/maori-foods-kai-maori/print), Te Ara – The Encyclopedia of New Zealand, “Pork and potatoes” section. | Describes the Māori boil-up as including pork, pūhā, and potatoes and notes its continuing popularity. | Evidence of a named meal, not an ingredient synonym, recipe formula, quantity, or universal preparation method. |
| `WP06-PUHA-R1016-20261019-S04` | New Zealand Ministry for the Environment, [*The State of New Zealand’s Environment*](https://environment.govt.nz/assets/Publications/Files/ser-1997.pdf), 1997, ch. 9, p. 495. | Gives historical context for *S. asper*, *S. oleraceus*, and native *S. kirkii*, and shows why common-name/species crosswalks should not be assumed. | A 1997 environmental report, not a current culinary identity standard. Its historical popular-name wording is not adopted as a catalog alias. |
| `WP06-PUHA-R1016-20261019-S05` | Translation Bureau, [TERMIUM Plus: `laiteron` / *Sonchus*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frt&lang=fra&srchtxt=LAITERON). | Provides the Canadian government’s French botanical term for the genus *Sonchus*. | Its subject fields are botany and weed science, not Māori culinary naming. It does not support replacing pūhā with `laiteron` in a pantry display. |

No measurements, yields, densities, safety claims, or substitutions were taken from these sources. The current branded catalog entries and their product-specific evidence were not changed or repurposed. No roster-only commercial queue item was pursued; commercial-product counts do not add ingredient diversity.

## Next action

1. Coordinator: seek confirmation from an appropriate Māori authority or Māori-led reviewer on whether and how this catalog should represent pūhā.
2. If approved, re-audit the live package and consider the identity-only row shown above, retaining `pūhā` in both locales with no aliases until source- and community-supported naming guidance is available.
3. Keep species names, generic `sow thistle`/`laiteron`, other regional names, dishes, gum use, and unsupported forms outside the proposed row. Add no recipe links or reusable numeric behavior without separate evidence.
4. Keep the broader Australia/Aotearoa/Pacific and Indigenous-cuisine line open; this candidate does not complete Section 05.

This deliverable is proposal documentation only. No tests or builds were run.
