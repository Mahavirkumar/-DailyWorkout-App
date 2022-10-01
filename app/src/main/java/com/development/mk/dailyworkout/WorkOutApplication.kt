package com.development.mk.dailyworkout

import android.app.Application

class WorkOutApplication:Application() {
    val db:HistoryDatabase by lazy {
        HistoryDatabase.getInstance(this)
    }
}