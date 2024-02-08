package test.text;

public class TestExample {
    public static void main(String[] args){
        System.out.println("Hi");
        System.out.println(UserAction.valueOf("c67"));
       System.out.println( UserAction.valueOf("c"+"0"));
      /*  int[] arr = {1,2,3,3,4,4,5,5,6,7};
        List<Integer> list = new ArrayList<>();
        for(int i =0 ; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                //duplicate element
                if(arr[i] == arr[j]){
                    list.add(arr[i]);
                }
            }
        }
        Collections.sort(list, new  NumberComparator());

        list.forEach(e -> System.out.println(e));
*/

    }

    public enum UserAction {
        c0("Zero") ,
        c1("one");
        public final String label;

        private UserAction(String label) {
            this.label = label;
        }
    }
}
