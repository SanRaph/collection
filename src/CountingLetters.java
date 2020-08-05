import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountingLetters {
    public static Map<String, Integer> countLetters (String sentence) throws StringCounterException{

        if (sentence == null){
            throw new StringCounterException("Don't pass null");
        }

        Map<String, Integer> result = new TreeMap<String, Integer>();
        for(char letter : sentence.toCharArray()){
            String theLetter = String.valueOf(letter);
            boolean contains = result.containsKey(String.valueOf(letter));

            if(contains){
                int count = result.get(theLetter);
                count ++;

                result.put(theLetter, count);
            }else {
                //TODO:
                result.put(theLetter, 1);

            }
        }

        return result;
    }


    public static void main(String[] args) throws StringCounterException {
        Map<String, Integer> counts = CountingLetters.countLetters("HELLO WORLD");
        if(counts.containsKey("H")){

            Set<String> keys = counts.keySet();
            System.out.println("Found it" + "=" + keys.size());
            System.out.printf("%n");
            System.out.println("H" + "=" + counts.get("H"));
            System.out.println("E" + "=" + counts.get("E"));
            System.out.println("L" + "=" + counts.get("L"));
            System.out.println("O" + "=" + counts.get("O"));
            System.out.println("space" + "=" + counts.get(" "));
            System.out.println("W" + "=" + counts.get("W"));
            System.out.println("D" + "=" + counts.get("D"));

        } else {
            System.out.println("Input not found");
        }
    }
}
