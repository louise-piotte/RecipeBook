# WP03 Section M fruit gaps: regional fruit identities and product boundaries

- **Reviewed:** 2026-10-10
- **Status:** proposal only. This is the only file changed for this packet; the canonical seed, ledger, legacy candidates, tests, plan, roadmap, code, recipes, and earlier proposals were not edited.
- **Scope:** the previously deferred North American pawpaw/asimine and prickly-pear identities, plus a targeted recheck of melon, plantain maturity, cherry subtypes, and Goji terminology. This packet proposes identities only.
- **Sources accessed:** 2026-10-10. The Office québécois de la langue française (OQLF), Ontario Ministry of Agriculture, Food and Agribusiness, USDA Agricultural Marketing Service, Canadian Food Inspection Agency, and Canadian Intellectual Property Office provide the terminology and product evidence below.

## Recommendation

For a later coordinator decision, add two identity-only FRUIT references:

| Candidate ID | English display | Québec French display | Alias proposal | Scope |
|---|---|---|---|---|
| `ingredient-ref-asimina` | `pawpaw (Asimina triloba)` | `asimine` | None beyond the displays. Do not add `papaw` or `mangue du Canada`. | The North American fruit *Asimina triloba*. Keep separate from papaya (*Carica papaya*) and cherimoya. |
| `ingredient-ref-prickly-pear` | `prickly pear` | `figue de Barbarie` | English `cactus pear` only. | The fruit *Opuntia ficus-indica*. Do not include nopal/cladodes, juice, or other *Opuntia* species. |

The exact English term `pawpaw` is lexically ambiguous with papaya in OQLF material. The qualifier in the proposed English display makes the selected North American fruit visible; do not add `pawpaw` to the papaya reference. Exclude `mangue du Canada` because it shares the high-frequency French token `mangue` with several active mango-product rows. OQLF explicitly discourages French `poire cactus`; do not translate the English alias `cactus pear` literally.

Keep the existing dispositions for generic melon/cantaloupe, plantain ripeness, fresh sweet/sour cherry subtypes, and Goji aliases. The refreshed recipe audit found no recipe ingredient requiring those boundaries. New CFIA and CIPO evidence sharpens the Goji product/term decision but does not support routing an unqualified or powder-context Goji name to the active whole dried-wolfberry reference.

No recipe links, ingredient forms, measurements, unit mappings, conversions, yields, substitutions, or changes to recipe text are proposed.

## Refreshed working-tree snapshot

Counts and hashes below were computed from the current package. The recipe digest hashes each manifest-relative path, a NUL byte, the exact file bytes, and a NUL byte, in manifest order.

| Artifact | Live count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 654 references | `7ea212dc45e6c03d47826ac3bbd44e87171492e26aeef1d71e341836109ace3f` |
| `ingredient-forms.v1.json` | 33 forms | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 838 records; 1,430 source entries; 1,197 distinct source IDs | `3fb50a7a1b31678ea02d67d861e92a001e63152e79d473a55a32b188ea9df063` |
| `legacy-import-identities.v1.json` | 86 candidates | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Manifest-ordered recipe corpus | 114 recipes; 1,123 ingredient rows | `7b275f9696892e81ee05c247177d4c09a7a92f51d64586882d7599760bc6f22f` |

The two proposed reference IDs and their normalized display terms are absent from the active reference set and all legacy candidate IDs. Neither has a matching research-ledger identity record. The active catalog has one relevant dry-fruit owner, `ingredient-ref-dried-wolfberry` (`dried wolfberry` / `baie du lyciet séchée`), with only plural wolfberry aliases; its exact `wolfberry` query returns that one reference. The active catalog has no owner for pawpaw/asimine or prickly pear.

All proposal source IDs use `WP03-MFRUIT-GAPS-20261010-Sxx`. Each was checked against the 1,197 distinct source IDs currently in the shared ledger; none collides. These are proposal citations only, not ledger entries.

## Recipe audit

All 114 manifest-listed recipes and their 1,123 ingredient rows were scanned in manifest order using `originalText`, `ingredientName`, and `ingredientRefId`. Exact and spelling-variant scans for `pawpaw`, `papaw`, `asimine`, `mangue du Canada`, `prickly pear`, `cactus pear`, `figue de Barbarie`, `poire cactus`, `melon`, `cantaloupe/cantaloup`, `plantain`, `goji/wolfberry`, and fresh or dried sweet/sour/tart cherry wording found **no direct ingredient row** for either proposed regional identity or for the unresolved melon, plantain-maturity, Goji, or cherry-subtype questions.

The nearby cherry rows reinforce existing product boundaries:

| Recipe and line | Ingredient wording | Current reference | Audit result |
|---|---|---|---|
| 028#7 | maraschino cherries, drained and chopped | `ingredient-ref-cerises-au-marasquin` | Preserved product; not evidence for a fresh cherry subtype. |
| 029#1 | pitted cherries, fresh or frozen | `ingredient-ref-cherries` | Generic fresh/frozen cherry wording; no sweet/sour distinction. |
| 067#8 | maraschino cherries | `ingredient-ref-cerises-au-marasquin` | Preserved product; not evidence for a fresh cherry subtype. |

The active plantain identity already owns `plantain` / `banane plantain`; no recipe names it. No recipe names a melon or cantaloupe. The direct fruit-specific Goji/wolfberry scan was also empty. Candidate fruit rows therefore add catalog coverage only; they do not justify recipe relinking or new forms.

## Source-backed identity candidates

### Asimina / North American pawpaw

OQLF’s 2024 entry places `asimine` in the fruit domain and lists English `pawpaw` and `papaw`. OMAFRA identifies the fruit as *Asimina triloba*, gives `asimine` as its name, and documents fresh and culinary uses. Together these sources resolve the earlier regional-identity deferral without conflating this fruit with papaya. OQLF separately warns that English `pawpaw` can name either this fruit or papaya; use the disambiguated display `pawpaw (Asimina triloba)`, do not alias it to papaya, and do not use the shared `mangue du Canada` wording as a global alias.

This proposal covers only the fruit identity. OMAFRA’s reference to fresh use, ice cream, and recipes is not evidence for a generic puree, frozen form, cooking conversion, or substitution.

### Prickly pear / figue de Barbarie

OQLF identifies `figue de Barbarie` as an edible fruit in the food domain, gives *Opuntia ficus-indica*, lists English `prickly pear` and `cactus pear`, and explicitly discourages `poire cactus`. USDA AMS independently names the market fruit `Cactus Pear (Prickly pear, Tuna, *Opuntia ficus indica*)`. This supports a narrowly scoped whole-fruit reference and the one English alias above.

Do not add `tuna`, which is ambiguous with fish; `Indian fig`, which would widen the existing `fig/figue` query; or `nopal`, which commonly names the plant’s edible pads/cladodes. The proposed identity is not a general reference for all *Opuntia* fruits, leaves, juices, or processed products.

## Boundary decisions carried forward

| Open item | Disposition after this audit | Evidence and reason |
|---|---|---|
| Generic melon, melon brodé, and cantaloupe | Keep the prior hold. | The previous Section M review documents the OQLF distinction and North American naming collision. This package has no melon/cantaloupe ingredient row, so the plan’s recipe-evidence condition for a new split remains unmet. Do not add bare `melon` to watermelon, winter melon, bitter melon, or a new candidate. |
| Plantain maturity | Keep the existing identity only; add no green/ripe forms or aliases. | The active row already owns `plantain` / `banane plantain`; the 1,123-row scan found no plantain recipe line. Maturity language is not a separate identity or form based on this evidence. |
| Fresh cherry subtypes | Keep `ingredient-ref-cherries` generic; do not split sweet and sour cherries. | The recipe scan found only one generic fresh/frozen cherry row and no sweet/sour descriptor. Existing maraschino, dried-sweet, and dried-tart rows remain distinct prepared products. |
| Generic dried cherries | Keep unassigned. | No recipe line names generic dried cherries. The existing separate dried-sweet and dried-tart references do not establish ownership for the broader phrase. Do not add `dried cherries` to either. |
| Goji spelling and dried-wolfberry scope | Keep Goji spellings inactive on `ingredient-ref-dried-wolfberry`. | A recent CFIA survey of dried fruit and vegetable powders uses `Goji berry` as one sampled product type. This is current evidence for English use in a powder context; it does not establish a safe alias for whole dried berries or a Québec French name. The OQLF `baie du lyciet` entry previously noted Goji forms as trademarks. CIPO’s exact-word GOJI application 1525569 is abandoned and covered non-food appliance goods, which does not by itself resolve current mark scope. Keep `goji`, `gojiberry`, `goji berry/berries`, and `baie(s) de goji` unassigned until whole-fruit versus powder/juice scope and Québec terminology are clear. Do not infer a powder identity from the survey classification alone. |

## Normalized search collision audit

The simulation used the app’s Kotlin search-key rules: lowercase, NFKD decomposition, accent and ligature folding, punctuation to spaces, and complete word-phrase matching before substring fallback. Candidate terms below were checked against all active names/aliases and all legacy candidate IDs.

| Query or candidate term | Current picker result | Proposed behavior / collision note |
|---|---|---|
| `pawpaw`, `asimine` | No active result. | Each resolves to the proposed Asimina identity. The label includes `Asimina triloba` to signal the intended fruit; do not add `pawpaw` to papaya. `papaw` is not proposed as a separate alias. |
| `mangue` | Amchur powder, mango pickle, and sweet mango chutney. | Exclude `mangue du Canada` from the Asimina aliases because the shared first token would add another result to this already broad query. |
| `prickly pear`, `figue de Barbarie`, `cactus pear` | No active result. | Each fully qualified phrase resolves to the proposed prickly-pear identity. `pear` currently resolves to generic pear and would also show prickly pear; `fig`/`figue` currently shows fresh and dried figs and would also show prickly pear. The full phrases remain specific. |
| `melon` | Bitter melon, watermelon, dried watermelon seed kernels, and winter melon. | Keep this broad family query; do not add a generic melon alias. No new melon identity is proposed in this packet. |
| `plantain` | Existing plantain banana reference. | Retain the single identity; no maturity term is activated. |
| `cherries` | Generic cherries, maraschino cherries, dried sweet cherries, and dried tart cherries. | This broad query already returns four distinct current products; do not use it as evidence that fresh sweet/sour subtypes should be split. |
| `goji`, `goji berry`, `dried cherries` | No active result. | Keep unresolved terms unassigned; no proposed alias changes this behavior. |

No exact normalized display or alias collision exists between the two candidate rows and a current active or legacy owner. Broader one-token results (`figue`, `fig`, and `pear`) are expected from the app’s phrase search; they do not make the fully qualified identities synonyms.

## Sources

All source IDs are local to this proposal and unique against the current ledger. These sources support identity and naming only, except where a product category is specifically described. None supplies measurements, yields, conversions, or substitutions for this catalog.

| ID | Source | Support used |
|---|---|---|
| WP03-MFRUIT-GAPS-20261010-S01 | OQLF, [asimine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083801/asimine) | Updated 2024; fruit-domain entry; Québec `asimine`; English `pawpaw` and `papaw`; fruit description. |
| WP03-MFRUIT-GAPS-20261010-S02 | Ontario Ministry of Agriculture, Food and Agribusiness, [Asimine (Promo-Cultures)](https://omafra.gov.on.ca/CropOp/fr/spec_fruit/tree_fruit/pawp.html) | *Asimina triloba*, Québec French label `asimine`, alternate `mangue du Canada`, and fresh/culinary fruit use. |
| WP03-MFRUIT-GAPS-20261010-S03 | OQLF, [figue de Barbarie (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297016/figue-de-barbarie) | Fruit-domain identity *Opuntia ficus-indica*; Québec preferred term; English `prickly pear`, `cactus pear`, `Indian fig`, and `tuna`; explicitly discourages French `poire cactus`. |
| WP03-MFRUIT-GAPS-20261010-S04 | USDA Agricultural Marketing Service, [Tropical Products Transport Handbook](https://www.ams.usda.gov/sites/default/files/media/Tropical%20Products%20Transport%20Handbook.pdf) | Commercial produce entry titled `Cactus Pear (Prickly pear, Tuna, Opuntia ficus indica)`, confirming the whole-fruit product and English term boundary. |
| WP03-MFRUIT-GAPS-20261010-S05 | Canadian Food Inspection Agency, [Bacterial pathogens and indicators in dried fruit and vegetable powders for smoothies, 2022–2023 final report](https://inspection.canada.ca/sites/default/files/documents/2024-10/CFIA_ACIA-%2319589204-v1F-2022-2023_TS_Final_Report_on_Bacterial_Pathogens_and_Indicators_in_Dried_fruits_and_vegetables_for_smoothies_%28E%29.pdf) | Table 5 lists `Goji berry` as a sampled type within the dried fruit and vegetable powder survey; evidence for product-context usage, not a whole-fruit alias. |
| WP03-MFRUIT-GAPS-20261010-S06 | Canadian Intellectual Property Office, [GOJI application 1525569](https://ised-isde.canada.ca/cipo/trademark-search/1525569) | Exact-word application is recorded as abandoned; its listed goods are household/appliance products. This single record does not establish current trademark clearance or food-term scope. |

Earlier OQLF evidence and the existing disposition for generic melon/cantaloupe, cherry subtypes, and dried-wolfberry product boundaries remain documented in `docs/catalog/proposals/wp03-section-m-open-fruit-followup-20261009.md` and `docs/catalog/proposals/wp03-dried-fruit-products-next-review-20261009.md`. This packet makes no change to those prior decisions beyond the evidence-based candidate identities and updated Goji source check above.
