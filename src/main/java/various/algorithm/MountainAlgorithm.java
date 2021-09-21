package various.algorithm;

public class MountainAlgorithm {


        public boolean validMountainArray(int[] arr) {
            boolean isMountainArray = true;
            if(arr.length <3)
                return false;
            int median = arr.length/2;

            for(int i = 0;i< arr.length-1; i++){
                if(median <= i){
                    if(arr[i] <= arr[i+1]){
                        isMountainArray = false;
                        break;
                    }
                }else if(i+1 >= arr.length){
                    if(arr[i] > arr[i+1]){
                        isMountainArray = false;
                        break;
                    }
                }


            }
            return isMountainArray;
        }

        public static void main(String[] args){
            int[] arr = {0,3,2,1};
            MountainAlgorithm mountainAlgorithm = new MountainAlgorithm();
            System.out.println( mountainAlgorithm.validMountainArray(arr));
        }

}
