package dev.tpcoder.springbootkotlin.datasource.network.dto

import dev.tpcoder.springbootkotlin.model.Bank

data class BankList(val results: Collection<Bank>)