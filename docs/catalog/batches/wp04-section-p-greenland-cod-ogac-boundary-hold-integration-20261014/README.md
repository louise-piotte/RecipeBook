# WP04 Section P Greenland cod / ogac boundary hold (R92)

Reviewed and integrated 2026-10-14. Section P remains open.

## Decision

Keep Greenland cod / ogac (*Gadus ogac*) outside active references, forms, aliases, and the research
ledger pending a crosswalk between the distinct Québec/Canadian edible-fish name and taxonomic
treatments that place it within Pacific cod (*G. macrocephalus*). OQLF prefers `ogac` and discourages
`morue`; CFIA lists `Greenland Cod / Ogac` separately from its Pacific-cod entry. ITIS marks
*G. ogac* valid, while WoRMS accepts it under *G. macrocephalus*. Two molecular studies also differ
in how they characterize the relationship.

The 2024 Denmark/Greenland fishery report uses both scientific names together and describes dried
or frozen food use for Greenland's local market. It does not establish a Québec product identity.
The current catalog already has five cod-related results for `cod` and `morue`, so a separate
qualified result would not create a singleton-query trap; the unresolved issue is identity scope.
The 114-recipe bundle contains no cod ingredient lines or candidate-name matches.

No reference, alias, candidate ledger record, form, measure, recipe link, conversion, yield, or
substitution was added.

## Integration and validation

- Marked the Section P checklist review complete and recorded the hold in the global catalog plan
  log and `roadmap.md`.
- Rechecked the live catalog snapshot: 1,425 references, 104 forms, 63 legacy candidates, 1,764
  ledger records, 114 recipes, and 1,123 ingredient rows. The current picker returns five entries
  for `cod` and `morue`, one for `Pacific cod` / `morue du Pacifique`, and none for `Greenland cod`
  / `ogac`.
- The recipe corpus has no generic `cod` / `morue` ingredient rows and no candidate phrase matches.
  Documentation UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No tests were run because this was a documentation-only hold.

See the detailed [R92 review](../../proposals/wp04-section-p-greenland-cod-ogac-taxonomy-picker-boundary-review-r92-20261014.md).

## Main sources

- [OQLF — ogac](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488152/ogac) gives
  the preferred Québec term and discourages `morue`.
- [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) lists
  Greenland cod / Ogac as a food-name entry separately from Pacific cod.
- [WoRMS](https://www.marinespecies.org/aphia.php?p=taxlist&tName=Gadus+morhua) lists *G. ogac*
  under *G. macrocephalus*.
- The [NAFO Denmark/Greenland Research Report for 2024](https://www.nafo.int/Portals/0/PDFs/sc/2025/scs25-12.pdf)
  records regional fishery and food-market context; the detailed proposal documents the taxonomy,
  terminology, and source limits.
