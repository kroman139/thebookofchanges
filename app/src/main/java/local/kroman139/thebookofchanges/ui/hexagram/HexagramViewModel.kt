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

package local.kroman139.thebookofchanges.ui.hexagram

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import local.kroman139.thebookofchanges.data.repository.HexagramRepository
import local.kroman139.thebookofchanges.ui.hexagram.navigation.HexagramDestination
import local.kroman139.thebookofchanges.ui.utils.HexagramUiState
import local.kroman139.thebookofchanges.ui.utils.toUiStateOk
import javax.inject.Inject

@HiltViewModel
class HexagramViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    hexagramRepository: HexagramRepository,
) : ViewModel() {
    private val hexagramId: String =
        checkNotNull(savedStateHandle[HexagramDestination.hexagramIdArg])

    val hexagramUiState: StateFlow<HexagramUiState> =
        flow {
            emit(
                hexagramRepository
                    .getHexagramsStream()
                    .first()
                    .first { it.id == hexagramId }
                    .toUiStateOk()
            )
        }.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = HexagramUiState.Empty,
        )
}
