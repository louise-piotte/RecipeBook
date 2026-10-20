# WP05 Section S — culinary fats, oils, and cooking sprays gap review

- **Review date:** 2026-10-12
- **Owner:** proposal-only WP05 Section S identity and Québec terminology review
- **Disposition:** recommend a bounded, identity-only next tranche; no canonical data changed
- **Plan state:** Section S remains open. The global catalog plan's checklist at lines 2950–2957 remains unchecked, and WP05 remains in progress in `roadmap.md`.
- **Scope:** olive-oil grade, common named cooking oils, sesame-oil style, animal fats, shortening and margarine, regional oils, infused oils, and cooking spray.

## Recommendation

For the next Section S integration, add or activate seven narrowly named identities: extra-virgin olive oil, canola oil, corn oil, soybean oil, sunflower oil, peanut oil, and generic sesame oil. This is an identity-only tranche. Reuse the existing legacy candidate ID for peanut oil; create no density, measure mapping, form, package yield, conversion, or substitution. Correct the current overbroad aliases on generic vegetable oil and toasted sesame oil as part of the same integration. Keep the existing generic olive-oil and vegetable-oil rows for unqualified recipe wording.

Only two bundled recipe lines explicitly say “extra-virgin olive oil.” They are independent recipe-demand matches and should each be relinked to the new grade identity; the other seven olive-oil lines are unqualified and should stay on `ingredient-ref-olive-oil`.

The word **canola** and the generic phrases **vegetable oil**, **neutral oil**, **oil**, and **huile** need strict ownership. CFIA says that a single-source oil sold as oil must use its source-specific common name; it also allows “vegetable oil” on some ingredient lists, including cases where the specific source is omitted. That makes a generic recipe phrase insufficient evidence to choose canola. Create an exact canola identity, remove `canola oil` and `huile de canola` from the generic vegetable-oil aliases, and do not relink either recipe line that mentions canola as an option or note. Remove the generic `neutral oil`, `oil`, and `huile` aliases as well. Do not create a `neutral oil` identity or give unqualified “oil” to any source-specific identity. [S01–S02]

## Repository and prior-work audit

I read the repository `AGENTS.md`, the current `docs/RecipeBook-global-ingredient-catalog-plan.txt` checklist, `roadmap.md`, the live split seed package, the legacy import candidates, prior catalog proposals and batches, and all 114 bundled recipe files. The live snapshot contains 1,103 ingredient references, 79 forms, 75 legacy candidates, and 114 recipes with 1,123 ingredient rows. These counts describe the working tree read on 2026-10-12; the shared package may change before integration, so rerun the exact-match audit at that point.

The still-open Section S checklist covers culinary olive-oil types; named common and regional seed/nut oils; refined/virgin coconut oil and palm products; toasted/untoasted sesame; animal fats; shortening, margarine, spreads, and state distinctions; infused oils; and cooking spray. I found no prior WP05 Section S proposal or integration batch. Related decisions already exist and should be reused:

- [WP03 sesame/tahini boundary review](wp03-sesame-tahini-boundary-review-20261009.md) flagged the toasted-sesame-oil alias: the active row owns generic `sesame oil`, while recipe 105 is unqualified and its import note says “dark.” It explicitly routed this to a separate oil review.
- [WP05 Section W condiment review](wp05-east-asian-condiments-section-w-review-20261011.md) and the [regional condiment integration batch](../batches/wp02-wp04-wp05-regional-flours-sauces-counts-integration-20261010/README.md) already cover plain chili oil and Chiu Chow-style chili-crisp oil as distinct products. Do not duplicate them or equate oil with crisp.
- The [WP06 South Asian sweep](wp06-south-asian-cuisine-gap-sweep-20261010.md) already accepted mustard oil as a distinct identity.
- The [WP06 crude-palm-oil batch](../batches/wp06-crude-palm-oil-identity-20261009/README.md) already distinguishes crude palm oil from palm-kernel oil, refined palm oil, and palm fractions.
- [WP04 butter-products review](wp04-butter-products-identity-review-20261010.md) covers the existing ghee identity and keeps generic clarified-butter wording separate.

### Current reference and legacy owners

| Current entry or phrase | Live owner and state | Review decision |
| --- | --- | --- |
| `olive oil` / `huile d'olive` | Active `ingredient-ref-olive-oil` | Keep as the generic identity for unqualified recipe lines. Do not add `extra-virgin olive oil` as an alias. |
| `vegetable oil` / `huile végétale` | Active `ingredient-ref-vegetable-oil`; aliases EN `canola oil`, `neutral oil`, `oil`; FR `huile`, `huile de canola` | Keep the display names as generic. Remove all five overbroad or incorrect aliases and give exact canola wording a separate identity. |
| `toasted sesame oil` / `huile de sésame` | Active `ingredient-ref-toasted-sesame-oil`; EN alias `sesame oil`; FR alias `huile de sésame grillée` | Make the French display explicitly toasted using Québec product wording (`huile de sésame grillé`) and remove generic EN `sesame oil`. Add a separate generic sesame-oil identity for the one unqualified recipe line. |
| `peanut oil` / `huile d'arachide` | Legacy candidate `ingredient-ref-peanut-oil` | Reuse this stable ID if activated. Do not mint a duplicate. |
| `avocado oil` / `huile d'avocat` | Legacy candidate `ingredient-ref-avocado-oil` | Keep held pending Québec food-market term review and recipe demand. |
| `vegetable shortening` / `shortening végétal` | Legacy candidate `ingredient-ref-shortening` | Keep held. The unqualified English/French shortening pair is not precise enough to finalize the product class. |
| Coconut oil, mustard oil, crude palm oil, ghee, niter kibbeh, margarine | Active refs | Preserve; do not duplicate. |
| Chili oil and Chiu Chow-style chili-crisp oil | Active condiment refs | Preserve their existing distinct product scope; these are already covered in WP05 Section W. |

The exact candidate phrases `corn oil`, `soybean oil`, `sunflower oil`, `safflower oil`, `rice bran oil`, `grapeseed oil`, `walnut oil`, `hazelnut oil`, `pumpkin-seed oil`, and `palm-kernel oil` do not have a separate active owner. The exact canola phrases are currently owned only by the generic vegetable-oil ref. The legacy candidates noted above are not active IDs.

## Proposed bounded identity tranche

All candidates below use category `FAT_AND_OIL`. Keep aliases narrow and source-supported; no numeric or behavioral data follows from identity or food-label standards.

| Candidate | Proposed name and alias decision | Scope and corpus disposition |
| --- | --- | --- |
| Extra-virgin olive oil | New `ingredient-ref-extra-virgin-olive-oil`; EN `extra-virgin olive oil`; fr-CA `huile d'olive vierge extra`; no aliases. | Distinct from unspecified olive oil, refined olive oil, and pomace oil. Relink only the two explicit lines listed below. CFIA limits the regulated “extra virgin” designation to olive oil and points to Codex/IOC definitions; this is an identity boundary, not a request to encode chemical thresholds. [S01, S03] |
| Canola oil | New `ingredient-ref-canola-oil`; EN `canola oil`; fr-CA `huile de canola`; no generic vegetable-oil aliases. | Keep separate from generic vegetable oil. Do not alias unqualified `rapeseed oil` or `colza oil`: Codex separately names ordinary rapeseed oil and low-erucic-acid rapeseed oil, with canola among the latter's accepted names. No recipe line unambiguously selects canola. [S02, S04] |
| Corn oil | New `ingredient-ref-corn-oil`; EN `corn oil`; fr-CA `huile de maïs`; optional FR alias `huile de germes de maïs`. | OQLF supplies both French forms and the English name. No exact recipe line; add for named-oil coverage only. [S05] |
| Soybean oil | New `ingredient-ref-soybean-oil`; EN `soybean oil`; fr-CA `huile de soya`; aliases only for OQLF-listed variants: EN `soya bean oil`, `soya-bean oil`, `soya oil`; FR `huile de soja`. | Keep this named source distinct from vegetable-oil blends and generic oil. No exact recipe line. [S06] |
| Sunflower oil | New `ingredient-ref-sunflower-oil`; EN `sunflower oil`; fr-CA `huile de tournesol`; EN aliases `sunflower seed oil`, `sunflowerseed oil`. | Keep high-/mid-oleic and other modified profiles out of the generic row; their qualifier describes a product-specific oil. No exact recipe line. [S07, S02] |
| Peanut oil | Activate legacy `ingredient-ref-peanut-oil`; EN `peanut oil`; fr-CA `huile d'arachide`; limited EN aliases `arachis oil`, `groundnut oil`. | Reuse the candidate's ID. Do not use the broader OQLF-listed English phrase `nut oil` as an alias because it can collide with other nut oils. No exact recipe line. [S08] |
| Generic sesame oil | New `ingredient-ref-sesame-oil`; EN `sesame oil`; fr-CA `huile de sésame`; no aliases. | This is the unqualified oil identity, not a claim that the oil is raw or untoasted. Relink only Habitant Pea Soup's unqualified ingredient line. Keep the toasted identity and its exact recipe line separate. OQLF supplies the unqualified French/English pair; a manufacturer describes roasted, unroasted, and black sesame oils as distinct products, but its Japanese product line is not a universal recipe taxonomy. [S09–S11] |

Do not create a separate `neutral oil`, `neutral vegetable oil blend`, or generic `oil` identity in this tranche. `Neutral` describes a culinary property/use without naming a source or mixture, and CFIA's labeling rules show that generic “vegetable oil” may stand in for more than one source context. A recipe should retain its original generic phrase unless the recipe itself gives a specific source.

## Recipe-demand scan and link dispositions

The scan searched all `ingredients[]` rows in the live 114-file bundled corpus, comparing original text, normalized ingredient name, and current reference. Counts below are recipe ingredient lines, not mentions in instructions.

| Current family | Bundled demand | Disposition |
| --- | ---: | --- |
| Olive oil | 9 lines: 2 explicit extra-virgin and 7 unqualified | Move the two explicit lines below to the proposed extra-virgin identity. Keep all seven unqualified lines on `ingredient-ref-olive-oil`. |
| Vegetable oil | 9 lines | Keep the generic ref on every line in this tranche. The Red Velvet Cake note says canola also works; the German Chocolate Cake line says “canola or vegetable oil.” Neither chooses one source. |
| Sesame oil | 2 lines: 1 explicitly toasted and 1 unqualified | Keep Korean Soy-Marinated Jammy Eggs on toasted sesame oil. Move only the unqualified Habitant Pea Soup line to generic sesame oil if the new identity is accepted. The export note “dark sesame oil” is preserved as a note and does not redefine generic sesame oil or prove a universal toasted alias. |
| Margarine | 6 lines | Keep on `ingredient-ref-margarine`; do not merge with shortening or baking spread. |
| Coconut oil | 1 unqualified line | Keep on `ingredient-ref-coconut-oil`; no refined/virgin split is requested by this line. |
| Oil spray | 1 unlinked line, `oil spray` | Leave unlinked. The line does not name the oil source or a product formulation. |
| Named neutral/seed/nut oils, animal fats, shortening, infused oils | 0 exact ingredient lines | No recipe links for these candidates in this tranche or the held list. |

### The two extra-virgin olive-oil lines

| Recipe and source | Ingredient-line ID | Exact source text and current link | Proposed disposition |
| --- | --- | --- | --- |
| [Sous Vide Tuna — Anova Culinary](https://recipes.anovaculinary.com/recipe/sous-vide-tuna) | `b699f193-4545-4e7a-98ad-ce092a1e38e4-ingredient-4` | `1 tbsp extra-virgin olive oil` → `ingredient-ref-olive-oil`; bilingual notes also say “extra-virgin” / “extra-vierge.” | Link to `ingredient-ref-extra-virgin-olive-oil`. Preserve text, quantity, and notes. |
| [Tzatziki — Cookie and Kate](https://cookieandkate.com/how-to-make-tzatziki/) | `9dc0c02c-ac20-411c-9adf-38095e980487-ingredient-3` | `2 tbsp extra-virgin olive oil` → `ingredient-ref-olive-oil`; bilingual notes also say “extra-virgin” / “extra-vierge.” | Link separately to `ingredient-ref-extra-virgin-olive-oil`. Preserve text, quantity, and notes. |

Do not use either line to change the seven unqualified olive-oil lines. Do not create an olive-pomace, refined, “light,” or generic virgin-oil alias from these two recipes.

### Canola and generic vegetable-oil boundary

- Red Velvet Cake with Cream Cheese Frosting (`0bc95db3-300b-4594-88ca-ade36c66cde1-ingredient-7`) is exactly `240 ml vegetable oil`; its note says “Canola oil also works” / `l'huile de canola convient aussi`. Keep its ingredient ref generic. The note is a recipe-specific option, not the ingredient's identity.
- German Chocolate Cake (`e2d11309-7775-4efb-981c-2c78a8d03da6-ingredient-8`) is `1/2 cup (120 ml) canola or vegetable oil`; the bilingual note repeats the alternative. Keep the current generic link in this proposal because one row names alternatives and does not select canola.
- The other seven vegetable-oil lines say only `vegetable oil`; keep them generic. Do not add `canola oil` or `huile de canola` as aliases of that row even though the first recipe note permits canola.

### Sesame-oil boundary

- Korean Soy-Marinated Jammy Eggs (`e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-10`) says `1 tbsp toasted sesame oil`; keep the explicit toasted identity.
- Habitant Pea Soup (`e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-11`) says `1 tbsp sesame oil`; its current ref is toasted sesame oil, with an import note that the export said “dark sesame oil.” If the generic row is added, relink this one line to `ingredient-ref-sesame-oil`; do not rewrite the original text or infer a toast state from the note.

## Held candidates and boundary decisions

| Candidate family | Decision and reason |
| --- | --- |
| Safflower and rice-bran oils | Hold for a later named-oil tranche. OQLF supports `huile de carthame` and `huile de riz`, and its rice-oil entry lists `rice bran oil`, but there is no exact recipe demand. Keep their names available for later review; do not overload the bounded tranche. [S12–S13] |
| Avocado and grapeseed oils | Hold. Avocado oil has a stable legacy candidate ID but no recipe demand; review the Québec food-market French display before activation. The OQLF grapeseed entry is not clearly in an edible-food domain, so it is insufficient by itself for an edible catalog row. Codex lists both as named oils but does not provide Québec display wording. [S02, S14] |
| Walnut, hazelnut, pumpkin-seed, almond, and other specialty seed/nut oils | Hold pending direct Québec/Canadian culinary-product names and exact demand. Do not treat “nut oil” as a safe alias; some oils also have toasted/un-toasted or culinary/finishing distinctions. Codex's identity list establishes source-specific oils, not Québec name preference or recipe use. [S02, S08] |
| Toasted sesame oil | Keep separate from generic sesame oil. Narrow the active entry to toasted-specific English/French wording; delete only generic `sesame oil` ownership. A manufacturer distinguishes roasted and unroasted lines and a Canadian-market product listing supplies Québec French toasted wording, but neither defines every sesame-oil product. Do not create an “untoasted” identity until recipe demand names it. [S09–S11] |
| Refined/virgin coconut oil; red palm, palm-kernel, and palm fractions | Keep current coconut oil generic for its single unqualified line. Do not add refined/virgin splits without a matching recipe. Preserve the existing crude-palm row and its boundaries; palm-kernel oil (`huile de palmiste`) comes from the kernel, unlike palm oil from the fruit's fleshy mesocarp, and fractions are distinct. Do not alias `red palm oil` to the existing crude-palm entry by color wording alone. [S02, S15] |
| Mustard oil | Already active as `ingredient-ref-mustard-oil` from the WP06 South Asian review. Do not add a duplicate or assume all mustard oil is the same regional culinary product. |
| Lard, rendered pork fat, leaf lard | Hold; there are no exact ingredient lines. OQLF maps lard to `saindoux` and also lists `graisse de porc`; it distinguishes `saindoux de panne` (leaf lard). Codex separately defines lard and rendered pork fat, so do not collapse them into one alias set. [S16–S17] |
| Beef suet and beef tallow | Hold; there are no exact ingredient lines. OQLF uses `suif de bœuf` for kidney fat/beef suet and `graisse de bœuf` for beef tallow, while noting overlapping butchery vocabulary. Codex defines edible tallow as rendered bovine and/or sheep fat. Require the recipe's state/species before choosing a row or cross-alias. [S17–S18] |
| Duck, goose, and chicken fat | Hold for animal-fat review; no exact ingredient line. A Québec product listing supports the product-specific wording `gras de canard fondu`; one duck product does not establish a broad animal-fat alias or a parallel goose/chicken display. [S19] |
| Shortening and baking spreads | Keep legacy `ingredient-ref-shortening` inactive until a recipe or direct product specifies the type. OQLF warns that French `shortening` can describe many solid cooking fats and recommends a more precise `graisse alimentaire`, `graisse végétale`, `graisse animale`, hydrogenated oil, lard, or tallow as context requires. CFIA's compositional standard defines shortening as semi-solid fats/oils and margarine as a water-in-fat emulsion. Do not alias shortening, margarine, or lower-fat baking spreads. [S20–S21] |
| Margarine | Keep current identity; six exact lines use the term. The Canadian compositional standard describes margarine as an emulsion of water in non-dairy fat/oil. It remains distinct from semi-solid shortening and from an unspecified baking spread. [S21] |
| Chili, garlic, scallion, annatto, and other infused oils | Do not add duplicates for chili oil/crisp oil. Hold garlic/scallion/annatto/infused oil as compound or preparation candidates; no recipe lines specify them, and their base oil/formula can vary. Do not alias them to the source oil. |
| Cooking spray | Hold. The sole `oil spray` ingredient line has no linked identity or source; it could denote a source-specific oil or a formulated spray. Do not link it to canola or generic vegetable oil from the word `oil` alone. |
| Solid, liquid, melted, whipped, clarified, and water-containing states | Add no forms from this review. The plan identifies relevant distinctions, but the scanned lines do not establish measure semantics or a reusable state conversion. Keep emulsified spreads distinct from oils and distinguish clarified fats from water-containing products when exact recipe evidence appears. |

No source in this review establishes a general density, cup/spoon mass, form conversion, cooking substitution, or recipe-wide interchangeability. Codex and CFIA standards support product identity and labeling boundaries only; they must not be converted into runtime quantities or substitutions.

## Source manifest

Sources were accessed on 2026-10-12. These proposal-local IDs are citations only; they are not research-ledger records. The OQLF Grand dictionnaire terminologique is used for Québec French/English terms; Codex and CFIA are used for food identity and Canadian labeling/compositional distinctions.

| ID | Source | Supports and limits |
| --- | --- | --- |
| `WP05-S-OILS-20261012-S01` | Canadian Food Inspection Agency (CFIA), [Labelling requirements for fats and oils](https://inspection.canada.ca/en/food-labels/labelling/industry/fats-and-oils) | A single-source cooking oil's common name identifies its source; “vegetable oils” can describe multisource vegetable oils. Ingredient lists in certain contexts may use generic “vegetable oil” even when the source oil is specific. Supports precise identities and explains why a recipe's generic wording cannot be normalized to canola. CFIA also notes that “extra virgin” is an olive-oil designation under Codex/IOC standards. |
| `WP05-S-OILS-20261012-S02` | Codex Alimentarius Commission, [Standard for Named Vegetable Oils, CXS 210-1999, 2024 amended text](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+210-1999%2FCXS_210e.pdf) | Defines distinct named source oils, including rapeseed versus low-erucic-acid rapeseed/canola, maize/corn, soybean, sunflower, safflower, peanut/arachis, rice bran, avocado, grape seed, hazelnut, palm, and palm kernel. Supports identity boundaries, not preferred Québec market wording, recipe demand, conversions, or substitutions. |
| `WP05-S-OILS-20261012-S03` | Office québécois de la langue française (OQLF), [huile d'olive vierge extra](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430717/huile-dolive-vierge-extra) | Direct bilingual pair: `extra virgin olive oil` / `huile d'olive vierge extra`. The definition reflects the terminology record's cited historical source; do not copy the historical numeric threshold into the catalog. |
| `WP05-S-OILS-20261012-S04` | OQLF, [huile de canola](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870887/huile-de-canola) | Preferred Québec French and English `canola oil`; defines the source as canola. Does not make canola synonymous with all vegetable oil or all rapeseed/colza oils. |
| `WP05-S-OILS-20261012-S05` | OQLF, [huile de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413228/huile-de-mais) | Preferred `huile de maïs`, variant `huile de germes de maïs`, English `corn oil`. |
| `WP05-S-OILS-20261012-S06` | OQLF, [huile de soya](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083839/huile-de-soya) | Preferred Québec `huile de soya`, accepted French variant `huile de soja`; English terms include `soybean oil`, `soya bean oil`, and `soya oil`. |
| `WP05-S-OILS-20261012-S07` | OQLF, [huile de tournesol](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413238/huile-de-tournesol) | Preferred Québec French and English `sunflower oil`; the English record also lists `sunflower seed oil` and `sunflowerseed oil`. Does not support a specific high-/mid-oleic oil alias. |
| `WP05-S-OILS-20261012-S08` | OQLF, [huile d'arachide](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413219/huile-darachide) | Québec French/English peanut-oil pairing and source variants. OQLF also lists `nut oil`, but that broad English phrase is deliberately excluded from the catalog alias proposal because it can overlap with other nut oils. |
| `WP05-S-OILS-20261012-S09` | OQLF, [huile de sésame](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413479/huile-de-sesame) | Unqualified Québec French and English sesame-oil name; it does not specify toasted or untoasted style. |
| `WP05-S-OILS-20261012-S10` | Kadoya Sesame Mills, [Sesame Facts — sesame oil products](https://www.kadoya.com/english/facts/) | Manufacturer distinguishes brown oil from roasted seed, a lighter near-colorless product from unroasted seed, and a black-sesame oil from roasted black seed. These are product examples, not a universal taxonomy for all sesame oils. |
| `WP05-S-OILS-20261012-S11` | Maison Orphée, [Huile vierge de sésame grillé pressée à froid](https://maisonorphee.com/products/huile-de-sesame-grille-vierge); Metro Québec, [Oi! toasted sesame oil listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/huiles-et-vinaigres/huiles-vegetales/huile-de-sesame-grille/p/810042990210) | Québec/Canadian-market product wording uses `huile de sésame grillé` for a toasted product. Product labels support localized display wording, not an alias from every unqualified sesame oil. |
| `WP05-S-OILS-20261012-S12` | OQLF, [huile de carthame](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8878264/huile-de-carthame) | Preferred French safflower-oil term and English pair. `Huile de safre` is listed only for some contexts; not proposed as an alias. |
| `WP05-S-OILS-20261012-S13` | OQLF, [huile de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410164/huile-de-riz) | French `huile de riz`; English `rice oil` and `rice bran oil`. OQLF notes it is little used as a food oil, supporting lower priority rather than an identity prohibition. |
| `WP05-S-OILS-20261012-S14` | OQLF, [huile de pépins de raisin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8886279/huile-de-pepins-de-raisin) | Supplies a French term but is recorded in a chemistry/industrial context; insufficient by itself to establish a culinary display or exact edible-product scope. |
| `WP05-S-OILS-20261012-S15` | OQLF, [huile de palmiste](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084454/huile-de-palmiste); see also Codex CXS 210 in S02 | Québec French name for palm-kernel oil. Codex defines palm-kernel oil from the fruit kernel and palm oil from the fleshy mesocarp; they are separate identities. |
| `WP05-S-OILS-20261012-S16` | OQLF, [saindoux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408998/saindoux) and [saindoux de panne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8890114/saindoux-de-panne) | Maps lard to `saindoux` / `graisse de porc` and distinguishes leaf lard as `saindoux de panne`. These names do not establish recipe demand. |
| `WP05-S-OILS-20261012-S17` | Codex, [Standard for Named Animal Fats, CXS 211-1999](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/hu/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+211-1999%2FCXS_211e.pdf) | Separates lard, rendered pork fat, premier jus, and edible tallow by source tissues and processing. Supports distinct identity boundaries, not culinary substitutions or numeric app mappings. |
| `WP05-S-OILS-20261012-S18` | OQLF, [suif de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432970/suif-de-boeuf) and [graisse de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18493698/graisse-de-boeuf) | Pairs beef suet with `suif de bœuf` and beef tallow with `graisse de bœuf`; notes that `suif de bœuf` is also a general butchery term, so exact recipe/process wording matters. |
| `WP05-S-OILS-20261012-S19` | Aliments du Québec, [Gras de canard fondu](https://alimentsduquebec.com/aliments-dici/viandes/gras-de-canard-fondu) | Québec-listed duck-fat product wording. One product does not establish a broad goose/chicken synonym or a generic fat identity. |
| `WP05-S-OILS-20261012-S20` | OQLF, [graisse alimentaire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/24198175/graisse-alimentaire) | Explains the ambiguity of French `shortening` and recommends context-specific French descriptions. Does not support activating the current broad legacy candidate by itself. |
| `WP05-S-OILS-20261012-S21` | CFIA, [Canadian Food Compositional Standards, Volume 8 — Fats and Oils](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), sections 8.3.1–8.3.2 | Defines shortening as a semi-solid food prepared from fats/oils and margarine as a plastic or fluid water-in-fat emulsion. These regulatory definitions support separation; they are not composition templates for every baking spread. |

## Limitations

- This is a proposal, not an integration instruction to edit the live seed or the checklist. Recheck current names, aliases, IDs, recipe links, and exact counts immediately before a later integration.
- Codex and CFIA standards provide source identity and labeling distinctions. They do not establish which oil a generic recipe author intended, what substitutions will work, or a transferable recipe measurement.
- The OQLF records are terminology evidence, not a market-frequency survey. A named French term does not prove that a given product class belongs in the first tranche.
- No forms, densities, unit mappings, yields, substitutions, or ingredient quantities were added or inferred. No tests were run because this task only adds a research proposal document.
