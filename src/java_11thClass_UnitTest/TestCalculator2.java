package java_11thClass_UnitTest;

import org.junit.*;

public class TestCalculator2 {
    @BeforeClass
    public static void Wellcome() {
        System.out.println("BeforeClass Anotation Run before Start Class testing\n");
    }
    @Before
    public void Wellcome1() {
        System.out.println("Before Anotation Run before each testing\n");
    }
    @After
    public void Wellcome2() {
        System.out.println("After Anotation Run after each testing\n");
    }
    @AfterClass
    public static void Wellcome3() {
        System.out.println("AfterClass Anotation Run after testing Class\n");
    }

    @Test
    public void TDoSum() {
        int aspected = 20;
        Calculator tds = new Calculator();
        if (aspected == tds.DoSum(12, 8)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test fail");
        }
    }

    @Test
    public void TDoSum1() {
        int aspected = 15;
        Calculator tds = new Calculator();
        int actual = tds.DoSum(12, 8);
        Assert.assertEquals("Test Fail", aspected, actual);
    }

    @Test
    public void TDoSum2() {
        int aspected = 60;
        Calculator tds = new Calculator();
        int actual = tds.DoMultiply(12, 5);
        Assert.assertEquals("Test Fail", aspected, actual);
    }

    @Ignore                     // It can't be run
    public void TDoSum3() {
        int aspected = 60;
        Calculator tds = new Calculator();
        int actual = tds.Calculat(12, 5, 3);
        Assert.assertEquals("Test Fail", aspected, actual);
    }
}
