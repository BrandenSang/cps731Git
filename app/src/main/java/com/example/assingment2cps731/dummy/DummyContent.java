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
                "1. Preheat the oven to 450 degrees F and line a rimmed baking sheet with parchment paper. Place the drumsticks on one side of the baking sheet, spacing them evenly apart. Place the potatoes on the other side of the baking sheet, leaving an empty space in the center for the broccoli. Drizzle the potatoes with 1 tablespoon of of the olive oil, and sprinkle with salt and pepper, tossing to evenly coat. Bake until the potatoes begin to soften and the drumsticks begin to cook and caramelize, 20 minutes. \n" +
                "\n" +
                "2. Remove the baking sheet from the oven and put the broccoli in the center. Drizzle the broccoli with the remaining 2 tablespoons of olive oil, and lightly sprinkle with salt and pepper, tossing with tongs to evenly coat. Brush the drumsticks with the teriyaki glaze on all sides. \n" +
                "\n" +
                "3. Return the baking sheet to the oven and roast until the broccoli and potatoes are tender and charred in spots and the drumsticks are completely cooked through and read an internal temperature of 160 degrees F, 20 to 25 minutes more. Divide chicken and vegetables between two plates and serve. \n"
                ));
        addItem(new DummyItem("asd", " fgh", "hjk"));
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