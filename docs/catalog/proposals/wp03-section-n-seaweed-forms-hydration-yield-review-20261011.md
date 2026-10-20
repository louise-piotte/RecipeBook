# WP03 Section N proposal: seaweed forms and hydration-yield evidence

- **Reviewed:** 2026-10-11
- **Status:** proposal only. This packet changes no shared catalog JSON, ledger, recipes, plan, roadmap, code, or tests.
- **Scope:** the active Japanese wakame (*Undaria pinnatifida*) and kombu (*Saccharina japonica*) identities, with nori's intrinsically dried product definition as a boundary check; live forms, densities, mappings, recipe demand, and source limits for hydration observations.
- **Plan state:** Section N remains open. Its checklist for fresh, dried, reconstituted, and soaking-liquid forms and the seaweed identity list remain open.

## Recommendation

Do not add a seaweed form, numeric yield, density, unit mapping, package yield, recipe link, or substitution. Keep the active identities unchanged. The current bundled recipe corpus contains no seaweed ingredient demand, and the hydration evidence is product- or laboratory-specific rather than a generally transferable recipe conversion.

Use the evidence this way:

1. **Nori:** keep the pressed, dried *Porphyra* food product as the identity itself. Its dried state is intrinsic to the OQLF definition; no separate dried-nori form or rehydration yield is established [S01].
2. **Japanese wakame:** evidence supports dried wakame that is soaked, drained, and used in food, and a distinct salt-preserved raw wakame product exists. Do not treat salted raw wakame as equivalent to rehydrated dried wakame. The two published weight-expansion claims for one named Porto-Muiños product conflict, so neither supports an active numeric yield [S02, S05–S08].
3. **Kombu:** evidence supports dried kombu being soaked for dashi and a controlled study of water absorbed by dried *Laminaria japonica* (the historical name associated with the active *Saccharina japonica* kombu identity). The study reports water uptake, not drained edible yield or density; dashi instructions remove the kombu and report no post-soak mass [S03, S09–S10].
4. **Generic kelp:** leave the candidate unresolved. Do not add `kelp` as an alias of kombu. Current bare `kelp` search reaches the already active `winged kelp` / Alaria identity through that qualified phrase; this does not establish a generic kelp identity [S04].

## Live package audit

The audit used the current `manifest.v1.json` recipe order. It parsed all **114 recipes and 1,123 ingredient rows**, and searched all recipe string fields for seaweed product names, French terms, common variants, and relevant scientific names. There were **zero matching ingredient rows and zero whole-recipe string matches** for nori, kombu, wakame/wakamé, kelp, Alaria, dulse, laver, algue, varech, goémon, *Undaria*, *Saccharina*, or *Laminaria*. The current bundle has **66 ingredient-form records and no seaweed or algae forms**; one broader `sea` text hit is the unrelated orange-footed sea cucumber form.

The active reference entries are identity-only for these measurement purposes:

| Active reference | Current display and aliases | Density / mappings | Ledger state |
|---|---|---|---|
| `ingredient-ref-nori` | FR/EN `nori`; FR `laitue pourpre`; EN `purple laver` | `defaultDensity: null`; `unitMappings: []` | `measurementState: not_yet_researched` |
| `ingredient-ref-wakame` | FR `wakamé`; EN `wakame`; no aliases | `defaultDensity: null`; `unitMappings: []` | `measurementState: not_yet_researched` |
| `ingredient-ref-kombu` | FR/EN `kombu`; `konbu` alias in both languages | `defaultDensity: null`; `unitMappings: []` | `measurementState: not_yet_researched` |
| `ingredient-ref-alaria-esculenta` | FR `alarie succulente`; EN `winged kelp`; FR alias `wakamé atlantique`; EN aliases `Atlantic wakame`, `dabberlocks` | `defaultDensity: null`; `unitMappings: []` | `measurementState: not_yet_researched` |
| `ingredient-ref-kelp` candidate | Generic kelp remains unresolved | Not active | `identityState: needs_clarification`; measurement unresearched |

The current package-yield data has no seaweed yield. No matching seaweed legacy-import candidate was found, and no current recipe line can serve as a basis for a form or numeric mapping. No seaweed substitution rule is proposed.

The manifest snapshot has SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`. The plan and the 2026-10-10 integration note already record the identity-only boundary: nori, kombu, Japanese wakame, and the species-scoped Alaria identity were integrated without forms or numeric data; Section N remains open [P01, P02].

## Normalized alias and search audit

I normalized proposed queries using the app's current `normalizeIngredientSearchKey` behavior: lowercase, NFKD accent folding, compatibility folding, punctuation-to-space replacement, and whitespace collapse. The complete phrase stage returns:

| Query / normalized key | Current result | Interpretation |
|---|---|---|
| `nori`; `laitue pourpre`; `purple laver` | `ingredient-ref-nori` | Current scoped names and aliases resolve to the nori product. |
| `dried nori` | No result | There is no redundant dried form or alias, consistent with the source-defined product identity. |
| `kombu`; `konbu` | `ingredient-ref-kombu` | Both languages' spelling alias resolves to the same kombu identity. |
| `kelp` | `ingredient-ref-alaria-esculenta` by substring fallback on `winged kelp` | This is a broad-query overlap, not a generic kelp owner or kombu synonym. The unresolved generic candidate remains inactive. |
| `wakame`; `wakamé` | `ingredient-ref-wakame` and `ingredient-ref-alaria-esculenta` | The accent-folded bare term intentionally returns Japanese wakame and the qualified Atlantic-wakame alias on Alaria. Preserve both rows; do not merge their identities. |
| `Atlantic wakame`; `wakamé atlantique` | `ingredient-ref-alaria-esculenta` | Qualified regional wording stays on the Alaria identity. |
| `dried wakame`; `fresh wakame`; `rehydrated wakame`; `dried kelp` | No result | No form labels currently exist. These query strings do not collide with an active full phrase. |

No duplicate normalized full term is active across references and forms for these phrases. The bare `wakame` query still returns two rows because it occurs as a complete word inside Alaria's qualified `Atlantic wakame` alias; the `kelp` result is substring fallback on `winged kelp`. These are existing search behaviors documented by the integration checkpoint, not new aliases [P02].

## Form boundaries and source-backed observations

| Product | Evidence for culinary state | What it does not establish | Proposal |
|---|---|---|---|
| Nori | OQLF defines nori as a pressed, dried edible product made from *Porphyra* varieties and gives Québec French `nori` / `laitue pourpre` [S01]. | No fresh-nori product boundary, hydration method, recipe yield, density, or mass/volume mapping. | Keep the current identity only; do not create a separate dried form. |
| Japanese wakame | The Japanese Ministry of Agriculture, Forestry and Fisheries (MAFF) recipe uses 4 g cut dried wakame, then directs soaking in water and thorough draining for a salad [S05]. Takara Kaiso, a seaweed processor, separately lists salt-preserved raw wakame that must be desalted and dried wakame that is returned in water [S10]. A Porto-Muiños technical sheet identifies a dried *Undaria pinnatifida* product; its directions soak it for 10 minutes and boil it for 5 minutes [S06]. | MAFF gives no post-drain weight. Takara's page does not specify the species, salt concentration, or a dry-to-salted-product equivalence. A product's post-soak weight is not a Québec recipe standard. | Keep dried/reconstituted and salted-raw routes distinct in future source review. Do not add a `fresh` form or link salted raw wakame to rehydrated wakame from this evidence alone. No form now because the bundled recipes have no use. |
| Kombu | MAFF uses dried kombu for dashi: 10 g with 1 L water, soak 30 minutes, then remove near boiling [S09]. A 1983 experiment measures rehydration of dried natural, cultured, and force-cultured “makombu,” *Laminaria japonica*, in 30°C distilled water [S08]. | Dashi's 10 g : 1 L ratio is a broth recipe ratio, not a kelp hydration yield. The experiment reports absorbed water at equilibrium, not the drained/cooked ingredient mass or a serving conversion. | Do not model “soaked kombu” as an edible recipe form from the dashi method: the kombu is removed. Do not add any numeric mapping or density from the experiment. |
| Atlantic wakame / winged kelp | Canada’s 2025 Québec seaweed guide scopes `wakamé atlantique` / `Atlantic wakame` to *Alaria esculenta*, distinct from the OQLF Japanese wakame identity [S04]. | The identity source does not establish an Alaria state, hydration yield, or equivalence with dried *Undaria*. | Keep the current qualified alias and identity boundary; no state changes. |

### Hydration measurements are not density or recipe conversion

The kombu study reports that, at equilibrium in distilled water, each gram of dry matter absorbed **4.45 g water** for natural samples, **4.21 g** for cultured samples, and **4.45 g** for force-cultured samples. It notes differences by growth history. In the same study, acid solutions produced different uptake (1.60–1.67 g/g in acetic acid and 2.03–2.23 g/g in lactic acid) and softened the texture [S08]. These are lab observations of water absorbed per gram dry matter at 30°C, not a final drained food mass, not a volume measure, and not `g/ml` density. The paper does not give a household soak-and-drain procedure that would make the values a recipe conversion.

The Porto-Muiños manufacturer sheet describes one dried *Undaria* product and says soaking for 10 minutes increases its weight tenfold before boiling for 5 minutes [S06]. A retailer page for the same 25 g GTIN (`8437001476268`) says to soak at least 10 minutes and boil at least 5 minutes, but reports a wet-weight factor of six [S07]. The manufacturer sheet and retailer listing therefore disagree for the same named SKU. Neither source says whether the multiplier means final total weight or added water, how the product is drained before weighing, whether the stated value is a typical result, or whether the post-boil mass is intended. The retailer page is not an independent controlled measurement. Do not select, average, or apply either multiplier to other wakame.

The MAFF salad's 4 g is the dry recipe amount; its instructions soak and drain the wakame, but give no post-drain quantity [S05]. Taken together, these sources establish common preparation states and product variability, but not a catalog-safe hydration conversion. A hydration observation in `g water absorbed / g dry matter` remains dimensionally and semantically separate from density in `g/ml` and from a recipe's dried-to-drained yield.

## Exact proposed changes

**No shared JSON or ledger changes are proposed.** Keep all current seaweed references, aliases, `defaultDensity: null`, empty `unitMappings`, measurement-state values, forms, package yields, substitutions, and recipe links unchanged. Do not add a generic kelp identity or change the existing `wakame` / `Atlantic wakame` relationship. The only proposed artifact is this review packet.

## Unresolved evidence gaps

- Confirm directly with Porto-Muiños whether its current 25 g GTIN uses a sixfold or tenfold wet-weight statement, and define weighing stage, draining method, and whether the multiplier denotes final mass or mass gain.
- Obtain a product-specific, repeatable drained-yield measurement for a named dried *Undaria pinnatifida* product if an actual recipe later requires it.
- Source Québec French form displays for a named dried, rehydrated/drained, or salt-preserved raw wakame product before creating active forms. The current OQLF source supports the identity label `wakamé`, not a complete state-label taxonomy.
- Establish the species and preparation state of a Québec-available salted-raw wakame product before attaching it to the species-scoped `ingredient-ref-wakame` identity.
- Keep kombu laboratory uptake findings as research observations unless a product-specific kitchen method and drained final mass become available; no generic `kelp` hydration data can be attached to kombu.
- No seaweed recipe demand exists in the present package. Revisit these decisions only if a bundled or user recipe contains a concrete seaweed ingredient line.

## Sources

Source IDs are local to this proposal and have not been added to the shared research ledger.

| ID | Source | Supports and limits |
|---|---|---|
| **WP03-SEA-FORMS-20261011-S01** | OQLF, [nori (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503226/nori). | Québec French naming and the pressed, dried *Porphyra* food product. No separate form, yield, or density. |
| **WP03-SEA-FORMS-20261011-S02** | OQLF, [wakamé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8394948/wakame). | Québec French `wakamé`, English `wakame`, and *Undaria pinnatifida* identity. No preparation-state conversion. |
| **WP03-SEA-FORMS-20261011-S03** | OQLF, [kombu (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8395088/kombu). | Québec identity `kombu` / `konbu`, *Saccharina japonica*, and historical *Laminaria japonica*. Does not make all kelp a kombu synonym. |
| **WP03-SEA-FORMS-20261011-S04** | Fisheries and Oceans Canada, [Guide de bonnes pratiques pour une récolte durable et sécuritaire des algues marines au Québec (French, 2025)](https://publications.gc.ca/collections/collection_2025/mpo-dfo/Fs124-13-2025-fra.pdf) and [English guide](https://publications.gc.ca/collections/collection_2025/mpo-dfo/Fs124-13-2025-eng.pdf). | Species-scopes `alarie succulente` / `winged kelp` and qualified `wakamé atlantique` / `Atlantic wakame` / `dabberlocks` to *Alaria esculenta*. It does not establish a wakame hydration yield. |
| **WP03-SEA-FORMS-20261011-S05** | Japan MAFF, [鯛とわかめの和風カルパッチョサラダ](https://www.maff.go.jp/j/keikaku/syokubunka/culture/wagohan/articles/2203/spe7_02.html), within “Easy dried-food menus.” | A recipe uses 4 g cut dried wakame and instructs water soaking and draining before service. It reports no hydrated weight. |
| **WP03-SEA-FORMS-20261011-S06** | Porto-Muiños, [Wakame deshidratado technical sheet, revision 05, 2017](https://www.tendaecoloxica.com/pdf/690330.pdf). | Manufacturer sheet identifies dried *Undaria pinnatifida*, gives 10-minute immersion and 5-minute boiling instructions, and states a tenfold weight increase. It does not specify drainage/weighing procedure or resolve whether this is final mass or mass gain. |
| **WP03-SEA-FORMS-20261011-S07** | Violey product listing, [Porto Muiños Organic Wakame, 25 g](https://www.violey.com/en/porto-muinos-organic-wakame_p_42605.html). | Same listed 25 g GTIN `8437001476268`; says soak 10 minutes and boil 5 minutes, and lists a sixfold wet-weight factor. This secondary product page conflicts with the manufacturer technical sheet and is not an independent yield experiment. |
| **WP03-SEA-FORMS-20261011-S08** | Yokoya, K. (1983), [“Effects of Amino Acid and Acids on Rehydration of Dried Makombu,” *Bulletin of the Japanese Society of Scientific Fisheries* 49(1):103–107](https://www.jstage.jst.go.jp/article/suisan1932/49/1/49_1_103/_article/-char/ja), DOI [10.2331/suisan.49.103](https://doi.org/10.2331/suisan.49.103). | Controlled water-absorption results for dried *Laminaria japonica* at 30°C, reported per gram dry matter at equilibrium; sample growth conditions affect uptake. It is neither a post-drain kitchen yield nor density. |
| **WP03-SEA-FORMS-20261011-S09** | Japan MAFF, [How to make broth](https://www.maff.go.jp/e/policies/market/japan-cuisine/japan/11/index.html). | Uses 10 g dried kombu with 1 L water, soaks 30 minutes, then removes the kombu near boiling. This is dashi preparation, not a rehydrated ingredient yield. |
| **WP03-SEA-FORMS-20261011-S10** | Takara Kaiso, [manufacturer product catalogue](https://takarakaisou.com/). | Separates salt-preserved raw wakame (desalt before use) from dried wakame (rehydrate) and lists kombu for dashi. The overview does not give a wakame species or a yield. |
| **WP03-SEA-FORMS-20261011-P01** | [WP03 sea-vegetable and algae identity-boundary proposal](wp03-sea-vegetables-algae-product-boundaries-20261009.md). | Prior identity boundary, source register, and recommendation to leave forms and hydration yield open. |
| **WP03-SEA-FORMS-20261011-P02** | [WP03 / WP04 integration checkpoint](../batches/wp03-citrus-sea-vegetables-wp04-squid-integration-20261009/README.md). | Confirms current integrated identity displays and intentional `wakame` / `Atlantic wakame` and `kelp` search overlaps; no forms or numeric data were integrated. |
