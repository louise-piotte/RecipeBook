# WP03 Section F: dried sprouted buckwheat grain review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Accepted and integrated as `ingredient-ref-sprouted-buckwheat`. This follow-up updates this review only; no shared catalog, ledger, plan, roadmap, recipe, or generated file was changed.
- **Scope:** One distinct cereal grain product within the plan's open Section F review of regionally significant cereal mixes and preprocessed grains ([plan, line 2146](../../RecipeBook-global-ingredient-catalog-plan.txt#L2239)).
- **Accepted identity:** One identity-only `GRAIN_AND_CEREAL` reference for **`sprouted buckwheat, dried / sarrasin germé séché`** is integrated as `ingredient-ref-sprouted-buckwheat`. It is scoped to whole edible buckwheat groats germinated and dried to shelf-stable moisture for sale as a grain ingredient. The row has no aliases, `IngredientForm`, density, unit mapping, active measure, package yield, recipe link, conversion, or active substitution rule.
- **Existing adjacent decisions preserved:** Keep integrated raw and roasted buckwheat groats separate. Round8's sprouted-barley identity is now integrated as `ingredient-ref-sprouted-barley`; it is a separate grain. Do not reopen round7's held sprouted-rye naming review.

## Why this is a distinct open candidate

The Section F checklist continues to leave preprocessed grain products open. Before this review, no focused review or hold for a dried sprouted-buckwheat grain was found. The round5 raw-buckwheat-groats integration is expressly scoped to raw, unroasted kernels; it is not ownership of a germinated product. Round8's sprouted-barley identity has since been integrated; that separate grain remains unchanged.

At proposal time, the catalog contained separate references for buckwheat flakes, buckwheat flour, creamy buckwheat hot cereal, puffed buckwheat, raw buckwheat groats, and roasted dry buckwheat groats, with no sprouted-buckwheat identity. The accepted integration adds that distinct identity. A whole grain that has been germinated and then dried is not the raw/unroasted groat, toasted/roasted groat, flour, flake, puffed grain, prepared cereal, sprouting seed, live sprout, or malted product.

Second Spring Foods, an Ontario producer selling to retail locations across Canada, currently lists Organic Sprouted Buckwheat as a whole-grain product. Its product page says the whole buckwheat groat is soaked and sprouted, then dried back to shelf-stable moisture. Québec sources independently use `sarrasin germé` for the edible grain product; a Québec grain processor also lists a product phrase printed as `sarrasin nue germé séché`, separate from its malted buckwheat products. Together these sources support a scoped dried-grain identity, while not establishing a universal hull state, organic qualifier, cultivar, sprouting duration, or drying process.

## Current package, ownership, and recipe audit

Snapshot and ownership checks were performed against the current workspace on 2026-10-12. Exact ownership used `tools/seed_package/bundled_seed_package.py::normalize_search_key`, which folds case, accents, compatibility characters, punctuation, and repeated whitespace.

Artifact hashes below cover exact file bytes. The recipe corpus fingerprint hashes each manifest-relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Current count or result | Bytes | Exact-byte SHA-256 / corpus fingerprint |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,317 references | 421,694 | `6427dd4cf5c2f5e94292b843255aec2b2cfe3517af1f3ef9aa99f407663c464f` |
| `ingredient-forms.v1.json` | 98 forms; no buckwheat/sarrasin form | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `docs/catalog/legacy-import-identities.v1.json` | 64 candidates; no buckwheat/sarrasin candidate | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,625 records; 5,963 source entries; 8 generic unit conversions | 5,914,722 | `4b06543735ef656679d3025939b535eb918d965a0190b67daddd412c4b7170bd` |
| `package-yields.v1.json` | 1 entry; none for buckwheat or this candidate | 853 | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| `substitution-rules.v1.json` | 0 global rules | 3 | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 contextual rules | 3 | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Eight current references contain a canonical or alias buckwheat/sarrasin term: `ingredient-ref-buckwheat-flakes`, `ingredient-ref-buckwheat-flour`, `ingredient-ref-creamy-buckwheat-hot-cereal`, `ingredient-ref-puffed-buckwheat`, `ingredient-ref-raw-buckwheat-groats`, `ingredient-ref-roasted-buckwheat-groats-dry`, `ingredient-ref-soba-noodles`, and the integrated `ingredient-ref-sprouted-buckwheat`. Their current names and aliases remain unchanged; the last two are distinct soba-noodle and dried sprouted-grain identities. Normalized exact-key checks show exactly one owner for the integrated ID and canonical names `sprouted buckwheat, dried` and `sarrasin germé séché`; neither identity has aliases, and the other checked unqualified/alternate phrases have no exact owner. The `WP03-SPBUCKWHEAT-20261012` source prefix is allocated to this record. The round8 sprouted-barley reference and its seven ledger sources remain present but do not own buckwheat terms.

The complete manifest-listed recipe corpus was parsed in manifest order. The scan found **zero candidate phrase matches, zero buckwheat/sarrasin ingredient rows, and zero matching recipe files** among the 114 files and 1,123 ingredient rows. Its byte count and path/NUL/content/NUL fingerprint are recorded above; no recipe link or recipe-text change is proposed.

The integrated ledger record is `ingredient-ref-sprouted-buckwheat`, with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: researched_no_supported_substitute`. Its eight sources, S01 through S08, each occur exactly once in the live ledger and are attached to this record. Its substitution finding `wp03-sprouted-buckwheat-no-supported-general-substitute-20261012` records the maker's 1:1 statement as a rejected source-specific candidate; no active global or contextual rule exists. Existing neighboring buckwheat records are not reused as owners for this processed product. The newly integrated `ingredient-ref-urid-flour` is `urid flour / farine de haricot urd`, with no aliases; its five-source ledger record contains no buckwheat/sarrasin term. It does not own or collide with this identity. No density, unit mapping, package yield, unit conversion, or active substitution rule exists for sprouted buckwheat. The package's sole yield is for canned black beans; the eight generic ledger unit conversions concern other ingredients.

## Integrated catalog identity and boundary

| Integrated field | Value |
|---|---|
| ID | `ingredient-ref-sprouted-buckwheat` |
| English display | `sprouted buckwheat, dried` |
| French display | `sarrasin germé séché` |
| English aliases | None |
| French aliases | None |
| Category | `GRAIN_AND_CEREAL` |
| Identity scope | Whole edible buckwheat groats sold as a food ingredient after germination and drying to shelf-stable moisture. No universal hull state, organic status, germination duration, or drying temperature is asserted. |
| Forms | None |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` |
| Recipe links, package yields, conversions, substitutions | None |

Keep this identity separate from:

- raw/unroasted and roasted/toasted buckwheat groats, cracked buckwheat, buckwheat flour (including sprouted flour), buckwheat flakes, puffed buckwheat, creamy buckwheat hot cereal, soba noodles, and prepared kacha/kasha;
- live buckwheat sprouts or shoots, buckwheat seed sold to grow sprouts, and home-sprouting instructions;
- malted buckwheat, including the Québec maker's separately listed naked sprouted-and-malted and hull-on sprouted-and-malted products;
- buckwheat-containing breads, granolas, toppings, and other composite products.

Do not add broad aliases such as `buckwheat`, `buckwheat groats`, `germinated buckwheat`, `buckwheat sprouts`, `blé noir`, `sarrasin vert`, or `sarrasin nu`. The first terms are unqualified, state-ambiguous, or already represented by other products; `blé noir` and `sarrasin vert` are not shown by these sources to be same-scope labels for the dried sprouted product; and the manufacturer's `nu` qualifier is product-specific rather than established for all sprouted-buckwheat groats.

## Identity, naming, form, measurement, and substitution findings

| Concern | Evidence and decision |
|---|---|
| Product identity and state | Second Spring's current Canadian product page names Organic Sprouted Buckwheat, says the whole groat is soaked and sprouted, and says the grain is dried to shelf-stable moisture [S01]. Its separate sprouting-process page describes the maker's general drying practice [S02]. Accept the scoped whole-grain identity; do not equate it with a living sprout or with flour. This is evidence about the named product and producer process, not a universal sprouting or drying specification. |
| English naming and market status | The Ontario-based Second Spring page currently lists 400 g and 1.5 kg product sizes, and the maker says its products are sold at selected retail locations across Canada [S01, S03]. Use the concise ingredient name `sprouted buckwheat, dried`; do not copy the product's `organic` claim into the generic name or alias list. Package sizes establish current SKU options only. |
| Québec French wording | Aliments Trigone lists `Sarrasin germé biologique` as a food product and says it can be used as-is or cooked as a side [S04]. A Québec retailer lists `Sarrasin Germé Biologique cru 400g` with the same use pattern [S05]. Caux-Laflamme's Québec-grown food-grain list separately names `Sarrasin nue germé séché`, `Sarrasin nue germé malté`, and `Sarrasin avec écorce germé malté` [S06]. Farinart's French grain page lists sarrasin as a germinated product and explains that it dries its sprouted grains [S07]. These sources support the adopted descriptive French display `sarrasin germé séché`; the GDT supports the base word `sarrasin` but does not define a sprouted-grain compound [S08]. Caux-Laflamme's landing page prints `nue` (sic) and the linked product detail returned a cache miss; do not carry the source typo or product-specific `nu` into a broad alias. |
| Germinated versus malted | Caux-Laflamme lists the dried, non-malted product separately from named malted buckwheat products and explains that germination develops the grain's natural aromas while malting creates new aromas [S06]. Farinart also describes drying as part of sprouting and identifies additional drying conditions as the step used to produce malted grains [S07]. Keep the unqualified sprouted grain separate from malted buckwheat; no exact process parameter or malt threshold is inferred. |
| Forms | No `IngredientForm` is attached. Second Spring sells a whole groat as its product [S01]. Farinart and Caux-Laflamme describe commercial options such as whole, crushed, flaked, or milled grains [S06, S07]; these are supplier-level capabilities, not a recipe-validated form taxonomy for this reference. Cooking, toasting, and milling remain preparation/product boundaries rather than active forms here. |
| Measurements and conversions | Second Spring lists 400 g and 1.5 kg product sizes, gives one-part grain to four-parts water cooking instructions, and states a 10-minute cook time [S01]. These are product/package and preparation instructions, not household mass-volume observations, density, a generic cooking yield, or a package-to-edible-yield relationship. Add no active measure, density, unit mapping, conversion, or package yield. |
| Substitution | Second Spring says its sprouted buckwheat can replace unsprouted buckwheat “1:1” [S01]. The page does not give a mass/volume basis, recipe role, or adjustment. The ledger records this as a rejected source-specific candidate in `wp03-sprouted-buckwheat-no-supported-general-substitute-20261012`; no global or contextual substitution rule is active. Trigone and the Québec retailer say the product can be used as-is or cooked, which is usage guidance rather than a replacement rule [S04, S05]. |
| Recipe demand | No buckwheat/sarrasin ingredient row occurs in the bundled recipe corpus. Add no recipe link. |

## Source register

Source IDs use prefix `WP03-SPBUCKWHEAT-20261012`, now allocated to the integrated `ingredient-ref-sprouted-buckwheat` ledger record. All eight registered IDs (S01–S08) occur exactly once in the live ledger under that record.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-SPBUCKWHEAT-20261012-S01` | Second Spring Foods, [Organic Sprouted Buckwheat](https://secondspringfoods.com/product/organic-sprouted-buckwheat/), current manufacturer product page. | Names the product; describes the whole buckwheat groat, soaking and sprouting, dried shelf-stable moisture, 400 g and 1.5 kg package choices, one-to-four water cooking instructions, 10-minute cooking guidance, and the maker's 1:1 replacement statement. The page gives no household measure or basis for the replacement ratio. The crop origin listed for this product is Madison, Minnesota, USA; this is not Canadian-grown grain. |
| `WP03-SPBUCKWHEAT-20261012-S02` | Second Spring Foods, [The Sprouting Process](https://secondspringfoods.com/sprouting-process/), manufacturer process description. | Says grains are soaked, sprouted, then dried to become shelf stable; sprouting time varies by seed and target qualities. General maker process only; it does not establish a universal buckwheat process or quantity. |
| `WP03-SPBUCKWHEAT-20261012-S03` | Second Spring Foods, [Where to Find Us](https://secondspringfoods.com/contact/), current manufacturer contact and retail information. | Identifies the Seaforth, Ontario location and says Second Spring products are available from selected retail locations across Canada. It supports Canadian manufacturer/retail context, not availability of this exact SKU at every retailer. |
| `WP03-SPBUCKWHEAT-20261012-S04` | Aliments Trigone, [Sarrasin germé biologique 20 kg](https://alimentstrigone.com/products/sarrasin-germe-biologique-20-kg), current Québec producer product listing. | Uses the French product wording `Sarrasin germé biologique`, says it may be used as-is or cooked as a side, and lists a 20 kg product currently on backorder. It does not describe the drying process, hull state, or a household measure. |
| `WP03-SPBUCKWHEAT-20261012-S05` | Grand'Mère Nature, [Sarrasin germé biologique cru 400 g](https://www.grandmerenature.com/produit/5561-sarrasin-germe-biologique-cru-400g), current Québec retailer listing. | Uses the local phrase `sarrasin germé biologique cru`, describes using it as-is or cooking it as a side, and showed limited stock when reviewed. It does not specify sprouting/drying parameters or a generic conversion. |
| `WP03-SPBUCKWHEAT-20261012-S06` | Malterie Caux-Laflamme, [Aliments](https://malteriecauxlaflamme.com/aliments/), current Québec manufacturer food-product list and process overview. | Says its grains are Québec-grown and lists `Sarrasin nue germé séché` separately from named malted buckwheat products. It also says supplier grains may be sold whole, crushed, or milled and that moisture and other parameters can be adjusted. The landing page contains the spelling/agreement `nue` (sic); the linked product-detail page returned a cache miss, so the typo and hull qualifier are not adopted as generic aliases. No recipe measure is given. |
| `WP03-SPBUCKWHEAT-20261012-S07` | Farinart, [Nos grains germés et maltés](https://farinart.ca/fr/our-sprouted-grains/) and [Sarrasin](https://farinart.ca/fr/grains/sarrasin/), current Québec processor pages. | The sprouted-grains page lists sarrasin among grains commonly sprouted and says sprouted grains are dried; it distinguishes additional drying conditions for malted grains. The buckwheat page lists natural, roasted, or sprouted product and whole, cracked, or milled presentations. It supports Québec terminology and supplier process/product classes, not consumer packaging, recipe measures, or standardized ingredient forms. |
| `WP03-SPBUCKWHEAT-20261012-S08` | Office québécois de la langue française, [sarrasin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082623/sarrasin), terminology entry last updated 1991. | Supports `sarrasin` as the Québec French base term and lists `blé noir` as another term. It does not establish the preferred name for a dried, sprouted product; neither compound nor `blé noir` is added as an alias. |

## Verification performed

- Re-read `AGENTS.md`, the open Section F checklist, the current catalog and ledger, the integrated raw-buckwheat-groats, sprouted-barley, and sprouted-buckwheat rows, and the round7/round8 Section F reviews. Refreshed the live snapshot after the potato-flour alias, inconnu, sprouted-barley, goldeye, urid-flour, and sprouted-buckwheat integrations; confirmed this remains distinct from raw/roasted buckwheat and does not reopen the sprouted-rye naming hold or sprouted-barley identity.
- Parsed the current references, forms, legacy candidates, package yields, global/contextual substitution rules, and research ledger. Checked normalized exact names, aliases, and ID ownership; found eight buckwheat/sarrasin reference identities, including the integrated candidate and distinct soba-noodle identity, with exactly one owner for the candidate ID and canonical names. Confirmed no buckwheat/sarrasin form or legacy candidate, the candidate ledger record is accepted, and all eight source IDs occur exactly once under it. Verified that the urid-flour reference and ledger entry have no buckwheat/sarrasin ownership term.
- Parsed every manifest-listed recipe in manifest order: 114 files, 1,123 ingredient rows, and 753,792 recipe bytes. Searched all ingredient rows for candidate phrases and the broader `buckwheat` / `sarrasin` terms; found zero matches. Computed the corpus fingerprint by hashing each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.
- Reached the Second Spring product, process, and Canadian-retail pages; Aliments Trigone product listing; current Québec retailer product listing; Farinart processor pages; Caux-Laflamme product list; and OQLF GDT directly. Caux-Laflamme's product-detail endpoint returned a cache miss, so the product list is the only direct support used for its exact dried buckwheat wording.
- After updating this review, checked UTF-8 without BOM, absence of mojibake markers, no trailing whitespace, the current artifact counts and exact-byte hashes above, one live ledger occurrence per S01–S08, and that stale unallocated/proposal-only claims were removed. No app tests or emulator checks were run for this documentation-only follow-up.
