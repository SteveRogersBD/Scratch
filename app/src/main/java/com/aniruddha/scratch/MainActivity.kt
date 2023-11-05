import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.aniruddha.scratch.R

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        navController = navHostFragment.navController

        // Find your CardViews here
        val fitDictionaryCard = findViewById<CardView>(R.id.fit_tionary_card)
        val nutriFitCard = findViewById<CardView>(R.id.nutri_fit_card)
        val fitTrackCard = findViewById<CardView>(R.id.fit_track_card)

        // Set an onClick listener for each CardView
        fitDictionaryCard.setOnClickListener {
            // Navigate to a new fragment when this card is clicked
            navController.navigate(R.id.action_mainActivity_to_fitionaryFragment)
        }

        /*nutriFitCard.setOnClickListener {
            // Navigate to another fragment when this card is clicked
            navController.navigate(R.id.act)
        }

        fitTrackCard.setOnClickListener {
            // Navigate to a different fragment when this card is clicked
            navController.navigate(R.id.action_fitTrackFragment)
        }*/
    }
}
