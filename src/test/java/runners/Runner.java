package runners;
import com.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@run",
        dryRun =false
)

   public class Runner extends AbstractCucumberTests{

                @AfterClass
                public static void afterClass(){
                        Reporter.loadXMLConfig("src/test/java/XMLFiles/extentReportSet.xml");

                        Reporter.setSystemInfo("QA Tester : ", "Ceyda Kızık");
                        Reporter.setSystemInfo("Application name : ", "Your Store Test  ");
                        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
                        Reporter.setSystemInfo("Department", "QA");
                        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
                }
        }
