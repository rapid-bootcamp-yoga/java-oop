package Logic.logicInterface.logic02Impl;

import Logic.BasicLogika;
import Logic.logicInterface.LogicInterface;

public class Logic02Soal01Impl implements LogicInterface {
    private final BasicLogika logic;

    public Logic02Soal01Impl(BasicLogika logic) {
        this.logic = logic;
    }

    public void isiArray(){
        for (int i = 0 ; i < this.logic.n; i++){
            int angka = 1;
            //kolom
            for(int j = 0; j < this.logic.n; j++) {
                if(i==j || i+j == this.logic.n-1 ){
                    this.logic.array[i][j] = String.valueOf(angka);
                }
                angka++;
            }
        }
    }

    @Override
    public void cetakArray() {
        System.out.println("hasil logic 01-soal 01 with interface :");
        this.isiArray();
        this.logic.print();
    }
}
