package lotto.domain

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

class LottoNumberTest : AnnotationSpec() {

    @Test
    fun `로또 번호는 1보다 크거나 같고 45보다 작거나 같다`() {
        shouldNotThrow<IllegalArgumentException> {
            LottoNumber(7).number shouldBe 7
        }
    }
    @Test
    fun `로또 번호는 1보다 작거나 45보다 클 수 없음`() {
        shouldThrow<IllegalArgumentException> {
            LottoNumber(0)
        }
        shouldThrow<IllegalArgumentException> {
            LottoNumber(46)
        }
    }
}
