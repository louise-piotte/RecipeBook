# WP03 Leafy Greens and Brassicas (Section 04 K)

## Packet record

- **Owner:** WP03 plant-food integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-05
- **Scope:** Integrate the source-backed core names in Section K for lettuce, spinach, cabbage types, Chinese leafy brassicas, and common flowering brassicas; reconcile current spinach/broccoli/kale rows. This does not close Section K or WP03.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`. The plan input SHA-256 was `3f80e12c1dd0b3eeadc19826bd8c2a9a4c6706fc2b6368b02f299d63d076f936`. The pre-integration reference JSON SHA-256 was `2a27af4479e13e27aa75520a9e5cc8b76bb7f181b9365b9a542880aba7694852` (278 references); the integrated file has 293 references and SHA-256 `008cb9fc173f5e0eafd64b41181df71ef1a1f0028958b3579df1e266de93082f`. The canonical forms file has three forms and SHA-256 `4ec22bf2ab6b76827c2fcc51ac0cc8ab52cd4a3386773f1ea94bcc1ae4abdc92`. The bundled package still contains 114 recipes.
- **Recipe audit:** All 114 recipe files were scanned through ingredient-line names and reference IDs. Three existing lines referenced broccoli, kale, or baby spinach; no line directly referenced any of the 15 new identities. The existing baby-spinach line was kept on its stable reference ID and linked to the new explicit leaf form.
- **Dependencies:** WP01 identity/evidence rules; earlier WP03 plant-food packets; WP10 canonical seed and generated-index integration.

## Integrated identity decisions

All 15 new rows use `VEGETABLE_AND_AROMATIC`, null density, and empty unit mappings. Their ledger identity states are `verified`; measurement and substitution research remain `not_yet_researched`. No conversion, yield, or substitution data was added.

The pre-existing `ingredient-ref-lettuce`, `ingredient-ref-red-cabbage`, and `ingredient-ref-cauliflower` ledger candidates were reconciled instead of duplicated. Existing `ingredient-ref-broccoli` and `ingredient-ref-kale` were source-reviewed. The former `ingredient-ref-baby-spinach` remains the stable ID, now names the base spinach / épinard identity, and retains baby-spinach wording as searchable aliases. A new `ingredient-form-spinach-baby-leaves` captures the young tender leaf state on the one existing recipe line that asks for baby spinach.

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-lettuce` | lettuce / laitue | EN: `garden lettuce`, `cultivated lettuce`; FR: `laitue cultivée` | OQLF pairs the cultivated plant with these terms. Do not use `salad` or `salade` as unconditional ingredient aliases. [S01] |
| `ingredient-ref-leaf-lettuce` | leaf lettuce / laitue frisée | EN: `cutting lettuce`, `loose-leaf lettuce`, `curled lettuce`; FR: `laitue à couper` | OQLF describes a non-heading lettuce type and distinguishes it from headed lettuce. [S02] |
| `ingredient-ref-romaine-lettuce` | romaine lettuce / laitue romaine | EN: `cos lettuce`, `romaine`, `cos`; FR: `romaine` | A distinct lettuce type with source-listed names. [S03] |
| `ingredient-ref-green-cabbage` | green cabbage / chou pommé vert | none | Use a specific name. Keep the family term `cabbage` unassigned across separately represented cabbage types. [S07, S08] |
| `ingredient-ref-red-cabbage` | red cabbage / chou pommé rouge | FR: `chou rouge` | OQLF distinguishes the red headed variety. [S09] |
| `ingredient-ref-savoy-cabbage` | Savoy cabbage / chou de Savoie | FR: `chou de Milan` | Keep `savoy` alone inactive because OQLF identifies it as ambiguous with Savoy salad. [S10] |
| `ingredient-ref-napa-cabbage` | Napa cabbage / chou nappa | EN: `nappa cabbage`, `nappa`, `napa`; FR: `nappa`, `napa`, `chou napa` | Keep `Chinese cabbage` / `chou chinois` inactive: OQLF uses those as umbrella terms over multiple named types. [S11, S12] |
| `ingredient-ref-bok-choy` | bok choy / pak-choï | EN: `pak choi`, `pak choy`; FR: `pak choï`, `pak choy` | A distinct Chinese leafy cabbage type; do not assign the broader Chinese-cabbage term. [S11, S13] |
| `ingredient-ref-choy-sum` | choy sum / choy sum | EN: `choi sum`, `Chinese flowering cabbage`; FR: `choï sum` | Keep `bok choy sum` inactive because picker search would overlap the distinct bok choy row. [S14] |
| `ingredient-ref-chinese-broccoli` | Chinese broccoli / brocoli chinois | EN: `Chinese kale`, `gai lan`, `gai lon`, `gai lohn`, `gai laan`, `kai lan`, `kai laan`; FR: `gai lan`, `gai lon`, `borécole chinois` | Retain the source-listed names and keep this distinct from ordinary broccoli and curly kale. [S15] |
| `ingredient-ref-minibroccoli` | baby broccoli / minibrocoli | EN: `broccoletti`, `broccolette` | OQLF describes a broccoli–Chinese-broccoli cross. `Broccolini`, Bimi, Asparation, and Tenderstem are trademarks, not active generic aliases. [S16] |
| `ingredient-ref-cauliflower` | cauliflower / chou-fleur | none | Keep cauliflower distinct from broccoli and the broad cabbage family. [S07, S17] |
| `ingredient-ref-brussels-sprouts` | Brussels sprouts / choux de Bruxelles | EN: `Brussels sprout`; FR: `chou de Bruxelles` | Retain source-supported singular and plural usage. [S18] |
| `ingredient-ref-collard-greens` | collard greens / chou cavalier | EN: `collard` | Keep French `collard` and `chou collard` inactive; OQLF discourages them. [S05] |
| `ingredient-ref-swiss-chard` | Swiss chard / bette à carde | EN: `chard`, `leaf beet`, `silver beet`; FR: `bette à cardes`, `bette` | `bette` is an OQLF term for chard and is kept off beet; keep `spinach beet` inactive because it pollutes spinach search. [S06; see also prior beet finding WP03J-S07] |

### Existing reference corrections

- `ingredient-ref-baby-spinach` now displays `spinach / épinard`, with `baby spinach` and `jeunes épinards` retained as searchable terms. `ingredient-form-spinach-baby-leaves` is linked to the existing “3 cups baby spinach” line. OQLF identifies young tender leaves as spinach leaves and describes them as suitable for raw use; no measurement or cooking claim was added.
- `ingredient-ref-broccoli` keeps `brocoli / broccoli` and adds the source-listed English `sprouting broccoli` alias. Keep ordinary broccoli distinct from Chinese broccoli and cauliflower-related chou-brocoli.
- `ingredient-ref-kale` keeps `kale / chou frisé` and adds source-listed aliases. Keep `chou vert` out because the same expression overlaps green cabbage.

## Source register

All sources are OQLF Vitrine linguistique entries, accessed on 2026-10-05.

- **S01 — laitue:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296904/laitue), preferred French and English cultivated- and garden-lettuce terms and common-use scope.
- **S02 — laitue frisée:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082783/laitue-frisee), loose-leaf/cutting lettuce terms and distinction from headed lettuce.
- **S03 — laitue romaine:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082782/laitue-romaine), romaine/cos bilingual terms and botanical variety.
- **S04 — épinard:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082833/epinard), base spinach identity and young-tender-leaf note.
- **S05 — chou cavalier:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083902/chou-cavalier), collard greens and Québec French terms.
- **S06 — bette à carde:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2295681/bette-a-carde), preferred French and English chard terms.
- **S07 — chou:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9483395/chou), broad cabbage-family scope and distinction from cauliflower and broccoli.
- **S08 — chou pommé vert:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296888/chou-pomme-vert), green-cabbage bilingual term and unqualified French chou note.
- **S09 — chou pommé rouge:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297049/chou-pomme-rouge), red-cabbage terms.
- **S10 — chou de Savoie:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2295744/chou-de-savoie), Savoy-cabbage names and warning about `savoy` alone.
- **S11 — chou de Chine:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082728/chou-de-chine), umbrella Chinese-cabbage usage spanning nappa and pak-choï types.
- **S12 — nappa:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8370210/nappa), Napa-cabbage spellings and elongated headed form.
- **S13 — pak-choï:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082790/pak-choi), pak-choï/bok-choy spellings and distinct leafy type.
- **S14 — choy sum:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015678/choy-sum), French/English spellings and stems, leaves, and flowers.
- **S15 — brocoli chinois:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015679/brocoli-chinois), Chinese broccoli/gai lan terms and botanical identity.
- **S16 — minibrocoli:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26507250/minibrocoli), baby broccoli/cross identity and trademark restrictions.
- **S17 — chou-fleur:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297070/chou-fleur), cauliflower bilingual term and botanical variety.
- **S18 — chou de Bruxelles:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297071/chou-de-bruxelles), French singular/plural label note and English Brussels-sprout term.
- **S19 — brocoli:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084016/brocoli), ordinary broccoli terms and distinction from chou-brocoli.
- **S20 — chou frisé:** [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522794/chou-frise), preferred Québec French and English kale terms; borrowing note.

## Verification

- `:app:testDebugUnitTest`: 199 tests passed, with no failures, errors, or skips.
- All 9 Python seed-package tests, ingredient/package normalization, package validation, generated-index freshness, and evidence-ledger JSON Schema validation (443 records) passed. The integrated names and aliases have no normalized exact-key collisions.
- Pixel 9a / Android 16 verification used the current build: installed APK SHA-256 matched the local debug APK. Picker search `gai lan` returned `Chinese broccoli`; exact Quebec French term `bette` returned only `Swiss chard`. Screenshots: [gai lan](pixel9a-gai-lan-picker.png) and [bette](pixel9a-bette-picker.png). The empty probe was discarded without saving; the home screen remained at 114 recipes.
- Keep the independent bilingual reviewer and the broader Section K leafy-green/brassica sweep open. All newly accepted identities remain without numeric measurements, yields, or substitutions.

## Remaining work

- Obtain independent bilingual review of the labels, alias boundaries, and baby-spinach form wording.
- Continue Section K coverage for additional lettuce varieties, napa-adjacent types such as pé-tsaï, gai lan/choy sum regional product wording, and other greens and edible shoots.
- Continue independent regional sweeps and add real ingredients without treating identity research as measurement or substitution evidence.
