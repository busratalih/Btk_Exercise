package Projects;

public class Project1 {
    public static void main(String[] args) {


        int number=25;
        int remainder=number%2;
        System.out.println(remainder);
        boolean isPrime=true;

        for (int i=2; i<number; i++){
            if (number%i==0){
                isPrime=false;
            }
        }
        if (isPrime==true) {
            System.out.println("sayi asaldir");
        }else {
            System.out.println("sayi asal degildir");
        }














    }
}
