package id.ac.poilnema.praktikintent

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btnMove)
        btn1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ProfilMahasiswa::class.java)
        })

        val btn2 = findViewById<Button>(R.id.btnMove)
        btn2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ProfilSWU::class.java)
            startActivity(intent)
        })
    }
}