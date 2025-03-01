public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar ;
    }
    @Override
    float luas (){
        return this.panjang*this.lebar;
    }
    @Override
    float keliling (){
        return 2*(this.panjang+this.lebar);
    }
}
