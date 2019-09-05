package sort.shell;

public class MyShellSort {
    public static void main(String[] args) {

        int[] intArray = {2,35,-15,7,55,1,-22};

        for(int gap = intArray.length / 2; gap > 0; gap /= 2){

            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                /**
                 * used to traverse
                 */
                int j = i;

                /**
                 * when intArray[j] > newElement condition
                 *  > then swap if the left operand is greater
                 *  > else traverse to the next element (with gap)
                 */
                while(j >= gap && intArray[j - gap] > newElement){
                    /**
                     * used to swap between the first element and the "gap" element
                     *  > if these two elements meet the condition
                     */
                    intArray[j] = intArray[j - gap];
                    j -= gap;

                }
                intArray[j] = newElement;
            }

        }

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }


}
