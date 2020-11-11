package org.apache.spark.graphx.lib

import org.apache.spark.rdd.RDD

object Modularity {

  def run(
    nodes: RDD[(Int, Int)],
    edges: RDD[(Int, Int, Double)],
    isDirected: Boolean,
    partitinoNum: Int = 1): Double = {
    0.0
  }
}
