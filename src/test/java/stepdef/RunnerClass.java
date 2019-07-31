package stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featurefolder/scenario6.feature",glue="stepdef", 
plugin="json:target\\jsonreport.json")
// plugin="json:target\\jsonreport.json"
//plugin="junit:target\\xmlreport.xml"
//plugin="html:target\\htmlreport"
public class RunnerClass {

}
