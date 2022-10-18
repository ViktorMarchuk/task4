package by.marchuk.task04.main;


public class Search{
    public static void main(String[] args){
        System.out.println("Number of similar characters is " + countSimilarChar("draaaw", 'a'));
    }

    public static int countSimilarChar(String s, char c){
        int count = 0;
        char[] chars = s.toCharArray();
        for(char ch: chars){
            if(ch == c){
                count++;
            }
        }
        return count;
    }
}

// Number of similar characters is 3