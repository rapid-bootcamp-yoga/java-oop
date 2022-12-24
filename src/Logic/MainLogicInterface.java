package Logic;

import Logic.logicInterface.LogicInterface;
import Logic.logicInterface.logic01Impl.Logic01Soal1Impl;
import Logic.logicInterface.logic02Impl.Logic02Soal01Impl;

public class MainLogicInterface {
    public static void main(String[] args) {
        // logic1 soal1
        LogicInterface logic01Soal01 = new Logic01Soal1Impl(new BasicLogika(9));
        logic01Soal01.cetakArray();

        LogicInterface logic02Soal01 = new Logic02Soal01Impl(new BasicLogika(8));
        logic02Soal01.cetakArray();
        
    }
}
