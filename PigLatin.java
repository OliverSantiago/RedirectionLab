import java.util.*;
public class PigLatin{
  public static void main( String[]args ){
  }

  public static String pigLatinSimple(String s){
    String temp = "";
    if (s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'){
      temp=s+"hay";
    }else{
      temp = s.substring(1)+Character.toString(s.charAt(0))+"ay";
    }
    return temp.toLowerCase();
  }
}
