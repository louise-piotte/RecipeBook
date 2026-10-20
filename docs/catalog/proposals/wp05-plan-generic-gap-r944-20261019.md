# WP05 Section W R944 generic kimchi-type gap review: dongchimi

- **Reviewed:** 2026-10-19.
- **Status:** Integrated. The generic identity and ledger record were added after the proposal was revised to remove unnecessary retailer and maker product pages. No forms, measures, recipe links, conversions, yields, or substitutions were added.
- **Plan anchor:** Open Section W item “Gochujang, doenjang, ssamjang, chunjang, ganjang, gochugaru, named kimchi types, fermented shrimp, and other jeotgal” in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10317).
- **Scope:** One generic Korean preserved-food identity, dongchimi. No brand, product-line, flavour, SKU, or retailer-variant roster was researched.
- **Recommendation:** Add one identity-only `dongchimi` reference, displayed as `dongchimi` in English and provisionally in fr-CA, with the source-attested English alias `radish water kimchi`. Keep broad `water kimchi`, other kimchi types, and branded products distinct. Add no forms, measurements, recipe links, conversions, yields, or substitutions.

## Current ownership and queue audit

The open Section W checklist explicitly leaves named kimchi types open. Dongchimi is a named Korean kimchi type with a distinct radish-and-clear-brine identity. A commercial-only roster of brands, product lines, flavour families, SKUs, or retailer variants is out of scope because commercial-product counts do not add ingredient diversity; this rule applies across every ingredient type.

The current shared checkout snapshot contains **1,961 active ingredient references, 205 forms, 4 legacy-import candidates, and 2,366 research-ledger records**. Exact and spelling-variant searches for `dongchimi`, `dong chimi`, `dong-chimi`, `동치미`, `radish water kimchi`, `water radish kimchi`, `white radish kimchi`, `water kimchi`, and `mul kimchi` found no active reference, form, legacy candidate, or ledger record owning those names. The proposed `ingredient-ref-dongchimi` ID is unowned. No prior proposal or batch specifically reviews or assigns dongchimi. The source-ID prefix `WP05-SECTIONW-DONGCHIMI-R944-20261019-S` was absent from the ledger and catalog Markdown at the time of this audit.

The nearest active references are:

| Existing owner | Current scope | Boundary for this proposal |
|---|---|---|
| `ingredient-ref-kimchi` — `kimchi / kimchi`, with `kim chi`, `kim chee`, and `kimchee` aliases | Generic Korean preparation of seasoned, fermented vegetables. The OQLF defines kimchi at this broad level. | Keep the generic identity. Do not replace it or treat dongchimi as a spelling alias. |
| `ingredient-ref-kkakdugi` — `kkakdugi / kkakdugi`, with `cubed radish kimchi / kimchi de radis coupés en dés` aliases | Named diced-radish kimchi type. | Keep separate; dongchimi is the radish-and-brine type, not a cubed-radish label. |
| `ingredient-ref-pickled-radish` — `pickled radish / radis mariné` | Generic prepared radish identity. | Keep separate; do not alias dongchimi to pickled radish or use the dongchimi row for unqualified pickled radish. |

No matching form is attached to those active identities for dongchimi. Their existing catalog and ledger records remain unchanged.

## Exact recipe-demand check

All **114** manifest-listed bundled recipes and **1,123** ingredient rows were scanned, including full recipe JSON text and ingredient objects. There were no matches for the romanized or Korean spellings, the English source glosses, or the broader water-kimchi wording listed above. The bundle has no exact line to link or relink; the official source’s example use does not establish bundled recipe demand or a catalog measure.

## Identity and naming recommendation

Korea.net, the official website of the Republic of Korea, identifies dongchimi as a variety of kimchi made with salted white radish and a clear, savoury brine; it also describes ingredient variation. The Korea Tourism Organization labels its entry “Radish Water Kimchi (동치미 / Dongchimi)” and describes radish as the main ingredient and fermentation as characteristic. These official sources support a real named identity distinct from generic kimchi, but do not establish one required recipe, fermentation duration, vegetable ratio, or product state across producers. [S01–S02]

Use the borrowed name `dongchimi` in both language fields. The official Korean sources use `dongchimi` and pair it with the English gloss `radish water kimchi`. Targeted OQLF searches did not surface a dongchimi-specific French term; the OQLF’s generic `kimchi` entry supports the borrowed French form `kimchi` for the parent concept only. Retain `dongchimi` as a provisional fr-CA display by analogy with that established borrowed parent term, and do not claim that OQLF has standardized the subtype. Do not invent a French descriptive alias. [S01–S03]

The English alias `radish water kimchi` is the paired translation used by the Korea Tourism Organization. Keep the broader `water kimchi` unclaimed because it can name a wider group of watery kimchi preparations. Do not add `white radish kimchi`, `mul kimchi`, `baek kimchi`, generic `white kimchi`, or Korean-script wording as aliases; the reviewed sources do not establish those terms as unique dongchimi names. [S01–S02]

Keep dongchimi separate from kkakdugi, generic kimchi, generic pickled radish, and other named kimchi types such as baek-kimchi and nabak-kimchi. Korean official sources describe dongchimi’s radish-and-brine profile, but do not establish it as an alias, form, or universal substitute for those preparations. No global or contextual substitution is proposed.

## Proposed data and ledger states

The integrated identity is bounded as follows:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-dongchimi` |
| `nameEn` | `dongchimi` |
| `nameFr` | `dongchimi` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | `radish water kimchi` |
| French aliases | None |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| Forms, recipe links, measurements, conversions, yields, substitutions | None |

The ledger record under `ingredient-ref-dongchimi` uses `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. The source IDs below and the accepted identity/boundary decision are recorded on that row. Keep the borrowed French display explicitly provisional. The official Korean recipe page’s quantities and method are source-specific; they do not establish reusable measures, forms, or a universal preparation method.

Existing branded entries remain intact. No branded identity is proposed, and no brand-specific claims or measurements are transferred to the generic row.

## Source register

Sources were opened online on 2026-10-19. The source IDs below are recorded on the shared ledger row. No retailer or maker product page was needed for the generic identity.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-DONGCHIMI-R944-20261019-S01` | Republic of Korea, Korea.net, [Korean recipes: Dongchimi radish water kimchi](https://www.korea.net/NewsFocus/Culture/view?articleId=142709). | Names dongchimi as a kimchi type, describes salted white radish and clear brine, and notes variation in additional ingredients. The page also includes one recipe; its amounts and method are not generic catalog defaults. |
| `WP05-SECTIONW-DONGCHIMI-R944-20261019-S02` | Korea Tourism Organization, [Radish Water Kimchi (동치미 / Dongchimi)](https://english.visitkorea.or.kr/svc/contents/contentsView.do?vcontsId=179894). | Directly pairs the English gloss with dongchimi and describes a fermented radish water-kimchi use. It is official culinary description, not a universal formulation standard or a French terminology source. |
| **Reused `WP05-EAST-S06`** | Office québécois de la langue française, [kimchi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529902/kimchi). | Supports the parent term `kimchi` and its spelling variants. It does not name dongchimi; targeted OQLF searches for `dongchimi`, `동치미`, and `radish water kimchi` found no subtype entry. This is a naming limit, not an endorsement of the borrowed subtype. |

## Disposition

The identity-only `dongchimi` row is integrated; wider Section W named-kimchi and regional-preserve work remains open. No commercial-product roster was pursued. No software tests were run because the app change adds database JSON under `AGENTS.md`.
