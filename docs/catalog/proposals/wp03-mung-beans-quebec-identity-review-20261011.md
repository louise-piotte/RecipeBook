# Mung beans / haricots mungo — Québec identity review

- **Reviewed:** 2026-10-11
- **Status:** accepted as an identity-only `LEGUME_AND_PULSE` reference for *Vigna radiata*.
- **Scope:** whole edible seed identity only. This review does not cover mung-bean flour, extracted starch, sprouts, cooked forms, or finished noodles.

## Decision

Add `mung beans / haricots mungo` for the food seed of *Vigna radiata*. Use only the source-attested spelling variants `mung bean`, `green gram`, `golden gram`, and singular `haricot mungo` as aliases. OQLF lists *Vigna radiata* with the English terms and its preferred French term; CFIA’s French grain-code entry independently pairs packaged *V. radiata* grain with `haricot mungo`.

OQLF also has a separate *Vigna mungo* entry that notes the French term `haricot mungo` is used for both species and maps *V. mungo* to `urd` / `black gram`. The active reference therefore remains limited to *V. radiata*; do not alias `urd`, `urad`, or `black gram` to it. Keep the future *V. mungo* identity separate and resolve its Québec French display independently.

The exact-name audit found no existing whole mung-bean reference or exact owner for the proposed aliases. Existing `mung bean sprouts`, `mung bean starch`, and `bean thread cellophane noodles` stay separate. The review found no mung-bean ingredient line or reference link in the 114 bundled recipes. No form, measure, density, unit mapping, conversion, yield, recipe link, or substitution is added; measurement and substitution research remain open.

## Reference fields

| Field | Value |
|---|---|
| ID | `ingredient-ref-mung-beans` |
| English display | `mung beans` |
| French display | `haricots mungo` |
| English aliases | `mung bean`; `green gram`; `golden gram` |
| French alias | `haricot mungo` |
| Species scope | Food seed of *Vigna radiata* |
| Forms, numeric behavior, recipe links, substitutions | None |

## Collision and recipe audit

The pre-integration audit covered active reference names and aliases, form labels and match terms, legacy candidate names, research-ledger identities, and every bundled recipe ingredient row. It found no exact whole-pulse owner for `mung beans`, `mung bean`, `haricots mungo`, `haricot mungo`, `green gram`, or `golden gram`, and no recipe line or reference link for those terms. Existing neighboring records are:

- `ingredient-ref-mung-bean-sprouts` — `mung bean sprouts / germes de haricot mungo`.
- `ingredient-ref-mung-bean-starch` — `mung bean starch / amidon de haricot mungo`.
- `ingredient-ref-bean-thread-cellophane-noodles` — a finished bean-thread noodle identity.
- `candidate-mung-bean-flour` — held because the flour product and species/French-label scope remain unresolved.
- `candidate-roasted-mong-flour` — held because species, flour-versus-starch identity, and process sequence remain unresolved.

These records do not own any of the whole-seed alias keys. They remain distinct from the new pulse row.

## Sources

- **S01 — OQLF, [haricot mungo — *Vigna radiata*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082840/haricot-mungo).** Preferred French term, English terms `mung bean`, `green gram`, and `golden gram`, Latin species, and edible-seed definition.
- **S02 — OQLF, [haricot mungo — *Vigna mungo*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo).** Documents the two-species French naming overlap and maps *V. mungo* to `urd` / `black gram`.
- **S03 — CFIA, [French organic seed and grain product codes](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme), chapter 07, code 07.13.31/7200.** Pairs packaged *V. radiata* grain with `haricot mungo`; lists *V. mungo* separately. This is a commodity-classification locator, not a universal retail-label rule.
- **S04 — Kew Science, [Plants of the World Online: *Vigna radiata*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:525492-1).** Accepts *V. radiata* as a species in Fabaceae; taxonomy only.
