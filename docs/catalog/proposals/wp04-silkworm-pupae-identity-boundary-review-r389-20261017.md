# WP04 proposal — silkworm-pupae identity boundary

**Review date:** 2026-10-17

**Scope:** human-food pupae of the mulberry silkworm, *Bombyx mori*, and the boundary between whole pupae, powders/flours, extracts/concentrates, supplements, and feed. This is a proposal-only review; no catalog, ledger, plan, roadmap, recipe, test, or code file is changed.

## Disposition

**Hold an active *Bombyx mori* ingredient reference until a Canadian human-food product source confirms that species.** The evidence supports a distinct research candidate: a Canadian grocery storefront currently lists fresh-frozen silkworm pupae, and a food manufacturer elsewhere lists human-food silkworm-pupae products naming *B. mori*. The Canadian listing does not give a Latin name or package specification, while the species-qualified food manufacturer does not establish Canadian availability or Canadian product status. These sources do not yet connect the Canadian product to the exact species requested.

This is a narrow catalog-evidence hold. It does not conclude that silkworm pupae are novel, prohibited, unsafe, or unavailable as human food in Canada. CFIA describes silkworms as a traditional food and says edible insects sold to Canadian consumers must meet food requirements. Health Canada’s current public non-novel determinations list has no *B. mori* / silkworm-pupae entry; Health Canada says the list includes most determinations and defines each entry narrowly. That absence is not a status determination.

The next useful evidence is a current Canadian human-food package or supplier specification that identifies *B. mori*, states whether the product is whole/frozen, dried, or otherwise processed, and can be assessed against applicable Canadian food rules. Until then, do not let a generic “silkworm pupae” listing resolve to a species-specific identity.

## Repository ownership and recipe demand

Read-only audit of the current package and supporting files on 2026-10-17:

- `ingredient-references.v1.json` contains **1,700** references. There is no exact reference or alias for `silkworm`, `silkworm pupae`, `Bombyx mori`, `pupa/pupae`, `chrysalide(s)`, or `ver à soie`.
- `ingredient-forms.v1.json` contains **141** forms and has no exact silkworm/pupa/chrysalide/`Bombyx` form or form owner.
- `legacy-import-identities.v1.json` contains **56** candidates; none matches those names or taxonomic terms.
- `research-ledger.v1.json` contains **2,056** records; none has an exact silkworm/*Bombyx* owner. No prior proposal or batch file has a silkworm/*Bombyx* review.
- The closest active insect identities are `ingredient-ref-house-cricket-powder` (`house cricket powder` / `poudre de grillon domestique`), `ingredient-ref-banded-cricket-powder` (`banded cricket powder` / `poudre de grillon à bandes`), and `ingredient-ref-mopane-caterpillars` (`mopane caterpillars` / `chenilles mopane`, with English alias `mopane worms`). They have distinct species and product-state scopes; none owns silkworm pupae.
- The bundled manifest lists **114 recipes** containing **1,123 ingredient rows**. A text scan of all 114 recipe JSON documents and the ingredient rows found no match for silkworm, *Bombyx*, pupae/pupa, chrysalide, `ver à soie`, or beondegi. There is no recipe demand to link, measure, or substitute.

The prior house-cricket, banded-cricket, and mealworm boundary reviews were checked for ownership and handling precedent: [house cricket](wp04-house-cricket-powder-product-boundary-review-20261012.md), [banded cricket](wp04-banded-cricket-identity-boundary-review-20261011.md), and [mealworm](wp04-mealworm-food-identity-boundary-review-20261011.md). Those species and product forms remain separate.

## Source-backed scope and limits

| Area | Source-backed fact | Limit / interpretation |
|---|---|---|
| Canadian food-market signal | Panda Foods’ `.ca` storefront lists **“Fresh Frozen Silkworm Pupae”** under its frozen category at a price with an Add to Cart control. | This supports a current Canadian-market whole/frozen product listing. The listing text does not name *Bombyx mori* or provide an ingredient/process specification beyond “fresh frozen,” and does not establish novelty status. It cannot alone support a species-specific row. |
| Species-specific human-food product | JR Unique Foods, a manufacturer of edible insects, lists **“Silkworm Pupae (Bombyx Mori)”** in its edible-insects category and separately lists **“Silkworm Pupae Powder (Bombyx Mori)”** in its protein-powders category. | This is a supplier’s human-food product naming and species statement, not a Canadian or Québec package, regulatory determination, or full process specification. The powder page links to a Thailand marketplace. It shows that whole-pupae and powder products are distinct market forms; it does not establish their equivalence or Canadian status. |
| Canadian food requirements | CFIA says whole, dried, powdered, flour, and insect-containing foods are sold to Canadian consumers; edible insects, including silkworms, have long been eaten in some regions. It says these products must meet the same requirements as other foods, with SFCR requirements for imports, exports, and interprovincial trade. | General policy and food-use context only. It is not a *B. mori*-specific authorization, species/form novelty determination, label approval, or compliance finding for either retail listing. |
| Novelty evidence | Health Canada’s current list includes a 2025 non-novel determination for whole or minimally processed *Gonimbrasia belina* (mopane caterpillar), and separate insect entries for other named insects; I found no *B. mori* / silkworm-pupae entry. The list says it contains most determinations, automatically includes determinations requested after 2020-09-30, and each status applies only as described. | Do not transfer a caterpillar determination to a moth pupa, a different species, or another process. The list’s lack of a *B. mori* match does not establish novelty or prohibition. The list also says extraction is not minimal processing, unlike freezing, drying, and grinding/milling, which it describes as minimal processes for this purpose. |
| Québec French terminology | OQLF’s GDT gives preferred term **ver à soie**, English **silkworm**, and defines it as the caterpillar of the mulberry silkworm; its note identifies *Bombyx mori*. OQLF separately defines **chrysalide** as the Lepidoptera metamorphic stage between caterpillar and butterfly. Health Canada’s pesticide-formulant list pairs “silkworm pupae” with “chrysalide de ver à soie.” | These support the lexical pieces for a possible Québec display, not an OQLF-preferred food name or CFIA-approved ingredient label. The PMRA formulant entry is not food evidence. The Canadian food listing itself has no French product name. |
| Feed / pet products | Chubby Mealworms Canada lists dried silkworm pupae as a crunchy treat for wild birds, hedgehogs, turtles, koi, fish, and reptiles, and suggests grinding the product into dust to add to **their** food. | This is explicitly animal-feed/treat marketing, with no human-food claim and no *B. mori* species statement. It cannot fill the Canadian human-food product-spec gap or support a human-food powder identity. |
| Natural health products | Health Canada’s Licensed Natural Health Products Database includes a licensed capsule formula listing *Bombyx mori* as a medicinal ingredient. | The cited record does not identify the insect part or say pupae. It is evidence of a licensed NHP product category only; it cannot establish a food identity, food status, or pupa-derived ingredient. |

## Product and search boundaries

If a qualifying Canadian human-food specification later supports activation, review a **species-bounded whole-pupae identity**, tentatively `PROTEIN`, rather than merging it into cricket powder or mopane caterpillars. Possible displays are `silkworm pupae` / `chrysalides de ver à soie`; the French compound is an editorial combination of OQLF terminology and is not a prescribed food common name. Keep *Bombyx mori* in the identity evidence, not as an unqualified ingredient alias.

Maintain these boundaries during follow-up:

- **Whole fresh/frozen or dried pupae:** the Canadian grocery listing supplies a frozen product lead, but its species and detailed processing are unknown. A feed-market dried product is not evidence of the human-food form.
- **Powder/flour:** the manufacturer’s *B. mori* powder listing is separate from its whole-pupae listing and is outside Canada. Do not alias it to whole pupae, and do not treat `powder` and `flour` as interchangeable without a product specification. Do not add a form row or a separate powder/flour identity from this evidence alone.
- **Extracts and concentrates:** no product-level Canadian human-food specification was found. Health Canada explicitly excludes extraction from minimal processing in the non-novel list’s terminology; do not extend a whole, frozen, dried, or ground product scope to extracts, isolates, peptides, oils, or concentrates.
- **Supplements:** keep licensed NHPs, capsule blends, and products marketed as dietary supplements outside food-ingredient identity and evidence. A shared Latin ingredient string does not establish a shared product state or intended use.
- **Feed and pet products:** keep feeder insects, livestock/pet feeds, and animal treats separate even when the species or word “pupae” overlaps. Grinding an animal-feed product for animal food does not turn it into a human-food ingredient.
- **Other species and vernacular names:** do not absorb other silkworm species, generic silkworms, other insect pupae, or caterpillars under *B. mori*. Do not merge the existing mopane or cricket identities.

Picker guidance if the candidate is later activated:

| Query | Expected treatment |
|---|---|
| `silkworm pupae` / `chrysalides de ver à soie` | Use only after the Canadian product’s species is confirmed; retain the species boundary in research evidence. |
| `worm` | Ambiguous with the existing `mopane worms` alias and a future `silkworm` display through partial matching. Do not add it as an alias. |
| `ver` | Broad and collision-prone across French ingredient names; do not add as an alias. |
| `pupa`, `pupae`, `chrysalide`, `chrysalides`, `insect`, `insect powder`, `protein powder` | Generic stage/category terms. Do not add as aliases or let them imply species, food grade, or product form. |
| `cricket` / `cricket powder` | Already returns both house-cricket and banded-cricket powder references; keep their species scopes distinct. |

No numeric or recipe behavior is justified: add no amount, density, unit mapping, measure, form, conversion, yield, recipe link, or substitution. The human-food listings provide no transferable recipe measure or whole-to-powder equivalence; the animal-feed seller’s product nutrition/use claims must not be copied into a human-food record.

## Sources reviewed

All sources were checked on 2026-10-17. Company and retailer pages are primary for their own listings only; government sources are limited to their stated scope.

| ID | Source | Evidence used and limit |
|---|---|---|
| `WP04-SILKWORM-20261017-S01` | Panda Foods, [Fresh Frozen Silkworm Pupae 新鲜冷冻蚕蛹](https://www.pandafoods.ca/products/fresh-frozen-silkworm-pupae) | Current `.ca` storefront listing, frozen category, price, and Add to Cart. No species, package specification, ingredient panel, or processing detail beyond “fresh frozen.” |
| `WP04-SILKWORM-20261017-S02` | JR Unique Foods, [Edible Insects For Sale](https://jrunique.com/product-category/edible-insects/) and [Protein Powders](https://jrunique.com/product-category/insect-protein-powders/) | Manufacturer places *Bombyx mori* whole pupae in its edible-insect range and pupae powder in its protein-powder range. Not Canadian availability; no powder process or Canadian regulatory determination. |
| `WP04-SILKWORM-20261017-S03` | CFIA, [Edible insects: what to know before biting into bugs](https://inspection.canada.ca/en/inspect-and-protect/food-safety/edible-insects) and [French version](https://inspection.canada.ca/fr/inspecter-proteger/salubrite-aliments/insectes-comestibles) | General Canadian human-food context for whole, dried, powdered, flour, and other edible-insect products; silkworms are named among traditional foods. The page says all must meet food requirements. It is not a species-specific determination. |
| `WP04-SILKWORM-20261017-S04` | Health Canada, [List of non-novel determinations](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html) and [French list](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html) | No exact *B. mori* / silkworm-pupae determination found. List scope and its limitations are stated above; no inference of novelty or ban. |
| `WP04-SILKWORM-20261017-S05` | OQLF, [GDT: ver à soie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880257/ver-a-soie) and [GDT: chrysalide](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423455/chrysalide) | Supports the French lexical components and life-stage distinction. It does not prescribe a French food name. |
| `WP04-SILKWORM-20261017-S06` | Health Canada PMRA, [List of formulants, 2022-10-01](https://health.canada.ca/apps/open-information/pmra-arla/PMRA%20List%20of%20Formulants-Liste%20des%20produits%20de%20formulation%20de%20l%E2%80%99ARLA%20%282022-10-01%29.pdf) | Pairs “SILKWORM PUPAE” with “CHRYSALIDE DE VER À SOIE” in a pesticide-formulant list; terminology only, not food evidence or label approval. |
| `WP04-SILKWORM-20261017-S07` | Chubby Mealworms Canada, [Dried silkworm pupae product](https://www.chubbymealworms.ca/products/1-82kg-6lb-chubby-silkworm-pupae) | Canadian seller explicitly markets its dried product as animal treats/food for birds, pets, fish, and reptiles. Feed-use boundary only; no human-food or species claim. |
| `WP04-SILKWORM-20261017-S08` | Health Canada, [Licensed Natural Health Products Database product record](https://health-products.canada.ca/lnhpd-bdpsnh/info?lang=eng&licence=80083641) | Licensed capsule blend lists *Bombyx mori* as a medicinal ingredient. Product record does not specify pupae; NHP evidence only. |

## Verification note

Proposal only. The sole file created for this task is this proposal. No canonical JSON, generated index, ledger, plan, roadmap, recipe, test, or code file was changed. No software tests, build, or emulator run was performed.
