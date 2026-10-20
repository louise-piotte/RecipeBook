# WP04 Section P — eulachon / eulakane market and picker boundary review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Review of one regional finfish species identity, Canadian/Québec name ownership,
  current market scope, picker behavior, recipe demand, measurements, product forms, and substitution
  limits.
- **Disposition:** Keep eulachon outside the active catalog pending a current, species-matched
  Canadian consumer-product or recipe request. The species and the English/French terminology are
  well supported. CFIA lists the English common name **Eulachon** for *Thaleichthys pacificus* but
  gives no French common name; OQLF and DFO support **eulakane** in French. The current 2026 DFO
  plan establishes that Fraser River commercial and recreational fishing is closed while limited
  Indigenous food, social, and ceremonial harvest remains authorized under communal licences. This
  finding is specific to the Fraser management area and does not establish the market status of
  every B.C. population or override Indigenous food harvesting and trade.
- **Proposal-stage worktree scope:** Only this proposal was edited at review time. No shared catalog,
  ledger, plan, roadmap, recipe, generated file, or application code changed. No tests or emulator
  checks were run.

## Decision

The identity candidate is the single species *Thaleichthys pacificus*, commonly called **eulachon**
in English and **eulakane** in Québec French. The CFIA Fish List and the current Pacific Fishery
Regulations identify the English name and taxon. OQLF’s fish terminology record and DFO’s 2026
French fisheries plan support eulakane. These sources establish the species and a defensible
bilingual name pair; they do not establish an active Canadian retail product or a recipe request.

| Conditional candidate ID | Category if later allocated | English name | Québec French name | Taxon | Conditional aliases |
|---|---|---|---|---|---|
| ingredient-ref-eulachon | PROTEIN | eulachon | eulakane | *Thaleichthys pacificus* | None |

This is a candidate shape for future review, not an active catalog row, ledger record, or allocation
of an alias. The proposed row remains held. The record should be reconsidered only if an exact
recipe or a current, species-matched Canadian consumer product resolves the relevant product state
and label scope. The absence of a current retail example found in this review is not proof that
eulachon is unavailable everywhere in Canada.

## Identity, Canadian name scope, and market boundary

The CFIA Fish List query for eulachon returns *Thaleichthys pacificus* under the English common name
**Eulachon**, with the French-name field blank. CFIA explains that its Fish List supplies common
names recognized for fish labelling in Canada, and its guidance says the listed common name(s) are
the names to use for the species sold or processed in Canada. Treat the blank French field as a
market-label gap, not as evidence against the OQLF term or as proof that eulachon cannot be sold.

OQLF’s GDT entry for *poisson-chandelle* identifies *T. pacificus* and lists **poisson-chandelle**,
**eulachon**, and **eulakane** among its preferred French terms. The English terms include
**candlefish**, **eulachon**, and several spelling or regional variants. DFO’s current French 2026
Fraser plan consistently uses **eulakane**, making it the conditional French display here. A
terminology entry and a French fisheries plan establish a French name; they do not replace CFIA’s
missing French Fish List label or establish a retail SKU.

The DFO 2026 Integrated Fisheries Management Plan is specifically for Fraser River eulachon. It
reports poor returns and conservation concerns; commercial and recreational fisheries remain closed
in the plan’s Fraser management area. The remaining Indigenous food, social, and ceremonial harvest
is authorized by case-by-case communal licences. DFO documents fresh consumption, smoking, drying,
salting, and rendering into eulachon oil or grease in this Indigenous food context. Do not read the
closure as a ban on all food use, and do not generalize the Fraser rule to Nass/Skeena or other B.C.
populations. The plan’s account of Indigenous harvest, community trade, and cultural food use is not
evidence of ordinary retail supply.

A targeted search for current Canadian or Québec consumer listings using eulachon, eulakane, and *T.
pacificus* did not locate a species-matched consumer product. This negative search has limited
reach: it cannot prove that no product is available through a community-specific, local, seasonal,
or other channel. The result is sufficient to avoid making a retail-market claim or adding an active
default ingredient without recipe demand.

Keep this candidate separate from Atlantic capelin (*Mallotus villosus*), American smelt (*Osmerus
mordax*), and New Zealand whitebait, which is a separate multi-species product class. Eulachon’s
placement in the smelt family and OQLF’s comparative definition as a large Pacific smelt do not make
it an alias, species, or preparation of capelin, smelt, or whitebait. Do not use *Thaleichthys
pacificus* as a display name or picker alias.

## Exact ownership, prior work, and picker behavior

The live-worktree exact-name audit found no owner for the candidate ID, the proposed bilingual
names, the taxon, or the reviewed alternate names in active references, forms, legacy candidates, or
ledger record IDs. A repository search of the Section P plan, prior proposals, batches, catalog
files, and ledger found no earlier dedicated eulachon proposal, allocation, or hold. This is a new
boundary review and does not reopen Atlantic capelin, American smelt, Pacific tomcod, or the
fish-powder / fish-ball / surimi decisions.

The Section P finfish checklist remains open for regional fish. This packet reviews eulachon as one
separate whole-fish species candidate under that item; it does not treat the candidate as an alias
or product of another smelt-family fish.

The audit covered 1,311 active references, 98 forms, 64 legacy-import candidates, and 1,619
research-ledger records. It searched the displays, aliases, form labels and match terms, legacy
names, record IDs, and source IDs. No exact or normalized owner was found for:

- Candidate IDs ingredient-ref-eulachon and candidate-eulachon.
- Eulachon, eulakane, poisson-chandelle, candlefish, eulachan, oolachan, oolakan, oolichan,
  hooligan, and *Thaleichthys pacificus*.
- The proposal-local source-ID prefix WP04-P-EULACHON-SCOPE-20261012-R5.

Picker results were projected from the current IngredientReferenceSearchIndex and
normalizeIngredientSearchKey implementation in IngredientSearch.kt. The current search checks
complete word phrases before substring fallback. The hypothetical row in the table below uses only
the conditional display names eulachon / eulakane, with no aliases; it is shown to document search
behavior, not to suggest adding the row now.

| Query | Current picker result | With conditional display-only row | Decision |
|---|---|---|---|
| eulachon | None | eulachon / eulakane | Candidate-specific query; currently unowned. |
| eulakane | None | eulachon / eulakane | Candidate-specific French query; currently unowned. |
| smelt | American smelt | American smelt | Do not add smelt as an alias; the new display would not intercept this query. |
| éperlan | American smelt | American smelt | Preserve the existing species identity and do not infer eulachon from the broader comparison. |
| capelin | Atlantic capelin | Atlantic capelin | Keep the separate species result. |
| candlefish | None | None | Do not add this English alternative as an alias. |
| poisson-chandelle | None | None | Do not add this French alternative as an alias. |

OQLF and TERMIUM document additional English and French variants, including regional spellings. They
are not needed for a species-specific row and should not be copied into global aliases without
product or recipe evidence for the intended market. In particular, do not add the broad term smelt
or éperlan, and do not import region-specific or source-specific names as universal aliases.

## Bundled recipe demand

The package manifest lists 114 recipe paths. I scanned all 114 parsed recipe files, all 1,123
ingredient rows, and their serialized JSON text for eulachon, eulakane, poisson-chandelle,
candlefish, the identified spelling variants, *Thaleichthys pacificus*, and sibling terms used to
check the boundary, including smelt, éperlan, and capelin.

**Result: zero candidate-term hits in recipe ingredient rows and zero candidate-term recipe files.**
No recipe requests eulachon, eulachon oil/grease, or any eulachon preservation state. The two
generic “fish sauce” ingredient rows are condiment requests, not whole-fish demand. No recipe link,
amount, preparation-state relink, or species substitution is supported.

## Measurements, product forms, and substitutions

No active measure, form, density, unit mapping, conversion, edible yield, cooking yield, or package
yield is proposed.

- DFO’s 2026 species synopsis gives adult body lengths of approximately 15–20 cm and body weights of
  40–60 g. These are biological observations, not kitchen portions, fillet weights, standard counts,
  or edible yields.
- A targeted search in the 2015 Health Canada CNF online app for eulachon, eulakane, and *T.
  pacificus* did not surface a species-matched serving-portion entry. Health Canada published a 2026
  CNF dataset with food-name and measure-conversion files, but the raw CSV download was inaccessible
  through the browser tool during this review. The 2026 data were not audited, so this proposal
  makes no claim about whether they contain an eulachon entry. No measure or conversion is proposed
  pending a species-specific, accessible source.
- DFO reports fresh, smoked, dried, and salted fish and rendered oil/grease as foods in the Fraser
  First Nations food, social, and ceremonial context. These descriptions do not establish universal
  catalog forms or current retail presentations. The rendered oil/grease is a distinct processed
  product; it is not an alias for whole eulachon and must not be represented as a reversible
  same-fish form without a separate product and recipe review.
- No reviewed source supplies a recipe-specific, method- and quantity-backed substitute for
  eulachon. Do not substitute American smelt, Atlantic capelin, anchovy, herring, or generic fish by
  family, size, oil content, or culinary similarity. Add no global form conversion, yield, or
  contextual substitution rule.

## Recommendation and revisit conditions

Keep Section P open and leave eulachon unallocated. Revisit when at least one of these is available:

1. A bundled recipe that names eulachon or eulakane and identifies the intended fish product or
   preparation.
2. A current Canadian product whose species and market name are explicit, including the product’s
   French label scope if one is claimed.
3. Current authoritative market or harvest information for the specific population and channel being
   represented.

Before any later integration, recheck exact ownership, the 2026 fisheries status for the population
and area, the accepted Canadian common name(s), and picker behavior. Keep any whole-fish,
preserved-fish, and rendered grease products distinct. Require source-specific evidence before
adding measurements, forms, conversions, yields, recipe links, or substitutions.

## Sources

Online sources were checked on 2026-10-12. Source IDs below are proposal-local and were absent from
the live ledger before this review. CFIA’s legacy search endpoint may not render in every browser
client; its query result was inspected through the official Fish List result page. A direct OQLF
page request returned a browser-cache miss, but the search result exposed the complete GDT entry
used here. The 2026 CNF portal metadata was accessible, but its raw CSV download was not accessible
through the browser tool, so those data were not reviewed.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-P-EULACHON-SCOPE-20261012-R5-S01** | CFIA, [Fish List query for Eulachon](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Eulachon) | Lists *Thaleichthys pacificus* as **Eulachon**, with no French common-name value in the result. Canadian fish-label terminology; not proof of present retail inventory or a recipe use. |
| **WP04-P-EULACHON-SCOPE-20261012-R5-S02** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains the Fish List’s Canadian labeling role and the rule that the common names listed for a species should be used when it is sold or processed in Canada. This supports the label-scope concern; it does not negate OQLF’s terminology entry. |
| **WP04-P-EULACHON-SCOPE-20261012-R5-S03** | OQLF, [poisson-chandelle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8395815/poisson-chandelle), last updated 1996 | Identifies *T. pacificus*, gives French preferred terms including **eulakane**, **eulachon**, and **poisson-chandelle**, and records English alternatives including **candlefish**. Terminology evidence, not current market-label evidence. |
| **WP04-P-EULACHON-SCOPE-20261012-R5-S04** | Fisheries and Oceans Canada, [Fraser River eulachon 2026 integrated fisheries management plan summary](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/eulachon-eulakane-ifmp-pgip-sm-eng.html) and [French plan summary: Eulakane du fleuve Fraser 2026](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/eulachon-eulakane-ifmp-pgip-sm-fra.html) | Current English/French species naming, Fraser River commercial and recreational closures, case-by-case communal food/social/ceremonial harvest, food uses, and biological size context. Applies to the Fraser River plan; it does not establish market status for every eulachon population or consumer retail availability. |
| **WP04-P-EULACHON-SCOPE-20261012-R5-S05** | Department of Justice Canada, [Pacific Fishery Regulations, 1993, Schedule I](https://laws-lois.justice.gc.ca/eng/regulations/SOR-93-54/section-sched956610.html?txthl=crayfish), current to 2026-09-21 | Lists **Eulachon** with *Thaleichthys pacificus* in the common/scientific-name schedule. Regulatory identity and fishery scope; not a CFIA label or culinary-equivalence decision. |
| **WP04-P-EULACHON-SCOPE-20261012-R5-S06** | Health Canada, [2015 Canadian Nutrient File search](https://food-nutrition.canada.ca/cnf-fce/newSearch) and [Search by food help](https://food-nutrition.canada.ca/cnf-fce/help-aide) | Targeted search terms were eulachon, eulakane, and *T. pacificus*; no species-matched serving-size page surfaced in the 2015 online app. This is a limited negative lookup, not proof that no composition study or other food measurement exists. |
| **WP04-P-EULACHON-SCOPE-20261012-R5-S07** | Health Canada, [Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | The published dataset metadata lists 2026 Food Name and Measure Weight Conversion CSV files. Their download links were inaccessible through the browser tool during this review; the current files were not searched and no conclusion is made about their contents. |

At proposal-review time, no app tests or emulator checks were run because no shared data or application
code changed. Static JSON parsing, exact-key ownership scans, source-ID collision checks, picker
projection, and the manifest-ordered recipe scan were performed without modifying shared data.



## Integration result (2026-10-12)

Recorded this as a documentation-only market-scope hold. Eulachon / eulakane remains unallocated
pending a current, species-matched Canadian consumer product or a bundled recipe request that resolves
product state and label scope. The CFIA/OQLF/DFO name evidence establishes the species and bilingual
terminology; it does not establish ordinary retail supply. The Fraser River commercial/recreational
closure and limited communal food, social, and ceremonial harvest apply only within the cited Fraser
management context. Do not generalize the closure to all B.C. populations or to Indigenous food use.

No active reference, alias, legacy candidate, ledger record, form, measurement, recipe link, conversion,
yield, or substitution was added. The current audit found no owner across 1,312 references, 98 forms,
64 legacy entries, or 1,620 ledger records, and no matching term in the 114-file / 1,123-row corpus.
UTF-8/no-BOM, source-prefix, and whitespace checks passed. This documentation-only integration did
not require app tests or emulator checks. See the batch integration note. Section P remains open.
