package com.demo.streak.data

@Entity(tableName = "streaks")
data class StreakEntity(
    @PrimaryKey val id: Long = 0,
    val currentCount: Int,
    val lastCheckIn: Long
)

// DB version 2, schema exported to /schemas
