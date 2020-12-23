import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      //use hasNextLine()/nextLine() to loop over
      //all of the data
      while (n.hasNextLine()){
        Scanner line = new Scanner(n.nextLine());
          while (line.hasNext()){
            String temp = line.next();
            String answer = "";
            for (int i = 0; i < temp.length(); i++){
              answer+="*";
            }
            System.out.print(answer);
            System.out.print(" ");
          }
          System.out.println();
        }
      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
