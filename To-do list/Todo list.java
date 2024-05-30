import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Choice;
        List<String> tasks=new ArrayList<>();

        do{
            System.out.println("Which Task you want to perform: ");
            System.out.println("1: Add Task");
            System.out.println("2: Delete Task");
            System.out.println("3: View All Tasks");
            System.out.println("4: Quick Note");
            System.out.println("5: Exit");

            Choice=sc.nextInt();
    
            switch (Choice) {
                case 1:
                    System.out.println("Enter Task: ");
                    sc.nextLine();
                    String task1=sc.nextLine();
                    tasks.add(task1);
                    break;
                case 2:
                    System.out.println("Enter Task: ");
                    sc.nextLine();
                    String task2=sc.nextLine();
                    tasks.remove(task2);
                    break;
                case 3:
                    for(int i=0;i<tasks.size();i++){
                        System.out.println((i+1)+". " +tasks.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Enter Quick Note: ");
                    sc.nextLine();
                    String task4=sc.nextLine();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid input. Please try again");
                    break;
            }

        } while(Choice != 5);
        sc.close();
    }
}
