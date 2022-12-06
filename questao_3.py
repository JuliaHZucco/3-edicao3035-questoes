def vogaisFun(string):
    vogais = "aeiouáéíóúâêîôûãõ"
    apenasVogais = ""
    for l in range(len(string)):
        letra = string[l].lower() #Retornará em lowercase para evitar duplicar a lista de vogais
        if letra in vogais:
            apenasVogais = apenasVogais + letra

    return apenasVogais


palavraExemplo = "Olá, mundo"
apenasVogais = vogaisFun(palavraExemplo)
print(apenasVogais)

