public class Output_from_till {

    public static void main (String [] arg){

        int upper_border = 50;
        int lower_border = 1;

        System.out.println("Программа с помощью цикла выводит на экран числа от 1 до 50");
        System.out.print("Let's go \n");

        for (int i = lower_border; i <= upper_border; i++){

            System.out.println(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
