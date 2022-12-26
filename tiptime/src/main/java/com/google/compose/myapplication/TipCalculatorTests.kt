package com.google.compose.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test


class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_round(){
        val amount=100.00
        val tipPercent=20.00
        val expetedTip="20,00 ₽"

        val actualTip= calculateTip(amount,tipPercent,false)
        assertEquals(expetedTip,actualTip)
    }
}