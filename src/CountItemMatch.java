package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemMatch {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();

        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));

        String ruleKey = "color", ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));;
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        int count = 0;
        if (ruleKey == "color") {
            index = 1;
        }else if(ruleKey == "name"){
            index = 2;
        }

        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
