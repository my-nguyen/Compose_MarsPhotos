package com.nguyen.compose_marsphotos.fake

import com.nguyen.compose_marsphotos.data.MarsPhotosRepository
import com.nguyen.compose_marsphotos.model.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}