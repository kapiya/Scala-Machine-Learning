// Wei Chen - Density Peak Cluster Test
// 2016-06-03

import org.scalatest.FunSuite
import com.interplanetarytech.TestData._
import com.interplanetarytech.general.MatrixFunc._
import com.interplanetarytech.algorithm.DensityPeakCluster

class DensityPeakClusterSuite extends FunSuite {

    val dpc = new DensityPeakCluster()
    test("DensityPeakCluster Test : Clustering Tiny Data") {
        assert(dpc.clear())
        assert(dpc.config(Map("sd" -> 1.0, "densityf" -> 1.0, "deltaf" -> 1.0)))
        val result = dpc.cluster(UNLABELED_TINY_DATA)
        assert(arrayequal(result, LABEL_TINY_DATA.reverse))
    }

    test("DensityPeakCluster Test : Clustering Small Data") {
        assert(dpc.clear())
        assert(dpc.config(Map("sd" -> 2.0, "densityf" -> 1.0, "deltaf" -> 2.0)))
        val result = dpc.cluster(UNLABELED_SMALL_DATA)
        assert(arrayequal(result, LABEL_SMALL_DATA.reverse))
    }

    test("DensityPeakCluster Test : Clustering Large Data") {
        assert(dpc.clear())
        assert(dpc.config(Map("sd" -> 3.0, "densityf" -> 12.0, "deltaf" -> 2.0)))
        val result = dpc.cluster(UNLABELED_LARGE_DATA)
        assert(arrayequal(result, LABEL_LARGE_DATA))
    }

    test("DensityPeakCluster Test : Clear") {
        assert(dpc.clear())
        assert(dpc.dddata.isEmpty)
    }
}
