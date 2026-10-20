# WP03 Section I — Pili nut identity review

- **Reviewed:** 2026-10-12
- **Status:** proposal only; no shared catalog, ledger, recipe, plan, roadmap, or batch file was changed.
- **Candidate:** pili nuts / noix de pili, the edible kernel of *Canarium ovatum*
- **Scope:** one uncovered Section I species identity, exact active-name ownership, Québec and Canadian wording, source-specific product states, measurements, substitution evidence, and all manifest-listed recipe ingredient rows.
- **Testing:** no app tests or emulator work; this packet is proposal-only research.

## Recommendation

Accept an identity-only reference for **pili nuts / noix de pili**, scoped to the edible kernel of *Canarium ovatum*. The federal Translation Bureau standardizes the English and French pair “pili nut / noix de pili”; Agriculture and Agri-Food Canada records *pilinut* and *pili-nut* as English common names; and Health Canada’s current crop-name table maps *Canarium ovatum* to the French tree name *noyer de pili*. A Québec-facing product listing independently uses **Noix de pili**. The local listing is currently marked sold out, so it supports local wording, not present Québec inventory. [S01–S05]

Proposed identity fields:

| Field | Proposed value |
|---|---|
| ID | **ingredient-ref-pili-nuts** — currently unused; proposed, not reserved |
| Category | **NUT_SEED_AND_DRIED_FRUIT** |
| English display | **pili nuts** |
| French display | **noix de pili** |
| English aliases | **pili nut**; **pilinut** |
| French aliases | none |
| Default density / unit mappings | none / empty |

This is a species identity, not an identity for an activated, sprouted, salted, or dehydrated snack. Do not add a form, recipe link, package yield, conversion, or substitution. The available product pages describe different preparations, and the recipe corpus has no pili-nut demand.

## Checklist and previous-decision check

Section I still has an open item for additional melon-seed products and regional culinary kernels in the global plan at [lines 2391–2405](../../RecipeBook-global-ingredient-catalog-plan.txt#L2484). Pili is a distinct species-specific edible kernel, not another melon-seed or variable-blend case.

The related proposal and batch search found no earlier pili-nut identity, accepted decision, or held candidate. Searches covered **pili nut**, **pili nuts**, **pilinut**, **pili-nut**, **noix de pili**, **noyer de pili**, and **Canarium ovatum**. The only nearby term is OQLF’s **pili-pili**, which names a hot pepper and is not the nut. Recent adzuki, pea, peanut, and pecan work is complete and unrelated. Existing holds for candlenut, hemp-seed butter, and melon-seed/magaz products also concern different identities and remain untouched.

## Live catalog and ownership audit

Snapshot taken from the live split package and research ledger on 2026-10-12:

| Artifact | Live count | Candidate result |
|---|---:|---|
| Active ingredient references | 1,237 | No pili-nut identity; 42 pulse references and 49 nut/seed/dried-fruit references |
| Active ingredient forms | 86 | No pili form or exact pili phrase |
| Legacy candidates | 66 | No exact pili candidate name or alias |
| Research-ledger records | 1,536 | No record containing a pili-nut or *Canarium ovatum* candidate phrase |
| Ledger source entries / distinct source IDs | 5,306 / 4,348 | All eight proposal-local source IDs below are unused |
| Manifest recipes / ingredient rows | 114 / 1,123 | No recipe row requests pili nuts |

The ownership check used the repository’s **normalize_search_key** rules across active reference names and aliases, form labels and match terms, legacy names and aliases, and ledger text. It also simulated the live picker’s phrase-first and substring fallback for the proposed terms. The exact normalized keys **pili nuts**, **pili nut**, **pilinut**, **noix de pili**, **noyer de pili**, and **canarium ovatum** have no current owner or picker result. **pili-nut** normalizes to the same key as **pili nut**, so it should not be stored as a duplicate alias.

The existing **ingredient-ref-nuts / nuts / noix** entry is an intentionally species-unspecified group. Its recorded OQLF source **WP03-NUTS-20261009-S11** supports that generic group; it does not claim a named species. A query for the full pili-nut phrase currently does not resolve to that generic entry. Keep that boundary and do not change recipe **031#4**, whose “crushed nuts” line stays generic.

**ingredient-ref-pili-nuts** is unused in references and legacy IDs. No current ledger record contains any of the proposed product names. Proposed source IDs **WP03-I-PILI-IDENTITY-20261012-S01** through **S08** were checked against all 4,348 live source IDs and were absent. The existing generic-nuts source ID above is reused only for context; it is not duplicated in the proposal source register.

## Identity, terminology, and form boundary

- **Identity:** the food product is the edible seed/kernel marketed as a pili nut, scoped to *Canarium ovatum*. The English–French TERMIUM record supplies the exact identity terms. Kew accepts *C. ovatum* as a species native to the Philippines; Health Canada’s current crop-name table separately lists *Canarium vulgare* as **amandier de Java** and *Canarium indicum* as **nangaille**. Do not generalize the identity to the genus *Canarium* or alias Java almond/kenari or nangaille to it. [S01, S03, S04]
- **Québec French:** use **noix de pili** as the display. It is standardized in TERMIUM and appears in the Québec-facing ALOCAL product title. No OQLF pili-nut entry was located; OQLF’s separate **pili-pili** entry is an African hot-pepper term. Do not add bare **pili**, **noyer de pili** (the tree name), or **pili-pili** as nut aliases. [S01, S03, S05, S07]
- **Product-state boundary:** ALOCAL’s product is titled “Noix de pili activées – Non salées” and describes pre-germination and dehydration. The manufacturer’s current Canada storefront presents sprouted nuts with pink Himalayan salt. These are product-specific states with different treatments. Keep activated, sprouted, dehydrated, salted/unsalted, and skin or shell wording out of the base identity and do not add a general form without recipe or catalog need. [S05, S06]
- **Availability limit:** the ALOCAL listing is marked sold out. It is evidence of Québec-facing French terminology and a product definition, not evidence that the item is currently stocked or made in Québec. The manufacturer page is current, but its North American product page does not establish a Québec retailer or Québec availability. [S05, S06]

## Complete recipe-demand audit

Every recipe file named by the live manifest was opened in manifest order. All 1,123 ingredient rows were scanned using **originalText**, **ingredientName**, **ingredientRefId**, and **ingredientFormId** for **pili**, **pili nut(s)**, **pilinut**, **pili-nut**, **noix de pili**, **noyer de pili**, **pili-pili**, and **Canarium ovatum**. Result: **zero matching ingredient rows** across **114 recipes**.

Two nearby rows were reviewed to avoid assigning generic-nut demand to a species:

| Row | Current ingredient line | Disposition |
|---|---|---|
| **031#4** | “crushed nuts, for topping” | Remains linked to generic **ingredient-ref-nuts**; species and blend are unspecified. |
| **065#7** | “Nuts, to taste” | Remains linked to generic **ingredient-ref-nuts**; species is unspecified. |

Other nut/seed rows name other active identities. None supplies a pili-nut recipe link, preparation state, or substitution context. Do not relink generic nuts or add a speculative recipe line.

## Measurements and substitutions

The Québec ALOCAL listing states a 28 g basis for its nutrition claims; the manufacturer lists package choices of 1.85 oz, 5 oz, and 1 lb. These are source-specific serving/package quantities, not household-volume measures. No reviewed source gives a cup weight, count-to-mass measure, bulk density, usable-kernel yield, or preparation yield. Leave default density and unit mappings empty; do not turn package sizes or the 28 g nutrition basis into recipe conversions. [S05, S06]

The Canadian retailer’s supplier article compares the pili nut’s flavor and texture with macadamia and cashew. That sensory comparison gives no tested replacement ratio, recipe function, or method scope. No global or contextual substitution is supported. Leave substitutions unmodeled. [S08]

## Recommended integration delta

If accepted by the coordinator:

1. Add only the proposed identity-only reference **ingredient-ref-pili-nuts**, with **pili nuts / noix de pili**, English singular aliases **pili nut** and **pilinut**, no French aliases, null density, and empty unit mappings.
2. Add one **ingredient_reference** ledger record with verified identity, measurement state **researched_no_supported_value**, and substitution state **not_yet_researched**. Attach sources S01–S08; preserve the local listing’s sold-out status and the distinction between a retailer label and standardized terminology.
3. Leave forms, recipe links, package yields, unit conversions, and substitution rules empty. Mark only this narrow additional-kernel identity subitem complete if the plan is updated; keep the broader Section I coverage open.

## Source register

All proposal-local source IDs below were checked against the live ledger and are unused. They are recommendations for a future ledger entry, not reserved IDs.

| ID | Source and locator | Use and limit |
|---|---|---|
| **S01** | Government of Canada, Translation Bureau, [TERMIUM Plus: pili nut](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enb&lang=fra&srchtxt=PILI+NUT), record 1, dated 2007-05-07. | Standardizes English “pili nut” and French “noix de pili” in botany, fruit-tree cultivation, and food-product domains. Its note identifies the fruit’s edible kernel and commercial dried-fruit category. |
| **S02** | Agriculture and Agri-Food Canada, [GRIN-Global-CA: *Canarium ovatum* Engl.](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=8819&lang=en-CA), common names. | Associates *C. ovatum* with English common names “pilinut” and “pili-nut”. It supports the nonredundant “pilinut” alias; the hyphenated spelling normalizes to “pili nut”. |
| **S03** | Health Canada, [Groupes de cultures et propriétés chimiques de leurs résidus](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html), nut/crop-name table. | Lists “Noyer de pili (Canarium ovatum)” and separately lists “amandier de Java (Canarium vulgare)” and “nangaille (Canarium indicum)”. This is crop/taxon evidence, not the proposed consumer product display. |
| **S04** | Kew Science, [Plants of the World Online: *Canarium ovatum* Engl.](https://powo.science.kew.org/taxon/urn%3Alsid%3Aipni.org%3Anames%3A127447-1), accepted-name and distribution fields. | Confirms *C. ovatum* as an accepted species native to the Philippines. It does not define the culinary product name. |
| **S05** | ALOCAL, [Noix de pili activées – Non salées](https://alocal.ca/produit/noix-de-pili-activees-non-salees/), product heading, description, nutrition-claim basis, and status. | Québec-facing French product title; describes pre-germinated and dehydrated pili nuts from Bicol. The listing is marked sold out. Its 28 g nutrition basis is not a household measure; health claims are not adopted. |
| **S06** | Pili Hunters, [Just Pink Himalayan Salt](https://eatpilinuts.com/en-ca/products/new-pili-hunters-sprouted-pili-nuts-with-pink-himalayan-salt), manufacturer product description, ingredients, and size options. | Current Canada-locale manufacturer page names pili nuts and lists sprouted nuts with salt; sizes are 1.85 oz, 5 oz, and 1 lb. This supports a current product example and package options, not a recipe conversion or plain unsprouted form. |
| **S07** | OQLF, [pili-pili](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17567394/pili-pili), definition. | Defines “pili-pili” as a hot pepper. Exclude it from pili-nut aliases. |
| **S08** | SwitchGrocery, [Meet the Supplier: Pili Hunters](https://www.switchgrocery.com/blogs/blog/pili-hunters-the-original-pili-nut), supplier and product description. | Canadian retailer article says it sourced the brand for Canadian customers and compares the flavor/texture with macadamia and cashew. It is not current inventory evidence; the comparison does not support a substitution. |

No shared catalog, legacy, ledger, recipe, checklist, roadmap, workflow, or integration README was changed for this proposal.
