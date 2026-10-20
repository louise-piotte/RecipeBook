# WP02 Section 04 A6 R165 — Kauni foxtail-millet name and flour boundary

## Review record

- **Reviewed:** 2026-10-16; institutional and seller pages were checked online for this review.
- **Status:** Proposal only. No shared catalog JSON, research ledger, generated index, recipe, plan, roadmap, or batch README was changed.
- **Open checklist:** WP02 Section 04 A6 remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). R163 added `kakum` and `kakun` to foxtail millet and `kakum flour` to foxtail millet flour; R164 added `kangani` and the exact flour phrase `kangani ka atta`. See the [R163 proposal](wp02-a6-next-regional-flour-gap-review-r163-20261016-kakum-foxtail-millet.md), [R163 integration](../batches/wp02-wp03-wp04-r163-gap-review-integration-20261016/README.md), [R164 proposal](wp02-a6-next-regional-flour-gap-review-r164-20261016-kangani-foxtail-millet.md), and [R164 integration](../batches/wp02-wp03-wp04-r164-gap-review-integration-20261016/README.md).
- **Scope:** Review the uncovered Uttarakhand name `Kauni` for existing foxtail millet and its use in flour-based food. Do not create a new crop, flour, grade, or process identity.
- **Prior-review check:** A search of the A6 plan, proposals, and batch records found no previous `Kauni` allocation or hold. The current rows and alias history were read directly from the bundled references and research ledger.

## Recommendation

Add the regional name **`kauni`** to the English-search aliases on the existing `ingredient-ref-foxtail-millet` grain row. Keep the display `foxtail millet / millet d'Italie`, its French aliases, and all other fields unchanged.

Do **not** add `kauni flour`, `kauni atta`, `kauni ka atta`, or `kauni millet flour` to `ingredient-ref-foxtail-millet-flour`. The ICAR-VPKAS recipe book documents a local `Kauni Ki Roti` made with foxtail millet flour, but does not name that ingredient “Kauni flour.” The seller page that uses Kauni in a flour title explicitly calls its product **sprouted** Kauni millet flour. Those sources establish food use and a process-qualified product name, not an unqualified flour alias. Keep the sprouted product outside the active catalog pending Canadian/Québec naming and product-boundary evidence.

This is the strongest next A6 gap because `Kauni` is directly mapped to *Setaria italica* by regional agricultural sources and appears in a retailer grain listing, while the specific flour wording has a clear process boundary. The proposed grain alias improves regional lookup without overextending it to a distinct milling product.

## Exact proposed delta

Append only `kauni` to `aliasesEn` on the existing foxtail-millet grain reference:

```json
{
  "ingredient-ref-foxtail-millet": {
    "aliasesEn": [
      "thinai", "kangni", "korra", "rala", "navane", "kakum", "kakun", "kangani", "kauni"
    ]
  }
}
```

Add no reference or legacy identity, and make no change to `ingredient-ref-foxtail-millet-flour`. If integrated, append the supported source entries and one accepted alias decision to the existing foxtail-grain ledger record; attach the flour-boundary sources and a bounded unresolved decision to the existing flour record. Do not add a measurement observation, form, recipe link, conversion, yield, or substitution.

## Identity and wording boundary

| Term or field | Recommendation | Evidence limit |
|---|---|---|
| `kauni` | Add as a search alias to `ingredient-ref-foxtail-millet`. | ICAR and GBPIHED sources identify Kauni as a regional name for foxtail millet (*Setaria italica*); a seller listing also pairs the exact name with Foxtail Millet. This is a source-grain name, not a cultivar or grade. [S01, S03, S04] |
| `Kauni Ki Roti` | Keep as an external recipe title, not an ingredient alias. | ICAR-VPKAS translates the traditional dish as foxtail-millet chapati and lists foxtail millet flour in the recipe. It does not label the flour “Kauni flour.” [S02] |
| `kauni flour`, `kauni atta`, `kauni ka atta`, `kauni millet flour` | Leave unassigned to the plain flour row. | No reviewed source uses these exact unqualified product names. The directly listed Kauni flour is explicitly sprouted. [S02, S05] |
| `sprouted kauni millet flour` | Keep outside active references for now. | A seller page lists the process-qualified product but is India-based, currently not accepting orders, and does not establish a Canadian/Québec name or a transferable process specification. Do not collapse it into plain foxtail millet flour. [S05] |
| French wording | Keep `millet d'Italie` and `farine de millet d'Italie`; add no French alias. | No reviewed source establishes a Québec French Kauni label or a flour-specific French term. |

## Live catalog, exact-key, and source audit

The current package contains **1,540 references** and **119 forms**; the legacy identity file has **61 candidates**. The research ledger contains **1,885 records, 8,031 source entries, 6,872 distinct source IDs, and 5,670 distinct URLs**. The R165 source-ID prefix below is absent from the ledger and proposal/batch archive. None of the five reviewed source URLs is already registered in the ledger.

The current target rows are:

- `ingredient-ref-foxtail-millet` — `foxtail millet / millet d'Italie`, English aliases `thinai`, `kangni`, `korra`, `rala`, `navane`, `kakum`, `kakun`, and `kangani`; category `GRAIN_AND_CEREAL`.
- `ingredient-ref-foxtail-millet-flour` — `foxtail millet flour / farine de millet d'Italie`, English aliases `thinai flour`, `kangni flour`, `korra flour`, `navane atta`, `kakum flour`, and `kangani ka atta`; category `FLOUR_AND_STARCH`.

Both rows have no attached forms, `defaultDensity: null`, and `unitMappings: []`. The grain ledger record is `verified / not_yet_researched / not_yet_researched` for identity, measurement, and substitution research. The flour record is `verified / researched_supported / blocked_pending_evidence`.

Exact normalized ownership was checked across active reference IDs, names, and aliases; all form IDs, labels, and match terms; the full legacy-candidate records; and research-ledger record IDs. Normalization followed [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace non-alphanumeric runs with spaces, and collapse whitespace.

| Candidate key or ID | Current exact owner | Disposition |
|---|---|---|
| `kauni` | None | Add only to the existing foxtail-grain row. |
| `kauni flour`, `kauni atta`, `kauni ka atta`, `kauni millet flour` | None | Leave unassigned; the exact flour product evidence is process-qualified as sprouted. |
| `sprouted kauni millet flour`, `sprouted foxtail millet flour` | None | No active identity proposed. |
| `ingredient-ref-kauni-foxtail-millet` | None in references, legacy candidates, or ledger IDs | Do not create a new identity; reuse `ingredient-ref-foxtail-millet`. |
| `foxtail millet`, `millet d'Italie` | `ingredient-ref-foxtail-millet` | Keep unchanged. |
| `foxtail millet flour`, `farine de millet d'Italie` | `ingredient-ref-foxtail-millet-flour` | Keep unchanged. |

The five proposed source IDs are `WP02-A6-KAUNI-FOXTAIL-R165-20261016-S01` through `S05`. None is already in the ledger or archive. They are proposal-local until an integration review accepts them.

## Picker projection

The projection follows the phrase-first and substring-fallback behavior in `IngredientSearch.kt`; it is a static catalog audit, not a runtime picker test.

| Query | Current result | Projected result | Effect |
|---|---|---|---|
| `kauni` | None | Foxtail millet grain | The exact regional name selects the existing grain row. |
| `kauni flour`, `kauni atta`, `kauni ka atta`, `kauni ki roti` | None | None | Longer unreviewed phrases do not match the one-word grain alias; no flour alias is inferred. |
| `sprouted kauni millet flour` | None | None | The process-qualified seller item remains outside active references. |
| `foxtail millet` | Foxtail grain and foxtail flour | Same | Existing broad grain/flour choices remain intact. |
| `foxtail millet flour` | Foxtail flour | Same | Existing specific flour search remains unique. |
| `millet d'Italie` | Foxtail grain and foxtail flour | Same | Existing French search behavior is unchanged. |

## Bundled recipe demand

Every path in the seed manifest was scanned: **114 recipe files and 1,123 ingredient rows**. The search covered `kauni`, `kauni flour`, `kauni atta`, `kauni ka atta`, `Kauni Ki Roti`, `foxtail millet`, `foxtail millet flour`, `sprouted kauni millet flour`, `sprouted foxtail millet flour`, *Setaria italica*, and both target reference IDs.

- Recipe files with a candidate phrase or target ID: **0 of 114**.
- Ingredient rows with a candidate phrase or target ID: **0 of 1,123**.
- Direct recipe links to either target reference: **0**.
- Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Manifest-ordered recipe-corpus fingerprint: `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`.

No bundled recipe text, amount, link, or instruction is proposed.

## Measurement, forms, and substitution assessment

No candidate-specific numeric or runtime behavior is supported or proposed.

- **Grain:** Keep no attached form, density, unit mapping, measurement observation, conversion, yield, or substitution. The grain ledger's measurement and substitution states remain `not_yet_researched`.
- **Flour forms and active numeric fields:** Keep no attached form, `defaultDensity: null`, and `unitMappings: []` on the existing flour row.
- **Flour research observations:** The existing ledger records a study-specific foxtail-flour bulk-density range of **502.6–534.9 kg/m³** (**0.5026–0.5349 g/mL**) across samples with differing moisture. It is not a Kauni-specific value, household cup measure, or transferable active density.
- **Recipe amount:** The ICAR-VPKAS Kauni Ki Roti recipe lists **350 g foxtail millet flour**, **125 g wheat flour**, and approximately **300 mL water**. These are one published recipe's quantities; do not convert them to reusable household measures or a standard flour ratio. [S02]
- **Substitution:** Existing foxtail-flour research reports 0%, 10%, 20%, 30%, and 40% in one wheat bread-ready-mix formula, with 30% selected within that study. Keep this blocked from a general wheat-replacement rule. The VPKAS chapati formula likewise does not establish a reusable substitute across roti, breads, or baking. No global, contextual, or recipe-line substitution is proposed.
- **Recipe links and yields:** Add none. The local recipe source is not part of the bundled manifest corpus, and its quantities do not establish a reusable yield or link.

## Source register

All source IDs are new, proposal-local IDs. If integrated, attach S01, S03, and S04 to the existing foxtail-grain record; attach S02 to both existing grain and flour records for the regional recipe/name boundary; and attach S05 to the flour record for the process-qualified product boundary. Do not add a new ledger candidate or identity.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP02-A6-KAUNI-FOXTAIL-R165-20261016-S01** | J. S. Aswal et al., [“Potential Role of Traditional Crops in Uttarakhand for nutritional security”](https://epubs.icar.org.in/index.php/IndFarm/article/download/76181/31796/193094), *Indian Farming* 67(05), May 2017, printed p. 10. | The entry identifies *Setaria italica*, says its local name is Kauni, and names foxtail millet. This primary regional agricultural publication supports the grain alias, not a flour name, Canadian product, measure, or substitution. |
| **WP02-A6-KAUNI-FOXTAIL-R165-20261016-S02** | ICAR–Vivekananda Parvatiya Krishi Anusandhan Sansthan, [*Nutritious and Healthful Traditional Cuisine of Uttarakhand Himalayas*](https://alliance.indiaagrobdunepproject.cgiar.org/fileadmin/templates/MainstreamingAgricultural/Uploads/publications/Recipe_book_Cuisine_of_Uttarakhand_VPKAS-compressed_1_compressed.pdf), May 2023, p. 20, “Kauni Ki Roti.” | The institute's book translates the dish as foxtail-millet chapati and lists foxtail millet flour, wheat flour, and water. It supports regional flour use but does not call the ingredient Kauni flour. The quantities are one recipe's amounts, not reusable measures or a class-wide substitution. |
| **WP02-A6-KAUNI-FOXTAIL-R165-20261016-S03** | Srijana Bisht, Pooja Oli, and Shailaja Punetha, [“Potential of minor millets to ensure nutrition security and livelihood enhancement opportunities in rural areas of Uttarakhand”](https://www.gbpihed.gov.in/PDF/Publication/Newsletter/NL_1714725695_ENVIS_NL_Vol_20_4_2024.pdf), *ENVIS Newsletter on Himalayan Ecology*, Vol. 20(4), 2024, p. 13. | The article identifies foxtail millet as *Setaria italica* and calls it Kauni. The authors include G.B. Pant National Institute of Himalayan Environment researchers. This independently supports the grain-name mapping, not a flour-specific term or Québec name. |
| **WP02-A6-KAUNI-FOXTAIL-R165-20261016-S04** | Gauraaj Valley Foods, [Milletzkart seller listing](https://www.milletzkart.com/store/gauraaj-valley-foods), product titled “Foxtail Millet (Kauni)/Kakum/Kaon/Korra/Navane/Thina/Kang/rala/Kangam/kanghu.” | The retailer page pairs Foxtail Millet with Kauni in a whole-grain product title. It is marketplace wording from India, not Canadian/Québec availability, botanical verification, a flour label, or a package-measure source. |
| **WP02-A6-KAUNI-FOXTAIL-R165-20261016-S05** | Vakshi, [online store](https://mydukaan.io/vakshi), Organic FLOURS product listing “Sprouted Kauni Millet Flour (Foxtail),” checked 2026-10-16. | The seller lists a sprouted, foxtail-qualified flour product. The page says the store is not currently accepting orders; use the title only as evidence of the process-qualified name. It does not support a plain-flour alias, Canadian/Québec wording, processing specification, measure, or substitution. |

## Disposition

**Integrate one grain alias:** add `kauni` to `ingredient-ref-foxtail-millet`. Keep the existing foxtail-flour row, French displays, forms, measurements, unit mappings, recipe links, and blocked substitution research unchanged. Hold `kauni flour` and the sprouted product outside active catalog identities until a source supports the exact product boundary and Québec/Canadian naming. Section 04 A6 remains open.
