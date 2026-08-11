package com.demo.streak.widget

class StreakWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent { Text("Streak: 7 days") }
    }
}
