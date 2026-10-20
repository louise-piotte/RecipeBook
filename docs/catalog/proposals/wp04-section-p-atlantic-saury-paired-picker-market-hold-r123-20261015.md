# WP04 Section P — Atlantic saury paired-picker and market review (R123)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** Atlantic saury, *Scomberesox saurus* (CFIA TSN 165612).
- **Distinct question:** Is there enough current Canadian or Québec food-market evidence to add Atlantic saury and promote the already verified Pacific-saury candidate as a pair, so broad `saury` and `balaou` searches no longer appear to select one species?
- **Recommendation:** Keep Atlantic saury outside active references and the research ledger; keep the existing `candidate-pacific-saury` ledger-only. CFIA and Québec terminology distinguish the taxa, and a paired picker projection would preserve their shared broad names. However, current Québec evidence describes no directed Canadian fishery and only low, irregular landings, usually as bycatch. The market review found no current Canadian or Québec product listing that identifies *S. saurus*, and the bundled recipe corpus has no demand.
- **Shared-data effect:** none. No ingredient reference, ledger record, alias, form, measure, recipe link, conversion, yield, or substitution is proposed in this review.
- **Tests:** none; proposal-only documentation.

## Why this is a distinct unresolved question

The open Section P finfish checklist still includes regional fish in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4656). The focused [Pacific-saury review](wp04-section-p-pacific-saury-balaou-picker-boundary-review-20261013.md) verified *Cololabis saira* and retained it as ledger-only because the current picker would make shared `saury` and `balaou` queries appear unique. That review cited *Scomberesox saurus* as the other CFIA-listed taxon but did not assess Atlantic saury's own current Canadian/Québec product evidence or decide whether both species merit active rows together.

This packet addresses Atlantic saury as that missing candidate and tests the paired-row option against the current picker. It does not reopen the Pacific identity record or infer that the two species are interchangeable. The later European-smelt review also used a qualified second species row to expose both smelts; the difference here is that the Canadian/Québec sources reviewed do not show comparable current food-market demand for Atlantic saury.

## Canadian and Québec naming

The CFIA Fish List links TSN 165612 to *Scomberesox saurus* and lists **Atlantic Saury / Balaou** as well as **Saury / Balaou de l’Atlantique**. It also links Pacific saury, *Cololabis saira* (TSN 165609), to **Pacific Saury / Balaou**, with qualified French names including **Balaou du Pacifique**. CFIA describes the Fish List as the Canadian source for acceptable English and French fish-label common names, scientific names, and TSNs. The current searchable list reports a 2023-09-18 data-modification date. These rows establish Canadian naming and show that the broad English `saury` and French `balaou` terms are shared; they do not establish culinary equivalence or require RecipeBook to create a row.

The OQLF GDT entry **balaou** is in edible-fish and ichthyology domains, prefers `balaou`, and pairs it with English `Atlantic saury` and a *Scomberesox* taxon. It was last updated in 1983 and prints the older genus spelling `Scombereson`; use the current CFIA spelling *Scomberesox saurus* for scientific scope. The federal TERMIUM Plus fish record, dated 2023-01-04, identifies *S. saurus*, lists `balaou` as a standardized French term and `balaou atlantique` as correct. It also warns that several English alternatives such as `needlefish`, `billfish`, and `garfish`, and French `aiguille de mer`, are used for other fish. For a future pair, the qualified display **Atlantic saury / balaou atlantique** is supported; add no aliases.

## Québec and Canadian market evidence and limits

The current Savoirs.Québec species page, published 2026-09-16 and validated by its editorial committee, identifies **balaou** as *S. saurus*. It says there is no directed commercial fishery for Atlantic saury in Canadian waters; reported landings are low and irregular, mostly in the southern Gulf, with occasional Québec catches generally as bycatch in fisheries targeting other pelagic species. This is current regional fishery evidence, not a complete survey of imported products or every fish counter.

The Government of Newfoundland and Labrador's 2010 **Atlantic Saury Project** release documents an exploratory trial in which whole-round frozen fish were processed and samples sent to Korean buyers. That is a dated feasibility project, not evidence of a current commercial supply, Québec retail sale, or a reusable frozen-whole form. The source confirms that a historic food-market experiment occurred, while the newer Québec species page reports no directed Canadian fishery.

The Québec-facing product evidence located in the bounded search was for the other species: Marché Korea's Montréal page lists a 400 g canned **Pacific Saury** product. It gives no Atlantic-saury or *S. saurus* identification. The Canadian catalog pages checked likewise offered Pacific saury, not a current Atlantic-saury product. Do not infer Atlantic species from `saury`, `balaou`, an incidental catch, or the presence of the Pacific product. Search coverage is not exhaustive, and no current Québec retail page was found that explicitly names *S. saurus*.

## Ownership, proposal archive, and picker audit

The read-only snapshot contains **1,468 ingredient references, 105 forms, 63 legacy candidates, 1,809 research-ledger records, and 114 manifest-listed recipes**. No active reference, form, or legacy candidate owns `Atlantic saury`, *S. saurus*, `balaou atlantique`, `ingredient-ref-atlantic-saury`, or `candidate-atlantic-saury`. The ledger has the existing `candidate-pacific-saury`; its CFIA source mentions Atlantic saury as the shared-name counterpart, but there is no Atlantic-saury record. Archive search found no Atlantic-focused proposal or batch; the Pacific review is the sole focused saury decision. The R123 proposal-local source-ID prefix below was unused in the proposal, batch, and ledger archives before drafting.

The projection follows the current phrase-first matcher in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which checks complete normalized word phrases in bilingual displays, aliases, and attached forms before falling back to substring matching. I projected an alias-free Atlantic row using `Atlantic saury / balaou atlantique`, first by itself and then paired with the existing candidate's conditional `Pacific saury / balaou du Pacifique` display. This is a static source-code projection, not a UI or emulator test.

| Query | Current active picker | With Atlantic row alone | With Atlantic and Pacific rows together |
|---|---|---|---|
| `Atlantic saury` / `balaou atlantique` | No result | Atlantic saury only | Atlantic saury only |
| `Pacific saury` / `balaou du Pacifique` | No result | No result | Pacific saury only |
| `saury` | No result | Atlantic saury only | Both species |
| `balaou` | No result | Atlantic saury only | Both species |
| `needlefish`, `aiguille de mer`, `billfish`, `garfish`, `saury pike` | No result | No result | No result; none are proposed as aliases |

Adding only Atlantic saury would reproduce the singleton problem identified for Pacific saury. Adding both names together would make the broad English and French queries return the two CFIA taxa and qualified searches remain species-specific. That paired result is a possible search representation, but it does not itself establish Canadian consumer demand for the Atlantic species. The recommendation is therefore to hold both out of active references for now, rather than activate the Pacific row solely to complete a picker pair.

## Bundled recipe demand and numeric or substitution boundaries

I scanned all **114** manifest-listed recipe JSON files and **1,123** ingredient rows, including ingredient display text, original source text, reference IDs, and all parsed string values. The candidate and broad-name scan covered `Atlantic saury`, *Scomberesox saurus*, `balaou`, `balaou atlantique`, `saury`, `Pacific saury`, *Cololabis saira*, `needlefish`, and `aiguille de mer`. It found **zero matching files and zero matching ingredient rows**. No bundled line supports an ingredient link, quantity, preparation state, or recipe-scoped substitution.

The historic 2010 whole-round-frozen trial is product-development evidence only. Add no frozen, fresh, raw, whole-round, canned, or cooked form. No source supports a reusable measure, density, unit mapping, portion, count conversion, yield, or volume-to-mass conversion for Atlantic saury; add none. No reviewed source supports a global or contextual substitution between Atlantic and Pacific saury, or between either saury and mackerel, sardine, herring, or another fish. Add no substitution rule.

## Recommendation

Keep *Scomberesox saurus* outside active references and the research ledger. Keep `candidate-pacific-saury` ledger-only. The Canadian naming and Québec terminology are sufficiently clear to describe the Atlantic identity, and a paired projection would prevent a single row from claiming broad `saury` or `balaou` searches. Current Canadian/Québec market evidence does not support activating the pair: the Atlantic species has no directed Canadian fishery, observed landings are limited and irregular, the current Québec product listing found is specifically Pacific saury, and the bundled recipe corpus has no demand.

If a future bundled recipe or current Canadian/Québec package identifies Atlantic saury as food, review the pair together using qualified displays and empty alias arrays. Do not add bare `saury`, `balaou`, `aiguille de mer`, `needlefish`, `billfish`, `garfish`, or the scientific names as aliases. Do not infer a product state, measurement, conversion, yield, or substitution. Section P remains open.

## Source register

Sources were accessed or rechecked on 2026-10-15. Proposal-local IDs below are not shared-ledger records; each URL's scope and limitations are stated.

| Source ID | Source and URL | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ATLANTIC-SAURY-R123-20261015-S01** | Canadian Food Inspection Agency, [Fish List results](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=saury) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Lists *S. saurus* (TSN 165612) with `Atlantic Saury / Balaou` and `Saury / Balaou de l’Atlantique`; lists *C. saira* (TSN 165609) with Pacific-qualified names and shared `Saury / Balaou`. The overview says the list supplies Canadian fish-labelling names and taxon IDs. Fish-label naming is not culinary equivalence or proof of current retail stock; the data table reports modification date 2023-09-18. |
| **WP04-SECTIONP-ATLANTIC-SAURY-R123-20261015-S02** | Office québécois de la langue française, [GDT: balaou](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435862/balaou) | Edible-fish/ichthyology entry; preferred French `balaou`, English `Atlantic saury`, and a *Scomberesox* taxon. Last updated 1983 and uses the older spelling `Scombereson`; use CFIA for current binomial spelling. |
| **WP04-SECTIONP-ATLANTIC-SAURY-R123-20261015-S03** | Government of Canada Translation Bureau, [TERMIUM Plus: BALAOU](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=BALAOU) | Fish record dated 2023-01-04 identifies *S. saurus*, standardizes `balaou`, and lists `balaou atlantique` as correct. It notes that `aiguille de mer` and several English common names can refer to other species. Terminology evidence, not retail availability. |
| **WP04-SECTIONP-ATLANTIC-SAURY-R123-20261015-S04** | Savoirs.Québec, [Balaou](https://savoirs.quebec/vivant/balaou), published 2026-09-16 | Identifies *S. saurus*, describes Québec occurrence, and reports no directed Canadian commercial fishery with low/irregular landings mostly as bycatch. Current regional status source; not a complete retail/import census or a legal harvest determination. |
| **WP04-SECTIONP-ATLANTIC-SAURY-R123-20261015-S05** | Government of Newfoundland and Labrador, [Atlantic Saury Project Supported by Provincial Government](https://www.releases.gov.nl.ca/releases/2010/fishaq/1124n03.htm), 2010-11-24 | Reports exploratory harvesting and processing, whole-round frozen samples sent to Korean buyers, and a feasibility/development purpose. Historical trial only; it does not show present commercial supply or Québec retail availability. |
| **WP04-SECTIONP-ATLANTIC-SAURY-R123-20261015-S06** | Fisheries and Oceans Canada, [Opportunity for a fishery for Atlantic Saury (*Scomberesox saurus*) in the Nova Scotia portion of the southern Gulf of St. Lawrence](https://publications.gc.ca/site/fra/9.587257/publication.html), 2010 | Canadian government research document on the species and proposed fishery. It is dated exploratory-fishery evidence, not a current product or recipe source. |
| **WP04-SECTIONP-ATLANTIC-SAURY-R123-20261015-S07** | Marché Korea, Montréal, [Dongwon canned Pacific saury, 400 g](https://marchekorea.com/shop/dongwon-dongwon-canned-pacific-saury-%EC%9E%90%EC%97%B0%EC%82%B0-%EA%BD%81%EC%B9%98%EC%BA%94-400g/) | Québec-facing product listing for Pacific saury only. It does not identify *S. saurus* and its package size is SKU-specific, not a serving or conversion. |

## Static review record

- Read `AGENTS.md`, the open Section P plan, current reference and form JSON, legacy candidates, research ledger, recipe manifest, recent WP04 proposals and batch READMEs, the Pacific-saury review, and the current matcher source.
- Audited 1,468 references, 105 forms, 63 legacy candidates, and 1,809 ledger records. No active Atlantic-saury owner was found; the only ledger match is the existing Pacific-saury candidate and its shared-name evidence.
- Projected the current matcher with the hypothetical Atlantic display alone and the Atlantic/Pacific pair. A singleton `saury` or `balaou` result occurs with either species alone; the pair returns both.
- Parsed all 114 manifest-listed recipes / 1,123 ingredient rows. Candidate and shared-term searches found no matching file or ingredient row.
- Checked the proposal-local source-ID prefix against proposals, batch READMEs, and ledger source IDs; no collision was found before drafting. Local links, UTF-8/no-BOM encoding, LF line endings, final newline, and whitespace were checked after writing.
- This is one proposal-only file. No shared catalog, ledger, plan, roadmap, generated index, recipe, code, or batch file was changed. No application or emulator tests were run.

## Integration disposition

Integrated as a documentation-only hold. No Atlantic-saury reference or research-ledger record was added; the future paired-picker requirement for Pacific saury remains documented. No tests were needed. See the [integration record](../batches/wp04-section-p-atlantic-saury-market-hold-integration-r123-20261015/README.md).
