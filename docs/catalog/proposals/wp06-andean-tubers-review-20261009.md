# WP06 Andean oca, ulluco, and mashua identity review

- **Reviewed:** 2026-10-09
- **Status:** Source-grounded proposal only; no shared catalog, ledger, recipe, test, roadmap, or plan files changed.
- **Recommendation:** Accept three distinct, identity-only vegetable candidates: oca, ulluco, and mashua. The botanical references treat them as separate accepted species, and the International Potato Center records them as separate Andean food crops with edible tubers. Keep variety-level handling, leaves, and named processed products outside these generic tuber identities.
- **Scope:** Botanical identity, Andean food use, English and proposed fr-CA naming, alias boundaries, and exact normalized-key/recipe-corpus audit.

## Candidate decisions

| Proposed ID | Decision and category | English display | Proposed fr-CA display | Alias decision |
|---|---|---|---|---|
| `ingredient-ref-oca` | **Accept**, `VEGETABLE_AND_AROMATIC` | `oca` | `oca` | No alias. TERMIUM records `oca` in both English and French for *Oxalis tuberosa*. Keep regional botanical names out of the EN/FR alias fields unless their language and food-product use are established. |
| `ingredient-ref-ulluco` | **Accept**, `VEGETABLE_AND_AROMATIC` | `ulluco` | `ulluque` | EN aliases `papa lisa` and `melloca`, which TERMIUM marks correct for South America. Do not add `ruba`, shared in Colombian botanical-name records with oca; keep other Spanish regional names unassigned. |
| `ingredient-ref-mashua` | **Accept**, `VEGETABLE_AND_AROMATIC` | `mashua` | `capucine tubéreuse` | EN alias `tuberous nasturtium`, which TERMIUM directly links to *Tropaeolum tuberosum*. Do not add `cubio/cubios`, shared in Colombian botanical-name records with oca, or unqualified `nabo/nabos`. |

TERMIUM Plus, the Government of Canada's terminology bank, supplies the proposed English and French names. Its entry places `ulluque` under French as a masculine noun and `capucine tubéreuse` under French as a feminine noun. No matching OQLF terminology entry was located in targeted searches, so the fr-CA displays remain proposed pending independent Québec French review. These are plant/product names, not invented translations. The English alias `papa lisa` is explicitly marked South American in TERMIUM; `tuberous nasturtium` is an English term in the same food-industry/vegetable-production/botany record.

Other source names—`ibia/ibias` for oca; `melloco`, `olluco/olloco`, and `chugua` for ulluco; and `anu/añu`, `isanu/isañu`, and `ysaño` for mashua—are useful regional search leads. They are not all English or French terms, and the catalog's aliases are language-keyed rather than region-keyed. Do not place them indiscriminately in EN/FR alias arrays. Two names are especially unsafe as cross-candidate aliases: Colombian botanical references list `ruba` for both *Oxalis tuberosa* and *Ullucus tuberosus*, and `cubio/cubios` for both *Oxalis tuberosa* and *Tropaeolum tuberosum*. Mashua's `nabo/nabos` is also too broad for an unqualified alias. [S01–S03, S06–S08]

## Identity and culinary evidence

Kew's Plants of the World Online accepts all three binomials as separate species and classifies each as a tuberous geophyte used for food. The International Potato Center's Andean crop table places them in different families—Oxalidaceae, Basellaceae, and Tropaeolaceae—identifies the edible part as the tuber, and records different current/traditional uses. This supports three crop identities, not three names for one potato form. [S01–S05]

| Candidate | Evidence-supported food context | Limits and exclusions |
|---|---|---|
| **Oca** (*Oxalis tuberosa*) | CIP describes Andean use in soups/stews and tubers baked or roasted; the genebank table records boiled/baked use and the traditional processed product `kaya`. A 2023 Peruvian INIA agronomic conservation guide reports farmers distinguish sweet and bitter ocas: sweet ones are sun-exposed before consumption, while bitter ones are washed and dried to reduce oxalates. [S04, S05, S09] | Accept the species-level edible-tuber identity, but do not create `sweet oca` and `bitter oca` identities/forms or supply preparation/safety instructions from this conservation guide. It does not establish consumer-grade market labels or a universal handling specification. Keep `kaya` separate and unmodeled; the consulted evidence does not define it as a raw/cooked form or establish a conversion. |
| **Ulluco** (*Ullucus tuberosus*) | CIP records soups, stews, and salads; its crop page says the high-water tuber is commonly boiled and separately notes that leaves are edible. TERMIUM identifies an edible Andean tuber. [S02, S04–S07] | This proposed identity covers the tuber. Do not alias edible leaves to the tuber row. CIP's traditional processing terms `lingle/chulqui` remain unmodeled products, not aliases or app forms. |
| **Mashua** (*Tropaeolum tuberosum*) | CIP records boiled/baked tubers and the traditional processed product `tayacha`; Kew's Colombia project record reports the tuber/“roots” used in soups. TERMIUM identifies a food crop and edible Andean tuber. [S03–S08] | This row covers the edible tuber only. Do not alias `tayacha` or treat the process name as a state form. TERMIUM's medicinal or environmental observations do not support food-safety or recipe claims and are not used here. |

The evidence supports botanical identity and established food use, not culinary interchangeability. No source reviewed establishes that one of these tubers can replace another or ordinary potato at a fixed ratio. The source descriptions support no density, household measure, cooking yield, package conversion, unit mapping, substitution, or recipe-specific quantity; leave all such data unknown.

## Proposed scope for any later integration

- Add at most the three identity-only references listed above, each with null density and empty unit mappings.
- Add no ingredient forms, preparation instructions, package yields, conversions, or substitutions in this packet.
- Keep oca's sweet/bitter classes unresolved at the product/preparation level; do not infer a safe, common treatment from an agronomic guide.
- Keep ulluco leaves distinct from the edible tuber identity, and keep `kaya`, `lingle/chulqui`, and `tayacha` out of aliases/forms until source-specific product boundaries are reviewed.
- Do not relink recipes: the current bundled corpus contains no matching rows.

## Exact catalog and recipe audit

The audit reproduced `normalizeIngredientSearchKey` from `IngredientSearch.kt`: lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ`/`æ`/`ß`, expand `&` to `and`, remove combining marks, replace non-ASCII alphanumeric runs with spaces, trim, and collapse spaces. Phrase checks required complete normalized words, avoiding substring false hits such as `oca` inside `cocoa`. It scanned reference names/aliases, form labels/match terms, legacy candidate names/aliases, all string fields in each recipe ingredient row, and all nested recipe string fields. Each table row below lists the source-attested phrase set used for that candidate; duplicate spellings that normalize to one key are counted once. For each candidate set, both exact normalized-key equality and whole-token phrase matching returned zero owners in active references, forms, and legacy candidates, and zero recipe-row or recipe-file hits.

| Live artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 479 references | `c827616bb3a7d0124575d22a9420974cb1942ef3ce5f59531741a49ad2f742b2` |
| `ingredient-forms.v1.json` | 17 forms | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Manifest-ordered recipe corpus | 114 recipe files / 1,123 ingredient rows | `8198a3f1da906817b464ecd7cbcdc7b5e4f2a6de5cb9fef80b7174a9c7277ff3` |

| Candidate phrase set scanned | Active reference owners | Form owners | Legacy owners | Recipe rows with phrase hit | Recipe files with phrase hit |
|---|---:|---:|---:|---:|---:|
| Oca (27 normalized phrases): `oca`, `Oxalis tuberosa`, `Oxalis tuberosa Molina`, `apilja`, `apilla`, `apiña`, `apio blanco`, `cuiba`, `hibia`, `ibia`, `ibias`, `kawi`, `lamaki`, `mishi-polé`, `oca de Chile`, `ocas`, `okka`, `piga-mishi`, `ruba`, `timbo`, `cubio`, `mafa`, `ocra`, `papaíbia`, `uca`, `oca dulce`, `oca amarga` | 0 | 0 | 0 | 0 / 1,123 | 0 / 114 |
| Ulluco (23 normalized phrases): `ulluco`, `ulluque`, `Ullucus tuberosus`, `chuagua`, `chugua`, `ruba`, `ullucu`, `chincheno`, `chuguas`, `colluco`, `lisas`, `melloco`, `melloca`, `olloco`, `olluco`, `papas lisas`, `rubas`, `ruhua`, `ulloco`, `ulluma`, `ullush`, `ilaco`, `papa lisa` | 0 | 0 | 0 | 0 / 1,123 | 0 / 114 |
| Mashua (20 normalized phrases): `mashua`, `Tropaeolum tuberosum`, `capucine tubéreuse`, `tuberous nasturtium`, `anu`, `añu`, `anyú`, `apiña-mama`, `isanu`, `isaño`, `isañu`, `ysaño`, `cubia`, `cubia cimarrona`, `cubias`, `cubio`, `cubios`, `majua`, `nabio`, `nabios`, `nabo`, `nabos` | 0 | 0 | 0 | 0 / 1,123 | 0 / 114 |

All 479 active references, 17 forms, 99 legacy candidates, 114 manifest-listed recipes, and 1,123 ingredient rows were scanned. The proposed IDs `ingredient-ref-oca`, `ingredient-ref-ulluco`, and `ingredient-ref-mashua` are absent from the active references and legacy candidates. The current package has no matching identity, form, legacy candidate, recipe ingredient name/original text, or other recipe text requiring reconciliation. The recipe digest hashes each manifest-relative path, a NUL byte, exact file bytes, and a NUL byte, in manifest order.

The source-ID prefix `WP06-ANDEAN-TUBERS-20261009-S` was searched across the repository before use and had no prior matches. IDs S01–S09 below are unique to this proposal and are not registered in the shared research ledger.

## Source register

All pages were consulted 2026-10-09. Claims are limited to the source wording described here.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP06-ANDEAN-TUBERS-20261009-S01** | Royal Botanic Gardens, Kew, Plants of the World Online, [*Oxalis tuberosa*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:178566-2/general-information). | Accepted species; tuberous geophyte and used for food. Colombian names are attributed to Colombian plant-name databases; they are botanical vernacular records, not proof of a particular market label. |
| **WP06-ANDEAN-TUBERS-20261009-S02** | Kew, Plants of the World Online, [*Ullucus tuberosus*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:167633-1/general-information). | Accepted species; tuberous geophyte and food use. The page reports Colombian common names including `ruba`, and separately records edible tubers and leaves through its cited useful-plant sources. |
| **WP06-ANDEAN-TUBERS-20261009-S03** | Kew, Plants of the World Online, [*Tropaeolum tuberosum*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:310353-2/general-information). | Accepted species; tuberous geophyte and food use. Colombian common-name records include `cubio/cubios`, `mashua`, and `nabo/nabos`; the page's cited useful-plant project reports soup use. Not a preparation standard. |
| **WP06-ANDEAN-TUBERS-20261009-S04** | International Potato Center (CIP) Genebank, [“Andean Root and Tuber Crops (ARTCs)”](https://cipotato.org/genebankcip/process/andean-root-and-tuber-crops-artcs/), table of current and traditional uses. | Search-indexed page content separates the three crops, families, edible tuber parts, cooking uses, and traditional processing names (`kaya`, `lingle/chulqui`, `tayacha`). Direct page retrieval returned 403 in this review. Broad crop summary, not product specifications or cooking-safety guidance. |
| **WP06-ANDEAN-TUBERS-20261009-S05** | CIP, [“Oca, Ulluco y Mashua”](https://cipotato.org/es/raices-y-tuberculos/oca-ulluco-y-mashua/). | Search-indexed page content describes Andean culinary use, oca cooked in soups/stews and baked/roasted, ulluco boiling and edible leaves, and crop context for mashua. Direct page retrieval was unavailable during this review. It is a general crop page; details do not define universal market forms. |
| **WP06-ANDEAN-TUBERS-20261009-S06** | Translation Bureau, Government of Canada, TERMIUM Plus, entry for [*Oxalis tuberosa* / oca](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=16&i=&index=alt&lang=eng&sg_kp_wet=517514&srchtxt=OCA), record dated 2009-01-22. | Gives `oca` in English and French and identifies an Andean edible crop. The record's French observation says “racine”; Kew and CIP identify the edible part as a tuber, so this proposal follows the botanical sources for anatomy. |
| **WP06-ANDEAN-TUBERS-20261009-S07** | Translation Bureau, Government of Canada, TERMIUM Plus, [ULLUCO](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=ULLUCO), record dated 2016-03-11. | French `ulluque`; English `ulluco`, `papa lisa`, and `melloca` (South America). Describes an edible Andean tuber. It supplies terminology, not region-scoped alias semantics for this application. |
| **WP06-ANDEAN-TUBERS-20261009-S08** | Translation Bureau, Government of Canada, TERMIUM Plus, [*Tropaeolum tuberosum*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=64&i=&index=enr&lang=eng&sg_kp_wet=379210&srchtxt=FOURTH), record dated 2016-03-11. | English `mashua` and `tuberous nasturtium`; French `capucine tubéreuse` and regional `ysaño`. Notes regional spellings such as Colombian `isaño/isañu`. Terminology record, not a Québec market survey. |
| **WP06-ANDEAN-TUBERS-20261009-S09** | Mary Zuñiga Bernal and Luis Albert Tumpay Sucno, Instituto Nacional de Innovación Agraria (Peru), [*Guía de manejo agronómico de oca para conservación ex situ*](https://repositorio.inia.gob.pe/items/4d244366-6435-42f2-b426-9d0314635de6), 2023, section 7.2, “Procesamiento de tubérculos” (printed p. 31), [repository PDF](https://repositorio.inia.gob.pe/bitstreams/47ed8e78-c3b0-405f-911f-56e47d6047ac/download). | The repository metadata was accessible and the section's relevant wording was available in the indexed excerpt. The 65 MB PDF could not be fetched by the browser tool. The excerpt reports sweet/bitter oca classes and source-described treatments, but the guide does not establish consumer product labeling or universal safety instructions. Verify the full passage before any future treatment/product implementation. |

This review proposes identity candidates only. It does not change the active package or ledger, link recipes, or establish any measurement or substitution data.
