// https://www.techiedelight.com/check-given-string-rotated-palindrome-not/

package algorithm;

public class Level106 {
    public static boolean isPalindrome(String str)
    {
        if (str.length()%2==0){
            if(str.substring(0,str.length()/2).equals(new StringBuffer(str.substring(str.length()/2)).reverse().toString())){
                return true;
            }
        }else{
            if(str.substring(0,str.length()/2).equals(new StringBuffer(str.substring(str.length()/2+1)).reverse().toString())){
                return true;
            }
        }
        return false;
    }

    public static boolean isRotatedPalindrome(String str) {
        for (int i = 0; i < str.length() ; i++) {
            str = str.substring(1) + str.charAt(0);
            if (isPalindrome(str)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "BAABCC";
//        System.out.println(str.length()/2);
//        System.out.println(str.substring(0,str.length()/2).equals(new StringBuffer(str.substring(str.length()/2+1)).reverse().toString()));
//        System.out.println(str.substring(0,str.length()/2) +":"+ new StringBuffer(str.substring(str.length()/2)).reverse().toString());


        str = str.substring(2) + str.substring(0, 2);
//        System.out.println(str);
        System.out.println(isRotatedPalindrome(str));




    }

}
