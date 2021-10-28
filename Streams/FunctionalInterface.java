import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Supplier;

class FunctionalInterface
{
    static void storeElements(String input)
    {
        List<String>res=new ArrayList<String>();
        Consumer<String>rest=(str)->
        {
            String rest1[]=str.split(",");
            for(int i=0;i<rest1.length;i++)
            {
                if(rest1[i].equals("cheese sandwich")||rest1[i].equals("corn sandwich")||rest1[i].equals("mix veg sandwich"))
                {
                    res.add(i,rest1[i]);
                }
                else
                {
                    System.out.println("Incorrect Input");
                    return;
                }
            }
            res.forEach((x)->System.out.println(x));
        };
        Supplier<List<String>>views=()->res;
        rest.accept(input);

    }




    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        FunctionalInterface.storeElements(input);
    }
}

