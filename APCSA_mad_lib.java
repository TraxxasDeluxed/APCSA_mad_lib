import java.util.Scanner;

class APCSA_mad_lib {
    public static void main(String[] args) {
        //mad libs
        StringBuilder storyBuilder = new StringBuilder();
        storyBuilder.append("I went to the animal (noun), the (plural_noun) and the (number) beasts were there. ");
        storyBuilder.append("Once upon a time in a (adjective) land, a (noun) (adverb) grew. ");
        storyBuilder.append("(name) went to school at (schoolName) in (year)");


        // replace, dont use hardcoded methods
        Scanner state = new Scanner(System.in);

        System.out.println("Choose a noun");
        String nounInput = state.nextLine();

        System.out.println("Choose a plural noun");
        String pnounInput =  state.nextLine();

        System.out.println("Choose a number");
        String numInput =  state.nextLine();

        System.out.println("Choose an adjective");
        String adjInput = state.nextLine();

        System.out.println("Choose a name");
        String nameInput = state.nextLine();

        System.out.println("Choose a school name");
        String schoolNameInput = state.nextLine();

        System.out.println("Choose a year");
        String yearInput = state.nextLine();

        

        String story = storyBuilder.toString()
            .replace("(adjective)", adjInput)
            .replace("(noun)", nounInput)
            .replace("(adverb)", pnounInput)
            .replace("(noun2)", numInput)
            .replace("(adjective)", adjInput)
            .replace("(name)", nameInput)
            .replace("(schoolName)", schoolNameInput)
            .replace("(year)", yearInput);

            System.out.println("Here is your story");
            System.out.println(story);

        



    }
}