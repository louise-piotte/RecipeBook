# WP04 Section P R697 — dried Atlantic capelin form review

- **Review and source-access date:** 2026-10-18.
- **Open checklist:** Section P still has preserved-fish forms open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8067).
- **Candidate:** Dried capelin sold by a Gaspésie fishmonger, under the verified `ingredient-ref-atlantic-capelin` identity for *Mallotus villosus*.
- **Recommendation:** Integrate one `dried` form under the existing Atlantic capelin identity. Record the product and Québec term evidence on a form-level ledger record; add no recipe links, measures, observations, or substitutions.
- **Status:** Integrated on 2026-10-18 as one dry form under the existing Atlantic-capelin identity. No measure, recipe link, or substitution was added. See the [R695–R697 integration README](../batches/wp02-wp03-wp04-r695-r697-gap-review-integration-20261018/README.md). Source ownership and counts below describe the pre-integration snapshot.
- **Proposed form ID:** `ingredient-form-atlantic-capelin-dried` (free in the inspected snapshot).

## Selection and scope

The 2026-10-12 Atlantic-capelin identity decision explicitly added no forms because it then lacked a focused, current Québec product listing. Raymer Aquaculture now lists **Capelan** from the Gaspésie and identifies **Fumé** and **Séché** as separate product formats; the listing says the fish is available year-round on request. This review selects only the dried format. It does not reopen the capelin identity, the separate smoked format, capelin roe/masago, or the generic preservation checklist.

The earlier masago integration keeps `ingredient-ref-masago` separate from whole capelin. The older Canadian shishamo review is also separate: its specific retailer SKU identifies *Mallotus villosus* sold as shishamo, but does not resolve the dried product on Raymer’s Québec listing. No earlier focused dried-capelin form review, active form, or legacy mapping was found.

## Evidence and proposed data

OQLF’s existing parent source `WP04-P-ATLANTIC-CAPELIN-20261012-S01` normalizes Québec edible-fish **capelan**, gives English **capelin**, and identifies *Mallotus villosus*. DFO’s existing parent source `WP04-P-ATLANTIC-CAPELIN-20261012-S03` supports the species-qualified Québec display **capelan de l’Atlantique**. Raymer uses the Québec term **Capelan**, lists the **Séché** format, gives Gaspésie provenance, and indicates year-round, on-request availability. Together these support the form label below without adding the vendor’s short name to the parent aliases.

```json
{
  "id": "ingredient-form-atlantic-capelin-dried",
  "ingredientRefId": "ingredient-ref-atlantic-capelin",
  "formCode": "dried",
  "labelFr": "capelan de l’Atlantique séché",
  "labelEn": "dried Atlantic capelin",
  "prepState": "dry",
  "matchTermsFr": ["capelan séché"],
  "matchTermsEn": ["dried capelin"],
  "densityGPerMl": null,
  "notesFr": "Raymer classe le capelan parmi les formats séchés. La source ne précise ni si le poisson est entier, ni s’il est salé, paré ou réhydraté; aucune mesure ni équivalence n’est établie.",
  "notesEn": "Raymer lists capelin among dried products. The source does not state whether the fish is whole, salted, trimmed, or rehydrated; no measure or equivalence is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

Integration created form-level ledger record `ingredient-form-atlantic-capelin-dried` with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. It reuses the parent OQLF and DFO source IDs above and allocates `WP04-SECTIONP-DRIED-CAPELIN-R697-20261018-S01` to Raymer’s URL. No measurement observations or substitution findings were added. The parent’s `defaultDensity: null`, `unitMappings: []`, and existing research states remain unchanged.

## Ownership and picker projection

The current snapshot has 1,838 ingredient references, 172 forms, 56 legacy candidates, and 2,219 research-ledger records (10,402 source entries, 8,780 distinct source IDs, 7,429 distinct URLs). The existing Atlantic-capelin parent is the sole active whole-fish identity with that name; it has no attached forms. `ingredient-ref-masago` owns the separate capelin-roe phrases. No active reference, form, legacy candidate, or ledger record owns the proposed form ID or the phrases `dried capelin` / `capelan séché`.

The Raymer URL has no exact ledger owner. The reused OQLF and DFO URLs and source IDs are already owned by the Atlantic-capelin parent; do not duplicate them. R697’s new source ID is not currently allocated. Exact R697 searches across the proposal archive, batches, ledger, and roadmap found no allocation.

The read-only projection mirrors the phrase-first and substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It assumes the form and match terms above; it does not change aliases on the parent.

| Query | Current picker | With proposed form | Effect |
|---|---|---|---|
| `capelin`; `capelan` | Atlantic capelin and masago | Same two | Broad fish/roe search remains multi-result. |
| `caplin`; `Atlantic capelin`; `capelan de l’Atlantique` | Atlantic capelin | Same result | Existing English alias and species-qualified identity remain unchanged. |
| `dried capelin`; `capelan séché` | No result | Atlantic capelin, with a form hint | Adds the locally documented preparation under a species-qualified displayed identity. |
| `dried Atlantic capelin`; `capelan de l’Atlantique séché` | No result | Atlantic capelin, with a form hint | Exact bilingual form queries become selectable. |
| `dried`; `séché` | Many results | One additional Atlantic-capelin result; still many | General dried-product searches remain multi-result. |
| `capelin roe`; `œufs de capelan` | Masago only | Same | Roe remains separate from the whole-fish identity and its dried form. |

The English and French form labels retain the Atlantic qualifier. The short match terms reflect the Québec seller’s base name plus its listed dried format; the displayed reference still reads **Atlantic capelin / capelan de l’Atlantique**. Do not add `dried` or `séché` as aliases on the parent.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe files**, all **1,123 structured ingredient rows**, and parsed recipe strings for capelin/capelan/caplin, *Mallotus villosus*, dried-capelin wording, the proposed French and English labels, and related roe terms. The snapshot contains **754,048 recipe-file bytes**; the manifest-ordered corpus fingerprint is `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362`. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe link, quantity, preparation instruction, or substitution context is supported. [R01]

## Measurement and substitution limits

Raymer gives no package size, serving, count, mass, volume, or moisture level for the dried capelin. Do not infer a fish count, density, unit mapping, rehydration ratio, edible yield, or dried-to-fresh conversion. Its separate smoked format does not establish a measure or equivalence for the dried form.

No reviewed source or bundled recipe supports replacing dried Atlantic capelin with smoked capelin, masago, dried anchovy, dried bonito, or another fish at a specified ratio, role, or method. Add no global or contextual rule, warning, or recipe-line substitution. The form-level ledger states record the researched result without creating observations or findings.

## Bounded recommendation

**Integrate only the dried form** under `ingredient-ref-atlantic-capelin`, with the exact fields above and a form-level evidence record. The current Québec fishmonger directly lists the `capelan` product in dried format and identifies Gaspésie provenance and on-request availability; OQLF and DFO already establish the Québec name and Atlantic species display. The form remains limited to a dried presentation: it does not assert whole fish, salting, smoking, cooking, species-neutral capelin, or a recipe amount. Keep the Atlantic identity, masago, and the separately listed smoked format distinct. Section P remains open.

## Source register and ownership

The source table records the proposal-time ownership review. Integration allocated R697 source S01 to Raymer and reused the parent-owned OQLF and DFO sources.

| Source ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-DRIED-CAPELIN-R697-20261018-S01** | Raymer Aquaculture, [Poissons et fruits de mer](https://raymeraquaculture.ca/poissons-et-fruits-de-mer/). | The current indexed catalog listing identifies `Capelan`, formats `Fumé, Séché`, Gaspésie provenance, and year-round availability on request. The page reader exposed only the site shell during this check; the indexed listing for this exact URL supplied the product details. It gives no binomial, SKU, ingredient list, drying/salting method, fish preparation, or measurement. At proposal time the URL was unowned; integration allocated this source ID to the new form-level ledger record. |
| **Reused `WP04-P-ATLANTIC-CAPELIN-20261012-S01`** | OQLF, [capelan (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198782/capelan). | Existing parent owner pairs Québec edible-fish `capelan` with English `capelin` and *Mallotus villosus*. Terminology and taxon evidence, not product-state or measurement evidence. |
| **Reused `WP04-P-ATLANTIC-CAPELIN-20261012-S03`** | Fisheries and Oceans Canada, [Capelan de l’Atlantique (*Mallotus villosus*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/capelin-capelan-fra.html). | Existing parent owner supports the qualified French display and distinguishes Atlantic capelin from other *Mallotus* taxa in Canadian waters. Species and terminology evidence, not seller inventory or cooking behavior. |
| **WP04-SECTIONP-DRIED-CAPELIN-R697-20261018-R01** | Read-only audit of the open Section P plan, prior capelin/roe/form proposals, live references/forms, legacy candidates, ledger ID/URL ownership, `IngredientSearch.kt`, and all manifest-listed recipes. | Confirms the snapshot counts, candidate ownership, source allocation, picker projection, and recipe result above; not a ledger source. |

## Integration result

Added `ingredient-form-atlantic-capelin-dried` with the reviewed bilingual labels, dry preparation state, exact match terms, null density, and an `updatedAt` timestamp. Its form-level ledger record reuses the Atlantic parent’s OQLF and DFO entries and adds Raymer’s listing. No measurements, observations, recipe links, or substitutions were added. Static package and ledger checks passed. No software tests, build, emulator run, or deployment were run because this update only adds database JSON data under `AGENTS.md`.
