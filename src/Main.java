public class Main {
    public static void main(String[] args) {
        int factors = 0 ;
        int[] prime ={};
        for(int i = 2;i<100;i++){
            factors = 0;
           for(int j=1;j<100;j++){
               if(i%j == 0){
                   factors += 1;
               }
           }
           if(factors==2){
               System.out.println(i);
           }
        }
       // System.out.println(prime);

    }
}