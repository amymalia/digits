package controllers;

import models.Contact;
import models.ContactDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.ContactFormData;
import views.html.Index;
import views.html.NewContact;

import java.util.HashMap;
import java.util.Map;


/**
 * Provides controllers for this application.
 */
public class Application extends Controller {
  public static Map<String, Boolean> telephoneTypes = new HashMap<>();

  public static void fillTypes() {
    telephoneTypes.put("Home", false);
    telephoneTypes.put("Mobile", false);
  }
  /**
   * Returns the home page.
   *
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render(ContactDB.getContacts()));
  }

  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   *
   * @param id the user id
   * @return The newContact.
   */
  public static Result newContact(long id) {
    ContactFormData data;
    if (id == 0) {
      data = new ContactFormData();
    }
    else {
      data = new ContactFormData(ContactDB.getContact(id));
    }
    Form<ContactFormData> formData = Form.form(ContactFormData.class).fill(data);
    return ok(NewContact.render(formData, telephoneTypes));
  }

  /**
   * Processes the form submitted from the NewContact page.
   *
   * @return The NewContact page
   */
  public static Result postContact() {
    Form<ContactFormData> formData = Form.form(ContactFormData.class).bindFromRequest();

    if (formData.hasErrors()) {
      System.out.println("Errors found.");
      return badRequest(NewContact.render(formData, telephoneTypes));
    }
    else {
      ContactFormData data = formData.get();
      models.ContactDB.addContact(data);
      System.out.println("OK: " + data.firstName + " " + data.lastName + " " + data.telephone);
      return ok(NewContact.render(formData, telephoneTypes));
    }
  }

  /**
   * Deletes a contact.
   *
   * @param id the contact id
   * @return Result the new current contacts page
   */
  public static Result deleteContact(long id) {
    ContactDB.deleteContact(id);
    return ok(Index.render(ContactDB.getContacts()));
  }

}
