# WP02 B2 sweet-potato-starch French alias review

- **Reviewed:** 2026-10-12.
- **Status:** Accepted and integrated on 2026-10-12. Added one French alias and four source entries; no identity, recipe, numeric, form, conversion, or substitution behavior changed.
- **Scope:** Whether the Canadian French ingredient wording `amidon de patate douce` should resolve to the existing extracted-starch reference. This is one exact alias review, not a new identity or a review of sweet-potato starch noodles.
- **Source-ID prefix:** `WP02-B2-SWEETPOTATO-STARCH-ALIAS-20261012`; checked against the current research ledger and proposal directory before drafting, with no collision found.

## Recommendation

**Accept only `amidon de patate douce` as a French search alias** on `ingredient-ref-sweet-potato-starch`. Keep the canonical bilingual display `sweet potato starch / fécule de patate douce`, category `FLOUR_AND_STARCH`, and identity unchanged.

The OQLF’s current Grand dictionnaire terminologique (GDT) entry defines `fécule de patate douce` as starch extracted by a wet process from *Ipomoea batatas* tuberous roots and gives the exact English equivalent `sweet potato starch`. OQLF’s current `amidon` entry calls `amidon` the preferred general term and says `fécule` is the more precise term for starch in tubers or other underground organs. A current Walmart Canada French ingredient declaration uses the exact phrase `Amidon de Patate Douce` for a sweet-potato-starch vermicelli product. Together these support that one product-wording alias while preserving the more precise OQLF display. [S01–S03]

This is a search alias supported by a Canadian ingredient declaration, not an OQLF-listed preferred compound term. Do not change the display to `amidon de patate douce`, add the unsupported plural `amidon de patates douces`, or use `amidon` as a broad alias. Keep sweet-potato root, whole-root flour, and starch noodles as separate identities. Add no forms, numeric behavior, recipe links, conversions, yields, or substitutions.

| Phrase or row | Disposition | Reason and limit |
|---|---|---|
| `sweet potato starch` / `fécule de patate douce` | Keep as the canonical displays on `ingredient-ref-sweet-potato-starch`. | Exact OQLF bilingual term pair and extraction definition. [S01] |
| `amidon de patate douce` | **Accept as one French alias** on `ingredient-ref-sweet-potato-starch`. | Exact Canadian French ingredient wording; OQLF describes `amidon` as the preferred general term while reserving `fécule` as more precise for underground plant organs. [S02–S03] |
| `amidon de patates douces` | Keep unassigned. | No exact authoritative or product label reviewed for the plural phrase. |
| `patate douce` / `sweet potato` | Keep on the whole-root vegetable reference. | Do not map the root name to extracted starch. |
| `farine de patate douce` / `sweet potato flour` | Keep on the distinct whole-root flour reference. | The reviewed starch is wet-extracted, not whole-root flour. [S01, S04] |
| `sweet potato starch noodles`, `nouilles à base de fécule de patate douce`, `vermicelles de patate douce` | Keep on the prepared-noodle reference. | Finished noodles are not the dry starch ingredient; no merge or noodle alias change is proposed. The existing noodle identity review and sources are recorded in `docs/catalog/proposals/wp03-sweet-potato-starch-noodles-gap-review-20261011.md`. |

## Live catalog, forms, legacy, and ledger audit

Read-only review snapshot taken before the separate coarse-sugar integration on 2026-10-12. The alias was integrated afterward; the current package hashes are in `docs/catalog/batches/wp02-b2-sweet-potato-starch-alias-integration-20261012/README.md`.

| Surface | Current count / state | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,255 rows | `d05f2d2ef59a9862ab5cbe69501e857f5ee7dfe0747e88284447b64d1e1fdcf8` |
| Ingredient forms | 94 rows | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy import candidates | 66 rows | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| Research ledger | 1,564 records / 5,472 source entries / 4,510 distinct source IDs | `fefdb8d64fd00372f35fbcb29b79211221b7f439d280233ac5af05be94b1b157` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

At the review snapshot, `ingredient-ref-sweet-potato-starch` displayed `sweet potato starch / fécule de patate douce`, had empty alias arrays, `defaultDensity: null`, `unitMappings: []`, and category `FLOUR_AND_STARCH`. Its ledger record was `identityState: verified`; measurement and substitution research were `not_yet_researched`. It cited `WP02-RSG-20261010-S04` and `S05` and accepted the extracted-starch identity. No separate alias candidate or legacy row existed for `amidon de patate douce`.

Exact normalized phrase ownership was checked across active reference displays and aliases, form labels and match terms, legacy names and aliases, and ledger record fields:

| Exact phrase | Review-snapshot owner | Proposed boundary |
|---|---|---|
| `amidon de patate douce` | None in the active catalog, forms, legacy candidates, or ledger. | Add only as French alias to the existing extracted-starch reference. |
| `amidon de patates douces` | None. | Keep unassigned; the reviewed evidence supports only the singular. |
| `sweet potato starch` / `fécule de patate douce` | `ingredient-ref-sweet-potato-starch` display fields. | Preserve the canonical bilingual display. |
| `sweet potato` / `patate douce` | `ingredient-ref-sweet-potato` display fields. | Whole root only. |
| `sweet potato flour` / `farine de patate douce` | `ingredient-ref-sweet-potato-flour` display fields. | Whole-root flour only. |
| `sweet potato starch noodles` / `nouilles à base de fécule de patate douce` | `ingredient-ref-sweet-potato-starch-noodles` display fields. | Prepared noodle only. |

No ingredient form is attached to the starch or its neighboring root/flour/noodle references, and no form label or match term exactly owns the proposed alias. The search phrase appears in the prior WP03 sweet-potato-starch-noodles proposal as a product ingredient declaration; that packet handles the finished noodle identity and does not assign the phrase to the starch reference. The ledger contains no exact `amidon de patate douce` term or alias decision. This proposal is therefore a distinct lookup-name decision, not a duplicate noodle identity proposal.

The app normalizes case, accents, and punctuation, prefers complete word-phrase matches, and then falls back to partial matches. At the review snapshot, `amidon de patate douce` had no result; the accepted alias now makes that exact French query resolve to the existing starch row. The phrase does not appear in the distinct noodle display, and no root or flour phrase is assigned as a starch alias. Queries such as `fécule de patate douce` and `sweet potato starch` may also return the qualified noodle row because those phrases occur inside its display name; that substring relationship does not merge the ingredient and prepared product.

## Bundled recipe demand

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for `amidon de patate douce`, `amidon de patates douces`, `sweet potato starch`, `fécule de patate douce`, sweet-potato flour phrases, and the finished-noodle names. There were **zero direct ingredient-line or recipe-text matches** for the starch identity or proposed alias and **zero ingredient lines linked** to `ingredient-ref-sweet-potato-starch` or `ingredient-ref-sweet-potato-starch-noodles`.

Two recipe lines mention whole sweet potatoes: Recipe 090 has `2 small sweet potatoes, peeled and diced`, and Recipe 105 has `1 sweet potato`; both are linked to `ingredient-ref-sweet-potato`. They do not support a starch link, alias demand, quantity, form, or substitution. At this proposal's review snapshot, the manifest-ordered corpus contained 114 files / 1,123 ingredient rows / 753,736 bytes with fingerprint `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3`. The later coarse-sugar recipe link changed the corpus fingerprint; its unchanged sweet-potato audit is recorded in the batch README.

## Forms, measures, and substitution limits

- Preserve the active row’s null density and empty unit mappings. Its ledger measurement and substitution research states remain `not_yet_researched`.
- Add no form or form conversion. The dry starch reference does not establish a separate recipe preparation state.
- The Walmart 400 g value is the package size of finished vermicelli, not a starch measure. Haisue’s 500 g value likewise belongs to finished noodles, and its ingredient panel lists several ingredients. Neither supports starch density, mass-per-volume conversion, or yield. [S03–S04]
- Add no flour replacement ratio, noodle-to-starch conversion, or ingredient-to-ingredient substitution. The sources reviewed identify a material and a finished product; they do not provide a recipe-safe conversion or general substitution behavior.

## Source register

All pages were accessed on 2026-10-12. These source IDs are now appended to the existing starch record in the live ledger.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2-SWEETPOTATO-STARCH-ALIAS-20261012-S01** | Office québécois de la langue française, [*fécule de patate douce* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287217/fecule-de-patate-douce). Defines the product as starch obtained by wet extraction from tuberous roots of *Ipomoea batatas* and gives English `sweet potato starch`. The entry attributes its terminology to AFNOR (1979). | Authoritative Québec-hosted bilingual term and identity evidence; it does not list `amidon de patate douce` as an exact synonym. |
| **WP02-B2-SWEETPOTATO-STARCH-ALIAS-20261012-S02** | OQLF, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), last updated 2026. Identifies `amidon` as the preferred general term and explains that `fécule` is more precise for starch in tubers or other underground organs. | General terminology distinction; it does not itself approve the exact compound `amidon de patate douce`. |
| **WP02-B2-SWEETPOTATO-STARCH-ALIAS-20261012-S03** | Walmart Canada, [SunGiven Vermicelles de Patates Douces](https://www.walmart.ca/fr/ip/SunGiven-Vermicelles-de-Patates-Douces/10283597). French product page lists `INGRÉDIENTS: Amidon de Patate Douce` and a 400 g finished-noodle package. | Retailer ingredient text, not an isolated starch package or terminology ruling; Walmart says supplier and third-party product information is not independently verified, and the listing was out of stock at access. |
| **WP02-B2-SWEETPOTATO-STARCH-ALIAS-20261012-S04** | Haisue, [Daesang Sweet Potato Glass Noodle 500g](https://haisue.ca/products/daesang-sweet-potato-glass-noodle-500g), Toronto retailer listing. The English listing describes noodles made from sweet potato starch; its ingredient panel lists sweet potato starch plus sodium alginate, chitosan oligosaccharide, and malic acid. | Canadian English product evidence for the base term; it is a finished noodle listing and not a pure-starch package or measure. The page showed backordered status at access. |

## Integration delta

1. Appended only `amidon de patate douce` to `aliasesFr` for `ingredient-ref-sweet-potato-starch`.
2. Appended S01–S04 to the existing starch ledger record with the alias decision; no new identity or candidate record was created.
3. Kept the displays, English aliases, category, null density, empty unit mappings, forms, recipe associations, and substitution rules unchanged.
4. Kept the separate sweet-potato root, whole-root flour, and starch-noodle references unchanged. The recipe corpus was not changed by this alias integration.

The batch README records the post-integration phrase and corpus audit plus static verification. No app tests or emulator checks were needed for this database-JSON-only change under the updated `AGENTS.md` rule.

This proposal resolves one exact Québec/Canadian French search phrase only. The wider WP02 B2/B3 checklist remains open.
