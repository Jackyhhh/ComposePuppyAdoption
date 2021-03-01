package example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.Dog
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DogList(dogs: List<Dog>, onDogClick: (Dog) -> Unit = {}) {
    LazyColumn(
            Modifier.background(MaterialTheme.colors.secondary),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dogs) { dog ->
            DogItem(
                    dog,
                    Modifier.clickable {
                        onDogClick(dog)
                    }.fillMaxWidth()
            )
        }
    }
}

@Composable
fun DogItem(dog: Dog, modifier: Modifier = Modifier) {
    Card(modifier) {
        Row {
            Image(
                    painterResource(dog.picture),
                    "Picture of dog: ${dog.name}",
                    Modifier.size(120.dp),
                    contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(8.dp)) {
                Text(dog.name, style = MaterialTheme.typography.h4)
                Text("品种: ${dog.breed}")
                Text("地区: ${dog.location}")
            }
        }
    }
}

@Preview
@Composable
fun DogListPreview() {
    val dogs = listOf(
            Dog(
                    "田田",  "南京",
                    "成年", "雄性", "比熊犬", R.drawable.bixiong
            ),
            Dog(
                    "小火", "广州",
                    "幼年", "雄性", "柴犬", R.drawable.chaiquan
            ),
            Dog(
                    "小哈", "武汉",
                    "成年", "雄性", "哈士奇", R.drawable.hashiqi
            )
    )
    MyTheme {
        DogList(dogs)
    }
}

@Preview
@Composable
fun DogListPreviewDark() {
    val dogs = listOf(
            Dog(
                    "田田",  "南京",
                    "成年", "雄性", "比熊犬", R.drawable.bixiong
            ),
            Dog(
                    "小火", "广州",
                    "幼年", "雄性", "柴犬", R.drawable.chaiquan
            ),
            Dog(
                    "小哈", "武汉",
                    "成年", "雄性", "哈士奇", R.drawable.hashiqi
            )
    )
    MyTheme(darkTheme = true) {
        DogList(dogs)
    }
}

@Preview
@Composable
fun DogItemPreview() {
    MyTheme {
        DogItem(
                Dog(
                        "田田",  "南京",
                        "成年", "雄性", "比熊犬", R.drawable.bixiong
                )
        )
    }
}

@Preview
@Composable
fun DogItemPreviewDark() {
    MyTheme(darkTheme = true) {
        DogItem(
                Dog(
                        "田田",  "南京",
                        "成年", "雄性", "比熊犬", R.drawable.bixiong
                )
        )
    }
}