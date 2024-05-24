package com.nguyen.compose_marsphotos.data

import com.nguyen.compose_marsphotos.model.MarsPhoto
import com.nguyen.compose_marsphotos.network.MarsApi

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository() : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return MarsApi.retrofitService.getPhotos()
    }
}