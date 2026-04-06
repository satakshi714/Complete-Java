package hotel;

public interface Room {
	public double calulateTotalBill(int nightsStayed, int joiningYear);
	public default int calulateMembershipYears(int joiningYear);
}
