# WP03 Section F — Raishan grain identity and naming hold

Review date: 2026-10-14

Status: integrated documentation-only hold. The root recorded this disposition in the Section F checklist and roadmap. No catalog, ledger, recipe, application, or generated file was changed; no app or emulator tests were run.

## Candidate and recommendation

Candidate: **raishan**, a food grain associated with *Digitaria compacta* in the Khasi Hills of Meghalaya, India.

**Recommendation: hold it outside the active catalog and research ledger.** Primary Indian agricultural sources support a narrow food-grain tradition, and Kew currently accepts *D. compacta* as a taxon. However, the current Indian millet manual uses “raishan” inconsistently in its discussion of *Digitaria* species, the older crop literature uses *D. cruciata* names, and no current Canadian or Québec consumer product label or Québec French food name was located. These gaps prevent a stable bilingual picker identity. The bundle also has no recipe demand.

This is a new Raishan review, not a second Sikiya decision. The Sikiya proposal names Raishan only as a neighboring term and does not allocate a Raishan reference, form, candidate, or ledger record. This review does not reopen Sikiya / crab finger (*D. sanguinalis*), held brown-top millet, barnyard millet, or little millet.

## Identity and process boundary

If a future source-supported identity is approved, keep it to food grain specifically identified as Raishan and taxonomically bounded to *D. compacta* (including a synonym only when an authoritative taxonomic source establishes that relationship). Do not infer that every edible *Digitaria* species, every grass sold as a millet, or every historical *D. cruciata* reference is the same product.

The current evidence does not establish a packaged product specification or a complete household preparation state. Keep these outside any prospective row:

- Sikiya / crab finger, *D. sanguinalis*, and common names that can refer to weedy or wild *Digitaria*;
- wild *D. cruciata* populations, forage, fodder, planting seed, and grass or straw;
- Raishan flour, even where a source describes glutinous flour or porridge use;
- cooked rice cakes, porridges, or other prepared dishes;
- blends with rice or other cereals.

The field-yield, crop-calendar, grain-harvest, and traditional-food descriptions in the cited sources are agricultural or ethnobotanical context. They are not household measures, density data, cooking yields, or substitution ratios.

## Canadian and Québec naming

The English source name is **Raishan**, used for a Khasi Hills grain in Indian agricultural references. No current Canadian English package title or Québec retailer/manufacturer listing was found in the searches below. Agriculture and Agri-Food Canada's record is taxonomic; it does not establish Canadian food-market availability.

No fr-CA food name is supported. The OQLF entry for *fonio blanc* identifies *D. exilis* and gives terms for that species; it does not cover *D. compacta*. The OQLF entry for *digitaire* is a botanical genus description and calls it a weed, not an edible grain. Do not use *millet indien*, *fonio indien*, *digitaire*, or an invented literal translation as an active display or alias: none is established as a Québec food name for Raishan, and the fonio wording could broaden the existing white- and black-fonio picker results.

| Candidate wording | Disposition |
|---|---|
| `raishan` | Source-supported regional food name; retain as research wording only until a Canadian product boundary and bilingual naming are established. |
| `raishan millet` | Do not create as a display or alias. The phrase adds generic “millet” without a Canadian product label or demonstrated picker value. |
| `fonio indien` | Do not use. Not established as a Québec food name; OQLF's listed fonio entry is specifically *D. exilis*. |
| `millet indien`, `millet digitaire`, `Digitaria compacta`, `Digitaria cruciata`, and `Digitaria cruciata var. esculenta` | Keep as research/taxonomic terms only; no user-facing alias is proposed. |
| `raisham` and other spellings | Do not add without a source that establishes the spelling for this food grain. |

## Catalog ownership and picker projection

The read-only package audit found 1,443 ingredient references, 105 forms, 63 legacy candidates, and 1,783 research-ledger records. No exact normalized owner or ledger record was found for `raishan`, `raishan millet`, `raishan grain`, `raisham`, *D. compacta*, *D. cruciata*, *D. cruciata* var. *esculenta*, *fonio indien*, or *millet indien*. Before this proposal, the only repository mention of Raishan was the neighboring-name discussion in the Sikiya proposal; no prior focused Raishan proposal or batch decision exists.

`IngredientSearch.kt` checks full normalized phrases before falling back to substring matching, and includes attached form terms. A static projection against the current references and forms gives:

| Query | Current projected results | Review implication |
|---|---:|---|
| `raishan`, `raishan millet`, `raisham` | 0 | No current choice for this candidate. |
| `Digitaria compacta`, `Digitaria cruciata var esculenta`, `fonio indien` | 0 | Scientific and proposed French wording is not already active. |
| `fonio` | 4 | Returns the existing white/black fonio grain/flour identities. A future `fonio indien` row would join this broad result set, so do not use it without Québec food-name evidence. |
| `millet` | 20 | Already returns a broad set of millet grains, flours, and products. Do not append an unqualified `millet` alias to Raishan. |

If later evidence supports a distinct record, the narrowest English search term presently attested is `raishan`. Do not allocate `ingredient-ref-raishan` from this hold. A Québec French display and the decision whether the English display should be `raishan` or a qualified product label remain unresolved. No aliases or picker changes are proposed.

## Recipe demand, forms, measures, and substitutions

The full manifest-listed corpus was scanned on 2026-10-14: **114 recipe files and 1,123 structured ingredient rows**. Searches included `raishan`, `raishan millet`, `raishan grain`, `raisham`, *Digitaria compacta*, *Digitaria cruciata*, *Digitaria cruciata* var. *esculenta*, `fonio indien`, `millet indien`, and `millet digitaire`. Results: **0 recipe-file hits and 0 ingredient-row hits**. No recipe link, ingredient-line edit, or recipe-specific form is justified.

No catalog data is proposed. If a future bilingual identity is established, begin identity-only: no dry/cooked forms, density, unit mappings, active measures, package-to-volume mappings, cooking yield, conversions, recipe links, or substitutions. The cited descriptions of harvesting, pounding, cooking with rice, and traditional cakes do not supply transferable quantities or tested replacements.

## Source-backed hold rationale and limits

The evidence supports Raishan as a real, geographically bounded food-grain tradition, but does not support a bilingual consumer-facing catalog row today. The strongest naming problem is the current ICAR–IIMR manual itself: its species overview identifies Raishan as *D. compacta*, while an earlier passage associates Raishan in the Khasi Hills with the *D. sanguinalis* discussion. The same manual describes the Raishan crop as endemic to the Khasi Hills. The earlier IIMR regional monograph instead uses *D. cruciata* var. *esculenta*. Kew's current taxonomic backbone accepts *D. compacta*, but that taxonomic record cannot determine which product a current Canadian label would mean.

On 2026-10-14, current web searches for `"Raishan" Canada grain`, `"Raishan millet" "Canada" product`, `"raishan" grain Quebec`, and `"Digitaria compacta" food grain Canada` returned Indian agricultural, taxonomic, or general-reference sources, not a Canadian or Québec product listing. This is a bounded search result, not proof that no product is sold. The lack of a Québec product label and the zero-hit recipe audit mean there is no present catalog need to resolve the terminology by constructing a French name.

## Sources

All pages and records were accessed or rechecked on 2026-10-14. Source IDs are proposal-local and have not been added to the ledger.

| Source ID | Source and locator | Evidence used and limits |
|---|---|---|
| `WP03-RAISHAN-20261014-S01` | ICAR–Indian Institute of Millets Research, [Good Agricultural Practices Manual for Sustainable Millets Production in India](https://www.millets.res.in/pub/2026/GAP-English.pdf), 2025 edition, ch. 11, “Fonio,” pp. 115–117. | Primary agricultural source. Its species overview identifies Raishan as *D. compacta* and describes the Khasi Hills crop; an earlier passage places the name alongside its *D. sanguinalis* discussion. The internal naming inconsistency is preserved as an uncertainty, not silently corrected. Agricultural yield and field descriptions are not recipe conversions. |
| `WP03-RAISHAN-20261014-S02` | ICAR–Indian Institute of Millets Research, [Millets in the Indian Himalaya](https://www.millets.res.in/pub/2019/Millets_Indian_Himalaya.pdf), 2019, Meghalaya section, printed p. 30 / PDF p. 39. | Primary regional agriculture source describes Raishan as a minor Khasi Hills cereal used for food and fodder, and uses the older name *D. cruciata* var. *esculenta*. It does not establish a Canadian product label, Québec French name, or household amount. |
| `WP03-RAISHAN-20261014-S03` | Royal Botanic Gardens, Kew, [*Digitaria compacta*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:398718-1/general-information), Plants of the World Online; taxonomic backbone cites the 2025 World Checklist of Vascular Plants. | Current taxonomic authority accepts *D. compacta* and gives its native range as India to Indo-China. It identifies a taxon, not a consumer food product or vernacular display. |
| `WP03-RAISHAN-20261014-S04` | Agriculture and Agri-Food Canada, [GRIN-Global Canada taxon record: *Digitaria compacta*](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=479739), taxon record verified 2017-12-07 and modified 2019-03-01. | Canadian government botanical record provides taxonomic context. It provides no evidence of Canadian retail availability or food-use terminology. |
| `WP03-RAISHAN-20261014-S05` | FAO, [AGROVOC: raishan](https://agrovoc.fao.org/browse/agrovoc/en/page/c_06630b85), concept created 2023-02-14; definition updated 2024-02-22. | FAO's controlled vocabulary defines Raishan as a minor millet (*D. compacta*) and notes its glutinous-flour use. Its broader-concept relationship to fonio is a vocabulary relationship, not a Canadian or Québec product name. Direct page access was blocked in this review; the indexed FAO record was inspected. |
| `WP03-RAISHAN-20261014-S06` | Office québécois de la langue française, [fonio blanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529747/fonio-blanc), Grand dictionnaire terminologique, updated 2014. | Québec terminology source defines the edible grain of *D. exilis* and lists its French terms. It does not name Raishan or *D. compacta*; do not extend these terms to Raishan. |
| `WP03-RAISHAN-20261014-S07` | Office québécois de la langue française, [digitaire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17067709/digitaire), Grand dictionnaire terminologique, 1977 entry. | Québec botanical entry defines the genus as an annual weed and gives `finger grass`. It is not a French food-grain name. |
| `WP03-RAISHAN-20261014-S08` | PROSEA, [Cereals record 3300: *Digitaria cruciata*](https://prosea.prota4u.org/view.aspx?id=3300), “Uses,” “Vernacular Names,” and “Observations.” | Regional cereal reference records Raishan for a *D. cruciata* entry, describes grain as food and flour uses, and separately notes similar use of *D. compacta*. This corroborates historical/common-name scope complexity; it does not establish Québec terminology or current Canadian supply. |

## Disposition

**Hold Raishan as an unallocated Section F food-grain candidate.** Do not add `candidate-raishan`, an ingredient reference, aliases, forms, recipe links, measures, or other catalog data from this proposal. Reopen only when a current Canadian or Québec source establishes a human-food product boundary and Québec French label, and the Raishan/*Digitaria* naming inconsistency can be resolved for that product.


## Root integration (2026-10-14)

Accepted the source-backed hold without allocating an active ingredient reference or research-ledger
candidate. The plan and roadmap now record the name/taxon and Québec-display gaps; the
[batch integration record](../batches/wp03-section-f-raishan-millet-hold-integration-20261014/README.md)
captures the disposition. No catalog JSON changed, so no tests were needed.
