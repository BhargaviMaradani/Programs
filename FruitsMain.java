import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FruitsMain{
    public static void main(String[] args){

        ArrayList<Fruits> citrusfruits = new ArrayList<>();
        citrusfruits.add(new Fruits("Orange", 50, "orange"));

        citrusfruits.add(new Fruits("Grapes", 250, "Black"));
        citrusfruits.add(new Fruits("limes", 150, "Green"));
        System.out.println(citrusfruits);

        ArrayList<Fruits> stonefruits =new ArrayList<>();
        stonefruits.add(new Fruits("Apricots", 150, "orange yellow"));
        stonefruits.add(new Fruits("Peaches", 100, "pale yellow"));
        stonefruits.add(new Fruits("Plums", 350, "purple"));
        System.out.println(stonefruits);

        citrusfruits.addAll(stonefruits);

        ArrayList<Fruits> fruitslist;
        fruitslist = (ArrayList<Fruits>) Stream.of(citrusfruits)
                .forEach((fruits) -> citrusfruits.add(fruits.get()))
                .sorted(fruitslist)
                .collect(Collectors.toList());


    }
}

