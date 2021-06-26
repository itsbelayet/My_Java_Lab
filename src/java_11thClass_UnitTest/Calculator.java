package java_11thClass_UnitTest;

public class Calculator {
    int DoSum(int x, int y) {
        int total = x + y;
        System.out.println(total);
        return total;
    }

    int DoMultiply(int x, int y) {
        int result = x * y;
        System.out.println(result);
        return result;
    }

    int Calculat(int x, int y, int z) {
        int result = x - y + z;
        System.out.println(result);
        return result;
    }
}
