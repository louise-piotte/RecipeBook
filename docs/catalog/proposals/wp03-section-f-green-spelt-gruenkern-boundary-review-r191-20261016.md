# WP03 Section F: Green spelt / Grünkern product-boundary review (R191)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Decision integrated as a documented hold in the Section F and regional preprocessed-grains checklists; no shared catalog or ledger data changed.
- **Checklist scope:** The plan keeps both broad work areas open while recording this candidate-specific hold under each relevant item.
- **Candidate:** Grünkern, also described in some sources as green spelt: immature spelt dried after harvest, traditionally over a wood fire in its Franconian form.
- **Recommendation:** **Hold outside the active catalog and research ledger.** The product identity is well established in German and EU sources, but this review found no current Canadian or Québec standalone Grünkern product with a Québec-supported French product name. The Canadian evidence found is an imported bread containing green-spelt flour and local spelt-grain listings that do not describe Grünkern processing.

## Product boundary and terminology

The European specification for the protected name **Fränkischer Grünkern** identifies it as spelt (*Triticum spelta*) harvested unripe at the start of dough ripeness and dried; traditional drying over beechwood gives it a characteristic aroma. The specification limits that protected regional product to the defined Franconian area and a named spelt variety [S01–S02]. Davert currently sells a 500 g product called **Grünkern** in Germany and describes the grain as half-ripe spelt dried over wood fire. Its page says it may be used whole or cracked, which confirms that trade usage can cover more than one particle size [S03].

Keep this process-specific grain distinct from the unqualified spelt-grain choices and from freekeh. The current catalog has separate `spelt berries / grains d’épeautre` and `freekeh / freekeh` references. The Swiss consumer source `FRC` calls the spelt product `épeautre vert` and describes freekeh separately as green durum wheat that is grilled; it explicitly notes the culinary resemblance, but does not establish an interchangeable ingredient or a Québec name [S09]. Do not alias this candidate to spelt berries, farro, or freekeh.

French terminology is the deciding gap. OQLF supports the base cereal term **épeautre** but its reviewed entry does not name this immature, dried product [S05]. The French `épeautre vert` wording is documented by a Swiss consumer source, not a Québec authority or Québec retail package [S09]. Current Québec-grown spelt berries are sold as **Spelt berries** by Almanac Grain, and a current Walmart Canada French page calls a Canadian-origin whole-grain product **Épeautre biologique** [S06–S07]. Neither listing describes the Grünkern harvest and drying process. Targeted current searches included `site:ca "Grünkern" grain Canada`, `"green spelt" Canada grain product buy`, `"épeautre vert" épicerie Québec`, and `site:ca "green spelt" grain product`; they surfaced no Canadian or Québec standalone Grünkern/green-spelt grain listing. That result is bounded to the sources and queries reviewed, not proof that no such product exists anywhere.

The English expression also needs scope control. Duden defines *Grünkern* as unripe harvested, dried and ground spelt, while Davert's packaged grain page says the food is used whole or cracked [S03–S04]. Do not use a bare English alias such as `green spelt` to claim cracked or milled products, and do not treat an ingredient statement for green-spelt flour as evidence for a whole-kernel SKU.

## Exact ownership and archive audit

At the review snapshot the live package contained **1,571 ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,916 research-ledger records**. Searches of the reference display names and aliases, form labels and match terms, legacy names and aliases, ledger records, the active plan, and the proposal and batch archives found no owner or earlier focused decision for `Grünkern`, `green spelt`, `green grain`, `épeautre vert`, `Badischer Reis`, or a proposed `ingredient-ref-green-spelt-gruenkern` ID. The searches also found no current reference specifically for green-spelt flour.

| Existing owner | Current record | Boundary for this review |
|---|---|---|
| `ingredient-ref-spelt-berries` | `spelt berries / grains d’épeautre`; no aliases or attached forms. Its ledger record is identity-verified and has no supported generic measurement. | This unqualified grain identity does not encode the immature harvest and drying process defining Grünkern. Do not repurpose its display or add `green spelt` as an alias. |
| `ingredient-ref-spelt-flakes`, `ingredient-ref-spelt-flour`, `ingredient-ref-malted-spelt-flour`, `ingredient-ref-sprouted-spelt-flour`, `ingredient-ref-puffed-spelt` | Separate spelt processing identities; no attached forms for the reviewed owners. | Flakes, flour, malted flour, sprouted flour, and puffed spelt remain separate. Green-spelt flour or cracked grain needs product-specific scope of its own. |
| `ingredient-ref-freekeh` | `freekeh / freekeh`, with `frikeh` spelling aliases; no attached forms. | Keep immature durum wheat and dried unripe spelt as distinct products, even where sources compare their culinary use. Add no shared alias. |
| `ingredient-ref-farro-grain` and `ingredient-ref-farro-flour` | Separate generic farro grain and flour references. | Do not route `Grünkern` to generic farro. No reviewed Canadian/Québec product source identifies Grünkern with the current farro product class. |

The live ingredient-form file has no forms attached to the spelt berries, freekeh, farro grain, or listed processed-spelt owners. The legacy file has no candidate for the reviewed names. The ledger has no record for the proposed identity. No reference, form, legacy mapping, source registration, observation, or ledger record is recommended while the hold stands. See the [live references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json).

## Picker projection

The picker normalizes accents and punctuation, returns full word-phrase matches first, then uses substring matching if no phrase match exists ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9)). A read-only projection over the current references and forms gives:

| Query | Current result | If a future local row used `green spelt / épeautre vert` |
|---|---|---|
| `Grünkern` / `grunkern` | 0 | 1 only if that exact locally supported name or alias is added. |
| `green spelt` | 0 | 1 exact phrase result; keep this name unavailable until a local product and terminology source support it. |
| `épeautre vert` | 0 | 1 exact phrase result only after Québec French terminology is verified. |
| `spelt` | 6: current spelt berries, flakes, flour, malted flour, puffed spelt, and sprouted flour | 7; the new grain would join the broader spelt choices. |
| `épeautre` | 8: six existing spelt choices plus the two einkorn choices | 9; the new grain would join the broad French spelt/einkorn results. |
| `green` | 19 | 20; the new row would join the existing broad green-item results. |
| `freekeh` / `farro` | 1 / 2 | Unchanged if no shared aliases are added. |

Do not add `Badischer Reis`, `freekeh`, `frikeh`, `farro`, or a plain `spelt` / `épeautre` alias. The first would introduce a rice word into a cereal identity, and the latter terms would blur an existing broad family search. Do not alias `green spelt flour` to a whole-kernel row. If a Québec product later supports an exact name, project its bilingual display, French terms, and any cracked/ground SKU against the full live catalog before integration.

## Recipe-corpus demand

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for `Grünkern`, `Grunkern`, `Fränkischer Grünkern`, `green spelt`, `green-spelt`, `green spelt flour`, `green grain`, `épeautre vert`, `épeautre demi-mûr`, `Badischer Reis`, and the proposed candidate ID. The scan found **0 matching recipe files and 0 matching ingredient rows**. No recipe link, line assignment, or recipe-text change is supported.

## Measurement, form, and substitution limits

- **Package mass:** Davert's 500 g amount is a package size, not a household measure or conversion [S03].
- **Product-specific cooking directions:** Davert directs the cook to use twice the amount of lightly salted water and simmer for 35–40 minutes [S03]. The instruction gives no standardized unit or measured cooked yield. Keep it as SKU-specific preparation context; it does not establish a mass-to-volume mapping, default density, dry-to-cooked grain conversion, or generic time for every whole/cracked Grünkern product.
- **Moisture specification:** The EU PDO specification's maximum moisture level applies to the protected Franconian product only [S01]. It is not a generic moisture, storage, density, or conversion value for all Canadian/Québec spelt products.
- **Forms:** No form is proposed. Whole versus cracked or ground products may be sold under related Grünkern wording [S03–S04], but a state/form edge needs a directly sourced catalog scope and a reason to support conversion. Add no cooked form, density override, unit mapping, conversion, or yield.
- **Substitutions:** FRC's culinary comparison with freekeh is not a tested exchange. Sources give no ratio, recipe context, or adjustment for substituting one for the other. Add no global form conversion or contextual substitution to or from spelt berries, farro, freekeh, rice, or another grain.

## Conditional reference and ledger details if reopened

**No JSON row or ledger details are proposed for acceptance now.** The French display is unresolved for Québec, and the Canadian/Québec search did not find a standalone green-spelt product. If reopened after a current Québec-facing package or producer source identifies a standalone product, use that package's bilingual product titles as the starting display; verify a stable ID at integration time. Keep aliases empty unless each is locally attested and collision-checked. Keep `defaultDensity: null`, `unitMappings: []`, and forms/conversions/yields/substitutions empty unless new evidence supports a specific value. A first ledger record should use `recordType: ingredient_reference` only after the identity can be verified; do not create a speculative ledger candidate for an unverified consumer name.

## Source register

Sources checked online on 2026-10-16. Each proposal-local source ID below points to one URL. The recommendation uses the sources as bounded evidence; it does not treat a German, EU, or Swiss product name as Québec terminology.

| Source ID | Source and URL | Supports and limits |
|---|---|---|
| `WP03-GRUENKERN-R191-20261016-S01` | European Commission, [Fränkischer Grünkern single document](https://eur-lex.europa.eu/legal-content/EN/TXT/?toc=OJ%3AC%3A2014%3A410%3AFULL&uri=uriserv%3AOJ.C_.2014.410.01.0012.01.ENG) | Defines the protected product as unripe-harvested *Triticum spelta* dried at the start of dough ripeness; describes traditional beechwood drying, the production area, variety, quality grades, and maximum 13% moisture. It is a Franconian PDO specification, not a Canadian standard or household measure. |
| `WP03-GRUENKERN-R191-20261016-S02` | European Commission, [registration of Fränkischer Grünkern](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32015R0550) | Confirms that the protected name was entered in the EU register. It does not make every product sold as Grünkern eligible for the PDO. |
| `WP03-GRUENKERN-R191-20261016-S03` | Davert, [Grünkern 500 g](https://www.davert.de/produkte/gruenkern-500g) | Current German manufacturer SKU page: 500 g pack, half-ripe spelt dried over wood fire, whole or cracked use, single-ingredient declaration, and 2x water/35–40 minute preparation instructions. Those data are SKU-specific; no cup mass or measured yield is stated. |
| `WP03-GRUENKERN-R191-20261016-S04` | Duden, [Grünkern](https://www.duden.de/rechtschreibung/Gruenkern) | German lexical definition describes unripe harvested, dried and ground spelt. This warns that bare term scope may include milled product; it is not Canadian retail evidence. |
| `WP03-GRUENKERN-R191-20261016-S05` | Office québécois de la langue française, [épeautre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354126/epeautre) | Supports the Québec base cereal term `épeautre` for spelt. The reviewed entry does not define or name green spelt/Grünkern. |
| `WP03-GRUENKERN-R191-20261016-S06` | Almanac Grain, [Spelt berries](https://almanacgrain.ca/products/spelt-berries) | Current Quebec-grown spelt-berry product, grown in Saint Paul, Québec. The page describes ordinary spelt-berry use but not the immature-harvest and drying process at issue. |
| `WP03-GRUENKERN-R191-20261016-S07` | Walmart Canada, [Épeautre biologique Great Value](https://www.walmart.ca/fr/ip/peautre-biologique-Great-Value/0YJUXXXVBF9W) | Current French Canadian retail page calls a Canadian-origin whole-grain product `Épeautre biologique`, 454 g. Its page does not describe immature harvest or Grünkern drying, and it is not a Québec lexical ruling. |
| `WP03-GRUENKERN-R191-20261016-S08` | Naturitas Canada, [TerraSana whole-wheat rye bread with spelt](https://www.naturitas.ca/p/food/snacks-and-breads/breads/whole-wheat-rye-bread-with-spelled-500-g-terrasana) | Current Canadian retailer listing declares 2% green spelt flour in an imported bread. It is a formulated baked product, not a standalone grain package or evidence for a whole-kernel identity. |
| `WP03-GRUENKERN-R191-20261016-S09` | Fédération romande des consommateurs, [Céréale: plutôt ancienne ou moderne?](https://www.frc.ch/cereale-plutot-ancienne-ou-moderne) | Archived Swiss consumer reference uses `épeautre vert` for immature spelt dried at high temperature and separately describes freekeh as green durum wheat roasted over flame/fire. It supports a French-language distinction outside Québec and gives no substitution ratio. |

## Recommendation and reopen conditions

**Hold Grünkern / green spelt outside the active catalog and ledger for now.** German and EU sources define a distinct processed-spelt product, but the current Canadian/Québec evidence reviewed does not establish a standalone local product or its preferred Québec French name. Keep all current spelt, freekeh, farro, forms, aliases, recipe links, and measurements unchanged.

Reopen when a current Canadian or Québec manufacturer/retailer source shows a standalone Grünkern or equivalent green-spelt grain package and a Québec-supported French title can be verified. At that review, determine whether the product is whole, cracked, or milled; audit `green spelt`, `épeautre vert`, `Grünkern`, and broad `spelt`/`épeautre` picker results across the live catalog; rescan the 114-recipe corpus; and add a numeric observation only if the source gives a transferable measured quantity or an explicitly product-specific ledger observation.
