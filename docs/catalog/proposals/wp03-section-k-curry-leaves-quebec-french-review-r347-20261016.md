# WP03 Section K — Québec French terminology review: curry leaves (R347)

**Status:** integrated as an alias-only terminology update on the existing identity and dried form.

**Research date:** 2026-10-16.
**Target:** existing `ingredient-ref-curry-leaves` and its integrated dried form.

## Disposition

Keep the primary display `curry leaves / feuilles de cari`. The French name is well supported by Canadian terminology and current Québec culinary and retail usage. There is no reason to rename the identity or create another ingredient reference.

For search coverage, add only phrase-level synonyms supported for the same leaf product:

| Field | Suggested aliases | Basis |
|---|---|---|
| `aliasesFr` | `feuille de cari`; `feuille de curry`; `feuilles de curry`; `feuille de Murraya` | TERMIUM Plus marks the first, second, and fourth terms correct, and `feuille de Murraya` ISO-standardized. Current Canadian and Montréal sources also use singular and plural `feuille(s) de curry`. |
| `aliasesEn` | `curry leaf` | TERMIUM Plus identifies the singular English term as ISO-standardized; it is also the title form used by the existing India Spices Board source. |

The existing WP06 exclusion of Indian-language regional names remains in force. Do not add bare `cari` or `curry`: OQLF’s entry defines those terms as names for a spice blend, and the live catalog already has separate curry-powder and curry-paste references. Do not add `feuille de caloupilé` as a Québec alias: TERMIUM labels it as a term used in Réunion, and one Montréal seller’s “other names” list is not enough to establish local general usage. No new identity, category, form, measurement, conversion, yield, recipe link, or substitution is supported here; only exact match terms on the existing R282 dried form may need updating if aliases are integrated.

If the suggested aliases are accepted, add corresponding exact dried-form match terms to the R282 form so searches such as `feuille de curry séchée` and `feuilles de curry séchées` select the existing `dried` form hint. Preserve the current `feuilles de cari séchées` label and `feuilles de cari lyophilisées` match term; these describe the same dry form, with lyophilization remaining source-specific. The proposal does not imply a ground-leaf form.

## Existing catalog and ownership

The live reference is `ingredient-ref-curry-leaves`, category `HERB`, with `nameEn: curry leaves`, `nameFr: feuilles de cari`, and empty English and French alias arrays. It remains the culinary leaf of *Murraya koenigii*, not curry powder or curry paste.

WP06 originally promoted the legacy candidate as a distinct *Murraya koenigii* leaf identity and kept regional-language aliases out. Its follow-up checklist specifically left the borrowed French display open for independent Québec terminology review. The later WP03 Section K R282 review added `ingredient-form-curry-leaves-dried` under that identity. The form is currently displayed as `dried curry leaves / feuilles de cari séchées`, with `dry` prep state, exact English dried/freeze-dried terms, and the French exact term `feuilles de cari lyophilisées`. It carries no measure or density.

The global plan’s Section K parent remains open for its wider leaf and wrapper scope. Its curry-leaf child for the R282 dried form is checked. This review settles only the requested terminology question; it does not close the broader Section K item. The independent identity owner was WP06; the dried-form addition was recorded under WP03 Section K.

## Québec usage and term boundary

The strongest local evidence favors retaining `feuilles de cari`: Tourisme Montréal uses singular `feuille de cari` in a current Montréal restaurant description, and a Québec retailer sells the whole-leaf product as `Feuille de Cari Entière Bio` and labels its ingredient `feuilles de cari entières biologiques`. A Québec French recipe from a clinical dietitian also lists `feuilles de cari` as an ingredient. Canadian sources independently use `feuille de curry` and `feuilles de curry` for the same leaf product.

The OQLF GDT entry located for `cari` is explicitly about a spice blend. It lists `cari`, `carry`, `cary`, and `curry` as acceptable Québec terms for that blend. It does not establish a leaf name. TERMIUM Plus’s spice-and-condiment record is more directly applicable: it maps English `curry leaf` to French `feuille de cari`, `feuille de curry`, and `feuille de Murraya`; it marks `feuille de Murraya` standardized by ISO and ties the spice to *Murraya koenigii*. It says the terms apply to both whole and ground products, and notes that `feuille de caloupilé` is used in Réunion. That supports phrase-level leaf synonyms without making bare `cari` or `curry` a leaf alias.

## Picker and corpus projection

The current reference/form JSON and generated Kotlin entry agree on the name and empty aliases. `IngredientReferenceSearchIndex` uses complete word phrases before partial matching and assigns a form hint only for an exact form term.

| Query | Current projection |
|---|---|
| `feuilles de cari`; `curry leaves` | Existing curry-leaf reference |
| `feuille de cari`; `feuille de curry`; `feuilles de curry`; `feuille de Murraya`; `curry leaf` | No exact current reference/form term |
| `feuilles de cari séchées`; `feuilles de cari lyophilisées`; `dried curry leaves`; `freeze-dried curry leaves` | Existing curry-leaf reference with the R282 dried-form hint |
| `poudre de cari`; `curry powder`; `pâte de cari`; `curry paste` | Their separate current identities; no exact phrase collision with leaf aliases |

Adding only the suggested complete leaf phrases will return the existing identity, while preserving the distinction from powders and pastes. A bare `cari` or `curry` query is broad under current phrase/token matching and must not be introduced as an alias.

The current manifest lists 114 recipes and 1,123 ingredient lines. A read-only scan of every manifest-listed recipe JSON found no occurrences of `curry leaves`, `curry leaf`, `feuilles de cari`, `feuille de cari`, `feuilles de curry`, `feuille de curry`, `feuille de Murraya`, `Murraya koenigii`, `caloupilé`, or `kaloupilé`. The bundle therefore creates no recipe demand or recipe link for this review.

## Sources

All online sources below were checked on 2026-10-16. Existing WP06 and R282 source records are identified as such; no shared research-ledger source records are requested by this proposal.

1. **TERMIUM Plus, Government of Canada Translation Bureau, “curry leaf,” Record 17 (2012-02-16), spices and condiments.** [Terminology record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=7&i=&index=enb&lang=eng&sg_kp_wet=1530667&srchtxt=SEASONING). Identifies `curry leaf` as an ISO-standardized English term; lists French `feuille de cari`, `feuille de curry`, `feuille de Murraya` (ISO-standardized), and `feuille de caloupilé`; says those terms apply to whole and ground forms; ties the spice to *Murraya koenigii*; limits `feuille de caloupilé` to Réunion usage.
2. **Office québécois de la langue française, GDT, “cari.”** [OQLF entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8355168/cari). Defines a blend of spices and lists `cari`, `carry`, `cary`, and `curry` as acceptable Québec terms for that blend; it is not a curry-leaf entry.
3. **Tourisme Montréal, “MTLàTABLE 2026 : les 10 adresses incontournables du Cuisinomane.”** [Current Montréal usage](https://www.mtl.org/fr/experience/recos-cuisinomane-mtlatable). Describes Café Rutba’s curry as “aromatisé à la feuille de cari.” This is local editorial wording, not a terminology standard.
4. **La Moisson, “Feuille de Cari Entière Bio.”** [Québec retail listing](https://lamoisson.com/products/feuilles-de-cari-entieres-bio). The current product title uses singular `Feuille de Cari`; its description and ingredients use `feuilles de cari` for whole culinary leaves. The Québec retailer identifies a 6 g Cha’s Organics product.
5. **Well.ca, “Cha’s Organics Curry Leaf Whole.”** [Canadian French product listing](https://well.ca/fr/produits/chas-organics-curry-leaf-whole_140106.html). The French page calls the whole culinary product `feuille de curry entière` and describes its use in South Indian and Sri Lankan curries. This supports the synonym, not a new form or universal preparation.
6. **DoorDash, Thanjai Restaurant, Montréal.** [Current restaurant menu](https://www.doordash.com/fr-CA/store/thanjai-restaurant-montr-al-630024). Its French menu description uses `feuilles de curry` for the curry-leaf ingredient in South Indian dishes. Menu localization can be platform-translated, so this is usage evidence rather than a language authority.
7. **Les Diététistes du Canada, “Mois de la nutrition 2021,” French recipe booklet hosted by Cégep André-Laurendeau.** [Recipe PDF](https://claurendeau.qc.ca/app/uploads/2021/02/NM2021-Recipe-ebook-French.pdf), p. 9. A Tamil-style eggplant curry recipe supplied by clinical dietitian Piraveena Piremathasan uses `feuilles de cari` as a leaf ingredient, distinct in the same recipe from `cari` as the prepared dish.
8. **India Spices Board, “Curry Leaf” (existing WP06 source `WP06-SA-20261010-S06`).** [Spice profile](https://indianspices.com/spice-catalog/curry-leaf.html). Existing identity evidence identifies *Murraya koenigii*, commercial part `leaf`, French `feuilles de cari`, and regional Indian terms. WP06’s identity decision and exclusion of regional-language aliases remain in force.
9. **Health Canada / PMRA, “Limites maximales de résidus fixées EMRL2008-02” (existing R282 source).** [French report PDF](https://publications.gc.ca/collections/collection_2008/pmra-arla/H113-29-2008-2F.pdf), p. 8. Lists `feuilles de cari fraîches` and `feuilles de cari séchées`; R282 used it for state wording, not current marketplace prevalence or a measure.
10. **Épices de Cru, “Feuilles de cari” (existing R282 source `WP03-DRIED-CURRY-LEAVES-20261016-S01`).** [Montréal product page](https://epicesdecru.com/fr-ca/boutique/epices/feuilles-de-cari-entieres). The current product heading uses `Feuilles de cari` and its “other names” list includes `caloupilé`; that single seller listing does not outweigh TERMIUM’s note that `feuille de caloupilé` is used in Réunion.

## Internal records consulted

- [WP06 South Asian identity integration](../batches/wp06-south-asian-identities-integration-20261010/README.md) and [WP06 Section K follow-up](wp06-south-asian-cuisine-gap-sweep-20261010.md): existing identity, no regional-language aliases, Québec review previously open.
- [WP03 Section K R282 dried-form review](wp03-section-k-curry-leaves-dried-form-review-20261016.md) and [R281–R283 integration](../batches/wp02-wp03-wp04-r281-r283-gap-review-integration-20261016/README.md): the current dried form, its scope, and its integration status.
- [Global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), WP03 Section K: broader leaf/wrapper parent remains open while the R282 curry-leaf form child is complete.

No software tests or builds were run during proposal research. Root integration updated only the existing reference aliases, existing dried-form search terms, source ledger, plan, roadmap, proposal status, and integration record.

## Integration

Integrated by the root coordinator in [`wp03-section-k-curry-leaf-quebec-alias-integration-r347-20261016`](../batches/wp03-section-k-curry-leaf-quebec-alias-integration-r347-20261016/README.md). The existing identity keeps its `curry leaves / feuilles de cari` display. TERMIUM-backed singular/plural terms were added as phrase-level search aliases, and the R282 dried form gained corresponding exact terms for its form hint. Bare `cari`/`curry`, Réunion-scoped `feuille de caloupilé`, measurement behavior, and the broader Section K scope remain unchanged.
