 /*
 * Generic HTML Attribute 
 *
 *  Licensed Virtual the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 *  Change History:
 *
 *    Date        Who            What
 *    ----        ---            ----
 *    2021-08-03  thebearmay	 Original version 0.0.1
 *    2022-04-05  thebearmay     add additional html attributes
 */

static String version()	{  return '0.0.2'  }

metadata {
    definition (
		name: "Generic HTML Device", 
		namespace: "thebearmay", 
		author: "Jean P. May, Jr.",
	        importUrl:"https://raw.githubusercontent.com/thebearmay/hubitat/main/genHtmlDev.groovy"
	) {
        capability "Actuator"
		
		attribute "html", "string"
	    	attribute "html1", "string"
		attribute "html2", "string"
		attribute "html3", "string"
		attribute "html4", "string"
		attribute "html5", "string"
		attribute "html6", "string"
		attribute "html7", "string"
		attribute "html8", "string"
		attribute "html9", "string"
		attribute "html10", "string"	    
    }   
}

preferences {
	input("debugEnable", "bool", title: "Enable debug logging?")
}

def installed() {
    log.trace "${device.properties.displayName} installed()"
}

def updated(){
    log.trace "updated()"
    if(debugEnable) runIn(1800,logsOff)
}

void logsOff(){
     device.updateSetting("debugEnable",[value:"false",type:"bool"])
}
