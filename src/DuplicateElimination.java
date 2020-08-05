import java.util.*;

public class DuplicateElimination {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Set<String> names = new HashSet<String>();

        //String name = "";

        while (input.hasNext()){
            names.add(input.next());
        }

        String name = input.next();


        name = input.next();
        names.add(name);

        name = input.next();
        names.add(name);


        boolean foundName = names.contains(name);
        if(foundName){
            System.out.println("I found" + name);
        }
    }
}
