package Test5406;

import java.util.*;

public class Test5406 {
    public static void main(String[] args)
    {
        var S=new Solution();
        int n=7;
        int[][] edges={{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        List<Boolean> hasApple=new ArrayList<>(List.of(false,false,true,false,true,true,false));
        System.out.println(S.minTime(n,edges,hasApple));
    }
}

class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Set<Integer> visited=new HashSet<>(Set.of(0));
        Map<Integer,Integer> parent=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            parent.put(edges[i][1],edges[i][0]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            if (hasApple.get(i) && !visited.contains(i)){
                int temp=i;
                while(!visited.contains(temp)) {
                    visited.add(temp);
                    res += 1;
                    temp = parent.get(temp);
                }
            }
        }
        return res*2;
    }
}
