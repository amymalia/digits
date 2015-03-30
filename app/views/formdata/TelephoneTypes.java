package views.formdata;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by amytakayesu on 3/30/15.
 */
public class TelephoneTypes {
  /**
   * Returns a map of all telephone types.
   * @return a map of all telephone types.
   */
  public static Map<String, Boolean> getTypes() {
    Map<String, Boolean> telephoneTypes = new HashMap<>();
    telephoneTypes.put("Home", false);
    telephoneTypes.put("Work", false);
    telephoneTypes.put("Mobile", false);
    return telephoneTypes;
  }

  /**
   * Checks if a string is a legal telephone type.
   * @param type a string type.
   * @return true or false.
   */
  public static boolean isType(String type) {
    return getTypes().containsKey(type);
  }

  /**
   * Returns a map of all telephone types, setting type to true.
   * @param type the telephone type to set to true.
   * @return a map of all telephone types.
   */
  public static Map<String, Boolean> getTypes(String type) {
    Map<String, Boolean> temp = getTypes();
    if(isType(type)){
      temp.put(type, true);
    }
    return temp;
  }
}
