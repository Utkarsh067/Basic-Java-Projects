class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First No.");
        float num1=sc.nextInt();

        System.out.println("Enter Second No.");
        float num2=sc.nextInt();

         System.out.print("You have entered : ");
         System.out.println(num1 + " and "+ num2);

         String prompt="Enter 0 for addition, 1 for subtraction, 2 for multiplication, 3 for division, 4 for modulus";
         System.out.println(prompt);

         System.out.println("Enter input");
         int input=sc.nextInt();

         switch(input){
            case 0:
            System.out.println("Adding these numbers:");
            System.out.println(num1 + num2);
            break;

            case 1:
            System.out.println("Subtracting these numbers:");
            System.out.println(num1 - num2);
            break;

            case 2:
            System.out.println("Multiplying these numbers:");
            System.out.println(num1 * num2);
            break;

            case 3:
            System.out.println("Dividing these numbers:");
            System.out.println(num1 / num2);
            break;

            case 4:
            System.out.println("Modulus of these numbers:");
            System.out.println(num1 % num2);
            break;

            default:
            System.out.println("You have entered wrong input");
         }
    }
}
