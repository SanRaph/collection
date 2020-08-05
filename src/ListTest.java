import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"Black", "Yellow", "Green", "Blue", "Violet", "Silver"};

        List<String> list1 = new LinkedList<>();

        for(String color : colors){
            list1.add(color);
        }
    }
}
