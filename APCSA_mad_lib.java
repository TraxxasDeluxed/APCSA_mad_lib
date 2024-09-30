import java.util.Scanner;

class APCSA_mad_lib {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String madlib = "done";

        while (true){

            System.out.println("Choose a number between 1 to 3");
            String ans = scanner.nextLine(); 

        if (ans.compareTo("one")==0){
            madlib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
            break;
        }

        if (ans.compareTo("two") == 0){
             madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
             break;
        }

        if (ans.compareTo("three") == 0){
             madlib = "<name> went to <school> in <year>";
             break;
        }
        else{
            System.out.println("Please input the correct number");
        }

        while(madlib.indexOf("<")!=-1){
            String angleLocator = madlib.substring(madlib.indexOf("<"), madlib.indexOf(">")+1);

            System.out.println("Please give me a"+angleLocator.substring(1,angleLocator.length()-1));
            String word = scanner.nextLine();
            madlib = madlib.replace(angleLocator,word);
            System.out.println(madlib);
        }

    }

        





    }
}