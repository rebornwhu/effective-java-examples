package com.xiaolu.item33_enummap;

import org.junit.Assert;
import org.junit.Test;

public class PhaseTest {

    @Test
    public void fromTest() {
        Phase.Transition tran = Phase.Transition.from(Phase.PLASMA, Phase.GAS);
        Assert.assertEquals(Phase.Transition.DEIONIZE, tran);
    }
}
