baslangic_sayisi = int(input("Baslangic sayisini girin: "))
bitis_sayisi = int(input("Bitis sayisini girin: "))
toplam = 0
sayac = baslangic_sayisi + 1
while sayac < bitis_sayisi:
    if sayac % 2 == 1:
        toplam = toplam + sayac
    sayac = sayac + 1
print(toplam)
