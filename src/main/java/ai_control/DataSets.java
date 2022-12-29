package ai_control;

import java.util.ArrayList;

public class DataSets {
    private DataSets(){

    }
    public static final ArrayList<Double[]> AND_DATA = new ArrayList<>();
    public static final ArrayList<Double[]> OR_DATA = new ArrayList<>();
    public static final ArrayList<Double[]> NAND_DATA = new ArrayList<>();
    public static final ArrayList<Double[]> NOR_DATA = new ArrayList<>();
    public static final ArrayList<Double[]> NOT_DATA = new ArrayList<>();
    public static final ArrayList<Double[]> XOR_DATA = new ArrayList<>();
    public static final ArrayList<Double[]> XNOR_DATA = new ArrayList<>();

    static {
        Double [] tempDataTuple = {0.0, 0.0, 0.0};
        AND_DATA.add(tempDataTuple);
        Double [] tempDataTuple1 = {0.0, 1.0, 0.0};
        AND_DATA.add(tempDataTuple1);
        Double [] tempDataTuple2 = {1.0, 0.0, 0.0};
        AND_DATA.add(tempDataTuple2);
        Double [] tempDataTuple3 = {1.0, 1.0, 1.0};
        AND_DATA.add(tempDataTuple3);

        Double [] NOT = { 0.0, 1.0};
        NOT_DATA.add(NOT);
        Double [] NOT1 = { 1.0, 0.0};
        NOT_DATA.add(NOT1);


        Double [] var1 = {0.0, 0.0, 1.0};
        NAND_DATA.add(var1);
        Double [] ver2 = {0.0, 1.0, 1.0};
        NAND_DATA.add(ver2);
        Double [] var3 = {1.0, 0.0, 1.0};
        NAND_DATA.add(var3);
        Double [] var4 = {1.0, 1.0, 0.0};
        NAND_DATA.add(var4);

        Double [] tempDataTupleo = {0.0, 0.0, 0.0};
        OR_DATA.add(tempDataTupleo);
        Double [] tempDataTuple1o = {0.0, 1.0, 1.0};
        OR_DATA.add(tempDataTuple1o);
        Double [] tempDataTuple2o = {1.0, 0.0, 1.0};
        OR_DATA.add(tempDataTuple2o);
        Double [] tempDataTuple3o = {1.0, 1.0, 1.0};
        OR_DATA.add(tempDataTuple3o);


        Double [] s1 = {0.0, 0.0, 1.0};
        NOR_DATA.add(s1);
        Double [] s12 = {0.0, 1.0, 0.0};
        NOR_DATA.add(s12);
        Double [] s122 = {1.0, 0.0, 0.0};
        NOR_DATA.add(s122);
        Double [] s13 = {1.0, 1.0, 0.0};
        NOR_DATA.add(s13);

        Double [] xnor1 = {0.0, 0.0, 1.0};
        XNOR_DATA.add(xnor1);
        Double [] xnor2 = {0.0, 1.0, 0.0};
        XNOR_DATA.add(xnor2);
        Double [] xnor12 = {1.0, 0.0, 0.0};
        XNOR_DATA.add(xnor12);
        Double [] xnor13 = {1.0, 1.0, 1.0};
        XNOR_DATA.add(xnor13);


        Double [] xor1 = {0.0, 0.0, 0.0};
        XOR_DATA.add(xor1);
        Double [] xor2 = {0.0, 1.0, 1.0};
        XOR_DATA.add(xor2);
        Double [] xor3 = {1.0, 0.0, 1.0};
        XOR_DATA.add(xor3);
        Double [] xor4 = {1.0, 1.0, 0.0};
        XOR_DATA.add(xor4);

    }


}
