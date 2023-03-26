package TeamWorkProject02;

public class minNumber {
 /*
        Create int 2D array
        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
        print the min number from the 2d array
     */

    /*
        {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        int 2D arrayinin min number print eden code create ediniz.
    */
    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}}; // in arr2D Array created
        int min = arr2D[0][0];                                   // int min. assigned

        // to find the minimum number in the 2D array
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] < min) {
                    min = arr2D[i][j];
                }
            }
        }
        // print rhe minimum number
        System.out.println("Minimum number in the arr2D = " + min);
    }
}
