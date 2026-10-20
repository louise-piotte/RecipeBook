# WP02 B3 mung-bean starch: Québec French product-label review

- **Reviewed:** 2026-10-10
- **Status:** reviewed on 2026-10-10. The existing display was retained and five source records plus a scoped naming decision were added to the ledger; no ingredient row, alias, form, numeric value, or recipe changed.
- **Scope:** Independent Québec French review of the existing `ingredient-ref-mung-bean-starch` display. This is a terminology delta to the earlier B3 identity review, which relied on Canadian French finished-noodle ingredient wording from Well.ca. It does not repeat the starch identity decision or create a new candidate ID.
- **Source IDs:** `WP02-MUNG-STARCH-QC-20261010-S01` through `S07`; checked against the current `docs/` and `app/` source-ID corpus.

## Recommendation

**Retain the current pair `mung bean starch / amidon de haricot mungo` as an identity display, with the French term described as directly attested in Québec retail ingredient text.** Metro's Québec French listing uses the exact unqualified phrase for a vermicelli component, and Montréal retailer SUE Foods lists the closely related product wording `amidon de haricot mungo vert`. These are market-label attestations, not OQLF approval of the complete starch compound and not standalone mung-bean-starch package names. [S01–S03]

The display should remain source-bounded. OQLF provides `haricot mungo` as the preferred French name for *Vigna radiata* and pairs that entry with English `mung bean`; a separate OQLF entry warns that the same French term can also designate *Vigna mungo* (urd/black gram). Therefore, this wording review does **not** close the botanical-scope flag for every unqualified market occurrence. Keep the existing candidate limited to extracted *V. radiata* starch where the source establishes that species; do not map unqualified `black gram starch`, `urd starch`, or every product labelled `haricot mungo` to it. [S03–S04, S06–S07]

| Phrase or candidate | Disposition | Scope and limit |
|---|---|---|
| `mung bean starch / amidon de haricot mungo` | **Accept the current display wording.** | The exact French phrase occurs in a Québec grocery listing's ingredient text. Treat it as Québec-market wording, not as a compound term selected by OQLF. Retain the current ID `ingredient-ref-mung-bean-starch`; add no new ID. [S01, S03] |
| `amidon de haricot mungo vert` | **Hold as a global alias; keep as source-specific wording only.** | SUE Foods lists it in a mixed vermicelli ingredient declaration that also names pea starch. The page does not identify the botanical species or establish this exact phrase as a general starch-package name. Do not extend it to every mung-starch product. [S02–S04] |
| `fécule de haricot mungo`, `amidon de haricots mungo`, `green bean starch`, `black gram starch`, `urd starch` | **Hold; no alias proposed.** | The reviewed Québec sources do not establish these as equivalent labels for the existing source-bounded identity. OQLF's overlap between *V. radiata* and *V. mungo* makes broad species aliases especially unsafe. [S03–S04] |
| `nouilles à base de farine de haricot mungo`, `bean thread cellophane noodles`, and glass vermicelli | **Keep separate from the starch reference.** | OQLF's bilingual entry names a finished noodle product. A noodle's ingredient statement may disclose one or several starches; it is not a starch package or an alias for the isolated ingredient. The active noodle reference remains separate. [S01–S02, S05] |

## Evidence by question

### Identity and French terminology

- OQLF's *haricot mungo* entry pairs the preferred French pulse name with `mung bean` and *Vigna radiata*. This supports the French base noun; it does not name an extracted starch. [S03]
- OQLF's separate *haricot mungo* entry for *Vigna mungo* explicitly warns that French `haricot mungo` is used for two species. That limits the species inference available from an unqualified French product phrase. [S04]
- Metro's Québec French product listing uses `amidon de haricot mungo` inside the ingredients for its spring-roll vermicelli. SUE Foods' French Pagoda vermicelli listing uses `amidon de haricot mungo vert` alongside pea starch and water. These are direct local label-text attestations for an ingredient phrase, but neither page identifies the botanical species of the starch. [S01–S02]
- A primary food-science study separately isolates mung-bean starch from whole seed and dehulled seed material and tests starch noodles. It supports a real extracted-starch material boundary from whole-bean flour and finished noodles; its laboratory results do not establish universal product composition or a Québec term. [S06]
- The manufacturer's page for its own mung-bean starch identifies *Vigna radiata* and a water-washing extraction process. This is evidence for that manufacturer's product only; it does not identify the starch used in the Québec vermicelli listings. [S07]
- OQLF's noodle entry uses `nouilles à base de farine de haricot mungo` for the finished product. Preserve that existing noodle identity separately; do not reinterpret OQLF's word `farine` as a general French name for isolated mung-bean starch. [S05]

### Measurement and unit mappings

The live ledger currently records `measurementState: not_yet_researched` with no measurement observations. Retain that state in this terminology packet. The reviewed label sources give package sizes for finished vermicelli, not a mass for the starch ingredient. The primary study's extraction yield, laboratory concentrations, and test-noodle protocol are experimental method data, not kitchen spoon/cup measures or density evidence. The manufacturer source's product specifications and process values are also product-specific and do not supply a kitchen measure.

Keep `defaultDensity` null and `unitMappings` empty. Add no forms, package-to-recipe mappings, household measures, mass-volume conversion, yield, or numeric observation from this review. In particular, do not back-calculate mung-starch mass from a mixed vermicelli ingredient list or finished-noodle package weight.

### Substitution

The live ledger currently records `substitutionResearchState: not_yet_researched` and no substitution findings. Keep that state and create no global or contextual substitution rule here. A manufacturer page makes product-specific formulation claims about its own mung-bean starch, including comparison with corn starch; it does not define a RecipeBook dish role, target product grade, or validated home-recipe substitution. Treat those claims as a separate future research lead only. Do not activate a weight ratio, 1:1 replacement, starch-to-flour swap, or thickening rule. [S07]

## Current-package and recipe audit

This read-only audit used the active seed references and forms, research ledger, legacy candidates, and every manifest-listed recipe file.

| Surface | Current snapshot |
|---|---|
| Canonical references | 796 rows; SHA-256 `daa87d5fec47b702f1555ad598f8c92b241b0ec0864865fb498afa1cc55327b8` |
| Forms | 36 rows; SHA-256 `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Research ledger | 1,022 records; SHA-256 `6632b7ed1154c775602683d3874745841fb7d53525f6e048a4c06138f6910165` |
| Legacy import candidates | 81 rows; SHA-256 `2749996a0cb7e19a5646a42ac4045e40f50ea792395a42e970c500bfe3dd1503` |
| Seed manifest | SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipes | 114 files / 1,123 ingredient rows; manifest-ordered corpus SHA-256 `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |

The active reference `ingredient-ref-mung-bean-starch` is already displayed as `mung bean starch / amidon de haricot mungo`, category `FLOUR_AND_STARCH`; both alias arrays are empty, density is null, and unit mappings are empty. The ledger identity state is `needs_clarification`; its measurement and substitution states remain `not_yet_researched`, with no observations or findings. No matching form or legacy candidate exists. The neighboring active finished-product row is `ingredient-ref-bean-thread-cellophane-noodles / bean thread cellophane noodles / nouilles à base de farine de haricot mungo`; keep it separate.

The exact phrase audit found **zero** mung-starch ingredient-line hits and zero recipe-text matches across all 114 recipes. Do not relink recipes or infer demand from the separate bean-thread-noodle identity. No other active-reference exact full-name collision was found; a broad search for `haricot mungo` can retrieve both the starch and finished-noodle rows, which is a useful distinction rather than an alias relationship.

## Boundaries for any later integration

- Preserve `ingredient-ref-mung-bean-starch` as the existing ID; do not add another source-named row from these retail ingredient declarations.
- Keep the current French display as the accepted direct Québec-market phrase, while leaving the broader species ambiguity flagged. Do not claim that OQLF approves `amidon de haricot mungo` as a compound starch term.
- Do not add `amidon de haricot mungo vert` as a global alias unless a future source ties it to the candidate's taxon and product scope.
- Keep extracted starch separate from whole mung beans, mung-bean flour, urd/*Vigna mungo* starch, pea starch, the mixed vermicelli products, and other botanical starch sources.
- Add no `RecipeIngredientForm`, density, unit mapping, household conversion, measurement observation, package yield, recipe link, or substitution edge.

## Source register

All online sources below were checked on 2026-10-10. Source IDs use the unique prefix `WP02-MUNG-STARCH-QC-20261010`.

- **S01 — Metro Canada, [Rouleaux de printemps aux légumes surgelés Irrésistible](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/repas-et-plats-d-accompagnement/plats-vegetariens/rouleaux-de-printemps-aux-legumes-surgeles/p/059749927925).** Québec French retailer listing; the ingredient declaration says the vermicelli contains `amidon de haricot mungo`, alongside peas and corn starch. This is an ingredient in a finished product, not a standalone starch label. The Metro page was indexed with this ingredient text; direct page opening returned HTTP 403 during this audit.
- **S02 — SUE Foods, [Vermicelles aux haricots (lungkow), Pagoda Brand](https://suefoods.com/products/pagoda-brand-vermicelles-aux-haricots-lungkow).** Montréal retailer page in French; its ingredient declaration reads `amidon de pois, amidon de haricot mungo vert, eau`. It supports product-specific label wording, not a general alias or a botanical identification of the starch. The page lists the complete finished-noodle package size, not a starch quantity.
- **S03 — OQLF, [haricot mungo — *Vigna radiata* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082840/haricot-mungo), GDT.** Lists preferred French `haricot mungo`, English `mung bean`, and Latin *Vigna radiata*. It names the pulse, not its extracted starch.
- **S04 — OQLF, [haricot mungo — *Vigna mungo* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo), GDT.** Notes that the French term `haricot mungo` can designate either *V. radiata* or *V. mungo*; the latter is also called urd/black gram in English.
- **S05 — OQLF, [nouilles à base de farine de haricot mungo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18045583/nouilles-a-base-de-farine-de-haricot-mungo), GDT.** Québec French name for a finished noodle product, with English `bean thread cellophane noodles`; not a starch naming authority.
- **S06 — U. Singh et al., [“Physicochemical Characteristics of Pigeonpea and Mung Bean Starches and Their Noodle Quality”](https://oar.icrisat.org/7749/1/JFS_54_5_1293-1297_1989.pdf), *Journal of Food Science* 54(5), 1989.** Primary study isolates starch from whole-seed and dehulled mung-bean samples and tests starch noodles. Laboratory extraction and performance data are not kitchen conversion or substitution recommendations.
- **S07 — Organicway, [Mung Bean Starch Powder](https://www.organic-way.com/products/organic-mung-bean-starch/).** Manufacturer's product-specific description identifies its starch as extracted from *Vigna radiata*. Its formulation comparison with corn starch is recorded only as a scoped research lead and is not adopted as a household substitution, global ratio, or catalog mapping.

## Integration review

Root verified the Metro listing through its current indexed ingredient declaration (direct page access returned 403), the Montréal SUE Foods listing, and the OQLF entries on 2026-10-10. The live display `mung bean starch / amidon de haricot mungo` remains unchanged. Added ledger source records S01–S05 and a decision that accepts the Québec-market wording while retaining `identityState: needs_clarification` for the *Vigna radiata* / *Vigna mungo* ambiguity. No alias, form, measurement, mapping, recipe link, or substitution was added. See `docs/catalog/batches/wp03-puffed-quinoa-and-wp04-recipe-source-corrections-identity-integration-20261010/README.md`.
