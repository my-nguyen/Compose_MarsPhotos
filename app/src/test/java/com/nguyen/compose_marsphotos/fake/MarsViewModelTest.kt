package com.nguyen.compose_marsphotos.fake

import com.nguyen.compose_marsphotos.rules.TestDispatcherRule
import com.nguyen.compose_marsphotos.ui.screens.MarsUiState
import com.nguyen.compose_marsphotos.ui.screens.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {
    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() = runTest {
        val marsViewModel = MarsViewModel(marsPhotosRepository = FakeNetworkMarsPhotosRepository())
        assertEquals(
            MarsUiState.Success("Success: ${FakeDataSource.photosList.size} Mars " + "photos retrieved"),
            marsViewModel.marsUiState
        )
    }
}