public class WhileLoopPractise {

    public static void main(String[] args) {

//        I would recommend trying these for yourself before looking at them.
//        The second is slightly harder and is meant to be a challenge !

//        Printing out the even numbers up to 50

        int num = 0;

        System.out.println("Start of even numbers series");
        while(num <= 50){
            System.out.println(num);
            num+= 2;
        }
        System.out.println("End of even numbers series");

        System.out.println("================================");

//        Printing out the first 10 Fibonnaci numbers

//        Note here I've used System.out.print instead of System.out.println
//        This stops it printing on a new line every time

        System.out.print("Fibonacci Series:");

        int limit = 7;
        int curr=1;

        int num1 = 0;
        int num2 = 1;


        while(curr<=limit) {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            curr++;
        }
    }
}
