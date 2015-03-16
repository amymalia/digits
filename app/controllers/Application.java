package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.newContact;
import views.formdata.ContactFormData;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The newContact.
   */
  public static Result newContact() {
    Form<ContactFormData> formData = Form.form(ContactFormData.class);
    return ok(newContact.render(formData));

  }

  /**
   * Processes the form submitted from the NewContact page
   * @return The NewContact page
   */
  public static Result postContact(){
    Form<ContactFormData> formData = Form.form(ContactFormData.class).bindFromRequest();
    ContactFormData data = formData.get();
    System.out.format("%s, %s, %s%n", data.firstName, data.lastName, data.telephone);
    return ok(newContact.render(formData));
  }

}
