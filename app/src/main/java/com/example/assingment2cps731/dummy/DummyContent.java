package com.example.assingment2cps731.dummy;

import android.content.Context;
import android.media.Image;
import android.provider.ContactsContract;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("Recipe 1", "Sheet Pan Party Fajitas", " Ingredients \n" +
                "\n" +
                "2 tablespoons chili powder\n" +
                "\n" +
                "Kosher salt and freshly ground black pepper \n" +
                "\n" +
                "1 1/2 pounds baby bell peppers (12 to 15 peppers), halved, stemmed and seeded \n" +
                "\n" +
                "1 large yellow onion, halved and thinly sliced\n" +
                "\n" +
                "3 tablespoons extra-virgin olive oil\n" +
                "\n" +
                "10 ounces boneless, skinless chicken breasts, cut into thin strips\n" +
                "\n" +
                "10 ounces strip steak, cut into thin strips (see Cook's Note)\n" +
                "\n" +
                "10 ounces peeled and deveined medium shrimp, tails removed\n" +
                "\n" +
                "Juice of 1 lime, plus lime wedges, for serving\n" +
                "\n" +
                "16 flour tortillas, warmed\n" +
                "\n" +
                "Shredded Monterey Jack cheese, guacamole, hot sauce, salsa and sour cream, for serving\n" +
                "\n" +
                "Procedure/Directions\n" +
                "\n" +
                "1. Preheat the broiler to high. Line a rimmed baking sheet with foil.\n" +
                "\n" +
                "2. Combine the chili powder, 1 tablespoon salt and 1 teaspoon pepper in a small bowl. Put the peppers and onions on the lined baking sheet, drizzle with 2 tablespoons of the oil and season with half the chili powder mixture. Broil until the vegetables soften and begin to char, about 10 minutes. \n"+
                "\n" +
                "3.Meanwhile, put the chicken, beef and shrimp in 3 different bowls and toss each with 1 teaspoon of the remaining oil and a third of the remaining chili powder mixture. \n"+
                "\n" +
                "4.When the peppers and onions are softened and starting to char, about 10 minutes, lay the chicken, steak and shrimp in lines on top of the vegetables. Return the baking sheet to the broiler until the chicken, steak and shrimp are cooked through and starting to brown, 5 to 8 minutes depending on your broiler. Drizzle with lime juice and serve with the warmed tortillas, cheese, guacamole, hot sauce, salsa, sour cream and lime wedges.\n" +
                "\n"

                ));
        addItem(new DummyItem("Recipe 2", "Teriyaki-Glazed Chicken Sheet Pan Dinner", " \n" +
                "\n" +
                "4 skin-on chicken drumsticks (about 1 pound)\n" +
                "\n" +
                "3/4 pound (about 3 cups) fingerling potatoes, halved lengthwise\n" +
                "\n" +
                "3 tablespoons extra-virgin olive oil\n" +
                "\n" +
                "Kosher salt and freshly ground black pepper\n" +
                "\n" +
                "1 medium head broccoli, cut into small florets (about 4 cups)\n" +
                "\n" +
                "2 tablespoons purchased teriyaki glaze \n" +
                "\n" +
                "Procedure/Directions\n" +
                "1. Preheat the oven to 450 degrees F and line a rimmed baking sheet with parchment paper. Place the drumsticks on one side of the baking sheet, spacing them evenly apart. Place the potatoes on the other side of the baking sheet, leaving an empty space in the center for the broccoli. Drizzle the potatoes with 1 tablespoon of of the olive oil, and sprinkle with salt and pepper, tossing to evenly coat. Bake until the potatoes begin to soften and the drumsticks begin to cook and caramelize, 20 minutes. \n" +
                "\n" +
                "2. Remove the baking sheet from the oven and put the broccoli in the center. Drizzle the broccoli with the remaining 2 tablespoons of olive oil, and lightly sprinkle with salt and pepper, tossing with tongs to evenly coat. Brush the drumsticks with the teriyaki glaze on all sides. \n" +
                "\n" +
                "3. Return the baking sheet to the oven and roast until the broccoli and potatoes are tender and charred in spots and the drumsticks are completely cooked through and read an internal temperature of 160 degrees F, 20 to 25 minutes more. Divide chicken and vegetables between two plates and serve. \n"
                ));
        addItem(new DummyItem("Recipe 3", "Sheet-Pan Bacon Egg Sandwiches ", "\n" +
                "\n" +
                "8 slices bacon (about 8 ounces), cut into 1/2 inch pieces\n" +
                "\n" +
                "1 tablespoon vegetable oil\n" +
                "\n" +
                "18 large eggs\n" +
                "\n" +
                "1/2 cup half-and-half\n" +
                "\n" +
                "3 scallions, thinly sliced\n" +
                "\n" +
                "Kosher salt and freshly ground black pepper\n" +
                "\n" +
                "2 plum tomatoes, seeded and diced \n" +
                "\n" +
                "2 cups shredded sharp Cheddar\n" +
                "\n" +
                "16 potato sandwich rolls, split\n" +
                "\n" +
                "Hot sauce, for serving\n" +
                "\n"+
                "Procedure/Directions\n" +
                "Preheat the oven to 350 degrees F. Spread the bacon pieces in a single layer on an 18-by-13-inch sheet pan and drizzle with vegetable oil. Bake until crisp and lightly browned, about 15 minutes, stirring halfway through. Remove the pan from the oven but do not drain the fat or remove the bacon. Reduce the oven temperature to 300 degrees. \n" +
                "\n" +
                "Meanwhile, whisk the eggs, half-and-half, scallions, 2 teaspoons salt and 1/4 teaspoon pepper together in a large bowl. Redistribute the bacon evenly on the sheet pan, then pour the egg mixture over and top with tomatoes and cheese. Return the pan to the oven, being careful not to spill, and bake until the eggs are just set, about 25 minutes. \n" +
                "\n" +
                "Let the eggs cool 5 minutes before cutting. Meanwhile, warm the buns in the oven on a separate baking sheet. Use a knife or pizza cutter to cut the eggs into 16 even portions and place them between the bun halves. Serve the sandwiches with hot sauce on the side. \n" +
                "\n"
                ));
        addItem(new DummyItem("Recipe 4", "Glazed Salmon and Bok Choy Sheet Pan Dinner","\n" +
                "\n" +
                "1 small bunch thin asparagus (about 10 ounces), tough ends snapped off\n" +
                "\n" +
                "2 tablespoons extra-virgin olive oil\n" +
                "\n" +
                "Kosher salt and freshly ground black pepper\n" +
                "\n" +
                "Two 6-ounce skinless salmon fillets (about 1 1/2 inches thick) \n" +
                "\n" +
                "4 teaspoons hoisin sauce\n" +
                "\n" +
                "4 baby bok choy (about 10 ounces), halved lengthwise\n" +
                "\n" +
                "1-inch piece fresh ginger, peeled and grated, (about 1 tablespoon)\n" +
                "\n" +
                "1 scallion, thinly sliced on a bias\n" +
                "\n" +
                "Procedure/Directions\n" +
                "\n" +
                "Position a rack in the center of the oven and preheat to 425 degrees F. Line a rimmed baking sheet with parchment paper. Lay the asparagus in the center of the prepared baking sheet, drizzle with 1 tablespoon olive oil and toss with 1/4 teaspoon salt and 1/8 teaspoon pepper. Roast until the asparagus just begins to change color, 5 minutes. \n" +
                "\n" +
                "Remove the baking sheet from the oven and place the bok choy to the left of the asparagus. Drizzle with the remaining 1 tablespoon of olive oil and sprinkle with the grated ginger, 1/4 teaspoon salt and 1/8 teaspoon black pepper; toss to coat. Place the salmon fillets to the right of the asparagus, spacing them evenly apart. Brush with hoisin. \n" +
                "\n" +
                "Roast until the bok choy is tender and the leaves begin to crisp, the asparagus is tender, and the salmon is cooked through yet still moist, about 12 minutes more. Divide salmon and vegetables between two plates and top with sliced scallions\n"
                ));
        addItem(new DummyItem("Recipe 5", "Sheet Pan Taco Bake","\n" +
                "\n" +
                "5 tablespoons vegetable oil\n" +
                "\n" +
                "1 pound ground beef\n" +
                "\n" +
                "1 teaspoon ground cumin\n" +
                "\n" +
                "3 teaspoons chili powder\n" +
                "\n" +
                "Kosher salt\n" +
                "\n" +
                "1 tablespoon tomato paste\n" +
                "\n" +
                "Nonstick cooking spray, for spraying the sheet pan\n" +
                "\n" +
                "20 ounces refrigerated shredded hash browns\n" +
                "\n" +
                "8 ounces Cheddar, grated (about 2 cups)\n" +
                "\n" +
                "Assorted toppings, such as shredded iceberg lettuce, salsa, diced avocado, sour cream, sliced black olives, pickled jalapenos and hot sauce\n" +
                "\n" +
                "Procedures/Directions\n" +
                "\n" +
                "1. Heat 1 tablespoon of the oil in a medium skillet over medium heat. Add the ground beef and cook, breaking it up with a wooden spoon, until no longer pink, about 4 minutes. Add the cumin, 2 teaspoons of the chili powder and 1/2 teaspoon salt and stir to combine. Push the beef aside to make a space in the middle of the skillet and add the tomato paste. Cook, stirring, until the tomato paste darkens a shade or two, about 1 minute, then stir it into the beef. Add 1/2 cup water, bring to a rapid simmer and cook, stirring, until the water has almost completely reduced, about 2 minutes. Keep hot. \n" +
                "\n" +
                "2. Preheat the broiler. Spray an 18-by-13-inch sheet pan with cooking spray. \n" +
                "\n" +
                "3. Spread the hash browns on the prepared sheet pan, toss with 1 teaspoon salt and the remaining 4 tablespoons vegetable oil and 1 teaspoon chili powder and pat into an even layer. Broil until golden, 8 to 10 minutes. Toss well with a heatproof spatula, pat back into an even layer and return to the broiler until golden brown, 6 to 8 minutes more. Top with the spiced ground beef and Cheddar and broil until the cheese is melted, about 2 minutes. Add your favorite toppings, cut into pieces and serve.  \n" +
                "\n"
                ));
    }
/*
    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }
*/
    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
/*
    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
*/
    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;



        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;

        }

        @Override
        public String toString() {
            return content;
        }

    }
}