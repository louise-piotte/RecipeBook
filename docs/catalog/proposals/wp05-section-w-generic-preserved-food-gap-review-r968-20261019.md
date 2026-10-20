# WP05 Section W R968 generic preserved-food gap review: nanohana-zuke

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity, boundary, measurement, and substitution review. This file is the only write; shared catalog JSON, ledger, checklist, plan, roadmap, recipes, and tests were not changed.
- **Plan anchor:** Section W leaves both [other regional Japanese preserved condiments](../../RecipeBook-global-ingredient-catalog-plan.txt#L10314) and [further documented regional preserves](../../RecipeBook-global-ingredient-catalog-plan.txt#L10356) open. The [prior shibazuke review](wp05-east-asian-shibazuke-preserve-identity-review-20261016.md) lists `nanohana-zuke` as a separately unresolved Kyoto pickle.
- **Recommendation:** Propose one generic identity-only `nanohana-zuke / nanohana-zuke`, with `Matsugasaki-zuke` as the single MAFF-attested English alias. Keep the French display as a provisional borrowing; no French alias is supported.
- **Scope:** One named Kyoto preserve. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. Existing identities and evidence remain intact; no transfer, deletion, or merge is proposed.

## Live ownership and queue audit

Refreshed shared data after R963–R965: **1,984 active references**, **205 forms**, **55 legacy-import candidates**, **2,389 ledger records**, and **114 manifest-listed recipes / 1,123 ingredient rows**. The recipe count and row count were recomputed from the live manifest and recipe files.

Accent- and punctuation-normalized searches covered `nanohana-zuke`, `nanohana zuke`, `nanohanazuke`, `nanohana`, `Matsugasaki-zuke`, `Matsugasaki zuke`, `菜の花漬け`, `菜の花漬`, `花菜漬け`, `菜花漬け`, rapeseed/rape-blossom pickle wording, and proposed ID `ingredient-ref-nanohana-zuke`. No identity owner was found in active reference names or aliases, form labels or match terms, legacy candidate names or aliases, or ledger identity records. The proposal source-ID prefix `WP05-SECTIONW-NANOHANA-R968-20261019-` is absent from the live ledger and existing proposal files.

There is one whole-ledger text hit for `nanohana-zuke`: the locator of `WP05-SECTIONW-SENMAIZUKE-R965-20261019-S02` on `ingredient-ref-senmaizuke` says that the MAFF page distinguishes senmai-zuke from nanohana-zuke. This is a source-scoped mention, not candidate ownership. The same MAFF URL is already recorded with different locators under `ingredient-ref-senmaizuke` (R965 S02), `ingredient-ref-shibazuke` (the 2026-10-16 shibazuke S02), and `ingredient-ref-suguki-zuke` (R929 S01). Preserve those records and source IDs; the proposal assigns a new source ID with a Nanohana-specific locator.

The reviewed open Section W entries request generic preserved-food identities and evidence; no roster-only task appeared. If a queued brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only item appears, mark it out of scope because **commercial-product counts do not add ingredient diversity**, then stop that line. Do not transfer product-specific measurements or claims without a separate transferability review.

Nearby identities establish boundaries, not duplicate ownership:

| Current identity | Boundary retained for this proposal |
|---|---|
| `ingredient-ref-senmaizuke` | MAFF names senmai-zuke separately and describes its turnip preparation. Do not merge it with the flower preserve or reuse its evidence as a formula for nanohana-zuke. |
| `ingredient-ref-suguki-zuke` | Separate Kyoto turnip pickle, described by MAFF as salt-pickled and lactic-fermented. It is not an alias or established substitute. |
| `ingredient-ref-shibazuke` | Separate Kyoto preserve with its own vegetable and red-perilla preparations. Preserve its identity and evidence. |
| `ingredient-ref-mibuna` | Raw Kyoto potherb mustard. MAFF separately names Kyoto mibuna-zuke; neither raw mibuna nor its named preserve is an alias for nanohana-zuke. |
| `ingredient-ref-pickled-mustard-greens` and `ingredient-ref-takana-zuke` | Generic mustard-leaf preserve and named Japanese mustard-leaf pickle. MAFF's account of nanohana-zuke concerns rape blossoms; shared broad pickle or mustard-family wording does not make these identities equivalent. |
| R960 `antramthu`, R959 `inziangsang`, R956 `khalpi`, R953 `gundruk`, and R950 `sinki` | Recently integrated regional preserves with distinct names and source-defined boundaries. None owns this Kyoto preserve. Keep every existing row and its evidence unchanged. |

## Recipe-demand check

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned, including serialized recipe text and row fields. The normalized query set included the candidate and alias, common romanized and Japanese-script forms, and descriptive `rape blossom` / `rapeseed blossom pickle` wording. There were **no hits**. The corpus supplies no direct recipe demand, and no recipe link is proposed. The 60 g `Kyoto pickles` entry on the MAFF page is not a bundled recipe row and is not specific to nanohana-zuke.

## Identity and preparation boundary

Japan's Ministry of Agriculture, Forestry and Fisheries (MAFF) names `nanohana-zuke` as a distinct Kyoto pickle and says it is also called `Matsugasaki-zuke`. Its account says blossoms thinned from Nanohana/rape-blossom cultivation were used for pickles. It describes a contemporary short-pickled preparation and says the blossoms may also be made as rice-bran nuka-zuke, with a slightly bitter character. The same page describes a traditional rice-bran method using blossoms from unopened through roughly three-quarters bloom, salt pre-pickling, rice-bran bags, red pepper and a weight for about three weeks. Those are source-specific preparation details, not one required recipe, universal formula, or catalog form. Do not encode a universal fermentation state or a mandatory blossom stage. [S01]

The source groups this item among Kyoto pickles but separately names senmai-zuke, suguki-zuke, shiba-zuke, and Kyoto mibuna-zuke, with different production and consumption seasons. Its descriptions of the other foods are boundary evidence only; retain their current entries and do not import their ingredients, measures, or process claims into this identity. Raw Nanohana, generic rape blossoms, rapini, leafy mustard greens, and generic Japanese pickles are not aliases for the named preserve. [S01]

## Québec-facing wording

Targeted OQLF searches for `nanohana-zuke`, `Matsugasaki-zuke`, and descriptive preserved-blossom terms did not locate a Québec French name for this preserve. Retain the borrowed `nanohana-zuke` as the provisional fr-CA display and add no French alias. OQLF's `colza` entry supports that Québec French plant term for *Brassica napus*, but it is not a pickle name; MAFF's Nanohana account does not establish a botanical species for the preserve. Do not turn that plant entry into a global translation such as `fleurs de colza marinées`. [S02]

## Measurement and substitution review

The MAFF page has a tuna-sandwich recipe listing **60 g of “Kyoto pickles”** without naming which pickle. That amount cannot be assigned to nanohana-zuke. The page's roughly three-week traditional rice-bran process is a method duration, not an ingredient quantity or yield. The reviewed evidence establishes no reusable household measure, serving mass, density, unit mapping, conversion, or yield for the named preserve. Propose `measurementState: researched_no_supported_value`, `defaultDensity: null`, `unitMappings: []`, and no measurement observations or forms. Keep every recipe input and process particular attached only to its cited source and preparation.

Exact-name online searches for substitution advice found no source-backed replacement recommendation. MAFF says Kyoto pickles generally accompany cooked rice or ochazuke and may accompany alcoholic drinks, but does not specify a nanohana-zuke recipe role or name a replacement. Senmai-zuke, suguki-zuke, and shiba-zuke are nearby Kyoto preserves, yet the reviewed evidence identifies them separately and does not establish equivalent use, texture, method, or quantity. With no target dish or role, propose `substitutionResearchState: blocked_pending_evidence`; this records the missing safe context rather than asserting that every possible substitution has been disproven. Add no active substitution rule, replacement alias, or recipe-line link. [S01]

Proposed bounded `substitutionFindings` item (ledger-only; not an active rule):

```json
{
  "findingId": "nanohana-zuke-no-safe-contextual-substitute-r968-20261019",
  "researchState": "blocked_pending_evidence",
  "fromIngredientRefId": "ingredient-ref-nanohana-zuke",
  "context": "Replacement review for finished nanohana-zuke in an unspecified recipe; the bundled recipe corpus has no matching ingredient row or target dish role.",
  "basis": "MAFF names nanohana-zuke as a distinct Kyoto pickle and gives only broad Kyoto-pickle serving context. It does not recommend another preserve in its place. Nearby named Kyoto pickles are described separately, without a shared recipe role, method, texture, or quantity basis.",
  "limitations": [
    "Do not recommend senmaizuke, suguki-zuke, shibazuke, Kyoto mibuna-zuke, generic pickled mustard greens, or raw Nanohana as a universal replacement.",
    "No reviewed source establishes a target dish, ingredient role, preparation method, texture match, quantity basis, ratio, or adjustment for replacing finished nanohana-zuke.",
    "Keep the MAFF three-week rice-bran method and the general Kyoto-pickle serving examples scoped to that page; neither is substitution or recipe-measurement evidence."
  ],
  "rejectedCandidates": [
    {
      "candidate": "ingredient-ref-senmaizuke",
      "reason": "MAFF names senmai-zuke separately and describes its turnip preparation; it does not recommend it in place of nanohana-zuke.",
      "sourceIds": ["WP05-SECTIONW-NANOHANA-R968-20261019-S01"]
    },
    {
      "candidate": "ingredient-ref-suguki-zuke",
      "reason": "MAFF names suguki-zuke separately as a salt-pickled, lactic-fermented Kyoto turnip preserve and gives no replacement direction.",
      "sourceIds": ["WP05-SECTIONW-NANOHANA-R968-20261019-S01"]
    },
    {
      "candidate": "ingredient-ref-shibazuke",
      "reason": "MAFF names shiba-zuke separately and describes a different vegetable and red-perilla preparation; no source supports interchangeability.",
      "sourceIds": ["WP05-SECTIONW-NANOHANA-R968-20261019-S01"]
    }
  ],
  "replacements": [],
  "sourceIds": ["WP05-SECTIONW-NANOHANA-R968-20261019-S01"]
}
```

## Proposed minimal data and ledger state

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-nanohana-zuke` |
| `nameEn` | `nanohana-zuke` |
| `nameFr` | `nanohana-zuke` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | `Matsugasaki-zuke` (MAFF-attested alternate name only) |
| French aliases | None |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| Forms, recipe links, measurements, conversions, yields, active substitution rules | None |

Proposed ledger record: `recordId: ingredient-ref-nanohana-zuke`, `recordType: ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: blocked_pending_evidence`. Register only the new R968 source IDs below for claims about this preserve; add the bounded finding above. This is a proposal, not a shared ledger edit. Existing MAFF records under senmaizuke, suguki-zuke, and shibazuke retain their current owners, source IDs, locators, and decisions.

## Source register

Sources were reviewed online on 2026-10-19. Claims are paraphrased and kept within the cited identity or terminology scope.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-NANOHANA-R968-20261019-S01` | Japan Ministry of Agriculture, Forestry and Fisheries, [Kyo Tsukemono — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/kyo_tsukemono.html). | Official Kyoto-pickle overview, especially the Nanohana-zuke description and production-method sections. Names the preserve and alternate Matsugasaki-zuke name; describes blossoms, short-pickle and rice-bran preparations, one traditional process, broad Kyoto-pickle serving context, and a generic Kyoto-pickles sandwich amount. No single universal formula or nanohana-zuke-specific measurement or substitute is established. This URL is separately recorded under other Kyoto-pickle identities; this new locator is scoped to nanohana-zuke and does not reuse or edit their source IDs. |
| `WP05-SECTIONW-NANOHANA-R968-20261019-S02` | Office québécois de la langue française, [colza (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031459/colza). | Supports `colza` as Québec French wording for the plant *Brassica napus*. It does not name Nanohana-zuke, establish its species, or support a French preserve alias. |

**Disposition:** Propose one generic identity-only `nanohana-zuke / nanohana-zuke` reference and the single English alternate-name alias `Matsugasaki-zuke`. Keep the French display provisional. No measurements or substitutions are supported for a reusable catalog value; leave the finished-food substitution finding blocked pending a source-supported dish context. Preserve all existing Kyoto pickle and regional-preserve identities and evidence. No commercial-product roster was researched. No software tests were run for this proposal-only document.

## Document checks

- UTF-8 decoded cleanly without a byte-order mark, replacement character, or mojibake marker.
- Relative plan/review links resolve within the repository; source links use HTTPS.
- The proposed substitution finding parses as JSON, and each cited source ID resolves to the source register.
- No trailing whitespace was found.
- No software tests were run because this packet is proposal-only.
