package processor

fun addMatrices(
    A: MutableList<MutableList<Double>>,
    B: MutableList<MutableList<Double>>
): MutableList<MutableList<Double>> {
    val matrix: MutableList<MutableList<Double>> = mutableListOf()

    for (i in 0..<A.size) {
        val tempMatrix: MutableList<Double> = mutableListOf()
        for (j in 0..<A.first().size) {
            tempMatrix.add((A.get(i).get(j) + B.get(i).get(j)))
        }
        matrix.add(tempMatrix)
    }
    return matrix
}
