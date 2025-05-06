package basics;

import java.util.Scanner;

public class LongestSubsequence {

    public void findLCS(String s1, String s2){
        int row = s1.length();
        int column = s2.length();
        int[][] arr = new int[row+1][column+1];

        for(int i =0; i<= row ; i++){
            for(int j=0; j<= column; j++){
                if(i == 0 || j == 0){
                    arr[i][j] = 0;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    arr[i][j] = arr [i-1] [j-1] +1;
                }
                else{
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        System.out.println(arr[s1.length()][s2.length()]);

        int index = arr[row][column];

        char[] lcs = new char[index];

        int i =row, j =column;

        while(i > 0 && j >0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                lcs[index-1] = s1.charAt(i-1);
                i--;
                j--;
                index--;
            }
            else if(arr[i-1][j] > arr[i][j-1]){
                i--;
            }
            else{
                j--;
            }

        }

        System.out.println("LCS is"+new String(lcs));



    }



    public static void main(String[] args){
        System.out.println("enter a string");
        LongestSubsequence lcs = new LongestSubsequence();
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("s1"+s1);
        System.out.println("s2"+s2);
        lcs.findLCS(s1,s2);


    }
}
