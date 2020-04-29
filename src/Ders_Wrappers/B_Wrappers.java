package Ders_Wrappers;

public class B_Wrappers {
    public static void main(String[] args) {
/*
        Primitive Data Type             Wrapper Class
                int                         Integer
                char                        Character
                byte                        Byte
                short                       Short
                long                        Long
                double                      Double
                boolean                     Boolean
                        --> autoboxing -->
                        <-- unboxing <----
 */

        char ch = '5';
        int n = Integer.parseInt("" + ch);   // n = 5                   // unboxing
        int m = Integer.valueOf("" + ch);       // m = 5
// **********************************************************************

        String str = "123";
        int p = Integer.parseInt(str);          // p = 123
        int r = Integer.valueOf(str);           // r = 123

        System.out.println(str + 1);                        // 1231
        System.out.println(Integer.valueOf(str) + 1);       // 124

// **********************************************************************

        Integer I1 =  (int) Byte.parseByte(str);
        // Integer = byte OLMAZ
        // Integer = int;

// **********************************************************************

        Integer in = 7;
    //  int x = Integer.parseInt(in);          // USE valueOf()
        int y = Integer.valueOf(in);           // y = 7

// **********************************************************************

        String s = "444";
        double d1 = Integer.valueOf(s);         // 444.0        ==> double > int
        double d2 = Integer.valueOf("444");     // 444.0

        String t = "25.6";
    //  double d3 = Integer.valueOf(t);        // ERROR => 25.6 is not Integer
        double d4 = Double.valueOf(t);         // 25.6

// **********************************************************************

        String r1 = "TrUE";
        Boolean t1 = Boolean.valueOf(r1);
        boolean t2 = Boolean.valueOf("tRUE");

        System.out.println(t1);     // true
        System.out.println(t2);     // true

// **********************************************************************

        boolean boo = Boolean.parseBoolean("FALSE");
        Long uzun = Long.parseLong("3147483647");
        float f1 =  Float.parseFloat( "12.5" );
        byte b1 =  Byte.parseByte("100");

    }
}
