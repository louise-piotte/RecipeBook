# WP02 A6 Round 10: Guinea-corn grain and flour naming — 2026-10-13

## Review record

- **Status:** Root integration complete. The paired aliases and reviewed ledger evidence are recorded; no recipe or application behavior beyond generated picker data was edited.
- **Scope:** Review the regional English name Guinea corn and the flour-qualified phrase Guinea corn flour against the existing sorghum grain and flour identities. Keep the separate Canadian Ogi Baba powder product boundary visible.
- **Plan and archive check:** The A6 regional flour checklist remains open. I reread its current status and the A6 proposal/batch archive through round nine. No earlier A6 packet, accepted decision, or hold reviewed Guinea corn or Guinea corn flour. Live rows already cover grain sorghum and sorghum flour; they have separate Jowar aliases. The earlier Milo flour hold remains separate. The only exact live phrase overlap is Guinea grains on grains of paradise, a different normalized key and different ingredient.
- **Recommendation:** **Integrate a paired English alias**: Guinea corn on `ingredient-ref-grain-sorghum`, and Guinea corn flour on `ingredient-ref-sorghum-flour`. Keep Ogi Baba / Guinea corn powder and process-qualified flour terms out of those aliases. Retain the current Québec French displays.
- **New source IDs:** `WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S01` through `S05`; all were absent from the live ledger and catalog archive before drafting. Exact proposed observation and finding IDs were also absent. No new ingredient, form, or recipe-link ID is proposed.

## Evidence and identity decision

Nigeria’s National Bureau of Statistics labels a cereal-cultivation question `GUINEA CORN (sorghum)` in its 2022 National Agricultural Sample Census. This is authoritative regional evidence for the grain-name relationship, but it does not define flour. The current Canadian Westpoint Naturals Organic Sorghum Flour page says its flour is milled from organic whole-grain sorghum and then lists Guinea corn among the other names for sorghum. That supports the flour-qualified alias on the existing sorghum-flour row without creating a separate regional identity [S01–S02].

A 2022 Nigerian food study uses the exact term `guinea corn flour (Sorghum bicolor)`. Its tested sample was soaked, dried, roasted, hammer-milled, and sieved to 250 microns. This corroborates the English phrase and crop mapping, while showing that one source’s flour had a particular process; it does not make roasting or a 250-micron grade part of the unqualified alias [S04].

A current Canadian listing for GraceCo Guinea Corn Powder (Ogi Baba) describes a whole-grain Guinea-corn product used to prepare a tangy porridge. It is a named powder/prepared-food product, not evidence that `Guinea corn powder`, Ogi Baba, or every Guinea-corn product is plain sorghum flour. The listing showed out of stock on the review date; no availability is inferred [S03]. Keep those terms out of the proposed aliases and do not create an Ogi identity in this A6 review.

## Exact proposed catalog fields

Append only the following English aliases to the existing owners:

| Reference | Current English aliases | Proposed English aliases | Retain |
|---|---|---|---|
| `ingredient-ref-grain-sorghum` — `grain sorghum / sorgho à graine`, `GRAIN_AND_CEREAL` | `["jowar whole"]` | `["jowar whole", "guinea corn"]` | Names, French aliases, category, `defaultDensity: null`, and `unitMappings: []`. |
| `ingredient-ref-sorghum-flour` — `sorghum flour / farine de sorgho`, `FLOUR_AND_STARCH` | `["jowar flour", "jowar atta"]` | `["jowar flour", "jowar atta", "guinea corn flour"]` | Names, French aliases, category, `defaultDensity: null`, and `unitMappings: []`. |

Do not add a separate Guinea-corn grain or flour row, `guinea` by itself, `guineacorn`, `guinea corn meal`, `guinea corn powder`, `Ogi Baba`, `ogi`, or `akamu`. Do not add forms, aliases for roasted/malted/fermented products, recipe links, conversions, yields, or active substitutions.

## Normalized ownership and picker projection

The audit followed `normalizeIngredientSearchKey` and `IngredientReferenceSearchIndex` in `IngredientSearch.kt`: lowercase, NFKD and accent/ligature folding, punctuation to spaces, complete normalized word-phrase matches first, then substring fallback. It covered active bilingual names and aliases, every attached form label and match term, all legacy-import candidate fields, and research-ledger record IDs. No form is attached to either sorghum row.

| Normalized key or term | Current exact owner / picker result | Proposed disposition |
|---|---|---|
| `guinea corn` | No exact active reference, form, legacy-candidate, or ledger-record-ID owner; picker returns no result. | Add to `ingredient-ref-grain-sorghum`; the flour-qualified alias also matches this shorter query. Show grain and flour as separate labeled options. |
| `guinea corn flour` | No exact owner; picker returns no result. | Add to `ingredient-ref-sorghum-flour`; the full qualified query returns flour only. |
| `guinea` | No exact owner; phrase search currently returns `ingredient-ref-grains-of-paradise` because its alias is `Guinea grains`. | Proposed results: grain sorghum, grains of paradise, and sorghum flour. This remains a multi-choice result, not a singleton capture. |
| `guinea grains` | `ingredient-ref-grains-of-paradise` (`grains of paradise / maniguette`). | Unchanged; this is not an alias for sorghum or a collision with `guinea corn`. |
| `guinea corn powder`, `ogi baba`, `guineacorn` | No exact owner; no current picker result. | Remain unassigned; the proposed phrases do not create a match for them. |
| `corn` | Sixteen specific corn/maize-reference results. | Eighteen results: the existing sixteen plus clearly labeled grain sorghum and sorghum flour. This broad query becomes less specific, but does not select one sorghum row alone. |
| `grain sorghum`, `sorgho à graine`, `sorghum flour`, `farine de sorgho` | Their current respective grain and flour rows. | Unchanged. |

There are no form hints on any current or projected result. The exact phrase `guinea corn` returns both the grain and flour choices; `guinea corn flour` returns only flour. The source-backed pair preserves the grain/flour distinction while the full flour phrase remains specific.

The current sixteen results for `corn` are corn bran, corn flakes, corn kernels, corn oil, corn on the cob, corn poha, corn syrup, corn tortillas, cornmeal, dark corn syrup, hominy corn, light corn syrup, precooked corn flour, roasted corn flour, whole-kernel corn flour, and maize arraw. The projection adds only grain sorghum and sorghum flour to that set.

## Québec French boundary

Retain `sorgho à graine` and `farine de sorgho`; leave both `aliasesFr` arrays empty. The existing OQLF record for *sorgho* identifies the Québec French term and the botanical species, and the existing Codex record supplies the French product name for sorghum flour [reused `WP03-S22`, `WP02-A6-JOWAR-FLOUR-20261012-S03`, and `WP02-S33`]. OQLF does not establish a French Guinea-corn name. Do not translate the English compound literally as a maize term or add `maïs de Guinée`, `farine de maïs de Guinée`, or an unsupported French Guinea-corn alias.

## Forms, measurements, density, and substitutions

- **Forms and identity scope:** Neither reference currently has an attached form. The 2022 study’s soaked, dried, roasted, milled, and fine-sieved process is one experimental flour preparation, not a general form definition. The Ogi Baba listing describes a powder for cooked porridge; keep its process/product terms outside the generic flour row.
- **Grain measurements:** The grain-sorghum ledger record already has three Health Canada CNF 2015 portion observations for food code 4432, including 81.2 g per 100 mL and 202.9 g per 250 mL. The source does not specify grain preparation or packing. Those observations remain tied to the grain code; do not transfer them to flour or to the Guinea-corn flour alias. The grain reference still has no active density or unit mapping.
- **Flour measurement:** Westpoint’s current manufacturer page reports a serving of **3 tbsp (30 g)** for its Organic Sorghum Flour. This is a product-label serving, not a measured spoon fill, a universal sorghum-flour portion, or a mass-per-volume conversion. If accepted, record one source-scoped `portion_weight` observation on the existing flour ledger record with `sourceQuantity: {amount: 3, unit: "tbsp"}` and `observedMassG: 30`; describe the specific whole-grain organic product and state that spoon filling/leveling is unspecified. Do not infer a density, convert the serving into millilitres, or populate the active `defaultDensity` or `unitMappings`. Proposed observation ID: `wp02-a6-westpoint-organic-sorghum-flour-3tbsp-30g-20261013`.
- **Other numbers:** Westpoint lists package configurations (6 × 400 g, 2 kg, 10 kg, and 22.7 kg); these are package quantities. The Ogi Baba listing’s 1.10231 lb is also package mass. The study’s 100 g composite-flour formulation with water and sugar is a food formula, not a flour-volume measurement or a transferable conversion. None supplies a reusable density or yield.
- **Substitution:** Westpoint says its flour has a texture and taste similar to wheat and suggests combining it with tapioca starch, cornstarch, or legume flours. It gives no replacement ratio or tested general recipe context. Do not create a one-for-one wheat rule or a contextual substitution from these statements. To preserve the source limitation, the proposal records a `blocked_pending_evidence` finding on the sorghum-flour ledger record; it leaves the active global and contextual rule files empty. Proposed finding ID: `wp02-a6-sorghum-flour-westpoint-substitution-blocked-20261013`.
- **Ledger states if integrated:** The flour measurement state may move from `not_yet_researched` to `researched_supported` for the one recorded product-label portion only; its active density remains null. Its substitution research state may move to `blocked_pending_evidence` for lack of a transferable ratio/context. The grain record’s states and observations remain unchanged. The proposed finding is limited to the reviewed product guidance and does not assert that no source-specific sorghum substitution can exist.

The source-scoped ledger additions, if accepted, are:

| Ledger record | Proposed source registrations and decision |
|---|---|
| `ingredient-ref-grain-sorghum` | Register S01–S03. Add an accepted decision for the `guinea corn` English alias, keeping the grain identity, bilingual display, existing three grain-code observations, and numeric/substitution behavior unchanged. |
| `ingredient-ref-sorghum-flour` | Register S01–S05. Add an accepted decision for `guinea corn flour`; add the one portion observation and one blocked substitution finding described above. Keep the bilingual display, forms, active density, mappings, and active rules unchanged. |

The exact proposed ledger objects are:

```json
{
  "observationId": "wp02-a6-westpoint-organic-sorghum-flour-3tbsp-30g-20261013",
  "relationship": "portion_weight",
  "value": 30,
  "valueUnit": "g",
  "foodDescription": "Westpoint Naturals Organic Sorghum Flour, milled from organic whole-grain sorghum.",
  "foodState": "Manufacturer-labeled serving for this named product; spoon fill and packing are unspecified.",
  "measurementMethod": "Westpoint product-page nutrition facts state 3 tbsp (30 g); the spoon-measuring method is not described.",
  "quantityBasis": "Source-specific labeled serving only. Do not infer a generic flour density or active volume-to-mass mapping.",
  "evidenceKind": "manufacturer_label",
  "sourceIds": ["WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S02"],
  "sourceQuantity": {"amount": 3, "unit": "tbsp"},
  "observedMassG": 30
}
```

```json
{
  "findingId": "wp02-a6-sorghum-flour-westpoint-substitution-blocked-20261013",
  "researchState": "blocked_pending_evidence",
  "fromIngredientRefId": "ingredient-ref-sorghum-flour",
  "context": "Westpoint says its Organic Sorghum Flour has texture and taste similar to wheat, lists baking uses, and suggests combining it with tapioca starch, cornstarch, or legume flours.",
  "basis": "The manufacturer supplies qualitative use guidance but no replacement quantity, ratio, controlled recipe, or method-specific adjustment.",
  "limitations": [
    "Do not infer a one-for-one wheat-flour substitution.",
    "The page concerns one organic whole-grain sorghum-flour product and does not establish behavior for all sorghum or Guinea-corn flour products.",
    "No global or contextual substitution rule or recipe-line link is supported."
  ],
  "sourceIds": ["WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S02"]
}
```

## Recipe demand

The scan covered every manifest-listed recipe: **114 files and all 1,123 ingredient rows**. It searched the complete recipe JSON and row fields for `guinea corn`, `guinea-corn`, `guinea corn flour`, `guineacorn`, `guinea corn powder`, `Ogi Baba`, `sorghum flour`, `farine de sorgho`, `grain sorghum`, `sorgho à graine`, and both target reference IDs.

- Matching recipe files: **0**.
- Matching ingredient rows: **0**.
- Existing recipe links to either sorghum row: **0**.

No bundled recipe demand, line edit, amount, or recipe link is proposed.

## Source register and ID collision audit

The five proposal-local source IDs below were checked against all **5,313 distinct source IDs** in the live research ledger and the Markdown/JSON catalog archive; each had zero existing matches. The proposed observation ID was absent from all existing measurement-observation IDs and archive text. The proposed finding ID was absent from all existing substitution-finding IDs and archive text. No new identity or form ID is proposed.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| `WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S01` | Nigeria National Bureau of Statistics, [National Agricultural Sample Census 2022 — GUINEA CORN variable](https://microdata.nigerianstat.gov.ng/index.php/catalog/79/variable/F3/V386?name=hh_cereals__GUINEA_CORN), cereal-cultivation question; checked 2026-10-13. | The official variable literal is `D.GUINEA CORN (sorghum)`. Supports regional grain naming; it is not a flour standard. `sourceKind: regional_authority`. |
| `WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S02` | Westpoint Naturals, [Organic Sorghum Flour](https://www.westpointnaturals.com/products/organic-sorghum-flour/), product description, ingredients, use, SKU options, and nutrition facts; checked 2026-10-13. | The product is milled from organic whole-grain sorghum and lists Guinea corn as another name for sorghum. Its nutrition facts state 3 tbsp (30 g). It describes texture/use and optional flour blends but gives no replacement ratio. The page supports product wording and a product-specific serving observation, not every Guinea-corn product or a universal flour specification. `sourceKind: manufacturer`. |
| `WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S03` | FoodBasket Canada, [GraceCo Guinea Corn Powder (Ogi Baba)](https://foodbasketcanada.com/product/guinea-corn-powder-ogi-baba/), product title and description; checked 2026-10-13. | The Canadian product page describes whole-grain Guinea corn (sorghum) powder used to prepare porridge and showed out of stock. It supports the product-boundary caution only; no generic flour identity, active availability, or measure is inferred. `sourceKind: other`. |
| `WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S04` | Oguizu, Okoli, and Oche, [Chemical Composition and Sensory Evaluation of Complementary Foods Produced from Guinea Corn (Sorghum bicolor), Soybean (Glycine max) and Banana (Musa spp.) Blends](https://www.ijamt.com.ng/journal/Vol%206%20No%201%202022/13.%20CHEMICAL%20COMPOSITION%20AND%20SENSORY%20EVALUATION%20OF%20COMPLEMENTARY%20FOODS%20PRODUCED%20FROM%20GUINEA%20CORN.pdf), *International Journal of Agriculture, Management and Technology* 6(1), 2022, pp. 418–425, flour preparation on PDF p. 2. | The paper identifies guinea corn as *Sorghum bicolor* and labels a soaked, dried, roasted, milled, and 250-micron-sieved sample `guinea corn flour`. Supports the term in one regional research context, not a required process, recipe measure, density, or generic roast/sieve alias. `sourceKind: other`. |
| `WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S05` | Westpoint Naturals, [About Us](https://westpointnaturals.ca/about-us/), company description and contact address; checked 2026-10-13. | The company identifies itself as Canadian and lists an address in Port Coquitlam, British Columbia. This locates the manufacturer behind S02; it is not ingredient, product composition, or flour-measurement evidence. `sourceKind: manufacturer`. |

**Existing sources reused without re-registration:** `WP03-S22` (OQLF, *sorgho à graine*), `WP02-A6-JOWAR-FLOUR-20261012-S03` (OQLF, *sorgho*), and `WP02-S33` (Codex, sorghum flour / *farine de sorgho*). These support retaining the existing Québec displays only.

## Baseline snapshot and static checks

Read-only snapshot taken on 2026-10-13 after round-nine integration and before this proposal file was created. Exact-byte hashes are shown.

| Surface | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,342 rows | `a1b425300c63e9961a1c81f4fddd4e5b6e39de8b82c60056dab297300c90fb1c` |
| Ingredient forms | 98 rows | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,652 records; 6,328 source-entry occurrences / 5,313 distinct source IDs; 341 measurement observations; 190 substitution findings | `7181987854fa0934831792757985f39e8f53b3bb7dcb50412473af1a026621fe` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Global / contextual substitution rules | 0 / 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` for each file |
| Generated `BundledIngredientCatalog.kt` | 1,342 references; 588,504 bytes | `95e2a5271a9126a39f347e3152267b436b2f913560ae30666db37ef8ae0cf2e2` |

Static review reproduced the picker query projections from the live JSON and search implementation, checked exact ownership across references/forms/legacy candidates/ledger IDs, audited proposal source/observation/finding identifiers, inspected the existing grain measurements and flour ledger states, and scanned the full manifest corpus.

## Root integration result

Added `guinea corn` to `ingredient-ref-grain-sorghum.aliasesEn` and `guinea corn flour` to `ingredient-ref-sorghum-flour.aliasesEn`. Registered the five reviewed sources on the existing ledger rows and recorded the accepted alias decisions. Added the Westpoint 3 tbsp (30 g) serving as one manufacturer-label `portion_weight` observation on the flour row, with no density or active unit mapping. Recorded the qualitative wheat guidance as a `blocked_pending_evidence` substitution finding; no active substitution rule or recipe link was added. French wording, forms, recipe files, and the grain’s existing observations remain unchanged. Static package, ledger, picker, corpus, encoding, and whitespace checks passed. No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data.
