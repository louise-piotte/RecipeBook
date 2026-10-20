# WP03 Section U rau om identity review

**Status:** coordinator-reviewed and integrated as identity-only `rice paddy herb / herbe à paddy`. The shared catalog, ledger, checklist, and verification record are in `docs/catalog/batches/wp02-wp03-wp04-residual-identities-integration-20261011/README.md`.
**Research date:** 2026-10-11.
**Scope:** the open Section U `rau om` herb candidate, with a focused distinction from WP06's active Vietnamese-coriander identity.

## Recommendation

Add a separate identity for the culinary herb *Limnophila aromatica*, using the well-attested display names `rice paddy herb / herbe à paddy`. The evidence supports this as a distinct plant and product, not an alias or form of Vietnamese coriander. The English alias `rau om` is listed for this taxon by EPPO; the French alias `limnophile aromatique` is also source-attested. Do not put `rau om` on the existing Vietnamese-coriander reference.

| Proposed field | Value |
|---|---|
| ID | `ingredient-ref-rice-paddy-herb` |
| English display | `rice paddy herb` |
| Québec French display | `herbe à paddy` |
| English alias | `rau om` |
| French alias | `limnophile aromatique` |
| Category | `HERB` |

Keep the Vietnamese spellings `ngò om` and `ngò ôm` as source evidence, but leave them out of the English and French alias arrays until the project settles how non-English, non-French vernaculars should be assigned to locale-specific alias fields. Do not use `Vietnamese coriander`, `coriandre vietnamienne`, `rau ram`, or `rau răm` for this reference; those name *Persicaria odorata*. Do not use `menthe aquatique`; Canadian terminology maps that name to *Mentha aquatica*. Avoid unqualified `rau ngổ`, which can identify other plants in Vietnamese usage.

## Taxon and identity boundary

Kew's Plants of the World Online accepts *Limnophila aromatica* and lists *Limnophila chinensis* subsp. *aromatica* among its synonyms [WP03-RAU-OM-20261011-S01]. EPPO assigns `rice paddy herb` and `rau om` as English names and `limnophile aromatique` as a French name to the same accepted taxon [WP03-RAU-OM-20261011-S02]. A Vietnamese city agriculture department identifies `ngò om` among names for *L. aromatica* and describes the plant as an aromatic culinary herb used with phở, hủ tiếu, and sour fish soup [WP03-RAU-OM-20261011-S05]. A Ho Chi Minh City university journal likewise identifies rau om as *L. aromatica* and describes its use as seasoning, especially in southern Vietnamese sour soup and fish soup [WP03-RAU-OM-20261011-S06].

The bilingual Montréal menu at Hàngbar uses `herbe à paddy` and `rice paddy herb` for the same beef-salad ingredient, alongside the separately named `coriandre longue / sawtooth coriander` [WP03-RAU-OM-20261011-S07, WP03-RAU-OM-20261011-S08]. A Québec producer also lists `Herbe à Paddy` as an ingredient in a seasoning blend; that product label supports Québec French usage but does not identify the plant species [WP03-RAU-OM-20261011-S09]. Health Canada's bilingual crop-group lists use French `Herbe à paddy` and English `Swamp leaf` for fresh and dried leaves under *Limnophila chinensis* [WP03-RAU-OM-20261011-S03]. Because that federal entry omits a subspecies and Kew recognizes only *L. chinensis* subsp. *aromatica* as the synonym of *L. aromatica*, use Kew/EPPO for the proposed taxon; treat the Health Canada page as Canadian terminology evidence, not as a broader taxonomic equivalence.

The distinction from the active Vietnamese-coriander reference is direct. The Commission's plant list gives `Herbe à paddy / Limnophile aromatique` for *L. aromatica* and separately lists `Coriandre vietnamienne` for *Persicaria odorata* [WP03-RAU-OM-20261011-S04]. PROSEA likewise assigns `rau ram / Vietnamese coriander / renouée odorante` to *P. odorata* [WP03-RAU-OM-20261011-S11]. A 2015 Québec report repeats `menthe aquatique` as a label for a recalled `Ngò Ôm` product [WP03-RAU-OM-20261011-S10], but Health Canada's crop list assigns `Menthe aquatique` to *Mentha aquatica*, a different species [WP03-RAU-OM-20261011-S03]. Exclude that ambiguous label from aliases.

The Hanoi agriculture page also warns that `rau ngổ` can be confused with `rau ngổ trâu` (*Enhydra fluctuans*) [WP03-RAU-OM-20261011-S05]. For that reason, do not activate bare `rau ngổ` as an alias even though the page reports it among local names for *L. aromatica*.

## Live catalog and recipe audit

At review time, the bundled package contained **922 ingredient references, 51 forms, 114 recipes, and 1,123 ingredient rows**; the legacy import identity list contained 76 candidates. I checked the proposed ID and normalized name candidates against active reference names and aliases, form labels and match terms, and legacy names and aliases. `rice paddy herb`, `herbe à paddy`, `limnophile aromatique`, and `rau om` had no exact normalized collision. The active `ingredient-ref-vietnamese-coriander` has the distinct display names `Vietnamese coriander / coriandre vietnamienne` and no `rau om` alias.

I scanned all recipe files in the 114-recipe manifest for ingredient-name and source-line matches to the candidate names and known variants, including `rice paddy herb`, `herbe à paddy`, `limnophile aromatique`, `rau om`, `ngò om`, `ngò ôm`, `rau ngổ`, and `swamp leaf`. There were no matches. The Montréal restaurant menu and Québec seasoning label are external terminology/use evidence, not bundled-recipe demand; no recipe link is proposed.

## Integration limits

This is an identity-only recommendation. Do not add forms, quantities, measurements, density, unit mappings, conversions, yields, or substitutions from the cited crop listings, menus, or research article. No recipe line or recipe text is proposed for editing. Keep the source botanical identity separate from aquarium/ornamental use of plants sold under similar *Limnophila* names; the cited culinary evidence concerns the named food herb, not a general crosswalk for the genus.

## Sources

All sources below were checked on 2026-10-11. Each source supports only the stated name, taxon, or culinary use.

- **[WP03-RAU-OM-20261011-S01]** Royal Botanic Gardens, Kew, Plants of the World Online, [*Limnophila aromatica*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:804287-1). Taxon accepted at lines 45–51; synonym list, including *L. chinensis* subsp. *aromatica*, at lines 74–83.
- **[WP03-RAU-OM-20261011-S02]** European and Mediterranean Plant Protection Organization (EPPO), [EPPO Global Database: *Limnophila aromatica*](https://gd.eppo.int/taxon/LIOAR). Preferred taxon and authority, English `rau om` / `rice paddy herb`, French `limnophile aromatique`, and taxonomy at lines 11–32 and 46–49.
- **[WP03-RAU-OM-20261011-S03]** Health Canada, Pest Management Regulatory Agency, [Groupes de cultures et propriétés chimiques de leurs résidus](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html) and [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html). French `Herbe à paddy` with *Limnophila chinensis* at lines 2364–2365; English `Swamp leaf` with the same listed taxon at lines 2532–2533. The English list separately assigns `Coriander, Vietnamese` to *Persicaria odorata* and `Watermint` to *Mentha aquatica* at lines 2625–2627 and 2761.
- **[WP03-RAU-OM-20261011-S04]** European Commission, [Commission Implementing Regulation (EU) 2018/62](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX:32018R0062), Annex I, commodity codes 0256080-022 and 0256080-025. The first gives `Herbe à paddy / Limnophile aromatique / Phank ka Yaeng` for *Limnophila aromatica*; the second separately lists `Coriandre vietnamienne` for *Persicaria odorata*.
- **[WP03-RAU-OM-20261011-S05]** Hanoi Department of Agriculture and Environment, [Rau ngổ trị sỏi thận](https://sonnptnt.hanoi.gov.vn/cat172/113/Rau-ngo-tri-soi-than). Lines 27–28 identify `rau ngổ`, `ngò om`, `ngổ hương`, and related names with *L. aromatica* and culinary-herb use; lines 37–39 describe food use and warn of confusion with *Enhydra fluctuans*. Medicinal claims on this page were not used.
- **[WP03-RAU-OM-20261011-S06]** Industrial University of Ho Chi Minh City, *Journal of Science and Technology*, [Ảnh hưởng của hàm lượng nước và thời gian trên hiệu suất trích li tinh dầu rau om (*Limnophila aromatica*)](https://jst.iuh.edu.vn/index.php/jst-iuh/article/download/566/291/), 2020. Page 16 identifies the herb and its use in southern Vietnamese sour soup and fish soup (PDF lines 45–48).
- **[WP03-RAU-OM-20261011-S07]** Hàngbar Montréal, [Group menu (PDF)](https://hangbar.ca/wp-content/uploads/2024/01/Hang_Group-menu_January-25-2024-1.pdf). Bilingual beef-salad entry names `herbe à paddy / rice paddy herb` separately from `coriandre longue / sawtooth coriander`.
- **[WP03-RAU-OM-20261011-S08]** Hàngbar Montréal, [Contact](https://hangbar.ca/contact/). Restaurant address at 686 Notre-Dame Ouest, Montréal, Québec.
- **[WP03-RAU-OM-20261011-S09]** Domaine La Balzane, [Rub Feu de Camp](https://labalzane.ca/collections/garde-manger/products/rub-feu-de-camp) and [Garde-manger](https://labalzane.ca/collections/garde-manger). Product listing includes `Herbe à Paddy`; the collection page identifies the Québec producer in Saint-Simon, Québec. Used only for Québec French retail wording.
- **[WP03-RAU-OM-20261011-S10]** Journal de Québec / Agence QMI, [Des herbes possiblement contaminées à la Salmonella](https://www.journaldequebec.com/2015/10/08/des-herbes-possiblement-contaminees-a-la-salmonella), 2015-10-08. Reports a Canada Herb `Ngò Ôm` product sold in Québec and Ontario and repeats `menthe aquatique`; this source is used only to flag the ambiguous label, not to establish botanical identity.
- **[WP03-RAU-OM-20261011-S11]** Plant Resources of South-East Asia (PROSEA), [*Persicaria odorata*](https://prosea.prota4u.org/view.aspx?id=587). Taxon at lines 14–16; `rau ram`, `Vietnamese coriander`, and French `renouée odorante` at line 35.
