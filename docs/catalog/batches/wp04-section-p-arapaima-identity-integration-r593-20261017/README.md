# WP04 Section P R593 — Tambaqui identity integration

Date: 2026-10-17

## Decision

Added identity-only `tambaqui / tambaqui` as `ingredient-ref-tambaqui`, scoped to *Colossoma macropomum*, with no aliases. The proposed name is supported by the Translation Bureau’s bilingual terminology record and a regional Amapá food guide. Do not add `blackfin pacu`, `cachama`, or broader `pacu` terms: those names could widen searches beyond the species-specific identity.

Added a verified identity record to the research ledger. The regional guide’s approximately 2 kg whole-fish recipe and cooking times remain source-specific, not standard portions, measures, or yields. No form, density, unit mapping, recipe link, conversion, yield, or substitution was added. The bundle has no Tambaqui demand.

The MMA’s August 19 vulnerable-listing notice is retained as dated historical context for wild populations. The newer MPA notice from October 15 is the current reviewed source for Brazilian fishery rules as of this review date: fishing remains permitted under existing rules, including the October–February defeso, and licensed aquaculture is not subject to the Vulnerable-listing restrictions. The catalog row encodes no origin, harvest, sourcing, or compliance status, and these Brazilian sources do not establish a particular product’s compliance or Canadian availability.

## Evidence

- Public Services and Procurement Canada, [TERMIUM Plus: TAMBAQUI](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enr&lang=eng&srchtxt=TAMBAQUI): associates English and French `tambaqui` with *Colossoma macropomum* and marks French as a correct masculine noun. `Blackfin pacu` and `cachama` remain out of aliases.
- Amapá State Institute for Scientific and Technological Research, [Guia do pescado do Amapá — feiras de Macapá](https://www.iepa.ap.gov.br/noticias/2025/pescado/guia-do-pescado-do-amapa-feiras-de-macapa-iepa_web.pdf), p. 45: identifies Tambaqui as *C. macropomum* and provides a regional grilling/oven recipe. Its one-fish weight and cooking instructions are not generalized.
- Brazil Ministry of Environment and Climate Change, [MMA clarification on Tambaqui’s Vulnerable classification](https://www.gov.br/mma/pt-br/noticias-defeso-eleitoral/mma-esclarece-classificacao-do-tambaqui-como-especie-vulneravel-a-extincao), published 2026-08-19: historical explanation of the Vulnerable listing for wild populations.
- Brazil Ministry of Fisheries and Aquaculture, [Pesca do tambaqui segue permitida pelo Governo Federal](https://www.gov.br/mpa/pt-br/assuntos/noticias/pesca-do-tambaqui-segue-permitida-pelo-governo-federal), published 2026-10-15: says federal fishing remains permitted under existing rules, including the October–February defeso; licensed aquaculture has no restrictions under the cited guidance; and the recovery plan remains in development.

See the [R593 proposal](../../proposals/wp04-section-p-next-seafood-review-r593-20261017.md), the open [regional-fish checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L6426), and the broader [Section P seafood work item](../../../RecipeBook-global-ingredient-catalog-plan.txt#L14981). Those broader parent tasks remain open.

## Static verification

Static seed-package validation, normalizer checks, generated-index freshness, research-ledger schema/source-ID validation, source ownership, picker projection, recipe-corpus scan (114 recipes / 1,123 ingredient rows), UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No application tests, build, emulator check, or deployment were needed or run because this integration only adds database JSON data and tracking documentation under `AGENTS.md`.
