# WP05 pandan product-boundary review — leaves, extracts, essence, powder, paste

Owner: /root/sea_pantry_batch. Status: independent review accepted for one raw-leaf identity on 2026-10-09; the fr-CA display review was completed in R345 on 2026-10-16; prepared-product boundaries remain open. Sources accessed: 2026-10-09 unless otherwise dated in the R345 follow-up. Scope: verify the culinary leaf identity and assess whether leaves and prepared pandan products can share one searchable identity. No Section X prepared-product completion is claimed.

## Live state reviewed

I read the repository `AGENTS.md`, the catalog evidence and identity rules, the current Section K/E/X plan entries, and the pending proposal [`wp05-southeast-asian-pandan-followup.md`](wp05-southeast-asian-pandan-followup.md). Shared worktree edits were present and left intact. The previous proposal's input counts are stale; the current files were re-read for this review.

| Live input | Current state at review | SHA-256 |
| --- | --- | --- |
| `ingredient-references.v1.json` | 412 references; no pandan/Pandanus/screwpine/kewra match | `5b851d03bc09eb43a0b73fd7a6cb05e991ea90586f11bf51f21d489fb1fe26fd` |
| `ingredient-forms.v1.json` | 16 forms; no pandan match | `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` |
| `research-ledger.v1.json` | 577 records and 8 unit-conversion records; no pandan match | `185e6f502964a83e0c56c7a6a0e3a92e5ded342177705fe45a5196f32762acd1` |
| `legacy-import-identities.v1.json` | 99 candidates; no pandan match | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Bundled recipes | 114 recipe JSON files | — |
| Package-yield / substitution parts | 1 package-yield record, 0 global substitution rules, 0 contextual substitution rules; no pandan match in any of these parts | — |

The plan separately lists pandan leaves in Section K, pandan extract among Section E flavorings, and pandan preparations in Section X. The pending proposal also records this cross-section overlap. Assign one owner for the base leaf identity before integration; this review does not mark any of those plan entries complete.

## Recommendation

One searchable identity is supportable for the culinary leaves of *Pandanus amaryllifolius* only. Recommend `pandan leaves / feuilles de pandan`, category `HERB`, with no aliases, density, unit mappings, or active form rows. The Canadian English/French product pages and a Québec recipe directly use the part-qualified names. NParks supports the species and culinary role, but its common names for the botanical species do not establish unambiguous recipe aliases.

Do not place raw leaves, leaf juice, fresh extract, leaf powder, evaporated-juice powder, commercial extract powder, essence, and paste under one searchable identity. The sources describe different preparation routes and formulations. In particular, King Arthur Baking distinguishes leaf powder from evaporated juice powder and says bottled extracts/pastes vary from pandan-and-water products to artificial flavor/color products. A single bare alias such as `pandan` would hide these boundaries. No alias for `pandan`, `screwpine`, `Daun Pandan`, `Pandan Wangi`, or the taxon is proposed.

### Candidate decisions

| Candidate | Identity / alias / category status | Product boundary and decision |
| --- | --- | --- |
| Culinary pandan leaves | **Support identity-only row, pending cross-section owner and fr-CA review.** EN `pandan leaves`; fr-CA `feuilles de pandan`; suggested category `HERB`; proposed aliases `[]`. | NParks identifies *P. amaryllifolius* and leaf culinary uses. A Canadian product page lists 100% dehydrated leaves; its French page and Télé-Québec recipe use `feuilles de pandan`. The supplier spelling of the Latin name is erroneous; use NParks spelling. |
| Fresh/frozen leaves; dried whole leaves | **No form row now.** | King Arthur refers to fresh/frozen leaves; the Canadian supplier's dried product is explicitly 100% leaf. These are compatible plant-part states, but there is no recipe-line demand in the 114 bundled recipes and no source-backed cross-state conversion. If a future use case needs them, review `fresh`, `frozen`, and `dried` as forms of the leaf identity, with no assumed interchange ratio. |
| Leaf juice | **Do not alias to leaves or generic extract.** | NParks documents juice extracted from leaves; King Arthur describes blending fresh/frozen leaves with water and straining. This is a recipe-made liquid preparation with no standardized leaf-to-liquid yield in the sources reviewed. |
| Fresh leaf extract | **Do not alias to juice or commercial extract.** | King Arthur describes resting pandan juice and separating the thicker fraction as a fresh extract. It is a separate recipe process with no standardized yield or shelf-equivalence claim. |
| Pandan leaf powder | **Unresolved as an ingredient or leaf form.** No row/alias proposed. | A Canada bilingual listing names `Pandan Leaves Powder / Poudre de feuilles de pandan`, but the listing does not expose an ingredient declaration. King Arthur says commercial powder can be pulverized freeze-dried leaves or evaporated pandan juice. Do not infer which product route the Canadian listing uses. |
| Extract / extract powder | **No generic identity, alias, or form proposed.** | Bionutricia lists one Malaysian B2B spray-dried *P. amaryllifolius* leaf extract powder with its own product specifications. That supports a distinct processed material, not a universal meaning or culinary equivalence for retail `pandan extract`. |
| Essence / flavouring | **No generic identity or alias proposed.** Québec French display name unresolved. | King Arthur says bottled extracts and pastes may contain pandan and water or artificial flavour/color. One JNRM-branded essence page lists propylene glycol, water, and natural-identical/artificial flavour. It is a product-specific flavour preparation, not evidence that all “essence” is leaf-derived. |
| Paste | **No generic identity or alias proposed.** | Bakels' named Apito product is categorized under flavours and colours; its stated ingredients are water, solvent, permitted flavouring and colouring, and thickeners. Its own formula and use directions apply only to that product. King Arthur also cautions that bottled pastes vary by label. |
| Pandan-infused kaya | **Keep in the existing kaya compound proposal.** | Pandan used to flavor a finished spread does not make that spread an alias or form of pandan leaves. No kaya row is re-proposed here. |
| Kewra water | **Keep in the existing South/Central Asia–MENA proposal; no alias.** | It is already separately proposed there. The shared genus wording is not a reason to merge it with a leaf-based pandan identity. This packet does not re-review the kewra evidence. |

## Measurement, form, yield, and substitution evidence

### Measurements and yields

No active density, unit mapping, package yield, leaf-to-juice yield, leaf-to-powder yield, extract ratio, or general recipe quantity is proposed. The source figures below are retained only as source-scoped product or recipe evidence; they are not interchangeable conversion data.

| Source-scoped evidence | What it supports | What it does not support |
| --- | --- | --- |
| La Plantation Canada sells a 50 g dried-leaf SKU and a separately named 50 g powder SKU; both pages showed sold-out status when accessed. | Exact listings and pack sizes for those listings; dried product ingredient declaration is 100% dehydrated leaves. | Density, household-volume conversion, package yield, or proof that the powder is pure leaf. |
| Télé-Québec's durian sticky-rice recipe uses 5 crushed leaves in 1 L coconut milk for 8 portions, infuses, then removes the leaves. | One recipe-scoped leaf use and removal method. | A standard infusion dose, leaf count-to-mass ratio, or extract yield. |
| Bakels lists a 2 kg Apito paste jar and shows 0.020 kg of the paste in one named dough formula; the page says use rate may change to meet flavor/color needs. | One manufacturer's product size and one formula-specific quantity. | A generic paste dose, leaf equivalence, or conversion between paste brands. |
| Bionutricia lists a 7.5:1 spray-dried extract and 2–8% formulator dosage for its own bulk powder. | Manufacturer's specification and industrial application range for that SKU. | A fresh-leaf equivalent, household measure, generic powder conversion, or density. The extractor does not establish a recipe-usable yield model here. |
| JNRM lists package-size variants and product-type application ranges for its Green Leaves essence. | Manufacturer-specific guidance for that branded essence. | A general dose for “pandan essence,” or a measure conversion to leaves, juice, paste, or extract. |

### Substitution evidence (kept separate from measurements)

King Arthur Baking gives contextual culinary recommendations, but does not support a catalog-wide conversion rule:

- For milk/liquid desserts normally flavored by infusing vanilla, it recommends using a few knotted pandan leaves during steeping. This is a qualitative method substitution, scoped to infusions.
- For wet-batter cakes, it prefers pandan juice; if fresh/frozen leaves are unavailable, it says store-bought natural extract, paste, or powder can be used. It gives no leaf-to-product ratio and the forms are not shown to be compositionally equivalent.
- It says a 1:1 replacement of vanilla extract with pandan extract or paste is “usually” appropriate, and suggests trying half the amount on first use to check color and flavor. This is a dessert/baking recommendation, not a validated universal ratio. Elsewhere the same article says branded extracts and pastes vary by ingredients.

Record this as source-scoped contextual evidence only. Do not activate any substitution rule. If an integration owner later models the vanilla recommendation, it needs an explicit dessert flavoring role and product/form scope; the current evidence does not resolve which commercial pandan extract or paste is being substituted. No leaf-to-extract, essence-to-leaf, powder-to-leaf, or paste-to-leaf numeric substitution was found.

## Normalized-key and recipe audit

I used repository `normalize_search_key` semantics (case-fold, NFKD, fold common ligatures, remove combining marks, replace non-alphanumeric runs with spaces) against all current reference English/French names and aliases, plus all form labels and match terms.

- **Zero exact normalized collisions** for proposed `pandan leaves` and `feuilles de pandan`.
- **Zero exact normalized hits** for the reviewed/rejected terms `pandan`, `screwpine`, `Daun Pandan`, `Pandan Wangi`, `Pandanus amaryllifolius`, `pandan juice`, `pandan leaf powder`, `pandan leaf extract powder`, `pandan extract`, `pandan essence`, `pandan paste`, `pandan flavor/flavour`, `kewra`, and `kewra water` in current references or forms.
- Scanned all 114 recipe JSON files across text fields, including ingredient lines, for `pandan`, `Pandanus`, `screwpine`, `Daun Pandan`, `Pandan Wangi`, `feuilles de pandan`, and `kewra`. **No mention or ingredient-line match was found; no recipe relink is proposed.**
- The candidate strings were also absent from the 99 legacy candidates, 577 ledger records, current forms, package-yield record, and both substitution-rule parts.

## Accessed sources and claim mapping

All accessed on 2026-10-09. Source locators refer to the pages as retrieved on that date; vendor pages can change.

1. Singapore National Parks Board, [*Pandanus amaryllifolius* — Flora & Fauna Web](https://www.nparks.gov.sg/florafaunaweb/flora/2/2/2299), lines 27–33 and 73–80. Government source for taxon spelling, botanical common names, “herb or spice” classification, leaves, leaf juice in food, removal before serving, and leaf-based culinary uses. Common names describe the plant, not a validated ingredient-alias set.
2. La Plantation Canada, [Pandan Leaves Tea — 50 g](https://laplantation.ca/products/pandan-leaves-infusion-50g), lines 136–170; and [Thé aux feuilles de pandan — 50 g](https://laplantation.ca/fr/products/pandan-leaves-infusion-50g), lines 136–168. Canada storefront supports EN/FR part-qualified names and the exact 100% dehydrated-leaf product statement. Its displayed Latin name has a typo; do not copy it. It is an online listing, not a verified bilingual package image.
3. La Plantation Canada, [Pandan Leaves Powder — 50 g](https://laplantation.ca/products/pandan-leaves-powder-50g), lines 126–170; and [Poudre de feuilles de pandan — 50 g](https://laplantation.ca/fr/products/pandan-leaves-powder-50g), lines 126–165. Canada listings support the English/French powder names, pack size, and stated cooking uses, but no ingredient declaration was visible. They do not prove the contents are ground leaves rather than another powder route.
4. Télé-Québec Cuisinez, [Durian au riz gluant](https://cuisinez.telequebec.tv/recettes/6451/durian-au-riz-gluant), lines 21–40. Québec French recipe uses `feuilles de pandan`; the method infuses and removes them. The recipe quantity is not a generic conversion or formal terminology ruling.
5. King Arthur Baking, [What you need to know about baking with pandan](https://www.kingarthurbaking.com/blog/2021/08/20/baking-with-pandan-chiffon-cake), lines 257–285. Culinary guidance for fresh/frozen leaves, juice and fresh extract preparation, powder variants, variability in commercial extract/paste labels, contextual dessert uses, and the qualified vanilla substitution. This supports method and use context, not product identity or universal equivalence.
6. Bakels Thailand, [Apito Pandan Paste](https://www.bakels.co.th/en/products/apito-pandan-paste/), lines 39–69, 136–185, and 296–312; see also the [manufacturer specification PDF](https://www.bakels.co.th/wp-content/uploads/sites/37/2019/02/Apito-Pandan-Paste.pdf). Manufacturer source for one named flavour/color paste, product-specific ingredient list, package and formula example, and variable usage direction. Do not generalize its formulation to all pastes.
7. Bionutricia Extract, [Pandan Leaf Extract Powder](https://bionutriciaextract.com/pandan-leaf-extract-powder-bulk/), lines 23–50 and 51–68. Manufacturer source for one B2B leaf-extract powder and its own extraction/dosing specification. These B2B figures do not constitute consumer recipe conversions.
8. JNRM Corporation / Green Leaves, [Essence aromatique polyvalente concentrée de pandan aux feuilles vertes](https://jnrmgroup.com/fr/products/green-leaves-concentrated-pandan-multi-purpose-flavor-essence), lines 63–103 and 115–158. One French-language branded essence listing, with a formulation including propylene glycol, water, and natural-identical/artificial flavour and its own application directions. This establishes a source-specific flavor preparation; the French page is not Québec terminology evidence and its name is not proposed as the fr-CA catalog name.

## Recommended acceptance checks

- [x] Keep an identity-only leaf candidate `ingredient-ref-pandan-leaves`, `pandan leaves / feuilles de pandan`, category `HERB`, aliases empty; WP05 owns the single row, with Section K/U references pointing to it.
- [x] Independent Québec French display review completed in R345. Retain `feuilles de pandan` and `poudre de feuilles de pandan` without an OQLF-preferred-term claim or broader aliases; see [`wp05-pandan-quebec-french-terminology-review-r345-20261016.md`](wp05-pandan-quebec-french-terminology-review-r345-20261016.md).
- [x] Do not add a generic `pandan` alias or merge juice, powder, extract, essence, and paste with leaves. Require a source-specific product statement before creating any processed-product identity or form.
- [x] Keep density, unit mappings, package yields, preparation yields, conversions, and substitution rules unset. Any future numeric claim must name its exact product and use context.
- [x] Re-run normalized key, form, recipe mention, package-yield, legacy, and substitution audits against the live package immediately before integration.

## Coordinator integration result

Accepted one identity, `ingredient-ref-pandan-leaves`, with displays `pandan leaves / feuilles de pandan`, category `HERB`, and no aliases. WP05 owns the only canonical row; the related Section K and U checklist entries cross-reference it. The Section E extract and Section X preparations remain open. No leaf forms, product yields, conversions, or substitution rules were added in this identity batch. The merge-time audit found no normalized-key collision against 412 references and 16 forms and no pandan ingredient-line use among 114 bundled recipes / 1,123 ingredient rows. The leaf identity is integrated; product-boundary research remains open. Build and Pixel 9a verification details are in [`../batches/wp05-pandan-leaves.md`](../batches/wp05-pandan-leaves.md). R345 closes the independent fr-CA display review; see the [terminology review](wp05-pandan-quebec-french-terminology-review-r345-20261016.md).

At the time this proposal was prepared, no seed, ledger, plan, roadmap, workflow, checklist, code, or test file was edited; no tests or integration checks were run. Acceptance and cross-section completion were then pending.

## R345 follow-up — Québec French display review

On 2026-10-16, root independently reviewed the existing French displays and retained them unchanged. `Feuilles de pandan` is attested in a Québec recipe; `poudre de feuilles de pandan` is attested as a Canada-targeted French product title. Neither term is described as OQLF-preferred. No aliases or database fields changed. See the [R345 proposal](wp05-pandan-quebec-french-terminology-review-r345-20261016.md) and [integration README](../batches/wp05-pandan-quebec-french-terminology-integration-r345-20261016/README.md).
