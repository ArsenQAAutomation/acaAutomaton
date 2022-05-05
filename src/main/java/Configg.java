public class Configg {
    final static boolean FAIL_TESTS;

    static {
        FAIL_TESTS = Boolean.parseBoolean(System.getenv("fail"));
    }

}
