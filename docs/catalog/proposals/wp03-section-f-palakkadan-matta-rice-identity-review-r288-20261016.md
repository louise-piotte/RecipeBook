# WP03 Section F R288 — Palakkadan Matta rice identity review (2026-10-16)

## Review record

- **Status:** Integrated into the bundled reference catalog, research ledger, checklist, and roadmap on 2026-10-16; see the [R288 integration README](../batches/wp03-section-f-palakkadan-matta-rice-integration-r288-20261016/README.md).
- **Target anchor:** The open Section F item at [plan line 3895](../../RecipeBook-global-ingredient-catalog-plan.txt#L3904): “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.”
- **Scope:** Assess the named Palakkadan Matta whole-rice product as a distinct picker identity, including its boundary from generic red and parboiled rice, Québec French naming, recipe demand, and numeric/form behavior.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, **`Palakkadan Matta rice / riz Palakkadan Matta`**, under the exact source-attested regional name. Keep both alias arrays empty. Add no form, measure, density, mapping, recipe link, conversion, cooking yield, or substitution.
- **Proposed reference ID:** `ingredient-ref-palakkadan-matta-rice` (allocated in the R288 integration).
- **Proposal-local source-ID prefix:** `WP03-PALAKKADAN-MATTA-R288-20261016-S` (S01–S07). The IDs were unique and all seven URLs were unowned in the ledger when the proposal was reviewed; the IDs are now recorded on the accepted identity row.

## Candidate selection and existing decisions

The live Section F cereal/product sweep remains open at the target anchor. Current references include generic red rice, parboiled rice, generic rice with dry/cooked forms, and several named rice products, but no Palakkadan Matta identity. A whole-kernel product named Palakkadan Matta is supported by an active Indian geographical-indication registration and current Canadian product listings. This is a named regional rice product, not a proposal to normalize every red or parboiled rice product into one row.

The only close archive match is **Matta Aval**, reviewed as a red-rice-flake product. That review explicitly keeps the product-specific *Matta Aval* wording out of generic poha aliases; its Walmart source URL is not reused here. Flattened flakes are not the intact grain reviewed in this packet. Searches of the current plan, roadmap, proposal/batch archives, references, forms, legacy candidates, and research ledger found no focused Palakkadan Matta whole-rice decision or exact candidate owner.

At the review snapshot, the package has **1,661 references** and **126 forms**, the legacy-import file has **60 candidates**, the ledger has **2,010 records**, and the manifest has **114 recipes / 1,123 ingredient rows**. These are static review counts, not assertions about later concurrent edits.

## Identity and naming boundary

India's Geographical Indications Registry lists **Palakkadan Matta Rice** as registered, gives Kerala as the geographical area, and shows a 2025 renewal with registration valid through 2035 [S01]. The Kerala State Biodiversity Board's rice-variety publication describes Palakkad Matta as a group of ten varieties, with coarse bold grains and red pericarp; it does not describe one cultivar or one universal milling state [S02]. Kerala's Industries Department product description also identifies Palakkadan Matta as a regional rice product and records names including *red rice*, *rose matta rice*, and *Kerala red rice* [S03].

Canadian sellers currently list whole-rice items under the name **Palakkadan Matta rice**, including an English-language GTA listing that describes a product sourced from Palakkad [S04]. A Canadian French-language listing uses *riz Palakkadan Matta* in its description and title variant [S05]. These retail pages attest market names and individual products; they do not independently verify that a seller or SKU is an authorized GI user. The proposed catalog name stores the food term, not a certification or proof-of-origin claim. The French display is provisionally supported by Canadian product language; it is not represented as an OQLF or TERMIUM ruling. The Canadian French page was search-indexed but returned a cache miss on direct open, and its selected SKU was shown as sold out; neither stock nor availability is relied on.

Use the full **Palakkadan** qualifier. A Canadian retailer also describes “Kerala Matta” generically as parboiled red rice grown in Kerala and treats *Kerala red rice* and *Rose Matta* as seller-used alternatives [S07]. That wording is broader and does not establish that all products so named are the registered Palakkadan Matta product. Another current French Canadian marketplace listing uses the mixed-language title *Riz Divine Rice Rouge Matta* and classifies that particular SKU as red and parboiled [S06]. Keep those product-page variations as source-specific evidence rather than aliases.

Keep this identity distinct from:

- generic `red rice / riz rouge`, which names the broader edible red-bran food class;
- generic `parboiled rice / riz étuvé`, a processing class that can apply to multiple rice identities;
- generic rice and its dry/cooked forms, other named rice types, and red-rice flakes/poha; and
- cooked rice dishes, flour, rice bran, and rice used only as an ingredient in a blend.

Do not add `Matta rice`, `Kerala Matta rice`, `Kerala red rice`, `Rose Matta rice`, `Rosematta rice`, `red rice`, `parboiled rice`, `riz rouge`, `riz étuvé`, or the retailer spelling `Palakadan` as aliases. The proposed display itself already makes the full name and the contiguous query `Matta rice` searchable. The abbreviated and alternate seller names have broader or inconsistent scope; broad red-rice and parboiled-rice terms already have distinct catalog owners. Do not reuse the prior red-rice-flakes `Matta Aval` evidence as a whole-grain name.

## Proposed reference delta

If accepted, add only this identity row:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-palakkadan-matta-rice` |
| English display | `Palakkadan Matta rice` |
| French display | `riz Palakkadan Matta` (provisional Canadian product wording) |
| English/French aliases | `[]` / `[]` |
| Category | `GRAIN_AND_CEREAL` |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, conversions, yields, substitutions | None |

## Exact ownership and source allocation

At proposal review, normalized exact-key checks covered active reference IDs, displays and aliases, form IDs, labels and match terms, all legacy-candidate fields, and ledger record IDs and source URLs. No exact owner was found for the proposed ID or bilingual display pair, `Palakkadan Matta rice`, `Palakkadan Matta`, `riz Palakkadan Matta`, `Kerala Matta rice`, `Rosematta rice`, or the seller spelling `Palakadan Matta`. Broad neighboring owners remain:

| Neighbor | Current owner | Decision |
|---|---|---|
| Generic red rice | `ingredient-ref-red-rice` — `red rice / riz rouge` | Keep unchanged; do not add Matta or Kerala-red aliases. |
| Generic parboiled rice | `ingredient-ref-parboiled-rice` — `parboiled rice / riz étuvé` | Keep unchanged; parboiling is not an alias or reusable form for this candidate. |
| Generic rice states | `ingredient-ref-rice` with `dry rice / riz sec` and `cooked rice / riz cuit` forms | Keep these forms on generic rice; no transferable state or numeric behavior is established for Palakkadan Matta. |
| Red-rice flakes | `ingredient-ref-red-rice-flakes` — `red rice flakes / riz rouge aplati` | Keep the separate flattened product and its existing names. The prior *Matta Aval* source concerns flakes only. |

All seven new source URLs were checked against the research ledger and proposal/batch archive and have no exact existing URL owner. The prior `WP03-RRPOHA-20261012-S02` Walmart URL is already allocated to the red-rice-flakes review and is not reused. The seven source IDs are now attached to the new ledger record.

## Picker projection

The static projection uses the current phrase-first search rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): case, accent and punctuation normalization, complete word-phrase matching across reference names, aliases and attached form terms, then substring fallback. The candidate adds only its two display names and no attached forms or aliases.

| Query | Current → proposed results | Effect |
|---|---:|---|
| `Palakkadan Matta rice`, `Palakkadan Matta`, `riz Palakkadan Matta` | 0 → 1 | The qualified English and French display names resolve to the proposed identity. |
| `Matta rice`, `Matta` | 0 → 1 | These contiguous terms occur in the proposed English display; they are not aliases. This surfaces the specifically named Palakkadan product for shorter Matta queries. |
| `red rice`, `riz rouge` | 4 → 4 | Existing red-rice grain, flake, and flour results remain unchanged; no red-rice alias is added. |
| `parboiled rice`, `riz étuvé` | 1 → 1 | The generic process identity remains the sole result; no processing alias is added to Matta. |
| `rice`, `riz` | 70 → 71; 65 → 66 | Broad rice queries each gain one named rice result in already-large result sets. |
| `Matta Aval` | 0 → 0 | The prior product-qualified flake phrase is not attached to whole Matta rice. |

## Recipe demand, forms, measurements and substitutions

A read-only scan of all **114 manifest-listed recipe files** and their **1,123 structured ingredient rows** found no occurrence of `Palakkadan`, `Palakadan`, `Matta rice`, `Kerala Matta`, `Rosematta`, or `riz Palakkadan Matta`, and no link to the proposed ID. No recipe relink or recipe-text change is recommended.

Add no forms. The product is a retail dry-grain identity; the generic rice dry/cooked forms are not automatically transferable to a separately named regional product. The sources describe some Palakkadan Matta products as parboiled or partially milled, but the identity review does not define one universal process state or a form-to-form relation. Package sizes such as 5 kg, 10 kg, and 8 lb are SKU packaging, not recipe measures. No reviewed source gives a transferable household portion, mass-volume conversion, default density, dry-to-cooked yield, or preparation ratio suitable for this catalog. Culinary-use statements do not establish an equivalent substitution ratio or a dish/method-scoped rule. Add no global or contextual substitution.

## Source register

All sources were checked online on **2026-10-16**. The new IDs and URLs below are unallocated at proposal time.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-PALAKKADAN-MATTA-R288-20261016-S01` | Intellectual Property India, [Geographical Indications Registry: Palakkadan Matta Rice](https://search.ipindia.gov.in/GIRPublicSearch/Application/Details/36), current application record, renewed 2025. | Records the registered GI name, Kerala geographical area, registration status, and current validity through 2035. It does not establish that a particular Canadian SKU is an authorized GI product or supply recipe measurements. |
| `WP03-PALAKKADAN-MATTA-R288-20261016-S02` | Kerala State Biodiversity Board, [Aromatic and medicinal rice varieties of Kerala](https://keralaagriculture.gov.in/wp-content/uploads/2021/04/Aromatic_medicinal_rice_varieties.pdf), section “Palakkad Matta.” | Describes ten varieties in the Palakkad Matta group, its coarse bold grain and red pericarp, regional cultivation, and parboiling context. It does not specify one cultivar, milling state, package, or household measure. |
| `WP03-PALAKKADAN-MATTA-R288-20261016-S03` | Kerala Industries Department, [Palakkadan Matta Rice — One District One Product](https://industry.kerala.gov.in/images/pdf/odop/product-desc/ODOP_PRODUCT_DESCRIPTION-PALAKKAD.pdf), product description. | Government source identifies the Kerala product, describes coarse texture and culinary uses, and lists red rice, Rose Matta, and Kerala red rice as names. Those broader synonyms are retained as source context, not global aliases. The page does not establish Québec terminology. |
| `WP03-PALAKKADAN-MATTA-R288-20261016-S04` | Eraa Supermarket, [Eraa Palakkadan Matta Rice](https://eraa.ca/products/eraa-palakkadan-matta-rice), current GTA retailer product page. | Product title, direct-from-Palakkad claim, and 5 kg/10 kg package options. This is retailer-provided product information, not GI authorization evidence, a cooking specification, or a portion measure. |
| `WP03-PALAKKADAN-MATTA-R288-20261016-S05` | Spice Divine Canada (French), [Riz Palakadan Matta de qualité](https://spicedivine.ca/fr/products/quality-palakadan-matta-rice-8lb), product page indexed in French. | The title uses the one-k spelling `Palakadan`; the product description uses `riz Palakkadan Matta`. It is Canadian French product-language evidence only, not an OQLF ruling. Search indexing exposed the relevant text; direct open returned a cache miss, and the selected SKU was marked sold out. |
| `WP03-PALAKKADAN-MATTA-R288-20261016-S06` | Walmart Canada (French), [Riz Divine Rice Rouge Matta](https://www.walmart.ca/fr/ip/Riz-Divine-Rice-Rouge-Matta-8-Lb/3KJ5II1NFGIT), seller product page. | Gives the mixed French/English title, “Riz rouge” product type, “Étuvé” preparation, and South Indian cuisine category for one SKU. Marketplace information is seller supplied and not independently verified; do not infer that every Matta rice has this process or product name. |
| `WP03-PALAKKADAN-MATTA-R288-20261016-S07` | Veehacart Canada, [Bio Basics Kerala Matta Rice — Semipolished & Parboiled](https://veehacart.ca/products/kerala-matta-rice-semi-polished-parboiled-w4usz), retailer description. | Distinguishes seller usage of generic “Kerala Matta” from its Palakkadan synonym claim and describes one farm's product and bran treatment. It is one seller's terminology and formulation; the page was sold out when checked, so no availability or universal processing claim is made. |

## Recommendation

**Integrated identity-only `Palakkadan Matta rice / riz Palakkadan Matta`** with empty alias arrays. The provisional French display follows Canadian product wording and is not presented as an OQLF ruling. The row does not absorb generic red-rice, Kerala Matta, Rose Matta, or parboiled-rice terms. Existing rice forms, measures, conversions, yields, and substitution records remain unchanged. Section F remains open.
