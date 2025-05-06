package basics;

public class StringExample {
    public static void main(String[] args){
        String str = "Hello World";
        String[] strArray =str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i =0 ;i < strArray.length; i++){
            String str1 = strArray[i];
           for(int j =str1.length()-1; j>=0; j--){
               sb.append(str1.charAt(j));
           }
           sb.append(" ");

        }

        System.out.println("output"+sb.toString());
    }
}
