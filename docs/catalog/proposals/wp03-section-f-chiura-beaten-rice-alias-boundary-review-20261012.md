# WP03 Section F — chiura / beaten-rice alias boundary (2026-10-12)

## Review record

- **Status:** Integrated as recommended on 2026-10-12. See the [integration record](../batches/wp02-wp03-wp04-wp05-manioc-chiura-capelin-vernonia-integration-20261012/README.md).
- **Scope:** Decide whether the Nepali product name chiura is a useful search alias for the existing flattened-rice identity. This is one regional terminology boundary under Section F's open regional/preprocessed-grain sweep. It does not reopen the recent durum-wheat-berries, maize-poha, cream-of-wheat, chiwda/chivda, red-rice-flakes, or generic poha-grade reviews.
- **Recommended disposition:** Add only the alias **chiura** to the existing flattened-rice reference's English alias list. Keep its English and Québec French displays unchanged, add no French alias, and do not allocate a new reference or form.

## Why this is unfinished and distinct

Section F leaves regionally significant cereal mixes and preprocessed grains open ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L2067)). The existing poha ledger decision accepts rice flakes, flaked rice, and beaten rice, plus the established Canadian French terms riz aplati and riz battu. It explicitly defers region-specific transliterations pending separate scope review. A repository-wide exact phrase search found no chiura text in the active references, forms, legacy identities, ledger, proposals, batches, plan, roadmap, or recipes.

The recent chiwda/chivda review is adjacent but not duplicative: it assessed a different spelling family that has both a rice-flake sense and current Canadian prepared-snack uses. This proposal assesses chiura, which Nepal's food standard defines as beaten rice and which Canadian Nepali retailers list with that English description. Keep chiura separate from chiwda/chivda; do not treat either as a spelling variant of the other.

## Proposed catalog delta

| Field | Recommendation |
| --- | --- |
| Existing reference | ingredient-ref-flattened-rice-poha |
| Existing English display | flattened rice (poha) |
| Existing fr-CA display | flocons de riz (poha) |
| Proposed alias | Add chiura to aliasesEn only |
| aliasesFr | Leave unchanged |
| New identity or form | None |
| Category | Leave GRAIN_AND_CEREAL unchanged |
| Recipe links | None |
| Measurements, forms, conversions, yields, substitutions | None |

This is a single-token search alias for the same broad flattened-rice product already named by the active identity. The alias does not make every product marketed with a chiura qualifier interchangeable with every poha product. Keep product, rice-color, cultivar, and preparation qualifiers out of the global alias.

## Exact live ownership audit

Read-only snapshot on 2026-10-12. Normalized-key comparison used the repository helper tools.seed_package.bundled_seed_package.normalize_search_key across active names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record identifiers, source text, and decisions.

| Artifact | Live snapshot | Exact ownership for chiura and qualified variants |
| --- | --- | --- |
| Active ingredient references | 1,250; SHA-256 c6e2de7a57665fc3795821387a24fdd5b5372f43f6ed3bea5810fe06ff5ff376 | No exact normalized key for chiura, chiura rice, chiura flakes, chiura beaten rice, rato chiura, seto chiura, taichin chiura, or kurum kurum chiura. |
| Ingredient forms | 94; SHA-256 55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b | No exact form label or match term for chiura or its qualified product names. |
| Legacy import identities | 66 candidates; SHA-256 bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f | No exact candidate name, alias, or candidate identifier. |
| Research ledger | 1,558 records / 5,418 source entries / 4,456 distinct source IDs; SHA-256 01453d4513a92b7855463ec94ad39fa6f67d64f789199d35728bfc0bf93f4db9 | No chiura source, decision, or record. The existing ingredient-ref-flattened-rice-poha record owns the related identity and synonym decisions, including the explicit hold on unevaluated regional transliterations. |
| Section F proposals and batches | Read-only search of current WP03 Section F files | No chiura proposal, batch, or prior source decision. The adjacent chiwda/chivda packet concerns a separate term family. |

The existing owner and relevant nearby identities are:

| Existing identity | Exact live names and boundary |
| --- | --- |
| ingredient-ref-flattened-rice-poha | flattened rice (poha) / flocons de riz (poha); aliases beaten rice, flaked rice, rice flakes, riz aplati, and riz battu; density null and unitMappings empty. This is the only proposed alias target. |
| ingredient-ref-red-rice-flakes | red rice flakes / riz rouge aplati, with red rice poha as an English alias. Keep source-qualified Rato Chiura out: local listings describe it as a red-rice product, and this proposal does not establish that it is a source-neutral synonym for the specialized red-rice-flakes row. |
| ingredient-ref-corn-poha | corn poha / poha de maïs, with maize-, makai-, makka-, and makkai-poha variants. This is a maize product, not rice chiura. |
| ingredient-form-flattened-rice-poha-thin, -medium, -thick | Existing commercial thickness grades under the generic flattened-rice identity. Chiura is a product name, not a new thickness or preparation form. |
| ingredient-ref-puffed-rice and ingredient-ref-rice-cereal | Keep puffed rice and crispy rice cereal separate from flattened rice. The Nepal food-processing source also distinguishes chiura from puffed-rice bhuja/murai. |

Related exact keys already owned by the generic flattened-rice row include beaten rice, flaked rice, rice flakes, riz aplati, and riz battu. No active or legacy row owns chiura. Longer active product names can still appear for broad phrase searches: for example, rice flakes can match both generic flattened rice and red rice flakes, and poha can match generic poha, red rice poha, and corn poha. Do not confuse those phrase-search results with exact normalized-key ownership.

## Picker phrase boundary

IngredientSearch.kt prefers complete word phrases across indexed terms, then falls back to partial matching. This is a source-code assessment, not live picker QA.

- After integration, the bare query **chiura** should return the existing flattened-rice row because it would have one exact alias owner.
- Add only the one-word alias chiura. Do not add rato chiura, seto chiura, taichin chiura, white chiura, red chiura, chiura rice, chiura flakes, or kurum kurum chiura as aliases. These are product/color/cultivar or preparation-qualified phrases and need their own scoped review.
- In particular, the source uses Rato Chiura and Seto Chiura for different rice inputs and separately lists a crispy-beaten-rice product. Do not make a bare chiura query stand for a color, cultivar, or crisping treatment.
- Do not add dahi chiura or samay baji: these name prepared meals or platters that contain other ingredients.
- Keep chiwda/chivda out of this identity; the current ledger hold for those terms remains unchanged.
- A shorter chiura alias does not make the longer qualified query rato chiura resolve to the generic row under the current phrase matcher. This proposal does not change ranking or establish how a future picker should handle an explicit qualified product.

## Recipe-corpus demand audit

The complete manifest-order corpus was scanned, including serialized recipe text and every ingredient row's original text and ingredient-name fields. Search terms included chiura, chiura rice, chiura flakes, chiura beaten rice, rato chiura, seto chiura, taichin chiura, kurum kurum chiura, dahi chiura, baji chiura, chiwra, chuira, chura, chiura poha, roasted beaten rice, beaten rice flakes, flattened rice, beaten rice, rice flakes, flaked rice, riz battu, riz aplati, and flocons de riz.

| Corpus measure | Result |
| --- | ---: |
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Recipe-file bytes | 753,736 |
| Manifest-order recipe corpus SHA-256 | 3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3 |
| Candidate phrase hits in full recipe files | 0 |
| Candidate phrase hits in ingredient rows | 0 |

There is no bundled recipe demand, quantity, form, or recipe link for chiura.

## English and Québec French evidence

The identity relationship is well supported for English search. Nepal's current food standard labels its human-consumption product Chiura (Beaten rice) and defines the processing scope. A Canadian English retailer lists beaten-rice products with Seto Chiura and Rato Chiura in their product titles. A Mississauga retailer's title and product description pair White Beaten Rice with Taichin Chiura and describe flattened rice; the page was marked out of stock when reviewed, so it supports product wording but not current availability.

The current French-Canadian display remains flocons de riz (poha). Existing Canadian French evidence for that display and its accepted riz aplati / riz battu aliases is already recorded in the live ledger (WP03-S95 and WP03-POHA-GRADES-20261010-S02). Those sources support the existing French wording, not chiura as a French term. A targeted OQLF/TERMIUM and Canadian French search did not find a Québec terminology entry or Canadian French product label using chiura. Do not construct a French alias or replace the current display. A France-based restaurant description of chiura as toasted rice flakes is outside fr-CA and describes a preparation qualifier; it is not evidence for this proposal's French display.

## Numeric, form, process, and substitution limits

- **Identity only:** If accepted, the alias belongs to ingredient-ref-flattened-rice-poha. It creates no new ingredient reference or ledger candidate.
- **Forms:** Add no form. Existing thin, medium, and thick poha grades remain unchanged. Do not add dry, cooked, roasted, red, white, or Taichin forms from product names.
- **Density and unit mappings:** Leave defaultDensity null and unitMappings empty. Package weights and the Nepal standard's quality limits are not volume/mass observations.
- **Conversions and yields:** Add no rice-to-chiura conversion, dry-to-prepared yield, cooking yield, water ratio, or package yield. The standard's process and product-quality requirements are not recipe quantities.
- **Substitutions:** Add no substitution involving generic rice, rice flakes, red rice flakes, corn poha, puffed rice, or crispy rice cereal. Shared uses as breakfast, snack, or accompaniment do not establish interchangeable recipe performance or a ratio.
- **Recipes:** Add no recipe link or ingredient-line change; the corpus has zero demand.

## Source register

The proposal-specific source IDs below were checked against the live ledger and proposal files and were unallocated at review time. Existing source IDs are identified as reused evidence rather than new entries.

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| WP03-CHIURA-20261012-S01 | Government of Nepal, Department of Food Technology and Quality Control, [Mandatory Standards for Food and Feed Products 2082](https://spsenquiry.gov.np/rules/Mandatory-Food-and-Feed-Standards-compiled-2082-1777275726.pdf), section 7.26, Chiura (Beaten rice). | Primary government food standard. It scopes chiura to human-consumption product and defines soaked/heated paddy that is flattened, hulled, and dried; it also describes roasted beaten rice separately. Supports the product-name relationship and preparation boundary in Nepal, not a Canadian or Québec name. The compositional quality limits do not support recipe measurements. |
| WP03-CHIURA-20261012-S02 | Ganga P. Kharel, Dilip Subba, Pushpa P. Acharya, and Basanta K. Rai, [Traditional Foods of Nepal](https://nastlibrary.nast.org.np/elibrary/filestore/1/9/0_d5666a15fdb5bfd/190_f8d6b5e1ad6022d.pdf), Nepal Academy of Science and Technology, 2008, chapter 1, pp. 7–8. | Technical food-processing reference names chiura as beaten rice flakes, describes its ready-to-serve use and traditional/mill processes, and distinguishes puffed-rice bhuja/murai. It is older Nepal-focused context, not current Canadian terminology or a source for numeric catalog behavior. |
| WP03-CHIURA-20261012-S03 | Danphe Stores, Vancouver, [current online store](https://danphestores.com/), Rice & Flour product listings and delivery information. | Current Canadian retailer lists DRUKCAN Bhaktapure Beaten Rice (Seto Chiura), Taichin Beaten Rice (Rato Chiura), and a separate Hilife Kurum Kurum Chiura (Crispy Beaten Rice) product. Its site identifies a Vancouver store and Canada-wide delivery. It supports Canadian English product wording; retailer titles do not establish universal color, cultivar, crispness, or French terminology. |
| WP03-CHIURA-20261012-S04 | R&R Grocery, Mississauga, [White Beaten Rice/Taichin Chiura](https://randrgrocery.ca/products/white-beaten-rice-taichin-chiura-2lb), product name, description, and ingredient declaration. | Canadian retail page pairs White Beaten Rice with Taichin Chiura and calls it flattened rice; ingredient is beaten rice and origin is Nepal. The page showed out-of-stock, so no availability claim is made. Its 2 lb package is SKU-specific and not a recipe measure. |
| WP03-CHIURA-20261012-S05 | Le Fooding, Paris, [Restaurant Maiya](https://ios.lefooding.com/restaurants/maiya), French restaurant description. | France-based text describes chiura with a French rice-flake phrase. It is not fr-CA evidence, not an authority term, and its phrase describes toasted flakes; it is cited only to document why it is excluded from the Québec French naming decision. |

Existing Canadian French sources reused for the unchanged display boundary: WP03-S95, Atlantic Superstore, [Flocons de riz (Poha)](https://www.atlanticsuperstore.ca/fr/clpplp/clpplp/clpplp/food/international-foods/c/58044), and WP03-POHA-GRADES-20261010-S02, Spice Divine, [Thin Poha](https://spicedivine.ca/fr/products/from-the-earth-thin-poha-800g). The former supports the current display; the latter records the Canadian French product wording riz aplati and riz battu. Neither source names chiura.

## Integration result

Added only `chiura` to `ingredient-ref-flattened-rice-poha.aliasesEn`. Kept the existing displays, French aliases, and forms unchanged; added no French alias, qualified product terms, quantities, conversions, yields, recipe links, or substitutions. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`. See the [integration record](../batches/wp02-wp03-wp04-wp05-manioc-chiura-capelin-vernonia-integration-20261012/README.md).
