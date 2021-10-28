import java.io.*;
import java.util.*;

interface AnonymousInterface
{
    void getCipher(ArrayList<String> list);
}

class Cipher_Anonymous
{
    void anonymousClass(ArrayList<String> list) 
    {
        AnonymousInterface obj=new AnonymousInterface(){
        
            
            public void getCipher(ArrayList<String> list) {
                for(String x:list)
                {
                    System.out.print(x);
                }
            }
        };
       obj.getCipher(list); 
    }
}

class Cipher_MethodRef
{
    void methodReference(ArrayList<String> list)        
    {
        AnonymousInterface obj=(list1)->{
            list1.forEach(System.out::print);
        };
        obj.getCipher(list);
    }
}

class Cipher_LambdaExp
{
    void lambdaExpression(ArrayList<String> list) 
    {
        AnonymousInterface obj=(list1)->{
            for(int i=0;i<list1.size();i++)
            {
                int ch=(int)list1.get(i).charAt(0);
                String req=list1.get(i).substring(1);
                list1.set(i,ch+req);
                if(list1.get(i).equals("32"))
                list1.set(i,"#$");
                StringBuilder sb=new StringBuilder(list1.get(i));
                list1.set(i,sb.reverse().toString());
            }
            for(String x:list1)
            {
                System.out.print(x);
            }
        };
        obj.getCipher(list);
    }
}

public class MethodInterface
{
    public static void main(String[] args) 
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list=new ArrayList<>();

        String input= null;
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputarr[]=input.split(" ");
		
		list.add(inputarr[0]);
		for(int i=0;i<inputarr.length-1;i++)
		 {
			list.add(" ");
			list.add(inputarr[i+1]);
		 }
		
		Cipher_LambdaExp l1=new Cipher_LambdaExp();
		System.out.print("Lambda Expression : ");
		l1.lambdaExpression(list);
		
		Cipher_MethodRef m1=new Cipher_MethodRef();
		System.out.print("\nMethod Reference : ");
		m1.methodReference(list);
		
		Cipher_Anonymous a1=new Cipher_Anonymous();
		System.out.print("\nAnonymous Class : ");
		a1.anonymousClass(list);
    }
}
