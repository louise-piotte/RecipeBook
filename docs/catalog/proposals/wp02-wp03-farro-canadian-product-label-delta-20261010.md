# WP02/WP03 farro Canadian product-label evidence delta

## Packet record

- **Review date:** 2026-10-10
- **Status:** proposal only; research delta to `wp02-wp03-farro-grain-flour-boundary-20261010.md`
- **Candidate:** `ingredient-ref-farro`, still `needs_clarification` in the live ledger
- **Decision:** retain the hold on bare `farro` as a global identity or alias. New Canadian primary product pages clarify that particular emmer grain and flour products are sold under farro wording, but do not resolve the general species or form boundary.

## Disposition

| Question | Delta finding | Catalog recommendation |
| --- | --- | --- |
| Does a Canadian grain product called farro resolve to emmer? | Yes, for the exact products at The Source Bulk Foods and Arva Flour Mill: their pages identify the product as emmer grain/berries. | Preserve as source-qualified evidence; map only when a source or recipe independently specifies emmer and grain state. Do not add `farro` to the global emmer-grain aliases. |
| Does a Canadian flour product using farro wording resolve to emmer flour? | Yes, for True Grain's sifted emmer flour and Arva's whole emmer flour guide. | Preserve as source-qualified evidence; use the existing emmer-flour identity only when the emmer and flour qualifiers are explicit. Do not add generic `farro` or `farro flour` as an alias. |
| Is bare `farro` a stable Québec French display or synonym for one emmer form? | OQLF accepts *farro* in Québec French for the emmer species, but it does not specify flour or grain product state. Metro Québec currently lists *farro d'épeautre perlé biologique* and identifies the product ingredient as pearled spelt. | Keep `farro` as source wording, with its species and product qualifiers. Add no French alias or display. |
| Is there a generic farro grain/flour product identity to add? | No. Product-level evidence separates into both grain and flour and still conflicts on species scope. | Hold. No new ID, form, alias, measurement, substitution rule, or recipe relink. |

The narrow positive resolution is product-specific: those named Canadian listings may be interpreted as emmer grain or emmer flour according to each listing's explicit emmer and product-state words. This does not establish that every unqualified recipe ingredient `farro` means emmer, or that `farro` alone signals a grain rather than flour.

## Current package and evidence-state audit

The live split package currently contains 879 active ingredient references and 48 forms across 114 manifest-listed recipe files. `ingredient-ref-farro` is absent from active references and forms. The ledger contains 1,124 records and 2,752 source entries; its `ingredient-ref-farro` candidate remains `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. The legacy import file has 77 candidates and no farro/emmer/spelt/einkorn candidate. Relevant active references remain:

| Active ID | English / French display | Existing aliases | Boundary |
| --- | --- | --- | --- |
| `ingredient-ref-emmer-grain` | `emmer wheat` / `blé amidonnier` | none | Emmer grain identity. |
| `ingredient-ref-emmer-flour` | `emmer flour` / `farine d'amidonnier` | none | Emmer flour identity. |
| `ingredient-ref-spelt-flour` | `spelt flour` / `farine d'épeautre` | none | Spelt flour identity. |
| `ingredient-ref-einkorn-flour` | `einkorn flour` / `farine de petit épeautre` | none | Einkorn flour identity. |
| `ingredient-ref-wheat-berries` | `wheat berries` / `grains de blé entiers` | none | General wheat grain term; not a farro synonym. |

The active emmer references have no default density or unit mappings. No farro form exists. The current ledger candidate carries the original unresolved terminology and product-boundary decisions from the prior packet; this review does not change that shared ledger.

## Recipe demand

A current scan of all text in the 114 manifest-listed recipe JSON files and all 1,123 ingredient rows found no farro or related species-term hit. The query set used normalized, accent-folded phrase matching for `farro`, `emmer`, `spelt`, `einkorn`, `épeautre`, `petit épeautre`, `amidonnier`, and `engrain`.

| Scope | Hits | Disposition |
| --- | ---: | --- |
| Recipe files containing any queried farro/species term | 0 of 114 | No recipe currently calls for this identity family. |
| Ingredient rows containing any queried farro/species term | 0 of 1,123 | No line to link or relink. |
| Farro-only file hits / ingredient-line hits | 0 / 0 | No exact farro recipe demand. |

No recipe change is proposed.

## Normalized-key and ID collision audit

I checked the live reference and form labels using `tools/seed_package/bundled_seed_package.py:normalize_search_key`, which folds case and accents and normalizes punctuation and spacing. The audit covered exact keys in English/French canonical names, aliases, form labels, and form match terms; it is not a runtime picker test.

| Candidate exact key | Existing exact-key collision |
| --- | --- |
| `farro`, `farro grain`, `farro grains`, `farro flour` | None |
| `farro en grain`, `farro en grains`, `grains de farro`, `farine de farro` | None |
| `farro d'épeautre perlé` | None |
| Candidate ID `ingredient-ref-farro` | None in active references and forms |
| Existing `emmer wheat`, `emmer flour` | Exact matches only their respective current active references, as expected |

No proposed alias or row should be added from this audit: lack of collision does not establish the intended identity.

## Québec French and product boundary

OQLF's *amidonnier* entry identifies *Triticum dicoccum*, accepts *farro* as a French term in Québec, and gives English translations including *emmer* and *emmer wheat*. That is useful Québec terminology evidence for an emmer sense, but the entry is botanical/food-cereal terminology and does not identify flour, whole berries, pearling, or another processing state [FARRO-DELTA-S05].

The current Metro Québec listing uses the product name *Farro d'épeautre perlé biologique* and shows the ingredient as *épeautre perlé biologique* (pearled spelt) [FARRO-DELTA-S06]. That current retail wording is directly relevant: it demonstrates a Québec product-level farro name for spelt, qualified as pearled grain. This does not make farro a generic synonym for spelt either.

The new Canadian product pages narrow only their own labels:

- The Source Bulk Foods titles a Canada-origin grain-category product *Farro Organic* and lists its ingredient as `Farro Grain (Emmer)` [FARRO-DELTA-S01]. The product's own ingredient statement supports emmer for that product. It does not specify a cooking state or milling specification.
- Arva Flour Mill titles a product *Organic Emmer Wheat Berries* and describes those berries as “also known as farro” [FARRO-DELTA-S02]. This is producer evidence for emmer berries/far-ro wording within that producer's product boundary, not an app-wide emmer alias.
- True Grain's product is explicitly *Organic BC Sifted Emmer Flour*. Its description says “Emmer (or Farro),” defines sifted as bran removed, and lists stone-ground BC sifted emmer flour as the ingredient [FARRO-DELTA-S03]. This resolves the named product as sifted emmer flour, while keeping the flour's milling qualifier explicit.
- Arva's current flour guide calls its *Organic Whole Emmer* flour “farro wheat” milled to 100% whole grain [FARRO-DELTA-S04]. This is a second Canadian mill's source-specific emmer-flour use. The stated 100% is a flour extraction/milling specification in the guide; it is not a grain-to-flour yield or a kitchen measurement conversion.

Together with the existing TERMIUM source, which describes farro across einkorn, emmer, and spelt, and the Metro Québec spelt listing, these sources leave the global hold correct. The new product examples clarify that source-qualified names can be mapped when their species and state are explicit; they do not justify broadening active aliases.

## Measurement and substitution status

**Measurement:** No catalog measurement is supported for generic farro. The current ledger measurement state remains `not_yet_researched`. Package sizes and the retailer's per-100-g sales unit are not volume-to-mass measurements, densities, portions, or cooking yields. Arva's flour specifications (including extraction and moisture figures) describe that flour product; they do not supply recipe cup weights, grain/flour conversions, or dry-to-cooked yield. Add no density, unit mapping, or yield.

**Substitution:** No global farro substitution rule is supported. Arva's flour guide gives product-specific baking advice for its Organic Whole Emmer flour: replace a stated fraction of “wheat” and slightly increase hydration [FARRO-DELTA-S04]. True Grain also says its sifted emmer can replace all-purpose flour but supplies no general ratio [FARRO-DELTA-S03]. These are maker recommendations about particular emmer flours, with differing product specifications and incomplete recipe context; they do not establish a farro identity rule, universal form conversion, or general emmer-to-wheat substitution link. Keep the catalog candidate's substitution research state unchanged and do not create a rule from these statements.

## Integration recommendation and acceptance checks

**Recommendation: integrate this evidence delta into the existing `ingredient-ref-farro` research candidate, while retaining the hold.** Do not create or modify any active catalog identity or form from this packet.

If the coordinator records the sources, retain their scope precisely and pass these checks:

1. Keep `ingredient-ref-farro` unresolved; add no active `farro`, `farro grain`, or `farro flour` identity.
2. Do not add `farro` to emmer, spelt, or einkorn aliases in either language.
3. Treat source-qualified `Farro Grain (Emmer)`, `emmer wheat berries (also known as farro)`, and the named emmer-flour products as evidence for those exact products only. A mapping requires the species and grain/flour state to remain explicit.
4. Preserve existing bilingual displays (`emmer wheat / blé amidonnier` and `emmer flour / farine d'amidonnier`) pending separate Québec terminology review; do not propose `grains de farro` or `farine de farro` as catalog aliases.
5. Keep density, conversions, forms/yields, and substitution data empty for this candidate. If product-specific baking advice is later modeled, retain its maker, product, wheat target, range, and dough-context limits separately.
6. Keep all recipe rows untouched; repeat the exact normalized-key audit if a future proposal adds names or aliases, and test picker behavior separately from source research.

## Remaining farro questions

- The broad species scope remains unresolved between the OQLF's emmer sense and TERMIUM's broader usage across einkorn, emmer, and spelt.
- Bare `farro` still does not encode grain versus flour or a particular processing state.
- Product-specific Québec French wording is evidenced, but the preferred display for future source-qualified emmer grain/flour references has not received independent bilingual review.
- No bundled recipe demand exists. Numeric conversions, cooking yield, and a safe general substitution relationship remain unresearched.
- Future imported recipe text must retain species and product-state qualifiers before the existing emmer grain/flour rows can be used as a mapping target.

## Proposal-local source register

All pages below were reviewed on 2026-10-10. IDs are local to this delta; they do not change source IDs already stored in the shared ledger.

- **FARRO-DELTA-S01 — The Source Bulk Foods Canada, [Farro Organic](https://www.thesourcebulkfoods.ca/shop/grains/wholegrain-farro/).** Product page identifies a Canada-origin grain-category product and states `Farro Grain (Emmer)`. Supports this named retailer product's emmer grain identity; no cooking or milling state beyond the grain product category is specified.
- **FARRO-DELTA-S02 — Arva Flour Mill, Ontario, [Organic Emmer Wheat Berries](https://arvaflourmills.com/products/emmer-wheat-berries).** The producer says its organic emmer wheat berries are “also known as farro.” Supports producer-specific emmer berries wording; not global synonymy.
- **FARRO-DELTA-S03 — True Grain, British Columbia, [Organic BC Sifted Emmer Flour](https://www.truegrain.ca/products/organic-bc-sifted-emmer-flour).** Identifies emmer as “or Farro,” states sifted means bran removed, and gives stone-ground BC sifted emmer flour as the ingredient. Supports this named flour's species and sifted state only.
- **FARRO-DELTA-S04 — Arva Flour Mill, Ontario, [Flour Guide](https://arvaflourmills.com/pages/flour-guide).** Describes Organic Whole Emmer as “farro wheat” milled to 100% whole grain and gives product-specific baking guidance: replace 25–75% of wheat with slight hydration increase. The description resolves this flour product's identity/form; the guidance is not a generic substitution rule. The listed technical specs are flour properties, not recipe measurement conversions.
- **FARRO-DELTA-S05 — Office québécois de la langue française, [amidonnier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier), 2019 entry, accessed 2026-10-10.** Accepts *farro* in Québec French for *amidonnier* and lists *emmer* / *emmer wheat* in English; the scientific names identify the emmer sense. Does not establish a flour/grain product alias.
- **FARRO-DELTA-S06 — Metro Québec, [Farro d'épeautre perlé biologique, Bob's Red Mill](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/quinoa-et-grains-de-specialite/farro-d-epeautre-perle-biologique/p/039978002112).** Product page title uses *farro d'épeautre perlé biologique* and its ingredient section identifies pearled spelt. Current Québec retail wording; product-specific evidence only.
- **FARRO-DELTA-S07 — TERMIUM Plus, [farro, Food Industries entry](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=2&i=&index=enb&lang=fra&sg_kp_wet=215052&srchtxt=EINKORN), previously registered as `WP03-S71` / `FARRO-S02` in the existing evidence packet.** Describes farro across einkorn, emmer, and spelt; used here only to preserve the already documented broad-species conflict, not as a new source finding.

## Coordinator integration result

The hold is retained. Added the four new Canadian product pages to the existing `ingredient-ref-farro` evidence candidate and recorded an unresolved decision. Reused the existing OQLF, TERMIUM, and Metro evidence records instead of duplicating them. The pages confirm only their named products as emmer berries/grain or emmer flour; generic `farro` remains ambiguous across species and product state. No active reference, alias, recipe link, form, measurement, conversion, yield, or substitution changed. The regression test checks the candidate remains unresolved and has no active numeric or substitution data.
