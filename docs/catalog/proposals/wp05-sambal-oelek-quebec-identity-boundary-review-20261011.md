# WP05 Sambal Oelek — Québec Naming and Identity-Boundary Review

Date: 2026-10-11. Scope: the single open sambal oelek candidate in Section X of `docs/RecipeBook-global-ingredient-catalog-plan.txt`. The identity-only recommendation was integrated on 2026-10-11; see the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the canonical row and verification.

## Recommendation

**ACCEPT an identity-only addition, with the French wording corrected from the earlier provisional phrase.** The live OQLF entry gives `sambal oelek` as a preferred French term and `sambal ulek` as a synonym; its English section gives the same two terms. The earlier parenthetical `pâte de piment` is unnecessary and too broad for the canonical display. The manufacturer and Indonesian tourism sources continue to support a distinct named condiment and separate sambal types.

Integrated record:

| Seed field | Value |
|---|---|
| ID | `ingredient-ref-sambal-oelek` |
| English display | `sambal oelek` |
| Québec French display | `sambal oelek` |
| English aliases | `sambal ulek` |
| French aliases | `sambal ulek` |
| Category | `SAUCE_AND_CONDIMENT` |
| Density / unit mappings | `null` / none |

Do **not** activate the unqualified alias `sambal`, despite its OQLF note that it is sometimes used by ellipsis. In ingredient search, it also names the broad family that includes matah, bajak, terasi, and other distinct sambals. Do not add `pâte de piment`, `chili paste`, `chilli paste`, or generic chili sauce as aliases. These are broad descriptions, not exact synonyms for this identity.

## Evidence and naming assessment

The prior WP05 umbrella proposal already identified sambal oelek as its own product and gave Huy Fong as product evidence. Its evidence remains live: Huy Fong's current product list still names **SAMBAL OELEK** and describes its own product as a full-bodied sauce with a pure chili taste [S02–S03]. The named-product evidence is useful, but it describes one manufacturer and does not define every regional recipe.

The earlier French display `sambal oelek (pâte de piment)` was provisional. The OQLF entry is a better direct Québec source: it defines the Indonesian preparation as crushed hot peppers, generally with salt and vinegar, and lists `sambal oelek` and `sambal ulek` as preferred French terms. Its English terms are `sambal oelek` and `sambal ulek` [S01]. The page says it was last updated in 2002; it is live and was checked for this review. No separate standardized French descriptor is needed for the display.

The Ministry of Tourism's current sambal overview treats sambal as a broad family with regional types. It describes matah as a fresh sambal made from raw ingredients and not meshed together; terasi is a separate sambal type with raw and cooked versions and terasi (shrimp paste) as an ingredient [S04]. Its current Indonesian-language overview describes bajak as a cooked Banten sambal with its own ingredient profile [S05]. These sources support separate identities and show why the generic word `sambal` is not a safe universal alias. Sambal terasi is the compound; terasi is one of its ingredients, not another name for sambal oelek.

## Live package and collision audit

Snapshot: current worktree read on 2026-10-11. Counts and hashes below identify the files inspected; counts are from the JSON arrays/recipe files.

| Live artifact | Inspected state | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 901 references; no sambal-oelek, sambal-ulek, matah, bajak, or terasi identity; no generic chili-paste reference | `3aeed07fe4c66bb286eaeb15540604d5206650ee1c38c987076346c8b5b01bed` |
| `ingredient-forms.v1.json` | 48 forms; no sambal or chili-paste form/term | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `research-ledger.v1.json` | 1,153 records; no dedicated sambal-oelek identity, source record, or decision | `0d819e78e77dc06f6da7a3eec05e1de74d8faa5b08c6c0596eb73a86fa165f70` |
| `legacy-import-identities.v1.json` | 77 candidates; no sambal/oelek/ulek/matah/bajak/terasi candidate | `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57` |
| Section X plan | Sambal oelek remains in the open combined sambal checklist item | `48ca8be68bbb1f0b6cf8ca6310ccfa56d651ee4eb3d6b305bfb814ef061a565e` |
| Prior WP05 umbrella proposal | Proposes the distinct identity but labels French wording provisional as `sambal oelek (pâte de piment)`; this review supersedes that wording recommendation only | `55374e0410d1f429be343a9332253d66033067e6cc6fa29a8ca93bd6508f4c84` |

The active reference catalog already has `sauce sriracha / sriracha sauce`, with OQLF spelling aliases, and `yuzu kosho` with the specific English alias `yuzu chili paste`. Those are not collisions with the proposed exact sambal names. The ledger's Sriracha decision explicitly keeps it separate from sambal and generic chili paste; its Kapi and padaek decisions also mention sambal terasi only as a separate compound boundary. No live alias for generic `chili paste` was found. No canonical identifier or legacy candidate already occupies `ingredient-ref-sambal-oelek`.

## Recipe demand and numeric/form disposition

The bundled package has 114 recipe files and 1,123 ingredient lines. A field-level scan of every ingredient line found no sambal, oelek, ulek, matah, bajak, terasi, belacan, or generic chili-paste demand. Recipe 019 has two Sriracha lines, already linked to `ingredient-ref-sriracha-sauce`; these do not support a sambal alias or substitution. No ingredient line currently links to a sambal identity.

No form, density, unit mapping, measured volume-to-mass value, package yield, conversion, or substitution is supported. The OQLF definition and Huy Fong product wording establish identity and product description, not recipe-unit behavior. Huy Fong's package sizes are not kitchen conversions or yield observations. Do not create a recipe-line link in this batch.

## Source register

All pages were checked on 2026-10-11.

| ID | Source | Supports / limits |
|---|---|---|
| `WP05-SAMBAL-OELEK-20261011-S01` | Office québécois de la langue française, [sambal oelek](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361603/sambal-oelek) | Direct Québec terminology and definition. Lists `sambal oelek`, `sambal`, `sambal ulek` in French; its English section lists `sambal oelek` and `sambal ulek`. Last updated 2002. The occasional elliptical `sambal` use is not safe as a global ingredient alias given the documented distinct sambal types. |
| `WP05-SAMBAL-OELEK-20261011-S02` | Huy Fong Foods, [Sambal Oelek](https://www.huyfong.com/sambal-oelek/) | The named manufacturer product page remains online and identifies its product as Sambal Oelek. It is a dated 2015 post, so use it for product-name continuity, not as a current universal formula. |
| `WP05-SAMBAL-OELEK-20261011-S03` | Huy Fong Foods, [current product list](https://www.huyfong.com/) | Current listing names Sambal Oelek separately from Sriracha and Chili Garlic and describes the company's own product. Manufacturer-specific evidence only. |
| `WP05-SAMBAL-OELEK-20261011-S04` | Indonesia Travel, Ministry of Tourism, [Dare Taste Indonesia's Hottest Burning Sambal](https://www.indonesia.travel/gb/en/travel-ideas/gastronomy/dare-taste-indonesia-s-hottest-burning-sambal) | Distinguishes the broader sambal family; describes matah as fresh/raw and not meshed, and terasi sambal as a distinct type with raw and cooked versions containing terasi. It does not define sambal oelek. |
| `WP05-SAMBAL-OELEK-20261011-S05` | Indonesia Travel, Ministry of Tourism, [10 Sambal Khas Indonesia](https://www.indonesia.travel/id/id/travel-ideas/gastronomy/10-sambal-khas-nusantara-yang-wajib-dicoba) | The current Indonesian-language page describes matah as not pounded or cooked and bajak as a cooked Banten sambal. Search retrieval returned the page text on the review date, but a direct open returned HTTP 502; retain that access limit when this evidence is reused. |
| `WP05-SAMBAL-OELEK-20261011-S06` | Québec Ministry of Agriculture, Fisheries and Food, [Répertoire des aliments québécois — Sambal Oelek 250 ml](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8209512) | Current Québec food-directory record, last updated 2026-04-09, lists a Firebarns Sambal Oelek product made in Lévis and describes it as hot-pepper paste with vinegar, salt, and sugar. This is one local product record, not a universal formula or terminology synonym list. |

## Decision boundary and evidence limits

This review accepts one named product-family identity and its source-attested spelling synonym. It does not accept a universal “sambal” identity, nor does it resolve the other open sambal or fermented-paste checklist items. The Ministry pages are culinary references rather than compositional standards; they distinguish types but do not establish exact commercial formulations. Huy Fong is one commercial example. The OQLF terminology entry is directly applicable to Québec French but has not been updated since 2002. These sources are adequate for the identity and display only; they do not support forms or numeric/conversion behavior.
