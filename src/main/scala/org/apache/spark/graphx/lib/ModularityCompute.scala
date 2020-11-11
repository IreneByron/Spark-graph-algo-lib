package org.apache.spark.graphx.lib

import org.apache.spark.rdd.RDD

object Modularity {

  def run(
    nodes: RDD[(Long, Long)],
    edges: RDD[(Long, Long, Double)],
    isDirected: Boolean,
    partitinoNum: Int = 1): Double = {
    0.0
  }
}
