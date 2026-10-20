# WP02 rice starch Québec name and identity-boundary review

**Date:** 2026-10-11
**Recommendation:** Accept one identity-only `FLOUR_AND_STARCH` reference for `rice starch / amidon de riz`. Leave aliases, forms, measurements, conversions, yields, substitutions, and recipe links empty. The recommendation was integrated on 2026-10-11; see the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the implementation and verification record.

## Scope and plan mapping

The active WP02 plan says to keep rice starch separate from rice flour and, in the A4 rice-flour checkpoint, to preserve it as a separate product [plan lines 220 and 1180]. At review time, the live package had the rice-flour family and source-grain grades but no rice-starch reference. This review resolved that outstanding reference/name boundary without reopening rice-flour grades or Japanese rice-flour products.

The wording is supported directly in Québec-facing French food labeling: Olymel lists `amidon de riz` in its French ingredient declaration for a product offered through Québec grocery retailers [S05]. A Canadian ingredient supplier uses `Amidon de riz` as the exact heading for a food-starch product and describes its applications and grade differences in French [S04]. OQLF prefers `amidon` as the general term for starch and distinguishes `fécule` more specifically for starch from tubers or underground plant organs [S01]. OQLF does not have a dedicated `amidon de riz` entry, so the full compound is recommended as a source-attested display, not represented as a direct OQLF headword.

## Proposed identity

| Field | Proposal |
|---|---|
| Suggested ID | `ingredient-ref-rice-starch` (not allocated) |
| Category | `FLOUR_AND_STARCH` |
| English display | `rice starch` |
| Québec French display | `amidon de riz` |
| English aliases | None |
| French aliases | None |
| Default density | `null` |
| Unit mappings | None |
| Forms | None |

Define the proposed identity as the unqualified food ingredient sold or declared as rice starch. Do not encode a preferred rice cultivar, waxy/regular type, particle size, thermal treatment, or application as a universal property. Ingredion documents a product-specific functional native rice starch labeled simply `rice starch` in Canada; Blendtek describes multiple source and processing grades, reinforcing that the plain name is a family-level identity rather than one performance specification [S04, S06].

## Name and category boundaries

- Keep `rice starch / amidon de riz` separate from `rice flour / farine de riz`. OQLF defines rice flour as finely milled rice grains and notes that it may come from white or brown rice; its separate cereal-starch entry describes starch as an industrial product extracted from cereal grains [S02, S03]. Rice starch is not an alias for generic, white, brown, glutinous, or roasted rice flour.
- Do not alias cooked or uncooked rice, rice powder, rice bran, rice flour, glutinous rice flour, or rice noodles to this identity.
- Do not add `fécule de riz` as an alias. The exact Québec food-label and ingredient-supplier wording is `amidon de riz`; OQLF's current general entry treats `amidon` as preferred and limits the more specific sense of `fécule` to starch in tubers or underground organs [S01, S04, S05].
- Keep explicitly modified, pregelatinized/instant, cold-water-swelling, or other named functional rice-starch grades outside aliases and default behavior. The reviewed sources do not establish a common recipe-level equivalence among these grades. A later source-backed review can determine whether any specific grade warrants its own identity or a structured form.
- Keep native waxy rice starch as a product qualifier where a source names it. Do not treat `waxy`, `glutinous`, or a named functional grade as a general synonym for rice starch or rice flour [S04, S06].

## Measurements, forms, conversions, and recipe links

No generic density or kitchen measure is supported. The Ingredion sheet's powder form and 50 lb package size describe one commercial product and do not define a cup weight or bulk density [S06]. The Québec Olymel listing gives a 400 g net weight for the complete prepared product, not the amount or measure of rice starch in its batter [S05]. Do not activate either figure as an ingredient conversion.

Add no form, unit mapping, dry-to-cooked conversion, yield, or substitution rule. The sources describe starch thickening and texture functions but provide no tested household ratio for replacing cornstarch, tapioca starch, potato starch, or rice flour. No recipe-line link is supported.

The current bundled package contains 114 recipe files and 1,123 ingredient-like rows. A case-insensitive scan of ingredient names, original text, and reference IDs found **zero** hits for `rice starch`, `amidon de riz`, `fécule de riz`, modified rice starch, or the proposed ID. Recipe demand is therefore absent in the current bundle.

## Collision and coverage audit

| Surface | Audit result |
|---|---|
| Active ingredient references | 910 references. No `rice starch` or `amidon de riz` row or alias. Relevant separate identities include `ingredient-ref-rice-flour`, `ingredient-ref-white-rice-flour`, `ingredient-ref-brown-rice-flour`, `ingredient-ref-glutinous-rice-flour`, and `ingredient-ref-roasted-red-rice-flour`; none collides with the proposed display. |
| Active ingredient forms | 48 forms; no rice-starch name, alias, or proposed reference ID. No form behavior proposed. |
| Ledger | No rice-starch candidate or identity record. The `ingredient-ref-rice-flour` record has prior decisions stating that rice starch is not an alias and remains separate [WP02-S27, WP02-S26, WP02-S77]. |
| Legacy candidates | No exact `rice starch`, `amidon de riz`, or `fécule de riz` candidate found in `docs/catalog/legacy-import-identities.v1.json`. |
| Proposals | No focused rice-starch proposal exists. Existing rice-flour grade and Japanese rice-flour reviews mention the distinction but do not name or resolve a rice-starch reference. |
| Rules and package yields | No active rule or yield is keyed to a rice-starch identity. No rule is proposed. |
| Recipes | 114 files / 1,123 ingredient-like rows scanned; zero target hits and no recipe-reference link. |

## Evidence limits

The naming decision has direct Québec product-label support and current Canadian ingredient-supplier support. The exact full term `amidon de riz` is not an OQLF headword; OQLF evidence supports the component choice `amidon`, while S04 and S05 attest the complete phrase in food contexts. The reviewed sources do not establish a universal rice-starch processing grade, household measure, density, cooking conversion, yield, or substitution ratio. This recommendation is identity-only.

## Source register

| ID | Source | Supports and limits |
|---|---|---|
| S01 | OQLF, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026; accessed 2026-10-11. | Preferred general term `amidon`; says `fécule` more specifically names starch in tubers or, more generally, underground organs. Does not contain a dedicated rice-starch headword. |
| S02 | OQLF, [amidon de céréales (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287240/amidon-de-cereales), accessed 2026-10-11. | Cereal starch is an industrial product obtained by wet extraction from cereal grains. The GDT record credits AFNOR; it is a general cereal-starch definition, not a rice-specific French display. |
| S03 | OQLF, [farine de riz (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), updated 2025; accessed 2026-10-11. | Defines rice flour as fine powder of milled rice grains and identifies white- and brown-rice sources. Supports keeping flour separate from extracted starch. |
| S04 | Blendtek Ingredients, [Amidon de riz](https://www.blendtek.com/fr/ingredients/amidon-de-riz/), accessed 2026-10-11. | Current French-language food-ingredient page uses the exact heading and describes food uses, rice source choices, particle-size and grade differences. Supplier page; it does not set a universal kitchen measure or grade. |
| S05 | Olymel, [Poulet général Tao](https://www.olymel.com/produits/poulet-general-tao/), accessed 2026-10-11. | Current French product listing for a 400 g prepared product, sold through Québec grocery retailers, declares `amidon de riz` in the tempura-style chicken ingredient list. Direct Québec-market wording; the amount and processing grade of the starch are not disclosed. |
| S06 | Ingredion, [NOVATION Lumina 8600 technical specification](https://www.ingredion.com/content/dam/ingredion/technical-documents/na/NOVATION%20Lumina%208600%20-%2070000717%20Technical%20Specification.pdf), effective 2025-02-14, next review 2028-02-14; accessed 2026-10-11. | Manufacturer source specifies one functional native rice-starch product, identifies waxy rice as its source, and gives `Rice starch` as its Canadian label name. Product-specific form, package, and technical properties are not generic density or recipe data. |
