# WP06 Europe — Fourme d’Ambert PDO identity review (R446)

- **Reviewed:** 2026-10-17.
- **Status:** Root-reviewed and integrated on 2026-10-17; see the [R446 integration README](../batches/wp06-europe-fourme-dambert-identity-integration-r446-20261017/README.md). No forms, recipe links, or runtime behavior were changed.
- **Scope:** One Auvergne regional cheese identity, the protected Fourme d’Ambert PDO.
- **Source-ID prefix:** WP06-EUROPE-FOURME-DAMBERT-R446-20261017. The proposed reference ID, target path, prefix, and source URLs were checked against the live workspace before authoring.

## Recommendation

Add one identity-only **CHEESE** reference for **Fourme d’Ambert / Fourme d’Ambert**, with empty alias arrays. The European Commission’s published product document identifies “Fourme d’Ambert” as a French PDO in the cheese class and defines the named product as blue-veined cheese made from renneted cow’s milk within its defined area. INAO’s current product page continues to identify the AOP and links current regulatory material. [S01–S03]

Current Québec-facing Mayrand pages list item 25148 in French as “Fourme d’Ambert meule 2,2 kg” and in English as “Fourme d’Ambert Blue Cheese Wheel 2.2 kg.” The paired pages describe the same Président product and state that it has the AOP designation. They support the local French and English search spelling for a protected product, but they are one retailer’s bilingual listing rather than two independent market observations. [S05–S06]

If accepted, integrate only the proposed reference row below. Keep the broad blue-cheese category and other named blue cheeses separate. The complete bundled corpus has no matching demand. Add no forms, measurements, density, unit mappings, package yield, recipe link, conversion, or substitution.

### Proposed catalog row

| Field | Value |
|---|---|
| id | ingredient-ref-fourme-dambert-pdo |
| nameFr | Fourme d’Ambert |
| nameEn | Fourme d’Ambert |
| aliasesFr / aliasesEn | empty / empty |
| defaultDensity | null |
| unitMappings | empty |
| category | CHEESE |

The registered product name is identical in French and English. The exact query “Fourme d’Ambert” matches both displays, so no qualifier or unqualified alias is needed. Do not add the generic descriptions “blue cheese” or “fromage bleu” as aliases. The PDO mark is product-status evidence, not part of the proposed display.

## Product and naming boundaries

- **Protected product:** the Commission’s consolidated single document lists Fourme d’Ambert as a PDO cheese and gives its product and geographic specification. INAO’s current product page identifies it as an Auvergne cheese within the AOP. These sources support a named regional product identity, not a generic blue-cheese subtype or a recipe equivalence. [S01–S03]
- **Fourme de Montbrison:** retain as a separate name and product boundary. INAO states that Fourme de Montbrison became a distinct appellation in 2002 after the earlier shared recognition with Fourme d’Ambert. Do not use “fourme” or the other appellation as a global alias. [S04]
- **Generic blue cheese:** keep active ingredient-ref-blue-cheese, “blue cheese / bleu,” as the broad category. The OQLF entries classify pâte persillée / blue cheese as a broad family and list Fourme d’Ambert among examples; they do not make the family name a synonym for this PDO or give an OQLF-preferred exact bilingual term for it. [S07; reused WP04-Q-CHEESE-20261010-S16]
- **Other named cheeses:** keep Roquefort, Gorgonzola, Bleu d’Auvergne, Stilton, and other regional blue cheeses separate. A shared blue-veined appearance, milk species, or use on a cheese board does not establish identity or substitution. The prior R417 Roquefort review likewise treats named blue cheeses as separate identities.
- **Québec wording:** the Mayrand French and English pages use the same protected name, with the English title adding “Blue Cheese Wheel.” Use the product name itself in both displays and leave descriptive category phrases out of aliases. No direct OQLF entry for Fourme d’Ambert was found; this is not presented as an OQLF terminology ruling.

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,739 | No proposed ID or Fourme d’Ambert name or alias. The nearest family-level row is ingredient-ref-blue-cheese, with only “blue cheese / bleu” as its identity. |
| Ingredient forms | 141 | No Fourme d’Ambert form, label, match term, or proposed-ID owner. |
| Legacy import candidates | 56 | No Fourme d’Ambert candidate or proposed-ID owner. |
| Research ledger | 2,098 records; 9,533 source entries | No Fourme d’Ambert identity record, phrase, proposed ID, or R446 source-prefix collision. The related blue-cheese record remains broad and distinct. |
| Other numeric and rule data | 8 unit conversions; 0 global substitutions; 0 contextual substitutions; 1 package yield | No candidate-related conversion, substitution, or yield; the single yield belongs to another ingredient. |
| Proposal and integration archive | Current catalog archive | Exact searches found no dedicated Fourme d’Ambert review, allocation, or integration. |
| Proposed allocation | Checked before authoring | ingredient-ref-fourme-dambert-pdo, the R446 source prefix, this target path, and S01–S07 URLs are unallocated. |

The audit checked active bilingual names and aliases, all form labels and match terms, legacy candidate text, ledger records and source URLs, and the proposal and batch archives. The WP06 Europe checklist remains open for Western, Southern, Northern, Central, and Eastern Europe; R442’s Ossau-Iraty PDO and the R443–R445 integration record were reviewed as neighboring completed work. Those identities do not allocate or overlap Fourme d’Ambert. The broader Europe checklist remains open in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9220).

## Phrase-first picker projection

The current picker normalizes accents and punctuation, prefers complete word-phrase matches, and falls back to substring matching in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The projection adds only the two proposed display names and no aliases or forms.

| Query | Current result | With proposed row |
|---|---|---|
| Fourme d’Ambert; Fourme; Ambert | No result | ingredient-ref-fourme-dambert-pdo only |
| Fourme d’Ambert AOP; Fourme d’Ambert PDO | No result | No result; no qualifier alias is proposed |
| AOP | 8 protected-name results | Unchanged |
| PDO | 6 protected-name results | Unchanged |
| blue cheese; blue; bleu; fromage bleu | Existing results | Unchanged; the new identity has no generic blue-cheese aliases |
| cheese; fromage | Existing results | Unchanged; the proposed names contain neither generic term |

The specific Fourme d’Ambert query gains one result. Searches for the broad cheese family remain attached to their current catalog owners.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8. The scan checked each complete decoded recipe document and each ingredient row, including line text, ingredient name, reference ID, and form ID, for Fourme d’Ambert / Fourme d'Ambert, its AOP/PDO-qualified spellings, Fourme, Ambert, Fourme de Montbrison, and the proposed reference ID. It found **zero matching recipe files, zero matching ingredient rows, and zero linked recipe IDs**.

The manifest-order corpus contains **753,988 bytes** and has fingerprint 94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b. The fingerprint hashes each manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a newline, then hashes the concatenated bytes.

## Forms, measurements, and substitutions

- **Forms:** add none. The specification and retailer describe a cylindrical wheel and permit cutting under a texture-preservation condition, but these are product and sale presentations, not a recipe-linked ingredient-form taxonomy. Do not add whole, wheel, cut, or grated forms.
- **Measurements:** the specification’s 1.9–2.5 kg wheel range and dimensions, the INAO page’s example wheel, and Mayrand’s approximately 2.2 kg product listing are product-standard or SKU-specific facts. They are not kitchen amounts, portions, package-yield rules, density values, or unit mappings. If a ledger record is later created, use measurementState: researched_no_supported_value, leave observations empty, retain null density and empty unit mappings, and add no conversion or yield. [S01–S03, S05–S06]
- **Recipe links:** the complete bundle has no matching line; add no linked recipe or recipe-specific measurement.
- **Substitutions:** no substitution research was performed for this identity. If integrated, keep substitutionResearchState: not_yet_researched and add no global or contextual rule. Do not infer that generic blue cheese, Roquefort, Bleu d’Auvergne, or Fourme de Montbrison can replace this product from a shared category or appearance.

## Evidence limitations

- EUR-Lex supplies the Commission’s published product document. INAO’s current page lists a temporary 2026 specification change and cautions that published legal texts carry legal authority. The INAO-hosted specification PDF is used as a product-description source, not as proof that every provision remains unchanged after that temporary update; no feed or process rule is copied into the catalog. [S01–S03]
- The Mayrand language pages are paired views of one Québec SKU, not independent market surveys. Their inventory, brand, wheel description, and package amounts can change and are not generalized beyond that listing. [S05–S06]
- OQLF supplies broad blue-cheese and pâte persillée context, not a direct entry that establishes a preferred Fourme d’Ambert display. The proposed French display follows the official product name and current Québec French retail wording.
- The bundle has no recipe demand, reusable quantity evidence, or replacement evidence for this cheese.

## Source register

Proposal-local sources S01–S07 and their URLs were checked against the live research ledger before authoring; no exact URL collision was found. Pages were accessed on 2026-10-17.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| WP06-EUROPE-FOURME-DAMBERT-R446-20261017-S01 | European Commission, [Implementing Regulation (EU) No 1207/2013](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32013R1207), Annex II, sections 1–5. | Published EU single document names Fourme d’Ambert as a French PDO in the cheese class and describes the protected product and area. Product dimensions and wheel weights are PDO specifications, not recipe measurements. |
| WP06-EUROPE-FOURME-DAMBERT-R446-20261017-S02 | INAO, [Fourme d’Ambert product specification PDF](https://extranet.inao.gouv.fr/fichier/CDCFourmeDAmbert.pdf), product description and geographic-area sections. | Official specification document supports the AOP product boundary, cow’s-milk cheese identity, protected production area, and cylindrical product description. INAO’s current page lists a temporary 2026 modification separately; this PDF is not treated as proof that every provision is unchanged. Its standard measurements and process details are not catalog behavior. |
| WP06-EUROPE-FOURME-DAMBERT-R446-20261017-S03 | INAO, [Fourme d’Ambert product page](https://www.inao.gouv.fr/en/node/4626), product and regulatory sections. | Current French authority page identifies the AOP, Auvergne origin, and links specification material, including a temporary 2026 change. INAO notes that only published legal texts have legal authority. |
| WP06-EUROPE-FOURME-DAMBERT-R446-20261017-S04 | INAO, [Fourme de Montbrison product page](https://www.inao.gouv.fr/en/node/33938), product history. | Says Fourme de Montbrison became a distinct appellation in 2002. Used only to preserve the neighboring named-product boundary. |
| WP06-EUROPE-FOURME-DAMBERT-R446-20261017-S05 | Mayrand, [Fourme d’Ambert meule 2,2 kg](https://mayrand.ca/fr/nos-produits/produits-laitiers/fromage/fromage-bleu/fromage-bleu-fourme-dambert-meule-president-25148), Président item 25148, French page. | Current Québec French title and product description identify the item as an AOP cheese. The approximate 2.2 kg listing, dimensions, price, and stock status are SKU-specific and may change. |
| WP06-EUROPE-FOURME-DAMBERT-R446-20261017-S06 | Mayrand, [Fourme d’Ambert Blue Cheese Wheel 2.2 kg](https://mayrand.ca/en/our-products/cheese-and-dairy/cheese/blue-cheese/fromage-bleu-fourme-dambert-meule-president-25148), Président item 25148, English page. | English title and product description for the same item as S05; supports the local English search wording but is not an independent retailer or package observation. |
| WP06-EUROPE-FOURME-DAMBERT-R446-20261017-S07 | OQLF, [GDT — pâte persillée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17699971/pate-persillee). | Lists Fourme d’Ambert among examples of pâte persillée. This supports broad category context, not a direct Québec preferred term or an alias. |
| Reused source WP04-Q-CHEESE-20261010-S16 | OQLF, [GDT — bleu / blue cheese](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2073052/bleu), already attached to the active blue-cheese ledger record. | Reused only for the existing broad blue-cheese category boundary. No duplicate ledger source entry is proposed. |

## Disposition

Proceed, if accepted, with one identity-only **CHEESE** reference for **Fourme d’Ambert** in both languages, with empty aliases. Preserve the broad blue-cheese row and Fourme de Montbrison as separate identities. Add no forms, measurements, conversions, yields, recipe links, or substitutions. Leave Europe-wide regional coverage open.

No app tests, builds, or emulator checks were run because the catalog change only adds database JSON data under `AGENTS.md`.
