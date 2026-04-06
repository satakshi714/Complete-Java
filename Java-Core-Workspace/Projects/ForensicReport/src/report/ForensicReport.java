package report;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ForensicReport {
	private Map<String, Date> reportMap = new HashMap<>();
	
	public Map<String, Date> getReportMap(){
		return reportMap;
	}
	public void setReportMap(Map<String, Date> reportMap) {
		this.reportMap = reportMap;
	}
	
	public void addReportDetails(String reportingOfficerName, Date reportFileDate) {
		reportMap.put(reportingOfficerName, reportFileDate);
	}
	public List<String> getOfficersWhoFiledReportsOnDate(Date reportFiledDate){
		List<String> result = new ArrayList<>();
		for(Map.Entry<String, Date> entry : reportMap.entrySet()) {
			if(entry.getValue().equals(reportFiledDate)) {
				result.add(entry.getKey());
			}
		}
		if(result.isEmpty()) {
			System.out.println("No reports found");
		}
		return result;
	}
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		ForensicReport obj = new ForensicReport();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Enter value: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] parts = input.split(":");
			String reportingOfficerName = parts[0];
			
			Date reportFileDate = sdf.parse(parts[1]);
			obj.addReportDetails(reportingOfficerName, reportFileDate);
		}
		Date search = sdf.parse(sc.nextLine());
		List<String> res = obj.getOfficersWhoFiledReportsOnDate(search);
		for(String name : res) {
			System.out.println(name);
		}
	
		
	}
}
