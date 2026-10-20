# WP03 Section I — fox nut / makhana identity proposal

- **Reviewed:** 2026-10-09
- **Status:** integrated on 2026-10-09 after coordinator review; independent Québec French review remains open.
- **Scope:** culinary seed identity for *Euryale ferox*; raw seed versus edible kernel; roasted-popped makhana as a product form; bilingual name and alias boundaries; separate measurement and substitution evidence.
- **Plan state:** Section I remains open.

## Snapshot at review time

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 446 references | `be43fb982f30cab5fdac7fbd684ef04ecdfede42e01e8d2cd341879fed92d0fa` |
| `ingredient-forms.v1.json` | 16 forms | `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 612 records / 746 source entries | `198aa26fa3f2a3b7f7d7d46a3fe92d307e57b90b142f7d1cdcf392c0e1591e3d` |
| `legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Sorted recipe filename + NUL + per-file SHA-256 + newline aggregate | 114 files / 1,123 ingredient rows | `1ddb9c0694d9ece1d1638d8e6bdaad2601424876ac87718c7057909b482a56e9` |

## Identity recommendation

Recommend one species-anchored seed identity with a single source-supported `roasted_popped` form. The proposed base record represents the seed of the accepted species *Euryale ferox*; it does not assert that an unprocessed whole seed is ready to eat. The common edible product is the kernel exposed by processing and popping. No separate raw-eating, roast-only, ground, or flavored form is supported by the current recipe corpus.

| Proposed record | English display | Provisional fr-CA display | Narrow names / data | Disposition |
| --- | --- | --- | --- | --- |
| `ingredient-ref-makhana-seeds` | `makhana seeds (Euryale ferox)` | `graines de makhana (Euryale ferox)` | Category `NUT_SEED_AND_DRIED_FRUIT`; consider English aliases `fox nut`, `fox nuts`, and `gorgon nut`. Keep native `makhana` in both displays. | New species-and-plant-part-scoped culinary identity candidate. The French descriptive wording is provisional: no OQLF entry for makhana/fox nut was found in the targeted terminology search. |
| `ingredient-form-makhana-roasted-popped` | `roasted, popped makhana kernels` | `graines de makhana grillées et soufflées` | `formCode: roasted_popped`; possible EN match terms `roasted makhana`, `popped makhana`, `puffed makhana`, `roasted fox nuts`; possible FR terms `graines de makhana grillées et soufflées`, `graines de makhana soufflées`. Treat French market alias `noix de renard` as source-scoped and provisional. | One combined finished-product form, supported by the product specification and current retail wording. Do not add separate roast-only and popped forms from the available evidence. |

The European Commission’s product specification calls the food **roasted and popped kernels from seeds of *Euryale ferox*** and requires a product designation that retains the species or `makhana (Euryale ferox)`. Its French regulation text uses `graines grillées et soufflées d’Euryale ferox Salisb. (makhana)`. These are the clearest bilingual product names found; the EU rule is not Canadian law. The display should retain the native name `makhana` and a species qualifier rather than depend on a broad translated common name.

## Species, product, and name boundaries

| Name or product | Evidence and scope | Catalog treatment |
| --- | --- | --- |
| ***Euryale ferox*** | Kew’s Plants of the World Online accepts this species in Nymphaeaceae. India’s eNAM commodity list identifies raw makhana seed with this botanical name and gives `fox nut`, `gorgon nut`, and `raw makhana` as common names. | Use the accepted species as the identity anchor. English aliases `fox nut`, `fox nuts`, and `gorgon nut` are source-backed; retain `makhana` as the native name in both displays. The eNAM listing identifies a raw agricultural commodity, not a ready-to-eat raw kernel. |
| **Raw whole seed / pre-popping seed** | The ICAR/NIFTEM processing guide describes a black, hard-coated seed and separates raw seed, cleaning/drying, successive roasting, breaking, and popped-kernel separation. It says the edible starchy kernel is removed through popping. | Treat unpopped seed as an upstream commodity/process input. Do not add a raw-eating form or imply that this whole seed is the edible snack. The guide is a processing overview, not household preparation or safety advice. |
| **Roasted-popped makhana** | EU Regulation 2023/652 defines the food as roasted and popped kernels from *E. ferox* seeds and authorizes a specific traditional-food product in the EU. Canadian retail listings also sell roasted/popped Makhana products. | Represent as one `roasted_popped` form under the species-anchored seed identity. Keep the process and product name explicit; do not set a raw-to-popped mass yield or conversion. EU authorization applies only to that specified product/market and does not establish Canadian approval or raw-seed safety. |
| **`Fox nut(s)` / `gorgon nut`** | India’s eNAM commodity listing and ICAR/food-science sources use these as common names for *E. ferox*; the EU regulation calls the popped food `makhana` or `fox nuts`. | Source-backed English aliases for the *E. ferox* identity. `Nut` is a common name, not a botanical classification. |
| **`Lotus seed(s)` / `graines de lotus soufflées`** | Some Canadian retailers use these words for makhana. Kew treats *E. ferox* as a Nymphaeaceae species, while sacred lotus is *Nelumbo nucifera* in Nelumbonaceae. The market wording can therefore conflate two distinct taxa. | Exclude unqualified `lotus seed(s)` and `graines de lotus soufflées` as aliases, even though observed in Québec-facing retail. Keep the current `lotus root` identity distinct. A future lotus-seed identity must be species-qualified. |
| **`Noix de renard`** | One Canadian French marketplace listing uses this as a parenthetical name for its roasted Makhana product. No OQLF terminology entry was found. | At most a provisional form-level match term tied to that market listing; do not present it as an OQLF-preferred display or as a general French botanical name. Independent Québec French review is open. |
| **`Mithila Makhana`** | India’s GI Registry lists Mithila Makhana as a registered geographical indication with an origin scope in Bihar. | Preserve as a regional designation only; do not add as a generic species alias or imply that all makhana comes from the GI region. |
| **Seasoned or flavored makhana snack** | Retail listings add ingredients such as oil, salt, spices, or flavorings to the popped product. | Keep the base ingredient and its preparation/form distinct from a finished seasoned snack. Do not place seasoning or added oil in the generic identity or alias list. |
| **`Lawa`, `phool makhana`, other regional/retail terms** | Sources use these in specific product or production contexts, but the current reviewed evidence does not establish that all are safe, locale-neutral aliases for the seed identity and popped form. | Record with source and product scope only; add no unqualified aliases in this packet. |

The current catalog has one related reference, `ingredient-ref-lotus-root` / `racine de lotus`. It is a different plant part and is not a seed identity. The exact normalized key `lotus seed` has no owner, but unqualified “lotus” is a risky partial-search term because the existing lotus-root row is a live result. Do not alias this candidate to the lotus-root row.

## Measurement evidence

No recipe-scale count-to-mass, cup-to-mass, package yield, or raw-to-popped conversion is proposed.

| Product and source basis | Measurement observation | Limit and disposition |
| --- | --- | --- |
| Raw seed / general makhana identity | No source-backed kitchen measure or recipe conversion was found. The eNAM source identifies a raw commodity but does not give household measures. | No generic `defaultDensity`, unit mapping, or usable-portion yield. Do not infer consumption quantity from a supplement dosage. |
| Whole popped kernels, Jha & Sharma study | The 2010 food-engineering study conditioned one market sample to 6.2%, 9.4%, and 12.3% moisture (dry basis). Its measured bulk densities were 59.2, 57.4, and 57.7 kg/m³ respectively. It measured weight in a known-volume cylinder; the study was for post-harvest processing, not recipe measuring. | This is a source-specific engineering observation, not a universal ingredient density or cup mapping. Moisture conditioning changes the reported value; keep the range packet-only. |
| Popped makhana, second engineering study | An AGRIS-indexed study reports bulk density 56.5–84.6 kg/m³ over 5–20% moisture (dry basis), and test weight of 1,000 kernels 286–384 g. | The spread reinforces that grade/moisture and test method matter. Neither bulk density nor 1,000-piece weight is a kitchen cup conversion or single count-to-mass map. |
| Commercial raw-to-pop totals | The ICAR/NIFTEM guide reports an aggregate Bihar estimate of 120,000 metric tons of seeds producing 40,000 metric tons of popped makhana. | Regional annual production totals are not a batch process yield; do not derive a recipe conversion from this ratio. |
| EU novel-food specification | Lists typical nutrient components per 100 g of its specified roasted-popped product. | Composition basis, not a density or kitchen measure. It is product/market-specific and does not represent all makhana products. |

**Measurement disposition:** research found engineering bulk-density observations for popped kernels, but no supported single cooking conversion. Keep base density and all active unit mappings null. Store no raw-to-popped yield. Do not generalize size grades, “100 seeds” weights, or net package weight into culinary portions.

## Substitution evidence

No source-backed direct substitute or replacement ratio was found for raw makhana seed or roasted-popped makhana. Online snack sources compare popped makhana with popcorn or call it a popcorn alternative, but those analogies do not establish a recipe-scoped exchange amount or equivalent performance. Do not add popcorn, lotus seeds, nuts, or other popped seeds as a generic substitute. Keep substitution research explicitly unsupported for this identity and form until a particular recipe role and quantity basis are documented.

## Normalized-key, legacy, source-ID, and recipe audit

Exact-key comparison uses the repository’s normalized ingredient search behavior (NFKD/case folding, accent and ligature folding, punctuation-to-space, and trimming). It checked all reference names/aliases, form labels/match terms, and legacy candidate names/aliases. No existing proposal was found for makhana, fox nuts, or *Euryale ferox*.

| Candidate term(s) | Normalized key(s) | Current exact owner | Decision |
| --- | --- | --- | --- |
| `makhana seeds`; `graines de makhana`; `makhana`; `Euryale ferox` | `makhana seeds`; `graines de makhana`; `makhana`; `euryale ferox` | None | New species-and-seed identity candidate. |
| `fox nut`; `fox nuts`; `gorgon nut` | `fox nut`; `fox nuts`; `gorgon nut` | None | Consider as source-backed English aliases only. |
| `roasted makhana`; `popped makhana`; `puffed makhana`; `graines de makhana soufflées` | Exact phrase keys | None | Candidate `roasted_popped` form terms only. |
| `noix de renard` | `noix de renard` | None | Provisional source-scoped French form term; not a preferred display. |
| `lotus seed`; `lotus seeds`; `graines de lotus soufflées` | Exact phrase keys | None | No exact owner, but exclude as aliases because common retail usage conflates species; keep lotus root separate. |
| `Mithila Makhana`; `phool makhana`; `lawa` | Exact phrase keys | None | Preserve with regional/product scope only; no global alias. |

The 99 legacy candidates contain no exact makhana, fox-nut, gorgon-nut, Euryale, or lotus-seed candidate. The 16 forms contain no related label or match term. The current research ledger also has no record matching the scoped names or species terms. The only exact related active reference is `ingredient-ref-lotus-root`; no exact key searched in this table belongs to it.

The proposed packet-local namespace `WP03-I-MAKHANA-20261009-Sxx` (11 source IDs) was checked against all 746 current ledger source entries and all 33 proposal files present at audit time. No collision was found. IDs below are proposal-local identifiers only; no source was added to the canonical ledger.

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were searched for makhana, fox nut(s), gorgon nut(s), lotus seed(s), *Euryale ferox*, the French market labels, and the scoped product/form terms. There were **zero full-text recipe matches and zero ingredient-line matches**. No recipe relinking, form-hint correction, density, unit mapping, package yield, or substitution change is proposed.

## Coordinator dispositions

1. Added species-anchored `makhana seeds (Euryale ferox)` and one `roasted_popped` form, while keeping raw/unpopped seed outside the ready-to-eat form.
2. Retained `graines de makhana (Euryale ferox)` as provisional descriptive fr-CA wording pending independent Québec review.
3. Omitted retailer-only `noix de renard` from active form search terms. Excluded `lotus seed(s)` and `graines de lotus soufflées` as aliases because those names conflate different species.
4. Recorded three Jha & Sharma bulk-density measurements against the popped-kernel form as engineering evidence only. Added no active density, unit mapping, mass/volume conversion, raw-to-popped yield, or substitute.
5. No bundled recipe line was relinked. Section I remains open for other melon seeds, lotus seeds (*Nelumbo nucifera*), regional kernels, processing, measurement, and terminology review.

Canonical post-merge snapshot: 447 ingredient references, 17 forms, 614 ledger records, 764 source entries, 99 legacy candidates, and 114 recipes / 1,123 ingredient rows. Reference SHA-256: `b5b527cb3d6be40aba99939183b36aece0ff1c8e37d2fe2c63e943e3ee29e577`; form SHA-256: `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15`; ledger SHA-256: `e32ac1d3c1a6c01f409c30c8b7f50f14cc2218c06e674784609c29243d36457a`.

## Sources and source-to-claim map

Sources were accessed 2026-10-09. IDs are checked proposal references, not ledger records. Market pages support observed naming only; they do not establish botanical identity or a standard composition.

| ID | Source | Claim scope and limitation |
| --- | --- | --- |
| WP03-I-MAKHANA-20261009-S01 | Kew, [Plants of the World Online: *Euryale ferox*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:605350-1) | Accepted species and Nymphaeaceae classification. Botanical source, not a culinary processing guide. |
| WP03-I-MAKHANA-20261009-S02 | Kew, [Plants of the World Online: *Nelumbo nucifera*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:605422-1) | Sacred lotus is an accepted, separately classified species in Nelumbonaceae; supports rejecting unqualified lotus-seed equivalence. |
| WP03-I-MAKHANA-20261009-S03 | National Agriculture Market (eNAM), [Commodity list: Makhana seed](https://enam.gov.in/web/docs/221_commodity_list.pdf) | Names raw makhana seed, fox nut, gorgon nut, and botanical *Euryale ferox*. Supports the raw commodity/species name boundary, not ready-to-eat use. |
| WP03-I-MAKHANA-20261009-S04 | ICAR Krishi Vigyan Kendra / NIFTEM, [Foxnut (Makhana) Processing guide](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/08/makhanaprocessing.pdf) | Describes the hard-coated seed and separation of the edible popped kernel; process stages, production totals, and product data are processing/industry context, not a household method or safety instruction. |
| WP03-I-MAKHANA-20261009-S05 | European Commission, [Implementing Regulation (EU) 2023/652, English text](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32023R0652) | Defines the specific food as roasted and popped *Euryale ferox* kernels and gives label designations and product specification. EU market/legal scope only; not Canadian approval. |
| WP03-I-MAKHANA-20261009-S06 | European Commission, [Implementing Regulation (EU) 2023/652, French text](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A32023R0652) | French official wording `graines grillées et soufflées d’Euryale ferox Salisb. (makhana)`. Supports a provisional French product description, not OQLF preference or Québec product labeling law. |
| WP03-I-MAKHANA-20261009-S07 | Walmart Canada, [Aliments rôtis Makhana, Sel de l’Himalaya](https://www.walmart.ca/fr/ip/Aliments-r-tis-Makhana-Sel-de-l-Himalaya-70g/1W02EEAIBR62?classType=REGULAR) | One French Canada marketplace listing describes Makhana/fox nuts and calls the product `graines de lotus soufflées`; retailer wording only, not species confirmation or preferred French terminology. |
| WP03-I-MAKHANA-20261009-S08 | Metro Québec, [Graines de lotus soufflées à saveur de lime et piment, Mr Makhana](https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-salees/noix-graines-et-viandes-sechees/graines-de-lotus-souffle-a-saveur-de-lime-et-piment/p/8908006646739) | Québec-facing product title uses `graines de lotus soufflées` for a branded Makhana snack. Recorded to document the naming conflict; not used as a botanical synonym. |
| WP03-I-MAKHANA-20261009-S09 | Jha & Sharma, [“Physical, gravimetric and functional characterization of various milling fractions of popped gorgon nut (*Euryale ferox*)”](https://pmc.ncbi.nlm.nih.gov/articles/PMC3551101/) (*Journal of Food Science and Technology*, 2010; DOI 10.1007/s13197-010-0102-5) | Reports popped-product bulk density at 6.2, 9.4, and 12.3% moisture (dry basis), using known-volume cylinder measurements; sample and post-harvest processing scope, not a general kitchen density. |
| WP03-I-MAKHANA-20261009-S10 | FAO AGRIS, [“Physical and hygroscopic properties of makhana”](https://agris.fao.org/search/en/records/65df2ca463b8185d9cab4451), *Journal of Agricultural Engineering Research* 72(2), 145–150 | Abstract reports bulk density and thousand-kernel weight over moisture ranges. Repository abstract is useful corroboration of variability, not a volume conversion. |
| WP03-I-MAKHANA-20261009-S11 | Intellectual Property India, [GI Registry: Mithila Makhana](https://search.ipindia.gov.in/GIRPublicSearch/Application/Details/696) | Registered regional indication and origin scope; does not make `Mithila Makhana` a generic name for all *E. ferox* seed products. |

### Search log

- `site:icar.gov.in makhana Euryale ferox fox nut processing`
- `site:enam.gov.in makhana seed fox nut raw`
- `site:eur-lex.europa.eu 2023/652 Euryale ferox makhana roasted popped`
- `site:powo.science.kew.org Euryale ferox` and `Nelumbo nucifera`
- OQLF searches for `makhana`, `fox nut`, `noix de renard`, and `graines de lotus`; no specific preferred makhana entry surfaced.
- `Canada French makhana graines soufflées`; `Québec makhana épicerie`
- `popped makhana bulk density kg/m3 measurement`; `makhana 1 cup grams`
- `makhana substitute popcorn recipe replacement`

No source-backed recipe conversion or substitute was found. The negative result does not rule out a future product-specific measurement or contextual substitute if a named recipe and measured basis are supplied.
