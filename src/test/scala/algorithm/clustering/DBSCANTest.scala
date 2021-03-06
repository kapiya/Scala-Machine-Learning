// Wei Chen - DBSCAN Test
// 2016-11-10

import org.scalatest.FunSuite
import com.interplanetarytech.TestData._
import com.interplanetarytech.general.MatrixFunc._
import com.interplanetarytech.algorithm.DBSCAN

class DBSCANSuite extends FunSuite {

    val dbscan = new DBSCAN()
    test("DBSCAN Test : Clustering Tiny Data") {
        assert(dbscan.clear())
        assert(dbscan.config(Map("limit" -> 2.0)))
        val result = dbscan.cluster(UNLABELED_TINY_DATA)
        assert(arrayequal(result, LABEL_TINY_DATA))
    }

    test("DBSCAN Test : Clustering Small Data") {
        assert(dbscan.clear())
        assert(dbscan.config(Map("limit" -> 2.0)))
        val result = dbscan.cluster(UNLABELED_SMALL_DATA)
        assert(arrayequal(result, LABEL_SMALL_DATA))
    }

    test("DBSCAN Test : Clustering Large Data") {
        assert(dbscan.clear())
        assert(dbscan.config(Map("limit" -> 3.0)))
        val result = dbscan.cluster(UNLABELED_LARGE_DATA)
        assert(arrayequal(result, LABEL_LARGE_DATA))
    }
}
