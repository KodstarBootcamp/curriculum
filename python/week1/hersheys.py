defter_fiyati = float(input('Kirtasiyeciden defter fiyati alalim : '))
kalem_fiyati = 2 * defter_fiyati
eldeki_para = 1000
hersheys = 10
bir_defter_ve_bir_kalemin_toplam_fiyati = defter_fiyati + kalem_fiyati
defter_ve_kalem_sayisi = eldeki_para // bir_defter_ve_bir_kalemin_toplam_fiyati
elde_kalan_para = eldeki_para % bir_defter_ve_bir_kalemin_toplam_fiyati

print(str(defter_ve_kalem_sayisi) + " tane defter ve kalem istiyorum")
print("elde kalan para " + str(elde_kalan_para))
print("""
elde kalan para 10 lira veya uzeriyse hersheys alabilirsin
""")