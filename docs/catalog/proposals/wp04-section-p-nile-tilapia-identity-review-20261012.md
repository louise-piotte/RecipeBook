# WP04 Section P — Nile tilapia identity review

- **Review / source-access date:** 2026-10-12.
- **Packet type:** species identity, Québec naming, exact-key, recipe-demand, measurement, substitution, and picker-boundary review.
- **Recommendation:** **Hold the verified species candidate unallocated.** Current search treats the species display `Nile tilapia` as a complete-phrase match for the bare query `tilapia`, so the picker can surface a species-specific choice while the generic identity remains unresolved. Keep generic `tilapia` distinct and do not imply that a generic recipe or product names *O. niloticus*.
- **Root disposition:** The active reference was removed after the picker audit. Its terminology and taxonomic evidence remain in `candidate-nile-tilapia` in the ledger. No recipe, form, measure, or substitution data was added. No app tests or emulator checks were run.

## Identity recommendation and boundaries

| Candidate / ledger ID | Prospective category | English display | fr-CA display | Aliases | Taxon |
|---|---|---|---|---|---|
| `candidate-nile-tilapia` (unallocated) | `PROTEIN` if later integrated | **Nile tilapia** | **tilapia du Nil** | None | *Oreochromis niloticus* |

OQLF describes tilapia as an edible freshwater fish and lists `Nile Tilapia` with *Oreochromis niloticus*. TERMIUM directly pairs English `Nile tilapia` and French `tilapia du Nil` with the same species. DFO’s bilingual aquaculture plan independently gives `Tilapia (Nile) / Tilapia du Nil` for *O. niloticus*. These sources support a species-scoped identity, not a family-wide mapping.

The separate `tilapia` review in `wp04-finfish-gaps-20261010.md` held generic tilapia because the CFIA Fish List shows multiple species and names under that market term. This recommendation advances only the named Nile species; keep bare `tilapia` and OQLF’s broader `perche d’Afrique` out of aliases. Do not add `Nile perch / perche du Nil`, which names a different fish (*Lates niloticus*), or aliases for Mozambique tilapia, redbreast tilapia, blue tilapia, hybrids, or colour variants. The Ontario aquaculture profile uses “Black Nile tilapia” for its cultured *O. niloticus* population; that population wording is not needed as a catalog alias.

This species display contains the word `tilapia`, so a broad picker query for `tilapia` retrieves the species-qualified display as a complete-phrase match. In the current picker, that result can appear without the unresolved generic identity; a visible `Nile` qualifier does not make this safe. Hold the row until search behavior preserves the broad unresolved result and the species-specific choice together. A search match is not an alias assignment or permission to relink an unqualified recipe line to *O. niloticus*.

Keep whole, gutted, scaled, fillet, skin-on/off, boneless, fresh, frozen, cooked, and prepared states out of this identity row. They are product or preparation descriptors and the recipe corpus does not request a Nile-tilapia state.

## Prior work, package ownership, and source-ID uniqueness

The previous Section P finfish-gap review explicitly retained generic tilapia as unresolved and specified that a future named species would need bilingual, species-qualified names without generic `tilapia` aliases. The latest Section P gap work does not assign or review Nile tilapia. A repository-wide proposal and batch search found no prior Nile-tilapia identity proposal or integration.

At the original proposal audit snapshot, the package had 1,244 active ingredient references, 94 ingredient forms, 66 legacy-import candidates, and 1,550 research-ledger records with 5,371 source entries / 4,411 distinct source IDs. After the root hold, the package has no active Nile tilapia row and the research ledger retains its evidence under `candidate-nile-tilapia`. The manifest lists 114 recipes containing 1,123 ingredient rows.

Exact normalized-key ownership was checked using the repository’s `normalizeIngredientSearchKey` rules (NFKD, lowercase, ligature folding, accent removal, punctuation folding, and whitespace collapse) across active reference names/aliases, form labels/match terms, legacy candidate names/aliases, and ledger record IDs. The held ledger candidate now owns its candidate ID only. No active reference, form, legacy candidate, or ledger record owns `Nile tilapia`, `tilapia du Nil`, *Oreochromis niloticus*, `perche d’Afrique`, `African perch`, `Nile perch`, `perche du Nil`, `Mozambique tilapia`, or the prospective ID `ingredient-ref-nile-tilapia`. The existing generic tilapia review is a boundary decision, not an exact-key owner.

New proposal-local source IDs `WP04-SECTIONP-NILETILAPIA-20261012-S01` through `S06` were checked against all ledger source IDs and existing proposal/batch Markdown; none was already assigned. Reused CFIA evidence is cited by its existing source IDs below and is not reissued.

## Bundled recipe demand

I scanned every manifest-listed recipe file, all ingredient rows, the parsed recipe strings, and complete recipe text for the candidate names, the taxon, generic `tilapia`, `perche d’Afrique`, `African perch`, `Nile perch`, `perche du Nil`, and `Mozambique tilapia`. The scan found **zero candidate-term hits in all 114 recipe files and zero hits in all 1,123 ingredient rows**. No recipe link, form, portion, product state, or recipe-scoped substitution is supported.

Nearby seafood rows do not establish tilapia demand:

| Recipe row | Exact request | Catalog boundary |
|---|---|---|
| `019#8` | `jumbo lump crab meat` | Crab meat with a named grade; not finfish or tilapia. |
| `023#1` | `sliced calamari` | Calamari/squid; a cephalopod. |
| `077#10` | `salmon fillets without skin, cut into cubes` | Existing broad salmon-fillet reference; no tilapia or fish-species choice. |
| `093#6`, `095#5` | `fish sauce` | Condiment, not fish flesh. |
| `111#1` | `tuna steak` | Existing broad tuna identity; no tilapia or species choice. |

## Measurement and substitution evidence limits

- OQLF, TERMIUM, and DFO support terminology and taxonomic identity. The DFO and Ontario sources describe aquaculture, not a culinary conversion or substitute.
- Ontario’s profile reports a live-market production size of 680–793 g. This is biological/production context and is **not** an edible portion, serving recommendation, fillet weight, count conversion, or density; do not add it to the culinary measurement ledger.
- No exact recipe request or source-specific culinary measure was found for Nile tilapia. Keep `defaultDensity` null and `unitMappings` empty; add no form, count/portion observation, conversion, edible yield, or package relationship. Measurement state remains `not_yet_researched` pending a culinary-source review.
- The identity and aquaculture evidence establish no safe global or contextual replacement for another fish. Do not infer interchangeability from shared “white fish” wording, taxonomy, or similar cooking descriptions. Add no substitution rule; substitution research remains `not_yet_researched`.

## Hold decision

Keep `candidate-nile-tilapia` in the research ledger with identity evidence verified and no active reference. The bare query `tilapia` currently matches the species display and can return this species-specific choice alone while the generic identity is unresolved. Do not add `ingredient-ref-nile-tilapia` until a source-backed picker/search change makes the generic and species-scoped results distinguishable together. Leave recipes unchanged and add no forms, measurements, densities, mappings, conversions, yields, package data, or substitutions. Keep generic `tilapia`, `perche d’Afrique`, `Nile perch`, other tilapia species, and preparation states separate.

## Sources

Sources were accessed or rechecked on 2026-10-12. The biological, aquaculture, and terminology sources below support the stated identity boundaries only; none is culinary measurement or substitution evidence.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-NILETILAPIA-20261012-S01** | OQLF GDT, [tilapia](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8367900/tilapia) | Defines an edible freshwater fish, gives preferred Québec terms `tilapia` and `perche d’Afrique`, lists English `Nile Tilapia`, and Latin *Oreochromis* / *O. niloticus*. Last updated 2001. Supports genus/species terminology; does not make either broad French term a species-specific alias. |
| **WP04-SECTIONP-NILETILAPIA-20261012-S02** | TERMIUM Plus, [Nile tilapia / tilapia du Nil](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frt&lang=eng&srchtxt=TILAPIA+NIL) | Canadian terminology record pairs English `Nile tilapia`, French `tilapia du Nil`, and *Oreochromis niloticus*. Use for the name pair and taxon only. |
| **WP04-SECTIONP-NILETILAPIA-20261012-S03** | Fisheries and Oceans Canada, [Pacific Region freshwater/land-based aquaculture plan, English](https://www.pac.dfo-mpo.gc.ca/aquaculture/docs/fresh-imap-pgia-douce-eng.html) | The cultivated-species table gives `Tilapia (Nile) — Oreochromis niloticus`. The plan is dated July 2016 / version 1.1 and is aquaculture evidence, not a culinary or current retail specification. |
| **WP04-SECTIONP-NILETILAPIA-20261012-S04** | Pêches et Océans Canada, [Plan de gestion intégrée de l’aquaculture terrestre et en eau douce, français](https://www.pac.dfo-mpo.gc.ca/aquaculture/docs/fresh-imap-pgia-douce-fra.html) | The French cultivated-species table gives `Tilapia du Nil — Oreochromis niloticus`. Same aquaculture-context limit as S03. |
| **WP04-SECTIONP-NILETILAPIA-20261012-S05** | Ontario Ministry of Agriculture, Food and Agribusiness, [Tilapia aquaculture species profile](https://www.ontario.ca/document/species-profiles-aquaculture/tilapia) | Published December 2023. Identifies *O. niloticus* as the most cultured Ontario tilapia species and describes Ontario live-market context. Its live-fish market size and production figures are not recipe measurements, portion weights, or evidence of interchangeability. |
| **WP04-SECTIONP-NILETILAPIA-20261012-S06** | CFIA, [Species susceptible to epizootic ulcerative syndrome](https://inspection.canada.ca/en/animal-health/aquatic-animals/diseases/susceptible-species/epizootic-ulcerative-syndrome) | Current CFIA table associates *O. niloticus* with `Nile tilapia` as a taxon cross-check. CFIA explicitly limits these common names to aquatic-animal-health use; they do not replace its Fish List for food labelling. |

Reused CFIA labelling evidence (not reissued under new source IDs): `WP04-FINFISH-GAPS-20261010-S11` queried the official Fish List for tilapia names and found multiple species; `WP04-FINFISH-GAPS-20261010-S12` explains the Fish List’s role for Canadian fish labelling. See [the prior tilapia boundary review](wp04-finfish-gaps-20261010.md). Neither source supports adding generic `tilapia` to the proposed species row.

## Remaining Section P work

This proposal does not advance a species row until the picker boundary is addressed. Generic tilapia remains unresolved, as do other species-scoped finfish candidates, meaningful shrimp/prawn preparation identities, remaining shellfish, roe, fish powder, fish balls/surimi, and regional seafood gaps. The preserved-fish state boundary remains a separate review. The Nile tilapia review is complete as a hold; the identity remains unallocated.
