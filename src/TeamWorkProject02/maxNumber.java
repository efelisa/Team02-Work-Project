package TeamWorkProject02;

public class maxNumber {

      /*
        Create int 2D array,
        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}},
        print the max number from the 2d array
     */
     /*
         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}
         int 2D arrayinin max number print eden code create ediniz.
     */

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2,10,3}}; // in arr2D Array created
        int max = arr2D[0][0];                // ilk elemanı, en büyük varsayılan olarak ayarlayın


        // to find the maximum number in the 2D array
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] > max) {
                    max = arr2D[i][j];
                }
            }
        }
    // print rhe minimum number
        System.out.println("Minimum number in the arr2D = " + max);

    }

}
