public class Problems {

    public static void interchangeValues(Double value1, Double value2) {
        System.out.println(String.format("Input: %s %s", value1, value2));
        value1 = value2 + value1;
        value2 = value1 - value2;
        value1 = value1 - value2;
        System.out.println(String.format("Output: %s %s %s", value1, value2, System.lineSeparator()));
    }

    public static void interchangeValues(Float value1, Float value2) {
        interchangeValues(Double.valueOf(value1), Double.valueOf(value2));
    }

    public static void interchangeValues(Integer value1, Integer value2) {
        interchangeValues(Long.valueOf(value1), Long.valueOf(value2));
    }

    public static void interchangeValues(Long value1, Long value2) {
        System.out.println(String.format("Input: %s %s", value1, value2));
        value1 = value2 + value1;
        value2 = value1 - value2;
        value1 = value1 - value2;
        System.out.println(String.format("Output: %s %s %s", value1, value2, System.lineSeparator()));
    }

    public static void printSquareOfSum(Double s1, Double s2) {
        System.out.println(String.format("Square= %f%s", Math.pow(s1, 2) + Math.pow(s2, 2), System.lineSeparator()));
    }

    public static void printSquareOfSum(Long l1, Long l2) {
        System.out.println(String.format("Square= %d%s", l1 * l1 + l2 * l2, System.lineSeparator()));
    }

    public static void printMirroredNumber(Number number) {
        char[] stringValue = String.valueOf(number).toCharArray();
        String result = "";
        for (int i = stringValue.length - 1; i >= 0; i--) {
            result += stringValue[i];
        }
        System.out.println(String.format("Number=%s Reverse=%s %s", number, result, System.lineSeparator()));
    }

    public static Long factorial(int factorialCount) {
        if (factorialCount < 1) {
            throw new IllegalArgumentException("Factorial parameter cannot be less than 1");
        }
        if (factorialCount == 1) {
            return 1L;
        } else {
            return factorialCount * factorial(factorialCount - 1);
        }
    }

    //    F(x)= x-3,x < -3
//          4*x^2,x in [-3,3]
//          8, x > 3
    public static Double solveFunction(int x) {
        if (x < -3) {
            return (double) (x - 3);
        } else if (x <= 3) {
            return 4 * Math.pow(x, 2) - 2 * x + 1;
        }
        return 8d;
    }

    public static void demoProblems() {
        int intValue1 = 0, intValue2 = 1;
        long longValue1 = 3, longValue2 = 4;
        float floatValue1 = Float.valueOf("3.14"), floatValue2 = Float.valueOf("5.42");
        double doubleValue1 = 1.05, doubleValue2 = 2.55;

        // Problema 1
        System.out.println("Problema 1");
        interchangeValues(intValue1, intValue2);
        interchangeValues(longValue1, longValue2);
        interchangeValues(floatValue1, floatValue2);
        interchangeValues(doubleValue1, doubleValue2);

        // Problema 2
        System.out.println("Problema 2");
        printSquareOfSum(doubleValue1, doubleValue2);
        printSquareOfSum(longValue1, longValue2);

        // Problema 3
        System.out.println("Problema 3");
        printMirroredNumber(123458977);
        printMirroredNumber(234.45);

        // Problema 4
        System.out.println("Problema 4");
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
        System.out.println(System.lineSeparator());

        // Problema 5
        System.out.println("Problema 5");
        System.out.println(solveFunction(-5));
        System.out.println(solveFunction(2));
        System.out.println(solveFunction(5));
    }

}
