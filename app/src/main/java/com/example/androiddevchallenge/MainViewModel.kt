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
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val dogs by mutableStateOf(
        listOf(
            Dog(
                "田田", "南京",
                "成年", "雄性", "比熊犬", R.drawable.bixiong
            ),
            Dog(
                "小火", "广州",
                "幼年", "雄性", "柴犬", R.drawable.chaiquan
            ),
            Dog(
                "小哈", "武汉",
                "成年", "雄性", "哈士奇", R.drawable.hashiqi
            ),
            Dog(
                "壮壮", "北京",
                "幼年", "雌性", "拉布拉多", R.drawable.labuladuo
            ),

            Dog(
                "小布", "杭州", "幼年",
                "雌性", "罗威纳犬", R.drawable.luoweina
            ),
            Dog(
                "泰泰", "深圳", "幼年",
                "雌性", "泰迪", R.drawable.taidi
            ),
        )
    )

    var currentDog: Dog? by mutableStateOf(null)

    fun showDog(dog: Dog) {
        currentDog = dog
    }

    fun deleteDog() {
        currentDog = null
    }
}
