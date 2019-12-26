satir_sayisi = int(input("Sayi girin: "))
satir_sayaci = 1
while satir_sayaci <= satir_sayisi:
    print(satir_sayaci * str(satir_sayaci))
    satir_sayaci = satir_sayaci + 1

----
print(string*sayi) kullanmadan çözüm:
    
sayi = int(input("Sayi girin: "))

for eleman in range(1, sayi + 1):
    ifade = ""
    for i in range(eleman):
        ifade = ifade + str(eleman)
    print(ifade)
