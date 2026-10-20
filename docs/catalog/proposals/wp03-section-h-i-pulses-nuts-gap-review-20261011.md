# WP03 Sections H–I gap review: pulses, nuts, seeds, and kernels

- **Reviewed:** 2026-10-11
- **Status:** research proposal only; no shared catalog, ledger, recipe, plan, roadmap, generated file, or integration README was changed for this packet.
- **Scope:** open Section H form questions and Section I kernel/preparation questions, including the exact manifest-listed recipe rows, active references/forms, legacy candidates, ledger, prior proposals, and regional sweeps.
- **Research and source access:** 2026-10-11.
- **Testing:** no app tests run; this is proposal-only research.

## Recommendation

Four narrow changes are ready for coordinator review:

1. Add a dried form to the existing adzuki reference and link only recipe 004#1. Its current line already says “200 g dried azuki beans”; retain its source text, English/French preparation, and mass.
2. Verify the existing generic nuts/noix reference and link only recipe 031#4, “crushed nuts, for topping.” The row remains species-unspecified. Recipe 065#7 is already linked to this generic reference.
3. Link recipe 090#17 to the existing peanut reference. Its ingredientName is “peanuts”; retain the combined cilantro note and do not create a cilantro row or a peanut preparation form.
4. Record recipe 114#20’s authored “1 cup (125 g) chopped pecans” as a source-specific portion observation in the pecan ledger record. Keep the mapping inactive: no default density or unit mapping.

No new ingredient identity or alias is needed. Keep dry/cooked yields, densities, unit conversions, substitutions, aquafaba, broad nut/seed forms, magaz/magaj, species-ambiguous lupini products, and processing-sensitive candlenut behavior unavailable or held as described below. Section H and Section I remain open.

## Pre-integration snapshot

Counts were read from the live split seed package and ledger on 2026-10-11, after the other current worktree integrations and before any recommendation in this packet is applied.

| Artifact | Pre-integration state |
|---|---:|
| Active ingredient references | 1,072 |
| Active ingredient forms | 77 |
| Active LEGUME_AND_PULSE references | 42 |
| Active NUT_SEED_AND_DRIED_FRUIT references | 49 |
| General substitution rules | 0 |
| Contextual substitution rules | 0 |
| Manifest-listed recipe files | 114 |
| Ingredient rows across those files | 1,123 |
| Legacy import candidates | 75 |
| Research-ledger records | 1,369 |
| Ledger source entries | 4,511 |
| Distinct ledger source IDs | 3,690 |

The NUT_SEED_AND_DRIED_FRUIT taxonomy also contains dried fruit; category membership alone was not used to claim Section I recipe demand. Coconut meat is included below because the Section I plan explicitly covers shredded, flaked, sweetened, and toasted coconut forms. Dried fruit, coconut milk/oil/cream, spices, and unrelated seed-derived products are excluded where they belong to other plan sections.

## Audit basis

The requirements and workflow rules were checked in [AGENTS.md](../../../AGENTS.md), [Requirements.md](../../../Requirements.md), the [active roadmap](../../../roadmap.md), the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), and the [ingredient-catalog workflow](../ingredient-catalog-workflow.md). The live data audit used the manifest-listed [recipe package](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), and [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), plus the [legacy candidate list](../legacy-import-identities.v1.json) and [research ledger](../research-ledger.v1.json). Related prior proposals and regional sweeps are linked in the reconciliation section below.

## Proposed integrations

### A. Dried adzuki form

Add a form under the existing Vigna angularis reference:

| Field | Recommendation |
|---|---|
| Stable ID | ingredient-form-azuki-beans-dried |
| Parent | ingredient-ref-azuki-beans |
| formCode | dried |
| English label | dried adzuki beans |
| Québec French label | haricots adzuki séchés |
| prepState | dry |
| English match terms | dried azuki beans; dried adzuki beans |
| French match terms | haricots adzuki séchés |
| densityGPerMl | null |

This is a descriptive French product label built from the OQLF identity “haricot adzuki” and the dry-seed state. Health Canada’s crop grouping explicitly includes adzuki under dry Vigna seed. Do not present that crop grouping as a consumer-label standard.

Link the form only to recipe 004#1. Preserve “200 g dried azuki beans,” the existing azuki reference, preparation.en “dried,” preparation.fr “séché,” quantity 200, and unit g. Add only the form link when integrated. The Just One Cookbook page identifies its ingredient as dried azuki and cooks the beans after rinsing/parboiling without overnight soaking. This supports the dry product state; it does not justify a soaking form, universal cooking procedure, cooking yield, or dry-to-cooked conversion.

Do not add a general match term such as “dried beans,” “dry,” or “sec”: keep the match terms species-qualified. Do not encode “red bean” as an azuki alias. The recipe title’s sweet red-bean paste is a prepared result; its ingredient row explicitly names azuki.

### B. Generic nuts and the recipe 031 garnish

Keep the active generic reference as nuts / noix, category NUT_SEED_AND_DRIED_FRUIT, with no new aliases. Its ledger record currently has identityState unreviewed and already contains OQLF terminology evidence for generic nuts. Recommend marking that existing generic identity verified, with an accepted decision that defines it as an unspecified group of edible kernels. Reuse the existing ledger source entry for the OQLF page rather than adding a duplicate copy of the same terminology source.

Link recipe 031#4, “crushed nuts, for topping,” to ingredient-ref-nuts only. Cooking With Ayeh keeps “crushed nuts” as the generic topping in the main recipe and lists named nuts for its three specific variations. Neither the bundled line nor the source identifies the topping species or mix. Preserve originalText and the source-specific optional status. Do not map the row to almonds, hazelnuts, peanuts, or a fixed mixed-nut product; do not add a crushed-nut form.

Recipe 065#7, “Nuts, to taste,” is already linked to ingredient-ref-nuts and remains unchanged.

### C. Peanut garnish in recipe 090

Link recipe 090#17 to ingredient-ref-peanuts only. The current row says “peanuts and fresh cilantro, for garnish,” sets ingredientName to “peanuts,” and keeps cilantro in a bilingual note. Cotter Crunch’s source lists chopped peanuts and cilantro as serving garnishes. This supports the peanut identity link while preserving the row structure and its cilantro note. Do not create a peanut “chopped/roasted” form from this garnish line or infer a quantity.

The separate peanut butter line 090#2 is already linked to ingredient-ref-peanut-butter. Keep peanut kernels and peanut butter as separate products. Peanuts are legumes botanically and are not thereby interchangeable with beans, peas, or tree nuts.

### D. Pecan portion observation, recipe-local only

Add one measurement observation to the existing ingredient-ref-pecans ledger record, sourced to recipe 114#20:

| Observation field | Recommendation |
|---|---|
| observationId | WP03-HI-GAP-PECANS-114-CUP-125G |
| relationship | portion_weight |
| foodDescription | Chopped pecans in recipe 114#20 |
| foodState | chopped |
| sourceQuantity | 1 cup |
| value | 125 g |
| evidenceKind | published_portion |
| quantityBasis | The source recipe explicitly pairs 1 cup with 125 g. |
| measurementMethod | Published recipe’s own paired volume and mass; cup convention and packing method are not stated. |
| sourceIds | WP03-HI-GAP-20261011-S07 |

Keep measurementState blocked_pending_evidence for any transferable mapping or density. This observation records the source’s exact pair for this recipe only. Do not add a chopped-pecan IngredientForm, defaultDensity, unitMappings entry, or general “1 cup pecans = 125 g” rule. The other nut/seed lines in the corpus do not support generic mass-volume values.

## Full manifest recipe-line audit

The scan followed the 114 file paths in manifest order and checked each of the 1,123 ingredient rows, including originalText, ingredientName, linked ingredient/form IDs, and preparation/notes. It found four direct pulse lines, one separate mixed-vegetable line, and 58 Section I kernel, seed, coconut-meat, and nut-product lines. No other Section H/I candidate phrase or relevant active reference ID appears in a manifest ingredient row.

### Section H: pulses and adjacent mixed row

| Row | Current ingredient line and link | Disposition |
|---|---|---|
| 004#1 | “200 g dried azuki beans”; ingredient-ref-azuki-beans; preparation “dried / séché”; no form. | Add and link the proposed dried adzuki form; otherwise preserve the row exactly. |
| 007#4 | “1 can pinto beans with liquid”; ingredient-ref-pinto-beans; ingredient-form-pinto-beans-canned-with-liquid. | Already has the exact canned-with-liquid form. Preserve package basis and all text. This is not aquafaba. |
| 034#9 | “540 ml kidney beans, rinsed and drained”; ingredient-ref-kidney-beans; ingredient-form-kidney-beans-canned-drained-rinsed. | Already has its rinsed/drained form. Preserve the 540 ml can declaration and distinct drained basis. |
| 078#14 | “1 cup frozen peas and carrots”; ingredient-ref-frozen-peas-and-carrots. | Separate frozen mixed-vegetable identity, not a pulse identity or pulse form. No change. |
| 105#1 | “2 cups dried yellow peas”; ingredient-ref-yellow-peas; no form. | The base identity is already explicitly dried yellow peas. Preserve; no whole/split state or volume conversion is justified. |

### Section I: all matching kernel, seed, coconut-meat, butter, and paste lines

Unless stated otherwise in the disposition column, each linked reference remains unchanged and whole/chopped/sliced/ground/blanched/roasted wording stays on that recipe line rather than becoming a global form.

| Row | Original ingredient line | Current reference/form or disposition |
|---|---|---|
| 001#9 | 1 tbsp peanut butter | ingredient-ref-peanut-butter; preserve |
| 003#1 | 16 oz homemade almond paste | ingredient-ref-almond-paste; preserve |
| 003#6 | sliced almonds for rolling | ingredient-ref-almonds; sliced stays line-level |
| 006#6 | 120 g flaked coconut | ingredient-ref-coconut; ingredient-form-coconut-flaked |
| 006#7 | 40 g almonds, finely chopped | ingredient-ref-almonds; chopped stays line-level |
| 011#6 | 198 g almond paste | ingredient-ref-almond-paste; preserve |
| 017#1 | 130 g pistachios, finely ground | ingredient-ref-pistachios; ground stays line-level |
| 020#10 | 1/2 cup creamy peanut butter | ingredient-ref-peanut-butter; preserve |
| 021#24 | 60 g finely chopped hazelnuts | ingredient-ref-hazelnuts; chopped stays line-level |
| 022#1 | 240 g smooth peanut butter | ingredient-ref-peanut-butter; preserve |
| 025#10 | 1.5 cups pecans, chopped | ingredient-ref-pecans; chopped stays line-level |
| 026#5 | 1 1/3 cups flaked coconut | ingredient-ref-coconut; ingredient-form-coconut-flaked |
| 026#6 | 1 1/3 cups chopped pecans | ingredient-ref-pecans; chopped stays line-level |
| 031#4 | crushed nuts, for topping | Unlinked. Link to generic ingredient-ref-nuts only; no species or mix inferred. |
| 031#5 | peanut butter | ingredient-ref-peanut-butter; preserve |
| 031#6 | peanuts | ingredient-ref-peanuts; preserve |
| 031#7 | hazelnut butter | ingredient-ref-hazelnut-butter; preserve |
| 031#8 | hazelnuts | ingredient-ref-hazelnuts; preserve |
| 031#9 | almond butter | ingredient-ref-almond-butter; preserve |
| 031#10 | almonds | ingredient-ref-almonds; preserve |
| 035#1 | 396 g sweetened shredded coconut | ingredient-ref-coconut; ingredient-form-coconut-shredded-sweetened |
| 040#4 | 1 cup almond butter | ingredient-ref-almond-butter; preserve |
| 052#10 | 2 tbsp whole almonds | ingredient-ref-almonds; preserve |
| 053#13 | 1 1/2 cups chopped pecans, plus more for garnish | ingredient-ref-pecans; chopped stays line-level |
| 055#10 | 1 cup walnuts, chopped | ingredient-ref-walnuts; chopped stays line-level |
| 056#7 | 40 g pistachio paste | ingredient-ref-pistachio-paste; preserve |
| 056#16 | 30 g pistachio paste | ingredient-ref-pistachio-paste; preserve |
| 056#29 | Chopped pistachios, for decoration | ingredient-ref-pistachios; chopped stays line-level |
| 058#11 | 1/2 cup walnuts, chopped | ingredient-ref-walnuts; chopped stays line-level |
| 058#12 | 1 cup flaked coconut | ingredient-ref-coconut; ingredient-form-coconut-flaked |
| 058#16 | 1/2 cup toasted coconut | ingredient-ref-coconut; ingredient-form-coconut-toasted |
| 065#3 | 1/8 part chia seeds | ingredient-ref-chia-seeds; preserve |
| 065#7 | Nuts, to taste | ingredient-ref-nuts; already generic and linked |
| 066#11 | 1 tbsp toasted white sesame seeds | ingredient-ref-white-sesame-seeds; ingredient-form-white-sesame-seeds-toasted |
| 067#3 | 1/2 cup natural peanut butter | ingredient-ref-peanut-butter; preserve |
| 067#4 | 1 cup finely chopped pecans | ingredient-ref-pecans; chopped stays line-level |
| 067#5 | 1/2 cup unsweetened shredded coconut | ingredient-ref-coconut; ingredient-form-coconut-shredded-unsweetened |
| 070#11 | 1/2 cup unsweetened shredded coconut | ingredient-ref-coconut; ingredient-form-coconut-shredded-unsweetened |
| 070#14 | 60 g almond butter | ingredient-ref-almond-butter; preserve |
| 070#15 | 20 g sliced almonds | ingredient-ref-almonds; sliced stays line-level |
| 072#14 | Sesame seeds, toasted | ingredient-ref-sesame-seeds; ingredient-form-sesame-seeds-toasted |
| 079#1 | 210 g blanched almonds | ingredient-ref-almonds; blanched stays line-level |
| 081#2 | 1 cup toasted coconut flakes | ingredient-ref-coconut; ingredient-form-coconut-toasted-flakes |
| 081#3 | 1/2 cup pistachios | ingredient-ref-pistachios; preserve |
| 081#4 | 1/2 cup almonds | ingredient-ref-almonds; preserve |
| 081#6 | 1 cup toasted coconut flakes | ingredient-ref-coconut; ingredient-form-coconut-toasted-flakes |
| 081#7 | 1 cup pistachios | ingredient-ref-pistachios; preserve |
| 081#8 | 1 cup almonds | ingredient-ref-almonds; preserve |
| 085#9 | chopped roasted peanuts | ingredient-ref-peanuts; preparation stays line-level |
| 090#2 | 1/2 cup natural creamy peanut butter | ingredient-ref-peanut-butter; preserve |
| 090#17 | peanuts and fresh cilantro, for garnish | Unlinked. Link peanuts to ingredient-ref-peanuts only; retain the cilantro note. |
| 095#11 | 2 tbsp peanut butter | ingredient-ref-peanut-butter; preserve |
| 102#8 | 2 tbsp pine nuts | ingredient-ref-pine-nuts; preserve |
| 109#2 | 1/2 cup pecans, coarsely chopped | ingredient-ref-pecans; chopped stays line-level |
| 110#16 | 1/2 cup sliced almonds | ingredient-ref-almonds; sliced stays line-level |
| 111#6 | Sesame seeds | ingredient-ref-sesame-seeds; preserve |
| 114#19 | 2 cups sweetened shredded coconut | ingredient-ref-coconut; ingredient-form-coconut-shredded-sweetened |
| 114#20 | 1 cup (125 g) chopped pecans | ingredient-ref-pecans; retain source pair as a recipe-specific ledger observation only |

This audit finds no recipe-line demand for fresh/cooked beans beyond current linked rows, soaked or cooked azuki, aquafaba, lentil forms, lupini, split/hulled seed products, generic mixed nut butter, or a new species-specific nut/seed identity. The Anko title is a prepared recipe result; there is no standalone anko ingredient line.

## Exact-key collision and related-record audit

I compared proposed names and match terms against all active reference names/aliases, all active form labels/match terms, and legacy candidate names/aliases using the repository’s normalized search-key helper. It folds case, accents, ligatures, punctuation, and repeated whitespace. The exact-key result is distinct from broader phrase/substring retrieval.

| Phrase or boundary | Current owner / result | Disposition |
|---|---|---|
| dried azuki beans; dried adzuki beans; haricots adzuki séchés | No exact owner in references, forms, or legacy candidates. | The proposed species-qualified form terms have no exact collision. |
| adzuki beans; azuki bean; azuki beans; haricot adzuki | Existing ingredient-ref-azuki-beans identity and aliases. | Preserve the current species identity and aliases; attach the state only as a form. |
| nuts; noix | Exact generic owner ingredient-ref-nuts. OQLF defines the plural French group as edible kernels and maps it to English nuts. | Keep generic; do not assign bare noix to walnuts or a named species. |
| coconut meat: flaked, shredded, or toasted | Existing ingredient-ref-coconut and its flaked, sweetened/unsweetened shredded, and toasted forms. All ten manifest-listed coconut-meat lines in this audit already link to the reviewed forms. | Preserve the prior coconut integration; no additional form, alias, or measurement is proposed. Coconut milk, oil, and cream remain separate product identities outside these kernel-form rows. |
| peanuts; arachides | Existing ingredient-ref-peanuts. | Link recipe 090#17 here; keep peanut butter and tree nuts separate. |
| peanut butter | Existing ingredient-ref-peanut-butter. | Keep separate from whole peanut kernels. |
| pistachio paste | Existing ingredient-ref-pistachio-paste, distinct from pistachios. | Preserve the existing paste identity; do not create pistachio butter from these recipe lines. |
| lupini | Existing English alias on species-scoped ingredient-ref-white-lupin-seeds, supported by the OQLF Lupinus albus entry. | Preserve the reviewed alias boundary. Do not add unqualified “lupini beans” or assign Canadian species-unspecified retail jars to white lupin. |
| red bean / red beans | No exact generic owner; “red bean” occurs in the Anko prepared-food title. | Do not add a red-bean alias to azuki or kidney beans. Ingredient 004#1 explicitly names dried azuki. |
| chestnut / châtaigne | Related water-chestnut wording and sweet-chestnut product identities create phrase ambiguity even where a bare exact key is absent. | Keep sweet chestnuts, water chestnuts, and processed chestnut products qualified; no new alias. |
| magaz / magaj / char magaz | No exact active, form, or legacy owner; no recipe-line hits. | Keep held under the 2026-10-11 Section I product-boundary review. Do not attach these terms to egusi, watermelon kernels, pumpkin seeds, or a general form. |
| candlenut / kemiri | No active identity; prior review keeps it out pending food-grade processing/safety evidence. | Preserve the hold; add no raw/roasted form, home-processing rule, numeric value, or substitution. |

The 75 legacy candidates contain no adzuki identity/form candidate and no candidate that resolves generic crushed nuts or the peanut garnish. Other pulse and nut-product candidates remain separate: the unpromoted split-pea and dried-chickpea candidates do not create adzuki forms; peanut oil and peanut-butter chips remain processed products; the natural peanut-butter candidate overlaps an active product identity. No legacy row justifies a new identity in this packet.

## Existing forms, regional packets, and held scope

The current pulse forms already cover black beans canned/drained; chickpeas dried and canned/drained; Desi chickpeas split/dehulled and roasted split/dehulled; kidney beans canned/drained/rinsed; and pinto beans canned with liquid. Current Section I forms include flaked, sweetened/unsweetened shredded, and toasted/toasted-flake coconut meat; toasted sesame seed forms; and roasted/popped makhana kernels. The separate guarana-seed powder form comes from the WP06 South America review and has no matching line in this corpus scan. Ogbono kernels and egusi seeds are active, distinct identities; neither has a matching recipe line. The new adzuki form is one exact extension of this form coverage; it does not close the open Section H checklist.

Prior packet reconciliation:

- The [North American cuisine sweep](wp06-north-american-cuisine-gap-sweep-20261009.md) already identifies recipe 105#1 as the dried yellow-pea demand and treats tepary beans as a separate mature seed identity. Do not duplicate that regional pulse work.
- The [East Asia sweep](wp06-east-asia-cuisine-gap-sweep-20261011.md) confirms recipe 004 lists dried azuki beans; its Anko title does not create a separate anko ingredient line or a global sweet-paste identity.
- The [Caribbean English](wp06-caribbean-english-cuisine-gap-sweep-20261011.md) and [Spanish Caribbean](wp06-caribbean-spanish-cuisine-gap-sweep-20261011.md) sweeps route pigeon peas/gungo peas/gandules through their existing identity decisions. No bundled recipe asks for those forms.
- The [South American sweep](wp06-south-american-cuisine-gap-sweep-20261009.md) keeps fresh/mature porotos granados separate from dried porotos de guarda; do not use those regional terms to infer a universal fresh/dry bean conversion.
- The Section I [coconut products review](wp03-coconut-products-coordinator-review-20261009.md), [Québec boundary follow-up](wp03-coconut-products-quebec-boundary-review-20261011.md), and [integration batch](../batches/wp02-wp03-wp05-oatmeal-coconut-adobo-integration-20261011/README.md) already model the ten coconut-meat lines in this audit with source-backed forms. Preserve their current links and forms.
- The [African sweep](wp06-african-cuisine-gap-sweep-20261010.md) already reviewed ogbono kernels as an Irvingia product, now active as ingredient-ref-ogbono-kernels, and keeps them apart from active egusi. Neither has a recipe-line link in this corpus.
- The [South Asian sweeps](wp06-south-asian-cuisine-gap-sweep-20261010.md) and [South Asia sweep](wp06-south-asia-cuisine-gap-sweep-20261011.md), [Southeast Asia sweep](wp06-southeast-asia-cuisine-gap-sweep-20261011.md), and [French/Creole Caribbean sweep](wp06-caribbean-french-creole-cuisine-gap-sweep-20261011.md) do not establish an additional exact Section H/I recipe row in this corpus. Their regional product boundaries remain with those packets.
- The [Section I magaz/magaj review](wp03-section-i-magaz-melon-kernel-product-boundary-review-20261011.md) holds the ambiguous regional term and variable blend boundary; dried watermelon kernels remain separate from egusi seeds.
- Prior [WP03 nut/paste reviews](wp03-tree-nuts-coordinator-review-20261009.md) and [nut/seed product review](wp03-nut-seed-paste-product-gap-review-20261010.md) keep kernel butters and pastes as separate products where reviewed, while pistachio butter, hemp-seed butter, generic mixed nut butter, and unresolved sesame-paste boundaries remain held. Keep whole/chopped/sliced/ground/blanched wording with recipe rows unless a product-specific recipe or stable purchase form makes a separate form useful.
- The [candlenut review](wp03-candlenut-kemiri-boundary-review-20261009.md) keeps that kernel out of active references pending better food-grade processing evidence.

Still held:

| Question | Hold |
|---|---|
| Pulse whole/split, hulled/unhulled, soaked/cooked, puréed/refried, fermented, and other canned states | Add forms only for an exact species/product state demanded by a recipe or stable product label. The current corpus supports the dry adzuki, pinto-with-liquid, and kidney-rinsed/drained cases listed above; it supplies no broad pulse yield or substitution. |
| Aquafaba and bean cooking liquids | No separate aquafaba ingredient line exists. Azuki cooking water in the Anko method is reserved and used to loosen a paste; it is not a standalone aquafaba recipe ingredient. Pinto beans with packing liquid remain the bean product form, not aquafaba. |
| Whole, chopped, sliced, slivered, ground, blanched, roasted, salted, and kernel forms | Keep recipe-specific preparation on each line. These cut/finish descriptors do not establish common densities, conversion factors, or independent catalog forms. |
| Butters, pastes, spreads, and filling | Preserve active almond/hazelnut/peanut butters, almond/pistachio pastes, and other reviewed product identities. Do not merge butter with kernel or paste; retain the existing holds on pistachio butter, hull-ambiguous hemp butter, mixed nut/seed butter, and unverified seed-paste products. |
| Added sugar, salt, oil, stabilizers | Keep them product-specific. The current recipe lines provide no universal nut/seed product formula. |
| Density, unit mapping, cooking yield, substitution | Keep defaultDensity null and unitMappings empty for the relevant references/forms. Add no substitution rule: this packet supports identities/forms and one recipe-local portion observation, not ingredient interchange. |

## Source-to-claim table

The following IDs are unique to this packet and are not yet present in the research ledger. If the coordinator accepts the recommendations, add only the applicable sources to their ledger records. The OQLF noix page for S04 is already represented in the generic nuts record under an earlier ledger ID; do not duplicate that same terminology source.

| Source ID | Source | Claim and limit |
|---|---|---|
| WP03-HI-GAP-20261011-S01 | OQLF, [haricot adzuki](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423445/haricot-adzuki) | Supports Québec French *haricot adzuki*, English *adzuki bean*, and the food/botany identity *Vigna angularis*. Identity terminology only; no form, measure, or cooking behavior. |
| WP03-HI-GAP-20261011-S02 | Health Canada, [Groupes de cultures et propriétés chimiques de leurs résidus](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html) | Includes adzuki within the dry-seed group for *Vigna* pulses. Crop/residue classification supports the dry seed boundary, not retail label wording, recipe preparation, or a conversion. |
| WP03-HI-GAP-20261011-S03 | Just One Cookbook, [Anko (Sweet Red Bean Paste)](https://www.justonecookbook.com/how-to-make-anko-red-bean-paste/) | Current recipe identifies “dried azuki beans,” says no overnight soaking is needed, then rinses, parboils, and cooks the beans. Its later cooking-liquid use is an optional step in the koshian paste process. Supports the exact dry input form and recipe-specific method only; no general yield or aquafaba identity. |
| WP03-HI-GAP-20261011-S04 | OQLF, [noix](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9483322/noix) | Defines plural *noix* as a group of edible kernels, gives examples including hazelnuts, almonds, cashews, Brazil nuts, and pecans, and maps it to English *nuts*. Supports the generic identity. The same OQLF page is already present in the generic nuts ledger record under an earlier source ID; do not duplicate that URL in the ledger. |
| WP03-HI-GAP-20261011-S05 | Cooking With Ayeh, [Chocolate Dates (3 Flavors)](https://cookingwithayeh.com/chocolate-dates/) | The main recipe lists crushed nuts as a topping, while specific date variations name peanuts, hazelnuts, and almonds. Supports a generic link for 031#4 and species links for the already named variation lines; it does not establish a fixed nut mix. |
| WP03-HI-GAP-20261011-S06 | Cotter Crunch, [African Peanut Stew](https://www.cottercrunch.com/crock-pot-west-african-peanut-stew/) | Lists dry-roasted chopped peanuts and fresh cilantro as serving garnishes. Supports the peanut component of recipe 090#17; does not supply a quantity or a standardized peanut form. |
| WP03-HI-GAP-20261011-S07 | Sally’s Baking Addiction, [Upgraded German Chocolate Cake](https://sallysbakingaddiction.com/german-chocolate-cake/) | Recipe card explicitly pairs 1 cup with 125 g for chopped pecans, matching bundled recipe 114#20. Supports one published portion observation only; it does not state a cup convention or packing method and is not a transferable density/mapping. |

## Validation notes

- The pre-integration counts were recomputed from the live manifest, package JSON, legacy candidate JSON, and research ledger.
- Recipe rows were read only through manifest-listed recipe paths. Exact phrase checks used the repository’s normalized search-key helper across reference names/aliases, form labels/match terms, and legacy candidate names/aliases.
- Online source pages were opened or searched directly on 2026-10-11; source claims above retain the limits stated by each page.
- This proposal is UTF-8 Markdown with a final newline and no BOM. No app tests or emulator checks were run, consistent with the research-only assignment.
- Repeat the key/count and recipe scan against the then-live package before integration because other shared work may change the working tree.
