public class Division
{
    /*create a function that takes in two integers.
        It divides the first by the second and prints the equation with the result.
        ie: "4 / 2 = 2"
        Afterwards, create a case in the switch statement in Main.java
        and call your function.
    */
    public static void calculate(double operator1, double operator2) {
        double result;
        result = operator1/operator2;
        System.out.println(operator1 +  " / " +  operator2 + " = " + result);
    }
}
