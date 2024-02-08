package algorithms.island;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindNoOfIslands {

    public static void main(String[] args) throws IOException {
        /*
        int arr[][] ={
                { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1 }
        };
        int rows = arr.length;
        int columns = arr[0].length;

        //to print the array
        for(int i =0; i< rows ;i++){
            for(int j= 0; j < columns; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        //find number of Islands
        int noOfIslands = 0;
        for(int i =0; i< rows ;i++){
            for(int j= 0; j < columns; j++){
               if(arr[i][j] == 1){
                   noOfIslands = noOfIslands+1;
                   searchIslandsInAdjacent(arr, i, j);
               }
            }

        }

        System.out.println("noOfIslands "+noOfIslands);

         */


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    /* System.out.println("Print the rows");
     int rows = Integer.parseInt(bufferedReader.readLine());
     System.out.println("Print the rows");
     int columns = Integer.parseInt(bufferedReader.readLine());*/
      /*  int[][] arr = new int[rows][columns];
        for(int i =0; i< rows ;i++){
            System.out.println("i is"+i +" row is "+rows);
            String parts = bufferedReader.readLine();
            for(int j= 0; j < columns; j++){
                arr[i] [j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }*/
        int arr[][] = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };
        int rows = arr.length;
        int columns = arr[0].length;
        int numOfIsLand = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == 1) {
                    numOfIsLand += 1;
                    searchInAdjacent(arr, i, j);
                }
            }
        }
        System.out.println("Number of island "+numOfIsLand);
    }

    public static void searchInAdjacent(int[][] arr , int i, int j){
        if(i<0 || j<0 || i>= arr.length || j>= arr[0].length||arr[i][j] == 0 || arr[i][j]==2){
            return;
        }
        if(arr[i][j]==1){
            arr[i][j] =2;
        }
        searchInAdjacent(arr, i-1, j);
        searchInAdjacent(arr, i+1, j);
        searchInAdjacent(arr, i , j-1);
        searchInAdjacent(arr, i, j+1);
    }

    public static void searchIslandsInAdjacent(int[][] arr, int i, int j){
        if(i <0 ||j<0|| j>= arr[0].length || i>= arr.length|| arr[i][j] == 0 || arr[i][j] == 2){
            return;
        }
        if(arr[i][j] == 1){
            arr[i][j] =2;
        }
        searchIslandsInAdjacent(arr, i-1,j);
        searchIslandsInAdjacent(arr, i+1,j);
        searchIslandsInAdjacent(arr, i,j-1);
        searchIslandsInAdjacent(arr,i, j+1);

    }
}
