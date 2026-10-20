# WP02 A6 round 18: Varagu / Kodo grain and flour aliases — 2026-10-13

## Review record

- **Scope:** Revisit the previously held regional name `varagu` for the existing kodo-millet grain and the exact flour phrase `varagu maavu` for its existing flour reference.
- **Prior boundary:** The WP03 kodo-grain review held `varagu` because it had not found matching Canadian package wording. The WP02 proso-millet atta review explicitly left `Pani Varagu Maavu` and `Panivaragu Mavu` unassigned. This packet reviews the distinct, unqualified Tamil crosswalk `Varagu` for kodo; it does not reopen or reassign the proso phrase.
- **Disposition:** Add only `varagu` to the English aliases of `ingredient-ref-kodo-millet` and `varagu maavu` to the English aliases of `ingredient-ref-kodo-millet-flour`. Create no new identity, form, candidate, recipe link, measurement, conversion, yield, or substitution.
- **Plan context:** A6 remains open for regional grain/flour names. The active plan and integrated round-17 packet were checked before selecting this gap.
- **Status:** Proposal packet; root integration completed 2026-10-13.

## Why the earlier hold is reconsidered

The 2026-10-10 WP03 kodo identity review retained `varagu` as inactive because it found no local package wording. The evidence has changed: ICAR–IIMR’s current crosswalk, updated 2026-07-07, lists Tamil `Varagu` under Kodo Millet and separately lists Tamil `Pani varagu` under Proso Millet. A current Scarborough retailer lists the whole grain as `Varagu Kodo Millet 1 Kg`. These sources make the grain boundary explicit and provide the previously missing Canadian-market wording.

The flour wording is also directly attested. The existing Organic Mandya kodo-flour page now lists `Varagu Maavu (Tamil)` among names for its kodo millet flour. A Canada-localized Silkrute listing uses `Kodo Millet Flour ... Varagu Maavu` in its product title. The Silkrute page is not available to direct fetch and its search snapshot is several months old, so it supports observed wording only; no current stock claim is made. The manufacturer page and the official grain crosswalk independently support the same flour-to-grain identity.

The old crosswalk is important to preserve: IIMR distinguishes `Varagu` (kodo) from `Pani varagu` (proso). No alias for `pani varagu`, `panivaragu`, or a spelling variant is proposed. The current picker will not make a `pani varagu` query select kodo.

## Exact proposed changes and product boundary

The active references already separate the whole grain from the milling product:

| Existing ID | Current display | Current aliases | Proposed alias | Preserve |
|---|---|---|---|---|
| `ingredient-ref-kodo-millet` | `kodo millet / kodo` | English: `koda millet`; French: none | English: `varagu` | `GRAIN_AND_CEREAL`, current displays, `defaultDensity: null`, `unitMappings: []` |
| `ingredient-ref-kodo-millet-flour` | `kodo millet flour / farine de millet kodo` | English: `kodo millet atta`; French: none | English: `varagu maavu` | `FLOUR_AND_STARCH`, current displays, `defaultDensity: null`, `unitMappings: []`, existing research observations and findings |

Keep the aliases on their matching grain or flour row. Do not add `varagu` to the flour row, `varagu maavu` to the grain row, or either alias to generic millet flour, proso millet, another millet species, or a mixed-millet product. Do not add `varagu flour`, `varagu atta`, `varagu arisi`, `varagu arisi maavu`, or a literal French construction; the recommendation uses only the source-observed keys above.

Do not add `pani varagu` or `panivaragu` to either kodo row or the proso row. IIMR’s source differentiates the qualified `Pani varagu` name for Proso Millet from `Varagu` for Kodo Millet. Because the proso phrase is not an active catalog key today, a query for `pani varagu` remains unmatched. If that separate phrase is reviewed later, the current picker will show the proso and kodo grain/flour choices for a shorter `varagu` query; that broad query would then be a multiple-choice result rather than a singleton.

The exact French display remains `kodo` for the grain and `farine de millet kodo` for the flour. TERMIUM supports `kodo` for the species in grain-growing terminology, and a Canadian French-facing product page uses `Farine de millet Kodo` for the existing flour. Neither source supports `farine de varagu`, `farine de millet varagu`, nor a French alias translating the Tamil name. No French catalog field changes are proposed.

## Source review and evidence limits

### Primary crosswalk and current Canadian-market wording

1. **ICAR–Indian Institute of Millets Research (IIMR), current language crosswalk.** Its live [Millets Information](https://millets.res.in/millets_info.php) page lists Tamil `Varagu` under Kodo Millet, while the Proso Millet row lists Tamil `Pani varagu`. The page states it was updated on 2026-07-07. It establishes grain-name mapping, not flour naming, Canadian availability, a measure, or a French display. This same URL is already registered as `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08`; reuse that source ID and extend its locator/support rather than creating another ID.
2. **Current Ontario retailer.** FreshOnTheGo Grocery’s live [Millets category](https://www.freshonthegogrocery.ca/categories/millets/10705000000251589) lists `Varagu Kodo Millet 1 Kg` with an Add to Cart control. Its contact block identifies Unit 12-400, Finchdene Square, Scarborough, Ontario. The page was crawled last week and checked 2026-10-13. This supplies current local grain-product wording; its package mass is not a recipe quantity. The identical URL is already registered as `WP02-A6-KAMBU-PEARL-MILLET-20261013-R14-S01` on the pearl-millet grain record. Reuse that ID and extend its locator/support when linking it to the kodo-grain record; do not mint a second ID for this URL.
3. **Current kodo-flour manufacturer page.** Organic Mandya’s [Kodo Millet Flour](https://organicmandya.com/products/kodo-millet-flour-500-gm) page was crawled two weeks ago and states that kodo millet flour is called `Varagu Maavu` in Tamil. The page identifies a single-grain kodo product, but it is an Indian manufacturer page, not Canadian or Québec product-label evidence. The URL is already registered as `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03`; reuse the source ID and update its locator/support, without duplicating the URL.
4. **Canada-localized flour listing.** The Canada-facing [Silkrute listing](https://www.silkrute.ca/grocery/cooking/flour/kodo-millet-flour-1-kg-35.27-oz/) is titled `B&B Organics Kodo Millet Flour 1 kg / Traditional Millet Flour / Varagu Maavu` and its indexed page displays CAD pricing. It was last crawled about four months ago; a direct fetch during this review returned 403. Use the page only as Canada-localized wording corroboration. Do not claim present availability, Canadian manufacture, independent Canadian terminology authority, or exact product contents beyond the page title. This URL is not in the current ledger/archive; assign a new source ID if root records it.

### Canadian and Québec French boundary

- The existing Government of Canada TERMIUM Plus record for *Paspalum scrobiculatum* includes English `varagu` as a correct name for the agricultural cereal grain and French standardized `kodo`. The underlying record is dated 2016-03-11; TERMIUM’s current site footer shows a 2026-08-17 modification date. The grain source is already registered as `WP03-KODO-20261010-S05`; the same URL is also already represented on the flour row as `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S01`. Reuse the existing source records; add no third ID for that URL. TERMIUM does not define `varagu maavu` as a flour name.
- Spice Divine’s French-facing Canadian listing [Farine de millet Kodo S&V](https://spicedivine.ca/fr/products/sv-kodo-millet-flour-907g) uses the existing `farine de millet kodo` wording and names flour milled from kodo millet. The search result was crawled about five months ago; its current stock state is not relied on. This URL is already registered on the flour row as `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S03`. It supports retaining the current French display, not adding a Varagu-based French alias.
- OQLF’s [millet entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), last updated in 2010, describes `millet` as a generic term that can group multiple species. It is not a kodo-specific flour ruling. Its existing source ID is `WP03-KODO-20261010-S06`; keep it as the reason to retain species-qualified French product wording.

The evidence supports the proposed English aliases, while its limits are clear: local Canadian exact wording is strong for the grain and less current for the flour phrase; no Québec retailer or OQLF page names `Varagu` or `Varagu Maavu` in French. The existing French displays remain the supported Canadian/Québec-facing choices.

## Ownership and picker projection

The live seed contains **1,345 references**, **98 forms**, **64 legacy-import candidates**, and the ledger has **1,658 records**. Exact normalized-key ownership was checked across reference names/aliases, form labels/match terms, legacy names/aliases, and ledger record IDs using the normalization rules in `IngredientSearch.kt`.

| Exact normalized key or ID | Current exact owner | Proposed outcome |
|---|---|---|
| `varagu`; `varagu maavu`; `varagu flour`; `pani varagu`; `panivaragu` | None | Add only `varagu` to kodo grain and `varagu maavu` to kodo flour; leave the other exact keys inactive. |
| `ingredient-ref-kodo-millet` | Existing verified grain reference | Reuse. |
| `ingredient-ref-kodo-millet-flour` | Existing verified flour reference | Reuse. |
| `kodo millet`; `koda millet`; `kodo` | Existing kodo grain reference | Keep unchanged. |
| `kodo millet flour`; `kodo millet atta`; `farine de millet kodo` | Existing kodo flour reference | Keep unchanged. |
| `ingredient-ref-varagu`; `ingredient-ref-varagu-flour` | None | Do not create IDs. |

The current picker first returns complete normalized word-phrase matches, then falls back to substring matching. A static projection with only the two proposed aliases gives:

| Query | Current result | With proposed aliases |
|---|---|---|
| `varagu` | None | Kodo grain and kodo flour; deliberate grain/flour choice. |
| `varagu maavu` | None | Kodo flour only. |
| `varagu flour` | None | None; this exact phrase is not proposed. |
| `pani varagu` / `panivaragu` | None | None; the IIMR proso-qualified name is not collapsed into kodo. |
| `kodo millet` | Kodo grain and kodo flour | Same two existing choices. |
| `kodo millet flour`; `kodo millet atta`; `farine de millet kodo` | Kodo flour only | Same flour result. |

The current references, forms, legacy candidates, and ledger record IDs contain no exact normalized owner for either proposed alias. Existing IIMR source notes mention regional terms as evidence; they do not create active alias ownership.

## Bundled recipe demand

The manifest-listed corpus contains **114 recipe files** and **1,123 ingredient rows**. A scan of all serialized recipe strings and ingredient-row fields covered `varagu`, `varagu maavu`, `varagu flour`, `pani varagu`, `panivaragu`, kodo grain/flour names, French display wording, and both existing reference IDs.

- Files with a candidate phrase or target ID: **0 of 114**.
- Ingredient rows with a candidate phrase or target ID: **0 of 1,123**.
- Direct ingredient-reference links to either kodo row: **0**.

No recipe edit, relink, or inferred demand is proposed. The recommendation is based on source-backed names for existing identities.

## Measures, forms, and substitution implications

Keep the existing rows’ active numeric behavior unchanged: both `defaultDensity` values remain null and both `unitMappings` arrays remain empty. Add no form, cooking yield, package yield, grain-to-flour conversion, or household measure.

The kodo-flour ledger already has two source-specific measurement observations: a laboratory flour-sample bulk density of **0.68 g/mL** (not a household fill convention) and one Tamil thattai recipe listing **1 cup or 250 g** (no cup standard or flour-fill method). Keep both as evidence for their original scope. Package weights such as the Canadian 1 kg grain listing and the indexed 1 kg flour title are retail mass, not kitchen conversions.

The flour row’s substitution research remains `blocked_pending_evidence`. Its existing findings cover one experimental unleavened flatbread blend and one heat-moisture-treated kodo-flour muffin formulation; neither gives a reusable general substitution rule. Add no active substitution and do not generalize the study-specific ratios or treatment to ordinary kodo flour.

## Source ID and URL collision audit

One new source ID is proposed. It was searched in the live ledger and proposal/batch archive and was absent before drafting; its URL is also absent from those sources.

| New source ID | Source | Limit |
|---|---|---|
| `WP02-A6-KODO-VARAGU-ALIAS-20261013-R18-S01` | Silkrute Canada, [B&B Organics Kodo Millet Flour / Varagu Maavu](https://www.silkrute.ca/grocery/cooking/flour/kodo-millet-flour-1-kg-35.27-oz/), search-indexed listing reviewed 2026-10-13. | Canada-localized exact title wording only; last crawl about four months ago and direct fetch returned 403. No current-stock or Canadian-manufacture claim. |

Reuse, rather than duplicate, these existing source IDs/URLs:

| Existing source ID | URL/source | Proposed reuse |
|---|---|---|
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08` | IIMR, [Millets Information](https://millets.res.in/millets_info.php) | Reuse for the updated Kodo/Varagu and Proso/Pani-varagu crosswalk; attach to the kodo grain record. |
| `WP02-A6-KAMBU-PEARL-MILLET-20261013-R14-S01` | FreshOnTheGo Grocery, [Millets category](https://www.freshonthegogrocery.ca/categories/millets/10705000000251589) | Reuse its same category URL; extend its locator/support and attach to the kodo grain record. |
| `WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03` | Organic Mandya, [Kodo Millet Flour](https://organicmandya.com/products/kodo-millet-flour-500-gm) | Reuse and update its locator/support for the current `Varagu Maavu` wording. |
| `WP03-KODO-20261010-S05`; `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S01` | TERMIUM Plus, [Kodo Millet](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=KODO) | Retain the existing grain and flour source records; do not create another ID for this URL. |
| `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S03` | Spice Divine, [Farine de millet Kodo](https://spicedivine.ca/fr/products/sv-kodo-millet-flour-907g) | Reuse as existing French flour-name evidence; no French alias is added. |
| `WP03-KODO-20261010-S06` | OQLF, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet) | Retain only for the generic/species-qualified French boundary; no new OQLF source ID. |

The proposal-local source ID and its URL are unique. No ingredient ID, form ID, legacy candidate, recipe link, measurement observation, substitution finding, or additional source URL is proposed.

## Root integration recommendation

1. Append `varagu` to `aliasesEn` on `ingredient-ref-kodo-millet` and `varagu maavu` to `aliasesEn` on `ingredient-ref-kodo-millet-flour`.
2. Preserve both displays, categories, French fields, existing aliases, active numeric fields, forms, recipe links, measurement observations, and blocked substitution findings.
3. Reuse the existing source IDs and URLs identified above. Add only the new Silkrute source ID if root records that Canada-localized wording; do not assert current stock.
4. Keep `pani varagu`, `panivaragu`, French constructions, and other regional spellings unassigned.
5. Preserve picker behavior: `varagu` offers kodo grain and flour; `varagu maavu` resolves to flour; `pani varagu` remains unmatched.

This packet changes no shared catalog, ledger, plan, roadmap, or generated files. It is proposal-only; no app or emulator tests were run. Under the updated `AGENTS.md` rule, later integration that only adds database JSON data requires no tests.

**Root integration complete.** Both aliases were added to their existing kodo grain/flour rows; `pani varagu` remains unassigned. See the [round-eighteen integration record](../batches/wp02-wp03-wp04-round18-gap-review-integration-20261013/README.md).
