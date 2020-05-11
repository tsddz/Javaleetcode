package Test5405;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Test5405 {
    public static void main(String[] args)
    {
        var S=new Solution();
        int n=7;
        int[][] edges={{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
//        Boolean[] hasApple={false,false,true,false,true,true,false};
//        List<Boolean> hasApple={false,false,true,false,true,true,false};
        List<Boolean> hasApple=new ArrayList<>(List.of(false,false,true,false,true,true,false));
        System.out.println(S.minTime(n,edges,hasApple));
    }
}

class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        return 1;

    }
}

