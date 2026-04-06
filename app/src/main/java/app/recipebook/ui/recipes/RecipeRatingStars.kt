package app.recipebook.ui.recipes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

internal enum class RecipeRatingOrientation {
    Horizontal,
    Vertical
}

private val RecipeRatingStarGold = Color(0xFFFFC107)

internal fun visibleStarCount(rating: Double?): Int = rating
    ?.roundToInt()
    ?.coerceIn(0, 5)
    ?: 0

@Composable
internal fun RecipeRatingStars(
    rating: Double?,
    orientation: RecipeRatingOrientation,
    modifier: Modifier = Modifier,
    ratingDescription: String? = null
) {
    val starCount = visibleStarCount(rating)
    if (starCount == 0) return

    val semanticsModifier = ratingDescription?.let { description ->
        modifier.semantics { stateDescription = description }
    } ?: modifier

    when (orientation) {
        RecipeRatingOrientation.Horizontal -> {
            Row(
                modifier = semanticsModifier,
                horizontalArrangement = Arrangement.spacedBy(1.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(starCount) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = null,
                        tint = RecipeRatingStarGold,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }

        RecipeRatingOrientation.Vertical -> {
            Column(
                modifier = semanticsModifier,
                verticalArrangement = Arrangement.spacedBy(0.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                repeat(starCount) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = null,
                        tint = RecipeRatingStarGold,
                        modifier = Modifier.size(11.dp)
                    )
                }
            }
        }
    }
}
