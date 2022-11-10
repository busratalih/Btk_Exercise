package Methods;

public class C02 {
    public static void main(String[] args) {

        String mesaj="bugun hava cok guzel";
        String yeniMesaj=mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi=topla();
        System.out.println(sayi);
        String yeniMesaj1=sehirVer();
        System.out.println(yeniMesaj1);


    }//main sonu

    public static void ekle(){
        System.out.println("eklendi");
    }
    public static void sil(){
        System.out.println("silindi");
    }
    public static void guncelle(){
        System.out.println("guncelle");
    }

    public static int topla(){
        return 5;
    }

    public static String sehirVer(){
        return "Ankara";
    }

}
