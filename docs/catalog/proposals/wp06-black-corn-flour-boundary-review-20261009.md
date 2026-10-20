# WP06 Ecuadorian black-corn-flour boundary review

- **Reviewed:** 2026-10-09
- **Status:** research proposal; no catalog, ledger, generated code, tests, roadmap, or workflow files changed.
- **Recommendation:** **accept as the existing `ingredient-ref-whole-kernel-corn-flour` identity.** Ecuadorian sources identify the flour as ground maize from a dark-purple maize variety locally called black maize, and document it as a colada morada ingredient. The evidence describes maize flour, not a distinct preparation state or extracted product. Do not create a second ingredient identity or a form for the color/cultivar qualifier.
- **Scope:** Ecuadorian botanical and culinary naming, milling evidence, English and fr-CA display terms, boundaries against other corn products, and exact catalog/form/legacy/recipe phrase audit.

## Catalog decision

| Disposition | English display | fr-CA display | Category | Alias and form decision |
|---|---|---|---|---|
| Reuse active ID `ingredient-ref-whole-kernel-corn-flour` | `whole-kernel corn flour` | `farine de maïs` | `FLOUR_AND_STARCH` | Add no aliases or forms. Keep `harina de maíz negro` and `harina de maíz morado` as source-language descriptions in research/recipe context, not as English or French aliases. |

The Ecuadorian sources identify *maíz negro* in this use with dark-purple *Zea mays* and refer to flour from that maize for colada morada. A university study describes cleaning maize grain, milling it, and sieving the flour; it does not report nixtamalization, precooking, roasting, or starch extraction. These sources support the existing finely milled maize-flour identity. Color and cultivar describe the maize source; they do not establish an ingredient form or a separate milling/process identity.

Québec’s OQLF defines *farine de maïs* as a fine powder of milled maize kernels and lists English `corn flour`. The active English display remains qualified as `whole-kernel corn flour`, consistent with the catalog’s existing regional ambiguity review: unqualified English `corn flour` is also used for cornstarch in the United Kingdom. No authoritative Canadian or Québec source located here establishes a special English or fr-CA display for Ecuadorian black/purple maize flour. Do not add literal `black corn flour`, `purple corn flour`, `farine de maïs noir`, or `farine de maïs violet` as canonical labels or aliases.

The recommendation is at the catalog’s generic maize-flour identity level. The consulted sources do not establish a universal commercial specification for all products sold as `harina de maíz negro/morado`, nor do they explicitly document bran/germ retention for every mill or package. If a particular product is labeled nixtamalized, precooked, roasted, coarsely milled, or otherwise processed, resolve it from that product evidence against the existing neighboring identities; do not infer that state from the Ecuadorian source name alone.

## Botanical, food-use, and processing evidence

INIAP’s technical sheet for the named INIAP-199 “Racimo de Uva” maize says the purple maize ear is dark/blackish and is called `maíz negro` in some localities. INIAP’s release note says this dark-purple-grained variety is suitable for flour used in traditional colada morada and chicha morada. These statements support the local black/purple naming for this documented maize variety and its food use; they do not prove that every Ecuadorian black- or purple-grain maize is the same cultivar. [WP06-BLACK-CORN-FLOUR-20261009-S01–S02]

Quito’s municipal information service documents colada morada recipes using both `harina de maíz morado` and `harina de maíz negro`. One account describes adding the flour to the cooked fruit-and-spice mixture, and another records flour soaking before cooking. These are local culinary accounts, not a standardized formula or a technical flour specification. [WP06-BLACK-CORN-FLOUR-20261009-S03]

An Ecuadorian university thesis reports a test flour made from cleaned maize of the purple `Racimo de Uva` race: dry-air cleaning removed dust, straw, and impurities; a stone roller mill ground the grain; and sieving followed. The study reports a fine particle distribution for this sample and compares it with Ecuadorian maize-flour standard NTE INEN 2051:1995. This is process evidence for one experimental flour, not a specification for every colada-morada flour and not evidence of a universal whole-grain retention ratio. The thesis concerns empanadas, not colada morada. No reported cooking or alkaline treatment appears in the described milling sequence, but silence about unreported steps is not proof that every commercial product is untreated. [WP06-BLACK-CORN-FLOUR-20261009-S04]

## Naming and product boundaries

- **Use the active bilingual display pair.** OQLF’s preferred Québec French term is `farine de maïs`, defined as fine powder of milled maize kernels. Its English terms include `corn flour`; the entry also records `cornstarch` as a United Kingdom English use. The catalog’s qualified English name `whole-kernel corn flour` avoids assigning that unqualified regional spelling globally. [WP06-BLACK-CORN-FLOUR-20261009-S05]
- **Keep meal separate.** OQLF defines `semoule de maïs` / `corn meal` as dry-ground maize, with fine, medium, or coarse grinds. The thesis’s sample was described as flour and fine; it does not support merging this candidate with cornmeal. No separate flour form is proposed. [WP06-BLACK-CORN-FLOUR-20261009-S06]
- **Keep extracted starch separate.** CFIA’s Canadian compositional standard defines corn starch as starch made from maize. The Ecuadorian flour sources describe ground maize flour, not extracted starch. [WP06-BLACK-CORN-FLOUR-20261009-S07]
- **Keep process-defined maize flours separate.** The live catalog already has separate identities for `masa harina / farine de maïs nixtamalisée`, `precooked corn flour / farine de maïs précuite`, and `roasted corn flour / farine de maïs torréfiée`. The reviewed source evidence does not identify any of those processing paths for the colada-morada flour.
- **Do not make a color form.** The source-specific color names identify maize variety/color context, not a preparation applied to an otherwise identical ingredient. The sources support no form mapping, substitution, density, unit mapping, or recipe quantity for this candidate.

The reused reference currently has `defaultDensity: null` and an empty `unitMappings` array; this review proposes no change to those fields and adds no measurements, conversions, substitutions, or recipe links.

## Exact catalog and recipe audit

The audit replicated the app’s `normalizeIngredientSearchKey`: lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace non-alphanumeric characters with spaces, and collapse whitespace. Candidate phrases were checked as complete normalized word phrases within reference names/aliases, form labels/match terms, legacy names/aliases, and recipe string fields. The phrase audit covered 25 source-name, color-qualified English/French, cultivar, and dish phrases, including `harina de maíz negro`, `harina de maíz morado`, `maíz negro`, `maíz morado`, `black corn flour`, `black maize flour`, `purple corn flour`, `purple maize flour`, `farine de maïs noir`, `farine de maïs violet`, `Racimo de Uva`, and `colada morada`.

| Candidate phrase audit | Active references | Forms | Legacy candidates | Recipe ingredient rows | Recipe files with any string-field hit |
|---|---:|---:|---:|---:|---:|
| 25 candidate phrases, including spelling/accent variants | 0 owners | 0 owners | 0 owners | 0 of 1,123 | 0 of 114 |

The candidate-specific terms have no exact normalized match in the 480 active references, 17 forms, or 99 legacy-import candidates. No maize-flour form is present in the forms file. The exact normalized existing French term `farine de maïs` belongs to the single active identity `ingredient-ref-whole-kernel-corn-flour`; the full phrase also appears within the three more-qualified French flour names for masa harina, precooked corn flour, and roasted corn flour, so an app phrase search for `farine de maïs` can return those four rows. A phrase search for English `corn flour` returns the whole-kernel, precooked, and roasted flour identities. These are neighboring-product search results, not candidate-name collisions or evidence to merge those products. The exact active neighbors `cornmeal / semoule de maïs`, `cornstarch / fécule de maïs`, and `masa harina / farine de maïs nixtamalisée` each remain separately named.

The target existing whole-kernel-flour ID is linked by 0 ingredient rows in the current recipe package. Cornmeal, masa harina, precooked corn flour, and roasted corn flour are also linked by 0 rows each; cornstarch is linked by 9 rows in 8 recipes. No recipe ingredient row or recipe string field contains any candidate phrase. No recipe relinking is indicated by this snapshot.

Snapshot SHA-256 values:

| File or corpus | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 480 references | `640e66a6172020ace27f10ba267dbc8fbad467be73a51a517c7cb64e42077459` |
| `ingredient-forms.v1.json` | 17 forms | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | `8198a3f1da906817b464ecd7cbcdc7b5e4f2a6de5cb9fef80b7174a9c7277ff3` |

The recipe corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact file bytes, and a NUL byte in manifest order. The source-ID prefix `WP06-BLACK-CORN-FLOUR-20261009-S` and proposed candidate IDs `ingredient-ref-black-corn-flour` / `ingredient-ref-purple-corn-flour` were checked repository-wide before drafting; no prior matches were found. Only proposal source IDs are assigned below; none were added to the shared ledger.

## Source register

Pages and records were accessed 2026-10-09. Each source is used only within the scope and limits stated here.

| ID | Source and locator | Support and evidence limits |
|---|---|---|
| **WP06-BLACK-CORN-FLOUR-20261009-S01** | Instituto Nacional de Investigaciones Agropecuarias (INIAP), [*Ficha técnica de la variedad de Maíz Negro INIAP-199 “Racimo de Uva”*](https://repositorio.iniap.gob.ec/items/b7938798-b44d-4a2c-9632-04e749ae970e), 2016, abstract. | Identifies the crop as *Zea mays* L. and says the dark/blackish purple ear is called `maíz negro` in some localities. This is a specific variety record; it does not equate every black or purple maize cultivar. |
| **WP06-BLACK-CORN-FLOUR-20261009-S02** | INIAP, [“Liberación de nueva variedad de maíz INIAP-199 ‘Racimo de uva’ se realizó en Chimborazo”](https://www.iniap.gob.ec/liberacion-de-nueva-variedad-de-maiz-iniap-199-racimo-de-uva-se-realizo-en-chimborazo/), lines 92–96. | Describes dark-purple pigmentation, calls the variety `maíz negro`, and says its flour is used for colada morada and chicha morada. Supports varietal food use, not a universal flour process. |
| **WP06-BLACK-CORN-FLOUR-20261009-S03** | Quito Informa, [“Conversatorio Memoria y Tradición en el Día de Finados”](https://www.quitoinforma.gob.ec/2020/10/31/conversatorio-memoria-y-tradicion-en-el-dia-de-finados/), municipal cultural account; see also [“‘Colada Morada’ una tradición familiar de Quito”](https://www.quitoinforma.gob.ec/2020/10/30/colada-morada-una-tradicion-familiar-de-quito/). | The municipal account uses both `harina de maíz morado` and `harina de maíz negro` for colada morada; family accounts describe soaking/cooking in different ways. These are local accounts and not a technical standard or fixed recipe. |
| **WP06-BLACK-CORN-FLOUR-20261009-S04** | Ana Lucía Lizano Prado, Universidad San Francisco de Quito, [*Efecto del proceso de fritura en el contenido de antocianinas en empanadas elaboradas con mezclas de harina de trigo - maíz morado (Zea mays L.)*](https://repositorio.usfq.edu.ec/handle/23000/2000), 2012, sections 5.1 and 8.1 ([full thesis](https://repositorio.usfq.edu.ec/bitstream/23000/2000/1/106060.pdf)). | Reports dry-air cleaning, stone-roller grinding, and sieving for one flour sample made from `Racimo de Uva`; describes its particle distribution as fine and cites NTE INEN 2051:1995. Study-specific method/sample, not a universal market or colada-morada specification. |
| **WP06-BLACK-CORN-FLOUR-20261009-S05** | Office québécois de la langue française, [*farine de maïs*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais), updated 2025. | Defines the product as fine powder of milled maize kernels and gives the preferred French term and English terms `corn flour` and UK `cornstarch`. Does not define Ecuadorian color-specific flour. |
| **WP06-BLACK-CORN-FLOUR-20261009-S06** | Office québécois de la langue française, [*semoule de maïs*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais), updated 2019. | Defines dry-ground maize meal, says the grind may be fine, medium, or coarse, and pairs it with `corn meal`. Supports the adjacent meal boundary, not an exact Ecuadorian grind specification. |
| **WP06-BLACK-CORN-FLOUR-20261009-S07** | Canadian Food Inspection Agency, [Canadian Food Compositional Standards, Volume 12, section 12.1.9](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0). | Defines corn starch as starch made from maize. Used to keep extracted starch separate from the source-described milled maize flour; not a corn-flour standard. |
| **WP06-BLACK-CORN-FLOUR-20261009-S08** | Canadian Food Inspection Agency, [“Labelling and composition requirements for grain and bakery products”](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products), flour and grind-size guidance. | Gives Canadian common-name guidance and says a coarser flour product may have a common name modified with `coarse`. General labelling context only; it does not define black/purple maize flour or an Ecuadorian product class. |
| **WP06-BLACK-CORN-FLOUR-20261009-S09** | Instituto Nacional de Estadística y Censos (Ecuador), [Agriculture classification record: “Maíz Morado, excepto para siembra”](https://aplicaciones2.ecuadorencifras.gob.ec/SIN/co_agricola.php?id=01122.01.04). | Classifies purple maize under *Zea mays* and documents food/color use and colada-morada relevance. The page includes broader health claims not used here and does not specify flour milling. |

## Remaining limit

The active whole-kernel flour identity is the best supported allocation for this source use. The evidence does not supply an Ecuadorian bilingual package label or a process specification covering all products called `harina de maíz negro/morado`; it therefore does not establish a new color-specific English/fr-CA product name, exact kernel-fraction retention, density, unit conversion, substitution, or a recipe-specific quantity. Keep those unmodeled unless direct product evidence is reviewed.
