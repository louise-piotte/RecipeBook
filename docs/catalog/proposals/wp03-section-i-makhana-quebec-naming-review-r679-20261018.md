# WP03 Section I — Makhana Québec French query-term review (R679)

- **Reviewed:** 2026-10-18
- **Status:** Integrated 2026-10-18; see the [integration README](../batches/wp03-section-i-makhana-noix-de-renard-match-term-integration-r679-20261018/README.md). The ownership, picker, and corpus snapshots below are pre-integration.
- **Checklist fit:** the completed makhana identity/form item explicitly leaves the Québec wording review open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Scope:** one French search term for the existing roasted-popped *Euryale ferox* product. The archive has no later makhana Québec-wording follow-up; the earlier [identity review](wp03-makhana-fox-nut-identity-20261009.md) and [lotus-seed boundary review](wp03-lotus-seed-fox-nut-boundary-review-20261010.md) remain in force.

## Recommendation

Add **`noix de renard`** as a form-level `matchTermsFr` entry on `ingredient-form-makhana-roasted-popped`. Keep the active display `graines de makhana grillées et soufflées` and keep the term off the parent reference’s aliases. A Canadian French WK Kellogg recipe explicitly pairs **noix de renard** with **Makhana**; this supports a narrow retrieval term, not an OQLF-preferred display or general botanical name. The exact form match lets the picker recognize the market phrase while preserving the species-qualified name.

Do not add **graines de lotus**, **graines de lotus soufflées**, or related bare lotus wording to this form or reference. Metro’s current French listing places a Mr Makhana snack under a “graine de lotus” title, but that is retailer wording and conflicts with the separate sacred-lotus (*Nelumbo nucifera*) owner. Keep the existing species boundary. The EU’s official French designation, **graines grillées et soufflées d’*Euryale ferox* (makhana)**, supports the current descriptive display; it does not establish Québec preference.

### Integrated data delta

```text
ingredient-form-makhana-roasted-popped.matchTermsFr += ["noix de renard"]
```

The existing form-level ledger record now includes the two new product/name sources below, reuses the already-owned OQLF Vitrine FAQ source ID, and records one accepted decision that limits `noix de renard` to a French search term for the roasted-popped form. The prior unresolved display-name decision is narrowed to reject the phrase as a preferred display while allowing the exact form-level match. The existing research states remain `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: researched_no_supported_substitute`. This naming review supplies no new measurement or replacement evidence; it adds no observations or substitution findings.

## Evidence and source ownership

| Source ID | Source and evidence | Limit / ownership |
| --- | --- | --- |
| `WP03-I-MAKHANA-QUEBEC-R679-20261018-S01` | WK Kellogg Co Canada, [Mélange collation épicé au tandoori masala](https://www.wkkellogg.ca/fr/recettes/melange-collation-epice-au-tandoori-masala), current indexed French ingredient excerpt: `1 tasse de noix de renard (Makhana)`. | One Canadian French recipe supports observed usage. The direct page response was script-limited during review; the indexed excerpt does not identify species or establish a preferred Québec term, and its recipe quantity is not a mass/volume conversion. The URL and source ID have no exact owner in the current ledger. |
| `WP03-I-MAKHANA-QUEBEC-R679-20261018-S02` | Metro, [Graine de lotus soufflé au péri péri Mr Makhana](https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-salees/noix-graines-et-viandes-sechees/graine-de-lotus-souffle-au-peri-peri/p/8908006646746), French listing for a 75 g branded product. | Documents conflicting retail wording only. The listing showed the item out of stock at its selected Metro Devonshire store; no Québec-specific inventory claim is made. The exact URL and ID have no ledger owner. |
| Reuse `WP06-GUARANA-20261009-S12` | OQLF, [Vitrine linguistique FAQ](https://vitrinelinguistique.oqlf.gouv.qc.ca/a-propos-de-la-vitrine-linguistique/foire-aux-questions). Targeted OQLF/Vitrine web-index searches for `makhana`, `Euryale ferox`, `fox nut`, and `noix de renard` did not surface a relevant fiche. | The exact FAQ URL is already ledger-owned by the guarana reference. Reuse that source ID; do not register a duplicate. A no-result search is not proof that no term exists. |
| Reuse `WP03-I-MAKHANA-20261009-S06` | European Commission, [Implementing Regulation (EU) 2023/652, French text](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A32023R0652), describing roasted-popped *Euryale ferox* as `graines grillées et soufflées ... (makhana)`. | Already owned on the makhana reference/form. Official EU terminology, not Québec naming authority. |
| Reuse `WP03-I-MAKHANA-20261009-S08` | Metro Québec, [Graines de lotus soufflées à saveur de lime et piment, Mr Makhana](https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-salees/noix-graines-et-viandes-sechees/graines-de-lotus-souffle-a-saveur-de-lime-et-piment/p/8908006646739). | Already owned on the makhana reference/form; retain only as evidence of the retailer naming conflict, not as a species synonym. |

The pre-integration archive and ledger had no R679 source prefix or owners for the exact S01/S02 URLs. Integration allocated those two IDs, while reusing the already-owned OQLF, EU, and earlier Metro sources listed above.

## Active owner, picker, and recipe demand

The pre-integration live package snapshot has **1,837 ingredient references**, **169 forms**, **56 legacy candidates**, and **2,215 research-ledger records**. The active owner is `ingredient-ref-makhana-seeds` (`graines de makhana (Euryale ferox)` / `makhana seeds (Euryale ferox)`) with the existing `ingredient-form-makhana-roasted-popped`. Before integration, the form had `graines de makhana soufflées` as its French match term and no `noix de renard` term. No other active reference, form, or legacy candidate owned the exact normalized phrase; the ledger contained it only as earlier reviewed evidence/decision text. No new identity or form was added.

Pre-integration static projection through the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) behavior:

| Query | Pre-integration | After R679 |
| --- | --- | --- |
| `noix de renard` | 0 results | 1 result: Makhana, with the roasted-popped form hint |
| `renard` | 0 results | 1 Makhana result; no exact form hint for this partial query |
| `noix` | 32 results | 33 results; still a broad multi-result query |
| `lotus` | 6 species/plant-part results | Same 6; no lotus alias is introduced |
| `makhana` | 1 result | Same 1 result |

The complete manifest-listed corpus was parsed: **114 recipe files**, **1,123 ingredient rows**, and **754,048 exact recipe-file bytes**. Full decoded-text and ingredient-line scans for `makhana`, *Euryale ferox*, `fox nut(s)`, `gorgon nut`, `noix de renard`, `graines de makhana`, and the reviewed lotus-market terms found **zero recipe-file hits and zero ingredient-line hits**. The manifest-ordered path/NUL/content/NUL corpus fingerprint is `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362`. This term therefore does not require recipe relinking.

No software tests were run because this update only adds database JSON data and documentation under `AGENTS.md`.
