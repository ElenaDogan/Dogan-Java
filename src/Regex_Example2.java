public class Regex_Example2 {

    // https://www.vogella.com/tutorials/JavaRegularExpressions/article.html

    public static boolean isTrue(String s){         // returns true if the string matches exactly "true"
        return s.matches("true");
    }
    public static boolean isTrue2(String s){        //returns true if the string matches exactly "true" or "True"
        return s.matches("[tT]rue");
    }
    public boolean isTrueOrYes(String s){           // returns true if the string matches exactly "true" or "True" or "yes" or "Yes"
        return s.matches("[tT]rue|[yY]es");
    }
    // returns true if the string contains exactly "true"
    public boolean containsTrue(String s){
        return s.matches(".*true.*");               // . is any character  .* means there can be multiple characters
    }
    // returns true if the string contains of three letters
    public boolean isThreeLetters(String s){
        return s.matches("[a-zA-Z]{3}");
//      return s.matches("[a-Z][a-Z][a-Z]");
    }
    // returns true if the string does not have a number at the beginning
    public boolean isNoNumberAtBeginning(String s){
        return s.matches("^[^\\d].*");
    }
    // returns true if the string contains a arbitrary number of characters except b
    public boolean isIntersection(String s){
        return s.matches("([\\w&&[^b]])*");
    }
    // returns true if the string contains a number less than 300
    public boolean isLessThenThreeHundred(String s){
        return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
    }

    public static void main(String[] args) {

        System.out.println(isTrue("true"));         // true
        System.out.println(isTrue("True"));         // false

        System.out.println(isTrue2("true"));        // true
        System.out.println(isTrue2("True"));        // true

    }
}
