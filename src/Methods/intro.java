package Methods;

public class intro {
    public static void main(String[] args) {

        System.out.println(sum(35,32));
        int var = 36;
        System.out.println(Math.sqrt(var));
        System.out.println(sum(4,34,5,34,23,24,523,5,2324,52344));
    }

    public static  int sum(int a , int b) {
        return a+b;
    }

    public static  int sum(int a,int b,int c){
        return a+b+c;
    }

    public static int sum(int ...variable){
        int output=0;
        for(int var :variable){
            output = output+var;
        }
        return output;
    }
}
