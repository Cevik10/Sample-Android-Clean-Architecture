package com.mrtckr.livecoding.domain.usecase

import com.mrtckr.livecoding.domain.entity.ResultData
import com.mrtckr.livecoding.domain.entity.WeatherData
import com.mrtckr.livecoding.domain.repository.WeatherTransaction
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetWeatherByNameUseCase @Inject constructor(
    private val repository: WeatherTransaction
) {
    suspend operator fun invoke(next: String): Flow<ResultData<WeatherData>> {
        return repository.getWeatherByName(next)
    }
}
