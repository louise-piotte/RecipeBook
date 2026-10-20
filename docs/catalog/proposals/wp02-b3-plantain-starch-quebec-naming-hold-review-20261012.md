# WP02 B3 — Isolated plantain starch: Québec naming hold

- **Reviewed:** 2026-10-12
- **Status:** The proposal was written proposal-only; the coordinator recorded its hold as a ledger candidate and documented the integration separately in the batch README.
- **Scope:** One candidate, starch isolated from plantain fruit. This review separates that material from green plantain flour, fresh plantain, banana starch, and prepared plantain/cassava mixes. It does not reopen other WP02 starch identities.
- **Inputs:** Current WP02 plan and baking-flours-and-starches batch; the prior banana/plantain flour review; recent B2/B3 proposals and integration reports; current references, forms, legacy import identities, ledger, manifest, and recipes.
- **Source-ID prefix:** `WP02-PLANTAIN-STARCH-QC-HOLD-20261012-S`; repository search found no earlier use.

## Recommendation

**Hold a new active `plantain starch` identity.** Primary food-science studies isolate starch from plantain and distinguish it from plantain flour, so the material is a legitimate separate research candidate. The current evidence does not establish a standalone Canadian/Québec product label or a Québec French name for it. OQLF supports `amidon` as the general French term for starch and TERMIUM supports `banane plantain` for the fruit, but the compound **`amidon de banane plantain` is only a transparent construction here**, not an OQLF/TERMIUM entry or a Québec product label. [S01–S06]

If the coordinator wants to preserve this result in the ledger, add an unresolved record `candidate-plantain-starch`; do not add or reserve an active reference, alias, form, or recipe link. Reopen the candidate when a Canadian/Québec standalone package or producer source identifies isolated plantain starch and provides usable Québec French naming evidence. A product source must also distinguish it from plantain flour and composite `fécule de foutou` preparations. [S01, S03, S06–S07]

| Candidate phrase or boundary | Disposition | Reason |
|---|---|---|
| `plantain starch` | **Hold as a separate candidate; no active row.** | Research sources establish isolated plantain starch as a material distinct from flour, but no product-level Canadian/Québec identity or localized label was found. Do not merge it into green plantain flour. [S01–S03, S06] |
| `amidon de banane plantain` | **Descriptive French candidate only; not accepted as a catalog display or alias.** | It combines OQLF's preferred generic `amidon` with TERMIUM's `banane plantain`, but neither source names isolated plantain starch with this phrase. [S04–S05] |
| `fécule de banane plantain`, `fécule de plantain` | **Do not adopt.** | OQLF describes `fécule` as a more specific term for starch in tubers or other underground organs; plantain is a fruit. No Québec product source reviewed supports either compound for isolated plantain starch. [S04–S05] |
| `banana starch` | **Do not alias to plantain starch.** | Embrapa separately studies starches isolated from dessert-banana cultivars and plantain cultivars. A broader banana term would erase the source distinction. [S02] |
| `plantain flour` / `farine de plantain` | **Keep with the active green-plantain-flour reference only.** | This is current Canadian/Québec retail wording for a flour product; it is not evidence for isolated starch. [S06] |
| `fécule de foutou` / plantain fufu or foutou mixes | **Keep out of this candidate.** | A regional research abstract describes composite foutou preparations made from plantain and cassava. It does not identify pure plantain starch or establish a Québec display. [S07] |

## Product and process boundary

- Vega-Rojas et al. study both flour and **isolated starch** made from unripe plantain and report separate properties for the two products. This supports the conceptual boundary between the active green-plantain-flour identity and an isolated-starch candidate; the paper's laboratory sample is not a retail specification. [S01]
- Embrapa's 2025 study evaluates isolated starches from four dessert-banana cultivars and three plantain cultivars. It reports cultivar-related variation and treats the groups separately. It supports keeping `banana starch` and `plantain starch` distinct as candidate search concepts, not a universal botanical or commercial taxonomy. [S02]
- Laskar et al. compare starch isolated from plantain using distilled-water, sodium-hydroxide, and potassium-metabisulfite extraction methods, alongside flour. The method-specific results show why laboratory material should not be treated as one standardized consumer product. The reported 6.76–10.20% extraction yields are study-sample yields only; they are not home-processing yields, package yields, or recipe conversions. [S03]
- The Canadian/Québec evidence located for plantain-derived pantry products names flour, including `plantain flour / farine de plantain`; it does not state that this product is isolated starch. Do not reuse the active flour alias for starch. [S06]
- A French-language regional abstract uses `fécule composite de foutou` for formulations that combine green plantain and cassava. This is a product boundary warning: do not treat `fécule de foutou`, plantain fufu, pounded plantain, or other ready-to-prepare mixtures as aliases for isolated starch. The abstract is not a Québec terminology source or a product standard. [S07]

No reviewed source establishes a universal plantain species/cultivar set, maturity grade, pulp-versus-peel inclusion, native/modified grade, or food retail specification for an unqualified commercial `plantain starch` product. Keep the candidate's scope limited to **research-demonstrated starch isolated from plantain fruit** until a product source narrows it.

## Québec French and picker phrase boundary

OQLF's 2026 `amidon` entry gives **`amidon`** as the preferred general term and says **`fécule`** is used more specifically for starch in plant tubers or, more generally, underground organs. It does not name plantain starch. TERMIUM's food-industry fruit entry gives **`banane plantain`** for English **`plantain`**, but it names the fruit rather than an extracted ingredient. Thus `amidon de banane plantain` is linguistically plausible as a description, but this review found no exact Québec term or local label validating it as a pantry-ingredient display. [S04–S05]

Current Québec retail wording instead labels the nearby product **`plantain flour, farine de plantain`**. The live catalog already assigns `farine de plantain` as an alias to green plantain flour. That listing supports the flour phrase only; it gives no evidence for starch extraction or a French starch name. [S06]

I searched current OQLF/TERMIUM results and Canadian/Québec retail sources for the exact strings `plantain starch`, `banana plantain starch`, `amidon de banane plantain`, `amidon de plantain`, `fécule de banane plantain`, and `fécule de plantain`. The search located scientific use of the English material name and component-level French terminology, but no standalone Canadian/Québec plantain-starch label. This is a bounded search result, not proof that no such product is sold.

The live picker normalizes case, accents, ligatures, punctuation, and spacing; it returns complete normalized word phrases before falling back to partial matches. A static phrase audit against the live references and attached forms produced:

| Query | Current picker result |
|---|---|
| `plantain starch`, `banana starch`, `amidon de banane plantain`, `amidon de plantain`, `fécule de banane plantain`, `fécule de plantain` | No result |
| `plantain flour`, `farine de plantain` | `ingredient-ref-green-plantain-flour` only |
| `banane plantain`, `plantain` | `ingredient-ref-plantain` and `ingredient-ref-green-plantain-flour` |

Do not attach `plantain starch`, `banana starch`, or an unverified French construction to the flour or fruit rows. In particular, do not use bare `plantain` or `banane plantain` as an alias: those current broad queries already return the fruit and flour identities.

## Live ownership audit

Read-only worktree snapshot on 2026-10-12, immediately before the coordinator recorded this candidate:

| Surface | Current count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,254 | `7a2916bb212ad9cc967ba63520c0ee01115d11d06bd9fce106a53819796904e7` |
| Ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy import candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,562 records / 5,460 source entries / 4,498 distinct source IDs | `a6671fa6261e5d4904ca1a56bc5a73d64e06be9d5dc2cb39129c874711103636` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Exact normalized searches across active reference displays and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs found no owner for `plantain starch`, `banana starch`, `amidon de banane plantain`, `amidon de plantain`, `fécule de banane plantain`, `fécule de plantain`, or `candidate-plantain-starch`. No active ID `ingredient-ref-plantain-starch` exists. The relevant current ownership is:

| Current owner | Current wording/state | Boundary |
|---|---|---|
| `ingredient-ref-green-plantain-flour` | `green plantain flour / farine de banane plantain verte`; English alias `plantain flour`; French alias `farine de plantain`; density `null`; no unit mappings. | Verified flour identity. Its ledger includes Pelissari et al. (2012), which separately studies flour and isolated starch; no starch alias is accepted. |
| `ingredient-ref-plantain` | `plantain banana / banane plantain`; no aliases. | Fresh fruit identity, not flour or extracted starch. |
| `ingredient-ref-green-banana-flour` | `green banana flour / farine de banane verte`; no aliases. | Separate source-fruit flour; not banana or plantain starch. |
| Plantain/banana forms | No form attached to the plantain or flour references. The current mashed-ripe-banana form belongs to ordinary banana and is unrelated. | No source supports a plantain-starch form. |
| Existing ledger candidate | No plantain-starch candidate. `candidate-yam-starch` is a separate *Dioscorea*-starch hold. | Do not merge the plantain candidate into yam starch or a generic root-starch identity. |

The prior WP02 B4 review explicitly named isolated plantain starch as a possible **future** candidate and did not assign a row. Full-text search of the WP02 proposal/batch corpus found no focused plantain-starch naming or ownership review and no plantain-starch integration. The recent canna, konjac, manioc, pea, and edible-sago-starch packets concern other source materials and do not overlap this candidate. This packet narrows that earlier note into a source and Québec-name hold.

## Bundled recipe demand

I scanned the current 114 manifest-listed recipe JSON files and all 1,123 ingredient rows. Case-, accent-, punctuation-, and spacing-normalized searches found **zero recipe-text hits and zero ingredient-row hits** for:

`plantain starch`, `banana starch`, `plantain banana starch`, `starch from plantain`, `isolated plantain starch`, `amidon de banane plantain`, `amidon de plantain`, `fécule de plantain`, `fécule de banane plantain`, `fécule de foutou`, `plantain flour`, `green plantain flour`, `farine de plantain`, and `farine de banane plantain`.

The corpus therefore supplies no plantain, plantain-flour, plantain-starch, or plantain-fufu demand and no line-level evidence for a recipe alias, form, measurement, or substitution. Retail availability evidence is independent of this bundled-recipe scan.

## Numeric, form, and substitution limits

- Add no density, unit mapping, household measure, conversion, or recipe quantity. The published extraction yields and laboratory composition, granule morphology, viscosity, thermal, and digestibility measurements describe specific cultivars, preparation procedures, and research samples. They do not establish grams per cup or another reusable recipe conversion. [S01–S03]
- Add no form. The evidence does not establish a consumer taxonomy for native, modified, pregelatinized, instant, or other retail plantain-starch presentations. The extraction states used in laboratory protocols are not catalog forms. [S01, S03]
- Add no substitution rule between plantain starch and green plantain flour, banana flour/starch, tapioca, potato, arrowroot, or another starch. The reviewed studies characterize materials; they do not provide a general baking or recipe replacement ratio. [S01–S03]
- Keep the ledger measurement state at `researched_no_supported_value` if this hold is recorded. Keep substitution research at `not_yet_researched`; this bounded identity review did not conduct recipe-specific substitution research.

## Integrated hold

Recorded only the unresolved `candidate-plantain-starch` ledger record with `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`, using sources S01–S07. No active reference was added, no active ID was reserved, and aliases, forms, and recipe links remain unchanged. The bundle has no candidate recipe demand. See `docs/catalog/batches/wp02-b3-plantain-starch-quebec-naming-hold-integration-20261012/README.md` for the final snapshot and static checks.

Reopen for active-catalog consideration only when evidence identifies a standalone food-grade isolated plantain-starch product, gives enough source/process scope to distinguish it from flour and composites, and supports a Québec French display. `amidon de banane plantain` may be submitted for independent Québec review then; it is not approved by this packet.

## Sources

Sources were accessed on 2026-10-12. Research measurements and retailer wording are limited to the cited samples and product pages.

| ID | Source and evidence | Limits |
|---|---|---|
| **S01** | Lineth J. Vega-Rojas, Sandra M. Londoño-Restrepo, and Mario E. Rodriguez-García, [“Study of morphological, structural, thermal, and pasting properties of flour and isolated starch from unripe plantain (*Musa paradisiaca*)”](https://doi.org/10.1016/j.ijbiomac.2021.05.144), *International Journal of Biological Macromolecules* 183 (2021), 1723–1731. | Primary study directly distinguishes flour from isolated starch and limits its samples to specified unripe plantains and its laboratory protocol. It is not a consumer specification, Québec label, kitchen measure, or substitution study. |
| **S02** | J. L. de Jesus et al., [“Banana and Plantain Starches: exploring differences and potential applications”](https://www.embrapa.br/en/busca-de-publicacoes/-/publicacao/1179755/banana-and-plantain-starches-exploring-differences-and-potential-applications), Embrapa Cassava & Fruits, 2025. | Institutional research record describes isolated starches from four dessert-banana and three plantain cultivars and reports cultivar-related variation. It supports keeping the source distinction visible; it does not define a market-wide product class or commercial name. |
| **S03** | R. Laskar et al., [“Comparison of physicochemical, rheological, and digestibility properties of starch isolated from plantain (*Musa paradisiaca*) using different methods”](https://doi.org/10.1002/fob2.70060), *Food Biomacromolecules*, first published 2026-04-17. | Primary study compares distilled-water, sodium-hydroxide, and potassium-metabisulfite extraction with flour and reports method/sample-specific properties. Its 6.76–10.20% extraction-yield range is not a kitchen or package yield. |
| **S04** | Office québécois de la langue française, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. | Supports the general French term `amidon` and describes the narrower contextual use of `fécule` for tuber/underground-organ starch. It does not contain a plantain-starch compound or product name. |
| **S05** | Public Services and Procurement Canada, [TERMIUM Plus search for banane plantain](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frr&lang=fra&srchtxt=BANANE+PLANTAIN), food-industry entry dated 2007-04-23. | Lists French `banane plantain` for the fruit and English `plantain`; it does not name a starch ingredient. The dynamic search result was checked on 2026-10-12. |
| **S06** | Épicerie La Hacienda, [online ordering menu](https://www.epicerielahacienda.com/commande), Laval, Québec, current listing. | Lists “Mountain delight- plantain flour, farine de plantain 340g” in its flours category. This is useful local wording for a flour product only; the page does not provide a starch product or ingredient panel. |
| **S07** | CAMES, [JSDC-6 food-security and nutrition abstracts](https://jsdc.cames.online/web/jsdc6/telecharger-resumes-ptr-securite-alimentaire-nutritionnelle), abstract on composite foutou preparations from plantain and cassava. | Describes regional `fécule composite de foutou` formulations using both green plantain and cassava. It is a conference abstract, not an OQLF term, Québec retail label, isolated-starch standard, or transferable formula. |

The proposal was authored as a proposal-only review. Its separate coordinator integration added one unresolved research-ledger candidate and updated the plan and roadmap; active seed references, forms, generated code, recipes, and substitution data remain unchanged. No app tests or emulator checks were run because the integration only adds database JSON data under `AGENTS.md`.
