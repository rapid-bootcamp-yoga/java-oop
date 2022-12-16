package Logic.logic01;

import Logic.BasicLogika;

public class Logic01Soal01 extends BasicLogika {
    public Logic01Soal01(int n) {
        super(n);
    }

    public void isiArray(){
        int angka = 1;
        for (int i = 0; i < this.n; i++){
            this.array[0][i]= String.valueOf(angka);
            angka += 1;
        }
    }

    public void cetakArray() {
        System.out.println("hasil logic 01-soal 01 :");
        this.isiArray();
        this.printSingle();
    }
}


