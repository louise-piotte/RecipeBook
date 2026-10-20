# WP02 A7 — Malted Finger Millet Flour Boundary Review (R32)

- Reviewed: 2026-10-13
- Status: Proposal only. No shared catalog, research ledger, plan, roadmap, recipe, or package file was changed.
- Scope: The named candidate malted finger millet flour / malted ragi flour. This review does not reopen generic malt flour, ordinary finger millet flour, malted spelt flour, roasted oat malt flour, or R25's micronised toasted millet flour.
- Proposal-local source-ID prefix: WP02-A7-MALTED-FINGER-MILLET-FLOUR-20261013-R32-S01 through S05. These IDs belong only to this proposal.

## Recommendation

Keep malted finger millet flour as an unresolved, unallocated A7 candidate. Do not create an active ingredient reference, legacy identity, alias, form, measurement, recipe link, or substitution.

Research papers use malted finger millet flour as a real experimental milling product, and an Indian malt manufacturer advertises ragi and millet malt flours. The evidence does not yet establish one current consumer product specification, a stable Canadian or Québec product, or a Québec French name for the flour. The manufacturer’s own page is internally inconsistent: its descriptive paragraph lists Ragi Malt Flour and Millet Malt Flour, but the categorized product list omits both and lists only barley and wheat malt flours. The research evidence also covers species-specific flour and a composite finger/barnyard millet flour, so the generic phrase malted millet flour cannot safely name a single species or one flour class.

This is a distinct issue from R25. R25 concerned a manufacturer-named micronised toasted millet flour made from species-unspecified, heat-treated millet and held because its industrial process and French name were unresolved. Malting by germination is a different process and the current candidate is species-qualified as finger millet.

## Ownership and picker audit

Read-only snapshot: 1,364 active references, 100 forms, 64 legacy candidates, 1,691 ledger records, and 114 manifest-listed recipes. The current package assigns:

- ingredient-ref-finger-millet-flour to finger millet flour / farine de ragi, with English aliases ragi flour, nachni flour, ragi atta, kurakkan flour, mandua flour, and mandua ka atta.
- ingredient-ref-millet-flour to millet flour / farine de millet.
- ingredient-ref-malt-flour to malt flour / farine maltée, with malted cereal flour as its English alias.
- Separate cereal-specific rows to malted barley, wheat, rye, and spelt flours, and to roasted oat malt flour and roasted wheat malt flour.

No active reference, form, legacy candidate, or ledger record owns the exact normalized terms malted finger millet flour, malted millet flour, finger millet malt flour, ragi malt flour, ragi malt, farine de ragi maltée, or farine de millet maltée. No new candidate ID is allocated by this proposal.

The picker uses normalized phrase matching before substring fallback. Current static projections are:

| Query | Current result |
| --- | --- |
| malted finger millet flour; malted millet flour; ragi malt flour | No result |
| finger millet flour; farine de ragi | ingredient-ref-finger-millet-flour |
| millet flour | Six results: generic millet, finger, foxtail, kodo, pearl, and proso millet flours |
| farine de millet | Five results: generic millet, foxtail, kodo, pearl, and proso millet flours |
| malt flour | Four results: generic malt, roasted oat malt, roasted wheat malt, and malted spelt flour |

No picker change is proposed. If a source-supported English identity named malted finger millet flour were later accepted, the query finger millet flour would return both plain and malted products, and millet flour would gain another result. A French display must not be guessed from farine de ragi or farine de millet: either would broaden a current exact phrase query. Do not add malted millet flour to generic millet flour or malt flour as an alias.

## Recipe demand audit

The manifest-listed package currently has 114 recipe files and 1,123 ingredient rows. I searched complete recipe JSON plus ingredient-row originalText, ingredientName, preparation, and notes for malted finger millet flour, malted millet flour, finger millet malt flour, ragi malt flour, ragi malt, French malted-ragi/millet phrases, and nearby plain finger-millet/millet-flour terms. The scan found zero matching recipe files and zero matching ingredient rows. No recipe link or edit is supported by the bundled corpus.

## Measurement, density, and substitution limits

No reviewed source supplies an exact-form household mass/volume measure, density, or reusable unit mapping for a plain malted finger millet flour product. Do not transfer any measurement from plain millet flour, ordinary finger millet flour, malted grains, malt flour, or malted beverage powders.

The research papers provide experimental preparation or blend details for particular study batches. Those details do not establish a standardized commercial grind or a kitchen conversion. The 2026 noodle study uses a composite of malted finger and barnyard millet flours in a particular product formulation; that is not a general flour-for-flour replacement rule. No direct recipe test supports substitution for wheat flour or ordinary millet flour. Add no density, unit mapping, form conversion, yield, cooking ratio, or substitution rule.

## Source register and limits

| Source ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| WP02-A7-MALTED-FINGER-MILLET-FLOUR-20261013-R32-S01 | Mahalaxmi Malt Products Private Limited, [company product page](https://www.mahalaxmimaltextract.com/), descriptive product list and “Our Products” sections. Accessed 2026-10-13. | The company describes itself as a malt manufacturer and names Ragi Malt Flour and Millet Malt Flour in its prose product list. | The categorized product list names malt grains and lists barley malt flour, wheat malt flour, and grain barley flour, but omits the ragi/millet malt flours. The page gives no formulation, ingredient species for the generic millet product, package, retail status, Québec/Canadian availability, or French name. Treat it as a product lead, not a settled product specification. |
| WP02-A7-MALTED-FINGER-MILLET-FLOUR-20261013-R32-S02 | Owheruo et al., [Extruded breakfast meal from malted finger millet and watermelon seed flour](https://link.springer.com/article/10.1186/s42269-021-00533-x), Bulletin of the National Research Centre, Methods, “Malted finger millet flour.” | Primary research explicitly prepares and names malted finger millet flour from malted finger millet grains, then uses it in a study formulation. | A laboratory batch for one research product; it does not establish a commercial grade, Québec label, household measure, or general equivalence to plain finger millet flour. |
| WP02-A7-MALTED-FINGER-MILLET-FLOUR-20261013-R32-S03 | Bangar et al., [Formulation of Noodles from Malted Millet Composite Flour](https://arccjournals.com/journal/asian-journal-of-dairy-and-food-research/DR-2374), Asian Journal of Dairy and Food Research, online 2026-02-05, Methods, “Processing technology for malting of millets” and “The malted millet composite flour.” | Primary research distinguishes finger and barnyard millet, malts and mills them, and makes a composite flour from equal parts of the two. | A controlled noodle-formulation study, not a single-species retail product definition. Its experimental proportions and performance are not reusable measures or substitution ratios. |
| WP02-A7-MALTED-FINGER-MILLET-FLOUR-20261013-R32-S04 | Office québécois de la langue française, [millet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), botanical-poaceae entry, updated 2010. | Gives millet / mil as Québec French terms and states that millet can be a generic grouping of multiple species, though it is sometimes used as shorthand for a particular species. | Does not name malted finger millet flour or provide a French product term for the candidate. |
| WP02-A7-MALTED-FINGER-MILLET-FLOUR-20261013-R32-S05 | Québec Répertoire des aliments québécois, [Cuisine Soleil organic millet flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223769), product record last updated 2026-04-09. | A current Québec product record names plain Farine de Millet Biologique and declares farine de millet biologique as its ingredient. | This is an unqualified, plain millet-flour product, not malted or finger-millet-specific. Its product portion of 1/4 cup (52 g) is product-specific and is not transferred to the malted candidate. |

## Next action

Keep the candidate unresolved and inactive. Reopen for an active identity only after a current Canadian or Québec-facing source establishes the exact species, a standalone food-flour product boundary, and a defensible Québec French display. If a source only supports a generic millet malt or a beverage/food mix, keep that wording off the finger-millet-flour and generic malt-flour rows.
