# WP03 Section F R94: Sprouted Sorghum Grain Review

Review date: 2026-10-14  
Scope: proposal only; no shared catalog, ledger, plan, checklist, or roadmap edits.

## Candidate and recommendation

Candidate: plain whole sorghum grain that has been sprouted, dried, and sold as a shelf-stable raw product for cooking. The reviewed current product is titled **PureLiving Sprouted Sorghum Grain**. Its ingredient statement is “Organic Whole Grain Sprouted Sorghum”; the product page says the grain is sprouted and dried and instructs users to cook it before consumption.

Recommendation: **hold catalog integration** pending an unambiguous Quebec French product name and product-specific safety/process evidence for the dried sprouted grain. The sources establish that a distinct product is sold and give product-specific cooking directions. They do not establish Quebec consumer naming or validate the processing controls relevant to cyanide in sorghum sprouts. This is an evidence gap, not a finding that the cited product is unsafe.

If later approved, treat it as a distinct identity-only `GRAIN_AND_CEREAL` reference, following the existing review pattern for dried sprouted whole grains. Do not make it a form of ordinary grain sorghum: sprouting and drying are material identity changes, and no conversion between the two is established. Do not reserve an ID, add aliases, measures, forms, or substitutions from this proposal.

## Exact boundary

Include only whole sorghum grain that is sprouted, dried, and intended to be cooked before eating. The evidence reviewed does not support treating all products described simply as “sprouted sorghum” as the same product.

Keep these neighboring products outside this candidate:

- ordinary grain sorghum (`grain sorghum / sorgho à graine`), including whole raw jowar;
- sorghum flour, sprouted or malted sorghum flour, malted sorghum, sorghum grits (`gruau de sorgho`), and sorghum semolina;
- puffed or popped sorghum;
- fresh living sprouts, shoots, rootlets, sorghum grass or forage, and seed sold for germination;
- composite cereal mixes, toppings, beverages, and products where sorghum is only one component.

The distinction from malted or sprouted flour is important: the earlier WP02 A7 review concerns flour, while this proposal concerns a whole dried grain that is sold for cooking. The distinction from fresh sprouts is also important: the cited cooking product is not sold as a ready-to-eat living sprout.

## Catalog and localization assessment

The active catalog already has ordinary grain sorghum with the display pair `grain sorghum / sorgho à graine`, plus separate flour, grits, semolina, and puffed sorghum references. The ordinary grain row has aliases including `jowar whole` and `guinea corn`. Those names should remain attached to that row; they do not establish aliases for the sprouted product.

The reviewed product source attests the English product wording **sprouted sorghum grain**. A targeted search did not find a Quebec French retail/manufacturer label for this dried, cook-before-eating product. OQLF defines `sorgho` as the French name for the plant/grain, and defines `graine germée` generally as a seed with a germ, usually consumed whole and raw. Those sources do not establish a French name that clearly distinguishes this dried cooking grain from fresh sprouts. `Sorgho germé`, `sorgho germé séché`, and `grain de sorgho germé et séché` are therefore working translations only, not approved display text or aliases.

Do not add any of these as aliases before the distinction is settled: `sprouted sorghum`, `sorghum sprouts`, `germinated sorghum`, `sorgho germé`, or `graine de sorgho germée`. The shorter forms can reasonably retrieve fresh sprouts, sprouting seed, malted grain/flour, or other processed products. Broad `sorghum`/`sorgho` search already surfaces several neighboring catalog rows, so the future picker should use a verified exact product name rather than broadening those aliases.

## Measures, forms, and substitutions

The product page gives a brand-specific direction of 1 cup grain to 3 cups water and a 50–60 minute simmer. It also reports 52 g of whole grain per serving, but does not say that this is the mass of one cup. These values do not establish a general dry-grain density, cooked yield, conversion, or standard household measure for the catalog. If a future reference is approved, leave density and unit mappings null and add no grain-to-sprout `IngredientForm` conversion.

The same page suggests the product as a substitute for couscous, bulgur, or barley in soups and side dishes. This is a seller’s qualitative use suggestion; it supplies no tested amount ratio or method-specific adjustment, and no independent corroboration was found. Do not create a global conversion or substitution rule. Any future ingredient-to-ingredient substitution would need a supported ratio and a defined dish, role, or method scope under the project’s contextual-substitution rules.

## Evidence and search demand

Repository scan on 2026-10-14 found no exact existing `sprouted sorghum` / `sorghum germinated` / `sorgho germé` reference, form, legacy ID, proposal, recipe mention, or ledger candidate. The repository snapshot at review time contained 1,426 ingredient references, 104 forms, and 1,765 ledger records; the bundled recipe folder contained 114 files. No bundled recipe currently demonstrates demand for this ingredient. These counts are a point-in-time search record and may change as other work proceeds.

Market evidence is narrow: one current product page with a Canadian country-of-origin statement, plus a Canadian manufacturer’s older wholesale brochure and a wholesale-source directory listing. This supports product existence and some Canadian supply, not Quebec retail availability or broad consumer demand. No quantified search-volume evidence was located; do not characterize demand as high.

## Risks and uncertainties

1. **French identity is unresolved.** `Graine germée` terminology can suggest a fresh, raw sprout, while this candidate is dried and requires cooking. No Quebec product label was located to anchor the user-facing name.
2. **Sorghum sprout cyanide needs product-specific evidence.** Sorghum seeds contain dhurrin, which can release hydrogen cyanide during germination. A primary study found substantially increased potential HCN in laboratory-grown three-day sorghum sprouts and reported that drying and grinding alone did not reduce it. FAO’s sorghum review describes rootlet/shoot removal and subsequent processing as important reduction steps. The current product page says the grain is sprouted and dried but does not document sprout/rootlet removal, final HCN testing, or a validated process. The laboratory findings do not establish the safety of this branded, cooked product; they do justify asking for process or analytical evidence before adopting the category broadly.
3. **Product-specific cooking directions may not generalize.** The 1:3 water ratio and 50–60 minute simmer are from one seller page only.
4. **Search evidence is limited.** The current consumer product evidence is US-facing, and the Canadian wholesale evidence is not a Quebec household-use listing. There is no recipe demand in the bundled set and no search-volume measurement.
5. **Name collision risk.** Short aliases can collapse dried sprouted grain into fresh sprouts, seed for germination, or malted grain/flour.

## Sources

| Source | Evidence used | Limits |
| --- | --- | --- |
| [PureLiving / Shiloh Farms, Sprouted Sorghum Grain](https://shilohfarms.com/pureliving-sprouted-sorghum-grain/) | Current product title and ingredient statement; says grain is sprouted and dried, raw and to be cooked; product-specific 1 cup to 3 cups water and 50–60 minute directions; product page states origin Canada. | US-facing retailer/manufacturer page; does not document rootlet removal, HCN assay, validated safety controls, Quebec French naming, or universal yield/density. |
| [Everspring Farms](https://www.everspringfarms.ca/) | Current Canadian manufacturer site describes sprouting and whole-grain milling. | Current site page reviewed did not identify a current consumer sprouted-sorghum SKU. |
| [Everspring Farms, 2020 bakery brochure](https://www.everspringfarms.ca/wp-content/uploads/2020/10/bakery.pdf) | Lists sprouted sorghum and sprouted sorghum flour in its grain/flour offering. | Older B2B brochure; evidence of past wholesale offering, not present retail availability or Quebec naming. |
| [Whole Grains Council, wholesale ingredient sources](https://wholegrainscouncil.org/find-whole-grains/wholesale-ingredient-sources) | Directory lists Everspring as a source for organic sprouted sorghum, whole and flour, shipping from Seaforth, Ontario. | Wholesale directory, not a consumer label or demand measure. |
| [OQLF, sorgho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho) | Supports `sorgho` as the French base name. | Does not name the processed product. |
| [OQLF, sorgho à graine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19001698/sorgho-a-graine) | Supports the existing bilingual ordinary-grain pair `grain sorghum / sorgho à graine`. | Refers to ordinary grain sorghum, not sprouted grain. |
| [OQLF, graine germée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541740/graine-germee) | General French term and definition for a germinated seed. | Does not settle the name for dried sprouted grain intended to be cooked. |
| [OQLF, gruau de sorgho](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18062438/gruau-de-sorgho) | Supports the separate sorghum-grits product boundary. | Does not apply to whole sprouted grain. |
| Panasiuk & Bills, “Sorghum sprouts: a potential food resource?”, [DOI: 10.1111/j.1365-2621.1984.tb13212.x](https://doi.org/10.1111/j.1365-2621.1984.tb13212.x) | Primary study abstract reports potential HCN concentrations of 258–1,030 ppm in three-day laboratory sprouts; drying at 50°C and grinding did not reduce HCN in that study. | Laboratory cultivars and process; not an assay of the current commercial product or a complete food-safety assessment. |
| FAO, [Sorghum and millets in human nutrition, “Potential toxic factors”](https://www.fao.org/4/T0818e/T0818E09.HTM) | Review explains dhurrin/HCN concerns in germinated sorghum and the role of removing shoots/rootlets and further processing. | General food-science review, not product-specific validation for the cited grain. |
| Girmay et al., [cyanide distribution in sorghum sprouts](https://www.sciencedirect.com/science/article/pii/0308814688900593) | Indexed primary-study abstract reports cyanide concentrated in shoots and roots and discusses their removal with heat/hot-water processing. | Full page access was restricted during review; abstract only. |

## Decision requested from the catalog review

Keep this candidate unintegrated until a Quebec French name for the exact dried cooking grain is supported and product-specific processing or analytical evidence addresses the sprout-stage HCN concern. If those conditions are met, review one identity-only whole-grain reference with the exact source-attested English name and no speculative aliases, forms, density, mappings, or substitution rules.
