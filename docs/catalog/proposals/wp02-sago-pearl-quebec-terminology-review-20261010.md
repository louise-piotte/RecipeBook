# WP02 B3 Palm-Sago Pearls: Québec French Terminology Review

- **Reviewed:** 2026-10-10
- **Status:** proposal only; no catalog, ledger, recipe, or code changes made.
- **Scope:** independent Québec French review of the provisional `perles de sagou` label for palm-derived sago pearls, plus identity-boundary and current-catalog audit.
- **Inputs:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`; `docs/catalog/proposals/wp02-west-african-cassava-flour-products-review-20261010.md`; `docs/catalog/batches/wp02-wp06-wp07-cassava-egusi-egg-review-integration-20261010/README.md`; live seed references/forms, legacy candidates, ledger, and manifest-listed recipe files.
- **Source IDs:** `WP02-SAGO-QUEBEC-20261010-S01` onward are local to this proposal and are not ledger entries.

## Recommendation

**Approve a separate, identity-only palm-sago-pearl candidate** with these labels:

| Field | Recommendation |
|---|---|
| Proposed stable ID | `ingredient-ref-sago-pearls` |
| English display | `sago pearls` |
| fr-CA display | `perles de sagou` |
| Category | `FLOUR_AND_STARCH` |
| Scope | Pearls made from starch extracted from sago-palm pith; exclude cassava-derived granules even where a regional or retail name says “sago.” |
| Aliases | Add only the French singular `perle de sagou` as a number variant for lookup. No English alias is needed: the current search's substring fallback finds `sago pearl` within `sago pearls`. Do not add source or regional names as aliases. |

The exact compound `perles de sagou` is **not** an OQLF-preferred pearl headword: the reviewed OQLF entry is for `sagou`, without a pearl-specific bilingual entry. However, OQLF defines `sagou` as hard, pale, translucent grains extracted from the sago-palm pith; Canadian official French product-list usage contains the exact phrase `perles de sagou`; and a French-language supplier product page uses the phrase while explicitly distinguishing palm pith from cassava root. Together these support `perles de sagou` as a clear, defensible fr-CA display, while the label should not be described as an OQLF-endorsed term. No Québec product listing located in this review verified both that exact label and palm origin.

The identity boundary is essential. Palm sago pearls are distinct from OQLF-defined tapioca pearls made from manioc, from Indian cassava-derived `sabudana`/“tapioca sago,” and from Brazilian cassava-derived `sagu`/`sagú artificial`. Retailer wording that calls cassava-derived pearls `sago` or `perles de sagou` is evidence of market ambiguity, not permission to merge those products.

## Current catalog and recipe audit

The current seed has **712 ingredient references and 34 forms**. Related active references are:

| ID | Current display | Boundary |
|---|---|---|
| `ingredient-ref-sago-flour` | `edible sago flour / farine de sagou comestible` | Palm-pith flour; already distinct from cassava/tapioca products marketed as sago. |
| `ingredient-ref-tapioca-pearls` | `tapioca pearls / perles de tapioca` | OQLF-supported cassava-starch pearl product; English alias `tapioca ball`, French singular alias `perle de tapioca`. |
| `ingredient-ref-tapioca-starch` | `tapioca starch / fécule de manioc` | Extracted cassava starch, not a pearl product. |
| `ingredient-ref-cassava-flour` | `edible cassava flour / farine comestible de manioc` | Whole-root flour. |
| `ingredient-ref-gari` | `gari / gari` | Processed cassava product, distinct from flour and starch. |
| `ingredient-ref-brazil-polvilho-doce`; `ingredient-ref-brazil-polvilho-azedo` | `sweet cassava starch (polvilho doce) / polvilho doce`; `sour cassava starch (polvilho azedo) / polvilho azedo` | Brazilian source-named starch products; no aliases. |

There is no active sago-pearl reference, sago/tapioca/cassava-related form, or matching item among the **84 legacy import candidates**. The only active reference whose search term is simply `sago` is edible sago flour; the broad `sago` query should therefore not be stored as an alias on a pearl row. The current tapioca-pearl row is already separate from tapioca starch.

I searched every string-valued field and ingredient row in the 114 manifest-listed recipes (**1,123 ingredient rows**). There were zero matches for `sago`, `sagou`, `sabudana`, tapioca/cassava/manioc pearl terms, or the proposed French term. Recipe 045 contains the unrelated ingredient `sugar pearls`; it is not a sago or tapioca reference. No recipe link is indicated.

## Identity and alias boundaries

- **Palm sago pearls:** accept only when the source identifies sago starch from palm pith. The Malaysian standard defines the product as processed sago starch sold as small globules or pearls [S03]; the Malaysian food database labels its product `Sago, pearl` and identifies *Metroxylon* spp. [S04].
- **Tapioca pearls:** keep on `ingredient-ref-tapioca-pearls`. OQLF defines tapioca as manioc-derived starch and defines a tapioca pearl as a soft ball made from tapioca starch [S02]. Do not alias either row to the other.
- **Sabudana:** do not alias. India's Bureau of Indian Standards explains that Indian sago/saboodana is manufactured from tapioca (*Manihot*) tubers, despite the inherited “sago” name [S05]. A Canadian retailer's French page also calls its cassava-root product both sabudana and `perles de sagou`, illustrating why the regional name alone cannot establish palm origin [S09].
- **Brazilian `sagu` / `sagú artificial` / `tapioca pérola`:** do not alias. Brazil's Ministry of Agriculture describes these as spherical granules derived from cassava and distinguishes them from irregular, polyhedral `tapioca granulada` [S06]. These remain source-specific candidates, separate from palm-sago pearls and from the currently integrated tapioca-pearl row.
- **Other names:** do not add `sago`, `sago seeds`, `sago balls`, `pearl sago`, `perles du Japon`, `tapioca`, `tapioca pearls/balls`, `sabudana`, `sagu`, `sagú artificial`, `tapioca pérola`, or `tapioca granulada` as aliases. Similar appearance, pearl shape, or culinary use does not prove common source material or a safe substitution.

## Evidence state

This review supports **identity and naming only**. It does not support a density, unit mapping, kitchen measurement, dry-to-cooked conversion, cooking yield, substitution, or recipe link. The Malaysian standards and composition database include product-quality or food-composition facts, but those are not ingredient-volume mappings or evidence for an app conversion. Similarity in texture and shared dessert uses do not establish interchangeability.

If accepted, keep the candidate identity-only: no forms for dry, cooked, instant, or hydrated pearls; no default density; no unit mappings; no conversion or yield; no substitution rule; and no recipe association.

## Sources

All web sources were accessed **2026-10-10**. Locators identify the specific terminology or identity evidence used; no unsupported measurements or product specifications were imported.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| **S01** | OQLF, [sagou](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8977829/sagou), GDT, entry dated 1982; definition and term. | Gives the Québec French headword `sagou` and defines it as hard, whitish, translucent grains extracted from the pith of the sago palm (*Metroxylon rumphii*). Supports the French base term and palm-source boundary. It does not give a pearl-specific entry or English equivalent. |
| **S02** | OQLF, [tapioca](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497643/tapioca), GDT, updated 2025; definition and notes; and [perle de tapioca](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26578849/perle-de-tapioca), GDT, updated 2025; definition and preferred term. | OQLF identifies tapioca as food starch obtained from manioc and notes powder, flakes, small balls, or pearls. Its separate preferred term `perle de tapioca` is a soft ball made from tapioca starch. This establishes the tapioca comparator, not sago pearls. |
| **S03** | Department of Standards Malaysia, [MS 1357:1994, *Specification for Sago Pearl*](https://mysol.jsm.gov.my/getPdfFileForAdmin/eyJpdiI6IitqYjVaamhSK0paZ2hwRjJFK09qQXc9PSIsInZhbHVlIjoiYUIyV0Fmd2lqQnB0SWNiSzQrRWd1QT09IiwibWFjIjoiYWE5MTA3YzRlMWM2NTJiMWVjY2NiMjM2YWFmOGJlYWQ5OTg4YjFlMmE2ODRhOWE2OTY2MjY3MWMzZjBhYWM3ZiJ9), Foreword, p. (iv), PDF p. 5. | Defines sago pearl as processed sago starch marketed as small globules or pearls and says the standard covers sago pearls for food use. This is product identity evidence, not a Québec French name or retail conversion source. The publicly available document is a partial preview. |
| **S04** | Malaysia Ministry of Health, [Malaysian Food Composition Database: “Sago, pearl”](https://myfcd.moh.gov.my/index.php/1997-food-compositon-database/78-sago%2C-pearl-%28sagu%2C-biji-bijian%29-%3B-metroxylon-spp-.html), Food ID 102005, entry lines 14–18. | Identifies pearl sago with *Metroxylon* spp. Supports palm-source identity; this is a 1997 composition record, not a current product standard. Its nutrient values are not used. |
| **S05** | Bureau of Indian Standards, [IS 899:2022, *Tapioca Sago (Saboodana)*](https://www.services.bis.gov.in/tmp/tbl5_2024-11-11-03-03.pdf), public preview, p. 1. | States that sago/saboodana in India is manufactured from tapioca tubers (*Manihot utilissima*), while explaining that the name originally referred to palm-derived starch. Directly supports keeping Indian sabudana outside the palm-only identity. This public file is a one-page preview, not the full standard. |
| **S06** | Brazil Ministry of Agriculture, [Compêndio de qualidade vegetal](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/legislacao-de-produtos-origem-vegetal/normativos-cgqv/compendio-qualidade-vegetal.pdf), section “Produtos amiláceos derivados da raiz da mandioca: sagu,” printed pp. 276–277, PDF pp. 274–277; definitions and subgroups. | Defines cassava-derived `sagu` / pearl tapioca / artificial sago as irregular spherical granules and distinguishes them from irregular polyhedral `tapioca granulada`. Supports a regional cassava-product boundary only. |
| **S07** | Canadian Intellectual Property Office, [Trade-marks Journal, Vol. 69, No. 3526](https://www.ic.gc.ca/opic-cipo/tmj/eng/25May2022_fr.pdf?edition=05-25&year=2022), 2022-05-25, food-goods list, p. 308. | The French goods list includes the exact phrase `perles de sagou` and separately lists `perles de tapioca`. This is Canadian French administrative product-list usage, not an OQLF recommendation or proof of botanical source. |
| **S08** | Whole Food Earth, [Perles de sagou](https://wholefoodearth.com/fr-fr/p/wholefood-earth-sago-pearls-gmo-free-natural-vegan-dairy-free-no-added-sugar), French-language product page, product description. | Uses `perles de sagou` and states that sago comes from the plant's core while tapioca comes from its root. Exact French product wording and a clear material contrast; the page targets France, not Québec. |
| **S09** | Spice Divine, [Zaika Sabudana (Sago) 400g](https://spicedivine.ca/fr/products/zaika-sabudana-400g), French-language Canadian retailer page, product description. | Calls the item `perles de sagou` but says it is made from tapioca-root starch. This is evidence of Canadian-market name ambiguity and a reason to exclude sabudana/cassava products from the palm-specific alias set; it is not evidence for the palm product's Québec display name. |

## Integration handoff

If the identity is integrated, use `sago pearls / perles de sagou` for palm-pith pearls only, with French singular `perle de sagou` as the sole stored alias. Keep it separate from `edible sago flour`, the existing cassava-based tapioca-pearl row, tapioca starch, whole-root cassava flour, gari, and source-named Brazilian starch granules. Preserve `not_yet_researched` measurement and substitution states; add no recipe links.
