# WP05 Section W R965 generic preserved-food gap review: senmaizuke

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity, boundary, measurement, and substitution review. No shared catalog JSON, ledger, plan, roadmap, checklist, recipe, or test file was changed.
- **Plan anchor:** Section W keeps both [other regional Japanese preserved condiments](../../RecipeBook-global-ingredient-catalog-plan.txt#L10314) and [further documented regional preserves](../../RecipeBook-global-ingredient-catalog-plan.txt#L10356) open. The [prior shibazuke identity review](wp05-east-asian-shibazuke-preserve-identity-review-20261016.md) explicitly held `senmai-zuke` for a separate candidate review; the [R924 follow-up](wp05-section-w-shibazuke-identity-boundary-review-r924-20261019.md) reviewed shibazuke without allocating senmaizuke.
- **Recommendation:** Propose identity-only generic `senmaizuke / senmaizuke`, with `senmai-zuke` as the source-attested English spelling alias. Keep the fr-CA display provisionally borrowed; no Québec-specific preserve term was found.
- **Scope:** One named Kyoto culinary pickle. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. Preserve all existing identities and source-bound evidence; no transfer, deletion, or merge is proposed.

## Current ownership and queue audit

The refreshed live snapshot contains **1,981 ingredient references**, **205 forms**, **55 legacy-import candidates**, and **2,386 research-ledger records** after R960–R962 integration. Exact and punctuation-normalized searches for `senmaizuke`, `senmai-zuke`, `senmai zuke`, `senmai pickles`, `Kyoto turnip pickle`, `Shogoin pickle`, `千枚漬け`, `千枚漬`, and `ingredient-ref-senmaizuke` found no owner in active references or aliases, form labels or match terms, legacy candidates, or ledger record IDs and identity names. A recursive ledger text scan also returned no candidate-name match. Prior literature mentions describing senmai-zuke as a separate Kyoto pickle are not catalog ownership.

The Section W checklist leaves this candidate within its open regional-preserve work. R924's predecessor explicitly lists senmai-zuke as unresolved because its local identity and Québec wording had not yet been reviewed. No roster-only task was found in this preserve sweep. If one appears in a later queue, mark it out of scope because **commercial-product counts do not add ingredient diversity**, then stop that line.

Nearby live identities establish boundaries, not ownership:

| Nearby identity | Existing scope | Boundary for senmaizuke |
|---|---|---|
| `ingredient-ref-turnip` — `turnip / navet` | Raw turnip. | Senmaizuke is the named prepared pickle, not an alias or form of the raw vegetable. Do not transfer the MAFF recipe's raw-turnip input amount as a finished-pickle measure. |
| `ingredient-ref-pickled-radish` — `pickled radish / radis mariné` | Generic salt-and-vinegar pickle. | Keep the named Kyoto food distinct from the broader prepared-food identity; do not alias either to `senmaizuke`. |
| `ingredient-ref-suguki-zuke` — `suguki-zuke / suguki-zuke` | Separate Kyoto turnip preserve, salt-pickled and lactic-fermented. | MAFF distinguishes suguki-zuke from senmai-zuke and describes different vegetables and preparation. No synonym, common form, or substitution is proposed. |
| `ingredient-ref-shibazuke` — `shibazuke / shibazuke` | Separate Kyoto pickle family involving eggplant, cucumber, myoga, and shiso. | Preserve its regional name and source-specific preparation; it is not senmaizuke or a substitute. |
| `ingredient-ref-takuan` — `takuan (pickled daikon)` | Named daikon pickle. | Different named preserve and raw vegetable; no alias or substitution is supported. |
| `ingredient-ref-mibuna` — `mibuna / mibuna` | Raw Kyoto mustard green. | MAFF says Kyoto mibuna-zuke may be served with senmai-zuke. Accompaniment does not make raw mibuna or its separate preserve an alias or form of senmaizuke. |

No existing branded row, measurement, recipe link, or product-specific evidence is transferred, removed, or rewritten.

## Recipe-demand check

All **114** manifest-listed bundled recipe JSON files and **1,123** ingredient rows were scanned, including serialized recipe text. The bounded case-insensitive query set (`senmaizuke`, `senmai-zuke`, `senmai zuke`, `senmai pickles`, `kabu no senmaizuke`, `Kyoto turnip pickle`, `pickled turnip Kyoto`, `Shogoin pickle`, `千枚漬け`, and `千枚漬`) returned **no recipe hits**. This lexical scan does not prove that no recipe could use the pickle; it supplies no direct bundled demand. No recipe link is proposed.

## Identity evidence and regional limits

Japan's Ministry of Agriculture, Forestry and Fisheries (MAFF) identifies **Senmaizuke** as a Kyoto regional pickle made from thinly sliced Shogoin turnip. Its account distinguishes the present vinegar-seasoned preparation with kombu and chili from lactic-fermented pickles, notes it is not intended for long storage, and says it may be eaten as-is. MAFF also describes senmai-zuke separately from suguki-zuke, shiba-zuke, nanohana-zuke, and Kyoto mibuna-zuke. This supports a named, generic preserve identity rather than a brand or a broad synonym for Japanese pickles. [S01] [S02]

The MAFF recipe page gives one household method for four people: 1 kg raw Shogoin turnip, 20 g salt, 45 g kombu, red chili to taste, 200 cc vinegar, 90 g sugar, and 40 cc mirin, followed by salting, draining, and a second short pickle. It explicitly says recipes vary by region and household. These are inputs and steps for that recipe only; the page supplies no mass or household measure for the resulting senmaizuke, no preparation-independent density, and no reusable yield. Other recipe pages likewise give formula-specific inputs, not a standard finished-pickle measure. Keep their quantities and process details out of generic catalog fields. [S01]

The prior shibazuke boundary review names senmai-zuke as an independently unresolved Kyoto pickle, and R929 describes it as a different Shogoin-turnip preserve from suguki-zuke. These mentions are useful queue and boundary context, not duplicate catalog ownership or grounds to merge the preserves. See the [prior shibazuke identity review](wp05-east-asian-shibazuke-preserve-identity-review-20261016.md), [R924 follow-up](wp05-section-w-shibazuke-identity-boundary-review-r924-20261019.md), and [R929 suguki-zuke review](wp05-section-w-generic-gap-review-r929-20261019.md).

## Québec-facing wording

Targeted searches of the OQLF's Vitrine linguistique for `senmaizuke`, `senmai-zuke`, and a Kyoto pickled-turnip description did not locate a preserve-specific Québec term. OQLF supports `navet` for the true turnip in specialized French but notes that, in Québec general usage, `navet` is often extended to mean rutabaga. That entry does not name this Kyoto pickle. Keep `senmaizuke` provisionally as the fr-CA display to retain the regional food name; add no French alias such as `navet mariné`, `radis mariné`, or `navet mariné de Kyoto`. This is a borrowed display, not an OQLF-approved translation. [S03]

## Measurement and substitution review

The exact-name measure search found recipes for making senmaizuke, including the MAFF recipe above, but no reusable household amount, serving weight, cup-to-gram value, density, or finished-food yield. The proposed `measurementState` is therefore `researched_no_supported_value`; keep `defaultDensity: null`, `unitMappings: []`, and no measurement observations or recipe-derived measures. Do not transfer any recipe's raw vegetable amount, pickle ratio, serving count, or process time to the prepared preserve.

A bounded exact-name search for replacement advice found no source recommending a substitute for **finished senmaizuke** in an identified recipe role. RecipeTin Japan does say that daikon can replace raw turnip in that author's senmaizuke preparation, with altered marinating and water-removal steps. This is a source-specific ingredient choice while making a related pickle, not evidence that raw daikon or another pickle replaces prepared senmaizuke in a dish. It does not support a catalog rule. [S04]

Generic pickled radish, takuan, suguki-zuke, and shibazuke are plausible nearby preserved foods, but the reviewed sources identify them separately and do not recommend them for the same dish, role, method, texture, or quantity basis. Propose `substitutionResearchState: blocked_pending_evidence`: there is overlap among preserved accompaniments, but no safe use context for a replacement of the finished identity. Add no active substitution rule or replacement alias.

Proposed bounded `substitutionFindings` item (ledger-only; not an active rule):

```json
{
  "findingId": "senmaizuke-no-safe-finished-food-substitute-r965-20261019",
  "researchState": "blocked_pending_evidence",
  "fromIngredientRefId": "ingredient-ref-senmaizuke",
  "context": "Replacement review for finished senmaizuke in an unspecified recipe; the bundled recipe corpus has no senmaizuke line and no target dish or role is specified.",
  "basis": "MAFF distinguishes senmaizuke from other Kyoto preserves and describes it as a delicate, short-storage accompaniment. No reviewed source recommends a different prepared pickle in its place. RecipeTin Japan's daikon alternative changes the raw vegetable used to make one senmaizuke recipe and includes altered process steps; it does not replace finished senmaizuke in a dish.",
  "limitations": [
    "Do not recommend generic pickled radish, takuan, suguki-zuke, shibazuke, or Kyoto mibuna-zuke as an equal or universal substitute.",
    "No source establishes a target dish, ingredient role, cooking method, texture match, quantity basis, ratio, or adjustment for replacing finished senmaizuke.",
    "Keep the daikon-for-turnip preparation choice scoped to the cited RecipeTin Japan method; do not convert it into a senmaizuke replacement rule or alias."
  ],
  "rejectedCandidates": [
    {
      "candidate": "ingredient-ref-pickled-radish",
      "reason": "The generic pickle identity overlaps in broad preparation class, but the reviewed sources do not recommend it as a senmaizuke replacement or match a dish role, method, texture, or quantity.",
      "sourceIds": [
        "WP05-SECTIONW-SENMAIZUKE-R965-20261019-S01",
        "WP05-SECTIONW-SENMAIZUKE-R965-20261019-S02"
      ]
    },
    {
      "candidate": "ingredient-ref-suguki-zuke",
      "reason": "MAFF names suguki-zuke separately and describes lactic fermentation; shared Kyoto preserve use does not establish interchangeability.",
      "sourceIds": [
        "WP05-SECTIONW-SENMAIZUKE-R965-20261019-S02"
      ]
    },
    {
      "candidate": "ingredient-ref-shibazuke",
      "reason": "MAFF names shiba-zuke separately and gives it a distinct vegetable and shiso preparation; no source recommends it in place of senmaizuke.",
      "sourceIds": [
        "WP05-SECTIONW-SENMAIZUKE-R965-20261019-S02"
      ]
    }
  ],
  "replacements": [],
  "sourceIds": [
    "WP05-SECTIONW-SENMAIZUKE-R965-20261019-S01",
    "WP05-SECTIONW-SENMAIZUKE-R965-20261019-S02",
    "WP05-SECTIONW-SENMAIZUKE-R965-20261019-S04"
  ]
}
```

## Proposed minimal data and ledger state

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-senmaizuke` |
| `nameEn` | `senmaizuke` |
| `nameFr` | `senmaizuke` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | `senmai-zuke` (source-attested spelling only) |
| French aliases | None |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| Forms, recipe links, measurements, conversions, yields, active substitution rules | None |

Proposed ledger record: `recordId: ingredient-ref-senmaizuke`, `recordType: ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: blocked_pending_evidence`. Register new source IDs S01, S02, and S04 for this candidate; reuse the existing OQLF source ID `WP05-SECTIONW-SUGUKI-R929-20261019-S05` only for the base term `navet`, not as a French name for senmaizuke. Link prior Section W reviews only as queue and boundary context. Attach the bounded `substitutionFindings` item above. This is a proposal, not a ledger edit.

## Source register

Sources were reviewed online on 2026-10-19. Claims are paraphrased and kept within each source's scope.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-SENMAIZUKE-R965-20261019-S01` | Japan Ministry of Agriculture, Forestry and Fisheries, [Senmaizuke — Our Regional Cuisines](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/1900/index.html). | Official English page identifies the Kyoto regional pickle and Shogoin-turnip ingredient, describes present vinegar/kombu/chili preparation and its limited storage and non-lactic-fermented state, and gives one four-person home recipe. Recipe quantities and process are not generic measures or a universal formula. |
| `WP05-SECTIONW-SENMAIZUKE-R965-20261019-S02` | Japan Ministry of Agriculture, Forestry and Fisheries, [Kyo Tsukemono — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/kyo_tsukemono.html). | Official regional overview names senmai-zuke among Kyoto pickles and distinguishes its turnip, kombu, vinegar, and seasoning preparation from suguki-zuke, shiba-zuke, nanohana-zuke, and Kyoto mibuna-zuke. Regional recipes and process descriptions remain bounded to the named foods and account. |
| `WP05-SECTIONW-SUGUKI-R929-20261019-S05` (reused) | Office québécois de la langue française, [navet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870711/navet). | Supports the specialized Québec French term `navet` for true turnip and notes common Québec usage may mean rutabaga. It does not define senmaizuke. Targeted OQLF searches for the preserve and descriptive phrases found no preserve-specific entry. |
| `WP05-SECTIONW-SENMAIZUKE-R965-20261019-S04` | Yumiko, [Pickled Turnip (Senmai-zuke)](https://japan.recipetineats.com/pickled-turnip-senmai-zuke/), RecipeTin Japan. | One recipe says raw daikon can replace the turnip when making that preparation and specifies altered process steps. This is recipe-specific preparation guidance, not a recommendation to replace finished senmaizuke in other recipes. It is not used as authoritative identity or Québec terminology evidence. |
**Disposition:** Propose generic identity-only `senmaizuke / senmaizuke` with the single source-attested spelling alias `senmai-zuke`. Keep it separate from raw turnip, generic pickled radish, suguki-zuke, shibazuke, takuan, and raw or preserved Kyoto mibuna. Keep the borrowed fr-CA display provisional. Record no reusable measures and `blocked_pending_evidence` for substitution of the finished preserve; add no active rule or alias for alternatives. Keep the Section W regional-preserve sweep open. No commercial-product roster was researched because commercial-product counts do not add ingredient diversity. No software tests were run for this proposal-only document.

## Document checks

- UTF-8 decoded cleanly with no byte-order mark; no replacement characters or mojibake markers were found.
- Relative links to the catalog plan and prior reviews resolve in the repository; external source links use HTTPS.
- The proposed `substitutionFindings` JSON parses, and every cited source ID resolves to the source register.
- No trailing whitespace was found in this file.
- No software tests were run, as this is proposal-only documentation.
