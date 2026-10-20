# WP06 Mexican culinary herb identity boundaries: epazote, hoja santa, and pápalo

**Review date:** 2026-10-09

**Status:** proposal only; no shared catalog, ledger, recipe, roadmap, test, or generated file was changed.

## Recommendation

| Candidate | Disposition | Provisional display and scope | Alias/form decision |
|---|---|---|---|
| Epazote | **Retain the existing distinct HERB identity** `ingredient-ref-epazote`. CONABIO identifies epazote as *Dysphania ambrosioides*; SADER uses it separately from hoja santa and parsley in an Oaxaca mole recipe [S01–S02]. | EN `epazote`; fr-CA **`épazote`**. The live French label currently lacks the OQLF accent; change that display in a future integration. | Add the OQLF French alias `fausse-ambroisie`. Accent folding already makes the live spelling `epazote` search-equivalent to `épazote`. Do not add `Mexican tea`, `wormseed`, or `paico` as broad aliases. No forms or conversions proposed. |
| Hoja santa | **Retain the existing distinct HERB identity** `ingredient-ref-hoja-santa`, separate from epazote, cilantro, parsley, and avocado leaves [S01–S03]. | EN and fr-CA `hoja santa`, retained as the source name. No authoritative English or Québec French translation was located in the targeted terminology searches. | Add source-backed Mexican Spanish aliases `acuyo` and `hierba santa`; SADER names both as other names for hoja santa, and CONABIO identifies hoja santa/acuyo as *Piper auritum* [S03, S09]. Do not alias `hoja de aguacate`. No forms or conversions proposed. |
| Pápalo | **Accept a new, narrowly source-named HERB identity candidate**. The Mexican food/agricultural sources identify the culinary pápalo crop with *Porophyllum ruderale* and, in newer government and CONABIO taxonomic records, *P. ruderale* subsp./var. *macrocephalum* [S03–S05]. Do not claim that all plants called pápalo or papaloquelite are botanically identical. | EN `papalo`; fr-CA `pápalo`. These are provisional borrowings of the Mexican source name; accent folding covers the spelling difference. | No aliases. Defer `pápaloquelite`/`papaloquelite`, `quirquiña`, `pipicha`/`pipitzca`, and `chepiche`: CONABIO records pápalo and papaloquelite for other *Porophyllum* taxa too [S06]. Treat the identity as the fresh Mexican culinary herb described by SADER; do not create dried, cooked, powder, or seed forms from these sources. |
| Quelite / quilitl | **Do not create an ingredient identity or alias.** CONABIO describes quelite as an umbrella for hundreds of edible plants and plant parts, not one plant [S01]. | Keep named plants separate. | No umbrella alias for epazote, hoja santa, or pápalo. |

No recipe relinking, substitution rule, density, unit mapping, quantity conversion, or form conversion is recommended. Although a SADER article says pápalo can substitute for cilantro in some contexts, that serving suggestion is not a general ingredient equivalence or a safe global substitution rule [S04].

## Evidence and identity boundary

### Epazote and hoja santa

CONABIO lists epazote (*Dysphania ambrosioides*) and hoja santa (*Piper auritum*) as separate named plants within the much larger quelite group [S01]. SADER’s Oaxaca green-mole recipe independently lists one hoja santa leaf, one sprig of epazote, and parsley as separate ingredients and cooks them together in the sauce [S02]. This supports separate ingredient identities, not an alias or substitution between them.

The OQLF’s GDT entry gives `épazote` and `fausse-ambroisie` as preferred French terms, and `epazote` as its English translation. TERMIUM Plus records both *Dysphania ambrosioides* and *Chenopodium ambrosioides* as Latin entries for the plant; the older genus name in the OQLF entry is therefore not evidence of another food identity [S07–S08]. TERMIUM flags `Mexican-tea` and `wormseed` as names that can also refer to other species. Prefer `épazote` as the fr-CA display and `fausse-ambroisie` as a French search alias; use `epazote` in EN and avoid translating it as “Mexican tea.”

For hoja santa, current Mexican government and CONABIO sources use `acuyo` and `hierba santa` for *Piper auritum* [S03, S09]. These are defensible search aliases under the source’s Mexican culinary scope. The term `hoja de aguacate` names avocado leaf, which SADER lists separately from hoja santa [S10]; do not merge it. Keep `hoja santa` as both displays until a Québec terminology source supports a French translation.

### Pápalo: accept the culinary name, defer broader species crosswalks

SADER’s agricultural press release calls the vegetable `pápalo` or `pápaloquelite`, identifies it as *Porophyllum ruderale*, and describes use as a fresh accompaniment to tacos and in Puebla cemitas and guacamole [S04]. A newer SADER quelites page identifies pápalo as *P. ruderale* subsp. *macrocephalum* and says its aromatic leaves are usually eaten fresh, especially in tacos [S03]. The SIAP product sheet calls the crop pápalo and describes its leaves as eaten fresh/raw; it says cooking loses the characteristic flavor, while also listing soups, salads, beans, stews, guacamole, and salsas as culinary contexts [S05]. These are product and preparation descriptions, not a universal rule forbidding cooked use.

CONABIO Enciclovida has separate records for pápalo (*P. ruderale*) and papaloquelite (*P. ruderale* var. *macrocephalum*), with the latter taxon also listed under the subspecies name [S03, S06]. CONABIO’s *P. linaria* record also reports `pápalo` and `papaloquelite` as common names for that different species [S06]. Thus the source evidence supports a Mexican culinary product named pápalo, but it does not establish that every regional use of `pápalo`, `papaloquelite`, or related names refers to the same botanical taxon. Keep the narrow market/cuisine identity; do not turn those neighboring names into automatic aliases.

The Spanish term `quirquiña` appears as an alternate name in the SADER press release [S04], but this review does not establish a safe cross-regional mapping for the name. Likewise, the sources reviewed do not support merging pápalo with pipicha/pipitzca or chepiche. Keep those terms outside the identity and alias set.

### Language choice

The targeted OQLF and TERMIUM searches returned an epazote entry but no relevant terminology record for `hoja santa` or `pápalo`. The proposed borrowed names for those ingredients are provisional source-name displays, not claims that OQLF or TERMIUM has standardized them. The catalog can preserve the Spanish source name in both languages without inventing “Mexican pepperleaf,” “Mexican parsley,” or “summer cilantro.”

## Live catalog and collision audit

Snapshot read on 2026-10-09. Exact matching used the current search normalization described in the Mexico/Central America sweep: lowercase; NFKD; fold `œ`→`oe`, `æ`→`ae`, `ß`→`ss`, and `&`→`and`; remove combining marks; replace non-ASCII-letter/digit runs with spaces; collapse whitespace. Reference display names and aliases, every form label and match term, and legacy candidate names and aliases were compared as exact normalized phrases.

| Exact query or group | Active reference result | Forms / legacy candidates |
|---|---|---|
| `epazote`, `épazote` | One exact row: `ingredient-ref-epazote` (currently EN/FR `epazote`, category `HERB`). Accent folding makes both queries equivalent. | No exact form or legacy match. |
| `fausse-ambroisie` | No exact active match; proposed as a French alias for epazote based on OQLF. | No exact form or legacy match. |
| `Mexican tea`, `wormseed`, `wormseed tea`, `wormseed goosefoot`, `paico` | No exact active match; not proposed as aliases because of ambiguity or cross-regional scope. | No exact form or legacy match. |
| `hoja santa` | One exact row: `ingredient-ref-hoja-santa` (EN/FR `hoja santa`, category `HERB`). | No exact form or legacy match. |
| `acuyo`, `acoyo`, `hierba santa`, `tlanepa`, `tlanepaquelite` | No exact active match. | No exact form or legacy match. The proposed `acuyo` and `hierba santa` aliases therefore do not collide with another current record. |
| `pápalo`, `papalo`, `papaloquelite`, `pápaloquelite`, `pápalo quelite`, `papalo quelite`, `quirquiña`, `pipicha`, `pipitzca`, `chepiche` | No exact active match. | No exact form or legacy match. |
| Queried botanical names for *Dysphania ambrosioides*, *Chenopodium ambrosioides*, *Piper auritum*, *Porophyllum ruderale* (including subsp./var. *macrocephalum*), *P. linaria*, and *P. coloratum* | No exact active match. | No exact form or legacy match. Scientific names remain evidence notes, not proposed aliases. |
| Controls `cilantro`, `parsley` | Exact results are the existing `ingredient-ref-cilantro` and `ingredient-ref-parsley` rows. | No control term is proposed as an alias. |

The live package has 489 active references, 22 forms, and 99 legacy candidates. The exact query set contained 42 raw phrases, which folded to 38 normalized keys. The full set was: `epazote`, `épazote`, `epazotl`, `Dysphania ambrosioides`, `Chenopodium ambrosioides`, `fausse-ambroisie`, `chénopode fausse-ambroisie`, `thé du Mexique`, `Mexican tea`, `wormseed`, `wormseed tea`, `wormseed goosefoot`, `paico`; `hoja santa`, `Piper auritum`, `acuyo`, `acoyo`, `hierba santa`, `tlanepa`, `tlanepaquelite`, `hoja de aguacate`; `pápalo`, `papalo`, `Porophyllum ruderale`, `Porophyllum ruderale subsp. macrocephalum`, `Porophyllum ruderale var. macrocephalum`, `papaloquelite`, `pápaloquelite`, `pápalo quelite`, `papalo quelite`, `quirquiña`, `pipicha`, `pipitzca`, `chepiche`, `Porophyllum linaria`, `Porophyllum coloratum`; `quelite`, `quilitl`; and the controls `cilantro`, `parsley`, `Mexican parsley`, `summer cilantro`. No exact candidate term matched a form label/match term or legacy candidate.

The two current herb rows have empty alias arrays and no linked forms; pápalo is absent from the active catalog. The proposed epazote French alias and hoja santa aliases are new source-backed search terms, not current catalog hits.

## Bundled recipe scan

All 114 recipe paths from the live manifest were opened. The scan checked each ingredient row’s `originalText`, `ingredientName`, and `ingredientRefId` for the same 42 raw queries (38 normalized keys) as whole-word phrases. Corpus size was 1,123 ingredient rows. There were **zero ingredient-row hits** for epazote, hoja santa, pápalo, their queried aliases, or their queried botanical names. No recipe edit or link is proposed.

The neighboring control words `cilantro` and `parsley` returned six rows, not candidate evidence:

| Recipe file | Ingredient row text | Existing identity / note |
|---|---|---|
| `034-chili-classique-au-boeuf-classic-beef-chili-4cbff09a-679f-420c-89e2-4175fb8e8662.v1.json` | `10 g fresh cilantro, chopped` | `ingredient-ref-cilantro` |
| `090-ragout-aux-arachides-africain-african-peanut-stew-89f89f5e-4afc-4e3a-b37f-e7841ac24ff8.v1.json` | `peanuts and fresh cilantro, for garnish` | Ingredient name is `peanuts`; the text is not a pápalo/epazote/hoja santa use. |
| `043-epices-italiennes-italian-seasoning-2ee2dad3-f7d9-4978-af9a-28113a3a56e9.v1.json` | `2 tbsp dried parsley` | `ingredient-ref-dried-parsley` |
| `078-pate-chinois-shepherd-s-pie-d356eec5-b3c4-4e22-b943-63900317e569.v1.json` | `2 tsp dried parsley` | `ingredient-ref-parsley` |
| `087-poulet-parmesan-chicken-parmesan-c68bebce-c549-4789-a5b4-d023ed58f782.v1.json` | `2 tbsp minced parsley` | `ingredient-ref-parsley` |
| `111-thon-sous-vide-sous-vide-tuna-b699f193-4545-4e7a-98ad-ce092a1e38e4.v1.json` | `Fresh aromatics such as thyme, dill, parsley, thinly sliced shallots, and/or citrus zest` | Broad unlinked aromatics line, not a candidate hit. |

## Package snapshot and source-ID preflight

File SHA-256 values are over exact file bytes. The ordered recipe digest hashes each manifest-relative path, NUL, exact recipe bytes, NUL, in manifest order.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 489 references | `e4d7700d0234f10969215c57cba025f4f8197c44a9ae972f68986cd843e93265` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 22 forms | `e258fddbdae2b6df168dfe7e14b1926e7f05004bde775916beeaeaa0b8fd17ff` |
| `docs/catalog/legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `8198a3f1da906817b464ecd7cbcdc7b5e4f2a6de5cb9fef80b7174a9c7277ff3` |

The source-ID preflight found no `WP06-MEX-HERB-ID-20261009-S` prefix in the live research ledger, existing proposal/batch documents, or this target before writing. The source IDs below use that unique prefix.

## Sources

| Source ID | Source and locator | Evidentiary use and limit |
|---|---|---|
| **WP06-MEX-HERB-ID-20261009-S01** | CONABIO, [Quelites](https://biodiversidad.gob.mx/diversidad/alimentos/quelites), accessed 2026-10-09; locator: definition, plant-parts paragraph, and list of commonly consumed quelites. | Defines the umbrella and separately names pápalo, epazote (*Dysphania ambrosioides*), and hoja santa (*Piper auritum*). Broad overview; not a product specification or Québec terminology source. |
| **WP06-MEX-HERB-ID-20261009-S02** | SADER, [Mole verde estilo Oaxaca](https://www.gob.mx/agricultura/articulos/mole-verde-estilo-oaxaca), 2023-09-03; locator: ingredients list and preparation step 3. | Lists hoja santa, epazote, and parsley separately and cooks them in one Oaxaca mole recipe. One recipe, not a universal preparation. |
| **WP06-MEX-HERB-ID-20261009-S03** | SADER, [Quelites, el pequeño gran tesoro de la alimentación](https://www.gob.mx/agricultura/es/articulos/quelites-el-pequeno-gran-tesoro-de-la-alimentacion), 2026-08-13; locator: “Una gran diversidad de sabores,” entries for pápalo and hoja santa. | Identifies pápalo as *P. ruderale* subsp. *macrocephalum*, describes fresh taco use, and names acuyo and hierba santa as hoja santa names. Government educational overview; not a botanical specimen label. |
| **WP06-MEX-HERB-ID-20261009-S04** | SADER, [Crece 21 por ciento producción de pápalo, el tradicional acompañante de los tacos](https://www.gob.mx/agricultura/prensa/crece-21-por-ciento-produccion-de-papalo-el-tradicional-acompanante-de-los-tacos), 2021-11-13; locator: crop-name/species paragraph and culinary-use paragraphs. | Names pápalo/pápaloquelite, associates the crop with *P. ruderale*, reports quirquiña as another name, and describes fresh use with tacos, cemitas, and guacamole. Government press release using agricultural data; does not resolve every regional common-name/taxon pairing. |
| **WP06-MEX-HERB-ID-20261009-S05** | SADER/SIAP, [Pápalo product sheet](https://www.gob.mx/cms/uploads/attachment/file/726305/Papalo.pdf), accessed 2026-10-09; locator: “Producto,” “Usos,” and “Nombre científico,” PDF p. 1. | Describes fresh/raw leaves and named culinary uses and identifies *P. ruderale*. Its raw-use advice is product guidance, not proof that every recipe uses only uncooked pápalo. |
| **WP06-MEX-HERB-ID-20261009-S06** | CONABIO Enciclovida, [Pápalo, *Porophyllum ruderale*](https://enciclovida.mx/especies/183989.pdf), accessed 2026-10-09; locator: PDF p. 1, title and description. CONABIO Enciclovida, [Chepiche, *Porophyllum linaria*](https://enciclovida.mx/especies/181986.pdf), accessed 2026-10-09; locator: PDF p. 1, description. | Separately records pápalo as *P. ruderale* and reports pápalo/papaloquelite among names for *P. linaria*. Taxon summaries and common-name records establish name overlap, not equivalence of culinary products. |
| **WP06-MEX-HERB-ID-20261009-S07** | OQLF, [fausse-ambroisie (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503262/fausse-ambroisie), updated 2009; locator: definition, preferred French terms, English translation. | Gives `épazote` and `fausse-ambroisie` as preferred French terms and `epazote` as English. The entry uses *Chenopodium ambrosioides*; use current CONABIO name *Dysphania ambrosioides* for the identity note. |
| **WP06-MEX-HERB-ID-20261009-S08** | Translation Bureau, [TERMIUM Plus: *Chenopodium ambrosioides*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=ent&lang=fra&srchtxt=CHENOPODIUM+AMBROSIOIDES), record dated 2022-01-31; locator: English/French/Spanish terms and English ambiguity observations. | Connects *Dysphania ambrosioides* and *Chenopodium ambrosioides* to epazote/épazote; warns of other-species ambiguity for `Mexican-tea` and `wormseed`. |
| **WP06-MEX-HERB-ID-20261009-S09** | CONABIO Enciclovida, [Hierba santa, *Piper auritum*](https://enciclovida.mx/especies/166356.pdf), accessed 2026-10-09; locator: PDF p. 1, opening description and “Importancia cultural y usos.” | Identifies hoja santa or acuyo as *P. auritum* and notes routine use in Mexican home cooking. Botanical/common-name summary; regional alias coverage is not exhaustive. |
| **WP06-MEX-HERB-ID-20261009-S10** | SADER, [Hierbas aromáticas y especias: un toque de sabor](https://www.gob.mx/agricultura/articulos/hierbas-aromaticas-y-especias-un-toque-de-sabor), 2018-06-18; locator: list of Mexican culinary condiments. | Lists hoja santa (acuyo) separately from hoja de aguacate, corroborating the alias and distinction. General educational page; S03 and S09 provide the stronger direct synonym evidence. |

## Scope of this review

This file records a source-grounded proposal only. It does not alter the live references, aliases, forms, legacy identities, ledger, recipes, checklist, roadmap, tests, or generated code. The recommended next integration would retain the two accepted rows, correct the epazote French display, add the two source-backed hoja santa aliases, and add pápalo as the narrow Mexican culinary herb name with no aliases or forms.
