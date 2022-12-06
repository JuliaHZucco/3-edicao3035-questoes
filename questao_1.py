def segundoMaiorFun(array):
    segundoMaior = array[0]
    maior = array[0]
    for el in array:
        if el > maior:
            segundoMaior = maior
            maior = el
    return segundoMaior


arrayExemplo = [1, 2, 3, 4, 5, 6, 6]

segundoMaior = segundoMaiorFun(arrayExemplo)
print(segundoMaior)
