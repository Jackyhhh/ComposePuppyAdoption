package example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.Dog
import com.example.androiddevchallenge.R

@Composable
fun DogDetails(dog: Dog, onAdopt: (Dog) -> Unit = {}) {
    Column(
            Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.secondary)
    ) {
        Box {
            Image(
                    painterResource(dog.picture),
                    "Dog picture: ${dog.name}",
                    Modifier.aspectRatio(1f),
                    contentScale = ContentScale.Crop
            )
            Button(
                    { onAdopt(dog) },
                    Modifier
                            .align(Alignment.BottomCenter)
                            .padding(16.dp)
            ) {
                Text(text = "申请领养")
            }
        }
        Column(Modifier.padding(16.dp, 8.dp)) {
            Text("名字: ${dog.name}", style = MaterialTheme.typography.h3)
            ProvideTextStyle(MaterialTheme.typography.h5) {
                Text("品种: ${dog.breed}")
                Text("地区: ${dog.location}")
                Text("年龄: ${dog.age}")
                Text("性别: ${dog.gender}")
            }
        }
    }
}

@Preview
@Composable
fun DogDetailsPreview() {
    DogDetails(
            Dog(
                    "田田",  "南京",
                    "成年", "雄性", "比熊犬", R.drawable.bixiong
            )
    )
}
