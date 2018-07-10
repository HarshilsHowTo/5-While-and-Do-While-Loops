
public class WhileDoWhile {

    public static void main(String[] args) {

        int num = 0;
        boolean terminatedNow = false;

        while(num <= 10 && terminatedNow){
            System.out.println("Hello Java");
//            if(num == 6){
//                continue;
//            }
            num++; //can alternatively use += if incrememnting by more than 1
//            if(num == 6){
//                break;
//            }
        }


//      Currently prints out Hello Java once. 
        do{
            System.out.println("Hello Java");
        }while (false);

    }
}
