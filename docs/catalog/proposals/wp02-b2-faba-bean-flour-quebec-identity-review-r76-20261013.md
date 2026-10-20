# WP02 B2 review — faba bean flour / farine de féverole (R76)

**Reviewed:** 2026-10-13

**Status:** Proposal only; no shared data or checklist was changed.
**Scope:** Decide whether the Québec mill product named `Faba Bean Flour / Farine de Féverole` merits its own flour identity alongside the existing `fava bean flour / farine de gourgane` identity.

## Recommendation

**Integrate one identity-only `FLOUR_AND_STARCH` reference** for the Québec mill's source-named product, with the canonical pair `faba bean flour / farine de féverole`. Keep this identity separate from `ingredient-ref-fava-bean-flour` (`fava bean flour / farine de gourgane`). The current mill pages attest the exact English and French product names, and OQLF defines *féverole* as *Vicia faba minor*, while its Québec/Canada entry for *gourgane* identifies *Vicia faba* [S01–S04].

Also add the single broad English whole-pulse alias `faba bean` to the existing `ingredient-ref-fava-beans` row. Manitoba Agriculture lists fava and faba among names for the crop [S05]. This alias belongs to the whole-*Vicia faba* row; it does not connect the two flour identities or claim that all faba and fava flour products are equivalent.

The warranted identity boundary is narrow: this row represents the product named by Les Moulins de Soulanges. It does not establish that every product or recipe phrase using English `faba bean flour` refers to *Vicia faba minor*, nor that the two named flours have different culinary performance. Manitoba Agriculture reports that fava and faba are among the names for faba beans and that fava beans are milled into flour for human food [S05]. That broader usage is a reason to avoid a global synonym rule, not a reason to erase the Québec mill's exact bilingual product pair.

A hold would be appropriate if the catalog needed a universal taxonomic or process definition for every `faba bean flour`. The primary Québec manufacturer source already defines a useful, source-named food ingredient with an exact French product title, so a narrow separate identity is supportable. No general aliases or product specifications are inferred.

## Open checklist and archive context

The selected open line is the WP02 Section B umbrella, `B Alternative flours starches and regional starch products`: `[ ] Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours.` The checklist separately records the existing gourgane-flour identity and says to keep féverole flour distinct. That prior decision kept the two names out of one row; it did not assess a separate `faba bean flour / farine de féverole` reference.

The related [2026-10-11 fava bean flour review](wp02-b2-fava-bean-flour-quebec-identity-review-20261011.md) already records OQLF's *Vicia faba minor* scope for féverole and the Moulins de Soulanges French product page. This R76 review adds the manufacturer's paired English product page, checks the exact displayed bilingual pair against the active catalog and archive, and evaluates the separate identity question. It does not duplicate the accepted fava/gourgane row.

## Proposed catalog delta

Reserve the proposed ID only when this proposal is accepted. Add one reference with no aliases, forms, recipe links, or numeric behavior:

```json
{
  "id": "ingredient-ref-faba-bean-flour",
  "nameFr": "farine de féverole",
  "nameEn": "faba bean flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Append `faba bean` to the English aliases on the existing whole-bean row:

```json
{
  "id": "ingredient-ref-fava-beans",
  "aliasesEn": ["fava bean", "broad bean", "faba bean"]
}
```

Do not add `faba bean flour` as an alias to the existing gourgane-flour row. Do not add `féverole`, `faverole`, `horse bean flour`, or `field bean flour` as flour aliases: the canonical product pair is sufficient, and the latter English terms appear in OQLF's plant entry rather than as flour-product names [S03].

## Current ownership and evidence inventory

The live bundled catalog has 1,399 ingredient references and 104 forms. The exact proposed ID and exact English phrase `faba bean flour` have no owner in active references, forms, the legacy-import identity list, or earlier proposal/batch decisions. The French phrase `farine de féverole` appears in the earlier fava-flour research record as the title of a separate Québec product; it is not an active alias or reference.

| Live reference | Current name and aliases | Fields relevant to this proposal |
|---|---|---|
| `ingredient-ref-fava-bean-flour` | `fava bean flour / farine de gourgane`; both alias arrays empty | `FLOUR_AND_STARCH`; no forms, density, or unit mappings. Keep unchanged. |
| `ingredient-ref-fava-beans` | `fava beans / gourganes`; English aliases `fava bean`, `broad bean`; French aliases `gourgane`, `fève des marais` | `LEGUME_AND_PULSE`; no forms, density, or unit mappings. Add only the broad English whole-pulse alias `faba bean`; keep French terms unchanged. |

The current research ledger has an accepted gourgane-flour record, but no separate faba/feverole identity record. That record explicitly leaves the Québec féverole product outside the gourgane row and keeps Cuisine Soleil's serving statement product-specific [S06]. No source IDs or ledger data are being added in this proposal-only review.

## Identity, form, Québec wording, and picker boundary

Les Moulins de Soulanges is located in Coteau-du-Lac, Québec. Its English product page is titled `Faba Bean Flour`; its French page is titled `Farine de Féverole` and describes the same ingredient's baking and food uses [S01–S02]. The English page does not identify a Latin name or a seed cultivar. OQLF's term entry supplies the French lexical scope *Vicia faba minor* and lists `horse bean`, `horse-bean`, and `field bean` as English translations [S03]. OQLF's `gourgane` entry instead gives *Vicia faba* and identifies `gourgane` as preferred in Québec/Canada [S04].

This supports a separate named-product identity and a Québec French display already attested by the manufacturer. It does not prove a universal botanical boundary for all English `faba bean flour`, a particular cultivar or ingredient declaration for this mill product, or a standardized milling process. Do not add qualifiers such as `dehulled`, `whole`, `raw`, `precooked`, or `heat-treated`.

The picker uses complete normalized word-phrase matches before partial substring matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Based on the current names plus the proposed reference:

| Query | Expected result after integration |
|---|---|
| `faba bean flour` | New `faba bean flour / farine de féverole` row only. |
| `farine de féverole` | New `faba bean flour / farine de féverole` row only. |
| `faba bean` | New flour row and existing whole-bean row, because the phrase occurs in the flour name and is proposed as a whole-pulse alias [S05]. |
| `fava bean flour` | Existing `fava bean flour / farine de gourgane` row only. |
| `fava bean` | Existing flour row and whole-bean row, as the phrase appears in both current names/aliases. |
| `farine de gourgane` | Existing gourgane-flour row only. |

The broad `faba bean` query intentionally returns both the whole-pulse identity and the source-named flour. The alias is attached only to the whole-*Vicia faba* identity; the flour row remains alias-free and distinct from the existing gourgane-flour row. The exact `faba bean flour` query remains unique to the new flour row because the whole-bean alias does not contain the complete three-word phrase.

## Forms, measurement, conversion, yield, and substitution

- **Forms:** Add none. The manufacturer's pages identify a flour ingredient but do not disclose seed class, dehulling, heat treatment, or particle size.
- **Measurement and density:** Leave `defaultDensity` null and `unitMappings` empty. The mill pages provide no kitchen measure or density. Cuisine Soleil's separate gourgane-flour page gives a product-specific 30 g per ¼ cup statement; that value does not transfer to this mill's féverole flour [S06].
- **Conversion:** Add no volume-to-mass mapping and no conversion between this row and gourgane flour.
- **Yield:** Add no milling yield or cooked yield. None is established for the source-named product.
- **Substitution:** Add no rule. The mill describes breadmaking and other applications but publishes no validated household replacement ratio. The Manitoba page's general flour-market statement is not a substitution study [S01, S05].
- **Recipe links:** Add none. A corpus scan found no candidate demand.

## Recipe demand and numeric evidence limits

The current manifest lists 114 bundled recipe files containing 1,123 ingredient rows. A full scan for `faba`, `fava`, `féverole`, `feverole`, `gourgane`, and French flour-name variants found zero ingredient-line hits for the candidate terms. The new identity has no bundled recipe link or direct recipe demand.

The only volume/mass statement reviewed here is Cuisine Soleil's ¼ cup (30 g) amount for its own gourgane flour [S06]. It is source-product-specific, does not provide a generic fava/faba flour conversion, and is not copied to the proposed row. The Moulins de Soulanges pages give no numeric household quantity, density, yield, or substitution ratio [S01–S02].

## Source register

- **S01 — Les Moulins de Soulanges, [Faba Bean Flour](https://moulinsdesoulanges.com/language/en/faba-bean-flour/), accessed 2026-10-13.** Manufacturer product page. Supports the exact English product name, the Québec mill location, and listed food/baking applications. It does not state *Vicia faba minor*, a cultivar, ingredient declaration, milling process, household measure, or replacement ratio.
- **S02 — Les Moulins de Soulanges, [Farine de Féverole](https://moulinsdesoulanges.com/language/fr/farine-de-feverole/), accessed 2026-10-13.** Paired French manufacturer page. Supports the exact Québec French product title and baking/food applications; it does not state a Latin name, cultivar, or process specification.
- **S03 — Office québécois de la langue française, [féverole | Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8404131/feverole), accessed 2026-10-13; entry updated 1991.** Supports the French term `féverole`, its listed form `faverole`, the Latin identification *Vicia faba minor*, and the English plant terms `horse bean`, `horse-bean`, and `field bean`. It does not name a flour product.
- **S04 — Office québécois de la langue française, [gourgane | Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351051/gourgane), accessed 2026-10-13; entry updated 2006.** Supports *Vicia faba* and `gourgane` as the preferred Québec/Canada plant term. It does not name a flour product.
- **S05 — Province of Manitoba Agriculture, [The Manitoba Advantage in Fava Beans](https://www.gov.mb.ca/agriculture/protein/protein-sources/raw-comm/fava-beans.html), accessed 2026-10-13.** Supports broad English usage in which `fava` and `faba` are among names for faba beans and says fava beans are marketed as flour for human consumption. It does not resolve the Québec product's subspecies or establish that all faba and fava flour products are equivalent.
- **S06 — Cuisine Soleil, [Créez votre farine](https://cuisinesoleil.com/creez-votre-farine/), accessed 2026-10-13.** Supports the separate gourgane-flour product's stated ¼ cup (30 g) amount. It is cited only to record why that numeric statement is not transferable to the proposed féverole-flour product.

## Static review record

- Re-read the current `AGENTS.md`, the open WP02 Section B checklist, the live ingredient references/forms, the research ledger, the legacy-import file, and prior flour proposals/batches.
- Verified the proposed ID and English flour name have no current reference/form/legacy owner; confirmed the related gourgane and whole-fava rows and their aliases. The future whole-bean alias is supported by S05.
- Checked the 114-file / 1,123-row recipe corpus for candidate terms and reviewed the current phrase-first picker matcher.
- Verified the source pair and Québec terminology against the current manufacturer and OQLF pages listed above; checked Manitoba Agriculture for broader fava/faba naming.
- Proposal-only work: no catalog, ledger, checklist, roadmap, integration, generated, or application file was edited. No tests or emulator were run.
