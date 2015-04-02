import models.ContactDB;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import views.formdata.ContactFormData;

/**
 * Initializes database.
 */
public class Global extends GlobalSettings {

  /**
   * Overrides onStart method.
   * @param app to use.
   */
  public void onStart(Application app) {
    Logger.info("Application has started");
    ContactDB.addContact(new ContactFormData("Amy", "Taka", "808-623-8833", "Home"));
    ContactDB.addContact(new ContactFormData("Emmie", "Cutie", "808-623-2314", "Mobile"));
    ContactDB.addContact(new ContactFormData("Someone", "Else", "808-623-1232", "Work"));
    ContactDB.addContact(new ContactFormData("Jane", "Doe", "808-623-8323", "Home"));
  }

}