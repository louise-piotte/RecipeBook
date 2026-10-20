# WP03 Section U lemon balm identity review — R324

- **Status:** proposal only; no shared catalog, ledger, plan, roadmap, recipe, generated file, or application file was changed.
- **Plan item:** Section U, “Fresh herbs botanical aromatics and regional flavorings,” unchecked line 7601: `Epazote, hoja santa, huacatay, papalo, lovage, sorrel, fenugreek leaves, lemon verbena, and lemon balm.`
- **Target:** the culinary leafy herb *Melissa officinalis*, separate from lemongrass (*Cymbopogon citratus*) and lemon verbena (*Lippia citriodora* in the cited OQLF record).
- **Disposition:** recommend one bounded identity-only row, `ingredient-ref-lemon-balm`, category `HERB`.
- **Coordination:** distinct from the current R322 thyme and R323 splendid-alfonsino reviews and from R319 besan, R320 Bombay duck, and R321 garland chrysanthemum.

## Recommendation

Add one identity for the culinary leaf herb *Melissa officinalis*, with English display **lemon balm** and Québec French display **mélisse officinale**. Use French alias **mélisse**. Do not add a second English alias: the Canadian crop profile's other names (`Melissa`, `honey plant`, and `cure all`) are not needed to identify the culinary ingredient and can be broad. Do not use scientific names as picker aliases.

Keep the identity for the culinary herb and its leaf product. The Ontario crop profile describes fresh-leaf harvesting and dried-leaf production; Québec's edible-plant seller describes culinary use of leaves and flowers. Neither supports treating every plant part, extracted oil, supplement, tea blend, powder, or processed product as an interchangeable form. No form is proposed.

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-lemon-balm` (unreserved) |
| Category | `HERB` |
| EN display | `lemon balm` |
| FR display | `mélisse officinale` |
| EN aliases | None |
| FR aliases | `mélisse` |
| Forms and recipe links | None |
| Density, unit mapping, conversion, yield, substitution | None |

### Naming and picker boundaries

- Retain `mélisse` as a French search alias. The French OMAFRA crop profile uses it as a common name, and the Québec nursery labels its edible plant `Mélisse` while naming *Melissa officinalis*.
- Do not assign bare `citronnelle` or `mélisse-citronnelle`. OMAFRA records `mélisse-citronnelle`, but the accessible OQLF GDT entry assigns bare `citronnelle` to *Cymbopogon citratus*. These conflicting usages make the shortened term unsafe. The picker recognizes a complete word phrase inside a longer alias, so adding `mélisse-citronnelle` would make a bare `citronnelle` query retrieve this row.
- Keep `lemon verbena` / `verveine citronnelle` separate. The OQLF record maps that French name to *Lippia citriodora*, a different taxon.
- Do not add medicinal-use names or dosage terms as aliases. Health Canada's food determination cited below is only for raw leaves used in tea; it is not evidence for a general supplement identity or a dosage recommendation.

## Ownership and corpus audit

I checked the live reference and form packages, legacy import candidates, research ledger, proposal and batch archive, picker matching behavior, and every manifest-listed recipe file. Exact normalized phrase families included `lemon balm`, `mélisse`, `mélisse officinale`, `mélisse-citronnelle`, `citronnelle`, `Melissa officinalis`, `Lippia citriodora`, and `Cymbopogon citratus`.

| Surface | Snapshot / finding |
|---|---|
| Active ingredient references | 1,676 rows; no exact candidate identity phrase or proposed ID. Adjacent `ingredient-ref-lemongrass` is displayed as `lemongrass / verveine des Indes` and has no `citronnelle` alias. |
| Active forms | 127 rows; no candidate phrase or form owner. |
| Legacy import identities | 59 candidates; no candidate phrase or proposed ID owner. |
| Research ledger | 2,023 records; no lemon-balm identity. One `ingredient-ref-lemongrass` record mentions lemon balm only in its `citronnelle` ambiguity note. |
| Proposal and batch archive | No focused lemon-balm identity review or R324 source prefix. Existing roots/aromatics research mentions the `citronnelle` ambiguity; the R296 lovage proposal cites the same open Section U umbrella but does not review lemon balm. |
| Recipe corpus | 114 manifest-listed files / 1,123 ingredient rows; zero candidate phrase or binomial matches. |
| Forms, substitutions, and package yields | No target entry or supported basis for adding one. |

The proposal path, `ingredient-ref-lemon-balm`, and source-ID prefix `WP03-SECTIONU-LEMON-BALM-R324-20261016-S` were unoccupied in the checked archive and live ledger before drafting. The bundled picker normalizes accents and first matches full word phrases; it then falls back to substring matching. Thus `mélisse` and unaccented `melisse` will retrieve the proposed row, while omitting `citronnelle` and `mélisse-citronnelle` avoids making the ambiguous short term retrieve it.

## Measures, substitutions, and recipes

The reviewed sources provide no kitchen volume-to-mass observation, density, general serving measure, transferable fresh-to-dried ratio, or replacement ratio. OMAFRA crop spacing, temperature, harvest timing, and fresh-leaf storage duration are agricultural observations, not ingredient measures. The Québec bulk product's package sizes are SKU details, not kitchen conversions. No measurements, forms, substitutions, package yields, or recipe links are proposed; leave measurement and substitution research open.

The full manifest-ordered recipe scan found zero candidate phrase or binomial matches. No recipe link or recipe edit is warranted. This records only the bundled corpus, not absence of culinary use: OMAFRA and the Québec producer independently describe culinary use.

## Proposed ledger disposition

If approved, add the source records below and one accepted identity decision for `ingredient-ref-lemon-balm`, recording the species-bounded culinary leaf scope, bilingual displays, and the single French alias. Add no measurement observation, form, substitution, or recipe-line finding. Keep measurement and substitution research open. Record the two uses of `citronnelle` as a naming-ambiguity boundary, not as aliases or a species merge.

## Evidence

| ID | Source | Support and limits |
|---|---|---|
| `WP03-SECTIONU-LEMON-BALM-R324-20261016-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Melissa officinalis*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:450084-1/general-information), accessed 2026-10-16. | Kew accepts *M. officinalis* and records use for food. This is the taxonomic anchor, not the Québec display-name source. |
| `WP03-SECTIONU-LEMON-BALM-R324-20261016-S02` | Ontario Ministry of Agriculture, Food and Rural Affairs, [Lemon Balm](https://www.omafra.gov.on.ca/CropOp/en/herbs/culinary/lemba.html), accessed 2026-10-16. | Names *Melissa officinalis*, classifies it as a culinary herb, describes flavouring, tea, and candy uses, and documents fresh-leaf harvesting and dried-leaf production. The English page says last modified 2012-10-17; its cultivation and storage data are not kitchen measures. |
| `WP03-SECTIONU-LEMON-BALM-R324-20261016-S03` | Ontario Ministry of Agriculture, Food and Rural Affairs, [Mélisse officinale](https://www.omafra.gov.on.ca/CropOp/fr/herbs/culinary/lemba.html), accessed 2026-10-16. | Gives Latin *Melissa officinalis*, French names `mélisse` and `mélisse-citronnelle`, and culinary markets including flavouring, tea, and candy. It describes fresh-leaf harvest and dried-leaf production. The page says last modified 2012-10-17. The source's qualified `mélisse-citronnelle` is not adopted as a picker alias because the current picker would also match a bare `citronnelle` query. |
| `WP03-SECTIONU-LEMON-BALM-R324-20261016-S04` | Office québécois de la langue française, [mélisse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3694736/melisse), accessed 2026-10-16; record attributed to Association française de normalisation, 1975. | Pairs French `mélisse` with English `balm` / `lemon balm` and *Melissa officinalis*. The GDT record's named author is AFNOR, not OQLF; it is not presented as an OQLF-authored preferred-term ruling. |
| `WP03-SECTIONU-LEMON-BALM-R324-20261016-S05` | Office québécois de la langue française, [citronnelle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408990/citronnelle), accessed 2026-10-16; record updated 1989. | The OQLF-authored entry maps `citronnelle` to *Cymbopogon citratus* in botanical and food domains. This supports excluding the bare name from the proposed lemon-balm aliases; it does not establish that every French speaker uses it only this way. |
| `WP03-SECTIONU-LEMON-BALM-R324-20261016-S06` | Office québécois de la langue française, [verveine citronnelle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8883204/verveine-citronnelle), accessed 2026-10-16; record updated 1984. | Maps `verveine citronnelle` to *Lippia citriodora* and English `lemon verbena`; the record notes its infusion resembles lemon balm. It supports keeping the similar name and separate species outside this identity. |
| `WP03-SECTIONU-LEMON-BALM-R324-20261016-S07` | Croque Paysage, Québec edible-plant nursery, [Mélisse — Plant Bio](https://croquepaysage.com/products/melisse-bio-plant), accessed 2026-10-16. | Product heading `Mélisse` identifies *Melissa officinalis* / `Lemon balm`; the French description says the leaves and flowers are edible and gives culinary uses. The listing showed `En rupture` (out of stock) during review and sells a plant, not harvested fresh leaves. It is Québec naming/culinary evidence, not proof of current fresh-herb availability. |
| `WP03-SECTIONU-LEMON-BALM-R324-20261016-S08` | Health Canada, [List of non-novel determinations for food and food ingredients](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html), accessed 2026-10-16. | The 2013-11-27 entry is specifically raw *Melissa officinalis* leaves for tea use, whole or minimally processed. This is a narrow food-history determination, not a blanket approval for all preparations, uses, or doses. |
| `WP03-SECTIONU-LEMON-BALM-R324-20261016-S09` | LiquidShop / Liquid Solution, Lévis, Québec, [Lemon Balm Powder (Mélisse) — Bulk Food Grade](https://liquidshop.ca/products/melisse-lemon-balm), accessed 2026-10-16. | The current product page identifies *Melissa officinalis*, uses English `Lemon Balm Powder` and French `Mélisse`, states that the botanical powder is food-grade, and says the business ships from Québec. This is a supplier-specific powder listing, not a fresh-leaf measurement or a universal powder form. |

## Limitations and checks

- OMAFRA's culinary crop pages are official and bilingual but last modified in 2012. They support identity and culinary use; they are not current Québec retail evidence.
- The accessible OQLF entry assigns bare `citronnelle` to *Cymbopogon citratus*, while other project-referenced French sources use `mélisse-citronnelle` for *M. officinalis*. The proposed row therefore avoids both short and compound `citronnelle` aliases.
- Croque Paysage's listing was out of stock at access time and is a living-plant listing. LiquidShop's evidence is one Québec supplier's food-grade powder product. Neither establishes current availability of harvested fresh leaves across Québec.
- Static checks only: repository ownership and archive review, picker-code inspection, source review, and full bundled-recipe corpus search. No software tests, builds, emulator checks, or deployment were run for this proposal-only task.
