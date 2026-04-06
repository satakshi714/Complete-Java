public class UnstableServerTernaryOperator {
    public static void main(String[] args) {

        int CPUusage = 60;
        int memoryUsage = 92;
        String server = CPUusage < 85 || memoryUsage  < 90 ? "Server stable" : "Server Unstable";
        System.out.println("Q17: "+ server);
    }
    
}
