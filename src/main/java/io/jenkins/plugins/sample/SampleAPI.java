package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.model.RootAction;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.WebMethod;
import org.kohsuke.stapler.json.JsonHttpResponse;
import org.kohsuke.stapler.verb.GET;

@Extension
public class SampleAPI implements RootAction {

    @Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public String getUrlName() {
        return "minimal";
    }

    @GET
    @WebMethod(name = "ok")
    public JsonHttpResponse getSample() {
        return new JsonHttpResponse(JSONObject.fromObject("{\"message\": \"ok\"}"), 200);
    }

    /**
     * Demonstration of <a href="https://issues.jenkins.io/browse/JENKINS-75205">...</a>
     */
    @GET
    @WebMethod(name = "npe")
    public JsonHttpResponse getSampleNPE() {
        // enable this code to make NPE; currently commented as spotbugs is failing the mvn clean install.
        // String str = null;
        // str.length();
        return new JsonHttpResponse(JSONObject.fromObject("{\"message\": \"ok\"}"), 200);
    }
}
