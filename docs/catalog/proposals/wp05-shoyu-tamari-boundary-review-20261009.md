# WP05 Section W proposal — shoyu and tamari identity boundary

**Packet type:** proposal-only research followed by coordinator integration
**Prepared/source access date:** 2026-10-09
**Scope:** the open Section W shoyu/tamari portion only; white soy sauce and other styles are not selected for identity work in this packet.
**Checklist state:** the shoyu/tamari dispositions are integrated; broader Section W remains open.
**Existing related work:** generic soy sauce / `sauce soya`, light soy sauce / `sauce soya claire`, dark soy sauce / `sauce soya foncée`, and tamari already have canonical rows. The older East Asian proposal said not to add `shoyu` without a direct crosswalk and flagged the generic gluten-free tamari aliases for review; this packet supplies the crosswalk and the product-claim review without reopening those completed rows.

## Recommendations

1. **Do not create a separate `shoyu` identity.** MAFF’s Japanese Agricultural Standard is titled *Soy Sauce (Shoyu)* and applies to five separately named soy-sauce types, including tamari. `Shoyu` alone is therefore a broad Japanese name for soy sauce, not a stable style narrower than the existing generic `soy sauce` identity. Add `shoyu` only as an English search alias on existing `ingredient-ref-soy-sauce`; do not map it to tamari or to light/dark soy sauce. No French alias is recommended because OQLF does not list `shoyu` as a Québec French term. [S01, S03, S06]
2. **Retain the existing distinct `ingredient-ref-tamari` identity.** JAS and the Japanese Soy Sauce Information Center name tamari as a type within the Japanese soy-sauce family; OQLF’s preferred Québec French term is *tamari*. Keep both displays `tamari`, category `SAUCE_AND_CONDIMENT`, and no preparation form. Do not merge tamari into generic soy sauce. [S01–S05]
3. **Remove the global aliases `gluten-free tamari` and `tamari sans gluten`.** JAS allows tamari made with soybeans and a small amount of wheat (and/or other grain), while Canadian gluten-free claims must meet the applicable product requirements. Gluten-free is a product claim, not a reliable property of every tamari product. Do not create a separate gluten-free identity from this category name. [S01, S02, S09]
4. **Do not add broad phrase aliases that overlap existing search terms.** Sources use “tamari soy sauce,” “tamari shoyu,” and the Québec retail wording “sauce soya tamari,” but the current picker matches when a stored term contains the user query. Adding these aliases would make generic searches for `soy sauce`, `sauce soya`, or `shoyu` return both broad and specialized records. Keep the canonical EN/fr-CA display `tamari` as the direct query. Do not activate `tamari shoyu`, `tamari soy sauce`, `sauce soya tamari`, `sauce de soja tamari`, or gluten-qualified variants as aliases in this snapshot. [S03, S04, S07]
5. **Keep other Japanese styles and Chinese styles outside this packet.** The sources distinguish koikuchi, usukuchi, saishikomi, and shiro from tamari. This confirms that these styles are not inseparable from tamari; it does not select them for new rows here. Existing Chinese light and dark soy-sauce rows remain distinct and receive no shoyu crosswalk. [S01–S04]

The suggested alias is a name crosswalk, not a claim that every product called shoyu is koikuchi or contains wheat. The Japanese standard’s broad use of *shoyu* takes precedence over narrower but inconsistent commercial usage. The Japanese characters `しょうゆ` and `醤油` are not proposed as active aliases: the repository’s current normalized-key function strips them to an empty key. `shōyu` folds to the same key as `shoyu`, so it would be a duplicate rather than a second alias.

## Proposal-time snapshot

All hashes are SHA-256 of exact file bytes. The recipe aggregate is SHA-256 over each manifest-listed recipe basename sorted lexically, followed by a NUL byte, the exact file bytes, and another NUL byte.

| Input | Count | SHA-256 |
|---|---:|---|
| Canonical ingredient references | 447 | `b5b527cb3d6be40aba99939183b36aece0ff1c8e37d2fe2c63e943e3ee29e577` |
| Canonical ingredient forms | 17 | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| Research ledger | 614 records / 764 source entries | `e32ac1d3c1a6c01f409c30c8b7f50f14cc2218c06e674784609c29243d36457a` |
| Legacy-import candidates | 99 | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Recipe manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `7498b32d956db5a5d60f920da2ac41876db9c787ed132c60deb4f9ac1e121bab` |

The current references are `ingredient-ref-soy-sauce` (`soy sauce` / `sauce soya`, French alias `sauce soja`), `ingredient-ref-light-soy-sauce` (`light soy sauce` / `sauce soya claire`), `ingredient-ref-dark-soy-sauce` (`dark soy sauce` / `sauce soya foncée`), and `ingredient-ref-tamari` (`tamari` / `tamari`). The tamari row currently has `gluten-free tamari` and `tamari sans gluten` aliases, with null density and no unit mappings. The forms file has no shoyu or tamari form.

The ledger has existing `ingredient-ref-soy-sauce` and `ingredient-ref-tamari` records with no sources, identity state `unreviewed`, and measurement state `blocked_pending_evidence`. The two historic soy-sauce↔tamari contextual substitution records have no sources and remain `blocked_pending_evidence`; neither record is active catalog data. No tamari/shoyu legacy candidate was found among the 99 candidates.

## Normalized-key and collision audit

The audit used `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` (case-folding, Unicode NFKD/accent and common-ligature folding, punctuation-to-space normalization, and trimming) across all 447 reference names/aliases, all 17 form labels/match terms, and all 99 legacy-candidate names/aliases.

| Term checked | Normalized key | Current exact owner | Disposition |
|---|---|---|---|
| `soy sauce` / `sauce soya` | `soy sauce` / `sauce soya` | `ingredient-ref-soy-sauce` | Keep existing canonical names. |
| `tamari` | `tamari` | `ingredient-ref-tamari` (both display fields) | Keep as the distinct bilingual display. |
| `shoyu` | `shoyu` | None | No exact collision; proposed English alias to `ingredient-ref-soy-sauce`. |
| `shōyu` | `shoyu` | None as a distinct key | Same normalized key as `shoyu`; do not duplicate. |
| `しょうゆ`, `醤油` | empty key | None | Not usable by the current normalizer; do not activate. |
| `tamari soy sauce` | `tamari soy sauce` | None | Exact key is unused, but do not activate: it contains the generic `soy sauce` query and would broaden picker results. |
| `sauce soya tamari` | `sauce soya tamari` | None | Exact key is unused, but do not activate: it contains the generic `sauce soya` query. |
| `tamari shoyu` | `tamari shoyu` | None | Exact key is unused, but do not activate: it contains the proposed `shoyu` query and would make that query ambiguous. |
| `gluten-free tamari` | `gluten free tamari` | Current English alias on `ingredient-ref-tamari` | Remove as an unscoped product claim. |
| `tamari sans gluten` | `tamari sans gluten` | Current French alias on `ingredient-ref-tamari` | Remove as an unscoped product claim. |
| `Japanese soy sauce`, `koikuchi`, `usukuchi`, `saishikomi`, `shiro soy sauce`, `white soy sauce`, `refermented soy sauce` | respective normalized phrases | None | No row or alias is proposed for these out-of-scope styles. |

There are no exact normalized-key collisions for the proposed `shoyu` alias or for any other proposed new key. The phrase exclusions above are based on runtime substring behavior, not an exact-key collision. No alias is proposed for the shoyu-specific Japanese characters because normalization produces an empty search key.

The same exact-term scan found no matching soy-style form and no tamari/shoyu legacy candidate. Existing source IDs were checked in the full research ledger and all 35 existing proposal files. The proposed source IDs below are unique within this packet and do not collide with any source ID already present in either place. They are proposal-only identifiers; no ledger records were written.

## Recipe-line audit

All 114 manifest-listed recipe files and all 1,123 `ingredients[]` rows were scanned across `originalText`, `ingredientName`, `ingredientRefId`, and recipe text for `shoyu`, its romanization variant, Japanese-script terms, tamari, soy-sauce names, and the listed Japanese style names.

- **One tamari line match:** recipe 066, `Korean Soy-Marinated Jammy Eggs`, ingredient row 6 is `1 cup soy sauce or tamari`; `ingredientName` is `soy sauce` and `ingredientRefId` is `ingredient-ref-soy-sauce`.
- **Two other generic soy-sauce lines:** recipe 085 (`2 1/2 tbsp soy sauce`) and recipe 095 (`1 tbsp soy sauce`); both are linked to `ingredient-ref-soy-sauce`.
- **No shoyu line or separate tamari-only line** appears in the corpus. There are no candidate forms or line IDs to relink.

No recipe relink is recommended. In recipe 066, the source line already preserves both choices while the linked ingredient name and reference identify its lead choice, soy sauce. Relinking that one line to tamari alone would drop the primary choice. The source recipe explicitly presents tamari as an alternative in that marinade and lists one cup for either; this is a recipe-local option, not a general bidirectional substitution rule. Keep the historic global soy-sauce↔tamari ledger rules blocked. If a future recipe-line substitution link is added, scope it to this exact line and retain the product-specific gluten-free condition; do not generalize the amount or claim to all recipes or all tamari.

## Measurements and substitutions are separate evidence dimensions

**Measurement observation:** USDA National Nutrient Database for Standard Reference Release 28 lists NDB 16124, “Soy sauce made from soy (tamari),” as **18.0 g per 1.0 tbsp**. It separately lists NDB 16123, “Soy sauce made from soy and wheat (shoyu),” as **16.0 g per 1.0 tbsp**. These are exact source entries and may be retained as source-specific household-measure observations. The USDA wording for the shoyu row is narrower than the JAS shoyu umbrella, so do not attach 16.0 g to every shoyu/Japanese soy-sauce product. The USDA tamari row says “made from soy”; do not use it to assert the composition of every tamari product, because JAS also permits a small amount of wheat. Neither entry establishes a universal density, a default g/mL value, or an ingredient-unit mapping for all products. No value is activated in this proposal.

**Substitution evidence:** The Kitchn’s Korean soy-marinated eggs recipe says tamari can be used instead of soy sauce to keep that recipe gluten-free and lists `1 cup soy sauce or tamari`. This supports the source’s one-recipe alternative at the stated amount. It does not establish a generic ratio or a general soy-sauce↔tamari rule. A product chosen for a gluten-free result must itself meet the applicable gluten-free claim requirements; `tamari` alone does not guarantee that condition.

## Proposed names and identity treatment

| Record | Recommended English display | Recommended fr-CA display | Alias disposition | Product boundary |
|---|---|---|---|---|
| Existing `ingredient-ref-soy-sauce` | `soy sauce` | `sauce soya` | Add English alias `shoyu`; keep existing French `sauce soja`. Do not add `Japanese soy sauce` or a French `shoyu` alias. | General soy-sauce identity for an unqualified recipe request. `Shoyu` is the Japanese name of the soy-sauce family in the JAS standard, not a separate product style. |
| Existing `ingredient-ref-tamari` | `tamari` | `tamari` | Remove `gluten-free tamari` and `tamari sans gluten`. Do not add the broader phrases `tamari soy sauce`, `tamari shoyu`, `sauce soya tamari`, or `sauce de soja tamari` because they create substring-search overlap with generic soy sauce/shoyu queries. | Retain as a distinct named Japanese soy-sauce type. Do not infer wheat-free/gluten-free status from this identity name. |

The Japanese Soy Sauce Information Center’s French page uses `Tamari shoyu (sauce de soja tamari)`, and a Québec Mayrand product page uses `Sauce soya tamari`. These support the phrases as real product wording, but they are not enabled as aliases for the search-collision reason above. The preferred display remains the concise OQLF term *tamari*.

No form, density default, ingredient unit mapping, package yield, conversion, or global substitution rule is proposed. The USDA observations remain source-scoped to the exact database entries described above; no average across products or cross-style conversion is inferred.

## Source evidence and proposed unique source IDs

| Proposed source ID | Source and claim scope | Limits |
|---|---|---|
| `WP05-W-SHOYU-TAMARI-20261009-S01` | MAFF, [Japanese Agricultural Standard JAS 1703, Soy Sauce (Shoyu)](https://www.maff.go.jp/j/jas/jas_standard/attach/pdf/index-470.pdf), sections 1 and 3.8–3.13. The title equates the standard’s soy-sauce category with shoyu; its scope names koikuchi, usukuchi, tamari, saishikomi, and shiro separately; the tamari definition permits soybeans with a small amount of wheat and other grain. | Product standard and naming scope; not a Québec French dictionary or universal household-measure source. |
| `WP05-W-SHOYU-TAMARI-20261009-S02` | MAFF, [Soy sauce, miso, other seasonings](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/syouyu-miso.html), soy-sauce section and style table. Describes the five styles, tamari’s regional production/use and its soy-plus-small-amount-of-wheat process. | Descriptive summary of Japanese styles and uses; does not provide a substitution ratio or a Canadian product guarantee. |
| `WP05-W-SHOYU-TAMARI-20261009-S03` | Japanese Soy Sauce Information Center, [Types and how to use them (English)](https://www.soysauce.or.jp/en/types-and-how-to-use-them). Lists five JAS types and their distinctions; uses the headings `Koikuchi Shoyu`, `Tamari Shoyu (Tamari)`, and others. | Industry association source for product/style terminology, not a Québec French authority; its `Tamari Shoyu` phrase is not activated as a search alias here. |
| `WP05-W-SHOYU-TAMARI-20261009-S04` | Japanese Soy Sauce Information Center, [Sauce de soja (French)](https://www.soysauce.or.jp/fr). Gives French product names including `Tamari shoyu (sauce de soja tamari)`, and distinguishes the other Japanese styles. | French translation from the industry organization, not specifically fr-CA; supports wording, not Québec preference. |
| `WP05-W-SHOYU-TAMARI-20261009-S05` | OQLF, [Tamari (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17560426/tamari). Preferred term is `tamari`; its definition identifies a concentrated soy sauce used in Japanese cooking. | Terminology record last updated in 1994; supports the Québec French display term, not current composition or gluten status. |
| `WP05-W-SHOYU-TAMARI-20261009-S06` | OQLF, [sauce soya (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095123/sauce-soya). Supports `soy sauce` and the preferred French terms `sauce soya` / `sauce de soya`; records `sauce soja` / `sauce de soja` as terms and discusses clear/dark styles. | Generic soy-sauce term; not an OQLF endorsement of `shoyu` or of a tamari alias. |
| `WP05-W-SHOYU-TAMARI-20261009-S07` | Mayrand, [Sauce soya tamari Kikkoman](https://mayrand.ca/fr/nos-produits/epicerie/condiment/sauce-condiment/sauce-soya-tamari-kikkoman-10302). Québec product title supports the descriptive phrase `sauce soya tamari`. | One named retail product; the 1.89 L package size is not a recipe conversion and the phrase is not activated as a global alias. |
| `WP05-W-SHOYU-TAMARI-20261009-S08` | USDA National Nutrient Database for Standard Reference Release 28, [DHA Food report](https://ods.od.nih.gov/pubs/usdandb/DHA-Food.pdf), p. 151, rows NDB 16124 and 16123. Gives the source-specific 18.0 g / tbsp tamari and 16.0 g / tbsp soy-and-wheat shoyu observations. | Archived generic database foods, not current brand specifications. Do not generalize either measure to all products, and do not interpret the shoyu entry as the complete JAS shoyu category. |
| `WP05-W-SHOYU-TAMARI-20261009-S09` | CFIA, [Allergen-free, gluten-free and cross-contamination statements](https://inspection.canada.ca/en/food-labels/labelling/industry/allergens-and-gluten), gluten-free claims section. A gluten-free representation must meet the Food and Drug Regulations; label/advertising claims must be factual and not misleading. | Regulatory guidance for claims on the actual product; it does not establish that all tamari is or is not gluten-free. |
| `WP05-W-SHOYU-TAMARI-20261009-S10` | The Kitchn, [Korean Soy-Marinated Jammy Eggs](https://www.thekitchn.com/korean-soy-marinated-eggs-recipe-23636937), ingredient list and “Helpful Swaps.” It specifies `1 cup soy sauce or tamari` and says tamari may replace soy sauce to keep this recipe gluten-free. | Supports only this exact recipe’s alternative and listed amount. A gluten-free result still depends on selecting a tamari product with a valid product claim. |

The namespace `WP05-W-SHOYU-TAMARI-20261009-S01` through `...-S10` was checked against all existing source IDs in the 614-record/764-entry ledger and all 35 proposal files present at the collision check. No collision was found. These IDs are reserved only in this review packet and must be rechecked if the coordinator later adds ledger records.

## Review disposition

**Recommend:** retain `tamari` as a distinct existing identity with the OQLF-preferred bilingual display; add only `shoyu` as an English alias to generic soy sauce; remove the two gluten-free aliases from tamari; keep source-specific USDA measure observations separate from defaults; preserve the one recipe’s explicit soy-sauce-or-tamari alternative without relinking it or creating a global substitution rule.

**Do not mark Section W complete.** The other Japanese and Chinese soy-sauce styles remain separate future review work.

## Coordinator integration — 2026-10-09

Accepted `shoyu` as an English alias on the existing generic `ingredient-ref-soy-sauce`; no separate shoyu row or French alias was added. Retained `ingredient-ref-tamari` as a distinct identity and removed the global `gluten-free tamari` / `tamari sans gluten` aliases. USDA shoyu/tamari tablespoon observations and the recipe-specific soy-sauce-or-tamari option remain source-scoped ledger evidence; no default conversion, recipe relink, or global substitution was activated. Other Japanese and Chinese soy-sauce styles remain open under Section W.

The proposal-time audit used 447 references, 17 forms, 614 ledger records, 764 source entries, 99 legacy candidates, and 114 recipes / 1,123 ingredient rows. The integrated snapshot has 453 references, 17 forms, 620 records, 808 source entries, 99 legacy candidates, and 114 recipes / 1,123 rows. Current reference, form, manifest, ledger, and recipe-corpus SHA-256 values and final verification results are recorded in the global checklist and workflow checkpoint.

The proposal research itself changed only this file. The coordinator integration changed canonical references and ledger, generated index, checklist, workflow, roadmap, and relevant unit tests; recipe data was unchanged for this packet.
