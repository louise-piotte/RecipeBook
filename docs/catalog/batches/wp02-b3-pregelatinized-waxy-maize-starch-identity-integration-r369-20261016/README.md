# WP02 Section 04 B3 — pregelatinized waxy maize starch identity (R369, 2026-10-16)

## Integration record

- **Status:** Integrated on 2026-10-16; see the [proposal](../../proposals/wp02-b3-next-gap-review-r369-20261016.md).
- **Change:** Added `pregelatinized waxy maize starch / amidon de maïs cireux prégélatinisé` as an identity-only `FLOUR_AND_STARCH` reference. Added source-attested waxy-corn variants for explicit modified pregelatinized starch to the existing modified-corn-starch reference.
- **Scope:** Kept the new French display provisional and aliasesFr empty. The English phrase `native pre-gelatinized waxy corn starch` remains a full-phrase alias for the documented Ingredion prototype; the identity is not described as universally native or chemically unmodified.

## Evidence and decision

Quadra's Canadian listing names MERIGEL 300 NG as pregelatinized waxy maize starch and gives “Waxy Maize Starch” as its ingredient name. Cargill describes a Gel-Instant native-starch product as physically modified (pregelatinized) common or waxy maize starch. Ingredion's sheeted-snack study names both “native pre-gelatinized waxy corn starch” and “modified pre-gelatinized waxy corn starch.” These product and manufacturing descriptions support the qualified search terms without asserting one chemical-treatment status for all grades.

The French display combines the OQLF-supported source-qualified phrase `amidon de maïs cireux` with its preferred generic `amidon prégélatinisé`; no source reviewed gives the exact complete phrase. The display remains provisional and no French alias was added.

The modified phrases stay on `ingredient-ref-modified-corn-starch`. The unqualified waxy pregelatinized row remains distinct from general pregelatinized corn starch, native waxy maize starch, and explicitly modified corn starch.

## Picker and recipe impact

- Exact `pregelatinized waxy maize starch` and native-prototype searches now resolve to the new reference.
- The exact explicit modified phrase resolves to the existing modified-corn-starch reference.
- Broad `waxy corn starch` searches include the native, general pregelatinized waxy, and modified-corn rows; `waxy maize starch` includes both the native and pregelatinized waxy identities.
- The manifest-ordered corpus scan found no matching recipe rows, so no recipe link changed.
- No household measures, density, unit mappings, conversions, yields, or substitutions were supported; the new ledger row records those research limits.

## Sources

- Cargill, [Native Starches](https://www.cargill.com/food-bev/na/native-starches).
- Ingredion, [Reduce breakage and improve the eating experience in brittle snacks](https://www.ingredion.com/na/en-us/solving-a-challenge/resource-library/reduce-breakage-and-improve-the-eating-experience).
- Reused Quadra, [MERIGEL 300 NG Starch](https://www.quadragroup.store/products/merigel-300-ng-starch).
- Reused OQLF entries: [amidon de grains cireux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2085948/amidon-de-grains-cireux) and [amidon prégélatinisé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357585/amidon-pregelatinise); the OQLF corn-starch entry is reused as supporting base terminology.

## Validation

- Confirmed the new reference ID, exact terms, and both new source registrations had no existing owner; reused source IDs retain their existing URLs.
- Kept the recipe corpus and forms unchanged, added no measurement observations or recipe links, and left active density/unit mappings empty.
- No software tests, Gradle tasks, emulator checks, or deployment were run because this change adds database JSON data and related documentation under `AGENTS.md`.
