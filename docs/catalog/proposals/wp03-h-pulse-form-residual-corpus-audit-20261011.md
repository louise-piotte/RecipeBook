# WP03 Section H residual pulse-form corpus audit — 2026-10-11

- **Status:** Integrated on 2026-10-11; see the [batch record](../batches/wp03-yellow-peas-whole-dried-form-integration-20261011/README.md). The pre-integration snapshot and research rationale are retained below.
- **Scope:** remaining Section H bean and pulse forms across every manifest-listed recipe row,
  including whole/split/seed-coat and dry/soaked/cooked/canned/drained states; separate review of
  any aquafaba or bean-cooking-liquid demand.
- **Write scope:** The research packet was proposal-only; the coordinator added one form, one exact recipe link, and source ledger data without changing the row text or quantity.
- **Testing:** none; the accepted change only adds database JSON data.

## Decision

The integration added one form to the existing yellow-pea reference and linked it only to recipe `105#1`:
**dried whole yellow peas**. The publisher’s recipe card says “2 cups dried whole yellow peas”; the
bundled ingredient line is `2 cups dried yellow peas`. The publisher also describes the seed coats
as present and floating in the soup. This exact source resolves the earlier whole/split hold for
this recipe row. Keep the stored wording, quantity, and unit unchanged; attach the form to the
existing reference.

Do not add soaked or cooked forms for this line. The recipe says to soak the dry peas, drain the
soaking water, and then cook them. Those are preparation steps after the requested dry ingredient,
not separate ingredient lines. Do not add a density, mass conversion, package yield, dry-to-cooked
ratio, or substitution: the recipe supplies 2 cups but no paired mass or output yield.

No aquafaba ingredient is requested anywhere in the manifest-listed ingredient rows or recipe
text. Two narrower liquid uses do appear:

- Recipe `007#4` uses the whole pinto can with its liquid. Its existing canned-with-liquid form
  already captures the specified product; the liquid is not a separately requested ingredient.
- Recipe `004` reserves its own azuki cooking liquid and conditionally adds 1–2 tablespoons to the
  purée for koshian. The bundled instructions contain this process direction, but there is no
  separate bean-liquid ingredient row. This is azuki cooking liquid, not aquafaba. Keep it as a
  recipe-specific process aid in this packet; do not create a generic bean-liquid identity or
  confuse it with the adzuki bean form.

Recipe `034#9` already links canned kidney beans, rinsed and drained. No additional canned, drained,
refried/puréed, fermented, split, or dehulled pulse form is supported by another manifest line.
This review does not close Section H’s broader form checklist.

The open Section H checklist still covers whole/split and hulled/unhulled products, dry/soaked/cooked
and canned states, and separate cooking liquids where used ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2273)).
This proposal resolves only the exact yellow-pea source qualifier. `Requirements.md` models forms
as states or formats and requires a supported density or mapping before weight-volume conversion;
the sources here provide neither for yellow peas. The roadmap already records the adzuki and pinto
form integrations and still leaves broader Section H work open.

## Pre-integration snapshot

The snapshot below is the live package state read for this audit on 2026-10-11, before any
integration of the candidate in this packet.

| Area | Count and relevant state |
|---|---|
| Ingredient references | 1,080 total; 42 use category `LEGUME_AND_PULSE` (including the mung-bean cellophane-noodle reference). |
| Ingredient forms | 78 total; 8 are attached to `LEGUME_AND_PULSE` references. These cover dry azuki; dry and canned/drained chickpeas; split/dehulled and roasted split/dehulled Desi chickpeas; canned/drained black beans; canned/rinsed/drained kidney beans; and canned-with-liquid pinto beans. |
| Recipe corpus | 114 manifest-listed recipe files and 1,123 ingredient rows. |
| Legacy candidates | 75 total. The only relevant inactive pea candidate is generic `split peas`; there is no yellow-whole-pea form candidate. |
| Research ledger | 1,378 records, 4,560 source entries, and 3,733 distinct source IDs. `ingredient-ref-yellow-peas` remains `unreviewed`; its existing OQLF evidence supports dry versus fresh peas, not this recipe’s whole state. No yellow-pea form record exists. |

The current `ingredient-ref-yellow-peas` has no density or unit mapping. The proposed form ID
`ingredient-form-yellow-peas-whole-dried` is absent from active forms and the ledger.

## Proposed form and exact link

The coordinator integrated the accepted form and link as described above. The snapshot and proposed-field table in this proposal are pre-integration.

| Field | Proposal |
|---|---|
| ID | `ingredient-form-yellow-peas-whole-dried` |
| Parent | `ingredient-ref-yellow-peas` (`dried yellow peas / pois jaunes séchés`) |
| `formCode` | `whole_dried` |
| English label | `dried whole yellow peas` |
| French label | `pois jaunes entiers séchés` — descriptive Québec French wording, not claimed as an OQLF-preferred compound product name. |
| `prepState` | `dry` |
| English match terms | `dried whole yellow peas`; optionally retain the existing `whole yellow peas` term on this form. |
| French match terms | `pois jaunes entiers séchés`, already present as an alias on the same parent reference; move it to the form if the integration wants all state-qualified search terms at form level. |
| Density / mapping | `null` / none. |
| Link | Add only `ingredientFormId: ingredient-form-yellow-peas-whole-dried` to recipe `105#1`. Preserve `2 cups dried yellow peas`, quantity `2`, unit `cup`, and other fields. |

For a clean ownership boundary, move the existing English aliases `dried whole yellow peas` and
`whole yellow peas` from the base reference to this form’s English match terms. Move the existing
French alias `pois jaunes entiers séchés` only if it is retained as the descriptive form match term
above. Preserve the base identity and its other terms. This does not create new search phrases;
it locates the already-active whole-qualified phrases at the form level where they belong.

The source’s whole peas retain their seed coats. The form records the recipe’s whole, dry input; it
does not define a universal hulled/unhulled conversion or a later cooking form. The recipe’s
soaking direction is evidence about method only. Its 2-cup quantity remains recipe-specific and
does not establish grams per cup.

## Full manifest recipe-row audit

The scan followed all file paths in `manifest.v1.json`, totaling 1,123 ingredient rows. The four
rows linked to pulse references and the one adjacent mixed-vegetable row are:

| Row | Current line and link | Exact state and disposition |
|---|---|---|
| `004#1` | `200 g dried azuki beans`; `ingredient-ref-azuki-beans`; already linked to `ingredient-form-azuki-beans-dried`. | Keep the dry form. The source skips overnight soaking, parboils and drains the beans, then cooks them. Its conditional 1–2 tbsp cooking-liquid direction is addressed above; it does not call for an aquafaba ingredient or a separate liquid line. No cooked form or yield. |
| `007#4` | `1 can pinto beans with liquid`; `ingredient-ref-pinto-beans`; `ingredient-form-pinto-beans-canned-with-liquid`; one can, requested basis `NET_CONTENTS`. | Already exact. Keep the complete can and its unspecified liquid together. Do not infer brand, size, packing medium, bean mass, or yield. |
| `034#9` | `540 ml kidney beans, rinsed and drained`; `ingredient-ref-kidney-beans`; `ingredient-form-kidney-beans-canned-drained-rinsed`; one 540 ml can with a drained-mass request. | Already exact. Keep declared can contents separate from drained bean volume/mass; no new measure. |
| `105#1` | `2 cups dried yellow peas`; `ingredient-ref-yellow-peas`; no form. | Add only the proposed whole-dried form. The publisher card supplies the omitted “whole” qualifier and says the seeds retain their skins. Preserve the stored row text and quantity. |
| `078#14` | `1 cup frozen peas and carrots`; `ingredient-ref-frozen-peas-and-carrots`. | A separate mixed-vegetable identity, not a pulse line. Do not relink to peas or use the mixed cup measure as a pea-only amount. |

No other manifest ingredient row matched the pulse reference set or the bilingual search for beans,
lentils, peas, chickpeas/garbanzos, azuki/adzuki, split peas, pulses, aquafaba, and closely scoped
French terms. Peanut butter and peanut kernels remain Section I / separate products; soy sauce,
bean-thread noodles, mung sprouts/starch, fermented bean curds, and the pea-and-carrot mixture do
not create whole-pulse recipe demand.

## Source-to-claim table

The source IDs below were new and unique to this packet at review time. IDs S01–S03 were later
added to the shared ledger for the yellow-pea reference and form; S04–S06 remain proposal-only.
Recipe pages support only their own recipe’s wording and method. Standards and OQLF
support processing or language boundaries, not recipe measurements.

| Source ID | Source and locator | Claim supported and limit |
|---|---|---|
| `WP03-H-PULSE-RESIDUAL-20261011-S01` | Bryanna Clark Grogan, [Homemade Habitant Pea Soup](https://veganfeastkitchen.blogspot.com/2013/02/homemade-habitant-pea-soup-soupe-aux.html), recipe card and method; posted 2013-02-18; accessed 2026-10-11. | The recipe card specifies 2 cups dried whole yellow peas. The author says the whole peas retain skins, then instructs soaking for about 8 hours, draining, and simmering. Direct support for recipe `105#1`’s whole/dry form and method; no mass, density, or cooking yield. |
| `WP03-H-PULSE-RESIDUAL-20261011-S02` | OQLF, [pois cassé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489155/pois-casse), updated 2023; accessed 2026-10-11. | Defines split peas as dry peas with the cotyledons separated and gives yellow and green split-pea terminology. Supports the Québec French/process boundary; it does not provide a whole-yellow-pea product name or recipe measure. |
| `WP03-H-PULSE-RESIDUAL-20261011-S03` | Codex Alimentarius, [Standard for Certain Pulses, CXS 171-1989](https://www.fao.org/input/download/standards/56/CXS_171e.pdf), scope, product definition, and presentation definitions; accessed 2026-10-11. | Treats peas of *Pisum sativum* as dry pulses and distinguishes whole, shelled, and split presentations. Supports separate processing states, not a household conversion or cooked yield. |
| `WP03-H-PULSE-RESIDUAL-20261011-S04` | Just One Cookbook, [Anko (Sweet Red Bean Paste)](https://www.justonecookbook.com/how-to-make-anko-red-bean-paste/), ingredients and koshian method; refreshed 2025; accessed 2026-10-11. | Names dried azuki beans, says overnight soaking is unnecessary, and conditionally reserves/adds 1–2 tbsp cooking liquid to smooth the purée. Supports recipe `004`’s existing dry form and instruction-only cooking-liquid use; not a separate aquafaba line or a general bean-liquid identity. |
| `WP03-H-PULSE-RESIDUAL-20261011-S05` | Ethan Chlebowski, [Mexican Inspired Bento Box Lunch](https://www.ethanchlebowski.com/cooking-techniques-recipes/mexican-inspired-bento-box-lunch), refried-bean ingredient and method; accessed 2026-10-11. | Lists one can of pinto beans and directs adding the whole can with the liquid. Confirms the existing `007#4` form only; no brand, can size, liquid composition, or drained amount. |
| `WP03-H-PULSE-RESIDUAL-20261011-S06` | RICARDO, [Classic Beef Chili](https://www.ricardocuisine.com/en/recipes/5762-classic-beef-chili), ingredient list and preparation; accessed 2026-10-11. | Specifies a 19 oz (540 ml) can of kidney beans, rinsed and drained. Confirms the already-linked `034#9` state and can amount; the stated can volume is not drained bean volume. |

## Collision and prior-work audit

Exact-key checks used the repository’s `normalize_search_key` helper against all active reference
names/aliases, form labels/match terms, and legacy candidate names/aliases.

| Phrase or boundary | Current owner/result | Resolution |
|---|---|---|
| `dried whole yellow peas`, `whole yellow peas`, `pois jaunes entiers séchés` | Exact terms are currently aliases on `ingredient-ref-yellow-peas`; no other active reference or legacy candidate owns them. | They are same-reference state qualifiers. If the form is integrated, move the qualifiers to the form as listed above; do not create a second yellow-pea identity. |
| `yellow split peas` / `pois jaunes cassés` | `ingredient-ref-yellow-split-peas`. | Keep the color-specific split-pea identity separate. OQLF defines the split process; no recipe row asks for it. |
| `dried whole peas` / `pois secs entiers` | `ingredient-ref-dried-whole-peas`, a color-unspecified identity. | Keep this generic identity separate from the yellow-specific form and do not relink it to `105#1`. |
| Proposed ID `ingredient-form-yellow-peas-whole-dried` | No current form or ledger record. | ID is available in the live snapshot. |
| `aquafaba`, `adzuki bean cooking liquid`, `liquide de cuisson des haricots adzuki` | No active reference, form, or legacy exact owner. | Do not create a global liquid identity from one conditional method instruction. The pinto canned-with-liquid form remains a whole-product state. |

Prior-work reconciliation:

- The [previous H/I corpus review](wp03-section-h-i-pulses-nuts-gap-review-20261011.md#L114)
  saw only the bundled text `2 cups dried yellow peas` and held the whole/split state. This packet
  rechecks the exact publisher page and changes only that one state conclusion.
- The [dry-whole-pea integration](../batches/wp03-dried-whole-peas-shell-bean-boundaries-integration-20261011/README.md)
  intentionally added a color-unspecified identity and did not infer yellow-pea state from the
  shortened bundled line. Its generic reference remains distinct; the publisher’s yellow-specific
  line now justifies a form under the existing yellow-pea identity.
- The [split-pea integration](../batches/wp03-split-peas-integration-20261011/README.md) added
  separate yellow and green split-pea identities and no forms. This proposal does not create a
  generic split-pea alias or a cross-identity substitution.
- The [regional pulse review](wp03-h-regional-pulses-urd-cowpea-lupini-review-20261011.md) found no
  recipe demand for its regional pulse candidates and added no forms. Nothing in this corpus scan
  changes those species or edible-part boundaries.
- The [adzuki form integration](../batches/wp03-section-h-i-pulses-nuts-gap-integration-20261011/README.md)
  and the [pinto canned-with-liquid review](wp03-section-h-next-open-pulse-product-review-20261011.md)
  are already reflected in the live forms and row links; this proposal does not duplicate them.

## Held scope and validation notes

- **Whole/split/dehulled:** accept only the yellow-specific whole-dry form for `105#1`; no split
  line is present. No recipe asks for a hulled/dehulled pea state. The split-Desi forms remain
  species-scoped and unrelated to this row.
- **Dry/soaked/cooked:** dry azuki and the proposed dry whole yellow peas are exact inputs. The
  soak/drain/cook steps in recipe 105 and azuki cooking in recipe 004 do not justify standalone
  soaked/cooked forms, ratios, or yields.
- **Canned/drained/refried:** pinto-with-liquid and kidney-rinsed/drained are already linked. The
  refried/mash result in recipe 007 is a recipe output, not another pulse input form. No other
  manifest line requests a canned or drained pulse state.
- **Aquafaba/bean liquid:** zero aquafaba term or ingredient line. The pinto can liquid stays with
  its can; the conditional azuki cooking liquid stays a recipe-specific process aid. No global
  bean-liquid identity or substitution is supported here.
- **Measurements and substitutions:** no density, unit mapping, transferable cup weight, package
  yield, dry-to-cooked ratio, or substitution rule is proposed. Existing recipe quantities remain
  source-specific.
- **Reproducibility:** the read-only audit followed the 114 manifest paths and counted all 1,123
  ingredient rows. The exact-key scan used `tools/seed_package/bundled_seed_package.py`’s
  `normalize_search_key`; the proposed form ID and packet source IDs were absent from active data
  at review time. No app, package, unit, or instrumentation tests were run.

