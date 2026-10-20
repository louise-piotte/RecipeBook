# WP04 Section P — Atlantic croaker / tambour brésilien picker-boundary review

- **Review and source-access date:** 2026-10-13.
- **Status:** Root-reviewed hold accepted 2026-10-13; no catalog or ledger record was added. See the [hold decision batch](../batches/wp04-section-p-atlantic-croaker-picker-hold-integration-20261013/README.md).
- **Recommendation:** Hold *Micropogonias undulatus* outside the active picker. The species and its Québec French name are well supported, but CFIA assigns the unqualified English label **Croaker** to both *M. undulatus* and *Micropogonias furnieri*. A display-only `Atlantic croaker / tambour brésilien` row would make a bare `croaker` query return this one species, even though that word is an accepted name for another taxon too. The bundle has no matching recipe demand.
- **Scope:** One unreviewed regional finfish identity. This packet does not reopen black drum, freshwater drum, red drum, or any other completed Section P work.
- **Inactive while held:** Do not add a reference, legacy candidate, ledger record, alias, form, measurement, density, unit mapping, conversion, yield, recipe link, or substitution.

## Candidate identity and name boundary

The candidate is Atlantic croaker, *Micropogonias undulatus*, CFIA TSN 169283. The CFIA Fish List returns these relevant rows:

| TSN | Taxon | English common name | French common name |
|---:|---|---|---|
| 169283 | *Micropogonias undulatus* | Croaker | — |
| 169283 | *Micropogonias undulatus* | Atlantic Croaker | Tambour Brésilien |
| 169285 | *Micropogonias furnieri* | Croaker | Tambour |
| 169285 | *Micropogonias furnieri* | Whitemouth Drummer | — |

This is an exact common-name collision, not a claim that the two species are interchangeable. CFIA describes its Fish List as accepted English and French fish-labelling names paired with scientific names and TSNs. Its guidance says only the common names listed for a species should be used as that species’ sale/processing name. The picker currently cannot express that `croaker` can point to more than one species while presenting only one matching row.

The OQLF GDT entry supports **tambour brésilien** as the preferred Québec edible-fish term, with English **Atlantic croaker** and Latin *Micropogonias undulatus*. It says the species has commercial potential in Québec; this is terminology evidence, not proof of current Québec retail availability. The entry was last updated in 2012. It labels `tambour du Brésil` as France/Europe wording and says `tambour du Brésil`, `courbine`, `grondeur atlantique`, and `tambour atlantique` were not retained for Québec fish-product marketing. Its English translation list also includes `croaker`, `hardhead`, and `golden croaker`; do not add those as picker aliases. The federal TERMIUM entry for `croaker` separately shows the word in the English terms for *Cynoscion regalis* and notes that it is also used for *M. undulatus*, further demonstrating that the English common word does not uniquely allocate this species.

The Québec display pair is therefore well evidenced as **Atlantic croaker / tambour brésilien**, but the qualified display does not protect the unqualified English query. Adding only the qualified French term as an alias would not solve that issue because the English display itself contains the word `croaker`.

## Ownership and previous-work audit

The live snapshot contained 1,333 ingredient references, 98 forms, 64 legacy-import candidates, 1,641 research-ledger records, and 8 unit-conversion observations. Normalized whole-value checks across reference IDs/names/aliases, form IDs/labels/match terms, legacy IDs/names/aliases, and ledger IDs/evidence found no exact owner for:

- `ingredient-ref-atlantic-croaker` or `candidate-atlantic-croaker`;
- `Atlantic croaker`, `croaker`, or *Micropogonias undulatus*;
- `tambour brésilien`, `tambour du Brésil`, `courbine`, `grondeur atlantique`, or `tambour atlantique`.

The only ledger text hits are contextual: a black-drum decision says to keep black drum distinct from “other croakers,” and its OQLF source summary records `courbine` among terms not retained for black drum. Neither allocates or reviews *M. undulatus*. Archive searches found no Atlantic-croaker-specific proposal or batch; the same generic “other croakers” sentence is the only prior Section P proposal/batch mention. The new proposal-local source prefix `WP04-SECTIONP-ATLANTIC-CROAKER-BOUNDARY-20261013` has no earlier occurrence.

The current nearby active references are black drum / grand tambour, freshwater drum / malachigan, and red drum / tambour rouge. They remain separate species identities; family membership and overlapping drum/croaker market words do not establish synonymy or substitution.

| Live file | Count | SHA-256 at review |
|---|---:|---|
| `ingredient-references.v1.json` | 1,333 | `6e80317089b2bbd55991234e8dc9a880654d78355f463f6feebd809e7a0c1823` |
| `ingredient-forms.v1.json` | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,641 records | `3a61c7a9d3ba0f871582221dfc993aae99eb9959c632215cc1e2c416212ed1e3` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

These checksums identify the review snapshot only; this proposal does not reserve or modify any listed record.

## Current picker projection

I projected a hypothetical display-only row, with no aliases or forms, through the current name/form search behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The picker normalizes accents and punctuation, prefers complete word-phrase matches, and falls back to substring matching. A query matching a word within a qualified display is still a result.

| Query | Current picker | With hypothetical `Atlantic croaker / tambour brésilien` row | Effect |
|---|---|---|---|
| `Atlantic croaker` | No results | Atlantic croaker / tambour brésilien | Qualified phrase is specific. |
| `croaker` | No results | Atlantic croaker / tambour brésilien | The broad word would appear to identify this one species, despite CFIA’s second *Micropogonias* croaker row. This is the hold trigger. |
| `tambour brésilien` | No results | Atlantic croaker / tambour brésilien | Qualified Québec phrase is specific. |
| `tambour` | Black drum / grand tambour; red drum / tambour rouge | Those two plus Atlantic croaker / tambour brésilien | Keeps the drum choices visible, but does not repair the English collision. |
| `drum` | Black drum / grand tambour; freshwater drum / malachigan; red drum / tambour rouge | Same three | No candidate-name change for this query. |
| `hardhead`, `golden croaker` | No results | No results | These OQLF translation terms are not proposed as aliases. |

The candidate cannot be made safe under the current single-row lookup by omitting an explicit `croaker` alias: `croaker` is already part of the English display required to preserve the supported common name. The current data model also has no generic croaker choice that can represent the competing species scope.

## Bundled recipe demand

The full current manifest was scanned in manifest order: **114 recipe files, 1,123 ingredient rows, 753,792 bytes**. Every recipe JSON text and every ingredient row was checked using normalized whole-phrase matching for `Atlantic croaker`, `croaker`, *Micropogonias undulatus*, `tambour brésilien`, `tambour du Brésil`, `courbine`, `grondeur atlantique`, `tambour atlantique`, `hardhead`, and `golden croaker`. There were **zero recipe-file hits and zero ingredient-row hits**. The concatenated raw recipe-file snapshot digest was `ea9d7b6bd14aafe822089052c27a73786a93e76c33b4863def3f44eabde92b9f`.

The bundle therefore supports no recipe link, product form, recipe amount, or recipe-context substitution for this identity.

## Product, form, measurement, and substitution evidence

- **Product-label evidence:** Vaughan-based Canadian seafood supplier Seacore currently lists a fresh, wild, whole product called `Croaker`, identifies it as *Argyrosomus argentatus*, and gives origin as the U.S.A. and Trinidad & Tobago. The World Register of Marine Species treats that scientific name as a synonym of *Pennahia argentata*, not *M. undulatus*. This is supplier evidence for a different fish using the bare market word; it is not evidence of Atlantic croaker stock or a Québec consumer package. Other Canadian retail listings use only `Croaker Fish` without identifying a species. No current Québec product page found in this review identifies *M. undulatus* by scientific name or by the qualified bilingual pair. That search result is not proof that the product is unavailable.
- **Québec market wording:** OQLF’s “commercial potential in Québec” note supports a terminological candidate but is not current-inventory evidence. Keep `tambour brésilien` as the qualified French term if reconsidered. Do not shorten to `tambour` or add the unretained French variants.
- **Candidate-specific measurement record:** Health Canada’s Canadian Nutrient File serving page identifies food code 3000 as `Fish, croaker, atlantic, raw / Poisson, tambour brésilien, cru`. It lists 100 g edible portion = 100 g, one fillet = **87.1 g**, one Food Guide serving = **90.0 g**, and **70% total refuse**. The page is dated 2019-03-01. These are documented observations for this named raw CNF food record, not evidence for a generic croaker product, an active catalog measure, or a cooking yield. Since identity remains held, activate none of them. If the identity becomes safely selectable later, preserve the CNF food code and raw-state provenance; do not reinterpret its refuse percentage as cook loss or a generic whole-fish yield.
- **Forms and conversions:** The CNF entry documents raw fish and a fillet portion but does not establish a broader catalog form-conversion chain. The Canadian supplier’s whole presentation is for the separate *Pennahia argentata* product. No species-specific density, volume measure, package-weight convention, count weight, edible-yield conversion, frozen-to-fresh conversion, or cooked-form conversion is supported here.
- **Substitutions:** No reviewed source or bundled recipe supports Atlantic croaker as a global or contextual substitute for *M. furnieri*, black/red/freshwater drum, weakfish, bass, generic white fish, or another finfish. Add no substitution rule and infer no raw-consumption, curing, cooking, storage, or safety equivalence.

## Revisit conditions

Revisit if picker behavior can preserve or explicitly expose multiple species for the bare query `croaker`, or if the product model can retain a source-qualified species label without making unqualified wording resolve to one candidate. A future review should recheck exact ownership and the recipe bundle, and should keep the CNF values tied to food code 3000 and its raw state. Until then, keep the identity, aliases, forms, measurements, recipe links, and substitution behavior inactive.

## Sources

Sources were accessed on 2026-10-13. Proposal-local IDs are evidence references only; they do not create research-ledger records.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-ATLANTIC-CROAKER-BOUNDARY-20261013-S01` | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Lists TSNs 169283 and 169285 with the rows shown above; the overview says the list contains acceptable Canadian fish-label names paired with scientific names and TSNs. Search-result dataset marked modified 2023-09-18. Naming evidence, not culinary equivalence. |
| `WP04-SECTIONP-ATLANTIC-CROAKER-BOUNDARY-20261013-S02` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Says the list collects French/English common names and that only listed names should be used for the corresponding species. Federal labelling guidance. |
| `WP04-SECTIONP-ATLANTIC-CROAKER-BOUNDARY-20261013-S03` | OQLF, GDT, [tambour brésilien](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198967/tambour-bresilien) | Preferred Québec term; English and Latin pairing; contextual/unretained French variants and its dated commercial-potential note. Last updated 2012; not current retail evidence. |
| `WP04-SECTIONP-ATLANTIC-CROAKER-BOUNDARY-20261013-S04` | Government of Canada, TERMIUM Plus, [CROAKER query](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=CROAKER) | Terminology records pair `croaker` with more than one fish identity and explicitly note a cross-use for *M. undulatus*. Federal terminology evidence, not a list of acceptable Canadian product names. |
| `WP04-SECTIONP-ATLANTIC-CROAKER-BOUNDARY-20261013-S05` | Health Canada, [Canadian Nutrient File serving portion, food code 3000](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3000) | Raw Atlantic-croaker record, fillet and Food Guide portion masses, and refuse percentage as listed above. Page modified 2019-03-01; source-specific composition/portion evidence only. |
| `WP04-SECTIONP-ATLANTIC-CROAKER-BOUNDARY-20261013-S06` | Seacore Seafood Products, [Croaker](https://www.seacoreseafood.com/product/Croaker) | Vaughan supplier lists the bare name with *Argyrosomus argentatus*, fresh/whole/wild, and origin. It does not identify *M. undulatus* or give a household measure. |
| `WP04-SECTIONP-ATLANTIC-CROAKER-BOUNDARY-20261013-S07` | World Register of Marine Species, [*Argyrosomus argentatus*](https://www.marinespecies.org/aphia.php?id=304256&p=taxdetails) | Treats the supplier’s scientific name as a synonym of *Pennahia argentata*. Used only to clarify that supplier product’s taxon, not to set a catalog name. |
| `WP04-SECTIONP-ATLANTIC-CROAKER-BOUNDARY-20261013-S08` | Shalom African Foods, [Frozen fish product list](https://shalomafricanfoods.ca/product-category/frozen-foods/fish/) | Current Ontario retailer lists `Croaker Fish` products by package size without a scientific name. Product-name evidence only; does not identify the fish or establish Québec stock. |

No app tests or emulator checks were run: this is a documentation-only proposal and changes no database JSON or application code.
