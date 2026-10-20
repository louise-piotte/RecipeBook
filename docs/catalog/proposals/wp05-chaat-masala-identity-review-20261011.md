# WP05 Section T — Chaat masala identity review

- **Packet type:** proposal-only regional blend identity, naming, boundary, and recipe-demand review.
- **Prepared and source-access date:** 2026-10-11.
- **Plan:** Section T, open regional spice-blend item: “Garam masala, curry powders, chaat masala, sambar/rasam powders, and panch phoron.”
- **Status:** integrated on 2026-10-11 as one identity-only row; the broader plan item stays open for other blends and unresolved terminology review.
- **Source IDs:** `WP05-CHAAT-MASALA-20261011-S01` through `WP05-CHAAT-MASALA-20261011-S08`; the prefix was checked against the current proposal and research-ledger files and had no prior exact ID collision.

## Recommendation

Treat chaat masala as a named powdered seasoning blend with a product boundary distinct from generic curry powder, garam masala, panch phoron, seasoning salt, and dish-specific masalas. The cited Indian university cookery text describes it as a spice powder sprinkled over snacks and chaat and to enhance tang; it lists it separately from garam masala, Madras curry powder, sambar powder, panch phoran, pani puri masala, and other named blends [S02]. A Bhutan government-hosted small-scale production note describes chaat masala mixes as powdered spice mixtures made in varied combinations and says the typical chaat taste comes with red crystal salt/Lahori namak [S03]. These sources support an identity class, not a universal formula.

Proposed identity fields:

| Field | Proposed value |
|---|---|
| Proposed ID | `ingredient-ref-chaat-masala` |
| Category | `BAKING_AND_SPICE` |
| English display | `chaat masala` |
| English alias | `chaat masala powder` |
| French display | `mélange d’épices chaat masala` |
| French aliases | None |
| Density / unit mappings | None |
| Forms / package yields / recipe links | None |

The French display follows current French-language Canadian grocery listings for the named product [S05, S06]. OQLF has an entry for `garam massala`/`garam masala`, but the exact chaat-masala searches reviewed here did not return a dedicated GDT entry; the retailer wording is product-label evidence, not an OQLF-approved term [S01]. This is enough to propose a clear French label, with independent Québec terminology review still useful before later integration.

Do not create a canonical ingredient list, proportion, salt type, acidity level, or heat rating. Sources differ: the university recipe includes mango powder, dried pomegranate, salt, and black salt, while one current manufacturer declaration lists common salt, chilies, paprika, coriander, cinnamon, dried mango, citric acid, sugar, carriers, and other spices [S02, S04]. A Canadian spice merchant's named product instead lists kala namak, amchur, anardana, mint, ajowan, and other spices [S07]. Those are product-specific examples, not required ingredients for every chaat masala.

## Repository audit and recipe demand

Snapshot before this integration, read on 2026-10-11: the bundled catalog contained **1,036 active references** and **72 forms**; the legacy candidate file contained **75 candidates**; the research ledger contained **1,328 records**; and the manifest listed **114 recipes / 1,123 ingredient rows**. The eight proposed source IDs were checked again against the current ledger before insertion.

The normalized collision audit checked candidate English and French labels and spelling variants against active reference names and aliases, form labels and match terms, and legacy candidate names and aliases. It found **no exact collision** for `chaat masala`, `chaat masala powder`, or `mélange d’épices chaat masala`. No form mentions chaat masala. The active neighboring identities are separate rows: `ingredient-ref-curry-powder` (`curry powder / poudre de cari`), `ingredient-ref-garam-masala` (`garam masala / garam masala`), `ingredient-ref-panch-phoron` (`panch phoron / panch phoron`, English alias `panch phoran`), `ingredient-ref-five-spice-powder` (`five-spice powder / cinq épices chinoises`), and `ingredient-ref-seasoning-salt` (`seasoning salt / sel aux épices`). The active reference catalog also has a distinct Colombo-powder row. None is a duplicate chaat-masala identity.

There is no chaat-masala or chat-masala legacy candidate and no exact chaat-masala ledger record. The held ledger candidate `candidate-nihari-masala` remains `needs_clarification`: one recipe-specific mixture does not establish a universal product or a crosswalk to garam masala. The [WP06 South Asian review](wp06-south-asian-cuisine-gap-sweep-20261010.md) records the same boundary. The accepted `ingredient-ref-panch-phoron` ledger decision keeps that Bengali/Eastern Indian blend separate from garam masala and Chinese five-spice and rejects broad `five spice` aliasing; the [WP06 East Asian review](wp06-east-asia-cuisine-gap-sweep-20261011.md) also keeps the promoted Chinese five-spice row distinct from panch phoron and garam masala. The earlier [WP06 South Asian](wp06-south-asian-cuisine-gap-sweep-20261010.md) and [East Asian](wp06-east-asia-cuisine-gap-sweep-20261011.md) proposals address these neighboring blends but contain no dedicated chaat-masala proposal. The [WP05 seasoning-salt review](wp05-seasoning-salt-mixture-boundary-review-20261011.md) likewise keeps its generic salted blend separate.

The exact phrase scan covered all 114 manifest-listed recipe files and 1,123 ingredient rows, checking original ingredient text, ingredient name, preparation, notes, and linked reference IDs. It found **zero** chaat-masala, chat-masala, or chaat-masala-powder ingredient lines, including French search variants. No recipe link is proposed.

| Related recipe evidence | Exact ingredient demand | Disposition |
|---|---|---|
| Recipe 086, *Butter Chicken* / *Poulet au beurre* | `2 tsp curry powder` → `ingredient-ref-curry-powder`; `2 tsp garam masala` → `ingredient-ref-garam-masala`. | Two separate existing blend requests; neither line is chaat masala. |
| Recipe 048, *Garam Masala*; recipe 083, *Curry Powder* | Ingredient rows list component spices rather than a chaat-masala line. | Recipe titles and their ingredient lists do not create a request for the proposed chaat-masala identity. |
| All other bundled rows | No exact chaat-masala spelling or translation found. | No new recipe link or ingredient-line edit. |

The zero-hit result is a bounded text audit, not evidence that the wider library will never need this ingredient. Any future recipe link should start from an exact source line and preserve its requested product wording.

## Blend boundary and alias limits

| Neighbor | Evidence-backed distinction | Catalog treatment |
|---|---|---|
| Generic curry powder | The current seed has a broad `curry powder / poudre de cari` identity. The university source lists Madras curry powder as its own regional blend and separately describes chaat masala as a snack/chaat seasoning that enhances tang [S02]. | Keep separate. Do not alias `curry powder`, `curry masala`, or `Indian curry seasoning` to chaat masala. The active curry-powder row is not an alias or substitute. |
| Garam masala | OQLF describes garam massala/masala as an aromatic ground-spice blend and provides separate French and English forms; the university text describes a warm-spice blend and separately names chaat masala [S01, S02]. | Keep separate from active `ingredient-ref-garam-masala`. Do not alias `garam masala`, `garam massala`, or `warm spice mix`. |
| Panch phoron | The accepted ledger decision for `ingredient-ref-panch-phoron` identifies a Bengali/Eastern Indian seed-spice compound, with the spelling alias `panch phoran`; it remains separate from garam masala and Chinese five-spice. The university text also presents panch phoran separately from chaat masala [S02]. | Keep separate from active `ingredient-ref-panch-phoron`. Do not add `five spice`, `Indian five spice`, or `panch phoran` as chaat aliases. |
| Sambar/rasam, pani puri, fruit chaat, pav bhaji, chole, tandoori, and other dish- or region-named blends | The university text names several separately rather than treating `masala` as one generic mixture [S02]. Shan's French product family also lists fruit chaat masala as a distinct product name alongside chaat-masala product references [S04]. | Do not alias these specialized blends to generic chaat masala. Keep sambar/rasam powders and other plan items open for their own source and Québec naming reviews. |
| Seasoning salt | The active broad `seasoning salt / sel aux épices` row is a salt-based seasoning class. Chaat masala may contain salt, but the cited chaat products are specifically named spice blends and their salt types and ingredients vary [S02–S07]. | Keep separate from `ingredient-ref-seasoning-salt`, garlic salt, plain salt, and salt variants. Salt content does not make a chaat blend a seasoning-salt synonym. |
| Kala namak / black salt, amchur, anardana, and other components | These can appear in particular chaat-masala formulas; other named products use ordinary salt or a different set of spices [S02–S04, S07]. | Keep each component as its own ingredient. Never alias a component to the compound blend, and do not require any one component in every chaat masala. |
| Nihari masala and broad `masala` | The existing nihari candidate remains held because its source gives one recipe-specific mixture; the [WP06 South Asian review](wp06-south-asian-cuisine-gap-sweep-20261010.md) documents why it does not define a universal product. The unqualified word `masala` does not identify a stable product. | Keep the held nihari candidate and all other named blends distinct. Do not add bare `masala`, `Indian spice blend`, or `Indian seasoning` aliases. |

### Alias disposition

- **Accept as English alias:** `chaat masala powder`, directly attested as a name for the same powder identity in the university cookery source [S02].
- **Do not add:** `chat masala`. A Canadian marketplace title shortens the name to “Chat,” but the listing's own product description uses “Chaat Masala”; this is not sufficient independent evidence for a stable spelling alias [S08].
- **Do not add:** `fruit chaat masala`, `pani puri masala`, `chaat seasoning`, `Indian seasoning`, `curry masala`, `curry powder`, `garam masala`, `panch phoran`, `black salt`, `kala namak`, `amchur`, `anardana`, or generic `masala`.
- **French:** display `mélange d’épices chaat masala` is supported by Canadian French listings; no French aliases are proposed. Keep the source term `chaat masala` intact in the display and do not generalize `mélange d’épices` as an alias.

## Source-to-claim map

Sources below were accessed or rechecked on 2026-10-11. Product pages support their own names and declarations only; none is treated as a universal formula.

| ID | Source | Supports and limits |
|---|---|---|
| **WP05-CHAAT-MASALA-20261011-S01** | Office québécois de la langue française, [garam massala (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502426/garam-massala). | Gives French preferred terms `garam massala` and `garam masala`, corresponding English terms, and defines this neighboring product as a ground-spice mixture. Supports the Québec borrowed-term pattern and distinction for garam masala only; it does not define chaat masala. Exact OQLF searches for chaat masala/chaat in this review did not yield a dedicated chaat-masala GDT record; that search absence is not itself a term ruling. |
| **WP05-CHAAT-MASALA-20261011-S02** | Uttarakhand Open University, *Introduction to Indian Cookery*, BHM-401T, [course PDF](https://www.uou.ac.in/sites/default/files/slm/BHM-401T.pdf), “Various Masala Mixes,” pp. 37–41 in the PDF. | Calls chaat masala powder a snack/chaat seasoning that enhances tang, gives two source-specific Delhi-style recipes, and lists garam masala, Madras curry powder, panch phoran, sambar powder, pani puri masala, and other named blends separately. Supports the named identity, use boundary, and English alias `chaat masala powder`; its recipes are examples, not a canonical formula. |
| **WP05-CHAAT-MASALA-20261011-S03** | Bhutan Ministry of Industry, Commerce and Employment, [*Chaat Masalas (Tiny Scale for Women SHG)*](https://www.moice.gov.bt/wp-content/uploads/2020/07/Chaat-Masala.pdf), introductory section. | Says chaat-masala mixes are powdered spice mixtures made in varied combinations and associates typical chaat taste with red crystal/Lahori salt. This small-scale production document is not a statutory standard and does not establish that every blend contains that salt. |
| **WP05-CHAAT-MASALA-20261011-S04** | Shan Foods, [Chaat Masala — French-language page](https://www.shanfoods.com/fr/product/accompaniments-fr/chaat-fr/chaat-masala/) and [English-language page](https://www.shanfoods.com/product/accompaniments/chaat/chaat-masala/). | Both manufacturer pages retain the name `Chaat Masala`; the English page describes its own SKU as a tangy seasoning mix and lists salt, chili, paprika, coriander, cinnamon, ginger, cumin, dried mango, citric acid, and other ingredients. Supports the borrowed product name and one paired bilingual presentation; the French copy and formula are not treated as preferred Québec terminology or universal composition. |
| **WP05-CHAAT-MASALA-20261011-S05** | Maxi, [French South Asian grocery listings](https://www.maxi.ca/fr/clpplp/food/international-foods/south-asian-foods/c/58045?page=4). | Current French-language grocery results use `Mélange d’épices Chaat Masala` for a Shan product. Supports Québec-facing descriptive wording and retail availability, not an official terminology ruling or recipe. |
| **WP05-CHAAT-MASALA-20261011-S06** | Loblaws, [French grocery search results for chaat masala seasoning mix](https://www.loblaws.ca/fr/search?search-bar=chaat+masala+seasoning+mix). | Uses `Mélange d’épices Chaat Masala` for a Shan product in French-language Canadian retail. This is within the same retailer group as Maxi and is corroborating label usage, not independent language-authority evidence. |
| **WP05-CHAAT-MASALA-20261011-S07** | The Silk Road Spice Merchant, [Chaat Masala](https://silkroadspices.ca/collections/spice-blends/products/chaat-masala). | Canadian spice merchant describes its own blend as tangy/savory and lists amchur, anardana, cumin, black pepper, kala namak, sea salt, ajowan, mint, chiles, and asafoetida. Supports another product-specific example and formulation variation, not required ingredients. |
| **WP05-CHAAT-MASALA-20261011-S08** | Walmart Canada, [Kasturi Chat Masala 200 g marketplace listing](https://www.walmart.ca/fr/ip/Kasturi-Chat-Masala-200-g-7-oz-M-lange-d-pices-Indien-Assaisonnement-d-pices-Tout-Naturel-V-gane-non-OGM/2KHLQRMIG4PK). | Marketplace title uses `Chat Masala`; its description calls the product `Chaat Masala`. Supports recording a retailer spelling variation but is not enough to activate `chat masala` as a global alias or preferred display. |

## Disposition and limits

Recommend one identity-only row with the fields above. Keep Section T's wider regional-blend checklist open. The corpus has no exact chaat-masala ingredient demand, and this proposal adds no recipe link, form, quantity, density, mapping, yield, conversion, or substitution. Do not infer product composition, salt kind, pungency, acidity, or a universal preparation from any one source. Preserve named regional and dish-specific blends as separate identities or held candidates until each has its own evidence and Québec display review.

**Encoding:** UTF-8 without BOM; French accents and punctuation are preserved as Unicode text.
