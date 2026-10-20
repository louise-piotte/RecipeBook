# WP03 puffed grains, prepared grain products, and recipe source corrections

2026-10-10 integration checkpoint. The broad WP02, WP03 Section F/G, and WP04 work remains open.

## Integrated catalog decisions

- Added identity-only `puffed quinoa / quinoa soufflé`, with no aliases, forms, reusable measures,
  conversions, yields, or recipe links. GoGo Quinoa's [English product page](https://gogoquinoa.com/products/puffed-quinoa-6-bags)
  and [French product page](https://gogoquinoa.com/fr/products/puffed-quinoa-6-bags) attest the
  display pair. Keep the branded 180 g package out of generic measurement data and distinguish
  single-grain puffed quinoa from multi-ingredient quinoa-puffs snacks.
- Added identity-only `puffed millet / millet soufflé`, with only the manufacturer-supported English
  alias `millet puffs`. A cited bar recipe lists 2 tasses of puffed millet or puffed quinoa; this is
  recorded only as an exact-recipe research finding, with no runtime substitution rule or general
  volume relation.
- Added `gnocchi / gnocchi` as a separate `GRAIN_AND_CEREAL` identity, with only OQLF's French plural
  `gnocchis` as an alias. Two label portions remain product-specific ledger observations: O'Sole
  Mio frozen potato gnocchi, 1.25 cups / 215 g, and Olivieri fresh potato gnocchi, 0.5 cup / 85 g.
  Neither is a generic cup conversion. Olivieri's fresh-pasta suggestion lacks a comparable amount,
  exact target, and preparation adjustments, so no pasta substitution rule is active.
- Added `spaetzle / spätzle` as a distinct boiled flour-dough product, separate from generic pasta
  and gnocchi. Added no aliases, measures, forms, or substitutions.
- Reviewed lotus-starch wording without changing the row. Retain the existing French display
  `amidon de racine de lotus` as wording attested on a Canadian French composite-product listing;
  OQLF's entries do not establish a Québec-preferred standalone product name. Keep the row's
  `needs_clarification` identity state pending stronger Québec evidence.

The primary source records are attached to the existing rows in
[`research-ledger.v1.json`](../../research-ledger.v1.json):

- `WP03-PQUINOA-20261010-S01–S03, S06` and `WP03-PMILLET-20261010-S01–S02, S05–S06`
- `WP03-GNOCCHI-20261010-S01–S06`, `WP03-SPAETZLE-20261010-S01–S02`, and
  `WP04-GROUND-BEEF-90-20261010-S01`
- `WP02-LOTUS-STARCH-QC-20261010-S01–S04`

Further primary terminology and product sources include [OQLF's gnocchi entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359988/gnocchi),
[OQLF's spätzle entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18047214/spaetzle),
the [Québec Food Directory's O'Sole Mio listing](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201819),
[Olivieri's fresh gnocchi label](https://olivieri.ca/fr/produits/gnocchi-de-pomme-de-terre/), and its
[Gnocchi 101 use guide](https://olivieri.ca/fr/le-cuisine/gnocchi-101/).

## Recipe source corrections

- Recipe 114, German Chocolate Cake, now follows Sally's Baking Addiction's [source recipe](https://sallysbakingaddiction.com/german-chocolate-cake/):
  one 12-ounce can of evaporated milk, stored as 354 ml. The French detail screen rendered
  `354 ml lait évaporé` during Pixel QA.
- Recipe 026, Magic Cookie Bars, now points to Eagle Brand's current [English recipe](https://www.eaglebrand.ca/en/recipes/bars-and-cookies/magic-cookie-bars).
  Its French counterpart, [Barres magiques](https://www.eaglebrand.ca/fr/recettes/barres-et-biscuits/barres-magiques),
  also specifies one 300 mL can. The recipe's existing 300 ml quantity was retained.
- Recipe 078, Shepherd's Pie ingredient 3, now preserves the publisher's exact line `1 lb. 90% lean
  ground beef -or ground lamb`. The [source recipe](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/)
  supports this recipe-local qualifier and option only. No ground-lamb catalog identity, composition
  field, portion mapping, or substitution rule was added.

## Verification

The normalized package contains 800 ingredient references, 36 forms, 1,026 research-ledger records,
2,217 source entries / 1,798 distinct source IDs, and 114 recipes. The seed normalizer reported zero
changed parts; package validation, generated-index freshness, research-ledger validation, UTF-8/no-BOM
checks for this batch's files, and `git diff --check` passed.

- Python seed-package suite: 28 tests passed.
- Android debug unit suite: 344 tests passed.
- Pixel 9a / API 36 instrumentation: 30 cases, 0 failures, 2 skipped (from the XML test report).
- `tools/deploy_to_pixel9a_emulator.sh`: tests and debug assembly passed; install and launch succeeded
  on the isolated clone at serial `emulator-5558`.
- UI checks on that clone: English `puffed`, `millet`, `puffs`, and `spaetzle` searches showed the
  expected rows; the `gnocchis` alias resolved to `gnocchi`. French `millet` showed `millet soufflé`,
  and `gnocchis` resolved to the localized `gnocchi` row. The French home showed `Toutes les recettes
  (114)` after exiting the unsaved draft.
- The owner Pixel 9a AVD data-image hashes matched their pre-QA values: `userdata-qemu.img`
  `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` and `sdcard.img`
  `5f2d56e8dcd5f647175ea2ff9818471a0757f0bb28ec3959e658b99716abcd1a`. The isolated clone was shut
  down and removed.

The reviewed proposal packets are
[`wp02-b2-b3-lotus-starch-quebec-wording-review-20261010.md`](../../proposals/wp02-b2-b3-lotus-starch-quebec-wording-review-20261010.md),
[`wp03-section-g-gnocchi-identity-review-20261010.md`](../../proposals/wp03-section-g-gnocchi-identity-review-20261010.md),
and [`wp04-ground-beef-90-percent-lean-line-followup-20261010.md`](../../proposals/wp04-ground-beef-90-percent-lean-line-followup-20261010.md).

## QA artifacts

Screenshots are from the deployed isolated Pixel 9a clone. Their SHA-256 hashes and the debug APK
fingerprint are listed in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

- [English home](screenshots/home-en.png)
- [English puffed-grain results](screenshots/picker-puffed.png)
- [English millet results](screenshots/picker-millet.png)
- [English spaetzle result](screenshots/picker-spaetzle.png)
- [French millet results](screenshots/picker-millet-fr.png)
- [French gnocchi result from the `gnocchis` query](screenshots/picker-gnocchi-fr.png)
- [Corrected evaporated-milk line in French recipe details](screenshots/recipe-german-chocolate-cake-fr.png)
- [French home after discarding the unsaved draft](screenshots/home-fr.png)

Section F/G parent work remains open, as do the broader WP02 terminology and WP04 evidence sweeps.
