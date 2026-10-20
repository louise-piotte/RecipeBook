# WP02 Section 04 A6 R153 — Kaniwa flour identity review

## Review record

- **Reviewed and sources checked:** 2026-10-15.
- **Status:** Proposal only. This review writes no shared catalog, ledger, recipe, plan, roadmap, or generated file.
- **Open checklist:** Continue the A6 review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours ([global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1399)).
- **Scope:** A flour milled from kaniwa / canihua (*Chenopodium pallidicaule*), distinct from the whole kaniwa seeds reference, quinoa flours, and isolated kaniwa starch.
- **Proposal-local source-ID prefix:** `WP02-A6-KANIWA-FLOUR-R153-20261015-S` (S01–S06). The proposed ID, source prefix, and exact names were checked against active references, forms, legacy identities, ledger records, and the proposal/batch archive; no active owner or source-ID collision was found.

## Recommendation

**Accept identity-only `kaniwa flour / farine de kaniwa` as `ingredient-ref-kaniwa-flour`, with `canihua flour` as its only English alias.** Put it in `FLOUR_AND_STARCH`, with no French aliases, forms, measurements, density, unit mappings, conversions, yields, recipe links, or active substitution.

Port Royal Mills, a current Ontario grain mill, lists Canihua among its whole grains and says the listed products can be milled as whole-grain flour. This directly supports a Canadian commercial milling route and the market spelling `Canihua`; the page is a supplier capability list, not a standalone bag or a stock commitment [S01]. Villa Andina’s current Andean-grain portfolio separately lists canihua in grain, flour, flake, and puffed formats and identifies it as *Chenopodium pallidicaule* [S03]. A current Metro grocery listing for a 500 g composite flour includes organic kaniwa flour as an ingredient, although the selected-store product was out of stock when checked [S04]. The 2026 OCIA operator inventory also lists Cañihua Flour / Harina de Cañihua in bulk bags; it is export-certificate evidence, not Canadian availability [S05].

Use OQLF’s preferred French grain term `kaniwa` to construct the transparent display `farine de kaniwa`. OQLF names the grain and its preferred terms; it does not attest this flour compound. The French display is therefore a Québec French construction informed by the authoritative grain term, not an exact Québec package title or an OQLF product entry. Keep independent Québec wording review open. Do not add `farine de canihua`: no reviewed Québec product label attests that compound [S02, S04].

This standalone flour review is not already disposed by nearby work. The earlier A6 quinoa/amaranth proposal cites kaniwa only to keep it off quinoa-flour aliases; it does not evaluate a kaniwa-flour row. The WP03 kaniwa proposal is scoped to whole seeds and explicitly excludes flour. R135 holds isolated kaniwa starch and calls flour a separate material; it does not hold or allocate the flour identity. R151 and R152 cover brown teff flour and sorghum-flour aliases respectively, and leave the A6 parent open [A1–A5].

## Product and naming boundary

| Material or wording | Decision | Source boundary |
|---|---|---|
| `kaniwa flour / farine de kaniwa` | Add a distinct identity-only flour reference. | Port Royal Mills lists Canihua and offers flour milling for listed whole grains; Villa Andina lists a canihua flour format; Metro lists organic kaniwa flour as one component of a composite flour. None is a current standalone Canadian kaniwa-flour bag [S01, S03–S04]. |
| `canihua flour` | Add as the sole English alias. | Canihua is the Canadian mill’s listed grain name; current indexed exporter and Canadian retailer records use the qualified flour phrase. Accent-folded `cañihua flour` will match this alias without a duplicate orthographic alias [S01, S05–S06]. |
| `farine de kaniwa` | Use as the French display, with the stated review boundary. | OQLF prefers `kaniwa` and `canihua` for the grain. The reviewed Québec grocery listing names kaniwa flour in English in a mixed product, but does not attest the exact French compound. This display is a transparent construction, not a source-quoted package name [S02, S04]. |
| `farine de canihua` | Do not store. | This would be a second French construction without a reviewed Québec label. Keep the canonical OQLF-preferred `kaniwa` in the display [S02]. |
| Kaniwa seeds | Keep `ingredient-ref-kaniwa` unchanged. | Existing bilingual seed identity remains `kaniwa seeds / graines de kaniwa`, with French alias `canihua`. Flour is a milling product, not a dry/cooked seed form [A2]. |
| Quinoa and quinoa flours | Keep separate. | OQLF identifies kaniwa as *Chenopodium pallidicaule* and quinoa as a different plant; the generic, color-qualified, and roasted quinoa-flour rows remain unchanged [S02, A1]. |
| `baby quinoa` / `bébé quinoa` | Exclude from aliases. | OQLF discourages French `bébé quinoa` because it can confuse kaniwa with quinoa. A `baby quinoa flour` alias would also insert kaniwa into broad quinoa searches [S02, A2]. |
| Isolated kaniwa starch | Keep the existing R135 hold unchanged. | The R135 review concerns laboratory-isolated starch, not flour. This proposal does not reopen its product boundary [A4]. |
| Whole-grain, toasted, roasted, or puffed flour | Add no separate qualified identity or alias. | Port Royal’s milling statement describes supplier capability; it does not define a universal flour grade or standardized process. Villa Andina lists grain, flour, flakes, and puffed canihua as separate formats but does not make these flour qualifiers [S01, S03]. |

## Complete proposed reference delta

If accepted, append this one row to the reference catalog. Do not change the existing kaniwa seed row.

~~~json
{
  "id": "ingredient-ref-kaniwa-flour",
  "nameFr": "farine de kaniwa",
  "nameEn": "kaniwa flour",
  "aliasesFr": [],
  "aliasesEn": ["canihua flour"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
~~~

Do not add `baby quinoa flour`, `quinoa flour`, `farine de quinoa`, `farine de canihua`, `whole-grain kaniwa flour`, or process and brand terms as aliases. The source-supported English alias is a qualified name; no bare cross-product alias is needed.

## Exact ownership, IDs, and archive audit

The live read-only snapshot contains **1,522 ingredient references, 119 forms, 61 legacy-import candidates, and 1,867 research-ledger records**. Exact phrase ownership was compared after applying the same lowercase, NFKD accent-folding, punctuation removal, and whitespace normalization used by [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Exact normalized phrase or ID | Current owner |
|---|---|
| `kaniwa flour` | None |
| `canihua flour` | None |
| `farine de kaniwa` | None |
| `farine de canihua` | None |
| `kaniwa seeds` | `ingredient-ref-kaniwa` English display |
| `graines de kaniwa` | `ingredient-ref-kaniwa` French display |
| `canihua` | `ingredient-ref-kaniwa` French alias |
| `quinoa flour` | `ingredient-ref-quinoa-flour` English display |
| `baby quinoa`; `bébé quinoa` | None; both remain excluded |
| `ingredient-ref-kaniwa-flour` | Absent from references, forms, legacy candidate IDs, and ledger record IDs |

No active form is attached to `ingredient-ref-kaniwa`. The 61 legacy candidates contain no exact proposed name or proposed reference ID. The complete ledger currently has 7,894 source entries and 6,749 distinct source IDs; neither the proposed R153 prefix nor any of S01–S06 occurs there. An archive scan of proposal and batch Markdown found only the existing grain decision, the A6 quinoa-alias boundary, the B3 starch hold, and related cross-references; none reviews or holds a standalone A6 kaniwa-flour identity. No prior document owns the proposed reference ID or source prefix. The complete archive check also covered the [WP02 A6 quinoa/amaranth flour proposal](wp02-a6-quinoa-amaranth-flour-identity-review-20261011.md), [WP03 kaniwa-seed proposal](wp03-section-f-kaniwa-grain-identity-review-20261012.md), [R135 kaniwa-starch proposal](wp02-section-04-b3-next-gap-review-r135-20261015.md), and [R151](../batches/wp02-wp03-wp04-r151-gap-review-integration-20261015/README.md) and [R152](../batches/wp02-wp03-wp04-r152-gap-review-integration-20261015/README.md) integration READMEs [A1–A5].

## Picker projection

This is a static data projection using the phrase-first search behavior in `IngredientSearch.kt`, over current references and forms plus the proposed row. It is not runtime picker testing.

| Query | Current result | Projected result if accepted |
|---|---|---|
| `kaniwa flour` | None | Kaniwa flour only |
| `canihua flour` | None | Kaniwa flour only |
| `farine de kaniwa` | None | Kaniwa flour only |
| `cañihua flour` | None | Kaniwa flour only; accent-folded to `canihua flour` |
| `kañiwa flour` | None | Kaniwa flour only; accent-folded to `kaniwa flour` |
| `kaniwa` | Kaniwa seeds | Kaniwa seeds + kaniwa flour |
| `canihua` | Kaniwa seeds | Kaniwa seeds + kaniwa flour, because it is a word in the new alias |
| `graines de kaniwa` | Kaniwa seeds | Kaniwa seeds only |
| `quinoa` | 10 quinoa-family references | Same 10; no kaniwa result is introduced |
| `quinoa flour` | 5 quinoa-flour references | Same 5 |
| `baby quinoa`; `bébé quinoa` | None | None |
| `farine de canihua` | None | None |

Do not add the bare `canihua` phrase to the flour row merely to affect search; it already belongs to the seed row, and the proposed qualified alias intentionally makes the broader search show both products. Do not add `baby quinoa` or `bébé quinoa`; the picker’s phrase search would otherwise leak kaniwa into generic quinoa searches.

## Manifest recipe and corpus demand

The manifest lists **114 recipe files and 1,123 ingredient rows**. A read-only scan of every manifest-listed JSON file, every ingredient row, and all serialized recipe text found:

- zero text or ingredient-row occurrences for `kaniwa`, `canihua`, `cañihua`, `kañiwa`, *Chenopodium pallidicaule*, `baby quinoa`, `bébé quinoa`, `kaniwa flour`, `canihua flour`, `farine de kaniwa`, or `farine de canihua`;
- zero ingredient links to `ingredient-ref-kaniwa` and no link to the proposed ID.

The manifest-ordered corpus snapshot used for that scan is **753,928 bytes**, SHA-256 **`0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`**. The fingerprint hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order. No recipe addition, relink, or amount is proposed; unrelated quinoa recipe demand does not imply kaniwa demand.

## Forms, measures, conversions, yields, and substitutions

- **Forms:** Add none. Flour is an independently named milling product, not a user-facing form of the intact seed. No dry/cooked or puffed kaniwa form is established for this flour row.
- **Household measures and density:** No source supplies a flour-specific mass-volume pair, measured bulk density, or household serving. Metro’s 500 g is the entire composite flour package, not the mass of its kaniwa ingredient. The OCIA 25 kg / 50 kg figures are exporter bag sizes, not recipe portions. Keep `defaultDensity` null and add no unit mapping.
- **Existing seed quantity:** The grain ledger’s Yupik observation is a product-specific 1/2 cup (100 g) serving for raw whole kaniwa seeds. It cannot be transferred to flour, and its cooking-water guidance is also seed-specific [A2].
- **Conversions and yields:** Add no volume-to-mass conversion, milling yield, cooking yield, package yield, or seed-to-flour conversion. The supplier and exporter listings do not quantify these relationships.
- **Substitutions:** Add none. Metro’s composite-flour description gives broad wheat-replacement marketing language without a recipe ratio or adjustment; Villa Andina describes canihua as an alternative to quinoa for product developers, not a tested kitchen replacement. Neither supports a global or contextual substitution rule. Keep this distinction from the held starch research [S03–S04, A4].

## Source register

Sources were checked on 2026-10-15. Source IDs are local to this proposal; if accepted, the complete proposed ledger record below registers these IDs once on the new flour record.

| Source ID | Source and bounded evidence |
|---|---|
| **WP02-A6-KANIWA-FLOUR-R153-20261015-S01** | Port Royal Mills, [Seeds & Products](https://www.portroyalmills.com/seeds/), current ©2026 page. The whole-grain list includes Canihua; the introductory text says listed products can be milled in forms including whole-grain flour; the page identifies the Port Perry, Ontario facility. This is Canadian mill capability and product-class evidence, not a standalone SKU, current inventory, or Canadian-grown-origin claim. |
| **WP02-A6-KANIWA-FLOUR-R153-20261015-S02** | Office québécois de la langue française, [kaniwa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532687/kaniwa), last updated 2015. Identifies *Chenopodium pallidicaule*, prefers French `kaniwa` and `canihua`, lists English variants including `kaniwa`, `canihua`, `cañihua`, and `kañiwa`, and discourages French `bébé quinoa` because quinoa comes from a different plant. The entry names the grain, not flour. |
| **WP02-A6-KANIWA-FLOUR-R153-20261015-S03** | Villa Andina, [Andean Grains](https://www.villaandina.com/granos-andinos), current page, ©2025. Lists canihua grains, powder, flakes, and puffed canihua; its product description identifies *Chenopodium pallidicaule* and says canihua is offered in grain, flour, flake, and puffed formats. This is Peruvian exporter product-class evidence, not Canadian or Québec availability, consumer packaging, or French naming. |
| **WP02-A6-KANIWA-FLOUR-R153-20261015-S04** | Metro, [GoGo Quinoa Organic All Purpose Flour, 500 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-tout-usage-biologique/p/896899000449), current Québec-facing grocery listing, accessed 2026-10-15. The page identifies the 500 g composite product, describes milling quinoa, kaniwa, and rice into a fine powder, lists organic kaniwa flour and organic quinoa flour as ingredients, and reported out of stock at the selected store. The original French product URL redirected to the English page in this check. This is a mixed-flour ingredient statement, not a standalone kaniwa-flour package or an exact French display. |
| **WP02-A6-KANIWA-FLOUR-R153-20261015-S05** | OCIA, [2026 certified operations list](https://ocia.org/wp-content/uploads/2026/04/rtpo_certified.pdf), updated April 2026. The indexed listing names `Cañihua Flour / Harina de Cañihua` in 25 kg and 50 kg bags under a Peruvian operator. The source is a certification inventory, not a Canadian listing, product label, Québec French term, or household measure; direct PDF retrieval timed out in this review, so it is corroboration only. |
| **WP02-A6-KANIWA-FLOUR-R153-20261015-S06** | Naturitas Canada, [Schnitzer Active Mineral fermented rice bread](https://www.naturitas.ca/catalog/product/view/id/96941/), current Canadian-facing retailer search listing, checked 2026-10-15. The indexed ingredient text names organic canihua flour at 15% in a finished bread. Direct page retrieval returned a cache miss; this snippet corroborates the qualified English wording only and does not establish current stock, a standalone flour SKU, processing details, or a replacement ratio. |

## Complete proposed ledger delta

If accepted, append this new identity record. Keep the existing grain ledger record and its seed-specific observation unchanged. There are no measurement observations or substitution findings for kaniwa flour.

~~~json
{
  "recordId": "ingredient-ref-kaniwa-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-A6-KANIWA-FLOUR-R153-20261015-S01",
      "url": "https://www.portroyalmills.com/seeds/",
      "title": "Port Royal Mills, Seeds & Products",
      "versionOrDate": "Current page, copyright 2026",
      "accessedOn": "2026-10-15",
      "locator": "Whole Grains list includes Canihua; introductory milling statement; Port Perry, Ontario contact footer.",
      "supports": "A current Ontario mill lists Canihua among whole grains and says listed products can be milled as whole-grain flour. Supports a Canadian commercial milling route and the market spelling Canihua, not a standalone SKU, stock guarantee, or Canadian-grown origin.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-KANIWA-FLOUR-R153-20261015-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532687/kaniwa",
      "title": "Office québécois de la langue française, kaniwa (GDT)",
      "versionOrDate": "Last updated 2015",
      "accessedOn": "2026-10-15",
      "locator": "Definition, preferred French terms, English term list, and discouraged term.",
      "supports": "Identifies Chenopodium pallidicaule, prefers French kaniwa and canihua, lists English spelling variants, and discourages bébé quinoa because it can confuse kaniwa with quinoa. This is grain terminology, not an OQLF flour compound.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-A6-KANIWA-FLOUR-R153-20261015-S03",
      "url": "https://www.villaandina.com/granos-andinos",
      "title": "Villa Andina, Andean Grains",
      "versionOrDate": "Current page, copyright 2025",
      "accessedOn": "2026-10-15",
      "locator": "Canihua portfolio and product description.",
      "supports": "Lists canihua grains, powder, flakes, and puffed canihua; identifies Chenopodium pallidicaule and offers canihua in grain, flour, flake, and puffed formats. Supports the species-to-flour product class, not Canadian/Québec availability or French consumer terminology.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-KANIWA-FLOUR-R153-20261015-S04",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-tout-usage-biologique/p/896899000449",
      "title": "Metro, GoGo Quinoa Organic All Purpose Flour, 500 g",
      "accessedOn": "2026-10-15",
      "locator": "Current product listing; product description, ingredient list, package heading, and selected-store availability.",
      "supports": "A Québec-facing grocery listing describes a composite flour made from quinoa, kaniwa, and rice, lists organic kaniwa flour as an ingredient, and reports out of stock at the selected store. It corroborates Canadian retail use of the flour ingredient name but is not a standalone kaniwa-flour package or a French compound label.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-KANIWA-FLOUR-R153-20261015-S05",
      "url": "https://ocia.org/wp-content/uploads/2026/04/rtpo_certified.pdf",
      "title": "OCIA, 2026 certified operations list",
      "versionOrDate": "Updated April 2026",
      "accessedOn": "2026-10-15",
      "locator": "Indexed Peruvian operator listing for Small Grains, Cañihua Flour / Harina de Cañihua, 25 kg and 50 kg bags.",
      "supports": "Corroborates an exporter product class and Spanish paired wording. It is a certification inventory, not Canadian availability, a Québec French label, or a household measure; direct PDF retrieval timed out in this review.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-KANIWA-FLOUR-R153-20261015-S06",
      "url": "https://www.naturitas.ca/catalog/product/view/id/96941/",
      "title": "Naturitas Canada, Schnitzer Active Mineral fermented rice bread",
      "accessedOn": "2026-10-15",
      "locator": "Indexed Canadian-facing retailer ingredient text for the finished bread.",
      "supports": "The indexed listing names organic canihua flour at 15% in a finished bread. Direct page retrieval returned a cache miss; this is corroborative product wording only, not evidence of a standalone flour, current stock, or substitution ratio.",
      "sourceKind": "other"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only kaniwa flour / farine de kaniwa as a FLOUR_AND_STARCH reference for flour made from Chenopodium pallidicaule. Port Royal Mills provides current Ontario milling capability for listed Canihua grain, and Villa Andina lists canihua flour as a product format; the Canadian/Québec mixed-flour listing corroborates kaniwa flour as a food ingredient. Use canihua flour as the sole English alias. The French display is a transparent construction from the OQLF-preferred grain term kaniwa, not an exact Québec package title or OQLF flour entry; keep independent Québec wording review open. Keep whole kaniwa seeds, quinoa, and isolated kaniwa starch separate. Add no forms, household measures, density, unit mappings, conversions, yields, recipe links, or active substitutions.",
      "sourceIds": [
        "WP02-A6-KANIWA-FLOUR-R153-20261015-S01",
        "WP02-A6-KANIWA-FLOUR-R153-20261015-S02",
        "WP02-A6-KANIWA-FLOUR-R153-20261015-S03",
        "WP02-A6-KANIWA-FLOUR-R153-20261015-S04",
        "WP02-A6-KANIWA-FLOUR-R153-20261015-S05",
        "WP02-A6-KANIWA-FLOUR-R153-20261015-S06"
      ]
    }
  ]
}
~~~

## Proposal-local checks and handoff

- Static ownership and picker projections were computed from the current reference/form files and the proposed row; exact name and ID ownership is reported above.
- The full manifest-listed recipe corpus was scanned read-only; no recipe or catalog demand was found.
- Proposed source IDs and their prefix were absent from the current ledger and proposal/batch archive before drafting. No source IDs from prior reviews are reused in the proposed ledger record.
- After writing, check this Markdown file for UTF-8 without BOM, whitespace and mojibake, JSON validity in both deltas, and resolved local links. The only write for this task is this proposal file.
- No Gradle, unit, instrumentation, emulator, app, or deployment tests are in scope. This is a proposal-only documentation change; no database JSON was changed.

Sources: [Port Royal Mills](https://www.portroyalmills.com/seeds/) · [OQLF kaniwa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532687/kaniwa) · [Villa Andina](https://www.villaandina.com/granos-andinos) · [Metro](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-tout-usage-biologique/p/896899000449) · [OCIA 2026 list](https://ocia.org/wp-content/uploads/2026/04/rtpo_certified.pdf).

[A1] [Prior WP02 A6 quinoa/amaranth flour review](wp02-a6-quinoa-amaranth-flour-identity-review-20261011.md) · [A2] [WP03 kaniwa seed review](wp03-section-f-kaniwa-grain-identity-review-20261012.md) and [integration README](../batches/wp03-wp04-kaniwa-atlantic-wolffish-integration-20261012/README.md) · [A3] [R135 WP02 B3 kaniwa-starch hold](wp02-section-04-b3-next-gap-review-r135-20261015.md) and [hold integration README](../batches/wp02-section-04-b3-kaniwa-starch-product-hold-integration-r135-20261015/README.md) · [A4] [R151 integration README](../batches/wp02-wp03-wp04-r151-gap-review-integration-20261015/README.md) · [A5] [R152 integration README](../batches/wp02-wp03-wp04-r152-gap-review-integration-20261015/README.md).
