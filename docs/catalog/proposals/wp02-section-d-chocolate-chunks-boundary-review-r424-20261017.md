# WP02 Section D proposal: packaged chocolate chunks versus chips and preparation pieces (R424)

**Date:** 2026-10-17
**Status:** Proposal-only; root review required before any integration
**Disposition:** **Hold** a generic chocolate-chunks identity or form in this pass.

## Scope and recommendation

The open Section D checklist asks for continued review of chocolate bars, chunks, wafers, fèves, grated/chopped chocolate, and other product forms. This packet reviews only one boundary: **marketed chocolate chunks as a product shape**, versus the existing chocolate-chip forms and line-level chopped/piece preparation. It does not reopen bars, wafers, fèves, chocolate shavings, chocolate composition classes, or chocolate/compound-coating identity.

Canadian product sources confirm that “chocolate chunks” are sold as distinct shapes and baking inclusions. They do not establish a separate chocolate ingredient identity: the chunk examples remain milk, semi-sweet, white, or other chocolate products. The recipe corpus does not request a chunk product on any ingredient row. Its only exact French prose phrase, “morceaux de chocolat blanc,” occurs in instructions for a line explicitly named “white chocolate chips.” Since *morceau* is also generic wording for a piece, it cannot distinguish a chunk product from chips in that context.

**Recommendation:** Keep chocolate chunks held as an unmodeled presentation form until a recipe ingredient row explicitly requests them or a specific reusable picker need is accepted. Do not create a new reference, add a `chunks` form to one or all chocolate references, attach `morceaux de chocolat` as an alias, relink a recipe, or add measurements or substitutions. Preserve the existing chip forms and line-level preparation values.

### Exact proposed data delta

| Data | R424 delta |
|---|---|
| Ingredient references / identities | None; 0 rows |
| Aliases | None; 0 terms |
| Ingredient forms | None; 0 forms |
| Recipe links or text | None; 0 edits |
| Research-ledger records | None; 0 records |
| Density, unit mappings, or package yields | None |
| Global or contextual substitutions | None |

This is a bounded hold, not a finding that chunks and chips are the same product. The manufacturer evidence distinguishes their physical shapes. The hold means that the current bundle does not establish demand or a globally safe bilingual form phrase for chunks.

## Evidence and identity boundary

The OQLF GDT entry for **pépite de chocolat** defines it as a small piece used mainly in cookies or cakes. It notes the usual small-drop shape, lists dark, milk, and white chocolate as possible bases, and explains that lower cocoa-butter content helps the pieces keep their shape during baking. Its preferred French terms include *pépite de chocolat*, *brisure de chocolat*, and *grain de chocolat*. This supports the existing chips boundary; it does not define a larger chunk class or establish that every product sold as a chunk has the same composition or bake behavior. [S01]

Callebaut’s current Canadian Van Leer listings show separate product names and shape metadata: a semi-sweet chocolate chunk item is labelled with regular pieces in its fr-CA catalog, while the English-Canadian milk chunk product is an “Irregular Chunk” 600-count item in a 30 lb box. The Canadian bilingual Tootsi catalog separately lists “White chocolate chunks / Morceaux de chocolat blanc” (item 10940, 26.5 lb / 12 kg) and chocolate wafers under distinct names. These are solid product examples, but their shape, chocolate type, count, package, and end use are product-specific. The Tootsi catalog and Callebaut product family do not define a universal chunk size or formulation. [S02–S04]

French *morceaux de chocolat* is not a reliable global chunk alias. Recipe 069 uses “morceaux de chocolat blanc” in its French instructions while the matching ingredient row explicitly requests white chocolate chips. Metro’s Québec-market listing likewise calls a Hershey’s CHIPITS baking-chip product *morceaux de chocolat noir 70 %* in the title/description and also calls it *brisures de cuisson*. This wording can describe the pieces broadly, not only chunk-shaped products. OQLF’s chip entry and these current Canadian product uses therefore support leaving the unqualified phrase out of a chunk alias set. [S01, S05]

CFIA’s confectionery/chocolate labelling guidance ties standardized common names such as *milk chocolate*, *semi-sweet chocolate*, and *dark chocolate* to the relevant chocolate composition standards. It does not establish “chunk” as a separate standardized chocolate identity or a composition class. Treating chunks as a presentation of an identified chocolate type, rather than a new ingredient identity, is an inference from those standards and the manufacturer shape listings. [S06]

## Current ownership, picker, and collision audit

At the audit snapshot, the live package has **1,723 ingredient references**, **141 forms**, **56 legacy candidates**, and **2,082 research-ledger records**. Exact normalized phrase ownership was checked across active bilingual reference names/aliases, form labels/match terms, legacy candidate names/aliases, ledger text, and used reference IDs. No exact owner or ledger occurrence was found for `chocolate chunk`, `chocolate chunks`, `chunks of chocolate`, `morceau(x) de chocolat`, or `chocolat en morceaux`. No proposed reference ID is being reserved.

The relevant active references are the existing chocolate-type identities, including `ingredient-ref-semisweet-chocolate`, `ingredient-ref-white-chocolate`, `ingredient-ref-dark-chocolate`, `ingredient-ref-milk-chocolate`, and `ingredient-ref-bittersweet-chocolate`, plus the separate `ingredient-ref-chocolate-shavings` identity. Their existing chip aliases/forms include the semisweet, white, dark, and milk chocolate chip forms; semisweet and white also have melted forms. The forms have no chunk sibling. The shared semisweet chip form already owns general chip phrases such as `chocolate chips`, `pépites de chocolat`, and `brisures de chocolat`; the other base rows own their chocolate-type-qualified chip wording. Keep these aliases on the established chips path, not on a new chunks form.

The app’s shared search normalizer lowercases, folds accents/ligatures, normalizes punctuation, prefers complete word phrases, then falls back to partial matching. Replaying that behavior against the current reference/form snapshot gives:

| Query | Current picker result | R424 consequence |
|---|---|---|
| `chocolate chunks`, `chunks`, `morceaux de chocolat`, `chocolat en morceaux` | No result | There is no current exact chunk-form owner. No alias is needed to prevent a duplicate. |
| `chocolate chips`, `pépites de chocolat` | Five chocolate base references via existing chip wording/forms | Preserve the chip search behavior. Do not redirect chip phrases to a chunk form. |
| `chocolate`, `chocolat` | Eleven references, including two chocolate-flavour cereal references | Avoid adding bare `chocolate`/`chocolat` aliases or making an unqualified chunk parent that further broadens the picker. |

The existing identity categories should remain explicit if a later recipe demands chunks: the evidence supports chocolate-specific product shapes, not a separate universal `CHOCOLATE_AND_CANDY` ingredient called “chunks.” No aliases are proposed now, including `morceaux de chocolat blanc`, `morceaux de chocolat`, `gros morceaux de chocolat`, or `chunk chocolate`.

## Complete bundled recipe corpus scan

The package manifest currently lists **114 recipe files with 1,123 ingredient rows**. Every manifest-listed recipe JSON was scanned across all string fields, including bilingual ingredient text, instructions, notes, descriptions, and preparation fields, for `chocolate chunk(s)`, `chunks of chocolate`, `morceaux de chocolat`, `chocolat en morceaux`, and their close word-order variants. The scan found **one French instruction occurrence and zero ingredient-row occurrences** for the candidate wording; it found no English `chocolate chunk(s)` ingredient line.

The one occurrence is recipe **069, Double Chocolate Muffins**, French instruction “Incorporer les morceaux de chocolat blanc” (“Fold in the white chocolate pieces”). Its corresponding ingredient row is `069#9`, **“1 cup white chocolate chips,”** linked to `ingredient-ref-white-chocolate` and `ingredient-form-white-chocolate-chips`, with `preparation.en: chips` and `preparation.fr: en pépites`. Retain that row and form unchanged. The instruction is not evidence that the recipe asks the user to buy packaged chunks; OQLF’s definition allows a chip to be described generically as a small piece. [S01, corpus]

For completeness, the scan found 63 ingredient rows whose ingredient text names chocolate/cocoa. Of these, 9 explicitly name chips/brisures, 10 mark chopping as line preparation, and 2 request chocolate shavings; none requests a chocolate chunk product. These results agree with the previous Section D confectionery/fruit sweep, which retained chips/melted/shavings coverage but held bars, chunks, wafers, fèves, and grated/chopped forms for lack of purchasable-form recipe demand. No recipe or corpus edit is recommended here.

## Measures, package evidence, and substitutions

The live chocolate-type references have `defaultDensity: null` and empty `unitMappings`; the relevant chip and melted forms have null form densities. The two global substitution-rule files currently contain zero rules each. The single live package-yield record belongs to canned black beans, not chocolate. No chunk-specific measurement, density, cup conversion, package yield, or substitution is recorded in the ledger.

The Callebaut 600-count/30 lb package and Tootsi 26.5 lb / 12 kg listing are source-specific package facts. They are not cup-to-mass data, a default chunk size, a reusable package-yield conversion, or evidence that the recipe’s existing cup of chips can be replaced by the same volume of chunks. No chunk-to-chip, chocolate-type-to-type, or chocolate-to-compound-coating substitution is supported. Keep recipe 069’s authored 1 cup chip quantity intact and do not infer a conversion from the manufacturer count or bulk pack.

## Evidence gaps and follow-up trigger

- No bundled ingredient row asks for chocolate chunks; the one French prose phrase is explicitly paired with a chips row.
- OQLF supplies authoritative Québec terminology for chips but this pass found no OQLF entry defining a general “chocolate chunk” product shape.
- The manufacturer pages show multiple shapes/types and both regular/irregular chunks, but do not give one class-wide size, composition, temperature stability, density, or cup measure.
- Commercial French product wording is not consistent enough to promote bare *morceaux de chocolat* as a picker alias: it is used for chunk products and for a retailer-listed chips product.
- The candidate was checked against the complete current corpus and live package, but this is not a full Canadian product-market or independent Québec linguistic review.

Reopen only when an exact ingredient row or a concrete picker requirement names chunks. At that point, attach a chunk presentation form only to the relevant chocolate-type reference(s), preserve the product/type qualifier, validate a Québec French phrase against a suitable source, and keep all numeric and substitution behavior empty unless separate evidence establishes it.

## Sources

Sources accessed 2026-10-17. Source IDs use a packet-local prefix; no candidate-specific source IDs are added to the shared ledger in this proposal-only review.

| ID | Source and evidence used | Limit |
|---|---|---|
| `WP02-D-CHOC-CHUNKS-R424-20261017-S01` | Office québécois de la langue française, [*pépite de chocolat* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9898216/pepite-de-chocolat) | Authoritative Québec definition and preferred synonyms for chocolate chips; does not define chunks. |
| `WP02-D-CHOC-CHUNKS-R424-20261017-S02` | Callebaut / Van Leer, [Semi-Sweet Chocolate Chunks, fr-CA product listing](https://www.callebaut.com/fr-CA/products/van-leer/Semi-Sweet%20Chocolate%20Chunks/CHD-CU-6022602-046) | Official Canadian product entry; English product name with French shape label *Morceaux réguliers*. Product-specific terminology and shape only. |
| `WP02-D-CHOC-CHUNKS-R424-20261017-S03` | Callebaut / Van Leer, [Ultimate Milk Chocolate Chunks, 600ct, en-CA product listing](https://www.callebaut.com/en-CA/products/van-leer/ultimate-milk-chocolate-chunks-600ct/CHM-CI-0001602-016) | Official Canadian product page describes irregular chunks and a 30 lb package; package and shape are SKU-specific. |
| `WP02-D-CHOC-CHUNKS-R424-20261017-S04` | Tootsi Impex, [Canada catalog PDF](https://www.tootsi.com/forms/TOOTSI_CATALOG_CANADA.pdf) | Canadian bilingual distributor catalog lists White chocolate chunks / *Morceaux de chocolat blanc*, item 10940, 26.5 lb / 12 kg; the listing establishes one product label and pack only. |
| `WP02-D-CHOC-CHUNKS-R424-20261017-S05` | Metro Canada, [Hershey’s CHIPITS 70% chocolate pieces product listing](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/chocolat-et-cacao/morceaux-de-chocolat-noir-70/p/056600902565) | Québec French-market retailer uses *morceaux de chocolat* for a CHIPITS baking-chip listing and also says *brisures de cuisson*; product listing is not a terminology authority. |
| `WP02-D-CHOC-CHUNKS-R424-20261017-S06` | Canadian Food Inspection Agency, [Labelling requirements for confectionery, chocolate and snack food products](https://inspection.canada.ca/en/food-labels/labelling/industry/confectionery-chocolate-and-snacks) (modified 2025-01-15) | Government guidance ties standardized chocolate common names to compositional standards and distinguishes chocolate from compound coating; it does not establish a “chunk” identity or chunk form. |

No software tests, build, emulator, or deployment were run. This is a proposal-only data review and does not edit bundled database data.
