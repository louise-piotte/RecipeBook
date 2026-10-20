# WP02 A7 — Malted Maize Flour Boundary Review (R34)

- Reviewed: 2026-10-13.
- Status: Proposal only. No shared catalog, research ledger, plan, roadmap, recipe, or package file was changed.
- Proposal-local source-ID prefix: `WP02-A7-MALTED-MAIZE-FLOUR-20261013-R34-S01` through `S05`. These IDs belong only to this proposal; they are not ledger records.
- Scope: the research-named flour made by malting corn/maize and milling it. This does not reopen malted finger millet flour (R32), malted naked oat flour (R33), Castle Oat 80 roasted oat malt flour (R30), rice grits (R31), or the prior gluten-flour equivalence review.

## Disposition

| Candidate | Recommendation | Active identity | Boundary |
|---|---|---|---|
| `malted corn flour` / `malted maize flour` | **Keep unresolved and unallocated.** Add no active reference, alias, legacy identity, form, measure, recipe link, or substitution. | None proposed | Primary studies establish malted corn/maize flour as an experimental product, but not a stable commercial specification or a current Canadian/Québec consumer product. Exact-phrase searches did not surface a Canadian/Québec standalone listing; this bounded search is not proof none exists. OQLF establishes the base Québec term `farine de maïs`, not a malted product name. Do not map the candidate to ordinary, roasted, precooked, or nixtamalized corn flour, or to generic `malt flour`. |

The English phrases below are source terms from research contexts, not proposed active aliases: the 1998 paper says “malted corn flours,” while a 2024 paper uses “malted maize flours.” The sources do not establish a standardized grade or commercial equivalence between all products described by those phrases. For Québec French, retain only the sourced base term `farine de maïs` as evidence about ordinary corn flour. A literal construction such as `farine de maïs maltée` is not verified as a Québec product name and is not proposed for the picker.

## A7 and archive check

The live checklist leaves open “other malted/toasted flour identities.” A search of the focused proposal and batch archive found no prior disposition for `malted corn flour`, `malted maize flour`, or `corn malt flour`. This packet addresses one distinct, species-specific malting candidate; it does not repeat the R32 finger-millet or R33 naked-oat reviews or the integrated Castle Oat 80 identity. The `R34` source-ID prefix was absent from the proposal, batch, and research-ledger archives before this file was created.

## Live ownership and picker audit

Read-only snapshot: **1,365 active references, 100 forms, 64 legacy candidates, 1,692 research-ledger records, 114 manifest-listed recipe files, and 1,123 ingredient rows**.

No active reference, form label/match term, legacy candidate, or ledger record has an exact normalized owner for `malted corn flour`, `malted maize flour`, `corn malt flour`, `farine de maïs maltée`, or `farine maltée de maïs`. No new reference ID is proposed.

Existing active owners that bound the picker are:

- `ingredient-ref-whole-kernel-corn-flour` — `whole-kernel corn flour / farine de maïs`.
- `ingredient-ref-roasted-corn-flour` — `roasted corn flour / farine de maïs torréfiée`.
- `ingredient-ref-precooked-corn-flour` — `precooked corn flour / farine de maïs précuite`.
- `ingredient-ref-masa-harina` — `masa harina / farine de maïs nixtamalisée`.
- `ingredient-ref-malt-flour` — `malt flour / farine maltée`, with `malted cereal flour` as an English alias.
- Separate cereal-specific rows for roasted oat malt, roasted wheat malt, and malted spelt flour.

The app search normalizes accents and punctuation, prefers complete word phrases, then falls back to substring matches. Static projections from the live reference and form data are:

| Query | Current picker result | Consequence |
|---|---|---|
| `malted corn flour`; `malted maize flour`; `corn malt flour` | No result | Candidate remains unallocated. |
| `farine de maïs maltée`; `farine maltée de maïs` | No result | These possible French wordings are unsupported and inactive. |
| `farine de maïs` | Four rows: masa harina, precooked corn flour, roasted corn flour, whole-kernel corn flour | Keep process-qualified corn products separate. Adding an unverified candidate display containing this phrase would make the broad French query less discriminating. |
| `corn flour` | Four rows: precooked corn flour, roasted corn flour, whole-kernel corn flour, and sorghum flour via its alias `guinea corn flour` | Do not add a broad `corn flour` alias to the malt-flour row or to an unrelated corn product. |
| `malt flour` | Four rows: generic malt flour, roasted oat malt flour, roasted wheat malt flour, and malted spelt flour | Preserve the existing multi-result behavior; do not use `malt flour` as a corn-specific alias. |
| `malted flour` | No result | The active generic row's exact display is `malt flour`; no broad “malted flour” alias is proposed. |
| `roasted corn flour`; `precooked corn flour`; `masa harina` | Their corresponding single, distinct active rows | Preserve the product and process boundaries. |

An English-only new row would leave the Québec French picker without a supported display. If `farine de maïs maltée` were later supported, the current phrase-first search would cause `farine de maïs` to return at least five rows. That is an expected picker consequence to review before any future integration, not a recommendation to add the French phrase now.

## Bundled recipe demand

I scanned every manifest-listed recipe JSON file and serialized ingredient row for `malted corn flour`, `malted maize flour`, `corn malt flour`, `malted corn`, `malted maize`, `farine de maïs maltée`, and `farine maltée de maïs`. The 114-file, 1,123-row corpus produced **zero matching recipe files and zero matching ingredient rows**. The research papers are not bundled recipe demand; no recipe link or relink is proposed.

## Measurement and substitution limits

- None of the exact-form sources supplies a household mass/volume pair, density, reusable unit mapping, cooking yield, or recipe quantity for a current retail malted corn/maize flour.
- The study-specific malting durations, temperatures, grain varieties, flour analyses, and instrument-test quantities describe laboratory methods. They are not kitchen measures, process forms, or defaults for another product. The 2015 study's additional lime/extrusion/nixtamalization steps describe an experimental instant flour and do not make it interchangeable with generic malted corn flour or the existing masa harina row.
- No source tests this candidate as a replacement for ordinary corn flour, wheat flour, generic malt flour, roasted corn flour, precooked corn flour, or masa harina. Add no directed form conversion, contextual substitution, yield, density, or unit mapping.

## Sources and limits

Sources were checked on 2026-10-13.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-MALTED-MAIZE-FLOUR-20261013-R34-S01` | Office québécois de la langue française, [farine de maïs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais), updated 2025; definition and preferred term. | Québec preferred term `farine de maïs`, English `corn flour`, defined as fine powder of ground maize grains. | Covers unqualified corn flour only; it does not name malted corn flour or support `farine de maïs maltée`. |
| `WP02-A7-MALTED-MAIZE-FLOUR-20261013-R34-S02` | Grossmann, Mandarino, and Yabu, [Chemical composition and functional properties of malted corn flours](https://www.scielo.br/j/babt/a/gfsdTKZXDRXbpCyg3PpFqGz/), *Brazilian Archives of Biology and Technology* 41(2), 1998; abstract, “Malting Process,” “Milling,” and conclusion. | Names flour obtained from malted corn and reports that malting time/temperature affect composition and paste viscosity; describes one controlled, laboratory-milled sample. | One experimental study, not a consumer specification, Canadian/Québec product name, household measure, or general recipe behavior. Its process values are not transferred. |
| `WP02-A7-MALTED-MAIZE-FLOUR-20261013-R34-S03` | [Physico-chemical, functional, pasting and structural characteristics of two malted maize flours produced under optimal conditions](https://www.sciencedirect.com/science/article/pii/S2949824424000843), *Food and Humanity* 2 (2024), 100309, DOI [10.1016/j.foohum.2024.100309](https://doi.org/10.1016/j.foohum.2024.100309); abstract. | Uses the phrase `malted maize flours` for two variety-specific research products and studies their functional/pasting properties. | Research varieties and optimized experimental processes do not establish a standard commercial flour, Québec French term, consumer availability, household measure, or substitution. |
| `WP02-A7-MALTED-MAIZE-FLOUR-20261013-R34-S04` | Rodríguez-Martínez et al., [Effect of Malting and Nixtamalization Processes on the Physicochemical Properties of Instant Extruded Corn Flour and Tortilla Quality](https://investigadores.unison.mx/en/publications/effect-of-malting-and-nixtamalization-processes-on-the-physicoche/), *Plant Foods for Human Nutrition* 70(3), 2015, pp. 275–280; abstract and process description. | Separates malted grain/flour from the later lime and extrusion-nixtamalization process used to produce an instant flour; reports process-specific tortilla results. | A combined experimental process, not evidence that malted corn flour alone equals masa harina, precooked corn flour, or ordinary corn flour; no kitchen conversion or general substitution. |
| `WP02-A7-MALTED-MAIZE-FLOUR-20261013-R34-S05` | Government of Canada, Translation Bureau, [TERMIUM Plus: malt flour / farine maltée](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?codom2nd_wet=1&i=&index=enb&lang=eng&srchtxt=BREWING), “Milling and Cereal Industries” entry and definition. | Records `malt flour` / `malted cereal flour` and French `farine maltée`; its definition describes flour from malted wheat or barley. | Does not include maize in that definition and does not establish `farine de maïs maltée`; do not add the generic French term to the corn candidate. |

## Next action

Keep the candidate unallocated. Reopen for an identity-only row only if a current Canadian or Québec-facing source establishes a standalone food-flour specification and defensible French product wording. If such a source appears, assess its exact process separately from plain, roasted, precooked, and nixtamalized corn flour. Review measures and substitutions only if the exact product is used by a bundled recipe or a source provides direct exact-form evidence.
