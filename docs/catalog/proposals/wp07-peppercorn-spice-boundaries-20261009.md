# WP07 peppercorn and peppercorn-like spice boundaries — 2026-10-09

**Status:** proposal integrated. This packet covers the first bullet under Section T of the global
ingredient catalog plan. Section T remains open; this does not complete the spice section. The
snapshot below records the original review state; the coordinator integration results are appended.

## Recommendation

Retain the current black-pepper identity and accept eight additional, narrowly named ingredient
references: white pepper, green peppercorns, pink pepper, Sichuan pepper, Indian long pepper,
Javanese long pepper, grains of paradise, and cubeb. Put all of them in the existing
BAKING_AND_SPICE category. Keep the color-qualified Piper nigrum products distinct as searchable
recipe identities because the live black-pepper reference is product-specific, not a neutral
Piper nigrum parent. Their shared botanical source does not establish interchangeability.

Do not add IngredientForm records, densities, unit mappings, conversion rules, substitutions,
package yields, or recipe links from this review. Whole, cracked, and ground wording can remain
line-level preparation text. A later product-specific review can add a form only if the app needs
that distinction for supported measurement or conversion behavior.

## Proposed reference decisions

### Retain the existing black-pepper reference

- ID: ingredient-ref-black-pepper
- Display: black pepper / poivre noir
- Live aliases: ground black pepper, ground pepper, pepper / poivre, poivre du moulin
- Proposed specific additions: black peppercorn, black peppercorns / poivre noir en grains
- Category: BAKING_AND_SPICE

Keep the current broad pepper and poivre aliases attached only to this existing reference. The
recipe audit below shows that three unqualified ingredient strings already resolve to it; do not
reuse these aliases for any new product.

### Add eight identities

All rows below use category BAKING_AND_SPICE. Aliases are limited to the names listed here; deferred
terms in the boundary notes are not proposed aliases.

| Proposed ID | English display; source-backed aliases | fr-CA display; source-backed aliases | Scope |
|---|---|---|---|
| ingredient-ref-white-pepper | white pepper; white peppercorn, white peppercorns | poivre blanc; poivre blanc en grains | Piper nigrum product, kept separate from black pepper. |
| ingredient-ref-green-peppercorns | green peppercorns; green peppercorn | poivre vert en grains; poivre vert | Piper nigrum product. French wording is descriptive; no dedicated OQLF green-peppercorn entry surfaced in the targeted search. |
| ingredient-ref-pink-pepper | pink pepper; pink peppercorn, pink peppercorns | poivre rose; poivre d’Amérique | Culinary product from Schinus species; do not encode one species as universal. |
| ingredient-ref-sichuan-pepper | Sichuan pepper; Szechuan pepper, Sichuan peppercorn, Sichuan peppercorns, ground Szechuan pepper | poivre du Sichuan; poivre de Sichuan, clavalier, fagara, poivre-fleur | Zanthoxylum spice; keep it distinct from Piper pepper and from Capsicum peppers. |
| ingredient-ref-indian-long-pepper | Indian long pepper | poivre long indien | Piper longum. The French display is a disambiguating descriptive label based on the source term poivre long. |
| ingredient-ref-javanese-long-pepper | Javanese long pepper | poivre long de Java | Piper retrofractum; separate from Indian long pepper. |
| ingredient-ref-grains-of-paradise | grains of paradise; melegueta pepper, Guinea grains | maniguette; graine de paradis, graines de paradis, graines de Guinée | Aframomum melegueta; not grains of Selim. |
| ingredient-ref-cubeb | cubeb; cubeb pepper, tailed pepper | cubèbe; poivre cubèbe, poivre à queue | Piper cubeba; keep separate from black pepper and both long peppers. |

The Health Canada crop-group list independently distinguishes black, white, and green Piper
nigrum products; Indian and Javanese long peppers; Sichuan pepper; and grains of paradise by
botanical source [S01]. Kew describes black, white, and green pepper as differently harvested or
processed Piper nigrum fruit, while identifying pink pepper and Sichuan pepper as products from
other genera [S02]. OQLF names poivre rose and notes that it may come from either Schinus molle or
Schinus terebinthifolia [S04]. A single pink-pepper reference therefore represents the culinary
name without asserting a single species.

OQLF supplies poivre du Sichuan, poivre de Sichuan, clavalier, fagara, and poivre-fleur, and
explicitly separates this product from Piper pepper [S05]. Health Canada uses the spelling
Szechuan in a recipe; that supports a spelling alias only, not a measurement or conversion [S06].
The generic English terms Chinese pepper and anise pepper also appear in the OQLF entry, but are
deferred because they are less specific than Sichuan pepper.

PROSEA and Health Canada distinguish Piper longum (Indian long pepper) from Piper retrofractum
(Javanese long pepper), with separate French names [S01, S07]. Do not activate bare long pepper or
poivre long as aliases: both species share the English wording, and TERMIUM also records poivre
long against a Capsicum variety [S08]. Do not add Java pepper or poivre de Java; sources use these
names for cubeb as well as for products associated with Java [S09, S13].

TERMIUM Plus standardizes grains of paradise and maniguette, records graine de paradis and related
French terms, and says its term covers whole or ground spice [S10]. Health Canada and Kew identify
the species as Aframomum melegueta [S01, S11]. Do not alias grains of Selim, a separately listed
Xylopia aethiopica spice [S01]. Kew also lists Guinea pepper as a common name, but this proposal
uses the more specific TERMIUM terms Guinea grains and melegueta pepper [S10, S11]. OQLF records
cubèbe for Piper cubeba, while PROSEA gives the spice names cubeb, poivre cubèbe, and poivre à
queue [S09, S12].

## Identity, form, and data limits

- Do not merge pink pepper, Sichuan pepper, either long pepper, grains of paradise, or cubeb into
  black pepper merely because their names contain pepper or their fruits are used as spices.
- Do not use unqualified poivre en grains as an alias. OQLF defines it as a whole dried berry of
  the pepper plant and notes that pink peppercorns are not true Piper nigrum peppercorns [S03].
- Do not alias green pepper to green peppercorns; green pepper is also used for Capsicum vegetables
  [S01]. Keep the product-specific word peppercorn in the English name and grains / en grains in
  French.
- Do not assign a universal Schinus species to pink pepper, a single Zanthoxylum species to all
  Sichuan pepper, or an unqualified long-pepper alias to either Piper longum or Piper retrofractum.
- The candidate rows are identity proposals only. No measurement or substitution research was
  performed. Leave density and unit mappings empty and ledger measurement and substitution states
  at not_yet_researched. Do not infer a ratio among these spices.

## Live package audit

The canonical split seed package and its manifest-listed recipes were read directly from the
shared worktree on 2026-10-09. These are exact file-byte hashes for that audit snapshot, not counts
copied from an older proposal or workflow note.

| Artifact | Snapshot count | Bytes | SHA-256 |
|---|---:|---:|---|
| app/src/main/assets/seed/bundled-library/manifest.v1.json | 114 recipe paths | 12,011 | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 496 references | 156,216 | f6429c73a9a0cac9ddbe065f93cf87e418c07ee2ad7666159aba69299ca481dd |
| app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 30 forms | 20,639 | 9b53e0ca3c6dc4d95b1d14707a495f3d1b3043d0c59400e3a15cd518733683f3 |
| app/src/main/assets/seed/bundled-library/substitution-rules.v1.json | 0 rules | 3 | 37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570 |
| app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json | 0 rules | 3 | 37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570 |
| docs/catalog/research-ledger.v1.json | 675 records | 1,177,748 | 264d0cea09a791f730558ba0bb64c5026514bc92ecce11f3f8b0946c0b4f3e71 |
| docs/catalog/legacy-import-identities.v1.json | 99 candidates | 23,450 | 63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b |
| Manifest-listed recipe JSON files | 114 files; 1,123 ingredient rows | 749,713 aggregate bytes | e80d97c204558cb88e7a773c04b59742c116f595f10970c6785d25714a7e5397 |

The recipe aggregate hash appends, in manifest order, each recipe’s relative path, a NUL byte,
the lowercase SHA-256 digest of that recipe file, and a newline, then hashes the resulting bytes.

The current active catalog contains only one reference for the planned peppercorn and peppercorn-like
products: ingredient-ref-black-pepper, with display names black pepper / poivre noir, category
BAKING_AND_SPICE, null default density, and an empty unitMappings array. Its live aliases are listed
above. There is no black-pepper form and no form for any other candidate in this packet. The
catalog also has cayenne pepper / poivre de cayenne in BAKING_AND_SPICE and separate jalapeno,
serrano, ají amarillo, ají panca, and rocoto pepper references in VEGETABLE_AND_AROMATIC; those
Capsicum products are outside this boundary. Some already modeled Capsicum ingredient forms are
also outside scope.

No proposed reference ID is present in the snapshot. A normalized exact-key scan compared the
proposed display and alias phrases against active reference names and aliases, form labels and
match terms, and legacy candidate names and aliases. The 44 proposed/current-specific phrases
produce 44 normalized keys and zero exact collisions. The current legacy candidate file contains
no peppercorn, Sichuan, long-pepper, grains-of-paradise, or cubeb candidate.

### Ingredient-line audit

The audit parsed all 114 manifest-listed recipe JSON files and inspected each ingredient line’s
originalText, ingredientName, preparation, notes, and ingredientRefId. It found 21 black-pepper
lines in 20 recipes. No line mentioned white pepper, green peppercorns, pink pepper, Sichuan
pepper, either long pepper, grains of paradise, or cubeb. Ingredient positions below are one-based
array indices, not physical JSON line numbers.

| Manifest slot and English title | Ingredient position | Exact live originalText | Current reference |
|---|---:|---|---|
| 015 — Beef Stroganov | 5 | black pepper to taste | ingredient-ref-black-pepper |
| 018 — Turkey Meatballs | 9 | 1 tsp ground black pepper | ingredient-ref-black-pepper |
| 019 — Crab Balls | 11 | 1/8 tsp black pepper | ingredient-ref-black-pepper |
| 023 — Air Fried Calamari | 3 | 1/2 tsp black pepper | ingredient-ref-black-pepper |
| 027 — Breakfast Casserole | 9 | 1/4 tsp black pepper | ingredient-ref-black-pepper |
| 037 — Cream of Mushroom Soup | 11 | black pepper to taste | ingredient-ref-black-pepper |
| 042 — Pork Rub | 7 | 2 tsp black pepper | ingredient-ref-black-pepper |
| 048 — Garam Masala | 4 | 1 1/2 tsp black pepper | ingredient-ref-black-pepper |
| 074 — Meatloaf | 11 | Salt and black pepper, to taste | no ID |
| 078 — Shepherd’s Pie | 8 | 1/2 tsp black pepper | ingredient-ref-black-pepper |
| 078 — Shepherd’s Pie | 21 | 1/4 tsp black pepper | ingredient-ref-black-pepper |
| 082 — Sous Vide Pulled Pork | 5 | 1 tbsp freshly ground black pepper | ingredient-ref-black-pepper |
| 083 — Curry Powder | 4 | 1/2 tsp ground black pepper | ingredient-ref-black-pepper |
| 085 — Maple Chicken | 2 | black pepper | ingredient-ref-black-pepper |
| 087 — Chicken Parmesan | 9 | 1/2 tsp black pepper | ingredient-ref-black-pepper |
| 090 — African Peanut Stew | 7 | 1/2 tsp black pepper | ingredient-ref-black-pepper |
| 096 — Pizza Sauce | 10 | Ground pepper, to taste | ingredient-ref-black-pepper |
| 097 — Alfredo Sauce | 6 | Pepper, to taste | ingredient-ref-black-pepper |
| 101 — Big Mac Sauce | 9 | Salt and pepper, to taste | ingredient-ref-black-pepper |
| 105 — Habitant Pea Soup | 9 | Freshly ground black pepper, to taste | ingredient-ref-black-pepper |
| 111 — Sous Vide Tuna | 3 | Freshly ground black pepper | ingredient-ref-black-pepper |

Three live recipe strings use unqualified pepper wording and already point to black pepper. The
combined Meatloaf line has no reference ID. No new reference should be linked to any current recipe
line on this evidence.

## Audit method and limits

- Seed JSON was parsed from the current manifest, reference, form, substitution, and contextual
  substitution files. The manifest-listed recipe files, rather than the exported RecipeKeeper
  archive, were used as recipe source of truth.
- Catalog searches inspected reference IDs, English/French names and aliases, form IDs, labels and
  match terms, plus evidence-ledger and legacy-candidate records. Exact alias collisions used the
  same normalization policy as tools/seed_package/bundled_seed_package.py: Unicode NFKD and
  case-folding, œ/æ/ß folding, combining-mark removal, punctuation-to-space conversion, and
  whitespace collapse.
- Ingredient lines were searched for black/white/green/pink pepper, peppercorns, Sichuan/Szechuan,
  long pepper, paradise, melegueta, cubeb, and their French forms. The scan does not claim that
  generic uses in instruction prose are ingredient identities.
- Botanical authorities establish plant identity and accepted names; they do not establish a
  recipe conversion. OQLF and TERMIUM support terminology, not measurements. The Health Canada
  crop-group list is regulatory commodity naming, not a complete culinary taxonomy. PROSEA supports
  regional spice names but does not resolve every market use of unqualified pepper.
- Targeted OQLF searches returned entries for black pepper, white pepper, peppercorn, pink pepper,
  and Sichuan pepper. Searches for green peppercorn and long pepper did not surface a dedicated
  OQLF entry; these proposed French labels are explicitly descriptive or disambiguating. This
  bounded search result is not proof that no related terminology exists.
- No measurement, density, ingredient conversion, or substitution research was done. The package’s
  recipe quantities for black pepper are not density observations.

## Coordinator integration tasks

1. Review this disposition before editing shared seed data. Add the eight proposed references with
   stable IDs, BAKING_AND_SPICE, the displayed names and bounded aliases above; keep all numeric
   fields empty. Retain the current black-pepper ID and aliases.
2. Add evidence-ledger records for the reviewed black-pepper identity and eight new references,
   recording identity evidence and source limits. Set measurement and substitution research states
   to not_yet_researched; add no measurements, forms, or rules.
3. Run the existing exact alias-collision review and seed normalization after integration. Do not
   relink current black-pepper recipe lines or the combined Meatloaf line as part of this proposal.
4. Update the Section T checklist only for this first bullet if integration is accepted. Keep all
   remaining Section T work open.

## Coordinator integration results — 2026-10-09

- Added the eight proposed spice identities and retained `ingredient-ref-black-pepper`; the exact
  reference-key collision audit was clean after canonicalization. The new identities have no forms,
  default densities, unit mappings, conversions, substitutions, or recipe links.
- Coordinator review added six Health Canada CNF 198 portions to the existing black-pepper ledger
  record: three ground and three whole. Each observation cites the CNF source only; no default
  density or unit mapping was created. Measurement research for the eight new identities and
  substitution research for all nine remain open.
- No bundled recipe line was relinked. The existing black-pepper lines and unlinked combined
  meatloaf line retain their prior state.
- Shared catalog, tests, and Pixel verification results are recorded in
  `docs/catalog/batches/reviewed-spice-sesame-vinegar-integration-20261009/README.md`.

## Sources

All sources were accessed 2026-10-09. Links support only the claims and limits noted here.

| ID | Source | Use and limit |
|---|---|---|
| S01 | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html) | Lists black, white, and green Piper nigrum products; Indian and Javanese long pepper species; Sichuan pepper as Zanthoxylum spp.; grains of paradise as Aframomum melegueta; and separately lists grains of Selim. Regulatory commodity names, not a complete culinary taxonomy. |
| S02 | Kew Science, [Piper nigrum species profile](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:682369-1/general-information) | Describes black, white, and green Piper nigrum fruit as differently harvested or processed; separates pink pepper and Sichuan pepper botanically. |
| S03 | OQLF, [poivre noir](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095296/poivre-noir), [poivre blanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095302/poivre-blanc), and [poivre en grains](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532960/poivre-en-grains) | Preferred Québec French terms, Piper nigrum relationship, and the generic whole dried peppercorn term. The generic term is not proposed as a color-specific alias. |
| S04 | OQLF, [poivre rose](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17017486/poivre-rose) | Preferred French terms poivre rose and poivre d’Amérique; notes both Schinus molle and S. terebinthifolia. |
| S05 | OQLF, [poivre du Sichuan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351908/poivre-du-sichuan) | Preferred French forms, English terms, and the distinction from Piper pepper. Its definition names Zanthoxylum piperitum; the wider catalog label remains genus-level because other sources list Zanthoxylum species. |
| S06 | Health Canada, [7 homemade seasoning mixes](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/7-homemade-seasoning-mixes.html) | Uses ground Szechuan pepper in a recipe. Supports that spelling only; the recipe quantity was not used as measurement evidence. |
| S07 | Kew Science, [Piper longum](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:682031-1/general-information) | Accepted Piper longum name and common-name evidence, including long pepper and poivre long. |
| S08 | Kew Science, [Piper retrofractum](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:683079-1/general-information); TERMIUM Plus, [poivre de Cayenne record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=1&lang=fra&srchtxt=poivre+de+Cayenne) | Kew supports the accepted Javanese long-pepper species; TERMIUM shows why bare poivre long can collide with a Capsicum long variety. |
| S09 | PROSEA, [spices and pepper species](https://prosea.prota4u.org/view.aspx?id=590) | Separates Piper cubeba, P. longum, and P. retrofractum and gives their English/French spice names. Does not make generic Java pepper unambiguous. |
| S10 | TERMIUM Plus, [grains of paradise](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=esr&lang=eng&srchtxt=PARAISO) | Standardized English grains of paradise and French maniguette; lists graine de paradis and other terms and covers whole or ground spice. |
| S11 | Kew Science, [Aframomum melegueta](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:871877-1/general-information) | Accepted species and Zingiberaceae classification; common-name evidence includes grains of paradise. |
| S12 | OQLF, [cubèbe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3497942/cubebe); PROSEA [S09] | OQLF entry ties cubèbe to Piper cubeba; PROSEA supports cubeb, poivre cubèbe, poivre à queue, and the species distinction. |
| S13 | European and Mediterranean Plant Protection Organization, [Piper cubeba](https://gd.eppo.int/taxon/PIPCU) | Lists cubèbe, poivre à queue, and poivre de Java as French common names for Piper cubeba. The Java wording is therefore excluded from the aliases for Javanese long pepper. |
