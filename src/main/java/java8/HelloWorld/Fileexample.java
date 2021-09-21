package java8.HelloWorld;

import java.io.*;

public class Fileexample {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("C://Demo//demo.txt")));
             bufferedWriter = new BufferedWriter(new FileWriter(new File("C://Demo//demo_out.txt")));
            String currentLine;
            while((currentLine =br.readLine()) != null){
                System.out.println(currentLine);
                bufferedWriter.write(currentLine);

            }
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
        }
    }
}
