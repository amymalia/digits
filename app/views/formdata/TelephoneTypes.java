package views.formdata;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class to support manipulation of telephone types.
 * Created by amytakayesu on 3/31/15.
 */
public class TelephoneTypes {
  private static String[] types = {"Home", "Work", "Mobile"};

  public static Map<String, Boolean> getTypes() {
    Map<String, Boolean> typeMap = new HashMap<String, Boolean>();
    for (String type : types) {
      typeMap.put(type, false);
    }
    return typeMap;
  }

  public static boolean isType(String type) {
    return getTypes().containsKey(type);
  }

  /**
   * Builds new map of telephone types with type set to true
   * @param type the string to set to true
   * @return the new map with type set to true.
   */
  public static Map<String, Boolean> getTypes(String type) {
    Map<String, Boolean> typeMap = getTypes();
    if (isType(type)) {
      typeMap.put(type, true);
    }
    return typeMap;
  }
}
