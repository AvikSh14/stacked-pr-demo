package com.demo.streak.work

class StreakReminderWorker(
    context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {
    override suspend fun doWork(): Result {
        // read streak from DB, post notification
        return Result.success()
    }
}
