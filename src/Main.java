public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №1 Массивы");
        System.out.println("__________________Задача 1_____________________");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println();

        //--------------------------------------------//

        double[] weight1 = {1.57, 7.654, 9.986};

        //--------------------------------------------//

        System.out.println();

        int[] weight2 = {9, 6, 7};

        System.out.println("_______________________________________________");

        System.out.println("__________________Задача 2_____________________");
        for (int index = 0; index < weight.length; index++) {
            if (index == weight.length - 1) {
                System.out.println(weight[index] + " ");
                break;
            }
            System.out.print(weight[index] + ", ");
        }
        for (int index = 0; index < weight1.length; index++) {
            if (index == weight1.length - 1) {
                System.out.println(weight1[index] + " ");
                break;
            }
            System.out.print(weight1[index] + ", ");
        }
        for (int index = 0; index < weight2.length; index++) {
            if (index == weight2.length - 1) {
                System.out.println(weight2[index] + " ");
                break;
            }
            System.out.print(weight2[index] + ", ");
        }


        System.out.println("__________________Задача 3_____________________");

        for (int i = weight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight[i] + " ");
                break;
            }
            System.out.print(weight[i] + ", ");

        }

        for (int i = weight1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight1[i] + " ");
                break;
            }
            System.out.print(weight1[i] + ", ");
        }

        for (int i = weight2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight2[i] + " ");
                break;
            }
            System.out.print(weight2[i] + ", ");
        }

        System.out.println("_______________________________________________");

        System.out.println("__________________Задача 4_____________________");

        for (int i = 0; i < weight.length; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("_______________________________________________");


    }


}