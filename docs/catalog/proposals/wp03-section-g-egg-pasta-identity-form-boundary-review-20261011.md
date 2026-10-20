# WP03 Section G egg-pasta identity/form boundary review

- **Reviewed:** 2026-10-11
- **Disposition:** integrated as an identity-only **egg pasta / pâtes aux œufs** reference in GRAIN_AND_CEREAL. Keep it distinct from generic pasta and from the narrower **egg noodles / nouilles aux œufs** identity. Egg content is not modeled as a form under generic pasta.
- **Scope:** review the open Section G egg-pasta item against current Canadian federal terminology, Québec terminology and retail names, Canadian maker/product evidence, live catalog neighbors, exact seed recipe demand, and available measurement/substitution evidence. See the integration README for shared catalog and ledger changes.

## Current snapshot and exact audit

Snapshot checked on 2026-10-11:

| Artifact | Current count or result |
| --- | ---: |
| Active ingredient references before integration | 972 |
| Active ingredient forms | 61 |
| Research-ledger records before integration | 1,247 |
| Legacy import candidates | 75 |
| Manifest recipes | 114 |
| Bundled recipe ingredient lines | 1,123 |
| Active unit definitions | 30 |
| Active direct and contextual substitution rules | 0 and 0 |
| Active package-yield records | 1; none for pasta or noodles |
| Active reference densities and unit mappings | 0 non-null densities; 0 mappings |

The pre-integration generic entry was ingredient-ref-pasta — **pasta / pâtes alimentaires**, with only the French singular alias **pâte alimentaire**. The active ingredient-ref-egg-noodles is **egg noodles / nouilles aux œufs**, with no aliases. Existing shape entries include macaroni, spaghetti, farfalle, fusilli, penne, and orzo; those rows do not encode egg content. Before integration, no active reference or alias named egg pasta, **pâtes aux œufs**, or **pâtes alimentaires aux œufs**. Integration now assigns the proposed names to ingredient-ref-egg-pasta. The existing egg-noodle name remains a separate neighbor.

None of the 61 forms is linked to generic pasta, egg noodles, or a reviewed pasta-shape row; no form label refers to pasta/noodles. Generic pasta and egg noodles both have a null default density and empty unit mappings. Before integration, the ledger contained ingredient-ref-egg-noodles with identity state “verified,” measurement state “researched_no_supported_value,” and substitution state “researched_no_supported_substitute”; it had no egg-pasta record. Integration adds the accepted egg-pasta identity and nine sources. No legacy candidate matches pasta, egg pasta, or egg noodles. The ledger’s unresolved ingredient-ref-noodles record concerns unqualified generic “noodles”; it documents only the Beef Stroganov serving instruction, not an egg-pasta recipe link.

All 1,123 manifest ingredient lines were searched for pasta/noodle names, candidate aliases, and active pasta/noodle reference IDs: **zero matches**. No recipe line demands egg pasta or needs relinking. The only bilingual recipe-text mention of generic noodles is in recipe 015, **Beef Stroganov / Bœuf Stroganov**, where the final instruction says to serve with “rice or noodles” / “riz ou des nouilles.” That is serving advice, not an ingredient line or evidence for a noodle type.

## Boundary and recommendation

Canadian regulation treats egg composition as a named pasta-product distinction. Food and Drug Regulations B.13.051 lists macaroni, spaghetti, noodles, and similar alimentary pastes sold under their respective egg names, including **egg alimentary pastes / pâtes alimentaires aux oeufs**, and sets a minimum of 4% egg-yolk solids on a dry basis for those designations. This is a product-name threshold, not a kitchen measure, ingredient percentage transferable to every product, density, or substitution ratio.

Québec retail naming uses **Pâtes aux œufs** for multiple pasta shapes. Current Loblaws French listings show Aurora egg-pasta products as tagliatelle, pappardelle, and fettuccine. Their English retail counterpart wording includes **Tagliatelle Egg Pasta**; one Super C item lists durum wheat semolina and fresh eggs. Thus the marketed egg-pasta class is broader than the existing egg-noodle identity and spans multiple shapes. OQLF defines generic pâte alimentaire as a shaped semolina-or-flour dough made with water or eggs, notes that shapes vary, and treats fresh and dry pasta as types within that broad class. Egg content and fresh/dried state are separate product dimensions.

The existing **egg noodles / nouilles aux œufs** identity should remain separate. Canadian regulation names egg noodles separately from egg alimentary pastes. OQLF also cautions that Québec French nouilles does not mean generic pâtes alimentaires; its older note about egg noodles concerns fine Chinese-style noodles, not every egg pasta shape. Do not use egg noodles, nouilles aux œufs, or unqualified noodles/nouilles as aliases for egg pasta.

Egg content is not a useful single form under generic pasta. Canadian makers document fresh pasta made with semolina, eggs, and water, while the Filotea maker sells dried egg pasta. The same ingredient class can therefore be fresh or dried. The recipe-line schema stores one nullable ingredientFormId (docs/schemas/full-library.schema.v1.json and SchemaDtos.kt), so one selected form cannot express independent egg-content and fresh/dry dimensions without collapsing one into the other. The identity boundary preserves the composition distinction now; fresh/dried forms remain for a separate evidence review. Do not infer egg content from a shape name, nor add one row per shape in this proposal.

### Proposed identity-only row

| Field | Proposal |
| --- | --- |
| ID | ingredient-ref-egg-pasta |
| English display | **egg pasta** |
| Québec French display | **pâtes aux œufs** |
| English aliases | None |
| French aliases | **pâtes alimentaires aux œufs** — the formal federal designation; the statutory oeufs spelling is already covered by accent/ligature-folded search |
| Category | GRAIN_AND_CEREAL, matching generic pasta and egg noodles without claiming a specific grain |
| Scope | Finished pasta explicitly sold or named as egg pasta / pâtes aux œufs. An egg ingredient appearing in a different product’s ingredient list alone does not establish this identity. Keep egg noodles and named egg-pasta shapes separately scoped. |
| Forms, density, unit mappings, package yields, conversions, and substitutions | None activated |
| Recipe links | None; the audit found no ingredient-line demand |

Do not alias broad pasta, pâtes alimentaires, egg noodles, nouilles aux œufs, or a particular shape to this row. Keep whole-wheat and gluten-free pasta for their own Section G reviews.

## Measurement and substitution evidence

No generic density or conversion is supported. The federal 4% figure is a dry-basis minimum for egg-labelled product names. The maker and retail examples have product-specific ingredient declarations and package details; they do not establish a generic g/mL value, grams per cup, dry-to-fresh conversion, cooking yield, or count weight. The Filotea maker page markets one 250 g tagliatelle package as four portions and gives that product a 5-minute cooking time. These are package-specific serving/cooking statements, not a general egg-pasta conversion. If retained in a future package-yield record, they must stay tied to the exact product/size and be checked against the product identifier; do not apply them to generic pasta or other egg pasta.

There are no active pasta/noodle form conversions, unit mappings, or substitution rules. The bundle has no pasta ingredient line from which to establish a recipe-scoped replacement. Add no generic rule between egg pasta, ordinary pasta, and egg noodles. Egg percentage differences across products also do not support a universal formulation claim or substitution.

## Sources

All pages below were accessed 2026-10-11. Retail pages and product information can change; each product listing supports only the named SKU or manufacturer product.

| ID and source | Claim supported | Limits |
| --- | --- | --- |
| **S01 — Government of Canada, [Food and Drug Regulations, B.13.051](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.13.051.html) and [Règlement sur les aliments et drogues, B.13.051](https://laws-lois.justice.gc.ca/fra/reglements/c.r.c.%2C_ch._870/TexteComplet.html)** | English and French law separately names egg macaroni, egg spaghetti, egg noodles, and egg alimentary pastes / pâtes alimentaires aux oeufs; the designation requires at least 4% egg-yolk solids on a dry basis. | Legal naming/composition threshold only. It is not a whole-egg recipe percentage, household measure, density, or generic recipe substitution. |
| **S02 — OQLF, [pâte alimentaire (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870035/pate-alimentaire)** | Québec French generic pasta term; the definition allows semolina or flour with water or eggs, describes varied shapes, and identifies fresh and dry pasta as types. Last updated 2017. | Defines broad pasta, not egg pasta’s minimum composition or a conversion between states. |
| **S03 — OQLF, [spaghetti aux œufs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2094740/spaghetti-aux-oeufs) and [nouilles chinoises (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489317/nouilles-chinoises)** | Supports Québec French egg-qualified pasta wording. The nouilles chinoises note pairs **nouilles aux œufs / egg noodles** and distinguishes Québec nouilles from generic pâtes alimentaires. | Both terminology records date to 1982. The noodle note describes a fine Chinese-style subset, not all egg pasta products. |
| **S04 — Loblaws, [Aurora pasta search in French](https://www.loblaws.ca/fr/search?search-bar=aurora+pasta)** | Current Québec-market retail wording lists **Pâtes aux œufs** with tagliatelle, pappardelle, and fettuccine product variants. | Dynamic search results; supports displayed retail naming only, not ingredient composition or a general conversion. |
| **S05 — Super C, [Aurora Tagliatelle Egg Pasta](https://www.superc.ca/en/aisles/pantry/pasta-rice-beans/pasta/tagliatelle-egg-pasta/p/061659018211)** | Retail title **Tagliatelle Egg Pasta**; the listing identifies a 250 g product with durum wheat semolina and fresh eggs and gives a five-minute cooking direction. | One retailer/SKU. Package weight and cooking time are product-specific; the retailer warns product labels may change. |
| **S06 — Aniko Pasta, [manufacturer product catalogue](https://anikopasta.ca/)** | Canadian maker in Sudbury describes a product line both with and without egg and identifies its tagliatelle as made with eggs. This shows egg content can vary across shapes/products from one maker. | Manufacturer description, not a full ingredient panel or egg percentage. It does not define all Canadian pasta products. |
| **S07 — Duso’s, [fresh pasta and company information](https://dusos.com/)** | Canadian maker describes fresh thin pasta made with durum semolina, cage-free eggs, and water, and identifies its production facility in Port Coquitlam, British Columbia. Supports an egg-containing fresh product. | One maker’s fresh products; no egg proportion or universal formulation is given. |
| **S08 — Filotea, [official tagliatelle product page](https://shop.filoteapasta.com/en/prodotto/tagliatelle-3/) and [traditional line specifications](https://www.filoteapasta.com/en/traditional-line/)** | Manufacturer calls tagliatelle egg pasta, gives durum wheat semolina, eggs (27%), and wheat flour, describes slow drying, and lists a 250 g package as four portions with a five-minute cooking time. The line lists multiple shapes under egg-pasta products. | Italian manufacturer, not a Québec label or Canadian measurement standard. Serving count, package size, egg percentage, and cooking time apply only to this product/version. |
| **S09 — ACEMA, [Filotea products in French](https://www.acema.ca/fr/produits/CRPF-2906)** | Canadian distributor wording **Pâtes tagliatelle aux œufs** and an indexed listing of the Filotea tagliatelle’s French product details. | The direct page fetch returned a cache miss on access; indexed listing only. It reports 30% eggs for EAN 8032993003418, while the Filotea manufacturer page reports 27% for that product code/EAN. Treat that product-specific percentage as unresolved; neither value is catalog-wide data. |

## Disposition and artifact checks

The integration adds ingredient-ref-egg-pasta as an identity-only reference with `egg pasta / pâtes aux œufs` and the formal French alias `pâtes alimentaires aux œufs`. It adds no form, package yield, measurement behavior, or recipe link. The Section G review of fresh/dry, whole-wheat, gluten-free, and other shapes remains open. See `docs/catalog/batches/wp03-egg-pasta-identity-integration-20261011/README.md`.

The saved proposal was checked as UTF-8 without BOM, with a final newline. A mojibake-marker scan found none; the no-index whitespace-diff check emitted no warnings.
