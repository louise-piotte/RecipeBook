# WP03 jute leaves and molokhia Québec identity review

- **Reviewed:** 2026-10-11
- **Status:** coordinator-reviewed and integrated as ledger evidence and a checklist checkpoint; the existing identities and aliases remain unchanged, with both French displays provisional.
- **Scope:** current `ingredient-ref-jute-leaves` and `ingredient-ref-molokhia-leaves` records, their Québec French wording, aliases, plant-part/product boundaries, and recipe demand.
- **Recommendation:** retain the two existing identities as separate records. Their food identities are supported, but keep both French labels provisional. Do not add another identity, broaden aliases, add forms or numeric behavior, or change recipe links on this evidence.

## Disposition

| Current identity | Decision | Current EN / fr-CA display | Proposed Québec/community disposition |
|---|---|---|---|
| `ingredient-ref-jute-leaves` | **Retain** at *Corchorus* genus scope | `jute leaves` / `feuilles de jute` | Keep the French display provisional. Health Canada establishes the English leafy commodity name and genus scope, but the reviewed Québec sources do not establish a preferred French culinary name for leaves across *Corchorus* spp. Keep the leaf-qualified English display; do not alias bare `jute`, which also names fiber and fiber products. |
| `ingredient-ref-molokhia-leaves` | **Retain** as the narrower leafy-food identity associated with *C. olitorius* | `molokhia leaves` / `molokhia (feuilles de corète potagère)` | Keep the French display provisional pending scope-specific bilingual review. OQLF supplies Québec terms `mélochie`, `corète`, and `mloukhiya`, but its definition includes several species and warns that `molokhia` can also name a soup. Current Québec market labels support `molokhia` and `corète potagère` as local wording leads, but do not establish an unambiguous, species-qualified leaf label. Retain existing scoped aliases; do not add generic `corète`, `mélochie`, or `mloukhiya` as automatic matches yet. |

The two identities overlap taxonomically: *C. olitorius* is within the broader *Corchorus* scope, and its leaves can be called jute leaves. The catalog distinction remains useful because `jute leaves` is a genus-level commodity name while `molokhia` is a narrower culinary name. Keep generic jute separate from molokhia; never infer that fiber-grade jute, jute fabric, or a prepared molokhia dish is an edible-leaf ingredient.

## Taxonomy and product boundaries

Health Canada lists `Jute leaves (Corchorus spp.)` among leafy-vegetable commodities. Its regulatory list separately identifies ordinary spinach (*Spinacia oleracea*) and Malabar spinach (*Basella alba*); it corroborates the genus-level leaf commodity, not general culinary equivalence. Kew records *C. olitorius* both as a fiber-yielding jute plant and as a vegetable, and lists common names including jute and mulloukhia. A University of the West Indies horticulture paper makes the part distinction explicit: although the plant is known for fibre, it is also grown for young leaves eaten as food. These sources support edible *Corchorus* leaves and explain why unqualified `jute` is unsafe as an ingredient alias. [S01–S03]

Helaly et al. identify molokhia with *C. olitorius* and describe its leaves as a traditional leafy vegetable. Keep that narrower ingredient separate from genus-level jute leaves. OQLF's Québec terminology entry describes a leafy vegetable but says several species are cultivated for it; it therefore does not settle whether the preferred Québec term maps only to *C. olitorius* or also to other edible *Corchorus* leaves. [S04–S05]

The word `molokhia` also names a prepared soup in OQLF's note. Use a short molokhia alias only when the ingredient context indicates the leaves; do not create a prepared-dish identity from this evidence or map a named soup/stew to the leaf reference. Regional plant names such as `ewedu`, `lalo`, `saluyot`, `kplala`, and `adémé` should remain source- and locale-scoped: a local listing groups several of them together but does not give botanical scope for each name. [S05–S06]

Quebec-area listings provide useful naming leads, not form policy. A Repentigny farm listing uses `Corète Potagère`, `Molokhia`, and `Jute` together for a leafy plant. A Montréal-area distributor lists `Molokhia hachée` under frozen vegetables, and a Montréal retailer titles a product `Corète potagère molokhia sec`. These listings show current local market wording and product examples; they do not establish interchangeable aliases, botanical identification, a standard product state, a package conversion, or a community-preferred display. [S06–S08]

## Alias disposition

- Keep jute leaves at `jute leaves` / `feuilles de jute` with no added aliases. `jute` alone is ambiguous with the fiber and its textile products. Do not add `jute`, `tossa jute`, `nalta jute`, or `Corchorus` as unqualified aliases. No Québec source reviewed here establishes a safe French leaf-specific synonym beyond the current transparent display.
- Keep the molokhia record's current English aliases: `molokhia`, `malukhiyah`, `mulloukhia`, and `meloheeya`. They remain scoped to the leafy ingredient and supported by the existing Kew/Egyptian research record. Keep its current French alias `corète potagère`, which has local market support. [S03–S04, S08]
- Do not add `mélochie`, `corète`, or `mloukhiya` yet. OQLF lists them as Québec-preferred terms for the vegetable, but its multi-species definition does not show that they identify only *C. olitorius*. A bilingual Québec/community source that ties the chosen word to the intended edible leaves and resolves the species scope would support a later alias or display decision. [S05]
- Do not use `molokhia soup`, `mloukhiya` as a prepared-dish label, or other named dish/product wording as an ingredient alias without line-level evidence. Do not map textile `jute`, jute fibre, jute cloth, burlap, or sacks to either leaf identity.

## Live catalog and recipe audit

I audited the live split seed package, manifest-listed recipes, legacy candidates, and research ledger on 2026-10-11. The audit used the app's normalized ingredient-search key behavior: case-folding, Unicode NFKD and accent folding, ligature folding, punctuation-to-space normalization, and whitespace collapse.

| Dataset | Current count | SHA-256 or result |
|---|---:|---|
| Active ingredient references | 927 | `e14ad6668bc34bd83f7e1fd3993ac023d5d748ff134fafd807583435d6850468` |
| Ingredient forms | 51 | `a195a0f3b487d193be11cf5648b291f5b51f001ee21cd643af766655dbf28267` |
| Legacy identity candidates | 76 | `be5ff09fb522c8a36633dbaea66f57e44653c2840da88600f03f943e1bbd9fb0` |
| Research ledger | 1,184 records / 3,164 source entries / 2,563 distinct source IDs | `023f6bbe3e0dea7ecd2b701958ba230f8103fac526861b23b9c41a47dd641e97` |
| Recipe manifest and corpus | 114 files / 1,123 ingredient rows | manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; corpus `5c75d5c006e5e472a990fbcdb487711cf0bd13fedfad2e03e4043e35c93bdda9` |

The two active references are the only relevant phrase owners. The current molokhia record has French alias `corète potagère` and English aliases `molokhia`, `malukhiyah`, `mulloukhia`, and `meloheeya`; the jute-leaf record has no aliases. No candidate phrase has a competing form or legacy-candidate owner. `mélochie` and `mloukhiya` currently have no exact active owner. Phrase matching finds `jute` inside the `jute leaves` label, so the bare term must not be treated as a distinct safe alias.

All strings in all 114 recipe JSON files were scanned for `jute leaves`, jute/Corchorus variants, `molokhia` spellings, `mélochie`, `mloukhiya`, `corète`, and named regional variants. There were no mentions anywhere in the recipe corpus and no ingredient-row hits. There is no exact bundled-recipe demand or relinking request.

Both references remain identity-only. Each has `defaultDensity: null` and `unitMappings: []`; neither has an ingredient form or package yield. The ledger marks both measurements `researched_no_supported_value` and substitution research `researched_no_supported_substitute`. The eight ledger unit conversions contain neither identity. There are no global or contextual substitution rules for them. Do not infer density, volume or weight measures, yields, conversion, substitution, or recipe links from the retail package labels.

## Proposed checklist wording

Do not edit the shared checklist as part of this proposal. If the coordinator later updates its open terminology line, use wording that distinguishes the new Québec evidence from the remaining scope gap:

> [ ] Confirm Québec/community wording for `feuilles de jute` and molokhia leaves. OQLF lists `mélochie`, `corète`, and `mloukhiya` for a leafy vegetable but describes several species; Québec market listings use `molokhia`, `corète potagère`, and `jute` without settling a species-qualified leaf label. Keep both French displays provisional, keep genus-level jute leaves separate from *C. olitorius* molokhia, and add no aliases until bilingual community/product evidence resolves the scope.

The open evidence gap is specific: obtain a current Québec French or bilingual community/producer source that explicitly labels edible leaves, states or reliably scopes the taxon, and distinguishes the leaf commodity from jute fibre and from the prepared molokhia dish. Until then, the distinct ingredient identities stand, while both exact French display strings remain provisional.

## Sources

All new pages were accessed 2026-10-11. The new source-ID prefix `WP03-JUTE-LEAVES-MOLOKHIA-QUEBEC-20261011-S` had no prior match in the ledger or proposal tree at review time. Existing WP06 evidence is cited by its existing ID rather than duplicated.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP03-JUTE-LEAVES-MOLOKHIA-QUEBEC-20261011-S01** | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), leafy-vegetable commodity entries, including `Jute leaves (Corchorus spp.)`. | Supports genus-level edible-leaf commodity wording and distinguishes it from ordinary and Malabar spinach in the crop list. This regulatory grouping does not establish Québec retail terminology or culinary substitution. |
| **WP03-JUTE-LEAVES-MOLOKHIA-QUEBEC-20261011-S02** | Akoroda, [“Cultivation of jute (*Corchorus olitorius* L.) for edible leaf in Nigeria”](https://journals.sta.uwi.edu/ojs/index.php/ta/article/view/1948/0), *Tropical Agriculture* 65(4), 1988, abstract. | Explicitly distinguishes the plant's fibre use from cultivation of young leaves as food. The cultivation and cooking detail is regional; no quantity or Québec product behavior is inferred. |
| **WP03-JUTE-LEAVES-MOLOKHIA-QUEBEC-20261011-S03** | Royal Botanic Gardens, Kew, Plants of the World Online, [*Corchorus olitorius*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:320796-2/general-information), “Uses” and “Common Names.” | Records fiber/jute use, vegetable use, and common names including jute and mulloukhia for *C. olitorius*. Common-name overlap does not make bare `jute` a safe ingredient alias. |
| **WP06-TROPICAL-LEAFY-GREENS-20261009-S12** *(existing ledger source)* | Helaly et al., [“Characterization of Four Molokhia (*Corchorus olitorius*) Landraces by Morphology and Chemistry”](https://agr.aswu.edu.eg/wp-content/uploads/2020/11/Alkharpotly-2016-2.pdf), *Journal of Medicinally Active Plants* 5(2), 2016, abstract and introduction. | Identifies molokhia with *C. olitorius* and its leaves as a leafy vegetable. Medicinal claims and measurements are not used. |
| **WP03-JUTE-LEAVES-MOLOKHIA-QUEBEC-20261011-S04** | Office québécois de la langue française, [GDT “mélochie”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17486151/melochie), domains, definition, preferred terms, and usage note. | Québec terminology authority lists `mélochie`, `corète`, and `mloukhiya` as preferred terms and `molokhia` as used in some contexts. Its 1994 definition covers several species; it notes `molokhia` can also name a soup. It does not give a species-qualified leaf-product label. |
| **WP03-JUTE-LEAVES-MOLOKHIA-QUEBEC-20261011-S05** | Field & Cattle, [“Corète Potagère - Kplala - Adémé - Molokhia - Lalo - Jute”](https://fieldandcattle.com/products/quebec/ferme-afro-qubec/cor-te-potag-re-kplala-ad-m-molokhia-lalo-jute-vkrmalwk8qy68if0dg4zrmrf), listing for FERME AFRO-QUÉBEC in Repentigny. | Provides current local farm/listing wording for a leafy produce item. Its stacked names do not establish that every name is a safe bilingual alias or identify a particular *Corchorus* species. |
| **WP03-JUTE-LEAVES-MOLOKHIA-QUEBEC-20261011-S06** | Distribution Armel, [“Molokhia hachée 400G”](https://distributionarmel.com/boutique/molokhia-hachee-shahrazad-400g/), title, frozen-vegetable category, and Montréal-area delivery note. | Supports current local use of `molokhia` in a French product listing. It does not establish a general frozen/chopped form, botanical scope, or conversion. |
| **WP03-JUTE-LEAVES-MOLOKHIA-QUEBEC-20261011-S07** | Le Pro 1600, [“Corète potagère molokhia sec – 200 g”](https://lepro1600.com/products/cleopatra-concrete-potagere-molokhia), product title and description. | Supports local French wording `corète potagère` with `molokhia` on a dried-product listing. It is a wording lead, not proof of a universal Québec preferred term or a catalog-wide dried form. |

The earlier integrated scope and alias decisions remain documented in [the WP06 tropical leafy-greens proposal](wp06-tropical-leafy-greens-boundaries-20261009.md) and [its batch record](../batches/wp06-tropical-leafy-greens-identity-20261009/README.md). The broader leafy-vegetable checklist is in [the global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt); this proposal does not edit it.
