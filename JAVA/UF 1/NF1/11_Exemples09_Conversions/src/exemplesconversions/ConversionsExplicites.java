package exemplesconversions;

public class ConversionsExplicites {

    public static void main(String[] args) {

        long m = 1233445656999996L;
        double dadaDouble = 45.875;
        int a;
        long dadaLong;

        a = (int) m;//conversió de long a int
        System.out.println("m= " + m); //-->m= 1233445656999996
        System.out.println("a= " + a); //-->a= -230934468

        //conversió de double a int
        System.out.println(
                "(int)(2.4+8.5) = " + (int) (2.4 + 8.5)); //-->(int)(2.4+8.5) = 10
        
        a = (int) dadaDouble;
        System.out.println("a = " + a); //-->a = 45
        
        //conversió de double a long
        dadaLong = 34 + 56L + (long) (2.3 * dadaDouble);
        System.out.println("dadaLong = " + dadaLong); //-->dadaLong = 195

    }

}
