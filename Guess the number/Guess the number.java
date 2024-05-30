public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long num=(int)(1000000*Math.random());
        System.out.print("Guess a no.: ");
        long guess=sc.nextLong();

        if(guess<num){
            System.out.println("Your guess is lower than the no.");
        } else if(guess>num){
            System.out.println("Your guess is higher than the no.");
        } else if(guess==num){
            System.out.println("Your guess is correct");
        }else{
            System.out.println("invalid guess");
        }
    }
}
