# WP03 Section K — Leafy-greens coordinator review

- **Reviewed:** 2026-10-09.
- **Packet type:** proposal-only identity, terminology, and recipe-demand review.
- **Scope:** mustard, turnip, and beet greens; dandelion greens; arugula; watercress; sorrel; endive; escarole; and radicchio.
- **Write scope:** this report only. No seed, ledger, recipe, checklist, roadmap, generated index, code, or test was changed.

## Recommendation

Accept ten separate, identity-only candidate rows in `VEGETABLE_AND_AROMATIC`, using the names and boundaries below. The 114-recipe package has no ingredient demand for these items, so this is checklist coverage rather than recipe relinking. Add no forms, densities, unit mappings, quantities, conversions, yields, substitutions, or recipe-line links. Keep the surrounding Section K sweep and independent bilingual review open.

Do not make the leafy products aliases or forms of their edible roots, related Brassica vegetables, condiments, or one another. The candidate names are source-supported; exact common-name search ambiguity still requires qualified labels and the exclusions below.

## Proposed identity names and boundaries

| Proposed ID | Display EN / fr-CA | Safe source-backed search terms | Boundary to preserve |
|---|---|---|---|
| `ingredient-ref-mustard-greens` | `mustard greens` / `feuilles de moutarde` | Use the two display names. OQLF describes edible leaves from various mustard types; Health Canada separately scopes leafy mustard commodities to *Brassica juncea* subspecies. | Keep distinct from mustard seeds, mustard powder, prepared mustard, gai choy / Chinese mustard cabbage, and other Brassica greens. Do not add bare `mustard` / `moutarde`. |
| `ingredient-ref-turnip-greens` | `turnip greens` / `feuilles de navet` | `turnip leaves`, `turnip tops`; French singular `feuille de navet` is also source-listed. | Leaves are a separate culinary identity from the active turnip-root row. Do not use bare `turnip` / `navet`, and do not merge with rutabaga. |
| `ingredient-ref-beet-greens` | `beet greens` / `feuilles de betterave` | `beetroot leaves`, `beet tops`. | Keep distinct from the active beet-root row and Swiss chard. Do not use `leaf beet`, `spinach beet`, `bette`, or `bette à carde` as aliases; the live Swiss-chard row already owns `leaf beet` and the Québec term `bette`. |
| `ingredient-ref-dandelion-greens` | `dandelion greens` / `feuilles de pissenlit` | `dandelion leaves`. | Scope the ingredient to leaves. Do not infer that a line asking for leaves means dandelion root, flower, or whole-plant product; avoid unqualified `pissenlit` as an alias unless a future product need confirms that scope. |
| `ingredient-ref-arugula` | `arugula` / `roquette` | `rocket`, `rucola` are OQLF English equivalents. | Do not add the discouraged French calque `aragula`. Keep `wild rocket` (*Diplotaxis tenuifolia*) out of aliases for arugula (*Eruca sativa*). |
| `ingredient-ref-watercress` | `watercress` / `cresson de fontaine` | `water cress`, `water-cress`; `cresson d'eau` is a source-listed French term. | Do not add bare `cress` or `cresson` while garden cress and upland/land cress are separate named vegetables. Do not alias Portuguese `agrião-do-Pará` from the jambu record. |
| `ingredient-ref-common-sorrel` | `common sorrel` / `oseille commune` | `garden sorrel`, `sorrel`, `oseille`, `grande oseille`. | OQLF ties this culinary plant to *Rumex acetosa* and warns that English “sorrel” also names a different food plant. Exclude wood sorrel (*Oxalis*) and roselle / oseille de Guinée (*Hibiscus sabdariffa*). |
| `ingredient-ref-belgian-endive` | `Belgian endive` / `endive` | `witloof`; `chicon` is a regional French term documented by OQLF. The English display itself supports the shorter search `endive`. | Keep distinct from escarole and curly endive (`chicorée frisée`). Do not alias generic `chicory`, which can refer to chicory root/products. |
| `ingredient-ref-escarole` | `escarole` / `scarole` | `broad-leaf endive`, `broad-leaved endive`; French `chicorée scarole`. | OQLF prefers French `scarole` and discourages the spelling `escarole` in French. Keep separate from Belgian endive and curly endive. |
| `ingredient-ref-radicchio` | `radicchio` / `radicchio` | `radichio`, `red chicory`, `red-leaved chicory`, `red-leaf chicory`; French `chicorée rouge`, `chicorée italienne`. | Keep distinct from Belgian endive, escarole, and generic chicory. Treviso and Verona are source-described radicchio varieties, not evidence for a separate universal form or a substitution. |

These names cover the checklist’s stated market products without claiming that every local cultivar or regional common name has one universal meaning. OQLF prefers `roquette`, `feuilles de moutarde`, `feuille(s) de navet`, `feuilles de betterave`, `cresson de fontaine`, `oseille`, `endive`, `scarole`, and `radicchio` / `chicorée rouge` in the cited contexts. For dandelion greens, `feuilles de pissenlit` is a scoped ingredient phrase: the OQLF entry names the plant `pissenlit` and says its leaves are eaten, while Health Canada’s crop list names the commodity `pissenlit`.

## Live catalog and recipe audit

Snapshot read on 2026-10-09; hashes cover exact file bytes. The recipe digest hashes, in manifest order, each relative recipe path, a NUL byte, that recipe file’s lowercase SHA-256 hex digest, and a newline, then hashes the concatenated bytes.

| Artifact | Live count | SHA-256 / digest |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 512 active references | `32ede6e932e4863048425703d4e9eea86fcee6cf0e9b280066128a7de5c4f6a0` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 32 forms | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| `docs/catalog/legacy-import-identities.v1.json` | 97 candidates | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |
| `docs/catalog/research-ledger.v1.json` | 692 records / 1,141 source entries / 955 distinct source IDs | `2e4fee87f80ec716b534bca61b074ed44e9003bd1b0509cd9c8b50ef05b2866a` |
| Manifest-listed recipe JSON | 114 files / 1,123 ingredient rows / 749,928 bytes | `6bdaed1140e7910a74af717507cccb960df562e296f9f2ee7a238d1f03671068` |

The 73 normalized candidate phrases were compared with active reference English/French names and aliases, form labels and match terms, and legacy-candidate names and aliases. Normalization mirrored `normalizeIngredientSearchKey`: Unicode NFKD, case-folding, common ligature folding, accent-mark removal, ampersand expansion, punctuation-to-space conversion, and whitespace collapse. There were **zero exact normalized-key owners** in references, forms, and legacy candidates for those phrases. Proposed IDs above are also absent from the active reference, form, and legacy-candidate files.

All strings in all 114 manifest-listed recipe JSON files were checked for the 73 candidate phrases as whole normalized word sequences. The scan found **zero recipe-corpus hits**, including **zero hits in all 1,123 ingredient rows**. There are no exact recipe positions, active ingredient links, or lines to relink for this set. This reports the current bundled package only; it is not a claim about recipes or products outside that corpus.

The current broad-name owners that must remain distinct are:

| Broad query | Current active owner(s) | Implication for the proposed greens |
|---|---|---|
| `mustard` / `moutarde` | Dijon mustard, mustard seeds, yellow mustard | Do not attach bare mustard terms to the greens identity. |
| `beet` | Beet; Swiss chard through the existing `leaf beet` alias | Keep beet greens qualified and keep `leaf beet` on Swiss chard. |
| `betterave` | Beet | Do not map root-only `betterave` to leaves. |
| `turnip` / `navet` | Turnip | Keep the leaf phrase explicit. |
| `leaf beet` | Swiss chard | Do not use as a beet-greens synonym. |

The exact phrases `mustard greens`, `turnip greens`, `beet greens`, `dandelion greens`, `arugula`, `watercress`, `sorrel`, `Belgian endive`, `escarole`, and `radicchio` have no current active search owner. The jambu record explicitly keeps its Portuguese names out of English/French aliases and does not map them to watercress.

## Forms, measurements, and substitutions

- Leave `defaultDensity` null and `unitMappings` empty for every candidate. Leaf mass per volume varies with leaf size, cut, packing, and preparation; none of the consulted terminology or regulatory sources establishes a recipe-ready density or conversion.
- Add no fresh, chopped, cooked, frozen, dried, or other form rows. The sources establish food identities and terminology, not a common catalog form policy; there is also no bundled recipe requiring a product state.
- Add no global or contextual substitutions. No recipe line establishes an accepted ratio or context. Taste, tenderness, bitterness, and cook time differ among these greens, so general interchangeability must not be inferred from their shared leafy-vegetable category.
- Add no quantities, unit conversions, yields, or recipe-line substitution links. Health Canada crop-group and pesticide documents are commodity/regulatory references; their residue limits and groupings are not kitchen measures or culinary equivalence evidence.

## Source map and limits

| Source | Evidence used | Limit |
|---|---|---|
| OQLF, [feuilles de moutarde](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488385/feuilles-de-moutarde) | Preferred fr-CA term; English `mustard greens`; describes edible mustard leaves used raw or cooked. | Does not make mustard leaves equivalent to mustard seed, prepared mustard, or all Brassica greens. |
| OQLF, [feuille de navet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18055303/feuille-de-navet) | French singular/plural usage; English `turnip greens`, `turnip tops`, and `turnip leaves`. | Term evidence only; no amount, storage form, or turnip-root conversion. |
| OQLF, [feuilles de betterave](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18050273/feuilles-de-betterave) | Direct pairing with `beet greens`, `beetroot leaves`, and `beet tops`. | Does not support merging the leaves with beet root or Swiss chard. |
| OQLF, [pissenlit](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296907/pissenlit) | Québec plant name; says leaves are consumed in salads and maps the plant to common dandelion. | The entry names the whole plant; the ingredient row should retain an explicit leaf scope. |
| OQLF, [roquette](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18049650/roquette) | Preferred fr-CA term, English `arugula`, `rocket`, and `rucola`, and *Eruca sativa*. | Explicitly discourages `aragula`; does not include wild rocket in this identity. |
| OQLF, [cresson de fontaine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082831/cresson-de-fontaine) | Preferred French names include `cresson de fontaine` and `cresson d'eau`; English terms include watercress and spelling variants; identifies *Nasturtium officinale*. | It also lists short `cresson` / `cress`, but Health Canada distinguishes garden and upland cresses, so omit those short aliases in this catalog row. |
| OQLF, [oseille](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082781/oseille) | Preferred French `oseille`, `oseille commune`, `grande oseille`; English `sorrel`, `garden sorrel`, `common sorrel`; identifies *Rumex acetosa* and describes edible leaves. | Its English note warns that “sorrel” also names another food plant. Keep wood sorrel and roselle separate. |
| OQLF, [endive](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083800/endive) | French `endive`, alternate `chicon`; English translation explicitly `Belgian endive` and `witloof`; explains the forced-chicon product. | The page’s Latin parent-plant wording is not a reason to merge with escarole. Avoid generic chicory aliases. |
| OQLF, [scarole](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296885/scarole) | Preferred French `scarole` / `chicorée scarole`; English `escarole` and broad-leaf-endive variants. | OQLF discourages French spelling `escarole`; it is not the Belgian endive or curly endive. |
| OQLF, [radicchio](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361230/radicchio) | French terms `radicchio`, `chicorée rouge`, `chicorée italienne`; English spelling and red-chicory terms; distinguishes Treviso and Verona varieties. | Does not support generic chicory, a universal cultivar conversion, or substitution. |
| Health Canada, [Eat vegetables and fruits](https://www.canada.ca/en/health-canada/services/food-guide/explore/healthy-eating-recommendations/eat-variety/eat-vegetables-fruits.html) and [Mangez des légumes et des fruits](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire/explorez/recommandations-matiere-alimentation-saine/savourez-variete/mangez-legumes-fruits.html) | Canada’s Food Guide lists leafy greens including arugula, watercress, turnip greens, and mustard greens; the French page uses `roquette`, `cresson`, `feuilles de navet`, and `feuilles de moutarde`. | Dietary guidance supports common food identity and FR/EN vocabulary, not a species-level taxonomy or recipe measure. |
| Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html) and [Groupes de cultures](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html) | Commodity lists distinguish mustard greens, turnip greens, watercress, arugula, dandelion, endive/escarole, radicchio, garden cress, and upland cress; the English table supplies several botanical names. The French page lists matching terms including roquette, pissenlit, oseille, scarole, and leaves of navet. | This is a regulatory crop-group reference; shared groups or crop names do not prove culinary equivalence, safe substitutions, or preparation forms. |

## Checklist disposition

This review resolves the names and identity boundaries for the exact mustard/turnip/beet-greens through radicchio line, with no recipe edits required. After the coordinator integrates the identity-only rows, that line can be checked as completed. Keep the preceding broader leafy-green/brassica sweep, the surrounding Section K items, and independent bilingual review open.
