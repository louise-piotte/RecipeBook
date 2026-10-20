# R425 — WP03 Section J cassava/yuca alias review — 2026-10-17

**Status:** Proposal only; no shared catalog data changed.
**Disposition:** Add the narrow lookup alias `yuca` to the existing cassava-root reference. Hold bare `yucca` and other regional names outside this delta.

## Scope and ownership

The task refers to roots/tubers as Section H, but the active catalog plan places them in **Section J**. This review addresses only the open `cassava/yuca` name boundary under that checklist; it does not reopen the pulse work in Section H or the previous WP06 root-identity decision.

The existing owner is `ingredient-ref-cassava-root`, displayed as **cassava root / manioc**, category `VEGETABLE_AND_AROMATIC`. Its accepted identity remains unchanged. The WP06 identity packet left regional names, including `yuca`, as research evidence rather than aliases; the WP06 Caribbean sweep later surfaced the Cuban `yuca` name but left it unallocated pending confirmation. No second active root identity is proposed.

## Proposed exact data delta

| Field | Current | Proposal |
|---|---|---|
| ID | `ingredient-ref-cassava-root` | unchanged |
| English display | `cassava root` | unchanged |
| French display | `manioc` | unchanged; this remains the OQLF-preferred Québec term |
| English aliases | `[]` | add `yuca` |
| French aliases | `[]` | add `yuca` |
| Category | `VEGETABLE_AND_AROMATIC` | unchanged |

The French alias is justified as the exact visible product name on a current French-language Québec retail listing; the English alias is listed by OQLF under English terms. Store lowercase `yuca` in both arrays. Do not create a separate `yuca` reference or form.

### Boundary terms

- **Hold bare `yucca`.** OQLF does list `yucca` among English terms for manioc, but the exact spelling also names the distinct accepted *Yucca* plant genus. The Royal Horticultural Society describes yucca species as shrubs or trees and as house, conservatory, patio, and garden plants. Mayrand’s visible product title is the less ambiguous `Yuca`; its URL slug alone is not used as a consumer-facing product name. Revisit only if a specific recipe-market need supports a qualified phrase such as `yucca root`.
- **Keep Spanish and Brazilian scope distinct.** OQLF’s Spanish terms list both `yuca` and `mandioca`. Existing WP06 Brazil research records `mandioca`, `macaxeira`, and `aipim` in Brazilian table/industrial-root contexts. Those names remain outside this narrow delta: the direct Québec product evidence selects `Yuca`, and no new country-wide equivalence or preparation claim is needed.
- Keep cassava flour, cassava leaves, tapioca starch, gari, and other processed cassava foods as their existing distinct identities. This alias means only the whole manioc root.

## Ownership, picker, and corpus audit

The live package contains 1,723 references, 141 forms, 56 legacy candidates, and 2,082 ledger records. Exact normalized-key checks found no current owner for `yuca` or `yucca` among active reference names/aliases, form labels/match terms, or legacy candidates. The source-ID prefix `WP03-ROOT-CASSAVA-YUCA-R425-20261017` and this proposal path are unused.

The current phrase-first picker rules return **0** results for `yuca`; a static evaluation of those rules with the proposed alias returns exactly `ingredient-ref-cassava-root`. The `cassava root` query remains one result. The broad `manioc` query currently returns four results—cassava flour, cassava leaves, cassava root, and tapioca starch—and remains four after the alias addition. No existing owner collision is introduced. The bare `yucca` query remains without a catalog result under this proposal.

I parsed every recipe path in the current seed manifest and scanned the full file text plus ingredient-line fields. The corpus has **114 recipe files and 1,123 ingredient rows**; none mentions `yuca`, `yucca`, `manioc`, or `cassava`, and none links `ingredient-ref-cassava-root`. There is no bundled recipe demand or relink to make. Corpus path-and-bytes audit hash: `d870d4e10ea14513b63e36f522668d948df59f27e9b21882826885a549ac26cd`.

## Measures, substitutions, and evidence limits

The root currently has no forms, no default density, and no unit mappings. Neither global nor contextual substitution rules nor package yields reference this ID. Keep all of those unchanged: an alias supplies no measurement state, household conversion, process form, yield, recipe link, or substitution evidence. OQLF notes sweet/bitter root differences; this review does not generalize preparation or safety guidance across them. Mayrand’s approximate retail unit weight is not recipe-measure evidence.

The Québec listing establishes a local product label and explicitly calls Yuca the root of manioc, but it reports “Bientôt disponible” at its listed stores on access; it does not establish current shelf inventory. OQLF provides strong terminology evidence, while the product listing supplies the needed Québec market use. The corpus has no recipe-use evidence. The treatment of bare `yucca` remains an intentional search-scope hold despite OQLF’s English term list.

## Ledger recommendation

At integration, keep record `ingredient-ref-cassava-root` at `identityState: verified`; add an accepted alias-only decision and a Mayrand source entry. Reuse existing OQLF source `WP06-SOUTHAM-20261009-S08` and clarify in its evidence note that OQLF’s English list includes `yuca`; do not duplicate that source. Add these proposal source IDs if the alias and boundary rationale are adopted:

- `WP03-ROOT-CASSAVA-YUCA-R425-20261017-S01` — Mayrand Québec `Yuca` product page, visible title, definition, and store-status section.
- `WP03-ROOT-CASSAVA-YUCA-R425-20261017-S02` — Kew Plants of the World Online, accepted *Yucca* genus; supporting hold of the unqualified spelling.
- `WP03-ROOT-CASSAVA-YUCA-R425-20261017-S03` — Royal Horticultural Society, yucca growing guide; describes garden/houseplant scope.

Leave `measurementState` and `substitutionResearchState` at their current `not_yet_researched` values. Do not mark any measure or substitution as researched based on this alias review.

## Sources

| ID | Source and use |
|---|---|
| Existing `WP06-SOUTHAM-20261009-S08` | OQLF, [manioc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17060768/manioc), updated 2025. Defines manioc as the root used as a vegetable or for tapioca; gives preferred French `manioc`, English terms including `yuca` and `yucca`, and Spanish `yuca` / `mandioca`. The identity and taxonomy distinction is not extended beyond this alias proposal. |
| S01 | Mayrand, [Yuca — légumes exotiques](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/legumes/legumes-exotiques/yucca-04819). Current French-language Québec listing (product 04819); visible title `Yuca` and information says it is the root of manioc. Store panels showed “Bientôt disponible” when checked 2026-10-17; this supports product naming, not inventory. |
| S02 | Kew Science, [Plants of the World Online: *Yucca* L.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:30003895-2). Recognizes *Yucca* as an accepted genus in Asparagaceae, separate from the manioc definition. |
| S03 | Royal Horticultural Society, [Yucca care and growing tips](https://www.rhs.org.uk/plants/yucca/growing-guide). Documents yucca species as shrubs/trees used in gardens and as house/conservatory plants; supports keeping the bare spelling out of a food picker alias. |
| Existing WP06 context | [Fresh cassava-root identity packet](../batches/wp06-cassava-root-identity-20261009/README.md) and [Spanish-speaking Caribbean gap sweep](wp06-caribbean-spanish-cuisine-gap-sweep-20261011.md). These record the previous root ownership, regional-name hold, and earlier Cuban `yuca` mention. |

**Implementation recommendation:** Add only `yuca` to `aliasesEn` and `aliasesFr` on `ingredient-ref-cassava-root`; record the Mayrand evidence and accepted alias decision in the existing ledger record. Keep `yucca`, `mandioca`, `macaxeira`, `aipim`, recipe links, forms, measurements, conversions, yields, and substitutions unchanged.
