# WP04 Section P — mussels in brine product identity review (R197)

- **Review and online source access:** 2026-10-16.
- **Recommendation:** Add one identity-only `PROTEIN` reference for **mussels in brine / moules en saumure**, with no aliases or forms.
- **Scope:** Mussel products whose market description explicitly identifies brine. The reference does not assign a mussel species, a particular can/jar or storage state, readiness, recipe formula, drained quantity, or universal product format.
- **Status:** Integrated as an identity-only reference and research-ledger record; see the R197 batch README. No software tests were run for this database-JSON-only change.

## Open item and review boundary

The WP04 Section P checklist still leaves the parent item for smoked, salt-cured, dried, canned, oil-packed, water-packed, and fermented fish/seafood open. R194 resolved one separate packed product, canned mussels in escabeche. This packet reviews the brine-described product group only; it does not repeat the generic mussel, smoked-mussel, Sardo marinated-mussel, or escabeche decisions.

The neighboring decisions retain distinct scopes:

- `ingredient-ref-blue-mussel` is the species-scoped *Mytilus edulis* identity; `ingredient-ref-mediterranean-mussel` is *M. galloprovincialis*; `ingredient-ref-green-lipped-mussel` is *Perna canaliculus*.
- `ingredient-ref-smoked-mussels` is a smoke-described finished-product group.
- `ingredient-ref-mussels-in-escabeche` is a packed product group described with escabeche.
- The Sardo herb-and-garlic marinated SKU was held separately in R46 because species and quantity basis were unresolved.
- `ingredient-ref-mussel` remains the ledger-only unresolved candidate for an unqualified mussel request. Do not transfer or resolve that candidate through this product reference.

The completed preserved-fish product-state review keeps universal `canned`, `smoked`, `salted`, `dried`, `oil-packed`, and `water-packed` forms inactive, while allowing review of specific product requests. The proposed row follows that boundary: it is a named market product group, not a global form on any mussel species.

## Market identity, French display, and limits

Two current Canadian retailer catalogs use the exact English product wording **Mussels in Brine**. Food Basics lists Cedar Phoenicia Mussels in Brine, 111 g, with ingredients mussels, water, and salt; its page placed the item in the Canned & Jarred / Fish & Seafood hierarchy but reported it unavailable at the selected grocery when reviewed. Good Cheese’s Toronto conservas listing shows **La Narval Premium Mussels in Brine 111g**. Its listing was searchable with a price and “Add to basket” control; the product collection page itself returned a cache miss in the page reader, so current SKU stock could not be confirmed. Good Cheese’s current shipping page identifies its Toronto storefront and says it ships across Canada. These are two differently branded Canadian catalog examples, not evidence of a particular species or universal formulation. [S01–S03]

Québec terminology has a direct product-format source. MAPAQ’s current-hosted mollusc factsheet identifies its table as **chair de moule cuite** and then lists **en saumure** separately from **en conserve** and **fumée**. The source’s French label therefore supports the display **moules en saumure** for a brined mussel-meat product. It is a Québec producer-format guide (publication 09-0018; no publication date shown), not proof that every retail SKU is local blue mussel or that all formats remain in current production. [reused R159 S01]

The OQLF’s GDT entry gives *en saumure* as a preferred French term for English *in brine* and cautions that English *in-brine* can also describe molluscs cooked in their own juices; French wording should follow the product’s exact preparation. The separate OQLF entry updated in 2024 defines *saumurage* as preserving and/or seasoning food by maceration in a saline solution. Food Basics’ listed ingredients include water and salt, and MAPAQ uses *en saumure* for cooked mussel meat. Together these support the selected French display for this explicitly brine-described group without extending it to products labelled only “natural,” “plain,” or cooked in their own juices. [S04–S05]

Statistics Canada’s NAPCS Canada 2022 examples classify **mussels in brine (except canned)** under cured fish, shellfish, and crustaceans; its French counterpart uses **moules en saumure (sauf en conserve)**. These current national product-classification pages show that Canada recognizes a specific brined-mussel category and keeps the non-canned class distinct from canned seafood. They are taxonomy evidence rather than a retail naming standard. Retail examples sit in canned/conservas catalog contexts, while MAPAQ also describes bulk cooked mussel meat in brine; the identity should therefore capture the explicit brine descriptor without silently equating it with a can, shelf stability, or one package class. CFIA likewise treats product form/style, packing medium, and condition as separate descriptors. [S06–S07; reused R159 S07]

Keep these boundaries:

- **Species:** Do not attach the product group to blue, Mediterranean, green-lipped, or generic mussel. The Canadian retailer pages do not establish species; MAPAQ’s blue-mussel table is regional format evidence only.
- **Other preparations:** Keep smoked mussels, mussels in escabeche, and Sardo’s herb-and-garlic marinated mussels separate. “In brine” does not imply smoke, escabeche, oil, vinegar, or a marinade formula.
- **Packaging and storage:** Do not make `canned`, `jarred`, `tinned`, `shelf-stable`, or “ready to eat” an alias or a defining property. Retail aisle/collection placement and the product descriptor do not establish the package treatment or storage conditions for every item in the group. The MAPAQ format table and NAPCS classifications explicitly distinguish brine from canning.
- **French preparation distinction:** Do not map `au naturel` or an unqualified “plain” mussel product to `moules en saumure`. OQLF cautions that English `in-brine` may denote either product cooked in its own juices or product presented in light brine; use `en saumure` only when the actual product preparation supports it.

## Ownership and archive audit

The live snapshot read for this proposal contains **1,574 active references**, **122 forms**, **61 legacy candidates**, and **1,919 ledger records / 8,281 source entries / 7,064 distinct source IDs / 5,854 distinct URLs**. The manifest contains **114 recipes and 1,123 structured ingredient rows**.

Normalized exact-key checks across active reference IDs, names, and aliases; form IDs, labels, and match terms; legacy candidate IDs, names, and aliases; and ledger record IDs found no owner for:

- `mussels in brine`, `mussel in brine`, `brined mussels`, or `brined mussel`;
- `moules en saumure`, `moule en saumure`, or the corresponding brined-mussel product identity;
- the proposed reference ID `ingredient-ref-mussels-in-brine`.

There is no active mussel form. The exact new reference ID and the `WP04-SECTIONP-MUSSELS-BRINE-R197-20261016` source-ID prefix were absent from the live files and the proposal/batch archive. Focused archive searches found only incidental references to brined mussels while discussing other boundaries; no previous proposal or batch has allocated or specifically decided this product group. R195 and R196 proposals belong to WP02; neither claims this WP04 prefix.

| Existing owner | Current ownership and effect |
|---|---|
| `ingredient-ref-blue-mussel` | Active *Mytilus edulis* identity with species-qualified names and aliases. No brine identity or brined form is attached. |
| `ingredient-ref-mediterranean-mussel` | Active *Mytilus galloprovincialis* identity. No brine identity or brined form is attached. |
| `ingredient-ref-green-lipped-mussel` | Active *Perna canaliculus* identity. No brine identity or brined form is attached. |
| `ingredient-ref-smoked-mussels` | Active smoked-product group. Its source and decision do not assign a brined product. |
| `ingredient-ref-mussels-in-escabeche` | Active escabeche product group, distinct from plain brine. It has no brine alias. |
| `ingredient-ref-mussel` | Ledger-only candidate with `identityState: needs_clarification`; prior decisions preserve unqualified mussel wording as unresolved. Keep unchanged. |
| Legacy identities and attached forms | No exact brined-mussel owner was found among the 61 legacy candidates or 122 forms. No mussel form exists. |
| R46, R159, and R194 archives | Sardo herb/garlic marinade, smoked mussels, and canned escabeche were reviewed separately. None owns the exact brine phrase or the proposed reference ID. |

The proposed new retail, OQLF, and Statistics Canada URLs had no exact ledger URL owner at the audit snapshot. The MAPAQ factsheet is already registered as `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S01`; reuse that same source ID and URL with a brine-specific locator rather than creating another source ID for the URL. CFIA’s general labelling page is already registered as `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07`; reuse it to retain the descriptor-boundary evidence. Both reused IDs are identified explicitly in the source register.

## Picker projection

The static projection follows the live [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): case, accent, and punctuation normalization; complete word-phrase matching first; substring fallback only when no phrase match exists. The proposed row contains only the bilingual display names, no aliases, and no forms.

| Query | Before | With proposed row |
|---|---|---|
| `mussels in brine` | No result | `mussels in brine / moules en saumure` |
| `moules en saumure` | No result | `mussels in brine / moules en saumure` |
| `mussel in brine`; `moule en saumure` | No result | No result; no singular aliases are proposed because current product listings use the plural name |
| `brine`; `saumure` | No result | The proposed product group |
| `mussels`; `moules` | Blue mussel, Mediterranean mussel, smoked mussels, canned mussels in escabeche | Those four plus the brined product; broad plural searches remain multi-result |
| `mussel`; `moule` | Blue mussel, green-lipped mussel, Mediterranean mussel | Unchanged; complete singular species terms win before fallback |
| `canned mussels in brine` | No result | No result, because neither display name nor source-backed alias includes `canned` |
| Species-qualified, smoked, and escabeche phrases | Their current corresponding references | Unchanged |

Do not add a `canned` alias just to widen the search: the sources do not establish canning as part of every brined product, and NAPCS expressly separates its non-canned brined category. Reopen alias coverage if a Canadian or Québec label consistently names this group as `canned mussels in brine` and users need that complete phrase searchable without making canning a universal property.

## Recipe-corpus demand

The manifest-ordered scan read all **114 recipe files / 1,123 structured ingredient rows**. It searched row values and complete recipe JSON strings for the English and French brine phrases, `mussels in brine`, `brined mussel(s)`, `moules en saumure`, `moule en saumure`, and mussel/moule ingredient requests. It found **zero matching ingredient rows** and no recipe text requesting brined or packed mussels. Other French `moule(s)` occurrences in full recipe text refer to baking pans; they are not shellfish ingredient lines. No recipe link is proposed.

## Numbers, mappings, and substitutions

Sources show only SKU- or source-specific product formats:

- Food Basics lists one Cedar Phoenicia package at **111 g**; Good Cheese lists one La Narval package at **111 g**. Neither listing supplies a drained basis, edible yield, serving size, or number of mussels.
- MAPAQ lists **2.27 kg** for cooked mussel meat in brine in a Québec producer-format table. It is a bulk product format, not a recipe amount or drained-weight conversion. The same table lists 120 g for a separate canned format; that package figure does not define brined-meat yield.
- The Canadian classification pages supply no quantity relation. CFIA’s net-quantity guidance distinguishes weight declarations from drained weight; none of the reviewed source pages gives a cross-product drained amount.

Use `defaultDensity: null` and `unitMappings: []`. Add no unit mapping, package conversion, drained yield, edible yield, portion estimate, count-to-mass relation, preparation conversion, or `IngredientForm`. Add no global or contextual substitution and no recipe-line substitution links. There is no matched recipe role or method and no source-backed amount for replacing this product with fresh, frozen, smoked, escabeche, or species-specific mussels.

## Proposed mapping if accepted

Add one entry to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-mussels-in-brine",
  "nameEn": "mussels in brine",
  "nameFr": "moules en saumure",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "PROTEIN"
}
```

Add one `ingredient_reference` ledger record with the same `recordId`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Link only the new source IDs below plus the two explicitly reused R159 sources. Keep `measurementObservations` and `substitutionFindings` empty. Add one `accepted` decision scoped to the market-described brined product group; state that species, canning, storage/readiness, exact ingredients, net/drained quantity, and recipe substitutions remain product-specific. Do not add a legacy candidate or mapping, forms, recipe links, conversions, or active numeric data. Leave `ingredient-ref-mussel` unchanged.

## Source register

Sources were opened or checked in current search results on 2026-10-16. Each source ID below resolves to exactly one URL. New R197 IDs are proposal-local until integration; reused R159 IDs retain their existing exact URLs.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-MUSSELS-BRINE-R197-20261016-S01** | Food Basics, [Cedar Phoenicia Mussels in Brine](https://www.foodbasics.ca/aisles/pantry/canned-jarred/fish-seafood/mussels-in-brine/p/062356549510), product title, item number `062356549510`, 111 g format, ingredients, and aisle path. | Current Canadian retailer listing uses the exact English name and declares mussels, water, and salt. It reported the SKU unavailable at the selected grocery during the review. Its aisle path is not proof of sterilization, shelf stability, or drained weight. |
| **WP04-SECTIONP-MUSSELS-BRINE-R197-20261016-S02** | Good Cheese, [Conservas collection, page 10](https://goodcheese.ca/collections/all/conservas?page=10), La Narval product listing. | Current indexed Toronto-retailer listing uses “La Narval Premium Mussels in Brine 111g” and showed a price and “Add to basket” control. The page reader returned a cache miss, so this supports retail naming/catalog placement but not a verified in-stock state or product ingredient declaration. |
| **WP04-SECTIONP-MUSSELS-BRINE-R197-20261016-S03** | Good Cheese, [Shipping & Pick-up](https://goodcheese.ca/pages/shipping-pick-up), current storefront and delivery information. | Identifies the retailer’s Toronto location and Canada-wide shipping. It does not establish availability of the particular La Narval SKU. |
| **Reused `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S01`** | MAPAQ, [Les mollusques du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf), blue-mussel factsheet, page 1, cooked-mussel-meat format table. | Lists `En saumure — 2,27 kg`, separately from `En conserve — 120 g` and `Fumée — Formats variés`. Supports a Québec French product-format phrase and category separation. It is publication 09-0018 with no date shown and does not describe every current retail SKU or supply a reusable measure. |
| **WP04-SECTIONP-MUSSELS-BRINE-R197-20261016-S04** | OQLF, [GDT: saumuré](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488287/saumure), preferred terms and note on exact preparation. | Gives `saumuré / en saumure` for English `in brine`. Its note cautions that English `in-brine` may refer either to food cooked in its own juices or to food presented in a light brine, so French wording must follow the preparation. The term entry is older (1983); it does not name mussels as a full market product. |
| **WP04-SECTIONP-MUSSELS-BRINE-R197-20261016-S05** | OQLF, [GDT: saumurage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8887308/saumurage), definition and food examples. | Updated in 2024; defines brining as a preservation and/or seasoning process in a saline solution and says it can apply to fish and other foods. Supports the Québec process term, not a universal ingredient list, salinity, storage state, or cooking method. |
| **WP04-SECTIONP-MUSSELS-BRINE-R197-20261016-S06** | Statistics Canada, [NAPCS Canada 2022: Cured fish, shellfish and crustaceans](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=4&CPV=1711131&CST=17022022&CVD=1386659&Function=getVD&MLV=4&TVD=1384502), examples, modified 2026-01-08. | Gives “mussels in brine (except canned)” under cured fish, shellfish, and crustaceans. Supports a recognized Canadian product-class boundary; it is not a consumer-label or recipe standard. |
| **WP04-SECTIONP-MUSSELS-BRINE-R197-20261016-S07** | Statistics Canada, [SCPAN Canada 2022, en français: poissons, mollusques et crustacés salaisonnés](https://www23.statcan.gc.ca/imdb/p3VD_f.pl?CLV=5&CPV=17111310&CST=17022022&CVD=1582206&Function=getAllExample&MLV=5&TVD=1582195&V=487859&VST=17022022), product examples. | Lists `moules en saumure (sauf en conserve)` in the French classification. Supports the French label and the non-canned classification boundary; it is not a retail naming standard. The indexed page reported a 2026-02-09 modification date; its direct page reader returned a cache miss. |
| **Reused `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07`** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), sections on true-nature descriptors and net quantity. | Treats form/style, packing medium, and condition as distinct descriptors and distinguishes weight from drained-weight statements. Supports keeping product state and quantity basis separate; it is not a brined-mussel recipe or product-name source. |

## Reopen conditions

Revisit the name if Québec retailers or manufacturers use a different stable French product phrase, or if a current Canadian product label shows that this English phrase routinely refers to a preparation that should be called *au naturel* rather than *en saumure*. Reassess the packaging boundary only if multiple labels show that “canned” is essential to the target group and Canadian/Québec terminology supports a precise French equivalent. Add any package, drained-weight, density, or count mapping only with a source that supplies the same quantity basis and preparation state. Reopen recipe linking or substitution only when a bundled or user recipe names the product and gives a usable method and amount.

**Disposition:** Recommend one identity-only `mussels in brine / moules en saumure` product reference. Preserve all mussel species, smoked mussels, escabeche, the held Sardo product, and generic `mussel / moule` boundaries; add no aliases, forms, numeric behavior, recipe links, or substitutions.

## Root integration decision

**Accepted and integrated** as identity-only `mussels in brine / moules en saumure`, category `PROTEIN`, with aliases, forms, measurement observations, and substitution findings empty. The display captures the explicitly brine-described product group without assigning a mussel species, canning state, storage/readiness, or drained quantity. Seven new source records and two reused R159 sources support the boundary; the generic unresolved mussel candidate and the escabeche, smoked, and species-scoped references remain unchanged. No recipe demand was found.
