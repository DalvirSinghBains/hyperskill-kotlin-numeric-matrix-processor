package processor

fun multiplyMatrices(
    A: MutableList<MutableList<Double>>,
    B: MutableList<MutableList<Double>>
): MutableList<MutableList<Double>> {

    val matrix: MutableList<MutableList<Double>> = mutableListOf()

    for (i in 0..<A.size) {

        val rowFromA: MutableList<Double> = A.get(i)
        val row: MutableList<Double> = mutableListOf()

        for (j in 0..<B.first().size) {
            var sum = 0.0

            for (k in 0..<B.size) {
                sum += rowFromA.get(k) * B.get(k).get(j)
            }
            row.add(sum)
        }
        matrix.add(row)
    }
    return matrix
}

fun multiplyByConstant(
    constant: Double,
    A: MutableList<MutableList<Double>>
): MutableList<MutableList<Double>> {
    val matrix: MutableList<MutableList<Double>> = mutableListOf()
    for (i in 0..<A.size) {
        val tempMatrix: MutableList<Double> = mutableListOf()
        for (j in 0..<A.first().size) {
            tempMatrix.add((constant * (A.get(i).get(j))))
        }
        matrix.add(tempMatrix)
    }
    return matrix
}