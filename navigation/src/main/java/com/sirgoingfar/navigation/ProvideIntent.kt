package com.sirgoingfar.navigation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

object ProvideIntent {

    fun forActivity(context: Context, activityName: String, args: Bundle? = null) =
        Intent(context, loadOrNull<AppCompatActivity>(activityName)).apply {
            this.putExtra("data", args)
        }

}