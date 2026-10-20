# WP04 Section P — Guinean dried-pagne picker hold (R365, 2026-10-16)

## Review record

- **Status:** Integrated as a documentation-only hold on 2026-10-16; see the [proposal](../../proposals/wp04-section-p-next-gap-review-r365-20261016.md).
- **Selected boundary:** Keep the GuineaSea Guinean dried-pagne product outside active references, forms, legacy mappings, and the shared ledger until product-specific identity evidence resolves its scope.
- **Recommendation:** Do not attach `pagne` to generic clam or cockle, assign the product to *Senilia senilis*, or create a general dried-clam identity from one unspecified SKU.
- **Scope:** The unresolved generic clam and cockle candidates remain unchanged. No catalog JSON, legacy mapping, research-ledger record, form, measurement, recipe link, conversion, yield, or substitution was added.

## Evidence and decision

GuineaSea's English and French pages describe one 200 g Canadian retail listing as sun-dried shellfish and use `dried clams / pagne` and `pagnes séchés / palourdes séchées`. The pages do not provide a scientific name or full ingredient declaration; the product listing was shown as sold out in the reviewed snapshot, which does not establish current inventory. These seller-specific names do not resolve the product's taxon or a Québec-wide name.

Two independent Senegalese research sources associate local `pagne` with *Senilia senilis*: a participatory shellfisheries assessment maps it to “Arches/Bloody cockle,” and an IRD Éditions account describes the Sine-Saloum species as locally known as `pagne`. The European Commission's commercial-name listing supports the species classification and records French `arche` in France. These sources establish a regional species-name relationship, but none identifies the GuineaSea SKU. A Guinean coastal inventory documents *S. senilis* as an edible bivalve but does not connect it to this product. Do not infer that connection.

OQLF's Québec mollusc entries are species-scoped, and MAPAQ's local shellfish descriptions do not name `pagne` or document dried clams. CFIA's fish-product labeling guidance treats condition terms such as dried as descriptors of product state; it does not create a generic ingredient identity or support a conversion. The bounded hold preserves these distinctions while the broad clam and cockle candidates remain unresolved.

## Picker and recipe impact

- Current `pagne` search falls back to two substring matches because the French terms for scarlet runner beans and Spanish onion contain `d'Espagne`. An exact `pagne` identity would outrank those matches, but the current listing does not resolve the product identity.
- No active result owns `pagnes séchés`, `pagne séché`, `dried clams`, or `palourdes séchées`. Activating this one unspecified SKU under broad clam wording would imply more coverage than the evidence supports.
- The 114 manifest-listed recipes and 1,123 ingredient rows contain no matching `pagne`, clam, cockle, *Senilia senilis*, or dried-shellfish request. No recipe link, measure, conversion, rehydration yield, or substitution is supported.

## Sources

- GuineaSea, [Wild-Caught Dried Clams from Guinea (pagne)](https://guineasea.com/products/wild-caught-dried-clams-from-guinea-200g) and [Pagnes Séchés Sauvages de la Guinée](https://guineasea.com/fr/products/wild-caught-dried-clams-from-guinea-200g).
- Wélé et al., University of Rhode Island / University of Cape Coast Coastal Resources Center, [Participatory Assessment of Shellfisheries in Senegal](https://www.crc.uri.edu/download/WSFS2021-Senegal-Report-FIN508.pdf), prepared for USAID (2021), tables 2 and 5.
- Thomas and Diouf, IRD Éditions, [L'exploitation artisanale des coquillages au Sénégal](https://www.editions.ird.fr/open_access_download/1602/1005), pp. 77–78.
- European Commission, [Commercial designation for *Senilia senilis*](https://fish-commercial-names.ec.europa.eu/fish-names/species/senilia-senilis_en).
- Doumbouya, [Inventory of edible molluscs on the Guinean coastline](https://www.tropentag.de/2010/proceedings/node450.html), Tropentag (2010).
- CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish).
- Gouvernement du Québec, [Transformation des produits marins](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/transformation-produits-marins).
- OQLF, [palourde américaine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198879/palourde-americaine) and [mye](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198878/mye).

## Validation

- Rechecked the bilingual seller listing and its limits, the Senegalese regional name/taxon evidence, and the Québec and CFIA terminology boundaries.
- Confirmed the current picker logic makes `pagne` a substring fallback and that no recipe or catalog row requests this product.
- This documentation-only decision changed no database JSON or runtime code; no software tests or emulator checks were needed.
