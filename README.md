syncope-google-saturn-demo
===================

This is an Apache Syncope based project as IdM. Apache Syncope is a dependency, and further behavior may be developed.

About
===================

This project has to demonstrate how to integrate a JS calendaring UI, with syncope IdM, GoogleApps as calendaring service.

Location
===================
Project is hosted at: git@github.com:Spectrsys/syncope-google-saturn-demo.git

License
===================
Apache License, Version 2.0

Installation
===================
Prerequisites:

- Java-6 or later
- Apache Tomcat7
- Mysql or posgresql
- Google ConnId

To generate .war files

    mvn package

Deploy the app by copying to tomcat webapps directory

- ./core/target/syncope.war
- ./console/target/syncope-console.war
- ./saturn/target/saturn.war