import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class Driver {
	
	public static void e1() {
		JsonObject data = new JsonObject();
        data.add("department", "cse");
        data.add("course", 115);
        System.out.println(data);
	}
	
	public static void e2() {
		JsonArray data = new JsonArray();
        data.add(5);
        data.add(8);
        data.add("data");
        data.add("elements");
        System.out.println(data);

	}
	
	public static void e3() {
		JsonObject cse115Object = new JsonObject();
        cse115Object.add("department", "cse");
        cse115Object.add("course", 115);

        JsonObject cse116Object = new JsonObject();
        cse116Object.add("department", "cse");
        cse116Object.add("course", 116);

        JsonArray data = new JsonArray();
        data.add(5);
        data.add(8);
        data.add("data");
        data.add("elements");
        data.add(cse115Object);
        data.add(cse116Object);

        System.out.println(data);
	}
	
	public static void e4() {
		String jsonString = "{\"department\":\"cse\",\"course\":115}";
        JsonValue jsonValue = Json.parse(jsonString);
        JsonObject jsonObject = jsonValue.asObject();

        JsonValue departmentValue = jsonObject.get("department");
        String department = departmentValue.asString();

        JsonValue courseValue = jsonObject.get("course");
        int courseNumber = courseValue.asInt();

        System.out.println(department + courseNumber);
	}
	
	public static void e5() {
		String jsonString = "[5,8,\"data\",\"elements\"]";
        JsonValue jsonValue = Json.parse(jsonString);
        JsonArray jsonArray = jsonValue.asArray();

        JsonValue index0 = jsonArray.get(0);
        int firstValue = index0.asInt();

        JsonValue index1 = jsonArray.get(1);
        int secondValue = index1.asInt();

        JsonValue index2 = jsonArray.get(2);
        String thirdValue = index2.asString();

        JsonValue index3 = jsonArray.get(3);
        String fourthValue = index3.asString();

        System.out.println("firstValue:  " + firstValue);
        System.out.println("secondValue: " + secondValue);
        System.out.println("thirdValue:  " + thirdValue);
        System.out.println("fourthValue: " + fourthValue);
	}
	
	public static void e6() {
		String jsonString = "[5,8,\"data\",\"elements\"]";
        JsonValue jsonValue = Json.parse(jsonString);
        JsonArray jsonArray = jsonValue.asArray();

        for(JsonValue value : jsonArray){
            System.out.println(value);
        }
	}
	
	public static void e7() {
		String jsonString = "[5,8,\"data\",\"elements\",{\"department\":\"cse\",\"course\":115},{\"department\":\"cse\",\"course\":116}]";
        JsonValue jsonValue = Json.parse(jsonString);
        JsonArray jsonArray = jsonValue.asArray();

        JsonObject thisCourse = jsonArray.get(4).asObject();
        int courseNumber = thisCourse.get("course").asInt();

        System.out.println(courseNumber);
	}
	
	public static void main(String[] args) {
		e1();
		System.out.println("------------------------------");
		e2();
		System.out.println("------------------------------");
		e3();
		System.out.println("------------------------------");
		e4();
		System.out.println("------------------------------");
		e5();
		System.out.println("------------------------------");
		e6();
		System.out.println("------------------------------");
		e7();
	}
}

