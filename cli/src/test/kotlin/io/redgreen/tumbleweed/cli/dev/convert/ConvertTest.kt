package io.redgreen.tumbleweed.cli.dev.convert

import io.redgreen.tumbleweed.web.observablehq.BilevelEdgeBundlingGraph
import org.approvaltests.JsonApprovals
import org.junit.jupiter.api.Test

class ConvertTest {
  @Test
  fun `it can convert a csv to an edge bundling graph`() {
    // given
    val csv = """
      m.signature,f.signature
      void getName(),String name
      void setName(String),String name
    """.trimIndent()

    // when
    val graph = BilevelEdgeBundlingGraph.from(csv)

    // then
    JsonApprovals.verifyAsJson(graph)
  }
}
