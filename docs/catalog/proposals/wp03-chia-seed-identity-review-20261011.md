# WP03 Section I — chia-seed identity review

- **Reviewed:** 2026-10-11
- **Status:** Integrated on 2026-10-11. The existing identity was verified in place; no duplicate reference or recipe edit was added.
- **Scope:** Validate the existing food-grade chia-seed identity and its Québec French display. This does not review seed measures, forms, processing conversions, or substitutions.
- **Plan item:** The open catalog-plan line says “Remaining seed identity coverage: chia, additional melon-seed products, and regional culinary kernels.” Chia already has an active reference; the other named coverage remains open.

## Recommendation

**Accept the existing `ingredient-ref-chia-seeds` as the narrow culinary seed identity; do not add a duplicate row.** Keep its current display `chia seeds / graines de chia`. The English and French displays are supported by Health Canada’s bilingual food-file label and current Québec retail wording. The OQLF entry supports *chia* as the Québec French name for the plant *Salvia hispanica* that produces edible seeds, but it does not prescribe the full product phrase `graines de chia`.

For exact singular searches only, add aliases `chia seed` and `graine de chia`. Keep the aliases limited to the simple whole phrase. Do not add bare `chia`, scientific or Spanish names, or color and processing qualifiers. The ledger’s identity status is still `unreviewed`; the coordinator can verify the existing reference and reconcile only the chia portion of the broad open plan item. The remaining melon-seed and regional-kernel work should stay open.

| Field | Proposal |
| --- | --- |
| Stable ID | `ingredient-ref-chia-seeds` (existing) |
| English display | `chia seeds` (retain) |
| Provisional fr-CA display | `graines de chia` (retain; Canadian and Québec product evidence supports it, but it is not an OQLF product-specific ruling) |
| English alias | `chia seed` |
| French alias | `graine de chia` |
| Category | Retain `NUT_SEED_AND_DRIED_FRUIT` |
| Disposition | Verify the existing identity in place; no new identity |

## Identity boundary and alias limits

The identity means edible chia seed (*Salvia hispanica*) sold as food in whole or minimally processed seed form. Health Canada separately lists the seed and cold-pressed seed oil, while a Canadian French manufacturer labels ground chia as `graines de chia moulues`; those are evidence that oil and ground product wording should not be silently treated as exact aliases for unqualified seeds.

Do not alias `chia` by itself: OQLF defines that preferred term as the plant, not the seed product. Exclude `Salvia hispanica`, `chía`, `Mexican chia`, `salba`, and other botanical, Spanish, cultivar, or market names absent a separate naming review. Keep `black chia`, `white chia`, `ground/milled chia`, chia flour or powder, meal, oil, extract or mucilage, sprouts, hydrated gel, prepared pudding, blends, and supplements outside this alias list. Color and preparation qualifiers remain meaningful recipe/product text; this proposal creates no forms or separate color references.

The existing recipe wording is unqualified `chia seeds`, so it supports the base identity only. It does not justify assigning a color, grind, hydration, or other preparation state.

## Live catalog, ledger, and recipe audit

Read-only audit conducted on 2026-10-11:

- The live package contains 970 ingredient references and 60 forms. Exactly one active reference contains chia wording: `ingredient-ref-chia-seeds`, with `nameEn: chia seeds`, `nameFr: graines de chia`, empty English and French alias lists, null default density, and no unit mappings. No chia-specific ingredient form was found.
- The legacy candidate file has 75 candidates and no chia match. The research ledger has one exact chia record: `ingredient-ref-chia-seeds`, `recordType: ingredient_reference`, `identityState: unreviewed`, `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, and no sources or decisions.
- All 114 manifest-listed recipes (1,123 ingredient rows) were searched. One recipe file and one ingredient row match chia: recipe 065, *Overnight Oats / Gruau sans cuisson*, row `1/8 part chia seeds`, already linked to `ingredient-ref-chia-seeds`. The wording and existing link remain unchanged. No other chia recipe row was found.
- An earlier flax/hemp/poppy proposal mentions chia only as a neighboring active seed reference; it does not research or propose a chia change.

Keep the reference’s current null density and empty unit mappings. The Canadian Nutrient File contains serving-size material, but this review uses that page for bilingual identity evidence only and recommends no numerical values, measurement defaults, conversions, recipe edits, or substitutions. Measurement and substitution research remain separate, unreviewed questions.

## Sources

All online sources below were accessed 2026-10-11. IDs are local to this proposal.

| ID | Source | Supports and limits |
| --- | --- | --- |
| CHIA-S01 | Health Canada, [Canadian Nutrient File: chia seeds, dried (food code 2511)](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2511&lang=fre). | Gives the bilingual food wording `Seeds, chia seeds, dried` / `Graines de chia, déshydratées`. Supports the seed identity and French noun phrase; this review adopts no serving-size data shown on the page. |
| CHIA-S02 | Health Canada, [List of non-novel determinations for food and food ingredients](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html), entries dated 2012-05-08 and 2012-09-04. | Names `Chia (Salvia hispanica) seed` as whole or minimally processed seed with a history of safe use as food, and separately identifies cold-pressed chia seed oil. Supports the species and food-seed/oil boundary; a non-novel determination is not a product-quality standard or endorsement of every derivative/use. |
| CHIA-S03 | Office québécois de la langue française, [chia (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26505019/chia), last updated 2013. | Gives preferred French `chia`, English `chia`, and Latin *Salvia hispanica* in the botanical domain; defines the plant as producing edible seeds. Supports the Québec plant name and seed-producing species, not a specific food-label phrase for the seeds. |
| CHIA-S04 | Metro Québec, [Graines de chia noires entières, Biologique](https://api.metro.ca/epicerie-en-ligne/allees/epicerie-biologique/garde-manger/noix-graines-et-fruits-seches-bio/graines-de-chia-noires-entieres/p/059749979443). | Current Québec retail product title and ingredient text use `graines de chia` and `entières`. Supports Québec market wording and an intact-seed product; the color-specific label is not proposed as an alias or form. |
| CHIA-S05 | NOW Foods Canada, [Graines de chia moulues](https://nowfoods.ca/produit/graines-de-chia-moulues/?lang=fr). | Canadian French manufacturer page calls its product `graines de chia moulues` and identifies ground white chia. Supports the French wording and distinction of a ground product; no ground form or use/conversion claim is imported. |
| CHIA-S06 | Healthy Planet Canada, [Navitas Organics chia seeds](https://www.healthyplanetcanada.com/fr/grocery/better-breakfast/navitas-organics-chia-seeds-organic-227g.html). | French retail ingredient declaration uses singular `Graine de chia biologique (Salvia hispanica)`. Supports the proposed singular French search alias; it is retailer labeling, not a Québec terminology ruling. |

## Integration disposition

Accepted the existing identity `ingredient-ref-chia-seeds` in place. Added only `chia seed` and `graine de chia` as aliases, retained `chia seeds / graines de chia`, and left density, mappings, forms, measures, substitutions, and recipe 065's exact linked line unchanged. No duplicate reference was created.

The integration owner independently reopened the cited Health Canada CNF and non-novel pages, the OQLF plant entry, and current Metro and Healthy Planet Québec/Canadian product pages. Those pages confirm the bilingual seed wording, the species/product boundary, the Québec plural `graines de chia`, and the exact singular product phrase `graine de chia`. Health Canada identifies whole/minimally processed seed separately from cold-pressed oil; OQLF's entry is botanical and does not establish a product-specific seed term. No serving measure or numerical behavior was imported.

Shared ledger source IDs are `WP03-CHIA-20261011-S01` through `S06`. The new batch README records tests, deployment, screenshots, hashes, and the remaining seed-coverage items.
