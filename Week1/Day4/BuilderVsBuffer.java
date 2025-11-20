package Week1.Day4;

public class BuilderVsBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("A");
                sb2.append("A");
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            ;
        }
        System.out.println("StringBuffer: "+sb.length()); //2000
        System.out.println("StringBuilder: "+sb2.length()); //1992, 1998 it differentiates due to loss of
    }
}
