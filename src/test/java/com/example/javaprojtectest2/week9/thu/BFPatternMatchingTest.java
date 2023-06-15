package com.example.javaprojtectest2.week9.thu;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BFPatternMatchingTest {

    @Test
    public void test() {
        BFPatternMatching bfPatternMatching = new BFPatternMatching();
        Assertions.assertThat(bfPatternMatching.findPattern("qwertyuiuiuytrertyuiopopoiuytrqwertyuytrertywqwertyuiuytrewqwertyuiiuiuiytrewert", "qwert")).isEqualTo(0);
        Assertions.assertThat(bfPatternMatching.findPattern("][poiuytrewqqwer", "qwert")).isEqualTo(-1);
        Assertions.assertThat(bfPatternMatching.findPattern("][poiuytrewqqwert", "qwert")).isEqualTo(12);
    }
}