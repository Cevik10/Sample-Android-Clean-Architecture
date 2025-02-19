package com.mrtckr.livecoding.domain.usecase

import com.mrtckr.livecoding.domain.entity.WeatherData
import com.mrtckr.livecoding.domain.repository.WeatherTransaction
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetWeatherMockDataUseCase @Inject constructor(
    private val repository: WeatherTransaction
) {
    operator fun invoke(next: String): Flow<WeatherData> {
        return repository.getWeatherLocalDataByName(next)
    }
}
