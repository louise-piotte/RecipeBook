# WP03 Section L snake-gourd Québec identity and boundary review — 2026-10-11

- **Reviewed:** 2026-10-11
- **Status:** Proposal only. This review writes only this proposal file; it does not change the shared catalog, ledger, recipes, plan, roadmap, code, or tests.
- **Scope:** The held Section L snake-gourd item. Other gourds are discussed only to document identity and name boundaries.

## Recommendation

Do not keep snake gourd held. Accept one identity-only ingredient reference, ingredient-ref-snake-gourd, with the displays **snake gourd / courge serpent** and category VEGETABLE_AND_AROMATIC. Scope it to the cultivated, immature fruit of *Trichosanthes cucumerina* used as a vegetable.

The previously missing Québec French evidence is now available: Pépinière.ca, a Québec garden-centre retailer with Laval and Brossard locations, currently lists an organic ‘Chichinda’ seed product in French as *Courge serpent ‘Chichinda’* and in English as *snake gourd*, with *T. cucumerina* identified on the English listing. This is a seed-catalog label, not proof that fresh snake gourd is commonly stocked or labeled in Québec grocery stores. Paired with the current culinary/agricultural description from New Caledonia’s Institut agronomique néo-calédonien (IAC), it supports the narrow food identity and a Québec-market French display without claiming official OQLF approval or broad retail prevalence.

Kew’s current taxonomic backbone accepts *T. cucumerina* and treats *T. cucumerina* var. *anguina* as a synonym of *T. cucumerina* subsp. *cucumerina*. Keep *var. anguina* as a source-used horticultural name, not a second catalog identity. The food scope is the cultivated fruit harvested immature and cooked as a vegetable. The mature orange/red, fibrous fruit, leaves, young shoots, and seeds are not included in this reference; the cited agricultural source describes those as different stages or plant parts.

Proposed default aliases are deliberately narrow:

- English: “edible snake gourd,” an EPPO common name that disambiguates the food fruit.
- French: “serpent végétal,” an EPPO French common name. Keep the Québec display as “courge serpent.”

Do not activate “serpent gourd,” “club gourd,” “snake cucumber,” “concombre serpent,” “haricot serpent,” “patole,” “patola,” or cultivar and transliterated regional names as unscoped aliases. The old OQLF bottle-gourd entry lists “snake gourd” and “serpent gourd” as associated English terms for *Lagenaria siceraria*; sources also disagree or overlap on *patole/patola*. These are provenance and boundary notes, not reasons to collapse the species or keep the locally supported identity held.

There is no matching bundled recipe line. Add no forms, density, unit mappings, measurement observations, conversions, substitutions, or recipe links. Measurement and substitution research remain not yet researched.

## Refreshed live snapshot and audit

The shared tree advanced during the audit, so these values are the latest snapshot immediately before writing this proposal. Recompute if integration happens after other catalog work.

| Live artifact | Count | SHA-256 |
|---|---:|---|
| Bundled ingredient references | 1,015 | 3dc400ab6bb7ef8eb9dcacbaf287ab5661c29d36fe543b70ed25855fafa4b386 |
| Bundled ingredient forms | 66 | 6d194ec1390e239bc2026ea93edbe5f3c1512f244486c2a8e513aca7173a76bd |
| Manifest recipe paths | 114 | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Research ledger records / source entries / distinct source IDs | 1,296 / 4,171 / 3,419 | 04a1c1cb56978b0ec3d5dd1541f465ca355a95807d296f74283176f3c72d0879 |
| Legacy identity candidates | 75 | e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0 |
| Manifest-ordered recipes / ingredient rows | 114 / 1,123 | b4bd736f4b3f6d4fd6528f76419c632c8afec4e9d32a288f668212de5214ab6d |

The recipe-corpus SHA-256 hashes each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and a NUL byte in manifest order.

The live reference list has no ingredient-ref-snake-gourd ID and no exact normalized owner for the proposed names or researched spellings. The exact phrase audit covered the display and alias candidates, including “snake gourd,” “edible snake gourd,” “courge serpent,” “serpent végétal,” “serpent gourd,” “club gourd,” “snake cucumber,” “snake melon,” “melon serpent,” “haricot serpent,” “concombre serpent,” “patole,” “patola,” “Chichinda,” “chichinga,” “padwal,” “Chinese cucumber,” and the relevant *Trichosanthes*, *Lagenaria*, *Luffa*, and *Benincasa* taxa. No exact owner was found in the active references, forms, or 75 legacy candidates. The proposed reference ID is absent from active and legacy IDs.

There is no matching ingredient-form row, no ledger record keyed by ingredient-ref-snake-gourd, and no exact matching ingredient row in the 114 manifest recipes. The full recipe scan matched 0 of 1,123 rows using the scientific name, proposed display and aliases, regional spellings, and related gourd names. This means no demand in the bundled corpus, not no demand outside it.

The prior coordinator review, wp03-gourds-okra-identity-coordinator-review-20261009.md, proposed snake gourd / courge serpent provisionally and left the French label open because it lacked Québec evidence. The integration note, batches/wp03-gourds-okra-identity-integration-20261009/README.md, records that same gate. Those six integrated neighboring identities remain separate. The earlier proposal’s snake-gourd source entries S19–S21 were not added to the current ledger; the refreshed sources below use a new, unique ID range. The current ledger does contain the OQLF bottle-gourd evidence under ingredient-ref-bottle-gourd; the OQLF ambiguity is considered here without changing that active row.

The new proposed source IDs WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S01 through -S12 are distinct from one another and absent from the 3,419 current ledger source IDs. The new reference ID is also absent from all active and legacy identities.

## Product and terminology boundaries

| Name or product | Source-bounded finding | Disposition |
|---|---|---|
| Snake gourd / courge serpent | *T. cucumerina* is the accepted species. The immature fruit of the cultivated vegetable form is used as food. The Québec seed listing uses the bilingual pair for cultivar ‘Chichinda’. [S01–S07] | Accept this one narrow identity and use the local French display. |
| *T. cucumerina* var. *anguina* | Kew treats this name as a synonym of the accepted *T. cucumerina* subsp. *cucumerina*. EPPO and seed catalogs still use the older variety name for cultivated material. [S02, S04, S08] | Record as a taxonomic/product-name note; do not create a separate reference. |
| Edible snake gourd | EPPO lists this English name for the cultivated variant. [S04] | Use as the sole English alias; retain the explicit edible qualifier. |
| Serpent végétal | EPPO lists this as a French common name. [S03, S04] | Use as a French search alias only. It is not the Québec display. |
| Serpent gourd / club gourd | EPPO lists these English names for *T. cucumerina*, but the OQLF’s 1995 *gourde* entry lists “snake gourd” and “serpent gourd” as associated English terms beneath *Lagenaria siceraria*. The OQLF page is not a direct *Trichosanthes* definition, but it demonstrates cross-source ambiguity. The active bottle-gourd record has no such aliases. [existing ledger source WP03-L-GOURDS-OKRA-IDENTITY-20261009-S08; S03] | Keep out of the default alias arrays and do not copy them to bottle gourd. |
| Snake cucumber / concombre serpent; haricot serpent | These are source-attested regional names, including in IAC’s New Caledonian description. They are not used by the Québec seed listing and can be read as cucumber or bean names in other contexts. [S03, S06] | Retain as provenance only; do not activate as unscoped aliases. |
| Patole / patola | EPPO and IAC list patole with snake gourd, while the older IPPC import manual assigns French patole and related spellings to pointed gourd (*Trichosanthes dioica*). Kew’s MPNS lists patola across multiple *Luffa* and *Trichosanthes* species. These names can identify separate regional products. [S06, S11, S12] | Do not use as aliases. Keep pointed gourd and other regional products separate. |
| Chichinda / chichinga; padwal | These transliterations occur in international botanical and seed sources. The Québec listing uses ‘Chichinda’ as a named seed cultivar, not as a generic food label. [S03, S04, S07] | Keep cultivar and regional spellings in evidence only; do not make them generic aliases. |
| Snake melon / melon serpent | Québec’s official field-vegetable list places melon serpent under true melons (*Cucumis melo*), not *Trichosanthes*. [S10] | Do not alias to snake gourd. |
| Chinese cucumber / Chinese snake gourd | Codex assigns Chinese cucumber to *Trichosanthes kirilowii*, a distinct taxon. [S05] | Keep separate. |
| Japanese snake gourd | Codex lists a Japanese serpent gourd as a separate *Trichosanthes* product, historically named *T. ovigera*. [S05] | Keep separate; do not use the generic snake-gourd reference for it without separate review. |
| Pointed gourd | *T. dioica* is a distinct commodity from *T. cucumerina*. Codex separates the species, and the IPPC manual maps several names shared with snake-gourd sources, including patole, to pointed gourd. [S05, S11] | Do not merge or alias. This review does not add a pointed-gourd row. |
| Bottle, winter, and ridge gourds | The live rows are ingredient-ref-bottle-gourd (*Lagenaria siceraria*), ingredient-ref-winter-melon (*Benincasa hispida*), and ingredient-ref-ridge-gourd (*Luffa acutangula*). Their species and products differ from *T. cucumerina*. The OQLF bottle-gourd cross-reference is the only reviewed source-level ambiguity involving the English display term. | Preserve all three existing owners and their current aliases; do not merge them into snake gourd. |
| Mature fruit, leaves, shoots, seeds, and preserved products | IAC says the immature green fruit is cooked as a vegetable; the mature fruit changes color and becomes fibrous and bitter, and it separately describes culinary use of mature pulp, leaves, young shoots, and seeds. [S06] | This identity covers only the cultivated immature fruit. Review other stages, plant parts, and preserved products separately if recipe demand appears. |

## Exact proposed records

These are proposal values only. No catalog or ledger JSON was changed.

### Ingredient reference

~~~json
{
  "id": "ingredient-ref-snake-gourd",
  "nameFr": "courge serpent",
  "nameEn": "snake gourd",
  "aliasesFr": [
    "serpent végétal"
  ],
  "aliasesEn": [
    "edible snake gourd"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
~~~

### Research-ledger record

~~~json
{
  "recordId": "ingredient-ref-snake-gourd",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S01",
      "url": "https://powo.science.kew.org/taxon/294175-1",
      "title": "Royal Botanic Gardens, Kew, Plants of the World Online, Trichosanthes cucumerina L.",
      "accessedOn": "2026-10-11",
      "locator": "Accepted species and taxonomy sections.",
      "supports": "Supports Trichosanthes cucumerina L. as the accepted species and its placement in Cucurbitaceae. This taxonomic backbone does not by itself establish food use or a local common name.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S02",
      "url": "https://powo.science.kew.org/taxon/60456741-2",
      "title": "Royal Botanic Gardens, Kew, Plants of the World Online, Trichosanthes cucumerina var. anguina",
      "accessedOn": "2026-10-11",
      "locator": "Synonym section.",
      "supports": "Supports treating Trichosanthes cucumerina var. anguina as a synonym of the accepted T. cucumerina subsp. cucumerina, rather than as a separate accepted species or catalog identity.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S03",
      "url": "https://gd.eppo.int/taxon/TTHCU",
      "title": "EPPO Global Database, Trichosanthes cucumerina (TTHCU)",
      "accessedOn": "2026-10-11",
      "locator": "Preferred name, cultivated-as-vegetable note, and common-name list.",
      "supports": "Supports T. cucumerina as a vegetable crop and records snake gourd, serpent gourd, club gourd, wild snake gourd, concombre serpent, couleuvre végétale, patole, and serpent végétal as common names. This multilingual list is evidence of usage, not a ruling that every name is safe as a Québec alias.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S04",
      "url": "https://gd.eppo.int/taxon/TTHCA",
      "title": "EPPO Global Database, Trichosanthes cucumerina var. anguina (TTHCA)",
      "accessedOn": "2026-10-11",
      "locator": "Cultivated-variant note and common-name list.",
      "supports": "Supports edible snake gourd as an English common name and courge serpent and serpent végétal as French names for the cultivated variant. EPPO notes that some sources treat the variant and species as synonyms.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S05",
      "url": "https://www.fao.org/fao-who-codexalimentarius/sh-proxy/fr/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FMeetings%252FCX-718-48%252FReport%252FREP16_PRf.pdf",
      "title": "Codex Alimentarius, REP16/PR, Appendix IX, proposed revision of the food-and-feed classification for cucurbit fruiting vegetables",
      "versionOrDate": "2016",
      "accessedOn": "2026-10-11",
      "locator": "Appendix IX, Group 011, commodity code VC 0430 and neighboring Trichosanthes entries.",
      "supports": "Lists Serpent gourde as Trichosanthes cucumerina, with T. anguina as a synonym, and separates pointed gourd (T. dioica), Chinese cucumber (T. kirilowii), and Japanese serpent gourd (T. ovigera). This was a proposed classification revision; use it for source-bounded commodity distinctions, not as a current Québec retail-label standard.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S06",
      "url": "https://www.agripedia.nc/ressources-vegetales/plantes-alimentaires/legumes/courge-serpent",
      "title": "Institut agronomique néo-calédonien, Agripedia, Courge serpent",
      "versionOrDate": "Page updated 2026-08-14; article published 2024-11",
      "accessedOn": "2026-10-11",
      "locator": "Generalities, identity, names, and culinary-use sections.",
      "supports": "Supports the French name courge serpent for T. cucumerina and the culinary scope: the immature fruit is cooked and eaten as a vegetable, while the mature fruit changes color and becomes fibrous and bitter. It also names leaves, young shoots, seeds, and mature pulp as separate uses; it supplies no household measure or conversion.",
      "sourceKind": "extension"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S07",
      "url": "https://www.pepiniere.ca/collections/semences-de-legumes?page=2",
      "title": "Pépinière.ca, Québec French-language vegetable-seed catalog",
      "versionOrDate": "2026 seed catalog",
      "accessedOn": "2026-10-11",
      "locator": "Product listing for Courge serpent ‘Chichinda’ bio.",
      "supports": "Supports the current French Québec-market seed-catalog label courge serpent for the named Chichinda cultivar. A seed listing establishes local naming, not prevalence or labeling of fresh produce.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S08",
      "url": "https://www.pepiniere.ca/en/products/courge-serpent-chichinda-bio",
      "title": "Pépinière.ca, Chichinda snake gourd seed listing",
      "versionOrDate": "2026 seed catalog",
      "accessedOn": "2026-10-11",
      "locator": "English product title, botanical name, and young/tender-fruit description.",
      "supports": "Supports the English display snake gourd for the same Chichinda seed cultivar and identifies T. cucumerina. The product is seed, so its name does not establish fresh-produce shelf prevalence.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S09",
      "url": "https://www.pepiniere.ca/",
      "title": "Pépinière.ca, Québec garden-centre retailer",
      "accessedOn": "2026-10-11",
      "locator": "Retailer locations and contact section.",
      "supports": "Identifies the retailer’s Laval and Brossard, Québec locations, bounding the seed-catalog label evidence to an actual Québec retailer.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S10",
      "url": "https://www.publicationsduquebec.gouv.qc.ca/fileadmin/gazette/pdf_encrypte/lois_reglements/2023F/82132.pdf",
      "title": "Éditeur officiel du Québec, Liste des légumes de champ, Gazette officielle du Québec",
      "versionOrDate": "2023-12-27",
      "accessedOn": "2026-10-11",
      "locator": "Annex I, p. 6325, entry for melon véritable.",
      "supports": "Places melon serpent under Cucumis melo, not Trichosanthes. This is a Québec regulatory crop list, not an ingredient label or recipe source.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S11",
      "url": "https://www.ippc.int/static/media/uploads/resources/fresh_fruits_and_vegetables_import_manual.pdf",
      "title": "International Plant Protection Convention, Fresh Fruits and Vegetables Import Manual, List of Approved Names",
      "accessedOn": "2026-10-11",
      "locator": "Entries for edible snake gourd and pointed gourd.",
      "supports": "Separates Trichosanthes anguina/T. cucumerina from pointed gourd T. dioica and assigns patole and related spellings to pointed gourd in this manual. The naming conflict is sufficient reason to keep patole out of a global alias array.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S12",
      "url": "https://mpns.science.kew.org/mpns-portal/drugDetail?drugName=patola&filter=&fuzzy=true&nameType=all&query=PEAD",
      "title": "Royal Botanic Gardens, Kew, Medicinal Plant Names Services, patola",
      "accessedOn": "2026-10-11",
      "locator": "Accepted-name results for the common name patola.",
      "supports": "Shows patola associated with multiple accepted Luffa and Trichosanthes taxa, including Luffa acutangula, Luffa aegyptiaca, T. dioica, and T. cucumerina. It is lexical-ambiguity evidence, not a culinary or retail standard.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Accept snake gourd / courge serpent as the cultivated immature-fruit food identity of Trichosanthes cucumerina. Kew accepts the species and treats var. anguina as a synonym under the species; IAC documents immature fruit cooked as a vegetable; and a Québec retailer provides the matching bilingual Chichinda seed-cultivar labels. Use edible snake gourd and serpent végétal as the only proposed aliases. Keep source-conflicted or regional alternatives out of the default aliases, including patole/patola, serpent gourd, club gourd, snake cucumber, and melon serpent. Add no form, measurement, conversion, substitution, or recipe link.",
      "sourceIds": [
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S01",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S02",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S03",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S04",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S05",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S06",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S07",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S08",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S09",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S10",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S11",
        "WP03-L-SNAKE-GOURD-QUEBEC-IDENTITY-20261011-S12"
      ]
    }
  ]
}
~~~

## Limits

This review resolves the snake-gourd identity and the source-supported bilingual display. It does not resolve fresh-produce prevalence in Québec, regional usage outside the sources listed here, or whether mature fruit and other plant parts deserve separate ingredient rows. The Québec seed listing supports the local name for a cultivar, while IAC supports the culinary use of immature fruit; neither supplies recipe measurements, conversions, yields, or substitution ratios. No bundled recipe demand or integration is proposed.
