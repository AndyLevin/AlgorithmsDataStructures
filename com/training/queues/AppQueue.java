import java.io.*;
import java.util.*;

class AppQueue {
    public static void main(String args[]) {
        Queue exQ1 = new Queue(35);
        Queue exQ2 = new Queue(35);
        Queue exQ3 = new Queue(35);
        Scanner sc = new Scanner(System.in);
        int tempTime = Queue.random(10);
        exQ3.insert(Queue.random(10));
        exQ2.insert(Queue.random(10));
        exQ1.insert(Queue.random(10));

        int curQ1 = exQ1.peekFront();
        int curQ2 = exQ2.peekFront();
        int curQ3 = exQ3.peekFront();

// System.out.println("tempTime = " + tempTime + "; " + " curQ1 = " + curQ1 + " curQ2 =" + curQ2 + " curQ3 = " + curQ3);

        System.out.println("Queue1");
        exQ1.display();
        System.out.println("");
        System.out.println("Queue2");

        exQ2.display();
        System.out.println("");
        System.out.println("Queue3");

        exQ3.display();
        System.out.println("");
        System.out.println("");
        System.out.println("###########################**************************");

        for (int i = 0; i < 5000; i++) {
            tempTime--;
            if (curQ1 > 0) {
                curQ1--;
            }
            if (curQ2 > 0)
                curQ2--;
            if (curQ3 > 0)
                curQ3--;
            // System.out.print(" " + tempTime);
            if (tempTime == 0 || tempTime < 0) {

                if ((exQ1.size() <= exQ2.size()) && (exQ1.size() <= exQ3.size())) {
                    exQ1.insert(Queue.random(10));
                    if (exQ1.size() == 1) {
                        curQ1 = exQ1.peekFront();
                    }
                } else if ((exQ2.size() <= exQ3.size()) && (exQ2.size() <= exQ1.size())) {
                    exQ2.insert(Queue.random(10));
                    if (exQ2.size() == 1) {
                        curQ2 = exQ2.peekFront();
                    }
                } else {


                    exQ3.insert(Queue.random(10));
                    if (exQ3.size() == 1) {
                        curQ3 = exQ3.peekFront();
                    }
                }

                System.out.println("### New customer ###");
                System.out.println(" ");
                tempTime = Queue.random(3);
            }

            if (curQ1 == 0) {
                if (!(exQ1.isEmpty()))
                    exQ1.remove();
                if (!(exQ1.isEmpty())) {
                    curQ1 = exQ1.peekFront();
                } else curQ1 = -2;
                // System.out.println("****curQ1" + curQ1);

            }


            if (curQ2 == 0) {
                if (!exQ2.isEmpty())
                    exQ2.remove();
                if (!exQ2.isEmpty()) {
                    curQ2 = exQ2.peekFront();
                } else curQ2 = -2;
            }


            if (curQ3 == 0) {
                if (!exQ3.isEmpty())
                    exQ3.remove();
                if (!exQ3.isEmpty())
                    curQ3 = exQ3.peekFront();
                else curQ3 = -2;
            }

            //System.out.println(" ****curQ1= " + curQ1 + " ****curQ2= " + curQ2 +" ****curQ3= " + curQ3);
            // System.out.println("###tempTime###" + tempTime);
            System.out.println("Queue1");
            exQ1.display();
            System.out.println("");
            System.out.println("Queue2");

            exQ2.display();
            System.out.println("");
            System.out.println("Queue3");

            exQ3.display();
            System.out.println("");
            System.out.println("");
            System.out.println("**************************");
        }
    }
}

