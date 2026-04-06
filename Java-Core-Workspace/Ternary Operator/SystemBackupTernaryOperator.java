public class SystemBackupTernaryOperator {
    public static void main(String[] args) {

        boolean midnight = false;
        String serverLoad = "high";
        boolean maintenanceMode = true;
        String backup = ((serverLoad == "low" || maintenanceMode) && midnight) ? "Run system backup" : "Don't run backup";
        System.out.println("Q26: " + backup);
    }
}
