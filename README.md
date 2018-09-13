openmrs-module-msfcore
==========================

This module contains core functionality and customisations for the OpenMRS Médecins Sans Frontières(MSF) distribution such as;

> UI Customisations

> Primary & other Patient Identifiers

> Registration App

> Location (structure) metadata

> Audit Logging

> Html forms
- [x] Exit From NCD
- [x] Lab Results
- [x] NCD Baseline Consultation
- [x] NCD followup

## SDK Usage
1. You can create a new SDK Server using the configuration by running the following
   ```mvn openmrs-sdk:setup -Ddistro=org.openmrs.module:msfcore:1.0.0-SNAPSHOT```
2. Running `mvn clean install` will do the following:
  - Build a docker container configuration in `omod\target\docker` folder 
  - Building an openmrs.war file in `omod\target\docker\web` which contains all the bundled modules needed to run the distribution. First make sure that you have built any dependent modules and branches as these are installed
 3. To add a custom module:
  - Add the module version tag to the pom.xml at the root of the folder e.g, ```<moduleVersion>1.2.1</moduleVersion>```
  - Add the module reference in the `api\resources\openmrs-distro.properties` file as ```omod.module=${moduleVersion}```
  - At the next run of `mvn clean install` the module will be downloaded locally
  - Update the SDK server by running `mvn openmrs-sdk:deploy -Ddistro=org.openmrs.module:msfcore:1.0.0-SNAPSHOT` 
  
   


