package Interview_Question;

public class Numbers__ODD_or_EVEN {

    public static String identify(int n) {
//        if(n%2==0){
//            return "Even";
//        }else{
//            return "Odd";
//        }
        return n % 2 == 0 ? "Even" : "Odd";

    }


    public static void main(String[] args) {
        System.out.println(identify(5));
        System.out.println(identify(8));

    }
}
