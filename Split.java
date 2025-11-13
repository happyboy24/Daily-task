public class Split{
public static void main(String[]args){

String input = "i love programming";

String[] words = input.split("\\s+");

for(String word : words){
	System.out.print(word + " ");
}
}
}