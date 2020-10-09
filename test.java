public class ActionBuildPerform {
 public static void main(String... args) {
 WebDriver driver = new FirefoxDriver();
 driver.get("file://C:/selectable.html");
 WebElement one = driver.findElement(By.name("one"));
 WebElement three = driver.findElement(By.name("three"));
 WebElement five = driver.findElement(By.name("five"));
 // Add all the actions into the Actions builder.
 Actions builder = new Actions(driver);
 builder.keyDown(Keys.CONTROL)
 .click(one)
 .click(three)
 .click(five)
 .keyUp(Keys.CONTROL);
 // Generate the composite action.
 Action compositeAction = builder.build();
 // Perform the composite action.
 compositeAction.perform();
 }
 // edicion1
 }
