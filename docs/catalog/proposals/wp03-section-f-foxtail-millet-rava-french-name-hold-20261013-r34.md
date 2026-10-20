# WP03 Section F — foxtail millet rava / thinai rava review (2026-10-13, R34)

## Review record

- **Scope:** one regional preprocessed-grain product: dry, broken foxtail millet sold as *foxtail millet rava* or *thinai rava*.
- **Plan location:** the live Section F catch-all at [line 2395](../../RecipeBook-global-ingredient-catalog-plan.txt#L2488) remains open for regional cereal mixes and preprocessed grains.
- **Status:** proposal-only, bounded hold. No shared catalog, ledger, plan, roadmap, recipe, generated, or application file changed.
- **Recommendation:** retain this as an unallocated candidate. Current official processing evidence and Ontario retailer listings establish a distinct English product candidate. Hold an active bilingual picker row until a Québec French product term is validated. Assign no catalog ID and add no active aliases, forms, measurements, recipe links, conversions, yields, or substitutions.

This is separate from the reviewed finger-millet *ragi rava* (a different species), rice *idli rava*, pearl-millet Sankhal, sorghum semolina/*jowar rava*, and the active foxtail-millet grain and flour rows. It does not revisit the held Fura, Ogi Baba, rice-grits, Puttu-podi, or other cereal-mix boundaries.

## Product identity and bilingual naming

ICAR–Indian Institute of Millets Research (IIMR) describes millet semolina/*rawa* as a ready-to-cook product made by dry milling and explicitly includes foxtail millet among the source grains [S01]. IIMR’s recipe collection also has a foxtail-millet porridge recipe that instructs the cook to coarsely powder foxtail millet as *rava* [S02]. These sources support a real processed-grain candidate, distinct from intact grain and flour.

Two Ontario grocery catalogues list **Foxtail Millet Rava**; the Kitchener retailer also labels it **Thinai Rava** and describes it as a broken form of foxtail millet [S05, S06]. These retailer descriptions establish local English product wording, not a uniform particle grade, ingredient specification, or guaranteed stock level.

| Language field | Evidence and disposition |
|---|---|
| English candidate display | `foxtail millet rava` is used by Ontario retailers and is consistent with IIMR’s foxtail-millet *rawa* documentation. |
| English candidate alias | `thinai rava` is paired directly with the product by an Ontario retailer. Keep it product-qualified; do not add bare `thinai`. |
| Québec French species term | OQLF maps *Setaria italica* to English `foxtail millet` and lists `millet d'Italie` among its preferred French terms [S03]. The active grain row already uses this species name. |
| Québec French product display | **Unresolved.** No Québec-facing source was found for a French name for foxtail millet rava. OQLF’s `semoule` entry defines a wheat-milling product and does not establish `semoule de millet d'Italie` as a Québec product term [S04]. Treat that phrase, and `rava de millet d'Italie`, as unvalidated constructions; do not add either as a display or alias. |

The naming search on 2026-10-13 targeted French product phrases including `semoule de millet d'Italie`, `semoule de millet des oiseaux`, and French-market `rava` wording. No Québec product label or Québec terminology entry for the processed foxtail product was found. This bounded search does not prove that no such wording exists.

## Exact ownership and archive audit

The live active references contain 1,365 rows; the forms file contains 100 rows. The 64 legacy-import candidates and 1,692-record research ledger were checked alongside the proposal and batch archive. The ledger has records for the intact foxtail grain and its flour, but no rava candidate. Exact searches found no active reference, form, legacy candidate, ledger candidate, or prior proposal owning `foxtail millet rava`, `thinai rava`, `navane rava`, or `foxtail millet semolina`; `ingredient-ref-foxtail-millet-rava` is unallocated. The source-ID prefix `WP03-FOXTAIL-RAVA-R34-20261013-` is unused in the live ledger and catalog archive.

| Current owner | Exact live boundary |
|---|---|
| `ingredient-ref-foxtail-millet` | `foxtail millet / millet d'Italie`; English aliases `thinai`, `kangni`, `korra`, `rala`, `navane`; `GRAIN_AND_CEREAL`; no attached forms; `defaultDensity: null`; `unitMappings: []`. This owns the intact grain and species names only. |
| `ingredient-ref-foxtail-millet-flour` | `foxtail millet flour / farine de millet d'Italie`; flour-specific aliases; `FLOUR_AND_STARCH`; no attached rava form. This owns flour only. |
| `ingredient-ref-sorghum-semolina` | `sorghum semolina / semoule de sorgho`; English aliases `jowar rava` and `sorghum rava`; `GRAIN_AND_CEREAL`. It is the current active owner of the bare query `rava`, but not of foxtail millet rava. |
| `ingredient-ref-sankhal` | `sankhal (broken millet semolina) / brisures de mil (sankhal)`, a separately sourced pearl-millet product. It does not own foxtail millet rava. |
| Finger-millet rava review | The earlier [R12 proposal](wp03-section-f-next-cereal-gap-review-20261013-round12-ragi-rava.md) keeps *finger millet rava / ragi rava* ledger-only because its own French product name was unresolved. It concerns *Eleusine coracana*, not foxtail millet (*Setaria italica*). |
| Foxtail-millet regional-name review | The earlier [Navane alias review](wp03-section-f-next-cereal-gap-review-20261013-round14-navane-alias.md) covers `navane` as a name for the intact foxtail grain. It does not create a processed-product identity or a `navane rava` alias. |

Snapshot hashes (exact current file bytes): references `6096d1b78a4d3be393bd38d47f12ba048f147c5df4db5375fab61f4f707043c2`; forms `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63`; legacy candidates `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005`; research ledger `5362be5b923b11925cad1e1d6a7777b4865fa30b72cee4b26555eeb32690ce10`.

## Picker and recipe-corpus effects

This is a static projection of [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which normalizes search terms and prefers complete phrase matches before falling back to partial matches. No active picker data changes in this proposal.

| Query | Current active result | Conditional effect if a bilingual row is approved later with English display `foxtail millet rava` and alias `thinai rava` |
|---|---|---|
| `foxtail millet rava` | No result | New product row only |
| `thinai rava` | No result | New product row only |
| `rava` | `ingredient-ref-sorghum-semolina` only | Sorghum semolina plus foxtail millet rava |
| `foxtail millet` | Foxtail grain and foxtail flour | Adds the rava product as a third choice |
| `thinai` | Foxtail grain and foxtail flour | Adds the rava product as a third choice through `thinai rava` |
| `navane` | Foxtail grain and foxtail flour | Unchanged; no `navane rava` alias is proposed |
| `semolina` | Durum semolina, Sankhal, remilled durum semolina, sorghum semolina | Unchanged; do not add broad `semolina` or `millet semolina` aliases |

If a future French display were approved as `semoule de millet d'Italie`, the normalized `millet d'Italie` query would also include it, and `semoule` would gain another result. That projection is conditional only; the French wording is not approved here.

All 114 manifest-listed recipes and 1,123 ingredient rows were scanned. Exact and related searches for `foxtail millet rava`, `thinai rava`, `navane rava`, `foxtail millet semolina`, `foxtail millet`, `thinai`, `navane`, `millet d'Italie`, `rava`, `ragi rava`, `pearl millet rava`, `sorghum rava`, and `sankhal` found zero matching recipe rows. There are also no bundled recipe references to `ingredient-ref-foxtail-millet` or `ingredient-ref-foxtail-millet-flour`. Thus the bundled corpus supplies no recipe demand. The external IIMR porridge recipe is one source-specific use, not evidence of demand in the bundled library or a transferable recipe-line quantity [S02].

## Forms, measurements, and substitutions

- **Forms:** IIMR lists coarse, medium, and fine millet-semolina grades, with examples named for khichidi, upma, and idli; the process output varies by millet [S01]. The reviewed retailer listings do not identify a standard grade or mesh size. Do not attach a coarse/medium/fine form to this candidate or infer one from `rava`.
- **Package weight:** The FreshOnTheGo listing shows a product-specific 1 kg package [S05]. This package declaration does not establish a serving size, household volume, density, or conversion.
- **Recipe numbers:** The IIMR foxtail porridge recipe starts with ¼ kg of whole foxtail millet before it is coarsely powdered and combined with other ingredients; its later 1-cup-to-5-cups-water instruction applies to the prepared mixture, not plain rava [S02]. Preserve those figures only as facts about that recipe. Do not turn either into a rava measure, density, processing yield, or reusable cooking ratio.
- **Milling yields:** IIMR reports grade-specific milling recovery ranges and says output varies by millet [S01]. Those are processing yields, not recipe quantities or dry-to-cooked yield. Keep all such values inactive.
- **Conversions and substitutions:** Retailer copy positioning millet rava as an alternative to semolina is not a tested replacement ratio. No matching recipe substitution or method-specific evidence was found. Add no global same-grain form conversion, contextual substitution, unit mapping, or yield.

## Source register

All web sources were checked on 2026-10-13. New source IDs use the unique prefix `WP03-FOXTAIL-RAVA-R34-20261013-`.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-FOXTAIL-RAVA-R34-20261013-S01` | ICAR–Indian Institute of Millets Research, [Latest Millet English Full Book (2020)](https://www.millets.res.in/farmer/Latest_Millet_English_Full_Book_2020.pdf), pp. 83–84, “Millets semolina (Rawa/Suji)”. | Calls millet semolina ready-to-cook, includes foxtail among millet grains processed by dry milling, distinguishes coarse/medium/fine grades, and says output varies by millet. General processing evidence; it does not supply a universal foxtail SKU grade, household measure, or recipe conversion. |
| `WP03-FOXTAIL-RAVA-R34-20261013-S02` | ICAR–Indian Institute of Millets Research, [Millets in Daily](https://www.millets.res.in/books/Millets-in-Daily.pdf), “Foxtail Millet Porridge (Navane Payasa)”. | The recipe directs the cook to make coarse rava from foxtail millet. Its ¼ kg grain input and prepared-mixture water ratio belong only to that recipe; they are not a product density or reusable rava measure. |
| `WP03-FOXTAIL-RAVA-R34-20261013-S03` | Office québécois de la langue française, [millet des oiseaux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux). | Identifies *Setaria italica*, English `foxtail millet`, and preferred French terms including `millet d'Italie`. It names the species, not a processed rava product; the entry notes the bird-feed association of `millet des oiseaux`. |
| `WP03-FOXTAIL-RAVA-R34-20261013-S04` | Office québécois de la langue française, [semoule (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8895941/semoule). | Defines semoule in wheat-milling contexts. It does not attest a millet-specific French product term. |
| `WP03-FOXTAIL-RAVA-R34-20261013-S05` | FreshOnTheGo Grocery, [Foxtail Millet Rava 1 Kg](https://www.freshonthegogrocery.ca/products/foxtail-millet-rava-1-kg/10705000009714134), Scarborough, Ontario. | Exact English product title and package descriptor. The product page shows a stale expiry-date field; use as product-name evidence only, not a claim of current stock or a generally valid package weight. |
| `WP03-FOXTAIL-RAVA-R34-20261013-S06` | TastyGrains, [Millets & Millet Products](https://www.tastygrain.ca/collections/millet-items), Kitchener, Ontario; `Foxtail Millet Rava` listing. | The currently indexed seller catalogue pairs `Foxtail Millet Rava` with `Thinai Rava` and describes a finely broken foxtail product. Retailer copy establishes seller wording, not independent grade, French usage, or substitution evidence. |

## Next action

Obtain an independent Québec French terminology review or a Québec-facing French product label for this processed form. If that review validates a product-specific French display, re-audit the `rava`, `thinai`, `foxtail millet`, and French `millet d'Italie` picker effects before proposing an identity-only row with only the source-attested English terms. Until then, keep the candidate out of active ownership and leave all numeric and substitution behavior inactive.

No application or test files were changed; no tests were run for this proposal-only review.
