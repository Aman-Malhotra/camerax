package dev.yanshouwang.camerax

import android.app.Activity
import java.util.*
import kotlin.concurrent.timerTask

class QuarterTurnsObserver(private val onChanged: (quarterTurns: Int) -> Unit) {
    private var value = 0
    private var timer: Timer? = null

    val quarterTurns get() = value

    fun observe(activity: Activity) {
        val task = timerTask {
            val quarterTurns = activity.quarterTurns
            if (value != quarterTurns) {
                // 设备方向变化
                value = quarterTurns
                onChanged(quarterTurns)
            }
        }
        val delay = 0L
        val period = 100L
        val timer = Timer()
        timer.schedule(task, delay, period)
        this.timer = timer
    }

    fun cancel() {
        timer!!.cancel()
    }
}