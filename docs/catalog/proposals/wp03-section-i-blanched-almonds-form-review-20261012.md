# WP03 Section I blanched almonds form review — 2026-10-12

## Decision

Add `ingredient-form-almonds-blanched` under `ingredient-ref-almonds` with labels
`blanched almonds / amandes mondées`. The OQLF defines `amande mondée` as a dry almond with its skin
removed and provides `blanched almond` as the English equivalent.

Link only recipe 079#1, preserving the bundled line `210 g blanched almonds`, its 210 g mass, unit, and
preparation text. The publisher’s current recipe card says “whole blanched almonds” and lists 210 g;
the bundled line omits “whole,” so the form does not encode whole shape. No density, unit mapping,
conversion, yield, substitution, or new measurement observation was added.

## Evidence

- [OQLF, amande mondée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059925/amande-mondee) defines the state as skin removed and pairs it with `blanched almond`.
- [Foodtasia, Easy Homemade Almond Paste (and Marzipan!)](https://foodtasia.com/almond-paste-and-marzipan/) lists 1½ cups whole blanched almonds (210 g), matching the bundled row’s mass while supplying the whole qualifier absent from its preserved text.
- [Foodtasia, How to Blanch Almonds](https://foodtasia.com/blanched-almonds/) describes blanched almonds as raw almonds with their skins removed. Its process guidance is not used to infer a preparation yield or measurement.

## Ledger scope

The new `ingredient_form` record uses the OQLF entry and both Foodtasia pages. Measurement and
substitution states remain `not_yet_researched`; no measurement observation is added.
