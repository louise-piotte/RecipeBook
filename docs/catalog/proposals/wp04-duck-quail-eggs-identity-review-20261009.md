# WP04 Section Q duck- and quail-egg identity proposal

- **Reviewed:** 2026-10-09
- **Status:** integrated on 2026-10-09 after coordinator review; independent Québec review of the duck display remains open.
- **Scope owned:** species-distinct whole duck-egg and quail-egg food identities; Québec product naming; source-specific composition/portion research; cross-species substitution review
- **Deferred:** chicken-egg identity cleanup; duck/quail whites and yolks; liquid, pasteurized, powdered, salted, pickled, dried, frozen, cooked, or other processed egg products; all other bird eggs; egg forms and preparation rules; remaining WP04 animal and dairy coverage
- **Repository snapshot:** 414 ingredient references; 16 forms; 579 research-ledger records; 99 legacy-import candidates; 114 bundled recipe JSON files; 1,123 ingredient rows; 26 existing proposal files before this file was added. No matching species-specific catalog, legacy, ledger, or recipe entry was found. No existing `WP04-EGG-*` source ID was found.

This packet proposes separate species-qualified identities for explicit duck-egg and quail-egg requests. It does not reclassify an unqualified `egg` request or the existing generic egg-white and egg-yolk references. The evidence supports the two whole-egg product identities, but does not support species-neutral measures, forms, size classes, or substitution rules.

## Proposed identities

| Proposed stable ID | English display | fr-CA display | Narrow aliases to consider | Category | Identity scope |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-duck-egg` | `duck egg` | `œuf de canard` | EN: `duck eggs`; FR: `œufs de canard`, `œufs de cane` | `EGG` | Whole duck egg as sold in shell. Québec producer and retailer listings support the product and local French wording. No claim is made for processed duck-egg products. |
| `ingredient-ref-quail-egg` | `quail egg` | `œuf de caille` | EN: `quail eggs`; FR: `œufs de caille` | `EGG` | Whole quail egg as sold in shell. The GDT term pair and Québec verified product listing support the name and product. No claim is made for processed quail-egg products. |

These are candidate IDs and names for coordinator review, not allocated or integrated records. The GDT entry gives `œuf de caille` / `quail egg`; its credited author is Les Éditions Québec Amérique inc. (2003), so it is described here as a Québec GDT term record, not an OQLF-authored endorsement. Targeted searches found no corresponding GDT entry for `œuf de canard` or `œuf de cane`. The proposed duck French display is supported by current Québec product use from a producer and retailer; retain that source limit and request independent Québec French review before integration. [WP04-EGG-S03–S06]

Do not attach generic `egg`, `eggs`, `œuf`, `œufs`, `egg white`, `egg whites`, `egg yolk`, or `egg yolks` aliases to either species row. Do not redirect or rewrite the current `ingredient-ref-egg`, `ingredient-ref-egg-white`, or `ingredient-ref-egg-yolk` rows in this proposal. The current seed does not explicitly encode `chicken` in those IDs or displays; retain their existing generic matching behavior until the broader chicken-egg review decides otherwise. Explicit duck/quail white or yolk products need their own source and recipe review, and are not inferred from a whole-egg identity.

## Product and regulatory boundary

CFIA's SFC licence commodity page includes duck and quail among the species under its broad `Egg` commodity category and separates shell eggs from processed egg products. It says processed eggs may be liquid, frozen, dried, pickled, or cooked and may contain whole egg, white, or yolk. The same page cautions that licence commodity names can be broader than SFCR definitions and standards of identity. Separately, the Canadian Egg Licensing Regulations define `egg` for that regulation as an egg of a hen of domestic chicken (*Gallus domesticus*). These sources have different legal scopes: neither creates an unqualified catalog alias between species, and the regulation-specific definition should not be generalized to every Canadian food-labeling context. [WP04-EGG-S01–S02]

Québec producer Verger Canard Goûteux lists `Œufs de canard` from its Khaki Campbell ducks and sells them by the dozen. Le Capitaine lists products as `12 œufs de canard` and `6 œufs de cane`, and describes a Québec assortment that includes eggs from ducks/canes and quail. This supports a narrowly source-scoped local `œufs de cane` alias for duck eggs, alongside the clearer display `œuf de canard`. The producer's claims about comparative size, nutrients, and baking quality are not used as general facts or conversions. Aliments du Québec lists Ferme P. Brodeur's fresh quail-egg product as `Oeuf de cailles frais`, in a 30-unit package; this verifies local availability, not an alternative GDT spelling or a standard count weight. [WP04-EGG-S04–S06]

The product pages show whole eggs sold in shell. They do not show that plain species-qualified names cover liquid, dried, salted, pickled, frozen, cooked, or powdered products. Keep those Section Q product-state questions open; do not collapse a processed product into either proposed shell-egg identity. No egg form is proposed: the current 16-form file contains no egg-related form, and the recipes do not request a duck/quail preparation form.

## Measurement findings — separate from identity and substitution

USDA Agricultural Research Service SR28 has separate whole, fresh, raw food-composition records and common-measure observations for duck and quail eggs. In both records the common-measure table is explicitly for the **edible portion**. Those entries are source-specific count-weight observations, not cross-species conversions, market size classes, universal shell-on weights, or volume mappings. The records carry shell-refuse notes, which further cautions against interpreting their edible-portion measures as purchase weights. [WP04-EGG-S07–S08]

| Exact food / source basis | Supported observation | Proposed research state and limit |
| --- | --- | --- |
| USDA SR28 NDB 01138, `Egg, duck, whole, fresh, raw`; record notes `12% Shell`; common measure `1 egg = 70 g` in amount of edible portion of common measures | One source-specific fresh/raw whole duck egg portion: 70 g edible portion. | If accepted into the ledger, `measurementState: researched_supported` for this `count_weight` observation only. Preserve the record name, 2015 release, edible-portion basis, and shell-refuse note. No default density, cup mapping, shell-on egg weight, size grade, or conversion to a chicken-egg unit. |
| USDA SR28 NDB 01140, `Egg, quail, whole, fresh, raw`; record notes `8% Shell`; common measure `1 egg = 9.0 g` in amount of edible portion of common measures | One source-specific fresh/raw whole quail egg portion: 9.0 g edible portion. | If accepted into the ledger, `measurementState: researched_supported` for this `count_weight` observation only. Preserve the record name, 2015 release, edible-portion basis, and shell-refuse note. No default density, cup mapping, shell-on egg weight, size grade, or conversion to a chicken-egg unit. |

No supported duck/quail density or species-specific mass-per-volume mapping was found. The current evidence also does not establish a general egg-size class for either species, or a universal weight for a shell-on egg sold in Québec. Do not add an active unit mapping from these observations: retain `defaultDensity: null` and `unitMappings: []` on both candidate rows. Do not map either observation to a species-neutral unit such as `egg`, `large egg`, `egg white`, or `egg yolk`, or compare their count values as if they describe equal quantities.

## Substitution findings — separate from identity and measurement

No reusable species-to-species substitution rule is supported for this review. A peer-reviewed comparative study of chicken, duck, quail, and other poultry eggs found interspecies differences in egg weight, shape, yolk proportion, breaking strength, and albumen properties. That is evidence against assuming equal product properties; it is not a culinary trial and supplies no recipe replacement amount. [WP04-EGG-S09]

The targeted substitution search found ratio claims but not a sufficiently scoped, test-backed basis for activating a catalog rule. Meyer Hatchery's FAQ suggests `1 chicken egg = 60 g quail egg = 1/4 cup = 3–5 quail eggs`; it does not name the chicken egg size, distinguish shell-on from edible mass for the count, identify a tested recipe, or report outcome/adjustment data. A Cornell Ag Informer search result states a `3 duck : 4 chicken` rule of thumb and suggests weighing for baking, but direct page retrieval returned HTTP 502 during this review; the snippet cannot be independently checked here. Neither is adopted as a supported rule. [WP04-EGG-S10–S11]

Recommend `substitutionResearchState: researched_no_supported_substitute` for general duck-egg ↔ chicken-egg and quail-egg ↔ chicken-egg recipe replacement, with `substitutionFindings` documenting the rejected claims, their missing product/recipe basis, and the no-rule disposition. This records the completed search scope; it does not claim that no recipe-specific use exists. No active global form conversion or contextual ingredient substitution is proposed. Revisit only with a credible tested recipe or food-science source that names egg species, whole/white/yolk and shell/processed state, the recipe role, replacement amount basis, and observed adjustments or outcome. Do not use the USDA count observations as substitute ratios.

## Exact-key, legacy, ledger, proposal, and recipe audits

The audit used the repository's `normalizeIngredientSearchKey` behavior in `IngredientSearch.kt`: lowercase, Unicode NFKD, fold `œ`/`æ`/`ß`, replace `&` with `and`, remove combining marks, convert punctuation runs to spaces, and collapse whitespace. It compared the candidate terms against all names and aliases on the 414 references and all labels/search terms on the 16 forms. All candidate species-specific exact keys have no current owner and do not collide with each other.

| Reviewed term | Candidate role | Normalized key | Current exact owner |
| --- | --- | --- | --- |
| `duck egg` | EN display | `duck egg` | none |
| `duck eggs` | EN alias | `duck eggs` | none |
| `œuf de canard` | fr-CA display | `oeuf de canard` | none |
| `œufs de canard` | fr-CA alias | `oeufs de canard` | none |
| `œuf de cane` | Reviewed local term | `oeuf de cane` | none |
| `œufs de cane` | fr-CA alias | `oeufs de cane` | none |
| `quail egg` | EN display | `quail egg` | none |
| `quail eggs` | EN alias | `quail eggs` | none |
| `œuf de caille` | fr-CA display | `oeuf de caille` | none |
| `œufs de caille` | fr-CA alias | `oeufs de caille` | none |
| `egg` / `eggs` | Explicitly excluded generic terms | `egg` / `eggs` | `ingredient-ref-egg` |
| `œuf` / `œufs` | Explicitly excluded generic terms | `oeuf` / `oeufs` | `ingredient-ref-egg` |
| `egg white(s)` / `blanc d'œuf` | Explicitly excluded part terms | `egg white(s)` / `blanc d oeuf` | `ingredient-ref-egg-white` |
| `egg yolk(s)` / `jaune d'œuf` | Explicitly excluded part terms | `egg yolk(s)` / `jaune d oeuf` | `ingredient-ref-egg-yolk` |

There is no duck/quail phrase in the 99 legacy-import candidates or 579 research-ledger records. A full check of ledger sources found zero `WP04-EGG-*` IDs, so `WP04-EGG-S01` through `WP04-EGG-S11` are available for this proposal's eventual source records. The 26 pre-existing proposal files were checked for duck/quail product terms and `WP04-EGG-*` references; none overlapped. Recheck all keys and source IDs against the live package at integration time.

All 114 bundled recipe JSON files were scanned as serialized UTF-8 text and across all 1,123 `ingredients[]` rows for `duck egg(s)`, `quail egg(s)`, `œuf(s) de canard`, `œuf(s) de cane`, and `œuf(s) de caille`. There were zero full-text matches and zero ingredient-line matches. No bundled recipe line needs relinking. Keep unqualified existing egg lines unchanged; this proposal adds no species-specific relationship for generic egg-white or yolk lines.

Snapshot file hashes:

| File | SHA-256 |
| --- | --- |
| `ingredient-references.v1.json` | `5f7cca9264d410c2c2e619321fc0daa7ed6a6907630225dd490ba0894ce8288e` |
| `ingredient-forms.v1.json` | `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | `db6ac4439396eca82f5f66508d30d538f5b4686431e09d87240239060143c647` |
| `legacy-import-identities.v1.json` | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |

Recipe corpus aggregate SHA-256 at the same snapshot: `2c52b0b9c5392fb92a98c8b1c8ece314652a711872eda1073bcd958e0a471eda` (computed over sorted recipe filenames followed by each file's bytes).

## Search log and sources

Searches and source access were performed 2026-10-09. Sources support only the claim and scope listed; page availability or product wording is not evidence for unrelated measures or aliases.

| Source ID | Source and claim limit |
| --- | --- |
| **WP04-EGG-S01** | CFIA, [What to consider before applying for a Safe Food for Canadians licence](https://inspection.canada.ca/en/food-licences/obtain-licence?wbdisable=true), Annex A, `Egg` commodity and shell/processed subcategories. Says the broader licence category includes duck/quail and enumerates processed forms; explicitly cautions that commodity categories can be broader than SFCR meanings and standards. Not an ingredient alias, serving measure, or species equivalence. |
| **WP04-EGG-S02** | Justice Laws, [Canadian Egg Licensing Regulations, 1987, section 2](https://laws-lois.justice.gc.ca/eng/regulations/SOR-87-242/section-2.html?txthl=canadian). In this regulation only, `egg` means the egg of a hen of domestic chicken (*Gallus domesticus*). Do not generalize to every federal food law or labeling context. |
| **WP04-EGG-S03** | Québec's [Grand dictionnaire terminologique entry `œuf de caille`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423410/oeuf-de-caille). Pairs the French term with `quail egg`; credited author is Les Éditions Québec Amérique inc. (2003). Terminology evidence, not a species composition or recipe source. |
| **WP04-EGG-S04** | Verger Canard Goûteux, Québec producer, [Œufs de canard](https://canardgouteux.ca/products/oeufs-de-canard). Names its Khaki Campbell duck product and sale by the dozen. Product-size, nutrient, and baking statements on this marketing page are not generalized or used for measures. |
| **WP04-EGG-S05** | Le Capitaine, Québec retailer, [duck-eggs collection](https://lecapitaine.ca/fr/collections/duck-eggs). Current listing titles include `12 œufs de canard` and `6 œufs de cane`; its text also names quail among its Québec egg products. Supports these local product-name strings only. |
| **WP04-EGG-S06** | Aliments du Québec, [Oeuf de cailles frais](https://www.alimentsduquebec.com/fr/produits-dici/produits-certifies/oeuf-de-cailles-frais), listed as a 30-unit Ferme P. Brodeur product in Saint-François-du-Lac, Québec. Supports availability/product label, not a formal preferred spelling or portion weight. |
| **WP04-EGG-S07** | USDA ARS, [SR28 Food Group 01 PDF](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR/SR28/reports/sr28fg01.pdf), NDB 01138, pp. 350–352, `Egg, duck, whole, fresh, raw`. Entry notes 12% shell and lists `1 egg = 70 g` under amount in edible portion of common measures. Source-specific observation only; no general egg grade or shell-on weight. |
| **WP04-EGG-S08** | USDA ARS, [SR28 Food Group 01 PDF](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR/SR28/reports/sr28fg01.pdf), NDB 01140, pp. 356–358, `Egg, quail, whole, fresh, raw`. Entry notes 8% shell and lists `1 egg = 9.0 g` under amount in edible portion of common measures. Source-specific observation only; no general egg grade or shell-on weight. |
| **WP04-EGG-S09** | Sun et al., [Egg quality and egg albumen property of domestic chicken, duck, goose, turkey, quail, and pigeon](https://pubmed.ncbi.nlm.nih.gov/31287885/), *Poultry Science* 98(10), 4516–4521 (2019), DOI 10.3382/ps/pez259. Reports interspecies differences in egg weight, shape, yolk share, shell breaking strength, and albumen properties. Supports retaining species boundaries; the study is not a recipe-substitution trial. |
| **WP04-EGG-S10** | Meyer Hatchery, [How many quail eggs for one chicken egg?](https://meyerhatchery.zendesk.com/hc/en-us/articles/17159796569357-I-m-baking-my-favorite-cake-How-many-quail-eggs-do-I-use-for-1-chicken-egg). Provides a FAQ ratio of 60 g / 1/4 cup / 3–5 quail eggs per chicken egg. The response does not identify chicken size, egg state/basis for count, named recipe, method, or outcome; reviewed but not adopted as a reusable substitution. |
| **WP04-EGG-S11** | Cornell Ag Informer, [Duck Eggs](https://blogs.cornell.edu/agnewscenter/2014/07/15/duck-eggs/). Search results surfaced a 3-duck-to-4-chicken rule of thumb and weight guidance. Direct page fetch returned HTTP 502 on review date, so details could not be independently verified and are not used to support a rule. |

Targeted searches included `site:vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt "œuf de canard"`, `site:vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt "œuf de cane"`, `duck egg chicken egg substitution baking weight recipe extension`, `quail eggs substitute chicken eggs recipe baking`, and the two named-substitution searches above. The searches found no OQLF duck-egg term record and no accessible source with a species-, product-state-, recipe-role-, and amount-specific tested substitution method. A Cornell result was inaccessible; a hatchery FAQ is recorded with its limitations. This is a bounded no-supported-substitute finding, not proof that no contextual culinary use exists.

## Proposal disposition

- Accept `duck egg / œuf de canard` and `quail egg / œuf de caille` as separate candidate whole-egg identities in `EGG`, pending coordinator and independent Québec French review.
- Consider only the narrow plural aliases in the candidate table, including local `œufs de cane` for duck eggs. Do not add generic egg/white/yolk aliases, gender/breed names, processed-state aliases, or broader terms.
- Keep the USDA duck and quail edible-portion count observations separate and source-scoped. Store no density, volume mapping, generic size unit, form, conversion edge, or species-neutral weight assumption.
- Record no supported reusable chicken↔duck or chicken↔quail substitute; activate no rule.
- No recipe relink is needed in the current 114-recipe corpus. Broader Section Q eggs, dairy, and product-state work remains open.

## Coordinator integration result

Added separate duck-egg and quail-egg identities with the narrow plural aliases in the proposal.
USDA edible-portion count observations remain source-specific; no shell-on weight, size class,
density, conversion, form, or chicken-egg substitution rule was activated. No bundled recipe line
needed relinking. The duck French display remains subject to independent Québec review, and broader
Section Q work remains open.

Canonical post-merge snapshot: 446 ingredient references, 16 forms, and 612 research-ledger records.
