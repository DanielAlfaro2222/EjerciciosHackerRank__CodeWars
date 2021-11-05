function diagonalDifference(arr) {

    let sumaDiagonal = 0;
    let sumaDiagonalContraria = 0;

    for (let i = 0; i < arr.length; i++) {
        sumaDiagonal += arr[i][i];
        sumaDiagonalContraria += arr[i][Math.abs((arr.length - 1) - i)];
    }

    return Math.abs(sumaDiagonal - sumaDiagonalContraria);
}

// Caso de prueba 1

let arr = [[1, 2, 3], [4, 5, 6], [9, 8, 9]];

console.log(diagonalDifference(arr));