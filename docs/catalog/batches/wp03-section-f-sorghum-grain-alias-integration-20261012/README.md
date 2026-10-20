# Grain sorghum aliases and CNF observations — 2026-10-12

Added `sorgho en grains` and `sorgho en grain` as French aliases for the existing `grain sorghum / sorgho à graine` identity. The display pair, `GRAIN_AND_CEREAL` category, null density, and empty unit mappings remain unchanged. The Codex food standard supports the plural label for whole or decorticated food grain; FAO AGROVOC supports the singular term. [Codex](https://www.fao.org/input/download/standards/57/CXS_172f.pdf), [AGROVOC](https://agrovoc.fao.org/browse/agrovoc/fr/page/c_7249)

Recorded Health Canada's CNF 2015 food-code 4432 portions as ledger-only observations: 100 mL = 81.2 g, 250 mL = 202.9 g, and 1 serving = 20.0 g. The CNF description does not specify preparation state or packing. These values do not set a density, unit mapping, form, conversion, yield, recipe link, or substitution. Health Canada identifies the cited file as the 2015 CNF and says it will not be updated while work proceeds toward CNF 2026. [CNF portions](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4432), [Health Canada guide](https://food-nutrition.canada.ca/cnf-fce/help-aide)

The source review also kept Québec retailer wording `grain de sorgho` out of aliases because the listed product is lightly ground for porridge. [Kabeya](https://www.lesalimentskabeya.com/nos-produits.php)

The manifest-listed corpus has no matching sorghum-grain demand or links: 114 recipes and 1,123 ingredient rows. The package contains 1,298 references and 98 forms; the ledger has 1,606 records, 5,809 source entries, and 4,832 distinct source IDs. Package validation and normalization, generated-catalog freshness, ledger validation, exact-key ownership, corpus, encoding, and whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data.

Review: [proposal](../../proposals/wp03-section-f-sorgho-en-grains-french-alias-boundary-review-20261012.md).
