# WP02/WP03/WP04 R166 gap-review integration — 2026-10-16

## Decisions

- **WP02 A6:** Added `arikelu` to the existing kodo millet grain aliases and `arikelu pindi` to
  the existing kodo millet flour aliases. ICAR–IIMR maps Telugu `Arikelu` to Kodo Millet; Organic
  Mandya lists `Arikelu Pindi (Telugu)` for its finely ground single-grain kodo flour. Kept the
  names on their matching identities and the flour's existing study-specific measurement and
  blocked substitution findings unchanged. The source IDs were already allocated; no source entry
  or ingredient identity was added for this decision.
- **WP03 Section F:** Promoted the existing sushi-rice ledger candidate to identity-only
  `sushi rice / riz à sushi`, scoped to plain, uncooked retail rice explicitly marketed for sushi
  preparation. Québec and Canadian retail labels cover both medium-grain Calrose and short-grain
  Koshihikari products, so the row represents a label-defined market category rather than a variety
  or grain-length class. Cooked vinegar-seasoned rice remains outside the identity. Added no aliases,
  forms, numeric behavior, recipe links, or substitutions. Two new source entries document Manitoba
  Health's prepared-rice definition and KitchenAid's bilingual dry-rice cooker program labels.
- **WP04 Section P:** Held generic Matjes herring / `hareng matjes` outside active references, forms,
  legacy mappings, and the research ledger. Current Canadian Matjes-labeled products include
  salt-only, spiced-brine, and tidbit/marinade presentations; one bilingual retailer page conflicts
  on whether its salt-only product is smoked. No bundled recipe selects a product state. The
  proposal's source IDs remain unallocated.

## Static verification

- Bundled seed package validation passed, and the generated Kotlin catalog is current at **1,542
  references**.
- Research-ledger schema validation reported **1,886 records and zero errors**. The two new WP03
  source IDs and URLs are unique, and all accepted decision source links resolve.
- Exact-key ownership and picker projections passed: `arikelu pindi` resolves to kodo flour;
  `arikelu` returns both kodo grain and flour; `sushi rice`, `riz à sushi`, and `sushi` resolve to
  the new label-defined row. Calrose, Koshihikari, short-grain, and medium-grain identities remain
  separate. The kodo flour's two measurement observations and two blocked substitution findings
  remain unchanged.
- The manifest corpus remains **114 recipes / 1,123 ingredient rows**. No candidate wording or
  direct sushi/kodo ingredient links were found.
- UTF-8/no-BOM, escaped Unicode in bundled reference JSON, local links, source ownership, and
  whitespace checks passed.

Final totals are **1,542 references**, **119 forms**, **1,886 ledger records**, **8,050 source
entries**, **6,889 distinct source IDs**, and **5,687 distinct source URLs**; the bundled recipe
corpus remains **114 recipes / 1,123 ingredient rows**.

No app, unit, instrumentation, emulator, deployment, or build tests were run because the active data
changes only add or update database JSON records under the current `AGENTS.md` rule. The generated
catalog index was regenerated from its canonical JSON source.

## Review records

- [WP02 A6 Arikelu / Arikelu Pindi proposal](../../proposals/wp02-a6-next-regional-flour-review-r166-20261016.md)
- [WP03 sushi-rice boundary proposal](../../proposals/wp03-section-f-sushi-rice-boundary-review-r166-20261016.md)
- [WP04 Matjes herring boundary proposal](../../proposals/wp04-section-p-next-preserved-seafood-review-r166-20261016.md)
