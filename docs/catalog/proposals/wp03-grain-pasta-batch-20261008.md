# WP03 Section G soba noodles identity proposal

- **Reviewed:** 2026-10-08
- **Status:** partially accepted and integrated on 2026-10-08; source-scoped measurement/substitution findings remain inactive for runtime use.
- **Owner:** WP03 identity research; WP10 integration lead owns canonical IDs and merges.
- **Scope owned:** one open Section G noodle candidate, Japanese soba noodles.
- **Deferred:** udon, somen, hiyamugi, generic wheat noodles, rice noodles/rice sticks/flat rice
  noodles, generic glass noodles, egg noodles, shirataki/konjac noodles, yakisoba, other pasta
  composition/state distinctions, and every other open grain product. This packet does not close
  Section F or the broader Section G checklist.
- **Repository state inspected at proposal time:** the plan marks the Section G noodle sweep open and names soba,
  udon, and somen among the remaining products. The canonical seed then had 395 ingredient
  references and the ledger had 560 records. Neither contained a soba reference/candidate. The
  existing pasta identity and Asian-noodle packets already keep generic noodles, broad rice noodles,
  rice sticks, and glass noodles outside accepted references.

## Proposed identity

| Proposed ID | English display | fr-CA display | English aliases | fr-CA aliases | Category | Boundary |
| --- | --- | --- | --- | --- | --- | --- |
| `ingredient-ref-soba-noodles` | soba noodles | nouilles de sarrasin | `soba` | `soba` | `GRAIN_AND_CEREAL` | Japanese buckwheat noodle product. Buckwheat is the defining grain, but wheat flour, other binders, and eggs may be included; this is not a 100%-buckwheat or gluten-free claim. |

The Office québécois de la langue française (OQLF) places the entry in food/pasta, defines it as
Japanese buckwheat noodles, gives `soba noodles` as the English term, and lists the proposed French
display and aliases as preferred terms. The Ministry of Agriculture, Forestry and Fisheries of Japan
(MAFF) describes soba as buckwheat flour with water and possible binders such as wheat flour or eggs.
That source supports keeping the identity while avoiding a universal composition assertion.

Use the existing `GRAIN_AND_CEREAL` category. This is the project’s established category for pasta,
rice vermicelli, and wheat ramen; MAFF also places buckwheat among cereals and soba among cereal
products. The category does not claim that soba is made only from buckwheat.

Only activate the short English alias `soba` because the OQLF identifies it as the Québec French term
and the USDA Agricultural Research Service (ARS) uses `soba` in an English recipe. Omit the wider
OQLF phrases `pâtes au blé et au sarrasin naturels` and `pâtes au blé et au sarrasin`: they can
describe wheat-and-buckwheat pasta beyond this Japanese product identity. Omit `buckwheat`, `buckwheat
noodles`, unqualified `noodles`/`nouilles`, and `yakisoba`; the sources reviewed here do not establish
these as unambiguous aliases for this row. Do not alias the grain or flour references to this noodle.

## Form and measurement findings

OQLF says soba is available fresh or dried. MAFF also describes boiled, frozen, dried, and instant
products. If the integration needs searchable preparation forms, keep dry, fresh, and cooked/boiled
distinct under the one soba identity; do not make separate aliases or identities for each state.
Frozen and instant products are deferred unless bundled recipe use shows they need dedicated
representation. No cooking yield or dry-to-cooked conversion is implied.

- **Density:** researched; no supported generic soba bulk density or mass-per-volume conversion was
  found. Keep `defaultDensity` and all form densities unset.
- **Supported portion observation:** USDA ARS Standard Reference Release 27 (2014), NDB 20115,
  records cooked Japanese soba as 1 cup = 114 g. This is a source-specific published portion weight
  for cooked soba, not a bulk density and not a value for dry or fresh soba. The project’s `cup` is
  the US customary 236.5882 mL cup, but the source does not specify its cup-volume convention or a
  packing/draining method. If the integration elects to record it, store only a `portion_weight`
  observation attached to a cooked soba form, preserve the 2014 source date, and do not map it to the
  app’s `cup` conversion until that measure basis is confirmed. It is not a universal mass-volume
  conversion and should not silently become an active runtime converter.
- **Dry measurement:** USDA ARS lists the dry record as 2 oz = 57 g. This is a mass-to-mass serving
  equivalence, not a volume measure or soba-specific conversion factor, so it adds no ingredient
  measurement beyond the existing ounce-to-gram unit conversion.
- **Food composition is not density:** Japan’s MEXT Food Composition Database distinguishes dry and
  boiled soba entries. Its dry sample is wheat flour 65% and buckwheat flour 35%, with nutrients
  stated per 100 g edible portion. This specific sample contains substantial wheat; it does not
  establish density, a household volume measure, or composition for every soba product.

## Substitution findings

USDA ARS’s buckwheat-maltagliati recipe says dried buckwheat pasta such as soba is an excellent
substitute for its fresh, handmade buckwheat maltagliati when short on time, and directs readers to
follow the package cooking instructions. This supports a **recipe-scoped, one-way** substitution for
that fresh buckwheat-pasta context. It does not support soba as a generic replacement for pasta,
ramen, udon, rice noodles, or mung-bean noodles. The source’s target is not a current canonical
reference, so do not activate a catalog substitution rule. Preserve the finding for reconsideration
if a source-backed fresh buckwheat pasta target is added. No other supported soba substitution was
found in this review; no substitute should be invented from shared grain or noodle category.

Recommended evidence states for a future ledger entry:

- Identity: `verified` after independent Québec terminology review and acceptance of the conservative
  alias set.
- Measurement: `researched_supported` only for the source-limited cooked portion observation, with
  density explicitly unavailable; otherwise do not populate a density or unit mapping. If the
  ledger cannot express these separately, retain the observation and limitation in the packet until
  the measurement contract can distinguish them.
- Substitution: preserve the ARS example as a contextual supported finding with the recipe scope and
  source limitation above, but leave the active rule list empty because its target identity is not
  represented.

## Exact key and bundled recipe audits

Audited current `ingredient-references.v1.json` using the app’s search-key rules (lowercase, NFKD,
accent/ligature folding, punctuation-to-space, and whitespace collapse). None of the proposed keys
`soba noodles`, `nouilles de sarrasin`, `soba`, `nouilles de sarrasin et de blé`, or `nouilles au
sarrasin` has an exact normalized owner in the 395-reference seed; none collide with one another.
No matching legacy-import candidate or soba ledger record was found. The proposed ID is also absent.

Scanned every `ingredients[]` row in all 114 bundled recipe JSON files across `originalText`,
`ingredientName`, and `ingredientRefId`. No row contains `soba`, `sarrasin`, or `buckwheat noodles`;
the same terms do not appear elsewhere in the bundled recipe JSON. No recipe relink is proposed.

## Sources and source-to-claim map

All sources were accessed 2026-10-08.

- **WP03-S201 — OQLF, [nouilles de sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037421/nouilles-de-sarrasin):** direct Québec French and English term pair; food/pasta domain; preferred French terms (`nouilles de sarrasin`, `nouilles de sarrasin et de blé`, `nouilles au sarrasin`, and `soba`); Japanese buckwheat-noodle definition; fresh/dry availability; note that buckwheat-and-wheat noodles are common in Japan. It is the primary source for the accepted display names and aliases.
- **WP03-S202 — Japan MAFF, [Grain products — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kokurui.html):** classifies buckwheat as a cereal and soba among grain products; describes buckwheat flour, water, and optional binding agents such as flour and eggs; documents named product styles and fresh, boiled, frozen, dried, and instant forms. It supports the identity boundary and cautions against a universal composition or state conversion.
- **WP03-S203 — Japan MEXT, [Food Composition Database, dried soba noodles, uncooked (food 01129)](https://fooddb.mext.go.jp/details/foodInfo.pl?ITEM_NO=1_01129_7&VIEW_POPUP=1):** identifies a dry soba product and records the underlying sample ratio as 65% wheat flour and 35% buckwheat flour, with values per 100 g edible portion. It does not supply volume/density evidence.
- **WP03-S204 — USDA ARS, [National Nutrient Database for Standard Reference, Release 27, Food Group 20](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR27/reports/sr27fg20.pdf):** NDB 20115 gives cooked Japanese soba as 1 cup = 114 g; NDB 20114 gives dry soba as 2 oz = 57 g. Use only the cooked cup amount as a source-specific portion-weight observation, not as a density. Release 27 is dated 2014.
- **WP03-S205 — USDA ARS, [Buckwheat Maltagliati with Miso Mushroom, Gigante Bean Ragu & Dulse](https://www.ars.usda.gov/ARSUserFiles/oc/AgLab/recipes/buckwheat/BuckwheatMaltagliatiBeanRagu.pdf):** recipe note explicitly recommends dried buckwheat pasta such as soba as a substitute for fresh buckwheat maltagliati and says to follow package directions. It supports only that scoped substitution context.

## Recommended acceptance checks

- [x] Keep the proposed identity separate from generic pasta, buckwheat grain/flour, ramen, udon,
  somen, and starch-defined Asian noodles.
- [x] Retain only source-supported bilingual names and `soba` as the EN/fr-CA alias; the exact
  normalized collision audit passed.
- [x] Add no preparation forms, form conversions, or cooking yield because no bundled recipe needs
  those distinctions.
- [x] Record USDA’s cooked cup observation as 114 g only for cooked soba as a dated,
  source-limited portion weight; add no density or dry/fresh volume mapping.
- [x] Keep the ARS replacement as a contextual research finding; activate no substitution rule until
  the recipe-specific target identity and runtime scope are representable.
- [x] Repeat the exact-key audit and ingredient-line audit against the merge-time canonical package;
  preserve all current recipes and existing catalog rows.
- [ ] Obtain independent Québec French terminology review before marking the identity accepted.

**Coordinator acceptance:** partial. The identity, alias, source-specific portion observation, and
blocked substitution finding were integrated into the 409-reference package and 574-record ledger.
Package validation, generated-index freshness, ledger schema, exact-key/recipe audit, 9 Python tests,
275 Android unit tests, lint, and both APK assemblies passed. Pixel 9a / API 36 searches returned
`soba noodles` in English and `nouilles de sarrasin` in fr-CA; connected instrumentation reported 29
cases (27 passed, 2 QA-only skips, 0 failures) using a temporary user-data image. The original AVD
data was preserved. Independent Québec review remains open; see
[`../batches/wp03-soba-identity.md`](../batches/wp03-soba-identity.md).
