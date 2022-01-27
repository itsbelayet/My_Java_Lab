package ProblemSolving;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        Object [] subj = {2,7,4,2,12,"Miru",25,7,"Hiru",1,"Miru",3,4,5};
        removDuplicate(subj);
    }
    public static void removDuplicate(Object[] subj){
        Set<Object> newList=new HashSet<>();        // Set did not allow duplicate Value
        for (Object element:subj) {
            if (element instanceof String){
                newList.add((String)element);
            }else if (element instanceof Integer){
                newList.add((Integer)element);
            }
        }
        System.out.println(newList);
    }
}
