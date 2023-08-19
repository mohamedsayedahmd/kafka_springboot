# kafka_spring_boot

## Start the ZooKeeper servic
```
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```

## Start the Kafka broker service
```
$ bin/kafka-server-start.sh config/server.properties
```

## run the Consumer
```
$ bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
```