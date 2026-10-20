# WP04 Section P R520 integration — silverside / capucette naming hold

- **Date:** 2026-10-17
- **Decision:** Keep unqualified `silverside / capucette` unallocated until a Québec-facing qualified French name and safe picker scope are supported.
- **Data change:** None. No reference, alias, form, legacy candidate, ledger identity, recipe link, measurement, conversion, or substitution was added. The four R520 source IDs remain proposal-local and are not registered in the research ledger.
- **Existing neighbors:** Keep American smelt, European smelt, and Atlantic capelin separate and unchanged.

## Evidence and boundary

Metro’s [indexed Québec product listing](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/capucette-nettoyee-sans-tete-surgelee/p/773365312308) and [indexed English listing](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-cleaned-headless-silverside/p/773365312308) are language views of one SKU, item 773365312308. The indexed product details identify *Odontesthes regia*, Peru provenance, and a 908 g package. Direct Metro page retrieval returned 403 during review; the records are treated as search-indexed evidence, not a direct live-page or local-stock check.

The [OQLF GDT entry for *capucette*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198958/capucette) gives the Québec preferred term for *Menidia menidia* (Atlantic silverside) in the edible-fish and zoology/ichthyology domains. The [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) also lists `Silverside / Capucette` for *O. regia*, plus `Atlantic Silverside / Capucette` and `Silverside / Capucette De L’atlantique` for *M. menidia*. Its genus-level *Odontesthes* pairings reuse those components in inconsistent combinations. This supports a naming collision across species; it does not establish synonymy or culinary equivalence.

Keep both species rows and aliases out of active data for now. In particular, do not assign Metro’s unqualified French product title to *M. menidia*, or invent a qualified Québec French name for *O. regia*. Reopen when a current regional label or authoritative terminology source supports an unambiguous qualified French name, or the picker can preserve both named species choices.

## Picker and recipe corpus

The proposal statically projected a hypothetical `Atlantic silverside / capucette` row. `Atlantic silverside`, `capucette`, and `silverside` would each change from 0 to 1 match; `capucette de l’Atlantique` remains 0 because it is not included; broad `fish / poisson` remains 13 / 12. The collision between Metro’s product naming and OQLF’s species naming is the reason to hold.

The manifest scan covered all 114 recipe files, 1,123 structured ingredient rows, and 753,988 recipe bytes. It found no candidate phrases or recipe demand. Corpus fingerprint: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

## Source and ownership audit

At the refreshed post-R519 snapshot there are 1,793 references, 143 forms, 56 legacy candidates, and 2,150 ledger records with 9,866 source entries, 8,350 distinct source IDs, and 7,060 distinct URLs. Exact normalized-name and candidate-ID searches found no active or ledger identity owner for the reviewed fish names or proposed IDs. The Metro and OQLF URLs are unowned; the CFIA results URL is shared by 37 source entries across 37 records and 28 source IDs for unrelated prior decisions. R520 audited all existing owners and leaves them unchanged.

No candidate source is added to the ledger because the decision is a hold. The complete ownership map, proposed source register, picker projection, file hashes, and review limits are in the [R520 proposal](../../proposals/wp04-section-p-next-seafood-review-r520-20261017.md).

No software tests, build, emulator check, or deployment were run. Section P’s broad fish-name resolution checklist remains open.
