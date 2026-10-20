# WP02 Section D — caramel bits and toffee bits product-boundary review

- **Reviewed:** 2026-10-10
- **Status:** proposal only; this packet edits only this document and proposes no direct catalog, ledger, recipe, plan, roadmap, schema, or test-file changes
- **Scope:** generic baking-product identities for caramel bits and toffee bits; adjacent butterscotch-chip terminology is checked only for identity and French-name collisions
- **Inputs:** AGENTS.md; Requirements.md FR-3 and FR-7; the current Section 04 D checklist; the WP02 coordinator and baking-inclusion/decorations packets; the 2026-10-10 integration record; live references, forms, legacy candidates, ledger, and all manifest-listed recipes
- **No implementation or QA:** no shared catalog, ledger, recipe, checklist, roadmap, code, or test file changed; no tests or emulator work

## Recommendation

**Keep both generic identities on hold.** The evidence establishes one U.S. KRAFT Caramel Bits product and one Canadian HERSHEY'S CHIPITS SKOR Toffee Bits product. It does not establish a cross-brand product boundary or an accepted Québec French display name for either generic identity. Do not add a reference, alias, form, measurement, mapping, yield, or substitution. Do not merge caramel bits or toffee bits with each other or with the active butterscotch-chip identity.

No bundled recipe requests either product. Keep the checklist row open until product-breadth evidence and a source-supported French name resolve the boundary.

## Current checklist and requirements

The current checklist at lines 1276–1283 marks the broader baking-inclusion/decorations review complete, but explicitly leaves **caramel bits** and **generic toffee bits** unresolved pending product and Québec-terminology evidence. The integration record at `docs/catalog/batches/catalog-residual-boundaries-integration-20261010/README.md` likewise lists both as open. The adjacent fruit-processing and caramel-sauce checklist row is outside this narrow review.

Requirements.md FR-3 requires English and French equivalents for ingredient-reference names and aliases. FR-7 requires searchable references and linkable recipe lines. Neither requirement justifies assigning an unsupported French name or turning a single branded product into a generic identity.

## Reviewed live snapshot

This read-only snapshot was captured on 2026-10-10. Re-read the shared package before any later integration.

| Artifact | Count/state | Bytes | SHA-256 |
| --- | ---: | ---: | --- |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `ingredient-references.v1.json` | 862 references | 270,867 | `5155166ab2c33edfca487cf00cb1c0f1cec2bd4d526305d78b9b57841770a3d2` |
| `ingredient-forms.v1.json` | 47 forms; no caramel/toffee match | 32,455 | `7676316bf4e3b0ba6972b6c0759f0a86156428f03a2e86730ff6b986756ff3ce` |
| `research-ledger.v1.json` | 1,107 records; 2,648 sources | 2,799,227 | `2202d395c9a9b6ccc92e8efa0a238160fe97e0b61db86d475795ea9948acca75` |
| `legacy-import-identities.v1.json` | 78 candidates | 18,736 | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| Manifest-listed recipes | 114 files; 1,123 ingredient rows | 751,549 | corpus digest `816cc0466ee475900fd969c87a4ae034f2914d9994589f2589896334971baa60` |

The recipe digest is SHA-256 over sorted recipe basenames, each followed by NUL, exact file bytes, and NUL. Candidate phrase checks follow `normalizeIngredientSearchKey` in `IngredientSearch.kt` (lowercase, Unicode NFKD, accent removal, œ/æ/ß folding, punctuation-to-space, and whitespace collapse). I checked active reference names and aliases, form labels and match terms, legacy candidates, ledger record IDs and text, all ingredient rows, and full text across the 114 recipe files.

The packet source-ID prefix `WP02-CARAMEL-TOFFEE-20261010-S` was absent from the ledger and pre-existing proposal files when checked. IDs below are packet-local, not ledger changes.

## Exact recipe demand

The normalized exact-phrase scan found **zero ingredient-line and zero full-recipe-text matches** across the 1,123 ingredient rows and 114 recipe files for `caramel bits`, `toffee bits`, `brisures de caramel anglais`, `pépites de caramel`, `brisures de caramel`, `brisures de caramel au beurre`, `butterscotch chips`, and `SKOR`.

There is therefore no recipe-line ID to link, relabel, split, or convert. The manufacturer’s recipe measures below are brand-specific authored recipe values and do not create a bundled-recipe conversion need.

## Current IDs, exact-key collisions, and ledger state

No active reference, form, or ledger record exists for caramel bits or toffee bits. The only exact neighboring active identity is:

| Current ID | Current record | State and relationship |
| --- | --- | --- |
| `ingredient-ref-butterscotch-chips` | EN `butterscotch chips`; fr-CA `brisures de caramel écossais`; category `CHOCOLATE_AND_CANDY`; no aliases, density, or unit mappings | Active, identity verified. Ledger measurement and substitution states remain `not_yet_researched`. This is a separate non-chocolate baking-chip product and receives no new alias from this review. |

The legacy file still includes `ingredient-ref-butterscotch-chips` as a candidate with `reviewState: unreviewed`, despite the active reference and verified ledger decision. It is the only caramel/toffee-related legacy hit and is outside this packet’s scope; treat the active reference as the exact live owner. No legacy candidate represents caramel bits or toffee bits.

| Checked phrase | Exact current owner |
| --- | --- |
| `caramel bits` | None |
| `toffee bits` | None |
| `pépites de caramel`; `pépites de caramel SKOR` | None |
| `brisures de caramel anglais`; `brisures de caramel au beurre`; `caramel au beurre` | None |
| `butterscotch chips`; `brisures de caramel écossais` | `ingredient-ref-butterscotch-chips` |

The French phrases `pépites de caramel SKOR` and `brisures de caramel au beurre` are source-attested product wording, not existing catalog aliases. Keep them out of the generic exact-key set unless future evidence supports a specific identity and terminology decision.

## Product and terminology boundary

| Candidate | Evidence in scope | Decision |
| --- | --- | --- |
| Caramel bits | Kraft Heinz’s U.S.-English product is called “America’s Classic Unwrapped Candy Caramel Bits for Easy Melting.” It describes smooth, creamy, unwrapped morsels for melting and baking and lists a product formula and a branded serving. The product page identifies its market as USA (English). This supports that one product and use, not a generic cross-brand composition or Canadian French display. | **Hold generic caramel bits.** Keep English `caramel bits` as a research phrase only. Accept no French name or alias. Do not map it to soft caramels, caramel sauce, butterscotch chips, or toffee bits. |
| Toffee bits | Hershey Canada sells HERSHEY’S CHIPITS SKOR Toffee Bits and describes buttery toffee flavour and the sweetness of a SKOR candy bar. Its Canadian French recipe page calls this branded ingredient `pépites de caramel HERSHEY’S CHIPITS SKOR`; a single recipe uses those alongside HERSHEY’S CHIPITS `brisures de caramel au beurre`, thereby retaining two distinct branded products. Neither page establishes the generic composition or a generic French name for all toffee bits. | **Hold generic toffee bits.** Keep English `toffee bits` as a research phrase only. Do not accept `pépites de caramel SKOR` as a generic alias or `brisures de caramel anglais` as a canonical name without direct Québec product/industry evidence. Do not merge with caramel bits, butterscotch chips, SKOR/HEATH bars, or chopped candy bars. |
| French base terminology | OQLF gives `caramel anglais` as the preferred French term for English `toffee`; it defines a hard caramel, difficult to cut and chew, often sold as a bar. OQLF’s entry does not name bits, pieces, or baking inclusions. It gives `caramel écossais` for `butterscotch` and discourages `caramel au beurre` as a general term because industrial products may not contain butter. | Use the OQLF terms only for the supported base confection names. Do not infer that `caramel anglais` plus a translated “bits” word is an accepted product name or that `caramel au beurre` identifies generic caramel bits. |

### Correction to earlier WP02 evidence

The 2026-10-09 WP02 coordinator packet’s source S12 associates a linked Hershey ingredient-specification PDF with SKOR Toffee Bits and says the product contains almonds and chocolate. The linked PDF’s actual ingredient line is headed **“HEATH TOFFEE BITS,”** not SKOR. It lists sugar, vegetable oil, dairy butter, almonds, salt, soy lecithin, and chocolate for HEATH. It does not establish SKOR’s ingredient list. The current Canadian SKOR product page does not provide a full ingredient declaration in the accessible page text. Do not transfer HEATH’s formula or composition qualifiers to SKOR or generic toffee bits.

The manufacturer’s French recipe page also has an access limit: direct page retrieval returned HTTP 406 on 2026-10-10. The page was indexed in search results with the French recipe title, ingredient phrases, and amounts; the URL is retained below for review. No content from that page is treated as a full manufacturer specification.

## Proposed dispositions

| Candidate | Disposition | Bilingual name, alias, category, and relation |
| --- | --- | --- |
| Caramel bits | **Hold; add no active reference or ledger identity.** | Do not assign a canonical fr-CA name. `Caramel bits` is attested for one U.S. Kraft product only. No aliases, form, measure, mapping, package yield, recipe link, or substitution. Do not merge with `ingredient-ref-butterscotch-chips`, toffee bits, wrapped caramels, or caramel sauce. |
| Toffee bits | **Hold a generic identity; add no active reference or ledger identity.** | Do not assign a generic fr-CA name. `Caramel anglais` is the OQLF base-confection term; `pépites de caramel SKOR` is attested only for the branded Canadian SKOR product. `Brisures de caramel anglais` remains an unaccepted descriptive construction. No aliases, form, measure, mapping, package yield, recipe link, or substitution. Do not merge with caramel bits, butterscotch chips, SKOR/HEATH bars, or chopped candy bars. |

No category is assigned to either held candidate. The earlier coordinator packet mentioned `CHOCOLATE_AND_CANDY` as a possible future category, but there is no accepted generic identity to classify in this packet.

## Measurements and substitutions

The recipe corpus contains no target ingredient line. KRAFT’s `1 Tbsp (12 g)` declaration is a serving for that U.S. product; Hershey recipe quantities are for the named SKOR item. None is a generic density, conversion, or package-yield rule. Add no measurement or substitution data. There is no source-supported equivalence between caramel bits, toffee bits, butterscotch chips, wrapped caramels, sauces, or candy bars.

## Sources and access notes

Sources were accessed on 2026-10-10. OQLF is the Québec terminology authority; manufacturer and retailer/product pages support only the named product and locale.

| Source ID | Source and supported evidence | Limit |
| --- | --- | --- |
| WP02-CARAMEL-TOFFEE-20261010-S01 | OQLF, [caramel anglais (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351198/caramel-anglais). Preferred fr-CA term for toffee; definition describes a hard confection often sold as a bar. | Does not define bits or a baking-inclusion name. |
| WP02-CARAMEL-TOFFEE-20261010-S02 | Hershey Canada, [HERSHEY’S CHIPITS SKOR Toffee Bits](https://www.hersheyland.ca/en_ca/products/hersheys-chipits-skor-toffee-bits-200-g-bag.html). Confirms the Canadian brand product name and baking use; product description refers to SKOR candy bar flavour. | No full ingredient declaration or generic product standard in the accessible page text. |
| WP02-CARAMEL-TOFFEE-20261010-S03 | Hershey Canada, [Le sucré-salé](https://www.hersheyland.ca/fr_ca/recettes/le-sucre-sale.html). Indexed fr-CA manufacturer wording distinguishes `pépites de caramel HERSHEY’S CHIPITS SKOR` from `brisures de caramel au beurre HERSHEY’S CHIPITS` in one recipe. | Direct retrieval returned HTTP 406; search-indexed page text was reviewed. Branded recipe wording is not a generic terminology ruling. |
| WP02-CARAMEL-TOFFEE-20261010-S04 | Kraft Heinz, [KRAFT Caramel Bits](https://www.kraftheinz.com/kraft-caramels/products/00070346000026-america-s-classic-unwrapped-candy-caramel-bits-for-easy-melting). Product description, formula, intended melting/baking use, U.S. English locale, and branded serving. | U.S.-only product evidence; no Canadian French term or generic cross-brand composition. |
| WP02-CARAMEL-TOFFEE-20261010-S05 | Hershey, [ingredient and allergy information](https://www.hersheyland.ca/content/dam/hershey-chocolate-world/documents/cyocb-ingredients.pdf), page 2. The toffee-bits ingredient line names HEATH TOFFEE BITS. | Not a SKOR product specification. Do not apply HEATH ingredients to SKOR or generic toffee bits. |
| WP02-CARAMEL-TOFFEE-20261010-S06 | OQLF, [caramel écossais (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298425/caramel-ecossais). Preferred fr-CA term for butterscotch; discourages generic `caramel au beurre`. | Base-term evidence for the adjacent active butterscotch identity only; not a name for caramel bits or toffee bits. |
| WP02-CARAMEL-TOFFEE-20261010-S07 | Hershey Canada, [CHIPITS Butterscotch Chips](https://www.hersheyland.ca/en_ca/products/hersheys-chipits-butterscotch-chips-270-g-bag.html). Search-indexed manufacturer result confirms the adjacent English product identity. | Direct retrieval returned HTTP 406; the product title was verified in search results. No generic formula or French name; the existing ledger already records this source for `ingredient-ref-butterscotch-chips`. |

## Evidence gaps and merge-ready outline

- No Canadian manufacturer specification was found for generic caramel bits, and the available Kraft page is U.S. English only. A Canadian French label or authoritative term remains unresolved.
- No manufacturer breadth check establishes that products sold as toffee bits share one composition or product form. Obtain a SKOR ingredient declaration before claiming its composition; do not reuse the HEATH line.
- No Québec-authoritative source names generic toffee bits. OQLF’s `caramel anglais` is the base-confection term only; the manufacturer’s `pépites de caramel SKOR` remains brand-specific.
- The bundled library has no direct recipe demand for either identity and no measurements or substitutions to implement.

1. Keep the current active `ingredient-ref-butterscotch-chips` record separate; preserve its verified identity, current names, no-alias state, and source/measurement ledger state.
2. Add no reference, alias, form, density, unit mapping, package yield, recipe link, or substitution for caramel bits or toffee bits from this packet.
3. Keep the current checklist row open and do not mark the wider Section D complete. Revisit only after generic product breadth and Québec French naming are supported by source-backed evidence; record the HEATH/SKOR distinction if the ingredient-spec PDF is cited again.
