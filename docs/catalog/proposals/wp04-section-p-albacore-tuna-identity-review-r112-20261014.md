# WP04 Section P — Albacore tuna identity review (R112)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** Proposal-only species identity, bilingual naming, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** Add one identity-only **albacore tuna / germon** reference for *Thunnus alalunga*, with **long-fin tuna** and **thon germon blanc** as qualified aliases. Add **thon albacore** as a French search alias on the existing yellowfin row at the same time. The paired projection makes the bare query **albacore** return both *T. alalunga* and *T. albacares*, while the qualified phrases identify the right row.
- **Recipe boundary:** Keep recipe 111’s “1 tuna steak” linked to generic tuna. It gives no species.

**Status:** Integrated by root on 2026-10-14 as an identity-only reference, ledger evidence, and paired French alias on yellowfin tuna. See the [R112 batch README](../batches/wp04-section-p-albacore-tuna-identity-integration-20261014/README.md). The ownership snapshot below predates integration.

## Scope and current ownership

The active [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4737) records the accepted yellowfin identity and the Atlantic, Pacific, and Southern bluefin identities. This review adds the distinct *T. alalunga* identity without changing recipe 111’s generic scope. It revisits one search consequence from the [yellowfin R102 review](wp04-section-p-yellowfin-tuna-identity-review-r102-20261014.md): that review correctly excluded “albacore” terms while yellowfin was the only active species row that could match them. With an albacore-tuna row present, a qualified French yellowfin alias can make the ambiguous one-word query return both species.

The current [reference file](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) has five tuna references:

- **ingredient-ref-tuna** — **tuna / thon**;
- **ingredient-ref-yellowfin-tuna** — **yellowfin tuna / thon à nageoires jaunes**;
- **ingredient-ref-atlantic-bluefin-tuna** — **Atlantic bluefin tuna / thon rouge de l’Atlantique**;
- **ingredient-ref-pacific-bluefin-tuna** — **Pacific bluefin tuna / thon rouge du Pacifique**;
- **ingredient-ref-southern-bluefin-tuna** — **Southern bluefin tuna / thon rouge du Sud**.

The current [form file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) has no tuna- or germon-named form. The [legacy-import identity list](../legacy-import-identities.v1.json) has no albacore, germon, long-fin-tuna, or *T. alalunga* owner. The [research ledger](../research-ledger.v1.json) contains the generic **candidate-wp04-tuna-species-scope** for the unqualified recipe line and an accepted yellowfin identity record, but no dedicated *T. alalunga* identity record. The existing yellowfin record cites the same CFIA name collision described below. No active tuna form, measure, substitution rule, or package-yield rule was found. The proposed R112 source-ID prefix is not allocated in the ledger.

## Canadian and Québec naming evidence

The current CFIA Fish List query, modified 2023-09-18, assigns TSN 172419 to *Thunnus alalunga* and TSN 172423 to *T. albacares*. Its paired name rows make the bare-word issue clear:

- For *T. alalunga*, CFIA lists **Albacore Tuna / Thon**, **Albacore / Germon**, and **Tuna / Thon Germon Blanc**.
- For *T. albacares*, CFIA also lists **Tuna / Albacore**, alongside **Yellowfin**, **Yellowfin Tuna**, and **Thon**.

So **yes: bare “albacore” is ambiguous in a Canadian naming source**. CFIA uses it as the English name for *T. alalunga* and as the French name paired with **Tuna** for *T. albacares*. These are separate common-name rows for separate taxa, not evidence that the species are interchangeable.

The current Gouvernement du Québec fish table gives the qualified pairs directly: *T. alalunga* is **Albacore tuna / Thon germon blanc**; *T. albacares* is **Yellowfin tuna / Thon albacore**. The table is on a food-safety page; this review uses its species-name crosswalk only and does not transfer its safety categorization into recipe or catalog behavior.

OQLF’s GDT entry for **germon** identifies *T. alalunga*, gives **germon** as the preferred Québec French term, and lists **long-fin tuna** as an English term. It says fresh or frozen *T. alalunga* is called germon in French; **thon blanc** may be used for canned product made from it. The separate GDT entry for French **albacore** maps that word to *T. albacares*. TERMIUM’s Canadian record for *T. alalunga* independently states that “albacore” is also used in French for *T. albacares*. Fisheries and Oceans Canada’s North Pacific profile names *T. alalunga* as **North Pacific Albacore Tuna**. Together, these sources support the qualified displays and the deliberate shared handling of a bare albacore query [S01–S06].

## Recommended display and aliases

Use the qualified English display **albacore tuna** and OQLF’s preferred French display **germon**. Keep these source-supported aliases:

- English: **long-fin tuna**.
- French: **thon germon blanc**.

Add **thon albacore** to the existing yellowfin row’s French aliases in the same integration. The term is directly paired with *T. albacares* by Québec’s table. The app’s search index matches complete word phrases inside display names and aliases, so this qualified alias also makes a one-word **albacore** query return yellowfin alongside the new **albacore tuna** display. This preserves the distinction between the two species while keeping the shared term discoverable.

Do not add **albacore** as a standalone alias, or use **thon albacore** on the new *T. alalunga* row. Do not add **thon blanc** as a general alias: OQLF limits it to canned-product wording for this species. Keep **tuna / thon** broad; do not add generic tuna aliases, a binomial alias, or any product-state or cut wording.

## Picker projection

The projection applies the current IngredientReferenceSearchIndex behavior in the [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) implementation to the active rows plus the proposed albacore reference and paired yellowfin alias. Queries match complete normalized word phrases across display names and aliases; one-word queries can match a word within a longer phrase.

| Query | Current result | With the proposed pair | Boundary |
|---|---|---|---|
| **albacore** | None | Yellowfin tuna / thon à nageoires jaunes; albacore tuna / germon | Shared term stays visibly ambiguous; it does not select one species alone. |
| **albacore tuna** | None | Albacore tuna / germon | Qualified English phrase selects *T. alalunga*. |
| **thon albacore** | None | Yellowfin tuna / thon à nageoires jaunes | Qualified French phrase selects *T. albacares*. |
| **germon**; **thon germon blanc** | None | Albacore tuna / germon | Québec French terms select *T. alalunga*. |
| **long-fin tuna** | None | Albacore tuna / germon | OQLF English term selects *T. alalunga*. |
| **tuna**; **thon** | Generic tuna, yellowfin, and three bluefin identities | Those five plus albacore tuna | Broad searches remain multi-result; the generic tuna option stays available. |
| **thon blanc** | None | None | Do not generalize canned-product wording to an unspecified product state. |
| **Thunnus alalunga** | None | None | Keep the binomial as source-level taxonomy, not a picker alias. |

The new row alone is not an acceptable integration: because **albacore** appears in its English display, a one-word search would then return *T. alalunga* alone. Add the yellowfin alias at the same time to preserve the cross-species name evidence. This is a static projection of the current index logic, not a UI test.

## Bundled recipe demand

The manifest-listed corpus scan covered **114 recipe files, 1,123 ingredient rows, and 753,928 recipe-file bytes**. It found no full-file or ingredient-row hits for **albacore**, **albacore tuna**, **germon**, **long-fin tuna**, **thon germon blanc**, **thon albacore**, or *Thunnus alalunga*.

The only tuna ingredient row is recipe 111, row 1: **“1 tuna steak”**, linked to **ingredient-ref-tuna** with quantity **1** and unit **count**. It names no species. Keep that link and count unchanged; no recipe supports an albacore link.

## Numeric and substitution limits

No reviewed naming source establishes a transferable kitchen quantity, volume measure, density, unit mapping, count-to-mass value, edible yield, or cooking yield for this identity. Add no active numeric data, form, package rule, conversion, recipe link, or substitution.

The generic tuna ledger record retains the Anova source observation of one tuna steak at source-reported ranges of 10–12 oz and 280–320 g, with species and edible-versus-as-purchased basis unstated. Do not attach those ranges to *T. alalunga* or use them to weigh recipe 111’s one-count line. The naming evidence gives no method-, role-, or dish-scoped basis for substituting albacore for generic tuna, yellowfin, or another fish; add no substitution rule.

## Proposed data shape

This is the proposed new reference only; it has not been added to the active JSON:

~~~json
{
  "id": "ingredient-ref-albacore-tuna",
  "nameEn": "albacore tuna",
  "nameFr": "germon",
  "aliasesEn": ["long-fin tuna"],
  "aliasesFr": ["thon germon blanc"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "PROTEIN"
}
~~~

The paired search term for the already-active yellowfin row is a separate proposed alias update:

~~~json
{
  "id": "ingredient-ref-yellowfin-tuna",
  "nameEn": "yellowfin tuna",
  "nameFr": "thon à nageoires jaunes",
  "aliasesEn": [],
  "aliasesFr": ["thon albacore"]
}
~~~

No forms, recipe links, measurements, conversions, yields, or substitution records accompany this proposal. Section P remains open.

## Sources

Sources were checked on 2026-10-14. Source IDs are proposal-local; no ledger records were added.

| Source ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-ALBACORE-TUNA-R112-20261014-S01** | CFIA, [Fish List tuna query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna), modified 2023-09-18. | TSN 172419 / *T. alalunga* has **Albacore Tuna**, **Albacore**, **Germon**, and **Thon Germon Blanc** rows; TSN 172423 / *T. albacares* has a **Tuna / Albacore** row. Canadian common-name evidence; not recipe-species evidence. |
| **WP04-SECTIONP-ALBACORE-TUNA-R112-20261014-S02** | Gouvernement du Québec, [Risques associés à la consommation de poisson et exigences](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/etablissements-alimentaires/precautions-aliments-dangereux/poisson), updated 2026-06-08. | Pairs *T. alalunga* with **Albacore tuna / Thon germon blanc** and *T. albacares* with **Yellowfin tuna / Thon albacore**. Used for names only; not a recipe or safety-behavior rule. |
| **WP04-SECTIONP-ALBACORE-TUNA-R112-20261014-S03** | OQLF GDT, [germon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198922/germon), last updated 2011. | Preferred French **germon** for *T. alalunga*, English **long-fin tuna**, and a note limiting **thon blanc** to canned-product wording. |
| **WP04-SECTIONP-ALBACORE-TUNA-R112-20261014-S04** | OQLF GDT, [albacore](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3499948/albacore), AFNOR record from 1968. | French **albacore** is linked to *T. albacares*. Historical terminology record used as corroboration, not as the sole current naming authority. |
| **WP04-SECTIONP-ALBACORE-TUNA-R112-20261014-S05** | Translation Bureau, [TERMIUM Plus: *Thunnus alalunga*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=THUNNUS+ALALUNGA), record 2 dated 2023-01-04. | Gives English **albacore**, French **germon** and **thon germon blanc**, and explicitly notes that **albacore** is also used in French for *T. albacares*. Canadian terminology evidence. |
| **WP04-SECTIONP-ALBACORE-TUNA-R112-20261014-S06** | Fisheries and Oceans Canada, [North Pacific Albacore Tuna](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/north-pac-albacore-tuna-germon-thon-blanc-eng.html), modified 2016-12-19. | Names *T. alalunga* as North Pacific Albacore Tuna. Canadian species-name corroboration; not a kitchen product specification. |

## Static review record

- Re-read the current Section P plan, the accepted yellowfin and bluefin records, the generic tuna boundary proposals, active reference/form JSON, legacy-import identity list, research ledger, and recipe manifest.
- Confirmed the live snapshot contains 1,453 references, 105 forms, 63 legacy-import candidates, and 1,793 ledger records. No dedicated *T. alalunga* owner or R112 source-ID prefix is present.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows. No albacore-species demand was found; recipe 111 remains generic.
- Projected the proposed query results using the local search implementation. Verified the local Markdown targets and UTF-8 encoding after saving.
- No tests or emulator checks were run; this packet is proposal-only.

