# R468 — Aceto Balsamico di Modena PGI

Added the protected Modena PGI as an identity-only condiment reference:

- French: `Vinaigre balsamique de Modène IGP`
- English: `Balsamic Vinegar of Modena PGI`
- ID: `ingredient-ref-balsamic-vinegar-of-modena-pgi`
- Sole alias: `Aceto Balsamico di Modena IGP`
- Category: `SAUCE_AND_CONDIMENT`

The European Commission's current single document establishes the PGI name, vinegar identity, and protected Modena/Reggio Emilia production area. Current Canadian product listings support the bilingual market wording. The PGI remains distinct from generic balsamic vinegar and Traditional Balsamic Vinegar of Modena PDO; Reggio Emilia PDO and prepared glazes, reductions, creams, and other balsamic condiments also remain separate. The [R468 proposal](../../proposals/wp06-europe-next-regional-identity-review-r468-20261017.md) records the source register, evidence limits, and pre-integration audit.

The phrase-first picker projection now returns three choices for broad English and French balsamic-vinegar searches. `vinaigre balsamique de Modène` returns the new PGI row alone because the existing PDO name includes `traditionnel`; the qualified Traditional PDO query still returns only that PDO row. No broad aliases were added. The manifest-listed recipe scan found no matching ingredient demand across 114 files and 1,123 ingredient rows.

The row has no forms, density, mappings, or aliases beyond the protected Italian PGI term. The European specification's minimum analytical density thresholds are regulatory limits, not kitchen density values. Bottle capacities and retail package sizes are not recipe measures. No measures, conversions, package yields, recipe links, or substitutions were added.

Static checks passed: bundled seed normalization and validation; generated Kotlin catalog freshness at 1,750 references; six unique R468 source IDs and URLs with valid ledger references; zero matching bundled recipe rows; UTF-8 without BOM and escaped Unicode in the database JSON; local Markdown links; and scoped whitespace checks. No app tests, build, emulator run, or deployment was performed because the change adds database JSON data and documentation under `AGENTS.md`.

Post-integration snapshot: 1,750 ingredient references / 141 forms; 2,109 ledger records / 9,607 source entries / 8,154 distinct source IDs / 6,867 distinct source URLs; 114 recipes / 1,123 ingredient rows. WP06 Europe remains open.
