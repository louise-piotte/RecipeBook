# WP05 Section X follow-up — Kapi shrimp paste and ube halaya

Owner: /root/wp05_southeast_asia. Reviewer: coordinator integration review completed for Kapi and ube halaya. Status: partially accepted on 2026-10-09; both identities are integrated. Scope: a small follow-up tranche from Section X of docs/RecipeBook-global-ingredient-catalog-plan.txt. The wider Section X and WP05 remain open.

## Input revision and inspected state

User-confirmed checkout: /home/louise/RecipeBook. Input revision: HEAD 0caaef893ebd9e12443c62fdbbb6a5a328c53fc4. The existing worktree was already extensively modified; this packet preserves that state. The target file did not exist at inspection.

| Live input | SHA-256 | State |
|---|---|---|
| app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 467d037a74dd75efd97f46eb0edb8f311c492ff0fe6680065d7f9ff21f1ff37 | 387 references |
| app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a | 16 forms |
| docs/catalog/research-ledger.v1.json | 47282f26ef2a540c7f02760aae06aec91fd0410f30987acf8ac3878a9a27c5b5 | current evidence ledger |
| docs/catalog/ingredient-catalog-workflow.md | ab30fda5d11c93865fd0fa08ef2662cb1e9b775247d42da29138d4a8d18d2c3d | workflow contract |
| docs/RecipeBook-global-ingredient-catalog-plan.txt | f1fd28570fe8f15dbcea68ef813452d9e36eaa393df16ee1d06e422408bc4b84 | Section X unchanged in this packet |

The live references contain fish sauce, oyster sauce, sriracha sauce, generic curry paste, and red curry paste. The forms file has no matching Kapi or ube form. Exact Kapi and ube identities/aliases were not found in the live references or forms. Fish sauce, oyster sauce, and sriracha are excluded as already integrated. Tamarind paste is excluded to avoid duplicating its proposal in docs/catalog/proposals/wp05-south-central-asia-mena.md. The earlier Southeast Asian packet already proposes the other covered additions; its prior Kapi disposition was unresolved because romanized Kapi evidence had not been located. This packet upgrades only that candidate with direct standard and Canadian product evidence. Ube halaya is a new candidate not covered by the prior proposal.

## Candidate disposition and changed-record proposal

These are proposed reference rows only. Stable IDs and category placement remain subject to integration review.

| Proposed ID | EN display name | fr-CA display name | Category | Aliases proposed | Disposition and identity boundary |
|---|---|---|---|---|---|
| ingredient-ref-kapi-shrimp-paste | kapi | pâte de crevettes Kapi | SAUCE_AND_CONDIMENT | EN: none; FR: none | Accepted as a distinct Thai Kapi identity. English display is only `kapi` so a broad `shrimp paste` query is not activated; the exact Canadian French source wording is retained. The Thai standard defines Kapi as fermented krill and/or shrimp with salt. Keep distinct from fish sauce/patis, generic shrimp paste, belacan, terasi, bagoong alamang, and sambal terasi. No form or numeric/substitution data is supported. |
| ingredient-ref-ube-halaya | ube halaya (purple yam jam) | confiture d’ube (ube halaya) | SAUCE_AND_CONDIMENT, provisional by analogy with the existing raspberry jam reference | EN: `purple yam jam`; FR: `confiture d’ube` (both added after independent source review) | New identity for prepared Filipino purple-yam jam/spread. The Philippine standard supports purple yam jam (halaya) and a `Purple Yam Jam` label. Distinguish prepared jam from fresh/frozen ube, purple-yam powder, extracts/flavourings, and purple sweet potato or taro spreads. The French wording is descriptive and remains provisional pending independent Québec review; no bilingual Canadian product label was found. Keep `ube jam` inactive as a broad alias because product use varies by market. |

## Unresolved and excluded candidates

- Keep ngapi, unqualified bagoong, and other unnamed fish/shrimp ferments unresolved until source evidence distinguishes species, product identity, and preparation. Do not cross-alias them to Kapi, belacan, terasi, or fish sauce.
- Calamansi preparations remain unresolved because product evidence found in the prior packet did not establish a single consistent juice/preparation form. Pandan extract/essence/paste also remains unresolved because no authoritative prepared-product formulation was verified.
- Rendang and satay paste, other regional forms, and the broader country sweep are unchanged from the earlier Southeast Asian proposal. No new identity, alias, form, or completion claim is made here.
- The canonical curry-paste references and the existing integrated fish sauce, oyster sauce, and sriracha records are not re-proposed. Tamarind paste remains in the South/Central Asia–MENA packet and is not duplicated here.

## Measurement and substitution state

No density, unit-mapping, mass/volume conversion, package-yield value, or substitution ratio is proposed for either candidate. Source packaging, product ingredients, and recipe usage do not establish an exact-form kitchen conversion or substitution ratio. No ingredient-form row is proposed. Keep all numeric data unavailable unless a later source gives an exact form, unit convention/context, and supported value.

## Direct source evidence

All sources below were accessed on 2026-10-08.

1. Thailand Industrial Standards Institute (TISI), “Thai Community Product Standard TCPS 61/2561: Shrimp Paste, Kapi” (2018). The official standard title identifies shrimp paste as Kapi; its scope covers krill and/or shrimp, and its definition describes fermentation with salt, draining, drying, grinding, and further fermentation. https://tcps.tisi.go.th/pub/tcps0061_61%28%E0%B8%81%E0%B8%B0%E0%B8%9B%E0%B8%B4%29.pdf
2. D.J. Distributing, “PANTAI SHRIMP PASTE (KAPI) 48X100G.” Canadian importer listing identifies the Pantai product by both shrimp-paste and Kapi names. https://djdist.ca/PANTAI-SHRIMP-PASTE-KAPI-48X100G-p147671399
3. Haisue, “Trachang - Shrimp Paste (Kapi) 400g.” Canadian retailer listing identifies Kapi, product of Thailand, and shrimp and salt as ingredients. https://haisue.ca/products/trachang-shrimp-paste-kapi-400g
4. Unilever Food Solutions Canada, “Cari Vert Thaï aux Fruits de Mer.” French Canadian recipe page names the ingredient “Pâte de crevettes Kapi.” This supports the French wording, not a bilingual retail label. https://www.unileverfoodsolutions.ca/fr/recipe/cari-vert-thai-aux-fruits-de-mer-R0073075.html
5. Philippine Food and Drug Administration, “Philippine National Standards.” The FDA listing includes PNS/FDA 24:2010, “Purple yam (ube) jam (halaya) – Specification.” Direct opening of the FDA index returned 403 in this review; the indexed official listing confirmed the title. https://www.fda.gov.ph/philippine-national-standards/
6. PNS/FDA 24:2010, “Purple Yam (Ube) Jam (Halaya) – Specification,” copy of the standard. Its title and scope identify thermally processed purple-yam jam (halaya). This is a public copy of the standard, not the official FDA host. https://archive.org/download/pns.24.2010/pns.24.2010.pdf
7. Walmart Canada, “Buenas Ube Halaya Filipino Purple Yam Spread.” The product-record URL uses this name, while the visible page heading was malformed, Buenas purp;e yam spread; the page lists its product ingredients. The item was out of stock when accessed. Treat it as supporting retail evidence, not a verified bilingual package label. https://www.walmart.ca/en/ip/Buenas-Ube-Halaya-Filipino-Purple-Yam-Spread/6000197099320
8. Oobé, “Ube Halaya : la confiture violette philippine (recette maison).” French-language product/recipe source describes ube halaya as a Filipino jam and uses “confiture d’ube”; this is descriptive wording evidence, not a Canadian language authority. https://oobe.fr/blogs/actualites/ube-halaya-recette

## Coordinator review and integration result

The coordinator rechecked the live references, forms, ledger, aliases, and all 114 bundled recipe ingredient lines. No Kapi or ube halaya mentions were found. The Kapi ID is new; it is recorded with no aliases because generic shrimp paste would over-broaden search. The English canonical label is `kapi`; the French label is the source-attested `pâte de crevettes Kapi`. The Thai standard and Canadian sources support its product boundary.

Kapi was integrated in `../batches/wp05-kapi-shrimp-paste.md`; validation results are recorded there. Ube halaya was independently reviewed in `wp05-ube-halaya-review-20261009.md` and integrated as `ingredient-ref-ube-halaya` with a provisional descriptive French display and Québec-language review still open. The review accepts only `purple yam jam` and `confiture d’ube` as aliases, and keeps the Canadian retailer's `ube jam` SKU name inactive as a broad alias. No Kapi or ube forms, density, measurements, conversions, package yields, or substitutions were added. Ube's package, unit-test, instrumentation, and live-picker results are recorded in `../batches/wp05-ube-halaya.md`.
