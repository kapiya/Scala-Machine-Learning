// Wei Chen - Hierarchical Test
// 2016-11-12

import org.scalatest.FunSuite
import com.interplanetarytech.TestData._
import com.interplanetarytech.general.MatrixFunc._
import com.interplanetarytech.algorithm.Hierarchical

class HierarchicalSuite extends FunSuite {

    val hi = new Hierarchical()
    test("Hierarchical Test : Clustering Tiny Data") {
        assert(hi.clear())
        assert(hi.config(Map("k" -> 2)))
        val result = hi.cluster(UNLABELED_TINY_DATA)
        assert(arrayequal(result, LABEL_TINY_DATA))
    }

    test("Hierarchical Test : Clustering Small Data") {
        assert(hi.clear())
        assert(hi.config(Map("k" -> 2)))
        val result = hi.cluster(UNLABELED_SMALL_DATA)
        assert(arrayequal(result, LABEL_SMALL_DATA))
    }

    test("Hierarchical Test : Clustering Large Data") {
        assert(hi.clear())
        assert(hi.config(Map("k" -> 2)))
        val result = hi.cluster(UNLABELED_LARGE_DATA)
        assert(arrayequal(result, LABEL_LARGE_DATA))
    }
}
