# Reviewed spice, sesame, and rice-vinegar integration — 2026-10-09

This coordinator batch integrates the WP07 peppercorn proposal, the WP03 sesame/tahini proposal,
and the WP05 rice-vinegar proposal. It does not close Sections I, T, or V.

## Catalog decisions

- Retain black pepper and add separate white pepper, green peppercorn, pink pepper, Sichuan pepper,
  Indian long pepper, Javanese long pepper, grains of paradise, and cubeb identities. No new forms,
  recipe links, default measures, conversions, or substitutions were added for the spices.
- Keep generic, white, and black sesame seeds separate. Add a toasted form to generic sesame and a
  separate toasted form to white sesame. Recipe 066's exact white/toasted line now points to the
  white identity and form; recipe 072's toasted line points to the generic sesame form.
- Keep plain rice vinegar, seasoned rice vinegar, and Chinkiang/Zhenjiang vinegar as separate
  identities. Japanese kurozu and broad black-vinegar terms remain outside the Chinkiang aliases.
  No vinegar recipe was relinked.
- Promote legacy ID `ingredient-ref-rice-vinegar` in place and remove its duplicate legacy
  candidate. Retain the existing tahini ID. The shared bilingual search normalizer omits `tahini`
  from French aliases because it duplicates the English canonical term; `tahini` remains searchable
  while the French display remains `beurre de sésame`.

## Evidence limits

- Black pepper has six Health Canada CNF food-code 198 portion observations for whole and ground
  pepper. They are source-scoped ledger observations, not a default density or unit mapping.
- Generic toasted sesame has three CNF food-code 2521 observations (15 ml = 9.5 g, 60 ml = 38.0 g,
  100 ml = 63.4 g). White sesame has one Bob's Red Mill label observation (3 Tbsp = 29 g). Each is
  restricted to its source product or food code; no general conversion was activated.
- The Heinz Canadian pork-rib glaze's replacement of 2 Tbsp Chinkiang/Zhenjiang vinegar with
  2 Tbsp rice vinegar plus 1/2 tsp soy sauce is recorded as a recipe-specific compound finding.
  No active substitution rule was added.
- Measurement and substitution research remains open for the new spice identities. Sesame hull
  distinctions and substitutions remain open. Rice-vinegar measurements and broad substitution
  research remain open.

## Audit and package snapshot

The 78 focused normalized terms across the integrated identities and toasted forms were compared
with active reference names/aliases, form labels/match terms, and legacy candidates. There were zero
collisions with unrelated references, forms, or legacy candidates. The 114 bundled recipes and
1,123 ingredient rows were checked; no new spice or vinegar identity needed a recipe link. Only the
two explicit toasted-sesame lines changed.

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 509 references | `235871639394f42e344bf86159d463600a7e58f5d65645b38b6f7a21f475e644` |
| `ingredient-forms.v1.json` | 32 forms | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 689 records; 1,107 source entries; 926 distinct source IDs | `f6ee45b415357f2bde780eb791dcd1b88ecc4d53420ffdacbb72c6316c2a88c8` |
| `legacy-import-identities.v1.json` | 97 candidates | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |
| Recipe corpus, manifest order | 114 recipes; 1,123 ingredient rows | `31139675c0a2f37863a57e2e45e8df203b0255b11e12cf54f1df944cdd426890` |

The recipe corpus digest hashes, in manifest order, each relative filename, a NUL byte, the raw
recipe JSON bytes, and a NUL byte. Bundled JSON remains UTF-8 without BOM and stores French accents
as explicit Unicode escapes.

## Verification

- Bundled-package normalization, ingredient-reference normalization, and generated-index freshness
  checks passed. The research-ledger schema validator reported zero errors.
- All 10 Python seed-package tests passed. Android unit tests passed 315/315.
- Pixel 9a / API 36 instrumentation on `emulator-5556`: 29 cases, 27 passed, 2 skipped, 0
  failures or errors. A second attached emulator (`emulator-5554`) ran zero tests; Android reported
  insufficient storage while installing there.
- `tools/deploy_to_pixel9a_emulator.sh` installed and launched the debug app on `emulator-5556`.
  Live picker checks returned the expected English and French identity labels and sesame form hints.
  Unsaved drafts were discarded and the French home was restored at 114 recipes.

## Pixel screenshots

| Screenshot | SHA-256 |
| --- | --- |
| [English white-pepper result](screenshots/en-white-peppercorn.png) | `9d9988a2bc98100838b7acd3cb02f2ac79f1fc3fa4840e531dec34548ad3ecf9` |
| [French white-pepper result](screenshots/fr-white-peppercorn.png) | `7e6ee098a26b3964820cf10ab1046fda6f27842dd797e15639ecf9c59f243743` |
| [English toasted white sesame result and form hint](screenshots/en-toasted-white-sesame.png) | `21623ba089bb07be2d3d9c9e06904593bdf2745051d3f3a65a463a601d9bbb4f` |
| [French toasted white sesame result and form hint](screenshots/fr-toasted-white-sesame.png) | `cef4efd2dea84667ed556cc16bb5be5240ae46369c35bf45d7fe9d2b04dbc331` |
| [English seasoned rice-vinegar result](screenshots/en-seasoned-rice-vinegar.png) | `6771a0bed3b47e3c8f0b1ea6bc0e010ec681c4f8aae3a4c6896ee2db3380600a` |
| [French seasoned rice-vinegar result](screenshots/fr-seasoned-rice-vinegar.png) | `a4bbc89082d25b1cd88e957e845a5493fbaaed93fed23f5d10c1229b7c09afa9` |
| [French Zhenjiang alias result](screenshots/fr-zhenjiang-vinegar.png) | `ae85ef2b3276da89d040fcad29480452f0024045242e65c9eeee69aab742c3ca` |
| [French library home, 114 recipes](screenshots/fr-library-home.png) | `830fbdd626b6ec3d1e2b64747cc789068c7cd4e8f0cfaec82fadb806a3c552ef` |

## Open work

Continue broader Sections I, T, and V coverage and independent Québec terminology review. Sesame
hulled/unhulled and paste boundaries, other spice measurements/substitutions, and the remaining
vinegar family are not complete.
