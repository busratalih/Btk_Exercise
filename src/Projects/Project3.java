package Projects;

public class Project3 {
    public static void main(String[] args) {

        // 6 mukemmel sayi --> 1,2,3
        //28 --> 1,2,4,7,14

        int number=28;
        int total=0;
        for (int i = 1; i <number ; i++) {
            if (number%i ==0){
                total=total+i;
            }
        }
        if (total==number){
            System.out.println("mukemmel sayidir");
        }else {
            System.out.println("mukemmel sayi degildir");
        }













    }
}
