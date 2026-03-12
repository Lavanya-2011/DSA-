class count {

    static int countElements(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = new int[4];
        arr[0] = 30;
        arr[1] = 11;
        arr[2] = 31;
        arr[3] = 40;

        int result = countElements(arr);
        System.out.println("Count = " + result);
    }
}