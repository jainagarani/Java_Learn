package designpattern.creational.builder;

public class BuilderExample {
    public static void main(String[] args){
        Computer.ComputerBuilder computerBuilder= new Computer.ComputerBuilder("23", "16");
        Computer computer = computerBuilder.setGraphicsEnabled(true).setBluetoothEnabled(true).build();
        System.out.println(computer);
    }
}
