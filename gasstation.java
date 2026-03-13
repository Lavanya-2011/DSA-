class gasstation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];

            totalGas += diff;
            currentGas += diff;

            if (currentGas < 0) {
                start = i + 1;
                currentGas = 0;
            }
        }

        if (totalGas >= 0)
            return start;
        else
            return -1;
    }

    public static void main(String[] args) {

        gasstation obj = new gasstation();

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        int result = obj.canCompleteCircuit(gas, cost);

        System.out.println("Starting Gas Station Index: " + result);
    }
}