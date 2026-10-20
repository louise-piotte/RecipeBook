# WP02 independent review: water-chestnut flour and starch boundaries

- **Reviewed:** 2026-10-09
- **Status:** Independent source and live-corpus review; this file only.
- **Recommendation:** Accept the source/process distinctions in the original proposal and keep broad water-chestnut names out of shared aliases. Defer new catalog rows and all product aliases until the coordinator chooses the botanical scope and an independent Québec French reviewer approves the product labels. WP02 Section B3 remains open.
- **Scope:** *Eleocharis dulcis* corm flour versus extracted corm starch; dried-fruit flour from *Trapa*; current naming collisions and live references, forms, legacy candidates, and recipe lines.

## Decision

The original proposal’s main boundary is supported, with one naming refinement. Keep these as separate candidate products:

1. **Whole-corm flour from *Eleocharis dulcis*.** The primary study calls it “Chinese water chestnut flour” and makes it by drying and milling corm slices.
2. **Extracted starch from *Eleocharis dulcis* corms.** The same study calls it “Chinese water chestnut starch” and describes aqueous extraction and settling. This is a separate product from the corm flour and the intact vegetable.
3. **Flour from dried *Trapa* fruits.** India’s eNAM specification calls this “water chestnut flour” / “Singhare ka atta” and scopes it to dried nuts of *Trapa bispinosa* or *T. quadrispinosa*.

Do not merge these products with each other or with the existing vegetable reference. Also do not treat **“Chinese water chestnut” as a reliable botanical disambiguator by itself**: Kew records “Chinese water chestnuts” as a vernacular name for *Trapa natans* var. *bispinosa*, as well as the scientific literature’s use of “Chinese water chestnut” for *E. dulcis*. The research wording is useful evidence for a source-specific product, but not a globally unique identity name.

| Decision | Recommendation | Basis |
| --- | --- | --- |
| Treat *E. dulcis* whole-corm flour and extracted corm starch as separate candidate identities | **Accept boundary** | Primary study describes different processing and separately characterizes the products. |
| Treat *Trapa* dried-fruit flour as distinct from both *E. dulcis* products | **Accept boundary** | Official eNAM commodity definition specifies *Trapa* dried nuts; the *E. dulcis* study specifies corms. |
| Add unqualified `water chestnut flour`, `Chinese water chestnut flour`, `water chestnut starch`, `water nut`, `singhara`, `singoda`, or `châtaigne d’eau` as cross-product aliases | **Reject** | The English common names cross botanical sources; the French plant name also has conflicting Québec records. Regional terms are product- and source-limited. |
| Add rows now | **Defer** | There are no matching recipe ingredient lines; the coordinator has not selected one or all product scopes, and no product-specific fr-CA display names are established. |
| Add density, volume mapping, form, conversion, dilution, or substitution data | **Defer** | The reviewed evidence does not establish reusable recipe measurement or interchangeability data. |

## Product and terminology findings

| Scope | Evidence-backed wording and process | Québec French status |
| --- | --- | --- |
| Existing vegetable row | Live ID `ingredient-ref-water-chestnut`, displayed as `water chestnut` / `châtaigne d'eau`; category `VEGETABLE_AND_AROMATIC`. It has no aliases, forms, density, or unit mappings. | OQLF’s 1982 entry uses `châtaigne d'eau` for an edible Chinese-sedge tuber. The current Québec flora page uses the same French and English names for *Trapa natans*. Keep the existing row’s product scope with its owner; this review does not rename it. |
| *E. dulcis* whole-corm flour | Rujirapisit uses “Chinese water chestnut flour.” The study washes and peels the corms, slices and dries them, then mills and sieves them. | No authoritative Québec product name found. Descriptive reviewer draft only: `farine de cormes d’Eleocharis dulcis`. |
| *E. dulcis* extracted corm starch | The same study uses “Chinese water chestnut starch.” It grinds peeled corms with water, filters and re-extracts the residue, settles starch from the filtrate, then dries, mills, and sieves it. | No authoritative Québec product name found. OQLF favors the general term `amidon` for starch and notes that `fécule` more specifically names starch from tubers or other underground organs. `fécule de cormes d’Eleocharis dulcis` is a descriptive reviewer draft, not an attested product name. |
| *Trapa* dried-fruit flour | eNAM’s exact commodity name is “WATER CHESTNUT FLOUR”; its common name is “Singhare ka atta.” Its definition uses ground clean, sound, dried nuts of *T. bispinosa* or *T. quadrispinosa*. | No authoritative Québec product name found. `farine de fruits séchés de Trapa` is a descriptive reviewer draft only. Keep `Singhare ka atta` as source wording, not a global alias. |

OQLF supports `farine` as the French term for `flour`; it does not establish the specific phrases above. The draft French descriptors use the botanical source so a reviewer can tell the products apart. They must not be activated as canonical names or aliases without that review. OQLF’s `amidon`/`fécule` distinction is terminology guidance only; it does not establish equivalent cooking behavior.

### Taxonomy and common-name collisions

- Kew accepts *Eleocharis dulcis* and lists *Eleocharis tuberosa* among its synonyms. The older OQLF Chinese-sedge entry spells the genus `Elcocharis`; preserve that source wording when describing the entry rather than copying it as current taxonomy.
- Kew treats *Trapa bispinosa* as a synonym of *Trapa natans* var. *bispinosa* and *Trapa quadrispinosa* as a synonym of *T. natans* var. *quadrispinosa*. Preserve the eNAM specification’s names when reporting what its commodity covers; do not silently rewrite its source scope in a future row.
- Kew’s common-name record for *T. natans* var. *bispinosa* includes “Chinese water chestnuts” and “singhara nut.” This is enough to show that “Chinese” is not a dependable species boundary in common naming, but it is not evidence that every *Trapa* flour label uses those words.
- The current Gouvernement du Québec flora entry identifies *T. natans* as `châtaigne d’eau` / `water chestnut`. OQLF also has a separate `châtaigne d'eau` entry translated as `water caltrop`, with `water chestnut` as an associated English term. Its older Chinese-sedge entry uses `châtaigne d'eau` for the edible tuber and lists `water chestnut` and `water nut`. The overlap makes these plant terms unsuitable as unqualified product aliases.

## Live catalog and recipe audit

The audit reproduced `normalizeIngredientSearchKey` from `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase with `Locale.ROOT`, normalize to NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace non-ASCII alphanumerics with spaces, then collapse whitespace. Search results use the app’s complete-word-phrase match first and substring fallback only if there are no phrase results. Reference searches included attached form labels and match terms. A read-only script examined current package files; no app launch or tests were run.

The **47 queries** covered: `water chestnut`, `Chinese water chestnut`, `water chestnut flour`, `Chinese water chestnut flour`, `water chestnut starch`, `Chinese water chestnut starch`, `water chestnut powder`, `Chinese water chestnut powder`, `water nut`, `water nut flour`, `water caltrop`, `water caltrop flour`, `singhara`, `singhara flour`, `singhare ka atta`, `singhara atta`, `singoda`, `singoda flour`, `singoda atta`, `singhada flour`, `singhara ka atta`, `ma tai`, `matai`, `ma tai fen`, `ma tai flour`, `ma ti`, `ma ti fen`, `mah tai`, `pi tsi`, `pi-tsi`, `kuwai`, `chestnut flour`, `chestnut starch`, `tree chestnut flour`, `châtaigne d’eau`, `farine de châtaigne d’eau`, `farine de châtaigne d’eau chinoise`, `fécule de châtaigne d’eau`, `fécule de châtaigne d’eau chinoise`, `amidon de châtaigne d’eau`, `amidon de châtaigne d’eau chinoise`, `farine de singhara`, `farine de singoda`, `farine de marron`, `farine de châtaigne`, `fécule de marron`, and `amidon de châtaigne`.

| Dataset | Current result |
| --- | --- |
| Ingredient references | `water chestnut` and accent/punctuation-normalized `châtaigne d’eau` each return only `ingredient-ref-water-chestnut`. The other 45 queries return no reference. |
| Ingredient forms | No query matches a form label or match term; no water-chestnut flour or starch form exists. |
| Legacy import candidates | No query matches a legacy candidate ID/name/alias. The current list contains 97 candidates. |
| Bundled recipe ingredient rows | No query matches any string field in 1,123 ingredient rows across the 114 paths listed in the current manifest. |

There is no current recipe-line need for any of the three product candidates. A future broad `water chestnut` search could return the existing vegetable and a separately named product; that is a useful discovery result, not a reason to merge them. A source-qualified display and separate IDs would be needed to keep the picker intelligible.

### Point-in-time audit hashes

Counts and SHA-256 values below describe the working-tree files read on 2026-10-09. The recipe fingerprint hashes each sorted manifest-relative recipe path, a NUL byte, the exact file bytes, and another NUL byte.

| Snapshot | Count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 509 references | `235871639394f42e344bf86159d463600a7e58f5d65645b38b6f7a21f475e644` |
| `ingredient-forms.v1.json` | 32 forms | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| `legacy-import-identities.v1.json` | 97 candidates | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |
| `research-ledger.v1.json` | 689 records | `f6ee45b415357f2bde780eb791dcd1b88ecc4d53420ffdacbb72c6316c2a88c8` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipe corpus | 114 files / 1,123 ingredient rows | `31139675c0a2f37863a57e2e45e8df203b0255b11e12cf54f1df944cdd426890` |

## Data limits and coordinator tasks

The evidence establishes product identity and processing boundaries only. Laboratory analyses of particular flour and starch samples do not establish a reusable ingredient density, volume mapping, dilution or reconstitution instruction, or conversion between the products. eNAM’s commodity specification is a source-specific quality and identity definition, not a recipe measurement source. No numeric value, form, substitution rule, package yield, or interchangeability claim is recommended.

1. Keep WP02 Section B3 unchecked. The plan’s WP03 Section J water-chestnut item describes the existing vegetable identity; it does not integrate or resolve these flour/starch products.
2. Decide whether catalog scope calls for the *E. dulcis* flour/starch pair, the *Trapa* fruit flour, or all three. There are no matching recipe lines in the present library.
3. Obtain independent Québec French review of the descriptive product labels before adding references. Keep common names and regional names inactive until the reviewer confirms their source-specific scope.
4. If integrated later, give each product a separate reference ID and `FLOUR_AND_STARCH` category. Do not add generic `water chestnut flour`, `Chinese water chestnut`, `water nut`, `water caltrop`, `singhara`, `singoda`, `ma tai`, or `châtaigne d'eau` aliases across these rows.
5. Leave density, unit mappings, forms, conversions, package yields, and substitutions empty until matched evidence supports a specific product and recipe use.

This report does not claim WP02 or Section J completion and changes no shared catalog, ledger, plan, roadmap, recipe, code, test, or generated file.

## Source register

Sources accessed 2026-10-09. Each source is limited to the listed claim.

| ID | Source and locator | Support and limits |
| --- | --- | --- |
| **WCIR-S01** | Panid Rujirapisit, “Chemical Composition and Some Physicochemical Properties of Chinese Water Chestnut (*Eleocharis dulcis*) Flour and Starch,” [conference proceedings PDF](https://www.thaiscience.info/Article%20for%20ThaiScience/Article/2/10029953.pdf), title/abstract and flour/starch preparation sections, pp. 207–208. | Primary study directly distinguishes the two *E. dulcis* corm products and their processing. One study and source lot; not a universal processing specification or product-naming standard. Its lab findings are not recipe conversions. |
| **WCIR-S02** | India National Agriculture Market, [commodity specification PDF](https://enam.gov.in/web/assest/download/sul/238_commodity_list.pdf), entry 228, “WATER CHESTNUT FLOUR,” common name and botanical name. | Official India market commodity defines the flour from dried *T. bispinosa* or *T. quadrispinosa* nuts and uses `Singhare ka atta`. It does not define all products sold under the English phrase or fr-CA terminology. |
| **WCIR-S03** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Eleocharis dulcis*](https://powo.science.kew.org/taxon/306797-1), accepted name and synonyms. | Current taxonomic reference accepts *E. dulcis* and lists *E. tuberosa* among synonyms. It is not a food product or regional-language authority. |
| **WCIR-S04** | Kew, [*Trapa bispinosa*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:431561-1) and [*Trapa natans* var. *quadrispinosa*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:77251753-1). | Kew treats the eNAM names as synonyms of accepted varieties under *T. natans*. Preserve the eNAM source wording in this review; the taxonomic backbone is not a product standard. |
| **WCIR-S05** | Kew, [*Trapa natans* var. *bispinosa*, common names](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:77098653-1/general-information), “Common Names.” | Records “Chinese water chestnuts” and “singhara nut” among vernacular names for the variety. This documents common-name overlap, not flour-label equivalence. |
| **WCIR-S06** | Gouvernement du Québec, [“Châtaigne d’eau”](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/flore/fiches-especes-floristiques/chataigne-eau), French, English, and scientific-name fields. | Current Québec flora entry identifies *T. natans* as `châtaigne d’eau` / `water chestnut`. It names a plant, not a processed food. |
| **WCIR-S07** | OQLF, [« châtaigne d'eau » — Chinese sedge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434646/chataigne-deau), preferred term, English terms, and definition; last updated 1982. | Gives `châtaigne d'eau` for an edible Chinese-sedge tuber and lists `water chestnut` and `water nut`. It is old and concerns the vegetable, not flour or starch. The displayed botanical spelling is `Elcocharis tuberosa`. |
| **WCIR-S08** | OQLF, [« châtaigne d'eau » — water caltrop](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19475118/chataigne-deau), English translation and associated term. | Gives English `water caltrop` and associated `water chestnut` for a separate plant-name record. It is not a product-naming source. |
| **WCIR-S09** | OQLF, [« amidon »](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon) and [« farine »](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432781/farine). | Supports the general French headwords `amidon`/`farine`; the `amidon` entry says `fécule` is more specific for starch in tubers or underground organs. It does not attest any water-chestnut product phrase. |
