# WP06 Europe — Turrón de Jijona picker-boundary review (R457)

- **Reviewed:** 2026-10-17.
- **Status:** Root-reviewed and recorded as a documentation-only hold; see
  `docs/catalog/batches/wp06-europe-turron-jijona-hold-integration-r457-20261017/README.md`.
- **Checklist:** The WP06 Europe regional sweep remains open for Western, Southern, Northern, Central,
  and Eastern Europe in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9264).
  This review does not complete regional coverage.
- **Scope:** One candidate boundary: Spanish **Turrón de Jijona PGI**, a soft almond confection from
  Jijona in Alicante. Keep it distinct from Turrón de Alicante PGI, the broader Spanish turrón
  family, and the existing generic `nougat` identity.
- **Proposal-local source IDs:** `WP06-EUROPE-TURRON-JIJONA-R457-20261017-S01` through `S04`; audit
  label `WP06-EUROPE-TURRON-JIJONA-R457-20261017-R01`. The proposed reference ID
  `ingredient-ref-turron-de-jijona` is unallocated. These review identifiers are not ledger
  allocations. The existing OQLF source ID for generic `nougat` is reused as noted below.

## Recommendation

**Hold** active integration of Turrón de Jijona under the current picker. The European Commission
recognizes Turrón de Jijona PGI and Turrón de Alicante PGI as distinct products: Jijona is soft with
finely ground almonds, while Alicante is hard with chopped almonds, wafer, and egg white. [S01]

The current Montréal French storefront for L'Española presents `turrón` as a product family and
lists the Jijona and Alicante styles as separate soft/hard varieties. Its assortment also includes
other fillings and coatings. This supports the local broad-family reading of `turrón`; it does not
establish that each item on the page is PGI-certified. [S03–S04]

The picker searches complete word phrases inside names and aliases. A row named `Turrón de Jijona`
would therefore make both accent-folded queries `turrón` and `turron` return that single regional
identity. Omitting `Turrón` from the name would also make the exact product name unsearchable. The
generic `nougat` row does not currently own `turrón` or `touron`, and should not be silently used as
an alias owner without a separate family-boundary decision. [R01, S02, S03, S05]

This is the same picker risk considered in R449: a broad food-family query should not resolve to one
regional subtype just because its name contains that family word. Keep the candidate unallocated
until the catalog can represent a broad turrón family alongside its regional styles, or picker
behavior can preserve the distinction. The 114-recipe bundle has no matching demand to justify
accepting the singleton result now. See the [R449 review](wp06-europe-piquillo-pepper-identity-review-r449-20261017.md)
and the [R453 hold](wp06-europe-next-regional-identity-review-r453-20261017.md).

## Product and naming boundaries

- **Turrón de Jijona PGI:** the European Commission’s current product page identifies this as the
  soft Jijona style made with finely ground almonds. Its regional and protected product scope does
  not describe every soft almond nougat sold in Québec. [S01]
- **Turrón de Alicante PGI:** keep this as a separate, firm/chunky style with chopped almonds,
  wafer, and egg white. Do not add its name, forms, or aliases to a Jijona row. [S01]
- **Broader Spanish turrón:** L'Española’s French page uses `turrón` for its broader assortment and
  names both Jijona and Alicante styles. Its product titles and descriptive wording are Québec
  retail naming evidence, not proof of protected origin or a terminology ruling. [S03]
- **Québec French wording:** OQLF has a 1982 GDT entry for `touron`, describing a Spanish-origin
  almond confection with varied flavourings or garnishes. The record lists `touron` as a term, not
  as a preferred term, and does not define the Jijona PGI. Do not add bare `touron` as an alias to a
  Jijona-only row. [S02]
- **Generic nougat:** the active `ingredient-ref-nougat` remains the broad bilingual identity
  supported by OQLF. It owns neither `turrón` nor `touron`; do not merge the protected Jijona and
  Alicante products into it or reuse its name as a substitution rule. [S05]
- **No synonym expansion:** do not add unqualified `turrón` / `turron`, `touron`, `nougat`,
  `almond nougat`, `Turrón de Alicante`, `Xixona`, or brand and SKU titles as aliases for one
  regional row. The local family page shows why broad terms must remain distinct from the one
  Jijona subtype. [S01–S05]

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Current count | Finding |
|---|---:|---|
| Active ingredient references | 1,742 | No active `turrón`, `turron`, `Jijona`, `Xixona`, or `touron` owner. The adjacent `ingredient-ref-nougat` is generic and has no such alias. |
| Ingredient forms | 141 | No matching form, label, match term, or candidate-ID owner. |
| Legacy import candidates | 56 | No matching candidate or proposed-ID owner. |
| Research ledger | 2,101 records; 9,564 source entries | No Turrón/Jijona identity record, candidate, or proposed R457 prefix. The generic nougat record uses the existing OQLF source ID shown as S05; that is the only reused source. |
| Numeric and rule data | 8 unit conversions; 0 global substitutions; 0 contextual substitutions; 1 package yield; 30 unit definitions | No candidate-specific conversion, yield, or substitution. |
| Proposal and integration archive | Current catalog archive | Exact searches found no Turrón, Jijona, Xixona, or touron identity proposal, decision, or integration owner. R436–R449 concern other products; R453 is the distinct grissino stirato hold. |
| Proposed allocation | Checked before authoring | `ingredient-ref-turron-de-jijona`, the R457 path/prefix, and the new source URLs have no exact owner or collision. The reference ID remains unallocated because this recommendation is to hold. |

The audit covered bilingual active names and aliases, all form labels and match terms, legacy
candidate text, ledger records and source URLs, proposal/batch archives, the current WP06 Europe
checklist, and the current picker implementation. Exact candidate and source-prefix checks found no
R457 allocation before this file was created. Europe-wide coverage remains open.

## Phrase-first picker projection

The picker accent-folds terms, prefers complete word-phrase matches, then uses substring matching
in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).
The table projects a hypothetical, alias-free `Turrón de Jijona` name to show why the identity is
held.

| Query | Current result | If the Jijona row were added |
|---|---|---|
| `turrón`; `turron` | No result | One result: `ingredient-ref-turron-de-jijona`, through the contained word `turron` |
| `turrón de Jijona` | No result | One result: the Jijona row |
| `Jijona`; `Xixona` | No result | `Jijona` finds the row; `Xixona` remains unresolved unless added as an alias, which is not recommended on current evidence |
| `Turrón de Alicante` | No result | No result; Alicante is a distinct PGI product |
| `touron` | No result | No result if the broad OQLF term is kept out of the Jijona row |
| `nougat` | One result: `ingredient-ref-nougat` | Still the generic nougat row if no broad nougat alias is added |

The unsafe result is the broad singleton for `turrón` / `turron`. No alias-only adjustment can fix
it while the candidate’s searchable display name retains the specific product name. Do not trade
away the precise product term to conceal that behavior.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and all **1,123 structured ingredient rows** were
parsed. Complete decoded recipe content and ingredient rows were checked for `turrón`, `turron`,
`Turrón de Jijona`, `Jijona`, `Xixona`, `Turrón de Alicante`, `touron`, `nougat`, `soft nougat`,
`Spanish nougat`, and the proposed reference ID. The scan found **zero matching recipe files, zero
matching ingredient rows, and zero linked recipe IDs**.

The manifest-order corpus contains **753,988 bytes** and has fingerprint
`94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each
manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a
newline, then hashes the concatenated bytes.

## Forms, measurements, conversions, and substitutions

- **Forms:** none are proposed. Soft Jijona and hard Alicante are separate protected products and
  styles, not a form-conversion chain for one ingredient. The page’s commercial fillings and
  coatings also do not establish standardized forms. [S01, S03]
- **Measurements:** none are proposed. The European product page’s ingredient descriptions and the
  retailer’s SKU/package listings do not establish a kitchen measure, portion, density, unit
  mapping, conversion, or package yield. No recipe amount is available in the bundled corpus.
- **Recipe links:** none; the full corpus scan found no Turrón/Jijona row.
- **Substitutions:** no global or contextual rule is proposed between Jijona, Alicante, generic
  nougat, marzipan, almond paste, praline, or any other confection. The product differences do not
  establish recipe-role safety or replacement ratios. No substitution study was performed.

## Evidence limitations and source access

- The European Commission page was accessible on 2026-10-17 and is the primary institutional source
  for the two PGI names and its concise product distinctions. It is a product summary, not a
  substitute for the full legal specifications; no specification thresholds are turned into
  catalog behavior. [S01]
- OQLF’s `touron` record is dated 1982 and is not headed as a preferred term. It supports that the
  word has been recorded in Québec terminology resources, but does not establish current consumer
  preference or the exact French name of the Jijona PGI. The existing OQLF `nougat` source is also
  dated 1982 and supports the generic owner only. [S02, S05]
- L'Española’s French category page was accessible and recently crawled; its storefront page
  identifies its Montreal address. The category page is current retail naming evidence, but its
  changing assortment and stock do not certify every listed product’s origin, PGI status, formula,
  or availability. [S03–S04]
- Search surfaced OQLF’s generic `touron` and `nougat` entries, not a preferred OQLF term specific to
  `Turrón de Jijona`. No exact Québec French regional label is claimed here.

## Source register

Proposal-local source IDs S01–S04 and their URLs were checked against the live ledger before
authoring; no exact URL collision was found. The generic nougat source is reused from its existing
ledger record. Pages were accessed on 2026-10-17.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-TURRON-JIJONA-R457-20261017-S01` | European Commission, [Turrón de Alicante PGI / Turrón de Jijona PGI](https://agriculture.ec.europa.eu/farming/geographical-indications-and-quality-schemes/geographical-indications-food-and-drink/turron-de-alicante-pgi_en), product names and production sections. | Current official GI profile. Identifies both protected names, Jijona’s soft ground-almond style, Alicante’s hard chopped-almond/wafer/egg-white style, and their shared Jijona production municipality. It is not used for recipe measures. |
| `WP06-EUROPE-TURRON-JIJONA-R457-20261017-S02` | Office québécois de la langue française, [GDT — touron](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17049671/touron), entry dated 1982. | Québec terminology evidence for the generic term `touron` and its Spanish origin. The entry does not designate Jijona or list `touron` as a preferred term. |
| `WP06-EUROPE-TURRON-JIJONA-R457-20261017-S03` | L'Española, Montréal, [Turron et Polvorones](https://lespanola.com/fr/collections/turron), French collection page. | Current local naming evidence: identifies turrón as Spanish nougat and lists Jijona and Alicante as separate soft/hard styles. The page does not certify every product as PGI or guarantee stock. |
| `WP06-EUROPE-TURRON-JIJONA-R457-20261017-S04` | L'Española, [Montréal boutique page](https://lespanola.com/enca/espadrille-store-lespagne-a-vos-pieds/), address and Spanish-food description. | Confirms the retailer is at 3811 Boulevard Saint-Laurent, Montréal, and says it sells Spanish foods including turrón. It does not identify a specific Jijona SKU. |
| `WP02-BAKE-INC-DEC-20261010-S09` (reused) | Office québécois de la langue française, [GDT — nougat](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432184/nougat), existing source on `ingredient-ref-nougat`. | Supports the existing generic French/English `nougat` identity. It does not establish that turrón and every nougat product are interchangeable synonyms. |
| `WP06-EUROPE-TURRON-JIJONA-R457-20261017-R01` | Read-only audit of the [Europe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L9264), live references/forms/legacy candidates/ledger/rules, picker, proposal/batch archive, manifest, and all bundled recipe files. | Records the counts, owner and source-ID checks, picker projection, and complete manifest scan for this proposal. Repository evidence only. |

## Disposition

**Hold** Turrón de Jijona as an unallocated WP06 Europe candidate. Do not add a reference, alias,
ledger identity, form, measurement, recipe link, yield, conversion, or substitution under the current
picker: a named Jijona row would make broad `turrón` / `turron` queries resolve to one protected
regional style. Revisit after the broader turrón family and its sibling styles can be represented
without that singleton selection. Keep the separate generic `nougat` row intact, and leave the
Europe-wide regional checklist open.

No tests, builds, emulator checks, or deployment were run because this is a documentation-only hold.
