# WP06 African regional gap review R478 — Kuka (baobab leaf powder)

- **Date:** 2026-10-17
- **Status:** Proposal only; no shared catalog, form, ledger, recipe, plan, roadmap, or generated-file changes made.
- **Scope:** One source-named West African baobab-leaf powder identity under the still-open Section 05 African cuisine coverage item. This is a separate plant part from the active baobab fruit-pulp reference and is distinct from R475 Voatsiperifery pepper.
- **Recommendation:** Accept one identity-only `VEGETABLE_AND_AROMATIC` row for **`kuka powder (dried baobab leaf powder)` / `poudre de feuilles de baobab séchées (kuka)`**. Add only the source-attested English alias `baobab leaves powder`; leave French aliases empty. Keep `lalo`/`laalo`, prepared `miyan kuka`, fresh baobab leaves, and baobab fruit products outside this row.

## Open-plan fit and prior-work boundary

The African cuisine item in [Section 05 of the global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) remains open after the six-region gap sweep and regional continuation. This review adds one bounded plant-part product and makes no claim of country-level or continental coverage. The current active reference for Madagascar’s Voatsiperifery pepper remains unchanged.

There is no prior focused `kuka` or baobab-leaf-powder identity proposal. The earlier [baobab fruit-pulp review](wp03-section-m-sapote-baobab-followup-20261010.md) explicitly scoped its accepted row to separated *Adansonia digitata* fruit pulp and left leaves/`lalo` and generic baobab powder as separate product questions. The current active fruit-pulp row does not represent those leaves. The [thiéré review](wp03-section-f-thiere-millet-couscous-identity-review-20261012.md) notes a product-specific thiéré-lalo formula containing baobab-leaf powder; that is compound-product context, not a baobab ingredient identity, a bundled recipe hit, or a reason to alias baobab leaf powder to couscous.

The existing OQLF baobab source, already registered as `WP03-M-SAPOTE-BAOBAB-20261010-S12`, describes dried powdered baobab leaves under the regional name `lalo`. Reuse that source entry rather than duplicating it. Keep `lalo` out of active aliases: the word is also used for jute leaves in Haitian cuisine, and the catalog cannot attach region scope to an alias. Kew’s *Adansonia digitata* evidence is already registered under `WP03-M-SAPOTE-BAOBAB-20261010-S14`; it supports botanical context and distinguishes edible baobab parts, not a culinary product label.

## Live package snapshot and ownership audit

Counts and exact-byte hashes were refreshed from the shared worktree on 2026-10-17. Recheck them before any integration because other WP06 work is proceeding in parallel.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,755 references | `56cdacf37c74d85ffb33c0eda77be0c8874cf5c1439863a89662fe9c8a95668c` |
| `ingredient-forms.v1.json` | 142 forms | `19efc2f40ddd50e33c1373a997d6940962cabe32d929efedaab38934e46bea62` |
| `legacy-import-identities.v1.json` | 56 candidates | — |
| `research-ledger.v1.json` | 2,114 records; 9,636 source entries; 8,183 distinct source IDs | — |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,988 aggregate bytes | `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

The proposed reference ID `ingredient-ref-baobab-leaf-powder`, target path, and source-ID prefix `WP06-AFRICA-KUKA-IDENTITY-R478-20261017-S` had no owner in the active references, forms, legacy candidates, ledger, or proposal archive when checked. The specific new source URLs below were not already registered in the ledger. Exact normalized search keys `kuka`, `kuka powder`, `baobab leaf powder`, `dried baobab leaf powder`, `baobab leaves powder`, `poudre de feuilles de baobab`, and `poudre de feuilles de baobab séchées` had no owner in active references, forms, or legacy candidates.

The nearest active row is `ingredient-ref-baobab-fruit-pulp` (`baobab fruit pulp (Adansonia digitata)` / `pulpe de fruit de baobab (Adansonia digitata)`). Its plant part and product are different. No active form belongs to baobab leaves or powder. No legacy candidate or ledger record is keyed to `kuka`; the existing baobab-pulp ledger record only records leaves/`lalo` as outside that fruit-pulp identity.

## Candidate identity and picker behavior

| Proposed ID | English display | fr-CA display | Category | Aliases |
|---|---|---|---|---|
| `ingredient-ref-baobab-leaf-powder` | `kuka powder (dried baobab leaf powder)` | `poudre de feuilles de baobab séchées (kuka)` | `VEGETABLE_AND_AROMATIC` | EN: `baobab leaves powder`; FR: none |

The borrowed `kuka` name is source-attested for dry baobab leaves in Hausa use and appears in the Nigerian paper’s `Kuka powder` ingredient row. The French display is a direct descriptive phrase used in French-language regional food research, not an OQLF-approved product term; retain the borrowed name in parentheses and leave Québec terminology review open. No `Adansonia digitata` alias is proposed: the binomial identifies the plant rather than the leaf product, and the active fruit-pulp row already has it in its display. The broad food name `baobab` is the useful search that will reveal both plant-part choices.

The picker normalizes accents and punctuation, prefers complete word phrases, then falls back to partial matching. Baseline probes returned:

| Query | Current result | With the proposed row |
|---|---|---|
| `kuka`, `kuka powder`, `baobab leaf powder`, `dried baobab leaf powder`, `baobab leaves powder` | No result | The proposed leaf-powder identity |
| `poudre de feuilles de baobab`, `poudre de feuilles de baobab séchées`, `kuka` in fr-CA mode | No result | The proposed leaf-powder identity, displayed in French |
| `baobab` | `ingredient-ref-baobab-fruit-pulp` | The fruit-pulp row and the new leaf-powder row |
| `baobab fruit pulp`, `Adansonia digitata` | The fruit-pulp row | Unchanged; no species alias is added to the leaf-powder row |
| `lalo`, `laalo`, `miyan kuka` | No result | Unchanged; no alias or prepared-soup match is added |

The second `baobab` result is an intentional plant-part choice. Do not merge leaf powder into fruit pulp or add the bare term `baobab powder`, which does not state whether a recipe means fruit pulp or leaves.

## Bundled recipe demand

All 114 manifest-listed recipe JSON files were scanned in full, along with every one of the 1,123 `ingredients[]` rows and their identity/text fields. Case-folded, accent-insensitive whole-phrase probes covered `baobab`, `kuka`, `kuka powder`, `baobab leaf`, `baobab leaf powder`, `dried baobab leaf powder`, `dried baobab leaves`, `baobab leaves powder`, the French leaf-powder phrases, `lalo`/`laalo`, `miyan kuka`/`miyar kuka`, and *Adansonia digitata*. The scan found **zero full-recipe hits and zero ingredient-row hits** for these candidate and boundary terms. No bundled row or recipe link is proposed.

Recipe 090, **African Peanut Stew**, does not contain baobab or kuka; its peanut-butter line remains linked to `ingredient-ref-peanut-butter`. It provides no demand, identity, or substitution evidence for this candidate. The Nigerian Eni Kuka recipe discussed below is an external regional research recipe and is not bundled app content.

## Product, form, numeric, and substitution boundaries

Treat the identity as the dried baobab-leaf powder product, used as a vegetable soup ingredient/thickener. Do not add fresh leaves or whole dried leaves as aliases or forms of this powder row; they are distinct preparation states and can be reviewed separately. No ingredient form is required for the source-named powder identity. Keep fresh baobab leaves, fruit pulp, fruit-pulp powder, seeds, and whole fruit/capsule separate. Do not use `miyan kuka`/`miyar kuka` as aliases: those name prepared soup, not the powder.

The Nigerian Journal of Nutritional Sciences study reports one Nupe Eni Kuka recipe using **50 g** of baobab-leaf powder, a local **small tin cup of milk** measure, and a **25–75 g** quantity variation. This is one recipe-context observation; the paper does not define a standard cup volume or a reusable serving basis. If retained in the ledger, record it only with the named Nupe soup context and source wording. It does not support `defaultDensity`, `unitMappings`, package yield, or a generic measure. The study’s reported **638.33 g** average yield is prepared soup yield, not a powder yield.

The Burkina Faso observations describe market powder and use in a sauce served with cereal dishes; their observed recipe formulation is not a universal ratio. Add no density, kitchen measure, conversion, yield, storage/safety statement, or active substitution rule. None of the reviewed sources recommends a direct substitute for baobab-leaf powder; do not infer replacement by jute leaves/`lalo`, moringa, okra, or another thickener. Leave substitution research open and add no recipe-line substitution link.

## Proposed data and ledger action

Add one identity-only row if accepted:

```json
{
  "id": "ingredient-ref-baobab-leaf-powder",
  "nameFr": "poudre de feuilles de baobab séchées (kuka)",
  "nameEn": "kuka powder (dried baobab leaf powder)",
  "aliasesFr": [],
  "aliasesEn": ["baobab leaves powder"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

If accepted, record identity evidence from the sources below and reuse existing OQLF/Kew source entries `WP03-M-SAPOTE-BAOBAB-20261010-S12` and `...-S14` rather than duplicating them. Preserve the Nupe recipe amount only as a scoped observation if the ledger model supports it. Record no general conversion, density, substitution, form, recipe link, package yield, or safety claim. The Section 05 and Section Z African coverage items remain open.

## Sources and limits

New sources were checked on 2026-10-17. Their IDs are proposal-local and are not yet ledger entries.

| ID | Source | Claim used and limit |
|---|---|---|
| **WP06-AFRICA-KUKA-IDENTITY-R478-20261017-S01** | National Research Council, [“Baobab,” *Lost Crops of Africa: Volume II: Vegetables*](https://www.nationalacademies.org/read/11763/chapter/5), 2006, p. 82. | Says baobab leaves are used as a soup ingredient, are typically ground into sauces, and identifies `kuka` as the Hausa name for dry baobab leaves; it also reports wider West African use of Wolof `lalo`. Supports regional food identity and the reason not to globalize `lalo`; it is not a product standard or universal preparation rule. |
| **WP06-AFRICA-KUKA-IDENTITY-R478-20261017-S02** | Christèle Icard-Vernière et al., [*Traditional recipes of millet-, sorghum- and maize-based dishes and related sauces frequently consumed by young children in Burkina Faso and Benin*](https://horizon.documentation.ird.fr/exl-doc/pleins_textes/divers15-11/010052107.pdf), IRD/INSTAPA, May 2010, “Baobab leaf powder sauce,” printed p. 63 (PDF p. 210). | Uses the exact French product phrase `poudre de feuilles de baobab séchées`, describes market availability and use in cereal accompaniments including tô. The powder-sauce discussion is based on two Ouagadougou observations from 2008; its product formulation and location are not generalized to all West Africa or Québec. |
| **WP06-AFRICA-KUKA-IDENTITY-R478-20261017-S03** | A. Uthman et al., [“Proximate and Amino Acid Compositions of Commonly Consumed Native Soups among Nupe People of Niger State, Nigeria”](https://journal.nutritionnigeria.org/wp-content/uploads/2025/03/Vol.-41-Issue-2-Paper-1.pdf), *Nigerian Journal of Nutritional Sciences* 41(2), November 2020, Eni Kuka method and Table 1, pp. 2–3. | Identifies `Kuka (Baobab powder leaves)` / `Eni Kuka` in a Nupe soup recipe and gives the single-recipe quantity and local measure reported above. It establishes one regional usage, not a national standard, universal measure, nutritional recommendation, food-safety process, or substitution. |
| **Reused, existing source ID `WP03-M-SAPOTE-BAOBAB-20261010-S12`** | OQLF, [GDT: baobab](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17487017/baobab). | Already registered on the baobab fruit-pulp record. Identifies `lalo` for dried powdered leaves in its source context and distinguishes that material from fruit pulp; do not copy the source entry into a second ledger source record or activate `lalo` globally. |
| **Reused, existing source ID `WP03-M-SAPOTE-BAOBAB-20261010-S14`** | Kew Science, [Plants of the World Online: *Adansonia digitata*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:558628-1/general-information). | Already registered on the baobab fruit-pulp record. Taxonomic and plant-part context only; it does not provide the English or French product display. |

This proposal resolves only the named dried leaf-powder identity. Keep wider African regional coverage, the `lalo` language-scope question, fresh/whole dried leaf products, and independent Québec terminology review open.

This deliverable changes only this proposal file. No tests, builds, emulator checks, or deployment were run.
