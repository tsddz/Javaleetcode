package Test1436;

import java.util.*;

public class Test1436 {
    public static void main(String[] args)
    {
        var S=new Solution();
//        String paths[][]= {{"B","C"},{"D","B"},{"C","A"}};
//        List<List<String>> paths=new List<List<String>>
//        List<String> places = Arrays.asList("Buenos Aires", "Córdoba", "La Plata");
////        ArrayList<String> place=new ArrayList<>();
//        place=Arrays.asList('C');



        ArrayList<List<String>> paths= new ArrayList<List<String>>();
//        List<List<String>> paths= new List<List<String>>();
        var names=new ArrayList<>(List.of("a","b","c"));
        List<String> na=List.of("aa","bb");
        paths.add(new ArrayList<>(List.of("B","C")));
//        paths.add(Arrays.asList("B", "C"));
        paths.add(Arrays.asList("D", "B"));
        paths.add(Arrays.asList("C", "A"));
//        ArrayList<String> addup=new ArrayList<String>({"f","f"});
        String[] addup={"f","f"};
        char[] addups={'s','s'};
//        String addup="f";
        String aa="qwe";
        String m=aa.substring(0,1);
        Integer[] nn={1,2};
        int[] nm={1,2};

        Object[] mm=paths.toArray();
        System.out.println(S.destCity(paths));



    }

}


class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = prepare(paths);
        String from = paths.get(0).get(0);
        while(true){
            if(!map.containsKey(from))
                return from;
            from = map.get(from);
        }
    }
    private Map<String, String> prepare(List<List<String>> paths){
        Map<String, String> map = new HashMap<>();
        for(List<String> path : paths)
            map.put(path.get(0), path.get(1));
        return map;
    }

}

