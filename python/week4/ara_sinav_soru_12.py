satir_sayisi = int(input("Sayi girin: "))
satir_sayaci = 1
while satir_sayaci <= satir_sayisi:
    print(satir_sayaci * str(satir_sayaci))
    satir_sayaci = satir_sayaci + 1

----
print(string*sayi) kullanmadan çözüm:
    
sayi = int(input("Sayi girin: "))
satir_sayaci = 1
for i in range(1,sayi):
    birlesik_ifade = ""
    for j in range (1, sayi)
        birlesik_ifade += sayi
    print(birlesik_ifade)
