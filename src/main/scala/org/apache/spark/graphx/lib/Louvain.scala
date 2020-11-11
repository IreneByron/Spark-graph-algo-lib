package org.apache.spark.grahx.lib

import org.apache.spark.rdd.RDD

object Louvain {

  def run(
           edges: RDD[(Long,Long,Double)],
           iterNum: Int,
           isDirected: Boolean,
           partitionNum:Int):(Double, RDD[(Long,Long)]) = {
    null
  }

}
