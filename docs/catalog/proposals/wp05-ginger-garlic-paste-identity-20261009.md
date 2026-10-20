# WP05 focused identity review — ginger-garlic paste

## Packet scope and disposition

- **Prepared:** 2026-10-09. All web sources below were accessed on 2026-10-09.
- **Scope:** Focused follow-up to the ginger-garlic paste row in `wp05-south-central-asia-mena.md`. This proposal does not accept the broader Section Y packet or claim Section Y completion.
- **Disposition:** Propose one new compound identity, `ginger-garlic paste / pâte de gingembre et d’ail`, in `SAUCE_AND_CONDIMENT`. Keep it separate from ginger, ground ginger, garlic, and single-ingredient ginger or garlic pastes. Assign no ID until coordinator review.
- **Status:** integrated on 2026-10-09 after coordinator review; measurements and substitutions remain inactive.

## Proposed identity, names, aliases, and boundary

| Field | Proposal | Evidence and limit |
|---|---|---|
| EN display | `ginger-garlic paste` | Manufacturer and retailer names include “Ginger & Garlic Paste,” “Ginger Garlic Paste,” and “Ginger and Garlic Paste” [WP05-GGP-S01, S03, S04]. This is a descriptive product-family name, not a claim of a single recipe. |
| fr-CA display | `pâte de gingembre et d’ail` | O’Mari’s Québec retail product and a Québec recipe use this wording [WP05-GGP-S06, S07]. Treat it as product-supported French, not as an official terminology ruling. |
| EN aliases | `ginger and garlic paste`; `garlic ginger paste` | Metro lists the first wording [WP05-GGP-S04]. Dabur’s product title uses the second word order, while its description also says “Ginger Garlic Paste” [WP05-GGP-S08]. `ginger & garlic paste` normalizes to the same key as `ginger and garlic paste`; do not store it as a separate alias. |
| fr-CA alias | `pâte d’ail et gingembre` | Metro’s French listing for the same Divya SKU uses this name [WP05-GGP-S05]. The apostrophe and accents are search-normalized; no extra unaccented alias is needed. |
| Category | `SAUCE_AND_CONDIMENT` | A prepared compound cooking paste is listed under TRS’s “Condiments & Sauces” category [WP05-GGP-S09]. The raw ingredients remain in their existing categories. |

The identity describes a ready-to-use paste in which ginger and garlic are combined. Product formulations differ: TRS lists garlic, ginger, salt, oil, acids, preservatives, and xanthan gum; the Divya listing names ginger, garlic, salt, sunflower oil, citric acid, and xanthan gum [WP05-GGP-S01, S04]. Alpha Arogya describes ginger and garlic ground together, with a stated garlic-to-ginger ratio for its own product; Dabur describes its product as ginger and garlic pastes combined [WP05-GGP-S03, S08]. These sources support a compound product family, not a universal formula or fixed ratio.

Keep `ginger paste` and `garlic paste` outside the identity. TRS sells ginger paste separately, and Alpha Arogya distinguishes its standalone garlic paste from its combined paste [WP05-GGP-S02, S03]. Do not alias either single-ingredient paste, raw ginger, ground ginger, garlic, garlic cloves, or a recipe that lists ginger and garlic on separate lines. A broader curry paste or another named sauce is also outside this identity even if it contains both ingredients.

## Measurement and substitution assessment

| Evidence area | Status | Reason |
|---|---|---|
| Density and mass-volume conversions | **Unknown; leave unset.** | Product pack sizes (including 150 g and 500 g) are package masses, not spoon-to-mass measurements. TRS nutrition values and serving information do not give a volume conversion. The Québec butter-chicken recipe uses `1 c. à table` without a mass [WP05-GGP-S01, S04, S06, S07]. No density or unit mapping is supported. |
| Recipe measurement | **Source-specific observation only.** | Lufa’s Québec butter-chicken recipe calls for `1 c. à table` of O’Mari paste [WP05-GGP-S07]. This supports recipe use, not a general serving size, density, or conversion. |
| Component ratio | **Product-specific; no general value.** | Alpha Arogya states garlic 2:1 ginger for its own paste [WP05-GGP-S03]. Other cited product ingredient lists do not declare a ratio, and their ingredient order cannot establish one. Do not infer a default or use the Alpha ratio as a catalog property. |
| Substitution | **Unknown; no active rule.** | Dabur says 2 tbsp of its paste corresponds to a 1.25 cm ginger piece and 4–6 garlic cloves [WP05-GGP-S08]. This is a brand-specific use suggestion; it does not define ginger-piece weight, clove size, the paste’s component ratio, or a mass basis. It cannot support a global or contextual substitution rule. |

Keep all density, unit-mapping, conversion, and substitution values empty. Preserve the Dabur statement only as a clearly product-specific evidence note if the ledger needs to record it; do not generalize it to other brands or convert it into an active rule.

## Live catalog, collision, and recipe audit

The live package at review time contains **414 ingredient references, 16 forms, 99 legacy candidates, 579 ledger records, and 114 recipe files** (manifest count). The existing exact records are ginger (`ingredient-ref-ginger`), ground ginger (`ingredient-ref-ground-ginger`), garlic (`ingredient-ref-garlic`), garlic powder, and garlic salt. Ginger and garlic remain separately classified; there is no ginger-garlic paste reference, form, or legacy candidate.

I applied the search-key rules in `IngredientSearch.kt` (lowercase, NFKD, accent-mark removal, `&` to “and,” punctuation to spaces, and repeated-space collapse) to the canonical names and aliases, form labels and match terms, and legacy candidate names and aliases. No exact normalized match was found for `ginger-garlic paste`, `ginger and garlic paste`, `garlic ginger paste`, `pâte de gingembre et d’ail`, `pâte d’ail et gingembre`, `ginger paste`, or `garlic paste`. `ginger & garlic paste` shares the normalized key `ginger and garlic paste`. No corresponding compound candidate appears in the current ledger.

All **114 manifest-listed recipe JSON files** were scanned as serialized text for the compound spellings and the single-paste boundary terms; none mention those products. Two recipes list garlic and ground ginger as distinct ingredient lines:

- `086-poulet-au-beurre-butter-chicken-…`: 2 garlic cloves and 1/2 tsp ground ginger.
- `090-ragout-aux-arachides-africain-african-peanut-stew-…`: 3 cloves garlic and 1 tsp ground ginger.

These lines do not refer to the compound paste. Do not combine or relink them as part of this proposal.

## Source-to-claim map

All accessed 2026-10-09. Manufacturer pages support their own product names and formulations; retailer pages support the listed product label and recipe usage only.

| ID | Source | Claims used |
|---|---|---|
| **WP05-GGP-S01** | TRS, [Ginger & Garlic Paste](https://www.trsfood.com/product/trs-ginger-garlic-paste/) | Manufacturer’s combined-product name, culinary use, package options, and ingredient list. The listed formula includes salt, oil, acids, preservatives, and xanthan gum; no ginger/garlic ratio or volume conversion is provided. |
| **WP05-GGP-S02** | TRS, [Ginger Paste](https://www.trsfood.com/product/trs-ginger-paste/) | Same manufacturer’s separately named single-ginger paste and ingredient list; supports keeping single ginger paste outside the compound identity. |
| **WP05-GGP-S03** | Alpha Arogya, [Cooking Pastes](https://www.alphaarogya.com/products/cooking-pastes/) | Combined “Ginger Garlic Paste,” ginger and garlic ground together, product-specific 2:1 garlic-to-ginger statement, and distinct “Garlic Paste” product. The ratio applies only to this producer’s stated product. |
| **WP05-GGP-S04** | Metro, [Divya Ginger and Garlic Paste](https://www.metro.ca/en/online-grocery/aisles/pantry/condiments-toppings/international-condiments/ginger-and-garlic-paste/p/062781067696) | Canadian retail English product name, 500 g package, SKU 062781067696, and listed ingredients. |
| **WP05-GGP-S05** | Metro API, [Divya Pâte d’ail et gingembre](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/condiments-internationaux/pate-d-ail-et-gingembre/p/062781067696) | Québec French retail name for the same 500 g SKU and its listed ingredients; supports a French alias, not a linguistic-standard claim. |
| **WP05-GGP-S06** | Marché des Fermes Lufa, [O’Mari producer listing](https://montreal.lufa.com/fr/marche/partenaire/omari-143) | Québec local retail product name `Pâte de gingembre et d’ail`, O’Mari product attribution, and 150 g pack listing. No component formula is stated. |
| **WP05-GGP-S07** | Marché des Fermes Lufa, [Poulet au beurre tout-en-un](https://montreal.lufa.com/fr/marche/recette/poulet-au-beurre-tout-en-un-533) | Québec recipe ingredient wording and a `1 c. à table` use of the paste in a chicken marinade. The recipe does not provide paste mass. |
| **WP05-GGP-S08** | Dabur, [Hommade Garlic Ginger Paste](https://www.dabur.com/our-brand/dabur-hommade-garlic-ginger-paste) | Product-title word-order variant; manufacturer statement that 2 tbsp of its paste corresponds to a specified ginger-piece length and 4–6 garlic cloves, plus examples of dishes. This is not a general substitution or conversion. |
| **WP05-GGP-S09** | TRS, [Condiments & Sauces](https://www.trsfood.com/product-category/condiments-sauces/) | TRS category listing includes both its combined ginger-and-garlic paste and standalone ginger paste; supports the proposed category. |

## Recommended acceptance checks

1. Recheck current references, forms, legacy candidates, and ledger at integration time; confirm this candidate is still absent and repeat normalized collision checks for all proposed aliases.
2. If accepted, add one compound identity in `SAUCE_AND_CONDIMENT`; keep ginger, ground ginger, garlic, and single-ingredient pastes distinct. Do not claim a universal recipe or ingredient ratio.
3. Add only the source-supported English and French names above. Do not store punctuation or accent variants already covered by search normalization as duplicate aliases.
4. Leave density, conversions, forms, and substitutions unset. Keep the 2:1 ratio and Dabur spoon equivalence explicitly source/product-specific in evidence notes only.
5. Re-scan the current complete recipe manifest and leave separate ginger and garlic ingredient lines unchanged; no recipe relinking is proposed.

## Coordinator integration result

Added one `ginger-garlic paste / pâte de gingembre et d’ail` compound identity with the reviewed
narrow aliases. Product-specific component ratios and recipe spoon amounts remain evidence only.
No density, mapping, form, substitution rule, or recipe relink was added. Broader Section Y
coverage remains open.

Canonical post-merge snapshot: 446 ingredient references, 16 forms, and 612 research-ledger records.
