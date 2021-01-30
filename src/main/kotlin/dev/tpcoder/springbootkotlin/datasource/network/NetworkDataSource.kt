package dev.tpcoder.springbootkotlin.datasource.network

import dev.tpcoder.springbootkotlin.datasource.BankDataSource
import dev.tpcoder.springbootkotlin.datasource.network.dto.BankList
import dev.tpcoder.springbootkotlin.model.Bank
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForEntity
import java.io.IOException

class NetworkDataSource(
        @Autowired private val restTemplate: RestTemplate
) : BankDataSource {
    override fun retrieveBanks(): Collection<Bank> {
        val response: ResponseEntity<BankList> =
                restTemplate.getForEntity("http://54.193.31.159/banks")

        return response.body?.results
                ?: throw IOException("Could not fetch banks from the network")
    }

    override fun retrieveBank(accountNumber: String): Bank {
        TODO("Not yet implemented")
    }

    override fun createBank(bank: Bank): Bank {
        TODO("Not yet implemented")
    }

    override fun updateBank(bank: Bank): Bank {
        TODO("Not yet implemented")
    }

    override fun deleteBank(accountNumber: String) {
        TODO("Not yet implemented")
    }
}