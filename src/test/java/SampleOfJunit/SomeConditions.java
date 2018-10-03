package SampleOfJunit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

 class SomeConditions {
    @Test // Static JavaScript expression.
    @EnabledIf("2 * 2 == 4")
    void willBeExecuted() {
        System.out.println("zzz");
        // ...
    }
    @Test // Static JavaScript expression.
    @EnabledIf("2 * 2 == 5")
    void willBeNotExecuted() {
        System.out.println("xxx");
        // ...
    }

     @RepeatedTest(10) // Dynamic JavaScript expression.
     void repeatedtest() {
         System.out.println("1");
         System.out.println("xxx");
     }
}
