package Kafka_stream

import java.util.Properties

import org.apache.kafka.common.serialization._
import org.apache.kafka.streams._
import org.apache.kafka.streams.kstream.KStreamBuilder
import org.apache.kafka.streams.processor.WallclockTimestampExtractor
/**
  * Copyright Knoldus Software LLP, 2017. All rights reserved.
  */
object Consumerstream {

  def main(args: Array[String]): Unit = {


    val time = new WallclockTimestampExtractor()

    val config = {
      val properties = new Properties()
      properties.put(StreamsConfig.APPLICATION_ID_CONFIG, "TFM LAURA")
      properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
      properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass)
      properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass)
      properties.put(StreamsConfig.DEFAULT_TIMESTAMP_EXTRACTOR_CLASS_CONFIG, time.getClass)
      properties
    }

    val builder = new KStreamBuilder()
    val sourceStream = builder.stream("TweetsTopic")
    sourceStream.print()
    sourceStream.writeAsText("/home/laura/Documentos/ProyectoFinal/tweets.txt")
    val streams = new KafkaStreams(builder, config)
    streams.start()
  }
}
