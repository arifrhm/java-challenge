

Kompleksitas isBalanced

Untuk kompleksitas waktu dan ruang dari implementasi `isBalanced`:

1. **Kompleksitas Waktu**:
   - Iterasi melalui setiap karakter dalam string input: O(n), di mana n adalah panjang string input.
   - Setiap karakter akan diproses secara individu dalam loop.
   - Operasi lain dalam loop (seperti penambahan atau pengurangan elemen pada stack) adalah operasi konstan.
   - Jadi, kompleksitas waktu total adalah O(n).

2. **Kompleksitas Ruang**:
   - Kami menggunakan struktur data stack untuk menyimpan karakter pembukaan yang belum dipasangkan.
   - Jumlah elemen yang disimpan dalam stack akan bergantung pada jumlah karakter pembukaan yang ada dalam string input, yang pada kasus terburuk akan sama dengan panjang string input n.
   - Jadi, kompleksitas ruangnya adalah O(n), di mana n adalah panjang string input.

Jadi, untuk implementasi ini:
- Kompleksitas waktu adalah O(n), di mana n adalah panjang string input.
- Kompleksitas ruang adalah O(n), di mana n adalah panjang string input.

Implementasi ini memberikan solusi yang efisien untuk masalah pengecekan keselarasan tanda kurung, karena kompleksitasnya optimal sesuai dengan ukuran input yang diberikan.