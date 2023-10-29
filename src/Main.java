import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    /*System.out.println("Задача № 1");
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
    for (int i =0; i< cars.length; i++) {
        if (cars[i] % 2 != 0){
            cars[i]++;
        }
    }
    System.out.println(Arrays.toString(cars));*/
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача № 1");

        int[] salary = generateRandomArray();
        System.out.println(Arrays.toString(salary));

        int salaryRandom = 0;
        for (int income : salary) {
            salaryRandom += income;
        }
        System.out.println("Сумма трат за месяц составила " + salaryRandom + " рублей");

    }

    public static void task2() {
        System.out.println("Задача № 2");

        int[] salary = generateRandomArray();
        System.out.println(Arrays.toString(salary));

        int minSalary = 100_000;
        int maxSalary = 200_000;

        for (int income : salary) {
            if (income < minSalary) {
                minSalary = income;
            }
            if (income > maxSalary) {
                minSalary = income;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +
                minSalary + " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей");
    }

    public  static void task3() {
        System.out.println("Задача № 3");

        int[] salary = generateRandomArray();
        System.out.println(Arrays.toString(salary));

        int salaryRandom = 0;
        for (int income : salary) {
            salaryRandom += income;
        }

        double salaryAverage = (double) salaryRandom / salary.length;
        System.out.println("Средняя сумма трат за месяц составила " + salaryAverage + " рублей");
    }

    public  static void task4() {
        System.out.println("Задача № 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    }



