package String;

public class C02 {
    public static void main(String[] args) {


        String mesaj="bugun hava cok guzel";

        System.out.println(mesaj);

        System.out.println(mesaj.replace(' ', '-'));

        System.out.println(mesaj.substring(2));

        System.out.println(mesaj.substring(2,4));

        for (String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toUpperCase());







    }
}
