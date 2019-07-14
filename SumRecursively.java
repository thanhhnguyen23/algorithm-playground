public class SumRecursively {
    public static void main(String[] args) {

        Integer result = sumRecursively(12);
        System.out.println(result);
    }

    private static Integer sumRecursively(Integer n){
        if(n == 1) return 1;
        else return (n + sumRecursively(n - 1));
    }
}
