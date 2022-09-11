package com.development.mk.dailyworkout

/**
 * This is used for exercise details it is a custom model class.
 * with getter setter functions and a constructor
 */
// Making a model class and adding parameters which can be used later as per requirement.)
data class ExerciseModel(
    var id: Int,
    var name: String,
    var image: Int,
    var isCompleted: Boolean,
    var isSelected: Boolean
)