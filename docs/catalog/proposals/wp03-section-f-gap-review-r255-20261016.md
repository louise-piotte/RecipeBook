# WP03 Section F — Sona Masoori rice identity review (R255, 2026-10-16)

## Review record

- **Scope:** One unallocated, named rice product type sold in Canada as Sona Masoori / Sona Masuri rice. This review does not revisit generic rice, grain-length classes, parboiled rice, named rice identities already in the catalog, or dry/cooked-state allocation.
- **Plan location:** Section F keeps regional cereal products and preprocessed grains open ([live plan, line 3768](../../RecipeBook-global-ingredient-catalog-plan.txt#L3777)); the plant-food packet records this broader review as in progress ([plant-grains-cereals.md](../batches/plant-grains-cereals.md#L269)).
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, **`Sona Masoori rice / riz Sona Masoori`**, with only the source-attested spelling aliases `Sona Masuri rice` and `riz Sona Masuri`. Keep it separate from generic rice, long-/medium-/short-grain classes, basmati, jasmine, Calrose, Koshihikari, and the other named varieties. Do not assert a universal cultivar, milling state, or grain-length class.
- **Proposed ID:** `ingredient-ref-sona-masoori-rice` (unused in the active reference/form catalog and research ledger at review time).
- **Proposal-local source-ID prefix:** `WP03-SONAMASOORI-R255-20261016-S`. IDs under this prefix are unallocated and are not written to the research ledger by this proposal.
- **Snapshot:** 1,648 active ingredient references, 125 forms, 1,996 research-ledger records, and 114 bundled recipes / 1,123 structured ingredient rows.

## Proposed catalog row

```json
{
  "id": "ingredient-ref-sona-masoori-rice",
  "nameFr": "riz Sona Masoori",
  "nameEn": "Sona Masoori rice",
  "aliasesFr": ["riz Sona Masuri"],
  "aliasesEn": ["Sona Masuri rice"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL"
}
```

The two alias spellings are supported by Canadian product wording: one Noor SKU is titled `Sona Masuri` / `Riz Sona Masuri`, while its retailer metadata identifies its rice type as `Sona Masoori`. Keep `sona` or `masoori`/`masuri` out as separate aliases; the complete product name already supports those word queries under the phrase-first picker.

## Product boundary and rationale

The candidate is sold by multiple brands in Canada, rather than being a single branded cereal or a one-off recipe compound. Canadian retail pages list Sona Masoori or Sona Masuri rice as the named rice type, and Canadian French-language retail pages use the matching displays `Riz Sona Masoori` and `Riz Sona Masuri` [S03–S05, S09]. Tamil Nadu Agricultural University associates the rice variety BPT 5204 with the name `Sona Masuri`; the Canadian trademark journal separately records the applicant's translation that `Sona Masoori` is a rice variety [S01–S02]. These sources support a named market identity and a spelling variant. They do not prove that every bag sold under this name is genetically identical to BPT 5204 or that it has one universal grain-length, milling, or aging specification.

One retailer labels a Sona Masoori product medium-grain, while another Noor listing describes it as extra-fine grain; the latter's metadata still labels its rice type Sona Masoori [S04–S05]. Treat those as seller/SKU descriptions. Do not make `medium-grain rice`, `short-grain rice`, or `long-grain rice` an alias, form, or classification on the proposed row. The existing length-class references remain useful and separate choices.

## Existing ownership and archive audit

Normalized exact-key checks followed the repository's NFKD, accent-folding, punctuation-normalizing search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L8).

| Candidate phrase | Current exact owner | Disposition |
|---|---|---|
| `Sona Masoori rice`, `Sona Masuri rice` | None in reference displays/aliases or form labels/match terms. | Add the display and one English spelling alias to the proposed row. |
| `riz Sona Masoori`, `riz Sona Masuri` | None in reference displays/aliases or form labels/match terms. | Add the French display and the one French spelling alias shown above. |
| `Basmati`, `jasmine`, `Calrose`, `Koshihikari`, and generic grain-length rice names | Existing rows own their own names. | Keep their displays and aliases unchanged. Do not attach Sona Masoori to any of them. |
| Ledger, legacy-candidate, and proposal archive exact-key scan | No exact Sona Masoori / Sona Masuri owner or focused prior decision found. A loose `sona` text match is not an exact owner. | Treat this as a new identity gap, not a revival of a held candidate. |

The source-local spelling alias is intentionally limited. Do not add `Indian rice`, `South Indian rice`, `medium-grain rice`, `idli rice`, `BPT 5204`, `Sona rice`, `Sona Masoori variety`, or any brand names as aliases. Some of these are broad usage descriptions, some are product/lineage assertions not established across the Canadian market, and some would collide with existing rice choices.

## Picker and recipe-corpus audit

The static projection uses the current reference and form terms with the phrase-first, substring-fallback behavior in `IngredientSearch.kt`. It is not live Android picker QA.

| Query | Current projection | With proposed row | Note |
|---|---|---|---|
| `Sona Masoori`, `Sona Masoori rice` | No result | Proposed row only | The named type becomes directly searchable. |
| `riz Sona Masoori` | No result | Proposed row only | Uses the Canadian French retail display wording. |
| `Sona Masuri`, `Sona Masuri rice`, `riz Sona Masuri` | No result | Proposed row only | Both English and French spelling variants are product-attested on the same Canadian Noor SKU. |
| `rice` | 68 references | 69 references | The new named rice joins the expected broad rice result set. |
| `medium-grain rice` | `ingredient-ref-medium-grain-rice` | `ingredient-ref-medium-grain-rice` only | No unsupported grain-length alias is introduced. |
| `sona` | Three unrelated partial matches whose French terms contain `cassonade` | Proposed row only | The proposed full product name becomes an exact word-phrase match and outranks substring fallback; an exact `cassonade` query remains on the sugar rows. |

I parsed all 114 recipe files in the current manifest and scanned each recipe's full text, structured ingredient rows, and ingredient-reference links for `Sona Masoori`, `Sona Masuri`, their rice-qualified forms, and `riz Sona` spellings. The scan found **zero matching recipe files, ingredient rows, or direct links**. No recipe link or recipe-specific form is proposed.

## Forms, measurements, density, and substitutions

- **Forms:** Add none. No recipe demand or other source establishes a useful Sona Masoori-specific dry/cooked form pair. Preserve the plan's rule against multiplying every named rice type by each cooking state; generic rice's existing state forms remain unchanged.
- **Package and serving observations:** The Canadian Tilda listing shows a 4.535 kg package and a label serving of 1/4 cup (45 g) [S03]. Retain these only as source- and SKU-specific ledger observations if the identity is integrated. Do not generalize the serving to Sona Masoori rice or any other rice.
- **Density and unit mappings:** Keep `defaultDensity` null and `unitMappings` empty. One Nutrition Facts serving pair does not establish reusable density or a cup-to-mass mapping. Package sizes are not kitchen measures.
- **Cooking water and yield:** Add no conversion or yield. A Canadian seller gives one 1:1.5 rice-to-water direction, while a separate rice-company guide gives 2–2.5 cups water per cup for rinsed/soaked Sona Masoori under its stated absorption method [S06–S07]. These are method-specific cooking directions and do not establish a dry-to-cooked yield or a general conversion.
- **Substitutions:** Add no global or contextual substitution. A general culinary website claims Ponni rice can replace Sona Masoori 1:1 and suggests other substitutes, but it supplies no test, recipe scope, or primary product evidence [S08]. Do not generalize that claim to Ponni, basmati, jasmine, parboiled rice, or another catalog identity.

## Unresolved follow-up

The proposed French display is supported by Canadian French retail wording, not an OQLF or TERMIUM entry; targeted searches found no exact Sona Masoori terminology entry. Keep that distinction visible in future source notes and leave independent Québec-language approval open. A future technical source may clarify the taxonomic scope of products sold as Sona Masoori, but the current market identity does not require assigning a formal cultivar or grain-length class.

## Sources

Sources were checked online on **2026-10-16**. Current stock, price, and delivery status are not used as identity evidence.

| ID | Source | Evidence and limits |
|---|---|---|
| `WP03-SONAMASOORI-R255-20261016-S01` | Tamil Nadu Agricultural University, [Agritech Portal — Bacterial leaf blight resistance genes](https://www.agritech.tnau.ac.in/crop_protection/crop_prot_crop%20diseases_cereals_rice_biomarker_2.html), undated portal page, checked 2026-10-16. | Names `BPT 5204 (Sona Masuri)` among rice varieties discussed in an agricultural breeding context. Supports the spelling and named-rice boundary; does not establish that all Canadian packages under this market name are BPT 5204 or provide culinary measurements. |
| `WP03-SONAMASOORI-R255-20261016-S02` | Canadian Intellectual Property Office, [Trade-marks Journal, Vol. 62 No. 3189](https://publications.gc.ca/collections/collection_2015/ic/RG42-2-62-3189-fra.pdf), 2015-12-09, application 1,671,259, pp. 431–432. | An India-based applicant's English-language mark record gives the translation `Sona Masoori` as a rice variety and lists rice as goods for proposed Canadian use. This is an applicant-submitted mark translation, not a food standard or Québec terminology ruling. |
| `WP03-SONAMASOORI-R255-20261016-S03` | Loblaws, [Tilda Riz sona masoori, 4.535 kg](https://www.loblaws.ca/fr/riz-sona-masoori/p/21527715_EA?source=sptd), Canadian French-language product page, indexed within the prior two weeks; checked 2026-10-16. | Product title and ingredient line use `Riz Sona Masoori`; the page reports 4.535 kg and a 1/4 cup (45 g) Nutrition Facts serving. The package and serving are SKU-specific. Direct page retrieval returned a cache miss; the indexed product text was available. |
| `WP03-SONAMASOORI-R255-20261016-S04` | Walmart Canada (French), [Verka Riz Sona Masoori, 20 lb](https://www.walmart.ca/fr/ip/Verka-Riz-Sona-Masoori-20lbs/0ZNMG1U2ZVA1), current retail listing, checked 2026-10-16. | Confirms Canadian French product wording and a separately branded Sona Masoori SKU. The listing's medium-grain description is seller/product metadata, not a universal classification. Direct page retrieval returned a cache miss. |
| `WP03-SONAMASOORI-R255-20261016-S05` | Walmart Canada, [Noor Sona Masuri Rice, 10 lb](https://www.walmart.ca/en/ip/Noor-Sona-Masuri-Rice-10-Lb/6000188770332), product SKU 6000188770332, checked 2026-10-16. | The English listing title uses `Sona Masuri Rice`; its product-type metadata names the rice type `Sona Masoori Rice`. The item was out of stock at the selected Mississauga location; stock is not generalized. Marketplace metadata is not an independent manufacturer specification. |
| `WP03-SONAMASOORI-R255-20261016-S06` | Tasty Grains Canada, [Amma's Sona Masoori Rice](https://www.tastygrain.ca/products/sona-masoori-rice-telugu-brand), Kitchener, Ontario retailer, checked 2026-10-16. | Lists the named product and a 20 lb option; its page gives one 1:1.5 rice-to-water direction. The page's availability fields conflict, so no stock claim is made. The amount is one retailer's cooking instruction, not a general conversion or tested substitution. |
| `WP03-SONAMASOORI-R255-20261016-S07` | Nitra Foods, [Rice to Water Ratio Guide](https://nitrafoods.com/blogs/guides/rice-to-water-ratio-guide), published 2026-09-25, updated 2026-10-01; checked 2026-10-16. | Gives 2–2.5 cups water per cup rice for rinsed/soaked Sona Masoori in its absorption-method guide. This is method-specific advice and differs from S06; it does not establish a reusable recipe conversion or cooking yield. |
| `WP03-SONAMASOORI-R255-20261016-S08` | Taste Lab, [Sona Masoori Rice](https://www.tastelab.food/ingredients/sona-masoori-rice), checked 2026-10-16. | Claims Ponni rice can be used as a 1:1 substitute and lists other alternatives, but provides no test protocol or dish-role limits. Its nutrition section cites a USDA long-grain brown-rice record, not Sona Masoori. Do not activate its substitution claim or transfer its nutrition values. |
| `WP03-SONAMASOORI-R255-20261016-S09` | Walmart Canada (French), [Noor Sona Masuri Riz, 10 lb](https://www.walmart.ca/fr/ip/Noor-Sona-Masuri-Riz-10-Lb/6000188770332), product SKU 6000188770332, checked 2026-10-16. | The French listing title uses `Riz Sona Masuri`. It supports the French spelling variant but is marketplace wording, not an independent manufacturer specification or a formal Québec terminology ruling. |

## Disposition

**Add `ingredient-ref-sona-masoori-rice` as an identity-only `GRAIN_AND_CEREAL` reference with the bilingual display and two spelling aliases shown above.** Preserve the distinction from generic grain-length classes and other named rice identities. Keep forms, reusable measurements, density, unit mappings, conversions, cooking yields, recipe links, and active substitutions empty. Section F remains open.
