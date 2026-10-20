# WP02 follow-up: exact Québec/Canadian French name for extracted taro-corm starch

- **Reviewed/accessed:** 2026-10-11
- **Status:** Proposal only. No catalog, ledger, recipe, plan, roadmap, code, or test changes.
- **Scope:** Food-grade starch isolated from edible *Colocasia esculenta* corms. The search checks for an exact current Québec/Canadian French product name and preserves the boundary from whole-corm taro flour and starch from other plants.
- **Proposal-local source IDs:** `WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S01`–`S10`. These IDs are not research-ledger entries.

## Recommendation

**Hold `candidate-taro-corm-starch` unresolved.** This pass found no current Québec or Canadian French product listing, label, or terminology entry that names a standalone food starch isolated from *C. esculenta* corms. The English research phrase `taro starch` is source-attested, but the French display remains unestablished.

Do not add `fécule de taro` or `amidon de taro` as a display or alias. OQLF explains the general words and names the taro plant, but does not pair either French word with this product. `Fécule de taro` is a plausible linguistic construction, not an attested Québec/Canadian product name; `amidon de taro` appears in a non-Canadian commercial classification. The Canadian-accessible retail wording located was `farine de taro`, which identifies flour and does not support a starch identity.

| Product | Current wording | Decision |
|---|---|---|
| Extracted starch from edible *C. esculenta* corms | EN research wording `taro starch`; fr-CA unresolved | Hold. Do not create an active reference or alias until a Québec/Canadian source names the isolated product in French. |
| Whole-corm flour | `taro flour / farine de taro` | Keep as the separate existing identity. Flour is not an alias or form of isolated starch. |

## Québec/Canadian naming evidence

- OQLF's [GDT entry for `taro`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19466379/taro) gives `taro`, `colocase`, and `colocasie` for the plant/food and *Colocasia esculenta*. It names neither flour nor extracted starch. [S01]
- OQLF's [GDT entry for `amidon`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated in 2026, gives `amidon` as the preferred general term and describes `fécule` as context-specific for starch in tubers or other underground organs. This supports the linguistic plausibility of a *fécule* construction, but it does not attest `fécule de taro` or `amidon de taro` as a product name. [S02]
- The CFIA's [French organic import-code list](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg) currently lists taro as a root in dried and frozen states. It does not supply an extracted-starch name. This is a limited code list, not a complete food-name inventory, so its omission cannot establish that no Canadian product exists. [S03]
- OsiAfrik's search-indexed product listing uses `Farine de taro` for flour made from dried taro; its [shipping policy](https://www.osiafrik.com/pages/shipping-and-return-policy) says Canadian orders are shipped using Canada Post or Purolator. The product page returned a cache miss when opened in this review. The listing establishes a Canadian-accessible French name for flour, not starch, and does not specify *C. esculenta*. [S04–S05]
- The active Canadian CIPO record for [POLAR BEAR BRAND, application 0705943](https://ised-isde.canada.ca/cipo/trademark-search/705943) includes English `taro starch` among class 30 goods. The record says the mark is used in China and gives no French term or botanical specification. It is not a Canadian retail label or evidence of an exact Canadian French name. [S06]
- OAPI's [BOPI 13MQ/2025](https://oapi.int/wp-content/uploads/2025/07/BOPI_13MQ2025.pdf), page 118, contains `amidon de taro à usage alimentaire` in a French-language class 30 goods statement. This confirms non-Canadian commercial-classification wording only; it does not identify *C. esculenta* or establish Québec usage. [S07]

Targeted current searches used `fécule de taro`, `amidon de taro`, `taro starch`, `taro starch powder`, and *Colocasia*-starch wording with Québec/Canada and retailer-focused queries. They surfaced fresh taro, taro flour, taro-flavoured foods or tapioca used in them, and non-Canadian terminology/classification results. No result tied a French name to a standalone *C. esculenta* starch product in Québec or Canada. This is a bounded search, not proof that no such product is sold.

## Product and alias boundary

Primary research supports treating the products separately. Boahemaa et al. evaluate taro flour and taro starch as separate samples from two taro varieties in a study explicitly scoped to *C. esculenta*. [S08] Karmakar et al. isolate starch from several named aroid taxa; their methods identify *C. esculenta* corms separately from *Xanthosoma* and *Alocasia*, and their results describe differing starch properties across species. This supports keeping the candidate source-qualified rather than treating aroid starches as one class. [S09]

Keep the candidate separate from:

- Fresh taro (`ingredient-ref-taro`) and whole-corm taro flour (`ingredient-ref-taro-flour`).
- Taro leaves, generic taro powder, cooked or flavoured taro preparations, and meal or flour that has not had starch isolated.
- Malanga/*Xanthosoma* products, Alocasia, Amorphophallus, or unspecified cocoyam/dasheen/eddoe starch. Common names overlap across aroids and do not establish the botanical starch source.
- Cassava/tapioca starch, corn starch, potato starch, and arrow-root starch, which are distinct source products.

Do not add `colocase`, `colocasie`, `dasheen`, `cocoyam`, `eddoe`, `malanga`, `arrowroot`, `fécule de taro`, or `amidon de taro` as aliases. OQLF's colocase/colocasie terms name the plant/food, not its extracted starch. No source reviewed provides a safe one-to-one alias from those names to extracted *C. esculenta* starch.

## Live catalog, ledger, and recipe audit

Read-only snapshot of the shared worktree on 2026-10-11:

| Surface | Current state | Implication |
|---|---|---|
| Active catalog | 966 ingredient references and 53 forms. `ingredient-ref-taro` is `taro / taro`; `ingredient-ref-taro-flour` is `taro flour / farine de taro`; `ingredient-ref-taro-leaves` is separate. No taro-starch reference or alias exists. No taro-starch form is linked or labeled. | Preserve fresh corm, whole-corm flour, and leaves as distinct identities. There is no duplicate reference to promote. |
| Research ledger | 1,237 records. The single `candidate-taro-corm-starch` record remains `needs_clarification`, `researched_no_supported_value`, and `researched_no_supported_substitute`; it has 25 source entries, zero measurement observations, zero unit observations, and zero substitution findings. | Keep the existing unresolved candidate; do not add a second candidate or change the ledger in this proposal. |
| Bundled recipes | The manifest lists 114 recipes and 1,123 ingredient rows. A read-only scan of parsed recipe strings and ingredient data found zero matches for taro, *Colocasia*, colocase/colocasie, cocoyam, dasheen, `fécule de taro`, or `amidon de taro`. | There is no bundled recipe demand, ingredient link, or recipe-specific substitution context. |

## Measurement and substitution gaps

The ledger has no kitchen measure, package quantity, source-bounded mass/volume observation, default density, unit mapping, conversion, yield, or substitution for this candidate. The 2024 *C. esculenta* study characterizes flour and starch for food applications; it does not establish a household scoop measure or a replacement ratio. A separate 2025 study reports laboratory bulk/tapped-density work for `taro root starch`, but its accessible abstract does not specify the botanical species or a kitchen measurement method. Neither result supports a generic recipe conversion for the narrower candidate. [S08, S10]

Do not add a density, cup/tablespoon weight, package yield, conversion, preparation form, or substitution against corn, potato, tapioca, arrow-root, taro flour, or another starch. The primary studies' extraction and functional-property results are not recipe-scale replacement trials. If the identity is named later, keep these fields empty until product-specific culinary evidence exists.

## Reopen trigger

Reopen only when a current Québec/Canadian source gives the French name of a standalone food starch product and the package, retailer, or manufacturer evidence identifies the starch as isolated from edible *C. esculenta* corms. An OQLF/TERMIUM entry explicitly pairing the French term with `taro starch`, or a local package/listing plus botanical/manufacturer specification, would meet the naming need. A general French construction, foreign classification, fresh-root page, flour listing, or common-name-only starch page does not.

## Sources

Sources were checked on 2026-10-11. Limits and access problems are stated above; proposal-local IDs below are not ledger records.

| ID | Source and supported scope |
|---|---|
| **S01** (`WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S01`) | Office québécois de la langue française, [taro (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19466379/taro), last updated 1995. Names the plant/food and *C. esculenta*; no starch product name. |
| **S02** (`WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S02`) | OQLF, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Gives the general `amidon` / contextual `fécule` distinction; it does not attest a taro-starch phrase. |
| **S03** (`WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S03`) | Canadian Food Inspection Agency, [new organic import-code extensions](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg). Lists taro-root state codes; not a complete food-name inventory and not an extracted-starch term. |
| **S04** (`WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S04`) | OsiAfrik, [Farine de taro / Cocoyam Flour](https://www.osiafrik.com/fr/products/cocoyam-flour-8-oz). Search-indexed listing for flour from dried taro; page returned a cache miss when opened. No starch or species claim. |
| **S05** (`WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S05`) | OsiAfrik, [shipping and return policy](https://www.osiafrik.com/pages/shipping-and-return-policy). States that orders ship to Canada; confirms accessibility of the separate flour listing, not a Canadian product label. |
| **S06** (`WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S06`) | Canadian Intellectual Property Office, [POLAR BEAR BRAND, application 0705943](https://ised-isde.canada.ca/cipo/trademark-search/705943). Active English class 30 goods statement lists `taro starch`; use claim is China; no French term or botanical source. |
| **S07** (`WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S07`) | African Intellectual Property Organization, [BOPI 13MQ/2025](https://oapi.int/wp-content/uploads/2025/07/BOPI_13MQ2025.pdf), p. 118. Uses `amidon de taro à usage alimentaire` in a French commercial classification; outside Canada and not species-qualified. |
| **S08** (`WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S08`) | Boahemaa et al., [“Physico-chemical and functional characterization of flour and starch of taro (*Colocasia esculenta*) for food applications”](https://doi.org/10.1016/j.foohum.2024.100245), *Food and Humanity* 2 (2024), article 100245. Primary study analyzes flour and starch separately; no Québec product name or household measure. |
| **S09** (`WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S09`) | Karmakar, Chakraborty, and Roy, [“Assessment of yield and characterization of starch extracted using different methods from the corms of some aroids”](https://link.springer.com/article/10.1007/s44187-025-00588-z), *Discover Food* 5 (2025), article 290. Primary study separates *C. esculenta* from other aroids and describes extraction; no common-name equivalence is inferred. |
| **S10** (`WP02-TARO-CORM-STARCH-EXACT-QC-FOLLOWUP-20261011-S10`) | Parmar and Roghelia, [“Development and evaluation of edible films using corn, raw banana, and taro root starch”](https://doi.org/10.37855/jah.2025.v27i01.09), *Journal of Applied Horticulture* 27(1) (2025), 44–50. Reports lab powder properties, not a verified *C. esculenta* kitchen measure or conversion. |
