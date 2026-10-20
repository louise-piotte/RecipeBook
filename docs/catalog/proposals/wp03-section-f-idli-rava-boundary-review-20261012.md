# WP03 Section F: idli rava product and Québec French boundary review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated as an unresolved ledger-only candidate on 2026-10-12. Active references, recipes, forms, generated Kotlin, and runtime behavior remain unchanged.
- **Scope:** one unreviewed regional preprocessed-rice candidate: the dry coarse rice product sold as *idli rava* / *rice rava* for South Indian cooking.
- **Disposition:** hold as an unallocated candidate. Current sources establish a real rice-granule product and English market wording, but do not establish whether the generic class should require parboiled rice or include products whose rice-processing method is unspecified. Canadian French marketplace wording is inconsistent, and the Québec terminology sources reviewed do not establish a stable French product name for this rice product.
- **Plan location:** the active Section F checklist still asks for regionally significant cereal mixes and preprocessed grains ([plan lines 1941–1947](../../RecipeBook-global-ingredient-catalog-plan.txt#L2034)). This is a fresh candidate review, separate from the integrated Dalia boundary at [plan lines 1956–1961](../../RecipeBook-global-ingredient-catalog-plan.txt#L2049) and the identity-only cream-of-rice hot cereal at [plan lines 1966–1969](../../RecipeBook-global-ingredient-catalog-plan.txt#L2059).
- **Workflow:** research and integration remain separate; this packet recommends a ledger candidate record only if the hold is accepted ([catalog workflow](../ingredient-catalog-workflow.md)).

## Proposal-stage package snapshot

The read-only proposal audit used the split seed package and ledger after the parent-owned 2026-10-12 integrations and before the later potato-starch alias and idli-rava ledger updates. File hashes cover exact bytes; the current integration snapshot is recorded below. The corpus digest hashes every manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Live count/state | SHA-256 or corpus digest |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,235 references | `b55f15a8e10fb802e4f1bfb0574a8142a2cc6f4dca349c481cfe3abae21ed330` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import identities | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,533 records; 5,280 source entries; 4,322 distinct source IDs | `7a8bb76d9454d8b1bc5975424b893422411194b9f9990f0395b037d6307de422` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 752,993 bytes | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

The current Section F progress files and proposal directory were re-read. Searches across the live plan, roadmap, current and prior Section F proposals, batch notes, active references, forms, legacy candidates, ledger, and recipe package found no prior focused decision for `idli rava`, `idly rava`, `rice rava`, or `rice semolina`. The Dalia packet, chiwda/chivda hold, cream-of-rice hot-cereal identity, and all reviewed cereal-flake identities are treated as closed and are not reopened here. The WP02 brown-rice-farina review is an adjacent boundary only: it explicitly kept `rice semolina` off that brown-rice product's aliases; it does not allocate an idli-rava identity.

## Product identity and name evidence

The product candidate is a dry, granular rice product marketed for idli preparation. A food-science paper identifies *idli rava* as parboiled-rice semolina in its control idli preparation. Current Canadian retailer descriptions use `Idly Rava` and `Rice Rava` for coarsely ground rice. A separate Canadian listing calls a white-rice product `White Rice Upma Rava` / `White Rice Rava`. These sources establish that the product name is used for rice granules, but do not settle one generic manufacturing scope: the research and one Canadian marketplace label specify parboiled rice, while other Canadian retailer descriptions do not state the rice-processing method.

The bare word `rava` is not a safe alias. A manufacturer sells an `Instant Rava Idli Mix` whose ingredients include **wheat semolina**, oil, salt, pulses, raising agent, and seasonings. Canadian and Québec-facing pages also use *rava* in prepared dosa/idli names. Keep this rice-granule candidate separate from wheat semolina, prepared idli/dosa mixes, fermented batter, finished idlis, rice flour, intact idli rice, generic parboiled rice, and hot cream-of-rice cereal.

| Candidate field | Finding | Decision |
| --- | --- | --- |
| Product identity | Sources support a dry coarse/granular rice product used for idli; a research paper's example uses parboiled rice semolina. Retail descriptions vary in whether they specify parboiling. | Retain as a scoped research candidate. Do not create a product row until the generic class's parboiled-rice requirement, if any, is explicit. |
| English display | `idli rava` and `idly rava` occur in current product titles; `rice rava` is used as a product synonym by a Canadian retailer. | Record only as candidate evidence. Do not activate aliases yet. `rava` alone stays excluded because it also names wheat semolina and composite mixes. |
| Québec French display | A Walmart Canada French marketplace page uses `semoule de riz grossière` in its description and a title containing `Farine de Semoule de Riz Grossière Étuvée`; a Toronto French retailer lists `Semoule de riz Priya`. A Laval menu search result uses `semoule de riz (rava)` in a prepared-dish description. These are market/menu attestations, not an OQLF term or a dry-product specification; Walmart says marketplace product information is supplied by sellers and is not separately verified. | **Unresolved; add no French display or alias.** Do not treat the seller phrase as an approved Québec picker name. |
| `cream of rice` / `crème de riz` | One Canadian retailer uses `Cream of Rice` as a synonym for idli rava, but the active catalog already owns French `crème de riz` on `ingredient-ref-cream-of-rice-hot-cereal`. | Keep the source synonym inactive. Do not point it at idli rava or change the existing hot-cereal identity. |
| `semolina`, `sooji`, `rava`, `rawa` | These unqualified terms can denote wheat semolina or product mixtures. OQLF's `semoule` record is defined in wheat milling contexts; its `semoule de blé tendre` record is expressly wheat-specific. | Do not add any unqualified term as an alias. |
| Proposed reference ID | `ingredient-ref-idli-rava` is absent from current active references, forms, legacy candidates, and ledger record IDs. | Keep unallocated while the product and Québec name boundary remains unresolved. |

The exact Québec wording remains the blocker. Current Canadian French product titles and descriptions are useful evidence that sellers use *semoule de riz*, but they do not settle whether the catalog should display `semoule de riz`, `semoule de riz grossière`, or a rice-specific product name qualified by *idli rava*. The OQLF `semoule` entry is about wheat milling, and the current French marketplace pages do not carry an OQLF-backed or manufacturer-verified generic label for the rice product. Do not construct a canonical picker name from the English item title alone.

## Existing owners, normalized collision, and recipe-demand audit

The audit used the repository's `normalize_search_key` behavior (case-folding, NFKD, accent and ligature folding, punctuation replacement, and whitespace collapse). It compared exact normalized keys across every active reference ID/name/alias, all form fields and match terms, the 66 legacy candidates, ledger record IDs and strings, and the full manifest-ordered recipe package.

| Surface | Candidate-key result |
| --- | --- |
| Active references | No exact owner for `idli rava`, `idly rava`, `idli rawa`, `rice rava`, `rice semolina`, `rice sooji`, `semoule de riz`, or `semoule de riz grossière`. The nearby exact owner `parboiled rice` is `ingredient-ref-parboiled-rice`; it is not a synonym for a milled product. |
| Existing cream-of-rice owner | `crème de riz` is owned by `ingredient-ref-cream-of-rice-hot-cereal` (`cream of rice hot cereal / crème de riz`). The phrase `cream of rice` is retained there as part of the canonical English name; it is not assigned to this candidate. |
| Forms | No exact candidate-key owner among 86 forms. Generic rice dry/cooked forms remain generic-rice preparation states and are not transferred to a separate granular product. |
| Legacy candidates | No exact candidate-key owner among 66 records. |
| Research ledger | At proposal review, no exact candidate-term or proposed-ID record existed. `candidate-idli-rava` and `ingredient-ref-idli-rava` were unallocated, and the nine proposal-local source IDs were unused. The candidate record and sources are now integrated as described below. |
| Bundled recipes | Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows. Exact normalized phrase search found 0 candidate-term recipe files and 0 candidate-term ingredient rows. No row is linked to idli rava or rice rava. |

The recipe search included `idli rava`, spelling variants (`idly rava`, `idli rawa`, `idly rawa`), `rice rava`, `rice semolina`, `rice sooji`, `semoule de riz`, `semoule de riz grossière`, `semoule de riz étuvée`, `rava idli`, and the unqualified terms `idli`, `rava`, and `rawa`. No recipe line warrants a link or recipe-specific product interpretation. The audit is a normalized ownership/content check, not a live picker-ranking test.

## Measurements, forms, conversions, and substitutions

- **Measures and density:** retailer package sizes such as 500 g, 2 lb / 907 g, and 4 lb are net package declarations, not a household serving or volume-to-mass relation. No reviewed source supports a transferable volume measure, density, unit mapping, or measurement observation. Keep all unavailable.
- **Forms:** the sources support a processed dry rice product, but not a reusable form relation from whole/parboiled rice to this product or from it to cooked rice, idli batter, or finished idli. Add no form or conversion rule.
- **Cooking yield:** no transferable dry-to-cooked yield is supported. Product or dish directions, if present on a listing, are not a general yield relation.
- **Substitutions:** using rice granules with urad dal to make idli does not establish a replacement rule for rice flour, wheat semolina, cream-of-rice hot cereal, or other grains. Add no global or contextual substitution evidence or rule.
- **Recipe links:** none. The complete manifest scan found no matching ingredient line.

## Integrated shared-file delta

Added one ledger-only candidate record `candidate-idli-rava` with the nine proposal-local sources and an `unresolved` decision that retains the rice-granule product evidence while waiting for a settled product boundary and Québec French display. The record uses `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; it contains no measurement observations.

No change was made to `ingredient-references.v1.json`, `ingredient-forms.v1.json`, recipe files or links, manifest, generated Kotlin, or runtime behavior. `ingredient-ref-idli-rava` remains unallocated; no English or French aliases, form, density, unit mapping, conversion, yield, or substitution were added. The plan, roadmap, and workflow now record the hold.

## Remaining Section F gaps

This packet resolves only the evidence disposition for idli rava. The live Section F checklist remains open for other regional cereal mixes and preprocessed grains, as well as the separate remaining dry/cooked form work. The integrated Dalia evidence, cream-of-rice cereal, flakes, poha, rice blends, and previously reviewed holds stay closed at their documented scopes; this review does not revisit them. Other documented farro, sushi-rice, corn-product, puffed-grain, species-level millet, and terminology holds remain under their own records.

To reconsider idli rava, obtain a manufacturer or Québec retail bilingual package/ingredient listing that confirms whether parboiling is part of the product definition and establishes a Québec French display, then rerun the live ownership and full-manifest scans. Keep measures, forms, conversions, yields, substitutions, and recipe links unavailable unless separate sources directly establish each field.

## Proposal-local source register

These IDs are local to this proposal. They were checked absent from the 4,327-ID shared ledger before integration and are now stored on `candidate-idli-rava`. Pages were reviewed on 2026-10-12.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-IDLI-RAVA-20261012-S01` | M. Mounika et al., [“Bioavailability of iron from little millet and proso millet based recipes”](https://www.ijcmas.com/6-10-2017/M.%20Mounika%2C%20et%20al.pdf), *International Journal of Current Microbiology and Applied Sciences* 6(10) (2017), PDF p. 2833. | In its idli method, identifies `Idli rava (parboiled rice semolina)` as the control ingredient. Supports one food-science use and a parboiled-rice example, not a universal product specification, Québec name, recipe measure, or conversion. |
| `WP03-IDLI-RAVA-20261012-S02` | Iqbal Foods Canada, [Laxmi Idly Rava 4 lb](https://iqbalfoods.ca/product/laxmi-idly-rava-4lb-414732), product description. | Canadian retailer calls the product coarsely ground rice used for South Indian idli and says `Rice Rava` and `Cream of Rice` are alternate names. Retailer description is not a standard; the broad `Cream of Rice` wording is kept inactive because it overlaps the existing hot-cereal owner. |
| `WP03-IDLI-RAVA-20261012-S03` | Veehacart, [Organic Mandya Organic White Rice Upma Rava, 500 g](https://veehacart.ca/products/organic-white-rice-upma-rava), product title/description; Canadian storefront in Paris, Ontario. | Uses `White Rice Upma Rava` and `White Rice Rava`; describes milled white rice with a coarse texture. It is one product page and does not establish a general grain-preparation specification. |
| `WP03-IDLI-RAVA-20261012-S04` | Walmart Canada French, [Priya Idly (Idli) Rava](https://www.walmart.ca/fr/ip/Priya-Idly-Idli-Rava-Farine-de-Semoule-de-Riz-Grossi-re-tuv-e-2-lb-907-g/0ZE42SQ6UMZV), title and product details, UPC 00469420707638. | Current Canadian French marketplace listing uses `semoule de riz grossière` and says the product is made from parboiled rice. The listing is sold by a third-party seller; Walmart states that marketplace product information is supplied by sellers and is not separately verified. Supports market wording only, not an authoritative Québec term or general process boundary. |
| `WP03-IDLI-RAVA-20261012-S05` | Spice Divine, [Semoule de riz Priya, 907 g](https://spicedivine.ca/fr/products/priya-rice-rava-907g), French product title. | Canadian French storefront title attests `Semoule de riz`. Its description ambiguously describes the product as a mix of rice and semolina and gives no useful ingredient declaration, so only the title is used as a wording observation. The listing showed out-of-stock status. |
| `WP03-IDLI-RAVA-20261012-S06` | Office québécois de la langue française, [GDT: semoule](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8895941/semoule), definition and English equivalents. | Defines `semoule` in soft- and durum-wheat milling contexts. It supports a caution against extending the unqualified term to rice; it does not rule on rice semolina or idli rava. |
| `WP03-IDLI-RAVA-20261012-S07` | Office québécois de la langue française, [GDT: semoule de blé tendre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432749/semoule-de-ble-tendre), definition and English equivalents. | Québec terminology entry is explicitly about wheat and maps to `farina` / `spring wheat semolina`. It does not establish `semoule de riz` as a preferred Québec term. |
| `WP03-IDLI-RAVA-20261012-S08` | Priya Foods, [Instant Rava Idli Mix, 200 g](https://priyafoods.com/collections/instant-mixes/products/instant-rava-idli-mix-200g), manufacturer ingredients. | Manufacturer's prepared `Rava Idli Mix` contains wheat semolina, oils, salt, pulses, raising agent, and seasonings. This is a different formulated product; it shows why bare `rava` and mix names must not become aliases for a rice-granule identity. |
| `WP03-IDLI-RAVA-20261012-S09` | DoorDash, [Cuisine Arya — Laval, Québec](https://www.doordash.com/fr-CA/store/cuisine-arya-laval-29653274/38370963/), French menu description for `Oignon rava masala dosa`. | The indexed French menu uses `semoule de riz (rava)` for a prepared dosa. It does not identify a packaged dry ingredient or settle the rice-versus-wheat scope of `rava`; direct page retrieval was unavailable during this review. |

## Review disposition

**Accepted: hold idli rava / rice rava as an unallocated Section F candidate.** Evidence supports a regional coarse-rice ingredient, but the current Canadian product descriptions do not establish whether parboiling is required for the generic class, and the Québec French product name is not sufficiently stable or authoritative to activate. The decision and nine sources are in one candidate ledger record only. Active references, forms, recipe links, measurements, conversions, yields, and substitutions remain unchanged.


## Integration outcome (2026-10-12)

The current full-manifest audit still covers 114 recipe files / 1,123 ingredient rows and finds no candidate-term matches or links. Static checks passed: bundled package validation, research-ledger schema validation, exact candidate-key ownership, source-ID uniqueness, recipe scan, and UTF-8 without BOM. No tests or emulator checks were run because this change only adds a research-candidate record to database JSON under `AGENTS.md`.

| Surface | Current snapshot after integration |
|---|---|
| Ingredient references | 1,235 rows; SHA-256 `fe44e14adc8b1ad613dd84e15a36a6c381f96ecded39a777fae1279bfc674abd` |
| Ingredient forms | 86 rows; SHA-256 `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Research ledger | 1,534 records / 5,294 source entries / 4,336 distinct source IDs; SHA-256 `baffa3f9442bacf3807d44676fd051956e827e75c97518f7007312a8ee2e58eb` |
| Legacy import candidates | 66 rows; SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| Generated Kotlin catalog | 1,235 references; SHA-256 `6984414cba0130931d13751768e8cdf3c2e1dd4b66ff7cec586b1dccd515cbf9` |
| Seed manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows / 752,993 bytes; SHA-256 `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

See the [integration report](../batches/wp03-section-f-idli-rava-boundary-integration-20261012/README.md). The broader Section F checklist remains open.
