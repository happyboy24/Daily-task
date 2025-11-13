import java.util.Arrays;
public class Reversed {
public static void main(String[]args){

String input = " This is an example";
String reverse = " ";

for(int count = input.length() - 1; count >= 0; count--){

reverse += input.charAt(count);
}

char[] word = reverse.toCharArray();

Arrays.sort(word);
 putchar(input[count]);
String sortedinput = new String(word);

System.out.println("Reversed:" + reverse);
}

}
