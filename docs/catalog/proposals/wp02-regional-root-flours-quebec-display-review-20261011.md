# WP02 B4 — Independent Québec French display review: root and fruit flours

- **Reviewed:** 2026-10-11
- **Status:** Review-only proposal. It changes no active reference, ledger record, plan, roadmap, recipe, test, or code.
- **Scope:** Independent Québec French display review for the six existing active flour references listed below. Product identity boundaries are preserved from the prior reviews.
- **Evidence:** Official Québec and Canadian terminology records, current Québec retail listings, manufacturer product information, and regional French usage. Live pages were accessed 2026-10-11; older publication or update dates are stated where available.
- **Source IDs:** `WP02-B4-QC-DISPLAY-20261011-S01` through `S16`; proposal-local IDs, not ledger entries.

## Recommendation

Keep the six existing English/French reference pairs and their product boundaries. Retain three French displays with direct support in Québec usage; keep three as provisional descriptive displays pending clearer Québec evidence for the exact single-source flour. This review recommends no name changes, aliases, or holds.

| Exact active reference | Current EN / fr-CA display | Recommendation | Québec evidence and limit |
|---|---|---|---|
| `ingredient-ref-green-banana-flour` | `green banana flour` / `farine de banane verte` | **RETAIN.** | La Moisson, a Québec retailer, currently uses the exact phrase in the ingredient list for a packaged food. A 2021 Bocaux & Co Québec product list also names standalone `farine de banane verte`; its 2024 list omits the item, so that older listing supports wording, not current stock. OQLF’s 1982 `farine de banane` entry is generic and adjacent only (see below). [S01–S05] |
| `ingredient-ref-green-plantain-flour` | `green plantain flour` / `farine de banane plantain verte` | **PROVISIONAL — retain unchanged.** | Basmex, a Montréal distributor, lists `Tropiway Farine de plantain`. Tropiway identifies its plantain product as formulated fufu flour; the local listing therefore does not establish a Québec single-source green-plantain flour label. OQLF/TERMIUM fruit terminology supports the `banane plantain` base wording, not this full flour compound. [S14–S16] |
| `ingredient-ref-breadfruit-flour` | `breadfruit flour` / `farine de fruit à pain` | **PROVISIONAL — retain unchanged.** | OQLF supports `fruit à pain` for the fruit. The exact flour compound appears in a 2014 French Secretariat of the Pacific Community leaflet, outside Québec. No Québec retail or manufacturer listing for this flour was located in this review. [S06–S07] |
| `ingredient-ref-tigernut-flour` | `tigernut flour` / `farine de souchet` | **RETAIN.** | A current La Moisson product page describes its ingredient as `farine de souchet`; Tigernuts Traders uses the same term on its French manufacturer site. TERMIUM identifies `souchet` as a French name for the edible *Cyperus esculentus* tuber. La Moisson’s product title says `farine de noix tigrées`, but the body clarifies that it is tuber flour, not nut flour; do not add the title wording as an alias. [S08–S10] |
| `ingredient-ref-yam-flour` | `yam flour` / `farine d’igname` | **RETAIN.** | OQLF maps `igname` to *Dioscorea* and distinguishes it from sweet potato. Marché Kaïa currently lists `Farine d’igname Elubo` for Grand Montréal delivery. That direct Québec usage supports the core French display; `elubo` remains product/region wording, not a global alias. [S11–S12] |
| `ingredient-ref-taro-flour` | `taro flour` / `farine de taro` | **PROVISIONAL — retain unchanged.** | OQLF prefers `taro` for *Colocasia esculenta*. Basmex lists `Tropiway farine de taro` in Montréal, but Tropiway describes its taro/cocoyam products as formulated fufu flours. The listing attests local wording, not a pure whole-corm flour name. [S13–S15] |

Here, **provisional** means the current string can remain the working display while its exact Québec product usage remains unsettled. It does not reopen the already active identity. No reviewed evidence supports broadening a single-source flour to a composite fufu product.

## OQLF’s `farine de banane` entry

OQLF’s entry, last updated in 1982, pairs `farine de banane` with English **banana meal**. Its notes discuss banana flours from fruit at different maturity levels, including greener and more mature fruit, without separating banana from plantain or defining the current green-banana flour product boundary. [S01]

Treat the record as **adjacent evidence only**. It can document an older generic French term and the existence of banana meal, but it cannot validate either `farine de banane verte` as a complete modern product display or `farine de banane plantain verte`. It supplies no plantain distinction and does not establish the green qualifier as an OQLF equivalent. Keep `farine de banane` unassigned as an alias for both active flour references.

## Identity and active-state audit

The six exact IDs above are already present in `ingredient-references.v1.json`, each in `FLOUR_AND_STARCH`. Each currently has empty French and English alias arrays, `defaultDensity: null`, and an empty `unitMappings` list. This packet proposes no identity or scope change.

Preserve the existing boundaries: green banana and green plantain pulp flours remain separate from each other, ripe products, and extracted starch; breadfruit flour remains tied to the existing edible *Artocarpus altilis* identity; tigernut flour remains whole-tuber flour from *Cyperus esculentus*, with defatted flour separate; yam flour remains single-source *Dioscorea* flour; and taro flour remains whole-corm flour from *Colocasia esculenta*, separate from extracted starch and other aroid products. Do not use root/fruit names, fufu names, or prepared-food names as flour aliases.

The active root references remain distinct: `ingredient-ref-banana` (`banana / banane`), `ingredient-ref-plantain` (`plantain banana / banane plantain`), `ingredient-ref-breadfruit` (`breadfruit / fruit à pain`), `ingredient-ref-yam` (`true yam / igname`), and `ingredient-ref-taro` (`taro / taro`). Bare root/fruit labels should not be added as flour aliases. Tigernut is supported here by terminology and product sources; this review found no separate active fresh-tigernut reference to reconcile.

## Local recipe and phrase-collision check

A read-only normalized whole-phrase scan covered all 114 manifest-listed bundled recipes and 1,123 ingredient rows. It searched the six current English/French displays plus broad nearby phrases, including `banana flour`, `farine de banane`, `plantain flour`, and `farine de plantain`. It found **zero phrase hits** in the recipe corpus.

An exact active-reference check found each current flour display only on its own intended reference row. The banana, plantain, breadfruit, yam, and taro root/fruit references listed above remain separate identities. Broad or bare root terms would blur those identities in catalog search, so no such aliases are recommended. This is an exact phrase check; it does not treat ordinary substring co-results as identity collisions.

## Measurements and substitutions

This terminology review adds no measurement, density, kitchen measure, unit mapping, conversion, yield, recipe link, or substitution claim or rule.

The five records for green banana, green plantain, tigernut, yam, and taro flour remain `not_yet_researched` for both measurement and substitution. The breadfruit ledger record is separately marked `researched_no_supported_value` and `researched_no_supported_substitute`. Its prior research includes sample-specific bulk-density observations (0.70 and 0.52 g/cm³ for two commercial samples using a tapped-cylinder method; 0.66 g/mL for a Buton flour) and a 2024 cake study that compared particular breadfruit/wheat ratios. These are not an active default density, kitchen conversion, or general substitution rule; the cake result remains formula-specific. [Existing ledger sources: `WP02-BREADFRUIT-RESIDUAL-20261010-S09` and `S10`; see the [breadfruit boundary review](wp02-breadfruit-flour-boundary-review-20261010.md).]

## Integration recommendation

Preserve all six active French displays and leave aliases, measures, and substitutions unchanged. Record the Québec wording checkpoint as retained for green banana, tigernut, and yam, and provisional for green plantain, breadfruit, and taro. Keep B4 open for these provisional displays and the broader regional-flour work.

The B4 plan row still describes tigernut, yam, and taro as open even though their reference rows are active. That integration-status wording now lags the seed; this review does not edit the plan. The coordinator can reconcile that note when recording the review outcome.

## Evidence register

All live product and terminology pages below were accessed 2026-10-11. Retail listings establish their displayed wording and listed product context only; they do not replace manufacturer composition statements or prove market-wide terminology.

| ID | Source and evidence limit |
|---|---|
| **S01** | Office québécois de la langue française, [farine de banane (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489070/farine-de-banane), last updated 1982. Pairs the term with *banana meal* and describes broad banana maturity. Generic historical evidence; does not distinguish green banana from plantain or define either active display. |
| **S02** | La Moisson, [Rouleaux de coco saveur gingembre](https://lamoisson.com/products/rouleaux-de-coco-saveur-gingembre-ginger-coconut-rolls), current product page. Ingredient declaration uses `farine de banane verte biologique`; this is an ingredient-label attestation within a finished product, not a standalone flour package. |
| **S03** | La Moisson, [contact and store address](https://lamoisson.com/pages/contact), current retailer contact page. Identifies its Ste-Thérèse, Québec location; establishes the Québec source state for S02 and S10. |
| **S04** | Bocaux & Co, [2021 food-product list](https://bocauxetco.ca/wp-content/uploads/2021/09/Bocaux-co_Produits-alimentaires-.pdf), dated 2021. Lists `Farine de banane verte` as a standalone food product. Historical retail wording only. |
| **S05** | Bocaux & Co, [2024 updated food-product list](https://bocauxetco.ca/wp-content/uploads/2024/08/Bocaux-co_Produits-alimentaires_300824.pdf), dated 2024-08-30. The banana-flour listing is absent; absence from this list is not evidence of market-wide unavailability. |
| **S06** | OQLF, [fruit de l’arbre à pain (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297101/fruit-de-larbre-a-pain), last updated 1990. Supports `fruit à pain` / `fruit de l’arbre à pain` and *Artocarpus altilis* for the fruit, not the flour compound. |
| **S07** | Secretariat of the Pacific Community, [Le fruit à pain](https://www.ccima.wf/images/a-la-une/2025/march%C3%A9_du_magisi/Fiche5-le-fruit-a-pain.pdf), leaflet version 2014, pp. 4–5. Uses `farine de fruit à pain` for dried, pounded or milled and sifted breadfruit. Exact French regional usage, outside Québec. |
| **S08** | Government of Canada, TERMIUM Plus, [TIGER NUT](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=TIGER+NUT), record dated 2022-08-12. Defines edible *Cyperus esculentus* tuber and lists French common terms including `souchet` and `noix tigrée`; it does not define flour wording. |
| **S09** | Tigernuts Traders, [French product range](https://www.tigernuts.com/fr/produits/) and [farine de souchet fine](https://www.tigernuts.com/fr/produits/farine-de-souchet-fine/), manufacturer pages. Uses `farine de souchet` for its flour product family; not Québec usage and not evidence that fine/defatted grades are aliases. |
| **S10** | La Moisson, [Farine de noix tigrées](https://lamoisson.com/collections/farines-preparations-flour-meal-flour-mixtures/products/farine-de-noix-tigrees), current Québec retailer page. Product body calls it `farine de souchet`; sole listed ingredient is organic tiger nuts/tubers, and the page says they are not nuts. The title is alternate market wording, not a terminology recommendation. |
| **S11** | OQLF, [igname (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082772/igname), last updated 1991. Maps English *yam* to *Dioscorea* and distinguishes yam from sweet potato; it defines the edible tuber, not flour. |
| **S12** | Marché Kaïa, [SAC – Farine d’igname Elubo 4 kg](https://marchekaia.com/products/sac-farine-d-igname-elubo-4kg), current product page advertising 48-hour delivery in Grand Montréal. Direct Québec retail wording; the public page does not expose a full ingredient specification. |
| **S13** | OQLF, [taro (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19466379/taro), last updated 1995. Lists preferred terms `taro`, `colocase`, and `colocasie` for *Colocasia esculenta*. It establishes the root term and species, not a flour term. |
| **S14** | Basmex, [product listings](https://www.basmex.ca/products) and [Tropiway farine de taro](https://www.basmex.ca/products/p/tropiway-farine-de-taro), current Montréal distributor pages. Lists `Tropiway farine de taro` and `Tropiway Farine de plantain`; the listing provides no composition. |
| **S15** | Tropical Foods / Tropiway, manufacturer [Making Fufu](https://www.tropiway.com/making-fufu), [FAQ](https://www.tropiway.com/faq), and [home page](https://www.tropiway.com/), current manufacturer pages. Describes plantain and cocoyam fufu products as formulated/blended products. This distinguishes the Québec retailer’s Tropiway listing from evidence for an unblended green-plantain or whole-taro flour. |
| **S16** | OQLF, [banane (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297102/banane), and Government of Canada, TERMIUM Plus, [plantain terminology record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=22&i=&index=frr&lang=fra&sg_kp_wet=923817&srchtxt=BANANE). Fruit-name evidence for `banane` / `banane plantain`; neither source establishes the complete green-plantain-flour compound.
