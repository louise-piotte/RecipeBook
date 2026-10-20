# WP02 Japanese medium-strength wheat flour: Québec French display review

**Review date:** 2026-10-12
**Disposition:** Hold catalog integration until a Québec French display is established.

## Recommendation

The Japanese flour class `中力粉` (*chūrikiko*) is distinct and verifiable in Japanese sources, but this review found no authoritative Québec French term or Canadian French product label for it. Do not promote the prior proposal's provisional display, **farine de blé japonaise de force moyenne (chūrikiko)**, into the active catalog or aliases. It is a transparent translation, not an attested Québec term.

Do not substitute **farine tout usage**: the OQLF defines the Canadian product as a blend of hard and soft wheat flour at about 12% protein and explicitly notes that flour classifications and names vary by country. Do not substitute **farine de blé de force** or **farine de blé tendre** either; the OQLF defines those as high-gluten/hard-wheat and lower-gluten/soft-wheat products, respectively. None is a Québec crosswalk for the Japanese middle class.

Keep the identity-level candidate held as a whole until a Québec French display is supported by an OQLF entry, a Canadian bilingual product label for this class, or a focused review by a Québec French terminology specialist. A source for an individual Japanese SKU can support that product's label only; it does not establish a class-wide French name.

## Candidate fields and disposition

| Field | Review disposition |
|---|---|
| Identity concept | Retain as a research candidate: Japanese medium-strength wheat flour, `中力粉` (*chūrikiko*). MAFF describes an intermediate gluten-strength class used for udon and other Japanese noodles. |
| English display | Keep `Japanese medium-strength wheat flour` in proposal material only while integration is held. It is a descriptive rendering, not a Canadian label found in this review. |
| French display | **Hold.** Do not adopt `farine de blé japonaise de force moyenne (chūrikiko)` or shorter variants such as `farine de force moyenne`, `farine de blé de force moyenne`, or `farine de blé à force moyenne` as active names or aliases. |
| Aliases | Add none. In particular, do not use `farine tout usage`, `farine de blé de force`, `farine de blé tendre`, generic `farine`, or the Japanese script as a French alias. If the identity is later accepted, review a sourced romanization for search separately from the French display. |
| Forms | None supported. The cited manufacturer SKU is a 1 kg package; that does not establish a general form or form conversion. |
| Density and unit mappings | None supported. |
| Measurements and conversions | None proposed. Nippn reports 10 g protein per 100 g for its specific `たけ` product; do not generalize this to a class threshold, infer a crosswalk, or treat it as a density or measure conversion. |
| Substitutions | None supported. Do not link to all-purpose, cake, pastry, bread, or other national flour classes. |
| Recipe links | None. The bundled corpus contains no exact candidate identity or phrase. |

## Ownership, picker, and recipe audit

The read-only audit used the live package files on 2026-10-12. It checked the proposed ID `ingredient-ref-japanese-medium-wheat-flour`; the English descriptions; the proposed French construction and its short variants; `chūrikiko`, `churikiko`, `中力粉`, and `中力小麦粉`.

| Surface | Finding |
|---|---|
| Active references | No exact candidate ID, English display, proposed French phrase, romanization, or Japanese class string is owned. The active `ingredient-ref-japanese-weak-wheat-flour` remains a separate class and must not be merged. The active all-purpose row already owns `farine tout usage` and the broad alias `farine`. |
| Forms | No form ID, attached reference, label, or match term owns an exact candidate term. No form should be created from a package-size statement. |
| Legacy identities | None of the 66 legacy candidates owns the candidate ID or exact terms above. |
| Research ledger | No record has the proposed candidate ID or an exact medium-class term. The MAFF URL is cited by existing record `ingredient-ref-japanese-weak-wheat-flour` as `WP02-JSF-20261011-S01`, but its locator and decision cover `薄力粉` (the weak class) only. That record must not be widened to claim medium-class or Québec-display evidence. |
| Existing proposals | `wp02-wheat-flour-next-gap-review-20261012.md` proposes the candidate and marks the French display provisional. This independent review rejects that display for integration and records a hold; it does not create a second identity proposal. |
| Picker behavior | `IngredientSearch.kt` folds accents and removes every character outside ASCII `a-z` and `0-9`. `chūrikiko` folds to `churikiko`; that romanization currently finds no active row. `中力粉` normalizes to the empty string, which returns all 1,265 active references. Do not rely on kanji aliases for picker search. A future qualified French or English phrase should be checked for unique results after a display is supported. |
| Bundled recipes | All 114 manifest-listed files and 1,123 ingredient rows were scanned for the candidate ID, English and French phrases, romanizations, and Japanese strings: zero target rows and zero recipe links. As context, existing all-purpose flour appears 50 times in 47 recipes, bread flour twice in two recipes, and cake flour four times in four recipes; this is not demand for the Japanese class. |

Audit snapshot: active references 1,265 (`9ba32a8390b08dc51e58febd93489f51ec74be85468efb3eeb4e699ad1f15cf4`); forms 94 (`55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b`); legacy candidates 66 (`bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f`); ledger records 1,574 (`8bb75fe506cae0c62ebb5d34ef4ccffba5aa5c141028af0f0b21b464eed4f6c3`); recipe manifest 114 (`b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`).

## Evidence and limits

Sources were checked on 2026-10-12. Searches of OQLF terminology and Québec/Canadian French product wording for `chūrikiko`, `churikiko`, `中力粉`, `farine de blé japonaise`, `farine de force moyenne`, and `farine de blé de force moyenne` did not locate an authoritative French display or a Canadian bilingual label for this class. This is a bounded search result, not proof that no such label exists.

| Source | What it supports | What it does not support |
|---|---|---|
| Office québécois de la langue française, [farine tout usage (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25796945/farine-tout-usage), updated 2016 | Canadian farine tout usage is defined as a hard/soft wheat blend around 12% protein; the entry says flour classification and naming vary across countries. | No Japanese class mapping or French display for `中力粉`. |
| OQLF, [farine de blé de force (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force), updated 2004 | Québec term for high-gluten flour from hard wheat, used mainly for bread. | Not an intermediate-strength class. |
| OQLF, [farine de blé tendre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre), updated 2004 | Québec terms `farine de blé tendre` and `farine de blé mou` for lower-gluten soft-wheat flour used mainly in pastry. | Not the Japanese medium-strength class. |
| Japan Ministry of Agriculture, Forestry and Fisheries, [小麦粉の種類について教えてください](https://www.maff.go.jp/j/heya/sodan/1106/02.html), updated 2023 | Distinguishes four practical classes and describes `中力粉` as medium in gluten strength and used for udon and other Japanese noodles. | No numeric threshold, Canadian product wording, or French translation. |
| Japan Flour Milling Promotion Foundation, [小麦粉の加工と製品](https://www.seifun.or.jp/pages/79/) | Says Japan has no public legal definition or standard for wheat-flour classes; milling companies use practical strength classes. It describes the middle class and uses. | No national quantitative class boundary or Québec term. |
| Nippn, [ニップン たけ（中力小麦粉）](https://www.nippn.co.jp/products/powder/flour/detail/1194445_2250.html) | A current manufacturer product page labels one 1 kg SKU `中力小麦粉`; reports that product's protein as 10 g/100 g and lists cooking uses. | No French label, Canadian availability, class-wide protein value, conversion, density, or substitution. |

## Release condition

Reopen the naming decision only when a source directly names this class in Québec French or a Canadian bilingual package/product source identifies the Japanese medium-strength flour in French. Record the label's scope: a brand-specific product name does not automatically support a generic class alias. Until then, keep the prior French wording as an unaccepted draft only and leave catalog, forms, mappings, measurements, conversions, substitutions, and recipe links absent.
