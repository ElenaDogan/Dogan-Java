public class StringBuffer {
    public static void main(String[] args) {

        String str = "melisa";
        java.lang.StringBuffer sb = new java.lang.StringBuffer(str);
        System.out.println(sb);
        sb.append(4);
        sb.append('o');
        sb.reverse();
        System.out.println(sb);

    }
}
