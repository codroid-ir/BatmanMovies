package ir.codroid.batmanmovies.ui.screen.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.pager.ExperimentalPagerApi
import ir.codroid.batmanmovies.data.model.Movie
import ir.codroid.batmanmovies.ui.component.ViewPagerSlider
import ir.codroid.batmanmovies.ui.theme.backgroundColor

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MovieListContent(list: List<Movie>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.backgroundColor),
        content = {
        item {
            ViewPagerSlider(movieList = list)
            Trends(list = list)
        }
    })
}