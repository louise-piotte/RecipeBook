# WP03 Section F Kodo Millet Identity Review

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** coordinator integration completed 2026-10-10; see the integration note below.
- **Scope:** one unreviewed species-level grain candidate, kodo millet (*Paspalum scrobiculatum*), with its English and Canadian French product name.
- **Recommendation:** add one identity-only `GRAIN_AND_CEREAL` reference, `kodo millet / kodo`, with only the officially recognized English spelling alias `koda millet`. Keep the French alias list empty. Add no forms, measures, conversions, yields, substitutions, or recipe links.

## Why this is a distinct candidate

The plan leaves Section F species-level millet review and regional cereal coverage open. Neither the plan, active package, research ledger, legacy candidates, nor existing proposals contains a focused kodo-millet review or identity. The residual-gap audit mentions the already integrated broad and named millet identities, but not kodo. This packet does not reopen recent reviews of pearl millet/bajra, puffed millet, or other completed Section F targets.

FAO lists kodo as one of several distinct millet species and identifies the crop as *Paspalum scrobiculatum*. Government of Canada's TERMIUM Plus record connects that Latin species name to the English term `kodo millet` and the standardized French term `kodo`; its observation scopes the terms to agricultural cereal-grain products [S01, S02]. A Canadian retailer lists `Kodo Millet` under grains as a ready-to-cook product [S03]. Together, these sources support a species-qualified edible grain identity, separate from the existing generic millet row and from other millet species.

## Proposed catalog row and naming boundaries

| Stable ID | English display | fr-CA display | EN aliases | FR aliases | Category and data |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-kodo-millet` | `kodo millet` | `kodo` | `koda millet` | none | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |

`kodo` is the exact French term recorded by TERMIUM Plus for *Paspalum scrobiculatum* in its grain-growing entry. The same record describes the subject as agricultural food products (cereal grains) and marks the term as standardized. This is a Government of Canada terminology source, not an OQLF ruling or a Québec retailer label. No kodo-specific OQLF entry or Québec-market French package label was found in this pass; retain the official Canadian French term as the proposed display and keep the narrower Québec-market review open.

| Candidate wording | Disposition | Reason and boundary |
| --- | --- | --- |
| `kodo millet` | Accept as the English display | FAO and Canadian retail product wording identify the edible grain; TERMIUM maps it to *Paspalum scrobiculatum*. |
| `kodo` | Accept as the fr-CA display | TERMIUM Plus gives this as the standardized French term for the same taxon in grain-growing / cereal-grain context. Do not duplicate it in `aliasesFr`. |
| `koda millet` | Accept as the only English alias | TERMIUM lists it as a correct spelling for the same species, although it marks `kodo millet` as standardized. |
| `kodra`, `kodon`, `varagu`, `ditch millet`, `scrobic`, and other recorded English names | Hold outside aliases | TERMIUM records additional names for the taxon, but this review found no matching local package wording or bundled recipe demand. Do not activate a larger regional-synonym set without a focused usage review. |
| `herbe à épée`, `varangon`, and `millet kodo` | Hold outside French aliases | TERMIUM lists the first two as French names for the species, but they were not established here as Québec food-product labels; the literal plant-name form is less product-specific. `millet kodo` was not verified in an authoritative Canadian French source. |
| `millet` | Keep on the existing generic identity | The OQLF describes unqualified `millet` as a generic term that can group several species. Do not make it a kodo alias [S06]. |
| `kodo millet flour` | Keep outside this grain identity | A Canadian mill/retailer sells kodo-millet flour as a separate milling product made from kodo grain [S04]. Do not attach flour wording to the grain row or assume a new species-specific flour identity without its own French product-name review. |
| `Paspalum scrobiculatum` | Evidence only, not a search alias | This Latin taxon is the identity evidence; it is not a consumer ingredient name. |

## Live package and collision audit

At this review snapshot the bundled package contains **881 references** and **48 forms**. Its manifest lists **114 recipes** with **1,123 ingredient rows**. The research ledger has **1,126 records and 2,771 source entries**; the legacy-import file has **77 candidates**.

Related active identities are `ingredient-ref-millet` (`millet / millet`), `ingredient-ref-common-millet` (`common millet / millet commun`), `ingredient-ref-pearl-millet` (`pearl millet / millet perlé`), `ingredient-ref-foxtail-millet` (`foxtail millet / millet d'Italie`), `ingredient-ref-finger-millet` (`finger millet / éleusine cultivée`), `ingredient-ref-millet-flour` (`millet flour / farine de millet`), `ingredient-ref-pearl-millet-flour`, `ingredient-ref-finger-millet-flour`, and `ingredient-ref-puffed-millet`. Kodo remains species-specific and unpuffed; it does not replace or absorb those broader, other-species, milling, or processed-grain rows.

I compared proposed names and aliases against all active canonical names and aliases plus all 48 form labels and match terms with `tools/seed_package/bundled_seed_package.py:normalize_search_key` (case, accent, punctuation, and compatibility folding). The same candidate terms were checked against ledger strings and legacy candidates. No exact normalized-key collision, prior kodo identity, matching legacy candidate, or `ingredient-ref-kodo-millet` ID exists. A prior Japanese-flour proposal's `Koda Farms` mention is a brand reference and does not create a normalized collision with `koda millet`.

| Candidate key or ID | Exact current collision | Proposed disposition |
| --- | --- | --- |
| `ingredient-ref-kodo-millet` | None | New grain identity ID |
| `kodo millet` | None | English display |
| `koda millet` | None | English alias |
| `kodo` | None | French display |
| `kodra`, `kodon`, `varagu`, `ditch millet`, `scrobic`, `herbe à épée`, `varangon`, `millet kodo`, `Paspalum scrobiculatum` | None as exact catalog/form keys | Do not add as aliases in this proposal |

The common token `millet` is present in the generic and species-qualified millet identities and flour/puffed-product names, but that is a broader search overlap, not an exact collision with `kodo millet`, `koda millet`, or `kodo`. A query for the full proposed display should resolve to the proposed row; a query for generic `millet` will continue to offer the existing broader choices as well.

## Bundled recipe demand

I searched every manifest-listed recipe JSON and its ingredient rows using accent- and punctuation-normalized phrases and word-boundary matching. The candidate set included `kodo millet`, `koda millet`, `kodo`, `koda`, `kodra`, `kodon`, `varagu`, `scrobic`, `ditch millet`, `Paspalum scrobiculatum`, `millet kodo`, `herbe à épée`, and `varangon`.

| Search scope | Hits | Result |
| --- | ---: | --- |
| Recipe files with a candidate phrase | 0 of 114 | No recipe-prose demand. |
| Ingredient rows with a candidate phrase | 0 of 1,123 | No amount, form, or state to normalize. |
| Ingredient rows already linked to the proposed ID | 0 | No existing target link. |

This is identity coverage based on an open Section F species review and official Canadian terminology, not evidence of bundled recipe demand. No recipe text or link is proposed.

## Forms, measurements, yields, and substitutions

| Concern | Evidence-qualified status |
| --- | --- |
| **Identity** | Supported for an edible cereal-grain reference scoped to *Paspalum scrobiculatum*. Do not include forage, hay, silage, or other plant uses. |
| **Product versus form** | Add no `IngredientForm`. FAO's crop record describes grain boiled/parched and ground into flour, but that establishes possible product processing, not a stable dry/cooked form model or universal transformation [S02]. |
| **Measurement** | `not_yet_researched`; add no density, cup-to-mass value, unit mapping, or serving amount. A Canadian retailer's `2 lbs` listing is a package size, not an ingredient conversion [S03]. FAO food-composition values per 100 g are composition data, not kitchen portion weights or density [S01]. |
| **Conversions and yields** | No conversion, cooking yield, package yield, or grain-to-flour milling ratio. FAO crop yield and growing-period values are agricultural data and are not transferred to recipe quantities [S02]. |
| **Substitutions** | `not_yet_researched`; propose no global or contextual rule. A Canadian retailer's “rice replacement” use suggestion is not a measured or recipe-qualified equivalence [S03]. |
| **Flour boundary** | No flour identity or alias in this packet. A Canadian mill's separate `Kodo Millet Flour` product supports treating flour as a distinct product inquiry, not as a grain alias [S04]. |

## Integration recommendation and acceptance checks

**Recommendation: accept one identity-only row for coordinator integration review**, with the exact row `ingredient-ref-kodo-millet`, English display `kodo millet`, fr-CA display `kodo`, English alias `koda millet`, no French aliases, category `GRAIN_AND_CEREAL`, `defaultDensity: null`, and `unitMappings: []`. Do not add forms, measurement observations, conversion or yield records, substitutions, or recipe links.

1. Preserve existing generic millet, species-specific millet, flour, and puffed-millet rows; create no merge or rename.
2. Confirm the new ID and all three proposed normalized name keys remain unique against the live references, aliases, forms, ledger identity/name entries, and legacy candidates.
3. Confirm the picker maps `kodo millet`, `koda millet`, and `kodo` to the species-qualified grain row; retain broader multi-result behavior for an unqualified `millet` query.
4. Keep `kodo millet flour` and other milling states outside the grain row; do not infer a dry/cooked form or grain/flour conversion.
5. Keep the 114 bundled recipes unchanged. Do not link a recipe from this zero-hit packet.
6. Keep density, unit mappings, measures, yields, and substitutions absent pending evidence that actually establishes those values or rules.
7. Record the Government of Canada source as Canadian federal terminology, not as an OQLF endorsement. Keep independent Québec product-label review open.

## Remaining Section F gaps

This proposal does not close the wider Section F review. The plan still records generic sushi rice, unqualified farro, pot/Scotch barley naming, bulgur grade crosswalks, generic grits/polenta, pearled hominy, pozole corn, dried sweet corn, other puffed or regional cereal products, dry/cooked forms where a recipe-specific need exists, and independent Québec French review as open or held. Broader species-level millet, sorghum, fonio, quinoa, and amaranth review and regional cereal-mix coverage also remain open; this packet makes no claim to have exhausted those candidates.

## Proposal-local source register

Sources checked on 2026-10-10. These local IDs do not modify the shared research ledger.

- **WP03-KODO-20261010-S01 — Food and Agriculture Organization of the United Nations (FAO), [International Year of Millets 2023: About](https://www.fao.org/millets-2023/about/).** Under “What are millets?” FAO describes millets as small-grained dryland cereals and lists kodo among distinct millet species; its Kodo Millet entry identifies *Paspalum scrobiculatum*. The page includes composition values, but none is used as a kitchen measure, density, or serving amount.
- **WP03-KODO-20261010-S02 — FAO, [Ecocrop crop record: *Paspalum scrobiculatum*](https://ecocrop.apps.fao.org/ecocrop/srv/en/cropView?id=1630).** Describes the plant as a cereal crop, lists kodo millet and kodo among common names, and says grain is used boiled/parched or ground into flour. It also mentions non-food forage uses; this proposal is limited to edible grain. Crop yields and growing data are excluded from recipe measurements.
- **WP03-KODO-20261010-S03 — Millet Republic, Canadian product listing, [Kodo Millet](https://milletrepublic.ca/products/kodo-millet).** The Canada-market listing is titled `Kodo Millet`, appears under the retailer's grains navigation, and describes a ready-to-cook food product with suggested uses. Its listed package size is not used as a measure; its “rice replacement” wording is not treated as a substitution rule or equivalence.
- **WP03-KODO-20261010-S04 — Puremill Canada, [Puremill Kodo Millet Flour](https://www.puremill.ca/products/puremill-kodo-millet-flour).** The Canadian mill/retailer separately names a `Kodo Millet Flour` product and describes it as made from kodo millet grains. Supports the grain/flour product boundary only; its flour page does not establish a French product label, flour measurement, or grain-to-flour conversion.
- **WP03-KODO-20261010-S05 — Translation Bureau, Public Services and Procurement Canada, [TERMIUM Plus record: Kodo Millet](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=KODO).** Record dated 2016-03-11, under Botany and Grain Growing; its universal entry is *Paspalum scrobiculatum*. English terms include standardized `kodo millet` and correct `koda millet`; French terms include standardized masculine noun `kodo`. The observation scopes the record to agricultural food products (cereal grains). The record also lists other names, but this proposal activates only the most specific standardized product spelling and the single exact spelling alias noted above.
- **WP03-KODO-20261010-S06 — Office québécois de la langue française (OQLF), [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), last updated 2010.** The entry explains that unqualified `millet` can group several species or be shorthand for a specific one. It is cited for the generic-name boundary only; it does not provide a kodo-specific French display.

## Coordinator integration — 2026-10-10

Accepted as identity-only `ingredient-ref-kodo-millet` in `GRAIN_AND_CEREAL`, displayed as `kodo millet / kodo`, with only the English alias `koda millet`. The French term is supported by Government of Canada TERMIUM Plus; this is recorded as federal terminology, not an OQLF endorsement, and Québec product-label review remains open. No forms, measurements, yields, conversions, substitutions, or recipe links were added.
