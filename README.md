# spring-apache-kafka-producer-masterclass

## A good understanding of the usage of Apache Kafka with Spring Boot for consuming messages as published in the Topic

### Software Required
* [Java 1.8](https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html)
* [Spring tool Suite](https://spring.io/tools) or [Eclipse](https://www.eclipse.org/downloads/packages/release/helios/sr1/eclipse-ide-java-developers)
* [Apache Maven](https://maven.apache.org/download.cgi)
* [Git Bash](https://gramfile.com/git-bash-download/)
* [Scala](https://kafka.apache.org/downloads) - Download the Latest Version. Latest Version - <strong>Scala 2.13</strong>
* [MySQL](https://dev.mysql.com/downloads/mysql/) - Download the Community Edition. If it is a problem then you can download another one as provided below
* [SQLYog](https://sqlyog.en.softonic.com/) - SQLYog. You can use this as replacement of MySQL
* [Postman](https://www.postman.com/downloads/)

### Install Kafka

#### Below Steps are for the Windows OS
<ol>
<li>Download the <strong>kafka_2.13-3.1.0.tgz</strong> file from the above url</li>
<li>Unzip the file in a particular location</li>
<li>Let's say you have unzip Kafka in <strong>D:/Apache_Kafka</strong> folder, then go to that folder and open Command Prompt in every cases
<li>Open the Command Prompt and <strong>Start the Zookeeper</strong></li>
<li> Command : <p>`.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`</p></li>
<li>Open a new Command Prompt and <strong>Start Apache Kafka Server</strong></li>
<li>Command : <p>`.\bin\windows\kafka-server-start.bat .\config\server.properties`</p></li>
<li>Open a new Command Prompt and <strong>Create a Topic named `springcavaj-topic` that has 1 partition and 1 replica</strong></li>
<li>Command : <p>`.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic springcavaj-topic`</p></li>
<li>Open a new Command Prompt and <strong>Create a producer to send message in `springcavaj-topic`</strong></li>
<li>Command : <p>`.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic springcavaj-topic`</p></li>
<strong><p>`Hello Kafka`</p></strong></li> This is the message as send from the Producer<br/><br/>
<li>Open a new Command Prompt and <strong>Start the Consumer who will consume the message from `springcavaj-topic`</strong></li>
<li>Command : <p>`.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic springcavaj-topic --from-beginning`</p></li> <strong>--from-beginning</strong> means the consumer will read messages from the beginning which the publisher has send in the <strong>springcavaj-topic</strong><br/><br/>
</ol>
After doing all the above necessary steps if all things goes fine then you have successfully run Apache Kafka in your local machine

### Steps to clone and run the application
* Open Git Bash or even you can open Command Prompt (if you are using Windows) or Terminal (if you are using MAC) in your machine
* Clone the application from github.com as   
<code>git clone https://github.com/c86amik/spring-apache-kafka-producer-masterclass.git</code>
* Open either <strong>STS</strong> or <strong>Eclipse</strong> and import the application as <strong>Maven</strong> project
* After the application got successfully imported in either <strong>STS</strong> or <strong>Eclipse</strong>
* Start the ZooKeeper - <p>`.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`</p>
* Start the Apache Kafka Server - <p>`.\bin\windows\kafka-server-start.bat .\config\server.properties`</p>
* After that Right Click on the application, select the <strong>Run As</strong> option, and then select <strong>Spring Boot App</strong>
* The application will start in the port <strong>7113</strong>
* Open the Postman copy the URL as <strong>localhost:7113/kafka/produceJson</strong> and select the Method as <strong>POST</strong>. Click the Body tab in Postman, select the `raw` radiobutton and change the data type from `Text` to `JSON`. And paste the Body as mentioned in the [Dummy JSON Object](https://github.com/c86amik/spring-apache-kafka-producer-masterclass#dummy-json-object)
* As it is a producer application, so to check whether the message is consumed or not.
* Open the Command Prompt and start the Consumer - <p>`.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic springcavaj-topic --from-beginning`</p>
* You will be able to see a message as it has consumed the data in the command prompt like this:
<p><code>{"firstName" : "First Name", "middleName" : "", "lastName" : "Last Name", "mobileNo" : "1234567890", "email" : "test@email.com", "panNo" : "ABCDE1234F"}</code></p>

### Dummy JSON Object
* Request Object pass in the Body of Postman
<p>
<code>
{ 
    "firstName" : "First Name",
    "middleName" : "", 
    "lastName" : "Last Name",
    "mobileNo" : "1234567890", 
    "email" : "test@email.com", 
    "panNo" : "ABCDE1234F" 
}
</code>
</p>