# WP06 makrut lime leaf identity and naming review

**Review date:** 2026-10-09

**Status:** integrated on 2026-10-09 as one leaf-specific identity with fresh, frozen, and dried forms. See the coordinator's [integration batch record](../batches/wp06-makrut-lime-leaves-20261009/README.md). The original proposal audit is a pre-integration snapshot; the Thai Department of Internal Trade PDF link was unavailable on recheck and is not used as integration evidence.

## Recommendation

**Accept a new leaf-specific HERB identity** for *Citrus hystrix* leaves, separate from the fruit, rind/zest, juice, generic lime, and lime juice. Use:

| Locale | Proposed display | Basis and limits |
|---|---|---|
| EN | `makrut lime leaves` | OQLF gives `makrut lime` as the English name of *Citrus hystrix* and notes that the leaves flavor Asian dishes [S02]. A University of California Agriculture and Natural Resources extension guide uses `makrut lime leaves` for the culinary leaf [S08]. |
| fr-CA | `feuilles de combava` | OQLF’s preferred French fruit name is `combava`; its entry explicitly says the fruit’s leaves are used to flavor dishes [S02]. No distinct OQLF or TERMIUM record for the leaves was located, so this transparent leaf phrase is provisional rather than a quoted official term. |

Use one reference for the leaf ingredient and three forms under it:

| Form | EN form label | fr-CA form label | Boundary |
|---|---|---|---|
| Fresh | `fresh makrut lime leaves` | `feuilles fraîches de combava` | UCANR explicitly names fresh makrut leaves [S09]; OQLF notes the culinary use of the leaves [S02]. |
| Frozen | `frozen makrut lime leaves` | `feuilles de combava congelées` | UCANR explicitly lists frozen leaves as a preservation state [S08–S09]. |
| Dried | `dried makrut lime leaves` | `feuilles de combava séchées` | UCANR lists dried leaves [S08–S09], and the Thai Herbal Pharmacopoeia defines dried *Citrus hystrix* leaf [S10]. Keep this under the leaf identity; do not make it a separate botanical ingredient. |

Do not add a conversion, density, unit mapping, fresh-to-dried ratio, or substitution. The source supports the relationship between fresh leaves and a dried-leaf product, but supplies no culinary quantity equivalence.

Use only the following low-risk singular aliases, each a number variant of the qualified display phrase: EN `makrut lime leaf`; fr-CA `feuille de combava`. The English phrase is grounded in the exact culinary term `makrut lime leaves` [S08]; the French singular is a transparent number variant of the provisional OQLF-based leaf display [S02]. Keep all aliases explicitly leaf-qualified.

Do not store `kaffir lime leaves`, `kaffir lime`, or bare `kaffir` as global display or alias terms. The American Heritage Dictionary labels `kaffir lime` offensive and redirects to `makrut lime`; the Dictionary of South African English records `kaffir` as offensive in all senses and combinations in South African English [S06–S07]. These sources establish a real English usage hazard; this proposal follows the safer makrut wording. OQLF also lists `lime kaffir` and `lime de Cafre` for the fruit, but that fruit entry does not establish these as safe leaf names [S02]. The Thai trade guide's English wording is not adopted, and its PDF link returned 404 on coordinator recheck [S03].

Do not alias `combava` by itself, since OQLF defines that as the fruit. Do not alias generic `lime leaves`, `Thai lime leaves`, or unqualified `makrut lime`; the sources do not establish these as precise leaf-product names. Keep Thai `ใบมะกรูด` / the romanization `bai makrut` in evidence notes, not as an app alias: the app normalizer currently strips Thai script, and the borrowed Thai phrase is not needed for the proposed bilingual displays.

## Identity and use boundary

Royal Botanic Gardens, Kew, Plants of the World Online accepts *Citrus hystrix* DC. and lists *Citrus × aurantium hystrix* as a synonym [S01]. Use accepted *C. hystrix* in the proposal’s identity note. Kew’s current taxon page does not establish the exact spelling *Citrus × hystrix* as the accepted name; no catalog display should depend on that variant.

The evidence relied upon for integration is specifically about the **leaves**. OQLF identifies *Citrus hystrix* as `combava` / `makrut lime` and notes that its leaves flavor Asian dishes [S02]. UCANR describes the culinary use of makrut leaves and explicitly lists fresh, frozen, and dried states [S08–S09]. The Thai Herbal Pharmacopoeia separately defines dried *Citrus hystrix* leaf [S10]; it is a medicinal monograph, not a culinary recipe source. This supports a leaf identity distinct from the fruit product that OQLF names `combava` / `makrut lime`. The fruit’s juice, rind, and zest are not aliases or forms of the leaf. The earlier Thai Department of Internal Trade PDF [S03] was unavailable on recheck and is not relied upon.

The reviewed sources support fresh, frozen, and dried leaf forms. They do not support treating these states as different species or separate reference identities. UCANR describes the states as preservation/use options but supplies no recipe ratio; the dried-leaf monograph supplies no culinary conversion. No powder, extract, or paste form is proposed from this evidence set.

## Live catalog and exact collision audit

Snapshot read on 2026-10-09. Exact matching used the existing ingredient-search normalization: lowercase; NFKD; fold `œ`→`oe`, `æ`→`ae`, `ß`→`ss`, and `&`→`and`; remove combining marks; replace non-ASCII-letter/digit runs with spaces; collapse whitespace. Reference display names and aliases, all form labels/match terms, and legacy candidate names/aliases were checked as exact normalized phrases.

| Exact query or group | Active reference result | Forms / legacy result |
|---|---|---|
| `makrut lime leaves`, `makrut lime leaf`, `makrut leaves`, `makrut leaf`, `makrut lime`, `bai makrut` | No exact active match. | No exact form or legacy match. |
| `feuilles de combava`, `feuille de combava`, `feuilles de lime makrut`, `feuille de lime makrut`, `combava leaves`, `combava leaf`, `combava`, `citron combava` | No exact active match. | No exact form or legacy match. |
| `Citrus hystrix`, `Citrus x hystrix`, `Citrus × hystrix`, `Citrus × aurantium hystrix` | No exact active match. | No exact form or legacy match. |
| `kaffir lime leaves`, `kaffir lime leaf`, `kaffir lime`, `thai lime leaves`, `thai lime` | No exact active match. | No exact form or legacy match. These terms were scanned for collision only; they are not proposed aliases. |
| `lime leaves`, `lime leaf`, `lime peel`, `lime zest` | No exact active match. | No exact form or legacy match. |
| `lime juice` | Exact active result: `ingredient-ref-lime-juice`, `lime juice` / `jus de lime`, category `SAUCE_AND_CONDIMENT`. | No exact form or legacy match. |
| `lime` | No exact active reference. | Exact legacy-only candidate: `ingredient-ref-lime`, `lime` / `lime`. No promotion is proposed. |

No tested makrut/combava/leaf/botanical term collides with the current 22 forms or 99 legacy candidates. The active `lime juice` row and inactive legacy `lime` candidate are neighboring concepts, not leaf aliases. Because a bare `lime` search is broad and the catalog already contains lime juice, do not add `lime` as an alias to the proposed leaf reference.

The scan used 29 raw phrases, which fold to 28 normalized keys: `makrut lime leaves`, `makrut lime leaf`, `makrut leaves`, `makrut leaf`, `makrut lime`, `bai makrut`; `kaffir lime leaves`, `kaffir lime leaf`, `kaffir lime`; `thai lime leaves`, `thai lime`; `combava leaves`, `combava leaf`, `feuilles de combava`, `feuille de combava`, `feuilles de lime makrut`, `feuille de lime makrut`, `combava`, `citron combava`; `Citrus hystrix`, `Citrus x hystrix`, `Citrus × hystrix`, `Citrus × aurantium hystrix`; `lime leaves`, `lime leaf`, `lime peel`, `lime zest`, `lime juice`, and `lime`. `Citrus × hystrix` and `Citrus hystrix` normalize to the same key.

## Bundled recipe scan

All 114 recipe paths from the live manifest were opened. For each of 1,123 ingredient rows, the scan checked `originalText`, `ingredientName`, and `ingredientRefId` for the same 29 raw phrases (28 normalized keys) as whole-word phrases.

- **Zero ingredient-row hits** for makrut lime leaves, their scanned alternate names, combava leaf phrases, or the queried botanical names.
- The control query `lime juice` returned three rows; `lime` returned the same three rows as a broad whole-word hit. None is a leaf reference:

| Recipe file | Ingredient row text | Existing identity / note |
|---|---|---|
| `007-haricots-pinto-refrits-refried-pinto-beans-4392bc3d-9785-43ac-b98e-496f96c1d628.v1.json` | `5 g vinegar or lime juice` | Unlinked mixed alternative; not a makrut leaf hit. |
| `034-chili-classique-au-boeuf-classic-beef-chili-4cbff09a-679f-420c-89e2-4175fb8e8662.v1.json` | `3 tbsp lime juice` | `ingredient-ref-lime-juice` |
| `095-satay-satay-9ec0ba36-1f7e-47d0-aedc-22ca03a5c672.v1.json` | `1 tbsp fresh lime juice` | `ingredient-ref-lime-juice` |

No recipe link or recipe edit is proposed. The zero candidate hits mean this review is a catalog coverage decision, not a current bundled-recipe normalization need.

## Package snapshot and source-ID preflight

File SHA-256 values are over exact file bytes. The ordered recipe digest hashes each manifest-relative path, NUL, exact recipe bytes, NUL, in manifest order.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 489 references | `e4d7700d0234f10969215c57cba025f4f8197c44a9ae972f68986cd843e93265` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 22 forms | `e258fddbdae2b6df168dfe7e14b1926e7f05004bde775916beeaeaa0b8fd17ff` |
| `docs/catalog/legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `8198a3f1da906817b464ecd7cbcdc7b5e4f2a6de5cb9fef80b7174a9c7277ff3` |

Preflight found no `WP06-MAKRUT-LEAF-20261009-S` prefix in the live research ledger, existing proposal/batch documents, or this target before writing. Source IDs below use that unique prefix.

## Sources

| Source ID | Source and exact locator | Evidentiary use and limit |
|---|---|---|
| **WP06-MAKRUT-LEAF-20261009-S01** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Citrus hystrix* DC.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:771927-1), accessed 2026-10-09; locator: accepted status and synonym list. | Accepts *C. hystrix* and lists *C. × aurantium hystrix* as a synonym. Taxonomy source; it does not establish a culinary label. |
| **WP06-MAKRUT-LEAF-20261009-S02** | OQLF, [combava (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26520207/combava), updated 2013; locator: definition, note, preferred French terms, English translations, and Latin terms. | Gives French `combava`, English `makrut lime`/`kaffir lime`, and Latin *Citrus hystrix*; its note says the fruit is especially used for zest and leaves that flavor Asian dishes. Entry is for the fruit, not a dedicated leaf term. |
| **WP06-MAKRUT-LEAF-20261009-S03** | Thailand Department of Internal Trade, [คู่มือมาตรฐานสินค้าเกษตรในตลาดกลาง (Manual of agricultural standards in central markets), section 1.34: ใบมะกรูด](https://www.dit.go.th/FILE/PR_PUBLICATION_DOCUMENT/%E0%B8%84%E0%B8%B9%E0%B9%88%E0%B8%A1%E0%B8%B7%E0%B8%AD%E0%B8%AA%E0%B8%B4%E0%B8%99%E0%B8%84%E0%B9%89%E0%B8%B2%E0%B9%80%E0%B8%81%E0%B8%A9%E0%B8%95%E0%B8%A3%E0%B9%81%E0%B8%A2%E0%B8%81%E0%B8%8A%E0%B8%99%E0%B8%B4%E0%B8%94%2028-7-2560.pdf), 2017-07-28; locator: “1.34 ใบมะกรูด,” English name and scientific-name fields, general product information, postharvest advice, and product types (PDF p. 40). | Names the item in English as “Kaffir lime leaves” and scientifically as *Citrus hystrix* DC.; describes leaf quality and fresh bunch sales, and says fresh leaves are washed and sun-dried or oven-dried at 50–55°C for 48 hours into packaged dried leaves. It explicitly lists fresh and dried leaf products. Trade and handling guidance, not a cooking conversion; its English label is not adopted because of the usage hazard documented in S06–S07. |
| **WP06-MAKRUT-LEAF-20261009-S04** | Thailand Department of Agricultural Extension, [แกงป่าถั่วมะแฮะ](https://sceb.doae.go.th/wp-content/uploads/2025/05/06-%E0%B9%80%E0%B8%AD%E0%B8%81%E0%B8%AA%E0%B8%B2%E0%B8%A3%E0%B8%A7%E0%B8%B4%E0%B8%8A%E0%B8%B2%E0%B8%81%E0%B8%B2%E0%B8%A3-%E0%B9%80%E0%B8%A3%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%87-%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%81%E0%B8%9B%E0%B8%A3%E0%B8%A3%E0%B8%B9%E0%B8%9B%E0%B8%AD%E0%B8%B2%E0%B8%AB%E0%B8%B2%E0%B8%A3%E0%B9%82%E0%B8%9B%E0%B8%A3%E0%B8%95%E0%B8%B5%E0%B8%99%E0%B8%88%E0%B8%B2%E0%B8%81%E0%B8%9E%E0%B8%B7%E0%B8%8A.pdf), n.d.; locator: recipe “แกงป่าถั่วมะแฮะ,” ingredient list and method (PDF p. 38). | Lists three ใบมะกรูด leaves and instructs washing/preparing leaves, then adding them with basil near the end of the curry. One recipe context; not a universal quantity. |
| **WP06-MAKRUT-LEAF-20261009-S05** | Thai SELECT, [Gaeng Tai Pla (Fish Organs Sour Soup)](https://www.thaiselect.com/thai-cuisine/recipes/detail/3), accessed 2026-10-09; locator: ingredients and steps 1 and 3. Thai SELECT contact page identifies the overseas programme office as Thailand’s Department of International Trade Promotion, Ministry of Commerce ([contact](https://thaiselect.com/contact)). | Lists kaffir lime leaves in a Thai curry/soup and uses them in both broth and finished curry. Recipe page’s English label reflects its source wording and is not adopted as a catalog alias. |
| **WP06-MAKRUT-LEAF-20261009-S06** | American Heritage Dictionary, [kaffir lime](https://ahdictionary.com/word/search.html?q=kaffir+lime), Fifth Edition, 2022; locator: entry and usage label. | Labels `kaffir lime` “Offensive” and redirects to `makrut lime`. Usage evidence for the English name choice, not botanical or culinary evidence. |
| **WP06-MAKRUT-LEAF-20261009-S07** | Dictionary of South African English, [kaffir](https://www.dsae.co.za/entry/kaffir/e03579), accessed 2026-10-09; locator: headword usage label and senses/phrase discussion. | Records the word as “offensive in all senses and combinations” in South African English. Regional usage evidence; this proposal does not claim the same judgment is universal, but avoids generalizing the compound as a safe global alias. |
| **WP06-MAKRUT-LEAF-20261009-S08** | University of California Agriculture and Natural Resources, [Seven Ways to Preserve Citrus](https://ucanr.edu/node/145982/printable/print), February 2, 2025; locator: section 7, “Preserving Makrut Lime Leaves: Air Drying and Freezing.” | UC Master Food Preserver Volunteer Online Program article; uses the exact culinary term `makrut lime leaves`, describes their use in Southeast Asian curries, soups, broths, and rice, and gives air-drying and freezing preservation methods. Supports the English display and culinary use; it is a preservation guide, not a botanical authority or a source for fresh/dried quantity conversion. |
| **WP06-MAKRUT-LEAF-20261009-S09** | University of California Agriculture and Natural Resources, [Horned Melons?](https://ucanr.edu/node/108706/printable/print), November 1, 2021; locator: “Makrut lime leaves” paragraph. | UC Master Gardener of Napa County article; calls the product `makrut leaves`, states Thai and other Asian culinary use, and explicitly says the leaves can be used fresh, frozen, or dried. Extension evidence, not a culinary conversion or Québec terminology authority. |
| **WP06-MAKRUT-LEAF-20261009-S10** | Thailand Department of Medical Sciences, Ministry of Public Health, [Thai Herbal Pharmacopoeia 2021: Citrus Hystrix Leaf](https://bdn-thp.dmsc.moph.go.th/ebook/qQqcZUtkpR9gC3q0GT5gMJq0qT5co3uw), accessed 2026-10-09; locator: monograph heading and dried-leaf definition. | Defines *Citrus Hystrix Leaf* as the dried leaf of *C. hystrix* and describes dried leaves. The monograph categorizes it as a pharmaceutic aid/flavouring agent, so it supports the botanical/product state rather than a universal culinary practice. |

## Coordinator integration result

- Added `ingredient-ref-makrut-lime-leaves` as a `HERB` reference, displayed as `makrut lime leaves` / provisional fr-CA `feuilles de combava`; retained only the leaf-qualified singular aliases `makrut lime leaf` / `feuille de combava`.
- Added the source-supported `fresh`, `frozen`, and `dried` forms. All density, unit-mapping, conversion, and substitution fields remain empty; no recipe link changed.
- Re-audited the current 495-reference / 27-form package, 99 legacy candidates, and all 114 recipes / 1,123 ingredient rows against 22 normalized candidate phrases. No exact catalog/form/legacy collision or leaf recipe hit was found.
- The Section U makrut item is checked in the plan; broader Section U herb coverage and independent Québec terminology review remain open. See the batch README for final package hashes, tests, emulator checks, and screenshots.

## Scope

This review is integrated as one HERB identity for *C. hystrix* leaves with fresh, frozen, and dried forms; the complete integration record is in the batch README. The fr-CA leaf wording remains provisional pending independent Québec terminology review. Exclude the documented offensive/regionally hazardous `kaffir` wording and broad fruit or generic-lime terms from aliases.
