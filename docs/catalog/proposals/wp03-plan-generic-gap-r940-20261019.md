# WP03 Section K — broccoli leaves identity review (R940)

- **Reviewed:** 2026-10-19
- **Status:** Accepted and integrated in the R939–R941 batch; see the integration README. The shared data now contains the identity-only broccoli-leaves reference and its source-scoped evidence.
- **Scope:** one generic plant-part identity for the culinary leaves of ordinary broccoli
  (*Brassica oleracea* var. *italica*). This is a produce-diversity review, not a commercial-product
  roster.
- **Recommendation:** add identity-only `broccoli leaves / feuilles de brocoli` as a separate
  `VEGETABLE_AND_AROMATIC` reference. Keep aliases, forms, measures, mappings, recipe links,
  conversions, yields, and substitutions empty.

## Open Section K item

This proposal fits the active Section K checklist item in
`docs/RecipeBook-global-ingredient-catalog-plan.txt`:

> [ ] Continue the broader lettuce, leafy-green, and brassica sweep beyond these named identities;
> resolve additional market and regional types with source evidence and reviewer input.

The plan currently includes ordinary broccoli, Chinese broccoli, minibroccoli, and rapini as
separate identities, but does not identify the leaves of ordinary broccoli as their own culinary
ingredient. University extension sources explicitly describe broccoli leaves as edible and used as
a leafy vegetable. This is a bounded plant-part gap within the broader leafy-green sweep.

## Proposed identity

| Field | Proposed value |
|---|---|
| id | `ingredient-ref-broccoli-leaves` |
| nameEn | `broccoli leaves` |
| nameFr | `feuilles de brocoli` |
| aliasesEn | empty |
| aliasesFr | empty |
| defaultDensity | `null` |
| unitMappings | empty |
| category | `VEGETABLE_AND_AROMATIC` |

The French display is a transparent plant-part compound using the OQLF term `brocoli`; a French-
language producer page also attests `feuilles de brocoli`. It is not presented as a separately
standardized OQLF entry. Leave aliases empty because no additional narrow search term is needed or
supported.

## Identity evidence and scope limits

The University of Minnesota Extension identifies ordinary broccoli as *Brassica oleracea* var.
*italica*, states that its plant leaves are edible, and says they can be used as kale or collards.
Oregon State University Extension independently says broccoli leaves can be prepared raw or cooked
like kale or collards. These sources support the culinary leaf identity; they do not establish a
general substitute rule or a reusable preparation instruction. [S01–S02]

The French-language Catena Farm page calls the part `feuilles de brocoli` and discusses cooking
those leaves. Use this only to support the descriptive French wording and the ordinary-broccoli
leaf boundary. Do not transfer its storage durations, freezing directions, nutrient statements,
taste comparisons, or recipe suggestions to a generic catalog row. [S03]

The OQLF GDT entry confirms the Québec French base term `brocoli` and its taxonomic scope as
*Brassica oleracea* var. *italica*. It does not define a separate term for the leaves. [S04]

Keep this proposed identity limited to leaves from positively identified, cultivated ordinary
broccoli. Exclude Chinese broccoli/gai lan, choy sum, rapini/broccoli rabe, baby broccoli, other
Brassica crops, sprouts or microgreens, and broccoli florets or stalks. Do not infer edibility of
unknown wild plants or generalize the claim to all cabbage-family leaves. The extension sources'
comparison with kale and collards is contextual preparation guidance only; add no substitution rule.

No source-backed generic mass, volume, count, density, conversion, yield, or preservation form was
found in this review. The sources describe culinary use but provide no reusable amount. Leave all
numeric fields and mappings empty or null, add no recipe link, and make no storage, nutrition,
health, or food-safety claim.

## Current-ownership check

The canonical package currently has **1,958 ingredient references and 205 forms**; the research
ledger has **2,363 records**. The manifest lists **114 recipes / 1,123 ingredient rows**.

| Area checked | Finding |
|---|---|
| Active references | `ingredient-ref-broccoli` exists as `broccoli / brocoli` with only `sprouting broccoli` as an English alias. Separate `Chinese broccoli / brocoli chinois`, `baby broccoli / minibrocoli`, and `rapini / rapini` identities remain active. None assigns `broccoli leaves` or `feuilles de brocoli`; preserve all four rows unchanged. |
| Active forms | No broccoli-leaf identity or form exists. The proposed identity needs no preparation form. |
| Ledger and legacy candidates | Exact searches for the proposed ID and the English/French leaf phrases found no owning ledger record or legacy-import candidate. The integration creates new ownership; do not rewrite the broccoli, gai-lan, minibroccoli, or rapini records. |
| Prior proposals and plan history | Exact searches found no prior broccoli-leaf identity, alias, hold, or measurement proposal. The open Section K leafy-green/brassica sweep is the applicable parent item. |
| Recipe corpus | A scan of all 114 manifest-listed recipe files and 1,123 ingredient rows found no broccoli-leaf wording or proposed-ID reference. Add no recipe link. |

No brand-, product-line-, flavour-family-, SKU-, or retailer-variant roster was selected or
researched. Such commercial-product counts do not add ingredient diversity. Preserve existing
branded entries and keep any product-specific evidence tied to its exact product or recipe; no such
evidence is transferred by this proposal.

## Source register

| ID | Source | Evidence and limits |
|---|---|---|
| **WP03-SECTION-K-BROCCOLI-LEAVES-R940-S01** | University of Minnesota Extension, [Growing broccoli in home gardens](https://extension.umn.edu/garden-and-home/yard-and-garden/gardening-in-minnesota/growing-broccoli) | Identifies *Brassica oleracea* var. *italica* and states that broccoli leaves are edible and used like kale or collards. It is crop and culinary guidance, not Québec terminology or a measure. |
| **WP03-SECTION-K-BROCCOLI-LEAVES-R940-S02** | Oregon State University Extension, [Broccoli](https://extension.oregonstate.edu/imported-publication/broccoli) | Independently supports raw or cooked culinary use of broccoli leaves. It does not establish a substitution ratio, form model, or reusable amount. |
| **WP03-SECTION-K-BROCCOLI-LEAVES-R940-S03** | Catena Farm, [Brocoli + Feuilles de Brocoli](https://www.catenafarm.ca/fr/pages/broccoli) | Attests the French wording `feuilles de brocoli` and describes culinary use of broccoli leaves. Its storage, nutrition, taste, and preparation details remain source-specific. |
| **WP03-SECTION-K-BROCCOLI-LEAVES-R940-S04** | OQLF, [brocoli (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084016/brocoli) | Supports the Québec French base term `brocoli` and ordinary-broccoli taxonomic scope. It does not standardize the full leaf phrase. |

## Recommendation summary

Recommend one identity-only row for the culinary leaves of ordinary broccoli: `broccoli leaves /
feuilles de brocoli`. The open Section K sweep supplies the coverage gap, university extensions support
the edible plant-part claim, and the French-language producer wording supports the transparent
French display. Keep the identity separate from the broccoli head/stalk, gai lan, minibroccoli, and
rapini. Preserve every existing row and source record. Add no aliases, forms, measures, conversions,
yields, recipe links, or substitutions.
