# WP03 Section F R503 — CNF 2026 rice row access recheck

Accepted the bounded recheck in the [R503 proposal](../../proposals/wp03-section-f-cnf-2026-cooked-white-long-grain-rice-row-inspection-r503-20261017.md).

Health Canada confirms that CNF 2026 is distributed as relational CSV files while the searchable CNF 2015 remains available as an interim resource. The Open Government listing and direct resource routes were rechecked; the dataset page returned 403, the CSV and ZIP files were inaccessible through the browser, the datastore query was inaccessible, and local retrieval failed at DNS resolution. The repository contains no local copy. These access failures do not establish whether Food Code 4523 exists in CNF 2026 or what its joined measure rows contain.

The cooked-rice Food Code 4523 row-inspection child remains open. Preserve the three CNF 2015 observations on `ingredient-form-rice-cooked` (100 mL = 66.8 g, 125 mL = 83.5 g, and 250 mL = 166.9 g) as edition-specific evidence. No catalog, ledger, recipe, generated-index, or runtime behavior changed.

The review re-audited current ownership, picker results, rice-linked recipe rows, and the manifest-ordered corpus fingerprint; it matched the R482 snapshot at 114 recipes, 1,123 ingredient rows, and 753,988 bytes. UTF-8 and local-link checks passed. No software tests, builds, emulator checks, or deployment were run because this documentation-only recheck changes no database data or application code.
