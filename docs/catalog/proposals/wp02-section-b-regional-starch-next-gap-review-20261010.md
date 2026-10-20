# WP02 Section B regional starch next-gap review — attiéké

- **Reviewed:** 2026-10-10
- **Status:** Proposal only. This review creates no catalog, ledger, recipe, test, plan, or roadmap changes.
- **Scope:** One source-bounded fermented cassava granule product, attiéké. This does not reopen the generic fufu/amala holds or the extracted taro-starch hold.
- **Source IDs:** `WP02-ATTIEKE-20261010-S01` through `S06`. The prefix was checked against `docs/` and `app/`; these IDs are proposal-local and are not ledger records.

## Recommendation

**Integrate an identity-only `attiéké` reference in `FLOUR_AND_STARCH`.** The product is defined by a regional standard and technical process sources, and a Montréal-area retailer currently sells it under the exact Québec French name `Attiéké congelé`. The local label supplies the French display without inventing a translation. Keep this one named product separate from the broader cassava flour, starch, gari, fufu, and cassava-granule families. [S01–S05]

| Proposed field | Value | Limit |
|---|---|---|
| ID | `ingredient-ref-attieke` | Suggested only; coordinator assigns the canonical ID if accepted. |
| Category | `FLOUR_AND_STARCH` | Fits the cassava-derived fermented granule / semolina product family; do not classify it as a cereal grain. |
| English display | `attiéké` | The official standard also describes the product as steamed cassava grits. |
| Québec French display | `attiéké` | Matches the Montréal retailer's French product label. A targeted OQLF GDT search found no dedicated `attiéké` / `attieke` entry; the local product label is direct Québec usage, not an OQLF ruling. |
| English aliases | `steamed cassava grits`; `akyeke` | The regional standard uses the first as a descriptive name and says the product may be known as `Akyeke` in some areas. Accent folding already lets `attieke` find `attiéké`; no separate spelling alias is needed. [S02] |
| French aliases | None | Keep generic `semoule de manioc`, `semoule de manioc fermentée`, and French translations of broad cassava-grit phrases inactive. |

The identity covers fermented cassava granules prepared and steam-cooked as attiéké. It excludes cassava root, whole-root edible cassava flour, extracted tapioca starch, gari/garri, fufu and fufu mixes, lafun, pupuru, placali, and the standard-excluded `attiéké garba`. Fresh, dehydrated, and frozen retail versions remain product states under review, not catalog forms. The standard's `Akyeke` note supports a narrow regional alias; it does not authorize additional West African names or product classes. [S01–S04]

## Separate data decisions

- **Density and unit mapping:** `defaultDensity: null`; `unitMappings: []`. The Québec 1 kg listing is package size only. It does not give a household portion, volume-to-mass relation, or usable-yield mapping. Research quality measurements are sample/process specific and are not kitchen measures. [S04–S05]
- **Forms:** Add none. Sources distinguish fresh, dehydrated, frozen, and reheated presentations, but the recipe audit has no attiéké line needing state selection. Do not infer a generic frozen, dry, or cooked form from one retail listing. [S01, S04–S06]
- **Substitution:** No active global or contextual rule. This packet found no tested amount relationship to gari, tapioca pearls/starch, couscous, wheat semolina, rice, or another swallow food; substitution research remains `not_yet_researched`.
- **Recipe links:** None. The package-size label and product identity do not justify a recipe line or relink.

## Identity boundary and exclusions

The regional standard scopes attiéké as a human food produced from fresh cassava roots by fermentation and physical/thermal processing. The technical SOP describes pressing fermented cassava paste, forming granules, slight drying, then steaming. IITA/CFC distinguishes attiéké granules from gari's roasted granules, lafun flour, instant fufu flour, and tapioca beads/flakes made from cassava starch. Keep those product boundaries even though all originate from cassava. [S01–S04]

Do not add these as aliases:

- `cassava`, `manioc`, `cassava flour`, `farine de manioc`, `cassava starch`, or `tapioca`: these are broader source/product terms and already resolve to multiple active items in some cases.
- `gari` or `garri`: the active gari row is a separate roasted fermented granule product.
- `semolina`, `cassava semolina`, `semoule`, or `semoule de manioc`: `semolina` currently identifies durum semolina and remilled durum semolina; the unqualified cassava phrasing is not the Québec product label.
- `fufu`, `foufou`, `lafun`, `pupuru`, `agbelima`, `placali`, or `attoukpou`: no evidence establishes these as global names for attiéké.
- `garba`, `agbodjama`, `attiéké garba`, or `attiéké choco`: these are excluded or qualified products, not synonyms. Do not add a `garba` alias; the current picker query `garba` falls through to `chickpeas` via the `garbanzo` term.
- `akyeke` is the only accepted regional alternate name in this proposal, based on the standard's limited note. Do not add other neighboring-language names without source-specific identity review.

## Current catalog, collision, and recipe audit

The audit snapshot read the current canonical reference, form, research-ledger, and legacy-candidate files and all manifest-listed recipe files. Search behavior was reproduced from `IngredientReferenceSearchIndex`: normalize case, accents, compatibility characters, punctuation, and spacing; return full word-phrase matches first, then use substring fallback.

| Surface | Current result |
|---|---|
| Active references | No exact result for `attiéké`, `attieke`, `akyeke`, `steamed cassava grits`, `cassava grits`, `cassava semolina`, `semoule de manioc`, or `attiéké congelé`. No matching active reference exists. |
| Forms | No form label or match term mentions these candidate phrases. |
| Research ledger | No attiéké / Akyeke identity record or source ID exists. |
| Legacy candidates | No exact candidate name or alias matches these phrases. |
| Broader collisions | `cassava` returns cassava root, cassava flour, cassava leaves, and both polvilho references; `manioc` returns cassava flour, cassava leaves, cassava root, and tapioca starch. `tapioca` returns tapioca starch and tapioca pearls. `gari` and `garri` both resolve to the existing gari reference. `semolina` returns durum semolina and remilled durum semolina. `garba` currently returns chickpeas through `garbanzo`. |
| Recipe corpus | **Zero exact ingredient-row hits** across the 114 manifest-listed recipes and 1,123 ingredient rows. The scan included `attiéké`, `attieke`, `akyeke`, cassava-grit / cassava-semolina phrases, `semoule de manioc`, and frozen-product wording. No recipe link or quantity change is supported. |

The corpus fingerprint for this snapshot is `6b0df96f2f4c672f88ec6670857c493f7f1cbb1c441432d1c9365e14a6145c14`, calculated in manifest order over each relative recipe path, a NUL byte, the exact file bytes, and a trailing NUL byte.

| Canonical file | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 878 references | `bd4e02422487ff784a047425e724661812a487611d8fb9a38a1f9099ba0d992f` |
| `ingredient-forms.v1.json` | 48 forms | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `research-ledger.v1.json` | 1,123 records / 2,745 source entries / 2,159 distinct source IDs | `6956ba8b70fda15b480e55ba253b9815017fd37bba3ceb54b7190943f87ee618` |
| `legacy-import-identities.v1.json` | 77 candidates | `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57` |

These are read-only snapshot values from 2026-10-10; the shared canonical files may change as the coordinator integrates other reviewed batches.

## Acceptance checks for a later integration

1. Add only `ingredient-ref-attieke` in `FLOUR_AND_STARCH`, with `attiéké` for both display languages, English aliases `steamed cassava grits` and `akyeke`, and no French aliases.
2. Keep density null, unit mappings empty, forms empty, and conversion/yield/substitution arrays unchanged. Record measurement and substitution research separately as not yet researched.
3. Add no recipe links; rerun the manifest recipe scan against the then-current corpus and record exact line hits or the unchanged zero-hit result.
4. Verify accent-folded `attieke`, accented `attiéké`, `akyeke`, and `steamed cassava grits` resolve to the one candidate in both locale searches. Confirm `garba`, `tapioca`, `gari`/`garri`, broad `cassava`/`manioc`, and `semolina` retain the collision boundaries above.
5. Record the source set and identity decision in the research ledger, check package/index freshness and alias-collision validation, and leave the broader Section B checklist open.

## Bounded unresolved gaps

- No ingredient line requests attiéké in the current recipe bundle.
- The Québec label is frozen attiéké; no Québec source here validates English market aliases or the labeling of dehydrated/fresh versions. The display uses the product name directly in both locales.
- `Akyeke` has a standards-note basis but no Québec retail hit; its alias remains bounded to the standard's “some areas” wording.
- No reusable density, household measure, unit mapping, yield, conversion, or substitution was established.
- Generic fufu/amala products, fermented cassava products other than this named granule, and other regional cassava granules remain open. This review does not complete the broader B2/B3 checklist.

## Source register

All sources were accessed on 2026-10-10. Proposal-local source IDs do not represent ledger records.

| ID | Source, date, and support |
|---|---|
| **S01** | International Institute of Tropical Agriculture (IITA) and Common Fund for Commodities (CFC), L. O. Sanni et al., [*Successes and challenges of cassava enterprises in West Africa: a case study of Nigeria, Bénin, and Sierra Leone*](https://biblio.iita.org/documents/U09BkSanniSuccessesNothomDev.pdf-0afb108c7435725b6abe20aa58983638.pdf), 2009. Describes attiéké as cassava granules prepared from fermented pulp and steam-cooked; identifies fresh and dried presentations and distinguishes them from gari, lafun, fufu, and tapioca. Regional process evidence, not a universal substitution or household-measure source. |
| **S02** | Rwanda Standards Board, [RS ARS 2114:2024, *Attiéké — Specification*](https://www.portal.rsb.gov.rw/webstore_view.php?i=ODA2MzExRkJrTndaM0EzcA), first edition 2024; webstore lists availability in December 2025. Its official abstract covers attiéké / steamed cassava grits produced through fermentation and physical/thermal processing, excludes attiéké garba, and notes Akyeke as a name in some areas. Public metadata/abstract only; no unshown specification details are inferred. |
| **S03** | UNESCO Intangible Cultural Heritage, [*Skills related to Attiéké production in Côte d’Ivoire*](https://ich.unesco.org/en/RL/skills-related-to-attieke-production-in-cote-d-ivoire-02086), inscribed 2024; nomination credited to the Office Ivoirien du Patrimoine Culturel, 2022. Describes fermented cassava mixed into semolina and steamed as attiéké. Supports the named cultural product and process; not a Québec terminology ruling. |
| **S04** | CIRAD / RTBfoods Project, Catherine Ebah Djedji et al., [*Sensory characterization of attiéké: Biophysical characterization of quality traits, WP2*](https://doi.org/10.18167/agritrop/00607), 2022. Product-preparation SOP describes dewatering fermented cassava paste, granulating, slight drying, and steaming; stored attiéké may be rewarmed by steam. Its laboratory quality observations are not kitchen measures or density values. |
| **S05** | Le Baobab, [*Attiéké congelé 1 Kg*](https://lebaobab.lebaobab.ca/qc/alimentation-/247-atti%C3%A9k%C3%A9-congel%C3%A9-1-kg.html), Montréal-area retailer page; no publication date shown. The exact Québec French name appears on a product listing tagged for Montréal and Repentigny. The 1 kg text is package size only; the page does not show composition or preparation instructions. |
| **S06** | NOURIVOIRE, [product page for Attiéké Choco](https://www.nourivoire.com/product), manufacturer page, copyright 2025. Names a fermented, granulated, steamed cassava semolina product and lists its own fresh and dehydrated versions. This is one manufacturer's process/state description, not a brand alias or universal form taxonomy. |

## Coordinator integration result

Accepted and integrated as `ingredient-ref-attieke`, with `attiéké` in both display fields and only the standard-attested English aliases `steamed cassava grits` and `akyeke`. Kept the identity separate from cassava flour, tapioca starch/pearls, gari, and semolina; added no recipe links, forms, numeric data, conversions, yields, or substitutions. Measurement and substitution research remain `not_yet_researched`. Independently rechecked the IITA/CFC report, the Rwanda Standards Board indexed abstract, and the Montréal-area retailer listing; the standards page's abstract was available in indexed results although a direct fetch was unavailable to the browser tool. Package search fixtures cover accented/unaccented attiéké and both aliases, plus the product boundaries. Broader cassava-product coverage remains open.
