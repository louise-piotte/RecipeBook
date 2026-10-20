# WP06 yacón Québec display review — 2026-10-11

- **Reviewed:** 2026-10-11
- **Status:** Proposal only. No shared seed, ledger, plan, roadmap, recipe, code, or test files changed.
- **Recommendation:** Retain `yacón` as the fr-CA display and accept it as locally supported Québec usage for this catalog identity. This is not an OQLF ruling. Keep the active row alias-free and leave the botanical-organ wording unresolved.
- **Scope:** Independent naming review of the active yacon ingredient for the edible root food product. No new identity, alias, form, quantity, conversion, recipe link, or substitution is proposed.

## Decision

| Surface | Recommendation | Evidence limit |
|---|---|---|
| Active identity | Keep `ingredient-ref-yacon`, EN `yacon`, fr-CA `yacón`. | Current seed already has this identity, with empty aliases, null density, and no unit mappings. |
| fr-CA status | **Accept `yacón` as a locally supported display** and close the wording question for this row. | Montréal Botanical Garden / Espace pour la vie uses the spelling for *Smallanthus sonchifolius*. No dedicated OQLF GDT entry surfaced in the bounded search, so do not call this an OQLF-preferred or officially ruled term. |
| `poire de terre` | Do not add as an alias. | TERMIUM Plus lists it for yacon and also as a less-frequent name for Jerusalem artichoke (*Helianthus tuberosus*). |
| `jicama` | Keep separate. | TERMIUM's yacon note makes the name regional to Ecuador and distinguishes commercial jicama. OQLF identifies jicama as *Pachyrhizus erosus*; Espace pour la vie lists it separately from yacón. |
| Root wording | Keep the food scope to the edible root of the yacon crop, but do not add `racine`, `racine tubéreuse`, `tubercule`, or `rhizome` to the display or aliases. | Local and federal sources use root/tuber descriptions inconsistently. The catalog name can identify the food crop without settling botanical organ classification. |
| Québec market evidence | Record as supportive but limited. | A Montréal retailer lists `Yacon 200gr`, but leaves the form undescribed and categorizes it under flours and mixes. Another Québec retailer explicitly lists yacon-root syrup, which supports local spelling for a processed product, not fresh-root availability. |

The current plan and integration README still mark the French display provisional pending independent Québec review. This proposal recommends retaining the exact spelling and resolving that catalog display status as locally supported. The distinction is evidence level: local Québec usage supports `yacón`; the search did not find an OQLF ruling for it.

## Product scope and terminology distinctions

For this row, `yacón` names the edible food crop/root of *Smallanthus sonchifolius*. Espace pour la vie places the plant under root vegetables, names it `Yacón ou poire de terre`, and describes harvesting roots that may be consumed. TERMIUM describes edible fleshy roots. These sources support the food scope, but do not require the picker display itself to state an anatomical organ.

| Wording | Evidence and catalog boundary |
|---|---|
| `yacón` | Montréal Botanical Garden / Espace pour la vie uses the accented spelling directly with *Smallanthus sonchifolius*. Retain as the fr-CA display. The Québec retail pages found also use unaccented `Yacon`; that spelling does not outweigh the direct local French spelling. |
| `poire de terre` | TERMIUM Plus lists it for yacon; Espace pour la vie pairs it with yacón. TERMIUM also lists it as a less-frequent French name for *Helianthus tuberosus*, whose active identity is Jerusalem artichoke / topinambour. Keep the phrase out of the yacon aliases to avoid an ambiguous search term. |
| `jicama`, `pois patate`, `dolique bulbeux`, `dolique tubéreux` | OQLF's GDT entry assigns `dolique bulbeux` and `dolique tubéreux` to jicama / *Pachyrhizus erosus*. Espace pour la vie lists `Jicama ou pois patate` separately from `Yacón ou poire de terre`. TERMIUM's Ecuador observation is explicitly regional and says this is not common jicama of commerce. Do not alias yacon to jicama or its French names. |
| `pear` / `poire` | The active generic `pear / poire` identity remains a separate fruit. Espace pour la vie describes yacon's flavor as pear-like; that is a sensory comparison, not a product name. The same local source calls pepino `poire-melon` and identifies it as *Solanum muricatum*, another distinct product. Do not add bare `poire` or `pear` to yacon. |
| `plantain banana` / `banane plantain` | The active plantain identity remains separate. No reviewed source uses plantain as a yacon name. Do not add plantain wording as an alias or infer a relationship from neighboring root-crop labels. |
| `racine`, `racine tubéreuse`, `tubercule`, `rhizome` | Espace pour la vie uses `racines tubérisées (tubercules)` in its gardening text; TERMIUM's yacon record describes fleshy roots and its older context also says tubers. The previous WP06 identity packet records a conflicting `Rhizome` entry in a CIP crop summary. Keep the catalog display at `yacón` and do not encode one organ label as settled terminology. |

The exact-name audit against the current seed found the active comparators above and no active `poire de terre` alias. A scan of current manifest-listed recipe JSON found no yacon, yacón, or *Smallanthus sonchifolius* recipe line; no recipe relinking is requested.

## Québec market and community evidence

The Montréal botanical-garden source is the strongest local display evidence: it names `Yacón ou poire de terre (Smallanthus sonchifolius)` and describes the edible roots. This is municipal garden and public horticultural usage, not an OQLF decision or a consumer-label standard.

Québec retail evidence is narrower. Sabor Latino, a Montréal retailer, has a listing titled `Yacon 200gr`, with Peru as country of origin, but the page does not identify what form the product takes; its category is `Farines et mélanges à préparer`. Do not infer that it is a fresh root, a flour, or a particular processed product from this incomplete listing. La Boîte à Grains lists `Sirop de Yacon Biologique` and `Sirop de racine de Yacon biologique`, which is direct Québec use for syrup only. The bounded search did not locate a Québec retailer listing that clearly identifies fresh edible yacon roots for sale.

These gaps do not require a different display. They limit the retail-prevalence claim: this review supports `yacón` through direct Québec institutional French usage and finds compatible local retail spelling, but does not establish a common fresh-root market label.

## OQLF and TERMIUM status

Targeted OQLF GDT searches for `yacon`, `yacón`, and `poire de terre` did not surface a dedicated yacon entry in this review. Treat this as a bounded search result, not proof that no OQLF record exists. The OQLF entry for `dolique bulbeux` is directly relevant to the boundary: it gives the preferred French terms `dolique bulbeux` and `dolique tubéreux`, English `jicama`, and Latin *Pachyrhizus erosus*.

TERMIUM Plus does contain a yacon record in food-industry / vegetable-production fields, listing English `yacon` and French `poire de terre`. It also has the Ecuadorian `jicama` observation with an explicit caveat. A separate TERMIUM record for *Helianthus tuberosus* lists `poire de terre` among less-frequent French names. TERMIUM is federal terminology evidence; it should not be represented as an OQLF ruling.

## Source register

All accessible pages below were consulted 2026-10-11. The direct CIP page access attempt is recorded under limits; it returned HTTP 403 in this review.

| ID | Source and exact URL | Supports and evidence limit |
|---|---|---|
| **WP06-YACON-QC-DISPLAY-20261011-S01** | Office québécois de la langue française, GDT, [`dolique bulbeux`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17020934/dolique-bulbeux). | OQLF entry lists `dolique bulbeux` and `dolique tubéreux`, links English `jicama` and Latin *Pachyrhizus erosus*. It supports the distinct jicama boundary, not a yacon ruling. |
| **WP06-YACON-QC-DISPLAY-20261011-S02** | Translation Bureau, Government of Canada, TERMIUM Plus, [`YACON`](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=esr&lang=fra&srchtxt=YACON). | Lists French `poire de terre`, describes fleshy edible roots, and says the Ecuadorian `jicama` usage is not common jicama of commerce. This is federal terminology evidence, not an OQLF decision or Québec-market measure. |
| **WP06-YACON-QC-DISPLAY-20261011-S03** | Translation Bureau, Government of Canada, TERMIUM Plus, [*Helianthus tuberosus* / TUBEREUX](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=1&index=frw&lang=fra&srchtxt=TUBEREUX). | Lists `poire de terre` as a less-frequent French term for Jerusalem artichoke. It supports keeping that phrase out of yacon aliases. |
| **WP06-YACON-QC-DISPLAY-20261011-S04** | Espace pour la vie / Jardin botanique de Montréal, [Potager d’Amérique latine](https://espacepourlavie.ca/potager-damerique-latine). | Uses `Yacón ou poire de terre` with *Smallanthus sonchifolius*, places it under root vegetables, describes root harvest and consumption, and lists jicama separately. Direct local institutional/community-facing evidence, not an OQLF ruling or retail stock record. |
| **WP06-YACON-QC-DISPLAY-20261011-S05** | Espace pour la vie / Jardin botanique de Montréal, [Potager multiculturel : l’Amérique latine](https://m.espacepourlavie.ca/blogue/potager-multiculturel-l-amerique-latine). | Public horticulture article uses `Yacón ou poire de terre`, separately identifies jicama and pepino / poire-melon, and describes pear as a flavor comparison. Community-facing usage, not formal terminology. |
| **WP06-YACON-QC-DISPLAY-20261011-S06** | La Boîte à Grains, [Sirop de Yacon Biologique](https://laboiteagrains.com/products/sirop-de-yacon-biologique-organic-traditions). | Québec retailer title and ingredient line use `Yacon` / `Sirop de racine de Yacon biologique`. It establishes local wording for processed syrup only, not the fresh root's product form or availability. |
| **WP06-YACON-QC-DISPLAY-20261011-S07** | Sabor Latino, Montréal, [Yacon 200gr](https://saborlatino.ca/produit/yacon-200gr/). | Montréal retailer uses the label `Yacon`; the listing provides no product-form description and categorizes it under flours and mixes. Supports local retail spelling only; do not infer fresh root, flour, or an alias from it. |

## Access limits and disposition

- The yacon-specific OQLF search was bounded to the exact spellings `yacon`, `yacón`, and `poire de terre`; no dedicated entry surfaced. No conclusion about OQLF's full database beyond that search is made.
- The CIP Genebank yacon page and its Andean-crop summary page returned HTTP 403 when opened on 2026-10-11. The previous identity proposal records their storage-root / conflicting organ wording, but this review does not claim to have independently revalidated those pages today.
- The Sabor Latino page leaves product type unspecified despite its flour/mix category. It cannot establish fresh-root availability or a flour identity.
- No explicit fresh-root Québec retail listing was found in this bounded market search. Local garden evidence still directly supports the display for the edible root crop.

**Disposition:** Retain `yacón` as the fr-CA display and accept it for this catalog based on direct Québec institutional usage. Keep the formal OQLF status unclaimed, `poire de terre` and `jicama` out of aliases, and botanical organ wording unresolved.
