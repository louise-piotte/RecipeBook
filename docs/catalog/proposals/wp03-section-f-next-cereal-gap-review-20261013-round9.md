# WP03 Section F — sorghum couscous product-boundary review (2026-10-13, round 9)

## Review record

- **Status:** Proposal only; root integration has not occurred.
- **Scope:** Whether a distinct sorghum couscous ingredient can safely own `sorghum couscous / couscous de sorgho` in the shared picker.
- **Open checklist:** The Section F item for regionally significant cereal mixes and preprocessed grains remains open at [plan line 2259](../../RecipeBook-global-ingredient-catalog-plan.txt#L2352).
- **Recommendation:** Keep the candidate out of active references for now. Record a ledger-only unresolved candidate as `candidate-sorghum-couscous`, with no active display, alias, form, measure, recipe link, or substitution. Sorghum couscous is a real processed food in some regions, but the same French label is also applied to products with different processes and to composite products. No current Québec retail product page reviewed settles that product boundary.

## Why this is a distinct open gap

The existing `ingredient-ref-couscous` is the unqualified durum-wheat semolina product. OQLF defines the treated cereal as agglomerated durum-wheat semolina grains that are steamed and dried, and Codex defines its standardized product on the same durum-wheat basis. The live catalog separately contains `ingredient-ref-millet-couscous-thiere` for millet couscous (thiéré), and `ingredient-ref-pearl-couscous` for pearl couscous. Neither row covers a sorghum-based processed cereal.

Sorghum grain, sorghum flour, sorghum semolina, sorghum grits, and puffed sorghum also have separate active rows. They describe other ingredients or milling products. They do not own a finished sorghum couscous product. The earlier thiéré review is millet-specific, and the maize-arraw and oats decisions are separate products. Archive search found no focused sorghum-couscous identity, alias, measurement, or picker-boundary review.

Research sources confirm that sorghum couscous exists as a processed food. ICRISAT describes Sahelian sorghum couscous as steamed flour granules; more recent studies produce couscous from sorghum flour or sorghum semolina. However, the meaning of the retail label is not stable across the reviewed sources. The Niger Chamber of Agriculture report distinguishes rolled couscous from precooked broken grain and says some products sold as “couscous” are actually unrolled brisures; one example is labeled “couscous de sorgho aux légumes.” A current Québec sorghum-grain retailer instead uses “couscous revisité” as a suggested use for whole sorghum. These sources do not establish that a Québec consumer entering `couscous de sorgho` means one dry, sorghum-only, rolled product.

## Identity and Québec French boundary

The candidate identity is meaningful in regional cereal processing: sorghum flour can be wetted, agglomerated into granules, steamed, and either served or dried for storage. A 2025 study independently makes fine couscous from decorticated white *Sorghum bicolor* semolina. These are not the same product as whole sorghum kernels, flour, semolina, grits, or a prepared couscous dish.

Québec evidence supports the words but leaves the ingredient scope open. The MSSS/ITHQ *Guide d’accompagnement pour restaurants familiaux* lists “couscous de semoule de blé entier, de boulghour, de millet, de quinoa ou de sorgho.” That is a Québec educational guide’s food suggestion, not a current sorghum-couscous package label or a terminology ruling. OQLF’s technical entry reserves the unqualified ingredient term *couscous* for durum-wheat semolina; its separate dish entry documents the prepared-food sense. OQLF supports *sorgho* as the French name of *Sorghum bicolor*, but does not define the compound *couscous de sorgho*.

The current Longueuil retailer Mako Foods Exotik lists `Sorgho (400 g)` as a cereal product and suggests “couscous revisité” among its uses. The page does not describe its processing or identify a processed couscous product. It shows why a sorghum product used in a couscous-style dish must stay separate from processed sorghum couscous. Do not alias either phrase to grain sorghum.

The exact candidate display, if later supported, would be `sorghum couscous / couscous de sorgho`, with both alias arrays empty. The display keeps the cereal qualifier explicit and is directly attested in research and Québec educational wording. It is not presented as OQLF-approved terminology. The term is held because the picker cannot encode whether a source means rolled flour granules, precooked unrolled broken grain, a vegetable-enriched product, or a prepared dish.

Keep these boundaries:

- **Generic wheat couscous:** remains `ingredient-ref-couscous`; do not add `sorghum couscous` or `couscous de sorgho` there.
- **Millet couscous (thiéré):** remains `ingredient-ref-millet-couscous-thiere`; do not add sorghum terms to it.
- **Pearl couscous:** remains `ingredient-ref-pearl-couscous`; it is a different pasta-like product.
- **Sorghum grain, flour, semolina, and grits:** remain distinct processing inputs/products. Do not treat couscous as a form of any of them.
- **Unrolled sorghum brisures, vegetable-enriched cereal products, and prepared dishes:** remain outside the proposed single-ingredient couscous scope.

## Exact proposed fields if the identity boundary is resolved

| Field | Conditional value | Current disposition |
|---|---|---|
| Ledger candidate ID | `candidate-sorghum-couscous` | Add only as a ledger candidate if the hold is recorded. |
| Future reference ID | `ingredient-ref-sorghum-couscous` | Keep unallocated. |
| English display | `sorghum couscous` | Do not activate. |
| French display | `couscous de sorgho` | Directly attested wording, but the Québec ingredient/product boundary is unresolved. |
| English aliases | `[]` | Do not add aliases. In particular, do not add `sorghum grain` or `sorghum flour`. |
| French aliases | `[]` | Do not add aliases. In particular, do not add bare `couscous`, `couscous de mil`, or `couscous revisité`. |
| Category | `GRAIN_AND_CEREAL` | Appropriate only for a later single-ingredient processed cereal row. |
| Density / unit mappings | `null` / `[]` | No transferable value. |
| Forms / recipe links / active rules | none | No state forms, bundled-recipe links, conversions, yields, or substitutions are supported. |

For a ledger-only hold, use `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Attach the new sources to `candidate-sorghum-couscous` and add an `unresolved` decision. Do not change the research states on the existing couscous or sorghum ingredient rows.

## Current ownership and archive audit

The live audit covered **1,342 ingredient references**, **98 forms** and their match terms, **64 legacy candidates**, **1,651 ledger records**, the Section F checklist, proposal archive, and batch archive.

| Surface | Current result |
|---|---|
| Existing couscous identities | `ingredient-ref-couscous` (couscous / couscous); `ingredient-ref-millet-couscous-thiere` (millet couscous (thiéré) / couscous de mil (thiéré)); `ingredient-ref-pearl-couscous` (pearl couscous / couscous perlé). |
| Existing sorghum identities | `ingredient-ref-grain-sorghum`, `ingredient-ref-puffed-sorghum`, `ingredient-ref-sorghum-flour`, `ingredient-ref-sorghum-grits`, and `ingredient-ref-sorghum-semolina`. None names couscous. |
| Exact phrase ownership | No exact normalized owner for `sorghum couscous`, `couscous de sorgho`, `couscous de sorgho blanc`, or the proposed ID in active displays/aliases, form labels/match terms, or legacy candidates. The generic `couscous` row owns the shorter phrase only. |
| Forms | No current form label or match term owns sorghum-couscous wording. No form belongs to the proposed identity. |
| Ledger | No `candidate-sorghum-couscous` record exists. The generic couscous record already reuses OQLF/Codex source IDs `WP03-S164` and `WP03-S166`; the OQLF *sorgho* source is already recorded as `WP03-SORGHUM-SEMOLINA-20261013-S05`. Reuse these; do not register the same source twice. |
| Prior proposal/batch coverage | No focused sorghum-couscous decision was found. Thiéré material is millet-specific; “couscous” mentions in other cereal packets are adjacent boundaries, not a sorghum row or hold. |
| Proposed identifiers | `candidate-sorghum-couscous`, `ingredient-ref-sorghum-couscous`, `sorghum-couscous-picker-boundary-hold-20261013`, and prefix `WP03-SORGHUM-COUSCOUS-R9-20261013-` are absent from the live ledger and archive. |

## Picker projection

This static projection follows the accent-folding normalizer and phrase-first / substring-fallback matcher in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It includes all reference aliases and form search terms. The candidate row shown is conditional; the recommendation is to keep it out of the active picker.

| Query | Current results | Conditional future result | Boundary |
|---|---|---|---|
| `couscous` | 3: generic couscous; millet couscous (thiéré); pearl couscous | 4, adding sorghum couscous | A distinct labeled option is possible, but the query is broad and does not indicate product process or whether the source means a prepared dish. |
| `couscous de sorgho`; `sorghum couscous` | No results | `ingredient-ref-sorghum-couscous` only | The singleton match is unsafe while regional product labels also refer to unrolled brisures or composites. |
| `sorghum`; `sorgho` | 5: grain, puffed, flour, grits, and semolina rows | 6, adding sorghum couscous | Each future result would have a distinct label, but the broader query also matches the plain Québec sorghum product used in a couscous-style dish. |
| `couscous de mil`; `millet couscous` | `ingredient-ref-millet-couscous-thiere` only | Unchanged | Millet thiéré remains independent. |
| `couscous perlé`; `pearl couscous` | `ingredient-ref-pearl-couscous` only | Unchanged | Pearl couscous remains independent. |
| `grain sorghum`; `sorghum flour`; `sorghum semolina`; `sorghum grits`; `puffed sorghum` | Each selects its existing matching identity only | Unchanged | Processing inputs and other sorghum products retain their exact owners. |
| `couscous revisité` | No result | No result | Do not make a whole-sorghum dish/use phrase an alias of a dry processed ingredient. |
| Candidate form queries | No matching current forms | No new forms | Keep forms empty; sources describe both immediate steamed and dried/storable product states but do not establish a shared reusable form taxonomy. |

The broad-query effects are not inherently disqualifying by result count. The hold is about **what the qualified name would own**: sources use `couscous de sorgho` for products that do not share the rolled-granule identity documented in the research literature.

## Recipe-corpus demand

The scan parsed every manifest-listed recipe file and all ingredient rows, and checked every serialized string for candidate and neighboring phrases. It covered `sorghum couscous`, `couscous de sorgho`, `couscous de sorgho blanc`, `couscous de sorgho aux légumes`, `couscous sorgho`, `sorgho couscous`, `couscous revisité`, wheat/millet/pearl couscous, and the active sorghum grain/flour/semolina/grits/puffed terms.

- **0 / 114 recipe files** contain a candidate or neighboring phrase.
- **0 / 1,123 ingredient rows** contain a candidate or neighboring phrase.
- No recipe link, recipe text change, or recipe-derived demand is supported.

## Measurements, forms, and substitutions

### Measurement and product state

The sources do not support a household measure, reusable conversion, density, or form:

- ICRISAT’s 20 g input is a small-scale **laboratory quality test**, not a serving. Its detailed procedure reports sieve sizes, steaming intervals, and dried-product handling; these describe a specific traditional process and do not define a package-wide cooked/dry form or household quantity.
- The 2006 cultivar study reports experimental process values, including 15.0–18.2 mL added water across different decortication levels, a 15-minute steam, and 50 °C drying for 16 hours. Its yield is the study’s percentage of 1–2 mm particles. These are controlled processing conditions, not a cup measure, ingredient density, or conversion for retail couscous.
- The 2022 study measures density and water/oil absorption on differently preprocessed cereal samples. Its functional-property results are process- and sample-specific and are not a reusable bulk-density value in g/ml.
- RECA’s 1/4 L rehydration instruction concerns the distinct product *brabousko*; do not transfer it to sorghum couscous.
- The current Moroccan marketplace listing says its white-sorghum couscous contains sorghum grits and sorghum flour but publishes no ratio, household volume, or process specification. Its composition is product-specific.

Record no numeric observation from these studies as a household portion. Leave active density null, mappings empty, and forms absent. The measured variables are technically relevant but do not establish a reusable mass-volume or dry-to-cooked relation.

### Substitution

The Québec guide lists sorghum alongside wheat, bulgur, millet, and quinoa couscous in a whole-grain food suggestion; it does not say that one can replace another at a 1:1 amount in a specific recipe. The 2006 study assesses cultivar processing and quality, not a recipe replacement. No reviewed source validates sorghum couscous as a general substitute for wheat couscous, whole sorghum, millet thiéré, or another grain ingredient. Keep `substitutionResearchState: researched_no_supported_substitute`, but do not create an active rule or a recipe-line substitution link. This finding means no supported rule was found in this review; it does not rule out every contextual use.

## Source register and ID-collision audit

The eight new source IDs use prefix `WP03-SORGHUM-COUSCOUS-R9-20261013-`. The prefix had zero occurrences among the live ledger’s **5,300 unique source IDs** and in prior proposal/batch records. Reuse existing OQLF/Codex IDs rather than duplicating them. No measurement-observation or substitution-finding ID is proposed.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| Reuse `WP03-S164` | Office québécois de la langue française, [couscous (céréale traitée)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502225/couscous). | Defines the unqualified Québec ingredient name as agglomerated durum-wheat semolina grains, steamed and dried. It does not define sorghum couscous. |
| Reuse `WP03-S165` | OQLF, [couscous (mets)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502206/couscous). | Documents the separate prepared-dish sense; it does not name a sorghum-based ingredient. |
| Reuse `WP03-S166` | FAO/WHO Codex Alimentarius, [Standard for Couscous CXS 202-1995](https://www.fao.org/input/download/standards/65/CXS_202e.pdf). | Standardized durum-wheat couscous product boundary; not a standard for sorghum couscous. |
| Reuse `WP03-SORGHUM-SEMOLINA-20261013-S05` | OQLF, [sorgho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho). | Supports the Québec French base term and botanical reference *Sorghum bicolor*; it does not approve `couscous de sorgho`. |
| `WP03-SORGHUM-COUSCOUS-R9-20261013-S01` | MSSS / Institut de tourisme et d’hôtellerie du Québec, [Guide d’accompagnement pour restaurants familiaux — Guide des grains entiers](https://m3.ithq.qc.ca/collection/00000053.pdf), p. 164. | Lists couscous made from whole-wheat semolina, bulgur, millet, quinoa, or sorghum. Québec educational wording only; not a product specification, OQLF term, or current package label. |
| `WP03-SORGHUM-COUSCOUS-R9-20261013-S02` | ICRISAT, Sidibe, Diarra, and Scheuring, [“Sorghum Couscous: Quality Considerations”](https://oar.icrisat.org/789/1/RA_00049.pdf), in *Proceedings of the International Symposium on Sorghum Grain Quality* (1982), pp. 109–113. | Defines Sahelian sorghum couscous as steamed cereal-flour granules and describes agglomeration, sieving, steaming, optional drying, and reconstitution. Its laboratory method and regional scope do not define one current retail formula. |
| `WP03-SORGHUM-COUSCOUS-R9-20261013-S03` | OUP, [Extent of decortication and quality of flour, couscous and porridge made from different sorghum cultivars](https://academic.oup.com/ijfst/article/41/6/698/7863817), *International Journal of Food Science & Technology* 41(6), 2006. | Primary study of four food-grade cultivars and 10–40% decortication. Couscous is flour/water agglomerated, steamed, dried, and sized; processing values vary by cultivar and decortication. It is not household-measure evidence. |
| `WP03-SORGHUM-COUSCOUS-R9-20261013-S04` | North African Journal of Food and Nutrition Research, [Influence of Grain Size on the Agglomeration and Quality of Fine Couscous Derived from Decorticated White *Sorghum bicolor* L.](https://www.najfnr.com/home/article/view/589), 2025. | Primary study makes sorghum semolina from decorticated white sorghum and agglomerates it into couscous. Grain size and decortication affect yield and product quality; it does not establish a Québec consumer name or household measure. |
| `WP03-SORGHUM-COUSCOUS-R9-20261013-S05` | Réseau National des Chambres d’Agriculture du Niger, [Typologie des produits locaux transformés avec des céréales, note 1](https://reca-niger.org/IMG/pdf/typologie_produits_locaux_avec_cereales_note1_2021.pdf), pp. 4–5. | Describes rolled, steamed, dried wheat couscous, then explains that some local products labeled couscous are actually precooked unrolled broken grain; its example list includes `couscous de sorgho aux légumes`. This regional nomenclature caution is not a universal ruling for every sorghum product. |
| `WP03-SORGHUM-COUSCOUS-R9-20261013-S06` | Mako Foods Exotik, Longueuil, [Sorgho (400 g)](https://www.makofoods.ca/products/sorgho), current product page checked 2026-10-13. | Current Québec retailer lists a whole-sorghum grain product and suggests it for “couscous revisité.” It does not list sorghum couscous or establish a dry processed product. |
| `WP03-SORGHUM-COUSCOUS-R9-20261013-S07` | Coop Marketplace, [Couscous de Sorgho blanc](https://coopmarketplace.ma/produit/couscous-de-sorgho-blanc/146), current indexed listing checked 2026-10-13. | Marketplace listing says the product contains white sorghum grits and white sorghum flour. It provides no proportions, process, package measurement, or Québec market evidence; the page was not retrievable directly in this review. |
| `WP03-SORGHUM-COUSCOUS-R9-20261013-S08` | Laya et al., [Effect of different processing methods on maize, sorghum and millet flours on nutritional couscous quality consumed in the Far North region of Cameroon](https://www.sciencedirect.com/science/article/pii/S2666154322000618), *Journal of Agriculture and Food Research* 9, 2022. | Primary study evaluates cereal-specific processing variants and reports density and absorption properties. These are experimental sample properties; they do not establish a general household conversion or product form. |

## Review-time baseline snapshot

Hashes are SHA-256 of exact file bytes. The corpus fingerprint hashes each manifest-relative recipe path, NUL, exact recipe bytes, and a trailing NUL in manifest order.

| Artifact | Review-time coverage | SHA-256 / fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,342 references; 430,132 bytes | `71e1a1aa77fb9c6063c2b85f5178b5784f949b692ea7471f11415427ff766c0e` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,651 records; 6,309 source entries; 5,300 distinct source IDs; 341 measurement observations; 190 substitution findings; 6,278,782 bytes | `60c4b13c5bd39aa4e18fe2dd5abe8b0e1be337d98b1b1d75c37a97a0cfa60aa5` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Disposition

**Hold `ingredient-ref-sorghum-couscous` out of the active picker.** If root records this review, add only a ledger candidate `candidate-sorghum-couscous` with the reviewed sources and an `unresolved` decision. Do not add the active row, any alias, a form, a measurement observation, or a substitution rule. Reopen after a current Québec bilingual retail label or producer specification identifies a single-ingredient rolled/agglomerated sorghum product and settles whether it is dry/precooked, separate from unrolled brisures and composites. The recipe bundle has no matching demand.

## Root integration result

Added only the ledger candidate `candidate-sorghum-couscous`, with the reviewed sources and one `unresolved` decision. Reused four existing source IDs rather than duplicating their registrations. No active reference, alias, form, measurement observation, recipe link, or substitution was added. No app, unit, instrumentation, emulator, or application tests were run because the change only adds data to the database research ledger JSON.
