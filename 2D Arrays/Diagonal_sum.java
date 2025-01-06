public class Diagonal_sum{
    
    public static void Diagonal_sum_matrix(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            //primary diagonal
            if(i==j){
                sum+=matrix[i][j];
            }
            //secondary diagonal
            if(i+j==matrix.length-1){
                sum+=matrix[i][j];
            }
        }
        }
        //O(n^2)
   System.out.println("Diagonal sum of the matrix using BruteForce methode is :"+ sum);}

    public static void Diagonal_linear_complexity(int matrix[][]){
        int sum = 0;
        for (int i=0;i<matrix.length;i++){
            if(i!= matrix.length-i-1){
                //secondary diagonal
                sum+=matrix[i][matrix.length-i-1];
            }
            //primary diagonal
            sum+=matrix[i][i];

        }
        System.out.println("Diagonal sum for linear time complexity: "+ sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        Diagonal_sum_matrix(matrix);
        Diagonal_linear_complexity(matrix);
    }}
