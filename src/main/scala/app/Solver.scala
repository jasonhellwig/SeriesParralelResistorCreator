package app

/**
  * Created by Jason on 10/23/2016.
  */
case class SolverResult(genome:String, resistance:Double, repr:String)

object Solver {

  def solve(genome:String):SolverResult = {
    val repr = genome.map(c => Element(c).repr).mkString(" ")
    GlobalLogger.logger.info(repr)

    val resistance = Begin(0, genome).evaluate.r
    GlobalLogger.logger.info(resistance.toString)

    SolverResult(genome, resistance, repr)
  }
}