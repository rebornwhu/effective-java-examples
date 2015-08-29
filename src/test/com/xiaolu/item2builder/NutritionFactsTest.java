package test.com.xiaolu.item2builder;

import com.xiaolu.item2builder.NutritionFacts;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

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