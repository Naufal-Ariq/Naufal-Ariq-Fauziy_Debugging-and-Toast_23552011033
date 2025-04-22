package com.example.tugaspertemuan5

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var etPhone: EditText
    private lateinit var tvDate: TextView
    private lateinit var btnPickDate: Button
    private lateinit var btnBooking: Button

    private var selectedDate: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPhone = findViewById(R.id.etPhone)
        tvDate = findViewById(R.id.tvDate)
        btnPickDate = findViewById(R.id.btnPickDate)
        btnBooking = findViewById(R.id.btnBooking)

        btnPickDate.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            DatePickerDialog(this, { _, y, m, d ->
                selectedDate = "$d/${m + 1}/$y"
                tvDate.text = "Tanggal dipilih: $selectedDate"
            }, year, month, day).show()
        }

        btnBooking.setOnClickListener {
            val phone = etPhone.text.toString()

            if (phone.isEmpty()) {
                Toast.makeText(this, "Masukkan nomor telepon dulu!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (selectedDate.isEmpty()) {
                Toast.makeText(this, "Pilih tanggal dulu!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            AlertDialog.Builder(this)
                .setTitle("Konfirmasi Booking")
                .setMessage("Booking layanan pada $selectedDate untuk nomor $phone?")
                .setPositiveButton("Ya") { _, _ ->
                    Toast.makeText(
                        this,
                        "Booking berhasil! Kami akan menghubungi $phone pada $selectedDate",
                        Toast.LENGTH_LONG
                    ).show()
                }
                .setNegativeButton("Batal", null)
                .show()
        }
    }
}
