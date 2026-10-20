# WP06 Ethiopian pantry review — mitmita / berbere boundary

- **Date:** 2026-10-10
- **Status:** Proposal only. Recommend one source-bounded Ethiopian dry-spice identity for `mitmita`, separate from active `berbere`, generic chili powder, and prepared `awaze`. The fr-CA borrowed display is locally attested in a Québec French source but remains provisional pending terminology review.
- **Scope:** Product identity, names, and search boundaries only. No recipe, composition standard, measurement, form, conversion, substitution, or recipe link is proposed.
- **Section placement:** This review was opened as a WP06 African pantry follow-up. The proposed product is a spice blend (`BAKING_AND_SPICE`) and belongs under plan Section T’s open spice-blend checklist. It is not another Section Z condiment. Leave Section Z and its active `awaze` row untouched.
- **Decision owner:** Catalog coordinator. Recheck the live package before integration.

## Recommendation

Add one identity-only `BAKING_AND_SPICE` reference for Ethiopian **mitmita**. A Québec French-language food profile gives `Mitmita` its own glossary entry as a powdered-red-pepper spice mixture and separates it from `Berbéré`; an Ethiopian regional field study also records `mitmita powder` as a distinct named powder. These sources support a source-named dry seasoning identity. They do not establish one required formula, pepper cultivar, degree of heat, or countrywide preparation standard.

Suggested record, subject to coordinator review:

| Field | Proposal | Evidence and limit |
|---|---|---|
| ID | `ingredient-ref-mitmita` | No collision in the live active-reference or legacy-ID snapshot below; recheck before integration. |
| Category | `BAKING_AND_SPICE` | The reviewed product is a dry spice mixture/powder. |
| English display | `mitmita` | Source spelling. Do not add a country adjective to the name. |
| fr-CA display | `mitmita` | Fondation OLO and the Dispensaire diététique de Montréal use `Mitmita` in a French-language Québec food glossary. Treat this borrowed display as provisional: the source is not an OQLF/TERMIUM ruling, and domain-restricted web searches located no standalone terminology entry. |
| English aliases | `mitmita powder` | Directly attested wording in the regional Ethiopian study. It retains the source headword and stays specific to this powder product. |
| French aliases | None | The Québec source uses the headword `Mitmita`; generic description text such as `mélange d’épices` is not a unique alias. |
| Forms and numeric data | None | No form, density, unit mapping, measurement, conversion, or yield is supported for this identity. |

The OLO glossary says that use of its terms may vary from one family to another and describes optional spices. Use that as evidence of a variable named family, not as a canonical recipe. Its relative-heat statement is also source-specific and should not become a fixed catalog attribute.

## Identity boundaries and exclusions

| Term or product | Finding | Disposition |
|---|---|---|
| **Mitmita** | Québec French food material lists it as a spice mixture made with powdered red peppers and optional cardamom or clove; an Ethiopian regional study records `mitmita powder`. | Add one narrow dry-spice identity. Keep family-level variation open; do not encode a recipe or heat value. |
| **Berbere** | Already active as `ingredient-ref-berbere` (`BAKING_AND_SPICE`), with `berbere powder` as an English alias. OLO gives `Berbéré` a separate glossary entry and contrasts it with `Mitmita`. | Keep as a distinct identity. Do not alias either name or blend to the other. Shared region and pepper content do not make them synonyms. |
| **Generic chili powder** | Already active as `ingredient-ref-chili-powder`, displayed as `chili powder` / `poudre de chili`. Mitmita is a named regional blend; the generic category is broader. | Do not add `chili powder`, `chilli powder`, `poudre de chili`, `hot pepper powder`, or `Ethiopian chili powder` as mitmita aliases. |
| **Awaze** | Already active as `ingredient-ref-awaze` in `SAUCE_AND_CONDIMENT`, with `awaze sauce` and `awaze paste` aliases. It is a prepared condiment identity in Section Z. | Keep awaze separate from dry mitmita. Do not make either an alias, form, or universal ingredient of the other. This review does not infer awaze composition. |
| **Pepper fruit / cultivar sense** | Some Ethiopian literature also uses local pepper names in descriptions of Capsicum fruit. The reviewed local study’s row names both `Berbere` and `Mitmita` alongside a pepper-fruit category before referring to `mitmita powder`. | The proposed row covers only the source-named powder/blend. Do not use it for a fresh or dried whole pepper, a cultivar, or an unspecified ground pepper. Do not assert a botanical species. |
| **Spelling variants** (`mit-mita`, `mit mita`, `mitmitta`) | No reviewed source establishes these as stable aliases. The live search normalizer does not make closed compounds and separated words identical. | Do not add these spellings without direct evidence. Keep the canonical source spelling `mitmita`. |
| **Prepared mitmita sauce/paste** | No reviewed source supports a product-wide mitmita sauce or paste identity. | Do not add `mitmita sauce`, `mitmita paste`, or prepared-condiment forms. |
| **Eritrean attribution** | The Québec profile and regional study reviewed here locate the evidence in Ethiopian food contexts; neither establishes an Eritrean-wide product identity. | Limit the decision to the Ethiopian source-named product. Do not add Eritrean country scope or aliases. |

## Live catalog and search audit

Snapshot read from the live worktree on 2026-10-10. Hashes cover exact file bytes. Search results below follow `IngredientSearch.kt`: normalize case and compatibility characters, remove diacritics, turn punctuation into spaces, return contiguous phrase matches first, then use substring fallback. Search terms include active bilingual displays, aliases, and attached forms.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 709 references | `44bdcb736ab42bb2dd18f88d73bb1066d8a8ad909e6c8c394a18c4e6c2c073fb` |
| `ingredient-forms.v1.json` | 34 forms | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `legacy-import-identities.v1.json` | 84 candidates | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| `research-ledger.v1.json` | 898 records | `457dc0d49d22aa050ed12de1075dd6833e050ad58ab001d323ca15b5ccbe69e9` |
| Bundled `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe JSON aggregate | 114 files; 1,123 ingredient lines | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |

`ingredient-ref-mitmita` is absent from active and legacy IDs. No mitmita term, ledger record, or proposal-local source ID for this review was found in the live package/ledger. The query probes returned:

| Query | Current result |
|---|---|
| `mitmita`, `mitmita powder`, `mit-mita`, `mit mita`, `mitmita spice`, `Ethiopian mitmita` | No result |
| `Ethiopian chili powder`, `Ethiopian chilli powder`, `chilli powder` | No result |
| `chili powder`, `poudre de chili` | `ingredient-ref-chili-powder` only |
| `berbere`, `berbere powder` | `ingredient-ref-berbere` only |
| `awaze`, `awaze sauce`, `awaze paste` | `ingredient-ref-awaze` only |

The no-result probes show a genuine lookup gap. The neighboring exact matches also show why generic chili, berbere, and awaze terms must stay out of the new aliases.

### Bundled recipe demand

All 114 manifest-listed UTF-8 recipe files and their 1,123 ingredient lines were scanned in manifest order. Candidate probes `mitmita`, `mitmita powder`, `mit-mita`, `mit mita`, `mitmita spice`, `Ethiopian chili powder`, and `Ethiopian chilli powder` produced **zero ingredient-line matches and zero non-ingredient recipe-text matches**. Comparator terms `berbere` and `awaze` also produced no bundled recipe matches. The generic phrase `chili powder` appears in one ingredient line: `2 tbsp chili powder` in `recipes/034-chili-classique-au-boeuf-classic-beef-chili-4cbff09a-679f-420c-89e2-4175fb8e8662.v1.json`, already linked to `ingredient-ref-chili-powder`. This proposal fills a catalog gap only; it does not create recipe demand or relink that row.

The aggregate checksum hashes each relative recipe path, a NUL byte, exact recipe bytes, and a NUL byte in manifest order. Snapshot hashes will become stale as shared work continues; repeat the audit at integration.

## Forms, measurements, and substitutions

No form, density, unit mapping, package value, default measure, conversion, substitution, or recipe link is proposed. The sources identify and discuss a named spice mixture; they do not establish catalog conversion data or a universal preparation. No recipe composition, amount, or substitute is inferred.

## Sources

Sources checked online on 2026-10-10. Proposal-local IDs are for this review only; this proposal does not add or alter ledger rows.

| ID | Source | Claim used and limit |
|---|---|---|
| **WP06-MITMITA-20261010-S01** | Fondation OLO and Dispensaire diététique de Montréal, [*Profils alimentaires — Afrique de l’Est*](https://stage.fondationolo.ca/wp-content/uploads/2017/11/fondation-olo-profils-alimentaires-afrique-est.pdf), 2017, Ethiopia glossary, printed p. 36 and note p. 37 | Québec French-language source lists `Mitmita` separately from `Berbéré`, calls it a spice mixture involving powdered red peppers with cardamom or clove as optional additions, and describes it as hotter than `Berbéré`; it also notes glossary terms may vary between families. Supports the borrowed fr-CA headword and product distinction, not a terminology-board ruling, fixed formula, or universal heat comparison. |
| **WP06-MITMITA-20261010-S02** | Osie Mulatu, [“Exploring Indigenous Knowledge and Practices: Cultural and Ecological Dimensions of Spice Diversity in Hadiya and Kambata-Tembaro, Central Ethiopia”](https://doi.org/10.36253/jaeid-18286), *Journal of Agriculture and Environment for International Development* 119(2), 2025, Table 6 | Wachemo University field study reports interviews, focus groups, and observations in two Central Ethiopian zones. Table 6 records `Berbere` and `Mitmita` as distinct local names and includes the phrase `mitmita powder`. Supports the narrow English alias and local powder identity; one regional study does not establish a national formula or broader country scope. |
| **WP06-MITMITA-20261010-S03** | Office québécois de la langue française, [Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/), and Government of Canada, [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/) | Domain-restricted searches for `mitmita` and `mitmita powder` returned no indexed terminology entry. This is a limited search observation, not proof that no database record exists; it is why the borrowed French display remains provisional. |

## Integration action

1. At coordinator review, rerun the active-reference, form, legacy-ID, source-ID, normalized-search, and full-manifest recipe checks against the then-live package.
2. If accepted, add only `ingredient-ref-mitmita` as `BAKING_AND_SPICE`, with both displays `mitmita` and the single English alias `mitmita powder`. Keep the fr-CA display flagged for review. Do not add spelling, generic chili, berbere, awaze, sauce, or paste aliases.
3. Add the reviewed evidence to the ledger only during the authorized integration pass. Do not add forms, numeric values, composition, substitutions, or recipe links.
4. Record the completion as a bounded child under Section T’s open Ethiopian blend checklist. Keep Section T’s wider coverage open and leave Section Z’s separate awaze decision unchanged.

