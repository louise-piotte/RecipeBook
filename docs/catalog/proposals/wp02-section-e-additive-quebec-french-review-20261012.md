# WP02 Section E additive and hydrocolloid Québec French review

**Status:** review completed and the two recommended French display refinements integrated. This review covers the 22 additive/hydrocolloid reference rows integrated on 2026-10-11 and the three broad pectin grade-class rows integrated on 2026-10-12. The parent WP02 Section E checklist item remains open; the earlier gelling/hydrocolloid and pectin-grade integration work is already complete.

Cross-checked the open catalog-plan checklist, both integration READMEs, the prior gelling-agent and hydrocolloid coordinator reviews, and the named-pectin product-gap proposal. Those proposals left an independent Québec review of compound pectin wording open; this review evaluates the current displays. Root integrated the two recommendations below; the other 23 reviewed displays remain unchanged.

## Recommendation

Recommend two fr-CA display-name refinements. The existing terms are understandable and supported as Canadian ingredient-label terms; these are preferred display choices for this ingredient-reference catalog, not corrections of chemically wrong names. Preserve the former displays and documented Canadian variants as aliases. Retain the other 23 French reference displays as listed below.

| Reference ID | Current `nameFr` | Proposed `nameFr` | Proposed `aliasesFr` | Evidence and reason |
|---|---|---|---|---|
| `ingredient-ref-acacia-gum` | `gomme d'acacia` | `gomme arabique` | `gomme d'acacia`; `gomme sénégal` | OQLF gives **gomme arabique** as its preferred food-additive term and maps it to *gum arabic*, *gum acacia*, and *acacia gum*. CFIA uses **Gomme d'acacia** as the Canadian common name and lists **Gomme arabique** and **Gomme sénégal** as permitted synonyms. A Québec retailer also labels the ingredient gomme arabique. Move the existing `gomme arabique` alias into `nameFr` and retain the current name as a search alias. [S01–S03] |
| `ingredient-ref-sodium-carboxymethyl-cellulose` | `carboxyméthyl cellulose de sodium` | `carboxyméthylcellulose sodique` | `carboxyméthyl cellulose de sodium`; `carboxyméthyl cellulose sodique` | OQLF lists **carboxyméthylcellulose sodique** among the preferred terms; TERMIUM marks that exact sodium-specific term correct for CAS 9004-32-4. CFIA uses the current display as its common name and lists the spaced **carboxyméthyl cellulose sodique** as a permitted synonym. Keep both Canadian label spellings searchable. [S02, S04–S05] |

For the sodium carboxymethyl cellulose row, retain the current English aliases in this batch: `carboxymethyl cellulose sodium`, `carboxymethyl cellulose`, `cellulose gum`, `modified cellulose`, and `sodium cellulose glycolate`. TERMIUM supports *sodium cellulose glycolate* as an English synonym. CFIA lists the related French labels *gomme de cellulose*, *cellulose modifiée*, and *glycolate sodique de cellulose* under sodium CMC; it also lists *cellulose modifiée* under methyl ethyl cellulose, so this alias is broad. There is no exact normalized-phrase collision in the current catalog; keep it as a source synonym rather than a display term and recheck it if more cellulose derivatives are integrated. OQLF likewise warns that *cellulose gum* is too vague for literal translation, so it should not replace the sodium-specific French display. [S02, S04–S05]

## Display and alias disposition for all 25 integrated rows

“Retain” means keep the current French display unchanged. Alias lists below are the current lists, except for the two recommendations above, where they show the proposed French alias set. `—` means no aliases are present or recommended.

| Reference ID | English display | Current fr-CA display | Current English aliases | Current / proposed French aliases | Disposition |
|---|---|---|---|---|---|
| `ingredient-ref-acacia-gum` | acacia gum | gomme d'acacia | acacia | gomme arabique; gomme sénégal | Prefer `gomme arabique`; retain former display as alias. [S01–S03] |
| `ingredient-ref-agar` | agar | agar-agar | — | — | Retain. OQLF’s food-additive entry gives agar-agar and notes that agar is the English term. [S08] |
| `ingredient-ref-calcium-chloride` | calcium chloride | chlorure de calcium | — | — | Retain. Canadian French additive list distinguishes it as a firming agent. [S07] |
| `ingredient-ref-calcium-gluconate` | calcium gluconate | gluconate de calcium | — | — | Retain. Canadian French additive list distinguishes it as a firming agent. [S07] |
| `ingredient-ref-calcium-lactate` | calcium lactate | lactate de calcium | — | — | Retain. Canadian French additive list distinguishes it as a firming agent. [S07] |
| `ingredient-ref-carrageenan` | carrageenan | carraghénine | carrageenin | carragénine; carraghénane | Retain. OQLF prefers carraghénine and records carraghénane among the French terms; CFIA lists both forms. [S02, S09] |
| `ingredient-ref-carrageenan-iota` | iota carrageenan | carraghénane iota | — | — | Retain. FAO confirms the iota subtype; current French technical supplier wording uses carraghénane iota. [S10, S20] |
| `ingredient-ref-carrageenan-kappa` | kappa carrageenan | carraghénane kappa | — | — | Retain. FAO confirms the kappa subtype; current French technical supplier wording uses carraghénane kappa. [S10, S20] |
| `ingredient-ref-carrageenan-lambda` | lambda carrageenan | carraghénane lambda | — | — | Retain. FAO confirms the lambda subtype; current French technical supplier wording uses carraghénane lambda. [S10, S20] |
| `ingredient-ref-gellan-gum` | gellan gum | gomme gellane | — | — | Retain. TERMIUM and the Canadian synonym table support this French form. [S02, S11] |
| `ingredient-ref-guar-gum` | guar gum | gomme de guar | — | — | Retain. OQLF and the Canadian additive list use this term. [S06, S12] |
| `ingredient-ref-locust-bean-gum` | locust bean gum | gomme de caroube | carob bean gum; carob gum | gomme du caroubier | Retain. OQLF prefers gomme de caroube; CFIA confirms gomme du caroubier as a synonym. [S02, S13] |
| `ingredient-ref-methylcellulose` | methylcellulose | méthylcellulose | — | — | Retain. This is the current Canadian French additive-list term. [S06] |
| `ingredient-ref-pectin` | pectin | pectine | — | — | Retain. OQLF and Health Canada use pectine. [S06, S17] |
| `ingredient-ref-pectin-high-methoxyl` | high-methoxyl pectin | pectine HM | HM pectin | pectine hautement estérifiée | Retain. French technical usage uses HM and expands it as hautement estérifiée. [S18] |
| `ingredient-ref-pectin-low-methoxyl` | low-methoxyl pectin | pectine LM | LM pectin | pectine faiblement estérifiée | Retain. French technical usage uses LM and expands it as faiblement estérifiée. [S18] |
| `ingredient-ref-pectin-low-methoxyl-amidated` | amidated low-methoxyl pectin | pectine LM amidée | LMA pectin; amidated LM pectin | — | Retain. LM/LMA and amidated are the established technical grade wording; do not collapse this class into unamidated LM pectin. [S18] |
| `ingredient-ref-pectin-medium-rapid-set` | Medium Rapid Set pectin | Pectine Medium Rapid Set | — | — | Retain the manufacturer’s French grade label; do not translate the setting class into a broader descriptive phrase. [S18–S19] |
| `ingredient-ref-pectin-nh-nappage` | Pectin NH Nappage | Pectine NH Nappage | — | — | Retain the established French product-grade wording; keep supplier formulas product-scoped. [S18–S19] |
| `ingredient-ref-pectin-rapid-set` | Rapid Set pectin | Pectine Rapid Set | — | — | Retain the manufacturer’s French grade label; do not translate the setting class into a broader descriptive phrase. [S18–S19] |
| `ingredient-ref-pectin-yellow` | yellow pectin | pectine jaune | — | — | Retain. Current French technical product sources use pectine jaune. [S18–S19] |
| `ingredient-ref-psyllium-husk` | psyllium husk | tégument de psyllium | — | — | Retain. Health Canada describes psyllium as the dried tégument separated mechanically from the seed. [S16] |
| `ingredient-ref-sodium-alginate` | sodium alginate | alginate de sodium | — | — | Retain. OQLF gives alginate de sodium; Health Canada’s list uses the same French form. [S06, S15] |
| `ingredient-ref-sodium-carboxymethyl-cellulose` | sodium carboxymethyl cellulose | carboxyméthyl cellulose de sodium | carboxymethyl cellulose sodium; carboxymethyl cellulose; cellulose gum; modified cellulose; sodium cellulose glycolate | carboxyméthyl cellulose de sodium; carboxyméthyl cellulose sodique | Prefer `carboxyméthylcellulose sodique`; retain both Canadian spellings as French aliases. Retain English aliases with the scope caveat above. [S02, S04–S05] |
| `ingredient-ref-xanthan-gum` | xanthan gum | gomme de xanthane | — | — | Retain. OQLF gives gomme de xanthane. [S14] |

The other current French displays are clear, idiomatic ingredient terms or established supplier grade labels. No additional correction is supported by the sources reviewed. The generic existing `ingredient-ref-gelatin` display `gélatine` is retained; it predates these 25 integrations and is included only for recipe-demand context.

## Forms, identity boundaries, and data scope

The five in-family forms remain unchanged and are outside this reference-name proposal: `agar-agar en flocons`, `agar-agar en poudre`, `gélatine en poudre`, `gélatine en feuilles`, and `tégument de psyllium en poudre`. All 25 reviewed reference rows currently use category `BAKING_MIXIN_AND_PANTRY`, null default density, and empty unit mappings. No form, formula, recipe link, conversion, or substitution is proposed.

The pectin recommendations concern broad display labels only. The named yellow, Rapid Set, Medium Rapid Set, HM, LM, LMA, and NH Nappage rows remain distinct as currently modeled. Product-source wording does not justify merging supplier-specific formulas, claiming interchangeability, adding aliases between grades, or adding pectin quantities or processing rules. [S18–S19]

## Bundled recipe demand

The full current manifest lists 114 recipe JSON files: 1,123 ingredient rows and 752,942 bytes. A full scan of each manifest-listed file’s ingredient references and bilingual recipe text found no mention or linked row for any of the 25 new additive/hydrocolloid references. The only in-family ingredient demand is for the older generic gelatin reference: recipe 056 has three `5 g` ingredient rows linked to `ingredient-ref-gelatin` (ingredient IDs ending `ingredient-10`, `ingredient-17`, and `ingredient-23`). Its French and English instructions also mention gélatine/gelatin. These existing rows do not request a new reference, form, or substitution.

## Snapshot and integrity audit

Read-only audit captured before root integration of the two French display refinements on 2026-10-12. It is retained as the review baseline, not the current package snapshot. The recipe corpus digest is SHA-256 over sorted manifest basenames, NUL, exact file bytes, NUL.

| Inventory | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,197 | `4d12c120489d6076127f3b797f439ebdafbe8b1db4706c46b8c6467b8b699be1` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Bundled manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,499 records; 5,048 source references; 4,118 distinct source IDs | `4fcb1fc52a2387b821f5293945576d337a2e01b7e60082fea5b3816241e0ea89` |
| Legacy import identities | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Generated `BundledIngredientCatalog.kt` | 1,197 references | `af8843593fe3c677b8b076c147bdd35f03e2a773a29ec3262084d661138026f2` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 bytes | `b70a826e18497a37ce343f6c98cafa143d573dd59704ea6022bb034b2640e5a2` |

The 25 target rows had 75 source references from 29 distinct source IDs at review time. Normalized exact phrase ownership, using the app’s ingredient-search folding rules, found no duplicate owner for any current family display or alias across active references, forms, and legacy candidates. The integrated French aliases also have no competing exact owner.

## Source ID audit

The review uses 20 packet-local source IDs in the required namespace, with each distinct ID listed once below. Before drafting, this namespace had no match in the current ledger source IDs or other proposal files. Root added S01–S05 to the two affected ingredient-reference ledger records. S06–S20 remain review evidence for unchanged French displays and were not added to those records.

| Full source ID | Source and evidence used |
|---|---|
| `WP02-E-ADDITIVE-FR-20261012-S01` | [OQLF, gomme arabique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086360/gomme-arabique) — preferred Québec food-additive term and English equivalents. |
| `WP02-E-ADDITIVE-FR-20261012-S02` | [CFIA, Tableau des synonymes autorisés pour les additifs alimentaires](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/additifs-alimentaires/synonymes-autorises) — Canadian common names and permitted French/English synonyms for acacia gum, carob bean gum, gellan gum, carrageenan, and sodium carboxymethyl cellulose. |
| `WP02-E-ADDITIVE-FR-20261012-S03` | [Chocolat-Chocolat, gomme arabique / poudre d’acacia](https://www.chocolat-chocolat.com/fr/produit/gomme-arabique-poudre-dacacia-16oz/) — Québec retailer label uses gomme arabique and identifies it with acacia gum. |
| `WP02-E-ADDITIVE-FR-20261012-S04` | [OQLF, carboxyméthylcellulose (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086317/carboxymethylcellulose) — preferred terms include carboxyméthylcellulose sodique; notes that cellulose gum is too vague for literal translation. |
| `WP02-E-ADDITIVE-FR-20261012-S05` | [TERMIUM Plus, sodium carboxymethylcellulose](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frw&lang=eng&srchtxt=CELLULOSE+GLYCOLATE+SODIUM) — confirms carboxyméthylcellulose sodique as correct for the sodium compound and marks cellulose glycolate de sodium as avoid. |
| `WP02-E-ADDITIVE-FR-20261012-S06` | [Health Canada, Liste 4 — agents émulsifiants, gélifiants, stabilisants ou épaississants](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/salubrite-aliments/additifs-alimentaires/listes-autorises/4-agents-emulsifiants-gelifiants-stabilisants-epaissisants.html) — current Canadian French additive names including pectine, gomme de guar, gomme de xanthane, alginate de sodium, and methylcellulose. |
| `WP02-E-ADDITIVE-FR-20261012-S07` | [Health Canada, Liste 6 — agents raffermissants](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/salubrite-aliments/additifs-alimentaires/listes-autorises/6-agents-raffermissants.html) — distinguishes chlorure de calcium, gluconate de calcium, and lactate de calcium. |
| `WP02-E-ADDITIVE-FR-20261012-S08` | [OQLF, agar-agar (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086281/agar-agar) — food-additive term and distinction from processed gélose. |
| `WP02-E-ADDITIVE-FR-20261012-S09` | [OQLF, carraghénine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354695/carraghenine) — preferred general term and variants. |
| `WP02-E-ADDITIVE-FR-20261012-S10` | [FAO, carrageenan technical resource](https://www.fao.org/4/ab728e/AB728E09.htm) — French technical subtype wording for kappa, iota, and lambda carraghénane. |
| `WP02-E-ADDITIVE-FR-20261012-S11` | [TERMIUM Plus, gellan gum](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=11&i=&index=enb&lang=fra&sg_kp_wet=1264250&srchtxt=APPROVAL+DRUG) — French food-additive term gomme gellane. |
| `WP02-E-ADDITIVE-FR-20261012-S12` | [OQLF, gomme de guar (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359487/gomme-de-guar) — preferred Québec term. |
| `WP02-E-ADDITIVE-FR-20261012-S13` | [OQLF, gomme de caroube (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086316/gomme-de-caroube) — preferred Québec term. |
| `WP02-E-ADDITIVE-FR-20261012-S14` | [OQLF, gomme de xanthane (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086171/gomme-de-xanthane) — preferred Québec term. |
| `WP02-E-ADDITIVE-FR-20261012-S15` | [OQLF, alginate de sodium (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086077/alginate-de-sodium) — preferred Québec term. |
| `WP02-E-ADDITIVE-FR-20261012-S16` | [Health Canada, Liste des fibres alimentaires évaluées et acceptées](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html) — describes psyllium as tégument separated from the seed. |
| `WP02-E-ADDITIVE-FR-20261012-S17` | [OQLF, pectine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8476811/pectine) — generic Québec term pectine. |
| `WP02-E-ADDITIVE-FR-20261012-S18` | [Louis François, Les pectines](https://louisfrancois.com/les-pectines/) — current French technical wording for HM, LM, LMA, yellow, NH, and setting-grade names; product conditions remain supplier-scoped. |
| `WP02-E-ADDITIVE-FR-20261012-S19` | [Sosa, Pectines](https://www.sosa.cat/fr/categorie-produit/pectines-fr/) — current French catalog labels for yellow, Rapid Set, Medium Rapid Set, NH, and other commercial pectins. |
| `WP02-E-ADDITIVE-FR-20261012-S20` | [AMI Ingredients, Gamme ALGOGEL RCG — Carraghénanes](https://ami-ingredients.fr/wp-content/uploads/2025/10/Gamme-ALGOGEL%C2%AE-RCG-Carraghenanes.pdf) — current French technical catalog uses carraghénane IOTA, KAPPA, and LAMBDA. |

No tests or emulator checks were run. The integrated result and current hashes/counts are recorded in `docs/catalog/batches/wp02-section-e-additive-quebec-french-review-20261012/README.md`.
