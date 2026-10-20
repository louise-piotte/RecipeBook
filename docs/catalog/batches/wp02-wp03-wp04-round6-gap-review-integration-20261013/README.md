# WP02 / WP03 / WP04 round-six gap-review integration

- Date: 2026-10-13.
- Scope: regional amaranth naming, a Hindi rice alias, and the *Portunus pelagicus* picker boundary.
- The proposal reviewers made no shared-data edits. Root reviewed each proposal and integrated the two supported aliases plus a candidate hold in the research ledger.
- No app, unit, instrumentation, emulator, or application tests were run. This batch only adds database JSON data and its tracking documentation, as directed in `AGENTS.md`.

## Integrated decisions

### WP02 A6: Chaulai amaranth name hold

Kept all Chaulai aliases inactive after static package validation rejected the same exact alias on the existing amaranth-grain and amaranth-greens rows. The current phrase-first picker also makes a qualified `chaulai atta` alias match a bare `chaulai` query as flour, so the proposed three-part choice could not be represented without a misleading result. FSSAI supports Chaulai for whole/dehulled amaranth grain, Just Organik and a Canadian-facing listing support Chaulai Aata flour wording, and a Canadian produce listing uses Chaulai for amaranth leaves. The ledger now records unresolved name-allocation decisions on the relevant existing rows. Québec displays remain unchanged.

Recorded the manufacturer's approximate 40–50 g one-person starting range as a product-specific portion observation. It is not a standardized serving or volume conversion. Default density remains null, unit mappings stay empty, and the existing no-supported-substitute finding remains unchanged. No aliases, recipes, forms, or active numeric fields changed.

Sources: [FSSAI cereal standard](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), [Just Organik amaranth flour](https://www.justorganik.com/products/amaranth-flour-chaulai-aata), [Indiangoods atta listing](https://www.indiangoods.shop/en-ca/collections/atta), [ClickstoCart amaranth leaves](https://clickstocart.ca/products/amaranth-leaves).

### WP03 Section F: Chawal

Added only `chawal` to the existing generic `rice / riz` English aliases. The Sikkim Government lists it as a Hindi name for rice, and a Mississauga retailer applies it to a named rice package. The query resolves to generic rice; named varieties, milling distinctions, dry/cooked forms, French aliases, and measurements remain unchanged.

Sources: [Sikkim Government cereals](https://www.sikkim.gov.in/department/departmentmenudetails?url=Menu%3Dhorticulture-cash-crop-department%2Fcereals), [Namaste Supermarket Surti Kolam rice](https://namastemississauga.ca/products/vishva-surti-kolam-rice-10lb/019a52cc-4408-788c-ad5d-f9bb802d8c36).

### WP04 Section P: Blue swimming crab candidate hold

Recorded *Portunus pelagicus* as a verified candidate with an unresolved activation decision; no active ingredient reference was added. CFIA supports `blue swimming crab / étrille bleue`, but its shorter `swimming crab` name applies to *Portunus* spp. and `étrille` also occurs in `étrille commune` for *Necora puber*. The current phrase-first picker would make those broader queries select this one species. Keep `blue crab / crabe bleu` with *Callinectes sapidus*. Metro's `crabe batailleur` wording remains SKU-specific, and Ocean's `crabes bleus` wording stays off aliases because it conflicts with the OQLF-scoped *C. sapidus* term.

The Metro 227 g package and Clover Leaf ¼ cup (55 g) nutrition serving are product-specific; neither becomes a species measure. No form, active measure, recipe link, conversion, or substitution was added. The picker boundary hold remains open until broader searches can preserve the choices.

Sources: [CFIA Fish List crab query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab), [OQLF GDT: crabe bleu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198912/crabe-bleu), [Metro Aqua Star claw meat](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-seafood/lobster-crab-pollock/wild-crab-claw-meat/p/731149113954), [Ocean’s wild crab meat](https://oceans.ca/fr/products/chair-de-crabe-sauvage/), [Clover Leaf crab pieces](https://www.cloverleaf.ca/fr/produits/morceaux-de-crabe-clover-leaf/).

The manifest-ordered recipe scan remains 114 files / 1,123 ingredient rows; none of the round-six candidate phrases matched. No recipes or forms changed.

## Static validation

Static package validation and normalization, generated-index freshness, ledger schema and source/observation ID checks, focused picker projections, recipe-corpus scan, UTF-8/no-BOM, and scoped diff checks passed after the Chaulai aliases were held. The original proposed alias set fails package validation because `chaulai` would have duplicate exact owners on the grain and greens rows. No app or emulator tests were run for this database-JSON-only batch.

The A6, Section F, and Section P parent reviews remain open.
