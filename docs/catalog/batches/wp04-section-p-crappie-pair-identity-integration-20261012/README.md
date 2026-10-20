# WP04 Section P — crappie species-pair identity integration (2026-10-12)

## Decision

Added two separate identity-only `PROTEIN` references:

| Reference ID | English display | French display | Taxon |
|---|---|---|---|
| `ingredient-ref-black-crappie` | black crappie | marigane noire | *Pomoxis nigromaculatus* |
| `ingredient-ref-white-crappie` | white crappie | marigane blanche | *Pomoxis annularis* |

Both rows have empty alias lists, null density, and no unit mappings. Ontario's bilingual species
profiles and fish-consumption guidance support white crappie as a Canadian wild-food identity; this
does not establish Québec occurrence, Québec-preferred terminology, or a current Québec market.
OQLF, Québec species material, and Fisheries and Oceans Canada support the black-crappie identity
and the distinction between the two species. Ontario's 2026 regulations use broad `crappie` and
`marigane` language for both species.

The actual picker returns both qualified rows for a broad query while keeping qualified searches
species-specific. No generic crappie/marigane row or aliases were added, and unqualified recipe text
must remain unassigned. DFO reports that black/white hybrids can be difficult to identify; hybrids
remain outside both rows.

No forms, sold-product states, measures, density, mappings, conversions, yields, recipe links,
substitutions, or recipe text were added. The Ontario fish guide's meal-frequency advice is scoped to
Ontario catch, waterbody, species, and fish length; it is source context, not a Québec safety rule or
a reusable recipe portion. Biological size observations were not recorded as catalog measurements.

See the full [identity, naming, and picker review](../../proposals/wp04-section-p-black-crappie-marigane-noire-identity-review-20261012.md).
Primary references include the OQLF [marigane noire entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198862/marigane-noire),
the Gouvernement du Québec [black-crappie profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/marigane-noire),
and DFO's [2025 biological synopsis](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/41273990.pdf).
Ontario names the second species in its [White Crappie](https://www.ontario.ca/page/white-crappie)
and [Marigane blanche](https://www.ontario.ca/fr/page/marigane-blanche) profiles. Its
[English](https://www.ontario.ca/page/guide-eating-ontario-fish) and
[French](https://www.ontario.ca/fr/page/guide-de-consommation-du-poisson-de-lontario) guides document
wild-fish consumption context. The
[2026 English](https://www.ontario.ca/files/2025-12/mnr-2026-fishing-regulations-summary-en-2025-12-08.pdf)
and [French](https://www.ontario.ca/files/2025-12/mnr-2026-fishing-regulations-summary-fr-2025-12-08.pdf)
regulation summaries define the broad species pair.

## Picker and recipe audit

The projection applies the live `IngredientReferenceSearchIndex` normalization, complete word-phrase
matching, and partial fallback to the catalog plus both proposed displays:

| Query | Result |
|---|---|
| `black crappie` | Black crappie / marigane noire only |
| `marigane noire` | Black crappie / marigane noire only |
| `white crappie` | White crappie / marigane blanche only |
| `marigane blanche` | White crappie / marigane blanche only |
| `crappie` | Both qualified species |
| `marigane` | Both qualified species |
| `crapet noir`, `crapet calico`, `calico`, `perche argentée` | No results |

The manifest lists 114 recipes and 1,123 ingredient rows. A full scan for both species names,
`crappie`, `marigane`, relevant taxa, excluded names, and both IDs found no hits in recipe files;
no recipe link or relink was made.

## Package snapshot after integration

Hashes cover exact file bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a
NUL byte, the exact recipe-file bytes, and a trailing NUL byte in manifest order.

| Artifact | Count / size | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,277 references; 408,948 bytes | `35f1b3b98527b87d15648c9722af9a968e4b160e2b19714d8de66612bbd8d076` |
| `ingredient-forms.v1.json` | 94 forms; 70,793 bytes | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates; 15,508 bytes | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,585 records; 5,630 source entries; 4,661 distinct source IDs; 8 conversions; 5,507,988 bytes | `d75f02fafc1cfd015d10148a9e15c5862b438d190e4c3e8fa0cbc41313ceec97` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,277 references; 559,727 bytes | `1e6be90e14f4ac60ad99a5094946ed329cf6e96fb3340cdebefa660e632ccb6d` |

## Validation

- Ingredient-reference normalization, bundled-package normalization, package validation, and
  generated-catalog freshness checks passed.
- Exact active-name and ID ownership checks found one owner per proposed display/ID and no exact
  legacy, form, or recipe owner. Both ledger records are verified, with no measurement observations
  or substitution findings.
- The picker projection returns one species for each qualified name and both species for broad
  `crappie` and `marigane` searches.
- All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned; there were no
  species, taxon, excluded-name, or reference-ID hits.
- No app tests or emulator checks were run because this change only adds database JSON data and its
  generated catalog index, as stated in `AGENTS.md`.
