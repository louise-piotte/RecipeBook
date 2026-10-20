# WP06 Ethiopian korarima identity review

- **Date:** 2026-10-16
- **Status:** Proposal only; no shared catalog, ledger, plan, or roadmap edits made.
- **Scope:** One Horn/East African spice identity, checked against the open African Section 05 and Section Z items, live catalog ownership, the proposal archive, and bundled recipe demand.
- **Recommendation:** Accept a narrowly named, identity-only `korarima` candidate for coordinator review. Keep it distinct from cardamom, large/black cardamom, and West African grains of paradise. Keep the borrowed name `korarima` as the fr-CA display; only consider fully qualified common-name aliases.

## Prior-work boundary

Section 05 still leaves broader North, West, Central, Horn/East, and Southern African cuisine coverage open. Section Z has completed reviews for Ethiopian niter kibbeh and awaze, but still calls for broader African pantry coverage. The prior bounded sweeps and the 2026-10-13 continuation do not name korarima. The 2026-10-16 kuli-kuli proposal covers a Nigerian snack and explicitly leaves the Ethiopian spice pantry separate.

This packet does not repeat egusi, fonio, dried oyster/Yokhoss, MENA work, the previously accepted African identities, or the held matooke, yaji, shiro-powder, and amasi/maas items. It does not reopen the Section Z groundnut-paste/red-palm boundary or treat recipe 090's peanut-butter line as demand for this candidate. This candidate does not close either checklist.

## Live package snapshot

Counts and hashes were refreshed from the shared worktree on 2026-10-16 before drafting. Hashes cover exact bytes. The recipe aggregate follows `manifest.recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, its exact recipe file bytes, and a NUL byte.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,595 references | 515,344 | `999088c56419aeb84bd95b022715de9b26a7126be3158c2ede8ac59d0e885392` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 122 forms | 92,787 | `d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1` |
| `docs/catalog/legacy-import-identities.v1.json` | 61 candidates | 14,525 | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| `docs/catalog/research-ledger.v1.json` | 1,940 records; 8,388 source entries; 7,128 distinct source IDs | 8,465,405 | `b577938bc7c4255efbbb74eec2c776fdb98d253e8acf95ac6998941174629589` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe JSON aggregate | 114 files; 1,123 ingredient rows | — | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

The proposed reference ID `ingredient-ref-korarima`, target proposal path, and proposal-local source-ID prefix `WP06-KORARIMA-20261016-S` were absent from active references, forms, legacy IDs, the research ledger, and the proposal archive at audit time. Recheck at any later integration.

## Identity and naming recommendation

| Candidate reference ID | Proposed English / fr-CA display | Category | Alias recommendation and limits |
|---|---|---|---|
| `ingredient-ref-korarima` | `korarima` / `korarima` | `BAKING_AND_SPICE` | Accept `kororima` as a common-name spelling, `Ethiopian cardamom` as a source-attested English name, and `cardamome d’Éthiopie` / `cardamome éthiopienne` as qualified French search aliases. Keep `korarima` as the fr-CA display: no OQLF entry for this product was found, and the Canadian French use of `cardamome éthiopienne` is secondary food writing rather than a terminology ruling. Do not add bare `cardamom` / `cardamome`, `false cardamom`, `poivre d’Éthiopie`, or `maniguette` as aliases. |

`Aframomum corrorima` is Kew's accepted scientific name; Kew lists `Aframomum korarima` as a synonym. The Jinka University article uses `kororima` as a common name in its text and spells its title's scientific name `Aframomum kororima`; this proposal accepts only the common-name spelling, not that title spelling as a botanical synonym. The species' documented range is broader than Ethiopia, so the country-qualified common name is a search term, not a claim that the plant is exclusive to Ethiopia or a license to infer Eritrean product standards.

The French name is deliberately conservative. OQLF's generic `cardamome` entry names *Elettaria cardamomum*; it does not establish a Québec term for korarima. FAO's EcoCrop entry records `cardamome d’Ethiopie`, and a Canadian French culinary article uses `cardamome éthiopienne ou korarima`. These support qualified search phrases only. Keep the fr-CA display borrowed as `korarima` pending a Québec terminology or community review.

## Catalog, form, and search ownership

The audit normalized whole phrases with the production search key: case-folding, compatibility decomposition, diacritic and punctuation removal, and whitespace collapse. Exact phrase matches take precedence over partial substring matching. Active bilingual names and aliases, attached form terms, legacy candidates, the ledger, prior proposals/batches, and manifest-listed recipes were checked.

| Query or boundary | Live ownership or result | Disposition |
|---|---|---|
| `korarima`, `kororima`, `Ethiopian cardamom`, `cardamome d’Éthiopie`, `cardamome éthiopienne`, `Aframomum corrorima`, `Aframomum korarima` | No exact active-reference, form, legacy, or ledger owner. No prior African proposal/batch claims a korarima identity. | New source-named identity. Keep taxonomy and common-name spelling separate; use only qualified common-name aliases. |
| `cardamom` | Active alias of `ingredient-ref-ground-cardamom` (`ground cardamom` / `cardamome moulue`). Active `ingredient-ref-large-cardamom` is also a phrase match for this broad query. | Do not attach bare `cardamom` to korarima. If the qualified English alias is accepted, broad `cardamom` search will intentionally return korarima alongside the two existing results; exact `Ethiopian cardamom` remains specific to the candidate. |
| `cardamome` | No exact catalog key, but current phrase-in-term search returns `ingredient-ref-ground-cardamom` (`cardamome moulue`) and `ingredient-ref-large-cardamom` (`cardamome noire`). | Do not add bare `cardamome`; a qualified `cardamome d’Éthiopie` / `cardamome éthiopienne` phrase would add a distinct, exact product search while broad `cardamome` remains multi-result. |
| `grains of paradise`, `maniguette` | Active `ingredient-ref-grains-of-paradise` / `maniguette`, with English aliases `melegueta pepper` and `Guinea grains`; Kew identifies its taxon as *Aframomum melegueta*. | Keep distinct from *A. corrorima*. Do not add grains-of-paradise, maniguette, or “maniguette d’Éthiopie” as korarima aliases. |
| `false cardamom`, `poivre d’Éthiopie`, `Guragi spice`, `korarima cardamom` | No exact active owner found; names are present in some crop/name sources, but are less precise or source-local. | Hold from global aliases. `false cardamom` is an ambiguous comparative name; `poivre d’Éthiopie` can widen generic pepper searches; `Guragi spice` needs a locality and usage review. |
| `cardamome` in OQLF | OQLF's GDT entry identifies *Elettaria cardamomum* and the English term `cardamom`. | Québec terminology evidence for generic cardamome only; it does not make korarima a cardamom form or synonym. |

The normalized-key audit found no candidate collision in the 122 current forms. The existing generic and large-cardamom rows are neighboring identities, not evidence of equivalence. No density, unit mapping, form, conversion, substitution, or product-state mapping is proposed.

## Bundled recipe demand

All 114 manifest-listed recipes and 1,123 ingredient records were scanned, including serialized recipe text and ingredient rows. Exact normalized probes for `korarima`, `kororima`, `Ethiopian cardamom`, `cardamome d’Éthiopie`, `cardamome éthiopienne`, `Aframomum corrorima`, and the held names returned zero full-recipe and zero ingredient-line matches. The bundled corpus supplies no present recipe demand or relink evidence for korarima.

The nearest recipe context is generic cardamom, not korarima:

| Recipe | Exact ingredient line | Current reference |
|---|---|---|
| `recipes/048-garam-masala-de2f7507-1126-4c10-a364-320b0e540125.v1.json` | `1 1/2 tsp ground cardamom` | `ingredient-ref-ground-cardamom` |
| `recipes/086-poulet-au-beurre-butter-chicken-1d0098bc-da72-40b3-ab68-d128d7ba0c3c.v1.json` | `1/6 tsp ground cardamom` | `ingredient-ref-ground-cardamom` |

Neither line names korarima, a source-qualified Ethiopian product, or its common-name variants. Keep both recipe links unchanged; they are not evidence for an alias, substitution, or conversion.

## Evidence and limits

Sources were checked on 2026-10-16. Source IDs are local to this proposal and have not been entered in the shared research ledger.

| ID | Source and locator | Claim used and limit |
|---|---|---|
| **WP06-KORARIMA-20261016-S01** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Aframomum corrorima*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:908251-1). | Accepts *A. corrorima* and lists *A. korarima* as a synonym; gives a native range beyond Ethiopia. Supports taxonomic identity and the limit on exclusive-country wording, not culinary aliases. |
| **WP06-KORARIMA-20261016-S02** | Gutema and Ejo, Jinka University, [“Determinants of production and marketing of Kororima (*Aframomum kororima*); the case of South Ari district, South Omo zone, SNNPR, Ethiopia”](https://journals.wgu.edu.et/index.php/afnr/article/view/1837), *Journal of Agriculture, Food and Natural Resources* 3(3), 2025. | The peer-reviewed university journal's abstract and introduction identify *A. corrorima* as `Ethiopian cardamom` or `kororima`, a spice used throughout Ethiopia, and distinguish it in a list from Asian cardamom (*Elettaria cardamomum*). The title's `A. kororima` spelling is not treated here as a Kew-accepted scientific synonym. The agricultural survey does not define a universal spice product or recipe. |
| **WP06-KORARIMA-20261016-S03** | P.C.M. Jansen, [“*Aframomum corrorima* (Jansen, 1981)”](https://plantuse.plantnet.org/en/Aframomum_corrorima_%28Jansen%2C_1981%29), digital transcription of *Spices, condiments and medicinal plants in Ethiopia: their taxonomy and agricultural significance*, Agricultural Research Report 906 (1981), Culinary uses. | Describes dried and sometimes fresh seeds in Ethiopian wot, coffee, sometimes tea or bread, with seeds ground and often mixed with other spices. This supports culinary identity and variation; it does not support a standard formula, substitution, measure, or storage guidance. |
| **WP06-KORARIMA-20261016-S04** | FAO, [EcoCrop entry: *Aframomum corrorima*](https://ecocrop.apps.fao.org/ecocrop/srv/en/cropView?id=2863). | Lists `Korarima`, `false cardamom`, `Guragi spice`, `cardamome d’Ethiopie`, and `poivre d’Ethiopie` as common names and cites Jansen 1981. Used for source-attested French wording only; the entry does not establish Québec preference or synonymy with generic cardamom/pepper. |
| **WP06-KORARIMA-20261016-S05** | Office québécois de la langue française, [GDT: cardamome](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095237/cardamome). | Defines the generic French term and links it to *Elettaria cardamomum*. This is a boundary source, not a korarima name recommendation. No OQLF korarima entry surfaced in targeted lookup. |
| **WP06-KORARIMA-20261016-S06** | Eh Toque!, [“Korarima ou cardamome éthiopienne”](https://ehtoque.ca/2020/12/28/korarima-ou-cardamome-ethiopienne/), Canadian French culinary article. | Attests `cardamome éthiopienne` as francophone culinary usage alongside `korarima`; used only as secondary wording evidence. It is not an OQLF terminology decision, botanical authority, standard product definition, or source for a catalog blend formula. |
| **WP06-KORARIMA-20261016-S07** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Aframomum melegueta*](https://powo.science.kew.org/taxon/871877-1). | Accepts *A. melegueta* separately and records `grains of paradise` as a common name. Supports the boundary with active `ingredient-ref-grains-of-paradise`; does not establish any French synonym for korarima. |

The sources support a distinct culinary spice name, but they do not justify one universal dried/fresh state, pod-versus-seed equivalence, ingredient quantity, density, conversion, yield, safe substitution, or recipe formula. Kew's distribution also cautions against using “Ethiopian” as an exclusive geographic claim. The sources reviewed do not settle preferred Québec terminology beyond keeping the source name visible.

## Next actions

1. Coordinator: decide whether to add `ingredient-ref-korarima` as an identity-only `BAKING_AND_SPICE` row with `korarima` displayed in both locales.
2. If accepted, decide whether to retain the exact qualified aliases `kororima`, `Ethiopian cardamom`, `cardamome d’Éthiopie`, and `cardamome éthiopienne`. Recheck current search ownership and assess the intentionally broader `cardamom` / `cardamome` result sets at integration time.
3. Keep bare cardamom, false-cardamom, generic pepper, maniguette, and grains-of-paradise terms outside aliases. Do not attach recipe lines, forms, measurements, density, unit mappings, conversions, yields, or substitutions.
4. Keep Section 05 and Section Z open for broader African cuisine and Québec/community terminology work.

This deliverable is proposal documentation only. No tests or emulator checks were run.
