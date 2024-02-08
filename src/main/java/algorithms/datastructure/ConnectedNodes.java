package algorithms.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConnectedNodes {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = {
                { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1 }
        };

        int row = arr.length;
        int column = arr[0].length;
        System.out.println("row "+row);
        System.out.println("column "+column);
        int connectedNodes = 0;
        for(int i= 0; i < row; i++){
            for(int j=0; j< column; j++)
                if(arr[i][j] == 1){
                    connectedNodes = connectedNodes + 1;
                    searchAdjacent(arr, i, j);
                }
        }
        System.out.println("connectedNodes "+connectedNodes);

    }

    public static void searchAdjacent(int[][] arr, int i, int j ){
        if(i<0 || j<0 || i >= arr.length || j>= arr[0].length || arr[i][j] == 0 ||
        arr[i][j] == 2){
            return;
        }

        if(arr[i][j] == 1){
            arr[i][j] = 2;
        }

        searchAdjacent(arr, i-1,j);
        searchAdjacent(arr, i+1,j);
        searchAdjacent(arr, i,j-1);
        searchAdjacent(arr, i,j+1);


    }
}
