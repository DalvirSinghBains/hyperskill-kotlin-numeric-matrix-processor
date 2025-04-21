package processor

fun findDeterminant(matrix: MutableList<MutableList<Double>>): Double {
    var determinant = 0.0
    if (matrix.size == 1) {
        return matrix[0][0]
    }else if (matrix.size == 2) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]
    } else {
        for (i in 0..matrix.size - 1) {
            val subMatrix: MutableList<MutableList<Double>> = mutableListOf()
            var multiplier = 0.0
            for (j in 1..matrix.size - 1) {
                subMatrix.add(
                    matrix.get(j)
                    .filterIndexed { index, _ -> index != i }
                    .toMutableList())
            }
            multiplier = if (i % 2 == 0) {
                matrix[0][i].unaryPlus()
            } else {
                matrix[0][i].unaryMinus()
            }
            determinant += multiplier * findDeterminant(subMatrix)
        }
        return determinant
    }
}