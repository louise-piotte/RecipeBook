# WP04 Section P — generic turbot market-name group (R1020)

- **Review date:** 2026-10-19.
- **Status:** Proposal only; no catalog, ledger, plan, recipe, or workflow data changed.
- **Recommendation:** Add an identity-only `PROTEIN` reference for the shared bare market name `turbot`, with a visible qualifier that the name is used for multiple fish species. Do not assign one taxon or imply culinary interchangeability.
- **Plan anchor:** The open Section P finfish checklist is at [line 7352](../../RecipeBook-global-ingredient-catalog-plan.txt#L7352). This review resolves one generic name boundary under that open parent.

## Scope and prior decisions

This review covers the generic name **turbot** as a multi-species market-name group. It does not add a species, fish cut, preparation state, or product identity. The earlier [European-turbot review](wp04-section-p-european-turbot-picker-market-boundary-review-20261013-round27.md) correctly held the species-specific *Scophthalmus maximus* candidate because a species row would capture an ambiguous bare `turbot` search. This proposal addresses that bare search with an explicitly qualified group; it does not activate `ingredient-ref-european-turbot` or change the existing Greenland-halibut identity.

The proposed group represents only the shared name. It is neither a biological taxon nor a statement that species bearing the name have matching culinary performance. The sources establish at least two distinct species associated with `turbot`; they do not provide an exhaustive list of every fish ever marketed under the word.

## Naming and species boundary

OQLF’s edible-fish entry for **turbot** identifies *Scophthalmus maximus*, gives French preferred terms `turbot` and `turbot commun`, and lists English `turbot` and `European turbot`. It also records *Psetta maxima* as a Latin name for this same entry, not as evidence of another species. The entry was last updated in 2004. This supports the species-specific terminology and taxon boundary; it does not establish that the bare term always selects this species in Canadian trade. [S01]

OQLF’s separate **flétan du Groenland** entry identifies *Reinhardtius hippoglossoides*. It says this fish is often commercialized in Québec as `turbot`, while specialized fish nomenclature reserves `turbot` for *S. maximus*. The entry also says `turbot` and `turbot du Groenland` were not retained for Québec fish-product marketing to avoid consumer-label confusion. This is a Québec terminology and naming-policy statement, not a current retail survey. [Reused live-ledger source `WP04-P-GREENLAND-HALIBUT-20261012-S01`]

Fisheries and Oceans Canada’s 2019 Greenland-halibut IFMP independently says that *R. hippoglossoides* is commonly referred to as Turbot in Canada. Paired with OQLF’s *S. maximus* entry, this confirms that the shared word has at least two species referents. The IFMP documents Canadian usage in its fishery-management context; it does not establish current consumer search frequency, product-label acceptability, or culinary equivalence. [S02]

Because OQLF explicitly warns about Québec fish-product label confusion, the proposed qualified display is catalog-authored disambiguation language, not a normalized consumer product label. The visible qualifier identifies a broad name group without endorsing unqualified `turbot` as a Québec retail label.

## Conditional catalog delta

If accepted, add one identity-only reference:

```json
{
  "id": "ingredient-ref-turbot-market-group",
  "nameEn": "turbot (name used for multiple fish species)",
  "nameFr": "turbot (nom utilisé pour plusieurs espèces de poissons)",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

The parenthetical is a catalog-authored scope qualifier. The exact word `turbot` remains in both localized displays, so a bare query can reach the group while the result itself communicates that it does not select one species. Add no aliases. In particular, do not add `turbots`, `turbot commun`, `European turbot`, `turbot blanc`, *Scophthalmus maximus*, or *Psetta maxima*. Do not add `turbot du Groenland`, `Greenland turbot`, `turbot de Terre-Neuve`, `Newfoundland turbot`, `American turbot`, or `flétan du Groenland` as aliases: those are species-associated names or boundary-sensitive terms, not equivalent generic labels. Keep the existing Greenland-halibut row and its `flétan noir` alias unchanged.

Add no forms, measures, density, unit mappings, recipe links, package relationships, conversions, yields, or substitutions. The shared name does not define a common cut, preparation, portion, cooking time, edible yield, or replacement ratio.

## Active catalog, ledger, and archive audit

The read-only snapshot contains **2,029 active ingredient references**, **205 forms**, **2,434 research-ledger records**, and **55 legacy-import candidates**. Searches of active reference names/aliases, form labels/match terms, and legacy candidates found no `turbot`, *Scophthalmus maximus*, or *Psetta maxima* owner. No active row owns `ingredient-ref-turbot-market-group`; the European-turbot ID remains unallocated as documented in R27. The bare name occurs in prior boundary discussions and in source notes, which is evidence text rather than active identity ownership.

The relevant active neighboring identity is `ingredient-ref-greenland-halibut` / `Greenland halibut` / `flétan du Groenland`, with the existing French alias `flétan noir`. Its ledger record remains species-verified and owns the OQLF Greenland-halibut source and its measurements. The separate `ingredient-ref-smoked-greenland-halibut` row and `ingredient-form-greenland-halibut-steak` also remain unchanged. None receives a turbot alias or evidence transfer from this proposal.

The Greenland-halibut ledger record has historical CNF 2015 Food Code 3013 observations of **1/2 fillet = 204.0 g** and **one Food Guide serving = 90.0 g** for raw Greenland halibut; the source separately lists 64% total refuse. These observations belong to that named CNF food and the Greenland-halibut identity only. They are not defaults, conversions, yields, or measurements for this multi-species name group or European turbot. The prior R27 European-turbot packet’s cooked 75 g Health Canada table entry has no species or cut and likewise does not define a group measure. Any named seller’s package size or claim remains scoped to that named product.

There are no active turbot forms, density values, unit mappings, or ingredient-specific conversions. The package has **zero** same-ingredient substitution rules and **zero** contextual substitution rules; the Greenland-halibut ledger’s substitution state remains `blocked_pending_evidence`. Its finding is not transferable to this group. The package-yield file has one unrelated record and no turbot yield; the eight global unit conversions are not fish-specific.

### Search and phrase boundary

The live picker uses phrase-first matching over localized displays and aliases, then partial matching. Since no active search term currently contains `turbot`, the bare query presently has no fish result. With the proposed display, the bare query would return the visibly qualified group. Queries for `turbot commun`, `European turbot`, `turbot blanc`, `Greenland turbot`, `turbot du Groenland`, or the scientific names remain unassigned because none is stored as an alias or appears as a phrase in either display. Species-qualified and prepared identities remain separate. This is the generic-group treatment of the ambiguity identified in R27; it does not make either known species the owner of the bare query.

## Bundled recipe demand

The manifest lists **114 recipe files** containing **1,123 structured ingredient rows**. A scan of all decoded recipe text and ingredient rows for `turbot`, *Scophthalmus maximus*, and *Psetta maxima* found **zero matching recipe files and zero matching ingredient rows**. No bundled recipe supplies an amount, form, preparation, link, or substitution context for this group. No recipe link or measure is proposed.

## Source ownership and limits

The OQLF `turbot` page was previously documented in the R27 proposal as `WP04-P-EUROPEAN-TURBOT-20261013-R27-S01`; it has no live-ledger record. The OQLF Greenland-halibut page is reused from its existing live-ledger owner rather than duplicated. The DFO IFMP URL has no current ledger entry. The two R1020 source labels below are proposal-local only; this proposal allocates no shared source IDs or ledger findings.

| Source | What it supports | Limit |
|---|---|---|
| **S01 — OQLF GDT, [turbot](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198641/turbot)** | French `turbot` / `turbot commun`, English `turbot` / `European turbot`, and *Scophthalmus maximus*; *Psetta maxima* is recorded as another Latin name for the same fish. | Last updated 2004; terminology and taxon naming, not retail availability or current label practice. |
| **Reused `WP04-P-GREENLAND-HALIBUT-20261012-S01` — OQLF GDT, [flétan du Groenland](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198640/fletan-du-groenland)** | Identifies *Reinhardtius hippoglossoides*; documents Québec use of `turbot` for it and explains the species-naming distinction and consumer-label policy. | Last updated 2012; Québec terminology and naming policy, not a current inventory or evidence of culinary equivalence. |
| **S02 — Fisheries and Oceans Canada, [Greenland halibut IFMP](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/2019/halibut-fletan-eng.htm)** | Names *R. hippoglossoides* and states it is commonly called Turbot in Canada. | 2019 fishery-management source; supports the name usage in that context, not current retail labels, recipe practice, or substitutions. |

## Generic scope and recommendation

Catalog-wide coverage remains generic culinary ingredient diversity across every ingredient type; this review applies that scope to one seafood identity. No brand, product line, flavour family, SKU, retailer variant, or commercial-product roster was researched or proposed. No roster-only task was pursued. If a queued line asks only for such a roster, mark it out of scope and stop: commercial-product counts do not add ingredient diversity. Preserve all existing branded entries and keep their product-specific claims and measurements on the named products.

**Recommend adding** the identity-only multi-species market-name group shown above, with no taxon, aliases, forms, measures, recipe links, conversions, yields, or substitutions. This lets a bare `turbot` query resolve to a result whose display explicitly signals that the word spans species, while preserving species-specific identities and evidence. It is a naming-boundary recommendation; the bundle contains no matching recipe demand.

## Files and evidence reviewed

Reviewed `AGENTS.md`; the current Section P checklist in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt); live ingredient references and forms; the research ledger and legacy-import candidates; the seed manifest, rules, package yields, and all 114 manifest-listed recipes; the prior R27 European-turbot review; the Greenland-halibut identity and form records; and the live picker phrase-matching implementation.

No software tests or builds were run. This proposal changes no application or catalog data.
