package com.nguyen.compose_marsphotos.fake

import com.nguyen.compose_marsphotos.model.MarsPhoto
import com.nguyen.compose_marsphotos.network.MarsApiService

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}