package gr.aueb.cf.ch7;

/**
 * StringBuilder is not immutable.
 */
public class StrBuilderApp {

    public static void main(String[] args) {
        String concatStr = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;
        double stringBuilderElapsedTime = 0.0;
        StringBuilder sb = new StringBuilder();

        timeStart = System.currentTimeMillis();
        for (int i = 1; i < 100_000; i++) {
        concatStr += i;
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i < 100_000; i++) {
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        stringBuilderElapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.printf("String elapsed time: %.4f seconds.\n", elapsedTime);
        System.out.printf("String builder elapsed time: %.4f seconds.", stringBuilderElapsedTime);

    }
}
