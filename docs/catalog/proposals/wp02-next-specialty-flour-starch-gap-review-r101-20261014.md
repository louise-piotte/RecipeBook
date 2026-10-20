# WP02 Section 04 B3 R101 — sacred lotus seed starch review

- **Reviewed:** 2026-10-14.
- **Status:** Integrated. Added the identity-only reference and source ledger record, plus checklist, roadmap, generated catalog, and batch README updates. No forms, recipes, measurements, or substitution rules were added.
- **Checklist fit:** The Section 04 B3 item `[ ] Water-chestnut flour and other documented regional starches` remains open. This packet reviews one additional plant-part-qualified starch; it does not close B3 or reopen the recent modified-tapioca work.
- **Scope:** Starch experimentally isolated from seeds of sacred lotus (*Nelumbo nucifera*). Keep it distinct from whole sacred lotus seeds, sacred lotus seed flour, and extracted lotus-rhizome starch.
- **Source-ID prefix:** `WP02-B3-LOTUS-SEED-STARCH-20261014-R101`. The prefix and candidate ID were unassigned before integration and now identify the new row and its seven ledger sources.
- **Decision:** **Added one identity-only `FLOUR_AND_STARCH` reference** for `sacred lotus seed starch (Nelumbo nucifera) / amidon de graines de lotus sacré (Nelumbo nucifera)`. The French compound is a provisional descriptive Québec display, not an OQLF headword or verified Canadian product label. Both alias arrays remain empty; no form, active measurement, conversion, recipe link, or substitution was added.

## Identity and scope

The integrated identity is the separated starch fraction studied from the seeds of *Nelumbo nucifera*. It is not whole seed, whole-seed flour, lotus seed paste, or starch isolated from the plant's rhizome. Primary papers explicitly distinguish seed starch from rhizome starch: a 2025 comparison studies them as separate isolated samples, while a direct extraction paper separately compares starch prepared from lotus-seed embryo with lotus-root starch. [S05–S06]

The identity remains species and plant-part qualified. Do not extend it to water-lily starch from *Nymphaea* species, fox nut/makhana from *Euryale ferox*, lotus-root starch, generic `lotus starch`, or unspecified lotus powder. The evidence supports a research-documented food-ingredient class, not a market-wide product specification, commercial availability in Canada, a particular cultivar, or one extraction process. [S01, S05–S07]

The latest reviewed active lotus-related identities are:

| Reference | Current display | Boundary |
|---|---|---|
| `ingredient-ref-lotus-root` | `lotus root / racine de lotus` | Vegetable/rhizome identity. OQLF's Québec term names the root, not seed starch. [S04] |
| `ingredient-ref-lotus-root-starch` | `lotus root starch / amidon de racine de lotus` | Previously reviewed extracted rhizome starch; keep this separate from seed starch. [S05–S06] |
| `ingredient-ref-lotus-seeds` | `sacred lotus seeds (Nelumbo nucifera) / graines de lotus sacré (Nelumbo nucifera)` | Whole edible seed identity. Its English alias `sacred lotus seed` deliberately preserves the whole-seed choice in singular searches. |
| `ingredient-ref-lotus-seed-flour` | `sacred lotus seed flour (Nelumbo nucifera) / farine de graines de lotus sacré (Nelumbo nucifera)` | Milled whole-seed flour identity accepted in R72. It is not the separated starch fraction. |

Do not represent seed starch as a `ground` or `extracted` form under the whole-seed reference. The starch is a separately isolated ingredient fraction and belongs in `FLOUR_AND_STARCH`; a form attached to the seed row would project the starch search to the whole-seed identity. Do not add `starch` as a form of seed flour or an alias on the root-starch identity. [S05–S07]

## English and Québec French naming

| Field | Integrated value | Evidence and limit |
|---|---|---|
| English display | **sacred lotus seed starch (Nelumbo nucifera)** | Recent primary research uses `lotus seed starch` and identifies *Nelumbo nucifera* in the title. The existing species-qualified `sacred lotus seed` wording keeps this product apart from the root, seed-flour, and *Euryale* records. [S01, S06–S07] |
| French display | **amidon de graines de lotus sacré (Nelumbo nucifera)** | Provisional descriptive Québec wording. OQLF prefers generic `amidon` and explains the narrower use of `fécule` for starch in underground organs; MNHN supplies the French common name `lotus sacré` and describes the species' seeds as food. Neither source attests this complete Québec product name. [S02–S04] |
| English aliases | None | The display already matches the supported `lotus seed starch` phrase. Do not store broad `lotus starch`, `lotus root starch`, or unqualified `seed starch`. |
| French aliases | None | No Canadian or Québec standalone seed-starch label was found in the bounded search. Do not add `amidon de lotus`, `fécule de lotus`, `amidon de lotus sacré`, or a literal scientific-name alias without a product-specific source. |

OQLF's `racine de lotus` entry remains evidence for the Québec name of the vegetable only, while its 2026 `amidon` entry supports the generic French headword for starch. The French display applies that generic term to the source-defined seed starch and is explicitly provisional. A future local label or OQLF entry could refine the display; the current evidence does not justify presenting it as settled local terminology. [S03–S04]

The narrow reference added is:

```json
{
  "id": "ingredient-ref-lotus-seed-starch",
  "nameEn": "sacred lotus seed starch (Nelumbo nucifera)",
  "nameFr": "amidon de graines de lotus sacré (Nelumbo nucifera)",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The integrated `ingredient_reference` ledger record cites sources S01–S07 and uses `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Its observation and substitution arrays are empty; the studies' lab-property results are not transferable catalog measurements or culinary substitution findings.

## Current ownership and picker projection

At proposal review baseline, before root integrations, the live bundled package contained **1,435 ingredient references, 105 forms, 1,775 ledger records, and 63 legacy candidates**. The manifest lists **114 recipes**. The only relevant active rows were the four lotus identities above; before integration, the seed-starch ID and exact display/search phrases had no owner in references, forms, legacy candidates, or ledger records. The ID and source-prefix checks are now reflected in the new reference and ledger record. No prior seed-starch candidate or source-prefix collision was found in the earlier proposal and batch archive. The R72 seed-flour review covers whole-seed flour; the earlier lotus-starch review covers rhizome starch. Neither decides isolated seed starch.

The picker in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) returns complete normalized word-phrase matches before trying substring matches. I projected the pre-integration and integrated results against the active references and forms:

| Query | Before integration | After integration |
|---|---|---|
| `sacred lotus seed starch` | None | `ingredient-ref-lotus-seed-starch` |
| `lotus seed starch` | None | `ingredient-ref-lotus-seed-starch` |
| `amidon de graines de lotus sacré` | None | `ingredient-ref-lotus-seed-starch` |
| `lotus seed` | Whole sacred lotus seeds; sacred lotus seed flour | Those two plus seed starch |
| `sacred lotus seed` | Whole sacred lotus seeds; sacred lotus seed flour | Those two plus seed starch |
| `graines de lotus sacré` | Whole sacred lotus seeds; sacred lotus seed flour | Those two plus seed starch |
| `sacred lotus seed flour` | Sacred lotus seed flour | Sacred lotus seed flour |
| `lotus root starch` / `amidon de racine de lotus` | Lotus-root starch | Lotus-root starch |
| `lotus starch` / `amidon de lotus` | None | None |

The qualified starch phrases select the new identity alone. Broader seed phrases add a distinct starch choice while retaining the whole-seed and whole-seed-flour choices. The exact root-starch queries remain on the root identity, and unqualified `lotus starch` remains unassigned. No companion alias or existing-row edit is needed.

## Recipe demand, measures, and substitutions

The recipe scan covered every manifest-listed JSON file and all **1,123 ingredient rows**. It searched full recipe text and ingredient objects for `lotus seed starch`, `sacred lotus seed starch`, `lotus-seed starch`, `Nelumbo nucifera seed starch`, `amidon de graines de lotus`, `amidon de lotus sacré`, and related seed-starch phrases. It found **zero recipe-file matches and zero ingredient-row matches**. The bundle does not support a recipe link or a recipe-driven alias.

| Question | Evidence found | Integrated catalog behavior |
|---|---|---|
| Household measures | None. The reviewed papers report laboratory extraction and physical/functional tests, not a cup, spoon, package serving, or kitchen portion. | Add no unit mapping or measure observation. |
| Density | None. Reported granule size, amylose content, swelling, pasting temperature, viscosity, and related values are sample-specific laboratory properties, not bulk g/mL density. | Keep `defaultDensity: null`; do not derive density from other lotus products or study measurements. |
| Forms and process states | A 2024 study separately examines native seed starch and samples modified by heat-moisture treatment and ultrasonication. It does not establish these as consumer forms of a standard retail ingredient. [S07] | Add no `IngredientForm`. Keep treatment labels and extraction details in source context only. |
| Yield or conversion | Extraction procedures differ by study; no validated home seed-to-starch yield or starch-to-flour conversion was established. | Add no yield, conversion, or recipe-line link. |
| Substitution | The 2025 comparison is a physicochemical characterization, not a recipe replacement trial. The modified-starch studies are not an exchange-ratio test. | Add no global or contextual replacement rule for cornstarch, potato starch, tapioca starch, lotus-root starch, or seed flour. |

## Source register

All sources below were accessed on **2026-10-14**. The source IDs were unique against the ledger at review time and are now stored on the integrated ledger record.

| Source ID | Source and direct link | Evidence used and limit |
|---|---|---|
| `WP02-B3-LOTUS-SEED-STARCH-20261014-R101-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Nelumbo nucifera*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:605422-1). | Current accepted-name record for *N. nucifera*. Botanical identification only; it does not establish starch products or food-label names. |
| `WP02-B3-LOTUS-SEED-STARCH-20261014-R101-S02` | Muséum national d’Histoire naturelle, [Lotus sacré](https://www.mnhn.fr/fr/lotus-sacre). | French common name tied to the sacred-lotus species and source for French seed wording. French botanical/food-use source, not a Québec terminology decision or starch-product label. |
| `WP02-B3-LOTUS-SEED-STARCH-20261014-R101-S03` | Office québécois de la langue française, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. | Gives `amidon` as the preferred general French term for starch and describes `fécule` as more specific to underground organs. It does not name lotus-seed starch. |
| `WP02-B3-LOTUS-SEED-STARCH-20261014-R101-S04` | Office québécois de la langue française, [racine de lotus (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434863/racine-de-lotus), updated 1982. | Establishes the Québec term `racine de lotus` for the edible rhizome vegetable. It does not cover seed, seed flour, or extracted seed starch. |
| `WP02-B3-LOTUS-SEED-STARCH-20261014-R101-S05` | Tomomi Ito, Makoto Murase, Tetsuya Yamada, and Kazuko Namiki, [“Properties of Lotus-seed Starch”](https://doi.org/10.11541/jag1994.43.7), *Journal of Applied Glycoscience* 43(1) (1996), 7–13. | Primary study prepares starch in the embryo of *Nelumbo nucifera* lotus seeds by wet milling with dilute alkali and compares it with lotus-root, corn, and potato starches. Supports a distinct seed-starch fraction; its extraction and lab properties are not a retail specification or cooking measure. |
| `WP02-B3-LOTUS-SEED-STARCH-20261014-R101-S06` | Ankita Chandak et al., [“Exploring the Potential and Properties of Lotus (*Nelumbo nucifera* G.) Starches in Comparison With Conventional Starches for Food and Non-Food Applications”](https://doi.org/10.1002/star.202400067), *Starch/Stärke* 77(4) (2025), e202400067; first published 2025-01-29. | Primary comparative study of starch isolated separately from lotus seeds and rhizomes, alongside mung-bean and potato starch. Supports the plant-part boundary and lab characterization only; it does not test a culinary substitution ratio, household measure, or Canadian product. |
| `WP02-B3-LOTUS-SEED-STARCH-20261014-R101-S07` | Ankita Chandak et al., [“Lotus (*Nelumbo nucifera* G.) seed starch: Understanding the impact of physical modification sequence (ultrasonication and HMT) on properties and in vitro digestibility”](https://doi.org/10.1016/j.ijbiomac.2024.135032), *International Journal of Biological Macromolecules* 278 (2024), 135032. | Primary study explicitly extracts native lotus-seed starch and tests particular heat-moisture/ultrasonication treatments. These treatment samples are experimental states, not evidence for generic forms, household measures, or substitutions. |

## Static checks and limits

- Read `AGENTS.md`, the relevant `Requirements.md` ingredient-reference and conversion sections, current roadmap WP02 entries, the open Section 04 checklist, the current WP02 flour/starch batch index, and the R94/R96/R98 proposals and integration records.
- Checked current reference names/aliases, form labels/match terms, legacy candidate names/aliases, and ledger IDs/content for the candidate identity and phrases. Audited the complete proposal/batch archive for the product phrase and R101 source-ID prefix.
- Read the picker implementation, projected the query table using its complete-phrase-first matching behavior, and scanned all 114 manifest-listed recipe files and 1,123 ingredient rows.
- Checked the source links and dates above online on 2026-10-14. The search for a Québec/Canadian standalone seed-starch label was bounded to the exact English and French display variants; no matching label surfaced. This does not prove that no such product exists.
- The English identity is source-attested in primary research. The French display combines the OQLF-preferred generic starch term with the MNHN French species name; it remains provisional pending Québec-specific product terminology.
- Root integration added the reference, ledger record, checklist and roadmap entries, generated catalog, and batch README. No app, Gradle, instrumentation, emulator, or other tests were run because the active change only adds database JSON data and its generated catalog index.
