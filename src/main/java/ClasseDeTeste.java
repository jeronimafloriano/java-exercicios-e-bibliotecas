public class ClasseDeTeste {

    public static void main(String[] args) {
        var a = System.currentTimeMillis();
            Long sum = 0L; //assim vai demorar mais pq vai ser preciso fazer o autoboxing de Long para long
            for(long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i ;
            }
        var b =    System.currentTimeMillis();
        System.out.println(b-a);

        var c = System.currentTimeMillis();
        long sum2 = 0L;
        for(long i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 += i ;
        }
        var d =    System.currentTimeMillis();

        System.out.println(d-c);


    }
}
