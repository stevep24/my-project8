package gr.aueb.cf.ch4;

/**
 * for nuns  forever, idiomatic case
 */
public class ForeverApp {

    public static void main(String[] args) {

        int count = 0;
        for(;;){
            System.out.print("Forever ");
            count ++;
            if (count % 10 == 0) System.out.println();
            //if (count == 100)break;
        }
    }
}
