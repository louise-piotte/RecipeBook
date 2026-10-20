# WP03 Section K — glasswort / salicorne identity and pickled form review (R937)

- **Reviewed:** 2026-10-19
- **Status:** Research proposal accepted and integrated on 2026-10-19. The proposal author made no shared-data changes; the accepted integration is documented in the [R936–R938 README](../batches/wp02-wp03-wp04-r936-r938-generic-gap-integration-20261019/README.md). No software tests were run because the integrated change only adds database JSON under `AGENTS.md`.
- **Scope:** one generic culinary plant identity for glasswort / salicorne, plus its source-supported pickled form. No brand, product line, flavour, SKU, retailer-variant, or commercial-product roster was researched.
- **Recommendation:** add an identity-only reference for culinary *Salicornia*, with the visible English name **glasswort (Salicornia)** and Québec French display **salicorne**. Add one generic **pickled glasswort / salicorne marinée** form. Keep it a flowering halophyte, not a seaweed or algae identity. Do not infer that all wild plants called samphire or glasswort are food-safe.

## Open Section K anchor

This proposal addresses the unchecked plan item:

> [ ] Other regional greens and shoots discovered in the independent sweeps.

The OQLF recognizes **salicorne** as a Québec plant and food term, describes culinary use, and places the term at the *Salicornia* genus. A Canada Water Agency regional project identifies *Salicornia europaea* as an edible coastal plant used in regional food preparation. This adds a generic plant-food identity to the regional sweep; it does not expand a commercial product roster or the seaweed category.

The active Section N entry concerns marine algae. Salicorne is a salt-tolerant flowering plant, so it must remain separate from nori, kombu, wakame, dulse, arame, sea lettuce, Irish moss, and kelp. Its coastal habitat alone does not make it seaweed.

## Identity and naming evidence

The OQLF entry places **salicorne** in both botanical and food domains, defines it as a coastal halophyte used in cooking, identifies the genus as *Salicornia*, and notes its presence along the saline St. Lawrence and in the Îles-de-la-Madeleine. It lists **Salicornia** as an English term, and records **glasswort** among associated English common terms. It also lists **samphire**, **sea bean**, and **sea asparagus** as terms, but these are not proposed as aliases: the shorter names are less discriminating, and some overlap with other plants or established ingredient rows. [S01]

The Canada Water Agency describes *Salicornia europaea* as an edible coastal plant and notes culinary institutions' use of these plants in regional dishes. Health Canada's determination list separately records *Salicornia europaea*, whole or minimally processed, as having a history of safe use as food. These sources support a culinary identity while bounding the taxonomic claim: they do not certify every wild plant or every *Salicornia* species as edible. [S02–S03]

Use a qualified English display to keep the botanical scope visible. Do not assign the bare aliases **samphire**, **sea asparagus**, **sea bean(s)**, or **pickleweed**. Kew and the Royal Horticultural Society also apply **samphire** to *Crithmum maritimum* (rock samphire), so the unqualified term can cross taxonomic boundaries. Do not add French **asperge de mer** as an alias: OQLF marks it as a vernacular name, and it would overlap the existing asparagus identity. [S01, S04, S09]

| Field | Proposed value |
|---|---|
| id | **ingredient-ref-glasswort** |
| nameEn | **glasswort (Salicornia)** |
| nameFr | **salicorne** |
| aliasesEn | **empty** |
| aliasesFr | **Salicornia** |
| defaultDensity | **null** |
| unitMappings | **empty** |
| category | **VEGETABLE_AND_AROMATIC** |

The French binomial search alias is language-neutral taxonomy, not a French common-name claim. Do not add broad vernacular aliases or imply that botanical identification and food-safety equivalence follow from the ingredient row.

## Pickled form

Propose one pickled form under the generic identity:

```json
{
  "id": "ingredient-form-glasswort-pickled",
  "ingredientRefId": "ingredient-ref-glasswort",
  "formCode": "pickled",
  "labelFr": "salicorne marinée",
  "labelEn": "pickled glasswort (Salicornia)",
  "prepState": "pickled",
  "matchTermsFr": ["salicorne marinée"],
  "matchTermsEn": ["pickled glasswort"],
  "densityGPerMl": null
}
```

Racines boréales describes Québec-grown fresh salicorne as a condiment that can be marinated for preservation; it gives brief blanching or raw finishing uses. A separate Québec maker's salicorne-marinade listing names salicorne, water, and apple-cider vinegar. Together these sources support the generic preservation state, not a single mandatory recipe, brine strength, product formulation, or shelf life. The maker's 190 mL jar is a package-format observation only. Do not infer a mass, density, drained yield, or conversion from it. [S05–S06]

Do not add a fresh, blanched, frozen, dried, powdered, extract, or salt-substitute form. Raw and briefly blanched uses in the producer guidance do not establish a recipe-demand form, conversion, or generic preparation instruction. The salt-substitute study below concerns a freeze-dried extract in a formulated nachos-base test, not a household powdered-plant form. [S05, S07]

## Current catalog, ledger, and recipe ownership

I checked active references and forms, all research-ledger records, prior proposals and the manifest recipe corpus. The current package has **1,955 ingredient references, 204 forms, 2,359 research-ledger records, and 114 recipes / 1,123 ingredient rows**.

| Area | Current finding | Proposal effect |
|---|---|---|
| Active references | No row owns **salicorne**, **Salicornia**, **glasswort**, **samphire**, **sea bean(s)**, **sea asparagus**, or **pickleweed**. No alias collision exists for the proposed bilingual display or exact botanical search. | Propose one qualified generic identity. Keep broader English names inactive; preserve all existing rows. |
| Active forms | No salicorne/glasswort reference or form exists, and no active form is proposed for this taxon. | Add only the pickled form supported by more than one Québec culinary source. |
| Research ledger | No reference or candidate record owns the proposed ID, common names, or taxon. R937 source IDs are unused. | If accepted, create a new identity record; do not rewrite another plant, salt, or seaweed record. |
| Prior work | The open Section K regional greens/shoots item does not name salicorne; searches of earlier WP03 proposals and plan history found no salicorne decision or hold. | This is a distinct plant-food gap. Do not reopen held sea grapes, kelp, aonori, or other seaweed boundaries. |
| Recipe corpus | Scanning all 114 recipe JSON files and 1,123 ingredient rows found no salicorne/glasswort, *Salicornia*, samphire, or proposed-alias demand. | Add no bundled recipe link or line substitution. |

No queued WP03 task in this plant-food scope requests a brand or commercial-product roster. Across ingredient categories, any roster-only item remains out of scope because commercial-product counts do not add ingredient diversity. Preserve all existing branded rows and keep any product-only evidence attached to its source.

## Measurement and density

No reusable kitchen mass, volume portion, density, unit mapping, or yield is supported by the sources reviewed. Keep `defaultDensity` and the form density null, with no unit mappings.

The reported quantities are all scoped observations, not generic conversions:

- Racines boréales' fresh-product page states **100 g** in that listing title/package. That value remains specific to the cited product listing. [S05]
- A Le Monde recipe uses **50 g fresh salicorne** in one four-person tomato salad, then describes it as a topping. The amount belongs to that recipe and does not define a serving or cup measure. [S08]
- The Québec marinated product is sold in a **190 mL** jar. It provides no net mass or drained mass; do not turn its jar volume into density or a generic package unit. [S06]

The integrated ledger sets `measurementState` to **researched_no_supported_value** for reusable measures and records the three scoped observations without activating mappings.

## Substitution evidence

No global ingredient substitute is supported. Le Monde says fresh salicorne on that particular tomato salad can be replaced in the garnish role by purslane or another seasonal herb. Keep that as a single dish-role source observation; do not add an active contextual rule without a matching recipe context and enforcement scope. [S08]

A 2024 *Food Chemistry* study tested **freeze-dried samphire extract** in a nachos-base formulation. Its reported result is limited to that extract and controlled snack-product comparison. It does not establish fresh salicorne as a table-salt replacement, a household replacement ratio, or a generic substitute for another vegetable. Do not add an active salt substitution, and do not transfer the extract's results or analysis values to fresh or pickled salicorne. [S07]

The integrated ledger sets `substitutionResearchState` to **researched_supported** for the source-bounded tomato-salad garnish alternative. It records purslane only as a source-specific contextual finding; no active global or contextual substitution rule or replacement ratio is added.

## Source register

| ID | Source | Evidence and limits |
|---|---|---|
| **WP03-SECTION-K-GLASSWORT-R937-S01** | OQLF, [salicorne (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18057530/salicorne) | Québec French term and food domain; defines the culinary coastal plant at the *Salicornia* genus and gives English/associated names. It does not settle species-level foraging identification or measures. |
| **WP03-SECTION-K-GLASSWORT-R937-S02** | Canada Water Agency, [Saint-Lawrence Community Interaction Program projects](https://www.canada.ca/fr/agence-eau-canada/financement/projets-finances/saint-laurent.html) | Identifies *Salicornia europaea* as an edible coastal plant and describes regional culinary interest. This is species-bounded regional evidence, not a general statement for every wild plant. |
| **WP03-SECTION-K-GLASSWORT-R937-S03** | Health Canada, [List of determinations of non-novel foods and food ingredients](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html/1000?wbdisable=true) | Lists whole or minimally processed *Salicornia europaea* as having a history of safe use as food. This status entry is not foraging advice or kitchen-measure evidence. |
| **WP03-SECTION-K-GLASSWORT-R937-S04** | Kew, [*Crithmum maritimum*](https://powo.science.kew.org/taxon/urn%3Alsid%3Aipni.org%3Anames%3A840827-1/general-information) | Confirms that **samphire** also names *Crithmum maritimum*, supporting exclusion of unqualified `samphire` from the proposed aliases. Taxonomy only. |
| **WP03-SECTION-K-GLASSWORT-R937-S05** | Racines boréales, [Salicorne fraîche 100 g](https://racinesboreales.ca/products/salicorne-fraiche-100-g) | Québec producer page describes salicorne as a condiment and says it may be marinated; use raw or briefly blanched is source wording. Its 100 g package/listing quantity is not generalized. |
| **WP03-SECTION-K-GLASSWORT-R937-S06** | Gourmet Sauvage, [Salicorne marinée](https://gourmetsauvage.ca/epicerie-fine/marinades-condiments/p/salicorne-marinee/) | Québec maker lists salicorne, water, and cider vinegar and describes culinary uses. The 190 mL jar, exact ingredients, producer, and listed serving suggestions remain product-scoped. |
| **WP03-SECTION-K-GLASSWORT-R937-S07** | Sood et al., [Can samphire be the new salt?](https://pubmed.ncbi.nlm.nih.gov/38011793/), *Food Chemistry* (2024) | Primary study tested freeze-dried samphire extract in a nachos-base formulation. The reported formulation and sensory result do not establish a general fresh-ingredient substitution. |
| **WP03-SECTION-K-GLASSWORT-R937-S08** | Le Monde, [Tomato salad with fresh salicorne](https://www.lemonde.fr/les-recettes-du-monde/article/2025/07/18/la-salade-de-l-ete-ukrainienne-la-recette-de-nika-lozovska_6622021_5324493.html) | One four-person recipe uses 50 g fresh salicorne. Its instructions list purslane or other seasonal herbs for the same salad-garnish role. Keep its amount and alternative source-scoped. |
| **WP03-SECTION-K-GLASSWORT-R937-S09** | Royal Horticultural Society, [*Crithmum maritimum*, rock samphire](https://www.rhs.org.uk/plants/24479/crithmum-maritimum/details) | Uses rock samphire for *Crithmum maritimum*, independently supporting exclusion of unqualified `samphire`. Taxonomy only. |

## Disposition summary

The integration adds one generic **glasswort (Salicornia) / salicorne** identity with a single **pickled glasswort / salicorne marinée** form. The bilingual name is grounded in OQLF and Canadian regional food sources; the pickled form is supported by independent Québec producer evidence. Keep the taxon qualified and do not imply that every wild specimen is suitable for food. The product's 100 g listing, the 190 mL jar, the 50 g recipe amount, the salt-extract experiment, and the tomato-garnish alternative stay tied to their source contexts. Add no density, unit mapping, recipe link, general measure, conversion, yield, or active substitution.
