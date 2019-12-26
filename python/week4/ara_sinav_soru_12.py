satir_sayisi = int(input("Sayi girin: "))
satir_sayaci = 1
while satir_sayaci <= satir_sayisi:
    print(satir_sayaci * str(satir_sayaci))
    satir_sayaci = satir_sayaci + 1

----
print(string*sayi) kullanmadan çözüm:
    
sayi = int(input("Sayi girin: "))

for eleman in range(1, sayi + 1):
    birlesik_ifade = ""
    for i in range(eleman):
        birlesik_ifade += str(eleman)
    print(birlesik_ifade)
