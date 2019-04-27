public class Output_from_till {

    public static void main (String [] arg){

        System.out.println("Программа с помощью цикла выводит на экран числа от 1 до 50");
        System.out.print("Let's go \n");

        for (int i = 1; i <= 50; i++){

            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
