/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.example.android.marsrealestate.network

data class MarsProperty(
    val channel: Channel_data,
    val feeds: List<Movement>

    //val img_src: String,
    //val type: String,
    //val price: Double
)

data class Channel_data(
    val id: Double,
    val name: String,
    val latitude: String,
    val longitude: String,
    val field1: String,
    val created_at: String,
    val updated_at: String,
    val last_entry_id: String
)



data class Movement(
    val created_at: String,
    val entry_id: Double,
    val field1: String
)