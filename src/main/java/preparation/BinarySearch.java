package preparation;

public class BinarySearch {

    public int findBinarySearch(int[] arr, int data,int begin, int end){
        int index = -1;

        while(begin <= end){
            int mid = (end - begin)/2 + begin;
            if(arr[mid] == data){
                return mid;
            }else if (arr[mid] > data){
              end = mid-1;
            }else{
              begin = mid+1;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(new BinarySearch().findBinarySearch(arr, 1, 0,arr.length-1));

    }
}
