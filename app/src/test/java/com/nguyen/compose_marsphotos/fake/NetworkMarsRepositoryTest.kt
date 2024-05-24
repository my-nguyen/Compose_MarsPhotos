package com.nguyen.compose_marsphotos.fake

import com.nguyen.compose_marsphotos.data.NetworkMarsPhotosRepository
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkMarsRepositoryTest {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() = runTest {
        val repository = NetworkMarsPhotosRepository(marsApiService = FakeMarsApiService())
        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
}