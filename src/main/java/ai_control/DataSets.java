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

        Double [] tempDataTupleo = {0.0, 0.0, 0.0};
        OR_DATA.add(tempDataTupleo);
        Double [] tempDataTuple1o = {0.0, 1.0, 1.0};
        OR_DATA.add(tempDataTuple1o);
        Double [] tempDataTuple2o = {1.0, 0.0, 1.0};
        OR_DATA.add(tempDataTuple2o);
        Double [] tempDataTuple3o = {1.0, 1.0, 1.0};
        OR_DATA.add(tempDataTuple3o);
    }


}
