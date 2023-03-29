package TeamWorkProject03;

public class CamelCase {
   /*
        TASK ->
        First letter to upper case,
        parameter is one String,
        return type is String,
        words are delimited by a space.
        All the words first letter should be camel case

        input:              I lIVe in uSa
        Result should be :  I Live In Usa
    */
    /*
        CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin sadece
        ilk karakterlerini büyük harfe çevirip return eden  method java da create ediniz.
        input : I lIVe in uSa
        output: I Live In Usa
     */

    public static void main(String[] args) {

        System.out.println("Method sonrasi String : " + camelcase());
    }

    public static String camelcase() {

        String str = "I lIVe in uSa";
        System.out.println("Method öncesi String  : " + str);

        StringBuilder result = new StringBuilder();

        String[] words = str.toLowerCase().split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
            }
            if (!(word.equals(words[words.length - 1]))) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
