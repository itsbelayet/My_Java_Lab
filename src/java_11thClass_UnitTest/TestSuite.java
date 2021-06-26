package java_11thClass_UnitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                TestCalculator.class,
                TestCalculator1.class,
                TestCalculator2.class
        }
)
public class TestSuite {

}
