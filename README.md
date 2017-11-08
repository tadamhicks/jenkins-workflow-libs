# jenkins-workflow-libs

This is a repo to keep my workflow-libs for Jenkinsfile Pipeline construction

## httpclient

In this you will find a small HTTP client for RESTful interaction.  

### methods:

* GET
  Takes a URL and a BEARER token and passes the token as a header like: `"Authorization: BEARER 3187e3-kj3112-21jklb12`
  I wrote this around Morpheus, and this is the authentication method for the [Morpheus API](https://bertramdev.github.io/morpheus-apidoc/#authentication)

  If you need something different then you will need to change this.

* POST
  Takes a URL, a Groovy Map<?, ?> and a BEARER token.  The Map is converted to JSON for RESTful POSTs.

* DELETE
  Takes a URL.  It is a placeholder, for now, since I don't typically use it.

## morpheusApp

This is a sample Groovy script that I use for demo purposes interacting with Morpheus.  I have an example at https://github.com/tadamhicks/morph-demo-app/blob/master/Jenkinsfile


