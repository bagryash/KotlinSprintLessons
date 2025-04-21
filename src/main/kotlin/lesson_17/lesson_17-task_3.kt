package org.example.lesson_17

class Folder(
    _neme: String,
    _numberOfFiles: Int,
    _isHiddenFolder: Boolean,
) {
    var name = _neme
        get() = if (isHiddenFolder == true) "скрытая папка" else field
    var numberOfFiles = _numberOfFiles
        get() = if (isHiddenFolder == true) ZERO else field
    var isHiddenFolder = _isHiddenFolder
}

fun main() {
    val folder = Folder("Секретная", 99, true)

    println(
        """
        Имя папки: ${folder.name}
        Количество файлов в папке: ${folder.numberOfFiles}
        """.trimIndent(),
    )
}

const val ZERO = 0
