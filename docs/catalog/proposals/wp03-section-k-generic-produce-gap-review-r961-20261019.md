# WP03 Section K — stinging nettle leaves identity review (R961)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic reference for stinging nettle leaves / feuilles d’ortie dioïque, scoped to the young culinary leaves of *Urtica dioica* L.
- **Scope:** Generic culinary ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.
- **Plan anchor:** Section K's leafy vegetable, brassica, stem, shoot, and edible-flower sweep remains open ([catalog plan, line 6553](../../RecipeBook-global-ingredient-catalog-plan.txt#L6553)).
- **Mutation scope:** Proposal only. No catalog, ledger, recipe, plan, workflow, or roadmap file is changed.

## Recommendation

Add `ingredient-ref-stinging-nettle-leaves` as a generic leafy plant-part identity. The Québec Filière des plantes médicinales biologiques du Québec guide identifies *Urtica dioica* L. as `ortie dioïque`, lists English `stinging nettle`, and describes young leaves as food used cooked, in soup, in salad, or as a vegetable. Oregon State University Extension's peer-reviewed guide independently identifies stinging nettle as *U. dioica* and describes the leaves' culinary use. These sources support a distinct edible-leaf identity; they do not make all nettle species, plant parts, or preparations interchangeable. [S01–S02]

Use `feuilles d’ortie dioïque` as a descriptive Québec-facing name. The Québec guide directly attests `ortie dioïque` as the plant name and discusses its young leaves in cooking; the compound plant-part wording is transparent but is not presented as an OQLF-standardized term. Keep aliases empty to avoid broad `nettle` / `ortie` matching and to keep the row on the source-attested species and plant part.

## Proposed minimal data

```json
{
  "id": "ingredient-ref-stinging-nettle-leaves",
  "nameEn": "stinging nettle leaves",
  "nameFr": "feuilles d’ortie dioïque",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

Scope the identity to young culinary leaves of correctly identified *Urtica dioica* L. Do not include roots, seeds, herbal extracts, ornamental/medicinal products, or other *Urtica* species. No form or recipe link is proposed.

## Ownership and neighboring identities

The current package snapshot contains **1,978 active ingredient references** and **205 forms**. The legacy import file contains **55 candidates**; the research ledger contains **2,383 records**. Accent-folded exact phrase scans of active reference names and aliases, form labels and match terms, legacy candidates, and ledger record IDs, sources, and decisions found no owner for the proposed ID, *Urtica dioica*, `stinging nettle`, `common nettle`, `greater nettle`, `tall nettle`, `slender nettle`, `nettle`, `nettle leaves`, `ortie dioïque`, `grande ortie`, `ortie piquante`, `ortie élevée`, `feuilles d’ortie`, or the part-qualified variants. No matching form or legacy candidate was found.

The proposal archive's **2,164 Markdown proposals** was also checked for the proposed ID, taxon, display names, R961 source-ID prefix, and both source URLs. No earlier proposal or source owner was found. The corresponding source-ID prefix and URLs are absent from the current ledger.

| Existing identity or evidence | Boundary to preserve |
|---|---|
| Existing spinach reference (`ingredient-ref-baby-spinach`) and its young-leaf form; `ingredient-ref-kale` | Keep these identities unchanged. OSU Extension's source-level recipe advice about prepared nettle leaves does not make nettle a spinach or kale alias, identity, form, or active substitution. |
| `ingredient-ref-cauliflower-leaves` (integrated after R958), plus broccoli leaves, celery leaves, and kohlrabi leaves | Preserve each crop-part identity and its source ownership. The current cauliflower-leaves row was rechecked after integration and is a distinct *Brassica* plant part; it does not own nettle leaves. Nettle leaves are not a generic leafy-green alias. |
| Herbal nettle products and other nettle parts | This proposal is limited to culinary leaves. It does not absorb roots, seeds, whole-plant material, teas, extracts, or product-specific claims. |

The open Section K item asks for continued generic leafy-green and plant-part discovery. The Broccolini trademark mention is an alias exclusion, not an assigned product-roster task. No roster-only assignment was found in the reviewed K queue. If one is queued later, record it as out of scope because commercial-product counts do not add ingredient diversity, then stop that line. Existing catalog rows and their source-scoped evidence remain untouched.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for the proposed ID and English/French names, species name, source-attested English and French names, and common singular/plural variants. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe link, relink, or quantity is proposed. The external culinary sources establish a documented use, not demand in the bundled corpus. [S01–S02]

## Proposed ledger state and evidence limits

If the proposal is accepted, create one `ingredient_reference` ledger record keyed to `ingredient-ref-stinging-nettle-leaves` with:

- `identityState: verified`;
- `measurementState: not_yet_researched`;
- `substitutionResearchState: blocked_pending_evidence`;
- sources S01–S02 only;
- no measurement observations, active rule, form, conversion, yield, or recipe link.

### Bounded online substitution finding

Section 08 online research was performed on 2026-10-19 with direct searches for `stinging nettle leaves substitute spinach kale recipe extension`, `site:edu stinging nettle leaves substitute spinach recipe`, `stinging nettle replace spinach soup exact recipe ratio`, and `ortie dioïque remplacer épinards recette cuisine`. S02 is the selected peer-reviewed extension source. It says that, after proper preparation, nettle leaves can replace spinach or kale in “almost any recipe.” This is retained as a source-specific replacement suggestion, not a validated universal equivalence. S02 also names soups, seasoning, teas, and pesto as nettle uses, but does not assign the replacement claim to a defined dish role or method.

Record one `substitutionFindings` entry with:

- `findingId: stinging-nettle-leaves-spinach-kale-broad-guidance-r961-20261019`;
- `researchState: blocked_pending_evidence`;
- `fromIngredientRefId: ingredient-ref-stinging-nettle-leaves`;
- `context`: S02's broad suggestion to use properly prepared nettle leaves in recipes that use spinach or kale;
- `basis`: direct online searches on 2026-10-19 using the queries listed above; S02 is the selected peer-reviewed source and provides no replacement amount or transferable ratio;
- `limitations`: the claim does not specify a dish role, named recipe/method, exact nettle form or preparation tied to the replacement, amount basis, required adjustments, or expected effects;
- `rejectedCandidates`: a universal nettle-leaves-for-spinach/kale runtime rule, rejected because the source's “almost any recipe” scope is too broad for the contextual model;
- `sourceIds: [S02]`.

Include one ledger `decisions` entry with `outcome: unresolved`, `sourceIds: [S01, S02]`, and a reason stating that the S02 replacement claim is blocked pending role/form and amount-basis evidence, while preserving S01/S02's stinging-hair and processing statements only as source-specific limitations. Do not turn these statements into a general preparation or foraging-safety instruction. Add no runtime rule, replacement link, or recipe link. The targeted searches did not produce a narrower authoritative replacement basis that was accepted for this review; this is not a claim that no context-specific substitute exists.

S01 says the nettle's stinging hairs irritate and that young leaves lose their stinging property when cooked, dried, or transformed. S02 separately warns that the hairs can sting and gives drying/blanching directions. Preserve these as source-specific handling cautions/limitations in the proposed ledger evidence and decision; do not convert them into a general preparation or foraging-safety instruction. The Québec guide dates from 2009; its wording supports local attestation, not current retail prevalence or an OQLF language ruling. No nutritional or medicinal claim, safe-foraging guarantee, or Québec retail-availability claim is inferred.

## Sources

Online sources were opened 2026-10-19. Source IDs are proposal-local and have not been written to the shared ledger.

| Source ID | Source | Support and limits |
|---|---|---|
| `WP03-K-STINGING-NETTLE-LEAVES-R961-20261019-S01` | Filière des plantes médicinales biologiques du Québec, [L’ortie dioïque — Guide de production sous régie biologique (PDF)](https://www.agrireseau.qc.ca/agriculturebiologique/documents/guide-ortie.pdf), pp. 5–6 | Identifies *Urtica dioica* L., gives French `ortie dioïque` and English `stinging nettle` among the names, and describes young leaves as food cooked, in soup, in salad, or as a vegetable. The guide also says the hairs irritate and that young leaves lose their stinging property when cooked, dried, or transformed; retain this as source-specific handling evidence, not a general safety instruction. It is a 2009 agricultural guide, not an OQLF term entry or current retail survey; unrelated medicinal statements and market estimates are not used. |
| `WP03-K-STINGING-NETTLE-LEAVES-R961-20261019-S02` | Oregon State University Extension Service, [Wild Edibles: Stinging Nettle](https://extension.oregonstate.edu/catalog/em-9373-wild-edibles-stinging-nettle), peer-reviewed publication | Identifies stinging nettle as *Urtica dioica*, says young tender leaves are edible, and describes culinary use including soups, seasoning, tea, and pesto. Its statement about replacing spinach or kale is retained only in the blocked Section 08 finding above. The page also contains preparation directions, recipe quantities, and a stinging-hair warning; these remain source-specific and do not become general forms, measurements, recipe links, or safety instructions. It does not establish Québec naming or local availability. |

## Link, encoding, and whitespace checks

- The relative catalog-plan link resolves to `docs/RecipeBook-global-ingredient-catalog-plan.txt`; its `#L6553` target is the Section K heading.
- Both external source links were opened and resolved during this review.
- After writing, the saved proposal was checked for UTF-8 without BOM, a final newline, and trailing whitespace. No software tests were run because this is proposal-only research.

## Disposition

Recommend one identity-only `VEGETABLE_AND_AROMATIC` reference, `stinging nettle leaves / feuilles d’ortie dioïque`, with empty alias arrays. Preserve all existing entries and evidence. Keep the S02 spinach/kale suggestion as a `blocked_pending_evidence` ledger finding, retain S01/S02's stinging-hair and processing notes as source-specific limitations, and add no runtime rule, recipe link, form, reusable measure, conversion, or yield. Section K's broader sweep remains open.
