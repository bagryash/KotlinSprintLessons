package org.example.lesson_22

class MainScreenViewModel(
    val mainScreenState: MainScreenState,
) {
    data class MainScreenState(
        var data: String?,
        var isLoading: Boolean = false,
    )

    fun loadData() {
        mainScreenState.data = null
        println("Данные отсутствуют")

        val loadingMainScreenState: MainScreenState = mainScreenState.copy(isLoading = true)
        println("Идет загрузка данных")

        val withDataMainScreenState: MainScreenState = loadingMainScreenState.copy(data = readln(), isLoading = false)
        println("Загруженны данныe: ${withDataMainScreenState.data} ")
    }
}

fun main() {
    val mainScreenState = MainScreenViewModel.MainScreenState(null)
    val mainScreenViewModel = MainScreenViewModel(mainScreenState)

    mainScreenViewModel.loadData()
}
