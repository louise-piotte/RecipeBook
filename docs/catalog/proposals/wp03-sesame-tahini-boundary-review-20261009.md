# WP03 Section I — sesame seed and sesame paste boundary review

- **Review date:** 2026-10-09
- **Owner:** focused WP03 Section I review of sesame seeds, sesame paste, and tahini naming
- **Disposition:** proposal integrated; broader Section I coverage remains open
- **Plan state:** Section I remains open. This packet does not close the category or the wider plan.
- **Scope:** generic, white, and black sesame seeds; hulled/unhulled and toasted wording; tahini/beurre de sésame; sesame paste/butter boundaries; bundled recipe links.

## Recommendation

Keep the current generic `sesame seeds / graines de sésame` identity as the unqualified family-level entry. Add separate identity-only candidates for `white sesame seeds / graines de sésame blanc` and `black sesame seeds / graines de sésame noires`, both in `NUT_SEED_AND_DRIED_FRUIT`. Color is a source-supported seed-coat/product distinction; it is not a synonym for hulledness or toasting. Do not merge either color into the unqualified row as an alias.

Keep the stable `ingredient-ref-tahini` identity as `tahini / beurre de sésame`, category `SAUCE_AND_CONDIMENT`. Preserve the OQLF-supported French terms `tahini`, `tahin`, and `tahina`, and English `tahina`; add `tahini` to `aliasesFr` because OQLF lists it as a preferred French term. Do not add generic `sesame paste`, `pâte de sésame`, or English `sesame butter` as aliases. The last two phrases have wider or processing-specific use, and one Québec producer distinguishes an unhulled-seed butter from that producer's hulled-seed tahini.

Add a non-conversion `toasted` form only for the generic sesame-seed identity and the proposed white-seed identity, where the bundled recipes name it. Keep hull state as ingredient-line wording for now; defer structured `hulled`/`unhulled` forms until the catalog can preserve those states alongside color and toasting without an artificial combination matrix. Do not add a black-sesame paste identity or alias in this tranche: Télé-Québec provides a real Québec recipe name, but not enough product-composition evidence to distinguish a stable black tahini product from other black sesame pastes.

Do not add a default density, unit mapping, package yield, or substitution rule. Health Canada's Nutrient File has a qualified roasted/toasted whole-seed portion observation; retain it as source-scoped evidence only. No general tahini or seed conversion follows from it.

## Granular dispositions

| Candidate or boundary | Disposition | Proposed names and category | Scope, alias, and form decision |
| --- | --- | --- | --- |
| Generic sesame seeds | **Keep current identity** `ingredient-ref-sesame-seeds` | EN `sesame seeds`; fr-CA `graines de sésame`; `NUT_SEED_AND_DRIED_FRUIT` | Keep the unqualified term generic. Remove the current alias `graines de sésame blanches grillées` once the white-seed identity/form is integrated: it is a color-plus-preparation phrase, not a synonym for all sesame seeds. No seed-to-paste or raw-to-processed rule. |
| White sesame seeds | **Accept new identity** `ingredient-ref-white-sesame-seeds` | EN `white sesame seeds`; fr-CA `graines de sésame blanc`; `NUT_SEED_AND_DRIED_FRUIT` | The Québec retailer source uses the French phrase for a specific hulled white product; Bob's Red Mill names a white hulled product. These establish the names, but do not make all white seeds hulled. No aliases beyond the display terms. No hull assumption, density, or substitute. |
| Black sesame seeds | **Accept new identity** `ingredient-ref-black-sesame-seeds` | EN `black sesame seeds`; fr-CA `graines de sésame noires`; `NUT_SEED_AND_DRIED_FRUIT` | Health Canada records black sesame as a whole/minimally processed food ingredient; Télé-Québec uses the French plural in a recipe. Add the exact government wording `graine de sésame noir` as a French alias if the coordinator wants both source variants searchable. Do not alias `black sesame` to the generic seed row. |
| Hulled and unhulled seeds | **Defer structured forms; preserve the words** | English product terms `hulled` / `unhulled`; Québec French product terms `décortiqué` / `non décortiqué` | CFIA, a peer-reviewed processing study, and Québec product usage establish the distinction. It is a processing state, not a separate botanical identity and not synonymous with white/black. No bundled ingredient line currently says hulled/unhulled. The present form link holds one form at a time; defer form IDs until composite color/hull/toast wording can be represented without false equivalences. Do not generate `white × black × hulled × unhulled × toasted` records. |
| Toasted sesame seeds | **Accept a search/display form, with no conversion rule** | EN label `toasted`; fr-CA label `grillé` | Add a `toasted` form under the generic seed and white-seed identities only. Use source-backed match terms `toasted sesame seeds`, `sesame seeds, toasted`, `graines de sésame grillées`, and the line-specific `toasted white sesame seeds` / `graines de sésame blanches grillées` on the white identity. Keep the full original phrase and preparation text. Do not create a raw-to-toasted ratio or infer a mass change. |
| Tahini / beurre de sésame | **Keep and enrich** `ingredient-ref-tahini` | EN `tahini`; fr-CA `beurre de sésame`; `SAUCE_AND_CONDIMENT` | Keep existing `tahin` and `tahina` French aliases and English `tahina`; add French alias `tahini` per OQLF. OQLF defines the paste as ground sesame seeds but does not require one universal seed color, hull state, or roast. Do not create a duplicate legacy ID or relink a nonexistent bundled tahini line. |
| Generic `sesame paste` / `pâte de sésame` | **Do not add as a tahini alias** | No new display name | The phrase can cover different sesame pastes. The East Asian condiment review already leaves Chinese/Japanese sesame-paste crosswalks unresolved. Preserve those distinctions; do not treat every ground sesame product as the same consumer ingredient. |
| `sesame butter` | **Do not add as an English tahini alias** | No alias | OQLF's French `beurre de sésame` is the accepted localized name for tahini. English `sesame butter` is used for more than one seed preparation; the Québec producer below documents an unhulled-seed butter product alongside tahini made from hulled seed. Keep English phrasing out of the alias list pending a clearer global boundary. |
| Black sesame paste / `pâte de sésame noir` | **Defer as an identity or tahini alias** | No new row in this packet | Télé-Québec uses this exact named ingredient, but the recipe does not identify whether it is only ground black seed, includes oil or another ingredient, or uses hulled/roasted seed. Do not map it to generic tahini or the black-seed identity from a single ingredient word. Revisit with a direct product/process source and recipe demand. |
| Sesame oil | **Flag for separate oil review** | Existing `ingredient-ref-toasted-sesame-oil` | Keep oil separate from seed and paste. The current entry is named `toasted sesame oil / huile de sésame` and has the broader English alias `sesame oil`; recipe 105's original text is only `sesame oil`, with a note that the export said `dark sesame oil`. Do not assume every unqualified sesame oil is toasted. Keep both existing recipe references unchanged in this packet and have the coordinator review that alias/recipe pair in the oil workstream. |

## Recipe-link implications

Audited all 114 bundled recipe JSON files and 1,123 `ingredients[]` rows. The five relevant lines occur in four recipes:

| Recipe | Ingredient-line ID | Current text and reference | Proposal |
| --- | --- | --- | --- |
| Korean Soy-Marinated Jammy Eggs (`e0a437cb-da80-4fd5-954d-87caf3b299e7`) | `e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-11` | `1 tbsp toasted white sesame seeds` → `ingredient-ref-sesame-seeds`; preparation EN `toasted white`, FR `blanc grillé` | After adding the white identity, relink to `ingredient-ref-white-sesame-seeds`; preserve original text and preparation; attach its `toasted` form. Do not infer hulledness. |
| Hamburger Buns (`cfa64319-d4b9-4425-b087-3e30be3cc4a0`) | `cfa64319-d4b9-4425-b087-3e30be3cc4a0-ingredient-14` | `Sesame seeds, toasted` → `ingredient-ref-sesame-seeds`; preparation EN `toasted`, FR `grillé` | Keep generic seed reference; attach its `toasted` form and preserve the existing preparation. |
| Sous Vide Tuna (`b699f193-4545-4e7a-98ad-ce092a1e38e4`) | `b699f193-4545-4e7a-98ad-ce092a1e38e4-ingredient-6` | `Sesame seeds` → `ingredient-ref-sesame-seeds` | Keep unchanged as generic seed. |
| Korean Soy-Marinated Jammy Eggs (`e0a437cb-da80-4fd5-954d-87caf3b299e7`) | `e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-10` | `1 tbsp toasted sesame oil` → `ingredient-ref-toasted-sesame-oil` | Keep unchanged; no oil form or measurement work in this packet. |
| Habitant Pea Soup (`e152b749-db75-4a7c-9bbf-3b94f721451d`) | `e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-11` | `1 tbsp sesame oil` → `ingredient-ref-toasted-sesame-oil`; note EN `the export specified dark sesame oil` | Keep unchanged pending the separate oil review. The note is not enough to normalize this line to toasted oil. |

No bundled ingredient line names tahini, sesame paste, sesame butter, black sesame, hulled seed, or unhulled seed. The Québec black-sesame-hummus recipe in source S04 is outside the bundled library, so it proposes no bundled recipe relink.

## Measurement and substitution disposition

Health Canada's Canadian Nutrient File food code 2521 is titled `Seeds, sesame seeds, whole, roasted and toasted` (fr-CA label `Graines, sésame, graines, entières, rôties et grillées`). It reports 15 ml = 9.5 g, 60 ml = 38.0 g, and 100 ml = 63.4 g. Preserve those figures only as observations for that exact CNF food code and preparation. The source does not report packing method, and its record is not an exact observation for the generic seed, black seed, white seed, hulled/unhulled states, or tahini.

Therefore:

- Add no `defaultDensity`, `densityGPerMl`, or ingredient `unitMappings` for sesame seeds or tahini. Do not derive a general `0.634 g/ml` density from one CNF portion table.
- Do not turn the 15 ml observation into a tablespoon mapping unless the unit convention and measure method are separately verified. Do not transfer it to other seed colors or hull states.
- Do not add count weights, package yields, seed-to-paste, hulled-to-unhulled, or raw-to-toasted conversions.
- Add no substitution rule between sesame seed, tahini, sesame oil, sunflower/pumpkin seed, or other nut/seed butter. Similar family labels do not establish an equal amount or equivalent role. This focused packet did not complete the plan's required substitution search; keep substitution research `not_yet_researched` rather than recording that no substitute exists.

At the audit snapshot, the current seed has no sesame/tahini forms, non-null densities, unit mappings, package yields, or active rule entries. The existing ledger marks generic sesame-seed measurement and substitution as not yet researched. Tahini's existing accepted identity decision already says to add no forms or numeric/substitution data; preserve that decision and do not duplicate it.

## Exact audit snapshot and search normalization

Snapshot date: **2026-10-09**. Counts and owners below describe the exact working-tree bytes pinned by the SHA-256 values, not an immutable base-branch snapshot; the shared package changed during this review, so the coordinator must rerun the audit at merge time.

| Source inspected | Count/state | SHA-256 |
| --- | ---: | --- |
| Bundled `ingredient-references.v1.json` | 496 references; 0 non-null `defaultDensity`; 0 unit mappings across the file | `f6429c73a9a0cac9ddbe065f93cf87e418c07ee2ad7666159aba69299ca481dd` |
| Bundled `ingredient-forms.v1.json` | 30 forms; no sesame/tahini form | `9b53e0ca3c6dc4d95b1d14707a495f3d1b3043d0c59400e3a15cd518733683f3` |
| Bundled manifest | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 675 records | `264d0cea09a791f730558ba0bb64c5026514bc92ecce11f3f8b0946c0b4f3e71` |
| Legacy import identities | 99 candidates; one candidate with stable ID `ingredient-ref-tahini` | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| `IngredientSearch.kt` | search implementation used for exact-key audit | `ca41ac04d18fc354c46c9a67798209255e8bc40cb70ca0ee7350a4121ea6b50e` |

The audit used `normalizeIngredientSearchKey`: lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ → oe`, `æ → ae`, `ß → ss`, replace `&` with `and`, remove nonspacing/combining/enclosing marks, replace every non-ASCII-letter/digit run with a space, then trim and collapse whitespace. Candidate keys were checked against all reference names/aliases, form labels/match terms, and all 99 legacy candidates. The app first prefers full normalized word-phrase matches, then falls back to substring matching; exact-key ownership below is distinct from partial search results.

| Audited term | Normalized key | Current exact owner |
| --- | --- | --- |
| `sesame seeds`; `graines de sésame` | `sesame seeds`; `graines de sesame` | `ingredient-ref-sesame-seeds` |
| `graines de sésame blanches grillées` | `graines de sesame blanches grillees` | `ingredient-ref-sesame-seeds` (over-specific current French alias recommended for removal after integration) |
| `tahini`; `tahin`; `tahina`; `beurre de sésame` | `tahini`; `tahin`; `tahina`; `beurre de sesame` | `ingredient-ref-tahini`; `tahini` also appears in the one legacy candidate with the same ID |
| `sesame oil`; `toasted sesame oil`; `huile de sésame` | `sesame oil`; `toasted sesame oil`; `huile de sesame` | `ingredient-ref-toasted-sesame-oil` |
| `white sesame seeds`; `graines de sésame blanc` | `white sesame seeds`; `graines de sesame blanc` | none |
| `black sesame seeds`; `graines de sésame noires`; `graine de sésame noir` | `black sesame seeds`; `graines de sesame noires`; `graine de sesame noir` | none |
| `hulled sesame seeds`; `unhulled sesame seeds`; `graines de sésame décortiquées`; `graines de sésame non décortiquées` | `hulled sesame seeds`; `unhulled sesame seeds`; `graines de sesame decortiquees`; `graines de sesame non decortiquees` | none |
| `sesame paste`; `pâte de sésame`; `black sesame paste`; `pâte de sésame noir`; `sesame butter` | `sesame paste`; `pate de sesame`; `black sesame paste`; `pate de sesame noir`; `sesame butter` | none |

The live `BundledIngredientCatalog.kt` mirror has the same three sesame-related identities and aliases as the JSON seed at this snapshot. The plan's Section I checkboxes for white/black and hulled/unhulled seeds, and for nut/seed butters and pastes, remain open.

## Source-to-claim map and limits

Proposal-local source IDs only; they have not been added to the shared ledger. Accessed 2026-10-09 unless stated otherwise.

| Source ID | Source and locator | Supports | Limit |
| --- | --- | --- | --- |
| **WP03-SES-20261009-S01** | Office québécois de la langue française, [GDT: beurre de sésame](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360025/beurre-de-sesame), definition, preferred terms, English equivalents; updated 2003. | Defines the food as paste made from ground sesame seeds; lists French `beurre de sésame`, `tahini`, `tahin`, `tahina` and English `tahini`, `tahina`. Supports the existing stable identity and proposed `tahini` French alias. | It does not specify seed color, hull state, roast, additives, density, serving conversion, or equivalence to all regional sesame pastes. |
| **WP03-SES-20261009-S02** | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), 6.1.36. | Defines the standardized spice entry `Sesame Seed` as dried hulled *Sesamum indicum* seed. Supports `hulled` as a real processed state. | This is a particular Canadian compositional standard, not a claim that every culinary sesame seed is hulled or that unqualified recipe wording implies a hull state. |
| **WP03-SES-20261009-S03** | Health Canada, [list of non-novel food determinations](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html), 2017-08-30 entry `Graine de sésame noir (Sesamum indicum)`. | Names black sesame as a distinct whole/minimally processed food ingredient and gives a Canadian French name. | A novelty-status determination is not a culinary processing standard, measurement observation, or substitute recommendation. |
| **WP03-SES-20261009-S04** | Télé-Québec, Cuisinez, [Houmous à l’ail noir](https://cuisinez.telequebec.tv/recettes/7796/houmous-a-lail-noir), ingredients for black-garlic hummus and garnish. | Uses both `pâte de sésame noir` and `graines de sésame noires`; supports Québec wording and a real black-paste recipe context. | It does not state the paste's composition, seed hull/roast, or whether the name denotes one stable retail product. It is not in the bundled 114 recipes. |
| **WP03-SES-20261009-S05** | Bob’s Red Mill, [White Sesame Seeds](https://www.bobsredmill.com/product/white-hulled-sesame-seeds), product description. | Manufacturer names a white hulled sesame-seed product, describes grinding it into tahini, and distinguishes toasted seeds/paste. Supports white-seed identity and the separation of seed from paste. | One manufacturer's white hulled product does not mean all white sesame seeds are hulled. Its label serving `3 Tbsp (29 g)` is product-specific and is not a general measure. |
| **WP03-SES-20261009-S06** | Marché Tau, [Graines de sésame blanc décortiqué bio](https://marchestau.com/graines-de-sesame-blanc-bio-kg), product title. | Québec retail usage for `graines de sésame blanc` and `décortiqué`. | One Québec product listing; not an official terminology ruling and not evidence that color implies hull state. |
| **WP03-SES-20261009-S07** | Maturin, [Beurre de graines de sésame naturelles (non décortiquées)](https://www.maturin.ca/produit/ah-tout-cru-dans-le-bec/beurre-de-graines-de-sesame-naturelles-%2528non-decortiquees%2529/6420/), producer product from Ah! Tout cru dans le Bec, Morin-Heights, Québec; compare its listed hulled-seed tahini. | Documents Québec French `non décortiquées` and one producer's distinction between an unhulled-seed butter and tahini made with hulled seeds. | Product-specific terminology and recipe; does not override OQLF's general synonym decision or establish a universal `sesame butter`/tahini distinction. |
| **WP03-SES-20261009-S08** | Akbulut & Çoklar, “Physicochemical and rheological properties of sesame pastes (tahin) processed from hulled and unhulled roasted sesame seeds and their blends at various levels,” *Journal of Food Process Engineering* 31(4), 2008, [FAO AGRIS record](https://agris.fao.org/search/es/records/65df415963b8185d9cabbdb7), abstract. | Compares paste from hulled and unhulled roasted seed; in the study, more unhulled seed raised measured paste viscosity. Supports hull/roast as material product descriptors. | One process study; viscosity results are not density, a kitchen measure, a universal rule, or proof that all tahini is hulled/roasted. |
| **WP03-SES-20261009-S09** | Health Canada, Canadian Nutrient File, [serving portion, food code 2521](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2521), whole roasted/toasted sesame seed. | Source-scoped portion observations: 15 ml = 9.5 g, 60 ml = 38.0 g, 100 ml = 63.4 g; provides English and French item names. | Does not report a packing method or establish a universal density. It must not be generalized to other seed states, colors, products, or tahini. |
| **WP03-SES-20261009-S10** | Zhang et al., [“Genetic Analysis and QTL Mapping of Seed Coat Color in Sesame (*Sesamum indicum* L.)”](https://journals.plos.org/plosone/article?id=10.1371/journal.pone.0063898), *PLOS ONE* 8(5), 2013, abstract and introduction. | Describes natural seed-coat color variation and studies black- and white-seeded accessions; supports that color is an inherent seed trait rather than a synonym for dehulling. | Agronomic/genetic evidence does not define market aliases, Québec culinary wording, or a recipe conversion. |

## Coordinator follow-up

1. At integration time, rerun the exact normalized-key audit across the current package, all forms, the 99-candidate legacy file, the current ledger, the generated Kotlin catalog, and all recipe lines. The shared working tree changed during this review; the pinned counts above are a reproducible audit point, not permission to skip a merge-time check.
2. Promote the existing tahini decision rather than minting an ID. Add only the source-supported `tahini` French alias if desired; preserve the already accepted category and OQLF evidence.
3. If accepting the white identity, relink only the explicit white/toasted sesame line in recipe 066. Keep recipe 072 and recipe 111 attached to generic sesame seeds; review the recipe 105 oil line separately.
4. Keep white/black identities, hull descriptors, and toasting distinct. Do not generate color × hull × roast aliases or identities to simulate a multi-attribute form model.
5. Keep the measurement observation and its exact CNF qualifiers source-scoped. Do not activate a universal value or a substitution rule from this packet.
6. Leave the remaining Section I checklist and independent Québec bilingual review open. This sesame review does not complete Section I.

## Coordinator integration results — 2026-10-09

- Added `ingredient-ref-white-sesame-seeds` and `ingredient-ref-black-sesame-seeds`. Added a
  `toasted` form to generic sesame seeds and a separate toasted form to white sesame. Hull state is
  still line-level wording; color does not imply hulledness.
- Relinked recipe 066's exact `1 tbsp toasted white sesame seeds` line to the white identity and
  white-toasted form. Relinked recipe 072's `Sesame seeds, toasted` line to the generic toasted
  form. Other sesame lines were unchanged.
- Recorded the CNF 2521 whole toasted-seed portions on the generic toasted form and Bob's Red Mill
  3 Tbsp / 29 g label observation on the white-seed identity. Both remain source-scoped; no density,
  unit mapping, conversion, or substitution was added. Substitution research remains open.
- The shared bilingual search normalizer removes an alias identical to the English canonical term.
  `tahini` therefore remains searchable as the canonical English term while the French display is
  `beurre de sésame`; no duplicate `aliasesFr` value is stored. The ledger decision was updated to
  record this normalization behavior.
- Shared catalog, tests, and Pixel verification results are recorded in
  `docs/catalog/batches/reviewed-spice-sesame-vinegar-integration-20261009/README.md`.
