# WP05 Section V — Residual Spirits and Culinary Liqueurs

- Date: 2026-10-12
- Status: proposal only; no catalog, recipe, evidence-ledger, workflow, roadmap, or plan files changed.
- Scope: rum/rhum, whisky/whiskey, vodka, grappa, generic eau-de-vie, generic liqueur/cordial, and the existing Frangelico identity. Preserve the accepted brandy review and its Cognac/Armagnac boundary.
- Exclusions: sake, mirin and its types, rice wines, Shaoxing, and salted or sweetened cooking-wine products are covered by the separate WP05 culinary-alcohol and cooking-wine reviews; they are not reconsidered here.

## Recommendation

Promote four distinct, identity-only candidates for planned catalog coverage: rum, whisky, vodka, and grappa. Their product classes have stable Québec French terms and are separately named in Canadian compositional standards. Use the existing OTHER category, as for the active brandy and wine references. No recipe line in this bundle currently requests them, so this is not a recipe-linking proposal.

Keep generic eau-de-vie and generic liqueur/cordial held. The OQLF defines eau-de-vie as an umbrella for multiple simple spirits, including rum, whisky, and cognac; bare eau-de-vie does not identify one ingredient class for this catalog. Canadian standards group “liqueur or spirituous cordial” as a defined beverage class, but bare cordial is used differently across contexts and OQLF marks English cordial as chiefly American for liqueur. A future exact recipe term or named product should determine whether to add a generic class or a specific liqueur identity.

Keep the existing Frangelico liqueur identity active with its exact recipe link and no alias changes. Preserve the approved brandy / eau-de-vie de vin row. Do not alias generic brandy to Cognac, Armagnac, grappa, fruit spirits, or bare eau-de-vie. Keep Cognac and Armagnac held as distinct named-product candidates pending recipe demand; if required later, use cognac / cognac and armagnac / armagnac as the bilingual displays, with no generic-brandy alias.

Add no forms, density, unit mappings, measures, conversions, yields, or substitutions. Do not infer alcohol content or recipe interchangeability from names or product classes.

## Snapshot and audit

The live split package at the review snapshot contains **1,181 active ingredient references, 85 forms, 114 manifest recipes, and 1,123 ingredient rows**. The legacy-import file contains **66 candidates**. These are the current shared-workspace counts at this review, not the earlier counts recorded in the culinary-alcohol proposal.

The exact active entries relevant to this review are:

| Reference | Current display and aliases | Audit result |
|---|---|---|
| ingredient-ref-brandy | EN brandy; FR brandy; FR alias eau-de-vie de vin; no EN aliases | Preserve the accepted identity and one existing recipe link. The brandy proposal explicitly excludes Cognac, Armagnac, fruit spirits, and generic eau-de-vie from aliases. |
| ingredient-ref-frangelico-liqueur | EN frangelico liqueur; FR liqueur Frangelico; no aliases | Preserve as the named liqueur used by recipe 021#21. No generic liqueur or cordial alias is warranted by that line. |

The active-reference scan found no rum/rhum, whisky/whiskey, vodka, grappa, generic eau-de-vie, Cognac, Armagnac, generic liqueur, or cordial identity or alias. The forms file has no matching spirit or liqueur forms. The 66 legacy candidates have no exact-name or alias hit for those terms. Proposed IDs ingredient-ref-rum, ingredient-ref-whisky, ingredient-ref-vodka, and ingredient-ref-grappa are unallocated in both the active and legacy catalogs.

The focused recipe scan covered the originalText and ingredientName fields of every ingredient row in all 114 manifest recipes, using case-, accent-, and punctuation-normalized word matching. It found two in-scope rows:

| Recipe row | Exact ingredient line | Existing owner | Result |
|---|---|---|---|
| 021#21 | 30 ml Frangelico liqueur | ingredient-ref-frangelico-liqueur | Preserve unchanged. This is demand for the named Frangelico product, not generic liqueur. |
| 057#25 | 1 tbsp brandy | ingredient-ref-brandy | Preserve unchanged under the accepted brandy review. |

A wider spelling sweep also found four maraschino cherry / maraschino cherry juice rows. These are cherry products, not maraschino liqueur or another spirit, and remain outside this review. No recipe ingredient row requests rum, whisky/whiskey, vodka, grappa, bare eau-de-vie, Cognac, Armagnac, generic liqueur, or cordial. No alcohol-related form or legacy candidate was found.

## Candidate dispositions and bilingual labels

| Candidate | Recommendation | Proposed exact display and alias scope | Boundary |
|---|---|---|---|
| Rum | Add identity-only candidate ingredient-ref-rum. | EN rum; fr-CA rhum; no aliases. | OQLF gives rhum as the preferred Québec French term and rum in English. Do not use rhum as the English display or add dark, white, golden, spiced, or regional descriptors as global aliases. The Canadian standard defines rum separately from other spirits. |
| Whisky / whiskey | Add identity-only candidate ingredient-ref-whisky. | EN whisky; fr-CA whisky; EN alias whiskey; FR alias whiskey. | OQLF lists whisky and whiskey as preferred French terms and as English terms. Its note associates the spelling whiskey with Irish and American whisky; keep region-qualified terms and styles such as Irish, American, Scotch, bourbon, and rye outside the generic alias set. If the catalog later separates a named style, revisit the broad spelling alias then. |
| Vodka | Add identity-only candidate ingredient-ref-vodka. | EN vodka; fr-CA vodka; no aliases. | OQLF uses vodka in both languages; the Canadian standard defines vodka as its own class. Do not alias neutral alcohol, flavoured vodka mixes, or other spirits to the unqualified name. |
| Grappa | Add identity-only candidate ingredient-ref-grappa. | EN grappa; fr-CA grappa; no aliases. | OQLF uses grappa in both languages and defines it as an Italian grape-pomace spirit. Canadian standards list grappa separately from generic wine brandy and define the grape-pomace boundary. Do not alias grappa to brandy, generic fruit spirit, marc, or pomace. |
| Generic eau-de-vie | Hold; do not allocate a generic active identity or alias. | No active label or aliases proposed. OQLF’s exact broad term is eau-de-vie; its English record also uses eau-de-vie. | OQLF treats eau-de-vie as a category including several named spirits. The accepted brandy row already has the narrower French alias eau-de-vie de vin; do not shorten it to eau-de-vie or broaden it to fruit spirits. |
| Generic liqueur / cordial | Hold; do not allocate a generic active identity or alias. | If later demanded, the candidate display would be EN liqueur / fr-CA liqueur, without a bare cordial alias. | OQLF’s Québec French display is liqueur; its English entry lists cordial as a United States term. Canada’s standard names the shared class “Liqueur or Spirituous Cordial,” but that does not make every recipe word cordial a clear liqueur. If an exact recipe uses the legal qualifier, review spirituous cordial / cordial spiritueux separately. |
| Cognac and Armagnac | Hold as separate named-product candidates; preserve existing brandy decision. | If later demanded: EN Cognac / fr-CA cognac; EN Armagnac / fr-CA armagnac; no generic-brandy aliases. | OQLF describes Cognac and Armagnac as brandy types with specific standards, and the Canadian standard excludes each from its generic brandy section. They remain distinct from the existing brandy entry. |
| Frangelico liqueur | Keep existing identity active; no new identity or alias change proposed. | Existing EN frangelico liqueur / fr-CA liqueur Frangelico; no aliases. | The one recipe line names this product. Current Québec and Ontario listings identify Frangelico as a liqueur, but their product descriptions do not justify a broad hazelnut-liqueur alias, generic liqueur link, or any recipe conversion. |

The “Add” recommendations above are identity-only catalog candidates for the planned Section V coverage. They do not create recipe demand, imply that every style is interchangeable, or prescribe a substitution. If the integration lead chooses to defer identities until a recipe requests them, the term and product boundaries in this table still apply.

## Naming and product limits

- Keep rum/rhum distinct from generic eau-de-vie and brandy. The OQLF and Canadian standard identify cane-derived rum as its own spirit class.
- Keep generic whisky/whiskey separate from region- or style-qualified names. OQLF and Canadian standards distinguish the generic class from named Canadian, Scotch, Irish, rye, bourbon, and other whisky categories. Do not add a regional/style alias without source-specific review.
- Keep vodka as its own named class; do not infer its base or production details from a recipe name.
- Keep grappa separate from wine-distilled brandy. The Canadian standard lists grappa separately and defines its grape-pomace input; OQLF’s Québec display is the Italian name grappa.
- Leave generic eau-de-vie broad and unlinked. Do not apply it as an alias to the active brandy, rum, whisky, vodka, or grappa identities.
- Keep the existing branded Frangelico row specific. A product listing’s brand name and description establish a named retail liqueur, not a recipe-wide class alias or ingredient formula.
- Generic cordial should not become a global alias for liqueur. Use exact source wording and product context if a future recipe names a cordial.
- No recipe substitution, measure, density, cooking loss, or residual-alcohol conclusion is supported by this review.

## Sources

Sources were reviewed on 2026-10-12. OQLF records support Québec terminology and stated category boundaries. CFIA standards support Canadian product-class distinctions. Retail listings identify the named Frangelico product only.

| Source | Evidence and limit |
|---|---|
| OQLF, [rhum (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17026721/rhum) | Preferred Québec French is rhum; English is rum. The definition identifies the cane-juice/molasses class. It provides no cooking measure or substitution. |
| OQLF, [whisky (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26543819/whisky) | Lists whisky and whiskey as preferred French terms and English spellings. Its note scopes the whiskey spelling to Irish and American whisky. |
| OQLF, [vodka (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17039537/vodka) | Gives vodka as the Québec French and English term. |
| OQLF, [grappa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8416992/grappa) | Gives grappa as the preferred term in French and English and defines it as an Italian grape-pomace eau-de-vie. |
| OQLF, [eau-de-vie (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17017711/eau-de-vie) | Defines a broad class of simple spirits and explicitly includes cognac, rum, and whisky as examples. This supports holding the unqualified umbrella separate from specific identities. |
| OQLF, [liqueur (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363141/liqueur) | Québec French display is liqueur; the English term list includes liqueur and United States cordial. The entry does not make bare cordial a universal English equivalent. |
| OQLF, [brandy (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/23399232/brandy) | Defines brandy as wine-distilled and identifies Cognac and Armagnac as specific types. The prior WP05 brandy proposal remains the catalog decision. |
| OQLF, [spiritueux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8395067/spiritueux) | Distinguishes simple spirits/eaux-de-vie from compound spirits, including liqueurs. Supports keeping the generic categories distinct. |
| CFIA, [Canadian Food Compositional Standards, Volume 2 — Alcoholic Beverages](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §§2.1, 2.2, 2.4.1–2.4.5, 2.5.1 and 2.6.1 | Separates whisky/whiskey, rum, brandy, grappa, liqueur/spirituous cordial, and vodka product classes; generic brandy excludes grappa, Cognac, and Armagnac. The standard defines class boundaries; it does not establish that a recipe may substitute one class for another. |
| CFIA, [Labelling requirements for alcoholic beverages](https://inspection.canada.ca/en/food-labels/labelling/industry/alcoholic-beverages) | Explains that a liqueur’s flavour designation is grouped with the common name, and states a cream-containing beverage cannot use the standardized common name liqueur. This is labelling guidance, not an ingredient-level recipe rule. |
| LCBO, [Frangelico](https://www.lcbo.com/en/frangelico-169441) | Current Ontario listing uses the product name Frangelico and calls the named product a liqueur. The listing does not provide a complete ingredient statement or recipe conversion. |
| SAQ, [Frangelico](https://www.saq.com/fr/11098761) | Current Québec listing identifies Frangelico as a liqueur and describes its hazelnut product character. It does not establish an alias for all hazelnut liqueurs or provide a complete ingredient statement. |

## Limits

This is a documentation-only review. It does not edit seed references, forms, recipes, legacy candidates, the research ledger, workflow, roadmap, or plan. It does not claim product-level alcohol content, ingredient formulas, or universal meanings for regional/style labels. It does not add measurements, conversions, cooking guidance, yields, or substitutions.

No tests or emulator checks were run because the requested deliverable is proposal-only.
