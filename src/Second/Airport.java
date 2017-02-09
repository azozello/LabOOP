package Second;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Airport {

    private String airlines;

    private float price;

    private int passengers;

    public String getAirlines() {
        return airlines;
    }

    public float getPrice() {
        return price;
    }

    public int getPassengers() {
        return passengers;
    }

    public void Count(){
        System.out.println("File`s path is: ");
        System.out.println("D:\\UseFull\\IOTemps\\test.txt");
        try {
            File tempFile = new File("D:\\UseFull\\IOTemps\\test.txt");
            FileWriter fw = new FileWriter(tempFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(this.toString());
            bw.close();
            fw.close();
        } catch (IOException e){
            System.out.println("File Error: ");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Unexpected Error: ");
            e.printStackTrace();
        }
        System.out.println("SUCCESS");
    }

    @Override
    public String toString() {
        return "Airlines: "+this.airlines+"   |   "+
                "Income: "+price*passengers*30+"   |   "+
                "Passengers: "+passengers*30;
    }

    public Airport(String airlines, float price, int passengers) {
        this.airlines = airlines;
        this.price = price;
        this.passengers = passengers;
    }
}
