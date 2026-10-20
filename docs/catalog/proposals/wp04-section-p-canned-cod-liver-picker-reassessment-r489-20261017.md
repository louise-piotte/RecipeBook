# WP04 Section P R489 — canned cod-liver picker reassessment

- **Review and source-access date:** 2026-10-17.
- **Candidate:** canned cod liver / foie de morue en conserve, with the Mayrand product phrases cod liver in own oil / foie de morue dans son huile as search aliases.
- **Recommendation:** Advance one identity-only, species-neutral PROTEIN reference for canned cod liver. Add no form, measure, recipe link, numeric observation, conversion, yield, or substitution.
- **Proposal-only status:** This is the only proposed file change. No shared catalog JSON, research ledger, plan, roadmap, generated data, recipe, or code was edited. No tests were run.
- **Conditional test requirement:** If accepted as a data-only addition to the catalog and ledger JSON, no software tests are required under AGENTS.md. This proposal itself changes documentation only.

## Why this is a reconsideration

The earlier [R69 review](wp04-section-p-canned-cod-liver-product-boundary-review-20261013-round69.md) and its [integration hold](../batches/wp04-section-p-canned-cod-liver-boundary-hold-integration-20261013/README.md) kept the Tousain cod-liver product inactive. At that time, adding its exact name would have made the broad picker searches liver and foie each return only this one specialized fish-organ product. The bundle also had no recipe demand.

The picker state has since changed. The accepted [R404 proposal](wp04-section-p-next-seafood-gap-review-r404-20261017.md) added identity-only steamed monkfish liver / foie de baudroie cuit à la vapeur, with ankimo as its only alias. The [R403–R405 integration](../batches/wp02-wp04-wp06-r403-r405-gap-review-integration-20261017/README.md) records that liver and foie each return this one qualified row. R489 rechecks the old picker concern against that new active owner; it does not reopen or revise R404.

Now a canned cod-liver row would change liver and foie from one specialized result to two distinctly named product results: steamed monkfish liver and canned cod liver. Each displayed name tells the user which fish-organ product it is. This is useful disambiguation: the picker would expose two selectable, qualified choices instead of letting the sole ankimo row appear to represent all liver. It still would not establish generic liver coverage or resolve a recipe that only says “liver”; no unqualified liver or foie alias is proposed.

R483 concerns generic fish-burger wording, R480 concerns lobster meat, and R486 concerns coconut shrimp. Those recent Section P reviews remain separate identities or boundaries and do not own this cod-liver product. Section P remains open.

## Product and Québec naming evidence

Mayrand lists the Tousain item in its canned-fish category as Cod Liver in Own Oil / Foie de morue dans son huile. The English and French pages show the same product number 19904, unit UPC 060897022851, a 115 g unit, and a 12 × 115 g case. When checked on 2026-10-17, Mayrand showed it in stock at four Québec stores. The paired locale pages are evidence for one SKU, not two independent products. Stock is transient. The retailer pages do not provide an ingredient declaration, a cod species or binomial, drained liver mass, serving size, or a view of the package label.

The OQLF GDT entry identifies foie de morue as the preferred Québec French term in the food/fish-product domain and pairs it with English cod liver. Its note says cod livers can be salted and canned, with or without sauces or spices, and can also be made into paste or cod-liver meal. It distinguishes the organ from oil extracted from it. The record was last updated in 1983; it supports the Québec head term and the broad canned-product boundary, not the Mayrand SKU’s composition, current availability, species, or amounts. The proposed French display adds the ordinary state descriptor en conserve to the OQLF term; the exact Québec retailer phrase remains available as an alias.

ILIOS Foods’ bilingual catalog separately lists Foie de morue / Cod Liver, product 3552BF, packed 11 × 121 g and imported from Norway. This supports another commercial listing for the bilingual product name. The catalog does not identify the fish species, ingredients, drained quantity, serving size, or recipe use.

## Proposed bounded catalog delta

Add only this ingredient reference:

    {
      "id": "ingredient-ref-canned-cod-liver",
      "nameFr": "foie de morue en conserve",
      "nameEn": "canned cod liver",
      "aliasesFr": ["foie de morue dans son huile"],
      "aliasesEn": ["cod liver in own oil"],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-17T00:00:00Z",
      "category": "PROTEIN"
    }

The exact oil-packed wording is included only as a source-attested product-name search alias for the Mayrand item. It does not claim that every canned cod-liver product is packed in oil. Keep extracted cod-liver oil and other fish oils separate. Do not add aliases for cod, morue, liver, foie, fish liver, roe, salt cod, canned fish, or cod-liver oil.

The identity describes the canned food product itself, so add no reusable canned, oil-packed, salted, or prepared form. Do not assign Atlantic cod, Pacific cod, Arctic cod, or another species from the product name. Do not connect it to cod flesh, other fish livers, animal liver, roe, fish-liver meal, or paste.

If accepted, add a single ingredient-reference ledger record for ingredient-ref-canned-cod-liver with identityState verified, measurementState researched_no_supported_value, and substitutionResearchState not_yet_researched. Register proposal-local sources S01–S04 below. Add no measurement observation, recipe-line link, active measure, density, unit mapping, package yield, conversion, form, or substitution rule. A product-specific 115 g package quantity is not a reusable ingredient amount.

## Live ownership, archive, and source-ID audit

The workspace snapshot contains **1,762 active ingredient references**, **143 forms**, **56 legacy-import candidates**, and **2,121 research-ledger records** with **9,688 source entries**, **8,220 distinct source IDs**, and **6,933 distinct source URLs**.

| Surface | Current owner or overlap | R489 disposition |
|---|---|---|
| Active references | No active reference ID, display name, or alias exactly owns ingredient-ref-canned-cod-liver, canned cod liver, cod liver, cod liver in own oil, foie de morue, foie de morue en conserve, or foie de morue dans son huile. The active steamed monkfish-liver row is a distinct, qualified product. | Add one product identity with only the exact Mayrand phrases as aliases. Leave the R404 row unchanged. |
| Active forms | No form ID, bilingual label, or match term exactly owns a canned cod-liver phrase. The R404 monkfish-liver reference has no attached form. | Add no form; the reviewed product state is part of this product identity. |
| Legacy candidates | Exact normalized checks across all 56 candidates found no identity or phrase owner. | Add no legacy mapping. |
| Research ledger | No record ID or canonical identity owns the proposed reference or exact cod-liver product phrases. The R404 steamed monkfish-liver record remains active and includes the product-specific 20 g ramen observation; that value does not apply to cod liver. The Mayrand EN/FR URLs, OQLF GDT URL, and ILIOS catalog URL have no exact ledger URL owner. | Create one identity record only if accepted; use the proposal-local source IDs below. |
| Numeric and substitution data | The package-yield file contains one unrelated record. Global and contextual substitution-rule files contain zero rules. No active measure, form, density, unit mapping, package yield, or conversion is owned by this candidate. | Add none. |
| Prior reviews | R69 reviewed this same Tousain product and held it because liver and foie each had a singleton result. The R69 integration accepted that hold. R404 later added the distinct ankimo row, changing the current broad-query owner set. | Treat R489 as a picker reassessment triggered by R404, not as a claim that cod liver was never reviewed. |
| Proposed IDs and source prefix | The proposed reference ID, proposal path, and source-ID prefix WP04-SECTIONP-CANNED-COD-LIVER-R489-20261017 were absent from active data, ledger entries, and the proposal/batch archive at review time. | Keep IDs and sources proposal-local until root review. |

The picker audit follows the current accent-folding, punctuation-normalizing, phrase-first and substring-fallback behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical row above was projected without adding it to active data:

| Query | Current picker owners | With the proposed row |
|---|---|---|
| canned cod liver; foie de morue en conserve; cod liver; foie de morue | None | Proposed canned cod liver row only |
| cod liver in own oil; foie de morue dans son huile | None | Proposed row only through the exact product-name aliases |
| liver; foie | R404 steamed monkfish liver / foie de baudroie cuit à la vapeur | Same R404 row plus canned cod liver / foie de morue en conserve |
| cod; morue | Six rows: Arctic cod / morue polaire; Atlantic cod / morue de l’Atlantique; Pacific cod / morue du Pacifique; sablefish / morue charbonnière; salt cod / morue salée; smoked cod / morue fumée | Those same six plus the proposed canned cod-liver row |
| cod liver oil; huile de foie de morue | None | None; neither extracted-oil phrase is a proposed name or alias |
| fish liver | R404 steamed monkfish liver, through existing substring fallback on monkfish liver | Unchanged; no fish liver alias is added |

The one-result broad liver and foie searches today are already specific because of R404. R489 would make each a two-row picker list with the state and fish-organ product visible in both labels. It would not add a catch-all liver result, imply that the two rows exhaust fish or animal livers, or settle a generic recipe instruction. The cod and morue searches remain multi-result before and after.

## Bundled recipe demand

The audit parsed every manifest-listed recipe in manifest order: **114 recipe files and 1,123 structured ingredient rows**. Full recipe JSON and every ingredient row were checked for cod liver, canned cod liver, cod liver in own oil, foie de morue, foie de morue en conserve, foie de morue dans son huile, cod liver oil, huile de foie de morue, fish liver, foie de poisson, and the broader cod, morue, liver, and foie phrases. There were **zero matching recipe files and zero matching ingredient rows**. No recipe link, relink, recipe-derived amount, or substitution context is supported by the bundled corpus.

The recipe files total **753,988 bytes**. The manifest-ordered digest, computed from each manifest-relative path, a NUL separator, its exact file bytes, and a trailing NUL separator, is 847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e.

## Numeric, species, and substitution limits

- **Product quantity:** Mayrand’s 115 g unit and 12 × 115 g case are package quantities. The listing does not establish drained liver mass or a reusable edible amount. Do not infer a serving, household measure, count conversion, density, edible yield, or package yield.
- **Species:** The Mayrand product pages do not name a species or binomial. Retain cod as the market-name wording and leave the cod-liver product species-neutral.
- **Oil boundary:** “In own oil” is the Mayrand product name for the liver product’s presentation. It is not evidence that the product is extracted cod-liver oil; OQLF treats cod liver and cod-liver oil as distinct terms and products. Add no cod-liver-oil alias or mapping.
- **Forms and preparation:** Do not infer the product’s exact cooking, salting, sauce, spice, draining, or ready-to-eat details from the name. The OQLF note describes possible cod-liver treatments generally, while Mayrand does not publish a full ingredient or preparation label.
- **Substitutions:** Add no rule between canned cod liver, cod flesh, other fish livers, monkfish liver/ankimo, animal liver, roe, cod-liver oil, fish-liver meal, or another canned fish. Product-name similarity does not establish interchangeable amounts, roles, or methods. No focused substitution-source review was conducted, so keep substitution research open.

## Sources and limits

Sources were accessed or rechecked on 2026-10-17. IDs are local to this proposal and have not been written to the shared ledger. The Mayrand English and French pages are paired locale pages for the same SKU.

| Source ID | Source and evidence | Limits |
|---|---|---|
| WP04-SECTIONP-CANNED-COD-LIVER-R489-20261017-S01 | Office québécois de la langue française, [GDT: foie de morue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488144/foie-de-morue). Preferred Québec term, food/fish-product domain, English cod liver, canned/salted treatments and distinction from extracted oil. | Last updated in 1983. Supports terminology and possible product states; does not identify a commercial SKU, species, ingredients, availability, or amount. |
| WP04-SECTIONP-CANNED-COD-LIVER-R489-20261017-S02 | Mayrand Québec, [Foie de morue dans son huile 115 g](https://mayrand.ca/fr/nos-produits/epicerie/poisson-et-viande-en-conserve/poisson-en-conserve/foie-de-morue-dans-son-huile-tousain-19904), Tousain item 19904. Names the product, places it under canned fish, and lists the unit/case quantity and UPC. | Retail listing, not a complete package label; no species, ingredient declaration, drained weight, or reusable measure. Stock changes. |
| WP04-SECTIONP-CANNED-COD-LIVER-R489-20261017-S03 | Mayrand, [Cod Liver in Own Oil 115 g](https://mayrand.ca/en/our-products/grocery/canned-fish-and-meat/canned-fish/foie-de-morue-dans-son-huile-tousain-19904), the paired English page for S02. | Same Tousain SKU as S02, not independent product evidence; same label and numeric limits. |
| WP04-SECTIONP-CANNED-COD-LIVER-R489-20261017-S04 | ILIOS Foods, [2026 bilingual product catalog PDF](https://www.iliosfoods.ca/_files/ugd/7a4ac1_5fbfe6e609ab4310b481cac160c57337.pdf), page 33, product 3552BF. Lists Foie de morue / Cod Liver, 11 × 121 g, imported from Norway. | Commercial catalog entry only; it does not name the fish species or provide ingredient, drained-weight, serving, or conversion details. Its pack format is SKU-specific. |
| WP04-SECTIONP-CANNED-COD-LIVER-R489-20261017-R01 | Read-only audit of the [current Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt), active references and forms, legacy candidates, research ledger, product-yield and substitution files, proposal/batch archive, [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and all manifest-listed recipes. | Records the workspace snapshot, exact-owner and source-ID review, picker projection, and corpus scan. It does not establish product facts beyond the linked sources. |

## Final disposition

**Advance** identity-only canned cod liver / foie de morue en conserve with only the two exact Mayrand product-name aliases shown above. This reopens the old picker concern because the active R404 monkfish-liver identity means broad liver and foie searches now present two clearly labelled seafood-organ products rather than making cod liver appear to be the only liver result, as in R69’s earlier projection. Keep the row species-neutral, keep extracted cod-liver oil separate, and add no form, numeric behavior, recipe link, or substitution. Section P remains open.
