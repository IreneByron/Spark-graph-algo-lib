package org.apache.spark.graphx.lib

import org.apache.spark.graphx.VertexId
import org.apache.spark.rdd.RDD

object Closeness {
  def run(edgeRDD: RDD[(VertexId, VertexId, Double)],
          weighted: Boolean,
          k: Int,
          p: Double): RDD[(Long, Double)] = {
    null
  }
}