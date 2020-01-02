package datastructure;

import javax.jnlp.IntegrationService;
import java.util.*;

public class FindPositionDuplicateOfArrays {

    public static void main(String[] args){

        int[] arr={1,5,3,1,5,2,3,1};

        Map<Integer, List<Integer>> posAndValues=new HashMap<>();
        for(int j=0;j<arr.length;j++){

            if(posAndValues.containsKey(arr[j])){
                List<Integer> existIndex=posAndValues.get(arr[j]);
                existIndex.add(j);
            }else{
                List<Integer> indexlist=new ArrayList<>();
                indexlist.add(j);
                posAndValues.put(arr[j],indexlist);
            }
        }

        for(Map.Entry<Integer,List<Integer>> v:posAndValues.entrySet()){
            System.out.println("Value="+v.getKey()+" Index Positions="+v.getValue());
        }
    }
}
