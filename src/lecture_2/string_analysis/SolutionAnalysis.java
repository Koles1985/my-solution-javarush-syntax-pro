package lecture_2.string_analysis;

public class SolutionAnalysis {

    public int countDigits(String text){

        int count = 0;
        char[] chars = text.toCharArray();
        for (char ch: chars){
            if(Character.isDigit(ch))
                count++;
        }

        return count;
    }

    public int countLetters(String text){
        int count = 0;
        char[] chars = text.toCharArray();
        for (char ch: chars){
            if(Character.isLetter(ch))
                count++;
        }

        return count;
    }

    public int countSpaces(String text){
        int count = 0;
        char[] chars = text.toCharArray();
        for (char ch: chars){
            if(Character.isSpaceChar(ch))
                count++;
        }

        return count;
    }
}
