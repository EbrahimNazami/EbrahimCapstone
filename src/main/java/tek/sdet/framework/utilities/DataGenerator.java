package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGenerator {
	
	public static String getData(String input) {
		
			Faker faker = new Faker();
			String result = "";
			if(input.equals("name")) {
				result = faker.name().firstName();
			}else if(input.equals("email")){
				result = faker.expression("#{letterify '????.????@tekschool.us'}");
			}else
				result = faker.expression("#{letterify '????.@tekschool.us'}");
			return result;
		}

	}


