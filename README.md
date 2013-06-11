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

If ConnId bundles are located somewhere else, use:

    mvn clean package -Dbundles.directory=/var/opt/syncope/bundles -Dlog.directory=/var/opt/syncope/log

Test console
===================

In order to test (run) the syncope console:

    cd console
    mvn -P embedded -Dbundles.directory=/var/opt/syncope/bundles -Dlog.directory=/var/opt/syncope/log

Add connector
===================

General
-------------

    Display Name: google-apps
    Bundle Name:  org.connid.bundles.googleapps 1.3.3
    Name:         org.identityconnectors.googleapps.GoogleAppsConnector
    Version:      1.3.3

Configuration
-------------

    connectionUrl: https://apps-apis.google.com/a/feeds/test3.sheepdoginc.ca/
    domain:        <your-domain-com>
    password:      <your-password-com>

Configuration
-------------

Check all


Mysql Configuration
====================

    # Mysql
    jpa.driverClassName=com.mysql.jdbc.Driver
    jpa.url=jdbc:mysql://localhost:3306/syncope?characterEncoding=UTF-8
    jpa.username=syncope
    jpa.password=syncope
    jpa.dialect=org.apache.openjpa.jdbc.sql.MySQLDictionary
    quartz.jobstore=org.quartz.impl.jdbcjobstore.StdJDBCDelegate
    quartz.sql=tables_mysql_innodb.sql
    logback.sql=mysql.sql

