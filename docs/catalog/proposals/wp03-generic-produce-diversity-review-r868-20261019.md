# WP03 Section K generic produce diversity review — celtuce — R868

**Status:** Accepted and integrated as `ingredient-ref-celtuce`; see the [R868 integration README](../batches/wp03-section-k-celtuce-identity-integration-r868-20261019/README.md).

**Reviewed:** 2026-10-19

**Plan anchors:** [Section K broader lettuce, leafy-green, and brassica sweep](../../RecipeBook-global-ingredient-catalog-plan.txt#L6501); the [other regional greens and shoots item](../../RecipeBook-global-ingredient-catalog-plan.txt#L6593) remains open as well.

## Recommendation

Add one identity-only generic produce reference for **celtuce / laitue asperge**, a lettuce crop primarily grown for its thick edible stem. Keep it distinct from ordinary lettuce, asparagus, celery, and other lettuce types. This is one generic culinary ingredient identity; it does not expand a cultivar, brand, product-line, flavor, or retailer-only roster.

The Office québécois de la langue française (OQLF) lists `laitue asperge` as its preferred French term and gives `celtuce`, `asparagus lettuce`, and `stem lettuce` as English terms. Ontario agriculture and UC Davis independently describe celtuce as a lettuce type used chiefly for its edible stem. The OQLF page is old, and the sources differ in how they discuss the leaves and botanical names; those boundaries are kept explicit below.

## Why this is an open generic gap

The Section K checklist has an open item to extend the lettuce and leafy-green sweep beyond the named identities. Celtuce is a named culinary crop with a distinct edible stem use, but the current catalog has no celtuce identity. It is not another review of R862 common purslane or R865 tomato pulp.

The live reference, form, legacy-candidate, and ledger audits below found no celtuce owner, and the bundled recipes contain no matching ingredient wording. This absence is specific to the current catalog and bundled recipe package; the proposal makes no claim that celtuce is unavailable in Québec or unused in other recipes.

No queued celtuce task was found that concerns a brand, product line, flavor, or retailer-only variant. The Section K Broccolini mention is an existing trademark alias exclusion, not a queued generic ingredient task; it remains out of scope. The broader queue review also found no open checklist item whose sole purpose is expanding a brand or product roster. No branded or retailer-specific variant research was pursued. See the [R861–R863 scope-queue review](../batches/wp02-wp03-wp04-r861-r863-generic-identity-integration-20261019/README.md#scope-queue-review).

## Bilingual names and identity boundary

| Term | Proposed treatment | Evidence and limit |
|---|---|---|
| `celtuce` | English display | OQLF English term; also the crop name used by OMAFRA and UC Davis. |
| `laitue asperge` | fr-CA display | OQLF preferred French term. OMAFRA’s French crop profile also uses `laitue-asperge`. OQLF’s page was last updated in 1991, so this is source-backed Québec terminology with an age limitation, not a claim of recent market frequency. |
| `asparagus lettuce`, `stem lettuce` | English aliases | Both are exact English terms listed by OQLF and used by OMAFRA. Keep their lexical overlap with plain asparagus/lettuce visible in the picker audit below. |
| `celery lettuce`, `laitue-céleri`, `laitue chinoise` | Do not add as aliases | OMAFRA lists these as additional names, but the English and French celery wording can misdirect a search to celery, while `laitue chinoise` is a broad regional descriptor. The proposed display and aliases suffice. |
| *Lactuca sativa* var. *asparagina*; *L. sativa* var. *angustana* | Evidence only; do not add as aliases or encode in the ID | OQLF and OMAFRA list both names, while UC Davis describes a celtuce type without adopting either varietal name. Do not make a single botanical rank a catalog requirement. |

OQLF’s historical note calls celtuce a cross of celery and lettuce. This proposal does not repeat that botanical claim: the more recent UC Davis description calls it a type of lettuce, and no cross-species or hybrid assertion is needed for this culinary identity. OMAFRA says the stem is normally used and that the leaves are less palatable; UC Davis says the leaves can also be eaten. The reference therefore covers the named celtuce crop, chiefly for its stem, without asserting that leaves are inedible or creating a separate leaf identity.

## Exact proposed data

### Active reference

```json
{
  "id": "ingredient-ref-celtuce",
  "nameEn": "celtuce",
  "nameFr": "laitue asperge",
  "aliasesEn": [
    "asparagus lettuce",
    "stem lettuce"
  ],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

This proposal is identity-only. Add no forms, preparation defaults, recipe links, measures, density, unit mappings, conversions, yields, or substitutions. OMAFRA’s crop production dates, temperatures, spacing, storage conditions, and harvest duration are agronomic/crop observations, not kitchen amounts or reusable ingredient measurements. If accepted, the ledger may record identity evidence only; leave measurement and substitution research `not_yet_researched`, with no measurement observations or substitution findings.

## Proposed research sources

The IDs below were proposal-local before coordinator review. R868 was accepted, and all four sources are now registered on the `ingredient-ref-celtuce` ledger record.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-K-CELTUCE-R868-20261019-S01` | Office québécois de la langue française, [GDT: *laitue asperge*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082775/laitue-asperge), accessed 2026-10-19. | Identifies the food-domain preferred French term `laitue asperge`, the English definition for a non-heading lettuce with a thick edible stem, and English terms `celtuce`, `asparagus lettuce`, and `stem lettuce`. The entry is dated 1991; its older Latin names and “cross” note are not adopted as current botanical conclusions. `sourceKind: regional_authority`. |
| `WP03-K-CELTUCE-R868-20261019-S02` | Ontario Ministry of Agriculture, Food and Rural Affairs, [Specialty Crops: Celtuce](https://omafra.gov.on.ca/CropOp/en/spec_veg/other_spec_veg/celt.html), last modified 2012-10-17; accessed 2026-10-19. | Treats celtuce as a specialty vegetable, lists `asparagus lettuce` and `stem lettuce`, and says the peeled stem is used raw, cooked, or stewed. It says the leaves are less palatable and typically unused. The same page contains crop-management values; none is converted into a kitchen measure or catalog form. `sourceKind: extension`. |
| `WP03-K-CELTUCE-R868-20261019-S03` | University of California, Davis, [Celtuce](https://plantbreeding.ucdavis.edu/celtuce), updated 2026-04-10; accessed 2026-10-19. | Describes celtuce as a type of lettuce consumed primarily for its stem and says leaves can also be eaten. Supports the crop identity and the non-exclusive stem boundary; does not set a botanical varietal name, amount, or conversion. `sourceKind: other`. |
| `WP03-K-CELTUCE-R868-20261019-S04` | Ontario Ministry of Agriculture, Food and Rural Affairs, [Laitue-céleri](https://www.omafra.gov.on.ca/CropOp/fr/spec_veg/leafy_veg/celt.html), last modified 2012-10-17; accessed 2026-10-19. | Lists `laitue-asperge`, `laitue chinoise`, and `laitue tige` as French common names. OQLF's preferred `laitue asperge` is used for display; the other names are not activated as aliases. `sourceKind: regional_authority`. |

No manufacturer evidence or product-specific measurements are used or transferred.

## Ownership, picker, and recipe checks

Worker audit snapshot before coordinator integration (2026-10-19):

| File or corpus | Current size | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,896 references | `1ac3a495e5bdb36ca91a7d7b7af746060a44e3a23525a450879a067f6cbd87c8` |
| `ingredient-forms.v1.json` | 201 forms | `5784488eba2effc1e99e29e4ab3f3143256a25c6cb327344099e045c1b85cf0e` |
| `legacy-import-identities.v1.json` | 56 candidates | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,304 records / 10,868 source entries / 9,131 source IDs / 7,764 URLs | `8fd767859bd6af31ba2dd6757e9c31a8d15401c9b30432e1f2d37b4819315891` |
| Manifest-listed recipes | 114 files / 1,123 ingredient rows | Corpus digest: `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17` |

The recipe corpus digest hashes each manifest-relative recipe path, a NUL byte, its exact file bytes, and a NUL byte in manifest order. Whole-phrase checks across active reference names and aliases, forms and match terms, legacy candidates, and ledger text found no exact owner for `celtuce`, `laitue asperge`, `asparagus lettuce`, `stem lettuce`, either Latin label, or `ingredient-ref-celtuce`. The proposed R868 source-ID prefix was also absent from the ledger and proposal/batch archive before this document.

The app’s ingredient search normalizes accents/punctuation and prefers phrase matches. The following pre-integration projection compared the then-current catalog with the proposed row:

| Query | Current results | With proposed row |
|---|---|---|
| `celtuce`, `laitue asperge`, `asparagus lettuce`, `stem lettuce` | No result | `ingredient-ref-celtuce` only |
| `asparagus` | Existing asparagus and yardlong-bean results | Same two plus celtuce, because `asparagus lettuce` is an alias |
| `asperge` | Existing asparagus and yardlong-bean results | Same two plus celtuce, because the French display contains `asperge` |
| `lettuce` | Four lettuce/sea-lettuce results | Same four plus celtuce |
| `laitue` | Five lettuce/nori results | Same five plus celtuce |

The broad-query expansions are visible lexical matches, not evidence that celtuce is asparagus or plain lettuce. Root review retained the source-attested `asparagus lettuce` alias and documented the overlap. Existing asparagus, yardlong-bean, lettuce, sea-lettuce, and nori rows and their evidence remain unchanged; no claims were merged or transferred.

A scan of all 114 manifest-listed recipes and 1,123 ingredient rows found no celtuce, asparagus-lettuce, stem-lettuce, `laitue asperge`, or botanical-name match. No recipe reference or link was added. The root review accepted the identity-only reference, retained both OQLF-listed English aliases, and recorded their broad-query overlap without changing existing asparagus, lettuce, or yardlong-bean rows.

## Unresolved risks

- The OQLF entry’s preferred French term is authoritative but dated 1991; independent bilingual review may confirm or revise `laitue asperge` for current Québec recipe usage.
- Sources list different varietal labels, so this row intentionally records the culinary crop name rather than a botanical species or cultivar. Future taxonomy review should not create duplicate picker rows without a demonstrated culinary boundary.
- The sources differ in emphasis on leaves. This identity is mainly stem-use celtuce, but leaf consumption is not prohibited; separate celtuce-leaf references or leaf-specific forms need their own evidence.
- The aliases make plain `asparagus` and `asperge` queries return an additional candidate. Exact qualified names resolve uniquely; if that broad-query trade-off is not acceptable, remove only `asparagus lettuce` as described above, without merging or changing the existing asparagus identity.
- No bundled recipe demand or kitchen measurement, yield, conversion, or generally safe substitute was established. Measurement and substitution work remains open.

No software tests, build, emulator, or deployment were run because the change only adds database JSON data, as allowed by `AGENTS.md`.
