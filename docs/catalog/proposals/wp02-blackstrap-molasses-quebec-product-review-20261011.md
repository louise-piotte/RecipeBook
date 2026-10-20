# WP02 Section C — blackstrap molasses product and Québec naming review

- **Reviewed:** 2026-10-11
- **Status:** proposal only. No shared catalog, ledger, checklist, roadmap, recipe, test, or code file was changed.
- **Scope:** the liquid human-food product named blackstrap molasses; its Canadian compositional class and Québec French naming; boundaries from generic molasses, other molasses grades/products, and treacle; recipe demand and supported measurements/substitutions.
- **Plan item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, WP02 Section C, “Light/dark corn syrup … regular/fancy molasses, blackstrap molasses …”. The broad syrup checklist is still open. The 2026-10-09 syrup review integrated separate glucose syrup and dark corn syrup but left generic molasses unresolved.

## Recommendation

**Add one identity-only reference for `blackstrap molasses / mélasse verte`, with no recipe link, and do not merge it into the generic legacy `molasses / mélasse` candidate.** The Canadian standard names blackstrap molasses as a defined sugar-manufacturing residual-liquid class; the current OQLF record maps *blackstrap molasses* to preferred Québec French *mélasse verte*; and a Canadian producer’s product materials use that bilingual product name. The evidence is strong for this named human-food product boundary, but it does not resolve every generic use of *molasses*, every retail “cooking molasses,” or every product sold under regional grades. The recipe scan found no row to link.

This recommendation would create a candidate/catalog identity only. It does **not** assert a product-specific government approval, imply that all molasses is blackstrap, create a recipe link, or activate a measure, density, form, package yield, conversion, or substitution.

| Proposed field | Recommendation |
| --- | --- |
| Candidate ID | Use or reconcile `ingredient-ref-blackstrap-molasses`; no such active or legacy ID currently exists. Do not reuse `ingredient-ref-molasses`. |
| English display | `blackstrap molasses` |
| fr-CA display | `mélasse verte` |
| Category | `SUGAR_AND_SWEETENER` |
| English aliases | `blackstrap`; `black strap`; `third molasses` (OQLF-listed terms; keep their use limited to this blackstrap product identity). |
| French aliases | None proposed. |
| Excluded from aliases | `molasses`, `mélasse`, `mélasse noire`, `dark molasses`, `second molasses`, `cooking molasses`, `mélasse de cuisine`, `refiners’ molasses`, `mélasse de raffineur`, `black treacle`, and unqualified `treacle`. These have broad, grade-specific, formulation-specific, or jurisdiction-specific scope. |
| Scope note | Liquid sweetener explicitly named blackstrap molasses / mélasse verte. Keep source, cane/beet origin, extraction stage, sulfite declaration, and other specifications product-specific unless the exact product source establishes them. |

If the project requires recipe demand before adding an identity, keep this candidate proposal-only: the current bundled recipes contain no molasses line. In either case, the generic legacy candidate remains held and no existing recipe is linked.

## Current repository preflight

Counts and hashes identify the live snapshot inspected for this proposal; recheck before any integration because shared files may change.

| Artifact | Live count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 932 references | `52e096496639a95477197c25657888f035401f54692d1f0bce13ee36fdbfb9ed` |
| `ingredient-forms.v1.json` | 52 forms | `2d1d872697cae29d9c448e1df11f9bd3405306ea1f3f860fc2b4163180288c50` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 1,197 records / 2,740 distinct source IDs | `77beeeaea999627302209a1542faa386ee951cfb1381b91bda39858a8ac2248e` |
| `legacy-import-identities.v1.json` | 76 candidates | `be5ff09fb522c8a36633dbaea66f57e44653c2840da88600f03f943e1bbd9fb0` |
| Manifest-listed recipe files / ingredient rows | 114 / 1,123 | Sorted recipe filename + NUL + per-file SHA-256 + newline aggregate: `8073b993f438b548fc0db78e975ddd6667c9037dd37594fcea91bbf3f3a89a67` |

The only exact current molasses legacy owner is `ingredient-ref-molasses`, named `molasses / mélasse`, with no aliases and `reviewState: unreviewed`. Its ledger record is still `recordType: candidate`, `identityState: needs_clarification`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: blocked_pending_evidence`. The ledger has the 2026-10-09 syrup-review sources but retains the generic identity as unresolved. Do not replace that prior disposition with a claim that generic molasses means blackstrap.

There is no exact active reference or form for `blackstrap molasses`, `blackstrap`, `black strap`, `third molasses`, `mélasse verte`, `mélasse noire`, `cooking molasses`, `treacle`, or the other scoped names. The only related active reference is `ingredient-ref-pomegranate-molasses` / `mélasse de grenade`, which is a separate pomegranate reduction/condiment. It must remain separate from cane/beet molasses and from this sweetener identity.

The packet-local source ID prefix `WP02-C-BLACKSTRAP-20261011-` was checked against all 2,740 ledger source IDs and had no collision. IDs in this proposal are local labels only; no ledger record or source was added.

## Exact-key, search, and recipe demand

The exact-key audit used `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` across all 932 reference names/aliases, 52 form labels/match terms, and 76 legacy candidate names/aliases. It folds case, accents, ligatures, punctuation, and whitespace.

| Term | Exact current owner or result |
| --- | --- |
| `molasses` / `mélasse` | Legacy candidate `ingredient-ref-molasses`; no active exact reference or form. |
| `pomegranate molasses` / `mélasse de grenade` | Active `ingredient-ref-pomegranate-molasses`, category `SAUCE_AND_CONDIMENT`; keep separate. |
| `date syrup` / `sirop de dattes` | Active `ingredient-ref-date-syrup`; separate sweetener, not an alias for blackstrap or generic molasses. |
| `blackstrap molasses`, `blackstrap`, `black strap`, `third molasses`, `mélasse verte`, `mélasse noire`, `dark molasses`, `second molasses`, `cooking molasses`, `mélasse de cuisine`, `refiners’ molasses`, `treacle` | No exact active reference, form, or legacy owner. |

The current bilingual search code matches a complete phrase contained in a displayed name or alias. If this proposal is integrated, a broad `molasses`/`mélasse` query will match both blackstrap molasses and the existing pomegranate-molasses reference. That is a broad-search collision, not an exact-key conflict or evidence of synonymy. Keep unqualified `molasses / mélasse` inactive and preserve the two distinct results.

All **114 manifest-listed recipe JSON files and 1,123 ingredient rows** were scanned for `molass*`, blackstrap/black strap, `mélasse*`, and treacle terms. There were **zero ingredient-row matches and zero full-recipe-text matches**. No current recipe requests blackstrap, generic molasses, cooking/fancy/table molasses, or treacle. The prior syrup review’s corn-syrup recipe lines do not create molasses demand. No recipe link, measure, or substitution is proposed.

## Evidence facts and boundary inferences

Facts below are distinguished from the proposed catalog interpretation. All sources were accessed on **2026-10-11**.

| Product/name | Source facts | Inference and disposition |
| --- | --- | --- |
| Canadian blackstrap class | CFIA Volume 15, 15.1.10 names “Refiners’ Molasses, Blackstrap Molasses or Cooking Molasses” as residual liquid food obtained during raw or refined sugar manufacture, with maximum 25% moisture and 12% sulphated ash. The French standard names “mélasse de raffineur, mélasse verte ou mélasse de cuisine ou mélasse pour cuisson.” The adjacent standards separately define fancy molasses from cane juice before sugar extraction and table molasses as a product of raw/refined sugar manufacture, each with a 3% sulphated-ash maximum. [S01, S02] | Canada provides an official product-class basis for blackstrap as a named molasses product, while the shared 15.1.10 heading also covers terms that can be used differently in retail. This supports a narrow blackstrap identity, but it is not evidence that every product called cooking molasses or refiners’ molasses is compositionally or culinarily identical to a blackstrap retail SKU. Do not merge fancy/table grades or the generic candidate. |
| Québec French | OQLF’s 2024 GDT entry maps English *blackstrap molasses* to preferred `mélasse verte`, lists `mélasse de cuisine` as rare and `mélasse noire` as used in some contexts, and lists English `blackstrap`, `black strap`, `black treacle` (UK), and `third molasses`. It says sources differ: some distinguish `mélasse verte`/third extraction from `mélasse noire`/second extraction; others use `mélasse noire` and `mélasse verte` synonymously. [S03] | Use `mélasse verte` as fr-CA display. Preserve the listed English lexical variants narrowly, excluding the UK-only term. Do not use `mélasse noire`, `dark molasses`, or `second molasses` as global aliases because OQLF explicitly records conflicting scope. Do not promote the rare French `mélasse de cuisine` as an alias while current Canadian retail usage distinguishes a cooking-molasses blend. |
| Canadian commercial food product | Crosby’s current product page separately presents Fancy, Blackstrap, and Cooking products. It describes blackstrap as highly concentrated, very dark, robust and somewhat bitter, lists a 675 g retail pack, and describes its Cooking Molasses as a blend of its blackstrap and fancy products; it says the blend commonly substitutes for fancy in many recipes, with a more robust result. [S04] | This maker’s retail product boundary supports blackstrap distinct from its own fancy and cooking SKUs. It is one Canadian manufacturer’s range, not a rule for all brands. The cooking-for-fancy statement is not evidence for blackstrap-for-fancy or any general molasses substitution. |
| Bilingual product name and historical specification | Crosby’s 2011 manufacturer specification names the food as `Blackstrap Molasses` / `Mélasse verte`, describes a raw-sugar residual liquid, and provides a product-specific specification. Crosby’s 2022 sell sheet shows the bilingual product name and reports `1 tbsp (20 g)` as a label serving. [S05, S06] | These are direct Canadian maker-language and SKU observations. The 2011 document is historical and should not be treated as the current package label or as proof of every current Crosby formula. The 2022 serving is product/label-specific, not a catalog default. |
| Health Canada food-code name and portions | CNF food code 4300 is “Sweets, molasses, blackstrap” / “Confiseries, mélasse noire (mélasse verte).” Its serving-size page lists 15 mL = 20.8 g, 100 mL = 138.6 g, 125 mL = 173.3 g, and 250 mL = 346.6 g. [S07] | This supports keeping a source-specific portion observation, and it independently includes `mélasse verte` while also displaying `mélasse noire` parenthetically. It does not resolve OQLF’s French-grade ambiguity, identify a brand or measurement method, or justify a global density/default mapping. |
| United States grading | USDA AMS’s current sugarcane molasses grade page describes U.S. Grade A/Fancy, B/Choice, C/Standard, and Substandard by sensory quality and Brix, sugar, ash, and sulfite criteria. AMS identifies specialty-product grade standards as voluntary. [S08, S09] | The U.S. source is a quality-grade framework, not a bilingual Canadian naming record and not a source for treating Canadian `mélasse verte`, U.S. “Fancy,” or blackstrap as aliases. It does not supply a global blackstrap identity decision beyond showing that grades are jurisdiction- and framework-specific. |

### Keep these boundaries explicit

- **Generic molasses / mélasse:** keep the legacy candidate unresolved; it could refer to several classes or a source-specific recipe product. Do not alias the unqualified words to blackstrap.
- **Fancy molasses / mélasse qualité fantaisie:** CFIA defines a syrup from sugar cane juice before sugar has been extracted. Keep distinct from residual blackstrap product.
- **Table molasses / mélasse de table:** a separately defined product from raw/refined sugar manufacture. Do not merge merely because its process is also a sugar-manufacturing stream.
- **Cooking molasses / mélasse de cuisine:** although grouped under Canada’s 15.1.10 compositional-standard heading, Crosby’s current consumer product is a blend of blackstrap and fancy molasses. Keep the unqualified retail term out of this blackstrap alias set; a future source-specific product identity could be reviewed separately.
- **Refiners’ molasses / mélasse de raffineur:** appears in the same Canadian standard heading, but no product-specific recipe or retail need was found. Keep as a standard-class name outside the global alias set pending a dedicated scope decision.
- **Dark/second molasses / mélasse noire:** OQLF documents divergent terminology; keep unresolved and distinct from a blackstrap alias.
- **Treacle / black treacle:** OQLF marks black treacle as UK usage. Keep treacle terms out of unscoped global aliases.
- **Pomegranate molasses / mélasse de grenade and date syrup / sirop de dattes:** retain their existing separate identities. Their product names and composition do not make them cane/beet molasses or blackstrap aliases. No active `date molasses` key was found.
- **Animal-feed molasses:** the reviewed evidence is for a Canadian human-food ingredient/product; it does not support an animal-feed identity, a feed conversion, or equivalence between feed-grade and culinary molasses.

## Measures, forms, conversions, yields, and substitutions

No form or numeric catalog behavior is proposed.

| Observation | Evidence scope and limit |
| --- | --- |
| CNF food code 4300 gives 15 mL = 20.8 g; 100 mL = 138.6 g; 125 mL = 173.3 g; and 250 mL = 346.6 g. [S07] | Health Canada table portions for one database food code. Record as a source-specific measure observation only; no brand, sampling method, or lot is specified. Do not infer a reusable density or convert other molasses grades. |
| Crosby’s 2022 label-facing sell sheet lists 1 tbsp (20 g). [S06] | One manufacturer’s blackstrap product serving. The same volume-to-mass pair differs from the CNF’s 15 mL = 20.8 g, so do not round these into one exact default or use them to replace a recipe quantity. |
| Crosby’s current retail pack listing is 675 g; its older product specification lists retail and bulk formats. [S04, S05] | Package weights/formats only. No package volume, kitchen yield, or universal package mapping is established. |

The identity is itself a liquid product name; no dry/powdered, cooked, or other form is requested or supported. The numeric observations may be retained as source-specific research if later added to the ledger, but this review activates no default density, unit mapping, conversion, or package-yield rule. The product page’s statement about Crosby cooking molasses as a substitute for fancy molasses is brand-specific and does not justify replacing blackstrap. No safe or global blackstrap substitution is proposed.

## Source register

All sources below were accessed on 2026-10-11. Direct URLs are supplied for later review; source IDs are local to this proposal and are not ledger IDs.

| Source ID | Source | Claim scope and limits |
| --- | --- | --- |
| WP02-C-BLACKSTRAP-20261011-S01 | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 15, §§15.1.8–15.1.10 | Current English standard definitions for fancy, table, and refiners’/blackstrap/cooking molasses. Official compositional classes; not a retail-product or universal recipe-equivalence statement. |
| WP02-C-BLACKSTRAP-20261011-S02 | CFIA, [Normes canadiennes de composition des aliments](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), Volume 15, §§15.1.8–15.1.10 | Current French standard names and limits. Supports `mélasse verte` as one name in the shared class; not a standalone ruling that all products called `mélasse de cuisine` are blackstrap retail products. |
| WP02-C-BLACKSTRAP-20261011-S03 | OQLF, [mélasse verte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8874425/melasse-verte) | 2024 GDT record gives preferred fr-CA term, English synonyms, rare/region-marked variants, and explicit ambiguity around dark/second molasses. Terminology evidence; not a compositional or legal product standard. |
| WP02-C-BLACKSTRAP-20261011-S04 | Crosby Foods, [Our Molasses](https://www.crosbys.com/product/) | Current manufacturer page distinguishes its Fancy, Blackstrap, and Cooking products and describes the latter as a blend. One producer’s line and qualitative use advice only. |
| WP02-C-BLACKSTRAP-20261011-S05 | Crosby Foods, [Blackstrap specification (PDF)](https://www.crosbys.com/wp-content/themes/crosbys/pdf/Specification_Blackstrap_2011.pdf) | Manufacturer specification dated 2011; bilingual English/French product names, process/product descriptors, and stated specifications. Historical, brand-specific document; not proof of the current label or every market formulation. |
| WP02-C-BLACKSTRAP-20261011-S06 | Crosby Foods, [Blackstrap sell sheet (PDF)](https://www.crosbys.com/wp-content/uploads/2022/03/Blackstrap-sell-sheet.pdf) | Manufacturer collateral reports Canadian product name `Blackstrap Molasses / Mélasse verte` and a `1 tbsp (20 g)` serving. Label/SKU observation; older than the current product page and not a universal measure. |
| WP02-C-BLACKSTRAP-20261011-S07 | Health Canada, [Canadian Nutrient File serving portions, food code 4300](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4300) | Bilingual food-code name and exact published volume-to-mass portions for “molasses, blackstrap.” No brand or measurement method is stated; portions remain source-specific. |
| WP02-C-BLACKSTRAP-20261011-S08 | USDA Agricultural Marketing Service, [Sugarcane Molasses Grades & Standards](https://www.ams.usda.gov/grades-standards/sugarcane-molasses-grades-standards) | Current AMS page lists U.S. molasses quality grades and quality factors; does not establish Canadian name equivalence or blackstrap aliases. |
| WP02-C-BLACKSTRAP-20261011-S09 | USDA Agricultural Marketing Service, [Specialty Products Grades & Standards](https://www.ams.usda.gov/grades-standards/specialty-products) | AMS describes its specialty-product grade standards as voluntary and links the sugarcane molasses standard. Program-level scope only. |

## Coordinator decision

1. Accept or hold a narrow `blackstrap molasses / mélasse verte` identity. The source and Québec term evidence support the name; the current recipe corpus offers no ingredient-line demand or link.
2. If accepted, keep the unqualified `molasses / mélasse` legacy candidate unresolved and separate from the blackstrap identity.
3. Use only the proposed narrow aliases (`blackstrap`, `black strap`, `third molasses`) pending coordinator review; keep `mélasse noire`, `dark molasses`, cooking/refiners’ names, and treacle out of global aliases.
4. Preserve the Health Canada and Crosby volume/weight observations as source-specific evidence only. Activate no form, density, unit mapping, conversion, yield, or substitution.
