a = int(input("a sayisini girin: "))
b = int(input("b sayisini girin: "))
sayi = a
while sayi <= b:
    if (sayi ** 0.5) % 2 == 0:
        print(sayi)
    sayi = sayi + 1