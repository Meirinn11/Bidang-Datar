public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    float sisiA;
    float sisiB;
    float sisiC;

public Segitiga(float alas, float tinggi, float sisiA, float sisiB, float sisiC){
    this.alas = alas;
    this.tinggi = tinggi;
    this.sisiA = sisiA;
    this.sisiB = sisiB;
    this.sisiC = sisiC;
}

@Override
float luas(){
    return 0.5f*this.alas* this.tinggi;
}
@Override
float keliling() {
    return this.sisiA + this.sisiB + this.sisiC;
    }
}