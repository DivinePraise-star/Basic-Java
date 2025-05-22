public interface R {
    void a(double A);
    default void d(double D){
        System.out.println(D*D);
    }
    static void s(int S){
        System.out.println(S);
    }
}
