package Task3;

import java.util.List;

public class Exceptions3 {

    public static void main(String[] args) {
        /*
        Names names = new Names(new String[]{"David", "Eva", "Edvard", "Shon", "Eva"});
        try {
            names.validateUnique();
        } catch(NotUniqueNamesException ex){
            System.out.println(ex);
        }
        */
        List<Integer> countersForZero = null;
        List<Integer> countersForOnes = null;
        int counterForZero = 0;
        int counterForOnes = 0;
        int[] nums = new int[]{0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0};
        for(int i = 0; i < nums.length; i++){
            while(nums[i] == 0){
                counterForZero++;
                i++;
            }
            countersForZero.add(counterForZero);
            counterForZero = 0;
            while(nums[i] == 1){
                counterForOnes++;
                i++;
            }
            countersForOnes.add(counterForOnes);
            counterForOnes = 0;
        }
    }
}