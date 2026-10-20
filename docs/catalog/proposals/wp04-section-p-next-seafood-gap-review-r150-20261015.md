# WP04 Section P — seal meat / viande de phoque market identity review (R150)

- **Reviewed / sources accessed:** 2026-10-15.
- **Recommendation:** Add identity-only `seal meat / viande de phoque` as `ingredient-ref-seal-meat`, category `PROTEIN`, with French alias `viande de loup-marin` and no English aliases.
- **Identity scope:** A generic food-market name for seal meat as an ingredient. This is not a species identity. No taxon, product source, harvest status, legal eligibility, or regulatory compliance is assigned to an unqualified seller listing.
- **Review status:** This was proposal-only when drafted. The parent task has since integrated the seal-meat reference and ledger record in R150; this proposal did not edit shared data. See the R150 integration README. No tests or app checks were run.
- **Source IDs:** `WP04-SECTIONP-SEAL-MEAT-R150-20261015-S01` through `S06`; these are now allocated to the R150 ledger record. No collision existed before drafting.

## Why this is the next unfinished candidate

The active WP04 Section P work remains open after the R149 gap review integrated smoked haddock. Seal meat is a separate WP06 North American cuisine candidate routed to WP04; that sweep did not allocate an identity. The WP04 Section O regional-protein benchmark is also distinct: it audited terrestrial recipe demand and found “seal” only as a verb in six instructions, not as a food request. It did not review the fish/seafood market identity.

No dedicated seal-meat proposal, hold, integration, active reference, form, legacy candidate, or identity ledger record was found. R149 smoked haddock and R148 shrimp balls are already integrated, different product identities. This review does not reopen them or any existing Section P fish, seafood, or preserved-product decision. See the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt), the [R149 integration](../batches/wp02-wp03-wp04-r149-gap-review-integration-20261015/README.md), the [WP06 candidate sweep](wp06-north-american-cuisine-gap-sweep-20261009.md), and the [WP04 Section O benchmark](wp04-section-o-regionally-specific-protein-benchmark-gap-review-20261012.md).

## Product name and species boundary

The CFIA human-food seal-products page uses **seal** as the common product name. Its Fresh and Frozen Seal Standard is scoped to fresh, frozen, defrosted, or minced seal from harp, hooded, or grey seals, and says the name may be qualified by species or presentation. This is evidence for a seal-meat product name and for keeping distinct presentations clearly named. It does not identify the species in any seller's unqualified product listing, establish that a particular item meets the standard, or support a current legal-eligibility claim. The page footer says it was modified in 2019; it is used here as product-nomenclature context only. [S01]

OQLF's preferred Québec zoological term is **phoque**, paired with English **seal**. Its entry describes an animal group rather than meat or a particular species, and it notes that English *seal* can be broader than *phoque*. This supports the French animal word but is not, by itself, a food-product naming rule. [S02]

OQLF's separate **phoque commun** entry says that *loup-marin* was used for the common seal (*Phoca vitulina*) and marks that zoological usage as dated. I do not use that entry to create a bare `loup-marin` alias or assign a species to this market identity. [S03]

Current Québec food-market sources independently use *loup-marin* for meat products. Boucherie Côte à Côte places `filet de loup-marin` and other loup-marin cuts in its “Viande” section, apart from charcuteries and prepared dishes. Its page has an older copyright footer, so it is supporting evidence rather than the sole current listing. A current Capone Gourmet Québec meat collection lists `Filet mignon de loup-marin des Iles`; its listing also includes separately named sausage and ground-meat products. Canadian Seal Products, an industry directory rather than a naming authority, says that Québec restaurant menus often use *loup-marin* for *viande de phoque*. Taken together, these sources support the exact phrase alias **viande de loup-marin** as a contemporary market usage for meat. They do not make bare *loup-marin* a generic zoological synonym, establish an overall prevalence rate, or identify the taxon of every product. [S04, S05, S06]

Accordingly, the proposed record is a market product identity, not a taxonomic row. Its canonical French display remains **viande de phoque**; the only French alias is the phrase **viande de loup-marin**, supported by current food-market usage. No bare `loup-marin` alias or scientific name is added. The record does not infer harp, hooded, grey, common, or any other seal species. It does not include rendered seal fat or oil, distinct organs, or separately named prepared products such as sausage, pâté, jerky, confit, or smoked items. No form or prepared-product identity is proposed here.

## Exact ownership and picker projection

At review time, the read-only ownership audit checked all **1,514** reference names and aliases, all **119** form labels and match terms, **61** legacy identities, and **1,859** ledger records. It found no exact normalized owner for `seal meat`, `viande de phoque`, or `viande de loup-marin`, and the prospective reference and ledger IDs were unallocated. The archive search found only the WP06 candidate sweep and Section O recipe benchmark above, not a prior identity decision. The source IDs were then absent from the ledger; R150 has since allocated them to the new reference record.

The picker indexes bilingual names, aliases, and form terms; complete normalized word phrases take priority, with substring fallback if there is no phrase match ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). The projection below mirrors that behavior against the current references and forms, then adds the hypothetical row. The short English and French words will match inside the proposed full display/alias, but no bare `seal`, `phoque`, or `loup-marin` alias is stored. Search results still display the full product label `seal meat / viande de phoque`, keeping the market scope visible.

| Query | Current results | With proposed row | Projection note |
|---|---|---|---|
| `seal meat` | None | Seal meat / viande de phoque only | Full English product phrase. |
| `viande de phoque` | None | Seal meat / viande de phoque only | Full Québec French product phrase. |
| `viande de loup-marin` | None | Seal meat / viande de phoque only | Exact French market alias; contemporary Québec food-market usage, not an OQLF species mapping. |
| `seal`, `phoque`, `loup-marin` | None | Seal meat / viande de phoque only | These broader queries match a word within the full display or alias; they are not separately stored aliases. The result remains the full market-product label, not a species choice. |
| `seal oil`, `huile de phoque` | None | None | Rendered oil remains outside this identity. |

## Bundled recipe demand

The manifest-listed bundle has **114 recipe files and 1,123 ingredient rows**. A case-insensitive scan of the complete ingredient-row objects found no matches for `seal`, `seal meat`, `phoque`, `viande de phoque`, or `loup-marin`; there is no matching recipe row or link. The earlier Section O full-text scan separately found six uses of `seal` as the verb for closing a sous-vide bag and no food-name use. No recipe link or source-level recipe claim is proposed.

## Forms, measures, and substitutions

- **Forms:** Add none. The market sources distinguish cuts and several processed products, but do not establish a single reusable preparation/storage form for this identity.
- **Measurements:** Use `defaultDensity: null` and `unitMappings: []`. Seller package and cut details are product-specific and do not establish a household measure, per-piece mass, density, or yield.
- **Substitutions:** Add no global or contextual substitution, recipe-line link, warning, or replacement amount. The sources establish product naming, not cooking equivalence or recipe replacement.

## Proposed reference delta

```json
{
  "id": "ingredient-ref-seal-meat",
  "nameEn": "seal meat",
  "nameFr": "viande de phoque",
  "aliasesEn": [],
  "aliasesFr": ["viande de loup-marin"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

No form, measurement observation, conversion, yield, recipe link, or substitution record is proposed.

## Proposed ledger delta

```json
{
  "recordId": "ingredient-ref-seal-meat",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-SEAL-MEAT-R150-20261015-S01",
      "url": "https://inspection.canada.ca/en/exporting-food-plants-animals/food-exports/food-specific-export-requirements/code-practice",
      "title": "Canadian Food Inspection Agency, Code of Practice for the Harvest, Transport, Processing, and Export of Seal Products Intended for Human Consumption",
      "versionOrDate": "Page modified 2019-01-28; accessed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Appendix VII, Sections 2–4: standard scope, product common name, and presentation naming.",
      "supports": "The page's Fresh and Frozen Seal Standard scopes fresh, frozen, defrosted, and minced seal to harp, hooded, and grey seals; it names the product common name as seal and allows qualification by species or presentation. Used here only to support the market-level product noun and to avoid inferring a species or presentation from an unqualified listing. It does not establish legal eligibility, source compliance, or the species of any current seller item.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEAL-MEAT-R150-20261015-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17073257/phoque",
      "title": "Office québécois de la langue française, phoque (GDT)",
      "versionOrDate": "Updated 2018; accessed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Preferred French term, English equivalent, and note distinguishing phoque from otarie.",
      "supports": "Identifies phoque as the preferred French animal term and seal as its English equivalent, while noting that English seal can be used more broadly. Terminology evidence only; the entry is zoological and does not itself define a meat product or assign the proposed identity to a species.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEAL-MEAT-R150-20261015-S03",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870664/phoque-commun",
      "title": "Office québécois de la langue française, phoque commun (GDT)",
      "versionOrDate": "Updated 2005; accessed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Termes utilisés dans certains contextes and note on loup-marin / loup marin.",
      "supports": "Says loup-marin was used for phoque commun (Phoca vitulina) and labels that zoological usage dated. This is a boundary against treating bare loup-marin as a generic species alias; it does not define the current food-market phrase viande de loup-marin.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SEAL-MEAT-R150-20261015-S04",
      "url": "https://www.boucheriecoteacote.ca/loup-marin",
      "title": "Boucherie spécialisée Côte à Côte, Loup-marin product page",
      "versionOrDate": "Seller page retrieved 2026-10-15; page footer copyright 2019",
      "accessedOn": "2026-10-15",
      "locator": "Sections Viande, Charcuteries, and Mets cuisinés; product headings include filet de loup-marin and viande de loup-marin.",
      "supports": "Uses loup-marin in the meat-market category and separately lists charcuteries and prepared dishes. Supports market usage, not a scientific species, common recipe form, or current stock guarantee. The page's older copyright footer limits its use as evidence of present-day stock.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-SEAL-MEAT-R150-20261015-S05",
      "url": "https://canadiansealproducts.com/fr/produits/viande-de-phoque-sauvage-canadienne/where-to-buy-seal-meat",
      "title": "Canadian Seal Products, Où acheter de la viande de phoque",
      "versionOrDate": "Current Québec product/distributor directory retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Québec distributor and retailer section; product listings and page statement that menus often use loup-marin for viande de phoque.",
      "supports": "Says that on Québec restaurant menus, viande de phoque often appears under the name loup-marin, and pairs the phrases elsewhere on the page. It is an industry directory, not a government naming authority, prevalence study, individual retailer stock feed, species identification, or legal-compliance finding.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-SEAL-MEAT-R150-20261015-S06",
      "url": "https://caponegourmet.com/collections/viandes-specialisees-capone-gourmet",
      "title": "Capone Gourmet, Wagyu & viandes d’exception collection",
      "versionOrDate": "Current Québec retailer collection retrieved 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Collection description's phrase viande de loup marin and current product listings for filet mignon de loup-marin des Iles, sausages, and ground-meat products.",
      "supports": "A Québec specialty retailer currently uses the normalized phrase viande de loup-marin for its market category and lists loup-marin meat products. The page supports the exact French market phrase and product-category presence only; no seller claim about species, origin, compliance, or product behavior is adopted, and the listing is not a stock guarantee.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only seal meat / viande de phoque as a generic food-market product identity, with the phrase viande de loup-marin as the only alias. OQLF's dated zoological use of bare loup-marin is not generalized; current Québec food-market listings support the meat phrase. Do not treat the record as a species identity or assign a taxon, source, harvest status, or legal eligibility to an unqualified listing. Keep oil/fat, distinct organs, and separately named prepared products outside this identity. No bundled recipe demand, reusable measure, conversion, yield, or supported substitution was found; add no form, measurement value, recipe link, or substitution rule."
    }
  ]
}
```

## Static checks

The proposal-only static review confirmed current reference/form/legacy/ledger counts, exact-key ownership and candidate-ID absence, source-ID non-collision, the picker query projection, and all manifest-listed recipe ingredient rows. No Gradle, unit, instrumentation, emulator, app, or deployment checks were run.
