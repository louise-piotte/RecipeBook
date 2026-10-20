# WP03 Section I — Bunya nut identity review

- **Reviewed:** 2026-10-12
- **Status:** proposal only; recommend an identity-only addition. No shared catalog, ledger, recipe, plan, roadmap, batch, code, or test file was changed.
- **Candidate:** bunya nuts / noix de bunya, the edible seed/kernel of *Araucaria bidwillii*
- **Scope:** one uncovered regional culinary kernel in the open Section I seed-identity item. This review does not model bunya flour/meal, paste, prepared dishes, tree material, or planting seed.
- **Testing:** no tests or emulator work; proposal-only research.

## Recommendation

Add one identity-only reference for the edible seed/kernel of *Araucaria bidwillii*, using **bunya nuts / noix de bunya**. The Queensland Museum identifies the Bunya Pine as *A. bidwillii* and describes its nuts as a traditional Indigenous food. Kew accepts the species. A current Australian specialist-food listing sells bunya nuts as a distinct food product, while a French-language source directly uses **noix de bunya** for the edible seeds. The French display is descriptive and provisional: the French source is not Québec-specific, and no OQLF, TERMIUM, or Canadian French food-label attestation was found in this review. [S01–S04, S07]

The candidate is clearly distinct from the existing generic pine-nut and generic-nuts identities. Do not alias it to **pine nuts / noix de pin**, **nuts / noix**, or the botanical name of the tree. Do not use **giant pine nut** as an alias: that phrase is a secondary descriptor in one source and would invite a false merge with the active pine-nut identity. [S01, S08]

Proposed identity fields:

| Field | Proposed value |
|---|---|
| ID | **ingredient-ref-bunya-nuts** — no current ID collision; proposed, not reserved |
| Category | **NUT_SEED_AND_DRIED_FRUIT** |
| English display | **bunya nuts** |
| French display | **noix de bunya** — provisional descriptive wording; not established as OQLF-preferred or Québec-market terminology |
| English alias | **bunya nut** |
| French aliases | none |
| Default density / unit mappings | none / empty |

This is a species-scoped food identity for the edible seed/kernel, not a botanical claim that the seed is a true nut. Do not add a form, recipe link, numeric catalog value, conversion, yield, or substitution from this review. The bundled corpus contains no bunya request.

## Section I and previous-coverage check

The plan keeps **additional melon-seed products and regional culinary kernels** open under Section I. Its existing identities and holds cover other named species, melon-market terms, and processed products; none establishes the *Araucaria bidwillii* kernel. This candidate does not reopen the held melon-seed products, ginkgo, candlenut, or already integrated seed identities. [S09]

Read-only searches of current proposal and batch files, the live plan, legacy identities, and research-ledger text found no prior bunya identity, alias, source, proposal, or hold. The exact search terms included **bunya**, **bunya nut(s)**, **bunya seed(s)**, **bunya kernel(s)**, **bunya pine**, **bunya-bunya**, **bonyi**, **noix de bunya**, **graine(s) de bunya**, **giant pine nut(s)**, and *Araucaria bidwillii*. The proposed source-ID prefix below is also unused. [S09]

## Live catalog and exact-key audit

Snapshot from the split bundled-library package and research ledger on 2026-10-12:

| Artifact | Live count | Candidate result |
|---|---:|---|
| Active ingredient references | 1,288 | No bunya identity or exact candidate name/alias owner |
| Active ingredient forms | 98 | No bunya form or exact candidate phrase |
| Legacy-import candidates | 64 | No bunya candidate ID, name, or alias |
| Research-ledger records | 1,596 | No bunya or *Araucaria bidwillii* occurrence in record IDs or serialized record text |
| Ledger source entries / distinct source IDs | 5,718 / 4,743 | No collision with `WP03-I-BUNYA-NUT-IDENTITY-20261012-S01` through `S08` |
| Manifest recipes / ingredient rows | 114 / 1,123 | No bunya recipe demand |

Exact-key checks used the repository’s `normalize_search_key` behavior across active reference IDs, names and aliases; form IDs, labels and match terms; legacy IDs, names and aliases; and ledger record IDs and text. No exact owner or ID collision was found for **bunya nuts**, **bunya nut**, **bunya seeds**, **bunya kernels**, **noix de bunya**, **graine de bunya**, **Araucaria bidwillii**, or `ingredient-ref-bunya-nuts`. The audit also searched boundary terms including **bunya pine**, **bunya-bunya**, **bonyi**, and **giant pine nut**; none is a current catalog or legacy key.

The neighboring exact owners remain separate: **pine nuts / noix de pin** is `ingredient-ref-pine-nuts`, **nuts / noix** is the species-unspecified `ingredient-ref-nuts`, and **pine nut butter / beurre de pignon de pin** is a processed product. The proposed **noix de bunya** is not an alias for any of them. Full-phrase matching does not return the generic `noix` row for `noix de bunya`; the candidate phrase currently has no picker owner. Keep the generic-nuts recipe rows species-unspecified.

The complete manifest-listed corpus was searched in each recipe file and each ingredient row using **bunya**, **bunya nut(s)**, **bunya seed(s)**, **bunya kernel(s)**, **bunya pine**, **bunya-bunya**, **bonyi**, **noix de bunya**, **graine(s) de bunya**, **giant pine nut(s)**, *Araucaria bidwillii*, and `A. bidwillii`. Result: **zero full-file hits and zero ingredient-row hits**. External recipe examples establish food-use context, not a linkable recipe in this bundled library. [S05]

## Identity and naming boundary

- **Species and edible part:** the proposed row names the edible seed/kernel of *A. bidwillii*. Kew accepts the species; Queensland Museum and the ABC’s Knowledge Holder account identify bunya nuts as food. The row must not include the tree, cone, bark, timber, or seed intended for propagation. [S01–S03]
- **English naming:** use **bunya nuts** as the display and **bunya nut** as the singular lookup alias, both directly attested in the Queensland Museum’s food-use page and specialist food listings. Do not add **bunya pine**, **bunya-bunya**, **bonyi**, or **giant pine nut** as product aliases; those describe the tree, use a culturally specific tree name, or risk collapsing this species into pine nuts. [S01, S04]
- **French naming:** **noix de bunya** is directly used for the edible seeds in a French-language educational source. Treat it as a provisional descriptive fr-CA display, not an OQLF recommendation or evidence of Québec retail usage. Do not add **noix de pin**, **pignon**, or an unverified scientific-name alias to its French lookup terms. OQLF’s existing pine-seed terminology belongs to the active pine-nut reference. [S07–S08]
- **Related plants:** do not generalize to all *Araucaria* species or merge with *Araucaria araucana* seeds (often called piñones or pehuén). Kew’s accepted-name record anchors this proposal to *A. bidwillii* only. [S01]
- **Preparation/products:** sources show roasted, boiled, fresh, shelled/dehusked, ground flour or meal, and puréed products. These are preparation or processing descriptions, not aliases for the base kernel. Leave forms and separate prepared-product identities for later source- and demand-led review. Do not treat the Queensland Museum’s educational description as a handling or food-safety standard. [S02, S04–S06]

## Recipe, measurements, and substitution boundaries

The live corpus has no bunya mention, so no recipe line, amount, preparation state, or role can be assigned. Do not link the existing generic “nuts” lines to this species.

External examples contain recipe-specific quantities: Northey Street City Farm gives one recipe **30–50 preboiled and shelled bunya nuts** and another **1 cup cooked and shelled bunya nuts**. Those values belong only to those named recipes and preparation states; they are not a count-to-mass relation, generic cup weight, density, or transferable kitchen measure. A supplier’s **100 g / 500 g** meal package options are package sizes, not recipe amounts, and the page marked them “Coming soon” when checked. No transferable bunya kernel mass/volume, density, shelling yield, cooking yield, unit mapping, conversion, or default measure is proposed. [S05–S06]

Natif Foods says to use its **bunya nut meal** like almond meal or pine nuts. That is a supplier statement about its ground product, with no tested amount, replacement ratio, recipe role, or adjustment guidance. It does not establish that whole bunya kernels substitute for almonds or pine nuts, or justify a global or contextual substitution rule. Keep substitutions unmodeled. [S06]

## Recommended integration delta

If accepted by the coordinator:

1. Add only `ingredient-ref-bunya-nuts` in `NUT_SEED_AND_DRIED_FRUIT`, with **bunya nuts / noix de bunya**, English alias **bunya nut**, no French aliases, null default density, and empty unit mappings. Keep the French display explicitly provisional pending Québec terminology review.
2. Add a verified identity-only ledger record with measurement state `researched_no_supported_value` and substitution state `researched_no_supported_substitute`; cite S01–S08 with their limits.
3. Add no form, recipe link, density, unit mapping, measurement observation, conversion, yield, or substitution. Keep the broader Section I seed/kernel and paste/butter checklist open.

## Source register

The source prefix below was checked against all live ledger source IDs and is unused. These IDs are proposal-local suggestions, not reserved ledger entries. Sources were checked on 2026-10-12.

| ID | Source and locator | What it supports and what it does not |
|---|---|---|
| **S01** | Kew Science, [Plants of the World Online: *Araucaria bidwillii*](https://powo.science.kew.org/taxon/urn%3Alsid%3Aipni.org%3Anames%3A261684-1), accepted-name and distribution fields. | Confirms *A. bidwillii* as an accepted species native to Queensland. It does not define a food name or food use. |
| **S02** | Queensland Museum, [Giant pine nut](https://www.museum.qld.gov.au/learn-and-discover/ask-an-expert/question-of-the-month/giant-pine-nut), answer to “Why is the Bunya nut important to the Indigenous community?” | Identifies Bunya Pine as *A. bidwillii*, describes its nuts as an Indigenous food source, and mentions raw, roasted, and flour uses. This educational page is not a preparation or safety standard; the phrase “giant pine nut” is not adopted as an alias. |
| **S03** | ABC News, [Bunya nuts — Deep Time Australia](https://www.abc.net.au/news/deeptime/bunya-nuts/), Knowledge Holder and food-source description. | Attributes the account to Shannon Bauwens, Bunya Burra I Wakka speaking people, and identifies bunya nuts as an important Indigenous food. The account is culturally situated evidence, not a general recipe or quantitative standard. |
| **S04** | Playing with Fire Native Foods, [Bunya Nuts](https://www.playingwithfire.com.au/shop-wholesale/p/bunya-nuts), product description and listed styles. | Current Australian specialist-food listing uses the product name and describes frozen/dehusked, roasted, sliced, puréed, and meal uses. It is supplier/product-state evidence, not a Canadian product label or Canadian availability claim. |
| **S05** | Northey Street City Farm, [Bunya Nut Recipes](https://www.nscf.org.au/bunya-nut-recipes/), recipe ingredient lines and method. | Names *A. bidwillii* and gives curry and pesto examples with preparation-specific quantities. The example quantities do not establish a transferable measure or conversion. |
| **S06** | NATIF Foods, [Bunya Nut Meal](https://natif.com.au/products/bunya-nut-meal), product name, ingredient statement, “How to Use,” package options and availability text. | Identifies a ground-nut meal product and gives supplier-use suggestions, including “just like Almond Meal or pine nuts.” This is a processed product, not a whole-kernel equivalence or validated substitution rule. Listed package sizes are not kitchen measures; the page showed “Coming soon” when checked. |
| **S07** | L’École Jardin-Forêt, [Bunya-Bunya, l’Araucaria](https://ecolejardinforet.fr/wp-content/uploads/2025/01/Bunya-Bunya-lAraucaria-bidwillii.pdf), p. 2. | Directly calls the edible seeds **“noix de bunya.”** This is French-language wording from outside Québec, not a Québec market label or OQLF/TERMIUM recommendation. |
| **S08** | Office québécois de la langue française, [*pignon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon), food terms and definition; compare the active `ingredient-ref-pine-nuts` identity. | Supports Québec French pine-seed wording such as `pignon` and `noix de pin`. It does not call bunya nuts pine nuts or establish a French name for *A. bidwillii*. |
| **S09** | [RecipeBook global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), Section I, and current WP03 Section I seed/kernel proposals and batches. | Confirms the regional-kernel checklist remains open and the candidate is not covered by the earlier identity and hold reviews. This is scope evidence, not botanical or culinary authority. |

No source-backed bunya measurement or tested substitution is transferred into catalog behavior. No tests or emulator checks were run because this packet is proposal-only work.
