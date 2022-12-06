#Função clássica
def inversorDeString(string):
    stringInversa = ""
    for letra in reversed(range(len(string))):
        stringInversa = stringInversa + string[letra]

    return stringInversa


#Exemplo
string = "Olá, mundo"

stringInversa = inversorDeString(string)
print(stringInversa)


#Função "pytonica"
def inversorDeStringPy(string):
    return string[::-1]

string = "Olá, mundo"

stringInversa = inversorDeString(string)
print(stringInversa)