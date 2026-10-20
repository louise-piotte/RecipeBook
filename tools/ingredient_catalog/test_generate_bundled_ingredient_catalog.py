import unittest

from generate_bundled_ingredient_catalog import REFERENCES_PER_CHUNK
from generate_bundled_ingredient_catalog import reference_chunks
from generate_bundled_ingredient_catalog import render_catalog


def make_reference(index):
    return {
        "id": f"ingredient-ref-test-{index}",
        "nameFr": f"ingrédient de test {index}",
        "nameEn": f"test ingredient {index}",
        "category": "OTHER",
        "aliasesFr": [],
        "aliasesEn": [],
        "defaultDensity": None,
        "unitMappings": [],
        "updatedAt": "2026-10-16T00:00:00Z",
    }


class BundledIngredientCatalogGeneratorTest(unittest.TestCase):
    def test_reference_chunks_stay_within_jvm_safe_group_size(self):
        references = [make_reference(index) for index in range(REFERENCES_PER_CHUNK * 2 + 1)]

        chunks = reference_chunks(references)

        self.assertEqual([REFERENCES_PER_CHUNK, REFERENCES_PER_CHUNK, 1], [len(chunk) for chunk in chunks])
        self.assertEqual(references, [reference for chunk in chunks for reference in chunk])

    def test_rendered_catalog_keeps_all_references_in_separate_helpers(self):
        references = [make_reference(index) for index in range(REFERENCES_PER_CHUNK + 1)]

        generated = render_catalog(references)

        self.assertIn("private fun referenceChunk00(): List<IngredientReference> = listOf(", generated)
        self.assertIn("private fun referenceChunk01(): List<IngredientReference> = listOf(", generated)
        self.assertEqual(len(references), generated.count("IngredientReference("))
        self.assertIn("addAll(referenceChunk00())", generated)
        self.assertIn("addAll(referenceChunk01())", generated)


if __name__ == "__main__":
    unittest.main()
