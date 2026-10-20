# WP03 Section M follow-up: sapote boundaries, baobab pulp, and regional fruits

- **Reviewed:** 2026-10-10
- **Status:** proposal only. This packet creates this file only; it does not edit references, forms, recipes, legacy candidates, the ledger, tests, code, plan, roadmap, or other proposals.
- **Scope:** the open Section M sapote and baobab items, plus the named regional fruit leads `maqui` and `cocona` from the WP06 South American cuisine sweep. This is a bounded identity review, not a completion claim for Section M or WP06.
- **Sources accessed:** 2026-10-10. Sources include the Office québécois de la langue française (OQLF), Government of Canada TERMIUM Plus and Agriculture and Agri-Food Canada (AAFC), Kew Plants of the World Online, the UK Food Standards Agency, the European and Mediterranean Plant Protection Organization, Chile's SIMEF, Peru's INACAL, and the French-language Pl@ntUse reference.
- **Coordinator integration:** all six scoped identities were accepted on 2026-10-10. The baobab fruit-pulp reference is categorized as `NUT_SEED_AND_DRIED_FRUIT` because the sourced ingredient is separated dried pulp; the other five are `FRUIT`. No unqualified sapote or baobab aliases and no recipe links were added. Provisional Québec wording remains subject to independent terminology review.

## Recommendation

Advance six identity-only `FRUIT` references for coordinator review:

| Candidate ID | English display proposal | Québec French display proposal | Disposition and scope |
|---|---|---|---|
| `ingredient-ref-mamey-sapote` | `mamey sapote (Pouteria sapota)` | `sapote (Pouteria sapota)` | **Accept.** OQLF's preferred French fruit term `sapote` is explicitly tied to *Pouteria sapota*. The species qualifier is retained in the display because the bare common name is used for other fruits too. Do not alias bare `mamey`, `sapote`, `marmalade plum`, or `mamey-zapote`. |
| `ingredient-ref-black-sapote` | `black sapote (Diospyros nigra)` | `sapote noire (Diospyros nigra)` | **Accept.** Covers the fruit of *Diospyros nigra*; Kew treats *D. digyna* as a synonym. This is a different genus and family from mamey sapote and sapodilla. Keep the French qualifier and species in the candidate display. |
| `ingredient-ref-white-sapote` | `white sapote (Casimiroa edulis)` | `sapote blanche (Casimiroa edulis)` | **Accept.** Covers *Casimiroa edulis*, a Rutaceae fruit. Retain the species qualifier; do not join it to either *Pouteria* or *Diospyros* sapotes. |
| `ingredient-ref-baobab-fruit-pulp` | `baobab fruit pulp (Adansonia digitata)` | `pulpe de fruit de baobab (Adansonia digitata)` | **Accept, narrowly scoped.** The named product is pulp separated from the shell and seeds of *A. digitata* fruit, as described by the UK FSA. The French display is a transparent proposal based on OQLF's description of the edible pulp; it is not presented as an OQLF-approved product term. |
| `ingredient-ref-maqui-berry` | `maqui berry (Aristotelia chilensis)` | `maqui du Chili (Aristotelia chilensis)` | **Accept.** Represents the named Chilean berry. EPPO supplies English and French names; Chile's SIMEF identifies the edible fruit and its regional food uses. Keep jam, syrup, honey, leaves, and any powder or extract separate. |
| `ingredient-ref-cocona` | `cocona (Solanum sessiliflorum)` | `cocona (Solanum sessiliflorum)` | **Accept.** The French-language Pl@ntUse page gives `cocona` in both languages and identifies the edible fruit; Peru's INACAL names the species and scopes its fresh-fruit standard. Do not widen this row to juice, sauce, or other processed products. |

**Québec terminology status:** OQLF directly supports `sapote` for *Pouteria sapota* and `baobab` for the tree, capsule, and edible pulp. The scoped search did not find separate OQLF fruit entries for black sapote, white sapote, maqui, cocona, or baobab fruit pulp. The French displays for those candidates follow TERMIUM, EPPO, and French botanical nomenclature where available, or use a transparent product description; mark them provisional pending Québec review. In particular, `sapote noire` is a fruit-label proposal informed by TERMIUM's `sapotier noir` and Pl@ntUse's French fruit name, not an OQLF term.

The sapote names are three separate species identities, not aliases of an unqualified sapote family. `Sapodilla / sapotille` is already represented by `ingredient-ref-sapodilla` and remains unchanged. OQLF's fruit entry distinguishes sapote from sapotille, while TERMIUM records that the unqualified common name `sapote` is also used for *Manilkara zapota* and *Diospyros nigra*. The species-qualified displays preserve those boundaries.

For baobab, the source evidence supports the pulp product, not an all-purpose `baobab fruit` reference. OQLF identifies the fruit capsule as `pain de singe`, describes its edible pulp, and separately names dried, powdered leaves as `lalo`. The FSA's scoped product entry identifies dried *A. digitata* fruit pulp and calls for the label name `Baobab fruit pulp`. Accordingly, keep whole capsule, shell, seeds, leaves/`lalo`, unspecified `baobab powder`, and other baobab products out of the candidate. The FSA record is used for product identity only; this packet makes no Canadian regulatory claim.

The regional fruit scope comes from two unresolved WP06 leads: `maqui` in the South American cuisine sweep and `cocona` in its Amazonian source list. Açaí and cupuaçu already have active references; guava is also active, and goiabada is a separate preserve lead. This packet does not duplicate them or claim broad regional coverage.

No recipe links, ingredient forms, measures, unit mappings, yields, conversions, or substitutions are proposed.

## Working-tree audit

The audit used the current bundled package and catalog on 2026-10-10: 665 active ingredient references, 33 forms, 86 legacy candidates, and 851 research-ledger records with 1,475 source entries and 1,242 distinct source IDs. The manifest contains 114 recipes. In manifest order, the recipe files contain 1,123 ingredient rows.

The proposed IDs were absent from active references, legacy candidates, and ledger record IDs. Candidate display terms were checked against active English/French reference names and aliases, forms, and legacy names using the catalog's search-key normalization (lowercase, Unicode NFKD, accent folding, punctuation-to-space, and whitespace collapse). No proposed full display has an exact normalized collision. The proposal-local source-ID prefix `WP03-M-SAPOTE-BAOBAB-20261010-S` had no match among the 1,242 current ledger source IDs when checked before drafting.

## Recipe-hit and collision audit

All 114 manifest-listed recipe files were scanned across all 1,123 ingredient rows, including original ingredient text, normalized ingredient name, reference ID, preparation, and nested bilingual notes. Whole-word searches covered `sapote`, `sapodilla`, `sapotille`, `mamey`, `black sapote`, `white sapote`, the three candidate botanical names and relevant synonyms, `baobab`, `pain de singe`, `Adansonia`, `maqui`, `maqui berry`, `maqui du Chili`, `Aristotelia chilensis`, `cocona`, and `Solanum sessiliflorum`. The scan found **zero direct recipe ingredient hits** for the proposed identities or the unresolved names. No recipe is relinked.

| Query boundary | Current result before this proposal | Proposal treatment |
|---|---|---|
| `sapodilla`, `sapotille`, *Manilkara zapota* | `ingredient-ref-sapodilla` owns `sapodilla / sapotille`; it is already the Section M identity. | Retain that row; add no sapodilla duplicate or `sapote` alias. OQLF explicitly discourages `sapote` for sapotille. |
| `sapote` | No exact live display or alias. The broader `sapot` prefix returns the active sapodilla French term `sapotille`. | No bare `sapote` alias. The three proposed qualified French displays share the generic token and are meant to remain separate results for a broad search. |
| `mamey` / `mamey-zapote` | No exact active term. OQLF notes `mamey-zapote` as a contextual name for canistel; TERMIUM also records `mamey` for the separate *Mammea americana* fruit. | Use `mamey sapote` only as the *Pouteria sapota* display. Do not add the short `mamey` or `mamey-zapote` alias; do not merge *Mammea americana* with it. |
| `black sapote`, `white sapote` | No exact live result. | Each full phrase and species-qualified display belongs to its own proposed ID. Do not use chocolate-pudding-fruit or Mexican-apple aliases. |
| `baobab`, `baobab fruit pulp` | No exact live result. | Use only the scoped fruit-pulp candidate. `pain de singe`, `lalo`, and unspecified `baobab powder` are not aliases. |
| `maqui`, `maqui berry`, `maqui du Chili` | No exact live result. | Use the full species-qualified fruit identity. No generic berry or wineberry alias is proposed. |
| `cocona` | No exact live result. The wider `cocon` prefix currently finds coconut, coconut milk/oil, cream of coconut, and shredded coconut references. | The full `cocona` phrase remains specific. Keep `topiro`, `cubiu`, and `peach tomato` out of aliases; none is needed to identify the scoped fresh fruit. |

The current source set does not settle an unqualified sapote identity or product scope for a whole baobab capsule. Those terms remain held even though several narrow identities can be named confidently.

## Regional-sweep reconciliation

I reviewed the Section M checklist, the open-fruit follow-up, the 2026-10-10 regional fruit proposal, the WP06 South American cuisine sweep, the Section M fruit integration notes, and the Amazonian fruit integration note. The previous Section M follow-up deferred unqualified sapote and baobab because the source set did not choose a safe species or sold-food scope. OQLF and Canadian terminology sources now distinguish the named sapote species, while current product evidence scopes baobab to fruit pulp.

For regional fruit, WP06 had recorded `maqui` as a Chilean regional lead and `cocona` in its Peru/Amazonia leads, without enough detail in the cuisine-sweep sources alone for activation. The Chilean government forestry reference and EPPO fill the species, edible-fruit, and English/French naming gaps for maqui. Peru's INACAL standard and Pl@ntUse fill the species, fresh-fruit, and French/English naming gaps for cocona. This supports only those two scoped additions. `Topiro` and `cubiu` are not activated as global aliases; `lulo`/`naranjilla` remains a different *Solanum* fruit identity question.

## Held and retained dispositions

| Term or product | Disposition | Reason |
|---|---|---|
| Unqualified `sapote` | **Hold as a catalog identity or cross-species alias.** | OQLF's fruit entry uses it for *Pouteria sapota*, but TERMIUM records the same common name for *Diospyros nigra* and *Manilkara zapota*. Use species-qualified displays for the new candidates. |
| `sapodilla / sapotille` | **Retain existing active identity.** | `ingredient-ref-sapodilla` is already present. Keep it separate from *Pouteria sapota*, despite overlapping historical botanical word roots. |
| `mamey apple` (*Mammea americana*) | **Hold outside this candidate set; keep separate.** | TERMIUM identifies *Mammea americana* as mamey apple and gives French plant names distinct from the sapotes. The short term `mamey` alone is not a safe synonym for mamey sapote. |
| Green sapote, South American sapote, and other unqualified regional sapote names | **Hold for their own source-qualified review.** | This packet's sources do not establish safe display/alias boundaries for these names. Do not roll them into any of the three proposed identities. |
| Whole baobab fruit/capsule (`pain de singe`) | **Hold as an ingredient identity.** | The checked source identifies a capsule containing edible pulp; the reviewed product source scopes the marketed food to pulp rather than the whole capsule. |
| Baobab leaf / `lalo`, seeds, and generic `baobab powder` | **Hold as separate product questions.** | OQLF and Kew distinguish fruit pulp from the leaf food and seeds. The FSA supports only a defined fruit-pulp product; `baobab powder` alone does not encode that boundary. |
| Maqui jam/syrup and other processed products | **Hold outside the berry identity.** | SIMEF names them as uses/products distinct from direct fruit consumption. No processed-product reference is proposed. |
| Cocona juice, sauce, or other processed products | **Hold outside the fresh-fruit identity.** | INACAL's source identifies cocona as a fresh fruit while listing processed uses separately. No processed-product reference or alias is proposed. |
| Açaí, cupuaçu, guava, and other previously integrated fruit references | **Retain current owners.** | Their active identities already cover these fruit names; no duplicate regional candidates are proposed here. |

## Evidence register

The identifiers below are local to this proposal and were checked against the shared ledger before drafting. Evidence supports identity, product scope, or names only; no numeric or preparation claims are transferred.

| ID | Source | Use in this proposal |
|---|---|---|
| WP03-M-SAPOTE-BAOBAB-20261010-S01 | OQLF, [sapote (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296929/sapote) | Preferred Québec French fruit term; names *Pouteria sapota* and distinguishes it from sapotille. |
| WP03-M-SAPOTE-BAOBAB-20261010-S02 | OQLF, [sapotille (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296930/sapotille) | Supports sapodilla/sapotille as a separate fruit and explicitly discourages using `sapote` for it. |
| WP03-M-SAPOTE-BAOBAB-20261010-S03 | Government of Canada TERMIUM Plus, [Pouteria sapota terms](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=SAPOTILLE+MAMEY) | Records `mamey sapote` and French terms for *P. sapota*; its observations flag overlapping common names for *Manilkara zapota* and *Diospyros nigra*. |
| WP03-M-SAPOTE-BAOBAB-20261010-S04 | AAFC, [GRIN-Global-CA: *Pouteria sapota*](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=1303) | Independent taxon/source check for the mamey-sapote identity. |
| WP03-M-SAPOTE-BAOBAB-20261010-S05 | Government of Canada TERMIUM Plus, [sapotier noir / black sapote](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frt&lang=fra&srchtxt=SAPOTIER+NOIR) | Maps English `black sapote` to *Diospyros nigra* and records French `sapotier noir`; also warns about common-name overlap. |
| WP03-M-SAPOTE-BAOBAB-20261010-S06 | Pl@ntUse, [*Diospyros*](https://plantuse.plantnet.org/fr/Diospyros) | French botanical reference lists *Diospyros digyna* as a fruiting species called `sapote noir`; used to inform the provisional fruit display `sapote noire`. |
| WP03-M-SAPOTE-BAOBAB-20261010-S07 | Kew, [Plants of the World Online: *Diospyros nigra*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:322764-1/general-information) | Treats *D. nigra* as accepted, includes *D. digyna* among synonyms, and records food use. |
| WP03-M-SAPOTE-BAOBAB-20261010-S08 | Pl@ntUse, [*Casimiroa edulis*](https://plantuse.plantnet.org/fr/Casimiroa_edulis) | Gives French `sapote blanche`, English `white sapote`, and edible-fruit scope for *C. edulis*. |
| WP03-M-SAPOTE-BAOBAB-20261010-S09 | Kew, [Plants of the World Online: *Casimiroa edulis*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:771774-1/general-information) | Accepted species, Rutaceae placement, and food-use confirmation. |
| WP03-M-SAPOTE-BAOBAB-20261010-S10 | Government of Canada TERMIUM Plus, [*Mammea americana* terms](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ptw&lang=eng&srchtxt=AMERICANA) | Confirms the separate mamey-apple identity and its French tree names; supports exclusion of bare `mamey` as a global alias. |
| WP03-M-SAPOTE-BAOBAB-20261010-S11 | OQLF, [canistel (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17485960/canistel) | Notes `mamey-zapote` in a canistel context; supports alias restraint. |
| WP03-M-SAPOTE-BAOBAB-20261010-S12 | OQLF, [baobab (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17487017/baobab) | Québec term `baobab`; describes the capsule as `pain de singe`, its edible pulp, and dried powdered leaves as `lalo`. |
| WP03-M-SAPOTE-BAOBAB-20261010-S13 | UK Food Standards Agency, [authorised novel food: *Adansonia digitata* dried fruit pulp](https://data.food.gov.uk/regulated-products/novel_authorisations/novel-7) | Defines a separated, milled fruit-pulp product and label designation `Baobab fruit pulp`; used for identity scope, not Canadian regulatory status. |
| WP03-M-SAPOTE-BAOBAB-20261010-S14 | Kew, [Plants of the World Online: *Adansonia digitata*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:558628-1/general-information) | Supports edible fruit pulp and distinguishes fruit pulp, seeds, and leaves as different food materials. |
| WP03-M-SAPOTE-BAOBAB-20261010-S15 | EPPO, [*Aristotelia chilensis*](https://gd.eppo.int/taxon/AITCH) | Provides English `maqui berry` / `Chilean wineberry` and French `maqui du Chili` names for the species. |
| WP03-M-SAPOTE-BAOBAB-20261010-S16 | Chile Ministry of Agriculture, SIMEF, [native forest species and uses](https://simef.minagri.gob.cl/herramientas/informacion-de-bosques-de-chile/ver/06) | Pairs *Aristotelia chilensis* with `maqui` and records direct fruit use separately from jam and syrup products. |
| WP03-M-SAPOTE-BAOBAB-20261010-S17 | Peru INACAL, [quality requirements for cocona](https://www.gob.pe/institucion/inacal/noticias/817509-inacal-brinda-requisitos-de-calidad-de-la-cocona) | Identifies *Solanum sessiliflorum* as cocona, an Amazonian fruit, and scopes a fresh-fruit standard. |
| WP03-M-SAPOTE-BAOBAB-20261010-S18 | Pl@ntUse, [*Solanum sessiliflorum*](https://plantuse.plantnet.org/fr/Solanum_sessiliflorum) | Gives French and English `cocona`, identifies edible fruit, and records *Solanum topiro* as a botanical synonym not proposed here as an alias. |

This packet leaves the broader Section M follow-up, fruit-product work, and WP06 regional sweep open for separate source-backed review.
