# WP05 Sambal Matah — Québec Naming and Identity-Boundary Review

Date: 2026-10-11. Scope: the single open sambal matah candidate in Section X of `docs/RecipeBook-global-ingredient-catalog-plan.txt`. The identity-only recommendation was integrated on 2026-10-11; see the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the canonical row and verification.

## Recommendation

**ACCEPT an identity-only addition, using `sambal matah` as the English and Québec French display.** A verified May 2025 bilingual menu from a Montréal Indonesian restaurant lists this exact name in both languages [S03]. A targeted OQLF search did not locate a dedicated sambal matah entry. The borrowed culinary name is directly attested in Québec usage, so the earlier umbrella proposal's provisional `sauce pimentée balinaise crue` is unnecessary as the canonical display and should not be activated as an alias.

| Seed field | Value |
|---|---|
| ID | `ingredient-ref-sambal-matah` |
| English display | `sambal matah` |
| Québec French display | `sambal matah` |
| Aliases | None |
| Category | `SAUCE_AND_CONDIMENT` |
| Density / unit mappings | `null` / none |

Do not activate bare `sambal`, `raw sambal`, `Balinese salsa`, `sauce pimentée balinaise crue`, `pâte de piment`, or generic chili/chilli sauce or paste terms. They are broader descriptions, not source-attested names for this exact preparation.

## Prior-proposal and integration audit

Search of all prior proposal and WP05 batch files for sambal and the candidate spellings found no dedicated sambal matah packet. The relevant overlap is:

| Prior artifact | Existing treatment | This review |
|---|---|---|
| `wp05-southeast-asian-condiments.md` | Proposes sambal matah separately, with provisional French `sauce pimentée balinaise crue`; all non-Kapi candidates were pending when written. | Reassesses this one candidate and replaces the provisional display recommendation with directly observed Montréal French usage. |
| `wp05-southeast-asian-condiments-followup.md` | Integrates Kapi and ube halaya; wider Section X remains open. | No sambal matah identity or French naming decision. |
| `wp05-east-southeast-asian-pantry-batch-20261008.md` | Notes that the umbrella proposal covers sambals; integrates padaek only in that batch. | No separate matah identity. |
| `wp05-pantry-condiments-first-tranche.md` | Integrates selected sauces and distinguishes Sriracha from sambal, sweet chili sauce, and generic chili paste. | Establishes a boundary, not a matah identity. |
| `wp05-sambal-oelek-quebec-identity-boundary-review-20261011.md` | Reviews oelek only; the live catalog now contains `ingredient-ref-sambal-oelek`. Matah is cited only as a separate boundary. | Does not add or resolve matah. |
| `wp05-kapi-shrimp-paste.md`, `wp05-padaek-identity.md` | Mention other regional ferments or sambal terasi only as separate identities. | No matah row or alias. |

The old umbrella packet's stated status predates the current oelek integration. The current live catalog and ledger were inspected separately and govern this collision audit.

## Live package, form, ledger, legacy, and recipe audit

Snapshot: current worktree read on 2026-10-11. Counts and hashes identify the files inspected.

| Live artifact | Inspected state | SHA-256 |
|---|---|---|
| `ingredient-references.v1.json` | 903 references. No sambal matah reference or alias. The active `ingredient-ref-sambal-oelek` has `sambal ulek` as its EN/FR alias and no bare `sambal` alias; keep the exact Matah name separate. | `19d8d798b98a905dc03d7188a51792dfe418495cf8bd9c4a912682ae1794736b` |
| `ingredient-forms.v1.json` | 48 forms; no sambal, matah, or related form terms. | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `research-ledger.v1.json` | 1,156 records. It now has a verified oelek identity and mentions Matah as boundary evidence in that record; it has no `ingredient-ref-sambal-matah` identity or Matah decision. Kapi's record separately mentions sambal terasi. | `4a2c27f13543fb7519478833605fae06088ecb859b5e5459052f40847c6b5f8f` |
| `legacy-import-identities.v1.json` | 77 candidates; no sambal/matah candidate. | `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57` |
| Section X plan | Matah remains in the open combined sambal checklist item. | `a6eb00f6ed186c5341b7c6e36fb32c1ea04bf113b2e0d9956080a1ac3facb26b` |
| Earlier umbrella proposal | Contains the provisional matah French descriptor described above. | `55374e0410d1f429be343a9332253d66033067e6cc6fa29a8ca93bd6508f4c84` |

The exact active-reference hits are the newly integrated sambal oelek and the unrelated `yuzu kosho` entry with the specific alias `yuzu chili paste`. The active Sriracha reference is also kept separate from sambal by the first-tranche decision. No active form or legacy candidate claims `sambal matah`. The other ledger mentions are boundary references, not Matah records.

The bundled package has 114 recipe files and 1,123 ingredient lines. A field-level scan of all ingredient lines found no sambal, matah, oelek, ulek, bajak, terasi, belacan, or generic chili-paste/sauce demand, and no line references the proposed ID. A current Montréal menu demonstrates local culinary use, but does not create bundled recipe-line demand.

## Product boundaries and numeric disposition

| Neighbor | Boundary decision |
|---|---|
| Sambal oelek / ulek | Keep separate. OQLF defines oelek as crushed hot peppers, generally with salt and vinegar; the active reference is the exact oelek identity. The Ministry describes matah as a fresh preparation with unmeshed ingredients [S01–S02]. |
| Sambal bajak | Keep separate. Indonesia Travel describes bajak as a cooked Banten sambal with a distinct ingredient profile; it is not a Matah alias [S04]. The Indonesian-language page was retrieved in search but returned HTTP 502 on direct open. |
| Sambal terasi / terasi | Keep separate. The verified May 2025 Montréal menu lists Sambal Matah and Sambal Terasi as separate sambal items [S03]. The Ministry also notes that Matah versions can include terasi, so ingredient overlap does not make the two names synonyms [S02–S03]. Terasi remains an ingredient/paste identity, not an alias for the prepared Matah compound. |
| Generic chili paste/sauce and bare `sambal` | Do not alias. Matah is a regional prepared compound; its fresh, sliced style is materially different from broad chili-paste or sauce families. Sambal is also an umbrella term for several distinct preparations. |

No preparation form, density, volume-to-mass value, unit mapping, recipe measurement, package yield, conversion, or substitution is supported. The source descriptions and restaurant menu identify the product and its boundaries but provide no kitchen measurement basis. Do not create a raw form: the proposal is a named compound identity. Do not link a recipe line in this batch.

## Source register

Sources were checked on 2026-10-11.

| ID | Source | Supports / limits |
|---|---|---|
| `WP05-SAMBAL-MATAH-20261011-S01` | Office québécois de la langue française, [sambal oelek](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361603/sambal-oelek) | Québec terminology and a useful oelek boundary: crushed hot peppers, generally with salt and vinegar; the entry lists `sambal oelek` and `sambal ulek`. Last updated 2002. A targeted lookup did not find a separate OQLF entry for sambal matah. |
| `WP05-SAMBAL-MATAH-20261011-S02` | Indonesia Travel, Ministry of Tourism, [Dare Taste Indonesia's Hottest Burning Sambal](https://www.indonesia.travel/gb/en/travel-ideas/gastronomy/dare-taste-indonesia-s-hottest-burning-sambal) | Describes sambal as a broad family, Matah as fresh/raw, with red and green chili, shallot, tomato, lemongrass, terasi, and lime ingredients, and says the ingredients are not meshed together. Culinary description, not a compositional standard. |
| `WP05-SAMBAL-MATAH-20261011-S03` | Satu Lagi, Montréal, [bilingual menu PDF](https://www.satulagi.ca/_files/ugd/ed16f2_210d1938b96e47679089f9476aa57497.pdf) (May 2025; verified 2026-10-11) and [restaurant site](https://www.satulagi.ca/fr) | The PDF lists `Sambal Matah` in both its English and French menu sections, separately from Sambal Terasi. The French menu spells its shallot/lemongrass cue `Eschalotte et citronelle`; that cue is not used as the catalog name. This is direct Montréal French/English restaurant usage, not a later menu, terminology standard, or universal formula. The previously cited October 2026 PDF URL could not be opened and is superseded here. |
| `WP05-SAMBAL-MATAH-20261011-S04` | Indonesia Travel, Ministry of Tourism, [10 Sambal Khas Indonesia](https://www.indonesia.travel/id/id/travel-ideas/gastronomy/10-sambal-khas-nusantara-yang-wajib-dicoba) | Current Indonesian-language result text distinguishes raw/unpounded Matah and cooked Banten Sambal Bajak. Search retrieval returned the page on the review date, but direct open returned HTTP 502; treat as corroborative boundary evidence only. |
| `WP05-SAMBAL-MATAH-20261011-S05` | Indonesia Travel, Ministry of Tourism, [Sambal Matah](https://www.indonesia.travel/id/id/travel-ideas/gastronomy/sambal-matah) | Current page result describes sliced shallot, chili, lemongrass, lime leaf and hot coconut oil, and notes variants may add terasi or garlic. Direct open returned HTTP 502; do not rely on it for a standardized recipe. |

## Decision boundary and evidence limits

The integration accepts only the Matah compound identity and its exact bilingual display name. It does not complete the sambal checklist or add Matah aliases, a common sambal family row, or fermented shrimp-paste identities. Ministry sources provide culinary descriptions rather than compositional standards. The Montréal menu is direct evidence for local bilingual naming, but it describes one restaurant's menu. The Ministry's variants and the local menu show ingredient variation, so no universal ingredient formula or numeric conversion is inferred. No tests were run during the source review. Implementation verification is recorded in the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).
