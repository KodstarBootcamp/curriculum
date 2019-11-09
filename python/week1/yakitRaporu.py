arabanin_markasi = input("arabanin markasi")
gunde_sehirici_mesafe_km = int(input("gunluk sehirici mesafe km olarak : "))
haftalik_sehirlerarasi_mesafe_km = int(input("haftalik sehirlerarasi mesafe km olarak : "))
arabanin_sehirici_yakit_tuketimi_kmde = float(input("arabanin sehirici yakit tuketimi : ")) / 100
arabanin_sehirlerarasi_yakit_tuketimi_kmde = float(input("arabanin sehirlerarasi yakit tuketimi : ")) / 100

aylik_sehirici_mesafe_km = 30 * gunde_sehirici_mesafe_km
aylik_sehirlerarasi_mesafe_km = 4 * haftalik_sehirlerarasi_mesafe_km

toplam_aylik_yakit_tuketimi = aylik_sehirici_mesafe_km * arabanin_sehirici_yakit_tuketimi_kmde

toplam_aylik_yakit_tuketimi = toplam_aylik_yakit_tuketimi + (aylik_sehirlerarasi_mesafe_km * arabanin_sehirlerarasi_yakit_tuketimi_kmde)
print()
print(arabanin_markasi + " 'nin aylik yakit tuketimi" )
print("---------------------------------------")
print("Toplam aylik yakit tuketimi" + str(toplam_aylik_yakit_tuketimi))
print("-------------------------------------------------------")
