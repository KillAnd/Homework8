public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int [] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        System.out.println(one[0]);

        double [] two = {1.57, 7.654, 9.986};
        System.out.println(two[0]);

        int [] threeTime = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        System.out.println(threeTime[4]);

        //task 2
        System.out.println("Task 2");
        for(int i=0; i < one.length; i++) {
            if (i == one.length - 1) {
                System.out.println(one[i]);
                break;
            }
            System.out.print(one[i] + ", ");
        }

        for (int i=0; i < two.length; i++) {
            if (i == two.length - 1) {
                System.out.println(two[i]);
                break;
            }
            System.out.print(two[i] + ", ");
        }

        for (int i = 0; i < threeTime.length; i++) {
            if (i == threeTime.length - 1) {
                System.out.println(threeTime[i]);
                break;
            }
            System.out.print(threeTime[i] + ", ");
        }


    }
}