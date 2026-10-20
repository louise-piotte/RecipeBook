# African Peanut Stew peanut-component link reconciliation — 2026-10-12

Reconciled the live recipe data with the accepted follow-up in the [WP03 Sections H–I integration](../wp03-section-h-i-pulses-nuts-gap-integration-20261011/README.md).

Recipe 090#17 now links `ingredient-ref-peanuts`, matching the follow-up's decision to link only the peanut component. Its combined original wording, `ingredientName`, optional flag, and bilingual fresh-cilantro note remain unchanged. The linked ingredient is peanuts; cilantro remains in the source wording and notes without a separate ingredient link.

Cotter Crunch's [African peanut stew recipe](https://www.cottercrunch.com/crock-pot-west-african-peanut-stew/) lists dry-roasted peanuts and fresh cilantro as separate garnish components. The package change adds no identity, form, quantity, preparation, measurement, conversion, or substitution.

This repairs a missed JSON link from the accepted H/I integration. The earlier [exact-match pass](../exact-recipe-reference-links-20261010/README.md) recorded the row as unlinked at that time; its status is now superseded by the later component-level review and this reconciliation.

## Validation snapshot

- The manifest contains 114 recipes and 1,123 ingredient rows. Unlinked ingredient rows decreased from 28 to 27; recipe 090#17 now points to an existing peanut reference.
- Seed-package validation passed, as did reference normalization check, generated Kotlin catalog freshness check, and research-ledger schema validation (1,526 records, zero errors).
- The changed recipe JSON is valid UTF-8 without a BOM. The manifest-ordered recipe corpus is 752,993 bytes with digest `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- The functional catalog change is limited to recipe JSON data. I updated the existing package assertion to match the accepted link; no tests or emulator checks were run under the `AGENTS.md` JSON-data exception.

| Artifact | SHA-256 |
| --- | --- |
| Recipe 090 JSON | `cd6452ef8e76b0d33c43adce23cadfdf91c97cc94b42c19bae76e62a422a37c8` |
| Ingredient references | `373845dac8aa1453d0d4f85eaeb35033efc6130c347b75dc48e351b842576dde` |
| Ingredient forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Research ledger | `239362c04fe319180fdd78929b29383a174e5f605792dd4fea4ade7e6a93a563` |
| Manifest | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
