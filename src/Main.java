import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача № 1");
        int [] cars = new int[]{1, 2, 3};
        float [] bikes = new float[]{1.57f, 7.654f, 9.986f};
        float [] cakes = new float[]{3.64f, 5.845f, 9.3545f};


        System.out.println("Задача № 2");
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]);
            if (i!= cars.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i =0; i < bikes.length; i++){
            System.out.print(bikes[i]);
            if (i!= bikes.length-1){
                System.out.print(" ,");
            }
        }
        System.out.println();

        for (int i = 0; i< cakes.length; i++){
            System.out.print(cakes[i]);
            if (i!= cakes.length - 1){
                System.out.print(" ,");
            }
        }
        System.out.println();


        System.out.println("Задача № 3");
        for (int i = cars.length - 1; i>=0; i--){
            System.out.print(cars[i]);
            if (i!= cars.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = bikes.length - 1; i>=0; i--){
            System.out.print(bikes[i]);
            if (i!= bikes.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = cakes.length - 1; i>=0; i--){
            System.out.print(cakes[i]);
            if (i!= cakes.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();


        System.out.println("Задача №4");
        for (int i =0; i< cars.length; i++){
            if (cars[i] % 2 != 0){
                cars[i]++;
                System.out.println(Arrays.toString(cars));
            }
        }


    }
}