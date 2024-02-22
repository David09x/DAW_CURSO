"que haga una calculadora"


from unicodedata import decimal

"""""
def numeroBinariosAdecimal(binario):
    suma = 0;
    binario =binario [::-1]
    for i in range(0,len(binario)):
        suma += int(binario[i])*pow(2,i)
    return suma


num = input("introduce un numero binario")

resultado= numeroBinariosAdecimal(num)

print(resultado)
"""

def der2bin(decimal):
    binario = ""
    while decimal > 1:
        binario += decimal %2
        decimal = decimal //2
    binario += decimal
    binario = binario[::-1]

    return binario;


        
def decimalsAhexadecial(decimal):
    hexa = "";
    hexa1 = "";
    decimal1 = "";
    while  int(decimal) >= 16:
        hexa1 = str(int(decimal)%16)
        if hexa1 == "10":
            hexa1 = "A"
        elif hexa1 == "11":
            hexa1 = "B"
        elif hexa1 == "12":
            hexa1 = "C"
        elif hexa1 == "13":
            hexa1 = "D"
        elif hexa1 == "14":
            hexa1 = "E"
        elif hexa1 == "15":
            hexa1 = "F"
        decimal = str(int(decimal)//16)
        decimal1 = decimal
        if decimal == "10":
            decimal1 = "A"
        elif decimal == "11":
            decimal1 = "B"
        elif decimal == "12":
            decimal1 = "C"
        elif decimal == "13":
            decimal1 = "D"
        elif decimal == "14":
            decimal1 = "E"
        elif decimal == "15":
            decimal1 = "F"
        hexa  += hexa1
    hexa += decimal1

    hexa = hexa[::-1]
   
    
    return hexa;


print(decimalsAhexadecial("910"))
