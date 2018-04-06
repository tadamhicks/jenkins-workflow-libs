import groovy.json.JsonBuilder
import org.tadamhicks.JenkinsHttpClient

def buildApp(String morpheusUrl, Map<?, ?> postBody, String bearerToken) {
	String jsoncontent = new JsonBuilder(postBody).toString()
	File file = new File("/tmp/bearer.txt")
	file.write bearerToken
	File fileTwo = new File("/tmp/postbody.txt")
	fileTwo.write jsoncontent
	JenkinsHttpClient http = new JenkinsHttpClient()
	http.postJson(morpheusUrl, postBody, bearerToken)
}
