public class BujurSangkar extends BangunDatar {
 float sisi;

    public BujurSangkar (float sisi) {
        this.sisi= sisi;
    }

@Override
float luas() {
    return sisi*sisi;
}
@Override
float keliling(){
    return 4*sisi;
    }
}