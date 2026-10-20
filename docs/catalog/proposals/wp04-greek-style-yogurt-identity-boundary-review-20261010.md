# WP04 Section Q — Greek-style yogurt identity boundary — 2026-10-10

- **Packet type:** proposal-only research. No seed, ledger, recipe, code, test, plan, roadmap, workflow log, or other proposal was changed.
- **Scope:** distinguish Greek-style yogurt / yogourt grec from generic plain yogurt / yogourt nature; review the unresolved legacy yogurt candidate only where it collides with that boundary.
- **Plan status:** Section Q remains open. This packet does not resolve other yogurt styles, milk species, cultured dairy, or dairy alternatives.
- **Audit snapshot:** 676 active ingredient references, 33 forms, 85 legacy candidates, 862 ledger records, 120 earlier proposal files, and all 114 bundled recipes (1,123 ingredient rows).
- **Source IDs:** `WP04-GREEK-YOGURT-20261010-S01` through `-S08` were not found in earlier proposal files or the ledger when this packet was prepared.

## Recommendation

Advance the existing legacy candidate `ingredient-ref-greek-yogurt` as a **distinct identity**. Use English display name `Greek-style yogurt` and Québec French display name `yogourt grec`. Preserve `Greek yogurt` as an English alias for the existing legacy name; `Greek yoghurt` and `Greek-style yoghurt` are narrow spelling aliases supported by OQLF's English yogurt/yoghurt variants and Canada's bilingual product usage. Do not alias Greek-style yogurt to active `plain yogurt / yogourt nature`.

Add one proposed form beneath the distinct identity: `plain Greek-style yogurt / yogourt grec nature`. The form is supported by four recipe lines and by Canadian and Québec product naming. Do not infer a universal straining method, protein level, fat level, cooking performance, or product composition from the name. Hold a `strained yogurt` alias and any French synonym such as `yogourt à la grecque`: the reviewed Québec sources use `yogourt grec`, and the available process definition is limited to one federal procurement specification.

Hold the broad legacy candidate `ingredient-ref-yogurt / yogurt / yogourt`. Its unqualified name is an umbrella over the active plain-yogurt identity, Greek-style products, and separately named cultured dairy such as active labneh. The current recipe bundle supplies no line that requests only unqualified `yogurt` or `yogourt`. Keep `plain` as the exact product qualifier and do not broaden it into a generic yogurt alias.

No recipe relinks are proposed. The four Greek-yogurt lines currently point to `ingredient-ref-plain-yogurt`; they are audit evidence for review if the candidate is later integrated. No measurements, conversions, yields, or substitutions are proposed. The Health Canada food-file pages cited below include serving data, but this packet adopts none of it.

## Repository, collision, and recipe audit

The active `ingredient-ref-plain-yogurt` is `plain yogurt / yogourt nature`, category `DAIRY_AND_ALTERNATIVE`, with English alias `plain yoghurt`, no forms, and no density or unit mappings. Its ledger identity state is `unreviewed`; its measurement state is `blocked_pending_evidence`, and substitution review remains open. Active `ingredient-ref-labneh` is a separately named cultured-dairy identity; the prior WP05 South-Central Asia/MENA proposal explicitly keeps labneh separate from plain yogurt. It does not review Greek yogurt.

The legacy candidate `ingredient-ref-greek-yogurt` is `Greek yogurt / yogourt grec`, category `DAIRY_AND_ALTERNATIVE`, unreviewed, with no aliases. Its ledger record is an unresolved, source-free candidate. The second legacy candidate `ingredient-ref-yogurt` is the broader `yogurt / yogourt`, also unreviewed and source-free. No Greek-yogurt or yogurt-related form exists among the 33 active forms. Exact normalized catalog keys are owned as follows: `Greek yogurt` / `yogourt grec` by the Greek-yogurt legacy candidate; `plain yogurt` / `yogourt nature` by the active plain-yogurt reference; and unqualified `yogurt` / `yogourt` by the generic legacy candidate. No active or form collision owns the proposed `Greek-style yogurt`, `Greek yoghurt`, or `Greek-style yoghurt` terms.

All 120 earlier proposal files were keyword-checked for Greek yogurt, yogurt/yoghurt/yogourt, and related names. The only directly relevant previous work is the WP05 labneh packet, which preserves labneh as distinct and explicitly does not add a yogurt alias or form conversion. No earlier proposal establishes a Greek-yogurt identity or form.

Every manifest-listed recipe JSON file was parsed and all 1,123 ingredient rows were checked. Five rows contain yogurt wording:

| Recipe position | Exact ingredient text | Current reference | Evidence disposition |
| --- | --- | --- | --- |
| `019#2`, Crab Balls | `1/4 cup plain Greek yogurt` | `ingredient-ref-plain-yogurt` | Greek-style, plain product wording; supports the proposed identity and plain form. |
| `019#12`, Crab Balls | `1/4 cup plain Greek yogurt` | `ingredient-ref-plain-yogurt` | Same wording appears in a second recipe row; count it as recipe data, not as a confirmed duplicate error. |
| `086#5`, Butter Chicken | `1/2 cup plain Greek yogurt` | `ingredient-ref-plain-yogurt` | Greek-style, plain product wording; supports the proposed identity and plain form. |
| `113#2`, Tzatziki | `1 1/2 cups plain Greek yogurt` | `ingredient-ref-plain-yogurt` | Greek-style, plain product wording; supports the proposed identity and plain form. |
| `051#9`, Strawberry Cake | `75 g sour cream or plain yogurt, room temperature` | No reference | Generic optional yogurt wording; it does not request Greek-style yogurt and does not support linking this line to the proposed identity. |

Thus four rows in three recipes explicitly say plain Greek yogurt, and all four currently point to generic active plain yogurt. The fifth row remains an unresolved compound choice with no reference. The audit found no recipe line requesting Greek yogurt by another name, strained yogurt, sweetened/flavoured Greek yogurt, skyr, or an unqualified generic yogurt. This packet records the mismatch without editing any recipe or proposing a relink.

## Candidate and terminology dispositions

| Item | Disposition | Boundary and evidence limit |
| --- | --- | --- |
| Legacy `ingredient-ref-greek-yogurt` | **Accept as distinct identity** | Use `Greek-style yogurt / yogourt grec`; keep the existing candidate ID. Health Canada product records and Québec product sources identify this as a market product class, distinct in naming from generic plain yogurt. This identity does not claim a single recipe, origin, or production method. |
| English `Greek yogurt` | **Accept as alias** | Retains the legacy name and is used in a Canadian federal procurement spec. Keep it attached only to the Greek-style identity. |
| English `Greek yoghurt`, `Greek-style yoghurt` | **Accept as spelling aliases** | OQLF lists `yogurt` and `yoghurt` as English terms for the base Québec French `yogourt`; apply that spelling variation narrowly to the qualified identity. |
| French `yogourt grec` | **Accept as display name** | Used in Québec product listings and a federal bilingual food record. OQLF confirms `yogourt` is the most common Québec spelling for the base term but did not surface a separate Greek-yogurt entry in the targeted search. |
| `plain Greek-style yogurt / yogourt grec nature` | **Accept as one form under the Greek-style identity** | Four recipe rows use the exact plain Greek phrase. The bilingual food record and a Québec government product listing also distinguish plain Greek yogurt. `Plain` is a product qualifier here; it does not mean every Greek-style product is unsweetened. |
| Flavoured or sweetened Greek yogurt forms | **Hold** | The procurement specification says Greek yogurt can be plain or sweetened/flavoured, but the bundled recipes do not request a flavoured/sweetened form. Do not create unsupported forms in this bounded packet. |
| `strained yogurt` / `yogourt égoutté` | **Hold as aliases** | One DND procurement specification describes milk strained before fermentation or whey removed after fermentation. The Québec product directory lists ultrafiltered skim milk in a Greek-yogurt product without identifying it as strained. The reviewed sources do not support a universal process synonym. |
| Active `ingredient-ref-plain-yogurt` | **Retain as a separate identity** | Preserve `plain yogurt / yogourt nature` and its existing `plain yoghurt` alias. Do not add Greek yogurt as an alias or treat the four current recipe links as proof of equivalence. |
| Legacy `ingredient-ref-yogurt / yogurt / yogourt` | **Hold** | No unqualified yogurt recipe line requires it; the generic term overlaps the active plain identity and product-specific cultured-dairy identities. Revisit when a recipe or source-backed catalog need establishes a role for a generic umbrella row. |
| `yogourt à la grecque`, `labneh`, `skyr`, and `yogourt nature` as Greek-yogurt aliases | **Hold / exclude** | The reviewed sources do not establish these as equivalent names. Labneh already has its own active identity; no evidence reviewed merges it with Greek-style yogurt. |

The DND procurement document's Greek-yogurt description and fat ceiling apply to that contracting specification, not to every Canadian retail product. Health Canada's food-file classification includes a higher-fat Greek-style product, and the Québec product directory lists a 4% Greek-yogurt product. No specific fat ceiling or universal process is recommended here. The Québec listing's ingredient record is one product entry (the directory identifies GS1 as its data source), not a definition of the whole category.

## Source register

| Source ID | Source and supported scope |
| --- | --- |
| **WP04-GREEK-YOGURT-20261010-S01** | Office québécois de la langue française, [yogourt (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8872897/yogourt), updated 2025. Defines the base cultured-milk product; says `yogourt` is the most common form in Québec and lists English `yogurt` and `yoghurt`. It does not establish a specific Greek-yogurt term or production method. |
| **WP04-GREEK-YOGURT-20261010-S02** | Canadian Food Inspection Agency, [Labelling requirements for dairy products](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy). Lists yogurt among dairy products requiring milk-fat declaration under FDR B.08.002.3(j). This is labeling context; it does not define Greek-style yogurt. |
| **WP04-GREEK-YOGURT-20261010-S03** | Justice Canada, [Food and Drug Regulations, B.08.002.3](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.%2C_c._870/section-B.08.002.3.html). Identifies yogurt as a dairy product for which milk-fat percentage must be declared. No Greek-style definition is cited from this provision. |
| **WP04-GREEK-YOGURT-20261010-S04** | Health Canada, [Canadian Nutrient File: Greek-style yogurt, plain, 2% M.F.](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=7469), food code 7469. Uses English `Yogourt, Greek style, plain` and French `Yogourt, Grec, nature`. Supports bilingual product-class and plain-variant naming, not a common manufacturing method or recipe conversion. |
| **WP04-GREEK-YOGURT-20261010-S05** | Health Canada, [Canadian Nutrient File: Greek-style yogurt, plain, rich](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=6982), food code 6982. Separately classifies a rich plain Greek-style product. Used only to show that the 2018 procurement specification's fat ceiling is not a universal market description; no amounts or densities are adopted. |
| **WP04-GREEK-YOGURT-20261010-S06** | Gouvernement du Québec, [Répertoire des aliments québécois: Plain Greek Yogourt 0% M.F.](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202503), Riviera. Product record gives the plain Greek-yogurt name and lists skim milk, ultrafiltered skimmed milk, bacterial culture, and lactase. The page attributes product data to GS1; one listing only, not a universal formula or process. |
| **WP04-GREEK-YOGURT-20261010-S07** | Department of National Defence, [Food Quality Specifications, A-85-269-002/FP-Z01](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-18-2018-fra.pdf), 2018, Table 1. Uses French `yogourt grec` and describes one procurement product as plain or flavoured, made with milk strained before fermentation or whey drained after fermentation, with relatively firm texture and higher protein. It also includes a procurement-specific fat limit; do not generalize its process or limit to all products. |
| **WP04-GREEK-YOGURT-20261010-S08** | Saputo Foodservice, Québec French listing [Yogourt grec nature](https://www.saputofoodservice.ca/fr-ca/produits-laitiers/yogourt/yogourt-grec-nature). Confirms current Québec commercial use of `yogourt grec nature` as a named food-service product. The public page gives no ingredient formula or manufacturing definition. |

## Proposal disposition

- Advance existing legacy `ingredient-ref-greek-yogurt` as the distinct `Greek-style yogurt / yogourt grec` identity; preserve `Greek yogurt` and narrowly scoped spelling variants as English aliases.
- Add the proposed `plain Greek-style yogurt / yogourt grec nature` form under that identity, supported by the four recipe rows and Canadian/Québec product naming.
- Retain active `ingredient-ref-plain-yogurt` separately. Do not add Greek, strained, labneh, or skyr names as aliases.
- Hold generic legacy `ingredient-ref-yogurt`, flavored/sweetened forms, and process-based `strained yogurt` aliases pending a broader yogurt-family review.
- Keep Section Q open. No recipe, catalog, form file, ledger, code, tests, plan, or roadmap was modified by this packet.

## Coordinator disposition — 2026-10-10

The source review was independently checked. The existing `ingredient-ref-greek-yogurt` candidate is now active as `Greek-style yogurt / yogourt grec`, with the narrow English spelling aliases in the proposal and a `plain Greek-style yogurt / yogourt grec nature` product form. Four recipe lines with exact `plain Greek yogurt` source text now reference that identity and form; their original text and quantities remain unchanged. The optional `sour cream or plain yogurt` line remains unlinked. Active `plain yogurt` remains separate, the generic yogurt candidate stays unresolved, and no process alias, measurements, conversions, or substitutions were added.
