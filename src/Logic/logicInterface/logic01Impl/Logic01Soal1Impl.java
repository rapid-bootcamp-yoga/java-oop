package Logic.logicInterface.logic01Impl;

import Logic.BasicLogika;
import Logic.logicInterface.LogicInterface;

public class Logic01Soal1Impl implements LogicInterface {

    private final BasicLogika logic;

    public Logic01Soal1Impl(BasicLogika logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int angka = 1;
        for(int i = 0; i< this.logic.n; i++) {
            this.logic.array[0][i] = String.valueOf(angka);
            angka += 1;
        }
    }

    @Override
    public void cetakArray() {
        System.out.println("hasil logic 01-soal 01 with interface :");
        this.isiArray();
        this.logic.printSingle();
    }
}
