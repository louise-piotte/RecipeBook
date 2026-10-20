# WP04 Section P — cunner / tanche-tautogue Québec market hold

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only regional finfish identity, naming, catalog ownership, picker-boundary, and recipe-demand review.
- **Disposition:** **Hold** an active `PROTEIN` identity for cunner / tanche-tautogue (*Tautogolabrus adspersus*) pending evidence of current Québec culinary-market use and a resolved picker boundary for the shorter French token `tanche`.
- **Worktree scope:** this proposal file only. No catalog JSON, ledger, generated Kotlin, recipe, plan, roadmap, or test was changed. No app tests or emulator checks were run.

## Bounded candidate and recommendation

The current Section P plan leaves “regional fish” open. Recent Section P work has assigned red hake, American shad, Pacific cod, lake whitefish, lake trout, bluefish, Atlantic capelin, and other distinct fish/product decisions. A scan of current Section P proposal and batch Markdown found no cunner, tanche-tautogue, *Tautogolabrus adspersus*, or cited alternate-name packet. This review concerns one unallocated species identity, not a general perch, bass, or preserved-fish row.

If the candidate is reopened, its source-supported identity pair is:

| Proposed ID (unallocated) | Category | English display | Québec French display | Taxon | Aliases proposed |
|---|---|---|---|---|---|
| `ingredient-ref-cunner` | `PROTEIN` | **cunner** | **tanche-tautogue** | *Tautogolabrus adspersus* | None |

OQLF classifies the term in the edible-fish and ichthyology domains, identifies *T. adspersus*, gives English **cunner**, and marks **tanche-tautogue** as the normalized Québec French term for commercial fish labeling. That establishes a species/name pair. It does not establish that this fish is currently sold or used as a recipe ingredient in Québec. Exploramer’s current Fourchette Bleue species guide calls it a culinary resource but reports “No commercial fishing” and “Not yet commercialized in Québec.” Given that direct local market limitation and no matching bundled recipe demand, keep the species outside the active catalog until a current Québec or Canadian culinary product source establishes intended ingredient use.

The hold is local in scope: it does not claim that the species is inedible or never consumed elsewhere. Reopen with a current retail, restaurant, fishery, or recipe source that documents an actual culinary product or use. The existing OQLF display should remain the preferred French market term if the identity is later accepted.

## Taxonomic and name boundary

- Limit any future row to *Tautogolabrus adspersus*. OQLF and TERMIUM Plus independently pair that taxon with **cunner / tanche-tautogue**.
- The French OQLF entry is in the edible-fish domain and says the species has commercial potential in Québec. “Potential” is not evidence of current commercialization; the current Fourchette Bleue guide says the species is not yet commercialized locally.
- OQLF identifies `achigan de mer`, `limbert`, and `tanche` as terms used in some contexts, but says they were not retained for Québec fish-product marketing, where a single species-specific term was normalized. Do not store them as aliases.
- TERMIUM lists English alternatives including `blue perch`, `chogset`, `sea perch`, `bergall`, `cachogset`, and `bait-stealer`, with `conner` and `connor` as key terms. Do not promote these to global picker aliases without direct Québec consumer-product evidence. TERMIUM notes that `sea perch` also names *Morone americana* and that `achigan de mer` is also used for *Lopholatilus chamaeleonticeps*.
- Keep black tautog (*Tautoga onitis*) distinct. Fourchette Bleue explicitly says “tautog” refers to the related black tautog, not this species.
- Do not infer a generic perch, bass, sea-perch, or fish identity from this candidate. It is a single marine fish species.

## Exact catalog, form, legacy, and ledger ownership audit

The review-time audit checked normalized candidate phrases against reference IDs, English/French names and aliases; form IDs, labels and match terms; legacy candidate IDs, names and aliases; ledger record IDs and complete record text. Search normalization follows `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase, Unicode NFKD, common ligature folding, accent removal, punctuation-to-space, and whitespace collapse.

Snapshot taken from the live worktree on 2026-10-12. Hashes cover exact bytes. The recipe digest hashes each manifest-listed relative path and exact recipe bytes in manifest order, separated by NUL bytes.

| Artifact | Current count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,254 references | `7a2916bb212ad9cc967ba63520c0ee01115d11d06bd9fce106a53819796904e7` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,563 records; 5,467 source entries; 4,505 distinct source IDs | `f2c2040ce7d49b717bcbb051fd904ad1a305ae307c20f07b0c35c3ebb378acc0` |
| `BundledIngredientCatalog.kt` (generated) | 1,254 references | `baff8547d208f37750f6b4b2478c24b984fbf799d729572f72a1b02571166ffe` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,736 bytes | `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |

| Candidate key / ID | Exact active reference, form, legacy, or ledger owner |
|---|---|
| `cunner` / `tanche-tautogue` / normalized `tanche tautogue` | None |
| *Tautogolabrus adspersus* | None |
| `ingredient-ref-cunner` / `candidate-cunner` | Neither ID is allocated in references, forms, legacy identities, or ledger record IDs. |
| `blue perch`, `chogset`, `cachogset`, `bergall`, `bait-stealer`, `conner`, `connor` | No exact active or legacy owner; no ledger text or record-ID hit. Not proposed as aliases. |
| `sea perch`, `achigan de mer`, `limbert`, `tanche`, `tautogue` | No exact active or legacy owner; no ledger text or record-ID hit. Do not add as aliases for the reasons above. |

No active form is linked to a cunner identity. No legacy candidate, existing candidate ledger record, or active generated-index term owns the species or its reviewed names. The proposed source-ID range `WP04-SECTIONP-CUNNER-20261012-S01` through `S03` was unallocated in the ledger and existing proposal/batch Markdown at review time.

This ownership audit establishes absence of an exact stored owner; it does not mean that future picker searches are exact-key-only.

## Picker phrase boundary

The current picker searches reference names, aliases, and attached form terms. It normalizes punctuation into spaces and gives complete word-phrase matches precedence over substring fallback. Because `tanche-tautogue` normalizes to `tanche tautogue`, a query for the one-word phrase `tanche` would also match that display even without storing `tanche` as an alias. OQLF specifically says `tanche` was not retained for Québec fish-product marketing. Therefore the active row should remain held until a Québec product source resolves this search result boundary or the picker can preserve the species-qualified choice.

If later accepted, store only the full paired displays `cunner` and `tanche-tautogue`; add no alternate aliases. Do not add short terms (`fish`, `perch`, `tanche`, `tautogue`), regional English variants, `sea perch`, or `achigan de mer`. Do not assign any full product phrase to a different fish or to an unspecified fish product.

## Recipe-corpus demand audit

All 114 recipe paths from `manifest.v1.json`, all 1,123 ingredient rows, and complete recipe JSON text were scanned for whole-word normalized phrases: `cunner`, `tanche-tautogue`, `tanche tautogue`, *Tautogolabrus adspersus*, `blue perch`, `chogset`, `cachogset`, `bergall`, `bait-stealer`, `conner`, `connor`, `sea perch`, `achigan de mer`, `limbert`, `tanche`, and `tautogue`.

**Result: zero matching files and zero matching ingredient rows.** Nearby seafood rows do not imply cunner: recipe 019#8 requests jumbo-lump crab meat; 077#10 requests salmon fillets; 093#4 says “Cooked meat or seafood, to taste”; 093#6 and 095#5 use fish sauce; and 111#1 requests a tuna steak. None identifies this species. No recipe link or relink is supported.

## English / fr-CA source limits and product-state boundary

- The OQLF and TERMIUM entries establish a taxon-name mapping and commercial terminology, not current availability, sourcing permission, or a preparation state.
- Fourchette Bleue’s Québec guide reports the fish as a culinary resource and cautions that it has many bones, while also reporting no commercial fishing and no Québec commercialization. The caution is not a validated preparation method or a safety instruction.
- The review located no current Québec consumer product, recipe in the bundled corpus, or source-specific culinary use that supports a product form. Do not create forms or aliases for whole, filleted, fresh, frozen, smoked, salted, dried, cooked, canned, powdered, or surimi products. Those would each require an exact product source and would remain distinct from species identity.
- The site’s biological size entry (30 cm, up to 44 cm) is fish-body length only. It is not a recipe portion, count weight, fillet weight, edible yield, cooking yield, or conversion.

## Numeric and substitution limits

No reviewed source supplies a cunner recipe amount, standardized serving, count-to-weight value, fillet weight, edible fraction, cooking yield, density, or volume-to-mass mapping. If a species identity is accepted later, keep `defaultDensity` null and `unitMappings` empty; add no numeric observation from biological length.

No recipe or preparation source supports replacing cunner with another fish or replacing another species with cunner. Species relationship, marine habitat, and generic fish wording do not establish culinary performance or safe cooking equivalence. Add no global or contextual substitution rule.

## Recommended disposition

**Hold `ingredient-ref-cunner` unallocated.** Do not add an active reference, alias, form, ledger acceptance, recipe link, numeric value, conversion, yield, or substitution from this review. Reopen when a current Canadian or Québec culinary source documents actual product/recipe use and either the picker boundary for bare `tanche` is addressed or the relevant query behavior is otherwise made species-safe.

## Sources

Sources accessed on 2026-10-12. These source IDs are proposal-local and are not ledger additions.

| Source ID | Authoritative or regional source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CUNNER-20261012-S01** | OQLF, [tanche-tautogue (Grand dictionnaire terminologique)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198965/tanche-tautogue) | In edible-fish and ichthyology domains, gives standardized Québec **tanche-tautogue**, English **cunner**, and Latin *T. adspersus*. Says the species has commercial potential in Québec, and explicitly says `achigan de mer`, `limbert`, and `tanche` were not retained in Québec fish-product marketing. Last updated 2012; terminology evidence, not a current market listing. |
| **WP04-SECTIONP-CUNNER-20261012-S02** | Government of Canada Translation Bureau, [TERMIUM Plus: CUNNER](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enr&lang=eng&srchtxt=CUNNER) | The 2023 terminology record links *T. adspersus* to **cunner** and lists alternate English/French names. It notes `sea perch` also names *Morone americana* and `achigan de mer` also names *Lopholatilus chamaeleonticeps*. Common-name evidence only; alternates are not proposed as catalog aliases. |
| **WP04-SECTIONP-CUNNER-20261012-S03** | Exploramer / Fourchette Bleue, [Tanche-tautogue (French species guide)](https://fourchettebleue.ca/produits/tanche-tautogue/) and [Cunner (English species guide)](https://fourchettebleue.ca/en/species/cunner/) | Current regional guides pair both displays with *T. adspersus*, list it as a fish and a culinary resource, and state “Pas encore commercialisée au Québec” / “Not yet commercialized in Québec” and “Pas de pêche commerciale” / “No commercial fishing.” They give body length and note many bones, but no recipe quantities, current retailer listing, edible-yield basis, cooking method, or substitution. Exploramer’s local guide is regional market evidence, not a complete survey of all Québec sales. |

No app tests or emulator checks were run for this proposal-only review.

## Coordinator disposition

The market and picker hold is recorded as completed plan/roadmap work, with no ledger candidate or
active catalog row. See
`docs/catalog/batches/wp04-section-p-cunner-quebec-market-hold-integration-20261012/README.md`.
