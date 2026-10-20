# WP02 B2/B3 next gap review — whole navy bean flour

- **Reviewed:** 2026-10-12.
- **Status:** Integrated review; this refresh records root's accepted catalog and ledger integration.
- **Plan fit:** The open WP02 B2 alternative-flour checklist and broader B2/B3 review remain active. This is a separate pulse-flour product from round8's integrated whole pinto bean flour; no earlier focused navy-bean-flour review or hold was found when the proposal was prepared.
- **Scope:** Avena Foods' source-named `Whole Navy Bean Flour` product. Keep its whole navy bean starting material distinct from the existing whole navy bean reference, generic white-bean flour, and process-qualified flour products.
- **Candidate ID:** `ingredient-ref-navy-bean-flour`; now allocated once in active references and once as a ledger record.
- **Source-ID prefix:** `WP02-B2B3-NAVY-BEAN-FLOUR-20261012-ROUND9`; S01–S06 are now recorded on this ingredient's ledger record.

## Recommendation

**Integrated:** identity-only `whole navy bean flour / farine de haricots Navy entiers` is active as `ingredient-ref-navy-bean-flour` in `FLOUR_AND_STARCH`, scoped to the source-named whole-pulse flour product. The English display follows Avena Foods' current `Whole Navy Bean (Haricot Bean) Flour` title. The French display remains provisional: current Québec retail wording uses `Haricots Navy`, while OQLF's preferred French term for the whole bean is `petit haricot blanc`; neither source establishes an official or package-attested French flour compound. Both alias arrays remain empty. [S01–S05]

The product is flour made from whole navy beans, not the whole bean itself. Avena's product line labels it a native pulse flour and uses whole, dehulled, decorticated, and split qualifiers for pulse products. Avena also compares its whole navy-bean flour with a separately named precooked whole navy-bean flour and reports different outcomes in one muffin egg-replacement exercise. S06 is retained on the ledger as a `blocked_pending_evidence` finding limited to that single exercise; it supplies no reusable preparation, measure, or replacement ratio, and no egg-substitution rule is active. Do not infer that the integrated row is universally raw, unheated, or equivalent to every supplier's navy-bean flour. [S01, S06]

The integrated row has no forms, measurements, default density, unit mappings, conversions, package yields, recipe links, or active substitution rules. The current recipe corpus contains no navy-bean ingredient row or flour demand. [S01, S06]

## Identity, naming, and picker boundary

| Phrase or product | Current owner or recommendation | Evidence and limit |
|---|---|---|
| `navy beans` / `haricots Navy` | Keep on `ingredient-ref-navy-beans`, category `LEGUME_AND_PULSE`; retain its current aliases. | The existing reference is the whole edible pulse. OQLF maps `navy bean` and `white pea bean` to `petit haricot blanc` and notes that the broader white-bean category contains several varieties. A legacy record repeats the same whole-bean ID; it is not another active identity. [S02, current catalog] |
| `whole navy bean flour` | Active English display on `ingredient-ref-navy-bean-flour`, category `FLOUR_AND_STARCH`. | Avena's Canadian manufacturer listing uses this source-qualified product name. The same line uses explicit whole, dehulled, decorticated, and split qualifiers for pulse flours; it does not publish navy-specific dehulled/split products or this SKU's detailed milling or thermal-treatment specification. [S01] |
| `farine de haricots Navy entiers` | Active French display on the same row, **provisional**. | The base French product wording `Haricots Navy` appears in current Metro Québec retail listings; `entiers` translates Avena's whole-seed qualifier. No reviewed Québec source publishes this exact flour compound, so do not describe it as an OQLF term or manufacturer label. [S02–S05] |
| `navy bean flour` | No separate alias; the phrase matches inside the active English display. | Retain `whole` in the canonical name so the identity stays tied to Avena's source-qualified product. Do not generalize it to all navy flour products. [S01] |
| `petit haricot blanc`, `navy bean`, `navy beans`, `white pea bean(s)` | Keep on the existing `ingredient-ref-navy-beans` row. Do not copy them to the flour. | These are whole-pulse terms already owned by the navy-bean identity. The current picker will return both whole bean and flour for singular `navy bean`, while plural `navy beans` stays on the whole-bean result. [S02, current catalog and picker] |
| `white beans` / `haricots blancs`; `white bean flour` | Keep `white beans` / `haricots blancs` on `ingredient-ref-white-beans`; leave `white bean flour` unassigned. | OQLF explains that several varieties fall under white-bean wording. The proposed navy-flour names do not use the generic white-bean phrase. [S02, current catalog] |
| `black bean flour / farine de haricots noirs` | Keep on the distinct `ingredient-ref-black-bean-flour` reference. | Different pulse identity; no source here establishes an interchangeable product. [current catalog] |
| `whole pinto bean flour / farine de haricots pinto` | Keep on the integrated `ingredient-ref-pinto-bean-flour` reference. | Round8 was integrated and is a distinct pulse identity; it does not resolve navy-flour naming or behavior. [round8 proposal and live catalog] |
| `precooked whole navy bean flour`; deflavored or other process-qualified navy flours | Leave outside this row pending a separate form-versus-identity review. | Avena names precooked whole navy flour separately and reports a different result in one application. That product-specific comparison does not settle whether the qualifier is a form or a separate identity, or establish equivalence. [S06] |

The production search normalizes accents and punctuation, then returns complete word-phrase matches before falling back to partial matches. A static projection of the integrated displays, with no aliases, is:

| Query | Projected result |
|---|---|
| `whole navy bean flour`; `navy bean flour` | `ingredient-ref-navy-bean-flour` only. |
| `farine de haricots Navy entiers`; `farine de haricots Navy` | `ingredient-ref-navy-bean-flour` only. |
| `navy beans`; `petit haricot blanc` | Existing whole navy beans only. |
| `navy bean`; `haricots Navy` | Both the whole navy-bean row and proposed flour row. |
| `white beans`; `haricots blancs` | Existing generic white-bean row only. |
| `white bean flour` | No result. |
| `black bean flour` | Existing black-bean-flour row only. |

No aliases were added for `petit haricot blanc`, `white pea bean`, `white beans`, `haricots blancs`, `navy bean`, or `navy beans`. The broad whole-bean result remains available; do not use a flour alias to take over a whole-food phrase.

## Process, measurements, and substitutions

- Avena's current page places the product in its native pulse-flour line, lists multiple grind/particle-size options, and distinguishes whole products from dehulled, decorticated, and split products. Pulse Canada says there is no standard definition for pulse flours, describes more than one way to make a whole-pulse flour, and explains that mill configuration affects flour functionality. These are reasons to preserve product scope, not a generic milling specification. [S01, S05]
- Avena's comparison of whole and precooked whole navy-bean flour reports different egg-replacement results in one basic muffin exercise but gives no reusable quantity, mass/volume relationship, or general substitution rule. Do not turn the application into an egg or wheat-flour substitution. [S06]
- The existing whole navy-bean reference and integrated flour reference both have `defaultDensity: null` and `unitMappings: []`; neither has an attached form. No navy-bean-flour measurement, mapping, or recipe link is recorded. The only package-yield row is for canned S&W black beans; the global and contextual substitution files are empty. The ledger retains S06 as a blocked finding, with `substitutionResearchState: blocked_pending_evidence`; it does not create an active rule.
- Keep the integrated flour separate from cooked, canned, or soaked navy beans and from black-bean, pinto-bean, and generic white-bean flours. Add no volume conversion, density, yield, recipe link, or substitution rule based on the reviewed sources.

## Current catalog, ledger, ownership, and recipe audit

Read-only snapshot from the shared worktree on 2026-10-12. Digests cover exact file bytes unless described as the manifest-order recipe fingerprint.

| Surface | Live count / SHA-256 or fingerprint |
|---|---|
| Active ingredient references | 1,322; `6dbbf6e07afe5c4bffde815065d5eaf377e3b5446c068bab0d8965b5df711545` |
| Ingredient forms | 98; `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64; `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,630 records / 5,992 source entries / 5,009 distinct source IDs; `c78b083f60d80d623805af87f2b4283811a55495ed4d5c11433a01742e174b13` |
| Recipe manifest | 114 recipe paths; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows / 753,792 file bytes; fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Package yields / global substitutions / contextual substitutions | 1 unrelated yield / 0 rules / 0 rules; file SHA-256 values `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b`, `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570`, and `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` respectively. |

Post-integration normalized exact-owner checks covered active reference names and aliases, form labels and match terms, all legacy candidate names and aliases, and ledger record IDs. The active exact displays `whole navy bean flour` and `farine de haricots Navy entiers` belong to `ingredient-ref-navy-bean-flour`; its ID appears once in active references and once as a ledger record. `navy bean flour` and `farine de haricots Navy` are not stored aliases but match inside the canonical displays. Each S01–S06 has one source entry on this ledger record and no source entry on another ledger record. The prefix is allocated only to this record. The existing navy whole-bean row remains the owner for `navy beans`, `navy bean`, `white pea bean`, `white pea beans`, `haricots Navy`, and `petit haricot blanc`; a legacy candidate repeats that same whole-bean ID. The generic white-bean row owns `white beans`, `white bean`, and `haricots blancs`.

All **114 manifest-listed recipe files and 1,123 ingredient rows** were rescanned after integration for the flour terms, the French display, related navy-bean wording, and exact reference links. The scan found zero matching recipe files, zero matching ingredient rows, and zero rows linked to either `ingredient-ref-navy-beans` or `ingredient-ref-navy-bean-flour`. Therefore there is no recipe demand to use as evidence for flour measurements or substitutions. The recipe corpus is unchanged.

## Source register

Sources were checked on 2026-10-12. S01–S06 are now recorded once each as source entries on the integrated `ingredient-ref-navy-bean-flour` ledger record.

| ID | Source | Supports | Limit |
|---|---|---|---|
| **WP02-B2B3-NAVY-BEAN-FLOUR-20261012-ROUND9-S01** | Avena Foods, [Pulse Flour Ingredients for Product Development](https://www.avenafoods.com/products/pulses-and-pulse-ingredients/flours/), current Canadian manufacturer page. | Lists `Whole Navy Bean (Haricot Bean) Flour` in its native pulse-flour line, alongside other whole, dehulled, decorticated, and split products; notes grind and particle-size options. | B2B product-family page, not a consumer package or a detailed navy-flour milling/thermal-treatment specification. |
| **WP02-B2B3-NAVY-BEAN-FLOUR-20261012-ROUND9-S02** | Office québécois de la langue française, [*petit haricot blanc* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083589/petit-haricot-blanc), updated 1991. | Preferred French whole-bean term; English equivalents `navy bean` and `white pea bean`; identifies *Phaseolus vulgaris* and notes that the broader white-bean category contains several varieties. | Whole-bean terminology and identity only; not a flour compound or processing standard. |
| **WP02-B2B3-NAVY-BEAN-FLOUR-20261012-ROUND9-S03** | Agriculture and Agri-Food Canada, [2026 AgriStability / AgriInvest harmonized guide (French)](https://agriculture.canada.ca/fr/programmes/agri-stabilite/ressources/programmes-dagri-stabilite-dagri-investissement-2026-guide-harmonise-societes-cooperatives). | Uses the Canadian French crop-class wording `Haricot, petit rond blanc (navy)` and separately lists Great Northern, black, and pinto beans. | Agricultural crop classification, not a flour name or culinary product specification. |
| **WP02-B2B3-NAVY-BEAN-FLOUR-20261012-ROUND9-S04** | Metro Québec, [Cedar Phoenicia Haricots Navy](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/feves-sechees/haricots-navy/p/062356507404), current French retail listing. | Attests current Québec retail wording `Haricots Navy` for the whole pulse. | Retail wording for whole beans only; not a flour label. Package size and price are not recipe measurements. |
| **WP02-B2B3-NAVY-BEAN-FLOUR-20261012-ROUND9-S05** | Pulse Canada, [Pulse Flours](https://pulsecanada.com/processing/pulse-flour), industry processing resource. | Describes whole versus dehulled pulse flour, more than one whole-flour production method, lack of a standard definition for pulse flour, and effects of milling setup on functionality. | General pulse-flour processing information, not a navy-specific commercial specification, density, kitchen conversion, or substitution ratio. |
| **WP02-B2B3-NAVY-BEAN-FLOUR-20261012-ROUND9-S06** | Avena Foods, [Exploring Innovative Applications for Oats and Pulse Ingredients](https://www.avenafoods.com/exploring-innovative-applications-for-oats-and-pulse-ingredients/), current manufacturer application article. | Names `Best Whole Navy Bean Flour` and `Best Precooked Whole Navy Bean Flour` separately and reports different outcomes when each was used in one basic muffin egg-replacement exercise. | Retained in the ledger as a `blocked_pending_evidence` finding scoped to this single application; no reusable replacement quantity, mass/volume measure, flour specification, or general substitution rule is active. |

## Static checks performed

Refreshed the live reference, form, legacy, ledger, manifest, and recipe-corpus counts and digests after integration. Verified the candidate ID is allocated once in references and once as a ledger record; S01–S06 each have one source entry on that record; and the S06 muffin comparison remains `blocked_pending_evidence` with no active substitution rule. Rechecked exact phrase ownership, the integrated picker projection, and all 114 manifest recipes / 1,123 ingredient rows. This proposal-only refresh changed no shared data. No app, unit, instrumentation, or emulator tests were run under the repository's JSON-data exemption. The saved file was checked as UTF-8 without BOM, with a final newline and no trailing whitespace; the edit is limited to this proposal.
