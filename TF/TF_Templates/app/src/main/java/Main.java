import tf_templates.MyList;
import tf_templates.IMyList;

public class Main {
    public static void main(String [] args){
        //Doubling the capacity on resize.
        IMyList<String> strings = new MyList<String>();
        strings.add("hi");
        strings.add("there");
        strings.add("hello");
        for ( int i = 0; i < strings.size(); i++){
            System.out.println( strings.get(i));
        }

        //Linear increase, on every resize add spaces for 10 more elements.
        IMyList<Integer> numbers = new MyList<Integer>((Integer i)->i+10);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        for ( int i = 0; i < numbers.size(); i++){
            System.out.println( numbers.get(i));
        }

        //On resize, tripple the capacity.
        IMyList<Character> characters = new MyList<Character>((Integer i)->i*3);
        characters.add('a');
        characters.add('b');
        characters.add('c');
        for ( int i = 0; i < characters.size(); i++){
            System.out.println( characters.get(i));
        }

    }
}
