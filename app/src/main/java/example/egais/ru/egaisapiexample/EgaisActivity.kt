package example.egais.ru.egaisapiexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import ru.evotor.egais.api.provider.EgaisApi

class EgaisActivity : AppCompatActivity() {

    private val egaisButton: TextView by lazy { findViewById<TextView>(R.id.get_egais) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_egais)
        egaisButton.setOnClickListener {
            val orgInfos = EgaisApi.getOrgInfos(baseContext)
            val productInfos = EgaisApi.getProductInfos(baseContext)
            Toast.makeText(baseContext,"ORG_INFO size: " + orgInfos?.count + "\n"
                    + "PRODUCT_INFO size: " + productInfos?.count , Toast.LENGTH_LONG).show()
        }
    }
}
