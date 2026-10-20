# WP05 Section X — Sambal Bajak / Badjak spelling and identity review (R214)

Date: 2026-10-16. Status: proposal only. Scope: the unresolved “badjak” item in the open sambal checklist in docs/RecipeBook-global-ingredient-catalog-plan.txt. This review decides only whether sambal bajak and sambal badjak should share one identity.

## Recommendation

**Add one identity-only SAUCE_AND_CONDIMENT reference with “sambal bajak” as the English and French display, and “sambal badjak” as the only English and French alias. Do not create a second Badjak identity.** Use the current Indonesian spelling as the canonical display; preserve the Badjak spelling found in Québec recipe usage and Canadian retail listings as a searchable spelling variant.

The current Indonesian Ministry of Tourism identifies sambal bajak as a cooked Banten sambal. A current Conimex product guide and Canadian retail listings use Badjak for a fried/cooked chili condiment with onion and garlic. Québec’s Télé-Québec recipe uses the Badjak spelling for a fried, caramelized sambal. Indonesia’s language authority explains that the older “dj” spelling corresponds to current “j”. **Inference:** these sources support treating Badjak as a spelling variant for the named style; none directly declares the food names synonymous. They support neither one shared formula nor a global sambal equivalence.

| Proposed seed field | Recommendation |
| --- | --- |
| ID | ingredient-ref-sambal-bajak (new; no active, form, or legacy owner found) |
| English display | sambal bajak |
| Québec French display | sambal bajak |
| English aliases | sambal badjak |
| French aliases | sambal badjak |
| Category | SAUCE_AND_CONDIMENT |
| Forms | None |
| Default density / unit mappings | null / empty |

Do not add “sambal des pirates” as an alias. Télé-Québec uses it as a parenthetical subtitle in one recipe title, but the reviewed retail and product sources use the borrowed culinary name. Also keep bare “sambal,” “sauce au piment,” “chili sauce,” “chili paste,” “sambal sauce,” and bare “badjak” out of aliases.

## Current ownership and boundary

The 2026-10-16 bundled package has 1,595 ingredient references, 122 forms, 61 legacy-import candidates, and 114 recipe files / 1,123 ingredient rows. The active sambal references are ingredient-ref-sambal-oelek and ingredient-ref-sambal-matah; the Oelek row has only sambal ulek as its spelling alias. No active reference, form, or legacy candidate owns sambal bajak, sambal badjak, bajak sambal, or badjak sambal. The proposed ID is new. The ledger currently mentions Bajak only as a regional boundary in the Oelek evidence; that mention is not an identity record.

The earlier [WP05 Southeast Asian-condiment proposal](wp05-southeast-asian-condiments.md) left “badjak” unresolved/inactive because its direct official spelling evidence showed only “bajak.” This review revisits that hold with the additional orthographic, Québec recipe-name, and Canadian product evidence above. The broad sambal checklist in the plan remains open pending integration; this proposal does not mark it complete.

| Neighbor | Keep separate because |
| --- | --- |
| Sambal oelek / sambal ulek | OQLF defines this as crushed hot peppers, generally with salt and vinegar. Conimex distinguishes its unfried Oelek product from its fried Badjak product. Oelek remains the existing exact identity. |
| Sambal matah | This is the separately integrated Balinese fresh/raw style. It is not an alias for the cooked Banten style. |
| Sambal terasi and terasi paste | Sambal terasi is a separate compound that uses fermented shrimp paste; terasi is its ingredient, not another name for Bajak. No Bajak source makes terasi mandatory across products. |
| Sambal manis, sambal brandal, and other named products | Canadian and manufacturer listings show these as separately named products. Shared “sambal” wording does not make them aliases. |

The proposed alias is supported by the orthographic relation and market use: the official Indonesian spelling guide gives “dj” → “j”; the Ministry’s current Indonesian article names the cooked Banten style Sambal Bajak; Conimex and Canadian sellers use Sambal Badjak for fried products; and Télé-Québec uses Sambal Badjak for its Québécois recipe. The Canadian Conimex ingredients and Télé-Québec recipe differ, so retain product and recipe formulas as source-specific evidence only. Do not normalize them into one recipe or add a “fried” form.

## Exact bilingual terms and picker behavior

| Query / term | Recommendation and expected phrase-first result |
| --- | --- |
| sambal bajak | Canonical English and French term; one result, the proposed identity. |
| sambal badjak | Exact English and French spelling alias; one result, the proposed identity. |
| bajak or badjak | Each is a complete word in the canonical or alias phrase, so the phrase-first picker should return the proposed row without separate bare-word aliases. |
| sambal | Broad family query. The live catalog currently returns Oelek and Matah because their canonical names contain this word; after integration it should also return Bajak. It should remain a multiple-result search, not an alias that selects one style. |
| sambal oelek / sambal matah | Continue to return only their existing exact identities. |
| sambal des pirates | Do not activate from one Québec recipe subtitle alone. |
| sauce au piment, chili sauce, chili paste, sambal sauce | Do not activate as aliases; these are broader descriptions or families. |

The current search implementation prefers complete normalized word phrases before partial matching. A full “sambal badjak” query therefore stays on this identity once the scoped alias is added, while a one-word “sambal” query intentionally surfaces multiple named sambal references. The OQLF entry’s elliptical use of sambal describes Oelek, not every regional sambal, so it must not be copied onto Bajak.

## Recipe demand, measures, and substitution limits

| Area | Finding and recommendation |
| --- | --- |
| Bundled recipe demand | A text scan of all 114 manifest-listed recipe files and 1,123 ingredient rows found no sambal, bajak, or badjak mention. Add no recipe link and do not infer demand from the Satay recipe or other regional-sauce rows. |
| Québec recipe evidence | Télé-Québec has one recipe titled “Sambal Badjak (Sambal des pirates)”. Its one-recipe quantities and frying/caramelizing method establish local name use and one recipe-specific preparation only. They do not establish a reusable recipe link or ingredient conversion. |
| Package amount | Canadian listings show a 200 g retail jar. This is a product package size, not a household measure, ingredient density, or package-yield rule. |
| Density and mappings | No class-wide density or kitchen unit mapping is supported. Keep density null and unit mappings empty. |
| Forms and conversions | Add no form, mass-volume conversion, or crosswalk to raw chili, Oelek, Matah, or terasi paste. Product recipes vary and the current form model does not need to encode style-specific formulas. |
| Substitution | Add no active substitution. Télé-Québec’s recipe permits trassi or fish sauce in that recipe and explicitly says the result differs; keep this as source-specific recipe wording, not a generic rule. Do not substitute Bajak for Oelek, Matah, terasi paste, fish sauce, or generic chili sauce. |

## Source register and URL audit

New R214 source IDs use the namespace WP05-SAMBAL-BAJAK-R214-20261016; every URL below was checked online on 2026-10-16. The two reused IDs point to URLs already in the ledger and should not be duplicated. In particular, the Indonesian Ministry page was directly readable in this review, while its existing ledger source note records an earlier HTTP 502 result; refresh that existing source record during integration instead of registering the URL twice.

| Source ID | URL state | Source and scope |
| --- | --- | --- |
| WP05-SAMBAL-BAJAK-R214-20261016-S01 | New URL | Badan Pengembangan dan Pembinaan Bahasa, [Seri Penyuluhan Bahasa Indonesia: Ejaan](https://badanbahasa.kemendikdasmen.go.id/resource/doc/files/Seri_Penyuluhan_Bahasa_Indonesia_Ejaan1.pdf). The Indonesian language authority gives the historical dj → j spelling change. Supports why badjak can be a spelling variant of bajak; it does not define the food identity. |
| WP05-SAMBAL-BAJAK-R214-20261016-S02 | New URL | Conimex, [Wat voor sambals zijn er?](https://conimex.nl/wat-voor-sambals-zijn-er). The manufacturer describes its Badjak as mild and spiced, with ginger, garlic, and coconut, and distinguishes it from unfried Oelek and named Manis/Brandal products. Manufacturer-specific taxonomy and formulation context only. |
| WP05-SAMBAL-BAJAK-R214-20261016-S03 | New URL | Télé-Québec Cuisinez, [Sambal Badjak (Sambal des pirates)](https://cuisinez.telequebec.tv/recettes/6393/sambal-badjak-sambal-des-pirates). Direct Québec French recipe-name evidence and one fried/caramelized household recipe. The parenthetical “Sambal des pirates” is not promoted to an alias. Its trassi/fish-sauce option is recipe-specific and described as giving a different result. |
| WP05-SAMBAL-BAJAK-R214-20261016-S04 | New URL | Holland Store, Toronto, [Conimex Sambal Badjak, 200 g](https://hollandstore.ca/products/conimex-sambal-badjak). Current Canadian product listing; its product text calls it fried sambal and gives one Conimex ingredient declaration, including chili, fried onion, sugar, oil, coconut, vinegar, ginger, garlic, and shrimp powder. Product-specific, not a class recipe. |
| WP05-SAMBAL-BAJAK-R214-20261016-S05 | New URL | Dutch Groceries, [Conimex Badjak Sambal, 200 g](https://dutchgroceries.ca/products/conimex-badjak-sambal-200g). Canadian retail listing with a Montreal-area pickup point shown. The item is listed as backordered; this is evidence of a Québec-facing listing and spelling, not verified on-shelf stock. |
| WP05-SAMBAL-OELEK-20261011-S05 | Reuse existing ID and exact URL | Indonesia Travel / Ministry of Tourism, [10 Sambal Khas Indonesia](https://www.indonesia.travel/id/id/travel-ideas/gastronomy/10-sambal-khas-nusantara-yang-wajib-dicoba). Current Indonesian page names Sambal Bajak as a cooked Banten sambal and describes one regional version. The existing source ID is already registered under the Oelek record; reuse and refresh its stale access note. |
| WP05-SAMBAL-OELEK-20261011-S01 | Reuse existing ID and exact URL | OQLF, [sambal oelek](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361603/sambal-oelek). Reuse for the Québec terminology boundary: OQLF lists sambal oelek and sambal ulek and notes that sambal can be used elliptically for Oelek. It does not standardize Bajak/Badjak or authorize bare sambal as a global alias. |

URL audit against the current ledger and WP05 proposal archive found the Ministry and OQLF URLs already registered under the reused IDs above. The five R214 URLs are new to those sources. No existing source ID is reassigned to a different URL. The R214 ID namespace and proposed reference ID were not present in the live package or ledger at review time.

## Checklist status

This resolves only the open sambal bajak/badjak identity-and-spelling question with one proposed row and one narrow spelling alias. It does not complete the combined sambal checklist or Section X/WP05. Other sambal types, fermented-paste candidates, the red-paste provenance hold, and broader regional coverage remain under their existing owners. No canonical catalog, ledger, plan, roadmap, generated file, or test was changed in this proposal-only review.
