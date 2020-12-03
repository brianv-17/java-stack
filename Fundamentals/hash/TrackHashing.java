import java.util.Set;
import java.util.HashMap;
public class TrackHashing {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Baby  Shark", "Baby Shark doo doo doodoo");
        userMap.put("Body", "body body body body");
        userMap.put("milkshake", "my milshakes brings all the boys to the yard");
        userMap.put("Smack that", "Get on the floor smack that");
        // get the keys by using the keySet method
        System.out.println(userMap.get("Baby  Shark"));
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}

