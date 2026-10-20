# WP03 Section F Residual Cereal and Grain Review

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** recommendations partially integrated on 2026-10-10. This packet remains the research record; the shared package changes, tests, and Pixel 9a evidence are in [`catalog-residual-boundaries-integration-20261010`](../batches/catalog-residual-boundaries-integration-20261010/README.md). The packet itself contains no implementation edits.
- **Scope:** reconcile the still-open Section F checklist with the live catalog; conduct a fresh Québec French terminology review of integrated but provisional cereal names; and assess the open cereal-mix line where Québec terminology and product boundaries are directly supported.
- **Disposition:** the reviewed `red rice`, `instant oats`, `hominy grits`, and roasted-buckwheat identities remain distinct; the quick-oats French display and unsupported alias were corrected; identity-only `granola` and `muesli` references were added. General measurements, forms, yields, conversions, and substitutions remain inactive. No reviewed identities were merged.

## Current-state audit

The read-only audit covered `AGENTS.md`, `Requirements.md`, the Section F checklist and later status entries in the global catalog plan, the latest roadmap summary, live seed references and forms, all 114 recipe files and their 1,123 ingredient rows, the 1,099-record research ledger, the 78 legacy candidates, and the current Section F batch/proposal documents. The live package contains **853 ingredient references and 47 forms**. The values below describe the 2026-10-10 workspace snapshot.

The newest Section F-specific plan entries add puffed quinoa and puffed millet; a later entry adds puffed wheat. At this packet's review snapshot, the roadmap summarized 47 integrated Section F identities (46 in `GRAIN_AND_CEREAL`, plus hominy corn in `VEGETABLE_AND_AROMATIC`); granola and muesli were integrated afterward. These integrations do not close the independent Québec naming review, the remaining explicit holds, or broader regional cereal-mix coverage. The earlier residual-gap packet's white-rice proposal is already integrated, including the dry/cooked forms and recipe 066 link; it is not repeated here.

### Bundled recipe demand

A scan of the full recipe corpus found these Section F-linked ingredient lines:

| Recipe and line | Current catalog link | What it establishes |
| --- | --- | --- |
| 024#6, `175 g quick oats` | `ingredient-ref-quick-oats` | Direct quick-oats identity demand; the line is already linked. It does not establish a reusable volume measure. |
| 047#4, `1 1/2 cups quick oats` | `ingredient-ref-quick-oats` | Direct quick-oats identity demand; the line is already linked. It does not establish a reusable mass equivalent. |
| 001#1, `1/2 cup old-fashioned rolled oats` | `ingredient-ref-rolled-oats` | Existing rolled-oat identity; no cooked form is requested. |
| 065#1, `1 part rolled oats` | `ingredient-ref-rolled-oats` | Existing rolled-oat identity for overnight oats; no cooked-oat ingredient line is specified. |
| 016#1, `2 cups cooked quinoa` | `ingredient-ref-quinoa` + `ingredient-form-quinoa-cooked` | Existing cooked form. |
| 066#14, `Cooked white rice, for serving` | `ingredient-ref-white-rice` + `ingredient-form-white-rice-cooked` | Existing white-rice state form. |
| 086#16, 090#16, 093#1, cooked rice | `ingredient-ref-rice` + `ingredient-form-rice-cooked` | Existing generic cooked-rice form. |
| 040#5, `6 cups crispy rice cereal` | `ingredient-ref-rice-cereal` | Ready-to-eat crispy rice cereal, distinct from puffed rice. |

There are **no bundled ingredient lines or recipe-file mentions** for red rice, instant oats, hominy grits, roasted buckwheat groats, granola, muesli, rye berries, pot barley, farro, generic grits, polenta, pearled hominy, pozole corn, or a generic cereal mix. Do not infer recipe demand from recipe prose that only mentions breakfast or a grain in a serving suggestion.

### Exact IDs and current forms checked

The following current active IDs were checked for product boundaries, aliases, and name collisions:

- Rice: `ingredient-ref-rice`, `ingredient-ref-white-rice`, `ingredient-ref-brown-rice`, `ingredient-ref-black-rice`, `ingredient-ref-red-rice`, `ingredient-ref-long-grain-rice`, `ingredient-ref-medium-grain-rice`, `ingredient-ref-short-grain-rice`, `ingredient-ref-basmati-rice`, `ingredient-ref-jasmine-rice`, `ingredient-ref-arborio-rice`, `ingredient-ref-carnaroli-rice`, `ingredient-ref-bomba-rice`, `ingredient-ref-calrose-rice`, `ingredient-ref-glutinous-rice`, `ingredient-ref-parboiled-rice`, `ingredient-ref-broken-rice`, `ingredient-ref-wild-rice`, `ingredient-ref-flattened-rice-poha`, `ingredient-ref-puffed-rice`, and `ingredient-ref-rice-cereal`.
- Oats: `ingredient-ref-oat-groats`, `ingredient-ref-steel-cut-oats`, `ingredient-ref-rolled-oats`, `ingredient-ref-quick-oats`, `ingredient-ref-instant-oats`, and `ingredient-ref-oat-bran`.
- Other Section F grains: `ingredient-ref-hulled-barley`, `ingredient-ref-pearl-barley`, `ingredient-ref-bulgur`, `ingredient-ref-freekeh`, `ingredient-ref-wheat-berries`, `ingredient-ref-emmer-grain`, `ingredient-ref-cracked-wheat`, `ingredient-ref-rye-grain`, `ingredient-ref-triticale-grain`, `ingredient-ref-teff-grain`, `ingredient-ref-roasted-buckwheat-groats-dry`, `ingredient-ref-millet`, `ingredient-ref-pearl-millet`, `ingredient-ref-foxtail-millet`, `ingredient-ref-common-millet`, `ingredient-ref-finger-millet`, `ingredient-ref-jobs-tears`, `ingredient-ref-grain-sorghum`, `ingredient-ref-white-fonio`, `ingredient-ref-black-fonio`, `ingredient-ref-quinoa`, `ingredient-ref-amaranth-grain`, `ingredient-ref-hominy-grits`, `ingredient-ref-corn-flakes`, `ingredient-ref-popcorn`, `ingredient-ref-puffed-wheat`, `ingredient-ref-puffed-quinoa`, and `ingredient-ref-puffed-millet`.
- Separate category boundary: `ingredient-ref-hominy-corn` is the active whole-kernel processed-corn identity in `VEGETABLE_AND_AROMATIC`, not an alias or parent for hominy grits.
- Existing forms: `ingredient-form-rice-dry`, `ingredient-form-rice-cooked`, `ingredient-form-white-rice-dry`, `ingredient-form-white-rice-cooked`, `ingredient-form-quinoa-dry`, `ingredient-form-quinoa-cooked`, `ingredient-form-oat-bran-dry`, `ingredient-form-oat-bran-cooked`, `ingredient-form-bulgur-fine-grind`, `ingredient-form-bulgur-medium-grind`, `ingredient-form-bulgur-coarse-grind`, `ingredient-form-bulgur-extra-coarse-grind`, `ingredient-form-flattened-rice-poha-thin`, `ingredient-form-flattened-rice-poha-medium`, and `ingredient-form-flattened-rice-poha-thick`.

A normalized exact-key audit of the review-snapshot displays, aliases, form labels, and form match terms found no active collision for `avoine à cuisson rapide`, `granola`, `muesli`, or `musli`. The existing quick-oat alias `flocons d'avoine à cuisson rapide` became its display; it is intentionally not a new row. Accent folding makes `muesli` and `müesli` the same search key, so only one of those French spellings is stored as an alias.

The following ledger-only candidates were checked and remain deliberate holds: `ingredient-ref-farro`, `ingredient-ref-pot-barley`, `ingredient-ref-polenta`, `ingredient-ref-pearled-hominy`, `ingredient-ref-pozole-corn`, and `ingredient-ref-sushi-rice`; each is `recordType: candidate`, `identityState: needs_clarification`, with measurement and substitution research not yet complete. At the review snapshot, generic grits, dried sweet corn, a generic cereal mix, granola, and muesli had no active seed/ledger identity; granola and muesli were added by the later residual integration. `ingredient-ref-rye-berries` is not active or in the ledger; its distinct proposal is being handled in [`wp03-section-f-residual-grain-identities-review-20261010.md`](wp03-section-f-residual-grain-identities-review-20261010.md), so this packet makes no competing rye-berry recommendation.

## Open checklist reconciliation

The unchecked Section F text contains stale aggregate rows. This reconciliation follows current IDs and later checkpoints, not the old unchecked row as a claim that every named product is absent.

| Plan location | Current live status | Recommendation in this packet |
| --- | --- | --- |
| F, rice inventory and white rice, lines 1356–1366 | Rice types, red rice, generic rice forms, and white rice with dry/cooked forms are integrated. The current red-rice identity is `ingredient-ref-red-rice`; generic sushi rice remains a separate held candidate. | Review and retain `red rice / riz rouge`; do not reopen sushi rice, whose 2026-10-10 source-refresh packet keeps it unresolved. |
| F, oat reconciliation, lines 1367–1371 | `ingredient-ref-quick-oats` and `ingredient-ref-instant-oats` are active, distinct references. Their broader Québec terminology review remains open. Quick oats have the only two matching recipe lines. | The quick-oat display and alias correction is integrated; retain the instant-oat display and boundary. |
| F, barley/grain aggregate, lines 1372–1382 | Hulled and pearl barley, freekeh, wheat berries, emmer, cracked wheat, triticale, and the four listed bulgur grind forms are active. Fine/medium/coarse/extra-coarse bulgur is integrated. Generic “very coarse,” federal No. 5 half-cuts, and source-specific grade schemes remain unresolved. `farro` and pot barley retain explicit holds. | Exclude integrated identities. Keep the documented holds and grade gaps as-is; do not invent a crosswalk. Rye berries are covered by the separate proposal linked above. |
| F, species-level review, lines 1398–1412 | Quinoa, amaranth, generic grain sorghum, white/black fonio, and the named millet identities are in the seed. The checklist records the named foxtail/common/Job's tears/finger millet additions as complete. | No additional species identity is justified by this terminology packet. Keep the broader species/cuisine sweep open for a named source-backed candidate. |
| F, roasted buckwheat, lines 1413–1416 | `ingredient-ref-roasted-buckwheat-groats-dry` is active as `buckwheat groats, roasted, dry / gruau de sarrasin, rôti, sec`; its independent Québec review remains open. | Retain the exact qualified pair; keep `kacha / kasha` off the dry-groats identity. |
| F, grits/polenta/hominy/puffed-grain row, lines 1417–1427 | Hominy grits, popcorn, corn flakes, crispy rice cereal, puffed rice, puffed wheat, puffed quinoa, puffed millet, and flattened rice (poha) are integrated. Generic grits, polenta, pearled hominy, pozole corn, dried sweet corn, and any further puffed product remain open or held. | Retain the hominy-grits row but keep its French display provisional and alias-free. Preserve every separate product hold. |
| F, remaining dry/cooked forms, line 1437 | Generic rice, white rice, quinoa, and oat bran have the existing forms listed above. No other current recipe has an explicit cooked-grain ingredient line requiring a new form. | Add no more state forms and infer no cooking yield. |
| F, regional cereal mixes/preprocessed grains, line 1439 | `granola` and muesli were absent from the review snapshot; OQLF and Québec food-directory sources identify them as separate products. | The two identity-only references are integrated; the unspecified `cereal mix` class and unexamined regional mixes remain open. |

Relevant later records confirm the boundaries: the white-rice integration is in [`wp02-wp03-wp04-arrowroot-white-rice-beef-integration-20261010/README.md`](../batches/wp02-wp03-wp04-arrowroot-white-rice-beef-integration-20261010/README.md); the puffed-grain work is in [`wp03-puffed-wheat-identity-integration-20261010/README.md`](../batches/wp03-puffed-wheat-identity-integration-20261010/README.md) and [`wp03-puffed-quinoa-and-wp04-recipe-source-corrections-identity-integration-20261010/README.md`](../batches/wp03-puffed-quinoa-and-wp04-recipe-source-corrections-identity-integration-20261010/README.md). Existing holds remain documented in [`wp03-section-f-sushi-rice-boundary-review-20261010.md`](wp03-section-f-sushi-rice-boundary-review-20261010.md), [`wp02-wp03-farro-grain-flour-boundary-20261010.md`](wp02-wp03-farro-grain-flour-boundary-20261010.md), [`pot-barley-boundary-review.md`](../batches/pot-barley-boundary-review.md), [`hominy-boundary-review.md`](../batches/hominy-boundary-review.md), and [`polenta-boundary.md`](../batches/polenta-boundary.md). No new evidence in this packet changes those decisions.

## Québec terminology decisions

### Red rice: keep the current pair, without aliases

Keep `ingredient-ref-red-rice` as `red rice / riz rouge` with empty alias arrays. No OQLF food entry specifically for red rice surfaced in this review, so do not describe the pair as an OQLF-preferred term. The federal bilingual food specification directly pairs the edible red-bran product as `Red Rice / Riz rouge`, and current Metro Québec packaging/catalogue uses the French product title `Riz rouge`. This is enough to retain the already integrated display pair for this scoped food identity.

Do not expand the identity to weedy/agronomic red rice, red-rice vinegar, red yeast rice, or a named regional/cultivar product; do not add `riz rouge complet` as an alias because it adds a milling qualifier. Keep brown as a separate, potentially overlapping milling axis. The recipe corpus has no red-rice demand, so no recipe or form change is proposed.

### Quick and instant oats: preserve the processing distinction; correct only quick oats

TERMIUM Plus gives `flocons d'avoine à cuisson rapide` for quick oats and describes them as rolled oats further processed to shorten cooking time. A current Canadian product page from Bob's Red Mill uses that same French label for its thin-pressed quick flakes. This is clearer Quebec French than the current display `flocons d'avoine rapides`; `avoine rapide` also omits the cooking qualifier and lacks support in the sources reviewed.

Recommend an in-place terminology correction on the existing reference:

| ID | English display | Proposed fr-CA display | English aliases | French aliases |
| --- | --- | --- | --- | --- |
| `ingredient-ref-quick-oats` | `quick oats` | `flocons d'avoine à cuisson rapide` | `quick-cooking oats` | `avoine à cuisson rapide` |

Move the currently stored French alias `flocons d'avoine à cuisson rapide` to `nameFr`; remove unsupported `avoine rapide`; retain the existing supported English `quick-cooking oats` alias. Do not add `instant oats` as an alias. The ledger currently marks quick-oats identity `unreviewed` with no source entries even though the reference is active; this review supports promoting the identity to `verified` with the Québec/federal terminology sources below. Keep its measurement state `blocked_pending_evidence` and substitution state `not_yet_researched`.

Keep the existing instant-oat pair `instant oats / flocons d'avoine à cuisson instantanée`, with empty aliases. TERMIUM supports this wording and describes a distinct more highly processed instant flake. Its entry also says these flakes commonly occur in flavoured oatmeal sachets, so do not use `gruau instantané`, `instant oatmeal`, or any packet/product phrase as a plain-flake alias. TERMIUM also lists `flocons d'avoine minute`, but this packet does not activate it: local retail language uses “une minute” and “instantané” for packaged oatmeal products, creating a mix/flake boundary that should be resolved from a specific label before adding the shorter phrase. Keep quick and instant oats as distinct identities; no merge is supported.

### Hominy grits: keep the federal bilingual display provisional and alias-free

Keep `ingredient-ref-hominy-grits` as `hominy grits / gruau de maïs`, with no aliases. Statistics Canada's human-food MDFoodCode maps `Hominy grits` directly to `Gruau de maïs`. The OQLF entry for `gruau de maïs` is scoped to brewing/malt crushing, while a current RICARDO Québec recipe uses `gruau de maïs` and `semoule de maïs de type grits` for generic coarse-ground corn grits and describes a type-polenta replacement. Thus the direct federal mapping justifies retaining the existing bilingual row, but the French phrase is not unique to hominy grits in Québec cooking.

Do not merge hominy grits with generic corn grits, cornmeal, polenta, whole hominy corn, or a generic `grits` candidate. Keep `semoule de maïs de type grits` and feed-scoped `gruau hominy` off the aliases. If the generic-grits candidate is ever separately accepted, preserve the name overlap for explicit selection rather than silently assigning `gruau de maïs` to one identity. This is a terminology hold on alias expansion, not a reversal of the integrated identity.

The RICARDO source contains one recipe-specific `180 g (1 tasse)` coarse-grits amount and a one-recipe polenta-type alternative. Neither applies to the bundled recipes or establishes a universal hominy-grits measure or substitution rule. Keep both as source-specific external recipe context only.

### Roasted buckwheat groats: retain the qualified pair; keep kasha separate

Keep `ingredient-ref-roasted-buckwheat-groats-dry` as `buckwheat groats, roasted, dry / gruau de sarrasin, rôti, sec`, without aliases. Health Canada's exact bilingual food name supports the full display. Current Québec retailer/manufacturer pages use `gruau(x) de sarrasin` for the dry groat product, while OQLF defines `kacha / kasha` as a cooked gruel made from roasted buckwheat and defines Québec `gruau` both as oatmeal/porridge and, in a malt-crushing sense, cereal grits. Keep the full `rôti, sec` qualifiers to distinguish the dry ingredient from a prepared dish; do not shorten it to `gruau de sarrasin` in the picker and do not alias `kasha`.

The current searchable CNF page for food code 4412 displays `100 ml = 69.3 g`, `250 ml = 173.3 g`, and `36 g` to make 125 ml. The page is dated 2019-03-01 and is part of the old CNF serving interface; the recent residual-gap review notes that the searchable 2015 CNF is interim and says not to import its values until matching 2026 CNF rows and methods are reviewed. Therefore keep `measurementState: not_yet_researched`, `defaultDensity: null`, and `unitMappings: []`; do not turn those old serving values into a general density. No bundled recipe uses roasted buckwheat groats. No substitution is supported.

### Open cereal-mix line: separate muesli and granola identities

The checklist's regional cereal-mix line was open at review time. OQLF treats both `granola` and `musli` as processed-cereal foods and defines a product boundary between them: granola is a baked oat-flake/dried-fruit/nut mixture in clusters and includes added sugar and fat; musli/muesli is uncooked, has no added sugar or fat, and is usually combined with milk. OQLF lists `musli`, `muesli`, and `müesli` as Québec French terms and describes the preparation as Swiss in origin. A current Aliments du Québec product listing uses `Muesli amandes et raisins` for a Quebec-made product; the Québec Food Directory also lists named granola products. This supports two distinct ingredient-reference identities rather than a generic `cereal mix` row.

| Integrated stable ID | English display | fr-CA display | EN aliases | FR aliases | Category and initial data |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-granola` | `granola` | `granola` | none | none | `GRAIN_AND_CEREAL`; null density; no mappings or forms |
| `ingredient-ref-muesli` | `muesli` | `musli` | `musli` | `muesli` | `GRAIN_AND_CEREAL`; null density; no mappings or forms |

Do not store `müesli` as a second French alias in addition to `muesli`: accent-insensitive search reduces both to the same key. Do not add `birchermüesli` because OQLF scopes it to Switzerland; do not add broad `cereal mix`, `breakfast cereal`, `céréales`, `mélange de céréales`, or `multigrain` aliases. The OQLF `multigrain / multicéréale` entry is adjectival and does not define one food identity. Keep muesli and granola separate because the source defines different processing/composition boundaries; do not merge either with oats or crispy rice cereal.

At the review snapshot, these two names had no exact active key, legacy candidate, or recipe demand. They were integrated as identity-only coverage for the open breakfast-cereal/mix checklist, not as recipe relinks or a claim that all regionally specific cereal mixes have been reviewed. Other cuisine-specific packaged mixes remain open until an exact product, composition, and Québec label are sourced.

## Measurement, form, yield, and substitution disposition

- **Quick oats:** the two bundled amounts (175 g and 1.5 cups) are recipe-specific line quantities. Bob's Red Mill Canada lists 1/2 cup = 45 g for its own quick-oat product; do not generalize that brand-specific value to either recipe or activate a unit mapping. No useful quick-oat density is established.
- **Instant oats:** no recipe line, source measure, conversion, or substitute is established. Keep measurement research `not_yet_researched`.
- **Red rice and hominy grits:** no bundled recipe line, matching preparation form, or general portion data is present. Do not infer cooking yields from grain color or corn milling class.
- **Roasted buckwheat groats:** retain the CNF name evidence but hold its older portion values outside the ledger/runtime pending the matching 2026 CNF record and method review. No cooking yield is inferred.
- **Muesli and granola:** integrated identity-only rows; no default density, volume mapping, package yield, form, recipe link, or substitution.
- **Substitutions:** none are suitable for global or contextual activation here. The RICARDO coarse-corn-grits/polenta note is recipe-specific and outside the bundled corpus; it is not a hominy-grits-to-polenta merge. Quick/instant oats, granola/muesli, and red/brown rice remain distinct; no source supports a general replacement ratio among them.

## Existing identities explicitly excluded from new integration

The active IDs above confirm these identities are already integrated and are not proposed for recreation, rename, alias broadening, or state-form expansion: all named rice classes and varieties; generic rice/quinoa and white-rice dry/cooked forms; oat groats, steel-cut, rolled, quick, and instant oats; oat-bran dry/cooked forms; hulled and pearl barley; four bulgur grind forms; freekeh, wheat berries, emmer, cracked wheat, triticale, teff, millet/fonio/amaranth identities; roasted buckwheat groats; hominy grits and whole hominy corn; popcorn, corn flakes, crispy rice cereal, puffed rice, puffed wheat, puffed quinoa, puffed millet; and flattened rice (poha) with its three thickness forms. Their identity names and aliases are left as currently recorded, including the quick-oats correction.

No merge is recommended. In particular: quick oats ≠ instant oats; hominy grits ≠ generic grits/cornmeal/polenta/whole hominy; roasted dry buckwheat groats ≠ prepared kasha; red rice ≠ brown rice or red yeast rice; granola ≠ muesli; puffed rice ≠ crispy rice cereal; and a named cereal mix is not an alias for its component grain.

## Search and regression boundaries

| Query/input | Expected identity or outcome |
| --- | --- |
| `quick oats`, `quick-cooking oats` | Existing `ingredient-ref-quick-oats`, displayed in fr-CA as `flocons d'avoine à cuisson rapide`. |
| `flocons d'avoine à cuisson rapide`, `avoine à cuisson rapide` | `ingredient-ref-quick-oats`; accent/punctuation folding remains functional. `avoine rapide` should no longer be an explicit alias. |
| `instant oats`, `flocons d'avoine à cuisson instantanée` | Existing `ingredient-ref-instant-oats`; no quick-oat alias or prepared packet result is introduced. |
| `quick oats` vs `instant oats` | Must remain two distinct reference IDs in both locales; neither is an alias of the other. |
| `red rice`, `riz rouge` | Existing `ingredient-ref-red-rice` only; no new color/milling or vinegar/yeast alias. |
| `hominy grits`, `gruau de maïs` | Existing `ingredient-ref-hominy-grits`; preserve the note that `gruau de maïs` is not a universal unique synonym for all Québec grits products. |
| `buckwheat groats, roasted, dry`, `gruau de sarrasin rôti sec` | Existing `ingredient-ref-roasted-buckwheat-groats-dry`; `kasha`/`kacha` stays outside that dry-grain identity. |
| `granola` | Integrated `ingredient-ref-granola`, displayed identically in EN/fr-CA. |
| `muesli`, `musli`, `müesli` | Integrated `ingredient-ref-muesli`; fr-CA display `musli`, with `muesli` alias and accent-insensitive resolution of `müesli`. |
| `cereal mix`, `mélange de céréales`, `multigrain` | No generic cereal-mix identity is selected. Review exact packaged or regional mixes independently. |

## Source register

All pages were accessed on 2026-10-10. The integrated quick-oats, red-rice, hominy-grits, roasted-buckwheat, granola, and muesli decisions record their relevant source IDs below in their corresponding ledger records; S04–S05 remain contextual citations here because the instant-oats identity was not changed.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-FCR-20261010-S01` | TERMIUM Plus, [quick oats](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=AVOINE+CUISSON+RAPIDE) | Lists `flocons d'avoine à cuisson rapide` and `avoine à cuisson rapide` as correct French terms for quick oats; describes the processed rolled-oat class. Terminology and product boundary, not a measurement. |
| `WP03-FCR-20261010-S02` | OQLF, [flocon d'avoine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497597/flocon-davoine) | Defines the Québec French flake term and says greater flattening/crushing/steaming reduces later cooking time. Supports `flocons d'avoine` and explains why a cooking qualifier is useful; does not define quick versus instant on its own. |
| `WP03-FCR-20261010-S03` | Bob's Red Mill Canada, [Flocons d'avoine à cuisson rapide](https://www.bobsredmill.ca/produit/flocons-davoine-a-cuisson-rapide) | Current Canadian French product heading and product description for thin-pressed quick oats; page's `1/2 cup (45 g)` is brand/product-specific and not transferred to the app's generic reference or recipes. |
| `WP03-FCR-20261010-S04` | TERMIUM Plus, [instant oats](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=AVOINE+GRUAU) | Lists `flocons d'avoine à cuisson instantanée` and `flocons d'avoine minute`; its context associates instant oats with flavored sachets, so the full qualified display is retained and the shorter synonym is held pending exact package scope. |
| `WP03-FCR-20261010-S05` | OQLF, [gruau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau) | Defines Québec/Canadian `gruau` as cooked oatmeal, while noting the meaning can extend to other cereal porridges. Supports keeping `gruau` unqualified out of dry-oat-flake displays. |
| `WP03-FCR-20261010-S06` | Government of Canada, [Food Quality Specifications – Rice, English](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf) and [French](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf), FQS/SQA-22-02, table 2 | Direct bilingual food-product entries `Red Rice / Riz rouge`, scoped to edible red-bran rice. Federal food specification, not an OQLF entry or support for every use of “red rice.” |
| `WP03-FCR-20261010-S07` | Metro Canada, [Cedar Phoenicia Riz rouge / Red Rice](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/riz/riz-rouge/p/062356542504) | Current Québec retailer's bilingual title/category and single-ingredient product label corroborate `riz rouge`. Retail evidence does not define the global red-rice boundary. |
| `WP03-FCR-20261010-S08` | USDA Agricultural Marketing Service, [Rice Terms](https://www.ams.usda.gov/market-news/livestock-poultry-and-grain-rice-beans-and-lentil-terms), “Red Rice” | Defines the food grain by appreciable red bran; supports scope alongside the Canadian bilingual specification, not Québec French wording. |
| `WP03-FCR-20261010-S09` | Statistics Canada, [MDFoodCode](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf), F232 | Directly maps human-food `Hominy grits` to `Gruau de maïs`; supports the integrated pair, not uniqueness in Québec culinary language. |
| `WP03-FCR-20261010-S10` | OQLF, [gruau de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088614/gruau-de-mais) | Gives `gruau de maïs` in brewing/malt crushing and includes U.S.-scoped `hominy grits`; lexical aid with a domain limit. |
| `WP03-FCR-20261010-S11` | RICARDO, [Grits aux crevettes](https://www.ricardocuisine.com/recettes/8419-grits-aux-crevettes) | Québec culinary use of `gruau de maïs` alongside `semoule de maïs de type grits`; recipe note describes generic coarse corn grits and a polenta-type replacement. The amount and swap are recipe-specific; not evidence for hominy grits or a global rule. |
| `WP03-FCR-20261010-S12` | Health Canada, [CNF serving portion, food code 4412](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4412) | Displays exact bilingual `buckwheat groats, roasted, dry / gruau de sarrasin, rôti, sec`, but the searchable page is dated 2019-03-01 and its portion data are from the older CNF. Retain name evidence; do not import the old measure values before matching 2026 data/method review. |
| `WP03-FCR-20261010-S13` | OQLF, [kacha / kasha](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506505/kacha) | Defines a cooked gruel made from roasted buckwheat; supports keeping the prepared dish out of the dry-groat aliases. |
| `WP03-FCR-20261010-S14` | Bob's Red Mill Canada, [Gruaux de sarrasin biologique](https://www.bobsredmill.ca/produit/gruaux-de-sarrasin-biologique) | Canadian French manufacturer page uses `gruaux de sarrasin` for a groat product and describes roasting as a distinct taste/process property. It is not necessarily the same roast degree or label as CNF code 4412. |
| `WP03-FCR-20261010-S15` | OQLF, [granola](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26542365/granola) | 2024 Québec entry gives the bilingual pair, product definition, and explicit baked/sugar/fat distinction from musli. Supports `granola / granola`; no serving conversion. |
| `WP03-FCR-20261010-S16` | OQLF, [musli](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358354/musli) | Québec entry gives `musli`, `muesli`, and `müesli`, English `muesli/musli`, and distinguishes raw, no-added-sugar/fat musli from granola. `Birchermüesli` is specifically Swiss and is not generalized. |
| `WP03-FCR-20261010-S17` | Aliments du Québec, [Muesli amandes et raisins](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/muesli-amandes-et-raisins) | Current Québec-made packaged product uses `Muesli`, lists oats/almonds/seeds/raisins, and says no sugar added. Product-specific composition, not a universal formula. |
| `WP03-FCR-20261010-S18` | Québec Food Directory, [Granola Maple Peanut Butter](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8222456) | Current official directory has a Montréal-made granola product, last updated 2026-04-09. Corroborates Québec product use; the OQLF entry supplies the general definition. |

## Review disposition

The source-backed terminology correction for `ingredient-ref-quick-oats` is integrated; `ingredient-ref-instant-oats` remains separate with its qualified display. `red rice / riz rouge`, `hominy grits / gruau de maïs`, and the fully qualified roasted-buckwheat display retain their bounded aliases. `granola / granola` and `muesli / musli` are separate identity-only references for the cereal-mix checklist. No generic cereal-mix identity was added, and the documented farro, sushi-rice, pot-barley, polenta, pearled-hominy, pozole-corn, very-coarse-bulgur, No. 5 bulgur, and rye-berry decisions remain unchanged.
