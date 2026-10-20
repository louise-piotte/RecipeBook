# WP04 Section P — mentaiko / seasoned fish roe product-boundary review (round 40)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** proposal-only product identity, Canadian/Québec naming, ownership, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** Hold mentaiko outside active references, forms, and the shared ledger until a bundled recipe identifies the intended product. Add no alias, form, measure, recipe link, conversion, yield, or substitution now.
- **Write scope:** This proposal file only. No shared catalog, ledger, checklist, roadmap, recipe, or code file changed.

## Bounded gap and decision

The live [Section P roe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4377) names roe, tobiko, masago, salmon roe, bottarga, and caviar when recipes call for them. Its completed reviews cover salmon roe, lumpfish roe, sturgeon caviar, tobiko/masago, and bottarga, but none assigns **mentaiko / karashi-mentaiko** an owner or checks its own product and picker boundary. This packet reviews that distinct seasoned-roe product only. It does not reopen those decisions or the separate fish-powder, fish-ball, and surimi reviews.

Japan's Ministry of Agriculture, Forestry and Fisheries (MAFF) distinguishes shio-tarako from karashi-mentaiko: it describes the former as a product made from Alaska-pollock roe and the latter as salted Alaska-pollock roe in liquid seasoning. A separate MAFF food-culture entry calls karashi-mentaiko spicy Alaska-pollack roe and describes salting and marinating it in a red-chili-spiced liquor. This supports a distinct seasoned-roe product boundary and establishes that the Japanese term is not simply another name for unseasoned fish roe. [S01, S02]

Current Canadian product listings do not support mapping every product sold as mentaiko to a single fish species or presentation. Azuma Foods (Canada) lists a paste as “Mentaiko Paste” / “Seasoned Spicy Cod Roe Paste,” with a French label for that SKU. Daily Seafood lists a salted, marinated cod-roe membrane sac. A separate Canadian listing titles its 100 g product “Mentaiko Spicy Cod Roe,” describes it as pollock roe, and lists both walleye pollock and cod in its fish-roe ingredients. These are product-specific listings; they do not establish a universal cod-only or pollock-only composition, or make paste and intact roe sacs one preparation state. [S05–S07]

Use **mentaiko** as the retained product name if a future recipe selects it. Québec's OQLF gives the generic French term **œufs de poisson** for English *fish roe*, but the reviewed sources do not establish an OQLF-preferred French compound for mentaiko. A transparent gloss such as **mentaiko (œufs de poisson assaisonnés)** may help explain the product, but it remains provisional descriptive French, not a verified synonym or alias. The Canadian manufacturer’s **Pâte d’œufs de morue assaisonnée** is the label for one cod-roe paste SKU only; do not generalize it to mixed-fish listings or intact sacs. The OQLF term **goberge de l’Alaska** names the walleye-pollock species, not a roe product, and must not be applied to a mixed-fish product. [S03–S05, S07]

Keep mentaiko distinct from tarako, generic fish roe, salmon roe/ikura, trout or lumpfish roe, tobiko, masago, bottarga, sea-urchin gonads/uni, sturgeon caviar, fish balls, surimi, fish sauce, pollock flesh, and cod flesh. Do not create a species identity from a processed or mixed-fish product. The recipe corpus has no matching demand, and a descriptive display containing “seasoned fish roe” would make generic `roe` find mentaiko alone while suppressing its current accidental Greenland-halibut match. Hold the candidate until a recipe provides exact product wording and context. [S07, R01]

## English and Québec French naming

| Wording | Evidence and boundary |
|---|---|
| **mentaiko** / **karashi-mentaiko** | MAFF uses *karashi-mentaiko* for salted Alaska-pollock roe seasoned in liquid, and its regional food entry describes the product as spicy. Keep the original product name; neither term should become an alias for all fish roe. [S01, S02] |
| **spicy cod roe paste**; **Pâte d’œufs de morue assaisonnée** | Current bilingual naming on one Azuma Foods (Canada) paste product. The source lists cod roe, chili pepper, kelp soup, and bonito soup as its main ingredients. This is product-specific wording and does not establish a generic French mentaiko name or a common recipe-catalog form. [S05] |
| **Menta Iko – Spiced Cod Roe** | Current Canadian retailer title for a product described as cod roe in a membrane sac, salted and marinated. It is not an OQLF terminology ruling or proof that every mentaiko is cod roe. [S06] |
| **Mentaiko Spicy Cod Roe** | A Canadian retailer's 100 g title conflicts with its accompanying description “pollock roe” and its ingredient declaration naming both walleye pollock and cod. Treat those as that SKU's label and ingredient evidence, not a universal species assignment. [S07] |
| **œufs de poisson** | OQLF's generic Québec French term paired with English *fish roe*. It supports a descriptive gloss only; it does not identify a species, seasoning, product state, or mentaiko-specific French term. [S03] |
| **goberge de l’Alaska** | OQLF's preferred Québec French name for walleye pollock (*Theragra chalcogramma*). It names the species only; it is not an alias for mentaiko or for a mixed-pollock-and-cod roe product. [S04] |

No source reviewed supplies a standardized Québec French name for all mentaiko products. Keep any French gloss descriptive and provisional until an exact recipe or matching package label establishes which product is intended.

## Exact ownership and archive audit

The live snapshot contains **1,367 active ingredient references, 100 forms, 64 legacy candidates, and 1,699 research-ledger records**. Exact normalized-term checks used the same search-key behavior as [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, œ/æ/ß folding, accent removal, punctuation-to-space conversion, and whitespace collapse. The audit covered reference names and aliases, form labels and match terms, legacy candidates, ledger record IDs and candidate ownership, proposal archive terms, and the R40 source-ID prefix.

| Candidate term or ID | Active reference / form owner | Legacy owner | Ledger owner |
|---|---|---|---|
| `mentaiko`; `karashi-mentaiko`; `karashi mentaiko`; `tarako`; `mentai paste` | None | None | None |
| `spicy cod roe`; `spicy pollock roe`; `pollock roe`; `cod roe`; `œufs de poisson assaisonnés` | None | None | None |
| generic `fish roe`; generic `roe` | No exact name/alias owner | None | No exact generic-roe candidate; the words occur in prior decision prose only |
| `ingredient-ref-mentaiko`; `ingredient-ref-tarako`; `candidate-mentaiko` | None | None | None |
| `WP04-SECTIONP-MENTAIKO-20261013-R40-S…` | Not applicable | Not applicable | No prior source ID; this prefix is proposal-local |

Nearby active references are `ingredient-ref-alaska-pollock`, `ingredient-ref-atlantic-pollock`, species-qualified cod references, and `ingredient-ref-crab-flavoured-pollock-flakes`. They identify fish species or a separate processed fish product; none owns a roe term or a mentaiko form. `ingredient-ref-finger-lime` owns `lime caviar` and remains the result for a bare `caviar` query. The held `candidate-salmon-roe` ledger record is limited to salmon roe and is not an owner for this product. The bare `roe` query currently reaches `ingredient-ref-greenland-halibut` only because `roe` is a substring of `Groenland` during substring fallback. [R01]

The archive scan found the focused salmon-roe and sturgeon-caviar reviews, the tobiko/masago review, and the bottarga recheck, but no prior mentaiko or tarako proposal. Those neighboring reviews keep distinct roe products separate; they do not decide this product's naming, exact ownership, or picker projection.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): exact form terms are checked first, then complete normalized word phrases across reference/form terms, then substring fallback. No active form has a mentaiko term. The hypothetical row below is for impact analysis only, not an integration proposal: **mentaiko (seasoned fish roe) / mentaiko (œufs de poisson assaisonnés)**, without aliases or forms. Its descriptive words are deliberately not species claims.

| Query | Current result | Hypothetical display result | Effect |
|---|---|---|---|
| `mentaiko` | None | Mentaiko | Exact product query becomes searchable. |
| `karashi-mentaiko`; `tarako` | None | None | No synonym or tarako alias is proposed. |
| `fish roe`; `œufs de poisson` | None | Mentaiko | The descriptive name would expose this specific product under a generic roe phrase. |
| `roe` | Greenland halibut / flétan du Groenland through substring fallback | Mentaiko only | Phrase-first matching would select the proposed row and suppress the current accidental Greenland-halibut result, making generic `roe` appear to mean mentaiko. |
| `pollock roe`; `cod roe` | None | None | Neither species-qualified phrase is added to the hypothetical display or aliases. |
| `pollock` | Alaska pollock; Atlantic pollock; crab-flavoured pollock flakes | Unchanged | No broad pollock alias is proposed. |
| `cod` | Arctic cod; Atlantic cod; Pacific cod; sablefish; salt cod | Unchanged | No broad cod alias is proposed. |
| `caviar` | Finger lime / lime caviar | Unchanged | Mentaiko is not treated as caviar. |

The exact product query would be useful if a bundled recipe named mentaiko. The generic-roe effect is undesirable while salmon roe, tobiko/masago, lumpfish roe, bottarga, sturgeon caviar, and other roe products remain separately held or unrepresented. Keep the row out of the picker until a recipe selects the product and a deliberate roe-search behavior is available.

## Bundled recipe demand

The full manifest-listed seed bundle was scanned: **114 recipe files and 1,123 ingredient rows**. Complete recipe JSON text and ingredient-row content were checked for `mentaiko`, `karashi-mentaiko`, `karashi mentaiko`, `tarako`, `mentai paste`, `fish roe`, `fish eggs`, `pollock roe`, `cod roe`, `spicy cod roe`, `spicy pollock roe`, `œufs de poisson`, and `œufs de morue`. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe link, role, method, or recipe amount supports an active row or form. [R01]

## Numeric and substitution limits

The reviewed Canadian listings show package facts only: Azuma Foods (Canada) gives a case style of 18 packages / 250 g and a frozen two-year shelf life for one cod-roe paste; PriceSmart Foods lists a separate 80 g mentaiko roe paste; Daily Seafood lists one 150 g membrane-sac product; and Hungry Ninja lists one 100 g SKU with nutrition reported per 15 g serving. These package sizes and the nutrition basis are specific to those listings. None is a recipe portion, household measure, density, edible yield, or standard conversion. [S05–S08]

No reviewed source gives a volume measure or density for exact mentaiko, and the varied intact-sac and paste presentations have no shared portion rule. Add no default density, unit mapping, active measure, form conversion, package yield, cooking conversion, or recipe amount. The MAFF food-culture page lists rice, rice-ball, and pasta uses but gives no quantity to transfer. [S02]

No source or bundled recipe validates substitution among mentaiko, tarako, salmon/trout/lumpfish roe, tobiko, masago, bottarga, sea-urchin gonads, sturgeon caviar, fish sauce, anchovy paste, pollock flesh, or cod flesh. The source distinctions concern species, seasoning, and product presentation; they do not establish equivalent flavor, preparation, or quantity. Add no global form conversion, contextual substitution, warning, or recipe-line substitution.

## Recommended next action

Keep mentaiko unallocated and the Section P roe item open. Revisit when a bundled recipe names mentaiko and its use clearly indicates whether it requires an intact roe sac, a paste, or another prepared product. At that point, match the exact product wording to a current package label, resolve the Québec French display for that SKU, and rerun exact ownership and picker projection. Do not infer a fish species from the generic product name or use the findings to rename pollock, cod, or other roe products.

## Source register

Online sources were accessed on 2026-10-13. Source IDs are local to this proposal and create no ledger records.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-MENTAIKO-20261013-R40-S01** | Japan Ministry of Agriculture, Forestry and Fisheries, [Salted foods — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/siozuke.html), “Salted fish roe products” and product list, lines 100–117. | Distinguishes shio-tarako and karashi-mentaiko and describes karashi-mentaiko as salted Alaska-pollock roe in liquid seasoning. Japanese food classification; not a Canadian product standard or proof about every market product sold as mentaiko. |
| **WP04-SECTIONP-MENTAIKO-20261013-R40-S02** | Japan Ministry of Agriculture, Forestry and Fisheries, [Local dishes loved by the nation](https://www.maff.go.jp/j/nousin/kouryu/kyodo_ryouri/pdf/english.pdf), Fukuoka entry “Karashi-mentaiko,” p. 7. | Calls it spicy Alaska-pollack roe and describes salting and chili-spiced liquid marination; mentions rice, rice-ball, and spaghetti uses. Does not provide a recipe quantity, French name, or Canadian SKU specification. |
| **WP04-SECTIONP-MENTAIKO-20261013-R40-S03** | Office québécois de la langue française, [GDT: œufs de poisson](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435851/oeufs-de-poisson), preferred term, English translation, and update date, lines 19–45. | Gives the generic Québec French term `œufs de poisson` and English `fish roe`; entry last updated 1983. It does not establish a mentaiko-specific term, species, or preparation. |
| **WP04-SECTIONP-MENTAIKO-20261013-R40-S04** | Office québécois de la langue française, [GDT: goberge de l’Alaska](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199004/goberge-de-lalaska), French preferred term, English terms, and Latin term. | Identifies the walleye-pollock species as *Theragra chalcogramma*. It is fish-species terminology, not a roe-product name; it cannot resolve a product listing that names both pollock and cod. |
| **WP04-SECTIONP-MENTAIKO-20261013-R40-S05** | Azuma Foods (Canada) Co., [Mentai Paste](https://azumafoods.ca/products/mentai-paste/), product 61076, product names, package style, shelf life, and ingredients, lines 53–65. | Canadian manufacturer lists “Mentaiko Paste ‘Delight’,” “Seasoned Spicy Cod Roe Paste ‘Delight’,” and French “Pâte d’œufs de morue assaisonnée”; lists cod roe, chili pepper, kelp soup, and katsuo soup. The 18-package / 250 g case and frozen shelf life are SKU facts, not a serving or universal mentaiko specification. |
| **WP04-SECTIONP-MENTAIKO-20261013-R40-S06** | Daily Seafood, [Menta Iko – Spiced Cod Roe 150 gm](https://shop.dailyseafood.ca/products/6165aadf68dadc002d7c8b39/shirako-cod-semen-500-gm), title, description, package quantity, and contact details, lines 6–27. | Current Canadian retailer lists a 150 g product, calls it cod roe with a membrane sac, and describes it as salted and marinated, usable in the sac or with the membrane removed, raw or cooked. This is seller copy for one product; no taxon, full ingredients, French name, or transferable recipe portion is supplied. |
| **WP04-SECTIONP-MENTAIKO-20261013-R40-S07** | Hungry Ninja, [FZN: Kaikobo Mentaiko Spicy Cod Roe (100G)](https://hungry-ninja.ca/products/fzn-kaikobo-mentaiko-spicy-cod-roe-100g), title, description, ingredients, nutrition, and country of origin, lines 651–702. | Current Canadian listing title says cod roe; description says pollock roe; ingredients name walleye pollock and cod; nutrition is reported per 15 g. The SKU showed sold out when checked. These facts describe this one listing only and do not determine a universal species, product, or recipe serving. |
| **WP04-SECTIONP-MENTAIKO-20261013-R40-S08** | PriceSmart Foods, [Shirakiku — Mentaiko Spicy Roe Paste](https://www.pricesmartfoods.com/product/shirakiku-mentaiko-spicy-roe-paste-id-00074410167721), title, package size, description, and pickup listing, lines 51–76. | Current Canadian grocery listing shows an 80 g paste titled “Mentaiko Spicy Roe Paste” and describes it as spicy cod-roe paste. It is one retailer SKU and displayed a Richmond pickup location; it does not provide an ingredient declaration, French name, recipe amount, or general product specification. |
| **WP04-SECTIONP-MENTAIKO-20261013-R40-R01** | [Bundled recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) and manifest-listed recipe files. | Reproducible corpus scope: 114 recipe files / 1,123 ingredient rows. The exact-term scan found no matching product or roe-family recipe demand. It does not establish demand outside the bundled library. |

No app tests or emulator checks were run. This is a proposal-only documentation change; active catalog data and app behavior were not modified.
