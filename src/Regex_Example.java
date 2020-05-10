import java.util.Arrays;

public class Regex_Example {
    public static void main(String[] args) {

        // A regular expression (regex) defines a search pattern for strings.

        String text = "This     is my small example.";

        System.out.println(text.matches("\\w.*"));

        String[] splitString = (text.split("\\s+"));     //   \\s+  ==> includes all whitespace characters ( \n, \n, \t, [space])
        String[] arr =text.split(" ");

        System.out.println(Arrays.toString(splitString));       // [This, is, my, small, example.]
        System.out.println(Arrays.toString(arr));               // [This, , , , , is, my, small, example.]

        // replace all whitespace with tabs
        System.out.println(text.replaceAll("\\s+", "\t"));      // This	is	my	small	example.

        // *******************************************************************


    }



}
