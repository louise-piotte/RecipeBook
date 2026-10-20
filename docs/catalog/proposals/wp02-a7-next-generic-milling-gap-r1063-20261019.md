# WP02 Section A7 R1063: sorghum fine-shorts boundary review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This review changes only this Markdown file; it does not edit shared catalog JSON, the research ledger, plan, roadmap, recipes, generated files, or code.
- **Open-plan anchor:** WP02 Section A7 remains open for “other grain meals (including the unresolved wheat-meal candidate) and milling products” ([catalog plan, line 2290](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected gap:** The boundary of a human-food study's **sorghum fine short** against other sorghum milling streams and feed-oriented mill-feed.
- **Recommendation:** **Bounded hold.** Do not add an active reference or new ledger candidate yet. Primary sources establish that sorghum mills can produce streams called *shorts* and that one cake study used a material called *fine short*. They do not establish that the study material is a transferable generic culinary ingredient, define a stable stream distinct from mill-feed or meal, or provide a Québec French culinary display.
- **Scope:** Generic culinary ingredient diversity only. No brand, product-line, flavour-family, SKU, or retailer-variant research was performed. Commercial-product counts do not add ingredient diversity.

## Identity and boundary

The candidate is a possible fine sorghum milling fraction from grain sorghum, *Sorghum bicolor*. It is not whole sorghum grain, sorghum bran, sorghum flour, sorghum grits, sorghum semolina, sorghum starch, separated sorghum germ, or the unresolved broader `candidate-sorghum-meal`.

The candidate name is not settled. Hassan et al. use the phrase **fine short** in a cake study and report that replacing wheat flour with fine shorts at levels up to 20% may produce an acceptable cake. A separate sorghum milling study reports two laboratory streams, **shorts I** and **shorts II**. It defines its millfeed as bran plus shorts II and describes the shorts II fraction as coarse middlings and germ. These records do not establish that the 1996 cake-study sample is the same material as the 1988 shorts II stream or that all sorghum milling shorts are suitable for human food [S01–S02].

FAO's general processing chapter distinguishes the edible sorghum portion from offal, which it describes as not normally used for human consumption. This does not prove that every product called shorts is feed, but it makes the unresolved food-grade boundary material. Do not map `sorghum shorts`, `sorghum mill-feed`, or `sorghum meal` to one another on the available evidence [S03].

Keep the candidate separate from:

- **ingredient-ref-grain-sorghum**, the existing whole grain identity and its dry/cooked whole-grain forms. A milling stream is not a whole-grain preparation form.
- **ingredient-ref-sorghum-bran**, the existing bran identity added at R867. Its sources and accepted claims remain with that bran fraction; do not transfer or broaden them to shorts.
- **ingredient-ref-sorghum-flour**, **ingredient-ref-sorghum-grits**, **ingredient-ref-sorghum-semolina**, and **ingredient-ref-sorghum-starch**. Their distinct names and source ownership remain unchanged.
- **candidate-sorghum-meal**, the unresolved R1040 candidate. Meal refers to a separate, unresolved human-food product boundary. Do not use the cake-study percentage to resolve meal or add it to that candidate.
- **Separated sorghum germ** from the R951 hold. The 1988 paper's shorts II includes germ in its sample stream; that does not make shorts an isolated germ identity.
- Feed-oriented mixed mill-feed, feed-grade shorts, and other milling residues. Their feed use does not establish a culinary ingredient.

## Naming and proposed catalog state

No active display pair is recommended yet. The journal abstract verifies *fine short* as the study's phrase, not as a standard consumer-facing sorghum ingredient name. OQLF's GDT entry supports the Québec French crop term **sorgho** and maps it to English **sorghum** and *Sorghum bicolor*, but it does not define a milled fraction [S04]. The archived Canada Grain Commission glossary translates **shorts (flour mill streams)** as **remoulages (farine de passage)** while defining that entry specifically for wheat and animal feed. Do not transfer `remoulages` to sorghum or add it as a French alias [S05].

If later primary evidence establishes a generic human-food class and a Québec French term, a separately reviewed identity could be considered. Until then, keep these candidate attributes unassigned:

| Field | Hold disposition |
|---|---|
| Active ID / display names | None. Do not create `ingredient-ref-sorghum-shorts` or choose an active English or French display. |
| Working search phrase | `sorghum fine short(s)` is a research phrase only, derived from the cited studies; it is not a proposed alias or active name. |
| Tentative category if identity is later verified | `GRAIN_AND_CEREAL`, subject to confirming a human-food cereal fraction rather than feed-only mill-feed. |
| English/French aliases | None. In particular, do not add `sorghum mill-feed`, `sorghum middlings`, `remoulages`, `farine de passage`, or bare `shorts` / `remoulages`. |
| `defaultDensity` / `unitMappings` | `null` / `[]` if an identity is later accepted. |
| Forms, recipe links, conversions, yields, and active substitutions | None. Do not add a form under whole grain sorghum. |
| Candidate research states, if a later ledger review tracks this hold | `identityState: needs_clarification`; `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence`. No candidate record is proposed in this proposal-only review. |

## Live ownership and archive audit

Read-only audit of the live repository on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | **2,068** references. No exact owner was found for `sorghum shorts`, `sorghum short`, `fine sorghum shorts`, `fine short`, the proposed ID, or checked French phrases. Nearby active owners are grain sorghum, sorghum bran, flour, grits, semolina, starch, and puffed sorghum. | No active identity is proposed. Preserve all neighboring rows, aliases, and evidence. |
| Ingredient forms | **205** forms. The only sorghum forms are whole sorghum, dry and whole sorghum, cooked; none names shorts or a milling fraction. | Add no form and do not attach a milling fraction to either whole-grain form. |
| Research ledger | **2,473** records. No record ID or source entry owns the proposed shorts phrase or the two primary-study DOI/URLs. `candidate-sorghum-meal` remains `needs_clarification`, with measurement `researched_no_supported_value` and substitution `researched_no_supported_substitute`; its commercial meal sources and decision remain unchanged. The FAO processing-chapter URL is already owned by `ingredient-ref-sorghum-grits` as WP03-SORGHUM-GRITS-20261013-S03. The OQLF `sorgho` source is already present on sorghum crop/processing records. | Add no ledger record or source ownership transfer. The FAO and OQLF entries may support only their existing narrow claims; do not append broader claims to those records under this hold. |
| Legacy import identities | **55** candidates. No sorghum-shorts wording, proposed ID, or French candidate was found. | No legacy promotion, alias transfer, or merge. |
| Bundled recipes | **114** manifest-listed recipe files and **1,123** ingredient rows. A serialized-text and ingredient-row scan found no sorghum wording, candidate phrase, or proposed ID. | No bundled recipe demand, measure, or link supports a row or recipe-specific value. |
| Forms, rules, mappings, and yields | No shorts-specific form, measurement, density, unit mapping, recipe link, conversion, cooking yield, or active substitution was found. | Add none. Keep any data attached to neighboring sorghum identities unchanged. |
| Proposal history | No prior focused sorghum-shorts review or R1063 source-ID prefix was found. Recent adjacent reviews are R867 sorghum bran, R951 separated sorghum germ, and R1040 sorghum meal. R1034 discussed rye shorts only as a rye-milling boundary; it does not establish a sorghum identity. | This review considers a distinct sorghum milling-stream question. Preserve the prior decisions and evidence. |

The source URLs and exact phrase checks were also compared with current ledger ownership. S01 and S02 are new proposal-local sources. Reuse FAO processing source WP03-SORGHUM-GRITS-20261013-S03 and the existing OQLF sorgho source only for their cited, limited context; do not modify or transfer them.

## Measurements, forms, and substitution

No reviewed source reports a generic household measure, volume-to-mass conversion, bulk density, or transferable milling yield for sorghum shorts. The 1988 paper's milling yields and composition apply to its three varieties and specified tempering, dehulling, and laboratory-mill protocols. They are not kitchen measures, package yields, or expected outputs of other mills [S02]. If a later identity review proceeds, keep measurement research at **`researched_no_supported_value`**, density null, and unit mappings empty.

The 1996 paper's “up to 20%” cake observation is confined to its tested fine-short sample, wheat-flour cake formulation, and quality assessment. It is not a household measure, general flour replacement ratio, or evidence for other dishes, other sorghum streams, or candidate-sorghum-meal. Because this is one study-specific cake finding without a defined transferable ingredient boundary, keep substitution research at **`blocked_pending_evidence`** if a candidate is later tracked; add no global or contextual rule, recipe-line substitution link, conversion, or form [S01].

The available source yields do not establish a repeatable household preparation state. Do not add forms, dry-to-cooked conversions, or preparation yields.

## Proposal-local source register and limitations

The following source IDs are local to this proposal. No shared ledger record or source entry was added.

| Source | Source and exact locator | Supports and limits |
|---|---|---|
| **S01 / `WP02-A7-SORGHUM-SHORTS-R1063-20261019-S01`** | Hassan, Enayat M., Wafaa A. Hussein, Amal H. Mahmoud, and Manal H. Abd-Elkader, [“Addition of Sorghum Fractions to Confectionery Foods”](https://journals.ekb.eg/article_429102_0.html), *Egyptian Journal of Agricultural Research* 74(3) (1996), article 16, pp. 793–808, DOI [10.21608/ejar.1996.429102](https://doi.org/10.21608/ejar.1996.429102), abstract. | Primary human-food cake study. Its abstract names sorghum `fine short` among fractions tested in cake and reports that wheat-flour substitution with fine shorts up to 20% may produce an acceptable product. The journal landing page's indexed abstract and metadata were available; the page itself was not directly fetchable during this review, so full methods, sample provenance, milling stream, and French terminology were not independently verified. Keep the percentage and result attached only to this study. |
| **S02 / `WP02-A7-SORGHUM-SHORTS-R1063-20261019-S02`** | A. M. M. Youssef et al., [“Milling High-tannin and Low-tannin Varieties of Sorghum”](https://journals.sagepub.com/doi/pdf/10.1177/156482658801000103), *Food and Nutrition Bulletin* 10(1) (1988), DOI [10.1177/156482658801000103](https://doi.org/10.1177/156482658801000103), PDF pp. 1–3: methods and Tables 2–3. | Primary milling study. Methods list flour I, flour II, shorts I, shorts II, and bran from a Bühler laboratory mill. The results call bran plus shorts II “millfeed” and describe the study's shorts as coarse middlings and germ. Three varieties and specific tempering/dehulling/milling methods give process- and sample-specific fractions; the article does not establish a standard food-grade sorghum-shorts definition or a household measure. |
| **Reused source WP03-SORGHUM-GRITS-20261013-S03** | FAO, [*Sorghum and millets in human nutrition*, processing chapter](https://www.fao.org/4/T0818e/T0818E09.HTM), “Traditional processing methods,” “Processing untreated grains,” and “Industrial processing.” Current ledger owner: `ingredient-ref-sorghum-grits`. | The chapter distinguishes the human-edible portion from bran/offal and says industrial offal is not normally used for human consumption. This supports caution around the food/feed boundary; it does not define sorghum shorts or prove that every shorts stream is feed. The ledger source remains with the grits row and is not reassigned or broadened here. |
| **Reused source WP03-MILO-GRAIN-20261012-S01** | Office québécois de la langue française, [“sorgho” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho), entry “sorgho,” preferred terms and English/Latin equivalents. Current owner includes `ingredient-ref-grain-sorghum`. | Supports the crop name and species *Sorghum bicolor*. It does not attest any French name for shorts, milling residue, meal, or another sorghum fraction. Keep the source on its current owner. |
| **S05 / `WP02-A7-SORGHUM-SHORTS-R1063-20261019-S05`** | Canada Grain Commission, [archived alphabetical grain-terminology glossary](https://epe.lac-bac.gc.ca/100/201/301/qualite_ble_ont/html/2014/glossary-lexique/ggtabc-abcltg-2-eng.asp%40Term%3DS?nodisclaimer=1), entry **“shorts (flour mill streams)”**. | The entry defines shorts as small bran/fibrous pieces remaining after flour extraction from wheat, used for animal feed, and gives French `remoulages (farine de passage)`. It is explicitly wheat-scoped and archived. It is evidence against transferring that French term or feed definition wholesale to sorghum, not a source for sorghum identity. |

## Cross-category queue scope

The named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead remains **out of scope** because commercial-product counts do not add ingredient diversity. Stop that product-only line, preserve the historical R605 review and all existing branded rows and product-specific evidence, and leave the generic wheat-meal candidate open. No Anson Mills or other commercial-product roster was researched for this proposal.

## Reopen condition and disposition

Reopen only if primary or authoritative evidence identifies a reproducible human-food sorghum shorts stream, distinguishes it from sorghum meal, bran, isolated germ, and feed-oriented mill-feed, and supports a Québec French culinary display. Do not satisfy this condition with a named product roster, an animal-feed source, or a single sample's cake percentage.

Until that evidence exists, keep the active catalog and ledger unchanged. The 1996 cake result remains a source-specific food-use observation; it does not become a generic substitution rule or a transferable measurement. No software tests or builds were run because this task changes only a proposal document.
