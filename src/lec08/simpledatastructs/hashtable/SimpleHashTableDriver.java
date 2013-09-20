package lec08.simpledatastructs.hashtable;

public class SimpleHashTableDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//try small numbers like 2, or 11
		SimpleHashTable<String> strCities = new SimpleHashTable<String>(2);
		
		//will allow duplicates -- watch-out
		strCities.add("Chicago");
		strCities.add("New York");
		strCities.add("Los Angeles");
		strCities.add("Shanghai");
		strCities.add("Moscow");
		
		
		strCities.printIterate();
		System.out.println();
		System.out.println(strCities.contains("Shanghai"));
	
		
		
		

	}

}
