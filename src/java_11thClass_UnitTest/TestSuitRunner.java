package java_11thClass_UnitTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuitRunner {

    public static void main(String[] args) {
        Result result= JUnitCore.runClasses(TestSuite.class);
        for (Failure failure:result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
                // Another Approach //
//    @Test
//    public void TestSuiRunner(){
//        Result result= JUnitCore.runClasses(TestSuite.class);
//        for (Failure failure:result.getFailures()) {
//            System.out.println(failure.toString());
//        }
//        System.out.println(result.wasSuccessful());
//    }

}
