# WP04 Section P — preserved fish product-state boundary review

- **Review / source access date:** 2026-10-12.
- **Scope:** smoked, salt-cured, dried, canned, oil-packed, water-packed, and fermented fish or seafood products; current Section P references, forms, ledger, legacy candidates, and bundled recipe demand.
- **Disposition:** Keep the broad preserved-fish checklist open, but hold generic preservation rows, aliases, and forms. Retain the already-reviewed product identities and their separate states. No new catalog identity or recipe link is supported by the current bundle.
- **Worktree change:** this proposal only. No canonical JSON, shared ledger, plan, checklist, roadmap, workflow, or code is changed.

## Recommendation

Preservation and packing terms describe several independent product dimensions. CFIA's current fish-label guidance treats cut/form (for example, fillet, minced, or flaked), packing medium (water, brine, oil, or dry pack), and condition (salted, dried, or smoked) as separate descriptors. The Canadian Food Compositional Standards likewise distinguish prepared fish (which may be canned or cooked) from preserved fish (which may be dried, salted, pickled, cured, or smoked). These labeling and composition categories do not establish that each descriptor belongs as an alias or global form of every species reference. [reused `WP04-DOYS-S04`; S01]

Keep the existing scoped identities for salt cod, stockfish, named dried products, and regional fermented products. Do not add one generic `preserved fish` identity or universal `canned`, `smoked`, `salted`, `dried`, `in oil`, or `in water` forms. Keep the broad Section P row open for later exact product requests. If a future ingredient line names a preserved product, review the named species/product, condition, cut, packing medium, and drained/readiness state together before linking it.

Québec terminology is available for some specific products: OQLF pairs `saumon fumé` with `smoked salmon`, and its `germon` entry says fresh or frozen *Thunnus alalunga* is called `germon`, while canned products from that species may also be labeled `thon blanc`. Current Ocean's Québec-facing product pages further distinguish chunked/whole tuna and tuna in oil/water, including a no-drain presentation; their wording is evidence for those products, not a generic catalog name or species crosswalk. [S02–S05]

## Existing product-state boundaries to retain

| Current identity or candidate | Active bilingual names / aliases | State boundary and recommendation |
|---|---|---|
| `ingredient-ref-salt-cod` | **salt cod / morue salée**; no aliases | Keep salted cod distinct from fresh cod and from stockfish. The existing salt-cod review preserves unresolved regional cures and desalted recipe states; do not infer a universal dry/salt level or conversion. [prior `wp04-salt-cod-stockfish-boundary-review-20261009.md`; reused CFIA source `WP04-SALT-STOCKFISH-S06`] |
| `ingredient-ref-stockfish` | **stockfish / stockfish**; no aliases | Retain the product identity for unsalted-dried fish with multi-species scope. It is not an alias or substitute for salt cod or Atlantic cod. The French loanword remains provisional pending independent Québec review. [prior salt-cod/stockfish review] |
| `ingredient-ref-dried-bonito` | **dried bonito (katsuobushi) / bonito séché (katsuobushi)**; EN aliases `katsuobushi`, `dried bonito flakes`, `bonito flakes`, `katsuobushi flakes`; FR alias `flocons de bonite séchée` | Keep product-qualified dried bonito separate from whole bonito, other dried-fish shavings, mixed fish shavings, and dashi/stock. Do not generalize it to `dried fish` or `fish flakes`. [prior `wp04-katsuobushi-bonito-flakes-review-20261009.md`] |
| `ingredient-ref-bonga-dried-fish-powder` | **Bonga dried fish powder / poudre de poisson Bonga**; no aliases | Keep the named smoked/dried/ground Bonga product narrow. Its display contains the broad phrases “fish powder” and “poudre de poisson,” which may appear in a partial search, but neither phrase is an alias and an unqualified recipe line must not be linked to this specific product. [prior `wp04-section-p-fish-powder-identity-boundary-review-20261011.md`] |
| `ingredient-ref-dried-shrimp`, `ingredient-ref-dried-scallop`, `ingredient-ref-dried-oyster` | **dried shrimp / crevette séchée**; **dried scallop / pétoncle séché**; **dried oyster / huître séchée**; existing plural and product-qualified aliases remain on their respective rows | Keep these species/product families separate from fresh seafood, powders, pastes, stock, and one another. No generic dried-seafood identity or shared dried form is proposed. The oyster French compound remains provisional pending independent Québec review. [prior `wp04-dried-shrimp-scallop-boundary-review-20261009.md` and `wp04-dried-oyster-boundary-review-20261009.md`] |
| `ingredient-ref-european-pilchard`, `ingredient-ref-pacific-sardine` | **European pilchard / sardine européenne**; **Pacific sardine / sardine du Pacifique**; species-qualified aliases only | The sardine identity review explicitly leaves canned, oil-packed, salted, smoked, dried, marinated, and other prepared sardine products open. Do not map any of those products automatically to the unprepared species rows. [prior `wp04-sardine-fish-identity-boundary-review-20261011.md`] |
| `ingredient-ref-fish-sauce` | **fish sauce / sauce de poisson**; active aliases: EN `nuoc mam`, `nuoc nam`, `nam pla`, `patis`; FR `nuoc-mâm`, `nuocmam`, `nuoc nam`, `sauce au poisson`, `nam pla`, `patis` | Keep the liquid condiment in `SAUCE_AND_CONDIMENT`. Recipe uses of fish sauce do not request fish flesh or a preserved-fish form. Keep regional fermented products such as padaek, pla ra, bagoong isda, and prahok as distinct named condiment identities; the unqualified Myanmar `ngapi` candidate remains unresolved. Do not alias fish pastes to liquid sauce. [prior `wp05-fermented-fish-shrimp-condiments-review-20261011.md`, current ledger] |
| `ingredient-ref-anchovy` and `ingredient-ref-anchovy-paste` | **anchovy / anchois**; **anchovy paste / pâte d’anchois** | Keep the family-scoped fish identity separate from the condiment paste. No recipe requests preserved anchovy fillets, anchovies in oil, or a specific anchovy paste product. [prior `wp04-section-p-anchovy-fish-identity-vs-paste-review-20261011.md`] |

The current catalog also retains separate fish-stock, salmon-fillets, tuna, and fish-ball identities. Fish stock is a prepared stock, not preserved fish; the fish-ball identity is a formed product, not a preservation form. Surimi remains an unresolved paste-versus-finished-product candidate. None of these is a reason to create a generic preserved-fish row.

## Exact recipe demand

The audit followed the 114 paths in `manifest.v1.json`, read all 1,123 `ingredients[]` rows, and scanned string fields throughout every recipe JSON for the exact preserved-product terms and their French counterparts. No recipe line or prose requests smoked, salt-cured, dried, canned, oil-packed, water-packed, pickled, or fermented fish flesh/seafood as an ingredient. The only exact preserved-seafood category in recipe lines is the already-linked fish-sauce condiment:

| Recipe row | Exact ingredient line | Existing link | Limit |
|---|---|---|---|
| 077 / 10 | `675 g salmon fillets without skin, cut into cubes` | `ingredient-ref-salmon-fillets-without-skin` | Species is not named. The recipe cooks the salmon into flakes; that instruction does not specify that the incoming ingredient is canned, smoked, or flaked. |
| 111 / 1 | `1 tuna steak` | `ingredient-ref-tuna` | No species or preservation state is named. The recipe's olive oil is a separate cooking/marinade ingredient; it does not request oil-packed tuna. |
| 093 / 6 | `2 tbsp fish sauce` | `ingredient-ref-fish-sauce` | Fermented-fish condiment; not fish meat, fish paste, or a fish-preservation form. |
| 095 / 5 | `1 tbsp fish sauce` | `ingredient-ref-fish-sauce` | Same existing condiment identity; no product-state expansion follows. |
| 066 / 12 | `1 tsp hondashi` | `ingredient-ref-hondashi` | Prepared stock/seasoning base, not a line for preserved fish. |

Recipe 019 asks for jumbo lump crab meat and links to its grade form; recipe 023 asks for calamari. Neither is a preserved product request. No recipe links should be created or changed by this review.

## Product terms, Québec wording, and candidate handling

| Product-state wording | Québec naming evidence | Proposal disposition |
|---|---|---|
| `smoked salmon / saumon fumé` | OQLF's GDT gives this exact preferred term pair. | Do not add a smoked-salmon identity or a `smoked` form on the broad salmon-fillets row without recipe demand. Do not alias `saumon fumé` to `salmon fillets`. [S02] |
| Canned tuna by species, cut, and medium | OQLF says fresh/frozen *T. alalunga* is `germon`; canned products from it may also carry `thon blanc`. Ocean's lists `thon pâle entier dans l’huile` separately from `thon pâle émietté dans l’eau`, with no-drain variants. These are specific product labels. | Do not add generic `canned tuna / thon en conserve` as an alias or form on `tuna / thon`. A future request must preserve the exact species/product name, whole-vs-flaked presentation, and packing medium when stated. [S03–S05] |
| Canned salmon, sardines, shellfish, and other canned products | CFIA recognizes canned fish products and true-nature descriptors; Codex has separate standards for canned salmon, tuna/bonito, sardines, shrimp/prawns, and crabmeat. These standards indicate distinct product scopes, not one universal `canned fish` identity. [S06] | Hold unqualified canned-fish identity and species-wide canned forms. The sardine-specific proposal already holds preserved sardine products; no recipe calls for them. |
| Salted, salted-dried, and stockfish | Federal labeling distinguishes salt/moisture categories; existing Québec display `morue salée` and the multi-species `stockfish` row are already reviewed. [reused `WP04-SALT-STOCKFISH-S06`] | Retain existing product identities. Do not add `dried fish`, `salted fish`, or `unsalted dried fish` as aliases across them, or create a generic salting/drying form. |
| Dried or smoked fish powder / flakes | Existing dried bonito and Bonga powder rows have source-qualified names; katsuobushi's alias does not cover other dried shavings. Bonga's smoke/drying/ground process is specific to the retailer-named Bonga product. | Do not generalize product names to `fish powder`, `dried fish`, `smoked fish`, or `fish flakes`; no generic row or form. |
| Fermented fish products | The catalog has separate condiment names, including `fish sauce / sauce de poisson`, `padaek / sauce padaek`, `pla ra / pla ra (sauce de poisson fermentée)`, `bagoong isda / bagoong isda (pâte de poisson fermentée philippine)`, and `prahok / prahok (pâte de poisson fermentée cambodgienne)`. | Keep the regional names and product types distinct. Do not create a generic fermented-fish paste/sauce alias or map any to fish meat. Keep `ngapi` held because sources divide the unqualified term between fish and shrimp products. [prior fermented-fish review] |
| Oil-packed vs. fish oil | CFIA distinguishes a packing medium such as vegetable oil from extracted fish oil under its separate fish-oil labeling guidance. Ocean's product labels show tuna in edible oil as a packed fish product. [reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S09`; S04–S05] | Never treat `tuna in oil`, `sardines in oil`, or another oil-packed fish phrase as an alias for fish oil or for the unqualified fish identity. No fish-oil identity is proposed here. |

These examples establish usable product-qualified Québec terms but do not identify an ingredient in the bundled recipes. No new display, aliases, active reference ID, or form is proposed. If a later recipe names a specific form, use its source-backed French wording on that product or form; keep any borrowed name provisional when no Québec term has been verified.

## Forms, measurements, and substitutions

Do not add `IngredientForm` records for canned, smoked, salted, dried, oil-packed, water-packed, or fermented states in this batch. The current evidence does not establish one state or medium across the broad species rows, and the bundle has no exact fish ingredient line requiring one. In particular:

- Add no density, unit mapping, piece count, drained-weight conversion, volume mapping, package yield, rehydration yield, or cooked yield.
- Retail package weights, label net/drained weights, regulatory salt/moisture limits, and a product's packing medium are not a kitchen conversion.
- Do not create global substitutions among fresh/frozen fish, canned fish, salted fish, stockfish, smoked fish, dried fish, fish pastes, fermented fish sauces, or oil-packed fish. No bundled recipe provides a method- or dish-scoped replacement.
- Keep the existing salt-cod source-specific measurement evidence confined to its ledger record; it is not a recipe conversion or a value for stockfish, smoked fish, canned fish, or another cure.

## Refreshed snapshot, exact-key audit, and prior-work reconciliation

Snapshot read from the shared worktree on **2026-10-12** before writing this proposal. SHA-256 values cover exact file bytes. The recipe corpus digest follows the stored `recipeFiles` order and hashes each manifest-relative path, NUL, exact recipe bytes, NUL.

| Artifact | Current count | SHA-256 / corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,192 references | `cadcbf8364313c2c8ebe73647082aa66c0648bfad40e8b54528cda451cd48318` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,493 records; 5,009 source entries; 4,086 distinct source IDs | `1cc991e9f32200ea398dee8b029d5d47b9f1df16731d80944b76e31abddbe59f` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |

The exact-key audit mirrored `normalizeIngredientSearchKey` in `IngredientSearch.kt` (lowercase with `Locale.ROOT`, NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, convert non-alphanumeric runs to spaces, then collapse whitespace). It compared candidate state phrases against every active reference name/alias, form label/match term, and legacy candidate name/alias.

- No exact active reference, form, or legacy key matches the unqualified open phrases `smoked fish`, `smoked salmon`, `salted fish`, `dried fish`, `canned fish`, `canned tuna`, `tuna in water`, `tuna in oil`, `canned sardines`, `fermented fish`, `fermented fish paste`, or their reviewed French equivalents. No preservation-related form is attached to a fish reference.
- Expected active exact keys remain owned by their existing rows: salt cod, stockfish, dried shrimp/scallop/oyster, dried bonito, Bonga powder, fish sauce, anchovy paste, and the distinct regional fermented products. The live exact-key audit is not a synonym decision; it confirms those existing owners and no new owner for the open generic phrases.
- The legacy file contains 66 candidates; none has an exact key for the open generic preservation phrases. The ledger contains the accepted state-specific identities described above, the existing unresolved `candidate-ngapi` and `candidate-surimi-product-boundary`, and no generic canned/smoked/oil-/water-packed fish identity. Proposal source IDs `WP04-PFSTATE-20261012-S01` through `S05` and candidate ID `candidate-preserved-fish-product-state` were absent from the ledger and proposal/batch files before this document was created.
- Prior work reviewed for overlap: `wp04-salt-cod-stockfish-boundary-review-20261009.md`, `wp04-dried-shrimp-scallop-boundary-review-20261009.md`, `wp04-dried-oyster-boundary-review-20261009.md`, `wp04-katsuobushi-bonito-flakes-review-20261009.md`, `wp04-section-p-fish-powder-identity-boundary-review-20261011.md`, `wp04-sardine-fish-identity-boundary-review-20261011.md`, both fish-balls/surimi proposals from 2026-10-11, `wp04-section-p-anchovy-fish-identity-vs-paste-review-20261011.md`, and `wp05-fermented-fish-shrimp-condiments-review-20261011.md`. Their scoped decisions are retained; no duplicate row or source record is recommended.

## Source register

All new sources below were accessed on 2026-10-12. Source IDs are unique to this proposal and remain proposal-only; nothing is appended to the shared ledger. Existing source IDs are reused where prior Section P reviews already support the claim.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-PFSTATE-20261012-S01** | CFIA, [Canadian Food Compositional Standards, Volume 18 — Marine and Fresh Water Animal Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | §§18.1.3–18.1.4 distinguish prepared fish (may be canned or cooked) and preserved fish (dried, salted, pickled, cured, or smoked; cooked or uncooked). Standards scope, not a catalog form/conversion rule. |
| **WP04-PFSTATE-20261012-S02** | OQLF GDT, [saumon fumé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497427/saumon-fume) | Preferred Québec term `saumon fumé` with English `smoked salmon`; terminology only, no bundled recipe demand. |
| **WP04-PFSTATE-20261012-S03** | OQLF GDT, [germon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198922/germon) | States that fresh/frozen *Thunnus alalunga* is `germon`; canned product made from this species may also be labeled `thon blanc`. Supports species/product naming caution; no generic tuna mapping. |
| **WP04-PFSTATE-20261012-S04** | Ocean's, [Produits](https://oceans.ca/fr/produits/) | Current French-Canadian product catalogue lists whole and flaked canned tuna, oil-packed variants, water-packed no-drain variants, and smoked oysters in sunflower oil as separate named products. Manufacturer terminology, not an independent standard or recipe demand. |
| **WP04-PFSTATE-20261012-S05** | Ocean's, [Thon pâle entier dans l’huile de tournesol, sans égouttage](https://oceans.ca/fr/products/thon-pale-entier-dans-lhuile-de-tournesol-sans-egouttage/) | Product page identifies its fish as skipjack (*Katsuwonus pelamis*) and lists water and sea salt in the ingredients despite the oil-forward product name; supports a product-specific no-drain presentation, not a general medium conversion or species alias. |

Reused evidence: CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), source IDs `WP04-DOYS-S04` and `WP04-SARDINE-FISH-BOUNDARY-20261011-S09`; CFIA, [Descriptive words, expressions and identification names for specific foods](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/descriptive-words-expressions-and-identification-names-specific-foods), source ID `WP04-SALT-STOCKFISH-S06`; and the product, terminology, and ledger sources cited in the prior Section P proposal files listed above.

## Final disposition

**Hold** any new generic preserved-fish identity, alias, form, measurement, conversion, yield, or substitution. **Retain** the current state-specific rows and prior holds. The exact recipe audit supplies no preserved fish/seafood ingredient request beyond existing fish sauce, and no user-facing recipe line needs a new product state today. The broader Section P item remains open until an exact recipe or requested product establishes the species/product and state it means. This is documentation-only work; no tests or emulator checks were run.
