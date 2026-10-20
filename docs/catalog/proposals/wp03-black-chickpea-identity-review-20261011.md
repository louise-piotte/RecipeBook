# WP03 Section H proposal: black chickpea identity and Desi boundary

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** Proposal-only identity review. No shared catalog, ledger, recipe, plan, roadmap, or test file is changed.
- **Recommendation:** Accept one narrow searchable identity for the retail product sold as black chickpeas / Kala Chana. Hold broad Desi/Kabuli type modeling for a separate decision; do not treat all Desi chickpeas as black chickpeas.
- **Scope:** Identity, English/French product wording, exact aliases and search collisions, recipe demand, and available forms, measurements, conversions, yields, and substitutions. No numeric or recipe change is proposed.
- **Current shared working-tree snapshot:** 895 ingredient references, 48 forms, 1,145 research-ledger records (2,895 source entries; 2,300 distinct source IDs), 114 bundled recipe files, and 1,123 ingredient lines. This snapshot includes unrelated in-progress WP02 flour changes.
- **Snapshot hashes:** references `bdbc64b60d828ee44fd3515ca4c37929e58c44fef4e0e8afd2231d17233be608`; forms `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `1add103daec0a0467dd4c5dcd74cd190a7d473c7289018af5b7c637c1c0293b4`.

## Disposition

Add one identity-only row for the source-attested, whole-seed market product. The row is a precise search target for black chickpeas / Kala Chana; it does not claim that every Desi chickpea is black or create a parent-child relationship to generic chickpeas.

| Proposed ID | English display | fr-CA display | English aliases | French aliases | Category and numeric fields |
|---|---|---|---|---|---|
| `ingredient-ref-black-chickpeas` | `black chickpeas` | `pois chiches noirs` | `black chickpea`; `kala chana` | `pois chiche noir`; `kala chana` | `LEGUME_AND_PULSE`; `defaultDensity: null`; `unitMappings: []` |

The Quebec-delivery retailer Singal’s uses the title **“Kala Chana : le pois chiche noir”** and identifies Kala Chana with the Desi product. Current French-language grocery listings also use **“Kala Chana Pois chiches noirs”** and list Kabuli chickpeas and Desi chickpeas separately. These are product-name attestations, not an OQLF ruling that `pois chiches noirs` is the preferred technical term. Keep the retail phrase as the display because it is documented in the Québec market; do not invent `pois chiches bruns` or translate the Indian name.

CFIA classifies chickpeas (*Cicer arietinum*) into Desi and Kabuli types. It describes Desi seed coats as pigmented from tan to black, thick, and on small seeds; Kabuli seed coats are thin, white to cream. OQLF similarly distinguishes smaller brown Desi from larger beige Kabuli. Statistics Canada separately classifies Desi and Kabuli chickpeas and gives split Desi chickpeas as an example under the Desi class. This supports a meaningful Desi/Kabuli distinction, but also shows why `Desi chickpeas` is broader than the black-marketed product. Hold `ingredient-ref-desi-chickpeas` and `ingredient-ref-kabuli-chickpeas` as type-model candidates; do not add `desi chickpeas` / `pois chiches desi` as aliases to the proposed black row. The existing form model represents preparation state and has no variety/type field, so `black` or `desi` should not be added as a form.

## Catalog, ledger, and collision audit

No `ingredient-ref-black-chickpeas`, `ingredient-ref-desi-chickpeas`, or `ingredient-ref-kabuli-chickpeas` row is active. No black-chickpea or Kala-Chana proposal or dedicated research-ledger record was found; the open Section H checklist and `plant-legumes-pulses.md` are the existing review context.

The active generic row is `ingredient-ref-chickpeas`, `chickpeas / pois chiches`, with English aliases `garbanzo beans`, `canned chickpeas`, and `dried chickpeas`, and French aliases `pois chiches en conserve` and `pois chiches secs`. It has no density or unit mappings. Keep it generic; this review does not relabel it as Kabuli or as a parent type. The existing forms are `ingredient-form-chickpeas-dried` and `ingredient-form-chickpeas-canned-drained`; both have `densityGPerMl: null`. The canned form’s French label and match terms include rinsing while its English label says drained; the Section H packet already flags that wording boundary. Neither form distinguishes chickpea type, and there is no generic cooked-chickpea form. The unresolved legacy candidate `ingredient-ref-dried-chickpeas` is unreviewed and is not evidence for a black/Desi identity.

The active adjacent identities remain separate: `ingredient-ref-black-beans` is `black beans / haricots noirs`; `ingredient-ref-chana-sattu` is `chana sattu / farine de sattu` with qualified roasted-flour aliases; and `ingredient-ref-chickpea-flour` is `chickpea flour / farine de pois chiche`. Do not reassign their names or aliases.

The live ingredient search prefers complete normalized phrases, then falls back to partial matching. Results below are from the active 895-reference/48-form snapshot:

| Query or term | Current result | Recommendation for this row |
|---|---|---|
| `black chickpeas`, `black chickpea`, `kala chana`, `pois chiches noirs`, `pois chiche noir`, `desi chickpeas` | No active result. | Add the first five only as shown in the proposed row. Leave Desi wording unassigned to this black-specific identity. |
| `chickpeas` | Generic chickpeas. | After integration, the broad plural will also match the new display; that is expected for a subtype search, not an exact-alias collision. |
| `pois chiches` | Generic chickpeas, chickpea flour, and chana sattu. | The proposed name will add the black product to this already broad search. Keep the exact `pois chiches noirs` phrase so users can select it directly. |
| `chana` | Chana sattu. | Do not add bare `chana`; `kala chana` is the qualified product phrase. A broad `chana` query will then show both the flour and whole pulse. |
| `bengal gram` | Chana sattu, through `roasted Bengal gram flour`. | Do not add `Bengal gram` or `Bengal gram whole`: the broader query would match both products, and the flour identity deliberately keeps gram wording qualified. |
| `garbanzo beans`, `dried chickpeas`, `pois chiches secs` | Generic chickpeas. | Keep generic aliases and forms there; do not duplicate them on the black row. |
| `black beans` | Black beans. | Keep separate. Do not alias black chickpeas to black beans, `haricots noirs`, or the ambiguous singular `haricot noir`. |
| `urd` | Roasted urid flour by partial search. | Do not add `urd`, `urad`, or `black gram`. OQLF maps urd/black gram to *Vigna mungo*, not chickpea. |

The proposed singular French alias is needed because the current search normalizer does not stem plural endings: `pois chiche noir` does not match a plural-only `pois chiches noirs` term. The shared native product phrase `kala chana` is attested in the retailer’s French and English text. No aliases are proposed for `chana dal`, `besan`, `gram flour`, or chickpea flour: the cited retailer describes Chana Dal as a split/dehulled product and Besan as a flour, while the active catalog keeps whole pulses and flours distinct. Also omit unqualified `haricot noir`: OQLF’s dedicated black-bean entry identifies *Phaseolus vulgaris*, while its *Vigna mungo* entry says that species is sometimes called `haricot noir`; the bare French term is ambiguous across these different seeds.

## Bundled recipe demand

All 114 manifest-listed recipe files and all 1,123 ingredient lines were scanned for chickpea, garbanzo, Kala Chana, Desi, black chickpea, Bengal gram, black gram/urd, and Chana Dal terms. There are **zero matching ingredient lines** and **zero ingredient links** to generic chickpeas, chickpea flour, chana sattu, or black beans. No bundled recipe mentions black chickpeas, Kala Chana, or Desi chickpeas.

Two recipes contain generic chickpea language only in bilingual notes:

- Recipe 090, *African Peanut Stew*, says the meat may be replaced with beans or chickpeas for a vegetarian variation; it gives no chickpea amount.
- Recipe 105, *Habitant Pea Soup*, records a raw-export variation of 2 cups dried whole chickpeas in place of yellow peas, with cook time to be adjusted. The bundled ingredient line itself remains dried yellow peas; this note does not identify black or Desi chickpeas and is not a linked ingredient line.

This corpus supplies no black/Desi recipe demand, recipe link, or quantity basis. The identity recommendation is for exact product-name recognition, not a recipe relink.

## Forms, measurements, conversions, yields, and substitutions

| Area | Evidence found | Disposition |
|---|---|---|
| Forms | Only generic chickpea dried and canned/drained forms are active; their densities are null. No cooked form is active. | Add no form to the black identity. The documented whole retail product is an identity boundary; dry, soaked, split, dehulled, cooked, and canned are preparation/product states to review only when a recipe needs them. Do not copy generic chickpea forms onto the new identity. |
| Density and unit mappings | No black/Desi chickpea measurement, density, or unit mapping exists in the active catalog or ledger. The generic chickpea row also has `defaultDensity: null` and `unitMappings: []`. | Leave null/empty. Retail package sizes do not establish cup-to-mass or drained-weight conversions. |
| Cooking yield | `baking-substitutions.md` records a general NYC Health Department range of 1 cup dried chickpeas to 2½–3 cups cooked. It is retained in that packet as a range, not a ledger/runtime rule; it is not Desi-specific, and no cooked chickpea form is active. | Do not transfer or average the range for black/Desi chickpeas. Singal’s recipe starts with ½ cup Kala Chana but reports no cooked volume or mass; its preparation directions are not a yield observation. |
| Package yield | The only active package-yield row is an S&W canned black-bean net/drained-weight record. There is no chickpea package yield. | Do not transfer black-bean package data or treat retail pack size as edible/drained yield. |
| Conversions and substitutions | Both active substitution-rule arrays are empty. The ledger retains two old canned-to-dried chickpea rule records as `blocked_pending_evidence`; no black-chickpea rule exists. | Activate no mass, package, cooking, or ingredient substitution. Keep the old generic records blocked; they do not establish a black-chickpea conversion. |

No other conversion ratio or substitution direction is proposed. The product sources’ recipe suggestions and preparation instructions do not establish universal equivalence with Kabuli chickpeas, black beans, split Chana Dal, or any other pulse.

## Source register

Sources were accessed 2026-10-11 unless noted. New source IDs are local to this proposal and have not been added to the shared ledger.

| Source ID | Source and locator | Claim used and source limit |
|---|---|---|
| `WP03-BLACK-CHICKPEA-20261011-S01` | CFIA, [Pulse seed crop inspection procedures](https://inspection.canada.ca/en/plant-health/seeds/seed-inspection-procedures/pulse-crops), Appendix III, updated 2026-04-01. | Identifies chickpea as *Cicer arietinum* and distinguishes Desi (small seed, thick pigmented tan-to-black coat) from Kabuli (thin white-to-cream coat). This is seed-crop inspection guidance, not a retail-food standard, cooking guide, or consumer name authority. |
| `WP03-BLACK-CHICKPEA-20261011-S02` | OQLF, [pois chiche, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296897/pois-chiche), updated 2026. | Supports the French base term `pois chiche`, edible-seed sense, *Cicer arietinum*, and the smaller/brown Desi versus larger/beige Kabuli distinction. It does not certify `pois chiches noirs` as a preferred term. |
| `WP03-BLACK-CHICKPEA-20261011-S03` | Statistics Canada, [NAPCS Canada 2022 Version 1.0](https://www150.statcan.gc.ca/n1/pub/12-003-x/12-003-x2022001-eng.pdf), printed p. 157, codes 1143111–1143113. | Separates Desi, Kabuli, and other chickpeas; lists split Desi chickpeas as an illustrative Desi example. This is a product classification, not a culinary recipe, consumer label, or measurement source. |
| `WP03-BLACK-CHICKPEA-20261011-S04` | Singal’s Indian Grocery, [“Kala Chana : le pois chiche noir / Kala Chana: the black chickpea”](https://www.singals.ca/blogs/recipe/pois-chiche-noir-black-chickpea-kala-chana), dated 2017-09-30; French product wording and delivery statement. | The Québec-delivery retailer’s French title uses `le pois chiche noir`; its bilingual copy calls the product Kala Chana / Desi and English “Black Chickpea.” The page is old retailer-authored content, not a terminology or botanical authority. Use only its product-language and market-reach evidence; exclude its nutrition claims, cooking times, and recipe amount from conversions or yield. |
| `WP03-BLACK-CHICKPEA-20261011-S05` | Voilà, [French dry-peas product category](https://voila.ca/categories/essentiels-du-garde-manger/riz-grains-et-l%C3%A9gumineuses/pois-secs/WEB3294592?sortBy=favorite), current listing accessed 2026-10-11. | Lists “Aman's Kala Chana Pois chiches noirs,” as well as separate Kabuli and Desi product names. Supports current French-language retail usage and product distinction only; page availability is changeable, and Québec postal-code availability was not verified. |
| `WP03-BLACK-CHICKPEA-20261011-S06` | OQLF, [haricot mungo, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo). | Maps *Vigna mungo* to urd/urd bean/black gram and says that species is sometimes called `haricot noir`. Supports excluding those English terms and the ambiguous French term from chickpeas. |
| `WP03-BLACK-CHICKPEA-20261011-S07` | OQLF, [haricot noir, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8350002/haricot-noir). | Its dedicated `haricot noir` entry maps to black bean / *Phaseolus vulgaris*. Read alongside S06, this supports keeping the unqualified French phrase out of aliases. |
| `WP03-BLACK-CHICKPEA-20261011-S08` | NYC Health Department, [Culinary Demo Tips](https://www.nyc.gov/assets/doh/downloads/pdf/cdp/farmers-markets-education-culinary-demo-tips.pdf), printed p. 17, as transcribed in `docs/catalog/batches/baking-substitutions.md` § cooking yields. | Generic dried-chickpea cooking yield is reported as a 2½–3 cup cooked range per cup dry. It is not specific to black/Desi chickpeas and remains outside the active ledger/runtime because it is a range and no cooked form exists. |

## Integration boundary

1. If accepted, add only the proposed black-chickpea reference row and the qualified aliases shown above. Do not change `ingredient-ref-chickpeas`, its aliases/forms, `ingredient-ref-black-beans`, chana sattu, or chickpea flour in this proposal.
2. Do not use `desi chickpeas`, `pois chiches desi`, `garbanzo beans`, `Bengal gram`, `black gram`, `urd`/`urad`, `black beans`, `haricot noir`, `chana dal`, or `besan` as aliases for this identity.
3. Keep broad Desi/Kabuli crop-type modeling open. The sources establish a real type distinction but do not justify equating the whole Desi class with the black product, and the current form model has no type field.
4. Add no form, measurement, density, unit mapping, conversion, cooking or package yield, substitution, or recipe link.
5. Record this as a proposal only. No tests were run.
