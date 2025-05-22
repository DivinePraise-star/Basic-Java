public interface Businesz {
    int License=100;
    void expenditure(int Rent);
    default void printSlogan(String S){
        System.out.println("Business Slogan is "+S);
    }
    static void printAddress(String A){
        System.out.println("Business location is "+A);
    }
}
