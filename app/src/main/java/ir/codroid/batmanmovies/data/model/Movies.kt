package ir.codroid.batmanmovies.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import ir.codroid.batmanmovies.util.Constants.TABLE_MOVIE
@Entity(tableName = TABLE_MOVIE)
data class Movie(
    val Poster: String,
    val Title: String,
    val Type: String,
    val Year: String,
    @PrimaryKey(autoGenerate = false)
    val imdbID: String
)
