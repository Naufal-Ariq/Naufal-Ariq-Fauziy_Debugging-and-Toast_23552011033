# ⚒ Project Input Control Pada Android Native

- Mata Kuliah : Pemrograman Mobile 1
- Dosen Pengampu : Nova Agustina, ST., M.Kom.

---

# 👱🏻‍♂ Profile 

- Nama : Naufal Ariq Fauziy
- Nim  : 23552011033
- Kelas: TIF-223PC-CNS-C

---

## Debugging dan Toast 

-Penggunaan Log
Pernyataan Log digunakan di seluruh aplikasi untuk memantau keadaan dan aksi internal untuk debugging dan pelacakan.
-Penggunaan Toast
Pesan Toast digunakan untuk memberi umpan balik kepada pengguna mengenai aksi tertentu atau memberikan pemberitahuan tentang input mereka.

## Source code dan Screenshoot

    btnPickDate.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            DatePickerDialog(this, { _, y, m, d ->
                selectedDate = "$d/${m + 1}/$y"
                tvDate.text = "Tanggal dipilih: $selectedDate"
                Toast.makeText(this, "Tanggal dipilih: $selectedDate", Toast.LENGTH_SHORT).show()
                Log.v("MainActivity", "Tanggal dipilih: $selectedDate")
            }, year, month, day).show()
        }

    ![Image](https://github.com/user-attachments/assets/556bf5f0-1fee-4c64-908d-dda9afcc5dc9)


## 🖼️ Tampilan Aplikasi

| Input & Tombol                        | Alert Dialog                           | Date Picker                         |
|--------------------------------------|----------------------------------------|-------------------------------------|
| ![form](https://github.com/user-attachments/assets/f097a7e2-6069-4ed7-9038-3379dd6e9671)        | ![alert](https://github.com/user-attachments/assets/edf938bf-b7da-426a-b948-382a068a71b9)        | ![datepicker](https://github.com/user-attachments/assets/8d1f9fdb-3f8d-46b6-a0a9-178e5ef6a962) |

| Tampilan Aplikasi Bookingku          |
|--------------------------------------|
| ![Aplikasi](https://github.com/user-attachments/assets/b25ed5d7-7265-406d-abee-abbdf03e091f)                        |



---




