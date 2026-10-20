# WP02 Section B — Québec retail wording for polvilho azedo

- **Review date:** 2026-10-12.
- **Status:** Root-integrated. The exact Québec retail phrase was added as a French search alias on the existing polvilho azedo identity; see [`wp02-polvilho-azedo-quebec-alias-integration-20261012/README.md`](../batches/wp02-polvilho-azedo-quebec-alias-integration-20261012/README.md).
- **Scope:** One previously unowned Québec French retail phrase for the existing source-named Brazilian cassava-starch product `polvilho azedo`. This is a terminology/search review, not a new ingredient identity or a general cassava-starch alias review.
- **Checklist context:** The live WP02 Section B2 cassava/tapioca/polvilho item is still open. The active B2 batch note says the French wording for the two source-named polvilho products remains provisional pending Québec review. This review resolves only one exact Québec retail phrase for the azedo product; it does not complete B2 or decide the display wording for polvilho doce. [Plan; batch note]
- **Proposal-local source ID:** `WP02-B2-POLVILHO-AZEDO-QUEBEC-ALIAS-20261012-S01`. This prefix was absent from the ledger and proposal/batch archives before drafting.

## Recommendation

**Add the exact French retail phrase `farine de polvilho azedo` as a search alias on the existing `ingredient-ref-brazil-polvilho-azedo` row.** Keep the current French display `polvilho azedo` and English display `sour cassava starch (polvilho azedo)`. A Chambly, Québec retailer serving the Montréal region currently lists the Amafil product under the title `Farine de Polvilho azedo premium 1 kg`; its French description says it is made from manioc starches. The exact, source-qualified phrase therefore maps to the existing named starch product, while the shorter generic `farine de manioc` remains on the distinct whole-root cassava-flour identity. [S01–S02]

Treat this as a **retailer wording alias only**, not as Québec terminology authority or a reason to relabel the canonical ingredient as a flour. MAPA distinguishes the source-named polvilhos from non-fermented cassava fécula and states that fermentation varies and that a repeatable method for distinguishing product grades and mixtures was not established. Preserve the `polvilho azedo` qualifier. [S02]

Do not add `farine de manioc`, `farine de tapioca`, `fécule de manioc`, `fécule de tapioca`, `amidon de manioc`, `sour tapioca starch`, or any `polvilho doce` phrase to this row. Keep the generic wet-extracted-starch identity and the sweet polvilho identity separate. The already noted Canadian wording `amidon aigre de manioc` remains unassigned; this packet does not reopen that earlier terminology candidate. [S02–S05; prior review]

| Wording or data | Disposition | Boundary |
|---|---|---|
| FR display `polvilho azedo` | Keep unchanged. | Source name remains the exact product discriminator; the local listing does not establish a Québec-authority-preferred replacement display. |
| EN display `sour cassava starch (polvilho azedo)` | Keep unchanged. | The current manufacturer separately pairs `Polvilho Azedo` with `Sour Cassava Starch`. [S04] |
| FR alias `farine de polvilho azedo` | **Add** to `aliasesFr` on `ingredient-ref-brazil-polvilho-azedo`. | Exact Québec retailer wording for the named Amafil product. Do not generalize to generic manioc flour or another starch source. [S01] |
| `amidon aigre de manioc` | Leave unassigned in this review. | It was already identified as a term for future Québec review in the 2026-10-10 polvilho proposal; no new decision is made here. [Prior review; S05] |
| `farine de manioc` | Keep on `ingredient-ref-cassava-flour`. | Generic dry-ground whole-root cassava flour; distinct from extracted and fermented starch products. |
| `fécule de manioc` / `tapioca starch` | Keep on `ingredient-ref-tapioca-starch`. | OQLF’s general cassava-starch/tapioca term; do not cross-assign it to the polvilho rows. [S03] |
| Forms, density, mappings, conversions, yields, recipe links, substitutions | Add none. | Available quantities and uses do not establish transferable measures or substitution rules. |

## Product identity and naming evidence

The existing ingredient row is already source-named and identity-verified. Brazil’s Ministry of Agriculture says its regulated definition of cassava fécula is for **non-fermented** extracted starch. It explains that polvilho doce and polvilho azedo are commonly fermented to varying degrees, with fermentation more extensive for azedo; the guidance also says no repeatable, reproducible method had been established to distinguish the products and their mixtures. This is enough to keep the target product separate from generic cassava/tapioca starch, but it is not a quantitative process specification or a universal performance standard. [S02]

The local wording comes from a current French-facing product page for Amafil Polvilho Azedo. The page title is `Amafil Farine de Polvilho azedo premium 1 kg`; the description calls it a farine made from manioc fécules. The same site advertises delivery in the Montréal region and lists its pickup shop at 729 Rue Saint-Pierre, Chambly, Québec. That is direct local naming evidence for this exact phrase, but the page is a retailer listing, not a Québec language authority or a package process specification. [S01]

The manufacturer’s current product page uses `Polvilho Azedo` and translates that product as `Sour Cassava Starch`. A Canadian retailer separately titles a Pinduca item `Sour Cassava Starch (Amidon Aigre de Manioc)`. The latter phrase was already recorded for later Québec review in the 2026-10-10 proposal; this review cites it only to show that Canadian retail wording varies. It is not part of the proposed alias delta. [S04–S05; prior review]

OQLF’s GDT entry for `fécule de manioc` gives a general term for wet-extracted manioc starch and English equivalents including `cassava starch` and `tapioca starch`. It does not name the Brazilian fermented product. Keep the exact product name visible and avoid transferring general cassava-flour or tapioca wording across rows. [S03]

## Exact ownership and archive check

The proposal snapshot has no exact owner for normalized `farine de polvilho azedo` in active reference display names or aliases, forms, or legacy-import candidates. The phrase does not occur in earlier WP02 proposals or batch archives. It is not the previously discussed `amidon aigre de manioc` candidate: this exact Québec retail phrase is new to the review archive.

| Exact phrase | Current active owner | Forms / legacy | Disposition |
|---|---|---|---|
| `farine de polvilho azedo` | None | None | Add as French alias on `ingredient-ref-brazil-polvilho-azedo`. |
| `polvilho azedo` | `ingredient-ref-brazil-polvilho-azedo` (`nameFr`; also appears in its English display) | None | Keep canonical French source name. |
| `polvilho doce` | `ingredient-ref-brazil-polvilho-doce` (`nameFr`; also appears in its English display) | None | Separate source-named product; unchanged. |
| `farine de manioc` | `ingredient-ref-cassava-flour` (`aliasesFr`) | None | Keep on whole-root flour. |
| `fécule de manioc` | `ingredient-ref-tapioca-starch` (`nameFr`) | None | Keep on general extracted starch. |
| `manioc starch` | `ingredient-ref-tapioca-starch` (`aliasesEn`) | None | Keep on general extracted starch. |
| `amidon aigre de manioc` | None | None | Remains outside this proposal; earlier proposal flagged it for later review. |

There are no `IngredientForm` rows attached to `ingredient-ref-brazil-polvilho-azedo`, `ingredient-ref-brazil-polvilho-doce`, `ingredient-ref-cassava-flour`, or `ingredient-ref-tapioca-starch`. The existing polvilho ledger record is `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; its accepted identity decision explicitly leaves Québec naming review open. The exact proposed phrase has no active, form, legacy, or ledger owner. The S01 source-ID prefix was also checked for collisions.

## Actual picker behavior

The recipe ingredient picker is `IngredientPickerDialog` in `RecipeEditorScreen.kt`, which builds `IngredientReferenceSearchIndex` and calls `filterNormalized`. `IngredientSearch.kt` folds case, accents, punctuation, and spacing, returns complete word-phrase matches first, and falls back to substring matching only if no complete phrase matches. The following results were replayed against the live reference and form terms using that implementation’s matching rules; no app tests or emulator work were run.

| Picker query | Current result | Result if the proposed alias is added |
|---|---|---|
| `farine de polvilho azedo` | No result | `ingredient-ref-brazil-polvilho-azedo` only |
| `farine de polvilho` | No result | `ingredient-ref-brazil-polvilho-azedo` only |
| `polvilho azedo` | `ingredient-ref-brazil-polvilho-azedo` | Unchanged |
| `polvilho` | Both Brazilian polvilho rows | Unchanged |
| `cassava starch` | Both Brazilian polvilho rows, because that complete phrase occurs in both English displays | Unchanged; do not add this generic phrase as an alias |
| `farine de manioc` | `ingredient-ref-cassava-flour` | Unchanged |
| `fécule de manioc` | `ingredient-ref-tapioca-starch` | Unchanged |
| `amidon aigre de manioc` | No result | Unchanged; outside scope |

The proposed alias makes the exact Québec retail phrase selectable without changing the source-name results or the generic cassava-flour and tapioca-starch owners. No broad `manioc` or `cassava` alias is proposed.

## Bundled recipe demand

All **114 manifest-listed recipe JSON files** and their **1,123 ingredient rows** were scanned. The full serialized recipe texts and ingredient lines were searched for `farine de polvilho azedo`, `polvilho azedo`, `polvilho doce`, `amidon aigre de manioc`, `sour cassava starch`, `sweet cassava starch`, `cassava starch`, `farine de manioc`, `fécule de manioc`, `tapioca starch`, `tapioca flour`, and pão de queijo wording. There were **zero candidate phrase hits**, **zero ingredient rows linked to either Brazilian polvilho ID**, and no recipe link to the reviewed alias. The proposed change addresses picker coverage for a Québec product label; it does not create recipe demand or justify a recipe link.

## Measurement and substitution limits

- The four relevant reference rows remain identity-only with `defaultDensity: null` and `unitMappings: []`; there are no linked forms. Preserve this state.
- The Québec retailer lists a **1 kg package**, which is net package mass only. It is not a cup/spoon measure, density, or recipe yield. [S01]
- Grupo PQ’s separate manufacturer listing gives a product-specific portion of **5 g (1 teaspoon)** for its own polvilho azedo product. It is not a measure for the local Amafil item or a general mapping for this category. Keep it out of the catalog’s density and unit mappings. [S04]
- MAPA describes expansion behavior and variable fermentation, but establishes no common numerical process threshold or replacement ratio. The manufacturer’s recipe links and regional use examples do not establish interchangeability with non-fermented tapioca starch, polvilho doce, or whole-root cassava flour. [S02, S04]
- Add no form, density, unit mapping, conversion, package yield, global/contextual substitution rule, or recipe-line link. Keep the ledger measurement and substitution research states `not_yet_researched`.

## Exact pre-integration snapshot

Snapshot date: **2026-10-12**. These hashes describe the exact shared-worktree bytes read for this proposal, including concurrent edits already present; they are not a clean-branch baseline. The recipe-corpus hash covers each manifest-ordered relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte.

| Surface | Count or scope | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,277 references | `35f1b3b98527b87d15648c9722af9a968e4b160e2b19714d8de66612bbd8d076` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `research-ledger.v1.json` | 1,585 records | `d75f02fafc1cfd015d10148a9e15c5862b438d190e4c3e8fa0cbc41313ceec97` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `IngredientSearch.kt` | Search normalization and matching | `ca41ac04d18fc354c46c9a67798209255e8bc40cb70ca0ee7350a4121ea6b50e` |
| `RecipeEditorScreen.kt` | Picker wiring | `91aa383d7e418ef4150e86f2b3c75903ee51782b35803f33eabb2d2ef1784b98` |
| `BundledIngredientCatalog.kt` | Generated catalog search source | `1e6be90e14f4ac60ad99a5094946ed329cf6e96fb3340cdebefa660e632ccb6d` |
| `RecipeBook-global-ingredient-catalog-plan.txt` | Active checklist | `7af5c5aa8ed700b3dddafb692ba6592d975087555f2a62cd4cd3967ecdb655bb` |
| `baking-flours-starches.md` | Batch review record | `a1ed311f57471f13f05ec4711d50c069f7fccdba540957961897812aed474be0` |

## Exact integration delta if accepted

1. In `ingredient-references.v1.json`, append only `farine de polvilho azedo` to `aliasesFr` for `ingredient-ref-brazil-polvilho-azedo`. Keep both displays, IDs, category, `aliasesEn`, null density, and empty unit mappings unchanged.
2. In `research-ledger.v1.json`, add S01 to the existing `ingredient-ref-brazil-polvilho-azedo` source register and append an accepted alias decision scoped to the Québec retailer’s exact product wording. Keep `identityState: verified` and both measurement/substitution states unchanged. Do not create a separate ingredient or candidate record.
3. Regenerate `BundledIngredientCatalog.kt` from canonical references. Do not hand-edit the generated search source.
4. Record this one exact alias as a bounded B2 naming resolution in the relevant coordinator documentation. Keep the broader B2 item, the polvilho-doce French display review, and the prior `amidon aigre de manioc` candidate open.
5. Add no forms, density, unit mappings, conversions, yields, recipe links, or substitutions.

This documentation-only review did not call for app tests or emulator work.

## Source register

Pages were accessed **2026-10-12**. S01 is the new, proposal-local source record; the remaining sources below establish product boundaries, existing names, and numeric limits. Existing ledger source IDs are shown where applicable.

| ID | Direct source | Evidence and limits |
|---|---|---|
| **WP02-B2-POLVILHO-AZEDO-QUEBEC-ALIAS-20261012-S01** | Marché Brésil, [Amafil Farine de Polvilho azedo premium 1 kg](https://www.marchebresil.com/products/amafil-polvilho-azedo-premium-1kg). | Current French-facing listing uses the exact phrase `Farine de Polvilho azedo`; description says it is made from manioc fécules. The seller advertises delivery in the Montréal region and lists its shop in Chambly, Québec. Direct local retail wording only; not a terminology ruling, package declaration, or process standard. |
| **WP02-POLVILHO-LABELS-20261010-S01** (existing ledger source) | Brazil MAPA, [Ofício-Circular n.º 1/2022 — Polvilho doce and polvilho azedo guidance](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/arquivos/orientacao_tecnica_oficio_circular_nr_01_2022-polvilhos/%40%40download/file). | Defines ordinary cassava fécula as non-fermented; distinguishes the polvilhos and describes variable fermentation, more extensive for azedo. It says no repeatable/reproducible method had been established for differentiating products and mixtures. Official Brazilian process/identity source, not Québec naming evidence. |
| **Context source** | Office québécois de la langue française, [fécule de manioc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc). | Supports the general extracted manioc-starch display and its separation from whole-root flour. It does not name this source-specific fermented product. |
| **WP02-POLVILHO-LABELS-20261010-S05-AZEDO** (existing ledger source) | Grupo PQ Alimentos, [Polvilho Azedo](https://www.grupopq.com.br/produto/polvilho-azedo/). | Manufacturer calls the product `Polvilho Azedo`, gives English `Sour Cassava Starch`, package sizes, and its own serving label `5 g (1 colher de chá)`. Product-specific measure only. |
| **Prior-review context** | Rapidito Latin Market, [Pinduca Sour Cassava Starch (Amidon Aigre de Manioc)](https://rapiditolatinmarket.ca/products/pinduca-amidon-aigre-de-manioc-polvilho-azedo-500g). | Current Canadian retailer title pairs `Amidon Aigre de Manioc` with `Sour Cassava Starch` for a polvilho azedo listing. The 2026-10-10 proposal already flagged this phrase for later Québec terminology review; it is cited here as context, not proposed as a new alias. The page showed the item sold out at access. |

## Prior-review reconciliation

- [`wp02-brazilian-polvilho-label-boundary-review-20261010.md`](wp02-brazilian-polvilho-label-boundary-review-20261010.md) establishes the separate azedo/doce identities and explicitly leaves their French wording pending Québec review. It mentions the Canadian phrase `amidon aigre de manioc` as a term to evaluate, not an accepted alias.
- [`wp02-b2-b3-next-flour-starch-gap-review-20261012.md`](wp02-b2-b3-next-flour-starch-gap-review-20261012.md) reviews generic French cassava-starch terminology and protects the generic tapioca-starch row from cross-aliasing to both polvilho products. This proposal does not revisit that decision.
- The exact local phrase `farine de polvilho azedo` appears in neither prior proposal nor batch archive, active data, forms, or legacy candidates. Its alias is limited to the specific source-named `polvilho azedo` identity.
