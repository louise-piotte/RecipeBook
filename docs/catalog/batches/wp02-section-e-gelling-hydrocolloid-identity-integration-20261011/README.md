# WP02 Section E gelling-agent and hydrocolloid identity integration

Integrated 2026-10-11. This batch adds source-backed ingredient and presentation identities to the
bundled catalog and records the evidence in the research ledger. The global plan calls for broad
catalog coverage without an arbitrary reference cap and permits identities whose measurements or
substitutions remain unknown. Therefore, absence from the current recipe bundle is not by itself a
reason to defer a well-established ingredient identity. The earlier demand-only deferral in the
[gelling-agent review](../../proposals/wp02-gelling-agents-coordinator-review-20261009.md) and
[hydrocolloid review](../../proposals/wp02-hydrocolloids-coordinator-review-20261009.md) is
superseded for the bounded identities below; their limits on unsupported product equivalence remain.

## Catalog changes

Added 22 identity-only references:

- Gums and cellulose products: acacia gum, gellan gum, guar gum, locust bean gum, methylcellulose,
  sodium carboxymethyl cellulose, and xanthan gum.
- Seaweed-derived gelling agents: agar, generic carrageenan, kappa carrageenan, iota carrageenan,
  lambda carrageenan, and sodium alginate.
- Pectins: generic pectin, high-methoxyl pectin, low-methoxyl pectin, amidated low-methoxyl pectin,
  and the source-named product Pectin NH Nappage.
- Psyllium husk and the distinct salts calcium chloride, calcium gluconate, and calcium lactate.

Added five presentation forms: agar flakes, agar powder, gelatin powder, gelatin sheets, and
psyllium husk powder. No source supports assigning recipe 056's three existing 5 g gelatin lines
to either gelatin presentation. They remain unqualified: no Bloom strength, gelatin type, brand,
mass-to-volume conversion, or form-specific recipe link was inferred.

All new reference densities and unit-mapping lists are empty. Forms have no density defaults or
conversion mappings. The bundle's 114 recipes were not changed and no recipe line was linked to the
new references or forms. No active conversion or contextual substitution rule was added.

The ledger records one supported alternative from Bon Appétit's *Gluten-Free No-Knead Oat Chia
Bread*: the article says 15 g psyllium husk powder can replace the recipe's 1½ tsp xanthan gum. It
does not give the xanthan mass. This is recorded as a single formula-specific finding, not a ratio,
general gluten-free baking substitution, or runtime rule.

“Low-sugar pectin” remains unresolved as a generic label because pectin performance and product
composition vary. The source-named NH Nappage product and HM/LM/LMA classes do not establish a
universal dose, formula, or gelatin replacement. The listed calcium salts remain separate
identities; their regulatory entries do not imply a general culinary use or measurement.

## Evidence

The ledger contains 21 stable source IDs, `WP02-E-HYDRO-20261011-S01` through `S21`, across the
22 new reference records and five form records. Sources establish names and identity boundaries,
not household quantities or broad product equivalence:

- [Health Canada's English permitted gelling/stabilizing-agent list](https://www.canada.ca/en/health-canada/services/food-nutrition/food-safety/food-additives/lists-permitted/4-emulsifying-gelling-stabilizing-thickening-agents.html)
  and [French list](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/salubrite-aliments/additifs-alimentaires/listes-autorises/4-agents-emulsifiants-gelifiants-stabilisants-epaissisants.html)
  establish Canadian additive names and category-specific conditions. The separate [firming-agent
  lists in English](https://www.canada.ca/en/health-canada/services/food-nutrition/food-safety/food-additives/lists-permitted/6-firming-agents.html)
  and [French](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/salubrite-aliments/additifs-alimentaires/listes-autorises/6-agents-raffermissants.html)
  name calcium chloride, calcium gluconate, and calcium lactate.
- OQLF's terminology entries cover [agar-agar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086281/agar-agar),
  [pectin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8476811/pectine),
  [carrageenan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354695/carraghenine),
  [xanthan gum](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086171/gomme-de-xanthane),
  [guar gum](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359487/gomme-de-guar),
  [locust bean gum](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086316/gomme-de-caroube),
  [sodium alginate](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086077/alginate-de-sodium),
  and [carboxymethylcellulose](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18495355/carboxymethylcellulose).
  Independent Québec review of the new French displays remains open.
- Health Canada's [dietary-fibre list](https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-dietary-fibres-reviewed-accepted-food-directorate.html)
  supports the psyllium husk boundary. CFIA's [permitted additive synonyms](https://inspection.canada.ca/en/food-labels/labelling/industry/food-additives/permitted-synonyms)
  supports selected label aliases. USDA's [agar handling report](https://www.ams.usda.gov/sites/default/files/media/2026-LimitedScopeTechnicalReport-AgarAgar-Handling.pdf)
  lists powder and kanten flakes; the [GME gelatin monograph](https://www.gelatine.org/fileadmin/user_upload/gme_content/GME_Statements/GME_Gelatine_Monograph_August_2023.pdf)
  documents gelatin granules, powder, and leaves/sheets.
- FAO discusses kappa, iota, and lambda carrageenan in its [technical resource](https://www.fao.org/4/ab728e/AB728E09.htm).
  Louis François' [pectin overview](https://louisfrancois.com/les-pectines/) distinguishes HM, LM,
  LMA, and particular NH products; product-specific performance is not generalized here.
- The external recipe finding is from [Bon Appétit's oat-chia bread](https://www.bonappetit.com/recipe/gluten-free-no-knead-oat-chia-bread).

## Validation snapshot

- 1,072 ingredient references, 77 forms, 114 recipes, and 1,123 recipe ingredient rows.
- 1,369 ledger records, 4,511 source entries, and 3,690 distinct source IDs.
- No new reference ID occurs in a bundled recipe or active substitution JSON file.
- Full package validation passed; the generated Kotlin catalog is current at 1,072 references;
  research-ledger JSON Schema validation passed. Relevant JSON has UTF-8 without BOM and stores
  non-ASCII text as explicit Unicode escapes.
- No unit tests, instrumentation tests, or emulator run were performed. This batch only adds
  database JSON catalog data, which the current `AGENTS.md` explicitly exempts from testing.

| Artifact | SHA-256 |
| --- | --- |
| `ingredient-references.v1.json` | `e73afd3dc8f9ab54b0fdfc47061734993c40dde80939204deb7de2a105d8e54d` |
| `ingredient-forms.v1.json` | `ee64446a1245c1f442b707ed1dc4d563df9691f4ddfe579487c3f8d65abde722` |
| `research-ledger.v1.json` | `84cb326ece877940291c7ce7b0dcd9734caa0f127f744624c635627e096d0b64` |
| Generated `BundledIngredientCatalog.kt` | `b4a0fec0513fe6116926051dd56447c5f9f828f8b42efad10d8be426602279f9` |
| Bundled recipe-set digest | `996981a5d0632af841b51f0c9f09c7075a2a3189694ccd99660241aa9d8841e2` |

Remaining work: inventory further established additive identities, resolve any supported pectin
product gaps, and independently review the new Québec French displays. Broader Section E coverage
remains open.
