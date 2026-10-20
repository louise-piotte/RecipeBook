# WP05 Section W R971 generic preserved-food gap review: Nozawana-zuke

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity, naming, measurement, and substitution review. This file is the only write; shared catalog data, ledger, plan, roadmap, checklist, recipes, and tests were not changed.
- **Plan anchor:** Section W leaves “further documented regional preserves” open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10357). The latest R966–R968 integration keeps generic preserve coverage open and confirms the current shared-data baseline.
- **Recommendation:** Add identity-only `nozawana-zuke / nozawana-zuke` for the distinct generic Nagano preserve. Use the source-attested romanized name as a provisional fr-CA display and add no French alias or descriptive translation. The missing OQLF preserve entry is a terminology limitation, not a concrete identity ambiguity; this follows the R968 `nanohana-zuke` precedent.
- **Scope:** One generic named regional preserve. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. Existing rows and product-scoped evidence remain untouched.

## Live snapshot and ownership audit

Recounted the live shared data on 2026-10-19:

| Artifact | Count |
|---|---:|
| Ingredient references | 1,986 |
| Ingredient forms | 205 |
| Legacy-import candidates | 55 |
| Research-ledger records | 2,391 |
| Research-ledger source entries / distinct source IDs / distinct URLs | 11,232 / 9,425 / 8,020 |
| Manifest-listed recipe files / ingredient rows | 114 / 1,123 |

Accent-, punctuation-, and case-normalized scans of active reference names and aliases, form labels and match terms, legacy candidates, and all ledger records found no owner for `nozawana-zuke`, `nozawana zuke`, `nozawana`, `Nozawa-zuke`, `野沢菜漬け`, `野沢菜漬`, or `野沢菜`. The candidate ID `ingredient-ref-nozawana-zuke` and source-ID prefix `WP05-SECTIONW-NOZAWANA-ZUKE-R971-20261019-` are also unowned. No earlier proposal or batch assigns this identity.

The nearest active identities establish boundaries rather than ownership:

| Active identity | Boundary retained |
|---|---|
| `ingredient-ref-turnip-greens` — `turnip greens / feuilles de navet` | Raw leafy vegetable. Do not use the raw identity or its French name for a finished preserve. |
| `ingredient-ref-mustard-greens` — `mustard greens / feuilles de moutarde` | Raw mustard greens; not a preserve alias. |
| `ingredient-ref-pickled-mustard-greens` — `pickled mustard greens / feuilles de moutarde marinées` | Generic prepared mustard greens. Do not add Nozawana wording as a broad alias or treat this row as proof of the named Nagano product. |
| `ingredient-ref-takana-zuke` — `takana-zuke (pickled takana) / takana-zuke` | A separate named Japanese mustard-leaf preserve. Similar broad pickle use does not establish identity or substitution. |
| `ingredient-ref-nanohana-zuke` — `nanohana-zuke / nanohana-zuke` | A Kyoto rape-blossom pickle, not the named Nagano Nozawana preserve. |

The open Section W item covers further documented regional preserves. No queue item whose sole deliverable is a commercial roster was encountered. If such an item appears, mark it out of scope because commercial-product counts do not add ingredient diversity, then stop that line. Preserve existing branded rows and do not transfer product-specific measurements or claims without an independent transferability review.

## Recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned, including recipe text and ingredient fields. Searches for the candidate, source spellings, Japanese-script name, and `pickled Nozawana` returned no hits. The bundled corpus supplies no direct demand or recipe context; no recipe link or relinking is proposed. MAFF’s examples of eating the preserve with rice, in onigiri or oyaki, and in cooked dishes are external regional-use evidence, not bundled demand or substitution guidance. [S01–S02]

## Identity evidence and bilingual naming

Japan’s Ministry of Agriculture, Forestry and Fisheries (MAFF) names **Nozawana-zuke (Nozawana pickles)** as a Nagano regional preserve. Its English account describes Nozawana as a distinct local turnip-derived vegetable whose leaves and stems are used, and identifies Nozawana-zuke as one of Nagano’s representative pickles. The Japanese MAFF entry names `野沢菜漬け（のざわなづけ）`, classifies it as a pickle, and describes its use as winter food. Together these official sources support a named preserve identity, distinct from raw Nozawana or generic pickled greens. [S01–S02]

MAFF describes both lightly pickled `asazuke` and aged `furuzuke`, with the latter undergoing more lactic fermentation and developing a stronger acidic flavour. The page also says preparation varies by region and household. Keep those source-described preparations within the named identity; do not encode one mandatory fermentation state, colour, formula, or process as a default. Do not map Nozawana-zuke to generic pickled mustard greens, takana-zuke, or nanohana-zuke. [S01–S02]

Targeted searches found no Québec French food name or local French use of `Nozawana-zuke`. OQLF’s `feuille de navet` entry names raw turnip greens; it does not name or standardize this preserve. It therefore does not support translating the candidate as `feuilles de navet marinées`. The generic phrase `feuilles de moutarde marinées` is already owned by the broader pickled-mustard-greens identity and would obscure the named product boundary. [S03]

The source directly names the preserve `Nozawana-zuke`, and the reviewed evidence reveals no competing French name or culinary identity that would make the borrowed display misleading. Follow the [R968 nanohana-zuke decision](wp05-section-w-generic-preserved-food-gap-review-r968-20261019.md), which used its source-attested romanized name provisionally in fr-CA despite no French alias. Accordingly, use `nozawana-zuke` as a provisional borrowed French display, with no French alias; do not force a descriptive translation. The missing Québec terminology entry remains a limitation to revisit if local evidence emerges, not a reason to hold this distinct identity.

## Measurement and substitution review

MAFF’s English page includes one home recipe for a traditional barrel batch. Its listed Nozawana, salt, shochu, kombu, and chili quantities belong to that recipe and its source community. They do not establish a finished-preserve serving mass, household measure, density, unit mapping, conversion, or yield. The Japanese page likewise describes several methods and ingredient variations. If integrated, use `measurementState: researched_no_supported_value`, with null density and no unit mappings, measurements, forms, or conversions. [S01–S02]

No reviewed source recommends a substitute for finished Nozawana-zuke, and the recipe corpus has no target dish or role. Do not activate takana-zuke, generic pickled mustard greens, nanohana-zuke, raw turnip greens, or raw Nozawana as replacements. Shared vegetable or pickle-family wording does not establish matching preparation, texture, salt or acid level, role, ratio, or adjustment. If integrated, keep substitution research `blocked_pending_evidence`; add no active substitution rule or recipe-line link without contextual evidence.

## Candidate record and source register

The proposed active identity is limited to the source-attested generic preserve name:

| Field | Candidate state |
|---|---|
| Candidate ID | `ingredient-ref-nozawana-zuke` |
| `nameEn` | `nozawana-zuke` |
| `nameFr` | `nozawana-zuke` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases / French aliases | None / none |
| Forms, density, unit mappings, measures, conversions, yields | None supported |
| Recipe links and active substitutions | None |
| Ledger states if integrated | `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence` |

The source IDs below are proposal-local identifiers; they have not been added to the shared ledger. Sources were reviewed online on 2026-10-19. Claims remain within the sources’ scope.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-NOZAWANA-ZUKE-R971-20261019-S01` | Japan Ministry of Agriculture, Forestry and Fisheries, [Nozawana-zuke (Nozawana pickles), Our Regional Cuisines](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/6498/index.html). | Gives the English name, Nagano regional identity, Nozawana and salt/shochu as principal ingredients, lightly pickled and aged-pickle descriptions, general eating uses, and one source-specific barrel recipe. The recipe is not a universal formula or reusable measurement. |
| `WP05-SECTIONW-NOZAWANA-ZUKE-R971-20261019-S02` | Japan Ministry of Agriculture, Forestry and Fisheries, [野沢菜漬け（のざわなづけ）, にっぽん伝統食図鑑](https://www.maff.go.jp/j/keikaku/syokubunka/traditional-foods/menu/nozawana_zuke.html). | Official Japanese name and Nagano pickle classification; describes the local vegetable, preservation context, method variation, and regional uses. It does not establish a Québec French name or one universal recipe. |
| `WP05-SECTIONW-NOZAWANA-ZUKE-R971-20261019-S03` | Office québécois de la langue française, [feuille de navet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18055303/feuille-de-navet). | Supports the Québec French term for raw turnip greens. It does not name Nozawana-zuke or standardize a preserved-food translation. |

**Disposition:** Propose identity-only `nozawana-zuke / nozawana-zuke` under `SAUCE_AND_CONDIMENT`, with no aliases, forms, numeric behavior, recipe links, or active substitutions. The borrowed French display remains provisional. No product roster was researched, no existing branded identity or product-specific evidence was altered or generalized, and no software tests were run because this packet is proposal-only.

## Document checks

- UTF-8 decoded cleanly without a byte-order mark, replacement character, or mojibake marker.
- The relative plan link resolves; source links use HTTPS.
- Each proposal-local source ID in the text resolves to the source register; none is claimed to exist in the live ledger.
- The 114-file / 1,123-row recipe recount and core catalog counts were recomputed from live files.
- No trailing whitespace was found. No software tests were run for this documentation-only proposal.
