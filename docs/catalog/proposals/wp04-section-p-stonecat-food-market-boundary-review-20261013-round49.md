# WP04 Section P — stonecat food-market boundary review (round 49)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only species identity, Québec status, product-market, picker, ownership,
  recipe-demand, measurement, and substitution review.
- **Recommendation:** **Hold** stonecat / `barbotte des rapides` (*Noturus flavus*) outside active
  ingredient references and the research ledger. Canadian and Québec sources establish the species
  and bilingual name, but Québec currently lists the species as vulnerable; a Québec government
  report describes little sport or commercial interest, and this review found no current Canadian
  food-product specification or bundled recipe demand. Do not turn a fish-identification name into
  an active recipe ingredient without product and lawful-sourcing context.
- **Conditional identity shape, for impact analysis only:** `ingredient-ref-stonecat`, category
  `PROTEIN`, English **stonecat**, Québec French **barbotte des rapides**, scoped to *N. flavus*;
  empty alias arrays, null density, and no unit mappings. This row is **not** recommended for
  activation.
- **Shared-data effect:** none. Add no active reference, form, alias, recipe link, measurement,
  conversion, yield, substitution, or ledger record.
- **New proposal-local source IDs:**
  `WP04-P-STONECAT-BOUNDARY-20261013-R49-S01` through `S03`. The current federal regulation source
  is reused under existing ID `WP04-P-YELLOW-BULLHEAD-20261013-S02`.

## Why this is a distinct open Section P gap

The active [Section P parent checklist](../../RecipeBook-global-ingredient-catalog-plan.txt) still calls
for fish and regional-fish identity work. Stonecat is named as a separate adjacent fish in the brown-
and yellow-bullhead proposals and in the plan, but those
packets allocate only *Ameiurus nebulosus* and *A. natalis*. They explicitly leave stonecat distinct;
they do not review its food-product status, picker projection, or recipe demand. The proposal and
batch archive contains no focused stonecat review, hold, or integration. The live references,
forms, legacy candidates, and ledger likewise contain no stonecat identity or candidate. This packet
does not reopen the brown, yellow, or black bullhead identities, or channel catfish.

The conditional name pair is well identified, but the available Québec sources concern fish
taxonomy, fishery regulation, and conservation status. They do not establish a current Québec
consumer food product. The Québec government's 2005 species report says stonecat has little sport or
commercial interest; that historical observation is not proof that it is never sold, but it makes a
recipe-facing identity especially hard to justify without newer product evidence. The current
vulnerable-species listing is an additional reason to require explicit market and lawful-sourcing
context before activation.

## Québec and Canadian identity, status, and product evidence

- OQLF's GDT entry gives **barbotte des rapides**, English **stonecat**, and *Noturus flavus* in the
  zoology/ichthyology domain. The entry credits the 1983 Québec Ministry of Recreation, Hunting and
  Fishing. This is a Québec name-to-taxon record, not an edible-fish label or evidence of a current
  market product. [S01]
- The Government of Canada's current-to-2026-09-21 *Québec Fishery Regulations* list Stonecat /
  Barbotte des rapides as *N. flavus* under the Bullhead / Barbottes group, separately from Brown
  bullhead / Barbotte brune and Yellow bullhead / Barbotte jaune. This is regulatory species
  nomenclature, not a grocery-label or culinary equivalence rule. Reuse the existing source ID
  `WP04-P-YELLOW-BULLHEAD-20261013-S02`; do not register a duplicate source. [reused
  `WP04-P-YELLOW-BULLHEAD-20261013-S02`]
- The current Government of Québec species list places **Chat-fou des rapides / *N. flavus*** under
  **vulnerable species**. The page was last updated 2025-03-31. It repeats the species in its
  susceptible-species section with an asterisk, explaining that the susceptible list is under review
  and some entries also appear in the threatened or vulnerable lists. This review makes no
  additional claim about a specific harvest prohibition or the rules applying to an individual
  product. [S02]
- Québec's 2005 *Rapport sur la situation de la barbotte des rapides* says the species has low sport
  and commercial interest, low Québec abundance, and rare/limited captures. It also reports that
  the flesh was described as delicious in cited literature, but supplies no current commercial SKU,
  recipe, preparation, or serving quantity. This is historical local context, not current market
  evidence or a legal status determination. [S03]

No current Québec or Canadian consumer listing that identifies stonecat as a food product was found
in this pass. That search result is a limit of the evidence reviewed, not proof that no such product
exists. The sources support a species identity and Québec common name; they do not support activating
it in the recipe ingredient picker while current Québec vulnerability and weak commercial relevance
remain unresolved.

## Exact ownership and prior-work audit

The exact-key audit follows the repository's `normalizeIngredientSearchKey` behavior: lowercase,
NFKD normalization, compatibility folding, accent removal, punctuation-to-space conversion, and
whitespace collapse. Reference display names/aliases, attached form labels/match terms,
legacy-import names/aliases, ledger record IDs, and the Section P archive were checked separately.

| Candidate key or ID | Current owner / evidence state |
|---|---|
| `stonecat`, `barbotte des rapides`, `chat-fou des rapides`, *Noturus flavus* | No exact active-reference, form, or legacy-import owner. The exact phrase occurs only as an adjacent species boundary in prior bullhead reviews and does not allocate stonecat. |
| `ingredient-ref-stonecat`; `candidate-stonecat` | No active reference, legacy candidate, or ledger record ID. Neither is created by this hold. |
| `ingredient-ref-brown-bullhead` | Owns display `brown bullhead / barbotte`; aliases `brown catfish / barbotte brune`. Keep these names and the existing local barbotte product identity unchanged. |
| `ingredient-ref-yellow-bullhead` | Owns display `yellow bullhead / barbotte jaune`; no aliases. Keep separate from stonecat. |
| `ingredient-ref-black-bullhead` | Owns display `black bullhead / barbotte noire`; no aliases. Keep separate from stonecat. |
| `ingredient-ref-channel-catfish` | Owns display `channel catfish / barbue de rivière`; no aliases. Keep separate from stonecat. |
| Forms | No form is attached to the relevant bullhead or channel-catfish references; no current form term names stonecat. No form is proposed. |
| Prior focused packets | No dedicated stonecat identity/product-boundary proposal or batch. The plan and the brown/yellow bullhead packets mention the species only to keep it distinct. |
| New source-ID prefix `WP04-P-STONECAT-BOUNDARY-20261013-R49-S` | No collision in the shared ledger or existing proposal/batch archive. New IDs S01–S03 are unique within this proposal. |

The live snapshot at review time contained **1,378 references**, **100 forms**, **63 legacy-import
candidates**, and **1,707 ledger records**. The ledger's only textual stonecat hits are neighboring
decisions in the brown- and yellow-bullhead identity records; neither record is keyed to stonecat.

## Picker projection

This static projection mirrors the live search rules in
[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):
complete normalized word phrases win, then substring matching is used only when no full phrase
matches. It considers references and attached form terms. No row or form was created; the proposed
names below are an in-memory conditional row solely to show picker impact.

| Query | Current picker result(s) | With the conditional alias-free row | Consequence |
|---|---|---|---|
| `stonecat` | No result | stonecat / barbotte des rapides | Adds a sole ingredient result for the exact common name, despite no current food-product evidence. |
| `barbotte des rapides` | No result | stonecat / barbotte des rapides | Adds a sole result for the Québec species-qualified name. |
| `barbotte` | Brown bullhead / barbotte; yellow bullhead / barbotte jaune; black bullhead / barbotte noire | Those three plus stonecat / barbotte des rapides | Broad local search remains multiple-choice, but adds a vulnerable fish without food-market evidence. |
| `bullhead` | Brown, yellow, and black bullhead | Unchanged | `stonecat` contains no `bullhead` term; do not add a broad alias. |
| `catfish` | Brown bullhead / brown catfish; channel catfish | Unchanged | The proposed one-word English display is not a `catfish` phrase. Do not add `stone catfish`, `catfish`, or other broad aliases. |
| `chat-fou des rapides`; `stone catfish`; `stonecat madtom`; *N. flavus* | No result | No result with the proposed fields | Keep status-page wording, older literature variants, and the scientific name out of search terms. |

There are no attached forms to display under any current or conditional result. Search behavior does not
resolve the food-product question: it would only turn the official fish-identification names into an
ingredient choice. The hold preserves current ownership and keeps the three active `barbotte` species
results unchanged.

## Bundled recipe demand

The current manifest lists **114 recipe files and 1,123 ingredient rows**. Every complete recipe JSON
document and every ingredient row was scanned for `stonecat`, `stone catfish`, `stonecat madtom`,
`barbotte des rapides`, `chat-fou des rapides`, *Noturus flavus*, *N. platycephalus*, and neighboring
`barbotte`, `bullhead`, and `catfish` terms.

**Result: zero matching recipe files and zero matching ingredient rows.** Recipe 093#4's unlinked
“Cooked meat or seafood, to taste” is generic wording and does not select stonecat. No recipe link,
product state, quantity, or recipe-specific substitution is supported.

## Measurement and substitution evidence

| Dimension | Evidence found | Catalog decision |
|---|---|---|
| Identity | OQLF and the current federal regulation pair the qualified French and English names with *N. flavus*. | Keep the identity as a documented but inactive candidate; do not infer a food ingredient from taxonomic naming alone. |
| Product state / market | The Québec government report discusses the fish's low historical commercial interest; no current Canadian food SKU or recipe line was found in this pass. The current Québec list identifies the species as vulnerable. | Add no active row, whole/fillet/live/fresh/frozen form, or current market claim. Revisit only with a current food-product or recipe source and a clear lawful-sourcing context. |
| Numeric evidence | Sources reviewed provide no recipe amount, serving, edible-yield, retail package quantity, density, or kitchen conversion. Biological abundance and fish-size observations, where reported, are not ingredient measurements. | Add no measurement observation, default measure, density, unit mapping, conversion, package yield, or form conversion. |
| Substitutions | No reviewed recipe or source tests stonecat against brown/yellow/black bullhead, channel catfish, or another fish in a cooking method and quantity. Taxonomic family membership and the 2005 palatability note are not substitution evidence. | Add no global or contextual substitution, warning, ratio, recipe-line link, or food-safety equivalence. |

## Proposal-time baseline snapshot

Counts and hashes are from the live shared artifacts read on 2026-10-13; hashes cover exact bytes.
The corpus fingerprint hashes each manifest-ordered relative path, a NUL byte, exact recipe bytes, and
another NUL byte.

| Artifact | Count / size | SHA-256 or fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,378 references; 442,247 bytes | `c1b1d802c18d225b01ed516808305598000f14a7143fd5376c251289e87a73e6` |
| `ingredient-forms.v1.json` | 100 forms; 74,742 bytes | `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63` |
| `legacy-import-identities.v1.json` | 63 candidates; 15,042 bytes | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `research-ledger.v1.json` | 1,707 records; 6,651,985 bytes | `3e75c8f1454fc5fbc048aa7e3dc41daa3af0d864d27221187d8b4bdb8983bb6e` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,806 bytes | `81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552` |
| Generated `BundledIngredientCatalog.kt` | 1,378 references; 604,612 bytes | `1b514b30aa668a18f6fcb4cc1d1565a3786d2dcb87a3b39f2ecab17df8f3d0ae` |

## Source register

Online sources were checked on 2026-10-13. Sources establish names, species status, or historical
fishery context only; no sources are registered in the live ledger by this proposal.

| Source ID | Source and supported claim | Limits |
|---|---|---|
| `WP04-P-STONECAT-BOUNDARY-20261013-R49-S01` | OQLF, [GDT: barbotte des rapides](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488777/barbotte-des-rapides). Gives Québec French `barbotte des rapides`, English `stonecat`, and *Noturus flavus* in zoology/ichthyology; credits the Québec Ministry of Recreation, Hunting and Fishing, 1983. | Terminology and taxon only; not an edible-fish label, product listing, recipe, or market measure. |
| Reused `WP04-P-YELLOW-BULLHEAD-20261013-S02` | Government of Canada, [Québec Fishery Regulations, Schedule 3](https://laws.justice.gc.ca/eng/regulations/SOR-90-214/page-8.html), rechecked current to 2026-09-21. | Lists Stonecat / Barbotte des rapides as *N. flavus* in the Bullhead / Barbottes species group. This ID already exists in the ledger; do not duplicate it. The regulation is species nomenclature, not retail or culinary evidence. |
| `WP04-P-STONECAT-BOUNDARY-20261013-R49-S02` | Gouvernement du Québec, [Liste des espèces fauniques menacées ou vulnérables](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/gestion-faune-habitats-fauniques/especes-fauniques-menacees-vulnerables/liste), page last updated 2025-03-31. Lists Chat-fou des rapides / *N. flavus* among vulnerable species and duplicates it in the susceptible-species section while that list is under review. | Conservation-status source; not a determination of an individual product's provenance, harvest rules, or legal status outside its stated context. |
| `WP04-P-STONECAT-BOUNDARY-20261013-R49-S03` | Gouvernement du Québec, [Rapport sur la situation de la barbotte des rapides (*Noturus flavus*) au Québec](https://mffp.gouv.qc.ca/documents/faune/rapport-barbotte.pdf), December 2005. Describes low sport/commercial interest, sparse Québec information, and low/rare captures; its palatability statement cites older literature. | Historical government species report, not a current fishery assessment, retail SKU, consumer-label standard, cooking method, or kitchen quantity. |

## Recommendation and revisit condition

Keep stonecat / `barbotte des rapides` unallocated in the active picker and ledger. The source-backed
species/name pair is not in question; the missing piece is a current, species-specific food-product
need that is appropriate to represent while Québec lists the fish as vulnerable. Add no aliases, form,
measure, recipe link, conversion, yield, substitution, or candidate ledger record. Revisit only if a
bundled recipe or current Canadian food-product source names stonecat and provides enough product and
lawful-sourcing context to support ingredient use. Section P remains open.

This is documentation-only. No app tests or emulator checks were run.
