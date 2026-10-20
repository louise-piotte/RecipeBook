# WP03 Section U — coriander-root identity review (R888)

**Status at drafting:** Proposal only. Root later integrated the accepted identity-only row; see the R887–R889 integration README for the shared changes and validation.

**Reviewed:** 2026-10-19

**Plan anchors:** [Section U, fresh herbs and botanical aromatics](../../RecipeBook-global-ingredient-catalog-plan.txt#L9880); the broader open terminology item to [review coriander leaves/seeds and other ambiguous terms](../../RecipeBook-global-ingredient-catalog-plan.txt#L11257). The integrated packet status is in the [catalog workflow](../ingredient-catalog-workflow.md#L3420).

## Recommendation

Add one identity-only `HERB` reference for **coriander roots / racines de coriandre**, scoped to culinary roots of *Coriandrum sativum*. The catalog already separates its leafy herb and seed spice; the culinary root part has no identity. This closes one generic plant-part gap; it does not represent a brand, product line, flavour, SKU, or retailer variation.

Keep the new identity separate from cilantro leaves (`ingredient-ref-cilantro`), coriander / ground coriander (`ingredient-ref-coriander`), coriander seed (`ingredient-ref-coriander-seed`), Vietnamese coriander (*Persicaria odorata*), and culantro / long coriander (*Eryngium foetidum*). Do not assign bare `coriander`, `coriandre`, or `cilantro` to the root: each is broad or already owned. The proposed names identify the root part directly.

The OQLF's *coriandre* entry identifies *C. sativum*, distinguishes the leaves from fruits and seeds, and notes that English `cilantro` usually denotes the leafy part. University of Wisconsin–Madison Extension independently documents culinary use of the roots in Thai and Vietnamese cooking. A Télé-Québec recipe uses the French phrase `racines de coriandre` as a separate recipe ingredient. Together, these sources support the species, plant-part scope, and bilingual display wording; the local recipe's amount stays specific to that recipe. [S01–S03]

## Identity and name boundary

| Term | Proposed treatment | Evidence and limit |
|---|---|---|
| `coriander roots` | English display | UW Extension identifies the root as a culinary part of *C. sativum*; the display names the part and plant. |
| `racines de coriandre` | French display | Attested as a culinary ingredient phrase by Télé-Québec. No exact OQLF entry for this compound was found; it is presented as Québec recipe wording, not a separately standardized term. |
| `coriander root`, `cilantro root`, `cilantro roots` | English aliases | Singular/plural and source-used English wording for the same species-part identity. Do not add the unqualified leaf name `cilantro`. |
| `racine de coriandre` | French alias | Singular form of the source-attested French part phrase. Do not add bare `coriandre` or `coriandre fraîche`. |
| *Coriandrum sativum* | Identity evidence only | OQLF and UW Extension support the species. Do not add the botanical name as a picker alias. |
| Leaves, stems, seeds, and unrelated “corianders” | Keep separate | Do not include cilantro leaves, coriander fruits/seeds, detached stems, Vietnamese coriander, or culantro. A recipe that uses a root with attached stem does not broaden the proposed identity to stems. |

The proposed scope is the culinary root part of correctly identified *Coriandrum sativum*. No fresh/dried state, attached-stem allowance, cultivar, preparation, or general culinary behaviour is encoded. Do not transfer leaf or seed measurements, preparation advice, safety claims, or substitutions to the root.

## Exact proposed data

If accepted, add one identity-only reference:

```json
{
  "id": "ingredient-ref-coriander-root",
  "nameFr": "racines de coriandre",
  "nameEn": "coriander roots",
  "aliasesFr": ["racine de coriandre"],
  "aliasesEn": ["coriander root", "cilantro root", "cilantro roots"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "HERB"
}
```

Record identity evidence on the new ledger record if integrated. Set identity state to verified for this bounded species/part identity; leave measurement and substitution research `not_yet_researched`. Add no forms, measurements, household measures, density, unit mappings, package yields, conversions, substitutions, or recipe links. The sources provide no transferable root amount or conversion.

## Source register

Source IDs are local to this proposal and were checked against the shared ledger and catalog archive before drafting.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-U-CORIANDER-ROOT-R888-20261019-S01` | Office québécois de la langue française, [GDT: *coriandre*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870080/coriandre), updated 2016; accessed 2026-10-19. | Identifies *Coriandrum sativum*, preferred French `coriandre`, English `coriander` and Canadian `cilantro`, and culinary use of leaves, fruits, and seeds. It notes that `cilantro` more often refers to the leafy part. It does not discuss the root or establish the exact compound `racines de coriandre`. `sourceKind: regional_authority`. |
| `WP03-U-CORIANDER-ROOT-R888-20261019-S02` | University of Wisconsin–Madison Division of Extension, [Cilantro / Coriander, *Coriandrum sativum*](https://hort.extension.wisc.edu/articles/cilantro-coriander-coriandrum-sativum/), revised 2026-09; accessed 2026-10-19. | The page distinguishes leaves as cilantro and seeds as the spice coriander, then states that cilantro roots are used in Thai and Vietnamese cooking and describes harvesting roots. It supports culinary use and species/part boundaries, not Québec French terminology, Québec retail availability, a standardized form, measure, or universal use. Crop-growing instructions and any quantities are not transferred. `sourceKind: extension`. |
| `WP03-U-CORIANDER-ROOT-R888-20261019-S03` | Télé-Québec, Cuisinez, [Ragoût de porc aux œufs (Kai palo)](https://cuisinez.telequebec.tv/recettes/6449/ragout-de-porc-aux-ufs-kai-palo), accessed 2026-10-19. | A Québec recipe lists `5 racines de coriandre` and directs the cook to crush them with garlic and white pepper. This supports local French culinary wording and a distinct ingredient role in this recipe. The five-root quantity and preparation belong to this recipe only; they do not establish a general amount, form, or preparation rule. `sourceKind: culinary_reference`. |

No manufacturer or retailer evidence was needed. No product-specific measurements or claims are generalized. Any queued work whose only outcome is a brand, product-line, flavour-family, SKU, or retailer-variant roster is out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and their scoped evidence remain preserved.

## Ownership, form, ledger, recipe, and picker checks

Read-only snapshot of the shared package and evidence files on 2026-10-19:

| Artifact | Current size | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,915 references | `36edc625a3ad0123f3401c91760b58cca522ef834d73cd58fc9f90ad0721d525` |
| `ingredient-forms.v1.json` | 201 forms | `5784488eba2effc1e99e29e4ab3f3143256a25c6cb327344099e045c1b85cf0e` |
| `legacy-import-identities.v1.json` | 56 candidates | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,319 records | `44d01d6d19322f8194f5b9068a20d23a9ff6fa17bb30bf26aafe5529ec8ad57d` |
| Manifest-listed bundled recipes | 114 files / 1,123 ingredient rows | Read-only corpus scan below |

**Identity ownership.** The active references include `ingredient-ref-cilantro` (`cilantro / coriandre fraîche`), `ingredient-ref-coriander` (`coriander / coriandre moulue`), `ingredient-ref-coriander-seed` (`coriander seed / graines de coriandre`), and `ingredient-ref-vietnamese-coriander` (`Vietnamese coriander / coriandre vietnamienne`). Their displays are unchanged. Exact normalized-name and alias checks found no active owner for `coriander root(s)`, `cilantro root(s)`, `racine(s) de coriandre`, or `ingredient-ref-coriander-root`. No matching owner was found in proposal or batch archives; the R888 proposal path and source-ID prefix were unused.

**Forms.** No active form or form match term names coriander/cilantro roots. The existing cilantro, coriander, coriander-seed, and Vietnamese-coriander rows have no forms. The new row is an identity for a distinct edible part, not a preparation form under the leaf identity.

**Legacy candidates.** The legacy list has 56 candidates. The only nearby candidate is unreviewed `ingredient-ref-ground-coriander` (`ground coriander / coriandre moulue`); it does not identify roots. No root candidate is present, and this proposal does not alter the legacy list.

**Ledger and source ownership.** There is no root record or matching source/decision text in the ledger. The current cilantro, coriander, and coriander-seed records are unreviewed with no sources or decisions. The proposed R888 source IDs and cited source URLs were not already assigned to another ledger record at the time of this check.

**Bundled recipes.** All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for `coriander root(s)`, `cilantro root(s)`, `racine(s) de coriandre`, and the Thai transliterations `raak pakchi` / `rak pak chi`. There were zero matching files and zero matching ingredient rows. The corpus does contain separate leaf and seed wording; it supplies no root recipe link. This is a statement about the current bundled corpus only, not about culinary use elsewhere.

**Picker projection.** The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accents and punctuation are folded for lookup, complete word phrases take priority, and substring matching is the fallback. Proposed aliases are included in the projection; no software test was run.

| Query | Current result | With proposal |
|---|---|---|
| `coriander roots`; `coriander root` | No result | `ingredient-ref-coriander-root` only |
| `cilantro roots`; `cilantro root` | No result | `ingredient-ref-coriander-root` only |
| `racines de coriandre`; `racine de coriandre` | No result | `ingredient-ref-coriander-root` only |
| `coriander` | Ground-coriander reference, coriander-seed reference, Vietnamese-coriander reference | Those three plus `ingredient-ref-coriander-root` |
| `coriandre` | Cilantro, ground-coriander, coriander-seed, and Vietnamese-coriander references | Those four plus `ingredient-ref-coriander-root` |
| `cilantro` | `ingredient-ref-cilantro` | `ingredient-ref-cilantro` plus `ingredient-ref-coriander-root` |
| `coriandre fraîche`; `coriandre moulue`; `graines de coriandre`; `Vietnamese coriander` | Each remains on its existing respective identity | Unchanged |

The broad `coriander`, `coriandre`, and `cilantro` queries remain visibly multi-result, consistent with the distinct plant parts and species represented. Part-qualified searches remain specific.

## Limitations and completion state

- The French display uses Québec recipe wording; OQLF supports the base plant name and species, not this exact part-qualified phrase. Keep the compound descriptive rather than claiming OQLF standardization.
- The external recipe's five-root amount is source-specific and remains inactive. No portion, density, conversion, form, substitution, or preparation rule follows from this proposal.
- The proposal is identity-only and records no direct bundled-recipe demand. Lack of a current recipe hit does not erase the generic edible-part evidence.
- The scope is *Coriandrum sativum* roots. It excludes leaves, seeds, stems, Vietnamese coriander, culantro, and other similarly named plants.
- No commercial-product roster work was pursued. If any queue item asks only for brand, line, flavour, SKU, or retailer variation, close that item as out of scope: commercial-product counts do not add ingredient diversity.

**Recommended delta if integrated:** one identity-only `HERB` reference, `ingredient-ref-coriander-root`, with English `coriander roots`, French `racines de coriandre`, the scoped root aliases above, null density, and no unit mappings. No forms, measurements, recipe links, conversions, yields, or substitutions.

**At drafting:** this proposal file only. Root later integrated the accepted database JSON data and related documentation. No software tests, build, emulator, or deployment were run under the database-JSON exception in `AGENTS.md`.
