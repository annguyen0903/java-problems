package src;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    private String input;
    public StringPermutation(String input) {
        this.input = input;
    }

    public int total() {
        // abc -> abc, acb, bac, bca, cab, cba
        // aac -> aac, aca, caa
        // abcd -> abcd, abdc, acbd, acdb, adbc, adcb, bacd, ...
        var counter = generatePermutation(input);
        counter.stream().forEach(System.out::println);;
        return counter.size();
    }

    // abc -> abc, acb, bac, bca, cab, cba
    private List<String> generatePermutation(String text){
        var results = new ArrayList<String>();
        if(text.length() == 0) {
            return results;//empty
        }
        if(text.length() == 1) {
            results.add(text);
            return results;//itself
        }
        if(text.length() == 2) {
            results.add(text);
            results.add(String.valueOf(text.charAt(1)) + 
                String.valueOf(text.charAt(0)));
            return results;//2 permutations
        }
        //text lenght >= 3 characters
        for (int i=0; i<text.length(); i++) {
            char curChar = text.charAt(i);
            //get sub string that excluse curChar
            //generate all possiple permutations for sub string
            //join curChar to each returned permutations
            //add new permutation to set
            String subText = "";
            if (i==0) {
                subText = text.substring(1);
            } else if (i == (text.length()-1)) {
                subText = text.substring(0, i);
            } else {
                subText = text.substring(0, i) + 
                text.substring(i+1);
            }
            //System.out.println("Substring of " + text + " is " + subText);
            var subPermutions = generatePermutation(subText);
            for (String subPer : subPermutions) {
                results.add(curChar + subPer);
            }
        }
        return results;
    }
    
}
