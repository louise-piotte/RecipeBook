# WP02 Section D — gianduja, praliné paste, and almond-paste boundaries

- **Reviewed:** 2026-10-09
- **Status:** proposal only. No canonical seed, ledger, plan/checklist, workflow, roadmap, generated code, recipe, or test was changed. Candidate source IDs below are packet-local and are not ledger records.
- **Scope:** gianduja; praliné/praline paste; cocoa-hazelnut spread; the existing almond paste and marzipan identities; their boundaries and English/Québec French terms.
- **Plan state:** the broader Section D checklist remains open. This packet complements, but does not replace, the [cocoa and chocolate product-boundary review](wp02-chocolate-product-boundaries-review-20261009.md).

## Snapshot and existing catalog state

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 414 references | `5f7cca9264d410c2c2e619321fc0daa7ed6a6907630225dd490ba0894ce8288e` |
| `ingredient-forms.v1.json` | 16 forms | `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 579 records / 575 source entries | `db6ac4439396eca82f5f66508d30d538f5b4686431e09d87240239060143c647` |
| `legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Sorted recipe filename + NUL + per-file SHA-256 + newline aggregate | 114 files / 1,123 ingredient rows | `0ac5ea9d625417b7ff2a84e3bacc2d4f0b3cdcb49c931d9eaedf77c28593779c` |

The exact-key and collision audit used the repository's `normalize_search_key` behavior (NFKD/case folding, accent and ligature folding, punctuation-to-space, and trimming), across reference names and aliases, form labels and match terms, and legacy candidate names and aliases. The search terms and owners are summarized below. There is no existing reference, form, or legacy candidate for gianduja, gianduia, praliné/praline paste, or generic cocoa-hazelnut spread.

Relevant current references and ledger states:

| Current reference | Current EN / fr-CA display | Existing data and state |
| --- | --- | --- |
| `ingredient-ref-almond-paste` | `almond paste` / `pâte d'amande` | No aliases, density, or mappings. Ledger identity is `unreviewed`; measurement and substitution research are `not_yet_researched`; no sources. |
| `ingredient-ref-marzipan-box` | `marzipan` / `massepain` | No aliases, density, or mappings. Ledger identity is `unreviewed`; measurement and substitution research are `not_yet_researched`; no sources. |
| `ingredient-ref-nutella` | `nutella` / `nutella` | Brand-specific current row; no aliases, density, or mappings. Ledger identity is `unreviewed`; measurement and substitution research are `not_yet_researched`; no sources. |
| `ingredient-ref-almond-butter` | `almond butter` / `beurre d'amande` | No aliases or density. A prior source-less draft mapping was removed; its ledger measurement state is `blocked_pending_evidence`. |

No existing form describes these pastes or spreads. No matching legacy candidate exists. The related existing proposal covers cocoa butter, cocoa mass/liquor, couverture, and compound coating; it does not decide the identities reviewed here.

## Recommended identity and naming dispositions

| Product | Recommendation | Proposed English / fr-CA display and narrow aliases | Boundary |
| --- | --- | --- | --- |
| **Gianduja nut chocolate** | **Add as a new identity candidate.** Product evidence supports a hazelnut-and-chocolate class, with a legal composition definition in the EU market. | EN `gianduja nut chocolate`; fr-CA `chocolat aux noisettes gianduja`. Consider only `gianduia` as an English spelling alias, as used by Valrhona; no other aliases. Proposed ID: `ingredient-ref-gianduja-nut-chocolate`, category `CHOCOLATE_AND_CANDY`. | Keep separate from praliné paste and generic cocoa-hazelnut spread. Do not alias `hazelnut spread`, `chocolate hazelnut spread`, `praline paste`, `praliné`, marzipan, or almond paste. EU composition rules are EU-specific and do not establish Canadian law. |
| **Praliné / praline paste** | **Add as a new identity candidate.** OQLF pairs the exact French term with English `praline paste`; producer sources distinguish the nut-and-sugar paste from gianduja and from praline candy. | EN `praline paste`; fr-CA `pâte de praliné`; no aliases proposed. Proposed ID: `ingredient-ref-praline-paste`, category `CHOCOLATE_AND_CANDY`. | Do not use bare English `praline` or bare French `praliné` as aliases. Accent folding makes both the same search key, while OQLF uses `praline` for a candy; English `praline` also names region-specific candies. A full phrase is needed to preserve the paste identity. |
| **Hazelnut spread with cocoa** | **Add only as a descriptive product-family candidate if market-labelled ingredient classes are in scope.** A Québec retailer uses the exact bilingual label for a Canadian retail product and lists multiple brands under this category, but there is no product-composition standard in the reviewed evidence. | EN `hazelnut spread with cocoa`; fr-CA `tartinade aux noisettes avec cacao`; no aliases proposed. Proposed ID: `ingredient-ref-hazelnut-spread-with-cocoa`, category `CHOCOLATE_AND_CANDY`. | Keep as its own descriptive family, separate from gianduja. Do not alias `chocolate spread`, `chocolate hazelnut spread`, `gianduja`, or `Nutella`; ingredient formulas and use of cocoa versus chocolate vary by product. If catalog policy requires a formal composition standard, leave it unintegrated pending a broader product review. |
| **Almond paste** | **Retain the current identity** as an almond-and-sugar preparation; no new row or alias is needed. OQLF directly supports the existing display pair. | Existing EN `almond paste`; fr-CA `pâte d'amande`; keep aliases empty. | Keep distinct from pure almond butter/paste, praliné paste, and marzipan. Do not adopt plural `pâte d'amandes` until its conflicting OQLF entries receive terminology review. |
| **Marzipan** | **Retain the current separate identity.** OQLF supports the current English and preferred Québec French display pair. Producer evidence shows a product difference from its almond paste and explicitly advises against substituting its two products. | Existing EN `marzipan`; fr-CA `massepain`; keep aliases empty. | Do not merge with almond paste or alias plural `pâte d'amandes`; that plural term is inconsistent across OQLF entries. No universal almond/sugar ratio is established here. |
| **Pure almond paste / almond butter** | **Do not add or alias in this packet.** Existing `almond butter` remains its own reference. | No proposed display or alias for `pure almond paste`. | `Pure almond paste` is not a stable, unambiguous label in the reviewed sources; sweetened almond paste, pure nut paste, and almond butter must not be conflated. No recipe line requests a pure almond paste product. |

### Why the products remain separate

- The EU directive defines gianduja nut chocolate as a chocolate-based product with finely ground hazelnuts. For its dark class, the cited thresholds include at least 32% total dry cocoa solids (including 8% non-fat cocoa solids) and 20–40% ground hazelnuts per 100 g; a separate milk-chocolate class has different hazelnut bounds. These legal values apply to EU sales names, not all products sold in Canada.
- Valrhona describes gianduja as a smooth blend of hazelnuts, sugar, and cocoa, and says its production differs from praliné. Its explanation and product family are producer-specific, but they reinforce the class boundary rather than imply a fixed global formula.
- Valrhona's praliné family uses nuts and sugar and includes products using different nuts and percentages. The family does not require chocolate. OQLF's exact `pâte de praliné` / `praline paste` pair avoids the bare-word candy ambiguity.
- A spreadable use does not make gianduja synonymous with a commercial cocoa-hazelnut spread. Metro's Québec listing for one Nutella SKU uses `tartinade aux noisettes avec cacao` / `Hazelnut Spread with Cocoa` and lists modified palm oil, hazelnuts, milk powder, cocoa, emulsifier, and vanillin. That label and formula describe that retail product only; they are not a legal recipe for all spreads.
- OQLF distinguishes `pâte d'amande` / `almond paste` from `massepain` / `marzipan`. Odense likewise says its almond paste has more almonds and its marzipan more sugar, describes different typical uses, and does not recommend swapping those products. Odense's formulations support product-specific distinction, not a universal percentage rule.
- The OQLF 1984 entry for plural `pâte d'amandes` lists both `marzipan` and `almond paste` as English equivalents. A separate OQLF entry defines plural `pâte d'amandes` as a variable almond-and-cooked-sugar mixture and gives only `almond paste`. This term is therefore intentionally not assigned as an alias to either current row.

## Measurements and substitutions

No default density, volume-to-mass mapping, ingredient form, or general substitution is proposed for any new candidate or the existing paste identities. Composition percentages in the EU directive and manufacturer product labels describe product composition, not kitchen conversion factors.

Odense's FAQ provides a **brand-specific** serving basis of 2 tbsp (39 g) for its listed almond paste and marzipan, with 45% almonds and 28% almonds respectively. It also explicitly says it does not recommend using one of its products in place of the other. These exact product observations do not establish general almond-paste/marzipan conversions or substitutions. Metro's 725 g listing is a retail package size, not a volume mapping. No supported general substitute was found for gianduja, praliné paste, or cocoa-hazelnut spread; keep all substitution states unset or explicitly unresolved by exact recipe/product pair.

## Normalized-key and alias collision audit

Exact key ownership below reflects the live reference/form index and the legacy candidates. The recipe scan is separate; it does not imply any recipe changes.

| Term(s) checked | Normalized key | Current owner | Disposition |
| --- | --- | --- | --- |
| `gianduja nut chocolate`; `chocolat aux noisettes gianduja`; `gianduja`; `gianduia` | Each exact phrase key | None | New candidate only; keep to supported name and one spelling variant. |
| `praline paste`; `pâte de praliné` | `praline paste`; `pate de praline` | None | New candidate with exact full phrase pair. |
| `praline`; `praliné` | **Both normalize to `praline`** | None | Do not use as aliases: OQLF's bare French term and English equivalent mean a candy; the paste identity needs the full phrase. |
| `hazelnut spread with cocoa`; `tartinade aux noisettes avec cacao`; `chocolate hazelnut spread`; `hazelnut cocoa spread` | Exact phrase keys | None | Candidate only under its source-attested exact display pair; no broader aliases. |
| `Nutella` | `nutella` | `ingredient-ref-nutella` | Keep the explicit brand reference. No relink to generic spread or gianduja. |
| `almond paste`; `pâte d'amande` | `almond paste`; `pate d amande` | `ingredient-ref-almond-paste` | Existing identity and display pair remain. |
| `pâte d'amandes` (plural) | `pate d amandes` | None | OQLF terminology conflict; leave unassigned. |
| `marzipan`; `massepain` | `marzipan`; `massepain` | `ingredient-ref-marzipan-box` | Existing distinct identity and display pair remain. |
| `almond butter`; `beurre d'amande` | `almond butter`; `beurre d amande` | `ingredient-ref-almond-butter` | Keep separate from sweetened almond paste. |
| `pure almond paste`; `pâte d'amande pure` | Exact phrase keys | None | Unresolved and not added as an alias. |

No exact scoped term was owned by an existing form or legacy candidate. The 16 live forms were checked by label and match term; the 99 legacy candidates were checked by display and alias. The related current references and their ledger rows are source-empty and remain unreviewed; this packet does not make their live states reviewed.

## Recipe-line audit

All **114 manifest recipe files** and **1,123 ingredient rows** were searched. Five ingredient lines contain an in-scope name:

| Recipe | Ingredient line | Current link | Result |
| --- | --- | --- | --- |
| 003 *Amaretti* | `16 oz homemade almond paste` | `ingredient-ref-almond-paste` | Correct; retain. |
| 011 *Almond Bonbon Cookies* | `198 g almond paste` | `ingredient-ref-almond-paste` | Correct; retain. |
| 030 *Nutella Hot Chocolate* | `1/3 cup Nutella` | `ingredient-ref-nutella` | Brand is explicit; retain. Do not relink to a generic spread. |
| 045 *Fraisier* | `500 g pink marzipan` | `ingredient-ref-marzipan-box` | Correct; retain. |
| 064 *Marzipan Frosting* | `198 g marzipan, grated` | `ingredient-ref-marzipan-box` | Correct; retain. |

No line names gianduja, praline paste, or a generic cocoa-hazelnut spread. Full-recipe text additionally finds Nutella as an optional serving suggestion in recipe 033, and the title/instructions/section labels in recipe 079 discuss preparing almond paste and marzipan. Recipe 079's ingredient rows are the underlying almonds, sugar, egg white, and other ingredients rather than a purchased paste line. None of these is a relinking case; no recipe edit is proposed.

## Packet-local source IDs and collision audit

The 575 current ledger source entries and all 31 existing proposal files were checked for the proposed prefix `WP02-D-GIANDUJA-PRALINE-20261009-S`. No collisions were found. IDs below identify sources only within this proposal; no canonical ledger entries were created.

## Source and query log

Sources were accessed 2026-10-09. Each source is limited to the claim noted; EU legal terms are not presented as Canadian law, and producer/retailer composition evidence is not generalized beyond its scope.

| ID | Source | Claim used and limit |
| --- | --- | --- |
| WP02-D-GIANDUJA-PRALINE-20261009-S01 | European Parliament and Council, [Directive 2000/36/EC on cocoa and chocolate products](https://eur-lex.europa.eu/legal-content/EN/ALL/?uri=CELEX%3A32000L0036) | Defines EU sales classes for gianduja nut chocolate and gianduja nut milk chocolate, including chocolate and finely ground hazelnut composition. The thresholds are EU-specific and are not a Canadian standard. |
| WP02-D-GIANDUJA-PRALINE-20261009-S02 | OQLF, [chocolat aux noisettes gianduja](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8420755/chocolat-aux-noisettes-gianduja) | Gives the Québec French term and English equivalent `gianduja nut chocolate`; definition describes chocolate and finely ground hazelnuts with optional other nuts. The entry cites CILF 1985 and is terminology evidence, not current law. |
| WP02-D-GIANDUJA-PRALINE-20261009-S03 | Valrhona, [Giandujas](https://www.valrhona.com/en/l-ecole-valrhona/discover-l-ecole-valrhona/chocolate-terminology/giandujas) | Producer explanation of a smooth hazelnut/sugar/cocoa paste, its process, optional nuts/milk, and EU naming thresholds; composition details beyond the legal definition are producer guidance, not universal requirements. It recognizes the spelling `gianduia`. |
| WP02-D-GIANDUJA-PRALINE-20261009-S04 | Valrhona, [Le gianduja](https://www.valrhona.com/fr/l-ecole-valrhona/decouvrir-l-ecole-valrhona/lexique-du-chocolat/gianduja) | French producer page distinguishes gianduja process from praliné and describes its own product concept. Used only as corroborating product-family evidence. |
| WP02-D-GIANDUJA-PRALINE-20261009-S05 | OQLF, [pâte de praliné](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19088721/pate-de-praline) | Direct term pair `pâte de praliné` / `praline paste`; source attribution is CAOBISCO, 1964. It does not define one universal recipe or nut proportion. |
| WP02-D-GIANDUJA-PRALINE-20261009-S06 | Valrhona, [Praliné](https://www.valrhona.com/en/l-ecole-valrhona/discover-l-ecole-valrhona/chocolate-terminology/praline) | Producer describes praliné as a pastry nut paste, commonly nuts and sugar, and distinguishes it from gianduja. Its examples and composition ranges are product-family guidance, not a legal global standard. |
| WP02-D-GIANDUJA-PRALINE-20261009-S07 | OQLF, [praline](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432974/praline) | Defines bare French `praline` as a sugar-coated almond candy and gives English `praline`; entry was last updated 1982. This supports avoiding the bare word for paste. |
| WP02-D-GIANDUJA-PRALINE-20261009-S08 | New Orleans & Company, [New Orleans pralines](https://www.neworleans.com/restaurants/traditional-new-orleans-foods/new-orleans-pralines/) | Describes a regional English use of `pralines` for a cooked sugar/milk/butter/pecan candy. This regional source illustrates English ambiguity; it is not a general English food standard. |
| WP02-D-GIANDUJA-PRALINE-20261009-S09 | Valrhona, [Pralinés & Co product families](https://www.valrhona.com/en/our-products/for-professionals/pralines-co) | Separates the producer's Pralinés, Gianduja-Style, and Almond Pastes families. This is one manufacturer's taxonomy and supports distinctions, not universal classification rules. |
| WP02-D-GIANDUJA-PRALINE-20261009-S10 | Valrhona, [Smooth Praliné Almond Hazelnut 50%](https://www.valrhona.com/en/our-products/for-consumers/gourmets-range/cooking-range/for-baking/cooking-range-smooth-praline-almond-hazelnut-50) | One named product is a 50% almond/hazelnut praliné with its stated formulation. Used to show that exact percentages are product-specific, not a generic mapping. |
| WP02-D-GIANDUJA-PRALINE-20261009-S11 | Metro Québec, [Tartinade aux noisettes avec cacao, Nutella, 725 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/tartinades-au-chocolat-et-sucrees/tartinade-aux-noisettes-avec-cacao/p/062020000842) | Québec French retail title for SKU 062020000842 and a product-specific ingredient list. Retail formula may change; this does not establish a spread standard. |
| WP02-D-GIANDUJA-PRALINE-20261009-S12 | Metro Canada, [Hazelnut Spread with Cocoa, Nutella, 725 g](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/chocolate-sweet-spreads/hazelnut-spread-with-cocoa/p/062020000842) | English retail title for the same SKU as S11. Supports the bilingual label pair for that item, not a universal composition. |
| WP02-D-GIANDUJA-PRALINE-20261009-S13 | Metro Canada, [Chocolate & Sweet Spreads](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/chocolate-sweet-spreads) | Retail category lists other brands using hazelnut/cocoa-spread wording. This shows market usage beyond one Nutella package, not a regulatory definition or fixed formula. |
| WP02-D-GIANDUJA-PRALINE-20261009-S14 | OQLF, [pâte d'amande](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18996088/pate-damande) | Direct singular term pair `pâte d'amande` / `almond paste`; supports the current display pair. |
| WP02-D-GIANDUJA-PRALINE-20261009-S15 | OQLF, [massepain](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432188/massepain) | Preferred Québec French `massepain`, English `marzipan`; note describes marzipans as almond-and-sugar pastes and distinguishes related pastry products. |
| WP02-D-GIANDUJA-PRALINE-20261009-S16 | OQLF, [pâte d'amandes (1984 entry)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497639/pate-damandes) | Plural term entry lists both English equivalents `marzipan` and `almond paste`; this overlap is why the term is not assigned as an alias. |
| WP02-D-GIANDUJA-PRALINE-20261009-S17 | OQLF, [pâte d'amandes (1982 entry)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432368/pate-damandes) | Another OQLF entry defines plural pâte d'amandes as variable almonds and cooked sugar and gives `almond paste`. Together with S16, this leaves the plural term unresolved. |
| WP02-D-GIANDUJA-PRALINE-20261009-S18 | Odense, [Almond Paste & Marzipan FAQ](https://odense.com/faqs/) | Manufacturer says its almond paste has more almonds, its marzipan more sugar, gives different typical uses, and does not recommend substituting one for the other. Brand-specific distinction only. The product panels show 45% almonds in its almond paste and 28% in its marzipan, and 2 tbsp (39 g) serving bases; none is a universal ratio or conversion. |
| WP02-D-GIANDUJA-PRALINE-20261009-S19 | Valrhona, [Almond Pastes](https://www.valrhona.com/en/our-products/for-professionals/pralines-co/pralines-nuts/almond-paste/almond-pastes) | Producer range includes several almond percentages, supporting the absence of one generic almond-paste composition. Product range only. |

Searches included `site:eur-lex.europa.eu Directive 2000/36 gianduja`; OQLF searches for `chocolat aux noisettes gianduja`, `pâte de praliné`, `praline`, `pâte d'amande`, `massepain`, and both plural `pâte d'amandes` entries; Valrhona gianduja/praliné/product-family pages; and Metro Québec/English product and category listings.

## Coordinator dispositions

1. Added separate `gianduja nut chocolate / chocolat aux noisettes gianduja`, `praline paste / pâte de praliné`, and `hazelnut spread with cocoa / tartinade aux noisettes avec cacao` references. `gianduia` is the only spelling alias; bare `praline` and broader cross-family aliases remain excluded.
2. Kept the existing almond paste and marzipan identities. Odense's 2 tbsp = 39 g portions remain brand-specific ledger evidence, and its no-swap guidance did not activate a runtime rule.
3. Added no density, unit mapping, form, generic recipe conversion, or substitution rule. Independent Québec terminology review and the wider Section D checklist remain open.

Canonical post-merge snapshot: 446 ingredient references, 16 forms, and 612 research-ledger records.
