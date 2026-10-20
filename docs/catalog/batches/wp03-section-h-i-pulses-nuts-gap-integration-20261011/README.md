# WP03 Sections H–I pulse and nut-row gap integration

Integrated 2026-10-11 from the [H/I gap review](../../proposals/wp03-section-h-i-pulses-nuts-gap-review-20261011.md).
The review re-audited all 114 manifest recipes and 1,123 ingredient rows against the live
references, forms, legacy candidates, and research ledger before these changes.

## Accepted changes

- Added `ingredient-form-azuki-beans-dried` under the existing adzuki reference with the
  source-qualified labels `dried adzuki beans / haricots adzuki séchés`. Linked only recipe 004#1,
  whose exact ingredient line is “200 g dried azuki beans.” The recipe's wording, 200 g amount,
  unit, and existing bilingual preparation remain intact. No soaking form, cooking yield, density,
  conversion, or substitution was inferred.
- Verified the existing generic `nuts / noix` reference using the already recorded OQLF terminology
  entry and current recipe evidence. Linked only the optional, species-unspecified “crushed nuts”
  garnish in recipe 031#4. No species, fixed mix, or crushed-nut form was inferred.
- Linked only the peanut component of recipe 090#17 to the existing peanut reference. The original
  combined text and bilingual fresh-cilantro note remain unchanged; no quantity or preparation form
  was inferred.
- Added the external source's paired quantity for recipe 114#20 to the existing pecan ledger record:
  1 cup chopped pecans = 125 g in Sally's Baking Addiction's recipe card. This is a source-specific
  portion observation; the cup convention and packing method are not stated. The ledger's
  transferable measurement state stays `blocked_pending_evidence`. No recipe line, density, unit
  mapping, conversion, or chopped-pecan form was added.

The OQLF `noix` source is reused from the existing generic-nuts ledger record rather than duplicated.
No ingredient reference was added, and the generated catalog source did not change.

## Evidence

The form and recipe links use the OQLF [adzuki entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423445/haricot-adzuki),
Health Canada's [crop-group list](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html),
and Just One Cookbook's [anko recipe](https://www.justonecookbook.com/how-to-make-anko-red-bean-paste/),
which names dried azuki beans. Generic nuts are supported by OQLF's [noix terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9483322/noix)
and Cooking With Ayeh's [chocolate-dates recipe](https://cookingwithayeh.com/chocolate-dates/),
which keeps “crushed nuts” generic while naming species in separate variations. Cotter Crunch's
[African peanut stew](https://www.cottercrunch.com/crock-pot-west-african-peanut-stew/) supports
the peanut/cilantro garnish boundary. Sally's Baking Addiction's [German chocolate cake recipe](https://sallysbakingaddiction.com/german-chocolate-cake/)
publishes the matching 1 cup / 125 g chopped-pecan pair. Each ledger source record retains its
specific scope and limits.

## Validation snapshot

- 1,072 ingredient references, 78 forms, 114 recipes, and 1,123 recipe ingredient rows.
- 1,370 ledger records, 4,517 source entries, and 3,696 distinct source IDs.
- Bundled package validation and research-ledger JSON Schema validation passed. Relevant JSON is
  UTF-8 without BOM and stores non-ASCII text as explicit Unicode escapes.
- No unit tests, instrumentation tests, or emulator run were performed. This batch adds database
  JSON data, which the current `AGENTS.md` explicitly exempts from testing.

| Artifact | SHA-256 / digest |
| --- | --- |
| `ingredient-forms.v1.json` | `e80adb0f8d0f7a83c4726f4e60995d924bbd7c4c2324367ac43f69aa5fdf037d` |
| `research-ledger.v1.json` | `41fa24a1c063c72711381d326a8a47071c737f8cf7ebd2f43639bd86ea5f2cf2` |
| Manifest-ordered recipe-set digest | `abc542ed162722c03eef640864478f7788196509b0f9620b27c98fcce1c19530` |

Remaining Sections H/I work includes other species and forms, aquafaba, seed and kernel identities,
nut/seed preparations, composition variation, and transferable measurement research.
