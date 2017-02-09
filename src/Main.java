import FIrst.CheckImpl;
import Fourth.Human;
import Second.Airport;
import Seventh.animals.Cheetah;
import Seventh.animals.Penguin;
import Seventh.animals.Seal;
import Seventh.parent.Animal;
import Sixth.CopyDevice;
import Third.Matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Choose your destiny!");
            while (true) {
                Integer toDo = Integer.parseInt(bf.readLine());
                switch (toDo) {
                    case 1:
                        CheckImpl tempCheck = new CheckImpl();
                        int[] tempIntArray = {1, 6, 4, 2, 6};
                        char[] tempCharArray = {'a', 'b', 'c', 'd', 'e'};
                        for (int tempInt : tempIntArray){
                            System.out.print(tempInt+" ");
                        }
                        System.out.println();
                        System.out.println(tempCheck.checkArray(tempIntArray, tempIntArray.length) ? "Descending" : "Somehow else");
                        System.out.println(tempCharArray);
                        System.out.println(tempCheck.checkArray(tempCharArray) ? "Descending" : "Somehow else");
                        break;
                    case 2:
                        System.out.println("Enter airlines:   ");
                        String airlines = bf.readLine();
                        System.out.println("Enter price:      ");
                        float price = Float.parseFloat(bf.readLine());
                        System.out.println("Enter passengers: ");
                        int passengers = Integer.parseInt(bf.readLine());

                        Airport tempAirport = new Airport(airlines,price,passengers);

                        System.out.println(tempAirport.getAirlines());
                        System.out.println(tempAirport.getPrice());
                        System.out.println(tempAirport.getPassengers());
                        System.out.println(tempAirport);

                        tempAirport.Count();
                        break;
                    case 3:
                        System.out.println("Enter size:");
                        Matrix tempMatrix = new Matrix(Integer.parseInt(bf.readLine()));
                        tempMatrix.print();
                        tempMatrix.changeNumbers();
                        System.out.println();
                        tempMatrix.print();
                        break;
                    case 4:
                        ArrayList<String> skills = new ArrayList<>();
                        skills.add("C#");
                        skills.add("Java");

                        Human tempHuman = new Human("Dima",18,1998,skills);
                        System.out.println(tempHuman);

                        tempHuman.addSkill("cashier");
                        tempHuman.count(2000);
                        System.out.println(tempHuman);
                        break;
                    case 5:
                        System.out.println("There is no operator overloading in Java...");
                        System.out.println("Sad but true!");
                        break;
                    case 6:
                        CopyDevice copyDevice = new CopyDevice(1,2,3,4);
                        CopyDevice cloneCopyDevice = copyDevice.clone();

                        System.out.println("Total price: "+copyDevice.totalPrice());
                        System.out.println("Used price:  "+copyDevice.usedPrice());

                        cloneCopyDevice.setPaper(5);
                        cloneCopyDevice.setInk(6);

                        System.out.println("Total price: "+cloneCopyDevice.totalPrice());
                        System.out.println("Used price:  "+cloneCopyDevice.usedPrice());
                        break;
                    case 7:
                        Animal animal = new Animal("Animal");
                        Cheetah cheetah = new Cheetah("Cheetah");
                        Seal seal = new Seal("Seal");
                        Animal penguin = new Penguin("Penguin");
                        animal.move();
                        cheetah.move();
                        seal.move();
                        penguin.move();
                        break;
                    case 8:
                        System.out.println("See bdtest project");
                        break;
                    case 0:
                        return;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
