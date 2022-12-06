from datetime import datetime

def diaDaSemanaFun(data):
    diasDaSemana = ["Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"]
    diaDaSemanaInt = datetime.strptime(data, "%m/%d/%Y").weekday()
    return diasDaSemana[diaDaSemanaInt] 


dataExemplo = "12/06/2022"
diaDaSemana = diaDaSemanaFun(dataExemplo)
print(diaDaSemana)

