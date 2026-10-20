# WP02/WP03/WP04 R154 gap-review integration

Integrated 2026-10-15 after independent review of the three proposal-only R154 reviews.

## Decisions

- Added identity-only `black rice flour / farine de riz noir` as
  `ingredient-ref-black-rice-flour` in `FLOUR_AND_STARCH`. It is distinct from intact black rice,
  black glutinous rice, and the existing generic, white, brown, glutinous, roasted-red, and wild-rice
  flours. It has no aliases, forms, measures, mappings, conversions, yields, recipe links, or active
  substitutions. Purple Superfoods' 20–25% flour-replacement suggestion remains blocked and
  product-specific. The French display is attested on an Italian miller's French page and is a
  transparent fr-CA construction, not an OQLF-preferred term or verified Québec package title;
  independent Québec wording review remains open.
- Added identity-only `soft white wheat berries / grains de blé tendre blanc` as
  `ingredient-ref-soft-white-wheat-berries` in `GRAIN_AND_CEREAL`. It is separate from generic,
  hard-white, hard-red, and flour products. Season, Canadian class, and cultivar remain unassigned.
  The French display is a provisional construction informed by OQLF and Canadian Grain Commission
  terminology, not a verified Québec retail name; independent review remains open. No aliases, forms,
  measures, mappings, conversions, yields, recipe links, or substitutions were added.
- Held `kipper / hareng kipper` outside active references, forms, legacy mappings, and the research
  ledger. OQLF's 1983 definition is a split, cold-smoked herring product. The current Québec-facing
  A.C.E.M.A. PM-4199 listing does not identify species or smoke temperature/splitting, and Brunswick
  uses `Kippered` for sardines. Do not alias kipper to Atlantic or Pacific herring. No bundled recipe
  demand was found.

## Source review

Root independently checked the primary pages linked in the [WP02 black-rice-flour proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-r154-20261015.md),
the [WP03 soft-white-wheat proposal](../../proposals/wp03-section-f-next-grain-gap-review-r154-20261015.md),
and the [WP04 kipper proposal](../../proposals/wp04-section-p-next-seafood-gap-review-r154-20261015.md).

- Molino Peila names wholegrain black rice flour; Riseria Provera uses the French display `Farine de
  Riz Noir`; T&T's indexed Canadian listing names a 4 lb Juliang Organic Black Rice Flour product.
  Purple Superfoods describes its own semi-polished product as not made from short-grain sticky black
  rice, but the page is out of stock and shows an August 2025 best-before date. JETRO lists black and
  red rice flour separately. These sources establish a named product class and source-specific
  details, not a universal grade, cultivar, glutinousness, measure, or active substitution.
- Storehouse Foods names Soft White Wheat Berries, labels the item Product of Canada, and describes
  whole wheat. West Country Mills independently names Soft White Wheat Berries and describes cooking
  or milling it; its page showed Sold out. OQLF supports `blé tendre`; the Canadian Grain Commission
  names soft-white spring and winter classes separately. Neither seller assigns its product a season,
  class, or cultivar.
- The OQLF kipper entry defines a fatty herring split along the back and cold-smoked and lists
  `kipper`, `hareng kipper`, and `kipper de Newcastle` as preferred French terms; the entry was last
  updated in 1983. A.C.E.M.A.'s English and French PM-4199 pages show a 180 g Canadian smoked-herring
  SKU and source wording `hareng kipper canadien fumé`, but no scientific species or smoke process.
  Brunswick's current sardine page uses `Kippered` for sardine fillets. Health Canada's 75 g entry is
  specific to `Herring, Atlantic, kippered` and was not added as a reusable observation.

## Static verification

- Reference and seed-package normalization, package validation, generated-catalog freshness, and
  research-ledger schema/source linkage checks passed.
- Static picker projection confirms the new exact English and French displays resolve to their rows;
  broader rice-flour and wheat-berry searches gain the expected options. Kipper and its qualified
  terms remain absent, and existing herring searches remain unchanged.
- The 114 manifest-listed recipes and 1,123 structured ingredient rows contain no matching R154
  candidate terms or links. Recipe files and rows were not changed.
- UTF-8 without BOM, no mojibake, local links, and scoped whitespace checks passed.
- Final totals: **1,526 ingredient references**, **119 forms**, **1,871 ledger records**, **7,921
  source entries**, and **6,772 distinct source IDs**. The bundled corpus remains **114 recipes / 1,123
  ingredient rows**.

No tests were run. The catalog mutations add database JSON data, and the kipper decision changes only
documentation, under the current `AGENTS.md` rule.
