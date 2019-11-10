yas = int(input("Bilet aldığınız kişi kaç yaşında?"))

if yas < 10:
    if yas <= 3:
        print('Hiç bir filme giremez.')
    else:
        print('Sadece çizgi filmlere girebilir.')
else:
    if yas < 14:
        print('Yanında büyük varken her filme girebilir,….')
    else:
       print('Her filme girebilir.')