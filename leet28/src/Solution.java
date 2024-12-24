import java.util.ArrayList;

class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1 || numRows >= s.length()){
            return s;
        }

        int index = 0, direction = 1;
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            result.add(new ArrayList());
        }

        for(Character c : s.toCharArray()){

            result.get(index).add(c.toString());

            if(index == 0){
                direction = 1;
            } else if (index == numRows - 1){
                direction = -1;
            }

            index += direction;
        }

        String finalResult = new String();

        for(ArrayList arr : result){
            finalResult += String.join("", arr);
        }

        return finalResult;
    }
}