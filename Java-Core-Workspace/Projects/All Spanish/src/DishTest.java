import java.util.*;
public class DishTest {
	public List<Dish> addYummyToName(List<Dish> list){
		List<Dish> dishList = new ArrayList<>();
		for(Dish d : list) {
			Dish dish = new Dish("Yummu: "+d.getDishName());
			dishList.add(dish);
		}
		return dishList;
	}
	public long count(List<Dish> list, String s) {
		long c = 0;
		for(Dish d : list) {
			if(d.getDishName().contains(s)) {
				c++;
			}
		}
		return c;
	}
}
