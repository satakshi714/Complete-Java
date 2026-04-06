
public class Solution {
	public static void main(String[] args) {
		Almanac a = new Almanac();
		a.assignProject("Agent47", "Mission 2873");
		a.assignProject("Agent47", "Mission 2813");
		a.assignProject("Agent45", "Mission 9873");
		a.assignProject("Agent41", "Mission 5873");
		System.out.println(a.currentProjects("Agent41"));
		System.out.println(a.finishProject("Agent47", "Mission 2873"));
		
	}
}
