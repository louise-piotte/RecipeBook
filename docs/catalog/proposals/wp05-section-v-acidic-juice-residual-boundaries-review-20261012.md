# WP05 Section V — residual acidic-juice product boundaries

- **Date:** 2026-10-12
- **Status:** reviewed boundary audit; its disposition is integrated in the plan, workflow, and roadmap, with no catalog or recipe data changed
- **Scope:** bottled lemon/lime juice subtypes, tamarind water and related liquid preparations, and sour-grape preparations beyond the existing verjuice boundary
- **Retained boundaries:** the existing lemon/lime aliases for fresh and same-fruit reconstituted juice; the integrated verjus/verjuice identity and its narrow sour-grape-juice alias; the integrated tamarind-paste identity; existing pomegranate molasses
- **Source namespace:** WP05-ACID-JUICE-RESIDUAL-20261012-S01 through S13; checked against the live ledger, with no source-ID collision

## Recommendation

Close the product distinction between same-fruit juice reconstituted to ready-to-use strength and water-removed concentrate. The catalog already has precise reconstituted/from-concentrate aliases on the lemon and lime juice references, so no new alias or data change is needed. If an exact recipe later names water-removed lemon or lime concentrate, represent it as a distinct concentrated form under that fruit's juice reference; do not alias the concentrate to ready-to-use juice or invent a dilution rule.

Keep generic bottled lemon/lime wording and brand names held. A bottle is packaging, and a current Canadian brand example is a ready-to-use product made from water, same-fruit concentrate, sulfites, and peel oil. Its own fresh-juice comparisons are brand claims. No recipe row names a bottle, brand, concentrate, or reconstitution step.

Treat tamarind water as a distinct liquid extraction from tamarind fruit or paste, but hold a catalog identity until an exact recipe/product is requested. The phrase eau de tamarin is attested in French culinary sources, but this review did not find an OQLF preferred term for the preparation. Do not alias it to tamarind, tamarind paste, tamarind concentrate, tamarind juice, or a sweetened tamarind drink. A recipe-specific extraction may use different starting material, water, steeping, straining, and strength.

Keep the existing verjuice reference as the only owner for sour grape juice when the source explicitly means acidic juice pressed from unripe grapes. Hold whole unripe grapes, processed koruk sours, dried sour-grape powder, and sour-grape reductions as separate product states pending exact demand. Do not alias them to verjuice, grape juice, vinegar, or pomegranate molasses.

## Decision table

| Candidate | Decision | Exact bilingual wording and owner | Boundary and recipe demand |
|---|---|---|---|
| Ready-to-use lemon juice reconstituted from lemon concentrate | **Alias; already integrated** | FR jus de citron reconstitué / jus de citron fait de concentré; EN reconstituted lemon juice / lemon juice from concentrate. Owner: ingredient-ref-lemon-juice. | The current aliases identify same-fruit juice with water added back. Keep them. Do not apply them to water-removed concentrate. No recipe row requests this product state. |
| Ready-to-use lime juice reconstituted from lime concentrate | **Alias; already integrated** | FR jus de lime reconstitué / jus de lime fait de concentré; EN reconstituted lime juice / lime juice from concentrate. Owner: ingredient-ref-lime-juice. | Same boundary as lemon. Existing aliases remain sufficient; no new row or conversion is needed. |
| Water-removed lemon juice concentrate | **Hold; distinct concentrated form if exact demand appears** | FR jus de citron concentré; OQLF also lists concentré de jus de citron. EN lemon juice concentrate. Parent identity if later activated: ingredient-ref-lemon-juice, with a concentrated form. | CFIA defines named-fruit concentrate separately from juice with water added back. Do not add these names as aliases of ready-to-use lemon juice. No row requests concentrate. |
| Water-removed lime juice concentrate | **Hold; distinct concentrated form if exact demand appears** | FR jus de lime concentré, following the current Canadian French named-fruit pattern and ReaLime ingredient wording; EN lime juice concentrate. Parent identity if later activated: ingredient-ref-lime-juice, with a concentrated form. | OQLF prefers lime and also records citron vert for the fruit; the active recipe catalog uses jus de lime. The term is a descriptive exact product-state label, not a new alias. No row requests concentrate. |
| Generic bottled lemon/lime juice, “fresh bottled,” or a bottled-juice subtype without a stated formulation | **Hold** | No global aliases for FR jus de citron embouteillé, jus de lime embouteillé, jus frais en bouteille, or EN bottled lemon/lime juice. | Packaging alone does not identify whether the product is freshly pressed, reconstituted, pasteurized, preserved, sweetened, or otherwise formulated. No exact recipe/product demand exists. |
| ReaLemon or ReaLime branded product | **Hold as a product-specific name** | FR jus de citron ReaLemon / jus de lime ReaLime; EN ReaLemon lemon juice / ReaLime lime juice. These are the manufacturer’s display names, not proposed global aliases. | The manufacturer says it restores concentrated juice with filtered water and adds peel oil; its ingredient lists also name sulfites. Keep any future recipe link tied to the exact stated product. Do not generalize its fresh-juice claims to every bottle or to a conversion field. |
| Tamarind water / filtered tamarind extraction | **Hold a distinct preparation identity until exact demand** | Provisional source wording: FR eau de tamarin; EN tamarind water. No aliases proposed. | A culinary source defines this as tamarind soaked in warm water and strained. It is a prepared liquid, not a synonym for the whole fruit, paste, concentrate, or drink. The French phrase is source-attested but not verified as an OQLF/Québec preferred term. No recipe row requests it. |
| Tamarind juice or tamarind drink | **Hold; no broad alias** | FR jus de tamarin / boisson au tamarin; EN tamarind juice / tamarind drink. Do not make these aliases of eau de tamarin. | “Juice” wording can refer to a beverage or an extracted cooking ingredient. Require an exact recipe/product context before assigning an owner. |
| Commercial tamarind extract or concentrate | **Hold as distinct from tamarind paste and water** | Example source label: EN Tamarind Concentrate; no Québec French canonical label proposed. If an exact product is later named, preserve its package wording and ingredient statement. | One manufacturer describes a ready-to-use concentrate containing tamarind extract and water and claims that its SKU is three times as potent as tamarind paste. That is product-specific, not a paste-to-water conversion. No recipe row names concentrate. |
| Acidic juice from unripe grapes: verjus/verjuice, āb-ḡūra/ab-ghooreh, or a product explicitly called sour grape juice | **Alias; already integrated, narrowly** | FR verjus; EN verjuice, with the existing EN alias sour grape juice. Owner: ingredient-ref-verjuice. | Keep the existing reference and aliases unchanged. Accept the sour-grape wording only when the product is explicitly juice from unripe grapes. Do not alias green grape juice by color alone, whole grapes, powders, reductions, or vinegar. |
| Whole unripe grapes: ghooreh or koruk | **Hold as a distinct fruit state** | Source terms: Persian ghooreh and Turkish koruk; descriptive glosses are unripe grapes / raisins non mûrs, not proposed catalog aliases or established Québec preferred terms. | Encyclopaedia Iranica and the koruk study distinguish whole sour grapes from their expressed juice. If an exact line later names whole immature grapes, model the fruit state separately from verjuice. No recipe row requests it. |
| Koruk ekşisi / processed “koruk sour” | **Hold as a distinct processed preparation** | Preserve the Turkish product wording koruk ekşisi if an exact product is named; no Québec French canonical equivalent is proposed. | A 2023 study reports that koruk sours are made by processing unripe-grape juice and that production has no standard method. This does not support a verjuice alias, a single concentration, or a general substitution. |
| Dried or powdered unripe grapes, ghooreh powder | **Hold as a distinct dry preparation** | Source wording: ghooreh powder / ḡūra powder; no French alias proposed. | Iranica describes the powder as a separate product and reports that it may be reinforced with āb-ḡūra and then dried. Do not map it to verjuice or to whole grapes. No recipe row requests it. |
| Sour-grape syrup, molasses, or other reduction | **Hold; no bilingual catalog label or alias proposed** | Retain the exact source/product label when demand appears. | The present evidence does not establish a Québec French preferred label or a shared composition. Keep any named reduction distinct from juice and from existing pomegranate molasses. |
| Pomegranate molasses, vinegar, and generic grape juice | **Retain existing owners** | Existing references and boundaries remain unchanged. | This review does not reopen pomegranate molasses/Narsharab, vinegar, or the integrated grape-juice/verjuice distinction. No substitution is proposed. |

## Live package and recipe audit

Snapshot taken on 2026-10-12 from the live split bundled package. File hashes are over exact bytes. The recipe-corpus digest is manifest-order path, NUL, exact recipe bytes, NUL.

| Data | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,190 | 24a913f1af8a0d778d803bcac0624603eee70179c29112f16f2cdce24663e0dd |
| Ingredient forms | 86 | 24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978 |
| Legacy-import candidates | 66 | bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f |
| Research ledger | 1,491 records / 4,983 source entries / 4,066 distinct source IDs / 8 unit conversions | e014f19fdf72353f16ef99adff433ce131eaeef7feafbe2c0e067a659802a914 |
| Manifest recipe corpus | 114 recipes / 1,123 ingredient rows | dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622 |

Current scoped owners:

- ingredient-ref-lemon-juice is jus de citron / lemon juice. Its aliases already include fresh juice and same-fruit reconstituted/from-concentrate wording in French and English.
- ingredient-ref-lime-juice is jus de lime / lime juice. Its aliases already include fresh juice, same-fruit reconstituted/from-concentrate wording, and jus de citron vert.
- ingredient-ref-tamarind and ingredient-ref-tamarind-paste remain separate; the latter is the already integrated pâte de tamarin / tamarind paste identity.
- ingredient-ref-verjuice is verjus / verjuice and already owns only the English alias sour grape juice.
- ingredient-ref-grape-juice is generic ripe-fruit grape juice. It does not own sour grape juice.
- ingredient-ref-pomegranate-molasses remains unchanged.

No current form names lemon/lime juice concentrate, bottled citrus juice, tamarind water/concentrate, or a sour-grape product. The 66 legacy candidates have no scoped exact name or alias. Exact package scans found no residual candidate owner; the only scoped match that is already an alias is sour grape juice on ingredient-ref-verjuice.

All juice-word ingredient rows in the manifest corpus are listed here to make the recipe count reproducible. The owner column reports the live ingredientRefId; “unlinked” means no owner is stored.

| Recipe / row | Exact ingredient text | Current owner |
|---|---|---|
| 007 #5 — Refried Pinto Beans | 5 g vinegar or lime juice | Unlinked compound alternative; leave unchanged. |
| 012 #6 — Lemon Crinkle Cookies | 60 ml fresh lemon juice | ingredient-ref-lemon-juice; structured preparation is fresh. |
| 014 #4 — Blueberry Cake Filling | 1 tbsp lemon juice | ingredient-ref-lemon-juice. |
| 019 #5 — Crab Balls | 2 tsp fresh lemon juice | ingredient-ref-lemon-juice; structured preparation is fresh. |
| 024 #3 — Date Squares | 2 tbsp lemon juice | ingredient-ref-lemon-juice. |
| 028 #5 — Cherry Almond Shortbread Cookies | 1 tbsp maraschino cherry juice | ingredient-ref-jus-du-pot-de-cerises-au-marasquin. |
| 029 #4 — Cherry Cake Filling | 1 tbsp lemon juice | ingredient-ref-lemon-juice. |
| 034 #13 — Classic Beef Chili | 3 tbsp lime juice | ingredient-ref-lime-juice. |
| 067 #6 — My Cherry Blossom Version | 2 tbsp maraschino cherry juice | ingredient-ref-jus-du-pot-de-cerises-au-marasquin. |
| 095 #7 — Satay | 1 tbsp fresh lime juice | ingredient-ref-lime-juice; “fresh” is in original text, not a structured preparation value. |
| 106 #4 — Blueberry Pie | 1/2 tbsp lemon juice | ingredient-ref-lemon-juice. |
| 108 #3 — Raspberry Pie | 1/2 tbsp lemon juice | ingredient-ref-lemon-juice. |
| 113 #5 — Tzatziki | 1 tbsp lemon juice | ingredient-ref-lemon-juice. |

The 13 rows comprise eight lemon-juice rows, two lime-juice rows, two maraschino-jar-juice rows, and one unlinked vinegar-or-lime alternative. There is no ingredient-row demand for bottled or concentrated citrus, tamarind water/juice/extract/concentrate, verjuice beyond the existing owner, whole unripe grapes, koruk sours, sour-grape powder, or sour-grape reductions. No recipe line or link should change.

## Numeric, conversion, and safety limits

- The Canadian compositional standard distinguishes same-fruit concentrate from reconstituted juice: concentrate is water-removed; reconstituted juice is prepared by adding water to concentrate from the same named fruit and must meet that fruit's juice standard [S01–S02]. This closes the identity boundary but gives no household dilution ratio.
- The current standard's lemon/lime specifications are regulatory composition criteria, not kitchen density defaults: lemon juice has at least 8.0 g/100 mL soluble solids and 5.0 g/100 mL citric-acid equivalent at 20 °C; lime juice has a specific gravity from 1.030 to 1.040 at 20 °C/20 °C, at least 8.0 g/100 mL soluble solids, and at least 5.5 g/100 mL citric-acid equivalent at 20 °C [S02]. Do not set ingredient density, concentration, or a fresh-to-bottled conversion from these regulatory limits.
- ReaLemon/ReaLime claims that 50 mL of its product equals 50 mL of fresh lemon/lime juice and that 45 mL equals juice from one medium fruit [S05]. Treat both as manufacturer claims for those products only; add no global measurement, yield, or substitution rule.
- Tamarind extraction methods differ by input and process. One source uses 50 g paste and 1½ cups water in two extractions for about 1 cup of finished tamarind water; another uses 30 g dried pulp with 100 mL hot water and a 30-minute soak [S07–S08]. These are examples, not a stable ratio, density, or paste-to-water conversion. The second source's suggested leftover storage period is not adopted as catalog safety guidance.
- Roland's 3×-potency statement concerns its named 16 oz ready-to-use concentrate SKU, not tamarind concentrate generally [S09]. No cross-brand potency or substitute ratio is supported.
- Health Canada says high-acid foods for home canning have pH below 4.6, but calls for current tested canning recipes and says not to change processing times, pressure, jar size, or ingredient amounts [S12]. This is not a shelf-stability claim for tamarind water or bottled citrus juice. Do not assign canning, room-temperature storage, or a shelf life from an assumed acidity.
- CFIA's 0–4 °C refrigeration or below −18 °C freezing guidance applies to unpasteurized fruit juices and ciders until consumption [S13]. It is not a universal storage instruction for all bottled citrus products or for tamarind water.
- No proposed density, unit mapping, conversion, package yield, preservation instruction, or substitution is supported.

## Source register

Sources were accessed on 2026-10-12 unless the live page reports an earlier update. Each source supports only its stated terminology, product example, numeric limit, or distinction.

| ID | Source | Supports | Limit |
|---|---|---|---|
| WP05-ACID-JUICE-RESIDUAL-20261012-S01 | CFIA, [Canadian Food Compositional Standards, Volume 10 — Fruits, Vegetables, Their Products and Substitutes (English)](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §§10.3.7–10.3.15. | Current Canadian English classes and boundaries for lemon/lime juice, named fruit concentrate, and same-fruit reconstituted juice. | Regulatory naming and composition only; no kitchen dilution ratio or general conversion. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S02 | CFIA, [Normes canadiennes de composition des aliments, Volume 10 (French)](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), last modified 2025-05-01, §§10.3.7–10.3.15. | Exact Canadian French terms jus de citron, jus de lime, jus de (nom du fruit) concentré, jus de (nom du fruit) reconstitué / jus de concentré de (nom du fruit) / jus de (nom du fruit) fait de concentré; regulated citrus specifications. | Product standard, not an alias list or cooking conversion table. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S03 | OQLF, [jus de citron concentré (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18968393/jus-de-citron-concentre). | Preferred Québec French terms jus de citron concentré and concentré de jus de citron; English lemon juice concentrate. | Terminology entry last updated 1984; CFIA supplies the current product-state definition. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S04 | OQLF, [lime (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366576/lime). | Québec French fruit terms lime and citron vert. | It does not define a lime-juice-concentrate entry; jus de lime concentré follows the Canadian named-fruit standard and current Canadian product wording. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S05 | ReaLemon/ReaLime, [Les produits (FR)](https://www.realemon.ca/fr/products) and [Products (EN)](https://www.realemon.ca/en/products). | Current bilingual product labels, concentrate-plus-water description, listed sulfites and citrus oils, refrigeration-after-opening label, and brand-specific 50 mL/45 mL comparisons. | One manufacturer and formulation; its numeric comparison is not generalized. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S06 | OQLF, [tamarin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296920/tamarin). | Québec preferred fruit term tamarin and English tamarind. | Does not name or define tamarind water, concentrate, juice, or beverage. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S07 | Pfeiffer Family Indian Cookbook, [tamarind water](https://cookbook.pfeiffer.net.au/tamarind-water/). | English phrase tamarind water; a source-specific warm-water extraction method using 50 g paste and 1½ cups water, yielding about one cup. | One recipe method; not an extraction standard, safety protocol, or universal concentrate substitution. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S08 | La kitchenette de Miss Tâm, [Bún riêu cua](https://misstamkitchenette.com/bun-rieu-cua-soupe-de-vermicelles-de-riz-au-crabe-revisitee/), tamarind-water preparation. | Francophone culinary usage eau de tamarin; one method using 30 g dried deseeded pulp and 100 mL hot water, steeped and strained. | French-language usage, not an OQLF/Québec preferred-term record. Its leftover-storage statement is not adopted. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S09 | Roland Foods, [Tamarind Concentrate, SKU 85810](https://products.rolandfoods.com/product/85810-tamarind-concentrate). | Brand's description of a ready-to-use tamarind extract/water concentrate; product-specific “three times more potent” claim. | One named SKU only. No general tamarind paste or water equivalence. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S10 | Encyclopaedia Iranica, [ĀB-ḠŪRA](https://www.iranicaonline.org/articles/ab-gura/), last updated 2018. | āb-ḡūra as juice of unripe grapes; distinguishes whole unripe grapes and ghooreh powder, and describes powder as a separate preparation. | Scholarly Persian-cuisine reference; not a Québec French terminology or preservation standard. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S11 | Türk Aslan, Tokatlı Demirok & Yıkmış, [Comparison of Traditional Production Methods of Verjuice Sours](https://jotags.net/index.php/jotags/en/article/view/1639), Journal of Tourism & Gastronomy Studies 11(2), 2023. | Defines koruk as unripe grapes, its pressed juice as koruk juice/sour, and reports five traditional methods for processed koruk sour with no standard production method. | The study does not establish Québec French naming, a universal recipe, density, storage period, or substitution. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S12 | Health Canada, [Home canning safety](https://www.canada.ca/en/health-canada/services/general-food-safety-tips/home-canning-safety.html), page details 2024-06-10. | High-acid home-canning threshold pH <4.6 and the requirement to use tested procedures without changing ingredient quantities or processing conditions. | Canning guidance; it does not certify this juice/extraction preparation as shelf stable. |
| WP05-ACID-JUICE-RESIDUAL-20261012-S13 | CFIA, [Preventive controls for unpasteurized fruit juices and ciders](https://inspection.canada.ca/en/preventive-controls/u-fruit-juices-and-ciders). | Conditional handling guidance: unpasteurized fruit juice/cider held at 0–4 °C or frozen below −18 °C until consumption; label as unpasteurized. | Applies to unpasteurized fruit juice/cider, not every bottled product or tamarind water. |

## Limits and disposition

This packet adds no catalog edits, recipe changes, alias additions, forms, density entries, unit mappings, conversions, package yields, preservation instructions, or substitutions. Its bounded disposition is recorded in the plan, workflow, roadmap, and integration note. The exact recipe corpus has no demand for the held products. The same-fruit reconstituted/concentrate distinction and sour-grape-juice-to-verjuice boundary are covered by existing data; the other product identities remain held until an exact recipe line or product label supplies the needed scope and wording.
