# WP02 B4 — Green banana and plantain flour boundary review

- **Date:** 2026-10-10
- **Status:** Proposal only; not integrated
- **Scope:** B4 green-banana and plantain flour boundary only. Breadfruit, tigernut, yam, taro, other root/fruit flours, and measurement/substitution research are out of scope.
- **Repository basis:** Current dirty working tree preserved. Reviewed the B4 row in `docs/catalog/batches/baking-flours-starches.md`, active seed and legacy import catalog, ingredient forms, research ledger, units, and all bundled recipe ingredient lines. No shared catalog, ledger, plan, test, or recipe file was edited.

## Recommendation

Propose two separate identity-only candidates under `FLOUR_AND_STARCH`:

| Candidate ID (unallocated) | English display | Provisional fr-CA display | Scope and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-green-banana-flour` | green banana flour | farine de banane verte | Flour made by drying and milling green/unripe banana pulp. Peel inclusion is product-specific; do not imply that “whole-fruit” always includes peel. Keep separate from banana fruit, ripe banana powder, and isolated banana starch. |
| `ingredient-ref-green-plantain-flour` | green plantain flour | farine de banane plantain verte | Flour made by drying and milling green/unripe plantain pulp. Peel inclusion is product-specific. Keep separate from plantain fruit and any ripe-plantain flour or isolated plantain starch. |

Use **no active aliases** for now. In particular, leave generic `banana flour`, `plantain flour`, `banana meal`, and `farine de banane` unassigned: source usage spans fruit type and/or maturity, and some French/English terminology records map `farine de banane` to *banana meal* rather than the current standard’s *banana flour*. The standard’s shared category is evidence that both products fall under one specification; it does not state that the ingredient names are synonyms or that the flours are interchangeable. Current manufacturer product pages list green banana flour and plantain flour separately, and the source fruits already have separate catalog identities.

Do not create banana/plantain ripeness forms. The flour identities describe dried, milled products, not ripeness states of the existing fresh-fruit references. Do not add densities, unit mappings, conversion or substitution rules, or yield values. Keep the B4 checklist open pending independent fr-CA review and later exact-product measurement/substitution evidence.

## Evidence and boundaries

### Green/unripe versus ripe/mature

- The East African Standard EAS 1106:2023 is titled **Banana flour — Specification** and explicitly covers green/unripe banana and plantain flours; the 2025 EAC standards catalogue says it excludes instant banana flour [S01]. This is the strongest standards-level scope found in this pass.
- FAO’s banana-processing chapter describes banana flour as made from green fruit by peeling, slicing, drying, and milling. It calls the input unripe and says it is processed before ripening begins. “Mature green” in the plantain post-harvest source means harvest-mature but still unripe; do not treat *mature* as a synonym for ripe [S02–S03].
- The FAO plantain compendium separately reports flour made from ripe plantain (ripeness stages 4–5) used in bread and biscuits, as well as instant flour [S03]. This older source establishes a real ripe-product boundary, but this review found no current product specification or bundled-recipe demand for a ripe flour identity. Hold it as a separate research candidate; never map unqualified `plantain flour` to the green candidate. Likewise, the FAO source distinguishes fully ripe banana powder from green banana flour [S02].
- The source-backed proposed rows are therefore explicitly **green**. Do not infer maturity from `banana flour` or `plantain flour` alone.

### Whole-fruit flour versus extracted starch

- A 2012 study isolated both flour and starch from unripe plantain fruit as separate materials and reported different yields and physical/functional properties [S04]. The flour retains fruit components; extracted starch is a separate ingredient, not a synonym, form, or conversion of the flour.
- A 2026 primary study compared green banana flour made from whole fruit (pulp plus peel) with pulp-only flour and found compositional differences [S05]. Other current product documentation describes peeling before milling [S06]. Thus the words “whole-fruit flour” are process-qualified: do not assume peel is either present or absent in every flour. Peel inclusion is not enough evidence for a third identity here.
- No active banana- or plantain-starch reference was found. Do not create one from the fact that green fruit or flour contains starch. Record extracted starch as a separate future identity candidate only if a food-product source and localized name are reviewed.

### Source-named products and identity decision

- EAS 1106:2023 provides one standards class named *banana flour* spanning both source fruits, but the public catalogue is a scope listing and does not declare the terms equivalent [S01].
- A current manufacturer lists *Plantain Flour* and *Green Banana Flour* as distinct, single-crop offerings [S07]. A Peruvian manufacturer’s product sheet names `Harina de plátano / Plantain flour`, specifies green `plátano bellaco`, and describes peeling, chopping, drying, milling, and sifting [S06]. INACAL also lists a *Harina de plátano* standard, confirming a regionally named plantain-flour product class [S08].
- Because the seed already distinguishes banana and plantain as separate fruit references, and direct product sources distinguish the derived flours by source, prefer two candidates with no cross-aliases. Do not infer functional non-interchangeability from the different names; no substitution decision is proposed.
- INACAL’s public entry shows NTP 011.700 as revised in 2019, while its official 2024 corrigenda list references a 2022 revision/corrigendum [S08–S09]. Use the INACAL record only for the Spanish product name and existence of a standard; verify the latest full text before relying on requirements or exact maturity scope.

### fr-CA terminology confidence

- **Green banana flour — `farine de banane verte`: high market-label confidence; medium terminology confidence.** Current Canadian retail pages use this exact French product name and describe flour from unripe bananas [S10]. OQLF has a `farine de banane` entry last updated in 1982 and links it to *banana meal*, not *banana flour*; TERMIUM’s `banana meal` record also gives `farine de banane` and describes green or ripe source fruit [S11]. These entries support the French base wording and document broad maturity usage, but they do **not** establish an OQLF/TERMIUM equivalent for the exact modern term *green banana flour*.
- **Green plantain flour — `farine de banane plantain verte`: medium-low terminology confidence; independent Québec review needed.** OQLF and TERMIUM support `banane plantain` for the fruit, and a Canadian retailer lists `Plantain Flour / Farine de Plantain` [S12–S13]. The full green-flour compound is a transparent provisional description; it is not claimed as an OQLF- or TERMIUM-approved term. `Farine de plantain` is a documented Canadian retail label, but leave it inactive as an alias until its maturity scope and French search ambiguity are reviewed.
- The INACAL Spanish term `harina de plátano` is regional source evidence, not a Québec French term. No `farine de banane plantain verte`, `farine de plantain vert`, or `farine de banane` plantain equivalence is attributed to OQLF/TERMIUM.

## Active catalog, forms, ledger, legacy, and collision audit

- Active seed rows are `ingredient-ref-banana` (`banana / banane`, category `FRUIT`, French plural alias `bananes`) and `ingredient-ref-plantain` (`plantain banana / banane plantain`, category `FRUIT`, no aliases). Both have `defaultDensity: null` and empty `unitMappings`.
- The Kotlin legacy import catalog contains the same two fruit IDs and names. No active reference or legacy row named banana flour, green banana flour, plantain flour, plantain starch, or banana starch was found. The proposed exact product phrases did not match an active display name or alias; leave generic `banana flour`, `plantain flour`, `banana meal`, and `farine de banane` unresolved rather than assigning colliding broad terms.
- The active form package contains no banana or plantain forms. The ledger has accepted identity records for the two fruit references only; both say measurement and substitution are not yet researched and no forms/conversions/yields/substitutions are established. There is no flour/starch ledger record. An unrelated unresolved candidate `ingredient-ref-east-african-highland-cooking-banana` holds the *matooke* food-crop versus prepared-food distinction. Do not use `matooke` as a flour alias; Uganda’s standards listing says the former `Banana (Matooke) flour` standard was replaced by EAS 1106:2023 [S14].
- Units include `large banana` (`count`) with an empty-evidence `large banana` unit-definition ledger record. It remains a count unit, not a mass conversion, density, flour identity, or ripeness form.

## Exact bundled recipe demand

The current 114 recipe files were parsed for ingredient IDs, ingredient names, original text, and preparation/notes:

- **Green banana flour / any banana flour:** 0 direct ingredient lines.
- **Green plantain flour / plantain flour:** 0 direct ingredient lines.
- **Banana or plantain starch:** 0 direct ingredient lines.
- **Existing banana fruit:** 3 direct lines across 2 recipes: one `1/2 large over-ripe banana`, one optional `extra banana slices`, and one `3 bananas, mashed` marked very ripe. A separate toppings note mentions bananas but does not request a linked banana line.
- **Existing plantain fruit:** 0 direct lines.

This is catalog-coverage evidence only; it does not block identity-only additions under the project’s global catalog scope. The banana lines do not support flour, starch, maturity-form, or measurement mappings.

## Integration handoff

If accepted by the integration owner, add the two candidate reference identities and their ledger evidence together in the canonical seed/legacy index; keep aliases, forms, measurements, conversions, yields, and substitutions empty. Add recipe search fixtures only if the integration plan calls for coverage tests. Revisit ripe plantain flour, broad `banana flour`, maturity qualifiers, peel inclusion, and extracted starch as separate evidence questions; do not resolve them by aliasing.

## Sources

Accessed 2026-10-10 unless a source record shows its own date.

- **S01 — East African Community, EAC Standards Catalogue 2025, EAS 1106:2023:** [official catalogue PDF](https://www.eac.int/documents?controller=download&file=177480db-3520-4d76-b686-1a6e0438a997&name=EAC+STANDARDS+CATALOGUE+2025.pdf&task=download.file). Names “Banana flour — Specification” and describes green/unripe banana and plantain flour; excludes instant banana flour.
- **S02 — FAO, *Fruit and vegetable processing*, banana preservation/processing chapter:** [Chapter 8](https://www.fao.org/4/V5030E/V5030E0O.HTM). Separates ripe-pulp banana powder from green-fruit banana flour and documents green/unripe processing.
- **S03 — FAO, *Banana (Plantain): Post-harvest Operations*:** [technical compendium PDF](https://www.fao.org/fileadmin/user_upload/inpho/docs/Post_Harvest_Compendium_-_Plantain.pdf), especially pp. 8–9. Documents peeled plantain pulp dried and ground into flour from unripe fruit, and separately reports ripe-plantain flour.
- **S04 — Pelissari et al., “Isolation and characterization of the flour and starch of plantain bananas (Musa paradisiaca),” 2012:** [DOI](https://doi.org/10.1002/star.201100133). Primary study of separate flour and extracted-starch materials from unripe plantain.
- **S05 — Marzano et al., “Proximate Composition, Phenolic Compounds, and In Vitro Digestion Resistance of Starch in Green Banana Flours Produced From Pulp and Whole Fruit,” first published 2026-06-15:** [DOI](https://doi.org/10.1002/star.70241). Primary comparison of whole fruit (pulp plus peel) and pulp-only green banana flours.
- **S06 — Procesadora Las Tablas, Green Flours `Harina de plátano / Plantain flour` product data sheet, issued 2020-07-22:** [PDF hosted by ADEX Peru](https://adex-b2peru.s3.amazonaws.com/userfiles/product/document/706_5f6e4be9ece5d.pdf). Primary manufacturer specification names green `plátano bellaco` and describes peeled/dried/milled/sifted product.
- **S07 — Tropicals Direct, current flour range:** [manufacturer site](https://www.tropicals.direct/). Lists separate *Plantain Flour* and *Green Banana Flour* offerings; the plantain product is pictured/labeled green plantain flour.
- **S08 — INACAL, NTP 011.700 public record:** [official standard listing](https://servicios.inacal.gob.pe/cidalerta/biblioteca-detalle.aspx?id=31249). Confirms the source-named `Harina de plátano` food standard; its shown revision date may be superseded.
- **S09 — INACAL, technical corrigenda list, April 2024:** [official PDF](https://www.inacal.gob.pe/repositorioaps/data/1/1/1/jer/corrigendastecnicas/files/Listado_corrigenda%20abril%202024.pdf). Lists NTP 011.700:2009 revised 2022 / CT 1:2022; used only to flag revision chronology.
- **S10 — OnlineOrganics Canada, `Farine de bananes vertes biologique`:** [Canadian retailer product page](https://onlineorganics.ca/fr/products/farine-de-bananes-vertes-biologique). Uses the fr-CA market label and describes peeled, unripe bananas that are dried and ground.
- **S11 — OQLF GDT, `farine de banane`; TERMIUM Plus, `banana meal`:** [OQLF entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489070/farine-de-banane) and [TERMIUM record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=33&i=&index=frr&lang=fra&sg_kp_wet=10000927&srchtxt=BANANE). The OQLF entry is dated 1982 and pairs `farine de banane` with *banana meal*; TERMIUM’s context says this meal is made from green or ripe fruit.
- **S12 — OQLF GDT, `banane`; TERMIUM Plus, `plantain`:** [OQLF entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297102/banane) and [TERMIUM plantain record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=22&i=&index=frr&lang=fra&sg_kp_wet=923817&srchtxt=BANANE). OQLF pairs `banane` with *banana* and distinguishes cooking bananas; TERMIUM gives `banane plantain` for the fruit. These support fruit wording, not the full flour compound.
- **S13 — Parce Canada, `MD Plantain Flour – Farine de Plantain`:** [Canadian retailer product page](https://parce.ca/store/md-plantain-flour-farine-de-plantain-harina-de-platano-340-g/). Retail naming evidence only; no product maturity or composition claim is taken from the page.
- **S14 — Uganda National Bureau of Standards, `US EAS 1106:2023`:** [official standards listing](https://webstore.unbs.go.ug/store.php?preview=&src=5751). Its listing states the same green/unripe scope and says the standard replaces `US 983:2023 Banana (Matooke) flour`.
