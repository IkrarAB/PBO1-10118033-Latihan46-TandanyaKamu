package pbo1.pkg10118033.latihan46;

public class Age {
    private int yearBirth, yearNow;
    private final String red = "\u001b[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur(){
        return yearBirth-yearNow;
    }
    
    public String tandanyaKamu(int umur){
        System.out.print(red);
        if((0<=umur)&&(umur<=5)){
            System.out.println("LAGI LUCU-LUCU NYA");
        } else if((5<umur)&&(umur<=10)){
            System.out.println("MASIH ANAK-ANAK");
        } else if((10<umur)&&(umur<=13)){
            System.out.println("MASIH REMADJA");
        } else if((13<umur)&&(umur<=19)){
            System.out.println("ALAY");
        } else if((19<umur)&&(umur<=29)){
            System.out.println("LAGI GALAU NYARI JODOH");
        } else if((29<umur)&&(umur<=35)){
            System.out.println("LAGI SIBUK NYARI UANG");
        } else if((35<umur)&&(umur<=150)){
            System.out.println("SUDAH TUA");
        } else
            System.out.println("TIDAK TERDETEKSI DI KEHIDUPAN");
        return red;
    }
}