# DSoftQBWCWebApp
Web API for SOAP server <https://github.com/diltdicker/DSoftQBWCAxisService>. These programs are intended to provide a generic RESTful API to access client QuickBooks Desktop instances as opposed to creating an archaic SOAP server.

## Deployment
You can deploy the .war file on an Apache Tomcat server. The simple setup is to run the webapp on the Tomcat server and in a Axis2 servlet (on the same machine) run the SOAP server. You will also need to run MongoDB for a database as it is needed to facilitate communication between the webapp and the SOAP server. Make sure that both _config.properties_ files for the webapp and the SOAP server have matching MongoDB values. Once the servers are setup and running, a client must use the QuickBooks Web Connector to open the .qwc file and allow their instance of QuickBooks to be accessed programmatically.

## Configuration
Please make sure to input the correct values for your setup in the _config.properties_ file.
Many of the configuration values will go into the .qwc files that you will distribute to your clients, so please name any applications and descriptions appropriately.
* mongo_host :		Default is localhost
* mongo_port :		Default is 27017
* mongo_db :		Default is "qbwc"
* admin_username : 	"dsoft" by default
* admin_password : 	"dsoft" by default
* owner_id : 		A GUID string for your organization
* app_name : 		Name for your application (will be the file name for .qwc files)
* app_url : 		URL for the SOAP server endpoint <https://github.com/diltdicker/DSoftQBWCAxisService>
* app_description : Description of application (Will be in .qwc file)
* support_url : 	URL for customer support for your app

## Instructions for use
For each client, a new account must be created with a username and password. A .qwc file for must also be created for the client. Requests for the client can then be sent to the webapp. Setting up the client's connection to the SOAP server will require them to run the .qwc file and the password for their account. Periodically the SOAP server will communicate with the client's QuickBooks Web connector and will run all the requests that have been queued up. To get the response to a request, the reqID (that was generated from the initial POST request) must be used to look up the response (if it has been run yet).

## API
* **Create client account** - POST

	```http://{hostname}/DSoftQBWCWebApp/qbwc-api/admin```
	
	Body (JSON) :
	*	admin-username : Default "dsoft"
	*	admin-password : Default "dsoft"
	*	client-admin : The username for the new client
	*	client-password : The password for the new client
* **Delete client account** - DELETE

	```http://{hostname}/DSoftQBWCWebApp/qbwc-api/admin```
	
	Body (JSON) :
	*	admin-username : Default "dsoft"
	*	admin-password : Default "dsoft"
	*	client-admin : The username for the new client
* **Send a qbxml request** - POST

	```http://{hostname}/DSoftQBWCWebApp/qbwc-api/request/{client-username}```
	
	Body (XML) : The qbxml request to be sent to QuickBooks Desktop
	
	Returns (JSON) : 
	*	reqID : The request ID for looking up the response
	*	ticket : The ticket the request is a part of
	*	request :  The XML request that will be sent
* **Get response for a qbxml request** - GET

	```http://{hostname}/DSoftQBWCWebApp/qbwc-api/response/{username}/{reqid}```
	
	Returns (JSON) :
	*	reqID : The request ID for looking up the response
	*	ticket : The ticket the request is a part of
	*	response :  The XML response of the request
* **Delete a response for a qbxml request** - DELETE

	The response will stay in MongoDB until it is deleted.
	
	```http://{hostname}/DSoftQBWCWebApp/qbwc-api/response/{username}/{reqid}```
* **Generate a .qwc file** - GET

	```http://{hostname}/DSoftQBWCWebApp/qbwc-api/account/gen-qwc/{username}```
## Building the WAR
You can build the .war file if need to make any changes. Using Ecplise EE, import the project, then File > Export > War File.