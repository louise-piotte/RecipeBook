# WP03 Section I ground pistachio form boundary review — 2026-10-12

## Recommendation

**Hold** a `ground pistachios` form and do not attach one to recipe `017#1` in the current catalog.
The bundled row says `finely ground`, but Sally’s current recipe page describes pulsing the nuts until
small crumbs form and calls the prepared ingredient very finely chopped pistachios. The publisher’s
wording does not establish a powder-like ground form. The bundled amount also belongs to the starting
pistachios, not to a published mass of ground pistachios.

This proposal changes no catalog JSON, recipe data, ledger entry, plan checklist, or test. The wider
Section I preparation checklist remains open.

## Exact row demand and source comparison

| Bundled row | Current reference and stored demand | Publisher’s current wording |
|---|---|---|
| `017#1` | `ingredient-ref-pistachios`; `130 g pistachios, finely ground`; `quantity: 130`, `unit: g`; `preparation.en: finely ground`, `preparation.fr: finement moulu` | The ingredient list is `1 cup (130g) salted or unsalted pistachios`. Step 1 says to pulse pistachios in a food processor “until small crumbs form” and calls for 3/4 cup of “very finely chopped pistachios.” The note says to start with the full cup, use only 3/4 cup of the crumbs in the dough, and use any extra as garnish. |

The publisher supports a fine-crumb / very-finely-chopped preparation for this cookie, not a uniform
powder. Its “small crumbs” description and photo are qualitative; the page sets no particle-size
threshold.

The recipe corpus has other pistachio demands, but they do not establish this form: recipe `056#29`
uses chopped pistachios for decoration, recipes `081#3` and `081#7` list pistachios without a
preparation state, and `056#7` / `056#16` are pistachio-paste rows. They remain outside this
ground-form review.

## Québec terminology

The OQLF’s [*pistache* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297124/pistache)
gives `pistache` as the French term corresponding to `pistachio` and identifies *Pistacia vera*.
This supports the existing pistachio identity, not a processed form.

The OQLF [*moulu* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429170/moulu)
defines `moulu` as “réduit en poudre” and maps it to English `ground`. Therefore, `pistaches finement
moulues` would represent a powder-like state that Sally’s current instructions do not claim. A
descriptive rendering such as `pistaches hachées très finement` or `pistaches réduites en petites
miettes` better reflects the publisher’s text, but this review found no OQLF entry that standardizes
a pistachio-crumb product name. These are translation proposals, not terminology rulings.

## Numeric boundaries

- The publisher pairs `1 cup` with `130 g` for the starting salted or unsalted pistachios, before
  pulsing. It does not publish `130 g` as a weight of ground or crumbed pistachios.
- The publisher directs the cook to use `3/4 cup` of the resulting crumbs in the dough and allows
  any extra to be used as garnish. This is not a published gram equivalent, yield, or conversion
  from the 130 g input.
- Do not attach a mass, volume mapping, density, conversion, or yield to a ground/crumb form, and do
  not create a measurement observation from this recipe pair.

## Catalog and source-ID audit

The active references distinguish `ingredient-ref-pistachios`, `ingredient-ref-pistachio-paste`,
and `ingredient-ref-pistachio-butter`. The 91 current ingredient forms contain no pistachio form.
The ledger’s pistachio identity record retains `measurementState: not_yet_researched` and
`substitutionResearchState: not_yet_researched`; it contains no measurement observation or recipe
form decision. The Sally’s recipe URL is not yet a ledger source.

| Source ID | Source and scope |
|---|---|
| `WP03-I-PISTACHIO-GROUND-20261012-S01` (proposed) | Sally’s Baking Addiction, [Pistachio Drop Cookies](https://sallysbakingaddiction.com/pistachio-cookies/), accessed 2026-10-12; current ingredient amount and pulse/chop instructions. This source supports the crumb preparation and the input amount only. |
| `WP03-I-PISTACHIO-GROUND-20261012-S02` (proposed) | OQLF, [*moulu*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429170/moulu), accessed 2026-10-12; defines `moulu` as reduced to powder. |
| `WP03-NUTS-20261009-S05` (existing; reused) | OQLF, [*pistache*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297124/pistache); existing ledger evidence for the base identity and French term. |

Before this proposal was written, the two proposed IDs were searched against all 5,358 live ledger
source entries (4,398 distinct source IDs) and the pre-existing
`docs/catalog/proposals/` and `docs/catalog/batches/` text; neither was present. They are
proposal-only IDs and have not been added to the ledger. The reused pistache source ID is already
present on `ingredient-ref-pistachios`.

## Checklist disposition and integration boundary

Keep the Section I checklist item `[ ] Whole, chopped, sliced, slivered, ground, blanched, roasted,
salted, and paste/butter forms where useful` open, along with the broader `[ ] Continue the broader
Section I seed, kernel, and butter/paste checklist` item. This review resolves only whether the exact
`finely ground` demand in `017#1` supports a ground form; it does not.

Reconsider this row only after the bundled preparation wording is reconciled with the publisher’s
crumb description. If a future row accurately preserves the source’s crumb state, assess a
source-specific fine-crumb form then. Do not infer that form, or a powder form, from the current
`finely ground` row alone.
