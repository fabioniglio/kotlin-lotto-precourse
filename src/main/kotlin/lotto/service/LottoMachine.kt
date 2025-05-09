package lotto.service

import camp.nextstep.edu.missionutils.Randoms
import lotto.Lotto

class LottoMachine {

    fun generateTickets(count: Int): List<Lotto> {
        return List(count) {
            val numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6).sorted()
            Lotto(numbers)
        }
    }
}