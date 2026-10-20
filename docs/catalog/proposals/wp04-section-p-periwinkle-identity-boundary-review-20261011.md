# WP04 Section P — Periwinkle / bigorneau identity boundary review

- **Packet type:** proposal-only identity and naming-boundary review.
- **Review date:** 2026-10-11.
- **Scope:** the edible periwinkle / bigorneau food identity, its Québec English/French names, current Canadian product wording, catalog/search ownership, recipe demand, and separation from whelks and other gastropods.
- **Recommendation:** support one identity-only reference for *Littorina littorea*, displayed as **common periwinkle / bigorneau**. Do not link recipe or product text that says only `periwinkle`, `winkle`, or `bigorneau` without source evidence for the species. No forms, measurement data, conversions, yields, or substitutions are proposed.
- **Write scope:** this report only. No shared references, forms, recipes, ledger, checklist, roadmap, code, or tests were changed.

## Decision and scope

Québec terminology supports a species-qualified name: the OQLF places `bigorneau` in zoology and edible-mollusc domains, maps it to *Littorina littorea*, and gives `common periwinkle` as the English term. OQLF says `bigorneau` is normalized for Québec and explains that one term corresponding to a specific species is normalized to prevent consumer-label confusion. DFO independently identifies the species and records its North American range from Newfoundland and Labrador to New Jersey. [S01, S02]

That evidence supports a catalog concept for the exact species, but it does not make every commercial or culinary use of the words species-specific. CFIA's current Fish List entry is genus-level *Littorina*; current seafood listings use the unqualified words without species; and a Québec processor currently calls its distinct *Buccinum undatum* product `bigorneau`. [S03, S06–S08] The candidate row below is therefore a verified taxon/name pair, not a rule for resolving an unqualified recipe or package. The exact recipe corpus has no periwinkle demand, so no recipe link is proposed.

Use no aliases. In particular, do not add `winkle`, `winkles`, `littorine`, or `bourgot`; do not alias this species to buccin/whelk, conch, abalone, snail, or generic seafood. OQLF's preferred Québec name is `bigorneau`; it says `littorine` was not retained for fish-product marketing. The older MAPAQ commercial glossary likewise records `bigorneau / Periwinkle / Littorina littorea` and lists `bigorneau` among the names not retained for Buccin / Whelk. [S01, S05]

## Plan and prior-review context

WP04 Section P leaves broader fish, shellfish, seafood-product, and regional-identity work open. No prior proposal or ledger record is dedicated to periwinkle. The neighboring whelk review says to keep CFIA's *Littorina* periwinkle separate from whelk; the conch, abalone, and sea-urchin packets also refer to periwinkle only as a distinct neighboring identity. Those boundaries remain separate; this packet assigns no new meaning to them. [Prior reviews: `wp04-whelk-species-product-boundary-review-20261011.md`, `wp04-conch-quebec-product-boundary-review-20261011.md`, `wp04-abalone-ormeau-species-product-boundary-review-20261011.md`, and `wp04-sea-urchin-uni-quebec-product-boundary-review-20261011.md`]

## Québec and Canadian naming/product evidence

| Evidence | What it establishes | What it does not establish |
|---|---|---|
| OQLF GDT entry for `bigorneau` [S01] | Edible-mollusc and malacology domains; preferred and normalized Québec French term; English `common periwinkle` and `periwinkle`; Latin *Littorina littorea*; a fishery species with Québec commercial potential. | It is terminology evidence, not a recipe synonym rule, a current sale listing, or proof that a particular seller's unqualified product is this taxon. |
| DFO species profile [S02] | Bigorneau is *Littorina littorea*, a mollusc occurring in the North Atlantic; the stated northeastern North American range includes Newfoundland and Labrador. | It does not establish a currently sold Québec package, edible yield, processing state, or recipe amount. |
| CFIA Fish List [S03] | Current Canadian label-name listing maps genus *Littorina* to `Periwinkle / Bigorneau` and `Winkle`; the result flags marine-toxin hazard status. | The entry is genus-level, not *L. littorea*-specific. The hazard flag is not a preparation instruction or a species-specific recipe rule. |
| CFIA common-name guidance [S04] | The Fish List provides French/English common names for fish labeling; the common name listed for the actual species is the name to use for that species sold or processed in Canada. | Labeling guidance does not identify the species in a cookbook line or certify a product lot. |
| MAPAQ commercial glossary [S05] | The older Québec fish/seafood directory explicitly pairs normalized `Bigorneau / Periwinkle / Littorina littorea`; it also lists `bigorneau` among non-retained Buccin names. | It is older terminology evidence, not a current market audit or a species declaration for current vendors. |
| Frandon Seafoods bilingual product lists [S06] | The current Montréal wholesale supplier lists `BIGORNEAU` on its French fresh-fish A–Z page and `PERIWINKLE` on its English counterpart; the pages describe daily deliveries. This confirms current Québec supplier use of the bilingual product words. | The list does not provide a periwinkle taxon, package, or product-specific state. |
| Seafood Depot `Winkles` listing [S07] | Current Canadian vendor wording is `Winkles / Littorina`, “also known as Periwinkles,” fresh or frozen, wild, product of Canada and the U.S. | The listing gives the genus, not the species, and its states/origin must not be copied to a species-specific form or recipe conversion. |
| Les Fruits de Mer Madeleine buccin listing [S08] | A current Québec processor sells raw frozen *Buccinum undatum*, identifies its fishery area, and says it is also called `Bigorneau`. This directly demonstrates a local culinary/product-name collision across gastropod taxa. | This is a source-specific alternate/colloquial usage; it does not change OQLF's normalized species mapping or make buccin and periwinkle the same ingredient. |

### Labeling-versus-culinary limit

The CFIA entry and common-name guidance concern names used for Canadian fish-product labeling. OQLF's `bigorneau` entry supports a Québec-normalized name for *L. littorea*. Neither source means that a recipe, imported package, or local seller using bare `periwinkle` or `bigorneau` necessarily names this species. The current *B. undatum* listing demonstrates the practical distinction. Keep the catalog entry species-scoped; do not auto-link an unqualified recipe or vendor phrase to it. A picker query for `periwinkle` can still surface the proposed display name `common periwinkle` because search matches a phrase within a longer term; that result is a species candidate for the user to confirm, not source identification.

## Current catalog, ledger, prior-packet, and search audit

The shared package was read on 2026-10-11 while other integration work was active. Counts and digests are a point-in-time snapshot. SHA-256 values cover exact file bytes. The recipe digest below hashes each manifest-listed recipe basename in lexical order, then NUL, exact recipe-file bytes, then NUL.

| Artifact | Current snapshot | SHA-256 / digest |
|---|---:|---|
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Active ingredient references | 1,028 | `c786ee7aa3aaa4fe470164ea4459befedb5e291642f9986ff283c1681b1e3149` |
| Active ingredient forms | 71 | `1db31d8f54262555a18e15173f2a69b0d164cad5d53bf14fad86dac390c7989a` |
| Legacy import candidates | 75 | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| Research ledger | 1,317 records; 4,270 source entries; 3,506 distinct source IDs | `97db8ac58bed0722a336a0ed322508f2f1272f1bd2920b0ad8aef2c3b359252f` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `0f97b8e5cc7fb9c2a401e85b7efdd0773081f1e56eabd0c93ea4c57bd8771db7` |

The normalized-key audit mirrored `IngredientSearch.kt`: lowercase/NFKD; fold `œ`, `æ`, and `ß`; remove combining marks; expand `&`; replace other punctuation with spaces; collapse whitespace; prefer complete word-phrase matches before substring matches. It checked active reference names and aliases, form labels and match terms, and legacy-candidate names and aliases.

- No active reference, form, or legacy candidate owns any of these exact queries: `periwinkle`, `common periwinkle`, `bigorneau`, `Littorina`, `Littorina littorea`, `winkle`, `winkles`, `littorine`, `bourgot`, `whelk`, `buccin`, `sea snail`, or `escargot de mer`. The app-style picker query simulation returned no reference for each query.
- No periwinkle-specific candidate exists in the research ledger. The word appears only in adjacent boundary records: conch, whelk, and sea urchin (the latter's source is a historical DFO report on sea urchin and periwinkle exploitation). Those entries keep the neighboring identities distinct; this report does not revise them.
- The source-ID prefix `WP04-PERIWINKLE-20261011-`, proposed ledger record ID `ingredient-ref-common-periwinkle`, and candidate label `candidate-wp04-periwinkle` had no collision in the live catalog, forms, legacy identities, or ledger. No ledger records were added by this report.

## Exact bundled-recipe demand

All **114 manifest-listed recipe files / 1,123 ingredient rows** were searched across every JSON string for `periwinkle`, `common periwinkle`, `bigorneau`, *Littorina*, `winkle(s)`, `littorine`, `bourgot`, `sea snail`, and `escargot de mer`. The exact result is **zero matching recipe rows and zero matching recipe fields**.

The only broader seafood mentions are not periwinkle demand:

| Recipe | Exact bundled wording | Finding |
|---|---|---|
| 093, fried rice | `Cooked meat or seafood, to taste` | Optional broad ingredient line; no mollusc, species, or product state is named. |
| 093, fried-rice notes | “Leftover meat or seafood both work well.” / “Des restes de viande ou des fruits de mer fonctionnent bien.” | General optional suggestion; no specific identity or measurable amount. |
| 097, Alfredo-sauce notes | “This is a good base for mushrooms, seafood, or other add-ins.” / “C'est une bonne base pour ajouter des champignons, des fruits de mer ou d'autres garnitures.” | General optional add-in note only. |

No recipe link, quantity, density, household measure, edible-portion factor, count weight, cooking yield, form conversion, or substitution can be derived from these lines. The current supplier listings' fresh/frozen wording is product-specific and not a recipe form rule for *L. littorea*.

## Proposed identity-only reference JSON

This is an integration proposal, not an edit to the active seed file. It uses the OQLF-normalized Québec name and its species-qualified English term. No aliases are added. The picker can find the English row with a partial `periwinkle` query; that search behavior must not be treated as automatic taxon assignment.

```json
{
  "id": "ingredient-ref-common-periwinkle",
  "nameFr": "bigorneau",
  "nameEn": "common periwinkle",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "PROTEIN"
}
```

Do not add a form for fresh, frozen, live, cooked, or shell-on product from the reviewed listings. The Canadian `Winkles / Littorina` page gives genus-level market evidence only; the Montréal supplier gives a broad bilingual listing; and the explicit raw/frozen *B. undatum* values belong only to that whelk product. Add no mass/volume mapping, density, yield, unit conversion, or substitution.

## Proposed ledger JSON

The accepted evidence record documents only the exact *Littorina littorea* identity and name. Measurement and substitution research remain open; no measurement observation or substitution finding is claimed.

```json
{
  "recordId": "ingredient-ref-common-periwinkle",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-PERIWINKLE-20261011-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198886/bigorneau",
      "title": "OQLF, bigorneau (GDT)",
      "accessedOn": "2026-10-11",
      "locator": "Edible-mollusc domain, preferred term, English translation, Latin name, and fishery note",
      "supports": "Normalizes bigorneau for Québec; maps the edible mollusc and English common periwinkle to Littorina littorea; says littorine was not retained for fish-product marketing to avoid confusion.",
      "sourceKind": "regional_authority",
      "versionOrDate": "2012"
    },
    {
      "sourceId": "WP04-PERIWINKLE-20261011-S02",
      "url": "https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/periwinkle-bigorneau-fra.html",
      "title": "Fisheries and Oceans Canada, Bigorneau species profile",
      "accessedOn": "2026-10-11",
      "locator": "Latin name and northeastern North American range",
      "supports": "Identifies bigorneau as Littorina littorea and gives its Atlantic range from Newfoundland and Labrador south to New Jersey; taxonomy and range do not establish recipe identity or product state.",
      "sourceKind": "regional_authority",
      "versionOrDate": "2016-12-19"
    },
    {
      "sourceId": "WP04-PERIWINKLE-20261011-S03",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "CFIA Fish List lookup results",
      "accessedOn": "2026-10-11",
      "locator": "Littorina rows: Winkle and Periwinkle / Bigorneau; marine-toxin hazard flag",
      "supports": "CFIA lists the English/French product names under genus Littorina, not a species-specific Littorina littorea row. The list is a Canadian fish-label naming reference, not evidence that a vendor or recipe phrase names this exact species.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-PERIWINKLE-20261011-S04",
      "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names",
      "title": "CFIA, Guidance on determining common names for fish sold or processed in Canada",
      "accessedOn": "2026-10-11",
      "locator": "Sections 1 and 4, CFIA Fish List purpose and scope",
      "supports": "The Fish List provides common names for Canadian fish labeling, and the common name listed for the actual species is used for that species sold or processed in Canada. This does not infer a species from unqualified culinary wording.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-PERIWINKLE-20261011-S05",
      "url": "https://www.mapaq.gouv.qc.ca/fr/Publications/repertoireFRfinal-b.pdf",
      "title": "MAPAQ, Répertoire des poissons et fruits de mer du Québec — commercial-name glossary",
      "accessedOn": "2026-10-11",
      "locator": "Glossary table entries for Bigorneau and Buccin",
      "supports": "The directory pairs Bigorneau / Periwinkle / Littorina littorea and lists bigorneau among names not retained for Buccin / Whelk. This older Québec glossary corroborates terminology, not current vendor contents.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-PERIWINKLE-20261011-S06",
      "url": "https://frandon.ca/produits/",
      "title": "Frandon Seafoods, Produits",
      "accessedOn": "2026-10-11",
      "locator": "French fresh-fish A-Z listing and daily-delivery description; English counterpart https://frandon.ca/language/en/products/",
      "supports": "A Québec seafood supplier lists BIGORNEAU on its French page and PERIWINKLE on its English page. Neither list states the species, product package, or a periwinkle-specific product state.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-PERIWINKLE-20261011-S07",
      "url": "https://www.seafooddepot.ca/product-winkles",
      "title": "Seafood Depot, Winkles",
      "accessedOn": "2026-10-11",
      "locator": "Product title and characteristics",
      "supports": "Canadian vendor lists Winkles / Littorina, also known as Periwinkles, and describes fresh/frozen, wild, Canada and U.S. products. This is genus-level product evidence and does not identify Littorina littorea.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-PERIWINKLE-20261011-S08",
      "url": "https://www.fruitsdemermadeleine.com/nos-produits/nos-buccins/buccins-crus-congeles",
      "title": "Les Fruits de Mer Madeleine, Buccins crus, congelés",
      "accessedOn": "2026-10-11",
      "locator": "Species, product title, alias wording, and Québec sales area",
      "supports": "Québec processor identifies its raw frozen product as Buccinum undatum but says it is also called Bigorneau. This proves current colloquial/product-name overlap; it does not make Buccin and Littorina the same identity or override OQLF's normalized term.",
      "sourceKind": "manufacturer"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add an identity-only reference scoped to Littorina littorea as common periwinkle / bigorneau. OQLF provides a normalized Québec edible-mollusc term for this species, DFO independently confirms the species, and current Québec/Canadian suppliers list the bilingual or genus-level market product. Keep the reference taxon-scoped: CFIA's listing and several current product listings are broader, and one Québec buccin seller uses bigorneau for Buccinum undatum. Do not link unqualified recipe or vendor text to this row without species evidence. The recipe corpus has no periwinkle demand. Add no aliases, forms, measures, conversions, yields, recipe links, or substitutions.",
      "sourceIds": [
        "WP04-PERIWINKLE-20261011-S01",
        "WP04-PERIWINKLE-20261011-S02",
        "WP04-PERIWINKLE-20261011-S03",
        "WP04-PERIWINKLE-20261011-S04",
        "WP04-PERIWINKLE-20261011-S05",
        "WP04-PERIWINKLE-20261011-S06",
        "WP04-PERIWINKLE-20261011-S07",
        "WP04-PERIWINKLE-20261011-S08"
      ]
    }
  ]
}
```

## Source register and use limits

All pages were accessed 2026-10-11. The source IDs above are proposal-local; no shared ledger records were added.

| ID | Source | Use and limit |
|---|---|---|
| **WP04-PERIWINKLE-20261011-S01** | Office québécois de la langue française, [bigorneau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198886/bigorneau) | Defines the edible-mollusc term, normalizes `bigorneau`, maps it to `common periwinkle` and *Littorina littorea*, and says `littorine` was not retained for Québec fish-product marketing. The entry was updated in 2012; it is terminology, not a current product listing. |
| **WP04-PERIWINKLE-20261011-S02** | Fisheries and Oceans Canada, [Bigorneau species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/periwinkle-bigorneau-fra.html) | Identifies *Littorina littorea* and its Atlantic Canadian range. Modified 2016-12-19; not a food package, recipe, or preparation reference. |
| **WP04-PERIWINKLE-20261011-S03** | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Current results list *Littorina* with `Winkle` and `Periwinkle / Bigorneau` and show a marine-toxin hazard flag. The genus-level result cannot distinguish *L. littorea* from other *Littorina* product claims. |
| **WP04-PERIWINKLE-20261011-S04** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains the Fish List’s Canadian labeling scope and its relation to the actual species. It does not resolve cookbook use or approve a vendor's unqualified word choice. |
| **WP04-PERIWINKLE-20261011-S05** | MAPAQ, [Répertoire des poissons et fruits de mer du Québec — glossary PDF](https://www.mapaq.gouv.qc.ca/fr/Publications/repertoireFRfinal-b.pdf) | Older official glossary maps Bigorneau / Periwinkle to *Littorina littorea* and treats `bigorneau` as non-retained for Buccin / Whelk. Terminology corroboration only; not current product evidence. |
| **WP04-PERIWINKLE-20261011-S06** | Frandon Seafoods, [Produits](https://frandon.ca/produits/) and [Products](https://frandon.ca/language/en/products/) | Current bilingual Québec supplier lists BIGORNEAU / PERIWINKLE among fresh-fish products. It names no taxon or product package. |
| **WP04-PERIWINKLE-20261011-S07** | Seafood Depot, [Winkles](https://www.seafooddepot.ca/product-winkles) | Canadian product listing says Winkles / Littorina, also known as Periwinkles, fresh/frozen, wild, product of Canada and the U.S. Genus-level only; does not prove *L. littorea*. |
| **WP04-PERIWINKLE-20261011-S08** | Les Fruits de Mer Madeleine, [Buccins crus, congelés](https://www.fruitsdemermadeleine.com/nos-produits/nos-buccins/buccins-crus-congeles) | Current Québec product page explicitly calls a raw, frozen *Buccinum undatum* product `Bigorneau`; this is direct evidence that the bare French market word can be used for another species. It is not a synonym recommendation. |

## Coordinator disposition

1. If integrating this proposal, add only the *Littorina littorea* identity shown above as `common periwinkle / bigorneau` with no aliases and no recipe links.
2. Keep generic `periwinkle` / `bigorneau` ingredient or product text unassigned unless the recipe/package evidence identifies *L. littorea*. Do not turn the current genus-level CFIA row or a vendor's generic listing into species proof.
3. Keep buccin / whelk, other gastropods, and this periwinkle identity separate. Do not use `bigorneau`, `bourgot`, or `littorine` as cross-aliases.
4. Add no fresh/frozen/live/cooked forms, measures, yields, conversions, or substitutions from these product listings.
5. Leave the broader WP04 Section P fish, shellfish, and product checklist open.
