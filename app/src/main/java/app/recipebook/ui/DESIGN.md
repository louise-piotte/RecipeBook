# ui Design

This layer owns Compose rendering, screen-local state, and visual system code.

## Responsibilities
- Render domain models into phone-focused Android UI.
- Hold ephemeral screen state such as filters, dialogs, and editor inputs.
- Provide theme primitives shared by recipe screens.

## Subpackages
- `recipes`: the actual product screens and recipe-focused reusable UI bits.
- `theme`: color, typography, and theme setup.

## Boundaries
- UI should observe repository/domain flows and send intents back through repository APIs or activity navigation.
- Validation that protects stored data should still live in lower layers even if UI also gives immediate feedback.

## Maintenance Notes
- Keep reusable UI helpers close to the recipe screens until a truly broader design system emerges.
- Favor compact phone-first layouts consistent with repo UI guidance.
