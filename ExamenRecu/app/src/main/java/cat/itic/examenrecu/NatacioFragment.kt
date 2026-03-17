package cat.itic.examenrecu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NatacioFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NatacioAdapter
    private val profileItems = List(20) { "Perfil Item #${it + 1}" }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_natacio_fragment, container, false)

        recyclerView = view.findViewById(R.id.recyclerProfile)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = NatacioAdapter(profileItems)
        recyclerView.adapter = adapter

        return view
    }

    
}