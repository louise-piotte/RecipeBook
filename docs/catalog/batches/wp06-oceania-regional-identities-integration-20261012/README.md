# WP06 Oceania regional identity integration — 2026-10-12

## Decisions

Integrated a bounded identity-only sample from the three proposal reviews: [baking and desserts](../../proposals/wp06-oceania-baking-dessert-gap-sweep-20261012.md), [pantry and condiments](../../proposals/wp06-oceania-pantry-condiment-gap-sweep-20261012.md), and [animal foods](../../proposals/wp06-oceania-animal-foods-gap-sweep-20261012.md).

Added 13 ingredient references:

- Australian and Māori plant foods: `lemon myrtle / myrte citronné`, `horopito`, `kawakawa`, `quandong`, and the named `rewena starter / culture de rēwena`.
- Australian and regional animal foods: `kangaroo meat / viande de kangourou`, `wallaby meat / viande de wallaby`, `emu meat / viande d’émeu`, `barramundi`, `hoki`, `green-lipped mussel / moule verte`, `New Zealand whitebait / whitebait de Nouvelle-Zélande`, and `narrow-barred Spanish mackerel / thazard rayé indo-pacifique`.

Added source-language search aliases to existing references: `kūmara` on sweet potato and Hawaiian `paʻakai` on salt. Accent-insensitive search covers their unaccented spellings; the stored forms retain the macron and ʻokina. Kept `myrte citronnée` as a technical French search variant for lemon myrtle and `pêche du désert` as a secondary Codex-supported French alias for quandong.

Recorded `candidate-wattleseed` as unresolved. The baking review supports a stable commercial culinary name and use, while the pantry review finds that the source family covers multiple Acacia species and cites an industry proposal to identify species on seed products. No species-free wattleseed reference, generic acacia alias, or seed form was added.

The catalog preserves these boundaries:

- Horopito and kawakawa are distinct leaf seasonings; kawakawa is not kava, and the horopito identity does not include lowland horopito without food-use evidence.
- Kūmara maps to sweet potato at the crop level only; the alias does not merge Māori historical cultivars with later commercial varieties.
- Rewena starter remains distinct from generic sourdough starter, even though it performs a similar leavening role.
- Kangaroo meat and wallaby meat remain separate. Emu meat remains separate from ostrich and poultry.
- Hoki, barramundi, green-lipped mussel, and walu retain their named species boundaries. `Green-lipped mussel` is distinct from the active blue-mussel reference. Bare `Spanish mackerel`, `walu`, and `thazard` are not aliases; a bare Spanish-mackerel query could otherwise return the distinct spotted Spanish mackerel.
- New Zealand whitebait is a regional multi-species product class, not a single-species synonym for smelt. Its French display retains the source term with a geographic qualifier because no Québec food term was verified.
- Hawaiian `paʻakai` aliases plain salt; `paʻakai ʻulaʻula` is a distinct red-salt product and was not added as a synonym or identity.

Mānuka honey remains with the WP02 honey/sweetener owner, karengo/parengo with the WP03 seaweed review, and kokoda as a prepared dish. Other unresolved products and alias holds remain documented in the proposals. The broad Australia, Aotearoa/New Zealand, and Pacific checklist stays open; these bounded samples do not complete regional coverage.

No bundled recipe ingredient line matched the integrated identities or scoped aliases, so no recipe links were added. No forms, ingredient states, measures, densities, unit mappings, conversions, package yields, or substitution rules changed.

## Files and counts

Updated the bundled reference JSON, package manifest hash, research ledger, and generated Kotlin ingredient index. The existing sweet-potato and salt reference/ledger entries were extended. The research ledger now has one unresolved wattleseed candidate entry.

- Ingredient references: 1,214
- Ingredient forms: 86
- Legacy import candidates: 66
- Recipes / ingredient rows: 114 / 1,123
- Research ledger: 1,517 records / 5,119 source entries / 4,182 distinct source IDs

## Evidence

The proposal files contain the bounded audit methods, source-to-claim registers, and remaining misses. Root review confirmed the plant and culinary boundaries against [Te Ara’s Māori foods page](https://teara.govt.nz/en/maori-foods-kai-maori/page-5), [Te Ara’s horopito and kawakawa species page](https://teara.govt.nz/en/shrubs-and-small-trees-of-the-forest/page-12), [University of Queensland’s lemon-myrtle entry](https://life.uq.edu.au/naidoc/bushtucker), and [Te Ara’s kūmara entry](https://teara.govt.nz/en/kumara). The rewena starter culture is documented by [Te Ara](https://teara.govt.nz/en/interactive/40265/making-rewena-bread) and a [Ngāti Tūwharetoa community food resource](https://www.tekotahitangaotuwharetoa.co.nz/i/files/TUKaingaTuwharetoa/Rauemi/TePaporoMomoKai_Part1_RewenaStarterBug.pdf).

Animal-food identities and Québec displays are supported by the cited DAFF, FSANZ, New Zealand MPI, OQLF, CFIA, Fiji fisheries, and Te Ara sources in the animal-food proposal. The salt alias and red-salt distinction are supported by [Hawaiʻi Sea Grant](https://seagrant.soest.hawaii.edu/paakai-hawaiian-salt/) and the [Bishop Museum](https://blog.bishopmuseum.org/culture/pohaku-of-hawaii/).

## Verification

- Bundled package normalization and schema/data validation passed.
- Generated ingredient catalog is current at 1,214 references.
- Root’s normalized exact-key audit found no prior reference, form, legacy candidate, or recipe phrase owner for the proposed identities; a scan of all 114 bundled recipes found no exact phrase hits.
- UTF-8 without BOM and scoped whitespace checks passed.
- No tests or emulator checks were run under the JSON database-data exception in `AGENTS.md`.
