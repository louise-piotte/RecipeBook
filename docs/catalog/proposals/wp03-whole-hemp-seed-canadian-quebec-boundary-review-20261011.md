# WP03 Section I — whole hemp seed boundary review

- **Reviewed:** 2026-10-11
- **Status:** Proposal only. No catalog, ledger, recipe, checklist, plan, roadmap, test, or generated file was changed.
- **Scope:** Reassess the held whole-hemp-seed candidate against the existing hulled-hemp-hearts identity. This packet does not revisit the accepted hearts wording or the flax/poppy decisions.
- **Method:** Read the live split seed package, recipe manifest and recipe files, legacy candidates, research ledger, and the earlier flax/hemp/poppy proposal. Checked current Canadian manufacturer, retailer, federal, and Québec terminology sources.

## Recommendation

**Accept one separate identity-only candidate for food-grade whole hemp seeds with the hull intact.** Canadian maker CanMar explicitly describes whole roasted hemp seed as intact and not hulled or shelled; a current Maxi French-language listing uses **“Graines de chanvre rôties entières”** for that product. This is enough to establish a distinct whole-seed product and a defensible provisional fr-CA display. It does not establish a general OQLF-preferred culinary term or support raw, viable, planting, or feed seed use.

| Proposed ID | English display | Provisional fr-CA display | Supported aliases | Category | Disposition |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-whole-hemp-seeds` | `whole hemp seeds` | `graines de chanvre entières` | EN: `whole hemp seed`, `whole roasted hemp seed`, `whole roasted hemp seeds`; FR: `graine de chanvre entière`, `graines de chanvre rôties entières` | `NUT_SEED_AND_DRIED_FRUIT` | Accept as a separate, food-only whole-seed identity. |

The French display is a source-grounded product name assembled from the exact Canadian retail wording **“Graines de chanvre rôties entières”** and the whole-seed wording in the product description. Treat it as a provisional fr-CA market label, not as an OQLF ruling. The OQLF entry supports **graine de chanvre** generically but does not define the culinary whole-seed product. [WS-S01–WS-S04]

## Product boundary and matching

CanMar describes its whole roasted seeds as retaining the shell: the seeds are not hulled or shelled, and are ready to eat. This is direct manufacturer evidence that the intact seed is a different product from the existing hemp hearts. The current Maxi product search separately lists CanMar’s **“Graines de chanvre rôties entières”** and products explicitly labelled **“Graines De Chanvre Décortiquées”** or **“Graines De Chanvre Crues Décortiquées Coeurs De Chanvre.”** The retailer evidence supports the French-market distinction; it does not make either retailer’s wording an official terminology ruling. [WS-S01–WS-S03]

Keep the boundary explicit:

- Map only a line that explicitly requests **whole** hemp seeds, or an exact whole-seed phrase above, to this candidate. A specifically hulled/hearts request remains with the existing `ingredient-ref-hemp-hearts` identity.
- Do not add unqualified `hemp seed(s)` or `graine(s) de chanvre` as aliases to either identity. Those phrases do not preserve the hull distinction and can refer to both products in retail usage.
- Do not add `chènevis` as an alias. OQLF defines it as a seed of hemp but places its entry in botanical, animal-feed, and fishing domains and notes its principal use as bird/livestock food or fishing bait. It is not evidence for a culinary whole-seed label. [WS-S04]
- Keep hemp oil, hemp protein, flour/meal, milled seed, beverages, seed butter, cannabis/planting seed, feed seed, and sprouting material outside this identity. In particular, do not infer the hull status of the hemp-seed butter held in the earlier paste-product review. [WS-S05]

The direct product evidence is for **roasted, whole, ready-to-eat** seeds. It supports accepting the whole-seed identity, but does not establish that unroasted/viable whole hemp seed is a food-grade product or authorize matching planting/feed material. CFIA’s broad nuts-and-seeds glossary includes hemp in the raw/roasted/seasoned/smoked seed group, but does not distinguish hull state; it is general classification context only. [WS-S01, WS-S02, WS-S06]

## Forms, numeric data, and recipe behavior

- Add no structured forms. The intact hull is part of this separate identity, so do not add a redundant `whole` or `unhulled` form under the whole-seed identity or attach it to hemp hearts. Keep roasting as a preparation detail, not a new row or conversion state. Do not model raw, milled, sprouted, viable, or seasoned variants from these sources.
- Adopt no serving size, package amount, nutrition value, density, household measure, unit mapping, yield, or mass/volume conversion. The sources provide no general whole-hemp-seed measurement conversion suitable for this catalog; these values remain unknown.
- Add no substitution rule between whole hemp seeds and hearts. Retained hull and the different texture/product descriptions establish a material product difference, but no safe recipe-level interchange ratio or substitution evidence was found.
- The live manifest contains 114 recipes. A full-text scan of their JSON found zero hemp/chanvre matches, so add no recipe links or recipe-line behavior now. If a future recipe explicitly says `whole hemp seeds` / `graines de chanvre entières`, it may be linked to this identity after confirming the line is for human food. A generic `hemp seeds` / `graines de chanvre` line remains unresolved; a hearts/hulled line remains with the existing hearts identity. Explicit raw, viable, planting, sprouting, or feed wording requires separate review.

## Live-package audit

Read-only snapshot on 2026-10-11:

- `ingredient-references.v1.json` has 969 records and exactly one hemp match: `ingredient-ref-hemp-hearts`, displayed as `hemp hearts` / `graines de chanvre décortiquées`.
- `ingredient-forms.v1.json` has 60 forms and no hemp/chanvre match. `legacy-import-identities.v1.json` has 75 candidates and no hemp/chanvre match.
- The research ledger has 1,242 records and exactly one hemp match: the existing hearts record. It contains no whole-hemp-seed research record.
- All 114 manifest-listed recipe files were scanned for hemp/chanvre terms; zero files, ingredient rows, and recipe links matched. This independently confirms the zero-demand finding in the earlier flax/hemp/poppy proposal.

The earlier proposal held whole hemp seeds because it did not yet have a clear Canadian culinary label. This follow-up changes only that held disposition. It leaves the verified hearts identity and its aliases untouched, and keeps the separate hemp-seed-butter question held. [Earlier review: `wp03-flax-hemp-poppy-seed-gap-review-20261010.md`; paste-product review: `wp03-nut-seed-paste-product-gap-review-20261010.md`]

## Source register

All pages were accessed on **2026-10-11**. Source IDs are local to this proposal and are not research-ledger source IDs.

| ID | Source | Direct evidence and limits |
| --- | --- | --- |
| WS-S01 | CanMar Foods, [The Roasted Hemp Difference](https://canmarfoods.com/the-roasted-hemp-difference/), product explanation. | Manufacturer says its roasted hemp seeds are whole and not hulled or shelled; it describes them as intact and ready to eat. Direct evidence for this maker’s whole roasted food product and hull boundary, not an independent terminology standard. |
| WS-S02 | CanMar Foods, [Hemp Products](https://canmarfoods.com/hemp-products/), whole-roasted and milled-roasted product descriptions. | Separates its whole roasted product from its milled roasted product and describes the whole item as ready to eat. Supports the product wording and exclusion of milled seed; no catalog measurement or nutritional data are adopted. |
| WS-S03 | Maxi, [French-language hemp-seed product listing](https://www.maxi.ca/fr/search?search-bar=Graines+de+chanvre), product titles in the search results. | Direct fr-CA retailer wording includes `CanMar Graines de chanvre rôties entières` and separately named hulled/hearts products. Retail display evidence only; stock, product details, and wording can vary by store. |
| WS-S04 | Office québécois de la langue française, [chènevis](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19481082/chenevis), GDT definition and domains. | Gives `chènevis` and `graine de chanvre` for a hemp seed generally. Its domains and note focus on botanical, animal-feed, and fishing uses; it does not establish a culinary whole-seed label or a hull distinction. |
| WS-S05 | RecipeBook, [nut/seed/paste product-gap review](wp03-nut-seed-paste-product-gap-review-20261010.md), hemp-seed-butter disposition. | Earlier proposal holds hemp-seed butter because its maker does not specify hull state. This review does not reopen that decision or infer butter scope from the whole-seed evidence. |
| WS-S06 | Canadian Food Inspection Agency, [Food Safety Supplemental Information glossary](https://inspection.canada.ca/en/about-cfia/my-cfia-account/user-guidance/supplemental-information-questionnaire/glossary-terms), “Nuts and seeds.” | Lists hemp among seed foods in a general raw/roasted/seasoned/smoked group. It does not distinguish whole from hulled seeds and does not provide the bilingual product term. |

**Proposed decision:** accept `whole hemp seeds / graines de chanvre entières` as a separate, identity-only food reference with the explicit whole-seed aliases above. Keep all numeric, measurement, form-conversion, substitution, and recipe-link fields empty or unknown; keep unqualified hemp-seed wording unresolved. Leave the existing hemp-hearts record and the separate hemp-butter hold unchanged.
