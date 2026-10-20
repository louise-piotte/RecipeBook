# WP02 Section 04 B3 — Bunya seed starch identity review (R102)

- **Reviewed:** 2026-10-14.
- **Status:** Accepted and integrated 2026-10-14. The static audit below records the pre-integration snapshot.
- **Open checklist:** Section 04 B3, “Water-chestnut flour and other documented regional starches.”
- **Scope:** Starch physically isolated from edible Bunya seed, identified as *Araucaria bidwillii*. Keep this separate from whole Bunya nuts, the held Bunya-flour candidate, Brazilian pinhão flour, and all other Araucaria species.
- **Source-ID prefix:** WP02-B3-BUNYA-SEED-STARCH-R102-20261014. These identifiers are proposal-local until integration.

## Recommendation

**Add one narrowly scoped, identity-only reference for Bunya seed starch in FLOUR_AND_STARCH.** A 2025 primary study isolates starch from Bunya kernels as a separate sample and analyzes it apart from raw, whole, roasted, boiled, and fermented Bunya flours. The source species and isolated fraction are clear enough to represent a distinct ingredient identity. This proposal does not claim that isolated Bunya starch is a current retail product in Québec or Canada. [S01–S04]

Use the descriptive English display **Bunya seed starch** and provisional Québec French display **amidon de graines de bunya**. The French compound is a transparent construction from the already represented French seed name and OQLF’s preferred general starch term; it is not an OQLF headword or verified Québec product label. Keep aliases, forms, measures, conversions, recipe links, yields, and substitutions empty. [S03–S05]

This is a separate extracted ingredient identity, not a form of Bunya nuts or Bunya flour. The seed fraction studied is from *A. bidwillii*. Do not extend the row to Brazilian pinhão (*A. angustifolia*), Chilean piñón (*A. araucana*), Pinus pine nuts, genus-wide Araucaria starch, or starch-containing whole seed flour.

## Identity and language boundary

| Candidate | Evidence and disposition |
|---|---|
| Bunya seed starch | The primary study describes a seed-specific starch-isolation method and analyzes the recovered starch separately from the whole and processed flours. Use this as the candidate identity. The article’s materials are Bunya kernels from southeast Queensland; it does not define a commercial grade or prove that every product sold as Bunya starch shares its process. [S01] |
| Bunya nut starch | The University of Queensland’s 2022 research summary uses this English wording for the starch property being studied. Retain it as source language in this review, not as an alias: the current picker would make the broad query “nut starch” select this candidate and suppress its existing chestnut-starch fallback result. [S02; live picker projection below] |
| amidon de graines de bunya | Provisional descriptive French display. OQLF prefers amidon generally and reserves fécule more specifically for starch contained in tubers or underground plant organs. The seed is not an underground organ. A French-language botanical note outside Québec calls the edible seeds noix de bunya; the active whole-seed reference already displays noix de bunya. Neither source attests the compound starch name for Québec. [S03, S05] |
| Bunya-bunya, pin bunya, araucaria de Bidwill | EPPO lists these as French common names for *Araucaria bidwillii*. They support species identification only, not the name of an extracted food starch. Do not add them as aliases or replace the seed-specific French construction with an unqualified genus name. [S04] |
| Pinhão, piñón, pine nut, chestnut | Keep these separate. The live Brazilian pinhão flour is from *A. angustifolia*; the Chilean piñón is from *A. araucana*; Pinus pine nuts are another genus; and chestnut starch has its own live row. Similar seed use or starch content does not establish product synonymy or culinary equivalence. |

No aliases are proposed. In particular, do not activate Bunya nut starch, pine-nut starch, Araucaria starch, pinhão starch, piñón starch, noix d’araucaria, or a fécule construction. The source wording Bunya nut starch creates the specific picker collision documented below; the other terms broaden the source beyond the reviewed species or lack Québec product-name support.

## Proposed canonical data

If accepted, add exactly one reference:

| Field | Value |
|---|---|
| ID | ingredient-ref-bunya-seed-starch |
| English display | Bunya seed starch |
| French display | amidon de graines de bunya |
| English aliases | none |
| French aliases | none |
| Category | FLOUR_AND_STARCH |
| Default density | null |
| Unit mappings | none |
| Forms | none |

The ID has no exact owner in the current references, forms, legacy candidates, or ledger. This proposal does not request a legacy candidate or recipe relinking.

## Live ownership and archive reconciliation

The current snapshot contains 1,438 ingredient references, 105 forms, 63 legacy candidates, and 1,778 research-ledger records. The only live Bunya reference is ingredient-ref-bunya-nuts, displayed as bunya nuts / noix de bunya, with bunya nut as its English alias. It is categorized as NUT_SEED_AND_DRIED_FRUIT and has no linked form, default density, or unit mapping. No active reference, form, legacy candidate, or ledger record owns Bunya starch or the proposed ID.

The open B3 parent item still covers other documented regional starches. The recently integrated sacred lotus seed starch is a different species and source fraction. The R86 Bunya-flour review is adjacent evidence only: it explicitly excluded isolated Bunya starch from its flour decision, and its integration held only the flour candidate. No proposal or batch in the focused B3 archive allocates or holds a Bunya-starch identity. The live Brazilian pinhão-flour row is separately scoped to *A. angustifolia*. [S06]

## Picker projection

The current search matches complete normalized word phrases first, then uses substring fallback only if the phrase pass has no result. The projection below adds the proposed displays with empty aliases:

| Query | Current result | With proposed row | Assessment |
|---|---|---|---|
| Bunya seed starch | No result | Bunya seed starch | Exact candidate discovery. |
| amidon de graines de bunya | No result | Bunya seed starch | Exact French candidate discovery. |
| bunya | Bunya nuts | Bunya nuts; Bunya seed starch | Appropriate related-source results. |
| bunya nut | Bunya nuts | Bunya nuts | Retains the current whole-seed phrase; the candidate remains discoverable by bunya or its full seed-starch phrase. |
| noix de bunya | Bunya nuts | Bunya nuts | Keeps the established French whole-seed display on its owner. |
| seed starch | Sacred lotus seed starch | Sacred lotus seed starch; Bunya seed starch | Shows the two source-qualified seed-starch identities. |
| nut starch | Chestnut starch, by substring fallback | Chestnut starch | Avoids adding the source wording Bunya nut starch as an alias. That alias would become a complete-phrase match and hide the current chestnut fallback result. |
| starch | 24 starch-related references | The same 24 plus Bunya seed starch | Adds one result to the broad starch query without displacing existing identities. |
| amidon | 18 references | The same 18 plus Bunya seed starch | Adds one result to the broad French term query. |
| Araucaria | No result | No result | Scientific genus and species are documented in this review, not added as searchable aliases; this avoids making a genus-level query select one species. |

The English display uses seed rather than nut to keep the candidate’s exact searchable identity from claiming the current generic nut-starch phrase. This leaves the source phrase “Bunya nut starch” unsearchable as a complete three-word query; users can find the row with Bunya or Bunya seed starch. Revisit that tradeoff only if picker behavior can preserve the existing nut-starch result.

## Recipe demand, measures, and substitutions

The manifest-listed bundle contains 114 recipes and 1,123 ingredient rows. A scan of each recipe’s text, ingredient names, and reference links found no Bunya, *Araucaria bidwillii*, Bunya seed-starch, or proposed French-name matches. There are zero links to the existing whole-Bunya reference. This snapshot supplies no recipe demand.

The primary study’s laboratory procedure removes the external husk, inner coating, and embryo; grinds the kernel in water; sieves the slurry; settles the starch; washes it; and dries it under vacuum. Its stated water-to-kernel ratio, sieve size, settling time, and final sample moisture are experimental-method details, not household measures or recipe conversions. No transferable bulk density or cup weight is established.

The study characterizes isolated starch and several flour preparations, but it does not provide a culinary trial showing Bunya seed starch can replace corn, tapioca, potato, chestnut, or another starch. Do not infer a conversion from Bunya nuts or Bunya flour, a starch yield for a kitchen recipe, a preparation form, or a contextual or global substitution rule. No active forms, measures, mappings, recipe links, conversions, yields, or substitutions are proposed.

## Source register

Sources were checked online on 2026-10-14. Publication or update dates are stated where the source provides them.

| ID | Source and finding | Limit |
|---|---|---|
| WP02-B3-BUNYA-SEED-STARCH-R102-20261014-S01 | Jaqueline Moura Nadolny et al., [Nutritional, functional and rheological properties of bunya nut flour as a versatile gluten-free option](https://pubmed.ncbi.nlm.nih.gov/39967089/), Food Research International 202 (2025), article 115627; published online 2025-01-06 and issued February 2025. The [University of Southern Queensland repository manuscript](https://research.usq.edu.au/download/8c377324ea77a3bf4b9af1f47a16a46e23fc81e527823141e6c87c4b080df456/3990751/1-s2.0-S0963996924016983-main.pdf) gives the starch-isolation methods. The researchers isolate starch from Bunya kernel separately from flour samples. | Primary laboratory study. It supports a distinct research-documented starch fraction, not a standardized consumer product, Québec retail label, household measure, or substitution. The method and sample endpoint remain study-specific. |
| WP02-B3-BUNYA-SEED-STARCH-R102-20261014-S02 | University of Queensland, [Native bunya nuts close to home for Brazilian researcher](https://chemeng.uq.edu.au/article/2022/08/native-bunya-nuts-close-home-brazilian-researcher), 2022-08-03. Identifies Bunya as the seed of *Araucaria bidwillii* and reports the researcher’s term Bunya nut starch for studied properties. | Institutional research summary, not a standalone product label or primary methods source. It also describes the cultural significance of whole Bunya nuts; this review does not attribute traditional use of isolated starch. |
| WP02-B3-BUNYA-SEED-STARCH-R102-20261014-S03 | Office québécois de la langue française, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Prefers amidon generally and explains the narrower contextual use of fécule for starch in tubers or underground organs. | General terminology only. It does not approve amidon de graines de bunya as a compound product name. |
| WP02-B3-BUNYA-SEED-STARCH-R102-20261014-S04 | EPPO Global Database, [Araucaria bidwillii (ARUBI)](https://gd.eppo.int/taxon/ARUBI), current taxonomic entry accessed 2026-10-14. Confirms the accepted species and lists French botanical common names including bunya-bunya, pin bunya, and araucaria de Bidwill. | Botanical nomenclature only; not food-product or Québec naming evidence. |
| WP02-B3-BUNYA-SEED-STARCH-R102-20261014-S05 | L’École Jardin-Forêt, [Bunya-Bunya, l’Araucaria bidwillii](https://ecolejardinforet.fr/wp-content/uploads/2025/01/Bunya-Bunya-lAraucaria-bidwillii.pdf), 2025 French-language plant note. Calls the edible seeds noix de bunya and describes them as starch-rich. | French source outside Québec; describes whole seeds, not isolated starch. |
| WP02-B3-BUNYA-SEED-STARCH-R102-20261014-S06 | [WP02 R86 Bunya nut-flour picker-boundary hold](wp02-b2-bunya-nut-flour-picker-boundary-hold-r86-20261013.md), integrated 2026-10-13. Records the whole-Bunya live owner and explicitly excludes isolated Bunya starch from the flour candidate. | Archive reconciliation only; it does not itself establish the starch product. |

Targeted searches of OQLF and exact Canadian/Québec phrases for Bunya starch and Bunya-seed starch found no Québec terminology entry or Canadian/Québec package name. This is a bounded search result, not proof that no such product exists elsewhere.

## Static review record

Checked current AGENTS.md, Requirements.md, roadmap.md, the open Section 04 B3 checklist, the R86 Bunya-flour decision and batch, current references/forms/legacy/ledger, the active picker implementation, and all 114 manifest-listed recipes. Confirmed the proposed ID and source prefix are unused; the existing whole-Bunya identity remains the only live owner. Replayed current and hypothetical picker queries using the complete-phrase-first and substring-fallback rules. Verified source dates and direct source URLs, the proposal-local archive link, and the recipe counts above.

The proposal is UTF-8 without BOM, ends with a newline, and has no trailing whitespace. No app tests, Gradle tasks, emulator runs, or deployment were performed; this is proposal-only work.

## Integration update

Accepted the identity-only reference `ingredient-ref-bunya-seed-starch` with no aliases, forms, measurements, conversions, recipe links, yields, or substitutions. The canonical JSON and generated catalog index now include the row; the research ledger contains the six source records and accepted identity decision. The checklist and roadmap record this integration while keeping the broader Section 04 B3 work open. See the [integration README](../batches/wp02-b3-bunya-seed-starch-identity-integration-20261014/README.md). No app, Gradle, instrumentation, or emulator tests were run because this change only adds database JSON data and its generated catalog index.

Static validation passed: bundled-package normalization and validation, reference normalization, generated-index freshness (1,439 references), and research-ledger validation (1,779 records, zero errors). Picker projections retain the chestnut-starch fallback for `nut starch`; exact English and French Bunya seed-starch queries each return one result. The 114-recipe / 1,123-row scan found no candidate demand. Encoding, local links, and scoped whitespace checks passed.
