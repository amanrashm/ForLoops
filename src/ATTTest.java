import java.util.*;
import java.util.stream.Collectors;

public class ATTTest implements Comparable {




    public static void main(String[] args) {


         /*


{"abc", "xyz", "abc"} distinct

     */

        List<String> a=new ArrayList<>();
        a.add("abc");
        a.add("xyz");
        a.add("abc");

       System.out.println( a.stream().map(i->i).distinct().collect(Collectors.toList()));


        HashMap<String, String> h= new HashMap<>();
        h.put("1","9");
        h.put("2","3");
        h.put("4","1");


        int[] b={-5, 1,  2, 3, 4};
        int[] c= new int[b.length];
        for(int i=0;i<b.length;i++){
           c[i]= i*i;
        }
        Arrays.sort(c);
        //Collections.sort();


       // Arrays.stream(b).map(i->i*i).sorted().collect(Collectors.to);




    }


/*
    @Override
    public int compare(Map.Entry o1, Map.Entry o2) {

        if(o1.getValue().compare(o2.getValue())){
            return 0;
        }else if(o1.getValue()>o2.getValue()){

        }else{
            return -1;
        }



        return (o1.getValue().equals(o2.getValue()));
    }

 */
}
