# WP02 B2/B3 — Edible sago starch / edible sago flour identity boundary

- **Reviewed:** 2026-10-12
- **Status:** Integrated on 2026-10-12 as held candidate `candidate-edible-sago-starch`; see the batch README for root disposition and static validation.
- **Scope:** Determine whether the standardized food product named `edible sago starch` / `sago starch` belongs on the active `edible sago flour` reference or merits a separate identity. This does not reopen palm-sago pearls, cassava-derived products called sago, canna starch, or other regional starch decisions.
- **Source IDs:** `WP02-SAGO-STARCH-BOUNDARY-20261012-S01` onward. Root recorded these sources on `candidate-edible-sago-starch` in the research ledger during integration.

## Recommendation

**Keep `edible sago starch` as an unresolved, separate candidate. Do not add `sago starch` or `edible sago starch` as aliases to `ingredient-ref-sago-flour`, and do not create a second active row yet.**

The standards describe closely related food products: Codex names `edible sago flour` and defines it from *Metroxylon* palm pith for direct consumption; Standards Malaysia names `edible sago starch` and describes it as starch processed from the same palm pith for food applications. The accessible Malaysian metadata does not expose enough of MS 470:2012's product definition or quality criteria to compare it with Codex CXS 301R-2011. No source found explicitly equates the two standard names. The proposed candidate should therefore remain distinct pending a product-level crosswalk.

The OQLF entry for `fécule de sagou` supplies a Québec French term and the English equivalent `sago starch`, but its definition includes a smaller *Cycas* source in addition to *Metroxylon*. That scope does not cleanly match the active Codex identity, which is limited to *Metroxylon* spp. The exact French alias remains unassigned.

| Product phrase | Evidence and disposition |
|---|---|
| `edible sago flour` / `farine de sagou comestible` | Keep as the active display pair for `ingredient-ref-sago-flour`. Codex CXS 301R-2011 defines the product from *Metroxylon* pith and explicitly excludes cassava products called sago flour in some regions. |
| `edible sago starch` | Keep as a separate candidate. MS 470:2012 uses this name for a food product processed from *Metroxylon* pith, but the public page does not provide enough specification detail to prove synonymy with the Codex product. |
| `sago starch` | Do not alias yet. TERMIUM lists this as a food-industry term for starch made from sago-palm pith and used in pudding; the OQLF entry's broader botanical scope and Malaysia's separate industrial-sago-starch standard make an unqualified mapping less specific than the active identity. |
| `fécule de sagou` | Keep unassigned. OQLF pairs it with `sago starch`, but includes *Cycas* as a lesser source; it does not limit the term to the active *Metroxylon*-only identity. |
| `sago pearls` / `perles de sagou` | Keep on the existing separate pearl reference. A pearl is a processed/granulated sago-starch product; it is not an alias or form of either dry flour/starch candidate. |
| `sago flour`, `sabudana`, `sagu` / `sagú` | Do not broaden the palm-sago row with these terms. Prior WP02 work documents cassava-derived products sold under some of these names, and the current Canadian retailer example labels ground tapioca pearls as “Sago Flour.” |

Do not reserve an ingredient-reference ID. If later evidence establishes synonymy, consider source-attested English alias(es) on the existing palm-pith row. If it establishes a distinct product, first obtain a Québec French display that preserves the *Metroxylon* scope. Do not use `fécule de sagou` as that display without resolving its broader source definition.

## Current catalog and picker audit

The live `FLOUR_AND_STARCH` references contain:

| Reference | Current display and data | Boundary |
|---|---|---|
| `ingredient-ref-sago-flour` | `edible sago flour / farine de sagou comestible`; aliases empty; density `null`; unit mappings empty. | Verified in the ledger from Codex CXS 301R-2011. Measurement and substitution research remain `not_yet_researched`. |
| `ingredient-ref-sago-pearls` | `sago pearls / perles de sagou`; French singular alias `perle de sagou`; no forms. | Existing palm-pith pearl identity. Its prior proposal and October 10 integration remain the owning records for pearl naming and cassava-derived “sago” boundaries. |
| `ingredient-ref-tapioca-starch` | `tapioca starch / fécule de manioc`; English alias `manioc starch`. | Keep cassava-derived extracted starch separate from palm-pith products. |

There are no active forms attached to the sago-flour or sago-pearl references, no legacy candidate with a normalized exact match for `sago starch`, `edible sago starch`, or `fécule de sagou`, and no ledger candidate specifically for sago starch. The existing sago-flour ledger record is `verified`; its accepted decision added no aliases, measures, or substitutions.

The picker uses normalized complete-phrase matching before partial matching (`app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`). Static query results from the current references and forms are:

| Query | Current result |
|---|---|
| `sago starch` | No result |
| `edible sago starch` | No result |
| `sago` | `edible sago flour`; `sago pearls` |
| `sago flour` | `edible sago flour` only |
| `sago pearls` | `sago pearls` only |
| `sagou` | `edible sago flour`; `sago pearls` |
| `fécule de sagou` | No result |
| `sabudana` | No result |

If `sago starch` became an alias on `ingredient-ref-sago-flour`, the exact query would return that flour row alone and the broad `sago` query would remain two rows. If a separate starch row displayed `sago starch`, the exact query would return that row, while the broad `sago` query would become three rows. A future French display or alias containing `sagou` would also join the current two-result `sagou` query. The hold avoids choosing between those search outcomes before the identity and French scope are settled.

The `sago flour` picker result has a separate existing ambiguity: East India Pantry Canada currently describes its “Sabudana Flour (Sago Flour)” as flour milled from tapioca pearls. The active palm-pith result should not be generalized to cassava products. This proposal records that collision but does not reopen the previous pearl/cassava boundary review.

## Recipe, measurement, and substitution audit

The manifest-listed corpus contains **114 recipes and 1,123 ingredient rows**. A scan of all recipe JSON text found no match for `sago starch`, `edible sago starch`, `sago flour`, `edible sago flour`, `fécule de sagou`, `farine de sagou`, `sagou`, `sabudana`, or `sagu`. No recipe link or recipe-driven alias is supported.

No source reviewed here supports a household measure, bulk density, volume-to-mass mapping, conversion, yield, or generic substitution between sago flour and sago starch. Codex quality thresholds and the Malaysian standard metadata are product-specification evidence, not kitchen measurements. Preserve the current `defaultDensity: null`, empty `unitMappings`, and both `not_yet_researched` ledger states; do not add forms, numeric observations, conversions, yields, or substitutions.

## Prior-work reconciliation

- The WP02 B2/B3 checklist and recent October 12 checkpoints leave broader flour/starch coverage open. This is one narrow identity-boundary review, not a completion claim for B2/B3.
- [`wp02-sago-pearl-quebec-terminology-review-20261010.md`](wp02-sago-pearl-quebec-terminology-review-20261010.md) and [`wp02-wp03-wp06-sago-lotus-locust-integration-20261010/README.md`](../batches/wp02-wp03-wp06-sago-lotus-locust-integration-20261010/README.md) own the palm-sago pearl identity, its French display, and its separation from cassava-derived “sago” products. They did not compare the full edible-sago-starch standard with Codex's edible-sago-flour definition.
- [`wp02-b2-b3-canna-starch-identity-gap-review-20261012.md`](wp02-b2-b3-canna-starch-identity-gap-review-20261012.md) keeps regional `sagú` / `sagu` wording out of the canna-starch aliases. This review does not change that decision.

## Sources and evidence limits

All web sources were accessed on 2026-10-12.

| ID | Source and supported evidence | Limits |
|---|---|---|
| **S01** | Codex Alimentarius Commission, [Regional Standard for Edible Sago Flour (Asia), CXS 301R-2011](https://openknowledge.fao.org/handle/20.500.14283/ce0229en), adopted 2011 and amended through 2026. Scope limits the food product to *Metroxylon* palm pith, excludes cassava products called sago flour in some regions, defines the pounding/grinding/milling then soaking/settling/drying process, and requires the label name `Edible sago flour`. | Does not mention MS 470:2012 or say whether edible sago starch is another name for the standardized flour. Its quality limits, including minimum starch content, are not household measures. |
| **S02** | FAO Terminology Portal, [edible sago flour, entry 172732](https://www.fao.org/faoterm/viewentry/en/?entryId=172732). Records the Codex English term and French `farine de sagou comestible`, with the same *Metroxylon* pith definition. | It derives from the same Codex standard and is not independent evidence of a starch/flour synonym. |
| **S03** | Department of Standards Malaysia, [MS 470:2012 preview: Edible sago starch — Specification](https://mysol.jsm.gov.my/preview-file/eyJpdiI6Im5PZFBPcElHTGxxVStFSE5yTlJ2Z1E9PSIsInZhbHVlIjoiS2VDMDl4Q2Ixa2J0QW5uZ2V4SXNmdz09IiwibWFjIjoiZmM4ZTkwNDVjNjIzMWQwMjJhNTIxNDI1M2JiMjlkZTBlYmRmNDFiMDRkMWM3MWJhOWNmYzVlMzg4NGRjYzNkNSJ9). The official preview says the published standard covers edible starch from processing *Metroxylon* pith or soft core for food applications. | The full 14-page standard is not available in the public preview; detailed process and quality limits could not be compared to Codex. The portal metadata does not establish an equivalence between the standard names. |
| **S04** | OQLF, [fécule de sagou (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287213/fecule-de-sagou). Gives the French term, English equivalent `sago starch`, and wet-extracted pith definition. | The entry attributes its terminology to AFNOR (1979), not OQLF. Its definition includes *Metroxylon sagu*, *M. rumphii*, and, in smaller quantity, *Cycas*; it is not a palm-only crosswalk to CXS 301R-2011. |
| **S05** | Public Services and Procurement Canada, [TERMIUM Plus search for sagou](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=SAGOU). In the Food Industries field, lists English `sago starch` and describes starch made from powdered sago-palm pith for pudding. | A terminology definition supports the English phrase and food use, but supplies no standard-to-standard product comparison or exact French display for an edible *Metroxylon*-only starch product. The page is a dynamic search result. |
| **S06** | Department of Standards Malaysia, [MS 468:2012 preview: Industrial sago starch — Specification](https://mysol.jsm.gov.my/getPdfFileForAdmin/eyJpdiI6IjdwOHNhVEdPL2lEck8rb1JNanhBV3c9PSIsInZhbHVlIjoiU1l6REhVV3Frd0N5b0Vvdml1VWZydz09IiwibWFjIjoiNDZmMjc2MDExZjcxNzIyMTY2NzAxOWFiYTdhNWRiNjZkNjljNjQyY2IzOGY3YyJ9). Shows that `sago starch` is also used for a separately standardized industrial product. | Only the public cover/foreword preview was reviewed; no industrial specification or food-use comparison is inferred. |
| **S07** | East India Pantry Canada, [Sabudana Flour (Sago Flour), 400 g](https://www.eastindiapantry.ca/products/sabudana-floursago-flour-400g). Its current product copy says the flour is milled from tapioca pearls, illustrating Canadian retail use of `sago flour` for a cassava-derived product. | Retailer description, not a food standard or a package image. This phrase is included only to preserve the already reviewed palm/cassava search boundary. |

## Follow-up evidence needed

Revisit the candidate only if a full MS 470:2012 definition or a current product specification/package establishes whether edible sago starch and Codex edible sago flour are the same consumer ingredient. Obtain a Québec French label or authoritative term scoped to the same *Metroxylon* food product before activating `fécule de sagou` or a new French display. No active identity, aliases, measurement data, recipe links, or substitutions are proposed in this review.
