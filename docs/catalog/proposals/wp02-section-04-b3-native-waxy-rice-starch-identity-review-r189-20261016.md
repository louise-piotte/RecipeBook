# WP02 Section 04 B3 native waxy rice starch identity review — R189

- **Reviewed:** 2026-10-16.
- **Status:** Integrated in R189. The reference, ledger record, generated Kotlin catalog, Section 04 checklist, roadmap, and integration README were updated.
- **Open checklist:** “Water-chestnut flour and other documented regional starches” in the live [Section 04 plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2506). Water-chestnut ambiguity is outside this review.
**Source-ID prefix:** WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016; all seven source IDs are attached to the integrated ledger record and each maps to one source URL.

## Recommendation

**Add identity-only native waxy rice starch / amidon de riz cireux natif** as ingredient-ref-native-waxy-rice-starch in FLOUR_AND_STARCH. Current Canadian ingredient-distributor listings identify native waxy rice starch as a food-grade powder available in Canada. Quadra’s French-Canadian listing for the same Beneo product code describes it as “un amidon de riz cireux natif fonctionnel.” BENEO separately describes native waxy rice starch, native regular rice starch, pre-cooked waxy rice starch, and modified rice starch grades. OQLF defines waxy starch as cereal starch especially rich in amylopectin and supports the French term family amidon de grains cireux. Québec-facing consumer food-company material also describes rice starch in use as native starch prepared from waxy rice. [S01–S07]

The product boundary is a starch fraction made from waxy rice, in native rather than chemically modified or pre-gelatinized form. Keep it separate from ordinary rice starch / amidon de riz, modified rice starch, pregelatinized rice starch, rice flour, glutinous-rice grain, and product-specific branded or functional grades. A functional native product listing supports the identity class; it does not make that SKU’s technical performance a universal catalog property.

## Why this is an unreviewed gap

The earlier [rice-starch boundary review](wp02-rice-starch-quebec-name-boundary-review-20261011.md) accepted the family-level rice starch / amidon de riz row and explicitly left waxy, native, and functional grades out of its aliases, while noting that a source-backed grade might merit a later identity review. The [modified-rice-starch proposal](wp02-next-b3-regional-starch-gap-review-20261014-r1.md) likewise excludes modified waxy rice starch from aliases because it is a product-specific grade. Neither review decided whether native waxy rice starch itself warrants a separate reference.

The [glutinous-rice alias review](wp03-section-f-glutinous-rice-alias-boundary-review-20261012.md) keeps waxy rice as a grain alias and explicitly says waxy rice starch is a separate food-starch product phrase, not a grain alias. It did not add or hold a starch identity. The existing [pregelatinized-rice review](wp02-b3-r125-pregelatinized-rice-starch-identity-review-20261015.md) and [R187 pregelatinized-wheat review](wp02-b3-pregelatinized-wheat-starch-identity-review-r187-20261016.md) address different process grades. No focused native waxy rice starch proposal, active reference, ledger record, form, or legacy candidate was found. These prior records establish the boundary but do not duplicate this identity review.

## Product evidence, naming, and scope

| Candidate phrase | Decision | Evidence and boundary |
|---|---|---|
| Native waxy rice starch | Add a separate identity-only reference. | Quadra lists Beneo REMYPURE S51 as a Canada-available rice-starch powder derived from polished waxy rice and described as a functional native waxy rice starch. Its product code is F05148. REMYPURE S52 is also listed as a native waxy rice-starch powder. [S01] |
| Amidon de riz cireux natif | Use as the French display. | Quadra’s French-Canadian listing for REMYPURE S51 reports Canada availability and uses the product wording “poudre d’amidon de riz cireux natif fonctionnel.” The proposed display drops the product’s functional-grade qualifier but keeps the directly attested source, waxy type, and native state. OQLF’s amidon de grains cireux entry supports the general French terminology; it is not a rice-specific product name. [S02–S03] |
| Rice starch / amidon de riz | Keep as the broad family reference. | The active generic row remains ingredient-ref-rice-starch. Do not move or broaden its display. The new row is a source-qualified subtype; the generic rice-starch query is expected to return both the family row and the subtype. |
| Modified rice starch, including modified waxy grades | Keep on the existing modified-rice-starch identity. | BENEO and Quadra identify chemically modified rice-starch product grades separately. Do not represent modified waxy products as native. [S01, S04] |
| Pregelatinized or precooked waxy rice starch | Keep on the existing pregelatinized rice-starch identity when the source identifies that process. | BENEO describes a precooked waxy-rice grade separately from its native waxy grade. Do not add instant, precooked, or pregelatinized aliases to the proposed row. [S04] |
| Waxy rice, glutinous rice, sweet rice, riz gluant | Keep on the grain identity. | The active glutinous-rice grain row already owns waxy rice, sweet rice, and the French grain names. These do not become starch aliases. |

Amidon de riz cireux natif is a clear product-class display, supported by a current French-Canadian listing and the Québec terminology entry. It is not presented as an OQLF headword. Do not add amidon de grains cireux or amidon glutineux as aliases: they name the broader waxy-starch class across cereal sources. Do not add amidon de riz gluant; the source-matched Canadian French product wording uses cireux, and riz gluant already names the grain.

## Integrated reference row

    {
      "id": "ingredient-ref-native-waxy-rice-starch",
      "nameEn": "native waxy rice starch",
      "nameFr": "amidon de riz cireux natif",
      "aliasesEn": ["waxy rice starch"],
      "aliasesFr": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-16T00:00:00Z",
      "category": "FLOUR_AND_STARCH"
    }

Use exactly one English alias, `waxy rice starch`. Quadra and BENEO use this contiguous phrase within their source-attested product wording “native waxy rice starch”; the ownership audit found no existing row with this exact phrase. It gives the broad `rice starch` picker query a contiguous match while keeping the grain-only alias `waxy rice` on the grain row. Keep French aliases empty because the display already supplies the candidate-specific French phrase. Do not add product brands or codes (REMYPURE, REMYLINE, S51, S52, F05148), generic `waxy starch`, `rice starch` / `amidon de riz`, generic native rice starch, glutinous starch, or grain-only names as aliases.

## Current ownership and picker projection

At the review snapshot before R189 integration, the package contained 1,568 active ingredient references, 122 forms, 61 legacy-import candidates, 1,913 research-ledger records, and 114 manifest-listed recipes. The ledger had 8,233 source entries, 7,028 distinct source IDs, and 5,822 distinct source URLs. The added alias was unowned in that snapshot.

| Current record | Current ownership and boundary |
|---|---|
| ingredient-ref-rice-starch | rice starch / amidon de riz; no aliases, forms, default density, or unit mappings. Its ledger states verified identity, no supported reusable value, and no supported substitute. |
| ingredient-ref-modified-rice-starch | modified rice starch / amidon de riz modifié; no aliases, forms, density, or mappings. |
| ingredient-ref-pregelatinized-rice-starch | pregelatinized rice starch / amidon de riz prégélatinisé; English spelling aliases only. |
| ingredient-ref-glutinous-rice | Grain display glutinous rice / riz gluant; English aliases include waxy rice and sweet rice, and French aliases include riz doux and riz glutineux. |
| Forms, legacy identities, and ledger | No rice-starch form or native-waxy candidate is allocated. The R189 reference and ledger record are active; all seven new source IDs are attached to that record. The English alias `waxy rice starch` had no prior owner and now belongs only to the new reference. |

The picker normalizes accents and punctuation, returns complete normalized word-phrase matches first, then falls back to substring matching. The table projects that behavior using current names and aliases plus the proposed display names and the single English alias `waxy rice starch`; no forms are added.

| Query | Current results | If accepted | Effect |
|---|---|---|---|
| native waxy rice starch | None | Native waxy rice starch | Candidate-specific English phrase resolves to the new row. |
| waxy rice starch | None | Native waxy rice starch | The unique, source-attested English alias matches the product-class phrase. |
| amidon de riz cireux natif | None | Native waxy rice starch | Candidate-specific French display resolves to the new row. |
| amidon de riz cireux | None | Native waxy rice starch | Complete phrase appears in the proposed French display. |
| rice starch | Rice starch; modified rice starch; pregelatinized rice starch | Those three plus native waxy rice starch | The alias supplies the contiguous phrase `rice starch`, so the broad family search gains a fourth, source-qualified choice. |
| amidon de riz | Amidon de riz; amidon de riz modifié; amidon de riz prégélatinisé | Those three plus amidon de riz cireux natif | Broad French family search gains the new subtype. |
| waxy rice | Glutinous rice | Glutinous rice; native waxy rice starch | Search broadens to show both grain and extracted starch. The grain remains selectable; no alias ownership is duplicated. |
| modified rice starch / amidon de riz modifié | Modified rice starch | Modified rice starch | The process-qualified search remains specific to the existing modified row. |
| pregelatinized rice starch / amidon de riz prégélatinisé | Pregelatinized rice starch | Pregelatinized rice starch | The process-qualified search remains specific to the existing pregelatinized row. |

The widened `waxy rice` query is an expected grain/starch family result, not a claim that the grain and its extracted starch are synonyms. The alias `waxy rice starch` lets that broad query surface both rows while keeping the exact grain-only alias `waxy rice` on the active grain reference.

## Recipe-corpus demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned across ingredient names, original text, and reference IDs. No occurrence was found for native waxy rice starch, waxy rice starch, amidon de riz cireux, amidon de riz cireux natif, ordinary rice starch / amidon de riz, or the proposed ID. No recipe line is linked to the existing rice-starch row. The corpus therefore provides no candidate demand, alias, or recipe-link basis.

## Measures, density, forms, and substitutions

The Canadian supplier catalog identifies a powder form, which is not a household measure or a mass-per-volume value. The reviewed supplier and manufacturer materials provide no supported cup/spoon mass, g/ml density, household unit mapping, cooking conversion, or cooking yield for the identity. Keep defaultDensity null and unitMappings empty; add no form or measurement observation.

The materials describe ingredient functionality in commercial applications, but provide no tested home-recipe ratio for replacing ordinary rice starch, modified rice starch, corn starch, tapioca starch, potato starch, or flour. Functional similarity, amylopectin content, and technical applications do not establish an equal-amount culinary substitution. Add no substitution finding or active rule.

## Integrated ledger record

The active ingredient_reference record for ingredient-ref-native-waxy-rice-starch uses seven source IDs, each mapped to one URL in the source register below. It has no measurements or substitution findings:

    {
      "recordId": "ingredient-ref-native-waxy-rice-starch",
      "recordType": "ingredient_reference",
      "identityState": "verified",
      "measurementState": "researched_no_supported_value",
      "substitutionResearchState": "researched_no_supported_substitute",
      "sources": [
        {
          "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S01",
          "sourceKind": "other",
          "url": "https://www.quadragroup.store/search?category=quadra-technologies-food-ingredients-texture-consistency-thickeners&filters=canada%2Csupplied-by-tate-lyle%2Ciff%2Ckmc%2Csupplied-by-nexira-inc%2Cbeneo%2Csupplied-by-idealfoods%2Csupplied-by-fiberstar%2Csupplied-by-mgp-ingredients-inc%2Csupplied-by-lucid-colloids-ltd%2Csupplied-by-neimenggu-fufeng-biotechnologies-co-ltd%2Csupplied-by-manitoba-starch-products&focus_on=products&page=3",
          "title": "Quadra, Canada-available Beneo rice-starch products",
          "accessedOn": "2026-10-16",
          "locator": "REMYPURE S51 and the related product listing; product code F05148.",
          "supports": "Lists REMYPURE S51 as Canada available, powder, derived from polished waxy rice, and a functional native waxy rice starch."
        },
        {
          "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S02",
          "sourceKind": "other",
          "url": "https://www.quadragroup.store/fr-CA/products?filters=certifications-compliance-belgian-law-and-codex-alimentarius-standards",
          "title": "Quadra fr-CA, Produits",
          "accessedOn": "2026-10-16",
          "locator": "REMYPURE S51, product code F05148.",
          "supports": "Lists Canada availability and describes the item as powder of functional native waxy rice starch, using amidon de riz cireux natif."
        },
        {
          "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S03",
          "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2085948/amidon-de-grains-cireux",
          "title": "Office québécois de la langue française, amidon de grains cireux (GDT)",
          "versionOrDate": "Last updated 1987",
          "accessedOn": "2026-10-16",
          "locator": "Definition, preferred terms, and note on cereal-source naming.",
          "supports": "Defines waxy starch as cereal starch especially rich in amylopectin, and lists amidon de grains cireux and amidon glutineux. This is general terminology, not a rice-specific retail label.",
          "sourceKind": "regional_authority"
        },
        {
          "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S04",
          "url": "https://www.beneo.com/wp-content/uploads/2022/09/beneo-brochure-specialty-rice-ingredients-en-202209v7-web.pdf",
          "title": "BENEO, Applications & benefits: specialty rice ingredients",
          "versionOrDate": "2022 brochure",
          "accessedOn": "2026-10-16",
          "locator": "Rice-starch product portfolio tables.",
          "supports": "Separates native waxy rice starch from native regular rice starch and pre-cooked waxy rice starch; named product grades and technical properties remain product-specific.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S05",
          "url": "https://www.beneo.com/wp-content/uploads/2020/09/beneo-one-pager-rice-starch-fr-052020-web.pdf",
          "title": "BENEO, Amidon de riz cireux biologique",
          "versionOrDate": "2020 product sheet",
          "accessedOn": "2026-10-16",
          "locator": "Remyline O AX DR product description.",
          "supports": "Uses the exact French product wording amidon de riz cireux biologique for BENEO's waxy rice-starch product; product claims and performance are SKU-specific.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S06",
          "url": "https://enjoylifefoods.ca/fr/glossaire-des-ingredients/",
          "title": "Enjoy Life Foods Canada, Glossaire des ingrédients",
          "accessedOn": "2026-10-16",
          "locator": "Entry Amidon de riz.",
          "supports": "A Canadian food manufacturer's French-language ingredient glossary describes rice starch used in its products as native starch prepared from waxy rice. It supports Québec-facing wording and human-food use, not a standalone starch retail package.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S07",
          "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon",
          "title": "Office québécois de la langue française, amidon (GDT)",
          "versionOrDate": "Last updated 2026",
          "accessedOn": "2026-10-16",
          "locator": "Preferred general term and note distinguishing fécule.",
          "supports": "Supports amidon as the general Québec French term for starch and reserves the more specific fécule sense for starch in tubers or underground plant organs.",
          "sourceKind": "regional_authority"
        }
      ],
      "measurementObservations": [],
      "substitutionFindings": [],
      "decisions": [
        {
          "outcome": "accepted",
          "reason": "Add identity-only native waxy rice starch / amidon de riz cireux natif with the unique English alias waxy rice starch, attested within Canadian and manufacturer product wording. The French-Canadian supplier description supports the French display. Keep it separate from ordinary, modified, and pregelatinized rice starch and from waxy-rice grain.",
          "sourceIds": [
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S01",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S02",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S03",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S04",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S05",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S06",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S07"
          ]
        },
        {
          "outcome": "unresolved",
          "reason": "The reviewed sources do not establish a reusable household measure, density, unit mapping, conversion, or yield. Keep the default density null and mappings empty.",
          "sourceIds": [
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S01",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S02",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S04",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S06"
          ]
        },
        {
          "outcome": "unresolved",
          "reason": "The reviewed product and application material describes food functionality but supplies no tested general or contextual replacement ratio for home recipes. Add no active substitution rule.",
          "sourceIds": [
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S01",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S04",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S05",
            "WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S06"
          ]
        }
      ]
    }

## Reopen conditions

Reopen the identity only if the current product boundary changes materially or a new source calls a different grade native waxy rice starch. Reopen French naming if a Québec product label or OQLF entry supplies a preferred, conflicting, or narrower product term. Reopen the English alias if current ownership changes or a source shows that `waxy rice starch` names a different or broader category. Reopen measures, density, or substitutions only when a source reports a product-matched household measure, direct mass/volume measurement, or tested recipe replacement with an explicit amount and scope. Recheck picker projections if the display, alias, or neighboring rice-starch rows change. Do not reopen the water-chestnut naming or product ambiguity as part of this item.

## Source register

Each integrated source ID below maps to exactly one URL.

| Source ID | Source and bounded evidence |
|---|---|
| WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S01 | Quadra, [Canada-available Beneo rice-starch products](https://www.quadragroup.store/search?category=quadra-technologies-food-ingredients-texture-consistency-thickeners&filters=canada%2Csupplied-by-tate-lyle%2Ciff%2Ckmc%2Csupplied-by-nexira-inc%2Cbeneo%2Csupplied-by-idealfoods%2Csupplied-by-fiberstar%2Csupplied-by-mgp-ingredients-inc%2Csupplied-by-lucid-colloids-ltd%2Csupplied-by-neimenggu-fufeng-biotechnologies-co-ltd%2Csupplied-by-manitoba-starch-products&focus_on=products&page=3), accessed 2026-10-16. Lists REMYPURE S51 and S52 as Canada-available powders derived from polished waxy rice and used as native waxy rice starches. Product performance and powder form do not establish household measures. |
| WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S02 | Quadra, [fr-CA products](https://www.quadragroup.store/fr-CA/products?filters=certifications-compliance-belgian-law-and-codex-alimentarius-standards), accessed 2026-10-16; REMYPURE S51, code F05148. The French-Canadian supplier page lists Canada availability and the wording amidon de riz cireux natif fonctionnel. It is supplier terminology, not evidence of Québec-specific local inventory. |
| WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S03 | OQLF, [amidon de grains cireux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2085948/amidon-de-grains-cireux), accessed 2026-10-16; last updated 1987. Defines waxy starch as starch especially rich in amylopectin extracted from some cereal cultivars and provides preferred terms. The record is general to waxy cereal starch, not a rice product listing. |
| WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S04 | BENEO, [Applications & benefits: specialty rice ingredients](https://www.beneo.com/wp-content/uploads/2022/09/beneo-brochure-specialty-rice-ingredients-en-202209v7-web.pdf), 2022. Product tables distinguish native waxy rice starch, native regular rice starch, and precooked waxy rice starch. Technical performance is grade-specific and not a culinary replacement ratio. |
| WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S05 | BENEO, [Amidon de riz cireux biologique](https://www.beneo.com/wp-content/uploads/2020/09/beneo-one-pager-rice-starch-fr-052020-web.pdf), 2020 product sheet. Uses the French product wording for the waxy rice starch Remyline O AX DR; its organic and application claims are specific to that grade. |
| WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S06 | Enjoy Life Foods Canada, [Glossaire des ingrédients](https://enjoylifefoods.ca/fr/glossaire-des-ingredients/), accessed 2026-10-16, entry Amidon de riz. The Canadian food manufacturer describes rice starch used in its products as native starch prepared from waxy rice. This supports Québec-facing human-food wording but is not a standalone starch package. |
| WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S07 | OQLF, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), accessed 2026-10-16; last updated 2026. Supports amidon as the general Québec French term for starch and distinguishes fécule as a more specific term for starch in tubers or underground plant organs. |

This database-JSON-only integration required no software tests under AGENTS.md. Static package, ledger/schema, generated-index, picker, corpus, source-ID, encoding, and scoped whitespace checks were used.
