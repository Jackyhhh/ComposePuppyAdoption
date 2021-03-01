package example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
