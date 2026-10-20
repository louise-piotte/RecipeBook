# WP03 Section G rice-noodle boundary review

- **Reviewed:** 2026-10-10
- **Status:** reviewed; keep the distinct flat-rice-noodle candidate inactive in the canonical catalog for now. Generic rice noodles and generic glass noodles remain unresolved.
- **Scope:** distinguish flat rice noodles / rice sticks from rice vermicelli and assess whether starch-based glass-noodle names can safely share an identity. No seed, ledger, recipe, plan, checklist, or generated-index changes are proposed.
- **Plan mapping:** the open Section G umbrella names flat rice noodles, rice sticks, and glass noodles by starch source at [`docs/RecipeBook-global-ingredient-catalog-plan.txt` lines 1550–1555](../../RecipeBook-global-ingredient-catalog-plan.txt#L1643). The child checkpoint at [lines 4445–4443](../../RecipeBook-global-ingredient-catalog-plan.txt#L4708) keeps broad `rice noodles / nouilles de riz` unresolved and forbids adding `rice sticks` or `glass noodles` as aliases under [WP03-S163]. New manufacturer and Québec French evidence supports revisiting only the rice-stick/flat-strip boundary; it does not resolve the generic rice-noodle term or generic glass-noodle family. The remaining Section G sweep stays open.

## Snapshot and exact targets checked

Snapshot taken 2026-10-10 from the live package and proposal tree:

| Artifact | Current state | SHA-256 |
| --- | ---: | --- |
| [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 867 references | `6fb175c66019050aaef8e8f34a405200eda893bfb3fd67c5acaf77ad3a1cdf95` |
| [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 48 forms | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| [`research-ledger.v1.json`](../research-ledger.v1.json) | 1,113 records | `92192fb3de6c0707ab7ea3ad0e6b0f66ecf40aa348e4a9b40eaf6b60c0b1b040` |
| [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json) | 78 candidates | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| Manifest-listed recipe JSON | 114 files; 1,123 `ingredients[]` rows; 751,813 bytes | Inventory digest `8082bc3c1ecb07b6731a1da6a56d53a01dba76c6a437bda66792cd5e005ff85e`* |

\*The recipe inventory digest is SHA-256 over each filename, a NUL byte, and its file bytes in sorted filename order. It is a review snapshot aid, not a package-generated checksum.

Exact active references reviewed:

- Noodle/pasta neighbors: `ingredient-ref-rice-vermicelli`, `ingredient-ref-bean-thread-cellophane-noodles`, `ingredient-ref-pasta`.
- Rice neighbors: `ingredient-ref-rice`, `ingredient-ref-rice-flour`, `ingredient-ref-rice-paper-wrapper`.
- Starch/product neighbors relevant to glass noodles: `ingredient-ref-mung-bean-starch`, `ingredient-ref-potato-starch`, `ingredient-ref-sweet-potato-starch`, `ingredient-ref-tapioca-starch`, `ingredient-ref-sweet-potato`.
- No active reference has ID `ingredient-ref-rice-noodles`, `ingredient-ref-flat-rice-noodles`, or a glass-noodle identity.

The ledger contains `ingredient-ref-rice-noodles` as a `candidate` with `identityState: needs_clarification`; its sole prior decision keeps generic `nouilles de riz` unresolved under [WP03-S163]. `ingredient-ref-rice-vermicelli` and `ingredient-ref-bean-thread-cellophane-noodles` are verified, already-integrated references. The mung-bean-starch record is `needs_clarification`; it is a starch ingredient, not a finished noodle identity. I found no ledger record for flat rice noodles, rice sticks, or a general glass-noodle identity. The legacy file has no noodle candidate; its only rice-term hit is `ingredient-ref-brown-rice-syrup`, which is unrelated.

The normalized exact-key audit used lowercase, NFKD accent folding, punctuation-to-space, and whitespace collapse across all active reference and form names and aliases. None of `flat rice noodles`, `flat rice noodle`, `rice sticks`, `rice stick`, `nouilles de riz plates`, `nouille de riz plate`, `bâtonnets de riz`, `rice noodles`, `nouilles de riz`, `glass noodles`, `glass noodle`, or `nouilles de verre` currently has an exact active owner. The existing qualified key `rice vermicelli` / `vermicelle de riz` belongs to `ingredient-ref-rice-vermicelli`; the qualified mung-bean noodle pair belongs to `ingredient-ref-bean-thread-cellophane-noodles`. The proposed English display/aliases below have no collision with those rows or the active `rice` reference.

## Recipe demand audit

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned across the stored ingredient text and reference fields. There are **zero noodle-related ingredient rows** and zero exact hits for `flat rice noodles`, `rice sticks`, `rice noodles`, `rice vermicelli`, glass/cellophane noodle terms, or the French candidate forms.

Two whole-recipe text mentions are not ingredient demand:

- Recipe `015-boeuf-stroganov-beef-stroganov-e1e7939b-206f-4839-97d9-2a91febb28eb.v1.json`, English instructions end “serve with rice or noodles”; the French instructions say “servir avec du riz ou des nouilles.” This is generic serving advice, with no noodle product, amount, or line reference.
- Recipe `054-gateau-biscuit-cookie-cake-ad2f1317-aa4d-4d1e-9aec-0d70a72228af.v1.json`, French instructions say “décorer de vermicelles si désiré.” This is decorative vermicelles/sprinkles, not rice vermicelli or a noodle.

No recipe link, ingredient-line rewrite, or demand-driven test fixture can be justified from the current bundle. Separate Québec recipe sources use the exact French phrase `nouilles de riz plates` for Pad Thai and `nouilles de riz plates moyennes` for pho; these establish local wording and external culinary use, not demand within RecipeBook.

## Product boundary and recommendation

### Flat rice noodles / rice sticks versus rice vermicelli

The strongest defensible sibling boundary is the flat-strip rice-noodle product family marketed as **rice sticks**, distinguished from the very fine thread product already represented as rice vermicelli. Erawan, a manufacturer, separately presents rice-stick sizes S–XL (about 1.5–9.5 mm, with a note that standard sizing varies by region) and rice vermicelli at 0.7 mm. Go-Tan’s manufacturer page identifies one `Rice Sticks` product as flat, 5 mm wide rice noodles. The THAI SELECT Canada market listing groups rice-stick products by width and lists rice vermicelli as a separate product for some brands. Together these support a named product family and a real thread-versus-flat-strip boundary, but not universal diameter thresholds or a universal recipe/formulation.

Québec French recipe usage repeatedly supplies the clear display phrase `nouilles de riz plates`: the Fédération des producteurs d’œufs du Québec uses it as a Pad Thai ingredient; Le Poulet du Québec specifies `nouilles de riz plates moyennes` in a pho recipe. These are strong regional usage attestations, but not OQLF terminology approval. OQLF’s older Chinese-noodle entry is broader: it lists rice noodles among Chinese noodle products and notes wide/flat noodle types in English, without defining `rice sticks` or a dedicated French label for the flat-rice subset.

**Recommendation:** keep `flat rice noodles / nouilles de riz plates` as one bounded, identity-only proposal, separate from `ingredient-ref-rice-vermicelli`; do not integrate it in this batch because the bundled corpus has no direct ingredient request. If a later integration is approved, use only these proposed terms:

| Field | Proposed value |
| --- | --- |
| Proposed ID | `ingredient-ref-flat-rice-noodles` |
| English display | `flat rice noodles` |
| fr-CA display | `nouilles de riz plates` |
| English aliases | `rice stick`; `rice sticks` |
| French aliases | none |
| Category | `GRAIN_AND_CEREAL` |
| Identity boundary | Rice-noodle product sold as flat strips, often under the market name rice sticks; do not encode a width cutoff or one universal formula. |

Do **not** add `rice noodles` / `nouilles de riz` as aliases: those remain broad and may denote multiple rice-noodle shapes. Do not alias `rice vermicelli`, `vermicelle de riz`, or `vermicelles de riz` to this candidate. Do not add `bâtonnets de riz`: the Canadian Walmart French listing uses this wording in auto-generated product copy, while the Québec recipe sources consistently support `nouilles de riz plates`; the retailer wording is not strong enough to activate as a fr-CA alias. Do not create thin/medium/wide forms or mm grade forms from vendor-specific sizing.

### Generic rice noodles and glass noodles

- **Hold generic `rice noodles / nouilles de riz`.** The existing ledger decision remains correct for the broad term. OQLF does not give it a stable product boundary from vermicelli and flat rice noodles; manufacturer/market usage also groups multiple shapes and products under rice noodles.
- **Hold generic `glass noodles`, `cellophane noodles`, and `nouilles de verre`.** Manufacturer listings use these names for starch-based finished noodles, but source families vary: Thai Wah’s product overview describes bean vermicelli/glass noodles and lists pea, potato, tapioca, and rice among its noodle-product raw materials; Marumatsu lists glass/harusame noodles with green bean, mung bean, and potato starch. Thus “glass noodle” does not reliably specify one botanical starch identity or formulation. A Montréal Korean restaurant menu uses `nouilles de verre de patate douce / sweet potato glass noodles` for one dish, which supports a local starch-qualified phrase but not an unqualified glass-noodle identity.
- **Do not merge** glass-noodle terms into the existing `ingredient-ref-bean-thread-cellophane-noodles`. That active identity is the OQLF-defined mung-bean-flour bean-thread product; neither a generic appearance label nor every starch noodle is equivalent to it. Also keep it distinct from the active `ingredient-ref-mung-bean-starch` ingredient reference.
- **Sweet-potato glass noodles:** preserve as a future source-specific candidate, not an accepted alias or new row here. Roland Foods calls its product `Pre-Cooked Sweet Potato Glass Noodles` and describes it as made with sweet-potato starch, but the same product page’s ingredient panel lists water, sweet potato flour, and lactic acid. The wording/formulation discrepancy prevents this page alone from establishing a clean starch-source identity. The Montréal menu supports the French phrase but is not a product specification.

## Measures, forms, substitutions

- **Identity:** the flat-strip candidate is separate from fine-thread rice vermicelli. It does not claim that every rice-stick product has the same rice/tapioca/water recipe; Go-Tan’s formulation is product-specific.
- **Forms:** no forms proposed. Sources show retail noodles and recipes that soak/cook them, but do not define a shared form taxonomy, recipe need, or state-conversion relation for this bundle.
- **Measurements:** keep default density, unit mappings, mass-volume conversions, cooking yields, package yields, and portion conversions unknown. External recipe amounts (for example 250 g Pad Thai noodles or 450 g pho noodles) are ingredient quantities in those recipes, not conversion data. Manufacturer pack sizes are package facts, not unit mappings.
- **Substitution:** no global or contextual substitution rule proposed. No evidence here establishes an interchangeable amount or method for flat rice noodles, rice vermicelli, mung-bean noodles, or sweet-potato glass noodles.

## Focused future fixtures

These are proposal-level acceptance expectations for a later integration; no tests were run or added.

1. Exact English `flat rice noodles` and French `nouilles de riz plates` resolve to the proposed flat-rice identity, if integrated.
2. `rice stick` and `rice sticks` resolve to that same identity only; neither maps to `ingredient-ref-rice-vermicelli`.
3. `rice vermicelli`, `vermicelle de riz`, and `vermicelles de riz` continue to resolve only to `ingredient-ref-rice-vermicelli`.
4. `bean thread cellophane noodles` and `nouilles à base de farine de haricot mungo` continue to resolve only to `ingredient-ref-bean-thread-cellophane-noodles`; `glass noodles` and `nouilles de verre` do not become its aliases.
5. `rice noodles` and `nouilles de riz` remain unassigned as product-specific aliases. Do not use a generic rice result to satisfy those searches.

## Sources

All web sources below were accessed 2026-10-10.

- **WP03-RN-20261010-S01 — OQLF, [pâtes alimentaires chinoises](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298986/pates-alimentaires-chinoises)** (entry last updated 1982): identifies `nouilles de riz` inside a broad Chinese-noodle family, lists multiple ingredient bases, describes wide/flat and translucent noodle types in its English note, and explains the variable English scope of `noodles`. It does not define a rice-stick / flat-rice product pair.
- **WP03-RN-20261010-S02 — Erawan Brand, [Noodles](https://www.erawanbrand.com/noodles)** (manufacturer): lists rice-stick sizes S, M, L, and XL and separately lists rice vermicelli at 0.7 mm. It notes that size standards vary by region; no fixed grade cutoff is inferred.
- **WP03-RN-20261010-S03 — THAI SELECT Canada, [Rice Noodles](https://www.thaiselect.ca/rice-noodles)**: lists rice sticks at 1, 3, 5, and 10 mm under several brands and separately lists rice vermicelli under Cock and Wai Wai. This is a Canadian product-market listing, not a formal noodle standard or French-language source.
- **WP03-RN-20261010-S04 — Go-Tan, [Rice Sticks](https://www.go-tan.com/en/products/noodles/rice-sticks-250g/)** (manufacturer): describes one 5-mm rice-stick product as flat rice noodles and lists its ingredients as 85% rice flour, tapioca starch, and water. The formulation is product-specific.
- **WP03-RN-20261010-S05 — Fédération des producteurs d’œufs du Québec, [Pad thaï classique](https://oeuf.ca/recettes/pad-thai-classique/)**: uses `8 onces (250 g) de nouilles de riz plates` and gives preparation steps. Supports regional French recipe wording; the amount is not a measurement conversion.
- **WP03-RN-20261010-S06 — Le Poulet du Québec, [Soupe tonkinoise minute au poulet](https://lepoulet.qc.ca/recettes/soupe-tonkinoise-minute-au-poulet/)**: lists `450 g de nouilles de riz plates moyennes`. Supports regional display wording and a recipe-specific width adjective, not a standard grade.
- **WP03-RN-20261010-S07 — Thai Wah, [Food Products Overview](https://www.thaiwah.com/en/products/food-products/food-products-overview)** (manufacturer): distinguishes its rice-noodle, rice-vermicelli, and mung-bean-starch noodle products; describes bean vermicelli/glass noodles; lists pea, potato, tapioca starch, and rice across the broader noodle product family. It does not provide a universal recipe for glass noodles.
- **WP03-RN-20261010-S08 — Marumatsu Bussan, [Vermicelli and Rice Noodles](https://www.marumatsu-mb.co.jp/English/products/en.14Vermicelli_RiceNoodles.html)** (manufacturer): identifies Harusame glass noodles and lists green beans, mung beans, and potato starch as main raw materials, while separating its rice-noodle products. Product listing only; not a Québec terminology authority.
- **WP03-RN-20261010-S09 — La Belle Corée, [restaurant menu PDF](https://www.restomontreal.ca/portal/la-belle-coree/menu/menu_342-2022-07-24-01.pdf)** (Montréal local menu): pairs `Nouilles de verre de patate douce` with `Sweet potato glass noodles`. Supports observed local bilingual usage for one dish, not an OQLF-preferred term or packaged ingredient declaration.
- **WP03-RN-20261010-S10 — Roland Foods, [Pre-Cooked Sweet Potato Glass Noodles](https://rolandfoods.com/product/72288-pre-cooked-glass-noodles)** (manufacturer): markets a product with sweet-potato glass noodle wording and states sweet-potato starch in the description, but its ingredient list says sweet-potato flour. Used only to note a product-specific source conflict; not as sufficient evidence for a new identity or French alias.

**Source-access limits:** all listed web pages opened directly on 2026-10-10; none required an account. The OQLF page is old (1982); the THAI SELECT page is a Canada-facing assortment list, not a terminology or product standard; manufacturers document their own product names and formulations only. Québec recipes establish local wording, not a controlled noodle specification. The Roland page’s own description and ingredient panel conflict on starch/flour wording, so it is not used to define a general sweet-potato glass-noodle composition.

## Remaining work

This review updates evidence for only one sibling boundary. The broad rice-noodle candidate `ingredient-ref-rice-noodles` stays unresolved; generic glass noodles remain unresolved by starch source. The Section G umbrella also remains open for the rest of its checklist (including alkaline wheat noodles, egg noodles, shirataki/konjac noodles, and other pasta/noodle work). The earlier [pasta and Asian-noodle packet](../batches/pasta-shapes-asian-noodles.md) remains a useful record of integrated rice vermicelli and mung-bean noodle identities; neither is re-opened here.

## Coordinator disposition — 2026-10-10

Accepted the flat-strip versus fine-thread boundary evidence, but kept `ingredient-ref-flat-rice-noodles` inactive. The 114 bundled recipes have no direct noodle ingredient line. In the current search index, the French display phrase `nouilles de riz plates` also satisfies the unresolved broader query `nouilles de riz`, so adding it would make the generic query return a product-specific result. The evidence is retained for a later exact recipe request; no active reference, recipe link, form, numeric value, conversion, or substitution was added. Generic rice noodles and generic glass noodles remain unresolved.
