package Others;

import java.text.DecimalFormat;

public class DecimalFormat_Practice {
    static double PI;

    static {
        PI = 3.14159265359;
    }

    public static void main(String[] args) {

        // AREA OF A CIRCLE

        DecimalFormat df = new DecimalFormat("0.00");
        int r = 5;          // radius

        double area = PI * r * r;

        System.out.println(area);                       // 78.53981633974999
        System.out.println(df.format(area));            // 78.54

    }
}
