import org.testng.annotations.Test;
import tests.Test_01;
import tests.Test_02;
import tests.Test_03;
import tests.Test_04;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test_01: ");
        Test_01 test_01 = new Test_01();
        test_01.testStatusCode();

        System.out.println("Test_02: ");
        Test_02 test_02 = new Test_02();
        test_02.testLogging();

        System.out.println("Test_03: ");
        Test_03 test_03 = new Test_03();
        test_03.testEqualToFunction();

        System.out.println("Test_04: ");
        Test_04 test_04 = new Test_04();
        test_04.testHasItemFunction();

    }
}
