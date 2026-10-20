# WP06 Europe — Roquefort PDO identity review (R417)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review creates only this proposal file; it does not change shared catalog data, forms, the research ledger, recipes, generated files, the Europe checklist, workflow, or roadmap.
- **Snapshot:** Counts, ownership, picker behavior, and corpus results below describe the shared workspace read on 2026-10-17.
- **Scope:** One French regional cheese identity, the protected **Roquefort PDO**. Keep it distinct from generic blue cheese and other named blue cheeses.
- **Source-ID prefix:** `WP06-EUROPE-ROQUEFORT-R417-20261017`. The proposed reference ID, prefix, source URLs, and target path were checked for collisions.

## Recommendation

If accepted, add one identity-only `CHEESE` reference for **`Roquefort / roquefort`**. OQLF gives the preferred French term `roquefort` and English equivalent `Roquefort`; its French entry notes that cheese names take a lowercase initial in French. [S01] The current EU product specification names `Roquefort` as a PDO and defines it as a blue-veined cheese made exclusively from raw, whole sheep's milk. [S02]

The identity covers the cheese made under the Roquefort PDO specification. It does not cover the broad blue-cheese category, another named blue cheese, or a product that merely resembles Roquefort. Keep the active `blue cheese / bleu` row and its generic search terms unchanged. An earlier WP04 review explicitly kept Roquefort outside that broad identity; R417 proposes the separate named row now. [S02; S05]

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-roquefort",
  "nameFr": "roquefort",
  "nameEn": "Roquefort",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "CHEESE"
}
```

Use the registered product name in both languages. Do not add `blue cheese`, `bleu`, `blue-veined cheese`, `sheep cheese`, `Roquefort AOP`, a brand, or a product-specific flavor name as an alias. The official registered name is `Roquefort`; generic descriptions and nearby cheese names do not identify the same protected product. [S01–S02, S05]

## Identity and product boundaries

The European Commission's current single document identifies **Roquefort** as a French PDO for cheese and curd. It defines the product as blue-veined and made exclusively from raw, whole sheep's milk. It gives the current product dimensions and wheel-weight range and requires ripening and maturation for at least 90 days. The production area is defined in the specification, with ripening caves at Roquefort-sur-Soulzon. The INAO product page reflects the specification amendment approved in February 2026. Use the EU document and current INAO page for the protected product boundary; OQLF supplies the Québec French and English terms. [S01–S03]

Keep nearby identities and concepts separate:

- **`ingredient-ref-blue-cheese` / `blue cheese / bleu`:** broad blue-cheese category. Do not turn it into an alias for Roquefort or add the generic terms to Roquefort.
- **Other named blue cheeses:** Gorgonzola, Stilton, Bleu d'Auvergne, and other regionally named products remain separate identities where represented. A shared blue-veined appearance does not establish sameness or substitution.
- **Non-PDO and prepared products:** a blue cheese, flavored cheese, sauce, dressing, or recipe that mentions Roquefort does not become a Roquefort PDO identity automatically.
- **Roquefort flavor or style wording:** keep product descriptions and producer-specific versions out of global aliases unless a later source review establishes an exact bilingual product term.

The current Roquefort interprofession FAQ says Roquefort is made only with raw, whole Lacaune ewe's milk, matures for at least 90 days, and is distinct from other blue cheeses. This supports the product boundary; it does not establish a substitution ratio or a recipe-specific replacement. [S04]

Do not reopen [R411 Pimentón de la Vera](wp06-europe-next-regional-identity-review-r411-20261017.md) or [R414 Tête de Moine AOP](wp06-europe-next-regional-identity-review-r414-20261017.md); both are distinct completed Europe reviews. See the [R412–R414 integration README](../batches/wp02-wp04-wp06-r412-r414-gap-review-integration-20261017/README.md). The Europe coverage checklist itself remains open.

## Live ownership and archive audit

Read-only workspace snapshot checked on 2026-10-17:

| Surface | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,717 | No exact owner for `Roquefort`, `roquefort`, or `ingredient-ref-roquefort`. The nearby `ingredient-ref-blue-cheese` row is only `blue cheese / bleu` and has no Roquefort alias. |
| Ingredient forms | 141 | No Roquefort form, label, or match term. |
| Legacy import candidates | 56 | No Roquefort candidate or proposed reference ID. |
| Research ledger | 2,076 records; 9,400 source entries | No Roquefort identity record, proposed ID, R417 source prefix, or source-URL collision. One existing `blue cheese` record mentions Roquefort only to preserve the distinction from the broad category. |
| Substitution and package-yield files | 0 global rules; 0 contextual rules; 1 package yield | No Roquefort name or proposed ID. The one package yield belongs to black beans. The ledger's eight unit conversions also contain no Roquefort reference. |
| Proposal and batch archive | Existing catalog archive | No prior dedicated Roquefort allocation or review; the WP04 cheese coverage review names Roquefort only as an example of a blue-cheese variety that is not an alias for generic `blue cheese`. The target path is unallocated. |

The audited live inputs include the [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [global substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitution rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), and [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json). The exact proposed ID and source prefix were checked across the active data and catalog archive. The four new R417 source URLs below are absent from the ledger; the existing OQLF blue-cheese URL is deliberately retained under its existing source ID. The live `blue cheese` ledger entry and its broader boundary are visible in the [WP04 cheese review](wp04-cheese-dairy-residual-identity-review-20261010.md) and [ledger record](../research-ledger.v1.json#L30989). The Europe coverage item remains open in the [regional checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L8972).

## Phrase-first picker projection

I projected the proposed French and English names through the accent-, punctuation-, and case-folding phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The projection uses the current names and aliases with no proposed aliases.

| Query | Current result | With proposed row |
|---|---|---|
| `Roquefort`; `roquefort` | No result | `ingredient-ref-roquefort` only |
| `blue cheese` | `ingredient-ref-blue-cheese` only | The same generic row only |
| `bleu` | Six current matches, including `ingredient-ref-blue-cheese` | Same six matches |
| `cheese` | 14 references | Still 14; the registered product name does not add a generic cheese alias |
| `Gorgonzola`; `Stilton` | No result | No result; neither name is an alias for Roquefort |

Roquefort queries gain a dedicated result. Generic blue-cheese queries continue to resolve to the broad row, and other named blue-cheese queries remain unallocated.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8. The scan checked the complete decoded recipe documents and ingredient rows for `Roquefort`, `roquefort`, `Roquefort PDO/AOP`, `fromage roquefort`, the proposed ID, and the generic blue-cheese comparison terms. It found **zero matching recipe files, zero matching ingredient rows, and zero linked recipe IDs**. No ingredient amount, conversion, form, or recipe-specific substitution supports the candidate.

The current manifest-ordered corpus contains **753,988 bytes** and has fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a newline, then hashes the concatenated bytes.

## Forms, measurements, and substitutions

The latest EU product document reports a **2.5–3 kg** whole wheel with specified dimensions. These are product-standard characteristics, not a recipe amount, portion weight, package yield, or count-to-mass mapping. The document's 90-day minimum is a production and maturation condition, not an ingredient measure. The full bundled recipe corpus has no Roquefort line to support a form or reusable quantity. [S02]

If integrated, keep the proposed `forms` collection empty, `defaultDensity` null, and `unitMappings` empty. Add no measurement observation, conversion, package yield, recipe link, or ingredient-form mapping. The product-specification weight range does not support a general cooking measure; use `measurementState: researched_no_supported_value` if a ledger identity record is created.

The interprofession's comparison guidance distinguishes Roquefort from other blue cheeses but gives no replacement direction or amount. The existing broad blue-cheese record also has no supported global substitute, but that finding belongs to the generic category and does not establish a substitute for Roquefort. Add no global or contextual substitution, inverse rule, or recipe-line link. Leave Roquefort substitution research at `not_yet_researched` until a focused recipe-context review supports a rule. [S04–S05]

## Source register

The four new sources were accessed on 2026-10-17. Their source IDs and direct URLs were checked against the live research ledger.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-ROQUEFORT-R417-20261017-S01` | Office québécois de la langue française, [GDT — roquefort](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26500662/roquefort), last updated 2008. | Supplies the preferred French term `roquefort`, the English equivalent `Roquefort`, French capitalization guidance, and a definition identifying raw ewe's-milk cheese matured in Roquefort caves. Terminology evidence; not the current PDO specification. |
| `WP06-EUROPE-ROQUEFORT-R417-20261017-S02` | European Commission, [current Roquefort PDO single document](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX:52026XC02834), EU reference PDO-FR-0131-AM06, amendment dated 2026-03-04 and published in the Official Journal on 2026-05-27, sections 1–5. | Primary current source for the registered product name, PDO status, cheese category, raw whole sheep's milk, blue-veined identity, product dimensions and wheel-weight range, 90-day minimum, and geographic boundary. The product-standard weight is not a cooking measure. |
| `WP06-EUROPE-ROQUEFORT-R417-20261017-S03` | INAO, [Roquefort product page](https://www.inao.gouv.fr/produit/roquefort-24302), product details and current specification amendments. | French national authority summary identifying raw whole Lacaune ewe's milk, maturation at Roquefort-sur-Soulzon, regional production area, and the February 2026 specification amendment. Use the current EU document for the directly stated English product and dimensional details. |
| `WP06-EUROPE-ROQUEFORT-R417-20261017-S04` | Confédération Générale de Roquefort, [FAQ](https://www.roquefort.fr/faq/), “C'est quoi la différence avec les autres bleus?” and production questions. | Current product-group guidance on Lacaune raw whole milk, maturation, and the distinction from other blue cheeses. Supports identity boundaries; does not prove that a blue cheese can or cannot substitute in a particular recipe. |
| Existing source `WP04-Q-CHEESE-20261010-S16` | OQLF, [GDT — bleu / blue cheese](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2073052/bleu), already recorded in the research ledger and accessed 2026-10-10. | Supports the generic blue-cheese category and its distinction from sheep-milk Roquefort. Reuse the existing source ID and record; do not add a duplicate R417 source entry. |

For the already integrated generic-category boundary, retain the existing source in the live research ledger. Its record says `blue cheese` is a broad veined category and not an alias for Roquefort. [S05]

## Disposition

Proceed with one identity-only `CHEESE` row for **`Roquefort / roquefort`**, with empty alias arrays, if accepted. Keep the protected French product boundary and OQLF bilingual terms. Preserve generic blue cheese and other blue-cheese products as separate identities. Add no forms, measurements, conversions, package yields, recipe links, or substitutions. The Europe-wide regional coverage checklist remains open.

No software tests, build, emulator run, or deployment were performed because this is a proposal-only documentation change.
