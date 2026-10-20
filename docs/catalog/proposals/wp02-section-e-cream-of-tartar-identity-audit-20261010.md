# WP02 Section E — cream-of-tartar identity audit

- **Reviewed:** 2026-10-10
- **Status:** integrated; retain the active identity, add source-backed search aliases, and retain both existing recipe links
- **Scope:** cream of tartar and its boundary from baking soda, baking powder, and compound leaveners
- **Excluded:** ammonium bicarbonate/carbonate, baker’s ammonia, hartshorn, and related names; see the separate [ammonium-leavener proposal](wp02-baking-ammonia-ammonium-leaveners-review-20261009.md)
- **Integration:** aliases and source-backed review are recorded on the existing identity; both recipe links and their authored amounts remain unchanged

## Recommendation

**Integrate this identity review and retain `ingredient-ref-cream-of-tartar`.** Its active English/French names already match OQLF terminology, and the two recipe rows that use it are already linked. Add these OQLF-supported technical search aliases to the existing ID:

| Language | Proposed aliases |
| --- | --- |
| English | `potassium acid tartrate`; `potassium bitartrate` |
| French (Québec) | `hydrogénotartrate de potassium`; `tartrate acide de potassium`; `tartrate monopotassique` |

Keep the current names `cream of tartar` / `crème de tartre`, ID, and `BAKING_AND_SPICE` category. The aliases are terminology only; they do not assert a fixed composition, purity, or conversion. Do not alias cream of tartar to baking soda, baking powder, tartaric acid, ammonium leaveners, or self-rising flour. Do not add a form, density, unit mapping, measurement, or substitution.

The Section E checklist parent item remains open for its other leaveners and the separate ammonium review. This packet closes no broader product family.

## Recipe evidence in the complete 114-recipe manifest

The manifest-listed recipe files were scanned for `cream of tartar`, `crème de tartre`, `tartaric acid`, and `acide tartrique` in ingredient text, ingredient names, preparation, and notes. Exactly two ingredient rows match; both already link to `ingredient-ref-cream-of-tartar`.

| Recipe line | Exact current row | Context and disposition |
| --- | --- | --- |
| 021 Bûche de Noël / Yule Log, `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-15` ([recipe JSON](../../../app/src/main/assets/seed/bundled-library/recipes/021-buche-de-noel-yule-log-30e4274f-19fd-47df-b90b-75a5eefdb2c8.v1.json)) | `originalText`: `1/16 tsp cream of tartar`; `ingredientName`: `cream of tartar`; `ingredientRefId`: `ingredient-ref-cream-of-tartar` | Group: Meringue Mushrooms. The recipe instructs beating egg white, cream of tartar, and salt until foamy, then adding sugar and beating to stiff peaks. **Retain link and authored amount.** The same recipe separately has `1 tsp baking powder` at ingredient `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-7`, linked to `ingredient-ref-baking-powder`, in the cake batter. |
| 068 Chocolate Mousse, `2d53895b-8bd0-4225-bf63-766d29418eac-ingredient-4` ([recipe JSON](../../../app/src/main/assets/seed/bundled-library/recipes/068-mousse-au-chocolat-chocolate-mousse-2d53895b-8bd0-4225-bf63-766d29418eac.v1.json)) | `originalText`: `1/2 tsp cream of tartar`; `ingredientName`: `cream of tartar`; `ingredientRefId`: `ingredient-ref-cream-of-tartar` | The recipe instructs adding cream of tartar to foamy egg whites and beating to soft peaks before adding sugar. **Retain link and authored amount.** This is a stabilizing use, not a baking-powder formula. |

No cream-of-tartar row is unlinked. No new recipe mapping is proposed. The recipe sources support these specific authored uses; they do not support a general recipe substitution or measurement rule.

## Snapshot, active owners, and collisions

Snapshot counts and hashes reflect the shared worktree read on 2026-10-10. Concurrent catalog integration is underway, so re-read before integration. The recipe-corpus hash is over the sorted manifest path, NUL separator, file bytes, NUL separator for each of the 114 listed files.

| Artifact | Snapshot | SHA-256 |
| --- | ---: | --- |
| Manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Active ingredient references | 869 rows | `85041671d69daa5763acd9940cae78131c8ea8d8877680970f14295b9b4826e4` |
| Ingredient forms | 48 rows | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| Research ledger | 1,115 records | `68efe3269ea8b83090bd76ea3e9e558a4159245554cd604050478f37ab734129` |
| Legacy import identities | 78 candidates | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| Manifest-listed recipe corpus | 114 files | `84bc23e6f72f9ecbe51642710e395fde7cf48dcb40abeae676f9d6957fba68b0` |

| Active ID checked | Current identity, aliases, forms, and ledger state |
| --- | --- |
| `ingredient-ref-cream-of-tartar` | `cream of tartar` / `crème de tartre`; no aliases, forms, density, or unit mappings. Ledger state is `unreviewed`; no sources or decisions are recorded. |
| `ingredient-ref-baking-soda` | `baking soda` / `bicarbonate de soude`; English alias `bicarbonate of soda`; French aliases `soda à pâte`, `petite vache`. No form. |
| `ingredient-ref-baking-powder` | `baking powder` / `poudre à pâte`; no aliases or forms. |
| `ingredient-ref-self-rising-flour` | `self-rising flour` / `farine à levure`, with `self-raising flour` / `farine autolevante` aliases. This prepared flour remains a different identity. |

Exact normalized phrase checks found no active, form, legacy, or ledger owner for the proposed technical aliases, for `tartaric acid` / `acide tartrique`, or for the proposed cream-of-tartar ID beyond its current active owner. No ammonium-bicarbonate, ammonium-carbonate, or generic baker’s-ammonia active row appeared in the snapshot; those items are handled by the linked separate proposal.

## Identity boundary and merge-ready outline

OQLF’s GDT names `crème de tartre` as the French preferred term and lists `hydrogénotartrate de potassium`, `tartrate acide de potassium`, and `tartrate monopotassique`; its English terms include `cream of tartar`, `potassium acid tartrate`, and `potassium bitartrate`. CFIA’s permitted food-additive synonym table also lists cream of tartar under potassium acid tartrate. A Canadian supplier’s data sheet labels one product “Cream of Tartar (Potassium Bitartrate)” and gives a product-specific assay. These sources support searchable aliases for this existing identity, but they do not set a catalog-wide composition or purity.

Merge-ready update outline:

```text
retain id: ingredient-ref-cream-of-tartar
retain nameEn: cream of tartar
retain nameFr: crème de tartre
retain category: BAKING_AND_SPICE
aliasesEn: [potassium acid tartrate, potassium bitartrate]
aliasesFr: [hydrogénotartrate de potassium, tartrate acide de potassium, tartrate monopotassique]
defaultDensity: null
unitMappings: []
forms: none
recipe links: retain recipe 021 #15 and recipe 068 #4 as authored
```

Keep `potassium tartrate` without the acid qualifier and `tartaric acid` out of the alias list. The cited OQLF/CFIA naming supports the acid-tartrate terms; it does not establish these broader phrases as aliases. Baking soda is the separate sodium-bicarbonate ingredient. Baking powder is a composite leavener that includes a bicarbonate plus an acid-reacting material and starch or another neutral material under the Canadian compositional standard. Cream of tartar may be one acid ingredient in some baking-powder formulations, but is not the formulated powder itself. The OQLF cream-of-tartar entry’s older note that it can be used “comme levure chimique” is a use statement; the separate OQLF baking-powder entry defines a mixture and marks `poudre à pâte` as the Québec/Canada term.

The Canadian Baker textbook and the two recipe sources describe cream of tartar in egg-white preparations. They do not establish a universal formula for making baking powder. No recipe line here combines cream of tartar with baking soda as a quantified compound leavener. Make no substitution inference from its functional use.

## Separate claim types

- **Identity:** retain `ingredient-ref-cream-of-tartar`; add only the listed terminology aliases. Keep it separate from sodium bicarbonate, compound baking powder, and prepared self-rising flour.
- **Form:** none proposed. The two recipes use the named ingredient directly; no normalized form is needed.
- **Numeric behavior:** preserve `1/16 tsp` and `1/2 tsp` exactly. Add no density, unit mapping, amount conversion, or package measure.
- **Substitution:** none. The evidence describes ingredient function and some baking-powder formulations, not a supported line-specific or global substitution rule.

## Sources and access limits

All sources below were accessed on 2026-10-10.

| Source | Evidence used | Limit |
| --- | --- | --- |
| **WP02-E-TARTAR-20261010-S01** — [OQLF GDT, crème de tartre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086303/creme-de-tartre) | French preferred name, English terms, and technical French/English terms listed above. | Entry was last updated in 1987. Its note describes wine tartar as mainly potassium bitartrate with some calcium tartrate; this is not a current specification for every retail product. |
| **WP02-E-TARTAR-20261010-S02** — [OQLF GDT, bicarbonate de sodium](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26542600/bicarbonate-de-sodium) | Gives `bicarbonate de sodium` and `bicarbonate de soude` as preferred terms, and labels `soda à pâte` as Québec usage; describes sodium bicarbonate as a baking-powder ingredient premixed with an acid. | Terminology/definition entry, updated 2016; it does not define all commercial baking-powder formulas. |
| **WP02-E-TARTAR-20261010-S03** — [OQLF GDT, levure chimique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8409568/levure-chimique) | Defines the powder as a mixture of alkaline salts, acid salts, and neutralizers; identifies `poudre à pâte` as Québec/Canada usage. | Terminology entry, updated 2015; the Canadian legal composition standard below is used for the product boundary. |
| **WP02-E-TARTAR-20261010-S04** — [CFIA, Canadian Food Compositional Standards, Volume 3 — Baking Powder](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Defines baking powder as a combination of sodium or potassium bicarbonate, an acid-reacting material, and starch or another neutral material; acid-reacting material may include tartaric acid or its salts. | Defines the standardized composite product; does not say that every baking powder contains cream of tartar. |
| **WP02-E-TARTAR-20261010-S05** — [CFIA, permitted synonyms for food additives (English)](https://inspection.canada.ca/en/food-labels/labelling/industry/food-additives/permitted-synonyms), [French table](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/additifs-alimentaires/synonymes-autorises) | Lists `Crème de tartre` among permitted synonyms under potassium acid tartrate, supporting label-name search. | A permitted-label-synonym table, not a full compositional or chemical specification. |
| **WP02-E-TARTAR-20261010-S06** — [H&A Canada, Cream of Tartar product data](https://hacanada.com/wp-content/uploads/product/cream-of-tartar.pdf) | Supplier data sheet labels one product as potassium bitartrate and describes its food uses, including egg-white stabilization and mixing with baking soda. | One supplier’s product sheet; its assay is product-specific and is not adopted as a generic catalog purity or measurement. |
| **WP02-E-TARTAR-20261010-S07** — [Understanding Ingredients for the Canadian Baker, “Cream of Tartar”](https://opentextbc.ca/ingredients/chapter/cream-of-tartar/) | Educational source says cream of tartar alone has no leavening capacity, can be used with sodium bicarbonate, and is used to stabilize egg whites. | Canadian baking textbook (2015), not a regulation or product specification. No substitution ratio is used. |
| **WP02-E-TARTAR-20261010-S08** — [Sally’s Baking Addiction, Bûche de Noël (Yule Log)](https://sallysbakingaddiction.com/buche-de-noel-yule-log/) | Primary recipe source places its small cream-of-tartar amount in meringue mushrooms and separately lists baking powder for the cake. | Recipe-specific use and authored quantity only. |
| **WP02-E-TARTAR-20261010-S09** — [Once Upon a Chef, Chocolate Mousse](https://www.onceuponachef.com/recipes/chocolate-mousse.html) | Primary recipe source lists cream of tartar and instructs adding it to egg whites to stabilize their peaks. | Recipe-specific use and authored quantity only. |

## Local references

- [Project requirements](../../../Requirements.md)
- [Section E catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt)
- [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Research ledger](../research-ledger.v1.json)
- [Legacy identity candidates](../legacy-import-identities.v1.json)
- [Recipe 021 — Bûche de Noël](../../../app/src/main/assets/seed/bundled-library/recipes/021-buche-de-noel-yule-log-30e4274f-19fd-47df-b90b-75a5eefdb2c8.v1.json)
- [Recipe 068 — Chocolate Mousse](../../../app/src/main/assets/seed/bundled-library/recipes/068-mousse-au-chocolat-chocolate-mousse-2d53895b-8bd0-4225-bf63-766d29418eac.v1.json)
- [Separate ammonium-leavener proposal](wp02-baking-ammonia-ammonium-leaveners-review-20261009.md)

## Coordinator disposition

Accepted and integrated the OQLF-listed technical aliases on `ingredient-ref-cream-of-tartar`; the active name, ID, category, two recipe links, and authored amounts are unchanged. The ledger records the identity evidence and the absence of supported generic measurement or substitution behavior. No form, density, unit mapping, baking-powder formula, conversion, or substitution was added. Baking soda, baking powder, self-rising flour, tartaric acid, and ammonium leaveners remain separate. The broader Section E checklist remains open.
