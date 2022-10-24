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

package local.kroman139.thebookofchanges.ui.answer.navigation

import android.net.Uri
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavType
import androidx.navigation.navArgument
import local.kroman139.thebookofchanges.navigation.TbocNavigationDestination

object AnswerDestination : TbocNavigationDestination {
    internal const val questionIdArg = "questionId"

    fun questionIdNavArgument() =
        navArgument(questionIdArg) { type = NavType.StringType }

    override val route = "answer_route/{$questionIdArg}"
    override val destination = "answer_destination"

    fun createNavigationRoute(questionId: String): String {
        val encodedId = Uri.encode(questionId)

        return "answer_route/$encodedId"
    }

    fun fromNavArgs(entry: NavBackStackEntry): String {
        val encodedId = entry.arguments?.getString(questionIdArg)!!

        return Uri.decode(encodedId)
    }
}