# apache-kafka


Kafka Spring boot



Type : Open-source
Utility : process data streams in real time
Creator : Linkedin
Author: Franz Kafka

- [x] Kafka works as publisher and subscriber model 
- [x] Sender will publish the data to the Kafka and receiver will subscribe the data 
- [x] Records data: Kafka records what happened and when it happened in an immutable commit log. 

Use cases:
1. Real time transactions 
2. Tracking and monitoring
3. Sensor data
4. Customer Interaction 
5. Patient monitoring 

Advantages
1. High throughput
2. Fault tolerance
3. Scalable

Working
- [x] Kafka streams the events through topics, so first step is to create topic before having own events to be streamed
- [x] To create and describe a topic we use kafka-topics.sh
- [x] To produce or write some events we use kafka-console-producer.sh
- [x] To Read or subscribe to the events we use kafka-console-consumer.sh

**Commands**


**Zookeeper spinning **: bin/zookeeper-server-start.sh config/zookeeper.properties
**Kafka ready **: $ bin/kafka-server-start.sh config/server.properties
**Topic creation** : bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092
Topic description: bin/kafka-topics.sh --describe --topic quickstart-events --bootstrap-server localhost:9092
Event write : bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
Event read : bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092