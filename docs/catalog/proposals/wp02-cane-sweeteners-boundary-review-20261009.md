# WP02 Section C — regional cane-sweetener boundary review

- **Reviewed:** 2026-10-09
- **Status:** integrated on 2026-10-09 into the canonical catalog and research ledger after coordinator review. The accepted identities and evidence dispositions are listed under `Coordinator integration result` below; independent Québec terminology review remains open.
- **Owner:** independent WP02 identity/evidence review
- **Scope:** cane-derived sweeteners around cane jaggery/gur, panela, piloncillo, muscovado, demerara, turbinado, rapadura, and Okinawa kokuto. Measurement and substitution evidence are reviewed separately.
- **Plan state:** Section C of the global ingredient catalog plan remains open.

## Repository snapshot and existing work

The live bundled package contains **414 ingredient references**, **16 forms**, **579 research-ledger records**, and **114 recipe JSON files with 1,123 ingredient rows**. The legacy import file has **99 candidates**. These are proposal-time counts, not merge-time counts.

The eight current SUGAR_AND_SWEETENER references are brown sugar / cassonade, corn syrup / sirop de maïs, date syrup / sirop de dattes, granulated sugar / sucre granulé, honey / miel, icing sugar / sucre à glacer, maple syrup / sirop d’érable, and rose syrup / sirop de rose. The existing brown-sugar row has English aliases dark brown sugar and light brown sugar; those names are exact-key collisions for this review and must not be reused for muscovado. Pomegranate molasses is a separate SAUCE_AND_CONDIMENT reference, not generic molasses.

Relevant legacy candidates are ingredient-ref-sugar, ingredient-ref-molasses, ingredient-ref-maple-sugar, and ingredient-ref-brown-rice-syrup. The legacy sugar candidate is not a new regional-sugar identity: the canonical granulated-sugar reference already owns sugar and sucre. No legacy candidate names jaggery/gur, panela, piloncillo, muscovado, demerara, turbinado, rapadura, or kokuto.

The current ledger has generic sugar measurement records and records for date syrup, pomegranate molasses, and other existing sweeteners, but no identity record for the regional cane candidates reviewed here. The already-integrated date-syrup observation remains specific to its cited syrup and does not establish a measurement for solid cane sugars.

No existing proposal file contains an exact mention of the candidate names reviewed here. Adjacent work covers source-specific Kampong Speu palm-sugar syrup in [the WP05 Southeast Asian condiment proposal](wp05-southeast-asian-condiments.md) and date syrup / pomegranate molasses in the WP05 MENA proposals. Those products remain separate: palm-derived syrup and date-derived syrup are not cane-sugar aliases.

## Identity and naming recommendations

Treat the entries below as distinct **candidate identities for coordinator review**, all tentatively classified as SUGAR_AND_SWEETENER. This is a regional product boundary proposal, not a claim that every producer uses one formula. Keep forms, package yields, density, and unit mappings absent until separately supported.

| Candidate | Proposed EN / fr-CA display | Alias recommendation | Identity boundary and state |
| --- | --- | --- | --- |
| Cane jaggery / cane gur | cane jaggery / gur de canne (provisional French wording; independent Québec terminology review is still needed) | English cane gur is supported as the same cane-qualified name by FSSAI. Do not activate unqualified jaggery or gur. Do not use jagré as a cane alias. | One cane-qualified candidate is supported. FSSAI separates cane jaggery/cane gur from palm/date jaggery products. OQLF’s jagré entry is specifically for coconut jaggery. |
| Panela | panela / panela; Québec product wording also includes sucre brun panela pur de canne | No aliases proposed. | Colombian sources define a cane-juice product made by extraction and evaporation. Treat block, granulated, or powdered presentations as unmodeled presentation variants, not evidence of alias equivalence with other countries’ named products. |
| Piloncillo | piloncillo / piloncillo | English piloncillo sugar may be reviewed as a descriptive alias; do not activate panela, chancaca, or panocha. | Mexico’s NMX-F-596-SCFI-2016 defines piloncillo from 100% sugarcane juice and covers block or granulated product. Keep as a regional candidate separate from panela pending a direct product-specification comparison. Panocha is reported for smaller chunks in one U.S. recipe source; its regional and product scope remains unresolved. |
| Muscovado | muscovado sugar / sucre muscovado (Canadian French product wording; OQLF review remains open) | No aliases proposed. Do not alias light/dark muscovado to light/dark brown sugar. | Named product evidence supports a distinct candidate from soft brown sugar and demerara. The sources reviewed do not establish one universal manufacturing process for all products sold as muscovado. Light and dark grades remain unresolved product-grade metadata. |
| Demerara | Demerara sugar / sucre demerara | No aliases proposed until the turbinado conflict below is resolved. | Canadian sugar sources and a major producer sell/name demerara separately and describe its crystal/texture profile. OQLF places sucre demerara in its sucre turbinado terminology entry, so the fr-CA identity boundary needs independent review. |
| Turbinado | turbinado sugar / sucre turbinado | No aliases proposed until the demerara conflict below is resolved. Do not activate raw sugar or the brand Sugar in the Raw. | Canadian and producer sources identify turbinado as a named specialty sugar with its own processing description. OQLF’s shared terminology entry conflicts with the separate product naming used by Canadian industry and baking sources; do not merge on the current record. |
| Rapadura | rapadura / rapadura (Québec usage not independently established; French sources use the borrowed product name) | No aliases proposed. | Brazil’s ANVISA defines rapadura as a solid product obtained by concentrating sugarcane juice. Keep it separate from liquid melado, which ANVISA defines as concentrated cane juice or melted rapadura, and do not infer aliases from a broad regional-name list. |
| Okinawa kokuto | Okinawa kokuto / Okinawa kokuto (provisional shared loan name; Québec French review is open) | English Okinawa brown sugar is source-attested as a gloss for the registered product. Do not activate generic brown sugar or black sugar. | Japan MAFF registers Okinawa kokuto as a geographically specified product, and the Okinawa producers’ association describes concentrated sugarcane juice that is cooled and shaped. Preserve the origin-qualified product boundary; the name does not define all kokuto or black sugars. |

### Nearby candidates kept separate or unresolved

- **Coconut, date-palm, and palmyra jaggery/gur:** distinct source plants under FSSAI; outside the cane-qualified identity. Coconut jaggery is also the scope of OQLF’s jagré.
- **Khandsari:** keep separate from cane jaggery/gur. FSSAI lists khandsari in a different sweetener class; a separate process and fr-CA naming review is still required.
- **Melado / cane syrup:** liquid cane products, not aliases for solid panela, piloncillo, jaggery, rapadura, or kokuto. The reviewed ANVISA definition distinguishes melado from rapadura.
- **Chancaca, papelón, raspadura, tapa de dulce, dulce granulado, mascabado, sucanat, and generic “unrefined cane sugar”:** retain as regional research candidates only. A Colombian Codex document lists several as common names in a proposed umbrella standard, but the document is a proposal, not an adopted cross-market synonym standard. It does not establish that retail products share process, form, or recipe behavior.
- **Generic cane sugar, raw sugar, and brown sugar:** too broad to use as aliases for one regional product. Brown sugar is already a canonical identity with light/dark aliases; keep it separate from muscovado, demerara, turbinado, and the non-centrifugal candidates.

## Cross-identity alias boundary

The Colombian Codex proposal provides a useful regional-name inventory, but its proposed grouping is broader than a recipe-level synonym decision. Current national and regional sources give specific product definitions: FSSAI explicitly qualifies cane jaggery/cane gur and distinguishes palm-derived jaggery; Colombia defines panela; Mexico standardizes piloncillo; Brazil defines rapadura separately from melado; and Japan protects Okinawa kokuto by origin. Therefore:

- Cane jaggery and cane gur may be one identity only with the cane qualifier retained.
- Keep panela, piloncillo, rapadura, and Okinawa kokuto unmerged and without cross-aliases until a direct product comparison and Québec terminology review supports equivalence.
- Keep muscovado separate from demerara and turbinado. Similar color, molasses flavor, broad trade groupings, or a recipe substitution do not prove identity equivalence.
- Keep demerara and turbinado as separate candidates for now. OQLF’s 2003 entry treats them as preferred terms within one terminology record, while Canadian Sugar Institute and producer/baking sources list and describe separate products. The language record and the product evidence conflict; no alias or merge is activated here.
- Keep panocha unresolved relative to piloncillo. One recipe publisher uses it for smaller chunks; that observation does not establish a general regional alias.
- Keep jagré out of cane jaggery aliases. OQLF links that French term to coconut jaggery, while the current candidate is cane-qualified.

## Measurement evidence — reviewed independently

The following are source-published observations only. They are not density values or active app mappings. No source-qualified observation reviewed here establishes an app-compatible volume-to-mass mapping because the cup system, ingredient preparation/fill method, and/or product form is incomplete.

| Candidate / source observation | Exact published basis | Limitation and disposition |
| --- | --- | --- |
| Demerara, King Arthur Baking Ingredient Weight Chart | 1 cup = 7 3/4 oz = 220 g, row “Demerara sugar.” | The chart does not state cup capacity or the filling method. Retain as a source-scoped portion observation only; no density or mapping. |
| Turbinado, King Arthur Baking Ingredient Weight Chart | 1 cup = 6 3/8 oz = 180 g, row “Turbinado sugar (raw).” | The chart does not state cup capacity or the filling method. Retain separately from demerara; do not activate a mapping. |
| Piloncillo, UTSA Special Collections cookbook | Café de olla ingredient line: 100 grams (about 1/2 cup) piloncillo sugar, identified in the recipe as Mexican brown sugar sold in cones. | “About” is approximate; cup system, cone breakup/grating state, and fill method are unstated. This is one recipe observation, not a general conversion. |
| Piloncillo, Bon Appétit Café de la Olla | One 7–8 oz piloncillo cone for a recipe that makes about 6 cups of coffee. | Package/cone mass and recipe yield do not establish a volume conversion or a universal cone weight. Keep as recipe context only. |
| Unqualified jaggery, Saveur Panagam | 3 tbsp (1/2 oz.) grated jaggery; recipe makes 2 cups of drink. | The recipe does not specify cane versus palm source. Do not assign the observation to cane jaggery/gur. The grated-state spoon measure is recipe-specific. |

No comparable serving or kitchen-measure observation was found in the inspected sources for panela, cane-qualified jaggery/gur, muscovado, rapadura, or Okinawa kokuto. FSSAI moisture/sugar limits and ANVISA product definitions are composition or identity criteria, not household portion weights. Québec package masses and product sizes are not volume-to-mass evidence.

**Proposed measurement state:** keep defaultDensity null and unitMappings empty for every candidate. For the two King Arthur cup observations and UTSA recipe observation, record only the exact source description, date, and limitations if a later ledger review accepts them. Until the source cup can be matched to the app’s US cup and the recipe row’s filling/preparation basis is known, use blocked_pending_evidence for activation. Do not transfer the existing granulated-sugar, brown-sugar, molasses, or date-syrup measurements.

## Substitution evidence — reviewed independently

| Source finding | Supported scope | Catalog disposition |
| --- | --- | --- |
| King Arthur Baking’s sugar guide recommends brown sugar or muscovado, by weight, for its broad “whole cane sugars” category, which it describes with jaggery and piloncillo examples. It also says muscovado can be replaced by brown sugar by weight or volume. | Baking guidance from one editorial source. The source also advises sticking with the sugar named by the recipe because results differ. It does not establish that jaggery, panela, piloncillo, and rapadura are aliases or interchangeable in every preparation. | Preserve as source-scoped substitution evidence. Do not activate a global rule or transfer the advice to every regional product. |
| The same King Arthur guide recommends demerara/turbinado as mutual substitutes: by weight in batter or dough, and by volume when sprinkling on top of baked goods. | Explicitly method/role-scoped finishing or baking guidance. | This supports a possible future contextual substitution review, not an identity merge. Keep inactive pending coordinator acceptance and exact catalog/form/context modeling. |
| King Arthur’s brown-sugar article says fine-grained turbinado may work in cake in place of brown sugar; larger crystals may be unreliable for baking, and one tested use made drop cookies spread more. | Qualitative crystal-size and recipe-style caveat; no universal quantity. | Retain as a caution about form/grain size. Do not create a general turbinado-to-brown-sugar rule. |
| Bon Appétit’s Café de la Olla recipe says that if its 7–8 oz piloncillo cone is unavailable, use an equal weight of packed dark brown sugar (listed as 1 cup for that recipe). | One named coffee preparation and the source’s cone/packed-brown-sugar quantities. | A recipe-scoped piloncillo-to-brown-sugar finding only; no active general rule and no alias. |

No directly supported replacement amount was found for jaggery-to-panela, panela-to-piloncillo, rapadura-to-kokuto, or any of these regional products to ordinary sugar. Broad retail claims such as “alternative to white sugar” lack a recipe context and replacement quantity and are not rule evidence.

**Proposed substitution states:** researched_supported for the narrow muscovado/brown-sugar, demerara/turbinado, and piloncillo/café-de-olla findings, with no active runtime rule; researched_no_supported_substitute for the exact regional pairings listed above; keep other unresearched pairings open. No universal replacement ratio is proposed.

## Exact normalized-key and recipe audits

The exact-key audit used normalize_search_key in tools/seed_package/bundled_seed_package.py: Unicode NFKD and case folding, accent/ligature folding, punctuation-to-space normalization, and trimming. It checked candidate display names, proposed or rejected aliases, and close-neighbour terms against all 414 current reference display names/aliases and all 16 forms.

No candidate display name or recommended alias has an exact normalized collision with a current reference or form. The only exact collisions among the 49 candidate, rejected, and near-neighbour search keys are:

| Searched key | Current exact owner | Disposition |
| --- | --- | --- |
| dark brown sugar | English alias on ingredient-ref-brown-sugar | Existing brown-sugar alias; do not attach to muscovado. |
| light brown sugar | English alias on ingredient-ref-brown-sugar | Existing brown-sugar alias; do not attach to muscovado. |

Nearby existing keys also confirm that brown sugar belongs to ingredient-ref-brown-sugar, while sugar and sucre belong to ingredient-ref-granulated-sugar. None of these generic terms is proposed as a regional alias. No candidate term has an exact active form match.

All **114 serialized recipe JSON files** were searched for exact whole-term mentions of jaggery, gur, panela, piloncillo, muscovado, demerara, turbinado, rapadura, kokuto, chancaca, panocha, papelón, raspadura, jagré, and relevant spelling variants. The same candidate-term check covered all **1,123 ingredient rows**, including original text, ingredient name, reference ID, notes, and preparation. **No exact candidate term matched.** No recipe relink is indicated.

The proposal directory was scanned for exact candidate-term mentions; no earlier cane-sweetener identity packet exists. The adjacent palm-syrup and date-syrup proposals described above were reviewed manually and remain distinct products.

## Unresolved decisions for coordinator review

1. Confirm whether regional products that share a broad non-centrifugal cane-sugar process should remain separate searchable identities or later share a family/reference model. Do not merge by the Colombian proposed-standard name list alone.
2. Obtain independent Québec French review for gur de canne, sucre muscovado, the OQLF demerara/turbinado terminology conflict, and Okinawa kokuto.
3. Compare the panela and piloncillo product specifications directly before deciding whether an alias relationship is justified. Resolve whether panocha is a true regional synonym or only a product-size/market label.
4. Resolve muscovado’s process/product scope and whether light/dark grades need metadata or separate identities. Do not attach either grade to the existing brown-sugar aliases.
5. Research khandsari, melado/cane syrup, chancaca, papelón, raspadura, tapa de dulce, sucanat, and other regional products in separate source-specific passes.
6. Keep measurement and substitution research open by product/form. Confirm cup capacity, preparation/fill method, and source context before activation. Do not infer density from moisture, package mass, syrup concentration, or a recipe yield.

## Source and query log

All listed sources were accessed **2026-10-09**. Search queries below are recorded to make the source sweep reproducible; source-to-claim notes state the limits of each result.

### Query strings used

- site:fssai.gov.in jaggery gur standard cane juice palm jaggery definition
- site:agrosavia.co panela azúcar de caña definición Colombia official
- site:gob.mx piloncillo azúcar de caña definición
- site:vitrinelinguistique.oqlf.gouv.qc.ca panela piloncillo muscovado demerara sucre
- site:vitrinelinguistique.oqlf.gouv.qc.ca “sucre muscovado” OR “sucre de muscovado”
- site:vitrinelinguistique.oqlf.gouv.qc.ca demerara sucre
- Québec épicerie jaggery jagré gur sucre de canne français
- Québec panela sucre de panela épicerie Montréal
- Canada piloncillo sucre de canne français produit
- Québec sucre muscovado français magasin Canada
- site:govmu.org muscovado sugar definition cane juice Mauritius standard
- muscovado sugar demerara sugar official producer process difference Tate Lyle
- site:gov.co panela definición azúcar no centrifugada caña de azúcar
- site:maff.go.jp kokuto sugar Okinawa sugarcane production black sugar
- Okinawa official kokuto black sugar traditional production sugarcane juice
- rapadura Brazil official standard sugar cane product evaporated juice
- FAO Codex panela jaggery rapadura cane sweetener non centrifugal sugar
- panela 1 cup grams recipe official source cup grams panela
- piloncillo 1 cup grams recipe grams cup authoritative
- muscovado sugar 1 cup grams conversion manufacturer
- demerara sugar cup grams source baking ingredient weights
- site:kingarthurbaking.com/learn/ingredient-weight-chart demerara sugar cup 220 g
- site:kingarthurbaking.com muscovado grams cup
- University Texas recipe piloncillo 100 grams 1/2 cup cookbook PDF
- site:kingarthurbaking.com panela piloncillo substitute jaggery demerara
- site:bonappetit.com piloncillo substitute panela jaggery

### Source-to-claim map

| ID | Source and URL | Claim used / limitation |
| --- | --- | --- |
| WP02-C-S01 | FSSAI, [Food Safety and Standards Regulations, Chapter 2.8: Sweetening Agents including Honey](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_8%20%28Sweetening%20agents%20including%20Honey%29.pdf) | Current text distinguishes general palm/date forms from “Cane Jaggery or Cane Gur” made from sugarcane juice and gives product-quality limits. Those limits are not kitchen measures. |
| WP02-C-S02 | OQLF, [jagré](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26523369/jagre) | Québec terminology entry associates jagré with English “coconut jaggery”; do not use it as an unqualified cane-jaggery alias. |
| WP02-C-S03 | Colombia INVIMA legal compilation, [Resolution 779 of 2006](https://normograma.invima.gov.co/compilacion/docs/resolucion_minproteccion_0779_2006.htm) | Defines panela as a product obtained by extracting and evaporating sugarcane juice, with forms/presentations. This is Colombia-specific product evidence. |
| WP02-C-S04 | FAO/WHO Codex, [Colombia’s proposed new work on a Codex standard for panela](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FShared%2BDocuments%252FArchive%252FMeetings%252FCAC%252Fcac34%252Fcac34_09_Add1f.pdf) | Historical proposal enumerates regional names including panela, piloncillo, jaggery/gur, muscovado/demerara, rapadura, and kokuto. It is a proposal, not proof of current global equivalence or an adopted alias standard. |
| WP02-C-S05 | Mexico Diario Oficial, [NMX-F-596-SCFI-2016, piloncillo](https://dof.gob.mx/nota_detalle_popup.php?codigo=5426943) | Defines piloncillo as 100% sugarcane-juice product for human consumption, in block or granulated form. The full standard is referenced, not reproduced on the notice page. |
| WP02-C-S06 | OQLF, [sucre turbinado](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870208/sucre-turbinado) | Gives preferred French terms sucre turbinado and sucre demerara in one entry and describes crystal-size variants. This conflicts with distinct trade/product naming; ambiguity is retained. |
| WP02-C-S07 | Canadian Sugar Institute, [Les types de sucre au Canada](https://sugar.ca/sugar-basics/types-of-sugar?lang=fr) | Canadian French source with separate headings/descriptions for demerara, muscovado, and turbinado; useful product/naming evidence, not a government standard. |
| WP02-C-S08 | Tate & Lyle Sugars, [Our Products](https://www.wearetateandlylesugars.com/our-products/) | Producer lists unrefined demerara, light/dark muscovado, and light/dark soft brown as distinct products. Product range does not set a universal definition for other manufacturers. |
| WP02-C-S09 | Brazil ANVISA, [RDC 723/2022, as amended](https://anvisalegis.datalegis.net/action/ActionDatalegis.php?acao=abrirTextoAto&codTipo=&cod_menu=1696&cod_modulo=134&desItem=&desItemFim=&numeroAto=00000723&orgao=RDC%2FDC%2FANVISA%2FMS&pesquisa=true&seqAto=002&tipo=RDC&valorAno=2022) | Defines rapadura as a solid cane-juice concentrate and melado as concentrated cane juice or melted rapadura; supports solid/liquid product separation. |
| WP02-C-S10 | Japan MAFF, [Product Summary: Okinawa Kokuto, GI Registration 172](https://www.maff.go.jp/e/policies/intel/gi_act/register/260319_2.html) | Official English GI product name and description Okinawa Kokuto (Okinawa brown sugar); regional product, not generic brown sugar. |
| WP02-C-S11 | Okinawa Prefecture Black Sugar Cooperative, [How Okinawa Kokuto is made](https://www.okinawa-kurozatou.or.jp/story/p2) | Producer-association account of cane-juice pressing, filtering, concentration, cooling, and shaping; contrasts uncentrifuged kokuto with sugar products separated/refined from molasses. Producer source is specific to Okinawa kokuto. |
| WP02-C-S12 | Mayrand, [Sucre brun panela pur de canne](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/autre/sucre-brun-panela-pur-de-canne-frutas-31725) | Québec French-market product wording for panela. The 1 kg package label is not a cooking conversion. |
| WP02-C-S13 | Spice Divine, [Punjab King Pesi Gur Jaggery](https://spicedivine.ca/fr/products/pkpunjabipesigurjaggery1kg) | Québec retailer’s French page names gur/jaggery and describes a cane-juice product. Retail copy supports local observed naming, not a universal formula or official fr-CA term. |
| WP02-C-S14 | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) | Publishes the demerara and turbinado cup-weight observations recorded above. Cup capacity and row-specific measuring method are unstated. |
| WP02-C-S15 | UTSA Libraries, [Recetas, Vol. 2: Salud](https://lib.utsa.edu/sites/default/files/UTSA-Special-Collections-Recetas-Vol-2-Salud-Cookbook-2020.pdf) | University special-collections cookbook publishes 100 g (about 1/2 cup) piloncillo in Café de Olla; product is described as cone-sold Mexican brown sugar. Recipe observation only. |
| WP02-C-S16 | Saveur, [Panagam (Indian Ginger and Lime Drink)](https://www.saveur.com/indian-ginger-and-lime-drink-recipe/) | One recipe publishes 3 tbsp / 1/2 oz grated, unqualified jaggery for a two-cup drink. It does not identify cane versus palm source. |
| WP02-C-S17 | King Arthur Baking, [A guide to different types of sugars, how to use them, and when to substitute](https://www.kingarthurbaking.com/blog/2023/03/21/a-guide-to-different-types-of-sugars-how-to-use-them-and-when-to-substitute) | Source-scoped substitution guidance for muscovado/brown sugar, whole cane sugars, and demerara/turbinado, with by-weight versus topping-volume context; not an identity standard. |
| WP02-C-S18 | King Arthur Baking, [What can I substitute for brown sugar?](https://www.kingarthurbaking.com/blog/2020/03/04/substitute-for-brown-sugar) | Particle-size and recipe-style caution for turbinado in cakes/cookies; does not establish a universal swap. |
| WP02-C-S19 | Bon Appétit, [Café de la Olla](https://www.bonappetit.com/recipe/caf-de-la-olla) | Recipe-scoped equal-weight piloncillo-to-packed-dark-brown-sugar instruction for one coffee preparation, with a 7–8 oz cone and about six-cup yield. Not a generic rule. |
| WP02-C-S20 | Place des Épices, [Sucre rapadura](https://www.placedesepices.com/produit/sucre-rapadura-bio-de-bolivie/) | French-language retail wording sucre rapadura; outside Québec and not authoritative for a Québec display term or cross-regional synonymy. |

No source listed here is used to infer a density or to activate a runtime substitution rule.

## Coordinator integration result

Accepted eight distinct sweetener references: cane jaggery / gur de canne, panela, piloncillo,
muscovado sugar, demerara sugar, turbinado sugar, rapadura, and Okinawa kokuto. The selected
aliases remain narrow; unsupported cross-product equivalences stay out of the active catalog.
Source-specific piloncillo and sugar observations/substitution findings remain in the ledger only.
No density, unit mapping, or runtime substitution rule was activated. Québec terminology review
remains open for cane jaggery, muscovado grade wording, and Okinawa kokuto.

Canonical post-merge snapshot: 446 ingredient references, 16 forms, 612 research-ledger records,
99 legacy candidates, 114 recipes, and 1,123 ingredient rows. The wider Section C checklist remains
open.
