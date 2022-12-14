/*
 * Copyright 2022 kroman139
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package local.kroman139.thebookofchanges.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.datetime.Instant
import local.kroman139.thebookofchanges.model.data.Answer

@Entity(tableName = "answer")
data class AnswerEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long,

    @ColumnInfo(name = "asked_on")
    val askedOn: Instant,
    @ColumnInfo(name = "utc_offset")
    val utcOffset: Int,

    val question: String,

    @ColumnInfo(name = "hexagram_id")
    val hexagramId: String,
)

fun AnswerEntity.asExternalModel() = Answer(
    id = id,
    askedOn = askedOn,
    utcOffset = utcOffset,
    question = question,
    hexagramId = hexagramId,
)