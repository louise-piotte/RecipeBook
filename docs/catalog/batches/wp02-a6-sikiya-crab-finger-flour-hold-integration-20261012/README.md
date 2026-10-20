# WP02 A6 — Sikiya / crab-finger flour hold (2026-10-12)

## Decision

Kept possible Sikiya / crab-finger millet flour (*Digitaria sanguinalis*) unallocated. The FSSAI
standard names `Crab finger (Sikiya)` for the grain, and ICAR-IIMR and a Madhya Pradesh government
page describe its localized food use. A 2024 landscape narrative reports rotis made from Sikiya
millet flour. Those sources do not establish a Canadian or Québec flour product name or a Québec
French food display.

OQLF's terms for *D. sanguinalis* are in the botanical domain, and CFIA treats *Digitaria* in weed
seed identification. Neither gives a food or flour name. The Québec Food Directory's `Farine de
Millet Biologique` is generic and does not identify the source species. Keep the existing
`millet flour / farine de millet` row unchanged; do not use Sikiya, species names, or botanical weed
terms as aliases. No active reference, alias, form, ledger record, recipe link, measure, or numeric
behavior was added. The wider A6 review remains open.

The full source register, limits, and proposal-time exact-key audit are in the
[review proposal](../../proposals/wp02-a6-sikiya-crab-finger-flour-hold-20261012.md). Primary and
Québec terminology sources include the [FSSAI cereal standard](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4%20%28Cereals%20and%20Cereal%20products%29.pdf),
[ICAR-IIMR's 2026 GAP manual](https://www.millets.res.in/pub/2026/GAP-English.pdf),
[OQLF's botanical entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18082121/digitaire-sanguine),
[CFIA's French *Digitaria* seed identification](https://inspection.canada.ca/fr/protection-vegetaux/semences/analyse-semences-designation-categorie/identification-semences/digitaria-spp),
and the [Québec Food Directory millet-flour listing](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223769).

## Live package snapshot at reconciliation

No package data changed in this batch. These current hashes reflect the earlier cream-of-rice
integration and the existing package state at reconciliation time.

| Artifact | Count/state | SHA-256 or corpus digest |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,221 references | `dbbbae79b74064e4989ab0057e304598595895fa7ab14735a07720517dd055c0` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,522 records; 5,156 source entries; 4,219 distinct source IDs; 8 unit conversions | `a44a10bc8ec6c16f0fa0a47d0def0101025d59f89ca7af0faf687039c17e84f0` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated `BundledIngredientCatalog.kt` | 1,221 references | `f555aa8491addb6d95be3e6256c21a3b90d50d30af2561c8d242d6189e38bcff` |

## Reconciliation checks

- Rechecked the live package with repository `normalize_search_key`: only the generic
  `ingredient-ref-millet-flour` owns `millet flour / farine de millet`; no candidate flour name,
  proposed ID, Sikiya term, species name, or botanical weed term has an exact owner.
- All seven proposal-local source IDs are absent from the shared ledger, and the ledger has no
  Sikiya/crab-finger record or mention.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows for candidate terms and
  generic millet-flour wording: zero hits.
- Proposal, README, and changed plan/roadmap/workflow files passed UTF-8/no-BOM and trailing-whitespace
  checks; scoped `git diff --check` passed.
- No tests or emulator checks were run because this hold changes only review documentation and adds
  no database JSON data.
