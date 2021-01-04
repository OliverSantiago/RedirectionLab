import java.util.*;
public class PigLatin{
  public static void main( String[]args ){
    // System.out.println(pigLatinSimple("hello"));
    // System.out.println(pigLatinSimple("mock"));
    // System.out.println(pigLatinSimple("aaron"));
    // System.out.println(pigLatinSimple("a"));
    // System.out.println(pigLatinSimple("b"));
    // System.out.println(pigLatin("a"));
    // System.out.println(pigLatin("b"));
    // System.out.println(pigLatin("fl"));
    // System.out.println(pigLatin("chomp"));
    // System.out.println(pigLatin("the"));
    // System.out.println(pigLatin("check"));
    // System.out.println(pigLatin("skee"));
    // System.out.println(pigLatin("emu"));
    // System.out.println(pigLatin("grade"));
    System.out.println(pigLatinBest("*emu"));
    System.out.println(pigLatinBest("4chan"));
    System.out.println(pigLatinBest("fish!"));
    System.out.println(pigLatinBest("fish"));
    System.out.println(pigLatinBest("the."));
    System.out.println(pigLatinBest("cat!"));
    System.out.println(pigLatinBest("amazing?"));
    System.out.println(pigLatinBest("apple%"));
  }

  public static String pigLatinSimple(String s1){
    String s = s1.toLowerCase();
    String temp = "";
    if (s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'){
      temp=s+"hay";
    }else{
      if (s.length()==1){
        temp = s + "ay";
      }else{
        temp = s.substring(1)+Character.toString(s.charAt(0))+"ay";
      }
    }
    return temp.toLowerCase();
  }

  public static String pigLatin(String s1){
    String s = s1.toLowerCase();
    String temp = "";
    if (s.length()==1){
      if (s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'){
        temp=s+"hay";
      }else{
        temp = s + "ay";
      }
    }else{
      String firsttwo = Character.toString(s.charAt(0))+Character.toString(s.charAt(1));
      if (firsttwo.equals("bl")||
          firsttwo.equals("br")||
          firsttwo.equals("ch")||
          firsttwo.equals("ck")||
          firsttwo.equals("cl")||
          firsttwo.equals("cr")||
          firsttwo.equals("dr")||
          firsttwo.equals("fl")||
          firsttwo.equals("fr")||
          firsttwo.equals("gh")||
          firsttwo.equals("gl")||
          firsttwo.equals("gr")||
          firsttwo.equals("ng")||
          firsttwo.equals("ph")||
          firsttwo.equals("pl")||
          firsttwo.equals("pr")||
          firsttwo.equals("qu")||
          firsttwo.equals("sc")||
          firsttwo.equals("sh")||
          firsttwo.equals("sk")||
          firsttwo.equals("sl")||
          firsttwo.equals("sm")||
          firsttwo.equals("sn")||
          firsttwo.equals("sp")||
          firsttwo.equals("st")||
          firsttwo.equals("sw")||
          firsttwo.equals("th")||
          firsttwo.equals("tr")||
          firsttwo.equals("tw")||
          firsttwo.equals("wh")||
          firsttwo.equals("wr")){
        if (s.length()==2){
          temp = s + "ay";
        }else{
          temp = s.substring(2)+firsttwo+"ay";
        }
      }else{
        temp = "";
        if (s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'){
          temp=s+"hay";
        }else{
          if (s.length()==1){
            temp = s + "ay";
          }else{
            temp = s.substring(1)+Character.toString(s.charAt(0))+"ay";
          }
        }
        return temp.toLowerCase();
      }
    }
    return temp.toLowerCase();
  }

  public static String pigLatinBest(String s1){
    String s = s1.toLowerCase();
    String temp = "";
    if (Character.isLetter(s.charAt(0))){
      if (!Character.isLetter(s.charAt(s.length()-1))){
        String finaladdon = Character.toString(s.charAt(s.length()-1));
        temp = pigLatin(s.substring(0,s.length()-1));
        temp += finaladdon;
      }else{
        s = s1.toLowerCase();
        temp = "";
        if (s.length()==1){
          if (s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'){
            temp=s+"hay";
          }else{
            temp = s + "ay";
          }
        }else{
          String firsttwo = Character.toString(s.charAt(0))+Character.toString(s.charAt(1));
          if (firsttwo.equals("bl")||
              firsttwo.equals("br")||
              firsttwo.equals("ch")||
              firsttwo.equals("ck")||
              firsttwo.equals("cl")||
              firsttwo.equals("cr")||
              firsttwo.equals("dr")||
              firsttwo.equals("fl")||
              firsttwo.equals("fr")||
              firsttwo.equals("gh")||
              firsttwo.equals("gl")||
              firsttwo.equals("gr")||
              firsttwo.equals("ng")||
              firsttwo.equals("ph")||
              firsttwo.equals("pl")||
              firsttwo.equals("pr")||
              firsttwo.equals("qu")||
              firsttwo.equals("sc")||
              firsttwo.equals("sh")||
              firsttwo.equals("sk")||
              firsttwo.equals("sl")||
              firsttwo.equals("sm")||
              firsttwo.equals("sn")||
              firsttwo.equals("sp")||
              firsttwo.equals("st")||
              firsttwo.equals("sw")||
              firsttwo.equals("th")||
              firsttwo.equals("tr")||
              firsttwo.equals("tw")||
              firsttwo.equals("wh")||
              firsttwo.equals("wr")){
            if (s.length()==2){
              temp = s + "ay";
            }else{
              temp = s.substring(2)+firsttwo+"ay";
            }
          }else{
            temp = "";
            if (s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'){
              temp=s+"hay";
            }else{
              if (s.length()==1){
                temp = s + "ay";
              }else{
                temp = s.substring(1)+Character.toString(s.charAt(0))+"ay";
              }
            }
            return temp.toLowerCase();
          }
        }
        return temp.toLowerCase();
      }
    }else{
      temp = s;
    }
    return temp.toLowerCase();
  }
}
