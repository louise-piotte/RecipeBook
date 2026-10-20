# WP03 red rice identity

- **Reviewed:** 2026-10-07
- **Status:** edible-food identity integrated; independent Québec French review remains open.
- **Scope:** edible red-bran rice as a food identity. This entry does not classify agricultural weeds or regional/cultivar-specific products.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-red-rice` | red rice | riz rouge | None | `GRAIN_AND_CEREAL` | Edible red-bran rice product. Exclude weedy/agronomic red rice, red-rice vinegar, red yeast rice, and named regional or cultivar products. Brown remains an overlapping milling axis. |

The federal bilingual food specification gives separate `Red Rice / Riz rouge` entries and describes a generally unhulled or partially hulled grain with red bran that colors the cooked dish. USDA's rice glossary defines red rice by appreciable red bran. These direct food sources support the identity. The CFIA survey's `Riz – Autre` grouping is an analytical bucket for black, red, and unspecified rice; it does not negate the separately named food product.

Agricultural literature also uses `red rice` for weedy rice. That meaning is excluded from this food identity. Do not treat a recipe's agronomic discussion, red-rice vinegar, red yeast rice, or named regional/cultivar product as a match to the unqualified catalog row. Red is a color axis and brown is a milling axis, so the identities may overlap; do not create a color × milling × grain-length matrix.

No aliases, forms, density, unit mappings, measurements, yields, conversions, or substitutions were added.

## Recipe and collision audit

Before integration, the canonical seed had 362 references and no exact normalized display key for `red rice` or `riz rouge`. The 114 bundled recipes had no red-rice ingredient wording. No recipe line was changed or relinked. The accepted identity has empty aliases, so it does not capture the separate weedy, vinegar, yeast-rice, cultivar, or regional-product meanings.

## Sources

- **WP03-S128 — Government of Canada, [Food Quality Specifications — Rice (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf):** Table 2 has a separate edible `Red Rice` entry describing a generally unhulled or partially hulled red-bran grain whose color can leach into the cooked dish.
- **WP03-S129 — Government of Canada, [Spécifications sur la qualité des aliments — Riz (français)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf):** Tableau 2 provides the corresponding `Riz rouge` food entry and description. Federal bilingual wording supports the display; independent Québec synonym review remains open.
- **WP03-S131 — USDA Agricultural Marketing Service, [Rice Terms](https://www.ams.usda.gov/market-news/livestock-poultry-and-grain-rice-beans-and-lentil-terms):** defines red rice as whole or large broken kernels with appreciable red bran.
- **WP03-S132 — CFIA, [Enquête sur la qualité des aliments au Canada — Riz](https://publications.gc.ca/collections/collection_2024/acia-cfia/A104-626-2011-fra.pdf):** groups black, red, and unspecified rice under the survey bucket *Riz – Autre*; not treated as an identity crosswalk.
- **WP03-S133 — Australian Government, [BICON rice appendix](https://bicon.agriculture.gov.au/BiconWeb4.0/ViewElement/Element/Index?caseElementPk=393553&elementPk=109448):** historical 2015–2019 boundary evidence distinguishes edible red rice from a weedy-red-rice interpretation; not current policy.
- **WP03-S148 — Craig et al., PLOS ONE, [Allele Distributions at Hybrid Incompatibility Loci Facilitate the Potential for Gene Flow between Cultivated and Weedy Rice in the US](https://journals.plos.org/plosone/article?id=10.1371/journal.pone.0086647):** describes weedy rice as also known as weedy or red rice; used to exclude agricultural weed usage from food matching.

## Verification record

Verified 2026-10-07 on Pixel 9a / Android 16 API 36 (1080×2424). The English picker returned exactly one `red rice` result; the fr-CA picker returned exactly one `riz rouge` result. Screenshots:

- `pixel9a-red-rice-picker-en.png` — SHA-256 `72cd4c9ddaa248a745f06414233ae7e23c7c6b1d455def9e4df99f32505031c5`
- `pixel9a-red-rice-picker-fr-ca.png` — SHA-256 `b3999af87c05965819d7b7205fa0ac5344ee5a0a4dcafa05741130a596f94d53`

The deploy script passed all 260 Android unit tests, assembled and launched the debug APK, and the APK SHA-256 is `59291af4bf418c102596c57dbd404bc541e04a58394ef8310a01b30bcbe5b04e`. Connected Android instrumentation ran 29 cases: 27 passed, 2 environment-gated skips, 0 failures. The 9 Python seed-package tests passed. Seed/package normalization and validation, ingredient-reference normalization, generated-index freshness, ledger validation (529 records, 0 errors), UTF-8/no-BOM and mojibake checks, and `git diff --check` passed.

Final artifact hashes:

- Seed ingredient references: `7e153f621059d3193eb090f8d07d29882e96cce6b954f6092d2e58d63fc97243`
- Generated Kotlin catalog: `fb65246797425057cf63df16a4e11d15338dc6089f31bf28d26317e294e55465`
- Research ledger: `de8074f7309d14728e1745e2ca7bb6bc2a4845fd67030463375e72de8070c37c`

Verification used a temporary Pixel 9a data image. The retained AVD was restarted afterward; its original `userdata-qemu.img` remains 6,356,992 bytes with the prior 2026-03-06 3:07:06 PM timestamp, and the app remains uninstalled there. The unsaved QA draft was discarded, and the temporary image was removed.
