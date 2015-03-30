package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Provides testing support for the Index page.
 *
 * @author Philip Johnson
 */
public class NewContactPage extends FluentPage {
  private String url;

  /**
   * Create the IndexPage.
   *
   * @param webDriver The driver.
   * @param port      The port.
   */
  public NewContactPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port + "/NewContact";
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("NewContact (digits)");
  }

  /**
   * Set the form to the passed values, then submit it.
   *
   * @param firstName The form first name data.
   * @param lastName  The form last name data.
   * @param telephone The form telephone data.
   */
  public void submitForm(String firstName, String lastName, String telephone) {
    // Fill the input field with id "firstName" with the passed name string.
    fill("#firstName").with(firstName);
    // Fill the input field with id "lastName" with the passed name string.
    fill("#lastName").with(lastName);
    // Fill the input field with id "telephone" with the passed telephone string.
    fill("#telephone").with(telephone);
    //Submit the form whose id is "submit"
    submit("#submit");
  }


}
