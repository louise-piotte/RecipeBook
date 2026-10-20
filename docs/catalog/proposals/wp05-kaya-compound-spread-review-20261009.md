# WP05 kaya compound-spread review

Owner: /root/sea_pantry_batch. Status: independent review of the kaya candidate already listed in `wp05-southeast-asian-condiments.md`; coordinator integration is recorded below. Sources accessed: 2026-10-09. Scope: kaya identity and aliases, pandan and coconut/palm syrup boundaries, variant handling, and Québec French naming.

## Current repository state

I read `AGENTS.md`, the catalog evidence rules, current WP05 plan entries, and the existing Southeast Asian condiment and pandan proposals. The plan still lists kaya alongside palm-sugar syrups and pandan preparations. The existing candidate remains pending; no kaya reference is integrated.

| Live input | Current state | SHA-256 |
| --- | --- | --- |
| `ingredient-references.v1.json` | 414 references; no kaya, srikaya, or coconut-jam entry | `5f7cca9264d410c2c2e619321fc0daa7ed6a6907630225dd490ba0894ce8288e` |
| `ingredient-forms.v1.json` | 16 forms; no kaya form | `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` |
| `research-ledger.v1.json` | 579 records, 8 unit-conversion records; no kaya candidate | `db6ac4439396eca82f5f66508d30d538f5b4686431e09d87240239060143c647` |
| `legacy-import-identities.v1.json` | 99 candidates; no kaya candidate | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| `RecipeBook-global-ingredient-catalog-plan.txt` | Section X lists kaya, palm-sugar syrups, and pandan preparations | `fcb2eb8f7f21b01f0ed3ab2163b181321b62334b6e94955f3e47a04bfbe221a2` |
| Bundled recipes | 114 recipe JSON files | — |

The live catalog already has separate `coconut`, `coconut milk`, `cream of coconut`, `coconut oil`, and `pandan leaves` rows. It has no coconut syrup or palm sugar syrup row. These existing ingredients and related candidates do not collide with kaya and are not aliases of the spread.

## Review conclusion

The compound-spread boundary is sound. Recommend one `kaya` identity for the egg-and-coconut spread, with pandan flavoring or caramelized sugar represented as named styles/recipe descriptors under that identity. Singapore's National Heritage Board describes kaya as an egg jam made with coconut milk and sugar, then identifies pandan-infused green Peranakan-style kaya and brown Hainanese-style kaya with caramelized sugar. A Singapore kaya maker independently sells “Green Pandan Kaya” and “Brown Caramel Kaya” under the same kaya product family. The style names do not justify separate ingredient rows and should not be aliases to one another.

The identity is separate from pandan leaves, coconut milk/cream, coconut sap syrup, and palm-sap syrup. Those may be ingredients or flavor sources in a recipe, but they are different plant parts, product forms, and levels of preparation. Keep the existing source-specific Kampong Speu palm-sugar syrup proposal separate. Do not use unqualified `coconut jam` as an alias: Philippine government technical material uses “coco jam” for a coconut-milk-and-sugar spread without eggs, while kaya is identified as an egg jam.

The proposed French descriptor is understandable but not established as Québec terminology. OQLF supports the component term `lait de coco`, and French-language recipe sources call kaya `confiture de lait de coco`; however, the Québec-français product evidence is either an automatically translated Canadian marketplace listing for an ube kaya product or absent. Recommend `kaya` as the display name in both locales. If a French gloss is kept in prose, mark it as a descriptive translation pending Québec review; do not add it as a French alias yet.

### Reviewed payload for the existing candidate

| Field | Review recommendation | Evidence / boundary |
| --- | --- | --- |
| Identity | Keep one compound spread identity for kaya. Do not add another row from this review. | Official heritage description and manufacturer examples place both green pandan and brown caramel styles under kaya. |
| `nameEn` | `kaya` | Official heritage and product sources use the loan name. |
| `nameFr` | `kaya` | Best-supported fr-CA candidate because the culturally specific product name is retained in the Canadian French listing; no authoritative Québec translation was found. |
| `aliasesEn` | Consider only `kaya jam`; do not alias `coconut jam`, `coconut egg jam`, or style names. | Science Centre Singapore uses “Kaya Jam” as a product term. “Coconut jam” is used for other eggless coconut spreads. |
| `aliasesFr` | `[]` pending Québec terminology review. | `confiture de lait de coco` has French-language culinary use, but the exact proposed phrase is not established as a Québec French term. |
| Category | `SAUCE_AND_CONDIMENT` is the closest available category for a sweet bread spread; confirm with the taxonomy owner. | Sources call kaya a jam/spread. It is a finished compound, not a sweetener or syrup. |
| Style handling | Keep `Peranakan/green/pandan` and `Hainanese/brown/caramelized sugar` as style or preparation descriptors within kaya. | Styles are documented as kaya variants, not synonyms for each other. No ingredient-form row is warranted by the style distinction. |
| Measurement and substitutions | No values or rules proposed. | Product/recipe quantities do not establish a generic kaya density, yield, conversion, or replacement rule. |

## Boundary and alias decisions

- **Pandan leaves:** The live `ingredient-ref-pandan-leaves` row is a botanical leaf ingredient. Kaya may be flavored with pandan leaves, but a finished sweet egg-and-coconut spread is not a pandan form or alias. `Pandan kaya` and `green pandan kaya` are variant product names, not aliases for the leaf.
- **Pandan versus caramel style:** The heritage source treats both as recognized kaya styles. A recipe source also prepares one kaya by caramelizing sugar and permits pandan to be included or omitted, showing that descriptors need not represent mutually exclusive ingredient identities. Keep style wording available in recipe text; do not make green and brown separate canonical ingredients.
- **Coconut milk and cream:** OQLF defines `lait de coco` as a mixture made from coconut flesh and water. The live coconut milk and cream-of-coconut rows remain ingredient inputs; they are not names for the finished kaya spread.
- **Coconut jam:** Avoid the broad English alias. Science Centre Singapore uses “coconut jam” as a synonym for kaya jam, but Philippine DOST material separately documents coco jam made with coconut milk, sugar, glucose, and acid, without eggs. Thus the bare term can collapse distinct coconut spreads. `Coconut egg jam` may remain an explanatory gloss, not an alias.
- **Coconut syrup:** Coconut sap syrup is a syrup ingredient, not a coconut-milk-and-egg spread. Philippine Coconut Authority material defines coconut sap syrup from boiled coconut sap and treats coconut spread as a different finished product. This source is indexed but its PDF returned 403 on direct fetch; use it only as secondary corroboration of the boundary.
- **Palm sugar syrup:** The EU protected-geographical-indication description identifies Kampong Speu palm sugar as produced from *Borassus flabellifer* sap and lists syrup as one product form. Keep the proposal's source-specific sweetener separate from kaya. A kaya recipe may use palm sugar or caramelized sugar, but that does not make kaya an alias, form, or syrup.
- **Style phrases:** Do not activate `green kaya`, `brown kaya`, `green pandan kaya`, `brown caramel kaya`, `Peranakan kaya`, or `Hainanese kaya` as aliases to one another. They express distinct source-documented styles. A future UI may preserve them as variant descriptors without adding ingredient rows.
- **French name:** `confiture de lait de coco et d’œuf` is a transparent descriptor, not a verified Québec French product name. OQLF supports `lait de coco`; a France-based recipe page uses `confiture de lait de coco (kaya)` and eggs; a Canadian French marketplace listing says `Confiture Ube Kaya` and describes kaya as a sweet spread, but explicitly notes automatic translation and refers to an ube variant. Keep `kaya` as the fr-CA display name until a Québec reviewer approves a descriptor.

## Normalized-key and recipe audit

I applied the repository `normalize_search_key` semantics from `tools/seed_package/bundled_seed_package.py` (case-fold, Unicode decomposition, accent and common-ligature folding, then replace non-alphanumeric runs with spaces) to current reference names/aliases and form labels/match terms.

- **Zero exact normalized collisions** for `kaya`, `kaya jam`, `coconut jam`, `coconut egg jam`, `confiture de lait de coco et d’œuf`, `confiture de lait de coco`, `green kaya`, `brown kaya`, `green pandan kaya`, `brown caramel kaya`, `Hainanese kaya`, `Peranakan kaya`, `pandan kaya`, `coconut syrup`, `palm sugar syrup`, or `sirop de sucre de palme`.
- Existing exact keys relevant to the boundary are `coconut`, `coconut milk`, `cream of coconut`, and `pandan leaves`, each on its own reference. They are not proposed aliases. There is no current palm-sugar syrup reference.
- Scanned all 114 recipe JSON files across their text fields, including recipe names and ingredient lines, for kaya/srikaya/serikaya, `kaya jam`, coconut-jam descriptors, green/brown and regional style phrases, and coconut/palm syrup terms. **No recipe-text match was found; no recipe relink is proposed.**
- Kaya-related wording was absent from the current 99 legacy candidates and all 579 ledger records. Forms contain no kaya product or style.

## Source-to-claim map

All sources accessed on 2026-10-09. Vendor pages and listings can change.

1. **WP05-KAYA-S01** Singapore National Heritage Board, [Traditional Breakfast of Kaya and Kopi](https://www.roots.gov.sg/ich-landing/ich/traditional-breakfast-of-kaya-and-kopi). The indexed page text identifies kaya as an egg jam made with coconut milk and sugar, Peranakan-style kaya as pandan-infused and green, and Hainanese-style kaya as brown from caramelized sugar. Direct page opening returned an anti-bot page during this review; the indexed content is the source for these claims.
2. **WP05-KAYA-S02** Science Centre Singapore, [Sweet Science: Uncovering the Magic of Kaya Jam](https://voiddeck.science.edu.sg/articles/diy/kaya-jam/), lines 13–22 and 29–64. Defines kaya/coconut jam as a sweet creamy spread made with coconut cream, eggs, sugar, and sometimes pandan; explains egg thickening and gives a kaya recipe. Supports compound-spread identity, not generic alias scope or a catalog measurement.
3. **WP05-KAYA-S03** Fong Yit Kaya, [brand homepage](https://www.fongyitkaya.com/), lines 20–38 and 43–56; [Brown Caramel Kaya](https://www.fongyitkaya.com/product-page/brown-caramel-kaya), lines 24–26; and [Green Pandan Kaya](https://www.fongyitkaya.com/product-page/green-pandan-kaya-fong-yit-kaya), lines 24–26. The maker lists brown caramel and green pandan products under its kaya family and describes them as spreads/kaya styles. Product pages do not show a full ingredient declaration in the retrieved text; they are used only for product naming and style status.
4. **WP05-KAYA-S04** Office québécois de la langue française, [lait de coco](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26523378/lait-de-coco), lines 19–45. Supports `lait de coco` as Québec French for coconut milk, not the full translation of kaya.
5. **WP05-KAYA-S05** Faire, [Confiture Ube Kaya](https://www.faire.com/fr-ca/product/p_7zb6bbhgzp), lines 65–101 and 119–138. Canadian French marketplace wording includes `Confiture Ube Kaya`, a kaya description, and other kaya variant names; line 101 states the text was automatically translated. This supports limited Canadian-market exposure to the loanword and “confiture” wording, but not a Québec-approved translation for plain kaya.
6. **WP05-KAYA-S06** Journal des Femmes Cuisine, [Confiture de lait de coco (kaya)](https://cuisine.journaldesfemmes.fr/recette/341175-confiture-de-lait-de-coco-kaya), lines 79–99 and 125–137. French culinary source supports the descriptive phrase and identifies eggs, coconut milk, sugar, and optional pandan. The recipe caramelizes sugar and can include pandan in the same kaya preparation; this is corroborative culinary evidence, not Québec terminology authority.
7. **WP05-KAYA-S07** Philippine Department of Science and Technology, Industrial Technology Development Institute, [Coconut Food Products](https://itdi.dost.gov.ph/images/LivelihoodTechnologyBrochures/04-Coconut_Food_Products.pdf), indexed entry “COCO JAM (Low-Fat)”. It describes coco jam using coconut skim milk, brown sugar, glucose, and citric acid, without eggs. Direct PDF fetch returned 403; the indexed government PDF text supports the narrow point that `coco jam` can mean a non-kaya, eggless coconut spread.
8. **WP05-KAYA-S08** Philippine Coconut Authority, [Coconut Spread guide](https://www.pca.gov.ph/images/brochure/2023/FPDD_Guide_No_06_Coconut_Spread.pdf), indexed sections “Coconut sap syrup” and “Coconut Spread Production”. The guide distinguishes a syrup made by boiling coconut sap from a finished spread made with coconut milk and syrup. Direct PDF fetch returned 403, so use only as corroboration.
9. **WP05-KAYA-S09** European Commission, [Skor Thnot Kampong Speu single document](https://eur-lex.europa.eu/legal-content/EN/TXT/?toc=OJ%3AC%3A2017%3A331%3AFULL&uri=uriserv%3AOJ.C_.2017.331.01.0008.01.ENG). Indexed official text identifies the product as palm sugar from *Borassus flabellifer* sap and lists syrup palm sugar among its market forms. This supports keeping the named sweetener separate from kaya; the direct page was blocked by anti-bot verification.

## Recommended acceptance checks

- Keep the existing single kaya candidate as a compound spread; do not add a second record for a green/pandan or brown/caramel style.
- Prefer `kaya / kaya`; consider the exact English alias `kaya jam`. Keep broad `coconut jam` and the French descriptive phrase out of aliases until disambiguation and Québec language review.
- Keep style qualifiers and the source-specific Kampong Speu palm-sugar syrup separate from the kaya identity. Do not merge kaya with `pandan leaves`, coconut milk, cream of coconut, or sap syrup.
- Retain `SAUCE_AND_CONDIMENT` only as the closest current category and confirm with the taxonomy owner; do not classify the spread as a sugar/syrup identity.
- Re-run the exact-key and 114-recipe audits against the live package immediately before integration. This packet records the state at review time only.

## Coordinator integration result

Added one `kaya / kaya` compound spread identity with only the English alias `kaya jam`, in
`SAUCE_AND_CONDIMENT`. Pandan and caramel styles remain within the same identity; broad `coconut
jam` and French descriptive phrases remain outside its aliases. No density, unit mapping, form,
or substitution rule was added. The independent Québec French label review and broader Section X
coverage remain open.

Canonical post-merge snapshot: 446 ingredient references, 16 forms, and 612 research-ledger records.
