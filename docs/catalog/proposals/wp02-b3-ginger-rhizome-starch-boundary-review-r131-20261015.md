# WP02 Section 04 B3 R131 — ginger-rhizome starch boundary review

- **Reviewed:** 2026-10-15.
- **Status:** integrated as a documentation-only hold; no active reference or ledger candidate was added. See the [R131 batch README](../batches/wp02-b3-ginger-rhizome-starch-product-hold-integration-r131-20261015/README.md).
- **Checklist reference:** [`docs/RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt), WP02 Section 04 B3, `[ ] Water-chestnut flour and other documented regional starches.` This review addresses one additional, source-documented regional starch candidate; it does not revisit water-chestnut products, Singoda, or the R128–R130 work.
- **Scope:** Starch isolated from ginger rhizome, identified in sources as *Zingiber officinale*. Keep it separate from fresh ginger, ground ginger, ginger powders, oleoresin-extraction residue, ginger paste, and starches merely listed as ingredients in ginger-containing products.
- **Proposal-local source-ID prefix:** `WP02-B3-GINGER-RHIZOME-STARCH-R131-20261015-S`. The prefix and proposed IDs S01–S05 and S07–S09 were checked against all source IDs in the live ledger and the proposal/batch archive before drafting; none was assigned. S06 deliberately reuses the already-ledgered OQLF `amidon` source ID from R128 rather than duplicating that source.

## Recommendation

**Hold a separate ginger-starch identity outside the picker and ledger for now.** Primary research establishes that starch can be isolated from ginger rhizomes, including both fresh-rhizome starch and starch remaining after oleoresin extraction. The reviewed sources do not establish a current Canadian or Québec consumer food product, a stable package name, or a household culinary use. The source-specific research products also leave open whether a future marketed item would be fresh-rhizome starch, spent-ginger starch, or a distinct commercial preparation.

Québec terminology supports `gingembre` for ginger and prefers `amidon` as the general word for starch. It also describes `fécule` as a contextual term for starch in tubers or other underground organs. These are component terms, not an OQLF-approved product name. `Amidon de gingembre` and `fécule de gingembre` are therefore only possible descriptive constructions; neither is supported here as an exact Québec product label. Do not add either as a display, alias, or legacy candidate.

The available Canadian-facing product examples do not close that gap. One Canadian ginger-chew listing names ginger and tapioca starch as separate ingredients. A Canadian ginger-paste listing found in the search is stale and says only `starch` in a composite ingredient list. An international product page headed “Ginger Starch Powder” describes ordinary ginger powder made from fresh ginger, not isolated starch. None identifies a pure ginger-rhizome starch product.

### Proposed catalog and ledger delta

**None.** Do not add `ingredient-ref-ginger-starch`, `candidate-ginger-starch`, a `GINGER_STARCH` form under `ingredient-ref-ginger`, aliases, measurements, conversions, a recipe link, or a substitution rule. No active record ID is reserved. This proposal does not edit the shared checklist or roadmap.

## Identity and Québec-name boundary

| Phrase or material | Decision | Evidence boundary |
|---|---|---|
| Starch isolated from ginger rhizome, *Zingiber officinale* | **Documented research material; hold as a consumer ingredient identity.** | The CSIR-CFTRI report and research articles describe wet separation/isolation. The materials include a by-product after oleoresin extraction and starch extracted from fresh rhizomes or named study varieties. These are not current Canadian retail specifications. |
| `ginger starch` | **Do not add as an active English display or alias yet.** | It is used in research papers, but this review found no current Canadian or Québec standalone food listing with a usable ingredient declaration. The exact phrase on one international product page conflicts with that page’s description and ingredient statement; see S08. |
| `amidon de gingembre` | **Descriptive French construction only; do not activate.** | OQLF prefers general `amidon` and separately names `gingembre`, but does not list this compound or identify it as a food product. |
| `fécule de gingembre` | **Do not activate.** | OQLF explains a contextual use of `fécule` for starch in underground plant organs. That linguistic note does not attest this exact extracted-ginger product name. |
| Fresh ginger / `gingembre`; ground ginger / `gingembre moulu`; candied ginger / `gingembre confit`; ginger-garlic paste / `pâte de gingembre et d’ail`; beni shoga | **Keep current identities unchanged.** | These active identities are not isolated ginger starch. Do not transfer their names, aliases, recipe lines, or forms to this candidate. |
| Generic `starch`, tapioca starch, modified starch in ginger-containing products | **Keep source and product unspecified.** | A composite product’s ingredient list does not identify the botanical source of an unspecified starch. A separate tapioca-starch ingredient remains tapioca starch. |

No validated fr-CA display or safe alias set is proposed. If a Canadian or Québec package later identifies a standalone human-food starch from ginger, review its exact plant part, extraction feedstock, processing scope, and bilingual label before assigning a name.

## Active catalog, archive, and recipe audit

The live snapshot read on 2026-10-15 contained **1,480 ingredient references, 109 forms, 61 legacy-import candidates, 1,825 research-ledger records, 114 manifest-listed recipe files, and 1,123 ingredient rows**.

| Surface checked | Result |
|---|---|
| Active reference catalog | No reference owns `ginger starch`, `starch from ginger`, `ginger rhizome starch`, `amidon de gingembre`, or `fécule de gingembre`. `ingredient-ref-ginger` is `ginger / gingembre`, category `VEGETABLE_AND_AROMATIC`, with empty aliases, null density, and empty unit mappings. Existing adjacent identities include ground ginger, candied ginger, ginger-garlic paste, and beni shoga. |
| Active forms | No ginger- or starch-labeled form is attached to the active ginger reference. The candidate is an extracted ingredient class, not a preparation-state form of the fresh aromatic. |
| Legacy-import identities | No exact ginger-starch display, alias, or candidate ID is present. |
| Research ledger | No record or decision owns the exact candidate name or proposed IDs `ingredient-ref-ginger-starch` / `candidate-ginger-starch`. General ginger and starch records remain separate. |
| Proposal/batch archive | No prior focused ginger-starch review or integration was found. Exact scans covered `ginger starch`, `starch from ginger`, `ginger rhizome starch`, the two French constructions, the species-qualified phrase, and both proposed record IDs. This is a bounded archive search, not proof that no source elsewhere uses the term. |
| Recipe corpus | A full scan of the 114 manifest-listed JSON files and 1,123 ingredient rows found **zero** candidate-phrase matches and no recipe link. The corpus contains separate ginger-related and starch-related lines, but none names ginger starch. |
| Checklist and roadmap | The B3 parent item remains open. Neither the current roadmap nor the catalog archive contains a ginger-starch decision. |

### Picker behavior

The audit followed [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The current search normalizes case, accents, and punctuation, prefers complete word-phrase matches, and then falls back to substring matches. A read-only reproduction against the live reference/form data returned:

| Query | Current results |
|---|---|
| `ginger starch`, `starch from ginger`, `ginger rhizome starch` | No results. |
| `amidon de gingembre`, `fécule de gingembre` | No results. |
| `ginger` | Five related references: beni shoga, candied ginger, ginger, ginger-garlic paste, and ground ginger. |
| `gingembre` | Four related references: candied ginger, ginger, ginger-garlic paste, and ground ginger. |
| `ground ginger` | Only `ingredient-ref-ground-ginger`. |
| `starch` | 33 starch-named reference results in the current snapshot. |

No row is proposed, so picker behavior does not change. If a product-qualified row is reconsidered later, its full source-supported phrase should be tested against the already multi-result `ginger` family query; bare `ginger`, `gingembre`, `starch`, `ginger powder`, and `ground ginger` are not proposed aliases.

## Measurements, forms, and culinary substitutes

- **Density and household mappings:** No reviewed source establishes a transferable `g/ml`, cup-to-gram, spoon-to-mass, or package-to-recipe conversion. The accessed study pages report starch characterization and an extraction-yield interval, not a kitchen density or household serving. Some full text was inaccessible, so this is not a claim that no laboratory study has ever measured bulk density.
- **Yields and process:** CFTRI reports settling and drying starch as a by-product in a 6-gingerol extraction process. The 2026 study reports a 21.50–28.65% yield for two specified UMUGIN varieties and its study method. These are process- and sample-specific results, not home-preparation yields or conversion data.
- **Forms:** Do not create raw, native, cooked, dried, or spent forms. The source record does not establish a retail form family or household conversion path. A future source may show that different extraction feedstocks need separate review.
- **Substitutions:** The 2026 paper describes thickening potential and the 2025 article characterizes starch properties, but neither supplies a recipe-tested replacement for cornstarch, potato starch, tapioca starch, or another ingredient. No active or recipe-specific substitution is supported.

## Source register

All web sources below were accessed on **2026-10-15**. S01–S05 and S07–S09 use the proposal-local prefix; the reused OQLF source is explicitly identified as S06.

| ID | Source and locator | Supports and limits |
|---|---|---|
| **WP02-B3-GINGER-RHIZOME-STARCH-R131-20261015-S01** | CSIR–Central Food Technological Research Institute, [Annual Report 2014–15](https://www.cftri.res.in/PDF/PERREPORT2014-15.pdf), p. 82, “Extraction of 6-gingerol.” | Names fresh ginger, *Zingiber officinale* Roscoe, and describes crushing, pressing/filtering, settling starch from the filtrate, decanting, and drying it as a by-product of gingerol extraction. Institute research/process description; not a consumer food label, culinary recipe, measure, or retail product. |
| **WP02-B3-GINGER-RHIZOME-STARCH-R131-20261015-S02** | Madeneni et al., [“Physico-chemical and functional properties of starch isolated from ginger spent”](https://onlinelibrary.wiley.com/doi/10.1002/star.201100011), *Starch/Stärke* 63(9) (2011), abstract. | Describes starch isolated from ginger “spent” after oleoresin extraction and says the study explored possible food-ingredient use. Accessible page reports laboratory composition/gelatinization and pasting properties; it does not establish a sold product, consumer culinary use, household measure, or general substitution. Only the accessible abstract was reviewed. |
| **WP02-B3-GINGER-RHIZOME-STARCH-R131-20261015-S03** | Pan et al., [“Ginger as a novel starch resource: Preparation, structural characterization and physicochemical properties”](https://www.sciencedirect.com/science/article/pii/S0308814625040841), *Food Chemistry* (2025), article 146832. | Search-indexed article record describes starch prepared by pulping/screening ginger and reports research on its properties and potential applications. The web tool could not retrieve the full page; the indexed abstract is used only to establish research interest, not a retail name, recipe, or numeric kitchen behavior. |
| **WP02-B3-GINGER-RHIZOME-STARCH-R131-20261015-S04** | Ogbete et al., [“Physicochemical, Functional, and Nutritional Characteristics of Rhizome and Starch from Two Ginger Varieties (UMUGIN 1 and UMUGIN 2)”](https://jfines.org/index.php/jfines/article/view/139), *Journal of Food Innovation, Nutrition, and Environmental Sciences* 3(2) (2026), pp. 172–182; abstract and author affiliations. | The study page identifies fresh rhizomes wet-extracted into starch, affiliations with Nigeria’s National Root Crops Research Institute, study-specific starch yields of 21.50–28.65%, and potential food thickening/formulation. It does not define a Canadian product or recipe replacement. The linked PDF returned a cache miss; the accessible abstract/page was reviewed. |
| **WP02-B3-GINGER-RHIZOME-STARCH-R131-20261015-S05** | OQLF, [*gingembre* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095308/gingembre), last updated 1982. | Preferred term `gingembre`, English `ginger`, and Latin `Zingiber officinale Roscoe`; the definition covers the condiment from ginger. It does not name a starch product or prove a retail food use. |
| **WP02-B3-NATIVE-BUCKWHEAT-STARCH-R128-20261015-S09** (**reused as S06**) | OQLF, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), last updated 2026; existing source record is attached to `ingredient-ref-native-buckwheat-starch` in the live ledger. | Prefers general `amidon` and explains that `fécule` is used more specifically for starch in tubers or other underground organs. This supports only the general fr-CA term choice; it does not attest `amidon de gingembre` or `fécule de gingembre`. No new source ID is allocated for this reused record. |
| **WP02-B3-GINGER-RHIZOME-STARCH-R131-20261015-S07** | Ambrosia Canada, [Lemon Ginger Chews](https://canada.ambrosia.ca/products/lemon-ginger-chews), ingredient list. | Canadian retail listing names cane sugar, tapioca syrup, ginger (16%), tapioca starch, and lemon oil separately. This is one composite candy, not a ginger-starch product or proof of market absence. |
| **WP02-B3-GINGER-RHIZOME-STARCH-R131-20261015-S08** | GBA Nature, [“Ginger Starch Powder”](https://gbanature.com/en-us/products/ginger-special-power), page title, description, ingredients, serving suggestion, and country-of-origin fields. | The title says “Ginger Starch Powder,” but the page describes ginger powder, lists fresh ginger (100%), gives a 1 tbsp/3 g serving, and says Vietnam. This is a naming/content conflict and not evidence for isolated ginger starch, a Canadian product, or a mass-volume mapping. The serving is excluded. |
| **WP02-B3-GINGER-RHIZOME-STARCH-R131-20261015-S09** | Local static audit of `AGENTS.md`, relevant `Requirements.md` ingredient-reference rules, the exact WP02 B3 checklist and roadmap, live references/forms, legacy identities, ledger, proposals/batches, `IngredientSearch.kt`, the manifest, and recipe files; accessed 2026-10-15. | Bounded workspace snapshot and exact-string/picker/corpus audit. The source-ID prefix and S01–S05/S07–S09 were unused in the ledger and proposal/batch archive before drafting. Absence from this repository or the bounded web searches does not prove universal market absence. |

## Remaining question

Does a current Canadian or Québec human-food product exist that is specifically a standalone starch isolated from *Zingiber officinale*, with a product-qualified bilingual label and culinary use? Until a source answers that question, retain this as a documented research material only; do not allocate a picker identity, alias, ledger candidate, measurement, form, or substitution.
