class Test {
    static long sum(int[] a) {
        int sum = 0;
        for(long val : a) sum += val;
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        long len = sum(a);
        System.out.println(len);
    }
}
