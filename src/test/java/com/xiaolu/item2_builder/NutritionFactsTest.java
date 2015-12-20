package com.xiaolu.item2_builder;

import org.junit.Test;

/**
 * NutritionFacts Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 28, 2015</pre>
 */
public class NutritionFactsTest {
    /**
     * Method: build()
     */
    @Test
    public void testBuild() throws Exception {
        NutritionFacts coke = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
    }
}