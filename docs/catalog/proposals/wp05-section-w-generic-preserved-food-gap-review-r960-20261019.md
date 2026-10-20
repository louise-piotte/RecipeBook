# WP05 Section W R960 generic preserved-food gap review: antramthu

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity and boundary review. No shared catalog JSON, ledger, plan, roadmap, checklist, recipe, code, or test file was changed.
- **Plan anchor:** Section W leaves “further documented regional preserves” open after the integrated sinki, gundruk, khalpi, and inziangsang identities in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10353); see the preceding [R959 inziangsang review](wp05-section-w-generic-preserved-food-gap-review-r959-20261019.md) for the nearest catalog decision.
- **Recommendation:** Propose one identity-only generic `antramthu` reference in `SAUCE_AND_CONDIMENT`. Retain `antramthu` as the provisional fr-CA display; add no aliases. The supported identity is a named regional fermented/preserved mustard-leaf food. Do not impose a universal dried, semi-liquid, pickle, curry, or sauce form.
- **Scope:** This review covers culinary ingredient diversity through one named generic preserve. It does not research brand, product-line, flavour-family, SKU, or retailer-variant rosters. Existing identities and evidence remain intact; no transfer, deletion, or merge is proposed.

## Current ownership and queue audit

At the refreshed audit snapshot, the bundled seed contains **1,978 ingredient references and 205 forms**, the legacy-import file contains **55 candidates**, and the research ledger contains **2,383 records**. Exact and normalized searches for `antramthu`, `antram-thu`, `antram thu`, `anthramthu`, `anthram-thu`, `ankamthu`, `ankam-thu`, and `ingredient-ref-antramthu` found no owner in active reference names or aliases, form labels or match terms, legacy candidate names or aliases, or ledger identity record IDs. A whole-ledger text scan also found no exact spelling token. Source-literature mentions are not catalog ownership.

The open Section W checklist keeps documented regional preserves in scope. No roster-only task was found in the reviewed preserve checklist. If a queued brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task appears later, mark it out of scope because **commercial-product counts do not add ingredient diversity**, then stop that line. Preserve all existing branded rows and evidence; any proposed evidence transfer requires a separate transferability review.

Nearby active identities are boundaries, not owners of `antramthu`:

| Nearby active identity | Current scope | Boundary retained for `antramthu` |
|---|---|---|
| `ingredient-ref-mustard-greens` — `mustard greens / feuilles de moutarde` | Raw mustard leaves. | Shared substrate does not turn the raw ingredient into the preserved food or an alias for it. |
| `ingredient-ref-pickled-mustard-greens` — `pickled mustard greens / feuilles de moutarde marinées` | Generic prepared mustard-greens preserve. | Keep the broader prepared-food identity separate from the source-named regional food; do not add either label as an alias of `antramthu`. |
| `ingredient-ref-inziangsang` — `inziangsang / inziangsang` | Named fermented mustard-leaf food that the literature associates with Naga communities; the 2012 table separately lists liquid `inziang-dui`. | The 2012 table names `Inziang-sang` and `Antramthu` separately, with different community labels and reported uses. Do not alias or merge them. The 2025 study's close spelling `Anthramthu` and its sauce-name equivalences remain source-scoped and unresolved against these spellings. |
| `ingredient-ref-gundruk` — `gundruk / gundruk` | Named Himalayan fermented leafy-vegetable food with broader leaf-substrate variation. | Similar fermented-leaf categories do not make these source-distinct foods synonyms or establish interchangeability. Preserve the gundruk identity and evidence. |
| `ingredient-ref-takana-zuke` — `takana-zuke (pickled takana) / takana-zuke` | Named Japanese pickled leaf-mustard preparation. | Keep this cuisine-specific identity distinct; no alias or form relation is proposed. |
| `ingredient-ref-sinki` and `ingredient-ref-khalpi` | Named fermented radish-root and cucumber products. | Different named foods and substrates; no broad “regional preserve” alias, common form, or substitution is proposed. |
| `ingredient-ref-zha-cai`, `ingredient-ref-yibin-ya-cai`, and `ingredient-ref-fermented-bamboo-shoots` | Other named mustard-stem/leaf and fermented bamboo-shoot identities. | Their source-specific plant parts and food identities remain separate; none provides ownership or a transferable form for `antramthu`. |

No current identity, branded row, measurement, or product-specific evidence is transferred, removed, or rewritten. The live reference and ledger records for the nearby identities remain unchanged.

## Recipe-demand check

All **114** manifest-listed bundled recipe JSON files and **1,123** ingredient rows were scanned, including serialized recipe text. The bounded case-insensitive query set (`antramthu`, `antram-thu`, `antram thu`, `anthramthu`, `anthram-thu`, `ankamthu`, `ankam-thu`, `mustard leaf pickle`, `mustard leaves pickle`, `mustard leaf preserve`, `pickled mustard greens`, `fermented mustard leaves`, `fermented mustard greens`, `fermented mustard sauce`, `ziangsang dui`, `ganang kang dui`, `gundruk`, `inziangsang`, `sinki`, `khalpi`, `takana-zuke`, `zha cai`, and `Yibin ya cai`) returned **no recipe hits**. This lexical scan does not prove that no recipe could use the food; it supplies no direct bundled demand. No recipe link, recipe-derived measure, conversion, yield, or substitution is proposed.

## Identity evidence and limits

The 2012 Northeast India review names `Antramthu` separately from `Inziang-sang` and `Inziang-dui`. Its table describes Antramthu as made from mustard leaves, dried and acidic, used as a pickle, and associated with Hmar and Biate communities. This supports a named regional preserved-food identity, not a standard preparation or product specification. [S01]

The 2014 North Cachar Hills field study is stronger local evidence: its product inventory lists `Antramthu` made from mustard leaves as dried/semi-liquid and eaten as a pickle/with rice for Hmar and Biate; a separate Biate entry lists `Antramthu` from *Brassica* leaves as dried and used in curry. The authors describe interviews and observations, but their characterized sample set was Tuaithur, Tuairoi, Honoheingrain, Humao, and Judima, not Antramthu. The inventory corroborates culinary use and regional naming while leaving product form variable and uncharacterized. [S02]

A 2016 academic book table repeats a mustard-leaf, dried/semi-liquid, pickle-with-rice description and cites the 2014 study; it is a secondary restatement, not independent field confirmation. A 2022 review lists Antramthu among fermented vegetable foods. Neither source establishes a universal formula or measure. [S03] [S04]

A 2025 study of two vendor samples from Ramgailong, Manipur, calls a fermented mustard sauce `ziangsang dui/ganang kang dui/anthramthu`; it also reports that Hmar and Kuki communities use `Anthramthu/Ankamthu` for a mustard-leaf sauce. The paper's spelling differs from the exact `Antramthu` spelling in the preserve tables, and its synonym bundle is specific to the reported Manipur sauce. It is useful evidence of a close-named culinary preparation, not enough to establish that `anthramthu`, `ankamthu`, `ziangsang dui`, `inziang-dui`, and the dried/pickle-table `antramthu` are universally equivalent. Do not add these as aliases, related forms, or substitutions. The study's process, semi-solid result, fermentation times, sample conditions, pH, and nutrient values remain limited to the reported sauce and samples. [S05]

The OQLF lists `feuilles de moutarde` for the edible raw leaves, but a targeted search for `antramthu`, its close spellings, and a preserved-mustard equivalent did not identify a Québec-specific term for this named food. The proposed fr-CA display therefore borrows `antramthu` provisionally. Do not translate the identity into generic `feuilles de moutarde marinées`, which is already the active display for a broader preserve. [S06]

The evidence does not establish a default density, household measure, moisture state, drained/dried yield, unit mapping, conversion, or safe general substitution. No identity should inherit measurements or claims from a named commercial product, a research sample, or another mustard preserve. No manufacturer or retailer pages were used for generic claims.

## Substitution research

A bounded online search for exact-name replacement advice (`Antramthu substitute`, `Antramthu alternative`, `Antramthu curry pickle substitute`, and close spellings) found no credible source recommending a direct or contextual replacement for this preserve. The table and field-inventory evidence instead show overlap without interchangeability: the 2012 review labels Antramthu a dried, acidic mustard-leaf pickle, but separately describes gundruk as a dried leafy preserve for soup/pickle and inziang-sang as dried mustard leaves for soup/curry; its separate Hmar/Biate versus Gorkha/Naga labels reinforce distinct names, not replacement directions. The 2014 inventory gives Antramthu pickle-with-rice and dried-curry uses, but tests no replacement. The 2025 sauce study describes one close-spelling Manipur condiment and provides no Antramthu replacement advice. [S01] [S02] [S05]

Generic pickled mustard greens, gundruk, inziangsang, and takana-zuke are reasonable nearby identities to check, but the reviewed sources do not match them to an Antramthu dish role, preparation method, texture/moisture state, or quantity basis. The close-spelling sauce report cannot be transferred into a form or a replacement rule. Therefore propose `substitutionResearchState: blocked_pending_evidence`: nearby foods are similar or overlap in substrate/use, but no safe culinary context is established. Do not claim that every substitute has been disproven; no active substitution rule, alias, or replacement ratio is proposed.

Proposed bounded `substitutionFindings` item (ledger-only; not an active rule):

```json
{
  "findingId": "antramthu-no-safe-substitute-r960-20261019",
  "researchState": "blocked_pending_evidence",
  "fromIngredientRefId": "ingredient-ref-antramthu",
  "context": "General replacement review for the named Hmar/Biate mustard-leaf preserve, including its reported pickle-with-rice and dried-curry uses; no exact recipe line or dish method is specified.",
  "basis": "The 2012 review and 2014 field inventory describe Antramthu and nearby fermented leafy foods separately and report overlapping food uses, but neither recommends one in place of another or supplies a tested quantity. The 2025 study's close-spelling mustard sauce is a distinct, source-scoped preparation and gives no replacement advice.",
  "limitations": [
    "Do not recommend generic pickled mustard greens, gundruk, inziangsang, inziang-dui, or takana-zuke as an equal or universal substitute.",
    "No source establishes an applicable dish type, ingredient role, cooking method, texture or moisture match, quantity basis, ratio, or adjustment.",
    "Keep Anthramthu/Ankamthu/ziangsang-dui wording and sauce observations scoped to the 2025 study; do not convert them into aliases, forms, or substitution evidence."
  ],
  "rejectedCandidates": [
    {
      "candidate": "ingredient-ref-gundruk",
      "reason": "The review reports a similar dried, sour fermented-leaf class and overlapping soup/pickle uses, but distinguishes gundruk from Antramthu by name and community; it supplies no substitution direction or ratio.",
      "sourceIds": [
        "WP05-SECTIONW-ANTRAMTHU-R960-20261019-S01"
      ]
    },
    {
      "candidate": "ingredient-ref-inziangsang",
      "reason": "The review reports mustard leaves and dried soup/curry use for Inziang-sang but lists it separately from Antramthu; shared substrate and partial use overlap do not establish a safe replacement.",
      "sourceIds": [
        "WP05-SECTIONW-ANTRAMTHU-R960-20261019-S01"
      ]
    }
  ],
  "replacements": [],
  "sourceIds": [
    "WP05-SECTIONW-ANTRAMTHU-R960-20261019-S01",
    "WP05-SECTIONW-ANTRAMTHU-R960-20261019-S02",
    "WP05-SECTIONW-ANTRAMTHU-R960-20261019-S05"
  ]
}
```

## Proposed minimal data and ledger state

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-antramthu` |
| `nameEn` | `antramthu` |
| `nameFr` | `antramthu` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | None; retain only the exact source spelling as the name. Do not add `anthramthu`, `ankamthu`, generic mustard-leaf wording, or sauce names. |
| French aliases | None |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| Forms, recipe links, measures, conversions, yields, active substitution rules | None |

Proposed ledger record: `recordId: ingredient-ref-antramthu`, `recordType: ingredient_reference`, `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: blocked_pending_evidence`. Use new source IDs `WP05-SECTIONW-ANTRAMTHU-R960-20261019-S01` through `-S05`, reuse the existing raw-leaf-only OQLF source ID `WP03-LEAFY-GREENS-20261009-S01`, and attach the bounded `substitutionFindings` item above. This is a proposal, not a ledger edit.

## Source register

Sources were reviewed online on 2026-10-19. Claims are paraphrased; source-specific details are not proposed as universal catalog behavior.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-ANTRAMTHU-R960-20261019-S01` | Jyoti Prakash Tamang et al., [“Microorganisms and Nutritional value of Ethnic fermented foods and alcoholic beverages of North East India”](https://nopr.niscpr.res.in/handle/123456789/13415), *Indian Journal of Traditional Knowledge* 11(1), January 2012, pp. 7–25, Table 2, p. 9; [NIScPR-hosted PDF](https://nopr.niscpr.res.in/bitstream/123456789/13415/1/IJTK%2011%281%29%207-25.pdf). | Review table names Antramthu, its mustard-leaf substrate, dried/acidic pickle character, lactic acid bacteria classification, and Hmar/Biate community association. It is a secondary regional classification, not a primary recipe study or standard. |
| `WP05-SECTIONW-ANTRAMTHU-R960-20261019-S02` | Jayasree Chakrabarty, G. D. Sharma, and Jyoti Prakash Tamang, [“Traditional technology and product characterization of some lesser-known ethnic fermented foods and beverages of North Cachar Hills District of Assam”](https://nopr.niscpr.res.in/handle/123456789/29522), *Indian Journal of Traditional Knowledge* 13(4), October 2014, pp. 706–715; [original university PDF URL](https://www.bilaspuruniversity.ac.in/PDF/ResearchPublications/305.pdf). | Primary field study. Table 1 (p. 709 in the PDF text) inventories two Antramthu entries with mustard/Brassica leaves and different product-use descriptions. The article abstract says the analyzed samples were five other food types, so Antramthu was not characterized. The NIScPR repository provides bibliographic metadata; its item and the former university PDF host were not directly fetchable during this review (the PDF URL now redirects), so the table details were checked in the indexed PDF text. |
| `WP05-SECTIONW-ANTRAMTHU-R960-20261019-S03` | Jyoti Prakash Tamang, Namrata Thapa, Tek Chand Bhalla, and Savitri, [“Ethnic fermented foods and beverages of India”](https://link.springer.com/chapter/10.1007/978-81-322-2800-4_2), in *Ethnic Fermented Foods and Alcoholic Beverages of Asia*, Springer India, 2016, pp. 17–72; [table text copy](https://ndl.ethernet.edu.et/bitstream/123456789/74085/1/2016_Book_EthnicFermentedFoodsAndAlcohol.pdf). | Secondary table describes Antramthu as mustard leaves, dried/semi-liquid, pickle with rice, Assam, citing Chakrabarty et al. (2014). This is not independent confirmation or a universal form. |
| `WP05-SECTIONW-ANTRAMTHU-R960-20261019-S04` | Jyoti Prakash Tamang et al., [“Ethno-microbiology of ethnic Indian fermented foods and alcoholic beverages”](https://enviromicro-journals.onlinelibrary.wiley.com/doi/full/10.1111/jam.15382), *Journal of Applied Microbiology*, 2022. | Review lists Antramthu among fermented vegetable foods and describes regional preservation practices generally. The general practices should not be assigned to every named food. |
| `WP05-SECTIONW-ANTRAMTHU-R960-20261019-S05` | Somishon Keishing et al., [“Nutrient Content, Antioxidant and Antidiabetic Activities of Fermented Mustard Sauce of the tribal Community of Manipur, India”](https://doi.org/10.53555/jab.v11si10.1352), *Journal of Applied Bioanalysis* 11(10s), December 2025, pp. 85–91. | Primary study reports two vendor samples and a sauce called `ziangsang dui/ganang kang dui/anthramthu`, with Hmar/Kuki spellings `Anthramthu/Ankamthu`. These close spellings and sauce equivalences are not adopted as aliases for the exact `Antramthu` preserve name; sample properties stay product-specific. Full text was inspected through the author-uploaded [ResearchGate copy](https://www.researchgate.net/publication/400930863_Nutrient_Content_Antioxidant_and_Antidiabetic_Activities_of_Fermented_Mustard_Sauce_of_the_tribal_Community_of_Manipur_India). |
| `WP03-LEAFY-GREENS-20261009-S01` (reused ledger source) | Office québécois de la langue française, [“feuilles de moutarde”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488385/feuilles-de-moutarde), Grand dictionnaire terminologique. | Supports Québec French wording for raw edible mustard leaves only. It does not name this regional fermented/preserved food. Reuse the existing mustard-greens source record without broadening its claim. |

**Disposition:** Propose identity-only generic `antramthu / antramthu`, no aliases, forms, measurements, or recipe links. Keep it separate from gundruk, inziangsang, generic pickled mustard greens, takana-zuke, and other preserve identities. Set substitution research to `blocked_pending_evidence` with the source-bounded finding above; add no active rule or alias. Preserve close spellings and the reported semi-solid mustard sauce equivalence as unresolved, source-scoped evidence. Keep the Section W preserve checklist open. No commercial-product roster was researched because commercial-product counts do not add ingredient diversity. No software tests were run for this proposal-only document.

## Document checks

- UTF-8 decoded cleanly with no byte-order mark; the French accent in `Québec` is preserved.
- Relative links to the Section W plan anchor and R959 review resolve in the repository; external source links use HTTPS.
- The proposed `substitutionFindings` JSON parses, and all cited source IDs resolve to entries in the source register.
- No trailing whitespace was found in this file.
- No software tests were run, as this is proposal-only documentation.
