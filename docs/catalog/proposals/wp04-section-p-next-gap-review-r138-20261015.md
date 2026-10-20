# WP04 Section P — Japanese sea cucumber identity and picker-boundary review (R138)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** Japanese sea cucumber, accepted taxon *Apostichopus japonicus*.
- **Recommendation:** Hold with no delta. Do not create an active reference, alias, form, recipe link, or new research-ledger record. The taxon and a bilingual name pair are documented, but a species-qualified French display using the available wording would cause the generic picker query `bêche-de-mer` to return this one species alone. OQLF also says that generic seafood labels such as `bêche de mer` and `concombre de mer` were not retained for Québec fish-product labeling to avoid species confusion.
- **Scope:** Proposal-only. No shared catalog JSON, research ledger, plan, roadmap, generated index, or batch file was changed. No app or Gradle tests were run.

## Candidate selection and prior work

The open Section P backlog includes “Sea urchin, abalone, conch, whelk, sea cucumber, and regionally used seafood with verified names” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5710)). Existing work has held generic sea cucumber, integrated the species-specific *Cucumaria frondosa* identity and dried gutted body-wall form, and kept *C. frondosa* distinct from other species and generic terminology. This review selects *A. japonicus*, a different species not covered by those decisions, R132’s whole/live green sea urchin review, or R137’s Kumamoto oyster review.

The live reference catalog has 1,492 identities and 112 forms. Its only sea-cucumber identity is `ingredient-ref-orange-footed-sea-cucumber` for *C. frondosa*, with its existing dried body-wall form. The shared ledger contains the already-reviewed `candidate-sea-cucumber` record and the *C. frondosa* identity/form records; it has no *A. japonicus* record. The legacy identity file, proposal archive, and batch archive contain no species-specific *A. japonicus* review or allocation. The generic candidate already captures the broad terminology boundary, so this proposal adds no duplicate candidate record.

## Taxon and names

The accepted scientific name is *Apostichopus japonicus*. WoRMS lists it as an accepted species and lists English names “Japanese spiky sea cucumber” and “Japanese sea cucumber.” Its French entry spells the term “bèche-de-mer japonaise” with a grave accent; CFIA writes **Bêche-de-mer japonaise**, consistent with OQLF’s spelling of “bêche-de-mer.” ITIS independently lists the name as valid and records older synonyms including *Stichopus japonicus*. CFIA’s live Fish List pairs TSN 656053 and *A. japonicus* with **Japanese Sea Cucumber / Bêche-de-mer japonaise**. CFIA describes the Fish List names as acceptable common names recommended for fish labeling; this establishes Canadian naming evidence, not a consumer product state or species identification for a vendor SKU. [S01–S05]

The Québec French evidence does not supply a clear alternate species-specific display name. OQLF’s general `concombre de mer` entry lists `concombre de mer`, `bêche-de-mer`, `bêche de mer`, and `biche-de-mer`, and states that several holothurian species bear the name. Its 2012 `holothurie` entry says generic `bêche de mer`, `concombre de mer`, `trépang`, and `tripang` were not retained for Québec fish-product marketing to avoid consumer-label confusion and that one term corresponding to a specific species is normalized. The current OQLF species-specific Québec/Canada term `holothurie touffue` names *Cucumaria frondosa*, already represented in the catalog; OQLF has no reviewed species-specific entry for *A. japonicus*. Thus the CFIA/WoRMS French label is documented, but a Québec-preferred commerce label for this species is not. [S05–S07]

## Canadian market evidence and limits

A current NG Fung Enterprises listing from its Richmond, British Columbia operation shows **Japanese Sea Cucumber with Spikes/LB** with “30-35 pcs/lb” and “Product of Japan,” and a separate **Japanese Sea Cucumber/LB** listing. This supports that a Canadian seafood supplier markets a Japanese-named product; it does not establish *A. japonicus*, since the listing does not state a binomial, and it provides no French product name. The listing’s origin is Japan, not evidence of Canadian harvest. Its product page does not establish stock at the time of review. No exact *A. japonicus* Québec retail listing was found in the sources reviewed; that is a research limit, not evidence that it is unavailable in Québec. [S08]

## Picker boundary

The app’s ingredient search normalizes accents and punctuation, checks full word phrases, then falls back to substring matching ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Hyphenated `bêche-de-mer` therefore normalizes to `beche de mer`, which is a full phrase inside `bêche-de-mer japonaise`.

The table compares live search results with a hypothetical single reference displayed as `Japanese sea cucumber / bêche-de-mer japonaise` and with no aliases or forms. The hypothetical is a projection only; no reference is proposed.

| Query | Current result count | If that one row were added | Result |
|---|---:|---:|---|
| `Japanese sea cucumber` | 0 | 1 | Species-qualified English name resolves to the candidate. |
| `bêche-de-mer japonaise` | 0 | 1 | Species-qualified French name resolves to the candidate. |
| `bêche-de-mer` | 0 | 1 | Broad French query would misleadingly return one taxon. |
| `sea cucumber` | 1 | 2 | The existing *C. frondosa* identity and Japanese candidate would both appear. |
| `concombre de mer` | 1 | 1 | Existing *C. frondosa* alias remains the only hit because the proposed French name does not contain this phrase. |
| `Apostichopus japonicus` | 0 | 0 | The binomial would not be searchable without an explicit alias, which is not proposed. |

Adding the binomial as an alias would expose the taxon string but would not fix the generic French query. Replacing the French display with an unverified construction such as `holothurie japonaise` would not meet the naming-evidence requirement; it could also make broad `holothurie` appear to resolve to a single row. The available evidence therefore does not support a safe bilingual active label and picker behavior. Do not add `Japanese sea cucumber`, `bêche-de-mer japonaise`, `bêche-de-mer`, or `Apostichopus japonicus` to another row.

## Recipe demand, forms, quantities, and substitutions

The current package manifest lists **114 recipe files / 1,123 ingredient rows**. I searched only string values within each manifest-listed ingredient row; recipe titles, instructions, tags, and other metadata were excluded. Search terms were *Apostichopus japonicus*, `Japanese sea cucumber`, `Japanese spiky sea cucumber`, `Japanese Sea Cucumber with Spikes`, `bêche-de-mer japonaise`, and `bêche de mer japonaise`. The result was **0 matching ingredient rows in 0 recipe files**. The bundle supplies no current recipe demand for this candidate.

No preparation or preservation state is supported for the species-specific ingredient. NG Fung’s per-pound listing and 30–35 piece range are seller-specific product details; they do not define a reusable recipe measure, count-to-weight conversion, edible yield, or package rule. The listing does not identify a fresh, frozen, dried, cooked, whole, or extracted product state. Add no form, density, unit mapping, conversion, yield, or measure. No global or contextual substitution is supported, and no recipe link is proposed. The existing *C. frondosa* dried body-wall form remains species-scoped.

## Disposition and reopening boundary

**No catalog or ledger delta is proposed.** Keep the generic `candidate-sea-cucumber` hold and the existing *C. frondosa* identity/form unchanged. Do not transfer the Japanese trade label or binomial onto *C. frondosa* or any generic row.

Reopen this species-specific identity only when an exact recipe or product identifies the species and the review can establish a Québec-appropriate French display whose use in the picker does not turn broad seafood terminology into a single-species answer. Review any product state and measurement separately from identity.

## Sources

All sources below were accessed on 2026-10-15. Source labels are local to this proposal; no ledger source IDs were allocated.

| ID | Direct source | Evidence and limitation |
|---|---|---|
| **S01** | WoRMS, [*Apostichopus japonicus* taxon details](https://www.marinespecies.org/aphia.php?p=taxdetails&id=241776), AphiaID 241776. | Accepted species; lists “Japanese spiky sea cucumber,” “Japanese sea cucumber,” and French “bèche-de-mer japonaise” (grave accent in source). Taxonomy and multilingual names, not Québec retail terminology. |
| **S02** | ITIS, [*Apostichopus japonicus* report](https://itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=656053), TSN 656053. | Current standing valid; lists synonyms including *Stichopus japonicus*. Taxonomic corroboration. |
| **S03** | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), *A. japonicus* row, TSN 656053; also *Holothuria mexicana* and *H. scabra* rows. | Gives “Japanese Sea Cucumber / Bêche-de-mer japonaise” for *A. japonicus*; also assigns broad `Bêche de mer` to *H. mexicana* and generic sea-cucumber names to other taxa. Dynamic list. |
| **S04** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), “CFIA Fish List” section. | Says Fish List common names are acceptable and recommended and gives a TSN with each species. Labeling guidance, not availability or recipe guidance. |
| **S05** | OQLF, [`concombre de mer`, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435715/concombre-de-mer), food/fishery-products domain, last updated 1983. | Lists the four French terms above, English `sea cucumber`, and states several holothurian species bear the name. Generic terminology, not an *A. japonicus* entry. |
| **S06** | OQLF, [`holothurie`, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198935/holothurie), last updated 2012. | Calls `holothurie` a term for a fishery species with Québec commercial potential; says generic names were not retained for Québec fish-product commercialization to avoid confusion and one species-specific term was normalized. It does not identify *A. japonicus* as that term. |
| **S07** | OQLF, [`holothurie touffue`, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26583978/holothurie-touffue), updated 2026. | Explicitly pairs Québec/Canada-preferred `holothurie touffue` and `concombre de mer du Nord` with *Cucumaria frondosa*. Confirms the existing species-specific French name, not a Japanese-species name. |
| **S08** | NG Fung Enterprises, [seafood listings](https://ngfungfood.com/en/2-home?page=4&q=Categories-Canned+Foods-Live+Seafood-Meat+%5C%2F+Milk-Store+Specials-Sauce%7CSeasoning%7CSpices), Japanese sea-cucumber product entries. | Richmond, BC supplier lists Japanese-named per-pound products; one states 30–35 pieces/lb and “Product of Japan.” Does not provide a scientific name, French name, preparation state, or stock guarantee. |

