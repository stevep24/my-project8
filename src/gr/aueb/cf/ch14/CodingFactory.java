package gr.aueb.cf.ch14;

public class CodingFactory {

    private static final CodingFactory INSTANCE = new CodingFactory(); //pre-defined inscance

    private CodingFactory(){

    }

    public static  CodingFactory getInstance(){
        return INSTANCE;
    }


}
