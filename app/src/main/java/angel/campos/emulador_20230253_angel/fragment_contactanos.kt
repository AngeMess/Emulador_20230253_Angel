package angel.campos.emulador_20230253_angel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class fragment_contactanos : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_contactanos, container, false)

        val btnContactanos = root.findViewById<Button>(R.id.btnContactanos)

        btnContactanos.setOnClickListener {
            Toast.makeText(context, "20230253@ricaldone.edu.sv", Toast.LENGTH_SHORT).show()
        }

        return root
    }


}