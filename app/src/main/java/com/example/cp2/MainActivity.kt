import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cp2.FormFragment
import com.example.cp2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Carregar o FormFragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FormFragment())
            .commit()
    }
}